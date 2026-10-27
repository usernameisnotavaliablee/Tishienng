package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c0 {
    public static java.lang.String o = "";
    public static boolean p = false;
    private static volatile com.amap.api.col.p0003l.c0 q = null;
    public static java.lang.String r = "";
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3043b;

    /* renamed from: c, reason: collision with root package name */
    java.util.List<com.amap.api.col.p0003l.ax> f3044c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.col.3l.c0.d f3045d;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.col.p0003l.m0 f3046e;

    /* renamed from: f, reason: collision with root package name */
    private com.amap.api.col.p0003l.s0 f3047f;

    /* renamed from: g, reason: collision with root package name */
    private com.amap.api.col.p0003l.b8 f3048g;

    /* renamed from: h, reason: collision with root package name */
    private com.amap.api.col.p0003l.b8 f3049h;

    /* renamed from: i, reason: collision with root package name */
    private com.amap.api.col.p0003l.b8 f3050i;

    /* renamed from: j, reason: collision with root package name */
    com.amap.api.col.3l.c0.e f3051j;

    /* renamed from: k, reason: collision with root package name */
    public com.amap.api.col.p0003l.h0 f3052k;
    com.amap.api.col.p0003l.j0 l;
    com.amap.api.col.p0003l.g0 m;
    private boolean n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends com.amap.api.col.p0003l.c8 {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3053d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.c0 f3054e;

        a(com.amap.api.col.p0003l.c0 r1, java.lang.String r2) {
                r0 = this;
                r0.f3054e = r1
                r0.f3053d = r2
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.p0003l.c8
        public final void runTask() {
                r5 = this;
                com.amap.api.col.3l.c0 r0 = r5.f3054e
                java.lang.String r1 = r5.f3053d
                com.amap.api.col.3l.ax r0 = com.amap.api.col.p0003l.c0.a(r0, r1)
                if (r0 == 0) goto L7d
                com.amap.api.col.3l.g1 r1 = r0.s()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                com.amap.api.col.3l.g1 r2 = r0.f2987h     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                if (r1 != 0) goto L5a
                com.amap.api.col.3l.g1 r1 = r0.s()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                com.amap.api.col.3l.g1 r2 = r0.f2989j     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                if (r1 == 0) goto L23
                goto L5a
            L23:
                java.lang.String r1 = r0.getPinyin()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                int r2 = r1.length()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                if (r2 <= 0) goto L7d
                com.amap.api.col.3l.c0 r2 = r5.f3054e     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                com.amap.api.col.3l.s0 r2 = com.amap.api.col.p0003l.c0.c(r2)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                java.lang.String r1 = r2.n(r1)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                if (r1 != 0) goto L44
                java.lang.String r1 = r0.getVersion()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                goto L44
            L3e:
                r1 = move-exception
                goto Lef
            L41:
                goto L112
            L44:
                java.lang.String r2 = com.amap.api.col.p0003l.c0.r     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                int r2 = r2.length()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                if (r2 <= 0) goto L7d
                if (r1 == 0) goto L7d
                java.lang.String r2 = com.amap.api.col.p0003l.c0.r     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                boolean r1 = com.amap.api.col.p0003l.c0.i(r2, r1)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                if (r1 == 0) goto L7d
                r0.C()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                goto L7d
            L5a:
                com.amap.api.col.3l.c0 r1 = r5.f3054e
                com.amap.api.col.3l.c0$d r1 = com.amap.api.col.p0003l.c0.s(r1)
                if (r1 == 0) goto L134
                com.amap.api.col.3l.c0 r1 = r5.f3054e
                monitor-enter(r1)
                com.amap.api.col.3l.c0 r2 = r5.f3054e     // Catch: java.lang.Throwable -> L6f
                com.amap.api.col.3l.c0$d r2 = com.amap.api.col.p0003l.c0.s(r2)     // Catch: java.lang.Throwable -> L6f
                r2.b(r0)     // Catch: java.lang.Throwable -> L6f
                goto L77
            L6f:
                r0 = move-exception
                java.lang.String r2 = "OfflineDownloadManager"
                java.lang.String r3 = "checkUpdatefinally"
                com.amap.api.col.p0003l.w5.p(r0, r2, r3)     // Catch: java.lang.Throwable -> L7a
            L77:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7a
                goto L134
            L7a:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7a
                throw r0
            L7d:
                com.amap.api.col.3l.c0 r1 = r5.f3054e     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                com.amap.api.col.p0003l.c0.l(r1)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                com.amap.api.col.3l.f0 r1 = new com.amap.api.col.3l.f0     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                com.amap.api.col.3l.c0 r2 = r5.f3054e     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                android.content.Context r2 = com.amap.api.col.p0003l.c0.o(r2)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                java.lang.String r3 = com.amap.api.col.p0003l.c0.r     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                java.lang.Object r1 = r1.f()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                com.amap.api.col.3l.d0 r1 = (com.amap.api.col.p0003l.d0) r1     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                com.amap.api.col.3l.c0 r2 = r5.f3054e     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                com.amap.api.col.3l.c0$d r2 = com.amap.api.col.p0003l.c0.s(r2)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                if (r2 == 0) goto Lcd
                if (r1 != 0) goto Lc2
                com.amap.api.col.3l.c0 r1 = r5.f3054e
                com.amap.api.col.3l.c0$d r1 = com.amap.api.col.p0003l.c0.s(r1)
                if (r1 == 0) goto L134
                com.amap.api.col.3l.c0 r1 = r5.f3054e
                monitor-enter(r1)
                com.amap.api.col.3l.c0 r2 = r5.f3054e     // Catch: java.lang.Throwable -> Lb4
                com.amap.api.col.3l.c0$d r2 = com.amap.api.col.p0003l.c0.s(r2)     // Catch: java.lang.Throwable -> Lb4
                r2.b(r0)     // Catch: java.lang.Throwable -> Lb4
                goto Lbc
            Lb4:
                r0 = move-exception
                java.lang.String r2 = "OfflineDownloadManager"
                java.lang.String r3 = "checkUpdatefinally"
                com.amap.api.col.p0003l.w5.p(r0, r2, r3)     // Catch: java.lang.Throwable -> Lbf
            Lbc:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lbf
                goto L134
            Lbf:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lbf
                throw r0
            Lc2:
                boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                if (r1 == 0) goto Lcd
                com.amap.api.col.3l.c0 r1 = r5.f3054e     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
                r1.p()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            Lcd:
                com.amap.api.col.3l.c0 r1 = r5.f3054e
                com.amap.api.col.3l.c0$d r1 = com.amap.api.col.p0003l.c0.s(r1)
                if (r1 == 0) goto L134
                com.amap.api.col.3l.c0 r1 = r5.f3054e
                monitor-enter(r1)
                com.amap.api.col.3l.c0 r2 = r5.f3054e     // Catch: java.lang.Throwable -> Le2
                com.amap.api.col.3l.c0$d r2 = com.amap.api.col.p0003l.c0.s(r2)     // Catch: java.lang.Throwable -> Le2
                r2.b(r0)     // Catch: java.lang.Throwable -> Le2
                goto Lea
            Le2:
                r0 = move-exception
                java.lang.String r2 = "OfflineDownloadManager"
                java.lang.String r3 = "checkUpdatefinally"
                com.amap.api.col.p0003l.w5.p(r0, r2, r3)     // Catch: java.lang.Throwable -> Lec
            Lea:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lec
                goto L134
            Lec:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lec
                throw r0
            Lef:
                com.amap.api.col.3l.c0 r2 = r5.f3054e
                com.amap.api.col.3l.c0$d r2 = com.amap.api.col.p0003l.c0.s(r2)
                if (r2 == 0) goto L111
                com.amap.api.col.3l.c0 r2 = r5.f3054e
                monitor-enter(r2)
                com.amap.api.col.3l.c0 r3 = r5.f3054e     // Catch: java.lang.Throwable -> L104
                com.amap.api.col.3l.c0$d r3 = com.amap.api.col.p0003l.c0.s(r3)     // Catch: java.lang.Throwable -> L104
                r3.b(r0)     // Catch: java.lang.Throwable -> L104
                goto L10c
            L104:
                r0 = move-exception
                java.lang.String r3 = "OfflineDownloadManager"
                java.lang.String r4 = "checkUpdatefinally"
                com.amap.api.col.p0003l.w5.p(r0, r3, r4)     // Catch: java.lang.Throwable -> L10e
            L10c:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L10e
                goto L111
            L10e:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L10e
                throw r0
            L111:
                throw r1
            L112:
                com.amap.api.col.3l.c0 r1 = r5.f3054e
                com.amap.api.col.3l.c0$d r1 = com.amap.api.col.p0003l.c0.s(r1)
                if (r1 == 0) goto L134
                com.amap.api.col.3l.c0 r1 = r5.f3054e
                monitor-enter(r1)
                com.amap.api.col.3l.c0 r2 = r5.f3054e     // Catch: java.lang.Throwable -> L127
                com.amap.api.col.3l.c0$d r2 = com.amap.api.col.p0003l.c0.s(r2)     // Catch: java.lang.Throwable -> L127
                r2.b(r0)     // Catch: java.lang.Throwable -> L127
                goto L12f
            L127:
                r0 = move-exception
                java.lang.String r2 = "OfflineDownloadManager"
                java.lang.String r3 = "checkUpdatefinally"
                com.amap.api.col.p0003l.w5.p(r0, r2, r3)     // Catch: java.lang.Throwable -> L131
            L12f:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L131
                goto L134
            L131:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L131
                throw r0
            L134:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b extends com.amap.api.col.p0003l.c8 {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.ax f3055d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f3056e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.c0 f3057g;

        b(com.amap.api.col.p0003l.c0 r1, com.amap.api.col.p0003l.ax r2, boolean r3) {
                r0 = this;
                r0.f3057g = r1
                r0.f3055d = r2
                r0.f3056e = r3
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.p0003l.c8
        public final void runTask() {
                r3 = this;
                com.amap.api.col.3l.ax r0 = r3.f3055d     // Catch: java.lang.Throwable -> L24
                com.amap.api.col.3l.g1 r0 = r0.s()     // Catch: java.lang.Throwable -> L24
                com.amap.api.col.3l.ax r1 = r3.f3055d     // Catch: java.lang.Throwable -> L24
                com.amap.api.col.3l.g1 r1 = r1.f2985f     // Catch: java.lang.Throwable -> L24
                boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L24
                if (r0 == 0) goto L26
                com.amap.api.col.3l.c0 r0 = r3.f3057g     // Catch: java.lang.Throwable -> L24
                com.amap.api.col.3l.c0$d r0 = com.amap.api.col.p0003l.c0.s(r0)     // Catch: java.lang.Throwable -> L24
                if (r0 == 0) goto L76
                com.amap.api.col.3l.c0 r0 = r3.f3057g     // Catch: java.lang.Throwable -> L24
                com.amap.api.col.3l.c0$d r0 = com.amap.api.col.p0003l.c0.s(r0)     // Catch: java.lang.Throwable -> L24
                com.amap.api.col.3l.ax r1 = r3.f3055d     // Catch: java.lang.Throwable -> L24
                r0.c(r1)     // Catch: java.lang.Throwable -> L24
                return
            L24:
                r0 = move-exception
                goto L77
            L26:
                com.amap.api.col.3l.ax r0 = r3.f3055d     // Catch: java.lang.Throwable -> L24
                int r0 = r0.getState()     // Catch: java.lang.Throwable -> L24
                r1 = 7
                if (r0 == r1) goto L56
                com.amap.api.col.3l.ax r0 = r3.f3055d     // Catch: java.lang.Throwable -> L24
                int r0 = r0.getState()     // Catch: java.lang.Throwable -> L24
                r1 = -1
                if (r0 != r1) goto L39
                goto L56
            L39:
                com.amap.api.col.3l.c0 r0 = r3.f3057g     // Catch: java.lang.Throwable -> L24
                com.amap.api.col.3l.j0 r0 = r0.l     // Catch: java.lang.Throwable -> L24
                com.amap.api.col.3l.ax r1 = r3.f3055d     // Catch: java.lang.Throwable -> L24
                r0.a(r1)     // Catch: java.lang.Throwable -> L24
                com.amap.api.col.3l.c0 r0 = r3.f3057g     // Catch: java.lang.Throwable -> L24
                com.amap.api.col.3l.c0$d r0 = com.amap.api.col.p0003l.c0.s(r0)     // Catch: java.lang.Throwable -> L24
                if (r0 == 0) goto L76
                com.amap.api.col.3l.c0 r0 = r3.f3057g     // Catch: java.lang.Throwable -> L24
                com.amap.api.col.3l.c0$d r0 = com.amap.api.col.p0003l.c0.s(r0)     // Catch: java.lang.Throwable -> L24
                com.amap.api.col.3l.ax r1 = r3.f3055d     // Catch: java.lang.Throwable -> L24
                r0.c(r1)     // Catch: java.lang.Throwable -> L24
                return
            L56:
                com.amap.api.col.3l.c0 r0 = r3.f3057g     // Catch: java.lang.Throwable -> L24
                com.amap.api.col.3l.j0 r0 = r0.l     // Catch: java.lang.Throwable -> L24
                com.amap.api.col.3l.ax r1 = r3.f3055d     // Catch: java.lang.Throwable -> L24
                r0.a(r1)     // Catch: java.lang.Throwable -> L24
                boolean r0 = r3.f3056e     // Catch: java.lang.Throwable -> L24
                if (r0 == 0) goto L76
                com.amap.api.col.3l.c0 r0 = r3.f3057g     // Catch: java.lang.Throwable -> L24
                com.amap.api.col.3l.c0$d r0 = com.amap.api.col.p0003l.c0.s(r0)     // Catch: java.lang.Throwable -> L24
                if (r0 == 0) goto L76
                com.amap.api.col.3l.c0 r0 = r3.f3057g     // Catch: java.lang.Throwable -> L24
                com.amap.api.col.3l.c0$d r0 = com.amap.api.col.p0003l.c0.s(r0)     // Catch: java.lang.Throwable -> L24
                com.amap.api.col.3l.ax r1 = r3.f3055d     // Catch: java.lang.Throwable -> L24
                r0.c(r1)     // Catch: java.lang.Throwable -> L24
            L76:
                return
            L77:
                java.lang.String r1 = "requestDelete"
                java.lang.String r2 = "removeExcecRunnable"
                com.amap.api.col.p0003l.w5.p(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class c extends com.amap.api.col.p0003l.c8 {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.ax f3058d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.c0 f3059e;

        c(com.amap.api.col.p0003l.c0 r1, com.amap.api.col.p0003l.ax r2) {
                r0 = this;
                r0.f3059e = r1
                r0.f3058d = r2
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.p0003l.c8
        public final void runTask() {
                r3 = this;
                com.amap.api.col.3l.c0 r0 = r3.f3059e     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                boolean r0 = com.amap.api.col.p0003l.c0.z(r0)     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                if (r0 == 0) goto L35
                com.amap.api.col.3l.c0 r0 = r3.f3059e     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                com.amap.api.col.p0003l.c0.l(r0)     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                com.amap.api.col.3l.f0 r0 = new com.amap.api.col.3l.f0     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                com.amap.api.col.3l.c0 r1 = r3.f3059e     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                android.content.Context r1 = com.amap.api.col.p0003l.c0.o(r1)     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                java.lang.String r2 = com.amap.api.col.p0003l.c0.r     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                java.lang.Object r0 = r0.f()     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                com.amap.api.col.3l.d0 r0 = (com.amap.api.col.p0003l.d0) r0     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                if (r0 == 0) goto L35
                com.amap.api.col.3l.c0 r1 = r3.f3059e     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                com.amap.api.col.p0003l.c0.D(r1)     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                boolean r0 = r0.c()     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                if (r0 == 0) goto L35
                com.amap.api.col.3l.c0 r0 = r3.f3059e     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                r0.p()     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                goto L35
            L33:
                r0 = move-exception
                goto L42
            L35:
                com.amap.api.col.3l.ax r0 = r3.f3058d     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                java.lang.String r1 = com.amap.api.col.p0003l.c0.r     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                r0.setVersion(r1)     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                com.amap.api.col.3l.ax r0 = r3.f3058d     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                r0.y()     // Catch: java.lang.Throwable -> L33 com.amap.api.maps.AMapException -> L49
                return
            L42:
                java.lang.String r1 = "OfflineDownloadManager"
                java.lang.String r2 = "startDownloadRunnable"
                com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            L49:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d {
        void a();

        void a(com.amap.api.col.p0003l.ax r1);

        void b(com.amap.api.col.p0003l.ax r1);

        void c(com.amap.api.col.p0003l.ax r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends android.os.Handler {
        final /* synthetic */ com.amap.api.col.p0003l.c0 a;

        public e(com.amap.api.col.p0003l.c0 r1, android.os.Looper r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r2) {
                r1 = this;
                r2.getData()     // Catch: java.lang.Throwable -> L25
                java.lang.Object r2 = r2.obj     // Catch: java.lang.Throwable -> L25
                boolean r0 = r2 instanceof com.amap.api.col.p0003l.ax     // Catch: java.lang.Throwable -> L25
                if (r0 == 0) goto L25
                com.amap.api.col.3l.ax r2 = (com.amap.api.col.p0003l.ax) r2     // Catch: java.lang.Throwable -> L25
                r2.getCity()     // Catch: java.lang.Throwable -> L25
                r2.getcompleteCode()     // Catch: java.lang.Throwable -> L25
                r2.getState()     // Catch: java.lang.Throwable -> L25
                com.amap.api.col.3l.c0 r0 = r1.a     // Catch: java.lang.Throwable -> L25
                com.amap.api.col.3l.c0$d r0 = com.amap.api.col.p0003l.c0.s(r0)     // Catch: java.lang.Throwable -> L25
                if (r0 == 0) goto L25
                com.amap.api.col.3l.c0 r0 = r1.a     // Catch: java.lang.Throwable -> L25
                com.amap.api.col.3l.c0$d r0 = com.amap.api.col.p0003l.c0.s(r0)     // Catch: java.lang.Throwable -> L25
                r0.a(r2)     // Catch: java.lang.Throwable -> L25
            L25:
                return
        }
    }

    static {
            return
    }

    private c0(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f3043b = r0
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
            r2.f3044c = r1
            r1 = 0
            r2.f3048g = r1
            r2.f3049h = r1
            r2.f3050i = r1
            r2.f3051j = r1
            r2.m = r1
            r2.n = r0
            r2.a = r3
            return
    }

    private void B(com.amap.api.col.p0003l.ax r3) throws com.amap.api.maps.AMapException {
            r2 = this;
            r2.L()
            if (r3 == 0) goto L25
            com.amap.api.col.3l.b8 r0 = r2.f3050i
            if (r0 != 0) goto L11
            java.lang.String r0 = "AMapOfflineDownload"
            com.amap.api.col.3l.b8 r0 = com.amap.api.col.p0003l.a3.b(r0)
            r2.f3050i = r0
        L11:
            com.amap.api.col.3l.b8 r0 = r2.f3050i     // Catch: java.lang.Throwable -> L1c
            com.amap.api.col.3l.c0$c r1 = new com.amap.api.col.3l.c0$c     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L1c
            r0.b(r1)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r3 = move-exception
            java.lang.String r0 = "startDownload"
            java.lang.String r1 = "downloadExcecRunnable"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
            return
        L25:
            com.amap.api.maps.AMapException r3 = new com.amap.api.maps.AMapException
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            r3.<init>(r0)
            throw r3
    }

    static /* synthetic */ boolean D(com.amap.api.col.p0003l.c0 r1) {
            r0 = 0
            r1.f3043b = r0
            return r0
    }

    private void F() {
            r3 = this;
            java.lang.String r0 = "000001"
            com.amap.api.col.3l.s0 r1 = r3.f3047f     // Catch: java.lang.Throwable -> L1a
            com.amap.api.col.3l.n0 r1 = r1.a(r0)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1c
            com.amap.api.col.3l.s0 r2 = r3.f3047f     // Catch: java.lang.Throwable -> L1a
            r2.m(r0)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = "100000"
            r1.b(r0)     // Catch: java.lang.Throwable -> L1a
            com.amap.api.col.3l.s0 r0 = r3.f3047f     // Catch: java.lang.Throwable -> L1a
            r0.e(r1)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r0 = move-exception
            goto L1d
        L1c:
            return
        L1d:
            java.lang.String r1 = "OfflineDownloadManager"
            java.lang.String r2 = "changeBadCase"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            return
    }

    private void G() {
            r3 = this;
            android.content.Context r0 = r3.a
            java.lang.String r0 = com.amap.api.col.p0003l.b3.f0(r0)
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            goto L53
        Lf:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r2 = r3.a
            java.lang.String r2 = com.amap.api.col.p0003l.b3.f0(r2)
            r1.append(r2)
            java.lang.String r2 = "offlinemapv4.png"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L38
            android.content.Context r1 = r3.a
            java.lang.String r1 = com.amap.api.col.p0003l.a1.d(r1, r2)
            goto L3c
        L38:
            java.lang.String r1 = com.amap.api.col.p0003l.a1.n(r0)
        L3c:
            if (r1 == 0) goto L53
            r3.H(r1)     // Catch: org.json.JSONException -> L42
            return
        L42:
            r1 = move-exception
            boolean r2 = r0.exists()
            if (r2 == 0) goto L4c
            r0.delete()
        L4c:
            java.lang.String r0 = "MapDownloadManager"
            java.lang.String r2 = "paseJson io"
            com.amap.api.col.p0003l.w5.p(r1, r0, r2)
        L53:
            return
    }

    private void H(java.lang.String r2) throws org.json.JSONException {
            r1 = this;
            android.content.Context r0 = r1.a
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.util.List r2 = com.amap.api.col.p0003l.a1.f(r2, r0)
            if (r2 == 0) goto L1e
            int r0 = r2.size()
            if (r0 != 0) goto L17
            goto L1e
        L17:
            com.amap.api.col.3l.h0 r0 = r1.f3052k
            if (r0 == 0) goto L1e
            r0.i(r2)
        L1e:
            return
    }

    private com.amap.api.col.p0003l.ax I(java.lang.String r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L3c
            int r1 = r6.length()
            if (r1 > 0) goto La
            goto L3c
        La:
            java.util.List<com.amap.api.col.3l.ax> r1 = r5.f3044c
            monitor-enter(r1)
            java.util.List<com.amap.api.col.3l.ax> r2 = r5.f3044c     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L34
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L38
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L34
            com.amap.api.col.3l.ax r3 = (com.amap.api.col.p0003l.ax) r3     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = r3.getCity()     // Catch: java.lang.Throwable -> L34
            boolean r4 = r6.equals(r4)     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L36
            java.lang.String r4 = r3.getPinyin()     // Catch: java.lang.Throwable -> L34
            boolean r4 = r6.equals(r4)     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L13
            goto L36
        L34:
            r6 = move-exception
            goto L3a
        L36:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            return r3
        L38:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            return r0
        L3a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            throw r6
        L3c:
            return r0
    }

    private void J() {
            r6 = this;
            com.amap.api.col.3l.s0 r0 = r6.f3047f
            java.util.ArrayList r0 = r0.c()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La6
            java.lang.Object r1 = r0.next()
            com.amap.api.col.3l.n0 r1 = (com.amap.api.col.p0003l.n0) r1
            if (r1 == 0) goto La
            java.lang.String r2 = r1.a()
            if (r2 == 0) goto La
            java.lang.String r2 = r1.e()
            int r2 = r2.length()
            if (r2 <= 0) goto La
            int r2 = r1.l
            r3 = 4
            r4 = 7
            if (r2 == r3) goto L35
            if (r2 == r4) goto L35
            if (r2 < 0) goto L35
            r2 = 3
            r1.l = r2
        L35:
            java.lang.String r2 = r1.a()
            com.amap.api.col.3l.ax r2 = r6.I(r2)
            if (r2 == 0) goto La
            java.lang.String r3 = r1.c()
            if (r3 == 0) goto L51
            java.lang.String r5 = com.amap.api.col.p0003l.c0.r
            boolean r3 = n(r5, r3)
            if (r3 == 0) goto L51
            r2.m(r4)
            goto L5d
        L51:
            int r3 = r1.l
            r2.m(r3)
            int r3 = r1.i()
            r2.setCompleteCode(r3)
        L5d:
            java.lang.String r3 = r1.c()
            int r3 = r3.length()
            if (r3 <= 0) goto L6e
            java.lang.String r3 = r1.c()
            r2.setVersion(r3)
        L6e:
            com.amap.api.col.3l.s0 r3 = r6.f3047f
            java.lang.String r1 = r1.e()
            java.util.List r1 = r3.j(r1)
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L81:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L96
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            r3.append(r4)
            java.lang.String r4 = ";"
            r3.append(r4)
            goto L81
        L96:
            java.lang.String r1 = r3.toString()
            r2.p(r1)
            com.amap.api.col.3l.h0 r1 = r6.f3052k
            if (r1 == 0) goto La
            r1.c(r2)
            goto La
        La6:
            return
    }

    private com.amap.api.col.p0003l.ax K(java.lang.String r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L31
            int r1 = r6.length()
            if (r1 > 0) goto La
            goto L31
        La:
            java.util.List<com.amap.api.col.3l.ax> r1 = r5.f3044c
            monitor-enter(r1)
            java.util.List<com.amap.api.col.3l.ax> r2 = r5.f3044c     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2b
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2b
            com.amap.api.col.3l.ax r3 = (com.amap.api.col.p0003l.ax) r3     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r3.getCode()     // Catch: java.lang.Throwable -> L2b
            boolean r4 = r6.equals(r4)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            return r3
        L2b:
            r6 = move-exception
            goto L2f
        L2d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            return r0
        L2f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            throw r6
        L31:
            return r0
    }

    private void L() throws com.amap.api.maps.AMapException {
            r2 = this;
            android.content.Context r0 = r2.a
            boolean r0 = com.amap.api.col.p0003l.b3.h0(r0)
            if (r0 == 0) goto L9
            return
        L9:
            com.amap.api.maps.AMapException r0 = new com.amap.api.maps.AMapException
            java.lang.String r1 = "http连接失败 - ConnectionException"
            r0.<init>(r1)
            throw r0
    }

    private static void M() {
            r0 = 0
            com.amap.api.col.p0003l.c0.q = r0
            r0 = 1
            com.amap.api.col.p0003l.c0.p = r0
            return
    }

    private static void N(java.lang.String r0) {
            com.amap.api.col.p0003l.c0.o = r0
            return
    }

    private void O() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.f3045d = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    static /* synthetic */ com.amap.api.col.p0003l.ax a(com.amap.api.col.p0003l.c0 r0, java.lang.String r1) {
            com.amap.api.col.3l.ax r0 = r0.I(r1)
            return r0
    }

    public static com.amap.api.col.p0003l.c0 b(android.content.Context r2) {
            com.amap.api.col.3l.c0 r0 = com.amap.api.col.p0003l.c0.q
            if (r0 != 0) goto L25
            java.lang.Class<com.amap.api.col.3l.c0> r0 = com.amap.api.col.p0003l.c0.class
            monitor-enter(r0)
            com.amap.api.col.3l.c0 r1 = com.amap.api.col.p0003l.c0.q     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L21
            boolean r1 = com.amap.api.col.p0003l.c0.p     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L21
            com.amap.api.col.3l.c0 r1 = new com.amap.api.col.3l.c0     // Catch: java.lang.Throwable -> L1f
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1f
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L1f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1f
            com.amap.api.col.p0003l.c0.q = r1     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r2 = move-exception
            goto L23
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            goto L25
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r2
        L25:
            com.amap.api.col.3l.c0 r2 = com.amap.api.col.p0003l.c0.q
            return r2
    }

    static /* synthetic */ com.amap.api.col.p0003l.s0 c(com.amap.api.col.p0003l.c0 r0) {
            com.amap.api.col.3l.s0 r0 = r0.f3047f
            return r0
    }

    private void f(com.amap.api.col.p0003l.ax r3, boolean r4) {
            r2 = this;
            com.amap.api.col.3l.j0 r0 = r2.l
            if (r0 != 0) goto Ld
            com.amap.api.col.3l.j0 r0 = new com.amap.api.col.3l.j0
            android.content.Context r1 = r2.a
            r0.<init>(r1)
            r2.l = r0
        Ld:
            com.amap.api.col.3l.b8 r0 = r2.f3049h
            if (r0 != 0) goto L19
            java.lang.String r0 = "AMapOfflineRemove"
            com.amap.api.col.3l.b8 r0 = com.amap.api.col.p0003l.a3.b(r0)
            r2.f3049h = r0
        L19:
            com.amap.api.col.3l.b8 r0 = r2.f3049h     // Catch: java.lang.Throwable -> L24
            com.amap.api.col.3l.c0$b r1 = new com.amap.api.col.3l.c0$b     // Catch: java.lang.Throwable -> L24
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L24
            r0.b(r1)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r3 = move-exception
            java.lang.String r4 = "requestDelete"
            java.lang.String r0 = "removeExcecRunnable"
            com.amap.api.col.p0003l.w5.p(r3, r4, r0)
            return
    }

    static /* synthetic */ boolean i(java.lang.String r0, java.lang.String r1) {
            boolean r0 = n(r0, r1)
            return r0
    }

    static /* synthetic */ void l(com.amap.api.col.p0003l.c0 r0) throws com.amap.api.maps.AMapException {
            r0.L()
            return
    }

    private static boolean n(java.lang.String r4, java.lang.String r5) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r5.length()     // Catch: java.lang.Throwable -> L22
            if (r1 >= r2) goto L22
            char r2 = r4.charAt(r1)     // Catch: java.lang.Throwable -> L22
            char r3 = r5.charAt(r1)     // Catch: java.lang.Throwable -> L22
            if (r2 <= r3) goto L14
            r4 = 1
            return r4
        L14:
            char r2 = r4.charAt(r1)     // Catch: java.lang.Throwable -> L22
            char r3 = r5.charAt(r1)     // Catch: java.lang.Throwable -> L22
            if (r2 >= r3) goto L1f
            return r0
        L1f:
            int r1 = r1 + 1
            goto L2
        L22:
            return r0
    }

    static /* synthetic */ android.content.Context o(com.amap.api.col.p0003l.c0 r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* synthetic */ com.amap.api.col.3l.c0.d s(com.amap.api.col.p0003l.c0 r0) {
            com.amap.api.col.3l.c0$d r0 = r0.f3045d
            return r0
    }

    static /* synthetic */ boolean z(com.amap.api.col.p0003l.c0 r0) {
            boolean r0 = r0.f3043b
            return r0
    }

    public final void A() {
            r2 = this;
            com.amap.api.col.3l.b8 r0 = r2.f3048g
            if (r0 == 0) goto L7
            r0.g()
        L7:
            com.amap.api.col.3l.b8 r0 = r2.f3050i
            r1 = 0
            if (r0 == 0) goto L11
            r0.g()
            r2.f3050i = r1
        L11:
            com.amap.api.col.3l.g0 r0 = r2.m
            if (r0 == 0) goto L22
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L20
            com.amap.api.col.3l.g0 r0 = r2.m
            r0.interrupt()
        L20:
            r2.m = r1
        L22:
            com.amap.api.col.3l.c0$e r0 = r2.f3051j
            if (r0 == 0) goto L2b
            r0.removeCallbacksAndMessages(r1)
            r2.f3051j = r1
        L2b:
            com.amap.api.col.3l.m0 r0 = r2.f3046e
            if (r0 == 0) goto L34
            r0.d()
            r2.f3046e = r1
        L34:
            com.amap.api.col.3l.h0 r0 = r2.f3052k
            if (r0 == 0) goto L3b
            r0.w()
        L3b:
            M()
            r0 = 1
            r2.f3043b = r0
            r2.O()
            return
    }

    public final void C(java.lang.String r2) throws com.amap.api.maps.AMapException {
            r1 = this;
            com.amap.api.col.3l.ax r2 = r1.K(r2)
            if (r2 == 0) goto La
            r1.B(r2)
            return
        La:
            com.amap.api.maps.AMapException r2 = new com.amap.api.maps.AMapException
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            r2.<init>(r0)
            throw r2
    }

    public final java.lang.String E(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L3
            goto L9
        L3:
            com.amap.api.col.3l.ax r1 = r0.I(r1)
            if (r1 != 0) goto Lc
        L9:
            java.lang.String r1 = ""
            return r1
        Lc:
            java.lang.String r1 = r1.getAdcode()
            return r1
    }

    public final void d() {
            r7 = this;
            android.content.Context r0 = r7.a
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            com.amap.api.col.3l.s0 r0 = com.amap.api.col.p0003l.s0.b(r0)
            r7.f3047f = r0
            r7.F()
            android.content.Context r0 = r7.a
            android.os.Looper r0 = r0.getMainLooper()
            com.amap.api.col.3l.c0$e r1 = new com.amap.api.col.3l.c0$e
            r1.<init>(r7, r0)
            r7.f3051j = r1
            com.amap.api.col.3l.h0 r0 = new com.amap.api.col.3l.h0
            android.content.Context r1 = r7.a
            r0.<init>(r1)
            r7.f3052k = r0
            com.amap.api.col.3l.m0 r0 = com.amap.api.col.p0003l.m0.a()
            r7.f3046e = r0
            android.content.Context r0 = r7.a
            java.lang.String r0 = com.amap.api.col.p0003l.b3.f0(r0)
            N(r0)
            r7.G()     // Catch: java.lang.Throwable -> L3b
        L3b:
            java.util.List<com.amap.api.col.3l.ax> r0 = r7.f3044c
            monitor-enter(r0)
            com.amap.api.col.3l.h0 r1 = r7.f3052k     // Catch: java.lang.Throwable -> L77
            java.util.ArrayList r1 = r1.b()     // Catch: java.lang.Throwable -> L77
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L77
        L48:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L77
            if (r2 == 0) goto L79
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L77
            com.amap.api.maps.offlinemap.OfflineMapProvince r2 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r2     // Catch: java.lang.Throwable -> L77
            java.util.ArrayList r2 = r2.getCityList()     // Catch: java.lang.Throwable -> L77
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L77
        L5c:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L77
            if (r3 == 0) goto L48
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L77
            com.amap.api.maps.offlinemap.OfflineMapCity r3 = (com.amap.api.maps.offlinemap.OfflineMapCity) r3     // Catch: java.lang.Throwable -> L77
            if (r3 == 0) goto L5c
            java.util.List<com.amap.api.col.3l.ax> r4 = r7.f3044c     // Catch: java.lang.Throwable -> L77
            com.amap.api.col.3l.ax r5 = new com.amap.api.col.3l.ax     // Catch: java.lang.Throwable -> L77
            android.content.Context r6 = r7.a     // Catch: java.lang.Throwable -> L77
            r5.<init>(r6, r3)     // Catch: java.lang.Throwable -> L77
            r4.add(r5)     // Catch: java.lang.Throwable -> L77
            goto L5c
        L77:
            r1 = move-exception
            goto L87
        L79:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
            com.amap.api.col.3l.g0 r0 = new com.amap.api.col.3l.g0
            android.content.Context r1 = r7.a
            r0.<init>(r1)
            r7.m = r0
            r0.start()
            return
        L87:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
            throw r1
    }

    public final void e(com.amap.api.col.p0003l.ax r2) {
            r1 = this;
            r0 = 0
            r1.f(r2, r0)
            return
    }

    public final void g(com.amap.api.col.3l.c0.d r1) {
            r0 = this;
            r0.f3045d = r1
            return
    }

    public final void h(java.lang.String r3) {
            r2 = this;
            if (r3 != 0) goto Le
            com.amap.api.col.3l.c0$d r3 = r2.f3045d     // Catch: java.lang.Throwable -> Lb
            if (r3 == 0) goto Ld
            r0 = 0
            r3.b(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r3 = move-exception
            goto L25
        Ld:
            return
        Le:
            com.amap.api.col.3l.b8 r0 = r2.f3048g     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto L1a
            java.lang.String r0 = "AMapOfflineCheckUpdate"
            com.amap.api.col.3l.b8 r0 = com.amap.api.col.p0003l.a3.b(r0)     // Catch: java.lang.Throwable -> Lb
            r2.f3048g = r0     // Catch: java.lang.Throwable -> Lb
        L1a:
            com.amap.api.col.3l.b8 r0 = r2.f3048g     // Catch: java.lang.Throwable -> Lb
            com.amap.api.col.3l.c0$a r1 = new com.amap.api.col.3l.c0$a     // Catch: java.lang.Throwable -> Lb
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lb
            r0.b(r1)     // Catch: java.lang.Throwable -> Lb
            return
        L25:
            java.lang.String r0 = "OfflineDownloadManager"
            java.lang.String r1 = "checkUpdate"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
            return
    }

    public final void j() {
            r3 = this;
            r3.J()
            com.amap.api.col.3l.c0$d r0 = r3.f3045d
            if (r0 == 0) goto L13
            r0.a()     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r0 = move-exception
            java.lang.String r1 = "OfflineDownloadManager"
            java.lang.String r2 = "verifyCallBack"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
        L13:
            return
    }

    public final void k(com.amap.api.col.p0003l.ax r3) {
            r2 = this;
            com.amap.api.col.3l.m0 r0 = r2.f3046e     // Catch: com.amap.api.col.p0003l.fk -> L9
            if (r0 == 0) goto L9
            android.content.Context r1 = r2.a     // Catch: com.amap.api.col.p0003l.fk -> L9
            r0.c(r3, r1)     // Catch: com.amap.api.col.p0003l.fk -> L9
        L9:
            return
    }

    public final boolean m(java.lang.String r1) {
            r0 = this;
            com.amap.api.col.3l.ax r1 = r0.I(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r1 = 1
            return r1
    }

    protected final void p() throws com.amap.api.maps.AMapException {
            r9 = this;
            com.amap.api.col.3l.h0 r0 = r9.f3052k
            if (r0 != 0) goto L6
            goto Lde
        L6:
            com.amap.api.col.3l.k0 r0 = new com.amap.api.col.3l.k0
            android.content.Context r1 = r9.a
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            android.content.Context r1 = r9.a
            r0.h(r1)
            java.lang.Object r0 = r0.f()
            java.util.List r0 = (java.util.List) r0
            java.util.List<com.amap.api.col.3l.ax> r1 = r9.f3044c
            if (r1 == 0) goto L23
            com.amap.api.col.3l.h0 r1 = r9.f3052k
            r1.i(r0)
        L23:
            java.util.List<com.amap.api.col.3l.ax> r0 = r9.f3044c
            if (r0 == 0) goto Lde
            monitor-enter(r0)
            com.amap.api.col.3l.h0 r1 = r9.f3052k     // Catch: java.lang.Throwable -> L9b
            java.util.ArrayList r1 = r1.b()     // Catch: java.lang.Throwable -> L9b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L9b
        L32:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L9b
            if (r2 == 0) goto Lda
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L9b
            com.amap.api.maps.offlinemap.OfflineMapProvince r2 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r2     // Catch: java.lang.Throwable -> L9b
            java.util.ArrayList r2 = r2.getCityList()     // Catch: java.lang.Throwable -> L9b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L9b
        L46:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L9b
            if (r3 == 0) goto L32
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L9b
            com.amap.api.maps.offlinemap.OfflineMapCity r3 = (com.amap.api.maps.offlinemap.OfflineMapCity) r3     // Catch: java.lang.Throwable -> L9b
            java.util.List<com.amap.api.col.3l.ax> r4 = r9.f3044c     // Catch: java.lang.Throwable -> L9b
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L9b
        L58:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L9b
            if (r5 == 0) goto L46
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L9b
            com.amap.api.col.3l.ax r5 = (com.amap.api.col.p0003l.ax) r5     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = r3.getPinyin()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r7 = r5.getPinyin()     // Catch: java.lang.Throwable -> L9b
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L9b
            if (r6 == 0) goto L58
            java.lang.String r6 = r5.getVersion()     // Catch: java.lang.Throwable -> L9b
            int r7 = r5.getState()     // Catch: java.lang.Throwable -> L9b
            r8 = 4
            if (r7 != r8) goto L9d
            java.lang.String r7 = com.amap.api.col.p0003l.c0.r     // Catch: java.lang.Throwable -> L9b
            int r7 = r7.length()     // Catch: java.lang.Throwable -> L9b
            if (r7 <= 0) goto L9d
            java.lang.String r7 = com.amap.api.col.p0003l.c0.r     // Catch: java.lang.Throwable -> L9b
            boolean r6 = n(r7, r6)     // Catch: java.lang.Throwable -> L9b
            if (r6 == 0) goto L9d
            r5.C()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = r3.getUrl()     // Catch: java.lang.Throwable -> L9b
            r5.setUrl(r6)     // Catch: java.lang.Throwable -> L9b
            r5.F()     // Catch: java.lang.Throwable -> L9b
            goto L58
        L9b:
            r1 = move-exception
            goto Ldc
        L9d:
            java.lang.String r6 = r3.getCity()     // Catch: java.lang.Throwable -> L9b
            r5.setCity(r6)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = r3.getUrl()     // Catch: java.lang.Throwable -> L9b
            r5.setUrl(r6)     // Catch: java.lang.Throwable -> L9b
            r5.F()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = r3.getAdcode()     // Catch: java.lang.Throwable -> L9b
            r5.setAdcode(r6)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = r3.getVersion()     // Catch: java.lang.Throwable -> L9b
            r5.setVersion(r6)     // Catch: java.lang.Throwable -> L9b
            long r6 = r3.getSize()     // Catch: java.lang.Throwable -> L9b
            r5.setSize(r6)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = r3.getCode()     // Catch: java.lang.Throwable -> L9b
            r5.setCode(r6)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = r3.getJianpin()     // Catch: java.lang.Throwable -> L9b
            r5.setJianpin(r6)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = r3.getPinyin()     // Catch: java.lang.Throwable -> L9b
            r5.setPinyin(r6)     // Catch: java.lang.Throwable -> L9b
            goto L58
        Lda:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            return
        Ldc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            throw r1
        Lde:
            return
    }

    public final void q(com.amap.api.col.p0003l.ax r2) {
            r1 = this;
            com.amap.api.col.3l.h0 r0 = r1.f3052k
            if (r0 == 0) goto L7
            r0.c(r2)
        L7:
            com.amap.api.col.3l.c0$e r0 = r1.f3051j
            if (r0 == 0) goto L16
            android.os.Message r0 = r0.obtainMessage()
            r0.obj = r2
            com.amap.api.col.3l.c0$e r2 = r1.f3051j
            r2.sendMessage(r0)
        L16:
            return
    }

    public final void r(java.lang.String r3) {
            r2 = this;
            com.amap.api.col.3l.ax r3 = r2.I(r3)
            if (r3 != 0) goto L17
            com.amap.api.col.3l.c0$d r0 = r2.f3045d
            if (r0 == 0) goto L16
            r0.c(r3)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r3 = move-exception
            java.lang.String r0 = "OfflineDownloadManager"
            java.lang.String r1 = "remove"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
        L16:
            return
        L17:
            r2.u(r3)
            r0 = 1
            r2.f(r3, r0)
            return
    }

    public final void t() {
            r5 = this;
            java.util.List<com.amap.api.col.3l.ax> r0 = r5.f3044c
            monitor-enter(r0)
            java.util.List<com.amap.api.col.3l.ax> r1 = r5.f3044c     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2e
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2e
            com.amap.api.col.3l.ax r2 = (com.amap.api.col.p0003l.ax) r2     // Catch: java.lang.Throwable -> L2e
            com.amap.api.col.3l.g1 r3 = r2.s()     // Catch: java.lang.Throwable -> L2e
            com.amap.api.col.3l.g1 r4 = r2.f2987h     // Catch: java.lang.Throwable -> L2e
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L30
            com.amap.api.col.3l.g1 r3 = r2.s()     // Catch: java.lang.Throwable -> L2e
            com.amap.api.col.3l.g1 r4 = r2.f2986g     // Catch: java.lang.Throwable -> L2e
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L9
            goto L30
        L2e:
            r1 = move-exception
            goto L39
        L30:
            r5.u(r2)     // Catch: java.lang.Throwable -> L2e
            r2.z()     // Catch: java.lang.Throwable -> L2e
            goto L9
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            return
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r1
    }

    public final void u(com.amap.api.col.p0003l.ax r2) {
            r1 = this;
            com.amap.api.col.3l.m0 r0 = r1.f3046e
            if (r0 == 0) goto L7
            r0.b(r2)
        L7:
            return
    }

    public final void v(java.lang.String r1) {
            r0 = this;
            com.amap.api.col.3l.ax r1 = r0.I(r1)
            if (r1 == 0) goto L9
            r1.y()
        L9:
            return
    }

    public final void w() {
            r5 = this;
            java.util.List<com.amap.api.col.3l.ax> r0 = r5.f3044c
            monitor-enter(r0)
            java.util.List<com.amap.api.col.3l.ax> r1 = r5.f3044c     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L25
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L25
            com.amap.api.col.3l.ax r2 = (com.amap.api.col.p0003l.ax) r2     // Catch: java.lang.Throwable -> L25
            com.amap.api.col.3l.g1 r3 = r2.s()     // Catch: java.lang.Throwable -> L25
            com.amap.api.col.3l.g1 r4 = r2.f2987h     // Catch: java.lang.Throwable -> L25
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L9
            r2.z()     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r1 = move-exception
            goto L29
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r1
    }

    public final void x(com.amap.api.col.p0003l.ax r2) {
            r1 = this;
            com.amap.api.col.3l.m0 r0 = r1.f3046e
            if (r0 == 0) goto L7
            r0.e(r2)
        L7:
            return
    }

    public final void y(java.lang.String r2) throws com.amap.api.maps.AMapException {
            r1 = this;
            com.amap.api.col.3l.ax r0 = r1.I(r2)
            if (r2 == 0) goto L12
            int r2 = r2.length()
            if (r2 <= 0) goto L12
            if (r0 == 0) goto L12
            r1.B(r0)
            return
        L12:
            com.amap.api.maps.AMapException r2 = new com.amap.api.maps.AMapException
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            r2.<init>(r0)
            throw r2
    }
}
