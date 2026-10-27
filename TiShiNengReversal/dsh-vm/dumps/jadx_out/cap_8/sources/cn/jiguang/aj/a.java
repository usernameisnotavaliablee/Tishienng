package cn.jiguang.aj;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class a extends java.lang.Thread {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final cn.jiguang.aj.a.InterfaceC0013a f492b;

    /* renamed from: c, reason: collision with root package name */
    private final cn.jiguang.aj.e f493c;

    /* renamed from: d, reason: collision with root package name */
    private final long f494d;

    /* renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicLong f495e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f496f;

    /* renamed from: g, reason: collision with root package name */
    private final android.content.Context f497g;

    /* renamed from: h, reason: collision with root package name */
    private final cn.jiguang.au.b f498h;


    /* renamed from: cn.jiguang.aj.a$a, reason: collision with other inner class name */
    public interface InterfaceC0013a {
        void a(cn.jiguang.ak.a r1);
    }

    a(long r8, boolean r10, cn.jiguang.aj.a.InterfaceC0013a r11, android.content.Context r12) {
            r7 = this;
            cn.jiguang.aj.f r5 = new cn.jiguang.aj.f
            r5.<init>()
            r0 = r7
            r1 = r8
            r3 = r10
            r4 = r11
            r6 = r12
            r0.<init>(r1, r3, r4, r5, r6)
            return
    }

    a(long r4, boolean r6, cn.jiguang.aj.a.InterfaceC0013a r7, cn.jiguang.aj.e r8, android.content.Context r9) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            r3.f495e = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r3.f496f = r0
            cn.jiguang.aj.a$1 r0 = new cn.jiguang.aj.a$1
            r0.<init>(r3)
            r3.f498h = r0
            r3.a = r6
            r3.f492b = r7
            r3.f494d = r4
            r3.f493c = r8
            r3.f497g = r9
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicLong a(cn.jiguang.aj.a r0) {
            java.util.concurrent.atomic.AtomicLong r0 = r0.f495e
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean b(cn.jiguang.aj.a r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f496f
            return r0
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r10 = this;
            java.lang.String r0 = "jg_anr_watchdog"
            r10.setName(r0)
            long r0 = r10.f494d
        L7:
            boolean r2 = r10.isInterrupted()
            if (r2 != 0) goto Lbf
            boolean r2 = cn.jiguang.aj.i.a()
            java.lang.String r3 = "ANRWatchDog"
            if (r2 != 0) goto L1b
            java.lang.String r0 = "isSentrySample1 false"
            cn.jiguang.w.f.c(r3, r0)
            return
        L1b:
            java.util.concurrent.atomic.AtomicLong r2 = r10.f495e
            long r4 = r2.get()
            r2 = 0
            r6 = 0
            r8 = 1
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L2b
            r4 = 1
            goto L2c
        L2b:
            r4 = 0
        L2c:
            java.util.concurrent.atomic.AtomicLong r5 = r10.f495e
            r5.addAndGet(r0)
            if (r4 == 0) goto L3a
            cn.jiguang.aj.e r4 = r10.f493c
            cn.jiguang.au.b r5 = r10.f498h
            r4.a(r5)
        L3a:
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> La6
            java.util.concurrent.atomic.AtomicLong r2 = r10.f495e
            long r4 = r2.get()
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L7
            java.util.concurrent.atomic.AtomicBoolean r2 = r10.f496f
            boolean r2 = r2.get()
            if (r2 != 0) goto L7
            boolean r2 = r10.a
            if (r2 != 0) goto L6a
            boolean r2 = android.os.Debug.isDebuggerConnected()
            if (r2 != 0) goto L5f
            boolean r2 = android.os.Debug.waitingForDebugger()
            if (r2 == 0) goto L6a
        L5f:
            java.lang.String r2 = "An ANR was detected but ignored because the debugger is connected."
            cn.jiguang.w.f.i(r3, r2)
        L64:
            java.util.concurrent.atomic.AtomicBoolean r2 = r10.f496f
            r2.set(r8)
            goto L7
        L6a:
            boolean r0 = cn.jiguang.aj.i.a()
            if (r0 != 0) goto L76
            java.lang.String r0 = "isSentrySample2 false"
            cn.jiguang.w.f.c(r3, r0)
            return
        L76:
            java.lang.String r0 = "Raising ANR"
            cn.jiguang.w.f.i(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Application Not Responding for at least "
            r0.append(r1)
            long r1 = r10.f494d
            r0.append(r1)
            java.lang.String r1 = " ms."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            cn.jiguang.ak.a r1 = new cn.jiguang.ak.a
            cn.jiguang.aj.e r2 = r10.f493c
            java.lang.Thread r2 = r2.a()
            r1.<init>(r0, r2)
            cn.jiguang.aj.a$a r0 = r10.f492b
            r0.a(r1)
            long r0 = r10.f494d
            goto L64
        La6:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r2] = r0
            java.lang.String r0 = "Interrupted: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            cn.jiguang.w.f.i(r3, r0)
        Lbf:
            return
    }
}
