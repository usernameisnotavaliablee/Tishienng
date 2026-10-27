package com.bumptech.glide.load.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r {
    private static final com.bumptech.glide.load.model.r.c e = null;
    private static final com.bumptech.glide.load.model.n<java.lang.Object, java.lang.Object> f = null;
    private final java.util.List<com.bumptech.glide.load.model.r.b<?, ?>> a;
    private final com.bumptech.glide.load.model.r.c b;
    private final java.util.Set<com.bumptech.glide.load.model.r.b<?, ?>> c;
    private final androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a implements com.bumptech.glide.load.model.n<java.lang.Object, java.lang.Object> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.model.n
        @androidx.annotation.Nullable
        public com.bumptech.glide.load.model.n.a<java.lang.Object> a(@androidx.annotation.NonNull java.lang.Object r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.bumptech.glide.load.model.n
        public boolean b(@androidx.annotation.NonNull java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b<Model, Data> {
        private final java.lang.Class<Model> a;
        final java.lang.Class<Data> b;
        final com.bumptech.glide.load.model.o<? extends Model, ? extends Data> c;

        public b(@androidx.annotation.NonNull java.lang.Class<Model> r1, @androidx.annotation.NonNull java.lang.Class<Data> r2, @androidx.annotation.NonNull com.bumptech.glide.load.model.o<? extends Model, ? extends Data> r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        public boolean a(@androidx.annotation.NonNull java.lang.Class<?> r2) {
                r1 = this;
                java.lang.Class<Model> r0 = r1.a
                boolean r2 = r0.isAssignableFrom(r2)
                return r2
        }

        public boolean b(@androidx.annotation.NonNull java.lang.Class<?> r1, @androidx.annotation.NonNull java.lang.Class<?> r2) {
                r0 = this;
                boolean r1 = r0.a(r1)
                if (r1 == 0) goto L10
                java.lang.Class<Data> r1 = r0.b
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L10
                r1 = 1
                return r1
            L10:
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public <Model, Data> com.bumptech.glide.load.model.q<Model, Data> a(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.model.n<Model, Data>> r2, @androidx.annotation.NonNull androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> r3) {
                r1 = this;
                com.bumptech.glide.load.model.q r0 = new com.bumptech.glide.load.model.q
                r0.<init>(r2, r3)
                return r0
        }
    }

    static {
            com.bumptech.glide.load.model.r$c r0 = new com.bumptech.glide.load.model.r$c
            r0.<init>()
            com.bumptech.glide.load.model.r.e = r0
            com.bumptech.glide.load.model.r$a r0 = new com.bumptech.glide.load.model.r$a
            r0.<init>()
            com.bumptech.glide.load.model.r.f = r0
            return
    }

    public r(@androidx.annotation.NonNull androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> r2) {
            r1 = this;
            com.bumptech.glide.load.model.r$c r0 = com.bumptech.glide.load.model.r.e
            r1.<init>(r2, r0)
            return
    }

    @androidx.annotation.VisibleForTesting
    r(@androidx.annotation.NonNull androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> r2, @androidx.annotation.NonNull com.bumptech.glide.load.model.r.c r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.c = r0
            r1.d = r2
            r1.b = r3
            return
    }

    private <Model, Data> void a(@androidx.annotation.NonNull java.lang.Class<Model> r2, @androidx.annotation.NonNull java.lang.Class<Data> r3, @androidx.annotation.NonNull com.bumptech.glide.load.model.o<? extends Model, ? extends Data> r4, boolean r5) {
            r1 = this;
            com.bumptech.glide.load.model.r$b r0 = new com.bumptech.glide.load.model.r$b
            r0.<init>(r2, r3, r4)
            java.util.List<com.bumptech.glide.load.model.r$b<?, ?>> r2 = r1.a
            if (r5 == 0) goto Le
            int r3 = r2.size()
            goto Lf
        Le:
            r3 = 0
        Lf:
            r2.add(r3, r0)
            return
    }

    @androidx.annotation.NonNull
    private <Model, Data> com.bumptech.glide.load.model.n<Model, Data> c(@androidx.annotation.NonNull com.bumptech.glide.load.model.r.b<?, ?> r1) {
            r0 = this;
            com.bumptech.glide.load.model.o<? extends Model, ? extends Data> r1 = r1.c
            com.bumptech.glide.load.model.n r1 = r1.c(r0)
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r1)
            com.bumptech.glide.load.model.n r1 = (com.bumptech.glide.load.model.n) r1
            return r1
    }

    @androidx.annotation.NonNull
    private static <Model, Data> com.bumptech.glide.load.model.n<Model, Data> f() {
            com.bumptech.glide.load.model.n<java.lang.Object, java.lang.Object> r0 = com.bumptech.glide.load.model.r.f
            return r0
    }

    @androidx.annotation.NonNull
    private <Model, Data> com.bumptech.glide.load.model.o<Model, Data> h(@androidx.annotation.NonNull com.bumptech.glide.load.model.r.b<?, ?> r1) {
            r0 = this;
            com.bumptech.glide.load.model.o<? extends Model, ? extends Data> r1 = r1.c
            return r1
    }

    synchronized <Model, Data> void b(@androidx.annotation.NonNull java.lang.Class<Model> r2, @androidx.annotation.NonNull java.lang.Class<Data> r3, @androidx.annotation.NonNull com.bumptech.glide.load.model.o<? extends Model, ? extends Data> r4) {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.a(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @androidx.annotation.NonNull
    public synchronized <Model, Data> com.bumptech.glide.load.model.n<Model, Data> d(@androidx.annotation.NonNull java.lang.Class<Model> r8, @androidx.annotation.NonNull java.lang.Class<Data> r9) {
            r7 = this;
            monitor-enter(r7)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3d
            r0.<init>()     // Catch: java.lang.Throwable -> L3d
            java.util.List<com.bumptech.glide.load.model.r$b<?, ?>> r1 = r7.a     // Catch: java.lang.Throwable -> L3d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3d
            r2 = 0
            r3 = 0
        Le:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L3d
            r5 = 1
            if (r4 == 0) goto L3f
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L3d
            com.bumptech.glide.load.model.r$b r4 = (com.bumptech.glide.load.model.r.b) r4     // Catch: java.lang.Throwable -> L3d
            java.util.Set<com.bumptech.glide.load.model.r$b<?, ?>> r6 = r7.c     // Catch: java.lang.Throwable -> L3d
            boolean r6 = r6.contains(r4)     // Catch: java.lang.Throwable -> L3d
            if (r6 == 0) goto L25
            r3 = 1
            goto Le
        L25:
            boolean r5 = r4.b(r8, r9)     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto Le
            java.util.Set<com.bumptech.glide.load.model.r$b<?, ?>> r5 = r7.c     // Catch: java.lang.Throwable -> L3d
            r5.add(r4)     // Catch: java.lang.Throwable -> L3d
            com.bumptech.glide.load.model.n r5 = r7.c(r4)     // Catch: java.lang.Throwable -> L3d
            r0.add(r5)     // Catch: java.lang.Throwable -> L3d
            java.util.Set<com.bumptech.glide.load.model.r$b<?, ?>> r5 = r7.c     // Catch: java.lang.Throwable -> L3d
            r5.remove(r4)     // Catch: java.lang.Throwable -> L3d
            goto Le
        L3d:
            r8 = move-exception
            goto L6b
        L3f:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L3d
            if (r1 <= r5) goto L4f
            com.bumptech.glide.load.model.r$c r8 = r7.b     // Catch: java.lang.Throwable -> L3d
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r9 = r7.d     // Catch: java.lang.Throwable -> L3d
            com.bumptech.glide.load.model.q r8 = r8.a(r0, r9)     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r7)
            return r8
        L4f:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L3d
            if (r1 != r5) goto L5d
            java.lang.Object r8 = r0.get(r2)     // Catch: java.lang.Throwable -> L3d
            com.bumptech.glide.load.model.n r8 = (com.bumptech.glide.load.model.n) r8     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r7)
            return r8
        L5d:
            if (r3 == 0) goto L65
            com.bumptech.glide.load.model.n r8 = f()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r7)
            return r8
        L65:
            com.bumptech.glide.Registry$NoModelLoaderAvailableException r0 = new com.bumptech.glide.Registry$NoModelLoaderAvailableException     // Catch: java.lang.Throwable -> L3d
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> L3d
            throw r0     // Catch: java.lang.Throwable -> L3d
        L6b:
            java.util.Set<com.bumptech.glide.load.model.r$b<?, ?>> r9 = r7.c     // Catch: java.lang.Throwable -> L71
            r9.clear()     // Catch: java.lang.Throwable -> L71
            throw r8     // Catch: java.lang.Throwable -> L71
        L71:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L71
            throw r8
    }

    @androidx.annotation.NonNull
    synchronized <Model> java.util.List<com.bumptech.glide.load.model.n<Model, ?>> e(@androidx.annotation.NonNull java.lang.Class<Model> r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L39
            r0.<init>()     // Catch: java.lang.Throwable -> L39
            java.util.List<com.bumptech.glide.load.model.r$b<?, ?>> r1 = r4.a     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L39
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L39
            com.bumptech.glide.load.model.r$b r2 = (com.bumptech.glide.load.model.r.b) r2     // Catch: java.lang.Throwable -> L39
            java.util.Set<com.bumptech.glide.load.model.r$b<?, ?>> r3 = r4.c     // Catch: java.lang.Throwable -> L39
            boolean r3 = r3.contains(r2)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L21
            goto Lc
        L21:
            boolean r3 = r2.a(r5)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto Lc
            java.util.Set<com.bumptech.glide.load.model.r$b<?, ?>> r3 = r4.c     // Catch: java.lang.Throwable -> L39
            r3.add(r2)     // Catch: java.lang.Throwable -> L39
            com.bumptech.glide.load.model.n r3 = r4.c(r2)     // Catch: java.lang.Throwable -> L39
            r0.add(r3)     // Catch: java.lang.Throwable -> L39
            java.util.Set<com.bumptech.glide.load.model.r$b<?, ?>> r3 = r4.c     // Catch: java.lang.Throwable -> L39
            r3.remove(r2)     // Catch: java.lang.Throwable -> L39
            goto Lc
        L39:
            r5 = move-exception
            goto L3d
        L3b:
            monitor-exit(r4)
            return r0
        L3d:
            java.util.Set<com.bumptech.glide.load.model.r$b<?, ?>> r0 = r4.c     // Catch: java.lang.Throwable -> L43
            r0.clear()     // Catch: java.lang.Throwable -> L43
            throw r5     // Catch: java.lang.Throwable -> L43
        L43:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L43
            throw r5
    }

    @androidx.annotation.NonNull
    synchronized java.util.List<java.lang.Class<?>> g(@androidx.annotation.NonNull java.lang.Class<?> r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2c
            r0.<init>()     // Catch: java.lang.Throwable -> L2c
            java.util.List<com.bumptech.glide.load.model.r$b<?, ?>> r1 = r4.a     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2c
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2c
            com.bumptech.glide.load.model.r$b r2 = (com.bumptech.glide.load.model.r.b) r2     // Catch: java.lang.Throwable -> L2c
            java.lang.Class<Data> r3 = r2.b     // Catch: java.lang.Throwable -> L2c
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L2c
            if (r3 != 0) goto Lc
            boolean r3 = r2.a(r5)     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto Lc
            java.lang.Class<Data> r2 = r2.b     // Catch: java.lang.Throwable -> L2c
            r0.add(r2)     // Catch: java.lang.Throwable -> L2c
            goto Lc
        L2c:
            r5 = move-exception
            goto L30
        L2e:
            monitor-exit(r4)
            return r0
        L30:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2c
            throw r5
    }

    synchronized <Model, Data> void i(@androidx.annotation.NonNull java.lang.Class<Model> r2, @androidx.annotation.NonNull java.lang.Class<Data> r3, @androidx.annotation.NonNull com.bumptech.glide.load.model.o<? extends Model, ? extends Data> r4) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.a(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @androidx.annotation.NonNull
    synchronized <Model, Data> java.util.List<com.bumptech.glide.load.model.o<? extends Model, ? extends Data>> j(@androidx.annotation.NonNull java.lang.Class<Model> r5, @androidx.annotation.NonNull java.lang.Class<Data> r6) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L29
            java.util.List<com.bumptech.glide.load.model.r$b<?, ?>> r1 = r4.a     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L29
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.load.model.r$b r2 = (com.bumptech.glide.load.model.r.b) r2     // Catch: java.lang.Throwable -> L29
            boolean r3 = r2.b(r5, r6)     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto Lc
            r1.remove()     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.load.model.o r2 = r4.h(r2)     // Catch: java.lang.Throwable -> L29
            r0.add(r2)     // Catch: java.lang.Throwable -> L29
            goto Lc
        L29:
            r5 = move-exception
            goto L2d
        L2b:
            monitor-exit(r4)
            return r0
        L2d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L29
            throw r5
    }

    @androidx.annotation.NonNull
    synchronized <Model, Data> java.util.List<com.bumptech.glide.load.model.o<? extends Model, ? extends Data>> k(@androidx.annotation.NonNull java.lang.Class<Model> r2, @androidx.annotation.NonNull java.lang.Class<Data> r3, @androidx.annotation.NonNull com.bumptech.glide.load.model.o<? extends Model, ? extends Data> r4) {
            r1 = this;
            monitor-enter(r1)
            java.util.List r0 = r1.j(r2, r3)     // Catch: java.lang.Throwable -> La
            r1.b(r2, r3, r4)     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return r0
        La:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r2
    }
}
