package com.autonavi.aps.amapapi.trans;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    private static com.autonavi.aps.amapapi.trans.c f5813b;
    com.amap.api.col.p0003l.s6 a;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f5814c;

    /* renamed from: d, reason: collision with root package name */
    private int f5815d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5816e;

    /* renamed from: f, reason: collision with root package name */
    private int f5817f;

    static {
            return
    }

    private c(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.f5814c = r0
            int r0 = com.autonavi.aps.amapapi.utils.b.f5854i
            r1.f5815d = r0
            r0 = 0
            r1.f5816e = r0
            r1.f5817f = r0
            com.amap.api.col.3l.k4 r0 = com.amap.api.col.p0003l.k4.a()     // Catch: java.lang.Throwable -> L18
            r0.c(r2)     // Catch: java.lang.Throwable -> L18
        L18:
            r1.f5814c = r2
            com.amap.api.col.3l.s6 r2 = com.amap.api.col.p0003l.s6.b()
            r1.a = r2
            return
    }

    public static com.autonavi.aps.amapapi.trans.c a(android.content.Context r1) {
            com.autonavi.aps.amapapi.trans.c r0 = com.autonavi.aps.amapapi.trans.c.f5813b
            if (r0 != 0) goto Lb
            com.autonavi.aps.amapapi.trans.c r0 = new com.autonavi.aps.amapapi.trans.c
            r0.<init>(r1)
            com.autonavi.aps.amapapi.trans.c.f5813b = r0
        Lb:
            com.autonavi.aps.amapapi.trans.c r1 = com.autonavi.aps.amapapi.trans.c.f5813b
            return r1
    }

    public final com.amap.api.col.p0003l.a7 a(com.autonavi.aps.amapapi.trans.d r2) throws java.lang.Throwable {
            r1 = this;
            boolean r0 = r1.f5816e
            if (r0 == 0) goto L9
            com.amap.api.col.3l.if$c r0 = com.amap.api.col.p0003l.Cif.c.f3539b
            r2.setHttpProtocol(r0)
        L9:
            com.amap.api.col.3l.a7 r2 = com.amap.api.col.p0003l.s6.d(r2)
            return r2
    }

    public final com.autonavi.aps.amapapi.trans.d a(android.content.Context r11, byte[] r12, java.lang.String r13, java.lang.String r14, boolean r15) {
            r10 = this;
            java.lang.String r0 = "1"
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L10d
            r2 = 16
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L10d
            com.autonavi.aps.amapapi.trans.d r3 = new com.autonavi.aps.amapapi.trans.d     // Catch: java.lang.Throwable -> L10d
            com.amap.api.col.3l.p4 r4 = com.autonavi.aps.amapapi.utils.b.c()     // Catch: java.lang.Throwable -> L10d
            r3.<init>(r11, r4)     // Catch: java.lang.Throwable -> L10d
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/octet-stream"
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r4 = "Accept-Encoding"
            java.lang.String r5 = "gzip"
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r4 = "gzipped"
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r4 = "Connection"
            java.lang.String r5 = "Keep-Alive"
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r4 = "User-Agent"
            java.lang.String r5 = "AMAP_Location_SDK_Android 6.4.3"
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r4 = "KEY"
            java.lang.String r5 = com.amap.api.col.p0003l.f4.j(r11)     // Catch: java.lang.Throwable -> L10e
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r4 = "enginever"
            java.lang.String r5 = com.autonavi.aps.amapapi.utils.b.a     // Catch: java.lang.Throwable -> L10e
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r4 = com.amap.api.col.p0003l.h4.a()     // Catch: java.lang.Throwable -> L10e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10e
            java.lang.String r6 = "key="
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r6 = com.amap.api.col.p0003l.f4.j(r11)     // Catch: java.lang.Throwable -> L10e
            r5.append(r6)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L10e
            java.lang.String r5 = com.amap.api.col.p0003l.h4.c(r11, r4, r5)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r6 = "ts"
            r1.put(r6, r4)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r4 = "scode"
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r4 = com.autonavi.aps.amapapi.utils.b.a     // Catch: java.lang.Throwable -> L10e
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch: java.lang.Throwable -> L10e
            double r4 = r4.doubleValue()     // Catch: java.lang.Throwable -> L10e
            r6 = 4617653287933653811(0x4015333333333333, double:5.3)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L81
            java.lang.String r4 = "aps_s_src"
            java.lang.String r5 = "openapi"
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L10e
        L81:
            java.lang.String r4 = "encr"
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> L10e
            r3.b(r1)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r0 = "loc"
            if (r15 != 0) goto L8f
            java.lang.String r0 = "locf"
        L8f:
            r1 = 1
            r3.b(r1)     // Catch: java.lang.Throwable -> L10e
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L10e
            java.lang.String r5 = "platform=Android&sdkversion=%s&product=%s&loc_channel=%s"
            r6 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L10e
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L10e
            java.lang.String r8 = "6.4.3"
            r9 = 0
            r6[r9] = r8     // Catch: java.lang.Throwable -> L10e
            r6[r1] = r0     // Catch: java.lang.Throwable -> L10e
            r0 = 2
            r6[r0] = r7     // Catch: java.lang.Throwable -> L10e
            java.lang.String r4 = java.lang.String.format(r4, r5, r6)     // Catch: java.lang.Throwable -> L10e
            r3.a(r4)     // Catch: java.lang.Throwable -> L10e
            r3.a(r15)     // Catch: java.lang.Throwable -> L10e
            r3.b(r13)     // Catch: java.lang.Throwable -> L10e
            r3.c(r14)     // Catch: java.lang.Throwable -> L10e
            byte[] r12 = com.autonavi.aps.amapapi.utils.j.a(r12)     // Catch: java.lang.Throwable -> L10e
            r3.c(r12)     // Catch: java.lang.Throwable -> L10e
            java.net.Proxy r11 = com.amap.api.col.p0003l.o4.c(r11)     // Catch: java.lang.Throwable -> L10e
            r3.setProxy(r11)     // Catch: java.lang.Throwable -> L10e
            java.util.HashMap r11 = new java.util.HashMap     // Catch: java.lang.Throwable -> L10e
            r11.<init>(r2)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r12 = "output"
            java.lang.String r13 = "bin"
            r11.put(r12, r13)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r12 = "policy"
            java.lang.String r13 = "3103"
            r11.put(r12, r13)     // Catch: java.lang.Throwable -> L10e
            int r12 = r10.f5817f     // Catch: java.lang.Throwable -> L10e
            java.lang.String r13 = "custom"
            if (r12 == 0) goto Lf3
            if (r12 == r1) goto Led
            if (r12 == r0) goto Le7
            r11.remove(r13)     // Catch: java.lang.Throwable -> L10e
            goto Lf6
        Le7:
            java.lang.String r12 = "language:en"
            r11.put(r13, r12)     // Catch: java.lang.Throwable -> L10e
            goto Lf6
        Led:
            java.lang.String r12 = "language:cn"
            r11.put(r13, r12)     // Catch: java.lang.Throwable -> L10e
            goto Lf6
        Lf3:
            r11.remove(r13)     // Catch: java.lang.Throwable -> L10e
        Lf6:
            r3.a(r11)     // Catch: java.lang.Throwable -> L10e
            int r11 = r10.f5815d     // Catch: java.lang.Throwable -> L10e
            r3.setConnectionTimeout(r11)     // Catch: java.lang.Throwable -> L10e
            int r11 = r10.f5815d     // Catch: java.lang.Throwable -> L10e
            r3.setSoTimeout(r11)     // Catch: java.lang.Throwable -> L10e
            boolean r11 = r10.f5816e     // Catch: java.lang.Throwable -> L10e
            if (r11 == 0) goto L10c
            com.amap.api.col.3l.if$c r11 = com.amap.api.col.p0003l.Cif.c.f3539b     // Catch: java.lang.Throwable -> L10e
            r3.setHttpProtocol(r11)     // Catch: java.lang.Throwable -> L10e
        L10c:
            return r3
        L10d:
            r3 = 0
        L10e:
            return r3
    }

    public final java.lang.String a(android.content.Context r9, double r10, double r12) {
            r8 = this;
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L108
            r1 = 16
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L108
            com.autonavi.aps.amapapi.trans.d r2 = new com.autonavi.aps.amapapi.trans.d     // Catch: java.lang.Throwable -> L108
            com.amap.api.col.3l.p4 r3 = com.autonavi.aps.amapapi.utils.b.c()     // Catch: java.lang.Throwable -> L108
            r2.<init>(r9, r3)     // Catch: java.lang.Throwable -> L108
            r0.clear()     // Catch: java.lang.Throwable -> L108
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/x-www-form-urlencoded"
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L108
            java.lang.String r3 = "Connection"
            java.lang.String r4 = "Keep-Alive"
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L108
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = "AMAP_Location_SDK_Android 6.4.3"
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L108
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L108
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L108
            java.lang.String r1 = "custom"
            java.lang.String r4 = "26260A1F00020002"
            r3.put(r1, r4)     // Catch: java.lang.Throwable -> L108
            java.lang.String r1 = "key"
            java.lang.String r4 = com.amap.api.col.p0003l.f4.j(r9)     // Catch: java.lang.Throwable -> L108
            r3.put(r1, r4)     // Catch: java.lang.Throwable -> L108
            int r1 = r8.f5817f     // Catch: java.lang.Throwable -> L108
            r4 = 2
            r5 = 1
            java.lang.String r6 = "language"
            if (r1 == 0) goto L59
            if (r1 == r5) goto L53
            if (r1 == r4) goto L4d
            r3.remove(r6)     // Catch: java.lang.Throwable -> L108
            goto L5c
        L4d:
            java.lang.String r1 = "en"
            r3.put(r6, r1)     // Catch: java.lang.Throwable -> L108
            goto L5c
        L53:
            java.lang.String r1 = "zh-CN"
            r3.put(r6, r1)     // Catch: java.lang.Throwable -> L108
            goto L5c
        L59:
            r3.remove(r6)     // Catch: java.lang.Throwable -> L108
        L5c:
            java.lang.String r1 = "curLocationType"
            android.content.Context r6 = r8.f5814c     // Catch: java.lang.Throwable -> L108
            boolean r6 = com.autonavi.aps.amapapi.utils.j.m(r6)     // Catch: java.lang.Throwable -> L108
            if (r6 == 0) goto L69
            java.lang.String r6 = "coarseLoc"
            goto L6b
        L69:
            java.lang.String r6 = "fineLoc"
        L6b:
            r3.put(r1, r6)     // Catch: java.lang.Throwable -> L108
            java.lang.String r1 = com.amap.api.col.p0003l.h4.a()     // Catch: java.lang.Throwable -> L108
            java.lang.String r6 = com.amap.api.col.p0003l.q4.r(r3)     // Catch: java.lang.Throwable -> L108
            java.lang.String r6 = com.amap.api.col.p0003l.h4.c(r9, r1, r6)     // Catch: java.lang.Throwable -> L108
            java.lang.String r7 = "ts"
            r3.put(r7, r1)     // Catch: java.lang.Throwable -> L108
            java.lang.String r1 = "scode"
            r3.put(r1, r6)     // Catch: java.lang.Throwable -> L108
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L108
            java.lang.String r6 = "output=json&radius=1000&extensions=all&location="
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L108
            r1.append(r12)     // Catch: java.lang.Throwable -> L108
            java.lang.String r12 = ","
            r1.append(r12)     // Catch: java.lang.Throwable -> L108
            r1.append(r10)     // Catch: java.lang.Throwable -> L108
            java.lang.String r10 = r1.toString()     // Catch: java.lang.Throwable -> L108
            java.lang.String r11 = "UTF-8"
            byte[] r10 = r10.getBytes(r11)     // Catch: java.lang.Throwable -> L108
            r2.b(r10)     // Catch: java.lang.Throwable -> L108
            r10 = 0
            r2.b(r10)     // Catch: java.lang.Throwable -> L108
            r2.a(r5)     // Catch: java.lang.Throwable -> L108
            java.util.Locale r11 = java.util.Locale.US     // Catch: java.lang.Throwable -> L108
            java.lang.String r12 = "platform=Android&sdkversion=%s&product=%s&loc_channel=%s"
            r13 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L108
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L108
            java.lang.String r6 = "6.4.3"
            r13[r10] = r6     // Catch: java.lang.Throwable -> L108
            java.lang.String r10 = "loc"
            r13[r5] = r10     // Catch: java.lang.Throwable -> L108
            r13[r4] = r1     // Catch: java.lang.Throwable -> L108
            java.lang.String r10 = java.lang.String.format(r11, r12, r13)     // Catch: java.lang.Throwable -> L108
            r2.a(r10)     // Catch: java.lang.Throwable -> L108
            r2.a(r3)     // Catch: java.lang.Throwable -> L108
            r2.b(r0)     // Catch: java.lang.Throwable -> L108
            java.net.Proxy r9 = com.amap.api.col.p0003l.o4.c(r9)     // Catch: java.lang.Throwable -> L108
            r2.setProxy(r9)     // Catch: java.lang.Throwable -> L108
            int r9 = com.autonavi.aps.amapapi.utils.b.f5854i     // Catch: java.lang.Throwable -> L108
            r2.setConnectionTimeout(r9)     // Catch: java.lang.Throwable -> L108
            int r9 = com.autonavi.aps.amapapi.utils.b.f5854i     // Catch: java.lang.Throwable -> L108
            r2.setSoTimeout(r9)     // Catch: java.lang.Throwable -> L108
            java.lang.String r9 = "http://restsdk.amap.com/v3/geocode/regeo"
            java.lang.String r10 = "http://dualstack-arestapi.amap.com/v3/geocode/regeo"
            r2.c(r10)     // Catch: java.lang.Throwable -> Lf1
            r2.b(r9)     // Catch: java.lang.Throwable -> Lf1
            boolean r9 = r8.f5816e     // Catch: java.lang.Throwable -> Lf1
            if (r9 == 0) goto Lf3
            com.amap.api.col.3l.if$c r9 = com.amap.api.col.p0003l.Cif.c.f3539b     // Catch: java.lang.Throwable -> Lf1
            r2.setHttpProtocol(r9)     // Catch: java.lang.Throwable -> Lf1
            goto Lf3
        Lf1:
            r9 = move-exception
            goto L101
        Lf3:
            com.amap.api.col.3l.a7 r9 = com.amap.api.col.p0003l.s6.d(r2)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r10 = new java.lang.String     // Catch: java.lang.Throwable -> Lf1
            byte[] r9 = r9.a     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r11 = "utf-8"
            r10.<init>(r9, r11)     // Catch: java.lang.Throwable -> Lf1
            return r10
        L101:
            java.lang.String r10 = "LocNetManager"
            java.lang.String r11 = "post"
            com.autonavi.aps.amapapi.utils.b.a(r9, r10, r11)     // Catch: java.lang.Throwable -> L108
        L108:
            r9 = 0
            return r9
    }

    public final void a(long r1, boolean r3, int r4) {
            r0 = this;
            r0.f5816e = r3     // Catch: java.lang.Throwable -> Lf
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> Lf
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> Lf
            r0.f5815d = r1     // Catch: java.lang.Throwable -> Lf
            r0.f5817f = r4     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r1 = move-exception
            java.lang.String r2 = "LocNetManager"
            java.lang.String r3 = "setOption"
            com.autonavi.aps.amapapi.utils.b.a(r1, r2, r3)
            return
    }
}
