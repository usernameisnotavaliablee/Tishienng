package okhttp3.internal.platform.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface SocketAdapter {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class DefaultImpls {
        public DefaultImpls() {
                r1 = this;
                r1.<init>()
                return
        }

        @java.lang.Deprecated
        public static boolean matchesSocketFactory(@org.jetbrains.annotations.NotNull okhttp3.internal.platform.android.SocketAdapter r1, @org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocketFactory r2) {
                java.lang.String r0 = "sslSocketFactory"
                kotlin.jvm.internal.g0.p(r2, r0)
                boolean r1 = okhttp3.internal.platform.android.b.c(r1, r2)
                return r1
        }

        @java.lang.Deprecated
        @org.jetbrains.annotations.Nullable
        public static javax.net.ssl.X509TrustManager trustManager(@org.jetbrains.annotations.NotNull okhttp3.internal.platform.android.SocketAdapter r1, @org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocketFactory r2) {
                java.lang.String r0 = "sslSocketFactory"
                kotlin.jvm.internal.g0.p(r2, r0)
                javax.net.ssl.X509TrustManager r1 = okhttp3.internal.platform.android.b.d(r1, r2)
                return r1
        }
    }

    void configureTlsExtensions(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r1, @org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.List<? extends okhttp3.Protocol> r3);

    @org.jetbrains.annotations.Nullable
    java.lang.String getSelectedProtocol(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r1);

    boolean isSupported();

    boolean matchesSocket(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r1);

    boolean matchesSocketFactory(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocketFactory r1);

    @org.jetbrains.annotations.Nullable
    javax.net.ssl.X509TrustManager trustManager(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocketFactory r1);
}
