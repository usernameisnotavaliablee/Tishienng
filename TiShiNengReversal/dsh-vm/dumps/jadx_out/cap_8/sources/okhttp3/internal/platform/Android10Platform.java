package okhttp3.internal.platform;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@okhttp3.internal.SuppressSignatureCheck
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAndroid10Platform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Android10Platform.kt\nokhttp3/internal/platform/Android10Platform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n774#2:134\n865#2,2:135\n1#3:137\n*S KotlinDebug\n*F\n+ 1 Android10Platform.kt\nokhttp3/internal/platform/Android10Platform\n*L\n55#1:134\n55#1:135,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Android10Platform extends okhttp3.internal.platform.Platform implements okhttp3.internal.platform.ContextAwarePlatform {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.Android10Platform.Companion Companion = null;
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
                okhttp3.internal.platform.Android10Platform r0 = new okhttp3.internal.platform.Android10Platform
                r0.<init>()
                return r0
            Lc:
                r0 = 0
                return r0
        }

        public final boolean isSupported() {
                r1 = this;
                boolean r0 = okhttp3.internal.platform.Android10Platform.access$isSupported$cp()
                return r0
        }
    }

    static {
            okhttp3.internal.platform.Android10Platform$Companion r0 = new okhttp3.internal.platform.Android10Platform$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.Android10Platform.Companion = r0
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            boolean r0 = r0.isAndroid()
            if (r0 == 0) goto L18
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            okhttp3.internal.platform.Android10Platform.isSupported = r0
            return
    }

    public Android10Platform() {
            r6 = this;
            r6.<init>()
            okhttp3.internal.platform.android.Android10SocketAdapter$Companion r0 = okhttp3.internal.platform.android.Android10SocketAdapter.Companion
            okhttp3.internal.platform.android.SocketAdapter r0 = r0.buildIfSupported()
            okhttp3.internal.platform.android.DeferredSocketAdapter r1 = new okhttp3.internal.platform.android.DeferredSocketAdapter
            okhttp3.internal.platform.android.AndroidSocketAdapter$Companion r2 = okhttp3.internal.platform.android.AndroidSocketAdapter.Companion
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r2 = r2.getPlayProviderFactory()
            r1.<init>(r2)
            okhttp3.internal.platform.android.DeferredSocketAdapter r2 = new okhttp3.internal.platform.android.DeferredSocketAdapter
            okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion r3 = okhttp3.internal.platform.android.ConscryptSocketAdapter.Companion
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r3 = r3.getFactory()
            r2.<init>(r3)
            okhttp3.internal.platform.android.DeferredSocketAdapter r3 = new okhttp3.internal.platform.android.DeferredSocketAdapter
            okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion r4 = okhttp3.internal.platform.android.BouncyCastleSocketAdapter.Companion
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r4 = r4.getFactory()
            r3.<init>(r4)
            r4 = 4
            okhttp3.internal.platform.android.SocketAdapter[] r4 = new okhttp3.internal.platform.android.SocketAdapter[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 3
            r4[r0] = r3
            java.util.List r0 = kotlin.collections.f0.S(r4)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L48:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r0.next()
            r3 = r2
            okhttp3.internal.platform.android.SocketAdapter r3 = (okhttp3.internal.platform.android.SocketAdapter) r3
            boolean r3 = r3.isSupported()
            if (r3 == 0) goto L48
            r1.add(r2)
            goto L48
        L5f:
            r6.socketAdapters = r1
            return
    }

    public static final /* synthetic */ boolean access$isSupported$cp() {
            boolean r0 = okhttp3.internal.platform.Android10Platform.isSupported
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
    public okhttp3.internal.tls.TrustRootIndex buildTrustRootIndex(@org.jetbrains.annotations.NotNull javax.net.ssl.X509TrustManager r2) {
            r1 = this;
            java.lang.String r0 = "trustManager"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "buildTrustRootIndex"
            android.os.StrictMode.noteSlowCall(r0)
            okhttp3.internal.tls.TrustRootIndex r2 = super.buildTrustRootIndex(r2)
            return r2
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r4, @org.jetbrains.annotations.Nullable java.lang.String r5, @org.jetbrains.annotations.NotNull java.util.List<? extends okhttp3.Protocol> r6) {
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

    @Override // okhttp3.internal.platform.ContextAwarePlatform
    @org.jetbrains.annotations.Nullable
    public android.content.Context getApplicationContext() {
            r1 = this;
            android.content.Context r0 = r1.applicationContext
            return r0
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
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getStackTraceForCloseable(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "closer"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L13
            android.util.CloseGuard r0 = x4.f.a()
            x4.c.a(r0, r3)
            return r0
        L13:
            java.lang.Object r3 = super.getStackTraceForCloseable(r3)
            return r3
    }

    @Override // okhttp3.internal.platform.Platform
    @android.annotation.SuppressLint({"NewApi"})
    public boolean isCleartextTrafficPermitted(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.g0.p(r2, r0)
            android.security.NetworkSecurityPolicy r0 = x4.a.a()
            boolean r2 = x4.b.a(r0, r2)
            return r2
    }

    @Override // okhttp3.internal.platform.Platform
    public void log(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2, @org.jetbrains.annotations.Nullable java.lang.Throwable r3) {
            r0 = this;
            java.lang.String r3 = "message"
            kotlin.jvm.internal.g0.p(r1, r3)
            r1 = 5
            if (r2 != r1) goto Le
            okhttp3.internal.platform.AndroidPlatform$Companion r1 = okhttp3.internal.platform.AndroidPlatform.Companion
            r1.getTag()
            return
        Le:
            okhttp3.internal.platform.AndroidPlatform$Companion r1 = okhttp3.internal.platform.AndroidPlatform.Companion
            r1.getTag()
            return
    }

    @Override // okhttp3.internal.platform.Platform
    public void logCloseableLeak(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r2 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L18
            java.lang.String r3 = "null cannot be cast to non-null type android.util.CloseGuard"
            kotlin.jvm.internal.g0.n(r4, r3)
            android.util.CloseGuard r3 = x4.d.a(r4)
            x4.e.a(r3)
            return
        L18:
            super.logCloseableLeak(r3, r4)
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
