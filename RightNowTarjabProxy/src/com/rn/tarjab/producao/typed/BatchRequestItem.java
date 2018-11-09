
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BatchRequestItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BatchRequestItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="CreateMsg" type="{urn:messages.ws.rightnow.com/v1_3}CreateMsg"/>
 *           &lt;element name="GetMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetMsg"/>
 *           &lt;element name="UpdateMsg" type="{urn:messages.ws.rightnow.com/v1_3}UpdateMsg"/>
 *           &lt;element name="DestroyMsg" type="{urn:messages.ws.rightnow.com/v1_3}DestroyMsg"/>
 *           &lt;element name="QueryCSVMsg" type="{urn:messages.ws.rightnow.com/v1_3}QueryMsg"/>
 *           &lt;element name="QueryObjectsMsg" type="{urn:messages.ws.rightnow.com/v1_3}QueryObjectsMsg"/>
 *           &lt;element name="ExecuteMarketingFlowMsg" type="{urn:messages.ws.rightnow.com/v1_3}ExecuteMarketingFlowMsg"/>
 *           &lt;element name="GetFileDataMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetFileDataMsg"/>
 *           &lt;element name="ResetContactPasswordMsg" type="{urn:messages.ws.rightnow.com/v1_3}ResetContactPasswordMsg"/>
 *           &lt;element name="SendMailingToContactMsg" type="{urn:messages.ws.rightnow.com/v1_3}SendMailingToContactMsg"/>
 *           &lt;element name="TransferSubObjectsMsg" type="{urn:messages.ws.rightnow.com/v1_3}TransferSubObjectsMsg"/>
 *           &lt;element name="GetMetaDataMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetMetaDataMsg"/>
 *           &lt;element name="GetMetaDataForClassMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetMetaDataForClassMsg"/>
 *           &lt;element name="GetMetaDataForOperationMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetMetaDataForOperationMsg"/>
 *           &lt;element name="GetMetaDataLastChangeTimeMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetMetaDataLastChangeTimeMsg"/>
 *           &lt;element name="GetPrimaryClassNamesMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetPrimaryClassNamesMsg"/>
 *           &lt;element name="GetValuesForNamedIDMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetValuesForNamedIDMsg"/>
 *           &lt;element name="GetValuesForNamedIDHierarchyMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetValuesForNamedIDHierarchyMsg"/>
 *           &lt;element name="RunAnalyticsReportMsg" type="{urn:messages.ws.rightnow.com/v1_3}RunAnalyticsReportMsg"/>
 *         &lt;/choice>
 *         &lt;element name="CommitAfter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreserveChainID" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchRequestItem", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "createMsg",
    "getMsg",
    "updateMsg",
    "destroyMsg",
    "queryCSVMsg",
    "queryObjectsMsg",
    "executeMarketingFlowMsg",
    "getFileDataMsg",
    "resetContactPasswordMsg",
    "sendMailingToContactMsg",
    "transferSubObjectsMsg",
    "getMetaDataMsg",
    "getMetaDataForClassMsg",
    "getMetaDataForOperationMsg",
    "getMetaDataLastChangeTimeMsg",
    "getPrimaryClassNamesMsg",
    "getValuesForNamedIDMsg",
    "getValuesForNamedIDHierarchyMsg",
    "runAnalyticsReportMsg",
    "commitAfter",
    "preserveChainID"
})
public class BatchRequestItem {

