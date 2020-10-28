package blog.aws.referencedata.sdk.api;

import blog.aws.referencedata.sdk.ApiClient;
import blog.aws.referencedata.sdk.model.Branch;
import blog.aws.referencedata.sdk.model.Dealer;
import blog.aws.referencedata.sdk.model.Gender;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private DefaultApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(DefaultApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void branchDeleteTest() {
        // Object response = api.branchDelete();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void branchGetTest() {
        // Object response = api.branchGet();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void branchPostTest() {
        Branch branch = null;
        // Object response = api.branchPost(branch);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void branchPutTest() {
        Branch branch = null;
        // Object response = api.branchPut(branch);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void dealerDeleteTest() {
        // Object response = api.dealerDelete();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void dealerGetTest() {
        // Object response = api.dealerGet();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void dealerPostTest() {
        Dealer dealer = null;
        // Object response = api.dealerPost(dealer);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void dealerPutTest() {
        Dealer dealer = null;
        // Object response = api.dealerPut(dealer);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void genderDeleteTest() {
        // Object response = api.genderDelete();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void genderGetTest() {
        // Object response = api.genderGet();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void genderPostTest() {
        Gender gender = null;
        // Object response = api.genderPost(gender);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void genderPutTest() {
        Gender gender = null;
        // Object response = api.genderPut(gender);

        // TODO: test validations
    }

    
}
