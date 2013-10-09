
package org.newpaq;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LWAPIResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LWAPIResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ElapsedTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ResponseCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResponseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LWAPIResponse", namespace = "http://schemas.datacontract.org/2004/07/Brierley.LoyaltyWare.LWIntegrationSvc", propOrder = {
    "elapsedTime",
    "responseCode",
    "responseDescription",
    "responseDetail"
})
public class LWAPIResponse {

    @XmlElement(name = "ElapsedTime")
    protected Double elapsedTime;
    @XmlElement(name = "ResponseCode")
    protected Integer responseCode;
    @XmlElementRef(name = "ResponseDescription", namespace = "http://schemas.datacontract.org/2004/07/Brierley.LoyaltyWare.LWIntegrationSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responseDescription;
    @XmlElementRef(name = "ResponseDetail", namespace = "http://schemas.datacontract.org/2004/07/Brierley.LoyaltyWare.LWIntegrationSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responseDetail;

    /**
     * Gets the value of the elapsedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getElapsedTime() {
        return elapsedTime;
    }

    /**
     * Sets the value of the elapsedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setElapsedTime(Double value) {
        this.elapsedTime = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponseCode(Integer value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the responseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponseDescription() {
        return responseDescription;
    }

    /**
     * Sets the value of the responseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponseDescription(JAXBElement<String> value) {
        this.responseDescription = value;
    }

    /**
     * Gets the value of the responseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponseDetail() {
        return responseDetail;
    }

    /**
     * Sets the value of the responseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponseDetail(JAXBElement<String> value) {
        this.responseDetail = value;
    }

}
