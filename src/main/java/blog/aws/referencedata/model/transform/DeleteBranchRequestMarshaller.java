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
 * DeleteBranchRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteBranchRequestMarshaller {

    private static final DeleteBranchRequestMarshaller instance = new DeleteBranchRequestMarshaller();

    public static DeleteBranchRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteBranchRequest deleteBranchRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteBranchRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
