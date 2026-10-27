package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class an implements java.lang.Runnable {
    public static final java.lang.String a = "https://aspect-upush.umeng.com/occa/v1/event/report";
    private java.lang.String b;
    private java.lang.String c;

    public an(java.lang.String r1, org.json.JSONObject r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            java.lang.String r1 = r2.toString()
            r0.c = r1
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            java.lang.String r0 = r2.c     // Catch: java.lang.Throwable -> L13
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L13
            java.lang.String r0 = r2.c     // Catch: java.lang.Throwable -> L13
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = r2.b     // Catch: java.lang.Throwable -> L13
            com.umeng.analytics.pro.am.b(r1, r0)     // Catch: java.lang.Throwable -> L13
        L13:
            return
    }
}
