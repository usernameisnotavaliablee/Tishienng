package com.bxkj.base.user;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LoginUser {
    private static com.bxkj.base.user.LoginUser loginUser;
    private java.lang.String QR_Code;
    private java.lang.String accessToken;
    private java.lang.String account;
    private java.lang.String achieveTime;
    private java.lang.String address;
    private boolean agreement;
    private java.lang.String appId;
    private java.lang.String birthday;
    private java.util.List<android.graphics.Bitmap> bitmapList;
    private java.util.List<com.bxkj.base.user.LoginUser.ChatConnectListener> chatConnectListenerList;
    private boolean chatConnectStatus;
    private java.lang.String city_id;
    private java.lang.String clearDataPassword;
    private java.lang.String currentCity;
    private java.lang.String email;
    private java.lang.String energy_QTY;
    private int frequency;
    private java.lang.String gender;
    private java.lang.String gold;
    private java.lang.String headImageUrl;
    private java.lang.String idcard;
    private boolean isAuthorizationDonation;
    private boolean isAuthorizationInJob;
    private boolean isAuthorizationInLost;
    private boolean isAuthorizationInMall;
    private boolean isAuthorizationInRuner;
    private boolean isAuthorizationInSecondHand;
    private boolean isCheckIgnoreRunSet;
    private boolean isFirst;
    private boolean isFirstUserSQJL;
    private boolean isLogin;
    private java.lang.String isOpenEncry;
    private int isOpenKeep;
    private int isOpenLive;
    private boolean isOpenModel;
    private java.lang.String is_sign;
    private java.lang.String is_verify;
    private java.lang.String keepToken;
    private long lastHeartCallBackTime;
    private long lastLoginTime;
    private int lastVersionCode;
    private java.lang.String levels;
    private java.lang.String location;
    private java.util.List<com.bxkj.base.user.LoginUser.LoginListener> loginListenerList;
    private java.lang.String marryDate;
    private java.lang.String msg_QTY;
    private int nfcCardType;
    private java.lang.String nickName;
    private boolean noPrompt;
    private java.lang.String oldToNewH5;
    private java.lang.String openId;
    private java.lang.String password;
    private java.lang.String phone;
    private java.lang.String planWalk_QTY;
    private java.lang.String point;
    private java.lang.String province_id;
    private java.lang.String realName;
    private java.lang.String region_id;
    private java.lang.String remind;
    private java.lang.String roleName;
    private java.lang.String schoolCode;
    private java.lang.String schoolId;
    private java.lang.String schoolName;
    private java.lang.String serverUrl;
    private java.lang.String sex;
    private cn.bluemobi.dylan.base.utils.r sp;
    private java.lang.String sumEnergy_QTY;
    private java.lang.String synTime;
    private int sysType;
    private java.lang.String tempUserId;
    private java.lang.String tempUserName;
    private java.lang.String tempUserNumber;
    private java.lang.String tempUserPhone;
    private java.lang.String token;
    private java.lang.String uploadTime;
    private java.lang.String userId;
    private int userPreferenceMode;
    private int userType;
    private java.lang.String user_specialty;
    private java.lang.String usersignature;
    private boolean voiceOpen;
    private java.lang.String wallet;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ChatConnectListener {
        void connectStatusChange(boolean r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface LoginListener {
        void loginStatusChange(boolean r1);
    }

    static {
            com.bxkj.base.user.LoginUser r0 = new com.bxkj.base.user.LoginUser
            r0.<init>()
            com.bxkj.base.user.LoginUser.loginUser = r0
            return
    }

    private LoginUser() {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.nfcCardType = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.bitmapList = r1
            java.lang.String r1 = "0"
            r4.msg_QTY = r1
            r1 = 1
            r4.isFirst = r1
            r4.lastVersionCode = r0
            r2 = 0
            r4.lastLoginTime = r2
            r4.isFirstUserSQJL = r1
            r4.noPrompt = r0
            cn.bluemobi.dylan.base.utils.r r1 = new cn.bluemobi.dylan.base.utils.r
            com.bxkj.base.BaseApp r2 = com.bxkj.base.BaseApp.c()
            r1.<init>(r2)
            r4.sp = r1
            r4.isAuthorizationInMall = r0
            r4.isAuthorizationInLost = r0
            r4.isAuthorizationInSecondHand = r0
            r4.isAuthorizationInJob = r0
            r4.isAuthorizationInRuner = r0
            r4.isAuthorizationDonation = r0
            r4.isLogin = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.loginListenerList = r1
            r4.chatConnectStatus = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.chatConnectListenerList = r0
            return
    }

    public static com.bxkj.base.user.LoginUser getLoginUser() {
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.loginUser
            return r0
    }

    public void addChatConnectListener(com.bxkj.base.user.LoginUser.ChatConnectListener r2) {
            r1 = this;
            java.util.List<com.bxkj.base.user.LoginUser$ChatConnectListener> r0 = r1.chatConnectListenerList
            r0.add(r2)
            return
    }

    public void addLoginListener(com.bxkj.base.user.LoginUser.LoginListener r2) {
            r1 = this;
            java.util.List<com.bxkj.base.user.LoginUser$LoginListener> r0 = r1.loginListenerList
            r0.add(r2)
            return
    }

    public java.lang.String getAccessToken() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "accessToken"
            java.lang.String r2 = "e34e6ce9-d599-4d2c-8f15-d475849d3e4d"
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.accessToken = r0
            return r0
    }

    public java.lang.String getAccount() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "account"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.account = r0
            return r0
    }

    public java.lang.String getAchieveTime() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "achieveTime"
            java.lang.String r2 = "21:00"
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.achieveTime = r0
            return r0
    }

    public java.lang.String getAddress() {
            r1 = this;
            java.lang.String r0 = r1.address
            return r0
    }

    public java.lang.String getAppId() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "appId"
            java.lang.String r2 = "move"
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.appId = r0
            return r0
    }

    public java.lang.String getBirthday() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "birthday"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.birthday = r0
            return r0
    }

    public java.util.List<android.graphics.Bitmap> getBitmapList() {
            r1 = this;
            java.util.List<android.graphics.Bitmap> r0 = r1.bitmapList
            return r0
    }

    public java.lang.String getCity_id() {
            r1 = this;
            java.lang.String r0 = r1.city_id
            return r0
    }

    public java.lang.String getClearDataPassword() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "clearDataPassword"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.clearDataPassword = r0
            return r0
    }

    public java.lang.String getCurrentCity() {
            r1 = this;
            java.lang.String r0 = r1.currentCity
            return r0
    }

    public java.lang.String getEmail() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "email"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.email = r0
            return r0
    }

    public java.lang.String getEnergy_QTY() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "energy_QTY"
            java.lang.String r2 = "0"
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.energy_QTY = r0
            return r0
    }

    public int getFrequency() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "frequency"
            java.lang.Object r0 = r0.b(r2, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.frequency = r0
            return r0
    }

    public java.lang.String getGender() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "gender"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.gender = r0
            return r0
    }

    public java.lang.String getGold() {
            r1 = this;
            java.lang.String r0 = r1.gold
            return r0
    }

    public java.lang.String getHeadImageUrl() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "headImageUrl"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.headImageUrl = r0
            return r0
    }

    public java.lang.String getIdcard() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "idcard"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.idcard = r0
            return r0
    }

    public boolean getIsFirst() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "QR_Code"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3.isFirst = r0
            return r0
    }

    public java.lang.String getIsOpenEncry() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "isOpenEncry"
            java.lang.String r2 = "0"
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.isOpenEncry = r0
            return r0
    }

    public int getIsOpenKeep() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "isOpenKeep"
            java.lang.Object r0 = r0.b(r2, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.isOpenKeep = r0
            return r0
    }

    public int getIsOpenLive() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "isOpenLive"
            java.lang.Object r0 = r0.b(r2, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.isOpenLive = r0
            return r0
    }

    public java.lang.String getIs_sign() {
            r1 = this;
            java.lang.String r0 = r1.is_sign
            return r0
    }

    public java.lang.String getIs_verify() {
            r1 = this;
            java.lang.String r0 = r1.is_verify
            return r0
    }

    public java.lang.String getKeepToken() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "keepToken"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.keepToken = r0
            return r0
    }

    public long getLastHeartCallBackTime() {
            r2 = this;
            long r0 = r2.lastHeartCallBackTime
            return r0
    }

    public long getLastLoginTime() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "lastLoginTime"
            java.lang.Object r0 = r0.b(r2, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r3.lastLoginTime = r0
            return r0
    }

    public int getLastVersionCode() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "lastVersionCode"
            java.lang.Object r0 = r0.b(r2, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.lastVersionCode = r0
            return r0
    }

    public java.lang.String getLevels() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "levels"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.levels = r0
            return r0
    }

    public java.lang.String getLocation() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "location"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.location = r0
            return r0
    }

    public java.lang.String getMarryDate() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "marryDate"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.marryDate = r0
            return r0
    }

    public java.lang.String getMsg_QTY() {
            r1 = this;
            java.lang.String r0 = r1.msg_QTY
            return r0
    }

    public int getNfcCardType() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "nfcCardType"
            java.lang.Object r0 = r0.b(r2, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.nfcCardType = r0
            return r0
    }

    public java.lang.String getNickName() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "nickName"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.nickName = r0
            return r0
    }

    public java.lang.String getOldToNewH5() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "oldToNewH5"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.oldToNewH5 = r0
            return r0
    }

    public java.lang.String getOpenId() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "openId"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.openId = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.bxkj.base.user.LoginUser r1 = getLoginUser()
            java.lang.String r1 = r1.getSchoolId()
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            com.bxkj.base.user.LoginUser r1 = getLoginUser()
            java.lang.String r1 = r1.getUserId()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.openId = r0
            return r0
    }

    public java.lang.String getPassword() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "password"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.password = r0
            return r0
    }

    public java.lang.String getPhone() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "phone"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.phone = r0
            return r0
    }

    public java.lang.String getPlanWalk_QTY() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "planWalk_QTY"
            java.lang.String r2 = "7000"
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.planWalk_QTY = r0
            return r0
    }

    public java.lang.String getPoint() {
            r1 = this;
            java.lang.String r0 = r1.point
            return r0
    }

    public java.lang.String getProvince_id() {
            r1 = this;
            java.lang.String r0 = r1.province_id
            return r0
    }

    public java.lang.String getQR_Code() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "QR_Code"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.QR_Code = r0
            return r0
    }

    public java.lang.String getRealName() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "realName"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.realName = r0
            return r0
    }

    public java.lang.String getRegion_id() {
            r1 = this;
            java.lang.String r0 = r1.region_id
            return r0
    }

    public java.lang.String getRemind() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "remind"
            java.lang.String r2 = "1"
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.remind = r0
            return r0
    }

    public java.lang.String getRoleName() {
            r1 = this;
            java.lang.String r0 = r1.roleName
            return r0
    }

    public java.lang.String getSchoolCode() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "schoolCode"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.schoolCode = r0
            return r0
    }

    public java.lang.String getSchoolId() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "schoolId"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.schoolId = r0
            return r0
    }

    public java.lang.String getSchoolName() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "schoolName"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.schoolName = r0
            return r0
    }

    public java.lang.String getServerUrl() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "serverUrl"
            java.lang.String r2 = "https://m.boxkj.com/"
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.serverUrl = r0
            java.lang.String r1 = "http://"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L24
            java.lang.String r0 = r3.serverUrl
            java.lang.String r1 = "https://"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L24
            java.lang.String r0 = "https://tsncs.boxkj.com/"
            r3.serverUrl = r0
        L24:
            java.lang.String r0 = r3.serverUrl
            java.lang.String r1 = "/"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r3.serverUrl
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.serverUrl = r0
        L41:
            java.lang.String r0 = r3.serverUrl
            return r0
    }

    public java.lang.String getSex() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "sex"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.sex = r0
            return r0
    }

    public java.lang.String getSumEnergy_QTY() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "sumEnergy_QTY"
            java.lang.String r2 = "0"
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.sumEnergy_QTY = r0
            return r0
    }

    public java.lang.String getSynTime() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "synTime"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.synTime = r0
            return r0
    }

    public int getSysType() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "sysType"
            java.lang.Object r0 = r0.b(r2, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.sysType = r0
            return r0
    }

    public java.lang.String getTempUserId() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "tempUserId"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.tempUserId = r0
            return r0
    }

    public java.lang.String getTempUserName() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "tempUserName"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.tempUserName = r0
            return r0
    }

    public java.lang.String getTempUserNumber() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "tempUserNumber"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.tempUserNumber = r0
            return r0
    }

    public java.lang.String getTempUserPhone() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "tempUserPhone"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.tempUserPhone = r0
            return r0
    }

    public java.lang.String getToken() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "token"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.token = r0
            return r0
    }

    public java.lang.String getUploadTime() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "uploadTime"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.uploadTime = r0
            return r0
    }

    public java.lang.String getUserId() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "userId"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.userId = r0
            return r0
    }

    public int getUserPreferenceMode() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "userPreferenceMode"
            java.lang.Object r0 = r0.b(r2, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.userPreferenceMode = r0
            return r0
    }

    public int getUserType() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "userType"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            r2 = 1
            if (r1 != 0) goto L26
            java.lang.String r1 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L22
            r3.userType = r2
            goto L28
        L22:
            r0 = 2
            r3.userType = r0
            goto L28
        L26:
            r3.userType = r2
        L28:
            int r0 = r3.userType
            return r0
    }

    public java.lang.String getUser_specialty() {
            r1 = this;
            java.lang.String r0 = r1.user_specialty
            return r0
    }

    public java.lang.String getUsersignature() {
            r1 = this;
            java.lang.String r0 = r1.usersignature
            return r0
    }

    public java.lang.String getViewAfterLabelName() {
            r2 = this;
            java.lang.String r0 = r2.getSchoolName()
            java.lang.String r1 = "西安电子科技大学"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = "俱乐部"
            return r0
        Lf:
            java.lang.String r0 = "选课"
            return r0
    }

    public java.lang.String getWallet() {
            r1 = this;
            java.lang.String r0 = r1.wallet
            return r0
    }

    public java.lang.String getXuanAfterLabelName() {
            r2 = this;
            java.lang.String r0 = r2.getSchoolName()
            java.lang.String r1 = "西安电子科技大学"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = "俱乐部"
            return r0
        Lf:
            java.lang.String r0 = "课"
            return r0
    }

    public java.lang.String getXuanZeAfterLabelName() {
            r2 = this;
            java.lang.String r0 = r2.getSchoolName()
            java.lang.String r1 = "西安电子科技大学"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = "俱乐部"
            return r0
        Lf:
            java.lang.String r0 = "课程"
            return r0
    }

    public boolean isAgreement() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "agreement"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3.agreement = r0
            return r0
    }

    public boolean isAuthorizationDonation() {
            r1 = this;
            boolean r0 = r1.isAuthorizationDonation
            return r0
    }

    public boolean isAuthorizationInJob() {
            r1 = this;
            boolean r0 = r1.isAuthorizationInJob
            return r0
    }

    public boolean isAuthorizationInLost() {
            r1 = this;
            boolean r0 = r1.isAuthorizationInLost
            return r0
    }

    public boolean isAuthorizationInMall() {
            r1 = this;
            boolean r0 = r1.isAuthorizationInMall
            return r0
    }

    public boolean isAuthorizationInRuner() {
            r1 = this;
            boolean r0 = r1.isAuthorizationInRuner
            return r0
    }

    public boolean isAuthorizationInSecondHand() {
            r1 = this;
            boolean r0 = r1.isAuthorizationInSecondHand
            return r0
    }

    public boolean isChatConnectStatus() {
            r1 = this;
            boolean r0 = r1.chatConnectStatus
            return r0
    }

    public boolean isCheckIgnoreRunSet() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "isCheckIgnoreRunSet"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3.isCheckIgnoreRunSet = r0
            return r0
    }

    public boolean isFirstUserSQJL() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "isFirstUserSQJL"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3.isFirstUserSQJL = r0
            return r0
    }

    public boolean isLogin() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "login"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3.isLogin = r0
            return r0
    }

    public boolean isNoPrompt() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "noPrompt"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3.noPrompt = r0
            return r0
    }

    public boolean isOpenModel() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "openModel"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3.isOpenModel = r0
            return r0
    }

    public boolean isVoiceOpen() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "voiceOpen"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3.voiceOpen = r0
            return r0
    }

    public com.bxkj.base.user.LoginUser setAccessToken(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "accessToken"
            r0.d(r1, r3)
            r2.accessToken = r3
            return r2
    }

    public void setAccount(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "account"
            r0.d(r1, r3)
            r2.account = r3
            return
    }

    public void setAchieveTime(java.lang.String r3) {
            r2 = this;
            boolean r0 = r3.isEmpty()
            java.lang.String r1 = "achieveTime"
            if (r0 == 0) goto L12
            cn.bluemobi.dylan.base.utils.r r3 = r2.sp
            java.lang.String r0 = "21:00"
            r3.d(r1, r0)
            r2.achieveTime = r0
            return
        L12:
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            r0.d(r1, r3)
            r2.achieveTime = r3
            return
    }

    public void setAddress(java.lang.String r1) {
            r0 = this;
            r0.address = r1
            return
    }

    public com.bxkj.base.user.LoginUser setAgreement(boolean r4) {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "agreement"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r0.d(r1, r2)
            r3.agreement = r4
            return r3
    }

    public void setAppId(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "appId"
            r0.d(r1, r3)
            r2.appId = r3
            return
    }

    public com.bxkj.base.user.LoginUser setAuthorizationDonation(boolean r1) {
            r0 = this;
            r0.isAuthorizationDonation = r1
            return r0
    }

    public com.bxkj.base.user.LoginUser setAuthorizationInJob(boolean r1) {
            r0 = this;
            r0.isAuthorizationInJob = r1
            return r0
    }

    public com.bxkj.base.user.LoginUser setAuthorizationInLost(boolean r1) {
            r0 = this;
            r0.isAuthorizationInLost = r1
            return r0
    }

    public com.bxkj.base.user.LoginUser setAuthorizationInMall(boolean r1) {
            r0 = this;
            r0.isAuthorizationInMall = r1
            return r0
    }

    public com.bxkj.base.user.LoginUser setAuthorizationInRuner(boolean r1) {
            r0 = this;
            r0.isAuthorizationInRuner = r1
            return r0
    }

    public com.bxkj.base.user.LoginUser setAuthorizationInSecondHand(boolean r1) {
            r0 = this;
            r0.isAuthorizationInSecondHand = r1
            return r0
    }

    public void setBirthday(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "birthday"
            r0.d(r1, r3)
            r2.birthday = r3
            return
    }

    public com.bxkj.base.user.LoginUser setBitmapList(java.util.List<android.graphics.Bitmap> r1) {
            r0 = this;
            r0.bitmapList = r1
            return r0
    }

    public void setChatConnectStatus(boolean r3) {
            r2 = this;
            r2.chatConnectStatus = r3
            java.util.List<com.bxkj.base.user.LoginUser$ChatConnectListener> r0 = r2.chatConnectListenerList
            if (r0 == 0) goto L1a
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.bxkj.base.user.LoginUser$ChatConnectListener r1 = (com.bxkj.base.user.LoginUser.ChatConnectListener) r1
            r1.connectStatusChange(r3)
            goto La
        L1a:
            return
    }

    public void setCheckIgnoreRunSet(boolean r4) {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "isCheckIgnoreRunSet"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r0.d(r1, r2)
            r3.isCheckIgnoreRunSet = r4
            return
    }

    public void setCity_id(java.lang.String r1) {
            r0 = this;
            r0.city_id = r1
            return
    }

    public com.bxkj.base.user.LoginUser setClearDataPassword(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "clearDataPassword"
            r0.d(r1, r3)
            r2.clearDataPassword = r3
            return r2
    }

    public void setCurrentCity(java.lang.String r1) {
            r0 = this;
            r0.currentCity = r1
            return
    }

    public void setEmail(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "email"
            r0.d(r1, r3)
            r2.email = r3
            return
    }

    public void setEnergy_QTY(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "energy_QTY"
            r0.d(r1, r3)
            r2.energy_QTY = r3
            return
    }

    public com.bxkj.base.user.LoginUser setFirstUserSQJL(boolean r4) {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "isFirstUserSQJL"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r0.d(r1, r2)
            r3.isFirstUserSQJL = r4
            return r3
    }

    public com.bxkj.base.user.LoginUser setFrequency(int r4) {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "frequency"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.d(r1, r2)
            r3.frequency = r4
            return r3
    }

    public void setGender(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "gender"
            r0.d(r1, r3)
            r2.gender = r3
            return
    }

    public void setGold(java.lang.String r1) {
            r0 = this;
            r0.gold = r1
            return
    }

    public void setHeadImageUrl(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "headImageUrl"
            r0.d(r1, r3)
            r2.headImageUrl = r3
            return
    }

    public void setIdcard(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "idcard"
            r0.d(r1, r3)
            r2.idcard = r3
            return
    }

    public void setIsFirst(boolean r4) {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "isFirst"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r0.d(r1, r2)
            r3.isFirst = r4
            return
    }

    public com.bxkj.base.user.LoginUser setIsOpenEncry(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "isOpenEncry"
            r0.d(r1, r3)
            r2.isOpenEncry = r3
            return r2
    }

    public com.bxkj.base.user.LoginUser setIsOpenKeep(int r4) {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "isOpenKeep"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.d(r1, r2)
            r3.isOpenKeep = r4
            return r3
    }

    public com.bxkj.base.user.LoginUser setIsOpenLive(int r4) {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "isOpenLive"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.d(r1, r2)
            r3.isOpenLive = r4
            return r3
    }

    public void setIs_sign(java.lang.String r1) {
            r0 = this;
            r0.is_sign = r1
            return
    }

    public void setIs_verify(java.lang.String r1) {
            r0 = this;
            r0.is_verify = r1
            return
    }

    public com.bxkj.base.user.LoginUser setKeepToken(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "keepToken"
            r0.d(r1, r3)
            r2.keepToken = r3
            return r2
    }

    public void setLastHeartCallBackTime(long r1) {
            r0 = this;
            r0.lastHeartCallBackTime = r1
            return
    }

    public void setLastLoginTime(long r4) {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "lastLoginTime"
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r0.d(r1, r2)
            r3.lastLoginTime = r4
            return
    }

    public void setLastVersionCode(int r4) {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "lastVersionCode"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.d(r1, r2)
            r3.lastVersionCode = r4
            return
    }

    public void setLevels(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "levels"
            r0.d(r1, r3)
            r2.levels = r3
            return
    }

    public void setLocation(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "location"
            r0.d(r1, r3)
            r2.location = r3
            return
    }

    public com.bxkj.base.user.LoginUser setLogin(boolean r4) {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "login"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r0.d(r1, r2)
            r3.isLogin = r4
            java.util.List<com.bxkj.base.user.LoginUser$LoginListener> r4 = r3.loginListenerList
            if (r4 == 0) goto L27
            java.util.Iterator r4 = r4.iterator()
        L15:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r4.next()
            com.bxkj.base.user.LoginUser$LoginListener r0 = (com.bxkj.base.user.LoginUser.LoginListener) r0
            boolean r1 = r3.isLogin
            r0.loginStatusChange(r1)
            goto L15
        L27:
            return r3
    }

    public void setMarryDate(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "marryDate"
            r0.d(r1, r3)
            r2.marryDate = r3
            return
    }

    public void setMsg_QTY(java.lang.String r1) {
            r0 = this;
            r0.msg_QTY = r1
            return
    }

    public com.bxkj.base.user.LoginUser setNfcCardType(int r4) {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "nfcCardType"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.d(r1, r2)
            r3.nfcCardType = r4
            return r3
    }

    public void setNickName(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "nickName"
            r0.d(r1, r3)
            r2.nickName = r3
            return
    }

    public com.bxkj.base.user.LoginUser setNoPrompt(boolean r4) {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "noPrompt"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r0.d(r1, r2)
            r3.noPrompt = r4
            return r3
    }

    public com.bxkj.base.user.LoginUser setOldToNewH5(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "oldToNewH5"
            r0.d(r1, r3)
            r2.oldToNewH5 = r3
            return r2
    }

    public void setOpen(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "openId"
            r0.d(r1, r3)
            r2.openId = r3
            return
    }

    public com.bxkj.base.user.LoginUser setOpenModel(boolean r4) {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "openModel"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r0.d(r1, r2)
            r3.isOpenModel = r4
            return r3
    }

    public void setPassword(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "password"
            r0.d(r1, r3)
            r2.password = r3
            return
    }

    public void setPhone(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "phone"
            r0.d(r1, r3)
            r2.phone = r3
            return
    }

    public void setPlanWalk_QTY(java.lang.String r4) {
            r3 = this;
            boolean r0 = r4.isEmpty()
            java.lang.String r1 = "planWalk_QTY"
            if (r0 != 0) goto L17
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L11
            goto L17
        L11:
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            r0.d(r1, r4)
            goto L1e
        L17:
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r2 = "7000"
            r0.d(r1, r2)
        L1e:
            r3.planWalk_QTY = r4
            return
    }

    public void setPoint(java.lang.String r1) {
            r0 = this;
            r0.point = r1
            return
    }

    public void setProvince_id(java.lang.String r1) {
            r0 = this;
            r0.province_id = r1
            return
    }

    public void setQR_Code(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "QR_Code"
            r0.d(r1, r3)
            r2.QR_Code = r3
            return
    }

    public void setRealName(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "realName"
            r0.d(r1, r3)
            r2.realName = r3
            return
    }

    public void setRegion_id(java.lang.String r1) {
            r0 = this;
            r0.region_id = r1
            return
    }

    public void setRemind(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "remind"
            r0.d(r1, r3)
            r2.remind = r3
            return
    }

    public com.bxkj.base.user.LoginUser setRoleName(java.lang.String r1) {
            r0 = this;
            r0.roleName = r1
            return r0
    }

    public void setSchoolCode(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "schoolCode"
            r0.d(r1, r3)
            r2.schoolCode = r3
            return
    }

    public void setSchoolId(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "schoolId"
            r0.d(r1, r3)
            r2.schoolId = r3
            return
    }

    public void setSchoolName(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "schoolName"
            r0.d(r1, r3)
            r2.schoolName = r3
            return
    }

    public void setServerUrl(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "serverUrl"
            r0.d(r1, r3)
            r2.serverUrl = r3
            return
    }

    public void setSex(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "sex"
            r0.d(r1, r3)
            r2.sex = r3
            return
    }

    public void setSumEnergy_QTY(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "sumEnergy_QTY"
            r0.d(r1, r3)
            r2.sumEnergy_QTY = r3
            return
    }

    public void setSynTime(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "synTime"
            r0.d(r1, r3)
            r2.synTime = r3
            return
    }

    public com.bxkj.base.user.LoginUser setSysType(int r4) {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "sysType"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.d(r1, r2)
            r3.sysType = r4
            return r3
    }

    public void setTempUserId(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "tempUserId"
            r0.d(r1, r3)
            r2.tempUserId = r3
            return
    }

    public void setTempUserName(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "tempUserName"
            r0.d(r1, r3)
            r2.tempUserName = r3
            return
    }

    public void setTempUserNumber(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "tempUserNumber"
            r0.d(r1, r3)
            r2.tempUserNumber = r3
            return
    }

    public void setTempUserPhone(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "tempUserPhone"
            r0.d(r1, r3)
            r2.tempUserPhone = r3
            return
    }

    public void setToken(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "token"
            r0.d(r1, r3)
            r2.token = r3
            return
    }

    public void setUploadTime(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "uploadTime"
            r0.d(r1, r3)
            r2.uploadTime = r3
            return
    }

    public void setUserId(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r2.sp
            java.lang.String r1 = "userId"
            r0.d(r1, r3)
            r2.userId = r3
            return
    }

    public void setUserPreferenceMode(int r4) {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "userPreferenceMode"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.d(r1, r2)
            r3.userPreferenceMode = r4
            return
    }

    public void setUserType(int r4) {
            r3 = this;
            r0 = 1
            java.lang.String r1 = "userType"
            if (r4 != r0) goto Ld
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r2 = "1"
            r0.d(r1, r2)
            goto L14
        Ld:
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r2 = "2"
            r0.d(r1, r2)
        L14:
            r3.userType = r4
            return
    }

    public void setUser_specialty(java.lang.String r1) {
            r0 = this;
            r0.user_specialty = r1
            return
    }

    public void setUsersignature(java.lang.String r1) {
            r0 = this;
            r0.usersignature = r1
            return
    }

    public com.bxkj.base.user.LoginUser setVoiceOpen(boolean r4) {
            r3 = this;
            cn.bluemobi.dylan.base.utils.r r0 = r3.sp
            java.lang.String r1 = "voiceOpen"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r0.d(r1, r2)
            r3.voiceOpen = r4
            return r3
    }

    public void setWallet(java.lang.String r1) {
            r0 = this;
            r0.wallet = r1
            return
    }
}
