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
 * PutDealerRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutDealerRequestProtocolMarshaller implements Marshaller<Request<PutDealerRequest>, PutDealerRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.API_GATEWAY).requestUri("/development/dealer")
            .httpMethodName(HttpMethodName.PUT).hasExplicitPayloadMember(true).hasPayloadMembers(true).serviceName("BlogReferenceData").build();

    private final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory;

    public PutDealerRequestProtocolMarshaller(com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<PutDealerRequest> marshall(PutDealerRequest putDealerRequest) {

        if (putDealerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<PutDealerRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(SDK_OPERATION_BINDING,
                    putDealerRequest);

            protocolMarshaller.startMarshalling();
            PutDealerRequestMarshaller.getInstance().marshall(putDealerRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
