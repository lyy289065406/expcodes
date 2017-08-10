
CREATE TABLE IF NOT EXISTS T_USER (
  I_ID INTEGER PRIMARY KEY AUTOINCREMENT, 
  S_USERNAME  TEXT(512)  NULL,
  S_PASSWORD  TEXT(512)  NULL,
  S_NICKNAME  TEXT(512)  NULL
);


CREATE TABLE IF NOT EXISTS T_ACCOUNT (
  I_ID INTEGER PRIMARY KEY AUTOINCREMENT, 
  I_USER_ID  INTEGER  NULL,			/* 外键ID-关联USER表 */
  S_APP_NAME  TEXT(64)  NULL,			/* 应用名称 */
  S_URL  TEXT(512)  NULL,				/* 相关网址 */
  S_LOGIN_USERNAME  TEXT(512)  NULL, 	/* 登陆账户 */
  S_LOGIN_PASSWORD  TEXT(512)  NULL,	/* 登陆密码 */
  S_QUERY_PASSWORD  TEXT(512)  NULL,	/* 查询密码 */
  S_ATM_PASSWORD  TEXT(512)  NULL,		/* 取款密码 */
  S_PAY_PASSWORD  TEXT(512)  NULL,		/* 支付密码 */
  S_SERVICE_PASSWORD  TEXT(512)  NULL,	/* 服务密码 */
  S_EMAIL  TEXT(512)  NULL,				/* 绑定邮箱 */
  S_PHONE  TEXT(512)  NULL,				/* 绑定手机 */
  S_IDCARD_NUM  TEXT(512)  NULL,		/* 绑定身份证号 */
  S_IDCARD_NAME  TEXT(512)  NULL,		/* 绑定身份证名 */
  S_QUESTION1  TEXT(512)  NULL,			/* 密码提示问题1 */
  S_ANSWER1  TEXT(512)  NULL,			/* 密码提示答案1 */
  S_QUESTION2  TEXT(512)  NULL,			/* 密码提示问题2 */
  S_ANSWER2  TEXT(512)  NULL,			/* 密码提示答案2 */
  S_QUESTION3  TEXT(512)  NULL,			/* 密码提示问题3 */
  S_ANSWER3  TEXT(512)  NULL,			/* 密码提示答案3 */
  S_REMARK  TEXT(1024)  NULL			/* 备注 */
);
