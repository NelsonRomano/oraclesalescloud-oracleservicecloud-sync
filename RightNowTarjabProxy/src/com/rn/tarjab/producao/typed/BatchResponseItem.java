
package com.rn.tarjab.producao.typed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BatchResponseItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BatchResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CreateResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}CreateResponseMsg"/>
 *         &lt;element name="GetResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetResponseMsg"/>
 *         &lt;element name="UpdateResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}UpdateResponseMsg"/>
 *         &lt;element name="DestroyResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}DestroyResponseMsg"/>
 *         &lt;element name="QueryCSVResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}QueryCSVResponseMsg"/>
 *         &lt;element name="QueryObjectsResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}QueryObjectsResponseMsg"/>
 *         &lt;element name="ExecuteMarketingFlowResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}ExecuteMarketingFlowResponseMsg"/>
 *         &lt;element name="GetFileDataResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetFileDataResponseMsg"/>
 *         &lt;element name="ResetContactPasswordResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}ResetContactPasswordResponseMsg"/>
 *         &lt;element name="SendMailingToContactResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}SendMailingToContactResponseMsg"/>
 *         &lt;element name="GetMetaDataResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetMetaDataResponseMsg"/>
 *         &lt;element name="TransferSubObjectsResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}TransferSubObjectsResponseMsg"/>
 *         &lt;element name="GetMetaDataForClassResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetMetaDataForClassResponseMsg"/>
 *         &lt;element name="GetMetaDataForOperationResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetMetaDataForOperationResponseMsg"/>
 *         &lt;element name="GetMetaDataLastChangeTimeResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetMetaDataLastChangeTimeResponseMsg"/>
 *         &lt;element name="GetPrimaryClassNamesResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetPrimaryClassNamesResponseMsg"/>
 *         &lt;element name="GetValuesForNamedIDResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetValuesForNamedIDResponseMsg"/>
 *         &lt;element name="GetValuesForNamedIDHierarchyResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}GetValuesForNamedIDHierarchyResponseMsg"/>
 *         &lt;element name="RunAnalyticsReportResponseMsg" type="{urn:messages.ws.rightnow.com/v1_3}RunAnalyticsReportResponseMsg"/>
 *         &lt;element name="RequestErrorFault" type="{urn:faults.ws.rightnow.com/v1_3}RequestErrorFaultType"/>
 *         &lt;element name="RequestErrorFaultDetail" type="{urn:faults.ws.rightnow.com/v1_3}RequestErrorFaultDetailType"/>
 *         &lt;element name="ServerErrorFault" type="{urn:faults.ws.rightnow.com/v1_3}ServerErrorFaultType"/>
 *         &lt;element name="UnexpectedErrorFault" type="{urn:faults.ws.rightnow.com/v1_3}UnexpectedErrorFaultType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchResponseItem", namespace = "urn:messages.ws.rightnow.com/v1_3", propOrder = {
    "createResponseMsg",
    "getResponseMsg",
    "updateResponseMsg",
    "destroyResponseMsg",
    "queryCSVResponseMsg",
    "queryObjectsResponseMsg",
    "executeMarketingFlowResponseMsg",
    "getFileDataResponseMsg",
    "resetContactPasswordResponseMsg",
    "sendMailingToContactResponseMsg",
    "getMetaDataResponseMsg",
    "transferSubObjectsResponseMsg",
    "getMetaDataForClassResponseMsg",
    "getMetaDataForOperationResponseMsg",
    "getMetaDataLastChangeTimeResponseMsg",
    "getPrimaryClassNamesResponseMsg",
    "getValuesForNamedIDResponseMsg",
    "getValuesForNamedIDHierarchyResponseMsg",
    "runAnalyticsReportResponseMsg",
    "requestErrorFault",
    "requestErrorFaultDetail",
    "serverErrorFault",
    "unexpectedErrorFault"
})
public class BatchResponseItem {

