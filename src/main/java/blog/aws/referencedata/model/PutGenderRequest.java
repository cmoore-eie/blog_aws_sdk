/**
 * null
 */
package blog.aws.referencedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/PutGender" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutGenderRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private Gender gender;

    /**
     * @param gender
     */

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * @return
     */

    public Gender getGender() {
        return this.gender;
    }

    /**
     * @param gender
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutGenderRequest gender(Gender gender) {
        setGender(gender);
        return this;
    }

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
        if (getGender() != null)
            sb.append("Gender: ").append(getGender());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutGenderRequest == false)
            return false;
        PutGenderRequest other = (PutGenderRequest) obj;
        if (other.getGender() == null ^ this.getGender() == null)
            return false;
        if (other.getGender() != null && other.getGender().equals(this.getGender()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGender() == null) ? 0 : getGender().hashCode());
        return hashCode;
    }

    @Override
    public PutGenderRequest clone() {
        return (PutGenderRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public PutGenderRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
