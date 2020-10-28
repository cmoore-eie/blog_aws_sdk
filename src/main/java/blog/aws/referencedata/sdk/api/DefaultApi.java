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
  @RequestLine("DELETE /branch")
  @Headers({
    "Accept: application/json",
  })
  Object branchDelete();

  /**
   * 
   * 
   * @return Object
   */
  @RequestLine("GET /branch")
  @Headers({
    "Accept: application/json",
  })
  Object branchGet();

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
  @RequestLine("DELETE /dealer")
  @Headers({
    "Accept: application/json",
  })
  Object dealerDelete();

  /**
   * 
   * 
   * @return Object
   */
  @RequestLine("GET /dealer")
  @Headers({
    "Accept: application/json",
  })
  Object dealerGet();

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
  @RequestLine("DELETE /gender")
  @Headers({
    "Accept: application/json",
  })
  Object genderDelete();

  /**
   * 
   * 
   * @return Object
   */
  @RequestLine("GET /gender")
  @Headers({
    "Accept: application/json",
  })
  Object genderGet();

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
