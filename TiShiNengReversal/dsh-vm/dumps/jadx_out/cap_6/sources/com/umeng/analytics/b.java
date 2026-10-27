package com.umeng.analytics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b implements com.umeng.analytics.pro.n, com.umeng.analytics.pro.t {
    private static final java.lang.String A = "umsp_2";
    private static final java.lang.String B = "umsp_3";
    private static final java.lang.String C = "umsp_4";
    private static final java.lang.String D = "umsp_5";
    private static android.content.Context a = null;
    private static final java.lang.String h = "sp_uapp";
    private static final java.lang.String i = "prepp_uapp";
    private static final int o = 128;
    private static final int p = 256;

    /* renamed from: q, reason: collision with root package name */
    private static java.lang.String f20q = "";
    private static java.lang.String r = "";
    private static final java.lang.String s = null;
    private static final java.lang.String t = "ekv_bl_ver";
    private static final java.lang.String v = null;
    private static final java.lang.String w = "ekv_wl_ver";
    private static final java.lang.String z = "umsp_1";
    private com.umeng.common.ISysListener b;
    private com.umeng.analytics.pro.p c;
    private com.umeng.analytics.pro.v d;
    private com.umeng.analytics.pro.k e;
    private com.umeng.analytics.pro.u f;
    private com.umeng.analytics.pro.l g;
    private boolean j;
    private volatile org.json.JSONObject k;
    private volatile org.json.JSONObject l;
    private volatile org.json.JSONObject m;
    private boolean n;
    private com.umeng.analytics.filter.a u;
    private com.umeng.analytics.filter.b x;
    private com.umeng.analytics.pro.m y;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.analytics.b$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private static final com.umeng.analytics.b a = null;

        static {
                com.umeng.analytics.b r0 = new com.umeng.analytics.b
                r1 = 0
                r0.<init>(r1)
                com.umeng.analytics.b.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.umeng.analytics.b a() {
                com.umeng.analytics.b r0 = com.umeng.analytics.b.a.a
                return r0
        }
    }

    static {
            java.lang.String r0 = com.umeng.analytics.pro.d.ar
            com.umeng.analytics.b.s = r0
            java.lang.String r0 = com.umeng.analytics.pro.d.as
            com.umeng.analytics.b.v = r0
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()
            if (r0 == 0) goto L18
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            com.umeng.analytics.b.a = r0
        L18:
            return
    }

    private b() {
            r2 = this;
            r2.<init>()
            com.umeng.analytics.pro.p r0 = new com.umeng.analytics.pro.p
            r0.<init>()
            r2.c = r0
            com.umeng.analytics.pro.v r0 = new com.umeng.analytics.pro.v
            r0.<init>()
            r2.d = r0
            com.umeng.analytics.pro.k r0 = new com.umeng.analytics.pro.k
            r0.<init>()
            r2.e = r0
            com.umeng.analytics.pro.u r0 = com.umeng.analytics.pro.u.a()
            r2.f = r0
            r0 = 0
            r2.g = r0
            r1 = 0
            r2.j = r1
            r2.k = r0
            r2.l = r0
            r2.m = r0
            r2.n = r1
            r2.u = r0
            r2.x = r0
            r2.y = r0
            com.umeng.analytics.pro.p r0 = r2.c
            r0.a(r2)
            return
    }

    /* synthetic */ b(com.umeng.analytics.b.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.umeng.analytics.b a() {
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a.a()
            return r0
    }

    private void a(android.content.Context r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.Object> r10, long r11, boolean r13) {
            r7 = this;
            if (r8 != 0) goto Lb
            java.lang.String r8 = "context is null in onEventNoCheck, please check!"
            com.umeng.commonsdk.statistics.common.MLog.e(r8)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r0 = move-exception
            r8 = r0
            goto L6c
        Lb:
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L8
            if (r0 != 0) goto L19
            android.content.Context r8 = r8.getApplicationContext()     // Catch: java.lang.Throwable -> L8
            android.content.Context r8 = com.stub.StubApp.getOrigApplicationContext(r8)     // Catch: java.lang.Throwable -> L8
            com.umeng.analytics.b.a = r8     // Catch: java.lang.Throwable -> L8
        L19:
            boolean r8 = r7.j     // Catch: java.lang.Throwable -> L8
            if (r8 == 0) goto L21
            boolean r8 = r7.n     // Catch: java.lang.Throwable -> L8
            if (r8 != 0) goto L26
        L21:
            android.content.Context r8 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L8
            r7.a(r8)     // Catch: java.lang.Throwable -> L8
        L26:
            boolean r8 = r7.e(r9)     // Catch: java.lang.Throwable -> L8
            if (r8 == 0) goto L48
            java.lang.String r8 = "MobclickRT"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8
            r10.<init>()     // Catch: java.lang.Throwable -> L8
            java.lang.String r11 = "--->>> filter ekv ["
            r10.append(r11)     // Catch: java.lang.Throwable -> L8
            r10.append(r9)     // Catch: java.lang.Throwable -> L8
            java.lang.String r9 = "]."
            r10.append(r9)     // Catch: java.lang.Throwable -> L8
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L8
            com.umeng.commonsdk.debug.UMRTLog.i(r8, r9)     // Catch: java.lang.Throwable -> L8
            return
        L48:
            java.lang.String r8 = ""
            org.json.JSONObject r0 = r7.k     // Catch: java.lang.Throwable -> L8
            if (r0 != 0) goto L57
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8
            r0.<init>()     // Catch: java.lang.Throwable -> L8
            r7.k = r0     // Catch: java.lang.Throwable -> L8
        L55:
            r5 = r8
            goto L5e
        L57:
            org.json.JSONObject r8 = r7.k     // Catch: java.lang.Throwable -> L8
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L8
            goto L55
        L5e:
            android.content.Context r8 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L8
            com.umeng.analytics.pro.s r0 = com.umeng.analytics.pro.s.a(r8)     // Catch: java.lang.Throwable -> L8
            r1 = r9
            r2 = r10
            r3 = r11
            r6 = r13
            r0.a(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L8
            return
        L6c:
            boolean r9 = com.umeng.commonsdk.statistics.common.MLog.DEBUG
            if (r9 == 0) goto L73
            com.umeng.commonsdk.statistics.common.MLog.e(r8)
        L73:
            return
    }

    private void b(java.lang.String r5, java.lang.Object r6) {
            r4 = this;
            org.json.JSONObject r0 = r4.k     // Catch: java.lang.Throwable -> L131
            if (r0 != 0) goto Lb
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L131
            r0.<init>()     // Catch: java.lang.Throwable -> L131
            r4.k = r0     // Catch: java.lang.Throwable -> L131
        Lb:
            java.lang.Class r0 = r6.getClass()     // Catch: java.lang.Throwable -> L131
            boolean r0 = r0.isArray()     // Catch: java.lang.Throwable -> L131
            r1 = 0
            if (r0 == 0) goto Ld7
            boolean r0 = r6 instanceof java.lang.String[]     // Catch: java.lang.Throwable -> L131
            if (r0 == 0) goto L46
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch: java.lang.Throwable -> L131
            int r0 = r6.length     // Catch: java.lang.Throwable -> L131
            r2 = 10
            if (r0 <= r2) goto L23
            goto L131
        L23:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L131
            r0.<init>()     // Catch: java.lang.Throwable -> L131
        L28:
            int r2 = r6.length     // Catch: java.lang.Throwable -> L131
            if (r1 >= r2) goto L3f
            r2 = r6[r1]     // Catch: java.lang.Throwable -> L131
            if (r2 == 0) goto L3c
            r3 = 256(0x100, float:3.59E-43)
            boolean r2 = com.umeng.commonsdk.statistics.common.HelperUtils.checkStrLen(r2, r3)     // Catch: java.lang.Throwable -> L131
            if (r2 != 0) goto L3c
            r2 = r6[r1]     // Catch: java.lang.Throwable -> L131
            r0.put(r2)     // Catch: java.lang.Throwable -> L131
        L3c:
            int r1 = r1 + 1
            goto L28
        L3f:
            org.json.JSONObject r6 = r4.k     // Catch: java.lang.Throwable -> L131
            r6.put(r5, r0)     // Catch: java.lang.Throwable -> L131
            goto L131
        L46:
            boolean r0 = r6 instanceof long[]     // Catch: java.lang.Throwable -> L131
            if (r0 == 0) goto L63
            long[] r6 = (long[]) r6     // Catch: java.lang.Throwable -> L131
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L131
            r0.<init>()     // Catch: java.lang.Throwable -> L131
        L51:
            int r2 = r6.length     // Catch: java.lang.Throwable -> L131
            if (r1 >= r2) goto L5c
            r2 = r6[r1]     // Catch: java.lang.Throwable -> L131
            r0.put(r2)     // Catch: java.lang.Throwable -> L131
            int r1 = r1 + 1
            goto L51
        L5c:
            org.json.JSONObject r6 = r4.k     // Catch: java.lang.Throwable -> L131
            r6.put(r5, r0)     // Catch: java.lang.Throwable -> L131
            goto L131
        L63:
            boolean r0 = r6 instanceof int[]     // Catch: java.lang.Throwable -> L131
            if (r0 == 0) goto L80
            int[] r6 = (int[]) r6     // Catch: java.lang.Throwable -> L131
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L131
            r0.<init>()     // Catch: java.lang.Throwable -> L131
        L6e:
            int r2 = r6.length     // Catch: java.lang.Throwable -> L131
            if (r1 >= r2) goto L79
            r2 = r6[r1]     // Catch: java.lang.Throwable -> L131
            r0.put(r2)     // Catch: java.lang.Throwable -> L131
            int r1 = r1 + 1
            goto L6e
        L79:
            org.json.JSONObject r6 = r4.k     // Catch: java.lang.Throwable -> L131
            r6.put(r5, r0)     // Catch: java.lang.Throwable -> L131
            goto L131
        L80:
            boolean r0 = r6 instanceof float[]     // Catch: java.lang.Throwable -> L131
            if (r0 == 0) goto L9e
            float[] r6 = (float[]) r6     // Catch: java.lang.Throwable -> L131
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L131
            r0.<init>()     // Catch: java.lang.Throwable -> L131
        L8b:
            int r2 = r6.length     // Catch: java.lang.Throwable -> L131
            if (r1 >= r2) goto L97
            r2 = r6[r1]     // Catch: java.lang.Throwable -> L131
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L131
            r0.put(r2)     // Catch: java.lang.Throwable -> L131
            int r1 = r1 + 1
            goto L8b
        L97:
            org.json.JSONObject r6 = r4.k     // Catch: java.lang.Throwable -> L131
            r6.put(r5, r0)     // Catch: java.lang.Throwable -> L131
            goto L131
        L9e:
            boolean r0 = r6 instanceof double[]     // Catch: java.lang.Throwable -> L131
            if (r0 == 0) goto Lbb
            double[] r6 = (double[]) r6     // Catch: java.lang.Throwable -> L131
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L131
            r0.<init>()     // Catch: java.lang.Throwable -> L131
        La9:
            int r2 = r6.length     // Catch: java.lang.Throwable -> L131
            if (r1 >= r2) goto Lb4
            r2 = r6[r1]     // Catch: java.lang.Throwable -> L131
            r0.put(r2)     // Catch: java.lang.Throwable -> L131
            int r1 = r1 + 1
            goto La9
        Lb4:
            org.json.JSONObject r6 = r4.k     // Catch: java.lang.Throwable -> L131
            r6.put(r5, r0)     // Catch: java.lang.Throwable -> L131
            goto L131
        Lbb:
            boolean r0 = r6 instanceof short[]     // Catch: java.lang.Throwable -> L131
            if (r0 == 0) goto L131
            short[] r6 = (short[]) r6     // Catch: java.lang.Throwable -> L131
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L131
            r0.<init>()     // Catch: java.lang.Throwable -> L131
        Lc6:
            int r2 = r6.length     // Catch: java.lang.Throwable -> L131
            if (r1 >= r2) goto Ld1
            short r2 = r6[r1]     // Catch: java.lang.Throwable -> L131
            r0.put(r2)     // Catch: java.lang.Throwable -> L131
            int r1 = r1 + 1
            goto Lc6
        Ld1:
            org.json.JSONObject r6 = r4.k     // Catch: java.lang.Throwable -> L131
            r6.put(r5, r0)     // Catch: java.lang.Throwable -> L131
            goto L131
        Ld7:
            boolean r0 = r6 instanceof java.util.List     // Catch: java.lang.Throwable -> L131
            if (r0 == 0) goto L114
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L131
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L131
            r0.<init>()     // Catch: java.lang.Throwable -> L131
        Le2:
            int r2 = r6.size()     // Catch: java.lang.Throwable -> L131
            if (r1 >= r2) goto L10e
            java.lang.Object r2 = r6.get(r1)     // Catch: java.lang.Throwable -> L131
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L131
            if (r3 != 0) goto L104
            boolean r3 = r2 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L131
            if (r3 != 0) goto L104
            boolean r3 = r2 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L131
            if (r3 != 0) goto L104
            boolean r3 = r2 instanceof java.lang.Float     // Catch: java.lang.Throwable -> L131
            if (r3 != 0) goto L104
            boolean r3 = r2 instanceof java.lang.Double     // Catch: java.lang.Throwable -> L131
            if (r3 != 0) goto L104
            boolean r2 = r2 instanceof java.lang.Short     // Catch: java.lang.Throwable -> L131
            if (r2 == 0) goto L10b
        L104:
            java.lang.Object r2 = r6.get(r1)     // Catch: java.lang.Throwable -> L131
            r0.put(r2)     // Catch: java.lang.Throwable -> L131
        L10b:
            int r1 = r1 + 1
            goto Le2
        L10e:
            org.json.JSONObject r6 = r4.k     // Catch: java.lang.Throwable -> L131
            r6.put(r5, r0)     // Catch: java.lang.Throwable -> L131
            goto L131
        L114:
            boolean r0 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L131
            if (r0 != 0) goto L12c
            boolean r0 = r6 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L131
            if (r0 != 0) goto L12c
            boolean r0 = r6 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L131
            if (r0 != 0) goto L12c
            boolean r0 = r6 instanceof java.lang.Float     // Catch: java.lang.Throwable -> L131
            if (r0 != 0) goto L12c
            boolean r0 = r6 instanceof java.lang.Double     // Catch: java.lang.Throwable -> L131
            if (r0 != 0) goto L12c
            boolean r0 = r6 instanceof java.lang.Short     // Catch: java.lang.Throwable -> L131
            if (r0 == 0) goto L131
        L12c:
            org.json.JSONObject r0 = r4.k     // Catch: java.lang.Throwable -> L131
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> L131
        L131:
            return
    }

    private boolean c(java.lang.String r5, java.lang.Object r6) {
            r4 = this;
            java.lang.String r0 = "UTF-8"
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = ", please check key, illegal"
            if (r2 == 0) goto L23
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r6.<init>()     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = "key is "
            r6.append(r0)     // Catch: java.lang.Throwable -> La7
            r6.append(r5)     // Catch: java.lang.Throwable -> La7
            r6.append(r3)     // Catch: java.lang.Throwable -> La7
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> La7
            com.umeng.commonsdk.statistics.common.MLog.e(r5)     // Catch: java.lang.Throwable -> La7
            return r1
        L23:
            byte[] r5 = r5.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L29 java.lang.Throwable -> La7
            int r5 = r5.length     // Catch: java.io.UnsupportedEncodingException -> L29 java.lang.Throwable -> La7
            goto L2b
        L29:
            r5 = 0
        L2b:
            r2 = 128(0x80, float:1.8E-43)
            if (r5 <= r2) goto L47
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r6.<init>()     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = "key length is "
            r6.append(r0)     // Catch: java.lang.Throwable -> La7
            r6.append(r5)     // Catch: java.lang.Throwable -> La7
            r6.append(r3)     // Catch: java.lang.Throwable -> La7
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> La7
            com.umeng.commonsdk.statistics.common.MLog.e(r5)     // Catch: java.lang.Throwable -> La7
            return r1
        L47:
            boolean r5 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> La7
            r2 = 1
            if (r5 == 0) goto L7a
            r5 = r6
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> La7
            byte[] r5 = r5.getBytes(r0)     // Catch: java.lang.Throwable -> La7
            int r5 = r5.length     // Catch: java.lang.Throwable -> La7
            r3 = 256(0x100, float:3.59E-43)
            if (r5 <= r3) goto L79
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r5.<init>()     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = "value length is "
            r5.append(r2)     // Catch: java.lang.Throwable -> La7
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> La7
            byte[] r6 = r6.getBytes(r0)     // Catch: java.lang.Throwable -> La7
            int r6 = r6.length     // Catch: java.lang.Throwable -> La7
            r5.append(r6)     // Catch: java.lang.Throwable -> La7
            java.lang.String r6 = ", please check value, illegal"
            r5.append(r6)     // Catch: java.lang.Throwable -> La7
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La7
            com.umeng.commonsdk.statistics.common.MLog.e(r5)     // Catch: java.lang.Throwable -> La7
            return r1
        L79:
            return r2
        L7a:
            boolean r5 = r6 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> La7
            if (r5 == 0) goto L7f
            return r2
        L7f:
            boolean r5 = r6 instanceof java.lang.Long     // Catch: java.lang.Throwable -> La7
            if (r5 == 0) goto L84
            return r2
        L84:
            boolean r5 = r6 instanceof java.lang.Double     // Catch: java.lang.Throwable -> La7
            if (r5 == 0) goto L89
            return r2
        L89:
            boolean r5 = r6 instanceof java.lang.Float     // Catch: java.lang.Throwable -> La7
            if (r5 == 0) goto L8e
            return r2
        L8e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r5.<init>()     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = "value is "
            r5.append(r0)     // Catch: java.lang.Throwable -> La7
            r5.append(r6)     // Catch: java.lang.Throwable -> La7
            java.lang.String r6 = ", please check value, type illegal"
            r5.append(r6)     // Catch: java.lang.Throwable -> La7
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La7
            com.umeng.commonsdk.statistics.common.MLog.e(r5)     // Catch: java.lang.Throwable -> La7
        La7:
            return r1
    }

    private boolean e(java.lang.String r4) {
            r3 = this;
            com.umeng.analytics.filter.a r0 = r3.u
            boolean r0 = r0.enabled()
            r1 = 1
            if (r0 == 0) goto L12
            com.umeng.analytics.filter.a r0 = r3.u
            boolean r0 = r0.matchHit(r4)
            if (r0 == 0) goto L12
            return r1
        L12:
            com.umeng.analytics.filter.b r0 = r3.x
            boolean r0 = r0.enabled()
            r2 = 0
            if (r0 == 0) goto L3b
            com.umeng.analytics.filter.b r0 = r3.x
            boolean r0 = r0.matchHit(r4)
            if (r0 == 0) goto L3a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "--->>> white list match! id = "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "MobclickRT"
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r4)
            return r2
        L3a:
            return r1
        L3b:
            return r2
    }

    private boolean f(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L13
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L13
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L13
            int r2 = r2.length     // Catch: java.lang.Throwable -> L13
            if (r2 <= 0) goto L13
            r0 = 128(0x80, float:1.8E-43)
            if (r2 >= r0) goto L13
            r2 = 1
            return r2
        L13:
            java.lang.String r2 = "The length of profile key must be less than 128 bytes."
            com.umeng.commonsdk.statistics.common.MLog.e(r2)
            r2 = 0
            return r2
    }

    private boolean g(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L13
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L13
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L13
            int r2 = r2.length     // Catch: java.lang.Throwable -> L13
            if (r2 < 0) goto L13
            r0 = 256(0x100, float:3.59E-43)
            if (r2 >= r0) goto L13
            r2 = 1
            return r2
        L13:
            java.lang.String r2 = "The length of profile value must be less than 256 bytes."
            com.umeng.commonsdk.statistics.common.MLog.e(r2)
            r2 = 0
            return r2
    }

    private void i(android.content.Context r3) {
            r2 = this;
            if (r3 != 0) goto L8
            java.lang.String r3 = "unexpected null context in getNativeSuperProperties"
            com.umeng.commonsdk.statistics.common.MLog.e(r3)     // Catch: java.lang.Throwable -> L4f
            return
        L8:
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L16
            android.content.Context r0 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L4f
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L4f
            com.umeng.analytics.b.a = r0     // Catch: java.lang.Throwable -> L4f
        L16:
            android.content.SharedPreferences r3 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r3)     // Catch: java.lang.Throwable -> L4f
            org.json.JSONObject r0 = r2.k     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L25
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4f
            r0.<init>()     // Catch: java.lang.Throwable -> L4f
            r2.k = r0     // Catch: java.lang.Throwable -> L4f
        L25:
            org.json.JSONObject r0 = r2.l     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L30
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4f
            r0.<init>()     // Catch: java.lang.Throwable -> L4f
            r2.l = r0     // Catch: java.lang.Throwable -> L4f
        L30:
            java.lang.String r0 = "prepp_uapp"
            r1 = 0
            java.lang.String r3 = r3.getString(r0, r1)     // Catch: java.lang.Throwable -> L4f
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L44
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L4f
            r0.<init>(r3)     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L4f
            r2.m = r0     // Catch: org.json.JSONException -> L44 java.lang.Throwable -> L4f
        L44:
            org.json.JSONObject r3 = r2.m     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L4f
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4f
            r3.<init>()     // Catch: java.lang.Throwable -> L4f
            r2.m = r3     // Catch: java.lang.Throwable -> L4f
        L4f:
            return
    }

    void a(double r3, double r5) {
            r2 = this;
            android.content.Context r0 = com.umeng.analytics.b.a
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)
            if (r0 != 0) goto L11
            java.lang.String r3 = "setLocation can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r3)
            return
        L11:
            double[] r0 = com.umeng.analytics.AnalyticsConfig.a
            if (r0 != 0) goto L1a
            r0 = 2
            double[] r0 = new double[r0]
            com.umeng.analytics.AnalyticsConfig.a = r0
        L1a:
            double[] r0 = com.umeng.analytics.AnalyticsConfig.a
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r5
            return
    }

    void a(long r3) {
            r2 = this;
            android.content.Context r0 = com.umeng.analytics.b.a
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)
            if (r0 != 0) goto L11
            java.lang.String r3 = "setSessionContinueMillis can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r3)
            return
        L11:
            com.umeng.analytics.AnalyticsConfig.kContinueSessionMillis = r3
            com.umeng.analytics.pro.y r3 = com.umeng.analytics.pro.y.a()
            long r0 = com.umeng.analytics.AnalyticsConfig.kContinueSessionMillis
            r3.a(r0)
            return
    }

    public void a(android.content.Context r4) {
            r3 = this;
            if (r4 != 0) goto L4
            goto L8f
        L4:
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L12
            android.content.Context r0 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L8f
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L8f
            com.umeng.analytics.b.a = r0     // Catch: java.lang.Throwable -> L8f
        L12:
            com.umeng.analytics.filter.a r0 = r3.u     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L26
            com.umeng.analytics.filter.a r0 = new com.umeng.analytics.filter.a     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = com.umeng.analytics.b.s     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = "ekv_bl_ver"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L8f
            r3.u = r0     // Catch: java.lang.Throwable -> L8f
            android.content.Context r1 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L8f
            r0.register(r1)     // Catch: java.lang.Throwable -> L8f
        L26:
            com.umeng.analytics.filter.b r0 = r3.x     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L3a
            com.umeng.analytics.filter.b r0 = new com.umeng.analytics.filter.b     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = com.umeng.analytics.b.v     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = "ekv_wl_ver"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L8f
            r3.x = r0     // Catch: java.lang.Throwable -> L8f
            android.content.Context r1 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L8f
            r0.register(r1)     // Catch: java.lang.Throwable -> L8f
        L3a:
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L8f
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L43
            goto L8f
        L43:
            boolean r0 = r3.j     // Catch: java.lang.Throwable -> L8f
            r1 = 1
            if (r0 != 0) goto L4f
            r3.j = r1     // Catch: java.lang.Throwable -> L8f
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L8f
            r3.i(r0)     // Catch: java.lang.Throwable -> L8f
        L4f:
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L8f
            boolean r0 = r3.n     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L73
            com.umeng.analytics.pro.l r0 = com.umeng.analytics.pro.l.a(r4)     // Catch: java.lang.Throwable -> L63
            r3.g = r0     // Catch: java.lang.Throwable -> L63
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L65
            r3.n = r1     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            r4 = move-exception
            goto L8d
        L65:
            com.umeng.analytics.pro.m r0 = com.umeng.analytics.pro.m.a()     // Catch: java.lang.Throwable -> L63
            r3.y = r0     // Catch: java.lang.Throwable -> L63
            com.umeng.analytics.pro.m.a(r4)     // Catch: java.lang.Throwable -> L73
            com.umeng.analytics.pro.m r4 = r3.y     // Catch: java.lang.Throwable -> L73
            r4.a(r3)     // Catch: java.lang.Throwable -> L73
        L73:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L63
            boolean r4 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Throwable -> L8f
            if (r4 == 0) goto L83
            java.lang.String r4 = "统计SDK常见问题索引贴 详见链接 http://developer.umeng.com/docs/66650/cate/66650"
            java.lang.String r0 = ""
            r1 = 0
            r2 = 3
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r4, r2, r0, r1, r1)     // Catch: java.lang.Throwable -> L8f
        L83:
            android.content.Context r4 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L8f
            com.umeng.analytics.CoreProtocol r4 = com.umeng.analytics.CoreProtocol.getInstance(r4)     // Catch: java.lang.Throwable -> L8f
            com.umeng.commonsdk.framework.UMWorkDispatch.registerConnStateObserver(r4)     // Catch: java.lang.Throwable -> L8f
            goto L8f
        L8d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L63
            throw r4     // Catch: java.lang.Throwable -> L8f
        L8f:
            return
    }

    public void a(android.content.Context r2, int r3) {
            r1 = this;
            if (r2 != 0) goto L8
            java.lang.String r2 = "unexpected null context in setVerticalType"
            com.umeng.commonsdk.statistics.common.MLog.e(r2)
            return
        L8:
            android.content.Context r0 = com.umeng.analytics.b.a
            if (r0 != 0) goto L16
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            com.umeng.analytics.b.a = r2
        L16:
            android.content.Context r2 = com.umeng.analytics.b.a
            boolean r2 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r2)
            if (r2 != 0) goto L24
            java.lang.String r2 = "setVerticalType can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r2)
            return
        L24:
            boolean r2 = r1.j
            if (r2 == 0) goto L2c
            boolean r2 = r1.n
            if (r2 != 0) goto L31
        L2c:
            android.content.Context r2 = com.umeng.analytics.b.a
            r1.a(r2)
        L31:
            android.content.Context r2 = com.umeng.analytics.b.a
            com.umeng.analytics.AnalyticsConfig.a(r2, r3)
            return
    }

    void a(android.content.Context r2, com.umeng.analytics.MobclickAgent.EScenarioType r3) {
            r1 = this;
            if (r2 != 0) goto L8
            java.lang.String r2 = "unexpected null context in setScenarioType"
            com.umeng.commonsdk.statistics.common.MLog.e(r2)
            return
        L8:
            android.content.Context r0 = com.umeng.analytics.b.a
            if (r0 != 0) goto L16
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            com.umeng.analytics.b.a = r2
        L16:
            android.content.Context r2 = com.umeng.analytics.b.a
            boolean r2 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r2)
            if (r2 != 0) goto L24
            java.lang.String r2 = "setScenarioType can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r2)
            return
        L24:
            if (r3 == 0) goto L2f
            int r2 = r3.toValue()
            android.content.Context r3 = com.umeng.analytics.b.a
            r1.a(r3, r2)
        L2f:
            boolean r2 = r1.j
            if (r2 == 0) goto L39
            boolean r2 = r1.n
            if (r2 != 0) goto L38
            goto L39
        L38:
            return
        L39:
            android.content.Context r2 = com.umeng.analytics.b.a
            r1.a(r2)
            return
    }

    void a(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = "\\|"
            r1 = 0
            if (r4 != 0) goto Lb
            java.lang.String r4 = com.umeng.analytics.pro.j.w
            com.umeng.commonsdk.debug.UMLog.aq(r4, r1, r0)
            return
        Lb:
            android.content.Context r2 = com.umeng.analytics.b.a
            if (r2 != 0) goto L19
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            com.umeng.analytics.b.a = r4
        L19:
            android.content.Context r4 = com.umeng.analytics.b.a
            boolean r4 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r4)
            if (r4 != 0) goto L27
            java.lang.String r4 = "reportError can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r4)
            return
        L27:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 == 0) goto L39
            boolean r4 = com.umeng.commonsdk.UMConfigure.isDebugLog()
            if (r4 == 0) goto L80
            java.lang.String r4 = com.umeng.analytics.pro.j.x
            com.umeng.commonsdk.debug.UMLog.aq(r4, r1, r0)
            return
        L39:
            boolean r4 = r3.j     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L44
            boolean r4 = r3.n     // Catch: java.lang.Throwable -> L42
            if (r4 != 0) goto L49
            goto L44
        L42:
            r4 = move-exception
            goto L79
        L44:
            android.content.Context r4 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L42
            r3.a(r4)     // Catch: java.lang.Throwable -> L42
        L49:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L42
            r4.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "ts"
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L42
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "error_source"
            r1 = 2
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "context"
            r4.put(r0, r5)     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = "__ii"
            com.umeng.analytics.pro.u r0 = r3.f     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r0.c()     // Catch: java.lang.Throwable -> L42
            r4.put(r5, r0)     // Catch: java.lang.Throwable -> L42
            android.content.Context r5 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L42
            com.umeng.analytics.CoreProtocol r0 = com.umeng.analytics.CoreProtocol.getInstance(r5)     // Catch: java.lang.Throwable -> L42
            r1 = 4106(0x100a, float:5.754E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r5, r1, r0, r4)     // Catch: java.lang.Throwable -> L42
            return
        L79:
            boolean r5 = com.umeng.commonsdk.statistics.common.MLog.DEBUG
            if (r5 == 0) goto L80
            com.umeng.commonsdk.statistics.common.MLog.e(r4)
        L80:
            return
    }

    public synchronized void a(android.content.Context r4, java.lang.String r5, java.lang.Object r6) {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            if (r4 != 0) goto Ld
            java.lang.String r4 = com.umeng.analytics.pro.j.af     // Catch: java.lang.Throwable -> L2a0
            java.lang.String r5 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq(r4, r0, r5)     // Catch: java.lang.Throwable -> L2a0
            monitor-exit(r3)
            return
        Ld:
            android.content.Context r1 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L2a0
            if (r1 != 0) goto L1b
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L2a0
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L2a0
            com.umeng.analytics.b.a = r4     // Catch: java.lang.Throwable -> L2a0
        L1b:
            android.content.Context r4 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L2a0
            boolean r4 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r4)     // Catch: java.lang.Throwable -> L2a0
            if (r4 != 0) goto L2a
            java.lang.String r4 = "registerSuperProperty can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r4)     // Catch: java.lang.Throwable -> L2a0
            monitor-exit(r3)
            return
        L2a:
            boolean r4 = r3.j     // Catch: java.lang.Throwable -> L2a0
            if (r4 == 0) goto L32
            boolean r4 = r3.n     // Catch: java.lang.Throwable -> L2a0
            if (r4 != 0) goto L37
        L32:
            android.content.Context r4 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L2a0
            r3.a(r4)     // Catch: java.lang.Throwable -> L2a0
        L37:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L2a0
            if (r4 != 0) goto L297
            if (r6 != 0) goto L41
            goto L297
        L41:
            java.lang.String r4 = "umsp_1"
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L2a0
            if (r4 != 0) goto L84
            java.lang.String r4 = "umsp_2"
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L2a0
            if (r4 != 0) goto L84
            java.lang.String r4 = "umsp_3"
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L2a0
            if (r4 != 0) goto L84
            java.lang.String r4 = "umsp_4"
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L2a0
            if (r4 != 0) goto L84
            java.lang.String r4 = "umsp_5"
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L2a0
            if (r4 != 0) goto L84
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a0
            r4.<init>()     // Catch: java.lang.Throwable -> L2a0
            java.lang.String r6 = "property name is "
            r4.append(r6)     // Catch: java.lang.Throwable -> L2a0
            r4.append(r5)     // Catch: java.lang.Throwable -> L2a0
            java.lang.String r5 = ", please check key, must be correct!"
            r4.append(r5)     // Catch: java.lang.Throwable -> L2a0
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2a0
            com.umeng.commonsdk.statistics.common.MLog.e(r4)     // Catch: java.lang.Throwable -> L2a0
            monitor-exit(r3)
            return
        L84:
            boolean r4 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2a0
            r1 = 256(0x100, float:3.59E-43)
            if (r4 == 0) goto Laf
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L2a0
            boolean r4 = com.umeng.commonsdk.statistics.common.HelperUtils.checkStrLen(r4, r1)     // Catch: java.lang.Throwable -> L2a0
            if (r4 != 0) goto Laf
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a0
            r4.<init>()     // Catch: java.lang.Throwable -> L2a0
            java.lang.String r5 = "property value is "
            r4.append(r5)     // Catch: java.lang.Throwable -> L2a0
            r4.append(r6)     // Catch: java.lang.Throwable -> L2a0
            java.lang.String r5 = ", please check value, lawless!"
            r4.append(r5)     // Catch: java.lang.Throwable -> L2a0
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2a0
            com.umeng.commonsdk.statistics.common.MLog.e(r4)     // Catch: java.lang.Throwable -> L2a0
            monitor-exit(r3)
            return
        Laf:
            org.json.JSONObject r4 = r3.k     // Catch: java.lang.Throwable -> L285
            if (r4 != 0) goto Lba
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L285
            r4.<init>()     // Catch: java.lang.Throwable -> L285
            r3.k = r4     // Catch: java.lang.Throwable -> L285
        Lba:
            java.lang.Class r4 = r6.getClass()     // Catch: java.lang.Throwable -> L285
            boolean r4 = r4.isArray()     // Catch: java.lang.Throwable -> L285
            if (r4 == 0) goto L260
            boolean r4 = r6 instanceof java.lang.String[]     // Catch: java.lang.Throwable -> L285
            r2 = 10
            if (r4 == 0) goto L12e
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch: java.lang.Throwable -> L285
            int r4 = r6.length     // Catch: java.lang.Throwable -> L285
            if (r4 <= r2) goto Leb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L285
            r4.<init>()     // Catch: java.lang.Throwable -> L285
            java.lang.String r5 = "please check value, size is "
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            int r5 = r6.length     // Catch: java.lang.Throwable -> L285
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            java.lang.String r5 = ", overstep 10!"
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L285
            com.umeng.commonsdk.statistics.common.MLog.e(r4)     // Catch: java.lang.Throwable -> L285
            monitor-exit(r3)
            return
        Leb:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L285
            r4.<init>()     // Catch: java.lang.Throwable -> L285
        Lf0:
            int r2 = r6.length     // Catch: java.lang.Throwable -> L285
            if (r0 >= r2) goto L127
            r2 = r6[r0]     // Catch: java.lang.Throwable -> L285
            if (r2 == 0) goto L106
            boolean r2 = com.umeng.commonsdk.statistics.common.HelperUtils.checkStrLen(r2, r1)     // Catch: java.lang.Throwable -> L285
            if (r2 != 0) goto Lfe
            goto L106
        Lfe:
            r2 = r6[r0]     // Catch: java.lang.Throwable -> L285
            r4.put(r2)     // Catch: java.lang.Throwable -> L285
            int r0 = r0 + 1
            goto Lf0
        L106:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L285
            r4.<init>()     // Catch: java.lang.Throwable -> L285
            java.lang.String r5 = "please check value, length is "
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            r5 = r6[r0]     // Catch: java.lang.Throwable -> L285
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L285
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            java.lang.String r5 = ", overlength 256!"
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L285
            com.umeng.commonsdk.statistics.common.MLog.e(r4)     // Catch: java.lang.Throwable -> L285
            monitor-exit(r3)
            return
        L127:
            org.json.JSONObject r6 = r3.k     // Catch: java.lang.Throwable -> L285
            r6.put(r5, r4)     // Catch: java.lang.Throwable -> L285
            goto L285
        L12e:
            boolean r4 = r6 instanceof long[]     // Catch: java.lang.Throwable -> L285
            if (r4 == 0) goto L16a
            long[] r6 = (long[]) r6     // Catch: java.lang.Throwable -> L285
            int r4 = r6.length     // Catch: java.lang.Throwable -> L285
            if (r4 <= r2) goto L153
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L285
            r4.<init>()     // Catch: java.lang.Throwable -> L285
            java.lang.String r5 = "please check value, size is "
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            int r5 = r6.length     // Catch: java.lang.Throwable -> L285
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            java.lang.String r5 = ", overstep 10!"
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L285
            com.umeng.commonsdk.statistics.common.MLog.e(r4)     // Catch: java.lang.Throwable -> L285
            monitor-exit(r3)
            return
        L153:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L285
            r4.<init>()     // Catch: java.lang.Throwable -> L285
        L158:
            int r1 = r6.length     // Catch: java.lang.Throwable -> L285
            if (r0 >= r1) goto L163
            r1 = r6[r0]     // Catch: java.lang.Throwable -> L285
            r4.put(r1)     // Catch: java.lang.Throwable -> L285
            int r0 = r0 + 1
            goto L158
        L163:
            org.json.JSONObject r6 = r3.k     // Catch: java.lang.Throwable -> L285
            r6.put(r5, r4)     // Catch: java.lang.Throwable -> L285
            goto L285
        L16a:
            boolean r4 = r6 instanceof int[]     // Catch: java.lang.Throwable -> L285
            if (r4 == 0) goto L1a6
            int[] r6 = (int[]) r6     // Catch: java.lang.Throwable -> L285
            int r4 = r6.length     // Catch: java.lang.Throwable -> L285
            if (r4 <= r2) goto L18f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L285
            r4.<init>()     // Catch: java.lang.Throwable -> L285
            java.lang.String r5 = "please check value, size is "
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            int r5 = r6.length     // Catch: java.lang.Throwable -> L285
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            java.lang.String r5 = ", overstep 10!"
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L285
            com.umeng.commonsdk.statistics.common.MLog.e(r4)     // Catch: java.lang.Throwable -> L285
            monitor-exit(r3)
            return
        L18f:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L285
            r4.<init>()     // Catch: java.lang.Throwable -> L285
        L194:
            int r1 = r6.length     // Catch: java.lang.Throwable -> L285
            if (r0 >= r1) goto L19f
            r1 = r6[r0]     // Catch: java.lang.Throwable -> L285
            r4.put(r1)     // Catch: java.lang.Throwable -> L285
            int r0 = r0 + 1
            goto L194
        L19f:
            org.json.JSONObject r6 = r3.k     // Catch: java.lang.Throwable -> L285
            r6.put(r5, r4)     // Catch: java.lang.Throwable -> L285
            goto L285
        L1a6:
            boolean r4 = r6 instanceof float[]     // Catch: java.lang.Throwable -> L285
            if (r4 == 0) goto L1e3
            float[] r6 = (float[]) r6     // Catch: java.lang.Throwable -> L285
            int r4 = r6.length     // Catch: java.lang.Throwable -> L285
            if (r4 <= r2) goto L1cb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L285
            r4.<init>()     // Catch: java.lang.Throwable -> L285
            java.lang.String r5 = "please check value, size is "
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            int r5 = r6.length     // Catch: java.lang.Throwable -> L285
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            java.lang.String r5 = ", overstep 10!"
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L285
            com.umeng.commonsdk.statistics.common.MLog.e(r4)     // Catch: java.lang.Throwable -> L285
            monitor-exit(r3)
            return
        L1cb:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L285
            r4.<init>()     // Catch: java.lang.Throwable -> L285
        L1d0:
            int r1 = r6.length     // Catch: java.lang.Throwable -> L285
            if (r0 >= r1) goto L1dc
            r1 = r6[r0]     // Catch: java.lang.Throwable -> L285
            double r1 = (double) r1     // Catch: java.lang.Throwable -> L285
            r4.put(r1)     // Catch: java.lang.Throwable -> L285
            int r0 = r0 + 1
            goto L1d0
        L1dc:
            org.json.JSONObject r6 = r3.k     // Catch: java.lang.Throwable -> L285
            r6.put(r5, r4)     // Catch: java.lang.Throwable -> L285
            goto L285
        L1e3:
            boolean r4 = r6 instanceof double[]     // Catch: java.lang.Throwable -> L285
            if (r4 == 0) goto L21e
            double[] r6 = (double[]) r6     // Catch: java.lang.Throwable -> L285
            int r4 = r6.length     // Catch: java.lang.Throwable -> L285
            if (r4 <= r2) goto L208
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L285
            r4.<init>()     // Catch: java.lang.Throwable -> L285
            java.lang.String r5 = "please check value, size is "
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            int r5 = r6.length     // Catch: java.lang.Throwable -> L285
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            java.lang.String r5 = ", overstep 10!"
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L285
            com.umeng.commonsdk.statistics.common.MLog.e(r4)     // Catch: java.lang.Throwable -> L285
            monitor-exit(r3)
            return
        L208:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L285
            r4.<init>()     // Catch: java.lang.Throwable -> L285
        L20d:
            int r1 = r6.length     // Catch: java.lang.Throwable -> L285
            if (r0 >= r1) goto L218
            r1 = r6[r0]     // Catch: java.lang.Throwable -> L285
            r4.put(r1)     // Catch: java.lang.Throwable -> L285
            int r0 = r0 + 1
            goto L20d
        L218:
            org.json.JSONObject r6 = r3.k     // Catch: java.lang.Throwable -> L285
            r6.put(r5, r4)     // Catch: java.lang.Throwable -> L285
            goto L285
        L21e:
            boolean r4 = r6 instanceof short[]     // Catch: java.lang.Throwable -> L285
            if (r4 == 0) goto L259
            short[] r6 = (short[]) r6     // Catch: java.lang.Throwable -> L285
            int r4 = r6.length     // Catch: java.lang.Throwable -> L285
            if (r4 <= r2) goto L243
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L285
            r4.<init>()     // Catch: java.lang.Throwable -> L285
            java.lang.String r5 = "please check value, size is "
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            int r5 = r6.length     // Catch: java.lang.Throwable -> L285
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            java.lang.String r5 = ", overstep 10!"
            r4.append(r5)     // Catch: java.lang.Throwable -> L285
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L285
            com.umeng.commonsdk.statistics.common.MLog.e(r4)     // Catch: java.lang.Throwable -> L285
            monitor-exit(r3)
            return
        L243:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L285
            r4.<init>()     // Catch: java.lang.Throwable -> L285
        L248:
            int r1 = r6.length     // Catch: java.lang.Throwable -> L285
            if (r0 >= r1) goto L253
            short r1 = r6[r0]     // Catch: java.lang.Throwable -> L285
            r4.put(r1)     // Catch: java.lang.Throwable -> L285
            int r0 = r0 + 1
            goto L248
        L253:
            org.json.JSONObject r6 = r3.k     // Catch: java.lang.Throwable -> L285
            r6.put(r5, r4)     // Catch: java.lang.Throwable -> L285
            goto L285
        L259:
            java.lang.String r4 = "please check value, illegal type!"
            com.umeng.commonsdk.statistics.common.MLog.e(r4)     // Catch: java.lang.Throwable -> L285
            monitor-exit(r3)
            return
        L260:
            boolean r4 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L285
            if (r4 != 0) goto L280
            boolean r4 = r6 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L285
            if (r4 != 0) goto L280
            boolean r4 = r6 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L285
            if (r4 != 0) goto L280
            boolean r4 = r6 instanceof java.lang.Float     // Catch: java.lang.Throwable -> L285
            if (r4 != 0) goto L280
            boolean r4 = r6 instanceof java.lang.Double     // Catch: java.lang.Throwable -> L285
            if (r4 != 0) goto L280
            boolean r4 = r6 instanceof java.lang.Short     // Catch: java.lang.Throwable -> L285
            if (r4 == 0) goto L279
            goto L280
        L279:
            java.lang.String r4 = "please check value, illegal type!"
            com.umeng.commonsdk.statistics.common.MLog.e(r4)     // Catch: java.lang.Throwable -> L285
            monitor-exit(r3)
            return
        L280:
            org.json.JSONObject r4 = r3.k     // Catch: java.lang.Throwable -> L285
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L285
        L285:
            android.content.Context r4 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L2a0
            com.umeng.analytics.CoreProtocol r5 = com.umeng.analytics.CoreProtocol.getInstance(r4)     // Catch: java.lang.Throwable -> L2a0
            org.json.JSONObject r6 = r3.k     // Catch: java.lang.Throwable -> L2a0
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L2a0
            r0 = 8195(0x2003, float:1.1484E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r4, r0, r5, r6)     // Catch: java.lang.Throwable -> L2a0
            goto L2a0
        L297:
            java.lang.String r4 = com.umeng.analytics.pro.j.ag     // Catch: java.lang.Throwable -> L2a0
            java.lang.String r5 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq(r4, r0, r5)     // Catch: java.lang.Throwable -> L2a0
            monitor-exit(r3)
            return
        L2a0:
            monitor-exit(r3)
            return
    }

    public void a(android.content.Context r8, java.lang.String r9, java.lang.String r10, long r11, int r13) {
            r7 = this;
            if (r8 != 0) goto L4
            goto L70
        L4:
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L16
            android.content.Context r8 = r8.getApplicationContext()     // Catch: java.lang.Throwable -> L13
            android.content.Context r8 = com.stub.StubApp.getOrigApplicationContext(r8)     // Catch: java.lang.Throwable -> L13
            com.umeng.analytics.b.a = r8     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r0 = move-exception
            r8 = r0
            goto L69
        L16:
            boolean r8 = r7.j     // Catch: java.lang.Throwable -> L13
            if (r8 == 0) goto L1e
            boolean r8 = r7.n     // Catch: java.lang.Throwable -> L13
            if (r8 != 0) goto L23
        L1e:
            android.content.Context r8 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L13
            r7.a(r8)     // Catch: java.lang.Throwable -> L13
        L23:
            boolean r8 = r7.e(r9)     // Catch: java.lang.Throwable -> L13
            if (r8 == 0) goto L45
            java.lang.String r8 = "MobclickRT"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r10.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r11 = "--->>> filter ekv ["
            r10.append(r11)     // Catch: java.lang.Throwable -> L13
            r10.append(r9)     // Catch: java.lang.Throwable -> L13
            java.lang.String r9 = "]."
            r10.append(r9)     // Catch: java.lang.Throwable -> L13
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L13
            com.umeng.commonsdk.debug.UMRTLog.i(r8, r9)     // Catch: java.lang.Throwable -> L13
            return
        L45:
            java.lang.String r8 = ""
            org.json.JSONObject r0 = r7.k     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L54
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> L13
            r7.k = r0     // Catch: java.lang.Throwable -> L13
        L52:
            r6 = r8
            goto L5b
        L54:
            org.json.JSONObject r8 = r7.k     // Catch: java.lang.Throwable -> L13
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L13
            goto L52
        L5b:
            android.content.Context r8 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L13
            com.umeng.analytics.pro.s r0 = com.umeng.analytics.pro.s.a(r8)     // Catch: java.lang.Throwable -> L13
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r13
            r0.a(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L13
            return
        L69:
            boolean r9 = com.umeng.commonsdk.statistics.common.MLog.DEBUG
            if (r9 == 0) goto L70
            com.umeng.commonsdk.statistics.common.MLog.e(r8)
        L70:
            return
    }

    public void a(android.content.Context r2, java.lang.String r3, java.util.HashMap<java.lang.String, java.lang.Object> r4) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L54
        L3:
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L14
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L12
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L12
            com.umeng.analytics.b.a = r2     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r2 = move-exception
            goto L4d
        L14:
            android.content.Context r2 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L12
            boolean r2 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r2)     // Catch: java.lang.Throwable -> L12
            if (r2 != 0) goto L22
            java.lang.String r2 = "onGKVEvent can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r2)     // Catch: java.lang.Throwable -> L12
            return
        L22:
            boolean r2 = r1.j     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto L2a
            boolean r2 = r1.n     // Catch: java.lang.Throwable -> L12
            if (r2 != 0) goto L2f
        L2a:
            android.content.Context r2 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L12
            r1.a(r2)     // Catch: java.lang.Throwable -> L12
        L2f:
            java.lang.String r2 = ""
            org.json.JSONObject r0 = r1.k     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L3d
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            r1.k = r0     // Catch: java.lang.Throwable -> L12
            goto L43
        L3d:
            org.json.JSONObject r2 = r1.k     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L12
        L43:
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L12
            com.umeng.analytics.pro.s r0 = com.umeng.analytics.pro.s.a(r0)     // Catch: java.lang.Throwable -> L12
            r0.a(r3, r4, r2)     // Catch: java.lang.Throwable -> L12
            return
        L4d:
            boolean r3 = com.umeng.commonsdk.statistics.common.MLog.DEBUG
            if (r3 == 0) goto L54
            com.umeng.commonsdk.statistics.common.MLog.e(r2)
        L54:
            return
    }

    public void a(android.content.Context r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.Object> r10) {
            r7 = this;
            r4 = -1
            r6 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.a(r1, r2, r3, r4, r6)
            return
    }

    void a(android.content.Context r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.Object> r12, long r13) {
            r9 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "\\|"
            r2 = 0
            if (r0 != 0) goto L53
            java.lang.String[] r0 = com.umeng.analytics.pro.d.aL     // Catch: java.lang.Throwable -> L1b
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.contains(r11)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            java.lang.String r0 = com.umeng.analytics.pro.j.b     // Catch: java.lang.Throwable -> L1b
            com.umeng.commonsdk.debug.UMLog.aq(r0, r2, r1)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r0 = move-exception
            goto L59
        L1d:
            boolean r0 = r12.isEmpty()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L29
            java.lang.String r0 = com.umeng.analytics.pro.j.d     // Catch: java.lang.Throwable -> L1b
            com.umeng.commonsdk.debug.UMLog.aq(r0, r2, r1)     // Catch: java.lang.Throwable -> L1b
            return
        L29:
            java.util.Set r0 = r12.entrySet()     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1b
        L31:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L60
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L1b
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L1b
            java.lang.String[] r4 = com.umeng.analytics.pro.d.aL     // Catch: java.lang.Throwable -> L1b
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r3 = r3.getKey()     // Catch: java.lang.Throwable -> L1b
            boolean r3 = r4.contains(r3)     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L31
            java.lang.String r0 = com.umeng.analytics.pro.j.e     // Catch: java.lang.Throwable -> L1b
            com.umeng.commonsdk.debug.UMLog.aq(r0, r2, r1)     // Catch: java.lang.Throwable -> L1b
            return
        L53:
            java.lang.String r0 = com.umeng.analytics.pro.j.c     // Catch: java.lang.Throwable -> L1b
            com.umeng.commonsdk.debug.UMLog.aq(r0, r2, r1)     // Catch: java.lang.Throwable -> L1b
            return
        L59:
            boolean r1 = com.umeng.commonsdk.statistics.common.MLog.DEBUG
            if (r1 == 0) goto L60
            com.umeng.commonsdk.statistics.common.MLog.e(r0)
        L60:
            r8 = 0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2.a(r3, r4, r5, r6, r8)
            return
    }

    void a(android.content.Context r2, java.lang.Throwable r3) {
            r1 = this;
            if (r2 == 0) goto L43
            if (r3 != 0) goto L5
            goto L43
        L5:
            android.content.Context r0 = com.umeng.analytics.b.a
            if (r0 != 0) goto L13
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            com.umeng.analytics.b.a = r2
        L13:
            android.content.Context r2 = com.umeng.analytics.b.a
            boolean r2 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r2)
            if (r2 != 0) goto L21
            java.lang.String r2 = "reportError can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r2)
            return
        L21:
            boolean r2 = r1.j     // Catch: java.lang.Exception -> L2a
            if (r2 == 0) goto L2c
            boolean r2 = r1.n     // Catch: java.lang.Exception -> L2a
            if (r2 != 0) goto L31
            goto L2c
        L2a:
            r2 = move-exception
            goto L3b
        L2c:
            android.content.Context r2 = com.umeng.analytics.b.a     // Catch: java.lang.Exception -> L2a
            r1.a(r2)     // Catch: java.lang.Exception -> L2a
        L31:
            android.content.Context r2 = com.umeng.analytics.b.a     // Catch: java.lang.Exception -> L2a
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DataHelper.convertExceptionToString(r3)     // Catch: java.lang.Exception -> L2a
            r1.a(r2, r3)     // Catch: java.lang.Exception -> L2a
            return
        L3b:
            boolean r3 = com.umeng.commonsdk.statistics.common.MLog.DEBUG
            if (r3 == 0) goto L42
            com.umeng.commonsdk.statistics.common.MLog.e(r2)
        L42:
            return
        L43:
            java.lang.String r2 = com.umeng.analytics.pro.j.y
            r3 = 0
            java.lang.String r0 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq(r2, r3, r0)
            return
    }

    public synchronized void a(android.content.Context r2, java.util.List<java.lang.String> r3) {
            r1 = this;
            monitor-enter(r1)
            if (r2 != 0) goto Lf
            java.lang.String r2 = com.umeng.analytics.pro.j.aj     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = "\\|"
            r0 = 0
            com.umeng.commonsdk.debug.UMLog.aq(r2, r0, r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            goto L43
        Lf:
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto L1d
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> Ld
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> Ld
            com.umeng.analytics.b.a = r2     // Catch: java.lang.Throwable -> Ld
        L1d:
            android.content.Context r2 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Ld
            boolean r2 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r2)     // Catch: java.lang.Throwable -> Ld
            if (r2 != 0) goto L2c
            java.lang.String r2 = "setFirstLaunchEvent can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        L2c:
            boolean r2 = r1.j     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto L34
            boolean r2 = r1.n     // Catch: java.lang.Throwable -> Ld
            if (r2 != 0) goto L39
        L34:
            android.content.Context r2 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Ld
            r1.a(r2)     // Catch: java.lang.Throwable -> Ld
        L39:
            android.content.Context r2 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Ld
            com.umeng.analytics.pro.s r2 = com.umeng.analytics.pro.s.a(r2)     // Catch: java.lang.Throwable -> Ld
            r2.a(r3)     // Catch: java.lang.Throwable -> Ld
            goto L46
        L43:
            com.umeng.commonsdk.statistics.common.MLog.e(r2)     // Catch: java.lang.Throwable -> L48
        L46:
            monitor-exit(r1)
            return
        L48:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L48
            throw r2
    }

    public synchronized void a(android.content.Context r5, org.json.JSONObject r6) {
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            if (r5 != 0) goto L10
            java.lang.String r5 = com.umeng.analytics.pro.j.al     // Catch: java.lang.Throwable -> Ld
            java.lang.String r6 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq(r5, r0, r6)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r4)
            return
        Ld:
            r5 = move-exception
            goto Lba
        L10:
            android.content.Context r1 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto L1e
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> Ld
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)     // Catch: java.lang.Throwable -> Ld
            com.umeng.analytics.b.a = r5     // Catch: java.lang.Throwable -> Ld
        L1e:
            android.content.Context r5 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Ld
            boolean r5 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r5)     // Catch: java.lang.Throwable -> Ld
            if (r5 != 0) goto L2d
            java.lang.String r5 = "registerPreProperties can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r5)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r4)
            return
        L2d:
            boolean r5 = r4.j     // Catch: java.lang.Throwable -> Ld
            if (r5 == 0) goto L35
            boolean r5 = r4.n     // Catch: java.lang.Throwable -> Ld
            if (r5 != 0) goto L3a
        L35:
            android.content.Context r5 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Ld
            r4.a(r5)     // Catch: java.lang.Throwable -> Ld
        L3a:
            org.json.JSONObject r5 = r4.m     // Catch: java.lang.Throwable -> Ld
            if (r5 != 0) goto L45
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld
            r5.<init>()     // Catch: java.lang.Throwable -> Ld
            r4.m = r5     // Catch: java.lang.Throwable -> Ld
        L45:
            if (r6 == 0) goto Lb1
            int r5 = r6.length()     // Catch: java.lang.Throwable -> Ld
            if (r5 > 0) goto L4e
            goto Lb1
        L4e:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L5a
            org.json.JSONObject r0 = r4.m     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L5a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L5a
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L5a
            goto L5b
        L5a:
            r5 = 0
        L5b:
            if (r5 != 0) goto L62
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld
            r5.<init>()     // Catch: java.lang.Throwable -> Ld
        L62:
            java.util.Iterator r0 = r6.keys()     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L94
        L68:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L94
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L68
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L68
            java.lang.Object r2 = r6.get(r1)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L68
            boolean r3 = r4.c(r1, r2)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L68
            if (r3 != 0) goto L82
            monitor-exit(r4)
            return
        L82:
            r5.put(r1, r2)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L68
            int r1 = r5.length()     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L68
            r2 = 10
            if (r1 <= r2) goto L68
            java.lang.String r1 = "please check propertics, size overlength!"
            com.umeng.commonsdk.statistics.common.MLog.e(r1)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L68
            monitor-exit(r4)
            return
        L94:
            r4.m = r5     // Catch: java.lang.Throwable -> Ld
            org.json.JSONObject r5 = r4.m     // Catch: java.lang.Throwable -> Ld
            int r5 = r5.length()     // Catch: java.lang.Throwable -> Ld
            if (r5 <= 0) goto Laf
            android.content.Context r5 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Ld
            com.umeng.analytics.CoreProtocol r6 = com.umeng.analytics.CoreProtocol.getInstance(r5)     // Catch: java.lang.Throwable -> Ld
            org.json.JSONObject r0 = r4.m     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld
            r1 = 8199(0x2007, float:1.1489E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r5, r1, r6, r0)     // Catch: java.lang.Throwable -> Ld
        Laf:
            monitor-exit(r4)
            return
        Lb1:
            java.lang.String r5 = com.umeng.analytics.pro.j.am     // Catch: java.lang.Throwable -> Ld
            java.lang.String r6 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq(r5, r0, r6)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r4)
            return
        Lba:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld
            throw r5
    }

    public void a(com.umeng.common.ISysListener r2) {
            r1 = this;
            android.content.Context r0 = com.umeng.analytics.b.a
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)
            if (r0 != 0) goto Le
            java.lang.String r2 = "setSysListener can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r2)
            return
        Le:
            r1.b = r2
            return
    }

    public synchronized void a(java.lang.Object r3) {
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto L7
            monitor-exit(r2)
            return
        L7:
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto L14
            java.lang.String r3 = "registerSuperPropertyByCoreProtocol can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r3)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r2)
            return
        L14:
            if (r3 == 0) goto L39
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L39
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L39
            android.content.SharedPreferences r0 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r0)     // Catch: java.lang.Throwable -> L39
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L39
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L39
            if (r3 != 0) goto L39
            java.lang.String r3 = "sp_uapp"
            org.json.JSONObject r1 = r2.k     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L39
            android.content.SharedPreferences$Editor r3 = r0.putString(r3, r1)     // Catch: java.lang.Throwable -> L39
            r3.commit()     // Catch: java.lang.Throwable -> L39
        L39:
            monitor-exit(r2)
            return
    }

    void a(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = com.umeng.analytics.b.a
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)
            if (r0 != 0) goto Le
            java.lang.String r3 = "onPageStart can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r3)
            return
        Le:
            com.umeng.analytics.MobclickAgent$PageMode r0 = com.umeng.commonsdk.UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION     // Catch: java.lang.Throwable -> L19
            com.umeng.analytics.MobclickAgent$PageMode r1 = com.umeng.analytics.MobclickAgent.PageMode.LEGACY_AUTO     // Catch: java.lang.Throwable -> L19
            if (r0 == r1) goto L19
            com.umeng.analytics.pro.v r0 = r2.d     // Catch: java.lang.Throwable -> L19
            r0.a(r3)     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }

    public void a(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            boolean r0 = r2.f(r3)
            if (r0 != 0) goto L7
            goto L5b
        L7:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 != 0) goto L26
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L26
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 != 0) goto L26
            boolean r0 = r4 instanceof java.lang.Short
            if (r0 != 0) goto L26
            boolean r0 = r4 instanceof java.lang.Float
            if (r0 != 0) goto L26
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L20
            goto L26
        L20:
            java.lang.String r3 = "userProfile: Invalid value type, please check!"
            com.umeng.commonsdk.statistics.common.MLog.e(r3)
            return
        L26:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5b
            r0.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = "pk"
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L5b
            boolean r3 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = "pv"
            if (r3 == 0) goto L4d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L5b
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L5b
            if (r3 <= 0) goto L42
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L5b
        L42:
            boolean r3 = r2.g(r4)     // Catch: java.lang.Throwable -> L5b
            if (r3 != 0) goto L49
            goto L5b
        L49:
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L5b
            goto L50
        L4d:
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L5b
        L50:
            android.content.Context r3 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L5b
            com.umeng.analytics.CoreProtocol r4 = com.umeng.analytics.CoreProtocol.getInstance(r3)     // Catch: java.lang.Throwable -> L5b
            r1 = 4358(0x1106, float:6.107E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r3, r1, r4, r0)     // Catch: java.lang.Throwable -> L5b
        L5b:
            return
    }

    void a(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L5
            goto L4b
        L5:
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L13
            java.lang.String r5 = "onProfileSignIn can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r5)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r5 = move-exception
            goto L42
        L13:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L11
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L11
            r2.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r3 = "provider"
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L11
            java.lang.String r5 = "uid"
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L11
            java.lang.String r5 = "ts"
            r2.put(r5, r0)     // Catch: java.lang.Throwable -> L11
            android.content.Context r5 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L11
            com.umeng.analytics.CoreProtocol r6 = com.umeng.analytics.CoreProtocol.getInstance(r5)     // Catch: java.lang.Throwable -> L11
            r0 = 4101(0x1005, float:5.747E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r5, r0, r6, r2)     // Catch: java.lang.Throwable -> L11
            android.content.Context r5 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L11
            com.umeng.analytics.CoreProtocol r6 = com.umeng.analytics.CoreProtocol.getInstance(r5)     // Catch: java.lang.Throwable -> L11
            r0 = 4356(0x1104, float:6.104E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r5, r0, r6, r2)     // Catch: java.lang.Throwable -> L11
            return
        L42:
            boolean r6 = com.umeng.commonsdk.statistics.common.MLog.DEBUG
            if (r6 == 0) goto L4b
            java.lang.String r6 = " Excepthon  in  onProfileSignIn"
            com.umeng.commonsdk.statistics.common.MLog.e(r6, r5)
        L4b:
            return
    }

    @Override // com.umeng.analytics.pro.t
    public void a(java.lang.Throwable r5) {
            r4 = this;
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Exception -> L12
            if (r0 != 0) goto L6
            goto Laa
        L6:
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)     // Catch: java.lang.Exception -> L12
            if (r0 != 0) goto L15
            java.lang.String r5 = "onAppCrash can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r5)     // Catch: java.lang.Exception -> L12
            return
        L12:
            r5 = move-exception
            goto La1
        L15:
            boolean r0 = com.umeng.analytics.AnalyticsConfig.enable     // Catch: java.lang.Exception -> L12
            if (r0 != 0) goto L1b
            goto Laa
        L1b:
            com.umeng.analytics.pro.v r0 = r4.d     // Catch: java.lang.Exception -> L12
            if (r0 == 0) goto L22
            r0.b()     // Catch: java.lang.Exception -> L12
        L22:
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Exception -> L12
            java.lang.String r1 = "onAppCrash"
            com.umeng.analytics.pro.l.a(r0, r1)     // Catch: java.lang.Exception -> L12
            com.umeng.analytics.pro.k r0 = r4.e     // Catch: java.lang.Exception -> L12
            if (r0 == 0) goto L30
            r0.b()     // Catch: java.lang.Exception -> L12
        L30:
            com.umeng.analytics.pro.l r0 = r4.g     // Catch: java.lang.Exception -> L12
            if (r0 == 0) goto L37
            r0.c()     // Catch: java.lang.Exception -> L12
        L37:
            com.umeng.analytics.pro.u r0 = r4.f     // Catch: java.lang.Exception -> L12
            if (r0 == 0) goto L48
            android.content.Context r1 = com.umeng.analytics.b.a     // Catch: java.lang.Exception -> L12
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L12
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L12
            r0.c(r1, r2)     // Catch: java.lang.Exception -> L12
        L48:
            if (r5 == 0) goto L7a
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L12
            r0.<init>()     // Catch: java.lang.Exception -> L12
            java.lang.String r1 = "ts"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L12
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L12
            java.lang.String r1 = "error_source"
            r2 = 1
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L12
            java.lang.String r1 = "context"
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DataHelper.convertExceptionToString(r5)     // Catch: java.lang.Exception -> L12
            r0.put(r1, r5)     // Catch: java.lang.Exception -> L12
            android.content.Context r5 = com.umeng.analytics.b.a     // Catch: java.lang.Exception -> L12
            com.umeng.analytics.pro.i r5 = com.umeng.analytics.pro.i.a(r5)     // Catch: java.lang.Exception -> L12
            com.umeng.analytics.pro.u r1 = r4.f     // Catch: java.lang.Exception -> L12
            java.lang.String r1 = r1.c()     // Catch: java.lang.Exception -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L12
            r5.a(r1, r0, r2)     // Catch: java.lang.Exception -> L12
        L7a:
            android.content.Context r5 = com.umeng.analytics.b.a     // Catch: java.lang.Exception -> L12
            com.umeng.analytics.pro.o r5 = com.umeng.analytics.pro.o.a(r5)     // Catch: java.lang.Exception -> L12
            r5.d()     // Catch: java.lang.Exception -> L12
            android.content.Context r5 = com.umeng.analytics.b.a     // Catch: java.lang.Exception -> L12
            com.umeng.analytics.pro.v.a(r5)     // Catch: java.lang.Exception -> L12
            com.umeng.analytics.MobclickAgent$PageMode r5 = com.umeng.commonsdk.UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION     // Catch: java.lang.Exception -> L12
            com.umeng.analytics.MobclickAgent$PageMode r0 = com.umeng.analytics.MobclickAgent.PageMode.AUTO     // Catch: java.lang.Exception -> L12
            if (r5 != r0) goto L93
            android.content.Context r5 = com.umeng.analytics.b.a     // Catch: java.lang.Exception -> L12
            com.umeng.analytics.pro.l.c(r5)     // Catch: java.lang.Exception -> L12
        L93:
            android.content.Context r5 = com.umeng.analytics.b.a     // Catch: java.lang.Exception -> L12
            android.content.SharedPreferences r5 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r5)     // Catch: java.lang.Exception -> L12
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Exception -> L12
            r5.commit()     // Catch: java.lang.Exception -> L12
            return
        La1:
            boolean r0 = com.umeng.commonsdk.statistics.common.MLog.DEBUG
            if (r0 == 0) goto Laa
            java.lang.String r0 = "Exception in onAppCrash"
            com.umeng.commonsdk.statistics.common.MLog.e(r0, r5)
        Laa:
            return
    }

    void a(javax.microedition.khronos.opengles.GL10 r3) {
            r2 = this;
            java.lang.String[] r3 = com.umeng.commonsdk.utils.UMUtils.getGPU(r3)
            int r0 = r3.length
            r1 = 2
            if (r0 != r1) goto L12
            r0 = 0
            r0 = r3[r0]
            com.umeng.analytics.AnalyticsConfig.GPU_VENDER = r0
            r0 = 1
            r3 = r3[r0]
            com.umeng.analytics.AnalyticsConfig.GPU_RENDERER = r3
        L12:
            return
    }

    void a(boolean r2) {
            r1 = this;
            android.content.Context r0 = com.umeng.analytics.b.a
            if (r0 != 0) goto L5
            goto L17
        L5:
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)
            if (r0 != 0) goto L11
            java.lang.String r2 = "setCatchUncaughtExceptions can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r2)
            return
        L11:
            boolean r0 = com.umeng.analytics.AnalyticsConfig.CHANGE_CATCH_EXCEPTION_NOTALLOW
            if (r0 != 0) goto L17
            com.umeng.analytics.AnalyticsConfig.CATCH_EXCEPTION = r2
        L17:
            return
    }

    public org.json.JSONObject b() {
            r1 = this;
            org.json.JSONObject r0 = r1.k
            return r0
    }

    void b(android.content.Context r4) {
            r3 = this;
            if (r4 != 0) goto L8
            java.lang.String r4 = "unexpected null context in onResume"
            com.umeng.commonsdk.statistics.common.MLog.e(r4)
            return
        L8:
            com.umeng.analytics.MobclickAgent$PageMode r0 = com.umeng.commonsdk.UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION
            com.umeng.analytics.MobclickAgent$PageMode r1 = com.umeng.analytics.MobclickAgent.PageMode.AUTO
            if (r0 != r1) goto Lf
            goto L76
        Lf:
            android.content.Context r0 = com.umeng.analytics.b.a
            if (r0 != 0) goto L1d
            android.content.Context r0 = r4.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            com.umeng.analytics.b.a = r0
        L1d:
            android.content.Context r0 = com.umeng.analytics.b.a
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)
            if (r0 != 0) goto L2b
            java.lang.String r4 = "onResume can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r4)
            return
        L2b:
            boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()
            if (r0 == 0) goto L3e
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L36
            goto L3e
        L36:
            java.lang.String r0 = com.umeng.analytics.pro.j.o
            r1 = 2
            java.lang.String r2 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq(r0, r1, r2)
        L3e:
            boolean r0 = r3.j     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L49
            boolean r0 = r3.n     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L4c
            goto L49
        L47:
            r4 = move-exception
            goto L77
        L49:
            r3.a(r4)     // Catch: java.lang.Throwable -> L47
        L4c:
            com.umeng.analytics.MobclickAgent$PageMode r0 = com.umeng.commonsdk.UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION     // Catch: java.lang.Throwable -> L47
            com.umeng.analytics.MobclickAgent$PageMode r1 = com.umeng.analytics.MobclickAgent.PageMode.LEGACY_MANUAL     // Catch: java.lang.Throwable -> L47
            if (r0 == r1) goto L5f
            com.umeng.analytics.pro.k r0 = r3.e     // Catch: java.lang.Throwable -> L47
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L47
            r0.a(r1)     // Catch: java.lang.Throwable -> L47
        L5f:
            r3.h()     // Catch: java.lang.Throwable -> L47
            boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L76
            boolean r0 = r4 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L76
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L47
            com.umeng.analytics.b.f20q = r4     // Catch: java.lang.Throwable -> L47
        L76:
            return
        L77:
            java.lang.String r0 = "Exception occurred in Mobclick.onResume(). "
            com.umeng.commonsdk.statistics.common.MLog.e(r0, r4)
            return
    }

    public void b(android.content.Context r10, java.lang.String r11) {
            r9 = this;
            java.lang.String r0 = "\\|"
            r1 = 0
            if (r10 != 0) goto Le
            java.lang.String r10 = "MobclickAgent.onDeepLinkReceived方法Context参数不能为null。|参数Context需要指定ApplicationContext值。"
            com.umeng.commonsdk.debug.UMLog.aq(r10, r1, r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r0 = move-exception
            r10 = r0
            goto L59
        Le:
            android.content.Context r2 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Lb
            if (r2 != 0) goto L1c
            android.content.Context r10 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> Lb
            android.content.Context r10 = com.stub.StubApp.getOrigApplicationContext(r10)     // Catch: java.lang.Throwable -> Lb
            com.umeng.analytics.b.a = r10     // Catch: java.lang.Throwable -> Lb
        L1c:
            android.content.Context r10 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Lb
            boolean r10 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r10)     // Catch: java.lang.Throwable -> Lb
            if (r10 != 0) goto L2a
            java.lang.String r10 = "onDeepLinkReceived can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r10)     // Catch: java.lang.Throwable -> Lb
            return
        L2a:
            boolean r10 = r9.j     // Catch: java.lang.Throwable -> Lb
            if (r10 == 0) goto L32
            boolean r10 = r9.n     // Catch: java.lang.Throwable -> Lb
            if (r10 != 0) goto L37
        L32:
            android.content.Context r10 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Lb
            r9.a(r10)     // Catch: java.lang.Throwable -> Lb
        L37:
            boolean r10 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> Lb
            if (r10 != 0) goto L53
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lb
            r5.<init>()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r10 = "_$!link"
            r5.put(r10, r11)     // Catch: java.lang.Throwable -> Lb
            android.content.Context r3 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Lb
            java.lang.String r4 = "_$!deep_link"
            r6 = -1
            r8 = 0
            r2 = r9
            r2.a(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> Lb
            return
        L53:
            java.lang.String r10 = "MobclickAgent.onDeepLinkReceived方法link参数不能为null，也不能为空字符串。|参数link必须为非空字符串。"
            com.umeng.commonsdk.debug.UMLog.aq(r10, r1, r0)     // Catch: java.lang.Throwable -> Lb
            return
        L59:
            boolean r11 = com.umeng.commonsdk.statistics.common.MLog.DEBUG
            if (r11 == 0) goto L60
            com.umeng.commonsdk.statistics.common.MLog.e(r10)
        L60:
            return
    }

    public synchronized void b(java.lang.Object r3) {
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L7
            monitor-exit(r2)
            return
        L7:
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L14
            java.lang.String r3 = "updateNativePrePropertiesByCoreProtocol can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r3)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r2)
            return
        L14:
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences r0 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r0)     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto L34
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L3f
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L3f
            java.lang.String r1 = "prepp_uapp"
            android.content.SharedPreferences$Editor r3 = r0.putString(r1, r3)     // Catch: java.lang.Throwable -> L3f
            r3.commit()     // Catch: java.lang.Throwable -> L3f
            goto L3f
        L34:
            if (r0 == 0) goto L3f
            java.lang.String r3 = "prepp_uapp"
            android.content.SharedPreferences$Editor r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L3f
            r3.commit()     // Catch: java.lang.Throwable -> L3f
        L3f:
            monitor-exit(r2)
            return
    }

    void b(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = com.umeng.analytics.b.a
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)
            if (r0 != 0) goto Le
            java.lang.String r3 = "onPageEnd can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r3)
            return
        Le:
            com.umeng.analytics.MobclickAgent$PageMode r0 = com.umeng.commonsdk.UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION     // Catch: java.lang.Throwable -> L19
            com.umeng.analytics.MobclickAgent$PageMode r1 = com.umeng.analytics.MobclickAgent.PageMode.LEGACY_AUTO     // Catch: java.lang.Throwable -> L19
            if (r0 == r1) goto L19
            com.umeng.analytics.pro.v r0 = r2.d     // Catch: java.lang.Throwable -> L19
            r0.b(r3)     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }

    public org.json.JSONObject c() {
            r1 = this;
            org.json.JSONObject r0 = r1.m
            return r0
    }

    void c(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "\\|"
            if (r4 != 0) goto Lb
            java.lang.String r4 = com.umeng.analytics.pro.j.p
            r1 = 0
            com.umeng.commonsdk.debug.UMLog.aq(r4, r1, r0)
            return
        Lb:
            com.umeng.analytics.MobclickAgent$PageMode r1 = com.umeng.commonsdk.UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION
            com.umeng.analytics.MobclickAgent$PageMode r2 = com.umeng.analytics.MobclickAgent.PageMode.AUTO
            if (r1 != r2) goto L13
            goto L82
        L13:
            android.content.Context r1 = com.umeng.analytics.b.a
            if (r1 != 0) goto L21
            android.content.Context r1 = r4.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            com.umeng.analytics.b.a = r1
        L21:
            android.content.Context r1 = com.umeng.analytics.b.a
            boolean r1 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r1)
            if (r1 != 0) goto L2f
            java.lang.String r4 = "onPause can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r4)
            return
        L2f:
            boolean r1 = com.umeng.commonsdk.UMConfigure.isDebugLog()
            if (r1 == 0) goto L40
            boolean r1 = r4 instanceof android.app.Activity
            if (r1 == 0) goto L3a
            goto L40
        L3a:
            java.lang.String r1 = com.umeng.analytics.pro.j.f27q
            r2 = 2
            com.umeng.commonsdk.debug.UMLog.aq(r1, r2, r0)
        L40:
            boolean r0 = r3.j     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L4b
            boolean r0 = r3.n     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L4e
            goto L4b
        L49:
            r0 = move-exception
            goto L65
        L4b:
            r3.a(r4)     // Catch: java.lang.Throwable -> L49
        L4e:
            com.umeng.analytics.MobclickAgent$PageMode r0 = com.umeng.commonsdk.UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION     // Catch: java.lang.Throwable -> L49
            com.umeng.analytics.MobclickAgent$PageMode r1 = com.umeng.analytics.MobclickAgent.PageMode.LEGACY_MANUAL     // Catch: java.lang.Throwable -> L49
            if (r0 == r1) goto L61
            com.umeng.analytics.pro.k r0 = r3.e     // Catch: java.lang.Throwable -> L49
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L49
            r0.b(r1)     // Catch: java.lang.Throwable -> L49
        L61:
            r3.i()     // Catch: java.lang.Throwable -> L49
            goto L6e
        L65:
            boolean r1 = com.umeng.commonsdk.statistics.common.MLog.DEBUG
            if (r1 == 0) goto L6e
            java.lang.String r1 = "Exception occurred in Mobclick.onRause(). "
            com.umeng.commonsdk.statistics.common.MLog.e(r1, r0)
        L6e:
            boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()
            if (r0 == 0) goto L82
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L82
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            com.umeng.analytics.b.r = r4
        L82:
            return
    }

    void c(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            if (r2 != 0) goto Lb
            r2 = 0
            java.lang.String r3 = "\\|"
            java.lang.String r0 = "MobclickAgent.setSecret方法参数context不能为null|参数Context需要指定ApplicationContext值。"
            com.umeng.commonsdk.debug.UMLog.aq(r0, r2, r3)
            return
        Lb:
            android.content.Context r0 = com.umeng.analytics.b.a
            if (r0 != 0) goto L19
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            com.umeng.analytics.b.a = r2
        L19:
            android.content.Context r2 = com.umeng.analytics.b.a
            boolean r2 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r2)
            if (r2 != 0) goto L27
            java.lang.String r2 = "setSecret can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r2)
            return
        L27:
            boolean r2 = r1.j
            if (r2 == 0) goto L2f
            boolean r2 = r1.n
            if (r2 != 0) goto L34
        L2f:
            android.content.Context r2 = com.umeng.analytics.b.a
            r1.a(r2)
        L34:
            android.content.Context r2 = com.umeng.analytics.b.a
            com.umeng.analytics.AnalyticsConfig.a(r2, r3)
            return
    }

    public void c(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.g(r2)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "_$!mobile"
            r1.a(r0, r2)
        Lb:
            return
    }

    public org.json.JSONObject d() {
            r1 = this;
            org.json.JSONObject r0 = r1.l
            return r0
    }

    void d(android.content.Context r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L72
        L3:
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L11
            android.content.Context r0 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L72
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L72
            com.umeng.analytics.b.a = r0     // Catch: java.lang.Throwable -> L72
        L11:
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L72
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L1f
            java.lang.String r4 = "onKillProcess can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r4)     // Catch: java.lang.Throwable -> L72
            return
        L1f:
            com.umeng.analytics.pro.l r0 = r3.g     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L26
            r0.c()     // Catch: java.lang.Throwable -> L72
        L26:
            java.lang.String r0 = "onKillProcess"
            com.umeng.analytics.pro.l.a(r4, r0)     // Catch: java.lang.Throwable -> L72
            com.umeng.analytics.pro.k r4 = r3.e     // Catch: java.lang.Throwable -> L72
            if (r4 == 0) goto L32
            r4.b()     // Catch: java.lang.Throwable -> L72
        L32:
            com.umeng.analytics.pro.v r4 = r3.d     // Catch: java.lang.Throwable -> L72
            if (r4 == 0) goto L39
            r4.b()     // Catch: java.lang.Throwable -> L72
        L39:
            android.content.Context r4 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L72
            if (r4 == 0) goto L72
            com.umeng.analytics.pro.u r0 = r3.f     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L4c
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L72
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L72
            r0.c(r4, r1)     // Catch: java.lang.Throwable -> L72
        L4c:
            android.content.Context r4 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L72
            com.umeng.analytics.pro.o r4 = com.umeng.analytics.pro.o.a(r4)     // Catch: java.lang.Throwable -> L72
            r4.d()     // Catch: java.lang.Throwable -> L72
            android.content.Context r4 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L72
            com.umeng.analytics.pro.v.a(r4)     // Catch: java.lang.Throwable -> L72
            com.umeng.analytics.MobclickAgent$PageMode r4 = com.umeng.commonsdk.UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION     // Catch: java.lang.Throwable -> L72
            com.umeng.analytics.MobclickAgent$PageMode r0 = com.umeng.analytics.MobclickAgent.PageMode.AUTO     // Catch: java.lang.Throwable -> L72
            if (r4 != r0) goto L65
            android.content.Context r4 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L72
            com.umeng.analytics.pro.l.c(r4)     // Catch: java.lang.Throwable -> L72
        L65:
            android.content.Context r4 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L72
            android.content.SharedPreferences r4 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r4)     // Catch: java.lang.Throwable -> L72
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L72
            r4.commit()     // Catch: java.lang.Throwable -> L72
        L72:
            return
    }

    public synchronized void d(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            if (r3 != 0) goto Ld
            java.lang.String r3 = com.umeng.analytics.pro.j.ah     // Catch: java.lang.Throwable -> L98
            java.lang.String r4 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq(r3, r0, r4)     // Catch: java.lang.Throwable -> L98
            monitor-exit(r2)
            return
        Ld:
            android.content.Context r1 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L98
            if (r1 != 0) goto L1b
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L98
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Throwable -> L98
            com.umeng.analytics.b.a = r3     // Catch: java.lang.Throwable -> L98
        L1b:
            android.content.Context r3 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L98
            boolean r3 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r3)     // Catch: java.lang.Throwable -> L98
            if (r3 != 0) goto L2a
            java.lang.String r3 = "unregisterSuperProperty can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r3)     // Catch: java.lang.Throwable -> L98
            monitor-exit(r2)
            return
        L2a:
            boolean r3 = r2.j     // Catch: java.lang.Throwable -> L98
            if (r3 == 0) goto L32
            boolean r3 = r2.n     // Catch: java.lang.Throwable -> L98
            if (r3 != 0) goto L37
        L32:
            android.content.Context r3 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L98
            r2.a(r3)     // Catch: java.lang.Throwable -> L98
        L37:
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L98
            if (r3 == 0) goto L46
            java.lang.String r3 = com.umeng.analytics.pro.j.ag     // Catch: java.lang.Throwable -> L98
            java.lang.String r4 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq(r3, r0, r4)     // Catch: java.lang.Throwable -> L98
            monitor-exit(r2)
            return
        L46:
            java.lang.String r3 = "umsp_1"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L98
            if (r3 != 0) goto L75
            java.lang.String r3 = "umsp_2"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L98
            if (r3 != 0) goto L75
            java.lang.String r3 = "umsp_3"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L98
            if (r3 != 0) goto L75
            java.lang.String r3 = "umsp_4"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L98
            if (r3 != 0) goto L75
            java.lang.String r3 = "umsp_5"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L98
            if (r3 != 0) goto L75
            java.lang.String r3 = "please check key or value, must be correct!"
            com.umeng.commonsdk.statistics.common.MLog.e(r3)     // Catch: java.lang.Throwable -> L98
            monitor-exit(r2)
            return
        L75:
            org.json.JSONObject r3 = r2.k     // Catch: java.lang.Throwable -> L98
            if (r3 != 0) goto L80
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L98
            r3.<init>()     // Catch: java.lang.Throwable -> L98
            r2.k = r3     // Catch: java.lang.Throwable -> L98
        L80:
            org.json.JSONObject r3 = r2.k     // Catch: java.lang.Throwable -> L98
            boolean r3 = r3.has(r4)     // Catch: java.lang.Throwable -> L98
            if (r3 == 0) goto L98
            org.json.JSONObject r3 = r2.k     // Catch: java.lang.Throwable -> L98
            r3.remove(r4)     // Catch: java.lang.Throwable -> L98
            android.content.Context r3 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L98
            com.umeng.analytics.CoreProtocol r0 = com.umeng.analytics.CoreProtocol.getInstance(r3)     // Catch: java.lang.Throwable -> L98
            r1 = 8197(0x2005, float:1.1486E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r3, r1, r0, r4)     // Catch: java.lang.Throwable -> L98
        L98:
            monitor-exit(r2)
            return
    }

    public void d(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.g(r2)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "_$!email"
            r1.a(r0, r2)
        Lb:
            return
    }

    public synchronized java.lang.Object e(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            r1 = 0
            if (r4 != 0) goto Le
            java.lang.String r4 = com.umeng.analytics.pro.j.ai     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq(r4, r0, r5)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r3)
            return r1
        Le:
            android.content.Context r2 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L84
            if (r2 != 0) goto L1c
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L84
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L84
            com.umeng.analytics.b.a = r4     // Catch: java.lang.Throwable -> L84
        L1c:
            android.content.Context r4 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L84
            boolean r4 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r4)     // Catch: java.lang.Throwable -> L84
            if (r4 != 0) goto L2b
            java.lang.String r4 = "getSuperProperty can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r4)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r3)
            return r1
        L2b:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L3a
            java.lang.String r4 = com.umeng.analytics.pro.j.ag     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq(r4, r0, r5)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r3)
            return r1
        L3a:
            java.lang.String r4 = "umsp_1"
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L84
            if (r4 != 0) goto L69
            java.lang.String r4 = "umsp_2"
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L84
            if (r4 != 0) goto L69
            java.lang.String r4 = "umsp_3"
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L84
            if (r4 != 0) goto L69
            java.lang.String r4 = "umsp_4"
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L84
            if (r4 != 0) goto L69
            java.lang.String r4 = "umsp_5"
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L84
            if (r4 != 0) goto L69
            java.lang.String r4 = "please check key or value, must be correct!"
            com.umeng.commonsdk.statistics.common.MLog.e(r4)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r3)
            return r1
        L69:
            org.json.JSONObject r4 = r3.k     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L7d
            org.json.JSONObject r4 = r3.k     // Catch: java.lang.Throwable -> L84
            boolean r4 = r4.has(r5)     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L84
            org.json.JSONObject r4 = r3.k     // Catch: java.lang.Throwable -> L84
            java.lang.Object r4 = r4.opt(r5)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r3)
            return r4
        L7d:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L84
            r4.<init>()     // Catch: java.lang.Throwable -> L84
            r3.k = r4     // Catch: java.lang.Throwable -> L84
        L84:
            monitor-exit(r3)
            return r1
    }

    public synchronized java.lang.String e(android.content.Context r4) {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            if (r4 != 0) goto Le
            java.lang.String r4 = com.umeng.analytics.pro.j.ai     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = "\\|"
            r2 = 0
            com.umeng.commonsdk.debug.UMLog.aq(r4, r2, r1)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r3)
            return r0
        Le:
            android.content.Context r1 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L1c
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L3e
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L3e
            com.umeng.analytics.b.a = r4     // Catch: java.lang.Throwable -> L3e
        L1c:
            android.content.Context r4 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L3e
            boolean r4 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r4)     // Catch: java.lang.Throwable -> L3e
            if (r4 != 0) goto L2b
            java.lang.String r4 = "getSuperProperties can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r4)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r3)
            return r0
        L2b:
            org.json.JSONObject r4 = r3.k     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L37
            org.json.JSONObject r4 = r3.k     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r3)
            return r4
        L37:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3e
            r4.<init>()     // Catch: java.lang.Throwable -> L3e
            r3.k = r4     // Catch: java.lang.Throwable -> L3e
        L3e:
            monitor-exit(r3)
            return r0
    }

    public void e() {
            r1 = this;
            r0 = 0
            r1.l = r0
            return
    }

    public java.lang.String f() {
            r1 = this;
            android.content.Context r0 = com.umeng.analytics.b.a
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)
            if (r0 != 0) goto Lf
            java.lang.String r0 = "getOnResumedActivityName can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r0)
            r0 = 0
            return r0
        Lf:
            java.lang.String r0 = com.umeng.analytics.b.f20q
            return r0
    }

    public synchronized void f(android.content.Context r4) {
            r3 = this;
            monitor-enter(r3)
            if (r4 != 0) goto Lf
            java.lang.String r4 = com.umeng.analytics.pro.j.ah     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = "\\|"
            r1 = 0
            com.umeng.commonsdk.debug.UMLog.aq(r4, r1, r0)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r3)
            return
        Ld:
            r4 = move-exception
            goto L4e
        Lf:
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto L1d
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> Ld
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> Ld
            com.umeng.analytics.b.a = r4     // Catch: java.lang.Throwable -> Ld
        L1d:
            android.content.Context r4 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Ld
            boolean r4 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r4)     // Catch: java.lang.Throwable -> Ld
            if (r4 != 0) goto L2c
            java.lang.String r4 = "clearSuperProperties can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r4)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r3)
            return
        L2c:
            boolean r4 = r3.j     // Catch: java.lang.Throwable -> Ld
            if (r4 == 0) goto L34
            boolean r4 = r3.n     // Catch: java.lang.Throwable -> Ld
            if (r4 != 0) goto L39
        L34:
            android.content.Context r4 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Ld
            r3.a(r4)     // Catch: java.lang.Throwable -> Ld
        L39:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld
            r4.<init>()     // Catch: java.lang.Throwable -> Ld
            r3.k = r4     // Catch: java.lang.Throwable -> Ld
            android.content.Context r4 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Ld
            com.umeng.analytics.CoreProtocol r0 = com.umeng.analytics.CoreProtocol.getInstance(r4)     // Catch: java.lang.Throwable -> Ld
            r1 = 0
            r2 = 8196(0x2004, float:1.1485E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r4, r2, r0, r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r3)
            return
        L4e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
            throw r4
    }

    public synchronized void f(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            if (r3 != 0) goto Lf
            java.lang.String r3 = com.umeng.analytics.pro.j.an     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq(r3, r0, r4)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        Ld:
            r3 = move-exception
            goto L82
        Lf:
            android.content.Context r1 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto L1d
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> Ld
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Throwable -> Ld
            com.umeng.analytics.b.a = r3     // Catch: java.lang.Throwable -> Ld
        L1d:
            android.content.Context r3 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Ld
            boolean r3 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r3)     // Catch: java.lang.Throwable -> Ld
            if (r3 != 0) goto L2c
            java.lang.String r3 = "unregisterPreProperty can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        L2c:
            boolean r3 = r2.j     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L34
            boolean r3 = r2.n     // Catch: java.lang.Throwable -> Ld
            if (r3 != 0) goto L39
        L34:
            android.content.Context r3 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Ld
            r2.a(r3)     // Catch: java.lang.Throwable -> Ld
        L39:
            org.json.JSONObject r3 = r2.m     // Catch: java.lang.Throwable -> Ld
            if (r3 != 0) goto L44
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld
            r3.<init>()     // Catch: java.lang.Throwable -> Ld
            r2.m = r3     // Catch: java.lang.Throwable -> Ld
        L44:
            if (r4 == 0) goto L7b
            int r3 = r4.length()     // Catch: java.lang.Throwable -> Ld
            if (r3 > 0) goto L4d
            goto L7b
        L4d:
            org.json.JSONObject r3 = r2.m     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r3.has(r4)     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L6c
            org.json.JSONObject r3 = r2.m     // Catch: java.lang.Throwable -> Ld
            r3.remove(r4)     // Catch: java.lang.Throwable -> Ld
            android.content.Context r3 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Ld
            com.umeng.analytics.CoreProtocol r4 = com.umeng.analytics.CoreProtocol.getInstance(r3)     // Catch: java.lang.Throwable -> Ld
            org.json.JSONObject r0 = r2.m     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld
            r1 = 8200(0x2008, float:1.149E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r3, r1, r4, r0)     // Catch: java.lang.Throwable -> Ld
            goto L79
        L6c:
            boolean r3 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L79
            java.lang.String r3 = com.umeng.analytics.pro.j.ao     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq(r3, r0, r4)     // Catch: java.lang.Throwable -> Ld
        L79:
            monitor-exit(r2)
            return
        L7b:
            java.lang.String r3 = "please check propertics, property is null!"
            com.umeng.commonsdk.statistics.common.MLog.e(r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        L82:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    public java.lang.String g() {
            r1 = this;
            android.content.Context r0 = com.umeng.analytics.b.a
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)
            if (r0 != 0) goto Lf
            java.lang.String r0 = "getOnPausedActivityName can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r0)
            r0 = 0
            return r0
        Lf:
            java.lang.String r0 = com.umeng.analytics.b.r
            return r0
    }

    public synchronized void g(android.content.Context r4) {
            r3 = this;
            monitor-enter(r3)
            if (r4 != 0) goto Lf
            java.lang.String r4 = com.umeng.analytics.pro.j.ap     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = "\\|"
            r1 = 0
            com.umeng.commonsdk.debug.UMLog.aq(r4, r1, r0)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r3)
            return
        Ld:
            r4 = move-exception
            goto L56
        Lf:
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto L1d
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> Ld
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> Ld
            com.umeng.analytics.b.a = r4     // Catch: java.lang.Throwable -> Ld
        L1d:
            android.content.Context r4 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Ld
            boolean r4 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r4)     // Catch: java.lang.Throwable -> Ld
            if (r4 != 0) goto L2c
            java.lang.String r4 = "clearPreProperties can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r4)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r3)
            return
        L2c:
            boolean r4 = r3.j     // Catch: java.lang.Throwable -> Ld
            if (r4 == 0) goto L34
            boolean r4 = r3.n     // Catch: java.lang.Throwable -> Ld
            if (r4 != 0) goto L39
        L34:
            android.content.Context r4 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Ld
            r3.a(r4)     // Catch: java.lang.Throwable -> Ld
        L39:
            org.json.JSONObject r4 = r3.m     // Catch: java.lang.Throwable -> Ld
            int r4 = r4.length()     // Catch: java.lang.Throwable -> Ld
            if (r4 <= 0) goto L4d
            android.content.Context r4 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Ld
            com.umeng.analytics.CoreProtocol r0 = com.umeng.analytics.CoreProtocol.getInstance(r4)     // Catch: java.lang.Throwable -> Ld
            r1 = 0
            r2 = 8201(0x2009, float:1.1492E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r4, r2, r0, r1)     // Catch: java.lang.Throwable -> Ld
        L4d:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld
            r4.<init>()     // Catch: java.lang.Throwable -> Ld
            r3.m = r4     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r3)
            return
        L56:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
            throw r4
    }

    public synchronized org.json.JSONObject h(android.content.Context r4) {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            if (r4 != 0) goto L10
            java.lang.String r4 = com.umeng.analytics.pro.j.aq     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "\\|"
            r2 = 0
            com.umeng.commonsdk.debug.UMLog.aq(r4, r2, r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r3)
            return r0
        Le:
            r4 = move-exception
            goto L60
        L10:
            android.content.Context r1 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L1e
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> Le
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> Le
            com.umeng.analytics.b.a = r4     // Catch: java.lang.Throwable -> Le
        L1e:
            android.content.Context r4 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Le
            boolean r4 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r4)     // Catch: java.lang.Throwable -> Le
            if (r4 != 0) goto L2d
            java.lang.String r4 = "getPreProperties can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r4)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r3)
            return r0
        L2d:
            boolean r4 = r3.j     // Catch: java.lang.Throwable -> Le
            if (r4 == 0) goto L35
            boolean r4 = r3.n     // Catch: java.lang.Throwable -> Le
            if (r4 != 0) goto L3a
        L35:
            android.content.Context r4 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> Le
            r3.a(r4)     // Catch: java.lang.Throwable -> Le
        L3a:
            org.json.JSONObject r4 = r3.m     // Catch: java.lang.Throwable -> Le
            if (r4 != 0) goto L45
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le
            r4.<init>()     // Catch: java.lang.Throwable -> Le
            r3.m = r4     // Catch: java.lang.Throwable -> Le
        L45:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le
            r4.<init>()     // Catch: java.lang.Throwable -> Le
            org.json.JSONObject r0 = r3.m     // Catch: java.lang.Throwable -> Le
            int r0 = r0.length()     // Catch: java.lang.Throwable -> Le
            if (r0 <= 0) goto L5e
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le org.json.JSONException -> L5e
            org.json.JSONObject r1 = r3.m     // Catch: java.lang.Throwable -> Le org.json.JSONException -> L5e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Le org.json.JSONException -> L5e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le org.json.JSONException -> L5e
            r4 = r0
        L5e:
            monitor-exit(r3)
            return r4
        L60:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Le
            throw r4
    }

    public void h() {
            r6 = this;
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L32
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto L10
            java.lang.String r0 = "onStartSessionInternal can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r0)     // Catch: java.lang.Throwable -> L39
            return
        L10:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L39
            android.content.Context r2 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L39
            com.umeng.analytics.CoreProtocol r3 = com.umeng.analytics.CoreProtocol.getInstance(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L39
            r5 = 4352(0x1100, float:6.098E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r2, r5, r3, r4)     // Catch: java.lang.Throwable -> L39
            android.content.Context r2 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L39
            com.umeng.analytics.CoreProtocol r3 = com.umeng.analytics.CoreProtocol.getInstance(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L39
            r1 = 4103(0x1007, float:5.75E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r2, r1, r3, r0)     // Catch: java.lang.Throwable -> L39
        L32:
            com.umeng.common.ISysListener r0 = r6.b     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L39
            r0.onAppResume()     // Catch: java.lang.Throwable -> L39
        L39:
            return
    }

    public void i() {
            r4 = this;
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L47
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            java.lang.String r0 = "onEndSessionInternal can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            goto L47
        L12:
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L10
            com.umeng.analytics.CoreProtocol r1 = com.umeng.analytics.CoreProtocol.getInstance(r0)     // Catch: java.lang.Throwable -> L10
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L10
            r3 = 4104(0x1008, float:5.751E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r0, r3, r1, r2)     // Catch: java.lang.Throwable -> L10
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L10
            com.umeng.analytics.CoreProtocol r1 = com.umeng.analytics.CoreProtocol.getInstance(r0)     // Catch: java.lang.Throwable -> L10
            r2 = 0
            r3 = 4100(0x1004, float:5.745E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r0, r3, r1, r2)     // Catch: java.lang.Throwable -> L10
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L10
            com.umeng.analytics.CoreProtocol r1 = com.umeng.analytics.CoreProtocol.getInstance(r0)     // Catch: java.lang.Throwable -> L10
            r3 = 4099(0x1003, float:5.744E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r0, r3, r1, r2)     // Catch: java.lang.Throwable -> L10
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L10
            com.umeng.analytics.CoreProtocol r1 = com.umeng.analytics.CoreProtocol.getInstance(r0)     // Catch: java.lang.Throwable -> L10
            r3 = 4105(0x1009, float:5.752E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r0, r3, r1, r2)     // Catch: java.lang.Throwable -> L10
        L47:
            com.umeng.common.ISysListener r0 = r4.b
            if (r0 == 0) goto L4e
            r0.onAppPause()
        L4e:
            return
    }

    void j() {
            r4 = this;
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L5
            goto L41
        L5:
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L13
            java.lang.String r0 = "onProfileSignOff can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r0 = move-exception
            goto L38
        L13:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L11
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L11
            r2.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r3 = "ts"
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L11
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L11
            com.umeng.analytics.CoreProtocol r1 = com.umeng.analytics.CoreProtocol.getInstance(r0)     // Catch: java.lang.Throwable -> L11
            r3 = 4102(0x1006, float:5.748E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r0, r3, r1, r2)     // Catch: java.lang.Throwable -> L11
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L11
            com.umeng.analytics.CoreProtocol r1 = com.umeng.analytics.CoreProtocol.getInstance(r0)     // Catch: java.lang.Throwable -> L11
            r3 = 4356(0x1104, float:6.104E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r0, r3, r1, r2)     // Catch: java.lang.Throwable -> L11
            return
        L38:
            boolean r1 = com.umeng.commonsdk.statistics.common.MLog.DEBUG
            if (r1 == 0) goto L41
            java.lang.String r1 = " Excepthon  in  onProfileSignOff"
            com.umeng.commonsdk.statistics.common.MLog.e(r1, r0)
        L41:
            return
    }

    public synchronized void k() {
            r3 = this;
            monitor-enter(r3)
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L7
            monitor-exit(r3)
            return
        L7:
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L14
            java.lang.String r0 = "unregisterSuperPropertyByCoreProtocol can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r0)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L14:
            org.json.JSONObject r0 = r3.k     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L31
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L38
            android.content.SharedPreferences r0 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r0)     // Catch: java.lang.Throwable -> L38
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = "sp_uapp"
            org.json.JSONObject r2 = r3.k     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L38
            r0.putString(r1, r2)     // Catch: java.lang.Throwable -> L38
            r0.commit()     // Catch: java.lang.Throwable -> L38
            goto L38
        L31:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L38
            r0.<init>()     // Catch: java.lang.Throwable -> L38
            r3.k = r0     // Catch: java.lang.Throwable -> L38
        L38:
            monitor-exit(r3)
            return
    }

    public synchronized org.json.JSONObject l() {
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L20
            r1 = 0
            if (r0 != 0) goto L8
            monitor-exit(r2)
            return r1
        L8:
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L15
            java.lang.String r0 = "getSuperPropertiesJSONObject can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r0)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)
            return r1
        L15:
            org.json.JSONObject r0 = r2.k     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L20
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L20
            r0.<init>()     // Catch: java.lang.Throwable -> L20
            r2.k = r0     // Catch: java.lang.Throwable -> L20
        L20:
            org.json.JSONObject r0 = r2.k     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)
            return r0
        L24:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            throw r0
    }

    public synchronized void m() {
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L24
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L12
            java.lang.String r0 = "clearSuperPropertiesByCoreProtocol can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.e(r0)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)
            return
        L12:
            android.content.Context r0 = com.umeng.analytics.b.a     // Catch: java.lang.Throwable -> L24
            android.content.SharedPreferences r0 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r0)     // Catch: java.lang.Throwable -> L24
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "sp_uapp"
            r0.remove(r1)     // Catch: java.lang.Throwable -> L24
            r0.commit()     // Catch: java.lang.Throwable -> L24
        L24:
            monitor-exit(r2)
            return
    }

    @Override // com.umeng.analytics.pro.n
    public void n() {
            r4 = this;
            java.lang.String r0 = "--->>> onIntoBackground triggered."
            java.lang.String r1 = "MobclickRT"
            com.umeng.commonsdk.debug.UMRTLog.i(r1, r0)
            boolean r0 = com.umeng.analytics.AnalyticsConfig.enable
            if (r0 == 0) goto L37
            boolean r0 = com.umeng.commonsdk.config.FieldManager.b()
            if (r0 != 0) goto L12
            goto L37
        L12:
            java.lang.String r0 = "header_ekv_send_on_exit"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 == 0) goto L32
            r0 = 8210(0x2012, float:1.1505E-41)
            boolean r2 = com.umeng.commonsdk.framework.UMWorkDispatch.eventHasExist(r0)
            if (r2 != 0) goto L37
            java.lang.String r2 = "--->>> 退出时发送策略 被触发！"
            com.umeng.commonsdk.debug.UMRTLog.i(r1, r2)
            android.content.Context r1 = com.umeng.analytics.b.a
            com.umeng.analytics.CoreProtocol r2 = com.umeng.analytics.CoreProtocol.getInstance(r1)
            r3 = 0
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r1, r0, r2, r3)
            return
        L32:
            java.lang.String r0 = "--->>> 退出发送策略: 云控控制字关闭。功能不生效"
            com.umeng.commonsdk.debug.UMRTLog.i(r1, r0)
        L37:
            return
    }
}
