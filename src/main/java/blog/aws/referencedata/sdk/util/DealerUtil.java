package blog.aws.referencedata.sdk.util;

import blog.aws.referencedata.sdk.ApiClient;
import blog.aws.referencedata.sdk.api.DefaultApi;
import blog.aws.referencedata.sdk.model.Dealer;

import java.util.HashMap;
import java.util.List;

public class DealerUtil {
    public static DefaultApi getApi() {
        return new ApiClient().buildClient(DefaultApi.class);
    }

    public DealerUtil(){
    }

    public static List<Dealer> dealerList(HashMap<String, Object> queryParams){
        DefaultApi api = new ApiClient().buildClient(DefaultApi.class);
        return dealerList(api, queryParams);
    }

    public static List<Dealer> dealerList(DefaultApi api, HashMap<String, Object> queryParams){
//        return api.dealerGet(queryParams);
        return null;
    }

}
