package com.google.mlkit.common.sdkinternal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class LazyInstanceMap<K, V> {

    @androidx.annotation.GuardedBy("instances")
    private final java.util.Map zza;

    public LazyInstanceMap() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    protected abstract V create(@androidx.annotation.NonNull K r1);

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public V get(@androidx.annotation.NonNull K r4) {
            r3 = this;
            java.util.Map r0 = r3.zza
            monitor-enter(r0)
            java.util.Map r1 = r3.zza     // Catch: java.lang.Throwable -> L13
            boolean r1 = r1.containsKey(r4)     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L15
            java.util.Map r1 = r3.zza     // Catch: java.lang.Throwable -> L13
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r4
        L13:
            r4 = move-exception
            goto L20
        L15:
            java.lang.Object r1 = r3.create(r4)     // Catch: java.lang.Throwable -> L13
            java.util.Map r2 = r3.zza     // Catch: java.lang.Throwable -> L13
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r4
    }
}
