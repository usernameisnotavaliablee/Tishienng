package cn.jiguang.y;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f1552b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f1553c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f1554d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f1555e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f1556f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f1557g;

    /* renamed from: h, reason: collision with root package name */
    private cn.jiguang.y.g.a f1558h;

    b(android.content.Context r1, cn.jiguang.y.g.a r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f1558h = r2
            byte[] r1 = r2.b()
            r0.f1552b = r1
            return
    }

    public void a() {
            r7 = this;
            java.lang.String r0 = ":"
            java.lang.String r1 = "AuthenticationHeaders"
            java.lang.String r2 = "buildHeaders authentication headers..."
            cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L3e
            cn.jiguang.y.g$a r2 = r7.f1558h     // Catch: java.lang.Throwable -> L3e
            cn.jiguang.av.t$a r2 = r2.d()     // Catch: java.lang.Throwable -> L3e
            int r2 = r2.d()     // Catch: java.lang.Throwable -> L3e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r4.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = "keyType: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L3e
            r4.append(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3e
            cn.jiguang.w.f.c(r1, r4)     // Catch: java.lang.Throwable -> L3e
            r4 = 1
            r5 = 2
            if (r4 != r2) goto L41
            cn.jiguang.y.g$a r2 = r7.f1558h     // Catch: java.lang.Throwable -> L3e
            cn.jiguang.av.t$a r2 = r2.d()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r2.c()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "5.2"
            r7.f1553c = r3     // Catch: java.lang.Throwable -> L3e
            goto L71
        L3e:
            r0 = move-exception
            goto L180
        L41:
            cn.jiguang.y.g$a r4 = r7.f1558h     // Catch: java.lang.Throwable -> L3e
            cn.jiguang.av.t$a r4 = r4.d()     // Catch: java.lang.Throwable -> L3e
            byte[] r4 = r4.a()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r5)     // Catch: java.lang.Throwable -> L3e
            r6 = 3
            if (r6 != r2) goto L57
            java.lang.String r2 = "5.0"
        L54:
            r7.f1553c = r2     // Catch: java.lang.Throwable -> L3e
            goto L70
        L57:
            if (r5 != r2) goto L5c
            java.lang.String r2 = "5.1"
            goto L54
        L5c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r2.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = "unknown keyType = "
            r2.append(r6)     // Catch: java.lang.Throwable -> L3e
            r2.append(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3e
            cn.jiguang.w.f.m(r1, r2)     // Catch: java.lang.Throwable -> L3e
        L70:
            r2 = r4
        L71:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "aesSecret: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L3e
            r3.append(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3e
            cn.jiguang.w.f.c(r1, r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "Version set: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r7.f1553c     // Catch: java.lang.Throwable -> L3e
            r3.append(r4)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3e
            cn.jiguang.w.f.c(r1, r3)     // Catch: java.lang.Throwable -> L3e
            android.content.Context r3 = r7.a     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = cn.jiguang.d.a.e(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r4.<init>()     // Catch: java.lang.Throwable -> L3e
            r4.append(r3)     // Catch: java.lang.Throwable -> L3e
            r4.append(r0)     // Catch: java.lang.Throwable -> L3e
            r4.append(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "Basic "
            r3.append(r4)     // Catch: java.lang.Throwable -> L3e
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r5)     // Catch: java.lang.Throwable -> L3e
            r3.append(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L3e
            r7.f1554d = r2     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r2.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "Authorization header: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r7.f1554d     // Catch: java.lang.Throwable -> L3e
            r2.append(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3e
            cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L3e
            android.content.Context r2 = r7.a     // Catch: java.lang.Throwable -> L3e
            long r2 = cn.jiguang.d.a.f(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r4.<init>()     // Catch: java.lang.Throwable -> L3e
            r4.append(r2)     // Catch: java.lang.Throwable -> L3e
            r4.append(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = cn.jiguang.a.a.f236c     // Catch: java.lang.Throwable -> L3e
            r4.append(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "_jcore_android:"
            r4.append(r0)     // Catch: java.lang.Throwable -> L3e
            cn.jiguang.y.g$a r0 = r7.f1558h     // Catch: java.lang.Throwable -> L3e
            int r0 = r0.c()     // Catch: java.lang.Throwable -> L3e
            r4.append(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L3e
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r5)     // Catch: java.lang.Throwable -> L3e
            r7.f1555e = r0     // Catch: java.lang.Throwable -> L3e
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L3e
            r7.f1557g = r0     // Catch: java.lang.Throwable -> L3e
            android.content.Context r0 = r7.a     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = cn.jiguang.d.a.j(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = cn.jiguang.av.v.d(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r2.<init>()     // Catch: java.lang.Throwable -> L3e
            r2.append(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r7.f1557g     // Catch: java.lang.Throwable -> L3e
            r2.append(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = cn.jiguang.av.v.d(r0)     // Catch: java.lang.Throwable -> L3e
            byte[] r2 = r7.f1552b     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = cn.jiguang.av.v.d(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r7.f1554d     // Catch: java.lang.Throwable -> L3e
            r3.append(r4)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r7.f1555e     // Catch: java.lang.Throwable -> L3e
            r3.append(r4)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r7.f1557g     // Catch: java.lang.Throwable -> L3e
            r3.append(r4)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r7.f1553c     // Catch: java.lang.Throwable -> L3e
            r3.append(r4)     // Catch: java.lang.Throwable -> L3e
            r3.append(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = cn.jiguang.aj.i.a(r0, r2)     // Catch: java.lang.Throwable -> L3e
            r7.f1556f = r0     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r0.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = ""
            r0.append(r2)     // Catch: java.lang.Throwable -> L3e
            r0.append(r7)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3e
            cn.jiguang.w.f.c(r1, r0)     // Catch: java.lang.Throwable -> L3e
            return
        L180:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception in init: "
            r2.append(r3)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.d(r1, r2, r0)
            return
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.f1554d
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.f1555e
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.f1556f
            return r0
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.f1557g
            return r0
    }

    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.f1553c
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AuthenticationHeaders{version='"
            r0.append(r1)
            java.lang.String r1 = r3.f1553c
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", body='"
            r0.append(r2)
            byte[] r2 = r3.f1552b
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", authorization='"
            r0.append(r2)
            java.lang.String r2 = r3.f1554d
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", token='"
            r0.append(r2)
            java.lang.String r2 = r3.f1555e
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", sign='"
            r0.append(r2)
            java.lang.String r2 = r3.f1556f
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", timestamp='"
            r0.append(r2)
            java.lang.String r2 = r3.f1557g
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
