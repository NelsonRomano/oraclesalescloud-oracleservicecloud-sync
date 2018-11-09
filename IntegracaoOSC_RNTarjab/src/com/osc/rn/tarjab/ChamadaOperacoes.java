package com.osc.rn.tarjab;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.osc.ccad.client.AccountClientProducao;
import com.osc.ccad.producao.account.Account;
import com.osc.ccad.producao.account.MethodResult;
import com.rn.tarjab.client.RightNowTarjabClient;
import com.rn.tarjab.producao.typed.Contact;
import com.rn.tarjab.producao.typed.GenericField;
import com.rn.tarjab.producao.typed.RequestErrorFault;
import com.rn.tarjab.producao.typed.RequestErrorFaultDetail;
import com.rn.tarjab.producao.typed.ServerErrorFault;
import com.rn.tarjab.producao.typed.UnexpectedErrorFault;

public class ChamadaOperacoes {

	public static void atualizarContato(Contact contato) {
		RightNowTarjabClient rightNowTarjabProxy = new RightNowTarjabClient("usuario", "senha");
		Logger logger = null;
		String idOSC = "";
		String mensagem = "";

		try {
			logger = new Logger();
		}

		catch (IOException e) {
			System.out.println(
			    "Houve um erro ao gerar arquivos de Log. Os relatórios desta operação não poderão ser criados nem exibidos.\n    Motivo: "
			        + e.getMessage());
		}

		if (contato.getCustomFields() != null && contato.getCustomFields().getGenericFields() != null) {

			for (GenericField gf : contato.getCustomFields().getGenericFields()) {

				if (gf.getDataValue() != null && gf.getDataValue().getObjectValue() != null
				    && gf.getDataValue().getObjectValue().getGenericFields().get(0) != null
				    && gf.getDataValue().getObjectValue().getGenericFields().get(0).getName() != null) {

					if (gf.getDataValue().getObjectValue().getGenericFields().get(0).getDataValue() != null
					    && gf.getDataValue().getObjectValue().getGenericFields().get(0).getName().equals("account_party_id")) {
						idOSC = gf.getDataValue().getObjectValue().getGenericFields().get(0).getDataValue().getIntegerValue()
						    .toString();
					}

				}

			}

		}

		try {
			rightNowTarjabProxy.atualizarContato(contato);

			if (logger != null) {
				mensagem = "Contato atualizado com sucesso no Oracle RightNow (ID no RightNow: " + contato.getID().getId()
				    + ", PartyID no Oracle SalesCloud: " + idOSC + ")";
				logger.infoArquivo(new Date(), mensagem);
				logger.infoConsole(new Date(), mensagem);
			}

		}

		catch (RequestErrorFault e) {

			if (logger != null) {
				mensagem = "Não foi possível atualizar Contato no Oracle RightNow (ID no RightNow: " + contato.getID().getId()
				    + ", PartyID: " + idOSC + ")\n    Motivo: " + e.getMessage();
				logger.erroArquivo(new Date(), mensagem, e);
				logger.erroConsole(new Date(), mensagem, e);
			}

		}

		catch (RequestErrorFaultDetail e) {

			if (logger != null) {
				mensagem = "Não foi possível atualizar Contato no Oracle RightNow (ID no RightNow: " + contato.getID().getId()
				    + ", PartyID: " + idOSC + ")\n    Motivo: " + e.getMessage();
				logger.erroArquivo(new Date(), mensagem, e);
				logger.erroConsole(new Date(), mensagem, e);
			}

		}

		catch (ServerErrorFault e) {

			if (logger != null) {
				mensagem = "Não foi possível atualizar Contato no Oracle RightNow (ID no RightNow: " + contato.getID().getId()
				    + ", PartyID: " + idOSC + ")\n    Motivo: " + e.getMessage();
				logger.erroArquivo(new Date(), mensagem, e);
				logger.erroConsole(new Date(), mensagem, e);
			}

		}

		catch (UnexpectedErrorFault e) {

			if (logger != null) {
				mensagem = "Não foi possível atualizar Contato no Oracle RightNow (ID no RightNow: " + contato.getID().getId()
				    + ", PartyID: " + idOSC + ")\n    Motivo: " + e.getMessage();
				logger.erroArquivo(new Date(), mensagem, e);
				logger.erroConsole(new Date(), mensagem, e);
			}

		}

	}

