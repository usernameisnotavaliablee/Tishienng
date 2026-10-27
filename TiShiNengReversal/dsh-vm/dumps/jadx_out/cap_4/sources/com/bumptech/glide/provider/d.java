package com.bumptech.glide.provider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d {
    private final java.util.concurrent.atomic.AtomicReference<com.bumptech.glide.util.j> a;
    private final androidx.collection.ArrayMap<com.bumptech.glide.util.j, java.util.List<java.lang.Class<?>>> b;

    public d() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.a = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1.b = r0
            return
    }

    public void a() {
            r2 = this;
            androidx.collection.ArrayMap<com.bumptech.glide.util.j, java.util.List<java.lang.Class<?>>> r0 = r2.b
            monitor-enter(r0)
            androidx.collection.ArrayMap<com.bumptech.glide.util.j, java.util.List<java.lang.Class<?>>> r1 = r2.b     // Catch: java.lang.Throwable -> La
            r1.clear()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @androidx.annotation.Nullable
    public java.util.List<java.lang.Class<?>> b(@androidx.annotation.NonNull java.lang.Class<?> r3, @androidx.annotation.NonNull java.lang.Class<?> r4, @androidx.annotation.NonNull java.lang.Class<?> r5) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<com.bumptech.glide.util.j> r0 = r2.a
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            com.bumptech.glide.util.j r0 = (com.bumptech.glide.util.j) r0
            if (r0 != 0) goto L11
            com.bumptech.glide.util.j r0 = new com.bumptech.glide.util.j
            r0.<init>(r3, r4, r5)
            goto L14
        L11:
            r0.b(r3, r4, r5)
        L14:
            androidx.collection.ArrayMap<com.bumptech.glide.util.j, java.util.List<java.lang.Class<?>>> r3 = r2.b
            monitor-enter(r3)
            androidx.collection.ArrayMap<com.bumptech.glide.util.j, java.util.List<java.lang.Class<?>>> r4 = r2.b     // Catch: java.lang.Throwable -> L26
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L26
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L26
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            java.util.concurrent.atomic.AtomicReference<com.bumptech.glide.util.j> r3 = r2.a
            r3.set(r0)
            return r4
        L26:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            throw r4
    }

    public void c(@androidx.annotation.NonNull java.lang.Class<?> r4, @androidx.annotation.NonNull java.lang.Class<?> r5, @androidx.annotation.NonNull java.lang.Class<?> r6, @androidx.annotation.NonNull java.util.List<java.lang.Class<?>> r7) {
            r3 = this;
            androidx.collection.ArrayMap<com.bumptech.glide.util.j, java.util.List<java.lang.Class<?>>> r0 = r3.b
            monitor-enter(r0)
            androidx.collection.ArrayMap<com.bumptech.glide.util.j, java.util.List<java.lang.Class<?>>> r1 = r3.b     // Catch: java.lang.Throwable -> Lf
            com.bumptech.glide.util.j r2 = new com.bumptech.glide.util.j     // Catch: java.lang.Throwable -> Lf
            r2.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> Lf
            r1.put(r2, r7)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r4
    }
}
