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
 * PostBranchRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostBranchRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> BRANCH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).build();

    private static final PostBranchRequestMarshaller instance = new PostBranchRequestMarshaller();

    public static PostBranchRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PostBranchRequest postBranchRequest, ProtocolMarshaller protocolMarshaller) {

        if (postBranchRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(postBranchRequest.getBranch(), BRANCH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
