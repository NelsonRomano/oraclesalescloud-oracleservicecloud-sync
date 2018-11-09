
package com.osc.ccad.producao.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Account complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemReferenceValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniqueNameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OwnerPartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryContactPartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactSourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactSourceSystemReferenceValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExistingCustomerFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExistingCustomerFlagLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="NamedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastAssignmentDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="LastAssignmentDateTime" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="AssignmentExceptionFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SalesProfileStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndustryCodeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndustryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentAccountPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ParentAccountPartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentAccountSourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentAccountSourceSystemReferenceValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YearEstablished" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ControlYear" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="YearIncorporated" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StockSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalYearendMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentFiscalYearPotentialRevenueAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="PreferredFunctionalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnalysisFiscalYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextFiscalYearPotentialRevenueAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalPaymentAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxpayerIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificationReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNSCreditRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DomesticUltimateDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalUltimateDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CEOName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CEOTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicPrivateOwnershipFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ImportIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExportIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmallBusinessIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WomanOwnedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeneralServicesAdministrationFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MinorityOwnedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinorityOwnedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RentOrOwnIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LaborSurplusIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfBusinessIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HQBranchIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentOrSubsidiaryIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisadvantageIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeesAtPrimaryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeesAtPrimaryAddressEstimation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeesAtPrimaryAddressMinimum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeesAtPrimaryAddressText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeesTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalEmployeesEstimatedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalEmployeesIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalEmployeesMinimumIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalEmployeesText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrincipalTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrincipalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MissionStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorporationClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GrowthStrategyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CongressionalDistrictCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DoNotConfuseWith" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalActivityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalActivityCodeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalBusinessIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalBusinessIdentifierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiebelLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessReport" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurcyConvRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataCloudStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastEnrichmentDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PartyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedByModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedFaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FavoriteAccountFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrimaryAddress" type="{http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/}PrimaryAddress" minOccurs="0"/>
 *         &lt;element name="SalesTeamMember" type="{http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/}SalesTeamMember" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://xmlns.oracle.com/apps/crmCommon/notes/noteService}Note" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_nacionalidade_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_PNE_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_estado_civil_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_pessoa_fis_jur_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_cpf_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_rg_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_Apelido_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_empresa_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_faixa_salarial_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_formacao_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_profissao_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_PercepçãoSobreOCliente_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_notif_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_conhece_cli_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_facebook_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_intagram_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_whats_rede_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_linkedIn_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_outra_rede_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_uol_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_yahoo_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_globo_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_r7_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_outro_ptl_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_futebol_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_volei_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_golfe_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_corrida_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_outro_esporte_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_corinthians_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_palmeiras_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_outroTime_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_cinema_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_teatro_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_viagem_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_show_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_outroPassatempo_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_italiana_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_espanhola_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_japonesa_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_arabe_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_outraComida_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_suco_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_cerveja_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_whisky_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_outraBebida_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_classica_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_jazz_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_rock_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_mpb_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_outroestilomusical_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_possuianimaldeestimacao_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_telefone_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_email_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_whats_cont_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_outro_cont_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_reclameaqui_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_falecompresidente_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_qual_rede_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_qual_ptl_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_qual_espt_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_qual_time_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_qual_passtp_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_qual_comida_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_qual_bebida_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_qual_musica_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_qual_ctt_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_outro_contato_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_cnpj_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_regime_casamento_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_pacto_casamento_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_nome_pai_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_nome_mae_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_id_mega_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_num_res_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_num_com_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_saopaulo_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_santos_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_restricao_alimentar_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_qual_restricao_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_vinho_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_finalidade_compra_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_cep_com_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_qual_ne_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_grau_relacao_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_qual_investimento_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_bairro_res_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_tag_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_pontuacao_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_classificacao_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_beneficios_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_n_filhos_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_idade_f1_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_sexo_f1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_idade_f2_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_sexo_f2_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_sexo_f3_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_idade_f3_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_percepcaosobreocliente_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_qual_animal_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_correio_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_emailalternativo_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_TipoDeContato_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_IDDoContato_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_EmailAlternativo2_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_TelefoneDoAssistente_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_Celular_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_Fax_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_DataDeNascimento_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_DataDeCasamento_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_ValorTotal_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_Falecido_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_NumeroDeUnidades_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_Sexo_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_IntegradoComRightNow_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", propOrder = {
    "partyId",
    "partyNumber",
    "sourceSystem",
    "sourceSystemReferenceValue",
    "organizationName",
    "uniqueNameSuffix",
    "partyUniqueName",
    "type",
    "ownerPartyId",
    "ownerPartyNumber",
    "ownerEmailAddress",
    "ownerName",
    "primaryContactPartyId",
    "primaryContactPartyNumber",
    "primaryContactSourceSystem",
    "primaryContactSourceSystemReferenceValue",
    "primaryContactName",
    "primaryContactEmail",
    "primaryContactPhone",
    "existingCustomerFlag",
    "existingCustomerFlagLastUpdateDate",
    "namedFlag",
    "lastAssignmentDate",
    "lastAssignmentDateTime",
    "assignmentExceptionFlag",
    "salesProfileStatus",
    "industryCodeType",
    "industryCode",
    "parentAccountPartyId",
    "parentAccountPartyNumber",
    "parentAccountSourceSystem",
    "parentAccountSourceSystemReferenceValue",
    "yearEstablished",
    "controlYear",
    "yearIncorporated",
    "stockSymbol",
    "fiscalYearendMonth",
    "currentFiscalYearPotentialRevenueAmount",
    "preferredFunctionalCurrency",
    "analysisFiscalYear",
    "nextFiscalYearPotentialRevenueAmount",
    "totalPaymentAmount",
    "taxpayerIdentificationNumber",
    "certificationLevel",
    "certificationReasonCode",
    "dunsNumber",
    "dunsCreditRating",
    "parentDUNSNumber",
    "domesticUltimateDUNSNumber",
    "globalUltimateDUNSNumber",
    "ceoName",
    "ceoTitle",
    "publicPrivateOwnershipFlag",
    "importIndicator",
    "exportIndicator",
    "smallBusinessIndicator",
    "womanOwnedIndicator",
    "generalServicesAdministrationFlag",
    "minorityOwnedIndicator",
    "minorityOwnedType",
    "rentOrOwnIndicator",
    "laborSurplusIndicator",
    "outOfBusinessIndicator",
    "hqBranchIndicator",
    "parentOrSubsidiaryIndicator",
    "disadvantageIndicator",
    "employeesAtPrimaryAddress",
    "employeesAtPrimaryAddressEstimation",
    "employeesAtPrimaryAddressMinimum",
    "employeesAtPrimaryAddressText",
    "employeesTotal",
    "totalEmployeesEstimatedIndicator",
    "totalEmployeesIndicator",
    "totalEmployeesMinimumIndicator",
    "totalEmployeesText",
    "organizationSize",
    "organizationType",
    "principalTitle",
    "principalName",
    "legalStatus",
    "businessScope",
    "registrationType",
    "missionStatement",
    "corporationClass",
    "growthStrategyDescription",
    "congressionalDistrictCode",
    "lineOfBusiness",
    "homeCountry",
    "doNotConfuseWith",
    "localActivityCode",
    "localActivityCodeType",
    "localBusinessIdentifier",
    "localBusinessIdentifierType",
    "siebelLocation",
    "comments",
    "businessReport",
    "currencyCode",
    "curcyConvRateType",
    "corpCurrencyCode",
    "dataCloudStatus",
    "lastEnrichmentDate",
    "partyStatus",
    "createdByModule",
    "createdBy",
    "creationDate",
    "lastUpdateDate",
    "lastUpdateLogin",
    "lastUpdatedBy",
    "preferredContactMethod",
    "phoneCountryCode",
    "phoneAreaCode",
    "phoneNumber",
    "phoneExtension",
    "formattedPhoneNumber",
    "faxCountryCode",
    "faxAreaCode",
    "faxNumber",
    "faxExtension",
    "formattedFaxNumber",
    "emailFormat",
    "emailAddress",
    "url",
    "recordSet",
    "favoriteAccountFlag",
    "primaryAddress",
    "salesTeamMember",
    "note",
    "organizationDEONacionalidadeC",
    "organizationDEOPNEC",
    "organizationDEOEstadoCivilC",
    "organizationDEOPessoaFisJurC",
    "organizationDEOCpfC",
    "organizationDEORgC",
    "organizationDEOApelidoC",
    "organizationDEOEmpresaC",
    "organizationDEOFaixaSalarialC",
    "organizationDEOFormacaoC",
    "organizationDEOProfissaoC",
    "organizationDEOPercep\u00e7\u00e3oSobreOClienteC",
    "organizationDEONotifC",
    "organizationDEOConheceCliC",
    "organizationDEOFacebookC",
    "organizationDEOIntagramC",
    "organizationDEOWhatsRedeC",
    "organizationDEOLinkedInC",
    "organizationDEOOutraRedeC",
    "organizationDEOUolC",
    "organizationDEOYahooC",
    "organizationDEOGloboC",
    "organizationDEOR7C",
    "organizationDEOOutroPtlC",
    "organizationDEOFutebolC",
    "organizationDEOVoleiC",
    "organizationDEOGolfeC",
    "organizationDEOCorridaC",
    "organizationDEOOutroEsporteC",
    "organizationDEOCorinthiansC",
    "organizationDEOPalmeirasC",
    "organizationDEOOutroTimeC",
    "organizationDEOCinemaC",
    "organizationDEOTeatroC",
    "organizationDEOViagemC",
    "organizationDEOShowC",
    "organizationDEOOutroPassatempoC",
    "organizationDEOItalianaC",
    "organizationDEOEspanholaC",
    "organizationDEOJaponesaC",
    "organizationDEOArabeC",
    "organizationDEOOutraComidaC",
    "organizationDEOSucoC",
    "organizationDEOCervejaC",
    "organizationDEOWhiskyC",
    "organizationDEOOutraBebidaC",
    "organizationDEOClassicaC",
    "organizationDEOJazzC",
    "organizationDEORockC",
    "organizationDEOMpbC",
    "organizationDEOOutroestilomusicalC",
    "organizationDEOPossuianimaldeestimacaoC",
    "organizationDEOTelefoneC",
    "organizationDEOEmailC",
    "organizationDEOWhatsContC",
    "organizationDEOOutroContC",
    "organizationDEOReclameaquiC",
    "organizationDEOFalecompresidenteC",
    "organizationDEOQualRedeC",
    "organizationDEOQualPtlC",
    "organizationDEOQualEsptC",
    "organizationDEOQualTimeC",
    "organizationDEOQualPasstpC",
    "organizationDEOQualComidaC",
    "organizationDEOQualBebidaC",
    "organizationDEOQualMusicaC",
    "organizationDEOQualCttC",
    "organizationDEOOutroContatoC",
    "organizationDEOCnpjC",
    "organizationDEORegimeCasamentoC",
    "organizationDEOPactoCasamentoC",
    "organizationDEONomePaiC",
    "organizationDEONomeMaeC",
    "organizationDEOIdMegaC",
    "organizationDEONumResC",
    "organizationDEONumComC",
    "organizationDEOSaopauloC",
    "organizationDEOSantosC",
    "organizationDEORestricaoAlimentarC",
    "organizationDEOQualRestricaoC",
    "organizationDEOVinhoC",
    "organizationDEOFinalidadeCompraC",
    "organizationDEOCepComC",
    "organizationDEOQualNeC",
    "organizationDEOGrauRelacaoC",
    "organizationDEOQualInvestimentoC",
    "organizationDEOBairroResC",
    "organizationDEOTagC",
    "organizationDEOPontuacaoC",
    "organizationDEOClassificacaoC",
    "organizationDEOBeneficiosC",
    "organizationDEONFilhosC",
    "organizationDEOIdadeF1C",
    "organizationDEOSexoF1C",
    "organizationDEOIdadeF2C",
    "organizationDEOSexoF2C",
    "organizationDEOSexoF3C",
    "organizationDEOIdadeF3C",
    "organizationDEOPercepcaosobreoclienteC",
    "organizationDEOQualAnimalC",
    "organizationDEOCorreioC",
    "organizationDEOEmailalternativoC",
    "organizationDEOTipoDeContatoC",
    "organizationDEOIDDoContatoC",
    "organizationDEOEmailAlternativo2C",
    "organizationDEOTelefoneDoAssistenteC",
    "organizationDEOCelularC",
    "organizationDEOFaxC",
    "organizationDEODataDeNascimentoC",
    "organizationDEODataDeCasamentoC",
    "organizationDEOValorTotalC",
    "organizationDEOFalecidoC",
    "organizationDEONumeroDeUnidadesC",
    "organizationDEOSexoC",
    "organizationDEOIntegradoComRightNowC"
})
public class Account {

    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElement(name = "PartyNumber")
    protected String partyNumber;
    @XmlElementRef(name = "SourceSystem", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceSystem;
    @XmlElementRef(name = "SourceSystemReferenceValue", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceSystemReferenceValue;
    @XmlElement(name = "OrganizationName")
    protected String organizationName;
    @XmlElementRef(name = "UniqueNameSuffix", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uniqueNameSuffix;
    @XmlElement(name = "PartyUniqueName")
    protected String partyUniqueName;
    @XmlElementRef(name = "Type", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type;
    @XmlElementRef(name = "OwnerPartyId", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ownerPartyId;
    @XmlElement(name = "OwnerPartyNumber")
    protected String ownerPartyNumber;
    @XmlElementRef(name = "OwnerEmailAddress", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerEmailAddress;
    @XmlElement(name = "OwnerName")
    protected String ownerName;
    @XmlElementRef(name = "PrimaryContactPartyId", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> primaryContactPartyId;
    @XmlElementRef(name = "PrimaryContactPartyNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryContactPartyNumber;
    @XmlElementRef(name = "PrimaryContactSourceSystem", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryContactSourceSystem;
    @XmlElementRef(name = "PrimaryContactSourceSystemReferenceValue", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryContactSourceSystemReferenceValue;
    @XmlElementRef(name = "PrimaryContactName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryContactName;
    @XmlElementRef(name = "PrimaryContactEmail", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryContactEmail;
    @XmlElementRef(name = "PrimaryContactPhone", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryContactPhone;
    @XmlElementRef(name = "ExistingCustomerFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> existingCustomerFlag;
    @XmlElementRef(name = "ExistingCustomerFlagLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> existingCustomerFlagLastUpdateDate;
    @XmlElementRef(name = "NamedFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> namedFlag;
    @XmlElementRef(name = "LastAssignmentDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastAssignmentDate;
    @XmlElementRef(name = "LastAssignmentDateTime", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastAssignmentDateTime;
    @XmlElementRef(name = "AssignmentExceptionFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> assignmentExceptionFlag;
    @XmlElementRef(name = "SalesProfileStatus", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesProfileStatus;
    @XmlElementRef(name = "IndustryCodeType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> industryCodeType;
    @XmlElementRef(name = "IndustryCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> industryCode;
    @XmlElementRef(name = "ParentAccountPartyId", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> parentAccountPartyId;
    @XmlElementRef(name = "ParentAccountPartyNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentAccountPartyNumber;
    @XmlElementRef(name = "ParentAccountSourceSystem", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentAccountSourceSystem;
    @XmlElementRef(name = "ParentAccountSourceSystemReferenceValue", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentAccountSourceSystemReferenceValue;
    @XmlElementRef(name = "YearEstablished", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> yearEstablished;
    @XmlElementRef(name = "ControlYear", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> controlYear;
    @XmlElementRef(name = "YearIncorporated", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> yearIncorporated;
    @XmlElementRef(name = "StockSymbol", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stockSymbol;
    @XmlElementRef(name = "FiscalYearendMonth", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fiscalYearendMonth;
    @XmlElementRef(name = "CurrentFiscalYearPotentialRevenueAmount", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> currentFiscalYearPotentialRevenueAmount;
    @XmlElementRef(name = "PreferredFunctionalCurrency", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredFunctionalCurrency;
    @XmlElementRef(name = "AnalysisFiscalYear", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> analysisFiscalYear;
    @XmlElementRef(name = "NextFiscalYearPotentialRevenueAmount", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> nextFiscalYearPotentialRevenueAmount;
    @XmlElementRef(name = "TotalPaymentAmount", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> totalPaymentAmount;
    @XmlElementRef(name = "TaxpayerIdentificationNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxpayerIdentificationNumber;
    @XmlElementRef(name = "CertificationLevel", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certificationLevel;
    @XmlElementRef(name = "CertificationReasonCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certificationReasonCode;
    @XmlElementRef(name = "DUNSNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dunsNumber;
    @XmlElementRef(name = "DUNSCreditRating", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dunsCreditRating;
    @XmlElementRef(name = "ParentDUNSNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentDUNSNumber;
    @XmlElementRef(name = "DomesticUltimateDUNSNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domesticUltimateDUNSNumber;
    @XmlElementRef(name = "GlobalUltimateDUNSNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalUltimateDUNSNumber;
    @XmlElementRef(name = "CEOName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ceoName;
    @XmlElementRef(name = "CEOTitle", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ceoTitle;
    @XmlElementRef(name = "PublicPrivateOwnershipFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> publicPrivateOwnershipFlag;
    @XmlElementRef(name = "ImportIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importIndicator;
    @XmlElementRef(name = "ExportIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exportIndicator;
    @XmlElementRef(name = "SmallBusinessIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> smallBusinessIndicator;
    @XmlElementRef(name = "WomanOwnedIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> womanOwnedIndicator;
    @XmlElementRef(name = "GeneralServicesAdministrationFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> generalServicesAdministrationFlag;
    @XmlElementRef(name = "MinorityOwnedIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minorityOwnedIndicator;
    @XmlElementRef(name = "MinorityOwnedType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minorityOwnedType;
    @XmlElementRef(name = "RentOrOwnIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rentOrOwnIndicator;
    @XmlElementRef(name = "LaborSurplusIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> laborSurplusIndicator;
    @XmlElementRef(name = "OutOfBusinessIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outOfBusinessIndicator;
    @XmlElementRef(name = "HQBranchIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hqBranchIndicator;
    @XmlElementRef(name = "ParentOrSubsidiaryIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentOrSubsidiaryIndicator;
    @XmlElementRef(name = "DisadvantageIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> disadvantageIndicator;
    @XmlElementRef(name = "EmployeesAtPrimaryAddress", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeesAtPrimaryAddress;
    @XmlElementRef(name = "EmployeesAtPrimaryAddressEstimation", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeesAtPrimaryAddressEstimation;
    @XmlElementRef(name = "EmployeesAtPrimaryAddressMinimum", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeesAtPrimaryAddressMinimum;
    @XmlElementRef(name = "EmployeesAtPrimaryAddressText", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeesAtPrimaryAddressText;
    @XmlElementRef(name = "EmployeesTotal", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> employeesTotal;
    @XmlElementRef(name = "TotalEmployeesEstimatedIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalEmployeesEstimatedIndicator;
    @XmlElementRef(name = "TotalEmployeesIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalEmployeesIndicator;
    @XmlElementRef(name = "TotalEmployeesMinimumIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalEmployeesMinimumIndicator;
    @XmlElementRef(name = "TotalEmployeesText", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalEmployeesText;
    @XmlElementRef(name = "OrganizationSize", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationSize;
    @XmlElementRef(name = "OrganizationType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationType;
    @XmlElementRef(name = "PrincipalTitle", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> principalTitle;
    @XmlElementRef(name = "PrincipalName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> principalName;
    @XmlElementRef(name = "LegalStatus", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> legalStatus;
    @XmlElementRef(name = "BusinessScope", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessScope;
    @XmlElementRef(name = "RegistrationType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationType;
    @XmlElementRef(name = "MissionStatement", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> missionStatement;
    @XmlElementRef(name = "CorporationClass", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corporationClass;
    @XmlElementRef(name = "GrowthStrategyDescription", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> growthStrategyDescription;
    @XmlElementRef(name = "CongressionalDistrictCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> congressionalDistrictCode;
    @XmlElementRef(name = "LineOfBusiness", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineOfBusiness;
    @XmlElementRef(name = "HomeCountry", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> homeCountry;
    @XmlElementRef(name = "DoNotConfuseWith", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> doNotConfuseWith;
    @XmlElementRef(name = "LocalActivityCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localActivityCode;
    @XmlElementRef(name = "LocalActivityCodeType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localActivityCodeType;
    @XmlElementRef(name = "LocalBusinessIdentifier", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localBusinessIdentifier;
    @XmlElementRef(name = "LocalBusinessIdentifierType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localBusinessIdentifierType;
    @XmlElementRef(name = "SiebelLocation", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siebelLocation;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "BusinessReport", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> businessReport;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "CurcyConvRateType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curcyConvRateType;
    @XmlElementRef(name = "CorpCurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpCurrencyCode;
    @XmlElementRef(name = "DataCloudStatus", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataCloudStatus;
    @XmlElementRef(name = "LastEnrichmentDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastEnrichmentDate;
    @XmlElement(name = "PartyStatus")
    protected String partyStatus;
    @XmlElementRef(name = "CreatedByModule", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdByModule;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "LastUpdateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElementRef(name = "PreferredContactMethod", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredContactMethod;
    @XmlElementRef(name = "PhoneCountryCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneCountryCode;
    @XmlElementRef(name = "PhoneAreaCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneAreaCode;
    @XmlElementRef(name = "PhoneNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneNumber;
    @XmlElementRef(name = "PhoneExtension", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneExtension;
    @XmlElementRef(name = "FormattedPhoneNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formattedPhoneNumber;
    @XmlElementRef(name = "FaxCountryCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> faxCountryCode;
    @XmlElementRef(name = "FaxAreaCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> faxAreaCode;
    @XmlElementRef(name = "FaxNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> faxNumber;
    @XmlElementRef(name = "FaxExtension", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> faxExtension;
    @XmlElementRef(name = "FormattedFaxNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formattedFaxNumber;
    @XmlElementRef(name = "EmailFormat", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailFormat;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElementRef(name = "RecordSet", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recordSet;
    @XmlElementRef(name = "FavoriteAccountFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> favoriteAccountFlag;
    @XmlElement(name = "PrimaryAddress")
    protected PrimaryAddress primaryAddress;
    @XmlElement(name = "SalesTeamMember")
    protected List<SalesTeamMember> salesTeamMember;
    @XmlElement(name = "Note")
    protected List<Note> note;
    @XmlElementRef(name = "OrganizationDEO_nacionalidade_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEONacionalidadeC;
    @XmlElementRef(name = "OrganizationDEO_PNE_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOPNEC;
    @XmlElementRef(name = "OrganizationDEO_estado_civil_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOEstadoCivilC;
    @XmlElementRef(name = "OrganizationDEO_pessoa_fis_jur_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOPessoaFisJurC;
    @XmlElementRef(name = "OrganizationDEO_cpf_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOCpfC;
    @XmlElementRef(name = "OrganizationDEO_rg_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEORgC;
    @XmlElementRef(name = "OrganizationDEO_Apelido_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOApelidoC;
    @XmlElementRef(name = "OrganizationDEO_empresa_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOEmpresaC;
    @XmlElementRef(name = "OrganizationDEO_faixa_salarial_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOFaixaSalarialC;
    @XmlElementRef(name = "OrganizationDEO_formacao_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOFormacaoC;
    @XmlElementRef(name = "OrganizationDEO_profissao_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOProfissaoC;
    @XmlElementRef(name = "OrganizationDEO_Percep\u00e7\u00e3oSobreOCliente_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> organizationDEOPercepçãoSobreOClienteC;
    @XmlElementRef(name = "OrganizationDEO_notif_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEONotifC;
    @XmlElement(name = "OrganizationDEO_conhece_cli_c")
    protected Boolean organizationDEOConheceCliC;
    @XmlElement(name = "OrganizationDEO_facebook_c")
    protected Boolean organizationDEOFacebookC;
    @XmlElement(name = "OrganizationDEO_intagram_c")
    protected Boolean organizationDEOIntagramC;
    @XmlElement(name = "OrganizationDEO_whats_rede_c")
    protected Boolean organizationDEOWhatsRedeC;
    @XmlElement(name = "OrganizationDEO_linkedIn_c")
    protected Boolean organizationDEOLinkedInC;
    @XmlElement(name = "OrganizationDEO_outra_rede_c")
    protected Boolean organizationDEOOutraRedeC;
    @XmlElement(name = "OrganizationDEO_uol_c")
    protected Boolean organizationDEOUolC;
    @XmlElement(name = "OrganizationDEO_yahoo_c")
    protected Boolean organizationDEOYahooC;
    @XmlElement(name = "OrganizationDEO_globo_c")
    protected Boolean organizationDEOGloboC;
    @XmlElement(name = "OrganizationDEO_r7_c")
    protected Boolean organizationDEOR7C;
    @XmlElement(name = "OrganizationDEO_outro_ptl_c")
    protected Boolean organizationDEOOutroPtlC;
    @XmlElement(name = "OrganizationDEO_futebol_c")
    protected Boolean organizationDEOFutebolC;
    @XmlElement(name = "OrganizationDEO_volei_c")
    protected Boolean organizationDEOVoleiC;
    @XmlElement(name = "OrganizationDEO_golfe_c")
    protected Boolean organizationDEOGolfeC;
    @XmlElement(name = "OrganizationDEO_corrida_c")
    protected Boolean organizationDEOCorridaC;
    @XmlElement(name = "OrganizationDEO_outro_esporte_c")
    protected Boolean organizationDEOOutroEsporteC;
    @XmlElement(name = "OrganizationDEO_corinthians_c")
    protected Boolean organizationDEOCorinthiansC;
    @XmlElement(name = "OrganizationDEO_palmeiras_c")
    protected Boolean organizationDEOPalmeirasC;
    @XmlElement(name = "OrganizationDEO_outroTime_c")
    protected Boolean organizationDEOOutroTimeC;
    @XmlElement(name = "OrganizationDEO_cinema_c")
    protected Boolean organizationDEOCinemaC;
    @XmlElement(name = "OrganizationDEO_teatro_c")
    protected Boolean organizationDEOTeatroC;
    @XmlElement(name = "OrganizationDEO_viagem_c")
    protected Boolean organizationDEOViagemC;
    @XmlElement(name = "OrganizationDEO_show_c")
    protected Boolean organizationDEOShowC;
    @XmlElement(name = "OrganizationDEO_outroPassatempo_c")
    protected Boolean organizationDEOOutroPassatempoC;
    @XmlElement(name = "OrganizationDEO_italiana_c")
    protected Boolean organizationDEOItalianaC;
    @XmlElement(name = "OrganizationDEO_espanhola_c")
    protected Boolean organizationDEOEspanholaC;
    @XmlElement(name = "OrganizationDEO_japonesa_c")
    protected Boolean organizationDEOJaponesaC;
    @XmlElement(name = "OrganizationDEO_arabe_c")
    protected Boolean organizationDEOArabeC;
    @XmlElement(name = "OrganizationDEO_outraComida_c")
    protected Boolean organizationDEOOutraComidaC;
    @XmlElement(name = "OrganizationDEO_suco_c")
    protected Boolean organizationDEOSucoC;
    @XmlElement(name = "OrganizationDEO_cerveja_c")
    protected Boolean organizationDEOCervejaC;
    @XmlElement(name = "OrganizationDEO_whisky_c")
    protected Boolean organizationDEOWhiskyC;
    @XmlElement(name = "OrganizationDEO_outraBebida_c")
    protected Boolean organizationDEOOutraBebidaC;
    @XmlElement(name = "OrganizationDEO_classica_c")
    protected Boolean organizationDEOClassicaC;
    @XmlElement(name = "OrganizationDEO_jazz_c")
    protected Boolean organizationDEOJazzC;
    @XmlElement(name = "OrganizationDEO_rock_c")
    protected Boolean organizationDEORockC;
    @XmlElement(name = "OrganizationDEO_mpb_c")
    protected Boolean organizationDEOMpbC;
    @XmlElement(name = "OrganizationDEO_outroestilomusical_c")
    protected Boolean organizationDEOOutroestilomusicalC;
    @XmlElement(name = "OrganizationDEO_possuianimaldeestimacao_c")
    protected Boolean organizationDEOPossuianimaldeestimacaoC;
    @XmlElement(name = "OrganizationDEO_telefone_c")
    protected Boolean organizationDEOTelefoneC;
    @XmlElement(name = "OrganizationDEO_email_c")
    protected Boolean organizationDEOEmailC;
    @XmlElement(name = "OrganizationDEO_whats_cont_c")
    protected Boolean organizationDEOWhatsContC;
    @XmlElement(name = "OrganizationDEO_outro_cont_c")
    protected Boolean organizationDEOOutroContC;
    @XmlElement(name = "OrganizationDEO_reclameaqui_c")
    protected Boolean organizationDEOReclameaquiC;
    @XmlElement(name = "OrganizationDEO_falecompresidente_c")
    protected Boolean organizationDEOFalecompresidenteC;
    @XmlElementRef(name = "OrganizationDEO_qual_rede_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOQualRedeC;
    @XmlElementRef(name = "OrganizationDEO_qual_ptl_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOQualPtlC;
    @XmlElementRef(name = "OrganizationDEO_qual_espt_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOQualEsptC;
    @XmlElementRef(name = "OrganizationDEO_qual_time_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOQualTimeC;
    @XmlElementRef(name = "OrganizationDEO_qual_passtp_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOQualPasstpC;
    @XmlElementRef(name = "OrganizationDEO_qual_comida_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOQualComidaC;
    @XmlElementRef(name = "OrganizationDEO_qual_bebida_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOQualBebidaC;
    @XmlElementRef(name = "OrganizationDEO_qual_musica_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOQualMusicaC;
    @XmlElementRef(name = "OrganizationDEO_qual_ctt_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOQualCttC;
    @XmlElementRef(name = "OrganizationDEO_outro_contato_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOOutroContatoC;
    @XmlElementRef(name = "OrganizationDEO_cnpj_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOCnpjC;
    @XmlElementRef(name = "OrganizationDEO_regime_casamento_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEORegimeCasamentoC;
    @XmlElementRef(name = "OrganizationDEO_pacto_casamento_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOPactoCasamentoC;
    @XmlElementRef(name = "OrganizationDEO_nome_pai_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEONomePaiC;
    @XmlElementRef(name = "OrganizationDEO_nome_mae_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEONomeMaeC;
    @XmlElementRef(name = "OrganizationDEO_id_mega_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> organizationDEOIdMegaC;
    @XmlElementRef(name = "OrganizationDEO_num_res_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEONumResC;
    @XmlElementRef(name = "OrganizationDEO_num_com_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEONumComC;
    @XmlElement(name = "OrganizationDEO_saopaulo_c")
    protected Boolean organizationDEOSaopauloC;
    @XmlElement(name = "OrganizationDEO_santos_c")
    protected Boolean organizationDEOSantosC;
    @XmlElement(name = "OrganizationDEO_restricao_alimentar_c")
    protected Boolean organizationDEORestricaoAlimentarC;
    @XmlElementRef(name = "OrganizationDEO_qual_restricao_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOQualRestricaoC;
    @XmlElement(name = "OrganizationDEO_vinho_c")
    protected Boolean organizationDEOVinhoC;
    @XmlElementRef(name = "OrganizationDEO_finalidade_compra_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOFinalidadeCompraC;
    @XmlElementRef(name = "OrganizationDEO_cep_com_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOCepComC;
    @XmlElementRef(name = "OrganizationDEO_qual_ne_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOQualNeC;
    @XmlElementRef(name = "OrganizationDEO_grau_relacao_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOGrauRelacaoC;
    @XmlElementRef(name = "OrganizationDEO_qual_investimento_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOQualInvestimentoC;
    @XmlElementRef(name = "OrganizationDEO_bairro_res_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOBairroResC;
    @XmlElementRef(name = "OrganizationDEO_tag_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOTagC;
    @XmlElementRef(name = "OrganizationDEO_pontuacao_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> organizationDEOPontuacaoC;
    @XmlElementRef(name = "OrganizationDEO_classificacao_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOClassificacaoC;
    @XmlElementRef(name = "OrganizationDEO_beneficios_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> organizationDEOBeneficiosC;
    @XmlElementRef(name = "OrganizationDEO_n_filhos_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> organizationDEONFilhosC;
    @XmlElementRef(name = "OrganizationDEO_idade_f1_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> organizationDEOIdadeF1C;
    @XmlElementRef(name = "OrganizationDEO_sexo_f1_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOSexoF1C;
    @XmlElementRef(name = "OrganizationDEO_idade_f2_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> organizationDEOIdadeF2C;
    @XmlElementRef(name = "OrganizationDEO_sexo_f2_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOSexoF2C;
    @XmlElementRef(name = "OrganizationDEO_sexo_f3_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOSexoF3C;
    @XmlElementRef(name = "OrganizationDEO_idade_f3_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> organizationDEOIdadeF3C;
    @XmlElementRef(name = "OrganizationDEO_percepcaosobreocliente_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> organizationDEOPercepcaosobreoclienteC;
    @XmlElementRef(name = "OrganizationDEO_qual_animal_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOQualAnimalC;
    @XmlElement(name = "OrganizationDEO_correio_c")
    protected Boolean organizationDEOCorreioC;
    @XmlElementRef(name = "OrganizationDEO_emailalternativo_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOEmailalternativoC;
    @XmlElementRef(name = "OrganizationDEO_TipoDeContato_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOTipoDeContatoC;
    @XmlElementRef(name = "OrganizationDEO_IDDoContato_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> organizationDEOIDDoContatoC;
    @XmlElementRef(name = "OrganizationDEO_EmailAlternativo2_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOEmailAlternativo2C;
    @XmlElementRef(name = "OrganizationDEO_TelefoneDoAssistente_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOTelefoneDoAssistenteC;
    @XmlElementRef(name = "OrganizationDEO_Celular_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOCelularC;
    @XmlElementRef(name = "OrganizationDEO_Fax_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOFaxC;
    @XmlElementRef(name = "OrganizationDEO_DataDeNascimento_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> organizationDEODataDeNascimentoC;
    @XmlElementRef(name = "OrganizationDEO_DataDeCasamento_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> organizationDEODataDeCasamentoC;
    @XmlElementRef(name = "OrganizationDEO_ValorTotal_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOValorTotalC;
    @XmlElement(name = "OrganizationDEO_Falecido_c")
    protected Boolean organizationDEOFalecidoC;
    @XmlElementRef(name = "OrganizationDEO_NumeroDeUnidades_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> organizationDEONumeroDeUnidadesC;
    @XmlElementRef(name = "OrganizationDEO_Sexo_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationDEOSexoC;
    @XmlElement(name = "OrganizationDEO_IntegradoComRightNow_c")
    protected Boolean organizationDEOIntegradoComRightNowC;

    /**
     * Obtém o valor da propriedade partyId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartyId() {
        return partyId;
    }

    /**
     * Define o valor da propriedade partyId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartyId(Long value) {
        this.partyId = value;
    }

    /**
     * Obtém o valor da propriedade partyNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyNumber() {
        return partyNumber;
    }

    /**
     * Define o valor da propriedade partyNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyNumber(String value) {
        this.partyNumber = value;
    }

    /**
     * Obtém o valor da propriedade sourceSystem.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Define o valor da propriedade sourceSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceSystem(JAXBElement<String> value) {
        this.sourceSystem = value;
    }

    /**
     * Obtém o valor da propriedade sourceSystemReferenceValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceSystemReferenceValue() {
        return sourceSystemReferenceValue;
    }

    /**
     * Define o valor da propriedade sourceSystemReferenceValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceSystemReferenceValue(JAXBElement<String> value) {
        this.sourceSystemReferenceValue = value;
    }

    /**
     * Obtém o valor da propriedade organizationName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Define o valor da propriedade organizationName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Obtém o valor da propriedade uniqueNameSuffix.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUniqueNameSuffix() {
        return uniqueNameSuffix;
    }

    /**
     * Define o valor da propriedade uniqueNameSuffix.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUniqueNameSuffix(JAXBElement<String> value) {
        this.uniqueNameSuffix = value;
    }

    /**
     * Obtém o valor da propriedade partyUniqueName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyUniqueName() {
        return partyUniqueName;
    }

    /**
     * Define o valor da propriedade partyUniqueName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyUniqueName(String value) {
        this.partyUniqueName = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType(JAXBElement<String> value) {
        this.type = value;
    }

    /**
     * Obtém o valor da propriedade ownerPartyId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOwnerPartyId() {
        return ownerPartyId;
    }

    /**
     * Define o valor da propriedade ownerPartyId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOwnerPartyId(JAXBElement<Long> value) {
        this.ownerPartyId = value;
    }

    /**
     * Obtém o valor da propriedade ownerPartyNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerPartyNumber() {
        return ownerPartyNumber;
    }

    /**
     * Define o valor da propriedade ownerPartyNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerPartyNumber(String value) {
        this.ownerPartyNumber = value;
    }

    /**
     * Obtém o valor da propriedade ownerEmailAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerEmailAddress() {
        return ownerEmailAddress;
    }

    /**
     * Define o valor da propriedade ownerEmailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerEmailAddress(JAXBElement<String> value) {
        this.ownerEmailAddress = value;
    }

    /**
     * Obtém o valor da propriedade ownerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Define o valor da propriedade ownerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Obtém o valor da propriedade primaryContactPartyId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryContactPartyId() {
        return primaryContactPartyId;
    }

    /**
     * Define o valor da propriedade primaryContactPartyId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryContactPartyId(JAXBElement<Long> value) {
        this.primaryContactPartyId = value;
    }

    /**
     * Obtém o valor da propriedade primaryContactPartyNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactPartyNumber() {
        return primaryContactPartyNumber;
    }

    /**
     * Define o valor da propriedade primaryContactPartyNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactPartyNumber(JAXBElement<String> value) {
        this.primaryContactPartyNumber = value;
    }

    /**
     * Obtém o valor da propriedade primaryContactSourceSystem.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactSourceSystem() {
        return primaryContactSourceSystem;
    }

    /**
     * Define o valor da propriedade primaryContactSourceSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactSourceSystem(JAXBElement<String> value) {
        this.primaryContactSourceSystem = value;
    }

    /**
     * Obtém o valor da propriedade primaryContactSourceSystemReferenceValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactSourceSystemReferenceValue() {
        return primaryContactSourceSystemReferenceValue;
    }

    /**
     * Define o valor da propriedade primaryContactSourceSystemReferenceValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactSourceSystemReferenceValue(JAXBElement<String> value) {
        this.primaryContactSourceSystemReferenceValue = value;
    }

    /**
     * Obtém o valor da propriedade primaryContactName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactName() {
        return primaryContactName;
    }

    /**
     * Define o valor da propriedade primaryContactName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactName(JAXBElement<String> value) {
        this.primaryContactName = value;
    }

    /**
     * Obtém o valor da propriedade primaryContactEmail.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactEmail() {
        return primaryContactEmail;
    }

    /**
     * Define o valor da propriedade primaryContactEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactEmail(JAXBElement<String> value) {
        this.primaryContactEmail = value;
    }

    /**
     * Obtém o valor da propriedade primaryContactPhone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactPhone() {
        return primaryContactPhone;
    }

    /**
     * Define o valor da propriedade primaryContactPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactPhone(JAXBElement<String> value) {
        this.primaryContactPhone = value;
    }

    /**
     * Obtém o valor da propriedade existingCustomerFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getExistingCustomerFlag() {
        return existingCustomerFlag;
    }

    /**
     * Define o valor da propriedade existingCustomerFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setExistingCustomerFlag(JAXBElement<Boolean> value) {
        this.existingCustomerFlag = value;
    }

    /**
     * Obtém o valor da propriedade existingCustomerFlagLastUpdateDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExistingCustomerFlagLastUpdateDate() {
        return existingCustomerFlagLastUpdateDate;
    }

    /**
     * Define o valor da propriedade existingCustomerFlagLastUpdateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExistingCustomerFlagLastUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.existingCustomerFlagLastUpdateDate = value;
    }

    /**
     * Obtém o valor da propriedade namedFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNamedFlag() {
        return namedFlag;
    }

    /**
     * Define o valor da propriedade namedFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNamedFlag(JAXBElement<Boolean> value) {
        this.namedFlag = value;
    }

    /**
     * Obtém o valor da propriedade lastAssignmentDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastAssignmentDate() {
        return lastAssignmentDate;
    }

    /**
     * Define o valor da propriedade lastAssignmentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastAssignmentDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastAssignmentDate = value;
    }

    /**
     * Obtém o valor da propriedade lastAssignmentDateTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastAssignmentDateTime() {
        return lastAssignmentDateTime;
    }

    /**
     * Define o valor da propriedade lastAssignmentDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastAssignmentDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastAssignmentDateTime = value;
    }

    /**
     * Obtém o valor da propriedade assignmentExceptionFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAssignmentExceptionFlag() {
        return assignmentExceptionFlag;
    }

    /**
     * Define o valor da propriedade assignmentExceptionFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAssignmentExceptionFlag(JAXBElement<Boolean> value) {
        this.assignmentExceptionFlag = value;
    }

    /**
     * Obtém o valor da propriedade salesProfileStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesProfileStatus() {
        return salesProfileStatus;
    }

    /**
     * Define o valor da propriedade salesProfileStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesProfileStatus(JAXBElement<String> value) {
        this.salesProfileStatus = value;
    }

    /**
     * Obtém o valor da propriedade industryCodeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndustryCodeType() {
        return industryCodeType;
    }

    /**
     * Define o valor da propriedade industryCodeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndustryCodeType(JAXBElement<String> value) {
        this.industryCodeType = value;
    }

    /**
     * Obtém o valor da propriedade industryCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndustryCode() {
        return industryCode;
    }

    /**
     * Define o valor da propriedade industryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndustryCode(JAXBElement<String> value) {
        this.industryCode = value;
    }

    /**
     * Obtém o valor da propriedade parentAccountPartyId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getParentAccountPartyId() {
        return parentAccountPartyId;
    }

    /**
     * Define o valor da propriedade parentAccountPartyId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setParentAccountPartyId(JAXBElement<Long> value) {
        this.parentAccountPartyId = value;
    }

    /**
     * Obtém o valor da propriedade parentAccountPartyNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentAccountPartyNumber() {
        return parentAccountPartyNumber;
    }

    /**
     * Define o valor da propriedade parentAccountPartyNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentAccountPartyNumber(JAXBElement<String> value) {
        this.parentAccountPartyNumber = value;
    }

    /**
     * Obtém o valor da propriedade parentAccountSourceSystem.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentAccountSourceSystem() {
        return parentAccountSourceSystem;
    }

    /**
     * Define o valor da propriedade parentAccountSourceSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentAccountSourceSystem(JAXBElement<String> value) {
        this.parentAccountSourceSystem = value;
    }

    /**
     * Obtém o valor da propriedade parentAccountSourceSystemReferenceValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentAccountSourceSystemReferenceValue() {
        return parentAccountSourceSystemReferenceValue;
    }

    /**
     * Define o valor da propriedade parentAccountSourceSystemReferenceValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentAccountSourceSystemReferenceValue(JAXBElement<String> value) {
        this.parentAccountSourceSystemReferenceValue = value;
    }

    /**
     * Obtém o valor da propriedade yearEstablished.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getYearEstablished() {
        return yearEstablished;
    }

    /**
     * Define o valor da propriedade yearEstablished.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setYearEstablished(JAXBElement<Integer> value) {
        this.yearEstablished = value;
    }

    /**
     * Obtém o valor da propriedade controlYear.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getControlYear() {
        return controlYear;
    }

    /**
     * Define o valor da propriedade controlYear.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setControlYear(JAXBElement<BigDecimal> value) {
        this.controlYear = value;
    }

    /**
     * Obtém o valor da propriedade yearIncorporated.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getYearIncorporated() {
        return yearIncorporated;
    }

    /**
     * Define o valor da propriedade yearIncorporated.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setYearIncorporated(JAXBElement<Integer> value) {
        this.yearIncorporated = value;
    }

    /**
     * Obtém o valor da propriedade stockSymbol.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStockSymbol() {
        return stockSymbol;
    }

    /**
     * Define o valor da propriedade stockSymbol.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStockSymbol(JAXBElement<String> value) {
        this.stockSymbol = value;
    }

    /**
     * Obtém o valor da propriedade fiscalYearendMonth.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiscalYearendMonth() {
        return fiscalYearendMonth;
    }

    /**
     * Define o valor da propriedade fiscalYearendMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiscalYearendMonth(JAXBElement<String> value) {
        this.fiscalYearendMonth = value;
    }

    /**
     * Obtém o valor da propriedade currentFiscalYearPotentialRevenueAmount.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getCurrentFiscalYearPotentialRevenueAmount() {
        return currentFiscalYearPotentialRevenueAmount;
    }

    /**
     * Define o valor da propriedade currentFiscalYearPotentialRevenueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setCurrentFiscalYearPotentialRevenueAmount(JAXBElement<AmountType> value) {
        this.currentFiscalYearPotentialRevenueAmount = value;
    }

    /**
     * Obtém o valor da propriedade preferredFunctionalCurrency.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredFunctionalCurrency() {
        return preferredFunctionalCurrency;
    }

    /**
     * Define o valor da propriedade preferredFunctionalCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredFunctionalCurrency(JAXBElement<String> value) {
        this.preferredFunctionalCurrency = value;
    }

    /**
     * Obtém o valor da propriedade analysisFiscalYear.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnalysisFiscalYear() {
        return analysisFiscalYear;
    }

    /**
     * Define o valor da propriedade analysisFiscalYear.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnalysisFiscalYear(JAXBElement<String> value) {
        this.analysisFiscalYear = value;
    }

    /**
     * Obtém o valor da propriedade nextFiscalYearPotentialRevenueAmount.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getNextFiscalYearPotentialRevenueAmount() {
        return nextFiscalYearPotentialRevenueAmount;
    }

    /**
     * Define o valor da propriedade nextFiscalYearPotentialRevenueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setNextFiscalYearPotentialRevenueAmount(JAXBElement<AmountType> value) {
        this.nextFiscalYearPotentialRevenueAmount = value;
    }

    /**
     * Obtém o valor da propriedade totalPaymentAmount.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    /**
     * Define o valor da propriedade totalPaymentAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setTotalPaymentAmount(JAXBElement<AmountType> value) {
        this.totalPaymentAmount = value;
    }

    /**
     * Obtém o valor da propriedade taxpayerIdentificationNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxpayerIdentificationNumber() {
        return taxpayerIdentificationNumber;
    }

    /**
     * Define o valor da propriedade taxpayerIdentificationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxpayerIdentificationNumber(JAXBElement<String> value) {
        this.taxpayerIdentificationNumber = value;
    }

    /**
     * Obtém o valor da propriedade certificationLevel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCertificationLevel() {
        return certificationLevel;
    }

    /**
     * Define o valor da propriedade certificationLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCertificationLevel(JAXBElement<String> value) {
        this.certificationLevel = value;
    }

    /**
     * Obtém o valor da propriedade certificationReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCertificationReasonCode() {
        return certificationReasonCode;
    }

    /**
     * Define o valor da propriedade certificationReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCertificationReasonCode(JAXBElement<String> value) {
        this.certificationReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade dunsNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Define o valor da propriedade dunsNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDUNSNumber(JAXBElement<String> value) {
        this.dunsNumber = value;
    }

    /**
     * Obtém o valor da propriedade dunsCreditRating.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDUNSCreditRating() {
        return dunsCreditRating;
    }

    /**
     * Define o valor da propriedade dunsCreditRating.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDUNSCreditRating(JAXBElement<String> value) {
        this.dunsCreditRating = value;
    }

    /**
     * Obtém o valor da propriedade parentDUNSNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentDUNSNumber() {
        return parentDUNSNumber;
    }

    /**
     * Define o valor da propriedade parentDUNSNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentDUNSNumber(JAXBElement<String> value) {
        this.parentDUNSNumber = value;
    }

    /**
     * Obtém o valor da propriedade domesticUltimateDUNSNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDomesticUltimateDUNSNumber() {
        return domesticUltimateDUNSNumber;
    }

    /**
     * Define o valor da propriedade domesticUltimateDUNSNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDomesticUltimateDUNSNumber(JAXBElement<String> value) {
        this.domesticUltimateDUNSNumber = value;
    }

    /**
     * Obtém o valor da propriedade globalUltimateDUNSNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalUltimateDUNSNumber() {
        return globalUltimateDUNSNumber;
    }

    /**
     * Define o valor da propriedade globalUltimateDUNSNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalUltimateDUNSNumber(JAXBElement<String> value) {
        this.globalUltimateDUNSNumber = value;
    }

    /**
     * Obtém o valor da propriedade ceoName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCEOName() {
        return ceoName;
    }

    /**
     * Define o valor da propriedade ceoName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCEOName(JAXBElement<String> value) {
        this.ceoName = value;
    }

    /**
     * Obtém o valor da propriedade ceoTitle.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCEOTitle() {
        return ceoTitle;
    }

    /**
     * Define o valor da propriedade ceoTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCEOTitle(JAXBElement<String> value) {
        this.ceoTitle = value;
    }

    /**
     * Obtém o valor da propriedade publicPrivateOwnershipFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPublicPrivateOwnershipFlag() {
        return publicPrivateOwnershipFlag;
    }

    /**
     * Define o valor da propriedade publicPrivateOwnershipFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPublicPrivateOwnershipFlag(JAXBElement<Boolean> value) {
        this.publicPrivateOwnershipFlag = value;
    }

    /**
     * Obtém o valor da propriedade importIndicator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImportIndicator() {
        return importIndicator;
    }

    /**
     * Define o valor da propriedade importIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImportIndicator(JAXBElement<String> value) {
        this.importIndicator = value;
    }

    /**
     * Obtém o valor da propriedade exportIndicator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExportIndicator() {
        return exportIndicator;
    }

    /**
     * Define o valor da propriedade exportIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExportIndicator(JAXBElement<String> value) {
        this.exportIndicator = value;
    }

    /**
     * Obtém o valor da propriedade smallBusinessIndicator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSmallBusinessIndicator() {
        return smallBusinessIndicator;
    }

    /**
     * Define o valor da propriedade smallBusinessIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSmallBusinessIndicator(JAXBElement<String> value) {
        this.smallBusinessIndicator = value;
    }

    /**
     * Obtém o valor da propriedade womanOwnedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWomanOwnedIndicator() {
        return womanOwnedIndicator;
    }

    /**
     * Define o valor da propriedade womanOwnedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWomanOwnedIndicator(JAXBElement<String> value) {
        this.womanOwnedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade generalServicesAdministrationFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGeneralServicesAdministrationFlag() {
        return generalServicesAdministrationFlag;
    }

    /**
     * Define o valor da propriedade generalServicesAdministrationFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGeneralServicesAdministrationFlag(JAXBElement<Boolean> value) {
        this.generalServicesAdministrationFlag = value;
    }

    /**
     * Obtém o valor da propriedade minorityOwnedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinorityOwnedIndicator() {
        return minorityOwnedIndicator;
    }

    /**
     * Define o valor da propriedade minorityOwnedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinorityOwnedIndicator(JAXBElement<String> value) {
        this.minorityOwnedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade minorityOwnedType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinorityOwnedType() {
        return minorityOwnedType;
    }

    /**
     * Define o valor da propriedade minorityOwnedType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinorityOwnedType(JAXBElement<String> value) {
        this.minorityOwnedType = value;
    }

    /**
     * Obtém o valor da propriedade rentOrOwnIndicator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRentOrOwnIndicator() {
        return rentOrOwnIndicator;
    }

    /**
     * Define o valor da propriedade rentOrOwnIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRentOrOwnIndicator(JAXBElement<String> value) {
        this.rentOrOwnIndicator = value;
    }

    /**
     * Obtém o valor da propriedade laborSurplusIndicator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLaborSurplusIndicator() {
        return laborSurplusIndicator;
    }

    /**
     * Define o valor da propriedade laborSurplusIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLaborSurplusIndicator(JAXBElement<String> value) {
        this.laborSurplusIndicator = value;
    }

    /**
     * Obtém o valor da propriedade outOfBusinessIndicator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutOfBusinessIndicator() {
        return outOfBusinessIndicator;
    }

    /**
     * Define o valor da propriedade outOfBusinessIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutOfBusinessIndicator(JAXBElement<String> value) {
        this.outOfBusinessIndicator = value;
    }

    /**
     * Obtém o valor da propriedade hqBranchIndicator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHQBranchIndicator() {
        return hqBranchIndicator;
    }

    /**
     * Define o valor da propriedade hqBranchIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHQBranchIndicator(JAXBElement<String> value) {
        this.hqBranchIndicator = value;
    }

    /**
     * Obtém o valor da propriedade parentOrSubsidiaryIndicator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentOrSubsidiaryIndicator() {
        return parentOrSubsidiaryIndicator;
    }

    /**
     * Define o valor da propriedade parentOrSubsidiaryIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentOrSubsidiaryIndicator(JAXBElement<String> value) {
        this.parentOrSubsidiaryIndicator = value;
    }

    /**
     * Obtém o valor da propriedade disadvantageIndicator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisadvantageIndicator() {
        return disadvantageIndicator;
    }

    /**
     * Define o valor da propriedade disadvantageIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisadvantageIndicator(JAXBElement<String> value) {
        this.disadvantageIndicator = value;
    }

    /**
     * Obtém o valor da propriedade employeesAtPrimaryAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeesAtPrimaryAddress() {
        return employeesAtPrimaryAddress;
    }

    /**
     * Define o valor da propriedade employeesAtPrimaryAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeesAtPrimaryAddress(JAXBElement<String> value) {
        this.employeesAtPrimaryAddress = value;
    }

    /**
     * Obtém o valor da propriedade employeesAtPrimaryAddressEstimation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeesAtPrimaryAddressEstimation() {
        return employeesAtPrimaryAddressEstimation;
    }

    /**
     * Define o valor da propriedade employeesAtPrimaryAddressEstimation.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeesAtPrimaryAddressEstimation(JAXBElement<String> value) {
        this.employeesAtPrimaryAddressEstimation = value;
    }

    /**
     * Obtém o valor da propriedade employeesAtPrimaryAddressMinimum.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeesAtPrimaryAddressMinimum() {
        return employeesAtPrimaryAddressMinimum;
    }

    /**
     * Define o valor da propriedade employeesAtPrimaryAddressMinimum.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeesAtPrimaryAddressMinimum(JAXBElement<String> value) {
        this.employeesAtPrimaryAddressMinimum = value;
    }

    /**
     * Obtém o valor da propriedade employeesAtPrimaryAddressText.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeesAtPrimaryAddressText() {
        return employeesAtPrimaryAddressText;
    }

    /**
     * Define o valor da propriedade employeesAtPrimaryAddressText.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeesAtPrimaryAddressText(JAXBElement<String> value) {
        this.employeesAtPrimaryAddressText = value;
    }

    /**
     * Obtém o valor da propriedade employeesTotal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEmployeesTotal() {
        return employeesTotal;
    }

    /**
     * Define o valor da propriedade employeesTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEmployeesTotal(JAXBElement<BigDecimal> value) {
        this.employeesTotal = value;
    }

    /**
     * Obtém o valor da propriedade totalEmployeesEstimatedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalEmployeesEstimatedIndicator() {
        return totalEmployeesEstimatedIndicator;
    }

    /**
     * Define o valor da propriedade totalEmployeesEstimatedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalEmployeesEstimatedIndicator(JAXBElement<String> value) {
        this.totalEmployeesEstimatedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade totalEmployeesIndicator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalEmployeesIndicator() {
        return totalEmployeesIndicator;
    }

    /**
     * Define o valor da propriedade totalEmployeesIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalEmployeesIndicator(JAXBElement<String> value) {
        this.totalEmployeesIndicator = value;
    }

    /**
     * Obtém o valor da propriedade totalEmployeesMinimumIndicator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalEmployeesMinimumIndicator() {
        return totalEmployeesMinimumIndicator;
    }

    /**
     * Define o valor da propriedade totalEmployeesMinimumIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalEmployeesMinimumIndicator(JAXBElement<String> value) {
        this.totalEmployeesMinimumIndicator = value;
    }

    /**
     * Obtém o valor da propriedade totalEmployeesText.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalEmployeesText() {
        return totalEmployeesText;
    }

    /**
     * Define o valor da propriedade totalEmployeesText.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalEmployeesText(JAXBElement<String> value) {
        this.totalEmployeesText = value;
    }

    /**
     * Obtém o valor da propriedade organizationSize.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationSize() {
        return organizationSize;
    }

    /**
     * Define o valor da propriedade organizationSize.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationSize(JAXBElement<String> value) {
        this.organizationSize = value;
    }

    /**
     * Obtém o valor da propriedade organizationType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationType() {
        return organizationType;
    }

    /**
     * Define o valor da propriedade organizationType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationType(JAXBElement<String> value) {
        this.organizationType = value;
    }

    /**
     * Obtém o valor da propriedade principalTitle.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrincipalTitle() {
        return principalTitle;
    }

    /**
     * Define o valor da propriedade principalTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrincipalTitle(JAXBElement<String> value) {
        this.principalTitle = value;
    }

    /**
     * Obtém o valor da propriedade principalName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrincipalName() {
        return principalName;
    }

    /**
     * Define o valor da propriedade principalName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrincipalName(JAXBElement<String> value) {
        this.principalName = value;
    }

    /**
     * Obtém o valor da propriedade legalStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegalStatus() {
        return legalStatus;
    }

    /**
     * Define o valor da propriedade legalStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegalStatus(JAXBElement<String> value) {
        this.legalStatus = value;
    }

    /**
     * Obtém o valor da propriedade businessScope.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessScope() {
        return businessScope;
    }

    /**
     * Define o valor da propriedade businessScope.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessScope(JAXBElement<String> value) {
        this.businessScope = value;
    }

    /**
     * Obtém o valor da propriedade registrationType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationType() {
        return registrationType;
    }

    /**
     * Define o valor da propriedade registrationType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationType(JAXBElement<String> value) {
        this.registrationType = value;
    }

    /**
     * Obtém o valor da propriedade missionStatement.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMissionStatement() {
        return missionStatement;
    }

    /**
     * Define o valor da propriedade missionStatement.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMissionStatement(JAXBElement<String> value) {
        this.missionStatement = value;
    }

    /**
     * Obtém o valor da propriedade corporationClass.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorporationClass() {
        return corporationClass;
    }

    /**
     * Define o valor da propriedade corporationClass.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorporationClass(JAXBElement<String> value) {
        this.corporationClass = value;
    }

    /**
     * Obtém o valor da propriedade growthStrategyDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGrowthStrategyDescription() {
        return growthStrategyDescription;
    }

    /**
     * Define o valor da propriedade growthStrategyDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGrowthStrategyDescription(JAXBElement<String> value) {
        this.growthStrategyDescription = value;
    }

    /**
     * Obtém o valor da propriedade congressionalDistrictCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCongressionalDistrictCode() {
        return congressionalDistrictCode;
    }

    /**
     * Define o valor da propriedade congressionalDistrictCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCongressionalDistrictCode(JAXBElement<String> value) {
        this.congressionalDistrictCode = value;
    }

    /**
     * Obtém o valor da propriedade lineOfBusiness.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineOfBusiness() {
        return lineOfBusiness;
    }

    /**
     * Define o valor da propriedade lineOfBusiness.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineOfBusiness(JAXBElement<String> value) {
        this.lineOfBusiness = value;
    }

    /**
     * Obtém o valor da propriedade homeCountry.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHomeCountry() {
        return homeCountry;
    }

    /**
     * Define o valor da propriedade homeCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHomeCountry(JAXBElement<String> value) {
        this.homeCountry = value;
    }

    /**
     * Obtém o valor da propriedade doNotConfuseWith.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoNotConfuseWith() {
        return doNotConfuseWith;
    }

    /**
     * Define o valor da propriedade doNotConfuseWith.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoNotConfuseWith(JAXBElement<String> value) {
        this.doNotConfuseWith = value;
    }

    /**
     * Obtém o valor da propriedade localActivityCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalActivityCode() {
        return localActivityCode;
    }

    /**
     * Define o valor da propriedade localActivityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalActivityCode(JAXBElement<String> value) {
        this.localActivityCode = value;
    }

    /**
     * Obtém o valor da propriedade localActivityCodeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalActivityCodeType() {
        return localActivityCodeType;
    }

    /**
     * Define o valor da propriedade localActivityCodeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalActivityCodeType(JAXBElement<String> value) {
        this.localActivityCodeType = value;
    }

    /**
     * Obtém o valor da propriedade localBusinessIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalBusinessIdentifier() {
        return localBusinessIdentifier;
    }

    /**
     * Define o valor da propriedade localBusinessIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalBusinessIdentifier(JAXBElement<String> value) {
        this.localBusinessIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade localBusinessIdentifierType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalBusinessIdentifierType() {
        return localBusinessIdentifierType;
    }

    /**
     * Define o valor da propriedade localBusinessIdentifierType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalBusinessIdentifierType(JAXBElement<String> value) {
        this.localBusinessIdentifierType = value;
    }

    /**
     * Obtém o valor da propriedade siebelLocation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiebelLocation() {
        return siebelLocation;
    }

    /**
     * Define o valor da propriedade siebelLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiebelLocation(JAXBElement<String> value) {
        this.siebelLocation = value;
    }

    /**
     * Obtém o valor da propriedade comments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComments() {
        return comments;
    }

    /**
     * Define o valor da propriedade comments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComments(JAXBElement<String> value) {
        this.comments = value;
    }

    /**
     * Obtém o valor da propriedade businessReport.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getBusinessReport() {
        return businessReport;
    }

    /**
     * Define o valor da propriedade businessReport.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setBusinessReport(JAXBElement<byte[]> value) {
        this.businessReport = value;
    }

    /**
     * Obtém o valor da propriedade currencyCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Define o valor da propriedade currencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = value;
    }

    /**
     * Obtém o valor da propriedade curcyConvRateType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurcyConvRateType() {
        return curcyConvRateType;
    }

    /**
     * Define o valor da propriedade curcyConvRateType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurcyConvRateType(JAXBElement<String> value) {
        this.curcyConvRateType = value;
    }

    /**
     * Obtém o valor da propriedade corpCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorpCurrencyCode() {
        return corpCurrencyCode;
    }

    /**
     * Define o valor da propriedade corpCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorpCurrencyCode(JAXBElement<String> value) {
        this.corpCurrencyCode = value;
    }

    /**
     * Obtém o valor da propriedade dataCloudStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataCloudStatus() {
        return dataCloudStatus;
    }

    /**
     * Define o valor da propriedade dataCloudStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataCloudStatus(JAXBElement<String> value) {
        this.dataCloudStatus = value;
    }

    /**
     * Obtém o valor da propriedade lastEnrichmentDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastEnrichmentDate() {
        return lastEnrichmentDate;
    }

    /**
     * Define o valor da propriedade lastEnrichmentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastEnrichmentDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastEnrichmentDate = value;
    }

    /**
     * Obtém o valor da propriedade partyStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyStatus() {
        return partyStatus;
    }

    /**
     * Define o valor da propriedade partyStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyStatus(String value) {
        this.partyStatus = value;
    }

    /**
     * Obtém o valor da propriedade createdByModule.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedByModule() {
        return createdByModule;
    }

    /**
     * Define o valor da propriedade createdByModule.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedByModule(JAXBElement<String> value) {
        this.createdByModule = value;
    }

    /**
     * Obtém o valor da propriedade createdBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Define o valor da propriedade createdBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Obtém o valor da propriedade creationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Define o valor da propriedade creationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Obtém o valor da propriedade lastUpdateDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Define o valor da propriedade lastUpdateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Obtém o valor da propriedade lastUpdateLogin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    /**
     * Define o valor da propriedade lastUpdateLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdateLogin(JAXBElement<String> value) {
        this.lastUpdateLogin = value;
    }

    /**
     * Obtém o valor da propriedade lastUpdatedBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Define o valor da propriedade lastUpdatedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedBy(String value) {
        this.lastUpdatedBy = value;
    }

    /**
     * Obtém o valor da propriedade preferredContactMethod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredContactMethod() {
        return preferredContactMethod;
    }

    /**
     * Define o valor da propriedade preferredContactMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredContactMethod(JAXBElement<String> value) {
        this.preferredContactMethod = value;
    }

    /**
     * Obtém o valor da propriedade phoneCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneCountryCode() {
        return phoneCountryCode;
    }

    /**
     * Define o valor da propriedade phoneCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneCountryCode(JAXBElement<String> value) {
        this.phoneCountryCode = value;
    }

    /**
     * Obtém o valor da propriedade phoneAreaCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneAreaCode() {
        return phoneAreaCode;
    }

    /**
     * Define o valor da propriedade phoneAreaCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneAreaCode(JAXBElement<String> value) {
        this.phoneAreaCode = value;
    }

    /**
     * Obtém o valor da propriedade phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Define o valor da propriedade phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneNumber(JAXBElement<String> value) {
        this.phoneNumber = value;
    }

    /**
     * Obtém o valor da propriedade phoneExtension.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneExtension() {
        return phoneExtension;
    }

    /**
     * Define o valor da propriedade phoneExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneExtension(JAXBElement<String> value) {
        this.phoneExtension = value;
    }

    /**
     * Obtém o valor da propriedade formattedPhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormattedPhoneNumber() {
        return formattedPhoneNumber;
    }

    /**
     * Define o valor da propriedade formattedPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormattedPhoneNumber(JAXBElement<String> value) {
        this.formattedPhoneNumber = value;
    }

    /**
     * Obtém o valor da propriedade faxCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxCountryCode() {
        return faxCountryCode;
    }

    /**
     * Define o valor da propriedade faxCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxCountryCode(JAXBElement<String> value) {
        this.faxCountryCode = value;
    }

    /**
     * Obtém o valor da propriedade faxAreaCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxAreaCode() {
        return faxAreaCode;
    }

    /**
     * Define o valor da propriedade faxAreaCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxAreaCode(JAXBElement<String> value) {
        this.faxAreaCode = value;
    }

    /**
     * Obtém o valor da propriedade faxNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxNumber() {
        return faxNumber;
    }

    /**
     * Define o valor da propriedade faxNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxNumber(JAXBElement<String> value) {
        this.faxNumber = value;
    }

    /**
     * Obtém o valor da propriedade faxExtension.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxExtension() {
        return faxExtension;
    }

    /**
     * Define o valor da propriedade faxExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxExtension(JAXBElement<String> value) {
        this.faxExtension = value;
    }

    /**
     * Obtém o valor da propriedade formattedFaxNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormattedFaxNumber() {
        return formattedFaxNumber;
    }

    /**
     * Define o valor da propriedade formattedFaxNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormattedFaxNumber(JAXBElement<String> value) {
        this.formattedFaxNumber = value;
    }

    /**
     * Obtém o valor da propriedade emailFormat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailFormat() {
        return emailFormat;
    }

    /**
     * Define o valor da propriedade emailFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailFormat(JAXBElement<String> value) {
        this.emailFormat = value;
    }

    /**
     * Obtém o valor da propriedade emailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Define o valor da propriedade emailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Obtém o valor da propriedade url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Define o valor da propriedade url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Obtém o valor da propriedade recordSet.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecordSet() {
        return recordSet;
    }

    /**
     * Define o valor da propriedade recordSet.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecordSet(JAXBElement<String> value) {
        this.recordSet = value;
    }

    /**
     * Obtém o valor da propriedade favoriteAccountFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFavoriteAccountFlag() {
        return favoriteAccountFlag;
    }

    /**
     * Define o valor da propriedade favoriteAccountFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFavoriteAccountFlag(JAXBElement<Boolean> value) {
        this.favoriteAccountFlag = value;
    }

    /**
     * Obtém o valor da propriedade primaryAddress.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryAddress }
     *     
     */
    public PrimaryAddress getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Define o valor da propriedade primaryAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryAddress }
     *     
     */
    public void setPrimaryAddress(PrimaryAddress value) {
        this.primaryAddress = value;
    }

    /**
     * Gets the value of the salesTeamMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesTeamMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesTeamMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesTeamMember }
     * 
     * 
     */
    public List<SalesTeamMember> getSalesTeamMember() {
        if (salesTeamMember == null) {
            salesTeamMember = new ArrayList<SalesTeamMember>();
        }
        return this.salesTeamMember;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    public List<Note> getNote() {
        if (note == null) {
            note = new ArrayList<Note>();
        }
        return this.note;
    }

    /**
     * Obtém o valor da propriedade organizationDEONacionalidadeC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEONacionalidadeC() {
        return organizationDEONacionalidadeC;
    }

    /**
     * Define o valor da propriedade organizationDEONacionalidadeC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEONacionalidadeC(JAXBElement<String> value) {
        this.organizationDEONacionalidadeC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOPNEC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOPNEC() {
        return organizationDEOPNEC;
    }

    /**
     * Define o valor da propriedade organizationDEOPNEC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOPNEC(JAXBElement<String> value) {
        this.organizationDEOPNEC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOEstadoCivilC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOEstadoCivilC() {
        return organizationDEOEstadoCivilC;
    }

    /**
     * Define o valor da propriedade organizationDEOEstadoCivilC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOEstadoCivilC(JAXBElement<String> value) {
        this.organizationDEOEstadoCivilC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOPessoaFisJurC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOPessoaFisJurC() {
        return organizationDEOPessoaFisJurC;
    }

    /**
     * Define o valor da propriedade organizationDEOPessoaFisJurC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOPessoaFisJurC(JAXBElement<String> value) {
        this.organizationDEOPessoaFisJurC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOCpfC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOCpfC() {
        return organizationDEOCpfC;
    }

    /**
     * Define o valor da propriedade organizationDEOCpfC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOCpfC(JAXBElement<String> value) {
        this.organizationDEOCpfC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEORgC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEORgC() {
        return organizationDEORgC;
    }

    /**
     * Define o valor da propriedade organizationDEORgC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEORgC(JAXBElement<String> value) {
        this.organizationDEORgC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOApelidoC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOApelidoC() {
        return organizationDEOApelidoC;
    }

    /**
     * Define o valor da propriedade organizationDEOApelidoC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOApelidoC(JAXBElement<String> value) {
        this.organizationDEOApelidoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOEmpresaC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOEmpresaC() {
        return organizationDEOEmpresaC;
    }

    /**
     * Define o valor da propriedade organizationDEOEmpresaC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOEmpresaC(JAXBElement<String> value) {
        this.organizationDEOEmpresaC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOFaixaSalarialC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOFaixaSalarialC() {
        return organizationDEOFaixaSalarialC;
    }

    /**
     * Define o valor da propriedade organizationDEOFaixaSalarialC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOFaixaSalarialC(JAXBElement<String> value) {
        this.organizationDEOFaixaSalarialC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOFormacaoC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOFormacaoC() {
        return organizationDEOFormacaoC;
    }

    /**
     * Define o valor da propriedade organizationDEOFormacaoC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOFormacaoC(JAXBElement<String> value) {
        this.organizationDEOFormacaoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOProfissaoC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOProfissaoC() {
        return organizationDEOProfissaoC;
    }

    /**
     * Define o valor da propriedade organizationDEOProfissaoC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOProfissaoC(JAXBElement<String> value) {
        this.organizationDEOProfissaoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOPercepçãoSobreOClienteC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getOrganizationDEOPercepçãoSobreOClienteC() {
        return organizationDEOPercepçãoSobreOClienteC;
    }

    /**
     * Define o valor da propriedade organizationDEOPercepçãoSobreOClienteC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setOrganizationDEOPercepçãoSobreOClienteC(JAXBElement<byte[]> value) {
        this.organizationDEOPercepçãoSobreOClienteC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEONotifC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEONotifC() {
        return organizationDEONotifC;
    }

    /**
     * Define o valor da propriedade organizationDEONotifC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEONotifC(JAXBElement<String> value) {
        this.organizationDEONotifC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOConheceCliC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOConheceCliC() {
        return organizationDEOConheceCliC;
    }

    /**
     * Define o valor da propriedade organizationDEOConheceCliC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOConheceCliC(Boolean value) {
        this.organizationDEOConheceCliC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOFacebookC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOFacebookC() {
        return organizationDEOFacebookC;
    }

    /**
     * Define o valor da propriedade organizationDEOFacebookC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOFacebookC(Boolean value) {
        this.organizationDEOFacebookC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOIntagramC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOIntagramC() {
        return organizationDEOIntagramC;
    }

    /**
     * Define o valor da propriedade organizationDEOIntagramC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOIntagramC(Boolean value) {
        this.organizationDEOIntagramC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOWhatsRedeC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOWhatsRedeC() {
        return organizationDEOWhatsRedeC;
    }

    /**
     * Define o valor da propriedade organizationDEOWhatsRedeC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOWhatsRedeC(Boolean value) {
        this.organizationDEOWhatsRedeC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOLinkedInC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOLinkedInC() {
        return organizationDEOLinkedInC;
    }

    /**
     * Define o valor da propriedade organizationDEOLinkedInC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOLinkedInC(Boolean value) {
        this.organizationDEOLinkedInC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOOutraRedeC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOOutraRedeC() {
        return organizationDEOOutraRedeC;
    }

    /**
     * Define o valor da propriedade organizationDEOOutraRedeC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOOutraRedeC(Boolean value) {
        this.organizationDEOOutraRedeC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOUolC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOUolC() {
        return organizationDEOUolC;
    }

    /**
     * Define o valor da propriedade organizationDEOUolC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOUolC(Boolean value) {
        this.organizationDEOUolC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOYahooC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOYahooC() {
        return organizationDEOYahooC;
    }

    /**
     * Define o valor da propriedade organizationDEOYahooC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOYahooC(Boolean value) {
        this.organizationDEOYahooC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOGloboC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOGloboC() {
        return organizationDEOGloboC;
    }

    /**
     * Define o valor da propriedade organizationDEOGloboC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOGloboC(Boolean value) {
        this.organizationDEOGloboC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOR7C.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOR7C() {
        return organizationDEOR7C;
    }

    /**
     * Define o valor da propriedade organizationDEOR7C.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOR7C(Boolean value) {
        this.organizationDEOR7C = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOOutroPtlC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOOutroPtlC() {
        return organizationDEOOutroPtlC;
    }

    /**
     * Define o valor da propriedade organizationDEOOutroPtlC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOOutroPtlC(Boolean value) {
        this.organizationDEOOutroPtlC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOFutebolC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOFutebolC() {
        return organizationDEOFutebolC;
    }

    /**
     * Define o valor da propriedade organizationDEOFutebolC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOFutebolC(Boolean value) {
        this.organizationDEOFutebolC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOVoleiC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOVoleiC() {
        return organizationDEOVoleiC;
    }

    /**
     * Define o valor da propriedade organizationDEOVoleiC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOVoleiC(Boolean value) {
        this.organizationDEOVoleiC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOGolfeC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOGolfeC() {
        return organizationDEOGolfeC;
    }

    /**
     * Define o valor da propriedade organizationDEOGolfeC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOGolfeC(Boolean value) {
        this.organizationDEOGolfeC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOCorridaC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOCorridaC() {
        return organizationDEOCorridaC;
    }

    /**
     * Define o valor da propriedade organizationDEOCorridaC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOCorridaC(Boolean value) {
        this.organizationDEOCorridaC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOOutroEsporteC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOOutroEsporteC() {
        return organizationDEOOutroEsporteC;
    }

    /**
     * Define o valor da propriedade organizationDEOOutroEsporteC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOOutroEsporteC(Boolean value) {
        this.organizationDEOOutroEsporteC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOCorinthiansC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOCorinthiansC() {
        return organizationDEOCorinthiansC;
    }

    /**
     * Define o valor da propriedade organizationDEOCorinthiansC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOCorinthiansC(Boolean value) {
        this.organizationDEOCorinthiansC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOPalmeirasC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOPalmeirasC() {
        return organizationDEOPalmeirasC;
    }

    /**
     * Define o valor da propriedade organizationDEOPalmeirasC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOPalmeirasC(Boolean value) {
        this.organizationDEOPalmeirasC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOOutroTimeC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOOutroTimeC() {
        return organizationDEOOutroTimeC;
    }

    /**
     * Define o valor da propriedade organizationDEOOutroTimeC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOOutroTimeC(Boolean value) {
        this.organizationDEOOutroTimeC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOCinemaC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOCinemaC() {
        return organizationDEOCinemaC;
    }

    /**
     * Define o valor da propriedade organizationDEOCinemaC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOCinemaC(Boolean value) {
        this.organizationDEOCinemaC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOTeatroC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOTeatroC() {
        return organizationDEOTeatroC;
    }

    /**
     * Define o valor da propriedade organizationDEOTeatroC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOTeatroC(Boolean value) {
        this.organizationDEOTeatroC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOViagemC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOViagemC() {
        return organizationDEOViagemC;
    }

    /**
     * Define o valor da propriedade organizationDEOViagemC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOViagemC(Boolean value) {
        this.organizationDEOViagemC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOShowC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOShowC() {
        return organizationDEOShowC;
    }

    /**
     * Define o valor da propriedade organizationDEOShowC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOShowC(Boolean value) {
        this.organizationDEOShowC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOOutroPassatempoC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOOutroPassatempoC() {
        return organizationDEOOutroPassatempoC;
    }

    /**
     * Define o valor da propriedade organizationDEOOutroPassatempoC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOOutroPassatempoC(Boolean value) {
        this.organizationDEOOutroPassatempoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOItalianaC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOItalianaC() {
        return organizationDEOItalianaC;
    }

    /**
     * Define o valor da propriedade organizationDEOItalianaC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOItalianaC(Boolean value) {
        this.organizationDEOItalianaC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOEspanholaC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOEspanholaC() {
        return organizationDEOEspanholaC;
    }

    /**
     * Define o valor da propriedade organizationDEOEspanholaC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOEspanholaC(Boolean value) {
        this.organizationDEOEspanholaC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOJaponesaC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOJaponesaC() {
        return organizationDEOJaponesaC;
    }

    /**
     * Define o valor da propriedade organizationDEOJaponesaC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOJaponesaC(Boolean value) {
        this.organizationDEOJaponesaC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOArabeC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOArabeC() {
        return organizationDEOArabeC;
    }

    /**
     * Define o valor da propriedade organizationDEOArabeC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOArabeC(Boolean value) {
        this.organizationDEOArabeC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOOutraComidaC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOOutraComidaC() {
        return organizationDEOOutraComidaC;
    }

    /**
     * Define o valor da propriedade organizationDEOOutraComidaC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOOutraComidaC(Boolean value) {
        this.organizationDEOOutraComidaC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOSucoC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOSucoC() {
        return organizationDEOSucoC;
    }

    /**
     * Define o valor da propriedade organizationDEOSucoC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOSucoC(Boolean value) {
        this.organizationDEOSucoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOCervejaC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOCervejaC() {
        return organizationDEOCervejaC;
    }

    /**
     * Define o valor da propriedade organizationDEOCervejaC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOCervejaC(Boolean value) {
        this.organizationDEOCervejaC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOWhiskyC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOWhiskyC() {
        return organizationDEOWhiskyC;
    }

    /**
     * Define o valor da propriedade organizationDEOWhiskyC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOWhiskyC(Boolean value) {
        this.organizationDEOWhiskyC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOOutraBebidaC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOOutraBebidaC() {
        return organizationDEOOutraBebidaC;
    }

    /**
     * Define o valor da propriedade organizationDEOOutraBebidaC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOOutraBebidaC(Boolean value) {
        this.organizationDEOOutraBebidaC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOClassicaC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOClassicaC() {
        return organizationDEOClassicaC;
    }

    /**
     * Define o valor da propriedade organizationDEOClassicaC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOClassicaC(Boolean value) {
        this.organizationDEOClassicaC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOJazzC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOJazzC() {
        return organizationDEOJazzC;
    }

    /**
     * Define o valor da propriedade organizationDEOJazzC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOJazzC(Boolean value) {
        this.organizationDEOJazzC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEORockC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEORockC() {
        return organizationDEORockC;
    }

    /**
     * Define o valor da propriedade organizationDEORockC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEORockC(Boolean value) {
        this.organizationDEORockC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOMpbC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOMpbC() {
        return organizationDEOMpbC;
    }

    /**
     * Define o valor da propriedade organizationDEOMpbC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOMpbC(Boolean value) {
        this.organizationDEOMpbC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOOutroestilomusicalC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOOutroestilomusicalC() {
        return organizationDEOOutroestilomusicalC;
    }

    /**
     * Define o valor da propriedade organizationDEOOutroestilomusicalC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOOutroestilomusicalC(Boolean value) {
        this.organizationDEOOutroestilomusicalC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOPossuianimaldeestimacaoC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOPossuianimaldeestimacaoC() {
        return organizationDEOPossuianimaldeestimacaoC;
    }

    /**
     * Define o valor da propriedade organizationDEOPossuianimaldeestimacaoC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOPossuianimaldeestimacaoC(Boolean value) {
        this.organizationDEOPossuianimaldeestimacaoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOTelefoneC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOTelefoneC() {
        return organizationDEOTelefoneC;
    }

    /**
     * Define o valor da propriedade organizationDEOTelefoneC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOTelefoneC(Boolean value) {
        this.organizationDEOTelefoneC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOEmailC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOEmailC() {
        return organizationDEOEmailC;
    }

    /**
     * Define o valor da propriedade organizationDEOEmailC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOEmailC(Boolean value) {
        this.organizationDEOEmailC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOWhatsContC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOWhatsContC() {
        return organizationDEOWhatsContC;
    }

    /**
     * Define o valor da propriedade organizationDEOWhatsContC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOWhatsContC(Boolean value) {
        this.organizationDEOWhatsContC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOOutroContC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOOutroContC() {
        return organizationDEOOutroContC;
    }

    /**
     * Define o valor da propriedade organizationDEOOutroContC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOOutroContC(Boolean value) {
        this.organizationDEOOutroContC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOReclameaquiC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOReclameaquiC() {
        return organizationDEOReclameaquiC;
    }

    /**
     * Define o valor da propriedade organizationDEOReclameaquiC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOReclameaquiC(Boolean value) {
        this.organizationDEOReclameaquiC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOFalecompresidenteC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOFalecompresidenteC() {
        return organizationDEOFalecompresidenteC;
    }

    /**
     * Define o valor da propriedade organizationDEOFalecompresidenteC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOFalecompresidenteC(Boolean value) {
        this.organizationDEOFalecompresidenteC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOQualRedeC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOQualRedeC() {
        return organizationDEOQualRedeC;
    }

    /**
     * Define o valor da propriedade organizationDEOQualRedeC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOQualRedeC(JAXBElement<String> value) {
        this.organizationDEOQualRedeC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOQualPtlC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOQualPtlC() {
        return organizationDEOQualPtlC;
    }

    /**
     * Define o valor da propriedade organizationDEOQualPtlC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOQualPtlC(JAXBElement<String> value) {
        this.organizationDEOQualPtlC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOQualEsptC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOQualEsptC() {
        return organizationDEOQualEsptC;
    }

    /**
     * Define o valor da propriedade organizationDEOQualEsptC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOQualEsptC(JAXBElement<String> value) {
        this.organizationDEOQualEsptC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOQualTimeC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOQualTimeC() {
        return organizationDEOQualTimeC;
    }

    /**
     * Define o valor da propriedade organizationDEOQualTimeC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOQualTimeC(JAXBElement<String> value) {
        this.organizationDEOQualTimeC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOQualPasstpC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOQualPasstpC() {
        return organizationDEOQualPasstpC;
    }

    /**
     * Define o valor da propriedade organizationDEOQualPasstpC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOQualPasstpC(JAXBElement<String> value) {
        this.organizationDEOQualPasstpC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOQualComidaC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOQualComidaC() {
        return organizationDEOQualComidaC;
    }

    /**
     * Define o valor da propriedade organizationDEOQualComidaC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOQualComidaC(JAXBElement<String> value) {
        this.organizationDEOQualComidaC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOQualBebidaC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOQualBebidaC() {
        return organizationDEOQualBebidaC;
    }

    /**
     * Define o valor da propriedade organizationDEOQualBebidaC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOQualBebidaC(JAXBElement<String> value) {
        this.organizationDEOQualBebidaC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOQualMusicaC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOQualMusicaC() {
        return organizationDEOQualMusicaC;
    }

    /**
     * Define o valor da propriedade organizationDEOQualMusicaC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOQualMusicaC(JAXBElement<String> value) {
        this.organizationDEOQualMusicaC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOQualCttC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOQualCttC() {
        return organizationDEOQualCttC;
    }

    /**
     * Define o valor da propriedade organizationDEOQualCttC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOQualCttC(JAXBElement<String> value) {
        this.organizationDEOQualCttC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOOutroContatoC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOOutroContatoC() {
        return organizationDEOOutroContatoC;
    }

    /**
     * Define o valor da propriedade organizationDEOOutroContatoC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOOutroContatoC(JAXBElement<String> value) {
        this.organizationDEOOutroContatoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOCnpjC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOCnpjC() {
        return organizationDEOCnpjC;
    }

    /**
     * Define o valor da propriedade organizationDEOCnpjC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOCnpjC(JAXBElement<String> value) {
        this.organizationDEOCnpjC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEORegimeCasamentoC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEORegimeCasamentoC() {
        return organizationDEORegimeCasamentoC;
    }

    /**
     * Define o valor da propriedade organizationDEORegimeCasamentoC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEORegimeCasamentoC(JAXBElement<String> value) {
        this.organizationDEORegimeCasamentoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOPactoCasamentoC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOPactoCasamentoC() {
        return organizationDEOPactoCasamentoC;
    }

    /**
     * Define o valor da propriedade organizationDEOPactoCasamentoC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOPactoCasamentoC(JAXBElement<String> value) {
        this.organizationDEOPactoCasamentoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEONomePaiC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEONomePaiC() {
        return organizationDEONomePaiC;
    }

    /**
     * Define o valor da propriedade organizationDEONomePaiC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEONomePaiC(JAXBElement<String> value) {
        this.organizationDEONomePaiC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEONomeMaeC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEONomeMaeC() {
        return organizationDEONomeMaeC;
    }

    /**
     * Define o valor da propriedade organizationDEONomeMaeC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEONomeMaeC(JAXBElement<String> value) {
        this.organizationDEONomeMaeC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOIdMegaC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOrganizationDEOIdMegaC() {
        return organizationDEOIdMegaC;
    }

    /**
     * Define o valor da propriedade organizationDEOIdMegaC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOrganizationDEOIdMegaC(JAXBElement<BigDecimal> value) {
        this.organizationDEOIdMegaC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEONumResC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEONumResC() {
        return organizationDEONumResC;
    }

    /**
     * Define o valor da propriedade organizationDEONumResC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEONumResC(JAXBElement<String> value) {
        this.organizationDEONumResC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEONumComC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEONumComC() {
        return organizationDEONumComC;
    }

    /**
     * Define o valor da propriedade organizationDEONumComC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEONumComC(JAXBElement<String> value) {
        this.organizationDEONumComC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOSaopauloC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOSaopauloC() {
        return organizationDEOSaopauloC;
    }

    /**
     * Define o valor da propriedade organizationDEOSaopauloC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOSaopauloC(Boolean value) {
        this.organizationDEOSaopauloC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOSantosC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOSantosC() {
        return organizationDEOSantosC;
    }

    /**
     * Define o valor da propriedade organizationDEOSantosC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOSantosC(Boolean value) {
        this.organizationDEOSantosC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEORestricaoAlimentarC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEORestricaoAlimentarC() {
        return organizationDEORestricaoAlimentarC;
    }

    /**
     * Define o valor da propriedade organizationDEORestricaoAlimentarC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEORestricaoAlimentarC(Boolean value) {
        this.organizationDEORestricaoAlimentarC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOQualRestricaoC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOQualRestricaoC() {
        return organizationDEOQualRestricaoC;
    }

    /**
     * Define o valor da propriedade organizationDEOQualRestricaoC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOQualRestricaoC(JAXBElement<String> value) {
        this.organizationDEOQualRestricaoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOVinhoC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOVinhoC() {
        return organizationDEOVinhoC;
    }

    /**
     * Define o valor da propriedade organizationDEOVinhoC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOVinhoC(Boolean value) {
        this.organizationDEOVinhoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOFinalidadeCompraC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOFinalidadeCompraC() {
        return organizationDEOFinalidadeCompraC;
    }

    /**
     * Define o valor da propriedade organizationDEOFinalidadeCompraC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOFinalidadeCompraC(JAXBElement<String> value) {
        this.organizationDEOFinalidadeCompraC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOCepComC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOCepComC() {
        return organizationDEOCepComC;
    }

    /**
     * Define o valor da propriedade organizationDEOCepComC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOCepComC(JAXBElement<String> value) {
        this.organizationDEOCepComC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOQualNeC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOQualNeC() {
        return organizationDEOQualNeC;
    }

    /**
     * Define o valor da propriedade organizationDEOQualNeC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOQualNeC(JAXBElement<String> value) {
        this.organizationDEOQualNeC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOGrauRelacaoC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOGrauRelacaoC() {
        return organizationDEOGrauRelacaoC;
    }

    /**
     * Define o valor da propriedade organizationDEOGrauRelacaoC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOGrauRelacaoC(JAXBElement<String> value) {
        this.organizationDEOGrauRelacaoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOQualInvestimentoC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOQualInvestimentoC() {
        return organizationDEOQualInvestimentoC;
    }

    /**
     * Define o valor da propriedade organizationDEOQualInvestimentoC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOQualInvestimentoC(JAXBElement<String> value) {
        this.organizationDEOQualInvestimentoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOBairroResC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOBairroResC() {
        return organizationDEOBairroResC;
    }

    /**
     * Define o valor da propriedade organizationDEOBairroResC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOBairroResC(JAXBElement<String> value) {
        this.organizationDEOBairroResC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOTagC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOTagC() {
        return organizationDEOTagC;
    }

    /**
     * Define o valor da propriedade organizationDEOTagC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOTagC(JAXBElement<String> value) {
        this.organizationDEOTagC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOPontuacaoC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOrganizationDEOPontuacaoC() {
        return organizationDEOPontuacaoC;
    }

    /**
     * Define o valor da propriedade organizationDEOPontuacaoC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOrganizationDEOPontuacaoC(JAXBElement<BigDecimal> value) {
        this.organizationDEOPontuacaoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOClassificacaoC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOClassificacaoC() {
        return organizationDEOClassificacaoC;
    }

    /**
     * Define o valor da propriedade organizationDEOClassificacaoC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOClassificacaoC(JAXBElement<String> value) {
        this.organizationDEOClassificacaoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOBeneficiosC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getOrganizationDEOBeneficiosC() {
        return organizationDEOBeneficiosC;
    }

    /**
     * Define o valor da propriedade organizationDEOBeneficiosC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setOrganizationDEOBeneficiosC(JAXBElement<byte[]> value) {
        this.organizationDEOBeneficiosC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEONFilhosC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOrganizationDEONFilhosC() {
        return organizationDEONFilhosC;
    }

    /**
     * Define o valor da propriedade organizationDEONFilhosC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOrganizationDEONFilhosC(JAXBElement<BigDecimal> value) {
        this.organizationDEONFilhosC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOIdadeF1C.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOrganizationDEOIdadeF1C() {
        return organizationDEOIdadeF1C;
    }

    /**
     * Define o valor da propriedade organizationDEOIdadeF1C.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOrganizationDEOIdadeF1C(JAXBElement<BigDecimal> value) {
        this.organizationDEOIdadeF1C = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOSexoF1C.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOSexoF1C() {
        return organizationDEOSexoF1C;
    }

    /**
     * Define o valor da propriedade organizationDEOSexoF1C.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOSexoF1C(JAXBElement<String> value) {
        this.organizationDEOSexoF1C = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOIdadeF2C.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOrganizationDEOIdadeF2C() {
        return organizationDEOIdadeF2C;
    }

    /**
     * Define o valor da propriedade organizationDEOIdadeF2C.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOrganizationDEOIdadeF2C(JAXBElement<BigDecimal> value) {
        this.organizationDEOIdadeF2C = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOSexoF2C.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOSexoF2C() {
        return organizationDEOSexoF2C;
    }

    /**
     * Define o valor da propriedade organizationDEOSexoF2C.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOSexoF2C(JAXBElement<String> value) {
        this.organizationDEOSexoF2C = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOSexoF3C.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOSexoF3C() {
        return organizationDEOSexoF3C;
    }

    /**
     * Define o valor da propriedade organizationDEOSexoF3C.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOSexoF3C(JAXBElement<String> value) {
        this.organizationDEOSexoF3C = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOIdadeF3C.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOrganizationDEOIdadeF3C() {
        return organizationDEOIdadeF3C;
    }

    /**
     * Define o valor da propriedade organizationDEOIdadeF3C.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOrganizationDEOIdadeF3C(JAXBElement<BigDecimal> value) {
        this.organizationDEOIdadeF3C = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOPercepcaosobreoclienteC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getOrganizationDEOPercepcaosobreoclienteC() {
        return organizationDEOPercepcaosobreoclienteC;
    }

    /**
     * Define o valor da propriedade organizationDEOPercepcaosobreoclienteC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setOrganizationDEOPercepcaosobreoclienteC(JAXBElement<byte[]> value) {
        this.organizationDEOPercepcaosobreoclienteC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOQualAnimalC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOQualAnimalC() {
        return organizationDEOQualAnimalC;
    }

    /**
     * Define o valor da propriedade organizationDEOQualAnimalC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOQualAnimalC(JAXBElement<String> value) {
        this.organizationDEOQualAnimalC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOCorreioC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOCorreioC() {
        return organizationDEOCorreioC;
    }

    /**
     * Define o valor da propriedade organizationDEOCorreioC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOCorreioC(Boolean value) {
        this.organizationDEOCorreioC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOEmailalternativoC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOEmailalternativoC() {
        return organizationDEOEmailalternativoC;
    }

    /**
     * Define o valor da propriedade organizationDEOEmailalternativoC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOEmailalternativoC(JAXBElement<String> value) {
        this.organizationDEOEmailalternativoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOTipoDeContatoC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOTipoDeContatoC() {
        return organizationDEOTipoDeContatoC;
    }

    /**
     * Define o valor da propriedade organizationDEOTipoDeContatoC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOTipoDeContatoC(JAXBElement<String> value) {
        this.organizationDEOTipoDeContatoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOIDDoContatoC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOrganizationDEOIDDoContatoC() {
        return organizationDEOIDDoContatoC;
    }

    /**
     * Define o valor da propriedade organizationDEOIDDoContatoC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOrganizationDEOIDDoContatoC(JAXBElement<BigDecimal> value) {
        this.organizationDEOIDDoContatoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOEmailAlternativo2C.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOEmailAlternativo2C() {
        return organizationDEOEmailAlternativo2C;
    }

    /**
     * Define o valor da propriedade organizationDEOEmailAlternativo2C.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOEmailAlternativo2C(JAXBElement<String> value) {
        this.organizationDEOEmailAlternativo2C = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOTelefoneDoAssistenteC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOTelefoneDoAssistenteC() {
        return organizationDEOTelefoneDoAssistenteC;
    }

    /**
     * Define o valor da propriedade organizationDEOTelefoneDoAssistenteC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOTelefoneDoAssistenteC(JAXBElement<String> value) {
        this.organizationDEOTelefoneDoAssistenteC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOCelularC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOCelularC() {
        return organizationDEOCelularC;
    }

    /**
     * Define o valor da propriedade organizationDEOCelularC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOCelularC(JAXBElement<String> value) {
        this.organizationDEOCelularC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOFaxC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOFaxC() {
        return organizationDEOFaxC;
    }

    /**
     * Define o valor da propriedade organizationDEOFaxC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOFaxC(JAXBElement<String> value) {
        this.organizationDEOFaxC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEODataDeNascimentoC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOrganizationDEODataDeNascimentoC() {
        return organizationDEODataDeNascimentoC;
    }

    /**
     * Define o valor da propriedade organizationDEODataDeNascimentoC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOrganizationDEODataDeNascimentoC(JAXBElement<XMLGregorianCalendar> value) {
        this.organizationDEODataDeNascimentoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEODataDeCasamentoC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOrganizationDEODataDeCasamentoC() {
        return organizationDEODataDeCasamentoC;
    }

    /**
     * Define o valor da propriedade organizationDEODataDeCasamentoC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOrganizationDEODataDeCasamentoC(JAXBElement<XMLGregorianCalendar> value) {
        this.organizationDEODataDeCasamentoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOValorTotalC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOValorTotalC() {
        return organizationDEOValorTotalC;
    }

    /**
     * Define o valor da propriedade organizationDEOValorTotalC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOValorTotalC(JAXBElement<String> value) {
        this.organizationDEOValorTotalC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOFalecidoC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOFalecidoC() {
        return organizationDEOFalecidoC;
    }

    /**
     * Define o valor da propriedade organizationDEOFalecidoC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOFalecidoC(Boolean value) {
        this.organizationDEOFalecidoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEONumeroDeUnidadesC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOrganizationDEONumeroDeUnidadesC() {
        return organizationDEONumeroDeUnidadesC;
    }

    /**
     * Define o valor da propriedade organizationDEONumeroDeUnidadesC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOrganizationDEONumeroDeUnidadesC(JAXBElement<BigDecimal> value) {
        this.organizationDEONumeroDeUnidadesC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOSexoC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOSexoC() {
        return organizationDEOSexoC;
    }

    /**
     * Define o valor da propriedade organizationDEOSexoC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOSexoC(JAXBElement<String> value) {
        this.organizationDEOSexoC = value;
    }

    /**
     * Obtém o valor da propriedade organizationDEOIntegradoComRightNowC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationDEOIntegradoComRightNowC() {
        return organizationDEOIntegradoComRightNowC;
    }

    /**
     * Define o valor da propriedade organizationDEOIntegradoComRightNowC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationDEOIntegradoComRightNowC(Boolean value) {
        this.organizationDEOIntegradoComRightNowC = value;
    }

}
