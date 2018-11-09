
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MailboxOutgoingEmailSettingsNonCollide
    extends JAXBElement<MailboxOutgoingEmailSettings>
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected final static QName NAME = new QName("urn:objects.ws.rightnow.com/v1_3", "MailboxOutgoingEmailSettings");

    public MailboxOutgoingEmailSettingsNonCollide(MailboxOutgoingEmailSettings value) {
        super(NAME, (MailboxOutgoingEmailSettings.class), null, value);
    }

    public MailboxOutgoingEmailSettingsNonCollide() {
        super(NAME, (MailboxOutgoingEmailSettings.class), null, null);
    }

}
