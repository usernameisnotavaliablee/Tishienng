package com.bumptech.glide.load.engine.bitmap_recycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(19)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class r implements com.bumptech.glide.load.engine.bitmap_recycle.m {
    private static final int d = 8;
    private final com.bumptech.glide.load.engine.bitmap_recycle.r.b a;
    private final com.bumptech.glide.load.engine.bitmap_recycle.h<com.bumptech.glide.load.engine.bitmap_recycle.r.a, android.graphics.Bitmap> b;
    private final java.util.NavigableMap<java.lang.Integer, java.lang.Integer> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    static final class a implements com.bumptech.glide.load.engine.bitmap_recycle.n {
        private final com.bumptech.glide.load.engine.bitmap_recycle.r.b a;
        int b;

        a(com.bumptech.glide.load.engine.bitmap_recycle.r.b r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.n
        public void a() {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.r$b r0 = r1.a
                r0.c(r1)
                return
        }

        public void b(int r1) {
                r0 = this;
                r0.b = r1
                return
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof com.bumptech.glide.load.engine.bitmap_recycle.r.a
                r1 = 0
                if (r0 == 0) goto Lf
                com.bumptech.glide.load.engine.bitmap_recycle.r$a r3 = (com.bumptech.glide.load.engine.bitmap_recycle.r.a) r3
                int r0 = r2.b
                int r3 = r3.b
                if (r0 != r3) goto Lf
                r3 = 1
                return r3
            Lf:
                return r1
        }

        public int hashCode() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                int r0 = r1.b
                java.lang.String r0 = com.bumptech.glide.load.engine.bitmap_recycle.r.g(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    static class b extends com.bumptech.glide.load.engine.bitmap_recycle.d<com.bumptech.glide.load.engine.bitmap_recycle.r.a> {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        protected /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.r.a a() {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.r$a r0 = r1.d()
                return r0
        }

        protected com.bumptech.glide.load.engine.bitmap_recycle.r.a d() {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.r$a r0 = new com.bumptech.glide.load.engine.bitmap_recycle.r$a
                r0.<init>(r1)
                return r0
        }

        public com.bumptech.glide.load.engine.bitmap_recycle.r.a e(int r2) {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.n r0 = super.b()
                com.bumptech.glide.load.engine.bitmap_recycle.r$a r0 = (com.bumptech.glide.load.engine.bitmap_recycle.r.a) r0
                r0.b(r2)
                return r0
        }
    }

    r() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.engine.bitmap_recycle.r$b r0 = new com.bumptech.glide.load.engine.bitmap_recycle.r$b
            r0.<init>()
            r1.a = r0
            com.bumptech.glide.load.engine.bitmap_recycle.h r0 = new com.bumptech.glide.load.engine.bitmap_recycle.h
            r0.<init>()
            r1.b = r0
            com.bumptech.glide.load.engine.bitmap_recycle.o r0 = new com.bumptech.glide.load.engine.bitmap_recycle.o
            r0.<init>()
            r1.c = r0
            return
    }

    private void f(java.lang.Integer r4) {
            r3 = this;
            java.util.NavigableMap<java.lang.Integer, java.lang.Integer> r0 = r3.c
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
            r2 = 1
            if (r1 != r2) goto L15
            java.util.NavigableMap<java.lang.Integer, java.lang.Integer> r0 = r3.c
            r0.remove(r4)
            return
        L15:
            java.util.NavigableMap<java.lang.Integer, java.lang.Integer> r1 = r3.c
            int r0 = r0.intValue()
            int r0 = r0 - r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r4, r0)
            return
    }

    static java.lang.String g(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static java.lang.String h(android.graphics.Bitmap r0) {
            int r0 = com.bumptech.glide.util.l.h(r0)
            java.lang.String r0 = g(r0)
            return r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public java.lang.String a(int r1, int r2, android.graphics.Bitmap.Config r3) {
            r0 = this;
            int r1 = com.bumptech.glide.util.l.g(r1, r2, r3)
            java.lang.String r1 = g(r1)
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
            java.lang.String r1 = h(r1)
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public void d(android.graphics.Bitmap r4) {
            r3 = this;
            int r0 = com.bumptech.glide.util.l.h(r4)
            com.bumptech.glide.load.engine.bitmap_recycle.r$b r1 = r3.a
            com.bumptech.glide.load.engine.bitmap_recycle.r$a r0 = r1.e(r0)
            com.bumptech.glide.load.engine.bitmap_recycle.h<com.bumptech.glide.load.engine.bitmap_recycle.r$a, android.graphics.Bitmap> r1 = r3.b
            r1.d(r0, r4)
            java.util.NavigableMap<java.lang.Integer, java.lang.Integer> r4 = r3.c
            int r1 = r0.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r4 = r4.get(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.util.NavigableMap<java.lang.Integer, java.lang.Integer> r1 = r3.c
            int r0 = r0.b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 1
            if (r4 != 0) goto L29
            goto L2e
        L29:
            int r4 = r4.intValue()
            int r2 = r2 + r4
        L2e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r1.put(r0, r4)
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    @androidx.annotation.Nullable
    public android.graphics.Bitmap e(int r5, int r6, android.graphics.Bitmap.Config r7) {
            r4 = this;
            int r0 = com.bumptech.glide.util.l.g(r5, r6, r7)
            com.bumptech.glide.load.engine.bitmap_recycle.r$b r1 = r4.a
            com.bumptech.glide.load.engine.bitmap_recycle.r$a r1 = r1.e(r0)
            java.util.NavigableMap<java.lang.Integer, java.lang.Integer> r2 = r4.c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r2.ceilingKey(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L35
            int r3 = r2.intValue()
            if (r3 == r0) goto L35
            int r3 = r2.intValue()
            int r0 = r0 * 8
            if (r3 > r0) goto L35
            com.bumptech.glide.load.engine.bitmap_recycle.r$b r0 = r4.a
            r0.c(r1)
            com.bumptech.glide.load.engine.bitmap_recycle.r$b r0 = r4.a
            int r1 = r2.intValue()
            com.bumptech.glide.load.engine.bitmap_recycle.r$a r1 = r0.e(r1)
        L35:
            com.bumptech.glide.load.engine.bitmap_recycle.h<com.bumptech.glide.load.engine.bitmap_recycle.r$a, android.graphics.Bitmap> r0 = r4.b
            java.lang.Object r0 = r0.a(r1)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L45
            r0.reconfigure(r5, r6, r7)
            r4.f(r2)
        L45:
            return r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    @androidx.annotation.Nullable
    public android.graphics.Bitmap removeLast() {
            r2 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.h<com.bumptech.glide.load.engine.bitmap_recycle.r$a, android.graphics.Bitmap> r0 = r2.b
            java.lang.Object r0 = r0.f()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L15
            int r1 = com.bumptech.glide.util.l.h(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.f(r1)
        L15:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SizeStrategy:\n  "
            r0.append(r1)
            com.bumptech.glide.load.engine.bitmap_recycle.h<com.bumptech.glide.load.engine.bitmap_recycle.r$a, android.graphics.Bitmap> r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = "\n  SortedSizes"
            r0.append(r1)
            java.util.NavigableMap<java.lang.Integer, java.lang.Integer> r1 = r2.c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
