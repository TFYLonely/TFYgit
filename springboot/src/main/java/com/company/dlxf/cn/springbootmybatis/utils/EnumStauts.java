package com.company.dlxf.cn.springbootmybatis.utils;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * 状态枚举
 * @author Administrator
 *
 */
public enum EnumStauts {

	USABLE("01", "可用"), UNUSABLE("02", "不可用") , PAUSEABLE("03", "休假中");

	private final String value;
	private final String showName;

	private EnumStauts(String value, String showName) {
		this.value = value;
		this.showName = showName;
	}

	public String getValue() {
		return value;
	}

	public String getShowName() {
		return showName;
	}

	
	public static HashMap<String,String> getMap() {
		LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
		for (EnumStauts e : EnumStauts.values()) {
			map.put(e.getValue(), e.getShowName());
		}
		return map;
	}

}
