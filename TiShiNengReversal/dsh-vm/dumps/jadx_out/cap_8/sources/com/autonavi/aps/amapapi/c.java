package com.autonavi.aps.amapapi;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class c implements com.amap.api.col.p0003l.t9 {

    /* renamed from: k, reason: collision with root package name */
    private static long f5678k;
    android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    com.autonavi.aps.amapapi.restruct.k f5679b;

    /* renamed from: c, reason: collision with root package name */
    com.autonavi.aps.amapapi.restruct.e f5680c;

    /* renamed from: d, reason: collision with root package name */
    com.amap.api.col.p0003l.h9 f5681d;

    /* renamed from: e, reason: collision with root package name */
    com.amap.api.col.p0003l.d7 f5682e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.ArrayList<com.amap.api.col.p0003l.m8> f5683f;

    /* renamed from: g, reason: collision with root package name */
    private android.os.Handler f5684g;

    /* renamed from: h, reason: collision with root package name */
    private android.location.LocationManager f5685h;

    /* renamed from: i, reason: collision with root package name */
    private com.autonavi.aps.amapapi.c.a f5686i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f5687j;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements android.location.LocationListener {
        private com.autonavi.aps.amapapi.c a;

        a(com.autonavi.aps.amapapi.c r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        final void a() {
                r1 = this;
                r0 = 0
                r1.a = r0
                return
        }

        final void a(com.autonavi.aps.amapapi.c r1) {
                r0 = this;
                r0.a = r1
                return
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(android.location.Location r2) {
                r1 = this;
                com.autonavi.aps.amapapi.c r0 = r1.a     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L7
                r0.a(r2)     // Catch: java.lang.Throwable -> L7
            L7:
                return
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(java.lang.String r1, int r2, android.os.Bundle r3) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends com.amap.api.col.p0003l.c8 {
        final /* synthetic */ com.autonavi.aps.amapapi.c a;

        /* renamed from: b, reason: collision with root package name */
        private int f5688b;

        /* renamed from: c, reason: collision with root package name */
        private android.location.Location f5689c;

        b(com.autonavi.aps.amapapi.c r1, int r2) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.f5688b = r2
                return
        }

        b(com.autonavi.aps.amapapi.c r2, android.location.Location r3) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r0)
                r1.f5689c = r3
                return
        }

        private void a() {
                r7 = this;
                com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L21
                android.location.Location r0 = r7.f5689c     // Catch: java.lang.Throwable -> L21
                if (r0 != 0) goto L9
                goto L113
            L9:
                com.autonavi.aps.amapapi.c r0 = r7.a     // Catch: java.lang.Throwable -> L21
                boolean r0 = com.autonavi.aps.amapapi.c.a(r0)     // Catch: java.lang.Throwable -> L21
                if (r0 != 0) goto L13
                goto L113
            L13:
                com.autonavi.aps.amapapi.c r0 = r7.a     // Catch: java.lang.Throwable -> L21
                android.content.Context r0 = r0.a     // Catch: java.lang.Throwable -> L21
                boolean r0 = com.autonavi.aps.amapapi.utils.j.m(r0)     // Catch: java.lang.Throwable -> L21
                if (r0 == 0) goto L24
                com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L21
                return
            L21:
                r0 = move-exception
                goto L142
            L24:
                android.location.Location r0 = r7.f5689c     // Catch: java.lang.Throwable -> L21
                android.os.Bundle r0 = r0.getExtras()     // Catch: java.lang.Throwable -> L21
                if (r0 == 0) goto L33
                java.lang.String r1 = "satellites"
                int r0 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L21
                goto L34
            L33:
                r0 = 0
            L34:
                android.location.Location r1 = r7.f5689c     // Catch: java.lang.Throwable -> L21
                boolean r1 = com.autonavi.aps.amapapi.utils.j.a(r1, r0)     // Catch: java.lang.Throwable -> L21
                if (r1 == 0) goto L3e
                goto L113
            L3e:
                com.autonavi.aps.amapapi.c r1 = r7.a     // Catch: java.lang.Throwable -> L21
                com.autonavi.aps.amapapi.restruct.k r1 = r1.f5679b     // Catch: java.lang.Throwable -> L21
                if (r1 == 0) goto L4b
                boolean r2 = r1.s     // Catch: java.lang.Throwable -> L21
                if (r2 != 0) goto L4b
                r1.f()     // Catch: java.lang.Throwable -> L21
            L4b:
                com.autonavi.aps.amapapi.c r1 = r7.a     // Catch: java.lang.Throwable -> L21
                com.autonavi.aps.amapapi.restruct.k r1 = r1.f5679b     // Catch: java.lang.Throwable -> L21
                java.util.ArrayList r1 = r1.a()     // Catch: java.lang.Throwable -> L21
                com.autonavi.aps.amapapi.c r2 = r7.a     // Catch: java.lang.Throwable -> L21
                com.autonavi.aps.amapapi.restruct.e r2 = r2.f5680c     // Catch: java.lang.Throwable -> L21
                java.util.List r2 = r2.a()     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.k8$a r3 = new com.amap.api.col.3l.k8$a     // Catch: java.lang.Throwable -> L21
                r3.<init>()     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.l9 r4 = new com.amap.api.col.3l.l9     // Catch: java.lang.Throwable -> L21
                r4.<init>()     // Catch: java.lang.Throwable -> L21
                android.location.Location r5 = r7.f5689c     // Catch: java.lang.Throwable -> L21
                float r5 = r5.getAccuracy()     // Catch: java.lang.Throwable -> L21
                r4.f3644i = r5     // Catch: java.lang.Throwable -> L21
                android.location.Location r5 = r7.f5689c     // Catch: java.lang.Throwable -> L21
                double r5 = r5.getAltitude()     // Catch: java.lang.Throwable -> L21
                r4.f3641f = r5     // Catch: java.lang.Throwable -> L21
                android.location.Location r5 = r7.f5689c     // Catch: java.lang.Throwable -> L21
                double r5 = r5.getLatitude()     // Catch: java.lang.Throwable -> L21
                r4.f3639d = r5     // Catch: java.lang.Throwable -> L21
                android.location.Location r5 = r7.f5689c     // Catch: java.lang.Throwable -> L21
                float r5 = r5.getBearing()     // Catch: java.lang.Throwable -> L21
                r4.f3643h = r5     // Catch: java.lang.Throwable -> L21
                android.location.Location r5 = r7.f5689c     // Catch: java.lang.Throwable -> L21
                double r5 = r5.getLongitude()     // Catch: java.lang.Throwable -> L21
                r4.f3640e = r5     // Catch: java.lang.Throwable -> L21
                android.location.Location r5 = r7.f5689c     // Catch: java.lang.Throwable -> L21
                boolean r5 = r5.isFromMockProvider()     // Catch: java.lang.Throwable -> L21
                r4.f3645j = r5     // Catch: java.lang.Throwable -> L21
                android.location.Location r5 = r7.f5689c     // Catch: java.lang.Throwable -> L21
                java.lang.String r5 = r5.getProvider()     // Catch: java.lang.Throwable -> L21
                r4.a = r5     // Catch: java.lang.Throwable -> L21
                android.location.Location r5 = r7.f5689c     // Catch: java.lang.Throwable -> L21
                float r5 = r5.getSpeed()     // Catch: java.lang.Throwable -> L21
                r4.f3642g = r5     // Catch: java.lang.Throwable -> L21
                byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L21
                r4.l = r0     // Catch: java.lang.Throwable -> L21
                long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L21
                r4.f3637b = r5     // Catch: java.lang.Throwable -> L21
                android.location.Location r0 = r7.f5689c     // Catch: java.lang.Throwable -> L21
                long r5 = r0.getTime()     // Catch: java.lang.Throwable -> L21
                r4.f3638c = r5     // Catch: java.lang.Throwable -> L21
                android.location.Location r0 = r7.f5689c     // Catch: java.lang.Throwable -> L21
                long r5 = r0.getTime()     // Catch: java.lang.Throwable -> L21
                r4.f3676k = r5     // Catch: java.lang.Throwable -> L21
                r3.a = r4     // Catch: java.lang.Throwable -> L21
                r3.f3628b = r1     // Catch: java.lang.Throwable -> L21
                com.autonavi.aps.amapapi.c r0 = r7.a     // Catch: java.lang.Throwable -> L21
                com.autonavi.aps.amapapi.restruct.k r0 = r0.f5679b     // Catch: java.lang.Throwable -> L21
                android.net.wifi.WifiInfo r0 = r0.c()     // Catch: java.lang.Throwable -> L21
                if (r0 == 0) goto Ld6
                java.lang.String r0 = com.autonavi.aps.amapapi.restruct.h.a(r0)     // Catch: java.lang.Throwable -> L21
                long r0 = com.amap.api.col.p0003l.m9.a(r0)     // Catch: java.lang.Throwable -> L21
                r3.f3629c = r0     // Catch: java.lang.Throwable -> L21
            Ld6:
                long r0 = com.autonavi.aps.amapapi.restruct.k.z     // Catch: java.lang.Throwable -> L21
                r3.f3630d = r0     // Catch: java.lang.Throwable -> L21
                android.location.Location r0 = r7.f5689c     // Catch: java.lang.Throwable -> L21
                long r0 = r0.getTime()     // Catch: java.lang.Throwable -> L21
                r3.f3632f = r0     // Catch: java.lang.Throwable -> L21
                com.autonavi.aps.amapapi.c r0 = r7.a     // Catch: java.lang.Throwable -> L21
                android.content.Context r0 = r0.a     // Catch: java.lang.Throwable -> L21
                int r0 = com.amap.api.col.p0003l.i4.K(r0)     // Catch: java.lang.Throwable -> L21
                byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L21
                r3.f3633g = r0     // Catch: java.lang.Throwable -> L21
                com.autonavi.aps.amapapi.c r0 = r7.a     // Catch: java.lang.Throwable -> L21
                android.content.Context r0 = r0.a     // Catch: java.lang.Throwable -> L21
                java.lang.String r0 = com.amap.api.col.p0003l.i4.V(r0)     // Catch: java.lang.Throwable -> L21
                r3.f3634h = r0     // Catch: java.lang.Throwable -> L21
                com.autonavi.aps.amapapi.c r0 = r7.a     // Catch: java.lang.Throwable -> L21
                com.autonavi.aps.amapapi.restruct.k r0 = r0.f5679b     // Catch: java.lang.Throwable -> L21
                boolean r0 = r0.k()     // Catch: java.lang.Throwable -> L21
                r3.f3631e = r0     // Catch: java.lang.Throwable -> L21
                com.autonavi.aps.amapapi.c r0 = r7.a     // Catch: java.lang.Throwable -> L21
                android.content.Context r0 = r0.a     // Catch: java.lang.Throwable -> L21
                boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r0)     // Catch: java.lang.Throwable -> L21
                r3.f3636j = r0     // Catch: java.lang.Throwable -> L21
                r3.f3635i = r2     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.m8 r0 = com.amap.api.col.p0003l.h9.a(r3)     // Catch: java.lang.Throwable -> L21
                if (r0 != 0) goto L114
            L113:
                return
            L114:
                com.autonavi.aps.amapapi.c r1 = r7.a     // Catch: java.lang.Throwable -> L21
                java.util.ArrayList r1 = com.autonavi.aps.amapapi.c.b(r1)     // Catch: java.lang.Throwable -> L21
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L21
                com.autonavi.aps.amapapi.c r2 = r7.a     // Catch: java.lang.Throwable -> L137
                java.util.ArrayList r2 = com.autonavi.aps.amapapi.c.b(r2)     // Catch: java.lang.Throwable -> L137
                r2.add(r0)     // Catch: java.lang.Throwable -> L137
                com.autonavi.aps.amapapi.c r0 = r7.a     // Catch: java.lang.Throwable -> L137
                java.util.ArrayList r0 = com.autonavi.aps.amapapi.c.b(r0)     // Catch: java.lang.Throwable -> L137
                int r0 = r0.size()     // Catch: java.lang.Throwable -> L137
                r2 = 5
                if (r0 < r2) goto L139
                com.autonavi.aps.amapapi.c r0 = r7.a     // Catch: java.lang.Throwable -> L137
                r0.e()     // Catch: java.lang.Throwable -> L137
                goto L139
            L137:
                r0 = move-exception
                goto L140
            L139:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L137
                com.autonavi.aps.amapapi.c r0 = r7.a     // Catch: java.lang.Throwable -> L21
                r0.d()     // Catch: java.lang.Throwable -> L21
                return
            L140:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L137
                throw r0     // Catch: java.lang.Throwable -> L21
            L142:
                java.lang.String r1 = "cl"
                java.lang.String r2 = "coll"
                com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
                return
        }

        private void b() {
                r6 = this;
                com.autonavi.aps.amapapi.utils.d.a()
                com.autonavi.aps.amapapi.c r0 = r6.a
                android.content.Context r0 = r0.a
                boolean r0 = com.autonavi.aps.amapapi.utils.j.m(r0)
                if (r0 == 0) goto L11
                com.autonavi.aps.amapapi.utils.d.a()
                return
            L11:
                r0 = 0
                long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L86
                com.autonavi.aps.amapapi.c.a(r1)     // Catch: java.lang.Throwable -> L86
                com.autonavi.aps.amapapi.c r1 = r6.a     // Catch: java.lang.Throwable -> L86
                com.amap.api.col.3l.d7 r1 = r1.f5682e     // Catch: java.lang.Throwable -> L86
                com.amap.api.col.3l.y7 r1 = r1.f3151f     // Catch: java.lang.Throwable -> L86
                boolean r1 = r1.e()     // Catch: java.lang.Throwable -> L86
                if (r1 == 0) goto L8c
                java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L86
                com.autonavi.aps.amapapi.c r2 = r6.a     // Catch: java.lang.Throwable -> L86
                com.amap.api.col.3l.d7 r2 = r2.f5682e     // Catch: java.lang.Throwable -> L86
                java.lang.String r2 = r2.a     // Catch: java.lang.Throwable -> L86
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L86
                com.autonavi.aps.amapapi.c r2 = r6.a     // Catch: java.lang.Throwable -> L86
                com.amap.api.col.3l.d7 r2 = r2.f5682e     // Catch: java.lang.Throwable -> L86
                long r2 = r2.f3147b     // Catch: java.lang.Throwable -> L86
                com.amap.api.col.3l.p6 r0 = com.amap.api.col.p0003l.p6.b(r1, r2)     // Catch: java.lang.Throwable -> L86
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L86
                r1.<init>()     // Catch: java.lang.Throwable -> L86
                byte[] r2 = com.autonavi.aps.amapapi.c.f()     // Catch: java.lang.Throwable -> L86
                if (r2 != 0) goto L49
                r0.close()     // Catch: java.lang.Throwable -> L48
            L48:
                return
            L49:
                com.autonavi.aps.amapapi.c r3 = r6.a     // Catch: java.lang.Throwable -> L86
                com.amap.api.col.3l.d7 r3 = r3.f5682e     // Catch: java.lang.Throwable -> L86
                java.util.List r3 = com.autonavi.aps.amapapi.c.a(r0, r3, r1, r2)     // Catch: java.lang.Throwable -> L86
                if (r3 == 0) goto L88
                int r4 = r3.size()     // Catch: java.lang.Throwable -> L86
                if (r4 != 0) goto L5a
                goto L88
            L5a:
                com.autonavi.aps.amapapi.c r4 = r6.a     // Catch: java.lang.Throwable -> L86
                com.amap.api.col.3l.d7 r4 = r4.f5682e     // Catch: java.lang.Throwable -> L86
                com.amap.api.col.3l.y7 r4 = r4.f3151f     // Catch: java.lang.Throwable -> L86
                r5 = 1
                r4.c(r5)     // Catch: java.lang.Throwable -> L86
                byte[] r4 = com.amap.api.col.p0003l.h9.g()     // Catch: java.lang.Throwable -> L86
                byte[] r5 = com.amap.api.col.p0003l.q4.v()     // Catch: java.lang.Throwable -> L86
                byte[] r4 = com.amap.api.col.p0003l.j4.h(r2, r4, r5)     // Catch: java.lang.Throwable -> L86
                byte[] r2 = com.autonavi.aps.amapapi.security.a.a(r2)     // Catch: java.lang.Throwable -> L86
                byte[] r2 = com.amap.api.col.p0003l.h9.h(r2, r4, r3)     // Catch: java.lang.Throwable -> L86
                byte[] r2 = com.amap.api.col.p0003l.q4.t(r2)     // Catch: java.lang.Throwable -> L86
                boolean r2 = com.amap.api.col.p0003l.h9.f(r2)     // Catch: java.lang.Throwable -> L86
                if (r2 == 0) goto L8c
                com.autonavi.aps.amapapi.c.a(r0, r1)     // Catch: java.lang.Throwable -> L86
                goto L8c
            L86:
                r1 = move-exception
                goto L92
            L88:
                r0.close()     // Catch: java.lang.Throwable -> L8b
            L8b:
                return
            L8c:
                if (r0 == 0) goto L9f
                r0.close()     // Catch: java.lang.Throwable -> L91
            L91:
                return
            L92:
                java.lang.String r2 = "leg"
                java.lang.String r3 = "uts"
                com.amap.api.col.p0003l.w5.p(r1, r2, r3)     // Catch: java.lang.Throwable -> La0
                if (r0 == 0) goto L9f
                r0.close()     // Catch: java.lang.Throwable -> L9f
            L9f:
                return
            La0:
                r1 = move-exception
                if (r0 == 0) goto La6
                r0.close()     // Catch: java.lang.Throwable -> La6
            La6:
                throw r1
        }

        @Override // com.amap.api.col.p0003l.c8
        public final void runTask() {
                r2 = this;
                int r0 = r2.f5688b
                r1 = 1
                if (r0 != r1) goto L9
                r2.a()
                return
            L9:
                r1 = 2
                if (r0 != r1) goto L10
                r2.b()
                return
            L10:
                r1 = 3
                if (r0 != r1) goto L18
                com.autonavi.aps.amapapi.c r0 = r2.a
                com.autonavi.aps.amapapi.c.c(r0)
            L18:
                return
        }
    }

    static {
            return
    }

    c(android.content.Context r10) {
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.a = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r9.f5683f = r1
            r9.f5679b = r0
            r9.f5680c = r0
            r0 = 0
            r9.f5687j = r0
            r9.a = r10
            com.amap.api.col.3l.d7 r2 = new com.amap.api.col.3l.d7
            r2.<init>()
            r9.f5682e = r2
            android.content.Context r1 = r9.a
            java.lang.String r3 = com.amap.api.col.p0003l.s5.f3971k
            r5 = 1024000(0xfa000, float:1.43493E-39)
            java.lang.String r6 = "0"
            r4 = 100
            com.amap.api.col.p0003l.k7.f(r1, r2, r3, r4, r5, r6)
            com.amap.api.col.3l.d7 r0 = r9.f5682e
            com.amap.api.col.3l.x7 r1 = new com.amap.api.col.3l.x7
            int r2 = com.autonavi.aps.amapapi.utils.a.f5842g
            com.amap.api.col.3l.v7 r3 = new com.amap.api.col.3l.v7
            boolean r5 = com.autonavi.aps.amapapi.utils.a.f5840e
            int r6 = com.autonavi.aps.amapapi.utils.a.f5841f
            int r7 = r6 * 10
            java.lang.String r8 = "carrierLocKey"
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.String r10 = "kKey"
            r1.<init>(r4, r2, r10, r3)
            r0.f3151f = r1
            com.amap.api.col.3l.d7 r10 = r9.f5682e
            com.amap.api.col.3l.i6 r0 = new com.amap.api.col.3l.i6
            r0.<init>()
            r10.f3150e = r0
            return
    }

    private static int a(byte[] r2) {
            r0 = 3
            r0 = r2[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            r1 = 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            r1 = 0
            r2 = r2[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    static /* synthetic */ long a(long r0) {
            com.autonavi.aps.amapapi.c.f5678k = r0
            return r0
    }

    static /* synthetic */ java.util.List a(com.amap.api.col.p0003l.p6 r0, com.amap.api.col.p0003l.d7 r1, java.util.List r2, byte[] r3) {
            java.util.List r0 = b(r0, r1, r2, r3)
            return r0
    }

    static /* synthetic */ void a(com.amap.api.col.p0003l.p6 r0, java.util.List r1) {
            b(r0, r1)
            return
    }

    static /* synthetic */ boolean a(com.autonavi.aps.amapapi.c r0) {
            boolean r0 = r0.f5687j
            return r0
    }

    private static byte[] a(int r2) {
            r0 = 0
            java.lang.String r1 = "AES"
            javax.crypto.KeyGenerator r1 = javax.crypto.KeyGenerator.getInstance(r1)     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto La
            return r0
        La:
            r1.init(r2)     // Catch: java.lang.Throwable -> L16
            javax.crypto.SecretKey r2 = r1.generateKey()     // Catch: java.lang.Throwable -> L16
            byte[] r2 = r2.getEncoded()     // Catch: java.lang.Throwable -> L16
            return r2
        L16:
            return r0
    }

    static /* synthetic */ java.util.ArrayList b(com.autonavi.aps.amapapi.c r0) {
            java.util.ArrayList<com.amap.api.col.3l.m8> r0 = r0.f5683f
            return r0
    }

    private static java.util.List<com.amap.api.col.p0003l.m8> b(com.amap.api.col.p0003l.p6 r17, com.amap.api.col.p0003l.d7 r18, java.util.List<java.lang.String> r19, byte[] r20) {
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.io.File r0 = r17.l()     // Catch: java.lang.Throwable -> L10b
            if (r0 == 0) goto L10d
            boolean r2 = r0.exists()     // Catch: java.lang.Throwable -> L10b
            if (r2 == 0) goto L10d
            java.lang.String[] r0 = r0.list()     // Catch: java.lang.Throwable -> L10b
            if (r0 != 0) goto L19
            goto L10d
        L19:
            int r2 = r0.length     // Catch: java.lang.Throwable -> L10b
            r3 = 0
            r4 = 0
            r5 = 0
        L1d:
            if (r4 >= r2) goto L10d
            r6 = r0[r4]     // Catch: java.lang.Throwable -> L10b
            java.lang.String r7 = ".0"
            boolean r7 = r6.contains(r7)     // Catch: java.lang.Throwable -> L10b
            if (r7 == 0) goto L100
            r7 = 0
            java.lang.String r8 = "\\."
            java.lang.String[] r6 = r6.split(r8)     // Catch: java.lang.Throwable -> Lf2
            r6 = r6[r3]     // Catch: java.lang.Throwable -> Lf2
            r8 = r17
            com.amap.api.col.3l.p6$e r9 = r8.a(r6)     // Catch: java.lang.Throwable -> Le8
            if (r9 != 0) goto L49
            if (r9 == 0) goto L3f
        L3c:
            r9.close()     // Catch: java.lang.Throwable -> L3f
        L3f:
            r6 = r18
            r3 = r19
            r16 = r0
            r0 = r20
            goto L104
        L49:
            java.io.InputStream r7 = r9.a()     // Catch: java.lang.Throwable -> Lde
            if (r7 != 0) goto L55
            if (r7 == 0) goto L3c
            r7.close()     // Catch: java.lang.Throwable -> L3c
            goto L3c
        L55:
            r10 = 2
            byte[] r11 = new byte[r10]     // Catch: java.lang.Throwable -> Lde
            r7.read(r11)     // Catch: java.lang.Throwable -> Lde
            int r11 = com.autonavi.aps.amapapi.utils.j.b(r11)     // Catch: java.lang.Throwable -> Lde
            if (r11 == 0) goto Lcd
            r12 = 65535(0xffff, float:9.1834E-41)
            if (r11 <= r12) goto L67
            goto Lcd
        L67:
            byte[] r11 = new byte[r11]     // Catch: java.lang.Throwable -> Lde
            r7.read(r11)     // Catch: java.lang.Throwable -> Lde
            byte[] r10 = new byte[r10]     // Catch: java.lang.Throwable -> Lde
            r12 = 0
        L6f:
            int r13 = r7.read(r10)     // Catch: java.lang.Throwable -> Lde
            if (r13 < 0) goto Lb9
            int r13 = com.autonavi.aps.amapapi.utils.j.b(r10)     // Catch: java.lang.Throwable -> Lb4
            byte[] r13 = new byte[r13]     // Catch: java.lang.Throwable -> Lb4
            r7.read(r13)     // Catch: java.lang.Throwable -> Lb4
            byte[] r14 = com.amap.api.col.p0003l.q4.v()     // Catch: java.lang.Throwable -> Lb4
            byte[] r13 = com.amap.api.col.p0003l.j4.e(r11, r13, r14)     // Catch: java.lang.Throwable -> Lb4
            int r14 = r13.length     // Catch: java.lang.Throwable -> Lb4
            int r12 = r12 + r14
            r14 = 4
            byte[] r14 = new byte[r14]     // Catch: java.lang.Throwable -> Lb4
            r7.read(r14)     // Catch: java.lang.Throwable -> Lb4
            int r14 = a(r14)     // Catch: java.lang.Throwable -> Lb4
            com.amap.api.col.3l.m8 r15 = new com.amap.api.col.3l.m8     // Catch: java.lang.Throwable -> Lb4
            byte[] r13 = com.amap.api.col.p0003l.q4.t(r13)     // Catch: java.lang.Throwable -> Lb4
            byte[] r3 = com.amap.api.col.p0003l.q4.v()     // Catch: java.lang.Throwable -> Lb4
            r16 = r0
            r0 = r20
            byte[] r3 = com.amap.api.col.p0003l.j4.h(r0, r13, r3)     // Catch: java.lang.Throwable -> Lae
            r15.<init>(r14, r3)     // Catch: java.lang.Throwable -> Lae
            r1.add(r15)     // Catch: java.lang.Throwable -> Lae
            r0 = r16
            r3 = 0
            goto L6f
        Lae:
            r6 = r18
            r3 = r19
            goto Lf6
        Lb4:
            r16 = r0
            r0 = r20
            goto Lae
        Lb9:
            r16 = r0
            r0 = r20
            int r5 = r5 + r12
            r3 = r19
            r3.add(r6)     // Catch: java.lang.Throwable -> Ldb
            r6 = r18
            com.amap.api.col.3l.y7 r10 = r6.f3151f     // Catch: java.lang.Throwable -> Le6
            int r10 = r10.a()     // Catch: java.lang.Throwable -> Le6
            if (r5 <= r10) goto Ld4
        Lcd:
            r7.close()     // Catch: java.lang.Throwable -> Ld0
        Ld0:
            r9.close()     // Catch: java.lang.Throwable -> L10d
            goto L10d
        Ld4:
            r7.close()     // Catch: java.lang.Throwable -> Ld7
        Ld7:
            r9.close()     // Catch: java.lang.Throwable -> L104
            goto L104
        Ldb:
            r6 = r18
            goto Le6
        Lde:
            r6 = r18
            r3 = r19
            r16 = r0
            r0 = r20
        Le6:
            goto Lf6
        Le8:
            r6 = r18
            r3 = r19
            r16 = r0
            r0 = r20
            goto Lf5
        Lf2:
            r8 = r17
            goto Le8
        Lf5:
            r9 = r7
        Lf6:
            if (r7 == 0) goto Lfd
            r7.close()     // Catch: java.lang.Throwable -> Lfc
            goto Lfd
        Lfc:
        Lfd:
            if (r9 == 0) goto L104
            goto Ld7
        L100:
            r8 = r17
            goto L3f
        L104:
            int r4 = r4 + 1
            r0 = r16
            r3 = 0
            goto L1d
        L10b:
            r0 = move-exception
            goto L10e
        L10d:
            return r1
        L10e:
            java.lang.String r2 = "aps"
            java.lang.String r3 = "upc"
            com.amap.api.col.p0003l.w5.p(r0, r2, r3)
            return r1
    }

    private static void b(com.amap.api.col.p0003l.p6 r1, java.util.List<java.lang.String> r2) {
            if (r1 == 0) goto L22
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L1a
        L6:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1a
            r1.q(r0)     // Catch: java.lang.Throwable -> L1a
            goto L6
        L16:
            r1.close()     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r1 = move-exception
            java.lang.String r2 = "aps"
            java.lang.String r0 = "dlo"
            com.amap.api.col.p0003l.w5.p(r1, r2, r0)
        L22:
            return
    }

    private static byte[] b(int r5) {
            int r0 = r5 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            int r1 = r5 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            int r2 = r5 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r3 = 4
            byte[] r3 = new byte[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            r0 = 3
            r3[r0] = r5
            return r3
    }

    static /* synthetic */ void c(com.autonavi.aps.amapapi.c r0) {
            r0.g()
            return
    }

    private static byte[] c(int r3) {
            r0 = 2
            byte[] r0 = new byte[r0]
            r1 = r3 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2 = 1
            r0[r2] = r1
            r1 = 65280(0xff00, float:9.1477E-41)
            r3 = r3 & r1
            int r3 = r3 >> 8
            byte r3 = (byte) r3
            r1 = 0
            r0[r1] = r3
            return r0
    }

    static /* synthetic */ byte[] f() {
            r0 = 128(0x80, float:1.8E-43)
            byte[] r0 = a(r0)
            return r0
    }

    private void g() {
            r7 = this;
            com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> Lf
            android.content.Context r0 = r7.a     // Catch: java.lang.Throwable -> Lf
            boolean r0 = com.autonavi.aps.amapapi.utils.j.m(r0)     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L12
            com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r0 = move-exception
            goto L9e
        L12:
            java.util.ArrayList<com.amap.api.col.3l.m8> r0 = r7.f5683f     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L9d
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L1e
            goto L9d
        L1e:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf
            r0.<init>()     // Catch: java.lang.Throwable -> Lf
            java.util.ArrayList<com.amap.api.col.3l.m8> r1 = r7.f5683f     // Catch: java.lang.Throwable -> Lf
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lf
            java.util.ArrayList<com.amap.api.col.3l.m8> r2 = r7.f5683f     // Catch: java.lang.Throwable -> L9a
            r0.addAll(r2)     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayList<com.amap.api.col.3l.m8> r2 = r7.f5683f     // Catch: java.lang.Throwable -> L9a
            r2.clear()     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9a
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            r2 = 256(0x100, float:3.59E-43)
            byte[] r2 = a(r2)     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto L3f
            goto L9d
        L3f:
            int r3 = r2.length     // Catch: java.lang.Throwable -> Lf
            byte[] r3 = c(r3)     // Catch: java.lang.Throwable -> Lf
            r1.write(r3)     // Catch: java.lang.Throwable -> Lf
            r1.write(r2)     // Catch: java.lang.Throwable -> Lf
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lf
        L4e:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto L88
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> Lf
            com.amap.api.col.3l.m8 r3 = (com.amap.api.col.p0003l.m8) r3     // Catch: java.lang.Throwable -> Lf
            byte[] r4 = r3.b()     // Catch: java.lang.Throwable -> Lf
            int r5 = r4.length     // Catch: java.lang.Throwable -> Lf
            r6 = 10
            if (r5 < r6) goto L4e
            int r5 = r4.length     // Catch: java.lang.Throwable -> Lf
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r5 > r6) goto L4e
            byte[] r5 = com.amap.api.col.p0003l.q4.v()     // Catch: java.lang.Throwable -> Lf
            byte[] r4 = com.amap.api.col.p0003l.j4.h(r2, r4, r5)     // Catch: java.lang.Throwable -> Lf
            int r5 = r4.length     // Catch: java.lang.Throwable -> Lf
            byte[] r5 = c(r5)     // Catch: java.lang.Throwable -> Lf
            r1.write(r5)     // Catch: java.lang.Throwable -> Lf
            r1.write(r4)     // Catch: java.lang.Throwable -> Lf
            int r3 = r3.a()     // Catch: java.lang.Throwable -> Lf
            byte[] r3 = b(r3)     // Catch: java.lang.Throwable -> Lf
            r1.write(r3)     // Catch: java.lang.Throwable -> Lf
            goto L4e
        L88:
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> Lf
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = java.lang.Long.toString(r1)     // Catch: java.lang.Throwable -> Lf
            com.amap.api.col.3l.d7 r2 = r7.f5682e     // Catch: java.lang.Throwable -> Lf
            com.amap.api.col.p0003l.e7.c(r1, r0, r2)     // Catch: java.lang.Throwable -> Lf
            return
        L9a:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9a
            throw r0     // Catch: java.lang.Throwable -> Lf
        L9d:
            return
        L9e:
            java.lang.String r1 = "clm"
            java.lang.String r2 = "wtD"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    @Override // com.amap.api.col.p0003l.t9
    public final com.amap.api.col.p0003l.s9 a(com.amap.api.col.p0003l.q9 r3) {
            r2 = this;
            com.autonavi.aps.amapapi.trans.b r0 = new com.autonavi.aps.amapapi.trans.b     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.f3833b     // Catch: java.lang.Throwable -> L2d
            r0.a(r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r3.a     // Catch: java.lang.Throwable -> L2d
            r0.a(r1)     // Catch: java.lang.Throwable -> L2d
            byte[] r3 = r3.f3835d     // Catch: java.lang.Throwable -> L2d
            r0.a(r3)     // Catch: java.lang.Throwable -> L2d
            com.amap.api.col.p0003l.s6.b()     // Catch: java.lang.Throwable -> L2d
            com.amap.api.col.3l.a7 r3 = com.amap.api.col.p0003l.s6.d(r0)     // Catch: java.lang.Throwable -> L2d
            com.amap.api.col.3l.s9 r0 = new com.amap.api.col.3l.s9     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            byte[] r1 = r3.a     // Catch: java.lang.Throwable -> L2d
            r0.f3979c = r1     // Catch: java.lang.Throwable -> L2d
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3 = r3.f2960b     // Catch: java.lang.Throwable -> L2d
            r0.f3978b = r3     // Catch: java.lang.Throwable -> L2d
            r3 = 200(0xc8, float:2.8E-43)
            r0.a = r3     // Catch: java.lang.Throwable -> L2d
            return r0
        L2d:
            r3 = 0
            return r3
    }

    final void a() {
            r3 = this;
            android.content.Context r0 = r3.a
            boolean r0 = com.autonavi.aps.amapapi.utils.j.m(r0)
            if (r0 == 0) goto Lc
            com.autonavi.aps.amapapi.utils.d.a()
            return
        Lc:
            com.autonavi.aps.amapapi.c$a r0 = r3.f5686i     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1a
            android.location.LocationManager r1 = r3.f5685h     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            r1.removeUpdates(r0)     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r0 = move-exception
            goto L3d
        L1a:
            com.autonavi.aps.amapapi.c$a r0 = r3.f5686i     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L21
            r0.a()     // Catch: java.lang.Throwable -> L18
        L21:
            boolean r0 = r3.f5687j     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L3c
            r3.g()     // Catch: java.lang.Throwable -> L18
            com.autonavi.aps.amapapi.restruct.k r0 = r3.f5679b     // Catch: java.lang.Throwable -> L18
            r1 = 0
            r0.a(r1)     // Catch: java.lang.Throwable -> L18
            com.autonavi.aps.amapapi.restruct.e r0 = r3.f5680c     // Catch: java.lang.Throwable -> L18
            r0.a(r1)     // Catch: java.lang.Throwable -> L18
            r3.f5680c = r1     // Catch: java.lang.Throwable -> L18
            r3.f5679b = r1     // Catch: java.lang.Throwable -> L18
            r3.f5684g = r1     // Catch: java.lang.Throwable -> L18
            r0 = 0
            r3.f5687j = r0     // Catch: java.lang.Throwable -> L18
        L3c:
            return
        L3d:
            java.lang.String r1 = "clm"
            java.lang.String r2 = "stc"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    public final void a(android.location.Location r3) {
            r2 = this;
            android.os.Handler r0 = r2.f5684g     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            com.autonavi.aps.amapapi.c$b r1 = new com.autonavi.aps.amapapi.c$b     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Ld
            r0.post(r1)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            goto L10
        Lf:
            return
        L10:
            java.lang.String r0 = "cl"
            java.lang.String r1 = "olcc"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
            return
    }

    public final void a(com.autonavi.aps.amapapi.restruct.e r7, com.autonavi.aps.amapapi.restruct.k r8, android.os.Handler r9) {
            r6 = this;
            com.autonavi.aps.amapapi.utils.d.a()
            boolean r0 = r6.f5687j
            if (r0 == 0) goto La
        L7:
            r5 = r6
            goto Lf9
        La:
            if (r7 == 0) goto L7
            if (r8 == 0) goto L7
            if (r9 != 0) goto L11
            goto L7
        L11:
            android.content.Context r0 = r6.a
            boolean r0 = com.autonavi.aps.amapapi.utils.j.m(r0)
            if (r0 == 0) goto L1d
            com.autonavi.aps.amapapi.utils.d.a()
            return
        L1d:
            r0 = 1
            r6.f5687j = r0
            r6.f5680c = r7
            r6.f5679b = r8
            r8.a(r6)
            com.autonavi.aps.amapapi.restruct.e r7 = r6.f5680c
            r7.a(r6)
            r6.f5684g = r9
            android.location.LocationManager r7 = r6.f5685h     // Catch: java.lang.Throwable -> Lef
            if (r7 != 0) goto L44
            android.content.Context r7 = r6.a     // Catch: java.lang.Throwable -> L3f
            java.lang.String r8 = "location"
            java.lang.Object r7 = r7.getSystemService(r8)     // Catch: java.lang.Throwable -> L3f
            android.location.LocationManager r7 = (android.location.LocationManager) r7     // Catch: java.lang.Throwable -> L3f
            r6.f5685h = r7     // Catch: java.lang.Throwable -> L3f
            goto L44
        L3f:
            r0 = move-exception
            r7 = r0
            r5 = r6
            goto Lf2
        L44:
            com.autonavi.aps.amapapi.c$a r7 = r6.f5686i     // Catch: java.lang.Throwable -> Lef
            if (r7 != 0) goto L4f
            com.autonavi.aps.amapapi.c$a r7 = new com.autonavi.aps.amapapi.c$a     // Catch: java.lang.Throwable -> L3f
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L3f
            r6.f5686i = r7     // Catch: java.lang.Throwable -> L3f
        L4f:
            com.autonavi.aps.amapapi.c$a r7 = r6.f5686i     // Catch: java.lang.Throwable -> Lef
            r7.a(r6)     // Catch: java.lang.Throwable -> Lef
            com.autonavi.aps.amapapi.c$a r5 = r6.f5686i     // Catch: java.lang.Throwable -> Lef
            if (r5 == 0) goto L65
            android.location.LocationManager r0 = r6.f5685h     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L65
            java.lang.String r1 = "passive"
            r2 = 1000(0x3e8, double:4.94E-321)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.requestLocationUpdates(r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L3f
        L65:
            com.amap.api.col.3l.h9 r7 = r6.f5681d     // Catch: java.lang.Throwable -> Lef
            if (r7 != 0) goto L7
            com.amap.api.col.3l.h9 r0 = new com.amap.api.col.3l.h9     // Catch: java.lang.Throwable -> Lef
            java.lang.String r1 = "6.4.3"
            android.content.Context r7 = r6.a     // Catch: java.lang.Throwable -> Lef
            java.lang.String r2 = com.amap.api.col.p0003l.f4.j(r7)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r3 = "S128DF1572465B890OE3F7A13167KLEI"
            android.content.Context r7 = r6.a     // Catch: java.lang.Throwable -> Lef
            java.lang.String r4 = com.amap.api.col.p0003l.f4.g(r7)     // Catch: java.lang.Throwable -> Lef
            r5 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lec
            r5.f5681d = r0     // Catch: java.lang.Throwable -> Lec
            java.lang.String r7 = com.amap.api.col.p0003l.i4.P()     // Catch: java.lang.Throwable -> Lec
            com.amap.api.col.3l.h9 r7 = r0.d(r7)     // Catch: java.lang.Throwable -> Lec
            android.content.Context r8 = r5.a     // Catch: java.lang.Throwable -> Lec
            java.lang.String r8 = com.amap.api.col.p0003l.i4.F(r8)     // Catch: java.lang.Throwable -> Lec
            com.amap.api.col.3l.h9 r7 = r7.i(r8)     // Catch: java.lang.Throwable -> Lec
            android.content.Context r8 = r5.a     // Catch: java.lang.Throwable -> Lec
            java.lang.String r8 = com.amap.api.col.p0003l.i4.o(r8)     // Catch: java.lang.Throwable -> Lec
            com.amap.api.col.3l.h9 r7 = r7.l(r8)     // Catch: java.lang.Throwable -> Lec
            android.content.Context r8 = r5.a     // Catch: java.lang.Throwable -> Lec
            java.lang.String r8 = com.amap.api.col.p0003l.i4.D(r8)     // Catch: java.lang.Throwable -> Lec
            com.amap.api.col.3l.h9 r7 = r7.m(r8)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r8 = com.amap.api.col.p0003l.i4.U()     // Catch: java.lang.Throwable -> Lec
            com.amap.api.col.3l.h9 r7 = r7.n(r8)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r8 = com.amap.api.col.p0003l.i4.E()     // Catch: java.lang.Throwable -> Lec
            com.amap.api.col.3l.h9 r7 = r7.o(r8)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r8 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> Lec
            com.amap.api.col.3l.h9 r7 = r7.p(r8)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r8 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> Lec
            com.amap.api.col.3l.h9 r7 = r7.q(r8)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r8 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> Lec
            com.amap.api.col.3l.h9 r7 = r7.r(r8)     // Catch: java.lang.Throwable -> Lec
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lec
            com.amap.api.col.3l.h9 r7 = r7.b(r8)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r8 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> Lec
            com.amap.api.col.3l.h9 r7 = r7.s(r8)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r8 = com.amap.api.col.p0003l.i4.I()     // Catch: java.lang.Throwable -> Lec
            long r8 = com.amap.api.col.p0003l.m9.a(r8)     // Catch: java.lang.Throwable -> Lec
            com.amap.api.col.3l.h9 r7 = r7.c(r8)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r8 = com.amap.api.col.p0003l.i4.I()     // Catch: java.lang.Throwable -> Lec
            r7.t(r8)     // Catch: java.lang.Throwable -> Lec
            com.amap.api.col.p0003l.h9.j()     // Catch: java.lang.Throwable -> Lec
            return
        Lec:
            r0 = move-exception
        Led:
            r7 = r0
            goto Lf2
        Lef:
            r0 = move-exception
            r5 = r6
            goto Led
        Lf2:
            java.lang.String r8 = "col"
            java.lang.String r9 = "init"
            com.autonavi.aps.amapapi.utils.b.a(r7, r8, r9)
        Lf9:
            return
    }

    public final void b() {
            r3 = this;
            com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L10
            android.os.Handler r0 = r3.f5684g     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            com.autonavi.aps.amapapi.c$1 r1 = new com.autonavi.aps.amapapi.c$1     // Catch: java.lang.Throwable -> L10
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L10
            r0.post(r1)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            goto L13
        L12:
            return
        L13:
            java.lang.String r1 = "cl"
            java.lang.String r2 = "upw"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    public final void c() {
            r3 = this;
            com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L13
            com.amap.api.col.3l.h9 r0 = r3.f5681d     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            com.autonavi.aps.amapapi.restruct.e r0 = r3.f5680c     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            java.util.List r0 = r0.a()     // Catch: java.lang.Throwable -> L13
            com.amap.api.col.p0003l.h9.e(r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r0 = move-exception
            goto L16
        L15:
            return
        L16:
            java.lang.String r1 = "cl"
            java.lang.String r2 = "upc"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    public final void d() {
            r5 = this;
            android.content.Context r0 = r5.a     // Catch: java.lang.Throwable -> L28
            boolean r0 = com.autonavi.aps.amapapi.utils.j.m(r0)     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto Lc
            com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L28
            return
        Lc:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L28
            long r2 = com.autonavi.aps.amapapi.c.f5678k     // Catch: java.lang.Throwable -> L28
            long r0 = r0 - r2
            r2 = 60000(0xea60, double:2.9644E-319)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L1b
            goto L28
        L1b:
            com.amap.api.col.3l.b8 r0 = com.amap.api.col.p0003l.b8.h()     // Catch: java.lang.Throwable -> L28
            com.autonavi.aps.amapapi.c$b r1 = new com.autonavi.aps.amapapi.c$b     // Catch: java.lang.Throwable -> L28
            r2 = 2
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L28
            r0.b(r1)     // Catch: java.lang.Throwable -> L28
        L28:
            return
    }

    public final void e() {
            r3 = this;
            com.amap.api.col.3l.b8 r0 = com.amap.api.col.p0003l.b8.h()     // Catch: java.lang.Throwable -> Ld
            com.autonavi.aps.amapapi.c$b r1 = new com.autonavi.aps.amapapi.c$b     // Catch: java.lang.Throwable -> Ld
            r2 = 3
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> Ld
            r0.b(r1)     // Catch: java.lang.Throwable -> Ld
        Ld:
            return
    }
}
