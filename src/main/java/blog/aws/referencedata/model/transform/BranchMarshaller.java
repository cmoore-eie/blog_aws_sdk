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
 * BranchMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BranchMarshaller {

    private static final MarshallingInfo<String> BRANCHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BranchType").build();
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

    private static final BranchMarshaller instance = new BranchMarshaller();

    public static BranchMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Branch branch, ProtocolMarshaller protocolMarshaller) {

        if (branch == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(branch.getBranchType(), BRANCHTYPE_BINDING);
            protocolMarshaller.marshall(branch.getCode(), CODE_BINDING);
            protocolMarshaller.marshall(branch.getEffectiveDate(), EFFECTIVEDATE_BINDING);
            protocolMarshaller.marshall(branch.getExpirationDate(), EXPIRATIONDATE_BINDING);
            protocolMarshaller.marshall(branch.getLocked(), LOCKED_BINDING);
            protocolMarshaller.marshall(branch.getName(), NAME_BINDING);
            protocolMarshaller.marshall(branch.getUUID(), UUID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
