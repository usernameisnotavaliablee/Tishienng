package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class s4 {

    /* renamed from: c, reason: collision with root package name */
    private static com.amap.api.col.s.s4 f4694c;

    /* renamed from: d, reason: collision with root package name */
    private static android.content.Context f4695d;

    /* renamed from: e, reason: collision with root package name */
    public static com.amap.api.col.s.i1 f4696e;
    private com.amap.api.col.s.s4.b a;

    /* renamed from: b, reason: collision with root package name */
    private android.os.HandlerThread f4697b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends android.os.HandlerThread {
        final /* synthetic */ com.amap.api.col.s.s4 a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.amap.api.col.s.s4$a$a, reason: collision with other inner class name */
        final class C0089a implements com.amap.api.col.s.y0.b {
            final /* synthetic */ com.amap.api.col.s.s4.a a;

            C0089a(com.amap.api.col.s.s4.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.amap.api.col.s.y0.b
            public final void a(com.amap.api.col.s.y0.c r7) {
                    r6 = this;
                    android.os.Message r0 = new android.os.Message
                    r0.<init>()
                    r1 = 3
                    if (r7 == 0) goto L1a
                    com.amap.api.col.s.y0$c$a r2 = r7.f4876g     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L1a
                    com.amap.api.col.s.t4 r3 = new com.amap.api.col.s.t4     // Catch: java.lang.Throwable -> L18
                    boolean r4 = r2.f4879b     // Catch: java.lang.Throwable -> L18
                    boolean r2 = r2.a     // Catch: java.lang.Throwable -> L18
                    r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L18
                    r0.obj = r3     // Catch: java.lang.Throwable -> L18
                    goto L1a
                L18:
                    r7 = move-exception
                    goto L59
                L1a:
                    java.lang.String r2 = "amap_search"
                    if (r7 == 0) goto L3a
                    org.json.JSONObject r3 = r7.f4875f     // Catch: java.lang.Throwable -> L18
                    if (r3 == 0) goto L3a
                    java.lang.String r4 = "184"
                    org.json.JSONObject r3 = r3.optJSONObject(r4)     // Catch: java.lang.Throwable -> L18
                    if (r3 == 0) goto L3a
                    com.amap.api.col.s.s4.f(r3)     // Catch: java.lang.Throwable -> L18
                    android.content.Context r4 = com.amap.api.col.s.s4.a()     // Catch: java.lang.Throwable -> L18
                    java.lang.String r5 = "cache_control"
                    java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L18
                    com.amap.api.col.s.w.a(r4, r2, r5, r3)     // Catch: java.lang.Throwable -> L18
                L3a:
                    if (r7 == 0) goto L91
                    org.json.JSONObject r7 = r7.f4875f     // Catch: java.lang.Throwable -> L18
                    if (r7 == 0) goto L91
                    java.lang.String r3 = "185"
                    org.json.JSONObject r7 = r7.optJSONObject(r3)     // Catch: java.lang.Throwable -> L18
                    if (r7 == 0) goto L91
                    com.amap.api.col.s.s4.i(r7)     // Catch: java.lang.Throwable -> L18
                    android.content.Context r3 = com.amap.api.col.s.s4.a()     // Catch: java.lang.Throwable -> L18
                    java.lang.String r4 = "parm_control"
                    java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L18
                    com.amap.api.col.s.w.a(r3, r2, r4, r7)     // Catch: java.lang.Throwable -> L18
                    goto L91
                L59:
                    java.lang.String r2 = "ManifestConfig"
                    java.lang.String r3 = "run"
                    com.amap.api.col.s.j4.i(r7, r2, r3)     // Catch: java.lang.Throwable -> L78
                    r0.what = r1
                    com.amap.api.col.s.s4$a r7 = r6.a
                    com.amap.api.col.s.s4 r7 = r7.a
                    com.amap.api.col.s.s4$b r7 = com.amap.api.col.s.s4.c(r7)
                    if (r7 == 0) goto L9e
                L6c:
                    com.amap.api.col.s.s4$a r7 = r6.a
                    com.amap.api.col.s.s4 r7 = r7.a
                    com.amap.api.col.s.s4$b r7 = com.amap.api.col.s.s4.c(r7)
                    r7.sendMessage(r0)
                    return
                L78:
                    r7 = move-exception
                    r0.what = r1
                    com.amap.api.col.s.s4$a r1 = r6.a
                    com.amap.api.col.s.s4 r1 = r1.a
                    com.amap.api.col.s.s4$b r1 = com.amap.api.col.s.s4.c(r1)
                    if (r1 == 0) goto L90
                    com.amap.api.col.s.s4$a r1 = r6.a
                    com.amap.api.col.s.s4 r1 = r1.a
                    com.amap.api.col.s.s4$b r1 = com.amap.api.col.s.s4.c(r1)
                    r1.sendMessage(r0)
                L90:
                    throw r7
                L91:
                    r0.what = r1
                    com.amap.api.col.s.s4$a r7 = r6.a
                    com.amap.api.col.s.s4 r7 = r7.a
                    com.amap.api.col.s.s4$b r7 = com.amap.api.col.s.s4.c(r7)
                    if (r7 == 0) goto L9e
                    goto L6c
                L9e:
                    return
            }
        }

        a(com.amap.api.col.s.s4 r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
                r4 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.String r1 = "ManifestConfigThread"
                r0.setName(r1)
                r0 = 0
                com.amap.api.col.s.i1 r0 = com.amap.api.col.s.i4.a(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "11K"
                r1.append(r2)
                java.lang.String r2 = ";"
                r1.append(r2)
                java.lang.String r3 = "001"
                r1.append(r3)
                r1.append(r2)
                java.lang.String r3 = "184"
                r1.append(r3)
                r1.append(r2)
                java.lang.String r2 = "185"
                r1.append(r2)
                android.content.Context r2 = com.amap.api.col.s.s4.a()
                com.amap.api.col.s.s4.h(r2)
                android.content.Context r2 = com.amap.api.col.s.s4.a()
                java.lang.String r1 = r1.toString()
                com.amap.api.col.s.s4$a$a r3 = new com.amap.api.col.s.s4$a$a
                r3.<init>(r4)
                com.amap.api.col.s.y0.g(r2, r0, r1, r3)
                r0 = 10000(0x2710, double:4.9407E-320)
                java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L4e
            L4e:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.os.Handler {
        java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.s4 f4698b;

        public b(com.amap.api.col.s.s4 r1, android.os.Looper r2) {
                r0 = this;
                r0.f4698b = r1
                r0.<init>(r2)
                java.lang.String r1 = "handleMessage"
                r0.a = r1
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r3) {
                r2 = this;
                if (r3 != 0) goto L3
                goto L8
            L3:
                int r0 = r3.what
                r1 = 3
                if (r0 == r1) goto L9
            L8:
                return
            L9:
                java.lang.Object r3 = r3.obj     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.s.t4 r3 = (com.amap.api.col.s.t4) r3     // Catch: java.lang.Throwable -> L16
                if (r3 != 0) goto L18
                com.amap.api.col.s.t4 r3 = new com.amap.api.col.s.t4     // Catch: java.lang.Throwable -> L16
                r0 = 0
                r3.<init>(r0, r0)     // Catch: java.lang.Throwable -> L16
                goto L18
            L16:
                r3 = move-exception
                goto L32
            L18:
                android.content.Context r0 = com.amap.api.col.s.s4.a()     // Catch: java.lang.Throwable -> L16
                boolean r1 = r3.a()     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.s.i1 r1 = com.amap.api.col.s.i4.a(r1)     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.s.g2.g(r0, r1)     // Catch: java.lang.Throwable -> L16
                boolean r3 = r3.a()     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.s.i1 r3 = com.amap.api.col.s.i4.a(r3)     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.s.s4.f4696e = r3     // Catch: java.lang.Throwable -> L16
                return
            L32:
                java.lang.String r0 = "ManifestConfig"
                java.lang.String r1 = r2.a
                com.amap.api.col.s.j4.i(r3, r0, r1)
                return
        }
    }

    private s4(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            com.amap.api.col.s.s4$a r0 = new com.amap.api.col.s.s4$a
            java.lang.String r1 = "manifestThread"
            r0.<init>(r2, r1)
            r2.f4697b = r0
            com.amap.api.col.s.s4.f4695d = r3
            r3 = 0
            com.amap.api.col.s.i1 r3 = com.amap.api.col.s.i4.a(r3)
            com.amap.api.col.s.s4.f4696e = r3
            g()     // Catch: java.lang.Throwable -> L29
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L29
            com.amap.api.col.s.s4$b r0 = new com.amap.api.col.s.s4$b     // Catch: java.lang.Throwable -> L29
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L29
            r2.a = r0     // Catch: java.lang.Throwable -> L29
            android.os.HandlerThread r3 = r2.f4697b     // Catch: java.lang.Throwable -> L29
            r3.start()     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r3 = move-exception
            java.lang.String r0 = "ManifestConfig"
            com.amap.api.col.s.j4.i(r3, r0, r0)
            return
    }

    static /* synthetic */ android.content.Context a() {
            android.content.Context r0 = com.amap.api.col.s.s4.f4695d
            return r0
    }

    private static com.amap.api.col.s.n.a b(org.json.JSONObject r6, boolean r7, com.amap.api.col.s.n.a r8) {
            r0 = 0
            if (r6 == 0) goto L6f
            com.amap.api.col.s.n$a r1 = new com.amap.api.col.s.n$a     // Catch: java.lang.Throwable -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6f
            r0 = 1
            r2 = 0
            java.lang.String r3 = "able"
            if (r7 == 0) goto L24
            java.lang.String r7 = r6.optString(r3)     // Catch: java.lang.Throwable -> L1d
            if (r8 == 0) goto L1f
            boolean r3 = r8.e()     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L1b
            goto L1f
        L1b:
            r0 = 0
            goto L1f
        L1d:
            r0 = r1
            goto L6f
        L1f:
            boolean r7 = com.amap.api.col.s.y0.u(r7, r0)     // Catch: java.lang.Throwable -> L1d
            goto L32
        L24:
            if (r8 == 0) goto L2e
            boolean r7 = r8.e()     // Catch: java.lang.Throwable -> L1d
            if (r7 == 0) goto L2d
            goto L2e
        L2d:
            r0 = 0
        L2e:
            boolean r7 = r6.optBoolean(r3, r0)     // Catch: java.lang.Throwable -> L1d
        L32:
            java.lang.String r0 = "timeoffset"
            if (r8 == 0) goto L3c
            long r2 = r8.f()     // Catch: java.lang.Throwable -> L1d
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L1d
            goto L3f
        L3c:
            r3 = 86400(0x15180, float:1.21072E-40)
        L3f:
            int r0 = r6.optInt(r0, r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = "num"
            if (r8 == 0) goto L4c
            int r3 = r8.g()     // Catch: java.lang.Throwable -> L1d
            goto L4e
        L4c:
            r3 = 10
        L4e:
            int r2 = r6.optInt(r2, r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "limitDistance"
            if (r8 == 0) goto L5b
            double r4 = r8.h()     // Catch: java.lang.Throwable -> L1d
            goto L5d
        L5b:
            r4 = 0
        L5d:
            double r3 = r6.optDouble(r3, r4)     // Catch: java.lang.Throwable -> L1d
            r1.d(r7)     // Catch: java.lang.Throwable -> L1d
            long r6 = (long) r0     // Catch: java.lang.Throwable -> L1d
            r1.c(r6)     // Catch: java.lang.Throwable -> L1d
            r1.b(r2)     // Catch: java.lang.Throwable -> L1d
            r1.a(r3)     // Catch: java.lang.Throwable -> L1d
            return r1
        L6f:
            return r0
    }

    static /* synthetic */ com.amap.api.col.s.s4.b c(com.amap.api.col.s.s4 r0) {
            com.amap.api.col.s.s4$b r0 = r0.a
            return r0
    }

    public static com.amap.api.col.s.s4 d(android.content.Context r1) {
            com.amap.api.col.s.s4 r0 = com.amap.api.col.s.s4.f4694c
            if (r0 != 0) goto Lb
            com.amap.api.col.s.s4 r0 = new com.amap.api.col.s.s4
            r0.<init>(r1)
            com.amap.api.col.s.s4.f4694c = r0
        Lb:
            com.amap.api.col.s.s4 r1 = com.amap.api.col.s.s4.f4694c
            return r1
    }

    private static void e(java.lang.String r1, org.json.JSONObject r2, com.amap.api.col.s.n.a r3) {
            if (r2 != 0) goto L3
            goto L19
        L3:
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L19
            org.json.JSONObject r2 = r2.optJSONObject(r1)
            r0 = 0
            com.amap.api.col.s.n$a r2 = b(r2, r0, r3)
            com.amap.api.col.s.n r3 = com.amap.api.col.s.n.b()
            r3.f(r1, r2)
        L19:
            return
    }

    static /* synthetic */ void f(org.json.JSONObject r0) {
            l(r0)
            return
    }

    private static void g() {
            com.amap.api.col.s.m.a()
            return
    }

    static /* synthetic */ void h(android.content.Context r0) {
            j(r0)
            return
    }

    static /* synthetic */ void i(org.json.JSONObject r0) {
            k(r0)
            return
    }

    private static void j(android.content.Context r4) {
            java.lang.String r0 = ""
            java.lang.String r1 = "amap_search"
            java.lang.String r2 = "cache_control"
            java.lang.Object r2 = com.amap.api.col.s.w.b(r4, r1, r2, r0)     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L31
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L31
            if (r3 != 0) goto L1a
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L31
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L31
            l(r3)     // Catch: java.lang.Throwable -> L31
        L1a:
            java.lang.String r2 = "parm_control"
            java.lang.Object r4 = com.amap.api.col.s.w.b(r4, r1, r2, r0)     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L30
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L31
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L31
            k(r0)     // Catch: java.lang.Throwable -> L31
        L30:
            return
        L31:
            r4 = move-exception
            java.lang.String r0 = "ManifestConfig"
            java.lang.String r1 = "ManifestConfig-readAuthFromCache"
            com.amap.api.col.s.j4.i(r4, r0, r1)
            return
    }

    private static void k(org.json.JSONObject r19) {
            r0 = r19
            if (r0 == 0) goto L11a
            java.lang.String r1 = "passAreaAble"
            java.lang.String r1 = r0.optString(r1)     // Catch: java.lang.Throwable -> L11a
            r2 = 1
            boolean r1 = com.amap.api.col.s.y0.u(r1, r2)     // Catch: java.lang.Throwable -> L11a
            java.lang.String r3 = "truckAble"
            java.lang.String r3 = r0.optString(r3)     // Catch: java.lang.Throwable -> L11a
            boolean r3 = com.amap.api.col.s.y0.u(r3, r2)     // Catch: java.lang.Throwable -> L11a
            java.lang.String r4 = "poiPageAble"
            java.lang.String r4 = r0.optString(r4)     // Catch: java.lang.Throwable -> L11a
            boolean r4 = com.amap.api.col.s.y0.u(r4, r2)     // Catch: java.lang.Throwable -> L11a
            java.lang.String r5 = "rideAble"
            java.lang.String r5 = r0.optString(r5)     // Catch: java.lang.Throwable -> L11a
            boolean r5 = com.amap.api.col.s.y0.u(r5, r2)     // Catch: java.lang.Throwable -> L11a
            java.lang.String r6 = "walkAble"
            java.lang.String r6 = r0.optString(r6)     // Catch: java.lang.Throwable -> L11a
            boolean r6 = com.amap.api.col.s.y0.u(r6, r2)     // Catch: java.lang.Throwable -> L11a
            java.lang.String r7 = "passPointAble"
            java.lang.String r7 = r0.optString(r7)     // Catch: java.lang.Throwable -> L11a
            boolean r7 = com.amap.api.col.s.y0.u(r7, r2)     // Catch: java.lang.Throwable -> L11a
            java.lang.String r8 = "keyWordLenAble"
            java.lang.String r8 = r0.optString(r8)     // Catch: java.lang.Throwable -> L11a
            boolean r2 = com.amap.api.col.s.y0.u(r8, r2)     // Catch: java.lang.Throwable -> L11a
            java.lang.String r8 = "poiPageMaxSize"
            r9 = 25
            int r8 = r0.optInt(r8, r9)     // Catch: java.lang.Throwable -> L11a
            java.lang.String r9 = "passAreaMaxCount"
            r10 = 100
            int r9 = r0.optInt(r9, r10)     // Catch: java.lang.Throwable -> L11a
            java.lang.String r11 = "walkMaxLength"
            int r11 = r0.optInt(r11, r10)     // Catch: java.lang.Throwable -> L11a
            java.lang.String r12 = "passPointMaxCount"
            r13 = 6
            int r12 = r0.optInt(r12, r13)     // Catch: java.lang.Throwable -> L11a
            java.lang.String r13 = "poiPageMaxNum"
            int r13 = r0.optInt(r13, r10)     // Catch: java.lang.Throwable -> L11a
            java.lang.String r14 = "truckMaxLength"
            r15 = 5000(0x1388, float:7.006E-42)
            int r14 = r0.optInt(r14, r15)     // Catch: java.lang.Throwable -> L11a
            java.lang.String r15 = "rideMaxLength"
            r10 = 1200(0x4b0, float:1.682E-42)
            int r10 = r0.optInt(r15, r10)     // Catch: java.lang.Throwable -> L11a
            java.lang.String r15 = "passAreaMaxArea"
            r16 = r12
            r12 = 100000000(0x5f5e100, float:2.3122341E-35)
            int r12 = r0.optInt(r15, r12)     // Catch: java.lang.Throwable -> L11a
            java.lang.String r15 = "passAreaPointCount"
            r17 = r7
            r7 = 16
            int r7 = r0.optInt(r15, r7)     // Catch: java.lang.Throwable -> L11a
            java.lang.String r15 = "keyWordLenMaxNum"
            r18 = r11
            r11 = 100
            int r0 = r0.optInt(r15, r11)     // Catch: java.lang.Throwable -> L11a
            com.amap.api.col.s.q r11 = com.amap.api.col.s.q.a()     // Catch: java.lang.Throwable -> L11a
            r11.h(r1)     // Catch: java.lang.Throwable -> L11a
            com.amap.api.col.s.q r1 = com.amap.api.col.s.q.a()     // Catch: java.lang.Throwable -> L11a
            r1.n(r9)     // Catch: java.lang.Throwable -> L11a
            com.amap.api.col.s.q r1 = com.amap.api.col.s.q.a()     // Catch: java.lang.Throwable -> L11a
            r1.z(r12)     // Catch: java.lang.Throwable -> L11a
            com.amap.api.col.s.q r1 = com.amap.api.col.s.q.a()     // Catch: java.lang.Throwable -> L11a
            r1.A(r7)     // Catch: java.lang.Throwable -> L11a
            com.amap.api.col.s.q r1 = com.amap.api.col.s.q.a()     // Catch: java.lang.Throwable -> L11a
            r1.m(r3)     // Catch: java.lang.Throwable -> L11a
            com.amap.api.col.s.q r1 = com.amap.api.col.s.q.a()     // Catch: java.lang.Throwable -> L11a
            r1.w(r14)     // Catch: java.lang.Throwable -> L11a
            com.amap.api.col.s.q r1 = com.amap.api.col.s.q.a()     // Catch: java.lang.Throwable -> L11a
            r1.p(r4)     // Catch: java.lang.Throwable -> L11a
            com.amap.api.col.s.q r1 = com.amap.api.col.s.q.a()     // Catch: java.lang.Throwable -> L11a
            r1.u(r13)     // Catch: java.lang.Throwable -> L11a
            com.amap.api.col.s.q r1 = com.amap.api.col.s.q.a()     // Catch: java.lang.Throwable -> L11a
            r1.b(r8)     // Catch: java.lang.Throwable -> L11a
            com.amap.api.col.s.q r1 = com.amap.api.col.s.q.a()     // Catch: java.lang.Throwable -> L11a
            r1.i(r0)     // Catch: java.lang.Throwable -> L11a
            com.amap.api.col.s.q r0 = com.amap.api.col.s.q.a()     // Catch: java.lang.Throwable -> L11a
            r0.x(r2)     // Catch: java.lang.Throwable -> L11a
            com.amap.api.col.s.q r0 = com.amap.api.col.s.q.a()     // Catch: java.lang.Throwable -> L11a
            r0.r(r5)     // Catch: java.lang.Throwable -> L11a
            com.amap.api.col.s.q r0 = com.amap.api.col.s.q.a()     // Catch: java.lang.Throwable -> L11a
            r0.y(r10)     // Catch: java.lang.Throwable -> L11a
            com.amap.api.col.s.q r0 = com.amap.api.col.s.q.a()     // Catch: java.lang.Throwable -> L11a
            r0.t(r6)     // Catch: java.lang.Throwable -> L11a
            com.amap.api.col.s.q r0 = com.amap.api.col.s.q.a()     // Catch: java.lang.Throwable -> L11a
            r1 = r18
            r0.q(r1)     // Catch: java.lang.Throwable -> L11a
            com.amap.api.col.s.q r0 = com.amap.api.col.s.q.a()     // Catch: java.lang.Throwable -> L11a
            r1 = r17
            r0.v(r1)     // Catch: java.lang.Throwable -> L11a
            com.amap.api.col.s.q r0 = com.amap.api.col.s.q.a()     // Catch: java.lang.Throwable -> L11a
            r1 = r16
            r0.s(r1)     // Catch: java.lang.Throwable -> L11a
        L11a:
            return
    }

    private static void l(org.json.JSONObject r2) {
            if (r2 == 0) goto L32
            java.lang.String r0 = "able"
            boolean r0 = r2.has(r0)     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L32
            r0 = 1
            r1 = 0
            com.amap.api.col.s.n$a r0 = b(r2, r0, r1)     // Catch: java.lang.Throwable -> L32
            com.amap.api.col.s.n r1 = com.amap.api.col.s.n.b()     // Catch: java.lang.Throwable -> L32
            r1.d(r0)     // Catch: java.lang.Throwable -> L32
            boolean r1 = r0.e()     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L1e
            goto L32
        L1e:
            java.lang.String r1 = "regeo"
            e(r1, r2, r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "geo"
            e(r1, r2, r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "placeText"
            e(r1, r2, r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "placeAround"
            e(r1, r2, r0)     // Catch: java.lang.Throwable -> L32
        L32:
            return
    }
}
