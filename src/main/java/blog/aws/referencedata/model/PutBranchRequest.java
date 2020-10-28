/**
 * null
 */
package blog.aws.referencedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/PutBranch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutBranchRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private Branch branch;

    /**
     * @param branch
     */

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    /**
     * @return
     */

    public Branch getBranch() {
        return this.branch;
    }

    /**
     * @param branch
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBranchRequest branch(Branch branch) {
        setBranch(branch);
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
        if (getBranch() != null)
            sb.append("Branch: ").append(getBranch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBranchRequest == false)
            return false;
        PutBranchRequest other = (PutBranchRequest) obj;
        if (other.getBranch() == null ^ this.getBranch() == null)
            return false;
        if (other.getBranch() != null && other.getBranch().equals(this.getBranch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranch() == null) ? 0 : getBranch().hashCode());
        return hashCode;
    }

    @Override
    public PutBranchRequest clone() {
        return (PutBranchRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public PutBranchRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
