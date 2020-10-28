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
 * GetBranchResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBranchResultJsonUnmarshaller implements Unmarshaller<GetBranchResult, JsonUnmarshallerContext> {

    public GetBranchResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetBranchResult getBranchResult = new GetBranchResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getBranchResult;
        }

        while (true) {
            if (token == null)
                break;

            getBranchResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return getBranchResult;
    }

    private static GetBranchResultJsonUnmarshaller instance;

    public static GetBranchResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetBranchResultJsonUnmarshaller();
        return instance;
    }
}