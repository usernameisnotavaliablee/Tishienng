package okhttp3.internal.platform.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@okhttp3.internal.SuppressSignatureCheck
@android.annotation.SuppressLint({"NewApi"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAndroid10SocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Android10SocketAdapter.kt\nokhttp3/internal/platform/android/Android10SocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,83:1\n37#2,2:84\n*S KotlinDebug\n*F\n+ 1 Android10SocketAdapter.kt\nokhttp3/internal/platform/android/Android10SocketAdapter\n*L\n67#1:84,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Android10SocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.android.Android10SocketAdapter.Companion Companion = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @okhttp3.internal.SuppressSignatureCheck
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
        public final okhttp3.internal.platform.android.SocketAdapter buildIfSupported() {
                r1 = this;
                boolean r0 = r1.isSupported()
                if (r0 == 0) goto Lc
                okhttp3.internal.platform.android.Android10SocketAdapter r0 = new okhttp3.internal.platform.android.Android10SocketAdapter
                r0.<init>()
                return r0
            Lc:
                r0 = 0
                return r0
        }

        public final boolean isSupported() {
                r2 = this;
                okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
                boolean r0 = r0.isAndroid()
                if (r0 == 0) goto L10
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L10
                r0 = 1
                return r0
            L10:
                r0 = 0
                return r0
        }
    }

    static {
            okhttp3.internal.platform.android.Android10SocketAdapter$Companion r0 = new okhttp3.internal.platform.android.Android10SocketAdapter$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.android.Android10SocketAdapter.Companion = r0
            return
    }

    public Android10SocketAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    @android.annotation.SuppressLint({"NewApi"})
    public void configureTlsExtensions(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.NotNull java.util.List<? extends okhttp3.Protocol> r4) {
            r1 = this;
            java.lang.String r3 = "sslSocket"
            kotlin.jvm.internal.g0.p(r2, r3)
            java.lang.String r3 = "protocols"
            kotlin.jvm.internal.g0.p(r4, r3)
            r3 = 1
            com.bytedance.sdk.component.cw.xt.j.ae.a.a(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L2a
            javax.net.ssl.SSLParameters r3 = r2.getSSLParameters()     // Catch: java.lang.IllegalArgumentException -> L2a
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.IllegalArgumentException -> L2a
            java.util.List r4 = r0.alpnProtocolNames(r4)     // Catch: java.lang.IllegalArgumentException -> L2a
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.IllegalArgumentException -> L2a
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.IllegalArgumentException -> L2a
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch: java.lang.IllegalArgumentException -> L2a
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch: java.lang.IllegalArgumentException -> L2a
            x4.h.a(r3, r4)     // Catch: java.lang.IllegalArgumentException -> L2a
            r2.setSSLParameters(r3)     // Catch: java.lang.IllegalArgumentException -> L2a
            return
        L2a:
            r2 = move-exception
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Android internal error"
            r3.<init>(r4, r2)
            throw r3
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    @android.annotation.SuppressLint({"NewApi"})
    @org.jetbrains.annotations.Nullable
    public java.lang.String getSelectedProtocol(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r3) {
            r2 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            java.lang.String r3 = x4.i.a(r3)     // Catch: java.lang.UnsupportedOperationException -> L16
            if (r3 == 0) goto L16
            java.lang.String r1 = ""
            boolean r1 = kotlin.jvm.internal.g0.g(r3, r1)     // Catch: java.lang.UnsupportedOperationException -> L16
            if (r1 == 0) goto L15
            goto L16
        L15:
            return r3
        L16:
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
            r1 = this;
            okhttp3.internal.platform.android.Android10SocketAdapter$Companion r0 = okhttp3.internal.platform.android.Android10SocketAdapter.Companion
            boolean r0 = r0.isSupported()
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r2 = okhttp3.internal.platform.android.a.a(r2)
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
