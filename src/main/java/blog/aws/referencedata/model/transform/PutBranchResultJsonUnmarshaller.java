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
 * PutBranchResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutBranchResultJsonUnmarshaller implements Unmarshaller<PutBranchResult, JsonUnmarshallerContext> {

    public PutBranchResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutBranchResult putBranchResult = new PutBranchResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return putBranchResult;
        }

        while (true) {
            if (token == null)
                break;

            putBranchResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return putBranchResult;
    }

    private static PutBranchResultJsonUnmarshaller instance;

    public static PutBranchResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutBranchResultJsonUnmarshaller();
        return instance;
    }
}
