/*
 * blog_aws_reference_data
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2020-10-29T19:55:50Z
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package blog.aws.referencedata.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A Branch in the Reference Data
 */
@ApiModel(description = "A Branch in the Reference Data")
@JsonPropertyOrder({
  Branch.JSON_PROPERTY_CODE,
  Branch.JSON_PROPERTY_NAME,
  Branch.JSON_PROPERTY_LOCKED,
  Branch.JSON_PROPERTY_U_U_I_D,
  Branch.JSON_PROPERTY_EFFECTIVE_DATE,
  Branch.JSON_PROPERTY_EXPIRATION_DATE,
  Branch.JSON_PROPERTY_BRANCH_TYPE
})

public class Branch {
  public static final String JSON_PROPERTY_CODE = "Code";
  private String code;

  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public static final String JSON_PROPERTY_LOCKED = "Locked";
  private Boolean locked;

  public static final String JSON_PROPERTY_U_U_I_D = "UUID";
  private String UUID;

  public static final String JSON_PROPERTY_EFFECTIVE_DATE = "EffectiveDate";
  private String effectiveDate;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "ExpirationDate";
  private String expirationDate;

  /**
   * Date the item stops being in effect
   */
  public enum BranchTypeEnum {
    LOCAL("local"),
    
    MAIN("main");

    private String value;

    BranchTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BranchTypeEnum fromValue(String value) {
      for (BranchTypeEnum b : BranchTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BRANCH_TYPE = "BranchType";
  private BranchTypeEnum branchType;


  public Branch code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Code representing the Gender
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Code representing the Gender")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public Branch name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the Gender
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Gender")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Branch locked(Boolean locked) {
    
    this.locked = locked;
    return this;
  }

   /**
   * If the Item is locked for updates
   * @return locked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the Item is locked for updates")
  @JsonProperty(JSON_PROPERTY_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLocked() {
    return locked;
  }


  public void setLocked(Boolean locked) {
    this.locked = locked;
  }


  public Branch UUID(String UUID) {
    
    this.UUID = UUID;
    return this;
  }

   /**
   * Identifier
   * @return UUID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier")
  @JsonProperty(JSON_PROPERTY_U_U_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUUID() {
    return UUID;
  }


  public void setUUID(String UUID) {
    this.UUID = UUID;
  }


  public Branch effectiveDate(String effectiveDate) {
    
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Date the item comes into effect
   * @return effectiveDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date the item comes into effect")
  @JsonProperty(JSON_PROPERTY_EFFECTIVE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEffectiveDate() {
    return effectiveDate;
  }


  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }


  public Branch expirationDate(String expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Date the item stops being in effect
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date the item stops being in effect")
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public Branch branchType(BranchTypeEnum branchType) {
    
    this.branchType = branchType;
    return this;
  }

   /**
   * Date the item stops being in effect
   * @return branchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date the item stops being in effect")
  @JsonProperty(JSON_PROPERTY_BRANCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BranchTypeEnum getBranchType() {
    return branchType;
  }


  public void setBranchType(BranchTypeEnum branchType) {
    this.branchType = branchType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Branch branch = (Branch) o;
    return Objects.equals(this.code, branch.code) &&
        Objects.equals(this.name, branch.name) &&
        Objects.equals(this.locked, branch.locked) &&
        Objects.equals(this.UUID, branch.UUID) &&
        Objects.equals(this.effectiveDate, branch.effectiveDate) &&
        Objects.equals(this.expirationDate, branch.expirationDate) &&
        Objects.equals(this.branchType, branch.branchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, locked, UUID, effectiveDate, expirationDate, branchType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Branch {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    UUID: ").append(toIndentedString(UUID)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    branchType: ").append(toIndentedString(branchType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

