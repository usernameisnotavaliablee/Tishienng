package com.bumptech.glide.provider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c {
    private static final com.bumptech.glide.load.engine.s<?, ?, ?> c = null;
    private final androidx.collection.ArrayMap<com.bumptech.glide.util.j, com.bumptech.glide.load.engine.s<?, ?, ?>> a;
    private final java.util.concurrent.atomic.AtomicReference<com.bumptech.glide.util.j> b;

    static {
            com.bumptech.glide.load.engine.s r0 = new com.bumptech.glide.load.engine.s
            com.bumptech.glide.load.engine.i r1 = new com.bumptech.glide.load.engine.i
            java.util.List r5 = java.util.Collections.EMPTY_LIST
            com.bumptech.glide.load.resource.transcode.g r6 = new com.bumptech.glide.load.resource.transcode.g
            r6.<init>()
            r7 = 0
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.util.List r4 = java.util.Collections.singletonList(r1)
            r5 = 0
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r0.<init>(r1, r2, r3, r4, r5)
            com.bumptech.glide.provider.c.c = r0
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1.a = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.b = r0
            return
    }

    private com.bumptech.glide.util.j b(java.lang.Class<?> r3, java.lang.Class<?> r4, java.lang.Class<?> r5) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<com.bumptech.glide.util.j> r0 = r2.b
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            com.bumptech.glide.util.j r0 = (com.bumptech.glide.util.j) r0
            if (r0 != 0) goto L10
            com.bumptech.glide.util.j r0 = new com.bumptech.glide.util.j
            r0.<init>()
        L10:
            r0.b(r3, r4, r5)
            return r0
    }

    @androidx.annotation.Nullable
    public <Data, TResource, Transcode> com.bumptech.glide.load.engine.s<Data, TResource, Transcode> a(java.lang.Class<Data> r1, java.lang.Class<TResource> r2, java.lang.Class<Transcode> r3) {
            r0 = this;
            com.bumptech.glide.util.j r1 = r0.b(r1, r2, r3)
            androidx.collection.ArrayMap<com.bumptech.glide.util.j, com.bumptech.glide.load.engine.s<?, ?, ?>> r2 = r0.a
            monitor-enter(r2)
            androidx.collection.ArrayMap<com.bumptech.glide.util.j, com.bumptech.glide.load.engine.s<?, ?, ?>> r3 = r0.a     // Catch: java.lang.Throwable -> L16
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L16
            com.bumptech.glide.load.engine.s r3 = (com.bumptech.glide.load.engine.s) r3     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.atomic.AtomicReference<com.bumptech.glide.util.j> r2 = r0.b
            r2.set(r1)
            return r3
        L16:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    public boolean c(@androidx.annotation.Nullable com.bumptech.glide.load.engine.s<?, ?, ?> r2) {
            r1 = this;
            com.bumptech.glide.load.engine.s<?, ?, ?> r0 = com.bumptech.glide.provider.c.c
            boolean r2 = r0.equals(r2)
            return r2
    }

    public void d(java.lang.Class<?> r4, java.lang.Class<?> r5, java.lang.Class<?> r6, @androidx.annotation.Nullable com.bumptech.glide.load.engine.s<?, ?, ?> r7) {
            r3 = this;
            androidx.collection.ArrayMap<com.bumptech.glide.util.j, com.bumptech.glide.load.engine.s<?, ?, ?>> r0 = r3.a
            monitor-enter(r0)
            androidx.collection.ArrayMap<com.bumptech.glide.util.j, com.bumptech.glide.load.engine.s<?, ?, ?>> r1 = r3.a     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.util.j r2 = new com.bumptech.glide.util.j     // Catch: java.lang.Throwable -> L14
            r2.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L14
            if (r7 == 0) goto Ld
            goto Lf
        Ld:
            com.bumptech.glide.load.engine.s<?, ?, ?> r7 = com.bumptech.glide.provider.c.c     // Catch: java.lang.Throwable -> L14
        Lf:
            r1.put(r2, r7)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
    }
}
