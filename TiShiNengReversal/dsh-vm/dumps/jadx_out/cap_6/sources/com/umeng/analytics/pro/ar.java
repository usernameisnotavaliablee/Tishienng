package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ar {
    public static final java.lang.String a = "cl_count";
    public static final java.lang.String b = "interval_";
    public static final java.lang.String c = "config_ts";
    public static final java.lang.String d = "iucc_s1";
    public static final java.lang.String e = "iucc_s2";
    public static final java.lang.String f = "sdk_type_ver";
    public static final java.lang.String g = "should_fetch";
    private static final java.lang.String h = "ccg_sp_config_file";

    private ar() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.SharedPreferences a(android.content.Context r2) {
            if (r2 == 0) goto La
            java.lang.String r0 = "ccg_sp_config_file"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> La
            return r2
        La:
            r2 = 0
            return r2
    }
}
