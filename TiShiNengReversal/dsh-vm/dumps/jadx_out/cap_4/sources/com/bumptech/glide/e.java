package com.bumptech.glide;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class e {
    private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.e.b> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a {
        private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.e.b> a;

        a() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.a = r0
                return
        }

        static /* synthetic */ java.util.Map a(com.bumptech.glide.e.a r0) {
                java.util.Map<java.lang.Class<?>, com.bumptech.glide.e$b> r0 = r0.a
                return r0
        }

        com.bumptech.glide.e.a b(com.bumptech.glide.e.b r3) {
                r2 = this;
                java.util.Map<java.lang.Class<?>, com.bumptech.glide.e$b> r0 = r2.a
                java.lang.Class r1 = r3.getClass()
                r0.put(r1, r3)
                return r2
        }

        com.bumptech.glide.e c() {
                r1 = this;
                com.bumptech.glide.e r0 = new com.bumptech.glide.e
                r0.<init>(r1)
                return r0
        }

        com.bumptech.glide.e.a update(com.bumptech.glide.e.b r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto L6
                r0.b(r1)
                return r0
            L6:
                java.util.Map<java.lang.Class<?>, com.bumptech.glide.e$b> r2 = r0.a
                java.lang.Class r1 = r1.getClass()
                r2.remove(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface b {
    }

    e(com.bumptech.glide.e.a r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r2 = com.bumptech.glide.e.a.a(r2)
            r0.<init>(r2)
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r0)
            r1.a = r2
            return
    }

    @androidx.annotation.Nullable
    <T extends com.bumptech.glide.e.b> T a(java.lang.Class<T> r2) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.e$b> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            com.bumptech.glide.e$b r2 = (com.bumptech.glide.e.b) r2
            return r2
    }

    public boolean b(java.lang.Class<? extends com.bumptech.glide.e.b> r2) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.e$b> r0 = r1.a
            boolean r2 = r0.containsKey(r2)
            return r2
    }
}
