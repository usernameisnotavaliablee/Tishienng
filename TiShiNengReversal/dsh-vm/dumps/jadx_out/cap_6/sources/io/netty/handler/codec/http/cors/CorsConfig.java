package io.netty.handler.codec.http.cors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class CorsConfig {
    private final boolean allowCredentials;
    private final boolean allowNullOrigin;
    private final java.util.Set<java.lang.String> allowedRequestHeaders;
    private final java.util.Set<io.netty.handler.codec.http.HttpMethod> allowedRequestMethods;
    private final boolean anyOrigin;
    private final boolean enabled;
    private final java.util.Set<java.lang.String> exposeHeaders;
    private final long maxAge;
    private final java.util.Set<java.lang.String> origins;
    private final java.util.Map<java.lang.CharSequence, java.util.concurrent.Callable<?>> preflightHeaders;
    private final boolean shortCircuit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.Deprecated
    public static class Builder {
        private final io.netty.handler.codec.http.cors.CorsConfigBuilder builder;

        @java.lang.Deprecated
        public Builder() {
                r1 = this;
                r1.<init>()
                io.netty.handler.codec.http.cors.CorsConfigBuilder r0 = new io.netty.handler.codec.http.cors.CorsConfigBuilder
                r0.<init>()
                r1.builder = r0
                return
        }

        @java.lang.Deprecated
        public Builder(java.lang.String... r2) {
                r1 = this;
                r1.<init>()
                io.netty.handler.codec.http.cors.CorsConfigBuilder r0 = new io.netty.handler.codec.http.cors.CorsConfigBuilder
                r0.<init>(r2)
                r1.builder = r0
                return
        }

        @java.lang.Deprecated
        public io.netty.handler.codec.http.cors.CorsConfig.Builder allowCredentials() {
                r1 = this;
                io.netty.handler.codec.http.cors.CorsConfigBuilder r0 = r1.builder
                r0.allowCredentials()
                return r1
        }

        @java.lang.Deprecated
        public io.netty.handler.codec.http.cors.CorsConfig.Builder allowNullOrigin() {
                r1 = this;
                io.netty.handler.codec.http.cors.CorsConfigBuilder r0 = r1.builder
                r0.allowNullOrigin()
                return r1
        }

        @java.lang.Deprecated
        public io.netty.handler.codec.http.cors.CorsConfig.Builder allowedRequestHeaders(java.lang.String... r2) {
                r1 = this;
                io.netty.handler.codec.http.cors.CorsConfigBuilder r0 = r1.builder
                r0.allowedRequestHeaders(r2)
                return r1
        }

        @java.lang.Deprecated
        public io.netty.handler.codec.http.cors.CorsConfig.Builder allowedRequestMethods(io.netty.handler.codec.http.HttpMethod... r2) {
                r1 = this;
                io.netty.handler.codec.http.cors.CorsConfigBuilder r0 = r1.builder
                r0.allowedRequestMethods(r2)
                return r1
        }

        @java.lang.Deprecated
        public io.netty.handler.codec.http.cors.CorsConfig build() {
                r1 = this;
                io.netty.handler.codec.http.cors.CorsConfigBuilder r0 = r1.builder
                io.netty.handler.codec.http.cors.CorsConfig r0 = r0.build()
                return r0
        }

        @java.lang.Deprecated
        public io.netty.handler.codec.http.cors.CorsConfig.Builder disable() {
                r1 = this;
                io.netty.handler.codec.http.cors.CorsConfigBuilder r0 = r1.builder
                r0.disable()
                return r1
        }

        @java.lang.Deprecated
        public io.netty.handler.codec.http.cors.CorsConfig.Builder exposeHeaders(java.lang.String... r2) {
                r1 = this;
                io.netty.handler.codec.http.cors.CorsConfigBuilder r0 = r1.builder
                r0.exposeHeaders(r2)
                return r1
        }

        @java.lang.Deprecated
        public io.netty.handler.codec.http.cors.CorsConfig.Builder maxAge(long r2) {
                r1 = this;
                io.netty.handler.codec.http.cors.CorsConfigBuilder r0 = r1.builder
                r0.maxAge(r2)
                return r1
        }

        @java.lang.Deprecated
        public io.netty.handler.codec.http.cors.CorsConfig.Builder noPreflightResponseHeaders() {
                r1 = this;
                io.netty.handler.codec.http.cors.CorsConfigBuilder r0 = r1.builder
                r0.noPreflightResponseHeaders()
                return r1
        }

        @java.lang.Deprecated
        public <T> io.netty.handler.codec.http.cors.CorsConfig.Builder preflightResponseHeader(java.lang.CharSequence r2, java.lang.Iterable<T> r3) {
                r1 = this;
                io.netty.handler.codec.http.cors.CorsConfigBuilder r0 = r1.builder
                r0.preflightResponseHeader(r2, r3)
                return r1
        }

        @java.lang.Deprecated
        public io.netty.handler.codec.http.cors.CorsConfig.Builder preflightResponseHeader(java.lang.CharSequence r2, java.lang.Object... r3) {
                r1 = this;
                io.netty.handler.codec.http.cors.CorsConfigBuilder r0 = r1.builder
                r0.preflightResponseHeader(r2, r3)
                return r1
        }

        @java.lang.Deprecated
        public <T> io.netty.handler.codec.http.cors.CorsConfig.Builder preflightResponseHeader(java.lang.String r2, java.util.concurrent.Callable<T> r3) {
                r1 = this;
                io.netty.handler.codec.http.cors.CorsConfigBuilder r0 = r1.builder
                r0.preflightResponseHeader(r2, r3)
                return r1
        }

        @java.lang.Deprecated
        public io.netty.handler.codec.http.cors.CorsConfig.Builder shortCurcuit() {
                r1 = this;
                io.netty.handler.codec.http.cors.CorsConfigBuilder r0 = r1.builder
                r0.shortCircuit()
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.Deprecated
    public static final class DateValueGenerator implements java.util.concurrent.Callable<java.util.Date> {
        public DateValueGenerator() {
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

    CorsConfig(io.netty.handler.codec.http.cors.CorsConfigBuilder r3) {
            r2 = this;
            r2.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.util.Set<java.lang.String> r1 = r3.origins
            r0.<init>(r1)
            r2.origins = r0
            boolean r0 = r3.anyOrigin
            r2.anyOrigin = r0
            boolean r0 = r3.enabled
            r2.enabled = r0
            java.util.Set<java.lang.String> r0 = r3.exposeHeaders
            r2.exposeHeaders = r0
            boolean r0 = r3.allowCredentials
            r2.allowCredentials = r0
            long r0 = r3.maxAge
            r2.maxAge = r0
            java.util.Set<io.netty.handler.codec.http.HttpMethod> r0 = r3.requestMethods
            r2.allowedRequestMethods = r0
            java.util.Set<java.lang.String> r0 = r3.requestHeaders
            r2.allowedRequestHeaders = r0
            boolean r0 = r3.allowNullOrigin
            r2.allowNullOrigin = r0
            java.util.Map<java.lang.CharSequence, java.util.concurrent.Callable<?>> r0 = r3.preflightHeaders
            r2.preflightHeaders = r0
            boolean r3 = r3.shortCircuit
            r2.shortCircuit = r3
            return
    }

    private static <T> T getValue(java.util.concurrent.Callable<T> r4) {
            java.lang.Object r4 = r4.call()     // Catch: java.lang.Exception -> L5
            return r4
        L5:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not generate value for callable ["
            r2.append(r3)
            r2.append(r4)
            r4 = 93
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
    }

    @java.lang.Deprecated
    public static io.netty.handler.codec.http.cors.CorsConfig.Builder withAnyOrigin() {
            io.netty.handler.codec.http.cors.CorsConfig$Builder r0 = new io.netty.handler.codec.http.cors.CorsConfig$Builder
            r0.<init>()
            return r0
    }

    @java.lang.Deprecated
    public static io.netty.handler.codec.http.cors.CorsConfig.Builder withOrigin(java.lang.String r1) {
            java.lang.String r0 = "*"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le
            io.netty.handler.codec.http.cors.CorsConfig$Builder r1 = new io.netty.handler.codec.http.cors.CorsConfig$Builder
            r1.<init>()
            return r1
        Le:
            io.netty.handler.codec.http.cors.CorsConfig$Builder r0 = new io.netty.handler.codec.http.cors.CorsConfig$Builder
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    public static io.netty.handler.codec.http.cors.CorsConfig.Builder withOrigins(java.lang.String... r1) {
            io.netty.handler.codec.http.cors.CorsConfig$Builder r0 = new io.netty.handler.codec.http.cors.CorsConfig$Builder
            r0.<init>(r1)
            return r0
    }

    public java.util.Set<java.lang.String> allowedRequestHeaders() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.allowedRequestHeaders
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    public java.util.Set<io.netty.handler.codec.http.HttpMethod> allowedRequestMethods() {
            r1 = this;
            java.util.Set<io.netty.handler.codec.http.HttpMethod> r0 = r1.allowedRequestMethods
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    public java.util.Set<java.lang.String> exposedHeaders() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.exposeHeaders
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    public boolean isAnyOriginSupported() {
            r1 = this;
            boolean r0 = r1.anyOrigin
            return r0
    }

    public boolean isCorsSupportEnabled() {
            r1 = this;
            boolean r0 = r1.enabled
            return r0
    }

    public boolean isCredentialsAllowed() {
            r1 = this;
            boolean r0 = r1.allowCredentials
            return r0
    }

    public boolean isNullOriginAllowed() {
            r1 = this;
            boolean r0 = r1.allowNullOrigin
            return r0
    }

    public boolean isShortCircuit() {
            r1 = this;
            boolean r0 = r1.shortCircuit
            return r0
    }

    @java.lang.Deprecated
    public boolean isShortCurcuit() {
            r1 = this;
            boolean r0 = r1.isShortCircuit()
            return r0
    }

    public long maxAge() {
            r2 = this;
            long r0 = r2.maxAge
            return r0
    }

    public java.lang.String origin() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.origins
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            java.lang.String r0 = "*"
            return r0
        Lb:
            java.util.Set<java.lang.String> r0 = r1.origins
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public java.util.Set<java.lang.String> origins() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.origins
            return r0
    }

    public io.netty.handler.codec.http.HttpHeaders preflightResponseHeaders() {
            r5 = this;
            java.util.Map<java.lang.CharSequence, java.util.concurrent.Callable<?>> r0 = r5.preflightHeaders
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            io.netty.handler.codec.http.EmptyHttpHeaders r0 = io.netty.handler.codec.http.EmptyHttpHeaders.INSTANCE
            return r0
        Lb:
            io.netty.handler.codec.http.DefaultHttpHeaders r0 = new io.netty.handler.codec.http.DefaultHttpHeaders
            r0.<init>()
            java.util.Map<java.lang.CharSequence, java.util.concurrent.Callable<?>> r1 = r5.preflightHeaders
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.util.concurrent.Callable r3 = (java.util.concurrent.Callable) r3
            java.lang.Object r3 = getValue(r3)
            boolean r4 = r3 instanceof java.lang.Iterable
            if (r4 == 0) goto L40
            java.lang.Object r2 = r2.getKey()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r0.add(r2, r3)
            goto L1a
        L40:
            java.lang.Object r2 = r2.getKey()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.add(r2, r3)
            goto L1a
        L4a:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.append(r1)
            java.lang.String r1 = "[enabled="
            r0.append(r1)
            boolean r1 = r3.enabled
            r0.append(r1)
            java.lang.String r1 = ", origins="
            r0.append(r1)
            java.util.Set<java.lang.String> r1 = r3.origins
            r0.append(r1)
            java.lang.String r1 = ", anyOrigin="
            r0.append(r1)
            boolean r1 = r3.anyOrigin
            r0.append(r1)
            java.lang.String r1 = ", exposedHeaders="
            r0.append(r1)
            java.util.Set<java.lang.String> r1 = r3.exposeHeaders
            r0.append(r1)
            java.lang.String r1 = ", isCredentialsAllowed="
            r0.append(r1)
            boolean r1 = r3.allowCredentials
            r0.append(r1)
            java.lang.String r1 = ", maxAge="
            r0.append(r1)
            long r1 = r3.maxAge
            r0.append(r1)
            java.lang.String r1 = ", allowedRequestMethods="
            r0.append(r1)
            java.util.Set<io.netty.handler.codec.http.HttpMethod> r1 = r3.allowedRequestMethods
            r0.append(r1)
            java.lang.String r1 = ", allowedRequestHeaders="
            r0.append(r1)
            java.util.Set<java.lang.String> r1 = r3.allowedRequestHeaders
            r0.append(r1)
            java.lang.String r1 = ", preflightHeaders="
            r0.append(r1)
            java.util.Map<java.lang.CharSequence, java.util.concurrent.Callable<?>> r1 = r3.preflightHeaders
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
