/**
 * null
 */
package blog.aws.referencedata.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import blog.aws.referencedata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DealerMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DealerMarshaller {

    private static final MarshallingInfo<String> CODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Code").build();
    private static final MarshallingInfo<List> DEALERLOCATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DealerLocations").build();
    private static final MarshallingInfo<String> EFFECTIVEDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EffectiveDate").build();
    private static final MarshallingInfo<String> EXPIRATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpirationDate").build();
    private static final MarshallingInfo<Boolean> LOCKED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Locked").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> UUID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UUID").build();

    private static final DealerMarshaller instance = new DealerMarshaller();

    public static DealerMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Dealer dealer, ProtocolMarshaller protocolMarshaller) {

        if (dealer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dealer.getCode(), CODE_BINDING);
            protocolMarshaller.marshall(dealer.getDealerLocations(), DEALERLOCATIONS_BINDING);
            protocolMarshaller.marshall(dealer.getEffectiveDate(), EFFECTIVEDATE_BINDING);
            protocolMarshaller.marshall(dealer.getExpirationDate(), EXPIRATIONDATE_BINDING);
            protocolMarshaller.marshall(dealer.getLocked(), LOCKED_BINDING);
            protocolMarshaller.marshall(dealer.getName(), NAME_BINDING);
            protocolMarshaller.marshall(dealer.getUUID(), UUID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
