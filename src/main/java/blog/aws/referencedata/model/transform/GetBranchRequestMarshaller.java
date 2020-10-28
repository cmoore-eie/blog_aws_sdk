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
 * GetBranchRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetBranchRequestMarshaller {

    private static final GetBranchRequestMarshaller instance = new GetBranchRequestMarshaller();

    public static GetBranchRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetBranchRequest getBranchRequest, ProtocolMarshaller protocolMarshaller) {

        if (getBranchRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
