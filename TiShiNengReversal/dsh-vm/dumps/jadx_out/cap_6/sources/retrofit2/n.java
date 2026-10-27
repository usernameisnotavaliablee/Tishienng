package retrofit2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class n<T> implements retrofit2.b<T> {
    private final retrofit2.b0 a;
    private final java.lang.Object[] b;
    private final okhttp3.Call.Factory c;
    private final retrofit2.g<okhttp3.ResponseBody, T> d;
    private volatile boolean e;

    @javax.annotation.concurrent.GuardedBy("this")
    @javax.annotation.Nullable
    private okhttp3.Call f;

    @javax.annotation.concurrent.GuardedBy("this")
    @javax.annotation.Nullable
    private java.lang.Throwable g;

    @javax.annotation.concurrent.GuardedBy("this")
    private boolean h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements okhttp3.Callback {
        final /* synthetic */ retrofit2.d a;
        final /* synthetic */ retrofit2.n b;

        a(retrofit2.n r1, retrofit2.d r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        private void a(java.lang.Throwable r3) {
                r2 = this;
                retrofit2.d r0 = r2.a     // Catch: java.lang.Throwable -> L8
                retrofit2.n r1 = r2.b     // Catch: java.lang.Throwable -> L8
                r0.a(r1, r3)     // Catch: java.lang.Throwable -> L8
                return
            L8:
                r3 = move-exception
                retrofit2.f0.s(r3)
                return
        }

        public void onFailure(okhttp3.Call r1, java.io.IOException r2) {
                r0 = this;
                r0.a(r2)
                return
        }

        public void onResponse(okhttp3.Call r2, okhttp3.Response r3) {
                r1 = this;
                retrofit2.n r2 = r1.b     // Catch: java.lang.Throwable -> L13
                retrofit2.c0 r2 = r2.e(r3)     // Catch: java.lang.Throwable -> L13
                retrofit2.d r3 = r1.a     // Catch: java.lang.Throwable -> Le
                retrofit2.n r0 = r1.b     // Catch: java.lang.Throwable -> Le
                r3.b(r0, r2)     // Catch: java.lang.Throwable -> Le
                return
            Le:
                r2 = move-exception
                retrofit2.f0.s(r2)
                return
            L13:
                r2 = move-exception
                retrofit2.f0.s(r2)
                r1.a(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b extends okhttp3.ResponseBody {
        private final okhttp3.ResponseBody a;
        private final okio.BufferedSource b;

        @javax.annotation.Nullable
        java.io.IOException c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends okio.ForwardingSource {
            final /* synthetic */ retrofit2.n.b a;

            a(retrofit2.n.b r1, okio.Source r2) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>(r2)
                    return
            }

            public long read(okio.Buffer r1, long r2) throws java.io.IOException {
                    r0 = this;
                    long r1 = super.read(r1, r2)     // Catch: java.io.IOException -> L5
                    return r1
                L5:
                    r1 = move-exception
                    retrofit2.n$b r2 = r0.a
                    r2.c = r1
                    throw r1
            }
        }

        b(okhttp3.ResponseBody r2) {
                r1 = this;
                r1.<init>()
                r1.a = r2
                retrofit2.n$b$a r0 = new retrofit2.n$b$a
                okio.BufferedSource r2 = r2.source()
                r0.<init>(r1, r2)
                okio.BufferedSource r2 = okio.Okio.buffer(r0)
                r1.b = r2
                return
        }

        void a() throws java.io.IOException {
                r1 = this;
                java.io.IOException r0 = r1.c
                if (r0 != 0) goto L5
                return
            L5:
                throw r0
        }

        public void close() {
                r1 = this;
                okhttp3.ResponseBody r0 = r1.a
                r0.close()
                return
        }

        public long contentLength() {
                r2 = this;
                okhttp3.ResponseBody r0 = r2.a
                long r0 = r0.contentLength()
                return r0
        }

        public okhttp3.MediaType contentType() {
                r1 = this;
                okhttp3.ResponseBody r0 = r1.a
                okhttp3.MediaType r0 = r0.contentType()
                return r0
        }

        public okio.BufferedSource source() {
                r1 = this;
                okio.BufferedSource r0 = r1.b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c extends okhttp3.ResponseBody {

        @javax.annotation.Nullable
        private final okhttp3.MediaType a;
        private final long b;

        c(@javax.annotation.Nullable okhttp3.MediaType r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public long contentLength() {
                r2 = this;
                long r0 = r2.b
                return r0
        }

        public okhttp3.MediaType contentType() {
                r1 = this;
                okhttp3.MediaType r0 = r1.a
                return r0
        }

        public okio.BufferedSource source() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Cannot read raw response body of a converted body."
                r0.<init>(r1)
                throw r0
        }
    }

    n(retrofit2.b0 r1, java.lang.Object[] r2, okhttp3.Call.Factory r3, retrofit2.g<okhttp3.ResponseBody, T> r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    private okhttp3.Call b() throws java.io.IOException {
            r3 = this;
            okhttp3.Call$Factory r0 = r3.c
            retrofit2.b0 r1 = r3.a
            java.lang.Object[] r2 = r3.b
            okhttp3.Request r1 = r1.a(r2)
            okhttp3.Call r0 = r0.newCall(r1)
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Call.Factory returned null."
            r0.<init>(r1)
            throw r0
    }

    @javax.annotation.concurrent.GuardedBy("this")
    private okhttp3.Call c() throws java.io.IOException {
            r2 = this;
            okhttp3.Call r0 = r2.f
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Throwable r0 = r2.g
            if (r0 == 0) goto L1a
            boolean r1 = r0 instanceof java.io.IOException
            if (r1 != 0) goto L17
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 == 0) goto L14
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L14:
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L17:
            java.io.IOException r0 = (java.io.IOException) r0
            throw r0
        L1a:
            okhttp3.Call r0 = r2.b()     // Catch: java.io.IOException -> L21 java.lang.Error -> L23 java.lang.RuntimeException -> L25
            r2.f = r0     // Catch: java.io.IOException -> L21 java.lang.Error -> L23 java.lang.RuntimeException -> L25
            return r0
        L21:
            r0 = move-exception
            goto L26
        L23:
            r0 = move-exception
            goto L26
        L25:
            r0 = move-exception
        L26:
            retrofit2.f0.s(r0)
            r2.g = r0
            throw r0
    }

    public retrofit2.n<T> a() {
            r5 = this;
            retrofit2.n r0 = new retrofit2.n
            retrofit2.b0 r1 = r5.a
            java.lang.Object[] r2 = r5.b
            okhttp3.Call$Factory r3 = r5.c
            retrofit2.g<okhttp3.ResponseBody, T> r4 = r5.d
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // retrofit2.b
    public void cancel() {
            r1 = this;
            r0 = 1
            r1.e = r0
            monitor-enter(r1)
            okhttp3.Call r0 = r1.f     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lc
            r0.cancel()
        Lc:
            return
        Ld:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            retrofit2.n r0 = r1.a()
            return r0
    }

    @Override // retrofit2.b
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ retrofit2.b mo216clone() {
            r1 = this;
            retrofit2.n r0 = r1.a()
            return r0
    }

    retrofit2.c0<T> e(okhttp3.Response r6) throws java.io.IOException {
            r5 = this;
            okhttp3.ResponseBody r0 = r6.body()
            okhttp3.Response$Builder r6 = r6.newBuilder()
            retrofit2.n$c r1 = new retrofit2.n$c
            okhttp3.MediaType r2 = r0.contentType()
            long r3 = r0.contentLength()
            r1.<init>(r2, r3)
            okhttp3.Response$Builder r6 = r6.body(r1)
            okhttp3.Response r6 = r6.build()
            int r1 = r6.code()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 < r2) goto L51
            r2 = 300(0x12c, float:4.2E-43)
            if (r1 < r2) goto L2a
            goto L51
        L2a:
            r2 = 204(0xcc, float:2.86E-43)
            if (r1 == r2) goto L48
            r2 = 205(0xcd, float:2.87E-43)
            if (r1 != r2) goto L33
            goto L48
        L33:
            retrofit2.n$b r1 = new retrofit2.n$b
            r1.<init>(r0)
            retrofit2.g<okhttp3.ResponseBody, T> r0 = r5.d     // Catch: java.lang.RuntimeException -> L43
            java.lang.Object r0 = r0.convert(r1)     // Catch: java.lang.RuntimeException -> L43
            retrofit2.c0 r6 = retrofit2.c0.m(r0, r6)     // Catch: java.lang.RuntimeException -> L43
            return r6
        L43:
            r6 = move-exception
            r1.a()
            throw r6
        L48:
            r0.close()
            r0 = 0
            retrofit2.c0 r6 = retrofit2.c0.m(r0, r6)
            return r6
        L51:
            okhttp3.ResponseBody r1 = retrofit2.f0.a(r0)     // Catch: java.lang.Throwable -> L5d
            retrofit2.c0 r6 = retrofit2.c0.d(r1, r6)     // Catch: java.lang.Throwable -> L5d
            r0.close()
            return r6
        L5d:
            r6 = move-exception
            r0.close()
            throw r6
    }

    @Override // retrofit2.b
    public retrofit2.c0<T> execute() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.h     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L1f
            r0 = 1
            r2.h = r0     // Catch: java.lang.Throwable -> L1d
            okhttp3.Call r0 = r2.c()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r2.e
            if (r1 == 0) goto L14
            r0.cancel()
        L14:
            okhttp3.Response r0 = r0.execute()
            retrofit2.c0 r0 = r2.e(r0)
            return r0
        L1d:
            r0 = move-exception
            goto L27
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "Already executed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            throw r0     // Catch: java.lang.Throwable -> L1d
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r0
    }

    @Override // retrofit2.b
    public boolean isCanceled() {
            r2 = this;
            boolean r0 = r2.e
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            monitor-enter(r2)
            okhttp3.Call r0 = r2.f     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            boolean r0 = r0.isCanceled()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            goto L15
        L12:
            r0 = move-exception
            goto L17
        L14:
            r1 = 0
        L15:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            return r1
        L17:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    @Override // retrofit2.b
    public synchronized boolean isExecuted() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.h     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // retrofit2.b
    public void j(retrofit2.d<T> r4) {
            r3 = this;
            java.lang.String r0 = "callback == null"
            java.util.Objects.requireNonNull(r4, r0)
            monitor-enter(r3)
            boolean r0 = r3.h     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L3d
            r0 = 1
            r3.h = r0     // Catch: java.lang.Throwable -> L24
            okhttp3.Call r0 = r3.f     // Catch: java.lang.Throwable -> L24
            java.lang.Throwable r1 = r3.g     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L26
            if (r1 != 0) goto L26
            okhttp3.Call r2 = r3.b()     // Catch: java.lang.Throwable -> L1d
            r3.f = r2     // Catch: java.lang.Throwable -> L1d
            r0 = r2
            goto L26
        L1d:
            r1 = move-exception
            retrofit2.f0.s(r1)     // Catch: java.lang.Throwable -> L24
            r3.g = r1     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r4 = move-exception
            goto L45
        L26:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L2d
            r4.a(r3, r1)
            return
        L2d:
            boolean r1 = r3.e
            if (r1 == 0) goto L34
            r0.cancel()
        L34:
            retrofit2.n$a r1 = new retrofit2.n$a
            r1.<init>(r3, r4)
            r0.enqueue(r1)
            return
        L3d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = "Already executed."
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L24
            throw r4     // Catch: java.lang.Throwable -> L24
        L45:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r4
    }

    @Override // retrofit2.b
    public synchronized okhttp3.Request request() {
            r3 = this;
            monitor-enter(r3)
            okhttp3.Call r0 = r3.c()     // Catch: java.lang.Throwable -> Lb java.io.IOException -> Ld
            okhttp3.Request r0 = r0.request()     // Catch: java.lang.Throwable -> Lb java.io.IOException -> Ld
            monitor-exit(r3)
            return r0
        Lb:
            r0 = move-exception
            goto L16
        Ld:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = "Unable to create request."
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> Lb
            throw r1     // Catch: java.lang.Throwable -> Lb
        L16:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    @Override // retrofit2.b
    public synchronized okio.Timeout timeout() {
            r3 = this;
            monitor-enter(r3)
            okhttp3.Call r0 = r3.c()     // Catch: java.lang.Throwable -> Lb java.io.IOException -> Ld
            okio.Timeout r0 = r0.timeout()     // Catch: java.lang.Throwable -> Lb java.io.IOException -> Ld
            monitor-exit(r3)
            return r0
        Lb:
            r0 = move-exception
            goto L16
        Ld:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = "Unable to create call."
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> Lb
            throw r1     // Catch: java.lang.Throwable -> Lb
        L16:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }
}
