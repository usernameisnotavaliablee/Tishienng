package okhttp3.internal.platform.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class StandardAndroidSocketAdapter extends okhttp3.internal.platform.android.AndroidSocketAdapter {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Class<?> paramClass;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Class<? super javax.net.ssl.SSLSocketFactory> sslSocketFactoryClass;

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

        public static /* synthetic */ okhttp3.internal.platform.android.SocketAdapter buildIfSupported$default(okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion r0, java.lang.String r1, int r2, java.lang.Object r3) {
                r2 = r2 & 1
                if (r2 == 0) goto L6
                java.lang.String r1 = "com.android.org.conscrypt"
            L6:
                okhttp3.internal.platform.android.SocketAdapter r0 = r0.buildIfSupported(r1)
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.platform.android.SocketAdapter buildIfSupported(@org.jetbrains.annotations.NotNull java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = "packageName"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L57
                r0.<init>()     // Catch: java.lang.Exception -> L57
                r0.append(r5)     // Catch: java.lang.Exception -> L57
                java.lang.String r1 = ".OpenSSLSocketImpl"
                r0.append(r1)     // Catch: java.lang.Exception -> L57
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L57
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L57
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>"
                kotlin.jvm.internal.g0.n(r0, r1)     // Catch: java.lang.Exception -> L57
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L57
                r1.<init>()     // Catch: java.lang.Exception -> L57
                r1.append(r5)     // Catch: java.lang.Exception -> L57
                java.lang.String r2 = ".OpenSSLSocketFactoryImpl"
                r1.append(r2)     // Catch: java.lang.Exception -> L57
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L57
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L57
                java.lang.String r2 = "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>"
                kotlin.jvm.internal.g0.n(r1, r2)     // Catch: java.lang.Exception -> L57
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L57
                r2.<init>()     // Catch: java.lang.Exception -> L57
                r2.append(r5)     // Catch: java.lang.Exception -> L57
                java.lang.String r5 = ".SSLParametersImpl"
                r2.append(r5)     // Catch: java.lang.Exception -> L57
                java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> L57
                java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> L57
                okhttp3.internal.platform.android.StandardAndroidSocketAdapter r2 = new okhttp3.internal.platform.android.StandardAndroidSocketAdapter     // Catch: java.lang.Exception -> L57
                kotlin.jvm.internal.g0.m(r5)     // Catch: java.lang.Exception -> L57
                r2.<init>(r0, r1, r5)     // Catch: java.lang.Exception -> L57
                return r2
            L57:
                r5 = move-exception
                okhttp3.internal.platform.android.AndroidLog r0 = okhttp3.internal.platform.android.AndroidLog.INSTANCE
                java.lang.Class<okhttp3.OkHttpClient> r1 = okhttp3.OkHttpClient.class
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "getName(...)"
                kotlin.jvm.internal.g0.o(r1, r2)
                r2 = 5
                java.lang.String r3 = "unable to load android socket classes"
                r0.androidLog$okhttp(r1, r2, r3, r5)
                r5 = 0
                return r5
        }
    }

    static {
            okhttp3.internal.platform.android.StandardAndroidSocketAdapter$Companion r0 = new okhttp3.internal.platform.android.StandardAndroidSocketAdapter$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion = r0
            return
    }

    public StandardAndroidSocketAdapter(@org.jetbrains.annotations.NotNull java.lang.Class<? super javax.net.ssl.SSLSocket> r2, @org.jetbrains.annotations.NotNull java.lang.Class<? super javax.net.ssl.SSLSocketFactory> r3, @org.jetbrains.annotations.NotNull java.lang.Class<?> r4) {
            r1 = this;
            java.lang.String r0 = "sslSocketClass"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "sslSocketFactoryClass"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "paramClass"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>(r2)
            r1.sslSocketFactoryClass = r3
            r1.paramClass = r4
            return
    }

    @Override // okhttp3.internal.platform.android.AndroidSocketAdapter, okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocketFactory r2) {
            r1 = this;
            java.lang.String r0 = "sslSocketFactory"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Class<? super javax.net.ssl.SSLSocketFactory> r0 = r1.sslSocketFactoryClass
            boolean r2 = r0.isInstance(r2)
            return r2
    }

    @Override // okhttp3.internal.platform.android.AndroidSocketAdapter, okhttp3.internal.platform.android.SocketAdapter
    @org.jetbrains.annotations.Nullable
    public javax.net.ssl.X509TrustManager trustManager(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocketFactory r3) {
            r2 = this;
            java.lang.String r0 = "sslSocketFactory"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Class<?> r0 = r2.paramClass
            java.lang.String r1 = "sslParameters"
            java.lang.Object r3 = okhttp3.internal._UtilJvmKt.readFieldOrNull(r3, r0, r1)
            kotlin.jvm.internal.g0.m(r3)
            java.lang.String r0 = "x509TrustManager"
            java.lang.Class<javax.net.ssl.X509TrustManager> r1 = javax.net.ssl.X509TrustManager.class
            java.lang.Object r0 = okhttp3.internal._UtilJvmKt.readFieldOrNull(r3, r1, r0)
            javax.net.ssl.X509TrustManager r0 = (javax.net.ssl.X509TrustManager) r0
            if (r0 != 0) goto L26
            java.lang.String r0 = "trustManager"
            java.lang.Object r3 = okhttp3.internal._UtilJvmKt.readFieldOrNull(r3, r1, r0)
            javax.net.ssl.X509TrustManager r3 = (javax.net.ssl.X509TrustManager) r3
            return r3
        L26:
            return r0
    }
}
