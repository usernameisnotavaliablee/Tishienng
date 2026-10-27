package com.beizi.ad.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    static java.util.HashSet<java.lang.String> a;

    /* renamed from: b, reason: collision with root package name */
    private com.beizi.ad.internal.k f6708b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f6709c;

    /* renamed from: d, reason: collision with root package name */
    private int f6710d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6711e;

    /* renamed from: f, reason: collision with root package name */
    private int f6712f;

    /* renamed from: g, reason: collision with root package name */
    private int f6713g;

    /* renamed from: h, reason: collision with root package name */
    private int f6714h;

    /* renamed from: i, reason: collision with root package name */
    private int f6715i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f6716j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6717k;
    private boolean l;
    private boolean m;
    private java.lang.ref.WeakReference<android.content.Context> n;
    private java.lang.String o;

    static {
            return
    }

    public e(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            com.beizi.ad.internal.k r0 = com.beizi.ad.internal.k.f7006h
            r2.f6708b = r0
            r0 = 3
            r2.f6710d = r0
            r0 = 0
            r2.f6711e = r0
            r1 = -1
            r2.f6712f = r1
            r2.f6713g = r1
            r2.f6714h = r1
            r2.f6715i = r1
            r2.f6717k = r0
            r2.l = r0
            r2.m = r0
            java.lang.String r0 = ""
            r2.o = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.n = r0
            r2.o = r4
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.o
            return r0
    }

    public void a(int r1) {
            r0 = this;
            r0.f6712f = r1
            return
    }

    public void a(com.beizi.ad.internal.k r1) {
            r0 = this;
            r0.f6708b = r1
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.o = r1
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.f6717k = r1
            return
    }

    public android.content.Context b() {
            r1 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r1.n
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L11
            java.lang.ref.WeakReference<android.content.Context> r0 = r1.n
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            return r0
        L11:
            r0 = 0
            return r0
    }

    public void b(int r1) {
            r0 = this;
            r0.f6713g = r1
            return
    }

    public void b(java.lang.String r1) {
            r0 = this;
            r0.f6709c = r1
            return
    }

    public void b(boolean r1) {
            r0 = this;
            r0.f6711e = r1
            return
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.f6709c
            return r0
    }

    public void c(int r1) {
            r0 = this;
            r0.f6714h = r1
            return
    }

    public void c(boolean r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public int d() {
            r2 = this;
            com.beizi.ad.internal.k r0 = r2.f6708b
            com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.f7002d
            if (r0 != r1) goto L9
            int r0 = r2.f6712f
            return r0
        L9:
            r0 = -1
            return r0
    }

    public void d(int r1) {
            r0 = this;
            r0.f6715i = r1
            return
    }

    public int e() {
            r2 = this;
            com.beizi.ad.internal.k r0 = r2.f6708b
            com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.f7002d
            if (r0 != r1) goto L9
            int r0 = r2.f6713g
            return r0
        L9:
            r0 = -1
            return r0
    }

    public int f() {
            r1 = this;
            int r0 = r1.f6714h
            return r0
    }

    public int g() {
            r1 = this;
            int r0 = r1.f6715i
            return r0
    }

    public boolean h() {
            r1 = this;
            boolean r0 = r1.f6711e
            return r0
    }

    public com.beizi.ad.internal.k i() {
            r1 = this;
            com.beizi.ad.internal.k r0 = r1.f6708b
            return r0
    }

    public boolean j() {
            r1 = this;
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()
            java.lang.String r0 = r0.d()
            boolean r0 = com.beizi.ad.internal.h.o.a(r0)
            if (r0 != 0) goto L19
            java.lang.String r0 = r1.f6709c
            boolean r0 = com.beizi.ad.internal.h.o.a(r0)
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = 1
            return r0
        L19:
            r0 = 0
            return r0
    }

    public java.lang.String k() {
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            android.content.Context r1 = r7.b()     // Catch: org.json.JSONException -> La7
            android.content.res.Resources r1 = r1.getResources()     // Catch: org.json.JSONException -> La7
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: org.json.JSONException -> La7
            int r1 = r1.orientation     // Catch: org.json.JSONException -> La7
            r2 = 2
            if (r1 != r2) goto L19
            java.lang.String r1 = "h"
            goto L1b
        L19:
            java.lang.String r1 = "v"
        L1b:
            r7.f6716j = r1     // Catch: org.json.JSONException -> La7
            boolean r1 = com.beizi.ad.internal.h.o.a(r1)     // Catch: org.json.JSONException -> La7
            if (r1 != 0) goto L2a
            java.lang.String r1 = "mOrientation"
            java.lang.String r2 = r7.f6716j     // Catch: org.json.JSONException -> La7
            r0.put(r1, r2)     // Catch: org.json.JSONException -> La7
        L2a:
            int r1 = r7.f6712f     // Catch: org.json.JSONException -> La7
            java.lang.String r2 = "size"
            java.lang.String r3 = "x"
            if (r1 <= 0) goto L4f
            int r1 = r7.f6713g     // Catch: org.json.JSONException -> La7
            if (r1 <= 0) goto L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> La7
            r1.<init>()     // Catch: org.json.JSONException -> La7
            int r4 = r7.f6712f     // Catch: org.json.JSONException -> La7
            r1.append(r4)     // Catch: org.json.JSONException -> La7
            r1.append(r3)     // Catch: org.json.JSONException -> La7
            int r4 = r7.f6713g     // Catch: org.json.JSONException -> La7
            r1.append(r4)     // Catch: org.json.JSONException -> La7
            java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> La7
            r0.put(r2, r1)     // Catch: org.json.JSONException -> La7
        L4f:
            int r1 = r7.g()     // Catch: org.json.JSONException -> La7
            int r4 = r7.f()     // Catch: org.json.JSONException -> La7
            if (r1 <= 0) goto La2
            if (r4 <= 0) goto La2
            com.beizi.ad.internal.k r5 = r7.f6708b     // Catch: org.json.JSONException -> La7
            com.beizi.ad.internal.k r6 = com.beizi.ad.internal.k.f7003e     // Catch: org.json.JSONException -> La7
            boolean r5 = r5.equals(r6)     // Catch: org.json.JSONException -> La7
            if (r5 != 0) goto L85
            int r5 = r7.f6712f     // Catch: org.json.JSONException -> La7
            if (r5 < 0) goto L6d
            int r5 = r7.f6713g     // Catch: org.json.JSONException -> La7
            if (r5 >= 0) goto L85
        L6d:
            java.lang.String r2 = "max_size"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> La7
            r5.<init>()     // Catch: org.json.JSONException -> La7
            r5.append(r4)     // Catch: org.json.JSONException -> La7
            r5.append(r3)     // Catch: org.json.JSONException -> La7
            r5.append(r1)     // Catch: org.json.JSONException -> La7
            java.lang.String r1 = r5.toString()     // Catch: org.json.JSONException -> La7
            r0.put(r2, r1)     // Catch: org.json.JSONException -> La7
            goto La2
        L85:
            com.beizi.ad.internal.k r5 = r7.f6708b     // Catch: org.json.JSONException -> La7
            boolean r5 = r5.equals(r6)     // Catch: org.json.JSONException -> La7
            if (r5 == 0) goto La2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> La7
            r5.<init>()     // Catch: org.json.JSONException -> La7
            r5.append(r4)     // Catch: org.json.JSONException -> La7
            r5.append(r3)     // Catch: org.json.JSONException -> La7
            r5.append(r1)     // Catch: org.json.JSONException -> La7
            java.lang.String r1 = r5.toString()     // Catch: org.json.JSONException -> La7
            r0.put(r2, r1)     // Catch: org.json.JSONException -> La7
        La2:
            java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> La7
            return r0
        La7:
            java.lang.String r0 = ""
            return r0
    }

    public boolean l() {
            r1 = this;
            boolean r0 = r1.m
            return r0
    }
}
