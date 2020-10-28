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
 * PostBranchResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostBranchResultJsonUnmarshaller implements Unmarshaller<PostBranchResult, JsonUnmarshallerContext> {

    public PostBranchResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostBranchResult postBranchResult = new PostBranchResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postBranchResult;
        }

        while (true) {
            if (token == null)
                break;

            postBranchResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postBranchResult;
    }

    private static PostBranchResultJsonUnmarshaller instance;

    public static PostBranchResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostBranchResultJsonUnmarshaller();
        return instance;
    }
}
