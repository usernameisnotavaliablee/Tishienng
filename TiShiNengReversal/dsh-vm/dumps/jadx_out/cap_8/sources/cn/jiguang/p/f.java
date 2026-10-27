package cn.jiguang.p;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f {
    private cn.jiguang.n.a a;

    /* renamed from: b, reason: collision with root package name */
    private cn.jiguang.o.a f1399b;

    /* renamed from: c, reason: collision with root package name */
    private cn.jiguang.o.b f1400c;

    /* renamed from: d, reason: collision with root package name */
    private long f1401d;


    private static final class a {
        private static final cn.jiguang.p.f a = null;

        static {
                cn.jiguang.p.f r0 = new cn.jiguang.p.f
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.p.f.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.p.f a() {
                cn.jiguang.p.f r0 = cn.jiguang.p.f.a.a
                return r0
        }
    }

    private f() {
            r2 = this;
            r2.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            r2.f1401d = r0
            return
    }

    /* synthetic */ f(cn.jiguang.p.f.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.p.f a() {
            cn.jiguang.p.f r0 = cn.jiguang.p.f.a.a()
            return r0
    }

    private void a(android.content.Context r9, cn.jiguang.n.c r10) {
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r8.f1401d
            long r0 = r0 - r2
            r2 = 0
            long r0 = java.lang.Math.max(r2, r0)
            int r4 = r10.f1351k
            r5 = 1000(0x3e8, float:1.401E-42)
            int r4 = r4 * 1000
            long r6 = (long) r4
            long r6 = r6 - r0
            long r0 = java.lang.Math.max(r2, r6)
            android.os.Message r2 = android.os.Message.obtain()
            r2.what = r5
            r2.obj = r10
            cn.jiguang.o.a r9 = r8.b(r9)
            r9.sendMessageDelayed(r2, r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "add delay w task, delayTime: "
            r9.append(r2)
            r9.append(r0)
            java.lang.String r0 = ", tPkg: "
            r9.append(r0)
            java.lang.String r10 = r10.a
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "JWakeTaskHelper"
            cn.jiguang.w.f.c(r10, r9)
            return
    }

    private synchronized cn.jiguang.o.a b(android.content.Context r3) {
            r2 = this;
            monitor-enter(r2)
            cn.jiguang.o.b r0 = r2.f1400c     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            java.lang.Thread$State r0 = r0.getState()     // Catch: java.lang.Throwable -> Le
            java.lang.Thread$State r1 = java.lang.Thread.State.TERMINATED     // Catch: java.lang.Throwable -> Le
            if (r0 != r1) goto L19
            goto L10
        Le:
            r3 = move-exception
            goto L40
        L10:
            cn.jiguang.o.b r0 = new cn.jiguang.o.b     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "jg_wk_thread"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le
            r2.f1400c = r0     // Catch: java.lang.Throwable -> Le
        L19:
            cn.jiguang.o.b r0 = r2.f1400c     // Catch: java.lang.Throwable -> Le
            java.lang.Thread$State r0 = r0.getState()     // Catch: java.lang.Throwable -> Le
            java.lang.Thread$State r1 = java.lang.Thread.State.NEW     // Catch: java.lang.Throwable -> Le
            if (r0 != r1) goto L2b
            cn.jiguang.o.b r0 = r2.f1400c     // Catch: java.lang.Throwable -> Le
            r0.start()     // Catch: java.lang.Throwable -> Le
            r0 = 0
            r2.f1399b = r0     // Catch: java.lang.Throwable -> Le
        L2b:
            cn.jiguang.o.a r0 = r2.f1399b     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L3c
            cn.jiguang.o.a r0 = new cn.jiguang.o.a     // Catch: java.lang.Throwable -> Le
            cn.jiguang.o.b r1 = r2.f1400c     // Catch: java.lang.Throwable -> Le
            android.os.Looper r1 = r1.getLooper()     // Catch: java.lang.Throwable -> Le
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le
            r2.f1399b = r0     // Catch: java.lang.Throwable -> Le
        L3c:
            cn.jiguang.o.a r3 = r2.f1399b     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return r3
        L40:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    private void b(android.content.Context r3, cn.jiguang.n.c r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "the delay w task time up, start to process it, tPkg: "
            r0.append(r1)
            java.lang.String r1 = r4.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JWakeTaskHelper"
            cn.jiguang.w.f.c(r1, r0)
            cn.jiguang.p.f$1 r0 = new cn.jiguang.p.f$1
            r0.<init>(r2, r4)
            java.util.List r4 = cn.jiguang.m.a.a(r3, r0)
            if (r4 == 0) goto L41
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L41
            cn.jiguang.n.a r0 = r2.a
            cn.jiguang.p.c.a(r3, r0, r4)
            cn.jiguang.n.a r0 = r2.a
            boolean r1 = r0.w
            if (r1 != 0) goto L38
            boolean r0 = r0.x
            if (r0 == 0) goto L41
        L38:
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L41
            r2.a(r3)
        L41:
            return
    }

    public void a(android.content.Context r7) {
            r6 = this;
            java.lang.String r0 = "JWakeTaskHelper"
            long r1 = cn.jiguang.d.a.f(r7)     // Catch: java.lang.Throwable -> L12
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L14
            java.lang.String r7 = "[First Wake] not registered yet, skip first wake report"
        Le:
            cn.jiguang.w.f.c(r0, r7)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r7 = move-exception
            goto L2a
        L14:
            boolean r1 = cn.jiguang.h.b.f(r7)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L1d
            java.lang.String r7 = "[First Wake] first wake already reported, skip"
            goto Le
        L1d:
            java.lang.String r1 = "[First Wake] first wake detected, trigger immediate report"
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L12
            cn.jiguang.m.d r1 = cn.jiguang.m.d.d()     // Catch: java.lang.Throwable -> L12
            r1.a(r7)     // Catch: java.lang.Throwable -> L12
            return
        L2a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[First Wake] checkAndTriggerFirstWakeReport error:"
            r1.append(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            cn.jiguang.w.f.i(r0, r7)
            return
    }

    public void a(android.content.Context r2, int r3, java.lang.Object r4) {
            r1 = this;
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 == r0) goto L5
            goto Le
        L5:
            boolean r3 = r4 instanceof cn.jiguang.n.c
            if (r3 == 0) goto Le
            cn.jiguang.n.c r4 = (cn.jiguang.n.c) r4
            r1.b(r2, r4)
        Le:
            return
    }

    public void a(android.content.Context r5, cn.jiguang.n.a r6, java.util.List<cn.jiguang.n.c> r7) {
            r4 = this;
            r4.a = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r7 == 0) goto L39
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L39
            java.util.Iterator r1 = r7.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r1.next()
            cn.jiguang.n.c r2 = (cn.jiguang.n.c) r2
            int r3 = r2.f1351k
            int r3 = r3 * 1000
            boolean r3 = r4.a(r3)
            if (r3 == 0) goto L13
            r0.add(r2)
            r4.a(r5, r2)
            goto L13
        L30:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L39
            r7.removeAll(r0)
        L39:
            if (r7 == 0) goto L40
            int r1 = r7.size()
            goto L41
        L40:
            r1 = 0
        L41:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "start w task, wakeTarget size: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = ", dWakeTarget size: "
            r2.append(r3)
            int r0 = r0.size()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "JWakeTaskHelper"
            cn.jiguang.w.f.c(r2, r0)
            if (r1 <= 0) goto L81
            java.util.List r7 = cn.jiguang.m.a.a(r5, r7)
            cn.jiguang.n.a r0 = r4.a
            cn.jiguang.p.c.a(r5, r0, r7)
            boolean r0 = r6.w
            if (r0 != 0) goto L76
            boolean r6 = r6.x
            if (r6 == 0) goto L81
        L76:
            if (r7 == 0) goto L7e
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L81
        L7e:
            r4.a(r5)
        L81:
            return
    }

    public void a(android.content.Context r2, java.util.List<cn.jiguang.n.c> r3) {
            r1 = this;
            cn.jiguang.n.a r0 = cn.jiguang.p.b.b(r2)
            java.util.List r3 = cn.jiguang.m.a.a(r2, r0, r3)
            r1.a(r2, r0, r3)
            return
    }

    public void a(android.content.Context r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L8
            long r1 = java.lang.System.currentTimeMillis()
            r0.f1401d = r1
        L8:
            return
    }

    public boolean a(int r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.z.b.f1599b
            boolean r0 = r0.get()
            if (r0 == 0) goto L18
            if (r5 <= 0) goto L18
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.f1401d
            long r0 = r0 - r2
            long r2 = (long) r5
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L18
            r5 = 1
            return r5
        L18:
            r5 = 0
            return r5
    }
}
