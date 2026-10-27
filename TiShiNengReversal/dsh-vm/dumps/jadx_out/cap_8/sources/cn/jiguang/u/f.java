package cn.jiguang.u;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f {
    private static java.lang.Long a;

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.Boolean f1462b;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.Boolean f1463c;

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.String f1464d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile java.lang.Class<?> f1465e;

    /* renamed from: f, reason: collision with root package name */
    private static volatile java.lang.reflect.Method f1466f;

    /* renamed from: g, reason: collision with root package name */
    private static final java.lang.Object f1467g = null;

    /* renamed from: h, reason: collision with root package name */
    private static java.lang.Boolean f1468h;

    /* renamed from: i, reason: collision with root package name */
    private static volatile java.lang.Class<?> f1469i;

    /* renamed from: j, reason: collision with root package name */
    private static final java.lang.Object f1470j = null;

    /* renamed from: k, reason: collision with root package name */
    private static java.util.LinkedList<java.lang.String> f1471k;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jiguang.u.f.f1467g = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jiguang.u.f.f1470j = r0
            return
    }

    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    public static long a(android.content.Context r7) {
            java.lang.Long r0 = cn.jiguang.u.f.a
            if (r0 == 0) goto L9
            long r0 = r0.longValue()
            return r0
        L9:
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r2 = 0
            r3 = 20
            r4 = 0
            r5 = 0
            r1 = r7
            java.lang.Object r7 = a(r1, r2, r3, r4, r5, r6)
            boolean r0 = r7 instanceof java.lang.Long
            r1 = 0
            if (r0 == 0) goto L2d
            java.lang.Long r7 = (java.lang.Long) r7
            long r3 = r7.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2d
            cn.jiguang.u.f.a = r7
            long r0 = r7.longValue()
            return r0
        L2d:
            return r1
    }

    public static android.content.pm.PackageInfo a(android.content.Context r6, java.lang.Object... r7) {
            r3 = 0
            r4 = 0
            r1 = 0
            r2 = 98
            r0 = r6
            r5 = r7
            java.lang.Object r6 = a(r0, r1, r2, r3, r4, r5)
            boolean r7 = r6 instanceof android.content.pm.PackageInfo
            if (r7 == 0) goto L12
            android.content.pm.PackageInfo r6 = (android.content.pm.PackageInfo) r6
            return r6
        L12:
            r6 = 0
            return r6
    }

    public static java.lang.Object a(android.content.Context r13, java.lang.String r14, int r15, java.lang.String r16, android.os.Bundle r17, java.lang.Object... r18) {
            r1 = 0
            java.lang.Class<?> r0 = cn.jiguang.u.f.f1465e     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L1f
            java.lang.Object r2 = cn.jiguang.u.f.f1467g     // Catch: java.lang.Throwable -> L1c
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.Class<?> r0 = cn.jiguang.u.f.f1465e     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L18
            java.lang.String r0 = "cn.jiguang.api.JCoreManager"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L15
            cn.jiguang.u.f.f1465e = r0     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r0 = move-exception
            r13 = r0
            goto L1a
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            goto L1f
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r13     // Catch: java.lang.Throwable -> L1c
        L1c:
            r0 = move-exception
            r13 = r0
            goto L69
        L1f:
            java.lang.reflect.Method r0 = cn.jiguang.u.f.f1466f     // Catch: java.lang.Throwable -> L1c
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 6
            if (r0 != 0) goto L4c
            java.lang.Class<?> r0 = cn.jiguang.u.f.f1465e     // Catch: java.lang.Throwable -> L1c
            java.lang.String r9 = "onEvent"
            java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> L1c
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            r10[r7] = r11     // Catch: java.lang.Throwable -> L1c
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r10[r6] = r11     // Catch: java.lang.Throwable -> L1c
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L1c
            r10[r5] = r12     // Catch: java.lang.Throwable -> L1c
            r10[r4] = r11     // Catch: java.lang.Throwable -> L1c
            java.lang.Class<android.os.Bundle> r11 = android.os.Bundle.class
            r10[r3] = r11     // Catch: java.lang.Throwable -> L1c
            java.lang.Class<java.lang.Object[]> r11 = java.lang.Object[].class
            r10[r2] = r11     // Catch: java.lang.Throwable -> L1c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r9, r10)     // Catch: java.lang.Throwable -> L1c
            cn.jiguang.u.f.f1466f = r0     // Catch: java.lang.Throwable -> L1c
        L4c:
            java.lang.reflect.Method r0 = cn.jiguang.u.f.f1466f     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L83
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L1c
            r0[r7] = r13     // Catch: java.lang.Throwable -> L1c
            r0[r6] = r14     // Catch: java.lang.Throwable -> L1c
            r0[r5] = r15     // Catch: java.lang.Throwable -> L1c
            r0[r4] = r16     // Catch: java.lang.Throwable -> L1c
            r0[r3] = r17     // Catch: java.lang.Throwable -> L1c
            r0[r2] = r18     // Catch: java.lang.Throwable -> L1c
            java.lang.reflect.Method r13 = cn.jiguang.u.f.f1466f     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r13 = r13.invoke(r1, r0)     // Catch: java.lang.Throwable -> L1c
            return r13
        L69:
            java.lang.String r14 = "JCoreBridge"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "error occured when invokeOnEvent."
            r15.append(r0)
            java.lang.String r13 = r13.getMessage()
            r15.append(r13)
            java.lang.String r13 = r15.toString()
            cn.jiguang.t.b.b(r14, r13)
        L83:
            return r1
    }

    public static java.util.Map<java.lang.Integer, android.os.Bundle> a() {
            r0 = 0
            java.lang.String r1 = "cn.jiguang.internal.ActionManager"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "getInstance"
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r2, r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = "loadPInfo"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r0)     // Catch: java.lang.Throwable -> L22
            java.lang.Object r2 = r2.invoke(r0, r0)     // Catch: java.lang.Throwable -> L22
            java.lang.Object r1 = r1.invoke(r2, r0)     // Catch: java.lang.Throwable -> L22
            boolean r2 = r1 instanceof java.util.Map     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L3d
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L22
            return r1
        L22:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "error occured when getUid."
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "JCoreBridge"
            cn.jiguang.t.b.b(r2, r1)
        L3d:
            return r0
    }

    public static void a(android.content.Context r6, java.lang.String r7, long r8, int r10) {
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r0 = "url"
            r4.putString(r0, r7)
            java.lang.String r7 = "type"
            java.lang.String r0 = "dy"
            r4.putString(r7, r0)
            java.lang.String r7 = "req"
            r4.putLong(r7, r8)
            java.lang.String r7 = "res"
            long r8 = (long) r10
            r4.putLong(r7, r8)
            r7 = 0
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r1 = 0
            r2 = 122(0x7a, float:1.71E-43)
            r3 = 0
            r0 = r6
            a(r0, r1, r2, r3, r4, r5)
            return
    }

    public static int b() {
            java.lang.Class r0 = f()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "SDK_VERSION_INT"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L1e
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L39
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L1e
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L1e
            return r0
        L1e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "error occured when getJCoreSDKVersion."
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "JCoreBridge"
            cn.jiguang.t.b.b(r1, r0)
        L39:
            r0 = 0
            return r0
    }

    public static boolean b(android.content.Context r7) {
            java.lang.Boolean r0 = cn.jiguang.u.f.f1462b
            if (r0 == 0) goto L9
            boolean r7 = r0.booleanValue()
            return r7
        L9:
            r4 = 0
            r6 = 0
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r1 = 0
            r2 = 123(0x7b, float:1.72E-43)
            r3 = 0
            r0 = r7
            java.lang.Object r7 = a(r0, r1, r2, r3, r4, r5)
            boolean r0 = r7 instanceof java.lang.Boolean
            if (r0 == 0) goto L23
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            cn.jiguang.u.f.f1462b = r7
            boolean r7 = r7.booleanValue()
            return r7
        L23:
            return r6
    }

    public static java.lang.String c() {
            java.lang.Class r0 = f()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "APP_KEY"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L1a
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L35
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1a
            return r0
        L1a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "error occured when getJCoreSDKVersion."
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "JCoreBridge"
            cn.jiguang.t.b.b(r1, r0)
        L35:
            java.lang.String r0 = ""
            return r0
    }

    public static boolean c(android.content.Context r7) {
            java.lang.Boolean r0 = cn.jiguang.u.f.f1463c
            if (r0 == 0) goto L9
            boolean r7 = r0.booleanValue()
            return r7
        L9:
            r4 = 0
            r6 = 0
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r1 = 0
            r2 = 121(0x79, float:1.7E-43)
            r3 = 0
            r0 = r7
            java.lang.Object r7 = a(r0, r1, r2, r3, r4, r5)
            boolean r0 = r7 instanceof java.lang.Boolean
            if (r0 == 0) goto L23
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            cn.jiguang.u.f.f1463c = r7
            boolean r7 = r7.booleanValue()
            return r7
        L23:
            return r6
    }

    public static java.lang.String d(android.content.Context r7) {
            java.lang.String r0 = cn.jiguang.u.f.f1464d
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r2 = 0
            r3 = 6
            r4 = 0
            r5 = 0
            r1 = r7
            java.lang.Object r7 = a(r1, r2, r3, r4, r5, r6)
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L1a
            java.lang.String r7 = (java.lang.String) r7
            cn.jiguang.u.f.f1464d = r7
            return r7
        L1a:
            r7 = 0
            return r7
    }

    public static boolean d() {
            java.lang.Boolean r0 = cn.jiguang.u.f.f1468h     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L5
            goto L22
        L5:
            java.lang.Class r0 = f()     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "INTERNAL_USE"
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Throwable -> L27
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L27
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L27
            boolean r1 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L27
            cn.jiguang.u.f.f1468h = r0     // Catch: java.lang.Throwable -> L27
        L20:
            java.lang.Boolean r0 = cn.jiguang.u.f.f1468h     // Catch: java.lang.Throwable -> L27
        L22:
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L27
            return r0
        L27:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "error occured when isInternalUse."
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "JCoreBridge"
            cn.jiguang.t.b.b(r1, r0)
            r0 = 0
            return r0
    }

    public static java.util.LinkedList<java.lang.String> e() {
            r0 = 0
            java.util.LinkedList<java.lang.String> r1 = cn.jiguang.u.f.f1471k     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Le
            if (r1 <= 0) goto L10
            java.util.LinkedList<java.lang.String> r0 = cn.jiguang.u.f.f1471k     // Catch: java.lang.Throwable -> Le
            return r0
        Le:
            r1 = move-exception
            goto L27
        L10:
            java.lang.Class r1 = f()     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = "TUU"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> Le
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> Le
            java.util.LinkedList r1 = (java.util.LinkedList) r1     // Catch: java.lang.Throwable -> Le
            cn.jiguang.u.f.f1471k = r1     // Catch: java.lang.Throwable -> Le
            return r1
        L27:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "error occured when isDebugModel."
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "JCoreBridge"
            cn.jiguang.t.b.b(r2, r1)
            return r0
    }

    private static java.lang.Class<?> f() {
            java.lang.Class<?> r0 = cn.jiguang.u.f.f1469i     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L35
            java.lang.Object r0 = cn.jiguang.u.f.f1470j     // Catch: java.lang.Throwable -> L1a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L1a
            java.lang.Class<?> r1 = cn.jiguang.u.f.f1469i     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            java.lang.String r1 = "cn.jiguang.internal.JConstants"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L14
            cn.jiguang.u.f.f1469i = r1     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r1 = move-exception
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L35
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L1a
        L1a:
            r0 = move-exception
            java.lang.String r1 = "JCoreBridge"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "error occured when getJConstants."
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.t.b.e(r1, r0)
        L35:
            java.lang.Class<?> r0 = cn.jiguang.u.f.f1469i
            return r0
    }
}