    @XmlElement(name = "CreateResponseMsg")
    protected CreateResponseMsg createResponseMsg;
    @XmlElement(name = "GetResponseMsg")
    protected GetResponseMsg getResponseMsg;
    @XmlElement(name = "UpdateResponseMsg")
    protected UpdateResponseMsg updateResponseMsg;
    @XmlElement(name = "DestroyResponseMsg")
    protected DestroyResponseMsg destroyResponseMsg;
    @XmlElement(name = "QueryCSVResponseMsg")
    protected QueryCSVResponseMsg queryCSVResponseMsg;
    @XmlElement(name = "QueryObjectsResponseMsg")
    protected QueryObjectsResponseMsg queryObjectsResponseMsg;
    @XmlElement(name = "ExecuteMarketingFlowResponseMsg")
    protected ExecuteMarketingFlowResponseMsg executeMarketingFlowResponseMsg;
    @XmlElement(name = "GetFileDataResponseMsg")
    protected GetFileDataResponseMsg getFileDataResponseMsg;
    @XmlElement(name = "ResetContactPasswordResponseMsg")
    protected ResetContactPasswordResponseMsg resetContactPasswordResponseMsg;
    @XmlElement(name = "SendMailingToContactResponseMsg")
    protected SendMailingToContactResponseMsg sendMailingToContactResponseMsg;
    @XmlElement(name = "GetMetaDataResponseMsg")
    protected GetMetaDataResponseMsg getMetaDataResponseMsg;
    @XmlElement(name = "TransferSubObjectsResponseMsg")
    protected TransferSubObjectsResponseMsg transferSubObjectsResponseMsg;
    @XmlElement(name = "GetMetaDataForClassResponseMsg")
    protected GetMetaDataForClassResponseMsg getMetaDataForClassResponseMsg;
    @XmlElement(name = "GetMetaDataForOperationResponseMsg")
    protected GetMetaDataForOperationResponseMsg getMetaDataForOperationResponseMsg;
    @XmlElement(name = "GetMetaDataLastChangeTimeResponseMsg")
    protected GetMetaDataLastChangeTimeResponseMsg getMetaDataLastChangeTimeResponseMsg;
    @XmlElement(name = "GetPrimaryClassNamesResponseMsg")
    protected GetPrimaryClassNamesResponseMsg getPrimaryClassNamesResponseMsg;
    @XmlElement(name = "GetValuesForNamedIDResponseMsg")
    protected GetValuesForNamedIDResponseMsg getValuesForNamedIDResponseMsg;
    @XmlElement(name = "GetValuesForNamedIDHierarchyResponseMsg")
    protected GetValuesForNamedIDHierarchyResponseMsg getValuesForNamedIDHierarchyResponseMsg;
    @XmlElement(name = "RunAnalyticsReportResponseMsg")
    protected RunAnalyticsReportResponseMsg runAnalyticsReportResponseMsg;
    @XmlElement(name = "RequestErrorFault")
    protected RequestErrorFaultType requestErrorFault;
    @XmlElement(name = "RequestErrorFaultDetail")
    protected RequestErrorFaultDetailType requestErrorFaultDetail;
    @XmlElement(name = "ServerErrorFault")
    protected ServerErrorFaultType serverErrorFault;
    @XmlElement(name = "UnexpectedErrorFault")
    protected UnexpectedErrorFaultType unexpectedErrorFault;

    /**
     * Obtém o valor da propriedade createResponseMsg.
     * 
     * @return
     *     possible object is
     *     {@link CreateResponseMsg }
     *     
     */
    public CreateResponseMsg getCreateResponseMsg() {
        return createResponseMsg;
    }

    /**
     * Define o valor da propriedade createResponseMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateResponseMsg }
     *     
     */
    public void setCreateResponseMsg(CreateResponseMsg value) {
        this.createResponseMsg = value;
    }

    /**
     * Obtém o valor da propriedade getResponseMsg.
     * 
     * @return
     *     possible object is
     *     {@link GetResponseMsg }
     *     
     */
    public GetResponseMsg getGetResponseMsg() {
        return getResponseMsg;
    }

    /**
     * Define o valor da propriedade getResponseMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link GetResponseMsg }
     *     
     */
    public void setGetResponseMsg(GetResponseMsg value) {
        this.getResponseMsg = value;
    }

    /**
     * Obtém o valor da propriedade updateResponseMsg.
     * 
     * @return
     *     possible object is
     *     {@link UpdateResponseMsg }
     *     
     */
    public UpdateResponseMsg getUpdateResponseMsg() {
        return updateResponseMsg;
    }

