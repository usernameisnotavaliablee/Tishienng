package okhttp3.internal.platform.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBouncyCastleSocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BouncyCastleSocketAdapter.kt\nokhttp3/internal/platform/android/BouncyCastleSocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,77:1\n37#2,2:78\n*S KotlinDebug\n*F\n+ 1 BouncyCastleSocketAdapter.kt\nokhttp3/internal/platform/android/BouncyCastleSocketAdapter\n*L\n52#1:78,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class BouncyCastleSocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.android.BouncyCastleSocketAdapter.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory factory = null;
    private static final boolean isSupported = false;

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
        public final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory getFactory() {
                r1 = this;
                okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = okhttp3.internal.platform.android.BouncyCastleSocketAdapter.access$getFactory$cp()
                return r0
        }

        public final boolean isSupported() {
                r1 = this;
                boolean r0 = okhttp3.internal.platform.android.BouncyCastleSocketAdapter.access$isSupported$cp()
                return r0
        }
    }

    static {
            okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion r0 = new okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.android.BouncyCastleSocketAdapter.Companion = r0
            okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion$factory$1 r1 = new okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion$factory$1
            r1.<init>()
            okhttp3.internal.platform.android.BouncyCastleSocketAdapter.factory = r1
            r1 = 0
            java.lang.String r2 = "org.bouncycastle.jsse.provider.BouncyCastleJsseProvider"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L1e
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1e
            java.lang.Class.forName(r2, r1, r0)     // Catch: java.lang.ClassNotFoundException -> L1e
            r1 = 1
        L1e:
            okhttp3.internal.platform.android.BouncyCastleSocketAdapter.isSupported = r1
            return
    }

    public BouncyCastleSocketAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ okhttp3.internal.platform.android.DeferredSocketAdapter.Factory access$getFactory$cp() {
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = okhttp3.internal.platform.android.BouncyCastleSocketAdapter.factory
            return r0
    }

    public static final /* synthetic */ boolean access$isSupported$cp() {
            boolean r0 = okhttp3.internal.platform.android.BouncyCastleSocketAdapter.isSupported
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.NotNull java.util.List<? extends okhttp3.Protocol> r4) {
            r1 = this;
            java.lang.String r3 = "sslSocket"
            kotlin.jvm.internal.g0.p(r2, r3)
            java.lang.String r3 = "protocols"
            kotlin.jvm.internal.g0.p(r4, r3)
            boolean r3 = r1.matchesSocket(r2)
            if (r3 == 0) goto L2d
            org.bouncycastle.jsse.BCSSLSocket r2 = (org.bouncycastle.jsse.BCSSLSocket) r2
            org.bouncycastle.jsse.BCSSLParameters r3 = r2.getParameters()
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            java.util.List r4 = r0.alpnProtocolNames(r4)
            java.util.Collection r4 = (java.util.Collection) r4
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r4 = r4.toArray(r0)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r3.setApplicationProtocols(r4)
            r2.setParameters(r3)
        L2d:
            return
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    @org.jetbrains.annotations.Nullable
    public java.lang.String getSelectedProtocol(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r2, r0)
            org.bouncycastle.jsse.BCSSLSocket r2 = (org.bouncycastle.jsse.BCSSLSocket) r2
            java.lang.String r2 = r2.getApplicationProtocol()
            if (r2 == 0) goto L17
            java.lang.String r0 = ""
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r0 == 0) goto L16
            goto L17
        L16:
            return r2
        L17:
            r2 = 0
            return r2
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
            r1 = this;
            boolean r0 = okhttp3.internal.platform.android.BouncyCastleSocketAdapter.isSupported
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 0
            return r2
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public /* bridge */ boolean matchesSocketFactory(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocketFactory r1) {
            r0 = this;
            boolean r1 = okhttp3.internal.platform.android.b.a(r0, r1)
            return r1
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    @org.jetbrains.annotations.Nullable
    public /* bridge */ javax.net.ssl.X509TrustManager trustManager(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocketFactory r1) {
            r0 = this;
            javax.net.ssl.X509TrustManager r1 = okhttp3.internal.platform.android.b.b(r0, r1)
            return r1
    }
}
