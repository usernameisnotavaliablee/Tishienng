package com.bumptech.glide.load.engine.prefill;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class d {

    @androidx.annotation.VisibleForTesting
    static final android.graphics.Bitmap.Config e = null;
    private final int a;
    private final int b;
    private final android.graphics.Bitmap.Config c;
    private final int d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private final int a;
        private final int b;
        private android.graphics.Bitmap.Config c;
        private int d;

        public a(int r1) {
                r0 = this;
                r0.<init>(r1, r1)
                return
        }

        public a(int r2, int r3) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.d = r0
                if (r2 <= 0) goto L17
                if (r3 <= 0) goto Lf
                r1.a = r2
                r1.b = r3
                return
            Lf:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Height must be > 0"
                r2.<init>(r3)
                throw r2
            L17:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Width must be > 0"
                r2.<init>(r3)
                throw r2
        }

        com.bumptech.glide.load.engine.prefill.d a() {
                r5 = this;
                com.bumptech.glide.load.engine.prefill.d r0 = new com.bumptech.glide.load.engine.prefill.d
                int r1 = r5.a
                int r2 = r5.b
                android.graphics.Bitmap$Config r3 = r5.c
                int r4 = r5.d
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        android.graphics.Bitmap.Config b() {
                r1 = this;
                android.graphics.Bitmap$Config r0 = r1.c
                return r0
        }

        public com.bumptech.glide.load.engine.prefill.d.a c(@androidx.annotation.Nullable android.graphics.Bitmap.Config r1) {
                r0 = this;
                r0.c = r1
                return r0
        }

        public com.bumptech.glide.load.engine.prefill.d.a d(int r2) {
                r1 = this;
                if (r2 <= 0) goto L5
                r1.d = r2
                return r1
            L5:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Weight must be > 0"
                r2.<init>(r0)
                throw r2
        }
    }

    static {
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            com.bumptech.glide.load.engine.prefill.d.e = r0
            return
    }

    d(int r2, int r3, android.graphics.Bitmap.Config r4, int r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Config must not be null"
            java.lang.Object r4 = com.bumptech.glide.util.k.e(r4, r0)
            android.graphics.Bitmap$Config r4 = (android.graphics.Bitmap.Config) r4
            r1.c = r4
            r1.a = r2
            r1.b = r3
            r1.d = r5
            return
    }

    android.graphics.Bitmap.Config a() {
            r1 = this;
            android.graphics.Bitmap$Config r0 = r1.c
            return r0
    }

    int b() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    int c() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    int d() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.load.engine.prefill.d
            r1 = 0
            if (r0 == 0) goto L21
            com.bumptech.glide.load.engine.prefill.d r4 = (com.bumptech.glide.load.engine.prefill.d) r4
            int r0 = r3.b
            int r2 = r4.b
            if (r0 != r2) goto L21
            int r0 = r3.a
            int r2 = r4.a
            if (r0 != r2) goto L21
            int r0 = r3.d
            int r2 = r4.d
            if (r0 != r2) goto L21
            android.graphics.Bitmap$Config r0 = r3.c
            android.graphics.Bitmap$Config r4 = r4.c
            if (r0 != r4) goto L21
            r4 = 1
            return r4
        L21:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.a
            int r0 = r0 * 31
            int r1 = r2.b
            int r0 = r0 + r1
            int r0 = r0 * 31
            android.graphics.Bitmap$Config r1 = r2.c
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.d
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PreFillSize{width="
            r0.append(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", height="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", config="
            r0.append(r1)
            android.graphics.Bitmap$Config r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", weight="
            r0.append(r1)
            int r1 = r2.d
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
