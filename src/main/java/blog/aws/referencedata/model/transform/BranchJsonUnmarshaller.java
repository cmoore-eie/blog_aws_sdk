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
 * Branch JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BranchJsonUnmarshaller implements Unmarshaller<Branch, JsonUnmarshallerContext> {

    public Branch unmarshall(JsonUnmarshallerContext context) throws Exception {
        Branch branch = new Branch();

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
                if (context.testExpression("BranchType", targetDepth)) {
                    context.nextToken();
                    branch.setBranchType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Code", targetDepth)) {
                    context.nextToken();
                    branch.setCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EffectiveDate", targetDepth)) {
                    context.nextToken();
                    branch.setEffectiveDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExpirationDate", targetDepth)) {
                    context.nextToken();
                    branch.setExpirationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Locked", targetDepth)) {
                    context.nextToken();
                    branch.setLocked(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    branch.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UUID", targetDepth)) {
                    context.nextToken();
                    branch.setUUID(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return branch;
    }

    private static BranchJsonUnmarshaller instance;

    public static BranchJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BranchJsonUnmarshaller();
        return instance;
    }
}
