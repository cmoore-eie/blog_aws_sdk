/**
 * null
 */
package blog.aws.referencedata;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import blog.aws.referencedata.model.*;

/**
 * Interface for accessing BlogReferenceData.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface BlogReferenceData {

    /**
     * @param deleteBranchRequest
     * @return Result of the DeleteBranch operation returned by the service.
     * @sample BlogReferenceData.DeleteBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/DeleteBranch"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteBranchResult deleteBranch(DeleteBranchRequest deleteBranchRequest);

    /**
     * @param deleteDealerRequest
     * @return Result of the DeleteDealer operation returned by the service.
     * @sample BlogReferenceData.DeleteDealer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/DeleteDealer"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDealerResult deleteDealer(DeleteDealerRequest deleteDealerRequest);

    /**
     * @param deleteGenderRequest
     * @return Result of the DeleteGender operation returned by the service.
     * @sample BlogReferenceData.DeleteGender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/DeleteGender"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteGenderResult deleteGender(DeleteGenderRequest deleteGenderRequest);

    /**
     * @param getBranchRequest
     * @return Result of the GetBranch operation returned by the service.
     * @sample BlogReferenceData.GetBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/GetBranch" target="_top">AWS
     *      API Documentation</a>
     */
    GetBranchResult getBranch(GetBranchRequest getBranchRequest);

    /**
     * @param getDealerRequest
     * @return Result of the GetDealer operation returned by the service.
     * @sample BlogReferenceData.GetDealer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/GetDealer" target="_top">AWS
     *      API Documentation</a>
     */
    GetDealerResult getDealer(GetDealerRequest getDealerRequest);

    /**
     * @param getGenderRequest
     * @return Result of the GetGender operation returned by the service.
     * @sample BlogReferenceData.GetGender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/GetGender" target="_top">AWS
     *      API Documentation</a>
     */
    GetGenderResult getGender(GetGenderRequest getGenderRequest);

    /**
     * @param postBranchRequest
     * @return Result of the PostBranch operation returned by the service.
     * @sample BlogReferenceData.PostBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/PostBranch"
     *      target="_top">AWS API Documentation</a>
     */
    PostBranchResult postBranch(PostBranchRequest postBranchRequest);

    /**
     * @param postDealerRequest
     * @return Result of the PostDealer operation returned by the service.
     * @sample BlogReferenceData.PostDealer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/PostDealer"
     *      target="_top">AWS API Documentation</a>
     */
    PostDealerResult postDealer(PostDealerRequest postDealerRequest);

    /**
     * @param postGenderRequest
     * @return Result of the PostGender operation returned by the service.
     * @sample BlogReferenceData.PostGender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/PostGender"
     *      target="_top">AWS API Documentation</a>
     */
    PostGenderResult postGender(PostGenderRequest postGenderRequest);

    /**
     * @param putBranchRequest
     * @return Result of the PutBranch operation returned by the service.
     * @sample BlogReferenceData.PutBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/PutBranch" target="_top">AWS
     *      API Documentation</a>
     */
    PutBranchResult putBranch(PutBranchRequest putBranchRequest);

    /**
     * @param putDealerRequest
     * @return Result of the PutDealer operation returned by the service.
     * @sample BlogReferenceData.PutDealer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/PutDealer" target="_top">AWS
     *      API Documentation</a>
     */
    PutDealerResult putDealer(PutDealerRequest putDealerRequest);

    /**
     * @param putGenderRequest
     * @return Result of the PutGender operation returned by the service.
     * @sample BlogReferenceData.PutGender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/PutGender" target="_top">AWS
     *      API Documentation</a>
     */
    PutGenderResult putGender(PutGenderRequest putGenderRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static BlogReferenceDataClientBuilder builder() {
        return new BlogReferenceDataClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}
