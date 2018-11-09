package com.osc.rn.tarjab;

import java.util.List;

import com.osc.ccad.producao.account.Account;
import com.rn.tarjab.producao.typed.Contact;
import com.rn.tarjab.producao.typed.ID;

public class SalesCloudRightNowIntegrador {

	private static String getCpfCnpj(Account account) {
		
		if (account != null && account.getOrganizationDEOCpfC() != null
		    && account.getOrganizationDEOCpfC().getValue() != null
		    && !account.getOrganizationDEOCpfC().getValue().isEmpty()) {
			return account.getOrganizationDEOCpfC().getValue();
		}

		else if (account != null && account.getOrganizationDEOCnpjC() != null
		    && account.getOrganizationDEOCnpjC().getValue() != null
		    && !account.getOrganizationDEOCnpjC().getValue().isEmpty()) {
			return account.getOrganizationDEOCnpjC().getValue();
		}

		return null;
	}
	
	public static void integrarOSC2RN() {
		List<Account> customers = ChamadaOperacoes.obterListaDeCustomers();
		for (Account customer : customers) {
			long id;
			Contact contato = RightNowTarjabConversor.toContact(customer);

			System.out.println();

			if ((id = ChamadaOperacoes.buscarIdDoContatoPeloCpfCnpj(getCpfCnpj(customer))) != -1L) {
				ID idContato = new ID();
				idContato.setId(id);
				contato.setID(idContato);
				ChamadaOperacoes.atualizarContato(contato);
			}

			else {
				ChamadaOperacoes.criarContato(contato);
			}

		}

	}

	public static void integrarRN2OSC() {
		List<RNContact> contatosOutros = ContatosOutros.getContatosOutros();
		long id;

		for (RNContact contato : contatosOutros) {
			Account conta = SalesCloudTarjabConversor.toAccount(contato);

			if ((id = ChamadaOperacoes.buscarIdDaContaPeloCpfCnpj(
			    Long.toString(ChamadaOperacoes.obterListaDeCustomers().get(0).getPartyId().longValue()))) != -1L) {
				contato.setId(Long.toString(id));
				ChamadaOperacoes.atualizarConta(conta);
			}

			else {
				ChamadaOperacoes.criarConta(conta);
			}

		}

	}

	public static void main(String[] args) {

		while (true) {
			integrarOSC2RN();
			integrarRN2OSC();

			try {
				Thread.sleep(300000);
			}

			catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}