package com.bumptech.glide.load.engine.bitmap_recycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(19)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class q implements com.bumptech.glide.load.engine.bitmap_recycle.m {
    private static final int d = 8;
    private static final android.graphics.Bitmap.Config[] e = null;
    private static final android.graphics.Bitmap.Config[] f = null;
    private static final android.graphics.Bitmap.Config[] g = null;
    private static final android.graphics.Bitmap.Config[] h = null;
    private static final android.graphics.Bitmap.Config[] i = null;
    private final com.bumptech.glide.load.engine.bitmap_recycle.q.c a;
    private final com.bumptech.glide.load.engine.bitmap_recycle.h<com.bumptech.glide.load.engine.bitmap_recycle.q.b, android.graphics.Bitmap> b;
    private final java.util.Map<android.graphics.Bitmap.Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;

        static {
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bumptech.glide.load.engine.bitmap_recycle.q.a.a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bumptech.glide.load.engine.bitmap_recycle.q.a.a     // Catch: java.lang.NoSuchFieldError -> L1d
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.bumptech.glide.load.engine.bitmap_recycle.q.a.a     // Catch: java.lang.NoSuchFieldError -> L28
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.bumptech.glide.load.engine.bitmap_recycle.q.a.a     // Catch: java.lang.NoSuchFieldError -> L33
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    static final class b implements com.bumptech.glide.load.engine.bitmap_recycle.n {
        private final com.bumptech.glide.load.engine.bitmap_recycle.q.c a;
        int b;
        private android.graphics.Bitmap.Config c;

        public b(com.bumptech.glide.load.engine.bitmap_recycle.q.c r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @androidx.annotation.VisibleForTesting
        b(com.bumptech.glide.load.engine.bitmap_recycle.q.c r1, int r2, android.graphics.Bitmap.Config r3) {
                r0 = this;
                r0.<init>(r1)
                r0.b(r2, r3)
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.n
        public void a() {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.q$c r0 = r1.a
                r0.c(r1)
                return
        }

        public void b(int r1, android.graphics.Bitmap.Config r2) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.bumptech.glide.load.engine.bitmap_recycle.q.b
                r1 = 0
                if (r0 == 0) goto L19
                com.bumptech.glide.load.engine.bitmap_recycle.q$b r4 = (com.bumptech.glide.load.engine.bitmap_recycle.q.b) r4
                int r0 = r3.b
                int r2 = r4.b
                if (r0 != r2) goto L19
                android.graphics.Bitmap$Config r0 = r3.c
                android.graphics.Bitmap$Config r4 = r4.c
                boolean r4 = com.bumptech.glide.util.l.d(r0, r4)
                if (r4 == 0) goto L19
                r4 = 1
                return r4
            L19:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.b
                int r0 = r0 * 31
                android.graphics.Bitmap$Config r1 = r2.c
                if (r1 == 0) goto Ld
                int r1 = r1.hashCode()
                goto Le
            Ld:
                r1 = 0
            Le:
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                int r0 = r2.b
                android.graphics.Bitmap$Config r1 = r2.c
                java.lang.String r0 = com.bumptech.glide.load.engine.bitmap_recycle.q.h(r0, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    static class c extends com.bumptech.glide.load.engine.bitmap_recycle.d<com.bumptech.glide.load.engine.bitmap_recycle.q.b> {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        protected /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.q.b a() {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.q$b r0 = r1.d()
                return r0
        }

        protected com.bumptech.glide.load.engine.bitmap_recycle.q.b d() {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.q$b r0 = new com.bumptech.glide.load.engine.bitmap_recycle.q$b
                r0.<init>(r1)
                return r0
        }

        public com.bumptech.glide.load.engine.bitmap_recycle.q.b e(int r2, android.graphics.Bitmap.Config r3) {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.n r0 = r1.b()
                com.bumptech.glide.load.engine.bitmap_recycle.q$b r0 = (com.bumptech.glide.load.engine.bitmap_recycle.q.b) r0
                r0.b(r2, r3)
                return r0
        }
    }

    static {
            r0 = 2
            android.graphics.Bitmap$Config[] r0 = new android.graphics.Bitmap.Config[r0]
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            r2 = 0
            r0[r2] = r1
            r1 = 0
            r3 = 1
            r0[r3] = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r1 < r4) goto L21
            r1 = 3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            android.graphics.Bitmap$Config[] r0 = (android.graphics.Bitmap.Config[]) r0
            int r1 = r0.length
            int r1 = r1 - r3
            android.graphics.Bitmap$Config r4 = com.bumptech.glide.load.engine.bitmap_recycle.p.a()
            r0[r1] = r4
        L21:
            com.bumptech.glide.load.engine.bitmap_recycle.q.e = r0
            com.bumptech.glide.load.engine.bitmap_recycle.q.f = r0
            android.graphics.Bitmap$Config[] r0 = new android.graphics.Bitmap.Config[r3]
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            r0[r2] = r1
            com.bumptech.glide.load.engine.bitmap_recycle.q.g = r0
            android.graphics.Bitmap$Config[] r0 = new android.graphics.Bitmap.Config[r3]
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444
            r0[r2] = r1
            com.bumptech.glide.load.engine.bitmap_recycle.q.h = r0
            android.graphics.Bitmap$Config[] r0 = new android.graphics.Bitmap.Config[r3]
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8
            r0[r2] = r1
            com.bumptech.glide.load.engine.bitmap_recycle.q.i = r0
            return
    }

    public q() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.engine.bitmap_recycle.q$c r0 = new com.bumptech.glide.load.engine.bitmap_recycle.q$c
            r0.<init>()
            r1.a = r0
            com.bumptech.glide.load.engine.bitmap_recycle.h r0 = new com.bumptech.glide.load.engine.bitmap_recycle.h
            r0.<init>()
            r1.b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.c = r0
            return
    }

    private void f(java.lang.Integer r4, android.graphics.Bitmap r5) {
            r3 = this;
            android.graphics.Bitmap$Config r0 = r5.getConfig()
            java.util.NavigableMap r0 = r3.j(r0)
            java.lang.Object r1 = r0.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L28
            int r5 = r1.intValue()
            r2 = 1
            if (r5 != r2) goto L1b
            r0.remove(r4)
            return
        L1b:
            int r5 = r1.intValue()
            int r5 = r5 - r2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.put(r4, r5)
            return
        L28:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Tried to decrement empty size, size: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", removed: "
            r1.append(r4)
            java.lang.String r4 = r3.c(r5)
            r1.append(r4)
            java.lang.String r4 = ", this: "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private com.bumptech.glide.load.engine.bitmap_recycle.q.b g(int r9, android.graphics.Bitmap.Config r10) {
            r8 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.q$c r0 = r8.a
            com.bumptech.glide.load.engine.bitmap_recycle.q$b r0 = r0.e(r9, r10)
            android.graphics.Bitmap$Config[] r1 = i(r10)
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L4c
            r4 = r1[r3]
            java.util.NavigableMap r5 = r8.j(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            java.lang.Object r5 = r5.ceilingKey(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L49
            int r6 = r5.intValue()
            int r7 = r9 * 8
            if (r6 > r7) goto L49
            int r1 = r5.intValue()
            if (r1 != r9) goto L39
            if (r4 != 0) goto L33
            if (r10 == 0) goto L4c
            goto L39
        L33:
            boolean r9 = r4.equals(r10)
            if (r9 != 0) goto L4c
        L39:
            com.bumptech.glide.load.engine.bitmap_recycle.q$c r9 = r8.a
            r9.c(r0)
            com.bumptech.glide.load.engine.bitmap_recycle.q$c r9 = r8.a
            int r10 = r5.intValue()
            com.bumptech.glide.load.engine.bitmap_recycle.q$b r9 = r9.e(r10, r4)
            return r9
        L49:
            int r3 = r3 + 1
            goto Lc
        L4c:
            return r0
    }

    static java.lang.String h(int r2, android.graphics.Bitmap.Config r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "]("
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static android.graphics.Bitmap.Config[] i(android.graphics.Bitmap.Config r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L13
            android.graphics.Bitmap$Config r0 = com.bumptech.glide.load.engine.bitmap_recycle.p.a()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L13
            android.graphics.Bitmap$Config[] r3 = com.bumptech.glide.load.engine.bitmap_recycle.q.f
            return r3
        L13:
            int[] r0 = com.bumptech.glide.load.engine.bitmap_recycle.q.a.a
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L36
            r2 = 2
            if (r0 == r2) goto L33
            r2 = 3
            if (r0 == r2) goto L30
            r2 = 4
            if (r0 == r2) goto L2d
            android.graphics.Bitmap$Config[] r0 = new android.graphics.Bitmap.Config[r1]
            r1 = 0
            r0[r1] = r3
            return r0
        L2d:
            android.graphics.Bitmap$Config[] r3 = com.bumptech.glide.load.engine.bitmap_recycle.q.i
            return r3
        L30:
            android.graphics.Bitmap$Config[] r3 = com.bumptech.glide.load.engine.bitmap_recycle.q.h
            return r3
        L33:
            android.graphics.Bitmap$Config[] r3 = com.bumptech.glide.load.engine.bitmap_recycle.q.g
            return r3
        L36:
            android.graphics.Bitmap$Config[] r3 = com.bumptech.glide.load.engine.bitmap_recycle.q.e
            return r3
    }

    private java.util.NavigableMap<java.lang.Integer, java.lang.Integer> j(android.graphics.Bitmap.Config r3) {
            r2 = this;
            java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r0 = r2.c
            java.lang.Object r0 = r0.get(r3)
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            if (r0 != 0) goto L14
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r1 = r2.c
            r1.put(r3, r0)
        L14:
            return r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public java.lang.String a(int r1, int r2, android.graphics.Bitmap.Config r3) {
            r0 = this;
            int r1 = com.bumptech.glide.util.l.g(r1, r2, r3)
            java.lang.String r1 = h(r1, r3)
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public int b(android.graphics.Bitmap r1) {
            r0 = this;
            int r1 = com.bumptech.glide.util.l.h(r1)
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public java.lang.String c(android.graphics.Bitmap r2) {
            r1 = this;
            int r0 = com.bumptech.glide.util.l.h(r2)
            android.graphics.Bitmap$Config r2 = r2.getConfig()
            java.lang.String r2 = h(r0, r2)
            return r2
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public void d(android.graphics.Bitmap r4) {
            r3 = this;
            int r0 = com.bumptech.glide.util.l.h(r4)
            com.bumptech.glide.load.engine.bitmap_recycle.q$c r1 = r3.a
            android.graphics.Bitmap$Config r2 = r4.getConfig()
            com.bumptech.glide.load.engine.bitmap_recycle.q$b r0 = r1.e(r0, r2)
            com.bumptech.glide.load.engine.bitmap_recycle.h<com.bumptech.glide.load.engine.bitmap_recycle.q$b, android.graphics.Bitmap> r1 = r3.b
            r1.d(r0, r4)
            android.graphics.Bitmap$Config r4 = r4.getConfig()
            java.util.NavigableMap r4 = r3.j(r4)
            int r1 = r0.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r4.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r0.b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 1
            if (r1 != 0) goto L31
            goto L36
        L31:
            int r1 = r1.intValue()
            int r2 = r2 + r1
        L36:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r4.put(r0, r1)
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    @androidx.annotation.Nullable
    public android.graphics.Bitmap e(int r3, int r4, android.graphics.Bitmap.Config r5) {
            r2 = this;
            int r0 = com.bumptech.glide.util.l.g(r3, r4, r5)
            com.bumptech.glide.load.engine.bitmap_recycle.q$b r0 = r2.g(r0, r5)
            com.bumptech.glide.load.engine.bitmap_recycle.h<com.bumptech.glide.load.engine.bitmap_recycle.q$b, android.graphics.Bitmap> r1 = r2.b
            java.lang.Object r1 = r1.a(r0)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L1e
            int r0 = r0.b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.f(r0, r1)
            r1.reconfigure(r3, r4, r5)
        L1e:
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    @androidx.annotation.Nullable
    public android.graphics.Bitmap removeLast() {
            r2 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.h<com.bumptech.glide.load.engine.bitmap_recycle.q$b, android.graphics.Bitmap> r0 = r2.b
            java.lang.Object r0 = r0.f()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L15
            int r1 = com.bumptech.glide.util.l.h(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.f(r1, r0)
        L15:
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SizeConfigStrategy{groupedMap="
            r0.append(r1)
            com.bumptech.glide.load.engine.bitmap_recycle.h<com.bumptech.glide.load.engine.bitmap_recycle.q$b, android.graphics.Bitmap> r1 = r4.b
            r0.append(r1)
            java.lang.String r1 = ", sortedSizes=("
            r0.append(r1)
            java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r1 = r4.c
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            r0.append(r3)
            r3 = 91
            r0.append(r3)
            java.lang.Object r2 = r2.getValue()
            r0.append(r2)
            java.lang.String r2 = "], "
            r0.append(r2)
            goto L1e
        L43:
            java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r1 = r4.c
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L5a
            int r1 = r0.length()
            int r1 = r1 + (-2)
            int r2 = r0.length()
            java.lang.String r3 = ""
            r0.replace(r1, r2, r3)
        L5a:
            java.lang.String r1 = ")}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
