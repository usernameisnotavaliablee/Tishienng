package com.bytedance.msdk.core;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private static final com.bytedance.msdk.core.j rh = null;
    private boolean a;
    private boolean ae;
    private java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> av;
    private java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> az;
    private java.lang.Object c;
    private boolean ch;
    private java.lang.String cw;
    private com.bytedance.msdk.j.cw.cw ed;
    private java.util.Map<java.lang.String, java.lang.Object> f;
    private boolean g;
    private com.bytedance.msdk.api.r.j.g.j gq;
    private long gx;
    private boolean h;
    private com.bytedance.msdk.api.r.ws hh;
    private boolean i;
    private int j;
    private java.lang.String jy;
    private long kt;

    /* renamed from: l, reason: collision with root package name */
    private java.lang.String f2202l;
    private java.lang.String la;

    /* renamed from: m, reason: collision with root package name */
    private boolean f2203m;
    private com.bytedance.msdk.api.r.m mi;

    /* renamed from: n, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.lang.Integer> f2204n;
    private final java.util.Map<java.lang.String, java.lang.Float> nd;
    private int[] ol;
    private java.lang.String oq;

    /* renamed from: p, reason: collision with root package name */
    private boolean f2205p;
    private java.util.Map<java.lang.String, java.lang.String> qv;

    /* renamed from: r, reason: collision with root package name */
    private java.lang.String f2206r;
    private boolean rn;

    /* renamed from: s, reason: collision with root package name */
    private org.json.JSONObject f2207s;
    private java.util.Map<java.lang.String, java.lang.Object> tj;
    private java.lang.String tl;
    private int uf;
    private boolean up;

    /* renamed from: v, reason: collision with root package name */
    private java.util.List<java.lang.String> f2208v;
    private java.lang.String vl;

    /* renamed from: w, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.lang.Object> f2209w;
    private com.bykv.vk.openvk.api.proto.PluginValueSet wq;
    private java.util.Set<java.lang.String> ws;

    /* renamed from: x, reason: collision with root package name */
    private boolean f2210x;
    private java.lang.String[] xt;

    static {
            com.bytedance.msdk.core.j r0 = new com.bytedance.msdk.core.j
            r0.<init>()
            com.bytedance.msdk.core.j.rh = r0
            return
    }

    private j() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.j = r0
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3.up = r1
            r3.f2203m = r0
            r3.ae = r0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r3.ws = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.az = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.av = r1
            r3.i = r0
            com.bytedance.msdk.tl.tj r0 = new com.bytedance.msdk.tl.tj
            r0.<init>()
            r3.f2209w = r0
            r0 = -1
            r3.kt = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r3.tj = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r3.f = r0
            r0 = -1
            r3.uf = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.f2204n = r0
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r3.nd = r1
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            boolean r1 = r1.ed()
            if (r1 == 0) goto L75
            java.lang.String r1 = "adGap"
            r0.put(r1, r2)
            java.lang.String r1 = "adLoad"
            r0.put(r1, r2)
            java.lang.String r1 = "sectionId"
            r0.put(r1, r2)
            java.lang.String r1 = "pageId"
            r0.put(r1, r2)
            java.lang.String r1 = "custom"
            r0.put(r1, r2)
        L75:
            return
    }

    private static void g(java.lang.String r1) {
            java.lang.String r0 = "appid不能为空"
            com.bytedance.msdk.tl.ch.j(r1, r0)
            return
    }

    public static java.lang.String j(android.content.Context r3) {
            java.lang.String r0 = ""
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r3.packageName     // Catch: java.lang.Throwable -> L18
            r2 = 0
            android.content.pm.ApplicationInfo r3 = r1.getApplicationInfo(r3, r2)     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L1a
            java.lang.CharSequence r3 = r1.getApplicationLabel(r3)     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r3 = move-exception
            goto L1e
        L1a:
            r3 = r0
        L1b:
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L18
            return r3
        L1e:
            com.bytedance.sdk.component.utils.vl.j(r3)
            return r0
    }

    public static com.bytedance.msdk.core.j qv() {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.rh
            return r0
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.vl
            return r0
    }

    public void ae(java.lang.String r1) {
            r0 = this;
            r0.vl = r1
            return
    }

    public void ae(boolean r1) {
            r0 = this;
            r0.f2210x = r1
            return
    }

    public boolean ae() {
            r1 = this;
            boolean r0 = r1.g
            return r0
    }

    public java.lang.String av() {
            r1 = this;
            java.lang.String r0 = r1.oq
            return r0
    }

    public boolean az() {
            r1 = this;
            boolean r0 = r1.ae
            return r0
    }

    public boolean c() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    public boolean ch() {
            r3 = this;
            java.lang.String r0 = "com.union_test.toutiao"
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = "5001121"
            if (r0 == 0) goto L1a
            java.lang.String r0 = r3.cw     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L7a
        L1a:
            java.lang.String r0 = "com.pangolin_demo.toutiao"
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L32
            java.lang.String r0 = r3.cw     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L7a
        L32:
            java.lang.String r0 = "com.bytedance.mediation_demo"
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L4a
            java.lang.String r0 = r3.cw     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L7a
        L4a:
            java.lang.String r0 = "com.msdk.qa.monkey"
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L62
            java.lang.String r0 = r3.cw     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L7a
        L62:
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = "com.bytedance.mediation_demo_csj"
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L7c
            java.lang.String r0 = r3.cw     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L7c
        L7a:
            r0 = 1
            return r0
        L7c:
            r0 = 0
            return r0
    }

    public long cw() {
            r5 = this;
            long r0 = r5.kt
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L9
            return r0
        L9:
            com.bytedance.msdk.ae.xt.j r0 = com.bytedance.msdk.ae.xt.j.j()
            long r0 = r0.xt()
            r5.kt = r0
            return r0
    }

    public void cw(java.lang.String r1) {
            r0 = this;
            g(r1)
            r0.cw = r1
            return
    }

    public void cw(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            int r0 = r2.size()
            if (r0 <= 0) goto Ld
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f
            r0.putAll(r2)
        Ld:
            return
    }

    public void cw(boolean r1) {
            r0 = this;
            r0.rn = r1
            return
    }

    public org.json.JSONObject ed() {
            r1 = this;
            org.json.JSONObject r0 = r1.f2207s
            return r0
    }

    public int f() {
            r1 = this;
            int r0 = r1.j
            return r0
    }

    public void g(boolean r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public boolean g() {
            r2 = this;
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r1 = "com.bytedance.mediation_demo_csj"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L18
            boolean r0 = r2.oq()
            if (r0 == 0) goto L18
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> gq() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f
            return r0
    }

    public java.lang.String gx() {
            r1 = this;
            java.lang.String r0 = r1.f2202l
            return r0
    }

    public void h() {
            r1 = this;
            com.bytedance.msdk.core.j r0 = qv()
            com.bytedance.msdk.j.cw.cw r0 = r0.xt()
            com.bytedance.msdk.api.r.ws r0 = com.bytedance.msdk.api.r.ws.j(r0)
            r1.hh = r0
            return
    }

    public com.bytedance.msdk.api.r.j.g.j hh() {
            r1 = this;
            com.bytedance.msdk.api.r.j.g.j r0 = r1.gq
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> i() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.qv
            return r0
    }

    public float j(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Float> r0 = r1.nd
            java.lang.Object r2 = r0.get(r2)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            return r2
    }

    public void j(int r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void j(long r2) {
            r1 = this;
            com.bytedance.msdk.ae.xt.j r0 = com.bytedance.msdk.ae.xt.j.j()
            r0.j(r2)
            return
    }

    public void j(com.bykv.vk.openvk.api.proto.PluginValueSet r1) {
            r0 = this;
            r0.wq = r1
            return
    }

    public void j(com.bytedance.msdk.api.r.j.g.j r1) {
            r0 = this;
            r0.gq = r1
            return
    }

    public void j(com.bytedance.msdk.api.r.m r1, boolean r2) {
            r0 = this;
            if (r2 != 0) goto L29
            com.bytedance.msdk.api.r.m r2 = r0.mi
            if (r2 != 0) goto La
            if (r1 != 0) goto La
            r2 = 1
            goto L14
        La:
            if (r2 == 0) goto L13
            if (r1 == 0) goto L13
            boolean r2 = r2.equals(r1)
            goto L14
        L13:
            r2 = 0
        L14:
            r0.mi = r1
            if (r2 != 0) goto L28
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.core.ws.xt r1 = com.bytedance.msdk.core.ws.xt.j(r1)
            com.bytedance.msdk.core.ws.xt r1 = r1.j()
            r2 = 3
            r1.j(r2)
        L28:
            return
        L29:
            r0.mi = r1
            return
    }

    public void j(java.lang.Object r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void j(java.lang.String r2, float r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Float> r0 = r1.nd
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.put(r2, r3)
            return
    }

    public void j(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.f2208v = r1
            return
    }

    public void j(java.util.Map<java.lang.String, java.lang.String> r1) {
            r0 = this;
            r0.qv = r1
            return
    }

    public void j(org.json.JSONObject r1) {
            r0 = this;
            r0.f2207s = r1
            return
    }

    public void j(boolean r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void j(int... r1) {
            r0 = this;
            r0.ol = r1
            return
    }

    public void j(java.lang.String[] r1) {
            r0 = this;
            r0.xt = r1
            return
    }

    public boolean j() {
            r1 = this;
            boolean r0 = r1.i
            return r0
    }

    public boolean jy() {
            r1 = this;
            boolean r0 = r1.rn
            return r0
    }

    public boolean kt() {
            r1 = this;
            boolean r0 = r1.f2203m
            return r0
    }

    public com.bytedance.msdk.api.r.m l() {
            r1 = this;
            com.bytedance.msdk.api.r.m r0 = r1.mi
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> la() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.tj
            return r0
    }

    public java.lang.String m() {
            r1 = this;
            java.lang.String r0 = r1.la
            return r0
    }

    public void m(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Le
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()
            java.lang.String r2 = j(r2)
        Le:
            r1.f2206r = r2
            return
    }

    public void m(boolean r1) {
            r0 = this;
            r0.f2203m = r1
            return
    }

    public int[] mi() {
            r1 = this;
            int[] r0 = r1.ol
            return r0
    }

    public boolean n() {
            r1 = this;
            boolean r0 = r1.f2205p
            return r0
    }

    public boolean nd() {
            r1 = this;
            boolean r0 = r1.h
            return r0
    }

    public com.bykv.vk.openvk.api.proto.PluginValueSet ol() {
            r1 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r1.wq
            if (r0 == 0) goto L5
            return r0
        L5:
            com.bykv.j.j.j.j.e r0 = com.bykv.j.j.j.j.e.a()
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r0.k()
            return r0
    }

    public void oq(boolean r1) {
            r0 = this;
            r0.f2205p = r1
            return
    }

    public boolean oq() {
            r5 = this;
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            java.io.File r0 = com.bytedance.sdk.openadsdk.api.plugin.xt.cw(r0)
            java.lang.String r0 = r0.getPath()
            int r1 = r5.uf
            r2 = 0
            r3 = 1
            if (r1 >= 0) goto L33
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "/e2e.text"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L31
            r5.uf = r3
            goto L33
        L31:
            r5.uf = r2
        L33:
            int r0 = r5.uf
            if (r0 <= 0) goto L38
            return r3
        L38:
            return r2
    }

    public com.bytedance.msdk.api.r.ws p() {
            r1 = this;
            com.bytedance.msdk.api.r.ws r0 = r1.hh
            if (r0 != 0) goto L12
            com.bytedance.msdk.core.j r0 = qv()
            com.bytedance.msdk.j.cw.cw r0 = r0.xt()
            com.bytedance.msdk.api.r.ws r0 = com.bytedance.msdk.api.r.ws.j(r0)
            r1.hh = r0
        L12:
            com.bytedance.msdk.api.r.ws r0 = r1.hh
            return r0
    }

    public void qv(boolean r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public java.util.Map<java.lang.String, java.lang.Integer> r() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.f2204n
            return r0
    }

    public void r(java.lang.String r1) {
            r0 = this;
            r0.tl = r1
            return
    }

    public void r(boolean r1) {
            r0 = this;
            r0.ae = r1
            return
    }

    public java.util.Map<java.lang.String, java.lang.Object> rh() {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.f2209w
            java.lang.String r1 = "gm_usb"
            java.lang.String r2 = com.bytedance.msdk.core.g.up.up()
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.f2209w
            return r0
    }

    public java.util.List<java.lang.String> rn() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.f2208v
            return r0
    }

    public boolean s() {
            r2 = this;
            java.lang.String r0 = com.bytedance.msdk.tl.rn.j()
            java.lang.String r1 = "com.union_test.toutiao"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1f
            java.lang.String r1 = "com.bytedance.mediation_demo"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1f
            java.lang.String r1 = "com.msdk.qa.monkey"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = 0
            return r0
        L1f:
            r0 = 1
            return r0
    }

    public java.lang.String tj() {
            r1 = this;
            java.lang.String r0 = r1.f2206r
            return r0
    }

    public java.lang.String tl() {
            r3 = this;
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r1 = "com.union_test.toutiao"
            boolean r0 = r1.equals(r0)
            java.lang.String r1 = "5001121"
            if (r0 == 0) goto L1a
            java.lang.String r0 = r3.cw
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L32
        L1a:
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r2 = "com.bytedance.mediation_demo"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L43
            java.lang.String r0 = r3.cw
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L43
        L32:
            java.lang.String r0 = "tt_mediation_ppe_info"
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Exception -> L43
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)     // Catch: java.lang.Exception -> L43
            java.lang.String r1 = "tt_ppe_content"
            java.lang.String r0 = r0.xt(r1)     // Catch: java.lang.Exception -> L43
            return r0
        L43:
            r0 = 0
            return r0
    }

    public void tl(java.lang.String r1) {
            r0 = this;
            r0.f2202l = r1
            return
    }

    public void tl(boolean r2) {
            r1 = this;
            r1.ch = r2
            if (r2 == 0) goto L11
            java.lang.String r2 = "com.bykv.vk.openvk.TTVfSdk"
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> La
            return
        La:
            r2 = move-exception
            r0 = 0
            r1.ch = r0
            com.bytedance.sdk.component.utils.vl.j(r2)
        L11:
            return
    }

    public boolean uf() {
            r1 = this;
            boolean r0 = r1.ch
            return r0
    }

    public long up() {
            r2 = this;
            long r0 = r2.gx
            return r0
    }

    public void up(java.lang.String r1) {
            r0 = this;
            r0.oq = r1
            return
    }

    public void up(boolean r1) {
            r0 = this;
            r0.up = r1
            return
    }

    public java.lang.String[] v() {
            r1 = this;
            java.lang.String[] r0 = r1.xt
            return r0
    }

    public java.lang.String vl() {
            r1 = this;
            java.lang.String r0 = r1.cw
            return r0
    }

    public java.lang.String w() {
            r1 = this;
            java.lang.String r0 = r1.tl
            return r0
    }

    public boolean wq() {
            r1 = this;
            boolean r0 = r1.f2210x
            return r0
    }

    public boolean ws() {
            r1 = this;
            boolean r0 = r1.up
            return r0
    }

    public java.lang.String x() {
            r4 = this;
            java.lang.String r0 = r4.jy
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = r4.jy
            return r0
        Lb:
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            r1 = 0
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r1, r0)
            java.lang.String r0 = r0.j()
            r4.jy = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = r4.jy
            return r0
        L23:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r2)
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.tl.l r1 = com.bytedance.msdk.tl.l.j(r1, r2)
            r1.j(r0)
            r4.jy = r0
            return r0
    }

    public com.bytedance.msdk.j.cw.cw xt() {
            r1 = this;
            com.bytedance.msdk.j.cw.cw r0 = r1.ed
            if (r0 != 0) goto L15
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            com.bytedance.msdk.m.xt.up.j(r0)
            android.util.SparseArray r0 = r0.xt()
            com.bytedance.msdk.j.cw.cw r0 = com.bytedance.msdk.j.cw.cw.j(r0)
            r1.ed = r0
        L15:
            com.bytedance.msdk.j.cw.cw r0 = r1.ed
            return r0
    }

    public void xt(long r1) {
            r0 = this;
            r0.gx = r1
            return
    }

    public void xt(java.lang.String r1) {
            r0 = this;
            r0.la = r1
            return
    }

    public void xt(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            if (r2 == 0) goto Le
            int r0 = r2.size()
            if (r0 != 0) goto L9
            goto Le
        L9:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.tj
            r0.putAll(r2)
        Le:
            return
    }

    public void xt(boolean r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public java.lang.Object z() {
            r1 = this;
            java.lang.Object r0 = r1.c
            return r0
    }
}
