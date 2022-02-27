package com.example.demo.util;

public class EmailContentBuilderUtil {

    private static String template = "<p>Hoş geldin ${user},</p>\n" ;

    private void EmailContentBuilderUtil() {

    }

    public static String build(String userName) {
        return template.replaceAll("\\$\\{*user\\}", userName.split("@")[0]);
    }
}
