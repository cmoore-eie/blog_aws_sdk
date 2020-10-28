/**
 * null
 */
package blog.aws.referencedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/__DealerLocationsElement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DealerLocationsElement implements Serializable, Cloneable, StructuredPojo {

    private String addressLine1;

    private String addressLine2;

    private String city;

    private String name;

    private String postcode;

    /**
     * @param addressLine1
     */

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * @return
     */

    public String getAddressLine1() {
        return this.addressLine1;
    }

    /**
     * @param addressLine1
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DealerLocationsElement addressLine1(String addressLine1) {
        setAddressLine1(addressLine1);
        return this;
    }

    /**
     * @param addressLine2
     */

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * @return
     */

    public String getAddressLine2() {
        return this.addressLine2;
    }

    /**
     * @param addressLine2
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DealerLocationsElement addressLine2(String addressLine2) {
        setAddressLine2(addressLine2);
        return this;
    }

    /**
     * @param city
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return
     */

    public String getCity() {
        return this.city;
    }

    /**
     * @param city
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DealerLocationsElement city(String city) {
        setCity(city);
        return this;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DealerLocationsElement name(String name) {
        setName(name);
        return this;
    }

    /**
     * @param postcode
     */

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * @return
     */

    public String getPostcode() {
        return this.postcode;
    }

    /**
     * @param postcode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DealerLocationsElement postcode(String postcode) {
        setPostcode(postcode);
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
        if (getAddressLine1() != null)
            sb.append("AddressLine1: ").append(getAddressLine1()).append(",");
        if (getAddressLine2() != null)
            sb.append("AddressLine2: ").append(getAddressLine2()).append(",");
        if (getCity() != null)
            sb.append("City: ").append(getCity()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPostcode() != null)
            sb.append("Postcode: ").append(getPostcode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DealerLocationsElement == false)
            return false;
        DealerLocationsElement other = (DealerLocationsElement) obj;
        if (other.getAddressLine1() == null ^ this.getAddressLine1() == null)
            return false;
        if (other.getAddressLine1() != null && other.getAddressLine1().equals(this.getAddressLine1()) == false)
            return false;
        if (other.getAddressLine2() == null ^ this.getAddressLine2() == null)
            return false;
        if (other.getAddressLine2() != null && other.getAddressLine2().equals(this.getAddressLine2()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPostcode() == null ^ this.getPostcode() == null)
            return false;
        if (other.getPostcode() != null && other.getPostcode().equals(this.getPostcode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddressLine1() == null) ? 0 : getAddressLine1().hashCode());
        hashCode = prime * hashCode + ((getAddressLine2() == null) ? 0 : getAddressLine2().hashCode());
        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPostcode() == null) ? 0 : getPostcode().hashCode());
        return hashCode;
    }

    @Override
    public DealerLocationsElement clone() {
        try {
            return (DealerLocationsElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        blog.aws.referencedata.model.transform.DealerLocationsElementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
