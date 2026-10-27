package com.google.firebase.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class OptionalProvider<T> implements com.google.firebase.inject.Provider<T>, com.google.firebase.inject.Deferred<T> {
    private static final com.google.firebase.inject.Provider<java.lang.Object> EMPTY_PROVIDER = null;
    private static final com.google.firebase.inject.Deferred.DeferredHandler<java.lang.Object> NOOP_HANDLER = null;
    private volatile com.google.firebase.inject.Provider<T> delegate;

    @androidx.annotation.GuardedBy("this")
    private com.google.firebase.inject.Deferred.DeferredHandler<T> handler;

    static {
            com.google.firebase.inject.Deferred$DeferredHandler r0 = com.google.firebase.components.OptionalProvider$$Lambda$4.lambdaFactory$()
            com.google.firebase.components.OptionalProvider.NOOP_HANDLER = r0
            com.google.firebase.inject.Provider r0 = com.google.firebase.components.OptionalProvider$$Lambda$5.lambdaFactory$()
            com.google.firebase.components.OptionalProvider.EMPTY_PROVIDER = r0
            return
    }

    private OptionalProvider(com.google.firebase.inject.Deferred.DeferredHandler<T> r1, com.google.firebase.inject.Provider<T> r2) {
            r0 = this;
            r0.<init>()
            r0.handler = r1
            r0.delegate = r2
            return
    }

    static <T> com.google.firebase.components.OptionalProvider<T> empty() {
            com.google.firebase.components.OptionalProvider r0 = new com.google.firebase.components.OptionalProvider
            com.google.firebase.inject.Deferred$DeferredHandler<java.lang.Object> r1 = com.google.firebase.components.OptionalProvider.NOOP_HANDLER
            com.google.firebase.inject.Provider<java.lang.Object> r2 = com.google.firebase.components.OptionalProvider.EMPTY_PROVIDER
            r0.<init>(r1, r2)
            return r0
    }

    static /* synthetic */ void lambda$static$0(com.google.firebase.inject.Provider r0) {
            return
    }

    static /* synthetic */ java.lang.Object lambda$static$1() {
            r0 = 0
            return r0
    }

    static /* synthetic */ void lambda$whenAvailable$2(com.google.firebase.inject.Deferred.DeferredHandler r0, com.google.firebase.inject.Deferred.DeferredHandler r1, com.google.firebase.inject.Provider r2) {
            r0.handle(r2)
            r1.handle(r2)
            return
    }

    static <T> com.google.firebase.components.OptionalProvider<T> of(com.google.firebase.inject.Provider<T> r2) {
            com.google.firebase.components.OptionalProvider r0 = new com.google.firebase.components.OptionalProvider
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
            r1 = this;
            com.google.firebase.inject.Provider<T> r0 = r1.delegate
            java.lang.Object r0 = r0.get()
            return r0
    }

    void set(com.google.firebase.inject.Provider<T> r3) {
            r2 = this;
            com.google.firebase.inject.Provider<T> r0 = r2.delegate
            com.google.firebase.inject.Provider<java.lang.Object> r1 = com.google.firebase.components.OptionalProvider.EMPTY_PROVIDER
            if (r0 != r1) goto L16
            monitor-enter(r2)
            com.google.firebase.inject.Deferred$DeferredHandler<T> r0 = r2.handler     // Catch: java.lang.Throwable -> L13
            r1 = 0
            r2.handler = r1     // Catch: java.lang.Throwable -> L13
            r2.delegate = r3     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            r0.handle(r3)
            return
        L13:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r3
        L16:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "provide() can be called only once."
            r3.<init>(r0)
            throw r3
    }

    @Override // com.google.firebase.inject.Deferred
    public void whenAvailable(@androidx.annotation.NonNull com.google.firebase.inject.Deferred.DeferredHandler<T> r3) {
            r2 = this;
            com.google.firebase.inject.Provider<T> r0 = r2.delegate
            com.google.firebase.inject.Provider<java.lang.Object> r1 = com.google.firebase.components.OptionalProvider.EMPTY_PROVIDER
            if (r0 == r1) goto La
            r3.handle(r0)
            return
        La:
            monitor-enter(r2)
            com.google.firebase.inject.Provider<T> r0 = r2.delegate     // Catch: java.lang.Throwable -> L21
            if (r0 == r1) goto L11
            r1 = r0
            goto L1a
        L11:
            com.google.firebase.inject.Deferred$DeferredHandler<T> r1 = r2.handler     // Catch: java.lang.Throwable -> L21
            com.google.firebase.inject.Deferred$DeferredHandler r1 = com.google.firebase.components.OptionalProvider$$Lambda$1.lambdaFactory$(r1, r3)     // Catch: java.lang.Throwable -> L21
            r2.handler = r1     // Catch: java.lang.Throwable -> L21
            r1 = 0
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L20
            r3.handle(r0)
        L20:
            return
        L21:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r3
    }
}
