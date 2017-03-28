/**
 * 
 */
package net.luiscolorado.nanoCM.Entity;

/**
 * @author Luis Colorado
 *
 */
public class ContentProperty {
	private String propName;
	/**
	 * @param propName
	 * @param propValue
	 */
	public ContentProperty(String propName, String propValue) {
		this.propName = propName;
		this.propValue = propValue;
	}
	private String propValue;
	/**
	 * @return the propName
	 */
	String getPropName() {
		return propName;
	}
	/**
	 * @param propName the propName to set
	 */
	void setPropName(String propName) {
		this.propName = propName;
	}
	/**
	 * @return the propValue
	 */
	String getPropValue() {
		return propValue;
	}
	/**
	 * @param propValue the propValue to set
	 */
	void setPropValue(String propValue) {
		this.propValue = propValue;
	}

}
