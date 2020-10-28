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
 * PutDealerResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDealerResultJsonUnmarshaller implements Unmarshaller<PutDealerResult, JsonUnmarshallerContext> {

    public PutDealerResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutDealerResult putDealerResult = new PutDealerResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return putDealerResult;
        }

        while (true) {
            if (token == null)
                break;

            putDealerResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return putDealerResult;
    }

    private static PutDealerResultJsonUnmarshaller instance;

    public static PutDealerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutDealerResultJsonUnmarshaller();
        return instance;
    }
}
