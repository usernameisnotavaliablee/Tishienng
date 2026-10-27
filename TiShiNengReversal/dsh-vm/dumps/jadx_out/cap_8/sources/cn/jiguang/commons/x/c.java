package cn.jiguang.commons.x;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private java.lang.String a;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f1209c;

    /* renamed from: d, reason: collision with root package name */
    private int f1210d;

    /* renamed from: e, reason: collision with root package name */
    private int f1211e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.Map f1212f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f1213g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1214h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.Object f1215i;

    /* renamed from: j, reason: collision with root package name */
    private javax.net.ssl.X509TrustManager f1216j;

    /* renamed from: k, reason: collision with root package name */
    private javax.net.ssl.HostnameVerifier f1217k;

    public c(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f1214h = r0
            r1.a = r2
            r2 = -1
            r1.f1210d = r2
            r1.f1211e = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f1212f = r2
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.f1210d
            return r0
    }

    public void a(int r2) {
            r1 = this;
            if (r2 < 0) goto L5
            r1.f1210d = r2
            return
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "timeout can not be negative"
            r2.<init>(r0)
            throw r2
    }

    public void a(java.lang.Object r1) {
            r0 = this;
            r0.f1215i = r1
            return
    }

    public void a(java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r2 = 0
        L3:
            r1.f1213g = r2
            return
        L6:
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r2.getBytes(r0)     // Catch: java.lang.Exception -> Lf
            r1.f1213g = r0     // Catch: java.lang.Exception -> Lf
            return
        Lf:
            byte[] r2 = r2.getBytes()
            goto L3
    }

    public void a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.Map r0 = r1.f1212f
            r0.put(r2, r3)
            return
    }

    public void a(java.util.Map r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.Map r0 = r1.f1212f
            r0.putAll(r2)
        L7:
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.f1214h = r1
            return
    }

    public void a(byte[] r1) {
            r0 = this;
            r0.f1213g = r1
            return
    }

    public javax.net.ssl.HostnameVerifier c() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.f1217k
            return r0
    }

    public void c(int r2) {
            r1 = this;
            if (r2 < 0) goto L5
            r1.f1211e = r2
            return
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "timeout can not be negative"
            r2.<init>(r0)
            throw r2
    }

    public void c(java.lang.String r1) {
            r0 = this;
            r0.f1209c = r1
            return
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.f1209c
            return r0
    }

    java.lang.Object e() {
            r1 = this;
            java.lang.Object r0 = r1.f1215i
            return r0
    }

    public int f() {
            r1 = this;
            int r0 = r1.f1211e
            return r0
    }

    public byte[] g() {
            r1 = this;
            byte[] r0 = r1.f1213g
            return r0
    }

    public java.util.Map h() {
            r1 = this;
            java.util.Map r0 = r1.f1212f
            return r0
    }

    public javax.net.ssl.X509TrustManager i() {
            r1 = this;
            javax.net.ssl.X509TrustManager r0 = r1.f1216j
            return r0
    }

    public java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public boolean k() {
            r1 = this;
            boolean r0 = r1.f1214h
            return r0
    }
}
