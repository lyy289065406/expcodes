package exp.bilibili.plugin.tmp;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.Cookie;

import exp.libs.utils.other.StrUtils;

public class HttpCookies {
	
	/** B站CSRF标识 */
	private final static String CSRF_KEY = "bili_jct";
	
	private List<HttpCookie> cookies;
	
	/** 多个cookies组合而成的KV串 */
	private String kvCookies;
	
	/** 从cookies提取的csrf token */
	private String csrf;
	
	/** cookies是否发生变化 */
	private boolean isChanged;
	
	public HttpCookies() {
		this.cookies = new LinkedList<HttpCookie>();
		this.kvCookies = "";
		this.csrf = "";
		isChanged = false;
	}
	
	/**
	 * 
	 * @param kvCookies 多个cookies组合而成的KV串
	 */
	public HttpCookies(String kvCookies) {
		this();
		
		if(StrUtils.isNotEmpty(kvCookies)) {
			String[] kvs = kvCookies.split(";");
			for(String kv : kvs) {
				add(kv);
			}
		}
	}
	
	public boolean isVaild() {
		return cookies.size() > 0;
	}
	
	public void add(String responseHeadCookie) {
		add(new HttpCookie(responseHeadCookie));
	}
	
	public void add(HttpCookie cookie) {
		if(cookie != null && cookie.isVaild()) {
			isChanged = true;
			cookies.add(cookie);
			
			if(CSRF_KEY.equals(cookie.getName())) {
				csrf = cookie.getValue();
			}
		}
	}
	
	public String CSRF() {
		return csrf;
	}
	
	public List<Cookie> toSeleniumCookies() {
		List<Cookie> seleniumCookies = new LinkedList<Cookie>();
		for(HttpCookie cookie : cookies) {
			seleniumCookies.add(cookie.toSeleniumCookie());
		}
		return seleniumCookies;
	}
	
	public String toCookies() {
		if(isChanged == true) {
			
			StringBuilder kvs = new StringBuilder();
			for(HttpCookie cookie : cookies) {
				kvs.append(cookie.toKV()).append("; ");
			}
			kvCookies = kvs.toString();
		}
		return kvCookies;
	}
	
	public String toString() {
		return toCookies();
	}
	
}
