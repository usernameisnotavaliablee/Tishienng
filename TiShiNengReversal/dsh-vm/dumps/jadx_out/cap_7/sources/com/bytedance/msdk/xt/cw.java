package com.bytedance.msdk.xt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class cw extends com.bytedance.sdk.openadsdk.core.wq.r implements java.lang.Comparable<com.bytedance.msdk.xt.cw> {
    private java.lang.String a;
    protected com.bytedance.msdk.j.xt.m ae;
    private boolean aq;
    private int av;
    private int az;
    private int b;
    private double c;
    private int ch;
    protected com.bytedance.msdk.api.r.j.xt cw;
    private java.lang.String d;
    private java.lang.String e;
    private java.util.Map<java.lang.String, java.lang.Object> ed;
    private double f;
    private volatile boolean ff;
    private com.bytedance.sdk.openadsdk.kt.j.xt.j.j fx;
    private java.lang.String g;
    private java.lang.String gq;
    private double gx;
    private java.lang.String h;
    private int hh;
    private int hl;
    private java.lang.String i;
    private java.lang.String ik;
    private int im;
    protected com.bytedance.msdk.api.r.j.ae.xt j;
    private int jy;
    private volatile boolean k;
    private java.lang.String ka;
    private final java.util.Map<java.lang.String, java.lang.Object> kc;
    private int ki;
    private java.util.List<java.lang.String> kt;
    private boolean l;
    private long la;
    private long ll;
    private boolean ln;
    protected com.bytedance.msdk.api.r.j.cw.j m;
    private double mi;
    private int n;
    private int nd;
    private int nt;
    private int ol;
    private java.lang.String oq;
    private java.lang.String oy;
    private java.lang.String p;
    private java.lang.String px;
    private int pz;
    private java.lang.String q;
    private int qa;
    private java.lang.String qb;
    private java.util.Map<java.lang.String, java.lang.Object> qe;
    private volatile boolean qo;
    private java.lang.String qv;
    protected com.bytedance.msdk.api.r.j.r r;
    private int rh;
    private java.lang.String ri;
    private java.lang.String rn;
    private boolean rr;
    private volatile boolean ry;
    private boolean s;
    private boolean sm;
    private int st;
    private java.lang.String t;
    private java.lang.String tj;
    private java.util.Map<java.lang.String, java.lang.Object> tk;
    protected com.bytedance.msdk.j.xt.m tl;
    private boolean u;
    private java.lang.String uc;
    private java.util.Map<java.lang.String, java.lang.String> uf;
    protected com.bytedance.msdk.api.r.j.ae.g up;
    private java.lang.String uq;
    private int v;
    private java.lang.String vl;
    private java.lang.String w;
    private java.lang.String wf;
    private com.bytedance.msdk.xt.cw.j wi;
    private volatile boolean wo;
    private java.lang.String wq;
    private int ws;
    private int x;
    private java.lang.String xp;
    private int xq;
    protected com.bytedance.msdk.api.r.j.ae.tl xt;
    private java.lang.String xw;
    private int y;
    private java.lang.String ya;
    private java.lang.String yl;
    private java.lang.String z;
    private volatile boolean zz;


    public interface j {
        void j();

        void j(com.bytedance.msdk.xt.cw r1);
    }

    public cw() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.kt = r0
            r0 = -1
            r2.x = r0
            r0 = 1
            r2.nd = r0
            r2.rh = r0
            r2.ol = r0
            r2.hh = r0
            r0 = 0
            r2.k = r0
            r2.ff = r0
            r2.ry = r0
            r2.zz = r0
            com.bytedance.msdk.tl.tj r1 = new com.bytedance.msdk.tl.tj
            r1.<init>()
            r2.kc = r1
            r2.aq = r0
            r2.rr = r0
            java.lang.String r0 = "1"
            r2.t = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.qe = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.tk = r0
            return
    }

    private void j(android.view.ViewGroup r3, com.bytedance.msdk.api.r.j.ae.oq r4) {
            r2 = this;
            r2.xt(r3)
            int r0 = com.bytedance.gromore.R.id.tt_mediation_mtg_ad_choice
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L10
            r1 = 8
            r0.setVisibility(r1)
        L10:
            if (r4 == 0) goto L1b
            int r4 = r4.vl
            android.view.View r3 = r3.findViewById(r4)
            r2.j(r3)
        L1b:
            return
    }

    private void xt(@androidx.annotation.NonNull android.view.ViewGroup r7) {
            r6 = this;
            int r0 = r7.getChildCount()     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L8
            goto Lb0
        L8:
            int r0 = r6.pz()     // Catch: java.lang.Throwable -> L59
            r1 = 3
            r2 = 0
            if (r0 == r1) goto L5e
            android.view.View r0 = r7.getChildAt(r2)     // Catch: java.lang.Throwable -> L59
            boolean r0 = r0 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L5e
            android.view.View r0 = r7.getChildAt(r2)     // Catch: java.lang.Throwable -> L59
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = "tt_gdt_developer_view_root"
            int r3 = com.bytedance.gromore.R.id.tt_mediation_gdt_developer_view_root_tag_key     // Catch: java.lang.Throwable -> L59
            java.lang.Object r3 = r0.getTag(r3)     // Catch: java.lang.Throwable -> L59
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L5e
            r7.removeView(r0)     // Catch: java.lang.Throwable -> L59
            r1 = 0
        L30:
            int r3 = r0.getChildCount()     // Catch: java.lang.Throwable -> L59
            if (r1 >= r3) goto L5e
            android.view.View r3 = r0.getChildAt(r1)     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L5b
            int r4 = com.bytedance.gromore.R.id.tt_mediation_gdt_developer_view_tag_key     // Catch: java.lang.Throwable -> L59
            java.lang.Object r4 = r3.getTag(r4)     // Catch: java.lang.Throwable -> L59
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L5b
            java.lang.String r5 = "tt_gdt_developer_view"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L5b
            r0.removeView(r3)     // Catch: java.lang.Throwable -> L59
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()     // Catch: java.lang.Throwable -> L59
            r7.addView(r3, r4)     // Catch: java.lang.Throwable -> L59
            goto L30
        L59:
            r7 = move-exception
            goto Lb1
        L5b:
            int r1 = r1 + 1
            goto L30
        L5e:
            int r0 = r6.pz()     // Catch: java.lang.Throwable -> L59
            r1 = 2
            if (r0 == r1) goto Lb0
            android.view.View r0 = r7.getChildAt(r2)     // Catch: java.lang.Throwable -> L59
            boolean r0 = r0 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto Lb0
            android.view.View r0 = r7.getChildAt(r2)     // Catch: java.lang.Throwable -> L59
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = "tt_admob_native_view_root_tag"
            int r3 = com.bytedance.gromore.R.id.tt_mediation_admob_developer_view_root_tag_key     // Catch: java.lang.Throwable -> L59
            java.lang.Object r3 = r0.getTag(r3)     // Catch: java.lang.Throwable -> L59
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto Lb0
            r7.removeView(r0)     // Catch: java.lang.Throwable -> L59
        L84:
            int r1 = r0.getChildCount()     // Catch: java.lang.Throwable -> L59
            if (r2 >= r1) goto Lb0
            android.view.View r1 = r0.getChildAt(r2)     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto Lad
            int r3 = com.bytedance.gromore.R.id.tt_mediation_admob_developer_view_tag_key     // Catch: java.lang.Throwable -> L59
            java.lang.Object r3 = r1.getTag(r3)     // Catch: java.lang.Throwable -> L59
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto Lad
            java.lang.String r4 = "tt_admob_native_view_tag"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto Lad
            r0.removeView(r1)     // Catch: java.lang.Throwable -> L59
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()     // Catch: java.lang.Throwable -> L59
            r7.addView(r1, r3)     // Catch: java.lang.Throwable -> L59
            goto L84
        Lad:
            int r2 = r2 + 1
            goto L84
        Lb0:
            return
        Lb1:
            com.bytedance.sdk.component.utils.vl.j(r7)
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.qv = r1
            return
    }

    public boolean a() {
            r1 = this;
            boolean r0 = r1.rr
            return r0
    }

    public java.lang.String ae() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void ae(int r1) {
            r0 = this;
            r0.ol = r1
            return
    }

    public void ae(java.lang.String r1) {
            r0 = this;
            r0.z = r1
            return
    }

    public void ae(boolean r1) {
            r0 = this;
            r0.s = r1
            return
    }

    @Override // com.bytedance.sdk.openadsdk.core.wq.r
    public <T> T applyFunction(int r1, com.bykv.vk.openvk.api.proto.PluginValueSet r2, java.lang.Class<T> r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean aq() {
            r1 = this;
            boolean r0 = r1.s
            return r0
    }

    public void av() {
            r0 = this;
            return
    }

    public void av(int r1) {
            r0 = this;
            r0.im = r1
            return
    }

    public void av(java.lang.String r1) {
            r0 = this;
            r0.ik = r1
            return
    }

    public com.bytedance.msdk.api.r.j.cw.j az() {
            r1 = this;
            com.bytedance.msdk.api.r.j.cw.j r0 = r1.m
            return r0
    }

    public void az(int r1) {
            r0 = this;
            r0.nt = r1
            return
    }

    public void az(java.lang.String r1) {
            r0 = this;
            r0.t = r1
            return
    }

    public final java.util.Map<java.lang.String, java.lang.Object> b() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.qe
            return r0
    }

    public com.bytedance.sdk.openadsdk.i.cw.xt.up by() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.ya
            return r0
    }

    public int ch() {
            r1 = this;
            int r0 = r1.pz
            return r0
    }

    public void ch(java.lang.String r1) {
            r0 = this;
            r0.rn = r1
            return
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(com.bytedance.msdk.xt.cw r1) {
            r0 = this;
            com.bytedance.msdk.xt.cw r1 = (com.bytedance.msdk.xt.cw) r1
            int r1 = r0.j(r1)
            return r1
    }

    public void cw() {
            r0 = this;
            return
    }

    public void cw(double r1) {
            r0 = this;
            r0.gx = r1
            return
    }

    public void cw(int r1) {
            r0 = this;
            r0.st = r1
            return
    }

    public void cw(java.lang.String r1) {
            r0 = this;
            r0.qb = r1
            return
    }

    public void cw(java.util.Map<java.lang.String, java.lang.Object> r3) {
            r2 = this;
            if (r3 == 0) goto L16
            java.lang.String r0 = "setMediaExtraInfo "
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.xt(r1, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.kc
            r0.putAll(r3)
        L16:
            return
    }

    public void cw(boolean r1) {
            r0 = this;
            r0.aq = r1
            return
    }

    public int d() {
            r1 = this;
            int r0 = r1.im
            return r0
    }

    public boolean dj() {
            r1 = this;
            boolean r0 = r1 instanceof com.bytedance.msdk.api.r.j.xt.xt
            if (r0 != 0) goto Lb
            boolean r0 = r1 instanceof com.bytedance.msdk.cw.j.j.cw
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.yl
            return r0
    }

    public java.lang.String ed() {
            r1 = this;
            java.lang.String r0 = r1.qb
            return r0
    }

    public int el() {
            r1 = this;
            int r0 = r1.az
            return r0
    }

    public int et() {
            r1 = this;
            int r0 = r1.ws
            return r0
    }

    public void f(int r1) {
            r0 = this;
            r0.av = r1
            return
    }

    public void f(java.lang.String r1) {
            r0 = this;
            r0.p = r1
            return
    }

    public boolean f() {
            r1 = this;
            boolean r0 = r1.ln
            return r0
    }

    public java.lang.String ff() {
            r1 = this;
            java.lang.String r0 = r1.ik
            return r0
    }

    public boolean fp() {
            r1 = this;
            boolean r0 = r1.u
            return r0
    }

    public int fs() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String fx() {
            r1 = this;
            java.lang.String r0 = r1.qv
            return r0
    }

    public int g(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.z
            boolean r2 = android.text.TextUtils.equals(r2, r0)
            if (r2 == 0) goto Lb
            int r2 = r1.hh
            return r2
        Lb:
            int r2 = r1.rh
            return r2
    }

    public android.view.View g() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void g(int r1) {
            r0 = this;
            r0.nd = r1
            return
    }

    public void g(boolean r1) {
            r0 = this;
            r0.u = r1
            return
    }

    public void gq(java.lang.String r1) {
            r0 = this;
            r0.oq = r1
            return
    }

    public boolean gq() {
            r2 = this;
            boolean r0 = r2.ry
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            r2.ry = r1
            r0 = 0
            return r0
    }

    public int gr() {
            r1 = this;
            int r0 = r1.jy
            return r0
    }

    public java.lang.String gx() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    public void h(java.lang.String r1) {
            r0 = this;
            r0.w = r1
            return
    }

    public boolean h() {
            r2 = this;
            boolean r0 = r2.k
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            r2.k = r1
            r0 = 0
            return r0
    }

    public java.lang.String hh() {
            r1 = this;
            java.lang.String r0 = r1.xw
            return r0
    }

    public java.lang.String hl() {
            r1 = this;
            java.lang.String r0 = r1.px
            return r0
    }

    public int hu() {
            r1 = this;
            int r0 = r1.av
            return r0
    }

    public double hw() {
            r2 = this;
            r0 = 0
            return r0
    }

    public void i() {
            r0 = this;
            return
    }

    public void i(int r1) {
            r0 = this;
            r0.y = r1
            return
    }

    public void i(java.lang.String r1) {
            r0 = this;
            r0.ka = r1
            return
    }

    public long ig() {
            r2 = this;
            r0 = 0
            return r0
    }

    public double ik() {
            r2 = this;
            double r0 = r2.c
            return r0
    }

    public long im() {
            r2 = this;
            long r0 = r2.la
            return r0
    }

    public int j(com.bytedance.msdk.xt.cw r5) {
            r4 = this;
            r0 = 1
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r4.y
            int r2 = r5.wi()
            if (r1 <= r2) goto Ld
            return r0
        Ld:
            int r1 = r4.y
            int r2 = r5.wi()
            r3 = -1
            if (r1 >= r2) goto L17
            return r3
        L17:
            int r1 = r4.im
            int r2 = r5.d()
            if (r1 <= r2) goto L20
            return r0
        L20:
            int r0 = r4.im
            int r5 = r5.d()
            if (r0 >= r5) goto L29
            return r3
        L29:
            r5 = 0
            return r5
    }

    public com.bytedance.sdk.openadsdk.i.cw.xt.ae j(android.app.Activity r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void j() {
            r0 = this;
            return
    }

    public void j(double r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void j(int r1) {
            r0 = this;
            r0.qa = r1
            return
    }

    public final void j(long r6) {
            r5 = this;
            long r0 = r5.ll
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r5.ll = r6
        La:
            return
    }

    public void j(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull android.view.ViewGroup r2, java.util.List<android.view.View> r3, java.util.List<android.view.View> r4, java.util.List<android.view.View> r5, com.bytedance.msdk.api.r.j.ae.oq r6, java.util.List<android.view.View> r7) {
            r0 = this;
            if (r5 == 0) goto Lc
            if (r4 != 0) goto L9
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L9:
            r4.addAll(r5)
        Lc:
            r0.j(r2, r6)
            return
    }

    public void j(android.app.Activity r1, com.bytedance.sdk.openadsdk.kt.j.xt.j.j r2) {
            r0 = this;
            r0.fx = r2
            return
    }

    public void j(android.app.Activity r1, java.lang.Object r2, java.lang.String r3) {
            r0 = this;
            return
    }

    public void j(android.app.Dialog r1, java.lang.Integer[] r2) {
            r0 = this;
            return
    }

    public void j(android.graphics.Bitmap r1, int r2) {
            r0 = this;
            return
    }

    public void j(android.view.View r2) {
            r1 = this;
            if (r2 == 0) goto L1a
            r0 = 0
            r2.setVisibility(r0)
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L10
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r2.removeAllViews()
            return
        L10:
            boolean r0 = r2 instanceof android.widget.ImageView
            if (r0 == 0) goto L1a
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0 = 0
            r2.setImageDrawable(r0)
        L1a:
            return
    }

    public void j(android.view.ViewGroup r1) {
            r0 = this;
            return
    }

    public void j(android.view.ViewGroup r1, android.app.Activity r2) {
            r0 = this;
            return
    }

    public void j(android.view.ViewGroup r1, java.util.List<android.view.View> r2, java.util.List<android.view.View> r3, java.util.List<android.view.View> r4, java.util.List<android.view.View> r5, android.view.View r6) {
            r0 = this;
            r2 = 0
            r0.j(r1, r2)
            return
    }

    public void j(com.bytedance.msdk.api.r.j.ae.g r1) {
            r0 = this;
            r0.up = r1
            return
    }

    public void j(com.bytedance.msdk.api.r.j.ae.tl r1) {
            r0 = this;
            r0.xt = r1
            return
    }

    public void j(com.bytedance.msdk.api.r.j.ae.xt r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void j(com.bytedance.msdk.api.r.j.cw.j r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public void j(com.bytedance.msdk.api.r.j.r r1) {
            r0 = this;
            r0.r = r1
            return
    }

    public void j(com.bytedance.msdk.api.r.j.xt r2) {
            r1 = this;
            if (r2 == 0) goto L9
            com.bytedance.msdk.xt.cw$1 r0 = new com.bytedance.msdk.xt.cw$1
            r0.<init>(r1, r2)
            r1.cw = r0
        L9:
            return
    }

    public void j(com.bytedance.msdk.j.xt.m r1) {
            r0 = this;
            r0.ae = r1
            return
    }

    public void j(com.bytedance.msdk.xt.cw.j r1) {
            r0 = this;
            r0.wi = r1
            return
    }

    public void j(com.bytedance.sdk.openadsdk.f.j.xt.j.j r1) {
            r0 = this;
            return
    }

    public void j(com.bytedance.sdk.openadsdk.i.cw.j.cw r1) {
            r0 = this;
            return
    }

    public void j(com.bytedance.sdk.openadsdk.i.cw.j.xt r1) {
            r0 = this;
            return
    }

    public void j(com.bytedance.sdk.openadsdk.s.j.xt.j.cw r1) {
            r0 = this;
            return
    }

    public void j(java.lang.Object r1) {
            r0 = this;
            return
    }

    public void j(java.lang.String r1) {
            r0 = this;
            r0.xp = r1
            return
    }

    public void j(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Ld
            if (r3 == 0) goto Ld
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.qe
            r0.put(r2, r3)
        Ld:
            return
    }

    public void j(java.util.List<java.lang.String> r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<java.lang.String> r0 = r1.kt
            r0.addAll(r2)
        L7:
            return
    }

    public void j(java.util.Map<java.lang.String, java.lang.Object> r1) {
            r0 = this;
            return
    }

    public void j(boolean r1) {
            r0 = this;
            r0.ln = r1
            return
    }

    public android.graphics.Bitmap ja() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String jl() {
            r1 = this;
            java.lang.String r0 = r1.tj
            return r0
    }

    public com.bytedance.msdk.api.r.j.ae.tl jy() {
            r1 = this;
            com.bytedance.msdk.api.r.j.ae.tl r0 = r1.xt
            return r0
    }

    public void jy(int r1) {
            r0 = this;
            r0.ki = r1
            return
    }

    public void jy(java.lang.String r1) {
            r0 = this;
            r0.yl = r1
            return
    }

    public java.lang.String k() {
            r1 = this;
            java.lang.String r0 = r1.t
            return r0
    }

    public double ka() {
            r2 = this;
            double r0 = r2.gx
            return r0
    }

    public java.lang.String kc() {
            r1 = this;
            java.lang.String r0 = r1.uq
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> ki() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.ed
            return r0
    }

    public com.bytedance.sdk.openadsdk.i.cw.xt.r kk() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void kt(int r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public void kt(java.lang.String r1) {
            r0 = this;
            r0.ri = r1
            return
    }

    public boolean kt() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void l(java.lang.String r1) {
            r0 = this;
            r0.vl = r1
            return
    }

    public boolean l() {
            r1 = this;
            boolean r0 = r1.aq
            return r0
    }

    public void la(java.lang.String r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public boolean la() {
            r2 = this;
            boolean r0 = r2.ff
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            r2.ff = r1
            r0 = 0
            return r0
    }

    public boolean ll() {
            r2 = this;
            int r0 = r2.nt
            if (r0 == 0) goto Lb
            r1 = 100
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public java.lang.String ln() {
            r1 = this;
            java.lang.String r0 = r1.p
            return r0
    }

    public boolean lx() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.Integer m() {
            r1 = this;
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    public void m(int r1) {
            r0 = this;
            r0.hl = r1
            return
    }

    public void m(java.lang.String r1) {
            r0 = this;
            r0.q = r1
            return
    }

    public void m(boolean r1) {
            r0 = this;
            r0.qo = r1
            return
    }

    public com.bytedance.sdk.openadsdk.kt.j.xt.j.j mi() {
            r1 = this;
            com.bytedance.sdk.openadsdk.kt.j.xt.j.j r0 = r1.fx
            return r0
    }

    public void mi(int r1) {
            r0 = this;
            r0.ws = r1
            return
    }

    public void mi(java.lang.String r1) {
            r0 = this;
            r0.uc = r1
            return
    }

    public java.lang.String n() {
            r1 = this;
            java.lang.String r0 = r1.q
            return r0
    }

    public java.lang.String na() {
            r1 = this;
            java.lang.String r0 = r1.vl
            return r0
    }

    public boolean nd() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String nt() {
            r1 = this;
            java.lang.String r0 = r1.rn
            return r0
    }

    public int nu() {
            r1 = this;
            int r0 = r1.n
            return r0
    }

    public java.lang.String o() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int ol() {
            r1 = this;
            int r0 = r1.hl
            return r0
    }

    public int om() {
            r1 = this;
            int r0 = r1.ch
            return r0
    }

    public android.view.View oq() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void oq(int r1) {
            r0 = this;
            r0.rh = r1
            return
    }

    public void oq(java.lang.String r1) {
            r0 = this;
            r0.xw = r1
            return
    }

    public void oq(boolean r1) {
            r0 = this;
            return
    }

    public java.lang.String ov() {
            r1 = this;
            java.lang.String r0 = r1.i
            return r0
    }

    public boolean oy() {
            r2 = this;
            int r0 = r2.nt
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> p() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.kc
            return r0
    }

    public void p(java.lang.String r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public boolean px() {
            r2 = this;
            int r0 = r2.nt
            r1 = 100
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public int pz() {
            r1 = this;
            int r0 = r1.ki
            return r0
    }

    public java.lang.String q() {
            r1 = this;
            java.lang.String r0 = r1.oy
            return r0
    }

    public java.lang.String qa() {
            r1 = this;
            java.lang.String r0 = r1.ri
            return r0
    }

    public boolean qb() {
            r1 = this;
            boolean r0 = r1.wo
            return r0
    }

    public boolean qe() {
            r1 = this;
            int r0 = r1.nt
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public java.lang.String qg() {
            r1 = this;
            java.lang.String r0 = r1.oq
            return r0
    }

    public boolean qo() {
            r2 = this;
            int r0 = r2.nt
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public void qv() {
            r0 = this;
            return
    }

    public void qv(int r1) {
            r0 = this;
            r0.v = r1
            return
    }

    public void qv(java.lang.String r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public int r() {
            r1 = this;
            r0 = -1
            return r0
    }

    public void r(double r1) {
            r0 = this;
            r0.mi = r1
            return
    }

    public void r(int r1) {
            r0 = this;
            r0.xq = r1
            return
    }

    public void r(java.lang.String r1) {
            r0 = this;
            r0.ya = r1
            return
    }

    public void r(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            int r0 = r2.size()
            if (r0 <= 0) goto Ld
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.qe
            r0.putAll(r2)
        Ld:
            return
    }

    public void r(boolean r1) {
            r0 = this;
            r0.sm = r1
            return
    }

    public int rh() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> ri() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.uf
            return r0
    }

    public void rn(java.lang.String r1) {
            r0 = this;
            r0.tj = r1
            return
    }

    public boolean rn() {
            r2 = this;
            boolean r0 = r2.zz
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            r2.zz = r1
            r0 = 0
            return r0
    }

    public int rr() {
            r1 = this;
            int r0 = r1.x
            return r0
    }

    public double rs() {
            r2 = this;
            double r0 = r2.mi
            return r0
    }

    public java.lang.String ry() {
            r1 = this;
            java.lang.String r0 = r1.ka
            return r0
    }

    public int s() {
            r1 = this;
            int r0 = r1.st
            return r0
    }

    public void s(java.lang.String r1) {
            r0 = this;
            r0.wq = r1
            return
    }

    public void sf() {
            r0 = this;
            return
    }

    public final long sm() {
            r2 = this;
            long r0 = r2.ll
            return r0
    }

    public int st() {
            r1 = this;
            int r0 = r1.v
            return r0
    }

    public double t() {
            r5 = this;
            boolean r0 = r5.qo()     // Catch: java.lang.NumberFormatException -> L16
            if (r0 == 0) goto L18
            double r0 = r5.ik()     // Catch: java.lang.NumberFormatException -> L16
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L11
            return r2
        L11:
            double r0 = r5.ik()     // Catch: java.lang.NumberFormatException -> L16
            return r0
        L16:
            r0 = move-exception
            goto L33
        L18:
            boolean r0 = r5.oy()     // Catch: java.lang.NumberFormatException -> L16
            if (r0 != 0) goto L24
            boolean r0 = r5.yl()     // Catch: java.lang.NumberFormatException -> L16
            if (r0 == 0) goto L36
        L24:
            double r0 = r5.f     // Catch: java.lang.NumberFormatException -> L16
            java.lang.String r2 = r5.t     // Catch: java.lang.NumberFormatException -> L16
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L16
            double r2 = r2.doubleValue()     // Catch: java.lang.NumberFormatException -> L16
            double r0 = r0 * r2
            return r0
        L33:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L36:
            double r0 = r5.f
            return r0
    }

    public java.lang.String tj() {
            r1 = this;
            java.lang.String r0 = r1.xp
            return r0
    }

    public void tj(int r1) {
            r0 = this;
            r0.az = r1
            return
    }

    public void tj(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public java.util.List<java.lang.String> tk() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.kt
            return r0
    }

    public int tl(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.z
            boolean r2 = android.text.TextUtils.equals(r2, r0)
            if (r2 == 0) goto Lb
            int r2 = r1.ol
            return r2
        Lb:
            int r2 = r1.nd
            return r2
    }

    public com.bytedance.msdk.api.r.j.ae.up tl() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void tl(int r1) {
            r0 = this;
            r0.hh = r1
            return
    }

    public void tl(boolean r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public java.lang.String u() {
            r5 = this;
            boolean r0 = r5.qo()
            if (r0 == 0) goto L1c
            double r0 = r5.ik()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L13
            java.lang.String r0 = "-1"
            return r0
        L13:
            double r0 = r5.ik()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L1c:
            double r0 = r5.t()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    public java.lang.String uc() {
            r1 = this;
            java.lang.String r0 = r1.wq
            return r0
    }

    public void uf(java.lang.String r1) {
            r0 = this;
            return
    }

    public boolean uf() {
            r1 = this;
            boolean r0 = r1.sm
            return r0
    }

    public void up(int r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void up(java.lang.String r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void up(java.util.Map<java.lang.String, java.lang.String> r1) {
            r0 = this;
            r0.uf = r1
            return
    }

    public void up(boolean r1) {
            r0 = this;
            r0.wo = r1
            return
    }

    public abstract boolean up();

    public double uq() {
            r5 = this;
            boolean r0 = r5.qo()
            if (r0 == 0) goto L16
            double r0 = r5.ik()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L11
            return r2
        L11:
            double r0 = r5.ik()
            return r0
        L16:
            double r0 = r5.f
            return r0
    }

    public java.lang.String v() {
            r1 = this;
            java.lang.String r0 = r1.wf
            return r0
    }

    public void v(int r1) {
            r0 = this;
            return
    }

    public void v(java.lang.String r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public com.bytedance.msdk.api.r.j.ae.xt vl() {
            r1 = this;
            com.bytedance.msdk.api.r.j.ae.xt r0 = r1.j
            return r0
    }

    public void vl(int r1) {
            r0 = this;
            r0.x = r1
            return
    }

    public void vl(java.lang.String r1) {
            r0 = this;
            r0.px = r1
            return
    }

    public void w() {
            r1 = this;
            r0 = 0
            r1.j = r0
            r1.xt = r0
            r1.cw = r0
            return
    }

    public void w(int r1) {
            r0 = this;
            r0.jy = r1
            return
    }

    public void w(java.lang.String r1) {
            r0 = this;
            r0.uq = r1
            return
    }

    public boolean wf() {
            r6 = this;
            java.lang.String r0 = r6.p
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.String r0 = r6.h
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L13
            return r1
        L13:
            long r2 = r6.la
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1c
            return r1
        L1c:
            java.lang.String r0 = r6.gq
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L25
            return r1
        L25:
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.uf
            if (r0 == 0) goto L30
            int r0 = r0.size()
            if (r0 <= 0) goto L30
            return r1
        L30:
            java.lang.String r0 = r6.rn
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L39
            return r1
        L39:
            java.lang.String r0 = r6.wq
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L42
            return r1
        L42:
            java.lang.String r0 = r6.px
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L4b
            return r1
        L4b:
            r0 = 0
            return r0
    }

    public int wi() {
            r1 = this;
            int r0 = r1.y
            return r0
    }

    public java.lang.String wo() {
            r5 = this;
            boolean r0 = r5.qo()
            if (r0 == 0) goto L1c
            double r0 = r5.ka()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L13
            java.lang.String r0 = "-1"
            return r0
        L13:
            double r0 = r5.ka()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L1c:
            double r0 = r5.t()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    public int wq() {
            r1 = this;
            int r0 = r1.xq
            return r0
    }

    public final boolean wq(java.lang.String r5) {
            r4 = this;
            java.lang.Integer r0 = r4.m()
            int r1 = r0.intValue()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L18
            com.bytedance.msdk.core.up.j.j r0 = com.bytedance.msdk.core.up.j.j.j()
            boolean r5 = r0.j(r5, r4)
            if (r5 != 0) goto L17
            return r3
        L17:
            return r2
        L18:
            int r5 = r0.intValue()
            r0 = 2
            if (r5 != r0) goto L20
            return r3
        L20:
            return r2
    }

    public com.bytedance.msdk.api.r.j.xt ws() {
            r1 = this;
            com.bytedance.msdk.api.r.j.xt r0 = r1.cw
            return r0
    }

    public void ws(int r1) {
            r0 = this;
            r0.ch = r1
            return
    }

    public void ws(java.lang.String r1) {
            r0 = this;
            r0.oy = r1
            return
    }

    public int x() {
            r1 = this;
            int r0 = r1.qa
            return r0
    }

    public void x(java.lang.String r1) {
            r0 = this;
            r0.gq = r1
            return
    }

    public java.lang.String xp() {
            r1 = this;
            java.lang.String r0 = r1.h
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> xq() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.tk
            return r0
    }

    public com.bytedance.sdk.openadsdk.i.cw.xt.ae xt(android.app.Dialog r1, java.lang.Integer[] r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void xt() {
            r0 = this;
            return
    }

    public void xt(double r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void xt(int r1) {
            r0 = this;
            r0.pz = r1
            return
    }

    public void xt(long r1) {
            r0 = this;
            r0.la = r1
            return
    }

    public void xt(android.app.Activity r1) {
            r0 = this;
            return
    }

    public void xt(android.view.View r3) {
            r2 = this;
            if (r3 == 0) goto L16
            android.view.ViewParent r0 = r3.getParent()     // Catch: java.lang.Exception -> L12
            if (r0 == 0) goto L16
            boolean r1 = r0 instanceof android.view.ViewGroup     // Catch: java.lang.Exception -> L12
            if (r1 == 0) goto L16
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch: java.lang.Exception -> L12
            r0.removeView(r3)     // Catch: java.lang.Exception -> L12
            return
        L12:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L16:
            return
    }

    public void xt(com.bytedance.msdk.j.xt.m r1) {
            r0 = this;
            r0.tl = r1
            return
    }

    public void xt(java.lang.String r1) {
            r0 = this;
            r0.wf = r1
            return
    }

    public void xt(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Ld
            if (r3 == 0) goto Ld
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.tk
            r0.put(r2, r3)
        Ld:
            return
    }

    public void xt(java.util.Map<java.lang.String, java.lang.Object> r1) {
            r0 = this;
            return
    }

    public void xt(boolean r1) {
            r0 = this;
            r0.rr = r1
            return
    }

    public int xw() {
            r1 = this;
            int r0 = r1.nt
            return r0
    }

    public java.lang.String y() {
            r1 = this;
            java.lang.String r0 = r1.gq
            return r0
    }

    public boolean ya() {
            r1 = this;
            boolean r0 = r1.qo
            return r0
    }

    public long yb() {
            r2 = this;
            r0 = 0
            return r0
    }

    public boolean yl() {
            r2 = this;
            int r0 = r2.nt
            r1 = 3
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public com.bytedance.msdk.j.xt.m ym() {
            r1 = this;
            com.bytedance.msdk.j.xt.m r0 = r1.ae
            return r0
    }

    public com.bytedance.msdk.xt.cw.j yu() {
            r1 = this;
            com.bytedance.msdk.xt.cw$j r0 = r1.wi
            return r0
    }

    public java.lang.String z() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    public com.bytedance.sdk.openadsdk.i.cw.xt.vl zk() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String zs() {
            r1 = this;
            java.lang.String r0 = r1.g
            return r0
    }

    public java.lang.String zz() {
            r1 = this;
            java.lang.String r0 = r1.ik
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = r1.ka
            return r0
        Lb:
            java.lang.String r0 = r1.ik
            return r0
    }
}
