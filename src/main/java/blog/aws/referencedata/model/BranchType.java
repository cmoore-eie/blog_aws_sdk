/**
 * null
 */
package blog.aws.referencedata.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum BranchType {

    Local("local"),
    Main("main");

    private String value;

    private BranchType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return BranchType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static BranchType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (BranchType enumEntry : BranchType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
