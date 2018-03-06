package edu.iot.lib.app;

import java.util.HashMap;
import java.util.Map;

/**
 * @author student
 * 모든 컴포넌트에서 공유해서 사용할 데이터 관리
 */
public class Context {
	private static Map<String, Object> map = new HashMap<>();
	
	public static void setAttribute(String key, Object value) {
		map.put(key, value);
	}
	
	//현재 사용자에 대한 정보를 얻고자할 때 사용
	public static Object getAttribute(String key) {
		return map.get(key);
	}
	
	public static void remove(String key) {
		map.remove(key);
	}
}
