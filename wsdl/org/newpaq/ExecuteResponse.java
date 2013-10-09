
package org.newpaq;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExecuteResult" type="{http://schemas.datacontract.org/2004/07/Brierley.LoyaltyWare.LWIntegrationSvc}LWAPIResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "executeResult"
})
@XmlRootElement(name = "ExecuteResponse")
public class ExecuteResponse {

    @XmlElementRef(name = "ExecuteResult", namespace = "urn:Brierley.LoyaltyWare.LWIntegrationSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<LWAPIResponse> executeResult;

    /**
     * Gets the value of the executeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LWAPIResponse }{@code >}
     *     
     */
    public JAXBElement<LWAPIResponse> getExecuteResult() {
        return executeResult;
    }

    /**
     * Sets the value of the executeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LWAPIResponse }{@code >}
     *     
     */
    public void setExecuteResult(JAXBElement<LWAPIResponse> value) {
        this.executeResult = value;
    }

}
