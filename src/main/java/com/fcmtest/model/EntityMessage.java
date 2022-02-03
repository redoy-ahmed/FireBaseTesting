package com.fcmtest.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

public class EntityMessage {

	private final Map<String, NotificationOnlineSales> mDataMap = new LinkedHashMap<>();
	private final List<String> mRegistrationTokenList = new ArrayList<String>();

	public void putData(String key, NotificationOnlineSales notification) {
		mDataMap.put(key, notification);
	}

	public void addRegistrationToken(String registrationToken) {
		mRegistrationTokenList.add(registrationToken);
	}

	public void removeRegistrationToken(String registrationToken) {
		if (mRegistrationTokenList.contains(registrationToken)) {
			mRegistrationTokenList.remove(registrationToken);
		}

	}

	public void setRegistrationTokenList(List<String> list) {
		mRegistrationTokenList.clear();
		mRegistrationTokenList.addAll(list);
	}

	public void clearRegistrationTokens() {
		mRegistrationTokenList.clear();
	}

	public JSONObject toJsonObject() {

		final JSONObject json = new JSONObject();

		final String[] registrationIds = mRegistrationTokenList.toArray(new String[] {});

		// for multicast
		json.accumulate("registration_ids", registrationIds);

		// payload

		json.accumulate("data", mDataMap);

		return json;
	}

	public String toJson() {
		return toJsonObject().toString();
	}
}
