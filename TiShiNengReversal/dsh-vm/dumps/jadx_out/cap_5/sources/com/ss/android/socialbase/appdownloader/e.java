package com.ss.android.socialbase.appdownloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e {
    private boolean A;
    private int B;
    private int C;
    private boolean D;
    private java.lang.String E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private com.ss.android.socialbase.downloader.xt.ae J;
    private int K;
    private int L;
    private boolean M;
    private com.ss.android.socialbase.downloader.r.l N;
    private com.ss.android.socialbase.downloader.r.az O;
    private w2.h P;
    private com.ss.android.socialbase.downloader.r.tj Q;
    private com.ss.android.socialbase.downloader.r.mi R;
    private boolean S;
    private com.ss.android.socialbase.downloader.r.wq T;
    private boolean U;
    private org.json.JSONObject V;
    private java.lang.String W;
    private java.util.List<com.ss.android.socialbase.downloader.r.ws> X;
    private int Y;
    private long Z;
    private android.app.Activity a;
    private int a0;
    private android.content.Context b;
    private boolean b0;
    private java.lang.String c;
    private boolean c0;
    private java.util.List<java.lang.String> d;
    private java.lang.String d0;
    private java.lang.String e;
    private boolean e0;
    private java.lang.String f;
    private java.lang.String f0;
    private java.lang.String g;
    private int[] g0;
    private java.util.List<com.ss.android.socialbase.downloader.ae.up> h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private com.ss.android.socialbase.downloader.r.a m;
    private com.ss.android.socialbase.downloader.r.a n;
    private java.lang.String o;
    private java.lang.String p;
    private boolean q;
    private com.ss.android.socialbase.downloader.downloader.g r;
    private com.ss.android.socialbase.downloader.downloader.oq s;
    private com.ss.android.socialbase.downloader.downloader.kt t;
    private com.ss.android.socialbase.downloader.notification.j u;
    private boolean v;
    private boolean w;
    private java.lang.String x;
    private java.lang.String y;
    private long z;

    public e(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull java.lang.String r4) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.i = r0
            r1 = 0
            r2.j = r1
            r2.k = r0
            r2.l = r1
            java.lang.String r1 = "application/vnd.android.package-archive"
            r2.p = r1
            r1 = 5
            r2.B = r1
            r2.F = r0
            com.ss.android.socialbase.downloader.xt.ae r1 = com.ss.android.socialbase.downloader.xt.ae.j
            r2.J = r1
            r1 = 150(0x96, float:2.1E-43)
            r2.K = r1
            r2.M = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.X = r1
            r2.c0 = r0
            r2.e0 = r0
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r2.b = r3
            r2.c = r4
            return
    }

    public java.lang.String A() {
            r1 = this;
            java.lang.String r0 = r1.d0
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e A0(int r1) {
            r0 = this;
            r0.L = r1
            return r0
    }

    public boolean B() {
            r1 = this;
            boolean r0 = r1.v
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e B0(java.lang.String r1) {
            r0 = this;
            r0.o = r1
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e C(long r1) {
            r0 = this;
            r0.z = r1
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e C0(boolean r1) {
            r0 = this;
            r0.v = r1
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e D(com.ss.android.socialbase.downloader.r.a r1) {
            r0 = this;
            r0.m = r1
            return r0
    }

    public boolean D0() {
            r1 = this;
            boolean r0 = r1.i
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e E(com.ss.android.socialbase.downloader.r.mi r1) {
            r0 = this;
            r0.R = r1
            return r0
    }

    public int E0() {
            r1 = this;
            int r0 = r1.B
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e F(com.ss.android.socialbase.downloader.r.tj r1) {
            r0 = this;
            r0.Q = r1
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e F0(boolean r1) {
            r0 = this;
            r0.I = r1
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e G(com.ss.android.socialbase.downloader.r.ws r3) {
            r2 = this;
            java.util.List<com.ss.android.socialbase.downloader.r.ws> r0 = r2.X
            monitor-enter(r0)
            if (r3 == 0) goto L17
            java.util.List<com.ss.android.socialbase.downloader.r.ws> r1 = r2.X     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto Le
            goto L17
        Le:
            java.util.List<com.ss.android.socialbase.downloader.r.ws> r1 = r2.X     // Catch: java.lang.Throwable -> L15
            r1.add(r3)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r2
        L15:
            r3 = move-exception
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r2
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    public java.lang.String G0() {
            r1 = this;
            java.lang.String r0 = r1.p
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e H(com.ss.android.socialbase.downloader.xt.ae r1) {
            r0 = this;
            r0.J = r1
            return r0
    }

    public boolean H0() {
            r1 = this;
            boolean r0 = r1.w
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e I(java.lang.String r1) {
            r0 = this;
            r0.e = r1
            return r0
    }

    public boolean I0() {
            r1 = this;
            boolean r0 = r1.M
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e J(java.util.List<com.ss.android.socialbase.downloader.ae.up> r1) {
            r0 = this;
            r0.h = r1
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e J0(boolean r1) {
            r0 = this;
            r0.A = r1
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e K(org.json.JSONObject r1) {
            r0 = this;
            r0.V = r1
            return r0
    }

    public com.ss.android.socialbase.downloader.notification.j K0() {
            r1 = this;
            com.ss.android.socialbase.downloader.notification.j r0 = r1.u
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e L(boolean r1) {
            r0 = this;
            r0.i = r1
            return r0
    }

    public int L0() {
            r1 = this;
            int r0 = r1.C
            return r0
    }

    public java.lang.String M() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public boolean M0() {
            r1 = this;
            boolean r0 = r1.b0
            return r0
    }

    public void N(int r1) {
            r0 = this;
            r0.a0 = r1
            return
    }

    public com.ss.android.socialbase.appdownloader.e N0(int r1) {
            r0 = this;
            r0.B = r1
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e O(boolean r1) {
            r0 = this;
            r0.M = r1
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e O0(java.lang.String r1) {
            r0 = this;
            r0.f = r1
            return r0
    }

    public boolean P() {
            r1 = this;
            boolean r0 = r1.q
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e P0(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.d = r1
            return r0
    }

    public boolean Q() {
            r1 = this;
            boolean r0 = r1.c0
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e Q0(boolean r1) {
            r0 = this;
            r0.j = r1
            return r0
    }

    public org.json.JSONObject R() {
            r1 = this;
            org.json.JSONObject r0 = r1.V
            return r0
    }

    public java.lang.String R0() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    public java.lang.String S() {
            r1 = this;
            java.lang.String r0 = r1.x
            return r0
    }

    public java.lang.String S0() {
            r1 = this;
            java.lang.String r0 = r1.f0
            return r0
    }

    public boolean T() {
            r1 = this;
            boolean r0 = r1.G
            return r0
    }

    public java.util.List<com.ss.android.socialbase.downloader.r.ws> T0() {
            r1 = this;
            java.util.List<com.ss.android.socialbase.downloader.r.ws> r0 = r1.X
            return r0
    }

    public int U() {
            r1 = this;
            int r0 = r1.L
            return r0
    }

    public com.ss.android.socialbase.downloader.r.mi U0() {
            r1 = this;
            com.ss.android.socialbase.downloader.r.mi r0 = r1.R
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e V(int r1) {
            r0 = this;
            r0.Y = r1
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e W(java.lang.String r1) {
            r0 = this;
            r0.p = r1
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e X(boolean r1) {
            r0 = this;
            r0.w = r1
            return r0
    }

    public boolean Y() {
            r1 = this;
            boolean r0 = r1.j
            return r0
    }

    public int Z() {
            r1 = this;
            int r0 = r1.a0
            return r0
    }

    public boolean a() {
            r1 = this;
            boolean r0 = r1.F
            return r0
    }

    public com.ss.android.socialbase.downloader.r.l a0() {
            r1 = this;
            com.ss.android.socialbase.downloader.r.l r0 = r1.N
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e b(java.lang.String r1) {
            r0 = this;
            r0.x = r1
            return r0
    }

    public com.ss.android.socialbase.downloader.r.az b0() {
            r1 = this;
            com.ss.android.socialbase.downloader.r.az r0 = r1.O
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e c(boolean r1) {
            r0 = this;
            r0.D = r1
            return r0
    }

    public com.ss.android.socialbase.downloader.r.tj c0() {
            r1 = this;
            com.ss.android.socialbase.downloader.r.tj r0 = r1.Q
            return r0
    }

    public boolean d() {
            r1 = this;
            boolean r0 = r1.k
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e d0(java.lang.String r1) {
            r0 = this;
            r0.f0 = r1
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e e(boolean r1) {
            r0 = this;
            r0.c0 = r1
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e e0(boolean r1) {
            r0 = this;
            r0.G = r1
            return r0
    }

    public com.ss.android.socialbase.downloader.downloader.g f() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.g r0 = r1.r
            return r0
    }

    public com.ss.android.socialbase.downloader.r.a f0() {
            r1 = this;
            com.ss.android.socialbase.downloader.r.a r0 = r1.n
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e g(boolean r1) {
            r0 = this;
            r0.b0 = r1
            return r0
    }

    public com.ss.android.socialbase.downloader.downloader.kt g0() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.kt r0 = r1.t
            return r0
    }

    public android.app.Activity getActivity() {
            r1 = this;
            android.app.Activity r0 = r1.a
            return r0
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.b
            return r0
    }

    public com.ss.android.socialbase.downloader.downloader.oq h() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.oq r0 = r1.s
            return r0
    }

    public long h0() {
            r2 = this;
            long r0 = r2.Z
            return r0
    }

    public boolean i() {
            r1 = this;
            boolean r0 = r1.U
            return r0
    }

    public boolean i0() {
            r1 = this;
            boolean r0 = r1.e0
            return r0
    }

    public boolean j() {
            r1 = this;
            boolean r0 = r1.A
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e j0(java.lang.String r1) {
            r0 = this;
            r0.W = r1
            return r0
    }

    public boolean k() {
            r1 = this;
            boolean r0 = r1.D
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e k0(boolean r1) {
            r0 = this;
            r0.H = r1
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e l(int r1) {
            r0 = this;
            r0.C = r1
            return r0
    }

    public java.lang.String l0() {
            r1 = this;
            java.lang.String r0 = r1.o
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e m(@androidx.annotation.NonNull java.lang.String r1) {
            r0 = this;
            r0.g = r1
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e m0(int r1) {
            r0 = this;
            r0.K = r1
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e n(boolean r1) {
            r0 = this;
            r0.l = r1
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e n0(java.lang.String r1) {
            r0 = this;
            r0.d0 = r1
            return r0
    }

    public java.lang.String o() {
            r1 = this;
            java.lang.String r0 = r1.g
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e o0(boolean r1) {
            r0 = this;
            r0.q = r1
            return r0
    }

    public int p() {
            r1 = this;
            int r0 = r1.Y
            return r0
    }

    public java.util.List<com.ss.android.socialbase.downloader.ae.up> p0() {
            r1 = this;
            java.util.List<com.ss.android.socialbase.downloader.ae.up> r0 = r1.h
            return r0
    }

    public com.ss.android.socialbase.downloader.xt.ae q() {
            r1 = this;
            com.ss.android.socialbase.downloader.xt.ae r0 = r1.J
            return r0
    }

    public w2.h q0() {
            r1 = this;
            w2.h r0 = r1.P
            return r0
    }

    public long r() {
            r2 = this;
            long r0 = r2.z
            return r0
    }

    public boolean r0() {
            r1 = this;
            boolean r0 = r1.I
            return r0
    }

    public java.lang.String s() {
            r1 = this;
            java.lang.String r0 = r1.W
            return r0
    }

    public java.util.List<java.lang.String> s0() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.d
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e t(java.lang.String r1) {
            r0 = this;
            r0.E = r1
            return r0
    }

    public java.lang.String t0() {
            r1 = this;
            java.lang.String r0 = r1.E
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e u(boolean r1) {
            r0 = this;
            r0.F = r1
            return r0
    }

    public int[] u0() {
            r1 = this;
            int[] r0 = r1.g0
            return r0
    }

    public com.ss.android.socialbase.downloader.r.a v() {
            r1 = this;
            com.ss.android.socialbase.downloader.r.a r0 = r1.m
            return r0
    }

    public java.lang.String v0() {
            r1 = this;
            java.lang.String r0 = r1.y
            return r0
    }

    public boolean w() {
            r1 = this;
            boolean r0 = r1.H
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e w0(java.lang.String r1) {
            r0 = this;
            r0.y = r1
            return r0
    }

    public java.lang.String x() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    public com.ss.android.socialbase.appdownloader.e x0(boolean r1) {
            r0 = this;
            r0.S = r1
            return r0
    }

    public int y() {
            r1 = this;
            int r0 = r1.K
            return r0
    }

    public boolean y0() {
            r1 = this;
            boolean r0 = r1.l
            return r0
    }

    public com.ss.android.socialbase.downloader.r.wq z() {
            r1 = this;
            com.ss.android.socialbase.downloader.r.wq r0 = r1.T
            return r0
    }

    public boolean z0() {
            r1 = this;
            boolean r0 = r1.S
            return r0
    }
}
