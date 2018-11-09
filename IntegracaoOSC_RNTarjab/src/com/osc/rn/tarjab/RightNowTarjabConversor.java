package com.osc.rn.tarjab;

import java.io.IOException;
import java.util.Date;
import com.osc.ccad.producao.account.Account;
import com.rn.tarjab.producao.typed.Address;
import com.rn.tarjab.producao.typed.Contact;
import com.rn.tarjab.producao.typed.DataTypeEnum;
import com.rn.tarjab.producao.typed.DataValue;
import com.rn.tarjab.producao.typed.Email;
import com.rn.tarjab.producao.typed.EmailList;
import com.rn.tarjab.producao.typed.GenericField;
import com.rn.tarjab.producao.typed.GenericObject;
import com.rn.tarjab.producao.typed.ID;
import com.rn.tarjab.producao.typed.NamedID;
import com.rn.tarjab.producao.typed.ObjectFactory;
import com.rn.tarjab.producao.typed.PersonName;
import com.rn.tarjab.producao.typed.Phone;
import com.rn.tarjab.producao.typed.PhoneList;

public class RightNowTarjabConversor {

	public static Contact toContact(Account account) {
		EmailList emailList = new EmailList();
		PhoneList phoneList = new PhoneList();
		ObjectFactory of = new ObjectFactory();
		String mensagem = "";
		Logger logger = getLogger();
		Address address = new Address();
		String street = "";

		if (account.getOrganizationName() != null && !account.getOrganizationName().isEmpty()) {
			GenericObject genericObject = new GenericObject();

			// Nome/Sobrenome
			Contact contato = new Contact();
			String nome[] = account.getOrganizationName().split(" ", 2);
			PersonName personName = new PersonName();
			personName.setFirst(of.createPersonNameFirst(nome[0]));
			personName.setLast(of.createPersonNameLast(nome[1]));
			contato.setName(personName);

			// AccountID
			if (account.getPartyId() != null) {
				GenericField codGenericField = criarGenericField("account_party_id",
				    criarIntegerDataValue(account.getPartyId().intValue()), DataTypeEnum.INTEGER);
				DataValue codDataValue = new DataValue();
				GenericObject codGenericObject = new GenericObject();
				codGenericObject.getGenericFields().add(codGenericField);
				codDataValue.setObjectValue(codGenericObject);
				GenericField codCField = criarGenericField("c", codDataValue, DataTypeEnum.OBJECT);
				genericObject.getGenericFields().add(codCField);
				contato.setCustomFields(genericObject);
			}

			// RG
			if (account.getOrganizationDEORgC() != null && account.getOrganizationDEORgC().getValue() != null
			    && !account.getOrganizationDEORgC().getValue().isEmpty()) {
				genericObject.getGenericFields()
				    .add(carregarStringGenericField("rg", "c", account.getOrganizationDEORgC().getValue()));
				contato.setCustomFields(genericObject);
			}

			// CPF
			if (account.getOrganizationDEOCpfC() != null && account.getOrganizationDEOCpfC().getValue() != null
			    && !account.getOrganizationDEOCpfC().getValue().isEmpty()) {
				genericObject.getGenericFields()
				    .add(carregarStringGenericField("cpf", "c", account.getOrganizationDEOCpfC().getValue()));
				contato.setCustomFields(genericObject);
				genericObject.getGenericFields().add(carregarNamedIDGenericField("pessoa_fis_jur", "c", criarNamedID(26L)));
			}

			// CNPJ
			if (account.getOrganizationDEOCnpjC() != null && account.getOrganizationDEOCnpjC().getValue() != null
			    && !account.getOrganizationDEOCnpjC().getValue().isEmpty()) {
				genericObject.getGenericFields()
				    .add(carregarStringGenericField("cnpj", "c", account.getOrganizationDEOCnpjC().getValue()));
				genericObject.getGenericFields().add(carregarNamedIDGenericField("pessoa_fis_jur", "c", criarNamedID(27L)));
			}

			// Nome da Mãe
			if (account.getOrganizationDEONomeMaeC() != null && account.getOrganizationDEONomeMaeC().getValue() != null
			    && !account.getOrganizationDEONomeMaeC().getValue().isEmpty()) {
				genericObject.getGenericFields()
				    .add(carregarStringGenericField("nome_mae", "c", account.getOrganizationDEONomeMaeC().getValue()));
				contato.setCustomFields(genericObject);
			}

			// Nome do Pai
			if (account.getOrganizationDEONomePaiC() != null && account.getOrganizationDEONomePaiC().getValue() != null
			    && !account.getOrganizationDEONomePaiC().getValue().isEmpty()) {
				genericObject.getGenericFields()
				    .add(carregarStringGenericField("nome_pai", "c", account.getOrganizationDEONomePaiC().getValue()));
				contato.setCustomFields(genericObject);
			}

			// Integrar com o Oracle SalesCloud
			genericObject.getGenericFields().add(carregarBooleanGenericField("integrar_com_osc", "c", false));
			contato.setCustomFields(genericObject);

			// E-mail
			if (account.getEmailAddress() != null && !account.getEmailAddress().isEmpty()) {
				emailList.getEmailList().add(carregarEmail(0L, account.getEmailAddress()));
			}

			// E-mail Alternativo 1
			if (account.getOrganizationDEOEmailalternativoC() != null
			    && account.getOrganizationDEOEmailalternativoC().getValue() != null
			    && !account.getOrganizationDEOEmailalternativoC().getValue().isEmpty()) {
				emailList.getEmailList().add(carregarEmail(1L, account.getOrganizationDEOEmailalternativoC().getValue()));
			}

			// E-mail Alternativo 2
			if (account.getOrganizationDEOEmailAlternativo2C() != null
			    && account.getOrganizationDEOEmailAlternativo2C().getValue() != null
			    && !account.getOrganizationDEOEmailAlternativo2C().getValue().isEmpty()) {
				emailList.getEmailList().add(carregarEmail(2L, account.getOrganizationDEOEmailAlternativo2C().getValue()));
			}

			// Telefone Comercial
			if (account.getOrganizationDEONumComC() != null && account.getOrganizationDEONumComC().getValue() != null
			    && !account.getOrganizationDEONumComC().getValue().isEmpty()) {
				phoneList.getPhoneList().add(carregarPhone(0L, account.getOrganizationDEONumComC().getValue()));
			}

			// Celular
			if (account.getOrganizationDEOCelularC() != null && account.getOrganizationDEOCelularC().getValue() != null
			    && !account.getOrganizationDEOCelularC().getValue().isEmpty()) {
				phoneList.getPhoneList().add(carregarPhone(1L, account.getOrganizationDEOCelularC().getValue()));
			}

			// Fax
			if (account.getOrganizationDEOFaxC() != null && account.getOrganizationDEOFaxC().getValue() != null
			    && !account.getOrganizationDEOFaxC().getValue().isEmpty()) {
				phoneList.getPhoneList().add(carregarPhone(2L, account.getOrganizationDEOFaxC().getValue()));
			}

			// Telefone do Assistente
			if (account.getOrganizationDEOTelefoneDoAssistenteC() != null
			    && account.getOrganizationDEOTelefoneDoAssistenteC().getValue() != null
			    && !account.getOrganizationDEOTelefoneDoAssistenteC().getValue().isEmpty()) {
				phoneList.getPhoneList().add(carregarPhone(3L, account.getOrganizationDEOTelefoneDoAssistenteC().getValue()));
			}

			// Telefone Residencial
			if (account.getOrganizationDEONumResC() != null && account.getOrganizationDEONumResC().getValue() != null
			    && !account.getOrganizationDEONumResC().getValue().isEmpty()) {
				phoneList.getPhoneList().add(carregarPhone(4L, account.getOrganizationDEONumResC().getValue()));
			}

			// País
			NamedID countryNamedId = new NamedID();
			ID countryID = new ID();
			countryID.setId(2L);
			countryNamedId.setID(countryID);
			address.setCountry(of.createAddressCountry(countryNamedId));

			// Endereço
			if (account.getPrimaryAddress() != null && account.getPrimaryAddress().getAddressLine1() != null
			    && account.getPrimaryAddress().getAddressLine1().getValue() != null
			    && !account.getPrimaryAddress().getAddressLine1().getValue().isEmpty()) {
				street = street + account.getPrimaryAddress().getAddressLine1().getValue();
			}

			// Complemento
			if (account.getPrimaryAddress() != null && account.getPrimaryAddress().getAddressLine2() != null
			    && account.getPrimaryAddress().getAddressLine2().getValue() != null
			    && !account.getPrimaryAddress().getAddressLine2().getValue().isEmpty()) {
				street = street + " " + account.getPrimaryAddress().getAddressLine2().getValue();
			}

			// Bairro
			if (account.getPrimaryAddress() != null && account.getPrimaryAddress().getAddressLine3() != null
			    && account.getPrimaryAddress().getAddressLine3().getValue() != null
			    && !account.getPrimaryAddress().getAddressLine3().getValue().isEmpty()) {
				street = street + "\n" + account.getPrimaryAddress().getAddressLine3().getValue();
			}

			// Cidade
			if (account.getPrimaryAddress() != null && account.getPrimaryAddress().getCity() != null
			    && account.getPrimaryAddress().getCity().getValue() != null
			    && !account.getPrimaryAddress().getCity().getValue().isEmpty()) {
				address.setCity(of.createAddressCity(account.getPrimaryAddress().getCity().getValue()));
			}

			// Estado
			if (account.getPrimaryAddress() != null && account.getPrimaryAddress().getState() != null
			    && account.getPrimaryAddress().getState().getValue() != null
			    && !account.getPrimaryAddress().getState().getValue().isEmpty()) {
				NamedID stateNamedId = new NamedID();
				ID stateID = new ID();
				stateID.setId(
				    Long.parseLong(StateOrProvinceIDMap.getMap().get(account.getPrimaryAddress().getState().getValue())));
				stateNamedId.setID(stateID);
				address.setStateOrProvince(of.createAddressStateOrProvince(stateNamedId));
			}

			// CEP
			if (account.getPrimaryAddress() != null && account.getPrimaryAddress().getPostalCode() != null
			    && account.getPrimaryAddress().getPostalCode().getValue() != null
			    && !account.getPrimaryAddress().getPostalCode().getValue().isEmpty()) {
				address.setPostalCode(of.createAddressPostalCode(account.getPrimaryAddress().getPostalCode().getValue()));
			}

			contato.setEmails(of.createAccountEmails(emailList));
			contato.setPhones(of.createAccountPhones(phoneList));
			address.setStreet(of.createAddressStreet(street));
			contato.setAddress(of.createAddress(address));

			return contato;
		}

		else {
			mensagem = "Não foi possível integrar Cliente porque os campos obrigatórios 'Nome/Sobrenome' estão ausentes.";
			logger.erroArquivo(new Date(), mensagem);
			logger.erroConsole(new Date(), mensagem);
			return null;
		}

	}

