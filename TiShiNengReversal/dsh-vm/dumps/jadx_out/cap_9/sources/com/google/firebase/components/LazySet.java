package com.google.firebase.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class LazySet<T> implements com.google.firebase.inject.Provider<java.util.Set<T>> {
    private volatile java.util.Set<T> actualSet;
    private volatile java.util.Set<com.google.firebase.inject.Provider<T>> providers;

    LazySet(java.util.Collection<com.google.firebase.inject.Provider<T>> r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.actualSet = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1.providers = r0
            java.util.Set<com.google.firebase.inject.Provider<T>> r0 = r1.providers
            r0.addAll(r2)
            return
    }

    static com.google.firebase.components.LazySet<?> fromCollection(java.util.Collection<com.google.firebase.inject.Provider<?>> r1) {
            java.util.Set r1 = (java.util.Set) r1
            com.google.firebase.components.LazySet r0 = new com.google.firebase.components.LazySet
            r0.<init>(r1)
            return r0
    }

    private synchronized void updateSet() {
            r3 = this;
            monitor-enter(r3)
            java.util.Set<com.google.firebase.inject.Provider<T>> r0 = r3.providers     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1d
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1d
            com.google.firebase.inject.Provider r1 = (com.google.firebase.inject.Provider) r1     // Catch: java.lang.Throwable -> L1d
            java.util.Set<T> r2 = r3.actualSet     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1d
            r2.add(r1)     // Catch: java.lang.Throwable -> L1d
            goto L7
        L1d:
            r0 = move-exception
            goto L24
        L1f:
            r0 = 0
            r3.providers = r0     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return
        L24:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
    }

    synchronized void add(com.google.firebase.inject.Provider<T> r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Set<T> r0 = r1.actualSet     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto Ld
            java.util.Set<com.google.firebase.inject.Provider<T>> r0 = r1.providers     // Catch: java.lang.Throwable -> Lb
            r0.add(r2)     // Catch: java.lang.Throwable -> Lb
            goto L16
        Lb:
            r2 = move-exception
            goto L18
        Ld:
            java.util.Set<T> r0 = r1.actualSet     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> Lb
            r0.add(r2)     // Catch: java.lang.Throwable -> Lb
        L16:
            monitor-exit(r1)
            return
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    @Override // com.google.firebase.inject.Provider
    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            java.util.Set r0 = r1.get()
            return r0
    }

    @Override // com.google.firebase.inject.Provider
    public java.util.Set<T> get() {
            r1 = this;
            java.util.Set<T> r0 = r1.actualSet
            if (r0 != 0) goto L1e
            monitor-enter(r1)
            java.util.Set<T> r0 = r1.actualSet     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L1a
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L18
            r0.<init>()     // Catch: java.lang.Throwable -> L18
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)     // Catch: java.lang.Throwable -> L18
            r1.actualSet = r0     // Catch: java.lang.Throwable -> L18
            r1.updateSet()     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r0 = move-exception
            goto L1c
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            goto L1e
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            throw r0
        L1e:
            java.util.Set<T> r0 = r1.actualSet
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }
}
