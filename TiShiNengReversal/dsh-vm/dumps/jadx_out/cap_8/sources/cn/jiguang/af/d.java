package cn.jiguang.af;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f438b;

    /* renamed from: c, reason: collision with root package name */
    public int f439c;

    /* renamed from: d, reason: collision with root package name */
    public int f440d;

    /* renamed from: e, reason: collision with root package name */
    private final cn.jiguang.af.c f441e;

    /* renamed from: f, reason: collision with root package name */
    private java.nio.ByteBuffer f442f;

    /* renamed from: g, reason: collision with root package name */
    private int f443g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f444h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f445i;

    public d(cn.jiguang.af.c r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.<init>()
            r0.f441e = r1
            if (r2 == 0) goto Ld
            r0.f442f = r2
            r0.a()
            return
        Ld:
            java.lang.String r1 = "LoginResponse"
            java.lang.String r2 = "No body to parse."
            cn.jiguang.w.f.i(r1, r2)
            return
    }

    private void a() {
            r4 = this;
            r0 = 10000(0x2710, float:1.4013E-41)
            java.nio.ByteBuffer r1 = r4.f442f     // Catch: java.lang.Throwable -> Lb
            short r1 = r1.getShort()     // Catch: java.lang.Throwable -> Lb
            r4.a = r1     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r4.a = r0
        Ld:
            int r1 = r4.a
            java.lang.String r2 = "LoginResponse"
            if (r1 <= 0) goto L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Response error - code:"
            r1.append(r3)
            int r3 = r4.a
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            cn.jiguang.w.f.l(r2, r1)
        L29:
            java.nio.ByteBuffer r1 = r4.f442f
            r3 = -1
            r4.f440d = r3
            int r3 = r4.a
            if (r3 != 0) goto L80
            int r3 = r1.getInt()     // Catch: java.lang.Throwable -> L4b
            r4.f438b = r3     // Catch: java.lang.Throwable -> L4b
            short r3 = r1.getShort()     // Catch: java.lang.Throwable -> L4b
            r4.f443g = r3     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = cn.jiguang.af.b.a(r1)     // Catch: java.lang.Throwable -> L4b
            r4.f444h = r3     // Catch: java.lang.Throwable -> L4b
            int r3 = r1.getInt()     // Catch: java.lang.Throwable -> L4b
            r4.f439c = r3     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            r4.a = r0
        L4d:
            byte r0 = r1.get()     // Catch: java.lang.Throwable -> L6a
            r4.f440d = r0     // Catch: java.lang.Throwable -> L6a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r0.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = "idc parse success, value:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L6a
            int r1 = r4.f440d     // Catch: java.lang.Throwable -> L6a
            r0.append(r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6a
            cn.jiguang.w.f.c(r2, r0)     // Catch: java.lang.Throwable -> L6a
            goto L97
        L6a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "parse idc failed, error:"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            cn.jiguang.w.f.i(r2, r0)
            goto L97
        L80:
            r2 = 1012(0x3f4, float:1.418E-42)
            if (r3 != r2) goto L97
            java.lang.String r1 = cn.jiguang.af.b.a(r1)     // Catch: java.lang.Throwable -> L8b
            r4.f445i = r1     // Catch: java.lang.Throwable -> L8b
            goto L8d
        L8b:
            r4.a = r0
        L8d:
            r0 = 0
            android.content.Context r0 = cn.jiguang.api.JCoreManager.getAppContext(r0)
            java.lang.String r1 = r4.f445i
            cn.jiguang.aa.a.a(r0, r1)
        L97:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[LoginResponse] - code:"
            r0.append(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ",sid:"
            r0.append(r1)
            int r1 = r2.f438b
            r0.append(r1)
            java.lang.String r1 = ", serverVersion:"
            r0.append(r1)
            int r1 = r2.f443g
            r0.append(r1)
            java.lang.String r1 = ", sessionKey:"
            r0.append(r1)
            java.lang.String r1 = r2.f444h
            r0.append(r1)
            java.lang.String r1 = ", serverTime:"
            r0.append(r1)
            int r1 = r2.f439c
            r0.append(r1)
            java.lang.String r1 = ", idc:"
            r0.append(r1)
            int r1 = r2.f440d
            r0.append(r1)
            java.lang.String r1 = ", connectInfo:"
            r0.append(r1)
            java.lang.String r1 = r2.f445i
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
