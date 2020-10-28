package blog.aws.referencedata.sdk.builders;

import blog.aws.referencedata.sdk.ApiClient;
import blog.aws.referencedata.sdk.api.DefaultApi;
import blog.aws.referencedata.sdk.model.Dealer;
import blog.aws.referencedata.sdk.model.DealerDealerLocations;

import java.util.ArrayList;
import java.util.UUID;

public class DealerBuilder {

    Dealer builtObject;

    public DealerBuilder(){
        builtObject = new Dealer();
    }

    public Dealer getDealer(){
        return builtObject;
    }

    public DealerBuilder withDefaults(){
        withItemIdentifier(UUID.randomUUID().toString());
        return this;
    }

    public DealerBuilder withItemIdentifier(String inItem) {
        builtObject.setUUID(inItem);
        return this;
    }

    public DealerBuilder withEffectiveDate(String inItem) {
        builtObject.setEffectiveDate(inItem);
        return this;
    }

    public DealerBuilder withExpirationDate(String inItem) {
        builtObject.setExpirationDate(inItem);
        return this;
    }

    public DealerBuilder withCode(String inItem) {
        builtObject.setCode(inItem);
        return this;
    }

    public DealerBuilder withLocked(boolean inItem) {
        builtObject.setLocked(inItem);
        return this;
    }

    public DealerBuilder withName(String inItem) {
        builtObject.setName(inItem);
        return this;
    }

    public DealerBuilder withDealerLocations(DealerDealerLocations inItem){
        if(builtObject.getDealerLocations() == null){
            builtObject.setDealerLocations(new ArrayList<DealerDealerLocations>());
        }
        builtObject.addDealerLocationsItem(inItem);
        return this;
    }

    public void update() {
        DefaultApi api = new ApiClient().buildClient(DefaultApi.class);
        api.dealerPost(builtObject);
    }
}
