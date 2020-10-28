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
 * PutGenderResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutGenderResultJsonUnmarshaller implements Unmarshaller<PutGenderResult, JsonUnmarshallerContext> {

    public PutGenderResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutGenderResult putGenderResult = new PutGenderResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return putGenderResult;
        }

        while (true) {
            if (token == null)
                break;

            putGenderResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return putGenderResult;
    }

    private static PutGenderResultJsonUnmarshaller instance;

    public static PutGenderResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutGenderResultJsonUnmarshaller();
        return instance;
    }
}
