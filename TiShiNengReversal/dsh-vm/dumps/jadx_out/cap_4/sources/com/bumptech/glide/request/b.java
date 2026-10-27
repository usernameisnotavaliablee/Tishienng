package com.bumptech.glide.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b implements com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.e {
    private final java.lang.Object a;

    @androidx.annotation.Nullable
    private final com.bumptech.glide.request.RequestCoordinator b;
    private volatile com.bumptech.glide.request.e c;
    private volatile com.bumptech.glide.request.e d;

    @androidx.annotation.GuardedBy("requestLock")
    private com.bumptech.glide.request.RequestCoordinator.RequestState e;

    @androidx.annotation.GuardedBy("requestLock")
    private com.bumptech.glide.request.RequestCoordinator.RequestState f;

    public b(java.lang.Object r2, @androidx.annotation.Nullable com.bumptech.glide.request.RequestCoordinator r3) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.request.RequestCoordinator$RequestState r0 = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED
            r1.e = r0
            r1.f = r0
            r1.a = r2
            r1.b = r3
            return
    }

    @androidx.annotation.GuardedBy("requestLock")
    private boolean j(com.bumptech.glide.request.e r3) {
            r2 = this;
            com.bumptech.glide.request.e r0 = r2.c
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L19
            com.bumptech.glide.request.RequestCoordinator$RequestState r0 = r2.e
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED
            if (r0 != r1) goto L17
            com.bumptech.glide.request.e r0 = r2.d
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L17
            goto L19
        L17:
            r3 = 0
            return r3
        L19:
            r3 = 1
            return r3
    }

    @androidx.annotation.GuardedBy("requestLock")
    private boolean k() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.b
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
    private boolean l() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.b
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
    private boolean m() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.b
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

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.e
    public boolean a() {
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            com.bumptech.glide.request.e r1 = r2.c     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            com.bumptech.glide.request.e r1 = r2.d     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L14
            goto L18
        L14:
            r1 = 0
            goto L19
        L16:
            r1 = move-exception
            goto L1b
        L18:
            r1 = 1
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return r1
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void b(com.bumptech.glide.request.e r3) {
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            com.bumptech.glide.request.e r1 = r2.c     // Catch: java.lang.Throwable -> L10
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L10
            r2.e = r3     // Catch: java.lang.Throwable -> L10
            goto L1e
        L10:
            r3 = move-exception
            goto L27
        L12:
            com.bumptech.glide.request.e r1 = r2.d     // Catch: java.lang.Throwable -> L10
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L1e
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L10
            r2.f = r3     // Catch: java.lang.Throwable -> L10
        L1e:
            com.bumptech.glide.request.RequestCoordinator r3 = r2.b     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L25
            r3.b(r2)     // Catch: java.lang.Throwable -> L10
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean c(com.bumptech.glide.request.e r3) {
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            boolean r1 = r2.l()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            boolean r3 = r2.j(r3)     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            r3 = 1
            goto L14
        L11:
            r3 = move-exception
            goto L16
        L13:
            r3 = 0
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r3
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED     // Catch: java.lang.Throwable -> L18
            r3.e = r1     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.request.e r2 = r3.c     // Catch: java.lang.Throwable -> L18
            r2.clear()     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = r3.f     // Catch: java.lang.Throwable -> L18
            if (r2 == r1) goto L1a
            r3.f = r1     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.request.e r1 = r3.d     // Catch: java.lang.Throwable -> L18
            r1.clear()     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r1 = move-exception
            goto L1c
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean d(com.bumptech.glide.request.e r3) {
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            boolean r1 = r2.m()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            boolean r3 = r2.j(r3)     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            r3 = 1
            goto L14
        L11:
            r3 = move-exception
            goto L16
        L13:
            r3 = 0
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r3
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    @Override // com.bumptech.glide.request.e
    public boolean e() {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.e     // Catch: java.lang.Throwable -> Lf
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED     // Catch: java.lang.Throwable -> Lf
            if (r1 != r2) goto L11
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.f     // Catch: java.lang.Throwable -> Lf
            if (r1 != r2) goto L11
            r1 = 1
            goto L12
        Lf:
            r1 = move-exception
            goto L14
        L11:
            r1 = 0
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    @Override // com.bumptech.glide.request.e
    public boolean f(com.bumptech.glide.request.e r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.request.b
            r1 = 0
            if (r0 == 0) goto L1d
            com.bumptech.glide.request.b r4 = (com.bumptech.glide.request.b) r4
            com.bumptech.glide.request.e r0 = r3.c
            com.bumptech.glide.request.e r2 = r4.c
            boolean r0 = r0.f(r2)
            if (r0 == 0) goto L1d
            com.bumptech.glide.request.e r0 = r3.d
            com.bumptech.glide.request.e r4 = r4.d
            boolean r4 = r0.f(r4)
            if (r4 == 0) goto L1d
            r4 = 1
            return r4
        L1d:
            return r1
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void g(com.bumptech.glide.request.e r3) {
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            com.bumptech.glide.request.e r1 = r2.d     // Catch: java.lang.Throwable -> L1d
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L1d
            if (r3 != 0) goto L21
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch: java.lang.Throwable -> L1d
            r2.e = r3     // Catch: java.lang.Throwable -> L1d
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.f     // Catch: java.lang.Throwable -> L1d
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> L1d
            if (r3 == r1) goto L1f
            r2.f = r1     // Catch: java.lang.Throwable -> L1d
            com.bumptech.glide.request.e r3 = r2.d     // Catch: java.lang.Throwable -> L1d
            r3.h()     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r3 = move-exception
            goto L2e
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L21:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch: java.lang.Throwable -> L1d
            r2.f = r3     // Catch: java.lang.Throwable -> L1d
            com.bumptech.glide.request.RequestCoordinator r3 = r2.b     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L2c
            r3.g(r2)     // Catch: java.lang.Throwable -> L1d
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public com.bumptech.glide.request.RequestCoordinator getRoot() {
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator r1 = r2.b     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Le
            com.bumptech.glide.request.RequestCoordinator r1 = r1.getRoot()     // Catch: java.lang.Throwable -> Lc
            goto Lf
        Lc:
            r1 = move-exception
            goto L11
        Le:
            r1 = r2
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @Override // com.bumptech.glide.request.e
    public void h() {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.e     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> L11
            if (r1 == r2) goto L13
            r3.e = r2     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.request.e r1 = r3.c     // Catch: java.lang.Throwable -> L11
            r1.h()     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r1 = move-exception
            goto L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean i(com.bumptech.glide.request.e r3) {
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            boolean r1 = r2.k()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            boolean r3 = r2.j(r3)     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            r3 = 1
            goto L14
        L11:
            r3 = move-exception
            goto L16
        L13:
            r3 = 0
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r3
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    @Override // com.bumptech.glide.request.e
    public boolean isComplete() {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.e     // Catch: java.lang.Throwable -> L10
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L10
            if (r1 == r2) goto L12
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.f     // Catch: java.lang.Throwable -> L10
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
    public boolean isRunning() {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.e     // Catch: java.lang.Throwable -> L10
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> L10
            if (r1 == r2) goto L12
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.f     // Catch: java.lang.Throwable -> L10
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

    public void n(com.bumptech.glide.request.e r1, com.bumptech.glide.request.e r2) {
            r0 = this;
            r0.c = r1
            r0.d = r2
            return
    }

    @Override // com.bumptech.glide.request.e
    public void pause() {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.e     // Catch: java.lang.Throwable -> L13
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> L13
            if (r1 != r2) goto L15
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.PAUSED     // Catch: java.lang.Throwable -> L13
            r3.e = r1     // Catch: java.lang.Throwable -> L13
            com.bumptech.glide.request.e r1 = r3.c     // Catch: java.lang.Throwable -> L13
            r1.pause()     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L24
        L15:
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.f     // Catch: java.lang.Throwable -> L13
            if (r1 != r2) goto L22
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.PAUSED     // Catch: java.lang.Throwable -> L13
            r3.f = r1     // Catch: java.lang.Throwable -> L13
            com.bumptech.glide.request.e r1 = r3.d     // Catch: java.lang.Throwable -> L13
            r1.pause()     // Catch: java.lang.Throwable -> L13
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }
}
