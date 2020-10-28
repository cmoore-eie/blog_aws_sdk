/**
 * null
 */
package blog.aws.referencedata;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.Protocol;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link blog.aws.referencedata.BlogReferenceData}.
 * 
 * @see blog.aws.referencedata.BlogReferenceData#builder
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class BlogReferenceDataClientBuilder extends SdkSyncClientBuilder<BlogReferenceDataClientBuilder, BlogReferenceData> {

    private static final URI DEFAULT_ENDPOINT = RuntimeHttpUtils.toUri("vxymc6j9r0.execute-api.us-east-1.amazonaws.com", Protocol.HTTPS);
    private static final String DEFAULT_REGION = "us-east-1";

    /**
     * Package private constructor - builder should be created via {@link BlogReferenceData#builder()}
     */
    BlogReferenceDataClientBuilder() {
        super(new ApiGatewayClientConfigurationFactory());
    }

    /**
     * Construct a synchronous implementation of BlogReferenceData using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of BlogReferenceData.
     */
    @Override
    protected BlogReferenceData build(AwsSyncClientParams params) {
        return new BlogReferenceDataClient(params);
    }

    @Override
    protected URI defaultEndpoint() {
        return DEFAULT_ENDPOINT;
    }

    @Override
    protected String defaultRegion() {
        return DEFAULT_REGION;
    }

}
