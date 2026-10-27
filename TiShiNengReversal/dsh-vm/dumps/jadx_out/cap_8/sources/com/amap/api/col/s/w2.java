package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class w2 {
    public static volatile java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.w2.c> a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile java.util.List<java.lang.String> f4775b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.w2.b> f4776c;

    /* renamed from: d, reason: collision with root package name */
    private static java.util.Random f4777d;

    /* renamed from: e, reason: collision with root package name */
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> f4778e;

    /* renamed from: f, reason: collision with root package name */
    private static java.util.List<com.amap.api.col.s.g3> f4779f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        int f4780b;

        /* renamed from: c, reason: collision with root package name */
        double f4781c;

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ a(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b {
        com.amap.api.col.s.b3 a;

        /* renamed from: b, reason: collision with root package name */
        long f4782b;

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ b(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c {
        java.util.Map<java.lang.String, java.util.List<com.amap.api.col.s.w2.a>> a;

        /* renamed from: b, reason: collision with root package name */
        java.util.Map<java.lang.String, java.lang.String> f4783b;

        private c() {
                r2 = this;
                r2.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r1 = 8
                r0.<init>(r1)
                r2.a = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>(r1)
                r2.f4783b = r0
                return
        }

        /* synthetic */ c(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L27
                java.lang.Class<com.amap.api.col.s.w2$c> r2 = com.amap.api.col.s.w2.c.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L27
            L10:
                com.amap.api.col.s.w2$c r5 = (com.amap.api.col.s.w2.c) r5
                java.util.Map<java.lang.String, java.util.List<com.amap.api.col.s.w2$a>> r2 = r4.a
                java.util.Map<java.lang.String, java.util.List<com.amap.api.col.s.w2$a>> r3 = r5.a
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L27
                java.util.Map<java.lang.String, java.lang.String> r2 = r4.f4783b
                java.util.Map<java.lang.String, java.lang.String> r5 = r5.f4783b
                boolean r5 = r2.equals(r5)
                if (r5 == 0) goto L27
                return r0
            L27:
                return r1
        }

        public final int hashCode() {
                r3 = this;
                java.util.Map<java.lang.String, java.util.List<com.amap.api.col.s.w2$a>> r0 = r3.a
                r1 = 0
                if (r0 == 0) goto La
                int r0 = r0.hashCode()
                goto Lb
            La:
                r0 = 0
            Lb:
                java.util.Map<java.lang.String, java.lang.String> r2 = r3.f4783b
                if (r2 == 0) goto L13
                int r1 = r2.hashCode()
            L13:
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 8
            r0.<init>(r1)
            com.amap.api.col.s.w2.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.synchronizedList(r0)
            com.amap.api.col.s.w2.f4775b = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>(r1)
            com.amap.api.col.s.w2.f4776c = r0
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            com.amap.api.col.s.w2.f4777d = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>(r1)
            com.amap.api.col.s.w2.f4778e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 16
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.synchronizedList(r0)
            com.amap.api.col.s.w2.f4779f = r0
            return
    }

    public w2() {
            r1 = this;
            r1.<init>()
            return
    }

    public static synchronized java.lang.String a(java.lang.String r4, java.lang.String r5) throws com.amap.api.col.s.bv {
            java.lang.Class<com.amap.api.col.s.w2> r0 = com.amap.api.col.s.w2.class
            monitor-enter(r0)
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L87 com.amap.api.col.s.bv -> L89
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L87 com.amap.api.col.s.bv -> L89
            if (r1 != 0) goto L95
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L87 com.amap.api.col.s.bv -> L89
            if (r1 == 0) goto L14
            goto L95
        L14:
            android.content.Context r1 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> L87 com.amap.api.col.s.bv -> L89
            java.util.List<java.lang.String> r2 = com.amap.api.col.s.w2.f4775b     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L2a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L28
            r3 = 8
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L28
            java.util.List r2 = java.util.Collections.synchronizedList(r2)     // Catch: java.lang.Throwable -> L28
            com.amap.api.col.s.w2.f4775b = r2     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r1 = move-exception
            goto L51
        L2a:
            if (r1 != 0) goto L2d
            goto L58
        L2d:
            java.util.List<java.lang.String> r2 = com.amap.api.col.s.w2.f4775b     // Catch: java.lang.Throwable -> L28
            boolean r2 = r2.contains(r5)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L36
            goto L58
        L36:
            java.util.List<java.lang.String> r2 = com.amap.api.col.s.w2.f4775b     // Catch: java.lang.Throwable -> L28
            r2.add(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "Yb3Blbl9odHRwX2NvbnRyb2w"
            java.lang.String r1 = com.amap.api.col.s.j2.d(r1, r2, r5)     // Catch: java.lang.Throwable -> L28
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L48
            goto L58
        L48:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L28
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L28
            h(r5, r2)     // Catch: java.lang.Throwable -> L28
            goto L58
        L51:
            java.lang.String r2 = "hlUtil"
            java.lang.String r3 = "llhl"
            com.amap.api.col.s.d2.e(r1, r2, r3)     // Catch: java.lang.Throwable -> L87 com.amap.api.col.s.bv -> L89
        L58:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.w2$c> r1 = com.amap.api.col.s.w2.a     // Catch: java.lang.Throwable -> L87 com.amap.api.col.s.bv -> L89
            if (r1 == 0) goto L93
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.w2$c> r1 = com.amap.api.col.s.w2.a     // Catch: java.lang.Throwable -> L87 com.amap.api.col.s.bv -> L89
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L87 com.amap.api.col.s.bv -> L89
            if (r1 > 0) goto L65
            goto L93
        L65:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.w2$c> r1 = com.amap.api.col.s.w2.a     // Catch: java.lang.Throwable -> L87 com.amap.api.col.s.bv -> L89
            boolean r1 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L87 com.amap.api.col.s.bv -> L89
            if (r1 != 0) goto L6f
            monitor-exit(r0)
            return r4
        L6f:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.w2$c> r1 = com.amap.api.col.s.w2.a     // Catch: java.lang.Throwable -> L87 com.amap.api.col.s.bv -> L89
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L87 com.amap.api.col.s.bv -> L89
            com.amap.api.col.s.w2$c r1 = (com.amap.api.col.s.w2.c) r1     // Catch: java.lang.Throwable -> L87 com.amap.api.col.s.bv -> L89
            if (r1 != 0) goto L7b
            monitor-exit(r0)
            return r4
        L7b:
            boolean r2 = m(r4, r1, r5)     // Catch: java.lang.Throwable -> L87 com.amap.api.col.s.bv -> L89
            if (r2 != 0) goto L8b
            java.lang.String r4 = p(r4, r1, r5)     // Catch: java.lang.Throwable -> L87 com.amap.api.col.s.bv -> L89
            monitor-exit(r0)
            return r4
        L87:
            r5 = move-exception
            goto L97
        L89:
            r4 = move-exception
            goto La2
        L8b:
            com.amap.api.col.s.bv r5 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> L87 com.amap.api.col.s.bv -> L89
            java.lang.String r1 = "服务QPS超限"
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L87 com.amap.api.col.s.bv -> L89
            throw r5     // Catch: java.lang.Throwable -> L87 com.amap.api.col.s.bv -> L89
        L93:
            monitor-exit(r0)
            return r4
        L95:
            monitor-exit(r0)
            return r4
        L97:
            java.lang.String r1 = "hlUtil"
            java.lang.String r2 = "pcr"
            com.amap.api.col.s.d2.e(r5, r1, r2)     // Catch: java.lang.Throwable -> La0
            monitor-exit(r0)
            return r4
        La0:
            r4 = move-exception
            goto La3
        La2:
            throw r4     // Catch: java.lang.Throwable -> La0
        La3:
            throw r4     // Catch: java.lang.Throwable -> La4
        La4:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La4
            throw r4
    }

    public static void b() {
            android.content.Context r0 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto L5
            goto Lc
        L5:
            java.util.List r1 = q()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.s.h3.e(r1, r0)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public static synchronized void c(com.amap.api.col.s.i1 r4, org.json.JSONObject r5) {
            java.lang.Class<com.amap.api.col.s.w2> r0 = com.amap.api.col.s.w2.class
            monitor-enter(r0)
            if (r4 != 0) goto L7
            monitor-exit(r0)
            return
        L7:
            java.lang.String r4 = r4.d()     // Catch: java.lang.Throwable -> L19
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L13
            monitor-exit(r0)
            return
        L13:
            if (r5 != 0) goto L1b
            e(r4)     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r4 = move-exception
            goto L3e
        L1b:
            java.lang.String r1 = "able"
            r2 = 0
            java.lang.String r1 = r5.optString(r1, r2)     // Catch: java.lang.Throwable -> L19
            r2 = 0
            boolean r1 = com.amap.api.col.s.y0.u(r1, r2)     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L2e
            e(r4)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            return
        L2e:
            android.content.Context r1 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "Yb3Blbl9odHRwX2NvbnRyb2w"
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L19
            com.amap.api.col.s.j2.e(r1, r2, r4, r3)     // Catch: java.lang.Throwable -> L19
            h(r4, r5)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            return
        L3e:
            java.lang.String r5 = "hlUtil"
            java.lang.String r1 = "par"
            com.amap.api.col.s.d2.e(r4, r5, r1)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r0)
            return
        L47:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r4
    }

    private static void d(com.amap.api.col.s.w2.c r12, org.json.JSONObject r13) {
            java.lang.String r0 = "/"
            java.lang.String r1 = "block"
            org.json.JSONArray r13 = r13.optJSONArray(r1)     // Catch: java.lang.Throwable -> L8a
            if (r13 != 0) goto Lb
            return
        Lb:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L8a
            r2 = 8
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L8a
            r2 = 0
            r3 = 0
        L14:
            int r4 = r13.length()     // Catch: java.lang.Throwable -> L8a
            if (r3 >= r4) goto L87
            org.json.JSONObject r4 = r13.optJSONObject(r3)     // Catch: java.lang.Throwable -> L8a
            if (r4 == 0) goto L84
            java.lang.String r5 = "api"
            java.lang.String r5 = r4.optString(r5)     // Catch: java.lang.Throwable -> L8a
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L8a
            if (r6 != 0) goto L84
            boolean r6 = r5.startsWith(r0)     // Catch: java.lang.Throwable -> L8a
            if (r6 != 0) goto L36
            java.lang.String r5 = r0.concat(r5)     // Catch: java.lang.Throwable -> L8a
        L36:
            boolean r6 = r5.endsWith(r0)     // Catch: java.lang.Throwable -> L8a
            if (r6 == 0) goto L46
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L8a
            int r6 = r6 + (-1)
            java.lang.String r5 = r5.substring(r2, r6)     // Catch: java.lang.Throwable -> L8a
        L46:
            java.lang.String r6 = "periods"
            org.json.JSONArray r4 = r4.optJSONArray(r6)     // Catch: java.lang.Throwable -> L8a
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8a
            r6.<init>()     // Catch: java.lang.Throwable -> L8a
            r7 = 0
        L52:
            int r8 = r4.length()     // Catch: java.lang.Throwable -> L8a
            if (r7 >= r8) goto L81
            org.json.JSONObject r8 = r4.optJSONObject(r7)     // Catch: java.lang.Throwable -> L8a
            if (r8 == 0) goto L7e
            com.amap.api.col.s.w2$a r9 = new com.amap.api.col.s.w2$a     // Catch: java.lang.Throwable -> L8a
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r10 = "begin"
            java.lang.String r10 = r8.optString(r10)     // Catch: java.lang.Throwable -> L8a
            r9.a = r10     // Catch: java.lang.Throwable -> L8a
            java.lang.String r10 = "duration"
            int r10 = r8.optInt(r10)     // Catch: java.lang.Throwable -> L8a
            r9.f4780b = r10     // Catch: java.lang.Throwable -> L8a
            java.lang.String r10 = "percent"
            double r10 = r8.optDouble(r10)     // Catch: java.lang.Throwable -> L8a
            r9.f4781c = r10     // Catch: java.lang.Throwable -> L8a
            r6.add(r9)     // Catch: java.lang.Throwable -> L8a
        L7e:
            int r7 = r7 + 1
            goto L52
        L81:
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> L8a
        L84:
            int r3 = r3 + 1
            goto L14
        L87:
            r12.a = r1     // Catch: java.lang.Throwable -> L8a
            return
        L8a:
            r12 = move-exception
            java.lang.String r13 = "hlUtil"
            java.lang.String r0 = "pbr"
            com.amap.api.col.s.d2.e(r12, r13, r0)
            return
    }

    private static synchronized void e(java.lang.String r3) {
            java.lang.Class<com.amap.api.col.s.w2> r0 = com.amap.api.col.s.w2.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.w2$c> r1 = com.amap.api.col.s.w2.a     // Catch: java.lang.Throwable -> L11
            boolean r1 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.w2$c> r1 = com.amap.api.col.s.w2.a     // Catch: java.lang.Throwable -> L11
            r1.remove(r3)     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r3 = move-exception
            goto L23
        L13:
            android.content.Context r1 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "Yb3Blbl9odHRwX2NvbnRyb2w"
            android.content.SharedPreferences$Editor r1 = com.amap.api.col.s.j2.c(r1, r2)     // Catch: java.lang.Throwable -> L11
            com.amap.api.col.s.j2.g(r1, r3)     // Catch: java.lang.Throwable -> L11
            com.amap.api.col.s.j2.f(r1)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return
        L23:
            java.lang.String r1 = "hlUtil"
            java.lang.String r2 = "rc"
            com.amap.api.col.s.d2.e(r3, r1, r2)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)
            return
        L2c:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r3
    }

    private static void f(java.lang.String r2, com.amap.api.col.s.w2.c r3) {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.w2$c> r0 = com.amap.api.col.s.w2.a     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Ld
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L13
            r1 = 8
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L13
            com.amap.api.col.s.w2.a = r0     // Catch: java.lang.Throwable -> L13
        Ld:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.w2$c> r0 = com.amap.api.col.s.w2.a     // Catch: java.lang.Throwable -> L13
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r2 = move-exception
            java.lang.String r3 = "hlUtil"
            java.lang.String r0 = "ucr"
            com.amap.api.col.s.d2.e(r2, r3, r0)
            return
    }

    private static void g(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            android.content.Context r0 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L89
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto Lc
            goto L89
        Lc:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = com.amap.api.col.s.w2.f4778e     // Catch: java.lang.Throwable -> L89
            if (r1 != 0) goto L19
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L89
            r2 = 8
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L89
            com.amap.api.col.s.w2.f4778e = r1     // Catch: java.lang.Throwable -> L89
        L19:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = com.amap.api.col.s.w2.f4778e     // Catch: java.lang.Throwable -> L89
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L89
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r2 = com.amap.api.col.s.w2.f4778e     // Catch: java.lang.Throwable -> L26
            boolean r2 = r2.containsKey(r6)     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L28
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            r5 = move-exception
            goto L87
        L28:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r2 = com.amap.api.col.s.w2.f4778e     // Catch: java.lang.Throwable -> L26
            r2.put(r6, r7)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L89
            r1.<init>()     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "timestamp"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L89
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "type"
            java.lang.Integer r3 = com.amap.api.col.s.s1.l     // Catch: java.lang.Throwable -> L89
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "name"
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "version"
            java.lang.String r5 = com.amap.api.col.s.s1.a(r5)     // Catch: java.lang.Throwable -> L89
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> L89
            java.lang.String r5 = "hostname"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L89
            r2.<init>()     // Catch: java.lang.Throwable -> L89
            r2.append(r6)     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = "#"
            r2.append(r6)     // Catch: java.lang.Throwable -> L89
            r2.append(r7)     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L89
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> L89
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L89
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L89
            if (r6 == 0) goto L75
            goto L89
        L75:
            com.amap.api.col.s.g3 r6 = new com.amap.api.col.s.g3     // Catch: java.lang.Throwable -> L89
            java.lang.String r7 = "core"
            java.lang.String r1 = "2.0"
            java.lang.String r2 = "O005"
            r6.<init>(r0, r7, r1, r2)     // Catch: java.lang.Throwable -> L89
            r6.a(r5)     // Catch: java.lang.Throwable -> L89
            com.amap.api.col.s.h3.d(r6, r0)     // Catch: java.lang.Throwable -> L89
            return
        L87:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            throw r5     // Catch: java.lang.Throwable -> L89
        L89:
            return
    }

    private static void h(java.lang.String r2, org.json.JSONObject r3) {
            com.amap.api.col.s.w2$c r0 = new com.amap.api.col.s.w2$c     // Catch: java.lang.Throwable -> L1b
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1b
            d(r0, r3)     // Catch: java.lang.Throwable -> L1b
            r(r0, r3)     // Catch: java.lang.Throwable -> L1b
            java.util.Map<java.lang.String, java.lang.String> r3 = r0.f4783b     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L18
            java.util.Map<java.lang.String, java.util.List<com.amap.api.col.s.w2$a>> r3 = r0.a     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L18
            e(r2)     // Catch: java.lang.Throwable -> L1b
            return
        L18:
            f(r2, r0)     // Catch: java.lang.Throwable -> L1b
        L1b:
            return
    }

    public static void i(java.net.URL r11, com.amap.api.col.s.b3 r12) {
            java.lang.String r0 = "nb"
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.w2$b> r1 = com.amap.api.col.s.w2.f4776c     // Catch: java.lang.Throwable -> L7b
            if (r1 != 0) goto Lf
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L7b
            r2 = 8
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7b
            com.amap.api.col.s.w2.f4776c = r1     // Catch: java.lang.Throwable -> L7b
        Lf:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r12.f4315b     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L7b
            boolean r1 = r1.containsKey(r0)     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L7b
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r12.f4315b     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L7b
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L7b
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L7b
            if (r1 > 0) goto L2a
            goto L7b
        L2a:
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "#"
            java.lang.String[] r0 = r0.split(r2)     // Catch: java.lang.Throwable -> L7b
            int r2 = r0.length     // Catch: java.lang.Throwable -> L7b
            r3 = 2
            if (r2 >= r3) goto L3c
            goto L7b
        L3c:
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L7b
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L7b
            r4 = 1
            r0 = r0[r4]     // Catch: java.lang.Throwable -> L7b
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L7b
            long r5 = (long) r0     // Catch: java.lang.Throwable -> L7b
            com.amap.api.col.s.w2$b r0 = new com.amap.api.col.s.w2$b     // Catch: java.lang.Throwable -> L7b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7b
            r0.a = r12     // Catch: java.lang.Throwable -> L7b
            r7 = 0
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 > 0) goto L59
            r5 = 30
        L59:
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L7b
            r9 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r9
            long r7 = r7 + r5
            r0.f4782b = r7     // Catch: java.lang.Throwable -> L7b
            if (r2 != r4) goto L6e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.w2$b> r11 = com.amap.api.col.s.w2.f4776c     // Catch: java.lang.Throwable -> L7b
            java.lang.String r12 = "app"
            r11.put(r12, r0)     // Catch: java.lang.Throwable -> L7b
            return
        L6e:
            if (r2 != r3) goto L7b
            if (r11 == 0) goto L7b
            java.lang.String r11 = r11.getPath()     // Catch: java.lang.Throwable -> L7b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.w2$b> r12 = com.amap.api.col.s.w2.f4776c     // Catch: java.lang.Throwable -> L7b
            r12.put(r11, r0)     // Catch: java.lang.Throwable -> L7b
        L7b:
            return
    }

    public static void j(boolean r5, java.lang.String r6) {
            android.content.Context r0 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L4f
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto Lb
            goto L4f
        Lb:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4f
            r1.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = "timestamp"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4f
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L4f
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = "type"
            if (r5 == 0) goto L27
            java.lang.Integer r5 = com.amap.api.col.s.s1.f4680i     // Catch: java.lang.Throwable -> L4f
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> L4f
            goto L2c
        L27:
            java.lang.Integer r5 = com.amap.api.col.s.s1.f4679h     // Catch: java.lang.Throwable -> L4f
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> L4f
        L2c:
            java.lang.String r5 = "name"
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = "version"
            java.lang.String r6 = com.amap.api.col.s.s1.a(r6)     // Catch: java.lang.Throwable -> L4f
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L4f
            com.amap.api.col.s.g3 r6 = new com.amap.api.col.s.g3     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = "core"
            java.lang.String r2 = "2.0"
            java.lang.String r3 = "O005"
            r6.<init>(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L4f
            r6.a(r5)     // Catch: java.lang.Throwable -> L4f
            com.amap.api.col.s.h3.d(r6, r0)     // Catch: java.lang.Throwable -> L4f
        L4f:
            return
    }

    private static void k(boolean r5, java.lang.String r6, java.lang.String r7, int r8) {
            android.content.Context r0 = com.amap.api.col.s.y0.f4862g     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L97
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L97
            if (r1 != 0) goto L97
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L12
            goto L97
        L12:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L97
            r1.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "timestamp"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L97
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = com.amap.api.col.s.s1.a(r6)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L2e
            java.lang.String r5 = "type"
            java.lang.Integer r3 = com.amap.api.col.s.s1.f4682k     // Catch: java.lang.Throwable -> L97
            r1.put(r5, r3)     // Catch: java.lang.Throwable -> L97
            goto L35
        L2e:
            java.lang.String r5 = "type"
            java.lang.Integer r3 = com.amap.api.col.s.s1.f4681j     // Catch: java.lang.Throwable -> L97
            r1.put(r5, r3)     // Catch: java.lang.Throwable -> L97
        L35:
            java.lang.String r5 = "name"
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = "version"
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L97
            android.net.Uri r5 = android.net.Uri.parse(r7)     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = r5.getPath()     // Catch: java.lang.Throwable -> L97
            java.lang.String r6 = "uri"
            r1.put(r6, r5)     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = "blockLevel"
            r1.put(r5, r8)     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L97
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L97
            if (r6 == 0) goto L5c
            goto L97
        L5c:
            com.amap.api.col.s.g3 r6 = new com.amap.api.col.s.g3     // Catch: java.lang.Throwable -> L97
            java.lang.String r7 = "core"
            java.lang.String r8 = "2.0"
            java.lang.String r1 = "O005"
            r6.<init>(r0, r7, r8, r1)     // Catch: java.lang.Throwable -> L97
            r6.a(r5)     // Catch: java.lang.Throwable -> L97
            java.util.List<com.amap.api.col.s.g3> r5 = com.amap.api.col.s.w2.f4779f     // Catch: java.lang.Throwable -> L97
            if (r5 != 0) goto L7b
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L97
            r7 = 16
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L97
            java.util.List r5 = java.util.Collections.synchronizedList(r5)     // Catch: java.lang.Throwable -> L97
            com.amap.api.col.s.w2.f4779f = r5     // Catch: java.lang.Throwable -> L97
        L7b:
            java.util.List<com.amap.api.col.s.g3> r5 = com.amap.api.col.s.w2.f4779f     // Catch: java.lang.Throwable -> L97
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L97
            java.util.List<com.amap.api.col.s.g3> r7 = com.amap.api.col.s.w2.f4779f     // Catch: java.lang.Throwable -> L91
            r7.add(r6)     // Catch: java.lang.Throwable -> L91
            java.util.List<com.amap.api.col.s.g3> r6 = com.amap.api.col.s.w2.f4779f     // Catch: java.lang.Throwable -> L91
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L91
            r7 = 15
            if (r6 < r7) goto L93
            b()     // Catch: java.lang.Throwable -> L91
            goto L93
        L91:
            r6 = move-exception
            goto L95
        L93:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L91
            return
        L95:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L91
            throw r6     // Catch: java.lang.Throwable -> L97
        L97:
            return
    }

    private static boolean l(com.amap.api.col.s.w2.a r9) {
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            double r1 = r9.f4781c
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto Ld
            return r0
        Ld:
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = r9.a
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L6b
            int r3 = r9.f4780b
            if (r3 <= 0) goto L6b
            java.lang.String r3 = r9.a
            java.lang.String r4 = "HH:mm:ss"
            java.util.Calendar r3 = com.amap.api.col.s.j1.h(r3, r4)
            long r3 = r3.getTimeInMillis()
            long r3 = r1 - r3
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L6b
            int r5 = r9.f4780b
            int r5 = r5 * 1000
            long r5 = (long) r5
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L6b
            double r3 = r9.f4781c
            r5 = 0
            r7 = 1
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L44
            return r7
        L44:
            java.util.Random r3 = com.amap.api.col.s.w2.f4777d
            if (r3 != 0) goto L4f
            java.util.Random r3 = new java.util.Random
            r3.<init>()
            com.amap.api.col.s.w2.f4777d = r3
        L4f:
            java.util.Random r3 = com.amap.api.col.s.w2.f4777d
            java.util.UUID r4 = java.util.UUID.randomUUID()
            int r4 = r4.hashCode()
            long r4 = (long) r4
            long r4 = r4 + r1
            r3.setSeed(r4)
            java.util.Random r1 = com.amap.api.col.s.w2.f4777d
            double r1 = r1.nextDouble()
            double r3 = r9.f4781c
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 <= 0) goto L6b
            return r7
        L6b:
            return r0
    }

    private static boolean m(java.lang.String r4, com.amap.api.col.s.w2.c r5, java.lang.String r6) {
            r0 = 0
            java.util.Map<java.lang.String, java.util.List<com.amap.api.col.s.w2$a>> r5 = r5.a     // Catch: java.lang.Throwable -> L39
            if (r5 == 0) goto L5a
            int r1 = r5.size()     // Catch: java.lang.Throwable -> L39
            if (r1 > 0) goto Lc
            goto L5a
        Lc:
            java.lang.String r1 = "*"
            boolean r1 = r5.containsKey(r1)     // Catch: java.lang.Throwable -> L39
            r2 = 1
            if (r1 == 0) goto L3b
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L39
        L1d:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L62
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L39
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L39
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L39
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L39
            boolean r1 = n(r1)     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L1d
            k(r0, r6, r4, r2)     // Catch: java.lang.Throwable -> L39
            return r2
        L39:
            r4 = move-exception
            goto L5b
        L3b:
            android.net.Uri r1 = android.net.Uri.parse(r4)     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> L39
            boolean r3 = r5.containsKey(r1)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L62
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Throwable -> L39
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L39
            boolean r5 = n(r5)     // Catch: java.lang.Throwable -> L39
            if (r5 == 0) goto L62
            r5 = 2
            k(r0, r6, r4, r5)     // Catch: java.lang.Throwable -> L39
            return r2
        L5a:
            return r0
        L5b:
            java.lang.String r5 = "hlUtil"
            java.lang.String r6 = "inb"
            com.amap.api.col.s.d2.e(r4, r5, r6)
        L62:
            return r0
    }

    private static boolean n(java.util.List<com.amap.api.col.s.w2.a> r2) {
            r0 = 0
            if (r2 == 0) goto L22
            int r1 = r2.size()
            if (r1 > 0) goto La
            goto L22
        La:
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r2.next()
            com.amap.api.col.s.w2$a r1 = (com.amap.api.col.s.w2.a) r1
            boolean r1 = l(r1)
            if (r1 == 0) goto Le
            r2 = 1
            return r2
        L22:
            return r0
    }

    public static com.amap.api.col.s.b3 o(java.lang.String r10, java.lang.String r11) {
            java.lang.String r0 = "app"
            r1 = 0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.w2$b> r2 = com.amap.api.col.s.w2.f4776c     // Catch: java.lang.Throwable -> L6f
            if (r2 != 0) goto L8
            return r1
        L8:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.w2$b> r2 = com.amap.api.col.s.w2.f4776c     // Catch: java.lang.Throwable -> L6f
            boolean r2 = r2.containsKey(r0)     // Catch: java.lang.Throwable -> L6f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.w2$b> r2 = com.amap.api.col.s.w2.f4776c     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L6f
            com.amap.api.col.s.w2$b r2 = (com.amap.api.col.s.w2.b) r2     // Catch: java.lang.Throwable -> L6f
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L6f
            long r7 = r2.f4782b     // Catch: java.lang.Throwable -> L6f
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L2e
            com.amap.api.col.s.b3 r0 = r2.a     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L2a
            r0.f4318e = r3     // Catch: java.lang.Throwable -> L6f
        L2a:
            k(r4, r11, r10, r4)     // Catch: java.lang.Throwable -> L6f
            return r0
        L2e:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.w2$b> r10 = com.amap.api.col.s.w2.f4776c     // Catch: java.lang.Throwable -> L6f
            r10.remove(r0)     // Catch: java.lang.Throwable -> L6f
            goto L6f
        L34:
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L3b
            return r1
        L3b:
            android.net.Uri r0 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L6f
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.w2$b> r2 = com.amap.api.col.s.w2.f4776c     // Catch: java.lang.Throwable -> L6f
            boolean r2 = r2.containsKey(r0)     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L6f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.w2$b> r2 = com.amap.api.col.s.w2.f4776c     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L6f
            com.amap.api.col.s.w2$b r2 = (com.amap.api.col.s.w2.b) r2     // Catch: java.lang.Throwable -> L6f
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L6f
            long r7 = r2.f4782b     // Catch: java.lang.Throwable -> L6f
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L6a
            com.amap.api.col.s.b3 r0 = r2.a     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L65
            r0.f4318e = r3     // Catch: java.lang.Throwable -> L6f
        L65:
            r2 = 2
            k(r4, r11, r10, r2)     // Catch: java.lang.Throwable -> L6f
            return r0
        L6a:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.s.w2$b> r10 = com.amap.api.col.s.w2.f4776c     // Catch: java.lang.Throwable -> L6f
            r10.remove(r0)     // Catch: java.lang.Throwable -> L6f
        L6f:
            return r1
    }

    private static java.lang.String p(java.lang.String r3, com.amap.api.col.s.w2.c r4, java.lang.String r5) {
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f4783b     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L31
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L2f
            if (r0 > 0) goto Lb
            goto L31
        Lb:
            android.net.Uri r0 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = r0.getAuthority()     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r4.containsKey(r1)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L31
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L2f
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch: java.lang.Throwable -> L2f
            android.net.Uri$Builder r0 = r0.authority(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L2f
            g(r5, r1, r4)     // Catch: java.lang.Throwable -> L2f
            return r3
        L2f:
            r4 = move-exception
            goto L32
        L31:
            return r3
        L32:
            java.lang.String r5 = "hlUtil"
            java.lang.String r0 = "pdr"
            com.amap.api.col.s.d2.e(r4, r5, r0)
            return r3
    }

    private static java.util.List<com.amap.api.col.s.g3> q() {
            r0 = 0
            java.util.List<com.amap.api.col.s.g3> r1 = com.amap.api.col.s.w2.f4779f     // Catch: java.lang.Throwable -> L2b
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L2b
            java.util.List<com.amap.api.col.s.g3> r2 = com.amap.api.col.s.w2.f4779f     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L26
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L21
            if (r2 <= 0) goto L26
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L21
            r2.<init>()     // Catch: java.lang.Throwable -> L21
            java.util.List<com.amap.api.col.s.g3> r0 = com.amap.api.col.s.w2.f4779f     // Catch: java.lang.Throwable -> L1f
            r2.addAll(r0)     // Catch: java.lang.Throwable -> L1f
            java.util.List<com.amap.api.col.s.g3> r0 = com.amap.api.col.s.w2.f4779f     // Catch: java.lang.Throwable -> L1f
            r0.clear()     // Catch: java.lang.Throwable -> L1f
            r0 = r2
            goto L26
        L1f:
            r0 = move-exception
            goto L28
        L21:
            r2 = move-exception
            r3 = r2
            r2 = r0
            r0 = r3
            goto L28
        L26:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            return r0
        L28:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r0     // Catch: java.lang.Throwable -> L2a
        L2a:
            r0 = r2
        L2b:
            return r0
    }

    private static void r(com.amap.api.col.s.w2.c r6, org.json.JSONObject r7) {
            java.lang.String r0 = "domainMap"
            org.json.JSONObject r7 = r7.optJSONObject(r0)     // Catch: java.lang.Throwable -> L2f
            if (r7 != 0) goto L9
            goto Lf
        L9:
            org.json.JSONArray r0 = r7.names()     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L10
        Lf:
            return
        L10:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2f
            r2 = 8
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L2f
            r3 = 0
        L1c:
            if (r3 >= r2) goto L2c
            java.lang.String r4 = r0.optString(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = r7.optString(r4)     // Catch: java.lang.Throwable -> L2f
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L2f
            int r3 = r3 + 1
            goto L1c
        L2c:
            r6.f4783b = r1     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r6 = move-exception
            java.lang.String r7 = "hlUtil"
            java.lang.String r0 = "pdr"
            com.amap.api.col.s.d2.e(r6, r7, r0)
            return
    }
}
