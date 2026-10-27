package retrofit2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class r<T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends retrofit2.r<java.lang.Iterable<T>> {
        final /* synthetic */ retrofit2.r a;

        a(retrofit2.r r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // retrofit2.r
        /* bridge */ /* synthetic */ void a(retrofit2.a0 r1, @javax.annotation.Nullable java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                r0.d(r1, r2)
                return
        }

        void d(retrofit2.a0 r3, @javax.annotation.Nullable java.lang.Iterable<T> r4) throws java.io.IOException {
                r2 = this;
                if (r4 != 0) goto L3
                goto L17
            L3:
                java.util.Iterator r4 = r4.iterator()
            L7:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L17
                java.lang.Object r0 = r4.next()
                retrofit2.r r1 = r2.a
                r1.a(r3, r0)
                goto L7
            L17:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends retrofit2.r<java.lang.Object> {
        final /* synthetic */ retrofit2.r a;

        b(retrofit2.r r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // retrofit2.r
        void a(retrofit2.a0 r5, @javax.annotation.Nullable java.lang.Object r6) throws java.io.IOException {
                r4 = this;
                if (r6 != 0) goto L3
                goto L16
            L3:
                int r0 = java.lang.reflect.Array.getLength(r6)
                r1 = 0
            L8:
                if (r1 >= r0) goto L16
                retrofit2.r r2 = r4.a
                java.lang.Object r3 = java.lang.reflect.Array.get(r6, r1)
                r2.a(r5, r3)
                int r1 = r1 + 1
                goto L8
            L16:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c<T> extends retrofit2.r<T> {
        private final java.lang.reflect.Method a;
        private final int b;
        private final retrofit2.g<T, okhttp3.RequestBody> c;

        c(java.lang.reflect.Method r1, int r2, retrofit2.g<T, okhttp3.RequestBody> r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        @Override // retrofit2.r
        void a(retrofit2.a0 r6, @javax.annotation.Nullable T r7) {
                r5 = this;
                r0 = 0
                if (r7 == 0) goto L31
                retrofit2.g<T, okhttp3.RequestBody> r1 = r5.c     // Catch: java.io.IOException -> Lf
                java.lang.Object r1 = r1.convert(r7)     // Catch: java.io.IOException -> Lf
                okhttp3.RequestBody r1 = (okhttp3.RequestBody) r1     // Catch: java.io.IOException -> Lf
                r6.l(r1)
                return
            Lf:
                r6 = move-exception
                java.lang.reflect.Method r1 = r5.a
                int r2 = r5.b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Unable to convert "
                r3.append(r4)
                r3.append(r7)
                java.lang.String r7 = " to RequestBody"
                r3.append(r7)
                java.lang.String r7 = r3.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r6 = retrofit2.f0.p(r1, r6, r2, r7, r0)
                throw r6
            L31:
                java.lang.reflect.Method r6 = r5.a
                int r7 = r5.b
                java.lang.String r1 = "Body parameter value must not be null."
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r6 = retrofit2.f0.o(r6, r7, r1, r0)
                throw r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d<T> extends retrofit2.r<T> {
        private final java.lang.String a;
        private final retrofit2.g<T, java.lang.String> b;
        private final boolean c;

        d(java.lang.String r2, retrofit2.g<T, java.lang.String> r3, boolean r4) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "name == null"
                java.util.Objects.requireNonNull(r2, r0)
                r1.a = r2
                r1.b = r3
                r1.c = r4
                return
        }

        @Override // retrofit2.r
        void a(retrofit2.a0 r3, @javax.annotation.Nullable T r4) throws java.io.IOException {
                r2 = this;
                if (r4 != 0) goto L3
                goto Ld
            L3:
                retrofit2.g<T, java.lang.String> r0 = r2.b
                java.lang.Object r4 = r0.convert(r4)
                java.lang.String r4 = (java.lang.String) r4
                if (r4 != 0) goto Le
            Ld:
                return
            Le:
                java.lang.String r0 = r2.a
                boolean r1 = r2.c
                r3.a(r0, r4, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class e<T> extends retrofit2.r<java.util.Map<java.lang.String, T>> {
        private final java.lang.reflect.Method a;
        private final int b;
        private final retrofit2.g<T, java.lang.String> c;
        private final boolean d;

        e(java.lang.reflect.Method r1, int r2, retrofit2.g<T, java.lang.String> r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                return
        }

        @Override // retrofit2.r
        /* bridge */ /* synthetic */ void a(retrofit2.a0 r1, @javax.annotation.Nullable java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.d(r1, r2)
                return
        }

        void d(retrofit2.a0 r7, @javax.annotation.Nullable java.util.Map<java.lang.String, T> r8) throws java.io.IOException {
                r6 = this;
                r0 = 0
                if (r8 == 0) goto L9d
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
            Lb:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L9c
                java.lang.Object r1 = r8.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L8f
                java.lang.Object r1 = r1.getValue()
                java.lang.String r3 = "'."
                if (r1 == 0) goto L70
                retrofit2.g<T, java.lang.String> r4 = r6.c
                java.lang.Object r4 = r4.convert(r1)
                java.lang.String r4 = (java.lang.String) r4
                if (r4 == 0) goto L37
                boolean r1 = r6.d
                r7.a(r2, r4, r1)
                goto Lb
            L37:
                java.lang.reflect.Method r7 = r6.a
                int r8 = r6.b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Field map value '"
                r4.append(r5)
                r4.append(r1)
                java.lang.String r1 = "' converted to null by "
                r4.append(r1)
                retrofit2.g<T, java.lang.String> r1 = r6.c
                java.lang.Class r1 = r1.getClass()
                java.lang.String r1 = r1.getName()
                r4.append(r1)
                java.lang.String r1 = " for key '"
                r4.append(r1)
                r4.append(r2)
                r4.append(r3)
                java.lang.String r1 = r4.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.f0.o(r7, r8, r1, r0)
                throw r7
            L70:
                java.lang.reflect.Method r7 = r6.a
                int r8 = r6.b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "Field map contained null value for key '"
                r1.append(r4)
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.f0.o(r7, r8, r1, r0)
                throw r7
            L8f:
                java.lang.reflect.Method r7 = r6.a
                int r8 = r6.b
                java.lang.String r1 = "Field map contained null key."
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.f0.o(r7, r8, r1, r0)
                throw r7
            L9c:
                return
            L9d:
                java.lang.reflect.Method r7 = r6.a
                int r8 = r6.b
                java.lang.String r1 = "Field map was null."
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.f0.o(r7, r8, r1, r0)
                throw r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class f<T> extends retrofit2.r<T> {
        private final java.lang.String a;
        private final retrofit2.g<T, java.lang.String> b;

        f(java.lang.String r2, retrofit2.g<T, java.lang.String> r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "name == null"
                java.util.Objects.requireNonNull(r2, r0)
                r1.a = r2
                r1.b = r3
                return
        }

        @Override // retrofit2.r
        void a(retrofit2.a0 r2, @javax.annotation.Nullable T r3) throws java.io.IOException {
                r1 = this;
                if (r3 != 0) goto L3
                goto Ld
            L3:
                retrofit2.g<T, java.lang.String> r0 = r1.b
                java.lang.Object r3 = r0.convert(r3)
                java.lang.String r3 = (java.lang.String) r3
                if (r3 != 0) goto Le
            Ld:
                return
            Le:
                java.lang.String r0 = r1.a
                r2.b(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class g<T> extends retrofit2.r<java.util.Map<java.lang.String, T>> {
        private final java.lang.reflect.Method a;
        private final int b;
        private final retrofit2.g<T, java.lang.String> c;

        g(java.lang.reflect.Method r1, int r2, retrofit2.g<T, java.lang.String> r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        @Override // retrofit2.r
        /* bridge */ /* synthetic */ void a(retrofit2.a0 r1, @javax.annotation.Nullable java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.d(r1, r2)
                return
        }

        void d(retrofit2.a0 r5, @javax.annotation.Nullable java.util.Map<java.lang.String, T> r6) throws java.io.IOException {
                r4 = this;
                r0 = 0
                if (r6 == 0) goto L60
                java.util.Set r6 = r6.entrySet()
                java.util.Iterator r6 = r6.iterator()
            Lb:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L5f
                java.lang.Object r1 = r6.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L52
                java.lang.Object r1 = r1.getValue()
                if (r1 == 0) goto L31
                retrofit2.g<T, java.lang.String> r3 = r4.c
                java.lang.Object r1 = r3.convert(r1)
                java.lang.String r1 = (java.lang.String) r1
                r5.b(r2, r1)
                goto Lb
            L31:
                java.lang.reflect.Method r5 = r4.a
                int r6 = r4.b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Header map contained null value for key '"
                r1.append(r3)
                r1.append(r2)
                java.lang.String r2 = "'."
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r5 = retrofit2.f0.o(r5, r6, r1, r0)
                throw r5
            L52:
                java.lang.reflect.Method r5 = r4.a
                int r6 = r4.b
                java.lang.String r1 = "Header map contained null key."
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r5 = retrofit2.f0.o(r5, r6, r1, r0)
                throw r5
            L5f:
                return
            L60:
                java.lang.reflect.Method r5 = r4.a
                int r6 = r4.b
                java.lang.String r1 = "Header map was null."
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r5 = retrofit2.f0.o(r5, r6, r1, r0)
                throw r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class h extends retrofit2.r<okhttp3.Headers> {
        private final java.lang.reflect.Method a;
        private final int b;

        h(java.lang.reflect.Method r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        @Override // retrofit2.r
        /* bridge */ /* synthetic */ void a(retrofit2.a0 r1, @javax.annotation.Nullable okhttp3.Headers r2) throws java.io.IOException {
                r0 = this;
                okhttp3.Headers r2 = (okhttp3.Headers) r2
                r0.d(r1, r2)
                return
        }

        void d(retrofit2.a0 r3, @javax.annotation.Nullable okhttp3.Headers r4) {
                r2 = this;
                if (r4 == 0) goto L6
                r3.c(r4)
                return
            L6:
                java.lang.reflect.Method r3 = r2.a
                int r4 = r2.b
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Headers parameter must not be null."
                java.lang.RuntimeException r3 = retrofit2.f0.o(r3, r4, r1, r0)
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class i<T> extends retrofit2.r<T> {
        private final java.lang.reflect.Method a;
        private final int b;
        private final okhttp3.Headers c;
        private final retrofit2.g<T, okhttp3.RequestBody> d;

        i(java.lang.reflect.Method r1, int r2, okhttp3.Headers r3, retrofit2.g<T, okhttp3.RequestBody> r4) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                return
        }

        @Override // retrofit2.r
        void a(retrofit2.a0 r5, @javax.annotation.Nullable T r6) {
                r4 = this;
                if (r6 != 0) goto L3
                return
            L3:
                retrofit2.g<T, okhttp3.RequestBody> r0 = r4.d     // Catch: java.io.IOException -> L11
                java.lang.Object r0 = r0.convert(r6)     // Catch: java.io.IOException -> L11
                okhttp3.RequestBody r0 = (okhttp3.RequestBody) r0     // Catch: java.io.IOException -> L11
                okhttp3.Headers r6 = r4.c
                r5.d(r6, r0)
                return
            L11:
                r5 = move-exception
                java.lang.reflect.Method r0 = r4.a
                int r1 = r4.b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unable to convert "
                r2.append(r3)
                r2.append(r6)
                java.lang.String r6 = " to RequestBody"
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r5
                java.lang.RuntimeException r5 = retrofit2.f0.o(r0, r1, r6, r2)
                throw r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class j<T> extends retrofit2.r<java.util.Map<java.lang.String, T>> {
        private final java.lang.reflect.Method a;
        private final int b;
        private final retrofit2.g<T, okhttp3.RequestBody> c;
        private final java.lang.String d;

        j(java.lang.reflect.Method r1, int r2, retrofit2.g<T, okhttp3.RequestBody> r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                return
        }

        @Override // retrofit2.r
        /* bridge */ /* synthetic */ void a(retrofit2.a0 r1, @javax.annotation.Nullable java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.d(r1, r2)
                return
        }

        void d(retrofit2.a0 r7, @javax.annotation.Nullable java.util.Map<java.lang.String, T> r8) throws java.io.IOException {
                r6 = this;
                r0 = 0
                if (r8 == 0) goto L84
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
            Lb:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L83
                java.lang.Object r1 = r8.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L76
                java.lang.Object r1 = r1.getValue()
                if (r1 == 0) goto L55
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "form-data; name=\""
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = "\""
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                java.lang.String r3 = "Content-Transfer-Encoding"
                java.lang.String r4 = r6.d
                java.lang.String r5 = "Content-Disposition"
                java.lang.String[] r2 = new java.lang.String[]{r5, r2, r3, r4}
                okhttp3.Headers r2 = okhttp3.Headers.of(r2)
                retrofit2.g<T, okhttp3.RequestBody> r3 = r6.c
                java.lang.Object r1 = r3.convert(r1)
                okhttp3.RequestBody r1 = (okhttp3.RequestBody) r1
                r7.d(r2, r1)
                goto Lb
            L55:
                java.lang.reflect.Method r7 = r6.a
                int r8 = r6.b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Part map contained null value for key '"
                r1.append(r3)
                r1.append(r2)
                java.lang.String r2 = "'."
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.f0.o(r7, r8, r1, r0)
                throw r7
            L76:
                java.lang.reflect.Method r7 = r6.a
                int r8 = r6.b
                java.lang.String r1 = "Part map contained null key."
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.f0.o(r7, r8, r1, r0)
                throw r7
            L83:
                return
            L84:
                java.lang.reflect.Method r7 = r6.a
                int r8 = r6.b
                java.lang.String r1 = "Part map was null."
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.f0.o(r7, r8, r1, r0)
                throw r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class k<T> extends retrofit2.r<T> {
        private final java.lang.reflect.Method a;
        private final int b;
        private final java.lang.String c;
        private final retrofit2.g<T, java.lang.String> d;
        private final boolean e;

        k(java.lang.reflect.Method r1, int r2, java.lang.String r3, retrofit2.g<T, java.lang.String> r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                java.lang.String r1 = "name == null"
                java.util.Objects.requireNonNull(r3, r1)
                r0.c = r3
                r0.d = r4
                r0.e = r5
                return
        }

        @Override // retrofit2.r
        void a(retrofit2.a0 r3, @javax.annotation.Nullable T r4) throws java.io.IOException {
                r2 = this;
                if (r4 == 0) goto L12
                java.lang.String r0 = r2.c
                retrofit2.g<T, java.lang.String> r1 = r2.d
                java.lang.Object r4 = r1.convert(r4)
                java.lang.String r4 = (java.lang.String) r4
                boolean r1 = r2.e
                r3.f(r0, r4, r1)
                return
            L12:
                java.lang.reflect.Method r3 = r2.a
                int r4 = r2.b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Path parameter \""
                r0.append(r1)
                java.lang.String r1 = r2.c
                r0.append(r1)
                java.lang.String r1 = "\" value must not be null."
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.RuntimeException r3 = retrofit2.f0.o(r3, r4, r0, r1)
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class l<T> extends retrofit2.r<T> {
        private final java.lang.String a;
        private final retrofit2.g<T, java.lang.String> b;
        private final boolean c;

        l(java.lang.String r2, retrofit2.g<T, java.lang.String> r3, boolean r4) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "name == null"
                java.util.Objects.requireNonNull(r2, r0)
                r1.a = r2
                r1.b = r3
                r1.c = r4
                return
        }

        @Override // retrofit2.r
        void a(retrofit2.a0 r3, @javax.annotation.Nullable T r4) throws java.io.IOException {
                r2 = this;
                if (r4 != 0) goto L3
                goto Ld
            L3:
                retrofit2.g<T, java.lang.String> r0 = r2.b
                java.lang.Object r4 = r0.convert(r4)
                java.lang.String r4 = (java.lang.String) r4
                if (r4 != 0) goto Le
            Ld:
                return
            Le:
                java.lang.String r0 = r2.a
                boolean r1 = r2.c
                r3.g(r0, r4, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class m<T> extends retrofit2.r<java.util.Map<java.lang.String, T>> {
        private final java.lang.reflect.Method a;
        private final int b;
        private final retrofit2.g<T, java.lang.String> c;
        private final boolean d;

        m(java.lang.reflect.Method r1, int r2, retrofit2.g<T, java.lang.String> r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                return
        }

        @Override // retrofit2.r
        /* bridge */ /* synthetic */ void a(retrofit2.a0 r1, @javax.annotation.Nullable java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.d(r1, r2)
                return
        }

        void d(retrofit2.a0 r7, @javax.annotation.Nullable java.util.Map<java.lang.String, T> r8) throws java.io.IOException {
                r6 = this;
                r0 = 0
                if (r8 == 0) goto L9d
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
            Lb:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L9c
                java.lang.Object r1 = r8.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L8f
                java.lang.Object r1 = r1.getValue()
                java.lang.String r3 = "'."
                if (r1 == 0) goto L70
                retrofit2.g<T, java.lang.String> r4 = r6.c
                java.lang.Object r4 = r4.convert(r1)
                java.lang.String r4 = (java.lang.String) r4
                if (r4 == 0) goto L37
                boolean r1 = r6.d
                r7.g(r2, r4, r1)
                goto Lb
            L37:
                java.lang.reflect.Method r7 = r6.a
                int r8 = r6.b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Query map value '"
                r4.append(r5)
                r4.append(r1)
                java.lang.String r1 = "' converted to null by "
                r4.append(r1)
                retrofit2.g<T, java.lang.String> r1 = r6.c
                java.lang.Class r1 = r1.getClass()
                java.lang.String r1 = r1.getName()
                r4.append(r1)
                java.lang.String r1 = " for key '"
                r4.append(r1)
                r4.append(r2)
                r4.append(r3)
                java.lang.String r1 = r4.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.f0.o(r7, r8, r1, r0)
                throw r7
            L70:
                java.lang.reflect.Method r7 = r6.a
                int r8 = r6.b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "Query map contained null value for key '"
                r1.append(r4)
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.f0.o(r7, r8, r1, r0)
                throw r7
            L8f:
                java.lang.reflect.Method r7 = r6.a
                int r8 = r6.b
                java.lang.String r1 = "Query map contained null key."
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.f0.o(r7, r8, r1, r0)
                throw r7
            L9c:
                return
            L9d:
                java.lang.reflect.Method r7 = r6.a
                int r8 = r6.b
                java.lang.String r1 = "Query map was null"
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.f0.o(r7, r8, r1, r0)
                throw r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class n<T> extends retrofit2.r<T> {
        private final retrofit2.g<T, java.lang.String> a;
        private final boolean b;

        n(retrofit2.g<T, java.lang.String> r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        @Override // retrofit2.r
        void a(retrofit2.a0 r3, @javax.annotation.Nullable T r4) throws java.io.IOException {
                r2 = this;
                if (r4 != 0) goto L3
                return
            L3:
                retrofit2.g<T, java.lang.String> r0 = r2.a
                java.lang.Object r4 = r0.convert(r4)
                java.lang.String r4 = (java.lang.String) r4
                r0 = 0
                boolean r1 = r2.b
                r3.g(r4, r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class o extends retrofit2.r<okhttp3.MultipartBody.Part> {
        static final retrofit2.r.o a = null;

        static {
                retrofit2.r$o r0 = new retrofit2.r$o
                r0.<init>()
                retrofit2.r.o.a = r0
                return
        }

        private o() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // retrofit2.r
        /* bridge */ /* synthetic */ void a(retrofit2.a0 r1, @javax.annotation.Nullable okhttp3.MultipartBody.Part r2) throws java.io.IOException {
                r0 = this;
                okhttp3.MultipartBody$Part r2 = (okhttp3.MultipartBody.Part) r2
                r0.d(r1, r2)
                return
        }

        void d(retrofit2.a0 r1, @javax.annotation.Nullable okhttp3.MultipartBody.Part r2) {
                r0 = this;
                if (r2 == 0) goto L5
                r1.e(r2)
            L5:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class p extends retrofit2.r<java.lang.Object> {
        private final java.lang.reflect.Method a;
        private final int b;

        p(java.lang.reflect.Method r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        @Override // retrofit2.r
        void a(retrofit2.a0 r3, @javax.annotation.Nullable java.lang.Object r4) {
                r2 = this;
                if (r4 == 0) goto L6
                r3.m(r4)
                return
            L6:
                java.lang.reflect.Method r3 = r2.a
                int r4 = r2.b
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "@Url parameter is null."
                java.lang.RuntimeException r3 = retrofit2.f0.o(r3, r4, r1, r0)
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class q<T> extends retrofit2.r<T> {
        final java.lang.Class<T> a;

        q(java.lang.Class<T> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // retrofit2.r
        void a(retrofit2.a0 r2, @javax.annotation.Nullable T r3) {
                r1 = this;
                java.lang.Class<T> r0 = r1.a
                r2.h(r0, r3)
                return
        }
    }

    r() {
            r0 = this;
            r0.<init>()
            return
    }

    abstract void a(retrofit2.a0 r1, @javax.annotation.Nullable T r2) throws java.io.IOException;

    final retrofit2.r<java.lang.Object> b() {
            r1 = this;
            retrofit2.r$b r0 = new retrofit2.r$b
            r0.<init>(r1)
            return r0
    }

    final retrofit2.r<java.lang.Iterable<T>> c() {
            r1 = this;
            retrofit2.r$a r0 = new retrofit2.r$a
            r0.<init>(r1)
            return r0
    }
}
