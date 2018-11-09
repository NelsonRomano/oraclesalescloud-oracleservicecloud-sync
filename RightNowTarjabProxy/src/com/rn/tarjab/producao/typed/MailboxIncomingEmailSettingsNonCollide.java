
package com.rn.tarjab.producao.typed;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MailboxIncomingEmailSettingsNonCollide
    extends JAXBElement<MailboxIncomingEmailSettings>
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected final static QName NAME = new QName("urn:objects.ws.rightnow.com/v1_3", "MailboxIncomingEmailSettings");

    public MailboxIncomingEmailSettingsNonCollide(MailboxIncomingEmailSettings value) {
        super(NAME, (MailboxIncomingEmailSettings.class), null, value);
    }

    public MailboxIncomingEmailSettingsNonCollide() {
        super(NAME, (MailboxIncomingEmailSettings.class), null, null);
    }

}
