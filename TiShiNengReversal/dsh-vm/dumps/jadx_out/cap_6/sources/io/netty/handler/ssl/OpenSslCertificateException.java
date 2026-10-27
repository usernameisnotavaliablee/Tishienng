package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class OpenSslCertificateException extends java.security.cert.CertificateException {
    private static final long serialVersionUID = 5542675253797129798L;
    private final int errorCode;

    public OpenSslCertificateException(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public OpenSslCertificateException(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            int r1 = checkErrorCode(r2)
            r0.errorCode = r1
            return
    }

    public OpenSslCertificateException(java.lang.String r1, java.lang.Throwable r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            int r1 = checkErrorCode(r3)
            r0.errorCode = r1
            return
    }

    public OpenSslCertificateException(java.lang.Throwable r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3)
            return
    }

    private static int checkErrorCode(int r3) {
            boolean r0 = io.netty.handler.ssl.OpenSsl.isAvailable()
            if (r0 == 0) goto L29
            boolean r0 = io.netty.internal.tcnative.CertificateVerifier.isValid(r3)
            if (r0 == 0) goto Ld
            goto L29
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "errorCode '"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "' invalid, see https://www.openssl.org/docs/man1.0.2/apps/verify.html."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L29:
            return r3
    }

    public int errorCode() {
            r1 = this;
            int r0 = r1.errorCode
            return r0
    }
}
