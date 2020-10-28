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
 * DeleteGenderRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteGenderRequestMarshaller {

    private static final DeleteGenderRequestMarshaller instance = new DeleteGenderRequestMarshaller();

    public static DeleteGenderRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteGenderRequest deleteGenderRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteGenderRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
