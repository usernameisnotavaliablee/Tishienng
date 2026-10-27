package com.bumptech.glide.load.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class r {
    private final java.util.Map<com.bumptech.glide.load.c, com.bumptech.glide.load.engine.l<?>> a;
    private final java.util.Map<com.bumptech.glide.load.c, com.bumptech.glide.load.engine.l<?>> b;

    r() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            return
    }

    private java.util.Map<com.bumptech.glide.load.c, com.bumptech.glide.load.engine.l<?>> c(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            java.util.Map<com.bumptech.glide.load.c, com.bumptech.glide.load.engine.l<?>> r1 = r0.b
            return r1
        L5:
            java.util.Map<com.bumptech.glide.load.c, com.bumptech.glide.load.engine.l<?>> r1 = r0.a
            return r1
    }

    com.bumptech.glide.load.engine.l<?> a(com.bumptech.glide.load.c r1, boolean r2) {
            r0 = this;
            java.util.Map r2 = r0.c(r2)
            java.lang.Object r1 = r2.get(r1)
            com.bumptech.glide.load.engine.l r1 = (com.bumptech.glide.load.engine.l) r1
            return r1
    }

    @androidx.annotation.VisibleForTesting
    java.util.Map<com.bumptech.glide.load.c, com.bumptech.glide.load.engine.l<?>> b() {
            r1 = this;
            java.util.Map<com.bumptech.glide.load.c, com.bumptech.glide.load.engine.l<?>> r0 = r1.a
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }

    void d(com.bumptech.glide.load.c r2, com.bumptech.glide.load.engine.l<?> r3) {
            r1 = this;
            boolean r0 = r3.q()
            java.util.Map r0 = r1.c(r0)
            r0.put(r2, r3)
            return
    }

    void e(com.bumptech.glide.load.c r3, com.bumptech.glide.load.engine.l<?> r4) {
            r2 = this;
            boolean r0 = r4.q()
            java.util.Map r0 = r2.c(r0)
            java.lang.Object r1 = r0.get(r3)
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L15
            r0.remove(r3)
        L15:
            return
    }
}
