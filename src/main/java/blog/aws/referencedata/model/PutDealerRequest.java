/**
 * null
 */
package blog.aws.referencedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/PutDealer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDealerRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private Dealer dealer;

    /**
     * @param dealer
     */

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    /**
     * @return
     */

    public Dealer getDealer() {
        return this.dealer;
    }

    /**
     * @param dealer
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDealerRequest dealer(Dealer dealer) {
        setDealer(dealer);
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
        if (getDealer() != null)
            sb.append("Dealer: ").append(getDealer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDealerRequest == false)
            return false;
        PutDealerRequest other = (PutDealerRequest) obj;
        if (other.getDealer() == null ^ this.getDealer() == null)
            return false;
        if (other.getDealer() != null && other.getDealer().equals(this.getDealer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDealer() == null) ? 0 : getDealer().hashCode());
        return hashCode;
    }

    @Override
    public PutDealerRequest clone() {
        return (PutDealerRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public PutDealerRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