    @XmlElement(name = "CreateMsg")
    protected CreateMsg createMsg;
    @XmlElement(name = "GetMsg")
    protected GetMsg getMsg;
    @XmlElement(name = "UpdateMsg")
    protected UpdateMsg updateMsg;
    @XmlElement(name = "DestroyMsg")
    protected DestroyMsg destroyMsg;
    @XmlElement(name = "QueryCSVMsg")
    protected QueryMsg queryCSVMsg;
    @XmlElement(name = "QueryObjectsMsg")
    protected QueryObjectsMsg queryObjectsMsg;
    @XmlElement(name = "ExecuteMarketingFlowMsg")
    protected ExecuteMarketingFlowMsg executeMarketingFlowMsg;
    @XmlElement(name = "GetFileDataMsg")
    protected GetFileDataMsg getFileDataMsg;
    @XmlElement(name = "ResetContactPasswordMsg")
    protected ResetContactPasswordMsg resetContactPasswordMsg;
    @XmlElement(name = "SendMailingToContactMsg")
    protected SendMailingToContactMsg sendMailingToContactMsg;
    @XmlElement(name = "TransferSubObjectsMsg")
    protected TransferSubObjectsMsg transferSubObjectsMsg;
    @XmlElement(name = "GetMetaDataMsg")
    protected GetMetaDataMsg getMetaDataMsg;
    @XmlElement(name = "GetMetaDataForClassMsg")
    protected GetMetaDataForClassMsg getMetaDataForClassMsg;
    @XmlElement(name = "GetMetaDataForOperationMsg")
    protected GetMetaDataForOperationMsg getMetaDataForOperationMsg;
    @XmlElement(name = "GetMetaDataLastChangeTimeMsg")
    protected GetMetaDataLastChangeTimeMsg getMetaDataLastChangeTimeMsg;
    @XmlElement(name = "GetPrimaryClassNamesMsg")
    protected GetPrimaryClassNamesMsg getPrimaryClassNamesMsg;
    @XmlElement(name = "GetValuesForNamedIDMsg")
    protected GetValuesForNamedIDMsg getValuesForNamedIDMsg;
    @XmlElement(name = "GetValuesForNamedIDHierarchyMsg")
    protected GetValuesForNamedIDHierarchyMsg getValuesForNamedIDHierarchyMsg;
    @XmlElement(name = "RunAnalyticsReportMsg")
    protected RunAnalyticsReportMsg runAnalyticsReportMsg;
    @XmlElement(name = "CommitAfter")
    protected Boolean commitAfter;
    @XmlElement(name = "PreserveChainID")
    protected Boolean preserveChainID;

    /**
     * Obtém o valor da propriedade createMsg.
     * 
     * @return
     *     possible object is
     *     {@link CreateMsg }
     *     
     */
    public CreateMsg getCreateMsg() {
        return createMsg;
    }

    /**
     * Define o valor da propriedade createMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateMsg }
     *     
     */
    public void setCreateMsg(CreateMsg value) {
        this.createMsg = value;
    }

    /**
     * Obtém o valor da propriedade getMsg.
     * 
     * @return
     *     possible object is
     *     {@link GetMsg }
     *     
     */
    public GetMsg getGetMsg() {
        return getMsg;
    }

    /**
     * Define o valor da propriedade getMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMsg }
     *     
     */
    public void setGetMsg(GetMsg value) {
        this.getMsg = value;
    }

    /**
     * Obtém o valor da propriedade updateMsg.
     * 
     * @return
     *     possible object is
     *     {@link UpdateMsg }
     *     
     */
    public UpdateMsg getUpdateMsg() {
        return updateMsg;
    }

    /**
     * Define o valor da propriedade updateMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateMsg }
     *     
     */
    public void setUpdateMsg(UpdateMsg value) {
        this.updateMsg = value;
    }

    /**
     * Obtém o valor da propriedade destroyMsg.
     * 
     * @return
     *     possible object is
     *     {@link DestroyMsg }
     *     
     */
    public DestroyMsg getDestroyMsg() {
        return destroyMsg;
    }

    /**
     * Define o valor da propriedade destroyMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link DestroyMsg }
     *     
     */
    public void setDestroyMsg(DestroyMsg value) {
        this.destroyMsg = value;
    }

    /**
     * Obtém o valor da propriedade queryCSVMsg.
     * 
     * @return
     *     possible object is
     *     {@link QueryMsg }
     *     
     */
    public QueryMsg getQueryCSVMsg() {
        return queryCSVMsg;
    }

    /**
     * Define o valor da propriedade queryCSVMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryMsg }
     *     
     */
    public void setQueryCSVMsg(QueryMsg value) {
        this.queryCSVMsg = value;
    }

    /**
     * Obtém o valor da propriedade queryObjectsMsg.
     * 
     * @return
     *     possible object is
     *     {@link QueryObjectsMsg }
     *     
     */
    public QueryObjectsMsg getQueryObjectsMsg() {
        return queryObjectsMsg;
    }

