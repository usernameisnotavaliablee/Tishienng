package com.umeng.socialize.bean;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum UmengErrorCode extends java.lang.Enum<com.umeng.socialize.bean.UmengErrorCode> {
    private static final /* synthetic */ com.umeng.socialize.bean.UmengErrorCode[] $VALUES = null;
    public static final com.umeng.socialize.bean.UmengErrorCode AuthorizeFailed = null;
    public static final com.umeng.socialize.bean.UmengErrorCode NotInstall = null;
    public static final com.umeng.socialize.bean.UmengErrorCode RequestForUserProfileFailed = null;
    public static final com.umeng.socialize.bean.UmengErrorCode ShareDataNil = null;
    public static final com.umeng.socialize.bean.UmengErrorCode ShareDataTypeIllegal = null;
    public static final com.umeng.socialize.bean.UmengErrorCode ShareFailed = null;
    public static final com.umeng.socialize.bean.UmengErrorCode UnKnowCode = null;
    private final int a;

    static {
            com.umeng.socialize.bean.UmengErrorCode r0 = new com.umeng.socialize.bean.UmengErrorCode
            r1 = 2000(0x7d0, float:2.803E-42)
            java.lang.String r2 = "UnKnowCode"
            r3 = 0
            r0.<init>(r2, r3, r1)
            com.umeng.socialize.bean.UmengErrorCode.UnKnowCode = r0
            com.umeng.socialize.bean.UmengErrorCode r1 = new com.umeng.socialize.bean.UmengErrorCode
            r2 = 2002(0x7d2, float:2.805E-42)
            java.lang.String r4 = "AuthorizeFailed"
            r5 = 1
            r1.<init>(r4, r5, r2)
            com.umeng.socialize.bean.UmengErrorCode.AuthorizeFailed = r1
            com.umeng.socialize.bean.UmengErrorCode r2 = new com.umeng.socialize.bean.UmengErrorCode
            r4 = 2003(0x7d3, float:2.807E-42)
            java.lang.String r6 = "ShareFailed"
            r7 = 2
            r2.<init>(r6, r7, r4)
            com.umeng.socialize.bean.UmengErrorCode.ShareFailed = r2
            com.umeng.socialize.bean.UmengErrorCode r4 = new com.umeng.socialize.bean.UmengErrorCode
            java.lang.String r6 = "RequestForUserProfileFailed"
            r8 = 3
            r9 = 2004(0x7d4, float:2.808E-42)
            r4.<init>(r6, r8, r9)
            com.umeng.socialize.bean.UmengErrorCode.RequestForUserProfileFailed = r4
            com.umeng.socialize.bean.UmengErrorCode r6 = new com.umeng.socialize.bean.UmengErrorCode
            java.lang.String r10 = "ShareDataNil"
            r11 = 4
            r6.<init>(r10, r11, r9)
            com.umeng.socialize.bean.UmengErrorCode.ShareDataNil = r6
            com.umeng.socialize.bean.UmengErrorCode r10 = new com.umeng.socialize.bean.UmengErrorCode
            java.lang.String r12 = "ShareDataTypeIllegal"
            r13 = 5
            r10.<init>(r12, r13, r9)
            com.umeng.socialize.bean.UmengErrorCode.ShareDataTypeIllegal = r10
            com.umeng.socialize.bean.UmengErrorCode r9 = new com.umeng.socialize.bean.UmengErrorCode
            r12 = 2008(0x7d8, float:2.814E-42)
            java.lang.String r14 = "NotInstall"
            r15 = 6
            r9.<init>(r14, r15, r12)
            com.umeng.socialize.bean.UmengErrorCode.NotInstall = r9
            r12 = 7
            com.umeng.socialize.bean.UmengErrorCode[] r12 = new com.umeng.socialize.bean.UmengErrorCode[r12]
            r12[r3] = r0
            r12[r5] = r1
            r12[r7] = r2
            r12[r8] = r4
            r12[r11] = r6
            r12[r13] = r10
            r12[r15] = r9
            com.umeng.socialize.bean.UmengErrorCode.$VALUES = r12
            return
    }

    UmengErrorCode(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.a = r3
            return
    }

    private java.lang.String a() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "错误码："
            r0.append(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = " 错误信息："
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static com.umeng.socialize.bean.UmengErrorCode valueOf(java.lang.String r1) {
            java.lang.Class<com.umeng.socialize.bean.UmengErrorCode> r0 = com.umeng.socialize.bean.UmengErrorCode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.umeng.socialize.bean.UmengErrorCode r1 = (com.umeng.socialize.bean.UmengErrorCode) r1
            return r1
    }

    public static com.umeng.socialize.bean.UmengErrorCode[] values() {
            com.umeng.socialize.bean.UmengErrorCode[] r0 = com.umeng.socialize.bean.UmengErrorCode.$VALUES
            java.lang.Object r0 = r0.clone()
            com.umeng.socialize.bean.UmengErrorCode[] r0 = (com.umeng.socialize.bean.UmengErrorCode[]) r0
            return r0
    }

    public java.lang.String getMessage() {
            r2 = this;
            com.umeng.socialize.bean.UmengErrorCode r0 = com.umeng.socialize.bean.UmengErrorCode.UnKnowCode
            if (r2 != r0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.a()
            r0.append(r1)
            java.lang.String r1 = "未知错误----"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L1a:
            com.umeng.socialize.bean.UmengErrorCode r0 = com.umeng.socialize.bean.UmengErrorCode.AuthorizeFailed
            if (r2 != r0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.a()
            r0.append(r1)
            java.lang.String r1 = "授权失败----"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L34:
            com.umeng.socialize.bean.UmengErrorCode r0 = com.umeng.socialize.bean.UmengErrorCode.ShareFailed
            if (r2 != r0) goto L4e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.a()
            r0.append(r1)
            java.lang.String r1 = "分享失败----"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L4e:
            com.umeng.socialize.bean.UmengErrorCode r0 = com.umeng.socialize.bean.UmengErrorCode.RequestForUserProfileFailed
            if (r2 != r0) goto L68
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.a()
            r0.append(r1)
            java.lang.String r1 = "获取用户资料失败----"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L68:
            com.umeng.socialize.bean.UmengErrorCode r0 = com.umeng.socialize.bean.UmengErrorCode.ShareDataNil
            if (r2 != r0) goto L82
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.a()
            r0.append(r1)
            java.lang.String r1 = "分享内容为空"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L82:
            com.umeng.socialize.bean.UmengErrorCode r0 = com.umeng.socialize.bean.UmengErrorCode.ShareDataTypeIllegal
            if (r2 != r0) goto L9c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.a()
            r0.append(r1)
            java.lang.String r1 = "分享内容不合法----"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L9c:
            com.umeng.socialize.bean.UmengErrorCode r0 = com.umeng.socialize.bean.UmengErrorCode.NotInstall
            if (r2 != r0) goto Lb6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.a()
            r0.append(r1)
            java.lang.String r1 = "没有安装应用"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        Lb6:
            java.lang.String r0 = "unkonw"
            return r0
    }
}
