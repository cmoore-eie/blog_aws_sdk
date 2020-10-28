/**
 * null
 */
package blog.aws.referencedata.model.transform;

import java.math.*;

import javax.annotation.Generated;

import blog.aws.referencedata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PostDealerResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostDealerResultJsonUnmarshaller implements Unmarshaller<PostDealerResult, JsonUnmarshallerContext> {

    public PostDealerResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostDealerResult postDealerResult = new PostDealerResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postDealerResult;
        }

        while (true) {
            if (token == null)
                break;

            postDealerResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postDealerResult;
    }

    private static PostDealerResultJsonUnmarshaller instance;

    public static PostDealerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostDealerResultJsonUnmarshaller();
        return instance;
    }
}
