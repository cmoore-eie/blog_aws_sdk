/**
 * null
 */
package blog.aws.referencedata.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import blog.aws.referencedata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DealerLocationsElementMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DealerLocationsElementMarshaller {

    private static final MarshallingInfo<String> ADDRESSLINE1_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AddressLine1").build();
    private static final MarshallingInfo<String> ADDRESSLINE2_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AddressLine2").build();
    private static final MarshallingInfo<String> CITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("City").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> POSTCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Postcode").build();

    private static final DealerLocationsElementMarshaller instance = new DealerLocationsElementMarshaller();

    public static DealerLocationsElementMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DealerLocationsElement dealerLocationsElement, ProtocolMarshaller protocolMarshaller) {

        if (dealerLocationsElement == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dealerLocationsElement.getAddressLine1(), ADDRESSLINE1_BINDING);
            protocolMarshaller.marshall(dealerLocationsElement.getAddressLine2(), ADDRESSLINE2_BINDING);
            protocolMarshaller.marshall(dealerLocationsElement.getCity(), CITY_BINDING);
            protocolMarshaller.marshall(dealerLocationsElement.getName(), NAME_BINDING);
            protocolMarshaller.marshall(dealerLocationsElement.getPostcode(), POSTCODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
