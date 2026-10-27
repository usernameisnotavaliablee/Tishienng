package retrofit2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class b0 {
    private final java.lang.reflect.Method a;
    private final okhttp3.HttpUrl b;
    final java.lang.String c;

    @javax.annotation.Nullable
    private final java.lang.String d;

    @javax.annotation.Nullable
    private final okhttp3.Headers e;

    @javax.annotation.Nullable
    private final okhttp3.MediaType f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final retrofit2.r<?>[] j;
    final boolean k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a {
        private static final java.lang.String x = "[a-zA-Z][a-zA-Z0-9_-]*";
        private static final java.util.regex.Pattern y = null;
        private static final java.util.regex.Pattern z = null;
        final retrofit2.d0 a;
        final java.lang.reflect.Method b;
        final java.lang.annotation.Annotation[] c;
        final java.lang.annotation.Annotation[][] d;
        final java.lang.reflect.Type[] e;
        boolean f;
        boolean g;
        boolean h;
        boolean i;
        boolean j;
        boolean k;
        boolean l;
        boolean m;

        @javax.annotation.Nullable
        java.lang.String n;
        boolean o;
        boolean p;

        /* renamed from: q, reason: collision with root package name */
        boolean f72q;

        @javax.annotation.Nullable
        java.lang.String r;

        @javax.annotation.Nullable
        okhttp3.Headers s;

        @javax.annotation.Nullable
        okhttp3.MediaType t;

        @javax.annotation.Nullable
        java.util.Set<java.lang.String> u;

        @javax.annotation.Nullable
        retrofit2.r<?>[] v;
        boolean w;

        static {
                java.lang.String r0 = "\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                retrofit2.b0.a.y = r0
                java.lang.String r0 = "[a-zA-Z][a-zA-Z0-9_-]*"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                retrofit2.b0.a.z = r0
                return
        }

        a(retrofit2.d0 r1, java.lang.reflect.Method r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                java.lang.annotation.Annotation[] r1 = r2.getAnnotations()
                r0.c = r1
                java.lang.reflect.Type[] r1 = r2.getGenericParameterTypes()
                r0.e = r1
                java.lang.annotation.Annotation[][] r1 = r2.getParameterAnnotations()
                r0.d = r1
                return
        }

        private static java.lang.Class<?> a(java.lang.Class<?> r1) {
                java.lang.Class r0 = java.lang.Boolean.TYPE
                if (r0 != r1) goto L7
                java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                return r1
            L7:
                java.lang.Class r0 = java.lang.Byte.TYPE
                if (r0 != r1) goto Le
                java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
                return r1
            Le:
                java.lang.Class r0 = java.lang.Character.TYPE
                if (r0 != r1) goto L15
                java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
                return r1
            L15:
                java.lang.Class r0 = java.lang.Double.TYPE
                if (r0 != r1) goto L1c
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                return r1
            L1c:
                java.lang.Class r0 = java.lang.Float.TYPE
                if (r0 != r1) goto L23
                java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
                return r1
            L23:
                java.lang.Class r0 = java.lang.Integer.TYPE
                if (r0 != r1) goto L2a
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                return r1
            L2a:
                java.lang.Class r0 = java.lang.Long.TYPE
                if (r0 != r1) goto L31
                java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
                return r1
            L31:
                java.lang.Class r0 = java.lang.Short.TYPE
                if (r0 != r1) goto L37
                java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            L37:
                return r1
        }

        private okhttp3.Headers c(java.lang.String[] r9) {
                r8 = this;
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
                r0.<init>()
                int r1 = r9.length
                r2 = 0
                r3 = 0
            L8:
                if (r3 >= r1) goto L5d
                r4 = r9[r3]
                r5 = 58
                int r5 = r4.indexOf(r5)
                r6 = -1
                r7 = 1
                if (r5 == r6) goto L50
                if (r5 == 0) goto L50
                int r6 = r4.length()
                int r6 = r6 - r7
                if (r5 == r6) goto L50
                java.lang.String r6 = r4.substring(r2, r5)
                int r5 = r5 + 1
                java.lang.String r4 = r4.substring(r5)
                java.lang.String r4 = r4.trim()
                java.lang.String r5 = "Content-Type"
                boolean r5 = r5.equalsIgnoreCase(r6)
                if (r5 == 0) goto L4a
                okhttp3.MediaType r5 = okhttp3.MediaType.get(r4)     // Catch: java.lang.IllegalArgumentException -> L3c
                r8.t = r5     // Catch: java.lang.IllegalArgumentException -> L3c
                goto L4d
            L3c:
                r9 = move-exception
                java.lang.reflect.Method r0 = r8.b
                java.lang.Object[] r1 = new java.lang.Object[r7]
                r1[r2] = r4
                java.lang.String r2 = "Malformed content type: %s"
                java.lang.RuntimeException r9 = retrofit2.f0.n(r0, r9, r2, r1)
                throw r9
            L4a:
                r0.add(r6, r4)
            L4d:
                int r3 = r3 + 1
                goto L8
            L50:
                java.lang.reflect.Method r9 = r8.b
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r2] = r4
                java.lang.String r1 = "@Headers value must be in the form \"Name: Value\". Found: \"%s\""
                java.lang.RuntimeException r9 = retrofit2.f0.m(r9, r1, r0)
                throw r9
            L5d:
                okhttp3.Headers r9 = r0.build()
                return r9
        }

        private void d(java.lang.String r4, java.lang.String r5, boolean r6) {
                r3 = this;
                java.lang.String r0 = r3.n
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L49
                r3.n = r4
                r3.o = r6
                boolean r4 = r5.isEmpty()
                if (r4 == 0) goto L11
                return
            L11:
                r4 = 63
                int r4 = r5.indexOf(r4)
                r6 = -1
                if (r4 == r6) goto L40
                int r6 = r5.length()
                int r6 = r6 - r2
                if (r4 >= r6) goto L40
                int r4 = r4 + r2
                java.lang.String r4 = r5.substring(r4)
                java.util.regex.Pattern r6 = retrofit2.b0.a.y
                java.util.regex.Matcher r6 = r6.matcher(r4)
                boolean r6 = r6.find()
                if (r6 != 0) goto L33
                goto L40
            L33:
                java.lang.reflect.Method r5 = r3.b
                java.lang.Object[] r6 = new java.lang.Object[r2]
                r6[r1] = r4
                java.lang.String r4 = "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query."
                java.lang.RuntimeException r4 = retrofit2.f0.m(r5, r4, r6)
                throw r4
            L40:
                r3.r = r5
                java.util.Set r4 = h(r5)
                r3.u = r4
                return
            L49:
                java.lang.reflect.Method r5 = r3.b
                r6 = 2
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r6[r1] = r0
                r6[r2] = r4
                java.lang.String r4 = "Only one HTTP method is allowed. Found: %s and %s."
                java.lang.RuntimeException r4 = retrofit2.f0.m(r5, r4, r6)
                throw r4
        }

        private void e(java.lang.annotation.Annotation r5) {
                r4 = this;
                boolean r0 = r5 instanceof retrofit2.http.DELETE
                r1 = 0
                if (r0 == 0) goto L11
                retrofit2.http.DELETE r5 = (retrofit2.http.DELETE) r5
                java.lang.String r5 = r5.value()
                java.lang.String r0 = "DELETE"
                r4.d(r0, r5, r1)
                return
            L11:
                boolean r0 = r5 instanceof retrofit2.http.GET
                if (r0 == 0) goto L21
                retrofit2.http.GET r5 = (retrofit2.http.GET) r5
                java.lang.String r5 = r5.value()
                java.lang.String r0 = "GET"
                r4.d(r0, r5, r1)
                return
            L21:
                boolean r0 = r5 instanceof retrofit2.http.HEAD
                if (r0 == 0) goto L31
                retrofit2.http.HEAD r5 = (retrofit2.http.HEAD) r5
                java.lang.String r5 = r5.value()
                java.lang.String r0 = "HEAD"
                r4.d(r0, r5, r1)
                return
            L31:
                boolean r0 = r5 instanceof retrofit2.http.PATCH
                r2 = 1
                if (r0 == 0) goto L42
                retrofit2.http.PATCH r5 = (retrofit2.http.PATCH) r5
                java.lang.String r5 = r5.value()
                java.lang.String r0 = "PATCH"
                r4.d(r0, r5, r2)
                return
            L42:
                boolean r0 = r5 instanceof retrofit2.http.POST
                if (r0 == 0) goto L52
                retrofit2.http.POST r5 = (retrofit2.http.POST) r5
                java.lang.String r5 = r5.value()
                java.lang.String r0 = "POST"
                r4.d(r0, r5, r2)
                return
            L52:
                boolean r0 = r5 instanceof retrofit2.http.PUT
                if (r0 == 0) goto L62
                retrofit2.http.PUT r5 = (retrofit2.http.PUT) r5
                java.lang.String r5 = r5.value()
                java.lang.String r0 = "PUT"
                r4.d(r0, r5, r2)
                return
            L62:
                boolean r0 = r5 instanceof retrofit2.http.OPTIONS
                if (r0 == 0) goto L72
                retrofit2.http.OPTIONS r5 = (retrofit2.http.OPTIONS) r5
                java.lang.String r5 = r5.value()
                java.lang.String r0 = "OPTIONS"
                r4.d(r0, r5, r1)
                return
            L72:
                boolean r0 = r5 instanceof retrofit2.http.HTTP
                if (r0 == 0) goto L88
                retrofit2.http.HTTP r5 = (retrofit2.http.HTTP) r5
                java.lang.String r0 = r5.method()
                java.lang.String r1 = r5.path()
                boolean r5 = r5.hasBody()
                r4.d(r0, r1, r5)
                return
            L88:
                boolean r0 = r5 instanceof retrofit2.http.Headers
                if (r0 == 0) goto La7
                retrofit2.http.Headers r5 = (retrofit2.http.Headers) r5
                java.lang.String[] r5 = r5.value()
                int r0 = r5.length
                if (r0 == 0) goto L9c
                okhttp3.Headers r5 = r4.c(r5)
                r4.s = r5
                return
            L9c:
                java.lang.reflect.Method r5 = r4.b
                java.lang.String r0 = "@Headers annotation is empty."
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.RuntimeException r5 = retrofit2.f0.m(r5, r0, r1)
                throw r5
            La7:
                boolean r0 = r5 instanceof retrofit2.http.Multipart
                java.lang.String r3 = "Only one encoding annotation is allowed."
                if (r0 == 0) goto Lbd
                boolean r5 = r4.p
                if (r5 != 0) goto Lb4
                r4.f72q = r2
                return
            Lb4:
                java.lang.reflect.Method r5 = r4.b
                java.lang.Object[] r0 = new java.lang.Object[r1]
                java.lang.RuntimeException r5 = retrofit2.f0.m(r5, r3, r0)
                throw r5
            Lbd:
                boolean r5 = r5 instanceof retrofit2.http.FormUrlEncoded
                if (r5 == 0) goto Ld1
                boolean r5 = r4.f72q
                if (r5 != 0) goto Lc8
                r4.p = r2
                return
            Lc8:
                java.lang.reflect.Method r5 = r4.b
                java.lang.Object[] r0 = new java.lang.Object[r1]
                java.lang.RuntimeException r5 = retrofit2.f0.m(r5, r3, r0)
                throw r5
            Ld1:
                return
        }

        @javax.annotation.Nullable
        private retrofit2.r<?> f(int r7, java.lang.reflect.Type r8, @javax.annotation.Nullable java.lang.annotation.Annotation[] r9, boolean r10) {
                r6 = this;
                r0 = 0
                r1 = 0
                if (r9 == 0) goto L23
                int r2 = r9.length
                r4 = r1
                r3 = 0
            L7:
                if (r3 >= r2) goto L24
                r5 = r9[r3]
                retrofit2.r r5 = r6.g(r7, r8, r9, r5)
                if (r5 != 0) goto L12
                goto L15
            L12:
                if (r4 != 0) goto L18
                r4 = r5
            L15:
                int r3 = r3 + 1
                goto L7
            L18:
                java.lang.reflect.Method r8 = r6.b
                java.lang.String r9 = "Multiple Retrofit annotations found, only one allowed."
                java.lang.Object[] r10 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.f0.o(r8, r7, r9, r10)
                throw r7
            L23:
                r4 = r1
            L24:
                if (r4 != 0) goto L3f
                if (r10 == 0) goto L34
                java.lang.Class r8 = retrofit2.f0.h(r8)     // Catch: java.lang.NoClassDefFoundError -> L34
                java.lang.Class<kotlin.coroutines.e> r9 = kotlin.coroutines.e.class
                if (r8 != r9) goto L34
                r8 = 1
                r6.w = r8     // Catch: java.lang.NoClassDefFoundError -> L34
                return r1
            L34:
                java.lang.reflect.Method r8 = r6.b
                java.lang.String r9 = "No Retrofit annotation found."
                java.lang.Object[] r10 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.f0.o(r8, r7, r9, r10)
                throw r7
            L3f:
                return r4
        }

        @javax.annotation.Nullable
        private retrofit2.r<?> g(int r11, java.lang.reflect.Type r12, java.lang.annotation.Annotation[] r13, java.lang.annotation.Annotation r14) {
                r10 = this;
                boolean r0 = r14 instanceof retrofit2.http.Url
                java.lang.String r1 = "@Path parameters may not be used with @Url."
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r3 = 1
                r4 = 0
                if (r0 == 0) goto L9b
                r10.j(r11, r12)
                boolean r13 = r10.m
                if (r13 != 0) goto L90
                boolean r13 = r10.i
                if (r13 != 0) goto L87
                boolean r13 = r10.j
                if (r13 != 0) goto L7c
                boolean r13 = r10.k
                if (r13 != 0) goto L71
                boolean r13 = r10.l
                if (r13 != 0) goto L66
                java.lang.String r13 = r10.r
                if (r13 != 0) goto L57
                r10.m = r3
                java.lang.Class<okhttp3.HttpUrl> r13 = okhttp3.HttpUrl.class
                if (r12 == r13) goto L4f
                if (r12 == r2) goto L4f
                java.lang.Class<java.net.URI> r13 = java.net.URI.class
                if (r12 == r13) goto L4f
                boolean r13 = r12 instanceof java.lang.Class
                if (r13 == 0) goto L44
                java.lang.Class r12 = (java.lang.Class) r12
                java.lang.String r12 = r12.getName()
                java.lang.String r13 = "android.net.Uri"
                boolean r12 = r13.equals(r12)
                if (r12 == 0) goto L44
                goto L4f
            L44:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L4f:
                retrofit2.r$p r12 = new retrofit2.r$p
                java.lang.reflect.Method r13 = r10.b
                r12.<init>(r13, r11)
                return r12
            L57:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = r10.n
                java.lang.Object[] r14 = new java.lang.Object[r3]
                r14[r4] = r13
                java.lang.String r13 = "@Url cannot be used with @%s URL"
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L66:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = "A @Url parameter must not come after a @QueryMap."
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L71:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = "A @Url parameter must not come after a @QueryName."
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L7c:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = "A @Url parameter must not come after a @Query."
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L87:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r1, r13)
                throw r11
            L90:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = "Multiple @Url method annotations found."
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L9b:
                boolean r0 = r14 instanceof retrofit2.http.Path
                if (r0 == 0) goto L10d
                r10.j(r11, r12)
                boolean r0 = r10.j
                if (r0 != 0) goto L102
                boolean r0 = r10.k
                if (r0 != 0) goto Lf7
                boolean r0 = r10.l
                if (r0 != 0) goto Lec
                boolean r0 = r10.m
                if (r0 != 0) goto Le3
                java.lang.String r0 = r10.r
                if (r0 == 0) goto Ld4
                r10.i = r3
                retrofit2.http.Path r14 = (retrofit2.http.Path) r14
                java.lang.String r3 = r14.value()
                r10.i(r11, r3)
                retrofit2.d0 r0 = r10.a
                retrofit2.g r4 = r0.o(r12, r13)
                retrofit2.r$k r0 = new retrofit2.r$k
                java.lang.reflect.Method r1 = r10.b
                boolean r5 = r14.encoded()
                r2 = r11
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
            Ld4:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = r10.n
                java.lang.Object[] r14 = new java.lang.Object[r3]
                r14[r4] = r13
                java.lang.String r13 = "@Path can only be used with relative url on @%s"
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            Le3:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r1, r13)
                throw r11
            Lec:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = "A @Path parameter must not come after a @QueryMap."
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            Lf7:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = "A @Path parameter must not come after a @QueryName."
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L102:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = "A @Path parameter must not come after a @Query."
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L10d:
                boolean r0 = r14 instanceof retrofit2.http.Query
                java.lang.String r1 = "<String>)"
                java.lang.String r5 = " must include generic type (e.g., "
                java.lang.Class<java.lang.Iterable> r6 = java.lang.Iterable.class
                if (r0 == 0) goto L19a
                r10.j(r11, r12)
                retrofit2.http.Query r14 = (retrofit2.http.Query) r14
                java.lang.String r0 = r14.value()
                boolean r14 = r14.encoded()
                java.lang.Class r2 = retrofit2.f0.h(r12)
                r10.j = r3
                boolean r3 = r6.isAssignableFrom(r2)
                if (r3 == 0) goto L170
                boolean r3 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r3 == 0) goto L14a
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r11 = retrofit2.f0.g(r4, r12)
                retrofit2.d0 r12 = r10.a
                retrofit2.g r11 = r12.o(r11, r13)
                retrofit2.r$l r12 = new retrofit2.r$l
                r12.<init>(r0, r11, r14)
                retrofit2.r r11 = r12.c()
                return r11
            L14a:
                java.lang.reflect.Method r12 = r10.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r2.getSimpleName()
                r13.append(r14)
                r13.append(r5)
                java.lang.String r14 = r2.getSimpleName()
                r13.append(r14)
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L170:
                boolean r11 = r2.isArray()
                if (r11 == 0) goto L18e
                java.lang.Class r11 = r2.getComponentType()
                java.lang.Class r11 = a(r11)
                retrofit2.d0 r12 = r10.a
                retrofit2.g r11 = r12.o(r11, r13)
                retrofit2.r$l r12 = new retrofit2.r$l
                r12.<init>(r0, r11, r14)
                retrofit2.r r11 = r12.b()
                return r11
            L18e:
                retrofit2.d0 r11 = r10.a
                retrofit2.g r11 = r11.o(r12, r13)
                retrofit2.r$l r12 = new retrofit2.r$l
                r12.<init>(r0, r11, r14)
                return r12
            L19a:
                boolean r0 = r14 instanceof retrofit2.http.QueryName
                if (r0 == 0) goto L21d
                r10.j(r11, r12)
                retrofit2.http.QueryName r14 = (retrofit2.http.QueryName) r14
                boolean r14 = r14.encoded()
                java.lang.Class r0 = retrofit2.f0.h(r12)
                r10.k = r3
                boolean r2 = r6.isAssignableFrom(r0)
                if (r2 == 0) goto L1f3
                boolean r2 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r2 == 0) goto L1cd
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r11 = retrofit2.f0.g(r4, r12)
                retrofit2.d0 r12 = r10.a
                retrofit2.g r11 = r12.o(r11, r13)
                retrofit2.r$n r12 = new retrofit2.r$n
                r12.<init>(r11, r14)
                retrofit2.r r11 = r12.c()
                return r11
            L1cd:
                java.lang.reflect.Method r12 = r10.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r0.getSimpleName()
                r13.append(r14)
                r13.append(r5)
                java.lang.String r14 = r0.getSimpleName()
                r13.append(r14)
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L1f3:
                boolean r11 = r0.isArray()
                if (r11 == 0) goto L211
                java.lang.Class r11 = r0.getComponentType()
                java.lang.Class r11 = a(r11)
                retrofit2.d0 r12 = r10.a
                retrofit2.g r11 = r12.o(r11, r13)
                retrofit2.r$n r12 = new retrofit2.r$n
                r12.<init>(r11, r14)
                retrofit2.r r11 = r12.b()
                return r11
            L211:
                retrofit2.d0 r11 = r10.a
                retrofit2.g r11 = r11.o(r12, r13)
                retrofit2.r$n r12 = new retrofit2.r$n
                r12.<init>(r11, r14)
                return r12
            L21d:
                boolean r0 = r14 instanceof retrofit2.http.QueryMap
                java.lang.String r7 = "Map must include generic types (e.g., Map<String, String>)"
                java.lang.Class<java.util.Map> r8 = java.util.Map.class
                if (r0 == 0) goto L28a
                r10.j(r11, r12)
                java.lang.Class r0 = retrofit2.f0.h(r12)
                r10.l = r3
                boolean r1 = r8.isAssignableFrom(r0)
                if (r1 == 0) goto L27f
                java.lang.reflect.Type r12 = retrofit2.f0.i(r12, r0, r8)
                boolean r0 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto L276
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r0 = retrofit2.f0.g(r4, r12)
                if (r2 != r0) goto L25c
                java.lang.reflect.Type r12 = retrofit2.f0.g(r3, r12)
                retrofit2.d0 r0 = r10.a
                retrofit2.g r12 = r0.o(r12, r13)
                retrofit2.r$m r13 = new retrofit2.r$m
                java.lang.reflect.Method r0 = r10.b
                retrofit2.http.QueryMap r14 = (retrofit2.http.QueryMap) r14
                boolean r14 = r14.encoded()
                r13.<init>(r0, r11, r12, r14)
                return r13
            L25c:
                java.lang.reflect.Method r12 = r10.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "@QueryMap keys must be of type String: "
                r13.append(r14)
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L276:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r7, r13)
                throw r11
            L27f:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = "@QueryMap parameter type must be Map."
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L28a:
                boolean r0 = r14 instanceof retrofit2.http.Header
                if (r0 == 0) goto L30b
                r10.j(r11, r12)
                retrofit2.http.Header r14 = (retrofit2.http.Header) r14
                java.lang.String r14 = r14.value()
                java.lang.Class r0 = retrofit2.f0.h(r12)
                boolean r2 = r6.isAssignableFrom(r0)
                if (r2 == 0) goto L2e1
                boolean r2 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r2 == 0) goto L2bb
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r11 = retrofit2.f0.g(r4, r12)
                retrofit2.d0 r12 = r10.a
                retrofit2.g r11 = r12.o(r11, r13)
                retrofit2.r$f r12 = new retrofit2.r$f
                r12.<init>(r14, r11)
                retrofit2.r r11 = r12.c()
                return r11
            L2bb:
                java.lang.reflect.Method r12 = r10.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r0.getSimpleName()
                r13.append(r14)
                r13.append(r5)
                java.lang.String r14 = r0.getSimpleName()
                r13.append(r14)
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L2e1:
                boolean r11 = r0.isArray()
                if (r11 == 0) goto L2ff
                java.lang.Class r11 = r0.getComponentType()
                java.lang.Class r11 = a(r11)
                retrofit2.d0 r12 = r10.a
                retrofit2.g r11 = r12.o(r11, r13)
                retrofit2.r$f r12 = new retrofit2.r$f
                r12.<init>(r14, r11)
                retrofit2.r r11 = r12.b()
                return r11
            L2ff:
                retrofit2.d0 r11 = r10.a
                retrofit2.g r11 = r11.o(r12, r13)
                retrofit2.r$f r12 = new retrofit2.r$f
                r12.<init>(r14, r11)
                return r12
            L30b:
                boolean r0 = r14 instanceof retrofit2.http.HeaderMap
                if (r0 == 0) goto L378
                java.lang.Class<okhttp3.Headers> r14 = okhttp3.Headers.class
                if (r12 != r14) goto L31b
                retrofit2.r$h r12 = new retrofit2.r$h
                java.lang.reflect.Method r13 = r10.b
                r12.<init>(r13, r11)
                return r12
            L31b:
                r10.j(r11, r12)
                java.lang.Class r14 = retrofit2.f0.h(r12)
                boolean r0 = r8.isAssignableFrom(r14)
                if (r0 == 0) goto L36d
                java.lang.reflect.Type r12 = retrofit2.f0.i(r12, r14, r8)
                boolean r14 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r14 == 0) goto L364
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r14 = retrofit2.f0.g(r4, r12)
                if (r2 != r14) goto L34a
                java.lang.reflect.Type r12 = retrofit2.f0.g(r3, r12)
                retrofit2.d0 r14 = r10.a
                retrofit2.g r12 = r14.o(r12, r13)
                retrofit2.r$g r13 = new retrofit2.r$g
                java.lang.reflect.Method r14 = r10.b
                r13.<init>(r14, r11, r12)
                return r13
            L34a:
                java.lang.reflect.Method r12 = r10.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r0 = "@HeaderMap keys must be of type String: "
                r13.append(r0)
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L364:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r7, r13)
                throw r11
            L36d:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = "@HeaderMap parameter type must be Map."
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L378:
                boolean r0 = r14 instanceof retrofit2.http.Field
                if (r0 == 0) goto L40e
                r10.j(r11, r12)
                boolean r0 = r10.p
                if (r0 == 0) goto L403
                retrofit2.http.Field r14 = (retrofit2.http.Field) r14
                java.lang.String r0 = r14.value()
                boolean r14 = r14.encoded()
                r10.f = r3
                java.lang.Class r2 = retrofit2.f0.h(r12)
                boolean r3 = r6.isAssignableFrom(r2)
                if (r3 == 0) goto L3d9
                boolean r3 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r3 == 0) goto L3b3
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r11 = retrofit2.f0.g(r4, r12)
                retrofit2.d0 r12 = r10.a
                retrofit2.g r11 = r12.o(r11, r13)
                retrofit2.r$d r12 = new retrofit2.r$d
                r12.<init>(r0, r11, r14)
                retrofit2.r r11 = r12.c()
                return r11
            L3b3:
                java.lang.reflect.Method r12 = r10.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r2.getSimpleName()
                r13.append(r14)
                r13.append(r5)
                java.lang.String r14 = r2.getSimpleName()
                r13.append(r14)
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L3d9:
                boolean r11 = r2.isArray()
                if (r11 == 0) goto L3f7
                java.lang.Class r11 = r2.getComponentType()
                java.lang.Class r11 = a(r11)
                retrofit2.d0 r12 = r10.a
                retrofit2.g r11 = r12.o(r11, r13)
                retrofit2.r$d r12 = new retrofit2.r$d
                r12.<init>(r0, r11, r14)
                retrofit2.r r11 = r12.b()
                return r11
            L3f7:
                retrofit2.d0 r11 = r10.a
                retrofit2.g r11 = r11.o(r12, r13)
                retrofit2.r$d r12 = new retrofit2.r$d
                r12.<init>(r0, r11, r14)
                return r12
            L403:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = "@Field parameters can only be used with form encoding."
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L40e:
                boolean r0 = r14 instanceof retrofit2.http.FieldMap
                if (r0 == 0) goto L486
                r10.j(r11, r12)
                boolean r0 = r10.p
                if (r0 == 0) goto L47b
                java.lang.Class r0 = retrofit2.f0.h(r12)
                boolean r1 = r8.isAssignableFrom(r0)
                if (r1 == 0) goto L470
                java.lang.reflect.Type r12 = retrofit2.f0.i(r12, r0, r8)
                boolean r0 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto L467
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r0 = retrofit2.f0.g(r4, r12)
                if (r2 != r0) goto L44d
                java.lang.reflect.Type r12 = retrofit2.f0.g(r3, r12)
                retrofit2.d0 r0 = r10.a
                retrofit2.g r12 = r0.o(r12, r13)
                r10.f = r3
                retrofit2.r$e r13 = new retrofit2.r$e
                java.lang.reflect.Method r0 = r10.b
                retrofit2.http.FieldMap r14 = (retrofit2.http.FieldMap) r14
                boolean r14 = r14.encoded()
                r13.<init>(r0, r11, r12, r14)
                return r13
            L44d:
                java.lang.reflect.Method r12 = r10.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "@FieldMap keys must be of type String: "
                r13.append(r14)
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L467:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r7, r13)
                throw r11
            L470:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = "@FieldMap parameter type must be Map."
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L47b:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = "@FieldMap parameters can only be used with form encoding."
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L486:
                boolean r0 = r14 instanceof retrofit2.http.Part
                java.lang.Class<okhttp3.MultipartBody$Part> r9 = okhttp3.MultipartBody.Part.class
                if (r0 == 0) goto L609
                r10.j(r11, r12)
                boolean r0 = r10.f72q
                if (r0 == 0) goto L5fe
                retrofit2.http.Part r14 = (retrofit2.http.Part) r14
                r10.g = r3
                java.lang.String r0 = r14.value()
                java.lang.Class r2 = retrofit2.f0.h(r12)
                boolean r3 = r0.isEmpty()
                if (r3 == 0) goto L529
                boolean r13 = r6.isAssignableFrom(r2)
                java.lang.String r14 = "@Part annotation must supply a name or use MultipartBody.Part parameter type."
                if (r13 == 0) goto L4f7
                boolean r13 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r13 == 0) goto L4d1
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r12 = retrofit2.f0.g(r4, r12)
                java.lang.Class r12 = retrofit2.f0.h(r12)
                boolean r12 = r9.isAssignableFrom(r12)
                if (r12 == 0) goto L4c8
                retrofit2.r$o r11 = retrofit2.r.o.a
                retrofit2.r r11 = r11.c()
                return r11
            L4c8:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r14, r13)
                throw r11
            L4d1:
                java.lang.reflect.Method r12 = r10.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r2.getSimpleName()
                r13.append(r14)
                r13.append(r5)
                java.lang.String r14 = r2.getSimpleName()
                r13.append(r14)
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L4f7:
                boolean r12 = r2.isArray()
                if (r12 == 0) goto L517
                java.lang.Class r12 = r2.getComponentType()
                boolean r12 = r9.isAssignableFrom(r12)
                if (r12 == 0) goto L50e
                retrofit2.r$o r11 = retrofit2.r.o.a
                retrofit2.r r11 = r11.b()
                return r11
            L50e:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r14, r13)
                throw r11
            L517:
                boolean r12 = r9.isAssignableFrom(r2)
                if (r12 == 0) goto L520
                retrofit2.r$o r11 = retrofit2.r.o.a
                return r11
            L520:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r14, r13)
                throw r11
            L529:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r7 = "form-data; name=\""
                r3.append(r7)
                r3.append(r0)
                java.lang.String r0 = "\""
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                java.lang.String r3 = "Content-Transfer-Encoding"
                java.lang.String r14 = r14.encoding()
                java.lang.String r7 = "Content-Disposition"
                java.lang.String[] r14 = new java.lang.String[]{r7, r0, r3, r14}
                okhttp3.Headers r14 = okhttp3.Headers.of(r14)
                boolean r0 = r6.isAssignableFrom(r2)
                java.lang.String r3 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."
                if (r0 == 0) goto L5ae
                boolean r0 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto L588
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r12 = retrofit2.f0.g(r4, r12)
                java.lang.Class r0 = retrofit2.f0.h(r12)
                boolean r0 = r9.isAssignableFrom(r0)
                if (r0 != 0) goto L57f
                retrofit2.d0 r0 = r10.a
                java.lang.annotation.Annotation[] r1 = r10.c
                retrofit2.g r12 = r0.m(r12, r13, r1)
                retrofit2.r$i r13 = new retrofit2.r$i
                java.lang.reflect.Method r0 = r10.b
                r13.<init>(r0, r11, r14, r12)
                retrofit2.r r11 = r13.c()
                return r11
            L57f:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r3, r13)
                throw r11
            L588:
                java.lang.reflect.Method r12 = r10.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r2.getSimpleName()
                r13.append(r14)
                r13.append(r5)
                java.lang.String r14 = r2.getSimpleName()
                r13.append(r14)
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L5ae:
                boolean r0 = r2.isArray()
                if (r0 == 0) goto L5df
                java.lang.Class r12 = r2.getComponentType()
                java.lang.Class r12 = a(r12)
                boolean r0 = r9.isAssignableFrom(r12)
                if (r0 != 0) goto L5d6
                retrofit2.d0 r0 = r10.a
                java.lang.annotation.Annotation[] r1 = r10.c
                retrofit2.g r12 = r0.m(r12, r13, r1)
                retrofit2.r$i r13 = new retrofit2.r$i
                java.lang.reflect.Method r0 = r10.b
                r13.<init>(r0, r11, r14, r12)
                retrofit2.r r11 = r13.b()
                return r11
            L5d6:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r3, r13)
                throw r11
            L5df:
                boolean r0 = r9.isAssignableFrom(r2)
                if (r0 != 0) goto L5f5
                retrofit2.d0 r0 = r10.a
                java.lang.annotation.Annotation[] r1 = r10.c
                retrofit2.g r12 = r0.m(r12, r13, r1)
                retrofit2.r$i r13 = new retrofit2.r$i
                java.lang.reflect.Method r0 = r10.b
                r13.<init>(r0, r11, r14, r12)
                return r13
            L5f5:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r3, r13)
                throw r11
            L5fe:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = "@Part parameters can only be used with multipart encoding."
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L609:
                boolean r0 = r14 instanceof retrofit2.http.PartMap
                if (r0 == 0) goto L698
                r10.j(r11, r12)
                boolean r0 = r10.f72q
                if (r0 == 0) goto L68d
                r10.g = r3
                java.lang.Class r0 = retrofit2.f0.h(r12)
                boolean r1 = r8.isAssignableFrom(r0)
                if (r1 == 0) goto L682
                java.lang.reflect.Type r12 = retrofit2.f0.i(r12, r0, r8)
                boolean r0 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto L679
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r0 = retrofit2.f0.g(r4, r12)
                if (r2 != r0) goto L65f
                java.lang.reflect.Type r12 = retrofit2.f0.g(r3, r12)
                java.lang.Class r0 = retrofit2.f0.h(r12)
                boolean r0 = r9.isAssignableFrom(r0)
                if (r0 != 0) goto L654
                retrofit2.d0 r0 = r10.a
                java.lang.annotation.Annotation[] r1 = r10.c
                retrofit2.g r12 = r0.m(r12, r13, r1)
                retrofit2.http.PartMap r14 = (retrofit2.http.PartMap) r14
                retrofit2.r$j r13 = new retrofit2.r$j
                java.lang.reflect.Method r0 = r10.b
                java.lang.String r14 = r14.encoding()
                r13.<init>(r0, r11, r12, r14)
                return r13
            L654:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L65f:
                java.lang.reflect.Method r12 = r10.b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "@PartMap keys must be of type String: "
                r13.append(r14)
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L679:
                java.lang.reflect.Method r12 = r10.b
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r7, r13)
                throw r11
            L682:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = "@PartMap parameter type must be Map."
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L68d:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = "@PartMap parameters can only be used with multipart encoding."
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L698:
                boolean r0 = r14 instanceof retrofit2.http.Body
                if (r0 == 0) goto L6e2
                r10.j(r11, r12)
                boolean r14 = r10.p
                if (r14 != 0) goto L6d7
                boolean r14 = r10.f72q
                if (r14 != 0) goto L6d7
                boolean r14 = r10.h
                if (r14 != 0) goto L6cc
                retrofit2.d0 r14 = r10.a     // Catch: java.lang.RuntimeException -> L6bd
                java.lang.annotation.Annotation[] r0 = r10.c     // Catch: java.lang.RuntimeException -> L6bd
                retrofit2.g r12 = r14.m(r12, r13, r0)     // Catch: java.lang.RuntimeException -> L6bd
                r10.h = r3
                retrofit2.r$c r13 = new retrofit2.r$c
                java.lang.reflect.Method r14 = r10.b
                r13.<init>(r14, r11, r12)
                return r13
            L6bd:
                r0 = move-exception
                r13 = r0
                java.lang.reflect.Method r14 = r10.b
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r4] = r12
                java.lang.String r12 = "Unable to create @Body converter for %s"
                java.lang.RuntimeException r11 = retrofit2.f0.p(r14, r13, r11, r12, r0)
                throw r11
            L6cc:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = "Multiple @Body method annotations found."
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L6d7:
                java.lang.reflect.Method r12 = r10.b
                java.lang.String r13 = "@Body parameters cannot be used with form or multi-part encoding."
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r12, r11, r13, r14)
                throw r11
            L6e2:
                boolean r13 = r14 instanceof retrofit2.http.Tag
                if (r13 == 0) goto L739
                r10.j(r11, r12)
                java.lang.Class r12 = retrofit2.f0.h(r12)
                int r13 = r11 + (-1)
            L6ef:
                if (r13 < 0) goto L733
                retrofit2.r<?>[] r14 = r10.v
                r14 = r14[r13]
                boolean r0 = r14 instanceof retrofit2.r.q
                if (r0 == 0) goto L730
                retrofit2.r$q r14 = (retrofit2.r.q) r14
                java.lang.Class<T> r14 = r14.a
                boolean r14 = r14.equals(r12)
                if (r14 != 0) goto L704
                goto L730
            L704:
                java.lang.reflect.Method r14 = r10.b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "@Tag type "
                r0.append(r1)
                java.lang.String r12 = r12.getName()
                r0.append(r12)
                java.lang.String r12 = " is duplicate of parameter #"
                r0.append(r12)
                int r13 = r13 + r3
                r0.append(r13)
                java.lang.String r12 = " and would always overwrite its value."
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.f0.o(r14, r11, r12, r13)
                throw r11
            L730:
                int r13 = r13 + (-1)
                goto L6ef
            L733:
                retrofit2.r$q r11 = new retrofit2.r$q
                r11.<init>(r12)
                return r11
            L739:
                r11 = 0
                return r11
        }

        static java.util.Set<java.lang.String> h(java.lang.String r2) {
                java.util.regex.Pattern r0 = retrofit2.b0.a.y
                java.util.regex.Matcher r2 = r0.matcher(r2)
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
            Lb:
                boolean r1 = r2.find()
                if (r1 == 0) goto L1a
                r1 = 1
                java.lang.String r1 = r2.group(r1)
                r0.add(r1)
                goto Lb
            L1a:
                return r0
        }

        private void i(int r6, java.lang.String r7) {
                r5 = this;
                java.util.regex.Pattern r0 = retrofit2.b0.a.z
                java.util.regex.Matcher r0 = r0.matcher(r7)
                boolean r0 = r0.matches()
                r1 = 1
                r2 = 0
                r3 = 2
                if (r0 == 0) goto L29
                java.util.Set<java.lang.String> r0 = r5.u
                boolean r0 = r0.contains(r7)
                if (r0 == 0) goto L18
                return
            L18:
                java.lang.reflect.Method r0 = r5.b
                java.lang.String r4 = r5.r
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r2] = r4
                r3[r1] = r7
                java.lang.String r7 = "URL \"%s\" does not contain \"{%s}\"."
                java.lang.RuntimeException r6 = retrofit2.f0.o(r0, r6, r7, r3)
                throw r6
            L29:
                java.lang.reflect.Method r0 = r5.b
                java.util.regex.Pattern r4 = retrofit2.b0.a.y
                java.lang.String r4 = r4.pattern()
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r2] = r4
                r3[r1] = r7
                java.lang.String r7 = "@Path parameter name must match %s. Found: %s"
                java.lang.RuntimeException r6 = retrofit2.f0.o(r0, r6, r7, r3)
                throw r6
        }

        private void j(int r4, java.lang.reflect.Type r5) {
                r3 = this;
                boolean r0 = retrofit2.f0.j(r5)
                if (r0 != 0) goto L7
                return
            L7:
                java.lang.reflect.Method r0 = r3.b
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r5
                java.lang.String r5 = "Parameter type must not include a type variable or wildcard: %s"
                java.lang.RuntimeException r4 = retrofit2.f0.o(r0, r4, r5, r1)
                throw r4
        }

        retrofit2.b0 b() {
                r8 = this;
                java.lang.annotation.Annotation[] r0 = r8.c
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r3 >= r1) goto Lf
                r4 = r0[r3]
                r8.e(r4)
                int r3 = r3 + 1
                goto L5
            Lf:
                java.lang.String r0 = r8.n
                if (r0 == 0) goto Lba
                boolean r0 = r8.o
                if (r0 != 0) goto L36
                boolean r0 = r8.f72q
                if (r0 != 0) goto L2b
                boolean r0 = r8.p
                if (r0 != 0) goto L20
                goto L36
            L20:
                java.lang.reflect.Method r0 = r8.b
                java.lang.String r1 = "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.RuntimeException r0 = retrofit2.f0.m(r0, r1, r2)
                throw r0
            L2b:
                java.lang.reflect.Method r0 = r8.b
                java.lang.String r1 = "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.RuntimeException r0 = retrofit2.f0.m(r0, r1, r2)
                throw r0
            L36:
                java.lang.annotation.Annotation[][] r0 = r8.d
                int r0 = r0.length
                retrofit2.r[] r1 = new retrofit2.r[r0]
                r8.v = r1
                int r1 = r0 + (-1)
                r3 = 0
            L40:
                r4 = 1
                if (r3 >= r0) goto L5a
                retrofit2.r<?>[] r5 = r8.v
                java.lang.reflect.Type[] r6 = r8.e
                r6 = r6[r3]
                java.lang.annotation.Annotation[][] r7 = r8.d
                r7 = r7[r3]
                if (r3 != r1) goto L50
                goto L51
            L50:
                r4 = 0
            L51:
                retrofit2.r r4 = r8.f(r3, r6, r7, r4)
                r5[r3] = r4
                int r3 = r3 + 1
                goto L40
            L5a:
                java.lang.String r0 = r8.r
                if (r0 != 0) goto L72
                boolean r0 = r8.m
                if (r0 == 0) goto L63
                goto L72
            L63:
                java.lang.reflect.Method r0 = r8.b
                java.lang.String r1 = r8.n
                java.lang.Object[] r3 = new java.lang.Object[r4]
                r3[r2] = r1
                java.lang.String r1 = "Missing either @%s URL or @Url parameter."
                java.lang.RuntimeException r0 = retrofit2.f0.m(r0, r1, r3)
                throw r0
            L72:
                boolean r0 = r8.p
                if (r0 != 0) goto L8e
                boolean r1 = r8.f72q
                if (r1 != 0) goto L8e
                boolean r1 = r8.o
                if (r1 != 0) goto L8e
                boolean r1 = r8.h
                if (r1 != 0) goto L83
                goto L8e
            L83:
                java.lang.reflect.Method r0 = r8.b
                java.lang.String r1 = "Non-body HTTP method cannot contain @Body."
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.RuntimeException r0 = retrofit2.f0.m(r0, r1, r2)
                throw r0
            L8e:
                if (r0 == 0) goto La0
                boolean r0 = r8.f
                if (r0 == 0) goto L95
                goto La0
            L95:
                java.lang.reflect.Method r0 = r8.b
                java.lang.String r1 = "Form-encoded method must contain at least one @Field."
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.RuntimeException r0 = retrofit2.f0.m(r0, r1, r2)
                throw r0
            La0:
                boolean r0 = r8.f72q
                if (r0 == 0) goto Lb4
                boolean r0 = r8.g
                if (r0 == 0) goto La9
                goto Lb4
            La9:
                java.lang.reflect.Method r0 = r8.b
                java.lang.String r1 = "Multipart method must contain at least one @Part."
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.RuntimeException r0 = retrofit2.f0.m(r0, r1, r2)
                throw r0
            Lb4:
                retrofit2.b0 r0 = new retrofit2.b0
                r0.<init>(r8)
                return r0
            Lba:
                java.lang.reflect.Method r0 = r8.b
                java.lang.String r1 = "HTTP method annotation is required (e.g., @GET, @POST, etc.)."
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.RuntimeException r0 = retrofit2.f0.m(r0, r1, r2)
                throw r0
        }
    }

    b0(retrofit2.b0.a r2) {
            r1 = this;
            r1.<init>()
            java.lang.reflect.Method r0 = r2.b
            r1.a = r0
            retrofit2.d0 r0 = r2.a
            okhttp3.HttpUrl r0 = r0.c
            r1.b = r0
            java.lang.String r0 = r2.n
            r1.c = r0
            java.lang.String r0 = r2.r
            r1.d = r0
            okhttp3.Headers r0 = r2.s
            r1.e = r0
            okhttp3.MediaType r0 = r2.t
            r1.f = r0
            boolean r0 = r2.o
            r1.g = r0
            boolean r0 = r2.p
            r1.h = r0
            boolean r0 = r2.f72q
            r1.i = r0
            retrofit2.r<?>[] r0 = r2.v
            r1.j = r0
            boolean r2 = r2.w
            r1.k = r2
            return
    }

    static retrofit2.b0 b(retrofit2.d0 r1, java.lang.reflect.Method r2) {
            retrofit2.b0$a r0 = new retrofit2.b0$a
            r0.<init>(r1, r2)
            retrofit2.b0 r1 = r0.b()
            return r1
    }

    okhttp3.Request a(java.lang.Object[] r13) throws java.io.IOException {
            r12 = this;
            retrofit2.r<?>[] r0 = r12.j
            int r1 = r13.length
            int r2 = r0.length
            if (r1 != r2) goto L4e
            retrofit2.a0 r3 = new retrofit2.a0
            java.lang.String r4 = r12.c
            okhttp3.HttpUrl r5 = r12.b
            java.lang.String r6 = r12.d
            okhttp3.Headers r7 = r12.e
            okhttp3.MediaType r8 = r12.f
            boolean r9 = r12.g
            boolean r10 = r12.h
            boolean r11 = r12.i
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r2 = r12.k
            if (r2 == 0) goto L21
            int r1 = r1 + (-1)
        L21:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r4 = 0
        L27:
            if (r4 >= r1) goto L38
            r5 = r13[r4]
            r2.add(r5)
            r5 = r0[r4]
            r6 = r13[r4]
            r5.a(r3, r6)
            int r4 = r4 + 1
            goto L27
        L38:
            okhttp3.Request$Builder r13 = r3.k()
            retrofit2.l r0 = new retrofit2.l
            java.lang.reflect.Method r1 = r12.a
            r0.<init>(r1, r2)
            java.lang.Class<retrofit2.l> r1 = retrofit2.l.class
            okhttp3.Request$Builder r13 = r13.tag(r1, r0)
            okhttp3.Request r13 = r13.build()
            return r13
        L4e:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Argument count ("
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ") doesn't match expected count ("
            r2.append(r1)
            int r0 = r0.length
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r13.<init>(r0)
            throw r13
    }
}
