package com.bumptech.glide.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class k implements com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.e {

    @androidx.annotation.Nullable
    private final com.bumptech.glide.request.RequestCoordinator a;
    private final java.lang.Object b;
    private volatile com.bumptech.glide.request.e c;
    private volatile com.bumptech.glide.request.e d;

    @androidx.annotation.GuardedBy("requestLock")
    private com.bumptech.glide.request.RequestCoordinator.RequestState e;

    @androidx.annotation.GuardedBy("requestLock")
    private com.bumptech.glide.request.RequestCoordinator.RequestState f;

    @androidx.annotation.GuardedBy("requestLock")
    private boolean g;

    public k(java.lang.Object r2, @androidx.annotation.Nullable com.bumptech.glide.request.RequestCoordinator r3) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.request.RequestCoordinator$RequestState r0 = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED
            r1.e = r0
            r1.f = r0
            r1.b = r2
            r1.a = r3
            return
    }

    @androidx.annotation.GuardedBy("requestLock")
    private boolean j() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.a
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
            com.bumptech.glide.request.RequestCoordinator r0 = r1.a
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
            com.bumptech.glide.request.RequestCoordinator r0 = r1.a
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
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            com.bumptech.glide.request.e r1 = r2.d     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            com.bumptech.glide.request.e r1 = r2.c     // Catch: java.lang.Throwable -> L16
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
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            com.bumptech.glide.request.e r1 = r2.d     // Catch: java.lang.Throwable -> L11
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L11
            r2.f = r3     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r3 = move-exception
            goto L2d
        L13:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L11
            r2.e = r3     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.request.RequestCoordinator r3 = r2.a     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L1e
            r3.b(r2)     // Catch: java.lang.Throwable -> L11
        L1e:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.f     // Catch: java.lang.Throwable -> L11
            boolean r3 = r3.isComplete()     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L2b
            com.bumptech.glide.request.e r3 = r2.d     // Catch: java.lang.Throwable -> L11
            r3.clear()     // Catch: java.lang.Throwable -> L11
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean c(com.bumptech.glide.request.e r3) {
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            boolean r1 = r2.k()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1b
            com.bumptech.glide.request.e r1 = r2.c     // Catch: java.lang.Throwable -> L19
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L1b
            boolean r3 = r2.a()     // Catch: java.lang.Throwable -> L19
            if (r3 != 0) goto L1b
            r3 = 1
            goto L1c
        L19:
            r3 = move-exception
            goto L1e
        L1b:
            r3 = 0
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r3
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            r1 = 0
            r2.g = r1     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED     // Catch: java.lang.Throwable -> L18
            r2.e = r1     // Catch: java.lang.Throwable -> L18
            r2.f = r1     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.request.e r1 = r2.d     // Catch: java.lang.Throwable -> L18
            r1.clear()     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.request.e r1 = r2.c     // Catch: java.lang.Throwable -> L18
            r1.clear()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean d(com.bumptech.glide.request.e r3) {
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            boolean r1 = r2.l()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1c
            com.bumptech.glide.request.e r1 = r2.c     // Catch: java.lang.Throwable -> L18
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L1a
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.e     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L18
            if (r3 == r1) goto L1c
            goto L1a
        L18:
            r3 = move-exception
            goto L1f
        L1a:
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r3
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r3
    }

    @Override // com.bumptech.glide.request.e
    public boolean e() {
            r3 = this;
            java.lang.Object r0 = r3.b
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.e     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED     // Catch: java.lang.Throwable -> Le
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
    public boolean f(com.bumptech.glide.request.e r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.request.k
            r1 = 0
            if (r0 == 0) goto L2f
            com.bumptech.glide.request.k r4 = (com.bumptech.glide.request.k) r4
            com.bumptech.glide.request.e r0 = r3.c
            if (r0 != 0) goto L10
            com.bumptech.glide.request.e r0 = r4.c
            if (r0 != 0) goto L2f
            goto L1a
        L10:
            com.bumptech.glide.request.e r0 = r3.c
            com.bumptech.glide.request.e r2 = r4.c
            boolean r0 = r0.f(r2)
            if (r0 == 0) goto L2f
        L1a:
            com.bumptech.glide.request.e r0 = r3.d
            if (r0 != 0) goto L23
            com.bumptech.glide.request.e r4 = r4.d
            if (r4 != 0) goto L2f
            goto L2d
        L23:
            com.bumptech.glide.request.e r0 = r3.d
            com.bumptech.glide.request.e r4 = r4.d
            boolean r4 = r0.f(r4)
            if (r4 == 0) goto L2f
        L2d:
            r4 = 1
            return r4
        L2f:
            return r1
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void g(com.bumptech.glide.request.e r3) {
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            com.bumptech.glide.request.e r1 = r2.c     // Catch: java.lang.Throwable -> L11
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L13
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch: java.lang.Throwable -> L11
            r2.f = r3     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r3 = move-exception
            goto L20
        L13:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch: java.lang.Throwable -> L11
            r2.e = r3     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.request.RequestCoordinator r3 = r2.a     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L1e
            r3.g(r2)     // Catch: java.lang.Throwable -> L11
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public com.bumptech.glide.request.RequestCoordinator getRoot() {
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator r1 = r2.a     // Catch: java.lang.Throwable -> Lc
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
            r4 = this;
            java.lang.Object r0 = r4.b
            monitor-enter(r0)
            r1 = 1
            r4.g = r1     // Catch: java.lang.Throwable -> L32
            r1 = 0
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = r4.e     // Catch: java.lang.Throwable -> L1b
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L1b
            if (r2 == r3) goto L1d
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = r4.f     // Catch: java.lang.Throwable -> L1b
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> L1b
            if (r2 == r3) goto L1d
            r4.f = r3     // Catch: java.lang.Throwable -> L1b
            com.bumptech.glide.request.e r2 = r4.d     // Catch: java.lang.Throwable -> L1b
            r2.h()     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r2 = move-exception
            goto L34
        L1d:
            boolean r2 = r4.g     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L2e
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = r4.e     // Catch: java.lang.Throwable -> L1b
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> L1b
            if (r2 == r3) goto L2e
            r4.e = r3     // Catch: java.lang.Throwable -> L1b
            com.bumptech.glide.request.e r2 = r4.c     // Catch: java.lang.Throwable -> L1b
            r2.h()     // Catch: java.lang.Throwable -> L1b
        L2e:
            r4.g = r1     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r1 = move-exception
            goto L37
        L34:
            r4.g = r1     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r1
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean i(com.bumptech.glide.request.e r3) {
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            boolean r1 = r2.j()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1b
            com.bumptech.glide.request.e r1 = r2.c     // Catch: java.lang.Throwable -> L19
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L1b
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.e     // Catch: java.lang.Throwable -> L19
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.PAUSED     // Catch: java.lang.Throwable -> L19
            if (r3 == r1) goto L1b
            r3 = 1
            goto L1c
        L19:
            r3 = move-exception
            goto L1e
        L1b:
            r3 = 0
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r3
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    @Override // com.bumptech.glide.request.e
    public boolean isComplete() {
            r3 = this;
            java.lang.Object r0 = r3.b
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.e     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> Le
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
            java.lang.Object r0 = r3.b
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.e     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> Le
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

    public void m(com.bumptech.glide.request.e r1, com.bumptech.glide.request.e r2) {
            r0 = this;
            r0.c = r1
            r0.d = r2
            return
    }

    @Override // com.bumptech.glide.request.e
    public void pause() {
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r2.f     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.isComplete()     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.PAUSED     // Catch: java.lang.Throwable -> L15
            r2.f = r1     // Catch: java.lang.Throwable -> L15
            com.bumptech.glide.request.e r1 = r2.d     // Catch: java.lang.Throwable -> L15
            r1.pause()     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r1 = move-exception
            goto L2a
        L17:
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r2.e     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.isComplete()     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L28
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.PAUSED     // Catch: java.lang.Throwable -> L15
            r2.e = r1     // Catch: java.lang.Throwable -> L15
            com.bumptech.glide.request.e r1 = r2.c     // Catch: java.lang.Throwable -> L15
            r1.pause()     // Catch: java.lang.Throwable -> L15
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1
    }
}
