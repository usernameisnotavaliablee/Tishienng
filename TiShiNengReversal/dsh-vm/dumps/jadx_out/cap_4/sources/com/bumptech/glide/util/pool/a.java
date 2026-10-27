package com.bumptech.glide.util.pool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {
    private static final java.lang.String a = "FactoryPools";
    private static final int b = 20;
    private static final com.bumptech.glide.util.pool.a.g<java.lang.Object> c = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bumptech.glide.util.pool.a$a, reason: collision with other inner class name */
    class C0043a implements com.bumptech.glide.util.pool.a.g<java.lang.Object> {
        C0043a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.util.pool.a.g
        public void a(@androidx.annotation.NonNull java.lang.Object r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b<T> implements com.bumptech.glide.util.pool.a.d<java.util.List<T>> {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.util.pool.a.d
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ java.lang.Object a() {
                r1 = this;
                java.util.List r0 = r1.b()
                return r0
        }

        @androidx.annotation.NonNull
        public java.util.List<T> b() {
                r1 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c<T> implements com.bumptech.glide.util.pool.a.g<java.util.List<T>> {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.util.pool.a.g
        public /* bridge */ /* synthetic */ void a(@androidx.annotation.NonNull java.lang.Object r1) {
                r0 = this;
                java.util.List r1 = (java.util.List) r1
                r0.b(r1)
                return
        }

        public void b(@androidx.annotation.NonNull java.util.List<T> r1) {
                r0 = this;
                r1.clear()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d<T> {
        T a();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class e<T> implements androidx.core.util.Pools.Pool<T> {
        private final com.bumptech.glide.util.pool.a.d<T> a;
        private final com.bumptech.glide.util.pool.a.g<T> b;
        private final androidx.core.util.Pools.Pool<T> c;

        e(@androidx.annotation.NonNull androidx.core.util.Pools.Pool<T> r1, @androidx.annotation.NonNull com.bumptech.glide.util.pool.a.d<T> r2, @androidx.annotation.NonNull com.bumptech.glide.util.pool.a.g<T> r3) {
                r0 = this;
                r0.<init>()
                r0.c = r1
                r0.a = r2
                r0.b = r3
                return
        }

        public T acquire() {
                r3 = this;
                androidx.core.util.Pools$Pool<T> r0 = r3.c
                java.lang.Object r0 = r0.acquire()
                if (r0 != 0) goto L1e
                com.bumptech.glide.util.pool.a$d<T> r0 = r3.a
                java.lang.Object r0 = r0.a()
                java.lang.String r1 = "FactoryPools"
                r2 = 2
                boolean r1 = android.util.Log.isLoggable(r1, r2)
                if (r1 == 0) goto L1e
                java.lang.Class r1 = r0.getClass()
                r1.toString()
            L1e:
                boolean r1 = r0 instanceof com.bumptech.glide.util.pool.a.f
                if (r1 == 0) goto L2d
                r1 = r0
                com.bumptech.glide.util.pool.a$f r1 = (com.bumptech.glide.util.pool.a.f) r1
                com.bumptech.glide.util.pool.c r1 = r1.h()
                r2 = 0
                r1.b(r2)
            L2d:
                return r0
        }

        public boolean release(@androidx.annotation.NonNull T r3) {
                r2 = this;
                boolean r0 = r3 instanceof com.bumptech.glide.util.pool.a.f
                if (r0 == 0) goto Lf
                r0 = r3
                com.bumptech.glide.util.pool.a$f r0 = (com.bumptech.glide.util.pool.a.f) r0
                com.bumptech.glide.util.pool.c r0 = r0.h()
                r1 = 1
                r0.b(r1)
            Lf:
                com.bumptech.glide.util.pool.a$g<T> r0 = r2.b
                r0.a(r3)
                androidx.core.util.Pools$Pool<T> r0 = r2.c
                boolean r3 = r0.release(r3)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface f {
        @androidx.annotation.NonNull
        com.bumptech.glide.util.pool.c h();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface g<T> {
        void a(@androidx.annotation.NonNull T r1);
    }

    static {
            com.bumptech.glide.util.pool.a$a r0 = new com.bumptech.glide.util.pool.a$a
            r0.<init>()
            com.bumptech.glide.util.pool.a.c = r0
            return
    }

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    private static <T extends com.bumptech.glide.util.pool.a.f> androidx.core.util.Pools.Pool<T> a(@androidx.annotation.NonNull androidx.core.util.Pools.Pool<T> r1, @androidx.annotation.NonNull com.bumptech.glide.util.pool.a.d<T> r2) {
            com.bumptech.glide.util.pool.a$g r0 = c()
            androidx.core.util.Pools$Pool r1 = b(r1, r2, r0)
            return r1
    }

    @androidx.annotation.NonNull
    private static <T> androidx.core.util.Pools.Pool<T> b(@androidx.annotation.NonNull androidx.core.util.Pools.Pool<T> r1, @androidx.annotation.NonNull com.bumptech.glide.util.pool.a.d<T> r2, @androidx.annotation.NonNull com.bumptech.glide.util.pool.a.g<T> r3) {
            com.bumptech.glide.util.pool.a$e r0 = new com.bumptech.glide.util.pool.a$e
            r0.<init>(r1, r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    private static <T> com.bumptech.glide.util.pool.a.g<T> c() {
            com.bumptech.glide.util.pool.a$g<java.lang.Object> r0 = com.bumptech.glide.util.pool.a.c
            return r0
    }

    @androidx.annotation.NonNull
    public static <T extends com.bumptech.glide.util.pool.a.f> androidx.core.util.Pools.Pool<T> d(int r1, @androidx.annotation.NonNull com.bumptech.glide.util.pool.a.d<T> r2) {
            androidx.core.util.Pools$SimplePool r0 = new androidx.core.util.Pools$SimplePool
            r0.<init>(r1)
            androidx.core.util.Pools$Pool r1 = a(r0, r2)
            return r1
    }

    @androidx.annotation.NonNull
    public static <T extends com.bumptech.glide.util.pool.a.f> androidx.core.util.Pools.Pool<T> e(int r1, @androidx.annotation.NonNull com.bumptech.glide.util.pool.a.d<T> r2) {
            androidx.core.util.Pools$SynchronizedPool r0 = new androidx.core.util.Pools$SynchronizedPool
            r0.<init>(r1)
            androidx.core.util.Pools$Pool r1 = a(r0, r2)
            return r1
    }

    @androidx.annotation.NonNull
    public static <T> androidx.core.util.Pools.Pool<java.util.List<T>> f() {
            r0 = 20
            androidx.core.util.Pools$Pool r0 = g(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static <T> androidx.core.util.Pools.Pool<java.util.List<T>> g(int r2) {
            androidx.core.util.Pools$SynchronizedPool r0 = new androidx.core.util.Pools$SynchronizedPool
            r0.<init>(r2)
            com.bumptech.glide.util.pool.a$b r2 = new com.bumptech.glide.util.pool.a$b
            r2.<init>()
            com.bumptech.glide.util.pool.a$c r1 = new com.bumptech.glide.util.pool.a$c
            r1.<init>()
            androidx.core.util.Pools$Pool r2 = b(r0, r2, r1)
            return r2
    }
}
