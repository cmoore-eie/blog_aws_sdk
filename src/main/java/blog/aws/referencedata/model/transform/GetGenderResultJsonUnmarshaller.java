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
 * GetGenderResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGenderResultJsonUnmarshaller implements Unmarshaller<GetGenderResult, JsonUnmarshallerContext> {

    public GetGenderResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetGenderResult getGenderResult = new GetGenderResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getGenderResult;
        }

        while (true) {
            if (token == null)
                break;

            getGenderResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return getGenderResult;
    }

    private static GetGenderResultJsonUnmarshaller instance;

    public static GetGenderResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetGenderResultJsonUnmarshaller();
        return instance;
    }
}