    /**
     * Define o valor da propriedade queryObjectsMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryObjectsMsg }
     *     
     */
    public void setQueryObjectsMsg(QueryObjectsMsg value) {
        this.queryObjectsMsg = value;
    }

    /**
     * Obtém o valor da propriedade executeMarketingFlowMsg.
     * 
     * @return
     *     possible object is
     *     {@link ExecuteMarketingFlowMsg }
     *     
     */
    public ExecuteMarketingFlowMsg getExecuteMarketingFlowMsg() {
        return executeMarketingFlowMsg;
    }

    /**
     * Define o valor da propriedade executeMarketingFlowMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecuteMarketingFlowMsg }
     *     
     */
    public void setExecuteMarketingFlowMsg(ExecuteMarketingFlowMsg value) {
        this.executeMarketingFlowMsg = value;
    }

    /**
     * Obtém o valor da propriedade getFileDataMsg.
     * 
     * @return
     *     possible object is
     *     {@link GetFileDataMsg }
     *     
     */
    public GetFileDataMsg getGetFileDataMsg() {
        return getFileDataMsg;
    }

    /**
     * Define o valor da propriedade getFileDataMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFileDataMsg }
     *     
     */
    public void setGetFileDataMsg(GetFileDataMsg value) {
        this.getFileDataMsg = value;
    }

    /**
     * Obtém o valor da propriedade resetContactPasswordMsg.
     * 
     * @return
     *     possible object is
     *     {@link ResetContactPasswordMsg }
     *     
     */
    public ResetContactPasswordMsg getResetContactPasswordMsg() {
        return resetContactPasswordMsg;
    }

    /**
     * Define o valor da propriedade resetContactPasswordMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetContactPasswordMsg }
     *     
     */
    public void setResetContactPasswordMsg(ResetContactPasswordMsg value) {
        this.resetContactPasswordMsg = value;
    }

    /**
     * Obtém o valor da propriedade sendMailingToContactMsg.
     * 
     * @return
     *     possible object is
     *     {@link SendMailingToContactMsg }
     *     
     */
    public SendMailingToContactMsg getSendMailingToContactMsg() {
        return sendMailingToContactMsg;
    }

    /**
     * Define o valor da propriedade sendMailingToContactMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link SendMailingToContactMsg }
     *     
     */
    public void setSendMailingToContactMsg(SendMailingToContactMsg value) {
        this.sendMailingToContactMsg = value;
    }

    /**
     * Obtém o valor da propriedade transferSubObjectsMsg.
     * 
     * @return
     *     possible object is
     *     {@link TransferSubObjectsMsg }
     *     
     */
    public TransferSubObjectsMsg getTransferSubObjectsMsg() {
        return transferSubObjectsMsg;
    }

    /**
     * Define o valor da propriedade transferSubObjectsMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferSubObjectsMsg }
     *     
     */
    public void setTransferSubObjectsMsg(TransferSubObjectsMsg value) {
        this.transferSubObjectsMsg = value;
    }

    /**
     * Obtém o valor da propriedade getMetaDataMsg.
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataMsg }
     *     
     */
    public GetMetaDataMsg getGetMetaDataMsg() {
        return getMetaDataMsg;
    }

    /**
     * Define o valor da propriedade getMetaDataMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataMsg }
     *     
     */
    public void setGetMetaDataMsg(GetMetaDataMsg value) {
        this.getMetaDataMsg = value;
    }

    /**
     * Obtém o valor da propriedade getMetaDataForClassMsg.
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataForClassMsg }
     *     
     */
    public GetMetaDataForClassMsg getGetMetaDataForClassMsg() {
        return getMetaDataForClassMsg;
    }

    /**
     * Define o valor da propriedade getMetaDataForClassMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataForClassMsg }
     *     
     */
    public void setGetMetaDataForClassMsg(GetMetaDataForClassMsg value) {
        this.getMetaDataForClassMsg = value;
    }

