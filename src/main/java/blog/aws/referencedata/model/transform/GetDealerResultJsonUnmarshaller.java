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
 * GetDealerResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDealerResultJsonUnmarshaller implements Unmarshaller<GetDealerResult, JsonUnmarshallerContext> {

    public GetDealerResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDealerResult getDealerResult = new GetDealerResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getDealerResult;
        }

        while (true) {
            if (token == null)
                break;

            getDealerResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return getDealerResult;
    }

    private static GetDealerResultJsonUnmarshaller instance;

    public static GetDealerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDealerResultJsonUnmarshaller();
        return instance;
    }
}
