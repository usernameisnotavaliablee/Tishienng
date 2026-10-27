package com.yxcorp.kuaishou.addfp.android.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e {
    private android.content.SharedPreferences a;
    private android.content.SharedPreferences.Editor b;

    public e(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "kscfg_outdfp"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L12
            r2.a = r3     // Catch: java.lang.Throwable -> L12
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L12
            r2.b = r3     // Catch: java.lang.Throwable -> L12
        L12:
            return
    }

    public void a(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.b
            java.lang.String r1 = "kwtk"
            r0.putString(r1, r3)
            android.content.SharedPreferences$Editor r3 = r2.b
            r3.commit()
            return
    }

    public boolean a() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.a
            java.lang.String r1 = "xytk"
            r2 = 1
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    public java.lang.String b() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.a
            java.lang.String r1 = "kwtk"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }
}
