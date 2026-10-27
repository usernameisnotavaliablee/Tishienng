package com.umeng.commonsdk.statistics.idtracking;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j extends com.umeng.commonsdk.statistics.idtracking.a {
    private static final java.lang.String a = "utdid";
    private android.content.Context b;

    public j(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "utdid"
            r1.<init>(r0)
            r1.b = r2
            return
    }

    private java.lang.String g() {
            r4 = this;
            r0 = 0
            android.content.Context r1 = r4.b     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "Alvin2"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "UTDID2"
            java.lang.String r0 = r1.getString(r2, r0)     // Catch: java.lang.Throwable -> L10
        L10:
            return r0
    }

    private java.lang.String h() {
            r4 = this;
            r0 = 0
            android.content.Context r1 = r4.b     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "um_push_ut"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "d_id"
            java.lang.String r0 = r1.getString(r2, r0)     // Catch: java.lang.Throwable -> L10
        L10:
            return r0
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public java.lang.String f() {
            r3 = this;
            r0 = 0
            java.lang.String r1 = "header_tracking_utdid"
            boolean r1 = com.umeng.commonsdk.config.FieldManager.allow(r1)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L19
            java.lang.String r1 = r3.h()     // Catch: java.lang.Throwable -> L19
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L18
            java.lang.String r0 = r3.g()     // Catch: java.lang.Throwable -> L19
            return r0
        L18:
            return r1
        L19:
            return r0
    }
}
