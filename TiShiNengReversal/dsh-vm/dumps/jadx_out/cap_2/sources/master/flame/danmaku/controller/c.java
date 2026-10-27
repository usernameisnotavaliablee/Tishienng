package master.flame.danmaku.controller;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class c extends android.os.Handler {
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 3;
    public static final int F = 4;
    public static final int G = 5;
    private static final int H = 6;
    private static final int I = 7;
    private static final int J = 8;
    private static final int K = 9;
    private static final int L = 10;
    private static final int M = 11;
    private static final int N = 12;
    private static final int O = 13;
    private static final long P = 10000000;
    private static final int Q = 500;
    private boolean A;
    private boolean B;
    private master.flame.danmaku.danmaku.model.android.DanmakuContext a;
    private master.flame.danmaku.controller.c.e b;
    private long c;
    private boolean d;
    private long e;
    private boolean f;
    private master.flame.danmaku.controller.c.d g;
    private master.flame.danmaku.danmaku.model.f h;
    private master.flame.danmaku.danmaku.parser.a i;
    public master.flame.danmaku.controller.h j;
    private master.flame.danmaku.controller.g k;
    private boolean l;
    private master.flame.danmaku.danmaku.model.b m;
    private final u4.a.c n;
    private java.util.LinkedList<java.lang.Long> o;
    private master.flame.danmaku.controller.i p;
    private boolean q;
    private long r;
    private long s;
    private long t;
    private long u;
    private long v;
    private boolean w;
    private long x;
    private long y;
    private boolean z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ master.flame.danmaku.controller.c a;

        a(master.flame.danmaku.controller.c r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                master.flame.danmaku.controller.c r0 = r3.a
                r1 = 0
                master.flame.danmaku.controller.c.a(r0, r1)
                master.flame.danmaku.controller.c r0 = r3.a
                r1 = 1
                master.flame.danmaku.controller.c.c(r0, r1)
                master.flame.danmaku.controller.c r0 = r3.a
                master.flame.danmaku.controller.c$d r0 = master.flame.danmaku.controller.c.l(r0)
                if (r0 == 0) goto L1e
                master.flame.danmaku.controller.c r0 = r3.a
                master.flame.danmaku.controller.c$d r0 = master.flame.danmaku.controller.c.l(r0)
                r0.d()
            L1e:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends master.flame.danmaku.controller.i {
        final /* synthetic */ master.flame.danmaku.controller.c b;

        b(master.flame.danmaku.controller.c r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.<init>(r2)
                return
        }

        @Override // master.flame.danmaku.controller.i, java.lang.Thread, java.lang.Runnable
        public void run() {
                r9 = this;
                long r0 = v4.c.b()
            L4:
                boolean r2 = r9.a()
                if (r2 != 0) goto Laf
                master.flame.danmaku.controller.c r2 = r9.b
                boolean r2 = master.flame.danmaku.controller.c.m(r2)
                if (r2 != 0) goto Laf
                long r2 = v4.c.b()
                long r4 = v4.c.b()
                long r4 = r4 - r0
                master.flame.danmaku.controller.c r6 = r9.b
                long r6 = master.flame.danmaku.controller.c.n(r6)
                long r6 = r6 - r4
                r4 = 1
                int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r8 <= 0) goto L2c
                v4.c.a(r4)
                goto L4
            L2c:
                master.flame.danmaku.controller.c r0 = r9.b
                long r0 = master.flame.danmaku.controller.c.o(r0, r2)
                r4 = 0
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 >= 0) goto L3f
                r4 = 60
                long r4 = r4 - r0
                v4.c.a(r4)
                goto Lac
            L3f:
                master.flame.danmaku.controller.c r0 = r9.b
                master.flame.danmaku.controller.g r0 = master.flame.danmaku.controller.c.p(r0)
                long r0 = r0.i()
                master.flame.danmaku.controller.c r4 = r9.b
                long r4 = master.flame.danmaku.controller.c.q(r4)
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 <= 0) goto L65
                master.flame.danmaku.controller.c r4 = r9.b
                master.flame.danmaku.danmaku.model.f r4 = master.flame.danmaku.controller.c.r(r4)
                r4.a(r0)
                master.flame.danmaku.controller.c r0 = r9.b
                java.util.LinkedList r0 = master.flame.danmaku.controller.c.s(r0)
                r0.clear()
            L65:
                master.flame.danmaku.controller.c r0 = r9.b
                boolean r0 = master.flame.danmaku.controller.c.b(r0)
                if (r0 != 0) goto L76
                master.flame.danmaku.controller.c r0 = r9.b
                r4 = 10000000(0x989680, double:4.9406565E-317)
                master.flame.danmaku.controller.c.d(r0, r4)
                goto Lac
            L76:
                master.flame.danmaku.controller.c r0 = r9.b
                u4.a$c r0 = master.flame.danmaku.controller.c.e(r0)
                boolean r0 = r0.p
                if (r0 == 0) goto Lac
                master.flame.danmaku.controller.c r0 = r9.b
                boolean r0 = master.flame.danmaku.controller.c.f(r0)
                if (r0 == 0) goto Lac
                master.flame.danmaku.controller.c r0 = r9.b
                u4.a$c r0 = master.flame.danmaku.controller.c.e(r0)
                long r0 = r0.o
                master.flame.danmaku.controller.c r4 = r9.b
                master.flame.danmaku.danmaku.model.f r4 = master.flame.danmaku.controller.c.r(r4)
                long r4 = r4.a
                long r0 = r0 - r4
                r4 = 500(0x1f4, double:2.47E-321)
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 <= 0) goto Lac
                master.flame.danmaku.controller.c r4 = r9.b
                master.flame.danmaku.controller.c.g(r4)
                master.flame.danmaku.controller.c r4 = r9.b
                r5 = 10
                long r0 = r0 - r5
                master.flame.danmaku.controller.c.d(r4, r0)
            Lac:
                r0 = r2
                goto L4
            Laf:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: master.flame.danmaku.controller.c$c, reason: collision with other inner class name */
    class C0122c implements master.flame.danmaku.controller.h.a {
        final /* synthetic */ java.lang.Runnable a;
        final /* synthetic */ master.flame.danmaku.controller.c b;

        C0122c(master.flame.danmaku.controller.c r1, java.lang.Runnable r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // master.flame.danmaku.controller.h.a
        public void a(master.flame.danmaku.danmaku.model.d r2) {
                r1 = this;
                master.flame.danmaku.controller.c r0 = r1.b
                master.flame.danmaku.controller.c$d r0 = master.flame.danmaku.controller.c.l(r0)
                if (r0 == 0) goto L11
                master.flame.danmaku.controller.c r0 = r1.b
                master.flame.danmaku.controller.c$d r0 = master.flame.danmaku.controller.c.l(r0)
                r0.a(r2)
            L11:
                return
        }

        @Override // master.flame.danmaku.controller.h.a
        public void b(master.flame.danmaku.danmaku.model.d r5) {
                r4 = this;
                boolean r0 = r5.w()
                if (r0 == 0) goto L7
                goto L53
            L7:
                long r0 = r5.b()
                master.flame.danmaku.controller.c r5 = r4.b
                long r2 = r5.A()
                long r0 = r0 - r2
                master.flame.danmaku.controller.c r5 = r4.b
                master.flame.danmaku.danmaku.model.android.DanmakuContext r5 = master.flame.danmaku.controller.c.i(r5)
                master.flame.danmaku.danmaku.model.android.d r5 = r5.D
                long r2 = r5.e
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 >= 0) goto L38
                master.flame.danmaku.controller.c r5 = r4.b
                boolean r5 = master.flame.danmaku.controller.c.j(r5)
                if (r5 != 0) goto L32
                master.flame.danmaku.controller.c r5 = r4.b
                u4.a$c r5 = master.flame.danmaku.controller.c.e(r5)
                boolean r5 = r5.p
                if (r5 == 0) goto L38
            L32:
                master.flame.danmaku.controller.c r5 = r4.b
                master.flame.danmaku.controller.c.g(r5)
                return
            L38:
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 <= 0) goto L53
                master.flame.danmaku.controller.c r5 = r4.b
                master.flame.danmaku.danmaku.model.android.DanmakuContext r5 = master.flame.danmaku.controller.c.i(r5)
                master.flame.danmaku.danmaku.model.android.d r5 = r5.D
                long r2 = r5.e
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 > 0) goto L53
                master.flame.danmaku.controller.c r5 = r4.b
                r2 = 11
                r5.sendEmptyMessageDelayed(r2, r0)
            L53:
                return
        }

        @Override // master.flame.danmaku.controller.h.a
        public void c() {
                r1 = this;
                master.flame.danmaku.controller.c r0 = r1.b
                master.flame.danmaku.controller.c.h(r0)
                java.lang.Runnable r0 = r1.a
                r0.run()
                return
        }

        @Override // master.flame.danmaku.controller.h.a
        public void d() {
                r1 = this;
                master.flame.danmaku.controller.c r0 = r1.b
                master.flame.danmaku.controller.c$d r0 = master.flame.danmaku.controller.c.l(r0)
                if (r0 == 0) goto L11
                master.flame.danmaku.controller.c r0 = r1.b
                master.flame.danmaku.controller.c$d r0 = master.flame.danmaku.controller.c.l(r0)
                r0.b()
            L11:
                return
        }

        @Override // master.flame.danmaku.controller.h.a
        public void e() {
                r1 = this;
                master.flame.danmaku.controller.c r0 = r1.b
                master.flame.danmaku.controller.c.k(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d {
        void a(master.flame.danmaku.danmaku.model.d r1);

        void b();

        void c(master.flame.danmaku.danmaku.model.f r1);

        void d();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @android.annotation.TargetApi(16)
    private class e implements android.view.Choreographer.FrameCallback {
        final /* synthetic */ master.flame.danmaku.controller.c a;

        private e(master.flame.danmaku.controller.c r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ e(master.flame.danmaku.controller.c r1, master.flame.danmaku.controller.c.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long r1) {
                r0 = this;
                master.flame.danmaku.controller.c r1 = r0.a
                r2 = 2
                r1.sendEmptyMessage(r2)
                return
        }
    }

    public c(android.os.Looper r3, master.flame.danmaku.controller.g r4, boolean r5) {
            r2 = this;
            r2.<init>(r3)
            r0 = 0
            r2.c = r0
            r3 = 1
            r2.d = r3
            master.flame.danmaku.danmaku.model.f r0 = new master.flame.danmaku.danmaku.model.f
            r0.<init>()
            r2.h = r0
            r2.l = r3
            u4.a$c r0 = new u4.a$c
            r0.<init>()
            r2.n = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r2.o = r0
            r0 = 30
            r2.r = r0
            r0 = 60
            r2.s = r0
            r0 = 16
            r2.t = r0
            boolean r0 = tv.cjump.jni.DeviceUtils.g()
            r3 = r3 ^ r0
            r2.B = r3
            r2.u(r4)
            if (r5 == 0) goto L3e
            r3 = 0
            r2.Z(r3)
            goto L42
        L3e:
            r3 = 0
            r2.E(r3)
        L42:
            r2.l = r5
            return
    }

    private void F() {
            r8 = this;
            r0 = 16
            float r2 = (float) r0
            r3 = 1075838976(0x40200000, float:2.5)
            float r2 = r2 * r3
            long r4 = (long) r2
            r6 = 33
            long r4 = java.lang.Math.max(r6, r4)
            r8.r = r4
            float r2 = (float) r4
            float r2 = r2 * r3
            long r2 = (long) r2
            r8.s = r2
            r2 = 15
            long r0 = java.lang.Math.max(r0, r2)
            r8.t = r0
            r2 = 3
            long r0 = r0 + r2
            r8.u = r0
            return
    }

    private void K() {
            r2 = this;
            boolean r0 = r2.A
            if (r0 != 0) goto L5
            return
        L5:
            master.flame.danmaku.controller.h r0 = r2.j
            if (r0 == 0) goto Lc
            r0.i()
        Lc:
            boolean r0 = r2.q
            if (r0 == 0) goto L27
            monitor-enter(r2)
            java.util.LinkedList<java.lang.Long> r0 = r2.o     // Catch: java.lang.Throwable -> L24
            r0.clear()     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            master.flame.danmaku.controller.h r0 = r2.j
            monitor-enter(r0)
            master.flame.danmaku.controller.h r1 = r2.j     // Catch: java.lang.Throwable -> L21
            r1.notifyAll()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            goto L33
        L21:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r1
        L24:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            throw r0
        L27:
            java.util.LinkedList<java.lang.Long> r0 = r2.o
            r0.clear()
            r0 = 2
            r2.removeMessages(r0)
            r2.sendEmptyMessage(r0)
        L33:
            r0 = 0
            r2.A = r0
            return
    }

    private void N(java.lang.Runnable r10) {
            r9 = this;
            master.flame.danmaku.controller.h r0 = r9.j
            if (r0 != 0) goto L31
            master.flame.danmaku.controller.g r0 = r9.k
            boolean r2 = r0.d()
            master.flame.danmaku.danmaku.model.f r3 = r9.h
            master.flame.danmaku.controller.g r0 = r9.k
            android.content.Context r4 = r0.getContext()
            master.flame.danmaku.controller.g r0 = r9.k
            int r5 = r0.getWidth()
            master.flame.danmaku.controller.g r0 = r9.k
            int r6 = r0.getHeight()
            master.flame.danmaku.controller.g r0 = r9.k
            boolean r7 = r0.isHardwareAccelerated()
            master.flame.danmaku.controller.c$c r8 = new master.flame.danmaku.controller.c$c
            r8.<init>(r9, r10)
            r1 = r9
            master.flame.danmaku.controller.h r10 = r1.w(r2, r3, r4, r5, r6, r7, r8)
            r1.j = r10
            return
        L31:
            r1 = r9
            r10.run()
            return
    }

    private void P() {
            r3 = this;
            master.flame.danmaku.controller.i r0 = r3.p
            if (r0 == 0) goto L1a
            r1 = 0
            r3.p = r1
            master.flame.danmaku.controller.h r1 = r3.j
            monitor-enter(r1)
            master.flame.danmaku.controller.h r2 = r3.j     // Catch: java.lang.Throwable -> L17
            r2.notifyAll()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            r0.b()
            r0.join()     // Catch: java.lang.InterruptedException -> L16
        L16:
            return
        L17:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
        L1a:
            return
    }

    private synchronized void Q() {
            r3 = this;
            monitor-enter(r3)
            long r0 = v4.c.b()     // Catch: java.lang.Throwable -> L1e
            java.util.LinkedList<java.lang.Long> r2 = r3.o     // Catch: java.lang.Throwable -> L1e
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L1e
            r2.addLast(r0)     // Catch: java.lang.Throwable -> L1e
            java.util.LinkedList<java.lang.Long> r0 = r3.o     // Catch: java.lang.Throwable -> L1e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L1e
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 <= r1) goto L20
            java.util.LinkedList<java.lang.Long> r0 = r3.o     // Catch: java.lang.Throwable -> L1e
            r0.removeFirst()     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r0 = move-exception
            goto L22
        L20:
            monitor-exit(r3)
            return
        L22:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }

    private void R() {
            r3 = this;
            boolean r0 = r3.d
            if (r0 == 0) goto L12
            boolean r0 = r3.l
            if (r0 == 0) goto L12
            r0 = 12
            r3.removeMessages(r0)
            r1 = 100
            r3.sendEmptyMessageDelayed(r0, r1)
        L12:
            return
    }

    static /* synthetic */ long a(master.flame.danmaku.controller.c r0, long r1) {
            r0.c = r1
            return r1
    }

    private final long a0(long r12) {
            r11 = this;
            boolean r0 = r11.w
            r1 = 0
            if (r0 != 0) goto L93
            boolean r0 = r11.z
            if (r0 == 0) goto Lc
            goto L93
        Lc:
            r0 = 1
            r11.z = r0
            long r3 = r11.e
            long r12 = r12 - r3
            boolean r0 = r11.l
            if (r0 == 0) goto L80
            u4.a$c r0 = r11.n
            boolean r0 = r0.p
            if (r0 != 0) goto L80
            boolean r0 = r11.A
            if (r0 == 0) goto L21
            goto L80
        L21:
            master.flame.danmaku.danmaku.model.f r0 = r11.h
            long r3 = r0.a
            long r12 = r12 - r3
            long r3 = r11.t
            long r5 = r11.y()
            long r3 = java.lang.Math.max(r3, r5)
            r5 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 > 0) goto L77
            u4.a$c r0 = r11.n
            long r5 = r0.m
            long r7 = r11.r
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L77
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L45
            goto L77
        L45:
            long r0 = r11.t
            long r5 = r12 / r0
            long r3 = r3 + r5
            long r0 = java.lang.Math.max(r0, r3)
            long r2 = r11.r
            long r0 = java.lang.Math.min(r2, r0)
            long r2 = r11.v
            long r4 = r0 - r2
            r6 = 3
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L71
            r6 = 8
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L71
            long r4 = r11.t
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L71
            long r4 = r11.r
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L71
            r0 = r2
        L71:
            long r12 = r12 - r0
            r11.v = r0
            r9 = r0
            r1 = r12
            r12 = r9
        L77:
            r11.y = r1
            master.flame.danmaku.danmaku.model.f r0 = r11.h
            r0.a(r12)
            r1 = r12
            goto L87
        L80:
            master.flame.danmaku.danmaku.model.f r0 = r11.h
            r0.update(r12)
            r11.y = r1
        L87:
            master.flame.danmaku.controller.c$d r12 = r11.g
            if (r12 == 0) goto L90
            master.flame.danmaku.danmaku.model.f r13 = r11.h
            r12.c(r13)
        L90:
            r12 = 0
            r11.z = r12
        L93:
            return r1
    }

    static /* synthetic */ boolean b(master.flame.danmaku.controller.c r0) {
            boolean r0 = r0.l
            return r0
    }

    private void b0() {
            r2 = this;
            boolean r0 = r2.A
            if (r0 == 0) goto Lb
            long r0 = v4.c.b()
            r2.a0(r0)
        Lb:
            return
    }

    static /* synthetic */ boolean c(master.flame.danmaku.controller.c r0, boolean r1) {
            r0.f = r1
            return r1
    }

    @android.annotation.TargetApi(16)
    private void c0() {
            r6 = this;
            boolean r0 = r6.d
            if (r0 == 0) goto L5
            goto L62
        L5:
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            master.flame.danmaku.controller.c$e r1 = r6.b
            r0.postFrameCallback(r1)
            long r0 = v4.c.b()
            long r0 = r6.a0(r0)
            r2 = 0
            r4 = 2
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L21
            r6.removeMessages(r4)
            return
        L21:
            master.flame.danmaku.controller.g r0 = r6.k
            long r0 = r0.i()
            r6.removeMessages(r4)
            long r2 = r6.s
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L3a
            master.flame.danmaku.danmaku.model.f r2 = r6.h
            r2.a(r0)
            java.util.LinkedList<java.lang.Long> r0 = r6.o
            r0.clear()
        L3a:
            boolean r0 = r6.l
            if (r0 != 0) goto L45
            r0 = 10000000(0x989680, double:4.9406565E-317)
            r6.f0(r0)
            return
        L45:
            u4.a$c r0 = r6.n
            boolean r1 = r0.p
            if (r1 == 0) goto L62
            boolean r1 = r6.B
            if (r1 == 0) goto L62
            long r0 = r0.o
            master.flame.danmaku.danmaku.model.f r2 = r6.h
            long r2 = r2.a
            long r0 = r0 - r2
            r2 = 500(0x1f4, double:2.47E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L62
            r2 = 10
            long r0 = r0 - r2
            r6.f0(r0)
        L62:
            return
    }

    static /* synthetic */ void d(master.flame.danmaku.controller.c r0, long r1) {
            r0.f0(r1)
            return
    }

    private void d0() {
            r8 = this;
            boolean r0 = r8.d
            if (r0 == 0) goto L5
            return
        L5:
            long r0 = v4.c.b()
            long r0 = r8.a0(r0)
            r2 = 0
            r4 = 2
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L1e
            r8.removeMessages(r4)
            r2 = 60
            long r2 = r2 - r0
            r8.sendEmptyMessageDelayed(r4, r2)
            return
        L1e:
            master.flame.danmaku.controller.g r0 = r8.k
            long r0 = r0.i()
            r8.removeMessages(r4)
            long r2 = r8.s
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L37
            master.flame.danmaku.danmaku.model.f r2 = r8.h
            r2.a(r0)
            java.util.LinkedList<java.lang.Long> r2 = r8.o
            r2.clear()
        L37:
            boolean r2 = r8.l
            if (r2 != 0) goto L42
            r0 = 10000000(0x989680, double:4.9406565E-317)
            r8.f0(r0)
            return
        L42:
            u4.a$c r2 = r8.n
            boolean r3 = r2.p
            if (r3 == 0) goto L60
            boolean r3 = r8.B
            if (r3 == 0) goto L60
            long r2 = r2.o
            master.flame.danmaku.danmaku.model.f r5 = r8.h
            long r5 = r5.a
            long r2 = r2 - r5
            r5 = 500(0x1f4, double:2.47E-321)
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L60
            r0 = 10
            long r2 = r2 - r0
            r8.f0(r2)
            return
        L60:
            long r2 = r8.t
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L6b
            long r2 = r2 - r0
            r8.sendEmptyMessageDelayed(r4, r2)
            return
        L6b:
            r8.sendEmptyMessage(r4)
            return
    }

    static /* synthetic */ u4.a.c e(master.flame.danmaku.controller.c r0) {
            u4.a$c r0 = r0.n
            return r0
    }

    private void e0() {
            r2 = this;
            master.flame.danmaku.controller.i r0 = r2.p
            if (r0 == 0) goto L5
            return
        L5:
            master.flame.danmaku.controller.c$b r0 = new master.flame.danmaku.controller.c$b
            java.lang.String r1 = "DFM Update"
            r0.<init>(r2, r1)
            r2.p = r0
            r0.start()
            return
    }

    static /* synthetic */ boolean f(master.flame.danmaku.controller.c r0) {
            boolean r0 = r0.B
            return r0
    }

    private void f0(long r6) {
            r5 = this;
            boolean r0 = r5.I()
            if (r0 != 0) goto L5a
            boolean r0 = r5.H()
            if (r0 == 0) goto L5a
            boolean r0 = r5.w
            if (r0 == 0) goto L11
            goto L5a
        L11:
            u4.a$c r0 = r5.n
            long r1 = v4.c.b()
            r0.q = r1
            r0 = 1
            r5.A = r0
            boolean r0 = r5.q
            r1 = 10000000(0x989680, double:4.9406565E-317)
            r3 = 11
            if (r0 == 0) goto L45
            master.flame.danmaku.controller.i r0 = r5.p
            if (r0 != 0) goto L2a
            goto L5a
        L2a:
            master.flame.danmaku.controller.h r0 = r5.j     // Catch: java.lang.InterruptedException -> L5a
            monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L5a
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 != 0) goto L39
            master.flame.danmaku.controller.h r6 = r5.j     // Catch: java.lang.Throwable -> L37
            r6.wait()     // Catch: java.lang.Throwable -> L37
            goto L3e
        L37:
            r6 = move-exception
            goto L43
        L39:
            master.flame.danmaku.controller.h r1 = r5.j     // Catch: java.lang.Throwable -> L37
            r1.wait(r6)     // Catch: java.lang.Throwable -> L37
        L3e:
            r5.sendEmptyMessage(r3)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r6     // Catch: java.lang.InterruptedException -> L5a
        L45:
            r0 = 2
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 != 0) goto L51
            r5.removeMessages(r3)
            r5.removeMessages(r0)
            return
        L51:
            r5.removeMessages(r3)
            r5.removeMessages(r0)
            r5.sendEmptyMessageDelayed(r3, r6)
        L5a:
            return
    }

    static /* synthetic */ void g(master.flame.danmaku.controller.c r0) {
            r0.K()
            return
    }

    static /* synthetic */ void h(master.flame.danmaku.controller.c r0) {
            r0.F()
            return
    }

    static /* synthetic */ master.flame.danmaku.danmaku.model.android.DanmakuContext i(master.flame.danmaku.controller.c r0) {
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r0.a
            return r0
    }

    static /* synthetic */ boolean j(master.flame.danmaku.controller.c r0) {
            boolean r0 = r0.A
            return r0
    }

    static /* synthetic */ void k(master.flame.danmaku.controller.c r0) {
            r0.R()
            return
    }

    static /* synthetic */ master.flame.danmaku.controller.c.d l(master.flame.danmaku.controller.c r0) {
            master.flame.danmaku.controller.c$d r0 = r0.g
            return r0
    }

    static /* synthetic */ boolean m(master.flame.danmaku.controller.c r0) {
            boolean r0 = r0.d
            return r0
    }

    static /* synthetic */ long n(master.flame.danmaku.controller.c r2) {
            long r0 = r2.t
            return r0
    }

    static /* synthetic */ long o(master.flame.danmaku.controller.c r0, long r1) {
            long r0 = r0.a0(r1)
            return r0
    }

    static /* synthetic */ master.flame.danmaku.controller.g p(master.flame.danmaku.controller.c r0) {
            master.flame.danmaku.controller.g r0 = r0.k
            return r0
    }

    static /* synthetic */ long q(master.flame.danmaku.controller.c r2) {
            long r0 = r2.s
            return r0
    }

    static /* synthetic */ master.flame.danmaku.danmaku.model.f r(master.flame.danmaku.controller.c r0) {
            master.flame.danmaku.danmaku.model.f r0 = r0.h
            return r0
    }

    static /* synthetic */ java.util.LinkedList s(master.flame.danmaku.controller.c r0) {
            java.util.LinkedList<java.lang.Long> r0 = r0.o
            return r0
    }

    private void u(master.flame.danmaku.controller.g r1) {
            r0 = this;
            r0.k = r1
            return
    }

    private master.flame.danmaku.controller.h w(boolean r2, master.flame.danmaku.danmaku.model.f r3, android.content.Context r4, int r5, int r6, boolean r7, master.flame.danmaku.controller.h.a r8) {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r1.a
            master.flame.danmaku.danmaku.model.b r0 = r0.g()
            r1.m = r0
            r0.setSize(r5, r6)
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            master.flame.danmaku.danmaku.model.b r5 = r1.m
            float r6 = r4.density
            int r0 = r4.densityDpi
            float r4 = r4.scaledDensity
            r5.c(r6, r0, r4)
            master.flame.danmaku.danmaku.model.b r4 = r1.m
            master.flame.danmaku.danmaku.model.android.DanmakuContext r5 = r1.a
            float r5 = r5.c
            r4.a(r5)
            master.flame.danmaku.danmaku.model.b r4 = r1.m
            r4.j(r7)
            if (r2 == 0) goto L36
            master.flame.danmaku.controller.a r2 = new master.flame.danmaku.controller.a
            master.flame.danmaku.danmaku.model.android.DanmakuContext r4 = r1.a
            r2.<init>(r3, r4, r8)
            goto L3d
        L36:
            master.flame.danmaku.controller.e r2 = new master.flame.danmaku.controller.e
            master.flame.danmaku.danmaku.model.android.DanmakuContext r4 = r1.a
            r2.<init>(r3, r4, r8)
        L3d:
            master.flame.danmaku.danmaku.parser.a r3 = r1.i
            r2.f(r3)
            r2.prepare()
            r3 = 10
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            android.os.Message r3 = r1.obtainMessage(r3, r4)
            r3.sendToTarget()
            return r2
    }

    private synchronized long y() {
            r5 = this;
            monitor-enter(r5)
            java.util.LinkedList<java.lang.Long> r0 = r5.o     // Catch: java.lang.Throwable -> L2f
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            if (r0 > 0) goto Ld
            monitor-exit(r5)
            return r1
        Ld:
            java.util.LinkedList<java.lang.Long> r3 = r5.o     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r3 = r3.peekFirst()     // Catch: java.lang.Throwable -> L2f
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L2f
            java.util.LinkedList<java.lang.Long> r4 = r5.o     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r4 = r4.peekLast()     // Catch: java.lang.Throwable -> L2f
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L31
            if (r4 != 0) goto L22
            goto L31
        L22:
            long r1 = r4.longValue()     // Catch: java.lang.Throwable -> L2f
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L2f
            long r1 = r1 - r3
            long r3 = (long) r0     // Catch: java.lang.Throwable -> L2f
            long r1 = r1 / r3
            monitor-exit(r5)
            return r1
        L2f:
            r0 = move-exception
            goto L33
        L31:
            monitor-exit(r5)
            return r1
        L33:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2f
            throw r0
    }

    public long A() {
            r4 = this;
            boolean r0 = r4.f
            if (r0 != 0) goto L7
            r0 = 0
            return r0
        L7:
            boolean r0 = r4.w
            if (r0 == 0) goto Le
            long r0 = r4.x
            return r0
        Le:
            boolean r0 = r4.d
            if (r0 != 0) goto L1f
            boolean r0 = r4.A
            if (r0 != 0) goto L17
            goto L1f
        L17:
            long r0 = v4.c.b()
            long r2 = r4.e
        L1d:
            long r0 = r0 - r2
            return r0
        L1f:
            master.flame.danmaku.danmaku.model.f r0 = r4.h
            long r0 = r0.a
            long r2 = r4.y
            goto L1d
    }

    public master.flame.danmaku.danmaku.model.m B() {
            r3 = this;
            master.flame.danmaku.controller.h r0 = r3.j
            if (r0 == 0) goto Ld
            long r1 = r3.A()
            master.flame.danmaku.danmaku.model.m r0 = r0.d(r1)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public master.flame.danmaku.danmaku.model.n C() {
            r1 = this;
            master.flame.danmaku.danmaku.model.b r0 = r1.m
            return r0
    }

    public boolean D() {
            r1 = this;
            boolean r0 = r1.l
            return r0
    }

    public long E(boolean r3) {
            r2 = this;
            boolean r0 = r2.l
            if (r0 != 0) goto L9
            master.flame.danmaku.danmaku.model.f r3 = r2.h
            long r0 = r3.a
            return r0
        L9:
            r0 = 0
            r2.l = r0
            r0 = 8
            r2.removeMessages(r0)
            r0 = 9
            r2.removeMessages(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            android.os.Message r3 = r2.obtainMessage(r0, r3)
            r3.sendToTarget()
            master.flame.danmaku.danmaku.model.f r3 = r2.h
            long r0 = r3.a
            return r0
    }

    public void G(master.flame.danmaku.danmaku.model.d r2, boolean r3) {
            r1 = this;
            master.flame.danmaku.controller.h r0 = r1.j
            if (r0 == 0) goto L9
            if (r2 == 0) goto L9
            r0.b(r2, r3)
        L9:
            r1.R()
            return
    }

    public boolean H() {
            r1 = this;
            boolean r0 = r1.f
            return r0
    }

    public boolean I() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    public void J(int r2, int r3) {
            r1 = this;
            master.flame.danmaku.danmaku.model.b r0 = r1.m
            if (r0 != 0) goto L5
            goto L14
        L5:
            int r0 = r0.getWidth()
            if (r0 != r2) goto L15
            master.flame.danmaku.danmaku.model.b r0 = r1.m
            int r0 = r0.getHeight()
            if (r0 == r3) goto L14
            goto L15
        L14:
            return
        L15:
            master.flame.danmaku.danmaku.model.b r0 = r1.m
            r0.setSize(r2, r3)
            r2 = 10
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            android.os.Message r2 = r1.obtainMessage(r2, r3)
            r2.sendToTarget()
            return
    }

    public void L() {
            r1 = this;
            r0 = 3
            r1.removeMessages(r0)
            r1.b0()
            r0 = 7
            r1.sendEmptyMessage(r0)
            return
    }

    public void M() {
            r3 = this;
            r0 = 0
            r3.f = r0
            master.flame.danmaku.danmaku.model.android.DanmakuContext r1 = r3.a
            byte r1 = r1.F
            if (r1 != 0) goto L11
            master.flame.danmaku.controller.c$e r1 = new master.flame.danmaku.controller.c$e
            r2 = 0
            r1.<init>(r3, r2)
            r3.b = r1
        L11:
            master.flame.danmaku.danmaku.model.android.DanmakuContext r1 = r3.a
            byte r1 = r1.F
            r2 = 1
            if (r1 != r2) goto L19
            r0 = 1
        L19:
            r3.q = r0
            r0 = 5
            r3.sendEmptyMessage(r0)
            return
    }

    public void O() {
            r1 = this;
            r0 = 1
            r1.d = r0
            r0 = 6
            r1.sendEmptyMessage(r0)
            return
    }

    public void S(boolean r2) {
            r1 = this;
            master.flame.danmaku.controller.h r0 = r1.j
            if (r0 == 0) goto L7
            r0.c(r2)
        L7:
            return
    }

    public void T() {
            r1 = this;
            master.flame.danmaku.controller.h r0 = r1.j
            if (r0 == 0) goto L7
            r0.e()
        L7:
            return
    }

    public void U() {
            r1 = this;
            r0 = 7
            r1.removeMessages(r0)
            r0 = 3
            r1.sendEmptyMessage(r0)
            return
    }

    public void V(java.lang.Long r3) {
            r2 = this;
            r0 = 1
            r2.w = r0
            long r0 = r3.longValue()
            r2.x = r0
            r0 = 2
            r2.removeMessages(r0)
            r0 = 3
            r2.removeMessages(r0)
            r0 = 4
            r2.removeMessages(r0)
            android.os.Message r3 = r2.obtainMessage(r0, r3)
            r3.sendToTarget()
            return
    }

    public void W(master.flame.danmaku.controller.c.d r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void X(master.flame.danmaku.danmaku.model.android.DanmakuContext r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void Y(master.flame.danmaku.danmaku.parser.a r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void Z(java.lang.Long r3) {
            r2 = this;
            boolean r0 = r2.l
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.l = r0
            r0 = 8
            r2.removeMessages(r0)
            r1 = 9
            r2.removeMessages(r1)
            android.os.Message r3 = r2.obtainMessage(r0, r3)
            r3.sendToTarget()
            return
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message r12) {
            r11 = this;
            int r0 = r12.what
            r1 = 100
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            switch(r0) {
                case 1: goto L14b;
                case 2: goto L135;
                case 3: goto L195;
                case 4: goto L15c;
                case 5: goto L114;
                case 6: goto Ld6;
                case 7: goto Lc9;
                case 8: goto L88;
                case 9: goto L5a;
                case 10: goto L33;
                case 11: goto L2f;
                case 12: goto L19;
                case 13: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto L1ce
        Ld:
            master.flame.danmaku.controller.h r12 = r11.j
            if (r12 == 0) goto L1ce
            long r0 = r11.A()
            r12.g(r0)
            return
        L19:
            boolean r12 = r11.d
            if (r12 == 0) goto L1ce
            master.flame.danmaku.controller.g r12 = r11.k
            if (r12 == 0) goto L1ce
            master.flame.danmaku.controller.h r12 = r11.j
            r12.i()
            master.flame.danmaku.controller.g r12 = r11.k
            r12.i()
            r11.K()
            return
        L2f:
            r11.K()
            return
        L33:
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r11.a
            master.flame.danmaku.danmaku.model.android.d r1 = r0.D
            r1.j(r0)
            java.lang.Object r12 = r12.obj
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            if (r12 == 0) goto L1ce
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L1ce
            master.flame.danmaku.danmaku.model.android.DanmakuContext r12 = r11.a
            master.flame.danmaku.danmaku.model.j r12 = r12.B
            r12.d()
            master.flame.danmaku.danmaku.model.android.DanmakuContext r12 = r11.a
            master.flame.danmaku.danmaku.model.j r12 = r12.B
            r12.g()
            master.flame.danmaku.controller.h r12 = r11.j
            r12.j()
            return
        L5a:
            r11.l = r5
            master.flame.danmaku.controller.g r1 = r11.k
            if (r1 == 0) goto L63
            r1.clear()
        L63:
            master.flame.danmaku.controller.h r1 = r11.j
            if (r1 == 0) goto L6f
            r1.i()
            master.flame.danmaku.controller.h r1 = r11.j
            r1.m()
        L6f:
            java.lang.Object r12 = r12.obj
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r1 = r12.booleanValue()
            if (r1 == 0) goto L80
            master.flame.danmaku.controller.h r1 = r11.j
            if (r1 == 0) goto L80
            r1.k()
        L80:
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto Lc9
            goto L1ce
        L88:
            r11.l = r6
            java.lang.Object r7 = r12.obj
            java.lang.Long r7 = (java.lang.Long) r7
            master.flame.danmaku.controller.h r8 = r11.j
            if (r8 == 0) goto Lb6
            if (r7 != 0) goto La3
            master.flame.danmaku.danmaku.model.f r7 = r11.h
            long r8 = r11.A()
            r7.update(r8)
            master.flame.danmaku.controller.h r7 = r11.j
            r7.i()
            goto Lb6
        La3:
            r8.start()
            master.flame.danmaku.controller.h r8 = r11.j
            long r9 = r7.longValue()
            r8.seek(r9)
            master.flame.danmaku.controller.h r7 = r11.j
            r7.i()
            r7 = 1
            goto Lb7
        Lb6:
            r7 = 0
        Lb7:
            boolean r8 = r11.d
            if (r8 == 0) goto Lc2
            master.flame.danmaku.controller.g r8 = r11.k
            if (r8 == 0) goto Lc2
            r8.i()
        Lc2:
            r11.K()
            if (r7 != 0) goto L14b
            goto L1ce
        Lc9:
            r11.removeMessages(r3)
            r11.removeMessages(r4)
            master.flame.danmaku.controller.h r12 = r11.j
            if (r12 == 0) goto Ld6
            r12.onPlayStateChanged(r4)
        Ld6:
            r12 = 6
            if (r0 != r12) goto Ldd
            r1 = 0
            r11.removeCallbacksAndMessages(r1)
        Ldd:
            r11.d = r6
            r11.b0()
            master.flame.danmaku.danmaku.model.f r1 = r11.h
            long r1 = r1.a
            r11.c = r1
            master.flame.danmaku.controller.i r1 = r11.p
            if (r1 == 0) goto Lf2
            r11.K()
            r11.P()
        Lf2:
            if (r0 != r12) goto L1ce
            master.flame.danmaku.controller.h r12 = r11.j
            if (r12 == 0) goto Lfb
            r12.k()
        Lfb:
            master.flame.danmaku.danmaku.parser.a r12 = r11.i
            if (r12 == 0) goto L102
            r12.g()
        L102:
            android.os.Looper r12 = r11.getLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r12 == r0) goto L1ce
            android.os.Looper r12 = r11.getLooper()
            r12.quit()
            return
        L114:
            long r3 = v4.c.b()
            r11.e = r3
            master.flame.danmaku.danmaku.parser.a r12 = r11.i
            if (r12 == 0) goto L130
            master.flame.danmaku.controller.g r12 = r11.k
            boolean r12 = r12.l()
            if (r12 != 0) goto L127
            goto L130
        L127:
            master.flame.danmaku.controller.c$a r12 = new master.flame.danmaku.controller.c$a
            r12.<init>(r11)
            r11.N(r12)
            return
        L130:
            r12 = 5
            r11.sendEmptyMessageDelayed(r12, r1)
            return
        L135:
            master.flame.danmaku.danmaku.model.android.DanmakuContext r12 = r11.a
            byte r12 = r12.F
            if (r12 != 0) goto L13f
            r11.c0()
            return
        L13f:
            if (r12 != r6) goto L145
            r11.e0()
            return
        L145:
            if (r12 != r4) goto L1ce
            r11.d0()
            return
        L14b:
            java.lang.Object r7 = r12.obj
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L158
            long r7 = r7.longValue()
            r11.c = r7
            goto L15c
        L158:
            r7 = 0
            r11.c = r7
        L15c:
            r7 = 4
            if (r0 != r7) goto L195
            r11.d = r6
            r11.P()
            java.lang.Object r12 = r12.obj
            java.lang.Long r12 = (java.lang.Long) r12
            long r7 = r12.longValue()
            master.flame.danmaku.danmaku.model.f r0 = r11.h
            long r9 = r0.a
            long r7 = r7 - r9
            long r9 = r11.e
            long r9 = r9 - r7
            r11.e = r9
            long r7 = r12.longValue()
            r0.update(r7)
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r11.a
            master.flame.danmaku.danmaku.model.j r0 = r0.B
            r0.d()
            master.flame.danmaku.controller.h r0 = r11.j
            if (r0 == 0) goto L18f
            long r7 = r12.longValue()
            r0.seek(r7)
        L18f:
            long r7 = r12.longValue()
            r11.c = r7
        L195:
            r12 = 7
            r11.removeMessages(r12)
            r11.d = r5
            boolean r12 = r11.f
            if (r12 == 0) goto L1cf
            u4.a$c r12 = r11.n
            r12.e()
            java.util.LinkedList<java.lang.Long> r12 = r11.o
            r12.clear()
            long r0 = v4.c.b()
            long r7 = r11.c
            long r0 = r0 - r7
            r11.e = r0
            master.flame.danmaku.danmaku.model.f r12 = r11.h
            r12.update(r7)
            r11.removeMessages(r3)
            r11.sendEmptyMessage(r4)
            master.flame.danmaku.controller.h r12 = r11.j
            r12.start()
            r11.K()
            r11.w = r5
            master.flame.danmaku.controller.h r12 = r11.j
            if (r12 == 0) goto L1ce
            r12.onPlayStateChanged(r6)
        L1ce:
            return
        L1cf:
            r11.sendEmptyMessageDelayed(r3, r1)
            return
    }

    public void t(master.flame.danmaku.danmaku.model.d r2) {
            r1 = this;
            master.flame.danmaku.controller.h r0 = r1.j
            if (r0 == 0) goto L1d
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r1.a
            master.flame.danmaku.danmaku.model.j r0 = r0.B
            r2.I = r0
            master.flame.danmaku.danmaku.model.f r0 = r1.h
            r2.F(r0)
            master.flame.danmaku.controller.h r0 = r1.j
            r0.a(r2)
            r2 = 11
            android.os.Message r2 = r1.obtainMessage(r2)
            r2.sendToTarget()
        L1d:
            return
    }

    public void v() {
            r1 = this;
            r0 = 13
            android.os.Message r0 = r1.obtainMessage(r0)
            r0.sendToTarget()
            return
    }

    public u4.a.c x(android.graphics.Canvas r13) {
            r12 = this;
            master.flame.danmaku.controller.h r0 = r12.j
            if (r0 != 0) goto L7
            u4.a$c r13 = r12.n
            return r13
        L7:
            boolean r0 = r12.A
            if (r0 != 0) goto L62
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r12.a
            master.flame.danmaku.danmaku.model.a r0 = r0.o
            if (r0 == 0) goto L62
            boolean r1 = r0.d()
            if (r1 != 0) goto L1c
            boolean r2 = r12.d
            if (r2 == 0) goto L1c
            goto L62
        L1c:
            int r2 = r0.a()
            r3 = 2
            if (r2 != r3) goto L56
            master.flame.danmaku.danmaku.model.f r2 = r12.h
            long r4 = r2.a
            long r6 = r0.c()
            long r8 = r6 - r4
            long r2 = java.lang.Math.abs(r8)
            long r10 = r0.b()
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto L62
            if (r1 == 0) goto L42
            boolean r0 = r12.d
            if (r0 == 0) goto L42
            r12.U()
        L42:
            master.flame.danmaku.controller.h r3 = r12.j
            r3.h(r4, r6, r8)
            master.flame.danmaku.danmaku.model.f r0 = r12.h
            r0.update(r6)
            long r0 = r12.e
            long r0 = r0 - r8
            r12.e = r0
            r0 = 0
            r12.y = r0
            goto L62
        L56:
            r0 = 1
            if (r2 != r0) goto L62
            if (r1 == 0) goto L62
            boolean r0 = r12.d
            if (r0 != 0) goto L62
            r12.L()
        L62:
            master.flame.danmaku.danmaku.model.b r0 = r12.m
            r0.w(r13)
            u4.a$c r13 = r12.n
            master.flame.danmaku.controller.h r0 = r12.j
            master.flame.danmaku.danmaku.model.b r1 = r12.m
            u4.a$c r0 = r0.l(r1)
            r13.f(r0)
            r12.Q()
            u4.a$c r13 = r12.n
            return r13
    }

    public master.flame.danmaku.danmaku.model.android.DanmakuContext z() {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r1.a
            return r0
    }
}
