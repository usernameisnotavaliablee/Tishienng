package cn.jpush.android.w;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f1997b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.Map<java.lang.String, java.lang.Object> f1998c;

    /* renamed from: d, reason: collision with root package name */
    private int f1999d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2000e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2001f;

    /* renamed from: g, reason: collision with root package name */
    private int f2002g;

    /* renamed from: h, reason: collision with root package name */
    private int f2003h;

    public d() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f2002g = r0
            r1.f2003h = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f1998c = r0
            return
    }

    public d(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f2002g = r0
            r1.f2003h = r0
            r1.a = r2
            r2 = 0
            r1.f1999d = r2
            r1.f2000e = r2
            r1.f2001f = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f1998c = r2
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.f1997b
            return r0
    }

    public void a(int r1) {
            r0 = this;
            r0.f2002g = r1
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.f1997b = r1
            return
    }

    public void a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f1998c
            if (r0 == 0) goto L7
            r0.put(r2, r3)
        L7:
            return
    }

    public int b() {
            r1 = this;
            int r0 = r1.f2002g
            return r0
    }

    public void b(int r1) {
            r0 = this;
            r0.f2003h = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HttpResponse{responseBody='"
            r0.append(r1)
            java.lang.String r1 = r2.f1997b
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", responseCode="
            r0.append(r1)
            int r1 = r2.f2002g
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
