package okhttp3.internal.platform.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nConscryptSocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConscryptSocketAdapter.kt\nokhttp3/internal/platform/android/ConscryptSocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,97:1\n37#2,2:98\n*S KotlinDebug\n*F\n+ 1 ConscryptSocketAdapter.kt\nokhttp3/internal/platform/android/ConscryptSocketAdapter\n*L\n50#1:98,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class ConscryptSocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.android.ConscryptSocketAdapter.Companion Companion = null;

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

        public static /* synthetic */ boolean atLeastVersion$default(okhttp3.internal.platform.android.ConscryptSocketAdapter.Companion r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
                r6 = r5 & 2
                r0 = 0
                if (r6 == 0) goto L6
                r3 = 0
            L6:
                r5 = r5 & 4
                if (r5 == 0) goto Lb
                r4 = 0
            Lb:
                boolean r1 = r1.atLeastVersion(r2, r3, r4)
                return r1
        }

        public final boolean atLeastVersion(int r5, int r6, int r7) {
                r4 = this;
                org.conscrypt.Conscrypt$Version r0 = org.conscrypt.Conscrypt.version()
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                int r2 = r0.major()
                r3 = 1
                if (r2 == r5) goto L17
                int r6 = r0.major()
                if (r6 <= r5) goto L16
                return r3
            L16:
                return r1
            L17:
                int r5 = r0.minor()
                if (r5 == r6) goto L25
                int r5 = r0.minor()
                if (r5 <= r6) goto L24
                return r3
            L24:
                return r1
            L25:
                int r5 = r0.patch()
                if (r5 < r7) goto L2c
                return r3
            L2c:
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory getFactory() {
                r1 = this;
                okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = okhttp3.internal.platform.android.ConscryptSocketAdapter.access$getFactory$cp()
                return r0
        }

        public final boolean isSupported() {
                r1 = this;
                boolean r0 = okhttp3.internal.platform.android.ConscryptSocketAdapter.access$isSupported$cp()
                return r0
        }
    }

    static {
            okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion r0 = new okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.android.ConscryptSocketAdapter.Companion = r0
            okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion$factory$1 r1 = new okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion$factory$1
            r1.<init>()
            okhttp3.internal.platform.android.ConscryptSocketAdapter.factory = r1
            r1 = 0
            java.lang.String r2 = "org.conscrypt.Conscrypt$Version"
            java.lang.Class r3 = r0.getClass()     // Catch: java.lang.Throwable -> L2c
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L2c
            java.lang.Class.forName(r2, r1, r3)     // Catch: java.lang.Throwable -> L2c
            boolean r2 = org.conscrypt.Conscrypt.isAvailable()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2c
            r2 = 2
            r3 = 1
            boolean r0 = r0.atLeastVersion(r2, r3, r1)     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2c
            r1 = 1
        L2c:
            okhttp3.internal.platform.android.ConscryptSocketAdapter.isSupported = r1
            return
    }

    public ConscryptSocketAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ okhttp3.internal.platform.android.DeferredSocketAdapter.Factory access$getFactory$cp() {
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = okhttp3.internal.platform.android.ConscryptSocketAdapter.factory
            return r0
    }

    public static final /* synthetic */ boolean access$isSupported$cp() {
            boolean r0 = okhttp3.internal.platform.android.ConscryptSocketAdapter.isSupported
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r1, @org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.List<? extends okhttp3.Protocol> r3) {
            r0 = this;
            java.lang.String r2 = "sslSocket"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.lang.String r2 = "protocols"
            kotlin.jvm.internal.g0.p(r3, r2)
            boolean r2 = r0.matchesSocket(r1)
            if (r2 == 0) goto L28
            r2 = 1
            org.conscrypt.Conscrypt.setUseSessionTickets(r1, r2)
            okhttp3.internal.platform.Platform$Companion r2 = okhttp3.internal.platform.Platform.Companion
            java.util.List r2 = r2.alpnProtocolNames(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            org.conscrypt.Conscrypt.setApplicationProtocols(r1, r2)
        L28:
            return
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    @org.jetbrains.annotations.Nullable
    public java.lang.String getSelectedProtocol(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.matchesSocket(r2)
            if (r0 == 0) goto L10
            java.lang.String r2 = org.conscrypt.Conscrypt.getApplicationProtocol(r2)
            return r2
        L10:
            r2 = 0
            return r2
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
            r1 = this;
            boolean r0 = okhttp3.internal.platform.android.ConscryptSocketAdapter.isSupported
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r2 = org.conscrypt.Conscrypt.isConscrypt(r2)
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
