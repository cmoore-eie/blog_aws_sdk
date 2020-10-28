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
 * GenderMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GenderMarshaller {

    private static final MarshallingInfo<String> CODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Code").build();
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

    private static final GenderMarshaller instance = new GenderMarshaller();

    public static GenderMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Gender gender, ProtocolMarshaller protocolMarshaller) {

        if (gender == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(gender.getCode(), CODE_BINDING);
            protocolMarshaller.marshall(gender.getEffectiveDate(), EFFECTIVEDATE_BINDING);
            protocolMarshaller.marshall(gender.getExpirationDate(), EXPIRATIONDATE_BINDING);
            protocolMarshaller.marshall(gender.getLocked(), LOCKED_BINDING);
            protocolMarshaller.marshall(gender.getName(), NAME_BINDING);
            protocolMarshaller.marshall(gender.getUUID(), UUID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
