package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ao implements java.lang.Runnable {
    public static final java.lang.String a = "https://ucc.umeng.com/v2/inn/fetch";
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;

    public ao(java.lang.String r1, org.json.JSONObject r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            java.lang.String r1 = r2.toString()
            r0.c = r1
            r0.d = r3
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r5 = this;
            r0 = 102(0x66, float:1.43E-43)
            r1 = 0
            java.lang.String r2 = r5.b     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = r5.c     // Catch: java.lang.Throwable -> L29
            byte[] r2 = com.umeng.analytics.pro.am.a(r2, r3)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L29
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L29
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L29
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L29
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "sourceIucc"
            java.lang.String r4 = r5.d     // Catch: java.lang.Throwable -> L28
            r2.put(r1, r4)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "config"
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L28
        L28:
            r1 = r2
        L29:
            android.content.Context r2 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()
            com.umeng.ccg.d r3 = com.umeng.ccg.d.a()
            com.umeng.ccg.c.a(r2, r0, r3, r1)
            return
    }
}
