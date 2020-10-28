/**
 * null
 */
package blog.aws.referencedata;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.opensdk.protect.model.transform.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;

import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;
import com.amazonaws.SdkBaseException;

import blog.aws.referencedata.model.*;
import blog.aws.referencedata.model.transform.*;

/**
 * Client for accessing BlogReferenceData. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * 
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
class BlogReferenceDataClient implements BlogReferenceData {

    private final ClientHandler clientHandler;

    private static final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory = new com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl(
            new JsonClientMetadata().withProtocolVersion("1.1").withSupportsCbor(false).withSupportsIon(false).withContentTypeOverride("application/json")
                    .withBaseServiceExceptionClass(blog.aws.referencedata.model.BlogReferenceDataException.class));

    /**
     * Constructs a new client to invoke service methods on BlogReferenceData using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    BlogReferenceDataClient(AwsSyncClientParams clientParams) {
        this.clientHandler = new SdkClientHandler(new ClientHandlerParams().withClientParams(clientParams));
    }

    /**
     * @param deleteBranchRequest
     * @return Result of the DeleteBranch operation returned by the service.
     * @sample BlogReferenceData.DeleteBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/DeleteBranch"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteBranchResult deleteBranch(DeleteBranchRequest deleteBranchRequest) {
        HttpResponseHandler<DeleteBranchResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new DeleteBranchResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<DeleteBranchRequest, DeleteBranchResult>()
                .withMarshaller(new DeleteBranchRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(deleteBranchRequest));
    }

    /**
     * @param deleteDealerRequest
     * @return Result of the DeleteDealer operation returned by the service.
     * @sample BlogReferenceData.DeleteDealer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/DeleteDealer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDealerResult deleteDealer(DeleteDealerRequest deleteDealerRequest) {
        HttpResponseHandler<DeleteDealerResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new DeleteDealerResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<DeleteDealerRequest, DeleteDealerResult>()
                .withMarshaller(new DeleteDealerRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(deleteDealerRequest));
    }

    /**
     * @param deleteGenderRequest
     * @return Result of the DeleteGender operation returned by the service.
     * @sample BlogReferenceData.DeleteGender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/DeleteGender"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteGenderResult deleteGender(DeleteGenderRequest deleteGenderRequest) {
        HttpResponseHandler<DeleteGenderResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new DeleteGenderResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<DeleteGenderRequest, DeleteGenderResult>()
                .withMarshaller(new DeleteGenderRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(deleteGenderRequest));
    }

    /**
     * @param getBranchRequest
     * @return Result of the GetBranch operation returned by the service.
     * @sample BlogReferenceData.GetBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/GetBranch" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetBranchResult getBranch(GetBranchRequest getBranchRequest) {
        HttpResponseHandler<GetBranchResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new GetBranchResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetBranchRequest, GetBranchResult>()
                .withMarshaller(new GetBranchRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getBranchRequest));
    }

    /**
     * @param getDealerRequest
     * @return Result of the GetDealer operation returned by the service.
     * @sample BlogReferenceData.GetDealer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/GetDealer" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDealerResult getDealer(GetDealerRequest getDealerRequest) {
        HttpResponseHandler<GetDealerResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new GetDealerResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetDealerRequest, GetDealerResult>()
                .withMarshaller(new GetDealerRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getDealerRequest));
    }

    /**
     * @param getGenderRequest
     * @return Result of the GetGender operation returned by the service.
     * @sample BlogReferenceData.GetGender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/GetGender" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetGenderResult getGender(GetGenderRequest getGenderRequest) {
        HttpResponseHandler<GetGenderResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new GetGenderResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetGenderRequest, GetGenderResult>()
                .withMarshaller(new GetGenderRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getGenderRequest));
    }

    /**
     * @param postBranchRequest
     * @return Result of the PostBranch operation returned by the service.
     * @sample BlogReferenceData.PostBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/PostBranch"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PostBranchResult postBranch(PostBranchRequest postBranchRequest) {
        HttpResponseHandler<PostBranchResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostBranchResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostBranchRequest, PostBranchResult>()
                .withMarshaller(new PostBranchRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postBranchRequest));
    }

    /**
     * @param postDealerRequest
     * @return Result of the PostDealer operation returned by the service.
     * @sample BlogReferenceData.PostDealer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/PostDealer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PostDealerResult postDealer(PostDealerRequest postDealerRequest) {
        HttpResponseHandler<PostDealerResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostDealerResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostDealerRequest, PostDealerResult>()
                .withMarshaller(new PostDealerRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postDealerRequest));
    }

    /**
     * @param postGenderRequest
     * @return Result of the PostGender operation returned by the service.
     * @sample BlogReferenceData.PostGender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/PostGender"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PostGenderResult postGender(PostGenderRequest postGenderRequest) {
        HttpResponseHandler<PostGenderResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostGenderResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostGenderRequest, PostGenderResult>()
                .withMarshaller(new PostGenderRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postGenderRequest));
    }

    /**
     * @param putBranchRequest
     * @return Result of the PutBranch operation returned by the service.
     * @sample BlogReferenceData.PutBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/PutBranch" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutBranchResult putBranch(PutBranchRequest putBranchRequest) {
        HttpResponseHandler<PutBranchResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PutBranchResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PutBranchRequest, PutBranchResult>()
                .withMarshaller(new PutBranchRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(putBranchRequest));
    }

    /**
     * @param putDealerRequest
     * @return Result of the PutDealer operation returned by the service.
     * @sample BlogReferenceData.PutDealer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/PutDealer" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutDealerResult putDealer(PutDealerRequest putDealerRequest) {
        HttpResponseHandler<PutDealerResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PutDealerResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PutDealerRequest, PutDealerResult>()
                .withMarshaller(new PutDealerRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(putDealerRequest));
    }

    /**
     * @param putGenderRequest
     * @return Result of the PutGender operation returned by the service.
     * @sample BlogReferenceData.PutGender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/PutGender" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutGenderResult putGender(PutGenderRequest putGenderRequest) {
        HttpResponseHandler<PutGenderResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PutGenderResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PutGenderRequest, PutGenderResult>()
                .withMarshaller(new PutGenderRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(putGenderRequest));
    }

    /**
     * Create the error response handler for the operation.
     * 
     * @param errorShapeMetadata
     *        Error metadata for the given operation
     * @return Configured error response handler to pass to HTTP layer
     */
    private HttpResponseHandler<SdkBaseException> createErrorResponseHandler(JsonErrorShapeMetadata... errorShapeMetadata) {
        return protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata().withErrorShapes(Arrays.asList(errorShapeMetadata)));
    }

    @Override
    public void shutdown() {
        clientHandler.shutdown();
    }

}
