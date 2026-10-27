package cn.jiguang.commons.f;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class i {
    private final java.util.HashSet a;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.HashSet f1112c;

    /* renamed from: d, reason: collision with root package name */
    private final java.util.HashMap f1113d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1114e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1115f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1116g;

    /* renamed from: h, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f1117h;

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class b {
        private static final cn.jiguang.commons.f.i a = null;

        static {
                cn.jiguang.commons.f.i r0 = new cn.jiguang.commons.f.i
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.f.i.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.f.i a() {
                cn.jiguang.commons.f.i r0 = cn.jiguang.commons.f.i.b.a
                return r0
        }
    }

    private i() {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.a = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.f1112c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f1113d = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.f1117h = r0
            boolean r0 = r2.l()
            r2.f1114e = r0
            boolean r0 = r2.j()
            r2.f1115f = r0
            boolean r0 = r2.k()
            r2.f1116g = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "init - isJP="
            r0.append(r1)
            boolean r1 = r2.f1114e
            r0.append(r1)
            java.lang.String r1 = " isJO="
            r0.append(r1)
            boolean r1 = r2.f1115f
            r0.append(r1)
            java.lang.String r1 = " isJV="
            r0.append(r1)
            boolean r1 = r2.f1116g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SDKConfigManager"
            cn.jiguang.commons.w.a.a(r1, r0)
            r2.f()
            return
    }

    /* synthetic */ i(cn.jiguang.commons.f.i.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.commons.f.i d() {
            cn.jiguang.commons.f.i r0 = cn.jiguang.commons.f.i.b.a()
            return r0
    }

    private void f() {
            r0 = this;
            r0.g()
            r0.h()
            r0.i()
            return
    }

    private void g() {
            r6 = this;
            r0 = 14
            int[] r1 = new int[r0]
            r1 = {x0020: FILL_ARRAY_DATA , data: [2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013} // fill-array
            r2 = 0
        L8:
            if (r2 >= r0) goto L1e
            r3 = r1[r2]
            java.util.HashMap r4 = r6.f1113d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r5 = r6.f1115f
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.put(r3, r5)
            int r2 = r2 + 1
            goto L8
        L1e:
            return
    }

    private void h() {
            r6 = this;
            r0 = 10
            int[] r1 = new int[r0]
            r1 = {x0020: FILL_ARRAY_DATA , data: [1000, 1001, 1003, 1005, 1006, 1007, 1008, 1010, 1012, 1014} // fill-array
            r2 = 0
        L8:
            if (r2 >= r0) goto L1e
            r3 = r1[r2]
            java.util.HashMap r4 = r6.f1113d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r5 = r6.f1114e
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.put(r3, r5)
            int r2 = r2 + 1
            goto L8
        L1e:
            return
    }

    private void i() {
            r6 = this;
            r0 = 18
            int[] r1 = new int[r0]
            r1 = {x0020: FILL_ARRAY_DATA , data: [3000, 3001, 3002, 3003, 3004, 3005, 3006, 3007, 3008, 3009, 3010, 3011, 3012, 3013, 3014, 3015, 3016, 3017} // fill-array
            r2 = 0
        L8:
            if (r2 >= r0) goto L1e
            r3 = r1[r2]
            java.util.HashMap r4 = r6.f1113d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r5 = r6.f1116g
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.put(r3, r5)
            int r2 = r2 + 1
            goto L8
        L1e:
            return
    }

    public java.util.HashSet a() {
            r1 = this;
            java.util.HashSet r0 = r1.f1112c
            return r0
    }

    public boolean a(int r2) {
            r1 = this;
            java.util.HashMap r0 = r1.f1113d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L16
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    public synchronized boolean a(java.lang.Integer r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashSet r0 = r1.f1112c     // Catch: java.lang.Throwable -> L11
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L13
            java.util.HashSet r0 = r1.f1112c     // Catch: java.lang.Throwable -> L11
            r0.add(r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            r2 = 1
            return r2
        L11:
            r2 = move-exception
            goto L16
        L13:
            monitor-exit(r1)
            r2 = 0
            return r2
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    public java.util.HashSet c() {
            r1 = this;
            java.util.HashSet r0 = r1.a
            return r0
    }

    public synchronized boolean c(java.lang.Integer r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashSet r0 = r1.a     // Catch: java.lang.Throwable -> L11
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L13
            java.util.HashSet r0 = r1.a     // Catch: java.lang.Throwable -> L11
            r0.add(r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            r2 = 1
            return r2
        L11:
            r2 = move-exception
            goto L16
        L13:
            monitor-exit(r1)
            r2 = 0
            return r2
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    public synchronized boolean d(java.lang.Integer r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashSet r0 = r1.f1112c     // Catch: java.lang.Throwable -> L9
            boolean r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public synchronized void e() {
            r3 = this;
            monitor-enter(r3)
            java.util.HashSet r0 = r3.a     // Catch: java.lang.Throwable -> L39
            r0.clear()     // Catch: java.lang.Throwable -> L39
            java.util.HashSet r0 = r3.f1112c     // Catch: java.lang.Throwable -> L39
            r0.clear()     // Catch: java.lang.Throwable -> L39
            java.util.HashMap r0 = r3.f1113d     // Catch: java.lang.Throwable -> L39
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L39
        L15:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L39
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r1.getValue()     // Catch: java.lang.Throwable -> L39
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L39
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L15
            java.util.HashSet r2 = r3.a     // Catch: java.lang.Throwable -> L39
            java.lang.Object r1 = r1.getKey()     // Catch: java.lang.Throwable -> L39
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L39
            r2.add(r1)     // Catch: java.lang.Throwable -> L39
            goto L15
        L39:
            r0 = move-exception
            goto L6c
        L3b:
            java.lang.String r0 = "SDKConfigManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "init default - mAllConfigDisable="
            r1.append(r2)     // Catch: java.lang.Throwable -> L39
            java.util.HashSet r2 = r3.f1112c     // Catch: java.lang.Throwable -> L39
            r1.append(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L39
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = "SDKConfigManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "init default -- mAllConfigEnable="
            r1.append(r2)     // Catch: java.lang.Throwable -> L39
            java.util.HashSet r2 = r3.a     // Catch: java.lang.Throwable -> L39
            r1.append(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L39
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Throwable -> L39
            goto L86
        L6c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r1.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = "initDefaultConfig failed: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L88
            r1.append(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = "SDKConfigManager"
            cn.jiguang.commons.w.a.c(r1, r0)     // Catch: java.lang.Throwable -> L88
        L86:
            monitor-exit(r3)
            return
        L88:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L88
            throw r0
    }

    public synchronized boolean e(java.lang.Integer r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashSet r0 = r1.a     // Catch: java.lang.Throwable -> L9
            boolean r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public boolean j() {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f1117h
            int r0 = r0.get()
            r1 = 2048(0x800, float:2.87E-42)
            r0 = r0 & r1
            if (r0 == 0) goto Le
            boolean r0 = r2.f1115f
            return r0
        Le:
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f1117h
            r0.addAndGet(r1)
            java.lang.String r0 = "cn.jiguang.joperate.api.JOperateInterface"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L1c
            r0 = 1
            r2.f1115f = r0     // Catch: java.lang.ClassNotFoundException -> L1c
            return r0
        L1c:
            r0 = 0
            r2.f1115f = r0
            return r0
    }

    public boolean k() {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f1117h
            int r0 = r0.get()
            r1 = 64
            r0 = r0 & r1
            if (r0 == 0) goto Le
            boolean r0 = r2.f1116g
            return r0
        Le:
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f1117h
            r0.addAndGet(r1)
            java.lang.String r0 = "cn.jiguang.verifysdk.api.JVerificationInterface"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L1c
            r0 = 1
            r2.f1116g = r0     // Catch: java.lang.ClassNotFoundException -> L1c
            return r0
        L1c:
            r0 = 0
            r2.f1116g = r0
            return r0
    }

    public boolean l() {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f1117h
            int r0 = r0.get()
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto Ld
            boolean r0 = r2.f1114e
            return r0
        Ld:
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f1117h
            r0.addAndGet(r1)
            java.lang.String r0 = "cn.jpush.android.api.JPushInterface"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L1a
            r2.f1114e = r1     // Catch: java.lang.ClassNotFoundException -> L1a
            return r1
        L1a:
            r0 = 0
            r2.f1114e = r0
            return r0
    }
}
