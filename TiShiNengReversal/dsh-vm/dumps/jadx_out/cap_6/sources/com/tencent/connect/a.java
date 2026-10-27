package com.tencent.connect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a(java.lang.String r2, com.tencent.tauth.IUiListener r3) {
            r0 = -6
            java.lang.String r1 = "用户未授权，暂时无法使用QQ登录及分享等功能"
            boolean r2 = a(r2, r3, r0, r1, r1)
            return r2
    }

    public static boolean a(java.lang.String r1, com.tencent.tauth.IUiListener r2, int r3, java.lang.String r4, java.lang.String r5) {
            boolean r0 = com.tencent.tauth.Tencent.isPermissionNotGranted()
            if (r0 == 0) goto L17
            java.lang.String r0 = "permission not granted"
            com.tencent.open.log.SLog.i(r1, r0)
            if (r2 == 0) goto L15
            com.tencent.tauth.UiError r1 = new com.tencent.tauth.UiError
            r1.<init>(r3, r4, r5)
            r2.onError(r1)
        L15:
            r1 = 1
            return r1
        L17:
            r1 = 0
            return r1
    }
}
