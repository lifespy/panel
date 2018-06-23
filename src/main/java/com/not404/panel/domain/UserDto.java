package com.not404.panel.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "sspanel", catalog = "")
public class UserDto {
    private long id;
    private String userName;
    private String email;
    private String pass;
    private String passwd;
    private int t;
    private long u;
    private long d;
    private String plan;
    private long transferEnable;
    private int port;
    private byte canSwitch;
    private byte enable;
    private byte type;
    private int lastGetGiftTime;
    private int lastCheckInTime;
    private int lastRestPassTime;
    private Timestamp regDate;
    private int inviteNum;
    private BigDecimal money;
    private int refBy;
    private int expireTime;
    private String method;
    private byte isEmailVerify;
    private String regIp;
    private BigDecimal nodeSpeedlimit;
    private int nodeConnector;
    private int isAdmin;
    private Integer imType;
    private String imValue;
    private long lastDayT;
    private int sendDailyMail;
    private int clazz;
    private Timestamp classExpire;
    private Timestamp expireIn;
    private String theme;
    private String gaToken;
    private int gaEnable;
    private String pac;
    private String remark;
    private int nodeGroup;
    private int autoResetDay;
    private BigDecimal autoResetBandwidth;
    private String protocol;
    private String protocolParam;
    private String obfs;
    private String obfsParam;
    private String forbiddenIp;
    private String forbiddenPort;
    private String disconnectIp;
    private int isHide;
    private int isMultiUser;
    private Long telegramId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "pass")
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Basic
    @Column(name = "passwd")
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Basic
    @Column(name = "t")
    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    @Basic
    @Column(name = "u")
    public long getU() {
        return u;
    }

    public void setU(long u) {
        this.u = u;
    }

    @Basic
    @Column(name = "d")
    public long getD() {
        return d;
    }

    public void setD(long d) {
        this.d = d;
    }

    @Basic
    @Column(name = "plan")
    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    @Basic
    @Column(name = "transfer_enable")
    public long getTransferEnable() {
        return transferEnable;
    }

    public void setTransferEnable(long transferEnable) {
        this.transferEnable = transferEnable;
    }

    @Basic
    @Column(name = "port")
    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Basic
    @Column(name = "switch")
    public byte getCanSwitch() {
        return canSwitch;
    }

    public void setCanSwitch(byte canSwitch) {
        this.canSwitch = canSwitch;
    }

    @Basic
    @Column(name = "enable")
    public byte getEnable() {
        return enable;
    }

    public void setEnable(byte enable) {
        this.enable = enable;
    }

    @Basic
    @Column(name = "type")
    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    @Basic
    @Column(name = "last_get_gift_time")
    public int getLastGetGiftTime() {
        return lastGetGiftTime;
    }

    public void setLastGetGiftTime(int lastGetGiftTime) {
        this.lastGetGiftTime = lastGetGiftTime;
    }

    @Basic
    @Column(name = "last_check_in_time")
    public int getLastCheckInTime() {
        return lastCheckInTime;
    }

    public void setLastCheckInTime(int lastCheckInTime) {
        this.lastCheckInTime = lastCheckInTime;
    }

    @Basic
    @Column(name = "last_rest_pass_time")
    public int getLastRestPassTime() {
        return lastRestPassTime;
    }

    public void setLastRestPassTime(int lastRestPassTime) {
        this.lastRestPassTime = lastRestPassTime;
    }

    @Basic
    @Column(name = "reg_date")
    public Timestamp getRegDate() {
        return regDate;
    }

    public void setRegDate(Timestamp regDate) {
        this.regDate = regDate;
    }

    @Basic
    @Column(name = "invite_num")
    public int getInviteNum() {
        return inviteNum;
    }

    public void setInviteNum(int inviteNum) {
        this.inviteNum = inviteNum;
    }

    @Basic
    @Column(name = "money")
    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Basic
    @Column(name = "ref_by")
    public int getRefBy() {
        return refBy;
    }

    public void setRefBy(int refBy) {
        this.refBy = refBy;
    }

    @Basic
    @Column(name = "expire_time")
    public int getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(int expireTime) {
        this.expireTime = expireTime;
    }

    @Basic
    @Column(name = "method")
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Basic
    @Column(name = "is_email_verify")
    public byte getIsEmailVerify() {
        return isEmailVerify;
    }

    public void setIsEmailVerify(byte isEmailVerify) {
        this.isEmailVerify = isEmailVerify;
    }

    @Basic
    @Column(name = "reg_ip")
    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    @Basic
    @Column(name = "node_speedlimit")
    public BigDecimal getNodeSpeedlimit() {
        return nodeSpeedlimit;
    }

    public void setNodeSpeedlimit(BigDecimal nodeSpeedlimit) {
        this.nodeSpeedlimit = nodeSpeedlimit;
    }

    @Basic
    @Column(name = "node_connector")
    public int getNodeConnector() {
        return nodeConnector;
    }

    public void setNodeConnector(int nodeConnector) {
        this.nodeConnector = nodeConnector;
    }

    @Basic
    @Column(name = "is_admin")
    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Basic
    @Column(name = "im_type")
    public Integer getImType() {
        return imType;
    }

    public void setImType(Integer imType) {
        this.imType = imType;
    }

    @Basic
    @Column(name = "im_value")
    public String getImValue() {
        return imValue;
    }

    public void setImValue(String imValue) {
        this.imValue = imValue;
    }

    @Basic
    @Column(name = "last_day_t")
    public long getLastDayT() {
        return lastDayT;
    }

    public void setLastDayT(long lastDayT) {
        this.lastDayT = lastDayT;
    }

    @Basic
    @Column(name = "sendDailyMail")
    public int getSendDailyMail() {
        return sendDailyMail;
    }

    public void setSendDailyMail(int sendDailyMail) {
        this.sendDailyMail = sendDailyMail;
    }

    @Basic
    @Column(name = "class")
    public int getClazz() {
        return clazz;
    }

    public void setClazz(int clazz) {
        this.clazz = clazz;
    }

    @Basic
    @Column(name = "class_expire")
    public Timestamp getClassExpire() {
        return classExpire;
    }

    public void setClassExpire(Timestamp classExpire) {
        this.classExpire = classExpire;
    }

    @Basic
    @Column(name = "expire_in")
    public Timestamp getExpireIn() {
        return expireIn;
    }

    public void setExpireIn(Timestamp expireIn) {
        this.expireIn = expireIn;
    }

    @Basic
    @Column(name = "theme")
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Basic
    @Column(name = "ga_token")
    public String getGaToken() {
        return gaToken;
    }

    public void setGaToken(String gaToken) {
        this.gaToken = gaToken;
    }

    @Basic
    @Column(name = "ga_enable")
    public int getGaEnable() {
        return gaEnable;
    }

    public void setGaEnable(int gaEnable) {
        this.gaEnable = gaEnable;
    }

    @Basic
    @Column(name = "pac")
    public String getPac() {
        return pac;
    }

    public void setPac(String pac) {
        this.pac = pac;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "node_group")
    public int getNodeGroup() {
        return nodeGroup;
    }

    public void setNodeGroup(int nodeGroup) {
        this.nodeGroup = nodeGroup;
    }

    @Basic
    @Column(name = "auto_reset_day")
    public int getAutoResetDay() {
        return autoResetDay;
    }

    public void setAutoResetDay(int autoResetDay) {
        this.autoResetDay = autoResetDay;
    }

    @Basic
    @Column(name = "auto_reset_bandwidth")
    public BigDecimal getAutoResetBandwidth() {
        return autoResetBandwidth;
    }

    public void setAutoResetBandwidth(BigDecimal autoResetBandwidth) {
        this.autoResetBandwidth = autoResetBandwidth;
    }

    @Basic
    @Column(name = "protocol")
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @Basic
    @Column(name = "protocol_param")
    public String getProtocolParam() {
        return protocolParam;
    }

    public void setProtocolParam(String protocolParam) {
        this.protocolParam = protocolParam;
    }

    @Basic
    @Column(name = "obfs")
    public String getObfs() {
        return obfs;
    }

    public void setObfs(String obfs) {
        this.obfs = obfs;
    }

    @Basic
    @Column(name = "obfs_param")
    public String getObfsParam() {
        return obfsParam;
    }

    public void setObfsParam(String obfsParam) {
        this.obfsParam = obfsParam;
    }

    @Basic
    @Column(name = "forbidden_ip")
    public String getForbiddenIp() {
        return forbiddenIp;
    }

    public void setForbiddenIp(String forbiddenIp) {
        this.forbiddenIp = forbiddenIp;
    }

    @Basic
    @Column(name = "forbidden_port")
    public String getForbiddenPort() {
        return forbiddenPort;
    }

    public void setForbiddenPort(String forbiddenPort) {
        this.forbiddenPort = forbiddenPort;
    }

    @Basic
    @Column(name = "disconnect_ip")
    public String getDisconnectIp() {
        return disconnectIp;
    }

    public void setDisconnectIp(String disconnectIp) {
        this.disconnectIp = disconnectIp;
    }

    @Basic
    @Column(name = "is_hide")
    public int getIsHide() {
        return isHide;
    }

    public void setIsHide(int isHide) {
        this.isHide = isHide;
    }

    @Basic
    @Column(name = "is_multi_user")
    public int getIsMultiUser() {
        return isMultiUser;
    }

    public void setIsMultiUser(int isMultiUser) {
        this.isMultiUser = isMultiUser;
    }

    @Basic
    @Column(name = "telegram_id")
    public Long getTelegramId() {
        return telegramId;
    }

    public void setTelegramId(Long telegramId) {
        this.telegramId = telegramId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto userDto = (UserDto) o;
        return id == userDto.id &&
                t == userDto.t &&
                u == userDto.u &&
                d == userDto.d &&
                transferEnable == userDto.transferEnable &&
                port == userDto.port &&
                canSwitch == userDto.canSwitch &&
                enable == userDto.enable &&
                type == userDto.type &&
                lastGetGiftTime == userDto.lastGetGiftTime &&
                lastCheckInTime == userDto.lastCheckInTime &&
                lastRestPassTime == userDto.lastRestPassTime &&
                inviteNum == userDto.inviteNum &&
                refBy == userDto.refBy &&
                expireTime == userDto.expireTime &&
                isEmailVerify == userDto.isEmailVerify &&
                nodeConnector == userDto.nodeConnector &&
                isAdmin == userDto.isAdmin &&
                lastDayT == userDto.lastDayT &&
                sendDailyMail == userDto.sendDailyMail &&
                clazz == userDto.clazz &&
                gaEnable == userDto.gaEnable &&
                nodeGroup == userDto.nodeGroup &&
                autoResetDay == userDto.autoResetDay &&
                isHide == userDto.isHide &&
                isMultiUser == userDto.isMultiUser &&
                Objects.equals(userName, userDto.userName) &&
                Objects.equals(email, userDto.email) &&
                Objects.equals(pass, userDto.pass) &&
                Objects.equals(passwd, userDto.passwd) &&
                Objects.equals(plan, userDto.plan) &&
                Objects.equals(regDate, userDto.regDate) &&
                Objects.equals(money, userDto.money) &&
                Objects.equals(method, userDto.method) &&
                Objects.equals(regIp, userDto.regIp) &&
                Objects.equals(nodeSpeedlimit, userDto.nodeSpeedlimit) &&
                Objects.equals(imType, userDto.imType) &&
                Objects.equals(imValue, userDto.imValue) &&
                Objects.equals(classExpire, userDto.classExpire) &&
                Objects.equals(expireIn, userDto.expireIn) &&
                Objects.equals(theme, userDto.theme) &&
                Objects.equals(gaToken, userDto.gaToken) &&
                Objects.equals(pac, userDto.pac) &&
                Objects.equals(remark, userDto.remark) &&
                Objects.equals(autoResetBandwidth, userDto.autoResetBandwidth) &&
                Objects.equals(protocol, userDto.protocol) &&
                Objects.equals(protocolParam, userDto.protocolParam) &&
                Objects.equals(obfs, userDto.obfs) &&
                Objects.equals(obfsParam, userDto.obfsParam) &&
                Objects.equals(forbiddenIp, userDto.forbiddenIp) &&
                Objects.equals(forbiddenPort, userDto.forbiddenPort) &&
                Objects.equals(disconnectIp, userDto.disconnectIp) &&
                Objects.equals(telegramId, userDto.telegramId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userName, email, pass, passwd, t, u, d, plan, transferEnable, port, canSwitch, enable, type, lastGetGiftTime, lastCheckInTime, lastRestPassTime, regDate, inviteNum, money, refBy, expireTime, method, isEmailVerify, regIp, nodeSpeedlimit, nodeConnector, isAdmin, imType, imValue, lastDayT, sendDailyMail, clazz, classExpire, expireIn, theme, gaToken, gaEnable, pac, remark, nodeGroup, autoResetDay, autoResetBandwidth, protocol, protocolParam, obfs, obfsParam, forbiddenIp, forbiddenPort, disconnectIp, isHide, isMultiUser, telegramId);
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", passwd='" + passwd + '\'' +
                ", t=" + t +
                ", u=" + u +
                ", d=" + d +
                ", plan='" + plan + '\'' +
                ", transferEnable=" + transferEnable +
                ", port=" + port +
                ", canSwitch=" + canSwitch +
                ", enable=" + enable +
                ", type=" + type +
                ", lastGetGiftTime=" + lastGetGiftTime +
                ", lastCheckInTime=" + lastCheckInTime +
                ", lastRestPassTime=" + lastRestPassTime +
                ", regDate=" + regDate +
                ", inviteNum=" + inviteNum +
                ", money=" + money +
                ", refBy=" + refBy +
                ", expireTime=" + expireTime +
                ", method='" + method + '\'' +
                ", isEmailVerify=" + isEmailVerify +
                ", regIp='" + regIp + '\'' +
                ", nodeSpeedlimit=" + nodeSpeedlimit +
                ", nodeConnector=" + nodeConnector +
                ", isAdmin=" + isAdmin +
                ", imType=" + imType +
                ", imValue='" + imValue + '\'' +
                ", lastDayT=" + lastDayT +
                ", sendDailyMail=" + sendDailyMail +
                ", clazz=" + clazz +
                ", classExpire=" + classExpire +
                ", expireIn=" + expireIn +
                ", theme='" + theme + '\'' +
                ", gaToken='" + gaToken + '\'' +
                ", gaEnable=" + gaEnable +
                ", pac='" + pac + '\'' +
                ", remark='" + remark + '\'' +
                ", nodeGroup=" + nodeGroup +
                ", autoResetDay=" + autoResetDay +
                ", autoResetBandwidth=" + autoResetBandwidth +
                ", protocol='" + protocol + '\'' +
                ", protocolParam='" + protocolParam + '\'' +
                ", obfs='" + obfs + '\'' +
                ", obfsParam='" + obfsParam + '\'' +
                ", forbiddenIp='" + forbiddenIp + '\'' +
                ", forbiddenPort='" + forbiddenPort + '\'' +
                ", disconnectIp='" + disconnectIp + '\'' +
                ", isHide=" + isHide +
                ", isMultiUser=" + isMultiUser +
                ", telegramId=" + telegramId +
                '}';
    }
}
