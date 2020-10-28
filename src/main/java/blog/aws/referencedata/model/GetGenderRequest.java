/**
 * null
 */
package blog.aws.referencedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/GetGender" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGenderRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGenderRequest == false)
            return false;
        GetGenderRequest other = (GetGenderRequest) obj;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        return hashCode;
    }

    @Override
    public GetGenderRequest clone() {
        return (GetGenderRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public GetGenderRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
