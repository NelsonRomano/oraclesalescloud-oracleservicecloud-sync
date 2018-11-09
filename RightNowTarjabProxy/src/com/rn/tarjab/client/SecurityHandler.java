package com.rn.tarjab.client;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class SecurityHandler implements SOAPHandler<SOAPMessageContext> {
	private String usuario;
	private String senha;

	public SecurityHandler(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	@Override
	public void close(MessageContext arg0) {
	}

	@Override
	public boolean handleFault(SOAPMessageContext arg0) {
		return false;
	}

	@Override
	public boolean handleMessage(final SOAPMessageContext context) {
		final Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		if (outboundProperty.booleanValue()) {

			try {
				final SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
				SOAPHeader header = envelope.getHeader();

				if (header == null) {
					header = envelope.addHeader();
				}

				final SOAPElement security = header.addChildElement("Security", "wsse",
						"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
				final SOAPElement userToken = security.addChildElement("UsernameToken", "wsse");
				security.addNamespaceDeclaration("wsu",
						"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");

				@SuppressWarnings("unused")
				SOAPElement username = userToken.addChildElement("Username", "wsse").addTextNode(usuario);
				SOAPElement password = userToken.addChildElement("Password", "wsse").addTextNode(senha);
				password.setAttribute("Type",
						"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");

			}
			
			catch (final Exception e) {
				e.printStackTrace();
				return false;
			}
			
		}
		
		return true;
	}

	@Override
	public Set<QName> getHeaders() {
		return null;
	}

}
