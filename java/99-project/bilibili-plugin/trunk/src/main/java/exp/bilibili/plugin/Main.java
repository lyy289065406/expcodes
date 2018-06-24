package exp.bilibili.plugin;

import exp.bilibili.plugin.ui.AppUI;
import exp.libs.utils.os.OSUtils;
import exp.libs.utils.other.LogUtils;
import exp.libs.warp.ui.BeautyEyeUtils;
import exp.libs.warp.ui.SwingUtils;

/**
 * <PRE>
 * 程序入口
 * </PRE>
 * <B>PROJECT：</B> bilibili-plugin
 * <B>SUPPORT：</B> EXP
 * @version   1.0 2017-12-17
 * @author    EXP: www.exp-blog.com
 * @since     jdk版本：jdk1.6
 */
public class Main {
	
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		LogUtils.loadLogBackConfig();
		BeautyEyeUtils.init();
		Config.getInstn();
		
		if(OSUtils.getStartlock(2333)) {
			AppUI.createInstn(args);
			
		} else {
			System.err.println("禁止重复启动");
			SwingUtils.warn("禁止重复启动");
		}
	}
	
}
