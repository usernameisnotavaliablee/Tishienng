package com.baidu.liantian.rp.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a {
    public android.content.Context a;

    public a(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean a(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            com.baidu.liantian.b.a()
            android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r4.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = com.baidu.liantian.b.e.b()     // Catch: java.lang.Throwable -> L43
            r4.append(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = "p/1/r"
            r4.append(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L43
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L43
            android.content.Context r0 = r2.a     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = com.baidu.liantian.b.h.a(r0, r4, r3)     // Catch: java.lang.Throwable -> L43
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L43
            r0 = 0
            if (r4 == 0) goto L34
            return r0
        L34:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L43
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "response"
            int r3 = r4.getInt(r3)     // Catch: java.lang.Throwable -> L43
            if (r3 != r1) goto L42
            return r1
        L42:
            return r0
        L43:
            com.baidu.liantian.b.e.a()
            return r1
    }
}
