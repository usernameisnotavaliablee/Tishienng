package com.umeng.socialize;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Config {
    public static java.lang.String Descriptor = null;
    public static java.lang.String EntityKey = "-1";
    public static java.lang.String EntityName = "share";
    public static final boolean Google = false;

    @java.lang.Deprecated
    public static int KaKaoLoginType = 0;

    @java.lang.Deprecated
    public static int LinkedInProfileScope = 0;

    @java.lang.Deprecated
    public static int LinkedInShareCode = 0;
    public static final int MINIPTOGRAM_TYPE_RELEASE = 0;
    public static java.lang.String MORE_TITLE = null;

    @java.lang.Deprecated
    public static boolean OpenEditor = true;

    @java.lang.Deprecated
    public static java.lang.String QQAPPNAME;

    @java.lang.Deprecated
    public static int QQWITHQZONE;
    public static java.lang.String SessionId;
    private static int a;

    @java.lang.Deprecated
    public static java.lang.String appName;
    public static int connectionTimeOut;
    public static boolean isFacebookRead;
    public static boolean isJumptoAppStore;

    @java.lang.Deprecated
    public static boolean isNeedAuth;
    public static java.lang.Boolean isUmengDY;
    public static java.lang.Boolean isUmengQQ;
    public static java.lang.Boolean isUmengSina;
    public static java.lang.Boolean isUmengWx;
    public static final boolean mEncrypt = false;
    public static int readSocketTimeOut;
    public static java.lang.String shareType;

    static {
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            com.umeng.socialize.Config.isUmengSina = r0
            com.umeng.socialize.Config.isUmengWx = r0
            com.umeng.socialize.Config.isUmengQQ = r0
            com.umeng.socialize.Config.isUmengDY = r0
            java.lang.String r0 = "com.umeng.share"
            com.umeng.socialize.Config.Descriptor = r0
            r0 = 0
            com.umeng.socialize.Config.SessionId = r0
            r0 = 2
            com.umeng.socialize.Config.QQWITHQZONE = r0
            java.lang.String r0 = ""
            com.umeng.socialize.Config.QQAPPNAME = r0
            java.lang.String r0 = "native"
            com.umeng.socialize.Config.shareType = r0
            r0 = 0
            com.umeng.socialize.Config.KaKaoLoginType = r0
            java.lang.String r1 = "分享"
            com.umeng.socialize.Config.MORE_TITLE = r1
            com.umeng.socialize.Config.LinkedInProfileScope = r0
            com.umeng.socialize.Config.LinkedInShareCode = r0
            r1 = 30000(0x7530, float:4.2039E-41)
            com.umeng.socialize.Config.connectionTimeOut = r1
            com.umeng.socialize.Config.readSocketTimeOut = r1
            com.umeng.socialize.Config.isNeedAuth = r0
            com.umeng.socialize.Config.isJumptoAppStore = r0
            com.umeng.socialize.Config.isFacebookRead = r0
            com.umeng.socialize.Config.a = r0
            return
    }

    public Config() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getMINITYPE() {
            int r0 = com.umeng.socialize.Config.a
            return r0
    }

    public static void setMini() {
            r0 = 0
            com.umeng.socialize.Config.a = r0
            return
    }

    public static void setMiniPreView() {
            r0 = 2
            com.umeng.socialize.Config.a = r0
            return
    }

    public static void setMiniTest() {
            r0 = 1
            com.umeng.socialize.Config.a = r0
            return
    }
}
