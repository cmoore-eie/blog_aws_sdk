package blog.aws.referencedata.sdk.builders;


import blog.aws.referencedata.sdk.ApiClient;
import blog.aws.referencedata.sdk.api.DefaultApi;
import blog.aws.referencedata.sdk.model.Branch;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.UUID;

public class BranchBuilder {

    Branch builtObject;

    public BranchBuilder() {
        builtObject = new Branch();
    }

    public BranchBuilder(LinkedHashMap item) {
        builtObject = new Branch();
        if(item.containsKey("ItemType")){

        }
        if(item.containsKey("Code")){
            withCode((String) item.get("Code"));
        }
        if(item.containsKey("ItemUUID")){
            withItemIdentifier((String) item.get("ItemUUID"));
        }
        if(item.containsKey("Name")){
            withItemIdentifier((String) item.get("Name"));
        }
    }

    public BranchBuilder withDefaults() {
        withItemIdentifier(UUID.randomUUID().toString());
        return this;
    }

    public Branch getBranch() {
        return builtObject;
    }

    public BranchBuilder withItemIdentifier(String inItem) {
        builtObject.setUUID(inItem);
        return this;
    }

    public BranchBuilder withEffectiveDate(String inItem) {
        builtObject.setEffectiveDate(inItem);
        return this;
    }

    public BranchBuilder withExpirationDate(String inItem) {
        builtObject.setExpirationDate(inItem);
        return this;
    }

    public BranchBuilder withCode(String inItem) {
        builtObject.setCode(inItem);
        return this;
    }

    public BranchBuilder withLocked(boolean inItem) {
        builtObject.setLocked(inItem);
        return this;
    }

    public BranchBuilder withName(String inItem) {
        builtObject.setName(inItem);
        return this;
    }

    public BranchBuilder withBranchType(Branch.BranchTypeEnum inItem){
        builtObject.setBranchType(inItem);
        return this;
    }

    public void update() {
        DefaultApi api = new ApiClient().buildClient(DefaultApi.class);
        api.branchPost(builtObject);
    }
}
