package com.etmobile.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class BaseController {

	/**
	 * 
	 * @param o
	 * @returnjson 换时时间的处理
	 */
	public String getJSON(Object o) {
		return JSON.toJSONStringWithDateFormat(o, "yyyy-MM-dd HH:mm:ss", SerializerFeature.WriteDateUseDateFormat);
	}
}
