package exp.bilibili.plugin.bean.pdm;

import net.sf.json.JSONObject;
import exp.bilibili.plugin.envm.BiliCmd;
import exp.bilibili.plugin.envm.BiliCmdAtrbt;
import exp.libs.utils.format.JsonUtils;

/**
 * 
 * <PRE>
 * 
 	关播通知
	{
	  "cmd": "PREPARING",
	  "round": 1,
	  "roomid": "390480"
	}
 * </PRE>
 * @version   2017-12-17
 * @author    EXP: 272629724@qq.com
 * @since     jdk版本：jdk1.6
 */
public class Preparing extends _Msg {

	private String roomId;
	
	public Preparing(JSONObject json) {
		super(json);
		this.cmd = BiliCmd.PREPARING;
	}
	
	@Override
	protected void analyse(JSONObject json) {
		this.roomId = JsonUtils.getStr(json, BiliCmdAtrbt.roomid);
	}

	public String getRoomId() {
		return roomId;
	}

}
