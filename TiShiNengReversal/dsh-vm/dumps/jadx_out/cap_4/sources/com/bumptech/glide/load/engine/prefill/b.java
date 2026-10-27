package com.bumptech.glide.load.engine.prefill;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b {
    private final com.bumptech.glide.load.engine.cache.j a;
    private final com.bumptech.glide.load.engine.bitmap_recycle.e b;
    private final com.bumptech.glide.load.DecodeFormat c;
    private com.bumptech.glide.load.engine.prefill.a d;

    public b(com.bumptech.glide.load.engine.cache.j r1, com.bumptech.glide.load.engine.bitmap_recycle.e r2, com.bumptech.glide.load.DecodeFormat r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    private static int b(com.bumptech.glide.load.engine.prefill.d r2) {
            int r0 = r2.d()
            int r1 = r2.b()
            android.graphics.Bitmap$Config r2 = r2.a()
            int r2 = com.bumptech.glide.util.l.g(r0, r1, r2)
            return r2
    }

    @androidx.annotation.VisibleForTesting
    com.bumptech.glide.load.engine.prefill.c a(com.bumptech.glide.load.engine.prefill.d... r8) {
            r7 = this;
            com.bumptech.glide.load.engine.cache.j r0 = r7.a
            long r0 = r0.getMaxSize()
            com.bumptech.glide.load.engine.cache.j r2 = r7.a
            long r2 = r2.getCurrentSize()
            long r0 = r0 - r2
            com.bumptech.glide.load.engine.bitmap_recycle.e r2 = r7.b
            long r2 = r2.getMaxSize()
            long r0 = r0 + r2
            int r2 = r8.length
            r3 = 0
            r4 = 0
            r5 = 0
        L18:
            if (r4 >= r2) goto L24
            r6 = r8[r4]
            int r6 = r6.c()
            int r5 = r5 + r6
            int r4 = r4 + 1
            goto L18
        L24:
            float r0 = (float) r0
            float r1 = (float) r5
            float r0 = r0 / r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            int r2 = r8.length
        L2d:
            if (r3 >= r2) goto L4b
            r4 = r8[r3]
            int r5 = r4.c()
            float r5 = (float) r5
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            int r6 = b(r4)
            int r5 = r5 / r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.put(r4, r5)
            int r3 = r3 + 1
            goto L2d
        L4b:
            com.bumptech.glide.load.engine.prefill.c r8 = new com.bumptech.glide.load.engine.prefill.c
            r8.<init>(r1)
            return r8
    }

    public void c(com.bumptech.glide.load.engine.prefill.d.a... r6) {
            r5 = this;
            com.bumptech.glide.load.engine.prefill.a r0 = r5.d
            if (r0 == 0) goto L7
            r0.b()
        L7:
            int r0 = r6.length
            com.bumptech.glide.load.engine.prefill.d[] r0 = new com.bumptech.glide.load.engine.prefill.d[r0]
            r1 = 0
        Lb:
            int r2 = r6.length
            if (r1 >= r2) goto L2d
            r2 = r6[r1]
            android.graphics.Bitmap$Config r3 = r2.b()
            if (r3 != 0) goto L24
            com.bumptech.glide.load.DecodeFormat r3 = r5.c
            com.bumptech.glide.load.DecodeFormat r4 = com.bumptech.glide.load.DecodeFormat.PREFER_ARGB_8888
            if (r3 != r4) goto L1f
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            goto L21
        L1f:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565
        L21:
            r2.c(r3)
        L24:
            com.bumptech.glide.load.engine.prefill.d r2 = r2.a()
            r0[r1] = r2
            int r1 = r1 + 1
            goto Lb
        L2d:
            com.bumptech.glide.load.engine.prefill.c r6 = r5.a(r0)
            com.bumptech.glide.load.engine.prefill.a r0 = new com.bumptech.glide.load.engine.prefill.a
            com.bumptech.glide.load.engine.bitmap_recycle.e r1 = r5.b
            com.bumptech.glide.load.engine.cache.j r2 = r5.a
            r0.<init>(r1, r2, r6)
            r5.d = r0
            com.bumptech.glide.util.l.x(r0)
            return
    }
}
