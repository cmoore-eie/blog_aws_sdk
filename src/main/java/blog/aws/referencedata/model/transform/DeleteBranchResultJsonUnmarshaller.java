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
 * DeleteBranchResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBranchResultJsonUnmarshaller implements Unmarshaller<DeleteBranchResult, JsonUnmarshallerContext> {

    public DeleteBranchResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteBranchResult deleteBranchResult = new DeleteBranchResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return deleteBranchResult;
        }

        while (true) {
            if (token == null)
                break;

            deleteBranchResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return deleteBranchResult;
    }

    private static DeleteBranchResultJsonUnmarshaller instance;

    public static DeleteBranchResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteBranchResultJsonUnmarshaller();
        return instance;
    }
}
