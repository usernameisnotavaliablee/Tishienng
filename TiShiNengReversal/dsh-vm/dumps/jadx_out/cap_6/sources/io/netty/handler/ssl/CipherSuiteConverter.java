package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class CipherSuiteConverter {
    private static final java.util.regex.Pattern JAVA_AES_CBC_PATTERN = null;
    private static final java.util.regex.Pattern JAVA_AES_PATTERN = null;
    private static final java.util.regex.Pattern JAVA_CIPHERSUITE_PATTERN = null;
    private static final java.util.regex.Pattern OPENSSL_AES_CBC_PATTERN = null;
    private static final java.util.regex.Pattern OPENSSL_AES_PATTERN = null;
    private static final java.util.regex.Pattern OPENSSL_CIPHERSUITE_PATTERN = null;
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.String> j2o = null;
    private static final java.util.Map<java.lang.String, java.lang.String> j2oTls13 = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> o2j = null;
    private static final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> o2jTls13 = null;

    static {
            java.lang.Class<io.netty.handler.ssl.CipherSuiteConverter> r0 = io.netty.handler.ssl.CipherSuiteConverter.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.ssl.CipherSuiteConverter.logger = r0
            java.lang.String r0 = "^(?:TLS|SSL)_((?:(?!_WITH_).)+)_WITH_(.*)_(.*)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.netty.handler.ssl.CipherSuiteConverter.JAVA_CIPHERSUITE_PATTERN = r0
            java.lang.String r0 = "^(?:((?:(?:EXP-)?(?:(?:DHE|EDH|ECDH|ECDHE|SRP|RSA)-(?:DSS|RSA|ECDSA|PSK)|(?:ADH|AECDH|KRB5|PSK|SRP)))|EXP)-)?(.*)-(.*)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.netty.handler.ssl.CipherSuiteConverter.OPENSSL_CIPHERSUITE_PATTERN = r0
            java.lang.String r0 = "^(AES)_([0-9]+)_CBC$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.netty.handler.ssl.CipherSuiteConverter.JAVA_AES_CBC_PATTERN = r0
            java.lang.String r0 = "^(AES)_([0-9]+)_(.*)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.netty.handler.ssl.CipherSuiteConverter.JAVA_AES_PATTERN = r0
            java.lang.String r0 = "^(AES)([0-9]+)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.netty.handler.ssl.CipherSuiteConverter.OPENSSL_AES_CBC_PATTERN = r0
            java.lang.String r0 = "^(AES)([0-9]+)-(.*)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.netty.handler.ssl.CipherSuiteConverter.OPENSSL_AES_PATTERN = r0
            java.util.concurrent.ConcurrentMap r0 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            io.netty.handler.ssl.CipherSuiteConverter.j2o = r0
            java.util.concurrent.ConcurrentMap r0 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            io.netty.handler.ssl.CipherSuiteConverter.o2j = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "TLS_AES_128_GCM_SHA256"
            java.lang.String r2 = "AEAD-AES128-GCM-SHA256"
            r0.put(r1, r2)
            java.lang.String r3 = "TLS_AES_256_GCM_SHA384"
            java.lang.String r4 = "AEAD-AES256-GCM-SHA384"
            r0.put(r3, r4)
            java.lang.String r5 = "TLS_CHACHA20_POLY1305_SHA256"
            java.lang.String r6 = "AEAD-CHACHA20-POLY1305-SHA256"
            r0.put(r5, r6)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            io.netty.handler.ssl.CipherSuiteConverter.j2oTls13 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r7 = "TLS"
            java.util.Map r8 = java.util.Collections.singletonMap(r7, r1)
            r0.put(r1, r8)
            java.util.Map r8 = java.util.Collections.singletonMap(r7, r3)
            r0.put(r3, r8)
            java.util.Map r8 = java.util.Collections.singletonMap(r7, r5)
            r0.put(r5, r8)
            java.util.Map r1 = java.util.Collections.singletonMap(r7, r1)
            r0.put(r2, r1)
            java.util.Map r1 = java.util.Collections.singletonMap(r7, r3)
            r0.put(r4, r1)
            java.util.Map r1 = java.util.Collections.singletonMap(r7, r5)
            r0.put(r6, r1)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            io.netty.handler.ssl.CipherSuiteConverter.o2jTls13 = r0
            return
    }

    private CipherSuiteConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String cacheFromJava(java.lang.String r4, boolean r5) {
            java.util.Map<java.lang.String, java.lang.String> r0 = io.netty.handler.ssl.CipherSuiteConverter.j2oTls13
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Le
            if (r5 == 0) goto Ld
            return r0
        Ld:
            return r4
        Le:
            java.lang.String r5 = toOpenSslUncached(r4, r5)
            if (r5 != 0) goto L16
            r4 = 0
            return r4
        L16:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.String> r0 = io.netty.handler.ssl.CipherSuiteConverter.j2o
            r0.putIfAbsent(r4, r5)
            r0 = 4
            java.lang.String r1 = r4.substring(r0)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r0)
            java.lang.String r0 = ""
            r2.put(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "SSL_"
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "SSL"
            r2.put(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "TLS_"
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TLS"
            r2.put(r1, r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = io.netty.handler.ssl.CipherSuiteConverter.o2j
            r0.put(r5, r2)
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.CipherSuiteConverter.logger
            java.lang.String r1 = "Cipher suite mapping: {} => {}"
            r0.debug(r1, r4, r5)
            return r5
    }

    private static java.util.Map<java.lang.String, java.lang.String> cacheFromOpenSsl(java.lang.String r5) {
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = io.netty.handler.ssl.CipherSuiteConverter.o2jTls13
            java.lang.Object r0 = r0.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            r0 = 0
            java.lang.String r0 = toJavaUncached0(r5, r0)
            if (r0 != 0) goto L14
            r5 = 0
            return r5
        L14:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SSL_"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "TLS_"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.util.HashMap r3 = new java.util.HashMap
            r4 = 4
            r3.<init>(r4)
            java.lang.String r4 = ""
            r3.put(r4, r0)
            java.lang.String r0 = "SSL"
            r3.put(r0, r1)
            java.lang.String r0 = "TLS"
            r3.put(r0, r2)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = io.netty.handler.ssl.CipherSuiteConverter.o2j
            r0.putIfAbsent(r5, r3)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.String> r0 = io.netty.handler.ssl.CipherSuiteConverter.j2o
            r0.putIfAbsent(r2, r5)
            r0.putIfAbsent(r1, r5)
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.CipherSuiteConverter.logger
            java.lang.String r4 = "Cipher suite mapping: {} => {}"
            r0.debug(r4, r2, r5)
            r0.debug(r4, r1, r5)
            return r3
    }

    static void clearCache() {
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.String> r0 = io.netty.handler.ssl.CipherSuiteConverter.j2o
            r0.clear()
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = io.netty.handler.ssl.CipherSuiteConverter.o2j
            r0.clear()
            return
    }

    static void convertToCipherStrings(java.lang.Iterable<java.lang.String> r4, java.lang.StringBuilder r5, java.lang.StringBuilder r6, boolean r7) {
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L13
            goto L61
        L13:
            java.lang.String r1 = toOpenSsl(r0, r7)
            if (r1 != 0) goto L1a
            r1 = r0
        L1a:
            boolean r2 = io.netty.handler.ssl.OpenSsl.isCipherSuiteAvailable(r1)
            if (r2 == 0) goto L3d
            boolean r2 = io.netty.handler.ssl.SslUtils.isTLSv13Cipher(r1)
            r3 = 58
            if (r2 != 0) goto L36
            boolean r0 = io.netty.handler.ssl.SslUtils.isTLSv13Cipher(r0)
            if (r0 == 0) goto L2f
            goto L36
        L2f:
            r5.append(r1)
            r5.append(r3)
            goto L4
        L36:
            r6.append(r1)
            r6.append(r3)
            goto L4
        L3d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unsupported cipher suite: "
            r5.append(r6)
            r5.append(r0)
            r6 = 40
            r5.append(r6)
            r5.append(r1)
            r6 = 41
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L61:
            int r4 = r5.length()
            if (r4 != 0) goto L76
            int r4 = r6.length()
            if (r4 == 0) goto L6e
            goto L76
        L6e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "empty cipher suites"
            r4.<init>(r5)
            throw r4
        L76:
            int r4 = r5.length()
            if (r4 <= 0) goto L85
            int r4 = r5.length()
            int r4 = r4 + (-1)
            r5.setLength(r4)
        L85:
            int r4 = r6.length()
            if (r4 <= 0) goto L94
            int r4 = r6.length()
            int r4 = r4 + (-1)
            r6.setLength(r4)
        L94:
            return
    }

    static boolean isJ2OCached(java.lang.String r1, java.lang.String r2) {
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.String> r0 = io.netty.handler.ssl.CipherSuiteConverter.j2o
            java.lang.Object r1 = r0.get(r1)
            boolean r1 = r2.equals(r1)
            return r1
    }

    static boolean isO2JCached(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = io.netty.handler.ssl.CipherSuiteConverter.o2j
            java.lang.Object r1 = r0.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            java.lang.Object r1 = r1.get(r2)
            boolean r1 = r3.equals(r1)
            return r1
    }

    static java.lang.String toJava(java.lang.String r2, java.lang.String r3) {
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = io.netty.handler.ssl.CipherSuiteConverter.o2j
            java.lang.Object r0 = r0.get(r2)
            java.util.Map r0 = (java.util.Map) r0
            r1 = 0
            if (r0 != 0) goto L12
            java.util.Map r0 = cacheFromOpenSsl(r2)
            if (r0 != 0) goto L12
            return r1
        L12:
            java.lang.Object r2 = r0.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L39
            java.lang.String r2 = ""
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L25
            return r1
        L25:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r3 = 95
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
        L39:
            return r2
    }

    private static java.lang.String toJavaBulkCipher(java.lang.String r2, boolean r3) {
            java.lang.String r0 = "AES"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L2e
            java.util.regex.Pattern r0 = io.netty.handler.ssl.CipherSuiteConverter.OPENSSL_AES_CBC_PATTERN
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L1b
            java.lang.String r2 = "$1_$2_CBC"
            java.lang.String r2 = r0.replaceFirst(r2)
            return r2
        L1b:
            java.util.regex.Pattern r0 = io.netty.handler.ssl.CipherSuiteConverter.OPENSSL_AES_PATTERN
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L2e
            java.lang.String r2 = "$1_$2_$3"
            java.lang.String r2 = r0.replaceFirst(r2)
            return r2
        L2e:
            java.lang.String r0 = "DES-CBC3"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L39
            java.lang.String r2 = "3DES_EDE_CBC"
            return r2
        L39:
            java.lang.String r0 = "RC4"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L49
            if (r3 == 0) goto L46
            java.lang.String r2 = "RC4_40"
            return r2
        L46:
            java.lang.String r2 = "RC4_128"
            return r2
        L49:
            java.lang.String r0 = "DES-CBC"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L59
            if (r3 == 0) goto L56
            java.lang.String r2 = "DES_CBC_40"
            return r2
        L56:
            java.lang.String r2 = "DES_CBC"
            return r2
        L59:
            java.lang.String r0 = "RC2-CBC"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L69
            if (r3 == 0) goto L66
            java.lang.String r2 = "RC2_CBC_40"
            return r2
        L66:
            java.lang.String r2 = "RC2_CBC"
            return r2
        L69:
            r3 = 45
            r0 = 95
            java.lang.String r2 = r2.replace(r3, r0)
            return r2
    }

    private static java.lang.String toJavaHandshakeAlgo(java.lang.String r2, boolean r3) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r2 = "RSA"
            goto L1e
        L9:
            java.lang.String r0 = "ADH"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L14
            java.lang.String r2 = "DH_anon"
            goto L1e
        L14:
            java.lang.String r0 = "AECDH"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1e
            java.lang.String r2 = "ECDH_anon"
        L1e:
            r0 = 45
            r1 = 95
            java.lang.String r2 = r2.replace(r0, r1)
            if (r3 == 0) goto L39
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "_EXPORT"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L39:
            return r2
    }

    private static java.lang.String toJavaHmacAlgo(java.lang.String r0) {
            return r0
    }

    static java.lang.String toJavaUncached(java.lang.String r1) {
            r0 = 1
            java.lang.String r1 = toJavaUncached0(r1, r0)
            return r1
    }

    private static java.lang.String toJavaUncached0(java.lang.String r4, boolean r5) {
            if (r5 == 0) goto L15
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r5 = io.netty.handler.ssl.CipherSuiteConverter.o2jTls13
            java.lang.Object r5 = r5.get(r4)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 == 0) goto L15
            java.lang.String r4 = "TLS"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L15:
            java.util.regex.Pattern r5 = io.netty.handler.ssl.CipherSuiteConverter.OPENSSL_CIPHERSUITE_PATTERN
            java.util.regex.Matcher r4 = r5.matcher(r4)
            boolean r5 = r4.matches()
            if (r5 != 0) goto L23
            r4 = 0
            return r4
        L23:
            r5 = 1
            java.lang.String r0 = r4.group(r5)
            r1 = 0
            java.lang.String r2 = ""
            if (r0 != 0) goto L30
            r0 = r2
        L2e:
            r5 = 0
            goto L47
        L30:
            java.lang.String r3 = "EXP-"
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L3e
            r1 = 4
            java.lang.String r0 = r0.substring(r1)
            goto L47
        L3e:
            java.lang.String r3 = "EXP"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2e
            r0 = r2
        L47:
            java.lang.String r0 = toJavaHandshakeAlgo(r0, r5)
            r1 = 2
            java.lang.String r1 = r4.group(r1)
            java.lang.String r5 = toJavaBulkCipher(r1, r5)
            r1 = 3
            java.lang.String r4 = r4.group(r1)
            java.lang.String r4 = toJavaHmacAlgo(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "_WITH_"
            r1.append(r0)
            r1.append(r5)
            r0 = 95
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r0 = "CHACHA20"
            boolean r5 = r5.contains(r0)
            if (r5 == 0) goto L92
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "_SHA256"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
        L92:
            return r4
    }

    static java.lang.String toOpenSsl(java.lang.String r1, boolean r2) {
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.String> r0 = io.netty.handler.ssl.CipherSuiteConverter.j2o
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r1 = cacheFromJava(r1, r2)
            return r1
    }

    private static java.lang.String toOpenSslBulkCipher(java.lang.String r2) {
            java.lang.String r0 = "AES_"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L2e
            java.util.regex.Pattern r0 = io.netty.handler.ssl.CipherSuiteConverter.JAVA_AES_CBC_PATTERN
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L1b
            java.lang.String r2 = "$1$2"
            java.lang.String r2 = r0.replaceFirst(r2)
            return r2
        L1b:
            java.util.regex.Pattern r0 = io.netty.handler.ssl.CipherSuiteConverter.JAVA_AES_PATTERN
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L2e
            java.lang.String r2 = "$1$2-$3"
            java.lang.String r2 = r0.replaceFirst(r2)
            return r2
        L2e:
            java.lang.String r0 = "3DES_EDE_CBC"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L39
            java.lang.String r2 = "DES-CBC3"
            return r2
        L39:
            java.lang.String r0 = "RC4_128"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L72
            java.lang.String r0 = "RC4_40"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L4a
            goto L72
        L4a:
            java.lang.String r0 = "DES40_CBC"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L6f
            java.lang.String r0 = "DES_CBC_40"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L5b
            goto L6f
        L5b:
            java.lang.String r0 = "RC2_CBC_40"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L66
            java.lang.String r2 = "RC2-CBC"
            return r2
        L66:
            r0 = 95
            r1 = 45
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
        L6f:
            java.lang.String r2 = "DES-CBC"
            return r2
        L72:
            java.lang.String r2 = "RC4"
            return r2
    }

    private static java.lang.String toOpenSslHandshakeAlgo(java.lang.String r4) {
            java.lang.String r0 = "_EXPORT"
            boolean r0 = r4.endsWith(r0)
            r1 = 0
            if (r0 == 0) goto L13
            int r2 = r4.length()
            int r2 = r2 + (-7)
            java.lang.String r4 = r4.substring(r1, r2)
        L13:
            java.lang.String r2 = "RSA"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L1e
            java.lang.String r4 = ""
            goto L41
        L1e:
            java.lang.String r2 = "_anon"
            boolean r2 = r4.endsWith(r2)
            if (r2 == 0) goto L41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 65
            r2.append(r3)
            int r3 = r4.length()
            int r3 = r3 + (-5)
            java.lang.String r4 = r4.substring(r1, r3)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
        L41:
            if (r0 == 0) goto L5d
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L4c
            java.lang.String r4 = "EXP"
            goto L5d
        L4c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "EXP-"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L5d:
            r0 = 95
            r1 = 45
            java.lang.String r4 = r4.replace(r0, r1)
            return r4
    }

    private static java.lang.String toOpenSslHmacAlgo(java.lang.String r0) {
            return r0
    }

    static java.lang.String toOpenSslUncached(java.lang.String r3, boolean r4) {
            java.util.Map<java.lang.String, java.lang.String> r0 = io.netty.handler.ssl.CipherSuiteConverter.j2oTls13
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Le
            if (r4 == 0) goto Ld
            return r0
        Ld:
            return r3
        Le:
            java.util.regex.Pattern r4 = io.netty.handler.ssl.CipherSuiteConverter.JAVA_CIPHERSUITE_PATTERN
            java.util.regex.Matcher r3 = r4.matcher(r3)
            boolean r4 = r3.matches()
            if (r4 != 0) goto L1c
            r3 = 0
            return r3
        L1c:
            r4 = 1
            java.lang.String r4 = r3.group(r4)
            java.lang.String r4 = toOpenSslHandshakeAlgo(r4)
            r0 = 2
            java.lang.String r0 = r3.group(r0)
            java.lang.String r0 = toOpenSslBulkCipher(r0)
            r1 = 3
            java.lang.String r3 = r3.group(r1)
            java.lang.String r3 = toOpenSslHmacAlgo(r3)
            boolean r1 = r4.isEmpty()
            r2 = 45
            if (r1 == 0) goto L52
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r2)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            return r3
        L52:
            java.lang.String r1 = "CHACHA20"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L6d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        L6d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r2)
            r1.append(r0)
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
