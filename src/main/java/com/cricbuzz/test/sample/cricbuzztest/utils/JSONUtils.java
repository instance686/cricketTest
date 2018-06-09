package com.cricbuzz.test.sample.cricbuzztest.utils;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.cricbuzz.test.sample.cricbuzztest.model.Player;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONUtils {
	public static GsonBuilder gsonBuilder = new GsonBuilder().serializeNulls();
	public static Gson gson = gsonBuilder.create();

	public static String getSuccessJson(String operation,Object object) {
		JSONObject obj = new JSONObject();
		try {
			obj.put(operation, "success");
			if(object instanceof List)
				obj.put("data", new JSONArray(gson.toJson(object)));
			else
			obj.put("data", new JSONObject(gson.toJson(object)));
			return obj.toString();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getSuccessJson(String operation) {
		JSONObject obj = new JSONObject();
		try {
			obj.put(operation, "success");
			return obj.toString();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getFailJsonWithReason(String reason) {
		JSONObject obj = new JSONObject();
		try {
			obj.put("status", "fail");
			obj.put("reason", reason);
			return obj.toString();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
