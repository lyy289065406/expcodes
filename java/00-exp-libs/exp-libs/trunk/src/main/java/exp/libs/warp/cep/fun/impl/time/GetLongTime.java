package exp.libs.warp.cep.fun.impl.time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.singularsys.jep.EvaluationException;

import exp.libs.warp.cep.fun.BaseFunctionN;

/**
 * <pre>
 * perl获取当前时间
 * </pre>	
 * <B>PROJECT：</B> exp-libs
 * <B>SUPPORT：</B> EXP
 * @version   1.0 2015-12-27
 * @author    EXP: www.exp-blog.com
 * @since     jdk版本：jdk1.6
 */
public class GetLongTime extends BaseFunctionN {

	/**
	 * 序列化唯一ID
	 */
	private static final long serialVersionUID = -5260768755647732251L;
	
	/**
	 * 建议函数名,方便调用.
	 * 可不使用.
	 */
	public final static String NAME = "getLongTime";
	
	/**
	 * 限定参数个数为0或1.
	 */
	@Override
	public boolean checkNumberOfParameters(int inParamsNum){
        return inParamsNum == 0 || inParamsNum == 1;
    }
	
	/**
	 * 获取当前系统时间的字符串.
	 * 可选0个或1个入参：
	 * @param1 String(可选):获取时间的格式,若无此参数则默认为 yyyy-MM-dd HH:mm:ss
	 * @return String
	 * @throws EvaluationException 若执行失败则抛出异常
	 */
	@Override
	protected Object eval(List<Object> params) throws EvaluationException {
		String dateFormat = "yyyy-MM-dd HH:mm:ss";
		if(params.size() == 1) {
			dateFormat = asString(1, params.remove(0));
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		Date now = new Date();
		return sdf.format(now);
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
