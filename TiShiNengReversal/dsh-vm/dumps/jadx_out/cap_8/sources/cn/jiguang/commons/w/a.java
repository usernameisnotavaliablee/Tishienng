package cn.jiguang.commons.w;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class a {
    private static final java.util.concurrent.atomic.AtomicLong a = null;

    /* renamed from: c, reason: collision with root package name */
    private static final java.util.concurrent.ConcurrentHashMap f1202c = null;

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f1203d;

    /* renamed from: e, reason: collision with root package name */
    private static final java.lang.ThreadLocal f1204e = null;

    /* renamed from: f, reason: collision with root package name */
    private static java.lang.String f1205f;

    /* renamed from: g, reason: collision with root package name */
    private static volatile java.lang.Class f1206g;

    /* renamed from: h, reason: collision with root package name */
    private static volatile java.lang.reflect.Method f1207h;

    /* renamed from: i, reason: collision with root package name */
    private static final java.lang.Object f1208i = null;

    /* renamed from: cn.jiguang.commons.w.a$a, reason: collision with other inner class name */
    class C0035a extends java.lang.ThreadLocal {
        C0035a() {
                r0 = this;
                r0.<init>()
                return
        }

        protected java.lang.Object[] a() {
                r1 = this;
                r0 = 6
                java.lang.Object[] r0 = new java.lang.Object[r0]
                return r0
        }

        @Override // java.lang.ThreadLocal
        protected /* synthetic */ java.lang.Object initialValue() {
                r1 = this;
                java.lang.Object[] r0 = r1.a()
                return r0
        }
    }

    static {
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            cn.jiguang.commons.w.a.a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            cn.jiguang.commons.w.a.f1202c = r0
            r0 = 0
            cn.jiguang.commons.w.a.f1203d = r0
            cn.jiguang.commons.w.a$a r0 = new cn.jiguang.commons.w.a$a
            r0.<init>()
            cn.jiguang.commons.w.a.f1204e = r0
            java.lang.String r0 = "[key-step]"
            cn.jiguang.commons.w.a.f1205f = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jiguang.commons.w.a.f1208i = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.Object a(android.content.Context r12, java.lang.String r13, int r14, java.lang.String r15, android.os.Bundle r16, java.lang.Object... r17) {
            r1 = 0
            java.lang.Class r0 = cn.jiguang.commons.w.a.f1206g     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L1c
            java.lang.Object r2 = cn.jiguang.commons.w.a.f1208i     // Catch: java.lang.Throwable -> L6c
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.Class r0 = cn.jiguang.commons.w.a.f1206g     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L18
            java.lang.String r0 = "cn.jiguang.api.JCoreManager"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L15
            cn.jiguang.commons.w.a.f1206g = r0     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r0 = move-exception
            r12 = r0
            goto L1a
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            goto L1c
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r12     // Catch: java.lang.Throwable -> L6c
        L1c:
            java.lang.reflect.Method r0 = cn.jiguang.commons.w.a.f1207h     // Catch: java.lang.Throwable -> L6c
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r0 != 0) goto L49
            java.lang.Class r0 = cn.jiguang.commons.w.a.f1206g     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = "onEvent"
            r9 = 6
            java.lang.Class[] r9 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> L6c
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            r9[r7] = r10     // Catch: java.lang.Throwable -> L6c
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9[r6] = r10     // Catch: java.lang.Throwable -> L6c
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L6c
            r9[r5] = r11     // Catch: java.lang.Throwable -> L6c
            r9[r4] = r10     // Catch: java.lang.Throwable -> L6c
            java.lang.Class<android.os.Bundle> r10 = android.os.Bundle.class
            r9[r3] = r10     // Catch: java.lang.Throwable -> L6c
            java.lang.Class<java.lang.Object[]> r10 = java.lang.Object[].class
            r9[r2] = r10     // Catch: java.lang.Throwable -> L6c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r8, r9)     // Catch: java.lang.Throwable -> L6c
            cn.jiguang.commons.w.a.f1207h = r0     // Catch: java.lang.Throwable -> L6c
        L49:
            java.lang.reflect.Method r0 = cn.jiguang.commons.w.a.f1207h     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L6c
            java.lang.ThreadLocal r0 = cn.jiguang.commons.w.a.f1204e     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L6c
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch: java.lang.Throwable -> L6c
            r0[r7] = r12     // Catch: java.lang.Throwable -> L6c
            r0[r6] = r13     // Catch: java.lang.Throwable -> L6c
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L6c
            r0[r5] = r12     // Catch: java.lang.Throwable -> L6c
            r0[r4] = r15     // Catch: java.lang.Throwable -> L6c
            r0[r3] = r16     // Catch: java.lang.Throwable -> L6c
            r0[r2] = r17     // Catch: java.lang.Throwable -> L6c
            java.lang.reflect.Method r12 = cn.jiguang.commons.w.a.f1207h     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r12 = r12.invoke(r1, r0)     // Catch: java.lang.Throwable -> L6c
            return r12
        L6c:
            return r1
    }

    private static void a() {
            java.util.concurrent.ConcurrentHashMap r0 = cn.jiguang.commons.w.a.f1202c
            int r1 = r0.size()
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 < r2) goto Lf
            r3 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            cn.jiguang.commons.L.r.a(r0, r2, r3)
        Lf:
            return
    }

    private static void a(int r7, boolean r8, java.lang.String r9, java.lang.String r10, java.lang.Throwable r11) {
            if (r11 == 0) goto L16
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r10 = ":"
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = r0.toString()
        L16:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r0 = 4
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r7
            r7 = 1
            r6[r7] = r8
            r7 = 2
            r6[r7] = r10
            r7 = 3
            r6[r7] = r11
            r3 = 18
            r5 = 0
            r1 = 0
            java.lang.String r2 = "JCommon"
            r4 = r9
            a(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void a(java.lang.String r3, java.lang.String r4) {
            r0 = 1
            r1 = 0
            r2 = 3
            c(r2, r0, r3, r4, r1)
            return
    }

    public static void a(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r0 = 6
            r1 = 1
            c(r0, r1, r2, r3, r4)
            return
    }

    private static boolean a(java.lang.Long r9) {
            boolean r0 = cn.jiguang.commons.w.a.f1203d
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            long r2 = java.lang.System.currentTimeMillis()
            java.util.concurrent.ConcurrentHashMap r0 = cn.jiguang.commons.w.a.f1202c
            r4 = 0
            java.lang.Object r4 = cn.jiguang.commons.L.r.a(r0, r9, r4)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L25
            long r4 = r4.longValue()
            long r4 = r2 - r4
            r6 = 285000(0x45948, double:1.408087E-318)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L23
            goto L25
        L23:
            r9 = 0
            return r9
        L25:
            a()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.put(r9, r2)
            return r1
    }

    public static void c() {
            java.util.concurrent.atomic.AtomicLong r0 = cn.jiguang.commons.w.a.a
            r0.incrementAndGet()
            java.util.concurrent.ConcurrentHashMap r0 = cn.jiguang.commons.w.a.f1202c
            r0.clear()
            return
    }

    private static void c(int r9, boolean r10, java.lang.String r11, java.lang.String r12, java.lang.Throwable r13) {
            java.lang.String r0 = ""
            if (r12 != 0) goto L5
            r12 = r0
        L5:
            if (r11 != 0) goto L8
            r11 = r0
        L8:
            int r0 = r11.hashCode()
            int r1 = r12.hashCode()
            r2 = 0
            if (r13 == 0) goto L1d
            java.lang.String r3 = r13.getMessage()
            if (r3 == 0) goto L1d
            int r2 = r3.hashCode()
        L1d:
            r3 = 65535(0xffff, float:9.1834E-41)
            r4 = r0 & r3
            long r4 = (long) r4
            r6 = 48
            long r4 = r4 << r6
            r6 = r9 & 255(0xff, float:3.57E-43)
            long r6 = (long) r6
            r8 = 40
            long r6 = r6 << r8
            long r4 = r4 | r6
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r6 = r6 & r1
            long r6 = (long) r6
            r8 = 16
            long r6 = r6 << r8
            long r4 = r4 | r6
            r3 = r3 & r2
            long r6 = (long) r3
            long r4 = r4 | r6
            int r0 = r0 >>> r8
            int r1 = r1 >>> 24
            r0 = r0 | r1
            int r1 = r2 >>> 16
            r0 = r0 | r1
            long r0 = (long) r0
            long r0 = r0 ^ r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = a(r0)
            if (r0 == 0) goto L4f
            a(r9, r10, r11, r12, r13)
        L4f:
            return
    }

    public static void c(java.lang.String r3, java.lang.String r4) {
            r0 = 1
            r1 = 0
            r2 = 6
            c(r2, r0, r3, r4, r1)
            return
    }

    public static void c(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r0 = 5
            r1 = 1
            c(r0, r1, r2, r3, r4)
            return
    }

    public static void d(java.lang.String r3, java.lang.String r4) {
            r0 = 1
            r1 = 0
            r2 = 4
            c(r2, r0, r3, r4, r1)
            return
    }

    public static void e(java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = cn.jiguang.commons.w.a.f1205f
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r0 = 0
            r1 = 0
            r2 = 3
            c(r2, r0, r3, r4, r1)
            return
    }

    public static void f(java.lang.String r3, java.lang.String r4) {
            r0 = 1
            r1 = 0
            r2 = 5
            c(r2, r0, r3, r4, r1)
            return
    }
}
