package com.ming.web.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {
	/**
	 * 
	 * @param response
	 * @param name
	 * @param value
	 * @param domain
	 * @param path
	 * @param maxAge
	 */
	public static void setCookie(HttpServletResponse response,
			String name, String value, String domain, String path, int maxAge) {
		Cookie cookie=new Cookie(name, value);
		if(domain!=null) {
			cookie.setDomain(domain);
		}
		cookie.setPath(path);
		cookie.setMaxAge(maxAge);
		response.addCookie(cookie);
	}
	public static void setCookie(HttpServletResponse response, String name, String value, int maxAge) {
		setCookie(response, name, value, null, "/", maxAge);
	}
	public static void setCookie(HttpServletResponse response, String name, String value) {
		setCookie(response, name, value, null, "/", 3600);
	}
	public static void setCookie(HttpServletResponse response, String name) {
		setCookie(response, name, "", null, "/", 3600);
	}
	/***
	 * 
	 * @param request
	 * @param name
	 * @return
	 */
	public static String getCookie(HttpServletRequest request,String name) {
		String value=null;
		Cookie[] cookies = request.getCookies();
		if(cookies.length>0) {
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals(name)) {
					value=cookie.getValue();
					break;
				}
			}
		}
		return value;
	}
	/***
	 * 
	 * @param response
	 * @param name
	 * @param path
	 * @param domain
	 */
	public static void removeCookie(HttpServletResponse response,String name,String path,String domain) {
		setCookie(response,name,"",domain,path,0);
	}
}
