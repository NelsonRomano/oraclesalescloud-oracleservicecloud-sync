package com.osc.ccad.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.ws.BindingProvider;
import com.osc.ccad.producao.account.Account;
import com.osc.ccad.producao.account.AccountService;
import com.osc.ccad.producao.account.AccountService_Service;
import com.osc.ccad.producao.account.Conjunction;
import com.osc.ccad.producao.account.DataObjectResult;
import com.osc.ccad.producao.account.FindControl;
import com.osc.ccad.producao.account.FindCriteria;
import com.osc.ccad.producao.account.MethodResult;
import com.osc.ccad.producao.account.ObjectFactory;
import com.osc.ccad.producao.account.ProcessControl;
import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;

public class AccountClientProducao {
	private static AccountService_Service accountService_Service = new AccountService_Service();
	private AccountService accountService;
	protected static ObjectFactory of = new ObjectFactory();

	public AccountClientProducao(String usuario, String senha) {
		System.setProperty("javax.xml.transform.TransformerFactory",
				"com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl");
		SecurityPoliciesFeature securityFeatures = new SecurityPoliciesFeature(
				new String[] { "oracle/wss_username_token_over_ssl_client_policy" });
		this.accountService = accountService_Service.getAccountServiceSoapHttpPort(securityFeatures);
		Map<String, Object> reqContext = ((BindingProvider) accountService).getRequestContext();
		reqContext.put(BindingProvider.USERNAME_PROPERTY, usuario);
		reqContext.put(BindingProvider.PASSWORD_PROPERTY, senha);
	}

	public Account createAccount(Account account) throws Exception {
		return (Account) this.accountService.createAccount(account).getValue().get(0);
	}

	public Account updateAccount(Account account) throws Exception {
		return (Account) this.accountService.updateAccount(account).getValue().get(0);
	}

	public Account mergeAccount(Account account) throws Exception {
		return (Account) this.accountService.mergeAccount(account).getValue().get(0);
	}

	private List<Account> findAccount(FindCriteria findCriteria) throws Exception {
		FindControl findControl = of.createFindControl();
		findControl.setRetrieveAllTranslations(false);
		List<Account> returnList = new ArrayList<Account>();
		List<Object> objectList = this.accountService.findAccount(findCriteria, findControl).getValue();
		
		for (Object o : objectList) {			
			returnList.add((Account) o);
		}
		
		return returnList;
	}

	public Account getAccount(Long partyId) throws Exception {
		return (Account) this.accountService.getAccount(partyId).getValue().get(0);
	}

	public MethodResult deleteAccount(Account account) throws Exception {
		return this.accountService.deleteAccount(account);
	}

	public List<Account> processAccount(String changeOperation, List<Account> accounts, ProcessControl processControl)
			throws Exception {
		List<Account> returnList = new ArrayList<Account>();
		DataObjectResult dor = this.accountService.processAccount(changeOperation, accounts, processControl);
		
		if (dor != null) {
			List<Object> objectList = dor.getValue();
			
			for (Object o : objectList) {
				returnList.add((Account) o);
			}
			
		}
		
		return returnList;
	}

	public List<Account> buscarCustomers(int fetchStart) throws Exception {
		FindCriteria fc = new FindCriteria();
		fc.setFetchStart(fetchStart);
		fc.setFetchSize(500);
		
		fc.setFilter(of.createViewCriteria());
		fc.getFilter().getGroup().add(of.createViewCriteriaRow());
		fc.getFilter().getGroup().get(0).getItem().add(of.createViewCriteriaItem());
		fc.getFilter().getGroup().get(0).getItem().get(0).setConjunction(Conjunction.AND);
		fc.getFilter().getGroup().get(0).getItem().get(0).setAttribute("Type");
		fc.getFilter().getGroup().get(0).getItem().get(0).setOperator("=");
		fc.getFilter().getGroup().get(0).getItem().get(0).getValue().add("ZCA_CUSTOMER");
		
		fc.getFilter().getGroup().add(of.createViewCriteriaRow());
		fc.getFilter().getGroup().get(0).getItem().add(of.createViewCriteriaItem());
		fc.getFilter().getGroup().get(0).getItem().get(1).setConjunction(Conjunction.AND);
		fc.getFilter().getGroup().get(0).getItem().get(1).setAttribute("OrganizationDEO_IntegradoComRightNow_c");
		fc.getFilter().getGroup().get(0).getItem().get(1).setOperator("=");
		fc.getFilter().getGroup().get(0).getItem().get(1).getValue().add("true");
		
		fc.setSortOrder(of.createSortOrder());
		fc.getSortOrder().getSortAttribute().add(of.createSortAttribute());
		fc.getSortOrder().getSortAttribute().get(0).setName("PartyId");
		fc.getSortOrder().getSortAttribute().get(0).setDescending(false);

		List<Account> accounts = this.findAccount(fc);
		return accounts;
	}
	
	public long buscarIdDaContaPeloCpfCnpj(String cpfCnpj) throws Exception {
		FindCriteria fc = new FindCriteria();
		fc.setFetchStart(0);
		fc.setFetchSize(1);
		
		fc.setFilter(of.createViewCriteria());
		fc.getFilter().getGroup().add(of.createViewCriteriaRow());
		fc.getFilter().getGroup().get(0).getItem().add(of.createViewCriteriaItem());
		fc.getFilter().getGroup().get(0).getItem().get(0).setConjunction(Conjunction.AND);
		
		if(cpfCnpj.length() <= 11) {
			fc.getFilter().getGroup().get(0).getItem().get(0).setAttribute("OrganizationDEO_cpf_c");
		}
		
		else if(cpfCnpj.length() >= 14) {
			fc.getFilter().getGroup().get(0).getItem().get(0).setAttribute("OrganizationDEO_cnpj_c");
		}		
		
		fc.getFilter().getGroup().get(0).getItem().get(0).setOperator("=");
		fc.getFilter().getGroup().get(0).getItem().get(0).getValue().add(cpfCnpj);
		
		if(this.findAccount(fc) != null && this.findAccount(fc).get(0) != null) {
			return this.findAccount(fc).get(0).getPartyId();
		}
		
		return -1L;
	}
	
	public Account desativarCliente(Account account) throws Exception {
		account.setSalesProfileStatus(of.createAccountSalesProfileStatus("INACTIVE"));
		return updateAccount(account);
	}
	
}