    /**
     * Define o valor da propriedade updateResponseMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateResponseMsg }
     *     
     */
    public void setUpdateResponseMsg(UpdateResponseMsg value) {
        this.updateResponseMsg = value;
    }

    /**
     * Obtém o valor da propriedade destroyResponseMsg.
     * 
     * @return
     *     possible object is
     *     {@link DestroyResponseMsg }
     *     
     */
    public DestroyResponseMsg getDestroyResponseMsg() {
        return destroyResponseMsg;
    }

    /**
     * Define o valor da propriedade destroyResponseMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link DestroyResponseMsg }
     *     
     */
    public void setDestroyResponseMsg(DestroyResponseMsg value) {
        this.destroyResponseMsg = value;
    }

    /**
     * Obtém o valor da propriedade queryCSVResponseMsg.
     * 
     * @return
     *     possible object is
     *     {@link QueryCSVResponseMsg }
     *     
     */
    public QueryCSVResponseMsg getQueryCSVResponseMsg() {
        return queryCSVResponseMsg;
    }

    /**
     * Define o valor da propriedade queryCSVResponseMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryCSVResponseMsg }
     *     
     */
    public void setQueryCSVResponseMsg(QueryCSVResponseMsg value) {
        this.queryCSVResponseMsg = value;
    }

    /**
     * Obtém o valor da propriedade queryObjectsResponseMsg.
     * 
     * @return
     *     possible object is
     *     {@link QueryObjectsResponseMsg }
     *     
     */
    public QueryObjectsResponseMsg getQueryObjectsResponseMsg() {
        return queryObjectsResponseMsg;
    }

    /**
     * Define o valor da propriedade queryObjectsResponseMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryObjectsResponseMsg }
     *     
     */
    public void setQueryObjectsResponseMsg(QueryObjectsResponseMsg value) {
        this.queryObjectsResponseMsg = value;
    }

    /**
     * Obtém o valor da propriedade executeMarketingFlowResponseMsg.
     * 
     * @return
     *     possible object is
     *     {@link ExecuteMarketingFlowResponseMsg }
     *     
     */
    public ExecuteMarketingFlowResponseMsg getExecuteMarketingFlowResponseMsg() {
        return executeMarketingFlowResponseMsg;
    }

    /**
     * Define o valor da propriedade executeMarketingFlowResponseMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecuteMarketingFlowResponseMsg }
     *     
     */
    public void setExecuteMarketingFlowResponseMsg(ExecuteMarketingFlowResponseMsg value) {
        this.executeMarketingFlowResponseMsg = value;
    }

    /**
     * Obtém o valor da propriedade getFileDataResponseMsg.
     * 
     * @return
     *     possible object is
     *     {@link GetFileDataResponseMsg }
     *     
     */
    public GetFileDataResponseMsg getGetFileDataResponseMsg() {
        return getFileDataResponseMsg;
    }

    /**
     * Define o valor da propriedade getFileDataResponseMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFileDataResponseMsg }
     *     
     */
    public void setGetFileDataResponseMsg(GetFileDataResponseMsg value) {
        this.getFileDataResponseMsg = value;
    }

    /**
     * Obtém o valor da propriedade resetContactPasswordResponseMsg.
     * 
     * @return
     *     possible object is
     *     {@link ResetContactPasswordResponseMsg }
     *     
     */
    public ResetContactPasswordResponseMsg getResetContactPasswordResponseMsg() {
        return resetContactPasswordResponseMsg;
    }

    /**
     * Define o valor da propriedade resetContactPasswordResponseMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetContactPasswordResponseMsg }
     *     
     */
    public void setResetContactPasswordResponseMsg(ResetContactPasswordResponseMsg value) {
        this.resetContactPasswordResponseMsg = value;
    }

    /**
     * Obtém o valor da propriedade sendMailingToContactResponseMsg.
     * 
     * @return
     *     possible object is
     *     {@link SendMailingToContactResponseMsg }
     *     
     */
    public SendMailingToContactResponseMsg getSendMailingToContactResponseMsg() {
        return sendMailingToContactResponseMsg;
    }

