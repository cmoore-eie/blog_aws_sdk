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
 * DeleteGenderResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteGenderResultJsonUnmarshaller implements Unmarshaller<DeleteGenderResult, JsonUnmarshallerContext> {

    public DeleteGenderResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteGenderResult deleteGenderResult = new DeleteGenderResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return deleteGenderResult;
        }

        while (true) {
            if (token == null)
                break;

            deleteGenderResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return deleteGenderResult;
    }

    private static DeleteGenderResultJsonUnmarshaller instance;

    public static DeleteGenderResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteGenderResultJsonUnmarshaller();
        return instance;
    }
}
