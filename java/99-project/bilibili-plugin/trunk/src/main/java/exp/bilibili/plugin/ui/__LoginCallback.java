package exp.bilibili.plugin.ui;

import exp.bilibili.protocol.cookie.HttpCookie;

public interface __LoginCallback {

	public void afterLogin(HttpCookie cookie);
	
	public void afterLogout(HttpCookie cookie);
	
}