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
 * Dealer JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DealerJsonUnmarshaller implements Unmarshaller<Dealer, JsonUnmarshallerContext> {

    public Dealer unmarshall(JsonUnmarshallerContext context) throws Exception {
        Dealer dealer = new Dealer();

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
                if (context.testExpression("Code", targetDepth)) {
                    context.nextToken();
                    dealer.setCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DealerLocations", targetDepth)) {
                    context.nextToken();
                    dealer.setDealerLocations(new ListUnmarshaller<DealerLocationsElement>(DealerLocationsElementJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("EffectiveDate", targetDepth)) {
                    context.nextToken();
                    dealer.setEffectiveDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExpirationDate", targetDepth)) {
                    context.nextToken();
                    dealer.setExpirationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Locked", targetDepth)) {
                    context.nextToken();
                    dealer.setLocked(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    dealer.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UUID", targetDepth)) {
                    context.nextToken();
                    dealer.setUUID(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dealer;
    }

    private static DealerJsonUnmarshaller instance;

    public static DealerJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DealerJsonUnmarshaller();
        return instance;
    }
}
