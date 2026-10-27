package okhttp3.internal.platform;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@okhttp3.internal.SuppressSignatureCheck
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAndroidPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n774#2:187\n865#2,2:188\n1#3:190\n*S KotlinDebug\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n*L\n60#1:187\n60#1:188,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class AndroidPlatform extends okhttp3.internal.platform.Platform implements okhttp3.internal.platform.ContextAwarePlatform {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.AndroidPlatform.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String Tag = null;
    private static final boolean isSupported = false;

    @org.jetbrains.annotations.Nullable
    private android.content.Context applicationContext;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<okhttp3.internal.platform.android.SocketAdapter> socketAdapters;

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

        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.platform.Platform buildIfSupported() {
                r1 = this;
                boolean r0 = r1.isSupported()
                if (r0 == 0) goto Lc
                okhttp3.internal.platform.AndroidPlatform r0 = new okhttp3.internal.platform.AndroidPlatform
                r0.<init>()
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTag() {
                r1 = this;
                java.lang.String r0 = okhttp3.internal.platform.AndroidPlatform.access$getTag$cp()
                return r0
        }

        public final boolean isSupported() {
                r1 = this;
                boolean r0 = okhttp3.internal.platform.AndroidPlatform.access$isSupported$cp()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class CustomTrustRootIndex implements okhttp3.internal.tls.TrustRootIndex {

        @org.jetbrains.annotations.NotNull
        private final java.lang.reflect.Method findByIssuerAndSignatureMethod;

        @org.jetbrains.annotations.NotNull
        private final javax.net.ssl.X509TrustManager trustManager;

        public CustomTrustRootIndex(@org.jetbrains.annotations.NotNull javax.net.ssl.X509TrustManager r2, @org.jetbrains.annotations.NotNull java.lang.reflect.Method r3) {
                r1 = this;
                java.lang.String r0 = "trustManager"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "findByIssuerAndSignatureMethod"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.<init>()
                r1.trustManager = r2
                r1.findByIssuerAndSignatureMethod = r3
                return
        }

        private final javax.net.ssl.X509TrustManager component1() {
                r1 = this;
                javax.net.ssl.X509TrustManager r0 = r1.trustManager
                return r0
        }

        private final java.lang.reflect.Method component2() {
                r1 = this;
                java.lang.reflect.Method r0 = r1.findByIssuerAndSignatureMethod
                return r0
        }

        public static /* synthetic */ okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex copy$default(okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex r0, javax.net.ssl.X509TrustManager r1, java.lang.reflect.Method r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                javax.net.ssl.X509TrustManager r1 = r0.trustManager
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                java.lang.reflect.Method r2 = r0.findByIssuerAndSignatureMethod
            Lc:
                okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex r0 = r0.copy(r1, r2)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex copy(@org.jetbrains.annotations.NotNull javax.net.ssl.X509TrustManager r2, @org.jetbrains.annotations.NotNull java.lang.reflect.Method r3) {
                r1 = this;
                java.lang.String r0 = "trustManager"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "findByIssuerAndSignatureMethod"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex r0 = new okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex r5 = (okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex) r5
                javax.net.ssl.X509TrustManager r1 = r4.trustManager
                javax.net.ssl.X509TrustManager r3 = r5.trustManager
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.reflect.Method r1 = r4.findByIssuerAndSignatureMethod
                java.lang.reflect.Method r5 = r5.findByIssuerAndSignatureMethod
                boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        @org.jetbrains.annotations.Nullable
        public java.security.cert.X509Certificate findByIssuerAndSignature(@org.jetbrains.annotations.NotNull java.security.cert.X509Certificate r5) {
                r4 = this;
                java.lang.String r0 = "cert"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.reflect.Method r0 = r4.findByIssuerAndSignatureMethod     // Catch: java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L21
                javax.net.ssl.X509TrustManager r1 = r4.trustManager     // Catch: java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L21
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L21
                r3 = 0
                r2[r3] = r5     // Catch: java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L21
                java.lang.Object r5 = r0.invoke(r1, r2)     // Catch: java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L21
                java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.TrustAnchor"
                kotlin.jvm.internal.g0.n(r5, r0)     // Catch: java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L21
                java.security.cert.TrustAnchor r5 = (java.security.cert.TrustAnchor) r5     // Catch: java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L21
                java.security.cert.X509Certificate r5 = r5.getTrustedCert()     // Catch: java.lang.IllegalAccessException -> L1f java.lang.reflect.InvocationTargetException -> L21
                return r5
            L1f:
                r5 = move-exception
                goto L23
            L21:
                r5 = 0
                return r5
            L23:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "unable to get issues and signature"
                r0.<init>(r1, r5)
                throw r0
        }

        public int hashCode() {
                r2 = this;
                javax.net.ssl.X509TrustManager r0 = r2.trustManager
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.reflect.Method r1 = r2.findByIssuerAndSignatureMethod
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "CustomTrustRootIndex(trustManager="
                r0.append(r1)
                javax.net.ssl.X509TrustManager r1 = r2.trustManager
                r0.append(r1)
                java.lang.String r1 = ", findByIssuerAndSignatureMethod="
                r0.append(r1)
                java.lang.reflect.Method r1 = r2.findByIssuerAndSignatureMethod
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            okhttp3.internal.platform.AndroidPlatform$Companion r0 = new okhttp3.internal.platform.AndroidPlatform$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.AndroidPlatform.Companion = r0
            java.lang.String r0 = "OkHttp"
            okhttp3.internal.platform.AndroidPlatform.Tag = r0
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            boolean r0 = r0.isAndroid()
            if (r0 == 0) goto L1c
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            okhttp3.internal.platform.AndroidPlatform.isSupported = r0
            return
    }

    public AndroidPlatform() {
            r7 = this;
            r7.<init>()
            okhttp3.internal.platform.android.StandardAndroidSocketAdapter$Companion r0 = okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion
            r1 = 0
            r2 = 1
            okhttp3.internal.platform.android.SocketAdapter r0 = okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion.buildIfSupported$default(r0, r1, r2, r1)
            okhttp3.internal.platform.android.DeferredSocketAdapter r1 = new okhttp3.internal.platform.android.DeferredSocketAdapter
            okhttp3.internal.platform.android.AndroidSocketAdapter$Companion r3 = okhttp3.internal.platform.android.AndroidSocketAdapter.Companion
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r3 = r3.getPlayProviderFactory()
            r1.<init>(r3)
            okhttp3.internal.platform.android.DeferredSocketAdapter r3 = new okhttp3.internal.platform.android.DeferredSocketAdapter
            okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion r4 = okhttp3.internal.platform.android.ConscryptSocketAdapter.Companion
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r4 = r4.getFactory()
            r3.<init>(r4)
            okhttp3.internal.platform.android.DeferredSocketAdapter r4 = new okhttp3.internal.platform.android.DeferredSocketAdapter
            okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion r5 = okhttp3.internal.platform.android.BouncyCastleSocketAdapter.Companion
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r5 = r5.getFactory()
            r4.<init>(r5)
            r5 = 4
            okhttp3.internal.platform.android.SocketAdapter[] r5 = new okhttp3.internal.platform.android.SocketAdapter[r5]
            r6 = 0
            r5[r6] = r0
            r5[r2] = r1
            r0 = 2
            r5[r0] = r3
            r0 = 3
            r5[r0] = r4
            java.util.List r0 = kotlin.collections.f0.S(r5)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L49:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L60
            java.lang.Object r2 = r0.next()
            r3 = r2
            okhttp3.internal.platform.android.SocketAdapter r3 = (okhttp3.internal.platform.android.SocketAdapter) r3
            boolean r3 = r3.isSupported()
            if (r3 == 0) goto L49
            r1.add(r2)
            goto L49
        L60:
            r7.socketAdapters = r1
            return
    }

    public static final /* synthetic */ java.lang.String access$getTag$cp() {
            java.lang.String r0 = okhttp3.internal.platform.AndroidPlatform.Tag
            return r0
    }

    public static final /* synthetic */ boolean access$isSupported$cp() {
            boolean r0 = okhttp3.internal.platform.AndroidPlatform.isSupported
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    @org.jetbrains.annotations.NotNull
    public okhttp3.internal.tls.CertificateChainCleaner buildCertificateChainCleaner(@org.jetbrains.annotations.NotNull javax.net.ssl.X509TrustManager r2) {
            r1 = this;
            java.lang.String r0 = "trustManager"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.internal.platform.android.AndroidCertificateChainCleaner$Companion r0 = okhttp3.internal.platform.android.AndroidCertificateChainCleaner.Companion
            okhttp3.internal.platform.android.AndroidCertificateChainCleaner r0 = r0.buildIfSupported(r2)
            if (r0 == 0) goto Le
            return r0
        Le:
            okhttp3.internal.tls.CertificateChainCleaner r2 = super.buildCertificateChainCleaner(r2)
            return r2
    }

    @Override // okhttp3.internal.platform.Platform
    @org.jetbrains.annotations.NotNull
    public okhttp3.internal.tls.TrustRootIndex buildTrustRootIndex(@org.jetbrains.annotations.NotNull javax.net.ssl.X509TrustManager r7) {
            r6 = this;
            java.lang.String r0 = "trustManager"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "buildTrustRootIndex"
            android.os.StrictMode.noteSlowCall(r0)     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.String r1 = "findTrustAnchorByIssuerAndSignature"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class<java.security.cert.X509Certificate> r4 = java.security.cert.X509Certificate.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.NoSuchMethodException -> L28
            r0.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L28
            okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex r1 = new okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex     // Catch: java.lang.NoSuchMethodException -> L28
            kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.NoSuchMethodException -> L28
            r1.<init>(r7, r0)     // Catch: java.lang.NoSuchMethodException -> L28
            return r1
        L28:
            okhttp3.internal.tls.TrustRootIndex r7 = super.buildTrustRootIndex(r7)
            return r7
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r4, @org.jetbrains.annotations.Nullable java.lang.String r5, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.Protocol> r6) {
            r3 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "protocols"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.List<okhttp3.internal.platform.android.SocketAdapter> r0 = r3.socketAdapters
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            r2 = r1
            okhttp3.internal.platform.android.SocketAdapter r2 = (okhttp3.internal.platform.android.SocketAdapter) r2
            boolean r2 = r2.matchesSocket(r4)
            if (r2 == 0) goto L12
            goto L27
        L26:
            r1 = 0
        L27:
            okhttp3.internal.platform.android.SocketAdapter r1 = (okhttp3.internal.platform.android.SocketAdapter) r1
            if (r1 == 0) goto L2e
            r1.configureTlsExtensions(r4, r5, r6)
        L2e:
            return
    }

    @Override // okhttp3.internal.platform.Platform
    public void connectSocket(@org.jetbrains.annotations.NotNull java.net.Socket r2, @org.jetbrains.annotations.NotNull java.net.InetSocketAddress r3, int r4) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "socket"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "address"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.connect(r3, r4)     // Catch: java.lang.ClassCastException -> Le
            return
        Le:
            r2 = move-exception
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 != r4) goto L1d
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Exception in connect"
            r3.<init>(r4, r2)
            throw r3
        L1d:
            throw r2
    }

    @Override // okhttp3.internal.platform.ContextAwarePlatform
    @org.jetbrains.annotations.Nullable
    public android.content.Context getApplicationContext() {
            r1 = this;
            android.content.Context r0 = r1.applicationContext
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.String> getHandshakeServerNames(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r3) {
            r2 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 > r1) goto L10
            java.util.List r3 = kotlin.collections.f0.J()
            return r3
        L10:
            java.util.List r3 = super.getHandshakeServerNames(r3)
            return r3
    }

    @Override // okhttp3.internal.platform.Platform
    @org.jetbrains.annotations.Nullable
    public java.lang.String getSelectedProtocol(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r5) {
            r4 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.List<okhttp3.internal.platform.android.SocketAdapter> r0 = r4.socketAdapters
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            r3 = r1
            okhttp3.internal.platform.android.SocketAdapter r3 = (okhttp3.internal.platform.android.SocketAdapter) r3
            boolean r3 = r3.matchesSocket(r5)
            if (r3 == 0) goto Ld
            goto L23
        L22:
            r1 = r2
        L23:
            okhttp3.internal.platform.android.SocketAdapter r1 = (okhttp3.internal.platform.android.SocketAdapter) r1
            if (r1 == 0) goto L2c
            java.lang.String r5 = r1.getSelectedProtocol(r5)
            return r5
        L2c:
            return r2
    }

    @Override // okhttp3.internal.platform.Platform
    public boolean isCleartextTrafficPermitted(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L14
            android.security.NetworkSecurityPolicy r0 = x4.a.a()
            boolean r3 = x4.b.a(r0, r3)
            return r3
        L14:
            r3 = 23
            if (r0 < r3) goto L21
            android.security.NetworkSecurityPolicy r3 = x4.a.a()
            boolean r3 = x4.g.a(r3)
            return r3
        L21:
            r3 = 1
            return r3
    }

    @Override // okhttp3.internal.platform.Platform
    public void log(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2, @org.jetbrains.annotations.Nullable java.lang.Throwable r3) {
            r0 = this;
            java.lang.String r2 = "message"
            kotlin.jvm.internal.g0.p(r1, r2)
            return
    }

    @Override // okhttp3.internal.platform.Platform
    @org.jetbrains.annotations.NotNull
    public javax.net.ssl.SSLContext newSSLContext() {
            r1 = this;
            java.lang.String r0 = "newSSLContext"
            android.os.StrictMode.noteSlowCall(r0)
            javax.net.ssl.SSLContext r0 = super.newSSLContext()
            return r0
    }

    @Override // okhttp3.internal.platform.ContextAwarePlatform
    public void setApplicationContext(@org.jetbrains.annotations.Nullable android.content.Context r1) {
            r0 = this;
            r0.applicationContext = r1
            return
    }

    @Override // okhttp3.internal.platform.Platform
    @org.jetbrains.annotations.Nullable
    public javax.net.ssl.X509TrustManager trustManager(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocketFactory r5) {
            r4 = this;
            java.lang.String r0 = "sslSocketFactory"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.List<okhttp3.internal.platform.android.SocketAdapter> r0 = r4.socketAdapters
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            r3 = r1
            okhttp3.internal.platform.android.SocketAdapter r3 = (okhttp3.internal.platform.android.SocketAdapter) r3
            boolean r3 = r3.matchesSocketFactory(r5)
            if (r3 == 0) goto Ld
            goto L23
        L22:
            r1 = r2
        L23:
            okhttp3.internal.platform.android.SocketAdapter r1 = (okhttp3.internal.platform.android.SocketAdapter) r1
            if (r1 == 0) goto L2c
            javax.net.ssl.X509TrustManager r5 = r1.trustManager(r5)
            return r5
        L2c:
            return r2
    }
}
