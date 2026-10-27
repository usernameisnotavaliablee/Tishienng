package master.flame.danmaku.controller;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class a extends master.flame.danmaku.controller.e {
    private static final int C = 3;
    static final /* synthetic */ boolean D = false;
    private final java.lang.Object A;
    private int B;
    private int x;
    private master.flame.danmaku.controller.a.b y;
    private master.flame.danmaku.danmaku.model.f z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: master.flame.danmaku.controller.a$a, reason: collision with other inner class name */
    class RunnableC0116a implements java.lang.Runnable {
        final /* synthetic */ master.flame.danmaku.controller.a a;

        RunnableC0116a(master.flame.danmaku.controller.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                master.flame.danmaku.controller.a r0 = r1.a
                master.flame.danmaku.controller.h$a r0 = r0.g
                r0.e()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements master.flame.danmaku.danmaku.model.k {
        private static final java.lang.String k = "CacheManager";
        public static final byte l = 0;
        public static final byte m = 1;
        public static final byte n = 2;
        public android.os.HandlerThread a;
        master.flame.danmaku.danmaku.model.android.e b;
        master.flame.danmaku.danmaku.model.android.h c;
        master.flame.danmaku.danmaku.model.objectpool.b<master.flame.danmaku.danmaku.model.android.f> d;
        private int e;
        private int f;
        private int g;
        private master.flame.danmaku.controller.a.b.e h;
        private boolean i;
        final /* synthetic */ master.flame.danmaku.controller.a j;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: master.flame.danmaku.controller.a$b$a, reason: collision with other inner class name */
        class C0117a extends master.flame.danmaku.danmaku.model.m.c<master.flame.danmaku.danmaku.model.d> {
            final /* synthetic */ master.flame.danmaku.controller.a.b e;

            C0117a(master.flame.danmaku.controller.a.b r1) {
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

            public int e(master.flame.danmaku.danmaku.model.d r4) {
                    r3 = this;
                    master.flame.danmaku.controller.a$b r0 = r3.e
                    r1 = 1
                    r2 = 0
                    r0.s(r1, r4, r2)
                    r4 = 0
                    return r4
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: master.flame.danmaku.controller.a$b$b, reason: collision with other inner class name */
        class C0118b extends master.flame.danmaku.danmaku.model.m.c<master.flame.danmaku.danmaku.model.d> {
            final /* synthetic */ master.flame.danmaku.controller.a.b e;

            C0118b(master.flame.danmaku.controller.a.b r1) {
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

            public int e(master.flame.danmaku.danmaku.model.d r4) {
                    r3 = this;
                    boolean r0 = r4.s()
                    if (r0 == 0) goto Lf
                    master.flame.danmaku.controller.a$b r0 = r3.e
                    r1 = 1
                    r2 = 0
                    r0.s(r1, r4, r2)
                    r4 = 2
                    return r4
                Lf:
                    r4 = 0
                    return r4
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class c extends master.flame.danmaku.danmaku.model.m.c<master.flame.danmaku.danmaku.model.d> {
            final /* synthetic */ master.flame.danmaku.controller.a.b e;

            c(master.flame.danmaku.controller.a.b r1) {
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

            public int e(master.flame.danmaku.danmaku.model.d r9) {
                    r8 = this;
                    boolean r0 = r9.w()
                    r1 = 1
                    if (r0 == 0) goto L65
                    master.flame.danmaku.danmaku.model.o<?> r0 = r9.y
                    master.flame.danmaku.controller.a$b r2 = r8.e
                    master.flame.danmaku.controller.a r2 = r2.j
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r2 = r2.c
                    master.flame.danmaku.danmaku.model.android.c r2 = r2.E
                    long r2 = r2.c
                    r4 = -1
                    r6 = 0
                    int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r7 != 0) goto L40
                    if (r0 == 0) goto L40
                    boolean r2 = r0.hasReferences()
                    if (r2 != 0) goto L40
                    int r0 = r0.size()
                    float r0 = (float) r0
                    master.flame.danmaku.controller.a$b r2 = r8.e
                    master.flame.danmaku.controller.a r2 = r2.j
                    int r2 = master.flame.danmaku.controller.a.x(r2)
                    float r2 = (float) r2
                    float r0 = r0 / r2
                    master.flame.danmaku.controller.a$b r2 = r8.e
                    master.flame.danmaku.controller.a r2 = r2.j
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r2 = r2.c
                    master.flame.danmaku.danmaku.model.android.c r2 = r2.E
                    float r2 = r2.d
                    int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r0 >= 0) goto L40
                    return r6
                L40:
                    master.flame.danmaku.controller.a$b r0 = r8.e
                    master.flame.danmaku.controller.a r0 = r0.j
                    java.lang.Object r0 = master.flame.danmaku.controller.a.w(r0)
                    monitor-enter(r0)
                    master.flame.danmaku.controller.a$b r2 = r8.e     // Catch: java.lang.Throwable -> L5f java.lang.InterruptedException -> L61
                    master.flame.danmaku.controller.a r2 = r2.j     // Catch: java.lang.Throwable -> L5f java.lang.InterruptedException -> L61
                    java.lang.Object r2 = master.flame.danmaku.controller.a.w(r2)     // Catch: java.lang.Throwable -> L5f java.lang.InterruptedException -> L61
                    r3 = 30
                    r2.wait(r3)     // Catch: java.lang.Throwable -> L5f java.lang.InterruptedException -> L61
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
                    master.flame.danmaku.controller.a$b r0 = r8.e
                    r1 = 0
                    r0.s(r6, r9, r1)
                    r9 = 2
                    return r9
                L5f:
                    r9 = move-exception
                    goto L63
                L61:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
                    return r1
                L63:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
                    throw r9
                L65:
                    return r1
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class d extends master.flame.danmaku.danmaku.model.m.b<master.flame.danmaku.danmaku.model.d, master.flame.danmaku.danmaku.model.d> {
            int e;
            master.flame.danmaku.danmaku.model.d f;
            final /* synthetic */ int g;
            final /* synthetic */ master.flame.danmaku.danmaku.model.d h;
            final /* synthetic */ boolean i;
            final /* synthetic */ int j;
            final /* synthetic */ master.flame.danmaku.controller.a.b k;

            d(master.flame.danmaku.controller.a.b r1, int r2, master.flame.danmaku.danmaku.model.d r3, boolean r4, int r5) {
                    r0 = this;
                    r0.k = r1
                    r0.g = r2
                    r0.h = r3
                    r0.i = r4
                    r0.j = r5
                    r0.<init>()
                    r1 = 0
                    r0.e = r1
                    return
            }

            @Override // master.flame.danmaku.danmaku.model.m.b
            public /* bridge */ /* synthetic */ int a(master.flame.danmaku.danmaku.model.d r1) {
                    r0 = this;
                    master.flame.danmaku.danmaku.model.d r1 = (master.flame.danmaku.danmaku.model.d) r1
                    int r1 = r0.e(r1)
                    return r1
            }

            @Override // master.flame.danmaku.danmaku.model.m.b
            public /* bridge */ /* synthetic */ master.flame.danmaku.danmaku.model.d d() {
                    r1 = this;
                    master.flame.danmaku.danmaku.model.d r0 = r1.f()
                    return r0
            }

            public int e(master.flame.danmaku.danmaku.model.d r8) {
                    r7 = this;
                    int r0 = r7.e
                    int r1 = r0 + 1
                    r7.e = r1
                    int r1 = r7.g
                    r2 = 1
                    if (r0 < r1) goto Lc
                    return r2
                Lc:
                    master.flame.danmaku.danmaku.model.o r0 = r8.e()
                    r1 = 0
                    if (r0 == 0) goto L93
                    java.lang.Object r3 = r0.get()
                    if (r3 != 0) goto L1b
                    goto L93
                L1b:
                    float r3 = r8.p
                    master.flame.danmaku.danmaku.model.d r4 = r7.h
                    float r5 = r4.p
                    int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r3 != 0) goto L54
                    float r3 = r8.q
                    float r5 = r4.q
                    int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r3 != 0) goto L54
                    int r3 = r8.k
                    int r5 = r4.k
                    if (r3 != r5) goto L54
                    int r3 = r8.m
                    int r5 = r4.m
                    if (r3 != r5) goto L54
                    int r3 = r8.g
                    int r5 = r4.g
                    if (r3 != r5) goto L54
                    java.lang.CharSequence r3 = r8.c
                    java.lang.CharSequence r4 = r4.c
                    boolean r3 = r3.equals(r4)
                    if (r3 == 0) goto L54
                    java.lang.Object r3 = r8.f
                    master.flame.danmaku.danmaku.model.d r4 = r7.h
                    java.lang.Object r4 = r4.f
                    if (r3 != r4) goto L54
                    r7.f = r8
                    return r2
                L54:
                    boolean r3 = r7.i
                    if (r3 == 0) goto L59
                    return r1
                L59:
                    boolean r3 = r8.w()
                    if (r3 != 0) goto L60
                    return r2
                L60:
                    boolean r3 = r0.hasReferences()
                    if (r3 == 0) goto L67
                    return r1
                L67:
                    int r3 = r0.e()
                    float r3 = (float) r3
                    master.flame.danmaku.danmaku.model.d r4 = r7.h
                    float r4 = r4.p
                    float r3 = r3 - r4
                    int r0 = r0.a()
                    float r0 = (float) r0
                    master.flame.danmaku.danmaku.model.d r4 = r7.h
                    float r4 = r4.q
                    float r0 = r0 - r4
                    r4 = 0
                    int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                    if (r5 < 0) goto L93
                    int r5 = r7.j
                    float r6 = (float) r5
                    int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                    if (r3 > 0) goto L93
                    int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                    if (r3 < 0) goto L93
                    float r3 = (float) r5
                    int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                    if (r0 > 0) goto L93
                    r7.f = r8
                    return r2
                L93:
                    return r1
            }

            public master.flame.danmaku.danmaku.model.d f() {
                    r1 = this;
                    master.flame.danmaku.danmaku.model.d r0 = r1.f
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public class e extends android.os.Handler {
            private static final int f = 1;
            public static final int g = 2;
            public static final int h = 3;
            public static final int i = 4;
            public static final int j = 5;
            public static final int k = 6;
            public static final int l = 7;
            public static final int m = 8;
            public static final int n = 9;
            public static final int o = 16;
            public static final int p = 17;
            public static final int q = 18;
            private boolean a;
            private boolean b;
            private boolean c;
            private boolean d;
            final /* synthetic */ master.flame.danmaku.controller.a.b e;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: master.flame.danmaku.controller.a$b$e$a, reason: collision with other inner class name */
            class C0119a extends master.flame.danmaku.danmaku.model.m.c<master.flame.danmaku.danmaku.model.d> {
                final /* synthetic */ master.flame.danmaku.controller.a.b.e e;

                C0119a(master.flame.danmaku.controller.a.b.e r1) {
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

                public int e(master.flame.danmaku.danmaku.model.d r10) {
                        r9 = this;
                        master.flame.danmaku.controller.a$b$e r0 = r9.e
                        boolean r0 = master.flame.danmaku.controller.a.b.e.d(r0)
                        r1 = 1
                        if (r0 != 0) goto L57
                        master.flame.danmaku.controller.a$b$e r0 = r9.e
                        boolean r0 = master.flame.danmaku.controller.a.b.e.a(r0)
                        if (r0 == 0) goto L12
                        goto L57
                    L12:
                        boolean r0 = r10.m()
                        if (r0 != 0) goto L2b
                        master.flame.danmaku.controller.a$b$e r0 = r9.e
                        master.flame.danmaku.controller.a$b r0 = r0.e
                        master.flame.danmaku.controller.a r0 = r0.j
                        master.flame.danmaku.danmaku.model.android.DanmakuContext r8 = r0.c
                        master.flame.danmaku.controller.b r2 = r8.C
                        r6 = 0
                        r7 = 1
                        r4 = 0
                        r5 = 0
                        r3 = r10
                        r2.b(r3, r4, r5, r6, r7, r8)
                        goto L2c
                    L2b:
                        r3 = r10
                    L2c:
                        boolean r10 = r3.n()
                        r0 = 0
                        if (r10 == 0) goto L34
                        return r0
                    L34:
                        boolean r10 = r3.q()
                        if (r10 != 0) goto L45
                        master.flame.danmaku.controller.a$b$e r10 = r9.e
                        master.flame.danmaku.controller.a$b r10 = r10.e
                        master.flame.danmaku.controller.a r10 = r10.j
                        master.flame.danmaku.danmaku.model.b r10 = r10.d
                        r3.z(r10, r1)
                    L45:
                        boolean r10 = r3.u()
                        if (r10 != 0) goto L56
                        master.flame.danmaku.controller.a$b$e r10 = r9.e
                        master.flame.danmaku.controller.a$b r10 = r10.e
                        master.flame.danmaku.controller.a r10 = r10.j
                        master.flame.danmaku.danmaku.model.b r10 = r10.d
                        r3.A(r10, r1)
                    L56:
                        return r0
                    L57:
                        return r1
                }
            }

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: master.flame.danmaku.controller.a$b$e$b, reason: collision with other inner class name */
            class C0120b extends master.flame.danmaku.danmaku.model.m.c<master.flame.danmaku.danmaku.model.d> {
                int e;
                int f;
                final /* synthetic */ master.flame.danmaku.danmaku.model.d g;
                final /* synthetic */ boolean h;
                final /* synthetic */ int i;
                final /* synthetic */ long j;
                final /* synthetic */ long k;
                final /* synthetic */ long l;
                final /* synthetic */ master.flame.danmaku.controller.a.b.e m;

                C0120b(master.flame.danmaku.controller.a.b.e r1, master.flame.danmaku.danmaku.model.d r2, boolean r3, int r4, long r5, long r7, long r9) {
                        r0 = this;
                        r0.m = r1
                        r0.g = r2
                        r0.h = r3
                        r0.i = r4
                        r0.j = r5
                        r0.k = r7
                        r0.l = r9
                        r0.<init>()
                        r1 = 0
                        r0.e = r1
                        r0.f = r1
                        return
                }

                @Override // master.flame.danmaku.danmaku.model.m.b
                public /* bridge */ /* synthetic */ int a(java.lang.Object r1) {
                        r0 = this;
                        master.flame.danmaku.danmaku.model.d r1 = (master.flame.danmaku.danmaku.model.d) r1
                        int r1 = r0.e(r1)
                        return r1
                }

                public int e(master.flame.danmaku.danmaku.model.d r11) {
                        r10 = this;
                        master.flame.danmaku.controller.a$b$e r0 = r10.m
                        boolean r0 = master.flame.danmaku.controller.a.b.e.d(r0)
                        r1 = 1
                        if (r0 != 0) goto Lec
                        master.flame.danmaku.controller.a$b$e r0 = r10.m
                        boolean r0 = master.flame.danmaku.controller.a.b.e.a(r0)
                        if (r0 == 0) goto L13
                        goto Lec
                    L13:
                        master.flame.danmaku.danmaku.model.d r0 = r10.g
                        long r2 = r0.b()
                        master.flame.danmaku.controller.a$b$e r0 = r10.m
                        master.flame.danmaku.controller.a$b r0 = r0.e
                        master.flame.danmaku.controller.a r0 = r0.j
                        master.flame.danmaku.danmaku.model.f r0 = r0.i
                        long r4 = r0.a
                        int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                        if (r0 >= 0) goto L28
                        return r1
                    L28:
                        master.flame.danmaku.danmaku.model.o r0 = r11.e()
                        r2 = 0
                        if (r0 == 0) goto L36
                        java.lang.Object r0 = r0.get()
                        if (r0 == 0) goto L36
                        return r2
                    L36:
                        boolean r0 = r10.h
                        if (r0 != 0) goto L47
                        boolean r0 = r11.w()
                        if (r0 != 0) goto L46
                        boolean r0 = r11.s()
                        if (r0 != 0) goto L47
                    L46:
                        return r2
                    L47:
                        boolean r0 = r11.m()
                        if (r0 != 0) goto L62
                        master.flame.danmaku.controller.a$b$e r0 = r10.m
                        master.flame.danmaku.controller.a$b r0 = r0.e
                        master.flame.danmaku.controller.a r0 = r0.j
                        master.flame.danmaku.danmaku.model.android.DanmakuContext r9 = r0.c
                        master.flame.danmaku.controller.b r3 = r9.C
                        int r5 = r10.e
                        int r6 = r10.i
                        r7 = 0
                        r8 = 1
                        r4 = r11
                        r3.b(r4, r5, r6, r7, r8, r9)
                        goto L63
                    L62:
                        r4 = r11
                    L63:
                        byte r11 = r4.o
                        if (r11 != 0) goto L6e
                        boolean r11 = r4.n()
                        if (r11 == 0) goto L6e
                        return r2
                    L6e:
                        int r11 = r4.getType()
                        if (r11 != r1) goto L97
                        long r5 = r4.b()
                        long r7 = r10.j
                        long r5 = r5 - r7
                        master.flame.danmaku.controller.a$b$e r11 = r10.m
                        master.flame.danmaku.controller.a$b r11 = r11.e
                        master.flame.danmaku.controller.a r11 = r11.j
                        master.flame.danmaku.danmaku.model.android.DanmakuContext r11 = r11.c
                        master.flame.danmaku.danmaku.model.android.d r11 = r11.D
                        long r7 = r11.e
                        long r5 = r5 / r7
                        int r11 = (int) r5
                        int r0 = r10.f
                        if (r0 != r11) goto L93
                        int r11 = r10.e
                        int r11 = r11 + r1
                        r10.e = r11
                        goto L97
                    L93:
                        r10.e = r2
                        r10.f = r11
                    L97:
                        boolean r11 = r10.h
                        if (r11 != 0) goto Lc3
                        master.flame.danmaku.controller.a$b$e r11 = r10.m
                        boolean r11 = master.flame.danmaku.controller.a.b.e.b(r11)
                        if (r11 != 0) goto Lc3
                        master.flame.danmaku.controller.a$b$e r11 = r10.m     // Catch: java.lang.InterruptedException -> Lc2
                        master.flame.danmaku.controller.a$b r11 = r11.e     // Catch: java.lang.InterruptedException -> Lc2
                        master.flame.danmaku.controller.a r11 = r11.j     // Catch: java.lang.InterruptedException -> Lc2
                        java.lang.Object r11 = master.flame.danmaku.controller.a.w(r11)     // Catch: java.lang.InterruptedException -> Lc2
                        monitor-enter(r11)     // Catch: java.lang.InterruptedException -> Lc2
                        master.flame.danmaku.controller.a$b$e r0 = r10.m     // Catch: java.lang.Throwable -> Lbf
                        master.flame.danmaku.controller.a$b r0 = r0.e     // Catch: java.lang.Throwable -> Lbf
                        master.flame.danmaku.controller.a r0 = r0.j     // Catch: java.lang.Throwable -> Lbf
                        java.lang.Object r0 = master.flame.danmaku.controller.a.w(r0)     // Catch: java.lang.Throwable -> Lbf
                        long r5 = r10.k     // Catch: java.lang.Throwable -> Lbf
                        r0.wait(r5)     // Catch: java.lang.Throwable -> Lbf
                        monitor-exit(r11)     // Catch: java.lang.Throwable -> Lbf
                        goto Lc3
                    Lbf:
                        r0 = move-exception
                        monitor-exit(r11)     // Catch: java.lang.Throwable -> Lbf
                        throw r0     // Catch: java.lang.InterruptedException -> Lc2
                    Lc2:
                        return r1
                    Lc3:
                        master.flame.danmaku.controller.a$b$e r11 = r10.m
                        master.flame.danmaku.controller.a.b.e.c(r11, r4, r2)
                        boolean r11 = r10.h
                        if (r11 != 0) goto Leb
                        long r3 = v4.c.b()
                        long r5 = r10.l
                        long r3 = r3 - r5
                        master.flame.danmaku.controller.a$b$e r11 = r10.m
                        master.flame.danmaku.controller.a$b r11 = r11.e
                        master.flame.danmaku.controller.a r0 = r11.j
                        master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r0.c
                        master.flame.danmaku.danmaku.model.android.d r0 = r0.D
                        int r11 = master.flame.danmaku.controller.a.b.b(r11)
                        long r5 = (long) r11
                        r7 = 3800(0xed8, double:1.8774E-320)
                        long r5 = r5 * r7
                        int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                        if (r11 < 0) goto Leb
                        return r1
                    Leb:
                        return r2
                    Lec:
                        return r1
                }
            }

            public e(master.flame.danmaku.controller.a.b r1, android.os.Looper r2) {
                    r0 = this;
                    r0.e = r1
                    r0.<init>(r2)
                    return
            }

            static /* synthetic */ boolean a(master.flame.danmaku.controller.a.b.e r0) {
                    boolean r0 = r0.d
                    return r0
            }

            static /* synthetic */ boolean b(master.flame.danmaku.controller.a.b.e r0) {
                    boolean r0 = r0.b
                    return r0
            }

            static /* synthetic */ byte c(master.flame.danmaku.controller.a.b.e r0, master.flame.danmaku.danmaku.model.d r1, boolean r2) {
                    byte r0 = r0.g(r1, r2)
                    return r0
            }

            static /* synthetic */ boolean d(master.flame.danmaku.controller.a.b.e r0) {
                    boolean r0 = r0.a
                    return r0
            }

            private final void e(master.flame.danmaku.danmaku.model.d r7) {
                    r6 = this;
                    boolean r0 = r7.w()
                    if (r0 != 0) goto L43
                    long r0 = r7.b()
                    master.flame.danmaku.controller.a$b r2 = r6.e
                    master.flame.danmaku.controller.a r2 = r2.j
                    master.flame.danmaku.danmaku.model.f r2 = master.flame.danmaku.controller.a.z(r2)
                    long r2 = r2.a
                    master.flame.danmaku.controller.a$b r4 = r6.e
                    master.flame.danmaku.controller.a r4 = r4.j
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r4 = r4.c
                    master.flame.danmaku.danmaku.model.android.d r4 = r4.D
                    long r4 = r4.e
                    long r2 = r2 + r4
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 <= 0) goto L28
                    boolean r0 = r7.z
                    if (r0 != 0) goto L28
                    goto L43
                L28:
                    byte r0 = r7.o
                    if (r0 != 0) goto L33
                    boolean r0 = r7.n()
                    if (r0 == 0) goto L33
                    goto L43
                L33:
                    master.flame.danmaku.danmaku.model.o r0 = r7.e()
                    if (r0 == 0) goto L3f
                    java.lang.Object r0 = r0.get()
                    if (r0 != 0) goto L43
                L3f:
                    r0 = 1
                    r6.g(r7, r0)
                L43:
                    return
            }

            private byte g(master.flame.danmaku.danmaku.model.d r7, boolean r8) {
                    r6 = this;
                    boolean r0 = r7.q()
                    r1 = 1
                    if (r0 != 0) goto L10
                    master.flame.danmaku.controller.a$b r0 = r6.e
                    master.flame.danmaku.controller.a r0 = r0.j
                    master.flame.danmaku.danmaku.model.b r0 = r0.d
                    r7.z(r0, r1)
                L10:
                    r0 = 0
                    master.flame.danmaku.controller.a$b r2 = r6.e     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    master.flame.danmaku.controller.a r3 = r2.j     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r3 = r3.c     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    master.flame.danmaku.danmaku.model.android.c r3 = r3.E     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    int r3 = r3.f     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    master.flame.danmaku.danmaku.model.d r2 = master.flame.danmaku.controller.a.b.c(r2, r7, r1, r3)     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    if (r2 == 0) goto L26
                    master.flame.danmaku.danmaku.model.o<?> r2 = r2.y     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    master.flame.danmaku.danmaku.model.android.f r2 = (master.flame.danmaku.danmaku.model.android.f) r2     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    goto L27
                L26:
                    r2 = r0
                L27:
                    r3 = 0
                    if (r2 == 0) goto L41
                    r2.j()     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    r7.y = r2     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.controller.a$b r0 = r6.e     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.controller.a r0 = r0.j     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.controller.a$b r0 = master.flame.danmaku.controller.a.y(r0)     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.controller.a.b.h(r0, r7, r3, r8)     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    return r3
                L3b:
                    r0 = r2
                    goto Lee
                L3e:
                    r0 = r2
                    goto Lf2
                L41:
                    master.flame.danmaku.controller.a$b r4 = r6.e     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.controller.a r5 = r4.j     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r5 = r5.c     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.danmaku.model.android.c r5 = r5.E     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    int r5 = r5.g     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.danmaku.model.d r4 = master.flame.danmaku.controller.a.b.c(r4, r7, r3, r5)     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    if (r4 == 0) goto L56
                    master.flame.danmaku.danmaku.model.o<?> r5 = r4.y     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.danmaku.model.android.f r5 = (master.flame.danmaku.danmaku.model.android.f) r5     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    r2 = r5
                L56:
                    if (r2 == 0) goto L78
                    r4.y = r0     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.controller.a$b r0 = r6.e     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.controller.a r0 = r0.j     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.danmaku.model.b r4 = r0.d     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r0.c     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.danmaku.model.android.c r0 = r0.E     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    int r0 = r0.a     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.danmaku.model.android.f r0 = v4.a.a(r7, r4, r2, r0)     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    r7.y = r0     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    master.flame.danmaku.controller.a$b r2 = r6.e     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    master.flame.danmaku.controller.a r2 = r2.j     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    master.flame.danmaku.controller.a$b r2 = master.flame.danmaku.controller.a.y(r2)     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    master.flame.danmaku.controller.a.b.h(r2, r7, r3, r8)     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    return r3
                L78:
                    float r0 = r7.p     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    int r0 = (int) r0     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    float r4 = r7.q     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    int r4 = (int) r4     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.controller.a$b r5 = r6.e     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.controller.a r5 = r5.j     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r5 = r5.c     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.danmaku.model.android.c r5 = r5.E     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    int r5 = r5.a     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    int r5 = r5 / 8
                    int r0 = v4.a.f(r0, r4, r5)     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    int r4 = r0 * 2
                    master.flame.danmaku.controller.a$b r5 = r6.e     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.controller.a r5 = r5.j     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    int r5 = master.flame.danmaku.controller.a.x(r5)     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    if (r4 <= r5) goto L9b
                    return r1
                L9b:
                    if (r8 != 0) goto Lb8
                    master.flame.danmaku.controller.a$b r4 = r6.e     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    int r4 = master.flame.danmaku.controller.a.b.d(r4)     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    int r4 = r4 + r0
                    master.flame.danmaku.controller.a$b r5 = r6.e     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    int r5 = master.flame.danmaku.controller.a.b.e(r5)     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    if (r4 <= r5) goto Lb8
                    master.flame.danmaku.controller.a$b r8 = r6.e     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.controller.a r8 = r8.j     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.controller.a$b r8 = master.flame.danmaku.controller.a.y(r8)     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.controller.a.b.f(r8, r0, r3)     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    return r1
                Lb8:
                    master.flame.danmaku.controller.a$b r0 = r6.e     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.danmaku.model.objectpool.b<master.flame.danmaku.danmaku.model.android.f> r0 = r0.d     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.danmaku.model.objectpool.c r0 = r0.acquire()     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.danmaku.model.android.f r0 = (master.flame.danmaku.danmaku.model.android.f) r0     // Catch: java.lang.Exception -> L3b java.lang.OutOfMemoryError -> L3e
                    master.flame.danmaku.controller.a$b r2 = r6.e     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    master.flame.danmaku.controller.a r2 = r2.j     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    master.flame.danmaku.danmaku.model.b r3 = r2.d     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r2 = r2.c     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    master.flame.danmaku.danmaku.model.android.c r2 = r2.E     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    int r2 = r2.a     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    master.flame.danmaku.danmaku.model.android.f r0 = v4.a.a(r7, r3, r0, r2)     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    r7.y = r0     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    master.flame.danmaku.controller.a$b r2 = r6.e     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    master.flame.danmaku.controller.a r2 = r2.j     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    master.flame.danmaku.controller.a$b r2 = master.flame.danmaku.controller.a.y(r2)     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    master.flame.danmaku.controller.a$b r3 = r6.e     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    int r3 = r3.J(r7)     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    boolean r8 = master.flame.danmaku.controller.a.b.h(r2, r7, r3, r8)     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                    if (r8 != 0) goto Leb
                    r6.o(r7, r0)     // Catch: java.lang.Exception -> Lee java.lang.OutOfMemoryError -> Lf2
                Leb:
                    r7 = r8 ^ 1
                    return r7
                Lee:
                    r6.o(r7, r0)
                    return r1
                Lf2:
                    r6.o(r7, r0)
                    return r1
            }

            private long i() {
                    r13 = this;
                    master.flame.danmaku.controller.a$b r0 = r13.e
                    master.flame.danmaku.controller.a r0 = r0.j
                    master.flame.danmaku.danmaku.model.f r0 = master.flame.danmaku.controller.a.z(r0)
                    long r0 = r0.a
                    master.flame.danmaku.controller.a$b r2 = r13.e
                    master.flame.danmaku.controller.a r3 = r2.j
                    master.flame.danmaku.danmaku.model.f r4 = r3.i
                    long r4 = r4.a
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r3 = r3.c
                    master.flame.danmaku.danmaku.model.android.d r6 = r3.D
                    long r6 = r6.e
                    long r4 = r4 - r6
                    r6 = 3
                    r7 = 0
                    int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                    if (r9 > 0) goto L44
                    master.flame.danmaku.danmaku.model.android.c r0 = r3.E
                    long r0 = r0.c
                    r3 = -1
                    int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                    if (r5 == 0) goto L2d
                    master.flame.danmaku.controller.a.b.g(r2)
                L2d:
                    master.flame.danmaku.controller.a$b r0 = r13.e
                    master.flame.danmaku.controller.a r0 = r0.j
                    master.flame.danmaku.danmaku.model.f r0 = master.flame.danmaku.controller.a.z(r0)
                    master.flame.danmaku.controller.a$b r1 = r13.e
                    master.flame.danmaku.controller.a r1 = r1.j
                    master.flame.danmaku.danmaku.model.f r1 = r1.i
                    long r1 = r1.a
                    r0.update(r1)
                    r13.sendEmptyMessage(r6)
                    return r7
                L44:
                    float r0 = r2.x()
                    master.flame.danmaku.controller.a$b r1 = r13.e
                    master.flame.danmaku.danmaku.model.android.e r1 = r1.b
                    master.flame.danmaku.danmaku.model.d r1 = r1.first()
                    if (r1 == 0) goto L60
                    long r2 = r1.b()
                    master.flame.danmaku.controller.a$b r4 = r13.e
                    master.flame.danmaku.controller.a r4 = r4.j
                    master.flame.danmaku.danmaku.model.f r4 = r4.i
                    long r4 = r4.a
                    long r2 = r2 - r4
                    goto L61
                L60:
                    r2 = r7
                L61:
                    master.flame.danmaku.controller.a$b r4 = r13.e
                    master.flame.danmaku.controller.a r4 = r4.j
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r5 = r4.c
                    master.flame.danmaku.danmaku.model.android.d r5 = r5.D
                    long r9 = r5.e
                    r11 = 2
                    long r11 = r11 * r9
                    r5 = 1058642330(0x3f19999a, float:0.6)
                    int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                    if (r5 >= 0) goto L90
                    int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
                    if (r5 <= 0) goto L90
                    master.flame.danmaku.danmaku.model.f r0 = master.flame.danmaku.controller.a.z(r4)
                    master.flame.danmaku.controller.a$b r1 = r13.e
                    master.flame.danmaku.controller.a r1 = r1.j
                    master.flame.danmaku.danmaku.model.f r1 = r1.i
                    long r1 = r1.a
                    r0.update(r1)
                    r13.removeMessages(r6)
                    r13.sendEmptyMessage(r6)
                    return r7
                L90:
                    r5 = 1053609165(0x3ecccccd, float:0.4)
                    int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                    if (r5 <= 0) goto La4
                    long r9 = -r11
                    int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
                    if (r5 >= 0) goto La4
                    r0 = 4
                    r13.removeMessages(r0)
                    r13.sendEmptyMessage(r0)
                    return r7
                La4:
                    r2 = 1063675494(0x3f666666, float:0.9)
                    int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r0 < 0) goto Lac
                    return r7
                Lac:
                    master.flame.danmaku.danmaku.model.f r0 = master.flame.danmaku.controller.a.z(r4)
                    long r2 = r0.a
                    master.flame.danmaku.controller.a$b r0 = r13.e
                    master.flame.danmaku.controller.a r0 = r0.j
                    master.flame.danmaku.danmaku.model.f r0 = r0.i
                    long r4 = r0.a
                    long r2 = r2 - r4
                    if (r1 == 0) goto Lea
                    boolean r0 = r1.w()
                    if (r0 == 0) goto Lea
                    master.flame.danmaku.controller.a$b r0 = r13.e
                    master.flame.danmaku.controller.a r0 = r0.j
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r1 = r0.c
                    master.flame.danmaku.danmaku.model.android.d r1 = r1.D
                    long r4 = r1.e
                    long r4 = -r4
                    int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r1 >= 0) goto Lea
                    master.flame.danmaku.danmaku.model.f r0 = master.flame.danmaku.controller.a.z(r0)
                    master.flame.danmaku.controller.a$b r1 = r13.e
                    master.flame.danmaku.controller.a r1 = r1.j
                    master.flame.danmaku.danmaku.model.f r1 = r1.i
                    long r1 = r1.a
                    r0.update(r1)
                    r0 = 8
                    r13.sendEmptyMessage(r0)
                    r13.sendEmptyMessage(r6)
                    return r7
                Lea:
                    int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                    if (r0 <= 0) goto Lef
                    return r7
                Lef:
                    r13.removeMessages(r6)
                    r13.sendEmptyMessage(r6)
                    return r7
            }

            private void m() {
                    r7 = this;
                    master.flame.danmaku.controller.a$b r0 = r7.e     // Catch: java.lang.Exception -> L1b
                    master.flame.danmaku.controller.a r0 = r0.j     // Catch: java.lang.Exception -> L1b
                    master.flame.danmaku.danmaku.model.f r1 = r0.i     // Catch: java.lang.Exception -> L1b
                    long r1 = r1.a     // Catch: java.lang.Exception -> L1b
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r3 = r0.c     // Catch: java.lang.Exception -> L1b
                    master.flame.danmaku.danmaku.model.android.d r3 = r3.D     // Catch: java.lang.Exception -> L1b
                    long r3 = r3.e     // Catch: java.lang.Exception -> L1b
                    r5 = 2
                    long r5 = r5 * r3
                    long r5 = r5 + r1
                    master.flame.danmaku.danmaku.model.m r0 = r0.e     // Catch: java.lang.Exception -> L1b
                    long r1 = r1 - r3
                    master.flame.danmaku.danmaku.model.m r0 = r0.i(r1, r5)     // Catch: java.lang.Exception -> L1b
                    goto L1c
                L1b:
                    r0 = 0
                L1c:
                    if (r0 == 0) goto L2d
                    boolean r1 = r0.isEmpty()
                    if (r1 == 0) goto L25
                    goto L2d
                L25:
                    master.flame.danmaku.controller.a$b$e$a r1 = new master.flame.danmaku.controller.a$b$e$a
                    r1.<init>(r7)
                    r0.f(r1)
                L2d:
                    return
            }

            private long n(boolean r24) {
                    r23 = this;
                    r1 = r23
                    r1.m()
                    master.flame.danmaku.controller.a$b r0 = r1.e
                    master.flame.danmaku.controller.a r0 = r0.j
                    master.flame.danmaku.danmaku.model.f r0 = master.flame.danmaku.controller.a.z(r0)
                    long r2 = r0.a
                    r4 = 30
                    long r2 = r2 - r4
                    master.flame.danmaku.controller.a$b r0 = r1.e
                    master.flame.danmaku.controller.a r6 = r0.j
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r6 = r6.c
                    master.flame.danmaku.danmaku.model.android.d r6 = r6.D
                    long r6 = r6.e
                    int r0 = master.flame.danmaku.controller.a.b.b(r0)
                    long r8 = (long) r0
                    long r6 = r6 * r8
                    long r11 = r2 + r6
                    master.flame.danmaku.controller.a$b r0 = r1.e
                    master.flame.danmaku.controller.a r0 = r0.j
                    master.flame.danmaku.danmaku.model.f r0 = r0.i
                    long r6 = r0.a
                    r8 = 0
                    int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                    if (r0 >= 0) goto L34
                    return r8
                L34:
                    r6 = r8
                    long r9 = v4.c.b()
                    r0 = 0
                    r8 = 0
                    r13 = r8
                    r8 = 0
                L3d:
                    r14 = 10
                    r16 = 1
                    r17 = r4
                    master.flame.danmaku.controller.a$b r4 = r1.e     // Catch: java.lang.Exception -> L4f
                    master.flame.danmaku.controller.a r4 = r4.j     // Catch: java.lang.Exception -> L4f
                    master.flame.danmaku.danmaku.model.m r4 = r4.e     // Catch: java.lang.Exception -> L4f
                    master.flame.danmaku.danmaku.model.m r4 = r4.i(r2, r11)     // Catch: java.lang.Exception -> L4f
                    r13 = r4
                    goto L53
                L4f:
                    v4.c.a(r14)
                    r8 = 1
                L53:
                    int r0 = r0 + 1
                    r4 = 3
                    if (r0 >= r4) goto L60
                    if (r13 != 0) goto L60
                    if (r8 != 0) goto L5d
                    goto L60
                L5d:
                    r4 = r17
                    goto L3d
                L60:
                    if (r13 != 0) goto L6e
                    master.flame.danmaku.controller.a$b r0 = r1.e
                    master.flame.danmaku.controller.a r0 = r0.j
                    master.flame.danmaku.danmaku.model.f r0 = master.flame.danmaku.controller.a.z(r0)
                    r0.update(r11)
                    return r6
                L6e:
                    master.flame.danmaku.danmaku.model.d r0 = r13.first()
                    r21 = r6
                    r5 = r2
                    r3 = r21
                    master.flame.danmaku.danmaku.model.d r2 = r13.last()
                    if (r0 == 0) goto L7f
                    if (r2 != 0) goto L82
                L7f:
                    r19 = r3
                    goto Lce
                L82:
                    long r7 = r0.b()
                    master.flame.danmaku.controller.a$b r0 = r1.e
                    master.flame.danmaku.controller.a r0 = r0.j
                    r19 = r3
                    master.flame.danmaku.danmaku.model.f r3 = r0.i
                    long r3 = r3.a
                    long r7 = r7 - r3
                    int r3 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
                    if (r3 >= 0) goto L98
                    r3 = r17
                    goto La3
                L98:
                    long r7 = r7 * r14
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r0.c
                    master.flame.danmaku.danmaku.model.android.d r0 = r0.D
                    long r3 = r0.e
                    long r7 = r7 / r3
                    long r3 = r7 + r17
                La3:
                    r7 = 100
                    long r3 = java.lang.Math.min(r7, r3)
                    if (r24 == 0) goto Lae
                    r7 = r19
                    goto Laf
                Lae:
                    r7 = r3
                Laf:
                    int r4 = r13.size()
                    master.flame.danmaku.controller.a$b$e$b r0 = new master.flame.danmaku.controller.a$b$e$b
                    r3 = r24
                    r0.<init>(r1, r2, r3, r4, r5, r7, r9)
                    r13.f(r0)
                    long r2 = v4.c.b()
                    long r2 = r2 - r9
                    master.flame.danmaku.controller.a$b r0 = r1.e
                    master.flame.danmaku.controller.a r0 = r0.j
                    master.flame.danmaku.danmaku.model.f r0 = master.flame.danmaku.controller.a.z(r0)
                    r0.update(r11)
                    return r2
                Lce:
                    master.flame.danmaku.controller.a$b r0 = r1.e
                    master.flame.danmaku.controller.a r0 = r0.j
                    master.flame.danmaku.danmaku.model.f r0 = master.flame.danmaku.controller.a.z(r0)
                    r0.update(r11)
                    return r19
            }

            private void o(master.flame.danmaku.danmaku.model.d r2, master.flame.danmaku.danmaku.model.android.f r3) {
                    r1 = this;
                    if (r3 != 0) goto L6
                    master.flame.danmaku.danmaku.model.o<?> r3 = r2.y
                    master.flame.danmaku.danmaku.model.android.f r3 = (master.flame.danmaku.danmaku.model.android.f) r3
                L6:
                    r0 = 0
                    r2.y = r0
                    if (r3 != 0) goto Lc
                    return
                Lc:
                    r3.destroy()
                    master.flame.danmaku.controller.a$b r2 = r1.e
                    master.flame.danmaku.danmaku.model.objectpool.b<master.flame.danmaku.danmaku.model.android.f> r2 = r2.d
                    r2.a(r3)
                    return
            }

            public void f() {
                    r3 = this;
                    r0 = 1
                    r3.sendEmptyMessage(r0)
                    master.flame.danmaku.controller.a$b r0 = r3.e
                    master.flame.danmaku.controller.a r0 = r0.j
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r0.c
                    master.flame.danmaku.danmaku.model.android.d r0 = r0.D
                    long r0 = r0.e
                    r2 = 4
                    r3.sendEmptyMessageDelayed(r2, r0)
                    return
            }

            public boolean h(master.flame.danmaku.danmaku.model.d r7) {
                    r6 = this;
                    boolean r0 = r7.q()
                    r1 = 1
                    if (r0 != 0) goto L10
                    master.flame.danmaku.controller.a$b r0 = r6.e
                    master.flame.danmaku.controller.a r0 = r0.j
                    master.flame.danmaku.danmaku.model.b r0 = r0.d
                    r7.z(r0, r1)
                L10:
                    r0 = 0
                    r2 = 0
                    master.flame.danmaku.controller.a$b r3 = r6.e     // Catch: java.lang.Exception -> L33 java.lang.OutOfMemoryError -> L36
                    master.flame.danmaku.danmaku.model.objectpool.b<master.flame.danmaku.danmaku.model.android.f> r3 = r3.d     // Catch: java.lang.Exception -> L33 java.lang.OutOfMemoryError -> L36
                    master.flame.danmaku.danmaku.model.objectpool.c r3 = r3.acquire()     // Catch: java.lang.Exception -> L33 java.lang.OutOfMemoryError -> L36
                    master.flame.danmaku.danmaku.model.android.f r3 = (master.flame.danmaku.danmaku.model.android.f) r3     // Catch: java.lang.Exception -> L33 java.lang.OutOfMemoryError -> L36
                    master.flame.danmaku.controller.a$b r4 = r6.e     // Catch: java.lang.Exception -> L2f java.lang.OutOfMemoryError -> L31
                    master.flame.danmaku.controller.a r4 = r4.j     // Catch: java.lang.Exception -> L2f java.lang.OutOfMemoryError -> L31
                    master.flame.danmaku.danmaku.model.b r5 = r4.d     // Catch: java.lang.Exception -> L2f java.lang.OutOfMemoryError -> L31
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r4 = r4.c     // Catch: java.lang.Exception -> L2f java.lang.OutOfMemoryError -> L31
                    master.flame.danmaku.danmaku.model.android.c r4 = r4.E     // Catch: java.lang.Exception -> L2f java.lang.OutOfMemoryError -> L31
                    int r4 = r4.a     // Catch: java.lang.Exception -> L2f java.lang.OutOfMemoryError -> L31
                    master.flame.danmaku.danmaku.model.android.f r3 = v4.a.a(r7, r5, r3, r4)     // Catch: java.lang.Exception -> L2f java.lang.OutOfMemoryError -> L31
                    r7.y = r3     // Catch: java.lang.Exception -> L2f java.lang.OutOfMemoryError -> L31
                    return r1
                L2f:
                    goto L39
                L31:
                    goto L45
                L33:
                    r3 = r2
                    goto L39
                L36:
                    r3 = r2
                    goto L45
                L39:
                    if (r3 == 0) goto L42
                    master.flame.danmaku.controller.a$b r1 = r6.e
                    master.flame.danmaku.danmaku.model.objectpool.b<master.flame.danmaku.danmaku.model.android.f> r1 = r1.d
                    r1.a(r3)
                L42:
                    r7.y = r2
                    return r0
                L45:
                    if (r3 == 0) goto L4e
                    master.flame.danmaku.controller.a$b r1 = r6.e
                    master.flame.danmaku.danmaku.model.objectpool.b<master.flame.danmaku.danmaku.model.android.f> r1 = r1.d
                    r1.a(r3)
                L4e:
                    r7.y = r2
                    return r0
            }

            @Override // android.os.Handler
            public void handleMessage(android.os.Message r9) {
                    r8 = this;
                    int r0 = r9.what
                    r1 = 0
                    r2 = 0
                    r3 = 1
                    switch(r0) {
                        case 1: goto L16a;
                        case 2: goto L162;
                        case 3: goto L12e;
                        case 4: goto L128;
                        case 5: goto Ldd;
                        case 6: goto Lc6;
                        case 7: goto La4;
                        case 8: goto L8b;
                        case 9: goto L6b;
                        default: goto L8;
                    }
                L8:
                    switch(r0) {
                        case 16: goto L182;
                        case 17: goto L10;
                        case 18: goto Ld;
                        default: goto Lb;
                    }
                Lb:
                    goto L161
                Ld:
                    r8.d = r2
                    return
                L10:
                    java.lang.Object r9 = r9.obj
                    master.flame.danmaku.danmaku.model.d r9 = (master.flame.danmaku.danmaku.model.d) r9
                    if (r9 == 0) goto L161
                    master.flame.danmaku.danmaku.model.o r0 = r9.e()
                    int r4 = r9.J
                    r4 = r4 & r3
                    if (r4 == 0) goto L20
                    goto L4a
                L20:
                    if (r0 == 0) goto L4a
                    java.lang.Object r4 = r0.get()
                    if (r4 == 0) goto L4a
                    boolean r4 = r0.hasReferences()
                    if (r4 != 0) goto L4a
                    master.flame.danmaku.controller.a$b r0 = r8.e
                    master.flame.danmaku.controller.a r0 = r0.j
                    master.flame.danmaku.danmaku.model.b r1 = r0.d
                    master.flame.danmaku.danmaku.model.o<?> r4 = r9.y
                    master.flame.danmaku.danmaku.model.android.f r4 = (master.flame.danmaku.danmaku.model.android.f) r4
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r0.c
                    master.flame.danmaku.danmaku.model.android.c r0 = r0.E
                    int r0 = r0.a
                    master.flame.danmaku.danmaku.model.android.f r0 = v4.a.a(r9, r1, r4, r0)
                    r9.y = r0
                    master.flame.danmaku.controller.a$b r0 = r8.e
                    master.flame.danmaku.controller.a.b.h(r0, r9, r2, r3)
                    return
                L4a:
                    boolean r2 = r9.z
                    if (r2 == 0) goto L57
                    master.flame.danmaku.controller.a$b r0 = r8.e
                    master.flame.danmaku.controller.a.b.i(r0, r9)
                    r8.h(r9)
                    return
                L57:
                    if (r0 == 0) goto L62
                    boolean r2 = r0.hasReferences()
                    if (r2 == 0) goto L62
                    r0.destroy()
                L62:
                    master.flame.danmaku.controller.a$b r0 = r8.e
                    r0.s(r3, r9, r1)
                    r8.e(r9)
                    return
                L6b:
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    master.flame.danmaku.controller.a.b.g(r9)
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    master.flame.danmaku.controller.a r9 = r9.j
                    master.flame.danmaku.danmaku.model.f r9 = master.flame.danmaku.controller.a.z(r9)
                    master.flame.danmaku.controller.a$b r0 = r8.e
                    master.flame.danmaku.controller.a r0 = r0.j
                    master.flame.danmaku.danmaku.model.f r0 = r0.i
                    long r0 = r0.a
                    r9.update(r0)
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    master.flame.danmaku.controller.a r9 = r9.j
                    r9.i()
                    return
                L8b:
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    master.flame.danmaku.controller.a.b.g(r9)
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    master.flame.danmaku.controller.a r9 = r9.j
                    master.flame.danmaku.danmaku.model.f r9 = master.flame.danmaku.controller.a.z(r9)
                    master.flame.danmaku.controller.a$b r0 = r8.e
                    master.flame.danmaku.controller.a r0 = r0.j
                    master.flame.danmaku.danmaku.model.f r0 = r0.i
                    long r0 = r0.a
                    r9.update(r0)
                    return
                La4:
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    master.flame.danmaku.controller.a.b.k(r9)
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    master.flame.danmaku.controller.a r9 = r9.j
                    master.flame.danmaku.danmaku.model.f r9 = master.flame.danmaku.controller.a.z(r9)
                    master.flame.danmaku.controller.a$b r0 = r8.e
                    master.flame.danmaku.controller.a r0 = r0.j
                    master.flame.danmaku.danmaku.model.f r1 = r0.i
                    long r1 = r1.a
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r0.c
                    master.flame.danmaku.danmaku.model.android.d r0 = r0.D
                    long r4 = r0.e
                    long r1 = r1 - r4
                    r9.update(r1)
                    r8.c = r3
                    return
                Lc6:
                    r8.removeCallbacksAndMessages(r1)
                    r8.a = r3
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    master.flame.danmaku.controller.a.b.k(r9)
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    master.flame.danmaku.controller.a.b.l(r9)
                    android.os.Looper r9 = r8.getLooper()
                    r9.quit()
                    return
                Ldd:
                    java.lang.Object r9 = r9.obj
                    java.lang.Long r9 = (java.lang.Long) r9
                    if (r9 == 0) goto L161
                    long r0 = r9.longValue()
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    master.flame.danmaku.controller.a r9 = r9.j
                    master.flame.danmaku.danmaku.model.f r9 = master.flame.danmaku.controller.a.z(r9)
                    long r4 = r9.a
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    master.flame.danmaku.controller.a r9 = r9.j
                    master.flame.danmaku.danmaku.model.f r9 = master.flame.danmaku.controller.a.z(r9)
                    r9.update(r0)
                    r8.c = r3
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    long r6 = r9.w()
                    int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                    if (r9 > 0) goto L11c
                    long r6 = r6 - r0
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    master.flame.danmaku.controller.a r0 = r9.j
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r0.c
                    master.flame.danmaku.danmaku.model.android.d r0 = r0.D
                    long r0 = r0.e
                    int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                    if (r2 <= 0) goto L118
                    goto L11c
                L118:
                    master.flame.danmaku.controller.a.b.j(r9)
                    goto L121
                L11c:
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    master.flame.danmaku.controller.a.b.g(r9)
                L121:
                    r8.n(r3)
                    r8.r()
                    return
                L128:
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    master.flame.danmaku.controller.a.b.j(r9)
                    return
                L12e:
                    r9 = 3
                    r8.removeMessages(r9)
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    master.flame.danmaku.controller.a r9 = r9.j
                    master.flame.danmaku.controller.h$a r0 = r9.g
                    if (r0 == 0) goto L13e
                    boolean r9 = r9.n
                    if (r9 == 0) goto L142
                L13e:
                    boolean r9 = r8.c
                    if (r9 == 0) goto L144
                L142:
                    r9 = 1
                    goto L145
                L144:
                    r9 = 0
                L145:
                    r8.n(r9)
                    if (r9 == 0) goto L14c
                    r8.c = r2
                L14c:
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    master.flame.danmaku.controller.a r9 = r9.j
                    master.flame.danmaku.controller.h$a r0 = r9.g
                    if (r0 == 0) goto L161
                    boolean r9 = r9.n
                    if (r9 != 0) goto L161
                    r0.c()
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    master.flame.danmaku.controller.a r9 = r9.j
                    r9.n = r3
                L161:
                    return
                L162:
                    java.lang.Object r9 = r9.obj
                    master.flame.danmaku.danmaku.model.d r9 = (master.flame.danmaku.danmaku.model.d) r9
                    r8.e(r9)
                    return
                L16a:
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    master.flame.danmaku.controller.a.b.g(r9)
                L16f:
                    r9 = 300(0x12c, float:4.2E-43)
                    if (r2 >= r9) goto L182
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    master.flame.danmaku.danmaku.model.objectpool.b<master.flame.danmaku.danmaku.model.android.f> r9 = r9.d
                    master.flame.danmaku.danmaku.model.android.f r0 = new master.flame.danmaku.danmaku.model.android.f
                    r0.<init>()
                    r9.a(r0)
                    int r2 = r2 + 1
                    goto L16f
                L182:
                    long r0 = r8.i()
                    r2 = 0
                    int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r9 > 0) goto L199
                    master.flame.danmaku.controller.a$b r9 = r8.e
                    master.flame.danmaku.controller.a r9 = r9.j
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r9 = r9.c
                    master.flame.danmaku.danmaku.model.android.d r9 = r9.D
                    long r0 = r9.e
                    r2 = 2
                    long r0 = r0 / r2
                L199:
                    r9 = 16
                    r8.sendEmptyMessageDelayed(r9, r0)
                    return
            }

            public boolean j() {
                    r1 = this;
                    boolean r0 = r1.a
                    return r0
            }

            public void k(boolean r1) {
                    r0 = this;
                    r1 = r1 ^ 1
                    r0.b = r1
                    return
            }

            public void l() {
                    r1 = this;
                    r0 = 1
                    r1.a = r0
                    r0 = 0
                    r1.removeCallbacksAndMessages(r0)
                    r0 = 6
                    r1.sendEmptyMessage(r0)
                    return
            }

            public void p(long r5) {
                    r4 = this;
                    r0 = 3
                    r4.removeMessages(r0)
                    r1 = 1
                    r4.c = r1
                    r1 = 18
                    r4.sendEmptyMessage(r1)
                    master.flame.danmaku.controller.a$b r1 = r4.e
                    master.flame.danmaku.controller.a r1 = r1.j
                    master.flame.danmaku.danmaku.model.f r1 = master.flame.danmaku.controller.a.z(r1)
                    master.flame.danmaku.controller.a$b r2 = r4.e
                    master.flame.danmaku.controller.a r2 = r2.j
                    master.flame.danmaku.danmaku.model.f r2 = r2.i
                    long r2 = r2.a
                    long r2 = r2 + r5
                    r1.update(r2)
                    r4.sendEmptyMessage(r0)
                    return
            }

            public void q() {
                    r1 = this;
                    r0 = 1
                    r1.d = r0
                    return
            }

            public void r() {
                    r3 = this;
                    r0 = 18
                    r3.sendEmptyMessage(r0)
                    r0 = 0
                    r3.a = r0
                    r0 = 16
                    r3.removeMessages(r0)
                    r3.sendEmptyMessage(r0)
                    master.flame.danmaku.controller.a$b r0 = r3.e
                    master.flame.danmaku.controller.a r0 = r0.j
                    master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r0.c
                    master.flame.danmaku.danmaku.model.android.d r0 = r0.D
                    long r0 = r0.e
                    r2 = 4
                    r3.sendEmptyMessageDelayed(r2, r0)
                    return
            }
        }

        public b(master.flame.danmaku.controller.a r2, int r3, int r4) {
                r1 = this;
                r1.j = r2
                r1.<init>()
                master.flame.danmaku.danmaku.model.android.e r2 = new master.flame.danmaku.danmaku.model.android.e
                r2.<init>()
                r1.b = r2
                master.flame.danmaku.danmaku.model.android.h r2 = new master.flame.danmaku.danmaku.model.android.h
                r2.<init>()
                r1.c = r2
                r0 = 800(0x320, float:1.121E-42)
                master.flame.danmaku.danmaku.model.objectpool.b r2 = master.flame.danmaku.danmaku.model.objectpool.e.a(r2, r0)
                r1.d = r2
                r2 = 0
                r1.i = r2
                r1.f = r2
                r1.e = r3
                r1.g = r4
                return
        }

        private boolean C(master.flame.danmaku.danmaku.model.d r1, int r2, boolean r3) {
                r0 = this;
                if (r2 <= 0) goto L5
                r0.p(r2, r3)
            L5:
                master.flame.danmaku.danmaku.model.android.e r3 = r0.b
                r3.j(r1)
                int r1 = r0.f
                int r1 = r1 + r2
                r0.f = r1
                r1 = 1
                return r1
        }

        static /* synthetic */ int b(master.flame.danmaku.controller.a.b r0) {
                int r0 = r0.g
                return r0
        }

        static /* synthetic */ master.flame.danmaku.danmaku.model.d c(master.flame.danmaku.controller.a.b r0, master.flame.danmaku.danmaku.model.d r1, boolean r2, int r3) {
                master.flame.danmaku.danmaku.model.d r0 = r0.v(r1, r2, r3)
                return r0
        }

        static /* synthetic */ int d(master.flame.danmaku.controller.a.b r0) {
                int r0 = r0.f
                return r0
        }

        static /* synthetic */ int e(master.flame.danmaku.controller.a.b r0) {
                int r0 = r0.e
                return r0
        }

        static /* synthetic */ void f(master.flame.danmaku.controller.a.b r0, int r1, boolean r2) {
                r0.p(r1, r2)
                return
        }

        static /* synthetic */ void g(master.flame.danmaku.controller.a.b r0) {
                r0.u()
                return
        }

        static /* synthetic */ boolean h(master.flame.danmaku.controller.a.b r0, master.flame.danmaku.danmaku.model.d r1, int r2, boolean r3) {
                boolean r0 = r0.C(r1, r2, r3)
                return r0
        }

        static /* synthetic */ long i(master.flame.danmaku.controller.a.b r0, master.flame.danmaku.danmaku.model.d r1) {
                long r0 = r0.n(r1)
                return r0
        }

        static /* synthetic */ void j(master.flame.danmaku.controller.a.b r0) {
                r0.q()
                return
        }

        static /* synthetic */ void k(master.flame.danmaku.controller.a.b r0) {
                r0.t()
                return
        }

        static /* synthetic */ void l(master.flame.danmaku.controller.a.b r0) {
                r0.o()
                return
        }

        private long n(master.flame.danmaku.danmaku.model.d r6) {
                r5 = this;
                master.flame.danmaku.danmaku.model.o<?> r0 = r6.y
                r1 = 0
                if (r0 != 0) goto L7
                return r1
            L7:
                boolean r3 = r0.hasReferences()
                r4 = 0
                if (r3 == 0) goto L14
                r0.c()
                r6.y = r4
                return r1
            L14:
                int r1 = r5.J(r6)
                long r1 = (long) r1
                r0.destroy()
                r6.y = r4
                return r1
        }

        private void o() {
                r1 = this;
            L0:
                master.flame.danmaku.danmaku.model.objectpool.b<master.flame.danmaku.danmaku.model.android.f> r0 = r1.d
                master.flame.danmaku.danmaku.model.objectpool.c r0 = r0.acquire()
                master.flame.danmaku.danmaku.model.android.f r0 = (master.flame.danmaku.danmaku.model.android.f) r0
                if (r0 == 0) goto Le
                r0.destroy()
                goto L0
            Le:
                return
        }

        private void p(int r4, boolean r5) {
                r3 = this;
                master.flame.danmaku.danmaku.model.android.e r0 = r3.b
                master.flame.danmaku.danmaku.model.d r0 = r0.first()
            L6:
                int r1 = r3.f
                int r1 = r1 + r4
                int r2 = r3.e
                if (r1 <= r2) goto L30
                if (r0 == 0) goto L30
                boolean r1 = r0.w()
                if (r1 != 0) goto L1f
                boolean r1 = r0.n()
                if (r1 == 0) goto L1c
                goto L1f
            L1c:
                if (r5 == 0) goto L6
                goto L30
            L1f:
                r1 = 0
                r2 = 0
                r3.s(r1, r0, r2)
                master.flame.danmaku.danmaku.model.android.e r1 = r3.b
                r1.e(r0)
                master.flame.danmaku.danmaku.model.android.e r0 = r3.b
                master.flame.danmaku.danmaku.model.d r0 = r0.first()
                goto L6
            L30:
                return
        }

        private void q() {
                r2 = this;
                master.flame.danmaku.danmaku.model.android.e r0 = r2.b
                master.flame.danmaku.controller.a$b$c r1 = new master.flame.danmaku.controller.a$b$c
                r1.<init>(r2)
                r0.f(r1)
                return
        }

        private void t() {
                r2 = this;
                master.flame.danmaku.danmaku.model.android.e r0 = r2.b
                if (r0 == 0) goto L11
                master.flame.danmaku.controller.a$b$a r1 = new master.flame.danmaku.controller.a$b$a
                r1.<init>(r2)
                r0.f(r1)
                master.flame.danmaku.danmaku.model.android.e r0 = r2.b
                r0.clear()
            L11:
                r0 = 0
                r2.f = r0
                return
        }

        private void u() {
                r2 = this;
                master.flame.danmaku.danmaku.model.android.e r0 = r2.b
                if (r0 == 0) goto Lc
                master.flame.danmaku.controller.a$b$b r1 = new master.flame.danmaku.controller.a$b$b
                r1.<init>(r2)
                r0.f(r1)
            Lc:
                return
        }

        private master.flame.danmaku.danmaku.model.d v(master.flame.danmaku.danmaku.model.d r9, boolean r10, int r11) {
                r8 = this;
                if (r10 != 0) goto Ld
                master.flame.danmaku.controller.a r0 = r8.j
                master.flame.danmaku.danmaku.model.b r0 = r0.d
                int r0 = r0.n()
                int r0 = r0 * 2
                goto Le
            Ld:
                r0 = 0
            Le:
                master.flame.danmaku.controller.a r1 = r8.j
                master.flame.danmaku.danmaku.model.android.DanmakuContext r1 = r1.c
                master.flame.danmaku.danmaku.model.android.c r1 = r1.E
                int r1 = r1.e
                int r7 = r0 + r1
                master.flame.danmaku.controller.a$b$d r2 = new master.flame.danmaku.controller.a$b$d
                r3 = r8
                r5 = r9
                r6 = r10
                r4 = r11
                r2.<init>(r3, r4, r5, r6, r7)
                master.flame.danmaku.danmaku.model.android.e r9 = r3.b
                r9.f(r2)
                java.lang.Object r9 = r2.d()
                master.flame.danmaku.danmaku.model.d r9 = (master.flame.danmaku.danmaku.model.d) r9
                return r9
        }

        public void A(int r3) {
                r2 = this;
                master.flame.danmaku.controller.a$b$e r0 = r2.h
                if (r0 == 0) goto Lc
                r1 = 1
                if (r3 != r1) goto L8
                goto L9
            L8:
                r1 = 0
            L9:
                r0.k(r1)
            Lc:
                return
        }

        public void B(java.lang.Runnable r2) {
                r1 = this;
                master.flame.danmaku.controller.a$b$e r0 = r1.h
                if (r0 != 0) goto L5
                return
            L5:
                r0.post(r2)
                return
        }

        public void D(long r2) {
                r1 = this;
                master.flame.danmaku.controller.a$b$e r0 = r1.h
                if (r0 == 0) goto L7
                r0.p(r2)
            L7:
                return
        }

        public void E() {
                r2 = this;
                master.flame.danmaku.controller.a$b$e r0 = r2.h
                if (r0 != 0) goto L5
                return
            L5:
                r1 = 3
                r0.removeMessages(r1)
                master.flame.danmaku.controller.a$b$e r0 = r2.h
                r1 = 18
                r0.removeMessages(r1)
                master.flame.danmaku.controller.a$b$e r0 = r2.h
                r0.q()
                master.flame.danmaku.controller.a$b$e r0 = r2.h
                r1 = 7
                r0.removeMessages(r1)
                master.flame.danmaku.controller.a$b$e r0 = r2.h
                r0.sendEmptyMessage(r1)
                return
        }

        public void F() {
                r2 = this;
                master.flame.danmaku.controller.a$b$e r0 = r2.h
                if (r0 != 0) goto L5
                return
            L5:
                r1 = 4
                r0.removeMessages(r1)
                master.flame.danmaku.controller.a$b$e r0 = r2.h
                r0.sendEmptyMessage(r1)
                return
        }

        public void G() {
                r2 = this;
                master.flame.danmaku.controller.a$b$e r0 = r2.h
                if (r0 != 0) goto L5
                return
            L5:
                r1 = 9
                r0.removeMessages(r1)
                master.flame.danmaku.controller.a$b$e r0 = r2.h
                r0.sendEmptyMessage(r1)
                return
        }

        public void H() {
                r1 = this;
                master.flame.danmaku.controller.a$b$e r0 = r1.h
                if (r0 == 0) goto L8
                r0.r()
                return
            L8:
                r1.m()
                return
        }

        public void I(long r3) {
                r2 = this;
                master.flame.danmaku.controller.a$b$e r0 = r2.h
                if (r0 != 0) goto L5
                return
            L5:
                r0.q()
                master.flame.danmaku.controller.a$b$e r0 = r2.h
                r1 = 3
                r0.removeMessages(r1)
                master.flame.danmaku.controller.a$b$e r0 = r2.h
                r1 = 5
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
        }

        protected int J(master.flame.danmaku.danmaku.model.d r2) {
                r1 = this;
                master.flame.danmaku.danmaku.model.o<?> r0 = r2.y
                if (r0 == 0) goto L11
                boolean r0 = r0.hasReferences()
                if (r0 != 0) goto L11
                master.flame.danmaku.danmaku.model.o<?> r2 = r2.y
                int r2 = r2.size()
                return r2
            L11:
                r2 = 0
                return r2
        }

        @Override // master.flame.danmaku.danmaku.model.k
        public void a(master.flame.danmaku.danmaku.model.d r3) {
                r2 = this;
                master.flame.danmaku.controller.a$b$e r0 = r2.h
                if (r0 == 0) goto L20
                boolean r1 = r3.z
                if (r1 == 0) goto L18
                boolean r1 = r3.A
                if (r1 == 0) goto L18
                boolean r0 = r3.w()
                if (r0 != 0) goto L20
                master.flame.danmaku.controller.a$b$e r0 = r2.h
                r0.h(r3)
                return
            L18:
                r1 = 2
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
            L20:
                return
        }

        public void m() {
                r2 = this;
                r0 = 0
                r2.i = r0
                android.os.HandlerThread r0 = r2.a
                if (r0 != 0) goto L13
                android.os.HandlerThread r0 = new android.os.HandlerThread
                java.lang.String r1 = "DFM Cache-Building Thread"
                r0.<init>(r1)
                r2.a = r0
                r0.start()
            L13:
                master.flame.danmaku.controller.a$b$e r0 = r2.h
                if (r0 != 0) goto L24
                master.flame.danmaku.controller.a$b$e r0 = new master.flame.danmaku.controller.a$b$e
                android.os.HandlerThread r1 = r2.a
                android.os.Looper r1 = r1.getLooper()
                r0.<init>(r2, r1)
                r2.h = r0
            L24:
                master.flame.danmaku.controller.a$b$e r0 = r2.h
                r0.f()
                return
        }

        public void r() {
                r2 = this;
                r0 = 1
                r2.i = r0
                master.flame.danmaku.controller.a r0 = r2.j
                java.lang.Object r0 = master.flame.danmaku.controller.a.w(r0)
                monitor-enter(r0)
                master.flame.danmaku.controller.a r1 = r2.j     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r1 = master.flame.danmaku.controller.a.w(r1)     // Catch: java.lang.Throwable -> L2d
                r1.notifyAll()     // Catch: java.lang.Throwable -> L2d
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
                master.flame.danmaku.controller.a$b$e r0 = r2.h
                r1 = 0
                if (r0 == 0) goto L1e
                r0.l()
                r2.h = r1
            L1e:
                android.os.HandlerThread r0 = r2.a
                if (r0 == 0) goto L2c
                r0.join()     // Catch: java.lang.InterruptedException -> L25
            L25:
                android.os.HandlerThread r0 = r2.a
                r0.quit()
                r2.a = r1
            L2c:
                return
            L2d:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
                throw r1
        }

        protected void s(boolean r4, master.flame.danmaku.danmaku.model.d r5, master.flame.danmaku.danmaku.model.d r6) {
                r3 = this;
                master.flame.danmaku.danmaku.model.o r4 = r5.e()
                if (r4 == 0) goto L34
                long r0 = r3.n(r5)
                boolean r6 = r5.w()
                if (r6 == 0) goto L1f
                master.flame.danmaku.controller.a r6 = r3.j
                master.flame.danmaku.danmaku.model.android.DanmakuContext r6 = r6.c
                master.flame.danmaku.danmaku.model.b r6 = r6.g()
                master.flame.danmaku.danmaku.model.android.b r6 = r6.t()
                r6.g(r5)
            L1f:
                r5 = 0
                int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r2 > 0) goto L26
                goto L34
            L26:
                int r5 = r3.f
                long r5 = (long) r5
                long r5 = r5 - r0
                int r6 = (int) r5
                r3.f = r6
                master.flame.danmaku.danmaku.model.objectpool.b<master.flame.danmaku.danmaku.model.android.f> r5 = r3.d
                master.flame.danmaku.danmaku.model.android.f r4 = (master.flame.danmaku.danmaku.model.android.f) r4
                r5.a(r4)
            L34:
                return
        }

        public long w() {
                r3 = this;
                master.flame.danmaku.danmaku.model.android.e r0 = r3.b
                r1 = 0
                if (r0 == 0) goto L1a
                int r0 = r0.size()
                if (r0 <= 0) goto L1a
                master.flame.danmaku.danmaku.model.android.e r0 = r3.b
                master.flame.danmaku.danmaku.model.d r0 = r0.first()
                if (r0 != 0) goto L15
                return r1
            L15:
                long r0 = r0.b()
                return r0
            L1a:
                return r1
        }

        public float x() {
                r2 = this;
                int r0 = r2.e
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                int r1 = r2.f
                float r1 = (float) r1
                float r0 = (float) r0
                float r1 = r1 / r0
                return r1
        }

        public void y(master.flame.danmaku.danmaku.model.d r2, boolean r3) {
                r1 = this;
                master.flame.danmaku.controller.a$b$e r3 = r1.h
                if (r3 == 0) goto L12
                r3.q()
                master.flame.danmaku.controller.a$b$e r3 = r1.h
                r0 = 17
                android.os.Message r2 = r3.obtainMessage(r0, r2)
                r2.sendToTarget()
            L12:
                return
        }

        public boolean z() {
                r2 = this;
                int r0 = r2.f
                int r0 = r0 + 5120
                int r1 = r2.e
                if (r0 < r1) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }
    }

    static {
            return
    }

    public a(master.flame.danmaku.danmaku.model.f r3, master.flame.danmaku.danmaku.model.android.DanmakuContext r4, master.flame.danmaku.controller.h.a r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            r3 = 2
            r2.x = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.A = r3
            tv.cjump.jni.NativeBitmapFactory.g()
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
            long r0 = r3.maxMemory()
            float r3 = (float) r0
            master.flame.danmaku.danmaku.model.android.c r4 = r4.E
            float r4 = r4.b
            float r3 = r3 * r4
            r4 = 1249902592(0x4a800000, float:4194304.0)
            float r3 = java.lang.Math.max(r4, r3)
            int r3 = (int) r3
            r2.x = r3
            master.flame.danmaku.controller.a$b r4 = new master.flame.danmaku.controller.a$b
            r5 = 3
            r4.<init>(r2, r3, r5)
            r2.y = r4
            u4.a r3 = r2.h
            r3.e(r4)
            return
    }

    static /* synthetic */ java.lang.Object w(master.flame.danmaku.controller.a r0) {
            java.lang.Object r0 = r0.A
            return r0
    }

    static /* synthetic */ int x(master.flame.danmaku.controller.a r0) {
            int r0 = r0.x
            return r0
    }

    static /* synthetic */ master.flame.danmaku.controller.a.b y(master.flame.danmaku.controller.a r0) {
            master.flame.danmaku.controller.a$b r0 = r0.y
            return r0
    }

    static /* synthetic */ master.flame.danmaku.danmaku.model.f z(master.flame.danmaku.controller.a r0) {
            master.flame.danmaku.danmaku.model.f r0 = r0.z
            return r0
    }

    @Override // master.flame.danmaku.controller.e, master.flame.danmaku.controller.h
    public void a(master.flame.danmaku.danmaku.model.d r2) {
            r1 = this;
            super.a(r2)
            master.flame.danmaku.controller.a$b r0 = r1.y
            if (r0 != 0) goto L8
            return
        L8:
            r0.a(r2)
            return
    }

    @Override // master.flame.danmaku.controller.e, master.flame.danmaku.controller.h
    public void b(master.flame.danmaku.danmaku.model.d r2, boolean r3) {
            r1 = this;
            master.flame.danmaku.controller.a$b r0 = r1.y
            if (r0 != 0) goto L8
            super.b(r2, r3)
            return
        L8:
            r0.y(r2, r3)
            return
    }

    @Override // master.flame.danmaku.controller.e, master.flame.danmaku.controller.h
    public void c(boolean r1) {
            r0 = this;
            super.c(r1)
            master.flame.danmaku.controller.a$b r1 = r0.y
            if (r1 == 0) goto La
            r1.E()
        La:
            return
    }

    @Override // master.flame.danmaku.controller.e, master.flame.danmaku.controller.h
    public void h(long r1, long r3, long r5) {
            r0 = this;
            super.h(r1, r3, r5)
            r1 = r0
            master.flame.danmaku.controller.a$b r2 = r1.y
            if (r2 == 0) goto Lb
            r2.I(r3)
        Lb:
            return
    }

    @Override // master.flame.danmaku.controller.e, master.flame.danmaku.controller.h
    public void k() {
            r2 = this;
            super.k()
            r2.reset()
            u4.a r0 = r2.h
            r1 = 0
            r0.e(r1)
            master.flame.danmaku.controller.a$b r0 = r2.y
            if (r0 == 0) goto L15
            r0.r()
            r2.y = r1
        L15:
            tv.cjump.jni.NativeBitmapFactory.i()
            return
    }

    @Override // master.flame.danmaku.controller.e, master.flame.danmaku.controller.h
    public u4.a.c l(master.flame.danmaku.danmaku.model.b r4) {
            r3 = this;
            u4.a$c r4 = super.l(r4)
            java.lang.Object r0 = r3.A
            monitor-enter(r0)
            java.lang.Object r1 = r3.A     // Catch: java.lang.Throwable -> L2c
            r1.notify()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            if (r4 == 0) goto L2b
            master.flame.danmaku.controller.a$b r0 = r3.y
            if (r0 == 0) goto L2b
            int r1 = r4.k
            int r2 = r4.l
            int r1 = r1 - r2
            r2 = -20
            if (r1 >= r2) goto L2b
            r0.F()
            master.flame.danmaku.controller.a$b r0 = r3.y
            master.flame.danmaku.danmaku.model.android.DanmakuContext r1 = r3.c
            master.flame.danmaku.danmaku.model.android.d r1 = r1.D
            long r1 = r1.e
            long r1 = -r1
            r0.D(r1)
        L2b:
            return r4
        L2c:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r4
    }

    @Override // master.flame.danmaku.controller.e, master.flame.danmaku.controller.h
    public void onPlayStateChanged(int r2) {
            r1 = this;
            super.onPlayStateChanged(r2)
            master.flame.danmaku.controller.a$b r0 = r1.y
            if (r0 == 0) goto La
            r0.A(r2)
        La:
            return
    }

    @Override // master.flame.danmaku.controller.e, master.flame.danmaku.controller.h
    public void prepare() {
            r1 = this;
            master.flame.danmaku.danmaku.parser.a r0 = r1.f
            r1.s(r0)
            master.flame.danmaku.controller.a$b r0 = r1.y
            r0.m()
            return
    }

    @Override // master.flame.danmaku.controller.e
    protected void r(master.flame.danmaku.danmaku.model.f r4) {
            r3 = this;
            r3.i = r4
            master.flame.danmaku.danmaku.model.f r0 = new master.flame.danmaku.danmaku.model.f
            r0.<init>()
            r3.z = r0
            long r1 = r4.a
            r0.update(r1)
            return
    }

    @Override // master.flame.danmaku.controller.e, master.flame.danmaku.controller.h
    public void seek(long r2) {
            r1 = this;
            super.seek(r2)
            master.flame.danmaku.controller.a$b r0 = r1.y
            if (r0 != 0) goto La
            r1.start()
        La:
            master.flame.danmaku.controller.a$b r0 = r1.y
            r0.I(r2)
            return
    }

    @Override // master.flame.danmaku.controller.e, master.flame.danmaku.controller.h
    public void start() {
            r3 = this;
            super.start()
            tv.cjump.jni.NativeBitmapFactory.g()
            master.flame.danmaku.controller.a$b r0 = r3.y
            if (r0 != 0) goto L1f
            master.flame.danmaku.controller.a$b r0 = new master.flame.danmaku.controller.a$b
            int r1 = r3.x
            r2 = 3
            r0.<init>(r3, r1, r2)
            r3.y = r0
            r0.m()
            u4.a r0 = r3.h
            master.flame.danmaku.controller.a$b r1 = r3.y
            r0.e(r1)
            return
        L1f:
            r0.H()
            return
    }

    @Override // master.flame.danmaku.controller.e
    public boolean t(master.flame.danmaku.danmaku.model.android.DanmakuContext r3, master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag r4, java.lang.Object... r5) {
            r2 = this;
            boolean r3 = super.q(r3, r4, r5)
            if (r3 == 0) goto L8
            goto L91
        L8:
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r3 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.SCROLL_SPEED_FACTOR
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L1e
            master.flame.danmaku.danmaku.model.b r3 = r2.d
            master.flame.danmaku.danmaku.model.android.DanmakuContext r4 = r2.c
            float r4 = r4.c
            r3.a(r4)
            r2.i()
            goto L91
        L1e:
            boolean r3 = r4.isVisibilityRelatedTag()
            r0 = 0
            if (r3 == 0) goto L47
            if (r5 == 0) goto L43
            int r3 = r5.length
            if (r3 <= 0) goto L43
            r3 = 0
            r3 = r5[r3]
            if (r3 == 0) goto L43
            boolean r4 = r3 instanceof java.lang.Boolean
            if (r4 == 0) goto L3c
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L43
        L3c:
            master.flame.danmaku.controller.a$b r3 = r2.y
            if (r3 == 0) goto L43
            r3.D(r0)
        L43:
            r2.i()
            goto L91
        L47:
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r3 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.TRANSPARENCY
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L6d
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r3 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.SCALE_TEXTSIZE
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L6d
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r3 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.DANMAKU_STYLE
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L60
            goto L6d
        L60:
            master.flame.danmaku.controller.a$b r3 = r2.y
            if (r3 == 0) goto L91
            r3.G()
            master.flame.danmaku.controller.a$b r3 = r2.y
            r3.D(r0)
            goto L91
        L6d:
            master.flame.danmaku.danmaku.model.android.DanmakuContext$DanmakuConfigTag r3 = master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag.SCALE_TEXTSIZE
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L7e
            master.flame.danmaku.danmaku.model.b r3 = r2.d
            master.flame.danmaku.danmaku.model.android.DanmakuContext r4 = r2.c
            float r4 = r4.c
            r3.a(r4)
        L7e:
            master.flame.danmaku.controller.a$b r3 = r2.y
            if (r3 == 0) goto L91
            r3.E()
            master.flame.danmaku.controller.a$b r3 = r2.y
            master.flame.danmaku.danmaku.model.android.DanmakuContext r4 = r2.c
            master.flame.danmaku.danmaku.model.android.d r4 = r4.D
            long r4 = r4.e
            long r4 = -r4
            r3.D(r4)
        L91:
            master.flame.danmaku.controller.h$a r3 = r2.g
            if (r3 == 0) goto La1
            master.flame.danmaku.controller.a$b r3 = r2.y
            if (r3 == 0) goto La1
            master.flame.danmaku.controller.a$a r4 = new master.flame.danmaku.controller.a$a
            r4.<init>(r2)
            r3.B(r4)
        La1:
            r3 = 1
            return r3
    }

    @Override // master.flame.danmaku.controller.e
    protected void u(master.flame.danmaku.danmaku.model.d r3) {
            r2 = this;
            super.u(r3)
            master.flame.danmaku.controller.a$b r0 = r2.y
            if (r0 == 0) goto L17
            int r3 = r2.B
            int r3 = r3 + 1
            r2.B = r3
            r1 = 5
            if (r3 <= r1) goto L2d
            r0.F()
            r3 = 0
            r2.B = r3
            return
        L17:
            master.flame.danmaku.danmaku.model.o r0 = r3.e()
            if (r0 == 0) goto L2d
            boolean r1 = r0.hasReferences()
            if (r1 == 0) goto L27
            r0.c()
            goto L2a
        L27:
            r0.destroy()
        L2a:
            r0 = 0
            r3.y = r0
        L2d:
            return
    }
}
