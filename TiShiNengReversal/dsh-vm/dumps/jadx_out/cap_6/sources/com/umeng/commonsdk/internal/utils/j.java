package com.umeng.commonsdk.internal.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j {
    private static final java.lang.String a = null;
    private static final java.lang.String b = "um_common_strength";
    private static final java.lang.String c = "um_common_battery";

    static {
            com.umeng.analytics.pro.au r0 = com.umeng.analytics.pro.au.b()
            java.lang.String r1 = "pri"
            java.lang.String r0 = r0.b(r1)
            com.umeng.commonsdk.internal.utils.j.a = r0
            return
    }

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r3) {
            r0 = 0
            if (r3 == 0) goto L1b
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            java.lang.String r1 = com.umeng.commonsdk.internal.utils.j.a
            r2 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r1, r2)
            if (r3 == 0) goto L1b
            java.lang.String r1 = "um_common_battery"
            java.lang.String r3 = r3.getString(r1, r0)
            return r3
        L1b:
            return r0
    }

    public static void a(android.content.Context r2, java.lang.String r3) {
            if (r2 == 0) goto L27
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L9
            goto L27
        L9:
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            java.lang.String r0 = com.umeng.commonsdk.internal.utils.j.a
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            if (r2 == 0) goto L27
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r0 = "um_common_battery"
            android.content.SharedPreferences$Editor r2 = r2.putString(r0, r3)
            r2.commit()
        L27:
            return
    }
}
