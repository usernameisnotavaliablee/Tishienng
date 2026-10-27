package com.bumptech.glide.load.engine.bitmap_recycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class j implements com.bumptech.glide.load.engine.bitmap_recycle.b {
    private static final int h = 4194304;

    @androidx.annotation.VisibleForTesting
    static final int i = 8;
    private static final int j = 2;
    private final com.bumptech.glide.load.engine.bitmap_recycle.h<com.bumptech.glide.load.engine.bitmap_recycle.j.a, java.lang.Object> b;
    private final com.bumptech.glide.load.engine.bitmap_recycle.j.b c;
    private final java.util.Map<java.lang.Class<?>, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> d;
    private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.engine.bitmap_recycle.a<?>> e;
    private final int f;
    private int g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a implements com.bumptech.glide.load.engine.bitmap_recycle.n {
        private final com.bumptech.glide.load.engine.bitmap_recycle.j.b a;
        int b;
        private java.lang.Class<?> c;

        a(com.bumptech.glide.load.engine.bitmap_recycle.j.b r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.n
        public void a() {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.j$b r0 = r1.a
                r0.c(r1)
                return
        }

        void b(int r1, java.lang.Class<?> r2) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.bumptech.glide.load.engine.bitmap_recycle.j.a
                r1 = 0
                if (r0 == 0) goto L15
                com.bumptech.glide.load.engine.bitmap_recycle.j$a r4 = (com.bumptech.glide.load.engine.bitmap_recycle.j.a) r4
                int r0 = r3.b
                int r2 = r4.b
                if (r0 != r2) goto L15
                java.lang.Class<?> r0 = r3.c
                java.lang.Class<?> r4 = r4.c
                if (r0 != r4) goto L15
                r4 = 1
                return r4
            L15:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.b
                int r0 = r0 * 31
                java.lang.Class<?> r1 = r2.c
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
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Key{size="
                r0.append(r1)
                int r1 = r2.b
                r0.append(r1)
                java.lang.String r1 = "array="
                r0.append(r1)
                java.lang.Class<?> r1 = r2.c
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b extends com.bumptech.glide.load.engine.bitmap_recycle.d<com.bumptech.glide.load.engine.bitmap_recycle.j.a> {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        protected /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.j.a a() {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.j$a r0 = r1.d()
                return r0
        }

        protected com.bumptech.glide.load.engine.bitmap_recycle.j.a d() {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.j$a r0 = new com.bumptech.glide.load.engine.bitmap_recycle.j$a
                r0.<init>(r1)
                return r0
        }

        com.bumptech.glide.load.engine.bitmap_recycle.j.a e(int r2, java.lang.Class<?> r3) {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.n r0 = r1.b()
                com.bumptech.glide.load.engine.bitmap_recycle.j$a r0 = (com.bumptech.glide.load.engine.bitmap_recycle.j.a) r0
                r0.b(r2, r3)
                return r0
        }
    }

    @androidx.annotation.VisibleForTesting
    public j() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.engine.bitmap_recycle.h r0 = new com.bumptech.glide.load.engine.bitmap_recycle.h
            r0.<init>()
            r1.b = r0
            com.bumptech.glide.load.engine.bitmap_recycle.j$b r0 = new com.bumptech.glide.load.engine.bitmap_recycle.j$b
            r0.<init>()
            r1.c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.e = r0
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1.f = r0
            return
    }

    public j(int r2) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.engine.bitmap_recycle.h r0 = new com.bumptech.glide.load.engine.bitmap_recycle.h
            r0.<init>()
            r1.b = r0
            com.bumptech.glide.load.engine.bitmap_recycle.j$b r0 = new com.bumptech.glide.load.engine.bitmap_recycle.j$b
            r0.<init>()
            r1.c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.e = r0
            r1.f = r2
            return
    }

    private void f(int r4, java.lang.Class<?> r5) {
            r3 = this;
            java.util.NavigableMap r5 = r3.n(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r5.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L30
            int r1 = r0.intValue()
            r2 = 1
            if (r1 != r2) goto L1f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.remove(r4)
            return
        L1f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r0 = r0.intValue()
            int r0 = r0 - r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.put(r4, r0)
            return
        L30:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Tried to decrement empty size, size: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ", this: "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
    }

    private void g() {
            r1 = this;
            int r0 = r1.f
            r1.h(r0)
            return
    }

    private void h(int r6) {
            r5 = this;
        L0:
            int r0 = r5.g
            if (r0 <= r6) goto L3d
            com.bumptech.glide.load.engine.bitmap_recycle.h<com.bumptech.glide.load.engine.bitmap_recycle.j$a, java.lang.Object> r0 = r5.b
            java.lang.Object r0 = r0.f()
            com.bumptech.glide.util.k.d(r0)
            com.bumptech.glide.load.engine.bitmap_recycle.a r1 = r5.i(r0)
            int r2 = r5.g
            int r3 = r1.a(r0)
            int r4 = r1.b()
            int r3 = r3 * r4
            int r2 = r2 - r3
            r5.g = r2
            int r2 = r1.a(r0)
            java.lang.Class r3 = r0.getClass()
            r5.f(r2, r3)
            java.lang.String r2 = r1.getTag()
            r3 = 2
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto L0
            r1.getTag()
            r1.a(r0)
            goto L0
        L3d:
            return
    }

    private <T> com.bumptech.glide.load.engine.bitmap_recycle.a<T> i(T r1) {
            r0 = this;
            java.lang.Class r1 = r1.getClass()
            com.bumptech.glide.load.engine.bitmap_recycle.a r1 = r0.j(r1)
            return r1
    }

    private <T> com.bumptech.glide.load.engine.bitmap_recycle.a<T> j(java.lang.Class<T> r4) {
            r3 = this;
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.engine.bitmap_recycle.a<?>> r0 = r3.e
            java.lang.Object r0 = r0.get(r4)
            com.bumptech.glide.load.engine.bitmap_recycle.a r0 = (com.bumptech.glide.load.engine.bitmap_recycle.a) r0
            if (r0 != 0) goto L46
            java.lang.Class<int[]> r0 = int[].class
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L18
            com.bumptech.glide.load.engine.bitmap_recycle.i r0 = new com.bumptech.glide.load.engine.bitmap_recycle.i
            r0.<init>()
            goto L25
        L18:
            java.lang.Class<byte[]> r0 = byte[].class
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L2b
            com.bumptech.glide.load.engine.bitmap_recycle.g r0 = new com.bumptech.glide.load.engine.bitmap_recycle.g
            r0.<init>()
        L25:
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.engine.bitmap_recycle.a<?>> r1 = r3.e
            r1.put(r4, r0)
            return r0
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No array pool found for: "
            r1.append(r2)
            java.lang.String r4 = r4.getSimpleName()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L46:
            return r0
    }

    @androidx.annotation.Nullable
    private <T> T k(com.bumptech.glide.load.engine.bitmap_recycle.j.a r2) {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.h<com.bumptech.glide.load.engine.bitmap_recycle.j$a, java.lang.Object> r0 = r1.b
            java.lang.Object r2 = r0.a(r2)
            return r2
    }

    private <T> T m(com.bumptech.glide.load.engine.bitmap_recycle.j.a r6, java.lang.Class<T> r7) {
            r5 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.a r0 = r5.j(r7)
            java.lang.Object r1 = r5.k(r6)
            if (r1 == 0) goto L20
            int r2 = r5.g
            int r3 = r0.a(r1)
            int r4 = r0.b()
            int r3 = r3 * r4
            int r2 = r2 - r3
            r5.g = r2
            int r2 = r0.a(r1)
            r5.f(r2, r7)
        L20:
            if (r1 != 0) goto L39
            java.lang.String r7 = r0.getTag()
            r1 = 2
            boolean r7 = android.util.Log.isLoggable(r7, r1)
            if (r7 == 0) goto L32
            r0.getTag()
            int r7 = r6.b
        L32:
            int r6 = r6.b
            java.lang.Object r6 = r0.newArray(r6)
            return r6
        L39:
            return r1
    }

    private java.util.NavigableMap<java.lang.Integer, java.lang.Integer> n(java.lang.Class<?> r3) {
            r2 = this;
            java.util.Map<java.lang.Class<?>, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r0 = r2.d
            java.lang.Object r0 = r0.get(r3)
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            if (r0 != 0) goto L14
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.util.Map<java.lang.Class<?>, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r1 = r2.d
            r1.put(r3, r0)
        L14:
            return r0
    }

    private boolean o() {
            r2 = this;
            int r0 = r2.g
            if (r0 == 0) goto Ld
            int r1 = r2.f
            int r1 = r1 / r0
            r0 = 2
            if (r1 < r0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    private boolean p(int r2) {
            r1 = this;
            int r0 = r1.f
            int r0 = r0 / 2
            if (r2 > r0) goto L8
            r2 = 1
            return r2
        L8:
            r2 = 0
            return r2
    }

    private boolean q(int r2, java.lang.Integer r3) {
            r1 = this;
            if (r3 == 0) goto L12
            boolean r0 = r1.o()
            if (r0 != 0) goto L10
            int r3 = r3.intValue()
            int r2 = r2 * 8
            if (r3 > r2) goto L12
        L10:
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized void a(int r2) {
            r1 = this;
            monitor-enter(r1)
            r0 = 40
            if (r2 < r0) goto Lb
            r1.b()     // Catch: java.lang.Throwable -> L9
            goto L1a
        L9:
            r2 = move-exception
            goto L1c
        Lb:
            r0 = 20
            if (r2 >= r0) goto L13
            r0 = 15
            if (r2 != r0) goto L1a
        L13:
            int r2 = r1.f     // Catch: java.lang.Throwable -> L9
            int r2 = r2 / 2
            r1.h(r2)     // Catch: java.lang.Throwable -> L9
        L1a:
            monitor-exit(r1)
            return
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized void b() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.h(r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> T c(int r3, java.lang.Class<T> r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.NavigableMap r0 = r2.n(r4)     // Catch: java.lang.Throwable -> L20
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L20
            boolean r1 = r2.q(r3, r0)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L22
            com.bumptech.glide.load.engine.bitmap_recycle.j$b r3 = r2.c     // Catch: java.lang.Throwable -> L20
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L20
            com.bumptech.glide.load.engine.bitmap_recycle.j$a r3 = r3.e(r0, r4)     // Catch: java.lang.Throwable -> L20
            goto L28
        L20:
            r3 = move-exception
            goto L2e
        L22:
            com.bumptech.glide.load.engine.bitmap_recycle.j$b r0 = r2.c     // Catch: java.lang.Throwable -> L20
            com.bumptech.glide.load.engine.bitmap_recycle.j$a r3 = r0.e(r3, r4)     // Catch: java.lang.Throwable -> L20
        L28:
            java.lang.Object r3 = r2.m(r3, r4)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)
            return r3
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r3
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> T d(int r2, java.lang.Class<T> r3) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.load.engine.bitmap_recycle.j$b r0 = r1.c     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.load.engine.bitmap_recycle.j$a r2 = r0.e(r2, r3)     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r2 = r1.m(r2, r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return r2
        Ld:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    @java.lang.Deprecated
    public <T> void e(T r1, java.lang.Class<T> r2) {
            r0 = this;
            r0.put(r1)
            return
    }

    int l() {
            r8 = this;
            java.util.Map<java.lang.Class<?>, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r0 = r8.d
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r0.next()
            java.lang.Class r2 = (java.lang.Class) r2
            java.util.Map<java.lang.Class<?>, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r3 = r8.d
            java.lang.Object r3 = r3.get(r2)
            java.util.NavigableMap r3 = (java.util.NavigableMap) r3
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L27:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lb
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            com.bumptech.glide.load.engine.bitmap_recycle.a r5 = r8.j(r2)
            int r6 = r4.intValue()
            java.util.Map<java.lang.Class<?>, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r7 = r8.d
            java.lang.Object r7 = r7.get(r2)
            java.util.NavigableMap r7 = (java.util.NavigableMap) r7
            java.lang.Object r4 = r7.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r6 = r6 * r4
            int r4 = r5.b()
            int r6 = r6 * r4
            int r1 = r1 + r6
            goto L27
        L57:
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> void put(T r5) {
            r4 = this;
            monitor-enter(r4)
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Throwable -> L56
            com.bumptech.glide.load.engine.bitmap_recycle.a r1 = r4.j(r0)     // Catch: java.lang.Throwable -> L56
            int r2 = r1.a(r5)     // Catch: java.lang.Throwable -> L56
            int r1 = r1.b()     // Catch: java.lang.Throwable -> L56
            int r1 = r1 * r2
            boolean r3 = r4.p(r1)     // Catch: java.lang.Throwable -> L56
            if (r3 != 0) goto L1b
            monitor-exit(r4)
            return
        L1b:
            com.bumptech.glide.load.engine.bitmap_recycle.j$b r3 = r4.c     // Catch: java.lang.Throwable -> L56
            com.bumptech.glide.load.engine.bitmap_recycle.j$a r2 = r3.e(r2, r0)     // Catch: java.lang.Throwable -> L56
            com.bumptech.glide.load.engine.bitmap_recycle.h<com.bumptech.glide.load.engine.bitmap_recycle.j$a, java.lang.Object> r3 = r4.b     // Catch: java.lang.Throwable -> L56
            r3.d(r2, r5)     // Catch: java.lang.Throwable -> L56
            java.util.NavigableMap r5 = r4.n(r0)     // Catch: java.lang.Throwable -> L56
            int r0 = r2.b     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L56
            java.lang.Object r0 = r5.get(r0)     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L56
            int r2 = r2.b     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L56
            r3 = 1
            if (r0 != 0) goto L40
            goto L45
        L40:
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L56
            int r3 = r3 + r0
        L45:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L56
            r5.put(r2, r0)     // Catch: java.lang.Throwable -> L56
            int r5 = r4.g     // Catch: java.lang.Throwable -> L56
            int r5 = r5 + r1
            r4.g = r5     // Catch: java.lang.Throwable -> L56
            r4.g()     // Catch: java.lang.Throwable -> L56
            monitor-exit(r4)
            return
        L56:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
            throw r5
    }
}
