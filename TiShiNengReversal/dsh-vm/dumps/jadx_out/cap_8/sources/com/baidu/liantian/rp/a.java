package com.baidu.liantian.rp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r4) {
            java.lang.String r0 = "rpiiem"
            java.lang.String r1 = ""
            com.baidu.liantian.e r2 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L2a
            android.content.SharedPreferences r3 = r2.f5991b     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = r3.getString(r0, r1)     // Catch: java.lang.Throwable -> L2a
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L29
            java.lang.String r1 = com.baidu.liantian.b.g.e(r4)     // Catch: java.lang.Throwable -> L2a
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2a
            if (r4 != 0) goto L29
            android.content.SharedPreferences$Editor r4 = r2.f5993d     // Catch: java.lang.Throwable -> L2a
            r4.putString(r0, r1)     // Catch: java.lang.Throwable -> L2a
            android.content.SharedPreferences$Editor r4 = r2.f5993d     // Catch: java.lang.Throwable -> L2a
            r4.commit()     // Catch: java.lang.Throwable -> L2a
        L29:
            return r1
        L2a:
            com.baidu.liantian.b.e.a()
            return r1
    }

    public static java.lang.String b(android.content.Context r4) {
            java.lang.String r0 = "rpandid"
            java.lang.String r1 = ""
            com.baidu.liantian.e r2 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L2a
            android.content.SharedPreferences r3 = r2.f5991b     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = r3.getString(r0, r1)     // Catch: java.lang.Throwable -> L2a
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L29
            java.lang.String r1 = com.baidu.liantian.b.g.f(r4)     // Catch: java.lang.Throwable -> L2a
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2a
            if (r4 != 0) goto L29
            android.content.SharedPreferences$Editor r4 = r2.f5993d     // Catch: java.lang.Throwable -> L2a
            r4.putString(r0, r1)     // Catch: java.lang.Throwable -> L2a
            android.content.SharedPreferences$Editor r4 = r2.f5993d     // Catch: java.lang.Throwable -> L2a
            r4.commit()     // Catch: java.lang.Throwable -> L2a
        L29:
            return r1
        L2a:
            com.baidu.liantian.b.e.a()
            return r1
    }

    public static java.lang.String c(android.content.Context r3) {
            java.lang.String r0 = "rpmacadd"
            java.lang.String r1 = ""
            com.baidu.liantian.e r2 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2a
            android.content.SharedPreferences r3 = r2.f5991b     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = r3.getString(r0, r1)     // Catch: java.lang.Throwable -> L2a
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L29
            java.lang.String r1 = com.baidu.liantian.b.g.a()     // Catch: java.lang.Throwable -> L2a
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2a
            if (r3 != 0) goto L29
            android.content.SharedPreferences$Editor r3 = r2.f5993d     // Catch: java.lang.Throwable -> L2a
            r3.putString(r0, r1)     // Catch: java.lang.Throwable -> L2a
            android.content.SharedPreferences$Editor r3 = r2.f5993d     // Catch: java.lang.Throwable -> L2a
            r3.commit()     // Catch: java.lang.Throwable -> L2a
        L29:
            return r1
        L2a:
            com.baidu.liantian.b.e.a()
            return r1
    }
}
