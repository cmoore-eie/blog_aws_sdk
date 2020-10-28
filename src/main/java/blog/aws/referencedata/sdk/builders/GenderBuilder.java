package blog.aws.referencedata.sdk.builders;

import blog.aws.referencedata.sdk.ApiClient;
import blog.aws.referencedata.sdk.api.DefaultApi;
import blog.aws.referencedata.sdk.model.Gender;

import java.util.Date;
import java.util.UUID;

public class GenderBuilder {

    Gender builtObject;

    public GenderBuilder() {
        builtObject = new Gender();
    }

    public GenderBuilder withDefaults() {
        withItemIdentifier(UUID.randomUUID().toString());
        return this;
    }

    public Gender getGender() {
        return builtObject;
    }

    public GenderBuilder withItemIdentifier(String inItem) {
        builtObject.setUUID(inItem);
        return this;
    }

    public GenderBuilder withEffectiveDate(String inItem) {
        builtObject.setEffectiveDate(inItem);
        return this;
    }

    public GenderBuilder withExpirationDate(String inItem) {
        builtObject.setExpirationDate(inItem);
        return this;
    }

    public GenderBuilder withCode(String inItem) {
        builtObject.setCode(inItem);
        return this;
    }

    public GenderBuilder withLocked(boolean inItem) {
        builtObject.setLocked(inItem);
        return this;
    }

    public GenderBuilder withName(String inItem) {
        builtObject.setName(inItem);
        return this;
    }

    public void update() {
        DefaultApi api = new ApiClient().buildClient(DefaultApi.class);
        api.genderPost(builtObject);
    }
}
