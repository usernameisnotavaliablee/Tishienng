package io.netty.handler.ssl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class FingerprintTrustManagerFactory extends io.netty.handler.ssl.util.SimpleTrustManagerFactory {
    private static final java.util.regex.Pattern FINGERPRINT_PATTERN = null;
    private static final java.util.regex.Pattern FINGERPRINT_STRIP_PATTERN = null;
    private static final int SHA1_BYTE_LEN = 20;
    private static final int SHA1_HEX_LEN = 40;
    private static final io.netty.util.concurrent.FastThreadLocal<java.security.MessageDigest> tlmd = null;
    private final byte[][] fingerprints;
    private final javax.net.ssl.TrustManager tm;



    static {
            java.lang.String r0 = "^[0-9a-fA-F:]+$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.netty.handler.ssl.util.FingerprintTrustManagerFactory.FINGERPRINT_PATTERN = r0
            java.lang.String r0 = ":"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.netty.handler.ssl.util.FingerprintTrustManagerFactory.FINGERPRINT_STRIP_PATTERN = r0
            io.netty.handler.ssl.util.FingerprintTrustManagerFactory$1 r0 = new io.netty.handler.ssl.util.FingerprintTrustManagerFactory$1
            r0.<init>()
            io.netty.handler.ssl.util.FingerprintTrustManagerFactory.tlmd = r0
            return
    }

    public FingerprintTrustManagerFactory(java.lang.Iterable<java.lang.String> r1) {
            r0 = this;
            byte[][] r1 = toFingerprintArray(r1)
            r0.<init>(r1)
            return
    }

    public FingerprintTrustManagerFactory(java.lang.String... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            byte[][] r1 = toFingerprintArray(r1)
            r0.<init>(r1)
            return
    }

    public FingerprintTrustManagerFactory(byte[]... r8) {
            r7 = this;
            r7.<init>()
            io.netty.handler.ssl.util.FingerprintTrustManagerFactory$2 r0 = new io.netty.handler.ssl.util.FingerprintTrustManagerFactory$2
            r0.<init>(r7)
            r7.tm = r0
            if (r8 == 0) goto L5a
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r8.length
            r0.<init>(r1)
            int r1 = r8.length
            r2 = 0
            r3 = 0
        L15:
            if (r3 >= r1) goto L4f
            r4 = r8[r3]
            if (r4 != 0) goto L1c
            goto L4f
        L1c:
            int r5 = r4.length
            r6 = 20
            if (r5 != r6) goto L2b
            java.lang.Object r4 = r4.clone()
            r0.add(r4)
            int r3 = r3 + 1
            goto L15
        L2b:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "malformed fingerprint: "
            r0.append(r1)
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.wrappedBuffer(r4)
            java.lang.String r1 = io.netty.buffer.ByteBufUtil.hexDump(r1)
            r0.append(r1)
            java.lang.String r1 = " (expected: SHA1)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L4f:
            byte[][] r8 = new byte[r2][]
            java.lang.Object[] r8 = r0.toArray(r8)
            byte[][] r8 = (byte[][]) r8
            r7.fingerprints = r8
            return
        L5a:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r0 = "fingerprints"
            r8.<init>(r0)
            throw r8
    }

    static /* synthetic */ byte[][] access$000(io.netty.handler.ssl.util.FingerprintTrustManagerFactory r0) {
            byte[][] r0 = r0.fingerprints
            return r0
    }

    static /* synthetic */ io.netty.util.concurrent.FastThreadLocal access$100() {
            io.netty.util.concurrent.FastThreadLocal<java.security.MessageDigest> r0 = io.netty.handler.ssl.util.FingerprintTrustManagerFactory.tlmd
            return r0
    }

    private static byte[][] toFingerprintArray(java.lang.Iterable<java.lang.String> r5) {
            if (r5 == 0) goto L7d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        Lb:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L73
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L1a
            goto L73
        L1a:
            java.util.regex.Pattern r2 = io.netty.handler.ssl.util.FingerprintTrustManagerFactory.FINGERPRINT_PATTERN
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r2 = r2.matches()
            java.lang.String r3 = "malformed fingerprint: "
            if (r2 == 0) goto L5e
            java.util.regex.Pattern r2 = io.netty.handler.ssl.util.FingerprintTrustManagerFactory.FINGERPRINT_STRIP_PATTERN
            java.util.regex.Matcher r1 = r2.matcher(r1)
            java.lang.String r2 = ""
            java.lang.String r1 = r1.replaceAll(r2)
            int r2 = r1.length()
            r4 = 40
            if (r2 != r4) goto L44
            byte[] r1 = io.netty.util.internal.StringUtil.decodeHexDump(r1)
            r0.add(r1)
            goto Lb
        L44:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = " (expected: SHA1)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L5e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L73:
            r5 = 0
            byte[][] r5 = new byte[r5][]
            java.lang.Object[] r5 = r0.toArray(r5)
            byte[][] r5 = (byte[][]) r5
            return r5
        L7d:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "fingerprints"
            r5.<init>(r0)
            throw r5
    }

    @Override // io.netty.handler.ssl.util.SimpleTrustManagerFactory
    protected javax.net.ssl.TrustManager[] engineGetTrustManagers() {
            r3 = this;
            javax.net.ssl.TrustManager r0 = r3.tm
            r1 = 1
            javax.net.ssl.TrustManager[] r1 = new javax.net.ssl.TrustManager[r1]
            r2 = 0
            r1[r2] = r0
            return r1
    }

    @Override // io.netty.handler.ssl.util.SimpleTrustManagerFactory
    protected void engineInit(java.security.KeyStore r1) throws java.lang.Exception {
            r0 = this;
            return
    }

    @Override // io.netty.handler.ssl.util.SimpleTrustManagerFactory
    protected void engineInit(javax.net.ssl.ManagerFactoryParameters r1) throws java.lang.Exception {
            r0 = this;
            return
    }
}
