package blog.aws.referencedata.sdk.util;


import blog.aws.referencedata.sdk.ApiClient;
import blog.aws.referencedata.sdk.api.DefaultApi;

public class ClientUtil {

    public static DefaultApi DealerClient(){
        return new ApiClient().buildClient(DefaultApi.class);
    }
}
