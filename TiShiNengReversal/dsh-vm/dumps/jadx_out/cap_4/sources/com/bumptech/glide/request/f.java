package com.bumptech.glide.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f<R> implements com.bumptech.glide.request.d<R>, com.bumptech.glide.request.g<R> {
    private static final com.bumptech.glide.request.f.a k = null;
    private final int a;
    private final int b;
    private final boolean c;
    private final com.bumptech.glide.request.f.a d;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("this")
    private R e;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("this")
    private com.bumptech.glide.request.e f;

    @androidx.annotation.GuardedBy("this")
    private boolean g;

    @androidx.annotation.GuardedBy("this")
    private boolean h;

    @androidx.annotation.GuardedBy("this")
    private boolean i;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("this")
    private com.bumptech.glide.load.engine.GlideException j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    static class a {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        void a(java.lang.Object r1) {
                r0 = this;
                r1.notifyAll()
                return
        }

        void b(java.lang.Object r1, long r2) throws java.lang.InterruptedException {
                r0 = this;
                r1.wait(r2)
                return
        }
    }

    static {
            com.bumptech.glide.request.f$a r0 = new com.bumptech.glide.request.f$a
            r0.<init>()
            com.bumptech.glide.request.f.k = r0
            return
    }

    public f(int r3, int r4) {
            r2 = this;
            r0 = 1
            com.bumptech.glide.request.f$a r1 = com.bumptech.glide.request.f.k
            r2.<init>(r3, r4, r0, r1)
            return
    }

    f(int r1, int r2, boolean r3, com.bumptech.glide.request.f.a r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    private synchronized R e(java.lang.Long r6) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.c     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L12
            boolean r0 = r5.isDone()     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L12
            com.bumptech.glide.util.l.a()     // Catch: java.lang.Throwable -> Lf
            goto L12
        Lf:
            r6 = move-exception
            goto L91
        L12:
            boolean r0 = r5.g     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L8b
            boolean r0 = r5.i     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L83
            boolean r0 = r5.h     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L22
            R r6 = r5.e     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r5)
            return r6
        L22:
            r0 = 0
            if (r6 != 0) goto L2c
            com.bumptech.glide.request.f$a r6 = r5.d     // Catch: java.lang.Throwable -> Lf
            r6.b(r5, r0)     // Catch: java.lang.Throwable -> Lf
            goto L53
        L2c:
            long r2 = r6.longValue()     // Catch: java.lang.Throwable -> Lf
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L53
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf
            long r2 = r6.longValue()     // Catch: java.lang.Throwable -> Lf
            long r2 = r2 + r0
        L3d:
            boolean r6 = r5.isDone()     // Catch: java.lang.Throwable -> Lf
            if (r6 != 0) goto L53
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L53
            com.bumptech.glide.request.f$a r6 = r5.d     // Catch: java.lang.Throwable -> Lf
            long r0 = r2 - r0
            r6.b(r5, r0)     // Catch: java.lang.Throwable -> Lf
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf
            goto L3d
        L53:
            boolean r6 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> Lf
            if (r6 != 0) goto L7d
            boolean r6 = r5.i     // Catch: java.lang.Throwable -> Lf
            if (r6 != 0) goto L75
            boolean r6 = r5.g     // Catch: java.lang.Throwable -> Lf
            if (r6 != 0) goto L6f
            boolean r6 = r5.h     // Catch: java.lang.Throwable -> Lf
            if (r6 == 0) goto L69
            R r6 = r5.e     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r5)
            return r6
        L69:
            java.util.concurrent.TimeoutException r6 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> Lf
            r6.<init>()     // Catch: java.lang.Throwable -> Lf
            throw r6     // Catch: java.lang.Throwable -> Lf
        L6f:
            java.util.concurrent.CancellationException r6 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> Lf
            r6.<init>()     // Catch: java.lang.Throwable -> Lf
            throw r6     // Catch: java.lang.Throwable -> Lf
        L75:
            java.util.concurrent.ExecutionException r6 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> Lf
            com.bumptech.glide.load.engine.GlideException r0 = r5.j     // Catch: java.lang.Throwable -> Lf
            r6.<init>(r0)     // Catch: java.lang.Throwable -> Lf
            throw r6     // Catch: java.lang.Throwable -> Lf
        L7d:
            java.lang.InterruptedException r6 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> Lf
            r6.<init>()     // Catch: java.lang.Throwable -> Lf
            throw r6     // Catch: java.lang.Throwable -> Lf
        L83:
            java.util.concurrent.ExecutionException r6 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> Lf
            com.bumptech.glide.load.engine.GlideException r0 = r5.j     // Catch: java.lang.Throwable -> Lf
            r6.<init>(r0)     // Catch: java.lang.Throwable -> Lf
            throw r6     // Catch: java.lang.Throwable -> Lf
        L8b:
            java.util.concurrent.CancellationException r6 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> Lf
            r6.<init>()     // Catch: java.lang.Throwable -> Lf
            throw r6     // Catch: java.lang.Throwable -> Lf
        L91:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lf
            throw r6
    }

    @Override // com.bumptech.glide.request.g
    public synchronized boolean a(@androidx.annotation.Nullable com.bumptech.glide.load.engine.GlideException r1, java.lang.Object r2, com.bumptech.glide.request.target.p<R> r3, boolean r4) {
            r0 = this;
            monitor-enter(r0)
            r2 = 1
            r0.i = r2     // Catch: java.lang.Throwable -> Le
            r0.j = r1     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.f$a r1 = r0.d     // Catch: java.lang.Throwable -> Le
            r1.a(r0)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            r1 = 0
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // com.bumptech.glide.request.target.p
    public void b(@androidx.annotation.NonNull com.bumptech.glide.request.target.o r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.request.g
    public synchronized boolean c(R r1, java.lang.Object r2, com.bumptech.glide.request.target.p<R> r3, com.bumptech.glide.load.DataSource r4, boolean r5) {
            r0 = this;
            monitor-enter(r0)
            r2 = 1
            r0.h = r2     // Catch: java.lang.Throwable -> Le
            r0.e = r1     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.f$a r1 = r0.d     // Catch: java.lang.Throwable -> Le
            r1.a(r0)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            r1 = 0
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Lc
            r3 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            return r3
        La:
            r3 = move-exception
            goto L23
        Lc:
            r0 = 1
            r2.g = r0     // Catch: java.lang.Throwable -> La
            com.bumptech.glide.request.f$a r1 = r2.d     // Catch: java.lang.Throwable -> La
            r1.a(r2)     // Catch: java.lang.Throwable -> La
            r1 = 0
            if (r3 == 0) goto L1c
            com.bumptech.glide.request.e r3 = r2.f     // Catch: java.lang.Throwable -> La
            r2.f = r1     // Catch: java.lang.Throwable -> La
            r1 = r3
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto L22
            r1.clear()
        L22:
            return r0
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @Override // com.bumptech.glide.request.target.p
    @androidx.annotation.Nullable
    public synchronized com.bumptech.glide.request.e d() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.request.e r0 = r1.f     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // com.bumptech.glide.request.target.p
    public void g(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // java.util.concurrent.Future
    public R get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r2 = this;
            r0 = 0
            java.lang.Object r0 = r2.e(r0)     // Catch: java.util.concurrent.TimeoutException -> L6
            return r0
        L6:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.concurrent.Future
    public R get(long r1, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r3) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r0 = this;
            long r1 = r3.toMillis(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r0.e(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.target.p
    public synchronized void h(@androidx.annotation.NonNull R r1, @androidx.annotation.Nullable com.bumptech.glide.request.transition.f<? super R> r2) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.g     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.g     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.h     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.i     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            goto L12
        Le:
            r0 = 0
            goto L13
        L10:
            r0 = move-exception
            goto L15
        L12:
            r0 = 1
        L13:
            monitor-exit(r1)
            return r0
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    @Override // com.bumptech.glide.request.target.p
    public void j(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.request.target.p
    public synchronized void n(@androidx.annotation.Nullable com.bumptech.glide.request.e r1) {
            r0 = this;
            monitor-enter(r0)
            r0.f = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    @Override // com.bumptech.glide.request.target.p
    public synchronized void o(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // com.bumptech.glide.manager.m
    public void onDestroy() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.manager.m
    public void onStart() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.manager.m
    public void onStop() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.request.target.p
    public void q(@androidx.annotation.NonNull com.bumptech.glide.request.target.o r3) {
            r2 = this;
            int r0 = r2.a
            int r1 = r2.b
            r3.d(r0, r1)
            return
    }
}
