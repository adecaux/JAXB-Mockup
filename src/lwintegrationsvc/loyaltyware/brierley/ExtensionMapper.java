/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package lwintegrationsvc.loyaltyware.brierley;

/**
 * ExtensionMapper class
 */
@SuppressWarnings({ "unchecked", "unused" })
public class ExtensionMapper {

	public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
			java.lang.String typeName, javax.xml.stream.XMLStreamReader reader)
			throws java.lang.Exception {

		if ("http://schemas.microsoft.com/2003/10/Serialization/"
				.equals(namespaceURI) && "guid".equals(typeName)) {

			return com.microsoft.schemas._2003._10.serialization.Guid.Factory
					.parse(reader);

		}

		if ("http://schemas.microsoft.com/2003/10/Serialization/"
				.equals(namespaceURI) && "duration".equals(typeName)) {

			return com.microsoft.schemas._2003._10.serialization.Duration.Factory
					.parse(reader);

		}

		if ("http://schemas.microsoft.com/2003/10/Serialization/"
				.equals(namespaceURI) && "char".equals(typeName)) {

			return com.microsoft.schemas._2003._10.serialization._char.Factory
					.parse(reader);

		}

		if ("http://schemas.datacontract.org/2004/07/Brierley.LoyaltyWare.LWIntegrationSvc"
				.equals(namespaceURI) && "LWAPIResponse".equals(typeName)) {

			return org.datacontract.schemas._2004._07.brierley_loyaltyware_lwintegrationsvc.LWAPIResponse.Factory
					.parse(reader);

		}

		throw new org.apache.axis2.databinding.ADBException("Unsupported type "
				+ namespaceURI + " " + typeName);
	}

}
