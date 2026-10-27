package com.bumptech.glide.load.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class p {
    private final com.bumptech.glide.load.model.r a;
    private final com.bumptech.glide.load.model.p.a b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.model.p.a.C0030a<?>> a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bumptech.glide.load.model.p$a$a, reason: collision with other inner class name */
        private static class C0030a<Model> {
            final java.util.List<com.bumptech.glide.load.model.n<Model, ?>> a;

            public C0030a(java.util.List<com.bumptech.glide.load.model.n<Model, ?>> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.a = r1
                    return
            }
        }

        a() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.a = r0
                return
        }

        public void a() {
                r1 = this;
                java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.model.p$a$a<?>> r0 = r1.a
                r0.clear()
                return
        }

        @androidx.annotation.Nullable
        public <Model> java.util.List<com.bumptech.glide.load.model.n<Model, ?>> b(java.lang.Class<Model> r2) {
                r1 = this;
                java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.model.p$a$a<?>> r0 = r1.a
                java.lang.Object r2 = r0.get(r2)
                com.bumptech.glide.load.model.p$a$a r2 = (com.bumptech.glide.load.model.p.a.C0030a) r2
                if (r2 != 0) goto Lc
                r2 = 0
                return r2
            Lc:
                java.util.List<com.bumptech.glide.load.model.n<Model, ?>> r2 = r2.a
                return r2
        }

        public <Model> void c(java.lang.Class<Model> r3, java.util.List<com.bumptech.glide.load.model.n<Model, ?>> r4) {
                r2 = this;
                java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.model.p$a$a<?>> r0 = r2.a
                com.bumptech.glide.load.model.p$a$a r1 = new com.bumptech.glide.load.model.p$a$a
                r1.<init>(r4)
                java.lang.Object r4 = r0.put(r3, r1)
                com.bumptech.glide.load.model.p$a$a r4 = (com.bumptech.glide.load.model.p.a.C0030a) r4
                if (r4 != 0) goto L10
                return
            L10:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Already cached loaders for model: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
        }
    }

    public p(@androidx.annotation.NonNull androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> r2) {
            r1 = this;
            com.bumptech.glide.load.model.r r0 = new com.bumptech.glide.load.model.r
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    private p(@androidx.annotation.NonNull com.bumptech.glide.load.model.r r2) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.model.p$a r0 = new com.bumptech.glide.load.model.p$a
            r0.<init>()
            r1.b = r0
            r1.a = r2
            return
    }

    @androidx.annotation.NonNull
    private static <A> java.lang.Class<A> c(@androidx.annotation.NonNull A r0) {
            java.lang.Class r0 = r0.getClass()
            return r0
    }

    @androidx.annotation.NonNull
    private synchronized <A> java.util.List<com.bumptech.glide.load.model.n<A, ?>> f(@androidx.annotation.NonNull java.lang.Class<A> r3) {
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.load.model.p$a r0 = r2.b     // Catch: java.lang.Throwable -> L19
            java.util.List r0 = r0.b(r3)     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L1b
            com.bumptech.glide.load.model.r r0 = r2.a     // Catch: java.lang.Throwable -> L19
            java.util.List r0 = r0.e(r3)     // Catch: java.lang.Throwable -> L19
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch: java.lang.Throwable -> L19
            com.bumptech.glide.load.model.p$a r1 = r2.b     // Catch: java.lang.Throwable -> L19
            r1.c(r3, r0)     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r3 = move-exception
            goto L1d
        L1b:
            monitor-exit(r2)
            return r0
        L1d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    private <Model, Data> void j(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.model.o<? extends Model, ? extends Data>> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r2.next()
            com.bumptech.glide.load.model.o r0 = (com.bumptech.glide.load.model.o) r0
            r0.b()
            goto L4
        L14:
            return
    }

    public synchronized <Model, Data> void a(@androidx.annotation.NonNull java.lang.Class<Model> r2, @androidx.annotation.NonNull java.lang.Class<Data> r3, @androidx.annotation.NonNull com.bumptech.glide.load.model.o<? extends Model, ? extends Data> r4) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.load.model.r r0 = r1.a     // Catch: java.lang.Throwable -> Ld
            r0.b(r2, r3, r4)     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.load.model.p$a r2 = r1.b     // Catch: java.lang.Throwable -> Ld
            r2.a()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public synchronized <Model, Data> com.bumptech.glide.load.model.n<Model, Data> b(@androidx.annotation.NonNull java.lang.Class<Model> r2, @androidx.annotation.NonNull java.lang.Class<Data> r3) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.load.model.r r0 = r1.a     // Catch: java.lang.Throwable -> L9
            com.bumptech.glide.load.model.n r2 = r0.d(r2, r3)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    @androidx.annotation.NonNull
    public synchronized java.util.List<java.lang.Class<?>> d(@androidx.annotation.NonNull java.lang.Class<?> r2) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.load.model.r r0 = r1.a     // Catch: java.lang.Throwable -> L9
            java.util.List r2 = r0.g(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    @androidx.annotation.NonNull
    public <A> java.util.List<com.bumptech.glide.load.model.n<A, ?>> e(@androidx.annotation.NonNull A r9) {
            r8 = this;
            java.lang.Class r0 = c(r9)
            java.util.List r0 = r8.f(r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L42
            int r1 = r0.size()
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            r3 = 0
            r4 = 1
            r5 = 0
        L17:
            if (r5 >= r1) goto L35
            java.lang.Object r6 = r0.get(r5)
            com.bumptech.glide.load.model.n r6 = (com.bumptech.glide.load.model.n) r6
            boolean r7 = r6.b(r9)
            if (r7 == 0) goto L32
            if (r4 == 0) goto L2f
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = r1 - r5
            r2.<init>(r4)
            r4 = 0
        L2f:
            r2.add(r6)
        L32:
            int r5 = r5 + 1
            goto L17
        L35:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L3c
            return r2
        L3c:
            com.bumptech.glide.Registry$NoModelLoaderAvailableException r1 = new com.bumptech.glide.Registry$NoModelLoaderAvailableException
            r1.<init>(r9, r0)
            throw r1
        L42:
            com.bumptech.glide.Registry$NoModelLoaderAvailableException r0 = new com.bumptech.glide.Registry$NoModelLoaderAvailableException
            r0.<init>(r9)
            throw r0
    }

    public synchronized <Model, Data> void g(@androidx.annotation.NonNull java.lang.Class<Model> r2, @androidx.annotation.NonNull java.lang.Class<Data> r3, @androidx.annotation.NonNull com.bumptech.glide.load.model.o<? extends Model, ? extends Data> r4) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.load.model.r r0 = r1.a     // Catch: java.lang.Throwable -> Ld
            r0.i(r2, r3, r4)     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.load.model.p$a r2 = r1.b     // Catch: java.lang.Throwable -> Ld
            r2.a()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public synchronized <Model, Data> void h(@androidx.annotation.NonNull java.lang.Class<Model> r2, @androidx.annotation.NonNull java.lang.Class<Data> r3) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.load.model.r r0 = r1.a     // Catch: java.lang.Throwable -> L11
            java.util.List r2 = r0.j(r2, r3)     // Catch: java.lang.Throwable -> L11
            r1.j(r2)     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.load.model.p$a r2 = r1.b     // Catch: java.lang.Throwable -> L11
            r2.a()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    public synchronized <Model, Data> void i(@androidx.annotation.NonNull java.lang.Class<Model> r2, @androidx.annotation.NonNull java.lang.Class<Data> r3, @androidx.annotation.NonNull com.bumptech.glide.load.model.o<? extends Model, ? extends Data> r4) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.load.model.r r0 = r1.a     // Catch: java.lang.Throwable -> L11
            java.util.List r2 = r0.k(r2, r3, r4)     // Catch: java.lang.Throwable -> L11
            r1.j(r2)     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.load.model.p$a r2 = r1.b     // Catch: java.lang.Throwable -> L11
            r2.a()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
    }
}
