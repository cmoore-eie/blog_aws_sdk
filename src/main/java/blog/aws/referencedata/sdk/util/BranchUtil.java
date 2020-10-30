package blog.aws.referencedata.sdk.util;

import blog.aws.referencedata.sdk.ApiClient;
import blog.aws.referencedata.sdk.api.DefaultApi;
import blog.aws.referencedata.sdk.model.Branch;

import java.util.HashMap;
import java.util.List;

public class BranchUtil {
    public static DefaultApi getApi() {
        return new ApiClient().buildClient(DefaultApi.class);
    }

    public BranchUtil(){
    }

    public static List<Branch> branchList(HashMap<String, Object> queryParams){
        DefaultApi api = new ApiClient().buildClient(DefaultApi.class);
        return branchList(api, queryParams);
    }

    public static List<Branch> branchList(DefaultApi api, HashMap<String, Object> queryParams){
//        return api.branchGet();
        return null;
    }

}
