package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class RetryTlsHandshakeKt {
    public RetryTlsHandshakeKt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final boolean retryTlsHandshake(@org.jetbrains.annotations.NotNull java.io.IOException r2) {
            java.lang.String r0 = "e"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2 instanceof java.net.ProtocolException
            r1 = 0
            if (r0 == 0) goto Lb
            return r1
        Lb:
            boolean r0 = r2 instanceof java.io.InterruptedIOException
            if (r0 == 0) goto L10
            return r1
        L10:
            boolean r0 = r2 instanceof javax.net.ssl.SSLHandshakeException
            if (r0 == 0) goto L1d
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof java.security.cert.CertificateException
            if (r0 == 0) goto L1d
            return r1
        L1d:
            boolean r0 = r2 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r0 == 0) goto L22
            return r1
        L22:
            boolean r2 = r2 instanceof javax.net.ssl.SSLException
            if (r2 == 0) goto L28
            r2 = 1
            return r2
        L28:
            return r1
    }
}
