package retrofit2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class f extends retrofit2.c.a {
    static final retrofit2.c.a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    private static final class a<R> implements retrofit2.c<R, java.util.concurrent.CompletableFuture<R>> {
        private final java.lang.reflect.Type a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
        /* renamed from: retrofit2.f$a$a, reason: collision with other inner class name */
        private class C0097a implements retrofit2.d<R> {
            private final java.util.concurrent.CompletableFuture<R> a;
            final /* synthetic */ retrofit2.f.a b;

            public C0097a(retrofit2.f.a r1, java.util.concurrent.CompletableFuture<R> r2) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>()
                    r0.a = r2
                    return
            }

            @Override // retrofit2.d
            public void a(retrofit2.b<R> r1, java.lang.Throwable r2) {
                    r0 = this;
                    java.util.concurrent.CompletableFuture<R> r1 = r0.a
                    kotlinx.coroutines.future.b.a(r1, r2)
                    return
            }

            @Override // retrofit2.d
            public void b(retrofit2.b<R> r2, retrofit2.c0<R> r3) {
                    r1 = this;
                    boolean r2 = r3.g()
                    if (r2 == 0) goto L10
                    java.util.concurrent.CompletableFuture<R> r2 = r1.a
                    java.lang.Object r3 = r3.a()
                    kotlinx.coroutines.future.a.a(r2, r3)
                    return
                L10:
                    java.util.concurrent.CompletableFuture<R> r2 = r1.a
                    retrofit2.HttpException r0 = new retrofit2.HttpException
                    r0.<init>(r3)
                    kotlinx.coroutines.future.b.a(r2, r0)
                    return
            }
        }

        a(java.lang.reflect.Type r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // retrofit2.c
        public java.lang.reflect.Type a() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.a
                return r0
        }

        @Override // retrofit2.c
        public /* bridge */ /* synthetic */ java.lang.Object b(retrofit2.b r1) {
                r0 = this;
                java.util.concurrent.CompletableFuture r1 = r0.c(r1)
                return r1
        }

        public java.util.concurrent.CompletableFuture<R> c(retrofit2.b<R> r3) {
                r2 = this;
                retrofit2.f$b r0 = new retrofit2.f$b
                r0.<init>(r3)
                retrofit2.f$a$a r1 = new retrofit2.f$a$a
                r1.<init>(r2, r0)
                r3.j(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    private static final class b<T> extends java.util.concurrent.CompletableFuture<T> {
        private final retrofit2.b<?> a;

        b(retrofit2.b<?> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean r2) {
                r1 = this;
                if (r2 == 0) goto L7
                retrofit2.b<?> r0 = r1.a
                r0.cancel()
            L7:
                boolean r2 = super.cancel(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    private static final class c<R> implements retrofit2.c<R, java.util.concurrent.CompletableFuture<retrofit2.c0<R>>> {
        private final java.lang.reflect.Type a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
        private class a implements retrofit2.d<R> {
            private final java.util.concurrent.CompletableFuture<retrofit2.c0<R>> a;
            final /* synthetic */ retrofit2.f.c b;

            public a(retrofit2.f.c r1, java.util.concurrent.CompletableFuture<retrofit2.c0<R>> r2) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>()
                    r0.a = r2
                    return
            }

            @Override // retrofit2.d
            public void a(retrofit2.b<R> r1, java.lang.Throwable r2) {
                    r0 = this;
                    java.util.concurrent.CompletableFuture<retrofit2.c0<R>> r1 = r0.a
                    kotlinx.coroutines.future.b.a(r1, r2)
                    return
            }

            @Override // retrofit2.d
            public void b(retrofit2.b<R> r1, retrofit2.c0<R> r2) {
                    r0 = this;
                    java.util.concurrent.CompletableFuture<retrofit2.c0<R>> r1 = r0.a
                    kotlinx.coroutines.future.a.a(r1, r2)
                    return
            }
        }

        c(java.lang.reflect.Type r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // retrofit2.c
        public java.lang.reflect.Type a() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.a
                return r0
        }

        @Override // retrofit2.c
        public /* bridge */ /* synthetic */ java.lang.Object b(retrofit2.b r1) {
                r0 = this;
                java.util.concurrent.CompletableFuture r1 = r0.c(r1)
                return r1
        }

        public java.util.concurrent.CompletableFuture<retrofit2.c0<R>> c(retrofit2.b<R> r3) {
                r2 = this;
                retrofit2.f$b r0 = new retrofit2.f$b
                r0.<init>(r3)
                retrofit2.f$c$a r1 = new retrofit2.f$c$a
                r1.<init>(r2, r0)
                r3.j(r1)
                return r0
        }
    }

    static {
            retrofit2.f r0 = new retrofit2.f
            r0.<init>()
            retrofit2.f.a = r0
            return
    }

    f() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // retrofit2.c.a
    @javax.annotation.Nullable
    public retrofit2.c<?, ?> a(java.lang.reflect.Type r2, java.lang.annotation.Annotation[] r3, retrofit2.d0 r4) {
            r1 = this;
            java.lang.Class r3 = retrofit2.c.a.c(r2)
            java.lang.Class r4 = retrofit2.e.a()
            if (r3 == r4) goto Lc
            r2 = 0
            return r2
        Lc:
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L3d
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            r3 = 0
            java.lang.reflect.Type r2 = retrofit2.c.a.b(r3, r2)
            java.lang.Class r4 = retrofit2.c.a.c(r2)
            java.lang.Class<retrofit2.c0> r0 = retrofit2.c0.class
            if (r4 == r0) goto L25
            retrofit2.f$a r3 = new retrofit2.f$a
            r3.<init>(r2)
            return r3
        L25:
            boolean r4 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L35
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type r2 = retrofit2.c.a.b(r3, r2)
            retrofit2.f$c r3 = new retrofit2.f$c
            r3.<init>(r2)
            return r3
        L35:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Response must be parameterized as Response<Foo> or Response<? extends Foo>"
            r2.<init>(r3)
            throw r2
        L3d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>"
            r2.<init>(r3)
            throw r2
    }
}
