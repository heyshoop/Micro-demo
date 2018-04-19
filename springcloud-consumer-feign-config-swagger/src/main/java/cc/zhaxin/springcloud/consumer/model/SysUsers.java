package cc.zhaxin.springcloud.consumer.model;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: 阁楼麻雀
 * @Date: 2018/4/17 下午2:28
 * @Desc: 用户表
 */
public class SysUsers {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编码
     */
    private String userId;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 账户状态
     */
    private String accountStatus;
    /**
     * 安全级别
     */
    private BigDecimal securityLevel;
    /**
     * 允许创建的最大会话数
     */
    private BigDecimal maxSessions;
    /**
     * 是否系统管理员
     */
    private String isSys;
    /**
     * 是否公司级公用账号
     */
    private String isCpublic;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 锁定时间
     */
    private Date lockTime;
    /**
     * 失效时间
     */
    private Date expiredTime;
    /**
     * 上次密码修改时间
     */
    private Date pswdUptTime;
    /**
     * 密码失效时间
     */
    private Date pswdTime;
    /**
     * 公司结构编码
     */
    private String corporationId;
    /**
     * 部门结构编码
     */
    private String departmentId;
    /**
     * 员工结构编码
     */
    private String employeeId;
    /**
     * 电子邮件
     */
    private String eMail;
    /**
     * QQ
     */
    private String qq;
    /**
     * 移动电话
     */
    private String mobile;
    /**
     * 微信
     */
    private String weChat;
    /**
     * 办公电话
     */
    private String telephone;
    /**
     * 字符型扩充字段1
     */
    private String char1;
    /**
     * 字符型扩充字段2
     */
    private String char2;
    /**
     * 数字型扩充字段1
     */
    private BigDecimal num1;
    /**
     * 数字型扩充字段2
     */
    private BigDecimal num2;
    /**
     * 权限组织结构编码
     */
    private String permissionStruId;
    /**
     * 用户排序序号
     */
    private BigDecimal userOrder;
    /**
     * 行政区代码
     */
    private String provinceCode;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public BigDecimal getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(BigDecimal securityLevel) {
        this.securityLevel = securityLevel;
    }

    public BigDecimal getMaxSessions() {
        return maxSessions;
    }

    public void setMaxSessions(BigDecimal maxSessions) {
        this.maxSessions = maxSessions;
    }

    public String getIsSys() {
        return isSys;
    }

    public void setIsSys(String isSys) {
        this.isSys = isSys;
    }

    public String getIsCpublic() {
        return isCpublic;
    }

    public void setIsCpublic(String isCpublic) {
        this.isCpublic = isCpublic;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLockTime() {
        return lockTime;
    }

    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    public Date getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Date expiredTime) {
        this.expiredTime = expiredTime;
    }

    public Date getPswdUptTime() {
        return pswdUptTime;
    }

    public void setPswdUptTime(Date pswdUptTime) {
        this.pswdUptTime = pswdUptTime;
    }

    public Date getPswdTime() {
        return pswdTime;
    }

    public void setPswdTime(Date pswdTime) {
        this.pswdTime = pswdTime;
    }

    public String getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(String corporationId) {
        this.corporationId = corporationId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getChar1() {
        return char1;
    }

    public void setChar1(String char1) {
        this.char1 = char1;
    }

    public String getChar2() {
        return char2;
    }

    public void setChar2(String char2) {
        this.char2 = char2;
    }

    public BigDecimal getNum1() {
        return num1;
    }

    public void setNum1(BigDecimal num1) {
        this.num1 = num1;
    }

    public BigDecimal getNum2() {
        return num2;
    }

    public void setNum2(BigDecimal num2) {
        this.num2 = num2;
    }

    public String getPermissionStruId() {
        return permissionStruId;
    }

    public void setPermissionStruId(String permissionStruId) {
        this.permissionStruId = permissionStruId;
    }

    public BigDecimal getUserOrder() {
        return userOrder;
    }

    public void setUserOrder(BigDecimal userOrder) {
        this.userOrder = userOrder;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    protected Serializable pkVal() {
        return this.userId;
    }

    @Override
    public String toString() {
        return "SysUsers{" +
                "userId=" + userId +
                ", userName=" + userName +
                ", password=" + password +
                ", accountStatus=" + accountStatus +
                ", securityLevel=" + securityLevel +
                ", maxSessions=" + maxSessions +
                ", isSys=" + isSys +
                ", isCpublic=" + isCpublic +
                ", createTime=" + createTime +
                ", lockTime=" + lockTime +
                ", expiredTime=" + expiredTime +
                ", pswdUptTime=" + pswdUptTime +
                ", pswdTime=" + pswdTime +
                ", corporationId=" + corporationId +
                ", departmentId=" + departmentId +
                ", employeeId=" + employeeId +
                ", eMail=" + eMail +
                ", qq=" + qq +
                ", weChat=" + weChat +
                ", telephone=" + telephone +
                ", mobile=" + mobile +
                ", char1=" + char1 +
                ", char2=" + char2 +
                ", num1=" + num1 +
                ", num2=" + num2 +
                ", permissionStruId=" + permissionStruId +
                ", userOrder=" + userOrder +
                ", provinceCode=" + provinceCode +
                "}";
    }
}
