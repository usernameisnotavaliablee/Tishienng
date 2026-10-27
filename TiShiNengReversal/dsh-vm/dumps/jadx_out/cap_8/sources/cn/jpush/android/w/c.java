package cn.jpush.android.w;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f1987b;

    /* renamed from: c, reason: collision with root package name */
    private int f1988c;

    /* renamed from: d, reason: collision with root package name */
    private int f1989d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.Map<java.lang.String, java.lang.String> f1990e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.Map<java.lang.String, java.lang.String> f1991f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.Object f1992g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1993h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1994i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1995j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1996k;
    private javax.net.ssl.X509TrustManager l;
    private javax.net.ssl.HostnameVerifier m;

    public c(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f1994i = r0
            r0 = 0
            r1.f1995j = r0
            r1.f1996k = r0
            r1.a = r2
            r2 = -1
            r1.f1988c = r2
            r1.f1989d = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f1991f = r2
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public void a(java.lang.Object r1) {
            r0 = this;
            r0.f1992g = r1
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.f1987b = r1
            return
    }

    public void a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f1991f
            r0.put(r2, r3)
            return
    }

    public int b() {
            r1 = this;
            int r0 = r1.f1988c
            return r0
    }

    public int c() {
            r1 = this;
            int r0 = r1.f1989d
            return r0
    }

    public boolean d() {
            r1 = this;
            boolean r0 = r1.f1993h
            return r0
    }

    public boolean e() {
            r1 = this;
            boolean r0 = r1.f1996k
            return r0
    }

    public javax.net.ssl.X509TrustManager f() {
            r1 = this;
            javax.net.ssl.X509TrustManager r0 = r1.l
            return r0
    }

    public javax.net.ssl.HostnameVerifier g() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.m
            return r0
    }

    public byte[] h() {
            r2 = this;
            java.lang.Object r0 = r2.f1992g
            if (r0 == 0) goto L20
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L19
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L20
            java.lang.Object r0 = r2.f1992g
            java.lang.String r0 = (java.lang.String) r0
            byte[] r0 = r0.getBytes()
            return r0
        L19:
            boolean r1 = r0 instanceof byte[]
            if (r1 == 0) goto L20
            byte[] r0 = (byte[]) r0
            return r0
        L20:
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f1990e
            java.lang.String r0 = cn.jpush.android.w.e.a(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L31
            byte[] r0 = r0.getBytes()
            return r0
        L31:
            r0 = 0
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> i() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f1991f
            return r0
    }

    public boolean j() {
            r1 = this;
            boolean r0 = r1.f1994i
            return r0
    }

    public boolean k() {
            r1 = this;
            boolean r0 = r1.f1995j
            return r0
    }

    public java.lang.String l() {
            r1 = this;
            java.lang.String r0 = r1.f1987b
            return r0
    }
}
