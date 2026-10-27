package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1388:1\n2746#2,3:1389\n2746#2,3:1392\n1#3:1395\n*S KotlinDebug\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient\n*L\n278#1:1389,3\n340#1:1392,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class OkHttpClient implements okhttp3.Call.Factory, okhttp3.WebSocket.Factory {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.OkHttpClient.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<okhttp3.ConnectionSpec> DEFAULT_CONNECTION_SPECS = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<okhttp3.Protocol> DEFAULT_PROTOCOLS = null;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Authenticator authenticator;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.Cache cache;
    private final int callTimeoutMillis;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.ConnectionPool connectionPool;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<okhttp3.ConnectionSpec> connectionSpecs;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.CookieJar cookieJar;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Dispatcher dispatcher;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Dns dns;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.EventListener.Factory eventListenerFactory;
    private final boolean fastFallback;
    private final boolean followRedirects;
    private final boolean followSslRedirects;

    @org.jetbrains.annotations.NotNull
    private final javax.net.ssl.HostnameVerifier hostnameVerifier;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<okhttp3.Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<okhttp3.Interceptor> networkInterceptors;
    private final int pingIntervalMillis;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<okhttp3.Protocol> protocols;

    @org.jetbrains.annotations.Nullable
    private final java.net.Proxy proxy;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Authenticator proxyAuthenticator;

    @org.jetbrains.annotations.NotNull
    private final java.net.ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RouteDatabase routeDatabase;

    @org.jetbrains.annotations.NotNull
    private final javax.net.SocketFactory socketFactory;

    @org.jetbrains.annotations.Nullable
    private final javax.net.ssl.SSLSocketFactory sslSocketFactoryOrNull;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.concurrent.TaskRunner taskRunner;
    private final int webSocketCloseTimeout;
    private final int writeTimeoutMillis;

    @org.jetbrains.annotations.Nullable
    private final javax.net.ssl.X509TrustManager x509TrustManager;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -UtilJvm.kt\nokhttp3/internal/_UtilJvmKt\n*L\n1#1,1388:1\n1#2:1389\n242#3:1390\n*S KotlinDebug\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n*L\n1048#1:1390\n*E\n"})
    public static final class Builder {

        @org.jetbrains.annotations.NotNull
        private okhttp3.Authenticator authenticator;

        @org.jetbrains.annotations.Nullable
        private okhttp3.Cache cache;
        private int callTimeout;

        @org.jetbrains.annotations.Nullable
        private okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner;

        @org.jetbrains.annotations.NotNull
        private okhttp3.CertificatePinner certificatePinner;
        private int connectTimeout;

        @org.jetbrains.annotations.Nullable
        private okhttp3.ConnectionPool connectionPool;

        @org.jetbrains.annotations.NotNull
        private java.util.List<okhttp3.ConnectionSpec> connectionSpecs;

        @org.jetbrains.annotations.NotNull
        private okhttp3.CookieJar cookieJar;

        @org.jetbrains.annotations.NotNull
        private okhttp3.Dispatcher dispatcher;

        @org.jetbrains.annotations.NotNull
        private okhttp3.Dns dns;

        @org.jetbrains.annotations.NotNull
        private okhttp3.EventListener.Factory eventListenerFactory;
        private boolean fastFallback;
        private boolean followRedirects;
        private boolean followSslRedirects;

        @org.jetbrains.annotations.NotNull
        private javax.net.ssl.HostnameVerifier hostnameVerifier;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<okhttp3.Interceptor> interceptors;
        private long minWebSocketMessageToCompress;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<okhttp3.Interceptor> networkInterceptors;
        private int pingInterval;

        @org.jetbrains.annotations.NotNull
        private java.util.List<? extends okhttp3.Protocol> protocols;

        @org.jetbrains.annotations.Nullable
        private java.net.Proxy proxy;

        @org.jetbrains.annotations.NotNull
        private okhttp3.Authenticator proxyAuthenticator;

        @org.jetbrains.annotations.Nullable
        private java.net.ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;

        @org.jetbrains.annotations.Nullable
        private okhttp3.internal.connection.RouteDatabase routeDatabase;

        @org.jetbrains.annotations.NotNull
        private javax.net.SocketFactory socketFactory;

        @org.jetbrains.annotations.Nullable
        private javax.net.ssl.SSLSocketFactory sslSocketFactoryOrNull;

        @org.jetbrains.annotations.Nullable
        private okhttp3.internal.concurrent.TaskRunner taskRunner;
        private int webSocketCloseTimeout;
        private int writeTimeout;

        @org.jetbrains.annotations.Nullable
        private javax.net.ssl.X509TrustManager x509TrustManagerOrNull;

        public Builder() {
                r2 = this;
                r2.<init>()
                okhttp3.Dispatcher r0 = new okhttp3.Dispatcher
                r0.<init>()
                r2.dispatcher = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.interceptors = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.networkInterceptors = r0
                okhttp3.EventListener r0 = okhttp3.EventListener.NONE
                okhttp3.EventListener$Factory r0 = okhttp3.internal._UtilJvmKt.asFactory(r0)
                r2.eventListenerFactory = r0
                r0 = 1
                r2.retryOnConnectionFailure = r0
                r2.fastFallback = r0
                okhttp3.Authenticator r1 = okhttp3.Authenticator.NONE
                r2.authenticator = r1
                r2.followRedirects = r0
                r2.followSslRedirects = r0
                okhttp3.CookieJar r0 = okhttp3.CookieJar.NO_COOKIES
                r2.cookieJar = r0
                okhttp3.Dns r0 = okhttp3.Dns.SYSTEM
                r2.dns = r0
                r2.proxyAuthenticator = r1
                javax.net.SocketFactory r0 = javax.net.SocketFactory.getDefault()
                java.lang.String r1 = "getDefault(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                r2.socketFactory = r0
                okhttp3.OkHttpClient$Companion r0 = okhttp3.OkHttpClient.Companion
                java.util.List r1 = r0.getDEFAULT_CONNECTION_SPECS$okhttp()
                r2.connectionSpecs = r1
                java.util.List r0 = r0.getDEFAULT_PROTOCOLS$okhttp()
                r2.protocols = r0
                okhttp3.internal.tls.OkHostnameVerifier r0 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE
                r2.hostnameVerifier = r0
                okhttp3.CertificatePinner r0 = okhttp3.CertificatePinner.DEFAULT
                r2.certificatePinner = r0
                r0 = 10000(0x2710, float:1.4013E-41)
                r2.connectTimeout = r0
                r2.readTimeout = r0
                r2.writeTimeout = r0
                r0 = 60000(0xea60, float:8.4078E-41)
                r2.webSocketCloseTimeout = r0
                r0 = 1024(0x400, double:5.06E-321)
                r2.minWebSocketMessageToCompress = r0
                return
        }

        public Builder(@org.jetbrains.annotations.NotNull okhttp3.OkHttpClient r3) {
                r2 = this;
                java.lang.String r0 = "okHttpClient"
                kotlin.jvm.internal.g0.p(r3, r0)
                r2.<init>()
                okhttp3.Dispatcher r0 = r3.dispatcher()
                r2.dispatcher = r0
                okhttp3.ConnectionPool r0 = r3.connectionPool()
                r2.connectionPool = r0
                java.util.List<okhttp3.Interceptor> r0 = r2.interceptors
                java.util.Collection r0 = (java.util.Collection) r0
                java.util.List r1 = r3.interceptors()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                kotlin.collections.f0.s0(r0, r1)
                java.util.List<okhttp3.Interceptor> r0 = r2.networkInterceptors
                java.util.Collection r0 = (java.util.Collection) r0
                java.util.List r1 = r3.networkInterceptors()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                kotlin.collections.f0.s0(r0, r1)
                okhttp3.EventListener$Factory r0 = r3.eventListenerFactory()
                r2.eventListenerFactory = r0
                boolean r0 = r3.retryOnConnectionFailure()
                r2.retryOnConnectionFailure = r0
                boolean r0 = r3.fastFallback()
                r2.fastFallback = r0
                okhttp3.Authenticator r0 = r3.authenticator()
                r2.authenticator = r0
                boolean r0 = r3.followRedirects()
                r2.followRedirects = r0
                boolean r0 = r3.followSslRedirects()
                r2.followSslRedirects = r0
                okhttp3.CookieJar r0 = r3.cookieJar()
                r2.cookieJar = r0
                okhttp3.Cache r0 = r3.cache()
                r2.cache = r0
                okhttp3.Dns r0 = r3.dns()
                r2.dns = r0
                java.net.Proxy r0 = r3.proxy()
                r2.proxy = r0
                java.net.ProxySelector r0 = r3.proxySelector()
                r2.proxySelector = r0
                okhttp3.Authenticator r0 = r3.proxyAuthenticator()
                r2.proxyAuthenticator = r0
                javax.net.SocketFactory r0 = r3.socketFactory()
                r2.socketFactory = r0
                javax.net.ssl.SSLSocketFactory r0 = okhttp3.OkHttpClient.access$getSslSocketFactoryOrNull$p(r3)
                r2.sslSocketFactoryOrNull = r0
                javax.net.ssl.X509TrustManager r0 = r3.x509TrustManager()
                r2.x509TrustManagerOrNull = r0
                java.util.List r0 = r3.connectionSpecs()
                r2.connectionSpecs = r0
                java.util.List r0 = r3.protocols()
                r2.protocols = r0
                javax.net.ssl.HostnameVerifier r0 = r3.hostnameVerifier()
                r2.hostnameVerifier = r0
                okhttp3.CertificatePinner r0 = r3.certificatePinner()
                r2.certificatePinner = r0
                okhttp3.internal.tls.CertificateChainCleaner r0 = r3.certificateChainCleaner()
                r2.certificateChainCleaner = r0
                int r0 = r3.callTimeoutMillis()
                r2.callTimeout = r0
                int r0 = r3.connectTimeoutMillis()
                r2.connectTimeout = r0
                int r0 = r3.readTimeoutMillis()
                r2.readTimeout = r0
                int r0 = r3.writeTimeoutMillis()
                r2.writeTimeout = r0
                int r0 = r3.pingIntervalMillis()
                r2.pingInterval = r0
                int r0 = r3.webSocketCloseTimeout()
                r2.webSocketCloseTimeout = r0
                long r0 = r3.minWebSocketMessageToCompress()
                r2.minWebSocketMessageToCompress = r0
                okhttp3.internal.connection.RouteDatabase r0 = r3.getRouteDatabase$okhttp()
                r2.routeDatabase = r0
                okhttp3.internal.concurrent.TaskRunner r3 = r3.getTaskRunner$okhttp()
                r2.taskRunner = r3
                return
        }

        @kotlin.jvm.JvmName(name = "-addInterceptor")
        @org.jetbrains.annotations.NotNull
        /* renamed from: -addInterceptor, reason: not valid java name */
        public final okhttp3.OkHttpClient.Builder m153addInterceptor(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super okhttp3.Interceptor.Chain, okhttp3.Response> r2) {
                r1 = this;
                java.lang.String r0 = "block"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.OkHttpClient$Builder$addInterceptor$2 r0 = new okhttp3.OkHttpClient$Builder$addInterceptor$2
                r0.<init>(r2)
                okhttp3.OkHttpClient$Builder r2 = r1.addInterceptor(r0)
                return r2
        }

        @kotlin.jvm.JvmName(name = "-addNetworkInterceptor")
        @org.jetbrains.annotations.NotNull
        /* renamed from: -addNetworkInterceptor, reason: not valid java name */
        public final okhttp3.OkHttpClient.Builder m154addNetworkInterceptor(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super okhttp3.Interceptor.Chain, okhttp3.Response> r2) {
                r1 = this;
                java.lang.String r0 = "block"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2 r0 = new okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2
                r0.<init>(r2)
                okhttp3.OkHttpClient$Builder r2 = r1.addNetworkInterceptor(r0)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder addInterceptor(@org.jetbrains.annotations.NotNull okhttp3.Interceptor r2) {
                r1 = this;
                java.lang.String r0 = "interceptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.List<okhttp3.Interceptor> r0 = r1.interceptors
                java.util.Collection r0 = (java.util.Collection) r0
                r0.add(r2)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder addNetworkInterceptor(@org.jetbrains.annotations.NotNull okhttp3.Interceptor r2) {
                r1 = this;
                java.lang.String r0 = "interceptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.List<okhttp3.Interceptor> r0 = r1.networkInterceptors
                java.util.Collection r0 = (java.util.Collection) r0
                r0.add(r2)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder authenticator(@org.jetbrains.annotations.NotNull okhttp3.Authenticator r2) {
                r1 = this;
                java.lang.String r0 = "authenticator"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.authenticator = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient build() {
                r1 = this;
                okhttp3.OkHttpClient r0 = new okhttp3.OkHttpClient
                r0.<init>(r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder cache(@org.jetbrains.annotations.Nullable okhttp3.Cache r1) {
                r0 = this;
                r0.cache = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder callTimeout(long r2, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r4) {
                r1 = this;
                java.lang.String r0 = "unit"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "timeout"
                int r2 = okhttp3.internal._UtilJvmKt.checkDuration(r0, r2, r4)
                r1.callTimeout = r2
                return r1
        }

        @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder callTimeout(@org.jetbrains.annotations.NotNull java.time.Duration r3) {
                r2 = this;
                java.lang.String r0 = "duration"
                kotlin.jvm.internal.g0.p(r3, r0)
                long r0 = androidx.work.a.a(r3)
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
                r2.callTimeout(r0, r3)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: callTimeout-LRDsOJo, reason: not valid java name */
        public final okhttp3.OkHttpClient.Builder m155callTimeoutLRDsOJo(long r2) {
                r1 = this;
                java.lang.String r0 = "duration"
                int r2 = okhttp3.internal._UtilJvmKt.checkDuration-HG0u8IE(r0, r2)
                r1.callTimeout = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder certificatePinner(@org.jetbrains.annotations.NotNull okhttp3.CertificatePinner r2) {
                r1 = this;
                java.lang.String r0 = "certificatePinner"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.CertificatePinner r0 = r1.certificatePinner
                boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
                if (r0 != 0) goto L10
                r0 = 0
                r1.routeDatabase = r0
            L10:
                r1.certificatePinner = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder connectTimeout(long r2, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r4) {
                r1 = this;
                java.lang.String r0 = "unit"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "timeout"
                int r2 = okhttp3.internal._UtilJvmKt.checkDuration(r0, r2, r4)
                r1.connectTimeout = r2
                return r1
        }

        @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder connectTimeout(@org.jetbrains.annotations.NotNull java.time.Duration r3) {
                r2 = this;
                java.lang.String r0 = "duration"
                kotlin.jvm.internal.g0.p(r3, r0)
                long r0 = androidx.work.a.a(r3)
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
                r2.connectTimeout(r0, r3)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: connectTimeout-LRDsOJo, reason: not valid java name */
        public final okhttp3.OkHttpClient.Builder m156connectTimeoutLRDsOJo(long r2) {
                r1 = this;
                java.lang.String r0 = "duration"
                int r2 = okhttp3.internal._UtilJvmKt.checkDuration-HG0u8IE(r0, r2)
                r1.connectTimeout = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder connectionPool(@org.jetbrains.annotations.NotNull okhttp3.ConnectionPool r2) {
                r1 = this;
                java.lang.String r0 = "connectionPool"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.connectionPool = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder connectionSpecs(@org.jetbrains.annotations.NotNull java.util.List<okhttp3.ConnectionSpec> r2) {
                r1 = this;
                java.lang.String r0 = "connectionSpecs"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.List<okhttp3.ConnectionSpec> r0 = r1.connectionSpecs
                boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
                if (r0 != 0) goto L10
                r0 = 0
                r1.routeDatabase = r0
            L10:
                java.util.List r2 = okhttp3.internal._UtilJvmKt.toImmutableList(r2)
                r1.connectionSpecs = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder cookieJar(@org.jetbrains.annotations.NotNull okhttp3.CookieJar r2) {
                r1 = this;
                java.lang.String r0 = "cookieJar"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.cookieJar = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder dispatcher(@org.jetbrains.annotations.NotNull okhttp3.Dispatcher r2) {
                r1 = this;
                java.lang.String r0 = "dispatcher"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.dispatcher = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder dns(@org.jetbrains.annotations.NotNull okhttp3.Dns r2) {
                r1 = this;
                java.lang.String r0 = "dns"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.Dns r0 = r1.dns
                boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
                if (r0 != 0) goto L10
                r0 = 0
                r1.routeDatabase = r0
            L10:
                r1.dns = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder eventListener(@org.jetbrains.annotations.NotNull okhttp3.EventListener r2) {
                r1 = this;
                java.lang.String r0 = "eventListener"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.EventListener$Factory r2 = okhttp3.internal._UtilJvmKt.asFactory(r2)
                r1.eventListenerFactory = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder eventListenerFactory(@org.jetbrains.annotations.NotNull okhttp3.EventListener.Factory r2) {
                r1 = this;
                java.lang.String r0 = "eventListenerFactory"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.eventListenerFactory = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder fastFallback(boolean r1) {
                r0 = this;
                r0.fastFallback = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder followRedirects(boolean r1) {
                r0 = this;
                r0.followRedirects = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder followSslRedirects(boolean r1) {
                r0 = this;
                r0.followSslRedirects = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Authenticator getAuthenticator$okhttp() {
                r1 = this;
                okhttp3.Authenticator r0 = r1.authenticator
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.Cache getCache$okhttp() {
                r1 = this;
                okhttp3.Cache r0 = r1.cache
                return r0
        }

        public final int getCallTimeout$okhttp() {
                r1 = this;
                int r0 = r1.callTimeout
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.tls.CertificateChainCleaner getCertificateChainCleaner$okhttp() {
                r1 = this;
                okhttp3.internal.tls.CertificateChainCleaner r0 = r1.certificateChainCleaner
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CertificatePinner getCertificatePinner$okhttp() {
                r1 = this;
                okhttp3.CertificatePinner r0 = r1.certificatePinner
                return r0
        }

        public final int getConnectTimeout$okhttp() {
                r1 = this;
                int r0 = r1.connectTimeout
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.ConnectionPool getConnectionPool$okhttp() {
                r1 = this;
                okhttp3.ConnectionPool r0 = r1.connectionPool
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<okhttp3.ConnectionSpec> getConnectionSpecs$okhttp() {
                r1 = this;
                java.util.List<okhttp3.ConnectionSpec> r0 = r1.connectionSpecs
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CookieJar getCookieJar$okhttp() {
                r1 = this;
                okhttp3.CookieJar r0 = r1.cookieJar
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Dispatcher getDispatcher$okhttp() {
                r1 = this;
                okhttp3.Dispatcher r0 = r1.dispatcher
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Dns getDns$okhttp() {
                r1 = this;
                okhttp3.Dns r0 = r1.dns
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.EventListener.Factory getEventListenerFactory$okhttp() {
                r1 = this;
                okhttp3.EventListener$Factory r0 = r1.eventListenerFactory
                return r0
        }

        public final boolean getFastFallback$okhttp() {
                r1 = this;
                boolean r0 = r1.fastFallback
                return r0
        }

        public final boolean getFollowRedirects$okhttp() {
                r1 = this;
                boolean r0 = r1.followRedirects
                return r0
        }

        public final boolean getFollowSslRedirects$okhttp() {
                r1 = this;
                boolean r0 = r1.followSslRedirects
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final javax.net.ssl.HostnameVerifier getHostnameVerifier$okhttp() {
                r1 = this;
                javax.net.ssl.HostnameVerifier r0 = r1.hostnameVerifier
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<okhttp3.Interceptor> getInterceptors$okhttp() {
                r1 = this;
                java.util.List<okhttp3.Interceptor> r0 = r1.interceptors
                return r0
        }

        public final long getMinWebSocketMessageToCompress$okhttp() {
                r2 = this;
                long r0 = r2.minWebSocketMessageToCompress
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<okhttp3.Interceptor> getNetworkInterceptors$okhttp() {
                r1 = this;
                java.util.List<okhttp3.Interceptor> r0 = r1.networkInterceptors
                return r0
        }

        public final int getPingInterval$okhttp() {
                r1 = this;
                int r0 = r1.pingInterval
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<okhttp3.Protocol> getProtocols$okhttp() {
                r1 = this;
                java.util.List<? extends okhttp3.Protocol> r0 = r1.protocols
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.net.Proxy getProxy$okhttp() {
                r1 = this;
                java.net.Proxy r0 = r1.proxy
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Authenticator getProxyAuthenticator$okhttp() {
                r1 = this;
                okhttp3.Authenticator r0 = r1.proxyAuthenticator
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.net.ProxySelector getProxySelector$okhttp() {
                r1 = this;
                java.net.ProxySelector r0 = r1.proxySelector
                return r0
        }

        public final int getReadTimeout$okhttp() {
                r1 = this;
                int r0 = r1.readTimeout
                return r0
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
                r1 = this;
                boolean r0 = r1.retryOnConnectionFailure
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.connection.RouteDatabase getRouteDatabase$okhttp() {
                r1 = this;
                okhttp3.internal.connection.RouteDatabase r0 = r1.routeDatabase
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final javax.net.SocketFactory getSocketFactory$okhttp() {
                r1 = this;
                javax.net.SocketFactory r0 = r1.socketFactory
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final javax.net.ssl.SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
                r1 = this;
                javax.net.ssl.SSLSocketFactory r0 = r1.sslSocketFactoryOrNull
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.concurrent.TaskRunner getTaskRunner$okhttp() {
                r1 = this;
                okhttp3.internal.concurrent.TaskRunner r0 = r1.taskRunner
                return r0
        }

        public final int getWebSocketCloseTimeout$okhttp() {
                r1 = this;
                int r0 = r1.webSocketCloseTimeout
                return r0
        }

        public final int getWriteTimeout$okhttp() {
                r1 = this;
                int r0 = r1.writeTimeout
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final javax.net.ssl.X509TrustManager getX509TrustManagerOrNull$okhttp() {
                r1 = this;
                javax.net.ssl.X509TrustManager r0 = r1.x509TrustManagerOrNull
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder hostnameVerifier(@org.jetbrains.annotations.NotNull javax.net.ssl.HostnameVerifier r2) {
                r1 = this;
                java.lang.String r0 = "hostnameVerifier"
                kotlin.jvm.internal.g0.p(r2, r0)
                javax.net.ssl.HostnameVerifier r0 = r1.hostnameVerifier
                boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
                if (r0 != 0) goto L10
                r0 = 0
                r1.routeDatabase = r0
            L10:
                r1.hostnameVerifier = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<okhttp3.Interceptor> interceptors() {
                r1 = this;
                java.util.List<okhttp3.Interceptor> r0 = r1.interceptors
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder minWebSocketMessageToCompress(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L9
                r3.minWebSocketMessageToCompress = r4
                return r3
            L9:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "minWebSocketMessageToCompress must be positive: "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r4 = r4.toString()
                r5.<init>(r4)
                throw r5
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<okhttp3.Interceptor> networkInterceptors() {
                r1 = this;
                java.util.List<okhttp3.Interceptor> r0 = r1.networkInterceptors
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder pingInterval(long r2, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r4) {
                r1 = this;
                java.lang.String r0 = "unit"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "interval"
                int r2 = okhttp3.internal._UtilJvmKt.checkDuration(r0, r2, r4)
                r1.pingInterval = r2
                return r1
        }

        @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder pingInterval(@org.jetbrains.annotations.NotNull java.time.Duration r3) {
                r2 = this;
                java.lang.String r0 = "duration"
                kotlin.jvm.internal.g0.p(r3, r0)
                long r0 = androidx.work.a.a(r3)
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
                r2.pingInterval(r0, r3)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: pingInterval-LRDsOJo, reason: not valid java name */
        public final okhttp3.OkHttpClient.Builder m157pingIntervalLRDsOJo(long r2) {
                r1 = this;
                java.lang.String r0 = "duration"
                int r2 = okhttp3.internal._UtilJvmKt.checkDuration-HG0u8IE(r0, r2)
                r1.pingInterval = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder protocols(@org.jetbrains.annotations.NotNull java.util.List<? extends okhttp3.Protocol> r3) {
                r2 = this;
                java.lang.String r0 = "protocols"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.util.Collection r3 = (java.util.Collection) r3
                java.util.List r3 = kotlin.collections.f0.d6(r3)
                okhttp3.Protocol r0 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
                boolean r1 = r3.contains(r0)
                if (r1 != 0) goto L37
                okhttp3.Protocol r1 = okhttp3.Protocol.HTTP_1_1
                boolean r1 = r3.contains(r1)
                if (r1 == 0) goto L1c
                goto L37
            L1c:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "protocols must contain h2_prior_knowledge or http/1.1: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r0.<init>(r3)
                throw r0
            L37:
                boolean r0 = r3.contains(r0)
                if (r0 == 0) goto L60
                int r0 = r3.size()
                r1 = 1
                if (r0 > r1) goto L45
                goto L60
            L45:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "protocols containing h2_prior_knowledge cannot use other protocols: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r0.<init>(r3)
                throw r0
            L60:
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_0
                boolean r0 = r3.contains(r0)
                if (r0 != 0) goto L97
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>"
                kotlin.jvm.internal.g0.n(r3, r0)
                r0 = 0
                boolean r1 = r3.contains(r0)
                if (r1 != 0) goto L8f
                okhttp3.Protocol r1 = okhttp3.Protocol.SPDY_3
                r3.remove(r1)
                java.util.List<? extends okhttp3.Protocol> r1 = r2.protocols
                boolean r1 = kotlin.jvm.internal.g0.g(r3, r1)
                if (r1 != 0) goto L83
                r2.routeDatabase = r0
            L83:
                java.util.List r3 = java.util.Collections.unmodifiableList(r3)
                java.lang.String r0 = "unmodifiableList(...)"
                kotlin.jvm.internal.g0.o(r3, r0)
                r2.protocols = r3
                return r2
            L8f:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "protocols must not contain null"
                r3.<init>(r0)
                throw r3
            L97:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "protocols must not contain http/1.0: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r0.<init>(r3)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder proxy(@org.jetbrains.annotations.Nullable java.net.Proxy r2) {
                r1 = this;
                java.net.Proxy r0 = r1.proxy
                boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
                if (r0 != 0) goto Lb
                r0 = 0
                r1.routeDatabase = r0
            Lb:
                r1.proxy = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder proxyAuthenticator(@org.jetbrains.annotations.NotNull okhttp3.Authenticator r2) {
                r1 = this;
                java.lang.String r0 = "proxyAuthenticator"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.Authenticator r0 = r1.proxyAuthenticator
                boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
                if (r0 != 0) goto L10
                r0 = 0
                r1.routeDatabase = r0
            L10:
                r1.proxyAuthenticator = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder proxySelector(@org.jetbrains.annotations.NotNull java.net.ProxySelector r2) {
                r1 = this;
                java.lang.String r0 = "proxySelector"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.net.ProxySelector r0 = r1.proxySelector
                boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
                if (r0 != 0) goto L10
                r0 = 0
                r1.routeDatabase = r0
            L10:
                r1.proxySelector = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder readTimeout(long r2, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r4) {
                r1 = this;
                java.lang.String r0 = "unit"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "timeout"
                int r2 = okhttp3.internal._UtilJvmKt.checkDuration(r0, r2, r4)
                r1.readTimeout = r2
                return r1
        }

        @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder readTimeout(@org.jetbrains.annotations.NotNull java.time.Duration r3) {
                r2 = this;
                java.lang.String r0 = "duration"
                kotlin.jvm.internal.g0.p(r3, r0)
                long r0 = androidx.work.a.a(r3)
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
                r2.readTimeout(r0, r3)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: readTimeout-LRDsOJo, reason: not valid java name */
        public final okhttp3.OkHttpClient.Builder m158readTimeoutLRDsOJo(long r2) {
                r1 = this;
                java.lang.String r0 = "duration"
                int r2 = okhttp3.internal._UtilJvmKt.checkDuration-HG0u8IE(r0, r2)
                r1.readTimeout = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder retryOnConnectionFailure(boolean r1) {
                r0 = this;
                r0.retryOnConnectionFailure = r1
                return r0
        }

        public final void setAuthenticator$okhttp(@org.jetbrains.annotations.NotNull okhttp3.Authenticator r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.authenticator = r2
                return
        }

        public final void setCache$okhttp(@org.jetbrains.annotations.Nullable okhttp3.Cache r1) {
                r0 = this;
                r0.cache = r1
                return
        }

        public final void setCallTimeout$okhttp(int r1) {
                r0 = this;
                r0.callTimeout = r1
                return
        }

        public final void setCertificateChainCleaner$okhttp(@org.jetbrains.annotations.Nullable okhttp3.internal.tls.CertificateChainCleaner r1) {
                r0 = this;
                r0.certificateChainCleaner = r1
                return
        }

        public final void setCertificatePinner$okhttp(@org.jetbrains.annotations.NotNull okhttp3.CertificatePinner r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.certificatePinner = r2
                return
        }

        public final void setConnectTimeout$okhttp(int r1) {
                r0 = this;
                r0.connectTimeout = r1
                return
        }

        public final void setConnectionPool$okhttp(@org.jetbrains.annotations.Nullable okhttp3.ConnectionPool r1) {
                r0 = this;
                r0.connectionPool = r1
                return
        }

        public final void setConnectionSpecs$okhttp(@org.jetbrains.annotations.NotNull java.util.List<okhttp3.ConnectionSpec> r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.connectionSpecs = r2
                return
        }

        public final void setCookieJar$okhttp(@org.jetbrains.annotations.NotNull okhttp3.CookieJar r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.cookieJar = r2
                return
        }

        public final void setDispatcher$okhttp(@org.jetbrains.annotations.NotNull okhttp3.Dispatcher r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.dispatcher = r2
                return
        }

        public final void setDns$okhttp(@org.jetbrains.annotations.NotNull okhttp3.Dns r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.dns = r2
                return
        }

        public final void setEventListenerFactory$okhttp(@org.jetbrains.annotations.NotNull okhttp3.EventListener.Factory r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.eventListenerFactory = r2
                return
        }

        public final void setFastFallback$okhttp(boolean r1) {
                r0 = this;
                r0.fastFallback = r1
                return
        }

        public final void setFollowRedirects$okhttp(boolean r1) {
                r0 = this;
                r0.followRedirects = r1
                return
        }

        public final void setFollowSslRedirects$okhttp(boolean r1) {
                r0 = this;
                r0.followSslRedirects = r1
                return
        }

        public final void setHostnameVerifier$okhttp(@org.jetbrains.annotations.NotNull javax.net.ssl.HostnameVerifier r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.hostnameVerifier = r2
                return
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long r1) {
                r0 = this;
                r0.minWebSocketMessageToCompress = r1
                return
        }

        public final void setPingInterval$okhttp(int r1) {
                r0 = this;
                r0.pingInterval = r1
                return
        }

        public final void setProtocols$okhttp(@org.jetbrains.annotations.NotNull java.util.List<? extends okhttp3.Protocol> r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.protocols = r2
                return
        }

        public final void setProxy$okhttp(@org.jetbrains.annotations.Nullable java.net.Proxy r1) {
                r0 = this;
                r0.proxy = r1
                return
        }

        public final void setProxyAuthenticator$okhttp(@org.jetbrains.annotations.NotNull okhttp3.Authenticator r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.proxyAuthenticator = r2
                return
        }

        public final void setProxySelector$okhttp(@org.jetbrains.annotations.Nullable java.net.ProxySelector r1) {
                r0 = this;
                r0.proxySelector = r1
                return
        }

        public final void setReadTimeout$okhttp(int r1) {
                r0 = this;
                r0.readTimeout = r1
                return
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean r1) {
                r0 = this;
                r0.retryOnConnectionFailure = r1
                return
        }

        public final void setRouteDatabase$okhttp(@org.jetbrains.annotations.Nullable okhttp3.internal.connection.RouteDatabase r1) {
                r0 = this;
                r0.routeDatabase = r1
                return
        }

        public final void setSocketFactory$okhttp(@org.jetbrains.annotations.NotNull javax.net.SocketFactory r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.socketFactory = r2
                return
        }

        public final void setSslSocketFactoryOrNull$okhttp(@org.jetbrains.annotations.Nullable javax.net.ssl.SSLSocketFactory r1) {
                r0 = this;
                r0.sslSocketFactoryOrNull = r1
                return
        }

        public final void setTaskRunner$okhttp(@org.jetbrains.annotations.Nullable okhttp3.internal.concurrent.TaskRunner r1) {
                r0 = this;
                r0.taskRunner = r1
                return
        }

        public final void setWebSocketCloseTimeout$okhttp(int r1) {
                r0 = this;
                r0.webSocketCloseTimeout = r1
                return
        }

        public final void setWriteTimeout$okhttp(int r1) {
                r0 = this;
                r0.writeTimeout = r1
                return
        }

        public final void setX509TrustManagerOrNull$okhttp(@org.jetbrains.annotations.Nullable javax.net.ssl.X509TrustManager r1) {
                r0 = this;
                r0.x509TrustManagerOrNull = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder socketFactory(@org.jetbrains.annotations.NotNull javax.net.SocketFactory r2) {
                r1 = this;
                java.lang.String r0 = "socketFactory"
                kotlin.jvm.internal.g0.p(r2, r0)
                boolean r0 = r2 instanceof javax.net.ssl.SSLSocketFactory
                if (r0 != 0) goto L17
                javax.net.SocketFactory r0 = r1.socketFactory
                boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
                if (r0 != 0) goto L14
                r0 = 0
                r1.routeDatabase = r0
            L14:
                r1.socketFactory = r2
                return r1
            L17:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "socketFactory instanceof SSLSocketFactory"
                r2.<init>(r0)
                throw r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder sslSocketFactory(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocketFactory r5) {
                r4 = this;
                java.lang.String r0 = "sslSocketFactory"
                kotlin.jvm.internal.g0.p(r5, r0)
                javax.net.ssl.SSLSocketFactory r0 = r4.sslSocketFactoryOrNull
                boolean r0 = kotlin.jvm.internal.g0.g(r5, r0)
                if (r0 != 0) goto L10
                r0 = 0
                r4.routeDatabase = r0
            L10:
                r4.sslSocketFactoryOrNull = r5
                okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
                okhttp3.internal.platform.Platform r1 = r0.get()
                javax.net.ssl.X509TrustManager r1 = r1.trustManager(r5)
                if (r1 == 0) goto L30
                r4.x509TrustManagerOrNull = r1
                okhttp3.internal.platform.Platform r5 = r0.get()
                javax.net.ssl.X509TrustManager r0 = r4.x509TrustManagerOrNull
                kotlin.jvm.internal.g0.m(r0)
                okhttp3.internal.tls.CertificateChainCleaner r5 = r5.buildCertificateChainCleaner(r0)
                r4.certificateChainCleaner = r5
                return r4
            L30:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unable to extract the trust manager on "
                r2.append(r3)
                okhttp3.internal.platform.Platform r0 = r0.get()
                r2.append(r0)
                java.lang.String r0 = ", sslSocketFactory is "
                r2.append(r0)
                java.lang.Class r5 = r5.getClass()
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                throw r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder sslSocketFactory(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocketFactory r2, @org.jetbrains.annotations.NotNull javax.net.ssl.X509TrustManager r3) {
                r1 = this;
                java.lang.String r0 = "sslSocketFactory"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "trustManager"
                kotlin.jvm.internal.g0.p(r3, r0)
                javax.net.ssl.SSLSocketFactory r0 = r1.sslSocketFactoryOrNull
                boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
                if (r0 == 0) goto L1a
                javax.net.ssl.X509TrustManager r0 = r1.x509TrustManagerOrNull
                boolean r0 = kotlin.jvm.internal.g0.g(r3, r0)
                if (r0 != 0) goto L1d
            L1a:
                r0 = 0
                r1.routeDatabase = r0
            L1d:
                r1.sslSocketFactoryOrNull = r2
                okhttp3.internal.tls.CertificateChainCleaner$Companion r2 = okhttp3.internal.tls.CertificateChainCleaner.Companion
                okhttp3.internal.tls.CertificateChainCleaner r2 = r2.get(r3)
                r1.certificateChainCleaner = r2
                r1.x509TrustManagerOrNull = r3
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder taskRunner$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r2) {
                r1 = this;
                java.lang.String r0 = "taskRunner"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.taskRunner = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder webSocketCloseTimeout(long r2, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r4) {
                r1 = this;
                java.lang.String r0 = "unit"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "webSocketCloseTimeout"
                int r2 = okhttp3.internal._UtilJvmKt.checkDuration(r0, r2, r4)
                r1.webSocketCloseTimeout = r2
                return r1
        }

        @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder webSocketCloseTimeout(@org.jetbrains.annotations.NotNull java.time.Duration r3) {
                r2 = this;
                java.lang.String r0 = "duration"
                kotlin.jvm.internal.g0.p(r3, r0)
                long r0 = androidx.work.a.a(r3)
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
                r2.webSocketCloseTimeout(r0, r3)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: webSocketCloseTimeout-LRDsOJo, reason: not valid java name */
        public final okhttp3.OkHttpClient.Builder m159webSocketCloseTimeoutLRDsOJo(long r2) {
                r1 = this;
                java.lang.String r0 = "duration"
                int r2 = okhttp3.internal._UtilJvmKt.checkDuration-HG0u8IE(r0, r2)
                r1.webSocketCloseTimeout = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder writeTimeout(long r2, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r4) {
                r1 = this;
                java.lang.String r0 = "unit"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "timeout"
                int r2 = okhttp3.internal._UtilJvmKt.checkDuration(r0, r2, r4)
                r1.writeTimeout = r2
                return r1
        }

        @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient.Builder writeTimeout(@org.jetbrains.annotations.NotNull java.time.Duration r3) {
                r2 = this;
                java.lang.String r0 = "duration"
                kotlin.jvm.internal.g0.p(r3, r0)
                long r0 = androidx.work.a.a(r3)
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
                r2.writeTimeout(r0, r3)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: writeTimeout-LRDsOJo, reason: not valid java name */
        public final okhttp3.OkHttpClient.Builder m160writeTimeoutLRDsOJo(long r2) {
                r1 = this;
                java.lang.String r0 = "duration"
                int r2 = okhttp3.internal._UtilJvmKt.checkDuration-HG0u8IE(r0, r2)
                r1.writeTimeout = r2
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<okhttp3.ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
                r1 = this;
                java.util.List r0 = okhttp3.OkHttpClient.access$getDEFAULT_CONNECTION_SPECS$cp()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<okhttp3.Protocol> getDEFAULT_PROTOCOLS$okhttp() {
                r1 = this;
                java.util.List r0 = okhttp3.OkHttpClient.access$getDEFAULT_PROTOCOLS$cp()
                return r0
        }
    }

    static {
            okhttp3.OkHttpClient$Companion r0 = new okhttp3.OkHttpClient$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.OkHttpClient.Companion = r0
            r0 = 2
            okhttp3.Protocol[] r1 = new okhttp3.Protocol[r0]
            okhttp3.Protocol r2 = okhttp3.Protocol.HTTP_2
            r3 = 0
            r1[r3] = r2
            okhttp3.Protocol r2 = okhttp3.Protocol.HTTP_1_1
            r4 = 1
            r1[r4] = r2
            java.util.List r1 = okhttp3.internal._UtilJvmKt.immutableListOf(r1)
            okhttp3.OkHttpClient.DEFAULT_PROTOCOLS = r1
            okhttp3.ConnectionSpec[] r0 = new okhttp3.ConnectionSpec[r0]
            okhttp3.ConnectionSpec r1 = okhttp3.ConnectionSpec.MODERN_TLS
            r0[r3] = r1
            okhttp3.ConnectionSpec r1 = okhttp3.ConnectionSpec.CLEARTEXT
            r0[r4] = r1
            java.util.List r0 = okhttp3.internal._UtilJvmKt.immutableListOf(r0)
            okhttp3.OkHttpClient.DEFAULT_CONNECTION_SPECS = r0
            return
    }

    public OkHttpClient() {
            r1 = this;
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public OkHttpClient(@org.jetbrains.annotations.NotNull okhttp3.OkHttpClient.Builder r4) {
            r3 = this;
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.g0.p(r4, r0)
            r3.<init>()
            okhttp3.Dispatcher r0 = r4.getDispatcher$okhttp()
            r3.dispatcher = r0
            java.util.List r0 = r4.getInterceptors$okhttp()
            java.util.List r0 = okhttp3.internal._UtilJvmKt.toImmutableList(r0)
            r3.interceptors = r0
            java.util.List r0 = r4.getNetworkInterceptors$okhttp()
            java.util.List r0 = okhttp3.internal._UtilJvmKt.toImmutableList(r0)
            r3.networkInterceptors = r0
            okhttp3.EventListener$Factory r0 = r4.getEventListenerFactory$okhttp()
            r3.eventListenerFactory = r0
            boolean r0 = r4.getRetryOnConnectionFailure$okhttp()
            r3.retryOnConnectionFailure = r0
            boolean r0 = r4.getFastFallback$okhttp()
            r3.fastFallback = r0
            okhttp3.Authenticator r0 = r4.getAuthenticator$okhttp()
            r3.authenticator = r0
            boolean r0 = r4.getFollowRedirects$okhttp()
            r3.followRedirects = r0
            boolean r0 = r4.getFollowSslRedirects$okhttp()
            r3.followSslRedirects = r0
            okhttp3.CookieJar r0 = r4.getCookieJar$okhttp()
            r3.cookieJar = r0
            okhttp3.Cache r0 = r4.getCache$okhttp()
            r3.cache = r0
            okhttp3.Dns r0 = r4.getDns$okhttp()
            r3.dns = r0
            java.net.Proxy r0 = r4.getProxy$okhttp()
            r3.proxy = r0
            java.net.Proxy r0 = r4.getProxy$okhttp()
            if (r0 == 0) goto L67
            okhttp3.internal.proxy.NullProxySelector r0 = okhttp3.internal.proxy.NullProxySelector.INSTANCE
            goto L75
        L67:
            java.net.ProxySelector r0 = r4.getProxySelector$okhttp()
            if (r0 != 0) goto L75
            java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()
            if (r0 != 0) goto L75
            okhttp3.internal.proxy.NullProxySelector r0 = okhttp3.internal.proxy.NullProxySelector.INSTANCE
        L75:
            r3.proxySelector = r0
            okhttp3.Authenticator r0 = r4.getProxyAuthenticator$okhttp()
            r3.proxyAuthenticator = r0
            javax.net.SocketFactory r0 = r4.getSocketFactory$okhttp()
            r3.socketFactory = r0
            java.util.List r0 = r4.getConnectionSpecs$okhttp()
            r3.connectionSpecs = r0
            java.util.List r1 = r4.getProtocols$okhttp()
            r3.protocols = r1
            javax.net.ssl.HostnameVerifier r1 = r4.getHostnameVerifier$okhttp()
            r3.hostnameVerifier = r1
            int r1 = r4.getCallTimeout$okhttp()
            r3.callTimeoutMillis = r1
            int r1 = r4.getConnectTimeout$okhttp()
            r3.connectTimeoutMillis = r1
            int r1 = r4.getReadTimeout$okhttp()
            r3.readTimeoutMillis = r1
            int r1 = r4.getWriteTimeout$okhttp()
            r3.writeTimeoutMillis = r1
            int r1 = r4.getPingInterval$okhttp()
            r3.pingIntervalMillis = r1
            int r1 = r4.getWebSocketCloseTimeout$okhttp()
            r3.webSocketCloseTimeout = r1
            long r1 = r4.getMinWebSocketMessageToCompress$okhttp()
            r3.minWebSocketMessageToCompress = r1
            okhttp3.internal.connection.RouteDatabase r1 = r4.getRouteDatabase$okhttp()
            if (r1 != 0) goto Lca
            okhttp3.internal.connection.RouteDatabase r1 = new okhttp3.internal.connection.RouteDatabase
            r1.<init>()
        Lca:
            r3.routeDatabase = r1
            okhttp3.internal.concurrent.TaskRunner r1 = r4.getTaskRunner$okhttp()
            if (r1 != 0) goto Ld4
            okhttp3.internal.concurrent.TaskRunner r1 = okhttp3.internal.concurrent.TaskRunner.INSTANCE
        Ld4:
            r3.taskRunner = r1
            okhttp3.ConnectionPool r1 = r4.getConnectionPool$okhttp()
            if (r1 != 0) goto Le4
            okhttp3.ConnectionPool r1 = new okhttp3.ConnectionPool
            r1.<init>()
            r4.setConnectionPool$okhttp(r1)
        Le4:
            r3.connectionPool = r1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto Lf6
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Lf6
            goto L15e
        Lf6:
            java.util.Iterator r0 = r0.iterator()
        Lfa:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L15e
            java.lang.Object r1 = r0.next()
            okhttp3.ConnectionSpec r1 = (okhttp3.ConnectionSpec) r1
            boolean r1 = r1.isTls()
            if (r1 == 0) goto Lfa
            javax.net.ssl.SSLSocketFactory r0 = r4.getSslSocketFactoryOrNull$okhttp()
            if (r0 == 0) goto L135
            javax.net.ssl.SSLSocketFactory r0 = r4.getSslSocketFactoryOrNull$okhttp()
            r3.sslSocketFactoryOrNull = r0
            okhttp3.internal.tls.CertificateChainCleaner r0 = r4.getCertificateChainCleaner$okhttp()
            kotlin.jvm.internal.g0.m(r0)
            r3.certificateChainCleaner = r0
            javax.net.ssl.X509TrustManager r1 = r4.getX509TrustManagerOrNull$okhttp()
            kotlin.jvm.internal.g0.m(r1)
            r3.x509TrustManager = r1
            okhttp3.CertificatePinner r4 = r4.getCertificatePinner$okhttp()
            okhttp3.CertificatePinner r4 = r4.withCertificateChainCleaner$okhttp(r0)
            r3.certificatePinner = r4
            goto L169
        L135:
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r1 = r0.get()
            javax.net.ssl.X509TrustManager r1 = r1.platformTrustManager()
            r3.x509TrustManager = r1
            okhttp3.internal.platform.Platform r0 = r0.get()
            javax.net.ssl.SSLSocketFactory r0 = r0.newSslSocketFactory(r1)
            r3.sslSocketFactoryOrNull = r0
            okhttp3.internal.tls.CertificateChainCleaner$Companion r0 = okhttp3.internal.tls.CertificateChainCleaner.Companion
            okhttp3.internal.tls.CertificateChainCleaner r0 = r0.get(r1)
            r3.certificateChainCleaner = r0
            okhttp3.CertificatePinner r4 = r4.getCertificatePinner$okhttp()
            okhttp3.CertificatePinner r4 = r4.withCertificateChainCleaner$okhttp(r0)
            r3.certificatePinner = r4
            goto L169
        L15e:
            r4 = 0
            r3.sslSocketFactoryOrNull = r4
            r3.certificateChainCleaner = r4
            r3.x509TrustManager = r4
            okhttp3.CertificatePinner r4 = okhttp3.CertificatePinner.DEFAULT
            r3.certificatePinner = r4
        L169:
            r3.verifyClientState()
            return
    }

    public static final /* synthetic */ java.util.List access$getDEFAULT_CONNECTION_SPECS$cp() {
            java.util.List<okhttp3.ConnectionSpec> r0 = okhttp3.OkHttpClient.DEFAULT_CONNECTION_SPECS
            return r0
    }

    public static final /* synthetic */ java.util.List access$getDEFAULT_PROTOCOLS$cp() {
            java.util.List<okhttp3.Protocol> r0 = okhttp3.OkHttpClient.DEFAULT_PROTOCOLS
            return r0
    }

    public static final /* synthetic */ javax.net.ssl.SSLSocketFactory access$getSslSocketFactoryOrNull$p(okhttp3.OkHttpClient r0) {
            javax.net.ssl.SSLSocketFactory r0 = r0.sslSocketFactoryOrNull
            return r0
    }

    private final void verifyClientState() {
            r3 = this;
            java.util.List<okhttp3.Interceptor> r0 = r3.interceptors
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"
            kotlin.jvm.internal.g0.n(r0, r1)
            r2 = 0
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto Lb6
            java.util.List<okhttp3.Interceptor> r0 = r3.networkInterceptors
            kotlin.jvm.internal.g0.n(r0, r1)
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L99
            java.util.List<okhttp3.ConnectionSpec> r0 = r3.connectionSpecs
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L2b
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L2b
            goto L66
        L2b:
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r0.next()
            okhttp3.ConnectionSpec r1 = (okhttp3.ConnectionSpec) r1
            boolean r1 = r1.isTls()
            if (r1 == 0) goto L2f
            javax.net.ssl.SSLSocketFactory r0 = r3.sslSocketFactoryOrNull
            if (r0 == 0) goto L5e
            okhttp3.internal.tls.CertificateChainCleaner r0 = r3.certificateChainCleaner
            if (r0 == 0) goto L56
            javax.net.ssl.X509TrustManager r0 = r3.x509TrustManager
            if (r0 == 0) goto L4e
            return
        L4e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "x509TrustManager == null"
            r0.<init>(r1)
            throw r0
        L56:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "certificateChainCleaner == null"
            r0.<init>(r1)
            throw r0
        L5e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "sslSocketFactory == null"
            r0.<init>(r1)
            throw r0
        L66:
            javax.net.ssl.SSLSocketFactory r0 = r3.sslSocketFactoryOrNull
            java.lang.String r1 = "Check failed."
            if (r0 != 0) goto L93
            okhttp3.internal.tls.CertificateChainCleaner r0 = r3.certificateChainCleaner
            if (r0 != 0) goto L8d
            javax.net.ssl.X509TrustManager r0 = r3.x509TrustManager
            if (r0 != 0) goto L87
            okhttp3.CertificatePinner r0 = r3.certificatePinner
            okhttp3.CertificatePinner r2 = okhttp3.CertificatePinner.DEFAULT
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 == 0) goto L81
            kotlin.n1 r0 = kotlin.n1.a
            return
        L81:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L87:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L8d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L93:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L99:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Null network interceptor: "
            r0.append(r1)
            java.util.List<okhttp3.Interceptor> r1 = r3.networkInterceptors
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Lb6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Null interceptor: "
            r0.append(r1)
            java.util.List<okhttp3.Interceptor> r1 = r3.interceptors
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "authenticator", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_authenticator")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_authenticator, reason: not valid java name */
    public final okhttp3.Authenticator m127deprecated_authenticator() {
            r1 = this;
            okhttp3.Authenticator r0 = r1.authenticator
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cache", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_cache")
    @org.jetbrains.annotations.Nullable
    /* renamed from: -deprecated_cache, reason: not valid java name */
    public final okhttp3.Cache m128deprecated_cache() {
            r1 = this;
            okhttp3.Cache r0 = r1.cache
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "callTimeoutMillis", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_callTimeoutMillis")
    /* renamed from: -deprecated_callTimeoutMillis, reason: not valid java name */
    public final int m129deprecated_callTimeoutMillis() {
            r1 = this;
            int r0 = r1.callTimeoutMillis
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "certificatePinner", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_certificatePinner")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final okhttp3.CertificatePinner m130deprecated_certificatePinner() {
            r1 = this;
            okhttp3.CertificatePinner r0 = r1.certificatePinner
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "connectTimeoutMillis", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_connectTimeoutMillis")
    /* renamed from: -deprecated_connectTimeoutMillis, reason: not valid java name */
    public final int m131deprecated_connectTimeoutMillis() {
            r1 = this;
            int r0 = r1.connectTimeoutMillis
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "connectionPool", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_connectionPool")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_connectionPool, reason: not valid java name */
    public final okhttp3.ConnectionPool m132deprecated_connectionPool() {
            r1 = this;
            okhttp3.ConnectionPool r0 = r1.connectionPool
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "connectionSpecs", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_connectionSpecs")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final java.util.List<okhttp3.ConnectionSpec> m133deprecated_connectionSpecs() {
            r1 = this;
            java.util.List<okhttp3.ConnectionSpec> r0 = r1.connectionSpecs
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cookieJar", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_cookieJar")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_cookieJar, reason: not valid java name */
    public final okhttp3.CookieJar m134deprecated_cookieJar() {
            r1 = this;
            okhttp3.CookieJar r0 = r1.cookieJar
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "dispatcher", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_dispatcher")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_dispatcher, reason: not valid java name */
    public final okhttp3.Dispatcher m135deprecated_dispatcher() {
            r1 = this;
            okhttp3.Dispatcher r0 = r1.dispatcher
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "dns", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_dns")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_dns, reason: not valid java name */
    public final okhttp3.Dns m136deprecated_dns() {
            r1 = this;
            okhttp3.Dns r0 = r1.dns
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "eventListenerFactory", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_eventListenerFactory")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_eventListenerFactory, reason: not valid java name */
    public final okhttp3.EventListener.Factory m137deprecated_eventListenerFactory() {
            r1 = this;
            okhttp3.EventListener$Factory r0 = r1.eventListenerFactory
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "followRedirects", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_followRedirects")
    /* renamed from: -deprecated_followRedirects, reason: not valid java name */
    public final boolean m138deprecated_followRedirects() {
            r1 = this;
            boolean r0 = r1.followRedirects
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "followSslRedirects", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_followSslRedirects")
    /* renamed from: -deprecated_followSslRedirects, reason: not valid java name */
    public final boolean m139deprecated_followSslRedirects() {
            r1 = this;
            boolean r0 = r1.followSslRedirects
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "hostnameVerifier", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_hostnameVerifier")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final javax.net.ssl.HostnameVerifier m140deprecated_hostnameVerifier() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.hostnameVerifier
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "interceptors", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_interceptors")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_interceptors, reason: not valid java name */
    public final java.util.List<okhttp3.Interceptor> m141deprecated_interceptors() {
            r1 = this;
            java.util.List<okhttp3.Interceptor> r0 = r1.interceptors
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "networkInterceptors", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_networkInterceptors")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_networkInterceptors, reason: not valid java name */
    public final java.util.List<okhttp3.Interceptor> m142deprecated_networkInterceptors() {
            r1 = this;
            java.util.List<okhttp3.Interceptor> r0 = r1.networkInterceptors
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "pingIntervalMillis", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_pingIntervalMillis")
    /* renamed from: -deprecated_pingIntervalMillis, reason: not valid java name */
    public final int m143deprecated_pingIntervalMillis() {
            r1 = this;
            int r0 = r1.pingIntervalMillis
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "protocols", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_protocols")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final java.util.List<okhttp3.Protocol> m144deprecated_protocols() {
            r1 = this;
            java.util.List<okhttp3.Protocol> r0 = r1.protocols
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxy", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_proxy")
    @org.jetbrains.annotations.Nullable
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final java.net.Proxy m145deprecated_proxy() {
            r1 = this;
            java.net.Proxy r0 = r1.proxy
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxyAuthenticator", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_proxyAuthenticator")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final okhttp3.Authenticator m146deprecated_proxyAuthenticator() {
            r1 = this;
            okhttp3.Authenticator r0 = r1.proxyAuthenticator
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxySelector", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_proxySelector")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final java.net.ProxySelector m147deprecated_proxySelector() {
            r1 = this;
            java.net.ProxySelector r0 = r1.proxySelector
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "readTimeoutMillis", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_readTimeoutMillis")
    /* renamed from: -deprecated_readTimeoutMillis, reason: not valid java name */
    public final int m148deprecated_readTimeoutMillis() {
            r1 = this;
            int r0 = r1.readTimeoutMillis
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "retryOnConnectionFailure", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_retryOnConnectionFailure")
    /* renamed from: -deprecated_retryOnConnectionFailure, reason: not valid java name */
    public final boolean m149deprecated_retryOnConnectionFailure() {
            r1 = this;
            boolean r0 = r1.retryOnConnectionFailure
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "socketFactory", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_socketFactory")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final javax.net.SocketFactory m150deprecated_socketFactory() {
            r1 = this;
            javax.net.SocketFactory r0 = r1.socketFactory
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sslSocketFactory", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_sslSocketFactory")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final javax.net.ssl.SSLSocketFactory m151deprecated_sslSocketFactory() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.sslSocketFactory()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "writeTimeoutMillis", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_writeTimeoutMillis")
    /* renamed from: -deprecated_writeTimeoutMillis, reason: not valid java name */
    public final int m152deprecated_writeTimeoutMillis() {
            r1 = this;
            int r0 = r1.writeTimeoutMillis
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.Address address(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r15) {
            r14 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.g0.p(r15, r0)
            boolean r0 = r15.isHttps()
            if (r0 == 0) goto L17
            javax.net.ssl.SSLSocketFactory r0 = r14.sslSocketFactory()
            javax.net.ssl.HostnameVerifier r1 = r14.hostnameVerifier
            okhttp3.CertificatePinner r2 = r14.certificatePinner
            r6 = r0
            r7 = r1
            r8 = r2
            goto L1b
        L17:
            r0 = 0
            r6 = r0
            r7 = r6
            r8 = r7
        L1b:
            okhttp3.Address r1 = new okhttp3.Address
            java.lang.String r2 = r15.host()
            int r3 = r15.port()
            okhttp3.Dns r4 = r14.dns
            javax.net.SocketFactory r5 = r14.socketFactory
            okhttp3.Authenticator r9 = r14.proxyAuthenticator
            java.net.Proxy r10 = r14.proxy
            java.util.List<okhttp3.Protocol> r11 = r14.protocols
            java.util.List<okhttp3.ConnectionSpec> r12 = r14.connectionSpecs
            java.net.ProxySelector r13 = r14.proxySelector
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r1
    }

    @kotlin.jvm.JvmName(name = "authenticator")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.Authenticator authenticator() {
            r1 = this;
            okhttp3.Authenticator r0 = r1.authenticator
            return r0
    }

    @kotlin.jvm.JvmName(name = "cache")
    @org.jetbrains.annotations.Nullable
    public final okhttp3.Cache cache() {
            r1 = this;
            okhttp3.Cache r0 = r1.cache
            return r0
    }

    @kotlin.jvm.JvmName(name = "callTimeoutMillis")
    public final int callTimeoutMillis() {
            r1 = this;
            int r0 = r1.callTimeoutMillis
            return r0
    }

    @kotlin.jvm.JvmName(name = "certificateChainCleaner")
    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner() {
            r1 = this;
            okhttp3.internal.tls.CertificateChainCleaner r0 = r1.certificateChainCleaner
            return r0
    }

    @kotlin.jvm.JvmName(name = "certificatePinner")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.CertificatePinner certificatePinner() {
            r1 = this;
            okhttp3.CertificatePinner r0 = r1.certificatePinner
            return r0
    }

    @kotlin.jvm.JvmName(name = "connectTimeoutMillis")
    public final int connectTimeoutMillis() {
            r1 = this;
            int r0 = r1.connectTimeoutMillis
            return r0
    }

    @kotlin.jvm.JvmName(name = "connectionPool")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.ConnectionPool connectionPool() {
            r1 = this;
            okhttp3.ConnectionPool r0 = r1.connectionPool
            return r0
    }

    @kotlin.jvm.JvmName(name = "connectionSpecs")
    @org.jetbrains.annotations.NotNull
    public final java.util.List<okhttp3.ConnectionSpec> connectionSpecs() {
            r1 = this;
            java.util.List<okhttp3.ConnectionSpec> r0 = r1.connectionSpecs
            return r0
    }

    @kotlin.jvm.JvmName(name = "cookieJar")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.CookieJar cookieJar() {
            r1 = this;
            okhttp3.CookieJar r0 = r1.cookieJar
            return r0
    }

    @kotlin.jvm.JvmName(name = "dispatcher")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.Dispatcher dispatcher() {
            r1 = this;
            okhttp3.Dispatcher r0 = r1.dispatcher
            return r0
    }

    @kotlin.jvm.JvmName(name = "dns")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.Dns dns() {
            r1 = this;
            okhttp3.Dns r0 = r1.dns
            return r0
    }

    @kotlin.jvm.JvmName(name = "eventListenerFactory")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.EventListener.Factory eventListenerFactory() {
            r1 = this;
            okhttp3.EventListener$Factory r0 = r1.eventListenerFactory
            return r0
    }

    @kotlin.jvm.JvmName(name = "fastFallback")
    public final boolean fastFallback() {
            r1 = this;
            boolean r0 = r1.fastFallback
            return r0
    }

    @kotlin.jvm.JvmName(name = "followRedirects")
    public final boolean followRedirects() {
            r1 = this;
            boolean r0 = r1.followRedirects
            return r0
    }

    @kotlin.jvm.JvmName(name = "followSslRedirects")
    public final boolean followSslRedirects() {
            r1 = this;
            boolean r0 = r1.followSslRedirects
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.RouteDatabase getRouteDatabase$okhttp() {
            r1 = this;
            okhttp3.internal.connection.RouteDatabase r0 = r1.routeDatabase
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.concurrent.TaskRunner getTaskRunner$okhttp() {
            r1 = this;
            okhttp3.internal.concurrent.TaskRunner r0 = r1.taskRunner
            return r0
    }

    @kotlin.jvm.JvmName(name = "hostnameVerifier")
    @org.jetbrains.annotations.NotNull
    public final javax.net.ssl.HostnameVerifier hostnameVerifier() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.hostnameVerifier
            return r0
    }

    @kotlin.jvm.JvmName(name = "interceptors")
    @org.jetbrains.annotations.NotNull
    public final java.util.List<okhttp3.Interceptor> interceptors() {
            r1 = this;
            java.util.List<okhttp3.Interceptor> r0 = r1.interceptors
            return r0
    }

    @kotlin.jvm.JvmName(name = "minWebSocketMessageToCompress")
    public final long minWebSocketMessageToCompress() {
            r2 = this;
            long r0 = r2.minWebSocketMessageToCompress
            return r0
    }

    @kotlin.jvm.JvmName(name = "networkInterceptors")
    @org.jetbrains.annotations.NotNull
    public final java.util.List<okhttp3.Interceptor> networkInterceptors() {
            r1 = this;
            java.util.List<okhttp3.Interceptor> r0 = r1.networkInterceptors
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.OkHttpClient.Builder newBuilder() {
            r1 = this;
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>(r1)
            return r0
    }

    @Override // okhttp3.Call.Factory
    @org.jetbrains.annotations.NotNull
    public okhttp3.Call newCall(@org.jetbrains.annotations.NotNull okhttp3.Request r3) {
            r2 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.g0.p(r3, r0)
            okhttp3.internal.connection.RealCall r0 = new okhttp3.internal.connection.RealCall
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // okhttp3.WebSocket.Factory
    @org.jetbrains.annotations.NotNull
    public okhttp3.WebSocket newWebSocket(@org.jetbrains.annotations.NotNull okhttp3.Request r14, @org.jetbrains.annotations.NotNull okhttp3.WebSocketListener r15) {
            r13 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.g0.p(r15, r0)
            okhttp3.internal.ws.RealWebSocket r1 = new okhttp3.internal.ws.RealWebSocket
            okhttp3.internal.concurrent.TaskRunner r2 = r13.taskRunner
            java.util.Random r5 = new java.util.Random
            r5.<init>()
            int r0 = r13.pingIntervalMillis
            long r6 = (long) r0
            long r9 = r13.minWebSocketMessageToCompress
            int r0 = r13.webSocketCloseTimeout
            long r11 = (long) r0
            r8 = 0
            r3 = r14
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r11)
            r1.connect(r13)
            return r1
    }

    @kotlin.jvm.JvmName(name = "pingIntervalMillis")
    public final int pingIntervalMillis() {
            r1 = this;
            int r0 = r1.pingIntervalMillis
            return r0
    }

    @kotlin.jvm.JvmName(name = "protocols")
    @org.jetbrains.annotations.NotNull
    public final java.util.List<okhttp3.Protocol> protocols() {
            r1 = this;
            java.util.List<okhttp3.Protocol> r0 = r1.protocols
            return r0
    }

    @kotlin.jvm.JvmName(name = "proxy")
    @org.jetbrains.annotations.Nullable
    public final java.net.Proxy proxy() {
            r1 = this;
            java.net.Proxy r0 = r1.proxy
            return r0
    }

    @kotlin.jvm.JvmName(name = "proxyAuthenticator")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.Authenticator proxyAuthenticator() {
            r1 = this;
            okhttp3.Authenticator r0 = r1.proxyAuthenticator
            return r0
    }

    @kotlin.jvm.JvmName(name = "proxySelector")
    @org.jetbrains.annotations.NotNull
    public final java.net.ProxySelector proxySelector() {
            r1 = this;
            java.net.ProxySelector r0 = r1.proxySelector
            return r0
    }

    @kotlin.jvm.JvmName(name = "readTimeoutMillis")
    public final int readTimeoutMillis() {
            r1 = this;
            int r0 = r1.readTimeoutMillis
            return r0
    }

    @kotlin.jvm.JvmName(name = "retryOnConnectionFailure")
    public final boolean retryOnConnectionFailure() {
            r1 = this;
            boolean r0 = r1.retryOnConnectionFailure
            return r0
    }

    @kotlin.jvm.JvmName(name = "socketFactory")
    @org.jetbrains.annotations.NotNull
    public final javax.net.SocketFactory socketFactory() {
            r1 = this;
            javax.net.SocketFactory r0 = r1.socketFactory
            return r0
    }

    @kotlin.jvm.JvmName(name = "sslSocketFactory")
    @org.jetbrains.annotations.NotNull
    public final javax.net.ssl.SSLSocketFactory sslSocketFactory() {
            r2 = this;
            javax.net.ssl.SSLSocketFactory r0 = r2.sslSocketFactoryOrNull
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "CLEARTEXT-only client"
            r0.<init>(r1)
            throw r0
    }

    @kotlin.jvm.JvmName(name = "webSocketCloseTimeout")
    public final int webSocketCloseTimeout() {
            r1 = this;
            int r0 = r1.webSocketCloseTimeout
            return r0
    }

    @kotlin.jvm.JvmName(name = "writeTimeoutMillis")
    public final int writeTimeoutMillis() {
            r1 = this;
            int r0 = r1.writeTimeoutMillis
            return r0
    }

    @kotlin.jvm.JvmName(name = "x509TrustManager")
    @org.jetbrains.annotations.Nullable
    public final javax.net.ssl.X509TrustManager x509TrustManager() {
            r1 = this;
            javax.net.ssl.X509TrustManager r0 = r1.x509TrustManager
            return r0
    }
}
