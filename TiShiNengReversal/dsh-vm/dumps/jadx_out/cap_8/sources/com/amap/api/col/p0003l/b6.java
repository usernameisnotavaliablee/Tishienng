package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class b6 {
    private static java.util.HashMap<java.lang.String, java.lang.String> a;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.amap.api.col.p0003l.b6.a = r0
            return
    }

    public b6() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r2, com.amap.api.col.p0003l.p4 r3, java.lang.String r4) {
            if (r3 == 0) goto L64
            java.lang.String r0 = r3.a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L64
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.a()
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.util.HashMap<java.lang.String, java.lang.String> r1 = com.amap.api.col.p0003l.b6.a
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L2e
            return r0
        L2e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r3 = r3.a()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = ""
            if (r2 == 0) goto L63
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L63
            r0 = 0
            java.lang.String r1 = "d7afbc6a38848a6801f6e449f3ec8e53"
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r1, r0)
            java.lang.String r2 = r2.getString(r3, r4)
            byte[] r2 = com.amap.api.col.p0003l.q4.y(r2)
            byte[] r2 = com.amap.api.col.p0003l.e4.e(r2)
            java.lang.String r2 = com.amap.api.col.p0003l.q4.g(r2)
            return r2
        L63:
            return r4
        L64:
            r2 = 0
            return r2
    }

    public static void b(android.content.Context r3, com.amap.api.col.p0003l.p4 r4, java.lang.String r5, java.lang.String r6) {
            if (r4 == 0) goto L68
            java.lang.String r0 = r4.a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L68
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = r4.a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.HashMap<java.lang.String, java.lang.String> r1 = com.amap.api.col.p0003l.b6.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r4.a()
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = r2.toString()
            r1.put(r4, r6)
            if (r3 == 0) goto L68
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L68
            java.lang.String r4 = "d7afbc6a38848a6801f6e449f3ec8e53"
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L68
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L68
            byte[] r5 = com.amap.api.col.p0003l.q4.o(r6)
            byte[] r5 = com.amap.api.col.p0003l.e4.c(r5)
            java.lang.String r5 = com.amap.api.col.p0003l.q4.E(r5)
            r6 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r6)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            r3.putString(r0, r5)
            r3.commit()
        L68:
            return
    }
}
