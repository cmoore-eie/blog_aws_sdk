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
 * DeleteDealerRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteDealerRequestMarshaller {

    private static final DeleteDealerRequestMarshaller instance = new DeleteDealerRequestMarshaller();

    public static DeleteDealerRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteDealerRequest deleteDealerRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteDealerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
