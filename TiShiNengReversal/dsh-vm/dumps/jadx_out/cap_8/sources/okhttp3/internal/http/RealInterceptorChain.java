package okhttp3.internal.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRealInterceptorChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealInterceptorChain.kt\nokhttp3/internal/http/RealInterceptorChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class RealInterceptorChain implements okhttp3.Interceptor.Chain {

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealCall call;
    private int calls;
    private final int connectTimeoutMillis;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.internal.connection.Exchange exchange;
    private final int index;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<okhttp3.Interceptor> interceptors;
    private final int readTimeoutMillis;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Request request;
    private final int writeTimeoutMillis;

    public RealInterceptorChain(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall r2, @org.jetbrains.annotations.NotNull java.util.List<? extends okhttp3.Interceptor> r3, int r4, @org.jetbrains.annotations.Nullable okhttp3.internal.connection.Exchange r5, @org.jetbrains.annotations.NotNull okhttp3.Request r6, int r7, int r8, int r9) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "interceptors"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "request"
            kotlin.jvm.internal.g0.p(r6, r0)
            r1.<init>()
            r1.call = r2
            r1.interceptors = r3
            r1.index = r4
            r1.exchange = r5
            r1.request = r6
            r1.connectTimeoutMillis = r7
            r1.readTimeoutMillis = r8
            r1.writeTimeoutMillis = r9
            return
    }

    public static /* synthetic */ okhttp3.internal.http.RealInterceptorChain copy$okhttp$default(okhttp3.internal.http.RealInterceptorChain r0, int r1, okhttp3.internal.connection.Exchange r2, okhttp3.Request r3, int r4, int r5, int r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            if (r8 == 0) goto L6
            int r1 = r0.index
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Lc
            okhttp3.internal.connection.Exchange r2 = r0.exchange
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L12
            okhttp3.Request r3 = r0.request
        L12:
            r8 = r7 & 8
            if (r8 == 0) goto L18
            int r4 = r0.connectTimeoutMillis
        L18:
            r8 = r7 & 16
            if (r8 == 0) goto L1e
            int r5 = r0.readTimeoutMillis
        L1e:
            r7 = r7 & 32
            if (r7 == 0) goto L24
            int r6 = r0.writeTimeoutMillis
        L24:
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            r2 = r0
            okhttp3.internal.http.RealInterceptorChain r0 = r2.copy$okhttp(r3, r4, r5, r6, r7, r8)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Call call() {
            r1 = this;
            okhttp3.internal.connection.RealCall r0 = r1.call
            return r0
    }

    public int connectTimeoutMillis() {
            r1 = this;
            int r0 = r1.connectTimeoutMillis
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public okhttp3.Connection connection() {
            r1 = this;
            okhttp3.internal.connection.Exchange r0 = r1.exchange
            if (r0 == 0) goto L9
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection$okhttp()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http.RealInterceptorChain copy$okhttp(int r11, @org.jetbrains.annotations.Nullable okhttp3.internal.connection.Exchange r12, @org.jetbrains.annotations.NotNull okhttp3.Request r13, int r14, int r15, int r16) {
            r10 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.g0.p(r13, r0)
            okhttp3.internal.http.RealInterceptorChain r1 = new okhttp3.internal.http.RealInterceptorChain
            okhttp3.internal.connection.RealCall r2 = r10.call
            java.util.List<okhttp3.Interceptor> r3 = r10.interceptors
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.RealCall getCall$okhttp() {
            r1 = this;
            okhttp3.internal.connection.RealCall r0 = r1.call
            return r0
    }

    public final int getConnectTimeoutMillis$okhttp() {
            r1 = this;
            int r0 = r1.connectTimeoutMillis
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.connection.Exchange getExchange$okhttp() {
            r1 = this;
            okhttp3.internal.connection.Exchange r0 = r1.exchange
            return r0
    }

    public final int getReadTimeoutMillis$okhttp() {
            r1 = this;
            int r0 = r1.readTimeoutMillis
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.Request getRequest$okhttp() {
            r1 = this;
            okhttp3.Request r0 = r1.request
            return r0
    }

    public final int getWriteTimeoutMillis$okhttp() {
            r1 = this;
            int r0 = r1.writeTimeoutMillis
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Response proceed(@org.jetbrains.annotations.NotNull okhttp3.Request r14) throws java.io.IOException {
            r13 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.g0.p(r14, r0)
            int r0 = r13.index
            java.util.List<okhttp3.Interceptor> r1 = r13.interceptors
            int r1 = r1.size()
            if (r0 >= r1) goto Lee
            int r0 = r13.calls
            r1 = 1
            int r0 = r0 + r1
            r13.calls = r0
            okhttp3.internal.connection.Exchange r0 = r13.exchange
            java.lang.String r2 = " must call proceed() exactly once"
            java.lang.String r3 = "network interceptor "
            if (r0 == 0) goto L80
            okhttp3.internal.connection.ExchangeFinder r0 = r0.getFinder$okhttp()
            okhttp3.internal.connection.RoutePlanner r0 = r0.getRoutePlanner()
            okhttp3.HttpUrl r4 = r14.url()
            boolean r0 = r0.sameHostAndPort(r4)
            if (r0 == 0) goto L59
            int r0 = r13.calls
            if (r0 != r1) goto L34
            goto L80
        L34:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r3)
            java.util.List<okhttp3.Interceptor> r0 = r13.interceptors
            int r3 = r13.index
            int r3 = r3 - r1
            java.lang.Object r0 = r0.get(r3)
            r14.append(r0)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        L59:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r3)
            java.util.List<okhttp3.Interceptor> r0 = r13.interceptors
            int r2 = r13.index
            int r2 = r2 - r1
            java.lang.Object r0 = r0.get(r2)
            r14.append(r0)
            java.lang.String r0 = " must retain the same host and port"
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        L80:
            int r0 = r13.index
            int r5 = r0 + 1
            r11 = 58
            r12 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r4 = r13
            r7 = r14
            okhttp3.internal.http.RealInterceptorChain r14 = copy$okhttp$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.util.List<okhttp3.Interceptor> r0 = r4.interceptors
            int r5 = r4.index
            java.lang.Object r0 = r0.get(r5)
            okhttp3.Interceptor r0 = (okhttp3.Interceptor) r0
            okhttp3.Response r5 = r0.intercept(r14)
            if (r5 == 0) goto Ld2
            okhttp3.internal.connection.Exchange r6 = r4.exchange
            if (r6 == 0) goto Ld1
            int r6 = r4.index
            int r6 = r6 + r1
            java.util.List<okhttp3.Interceptor> r7 = r4.interceptors
            int r7 = r7.size()
            if (r6 >= r7) goto Ld1
            int r14 = r14.calls
            if (r14 != r1) goto Lb5
            goto Ld1
        Lb5:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r3)
            r14.append(r0)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        Ld1:
            return r5
        Ld2:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "interceptor "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " returned null"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r14.<init>(r0)
            throw r14
        Lee:
            r4 = r13
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r14.<init>(r0)
            throw r14
    }

    public int readTimeoutMillis() {
            r1 = this;
            int r0 = r1.readTimeoutMillis
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Request request() {
            r1 = this;
            okhttp3.Request r0 = r1.request
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Interceptor.Chain withConnectTimeout(int r13, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r14) {
            r12 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.g0.p(r14, r0)
            okhttp3.internal.connection.Exchange r0 = r12.exchange
            if (r0 != 0) goto L1e
            java.lang.String r0 = "connectTimeout"
            long r1 = (long) r13
            int r7 = okhttp3.internal._UtilJvmKt.checkDuration(r0, r1, r14)
            r10 = 55
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r3 = r12
            okhttp3.internal.http.RealInterceptorChain r13 = copy$okhttp$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        L1e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Timeouts can't be adjusted in a network interceptor"
            r13.<init>(r14)
            throw r13
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Interceptor.Chain withReadTimeout(int r13, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r14) {
            r12 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.g0.p(r14, r0)
            okhttp3.internal.connection.Exchange r0 = r12.exchange
            if (r0 != 0) goto L1e
            java.lang.String r0 = "readTimeout"
            long r1 = (long) r13
            int r8 = okhttp3.internal._UtilJvmKt.checkDuration(r0, r1, r14)
            r10 = 47
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r3 = r12
            okhttp3.internal.http.RealInterceptorChain r13 = copy$okhttp$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        L1e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Timeouts can't be adjusted in a network interceptor"
            r13.<init>(r14)
            throw r13
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Interceptor.Chain withWriteTimeout(int r13, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r14) {
            r12 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.g0.p(r14, r0)
            okhttp3.internal.connection.Exchange r0 = r12.exchange
            if (r0 != 0) goto L1f
            java.lang.String r0 = "writeTimeout"
            long r1 = (long) r13
            int r9 = okhttp3.internal._UtilJvmKt.checkDuration(r0, r1, r14)
            r10 = 31
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r12
            okhttp3.internal.http.RealInterceptorChain r13 = copy$okhttp$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        L1f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Timeouts can't be adjusted in a network interceptor"
            r13.<init>(r14)
            throw r13
    }

    public int writeTimeoutMillis() {
            r1 = this;
            int r0 = r1.writeTimeoutMillis
            return r0
    }
}
