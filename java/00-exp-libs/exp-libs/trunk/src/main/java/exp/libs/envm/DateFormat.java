package exp.libs.envm;

/**
 * <PRE>
 * 枚举类：日期格式
 * </PRE>
 * <B>PROJECT：</B> exp-libs
 * <B>SUPPORT：</B> EXP
 * @version   1.0 2017-08-17
 * @author    EXP: www.exp-blog.com
 * @since     jdk版本：jdk1.6
 */
public class DateFormat {

	/** 日期格式： yyyy-MM-dd */
	public final static String YMD = "yyyy-MM-dd";
	
	/** 日期格式：HH:mm:ss */
	public final static String HMS = "HH:mm:ss";
	
	/** 日期格式： yyyy-MM-dd HH:mm:ss */
	public final static String YMDHMS = "yyyy-MM-dd HH:mm:ss";
	
	/** 日期格式： yyyy-MM-dd HH:mm:ss.SSS */
	public final static String YMDHMSS = "yyyy-MM-dd HH:mm:ss.SSS";
	
	/** GMT日期格式(多用于cookie的有效时间)： EEE, dd MMM yyyy HH:mm:ss z */
	public final static String GMT = "EEE, dd MMM yyyy HH:mm:ss z";
	
}
