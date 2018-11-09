package com.osc.rn.tarjab;

import java.util.ArrayList;
import java.util.List;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import org.w3c.dom.NodeList;

public class ContatosOutros {

	private static SOAPMessage criarRequisicaoSOAP(String usuario, String senha, String query, int pageSize)
	    throws Exception {
		MessageFactory messageFactory = MessageFactory.newInstance();
		SOAPMessage soapMessage = messageFactory.createMessage();
		SOAPPart soapPart = soapMessage.getSOAPPart();
		String serverURI = "http://schemas.xmlsoap.org/soap/envelope/";

		// Envelope
		SOAPEnvelope envelope = soapPart.getEnvelope();
		envelope.addNamespaceDeclaration("soapenv", serverURI);
		envelope.addNamespaceDeclaration("ns7", "urn:messages.ws.rightnow.com/v1_3");
		envelope.addNamespaceDeclaration("wsse",
		    "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");

		// Header
		SOAPHeader soapHeader = envelope.getHeader();
		SOAPElement soapHeaderFilho1 = soapHeader.addChildElement("ClientInfoHeader", "ns7");
		SOAPElement soapHeaderNeto1 = soapHeaderFilho1.addChildElement("AppID", "ns7");
		soapHeaderNeto1.addTextNode("Basic Query CSV");
		SOAPElement soapHeaderFilho2 = soapHeader.addChildElement("Security", "wsse");
		soapHeaderFilho2.addNamespaceDeclaration("mustUnderstand", "1");
		SOAPElement soapHeaderNeto2 = soapHeaderFilho2.addChildElement("UsernameToken", "wsse");
		SOAPElement soapHeaderBisneto1 = soapHeaderNeto2.addChildElement("Username", "wsse");
		soapHeaderBisneto1.addTextNode(usuario);
		SOAPElement soapHeaderBisneto2 = soapHeaderNeto2.addChildElement("Password", "wsse");
		soapHeaderBisneto2.addNamespaceDeclaration("Type",
		    "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
		soapHeaderBisneto2.addTextNode(senha);

		// Body
		SOAPBody soapBody = envelope.getBody();
		SOAPElement soapBodyFilho = soapBody.addChildElement("QueryCSV", "ns7");
		SOAPElement soapBodyNeto1 = soapBodyFilho.addChildElement("Query", "ns7");
		soapBodyNeto1.addTextNode(query);
		SOAPElement soapBodyNeto2 = soapBodyFilho.addChildElement("PageSize", "ns7");
		soapBodyNeto2.addTextNode(Integer.toString(pageSize));
		SOAPElement soapBodyNeto3 = soapBodyFilho.addChildElement("Delimiter", "ns7");
		soapBodyNeto3.addTextNode(";");
		MimeHeaders headers = soapMessage.getMimeHeaders();
		headers.addHeader("SOAPAction", serverURI + "QueryCSV");
		soapMessage.saveChanges();
		return soapMessage;
	}

	public static List<RNContact> getContatosOutros() {
		String query1 = "SELECT Contact.ID, Contact.Name.First, Contact.Name.Last, CustomFields.c.rg,"
		    + "CustomFields.c.cpf, CustomFields.c.nome_mae, CustomFields.c.nome_pai, Contact.Address.Street,"
		    + "Contact.Address.City, Contact.Address.StateOrProvince.ID, Contact.Address.PostalCode,"
		    + "Contact.Emails.Address, Contact.Phones.Number FROM Contact WHERE Contact.Emails.AddressType = 0 "
		    + "AND Contact.Phones.PhoneType = 0 AND Contact.ContactType.Name LIKE 'Outro';";

		String query2 = "SELECT Contact.Emails.Address, Contact.Phones.Number FROM Contact WHERE Contact.Emails.AddressType = 1 AND Contact.Phones.PhoneType = 1 AND Contact.ContactType.Name LIKE 'Outro';";
		String query3 = "SELECT Contact.Emails.Address, Contact.Phones.Number FROM Contact WHERE Contact.Emails.AddressType = 2 AND Contact.Phones.PhoneType = 2 AND Contact.ContactType.Name LIKE 'Outro';";
		String query4 = "SELECT Contact.Phones.Number FROM Contact WHERE Contact.Phones.PhoneType = 3 AND Contact.ContactType.Name LIKE 'Outro';";
		String query5 = "SELECT Contact.Phones.Number FROM Contact WHERE Contact.Phones.PhoneType = 4 AND Contact.ContactType.Name LIKE 'Outro';";
		
		SOAPMessage sm1 = realizarQueryCSV(query1);
		SOAPMessage sm2 = realizarQueryCSV(query2);
		SOAPMessage sm3 = realizarQueryCSV(query3);
		SOAPMessage sm4 = realizarQueryCSV(query4);
		SOAPMessage sm5 = realizarQueryCSV(query5);

		try {
			NodeList nl1 = null;
			NodeList nl2 = null;
			NodeList nl3 = null;
			NodeList nl4 = null;
			NodeList nl5 = null;
			
			if(sm1 != null && sm1.getSOAPBody() != null	&& sm1.getSOAPBody().getElementsByTagName("n0:Row") != null) {
				nl1 = sm1.getSOAPBody().getElementsByTagName("n0:Row");
			}
			
			if(sm2 != null && sm2.getSOAPBody() != null	&& sm2.getSOAPBody().getElementsByTagName("n0:Row") != null) {
				nl2 = sm2.getSOAPBody().getElementsByTagName("n0:Row");
			}
			
			if(sm3 != null && sm3.getSOAPBody() != null	&& sm3.getSOAPBody().getElementsByTagName("n0:Row") != null) {
				nl3 = sm3.getSOAPBody().getElementsByTagName("n0:Row");
			}
			
			if(sm4 != null && sm4.getSOAPBody() != null	&& sm4.getSOAPBody().getElementsByTagName("n0:Row") != null) {
				nl4 = sm4.getSOAPBody().getElementsByTagName("n0:Row");
			}
			
			if(sm5 != null && sm5.getSOAPBody() != null	&& sm5.getSOAPBody().getElementsByTagName("n0:Row") != null) {
				nl5 = sm5.getSOAPBody().getElementsByTagName("n0:Row");
			}
			
			List<RNContact> contatos = new ArrayList<RNContact>();
			
			for (int i = 0; i < nl1.getLength(); i++) {
				RNContact contato = new RNContact();
				String[] linhas1 = null;
				String[] linhas2 = null;
				String[] linhas3 = null;
				String[] linhas4 = null;
				String[] linhas5 = null;
				
				if(nl1 != null && nl1.item(i) != null && nl1.item(i).getTextContent() != null) {
					linhas1 = nl1.item(i).getTextContent().replaceAll("\"", "").split(";", -1);
				}
				
				if(nl2 != null && nl2.item(i) != null && nl2.item(i).getTextContent() != null) {
					linhas2 = nl2.item(i).getTextContent().replaceAll("\"", "").split(";", -1);
				}
				
				if(nl3 != null && nl3.item(i) != null && nl3.item(i).getTextContent() != null) {
					linhas3 = nl3.item(i).getTextContent().replaceAll("\"", "").split(";", -1);
				}
				
				if(nl4 != null && nl4.item(i) != null && nl4.item(i).getTextContent() != null) {
					linhas4 = nl4.item(i).getTextContent().replaceAll("\"", "").split(";", -1);
				}
				
				if(nl5 != null && nl5.item(i) != null && nl5.item(i).getTextContent() != null) {
					linhas5 = nl5.item(i).getTextContent().replaceAll("\"", "").split(";", -1);
				}
				
				if(linhas1 != null && linhas1.length > 0) {
					contato.setId(linhas1[0]);
					contato.setPrimeiroNome(linhas1[1]);
					contato.setUltimoNome(linhas1[2]);
					contato.setRg(linhas1[3]);
					contato.setCpf(linhas1[4]);
					contato.setNomeMae(linhas1[5]);
					contato.setNomePai(linhas1[6]);
					contato.setEndereco(linhas1[7]);
					contato.setCidade(linhas1[8]);
					contato.setIdEstado(linhas1[9]);
					contato.setCep(linhas1[10]);
					contato.setEmailPrincipal(linhas1[11]);
					contato.setTelefoneComercial(linhas1[12]);
				}

				if(linhas2 != null && linhas2.length > 0) {
					contato.setEmailAlternativo1(linhas2[0]);
					contato.setCelular(linhas2[1]);
				}
				
				if(linhas3 != null && linhas3.length > 0) {
					contato.setEmailAlternativo2(linhas3[0]);
					contato.setFax(linhas3[1]);
				}

				if(linhas4 != null && linhas4.length > 0) {
					contato.setTelefoneAssistente(linhas4[0]);					
				}
				
				if(linhas5 != null && linhas5.length > 0) {
					contato.setTelefoneResidencial(linhas5[0]);
				}
				
				contatos.add(contato);
			}

			return contatos;
		}

		catch (SOAPException e) {
			e.printStackTrace();
		}

		return null;
	}

	private static SOAPMessage realizarQueryCSV(String query) {

		try {
			SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
			SOAPConnection soapConnection = soapConnectionFactory.createConnection();
			String url = "https://tarjab.custhelp.com/cgi-bin/tarjab.cfg/services/soap";
			SOAPMessage soapResponse = soapConnection.call(criarRequisicaoSOAP("usuario", "senha", query, -1), url);
			soapConnection.close();
			return soapResponse;
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
}