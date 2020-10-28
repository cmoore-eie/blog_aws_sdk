/**
 * null
 */
package blog.aws.referencedata.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;

import com.amazonaws.http.HttpMethodName;
import blog.aws.referencedata.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.*;
import com.amazonaws.protocol.Protocol;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeleteGenderRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteGenderRequestProtocolMarshaller implements Marshaller<Request<DeleteGenderRequest>, DeleteGenderRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.API_GATEWAY).requestUri("/development/gender")
            .httpMethodName(HttpMethodName.DELETE).hasExplicitPayloadMember(false).hasPayloadMembers(false).serviceName("BlogReferenceData").build();

    private final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory;

    public DeleteGenderRequestProtocolMarshaller(com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DeleteGenderRequest> marshall(DeleteGenderRequest deleteGenderRequest) {

        if (deleteGenderRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<DeleteGenderRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(SDK_OPERATION_BINDING,
                    deleteGenderRequest);

            protocolMarshaller.startMarshalling();
            DeleteGenderRequestMarshaller.getInstance().marshall(deleteGenderRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
