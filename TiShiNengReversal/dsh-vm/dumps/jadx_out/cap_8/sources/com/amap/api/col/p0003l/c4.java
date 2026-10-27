package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class c4 implements com.amap.api.maps.LocationSource.OnLocationChangedListener, com.amap.api.trace.LBSTraceBase {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.maps.CoordinateConverter f3069b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.col.p0003l.b8 f3070c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.col.p0003l.b8 f3071d;

    /* renamed from: e, reason: collision with root package name */
    private long f3072e;

    /* renamed from: f, reason: collision with root package name */
    private int f3073f;

    /* renamed from: g, reason: collision with root package name */
    private com.amap.api.trace.TraceStatusListener f3074g;

    /* renamed from: h, reason: collision with root package name */
    private com.amap.api.col.p0003l.b0 f3075h;

    /* renamed from: i, reason: collision with root package name */
    private java.util.List<com.amap.api.trace.TraceLocation> f3076i;

    /* renamed from: j, reason: collision with root package name */
    private int f3077j;

    /* renamed from: k, reason: collision with root package name */
    private int f3078k;
    private long l;
    private com.amap.api.col.3l.c4.c m;
    private com.amap.api.trace.TraceLocation n;
    private java.util.List<com.amap.api.maps.model.LatLng> o;
    private java.util.List<com.amap.api.maps.model.LatLng> p;
    private java.util.List<com.amap.api.maps.model.LatLng> q;
    int r;
    private java.util.concurrent.BlockingQueue<java.lang.Runnable> s;
    private java.util.concurrent.BlockingQueue<java.lang.Runnable> t;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends com.amap.api.col.p0003l.c8 {

        /* renamed from: d, reason: collision with root package name */
        private java.util.List<com.amap.api.trace.TraceLocation> f3079d;

        /* renamed from: e, reason: collision with root package name */
        private int f3080e;

        /* renamed from: g, reason: collision with root package name */
        private int f3081g;

        /* renamed from: h, reason: collision with root package name */
        private java.util.List<com.amap.api.trace.TraceLocation> f3082h;

        /* renamed from: i, reason: collision with root package name */
        private java.lang.String f3083i;

        /* renamed from: j, reason: collision with root package name */
        private com.amap.api.trace.TraceListener f3084j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.c4 f3085k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.amap.api.col.3l.c4$a$a, reason: collision with other inner class name */
        final class C0086a extends com.amap.api.col.p0003l.c8 {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ com.amap.api.col.p0003l.b4 f3086d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ com.amap.api.col.3l.c4.a f3087e;

            C0086a(com.amap.api.col.3l.c4.a r1, com.amap.api.col.p0003l.b4 r2) {
                    r0 = this;
                    r0.f3087e = r1
                    r0.f3086d = r2
                    r0.<init>()
                    return
            }

            @Override // com.amap.api.col.p0003l.c8
            public final void runTask() {
                    r1 = this;
                    com.amap.api.col.3l.b4 r0 = r1.f3086d
                    r0.run()
                    return
            }
        }

        public a(com.amap.api.col.p0003l.c4 r1, int r2, java.util.List<com.amap.api.trace.TraceLocation> r3, int r4, com.amap.api.trace.TraceListener r5) {
                r0 = this;
                r0.f3085k = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f3079d = r1
                r0.f3080e = r4
                r0.f3081g = r2
                r0.f3082h = r3
                java.lang.String r1 = com.amap.api.col.p0003l.t2.a()
                r0.f3083i = r1
                r0.f3084j = r5
                return
        }

        private int d() {
                r9 = this;
                java.util.List<com.amap.api.trace.TraceLocation> r0 = r9.f3082h
                r1 = 0
                if (r0 == 0) goto L40
                int r0 = r0.size()
                if (r0 != 0) goto Lc
                goto L40
            Lc:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List<com.amap.api.trace.TraceLocation> r2 = r9.f3082h
                java.util.Iterator r2 = r2.iterator()
            L17:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L40
                java.lang.Object r3 = r2.next()
                com.amap.api.trace.TraceLocation r3 = (com.amap.api.trace.TraceLocation) r3
                if (r3 == 0) goto L17
                float r4 = r3.getSpeed()
                double r4 = (double) r4
                r6 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 >= 0) goto L37
                r0.add(r3)
                goto L17
            L37:
                int r3 = e(r0)
                int r1 = r1 + r3
                r0.clear()
                goto L17
            L40:
                return r1
        }

        private static int e(java.util.List<com.amap.api.trace.TraceLocation> r4) {
                int r0 = r4.size()
                r1 = 0
                r2 = 1
                if (r0 > r2) goto L9
                return r1
            L9:
                java.lang.Object r3 = r4.get(r1)
                com.amap.api.trace.TraceLocation r3 = (com.amap.api.trace.TraceLocation) r3
                int r0 = r0 - r2
                java.lang.Object r4 = r4.get(r0)
                com.amap.api.trace.TraceLocation r4 = (com.amap.api.trace.TraceLocation) r4
                if (r3 == 0) goto L29
                if (r4 != 0) goto L1b
                goto L29
            L1b:
                long r0 = r4.getTime()
                long r2 = r3.getTime()
                long r0 = r0 - r2
                r2 = 1000(0x3e8, double:4.94E-321)
                long r0 = r0 / r2
                int r4 = (int) r0
                return r4
            L29:
                return r1
        }

        @Override // com.amap.api.col.p0003l.c8
        public final void runTask() {
                r14 = this;
                com.amap.api.col.3l.c4 r0 = r14.f3085k     // Catch: java.lang.Throwable -> L120
                com.amap.api.col.3l.c4$c r0 = com.amap.api.col.p0003l.c4.m(r0)     // Catch: java.lang.Throwable -> L120
                com.amap.api.trace.TraceListener r1 = r14.f3084j     // Catch: java.lang.Throwable -> L120
                r0.a(r1)     // Catch: java.lang.Throwable -> L120
                int r0 = r14.d()     // Catch: java.lang.Throwable -> L120
                java.util.List<com.amap.api.trace.TraceLocation> r1 = r14.f3082h     // Catch: java.lang.Throwable -> L120
                if (r1 == 0) goto L110
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L120
                r2 = 2
                if (r1 >= r2) goto L1c
                goto L110
            L1c:
                java.util.List<com.amap.api.trace.TraceLocation> r1 = r14.f3082h     // Catch: java.lang.Throwable -> L120
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L120
            L22:
                boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L120
                if (r3 == 0) goto L4c
                java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L120
                com.amap.api.trace.TraceLocation r3 = (com.amap.api.trace.TraceLocation) r3     // Catch: java.lang.Throwable -> L120
                com.amap.api.trace.TraceLocation r3 = r3.copy()     // Catch: java.lang.Throwable -> L120
                if (r3 == 0) goto L22
                double r4 = r3.getLatitude()     // Catch: java.lang.Throwable -> L120
                r6 = 0
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 <= 0) goto L22
                double r4 = r3.getLongitude()     // Catch: java.lang.Throwable -> L120
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 <= 0) goto L22
                java.util.List<com.amap.api.trace.TraceLocation> r4 = r14.f3079d     // Catch: java.lang.Throwable -> L120
                r4.add(r3)     // Catch: java.lang.Throwable -> L120
                goto L22
            L4c:
                java.util.List<com.amap.api.trace.TraceLocation> r1 = r14.f3079d     // Catch: java.lang.Throwable -> L120
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L120
                int r1 = r1 - r2
                r3 = 500(0x1f4, float:7.0E-43)
                int r1 = r1 / r3
                com.amap.api.col.3l.d4 r4 = com.amap.api.col.p0003l.d4.b()     // Catch: java.lang.Throwable -> L120
                java.lang.String r5 = r14.f3083i     // Catch: java.lang.Throwable -> L120
                int r6 = r14.f3081g     // Catch: java.lang.Throwable -> L120
                r4.d(r5, r6, r1, r0)     // Catch: java.lang.Throwable -> L120
                r0 = 0
                r4 = 500(0x1f4, float:7.0E-43)
                r10 = 0
            L65:
                if (r10 > r1) goto L120
                if (r10 != r1) goto L6f
                java.util.List<com.amap.api.trace.TraceLocation> r4 = r14.f3079d     // Catch: java.lang.Throwable -> L120
                int r4 = r4.size()     // Catch: java.lang.Throwable -> L120
            L6f:
                r11 = r4
                java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L120
                r7.<init>()     // Catch: java.lang.Throwable -> L120
                r4 = 0
            L76:
                if (r4 >= r11) goto Ld5
                java.util.List<com.amap.api.trace.TraceLocation> r5 = r14.f3079d     // Catch: java.lang.Throwable -> L120
                java.lang.Object r5 = r5.remove(r0)     // Catch: java.lang.Throwable -> L120
                com.amap.api.trace.TraceLocation r5 = (com.amap.api.trace.TraceLocation) r5     // Catch: java.lang.Throwable -> L120
                if (r5 == 0) goto Ld2
                int r6 = r14.f3080e     // Catch: java.lang.Throwable -> L120
                r8 = 1
                if (r6 == r8) goto Lcf
                r8 = 3
                if (r6 != r8) goto L96
                com.amap.api.col.3l.c4 r6 = r14.f3085k     // Catch: java.lang.Throwable -> L120
                com.amap.api.maps.CoordinateConverter r6 = com.amap.api.col.p0003l.c4.n(r6)     // Catch: java.lang.Throwable -> L120
                com.amap.api.maps.CoordinateConverter$CoordType r8 = com.amap.api.maps.CoordinateConverter.CoordType.BAIDU     // Catch: java.lang.Throwable -> L120
                r6.from(r8)     // Catch: java.lang.Throwable -> L120
                goto La3
            L96:
                if (r6 != r2) goto La3
                com.amap.api.col.3l.c4 r6 = r14.f3085k     // Catch: java.lang.Throwable -> L120
                com.amap.api.maps.CoordinateConverter r6 = com.amap.api.col.p0003l.c4.n(r6)     // Catch: java.lang.Throwable -> L120
                com.amap.api.maps.CoordinateConverter$CoordType r8 = com.amap.api.maps.CoordinateConverter.CoordType.GPS     // Catch: java.lang.Throwable -> L120
                r6.from(r8)     // Catch: java.lang.Throwable -> L120
            La3:
                com.amap.api.maps.model.LatLng r6 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L120
                double r8 = r5.getLatitude()     // Catch: java.lang.Throwable -> L120
                double r12 = r5.getLongitude()     // Catch: java.lang.Throwable -> L120
                r6.<init>(r8, r12)     // Catch: java.lang.Throwable -> L120
                com.amap.api.col.3l.c4 r8 = r14.f3085k     // Catch: java.lang.Throwable -> L120
                com.amap.api.maps.CoordinateConverter r8 = com.amap.api.col.p0003l.c4.n(r8)     // Catch: java.lang.Throwable -> L120
                r8.coord(r6)     // Catch: java.lang.Throwable -> L120
                com.amap.api.col.3l.c4 r6 = r14.f3085k     // Catch: java.lang.Throwable -> L120
                com.amap.api.maps.CoordinateConverter r6 = com.amap.api.col.p0003l.c4.n(r6)     // Catch: java.lang.Throwable -> L120
                com.amap.api.maps.model.LatLng r6 = r6.convert()     // Catch: java.lang.Throwable -> L120
                if (r6 == 0) goto Lcf
                double r8 = r6.latitude     // Catch: java.lang.Throwable -> L120
                r5.setLatitude(r8)     // Catch: java.lang.Throwable -> L120
                double r8 = r6.longitude     // Catch: java.lang.Throwable -> L120
                r5.setLongitude(r8)     // Catch: java.lang.Throwable -> L120
            Lcf:
                r7.add(r5)     // Catch: java.lang.Throwable -> L120
            Ld2:
                int r4 = r4 + 1
                goto L76
            Ld5:
                int r4 = r7.size()     // Catch: java.lang.Throwable -> L120
                if (r4 < r2) goto L10d
                int r4 = r7.size()     // Catch: java.lang.Throwable -> L120
                if (r4 > r3) goto L10d
                com.amap.api.col.3l.b4 r4 = new com.amap.api.col.3l.b4     // Catch: java.lang.Throwable -> L120
                com.amap.api.col.3l.c4 r5 = r14.f3085k     // Catch: java.lang.Throwable -> L120
                android.content.Context r5 = com.amap.api.col.p0003l.c4.o(r5)     // Catch: java.lang.Throwable -> L120
                com.amap.api.col.3l.c4 r6 = r14.f3085k     // Catch: java.lang.Throwable -> L120
                com.amap.api.col.3l.c4$c r6 = com.amap.api.col.p0003l.c4.m(r6)     // Catch: java.lang.Throwable -> L120
                java.lang.String r8 = r14.f3083i     // Catch: java.lang.Throwable -> L120
                int r9 = r14.f3081g     // Catch: java.lang.Throwable -> L120
                r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L120
                com.amap.api.col.3l.c4 r5 = r14.f3085k     // Catch: java.lang.Throwable -> L120
                com.amap.api.col.3l.b8 r5 = com.amap.api.col.p0003l.c4.p(r5)     // Catch: java.lang.Throwable -> L120
                com.amap.api.col.3l.c4$a$a r6 = new com.amap.api.col.3l.c4$a$a     // Catch: java.lang.Throwable -> L120
                r6.<init>(r14, r4)     // Catch: java.lang.Throwable -> L120
                r5.b(r6)     // Catch: java.lang.Throwable -> L120
                int r10 = r10 + 1
                r4 = 50
                java.lang.Thread.sleep(r4)     // Catch: java.lang.InterruptedException -> L10c java.lang.Throwable -> L120
                goto L10d
            L10c:
            L10d:
                r4 = r11
                goto L65
            L110:
                com.amap.api.col.p0003l.d4.b()     // Catch: java.lang.Throwable -> L120
                com.amap.api.col.3l.c4 r0 = r14.f3085k     // Catch: java.lang.Throwable -> L120
                com.amap.api.col.3l.c4$c r0 = com.amap.api.col.p0003l.c4.m(r0)     // Catch: java.lang.Throwable -> L120
                int r1 = r14.f3081g     // Catch: java.lang.Throwable -> L120
                java.lang.String r2 = "轨迹点太少或距离太近,轨迹纠偏失败"
                com.amap.api.col.p0003l.d4.c(r0, r1, r2)     // Catch: java.lang.Throwable -> L120
            L120:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements com.amap.api.trace.TraceListener {
        private final java.util.List<com.amap.api.trace.TraceLocation> a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.c4 f3088b;

        public b(com.amap.api.col.p0003l.c4 r1, java.util.List<com.amap.api.trace.TraceLocation> r2) {
                r0 = this;
                r0.f3088b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        private void a(int r3, java.util.List<com.amap.api.maps.model.LatLng> r4) {
                r2 = this;
                com.amap.api.col.3l.c4 r0 = r2.f3088b     // Catch: java.lang.Throwable -> L6e
                java.util.List r0 = com.amap.api.col.p0003l.c4.b(r0)     // Catch: java.lang.Throwable -> L6e
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L6e
                com.amap.api.col.3l.c4 r1 = r2.f3088b     // Catch: java.lang.Throwable -> L6b
                java.util.List r1 = com.amap.api.col.p0003l.c4.b(r1)     // Catch: java.lang.Throwable -> L6b
                r1.clear()     // Catch: java.lang.Throwable -> L6b
                com.amap.api.col.3l.c4 r1 = r2.f3088b     // Catch: java.lang.Throwable -> L6b
                java.util.List r1 = com.amap.api.col.p0003l.c4.b(r1)     // Catch: java.lang.Throwable -> L6b
                r1.addAll(r4)     // Catch: java.lang.Throwable -> L6b
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
                com.amap.api.col.3l.c4 r4 = r2.f3088b     // Catch: java.lang.Throwable -> L6e
                java.util.List r4 = com.amap.api.col.p0003l.c4.h(r4)     // Catch: java.lang.Throwable -> L6e
                r4.clear()     // Catch: java.lang.Throwable -> L6e
                if (r3 != 0) goto L35
                com.amap.api.col.3l.c4 r3 = r2.f3088b     // Catch: java.lang.Throwable -> L6e
                java.util.List r3 = com.amap.api.col.p0003l.c4.h(r3)     // Catch: java.lang.Throwable -> L6e
                com.amap.api.col.3l.c4 r4 = r2.f3088b     // Catch: java.lang.Throwable -> L6e
                java.util.List r4 = com.amap.api.col.p0003l.c4.b(r4)     // Catch: java.lang.Throwable -> L6e
                r3.addAll(r4)     // Catch: java.lang.Throwable -> L6e
                goto L53
            L35:
                com.amap.api.col.3l.c4 r3 = r2.f3088b     // Catch: java.lang.Throwable -> L6e
                java.util.List r3 = com.amap.api.col.p0003l.c4.h(r3)     // Catch: java.lang.Throwable -> L6e
                com.amap.api.col.3l.c4 r4 = r2.f3088b     // Catch: java.lang.Throwable -> L6e
                java.util.List r4 = com.amap.api.col.p0003l.c4.j(r4)     // Catch: java.lang.Throwable -> L6e
                r3.addAll(r4)     // Catch: java.lang.Throwable -> L6e
                com.amap.api.col.3l.c4 r3 = r2.f3088b     // Catch: java.lang.Throwable -> L6e
                java.util.List r3 = com.amap.api.col.p0003l.c4.h(r3)     // Catch: java.lang.Throwable -> L6e
                com.amap.api.col.3l.c4 r4 = r2.f3088b     // Catch: java.lang.Throwable -> L6e
                java.util.List r4 = com.amap.api.col.p0003l.c4.b(r4)     // Catch: java.lang.Throwable -> L6e
                r3.addAll(r4)     // Catch: java.lang.Throwable -> L6e
            L53:
                com.amap.api.col.3l.c4 r3 = r2.f3088b     // Catch: java.lang.Throwable -> L6e
                com.amap.api.trace.TraceStatusListener r3 = com.amap.api.col.p0003l.c4.l(r3)     // Catch: java.lang.Throwable -> L6e
                com.amap.api.col.3l.c4 r4 = r2.f3088b     // Catch: java.lang.Throwable -> L6e
                java.util.List r4 = com.amap.api.col.p0003l.c4.k(r4)     // Catch: java.lang.Throwable -> L6e
                com.amap.api.col.3l.c4 r0 = r2.f3088b     // Catch: java.lang.Throwable -> L6e
                java.util.List r0 = com.amap.api.col.p0003l.c4.h(r0)     // Catch: java.lang.Throwable -> L6e
                java.lang.String r1 = "纠偏成功"
                r3.onTraceStatus(r4, r0, r1)     // Catch: java.lang.Throwable -> L6e
                return
            L6b:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
                throw r3     // Catch: java.lang.Throwable -> L6e
            L6e:
                return
        }

        @Override // com.amap.api.trace.TraceListener
        public final void onFinished(int r1, java.util.List<com.amap.api.maps.model.LatLng> r2, int r3, int r4) {
                r0 = this;
                r0.a(r1, r2)
                return
        }

        @Override // com.amap.api.trace.TraceListener
        public final void onRequestFailed(int r9, java.lang.String r10) {
                r8 = this;
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                com.amap.api.col.3l.c4 r0 = r8.f3088b
                java.util.List r0 = com.amap.api.col.p0003l.c4.b(r0)
                if (r0 == 0) goto L16
                com.amap.api.col.3l.c4 r0 = r8.f3088b
                java.util.List r0 = com.amap.api.col.p0003l.c4.b(r0)
                r10.addAll(r0)
            L16:
                java.util.List<com.amap.api.trace.TraceLocation> r0 = r8.a
                if (r0 == 0) goto L53
                int r0 = r0.size()
                java.util.List<com.amap.api.trace.TraceLocation> r1 = r8.a
                int r1 = r1.size()
                com.amap.api.col.3l.c4 r2 = r8.f3088b
                int r2 = com.amap.api.col.p0003l.c4.f(r2)
                if (r1 <= r2) goto L53
                com.amap.api.col.3l.c4 r1 = r8.f3088b
                int r1 = com.amap.api.col.p0003l.c4.f(r1)
                int r1 = r0 - r1
            L34:
                if (r1 >= r0) goto L53
                java.util.List<com.amap.api.trace.TraceLocation> r2 = r8.a
                java.lang.Object r2 = r2.get(r1)
                com.amap.api.trace.TraceLocation r2 = (com.amap.api.trace.TraceLocation) r2
                if (r2 == 0) goto L50
                com.amap.api.maps.model.LatLng r3 = new com.amap.api.maps.model.LatLng
                double r4 = r2.getLatitude()
                double r6 = r2.getLongitude()
                r3.<init>(r4, r6)
                r10.add(r3)
            L50:
                int r1 = r1 + 1
                goto L34
            L53:
                r8.a(r9, r10)
                return
        }

        @Override // com.amap.api.trace.TraceListener
        public final void onTraceProcessing(int r1, int r2, java.util.List<com.amap.api.maps.model.LatLng> r3) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c extends android.os.Handler {
        private com.amap.api.trace.TraceListener a;

        public c(android.os.Looper r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public final void a(com.amap.api.trace.TraceListener r1) {
                r0 = this;
                r0.a = r1
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r5) {
                r4 = this;
                com.amap.api.trace.TraceListener r0 = r4.a     // Catch: java.lang.Throwable -> L3b
                if (r0 != 0) goto L5
                goto L3b
            L5:
                android.os.Bundle r0 = r5.getData()     // Catch: java.lang.Throwable -> L3b
                if (r0 != 0) goto Lc
                goto L3b
            Lc:
                java.lang.String r1 = "lineID"
                int r0 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L3b
                int r1 = r5.what     // Catch: java.lang.Throwable -> L3b
                switch(r1) {
                    case 100: goto L30;
                    case 101: goto L22;
                    case 102: goto L18;
                    default: goto L17;
                }     // Catch: java.lang.Throwable -> L3b
            L17:
                goto L3b
            L18:
                java.lang.Object r5 = r5.obj     // Catch: java.lang.Throwable -> L3b
                java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L3b
                com.amap.api.trace.TraceListener r1 = r4.a     // Catch: java.lang.Throwable -> L3b
                r1.onRequestFailed(r0, r5)     // Catch: java.lang.Throwable -> L3b
                return
            L22:
                java.lang.Object r1 = r5.obj     // Catch: java.lang.Throwable -> L3b
                java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L3b
                com.amap.api.trace.TraceListener r2 = r4.a     // Catch: java.lang.Throwable -> L3b
                int r3 = r5.arg1     // Catch: java.lang.Throwable -> L3b
                int r5 = r5.arg2     // Catch: java.lang.Throwable -> L3b
                r2.onFinished(r0, r1, r3, r5)     // Catch: java.lang.Throwable -> L3b
                return
            L30:
                java.lang.Object r1 = r5.obj     // Catch: java.lang.Throwable -> L3b
                java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L3b
                com.amap.api.trace.TraceListener r2 = r4.a     // Catch: java.lang.Throwable -> L3b
                int r5 = r5.arg1     // Catch: java.lang.Throwable -> L3b
                r2.onTraceProcessing(r0, r5, r1)     // Catch: java.lang.Throwable -> L3b
            L3b:
                return
        }
    }

    public c4(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 2000(0x7d0, double:9.88E-321)
            r2.f3072e = r0
            r0 = 5
            r2.f3073f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f3076i = r0
            r0 = 0
            r2.f3077j = r0
            r2.f3078k = r0
            r0 = 0
            r2.l = r0
            r0 = 0
            r2.n = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.o = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.p = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.q = r0
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            r2.r = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r2.s = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r2.t = r0
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r2.a = r3
            com.amap.api.maps.CoordinateConverter r0 = new com.amap.api.maps.CoordinateConverter
            r0.<init>(r3)
            r2.f3069b = r0
            com.amap.api.col.3l.c4$c r3 = new com.amap.api.col.3l.c4$c
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r3.<init>(r0)
            r2.m = r3
            com.amap.api.col.3l.k4 r3 = com.amap.api.col.p0003l.k4.a()
            android.content.Context r0 = r2.a
            r3.c(r0)
            int r3 = r2.r
            int r3 = r3 * 2
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r0 = r2.s
            java.lang.String r1 = "AMapTraceManagerProcess"
            com.amap.api.col.3l.b8 r3 = com.amap.api.col.p0003l.a3.a(r3, r0, r1)
            r2.f3070c = r3
            int r3 = r2.r
            int r3 = r3 * 2
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r0 = r2.t
            java.lang.String r1 = "AMapTraceManagerRequest"
            com.amap.api.col.3l.b8 r3 = com.amap.api.col.p0003l.a3.a(r3, r0, r1)
            r2.f3071d = r3
            return
    }

    private static double a(double r1, double r3, double r5, double r7) {
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L6
            double r1 = r1 - r5
            goto L8
        L6:
            double r1 = r5 - r1
        L8:
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 <= 0) goto Le
            double r3 = r3 - r7
            goto L10
        Le:
            double r3 = r7 - r3
        L10:
            double r1 = r1 * r1
            double r3 = r3 * r3
            double r1 = r1 + r3
            double r1 = java.lang.Math.sqrt(r1)
            return r1
    }

    static /* synthetic */ java.util.List b(com.amap.api.col.p0003l.c4 r0) {
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r0.q
            return r0
    }

    private void c() {
            r6 = this;
            java.util.List<com.amap.api.trace.TraceLocation> r0 = r6.f3076i
            int r0 = r0.size()
            int r1 = r6.f3073f
            if (r0 >= r1) goto Lb
            goto L25
        Lb:
            r1 = 1
            r2 = 50
            if (r0 > r2) goto L21
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<com.amap.api.trace.TraceLocation> r2 = r6.f3076i
            r0.<init>(r2)
            com.amap.api.col.3l.c4$b r2 = new com.amap.api.col.3l.c4$b
            r2.<init>(r6, r0)
            r3 = 0
            r6.queryProcessedTrace(r3, r0, r1, r2)
            return
        L21:
            int r2 = r0 + (-50)
            if (r2 >= 0) goto L26
        L25:
            return
        L26:
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.List<com.amap.api.trace.TraceLocation> r4 = r6.f3076i
            int r5 = r6.f3073f
            int r5 = r2 - r5
            java.util.List r4 = r4.subList(r5, r2)
            r3.<init>(r4)
            r6.d(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.List<com.amap.api.trace.TraceLocation> r4 = r6.f3076i
            java.util.List r0 = r4.subList(r2, r0)
            r3.<init>(r0)
            com.amap.api.col.3l.c4$b r0 = new com.amap.api.col.3l.c4$b
            r0.<init>(r6, r3)
            r6.queryProcessedTrace(r2, r3, r1, r0)
            return
    }

    private void d(java.util.List<com.amap.api.trace.TraceLocation> r20) {
            r19 = this;
            r1 = r19
            java.util.List<com.amap.api.maps.model.LatLng> r2 = r1.q
            monitor-enter(r2)
            int r0 = r20.size()     // Catch: java.lang.Throwable -> Ld
            if (r0 > 0) goto L10
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r0 = move-exception
            goto L95
        L10:
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.q     // Catch: java.lang.Throwable -> Ld
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Ld
            if (r0 > 0) goto L1a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            return
        L1a:
            java.util.Iterator r0 = r20.iterator()     // Catch: java.lang.Throwable -> Ld
            r3 = 0
            r4 = 0
            r6 = r3
            r7 = r4
        L23:
            boolean r9 = r0.hasNext()     // Catch: java.lang.Throwable -> Ld
            if (r9 == 0) goto L51
            java.lang.Object r9 = r0.next()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.trace.TraceLocation r9 = (com.amap.api.trace.TraceLocation) r9     // Catch: java.lang.Throwable -> Ld
            if (r9 == 0) goto L23
            if (r6 != 0) goto L35
        L33:
            r6 = r9
            goto L23
        L35:
            double r10 = r6.getLatitude()     // Catch: java.lang.Throwable -> Ld
            double r12 = r6.getLongitude()     // Catch: java.lang.Throwable -> Ld
            double r14 = r9.getLatitude()     // Catch: java.lang.Throwable -> Ld
            double r16 = r9.getLongitude()     // Catch: java.lang.Throwable -> Ld
            double r10 = a(r10, r12, r14, r16)     // Catch: java.lang.Throwable -> Ld
            r12 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 > 0) goto L23
            double r7 = r7 + r10
            goto L33
        L51:
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.q     // Catch: java.lang.Throwable -> Ld
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Ld
        L57:
            boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> Ld
            if (r6 == 0) goto L93
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.maps.model.LatLng r6 = (com.amap.api.maps.model.LatLng) r6     // Catch: java.lang.Throwable -> Ld
            if (r6 != 0) goto L69
            r0.remove()     // Catch: java.lang.Throwable -> Ld
            goto L57
        L69:
            if (r3 != 0) goto L75
            java.util.List<com.amap.api.maps.model.LatLng> r3 = r1.o     // Catch: java.lang.Throwable -> Ld
            r3.add(r6)     // Catch: java.lang.Throwable -> Ld
            r0.remove()     // Catch: java.lang.Throwable -> Ld
        L73:
            r3 = r6
            goto L57
        L75:
            double r9 = r3.latitude     // Catch: java.lang.Throwable -> Ld
            double r11 = r3.longitude     // Catch: java.lang.Throwable -> Ld
            double r13 = r6.latitude     // Catch: java.lang.Throwable -> Ld
            r17 = r4
            double r3 = r6.longitude     // Catch: java.lang.Throwable -> Ld
            r15 = r3
            double r3 = a(r9, r11, r13, r15)     // Catch: java.lang.Throwable -> Ld
            double r4 = r17 + r3
            int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r3 >= 0) goto L93
            java.util.List<com.amap.api.maps.model.LatLng> r3 = r1.o     // Catch: java.lang.Throwable -> Ld
            r3.add(r6)     // Catch: java.lang.Throwable -> Ld
            r0.remove()     // Catch: java.lang.Throwable -> Ld
            goto L73
        L93:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            return
        L95:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    private static boolean e(com.amap.api.trace.TraceLocation r6, com.amap.api.trace.TraceLocation r7) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            double r1 = r6.getLatitude()
            double r3 = r7.getLatitude()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1e
            double r1 = r6.getLongitude()
            double r6 = r7.getLongitude()
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L1e
            r6 = 1
            return r6
        L1e:
            return r0
    }

    static /* synthetic */ int f(com.amap.api.col.p0003l.c4 r0) {
            int r0 = r0.f3073f
            return r0
    }

    private void g() {
            r1 = this;
            com.amap.api.col.3l.b0 r0 = r1.f3075h
            if (r0 == 0) goto La
            r0.deactivate()
            r0 = 0
            r1.f3075h = r0
        La:
            return
    }

    static /* synthetic */ java.util.List h(com.amap.api.col.p0003l.c4 r0) {
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r0.p
            return r0
    }

    private void i() {
            r3 = this;
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r0 = r3.s
            r0.clear()
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r0 = r3.t
            r0.clear()
            java.util.List<com.amap.api.trace.TraceLocation> r0 = r3.f3076i
            if (r0 == 0) goto L29
            monitor-enter(r0)
            java.util.List<com.amap.api.trace.TraceLocation> r1 = r3.f3076i     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            r1.clear()     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r1 = move-exception
            goto L27
        L19:
            r1 = 0
            r3.f3078k = r1     // Catch: java.lang.Throwable -> L17
            r3.f3077j = r1     // Catch: java.lang.Throwable -> L17
            r1 = 0
            r3.l = r1     // Catch: java.lang.Throwable -> L17
            r1 = 0
            r3.n = r1     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
        L29:
            return
    }

    static /* synthetic */ java.util.List j(com.amap.api.col.p0003l.c4 r0) {
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r0.o
            return r0
    }

    static /* synthetic */ java.util.List k(com.amap.api.col.p0003l.c4 r0) {
            java.util.List<com.amap.api.trace.TraceLocation> r0 = r0.f3076i
            return r0
    }

    static /* synthetic */ com.amap.api.trace.TraceStatusListener l(com.amap.api.col.p0003l.c4 r0) {
            com.amap.api.trace.TraceStatusListener r0 = r0.f3074g
            return r0
    }

    static /* synthetic */ com.amap.api.col.3l.c4.c m(com.amap.api.col.p0003l.c4 r0) {
            com.amap.api.col.3l.c4$c r0 = r0.m
            return r0
    }

    static /* synthetic */ com.amap.api.maps.CoordinateConverter n(com.amap.api.col.p0003l.c4 r0) {
            com.amap.api.maps.CoordinateConverter r0 = r0.f3069b
            return r0
    }

    static /* synthetic */ android.content.Context o(com.amap.api.col.p0003l.c4 r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* synthetic */ com.amap.api.col.p0003l.b8 p(com.amap.api.col.p0003l.c4 r0) {
            com.amap.api.col.3l.b8 r0 = r0.f3071d
            return r0
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void destroy() {
            r2 = this;
            r0 = 0
            r2.stopTrace()     // Catch: java.lang.Throwable -> L1a
            com.amap.api.col.3l.b8 r1 = r2.f3070c     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto Ld
            r1.g()     // Catch: java.lang.Throwable -> L1a
            r2.f3070c = r0     // Catch: java.lang.Throwable -> L1a
        Ld:
            com.amap.api.col.3l.b8 r1 = r2.f3071d     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L16
            r1.g()     // Catch: java.lang.Throwable -> L1a
            r2.f3071d = r0     // Catch: java.lang.Throwable -> L1a
        L16:
            r2.f3076i = r0     // Catch: java.lang.Throwable -> L1a
            r2.f3074g = r0     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2.a = r0
            r2.f3069b = r0
            return
    }

    @Override // com.amap.api.maps.LocationSource.OnLocationChangedListener
    public final void onLocationChanged(android.location.Location r12) {
            r11 = this;
            com.amap.api.trace.TraceStatusListener r0 = r11.f3074g
            if (r0 == 0) goto L7c
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7c
            long r2 = r11.l     // Catch: java.lang.Throwable -> L7c
            long r0 = r0 - r2
            r2 = 30000(0x7530, double:1.4822E-319)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L1b
            com.amap.api.trace.TraceStatusListener r0 = r11.f3074g     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L1b
            java.lang.String r1 = "定位超时"
            r2 = 0
            r0.onTraceStatus(r2, r2, r1)     // Catch: java.lang.Throwable -> L7c
        L1b:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7c
            r11.l = r0     // Catch: java.lang.Throwable -> L7c
            android.os.Bundle r0 = r12.getExtras()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = "errorCode"
            int r1 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L33
            java.lang.String r12 = "errorInfo"
            r0.getString(r12)     // Catch: java.lang.Throwable -> L7c
            return
        L33:
            java.util.List<com.amap.api.trace.TraceLocation> r1 = r11.f3076i     // Catch: java.lang.Throwable -> L7c
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L7c
            com.amap.api.trace.TraceLocation r2 = new com.amap.api.trace.TraceLocation     // Catch: java.lang.Throwable -> L59
            double r3 = r12.getLatitude()     // Catch: java.lang.Throwable -> L59
            double r5 = r12.getLongitude()     // Catch: java.lang.Throwable -> L59
            float r7 = r12.getSpeed()     // Catch: java.lang.Throwable -> L59
            float r8 = r12.getBearing()     // Catch: java.lang.Throwable -> L59
            long r9 = r12.getTime()     // Catch: java.lang.Throwable -> L59
            r2.<init>(r3, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L59
            com.amap.api.trace.TraceLocation r12 = r11.n     // Catch: java.lang.Throwable -> L59
            boolean r12 = e(r12, r2)     // Catch: java.lang.Throwable -> L59
            if (r12 == 0) goto L5c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L59
            return
        L59:
            r0 = move-exception
            r12 = r0
            goto L7a
        L5c:
            java.util.List<com.amap.api.trace.TraceLocation> r12 = r11.f3076i     // Catch: java.lang.Throwable -> L59
            r12.add(r2)     // Catch: java.lang.Throwable -> L59
            r11.n = r2     // Catch: java.lang.Throwable -> L59
            int r12 = r11.f3077j     // Catch: java.lang.Throwable -> L59
            int r12 = r12 + 1
            r11.f3077j = r12     // Catch: java.lang.Throwable -> L59
            int r0 = r11.f3073f     // Catch: java.lang.Throwable -> L59
            if (r12 != r0) goto L78
            int r0 = r11.f3078k     // Catch: java.lang.Throwable -> L59
            int r0 = r0 + r12
            r11.f3078k = r0     // Catch: java.lang.Throwable -> L59
            r11.c()     // Catch: java.lang.Throwable -> L59
            r12 = 0
            r11.f3077j = r12     // Catch: java.lang.Throwable -> L59
        L78:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L59
            return
        L7a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L59
            throw r12     // Catch: java.lang.Throwable -> L7c
        L7c:
            return
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void queryProcessedTrace(int r7, java.util.List<com.amap.api.trace.TraceLocation> r8, int r9, com.amap.api.trace.TraceListener r10) {
            r6 = this;
            com.amap.api.col.3l.c4$a r0 = new com.amap.api.col.3l.c4$a     // Catch: java.lang.Throwable -> L10
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L11
            com.amap.api.col.3l.b8 r7 = r1.f3070c     // Catch: java.lang.Throwable -> L11
            r7.b(r0)     // Catch: java.lang.Throwable -> L11
            return
        L10:
            r1 = r6
        L11:
            return
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void setLocationInterval(long r1) {
            r0 = this;
            r0.f3072e = r1
            return
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void setTraceStatusInterval(int r2) {
            r1 = this;
            r0 = 2
            int r2 = java.lang.Math.max(r2, r0)
            r1.f3073f = r2
            return
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void startTrace(com.amap.api.trace.TraceStatusListener r3) {
            r2 = this;
            android.content.Context r0 = r2.a
            if (r0 != 0) goto L5
            return
        L5:
            long r0 = java.lang.System.currentTimeMillis()
            r2.l = r0
            r2.f3074g = r3
            com.amap.api.col.3l.b0 r3 = r2.f3075h
            if (r3 != 0) goto L24
            com.amap.api.col.3l.b0 r3 = new com.amap.api.col.3l.b0
            android.content.Context r0 = r2.a
            r3.<init>(r0)
            r2.f3075h = r3
            long r0 = r2.f3072e
            r3.d(r0)
            com.amap.api.col.3l.b0 r3 = r2.f3075h
            r3.activate(r2)
        L24:
            return
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void stopTrace() {
            r0 = this;
            r0.g()
            r0.i()
            return
    }
}