    /**
     * Define o valor da propriedade sendMailingToContactResponseMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link SendMailingToContactResponseMsg }
     *     
     */
    public void setSendMailingToContactResponseMsg(SendMailingToContactResponseMsg value) {
        this.sendMailingToContactResponseMsg = value;
    }

    /**
     * Obtém o valor da propriedade getMetaDataResponseMsg.
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataResponseMsg }
     *     
     */
    public GetMetaDataResponseMsg getGetMetaDataResponseMsg() {
        return getMetaDataResponseMsg;
    }

    /**
     * Define o valor da propriedade getMetaDataResponseMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataResponseMsg }
     *     
     */
    public void setGetMetaDataResponseMsg(GetMetaDataResponseMsg value) {
        this.getMetaDataResponseMsg = value;
    }

    /**
     * Obtém o valor da propriedade transferSubObjectsResponseMsg.
     * 
     * @return
     *     possible object is
     *     {@link TransferSubObjectsResponseMsg }
     *     
     */
    public TransferSubObjectsResponseMsg getTransferSubObjectsResponseMsg() {
        return transferSubObjectsResponseMsg;
    }

    /**
     * Define o valor da propriedade transferSubObjectsResponseMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferSubObjectsResponseMsg }
     *     
     */
    public void setTransferSubObjectsResponseMsg(TransferSubObjectsResponseMsg value) {
        this.transferSubObjectsResponseMsg = value;
    }

    /**
     * Obtém o valor da propriedade getMetaDataForClassResponseMsg.
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataForClassResponseMsg }
     *     
     */
    public GetMetaDataForClassResponseMsg getGetMetaDataForClassResponseMsg() {
        return getMetaDataForClassResponseMsg;
    }

    /**
     * Define o valor da propriedade getMetaDataForClassResponseMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataForClassResponseMsg }
     *     
     */
    public void setGetMetaDataForClassResponseMsg(GetMetaDataForClassResponseMsg value) {
        this.getMetaDataForClassResponseMsg = value;
    }

    /**
     * Obtém o valor da propriedade getMetaDataForOperationResponseMsg.
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataForOperationResponseMsg }
     *     
     */
    public GetMetaDataForOperationResponseMsg getGetMetaDataForOperationResponseMsg() {
        return getMetaDataForOperationResponseMsg;
    }

    /**
     * Define o valor da propriedade getMetaDataForOperationResponseMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataForOperationResponseMsg }
     *     
     */
    public void setGetMetaDataForOperationResponseMsg(GetMetaDataForOperationResponseMsg value) {
        this.getMetaDataForOperationResponseMsg = value;
    }

    /**
     * Obtém o valor da propriedade getMetaDataLastChangeTimeResponseMsg.
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataLastChangeTimeResponseMsg }
     *     
     */
    public GetMetaDataLastChangeTimeResponseMsg getGetMetaDataLastChangeTimeResponseMsg() {
        return getMetaDataLastChangeTimeResponseMsg;
    }

    /**
     * Define o valor da propriedade getMetaDataLastChangeTimeResponseMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataLastChangeTimeResponseMsg }
     *     
     */
    public void setGetMetaDataLastChangeTimeResponseMsg(GetMetaDataLastChangeTimeResponseMsg value) {
        this.getMetaDataLastChangeTimeResponseMsg = value;
    }

    /**
     * Obtém o valor da propriedade getPrimaryClassNamesResponseMsg.
     * 
     * @return
     *     possible object is
     *     {@link GetPrimaryClassNamesResponseMsg }
     *     
     */
    public GetPrimaryClassNamesResponseMsg getGetPrimaryClassNamesResponseMsg() {
        return getPrimaryClassNamesResponseMsg;
    }

    /**
     * Define o valor da propriedade getPrimaryClassNamesResponseMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPrimaryClassNamesResponseMsg }
     *     
     */
    public void setGetPrimaryClassNamesResponseMsg(GetPrimaryClassNamesResponseMsg value) {
        this.getPrimaryClassNamesResponseMsg = value;
    }

