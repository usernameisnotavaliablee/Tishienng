package kotlin.coroutines.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class h implements kotlin.coroutines.e<kotlin.n1> {

    @org.jetbrains.annotations.Nullable
    private kotlin.Result<kotlin.n1> a;

    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void b() {
            r1 = this;
            monitor-enter(r1)
        L1:
            kotlin.Result<kotlin.n1> r0 = r1.a     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L10
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.g0.n(r1, r0)     // Catch: java.lang.Throwable -> Le
            r1.wait()     // Catch: java.lang.Throwable -> Le
            goto L1
        Le:
            r0 = move-exception
            goto L19
        L10:
            java.lang.Object r0 = r0.m20unboximpl()     // Catch: java.lang.Throwable -> Le
            kotlin.g0.n(r0)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        L19:
            monitor-exit(r1)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.Result<kotlin.n1> c() {
            r1 = this;
            kotlin.Result<kotlin.n1> r0 = r1.a
            return r0
    }

    @Override // kotlin.coroutines.e
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i getContext() {
            r1 = this;
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            return r0
    }

    @Override // kotlin.coroutines.e
    public void resumeWith(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
            r0 = this;
            monitor-enter(r0)
            kotlin.Result r1 = kotlin.Result.m10boximpl(r1)     // Catch: java.lang.Throwable -> L13
            r0.a = r1     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.g0.n(r0, r1)     // Catch: java.lang.Throwable -> L13
            r0.notifyAll()     // Catch: java.lang.Throwable -> L13
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return
        L13:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void setResult(@org.jetbrains.annotations.Nullable kotlin.Result<kotlin.n1> r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
