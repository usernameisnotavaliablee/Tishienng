package retrofit2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class h extends retrofit2.c.a {

    @javax.annotation.Nullable
    private final java.util.concurrent.Executor a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements retrofit2.c<java.lang.Object, retrofit2.b<?>> {
        final /* synthetic */ java.lang.reflect.Type a;
        final /* synthetic */ java.util.concurrent.Executor b;
        final /* synthetic */ retrofit2.h c;

        a(retrofit2.h r1, java.lang.reflect.Type r2, java.util.concurrent.Executor r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // retrofit2.c
        public java.lang.reflect.Type a() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.a
                return r0
        }

        @Override // retrofit2.c
        public /* bridge */ /* synthetic */ retrofit2.b<?> b(retrofit2.b<java.lang.Object> r1) {
                r0 = this;
                retrofit2.b r1 = r0.c(r1)
                return r1
        }

        public retrofit2.b<java.lang.Object> c(retrofit2.b<java.lang.Object> r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.b
                if (r0 != 0) goto L5
                return r3
            L5:
                retrofit2.h$b r1 = new retrofit2.h$b
                r1.<init>(r0, r3)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> implements retrofit2.b<T> {
        final java.util.concurrent.Executor a;
        final retrofit2.b<T> b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements retrofit2.d<T> {
            final /* synthetic */ retrofit2.d a;
            final /* synthetic */ retrofit2.h.b b;

            a(retrofit2.h.b r1, retrofit2.d r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public static /* synthetic */ void c(retrofit2.h.b.a r0, retrofit2.d r1, java.lang.Throwable r2) {
                    retrofit2.h$b r0 = r0.b
                    r1.a(r0, r2)
                    return
            }

            public static /* synthetic */ void d(retrofit2.h.b.a r1, retrofit2.d r2, retrofit2.c0 r3) {
                    retrofit2.h$b r0 = r1.b
                    retrofit2.b<T> r0 = r0.b
                    boolean r0 = r0.isCanceled()
                    if (r0 == 0) goto L17
                    retrofit2.h$b r1 = r1.b
                    java.io.IOException r3 = new java.io.IOException
                    java.lang.String r0 = "Canceled"
                    r3.<init>(r0)
                    r2.a(r1, r3)
                    return
                L17:
                    retrofit2.h$b r1 = r1.b
                    r2.b(r1, r3)
                    return
            }

            @Override // retrofit2.d
            public void a(retrofit2.b<T> r3, java.lang.Throwable r4) {
                    r2 = this;
                    retrofit2.h$b r3 = r2.b
                    java.util.concurrent.Executor r3 = r3.a
                    retrofit2.d r0 = r2.a
                    retrofit2.j r1 = new retrofit2.j
                    r1.<init>(r2, r0, r4)
                    r3.execute(r1)
                    return
            }

            @Override // retrofit2.d
            public void b(retrofit2.b<T> r3, retrofit2.c0<T> r4) {
                    r2 = this;
                    retrofit2.h$b r3 = r2.b
                    java.util.concurrent.Executor r3 = r3.a
                    retrofit2.d r0 = r2.a
                    retrofit2.i r1 = new retrofit2.i
                    r1.<init>(r2, r0, r4)
                    r3.execute(r1)
                    return
            }
        }

        b(java.util.concurrent.Executor r1, retrofit2.b<T> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        @Override // retrofit2.b
        public void cancel() {
                r1 = this;
                retrofit2.b<T> r0 = r1.b
                r0.cancel()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                retrofit2.b r0 = r1.mo216clone()
                return r0
        }

        @Override // retrofit2.b
        /* renamed from: clone, reason: collision with other method in class */
        public retrofit2.b<T> mo216clone() {
                r3 = this;
                retrofit2.h$b r0 = new retrofit2.h$b
                java.util.concurrent.Executor r1 = r3.a
                retrofit2.b<T> r2 = r3.b
                retrofit2.b r2 = r2.mo216clone()
                r0.<init>(r1, r2)
                return r0
        }

        @Override // retrofit2.b
        public retrofit2.c0<T> execute() throws java.io.IOException {
                r1 = this;
                retrofit2.b<T> r0 = r1.b
                retrofit2.c0 r0 = r0.execute()
                return r0
        }

        @Override // retrofit2.b
        public boolean isCanceled() {
                r1 = this;
                retrofit2.b<T> r0 = r1.b
                boolean r0 = r0.isCanceled()
                return r0
        }

        @Override // retrofit2.b
        public boolean isExecuted() {
                r1 = this;
                retrofit2.b<T> r0 = r1.b
                boolean r0 = r0.isExecuted()
                return r0
        }

        @Override // retrofit2.b
        public void j(retrofit2.d<T> r3) {
                r2 = this;
                java.lang.String r0 = "callback == null"
                java.util.Objects.requireNonNull(r3, r0)
                retrofit2.b<T> r0 = r2.b
                retrofit2.h$b$a r1 = new retrofit2.h$b$a
                r1.<init>(r2, r3)
                r0.j(r1)
                return
        }

        @Override // retrofit2.b
        public okhttp3.Request request() {
                r1 = this;
                retrofit2.b<T> r0 = r1.b
                okhttp3.Request r0 = r0.request()
                return r0
        }

        @Override // retrofit2.b
        public okio.Timeout timeout() {
                r1 = this;
                retrofit2.b<T> r0 = r1.b
                okio.Timeout r0 = r0.timeout()
                return r0
        }
    }

    h(@javax.annotation.Nullable java.util.concurrent.Executor r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // retrofit2.c.a
    @javax.annotation.Nullable
    public retrofit2.c<?, ?> a(java.lang.reflect.Type r3, java.lang.annotation.Annotation[] r4, retrofit2.d0 r5) {
            r2 = this;
            java.lang.Class r5 = retrofit2.c.a.c(r3)
            java.lang.Class<retrofit2.b> r0 = retrofit2.b.class
            r1 = 0
            if (r5 == r0) goto La
            return r1
        La:
            boolean r5 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L26
            r5 = 0
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = retrofit2.f0.g(r5, r3)
            java.lang.Class<retrofit2.SkipCallbackExecutor> r5 = retrofit2.SkipCallbackExecutor.class
            boolean r4 = retrofit2.f0.l(r4, r5)
            if (r4 == 0) goto L1e
            goto L20
        L1e:
            java.util.concurrent.Executor r1 = r2.a
        L20:
            retrofit2.h$a r4 = new retrofit2.h$a
            r4.<init>(r2, r3, r1)
            return r4
        L26:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Call return type must be parameterized as Call<Foo> or Call<? extends Foo>"
            r3.<init>(r4)
            throw r3
    }
}
