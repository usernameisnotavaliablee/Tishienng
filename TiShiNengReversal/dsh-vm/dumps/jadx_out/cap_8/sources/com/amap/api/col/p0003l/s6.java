package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class s6 {
    public static int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f3973b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.util.HashMap<java.lang.String, java.lang.String> f3974c;

    /* renamed from: d, reason: collision with root package name */
    public static java.util.HashMap<java.lang.String, java.lang.String> f3975d;

    /* renamed from: e, reason: collision with root package name */
    public static java.util.HashMap<java.lang.String, java.lang.String> f3976e;

    /* renamed from: f, reason: collision with root package name */
    private static com.amap.api.col.p0003l.s6 f3977f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        java.net.URLConnection a();
    }

    static {
            return
    }

    public s6() {
            r0 = this;
            r0.<init>()
            com.amap.api.col.p0003l.g4.O()
            return
    }

    protected static int a(com.amap.api.col.p0003l.Cif r3, long r4) {
            k(r3)     // Catch: java.lang.Throwable -> L3f
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto Lf
        La:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L3f
            long r0 = r0 - r4
        Lf:
            int r4 = r3.getConntectionTimeout()     // Catch: java.lang.Throwable -> L3f
            com.amap.api.col.3l.if$a r5 = r3.getDegradeAbility()     // Catch: java.lang.Throwable -> L3f
            com.amap.api.col.3l.if$a r2 = com.amap.api.col.p0003l.Cif.a.f3527d     // Catch: java.lang.Throwable -> L3f
            if (r5 == r2) goto L3e
            com.amap.api.col.3l.if$a r5 = r3.getDegradeAbility()     // Catch: java.lang.Throwable -> L3f
            com.amap.api.col.3l.if$a r2 = com.amap.api.col.p0003l.Cif.a.f3528e     // Catch: java.lang.Throwable -> L3f
            if (r5 != r2) goto L24
            goto L3e
        L24:
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L3f
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L33
            long r4 = r4 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L31
            goto L33
        L31:
            int r3 = (int) r4     // Catch: java.lang.Throwable -> L3f
            return r3
        L33:
            int r3 = r3.getConntectionTimeout()     // Catch: java.lang.Throwable -> L3f
            r4 = 1000(0x3e8, float:1.401E-42)
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L3f
            return r3
        L3e:
            return r4
        L3f:
            r3 = 5000(0x1388, float:7.006E-42)
            return r3
    }

    public static com.amap.api.col.p0003l.s6 b() {
            com.amap.api.col.3l.s6 r0 = com.amap.api.col.p0003l.s6.f3977f
            if (r0 != 0) goto Lb
            com.amap.api.col.3l.s6 r0 = new com.amap.api.col.3l.s6
            r0.<init>()
            com.amap.api.col.p0003l.s6.f3977f = r0
        Lb:
            com.amap.api.col.3l.s6 r0 = com.amap.api.col.p0003l.s6.f3977f
            return r0
    }

    protected static com.amap.api.col.p0003l.Cif.b c(com.amap.api.col.p0003l.Cif r2, boolean r3) {
            com.amap.api.col.3l.if$a r0 = r2.getDegradeAbility()
            com.amap.api.col.3l.if$a r1 = com.amap.api.col.p0003l.Cif.a.f3527d
            if (r0 != r1) goto Lb
            com.amap.api.col.3l.if$b r2 = com.amap.api.col.p0003l.Cif.b.f3534e
            return r2
        Lb:
            com.amap.api.col.3l.if$a r2 = r2.getDegradeAbility()
            com.amap.api.col.3l.if$a r0 = com.amap.api.col.p0003l.Cif.a.f3528e
            if (r2 != r0) goto L16
            com.amap.api.col.3l.if$b r2 = com.amap.api.col.p0003l.Cif.b.f3531b
            return r2
        L16:
            if (r3 == 0) goto L1b
            com.amap.api.col.3l.if$b r2 = com.amap.api.col.p0003l.Cif.b.a
            return r2
        L1b:
            com.amap.api.col.3l.if$b r2 = com.amap.api.col.p0003l.Cif.b.f3531b
            return r2
    }

    public static com.amap.api.col.p0003l.a7 d(com.amap.api.col.p0003l.Cif r1) throws com.amap.api.col.p0003l.fk {
            boolean r0 = r1.isHttps()
            com.amap.api.col.3l.a7 r1 = j(r1, r0)
            return r1
    }

    private static com.amap.api.col.p0003l.a7 e(com.amap.api.col.p0003l.Cif r0, com.amap.api.col.p0003l.Cif.b r1, int r2) throws com.amap.api.col.p0003l.fk {
            k(r0)     // Catch: java.lang.Throwable -> L13 com.amap.api.col.p0003l.fk -> L1b
            r0.setDegradeType(r1)     // Catch: java.lang.Throwable -> L13 com.amap.api.col.p0003l.fk -> L1b
            r0.setReal_max_timeout(r2)     // Catch: java.lang.Throwable -> L13 com.amap.api.col.p0003l.fk -> L1b
            com.amap.api.col.3l.x6 r1 = new com.amap.api.col.3l.x6     // Catch: java.lang.Throwable -> L13 com.amap.api.col.p0003l.fk -> L1b
            r1.<init>()     // Catch: java.lang.Throwable -> L13 com.amap.api.col.p0003l.fk -> L1b
            com.amap.api.col.3l.a7 r0 = r1.x(r0)     // Catch: java.lang.Throwable -> L13 com.amap.api.col.p0003l.fk -> L1b
            return r0
        L13:
            com.amap.api.col.3l.fk r0 = new com.amap.api.col.3l.fk
            java.lang.String r1 = "未知的错误"
            r0.<init>(r1)
            throw r0
        L1b:
            r0 = move-exception
            throw r0
    }

    protected static com.amap.api.col.p0003l.Cif.b f(com.amap.api.col.p0003l.Cif r1, boolean r2) {
            com.amap.api.col.3l.if$a r1 = r1.getDegradeAbility()
            com.amap.api.col.3l.if$a r0 = com.amap.api.col.p0003l.Cif.a.f3527d
            if (r1 != r0) goto L10
            if (r2 == 0) goto Ld
            com.amap.api.col.3l.if$b r1 = com.amap.api.col.p0003l.Cif.b.f3535f
            return r1
        Ld:
            com.amap.api.col.3l.if$b r1 = com.amap.api.col.p0003l.Cif.b.f3536g
            return r1
        L10:
            if (r2 == 0) goto L15
            com.amap.api.col.3l.if$b r1 = com.amap.api.col.p0003l.Cif.b.f3532c
            return r1
        L15:
            com.amap.api.col.3l.if$b r1 = com.amap.api.col.p0003l.Cif.b.f3533d
            return r1
    }

    protected static boolean g(com.amap.api.col.p0003l.Cif r2) throws com.amap.api.col.p0003l.fk {
            k(r2)
            java.lang.String r0 = r2.getIPV6URL()     // Catch: java.lang.Throwable -> L2b
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto Lf
            r2 = 0
            return r2
        Lf:
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = r1.getHost()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r2.getIPDNSName()     // Catch: java.lang.Throwable -> L2b
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L26
            java.lang.String r0 = r2.getIPDNSName()     // Catch: java.lang.Throwable -> L2b
        L26:
            boolean r2 = com.amap.api.col.p0003l.g4.U(r0)     // Catch: java.lang.Throwable -> L2b
            return r2
        L2b:
            r2 = 1
            return r2
    }

    protected static int h(com.amap.api.col.p0003l.Cif r4, boolean r5) {
            k(r4)     // Catch: java.lang.Throwable -> L21
            int r0 = r4.getConntectionTimeout()     // Catch: java.lang.Throwable -> L21
            int r1 = com.amap.api.col.p0003l.g4.s     // Catch: java.lang.Throwable -> L21
            com.amap.api.col.3l.if$a r2 = r4.getDegradeAbility()     // Catch: java.lang.Throwable -> L21
            com.amap.api.col.3l.if$a r3 = com.amap.api.col.p0003l.Cif.a.f3527d     // Catch: java.lang.Throwable -> L21
            if (r2 == r3) goto L20
            com.amap.api.col.3l.if$a r4 = r4.getDegradeAbility()     // Catch: java.lang.Throwable -> L21
            com.amap.api.col.3l.if$a r2 = com.amap.api.col.p0003l.Cif.a.f3528e     // Catch: java.lang.Throwable -> L21
            if (r4 != r2) goto L1a
            goto L20
        L1a:
            if (r0 >= r1) goto L1d
            goto L20
        L1d:
            if (r5 == 0) goto L20
            return r1
        L20:
            return r0
        L21:
            r4 = 5000(0x1388, float:7.006E-42)
            return r4
    }

    protected static boolean i(com.amap.api.col.p0003l.Cif r3) throws com.amap.api.col.p0003l.fk {
            k(r3)
            r0 = 1
            boolean r1 = g(r3)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r1 = r3.getIPV6URL()     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = r3.getURL()     // Catch: java.lang.Throwable -> L29
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L29
            r2 = 0
            if (r1 == 0) goto L1b
            return r2
        L1b:
            com.amap.api.col.3l.if$a r3 = r3.getDegradeAbility()     // Catch: java.lang.Throwable -> L29
            com.amap.api.col.3l.if$a r1 = com.amap.api.col.p0003l.Cif.a.f3528e     // Catch: java.lang.Throwable -> L29
            if (r3 != r1) goto L24
            return r2
        L24:
            boolean r3 = com.amap.api.col.p0003l.g4.w     // Catch: java.lang.Throwable -> L29
            if (r3 != 0) goto L29
            return r2
        L29:
            return r0
    }

    @java.lang.Deprecated
    private static com.amap.api.col.p0003l.a7 j(com.amap.api.col.p0003l.Cif r6, boolean r7) throws com.amap.api.col.p0003l.fk {
            k(r6)
            if (r7 == 0) goto L8
            com.amap.api.col.3l.if$c r7 = com.amap.api.col.p0003l.Cif.c.f3539b
            goto La
        L8:
            com.amap.api.col.3l.if$c r7 = com.amap.api.col.p0003l.Cif.c.a
        La:
            r6.setHttpProtocol(r7)
            boolean r7 = g(r6)
            r0 = 0
            r1 = 0
            r3 = 0
            if (r7 == 0) goto L44
            boolean r7 = i(r6)
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: com.amap.api.col.p0003l.fk -> L2c
            com.amap.api.col.3l.if$b r4 = c(r6, r7)     // Catch: com.amap.api.col.p0003l.fk -> L2c
            int r5 = h(r6, r7)     // Catch: com.amap.api.col.p0003l.fk -> L2c
            com.amap.api.col.3l.a7 r0 = e(r6, r4, r5)     // Catch: com.amap.api.col.p0003l.fk -> L2c
            goto L44
        L2c:
            r3 = move-exception
            int r4 = r3.f()
            r5 = 21
            if (r4 != r5) goto L3f
            com.amap.api.col.3l.if$a r4 = r6.getDegradeAbility()
            com.amap.api.col.3l.if$a r5 = com.amap.api.col.p0003l.Cif.a.f3525b
            if (r4 == r5) goto L3e
            goto L3f
        L3e:
            throw r3
        L3f:
            if (r7 == 0) goto L43
            r3 = 1
            goto L44
        L43:
            throw r3
        L44:
            if (r0 == 0) goto L4f
            byte[] r7 = r0.a
            if (r7 == 0) goto L4f
            int r7 = r7.length
            if (r7 > 0) goto L4e
            goto L4f
        L4e:
            return r0
        L4f:
            com.amap.api.col.3l.if$b r7 = f(r6, r3)
            int r0 = a(r6, r1)
            com.amap.api.col.3l.a7 r6 = e(r6, r7, r0)
            return r6
    }

    protected static void k(com.amap.api.col.p0003l.Cif r1) throws com.amap.api.col.p0003l.fk {
            if (r1 == 0) goto L1d
            java.lang.String r0 = r1.getURL()
            if (r0 == 0) goto L15
            java.lang.String r0 = ""
            java.lang.String r1 = r1.getURL()
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L15
            return
        L15:
            com.amap.api.col.3l.fk r1 = new com.amap.api.col.3l.fk
            java.lang.String r0 = "request url is empty"
            r1.<init>(r0)
            throw r1
        L1d:
            com.amap.api.col.3l.fk r1 = new com.amap.api.col.3l.fk
            java.lang.String r0 = "requeust is null"
            r1.<init>(r0)
            throw r1
    }
}
