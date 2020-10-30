package blog.aws.referencedata.sdk.api;

import blog.aws.referencedata.sdk.builders.GenderBuilder;
import blog.aws.referencedata.sdk.model.Gender;
import blog.aws.referencedata.sdk.util.ConversionUtil;
import blog.aws.referencedata.sdk.util.GenderUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * API tests for GenderApi
 */
public class GenderApiTest {

    private Gender gender_data;
    private List<String> cleanupItems;
    private DefaultApi api;

    @Before
    public void setup() {
        api = GenderUtil.getApi();
        cleanupItems = new ArrayList<String>();
        gender_data = setupGender();
    }

    @Test
    public void genderCleanUpTest() {
        maybeCreate();
        cleanUp();
//        DefaultApi.GenderListQueryParams query_params = new GenderApi.GenderListQueryParams();
//        List<Gender> itemList = GenderUtil.genderList(api, query_params);
/*        boolean found = false;
        for(Gender item: itemList){
            if(cleanupItems.contains(item.getItemIdentifier())){
                found = true;
                break;
            }
        }
        Assert.assertFalse(found);*/
    }

    @Test
    public void genderCreateTest() {
        Object response = GenderUtil.getApi().genderPost(gender_data);
        Object test = findGender(gender_data.getUUID());
        Object test1 = GenderUtil.genderList();
        Object x = null;
//        Gender response = GenderUtil.getApi().genderPost(gender_data);
/*        Assert.assertEquals(response.getItemIdentifier(), gender_data.getItemIdentifier());
        cleanUp();*/
    }

    @Test
    public void genderDeleteTest() {
/*        Gender response = GenderUtil.getApi().genderCreate(gender_data);
        String itemIdentifier = gender_data.getItemIdentifier();
        GenderUtil.getApi().genderDelete(itemIdentifier);
        List<Gender> check_list = findGender(gender_data.getItemIdentifier());
        Assert.assertTrue(check_list.isEmpty());
        cleanUp();*/
    }

    @Test
    public void genderListTest() {
/*        maybeCreate();
        GenderApi.GenderListQueryParams query_params = new GenderApi.GenderListQueryParams();
        List<Gender> response = GenderUtil.genderList(query_params);
        Assert.assertTrue(response.size() > 0);
        //
        // Extract Gender using the identifier of one of the versions
        //
        GenderApi.GenderListQueryParams query_view_params = new GenderApi.GenderListQueryParams();
        query_view_params.withUuid(response.get(0).getItemIdentifier());
        List<Gender> version_response = GenderUtil.genderList(api, query_view_params);
        Assert.assertEquals(version_response.size(), 1);
        cleanUp();*/
    }

    @Test
    public void genderPartialUpdateTest() {
        String itemIdentifierInternal = null;
        Gender data = null;
        // Gender response = api.genderPartialUpdate(itemIdentifierInternal, data);

        // TODO: test validations
    }

    @Test
    public void genderReadTest() {
/*        maybeCreate();
        String itemIdentifier = gender_data.getItemIdentifier();
        Gender response = GenderUtil.getApi().genderRead(itemIdentifier);
        Assert.assertEquals(response.getItemIdentifier(), gender_data.getItemIdentifier());
        cleanUp();*/
    }

    @Test
    public void genderUpdateTest() {
/*        maybeCreate();
        //
        // Change Data on the Virtual Product
        //
        String itemIdentifier = gender_data.getItemIdentifier();
        Gender data = GenderUtil.getApi().genderRead(itemIdentifier);
        data.setName("Changed Name");
        data.setLocked(true);

        Gender response = GenderUtil.getApi().genderUpdate(itemIdentifier, data);
        Gender changed = GenderUtil.getApi().genderRead(itemIdentifier);
        Assert.assertNotNull(changed);
        Assert.assertEquals(changed.getName(), "Changed Name");
        Assert.assertNotNull(changed.getLocked());
        Assert.assertTrue(changed.getLocked());
        cleanUp();*/
    }

    private Gender setupGender(){

        GenderBuilder genderBuilder = new GenderBuilder()
                .withDefaults()
                .withCode("testcode")
                .withName("Test Code")
                .withEffectiveDate("2020-01-01");

        Gender data = genderBuilder.getGender();

//        cleanupItems.add(data.getItemIdentifier());

        return data;
    }

    /**
     * Remove the ones that have been created for the test and leave what was in the database before
     */
    private void cleanUp(){
/*        for(String identifier: cleanupItems) {
            GenderApi.GenderListQueryParams query_params = new GenderApi.GenderListQueryParams();
            query_params.withUuid(identifier);
            List<Gender> itemList = GenderUtil.getApi().genderList(query_params);
            for (Gender itemLoop : itemList) {
                GenderUtil.getApi().genderDelete(itemLoop.getItemIdentifier());
            }
        }*/
    }

    private void maybeCreate(){
/*        List<Gender> check_list = findGender(gender_data.getItemIdentifier());
        if(check_list.isEmpty()){
            Gender create_response = GenderUtil.getApi().genderCreate(gender_data);
        }*/
    }

    private List<Gender> findGender(String inIdentifier){
        Map<String, Object> queryParams = new HashMap<String, Object>();
        queryParams.put("ItemUUID", inIdentifier);
        LinkedHashMap test = (LinkedHashMap) api.genderGet(queryParams);
/*        GenderApi.GenderListQueryParams check_query = new GenderApi.GenderListQueryParams();
        check_query.withUuid(gender_data.getItemIdentifier());
        return GenderUtil.genderList(api, check_query);
        Object test = api.genderGet(inIdentifier);*/
        return null;
    }
}
