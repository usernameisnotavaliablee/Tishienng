package com.google.firebase.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class Lazy<T> implements com.google.firebase.inject.Provider<T> {
    private static final java.lang.Object UNINITIALIZED = null;
    private volatile java.lang.Object instance;
    private volatile com.google.firebase.inject.Provider<T> provider;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.firebase.components.Lazy.UNINITIALIZED = r0
            return
    }

    public Lazy(com.google.firebase.inject.Provider<T> r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.google.firebase.components.Lazy.UNINITIALIZED
            r1.instance = r0
            r1.provider = r2
            return
    }

    Lazy(T r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.google.firebase.components.Lazy.UNINITIALIZED
            r1.instance = r0
            r1.instance = r2
            return
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
            r2 = this;
            java.lang.Object r0 = r2.instance
            java.lang.Object r1 = com.google.firebase.components.Lazy.UNINITIALIZED
            if (r0 != r1) goto L1d
            monitor-enter(r2)
            java.lang.Object r0 = r2.instance     // Catch: java.lang.Throwable -> L17
            if (r0 != r1) goto L19
            com.google.firebase.inject.Provider<T> r0 = r2.provider     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L17
            r2.instance = r0     // Catch: java.lang.Throwable -> L17
            r1 = 0
            r2.provider = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r0 = move-exception
            goto L1b
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            return r0
        L1b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        L1d:
            return r0
    }

    @androidx.annotation.VisibleForTesting
    boolean isInitialized() {
            r2 = this;
            java.lang.Object r0 = r2.instance
            java.lang.Object r1 = com.google.firebase.components.Lazy.UNINITIALIZED
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
