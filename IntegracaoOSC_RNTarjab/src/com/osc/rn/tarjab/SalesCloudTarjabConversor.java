package com.osc.rn.tarjab;

import java.math.BigDecimal;

import com.osc.ccad.producao.account.Account;
import com.osc.ccad.producao.account.ObjectFactory;
import com.osc.ccad.producao.account.PrimaryAddress;

public class SalesCloudTarjabConversor {

	public static Account toAccount(RNContact contato) {
		Account account = new Account();
		ObjectFactory of = new ObjectFactory();

		if (contato.getPrimeiroNome() != null && !contato.getPrimeiroNome().isEmpty() && contato.getUltimoNome() != null
		    && !contato.getUltimoNome().isEmpty()) {

			// Nome
			account.setOrganizationName(contato.getPrimeiroNome() + " " + contato.getUltimoNome());

			// ID do Contato (RightNow)
			if (contato.getId() != null) {
				BigDecimal bd = new BigDecimal(contato.getId());
				account.setOrganizationDEOIDDoContatoC(of.createAccountOrganizationDEOIDDoContatoC(bd));
			}

			// RG
			if (contato.getRg() != null && !contato.getRg().isEmpty()) {
				account.setOrganizationDEORgC(of.createAccountOrganizationDEORgC(contato.getRg()));
			}

			// CPF
			if (contato.getCpf() != null && !contato.getCpf().isEmpty()) {
				account.setOrganizationDEOCpfC(of.createAccountOrganizationDEOCpfC(contato.getCpf()));
			}

			// Nome da Mãe
			if (contato.getNomeMae() != null && !contato.getNomeMae().isEmpty()) {
				account.setOrganizationDEONomeMaeC(of.createAccountOrganizationDEONomeMaeC(contato.getNomeMae()));
			}

			// Nome do Pai
			if (contato.getNomePai() != null && !contato.getNomePai().isEmpty()) {
				account.setOrganizationDEONomePaiC(of.createAccountOrganizationDEONomePaiC(contato.getNomePai()));
			}

			// E-mail principal
			if (contato.getEmailPrincipal() != null && !contato.getEmailPrincipal().isEmpty()) {
				account.setEmailAddress(contato.getEmailPrincipal());
			}

			// E-mail alternativo 1
			if (contato.getEmailAlternativo1() != null && !contato.getEmailAlternativo1().isEmpty()) {
				account.setOrganizationDEOEmailalternativoC(
				    of.createAccountOrganizationDEOEmailalternativoC(contato.getEmailAlternativo1()));
			}

			// E-mail alternativo 1
			if (contato.getEmailAlternativo2() != null && !contato.getEmailAlternativo2().isEmpty()) {
				account.setOrganizationDEOEmailAlternativo2C(
				    of.createAccountOrganizationDEOEmailAlternativo2C(contato.getEmailAlternativo2()));
			}

			// Telefone Comercial
			if (contato.getTelefoneComercial() != null && !contato.getTelefoneComercial().isEmpty()) {
				account.setOrganizationDEONumComC(of.createAccountOrganizationDEONumComC(contato.getTelefoneComercial()));
			}

			// Celular
			if (contato.getCelular() != null && !contato.getCelular().isEmpty()) {
				account.setOrganizationDEOCelularC(of.createAccountOrganizationDEOCelularC(contato.getCelular()));
			}

			// Fax
			if (contato.getFax() != null && !contato.getFax().isEmpty()) {
				account.setOrganizationDEOFaxC(of.createAccountOrganizationDEOFaxC(contato.getFax()));
			}

			// Telefone do Assistente
			if (contato.getTelefoneAssistente() != null && !contato.getTelefoneAssistente().isEmpty()) {
				account.setOrganizationDEOTelefoneDoAssistenteC(
				    of.createAccountOrganizationDEOTelefoneDoAssistenteC(contato.getTelefoneAssistente()));
			}

			// Telefone Residencial
			if (contato.getTelefoneResidencial() != null && !contato.getTelefoneResidencial().isEmpty()) {
				account.setOrganizationDEONumResC(of.createAccountOrganizationDEONumResC(contato.getTelefoneResidencial()));
			}

			Endereco endereco = null;

			// Endereço
			account.setPrimaryAddress(new PrimaryAddress());
			
			if (contato.getEndereco() != null && !contato.getEndereco().isEmpty()) {
				endereco = converterStringParaEndereco(contato.getEndereco());
			}

			if (endereco != null) {

				// Rua
				String rua = null;

				if (endereco.getRua() != null && !endereco.getRua().isEmpty()) {
					rua = endereco.getRua();

					if (endereco.getNumero() != null && !endereco.getNumero().isEmpty()) {
						rua = rua + ", " + endereco.getNumero();
					}

				}

				if (rua != null && !rua.isEmpty()) {
					account.getPrimaryAddress().setAddressLine1(of.createPrimaryAddressAddressLine1(rua));
				}

				// Complemento
				if (endereco.getComplemento() != null && !endereco.getComplemento().isEmpty()) {
					account.getPrimaryAddress().setAddressLine2(of.createPrimaryAddressAddressLine2(endereco.getComplemento()));
				}

				// Bairro
				if (endereco.getBairro() != null && !endereco.getBairro().isEmpty()) {
					account.getPrimaryAddress().setAddressLine3(of.createPrimaryAddressAddressLine3(endereco.getBairro()));
				}

			}

			// Cidade
			if (contato.getCidade() != null && !contato.getCidade().isEmpty()) {
				account.getPrimaryAddress().setCity(of.createPrimaryAddressCity(contato.getCidade()));
			}

			// Estado
			if (contato.getIdEstado() != null && !contato.getIdEstado().isEmpty()) {
				account.getPrimaryAddress()
				    .setState(of.createPrimaryAddressState(StateOrProvinceMap.getMap().get(contato.getIdEstado())));
			}

			// País
			account.getPrimaryAddress().setCountry("BR");

			// CEP
			if (contato.getCep() != null && !contato.getCep().isEmpty()) {
				account.getPrimaryAddress().setPostalCode(of.createPrimaryAddressPostalCode(contato.getCep()));
			}

			// integrar com RightNow
			account.setOrganizationDEOIntegradoComRightNowC(false);

			return account;
		}

		else {
			return null;
		}

	}

	private static Endereco converterStringParaEndereco(String enderecoString) {
		Endereco endereco = new Endereco();

		if (enderecoString != null && !enderecoString.isEmpty()) {
			enderecoString = enderecoString.replaceAll("^(.+?), (\\d+) (.+?)\\r?\\n(.+?)$", "$1;$2;$3;$4");
			String[] ends = null;

			if (enderecoString != null && !enderecoString.isEmpty()) {
				ends = enderecoString.split(";", -1);
			}

			if (ends != null && ends.length > 0) {
				endereco.setRua(ends[0]);

				if (ends.length > 1) {
					endereco.setNumero(ends[1]);

					if (ends.length > 2) {
						endereco.setComplemento(ends[2]);

						if (ends.length > 3) {
							endereco.setBairro(ends[3]);
						}

					}

				}

			}

			return endereco;
		}

		return null;
	}

}