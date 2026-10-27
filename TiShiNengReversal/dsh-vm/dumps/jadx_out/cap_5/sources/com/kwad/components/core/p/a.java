package com.kwad.components.core.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private static boolean WR;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.p.a$a, reason: collision with other inner class name */
    static final class C0083a {
        private static final com.kwad.components.core.p.a WT = null;

        static {
                com.kwad.components.core.p.a r0 = new com.kwad.components.core.p.a
                r0.<init>()
                com.kwad.components.core.p.a.C0083a.WT = r0
                return
        }

        public C0083a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.core.p.a si() {
                com.kwad.components.core.p.a r0 = com.kwad.components.core.p.a.C0083a.WT
                return r0
        }
    }

    static {
            return
    }

    protected a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kwad.sdk.core.report.n M(long r1) {
            com.kwad.sdk.core.report.n r0 = new com.kwad.sdk.core.report.n
            r0.<init>(r1)
            return r0
    }

    private static com.kwad.sdk.core.report.n a(long r1, com.kwad.sdk.core.response.model.AdTemplate r3, java.lang.String r4) {
            com.kwad.sdk.core.report.n r0 = new com.kwad.sdk.core.report.n
            r0.<init>(r1, r3, r4)
            return r0
    }

    private static com.kwad.sdk.core.report.n b(long r1, com.kwad.sdk.core.response.model.AdTemplate r3) {
            com.kwad.sdk.core.report.n r0 = new com.kwad.sdk.core.report.n
            r0.<init>(r1, r3)
            return r0
    }

    public static com.kwad.components.core.p.a se() {
            com.kwad.components.core.p.a r0 = com.kwad.components.core.p.a.C0083a.si()
            return r0
    }

    public final void a(int r3, @androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r4, java.lang.String r5) {
            r2 = this;
            long r0 = (long) r3
            com.kwad.sdk.core.report.n r3 = a(r0, r4, r5)
            com.kwad.sdk.core.report.g.a2(r3)
            return
    }

    public final void a(com.kwad.components.core.proxy.a.b r4) {
            r3 = this;
            r0 = 10215(0x27e7, double:5.047E-320)
            com.kwad.sdk.core.report.n r0 = M(r0)
            java.lang.String r1 = r4.WH
            r0.WH = r1
            long r1 = r4.WO
            r0.WO = r1
            long r1 = r4.WP
            r0.WP = r1
            long r1 = r4.WQ
            r0.WQ = r1
            com.kwad.sdk.core.report.g.a2(r0)
            return
    }

    public final void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r4, long r5, int r7) {
            r3 = this;
            r0 = 104(0x68, double:5.14E-322)
            com.kwad.sdk.core.report.n r0 = b(r0, r4)
            long r1 = com.kwad.sdk.utils.n.eN(r4)
            r0.clickTime = r1
            r0.aHm = r5
            r0.aHn = r7
            com.kwad.sdk.core.report.g.a2(r0)
            return
    }

    public final void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3, long r4, long r6, int r8) {
            r2 = this;
            r0 = 10203(0x27db, double:5.041E-320)
            com.kwad.sdk.core.report.n r3 = b(r0, r3)
            r3.aci = r4
            r3.blockDuration = r6
            long r4 = (long) r8
            r3.aGN = r4
            com.kwad.sdk.core.report.g.a2(r3)
            return
    }

    public final void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            r0 = 10003(0x2713, double:4.942E-320)
            com.kwad.sdk.core.report.n r3 = b(r0, r3)
            r3.aGX = r4
            r3.errorMsg = r5
            com.kwad.sdk.core.report.g.a2(r3)
            return
    }

    public final void a(com.kwad.sdk.internal.api.SceneImpl r3, boolean r4, java.lang.String r5) {
            r2 = this;
            r0 = 10216(0x27e8, double:5.0474E-320)
            com.kwad.sdk.core.report.n r0 = M(r0)
            r0.aHi = r4
            r0.aHj = r5
            r0.adScene = r3
            com.kwad.sdk.core.report.g.a2(r0)
            return
    }

    public final void a(boolean r3, java.util.List<java.lang.Integer> r4) {
            r2 = this;
            r0 = 10204(0x27dc, double:5.0414E-320)
            com.kwad.sdk.core.report.n r0 = M(r0)
            r0.aHi = r3
            int r3 = r4.size()
            if (r3 <= 0) goto L29
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r4.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            r3.put(r1)
            goto L17
        L27:
            r0.aHh = r3
        L29:
            com.kwad.sdk.core.report.g.a2(r0)
            return
    }

    public final void aI(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3) {
            r2 = this;
            r0 = 10007(0x2717, double:4.944E-320)
            com.kwad.sdk.core.report.n r3 = b(r0, r3)
            com.kwad.sdk.core.report.g.a2(r3)
            return
    }

    public final void aJ(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3) {
            r2 = this;
            r0 = 10208(0x27e0, double:5.0434E-320)
            com.kwad.sdk.core.report.n r3 = b(r0, r3)
            com.kwad.sdk.core.report.g.a2(r3)
            return
    }

    public final void aK(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3) {
            r2 = this;
            r0 = 10209(0x27e1, double:5.044E-320)
            com.kwad.sdk.core.report.n r3 = b(r0, r3)
            com.kwad.sdk.core.report.g.a2(r3)
            return
    }

    public final void aS(int r3) {
            r2 = this;
            r0 = 10104(0x2778, double:4.992E-320)
            com.kwad.sdk.core.report.n r0 = M(r0)
            r0.aGY = r3
            com.kwad.sdk.core.report.g.a2(r0)
            return
    }

    public final void aT(int r3) {
            r2 = this;
            r0 = 10107(0x277b, double:4.9935E-320)
            com.kwad.sdk.core.report.n r0 = M(r0)
            r0.aGZ = r3
            com.kwad.sdk.core.report.g.a2(r0)
            return
    }

    public final void az(android.content.Context r4) {
            r3 = this;
            r0 = 11
            com.kwad.sdk.core.report.n r0 = M(r0)
            java.lang.Class<com.kwad.sdk.components.p> r1 = com.kwad.sdk.components.p.class
            com.kwad.sdk.components.b r1 = com.kwad.sdk.components.d.f(r1)
            com.kwad.sdk.components.p r1 = (com.kwad.sdk.components.p) r1
            if (r1 == 0) goto L25
            java.util.List r2 = com.kwad.sdk.core.config.e.BB()
            org.json.JSONArray[] r4 = r1.b(r4, r2)
            r1 = 0
            r1 = r4[r1]
            r0.aGQ = r1
            r1 = 1
            r4 = r4[r1]
            r0.aGR = r4
            com.kwad.sdk.core.report.g.a2(r0)
        L25:
            return
    }

    public final void b(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            r0 = 10005(0x2715, double:4.943E-320)
            com.kwad.sdk.core.report.n r0 = b(r0, r3)
            boolean r1 = com.kwad.sdk.core.response.b.e.ed(r3)
            if (r1 == 0) goto L17
            com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.K(r3)
            r0.aGX = r3
            goto L1d
        L17:
            java.lang.String r3 = com.kwad.sdk.core.response.b.e.en(r3)
            r0.aGX = r3
        L1d:
            r0.aGX = r4
            r0.errorMsg = r5
            com.kwad.sdk.core.report.g.a2(r0)
            return
    }

    public final void c(long r4, int r6) {
            r3 = this;
            boolean r0 = com.kwad.sdk.core.config.e.FU()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 20000(0x4e20, double:9.8813E-320)
            com.kwad.sdk.core.report.n r0 = M(r0)
            long r1 = java.lang.System.currentTimeMillis()
            r0.timestamp = r1
            r0.aHH = r6
            r0.posId = r4
            r4 = 4063001(0x3dff19, float:5.693477E-39)
            r0.aHI = r4
            com.kwad.sdk.core.report.g.a2(r0)
            return
    }

    public final void c(@androidx.annotation.NonNull org.json.JSONArray r3) {
            r2 = this;
            r0 = 10200(0x27d8, double:5.0395E-320)
            com.kwad.sdk.core.report.n r0 = M(r0)
            r0.aHc = r3
            com.kwad.sdk.core.report.g.a2(r0)
            return
    }

    public final void e(com.kwad.sdk.core.response.model.AdTemplate r3, int r4) {
            r2 = this;
            r0 = 10108(0x277c, double:4.994E-320)
            com.kwad.sdk.core.report.n r3 = b(r0, r3)
            r3.aGZ = r4
            com.kwad.sdk.core.report.g.a2(r3)
            return
    }

    public final void e(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = this;
            com.kwad.sdk.core.report.n r1 = r0.m(r1, r2)
            com.kwad.sdk.core.report.g.a(r1, r3)
            return
    }

    public final void e(@androidx.annotation.NonNull org.json.JSONObject r3, int r4) {
            r2 = this;
            r0 = 10201(0x27d9, double:5.04E-320)
            com.kwad.sdk.core.report.n r0 = M(r0)
            java.lang.String r1 = "appChangeType"
            com.kwad.sdk.utils.aa.putValue(r3, r1, r4)
            r0.aHb = r3
            com.kwad.sdk.core.report.g.a2(r0)
            return
    }

    public final void f(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r5, int r6) {
            r4 = this;
            boolean r0 = com.kwad.sdk.core.config.e.FU()
            if (r0 != 0) goto L7
            return
        L7:
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r5)
            r1 = 20000(0x4e20, double:9.8813E-320)
            com.kwad.sdk.core.report.n r1 = M(r1)
            long r2 = java.lang.System.currentTimeMillis()
            r1.timestamp = r2
            r1.aHH = r6
            java.lang.String r6 = r0.trace
            r1.trace = r6
            r6 = 4063001(0x3dff19, float:5.693477E-39)
            r1.aHI = r6
            long r5 = com.kwad.sdk.core.response.b.e.ee(r5)
            r1.posId = r5
            com.kwad.sdk.core.report.g.a2(r1)
            return
    }

    public final void f(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3, int r4, int r5) {
            r2 = this;
            r0 = 12006(0x2ee6, double:5.9318E-320)
            com.kwad.sdk.core.report.n r3 = b(r0, r3)
            r3.adE = r4
            r3.aye = r5
            com.kwad.sdk.core.report.g.a2(r3)
            return
    }

    public final void f(com.kwad.sdk.core.response.model.AdTemplate r3, int r4, java.lang.String r5) {
            r2 = this;
            r0 = 10109(0x277d, double:4.9945E-320)
            com.kwad.sdk.core.report.n r3 = b(r0, r3)
            r4 = 1
            r3.aGZ = r4
            r3.aHa = r5
            com.kwad.sdk.core.report.g.a2(r3)
            return
    }

    public final void g(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3, int r4, int r5) {
            r2 = this;
            r0 = 10002(0x2712, double:4.9416E-320)
            com.kwad.sdk.core.report.n r0 = b(r0, r3)
            r0.Iw()
            boolean r1 = com.kwad.sdk.core.response.b.e.ed(r3)
            if (r1 == 0) goto L1a
            com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.K(r3)
            r0.aGX = r3
            goto L20
        L1a:
            java.lang.String r3 = com.kwad.sdk.core.response.b.e.en(r3)
            r0.aGX = r3
        L20:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L36
            r3.<init>()     // Catch: org.json.JSONException -> L36
            java.lang.String r1 = "what"
            r3.put(r1, r4)     // Catch: org.json.JSONException -> L36
            java.lang.String r4 = "extra"
            r3.put(r4, r5)     // Catch: org.json.JSONException -> L36
            java.lang.String r3 = r3.toString()     // Catch: org.json.JSONException -> L36
            r0.errorMsg = r3     // Catch: org.json.JSONException -> L36
            goto L3a
        L36:
            r3 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r3)
        L3a:
            com.kwad.sdk.core.report.g.a2(r0)
            return
    }

    public final void g(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3, int r4, java.lang.String r5) {
            r2 = this;
            r0 = 107(0x6b, double:5.3E-322)
            com.kwad.sdk.core.report.n r3 = b(r0, r3)
            r3.errorCode = r4
            r3.errorMsg = r5
            com.kwad.sdk.core.report.g.a2(r3)
            return
    }

    public final void h(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3, long r4) {
            r2 = this;
            r0 = 10202(0x27da, double:5.0405E-320)
            com.kwad.sdk.core.report.n r3 = b(r0, r3)
            r3.aHg = r4
            com.kwad.sdk.core.report.g.a2(r3)
            return
    }

    public final void i(com.kwad.sdk.core.response.model.AdTemplate r3, long r4) {
            r2 = this;
            r0 = 10206(0x27de, double:5.0424E-320)
            com.kwad.sdk.core.report.n r3 = b(r0, r3)
            r3.aHw = r4
            com.kwad.sdk.core.report.g.a2(r3)
            return
    }

    public final void j(com.kwad.sdk.core.response.model.AdTemplate r3, long r4) {
            r2 = this;
            r0 = 10207(0x27df, double:5.043E-320)
            com.kwad.sdk.core.report.n r3 = b(r0, r3)
            r3.aHx = r4
            com.kwad.sdk.core.report.g.a2(r3)
            return
    }

    public final com.kwad.sdk.core.report.n m(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r0 = 12200(0x2fa8, double:6.0276E-320)
            com.kwad.sdk.core.report.n r0 = M(r0)
            r0.aHF = r3
            r0.aHG = r4
            return r0
    }

    public final void sf() {
            r1 = this;
            boolean r0 = com.kwad.components.core.p.a.WR
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            com.kwad.components.core.p.a.WR = r0
            com.kwad.components.core.p.a$1 r0 = new com.kwad.components.core.p.a$1
            r0.<init>(r1)
            com.kwad.sdk.utils.h.execute(r0)
            return
    }

    public final void sg() {
            r2 = this;
            r0 = 10101(0x2775, double:4.9906E-320)
            com.kwad.sdk.core.report.n r0 = M(r0)
            com.kwad.sdk.core.report.g.a2(r0)
            return
    }

    public final void sh() {
            r2 = this;
            r0 = 10106(0x277a, double:4.993E-320)
            com.kwad.sdk.core.report.n r0 = M(r0)
            com.kwad.sdk.core.report.g.a2(r0)
            return
    }
}