    /**
     * Obtém o valor da propriedade getValuesForNamedIDResponseMsg.
     * 
     * @return
     *     possible object is
     *     {@link GetValuesForNamedIDResponseMsg }
     *     
     */
    public GetValuesForNamedIDResponseMsg getGetValuesForNamedIDResponseMsg() {
        return getValuesForNamedIDResponseMsg;
    }

    /**
     * Define o valor da propriedade getValuesForNamedIDResponseMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link GetValuesForNamedIDResponseMsg }
     *     
     */
    public void setGetValuesForNamedIDResponseMsg(GetValuesForNamedIDResponseMsg value) {
        this.getValuesForNamedIDResponseMsg = value;
    }

    /**
     * Obtém o valor da propriedade getValuesForNamedIDHierarchyResponseMsg.
     * 
     * @return
     *     possible object is
     *     {@link GetValuesForNamedIDHierarchyResponseMsg }
     *     
     */
    public GetValuesForNamedIDHierarchyResponseMsg getGetValuesForNamedIDHierarchyResponseMsg() {
        return getValuesForNamedIDHierarchyResponseMsg;
    }

    /**
     * Define o valor da propriedade getValuesForNamedIDHierarchyResponseMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link GetValuesForNamedIDHierarchyResponseMsg }
     *     
     */
    public void setGetValuesForNamedIDHierarchyResponseMsg(GetValuesForNamedIDHierarchyResponseMsg value) {
        this.getValuesForNamedIDHierarchyResponseMsg = value;
    }

    /**
     * Obtém o valor da propriedade runAnalyticsReportResponseMsg.
     * 
     * @return
     *     possible object is
     *     {@link RunAnalyticsReportResponseMsg }
     *     
     */
    public RunAnalyticsReportResponseMsg getRunAnalyticsReportResponseMsg() {
        return runAnalyticsReportResponseMsg;
    }

    /**
     * Define o valor da propriedade runAnalyticsReportResponseMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link RunAnalyticsReportResponseMsg }
     *     
     */
    public void setRunAnalyticsReportResponseMsg(RunAnalyticsReportResponseMsg value) {
        this.runAnalyticsReportResponseMsg = value;
    }

    /**
     * Obtém o valor da propriedade requestErrorFault.
     * 
     * @return
     *     possible object is
     *     {@link RequestErrorFaultType }
     *     
     */
    public RequestErrorFaultType getRequestErrorFault() {
        return requestErrorFault;
    }

    /**
     * Define o valor da propriedade requestErrorFault.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestErrorFaultType }
     *     
     */
    public void setRequestErrorFault(RequestErrorFaultType value) {
        this.requestErrorFault = value;
    }

    /**
     * Obtém o valor da propriedade requestErrorFaultDetail.
     * 
     * @return
     *     possible object is
     *     {@link RequestErrorFaultDetailType }
     *     
     */
    public RequestErrorFaultDetailType getRequestErrorFaultDetail() {
        return requestErrorFaultDetail;
    }

    /**
     * Define o valor da propriedade requestErrorFaultDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestErrorFaultDetailType }
     *     
     */
    public void setRequestErrorFaultDetail(RequestErrorFaultDetailType value) {
        this.requestErrorFaultDetail = value;
    }

    /**
     * Obtém o valor da propriedade serverErrorFault.
     * 
     * @return
     *     possible object is
     *     {@link ServerErrorFaultType }
     *     
     */
    public ServerErrorFaultType getServerErrorFault() {
        return serverErrorFault;
    }

    /**
     * Define o valor da propriedade serverErrorFault.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerErrorFaultType }
     *     
     */
    public void setServerErrorFault(ServerErrorFaultType value) {
        this.serverErrorFault = value;
    }

    /**
     * Obtém o valor da propriedade unexpectedErrorFault.
     * 
     * @return
     *     possible object is
     *     {@link UnexpectedErrorFaultType }
     *     
     */
    public UnexpectedErrorFaultType getUnexpectedErrorFault() {
        return unexpectedErrorFault;
    }

    /**
     * Define o valor da propriedade unexpectedErrorFault.
     * 
     * @param value
     *     allowed object is
     *     {@link UnexpectedErrorFaultType }
     *     
     */
    public void setUnexpectedErrorFault(UnexpectedErrorFaultType value) {
        this.unexpectedErrorFault = value;
    }

}
