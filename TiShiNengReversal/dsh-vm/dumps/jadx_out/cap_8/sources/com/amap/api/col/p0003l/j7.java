package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class j7 {
    static boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    static int f3556b = 20;

    /* renamed from: c, reason: collision with root package name */
    private static int f3557c = 20;

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.ref.WeakReference<com.amap.api.col.p0003l.d7> f3558d;

    /* renamed from: e, reason: collision with root package name */
    private static int f3559e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends com.amap.api.col.p0003l.c8 {

        /* renamed from: i, reason: collision with root package name */
        static int f3560i = 1;

        /* renamed from: j, reason: collision with root package name */
        static int f3561j = 2;

        /* renamed from: k, reason: collision with root package name */
        static int f3562k = 3;

        /* renamed from: d, reason: collision with root package name */
        private android.content.Context f3563d;

        /* renamed from: e, reason: collision with root package name */
        private com.amap.api.col.p0003l.i7 f3564e;

        /* renamed from: g, reason: collision with root package name */
        private int f3565g;

        /* renamed from: h, reason: collision with root package name */
        private java.util.List<com.amap.api.col.p0003l.i7> f3566h;

        static {
                return
        }

        a(android.content.Context r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f3563d = r1
                r0.f3565g = r2
                return
        }

        a(android.content.Context r1, int r2, com.amap.api.col.p0003l.i7 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.f3564e = r3
                return
        }

        a(android.content.Context r1, int r2, java.util.List<com.amap.api.col.p0003l.i7> r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.f3566h = r3
                return
        }

        @Override // com.amap.api.col.p0003l.c8
        public final void runTask() {
                r13 = this;
                int r0 = r13.f3565g
                r1 = 1
                if (r0 != r1) goto L33
                android.content.Context r0 = r13.f3563d     // Catch: java.lang.Throwable -> L2a
                if (r0 == 0) goto L12d
                com.amap.api.col.3l.i7 r0 = r13.f3564e     // Catch: java.lang.Throwable -> L2a
                if (r0 != 0) goto Lf
                goto L12d
            Lf:
                java.lang.Class<com.amap.api.col.3l.j7> r1 = com.amap.api.col.p0003l.j7.class
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L2a
                android.content.Context r0 = r13.f3563d     // Catch: java.lang.Throwable -> L24
                if (r0 == 0) goto L26
                com.amap.api.col.3l.i7 r2 = r13.f3564e     // Catch: java.lang.Throwable -> L24
                if (r2 != 0) goto L1b
                goto L26
            L1b:
                byte[] r2 = r2.b()     // Catch: java.lang.Throwable -> L24
                com.amap.api.col.p0003l.j7.c(r0, r2)     // Catch: java.lang.Throwable -> L24
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
                return
            L24:
                r0 = move-exception
                goto L28
            L26:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
                return
            L28:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L2a
            L2a:
                r0 = move-exception
                java.lang.String r1 = "stm"
                java.lang.String r2 = "as"
                com.amap.api.col.p0003l.w5.p(r0, r1, r2)
                return
            L33:
                r1 = 2
                if (r0 != r1) goto L9d
                java.lang.Class<com.amap.api.col.3l.j7> r1 = com.amap.api.col.p0003l.j7.class
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L94
                java.util.List<com.amap.api.col.3l.i7> r0 = r13.f3566h     // Catch: java.lang.Throwable -> L87
                if (r0 == 0) goto L90
                android.content.Context r0 = r13.f3563d     // Catch: java.lang.Throwable -> L87
                if (r0 != 0) goto L42
                goto L90
            L42:
                r0 = 0
                byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L87
                r3 = 0
                java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L72
                r4.<init>()     // Catch: java.lang.Throwable -> L72
                java.util.List<com.amap.api.col.3l.i7> r0 = r13.f3566h     // Catch: java.lang.Throwable -> L67
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L67
            L51:
                boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L67
                if (r3 == 0) goto L6a
                java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L67
                com.amap.api.col.3l.i7 r3 = (com.amap.api.col.p0003l.i7) r3     // Catch: java.lang.Throwable -> L67
                if (r3 == 0) goto L51
                byte[] r3 = r3.b()     // Catch: java.lang.Throwable -> L67
                r4.write(r3)     // Catch: java.lang.Throwable -> L67
                goto L51
            L67:
                r0 = move-exception
                r3 = r4
                goto L73
            L6a:
                byte[] r2 = r4.toByteArray()     // Catch: java.lang.Throwable -> L67
                r4.close()     // Catch: java.lang.Throwable -> L7f
                goto L7f
            L72:
                r0 = move-exception
            L73:
                java.lang.String r4 = "stm"
                java.lang.String r5 = "aStB"
                com.amap.api.col.p0003l.w5.p(r0, r4, r5)     // Catch: java.lang.Throwable -> L89
                if (r3 == 0) goto L7f
                r3.close()     // Catch: java.lang.Throwable -> L7f
            L7f:
                android.content.Context r0 = r13.f3563d     // Catch: java.lang.Throwable -> L87
                com.amap.api.col.p0003l.j7.c(r0, r2)     // Catch: java.lang.Throwable -> L87
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L87
                goto L12d
            L87:
                r0 = move-exception
                goto L92
            L89:
                r0 = move-exception
                if (r3 == 0) goto L8f
                r3.close()     // Catch: java.lang.Throwable -> L8f
            L8f:
                throw r0     // Catch: java.lang.Throwable -> L87
            L90:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L87
                return
            L92:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L87
                throw r0     // Catch: java.lang.Throwable -> L94
            L94:
                r0 = move-exception
                java.lang.String r1 = "stm"
                java.lang.String r2 = "apb"
                com.amap.api.col.p0003l.w5.p(r0, r1, r2)
                return
            L9d:
                r1 = 3
                if (r0 != r1) goto L12d
                android.content.Context r0 = r13.f3563d     // Catch: java.lang.Throwable -> Lde
                if (r0 != 0) goto La6
                goto L12d
            La6:
                java.lang.ref.WeakReference r0 = com.amap.api.col.p0003l.j7.a()     // Catch: java.lang.Throwable -> Lde
                com.amap.api.col.3l.d7 r2 = com.amap.api.col.p0003l.k7.a(r0)     // Catch: java.lang.Throwable -> Lde
                android.content.Context r1 = r13.f3563d     // Catch: java.lang.Throwable -> Lde
                java.lang.String r3 = com.amap.api.col.p0003l.s5.f3968h     // Catch: java.lang.Throwable -> Lde
                java.lang.String r6 = "2"
                r4 = 1000(0x3e8, float:1.401E-42)
                r5 = 307200(0x4b000, float:4.30479E-40)
                com.amap.api.col.p0003l.k7.f(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lde
                com.amap.api.col.3l.r7 r0 = r2.f3152g     // Catch: java.lang.Throwable -> Lde
                if (r0 != 0) goto Le0
                com.amap.api.col.3l.l7 r0 = new com.amap.api.col.3l.l7     // Catch: java.lang.Throwable -> Lde
                com.amap.api.col.3l.p7 r1 = new com.amap.api.col.3l.p7     // Catch: java.lang.Throwable -> Lde
                android.content.Context r3 = r13.f3563d     // Catch: java.lang.Throwable -> Lde
                com.amap.api.col.3l.m7 r4 = new com.amap.api.col.3l.m7     // Catch: java.lang.Throwable -> Lde
                com.amap.api.col.3l.q7 r5 = new com.amap.api.col.3l.q7     // Catch: java.lang.Throwable -> Lde
                com.amap.api.col.3l.s7 r6 = new com.amap.api.col.3l.s7     // Catch: java.lang.Throwable -> Lde
                r6.<init>()     // Catch: java.lang.Throwable -> Lde
                r5.<init>(r6)     // Catch: java.lang.Throwable -> Lde
                r4.<init>(r5)     // Catch: java.lang.Throwable -> Lde
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lde
                r0.<init>(r1)     // Catch: java.lang.Throwable -> Lde
                r2.f3152g = r0     // Catch: java.lang.Throwable -> Lde
                goto Le0
            Lde:
                r0 = move-exception
                goto L126
            Le0:
                r0 = 3600000(0x36ee80, float:5.044674E-39)
                r2.f3153h = r0     // Catch: java.lang.Throwable -> Lde
                java.lang.String r0 = r2.f3154i     // Catch: java.lang.Throwable -> Lde
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lde
                if (r0 == 0) goto Lf1
                java.lang.String r0 = "cKey"
                r2.f3154i = r0     // Catch: java.lang.Throwable -> Lde
            Lf1:
                com.amap.api.col.3l.y7 r0 = r2.f3151f     // Catch: java.lang.Throwable -> Lde
                if (r0 != 0) goto L122
                com.amap.api.col.3l.x7 r0 = new com.amap.api.col.3l.x7     // Catch: java.lang.Throwable -> Lde
                android.content.Context r4 = r13.f3563d     // Catch: java.lang.Throwable -> Lde
                int r1 = r2.f3153h     // Catch: java.lang.Throwable -> Lde
                java.lang.String r10 = r2.f3154i     // Catch: java.lang.Throwable -> Lde
                com.amap.api.col.3l.t7 r11 = new com.amap.api.col.3l.t7     // Catch: java.lang.Throwable -> Lde
                java.lang.String r12 = r2.a     // Catch: java.lang.Throwable -> Lde
                com.amap.api.col.3l.v7 r3 = new com.amap.api.col.3l.v7     // Catch: java.lang.Throwable -> Lde
                boolean r5 = com.amap.api.col.p0003l.j7.a     // Catch: java.lang.Throwable -> Lde
                int r6 = com.amap.api.col.p0003l.j7.g()     // Catch: java.lang.Throwable -> Lde
                int r6 = r6 * 1024
                int r7 = com.amap.api.col.p0003l.j7.f3556b     // Catch: java.lang.Throwable -> Lde
                int r7 = r7 * 1024
                java.lang.String r8 = "staticUpdate"
                int r9 = com.amap.api.col.p0003l.j7.i()     // Catch: java.lang.Throwable -> Lde
                int r9 = r9 * 1024
                r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lde
                r11.<init>(r12, r3)     // Catch: java.lang.Throwable -> Lde
                r0.<init>(r4, r1, r10, r11)     // Catch: java.lang.Throwable -> Lde
                r2.f3151f = r0     // Catch: java.lang.Throwable -> Lde
            L122:
                com.amap.api.col.p0003l.e7.a(r2)     // Catch: java.lang.Throwable -> Lde
                return
            L126:
                java.lang.String r1 = "stm"
                java.lang.String r2 = "usd"
                com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            L12d:
                return
        }
    }

    static {
            return
    }

    public j7() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.ref.WeakReference a() {
            java.lang.ref.WeakReference<com.amap.api.col.3l.d7> r0 = com.amap.api.col.p0003l.j7.f3558d
            return r0
    }

    public static void b(android.content.Context r3) {
            com.amap.api.col.3l.b8 r0 = com.amap.api.col.p0003l.b8.h()
            com.amap.api.col.3l.j7$a r1 = new com.amap.api.col.3l.j7$a
            int r2 = com.amap.api.col.3l.j7.a.f3562k
            r1.<init>(r3, r2)
            r0.b(r1)
            return
    }

    static /* synthetic */ void c(android.content.Context r7, byte[] r8) throws java.io.IOException {
            java.lang.ref.WeakReference<com.amap.api.col.3l.d7> r0 = com.amap.api.col.p0003l.j7.f3558d
            com.amap.api.col.3l.d7 r2 = com.amap.api.col.p0003l.k7.a(r0)
            java.lang.String r3 = com.amap.api.col.p0003l.s5.f3968h
            r5 = 307200(0x4b000, float:4.30479E-40)
            java.lang.String r6 = "2"
            r4 = 1000(0x3e8, float:1.401E-42)
            r1 = r7
            com.amap.api.col.p0003l.k7.f(r1, r2, r3, r4, r5, r6)
            com.amap.api.col.3l.l6 r7 = r2.f3150e
            if (r7 != 0) goto L1e
            com.amap.api.col.3l.i6 r7 = new com.amap.api.col.3l.i6
            r7.<init>()
            r2.f3150e = r7
        L1e:
            java.util.Random r7 = new java.util.Random
            r7.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 100
            int r7 = r7.nextInt(r1)
            java.lang.String r7 = java.lang.Integer.toString(r7)
            r0.append(r7)
            long r3 = java.lang.System.nanoTime()
            java.lang.String r7 = java.lang.Long.toString(r3)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.amap.api.col.p0003l.e7.c(r7, r8, r2)     // Catch: java.lang.Throwable -> L48
            return
        L48:
            r0 = move-exception
            r7 = r0
            java.lang.String r8 = "stm"
            java.lang.String r0 = "wts"
            com.amap.api.col.p0003l.w5.p(r7, r8, r0)
            return
    }

    public static synchronized void d(com.amap.api.col.p0003l.i7 r4, android.content.Context r5) {
            java.lang.Class<com.amap.api.col.3l.j7> r0 = com.amap.api.col.p0003l.j7.class
            monitor-enter(r0)
            com.amap.api.col.3l.b8 r1 = com.amap.api.col.p0003l.b8.h()     // Catch: java.lang.Throwable -> L13
            com.amap.api.col.3l.j7$a r2 = new com.amap.api.col.3l.j7$a     // Catch: java.lang.Throwable -> L13
            int r3 = com.amap.api.col.3l.j7.a.f3560i     // Catch: java.lang.Throwable -> L13
            r2.<init>(r5, r3, r4)     // Catch: java.lang.Throwable -> L13
            r1.b(r2)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return
        L13:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r4
    }

    public static synchronized void e(java.util.List<com.amap.api.col.p0003l.i7> r4, android.content.Context r5) {
            java.lang.Class<com.amap.api.col.3l.j7> r0 = com.amap.api.col.p0003l.j7.class
            monitor-enter(r0)
            if (r4 == 0) goto L1e
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto Lc
            goto L1e
        Lc:
            com.amap.api.col.3l.b8 r1 = com.amap.api.col.p0003l.b8.h()     // Catch: java.lang.Throwable -> L1c
            com.amap.api.col.3l.j7$a r2 = new com.amap.api.col.3l.j7$a     // Catch: java.lang.Throwable -> L1c
            int r3 = com.amap.api.col.3l.j7.a.f3561j     // Catch: java.lang.Throwable -> L1c
            r2.<init>(r5, r3, r4)     // Catch: java.lang.Throwable -> L1c
            r1.b(r2)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L1c:
            monitor-exit(r0)
            return
        L1e:
            monitor-exit(r0)
            return
    }

    public static synchronized void f(boolean r1, int r2) {
            java.lang.Class<com.amap.api.col.3l.j7> r0 = com.amap.api.col.p0003l.j7.class
            monitor-enter(r0)
            com.amap.api.col.p0003l.j7.a = r1     // Catch: java.lang.Throwable -> Le
            r1 = 0
            int r1 = java.lang.Math.max(r1, r2)     // Catch: java.lang.Throwable -> Le
            com.amap.api.col.p0003l.j7.f3559e = r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    static /* synthetic */ int g() {
            int r0 = com.amap.api.col.p0003l.j7.f3557c
            return r0
    }

    public static synchronized void h(java.util.List<com.amap.api.col.p0003l.i7> r3, android.content.Context r4) {
            java.lang.Class<com.amap.api.col.3l.j7> r0 = com.amap.api.col.p0003l.j7.class
            monitor-enter(r0)
            java.util.List r1 = com.amap.api.col.p0003l.w6.q()     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L12
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L12
            if (r2 <= 0) goto L12
            r3.addAll(r1)     // Catch: java.lang.Throwable -> L12
        L12:
            e(r3, r4)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return
        L17:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    static /* synthetic */ int i() {
            int r0 = com.amap.api.col.p0003l.j7.f3559e
            return r0
    }
}