	public static long buscarIdDaContaPeloCpfCnpj(String cpfCnpj) {
		AccountClientProducao accountClientProducao = new AccountClientProducao("usuario", "senha");

		try {
			return accountClientProducao.buscarIdDaContaPeloCpfCnpj(cpfCnpj);
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return -1L;
	}

	public static long buscarIdDoContatoPeloCpfCnpj(String cpfCnpj) {
		RightNowTarjabClient rightNowTarjabProxy = new RightNowTarjabClient("usuario", "senha");

		try {
			return rightNowTarjabProxy.buscarIdDoContatoPorCpfCnpj(cpfCnpj);
		}

		catch (RemoteException e) {
			e.printStackTrace();
		}

		catch (RequestErrorFault e) {
			e.printStackTrace();
		}

		catch (UnexpectedErrorFault e) {
			e.printStackTrace();
		}

		catch (ServerErrorFault e) {
			e.printStackTrace();
		}

		return -1L;
	}

	public static Account criarConta(Account conta) {
		AccountClientProducao accountClientProducao = new AccountClientProducao("usuario", "senha");
		Logger logger = null;
		String mensagem = "";

		try {
			logger = new Logger();
		}

		catch (IOException e) {
			System.out.println(
			    "Houve um erro ao gerar arquivos de Log. Os relat�rios desta operação não poderão ser criados nem exibidos.\n    Motivo: "
			        + e.getMessage());
		}

		try {

			if (logger != null) {
				Account returnAccount = accountClientProducao.createAccount(conta);
				mensagem = "Conta criada com sucesso no Oracle SalesCloud. (PartyID no Oracle SalesCloud: "
				    + returnAccount.getPartyId() + ", ID no Oracle RightNow: "
				    + conta.getOrganizationDEOIDDoContatoC().getValue().longValue() + ")";
				logger.infoArquivo(new Date(), mensagem);
				logger.infoConsole(new Date(), mensagem);
				return returnAccount;
			}

		}

		catch (Exception e) {

			if (logger != null) {
				mensagem = "Não foi possível criar Conta no Oracle SalesCloud. (PartyID no Oracle RightNow: "
				    + conta.getOrganizationDEOIDDoContatoC().getValue().longValue() + ")\n    Motivo: " + e.getMessage();
				logger.erroArquivo(new Date(), mensagem);
				logger.erroConsole(new Date(), mensagem);
			}

		}

		return null;
	}

	public static void criarContato(Contact contato) {
		RightNowTarjabClient rightNowTarjabProxy = new RightNowTarjabClient("usuario", "senha");
		Logger logger = null;
		String mensagem = "";

		try {
			logger = new Logger();
		}

		catch (IOException e) {
			System.out.println(
			    "Houve um erro ao gerar arquivos de Log. Os relatórios desta operação não poderão ser criados nem exibidos.\n    Motivo: "
			        + e.getMessage());
		}

		String idOSC = "";

		if (contato.getCustomFields() != null && contato.getCustomFields().getGenericFields() != null) {

			for (GenericField gf : contato.getCustomFields().getGenericFields()) {

				if (gf.getDataValue() != null && gf.getDataValue().getObjectValue() != null
				    && gf.getDataValue().getObjectValue().getGenericFields() != null
				    && gf.getDataValue().getObjectValue().getGenericFields().get(0) != null
				    && gf.getDataValue().getObjectValue().getGenericFields().get(0).getName() != null) {

					if (gf.getDataValue().getObjectValue().getGenericFields().get(0).getName().equals("account_party_id")) {
						idOSC = gf.getDataValue().getObjectValue().getGenericFields().get(0).getDataValue().getIntegerValue()
						    .toString();
					}

				}

			}

		}

		try {
			Contact result = rightNowTarjabProxy.criarContato(contato);

			if (logger != null) {
				mensagem = "Contato criado com sucesso no Oracle RightNow. (ID no RightNow: " + result.getID().getId()
				    + ", PartyID no Oracle SalesCloud: " + idOSC + ")";
				logger.infoArquivo(new Date(), mensagem);
				logger.infoConsole(new Date(), mensagem);
			}

		}

		catch (RequestErrorFault e) {

			if (logger != null) {
				mensagem = "Não foi possível criar Contato no Oracle RightNow. (PartyID no Oracle SalesCloud: " + idOSC
				    + ")\n    Motivo: " + e.getMessage();
				logger.erroArquivo(new Date(), mensagem);
				logger.erroConsole(new Date(), mensagem);
			}

		}

		catch (RequestErrorFaultDetail e) {

			if (logger != null) {
				mensagem = "Não foi possível criar Contato no Oracle RightNow. (PartyID no Oracle SalesCloud: " + idOSC
				    + ")\n    Motivo: " + e.getMessage();
				logger.erroArquivo(new Date(), mensagem);
				logger.erroConsole(new Date(), mensagem);
			}

		}

		catch (ServerErrorFault e) {

			if (logger != null) {
				mensagem = "Não foi possível criar Contato no Oracle RightNow. (PartyID no Oracle SalesCloud: " + idOSC
				    + ")\n    Motivo: " + e.getMessage();
				logger.erroArquivo(new Date(), mensagem);
				logger.erroConsole(new Date(), mensagem);
			}

		}

		catch (UnexpectedErrorFault e) {

			if (logger != null) {
				mensagem = "Não foi possível criar Contato no Oracle RightNow. (PartyID no Oracle SalesCloud: " + idOSC
				    + ")\n    Motivo: " + e.getMessage();
				logger.erroArquivo(new Date(), mensagem);
				logger.erroConsole(new Date(), mensagem);
			}

		}

	}

	public static void deletarContato(long id) {
		RightNowTarjabClient rightNowTarjabProxy = new RightNowTarjabClient("usuario", "senha");
		Logger logger = null;

		try {
			logger = new Logger();
		}

		catch (IOException e) {
			System.out.println(
			    "Houve um erro ao gerar arquivos de Log. Os relat�rios desta operação não poderão ser criados nem exibidos.\n    Motivo: "
			        + e.getMessage());
		}

		String mensagem = "";

		try {
			rightNowTarjabProxy.deletarContato(id);

			if (logger != null) {
				mensagem = "Não foi possível deletar Contato do Oracle RightNow (ID no RightNow: " + id + ")";
				logger.infoArquivo(new Date(), mensagem);
				logger.infoConsole(new Date(), mensagem);
			}

		}

		catch (RequestErrorFault e) {

			if (logger != null) {
				mensagem = "Não foi possível deletar Contato do Oracle RightNow (ID no RightNow: " + id + ")\n    Motivo: "
				    + e.getMessage();
				logger.erroArquivo(new Date(), mensagem, e);
				logger.erroConsole(new Date(), mensagem, e);
			}

		}

		catch (RequestErrorFaultDetail e) {

			if (logger != null) {
				mensagem = "Não foi possível deletar Contato do Oracle RightNow (ID no RightNow: " + id + ")\n    Motivo: "
				    + e.getMessage();
				logger.erroArquivo(new Date(), mensagem, e);
				logger.erroConsole(new Date(), mensagem, e);
			}

		}

		catch (ServerErrorFault e) {

			if (logger != null) {
				mensagem = "Não foi possível deletar Contato do Oracle RightNow (ID no RightNow: " + id + ")\n    Motivo: "
				    + e.getMessage();
				logger.erroArquivo(new Date(), mensagem, e);
				logger.erroConsole(new Date(), mensagem, e);
			}

		}

		catch (UnexpectedErrorFault e) {

			if (logger != null) {
				mensagem = "Não foi possível deletar Contato do Oracle RightNow (ID no RightNow: " + id + ")\n    Motivo: "
				    + e.getMessage();
				logger.erroArquivo(new Date(), mensagem, e);
				logger.erroConsole(new Date(), mensagem, e);
			}

		}

	}

	public static Account atualizarConta(Account conta) {
		AccountClientProducao accountClientProducao = new AccountClientProducao("usuario", "senha");
		Logger logger = null;
		String mensagem = "";

		try {
			logger = new Logger();
		}

		catch (IOException e) {
			System.out.println(
			    "Houve um erro ao gerar arquivos de Log. Os relatórios desta operação não poderão ser criados nem exibidos.\n    Motivo: "
			        + e.getMessage());
		}

		try {
			Account result = accountClientProducao.updateAccount(conta);

			if (logger != null) {
				mensagem = "Conta atualizada com sucesso no Oracle SalesCloud (PartyID no Oracle SalesCloud: "
				    + conta.getPartyId() + ", ID no Oracle RightNow: "
				    + conta.getOrganizationDEOIDDoContatoC().getValue().longValueExact() + ")";
				logger.infoArquivo(new Date(), mensagem);
				logger.infoConsole(new Date(), mensagem);
			}

			return result;
		}

		catch (Exception e) {

			if (logger != null) {
				mensagem = "Não foi possível atualizar Conta no Oracle SalesCloud (PartyID no Oracle SalesCloud: "
				    + conta.getPartyId() + ", ID no Oracle RightNow: " + conta.getOrganizationDEOIDDoContatoC().getValue()
				    + ")\n    Motivo: " + e.getMessage();
				logger.erroArquivo(new Date(), mensagem);
				logger.erroConsole(new Date(), mensagem);
			}

		}

		return null;
	}

	public static Account getAccount(long id) {
		AccountClientProducao accountClientProducao = new AccountClientProducao("usuario", "senha");

		try {
			Account conta = accountClientProducao.getAccount(300000008713085L);
			return conta;
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static MethodResult deletarConta(Account conta) {
		AccountClientProducao accountClientProducao = new AccountClientProducao("usuario", "senha");
		Logger logger = null;
		String mensagem = "";

		try {
			logger = new Logger();
		}

		catch (IOException e) {
			System.out.println(
			    "Houve um erro ao gerar arquivos de Log. Os relatórios desta operação não poderão ser criados nem exibidos.\n    Motivo: "
			        + e.getMessage());
		}

		try {
			MethodResult result = accountClientProducao.deleteAccount(conta);
			mensagem = "Conta deletada do Oracle SalesCloud com sucesso. (PartyID no Oracle SalesCloud: " + conta.getPartyId()
			    + ")";
			logger.infoArquivo(new Date(), mensagem);
			logger.infoConsole(new Date(), mensagem);
			return result;
		}

		catch (Exception e) {

			if (logger != null) {
				mensagem = "Não foi possível deletar Conta no Oracle SalesCloud (PartyID no Oracle SalesCloud: "
				    + conta.getPartyId() + ")\n    Motivo: " + e.getMessage();
				logger.erroArquivo(new Date(), mensagem);
				logger.erroConsole(new Date(), mensagem);
			}

		}

		return null;
	}

	public static List<Account> obterListaDeCustomers() {
		AccountClientProducao accountClientProducao = new AccountClientProducao("usuario", "senha");
		int fetchStart = 0;

		try {
			List<Account> quinhentosCustomers = new ArrayList<Account>();
			List<Account> customers = new ArrayList<Account>();

			while ((quinhentosCustomers = accountClientProducao.buscarCustomers(fetchStart)).size() != 0) {
				customers.addAll(quinhentosCustomers);
				fetchStart += 500;
			}

			return customers;
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static Account desativarCliente(Account conta) {
		AccountClientProducao accountClientProducao = new AccountClientProducao("usuario", "senha");
		Logger logger = null;
		String mensagem = "";

		try {
			logger = new Logger();
		}

		catch (IOException e) {
			System.out.println(
			    "Houve um erro ao gerar arquivos de Log. Os relatórios desta operação não poderão ser criados nem exibidos.\n    Motivo: "
			        + e.getMessage());
		}

		try {
			Account result = accountClientProducao.updateAccount(conta);

			if (logger != null) {
				mensagem = "Conta desativada com sucesso no Oracle SalesCloud (PartyID no Oracle SalesCloud: "
				    + conta.getPartyId() + ")";
				logger.infoArquivo(new Date(), mensagem);
				logger.infoConsole(new Date(), mensagem);
			}

			return result;
		}

		catch (Exception e) {

			if (logger != null) {
				mensagem = "Não foi possível desativar Conta no Oracle SalesCloud (PartyID no Oracle SalesCloud: "
				    + conta.getPartyId() + ")\n    Motivo: " + e.getMessage();
				logger.erroArquivo(new Date(), mensagem);
				logger.erroConsole(new Date(), mensagem);
			}

		}

		return null;
	}

}