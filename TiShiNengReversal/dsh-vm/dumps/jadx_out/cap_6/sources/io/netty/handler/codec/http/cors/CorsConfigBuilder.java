package io.netty.handler.codec.http.cors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class CorsConfigBuilder {
    boolean allowCredentials;
    boolean allowNullOrigin;
    final boolean anyOrigin;
    boolean enabled;
    final java.util.Set<java.lang.String> exposeHeaders;
    long maxAge;
    private boolean noPreflightHeaders;
    final java.util.Set<java.lang.String> origins;
    final java.util.Map<java.lang.CharSequence, java.util.concurrent.Callable<?>> preflightHeaders;
    final java.util.Set<java.lang.String> requestHeaders;
    final java.util.Set<io.netty.handler.codec.http.HttpMethod> requestMethods;
    boolean shortCircuit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http.cors.CorsConfigBuilder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ConstantValueGenerator implements java.util.concurrent.Callable<java.lang.Object> {
        private final java.lang.Object value;

        private ConstantValueGenerator(java.lang.Object r2) {
                r1 = this;
                r1.<init>()
                if (r2 == 0) goto L8
                r1.value = r2
                return
            L8:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "value must not be null"
                r2.<init>(r0)
                throw r2
        }

        /* synthetic */ ConstantValueGenerator(java.lang.Object r1, io.netty.handler.codec.http.cors.CorsConfigBuilder.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.concurrent.Callable
        public java.lang.Object call() {
                r1 = this;
                java.lang.Object r0 = r1.value
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class DateValueGenerator implements java.util.concurrent.Callable<java.util.Date> {
        static final io.netty.handler.codec.http.cors.CorsConfigBuilder.DateValueGenerator INSTANCE = null;

        static {
                io.netty.handler.codec.http.cors.CorsConfigBuilder$DateValueGenerator r0 = new io.netty.handler.codec.http.cors.CorsConfigBuilder$DateValueGenerator
                r0.<init>()
                io.netty.handler.codec.http.cors.CorsConfigBuilder.DateValueGenerator.INSTANCE = r0
                return
        }

        private DateValueGenerator() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.util.Date call() throws java.lang.Exception {
                r1 = this;
                java.util.Date r0 = r1.call2()
                return r0
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public java.util.Date call2() throws java.lang.Exception {
                r1 = this;
                java.util.Date r0 = new java.util.Date
                r0.<init>()
                return r0
        }
    }

    CorsConfigBuilder() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.enabled = r0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2.exposeHeaders = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2.requestMethods = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2.requestHeaders = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.preflightHeaders = r1
            r2.anyOrigin = r0
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            r2.origins = r0
            return
    }

    CorsConfigBuilder(java.lang.String... r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.enabled = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.exposeHeaders = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.requestMethods = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.requestHeaders = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.preflightHeaders = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r1.origins = r0
            r2 = 0
            r1.anyOrigin = r2
            return
    }

    public static io.netty.handler.codec.http.cors.CorsConfigBuilder forAnyOrigin() {
            io.netty.handler.codec.http.cors.CorsConfigBuilder r0 = new io.netty.handler.codec.http.cors.CorsConfigBuilder
            r0.<init>()
            return r0
    }

    public static io.netty.handler.codec.http.cors.CorsConfigBuilder forOrigin(java.lang.String r1) {
            java.lang.String r0 = "*"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le
            io.netty.handler.codec.http.cors.CorsConfigBuilder r1 = new io.netty.handler.codec.http.cors.CorsConfigBuilder
            r1.<init>()
            return r1
        Le:
            io.netty.handler.codec.http.cors.CorsConfigBuilder r0 = new io.netty.handler.codec.http.cors.CorsConfigBuilder
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r0.<init>(r1)
            return r0
    }

    public static io.netty.handler.codec.http.cors.CorsConfigBuilder forOrigins(java.lang.String... r1) {
            io.netty.handler.codec.http.cors.CorsConfigBuilder r0 = new io.netty.handler.codec.http.cors.CorsConfigBuilder
            r0.<init>(r1)
            return r0
    }

    public io.netty.handler.codec.http.cors.CorsConfigBuilder allowCredentials() {
            r1 = this;
            r0 = 1
            r1.allowCredentials = r0
            return r1
    }

    public io.netty.handler.codec.http.cors.CorsConfigBuilder allowNullOrigin() {
            r1 = this;
            r0 = 1
            r1.allowNullOrigin = r0
            return r1
    }

    public io.netty.handler.codec.http.cors.CorsConfigBuilder allowedRequestHeaders(java.lang.CharSequence... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L12
            r2 = r5[r1]
            java.util.Set<java.lang.String> r3 = r4.requestHeaders
            java.lang.String r2 = r2.toString()
            r3.add(r2)
            int r1 = r1 + 1
            goto L2
        L12:
            return r4
    }

    public io.netty.handler.codec.http.cors.CorsConfigBuilder allowedRequestHeaders(java.lang.String... r2) {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.requestHeaders
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.addAll(r2)
            return r1
    }

    public io.netty.handler.codec.http.cors.CorsConfigBuilder allowedRequestMethods(io.netty.handler.codec.http.HttpMethod... r2) {
            r1 = this;
            java.util.Set<io.netty.handler.codec.http.HttpMethod> r0 = r1.requestMethods
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.addAll(r2)
            return r1
    }

    public io.netty.handler.codec.http.cors.CorsConfig build() {
            r5 = this;
            java.util.Map<java.lang.CharSequence, java.util.concurrent.Callable<?>> r0 = r5.preflightHeaders
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L24
            boolean r0 = r5.noPreflightHeaders
            if (r0 != 0) goto L24
            java.util.Map<java.lang.CharSequence, java.util.concurrent.Callable<?>> r0 = r5.preflightHeaders
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.DATE
            io.netty.handler.codec.http.cors.CorsConfigBuilder$DateValueGenerator r2 = io.netty.handler.codec.http.cors.CorsConfigBuilder.DateValueGenerator.INSTANCE
            r0.put(r1, r2)
            java.util.Map<java.lang.CharSequence, java.util.concurrent.Callable<?>> r0 = r5.preflightHeaders
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            io.netty.handler.codec.http.cors.CorsConfigBuilder$ConstantValueGenerator r2 = new io.netty.handler.codec.http.cors.CorsConfigBuilder$ConstantValueGenerator
            java.lang.String r3 = "0"
            r4 = 0
            r2.<init>(r3, r4)
            r0.put(r1, r2)
        L24:
            io.netty.handler.codec.http.cors.CorsConfig r0 = new io.netty.handler.codec.http.cors.CorsConfig
            r0.<init>(r5)
            return r0
    }

    public io.netty.handler.codec.http.cors.CorsConfigBuilder disable() {
            r1 = this;
            r0 = 0
            r1.enabled = r0
            return r1
    }

    public io.netty.handler.codec.http.cors.CorsConfigBuilder exposeHeaders(java.lang.CharSequence... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L12
            r2 = r5[r1]
            java.util.Set<java.lang.String> r3 = r4.exposeHeaders
            java.lang.String r2 = r2.toString()
            r3.add(r2)
            int r1 = r1 + 1
            goto L2
        L12:
            return r4
    }

    public io.netty.handler.codec.http.cors.CorsConfigBuilder exposeHeaders(java.lang.String... r2) {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.exposeHeaders
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.addAll(r2)
            return r1
    }

    public io.netty.handler.codec.http.cors.CorsConfigBuilder maxAge(long r1) {
            r0 = this;
            r0.maxAge = r1
            return r0
    }

    public io.netty.handler.codec.http.cors.CorsConfigBuilder noPreflightResponseHeaders() {
            r1 = this;
            r0 = 1
            r1.noPreflightHeaders = r0
            return r1
    }

    public <T> io.netty.handler.codec.http.cors.CorsConfigBuilder preflightResponseHeader(java.lang.CharSequence r4, java.lang.Iterable<T> r5) {
            r3 = this;
            java.util.Map<java.lang.CharSequence, java.util.concurrent.Callable<?>> r0 = r3.preflightHeaders
            io.netty.handler.codec.http.cors.CorsConfigBuilder$ConstantValueGenerator r1 = new io.netty.handler.codec.http.cors.CorsConfigBuilder$ConstantValueGenerator
            r2 = 0
            r1.<init>(r5, r2)
            r0.put(r4, r1)
            return r3
    }

    public <T> io.netty.handler.codec.http.cors.CorsConfigBuilder preflightResponseHeader(java.lang.CharSequence r2, java.util.concurrent.Callable<T> r3) {
            r1 = this;
            java.util.Map<java.lang.CharSequence, java.util.concurrent.Callable<?>> r0 = r1.preflightHeaders
            r0.put(r2, r3)
            return r1
    }

    public io.netty.handler.codec.http.cors.CorsConfigBuilder preflightResponseHeader(java.lang.CharSequence r4, java.lang.Object... r5) {
            r3 = this;
            int r0 = r5.length
            r1 = 1
            if (r0 != r1) goto L13
            java.util.Map<java.lang.CharSequence, java.util.concurrent.Callable<?>> r0 = r3.preflightHeaders
            io.netty.handler.codec.http.cors.CorsConfigBuilder$ConstantValueGenerator r1 = new io.netty.handler.codec.http.cors.CorsConfigBuilder$ConstantValueGenerator
            r2 = 0
            r5 = r5[r2]
            r2 = 0
            r1.<init>(r5, r2)
            r0.put(r4, r1)
            return r3
        L13:
            java.util.List r5 = java.util.Arrays.asList(r5)
            r3.preflightResponseHeader(r4, r5)
            return r3
    }

    public io.netty.handler.codec.http.cors.CorsConfigBuilder shortCircuit() {
            r1 = this;
            r0 = 1
            r1.shortCircuit = r0
            return r1
    }
}
