package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class PemReader {
    private static final java.util.regex.Pattern CERT_PATTERN = null;
    private static final java.util.regex.Pattern KEY_PATTERN = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;

    static {
            java.lang.Class<io.netty.handler.ssl.PemReader> r0 = io.netty.handler.ssl.PemReader.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.ssl.PemReader.logger = r0
            java.lang.String r0 = "-+BEGIN\\s+.*CERTIFICATE[^-]*-+(?:\\s|\\r|\\n)+([a-z0-9+/=\\r\\n]+)-+END\\s+.*CERTIFICATE[^-]*-+"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            io.netty.handler.ssl.PemReader.CERT_PATTERN = r0
            java.lang.String r0 = "-+BEGIN\\s+.*PRIVATE\\s+KEY[^-]*-+(?:\\s|\\r|\\n)+([a-z0-9+/=\\r\\n]+)-+END\\s+.*PRIVATE\\s+KEY[^-]*-+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            io.netty.handler.ssl.PemReader.KEY_PATTERN = r0
            return
    }

    private PemReader() {
            r0 = this;
            r0.<init>()
            return
    }

    static io.netty.buffer.ByteBuf[] readCertificates(java.io.File r3) throws java.security.cert.CertificateException {
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L12
            r0.<init>(r3)     // Catch: java.io.FileNotFoundException -> L12
            io.netty.buffer.ByteBuf[] r1 = readCertificates(r0)     // Catch: java.lang.Throwable -> Ld
            safeClose(r0)     // Catch: java.io.FileNotFoundException -> L12
            return r1
        Ld:
            r1 = move-exception
            safeClose(r0)     // Catch: java.io.FileNotFoundException -> L12
            throw r1     // Catch: java.io.FileNotFoundException -> L12
        L12:
            java.security.cert.CertificateException r0 = new java.security.cert.CertificateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "could not find certificate file: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    static io.netty.buffer.ByteBuf[] readCertificates(java.io.InputStream r4) throws java.security.cert.CertificateException {
            java.lang.String r4 = readContent(r4)     // Catch: java.io.IOException -> L48
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.regex.Pattern r1 = io.netty.handler.ssl.PemReader.CERT_PATTERN
            java.util.regex.Matcher r4 = r1.matcher(r4)
            r1 = 0
            r2 = 0
        L11:
            boolean r2 = r4.find(r2)
            if (r2 != 0) goto L2e
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L26
            io.netty.buffer.ByteBuf[] r4 = new io.netty.buffer.ByteBuf[r1]
            java.lang.Object[] r4 = r0.toArray(r4)
            io.netty.buffer.ByteBuf[] r4 = (io.netty.buffer.ByteBuf[]) r4
            return r4
        L26:
            java.security.cert.CertificateException r4 = new java.security.cert.CertificateException
            java.lang.String r0 = "found no certificates in input stream"
            r4.<init>(r0)
            throw r4
        L2e:
            r2 = 1
            java.lang.String r2 = r4.group(r2)
            java.nio.charset.Charset r3 = io.netty.util.CharsetUtil.US_ASCII
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.copiedBuffer(r2, r3)
            io.netty.buffer.ByteBuf r3 = io.netty.handler.codec.base64.Base64.decode(r2)
            r2.release()
            r0.add(r3)
            int r2 = r4.end()
            goto L11
        L48:
            r4 = move-exception
            java.security.cert.CertificateException r0 = new java.security.cert.CertificateException
            java.lang.String r1 = "failed to read certificate input stream"
            r0.<init>(r1, r4)
            throw r0
    }

    private static java.lang.String readContent(java.io.InputStream r4) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L1d
        L9:
            int r2 = r4.read(r1)     // Catch: java.lang.Throwable -> L1d
            if (r2 >= 0) goto L1f
            java.nio.charset.Charset r4 = io.netty.util.CharsetUtil.US_ASCII     // Catch: java.lang.Throwable -> L1d
            java.lang.String r4 = r4.name()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r4 = r0.toString(r4)     // Catch: java.lang.Throwable -> L1d
            safeClose(r0)
            return r4
        L1d:
            r4 = move-exception
            goto L24
        L1f:
            r3 = 0
            r0.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L1d
            goto L9
        L24:
            safeClose(r0)
            throw r4
    }

    static io.netty.buffer.ByteBuf readPrivateKey(java.io.File r3) throws java.security.KeyException {
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L12
            r0.<init>(r3)     // Catch: java.io.FileNotFoundException -> L12
            io.netty.buffer.ByteBuf r1 = readPrivateKey(r0)     // Catch: java.lang.Throwable -> Ld
            safeClose(r0)     // Catch: java.io.FileNotFoundException -> L12
            return r1
        Ld:
            r1 = move-exception
            safeClose(r0)     // Catch: java.io.FileNotFoundException -> L12
            throw r1     // Catch: java.io.FileNotFoundException -> L12
        L12:
            java.security.KeyException r0 = new java.security.KeyException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "could not find key file: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    static io.netty.buffer.ByteBuf readPrivateKey(java.io.InputStream r2) throws java.security.KeyException {
            java.lang.String r2 = readContent(r2)     // Catch: java.io.IOException -> L2b
            java.util.regex.Pattern r0 = io.netty.handler.ssl.PemReader.KEY_PATTERN
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r0 = r2.find()
            if (r0 == 0) goto L23
            r0 = 1
            java.lang.String r2 = r2.group(r0)
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.US_ASCII
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.copiedBuffer(r2, r0)
            io.netty.buffer.ByteBuf r0 = io.netty.handler.codec.base64.Base64.decode(r2)
            r2.release()
            return r0
        L23:
            java.security.KeyException r2 = new java.security.KeyException
            java.lang.String r0 = "could not find a PKCS #8 private key in input stream (see https://netty.io/wiki/sslcontextbuilder-and-private-key.html for more information)"
            r2.<init>(r0)
            throw r2
        L2b:
            r2 = move-exception
            java.security.KeyException r0 = new java.security.KeyException
            java.lang.String r1 = "failed to read key input stream"
            r0.<init>(r1, r2)
            throw r0
    }

    private static void safeClose(java.io.InputStream r2) {
            r2.close()     // Catch: java.io.IOException -> L4
            return
        L4:
            r2 = move-exception
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.PemReader.logger
            java.lang.String r1 = "Failed to close a stream."
            r0.warn(r1, r2)
            return
    }

    private static void safeClose(java.io.OutputStream r2) {
            r2.close()     // Catch: java.io.IOException -> L4
            return
        L4:
            r2 = move-exception
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.PemReader.logger
            java.lang.String r1 = "Failed to close a stream."
            r0.warn(r1, r2)
            return
    }
}