    /**
     * Obtém o valor da propriedade getMetaDataForOperationMsg.
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataForOperationMsg }
     *     
     */
    public GetMetaDataForOperationMsg getGetMetaDataForOperationMsg() {
        return getMetaDataForOperationMsg;
    }

    /**
     * Define o valor da propriedade getMetaDataForOperationMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataForOperationMsg }
     *     
     */
    public void setGetMetaDataForOperationMsg(GetMetaDataForOperationMsg value) {
        this.getMetaDataForOperationMsg = value;
    }

    /**
     * Obtém o valor da propriedade getMetaDataLastChangeTimeMsg.
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataLastChangeTimeMsg }
     *     
     */
    public GetMetaDataLastChangeTimeMsg getGetMetaDataLastChangeTimeMsg() {
        return getMetaDataLastChangeTimeMsg;
    }

    /**
     * Define o valor da propriedade getMetaDataLastChangeTimeMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataLastChangeTimeMsg }
     *     
     */
    public void setGetMetaDataLastChangeTimeMsg(GetMetaDataLastChangeTimeMsg value) {
        this.getMetaDataLastChangeTimeMsg = value;
    }

    /**
     * Obtém o valor da propriedade getPrimaryClassNamesMsg.
     * 
     * @return
     *     possible object is
     *     {@link GetPrimaryClassNamesMsg }
     *     
     */
    public GetPrimaryClassNamesMsg getGetPrimaryClassNamesMsg() {
        return getPrimaryClassNamesMsg;
    }

    /**
     * Define o valor da propriedade getPrimaryClassNamesMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPrimaryClassNamesMsg }
     *     
     */
    public void setGetPrimaryClassNamesMsg(GetPrimaryClassNamesMsg value) {
        this.getPrimaryClassNamesMsg = value;
    }

    /**
     * Obtém o valor da propriedade getValuesForNamedIDMsg.
     * 
     * @return
     *     possible object is
     *     {@link GetValuesForNamedIDMsg }
     *     
     */
    public GetValuesForNamedIDMsg getGetValuesForNamedIDMsg() {
        return getValuesForNamedIDMsg;
    }

    /**
     * Define o valor da propriedade getValuesForNamedIDMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link GetValuesForNamedIDMsg }
     *     
     */
    public void setGetValuesForNamedIDMsg(GetValuesForNamedIDMsg value) {
        this.getValuesForNamedIDMsg = value;
    }

    /**
     * Obtém o valor da propriedade getValuesForNamedIDHierarchyMsg.
     * 
     * @return
     *     possible object is
     *     {@link GetValuesForNamedIDHierarchyMsg }
     *     
     */
    public GetValuesForNamedIDHierarchyMsg getGetValuesForNamedIDHierarchyMsg() {
        return getValuesForNamedIDHierarchyMsg;
    }

    /**
     * Define o valor da propriedade getValuesForNamedIDHierarchyMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link GetValuesForNamedIDHierarchyMsg }
     *     
     */
    public void setGetValuesForNamedIDHierarchyMsg(GetValuesForNamedIDHierarchyMsg value) {
        this.getValuesForNamedIDHierarchyMsg = value;
    }

    /**
     * Obtém o valor da propriedade runAnalyticsReportMsg.
     * 
     * @return
     *     possible object is
     *     {@link RunAnalyticsReportMsg }
     *     
     */
    public RunAnalyticsReportMsg getRunAnalyticsReportMsg() {
        return runAnalyticsReportMsg;
    }

    /**
     * Define o valor da propriedade runAnalyticsReportMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link RunAnalyticsReportMsg }
     *     
     */
    public void setRunAnalyticsReportMsg(RunAnalyticsReportMsg value) {
        this.runAnalyticsReportMsg = value;
    }

    /**
     * Obtém o valor da propriedade commitAfter.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommitAfter() {
        return commitAfter;
    }

    /**
     * Define o valor da propriedade commitAfter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommitAfter(Boolean value) {
        this.commitAfter = value;
    }

    /**
     * Obtém o valor da propriedade preserveChainID.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreserveChainID() {
        return preserveChainID;
    }

    /**
     * Define o valor da propriedade preserveChainID.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreserveChainID(Boolean value) {
        this.preserveChainID = value;
    }

}
