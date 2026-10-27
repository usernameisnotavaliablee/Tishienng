package retrofit2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class k<ResponseT, ReturnT> extends retrofit2.e0<ReturnT> {
    private final retrofit2.b0 a;
    private final okhttp3.Call.Factory b;
    private final retrofit2.g<okhttp3.ResponseBody, ResponseT> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<ResponseT, ReturnT> extends retrofit2.k<ResponseT, ReturnT> {
        private final retrofit2.c<ResponseT, ReturnT> d;

        a(retrofit2.b0 r1, okhttp3.Call.Factory r2, retrofit2.g<okhttp3.ResponseBody, ResponseT> r3, retrofit2.c<ResponseT, ReturnT> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.d = r4
                return
        }

        @Override // retrofit2.k
        protected ReturnT c(retrofit2.b<ResponseT> r1, java.lang.Object[] r2) {
                r0 = this;
                retrofit2.c<ResponseT, ReturnT> r2 = r0.d
                java.lang.Object r1 = r2.b(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<ResponseT> extends retrofit2.k<ResponseT, java.lang.Object> {
        private final retrofit2.c<ResponseT, retrofit2.b<ResponseT>> d;
        private final boolean e;

        b(retrofit2.b0 r1, okhttp3.Call.Factory r2, retrofit2.g<okhttp3.ResponseBody, ResponseT> r3, retrofit2.c<ResponseT, retrofit2.b<ResponseT>> r4, boolean r5) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.d = r4
                r0.e = r5
                return
        }

        @Override // retrofit2.k
        protected java.lang.Object c(retrofit2.b<ResponseT> r2, java.lang.Object[] r3) {
                r1 = this;
                retrofit2.c<ResponseT, retrofit2.b<ResponseT>> r0 = r1.d
                java.lang.Object r2 = r0.b(r2)
                retrofit2.b r2 = (retrofit2.b) r2
                int r0 = r3.length
                int r0 = r0 + (-1)
                r3 = r3[r0]
                kotlin.coroutines.e r3 = (kotlin.coroutines.e) r3
                boolean r0 = r1.e     // Catch: java.lang.Exception -> L18
                if (r0 == 0) goto L1a
                java.lang.Object r2 = retrofit2.m.b(r2, r3)     // Catch: java.lang.Exception -> L18
                return r2
            L18:
                r2 = move-exception
                goto L1f
            L1a:
                java.lang.Object r2 = retrofit2.m.a(r2, r3)     // Catch: java.lang.Exception -> L18
                return r2
            L1f:
                java.lang.Object r2 = retrofit2.m.e(r2, r3)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c<ResponseT> extends retrofit2.k<ResponseT, java.lang.Object> {
        private final retrofit2.c<ResponseT, retrofit2.b<ResponseT>> d;

        c(retrofit2.b0 r1, okhttp3.Call.Factory r2, retrofit2.g<okhttp3.ResponseBody, ResponseT> r3, retrofit2.c<ResponseT, retrofit2.b<ResponseT>> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.d = r4
                return
        }

        @Override // retrofit2.k
        protected java.lang.Object c(retrofit2.b<ResponseT> r2, java.lang.Object[] r3) {
                r1 = this;
                retrofit2.c<ResponseT, retrofit2.b<ResponseT>> r0 = r1.d
                java.lang.Object r2 = r0.b(r2)
                retrofit2.b r2 = (retrofit2.b) r2
                int r0 = r3.length
                int r0 = r0 + (-1)
                r3 = r3[r0]
                kotlin.coroutines.e r3 = (kotlin.coroutines.e) r3
                java.lang.Object r2 = retrofit2.m.c(r2, r3)     // Catch: java.lang.Exception -> L14
                return r2
            L14:
                r2 = move-exception
                java.lang.Object r2 = retrofit2.m.e(r2, r3)
                return r2
        }
    }

    k(retrofit2.b0 r1, okhttp3.Call.Factory r2, retrofit2.g<okhttp3.ResponseBody, ResponseT> r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    private static <ResponseT, ReturnT> retrofit2.c<ResponseT, ReturnT> d(retrofit2.d0 r1, java.lang.reflect.Method r2, java.lang.reflect.Type r3, java.lang.annotation.Annotation[] r4) {
            retrofit2.c r1 = r1.b(r3, r4)     // Catch: java.lang.RuntimeException -> L5
            return r1
        L5:
            r1 = move-exception
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
            r4[r0] = r3
            java.lang.String r3 = "Unable to create call adapter for %s"
            java.lang.RuntimeException r1 = retrofit2.f0.n(r2, r1, r3, r4)
            throw r1
    }

    private static <ResponseT> retrofit2.g<okhttp3.ResponseBody, ResponseT> e(retrofit2.d0 r2, java.lang.reflect.Method r3, java.lang.reflect.Type r4) {
            java.lang.annotation.Annotation[] r0 = r3.getAnnotations()
            retrofit2.g r2 = r2.n(r4, r0)     // Catch: java.lang.RuntimeException -> L9
            return r2
        L9:
            r2 = move-exception
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r4 = "Unable to create converter for %s"
            java.lang.RuntimeException r2 = retrofit2.f0.n(r3, r2, r4, r0)
            throw r2
    }

    static <ResponseT, ReturnT> retrofit2.k<ResponseT, ReturnT> f(retrofit2.d0 r12, java.lang.reflect.Method r13, retrofit2.b0 r14) {
            boolean r3 = r14.k
            java.lang.annotation.Annotation[] r4 = r13.getAnnotations()
            java.lang.Class<retrofit2.c0> r5 = retrofit2.c0.class
            r6 = 0
            if (r3 == 0) goto L3e
            java.lang.reflect.Type[] r7 = r13.getGenericParameterTypes()
            int r8 = r7.length
            r9 = 1
            int r8 = r8 - r9
            r7 = r7[r8]
            java.lang.reflect.ParameterizedType r7 = (java.lang.reflect.ParameterizedType) r7
            java.lang.reflect.Type r7 = retrofit2.f0.f(r6, r7)
            java.lang.Class r8 = retrofit2.f0.h(r7)
            if (r8 != r5) goto L2c
            boolean r8 = r7 instanceof java.lang.reflect.ParameterizedType
            if (r8 == 0) goto L2c
            java.lang.reflect.ParameterizedType r7 = (java.lang.reflect.ParameterizedType) r7
            java.lang.reflect.Type r7 = retrofit2.f0.g(r6, r7)
            r8 = 1
            goto L2d
        L2c:
            r8 = 0
        L2d:
            retrofit2.f0$b r10 = new retrofit2.f0$b
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r9]
            r9[r6] = r7
            r7 = 0
            java.lang.Class<retrofit2.b> r11 = retrofit2.b.class
            r10.<init>(r7, r11, r9)
            java.lang.annotation.Annotation[] r4 = retrofit2.SkipCallbackExecutorImpl.ensurePresent(r4)
            goto L43
        L3e:
            java.lang.reflect.Type r10 = r13.getGenericReturnType()
            r8 = 0
        L43:
            retrofit2.c r4 = d(r12, r13, r10, r4)
            java.lang.reflect.Type r7 = r4.a()
            java.lang.Class<okhttp3.Response> r9 = okhttp3.Response.class
            if (r7 == r9) goto L96
            if (r7 == r5) goto L8d
            java.lang.String r5 = r14.c
            java.lang.String r9 = "HEAD"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L63
            java.lang.Class<java.lang.Void> r5 = java.lang.Void.class
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L65
        L63:
            r5 = r3
            goto L6e
        L65:
            java.lang.String r0 = "HEAD method must use Void as response type."
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.RuntimeException r0 = retrofit2.f0.m(r13, r0, r2)
            throw r0
        L6e:
            retrofit2.g r3 = e(r12, r13, r7)
            okhttp3.Call$Factory r0 = r12.b
            if (r5 != 0) goto L7c
            retrofit2.k$a r1 = new retrofit2.k$a
            r1.<init>(r14, r0, r3, r4)
            return r1
        L7c:
            if (r8 == 0) goto L84
            retrofit2.k$c r1 = new retrofit2.k$c
            r1.<init>(r14, r0, r3, r4)
            return r1
        L84:
            r2 = r0
            retrofit2.k$b r0 = new retrofit2.k$b
            r5 = 0
            r1 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L8d:
            java.lang.String r0 = "Response must include generic type (e.g., Response<String>)"
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.RuntimeException r0 = retrofit2.f0.m(r13, r0, r2)
            throw r0
        L96:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "'"
            r0.append(r2)
            java.lang.Class r2 = retrofit2.f0.h(r7)
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = "' is not a valid response body type. Did you mean ResponseBody?"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.RuntimeException r0 = retrofit2.f0.m(r13, r0, r2)
            throw r0
    }

    @Override // retrofit2.e0
    @javax.annotation.Nullable
    final ReturnT a(java.lang.Object[] r5) {
            r4 = this;
            retrofit2.n r0 = new retrofit2.n
            retrofit2.b0 r1 = r4.a
            okhttp3.Call$Factory r2 = r4.b
            retrofit2.g<okhttp3.ResponseBody, ResponseT> r3 = r4.c
            r0.<init>(r1, r5, r2, r3)
            java.lang.Object r5 = r4.c(r0, r5)
            return r5
    }

    @javax.annotation.Nullable
    protected abstract ReturnT c(retrofit2.b<ResponseT> r1, java.lang.Object[] r2);
}
