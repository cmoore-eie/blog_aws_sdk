package blog.aws.referencedata.sdk.api;

import blog.aws.referencedata.sdk.ApiClient;
import blog.aws.referencedata.sdk.EncodingUtils;

import blog.aws.referencedata.sdk.model.Branch;
import blog.aws.referencedata.sdk.model.Dealer;
import blog.aws.referencedata.sdk.model.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;


public interface DefaultApi extends ApiClient.Api {


  /**
   * 
   * 
   * @return Object
   */
  @RequestLine("GET /branch-all")
  @Headers({
    "Accept: application/json",
  })
  Object branchAllGet();

  /**
   * 
   * 
   * @param itemUUID  (required)
   * @return Object
   */
  @RequestLine("DELETE /branch?ItemUUID={itemUUID}")
  @Headers({
    "Accept: application/json",
  })
  Object branchDelete(@Param("itemUUID") String itemUUID);

  /**
   * 
   * 
   * Note, this is equivalent to the other <code>branchDelete</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BranchDeleteQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>itemUUID -  (required)</li>
   *   </ul>
   * @return Object
   */
  @RequestLine("DELETE /branch?ItemUUID={itemUUID}")
  @Headers({
  "Accept: application/json",
  })
  Object branchDelete(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>branchDelete</code> method in a fluent style.
   */
  public static class BranchDeleteQueryParams extends HashMap<String, Object> {
    public BranchDeleteQueryParams itemUUID(final String value) {
      put("ItemUUID", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param itemUUID  (required)
   * @return Object
   */
  @RequestLine("GET /branch?ItemUUID={itemUUID}")
  @Headers({
    "Accept: application/json",
  })
  Object branchGet(@Param("itemUUID") String itemUUID);

  /**
   * 
   * 
   * Note, this is equivalent to the other <code>branchGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BranchGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>itemUUID -  (required)</li>
   *   </ul>
   * @return Object
   */
  @RequestLine("GET /branch?ItemUUID={itemUUID}")
  @Headers({
  "Accept: application/json",
  })
  Object branchGet(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>branchGet</code> method in a fluent style.
   */
  public static class BranchGetQueryParams extends HashMap<String, Object> {
    public BranchGetQueryParams itemUUID(final String value) {
      put("ItemUUID", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param branch  (required)
   * @return Object
   */
  @RequestLine("POST /branch")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Object branchPost(Branch branch);

  /**
   * 
   * 
   * @param branch  (required)
   * @return Object
   */
  @RequestLine("PUT /branch")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Object branchPut(Branch branch);

  /**
   * 
   * 
   * @return Object
   */
  @RequestLine("GET /dealer-all")
  @Headers({
    "Accept: application/json",
  })
  Object dealerAllGet();

  /**
   * 
   * 
   * @param itemUUID  (required)
   * @return Object
   */
  @RequestLine("DELETE /dealer?ItemUUID={itemUUID}")
  @Headers({
    "Accept: application/json",
  })
  Object dealerDelete(@Param("itemUUID") String itemUUID);

  /**
   * 
   * 
   * Note, this is equivalent to the other <code>dealerDelete</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DealerDeleteQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>itemUUID -  (required)</li>
   *   </ul>
   * @return Object
   */
  @RequestLine("DELETE /dealer?ItemUUID={itemUUID}")
  @Headers({
  "Accept: application/json",
  })
  Object dealerDelete(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>dealerDelete</code> method in a fluent style.
   */
  public static class DealerDeleteQueryParams extends HashMap<String, Object> {
    public DealerDeleteQueryParams itemUUID(final String value) {
      put("ItemUUID", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param itemUUID  (required)
   */
  @RequestLine("GET /dealer?ItemUUID={itemUUID}")
  @Headers({
    "Accept: application/json",
  })
  void dealerGet(@Param("itemUUID") String itemUUID);

  /**
   * 
   * 
   * Note, this is equivalent to the other <code>dealerGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DealerGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>itemUUID -  (required)</li>
   *   </ul>
   */
  @RequestLine("GET /dealer?ItemUUID={itemUUID}")
  @Headers({
  "Accept: application/json",
  })
  void dealerGet(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>dealerGet</code> method in a fluent style.
   */
  public static class DealerGetQueryParams extends HashMap<String, Object> {
    public DealerGetQueryParams itemUUID(final String value) {
      put("ItemUUID", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param dealer  (required)
   * @return Object
   */
  @RequestLine("POST /dealer")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Object dealerPost(Dealer dealer);

  /**
   * 
   * 
   * @param dealer  (required)
   * @return Object
   */
  @RequestLine("PUT /dealer")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Object dealerPut(Dealer dealer);

  /**
   * 
   * 
   * @return Object
   */
  @RequestLine("GET /gender-all")
  @Headers({
    "Accept: application/json",
  })
  Object genderAllGet();

  /**
   * 
   * 
   * @param itemUUID  (required)
   * @return Object
   */
  @RequestLine("DELETE /gender?ItemUUID={itemUUID}")
  @Headers({
    "Accept: application/json",
  })
  Object genderDelete(@Param("itemUUID") String itemUUID);

  /**
   * 
   * 
   * Note, this is equivalent to the other <code>genderDelete</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GenderDeleteQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>itemUUID -  (required)</li>
   *   </ul>
   * @return Object
   */
  @RequestLine("DELETE /gender?ItemUUID={itemUUID}")
  @Headers({
  "Accept: application/json",
  })
  Object genderDelete(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>genderDelete</code> method in a fluent style.
   */
  public static class GenderDeleteQueryParams extends HashMap<String, Object> {
    public GenderDeleteQueryParams itemUUID(final String value) {
      put("ItemUUID", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param itemUUID  (required)
   * @return Object
   */
  @RequestLine("GET /gender?ItemUUID={itemUUID}")
  @Headers({
    "Accept: application/json",
  })
  Object genderGet(@Param("itemUUID") String itemUUID);

  /**
   * 
   * 
   * Note, this is equivalent to the other <code>genderGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GenderGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>itemUUID -  (required)</li>
   *   </ul>
   * @return Object
   */
  @RequestLine("GET /gender?ItemUUID={itemUUID}")
  @Headers({
  "Accept: application/json",
  })
  Object genderGet(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>genderGet</code> method in a fluent style.
   */
  public static class GenderGetQueryParams extends HashMap<String, Object> {
    public GenderGetQueryParams itemUUID(final String value) {
      put("ItemUUID", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param gender  (required)
   * @return Object
   */
  @RequestLine("POST /gender")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Object genderPost(Gender gender);

  /**
   * 
   * 
   * @param gender  (required)
   * @return Object
   */
  @RequestLine("PUT /gender")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Object genderPut(Gender gender);
}
