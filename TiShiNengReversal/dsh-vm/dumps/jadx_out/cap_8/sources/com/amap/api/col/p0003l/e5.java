package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class e5 {
    private com.amap.api.col.p0003l.p4 a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        public static java.util.Map<java.lang.String, com.amap.api.col.p0003l.e5> a;

        static {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                com.amap.api.col.3l.e5.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b {
        private java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f3184b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f3185c;

        public b(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f3184b = r2
                r0.f3185c = r3
                return
        }

        private static com.amap.api.col.3l.e5.b a(org.json.JSONObject r4) {
                com.amap.api.col.3l.e5$b r0 = new com.amap.api.col.3l.e5$b     // Catch: java.lang.Throwable -> L18
                java.lang.String r1 = "sdkVersion"
                java.lang.String r1 = r4.optString(r1)     // Catch: java.lang.Throwable -> L18
                java.lang.String r2 = "cpuType"
                java.lang.String r2 = r4.optString(r2)     // Catch: java.lang.Throwable -> L18
                java.lang.String r3 = "content"
                java.lang.String r4 = r4.optString(r3)     // Catch: java.lang.Throwable -> L18
                r0.<init>(r1, r2, r4)     // Catch: java.lang.Throwable -> L18
                return r0
            L18:
                r4 = 0
                return r4
        }

        static /* synthetic */ java.lang.String b(com.amap.api.col.3l.e5.b r0) {
                java.lang.String r0 = r0.f3185c
                return r0
        }

        static /* synthetic */ java.lang.String c(com.amap.api.col.3l.e5.b r0, java.lang.String r1) {
                r0.f3185c = r1
                return r1
        }

        public static java.util.List<com.amap.api.col.3l.e5.b> d(java.lang.String r3) {
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 == 0) goto Lc
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                return r3
            Lc:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2c
                r1.<init>(r3)     // Catch: java.lang.Throwable -> L2c
                r3 = 0
            L17:
                int r2 = r1.length()     // Catch: java.lang.Throwable -> L2c
                if (r3 >= r2) goto L2b
                org.json.JSONObject r2 = r1.getJSONObject(r3)     // Catch: java.lang.Throwable -> L2c
                com.amap.api.col.3l.e5$b r2 = a(r2)     // Catch: java.lang.Throwable -> L2c
                r0.add(r2)     // Catch: java.lang.Throwable -> L2c
                int r3 = r3 + 1
                goto L17
            L2b:
                return r0
            L2c:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                return r3
        }

        public static org.json.JSONArray e(java.util.List<com.amap.api.col.3l.e5.b> r3) {
                if (r3 != 0) goto L8
                org.json.JSONArray r3 = new org.json.JSONArray
                r3.<init>()
                return r3
            L8:
                org.json.JSONArray r0 = new org.json.JSONArray
                r0.<init>()
                java.util.Iterator r3 = r3.iterator()
            L11:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L2f
                java.lang.Object r1 = r3.next()
                com.amap.api.col.3l.e5$b r1 = (com.amap.api.col.3l.e5.b) r1
                if (r1 == 0) goto L11
                java.lang.String r2 = r1.f3185c
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 != 0) goto L11
                org.json.JSONObject r1 = r1.f()
                r0.put(r1)
                goto L11
            L2f:
                return r0
        }

        private org.json.JSONObject f() {
                r3 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "sdkVersion"
                java.lang.String r2 = r3.a     // Catch: java.lang.Throwable -> L1b
                r0.put(r1, r2)     // Catch: java.lang.Throwable -> L1b
                java.lang.String r1 = "cpuType"
                java.lang.String r2 = r3.f3184b     // Catch: java.lang.Throwable -> L1b
                r0.put(r1, r2)     // Catch: java.lang.Throwable -> L1b
                java.lang.String r1 = "content"
                java.lang.String r2 = r3.f3185c     // Catch: java.lang.Throwable -> L1b
                r0.put(r1, r2)     // Catch: java.lang.Throwable -> L1b
                return r0
            L1b:
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                return r0
        }

        public final boolean g(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 == 0) goto L8
                java.lang.String r2 = r1.a
            L8:
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 == 0) goto L10
                java.lang.String r3 = r1.f3184b
            L10:
                java.lang.String r0 = r1.a
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L22
                java.lang.String r2 = r1.f3184b
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L22
                r2 = 1
                return r2
            L22:
                r2 = 0
                return r2
        }
    }

    private e5(com.amap.api.col.p0003l.p4 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static com.amap.api.col.p0003l.e5 a(com.amap.api.col.p0003l.p4 r3) {
            if (r3 == 0) goto L34
            java.lang.String r0 = r3.a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Ld
            goto L34
        Ld:
            java.util.Map<java.lang.String, com.amap.api.col.3l.e5> r0 = com.amap.api.col.3l.e5.a.a
            java.lang.String r1 = r3.a()
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L27
            java.util.Map<java.lang.String, com.amap.api.col.3l.e5> r0 = com.amap.api.col.3l.e5.a.a
            java.lang.String r1 = r3.a()
            com.amap.api.col.3l.e5 r2 = new com.amap.api.col.3l.e5
            r2.<init>(r3)
            r0.put(r1, r2)
        L27:
            java.util.Map<java.lang.String, com.amap.api.col.3l.e5> r0 = com.amap.api.col.3l.e5.a.a
            java.lang.String r3 = r3.a()
            java.lang.Object r3 = r0.get(r3)
            com.amap.api.col.3l.e5 r3 = (com.amap.api.col.p0003l.e5) r3
            return r3
        L34:
            r3 = 0
            return r3
    }

    private static java.lang.String b(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "C7ADB20F22F238708BA5EE26D0401DB9"
            r0.<init>(r1)
            java.lang.String r3 = com.amap.api.col.p0003l.m4.d(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ik"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r0.concat(r4)
            java.lang.String r2 = e(r2, r3, r4)
            return r2
    }

    private static java.lang.String e(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = ""
            if (r2 == 0) goto L21
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto Lb
            goto L21
        Lb:
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r1)
            java.lang.String r2 = r2.getString(r4, r0)
            byte[] r2 = com.amap.api.col.p0003l.q4.y(r2)
            byte[] r2 = com.amap.api.col.p0003l.e4.e(r2)
            java.lang.String r2 = com.amap.api.col.p0003l.q4.g(r2)
            return r2
        L21:
            return r0
    }

    private static void f(android.content.Context r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            if (r5 == 0) goto L28
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L9
            goto L28
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "C7ADB20F22F238708BA5EE26D0401DB9"
            r0.<init>(r1)
            java.lang.String r3 = com.amap.api.col.p0003l.m4.d(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ik"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r0.concat(r4)
            g(r2, r3, r4, r5)
        L28:
            return
    }

    private static void g(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            if (r1 == 0) goto L31
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L31
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lf
            goto L31
        Lf:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L16
            goto L31
        L16:
            byte[] r4 = com.amap.api.col.p0003l.q4.o(r4)
            byte[] r4 = com.amap.api.col.p0003l.e4.c(r4)
            java.lang.String r4 = com.amap.api.col.p0003l.q4.E(r4)
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r3, r4)
            r1.commit()
        L31:
            return
    }

    public final java.lang.String c(android.content.Context r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L44
            com.amap.api.col.3l.p4 r1 = r3.a
            if (r1 == 0) goto L44
            java.lang.String r1 = r1.a()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L12
            goto L44
        L12:
            com.amap.api.col.3l.p4 r1 = r3.a
            java.lang.String r1 = r1.a()
            java.lang.String r4 = b(r4, r1, r7)
            java.util.List r4 = com.amap.api.col.3l.e5.b.d(r4)
            int r7 = r4.size()
            if (r7 != 0) goto L29
            java.lang.String r4 = ""
            return r4
        L29:
            r7 = 0
        L2a:
            int r1 = r4.size()
            if (r7 >= r1) goto L44
            java.lang.Object r1 = r4.get(r7)
            com.amap.api.col.3l.e5$b r1 = (com.amap.api.col.3l.e5.b) r1
            boolean r2 = r1.g(r5, r6)
            if (r2 == 0) goto L41
            java.lang.String r4 = com.amap.api.col.3l.e5.b.b(r1)
            return r4
        L41:
            int r7 = r7 + 1
            goto L2a
        L44:
            return r0
    }

    public final void d(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r4 = this;
            if (r5 == 0) goto L63
            com.amap.api.col.3l.p4 r0 = r4.a
            if (r0 == 0) goto L63
            java.lang.String r0 = r0.a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L63
        L11:
            com.amap.api.col.3l.p4 r0 = r4.a
            java.lang.String r0 = r0.a()
            java.lang.String r0 = b(r5, r0, r8)
            java.util.List r0 = com.amap.api.col.3l.e5.b.d(r0)
            r1 = 0
        L20:
            int r2 = r0.size()
            if (r1 >= r2) goto L4a
            java.lang.Object r2 = r0.get(r1)
            com.amap.api.col.3l.e5$b r2 = (com.amap.api.col.3l.e5.b) r2
            boolean r3 = r2.g(r6, r7)
            if (r3 == 0) goto L47
            com.amap.api.col.3l.e5.b.c(r2, r9)
            com.amap.api.col.3l.p4 r6 = r4.a
            java.lang.String r6 = r6.a()
            org.json.JSONArray r7 = com.amap.api.col.3l.e5.b.e(r0)
            java.lang.String r7 = r7.toString()
            f(r5, r6, r8, r7)
            return
        L47:
            int r1 = r1 + 1
            goto L20
        L4a:
            com.amap.api.col.3l.e5$b r1 = new com.amap.api.col.3l.e5$b
            r1.<init>(r6, r7, r9)
            r0.add(r1)
            com.amap.api.col.3l.p4 r6 = r4.a
            java.lang.String r6 = r6.a()
            org.json.JSONArray r7 = com.amap.api.col.3l.e5.b.e(r0)
            java.lang.String r7 = r7.toString()
            f(r5, r6, r8, r7)
        L63:
            return
    }
}
