package cn.jiguang.commons.x;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    private java.lang.String a;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f1218c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f1219d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.Map f1220e;

    /* renamed from: f, reason: collision with root package name */
    private int f1221f;

    public d() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f1221f = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f1220e = r0
            return
    }

    public d(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f1221f = r0
            r1.a = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f1220e = r2
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.f1218c
            return r0
    }

    public void a(int r1) {
            r0 = this;
            r0.f1221f = r1
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.f1218c = r1
            return
    }

    public void a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.Map r0 = r1.f1220e
            if (r0 == 0) goto L7
            r0.put(r2, r3)
        L7:
            return
    }

    public void a(byte[] r1) {
            r0 = this;
            r0.f1219d = r1
            return
    }

    public byte[] c() {
            r1 = this;
            byte[] r0 = r1.f1219d
            return r0
    }

    public int d() {
            r1 = this;
            int r0 = r1.f1221f
            return r0
    }

    public java.util.Map e() {
            r1 = this;
            java.util.Map r0 = r1.f1220e
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HttpResponse{responseBody='"
            r0.append(r1)
            java.lang.String r1 = r2.f1218c
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", responseCode="
            r0.append(r1)
            int r1 = r2.f1221f
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
