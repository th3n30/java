package com.neo.java;

/**
 * Util class with various helper methods
 * 
 * @author Deepak Rajendran
 *
 */
public class JavaUtils {

	/**
	 * Parses the provided string value into desired wrappertype object
	 * 
	 * @param wrapperType
	 * @param stringVal
	 * @return null, if not able to parse or the stringval is null/empty</br>
	 *         wrappertype object, otherwise
	 */
	public static <T> T parseSafe(Class<T> wrapperType, String stringVal) {
		if (stringVal == null || stringVal.length() == 0)
			return null;
		Object result = null;
		try {
			switch (wrapperType.getSimpleName()) {
			case ("Integer"):
				result = Integer.parseInt(stringVal);
				break;
			case ("Double"):
				result = Double.parseDouble(stringVal);
				break;
			case ("Short"):
				result = Short.parseShort(stringVal);
				break;
			case ("Float"):
				result = Float.parseFloat(stringVal);
				break;
			case ("Byte"):
				result = Byte.parseByte(stringVal);
				break;
			case ("Long"):
				result = Long.parseLong(stringVal);
				break;
			case ("Boolean"):
				result = Boolean.parseBoolean(stringVal);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			// do nothing
		}
		return (T) result;
	}

}
