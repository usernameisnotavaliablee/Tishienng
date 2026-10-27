package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class u1 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f4719e = null;

    /* renamed from: f, reason: collision with root package name */
    private static com.amap.api.col.s.u1 f4720f;
    private java.util.List<java.lang.String> a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f4721b;

    /* renamed from: c, reason: collision with root package name */
    private final android.content.Context f4722c;

    /* renamed from: d, reason: collision with root package name */
    private final android.os.Handler f4723d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends java.lang.Thread {
        final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f4724b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.u1 f4725c;

        a(com.amap.api.col.s.u1 r1, java.lang.String r2, int r3) {
                r0 = this;
                r0.f4725c = r1
                r0.a = r2
                r0.f4724b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
                r4 = this;
                java.lang.String r0 = r4.a
                java.lang.String r0 = com.amap.api.col.s.a2.h(r0)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 != 0) goto L85
                int r1 = r4.f4724b
                r1 = r1 & 1
                if (r1 <= 0) goto L4d
                int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L38
                r2 = 23
                if (r1 < r2) goto L3a
                com.amap.api.col.s.u1 r1 = r4.f4725c     // Catch: java.lang.Exception -> L38
                android.content.Context r1 = com.amap.api.col.s.u1.a(r1)     // Catch: java.lang.Exception -> L38
                boolean r1 = com.amap.api.col.p0003l.h5.a(r1)     // Catch: java.lang.Exception -> L38
                if (r1 == 0) goto L4d
                com.amap.api.col.s.u1 r1 = r4.f4725c     // Catch: java.lang.Exception -> L38
                android.content.Context r1 = com.amap.api.col.s.u1.a(r1)     // Catch: java.lang.Exception -> L38
                android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Exception -> L38
                com.amap.api.col.s.u1 r2 = r4.f4725c     // Catch: java.lang.Exception -> L38
                java.lang.String r2 = com.amap.api.col.s.u1.f(r2)     // Catch: java.lang.Exception -> L38
                android.provider.Settings.System.putString(r1, r2, r0)     // Catch: java.lang.Exception -> L38
                goto L4d
            L38:
                goto L4d
            L3a:
                com.amap.api.col.s.u1 r1 = r4.f4725c     // Catch: java.lang.Exception -> L38
                android.content.Context r1 = com.amap.api.col.s.u1.a(r1)     // Catch: java.lang.Exception -> L38
                android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Exception -> L38
                com.amap.api.col.s.u1 r2 = r4.f4725c     // Catch: java.lang.Exception -> L38
                java.lang.String r2 = com.amap.api.col.s.u1.f(r2)     // Catch: java.lang.Exception -> L38
                android.provider.Settings.System.putString(r1, r2, r0)     // Catch: java.lang.Exception -> L38
            L4d:
                int r1 = r4.f4724b
                r1 = r1 & 16
                if (r1 <= 0) goto L62
                com.amap.api.col.s.u1 r1 = r4.f4725c
                android.content.Context r1 = com.amap.api.col.s.u1.a(r1)
                com.amap.api.col.s.u1 r2 = r4.f4725c
                java.lang.String r2 = com.amap.api.col.s.u1.f(r2)
                com.amap.api.col.s.w1.b(r1, r2, r0)
            L62:
                int r1 = r4.f4724b
                r1 = r1 & 256(0x100, float:3.59E-43)
                if (r1 <= 0) goto L85
                com.amap.api.col.s.u1 r1 = r4.f4725c
                android.content.Context r1 = com.amap.api.col.s.u1.a(r1)
                java.lang.String r2 = com.amap.api.col.s.u1.f4719e
                r3 = 0
                android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
                android.content.SharedPreferences$Editor r1 = r1.edit()
                com.amap.api.col.s.u1 r2 = r4.f4725c
                java.lang.String r2 = com.amap.api.col.s.u1.f(r2)
                r1.putString(r2, r0)
                r1.apply()
            L85:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b extends android.os.Handler {
        private final java.lang.ref.WeakReference<com.amap.api.col.s.u1> a;

        b(android.os.Looper r1, com.amap.api.col.s.u1 r2) {
                r0 = this;
                r0.<init>(r1)
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r2)
                r0.a = r1
                return
        }

        b(com.amap.api.col.s.u1 r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.a = r0
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r3) {
                r2 = this;
                java.lang.ref.WeakReference<com.amap.api.col.s.u1> r0 = r2.a
                java.lang.Object r0 = r0.get()
                com.amap.api.col.s.u1 r0 = (com.amap.api.col.s.u1) r0
                if (r0 != 0) goto Lb
                goto L19
            Lb:
                if (r3 == 0) goto L19
                java.lang.Object r1 = r3.obj
                if (r1 != 0) goto L12
                goto L19
            L12:
                java.lang.String r1 = (java.lang.String) r1
                int r3 = r3.what
                com.amap.api.col.s.u1.c(r0, r1, r3)
            L19:
                return
        }
    }

    static {
            java.lang.String r0 = "SU2hhcmVkUHJlZmVyZW5jZUFkaXU"
            java.lang.String r0 = com.amap.api.col.s.j1.t(r0)
            com.amap.api.col.s.u1.f4719e = r0
            return
    }

    private u1(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.f4722c = r2
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 != 0) goto L1f
            com.amap.api.col.s.u1$b r2 = new com.amap.api.col.s.u1$b
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0, r1)
            r1.f4723d = r2
            return
        L1f:
            com.amap.api.col.s.u1$b r2 = new com.amap.api.col.s.u1$b
            r2.<init>(r1)
            r1.f4723d = r2
            return
    }

    static /* synthetic */ android.content.Context a(com.amap.api.col.s.u1 r0) {
            android.content.Context r0 = r0.f4722c
            return r0
    }

    public static com.amap.api.col.s.u1 b(android.content.Context r2) {
            com.amap.api.col.s.u1 r0 = com.amap.api.col.s.u1.f4720f
            if (r0 != 0) goto L19
            java.lang.Class<com.amap.api.col.s.u1> r0 = com.amap.api.col.s.u1.class
            monitor-enter(r0)
            com.amap.api.col.s.u1 r1 = com.amap.api.col.s.u1.f4720f     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.amap.api.col.s.u1 r1 = new com.amap.api.col.s.u1     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.amap.api.col.s.u1.f4720f = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            com.amap.api.col.s.u1 r2 = com.amap.api.col.s.u1.f4720f
            return r2
    }

    static /* synthetic */ void c(com.amap.api.col.s.u1 r0, java.lang.String r1, int r2) {
            r0.e(r1, r2)
            return
    }

    private synchronized void e(java.lang.String r3, int r4) {
            r2 = this;
            monitor-enter(r2)
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L15
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L15
            if (r0 != r1) goto L17
            com.amap.api.col.s.u1$a r0 = new com.amap.api.col.s.u1$a     // Catch: java.lang.Throwable -> L15
            r0.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L15
            r0.start()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            return
        L15:
            r3 = move-exception
            goto L6c
        L17:
            java.lang.String r3 = com.amap.api.col.s.a2.h(r3)     // Catch: java.lang.Throwable -> L15
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L6a
            r0 = r4 & 1
            if (r0 <= 0) goto L44
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L37
            r1 = 23
            if (r0 < r1) goto L39
            android.content.Context r0 = r2.f4722c     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L37
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L37
            java.lang.String r1 = r2.f4721b     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L37
            android.provider.Settings.System.putString(r0, r1, r3)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L37
            goto L44
        L37:
            goto L44
        L39:
            android.content.Context r0 = r2.f4722c     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L37
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L37
            java.lang.String r1 = r2.f4721b     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L37
            android.provider.Settings.System.putString(r0, r1, r3)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L37
        L44:
            r0 = r4 & 16
            if (r0 <= 0) goto L4f
            android.content.Context r0 = r2.f4722c     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = r2.f4721b     // Catch: java.lang.Throwable -> L15
            com.amap.api.col.s.w1.b(r0, r1, r3)     // Catch: java.lang.Throwable -> L15
        L4f:
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 <= 0) goto L6a
            android.content.Context r4 = r2.f4722c     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = com.amap.api.col.s.u1.f4719e     // Catch: java.lang.Throwable -> L15
            r1 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L15
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = r2.f4721b     // Catch: java.lang.Throwable -> L15
            r4.putString(r0, r3)     // Catch: java.lang.Throwable -> L15
            r4.apply()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            return
        L6a:
            monitor-exit(r2)
            return
        L6c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    static /* synthetic */ java.lang.String f(com.amap.api.col.s.u1 r0) {
            java.lang.String r0 = r0.f4721b
            return r0
    }

    public final void d(java.lang.String r1) {
            r0 = this;
            r0.f4721b = r1
            return
    }

    public final void g(java.lang.String r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.a
            if (r0 == 0) goto Lc
            r0.clear()
            java.util.List<java.lang.String> r0 = r1.a
            r0.add(r2)
        Lc:
            r0 = 273(0x111, float:3.83E-43)
            r1.e(r2, r0)
            return
    }
}
