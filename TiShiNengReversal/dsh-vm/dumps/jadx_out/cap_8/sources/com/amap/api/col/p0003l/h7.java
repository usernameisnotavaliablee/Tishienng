package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h7 {
    static int a = 1000;

    /* renamed from: b, reason: collision with root package name */
    static boolean f3461b = false;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.ref.WeakReference<com.amap.api.col.p0003l.d7> f3462c = null;

    /* renamed from: d, reason: collision with root package name */
    static int f3463d = 20;

    /* renamed from: e, reason: collision with root package name */
    private static int f3464e = 10;

    /* renamed from: f, reason: collision with root package name */
    static int f3465f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends com.amap.api.col.p0003l.c8 {

        /* renamed from: d, reason: collision with root package name */
        private int f3466d;

        /* renamed from: e, reason: collision with root package name */
        private android.content.Context f3467e;

        /* renamed from: g, reason: collision with root package name */
        private com.amap.api.col.p0003l.g7 f3468g;

        a(android.content.Context r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f3467e = r1
                r0.f3466d = r2
                return
        }

        a(android.content.Context r2, com.amap.api.col.p0003l.g7 r3) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r0)
                r1.f3468g = r3
                return
        }

        @Override // com.amap.api.col.p0003l.c8
        public final void runTask() {
                r25 = this;
                r1 = r25
                int r0 = r1.f3466d
                r2 = 1
                if (r0 != r2) goto L5a
                java.lang.Class<com.amap.api.col.3l.h7> r2 = com.amap.api.col.p0003l.h7.class
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L51
                long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L42
                java.lang.String r0 = java.lang.Long.toString(r3)     // Catch: java.lang.Throwable -> L42
                java.lang.ref.WeakReference r3 = com.amap.api.col.p0003l.h7.a()     // Catch: java.lang.Throwable -> L42
                com.amap.api.col.3l.d7 r5 = com.amap.api.col.p0003l.k7.a(r3)     // Catch: java.lang.Throwable -> L42
                android.content.Context r4 = r1.f3467e     // Catch: java.lang.Throwable -> L42
                java.lang.String r6 = com.amap.api.col.p0003l.s5.f3969i     // Catch: java.lang.Throwable -> L42
                int r7 = com.amap.api.col.p0003l.h7.a     // Catch: java.lang.Throwable -> L42
                java.lang.String r9 = "6"
                r8 = 2097152(0x200000, float:2.938736E-39)
                com.amap.api.col.p0003l.k7.f(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L42
                com.amap.api.col.3l.l6 r3 = r5.f3150e     // Catch: java.lang.Throwable -> L42
                if (r3 != 0) goto L44
                com.amap.api.col.3l.k6 r3 = new com.amap.api.col.3l.k6     // Catch: java.lang.Throwable -> L42
                com.amap.api.col.3l.m6 r4 = new com.amap.api.col.3l.m6     // Catch: java.lang.Throwable -> L42
                com.amap.api.col.3l.n6 r6 = new com.amap.api.col.3l.n6     // Catch: java.lang.Throwable -> L42
                com.amap.api.col.3l.m6 r7 = new com.amap.api.col.3l.m6     // Catch: java.lang.Throwable -> L42
                r7.<init>()     // Catch: java.lang.Throwable -> L42
                r6.<init>(r7)     // Catch: java.lang.Throwable -> L42
                r4.<init>(r6)     // Catch: java.lang.Throwable -> L42
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L42
                r5.f3150e = r3     // Catch: java.lang.Throwable -> L42
                goto L44
            L42:
                r0 = move-exception
                goto L4f
            L44:
                com.amap.api.col.3l.g7 r3 = r1.f3468g     // Catch: java.lang.Throwable -> L42
                byte[] r3 = r3.b()     // Catch: java.lang.Throwable -> L42
                com.amap.api.col.p0003l.e7.c(r0, r3, r5)     // Catch: java.lang.Throwable -> L42
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L42
                return
            L4f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L42
                throw r0     // Catch: java.lang.Throwable -> L51
            L51:
                r0 = move-exception
                java.lang.String r2 = "ofm"
                java.lang.String r3 = "aple"
                com.amap.api.col.p0003l.w5.p(r0, r2, r3)
                return
            L5a:
                r3 = 2
                if (r0 != r3) goto L17e
                java.lang.ref.WeakReference r0 = com.amap.api.col.p0003l.h7.a()     // Catch: java.lang.Throwable -> L141
                com.amap.api.col.3l.d7 r5 = com.amap.api.col.p0003l.k7.a(r0)     // Catch: java.lang.Throwable -> L141
                android.content.Context r4 = r1.f3467e     // Catch: java.lang.Throwable -> L141
                java.lang.String r6 = com.amap.api.col.p0003l.s5.f3969i     // Catch: java.lang.Throwable -> L141
                int r7 = com.amap.api.col.p0003l.h7.a     // Catch: java.lang.Throwable -> L141
                java.lang.String r9 = "6"
                r8 = 2097152(0x200000, float:2.938736E-39)
                com.amap.api.col.p0003l.k7.f(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L141
                r0 = 14400000(0xdbba00, float:2.0178698E-38)
                r5.f3153h = r0     // Catch: java.lang.Throwable -> L141
                com.amap.api.col.3l.r7 r0 = r5.f3152g     // Catch: java.lang.Throwable -> L141
                if (r0 != 0) goto L143
                com.amap.api.col.3l.k6 r9 = new com.amap.api.col.3l.k6     // Catch: java.lang.Throwable -> L141
                com.amap.api.col.3l.m6 r0 = new com.amap.api.col.3l.m6     // Catch: java.lang.Throwable -> L141
                com.amap.api.col.3l.n6 r4 = new com.amap.api.col.3l.n6     // Catch: java.lang.Throwable -> L141
                r4.<init>()     // Catch: java.lang.Throwable -> L141
                r0.<init>(r4)     // Catch: java.lang.Throwable -> L141
                r9.<init>(r0)     // Catch: java.lang.Throwable -> L141
                com.amap.api.col.3l.o7 r0 = new com.amap.api.col.3l.o7     // Catch: java.lang.Throwable -> L141
                com.amap.api.col.3l.n7 r6 = new com.amap.api.col.3l.n7     // Catch: java.lang.Throwable -> L141
                android.content.Context r7 = r1.f3467e     // Catch: java.lang.Throwable -> L141
                com.amap.api.col.3l.s7 r8 = new com.amap.api.col.3l.s7     // Catch: java.lang.Throwable -> L141
                r8.<init>()     // Catch: java.lang.Throwable -> L141
                java.lang.String r10 = new java.lang.String     // Catch: java.lang.Throwable -> L141
                byte[] r4 = com.amap.api.col.p0003l.f5.c()     // Catch: java.lang.Throwable -> L141
                r10.<init>(r4)     // Catch: java.lang.Throwable -> L141
                android.content.Context r4 = r1.f3467e     // Catch: java.lang.Throwable -> L141
                java.lang.String r4 = com.amap.api.col.p0003l.f4.j(r4)     // Catch: java.lang.Throwable -> L141
                java.lang.String r11 = com.amap.api.col.p0003l.i4.P()     // Catch: java.lang.Throwable -> L141
                java.lang.String r12 = com.amap.api.col.p0003l.i4.I()     // Catch: java.lang.Throwable -> L141
                android.content.Context r13 = r1.f3467e     // Catch: java.lang.Throwable -> L141
                java.lang.String r13 = com.amap.api.col.p0003l.i4.F(r13)     // Catch: java.lang.Throwable -> L141
                java.lang.String r14 = com.amap.api.col.p0003l.i4.n()     // Catch: java.lang.Throwable -> L141
                java.lang.String r15 = com.amap.api.col.p0003l.i4.U()     // Catch: java.lang.Throwable -> L141
                r16 = 1
                android.content.Context r2 = r1.f3467e     // Catch: java.lang.Throwable -> L141
                java.lang.String r2 = com.amap.api.col.p0003l.f4.g(r2)     // Catch: java.lang.Throwable -> L141
                r17 = 2
                android.content.Context r3 = r1.f3467e     // Catch: java.lang.Throwable -> L141
                java.lang.String r3 = com.amap.api.col.p0003l.f4.h(r3)     // Catch: java.lang.Throwable -> L141
                r18 = r2
                android.content.Context r2 = r1.f3467e     // Catch: java.lang.Throwable -> L141
                java.lang.String r2 = com.amap.api.col.p0003l.f4.e(r2)     // Catch: java.lang.Throwable -> L141
                r19 = r2
                android.content.Context r2 = r1.f3467e     // Catch: java.lang.Throwable -> L141
                java.lang.String r2 = com.amap.api.col.p0003l.i4.D(r2)     // Catch: java.lang.Throwable -> L141
                r20 = r2
                android.content.Context r2 = r1.f3467e     // Catch: java.lang.Throwable -> L141
                java.lang.String r2 = com.amap.api.col.p0003l.i4.o(r2)     // Catch: java.lang.Throwable -> L141
                int r21 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L141
                java.lang.String r21 = java.lang.String.valueOf(r21)     // Catch: java.lang.Throwable -> L141
                r22 = r2
                android.content.Context r2 = r1.f3467e     // Catch: java.lang.Throwable -> L141
                com.amap.api.col.3l.w4 r2 = com.amap.api.col.p0003l.w4.a(r2)     // Catch: java.lang.Throwable -> L141
                java.lang.String r2 = r2.b()     // Catch: java.lang.Throwable -> L141
                r23 = r2
                r2 = 16
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L141
                r24 = 0
                r2[r24] = r4     // Catch: java.lang.Throwable -> L141
                r2[r16] = r11     // Catch: java.lang.Throwable -> L141
                r2[r17] = r12     // Catch: java.lang.Throwable -> L141
                r4 = 3
                r2[r4] = r13     // Catch: java.lang.Throwable -> L141
                r4 = 4
                r2[r4] = r14     // Catch: java.lang.Throwable -> L141
                java.lang.String r4 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L141
                r11 = 5
                r2[r11] = r4     // Catch: java.lang.Throwable -> L141
                java.lang.String r4 = android.os.Build.DEVICE     // Catch: java.lang.Throwable -> L141
                r11 = 6
                r2[r11] = r4     // Catch: java.lang.Throwable -> L141
                r4 = 7
                r2[r4] = r15     // Catch: java.lang.Throwable -> L141
                r4 = 8
                r2[r4] = r18     // Catch: java.lang.Throwable -> L141
                java.lang.String r4 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L141
                r11 = 9
                r2[r11] = r4     // Catch: java.lang.Throwable -> L141
                r4 = 10
                r2[r4] = r3     // Catch: java.lang.Throwable -> L141
                r3 = 11
                r2[r3] = r19     // Catch: java.lang.Throwable -> L141
                r3 = 12
                r2[r3] = r20     // Catch: java.lang.Throwable -> L141
                r3 = 13
                r2[r3] = r22     // Catch: java.lang.Throwable -> L141
                r3 = 14
                r2[r3] = r21     // Catch: java.lang.Throwable -> L141
                r3 = 15
                r2[r3] = r23     // Catch: java.lang.Throwable -> L141
                r11 = r2
                r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L141
                r0.<init>(r6)     // Catch: java.lang.Throwable -> L141
                r5.f3152g = r0     // Catch: java.lang.Throwable -> L141
                goto L143
            L141:
                r0 = move-exception
                goto L177
            L143:
                java.lang.String r0 = r5.f3154i     // Catch: java.lang.Throwable -> L141
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L141
                if (r0 == 0) goto L14f
                java.lang.String r0 = "fKey"
                r5.f3154i = r0     // Catch: java.lang.Throwable -> L141
            L14f:
                com.amap.api.col.3l.x7 r0 = new com.amap.api.col.3l.x7     // Catch: java.lang.Throwable -> L141
                android.content.Context r7 = r1.f3467e     // Catch: java.lang.Throwable -> L141
                int r2 = r5.f3153h     // Catch: java.lang.Throwable -> L141
                java.lang.String r3 = r5.f3154i     // Catch: java.lang.Throwable -> L141
                com.amap.api.col.3l.v7 r6 = new com.amap.api.col.3l.v7     // Catch: java.lang.Throwable -> L141
                boolean r8 = com.amap.api.col.p0003l.h7.f3461b     // Catch: java.lang.Throwable -> L141
                int r4 = com.amap.api.col.p0003l.h7.f()     // Catch: java.lang.Throwable -> L141
                int r9 = r4 * 1024
                int r4 = com.amap.api.col.p0003l.h7.f3463d     // Catch: java.lang.Throwable -> L141
                int r10 = r4 * 1024
                java.lang.String r11 = "offLocKey"
                int r4 = com.amap.api.col.p0003l.h7.f3465f     // Catch: java.lang.Throwable -> L141
                int r12 = r4 * 1024
                r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L141
                r0.<init>(r7, r2, r3, r6)     // Catch: java.lang.Throwable -> L141
                r5.f3151f = r0     // Catch: java.lang.Throwable -> L141
                com.amap.api.col.p0003l.e7.a(r5)     // Catch: java.lang.Throwable -> L141
                return
            L177:
                java.lang.String r2 = "ofm"
                java.lang.String r3 = "uold"
                com.amap.api.col.p0003l.w5.p(r0, r2, r3)
            L17e:
                return
        }
    }

    static {
            return
    }

    public h7() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.ref.WeakReference a() {
            java.lang.ref.WeakReference<com.amap.api.col.3l.d7> r0 = com.amap.api.col.p0003l.h7.f3462c
            return r0
    }

    @java.lang.Deprecated
    public static synchronized void b(int r1, boolean r2) {
            java.lang.Class<com.amap.api.col.3l.h7> r0 = com.amap.api.col.p0003l.h7.class
            monitor-enter(r0)
            com.amap.api.col.p0003l.h7.a = r1     // Catch: java.lang.Throwable -> L9
            com.amap.api.col.p0003l.h7.f3461b = r2     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public static synchronized void c(int r1, boolean r2, int r3, int r4) {
            java.lang.Class<com.amap.api.col.3l.h7> r0 = com.amap.api.col.p0003l.h7.class
            monitor-enter(r0)
            com.amap.api.col.p0003l.h7.a = r1     // Catch: java.lang.Throwable -> L1e
            com.amap.api.col.p0003l.h7.f3461b = r2     // Catch: java.lang.Throwable -> L1e
            r1 = 10
            if (r3 < r1) goto Lf
            r1 = 100
            if (r3 <= r1) goto L11
        Lf:
            r3 = 20
        L11:
            com.amap.api.col.p0003l.h7.f3463d = r3     // Catch: java.lang.Throwable -> L1e
            int r1 = r3 / 5
            int r2 = com.amap.api.col.p0003l.h7.f3464e     // Catch: java.lang.Throwable -> L1e
            if (r1 <= r2) goto L20
            int r3 = r3 / 5
            com.amap.api.col.p0003l.h7.f3464e = r3     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r1 = move-exception
            goto L24
        L20:
            com.amap.api.col.p0003l.h7.f3465f = r4     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            return
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r1
    }

    public static void d(android.content.Context r3) {
            com.amap.api.col.3l.b8 r0 = com.amap.api.col.p0003l.b8.h()
            com.amap.api.col.3l.h7$a r1 = new com.amap.api.col.3l.h7$a
            r2 = 2
            r1.<init>(r3, r2)
            r0.b(r1)
            return
    }

    public static synchronized void e(com.amap.api.col.p0003l.g7 r3, android.content.Context r4) {
            java.lang.Class<com.amap.api.col.3l.h7> r0 = com.amap.api.col.p0003l.h7.class
            monitor-enter(r0)
            com.amap.api.col.3l.b8 r1 = com.amap.api.col.p0003l.b8.h()     // Catch: java.lang.Throwable -> L11
            com.amap.api.col.3l.h7$a r2 = new com.amap.api.col.3l.h7$a     // Catch: java.lang.Throwable -> L11
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L11
            r1.b(r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return
        L11:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    static /* synthetic */ int f() {
            int r0 = com.amap.api.col.p0003l.h7.f3464e
            return r0
    }
}
