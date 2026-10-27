package com.bumptech.glide;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class i implements android.content.ComponentCallbacks2, com.bumptech.glide.manager.m, com.bumptech.glide.g<com.bumptech.glide.h<android.graphics.drawable.Drawable>> {

    /* renamed from: l, reason: collision with root package name */
    private static final com.bumptech.glide.request.h f390l = null;

    /* renamed from: m, reason: collision with root package name */
    private static final com.bumptech.glide.request.h f391m = null;

    /* renamed from: n, reason: collision with root package name */
    private static final com.bumptech.glide.request.h f392n = null;
    protected final com.bumptech.glide.b a;
    protected final android.content.Context b;
    final com.bumptech.glide.manager.l c;

    @androidx.annotation.GuardedBy("this")
    private final com.bumptech.glide.manager.s d;

    @androidx.annotation.GuardedBy("this")
    private final com.bumptech.glide.manager.r e;

    @androidx.annotation.GuardedBy("this")
    private final com.bumptech.glide.manager.t f;
    private final java.lang.Runnable g;
    private final com.bumptech.glide.manager.c h;
    private final java.util.concurrent.CopyOnWriteArrayList<com.bumptech.glide.request.g<java.lang.Object>> i;

    @androidx.annotation.GuardedBy("this")
    private com.bumptech.glide.request.h j;
    private boolean k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ com.bumptech.glide.i a;

        a(com.bumptech.glide.i r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.bumptech.glide.i r0 = r2.a
                com.bumptech.glide.manager.l r1 = r0.c
                r1.b(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b extends com.bumptech.glide.request.target.f<android.view.View, java.lang.Object> {
        b(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.bumptech.glide.request.target.p
        public void h(@androidx.annotation.NonNull java.lang.Object r1, @androidx.annotation.Nullable com.bumptech.glide.request.transition.f<? super java.lang.Object> r2) {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.request.target.f
        protected void k(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.request.target.p
        public void o(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements com.bumptech.glide.manager.c.a {

        @androidx.annotation.GuardedBy("RequestManager.this")
        private final com.bumptech.glide.manager.s a;
        final /* synthetic */ com.bumptech.glide.i b;

        c(@androidx.annotation.NonNull com.bumptech.glide.i r1, com.bumptech.glide.manager.s r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        @Override // com.bumptech.glide.manager.c.a
        public void a(boolean r2) {
                r1 = this;
                if (r2 == 0) goto Lf
                com.bumptech.glide.i r2 = r1.b
                monitor-enter(r2)
                com.bumptech.glide.manager.s r0 = r1.a     // Catch: java.lang.Throwable -> Lc
                r0.g()     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
                throw r0
            Lf:
                return
        }
    }

    static {
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            com.bumptech.glide.request.h r0 = com.bumptech.glide.request.h.Y0(r0)
            com.bumptech.glide.request.a r0 = r0.m0()
            com.bumptech.glide.request.h r0 = (com.bumptech.glide.request.h) r0
            com.bumptech.glide.i.f390l = r0
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r0 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            com.bumptech.glide.request.h r0 = com.bumptech.glide.request.h.Y0(r0)
            com.bumptech.glide.request.a r0 = r0.m0()
            com.bumptech.glide.request.h r0 = (com.bumptech.glide.request.h) r0
            com.bumptech.glide.i.f391m = r0
            com.bumptech.glide.load.engine.j r0 = com.bumptech.glide.load.engine.j.c
            com.bumptech.glide.request.h r0 = com.bumptech.glide.request.h.Z0(r0)
            com.bumptech.glide.Priority r1 = com.bumptech.glide.Priority.LOW
            com.bumptech.glide.request.a r0 = r0.A0(r1)
            com.bumptech.glide.request.h r0 = (com.bumptech.glide.request.h) r0
            r1 = 1
            com.bumptech.glide.request.a r0 = r0.I0(r1)
            com.bumptech.glide.request.h r0 = (com.bumptech.glide.request.h) r0
            com.bumptech.glide.i.f392n = r0
            return
    }

    public i(@androidx.annotation.NonNull com.bumptech.glide.b r8, @androidx.annotation.NonNull com.bumptech.glide.manager.l r9, @androidx.annotation.NonNull com.bumptech.glide.manager.r r10, @androidx.annotation.NonNull android.content.Context r11) {
            r7 = this;
            com.bumptech.glide.manager.s r4 = new com.bumptech.glide.manager.s
            r4.<init>()
            com.bumptech.glide.manager.d r5 = r8.i()
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    i(com.bumptech.glide.b r2, com.bumptech.glide.manager.l r3, com.bumptech.glide.manager.r r4, com.bumptech.glide.manager.s r5, com.bumptech.glide.manager.d r6, android.content.Context r7) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.manager.t r0 = new com.bumptech.glide.manager.t
            r0.<init>()
            r1.f = r0
            com.bumptech.glide.i$a r0 = new com.bumptech.glide.i$a
            r0.<init>(r1)
            r1.g = r0
            r1.a = r2
            r1.c = r3
            r1.e = r4
            r1.d = r5
            r1.b = r7
            android.content.Context r4 = r7.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            com.bumptech.glide.i$c r7 = new com.bumptech.glide.i$c
            r7.<init>(r1, r5)
            com.bumptech.glide.manager.c r4 = r6.a(r4, r7)
            r1.h = r4
            boolean r5 = com.bumptech.glide.util.l.t()
            if (r5 == 0) goto L38
            com.bumptech.glide.util.l.x(r0)
            goto L3b
        L38:
            r3.b(r1)
        L3b:
            r3.b(r4)
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            com.bumptech.glide.d r4 = r2.j()
            java.util.List r4 = r4.c()
            r3.<init>(r4)
            r1.i = r3
            com.bumptech.glide.d r3 = r2.j()
            com.bumptech.glide.request.h r3 = r3.d()
            r1.X(r3)
            r2.u(r1)
            return
    }

    private void a0(@androidx.annotation.NonNull com.bumptech.glide.request.target.p<?> r3) {
            r2 = this;
            boolean r0 = r2.Z(r3)
            com.bumptech.glide.request.e r1 = r3.d()
            if (r0 != 0) goto L1b
            com.bumptech.glide.b r0 = r2.a
            boolean r0 = r0.v(r3)
            if (r0 != 0) goto L1b
            if (r1 == 0) goto L1b
            r0 = 0
            r3.n(r0)
            r1.clear()
        L1b:
            return
    }

    private synchronized void b0(@androidx.annotation.NonNull com.bumptech.glide.request.h r2) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.request.h r0 = r1.j     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.request.a r2 = r0.b(r2)     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.request.h r2 = (com.bumptech.glide.request.h) r2     // Catch: java.lang.Throwable -> Ld
            r1.j = r2     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<java.io.File> A(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            com.bumptech.glide.h r0 = r1.B()
            com.bumptech.glide.h r2 = r0.u1(r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<java.io.File> B() {
            r2 = this;
            java.lang.Class<java.io.File> r0 = java.io.File.class
            com.bumptech.glide.h r0 = r2.t(r0)
            com.bumptech.glide.request.h r1 = com.bumptech.glide.i.f392n
            com.bumptech.glide.h r0 = r0.V0(r1)
            return r0
    }

    java.util.List<com.bumptech.glide.request.g<java.lang.Object>> C() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.bumptech.glide.request.g<java.lang.Object>> r0 = r1.i
            return r0
    }

    synchronized com.bumptech.glide.request.h D() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.request.h r0 = r1.j     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @androidx.annotation.NonNull
    <T> com.bumptech.glide.j<?, T> E(java.lang.Class<T> r2) {
            r1 = this;
            com.bumptech.glide.b r0 = r1.a
            com.bumptech.glide.d r0 = r0.j()
            com.bumptech.glide.j r2 = r0.e(r2)
            return r2
    }

    public synchronized boolean F() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.manager.s r0 = r1.d     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.d()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<android.graphics.drawable.Drawable> G(@androidx.annotation.Nullable android.graphics.Bitmap r2) {
            r1 = this;
            com.bumptech.glide.h r0 = r1.v()
            com.bumptech.glide.h r2 = r0.p1(r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<android.graphics.drawable.Drawable> H(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.bumptech.glide.h r0 = r1.v()
            com.bumptech.glide.h r2 = r0.q1(r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<android.graphics.drawable.Drawable> I(@androidx.annotation.Nullable android.net.Uri r2) {
            r1 = this;
            com.bumptech.glide.h r0 = r1.v()
            com.bumptech.glide.h r2 = r0.r1(r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<android.graphics.drawable.Drawable> J(@androidx.annotation.Nullable java.io.File r2) {
            r1 = this;
            com.bumptech.glide.h r0 = r1.v()
            com.bumptech.glide.h r2 = r0.s1(r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<android.graphics.drawable.Drawable> K(@androidx.annotation.Nullable @androidx.annotation.DrawableRes @androidx.annotation.RawRes java.lang.Integer r2) {
            r1 = this;
            com.bumptech.glide.h r0 = r1.v()
            com.bumptech.glide.h r2 = r0.t1(r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<android.graphics.drawable.Drawable> L(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            com.bumptech.glide.h r0 = r1.v()
            com.bumptech.glide.h r2 = r0.u1(r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<android.graphics.drawable.Drawable> M(@androidx.annotation.Nullable java.lang.String r2) {
            r1 = this;
            com.bumptech.glide.h r0 = r1.v()
            com.bumptech.glide.h r2 = r0.v1(r2)
            return r2
    }

    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public com.bumptech.glide.h<android.graphics.drawable.Drawable> N(@androidx.annotation.Nullable java.net.URL r2) {
            r1 = this;
            com.bumptech.glide.h r0 = r1.v()
            com.bumptech.glide.h r2 = r0.w1(r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<android.graphics.drawable.Drawable> O(@androidx.annotation.Nullable byte[] r2) {
            r1 = this;
            com.bumptech.glide.h r0 = r1.v()
            com.bumptech.glide.h r2 = r0.x1(r2)
            return r2
    }

    public synchronized void P() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.manager.s r0 = r1.d     // Catch: java.lang.Throwable -> L8
            r0.e()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    public synchronized void Q() {
            r2 = this;
            monitor-enter(r2)
            r2.P()     // Catch: java.lang.Throwable -> L1e
            com.bumptech.glide.manager.r r0 = r2.e     // Catch: java.lang.Throwable -> L1e
            java.util.Set r0 = r0.a()     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1e
        Le:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1e
            com.bumptech.glide.i r1 = (com.bumptech.glide.i) r1     // Catch: java.lang.Throwable -> L1e
            r1.P()     // Catch: java.lang.Throwable -> L1e
            goto Le
        L1e:
            r0 = move-exception
            goto L22
        L20:
            monitor-exit(r2)
            return
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }

    public synchronized void R() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.manager.s r0 = r1.d     // Catch: java.lang.Throwable -> L8
            r0.f()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    public synchronized void S() {
            r2 = this;
            monitor-enter(r2)
            r2.R()     // Catch: java.lang.Throwable -> L1e
            com.bumptech.glide.manager.r r0 = r2.e     // Catch: java.lang.Throwable -> L1e
            java.util.Set r0 = r0.a()     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1e
        Le:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1e
            com.bumptech.glide.i r1 = (com.bumptech.glide.i) r1     // Catch: java.lang.Throwable -> L1e
            r1.R()     // Catch: java.lang.Throwable -> L1e
            goto Le
        L1e:
            r0 = move-exception
            goto L22
        L20:
            monitor-exit(r2)
            return
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }

    public synchronized void T() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.manager.s r0 = r1.d     // Catch: java.lang.Throwable -> L8
            r0.h()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    public synchronized void U() {
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.util.l.b()     // Catch: java.lang.Throwable -> L21
            r2.T()     // Catch: java.lang.Throwable -> L21
            com.bumptech.glide.manager.r r0 = r2.e     // Catch: java.lang.Throwable -> L21
            java.util.Set r0 = r0.a()     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L21
        L11:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L21
            com.bumptech.glide.i r1 = (com.bumptech.glide.i) r1     // Catch: java.lang.Throwable -> L21
            r1.T()     // Catch: java.lang.Throwable -> L21
            goto L11
        L21:
            r0 = move-exception
            goto L25
        L23:
            monitor-exit(r2)
            return
        L25:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r0
    }

    @androidx.annotation.NonNull
    public synchronized com.bumptech.glide.i V(@androidx.annotation.NonNull com.bumptech.glide.request.h r1) {
            r0 = this;
            monitor-enter(r0)
            r0.X(r1)     // Catch: java.lang.Throwable -> L6
            monitor-exit(r0)
            return r0
        L6:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            throw r1
    }

    public void W(boolean r1) {
            r0 = this;
            r0.k = r1
            return
    }

    protected synchronized void X(@androidx.annotation.NonNull com.bumptech.glide.request.h r1) {
            r0 = this;
            monitor-enter(r0)
            com.bumptech.glide.request.a r1 = r1.q()     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.request.h r1 = (com.bumptech.glide.request.h) r1     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.request.a r1 = r1.g()     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.request.h r1 = (com.bumptech.glide.request.h) r1     // Catch: java.lang.Throwable -> L11
            r0.j = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    synchronized void Y(@androidx.annotation.NonNull com.bumptech.glide.request.target.p<?> r2, @androidx.annotation.NonNull com.bumptech.glide.request.e r3) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.manager.t r0 = r1.f     // Catch: java.lang.Throwable -> Ld
            r0.e(r2)     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.manager.s r2 = r1.d     // Catch: java.lang.Throwable -> Ld
            r2.i(r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    synchronized boolean Z(@androidx.annotation.NonNull com.bumptech.glide.request.target.p<?> r4) {
            r3 = this;
            monitor-enter(r3)
            com.bumptech.glide.request.e r0 = r4.d()     // Catch: java.lang.Throwable -> L1d
            r1 = 1
            if (r0 != 0) goto La
            monitor-exit(r3)
            return r1
        La:
            com.bumptech.glide.manager.s r2 = r3.d     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r2.b(r0)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1f
            com.bumptech.glide.manager.t r0 = r3.f     // Catch: java.lang.Throwable -> L1d
            r0.f(r4)     // Catch: java.lang.Throwable -> L1d
            r0 = 0
            r4.n(r0)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r1
        L1d:
            r4 = move-exception
            goto L22
        L1f:
            monitor-exit(r3)
            r4 = 0
            return r4
        L22:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.h<android.graphics.drawable.Drawable> a(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.M(r1)
            return r1
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.bumptech.glide.h<android.graphics.drawable.Drawable> c(@androidx.annotation.Nullable java.net.URL r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.N(r1)
            return r1
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.h<android.graphics.drawable.Drawable> e(@androidx.annotation.Nullable java.io.File r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.J(r1)
            return r1
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.h<android.graphics.drawable.Drawable> f(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.H(r1)
            return r1
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.h<android.graphics.drawable.Drawable> i(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.L(r1)
            return r1
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.h<android.graphics.drawable.Drawable> k(@androidx.annotation.Nullable android.net.Uri r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.I(r1)
            return r1
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.h<android.graphics.drawable.Drawable> l(@androidx.annotation.Nullable byte[] r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.O(r1)
            return r1
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.h<android.graphics.drawable.Drawable> m(@androidx.annotation.Nullable android.graphics.Bitmap r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.G(r1)
            return r1
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.manager.m
    public synchronized void onDestroy() {
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.manager.t r0 = r2.f     // Catch: java.lang.Throwable -> L20
            r0.onDestroy()     // Catch: java.lang.Throwable -> L20
            com.bumptech.glide.manager.t r0 = r2.f     // Catch: java.lang.Throwable -> L20
            java.util.List r0 = r0.c()     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L20
        L10:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L20
            com.bumptech.glide.request.target.p r1 = (com.bumptech.glide.request.target.p) r1     // Catch: java.lang.Throwable -> L20
            r2.z(r1)     // Catch: java.lang.Throwable -> L20
            goto L10
        L20:
            r0 = move-exception
            goto L44
        L22:
            com.bumptech.glide.manager.t r0 = r2.f     // Catch: java.lang.Throwable -> L20
            r0.a()     // Catch: java.lang.Throwable -> L20
            com.bumptech.glide.manager.s r0 = r2.d     // Catch: java.lang.Throwable -> L20
            r0.c()     // Catch: java.lang.Throwable -> L20
            com.bumptech.glide.manager.l r0 = r2.c     // Catch: java.lang.Throwable -> L20
            r0.a(r2)     // Catch: java.lang.Throwable -> L20
            com.bumptech.glide.manager.l r0 = r2.c     // Catch: java.lang.Throwable -> L20
            com.bumptech.glide.manager.c r1 = r2.h     // Catch: java.lang.Throwable -> L20
            r0.a(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r0 = r2.g     // Catch: java.lang.Throwable -> L20
            com.bumptech.glide.util.l.y(r0)     // Catch: java.lang.Throwable -> L20
            com.bumptech.glide.b r0 = r2.a     // Catch: java.lang.Throwable -> L20
            r0.A(r2)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)
            return
        L44:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.manager.m
    public synchronized void onStart() {
            r1 = this;
            monitor-enter(r1)
            r1.T()     // Catch: java.lang.Throwable -> Lb
            com.bumptech.glide.manager.t r0 = r1.f     // Catch: java.lang.Throwable -> Lb
            r0.onStart()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    @Override // com.bumptech.glide.manager.m
    public synchronized void onStop() {
            r1 = this;
            monitor-enter(r1)
            r1.R()     // Catch: java.lang.Throwable -> Lb
            com.bumptech.glide.manager.t r0 = r1.f     // Catch: java.lang.Throwable -> Lb
            r0.onStop()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int r2) {
            r1 = this;
            r0 = 60
            if (r2 != r0) goto Lb
            boolean r2 = r1.k
            if (r2 == 0) goto Lb
            r1.Q()
        Lb:
            return
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.h<android.graphics.drawable.Drawable> p(@androidx.annotation.Nullable @androidx.annotation.DrawableRes @androidx.annotation.RawRes java.lang.Integer r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.K(r1)
            return r1
    }

    public com.bumptech.glide.i r(com.bumptech.glide.request.g<java.lang.Object> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.bumptech.glide.request.g<java.lang.Object>> r0 = r1.i
            r0.add(r2)
            return r1
    }

    @androidx.annotation.NonNull
    public synchronized com.bumptech.glide.i s(@androidx.annotation.NonNull com.bumptech.glide.request.h r1) {
            r0 = this;
            monitor-enter(r0)
            r0.b0(r1)     // Catch: java.lang.Throwable -> L6
            monitor-exit(r0)
            return r0
        L6:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            throw r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public <ResourceType> com.bumptech.glide.h<ResourceType> t(@androidx.annotation.NonNull java.lang.Class<ResourceType> r4) {
            r3 = this;
            com.bumptech.glide.h r0 = new com.bumptech.glide.h
            com.bumptech.glide.b r1 = r3.a
            android.content.Context r2 = r3.b
            r0.<init>(r1, r3, r4, r2)
            return r0
    }

    public synchronized java.lang.String toString() {
            r2 = this;
            monitor-enter(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r0.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = super.toString()     // Catch: java.lang.Throwable -> L2c
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "{tracker="
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            com.bumptech.glide.manager.s r1 = r2.d     // Catch: java.lang.Throwable -> L2c
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = ", treeNode="
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            com.bumptech.glide.manager.r r1 = r2.e     // Catch: java.lang.Throwable -> L2c
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "}"
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)
            return r0
        L2c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            throw r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<android.graphics.Bitmap> u() {
            r2 = this;
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            com.bumptech.glide.h r0 = r2.t(r0)
            com.bumptech.glide.request.h r1 = com.bumptech.glide.i.f390l
            com.bumptech.glide.h r0 = r0.V0(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<android.graphics.drawable.Drawable> v() {
            r1 = this;
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            com.bumptech.glide.h r0 = r1.t(r0)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<java.io.File> w() {
            r2 = this;
            java.lang.Class<java.io.File> r0 = java.io.File.class
            com.bumptech.glide.h r0 = r2.t(r0)
            r1 = 1
            com.bumptech.glide.request.h r1 = com.bumptech.glide.request.h.s1(r1)
            com.bumptech.glide.h r0 = r0.V0(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<com.bumptech.glide.load.resource.gif.GifDrawable> x() {
            r2 = this;
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r0 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            com.bumptech.glide.h r0 = r2.t(r0)
            com.bumptech.glide.request.h r1 = com.bumptech.glide.i.f391m
            com.bumptech.glide.h r0 = r0.V0(r1)
            return r0
    }

    public void y(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            com.bumptech.glide.i$b r0 = new com.bumptech.glide.i$b
            r0.<init>(r2)
            r1.z(r0)
            return
    }

    public void z(@androidx.annotation.Nullable com.bumptech.glide.request.target.p<?> r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            r0.a0(r1)
            return
    }
}
