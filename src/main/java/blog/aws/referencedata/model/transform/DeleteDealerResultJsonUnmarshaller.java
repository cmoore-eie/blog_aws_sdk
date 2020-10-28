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
 * DeleteDealerResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDealerResultJsonUnmarshaller implements Unmarshaller<DeleteDealerResult, JsonUnmarshallerContext> {

    public DeleteDealerResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteDealerResult deleteDealerResult = new DeleteDealerResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return deleteDealerResult;
        }

        while (true) {
            if (token == null)
                break;

            deleteDealerResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return deleteDealerResult;
    }

    private static DeleteDealerResultJsonUnmarshaller instance;

    public static DeleteDealerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteDealerResultJsonUnmarshaller();
        return instance;
    }
}
