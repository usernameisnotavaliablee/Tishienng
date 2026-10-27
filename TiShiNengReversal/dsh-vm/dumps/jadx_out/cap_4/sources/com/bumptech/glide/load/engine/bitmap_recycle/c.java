package com.bumptech.glide.load.engine.bitmap_recycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class c implements com.bumptech.glide.load.engine.bitmap_recycle.m {
    private final com.bumptech.glide.load.engine.bitmap_recycle.c.b a;
    private final com.bumptech.glide.load.engine.bitmap_recycle.h<com.bumptech.glide.load.engine.bitmap_recycle.c.a, android.graphics.Bitmap> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    static class a implements com.bumptech.glide.load.engine.bitmap_recycle.n {
        private final com.bumptech.glide.load.engine.bitmap_recycle.c.b a;
        private int b;
        private int c;
        private android.graphics.Bitmap.Config d;

        public a(com.bumptech.glide.load.engine.bitmap_recycle.c.b r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.n
        public void a() {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.c$b r0 = r1.a
                r0.c(r1)
                return
        }

        public void b(int r1, int r2, android.graphics.Bitmap.Config r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r0.d = r3
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.bumptech.glide.load.engine.bitmap_recycle.c.a
                r1 = 0
                if (r0 == 0) goto L1b
                com.bumptech.glide.load.engine.bitmap_recycle.c$a r4 = (com.bumptech.glide.load.engine.bitmap_recycle.c.a) r4
                int r0 = r3.b
                int r2 = r4.b
                if (r0 != r2) goto L1b
                int r0 = r3.c
                int r2 = r4.c
                if (r0 != r2) goto L1b
                android.graphics.Bitmap$Config r0 = r3.d
                android.graphics.Bitmap$Config r4 = r4.d
                if (r0 != r4) goto L1b
                r4 = 1
                return r4
            L1b:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.b
                int r0 = r0 * 31
                int r1 = r2.c
                int r0 = r0 + r1
                int r0 = r0 * 31
                android.graphics.Bitmap$Config r1 = r2.d
                if (r1 == 0) goto L12
                int r1 = r1.hashCode()
                goto L13
            L12:
                r1 = 0
            L13:
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                int r0 = r3.b
                int r1 = r3.c
                android.graphics.Bitmap$Config r2 = r3.d
                java.lang.String r0 = com.bumptech.glide.load.engine.bitmap_recycle.c.f(r0, r1, r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    static class b extends com.bumptech.glide.load.engine.bitmap_recycle.d<com.bumptech.glide.load.engine.bitmap_recycle.c.a> {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        protected /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.c.a a() {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.c$a r0 = r1.d()
                return r0
        }

        protected com.bumptech.glide.load.engine.bitmap_recycle.c.a d() {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.c$a r0 = new com.bumptech.glide.load.engine.bitmap_recycle.c$a
                r0.<init>(r1)
                return r0
        }

        com.bumptech.glide.load.engine.bitmap_recycle.c.a e(int r2, int r3, android.graphics.Bitmap.Config r4) {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.n r0 = r1.b()
                com.bumptech.glide.load.engine.bitmap_recycle.c$a r0 = (com.bumptech.glide.load.engine.bitmap_recycle.c.a) r0
                r0.b(r2, r3, r4)
                return r0
        }
    }

    c() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.engine.bitmap_recycle.c$b r0 = new com.bumptech.glide.load.engine.bitmap_recycle.c$b
            r0.<init>()
            r1.a = r0
            com.bumptech.glide.load.engine.bitmap_recycle.h r0 = new com.bumptech.glide.load.engine.bitmap_recycle.h
            r0.<init>()
            r1.b = r0
            return
    }

    static java.lang.String f(int r2, int r3, android.graphics.Bitmap.Config r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "x"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = "], "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static java.lang.String g(android.graphics.Bitmap r2) {
            int r0 = r2.getWidth()
            int r1 = r2.getHeight()
            android.graphics.Bitmap$Config r2 = r2.getConfig()
            java.lang.String r2 = f(r0, r1, r2)
            return r2
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public java.lang.String a(int r1, int r2, android.graphics.Bitmap.Config r3) {
            r0 = this;
            java.lang.String r1 = f(r1, r2, r3)
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public int b(android.graphics.Bitmap r1) {
            r0 = this;
            int r1 = com.bumptech.glide.util.l.h(r1)
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public java.lang.String c(android.graphics.Bitmap r1) {
            r0 = this;
            java.lang.String r1 = g(r1)
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public void d(android.graphics.Bitmap r5) {
            r4 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.c$b r0 = r4.a
            int r1 = r5.getWidth()
            int r2 = r5.getHeight()
            android.graphics.Bitmap$Config r3 = r5.getConfig()
            com.bumptech.glide.load.engine.bitmap_recycle.c$a r0 = r0.e(r1, r2, r3)
            com.bumptech.glide.load.engine.bitmap_recycle.h<com.bumptech.glide.load.engine.bitmap_recycle.c$a, android.graphics.Bitmap> r1 = r4.b
            r1.d(r0, r5)
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public android.graphics.Bitmap e(int r2, int r3, android.graphics.Bitmap.Config r4) {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.c$b r0 = r1.a
            com.bumptech.glide.load.engine.bitmap_recycle.c$a r2 = r0.e(r2, r3, r4)
            com.bumptech.glide.load.engine.bitmap_recycle.h<com.bumptech.glide.load.engine.bitmap_recycle.c$a, android.graphics.Bitmap> r3 = r1.b
            java.lang.Object r2 = r3.a(r2)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            return r2
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public android.graphics.Bitmap removeLast() {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.h<com.bumptech.glide.load.engine.bitmap_recycle.c$a, android.graphics.Bitmap> r0 = r1.b
            java.lang.Object r0 = r0.f()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AttributeStrategy:\n  "
            r0.append(r1)
            com.bumptech.glide.load.engine.bitmap_recycle.h<com.bumptech.glide.load.engine.bitmap_recycle.c$a, android.graphics.Bitmap> r1 = r2.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
