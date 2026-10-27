package cn.jiguang.ai;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private static volatile cn.jiguang.ai.a t;
    private static final java.lang.Object u = null;
    private static java.lang.String v;
    public java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f473b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f474c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f475d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f476e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f477f;

    /* renamed from: g, reason: collision with root package name */
    public int f478g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f479h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f480i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f481j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f482k;
    public java.lang.String l;
    public java.lang.String m;
    public java.lang.String n;
    public java.lang.String o;
    public java.lang.String p;
    public java.lang.String q;
    public java.lang.String r;
    private transient java.util.concurrent.atomic.AtomicBoolean s;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jiguang.ai.a.u = r0
            return
    }

    private a(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.s = r0
            r2.c(r3)
            return
    }

    public static cn.jiguang.ai.a a(android.content.Context r2) {
            cn.jiguang.ai.a r0 = cn.jiguang.ai.a.t
            if (r0 != 0) goto L19
            java.lang.Object r0 = cn.jiguang.ai.a.u
            monitor-enter(r0)
            cn.jiguang.ai.a r1 = cn.jiguang.ai.a.t     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            cn.jiguang.ai.a r1 = new cn.jiguang.ai.a     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            cn.jiguang.ai.a.t = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            cn.jiguang.ai.a r2 = cn.jiguang.ai.a.t
            return r2
    }

    private java.lang.String a(java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto L7
            java.lang.String r1 = r1.trim()
            return r1
        L7:
            r1 = 0
            return r1
    }

    public static void b(android.content.Context r2) {
            java.lang.Object r0 = cn.jiguang.ai.a.u
            monitor-enter(r0)
            cn.jiguang.ai.a r1 = cn.jiguang.ai.a.t     // Catch: java.lang.Throwable -> L9
            if (r1 != 0) goto Lb
        L7:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r2 = move-exception
            goto L12
        Lb:
            r1 = 0
            cn.jiguang.ai.a.t = r1     // Catch: java.lang.Throwable -> L9
            a(r2)     // Catch: java.lang.Throwable -> L9
            goto L7
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    private void c(android.content.Context r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.s
            boolean r0 = r0.get()
            if (r0 != 0) goto L12e
            if (r5 != 0) goto Lc
            goto L12e
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            cn.jiguang.av.a r1 = cn.jiguang.av.a.a()
            java.lang.String r1 = r1.w(r5)
            java.lang.String r1 = r4.a(r1)
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.f473b = r0
            cn.jiguang.av.a r0 = cn.jiguang.av.a.a()
            java.lang.String r0 = r0.r(r5)
            r4.f474c = r0
            cn.jiguang.f.b$a r0 = cn.jiguang.f.b.a.a(r5)
            java.lang.String r0 = r0.c()
            r4.f475d = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "baseBandVer:"
            r0.append(r2)
            java.lang.String r2 = r4.f475d
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "DeviceInfo"
            cn.jiguang.w.f.c(r2, r0)
            cn.jiguang.av.a r0 = cn.jiguang.av.a.a()
            java.lang.String r0 = r0.u(r5)
            r4.l = r0
            cn.jiguang.av.a r0 = cn.jiguang.av.a.a()
            java.lang.String r0 = r0.s(r5)
            r4.n = r0
            cn.jiguang.f.b$a r0 = cn.jiguang.f.b.a.a(r5)
            java.lang.String r0 = r0.e()
            r4.f479h = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "resolution:"
            r0.append(r3)
            java.lang.String r3 = r4.f479h
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r2, r0)
            cn.jiguang.f.b$a r0 = cn.jiguang.f.b.a.a(r5)
            java.lang.String r0 = r0.d()
            r4.f480i = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "androidId:"
            r0.append(r3)
            java.lang.String r3 = r4.f480i
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r2, r0)
            java.lang.String r0 = " "
            r4.f481j = r0
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r0 = r4.a(r0)
            r4.f476e = r0
            cn.jiguang.av.a r0 = cn.jiguang.av.a.a()
            java.lang.String r0 = r0.n(r5)
            java.lang.String r0 = r4.a(r0)
            r4.f482k = r0
            cn.jiguang.av.a r0 = cn.jiguang.av.a.a()
            java.lang.String r0 = r0.o(r5)
            java.lang.String r0 = r4.a(r0)
            r4.m = r0
            java.lang.String r0 = d(r5)
            r4.a = r0
            java.lang.String r0 = cn.jiguang.d.a.h(r5)
            r4.f477f = r0
            boolean r0 = cn.jiguang.av.a.d(r5)
            r4.f478g = r0
            cn.jiguang.av.a r0 = cn.jiguang.av.a.a()
            java.lang.String r2 = ""
            java.lang.String r0 = r0.d(r5, r2)
            r4.o = r0
            cn.jiguang.av.a r0 = cn.jiguang.av.a.a()
            java.lang.String r0 = r0.c(r5, r2)
            r4.p = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.q = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            int r5 = r5.targetSdkVersion
            r0.append(r5)
            r0.append(r2)
            java.lang.String r5 = r0.toString()
            r4.r = r5
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.s
            r0 = 1
            r5.set(r0)
        L12e:
            return
    }

    private static java.lang.String d(android.content.Context r6) {
            java.lang.String r0 = "NO versionName defined in manifest."
            java.lang.String r1 = "DeviceInfo"
            java.lang.String r2 = cn.jiguang.ai.a.v
            if (r2 != 0) goto L2b
            r2 = 0
            android.content.pm.PackageInfo r6 = cn.jiguang.av.o.a(r6, r2)     // Catch: java.lang.Throwable -> L28
            if (r6 == 0) goto L24
            java.lang.String r6 = r6.versionName     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "UTF-8"
            byte[] r3 = r6.getBytes(r3)     // Catch: java.lang.Throwable -> L28
            int r4 = r3.length     // Catch: java.lang.Throwable -> L28
            r5 = 30
            if (r4 <= r5) goto L21
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L28
            r6.<init>(r3, r2, r5)     // Catch: java.lang.Throwable -> L28
        L21:
            cn.jiguang.ai.a.v = r6     // Catch: java.lang.Throwable -> L28
            goto L2b
        L24:
            cn.jiguang.w.f.d(r1, r0)     // Catch: java.lang.Throwable -> L28
            goto L2b
        L28:
            cn.jiguang.w.f.d(r1, r0)
        L2b:
            java.lang.String r6 = cn.jiguang.ai.a.v
            if (r6 != 0) goto L31
            java.lang.String r6 = ""
        L31:
            return r6
    }
}
