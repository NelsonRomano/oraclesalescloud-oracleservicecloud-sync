package com.rn.tarjab.client;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import com.rn.tarjab.producao.typed.ActionEnum;
import com.rn.tarjab.producao.typed.ClientInfoHeader;
import com.rn.tarjab.producao.typed.Contact;
import com.rn.tarjab.producao.typed.CreateProcessingOptions;
import com.rn.tarjab.producao.typed.DestroyProcessingOptions;
import com.rn.tarjab.producao.typed.Email;
import com.rn.tarjab.producao.typed.ID;
import com.rn.tarjab.producao.typed.ObjectFactory;
import com.rn.tarjab.producao.typed.Phone;
import com.rn.tarjab.producao.typed.QueryResultData;
import com.rn.tarjab.producao.typed.RNObject;
import com.rn.tarjab.producao.typed.RNObjectsResult;
import com.rn.tarjab.producao.typed.RequestErrorFault;
import com.rn.tarjab.producao.typed.RequestErrorFaultDetail;
import com.rn.tarjab.producao.typed.RightNowFedAuthSyncPort;
import com.rn.tarjab.producao.typed.RightNowSyncService;
import com.rn.tarjab.producao.typed.ServerErrorFault;
import com.rn.tarjab.producao.typed.UnexpectedErrorFault;
import com.rn.tarjab.producao.typed.UpdateProcessingOptions;

public class RightNowTarjabClient {
	private static RightNowSyncService rightNowSyncService = new RightNowSyncService();
	private RightNowFedAuthSyncPort rightNowFedAuthSyncPort;
	protected static ObjectFactory of = new ObjectFactory();

	public RightNowTarjabClient(String usuario, String senha) {
		this.rightNowFedAuthSyncPort = rightNowSyncService.getRightNowFedAuthSyncPort();
		final Binding binding = ((BindingProvider) rightNowFedAuthSyncPort).getBinding();
		@SuppressWarnings("rawtypes")
		List<Handler> handlerList = binding.getHandlerChain();
		handlerList.add(new SecurityHandler(usuario, senha));
		binding.setHandlerChain(handlerList);
	}

	public Contact criarContato(Contact contato)
	    throws RequestErrorFault, RequestErrorFaultDetail, ServerErrorFault, UnexpectedErrorFault {
		List<RNObject> rnObjects = new ArrayList<RNObject>();
		rnObjects.add(contato);
		CreateProcessingOptions createProcessingOptions = new CreateProcessingOptions();
		createProcessingOptions.setSuppressExternalEvents(false);
		createProcessingOptions.setSuppressRules(false);
		ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
		clientInfoHeader.setAppID("Generic Create");

		if (contato.getEmails() != null && contato.getEmails().getValue() != null
		    && contato.getEmails().getValue().getEmailList() != null) {

			for (Email email : contato.getEmails().getValue().getEmailList()) {
				email.setAction(ActionEnum.ADD);
			}

		}

		if (contato.getPhones() != null && contato.getPhones().getValue() != null
		    && contato.getPhones().getValue().getPhoneList() != null) {

			for (Phone phone : contato.getPhones().getValue().getPhoneList()) {
				phone.setAction(ActionEnum.ADD);
			}

		}

		RNObjectsResult createRes = rightNowFedAuthSyncPort.create(rnObjects, createProcessingOptions, clientInfoHeader);
		return (Contact) createRes.getRNObjects().get(0);
	}

	public void atualizarContato(Contact contato)
	    throws RequestErrorFault, RequestErrorFaultDetail, ServerErrorFault, UnexpectedErrorFault {
		ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
		clientInfoHeader.setAppID("Basic Update");
		UpdateProcessingOptions updateProcessingOptions = new UpdateProcessingOptions();
		updateProcessingOptions.setSuppressExternalEvents(false);
		updateProcessingOptions.setSuppressRules(false);

		if (contato.getEmails() != null && contato.getEmails().getValue() != null
		    && contato.getEmails().getValue().getEmailList() != null) {

			for (Email email : contato.getEmails().getValue().getEmailList()) {
				email.setAction(ActionEnum.UPDATE);
			}

		}

		if (contato.getPhones() != null && contato.getPhones().getValue() != null
		    && contato.getPhones().getValue().getPhoneList() != null) {

			for (Phone phone : contato.getPhones().getValue().getPhoneList()) {
				phone.setAction(ActionEnum.UPDATE);
			}

		}

		List<RNObject> rnObjects = new ArrayList<RNObject>();
		rnObjects.add(contato);
		rightNowFedAuthSyncPort.update(rnObjects, updateProcessingOptions, clientInfoHeader);
	}

	private List<RNObject> realizarQueryObjects(String query)
	    throws RemoteException, RequestErrorFault, UnexpectedErrorFault, ServerErrorFault {
		ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
		clientInfoHeader.setAppID("Basic Query Object");
		List<QueryResultData> queryResultData = rightNowFedAuthSyncPort.queryObjects(query, new ArrayList<RNObject>(), -1,
		    clientInfoHeader);
		List<RNObject> rnObject;

		if (queryResultData != null && queryResultData.get(0) != null && queryResultData.get(0).getRNObjectsResult() != null
		    && queryResultData.get(0).getRNObjectsResult().getRNObjects() != null) {
			rnObject = queryResultData.get(0).getRNObjectsResult().getRNObjects();
			return rnObject;
		}

		return null;
	}

	public long buscarIdDoContatoPorCpfCnpj(String CpfCnpj)
	    throws RemoteException, RequestErrorFault, UnexpectedErrorFault, ServerErrorFault {
		List<RNObject> rnObjects = new ArrayList<RNObject>();

		if (CpfCnpj != null && CpfCnpj.length() <= 11) {
			rnObjects = realizarQueryObjects("SELECT Contact FROM Contact WHERE CustomFields.c.cpf LIKE '" + CpfCnpj + "';");
		}

		else if (CpfCnpj != null && CpfCnpj.length() > 11) {
			rnObjects = realizarQueryObjects("SELECT Contact FROM Contact WHERE CustomFields.c.cnpj LIKE '" + CpfCnpj + "';");
		}

		if (rnObjects != null && rnObjects.size() > 0 && rnObjects.get(0) != null && rnObjects.get(0).getID() != null) {
			return rnObjects.get(0).getID().getId();
		}

		else {
			return -1L;
		}

	}

	public void deletarContato(long id)
	    throws RequestErrorFault, RequestErrorFaultDetail, ServerErrorFault, UnexpectedErrorFault {
		Contact contato = new Contact();
		ID idContato = new ID();
		idContato.setId(id);
		contato.setID(idContato);
		List<RNObject> rnObjects = new ArrayList<RNObject>();
		rnObjects.add(contato);
		DestroyProcessingOptions destroyProcessingOptions = new DestroyProcessingOptions();
		destroyProcessingOptions.setSuppressExternalEvents(false);
		destroyProcessingOptions.setSuppressRules(false);
		ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
		clientInfoHeader.setAppID("Basic Delete");
		rightNowFedAuthSyncPort.destroy(rnObjects, destroyProcessingOptions, clientInfoHeader);
	}

}