	private static GenericField carregarBooleanGenericField(String campo, String namespace, boolean valor) {
		GenericField codGenericField = criarGenericField(campo, criarBooleanDataValue(valor), DataTypeEnum.BOOLEAN);
		DataValue codDataValue = new DataValue();
		GenericObject codGenericObject = new GenericObject();
		codGenericObject.getGenericFields().add(codGenericField);
		codDataValue.setObjectValue(codGenericObject);
		GenericField codCField = criarGenericField("c", codDataValue, DataTypeEnum.OBJECT);
		return codCField;
	}

	private static Email carregarEmail(long idEmail, String endereco) {
		Email email = new Email();
		email.setAddress(endereco);
		email.setAddressType(criarNamedID(idEmail));
		return email;
	}

	private static GenericField carregarNamedIDGenericField(String campo, String namespace, NamedID valor) {
		GenericField codGenericField = criarGenericField(campo, criarNamedIDDataValue(valor), DataTypeEnum.NAMED_ID);
		DataValue codDataValue = new DataValue();
		GenericObject codGenericObject = new GenericObject();
		codGenericObject.getGenericFields().add(codGenericField);
		codDataValue.setObjectValue(codGenericObject);
		GenericField codCField = criarGenericField("c", codDataValue, DataTypeEnum.OBJECT);
		return codCField;
	}

