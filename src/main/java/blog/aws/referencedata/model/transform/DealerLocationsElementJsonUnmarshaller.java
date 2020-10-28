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
 * DealerLocationsElement JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DealerLocationsElementJsonUnmarshaller implements Unmarshaller<DealerLocationsElement, JsonUnmarshallerContext> {

    public DealerLocationsElement unmarshall(JsonUnmarshallerContext context) throws Exception {
        DealerLocationsElement dealerLocationsElement = new DealerLocationsElement();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AddressLine1", targetDepth)) {
                    context.nextToken();
                    dealerLocationsElement.setAddressLine1(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AddressLine2", targetDepth)) {
                    context.nextToken();
                    dealerLocationsElement.setAddressLine2(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("City", targetDepth)) {
                    context.nextToken();
                    dealerLocationsElement.setCity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    dealerLocationsElement.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Postcode", targetDepth)) {
                    context.nextToken();
                    dealerLocationsElement.setPostcode(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dealerLocationsElement;
    }

    private static DealerLocationsElementJsonUnmarshaller instance;

    public static DealerLocationsElementJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DealerLocationsElementJsonUnmarshaller();
        return instance;
    }
}
