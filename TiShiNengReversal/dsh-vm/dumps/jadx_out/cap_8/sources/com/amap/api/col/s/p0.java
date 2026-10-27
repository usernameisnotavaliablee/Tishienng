package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class p0 implements com.amap.api.services.interfaces.INearbySearch {
    private static long l;
    private java.util.List<com.amap.api.services.nearby.NearbySearch.NearbyListener> a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f4600b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f4601c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.col.s.u4 f4602d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.concurrent.ExecutorService f4603e;

    /* renamed from: f, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f4604f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f4605g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4606h;

    /* renamed from: i, reason: collision with root package name */
    private java.util.Timer f4607i;

    /* renamed from: j, reason: collision with root package name */
    private com.amap.api.services.nearby.UploadInfoCallback f4608j;

    /* renamed from: k, reason: collision with root package name */
    private java.util.TimerTask f4609k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.s.p0 a;

        a(com.amap.api.col.s.p0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r4 = this;
                com.amap.api.col.s.p0 r0 = r4.a
                com.amap.api.col.s.u4 r0 = com.amap.api.col.s.p0.d(r0)
                android.os.Message r0 = r0.obtainMessage()
                r1 = 8
                r0.arg1 = r1
                com.amap.api.col.s.p0 r1 = r4.a
                java.util.List r1 = com.amap.api.col.s.p0.i(r1)
                r0.obj = r1
                com.amap.api.col.s.p0 r1 = r4.a     // Catch: java.lang.Throwable -> L31 com.amap.api.services.core.AMapException -> L33
                com.amap.api.col.s.p0.j(r1)     // Catch: java.lang.Throwable -> L31 com.amap.api.services.core.AMapException -> L33
                r1 = 1000(0x3e8, float:1.401E-42)
                r0.what = r1     // Catch: java.lang.Throwable -> L31 com.amap.api.services.core.AMapException -> L33
                com.amap.api.col.s.p0 r1 = r4.a
                com.amap.api.col.s.u4 r1 = com.amap.api.col.s.p0.d(r1)
                if (r1 == 0) goto L4a
            L27:
                com.amap.api.col.s.p0 r1 = r4.a
                com.amap.api.col.s.u4 r1 = com.amap.api.col.s.p0.d(r1)
                r1.sendMessage(r0)
                return
            L31:
                r1 = move-exception
                goto L4b
            L33:
                r1 = move-exception
                int r2 = r1.getErrorCode()     // Catch: java.lang.Throwable -> L31
                r0.what = r2     // Catch: java.lang.Throwable -> L31
                java.lang.String r2 = "NearbySearch"
                java.lang.String r3 = "clearUserInfoAsyn"
                com.amap.api.col.s.j4.i(r1, r2, r3)     // Catch: java.lang.Throwable -> L31
                com.amap.api.col.s.p0 r1 = r4.a
                com.amap.api.col.s.u4 r1 = com.amap.api.col.s.p0.d(r1)
                if (r1 == 0) goto L4a
                goto L27
            L4a:
                return
            L4b:
                com.amap.api.col.s.p0 r2 = r4.a
                com.amap.api.col.s.u4 r2 = com.amap.api.col.s.p0.d(r2)
                if (r2 == 0) goto L5c
                com.amap.api.col.s.p0 r2 = r4.a
                com.amap.api.col.s.u4 r2 = com.amap.api.col.s.p0.d(r2)
                r2.sendMessage(r0)
            L5c:
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.nearby.UploadInfo a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.p0 f4610b;

        b(com.amap.api.col.s.p0 r1, com.amap.api.services.nearby.UploadInfo r2) {
                r0 = this;
                r0.f4610b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                com.amap.api.col.s.p0 r0 = r3.f4610b     // Catch: java.lang.Throwable -> L2a
                com.amap.api.col.s.u4 r0 = com.amap.api.col.s.p0.d(r0)     // Catch: java.lang.Throwable -> L2a
                android.os.Message r0 = r0.obtainMessage()     // Catch: java.lang.Throwable -> L2a
                r1 = 10
                r0.arg1 = r1     // Catch: java.lang.Throwable -> L2a
                com.amap.api.col.s.p0 r1 = r3.f4610b     // Catch: java.lang.Throwable -> L2a
                java.util.List r1 = com.amap.api.col.s.p0.i(r1)     // Catch: java.lang.Throwable -> L2a
                r0.obj = r1     // Catch: java.lang.Throwable -> L2a
                com.amap.api.col.s.p0 r1 = r3.f4610b     // Catch: java.lang.Throwable -> L2a
                com.amap.api.services.nearby.UploadInfo r2 = r3.a     // Catch: java.lang.Throwable -> L2a
                int r1 = com.amap.api.col.s.p0.b(r1, r2)     // Catch: java.lang.Throwable -> L2a
                r0.what = r1     // Catch: java.lang.Throwable -> L2a
                com.amap.api.col.s.p0 r1 = r3.f4610b     // Catch: java.lang.Throwable -> L2a
                com.amap.api.col.s.u4 r1 = com.amap.api.col.s.p0.d(r1)     // Catch: java.lang.Throwable -> L2a
                r1.sendMessage(r0)     // Catch: java.lang.Throwable -> L2a
                return
            L2a:
                r0 = move-exception
                java.lang.String r1 = "NearbySearch"
                java.lang.String r2 = "uploadNearbyInfoAsyn"
                com.amap.api.col.s.j4.i(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class c implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.nearby.NearbySearch.NearbyQuery a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.p0 f4611b;

        c(com.amap.api.col.s.p0 r1, com.amap.api.services.nearby.NearbySearch.NearbyQuery r2) {
                r0 = this;
                r0.f4611b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r4 = this;
                com.amap.api.col.s.p0 r0 = r4.f4611b
                com.amap.api.col.s.u4 r0 = com.amap.api.col.s.p0.d(r0)
                android.os.Message r0 = r0.obtainMessage()
                r1 = 9
                r0.arg1 = r1
                com.amap.api.col.s.u4$g r1 = new com.amap.api.col.s.u4$g
                r1.<init>()
                com.amap.api.col.s.p0 r2 = r4.f4611b
                java.util.List r2 = com.amap.api.col.s.p0.i(r2)
                r1.a = r2
                r0.obj = r1
                com.amap.api.col.s.p0 r2 = r4.f4611b     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                com.amap.api.services.nearby.NearbySearch$NearbyQuery r3 = r4.a     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                com.amap.api.services.nearby.NearbySearchResult r2 = r2.searchNearbyInfo(r3)     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                r1.f4741b = r2     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                r1 = 1000(0x3e8, float:1.401E-42)
                r0.what = r1     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                com.amap.api.col.s.p0 r1 = r4.f4611b
                com.amap.api.col.s.u4 r1 = com.amap.api.col.s.p0.d(r1)
                if (r1 == 0) goto L56
            L33:
                com.amap.api.col.s.p0 r1 = r4.f4611b
                com.amap.api.col.s.u4 r1 = com.amap.api.col.s.p0.d(r1)
                r1.sendMessage(r0)
                return
            L3d:
                r1 = move-exception
                goto L57
            L3f:
                r1 = move-exception
                int r2 = r1.getErrorCode()     // Catch: java.lang.Throwable -> L3d
                r0.what = r2     // Catch: java.lang.Throwable -> L3d
                java.lang.String r2 = "NearbySearch"
                java.lang.String r3 = "searchNearbyInfoAsyn"
                com.amap.api.col.s.j4.i(r1, r2, r3)     // Catch: java.lang.Throwable -> L3d
                com.amap.api.col.s.p0 r1 = r4.f4611b
                com.amap.api.col.s.u4 r1 = com.amap.api.col.s.p0.d(r1)
                if (r1 == 0) goto L56
                goto L33
            L56:
                return
            L57:
                com.amap.api.col.s.p0 r2 = r4.f4611b
                com.amap.api.col.s.u4 r2 = com.amap.api.col.s.p0.d(r2)
                if (r2 == 0) goto L68
                com.amap.api.col.s.p0 r2 = r4.f4611b
                com.amap.api.col.s.u4 r2 = com.amap.api.col.s.p0.d(r2)
                r2.sendMessage(r0)
            L68:
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class d extends java.util.TimerTask {
        final /* synthetic */ com.amap.api.col.s.p0 a;

        private d(com.amap.api.col.s.p0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ d(com.amap.api.col.s.p0 r1, byte r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
                r3 = this;
                com.amap.api.col.s.p0 r0 = r3.a     // Catch: java.lang.Throwable -> L3a
                com.amap.api.services.nearby.UploadInfoCallback r0 = com.amap.api.col.s.p0.k(r0)     // Catch: java.lang.Throwable -> L3a
                if (r0 == 0) goto L3c
                com.amap.api.col.s.p0 r0 = r3.a     // Catch: java.lang.Throwable -> L3a
                com.amap.api.services.nearby.UploadInfoCallback r0 = com.amap.api.col.s.p0.k(r0)     // Catch: java.lang.Throwable -> L3a
                com.amap.api.services.nearby.UploadInfo r0 = r0.OnUploadInfoCallback()     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.s.p0 r1 = r3.a     // Catch: java.lang.Throwable -> L3a
                int r0 = com.amap.api.col.s.p0.g(r1, r0)     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.s.p0 r1 = r3.a     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.s.u4 r1 = com.amap.api.col.s.p0.d(r1)     // Catch: java.lang.Throwable -> L3a
                android.os.Message r1 = r1.obtainMessage()     // Catch: java.lang.Throwable -> L3a
                r2 = 10
                r1.arg1 = r2     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.s.p0 r2 = r3.a     // Catch: java.lang.Throwable -> L3a
                java.util.List r2 = com.amap.api.col.s.p0.i(r2)     // Catch: java.lang.Throwable -> L3a
                r1.obj = r2     // Catch: java.lang.Throwable -> L3a
                r1.what = r0     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.s.p0 r0 = r3.a     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.s.u4 r0 = com.amap.api.col.s.p0.d(r0)     // Catch: java.lang.Throwable -> L3a
                r0.sendMessage(r1)     // Catch: java.lang.Throwable -> L3a
                return
            L3a:
                r0 = move-exception
                goto L3d
            L3c:
                return
            L3d:
                java.lang.String r1 = "NearbySearch"
                java.lang.String r2 = "UpdateDataTask"
                com.amap.api.col.s.j4.i(r0, r1, r2)
                return
        }
    }

    static {
            return
    }

    public p0(android.content.Context r4) throws com.amap.api.services.core.AMapException {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.a = r0
            r0 = 0
            r3.f4604f = r0
            r3.f4605g = r0
            r0 = 0
            r3.f4606h = r0
            java.util.Timer r1 = new java.util.Timer
            r1.<init>()
            r3.f4607i = r1
            com.amap.api.col.s.i1 r0 = com.amap.api.col.s.i4.a(r0)
            com.amap.api.col.s.h1 r0 = com.amap.api.col.s.cf.a(r4, r0)
            com.amap.api.col.s.cf$c r1 = r0.a
            com.amap.api.col.s.cf$c r2 = com.amap.api.col.s.cf.c.a
            if (r1 != r2) goto L38
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            r3.f4601c = r4
            com.amap.api.col.s.u4 r4 = com.amap.api.col.s.u4.a()
            r3.f4602d = r4
            return
        L38:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException
            java.lang.String r1 = r0.f4470b
            com.amap.api.col.s.cf$c r0 = r0.a
            int r0 = r0.a()
            r2 = 1
            r4.<init>(r1, r2, r1, r0)
            throw r4
    }

    private int a() throws com.amap.api.services.core.AMapException {
            r3 = this;
            boolean r0 = r3.f4606h     // Catch: com.amap.api.services.core.AMapException -> L25 java.lang.Throwable -> L37
            if (r0 != 0) goto L2f
            java.lang.String r0 = r3.f4600b     // Catch: com.amap.api.services.core.AMapException -> L25 java.lang.Throwable -> L37
            boolean r0 = f(r0)     // Catch: com.amap.api.services.core.AMapException -> L25 java.lang.Throwable -> L37
            if (r0 == 0) goto L27
            android.content.Context r0 = r3.f4601c     // Catch: com.amap.api.services.core.AMapException -> L25 java.lang.Throwable -> L37
            com.amap.api.col.s.s4.d(r0)     // Catch: com.amap.api.services.core.AMapException -> L25 java.lang.Throwable -> L37
            com.amap.api.col.s.v4 r0 = new com.amap.api.col.s.v4     // Catch: com.amap.api.services.core.AMapException -> L25 java.lang.Throwable -> L37
            android.content.Context r1 = r3.f4601c     // Catch: com.amap.api.services.core.AMapException -> L25 java.lang.Throwable -> L37
            java.lang.String r2 = r3.f4600b     // Catch: com.amap.api.services.core.AMapException -> L25 java.lang.Throwable -> L37
            r0.<init>(r1, r2)     // Catch: com.amap.api.services.core.AMapException -> L25 java.lang.Throwable -> L37
            java.lang.Object r0 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L25 java.lang.Throwable -> L37
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: com.amap.api.services.core.AMapException -> L25 java.lang.Throwable -> L37
            int r0 = r0.intValue()     // Catch: com.amap.api.services.core.AMapException -> L25 java.lang.Throwable -> L37
            return r0
        L25:
            r0 = move-exception
            goto L3f
        L27:
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L25 java.lang.Throwable -> L37
            java.lang.String r1 = "USERID非法"
            r0.<init>(r1)     // Catch: com.amap.api.services.core.AMapException -> L25 java.lang.Throwable -> L37
            throw r0     // Catch: com.amap.api.services.core.AMapException -> L25 java.lang.Throwable -> L37
        L2f:
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L25 java.lang.Throwable -> L37
            java.lang.String r1 = "已开启自动上传"
            r0.<init>(r1)     // Catch: com.amap.api.services.core.AMapException -> L25 java.lang.Throwable -> L37
            throw r0     // Catch: com.amap.api.services.core.AMapException -> L25 java.lang.Throwable -> L37
        L37:
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException
            java.lang.String r1 = "未知错误"
            r0.<init>(r1)
            throw r0
        L3f:
            throw r0
    }

    static /* synthetic */ int b(com.amap.api.col.s.p0 r0, com.amap.api.services.nearby.UploadInfo r1) {
            int r0 = r0.c(r1)
            return r0
    }

    private int c(com.amap.api.services.nearby.UploadInfo r2) {
            r1 = this;
            boolean r0 = r1.f4606h
            if (r0 == 0) goto L7
            r2 = 2200(0x898, float:3.083E-42)
            return r2
        L7:
            int r2 = r1.h(r2)
            return r2
    }

    static /* synthetic */ com.amap.api.col.s.u4 d(com.amap.api.col.s.p0 r0) {
            com.amap.api.col.s.u4 r0 = r0.f4602d
            return r0
    }

    private static boolean e(com.amap.api.services.nearby.NearbySearch.NearbyQuery r1) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            com.amap.api.services.core.LatLonPoint r1 = r1.getCenterPoint()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            r1 = 1
            return r1
    }

    private static boolean f(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = "^[a-z0-9A-Z_-]{1,32}$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.find()
            return r1
    }

    static /* synthetic */ int g(com.amap.api.col.s.p0 r0, com.amap.api.services.nearby.UploadInfo r1) {
            int r0 = r0.h(r1)
            return r0
    }

    private int h(com.amap.api.services.nearby.UploadInfo r8) {
            r7 = this;
            android.content.Context r0 = r7.f4601c     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            com.amap.api.col.s.s4.d(r0)     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            if (r8 != 0) goto La
            r8 = 2202(0x89a, float:3.086E-42)
            return r8
        La:
            java.util.Date r0 = new java.util.Date     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            r0.<init>()     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            long r0 = r0.getTime()     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            long r2 = com.amap.api.col.s.p0.l     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            long r2 = r0 - r2
            r4 = 6500(0x1964, double:3.2114E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L20
            r8 = 2203(0x89b, float:3.087E-42)
            return r8
        L20:
            com.amap.api.col.s.p0.l = r0     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            java.lang.String r0 = r8.getUserID()     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            boolean r1 = f(r0)     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            r2 = 2201(0x899, float:3.084E-42)
            if (r1 != 0) goto L2f
            return r2
        L2f:
            java.lang.String r1 = r7.f4605g     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            if (r1 == 0) goto L3c
            r7.f4605g = r0     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            goto L3c
        L3a:
            r8 = move-exception
            goto L6d
        L3c:
            java.lang.String r1 = r7.f4605g     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            boolean r0 = r0.equals(r1)     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            if (r0 != 0) goto L45
            return r2
        L45:
            com.amap.api.services.core.LatLonPoint r0 = r8.getPoint()     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            if (r0 == 0) goto L67
            com.amap.api.services.core.LatLonPoint r1 = r7.f4604f     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            boolean r1 = r0.equals(r1)     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            if (r1 == 0) goto L54
            goto L67
        L54:
            com.amap.api.col.s.c r1 = new com.amap.api.col.s.c     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            android.content.Context r2 = r7.f4601c     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            r1.<init>(r2, r8)     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            r1.O()     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            com.amap.api.services.core.LatLonPoint r8 = r0.copy()     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            r7.f4604f = r8     // Catch: com.amap.api.services.core.AMapException -> L3a java.lang.Throwable -> L6a
            r8 = 1000(0x3e8, float:1.401E-42)
            return r8
        L67:
            r8 = 2204(0x89c, float:3.088E-42)
            return r8
        L6a:
            r8 = 1900(0x76c, float:2.662E-42)
            return r8
        L6d:
            int r8 = r8.getErrorCode()
            return r8
    }

    static /* synthetic */ java.util.List i(com.amap.api.col.s.p0 r0) {
            java.util.List<com.amap.api.services.nearby.NearbySearch$NearbyListener> r0 = r0.a
            return r0
    }

    static /* synthetic */ int j(com.amap.api.col.s.p0 r0) throws com.amap.api.services.core.AMapException {
            int r0 = r0.a()
            return r0
    }

    static /* synthetic */ com.amap.api.services.nearby.UploadInfoCallback k(com.amap.api.col.s.p0 r0) {
            com.amap.api.services.nearby.UploadInfoCallback r0 = r0.f4608j
            return r0
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final synchronized void addNearbyListener(com.amap.api.services.nearby.NearbySearch.NearbyListener r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.amap.api.services.nearby.NearbySearch$NearbyListener> r0 = r2.a     // Catch: java.lang.Throwable -> L8
            r0.add(r3)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)
            return
        L8:
            r3 = move-exception
            java.lang.String r0 = "NearbySearch"
            java.lang.String r1 = "addNearbyListener"
            com.amap.api.col.s.j4.i(r3, r0, r1)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return
        L12:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final void clearUserInfoAsyn() {
            r3 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.s.p0$a r1 = new com.amap.api.col.s.p0$a     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Ld
            r0.b(r1)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r0 = move-exception
            java.lang.String r1 = "NearbySearch"
            java.lang.String r2 = "clearUserInfoAsynThrowable"
            com.amap.api.col.s.j4.i(r0, r1, r2)
            return
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final synchronized void destroy() {
            r3 = this;
            monitor-enter(r3)
            java.util.Timer r0 = r3.f4607i     // Catch: java.lang.Throwable -> L8
            r0.cancel()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r3)
            return
        L8:
            r0 = move-exception
            java.lang.String r1 = "NearbySearch"
            java.lang.String r2 = "destryoy"
            com.amap.api.col.s.j4.i(r0, r1, r2)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)
            return
        L12:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final synchronized void removeNearbyListener(com.amap.api.services.nearby.NearbySearch.NearbyListener r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L5
            monitor-exit(r2)
            return
        L5:
            java.util.List<com.amap.api.services.nearby.NearbySearch$NearbyListener> r0 = r2.a     // Catch: java.lang.Throwable -> Lc
            r0.remove(r3)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        Lc:
            r3 = move-exception
            java.lang.String r0 = "NearbySearch"
            java.lang.String r1 = "removeNearbyListener"
            com.amap.api.col.s.j4.i(r3, r0, r1)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            return
        L16:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r3
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final com.amap.api.services.nearby.NearbySearchResult searchNearbyInfo(com.amap.api.services.nearby.NearbySearch.NearbyQuery r3) throws com.amap.api.services.core.AMapException {
            r2 = this;
            android.content.Context r0 = r2.f4601c     // Catch: java.lang.Throwable -> L19 com.amap.api.services.core.AMapException -> L1b
            com.amap.api.col.s.s4.d(r0)     // Catch: java.lang.Throwable -> L19 com.amap.api.services.core.AMapException -> L1b
            boolean r0 = e(r3)     // Catch: java.lang.Throwable -> L19 com.amap.api.services.core.AMapException -> L1b
            if (r0 == 0) goto L1d
            com.amap.api.col.s.b r0 = new com.amap.api.col.s.b     // Catch: java.lang.Throwable -> L19 com.amap.api.services.core.AMapException -> L1b
            android.content.Context r1 = r2.f4601c     // Catch: java.lang.Throwable -> L19 com.amap.api.services.core.AMapException -> L1b
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L19 com.amap.api.services.core.AMapException -> L1b
            java.lang.Object r3 = r0.O()     // Catch: java.lang.Throwable -> L19 com.amap.api.services.core.AMapException -> L1b
            com.amap.api.services.nearby.NearbySearchResult r3 = (com.amap.api.services.nearby.NearbySearchResult) r3     // Catch: java.lang.Throwable -> L19 com.amap.api.services.core.AMapException -> L1b
            return r3
        L19:
            r3 = move-exception
            goto L25
        L1b:
            r3 = move-exception
            goto L34
        L1d:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException     // Catch: java.lang.Throwable -> L19 com.amap.api.services.core.AMapException -> L1b
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L19 com.amap.api.services.core.AMapException -> L1b
            throw r3     // Catch: java.lang.Throwable -> L19 com.amap.api.services.core.AMapException -> L1b
        L25:
            java.lang.String r0 = "NearbySearch"
            java.lang.String r1 = "searchNearbyInfo"
            com.amap.api.col.s.j4.i(r3, r0, r1)
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "未知错误"
            r3.<init>(r0)
            throw r3
        L34:
            throw r3
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final void searchNearbyInfoAsyn(com.amap.api.services.nearby.NearbySearch.NearbyQuery r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.s.p0$c r1 = new com.amap.api.col.s.p0$c     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Ld
            r0.b(r1)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            java.lang.String r0 = "NearbySearch"
            java.lang.String r1 = "searchNearbyInfoAsynThrowable"
            com.amap.api.col.s.j4.i(r3, r0, r1)
            return
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final void setUserID(java.lang.String r1) {
            r0 = this;
            r0.f4600b = r1
            return
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final synchronized void startUploadNearbyInfoAuto(com.amap.api.services.nearby.UploadInfoCallback r7, int r8) {
            r6 = this;
            monitor-enter(r6)
            r0 = 7000(0x1b58, float:9.809E-42)
            if (r8 >= r0) goto L7
            r8 = 7000(0x1b58, float:9.809E-42)
        L7:
            r6.f4608j = r7     // Catch: java.lang.Throwable -> L15
            boolean r7 = r6.f4606h     // Catch: java.lang.Throwable -> L15
            if (r7 == 0) goto L18
            java.util.TimerTask r7 = r6.f4609k     // Catch: java.lang.Throwable -> L15
            if (r7 == 0) goto L18
            r7.cancel()     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r0 = move-exception
            r7 = r0
            goto L2d
        L18:
            r7 = 1
            r6.f4606h = r7     // Catch: java.lang.Throwable -> L15
            com.amap.api.col.s.p0$d r1 = new com.amap.api.col.s.p0$d     // Catch: java.lang.Throwable -> L15
            r7 = 0
            r1.<init>(r6, r7)     // Catch: java.lang.Throwable -> L15
            r6.f4609k = r1     // Catch: java.lang.Throwable -> L15
            java.util.Timer r0 = r6.f4607i     // Catch: java.lang.Throwable -> L15
            r2 = 0
            long r4 = (long) r8     // Catch: java.lang.Throwable -> L15
            r0.schedule(r1, r2, r4)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r6)
            return
        L2d:
            java.lang.String r8 = "NearbySearch"
            java.lang.String r0 = "startUploadNearbyInfoAuto"
            com.amap.api.col.s.j4.i(r7, r8, r0)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r6)
            return
        L36:
            r0 = move-exception
            r7 = r0
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L36
            throw r7
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final synchronized void stopUploadNearbyInfoAuto() {
            r3 = this;
            monitor-enter(r3)
            java.util.TimerTask r0 = r3.f4609k     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L11
            r0.cancel()     // Catch: java.lang.Throwable -> L9
            goto L11
        L9:
            r0 = move-exception
            java.lang.String r1 = "NearbySearch"
            java.lang.String r2 = "stopUploadNearbyInfoAuto"
            com.amap.api.col.s.j4.i(r0, r1, r2)     // Catch: java.lang.Throwable -> L19
        L11:
            r0 = 0
            r3.f4606h = r0     // Catch: java.lang.Throwable -> L19
            r0 = 0
            r3.f4609k = r0     // Catch: java.lang.Throwable -> L19
            monitor-exit(r3)
            return
        L19:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
            throw r0
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final void uploadNearbyInfoAsyn(com.amap.api.services.nearby.UploadInfo r3) {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = r2.f4603e
            if (r0 != 0) goto La
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r2.f4603e = r0
        La:
            java.util.concurrent.ExecutorService r0 = r2.f4603e
            com.amap.api.col.s.p0$b r1 = new com.amap.api.col.s.p0$b
            r1.<init>(r2, r3)
            r0.submit(r1)
            return
    }
}
