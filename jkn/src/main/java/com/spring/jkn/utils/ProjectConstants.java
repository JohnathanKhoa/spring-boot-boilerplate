package com.spring.jkn.utils;

import java.util.Locale;


public final class ProjectConstants {



	public static final String DEFAULT_ENCODING = "UTF-8";

	public static final Locale DEFAULT_LOCALE = new Locale.Builder().setLanguage("en").setRegion("US").build();

	private ProjectConstants() {

		throw new UnsupportedOperationException();
	}

}
