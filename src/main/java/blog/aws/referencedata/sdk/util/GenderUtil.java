package blog.aws.referencedata.sdk.util;

import blog.aws.referencedata.sdk.ApiClient;
import blog.aws.referencedata.sdk.api.DefaultApi;
import blog.aws.referencedata.sdk.builders.GenderBuilder;
import blog.aws.referencedata.sdk.model.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class GenderUtil {
    public static DefaultApi getApi() {
        return new ApiClient().buildClient(DefaultApi.class);
    }

    public GenderUtil(){
    }

    public static List<Gender> genderList(){
        DefaultApi api = new ApiClient().buildClient(DefaultApi.class);
        return genderList(api);
    }

    public static List<Gender> genderList(DefaultApi api){
        ArrayList<Gender> retVal = new ArrayList<Gender>();
        LinkedHashMap response = (LinkedHashMap) api.genderAllGet();
        LinkedHashMap result = (LinkedHashMap) response.get("result");
        ArrayList<LinkedHashMap> items = (ArrayList<LinkedHashMap>) result.get("Items");
        for(LinkedHashMap item: items){
            retVal.add(new GenderBuilder(item).getGender());
        }
        return retVal;
    }

}
