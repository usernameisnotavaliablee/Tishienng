package com.umeng.commonsdk.statistics.idtracking;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class h extends com.umeng.commonsdk.statistics.idtracking.a {
    public static final java.lang.String a = null;
    public static final java.lang.String b = "key_umeng_sp_oaid";
    public static final java.lang.String c = "key_umeng_sp_oaid_required_time";
    private static final java.lang.String d = "oaid";
    private android.content.Context e;

    static {
            com.umeng.analytics.pro.au r0 = com.umeng.analytics.pro.au.b()
            java.lang.String r1 = "uso"
            java.lang.String r0 = r0.b(r1)
            com.umeng.commonsdk.statistics.idtracking.h.a = r0
            return
    }

    public h(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "oaid"
            r1.<init>(r0)
            r1.e = r2
            return
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public java.lang.String f() {
            r3 = this;
            java.lang.String r0 = "header_device_oaid"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 == 0) goto L1c
            android.content.Context r0 = r3.e     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = com.umeng.commonsdk.statistics.idtracking.h.a     // Catch: java.lang.Throwable -> L1c
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1c
            java.lang.String r1 = "key_umeng_sp_oaid"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Throwable -> L1c
            return r0
        L1c:
            r0 = 0
            return r0
    }
}
