package com.tencent.mm.opensdk.diffdev;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum OAuthErrCode extends java.lang.Enum<com.tencent.mm.opensdk.diffdev.OAuthErrCode> {
    private static final /* synthetic */ com.tencent.mm.opensdk.diffdev.OAuthErrCode[] $VALUES = null;
    public static final com.tencent.mm.opensdk.diffdev.OAuthErrCode WechatAuth_Err_Auth_Stopped = null;
    public static final com.tencent.mm.opensdk.diffdev.OAuthErrCode WechatAuth_Err_Cancel = null;
    public static final com.tencent.mm.opensdk.diffdev.OAuthErrCode WechatAuth_Err_JsonDecodeErr = null;
    public static final com.tencent.mm.opensdk.diffdev.OAuthErrCode WechatAuth_Err_NetworkErr = null;
    public static final com.tencent.mm.opensdk.diffdev.OAuthErrCode WechatAuth_Err_NormalErr = null;
    public static final com.tencent.mm.opensdk.diffdev.OAuthErrCode WechatAuth_Err_OK = null;
    public static final com.tencent.mm.opensdk.diffdev.OAuthErrCode WechatAuth_Err_Timeout = null;
    private int code;

    static {
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r0 = new com.tencent.mm.opensdk.diffdev.OAuthErrCode
            java.lang.String r1 = "WechatAuth_Err_OK"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_OK = r0
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r1 = new com.tencent.mm.opensdk.diffdev.OAuthErrCode
            r3 = -1
            java.lang.String r4 = "WechatAuth_Err_NormalErr"
            r5 = 1
            r1.<init>(r4, r5, r3)
            com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NormalErr = r1
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r3 = new com.tencent.mm.opensdk.diffdev.OAuthErrCode
            r4 = -2
            java.lang.String r6 = "WechatAuth_Err_NetworkErr"
            r7 = 2
            r3.<init>(r6, r7, r4)
            com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NetworkErr = r3
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r4 = new com.tencent.mm.opensdk.diffdev.OAuthErrCode
            r6 = -3
            java.lang.String r8 = "WechatAuth_Err_JsonDecodeErr"
            r9 = 3
            r4.<init>(r8, r9, r6)
            com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_JsonDecodeErr = r4
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r6 = new com.tencent.mm.opensdk.diffdev.OAuthErrCode
            r8 = -4
            java.lang.String r10 = "WechatAuth_Err_Cancel"
            r11 = 4
            r6.<init>(r10, r11, r8)
            com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_Cancel = r6
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r8 = new com.tencent.mm.opensdk.diffdev.OAuthErrCode
            r10 = -5
            java.lang.String r12 = "WechatAuth_Err_Timeout"
            r13 = 5
            r8.<init>(r12, r13, r10)
            com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_Timeout = r8
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r10 = new com.tencent.mm.opensdk.diffdev.OAuthErrCode
            r12 = -6
            java.lang.String r14 = "WechatAuth_Err_Auth_Stopped"
            r15 = 6
            r10.<init>(r14, r15, r12)
            com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_Auth_Stopped = r10
            r12 = 7
            com.tencent.mm.opensdk.diffdev.OAuthErrCode[] r12 = new com.tencent.mm.opensdk.diffdev.OAuthErrCode[r12]
            r12[r2] = r0
            r12[r5] = r1
            r12[r7] = r3
            r12[r9] = r4
            r12[r11] = r6
            r12[r13] = r8
            r12[r15] = r10
            com.tencent.mm.opensdk.diffdev.OAuthErrCode.$VALUES = r12
            return
    }

    OAuthErrCode(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.code = r3
            return
    }

    public static com.tencent.mm.opensdk.diffdev.OAuthErrCode valueOf(java.lang.String r1) {
            java.lang.Class<com.tencent.mm.opensdk.diffdev.OAuthErrCode> r0 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r1 = (com.tencent.mm.opensdk.diffdev.OAuthErrCode) r1
            return r1
    }

    public static com.tencent.mm.opensdk.diffdev.OAuthErrCode[] values() {
            com.tencent.mm.opensdk.diffdev.OAuthErrCode[] r0 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.$VALUES
            java.lang.Object r0 = r0.clone()
            com.tencent.mm.opensdk.diffdev.OAuthErrCode[] r0 = (com.tencent.mm.opensdk.diffdev.OAuthErrCode[]) r0
            return r0
    }

    public int getCode() {
            r1 = this;
            int r0 = r1.code
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "OAuthErrCode:"
            r0.append(r1)
            int r1 = r2.code
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
