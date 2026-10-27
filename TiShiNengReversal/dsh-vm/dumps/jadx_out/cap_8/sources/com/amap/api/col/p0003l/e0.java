package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class e0 {
    com.amap.api.col.p0003l.s6 a;

    public e0(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            com.amap.api.col.3l.k4 r0 = com.amap.api.col.p0003l.k4.a()     // Catch: java.lang.Throwable -> Ld
            r0.c(r2)     // Catch: java.lang.Throwable -> Ld
        Ld:
            com.amap.api.col.3l.s6 r2 = com.amap.api.col.p0003l.s6.b()
            r1.a = r2
            return
    }

    private java.lang.String d(android.content.Context r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L6a
            r1 = 16
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6a
            com.autonavi.aps.amapapi.trans.b r1 = new com.autonavi.aps.amapapi.trans.b     // Catch: java.lang.Throwable -> L6a
            r1.<init>()     // Catch: java.lang.Throwable -> L6a
            r0.clear()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/x-www-form-urlencoded"
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "Connection"
            java.lang.String r3 = "Keep-Alive"
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "User-Agent"
            java.lang.String r3 = "AMAP_Location_SDK_Android 6.4.3"
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = com.amap.api.col.p0003l.h4.a()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r3 = com.amap.api.col.p0003l.q4.r(r8)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r3 = com.amap.api.col.p0003l.h4.c(r6, r2, r3)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "ts"
            r8.put(r4, r2)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "scode"
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L6a
            r1.b(r8)     // Catch: java.lang.Throwable -> L6a
            r1.a(r0)     // Catch: java.lang.Throwable -> L6a
            r1.a(r7)     // Catch: java.lang.Throwable -> L6a
            java.net.Proxy r6 = com.amap.api.col.p0003l.o4.c(r6)     // Catch: java.lang.Throwable -> L6a
            r1.setProxy(r6)     // Catch: java.lang.Throwable -> L6a
            int r6 = com.autonavi.aps.amapapi.utils.b.f5854i     // Catch: java.lang.Throwable -> L6a
            r1.setConnectionTimeout(r6)     // Catch: java.lang.Throwable -> L6a
            int r6 = com.autonavi.aps.amapapi.utils.b.f5854i     // Catch: java.lang.Throwable -> L6a
            r1.setSoTimeout(r6)     // Catch: java.lang.Throwable -> L6a
            com.amap.api.col.3l.a7 r6 = com.amap.api.col.p0003l.s6.d(r1)     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L62
            byte[] r6 = r6.a     // Catch: java.lang.Throwable -> L62
            java.lang.String r8 = "utf-8"
            r7.<init>(r6, r8)     // Catch: java.lang.Throwable -> L62
            return r7
        L62:
            r6 = move-exception
            java.lang.String r7 = "GeoFenceNetManager"
            java.lang.String r8 = "post"
            com.autonavi.aps.amapapi.utils.b.a(r6, r7, r8)     // Catch: java.lang.Throwable -> L6a
        L6a:
            r6 = 0
            return r6
    }

    private static java.util.Map<java.lang.String, java.lang.String> e(android.content.Context r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 16
            r0.<init>(r1)
            java.lang.String r1 = "key"
            java.lang.String r2 = com.amap.api.col.p0003l.f4.j(r2)
            r0.put(r1, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L1b
            java.lang.String r2 = "keywords"
            r0.put(r2, r3)
        L1b:
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L26
            java.lang.String r2 = "types"
            r0.put(r2, r4)
        L26:
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 != 0) goto L4b
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 != 0) goto L4b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            java.lang.String r3 = ","
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "location"
            r0.put(r3, r2)
        L4b:
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L56
            java.lang.String r2 = "city"
            r0.put(r2, r5)
        L56:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L61
            java.lang.String r2 = "offset"
            r0.put(r2, r6)
        L61:
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 != 0) goto L6c
            java.lang.String r2 = "radius"
            r0.put(r2, r9)
        L6c:
            return r0
    }

    public final java.lang.String a(android.content.Context r9, java.lang.String r10, java.lang.String r11) {
            r8 = this;
            r6 = 0
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r9
            r1 = r11
            java.util.Map r9 = e(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r11 = "extensions"
            java.lang.String r1 = "all"
            r9.put(r11, r1)
            java.lang.String r11 = "subdistrict"
            java.lang.String r1 = "0"
            r9.put(r11, r1)
            java.lang.String r9 = r8.d(r0, r10, r9)
            return r9
    }

    public final java.lang.String b(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
            r8 = this;
            r6 = 0
            r7 = 0
            r5 = 0
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            java.util.Map r9 = e(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r11 = "children"
            java.lang.String r12 = "1"
            r9.put(r11, r12)
            java.lang.String r11 = "page"
            r9.put(r11, r12)
            java.lang.String r11 = "extensions"
            java.lang.String r12 = "base"
            r9.put(r11, r12)
            java.lang.String r9 = r8.d(r0, r10, r9)
            return r9
    }

    public final java.lang.String c(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
            r8 = this;
            r3 = 0
            r0 = r9
            r1 = r11
            r2 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            java.util.Map r11 = e(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r12 = "children"
            java.lang.String r13 = "1"
            r11.put(r12, r13)
            java.lang.String r12 = "page"
            r11.put(r12, r13)
            java.lang.String r12 = "extensions"
            java.lang.String r13 = "base"
            r11.put(r12, r13)
            java.lang.String r9 = r8.d(r9, r10, r11)
            return r9
    }
}
