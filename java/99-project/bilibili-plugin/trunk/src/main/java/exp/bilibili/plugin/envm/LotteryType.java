package exp.bilibili.plugin.envm;

/**
 * <PRE>
 * 抽奖类型
 * </PRE>
 * <B>PROJECT：</B> bilibili-plugin
 * <B>SUPPORT：</B> EXP
 * @version   1.0 2017-12-17
 * @author    EXP: www.exp-blog.com
 * @since     jdk版本：jdk1.6
 */
public class LotteryType {

	/** 高能礼物抽奖 */
	private final static short TYPE_EG = 0;
	public final static LotteryType ENGERY = new LotteryType(TYPE_EG);
	
	/** 小电视抽奖 */
	private final static short TYPE_TV = 1;
	public final static LotteryType TV = new LotteryType(TYPE_TV);
	
	/** 节奏风暴抽奖 */
	private final static short TYPE_STORM = 2;
	public final static LotteryType STORM = new LotteryType(TYPE_STORM);
	
	/** 总督领奖 */
	private final static short TYPE_GUARD = 3;
	public final static LotteryType GUARD = new LotteryType(TYPE_GUARD);
	
	private short type;
	
	private LotteryType(short type) {
		this.type = type;
	}
	
	public short TYPE() {
		return type;
	}
	
}
