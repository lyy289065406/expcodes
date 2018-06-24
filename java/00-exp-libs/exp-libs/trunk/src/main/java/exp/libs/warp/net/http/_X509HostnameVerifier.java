package exp.libs.warp.net.http;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/**
 * <PRE>
 * HTTPS： 用于绕过SSL域名校验
 * </PRE>
 * 
 * <B>PROJECT：</B> exp-libs
 * <B>SUPPORT：</B> EXP
 * @version   1.0 2017-12-21
 * @author    EXP: www.exp-blog.com
 * @since     jdk版本：jdk1.6
 */
class _X509HostnameVerifier implements HostnameVerifier {

	@Override
	public boolean verify(String arg0, SSLSession arg1) {
		// TODO Auto-generated method stub
		return true;
	}

}
