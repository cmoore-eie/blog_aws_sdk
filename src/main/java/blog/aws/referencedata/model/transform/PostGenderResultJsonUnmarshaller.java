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
 * PostGenderResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostGenderResultJsonUnmarshaller implements Unmarshaller<PostGenderResult, JsonUnmarshallerContext> {

    public PostGenderResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostGenderResult postGenderResult = new PostGenderResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postGenderResult;
        }

        while (true) {
            if (token == null)
                break;

            postGenderResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postGenderResult;
    }

    private static PostGenderResultJsonUnmarshaller instance;

    public static PostGenderResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostGenderResultJsonUnmarshaller();
        return instance;
    }
}
