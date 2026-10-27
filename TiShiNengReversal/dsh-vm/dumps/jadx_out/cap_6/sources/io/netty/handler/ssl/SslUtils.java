package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class SslUtils {
    static final java.lang.String[] DEFAULT_CIPHER_SUITES = null;
    static final java.lang.String[] DEFAULT_TLSV13_CIPHER_SUITES = null;
    static final java.lang.String INVALID_CIPHER = "SSL_NULL_WITH_NULL_NULL";
    static final int NOT_ENCRYPTED = -2;
    static final int NOT_ENOUGH_DATA = -1;
    static final java.lang.String PROTOCOL_SSL_V2 = "SSLv2";
    static final java.lang.String PROTOCOL_SSL_V2_HELLO = "SSLv2Hello";
    static final java.lang.String PROTOCOL_SSL_V3 = "SSLv3";
    static final java.lang.String PROTOCOL_TLS_V1 = "TLSv1";
    static final java.lang.String PROTOCOL_TLS_V1_1 = "TLSv1.1";
    static final java.lang.String PROTOCOL_TLS_V1_2 = "TLSv1.2";
    static final java.lang.String PROTOCOL_TLS_V1_3 = "TLSv1.3";
    static final int SSL_CONTENT_TYPE_ALERT = 21;
    static final int SSL_CONTENT_TYPE_APPLICATION_DATA = 23;
    static final int SSL_CONTENT_TYPE_CHANGE_CIPHER_SPEC = 20;
    static final int SSL_CONTENT_TYPE_EXTENSION_HEARTBEAT = 24;
    static final int SSL_CONTENT_TYPE_HANDSHAKE = 22;
    static final int SSL_RECORD_HEADER_LENGTH = 5;
    static final java.util.Set<java.lang.String> TLSV13_CIPHERS = null;
    static final java.lang.String[] TLSV13_CIPHER_SUITES = null;

    static {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.lang.String r1 = "TLS_AES_128_CCM_8_SHA256"
            java.lang.String r2 = "TLS_AES_128_CCM_SHA256"
            java.lang.String r3 = "TLS_AES_256_GCM_SHA384"
            java.lang.String r4 = "TLS_CHACHA20_POLY1305_SHA256"
            java.lang.String r5 = "TLS_AES_128_GCM_SHA256"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r5, r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            io.netty.handler.ssl.SslUtils.TLSV13_CIPHERS = r0
            java.lang.String[] r0 = new java.lang.String[]{r5, r3}
            io.netty.handler.ssl.SslUtils.TLSV13_CIPHER_SUITES = r0
            int r1 = io.netty.util.internal.PlatformDependent.javaVersion()
            r2 = 11
            if (r1 < r2) goto L2e
            io.netty.handler.ssl.SslUtils.DEFAULT_TLSV13_CIPHER_SUITES = r0
            goto L32
        L2e:
            java.lang.String[] r0 = io.netty.util.internal.EmptyArrays.EMPTY_STRINGS
            io.netty.handler.ssl.SslUtils.DEFAULT_TLSV13_CIPHER_SUITES = r0
        L32:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384"
            r0.add(r1)
            java.lang.String r1 = "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256"
            r0.add(r1)
            java.lang.String r1 = "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"
            r0.add(r1)
            java.lang.String r1 = "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"
            r0.add(r1)
            java.lang.String r1 = "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA"
            r0.add(r1)
            java.lang.String r1 = "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"
            r0.add(r1)
            java.lang.String r1 = "TLS_RSA_WITH_AES_128_GCM_SHA256"
            r0.add(r1)
            java.lang.String r1 = "TLS_RSA_WITH_AES_128_CBC_SHA"
            r0.add(r1)
            java.lang.String r1 = "TLS_RSA_WITH_AES_256_CBC_SHA"
            r0.add(r1)
            java.lang.String[] r1 = io.netty.handler.ssl.SslUtils.DEFAULT_TLSV13_CIPHER_SUITES
            java.util.Collections.addAll(r0, r1)
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            io.netty.handler.ssl.SslUtils.DEFAULT_CIPHER_SUITES = r0
            return
    }

    private SslUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static void addIfSupported(java.util.Set<java.lang.String> r4, java.util.List<java.lang.String> r5, java.lang.String... r6) {
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L12
            r2 = r6[r1]
            boolean r3 = r4.contains(r2)
            if (r3 == 0) goto Lf
            r5.add(r2)
        Lf:
            int r1 = r1 + 1
            goto L2
        L12:
            return
    }

    static int getEncryptedPacketLength(io.netty.buffer.ByteBuf r6, int r7) {
            short r0 = r6.getUnsignedByte(r7)
            r1 = 1
            r2 = 0
            switch(r0) {
                case 20: goto Lb;
                case 21: goto Lb;
                case 22: goto Lb;
                case 23: goto Lb;
                case 24: goto Lb;
                default: goto L9;
            }
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            r3 = 3
            if (r0 == 0) goto L26
            int r4 = r7 + 1
            short r4 = r6.getUnsignedByte(r4)
            if (r4 != r3) goto L24
            int r4 = r7 + 3
            int r4 = unsignedShortBE(r6, r4)
            r5 = 5
            int r4 = r4 + r5
            if (r4 > r5) goto L22
            goto L28
        L22:
            r2 = r0
            goto L28
        L24:
            r4 = 0
            goto L28
        L26:
            r2 = r0
            goto L24
        L28:
            if (r2 != 0) goto L59
            short r0 = r6.getUnsignedByte(r7)
            r0 = r0 & 128(0x80, float:1.8E-43)
            r2 = 2
            if (r0 == 0) goto L35
            r0 = 2
            goto L36
        L35:
            r0 = 3
        L36:
            int r4 = r7 + r0
            int r4 = r4 + r1
            short r1 = r6.getUnsignedByte(r4)
            if (r1 == r2) goto L44
            if (r1 != r3) goto L42
            goto L44
        L42:
            r6 = -2
            return r6
        L44:
            if (r0 != r2) goto L4e
            short r6 = shortBE(r6, r7)
            r6 = r6 & 32767(0x7fff, float:4.5916E-41)
            int r6 = r6 + r2
            goto L55
        L4e:
            short r6 = shortBE(r6, r7)
            r6 = r6 & 16383(0x3fff, float:2.2957E-41)
            int r6 = r6 + r3
        L55:
            if (r6 > r0) goto L58
            r6 = -1
        L58:
            return r6
        L59:
            return r4
    }

    private static int getEncryptedPacketLength(java.nio.ByteBuffer r7) {
            int r0 = r7.position()
            byte r1 = r7.get(r0)
            short r1 = unsignedByte(r1)
            r2 = 1
            r3 = 0
            switch(r1) {
                case 20: goto L13;
                case 21: goto L13;
                case 22: goto L13;
                case 23: goto L13;
                case 24: goto L13;
                default: goto L11;
            }
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            r4 = 3
            if (r1 == 0) goto L32
            int r5 = r0 + 1
            byte r5 = r7.get(r5)
            short r5 = unsignedByte(r5)
            if (r5 != r4) goto L30
            int r5 = r0 + 3
            int r5 = unsignedShortBE(r7, r5)
            r6 = 5
            int r5 = r5 + r6
            if (r5 > r6) goto L2e
            goto L34
        L2e:
            r3 = r1
            goto L34
        L30:
            r5 = 0
            goto L34
        L32:
            r3 = r1
            goto L30
        L34:
            if (r3 != 0) goto L6d
            byte r1 = r7.get(r0)
            short r1 = unsignedByte(r1)
            r1 = r1 & 128(0x80, float:1.8E-43)
            r3 = 2
            if (r1 == 0) goto L45
            r1 = 2
            goto L46
        L45:
            r1 = 3
        L46:
            int r5 = r0 + r1
            int r5 = r5 + r2
            byte r2 = r7.get(r5)
            short r2 = unsignedByte(r2)
            if (r2 == r3) goto L58
            if (r2 != r4) goto L56
            goto L58
        L56:
            r7 = -2
            return r7
        L58:
            if (r1 != r3) goto L62
            short r7 = shortBE(r7, r0)
            r7 = r7 & 32767(0x7fff, float:4.5916E-41)
            int r7 = r7 + r3
            goto L69
        L62:
            short r7 = shortBE(r7, r0)
            r7 = r7 & 16383(0x3fff, float:2.2957E-41)
            int r7 = r7 + r4
        L69:
            if (r7 > r1) goto L6c
            r7 = -1
        L6c:
            return r7
        L6d:
            return r5
    }

    static int getEncryptedPacketLength(java.nio.ByteBuffer[] r4, int r5) {
            r0 = r4[r5]
            int r1 = r0.remaining()
            r2 = 5
            if (r1 < r2) goto Le
            int r4 = getEncryptedPacketLength(r0)
            return r4
        Le:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r2)
        L12:
            int r1 = r5 + 1
            r5 = r4[r5]
            java.nio.ByteBuffer r5 = r5.duplicate()
            int r2 = r5.remaining()
            int r3 = r0.remaining()
            if (r2 <= r3) goto L30
            int r2 = r5.position()
            int r3 = r0.remaining()
            int r2 = r2 + r3
            r5.limit(r2)
        L30:
            r0.put(r5)
            boolean r5 = r0.hasRemaining()
            if (r5 != 0) goto L41
            r0.flip()
            int r4 = getEncryptedPacketLength(r0)
            return r4
        L41:
            r5 = r1
            goto L12
    }

    static void handleHandshakeFailure(io.netty.channel.ChannelHandlerContext r0, java.lang.Throwable r1, boolean r2) {
            r0.flush()
            if (r2 == 0) goto Ld
            io.netty.handler.ssl.SslHandshakeCompletionEvent r2 = new io.netty.handler.ssl.SslHandshakeCompletionEvent
            r2.<init>(r1)
            r0.fireUserEventTriggered(r2)
        Ld:
            r0.close()
            return
    }

    static boolean isTLSv13Cipher(java.lang.String r1) {
            java.util.Set<java.lang.String> r0 = io.netty.handler.ssl.SslUtils.TLSV13_CIPHERS
            boolean r1 = r0.contains(r1)
            return r1
    }

    static boolean isValidHostNameForSNI(java.lang.String r1) {
            if (r1 == 0) goto L20
            r0 = 46
            int r0 = r1.indexOf(r0)
            if (r0 <= 0) goto L20
            java.lang.String r0 = "."
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L20
            boolean r0 = io.netty.util.NetUtil.isValidIpV4Address(r1)
            if (r0 != 0) goto L20
            boolean r1 = io.netty.util.NetUtil.isValidIpV6Address(r1)
            if (r1 != 0) goto L20
            r1 = 1
            return r1
        L20:
            r1 = 0
            return r1
    }

    private static short shortBE(io.netty.buffer.ByteBuf r2, int r3) {
            java.nio.ByteOrder r0 = r2.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto Ld
            short r2 = r2.getShort(r3)
            return r2
        Ld:
            short r2 = r2.getShortLE(r3)
            return r2
    }

    private static short shortBE(java.nio.ByteBuffer r2, int r3) {
            java.nio.ByteOrder r0 = r2.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto Ld
            short r2 = r2.getShort(r3)
            return r2
        Ld:
            short r2 = r2.getShort(r3)
            short r2 = io.netty.buffer.ByteBufUtil.swapShort(r2)
            return r2
    }

    static io.netty.buffer.ByteBuf toBase64(io.netty.buffer.ByteBufAllocator r6, io.netty.buffer.ByteBuf r7) {
            int r1 = r7.readerIndex()
            int r2 = r7.readableBytes()
            r3 = 1
            io.netty.handler.codec.base64.Base64Dialect r4 = io.netty.handler.codec.base64.Base64Dialect.STANDARD
            r5 = r6
            r0 = r7
            io.netty.buffer.ByteBuf r6 = io.netty.handler.codec.base64.Base64.encode(r0, r1, r2, r3, r4, r5)
            int r7 = r0.writerIndex()
            r0.readerIndex(r7)
            return r6
    }

    static javax.net.ssl.SSLHandshakeException toSSLHandshakeException(java.lang.Throwable r2) {
            boolean r0 = r2 instanceof javax.net.ssl.SSLHandshakeException
            if (r0 == 0) goto L7
            javax.net.ssl.SSLHandshakeException r2 = (javax.net.ssl.SSLHandshakeException) r2
            return r2
        L7:
            javax.net.ssl.SSLHandshakeException r0 = new javax.net.ssl.SSLHandshakeException
            java.lang.String r1 = r2.getMessage()
            r0.<init>(r1)
            java.lang.Throwable r2 = r0.initCause(r2)
            javax.net.ssl.SSLHandshakeException r2 = (javax.net.ssl.SSLHandshakeException) r2
            return r2
    }

    private static short unsignedByte(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            return r0
    }

    private static int unsignedShortBE(io.netty.buffer.ByteBuf r2, int r3) {
            java.nio.ByteOrder r0 = r2.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto Ld
            int r2 = r2.getUnsignedShort(r3)
            return r2
        Ld:
            int r2 = r2.getUnsignedShortLE(r3)
            return r2
    }

    private static int unsignedShortBE(java.nio.ByteBuffer r0, int r1) {
            short r0 = shortBE(r0, r1)
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            return r0
    }

    static void useFallbackCiphersIfDefaultIsEmpty(java.util.List<java.lang.String> r2, java.lang.Iterable<java.lang.String> r3) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L2b
            java.util.Iterator r3 = r3.iterator()
        La:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "SSL_"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto La
            java.lang.String r1 = "_RC4_"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L27
            goto La
        L27:
            r2.add(r0)
            goto La
        L2b:
            return
    }

    static void useFallbackCiphersIfDefaultIsEmpty(java.util.List<java.lang.String> r0, java.lang.String... r1) {
            java.util.List r1 = java.util.Arrays.asList(r1)
            useFallbackCiphersIfDefaultIsEmpty(r0, r1)
            return
    }

    static void zeroout(io.netty.buffer.ByteBuf r2) {
            boolean r0 = r2.isReadOnly()
            if (r0 != 0) goto Le
            r0 = 0
            int r1 = r2.capacity()
            r2.setZero(r0, r1)
        Le:
            return
    }

    static void zerooutAndRelease(io.netty.buffer.ByteBuf r0) {
            zeroout(r0)
            r0.release()
            return
    }
}
