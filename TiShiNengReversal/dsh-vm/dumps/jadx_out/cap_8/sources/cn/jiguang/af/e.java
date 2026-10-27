package cn.jiguang.af;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public long f446b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f447c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f448d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f449e;

    /* renamed from: f, reason: collision with root package name */
    private final cn.jiguang.af.c f450f;

    /* renamed from: g, reason: collision with root package name */
    private java.nio.ByteBuffer f451g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f452h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f453i;

    public e(cn.jiguang.af.c r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.<init>()
            r0.f450f = r1
            if (r2 == 0) goto Ld
            r0.f451g = r2
            r0.a()
            return
        Ld:
            java.lang.String r1 = "RegisterResponse"
            java.lang.String r2 = "No body to parse."
            cn.jiguang.w.f.i(r1, r2)
            return
    }

    private void a() {
            r4 = this;
            r0 = 10000(0x2710, float:1.4013E-41)
            java.nio.ByteBuffer r1 = r4.f451g     // Catch: java.lang.Throwable -> Lb
            short r1 = r1.getShort()     // Catch: java.lang.Throwable -> Lb
            r4.a = r1     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r4.a = r0
        Ld:
            int r1 = r4.a
            if (r1 <= 0) goto L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Response error - code:"
            r1.append(r2)
            int r2 = r4.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "RegisterResponse"
            cn.jiguang.w.f.l(r2, r1)
        L29:
            java.nio.ByteBuffer r1 = r4.f451g
            int r2 = r4.a
            if (r2 != 0) goto L45
            long r2 = r1.getLong()     // Catch: java.lang.Throwable -> L42
            r4.f446b = r2     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = cn.jiguang.af.b.a(r1)     // Catch: java.lang.Throwable -> L42
            r4.f447c = r2     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = cn.jiguang.af.b.a(r1)     // Catch: java.lang.Throwable -> L42
            r4.f448d = r1     // Catch: java.lang.Throwable -> L42
            goto L67
        L42:
            r4.a = r0
            goto L67
        L45:
            r3 = 1007(0x3ef, float:1.411E-42)
            if (r2 != r3) goto L50
            java.lang.String r1 = cn.jiguang.af.b.a(r1)     // Catch: java.lang.Throwable -> L42
            r4.f452h = r1     // Catch: java.lang.Throwable -> L42
            goto L67
        L50:
            r3 = 1012(0x3f4, float:1.418E-42)
            if (r2 != r3) goto L67
            java.lang.String r1 = cn.jiguang.af.b.a(r1)     // Catch: java.lang.Throwable -> L5b
            r4.f453i = r1     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r4.a = r0
        L5d:
            r0 = 0
            android.content.Context r0 = cn.jiguang.api.JCoreManager.getAppContext(r0)
            java.lang.String r1 = r4.f453i
            cn.jiguang.aa.a.a(r0, r1)
        L67:
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[RegisterResponse] - code:"
            r0.append(r1)
            int r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", juid:"
            r0.append(r1)
            long r1 = r3.f446b
            r0.append(r1)
            java.lang.String r1 = ", password:"
            r0.append(r1)
            java.lang.String r1 = r3.f447c
            r0.append(r1)
            java.lang.String r1 = ", regId:"
            r0.append(r1)
            java.lang.String r1 = r3.f448d
            r0.append(r1)
            java.lang.String r1 = ", deviceId:"
            r0.append(r1)
            java.lang.String r1 = r3.f449e
            r0.append(r1)
            java.lang.String r1 = ", connectInfo:"
            r0.append(r1)
            java.lang.String r1 = r3.f453i
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
