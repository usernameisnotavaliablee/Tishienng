package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface OpenSslPrivateKeyMethod {
    public static final int SSL_SIGN_ECDSA_SECP256R1_SHA256 = 0;
    public static final int SSL_SIGN_ECDSA_SECP384R1_SHA384 = 0;
    public static final int SSL_SIGN_ECDSA_SECP521R1_SHA512 = 0;
    public static final int SSL_SIGN_ECDSA_SHA1 = 0;
    public static final int SSL_SIGN_ED25519 = 0;
    public static final int SSL_SIGN_RSA_PKCS1_MD5_SHA1 = 0;
    public static final int SSL_SIGN_RSA_PKCS1_SHA1 = 0;
    public static final int SSL_SIGN_RSA_PKCS1_SHA256 = 0;
    public static final int SSL_SIGN_RSA_PKCS1_SHA384 = 0;
    public static final int SSL_SIGN_RSA_PKCS1_SHA512 = 0;
    public static final int SSL_SIGN_RSA_PSS_RSAE_SHA256 = 0;
    public static final int SSL_SIGN_RSA_PSS_RSAE_SHA384 = 0;
    public static final int SSL_SIGN_RSA_PSS_RSAE_SHA512 = 0;

    static {
            int r0 = io.netty.internal.tcnative.SSLPrivateKeyMethod.SSL_SIGN_RSA_PKCS1_SHA1
            io.netty.handler.ssl.OpenSslPrivateKeyMethod.SSL_SIGN_RSA_PKCS1_SHA1 = r0
            int r0 = io.netty.internal.tcnative.SSLPrivateKeyMethod.SSL_SIGN_RSA_PKCS1_SHA256
            io.netty.handler.ssl.OpenSslPrivateKeyMethod.SSL_SIGN_RSA_PKCS1_SHA256 = r0
            int r0 = io.netty.internal.tcnative.SSLPrivateKeyMethod.SSL_SIGN_RSA_PKCS1_SHA384
            io.netty.handler.ssl.OpenSslPrivateKeyMethod.SSL_SIGN_RSA_PKCS1_SHA384 = r0
            int r0 = io.netty.internal.tcnative.SSLPrivateKeyMethod.SSL_SIGN_RSA_PKCS1_SHA512
            io.netty.handler.ssl.OpenSslPrivateKeyMethod.SSL_SIGN_RSA_PKCS1_SHA512 = r0
            int r0 = io.netty.internal.tcnative.SSLPrivateKeyMethod.SSL_SIGN_ECDSA_SHA1
            io.netty.handler.ssl.OpenSslPrivateKeyMethod.SSL_SIGN_ECDSA_SHA1 = r0
            int r0 = io.netty.internal.tcnative.SSLPrivateKeyMethod.SSL_SIGN_ECDSA_SECP256R1_SHA256
            io.netty.handler.ssl.OpenSslPrivateKeyMethod.SSL_SIGN_ECDSA_SECP256R1_SHA256 = r0
            int r0 = io.netty.internal.tcnative.SSLPrivateKeyMethod.SSL_SIGN_ECDSA_SECP384R1_SHA384
            io.netty.handler.ssl.OpenSslPrivateKeyMethod.SSL_SIGN_ECDSA_SECP384R1_SHA384 = r0
            int r0 = io.netty.internal.tcnative.SSLPrivateKeyMethod.SSL_SIGN_ECDSA_SECP521R1_SHA512
            io.netty.handler.ssl.OpenSslPrivateKeyMethod.SSL_SIGN_ECDSA_SECP521R1_SHA512 = r0
            int r0 = io.netty.internal.tcnative.SSLPrivateKeyMethod.SSL_SIGN_RSA_PSS_RSAE_SHA256
            io.netty.handler.ssl.OpenSslPrivateKeyMethod.SSL_SIGN_RSA_PSS_RSAE_SHA256 = r0
            int r0 = io.netty.internal.tcnative.SSLPrivateKeyMethod.SSL_SIGN_RSA_PSS_RSAE_SHA384
            io.netty.handler.ssl.OpenSslPrivateKeyMethod.SSL_SIGN_RSA_PSS_RSAE_SHA384 = r0
            int r0 = io.netty.internal.tcnative.SSLPrivateKeyMethod.SSL_SIGN_RSA_PSS_RSAE_SHA512
            io.netty.handler.ssl.OpenSslPrivateKeyMethod.SSL_SIGN_RSA_PSS_RSAE_SHA512 = r0
            int r0 = io.netty.internal.tcnative.SSLPrivateKeyMethod.SSL_SIGN_ED25519
            io.netty.handler.ssl.OpenSslPrivateKeyMethod.SSL_SIGN_ED25519 = r0
            int r0 = io.netty.internal.tcnative.SSLPrivateKeyMethod.SSL_SIGN_RSA_PKCS1_MD5_SHA1
            io.netty.handler.ssl.OpenSslPrivateKeyMethod.SSL_SIGN_RSA_PKCS1_MD5_SHA1 = r0
            return
    }

    byte[] decrypt(javax.net.ssl.SSLEngine r1, byte[] r2) throws java.lang.Exception;

    byte[] sign(javax.net.ssl.SSLEngine r1, int r2, byte[] r3) throws java.lang.Exception;
}
