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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vxymc6j9r0-2020-10-27T18:56:03Z/Dealer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Dealer implements Serializable, Cloneable, StructuredPojo {

    private String code;

    private java.util.List<DealerLocationsElement> dealerLocations;

    private String effectiveDate;

    private String expirationDate;

    private Boolean locked;

    private String name;

    private String uUID;

    /**
     * @param code
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return
     */

    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dealer code(String code) {
        setCode(code);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<DealerLocationsElement> getDealerLocations() {
        return dealerLocations;
    }

    /**
     * @param dealerLocations
     */

    public void setDealerLocations(java.util.Collection<DealerLocationsElement> dealerLocations) {
        if (dealerLocations == null) {
            this.dealerLocations = null;
            return;
        }

        this.dealerLocations = new java.util.ArrayList<DealerLocationsElement>(dealerLocations);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDealerLocations(java.util.Collection)} or {@link #withDealerLocations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dealerLocations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dealer dealerLocations(DealerLocationsElement... dealerLocations) {
        if (this.dealerLocations == null) {
            setDealerLocations(new java.util.ArrayList<DealerLocationsElement>(dealerLocations.length));
        }
        for (DealerLocationsElement ele : dealerLocations) {
            this.dealerLocations.add(ele);
        }
        return this;
    }

    /**
     * @param dealerLocations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dealer dealerLocations(java.util.Collection<DealerLocationsElement> dealerLocations) {
        setDealerLocations(dealerLocations);
        return this;
    }

    /**
     * @param effectiveDate
     */

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * @return
     */

    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * @param effectiveDate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dealer effectiveDate(String effectiveDate) {
        setEffectiveDate(effectiveDate);
        return this;
    }

    /**
     * @param expirationDate
     */

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * @return
     */

    public String getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * @param expirationDate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dealer expirationDate(String expirationDate) {
        setExpirationDate(expirationDate);
        return this;
    }

    /**
     * @param locked
     */

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    /**
     * @return
     */

    public Boolean getLocked() {
        return this.locked;
    }

    /**
     * @param locked
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dealer locked(Boolean locked) {
        setLocked(locked);
        return this;
    }

    /**
     * @return
     */

    public Boolean isLocked() {
        return this.locked;
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

    public Dealer name(String name) {
        setName(name);
        return this;
    }

    /**
     * @param uUID
     */

    public void setUUID(String uUID) {
        this.uUID = uUID;
    }

    /**
     * @return
     */

    public String getUUID() {
        return this.uUID;
    }

    /**
     * @param uUID
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dealer uUID(String uUID) {
        setUUID(uUID);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getDealerLocations() != null)
            sb.append("DealerLocations: ").append(getDealerLocations()).append(",");
        if (getEffectiveDate() != null)
            sb.append("EffectiveDate: ").append(getEffectiveDate()).append(",");
        if (getExpirationDate() != null)
            sb.append("ExpirationDate: ").append(getExpirationDate()).append(",");
        if (getLocked() != null)
            sb.append("Locked: ").append(getLocked()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getUUID() != null)
            sb.append("UUID: ").append(getUUID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Dealer == false)
            return false;
        Dealer other = (Dealer) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getDealerLocations() == null ^ this.getDealerLocations() == null)
            return false;
        if (other.getDealerLocations() != null && other.getDealerLocations().equals(this.getDealerLocations()) == false)
            return false;
        if (other.getEffectiveDate() == null ^ this.getEffectiveDate() == null)
            return false;
        if (other.getEffectiveDate() != null && other.getEffectiveDate().equals(this.getEffectiveDate()) == false)
            return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        if (other.getLocked() == null ^ this.getLocked() == null)
            return false;
        if (other.getLocked() != null && other.getLocked().equals(this.getLocked()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUUID() == null ^ this.getUUID() == null)
            return false;
        if (other.getUUID() != null && other.getUUID().equals(this.getUUID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getDealerLocations() == null) ? 0 : getDealerLocations().hashCode());
        hashCode = prime * hashCode + ((getEffectiveDate() == null) ? 0 : getEffectiveDate().hashCode());
        hashCode = prime * hashCode + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        hashCode = prime * hashCode + ((getLocked() == null) ? 0 : getLocked().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUUID() == null) ? 0 : getUUID().hashCode());
        return hashCode;
    }

    @Override
    public Dealer clone() {
        try {
            return (Dealer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        blog.aws.referencedata.model.transform.DealerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
