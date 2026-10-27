package master.flame.danmaku.controller;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class e implements master.flame.danmaku.controller.h {
    static final /* synthetic */ boolean w = false;
    protected final master.flame.danmaku.danmaku.model.android.DanmakuContext c;
    protected final master.flame.danmaku.danmaku.model.b d;
    protected master.flame.danmaku.danmaku.model.m e;
    protected master.flame.danmaku.danmaku.parser.a f;
    master.flame.danmaku.controller.h.a g;
    final u4.a h;
    master.flame.danmaku.danmaku.model.f i;
    private master.flame.danmaku.danmaku.model.m j;
    protected boolean k;
    private long l;
    private final u4.a.c m;
    protected boolean n;
    private long o;
    private long p;
    protected int q;
    private boolean r;
    private master.flame.danmaku.danmaku.model.d s;
    private master.flame.danmaku.danmaku.model.android.e t;
    private master.flame.danmaku.danmaku.model.m u;
    private master.flame.danmaku.danmaku.model.android.DanmakuContext.a v;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements master.flame.danmaku.danmaku.model.android.DanmakuContext.a {
        final /* synthetic */ master.flame.danmaku.controller.e a;

        a(master.flame.danmaku.controller.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // master.flame.danmaku.danmaku.model.android.DanmakuContext.a
        public boolean a(master.flame.danmaku.danmaku.model.android.DanmakuContext r2, master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag r3, java.lang.Object... r4) {
                r1 = this;
                master.flame.danmaku.controller.e r0 = r1.a
                boolean r2 = r0.t(r2, r3, r4)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements u4.a.b {
        final /* synthetic */ master.flame.danmaku.controller.e a;

        b(master.flame.danmaku.controller.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(master.flame.danmaku.danmaku.model.d r2) {
                r1 = this;
                master.flame.danmaku.controller.e r0 = r1.a
                master.flame.danmaku.controller.h$a r0 = r0.g
                if (r0 == 0) goto L9
                r0.a(r2)
            L9:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends master.flame.danmaku.danmaku.model.m.c<master.flame.danmaku.danmaku.model.d> {
        final /* synthetic */ master.flame.danmaku.controller.e e;

        c(master.flame.danmaku.controller.e r1) {
                r0 = this;
                r0.e = r1
                r0.<init>()
                return
        }

        @Override // master.flame.danmaku.danmaku.model.m.b
        public /* bridge */ /* synthetic */ int a(java.lang.Object r1) {
                r0 = this;
                master.flame.danmaku.danmaku.model.d r1 = (master.flame.danmaku.danmaku.model.d) r1
                int r1 = r0.e(r1)
                return r1
        }

        public int e(master.flame.danmaku.danmaku.model.d r2) {
                r1 = this;
                boolean r0 = r2.z
                if (r0 == 0) goto Lb
                master.flame.danmaku.controller.e r0 = r1.e
                r0.u(r2)
                r2 = 2
                return r2
            Lb:
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends master.flame.danmaku.danmaku.model.m.c<master.flame.danmaku.danmaku.model.d> {
        long e;
        final /* synthetic */ int f;
        final /* synthetic */ master.flame.danmaku.controller.e g;

        d(master.flame.danmaku.controller.e r1, int r2) {
                r0 = this;
                r0.g = r1
                r0.f = r2
                r0.<init>()
                long r1 = v4.c.b()
                r0.e = r1
                return
        }

        @Override // master.flame.danmaku.danmaku.model.m.b
        public /* bridge */ /* synthetic */ int a(java.lang.Object r1) {
                r0 = this;
                master.flame.danmaku.danmaku.model.d r1 = (master.flame.danmaku.danmaku.model.d) r1
                int r1 = r0.e(r1)
                return r1
        }

        public int e(master.flame.danmaku.danmaku.model.d r8) {
                r7 = this;
                boolean r0 = r8.w()
                long r1 = v4.c.b()
                long r3 = r7.e
                long r1 = r1 - r3
                int r3 = r7.f
                long r3 = (long) r3
                r5 = 1
                int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r6 <= 0) goto L14
                return r5
            L14:
                if (r0 == 0) goto L24
                master.flame.danmaku.controller.e r0 = r7.g
                master.flame.danmaku.danmaku.model.m r0 = r0.e
                r0.e(r8)
                master.flame.danmaku.controller.e r0 = r7.g
                r0.u(r8)
                r8 = 2
                return r8
            L24:
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: master.flame.danmaku.controller.e$e, reason: collision with other inner class name */
    class C0123e extends master.flame.danmaku.danmaku.model.m.c<master.flame.danmaku.danmaku.model.d> {
        final /* synthetic */ master.flame.danmaku.danmaku.model.m e;
        final /* synthetic */ master.flame.danmaku.controller.e f;

        C0123e(master.flame.danmaku.controller.e r1, master.flame.danmaku.danmaku.model.m r2) {
                r0 = this;
                r0.f = r1
                r0.e = r2
                r0.<init>()
                return
        }

        @Override // master.flame.danmaku.danmaku.model.m.b
        public /* bridge */ /* synthetic */ int a(java.lang.Object r1) {
                r0 = this;
                master.flame.danmaku.danmaku.model.d r1 = (master.flame.danmaku.danmaku.model.d) r1
                int r1 = r0.e(r1)
                return r1
        }

        public int e(master.flame.danmaku.danmaku.model.d r2) {
                r1 = this;
                boolean r0 = r2.v()
                if (r0 == 0) goto L11
                boolean r0 = r2.s()
                if (r0 != 0) goto L11
                master.flame.danmaku.danmaku.model.m r0 = r1.e
                r0.j(r2)
            L11:
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements master.flame.danmaku.danmaku.parser.a.InterfaceC0125a {
        final /* synthetic */ master.flame.danmaku.controller.e a;

        f(master.flame.danmaku.controller.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // master.flame.danmaku.danmaku.parser.a.InterfaceC0125a
        public void b(master.flame.danmaku.danmaku.model.d r2) {
                r1 = this;
                master.flame.danmaku.controller.e r0 = r1.a
                master.flame.danmaku.controller.h$a r0 = r0.g
                if (r0 == 0) goto L9
                r0.b(r2)
            L9:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g extends master.flame.danmaku.danmaku.model.m.c<master.flame.danmaku.danmaku.model.d> {
        final /* synthetic */ long e;
        final /* synthetic */ master.flame.danmaku.controller.e f;

        g(master.flame.danmaku.controller.e r1, long r2) {
                r0 = this;
                r0.f = r1
                r0.e = r2
                r0.<init>()
                return
        }

        @Override // master.flame.danmaku.danmaku.model.m.b
        public /* bridge */ /* synthetic */ int a(java.lang.Object r1) {
                r0 = this;
                master.flame.danmaku.danmaku.model.d r1 = (master.flame.danmaku.danmaku.model.d) r1
                int r1 = r0.e(r1)
                return r1
        }

        public int e(master.flame.danmaku.danmaku.model.d r7) {
                r6 = this;
                boolean r0 = r7.s()
                r1 = 2
                if (r0 == 0) goto L8
                return r1
            L8:
                long r2 = r6.e
                long r4 = r7.b
                long r2 = r2 + r4
                r7.E(r2)
                long r2 = r7.b
                r4 = 0
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 != 0) goto L19
                return r1
            L19:
                r7 = 0
                return r7
        }
    }

    static {
            return
    }

    public e(master.flame.danmaku.danmaku.model.f r5, master.flame.danmaku.danmaku.model.android.DanmakuContext r6, master.flame.danmaku.controller.h.a r7) {
            r4 = this;
            r4.<init>()
            master.flame.danmaku.danmaku.model.android.e r0 = new master.flame.danmaku.danmaku.model.android.e
            r1 = 4
            r0.<init>(r1)
            r4.j = r0
            r2 = 0
            r4.l = r2
            u4.a$c r0 = new u4.a$c
            r0.<init>()
            r4.m = r0
            master.flame.danmaku.danmaku.model.android.e r0 = new master.flame.danmaku.danmaku.model.android.e
            r0.<init>(r1)
            r4.t = r0
            master.flame.danmaku.controller.e$a r0 = new master.flame.danmaku.controller.e$a
            r0.<init>(r4)
            r4.v = r0
            if (r6 == 0) goto L69
            r4.c = r6
            master.flame.danmaku.danmaku.model.b r0 = r6.g()
            r4.d = r0
            r4.g = r7
            master.flame.danmaku.danmaku.renderer.android.a r7 = new master.flame.danmaku.danmaku.renderer.android.a
            r7.<init>(r6)
            r4.h = r7
            master.flame.danmaku.controller.e$b r0 = new master.flame.danmaku.controller.e$b
            r0.<init>(r4)
            r7.a(r0)
            boolean r0 = r6.r()
            if (r0 != 0) goto L4e
            boolean r0 = r6.q()
            if (r0 == 0) goto L4c
            goto L4e
        L4c:
            r0 = 0
            goto L4f
        L4e:
            r0 = 1
        L4f:
            r7.b(r0)
            r4.r(r5)
            boolean r5 = r6.p()
            java.lang.String r7 = "1017_Filter"
            if (r5 == 0) goto L63
            master.flame.danmaku.controller.b r5 = r6.C
            r5.f(r7)
            return
        L63:
            master.flame.danmaku.controller.b r5 = r6.C
            r5.k(r7)
            return
        L69:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "context is null"
            r5.<init>(r6)
            throw r5
    }

    private void n(u4.a.c r4, master.flame.danmaku.danmaku.model.m r5, master.flame.danmaku.danmaku.model.m r6) {
            r3 = this;
            r4.e()
            master.flame.danmaku.danmaku.model.f r0 = r4.b
            long r1 = v4.c.b()
            r0.update(r1)
            r0 = 0
            r4.c = r0
            if (r5 == 0) goto L16
            int r5 = r5.size()
            goto L17
        L16:
            r5 = 0
        L17:
            if (r6 == 0) goto L1d
            int r0 = r6.size()
        L1d:
            int r5 = r5 + r0
            r4.d = r5
            return
    }

    private void p(u4.a.c r5) {
            r4 = this;
            int r0 = r5.k
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            r5.p = r0
            r1 = -1
            if (r0 == 0) goto Lf
            r5.n = r1
        Lf:
            master.flame.danmaku.danmaku.model.d r0 = r5.e
            r3 = 0
            r5.e = r3
            if (r0 == 0) goto L1a
            long r1 = r0.b()
        L1a:
            r5.o = r1
            master.flame.danmaku.danmaku.model.f r0 = r5.b
            long r1 = v4.c.b()
            long r0 = r0.update(r1)
            r5.m = r0
            return
    }

    @Override // master.flame.danmaku.controller.h
    public synchronized void a(master.flame.danmaku.danmaku.model.d r6) {
            r5 = this;
            monitor-enter(r5)
            master.flame.danmaku.danmaku.model.m r0 = r5.e     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L7
            monitor-exit(r5)
            return
        L7:
            boolean r0 = r6.z     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L18
            master.flame.danmaku.danmaku.model.android.e r0 = r5.t     // Catch: java.lang.Throwable -> L16
            r0.j(r6)     // Catch: java.lang.Throwable -> L16
            r0 = 10
            r5.v(r0)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r6 = move-exception
            goto L81
        L18:
            master.flame.danmaku.danmaku.model.m r0 = r5.e     // Catch: java.lang.Throwable -> L16
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L16
            r6.s = r0     // Catch: java.lang.Throwable -> L16
            long r0 = r5.o     // Catch: java.lang.Throwable -> L16
            long r2 = r6.b()     // Catch: java.lang.Throwable -> L16
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L42
            long r0 = r6.b()     // Catch: java.lang.Throwable -> L16
            long r2 = r5.p     // Catch: java.lang.Throwable -> L16
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L42
            master.flame.danmaku.danmaku.model.m r0 = r5.j     // Catch: java.lang.Throwable -> L16
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L16
            master.flame.danmaku.danmaku.model.m r1 = r5.j     // Catch: java.lang.Throwable -> L3f
            boolean r1 = r1.j(r6)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            goto L49
        L3f:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r6     // Catch: java.lang.Throwable -> L16
        L42:
            boolean r0 = r6.z     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L48
            r1 = 0
            goto L49
        L48:
            r1 = 1
        L49:
            master.flame.danmaku.danmaku.model.m r0 = r5.e     // Catch: java.lang.Throwable -> L16
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L16
            master.flame.danmaku.danmaku.model.m r2 = r5.e     // Catch: java.lang.Throwable -> L7e
            boolean r2 = r2.j(r6)     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L57
            if (r2 != 0) goto L5d
        L57:
            r0 = 0
            r5.p = r0     // Catch: java.lang.Throwable -> L16
            r5.o = r0     // Catch: java.lang.Throwable -> L16
        L5d:
            if (r2 == 0) goto L66
            master.flame.danmaku.controller.h$a r0 = r5.g     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L66
            r0.b(r6)     // Catch: java.lang.Throwable -> L16
        L66:
            master.flame.danmaku.danmaku.model.d r0 = r5.s     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L7a
            if (r0 == 0) goto L7c
            long r0 = r6.b()     // Catch: java.lang.Throwable -> L16
            master.flame.danmaku.danmaku.model.d r2 = r5.s     // Catch: java.lang.Throwable -> L16
            long r2 = r2.b()     // Catch: java.lang.Throwable -> L16
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L7c
        L7a:
            r5.s = r6     // Catch: java.lang.Throwable -> L16
        L7c:
            monitor-exit(r5)
            return
        L7e:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            throw r6     // Catch: java.lang.Throwable -> L16
        L81:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L16
            throw r6
    }

    @Override // master.flame.danmaku.controller.h
    public void b(master.flame.danmaku.danmaku.model.d r3, boolean r4) {
            r2 = this;
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r2.c
            master.flame.danmaku.danmaku.model.b r0 = r0.g()
            master.flame.danmaku.danmaku.model.android.b r0 = r0.t()
            r0.a(r3)
            int r0 = r3.J
            r1 = r0 | 2
            r3.J = r1
            if (r4 == 0) goto L25
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.p = r4
            r3.q = r4
            r4 = r0 | 3
            r3.J = r4
            int r4 = r3.v
            int r4 = r4 + 1
            r3.v = r4
        L25:
            return
    }

    @Override // master.flame.danmaku.controller.h
    public synchronized void c(boolean r10) {
            r9 = this;
            monitor-enter(r9)
            master.flame.danmaku.danmaku.model.m r0 = r9.e     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto Lc
            goto L3a
        Lc:
            master.flame.danmaku.danmaku.model.m r0 = r9.e     // Catch: java.lang.Throwable -> L38
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != 0) goto L2e
            master.flame.danmaku.danmaku.model.f r10 = r9.i     // Catch: java.lang.Throwable -> L2c
            long r1 = r10.a     // Catch: java.lang.Throwable -> L2c
            master.flame.danmaku.danmaku.model.android.DanmakuContext r10 = r9.c     // Catch: java.lang.Throwable -> L2c
            master.flame.danmaku.danmaku.model.android.d r10 = r10.D     // Catch: java.lang.Throwable -> L2c
            long r3 = r10.e     // Catch: java.lang.Throwable -> L2c
            long r5 = r1 - r3
            r7 = 100
            long r5 = r5 - r7
            long r1 = r1 + r3
            master.flame.danmaku.danmaku.model.m r10 = r9.e     // Catch: java.lang.Throwable -> L2c
            master.flame.danmaku.danmaku.model.m r10 = r10.i(r5, r1)     // Catch: java.lang.Throwable -> L2c
            if (r10 == 0) goto L2e
            r9.j = r10     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r10 = move-exception
            goto L36
        L2e:
            master.flame.danmaku.danmaku.model.m r10 = r9.e     // Catch: java.lang.Throwable -> L2c
            r10.clear()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r9)
            return
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r10     // Catch: java.lang.Throwable -> L38
        L38:
            r10 = move-exception
            goto L3c
        L3a:
            monitor-exit(r9)
            return
        L3c:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L38
            throw r10
    }

    @Override // master.flame.danmaku.controller.h
    public master.flame.danmaku.danmaku.model.m d(long r7) {
            r6 = this;
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r6.c
            master.flame.danmaku.danmaku.model.android.d r0 = r0.D
            long r0 = r0.e
            long r2 = r7 - r0
            r4 = 100
            long r2 = r2 - r4
            long r7 = r7 + r0
            r0 = 0
        Ld:
            int r1 = r0 + 1
            r4 = 3
            if (r0 >= r4) goto L1c
            master.flame.danmaku.danmaku.model.m r0 = r6.e     // Catch: java.lang.Exception -> L19
            master.flame.danmaku.danmaku.model.m r7 = r0.i(r2, r7)     // Catch: java.lang.Exception -> L19
            goto L1d
        L19:
            r0 = r1
            goto Ld
        L1c:
            r7 = 0
        L1d:
            master.flame.danmaku.danmaku.model.android.e r8 = new master.flame.danmaku.danmaku.model.android.e
            r8.<init>()
            if (r7 == 0) goto L32
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L32
            master.flame.danmaku.controller.e$e r0 = new master.flame.danmaku.controller.e$e
            r0.<init>(r6, r8)
            r7.a(r0)
        L32:
            return r8
    }

    @Override // master.flame.danmaku.controller.h
    public synchronized void e() {
            r3 = this;
            monitor-enter(r3)
            master.flame.danmaku.danmaku.model.m r0 = r3.j     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L21
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto Lc
            goto L21
        Lc:
            master.flame.danmaku.danmaku.model.m r0 = r3.j     // Catch: java.lang.Throwable -> L1f
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L1f
            master.flame.danmaku.danmaku.model.m r1 = r3.j     // Catch: java.lang.Throwable -> L1c
            master.flame.danmaku.controller.e$c r2 = new master.flame.danmaku.controller.e$c     // Catch: java.lang.Throwable -> L1c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1c
            r1.a(r2)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r3)
            return
        L1c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1f
        L1f:
            r0 = move-exception
            goto L23
        L21:
            monitor-exit(r3)
            return
        L23:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1f
            throw r0
    }

    @Override // master.flame.danmaku.controller.h
    public void f(master.flame.danmaku.danmaku.parser.a r1) {
            r0 = this;
            r0.f = r1
            r1 = 0
            r0.n = r1
            return
    }

    @Override // master.flame.danmaku.controller.h
    public void g(long r2) {
            r1 = this;
            r1.reset()
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r1.c
            master.flame.danmaku.danmaku.model.j r0 = r0.B
            r0.g()
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r1.c
            master.flame.danmaku.danmaku.model.j r0 = r0.B
            r0.c()
            r1.l = r2
            return
    }

    @Override // master.flame.danmaku.controller.h
    public void h(long r1, long r3, long r5) {
            r0 = this;
            u4.a$c r1 = r0.m
            master.flame.danmaku.danmaku.model.m r1 = r1.d()
            r0.u = r1
            master.flame.danmaku.controller.e$g r2 = new master.flame.danmaku.controller.e$g
            r2.<init>(r0, r5)
            r1.a(r2)
            r0.l = r3
            return
    }

    @Override // master.flame.danmaku.controller.h
    public void i() {
            r2 = this;
            r0 = 0
            r2.p = r0
            r2.o = r0
            r0 = 0
            r2.r = r0
            return
    }

    @Override // master.flame.danmaku.controller.h
    public void j() {
            r1 = this;
            r0 = 1
            r1.k = r0
            return
    }

    @Override // master.flame.danmaku.controller.h
    public void k() {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r1.c
            r0.X()
            u4.a r0 = r1.h
            if (r0 == 0) goto Lc
            r0.release()
        Lc:
            return
    }

    @Override // master.flame.danmaku.controller.h
    public synchronized u4.a.c l(master.flame.danmaku.danmaku.model.b r2) {
            r1 = this;
            monitor-enter(r1)
            master.flame.danmaku.danmaku.model.f r0 = r1.i     // Catch: java.lang.Throwable -> L9
            u4.a$c r2 = r1.o(r2, r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    @Override // master.flame.danmaku.controller.h
    public void m() {
            r1 = this;
            r0 = 1
            r1.r = r0
            return
    }

    protected u4.a.c o(master.flame.danmaku.danmaku.model.b r23, master.flame.danmaku.danmaku.model.f r24) {
            r22 = this;
            r0 = r22
            boolean r1 = r0.k
            r2 = 0
            if (r1 == 0) goto Le
            u4.a r1 = r0.h
            r1.f()
            r0.k = r2
        Le:
            master.flame.danmaku.danmaku.model.m r1 = r0.e
            r3 = 0
            if (r1 == 0) goto Lc1
            java.lang.Object r1 = r23.u()
            android.graphics.Canvas r1 = (android.graphics.Canvas) r1
            master.flame.danmaku.controller.d.a(r1)
            boolean r1 = r0.r
            if (r1 == 0) goto L23
            u4.a$c r1 = r0.m
            return r1
        L23:
            u4.a$c r9 = r0.m
            r1 = r24
            long r4 = r1.a
            master.flame.danmaku.danmaku.model.android.DanmakuContext r1 = r0.c
            master.flame.danmaku.danmaku.model.android.d r1 = r1.D
            long r6 = r1.e
            long r10 = r4 - r6
            r12 = 100
            long r10 = r10 - r12
            long r6 = r6 + r4
            master.flame.danmaku.danmaku.model.m r1 = r0.j
            long r12 = r0.o
            int r8 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r8 > 0) goto L47
            long r14 = r0.p
            int r8 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r8 <= 0) goto L44
            goto L47
        L44:
            r10 = r12
        L45:
            r6 = r1
            goto L57
        L47:
            master.flame.danmaku.danmaku.model.m r1 = r0.e
            master.flame.danmaku.danmaku.model.m r1 = r1.d(r10, r6)
            if (r1 == 0) goto L51
            r0.j = r1
        L51:
            r0.o = r10
            r0.p = r6
            r14 = r6
            goto L45
        L57:
            master.flame.danmaku.danmaku.model.m r1 = r0.u
            r0.n(r9, r1, r6)
            r4 = 1
            if (r1 == 0) goto L78
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L78
            u4.a$c r5 = r0.m
            r5.a = r4
            u4.a r7 = r0.h
            r19 = 0
            r17 = r23
            r18 = r1
            r21 = r5
            r16 = r7
            r16.c(r17, r18, r19, r21)
        L78:
            u4.a$c r1 = r0.m
            r1.a = r2
            if (r6 == 0) goto Lba
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto Lba
            u4.a r4 = r0.h
            master.flame.danmaku.danmaku.model.b r5 = r0.d
            long r7 = r0.l
            r4.c(r5, r6, r7, r9)
            r0.p(r9)
            boolean r1 = r9.p
            if (r1 == 0) goto Lb9
            master.flame.danmaku.danmaku.model.d r1 = r0.s
            if (r1 == 0) goto La7
            boolean r1 = r1.w()
            if (r1 == 0) goto La7
            r0.s = r3
            master.flame.danmaku.controller.h$a r1 = r0.g
            if (r1 == 0) goto La7
            r1.d()
        La7:
            long r1 = r9.n
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto Lb1
            r9.n = r10
        Lb1:
            long r1 = r9.o
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto Lb9
            r9.o = r14
        Lb9:
            return r9
        Lba:
            r9.p = r4
            r9.n = r10
            r9.o = r14
            return r9
        Lc1:
            return r3
    }

    @Override // master.flame.danmaku.controller.h
    public void onPlayStateChanged(int r1) {
            r0 = this;
            r0.q = r1
            return
    }

    @Override // master.flame.danmaku.controller.h
    public void prepare() {
            r2 = this;
            master.flame.danmaku.danmaku.parser.a r0 = r2.f
            r2.s(r0)
            r0 = 0
            r2.p = r0
            r2.o = r0
            master.flame.danmaku.controller.h$a r0 = r2.g
            if (r0 == 0) goto L15
            r0.c()
            r0 = 1
            r2.n = r0
        L15:
            return
    }

    protected boolean q(master.flame.danmaku.danmaku.model.android.DanmakuContext r3, master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag r4, java.lang.Object[] r5) {
            r2 = this;
            r3 = 1
            if (r4 == 0) goto L96
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.MAXIMUM_NUMS_IN_SCREEN
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto Ld
            goto L96
        Ld:
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.DUPLICATE_MERGING_ENABLED
            boolean r0 = r0.equals(r4)
            r1 = 0
            if (r0 == 0) goto L34
            r4 = r5[r1]
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L78
            boolean r4 = r4.booleanValue()
            java.lang.String r5 = "1017_Filter"
            if (r4 == 0) goto L2c
            master.flame.danmaku.danmaku.model.android.DanmakuContext r4 = r2.c
            master.flame.danmaku.controller.b r4 = r4.C
            r4.f(r5)
            goto L33
        L2c:
            master.flame.danmaku.danmaku.model.android.DanmakuContext r4 = r2.c
            master.flame.danmaku.controller.b r4 = r4.C
            r4.k(r5)
        L33:
            return r3
        L34:
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.SCALE_TEXTSIZE
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L92
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.SCROLL_SPEED_FACTOR
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L92
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.DANMAKU_MARGIN
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L4d
            goto L92
        L4d:
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.MAXIMUN_LINES
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L79
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.OVERLAPPING_ENABLE
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L5e
            goto L79
        L5e:
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r0 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.ALIGN_BOTTOM
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L78
            r4 = r5[r1]
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L78
            u4.a r5 = r2.h
            if (r5 == 0) goto L77
            boolean r4 = r4.booleanValue()
            r5.d(r4)
        L77:
            return r3
        L78:
            return r1
        L79:
            u4.a r4 = r2.h
            if (r4 == 0) goto L91
            master.flame.danmaku.danmaku.model.android.DanmakuContext r5 = r2.c
            boolean r5 = r5.r()
            if (r5 != 0) goto L8d
            master.flame.danmaku.danmaku.model.android.DanmakuContext r5 = r2.c
            boolean r5 = r5.q()
            if (r5 == 0) goto L8e
        L8d:
            r1 = 1
        L8e:
            r4.b(r1)
        L91:
            return r3
        L92:
            r2.j()
            return r1
        L96:
            return r3
    }

    protected void r(master.flame.danmaku.danmaku.model.f r1) {
            r0 = this;
            r0.i = r1
            return
    }

    @Override // master.flame.danmaku.controller.h
    public void reset() {
            r1 = this;
            master.flame.danmaku.danmaku.model.m r0 = r1.j
            if (r0 == 0) goto Lb
            master.flame.danmaku.danmaku.model.android.e r0 = new master.flame.danmaku.danmaku.model.android.e
            r0.<init>()
            r1.j = r0
        Lb:
            u4.a r0 = r1.h
            if (r0 == 0) goto L12
            r0.clear()
        L12:
            return
    }

    protected void s(master.flame.danmaku.danmaku.parser.a r2) {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r1.c
            master.flame.danmaku.danmaku.parser.a r2 = r2.i(r0)
            master.flame.danmaku.danmaku.model.b r0 = r1.d
            master.flame.danmaku.danmaku.parser.a r2 = r2.j(r0)
            master.flame.danmaku.danmaku.model.f r0 = r1.i
            master.flame.danmaku.danmaku.parser.a r2 = r2.l(r0)
            master.flame.danmaku.controller.e$f r0 = new master.flame.danmaku.controller.e$f
            r0.<init>(r1)
            master.flame.danmaku.danmaku.parser.a r2 = r2.k(r0)
            master.flame.danmaku.danmaku.model.m r2 = r2.a()
            r1.e = r2
            master.flame.danmaku.danmaku.model.android.DanmakuContext r2 = r1.c
            master.flame.danmaku.danmaku.model.j r2 = r2.B
            r2.a()
            master.flame.danmaku.danmaku.model.m r2 = r1.e
            if (r2 == 0) goto L32
            master.flame.danmaku.danmaku.model.d r2 = r2.last()
            r1.s = r2
        L32:
            return
    }

    @Override // master.flame.danmaku.controller.h
    public void seek(long r6) {
            r5 = this;
            r5.reset()
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r5.c
            master.flame.danmaku.danmaku.model.j r0 = r0.B
            r0.g()
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r5.c
            master.flame.danmaku.danmaku.model.j r0 = r0.B
            r0.c()
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r5.c
            master.flame.danmaku.danmaku.model.j r0 = r0.B
            r0.f()
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r5.c
            master.flame.danmaku.danmaku.model.j r0 = r0.B
            r0.e()
            master.flame.danmaku.danmaku.model.android.e r0 = new master.flame.danmaku.danmaku.model.android.e
            r1 = 4
            r0.<init>(r1)
            r5.u = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            r2 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 >= 0) goto L30
            r6 = r2
        L30:
            r5.l = r6
            u4.a$c r6 = r5.m
            r6.e()
            u4.a$c r6 = r5.m
            long r0 = r5.l
            r6.o = r0
            r5.p = r2
            r5.o = r2
            master.flame.danmaku.danmaku.model.m r6 = r5.e
            if (r6 == 0) goto L53
            master.flame.danmaku.danmaku.model.d r6 = r6.last()
            if (r6 == 0) goto L53
            boolean r7 = r6.w()
            if (r7 != 0) goto L53
            r5.s = r6
        L53:
            return
    }

    @Override // master.flame.danmaku.controller.h
    public void start() {
            r2 = this;
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r2.c
            master.flame.danmaku.danmaku.model.android.DanmakuContext$a r1 = r2.v
            r0.u(r1)
            return
    }

    public boolean t(master.flame.danmaku.danmaku.model.android.DanmakuContext r1, master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag r2, java.lang.Object... r3) {
            r0 = this;
            boolean r1 = r0.q(r1, r2, r3)
            master.flame.danmaku.controller.h$a r2 = r0.g
            if (r2 == 0) goto Lb
            r2.e()
        Lb:
            return r1
    }

    protected void u(master.flame.danmaku.danmaku.model.d r1) {
            r0 = this;
            return
    }

    protected synchronized void v(int r3) {
            r2 = this;
            monitor-enter(r2)
            master.flame.danmaku.danmaku.model.m r0 = r2.e     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L22
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L22
            master.flame.danmaku.danmaku.model.android.e r0 = r2.t     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L14
            goto L22
        L14:
            master.flame.danmaku.danmaku.model.android.e r0 = r2.t     // Catch: java.lang.Throwable -> L20
            master.flame.danmaku.controller.e$d r1 = new master.flame.danmaku.controller.e$d     // Catch: java.lang.Throwable -> L20
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L20
            r0.a(r1)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)
            return
        L20:
            r3 = move-exception
            goto L24
        L22:
            monitor-exit(r2)
            return
        L24:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r3
    }
}
