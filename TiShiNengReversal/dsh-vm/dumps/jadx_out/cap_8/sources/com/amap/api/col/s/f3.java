package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f3 {
    static int a = 1000;

    /* renamed from: b, reason: collision with root package name */
    static boolean f4448b = false;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.ref.WeakReference<com.amap.api.col.s.c3> f4449c = null;

    /* renamed from: d, reason: collision with root package name */
    static int f4450d = 20;

    /* renamed from: e, reason: collision with root package name */
    private static int f4451e = 10;

    /* renamed from: f, reason: collision with root package name */
    static int f4452f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends com.amap.api.col.s.z3 {

        /* renamed from: b, reason: collision with root package name */
        private int f4453b;

        /* renamed from: c, reason: collision with root package name */
        private android.content.Context f4454c;

        /* renamed from: d, reason: collision with root package name */
        private com.amap.api.col.s.e3 f4455d;

        a(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.f4454c = r1
                r1 = 2
                r0.f4453b = r1
                return
        }

        @Override // com.amap.api.col.s.z3
        public final void a() {
                r25 = this;
                r1 = r25
                int r0 = r1.f4453b
                r2 = 1
                if (r0 != r2) goto L5a
                java.lang.Class<com.amap.api.col.s.f3> r2 = com.amap.api.col.s.f3.class
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L51
                long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L42
                java.lang.String r0 = java.lang.Long.toString(r3)     // Catch: java.lang.Throwable -> L42
                java.lang.ref.WeakReference r3 = com.amap.api.col.s.f3.a()     // Catch: java.lang.Throwable -> L42
                com.amap.api.col.s.c3 r5 = com.amap.api.col.s.i3.a(r3)     // Catch: java.lang.Throwable -> L42
                android.content.Context r4 = r1.f4454c     // Catch: java.lang.Throwable -> L42
                java.lang.String r6 = com.amap.api.col.s.e2.f4442i     // Catch: java.lang.Throwable -> L42
                int r7 = com.amap.api.col.s.f3.a     // Catch: java.lang.Throwable -> L42
                java.lang.String r9 = "6"
                r8 = 2097152(0x200000, float:2.938736E-39)
                com.amap.api.col.s.i3.e(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L42
                com.amap.api.col.s.n2 r3 = r5.f4349e     // Catch: java.lang.Throwable -> L42
                if (r3 != 0) goto L44
                com.amap.api.col.s.m2 r3 = new com.amap.api.col.s.m2     // Catch: java.lang.Throwable -> L42
                com.amap.api.col.s.o2 r4 = new com.amap.api.col.s.o2     // Catch: java.lang.Throwable -> L42
                com.amap.api.col.s.p2 r6 = new com.amap.api.col.s.p2     // Catch: java.lang.Throwable -> L42
                com.amap.api.col.s.o2 r7 = new com.amap.api.col.s.o2     // Catch: java.lang.Throwable -> L42
                r7.<init>()     // Catch: java.lang.Throwable -> L42
                r6.<init>(r7)     // Catch: java.lang.Throwable -> L42
                r4.<init>(r6)     // Catch: java.lang.Throwable -> L42
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L42
                r5.f4349e = r3     // Catch: java.lang.Throwable -> L42
                goto L44
            L42:
                r0 = move-exception
                goto L4f
            L44:
                com.amap.api.col.s.e3 r3 = r1.f4455d     // Catch: java.lang.Throwable -> L42
                byte[] r3 = r3.b()     // Catch: java.lang.Throwable -> L42
                com.amap.api.col.s.d3.c(r0, r3, r5)     // Catch: java.lang.Throwable -> L42
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L42
                return
            L4f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L42
                throw r0     // Catch: java.lang.Throwable -> L51
            L51:
                r0 = move-exception
                java.lang.String r2 = "ofm"
                java.lang.String r3 = "aple"
                com.amap.api.col.s.g2.o(r0, r2, r3)
                return
            L5a:
                r3 = 2
                if (r0 != r3) goto L17e
                java.lang.ref.WeakReference r0 = com.amap.api.col.s.f3.a()     // Catch: java.lang.Throwable -> L141
                com.amap.api.col.s.c3 r5 = com.amap.api.col.s.i3.a(r0)     // Catch: java.lang.Throwable -> L141
                android.content.Context r4 = r1.f4454c     // Catch: java.lang.Throwable -> L141
                java.lang.String r6 = com.amap.api.col.s.e2.f4442i     // Catch: java.lang.Throwable -> L141
                int r7 = com.amap.api.col.s.f3.a     // Catch: java.lang.Throwable -> L141
                java.lang.String r9 = "6"
                r8 = 2097152(0x200000, float:2.938736E-39)
                com.amap.api.col.s.i3.e(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L141
                r0 = 14400000(0xdbba00, float:2.0178698E-38)
                r5.f4352h = r0     // Catch: java.lang.Throwable -> L141
                com.amap.api.col.s.p3 r0 = r5.f4351g     // Catch: java.lang.Throwable -> L141
                if (r0 != 0) goto L143
                com.amap.api.col.s.m2 r9 = new com.amap.api.col.s.m2     // Catch: java.lang.Throwable -> L141
                com.amap.api.col.s.o2 r0 = new com.amap.api.col.s.o2     // Catch: java.lang.Throwable -> L141
                com.amap.api.col.s.p2 r4 = new com.amap.api.col.s.p2     // Catch: java.lang.Throwable -> L141
                r4.<init>()     // Catch: java.lang.Throwable -> L141
                r0.<init>(r4)     // Catch: java.lang.Throwable -> L141
                r9.<init>(r0)     // Catch: java.lang.Throwable -> L141
                com.amap.api.col.s.m3 r0 = new com.amap.api.col.s.m3     // Catch: java.lang.Throwable -> L141
                com.amap.api.col.s.l3 r6 = new com.amap.api.col.s.l3     // Catch: java.lang.Throwable -> L141
                android.content.Context r7 = r1.f4454c     // Catch: java.lang.Throwable -> L141
                com.amap.api.col.s.q3 r8 = new com.amap.api.col.s.q3     // Catch: java.lang.Throwable -> L141
                r8.<init>()     // Catch: java.lang.Throwable -> L141
                java.lang.String r10 = new java.lang.String     // Catch: java.lang.Throwable -> L141
                byte[] r4 = com.amap.api.col.s.s1.c()     // Catch: java.lang.Throwable -> L141
                r10.<init>(r4)     // Catch: java.lang.Throwable -> L141
                android.content.Context r4 = r1.f4454c     // Catch: java.lang.Throwable -> L141
                java.lang.String r4 = com.amap.api.col.s.x0.i(r4)     // Catch: java.lang.Throwable -> L141
                java.lang.String r11 = com.amap.api.col.s.c1.H()     // Catch: java.lang.Throwable -> L141
                java.lang.String r12 = com.amap.api.col.s.c1.C()     // Catch: java.lang.Throwable -> L141
                android.content.Context r13 = r1.f4454c     // Catch: java.lang.Throwable -> L141
                java.lang.String r13 = com.amap.api.col.s.c1.y(r13)     // Catch: java.lang.Throwable -> L141
                java.lang.String r14 = com.amap.api.col.s.c1.i()     // Catch: java.lang.Throwable -> L141
                java.lang.String r15 = com.amap.api.col.s.c1.M()     // Catch: java.lang.Throwable -> L141
                r16 = 1
                android.content.Context r2 = r1.f4454c     // Catch: java.lang.Throwable -> L141
                java.lang.String r2 = com.amap.api.col.s.x0.f(r2)     // Catch: java.lang.Throwable -> L141
                r17 = 2
                android.content.Context r3 = r1.f4454c     // Catch: java.lang.Throwable -> L141
                java.lang.String r3 = com.amap.api.col.s.x0.g(r3)     // Catch: java.lang.Throwable -> L141
                r18 = r2
                android.content.Context r2 = r1.f4454c     // Catch: java.lang.Throwable -> L141
                java.lang.String r2 = com.amap.api.col.s.x0.d(r2)     // Catch: java.lang.Throwable -> L141
                r19 = r2
                android.content.Context r2 = r1.f4454c     // Catch: java.lang.Throwable -> L141
                java.lang.String r2 = com.amap.api.col.s.c1.w(r2)     // Catch: java.lang.Throwable -> L141
                r20 = r2
                android.content.Context r2 = r1.f4454c     // Catch: java.lang.Throwable -> L141
                java.lang.String r2 = com.amap.api.col.s.c1.j(r2)     // Catch: java.lang.Throwable -> L141
                int r21 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L141
                java.lang.String r21 = java.lang.String.valueOf(r21)     // Catch: java.lang.Throwable -> L141
                r22 = r2
                android.content.Context r2 = r1.f4454c     // Catch: java.lang.Throwable -> L141
                com.amap.api.col.s.o1 r2 = com.amap.api.col.s.o1.a(r2)     // Catch: java.lang.Throwable -> L141
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
                r5.f4351g = r0     // Catch: java.lang.Throwable -> L141
                goto L143
            L141:
                r0 = move-exception
                goto L177
            L143:
                java.lang.String r0 = r5.f4353i     // Catch: java.lang.Throwable -> L141
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L141
                if (r0 == 0) goto L14f
                java.lang.String r0 = "fKey"
                r5.f4353i = r0     // Catch: java.lang.Throwable -> L141
            L14f:
                com.amap.api.col.s.u3 r0 = new com.amap.api.col.s.u3     // Catch: java.lang.Throwable -> L141
                android.content.Context r7 = r1.f4454c     // Catch: java.lang.Throwable -> L141
                int r2 = r5.f4352h     // Catch: java.lang.Throwable -> L141
                java.lang.String r3 = r5.f4353i     // Catch: java.lang.Throwable -> L141
                com.amap.api.col.s.s3 r6 = new com.amap.api.col.s.s3     // Catch: java.lang.Throwable -> L141
                boolean r8 = com.amap.api.col.s.f3.f4448b     // Catch: java.lang.Throwable -> L141
                int r4 = com.amap.api.col.s.f3.c()     // Catch: java.lang.Throwable -> L141
                int r9 = r4 * 1024
                int r4 = com.amap.api.col.s.f3.f4450d     // Catch: java.lang.Throwable -> L141
                int r10 = r4 * 1024
                java.lang.String r11 = "offLocKey"
                int r4 = com.amap.api.col.s.f3.f4452f     // Catch: java.lang.Throwable -> L141
                int r12 = r4 * 1024
                r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L141
                r0.<init>(r7, r2, r3, r6)     // Catch: java.lang.Throwable -> L141
                r5.f4350f = r0     // Catch: java.lang.Throwable -> L141
                com.amap.api.col.s.d3.a(r5)     // Catch: java.lang.Throwable -> L141
                return
            L177:
                java.lang.String r2 = "ofm"
                java.lang.String r3 = "uold"
                com.amap.api.col.s.g2.o(r0, r2, r3)
            L17e:
                return
        }
    }

    static {
            return
    }

    public f3() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.ref.WeakReference a() {
            java.lang.ref.WeakReference<com.amap.api.col.s.c3> r0 = com.amap.api.col.s.f3.f4449c
            return r0
    }

    public static void b(android.content.Context r2) {
            com.amap.api.col.s.y3 r0 = com.amap.api.col.s.y3.e()
            com.amap.api.col.s.f3$a r1 = new com.amap.api.col.s.f3$a
            r1.<init>(r2)
            r0.c(r1)
            return
    }

    static /* synthetic */ int c() {
            int r0 = com.amap.api.col.s.f3.f4451e
            return r0
    }
}
