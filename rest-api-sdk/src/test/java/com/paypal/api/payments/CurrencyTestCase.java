package com.paypal.api.payments;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.paypal.base.rest.JSONFormatter;

public class CurrencyTestCase {

	private static final Logger logger = Logger
			.getLogger(CurrencyTestCase.class);

	public static String getJson() {
		return "{\"currency\":\"TestSample\",\"value\":\"12.34\"}";
	}

	public static Currency getObject() {
		return JSONFormatter.fromJSON(getJson(), Currency.class);
	}

	@Test(groups = "unit")
	public void testJsontoObject() {
		Currency obj = CurrencyTestCase.getObject();
		Assert.assertEquals(obj.getCurrency(), "TestSample");
		Assert.assertEquals(obj.getValue(), "12.34");
	}
}
