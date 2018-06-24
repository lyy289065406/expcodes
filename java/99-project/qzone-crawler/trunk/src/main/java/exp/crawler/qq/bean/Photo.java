package exp.crawler.qq.bean;

import exp.crawler.qq.utils.PicUtils;

/**
 * <PRE>
 * 照片对象
 * </PRE>
 * <B>PROJECT：</B> qzone-crawler
 * <B>SUPPORT：</B> EXP
 * @version   1.0 2017-12-17
 * @author    EXP: www.exp-blog.com
 * @since     jdk版本：jdk1.6
 */
public class Photo {

	/** 照片名称 */
	private String name;
	
	/** 照片描述 */
	private String desc;
	
	/** 照片上传时间 */
	private String time;
	
	/** 照片地址 */
	private String url;
	
	/**
	 * 构造函数
	 * @param desc
	 * @param time
	 * @param url
	 */
	public Photo(String desc, String time, String url) {
		this.desc = (desc == null ? "" : desc.replaceAll("[\r\n]", ""));
		this.time = (time == null ? "" : time);
		this.url = (url == null ? "" : url);
		this.name = PicUtils.getPicName(this.time, this.desc);
	}
	
	public String NAME() {
		return name;
	}
	
	public String DESC() {
		return desc;
	}
	
	public String TIME() {
		return time;
	}
	
	public String URL() {
		return url;
	}
	
	public String toString(boolean isDownload) {
		StringBuilder sb = new StringBuilder();
		sb.append("[下载状态] : ").append(isDownload).append("\r\n");
		sb.append("[上传时间] : ").append(TIME()).append("\r\n");
		sb.append("[照片描述] : ").append(DESC()).append("\r\n");
		sb.append("[照片路径] : ").append(URL()).append("\r\n");
		sb.append("======================================================\r\n");
		return sb.toString();
	}
	
}