	private static Phone carregarPhone(long idPhone, String numero) {
		Phone phone = new Phone();
		phone.setNumber(numero);
		phone.setPhoneType(criarNamedID(idPhone));
		return phone;
	}

	private static GenericField carregarStringGenericField(String campo, String namespace, String valor) {
		GenericField codGenericField = criarGenericField(campo, criarStringDataValue(valor), DataTypeEnum.STRING);
		DataValue codDataValue = new DataValue();
		GenericObject codGenericObject = new GenericObject();
		codGenericObject.getGenericFields().add(codGenericField);
		codDataValue.setObjectValue(codGenericObject);
		GenericField codCField = criarGenericField("c", codDataValue, DataTypeEnum.OBJECT);
		return codCField;
	}

	private static DataValue criarBooleanDataValue(boolean val) {
		DataValue dv = new DataValue();
		dv.setBooleanValue(val);
		return dv;
	}

	private static GenericField criarGenericField(String name, DataValue dataValue, DataTypeEnum type) {
		GenericField genericField = new GenericField();
		genericField.setDataType(type);
		genericField.setName(name);
		genericField.setDataValue(dataValue);
		return genericField;
	}

	private static DataValue criarIntegerDataValue(int val) {
		DataValue dv = new DataValue();
		dv.setIntegerValue(val);
		return dv;
	}

	private static NamedID criarNamedID(long idLong) {
		NamedID namedID = new NamedID();
		ID id = new ID();
		id.setId(idLong);
		namedID.setID(id);
		return namedID;
	}

	private static DataValue criarNamedIDDataValue(NamedID val) {
		DataValue dv = new DataValue();
		dv.setNamedIDValue(val);
		return dv;
	}

	private static DataValue criarStringDataValue(String val) {
		DataValue dv = new DataValue();
		dv.setStringValue(val);
		return dv;
	}

	private static Logger getLogger() {

		try {
			Logger logger = new Logger();
			return logger;
		}

		catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}

}