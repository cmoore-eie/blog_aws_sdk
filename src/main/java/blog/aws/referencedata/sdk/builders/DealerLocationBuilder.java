package blog.aws.referencedata.sdk.builders;

import blog.aws.referencedata.sdk.model.DealerDealerLocations;


public class DealerLocationBuilder {

    DealerDealerLocations builtObject;

    public DealerLocationBuilder(){
        builtObject = new DealerDealerLocations();
    }

    public DealerDealerLocations getDealerLocation(){
        return builtObject;
    }


    public DealerLocationBuilder withAddressLine1(String inItem){
        builtObject.setAddressLine1(inItem);
        return this;
    }

    public DealerLocationBuilder withAddressLine2(String inItem){
        builtObject.setAddressLine2(inItem);
        return this;
    }

    public DealerLocationBuilder withCity(String inItem){
        builtObject.setCity(inItem);
        return this;
    }

    public DealerLocationBuilder withLocationName(String inItem){
        builtObject.setName(inItem);
        return this;
    }

    public DealerLocationBuilder withPostCode(String inItem){
        builtObject.setPostcode(inItem);
        return this;
    }
}
