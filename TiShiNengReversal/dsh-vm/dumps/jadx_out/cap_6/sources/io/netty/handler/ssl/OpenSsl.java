package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class OpenSsl {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final java.util.Set<java.lang.String> AVAILABLE_CIPHER_SUITES = null;
    private static final java.util.Set<java.lang.String> AVAILABLE_JAVA_CIPHER_SUITES = null;
    private static final java.util.Set<java.lang.String> AVAILABLE_OPENSSL_CIPHER_SUITES = null;
    private static final java.lang.String CERT = "-----BEGIN CERTIFICATE-----\nMIICrjCCAZagAwIBAgIIdSvQPv1QAZQwDQYJKoZIhvcNAQELBQAwFjEUMBIGA1UEAxMLZXhhbXBs\nZS5jb20wIBcNMTgwNDA2MjIwNjU5WhgPOTk5OTEyMzEyMzU5NTlaMBYxFDASBgNVBAMTC2V4YW1w\nbGUuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAggbWsmDQ6zNzRZ5AW8E3eoGl\nqWvOBDb5Fs1oBRrVQHuYmVAoaqwDzXYJ0LOwa293AgWEQ1jpcbZ2hpoYQzqEZBTLnFhMrhRFlH6K\nbJND8Y33kZ/iSVBBDuGbdSbJShlM+4WwQ9IAso4MZ4vW3S1iv5fGGpLgbtXRmBf/RU8omN0Gijlv\nWlLWHWijLN8xQtySFuBQ7ssW8RcKAary3pUm6UUQB+Co6lnfti0Tzag8PgjhAJq2Z3wbsGRnP2YS\nvYoaK6qzmHXRYlp/PxrjBAZAmkLJs4YTm/XFF+fkeYx4i9zqHbyone5yerRibsHaXZWLnUL+rFoe\nMdKvr0VS3sGmhQIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQADQi441pKmXf9FvUV5EHU4v8nJT9Iq\nyqwsKwXnr7AsUlDGHBD7jGrjAXnG5rGxuNKBQ35wRxJATKrUtyaquFUL6H8O6aGQehiFTk6zmPbe\n12Gu44vqqTgIUxnv3JQJiox8S2hMxsSddpeCmSdvmalvD6WG4NthH6B9ZaBEiep1+0s0RUaBYn73\nI7CCUaAtbjfR6pcJjrFk5ei7uwdQZFSJtkP2z8r7zfeANJddAKFlkaMWn7u+OIVuB4XPooWicObk\nNAHFtP65bocUYnDpTVdiyvn8DdqyZ/EO8n1bBKBzuSLplk2msW4pdgaFgY7Vw/0wzcFXfUXmL1uy\nG8sQD/wx\n-----END CERTIFICATE-----";
    static final java.util.List<java.lang.String> DEFAULT_CIPHERS = null;
    private static final boolean IS_BORINGSSL = false;
    private static final java.lang.String KEY = "-----BEGIN PRIVATE KEY-----\nMIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCCBtayYNDrM3NFnkBbwTd6gaWp\na84ENvkWzWgFGtVAe5iZUChqrAPNdgnQs7Brb3cCBYRDWOlxtnaGmhhDOoRkFMucWEyuFEWUfops\nk0PxjfeRn+JJUEEO4Zt1JslKGUz7hbBD0gCyjgxni9bdLWK/l8YakuBu1dGYF/9FTyiY3QaKOW9a\nUtYdaKMs3zFC3JIW4FDuyxbxFwoBqvLelSbpRRAH4KjqWd+2LRPNqDw+COEAmrZnfBuwZGc/ZhK9\nihorqrOYddFiWn8/GuMEBkCaQsmzhhOb9cUX5+R5jHiL3OodvKid7nJ6tGJuwdpdlYudQv6sWh4x\n0q+vRVLewaaFAgMBAAECggEAP8tPJvFtTxhNJAkCloHz0D0vpDHqQBMgntlkgayqmBqLwhyb18pR\ni0qwgh7HHc7wWqOOQuSqlEnrWRrdcI6TSe8R/sErzfTQNoznKWIPYcI/hskk4sdnQ//Yn9/Jvnsv\nU/BBjOTJxtD+sQbhAl80JcA3R+5sArURQkfzzHOL/YMqzAsn5hTzp7HZCxUqBk3KaHRxV7NefeOE\nxlZuWSmxYWfbFIs4kx19/1t7h8CHQWezw+G60G2VBtSBBxDnhBWvqG6R/wpzJ3nEhPLLY9T+XIHe\nipzdMOOOUZorfIg7M+pyYPji+ZIZxIpY5OjrOzXHciAjRtr5Y7l99K1CG1LguQKBgQDrQfIMxxtZ\nvxU/1cRmUV9l7pt5bjV5R6byXq178LxPKVYNjdZ840Q0/OpZEVqaT1xKVi35ohP1QfNjxPLlHD+K\niDAR9z6zkwjIrbwPCnb5kuXy4lpwPcmmmkva25fI7qlpHtbcuQdoBdCfr/KkKaUCMPyY89LCXgEw\n5KTDj64UywKBgQCNfbO+eZLGzhiHhtNJurresCsIGWlInv322gL8CSfBMYl6eNfUTZvUDdFhPISL\nUljKWzXDrjw0ujFSPR0XhUGtiq89H+HUTuPPYv25gVXO+HTgBFZEPl4PpA+BUsSVZy0NddneyqLk\n42Wey9omY9Q8WsdNQS5cbUvy0uG6WFoX7wKBgQDZ1jpW8pa0x2bZsQsm4vo+3G5CRnZlUp+XlWt2\ndDcp5dC0xD1zbs1dc0NcLeGDOTDv9FSl7hok42iHXXq8AygjEm/QcuwwQ1nC2HxmQP5holAiUs4D\nWHM8PWs3wFYPzE459EBoKTxeaeP/uWAn+he8q7d5uWvSZlEcANs/6e77eQKBgD21Ar0hfFfj7mK8\n9E0FeRZBsqK3omkfnhcYgZC11Xa2SgT1yvs2Va2n0RcdM5kncr3eBZav2GYOhhAdwyBM55XuE/sO\neokDVutNeuZ6d5fqV96TRaRBpvgfTvvRwxZ9hvKF4Vz+9wfn/JvCwANaKmegF6ejs7pvmF3whq2k\ndrZVAoGAX5YxQ5XMTD0QbMAl7/6qp6S58xNoVdfCkmkj1ZLKaHKIjS/benkKGlySVQVPexPfnkZx\np/Vv9yyphBoudiTBS9Uog66ueLYZqpgxlM/6OhYg86Gm3U2ycvMxYjBM1NFiyze21AqAhI+HX+Ot\nmraV2/guSgDgZAhukRZzeQ2RucI=\n-----END PRIVATE KEY-----";
    static final java.util.Set<java.lang.String> SUPPORTED_PROTOCOLS_SET = null;
    private static final boolean SUPPORTS_KEYMANAGER_FACTORY = false;
    private static final boolean SUPPORTS_OCSP = false;
    private static final boolean TLSV13_SUPPORTED = false;
    private static final java.lang.Throwable UNAVAILABILITY_CAUSE = null;
    private static final boolean USE_KEYMANAGER_FACTORY = false;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;

    static {
            java.lang.String r1 = "io.netty.handler.ssl.openssl.useKeyManagerFactory"
            java.lang.Class<io.netty.handler.ssl.OpenSsl> r0 = io.netty.handler.ssl.OpenSsl.class
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.ssl.OpenSsl.logger = r2
            java.lang.String r3 = "io.netty.handler.ssl.noOpenSsl"
            r4 = 0
            boolean r3 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r3, r4)
            java.lang.String r5 = " will be unavailable."
            java.lang.Class<io.netty.handler.ssl.OpenSslEngine> r6 = io.netty.handler.ssl.OpenSslEngine.class
            r7 = 0
            if (r3 == 0) goto L3c
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "OpenSSL was explicit disabled with -Dio.netty.handler.ssl.noOpenSsl=true"
            r0.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "netty-tcnative explicit disabled; "
            r3.append(r8)
            java.lang.String r6 = r6.getSimpleName()
            r3.append(r6)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.debug(r3, r0)
            goto Lce
        L3c:
            java.lang.String r2 = "io.netty.internal.tcnative.SSL"
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L47
            java.lang.Class.forName(r2, r4, r0)     // Catch: java.lang.ClassNotFoundException -> L47
            r0 = r7
            goto L65
        L47:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.ssl.OpenSsl.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "netty-tcnative not in the classpath; "
            r3.append(r8)
            java.lang.String r8 = r6.getSimpleName()
            r3.append(r8)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.debug(r3)
        L65:
            if (r0 != 0) goto Lce
            loadTcNative()     // Catch: java.lang.Throwable -> L6c
        L6a:
            r2 = r0
            goto L8d
        L6c:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.ssl.OpenSsl.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Failed to load netty-tcnative; "
            r3.append(r5)
            java.lang.String r5 = r6.getSimpleName()
            r3.append(r5)
            java.lang.String r5 = " will be unavailable, unless the application has already loaded the symbols by some other means. See https://netty.io/wiki/forked-tomcat-native.html for more information."
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.debug(r3, r0)
            goto L6a
        L8d:
            java.lang.String r0 = "io.netty.handler.ssl.openssl.engine"
            java.lang.String r0 = io.netty.util.internal.SystemPropertyUtil.get(r0, r7)     // Catch: java.lang.Throwable -> L9d
            if (r0 != 0) goto L9f
            io.netty.util.internal.logging.InternalLogger r3 = io.netty.handler.ssl.OpenSsl.logger     // Catch: java.lang.Throwable -> L9d
            java.lang.String r5 = "Initialize netty-tcnative using engine: 'default'"
            r3.debug(r5)     // Catch: java.lang.Throwable -> L9d
            goto La6
        L9d:
            r0 = move-exception
            goto Lab
        L9f:
            io.netty.util.internal.logging.InternalLogger r3 = io.netty.handler.ssl.OpenSsl.logger     // Catch: java.lang.Throwable -> L9d
            java.lang.String r5 = "Initialize netty-tcnative using engine: '{}'"
            r3.debug(r5, r0)     // Catch: java.lang.Throwable -> L9d
        La6:
            initializeTcNative(r0)     // Catch: java.lang.Throwable -> L9d
            r0 = r7
            goto Lce
        Lab:
            if (r2 != 0) goto Lae
            r2 = r0
        Lae:
            io.netty.util.internal.logging.InternalLogger r3 = io.netty.handler.ssl.OpenSsl.logger
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "Failed to initialize netty-tcnative; "
            r5.append(r8)
            java.lang.String r6 = r6.getSimpleName()
            r5.append(r6)
            java.lang.String r6 = " will be unavailable. See https://netty.io/wiki/forked-tomcat-native.html for more information."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r3.debug(r5, r0)
            r0 = r2
        Lce:
            io.netty.handler.ssl.OpenSsl.UNAVAILABILITY_CAUSE = r0
            if (r0 != 0) goto L3f5
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.OpenSsl.logger
            java.lang.String r2 = "netty-tcnative using native library: {}"
            java.lang.String r3 = io.netty.internal.tcnative.SSL.versionString()
            r0.debug(r2, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r0 = 128(0x80, float:1.8E-43)
            r3.<init>(r0)
            java.lang.String r0 = "BoringSSL"
            java.lang.String r5 = versionString()
            boolean r0 = r0.equals(r5)
            io.netty.handler.ssl.OpenSsl.IS_BORINGSSL = r0
            r0 = 63
            r5 = 1
            long r8 = io.netty.internal.tcnative.SSLContext.make(r0, r5)     // Catch: java.lang.Exception -> L2ee
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L146
            r0.<init>()     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L146
            java.util.Set<java.lang.String> r6 = io.netty.handler.ssl.SslUtils.TLSV13_CIPHERS     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L146
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L146
        L107:
            boolean r10 = r6.hasNext()     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L146
            if (r10 == 0) goto L12c
            java.lang.Object r10 = r6.next()     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L146
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L146
            boolean r11 = io.netty.handler.ssl.OpenSsl.IS_BORINGSSL     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L146
            java.lang.String r10 = io.netty.handler.ssl.CipherSuiteConverter.toOpenSsl(r10, r11)     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L146
            if (r10 == 0) goto L107
            r0.append(r10)     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L146
            r10 = 58
            r0.append(r10)     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L146
            goto L107
        L124:
            r0 = move-exception
            r1 = 0
            r6 = 0
            r7 = 0
            r23 = 0
            goto L2ea
        L12c:
            int r6 = r0.length()     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L146
            if (r6 != 0) goto L134
            r0 = 0
            goto L144
        L134:
            int r6 = r0.length()     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L146
            int r6 = r6 - r5
            r0.setLength(r6)     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L146
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L146
            io.netty.internal.tcnative.SSLContext.setCipherSuite(r8, r0, r5)     // Catch: java.lang.Throwable -> L124 java.lang.Exception -> L146
            r0 = 1
        L144:
            r6 = r0
            goto L147
        L146:
            r6 = 0
        L147:
            java.lang.String r0 = "ALL"
            io.netty.internal.tcnative.SSLContext.setCipherSuite(r8, r0, r4)     // Catch: java.lang.Throwable -> L2e5
            long r10 = io.netty.internal.tcnative.SSL.newSSL(r8, r5)     // Catch: java.lang.Throwable -> L2e5
            r16 = 0
            java.lang.String[] r0 = io.netty.internal.tcnative.SSL.getCiphers(r10)     // Catch: java.lang.Throwable -> L2b9
            int r12 = r0.length     // Catch: java.lang.Throwable -> L2b9
            r13 = 0
        L158:
            if (r13 >= r12) goto L187
            r14 = r0[r13]     // Catch: java.lang.Throwable -> L173
            if (r14 == 0) goto L184
            boolean r15 = r14.isEmpty()     // Catch: java.lang.Throwable -> L173
            if (r15 != 0) goto L184
            boolean r15 = r3.contains(r14)     // Catch: java.lang.Throwable -> L173
            if (r15 != 0) goto L184
            if (r6 != 0) goto L181
            boolean r15 = io.netty.handler.ssl.SslUtils.isTLSv13Cipher(r14)     // Catch: java.lang.Throwable -> L173
            if (r15 == 0) goto L181
            goto L184
        L173:
            r0 = move-exception
            r12 = r16
            r14 = r12
            r19 = r14
            r21 = r19
            r1 = 0
            r7 = 0
        L17d:
            r23 = 0
            goto L2c5
        L181:
            r3.add(r14)     // Catch: java.lang.Throwable -> L173
        L184:
            int r13 = r13 + 1
            goto L158
        L187:
            boolean r0 = io.netty.handler.ssl.OpenSsl.IS_BORINGSSL     // Catch: java.lang.Throwable -> L2b9
            if (r0 == 0) goto L19e
            java.lang.String r18 = "TLS_AES_128_GCM_SHA256"
            java.lang.String r19 = "TLS_AES_256_GCM_SHA384"
            java.lang.String r20 = "TLS_CHACHA20_POLY1305_SHA256"
            java.lang.String r21 = "AEAD-AES128-GCM-SHA256"
            java.lang.String r22 = "AEAD-AES256-GCM-SHA384"
            java.lang.String r23 = "AEAD-CHACHA20-POLY1305-SHA256"
            java.lang.String[] r12 = new java.lang.String[]{r18, r19, r20, r21, r22, r23}     // Catch: java.lang.Throwable -> L173
            java.util.Collections.addAll(r3, r12)     // Catch: java.lang.Throwable -> L173
        L19e:
            java.lang.String r12 = "-----BEGIN PRIVATE KEY-----\nMIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCCBtayYNDrM3NFnkBbwTd6gaWp\na84ENvkWzWgFGtVAe5iZUChqrAPNdgnQs7Brb3cCBYRDWOlxtnaGmhhDOoRkFMucWEyuFEWUfops\nk0PxjfeRn+JJUEEO4Zt1JslKGUz7hbBD0gCyjgxni9bdLWK/l8YakuBu1dGYF/9FTyiY3QaKOW9a\nUtYdaKMs3zFC3JIW4FDuyxbxFwoBqvLelSbpRRAH4KjqWd+2LRPNqDw+COEAmrZnfBuwZGc/ZhK9\nihorqrOYddFiWn8/GuMEBkCaQsmzhhOb9cUX5+R5jHiL3OodvKid7nJ6tGJuwdpdlYudQv6sWh4x\n0q+vRVLewaaFAgMBAAECggEAP8tPJvFtTxhNJAkCloHz0D0vpDHqQBMgntlkgayqmBqLwhyb18pR\ni0qwgh7HHc7wWqOOQuSqlEnrWRrdcI6TSe8R/sErzfTQNoznKWIPYcI/hskk4sdnQ//Yn9/Jvnsv\nU/BBjOTJxtD+sQbhAl80JcA3R+5sArURQkfzzHOL/YMqzAsn5hTzp7HZCxUqBk3KaHRxV7NefeOE\nxlZuWSmxYWfbFIs4kx19/1t7h8CHQWezw+G60G2VBtSBBxDnhBWvqG6R/wpzJ3nEhPLLY9T+XIHe\nipzdMOOOUZorfIg7M+pyYPji+ZIZxIpY5OjrOzXHciAjRtr5Y7l99K1CG1LguQKBgQDrQfIMxxtZ\nvxU/1cRmUV9l7pt5bjV5R6byXq178LxPKVYNjdZ840Q0/OpZEVqaT1xKVi35ohP1QfNjxPLlHD+K\niDAR9z6zkwjIrbwPCnb5kuXy4lpwPcmmmkva25fI7qlpHtbcuQdoBdCfr/KkKaUCMPyY89LCXgEw\n5KTDj64UywKBgQCNfbO+eZLGzhiHhtNJurresCsIGWlInv322gL8CSfBMYl6eNfUTZvUDdFhPISL\nUljKWzXDrjw0ujFSPR0XhUGtiq89H+HUTuPPYv25gVXO+HTgBFZEPl4PpA+BUsSVZy0NddneyqLk\n42Wey9omY9Q8WsdNQS5cbUvy0uG6WFoX7wKBgQDZ1jpW8pa0x2bZsQsm4vo+3G5CRnZlUp+XlWt2\ndDcp5dC0xD1zbs1dc0NcLeGDOTDv9FSl7hok42iHXXq8AygjEm/QcuwwQ1nC2HxmQP5holAiUs4D\nWHM8PWs3wFYPzE459EBoKTxeaeP/uWAn+he8q7d5uWvSZlEcANs/6e77eQKBgD21Ar0hfFfj7mK8\n9E0FeRZBsqK3omkfnhcYgZC11Xa2SgT1yvs2Va2n0RcdM5kncr3eBZav2GYOhhAdwyBM55XuE/sO\neokDVutNeuZ6d5fqV96TRaRBpvgfTvvRwxZ9hvKF4Vz+9wfn/JvCwANaKmegF6ejs7pvmF3whq2k\ndrZVAoGAX5YxQ5XMTD0QbMAl7/6qp6S58xNoVdfCkmkj1ZLKaHKIjS/benkKGlySVQVPexPfnkZx\np/Vv9yyphBoudiTBS9Uog66ueLYZqpgxlM/6OhYg86Gm3U2ycvMxYjBM1NFiyze21AqAhI+HX+Ot\nmraV2/guSgDgZAhukRZzeQ2RucI=\n-----END PRIVATE KEY-----"
            java.nio.charset.Charset r13 = io.netty.util.CharsetUtil.US_ASCII     // Catch: java.lang.Throwable -> L2b9
            byte[] r12 = r12.getBytes(r13)     // Catch: java.lang.Throwable -> L2b9
            io.netty.handler.ssl.PemPrivateKey r18 = io.netty.handler.ssl.PemPrivateKey.valueOf(r12)     // Catch: java.lang.Throwable -> L2b9
            io.netty.internal.tcnative.SSLContext.setCertificateCallback(r8, r7)     // Catch: java.lang.Throwable -> L269 java.lang.Error -> L272
            java.security.cert.X509Certificate r12 = selfSignedCertificate()     // Catch: java.lang.Throwable -> L269 java.lang.Error -> L272
            io.netty.buffer.ByteBufAllocator r13 = io.netty.buffer.ByteBufAllocator.DEFAULT     // Catch: java.lang.Throwable -> L269 java.lang.Error -> L272
            java.security.cert.X509Certificate[] r14 = new java.security.cert.X509Certificate[r5]     // Catch: java.lang.Throwable -> L269 java.lang.Error -> L272
            r14[r4] = r12     // Catch: java.lang.Throwable -> L269 java.lang.Error -> L272
            long r19 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.toBIO(r13, r14)     // Catch: java.lang.Throwable -> L269 java.lang.Error -> L272
            long r12 = io.netty.internal.tcnative.SSL.parseX509Chain(r19)     // Catch: java.lang.Throwable -> L260 java.lang.Error -> L265
            io.netty.buffer.UnpooledByteBufAllocator r14 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT     // Catch: java.lang.Throwable -> L255 java.lang.Error -> L25b
            io.netty.handler.ssl.PemEncoded r15 = r18.mo39retain()     // Catch: java.lang.Throwable -> L255 java.lang.Error -> L25b
            long r14 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.toBIO(r14, r15)     // Catch: java.lang.Throwable -> L255 java.lang.Error -> L25b
            long r21 = io.netty.internal.tcnative.SSL.parsePrivateKey(r14, r7)     // Catch: java.lang.Throwable -> L243 java.lang.Error -> L24e
            r24 = r21
            r21 = r14
            r14 = r24
            io.netty.internal.tcnative.SSL.setKeyMaterial(r10, r12, r14)     // Catch: java.lang.Throwable -> L230 java.lang.Error -> L23a
            boolean r7 = io.netty.util.internal.SystemPropertyUtil.contains(r1)     // Catch: java.lang.Throwable -> L1ec
            if (r0 != 0) goto L1ee
            boolean r0 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r1, r5)     // Catch: java.lang.Throwable -> L1ec
            if (r7 == 0) goto L1fb
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.handler.ssl.OpenSsl.logger     // Catch: java.lang.Throwable -> L1ea
            java.lang.String r7 = "System property 'io.netty.handler.ssl.openssl.useKeyManagerFactory' is deprecated and so will be ignored in the future"
            r1.info(r7)     // Catch: java.lang.Throwable -> L1ea
            goto L1fb
        L1ea:
            r1 = r0
            goto L1fd
        L1ec:
            r1 = 0
            goto L1fd
        L1ee:
            if (r7 == 0) goto L1fa
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.OpenSsl.logger     // Catch: java.lang.Throwable -> L1f8
            java.lang.String r1 = "System property 'io.netty.handler.ssl.openssl.useKeyManagerFactory' is deprecated and will be ignored when using BoringSSL"
            r0.info(r1)     // Catch: java.lang.Throwable -> L1f8
            goto L1fa
        L1f8:
            r1 = 1
            goto L1fd
        L1fa:
            r0 = 1
        L1fb:
            r1 = r0
            goto L204
        L1fd:
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.OpenSsl.logger     // Catch: java.lang.Throwable -> L21c java.lang.Error -> L228
            java.lang.String r7 = "Failed to get useKeyManagerFactory system property."
            r0.debug(r7)     // Catch: java.lang.Throwable -> L21c java.lang.Error -> L228
        L204:
            r18.release()     // Catch: java.lang.Throwable -> L212
            r24 = r21
            r21 = r14
            r14 = r24
            r7 = 1
            r23 = 0
            goto L286
        L212:
            r0 = move-exception
            r24 = r21
            r21 = r14
            r14 = r24
            r7 = 1
            goto L17d
        L21c:
            r0 = move-exception
            r24 = r21
            r21 = r14
            r14 = r24
            r7 = 1
        L224:
            r23 = 0
            goto L2b5
        L228:
            r24 = r21
            r21 = r14
            r14 = r24
            r7 = 1
            goto L27a
        L230:
            r0 = move-exception
            r24 = r21
            r21 = r14
            r14 = r24
        L237:
            r1 = 0
            r7 = 0
            goto L224
        L23a:
            r24 = r21
            r21 = r14
            r14 = r24
        L240:
            r1 = 0
            r7 = 0
            goto L27a
        L243:
            r0 = move-exception
            r21 = r14
            r1 = 0
            r7 = 0
            r23 = 0
            r21 = r16
            goto L2b5
        L24e:
            r21 = r14
            r1 = 0
            r7 = 0
            r21 = r16
            goto L27a
        L255:
            r0 = move-exception
            r14 = r16
        L258:
            r21 = r14
            goto L237
        L25b:
            r14 = r16
        L25d:
            r21 = r14
            goto L240
        L260:
            r0 = move-exception
            r12 = r16
            r14 = r12
            goto L258
        L265:
            r12 = r16
            r14 = r12
            goto L25d
        L269:
            r0 = move-exception
            r12 = r16
            r14 = r12
            r19 = r14
            r21 = r19
            goto L237
        L272:
            r12 = r16
            r14 = r12
            r19 = r14
            r21 = r19
            goto L240
        L27a:
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.OpenSsl.logger     // Catch: java.lang.Throwable -> L2b2
            r23 = 0
            java.lang.String r4 = "KeyManagerFactory not supported."
            r0.debug(r4)     // Catch: java.lang.Throwable -> L2b0
            r18.release()     // Catch: java.lang.Throwable -> L2ae
        L286:
            io.netty.internal.tcnative.SSL.freeSSL(r10)     // Catch: java.lang.Throwable -> L291
            int r0 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1))
            if (r0 == 0) goto L293
            io.netty.internal.tcnative.SSL.freeBIO(r19)     // Catch: java.lang.Throwable -> L291
            goto L293
        L291:
            r0 = move-exception
            goto L2ea
        L293:
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto L29a
            io.netty.internal.tcnative.SSL.freeBIO(r14)     // Catch: java.lang.Throwable -> L291
        L29a:
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 == 0) goto L2a1
            io.netty.internal.tcnative.SSL.freeX509Chain(r12)     // Catch: java.lang.Throwable -> L291
        L2a1:
            int r0 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r0 == 0) goto L2a8
            io.netty.internal.tcnative.SSL.freePrivateKey(r21)     // Catch: java.lang.Throwable -> L291
        L2a8:
            io.netty.internal.tcnative.SSLContext.free(r8)     // Catch: java.lang.Exception -> L2ac
            goto L2fb
        L2ac:
            r0 = move-exception
            goto L2f4
        L2ae:
            r0 = move-exception
            goto L2c5
        L2b0:
            r0 = move-exception
            goto L2b5
        L2b2:
            r0 = move-exception
            goto L224
        L2b5:
            r18.release()     // Catch: java.lang.Throwable -> L2ae
            throw r0     // Catch: java.lang.Throwable -> L2ae
        L2b9:
            r0 = move-exception
            r23 = 0
            r12 = r16
            r14 = r12
            r19 = r14
            r21 = r19
            r1 = 0
            r7 = 0
        L2c5:
            io.netty.internal.tcnative.SSL.freeSSL(r10)     // Catch: java.lang.Throwable -> L291
            int r4 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1))
            if (r4 == 0) goto L2cf
            io.netty.internal.tcnative.SSL.freeBIO(r19)     // Catch: java.lang.Throwable -> L291
        L2cf:
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 == 0) goto L2d6
            io.netty.internal.tcnative.SSL.freeBIO(r14)     // Catch: java.lang.Throwable -> L291
        L2d6:
            int r4 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r4 == 0) goto L2dd
            io.netty.internal.tcnative.SSL.freeX509Chain(r12)     // Catch: java.lang.Throwable -> L291
        L2dd:
            int r4 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r4 == 0) goto L2e4
            io.netty.internal.tcnative.SSL.freePrivateKey(r21)     // Catch: java.lang.Throwable -> L291
        L2e4:
            throw r0     // Catch: java.lang.Throwable -> L291
        L2e5:
            r0 = move-exception
            r23 = 0
            r1 = 0
            r7 = 0
        L2ea:
            io.netty.internal.tcnative.SSLContext.free(r8)     // Catch: java.lang.Exception -> L2ac
            throw r0     // Catch: java.lang.Exception -> L2ac
        L2ee:
            r0 = move-exception
            r23 = 0
            r1 = 0
            r6 = 0
            r7 = 0
        L2f4:
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.handler.ssl.OpenSsl.logger
            java.lang.String r8 = "Failed to get the list of available OpenSSL cipher suites."
            r4.warn(r8, r0)
        L2fb:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r3)
            io.netty.handler.ssl.OpenSsl.AVAILABLE_OPENSSL_CIPHER_SUITES = r0
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            int r4 = r0.size()
            r8 = 2
            int r4 = r4 * 2
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L311:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L33a
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r9 = io.netty.handler.ssl.SslUtils.isTLSv13Cipher(r4)
            if (r9 != 0) goto L336
            java.lang.String r9 = "TLS"
            java.lang.String r9 = io.netty.handler.ssl.CipherSuiteConverter.toJava(r4, r9)
            r3.add(r9)
            java.lang.String r9 = "SSL"
            java.lang.String r4 = io.netty.handler.ssl.CipherSuiteConverter.toJava(r4, r9)
            r3.add(r4)
            goto L311
        L336:
            r3.add(r4)
            goto L311
        L33a:
            java.lang.String[] r0 = io.netty.handler.ssl.SslUtils.DEFAULT_CIPHER_SUITES
            io.netty.handler.ssl.SslUtils.addIfSupported(r3, r2, r0)
            java.lang.String[] r0 = io.netty.handler.ssl.SslUtils.TLSV13_CIPHER_SUITES
            io.netty.handler.ssl.SslUtils.addIfSupported(r3, r2, r0)
            io.netty.handler.ssl.SslUtils.useFallbackCiphersIfDefaultIsEmpty(r2, r3)
            java.util.List r0 = java.util.Collections.unmodifiableList(r2)
            io.netty.handler.ssl.OpenSsl.DEFAULT_CIPHERS = r0
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r3)
            io.netty.handler.ssl.OpenSsl.AVAILABLE_JAVA_CIPHER_SUITES = r2
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            java.util.Set<java.lang.String> r4 = io.netty.handler.ssl.OpenSsl.AVAILABLE_OPENSSL_CIPHER_SUITES
            int r9 = r4.size()
            int r10 = r2.size()
            int r9 = r9 + r10
            r3.<init>(r9)
            r3.addAll(r4)
            r3.addAll(r2)
            io.netty.handler.ssl.OpenSsl.AVAILABLE_CIPHER_SUITES = r3
            io.netty.handler.ssl.OpenSsl.SUPPORTS_KEYMANAGER_FACTORY = r7
            io.netty.handler.ssl.OpenSsl.USE_KEYMANAGER_FACTORY = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r2 = 6
            r1.<init>(r2)
            java.lang.String r2 = "SSLv2Hello"
            r1.add(r2)
            int r2 = io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv2
            boolean r2 = doesSupportProtocol(r5, r2)
            if (r2 == 0) goto L387
            java.lang.String r2 = "SSLv2"
            r1.add(r2)
        L387:
            int r2 = io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv3
            boolean r2 = doesSupportProtocol(r8, r2)
            if (r2 == 0) goto L394
            java.lang.String r2 = "SSLv3"
            r1.add(r2)
        L394:
            r2 = 4
            int r3 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1
            boolean r2 = doesSupportProtocol(r2, r3)
            if (r2 == 0) goto L3a2
            java.lang.String r2 = "TLSv1"
            r1.add(r2)
        L3a2:
            r2 = 8
            int r3 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_1
            boolean r2 = doesSupportProtocol(r2, r3)
            if (r2 == 0) goto L3b1
            java.lang.String r2 = "TLSv1.1"
            r1.add(r2)
        L3b1:
            r2 = 16
            int r3 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_2
            boolean r2 = doesSupportProtocol(r2, r3)
            if (r2 == 0) goto L3c0
            java.lang.String r2 = "TLSv1.2"
            r1.add(r2)
        L3c0:
            if (r6 == 0) goto L3d4
            r2 = 32
            int r3 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_3
            boolean r2 = doesSupportProtocol(r2, r3)
            if (r2 == 0) goto L3d4
            java.lang.String r2 = "TLSv1.3"
            r1.add(r2)
            io.netty.handler.ssl.OpenSsl.TLSV13_SUPPORTED = r5
            goto L3d6
        L3d4:
            io.netty.handler.ssl.OpenSsl.TLSV13_SUPPORTED = r23
        L3d6:
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            io.netty.handler.ssl.OpenSsl.SUPPORTED_PROTOCOLS_SET = r1
            boolean r2 = doesSupportOcsp()
            io.netty.handler.ssl.OpenSsl.SUPPORTS_OCSP = r2
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.ssl.OpenSsl.logger
            boolean r3 = r2.isDebugEnabled()
            if (r3 == 0) goto L40f
            java.lang.String r3 = "Supported protocols (OpenSSL): {} "
            r2.debug(r3, r1)
            java.lang.String r1 = "Default cipher suites (OpenSSL): {}"
            r2.debug(r1, r0)
            goto L40f
        L3f5:
            r23 = 0
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            io.netty.handler.ssl.OpenSsl.DEFAULT_CIPHERS = r0
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            io.netty.handler.ssl.OpenSsl.AVAILABLE_OPENSSL_CIPHER_SUITES = r0
            io.netty.handler.ssl.OpenSsl.AVAILABLE_JAVA_CIPHER_SUITES = r0
            io.netty.handler.ssl.OpenSsl.AVAILABLE_CIPHER_SUITES = r0
            io.netty.handler.ssl.OpenSsl.SUPPORTS_KEYMANAGER_FACTORY = r23
            io.netty.handler.ssl.OpenSsl.USE_KEYMANAGER_FACTORY = r23
            io.netty.handler.ssl.OpenSsl.SUPPORTED_PROTOCOLS_SET = r0
            io.netty.handler.ssl.OpenSsl.SUPPORTS_OCSP = r23
            io.netty.handler.ssl.OpenSsl.TLSV13_SUPPORTED = r23
            io.netty.handler.ssl.OpenSsl.IS_BORINGSSL = r23
        L40f:
            return
    }

    private OpenSsl() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static java.util.Set<java.lang.String> availableCipherSuites() {
            java.util.Set r0 = availableOpenSslCipherSuites()
            return r0
    }

    public static java.util.Set<java.lang.String> availableJavaCipherSuites() {
            java.util.Set<java.lang.String> r0 = io.netty.handler.ssl.OpenSsl.AVAILABLE_JAVA_CIPHER_SUITES
            return r0
    }

    public static java.util.Set<java.lang.String> availableOpenSslCipherSuites() {
            java.util.Set<java.lang.String> r0 = io.netty.handler.ssl.OpenSsl.AVAILABLE_OPENSSL_CIPHER_SUITES
            return r0
    }

    private static boolean doesSupportOcsp() {
            int r0 = version()
            long r0 = (long) r0
            r2 = 268443648(0x10002000, double:1.326287843E-315)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L38
            r0 = 16
            r1 = 1
            r2 = -1
            long r5 = io.netty.internal.tcnative.SSLContext.make(r0, r1)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L2f
            io.netty.internal.tcnative.SSLContext.enableOcsp(r5, r4)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L20
            io.netty.internal.tcnative.SSLContext.free(r5)
        L20:
            return r1
        L21:
            r0 = move-exception
            goto L27
        L23:
            goto L31
        L25:
            r0 = move-exception
            r5 = r2
        L27:
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 == 0) goto L2e
            io.netty.internal.tcnative.SSLContext.free(r5)
        L2e:
            throw r0
        L2f:
            r5 = r2
        L31:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L38
            io.netty.internal.tcnative.SSLContext.free(r5)
        L38:
            return r4
    }

    private static boolean doesSupportProtocol(int r4, int r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r5 = 2
            long r4 = io.netty.internal.tcnative.SSLContext.make(r4, r5)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
            r0 = -1
            r2 = 1
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L13
            io.netty.internal.tcnative.SSLContext.free(r4)
        L13:
            return r2
        L14:
            r4 = move-exception
            throw r4
        L16:
            return r0
    }

    public static void ensureAvailability() {
            java.lang.Throwable r0 = io.netty.handler.ssl.OpenSsl.UNAVAILABILITY_CAUSE
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsatisfiedLinkError r1 = new java.lang.UnsatisfiedLinkError
            java.lang.String r2 = "failed to load the required native library"
            r1.<init>(r2)
            java.lang.Throwable r0 = r1.initCause(r0)
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
    }

    private static boolean initializeTcNative(java.lang.String r1) throws java.lang.Exception {
            java.lang.String r0 = "provided"
            boolean r1 = io.netty.internal.tcnative.Library.initialize(r0, r1)
            return r1
    }

    public static boolean isAlpnSupported() {
            int r0 = version()
            long r0 = (long) r0
            r2 = 268443648(0x10002000, double:1.326287843E-315)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static boolean isAvailable() {
            java.lang.Throwable r0 = io.netty.handler.ssl.OpenSsl.UNAVAILABILITY_CAUSE
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    static boolean isBoringSSL() {
            boolean r0 = io.netty.handler.ssl.OpenSsl.IS_BORINGSSL
            return r0
    }

    public static boolean isCipherSuiteAvailable(java.lang.String r1) {
            boolean r0 = io.netty.handler.ssl.OpenSsl.IS_BORINGSSL
            java.lang.String r0 = io.netty.handler.ssl.CipherSuiteConverter.toOpenSsl(r1, r0)
            if (r0 == 0) goto L9
            r1 = r0
        L9:
            java.util.Set<java.lang.String> r0 = io.netty.handler.ssl.OpenSsl.AVAILABLE_OPENSSL_CIPHER_SUITES
            boolean r1 = r0.contains(r1)
            return r1
    }

    public static boolean isOcspSupported() {
            boolean r0 = io.netty.handler.ssl.OpenSsl.SUPPORTS_OCSP
            return r0
    }

    static boolean isTlsv13Supported() {
            boolean r0 = io.netty.handler.ssl.OpenSsl.TLSV13_SUPPORTED
            return r0
    }

    private static void loadTcNative() throws java.lang.Exception {
            java.lang.String r0 = io.netty.util.internal.PlatformDependent.normalizedOs()
            java.lang.String r1 = io.netty.util.internal.PlatformDependent.normalizedArch()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r3 = 4
            r2.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "netty_tcnative"
            r3.append(r4)
            java.lang.String r5 = "_"
            r3.append(r5)
            r3.append(r0)
            r6 = 95
            r3.append(r6)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r2.add(r3)
            java.lang.String r3 = "linux"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L57
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r5)
            r3.append(r0)
            r3.append(r6)
            r3.append(r1)
            java.lang.String r0 = "_fedora"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.add(r0)
        L57:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.add(r0)
            r2.add(r4)
            java.lang.Class<io.netty.internal.tcnative.SSL> r0 = io.netty.internal.tcnative.SSL.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            io.netty.util.internal.NativeLibraryLoader.loadFirstAvailable(r0, r1)
            return
    }

    static long memoryAddress(io.netty.buffer.ByteBuf r2) {
            boolean r0 = r2.hasMemoryAddress()
            if (r0 == 0) goto Lb
            long r0 = r2.memoryAddress()
            return r0
        Lb:
            java.nio.ByteBuffer r2 = r2.nioBuffer()
            long r0 = io.netty.internal.tcnative.Buffer.address(r2)
            return r0
    }

    static void releaseIfNeeded(io.netty.util.ReferenceCounted r1) {
            int r0 = r1.refCnt()
            if (r0 <= 0) goto L9
            io.netty.util.ReferenceCountUtil.safeRelease(r1)
        L9:
            return
    }

    static java.security.cert.X509Certificate selfSignedCertificate() throws java.security.cert.CertificateException {
            java.security.cert.CertificateFactory r0 = io.netty.handler.ssl.SslContext.X509_CERT_FACTORY
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            java.lang.String r2 = "-----BEGIN CERTIFICATE-----\nMIICrjCCAZagAwIBAgIIdSvQPv1QAZQwDQYJKoZIhvcNAQELBQAwFjEUMBIGA1UEAxMLZXhhbXBs\nZS5jb20wIBcNMTgwNDA2MjIwNjU5WhgPOTk5OTEyMzEyMzU5NTlaMBYxFDASBgNVBAMTC2V4YW1w\nbGUuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAggbWsmDQ6zNzRZ5AW8E3eoGl\nqWvOBDb5Fs1oBRrVQHuYmVAoaqwDzXYJ0LOwa293AgWEQ1jpcbZ2hpoYQzqEZBTLnFhMrhRFlH6K\nbJND8Y33kZ/iSVBBDuGbdSbJShlM+4WwQ9IAso4MZ4vW3S1iv5fGGpLgbtXRmBf/RU8omN0Gijlv\nWlLWHWijLN8xQtySFuBQ7ssW8RcKAary3pUm6UUQB+Co6lnfti0Tzag8PgjhAJq2Z3wbsGRnP2YS\nvYoaK6qzmHXRYlp/PxrjBAZAmkLJs4YTm/XFF+fkeYx4i9zqHbyone5yerRibsHaXZWLnUL+rFoe\nMdKvr0VS3sGmhQIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQADQi441pKmXf9FvUV5EHU4v8nJT9Iq\nyqwsKwXnr7AsUlDGHBD7jGrjAXnG5rGxuNKBQ35wRxJATKrUtyaquFUL6H8O6aGQehiFTk6zmPbe\n12Gu44vqqTgIUxnv3JQJiox8S2hMxsSddpeCmSdvmalvD6WG4NthH6B9ZaBEiep1+0s0RUaBYn73\nI7CCUaAtbjfR6pcJjrFk5ei7uwdQZFSJtkP2z8r7zfeANJddAKFlkaMWn7u+OIVuB4XPooWicObk\nNAHFtP65bocUYnDpTVdiyvn8DdqyZ/EO8n1bBKBzuSLplk2msW4pdgaFgY7Vw/0wzcFXfUXmL1uy\nG8sQD/wx\n-----END CERTIFICATE-----"
            java.nio.charset.Charset r3 = io.netty.util.CharsetUtil.US_ASCII
            byte[] r2 = r2.getBytes(r3)
            r1.<init>(r2)
            java.security.cert.Certificate r0 = r0.generateCertificate(r1)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            return r0
    }

    @java.lang.Deprecated
    public static boolean supportsHostnameValidation() {
            boolean r0 = isAvailable()
            return r0
    }

    public static boolean supportsKeyManagerFactory() {
            boolean r0 = io.netty.handler.ssl.OpenSsl.SUPPORTS_KEYMANAGER_FACTORY
            return r0
    }

    public static java.lang.Throwable unavailabilityCause() {
            java.lang.Throwable r0 = io.netty.handler.ssl.OpenSsl.UNAVAILABILITY_CAUSE
            return r0
    }

    static boolean useKeyManagerFactory() {
            boolean r0 = io.netty.handler.ssl.OpenSsl.USE_KEYMANAGER_FACTORY
            return r0
    }

    public static int version() {
            boolean r0 = isAvailable()
            if (r0 == 0) goto Lb
            int r0 = io.netty.internal.tcnative.SSL.version()
            return r0
        Lb:
            r0 = -1
            return r0
    }

    public static java.lang.String versionString() {
            boolean r0 = isAvailable()
            if (r0 == 0) goto Lb
            java.lang.String r0 = io.netty.internal.tcnative.SSL.versionString()
            return r0
        Lb:
            r0 = 0
            return r0
    }
}
