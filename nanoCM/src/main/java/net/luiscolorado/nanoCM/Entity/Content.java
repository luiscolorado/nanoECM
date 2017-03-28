package net.luiscolorado.nanoCM.Entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Content {
	private String name;
	ContentProperties properties;

	/**
	 * @return the properties
	 */
	public Map<String,String> getProperties() {
		return properties.getPropertyMap();
	}

	/**
	 * @param properties
	 *            the properties to set
	 */
	public void setProperties(ContentProperties properties) {
		this.properties = properties;
	}

	/**
	 * @param name
	 * @param file
	 * @param properties
	 */
	public Content(String name, ContentProperties properties) {
		this.setName(name);
		this.properties = properties;
	}

	public Content(String name) {
		this.setName(name);
	}

	public Content() {
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Content's properties. It contains the group of properties belonging to a
	 * document. Names of properties can't be duplicated (e.g., more than one
	 * "author" is not allowed).
	 * 
	 * @author Luis Colorado
	 *
	 */
	public class ContentProperties {
		private Map<String, String> propertyMap = new HashMap<String,String>();
		/**
		 * Convenience constructor (mainly for testing purposes)
		 * 
		 * @param contentId
		 * @param name
		 * @param value
		 */
		public ContentProperties(String name, String value) {
			propertyMap.put(name, value);
		}

		public ContentProperties add(String name, String value) {
			propertyMap.put(name, value);
			return this;
		}

		public Map<String, String> getPropertyMap() {
			return propertyMap;
		}
		
		public String getProperty(String propertyName) {
			return propertyMap.get(name);
		}

	}

	public Content addContentProperty(String name, String value) {
		/* Lazy creation of 'properties' */
		if (properties == null)
			properties = new ContentProperties(name,value);
		else
			properties.add(name, value);
		return this;
	}

}
