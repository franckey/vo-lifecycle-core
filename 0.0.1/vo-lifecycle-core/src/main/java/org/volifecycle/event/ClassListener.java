package org.volifecycle.event;

import java.util.List;

/**
 * Class listener (class with list of property to listen)
 * 
 * @author Idriss Neumann <neumann.idriss@gmail.com>
 * 
 */
public class ClassListener {
	private String className;

	private List<String> properties;

	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @param className
	 *            the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @return the properties
	 */
	public List<String> getProperties() {
		return properties;
	}

	/**
	 * @param properties
	 *            the properties to set
	 */
	public void setProperties(List<String> properties) {
		this.properties = properties;
	}
}
