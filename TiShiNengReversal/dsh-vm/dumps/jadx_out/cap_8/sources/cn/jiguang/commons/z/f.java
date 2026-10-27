package cn.jiguang.commons.z;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class f {
    private static final java.util.concurrent.atomic.AtomicBoolean a = null;

    /* renamed from: c, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicBoolean f1247c = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            cn.jiguang.commons.z.f.a = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            cn.jiguang.commons.z.f.f1247c = r0
            return
    }

    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(java.lang.String r1, long r2, int r4, java.lang.String r5) {
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.commons.z.f.f1247c     // Catch: java.lang.Throwable -> Lb
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Lb
            cn.jiguang.internal.JNAction.s(r1, r2, r4, r5)     // Catch: java.lang.Throwable -> Lb
        Lb:
            return
    }

    private static boolean a() {
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "load"
            boolean r0 = a(r2, r1, r0, r2)
            return r0
    }

    private static boolean a(java.lang.String r4) {
            r0 = 1
            java.lang.Class[] r1 = new java.lang.Class[r0]
            r2 = 0
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r1[r2] = r3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r4
            java.lang.String r4 = "loadPath"
            boolean r4 = a(r4, r1, r0, r4)
            return r4
    }

    private static boolean a(java.lang.String r3, java.lang.Class[] r4, java.lang.Object[] r5, java.lang.String r6) {
            java.lang.String r0 = "JSM"
            r1 = 0
            java.lang.Class<cn.jiguang.internal.JNAction> r2 = cn.jiguang.internal.JNAction.class
            java.lang.reflect.Method r3 = r2.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L1b java.lang.UnsatisfiedLinkError -> L1d java.lang.NoSuchMethodException -> L1f
            r4 = 0
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch: java.lang.Throwable -> L1b java.lang.UnsatisfiedLinkError -> L1d java.lang.NoSuchMethodException -> L1f
            if (r3 == 0) goto L21
            boolean r4 = r3 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L1b java.lang.UnsatisfiedLinkError -> L1d java.lang.NoSuchMethodException -> L1f
            if (r4 == 0) goto L21
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L1b java.lang.UnsatisfiedLinkError -> L1d java.lang.NoSuchMethodException -> L1f
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L1b java.lang.UnsatisfiedLinkError -> L1d java.lang.NoSuchMethodException -> L1f
            return r3
        L1b:
            r3 = move-exception
            goto L26
        L1d:
            r3 = move-exception
            goto L42
        L1f:
            r3 = move-exception
            goto L4d
        L21:
            boolean r3 = e()     // Catch: java.lang.Throwable -> L1b java.lang.UnsatisfiedLinkError -> L1d java.lang.NoSuchMethodException -> L1f
            return r3
        L26:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            java.lang.String r5 = " err: "
        L30:
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jiguang.commons.w.a.c(r0, r3)
            return r1
        L42:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            java.lang.String r5 = " so err: "
            goto L30
        L4d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            java.lang.String r5 = " method not found: "
            goto L30
    }

    private static int c() {
            cn.jiguang.commons.f.i r0 = cn.jiguang.commons.f.i.d()
            boolean r0 = r0.l()
            if (r0 == 0) goto Lc
            r0 = 2
            return r0
        Lc:
            r0 = 1
            return r0
    }

    public static boolean c(java.lang.String r3) {
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.commons.z.f.f1247c
            boolean r1 = r0.get()
            java.lang.String r2 = "JSM"
            if (r1 == 0) goto L11
            java.lang.String r3 = "s loaded"
            cn.jiguang.commons.w.a.a(r2, r3)
            r3 = 1
            return r3
        L11:
            cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()
            boolean r3 = a(r3)     // Catch: java.lang.Exception -> L3c
            r0.set(r3)     // Catch: java.lang.Exception -> L3c
            f()     // Catch: java.lang.Exception -> L3c
            if (r3 == 0) goto L2d
            java.lang.String r3 = "d y load complete"
            cn.jiguang.commons.w.a.a(r2, r3)     // Catch: java.lang.Exception -> L3c
            r3 = 3053(0xbed, float:4.278E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L3c
            goto L38
        L2d:
            java.lang.String r3 = "d y load fail"
            cn.jiguang.commons.w.a.a(r2, r3)     // Catch: java.lang.Exception -> L3c
            r3 = 3054(0xbee, float:4.28E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L3c
        L38:
            r1.l(r3)     // Catch: java.lang.Exception -> L3c
            goto L45
        L3c:
            r3 = 3059(0xbf3, float:4.287E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.l(r3)
        L45:
            java.util.concurrent.atomic.AtomicBoolean r3 = cn.jiguang.commons.z.f.f1247c
            boolean r3 = r3.get()
            return r3
    }

    public static java.lang.String d() {
            java.lang.String r0 = ""
            java.util.concurrent.atomic.AtomicBoolean r1 = cn.jiguang.commons.z.f.f1247c     // Catch: java.lang.Throwable -> Lf
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = cn.jiguang.internal.JNAction.v()     // Catch: java.lang.Throwable -> Lf
        Lf:
            return r0
    }

    private static boolean e() {
            java.lang.String r0 = "JSM"
            r1 = 0
            java.lang.Class<cn.jiguang.internal.JNAction> r2 = cn.jiguang.internal.JNAction.class
            java.lang.String r3 = "isNativeLibraryLoaded"
            java.lang.reflect.Field r2 = r2.getField(r3)     // Catch: java.lang.Throwable -> L11 java.lang.NoSuchFieldException -> L2b
            r3 = 0
            boolean r0 = r2.getBoolean(r3)     // Catch: java.lang.Throwable -> L11 java.lang.NoSuchFieldException -> L2b
            return r0
        L11:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get load status err: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.c(r0, r2)
            return r1
        L2b:
            java.lang.String r2 = "load field not found"
            cn.jiguang.commons.w.a.a(r0, r2)
            return r1
    }

    public static boolean f() {
            java.lang.String r0 = "JSM"
            cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()
            r2 = 0
            cn.jiguang.commons.g.p r3 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = r3.d()     // Catch: java.lang.Throwable -> L32
            cn.jiguang.commons.g.p r4 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L32
            long r4 = r4.l()     // Catch: java.lang.Throwable -> L32
            int r6 = c()     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.atomic.AtomicBoolean r7 = cn.jiguang.commons.z.f.f1247c     // Catch: java.lang.Throwable -> L32
            boolean r7 = r7.get()     // Catch: java.lang.Throwable -> L32
            if (r7 != 0) goto L34
            java.lang.String r3 = "no load"
            cn.jiguang.commons.w.a.a(r0, r3)     // Catch: java.lang.Throwable -> L32
            r3 = 3061(0xbf5, float:4.29E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L32
            r1.l(r3)     // Catch: java.lang.Throwable -> L32
            return r2
        L32:
            r3 = move-exception
            goto L42
        L34:
            cn.jiguang.internal.JNAction.i(r3, r4, r6)     // Catch: java.lang.Throwable -> L32
            r3 = 3060(0xbf4, float:4.288E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L32
            r1.l(r3)     // Catch: java.lang.Throwable -> L32
            r0 = 1
            return r0
        L42:
            r4 = 3062(0xbf6, float:4.291E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.l(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "init  err: "
            r1.append(r4)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            cn.jiguang.commons.w.a.c(r0, r1)
            return r2
    }

    public static void g() {
            java.lang.String r0 = "JSM"
            cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()
            r2 = 3052(0xbec, float:4.277E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1f
            r1.l(r2)     // Catch: java.lang.Throwable -> L1f
            java.util.concurrent.atomic.AtomicBoolean r1 = cn.jiguang.commons.z.f.a     // Catch: java.lang.Throwable -> L1f
            r2 = 0
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L21
            java.lang.String r1 = "loaded, skip"
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            r1 = move-exception
            goto L53
        L21:
            boolean r1 = cn.jiguang.commons.z.e.i()     // Catch: java.lang.Throwable -> L1f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            r2.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = "usage: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L1f
            r2.append(r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1f
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L4a
            java.lang.String r1 = "dy load on"
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Throwable -> L1f
            cn.jiguang.commons.z.d r1 = cn.jiguang.commons.z.d.c()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = cn.jiguang.commons.z.a.f1232h     // Catch: java.lang.Throwable -> L1f
            r1.c(r2)     // Catch: java.lang.Throwable -> L1f
            return
        L4a:
            java.lang.String r1 = "load static"
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Throwable -> L1f
            h()     // Catch: java.lang.Throwable -> L1f
            return
        L53:
            cn.jiguang.commons.A.a r2 = cn.jiguang.commons.A.a.f()
            r3 = 3063(0xbf7, float:4.292E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.l(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "load so err: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.commons.w.a.c(r0, r1)
            return
    }

    public static boolean h() {
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.commons.z.f.f1247c
            boolean r1 = r0.get()
            java.lang.String r2 = "JSM"
            if (r1 == 0) goto L11
            java.lang.String r0 = "s loaded"
            cn.jiguang.commons.w.a.a(r2, r0)
            r0 = 1
            return r0
        L11:
            cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()
            boolean r3 = a()     // Catch: java.lang.Exception -> L3c
            r0.set(r3)     // Catch: java.lang.Exception -> L3c
            f()     // Catch: java.lang.Exception -> L3c
            if (r3 == 0) goto L2d
            java.lang.String r0 = "st load complete"
            cn.jiguang.commons.w.a.a(r2, r0)     // Catch: java.lang.Exception -> L3c
            r0 = 3057(0xbf1, float:4.284E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L3c
            goto L38
        L2d:
            java.lang.String r0 = "st load fail"
            cn.jiguang.commons.w.a.a(r2, r0)     // Catch: java.lang.Exception -> L3c
            r0 = 3058(0xbf2, float:4.285E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L3c
        L38:
            r1.l(r0)     // Catch: java.lang.Exception -> L3c
            goto L45
        L3c:
            r0 = 3059(0xbf3, float:4.287E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.l(r0)
        L45:
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.commons.z.f.f1247c
            boolean r0 = r0.get()
            return r0
    }
}
