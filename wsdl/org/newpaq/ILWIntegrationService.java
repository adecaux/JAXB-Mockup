
package org.newpaq;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ILWIntegrationService", targetNamespace = "urn:Brierley.LoyaltyWare.LWIntegrationSvc")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ILWIntegrationService {


    /**
     * 
     * @param sourceEnv
     * @param source
     * @param operationName
     * @param payload
     * @param externalId
     * @return
     *     returns org.newpaq.LWAPIResponse
     */
    @WebMethod(operationName = "Execute", action = "urn:Brierley.LoyaltyWare.LWIntegrationSvc/ILWIntegrationService/Execute")
    @WebResult(name = "ExecuteResult", targetNamespace = "urn:Brierley.LoyaltyWare.LWIntegrationSvc")
    @RequestWrapper(localName = "Execute", targetNamespace = "urn:Brierley.LoyaltyWare.LWIntegrationSvc", className = "org.newpaq.Execute")
    @ResponseWrapper(localName = "ExecuteResponse", targetNamespace = "urn:Brierley.LoyaltyWare.LWIntegrationSvc", className = "org.newpaq.ExecuteResponse")
    public LWAPIResponse execute(
        @WebParam(name = "operationName", targetNamespace = "urn:Brierley.LoyaltyWare.LWIntegrationSvc")
        String operationName,
        @WebParam(name = "source", targetNamespace = "urn:Brierley.LoyaltyWare.LWIntegrationSvc")
        String source,
        @WebParam(name = "sourceEnv", targetNamespace = "urn:Brierley.LoyaltyWare.LWIntegrationSvc")
        String sourceEnv,
        @WebParam(name = "externalId", targetNamespace = "urn:Brierley.LoyaltyWare.LWIntegrationSvc")
        String externalId,
        @WebParam(name = "payload", targetNamespace = "urn:Brierley.LoyaltyWare.LWIntegrationSvc")
        String payload);

}
