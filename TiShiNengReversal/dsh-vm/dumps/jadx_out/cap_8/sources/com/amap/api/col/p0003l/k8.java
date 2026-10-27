package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class k8 {

    /* renamed from: g, reason: collision with root package name */
    private static volatile com.amap.api.col.p0003l.k8 f3621g;

    /* renamed from: h, reason: collision with root package name */
    private static java.lang.Object f3622h;
    private com.amap.api.col.p0003l.j8 a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.col.p0003l.l8 f3623b;

    /* renamed from: c, reason: collision with root package name */
    private long f3624c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.col.p0003l.l9 f3625d;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.col.p0003l.g8 f3626e;

    /* renamed from: f, reason: collision with root package name */
    private com.amap.api.col.p0003l.l9 f3627f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        public com.amap.api.col.p0003l.l9 a;

        /* renamed from: b, reason: collision with root package name */
        public java.util.List<com.amap.api.col.p0003l.m9> f3628b;

        /* renamed from: c, reason: collision with root package name */
        public long f3629c;

        /* renamed from: d, reason: collision with root package name */
        public long f3630d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f3631e;

        /* renamed from: f, reason: collision with root package name */
        public long f3632f;

        /* renamed from: g, reason: collision with root package name */
        public byte f3633g;

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f3634h;

        /* renamed from: i, reason: collision with root package name */
        public java.util.List<com.amap.api.col.p0003l.ko> f3635i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f3636j;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.amap.api.col.p0003l.k8.f3622h = r0
            return
    }

    private k8() {
            r1 = this;
            r1.<init>()
            com.amap.api.col.3l.l9 r0 = new com.amap.api.col.3l.l9
            r0.<init>()
            r1.f3627f = r0
            com.amap.api.col.3l.j8 r0 = new com.amap.api.col.3l.j8
            r0.<init>()
            r1.a = r0
            com.amap.api.col.3l.l8 r0 = new com.amap.api.col.3l.l8
            r0.<init>()
            r1.f3623b = r0
            com.amap.api.col.3l.g8 r0 = new com.amap.api.col.3l.g8
            r0.<init>()
            r1.f3626e = r0
            return
    }

    public static com.amap.api.col.p0003l.k8 a() {
            com.amap.api.col.3l.k8 r0 = com.amap.api.col.p0003l.k8.f3621g
            if (r0 != 0) goto L19
            java.lang.Object r0 = com.amap.api.col.p0003l.k8.f3622h
            monitor-enter(r0)
            com.amap.api.col.3l.k8 r1 = com.amap.api.col.p0003l.k8.f3621g     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.amap.api.col.3l.k8 r1 = new com.amap.api.col.3l.k8     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.amap.api.col.p0003l.k8.f3621g = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.amap.api.col.3l.k8 r0 = com.amap.api.col.p0003l.k8.f3621g
            return r0
    }

    public final com.amap.api.col.p0003l.m8 b(com.amap.api.col.3l.k8.a r23) {
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            long r7 = java.lang.System.currentTimeMillis()
            long r11 = android.os.SystemClock.elapsedRealtime()
            com.amap.api.col.3l.l9 r3 = r0.f3625d
            if (r3 == 0) goto L22
            com.amap.api.col.3l.l9 r4 = r1.a
            double r3 = r4.a(r3)
            r5 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 < 0) goto L21
            goto L22
        L21:
            return r2
        L22:
            com.amap.api.col.3l.j8 r13 = r0.a
            com.amap.api.col.3l.l9 r14 = r1.a
            boolean r15 = r1.f3636j
            byte r3 = r1.f3633g
            java.lang.String r4 = r1.f3634h
            java.util.List<com.amap.api.col.3l.ko> r5 = r1.f3635i
            r16 = r3
            r17 = r4
            r18 = r5
            com.amap.api.col.3l.j8$a r18 = r13.a(r14, r15, r16, r17, r18)
            com.amap.api.col.3l.l8 r3 = r0.f3623b
            com.amap.api.col.3l.l9 r4 = r1.a
            java.util.List<com.amap.api.col.3l.m9> r5 = r1.f3628b
            boolean r6 = r1.f3631e
            r9 = r7
            long r7 = r1.f3630d
            java.util.List r21 = r3.a(r4, r5, r6, r7, r9)
            if (r18 != 0) goto L4b
            if (r21 == 0) goto L6b
        L4b:
            com.amap.api.col.3l.l9 r3 = r0.f3627f
            com.amap.api.col.3l.l9 r4 = r1.a
            long r5 = r1.f3632f
            r7 = r9
            com.amap.api.col.p0003l.i9.a(r3, r4, r5, r7)
            com.amap.api.col.3l.m8 r2 = new com.amap.api.col.3l.m8
            com.amap.api.col.3l.g8 r3 = r0.f3626e
            com.amap.api.col.3l.l9 r4 = r0.f3627f
            long r5 = r1.f3629c
            r16 = r3
            r17 = r4
            r19 = r5
            byte[] r3 = r16.f(r17, r18, r19, r21)
            r4 = 0
            r2.<init>(r4, r3)
        L6b:
            com.amap.api.col.3l.l9 r1 = r1.a
            r0.f3625d = r1
            r0.f3624c = r11
            return r2
    }
}
