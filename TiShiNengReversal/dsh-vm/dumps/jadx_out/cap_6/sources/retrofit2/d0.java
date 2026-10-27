package retrofit2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class d0 {
    private final java.util.Map<java.lang.reflect.Method, retrofit2.e0<?>> a;
    final okhttp3.Call.Factory b;
    final okhttp3.HttpUrl c;
    final java.util.List<retrofit2.g.a> d;
    final java.util.List<retrofit2.c.a> e;

    @javax.annotation.Nullable
    final java.util.concurrent.Executor f;
    final boolean g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.reflect.InvocationHandler {
        private final retrofit2.z a;
        private final java.lang.Object[] b;
        final /* synthetic */ java.lang.Class c;
        final /* synthetic */ retrofit2.d0 d;

        a(retrofit2.d0 r1, java.lang.Class r2) {
                r0 = this;
                r0.d = r1
                r0.c = r2
                r0.<init>()
                retrofit2.z r1 = retrofit2.z.g()
                r0.a = r1
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r0.b = r1
                return
        }

        @Override // java.lang.reflect.InvocationHandler
        @javax.annotation.Nullable
        public java.lang.Object invoke(java.lang.Object r3, java.lang.reflect.Method r4, @javax.annotation.Nullable java.lang.Object[] r5) throws java.lang.Throwable {
                r2 = this;
                java.lang.Class r0 = r4.getDeclaringClass()
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                if (r0 != r1) goto Ld
                java.lang.Object r3 = r4.invoke(r2, r5)
                return r3
            Ld:
                if (r5 == 0) goto L10
                goto L12
            L10:
                java.lang.Object[] r5 = r2.b
            L12:
                retrofit2.z r0 = r2.a
                boolean r0 = r0.i(r4)
                if (r0 == 0) goto L23
                retrofit2.z r0 = r2.a
                java.lang.Class r1 = r2.c
                java.lang.Object r3 = r0.h(r4, r1, r3, r5)
                return r3
            L23:
                retrofit2.d0 r3 = r2.d
                retrofit2.e0 r3 = r3.h(r4)
                java.lang.Object r3 = r3.a(r5)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b {
        private final retrofit2.z a;

        @javax.annotation.Nullable
        private okhttp3.Call.Factory b;

        @javax.annotation.Nullable
        private okhttp3.HttpUrl c;
        private final java.util.List<retrofit2.g.a> d;
        private final java.util.List<retrofit2.c.a> e;

        @javax.annotation.Nullable
        private java.util.concurrent.Executor f;
        private boolean g;

        public b() {
                r1 = this;
                retrofit2.z r0 = retrofit2.z.g()
                r1.<init>(r0)
                return
        }

        b(retrofit2.d0 r5) {
                r4 = this;
                r4.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.d = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.e = r0
                retrofit2.z r0 = retrofit2.z.g()
                r4.a = r0
                okhttp3.Call$Factory r1 = r5.b
                r4.b = r1
                okhttp3.HttpUrl r1 = r5.c
                r4.c = r1
                java.util.List<retrofit2.g$a> r1 = r5.d
                int r1 = r1.size()
                int r0 = r0.e()
                int r1 = r1 - r0
                r0 = 1
            L2b:
                if (r0 >= r1) goto L3d
                java.util.List<retrofit2.g$a> r2 = r4.d
                java.util.List<retrofit2.g$a> r3 = r5.d
                java.lang.Object r3 = r3.get(r0)
                retrofit2.g$a r3 = (retrofit2.g.a) r3
                r2.add(r3)
                int r0 = r0 + 1
                goto L2b
            L3d:
                java.util.List<retrofit2.c$a> r0 = r5.e
                int r0 = r0.size()
                retrofit2.z r1 = r4.a
                int r1 = r1.b()
                int r0 = r0 - r1
                r1 = 0
            L4b:
                if (r1 >= r0) goto L5d
                java.util.List<retrofit2.c$a> r2 = r4.e
                java.util.List<retrofit2.c$a> r3 = r5.e
                java.lang.Object r3 = r3.get(r1)
                retrofit2.c$a r3 = (retrofit2.c.a) r3
                r2.add(r3)
                int r1 = r1 + 1
                goto L4b
            L5d:
                java.util.concurrent.Executor r0 = r5.f
                r4.f = r0
                boolean r5 = r5.g
                r4.g = r5
                return
        }

        b(retrofit2.z r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.d = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.e = r0
                r1.a = r2
                return
        }

        public retrofit2.d0.b a(retrofit2.c.a r3) {
                r2 = this;
                java.util.List<retrofit2.c$a> r0 = r2.e
                java.lang.String r1 = "factory == null"
                java.util.Objects.requireNonNull(r3, r1)
                r0.add(r3)
                return r2
        }

        public retrofit2.d0.b b(retrofit2.g.a r3) {
                r2 = this;
                java.util.List<retrofit2.g$a> r0 = r2.d
                java.lang.String r1 = "factory == null"
                java.util.Objects.requireNonNull(r3, r1)
                r0.add(r3)
                return r2
        }

        public retrofit2.d0.b c(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "baseUrl == null"
                java.util.Objects.requireNonNull(r2, r0)
                okhttp3.HttpUrl r2 = okhttp3.HttpUrl.get(r2)
                retrofit2.d0$b r2 = r1.e(r2)
                return r2
        }

        public retrofit2.d0.b d(java.net.URL r2) {
                r1 = this;
                java.lang.String r0 = "baseUrl == null"
                java.util.Objects.requireNonNull(r2, r0)
                java.lang.String r2 = r2.toString()
                okhttp3.HttpUrl r2 = okhttp3.HttpUrl.get(r2)
                retrofit2.d0$b r2 = r1.e(r2)
                return r2
        }

        public retrofit2.d0.b e(okhttp3.HttpUrl r4) {
                r3 = this;
                java.lang.String r0 = "baseUrl == null"
                java.util.Objects.requireNonNull(r4, r0)
                java.util.List r0 = r4.pathSegments()
                int r1 = r0.size()
                int r1 = r1 + (-1)
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r1 = ""
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L1e
                r3.c = r4
                return r3
            L1e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "baseUrl must end in /: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        public retrofit2.d0 f() {
                r8 = this;
                okhttp3.HttpUrl r0 = r8.c
                if (r0 == 0) goto L67
                okhttp3.Call$Factory r0 = r8.b
                if (r0 != 0) goto Ld
                okhttp3.OkHttpClient r0 = new okhttp3.OkHttpClient
                r0.<init>()
            Ld:
                r2 = r0
                java.util.concurrent.Executor r0 = r8.f
                if (r0 != 0) goto L18
                retrofit2.z r0 = r8.a
                java.util.concurrent.Executor r0 = r0.c()
            L18:
                r6 = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List<retrofit2.c$a> r1 = r8.e
                r0.<init>(r1)
                retrofit2.z r1 = r8.a
                java.util.List r1 = r1.a(r6)
                r0.addAll(r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.List<retrofit2.g$a> r3 = r8.d
                int r3 = r3.size()
                int r3 = r3 + 1
                retrofit2.z r4 = r8.a
                int r4 = r4.e()
                int r3 = r3 + r4
                r1.<init>(r3)
                retrofit2.a r3 = new retrofit2.a
                r3.<init>()
                r1.add(r3)
                java.util.List<retrofit2.g$a> r3 = r8.d
                r1.addAll(r3)
                retrofit2.z r3 = r8.a
                java.util.List r3 = r3.d()
                r1.addAll(r3)
                r3 = r1
                retrofit2.d0 r1 = new retrofit2.d0
                r4 = r3
                okhttp3.HttpUrl r3 = r8.c
                java.util.List r4 = java.util.Collections.unmodifiableList(r4)
                java.util.List r5 = java.util.Collections.unmodifiableList(r0)
                boolean r7 = r8.g
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r1
            L67:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Base URL required."
                r0.<init>(r1)
                throw r0
        }

        public java.util.List<retrofit2.c.a> g() {
                r1 = this;
                java.util.List<retrofit2.c$a> r0 = r1.e
                return r0
        }

        public retrofit2.d0.b h(okhttp3.Call.Factory r2) {
                r1 = this;
                java.lang.String r0 = "factory == null"
                java.util.Objects.requireNonNull(r2, r0)
                okhttp3.Call$Factory r2 = (okhttp3.Call.Factory) r2
                r1.b = r2
                return r1
        }

        public retrofit2.d0.b i(java.util.concurrent.Executor r2) {
                r1 = this;
                java.lang.String r0 = "executor == null"
                java.util.Objects.requireNonNull(r2, r0)
                java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
                r1.f = r2
                return r1
        }

        public retrofit2.d0.b j(okhttp3.OkHttpClient r2) {
                r1 = this;
                java.lang.String r0 = "client == null"
                java.util.Objects.requireNonNull(r2, r0)
                okhttp3.Call$Factory r2 = (okhttp3.Call.Factory) r2
                retrofit2.d0$b r2 = r1.h(r2)
                return r2
        }

        public java.util.List<retrofit2.g.a> k() {
                r1 = this;
                java.util.List<retrofit2.g$a> r0 = r1.d
                return r0
        }

        public retrofit2.d0.b l(boolean r1) {
                r0 = this;
                r0.g = r1
                return r0
        }
    }

    d0(okhttp3.Call.Factory r2, okhttp3.HttpUrl r3, java.util.List<retrofit2.g.a> r4, java.util.List<retrofit2.c.a> r5, @javax.annotation.Nullable java.util.concurrent.Executor r6, boolean r7) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.a = r0
            r1.b = r2
            r1.c = r3
            r1.d = r4
            r1.e = r5
            r1.f = r6
            r1.g = r7
            return
    }

    private void p(java.lang.Class<?> r6) {
            r5 = this;
            boolean r0 = r6.isInterface()
            if (r0 == 0) goto L79
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 1
            r0.<init>(r1)
            r0.add(r6)
        Lf:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L50
            java.lang.Object r1 = r0.removeFirst()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.reflect.TypeVariable[] r2 = r1.getTypeParameters()
            int r2 = r2.length
            if (r2 == 0) goto L48
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Type parameters are unsupported on "
            r0.<init>(r2)
            java.lang.String r2 = r1.getName()
            r0.append(r2)
            if (r1 == r6) goto L3e
            java.lang.String r1 = " which is an interface of "
            r0.append(r1)
            java.lang.String r6 = r6.getName()
            r0.append(r6)
        L3e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L48:
            java.lang.Class[] r1 = r1.getInterfaces()
            java.util.Collections.addAll(r0, r1)
            goto Lf
        L50:
            boolean r0 = r5.g
            if (r0 == 0) goto L78
            retrofit2.z r0 = retrofit2.z.g()
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            int r1 = r6.length
            r2 = 0
        L5e:
            if (r2 >= r1) goto L78
            r3 = r6[r2]
            boolean r4 = r0.i(r3)
            if (r4 != 0) goto L75
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto L75
            r5.h(r3)
        L75:
            int r2 = r2 + 1
            goto L5e
        L78:
            return
        L79:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "API declarations must be interfaces."
            r6.<init>(r0)
            throw r6
    }

    public okhttp3.HttpUrl a() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.c
            return r0
    }

    public retrofit2.c<?, ?> b(java.lang.reflect.Type r2, java.lang.annotation.Annotation[] r3) {
            r1 = this;
            r0 = 0
            retrofit2.c r2 = r1.j(r0, r2, r3)
            return r2
    }

    public java.util.List<retrofit2.c.a> c() {
            r1 = this;
            java.util.List<retrofit2.c$a> r0 = r1.e
            return r0
    }

    public okhttp3.Call.Factory d() {
            r1 = this;
            okhttp3.Call$Factory r0 = r1.b
            return r0
    }

    @javax.annotation.Nullable
    public java.util.concurrent.Executor e() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.f
            return r0
    }

    public java.util.List<retrofit2.g.a> f() {
            r1 = this;
            java.util.List<retrofit2.g$a> r0 = r1.d
            return r0
    }

    public <T> T g(java.lang.Class<T> r4) {
            r3 = this;
            r3.p(r4)
            java.lang.ClassLoader r0 = r4.getClassLoader()
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            r1[r2] = r4
            retrofit2.d0$a r2 = new retrofit2.d0$a
            r2.<init>(r3, r4)
            java.lang.Object r4 = java.lang.reflect.Proxy.newProxyInstance(r0, r1, r2)
            return r4
    }

    retrofit2.e0<?> h(java.lang.reflect.Method r4) {
            r3 = this;
            java.util.Map<java.lang.reflect.Method, retrofit2.e0<?>> r0 = r3.a
            java.lang.Object r0 = r0.get(r4)
            retrofit2.e0 r0 = (retrofit2.e0) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.util.Map<java.lang.reflect.Method, retrofit2.e0<?>> r0 = r3.a
            monitor-enter(r0)
            java.util.Map<java.lang.reflect.Method, retrofit2.e0<?>> r1 = r3.a     // Catch: java.lang.Throwable -> L22
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L22
            retrofit2.e0 r1 = (retrofit2.e0) r1     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L24
            retrofit2.e0 r1 = retrofit2.e0.b(r3, r4)     // Catch: java.lang.Throwable -> L22
            java.util.Map<java.lang.reflect.Method, retrofit2.e0<?>> r2 = r3.a     // Catch: java.lang.Throwable -> L22
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r4 = move-exception
            goto L26
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return r1
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r4
    }

    public retrofit2.d0.b i() {
            r1 = this;
            retrofit2.d0$b r0 = new retrofit2.d0$b
            r0.<init>(r1)
            return r0
    }

    public retrofit2.c<?, ?> j(@javax.annotation.Nullable retrofit2.c.a r5, java.lang.reflect.Type r6, java.lang.annotation.Annotation[] r7) {
            r4 = this;
            java.lang.String r0 = "returnType == null"
            java.util.Objects.requireNonNull(r6, r0)
            java.lang.String r0 = "annotations == null"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.List<retrofit2.c$a> r0 = r4.e
            int r0 = r0.indexOf(r5)
            int r0 = r0 + 1
            java.util.List<retrofit2.c$a> r1 = r4.e
            int r1 = r1.size()
            r2 = r0
        L19:
            if (r2 >= r1) goto L2d
            java.util.List<retrofit2.c$a> r3 = r4.e
            java.lang.Object r3 = r3.get(r2)
            retrofit2.c$a r3 = (retrofit2.c.a) r3
            retrofit2.c r3 = r3.a(r6, r7, r4)
            if (r3 == 0) goto L2a
            return r3
        L2a:
            int r2 = r2 + 1
            goto L19
        L2d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not locate call adapter for "
            r7.<init>(r1)
            r7.append(r6)
            java.lang.String r6 = ".\n"
            r7.append(r6)
            java.lang.String r6 = "\n   * "
            if (r5 == 0) goto L66
            java.lang.String r5 = "  Skipped:"
            r7.append(r5)
            r5 = 0
        L46:
            if (r5 >= r0) goto L61
            r7.append(r6)
            java.util.List<retrofit2.c$a> r1 = r4.e
            java.lang.Object r1 = r1.get(r5)
            retrofit2.c$a r1 = (retrofit2.c.a) r1
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r7.append(r1)
            int r5 = r5 + 1
            goto L46
        L61:
            r5 = 10
            r7.append(r5)
        L66:
            java.lang.String r5 = "  Tried:"
            r7.append(r5)
            java.util.List<retrofit2.c$a> r5 = r4.e
            int r5 = r5.size()
        L71:
            if (r0 >= r5) goto L8c
            r7.append(r6)
            java.util.List<retrofit2.c$a> r1 = r4.e
            java.lang.Object r1 = r1.get(r0)
            retrofit2.c$a r1 = (retrofit2.c.a) r1
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r7.append(r1)
            int r0 = r0 + 1
            goto L71
        L8c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
    }

    public <T> retrofit2.g<T, okhttp3.RequestBody> k(@javax.annotation.Nullable retrofit2.g.a r5, java.lang.reflect.Type r6, java.lang.annotation.Annotation[] r7, java.lang.annotation.Annotation[] r8) {
            r4 = this;
            java.lang.String r0 = "type == null"
            java.util.Objects.requireNonNull(r6, r0)
            java.lang.String r0 = "parameterAnnotations == null"
            java.util.Objects.requireNonNull(r7, r0)
            java.lang.String r0 = "methodAnnotations == null"
            java.util.Objects.requireNonNull(r8, r0)
            java.util.List<retrofit2.g$a> r0 = r4.d
            int r0 = r0.indexOf(r5)
            int r0 = r0 + 1
            java.util.List<retrofit2.g$a> r1 = r4.d
            int r1 = r1.size()
            r2 = r0
        L1e:
            if (r2 >= r1) goto L32
            java.util.List<retrofit2.g$a> r3 = r4.d
            java.lang.Object r3 = r3.get(r2)
            retrofit2.g$a r3 = (retrofit2.g.a) r3
            retrofit2.g r3 = r3.requestBodyConverter(r6, r7, r8, r4)
            if (r3 == 0) goto L2f
            return r3
        L2f:
            int r2 = r2 + 1
            goto L1e
        L32:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Could not locate RequestBody converter for "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = ".\n"
            r7.append(r6)
            java.lang.String r6 = "\n   * "
            if (r5 == 0) goto L6b
            java.lang.String r5 = "  Skipped:"
            r7.append(r5)
            r5 = 0
        L4b:
            if (r5 >= r0) goto L66
            r7.append(r6)
            java.util.List<retrofit2.g$a> r8 = r4.d
            java.lang.Object r8 = r8.get(r5)
            retrofit2.g$a r8 = (retrofit2.g.a) r8
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            r7.append(r8)
            int r5 = r5 + 1
            goto L4b
        L66:
            r5 = 10
            r7.append(r5)
        L6b:
            java.lang.String r5 = "  Tried:"
            r7.append(r5)
            java.util.List<retrofit2.g$a> r5 = r4.d
            int r5 = r5.size()
        L76:
            if (r0 >= r5) goto L91
            r7.append(r6)
            java.util.List<retrofit2.g$a> r8 = r4.d
            java.lang.Object r8 = r8.get(r0)
            retrofit2.g$a r8 = (retrofit2.g.a) r8
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            r7.append(r8)
            int r0 = r0 + 1
            goto L76
        L91:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
    }

    public <T> retrofit2.g<okhttp3.ResponseBody, T> l(@javax.annotation.Nullable retrofit2.g.a r5, java.lang.reflect.Type r6, java.lang.annotation.Annotation[] r7) {
            r4 = this;
            java.lang.String r0 = "type == null"
            java.util.Objects.requireNonNull(r6, r0)
            java.lang.String r0 = "annotations == null"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.List<retrofit2.g$a> r0 = r4.d
            int r0 = r0.indexOf(r5)
            int r0 = r0 + 1
            java.util.List<retrofit2.g$a> r1 = r4.d
            int r1 = r1.size()
            r2 = r0
        L19:
            if (r2 >= r1) goto L2d
            java.util.List<retrofit2.g$a> r3 = r4.d
            java.lang.Object r3 = r3.get(r2)
            retrofit2.g$a r3 = (retrofit2.g.a) r3
            retrofit2.g r3 = r3.responseBodyConverter(r6, r7, r4)
            if (r3 == 0) goto L2a
            return r3
        L2a:
            int r2 = r2 + 1
            goto L19
        L2d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not locate ResponseBody converter for "
            r7.<init>(r1)
            r7.append(r6)
            java.lang.String r6 = ".\n"
            r7.append(r6)
            java.lang.String r6 = "\n   * "
            if (r5 == 0) goto L66
            java.lang.String r5 = "  Skipped:"
            r7.append(r5)
            r5 = 0
        L46:
            if (r5 >= r0) goto L61
            r7.append(r6)
            java.util.List<retrofit2.g$a> r1 = r4.d
            java.lang.Object r1 = r1.get(r5)
            retrofit2.g$a r1 = (retrofit2.g.a) r1
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r7.append(r1)
            int r5 = r5 + 1
            goto L46
        L61:
            r5 = 10
            r7.append(r5)
        L66:
            java.lang.String r5 = "  Tried:"
            r7.append(r5)
            java.util.List<retrofit2.g$a> r5 = r4.d
            int r5 = r5.size()
        L71:
            if (r0 >= r5) goto L8c
            r7.append(r6)
            java.util.List<retrofit2.g$a> r1 = r4.d
            java.lang.Object r1 = r1.get(r0)
            retrofit2.g$a r1 = (retrofit2.g.a) r1
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r7.append(r1)
            int r0 = r0 + 1
            goto L71
        L8c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
    }

    public <T> retrofit2.g<T, okhttp3.RequestBody> m(java.lang.reflect.Type r2, java.lang.annotation.Annotation[] r3, java.lang.annotation.Annotation[] r4) {
            r1 = this;
            r0 = 0
            retrofit2.g r2 = r1.k(r0, r2, r3, r4)
            return r2
    }

    public <T> retrofit2.g<okhttp3.ResponseBody, T> n(java.lang.reflect.Type r2, java.lang.annotation.Annotation[] r3) {
            r1 = this;
            r0 = 0
            retrofit2.g r2 = r1.l(r0, r2, r3)
            return r2
    }

    public <T> retrofit2.g<T, java.lang.String> o(java.lang.reflect.Type r4, java.lang.annotation.Annotation[] r5) {
            r3 = this;
            java.lang.String r0 = "type == null"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.String r0 = "annotations == null"
            java.util.Objects.requireNonNull(r5, r0)
            java.util.List<retrofit2.g$a> r0 = r3.d
            int r0 = r0.size()
            r1 = 0
        L11:
            if (r1 >= r0) goto L25
            java.util.List<retrofit2.g$a> r2 = r3.d
            java.lang.Object r2 = r2.get(r1)
            retrofit2.g$a r2 = (retrofit2.g.a) r2
            retrofit2.g r2 = r2.stringConverter(r4, r5, r3)
            if (r2 == 0) goto L22
            return r2
        L22:
            int r1 = r1 + 1
            goto L11
        L25:
            retrofit2.a$d r4 = retrofit2.a.d.a
            return r4
    }
}
