package com.bumptech.glide.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class j<R> implements com.bumptech.glide.request.e, com.bumptech.glide.request.target.o, com.bumptech.glide.request.i {
    private static final java.lang.String D = "Request";
    private static final java.lang.String E = "Glide";
    private static final boolean F = false;

    @androidx.annotation.GuardedBy("requestLock")
    private int A;

    @androidx.annotation.GuardedBy("requestLock")
    private boolean B;

    @androidx.annotation.Nullable
    private java.lang.RuntimeException C;

    @androidx.annotation.Nullable
    private final java.lang.String a;
    private final com.bumptech.glide.util.pool.c b;
    private final java.lang.Object c;

    @androidx.annotation.Nullable
    private final com.bumptech.glide.request.g<R> d;
    private final com.bumptech.glide.request.RequestCoordinator e;
    private final android.content.Context f;
    private final com.bumptech.glide.d g;

    @androidx.annotation.Nullable
    private final java.lang.Object h;
    private final java.lang.Class<R> i;
    private final com.bumptech.glide.request.a<?> j;
    private final int k;

    /* renamed from: l, reason: collision with root package name */
    private final int f529l;

    /* renamed from: m, reason: collision with root package name */
    private final com.bumptech.glide.Priority f530m;

    /* renamed from: n, reason: collision with root package name */
    private final com.bumptech.glide.request.target.p<R> f531n;

    /* renamed from: o, reason: collision with root package name */
    @androidx.annotation.Nullable
    private final java.util.List<com.bumptech.glide.request.g<R>> f532o;

    /* renamed from: p, reason: collision with root package name */
    private final com.bumptech.glide.request.transition.g<? super R> f533p;

    /* renamed from: q, reason: collision with root package name */
    private final java.util.concurrent.Executor f534q;

    /* renamed from: r, reason: collision with root package name */
    @androidx.annotation.GuardedBy("requestLock")
    private com.bumptech.glide.load.engine.u<R> f535r;

    /* renamed from: s, reason: collision with root package name */
    @androidx.annotation.GuardedBy("requestLock")
    private com.bumptech.glide.load.engine.k.d f536s;

    /* renamed from: t, reason: collision with root package name */
    @androidx.annotation.GuardedBy("requestLock")
    private long f537t;

    /* renamed from: u, reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.k f538u;

    /* renamed from: v, reason: collision with root package name */
    @androidx.annotation.GuardedBy("requestLock")
    private com.bumptech.glide.request.j.a f539v;

    /* renamed from: w, reason: collision with root package name */
    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("requestLock")
    private android.graphics.drawable.Drawable f540w;

    /* renamed from: x, reason: collision with root package name */
    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("requestLock")
    private android.graphics.drawable.Drawable f541x;

    /* renamed from: y, reason: collision with root package name */
    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("requestLock")
    private android.graphics.drawable.Drawable f542y;

    /* renamed from: z, reason: collision with root package name */
    @androidx.annotation.GuardedBy("requestLock")
    private int f543z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum a extends java.lang.Enum<com.bumptech.glide.request.j.a> {
        public static final com.bumptech.glide.request.j.a a = null;
        public static final com.bumptech.glide.request.j.a b = null;
        public static final com.bumptech.glide.request.j.a c = null;
        public static final com.bumptech.glide.request.j.a d = null;
        public static final com.bumptech.glide.request.j.a e = null;
        public static final com.bumptech.glide.request.j.a f = null;
        private static final /* synthetic */ com.bumptech.glide.request.j.a[] g = null;

        static {
                com.bumptech.glide.request.j$a r0 = new com.bumptech.glide.request.j$a
                java.lang.String r1 = "PENDING"
                r2 = 0
                r0.<init>(r1, r2)
                com.bumptech.glide.request.j.a.a = r0
                com.bumptech.glide.request.j$a r1 = new com.bumptech.glide.request.j$a
                java.lang.String r3 = "RUNNING"
                r4 = 1
                r1.<init>(r3, r4)
                com.bumptech.glide.request.j.a.b = r1
                com.bumptech.glide.request.j$a r3 = new com.bumptech.glide.request.j$a
                java.lang.String r5 = "WAITING_FOR_SIZE"
                r6 = 2
                r3.<init>(r5, r6)
                com.bumptech.glide.request.j.a.c = r3
                com.bumptech.glide.request.j$a r5 = new com.bumptech.glide.request.j$a
                java.lang.String r7 = "COMPLETE"
                r8 = 3
                r5.<init>(r7, r8)
                com.bumptech.glide.request.j.a.d = r5
                com.bumptech.glide.request.j$a r7 = new com.bumptech.glide.request.j$a
                java.lang.String r9 = "FAILED"
                r10 = 4
                r7.<init>(r9, r10)
                com.bumptech.glide.request.j.a.e = r7
                com.bumptech.glide.request.j$a r9 = new com.bumptech.glide.request.j$a
                java.lang.String r11 = "CLEARED"
                r12 = 5
                r9.<init>(r11, r12)
                com.bumptech.glide.request.j.a.f = r9
                r11 = 6
                com.bumptech.glide.request.j$a[] r11 = new com.bumptech.glide.request.j.a[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                com.bumptech.glide.request.j.a.g = r11
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bumptech.glide.request.j.a valueOf(java.lang.String r1) {
                java.lang.Class<com.bumptech.glide.request.j$a> r0 = com.bumptech.glide.request.j.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bumptech.glide.request.j$a r1 = (com.bumptech.glide.request.j.a) r1
                return r1
        }

        public static com.bumptech.glide.request.j.a[] values() {
                com.bumptech.glide.request.j$a[] r0 = com.bumptech.glide.request.j.a.g
                java.lang.Object r0 = r0.clone()
                com.bumptech.glide.request.j$a[] r0 = (com.bumptech.glide.request.j.a[]) r0
                return r0
        }
    }

    static {
            java.lang.String r0 = "Request"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            com.bumptech.glide.request.j.F = r0
            return
    }

    private j(android.content.Context r2, com.bumptech.glide.d r3, @androidx.annotation.NonNull java.lang.Object r4, @androidx.annotation.Nullable java.lang.Object r5, java.lang.Class<R> r6, com.bumptech.glide.request.a<?> r7, int r8, int r9, com.bumptech.glide.Priority r10, com.bumptech.glide.request.target.p<R> r11, @androidx.annotation.Nullable com.bumptech.glide.request.g<R> r12, @androidx.annotation.Nullable java.util.List<com.bumptech.glide.request.g<R>> r13, com.bumptech.glide.request.RequestCoordinator r14, com.bumptech.glide.load.engine.k r15, com.bumptech.glide.request.transition.g<? super R> r16, java.util.concurrent.Executor r17) {
            r1 = this;
            r1.<init>()
            boolean r0 = com.bumptech.glide.request.j.F
            if (r0 == 0) goto L10
            int r0 = super.hashCode()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L11
        L10:
            r0 = 0
        L11:
            r1.a = r0
            com.bumptech.glide.util.pool.c r0 = com.bumptech.glide.util.pool.c.a()
            r1.b = r0
            r1.c = r4
            r1.f = r2
            r1.g = r3
            r1.h = r5
            r1.i = r6
            r1.j = r7
            r1.k = r8
            r1.f529l = r9
            r1.f530m = r10
            r1.f531n = r11
            r1.d = r12
            r1.f532o = r13
            r1.e = r14
            r1.f538u = r15
            r2 = r16
            r1.f533p = r2
            r2 = r17
            r1.f534q = r2
            com.bumptech.glide.request.j$a r2 = com.bumptech.glide.request.j.a.a
            r1.f539v = r2
            java.lang.RuntimeException r2 = r1.C
            if (r2 != 0) goto L5a
            com.bumptech.glide.e r2 = r3.g()
            java.lang.Class<com.bumptech.glide.c$d> r3 = com.bumptech.glide.c.d.class
            boolean r2 = r2.b(r3)
            if (r2 == 0) goto L5a
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Glide request origin trace"
            r2.<init>(r3)
            r1.C = r2
        L5a:
            return
    }

    @androidx.annotation.GuardedBy("requestLock")
    private void i() {
            r2 = this;
            boolean r0 = r2.B
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.GuardedBy("requestLock")
    private boolean j() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.e
            if (r0 == 0) goto Ld
            boolean r0 = r0.i(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    @androidx.annotation.GuardedBy("requestLock")
    private boolean k() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.e
            if (r0 == 0) goto Ld
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    @androidx.annotation.GuardedBy("requestLock")
    private boolean l() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.e
            if (r0 == 0) goto Ld
            boolean r0 = r0.d(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    @androidx.annotation.GuardedBy("requestLock")
    private void m() {
            r1 = this;
            r1.i()
            com.bumptech.glide.util.pool.c r0 = r1.b
            r0.c()
            com.bumptech.glide.request.target.p<R> r0 = r1.f531n
            r0.b(r1)
            com.bumptech.glide.load.engine.k$d r0 = r1.f536s
            if (r0 == 0) goto L17
            r0.a()
            r0 = 0
            r1.f536s = r0
        L17:
            return
    }

    @androidx.annotation.GuardedBy("requestLock")
    private android.graphics.drawable.Drawable n() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f540w
            if (r0 != 0) goto L22
            com.bumptech.glide.request.a<?> r0 = r1.j
            android.graphics.drawable.Drawable r0 = r0.I()
            r1.f540w = r0
            if (r0 != 0) goto L22
            com.bumptech.glide.request.a<?> r0 = r1.j
            int r0 = r0.H()
            if (r0 <= 0) goto L22
            com.bumptech.glide.request.a<?> r0 = r1.j
            int r0 = r0.H()
            android.graphics.drawable.Drawable r0 = r1.r(r0)
            r1.f540w = r0
        L22:
            android.graphics.drawable.Drawable r0 = r1.f540w
            return r0
    }

    @androidx.annotation.GuardedBy("requestLock")
    private android.graphics.drawable.Drawable o() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f542y
            if (r0 != 0) goto L22
            com.bumptech.glide.request.a<?> r0 = r1.j
            android.graphics.drawable.Drawable r0 = r0.J()
            r1.f542y = r0
            if (r0 != 0) goto L22
            com.bumptech.glide.request.a<?> r0 = r1.j
            int r0 = r0.K()
            if (r0 <= 0) goto L22
            com.bumptech.glide.request.a<?> r0 = r1.j
            int r0 = r0.K()
            android.graphics.drawable.Drawable r0 = r1.r(r0)
            r1.f542y = r0
        L22:
            android.graphics.drawable.Drawable r0 = r1.f542y
            return r0
    }

    @androidx.annotation.GuardedBy("requestLock")
    private android.graphics.drawable.Drawable p() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f541x
            if (r0 != 0) goto L22
            com.bumptech.glide.request.a<?> r0 = r1.j
            android.graphics.drawable.Drawable r0 = r0.P()
            r1.f541x = r0
            if (r0 != 0) goto L22
            com.bumptech.glide.request.a<?> r0 = r1.j
            int r0 = r0.Q()
            if (r0 <= 0) goto L22
            com.bumptech.glide.request.a<?> r0 = r1.j
            int r0 = r0.Q()
            android.graphics.drawable.Drawable r0 = r1.r(r0)
            r1.f541x = r0
        L22:
            android.graphics.drawable.Drawable r0 = r1.f541x
            return r0
    }

    @androidx.annotation.GuardedBy("requestLock")
    private boolean q() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.e
            if (r0 == 0) goto L11
            com.bumptech.glide.request.RequestCoordinator r0 = r0.getRoot()
            boolean r0 = r0.a()
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }

    @androidx.annotation.GuardedBy("requestLock")
    private android.graphics.drawable.Drawable r(@androidx.annotation.DrawableRes int r3) {
            r2 = this;
            com.bumptech.glide.request.a<?> r0 = r2.j
            android.content.res.Resources$Theme r0 = r0.V()
            if (r0 == 0) goto Lf
            com.bumptech.glide.request.a<?> r0 = r2.j
            android.content.res.Resources$Theme r0 = r0.V()
            goto L15
        Lf:
            android.content.Context r0 = r2.f
            android.content.res.Resources$Theme r0 = r0.getTheme()
        L15:
            com.bumptech.glide.d r1 = r2.g
            android.graphics.drawable.Drawable r3 = com.bumptech.glide.load.resource.drawable.a.a(r1, r3, r0)
            return r3
    }

    private void s(java.lang.String r1) {
            r0 = this;
            return
    }

    private static int t(int r1, float r2) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L5
            return r1
        L5:
            float r1 = (float) r1
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)
            return r1
    }

    @androidx.annotation.GuardedBy("requestLock")
    private void u() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.e
            if (r0 == 0) goto L7
            r0.g(r1)
        L7:
            return
    }

    @androidx.annotation.GuardedBy("requestLock")
    private void v() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.e
            if (r0 == 0) goto L7
            r0.b(r1)
        L7:
            return
    }

    public static <R> com.bumptech.glide.request.j<R> w(android.content.Context r17, com.bumptech.glide.d r18, java.lang.Object r19, java.lang.Object r20, java.lang.Class<R> r21, com.bumptech.glide.request.a<?> r22, int r23, int r24, com.bumptech.glide.Priority r25, com.bumptech.glide.request.target.p<R> r26, com.bumptech.glide.request.g<R> r27, @androidx.annotation.Nullable java.util.List<com.bumptech.glide.request.g<R>> r28, com.bumptech.glide.request.RequestCoordinator r29, com.bumptech.glide.load.engine.k r30, com.bumptech.glide.request.transition.g<? super R> r31, java.util.concurrent.Executor r32) {
            com.bumptech.glide.request.j r0 = new com.bumptech.glide.request.j
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            r16 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
    }

    private void x(com.bumptech.glide.load.engine.GlideException r9, int r10) {
            r8 = this;
            com.bumptech.glide.util.pool.c r0 = r8.b
            r0.c()
            java.lang.Object r0 = r8.c
            monitor-enter(r0)
            java.lang.RuntimeException r1 = r8.C     // Catch: java.lang.Throwable -> L23
            r9.setOrigin(r1)     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.d r1 = r8.g     // Catch: java.lang.Throwable -> L23
            int r1 = r1.h()     // Catch: java.lang.Throwable -> L23
            if (r1 > r10) goto L25
            java.lang.Object r10 = r8.h     // Catch: java.lang.Throwable -> L23
            java.util.Objects.toString(r10)     // Catch: java.lang.Throwable -> L23
            r10 = 4
            if (r1 > r10) goto L25
            java.lang.String r10 = "Glide"
            r9.logRootCauses(r10)     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r9 = move-exception
            goto L7b
        L25:
            r10 = 0
            r8.f536s = r10     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.request.j$a r10 = com.bumptech.glide.request.j.a.e     // Catch: java.lang.Throwable -> L23
            r8.f539v = r10     // Catch: java.lang.Throwable -> L23
            r10 = 1
            r8.B = r10     // Catch: java.lang.Throwable -> L23
            r1 = 0
            java.util.List<com.bumptech.glide.request.g<R>> r2 = r8.f532o     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L55
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L53
            r3 = 0
        L39:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L56
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L53
            com.bumptech.glide.request.g r4 = (com.bumptech.glide.request.g) r4     // Catch: java.lang.Throwable -> L53
            java.lang.Object r5 = r8.h     // Catch: java.lang.Throwable -> L53
            com.bumptech.glide.request.target.p<R> r6 = r8.f531n     // Catch: java.lang.Throwable -> L53
            boolean r7 = r8.q()     // Catch: java.lang.Throwable -> L53
            boolean r4 = r4.a(r9, r5, r6, r7)     // Catch: java.lang.Throwable -> L53
            r3 = r3 | r4
            goto L39
        L53:
            r9 = move-exception
            goto L78
        L55:
            r3 = 0
        L56:
            com.bumptech.glide.request.g<R> r2 = r8.d     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L69
            java.lang.Object r4 = r8.h     // Catch: java.lang.Throwable -> L53
            com.bumptech.glide.request.target.p<R> r5 = r8.f531n     // Catch: java.lang.Throwable -> L53
            boolean r6 = r8.q()     // Catch: java.lang.Throwable -> L53
            boolean r9 = r2.a(r9, r4, r5, r6)     // Catch: java.lang.Throwable -> L53
            if (r9 == 0) goto L69
            goto L6a
        L69:
            r10 = 0
        L6a:
            r9 = r3 | r10
            if (r9 != 0) goto L71
            r8.z()     // Catch: java.lang.Throwable -> L53
        L71:
            r8.B = r1     // Catch: java.lang.Throwable -> L23
            r8.u()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L78:
            r8.B = r1     // Catch: java.lang.Throwable -> L23
            throw r9     // Catch: java.lang.Throwable -> L23
        L7b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r9
    }

    @androidx.annotation.GuardedBy("requestLock")
    private void y(com.bumptech.glide.load.engine.u<R> r9, R r10, com.bumptech.glide.load.DataSource r11, boolean r12) {
            r8 = this;
            boolean r5 = r8.q()
            com.bumptech.glide.request.j$a r12 = com.bumptech.glide.request.j.a.d
            r8.f539v = r12
            r8.f535r = r9
            com.bumptech.glide.d r9 = r8.g
            int r9 = r9.h()
            r12 = 3
            if (r9 > r12) goto L23
            r10.getClass()
            java.util.Objects.toString(r11)
            java.lang.Object r9 = r8.h
            java.util.Objects.toString(r9)
            long r0 = r8.f537t
            com.bumptech.glide.util.g.a(r0)
        L23:
            r9 = 1
            r8.B = r9
            r12 = 0
            java.util.List<com.bumptech.glide.request.g<R>> r0 = r8.f532o     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L50
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> L4a
            r7 = 0
        L30:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> L4a
            com.bumptech.glide.request.g r0 = (com.bumptech.glide.request.g) r0     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r2 = r8.h     // Catch: java.lang.Throwable -> L4a
            com.bumptech.glide.request.target.p<R> r3 = r8.f531n     // Catch: java.lang.Throwable -> L4a
            r1 = r10
            r4 = r11
            boolean r10 = r0.c(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4a
            r7 = r7 | r10
            r10 = r1
            r11 = r4
            goto L30
        L4a:
            r0 = move-exception
            r9 = r0
            goto L76
        L4d:
            r1 = r10
            r4 = r11
            goto L52
        L50:
            r7 = 0
            goto L4d
        L52:
            com.bumptech.glide.request.g<R> r0 = r8.d     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L61
            java.lang.Object r2 = r8.h     // Catch: java.lang.Throwable -> L4a
            com.bumptech.glide.request.target.p<R> r3 = r8.f531n     // Catch: java.lang.Throwable -> L4a
            boolean r10 = r0.c(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4a
            if (r10 == 0) goto L61
            goto L62
        L61:
            r9 = 0
        L62:
            r9 = r9 | r7
            if (r9 != 0) goto L70
            com.bumptech.glide.request.transition.g<? super R> r9 = r8.f533p     // Catch: java.lang.Throwable -> L4a
            com.bumptech.glide.request.transition.f r9 = r9.a(r4, r5)     // Catch: java.lang.Throwable -> L4a
            com.bumptech.glide.request.target.p<R> r10 = r8.f531n     // Catch: java.lang.Throwable -> L4a
            r10.h(r1, r9)     // Catch: java.lang.Throwable -> L4a
        L70:
            r8.B = r12
            r8.v()
            return
        L76:
            r8.B = r12
            throw r9
    }

    @androidx.annotation.GuardedBy("requestLock")
    private void z() {
            r2 = this;
            boolean r0 = r2.k()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.Object r0 = r2.h
            if (r0 != 0) goto L10
            android.graphics.drawable.Drawable r0 = r2.o()
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 != 0) goto L17
            android.graphics.drawable.Drawable r0 = r2.n()
        L17:
            if (r0 != 0) goto L1d
            android.graphics.drawable.Drawable r0 = r2.p()
        L1d:
            com.bumptech.glide.request.target.p<R> r1 = r2.f531n
            r1.o(r0)
            return
    }

    @Override // com.bumptech.glide.request.e
    public boolean a() {
            r3 = this;
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            com.bumptech.glide.request.j$a r1 = r3.f539v     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.j$a r2 = com.bumptech.glide.request.j.a.d     // Catch: java.lang.Throwable -> Le
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // com.bumptech.glide.request.i
    public void b(com.bumptech.glide.load.engine.GlideException r2) {
            r1 = this;
            r0 = 5
            r1.x(r2, r0)
            return
    }

    @Override // com.bumptech.glide.request.i
    public void c(com.bumptech.glide.load.engine.u<?> r6, com.bumptech.glide.load.DataSource r7, boolean r8) {
            r5 = this;
            com.bumptech.glide.util.pool.c r0 = r5.b
            r0.c()
            r0 = 0
            java.lang.Object r1 = r5.c     // Catch: java.lang.Throwable -> Lb2
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lb2
            r5.f536s = r0     // Catch: java.lang.Throwable -> L2f
            if (r6 != 0) goto L32
            com.bumptech.glide.load.engine.GlideException r6 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r7.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = "Expected to receive a Resource<R> with an object of "
            r7.append(r8)     // Catch: java.lang.Throwable -> L2f
            java.lang.Class<R> r8 = r5.i     // Catch: java.lang.Throwable -> L2f
            r7.append(r8)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = " inside, but instead got null."
            r7.append(r8)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L2f
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L2f
            r5.b(r6)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r6 = move-exception
            goto Lb0
        L32:
            java.lang.Object r2 = r6.get()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L61
            java.lang.Class<R> r3 = r5.i     // Catch: java.lang.Throwable -> L2f
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Throwable -> L2f
            boolean r3 = r3.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L45
            goto L61
        L45:
            boolean r3 = r5.l()     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L5c
            r5.f535r = r0     // Catch: java.lang.Throwable -> L58
            com.bumptech.glide.request.j$a r7 = com.bumptech.glide.request.j.a.d     // Catch: java.lang.Throwable -> L58
            r5.f539v = r7     // Catch: java.lang.Throwable -> L58
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
        L52:
            com.bumptech.glide.load.engine.k r7 = r5.f538u
            r7.l(r6)
            return
        L58:
            r7 = move-exception
            r0 = r6
            r6 = r7
            goto Lb0
        L5c:
            r5.y(r6, r2, r7, r8)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            return
        L61:
            r5.f535r = r0     // Catch: java.lang.Throwable -> L58
            com.bumptech.glide.load.engine.GlideException r7 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> L58
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r8.<init>()     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = "Expected to receive an object of "
            r8.append(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.Class<R> r0 = r5.i     // Catch: java.lang.Throwable -> L58
            r8.append(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = " but instead got "
            r8.append(r0)     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L80
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L58
            goto L82
        L80:
            java.lang.String r0 = ""
        L82:
            r8.append(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = "{"
            r8.append(r0)     // Catch: java.lang.Throwable -> L58
            r8.append(r2)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = "} inside Resource{"
            r8.append(r0)     // Catch: java.lang.Throwable -> L58
            r8.append(r6)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = "}."
            r8.append(r0)     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L9f
            java.lang.String r0 = ""
            goto La1
        L9f:
            java.lang.String r0 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        La1:
            r8.append(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L58
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L58
            r5.b(r7)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            goto L52
        Lb0:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            throw r6     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r6 = move-exception
            if (r0 == 0) goto Lba
            com.bumptech.glide.load.engine.k r7 = r5.f538u
            r7.l(r0)
        Lba:
            throw r6
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
            r5 = this;
            java.lang.Object r0 = r5.c
            monitor-enter(r0)
            r5.i()     // Catch: java.lang.Throwable -> L13
            com.bumptech.glide.util.pool.c r1 = r5.b     // Catch: java.lang.Throwable -> L13
            r1.c()     // Catch: java.lang.Throwable -> L13
            com.bumptech.glide.request.j$a r1 = r5.f539v     // Catch: java.lang.Throwable -> L13
            com.bumptech.glide.request.j$a r2 = com.bumptech.glide.request.j.a.f     // Catch: java.lang.Throwable -> L13
            if (r1 != r2) goto L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r1 = move-exception
            goto L3b
        L15:
            r5.m()     // Catch: java.lang.Throwable -> L13
            com.bumptech.glide.load.engine.u<R> r1 = r5.f535r     // Catch: java.lang.Throwable -> L13
            r3 = 0
            if (r1 == 0) goto L20
            r5.f535r = r3     // Catch: java.lang.Throwable -> L13
            goto L21
        L20:
            r1 = r3
        L21:
            boolean r3 = r5.j()     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L30
            com.bumptech.glide.request.target.p<R> r3 = r5.f531n     // Catch: java.lang.Throwable -> L13
            android.graphics.drawable.Drawable r4 = r5.p()     // Catch: java.lang.Throwable -> L13
            r3.g(r4)     // Catch: java.lang.Throwable -> L13
        L30:
            r5.f539v = r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L3a
            com.bumptech.glide.load.engine.k r0 = r5.f538u
            r0.l(r1)
        L3a:
            return
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    @Override // com.bumptech.glide.request.target.o
    public void d(int r24, int r25) {
            r23 = this;
            r1 = r23
            com.bumptech.glide.util.pool.c r0 = r1.b
            r0.c()
            java.lang.Object r2 = r1.c
            monitor-enter(r2)
            boolean r0 = com.bumptech.glide.request.j.F     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L2e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r3.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = "Got onSizeReady in "
            r3.append(r4)     // Catch: java.lang.Throwable -> L29
            long r4 = r1.f537t     // Catch: java.lang.Throwable -> L29
            double r4 = com.bumptech.glide.util.g.a(r4)     // Catch: java.lang.Throwable -> L29
            r3.append(r4)     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L29
            r1.s(r3)     // Catch: java.lang.Throwable -> L29
            goto L2e
        L29:
            r0 = move-exception
            r3 = r1
            r1 = r2
            goto L11d
        L2e:
            com.bumptech.glide.request.j$a r3 = r1.f539v     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.request.j$a r4 = com.bumptech.glide.request.j.a.c     // Catch: java.lang.Throwable -> L29
            if (r3 == r4) goto L36
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L29
            return
        L36:
            com.bumptech.glide.request.j$a r3 = com.bumptech.glide.request.j.a.b     // Catch: java.lang.Throwable -> L29
            r1.f539v = r3     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.request.a<?> r4 = r1.j     // Catch: java.lang.Throwable -> L29
            float r4 = r4.U()     // Catch: java.lang.Throwable -> L29
            r5 = r24
            int r5 = t(r5, r4)     // Catch: java.lang.Throwable -> L29
            r1.f543z = r5     // Catch: java.lang.Throwable -> L29
            r5 = r25
            int r4 = t(r5, r4)     // Catch: java.lang.Throwable -> L29
            r1.A = r4     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L6c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r4.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r5 = "finished setup for calling load in "
            r4.append(r5)     // Catch: java.lang.Throwable -> L29
            long r5 = r1.f537t     // Catch: java.lang.Throwable -> L29
            double r5 = com.bumptech.glide.util.g.a(r5)     // Catch: java.lang.Throwable -> L29
            r4.append(r5)     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L29
            r1.s(r4)     // Catch: java.lang.Throwable -> L29
        L6c:
            r4 = r2
            com.bumptech.glide.load.engine.k r2 = r1.f538u     // Catch: java.lang.Throwable -> L11a
            r5 = r3
            com.bumptech.glide.d r3 = r1.g     // Catch: java.lang.Throwable -> L11a
            r6 = r4
            java.lang.Object r4 = r1.h     // Catch: java.lang.Throwable -> L116
            com.bumptech.glide.request.a<?> r7 = r1.j     // Catch: java.lang.Throwable -> L116
            com.bumptech.glide.load.c r7 = r7.T()     // Catch: java.lang.Throwable -> L116
            r8 = r6
            int r6 = r1.f543z     // Catch: java.lang.Throwable -> L112
            r9 = r5
            r5 = r7
            int r7 = r1.A     // Catch: java.lang.Throwable -> L112
            com.bumptech.glide.request.a<?> r10 = r1.j     // Catch: java.lang.Throwable -> L112
            java.lang.Class r10 = r10.S()     // Catch: java.lang.Throwable -> L112
            r11 = r9
            java.lang.Class<R> r9 = r1.i     // Catch: java.lang.Throwable -> L112
            r12 = r8
            r8 = r10
            com.bumptech.glide.Priority r10 = r1.f530m     // Catch: java.lang.Throwable -> L10e
            com.bumptech.glide.request.a<?> r13 = r1.j     // Catch: java.lang.Throwable -> L10e
            com.bumptech.glide.load.engine.j r13 = r13.G()     // Catch: java.lang.Throwable -> L10e
            com.bumptech.glide.request.a<?> r14 = r1.j     // Catch: java.lang.Throwable -> L10e
            java.util.Map r14 = r14.W()     // Catch: java.lang.Throwable -> L10e
            com.bumptech.glide.request.a<?> r15 = r1.j     // Catch: java.lang.Throwable -> L10e
            boolean r15 = r15.j0()     // Catch: java.lang.Throwable -> L10e
            r22 = r0
            com.bumptech.glide.request.a<?> r0 = r1.j     // Catch: java.lang.Throwable -> L10e
            boolean r0 = r0.e0()     // Catch: java.lang.Throwable -> L10e
            r24 = r0
            com.bumptech.glide.request.a<?> r0 = r1.j     // Catch: java.lang.Throwable -> L10e
            com.bumptech.glide.load.f r0 = r0.M()     // Catch: java.lang.Throwable -> L10e
            r25 = r0
            com.bumptech.glide.request.a<?> r0 = r1.j     // Catch: java.lang.Throwable -> L10e
            boolean r16 = r0.c0()     // Catch: java.lang.Throwable -> L10e
            com.bumptech.glide.request.a<?> r0 = r1.j     // Catch: java.lang.Throwable -> L10e
            boolean r17 = r0.Y()     // Catch: java.lang.Throwable -> L10e
            com.bumptech.glide.request.a<?> r0 = r1.j     // Catch: java.lang.Throwable -> L10e
            boolean r18 = r0.X()     // Catch: java.lang.Throwable -> L10e
            com.bumptech.glide.request.a<?> r0 = r1.j     // Catch: java.lang.Throwable -> L10e
            boolean r19 = r0.L()     // Catch: java.lang.Throwable -> L10e
            java.util.concurrent.Executor r0 = r1.f534q     // Catch: java.lang.Throwable -> L10e
            r21 = r0
            r20 = r1
            r0 = r11
            r1 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r24
            r15 = r25
            com.bumptech.glide.load.engine.k$d r2 = r2.g(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L10a
            r3 = r20
            r3.f536s = r2     // Catch: java.lang.Throwable -> Lea
            com.bumptech.glide.request.j$a r2 = r3.f539v     // Catch: java.lang.Throwable -> Lea
            if (r2 == r0) goto Lec
            r0 = 0
            r3.f536s = r0     // Catch: java.lang.Throwable -> Lea
            goto Lec
        Lea:
            r0 = move-exception
            goto L11d
        Lec:
            if (r22 == 0) goto L108
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lea
            r0.<init>()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r2 = "finished onSizeReady in "
            r0.append(r2)     // Catch: java.lang.Throwable -> Lea
            long r4 = r3.f537t     // Catch: java.lang.Throwable -> Lea
            double r4 = com.bumptech.glide.util.g.a(r4)     // Catch: java.lang.Throwable -> Lea
            r0.append(r4)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lea
            r3.s(r0)     // Catch: java.lang.Throwable -> Lea
        L108:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lea
            return
        L10a:
            r0 = move-exception
            r3 = r20
            goto L11d
        L10e:
            r0 = move-exception
            r3 = r1
            r1 = r12
            goto L11d
        L112:
            r0 = move-exception
            r3 = r1
            r1 = r8
            goto L11d
        L116:
            r0 = move-exception
            r3 = r1
            r1 = r6
            goto L11d
        L11a:
            r0 = move-exception
            r3 = r1
            r1 = r4
        L11d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lea
            throw r0
    }

    @Override // com.bumptech.glide.request.e
    public boolean e() {
            r3 = this;
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            com.bumptech.glide.request.j$a r1 = r3.f539v     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.j$a r2 = com.bumptech.glide.request.j.a.f     // Catch: java.lang.Throwable -> Le
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // com.bumptech.glide.request.e
    public boolean f(com.bumptech.glide.request.e r18) {
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r0 instanceof com.bumptech.glide.request.j
            r3 = 0
            if (r2 != 0) goto La
            return r3
        La:
            java.lang.Object r2 = r1.c
            monitor-enter(r2)
            int r4 = r1.k     // Catch: java.lang.Throwable -> L22
            int r5 = r1.f529l     // Catch: java.lang.Throwable -> L22
            java.lang.Object r6 = r1.h     // Catch: java.lang.Throwable -> L22
            java.lang.Class<R> r7 = r1.i     // Catch: java.lang.Throwable -> L22
            com.bumptech.glide.request.a<?> r8 = r1.j     // Catch: java.lang.Throwable -> L22
            com.bumptech.glide.Priority r9 = r1.f530m     // Catch: java.lang.Throwable -> L22
            java.util.List<com.bumptech.glide.request.g<R>> r10 = r1.f532o     // Catch: java.lang.Throwable -> L22
            if (r10 == 0) goto L24
            int r10 = r10.size()     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            r0 = move-exception
            goto L65
        L24:
            r10 = 0
        L25:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            com.bumptech.glide.request.j r0 = (com.bumptech.glide.request.j) r0
            java.lang.Object r11 = r0.c
            monitor-enter(r11)
            int r2 = r0.k     // Catch: java.lang.Throwable -> L42
            int r12 = r0.f529l     // Catch: java.lang.Throwable -> L42
            java.lang.Object r13 = r0.h     // Catch: java.lang.Throwable -> L42
            java.lang.Class<R> r14 = r0.i     // Catch: java.lang.Throwable -> L42
            com.bumptech.glide.request.a<?> r15 = r0.j     // Catch: java.lang.Throwable -> L42
            r16 = 0
            com.bumptech.glide.Priority r3 = r0.f530m     // Catch: java.lang.Throwable -> L42
            java.util.List<com.bumptech.glide.request.g<R>> r0 = r0.f532o     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L44
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L42
            goto L45
        L42:
            r0 = move-exception
            goto L63
        L44:
            r0 = 0
        L45:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L42
            if (r4 != r2) goto L62
            if (r5 != r12) goto L62
            boolean r2 = com.bumptech.glide.util.l.c(r6, r13)
            if (r2 == 0) goto L62
            boolean r2 = r7.equals(r14)
            if (r2 == 0) goto L62
            boolean r2 = r8.equals(r15)
            if (r2 == 0) goto L62
            if (r9 != r3) goto L62
            if (r10 != r0) goto L62
            r0 = 1
            return r0
        L62:
            return r16
        L63:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L42
            throw r0
        L65:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            throw r0
    }

    @Override // com.bumptech.glide.request.i
    public java.lang.Object g() {
            r1 = this;
            com.bumptech.glide.util.pool.c r0 = r1.b
            r0.c()
            java.lang.Object r0 = r1.c
            return r0
    }

    @Override // com.bumptech.glide.request.e
    public void h() {
            r5 = this;
            java.lang.Object r0 = r5.c
            monitor-enter(r0)
            r5.i()     // Catch: java.lang.Throwable -> L28
            com.bumptech.glide.util.pool.c r1 = r5.b     // Catch: java.lang.Throwable -> L28
            r1.c()     // Catch: java.lang.Throwable -> L28
            long r1 = com.bumptech.glide.util.g.b()     // Catch: java.lang.Throwable -> L28
            r5.f537t = r1     // Catch: java.lang.Throwable -> L28
            java.lang.Object r1 = r5.h     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L40
            int r1 = r5.k     // Catch: java.lang.Throwable -> L28
            int r2 = r5.f529l     // Catch: java.lang.Throwable -> L28
            boolean r1 = com.bumptech.glide.util.l.w(r1, r2)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L2b
            int r1 = r5.k     // Catch: java.lang.Throwable -> L28
            r5.f543z = r1     // Catch: java.lang.Throwable -> L28
            int r1 = r5.f529l     // Catch: java.lang.Throwable -> L28
            r5.A = r1     // Catch: java.lang.Throwable -> L28
            goto L2b
        L28:
            r1 = move-exception
            goto Lac
        L2b:
            android.graphics.drawable.Drawable r1 = r5.o()     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L33
            r1 = 5
            goto L34
        L33:
            r1 = 3
        L34:
            com.bumptech.glide.load.engine.GlideException r2 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L28
            r5.x(r2, r1)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L40:
            com.bumptech.glide.request.j$a r1 = r5.f539v     // Catch: java.lang.Throwable -> L28
            com.bumptech.glide.request.j$a r2 = com.bumptech.glide.request.j.a.b     // Catch: java.lang.Throwable -> L28
            if (r1 == r2) goto La4
            com.bumptech.glide.request.j$a r3 = com.bumptech.glide.request.j.a.d     // Catch: java.lang.Throwable -> L28
            if (r1 != r3) goto L54
            com.bumptech.glide.load.engine.u<R> r1 = r5.f535r     // Catch: java.lang.Throwable -> L28
            com.bumptech.glide.load.DataSource r2 = com.bumptech.glide.load.DataSource.MEMORY_CACHE     // Catch: java.lang.Throwable -> L28
            r3 = 0
            r5.c(r1, r2, r3)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L54:
            com.bumptech.glide.request.j$a r1 = com.bumptech.glide.request.j.a.c     // Catch: java.lang.Throwable -> L28
            r5.f539v = r1     // Catch: java.lang.Throwable -> L28
            int r3 = r5.k     // Catch: java.lang.Throwable -> L28
            int r4 = r5.f529l     // Catch: java.lang.Throwable -> L28
            boolean r3 = com.bumptech.glide.util.l.w(r3, r4)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L6a
            int r3 = r5.k     // Catch: java.lang.Throwable -> L28
            int r4 = r5.f529l     // Catch: java.lang.Throwable -> L28
            r5.d(r3, r4)     // Catch: java.lang.Throwable -> L28
            goto L6f
        L6a:
            com.bumptech.glide.request.target.p<R> r3 = r5.f531n     // Catch: java.lang.Throwable -> L28
            r3.q(r5)     // Catch: java.lang.Throwable -> L28
        L6f:
            com.bumptech.glide.request.j$a r3 = r5.f539v     // Catch: java.lang.Throwable -> L28
            if (r3 == r2) goto L75
            if (r3 != r1) goto L84
        L75:
            boolean r1 = r5.k()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L84
            com.bumptech.glide.request.target.p<R> r1 = r5.f531n     // Catch: java.lang.Throwable -> L28
            android.graphics.drawable.Drawable r2 = r5.p()     // Catch: java.lang.Throwable -> L28
            r1.j(r2)     // Catch: java.lang.Throwable -> L28
        L84:
            boolean r1 = com.bumptech.glide.request.j.F     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto La2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch: java.lang.Throwable -> L28
            long r2 = r5.f537t     // Catch: java.lang.Throwable -> L28
            double r2 = com.bumptech.glide.util.g.a(r2)     // Catch: java.lang.Throwable -> L28
            r1.append(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L28
            r5.s(r1)     // Catch: java.lang.Throwable -> L28
        La2:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        La4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L28
            throw r1     // Catch: java.lang.Throwable -> L28
        Lac:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r1
    }

    @Override // com.bumptech.glide.request.e
    public boolean isComplete() {
            r3 = this;
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            com.bumptech.glide.request.j$a r1 = r3.f539v     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.j$a r2 = com.bumptech.glide.request.j.a.d     // Catch: java.lang.Throwable -> Le
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
            r3 = this;
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            com.bumptech.glide.request.j$a r1 = r3.f539v     // Catch: java.lang.Throwable -> L10
            com.bumptech.glide.request.j$a r2 = com.bumptech.glide.request.j.a.b     // Catch: java.lang.Throwable -> L10
            if (r1 == r2) goto L12
            com.bumptech.glide.request.j$a r2 = com.bumptech.glide.request.j.a.c     // Catch: java.lang.Throwable -> L10
            if (r1 != r2) goto Le
            goto L12
        Le:
            r1 = 0
            goto L13
        L10:
            r1 = move-exception
            goto L15
        L12:
            r1 = 1
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    @Override // com.bumptech.glide.request.e
    public void pause() {
            r2 = this;
            java.lang.Object r0 = r2.c
            monitor-enter(r0)
            boolean r1 = r2.isRunning()     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Lf
            r2.clear()     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r1 = move-exception
            goto L11
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }
}
