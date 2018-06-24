package exp.libs.warp.cep.fun.impl.sql;

import com.singularsys.jep.EvaluationException;

import exp.libs.warp.cep.fun.BaseFunction1;

/**
 * <pre>
 * 自定函数：
 * 	双引号复制,即1个双引号替换成2个连续的双引号.
 * 	主要用于处理在界面配置的sql存储到数据库后,双引号丢失问题.
 * </pre>	
 * <B>PROJECT：</B> exp-libs
 * <B>SUPPORT：</B> EXP
 * @version   1.0 2015-12-27
 * @author    EXP: www.exp-blog.com
 * @since     jdk版本：jdk1.6
 */
public class CopyDquote extends BaseFunction1 {

	/**
	 * 序列化唯一ID
	 */
	private static final long serialVersionUID = -5796020340521420338L;

	/**
	 * 建议函数名,方便调用.
	 * 可不使用.
	 */
	public final static String NAME = "copyDquote";
	
	/**
	 * 双引号复制,把1个双引号替换成2个连续的双引号.
	 * 共1个入参：
	 * @param1 String:原字符串
	 * @return String
	 * @throws EvaluationException 若执行失败则抛出异常
	 */
	@Override
	protected Object eval(Object param) throws EvaluationException {
		String str = asString(1, param);
		return str.replace("\"", "\"\"");
	}

	/**
	 * 获取函数名称
	 * @return 函数名称
	 */
	@Override
	public String getName() {
		return NAME;
	}
	
}
