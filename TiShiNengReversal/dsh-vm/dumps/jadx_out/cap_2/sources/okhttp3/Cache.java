package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Cache implements java.io.Closeable, java.io.Flushable {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Cache.Companion Companion = null;
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.cache.DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class CacheResponseBody extends okhttp3.ResponseBody {

        @org.jetbrains.annotations.NotNull
        private final okio.BufferedSource bodySource;

        @org.jetbrains.annotations.Nullable
        private final java.lang.String contentLength;

        @org.jetbrains.annotations.Nullable
        private final java.lang.String contentType;

        @org.jetbrains.annotations.NotNull
        private final okhttp3.internal.cache.DiskLruCache.Snapshot snapshot;


        public CacheResponseBody(@org.jetbrains.annotations.NotNull okhttp3.internal.cache.DiskLruCache.Snapshot r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
                r1 = this;
                java.lang.String r0 = "snapshot"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.snapshot = r2
                r1.contentType = r3
                r1.contentLength = r4
                r3 = 1
                okio.Source r2 = r2.getSource(r3)
                okhttp3.Cache$CacheResponseBody$1 r3 = new okhttp3.Cache$CacheResponseBody$1
                r3.<init>(r2, r1)
                okio.BufferedSource r2 = okio.Okio.buffer(r3)
                r1.bodySource = r2
                return
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
                r3 = this;
                java.lang.String r0 = r3.contentLength
                r1 = -1
                if (r0 == 0) goto Lb
                long r0 = okhttp3.internal._UtilCommonKt.toLongOrDefault(r0, r1)
                return r0
            Lb:
                return r1
        }

        @Override // okhttp3.ResponseBody
        @org.jetbrains.annotations.Nullable
        public okhttp3.MediaType contentType() {
                r2 = this;
                java.lang.String r0 = r2.contentType
                if (r0 == 0) goto Lb
                okhttp3.MediaType$Companion r1 = okhttp3.MediaType.Companion
                okhttp3.MediaType r0 = r1.parse(r0)
                return r0
            Lb:
                r0 = 0
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.cache.DiskLruCache.Snapshot getSnapshot() {
                r1 = this;
                okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r1.snapshot
                return r0
        }

        @Override // okhttp3.ResponseBody
        @org.jetbrains.annotations.NotNull
        public okio.BufferedSource source() {
                r1 = this;
                okio.BufferedSource r0 = r1.bodySource
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,838:1\n2746#2,3:839\n*S KotlinDebug\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n*L\n777#1:839,3\n*E\n"})
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

        private final java.util.Set<java.lang.String> varyFields(okhttp3.Headers r14) {
                r13 = this;
                int r0 = r14.size()
                r1 = 0
                r2 = 0
                r3 = 0
            L7:
                if (r3 >= r0) goto L55
                java.lang.String r4 = "Vary"
                java.lang.String r5 = r14.name(r3)
                r6 = 1
                boolean r4 = kotlin.text.u.a2(r4, r5, r6)
                if (r4 != 0) goto L17
                goto L52
            L17:
                java.lang.String r7 = r14.value(r3)
                if (r1 != 0) goto L28
                java.util.TreeSet r1 = new java.util.TreeSet
                kotlin.jvm.internal.t0 r4 = kotlin.jvm.internal.t0.a
                java.util.Comparator r4 = kotlin.text.u.g2(r4)
                r1.<init>(r4)
            L28:
                char[] r8 = new char[r6]
                r4 = 44
                r8[r2] = r4
                r11 = 6
                r12 = 0
                r9 = 0
                r10 = 0
                java.util.List r4 = kotlin.text.u.l5(r7, r8, r9, r10, r11, r12)
                java.util.Iterator r4 = r4.iterator()
            L3a:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L52
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                java.lang.CharSequence r5 = kotlin.text.u.Z5(r5)
                java.lang.String r5 = r5.toString()
                r1.add(r5)
                goto L3a
            L52:
                int r3 = r3 + 1
                goto L7
            L55:
                if (r1 != 0) goto L5c
                java.util.Set r14 = kotlin.collections.u1.k()
                return r14
            L5c:
                return r1
        }

        private final okhttp3.Headers varyHeaders(okhttp3.Headers r6, okhttp3.Headers r7) {
                r5 = this;
                java.util.Set r7 = r5.varyFields(r7)
                boolean r0 = r7.isEmpty()
                if (r0 == 0) goto Ld
                okhttp3.Headers r6 = okhttp3.Headers.EMPTY
                return r6
            Ld:
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
                r0.<init>()
                int r1 = r6.size()
                r2 = 0
            L17:
                if (r2 >= r1) goto L2d
                java.lang.String r3 = r6.name(r2)
                boolean r4 = r7.contains(r3)
                if (r4 == 0) goto L2a
                java.lang.String r4 = r6.value(r2)
                r0.add(r3, r4)
            L2a:
                int r2 = r2 + 1
                goto L17
            L2d:
                okhttp3.Headers r6 = r0.build()
                return r6
        }

        public final boolean hasVaryAll(@org.jetbrains.annotations.NotNull okhttp3.Response r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.Headers r2 = r2.headers()
                java.util.Set r2 = r1.varyFields(r2)
                java.lang.String r0 = "*"
                boolean r2 = r2.contains(r0)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final java.lang.String key(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r2) {
                r1 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.g0.p(r2, r0)
                okio.ByteString$Companion r0 = okio.ByteString.Companion
                java.lang.String r2 = r2.toString()
                okio.ByteString r2 = r0.encodeUtf8(r2)
                okio.ByteString r2 = r2.md5()
                java.lang.String r2 = r2.hex()
                return r2
        }

        public final int readInt$okhttp(@org.jetbrains.annotations.NotNull okio.BufferedSource r6) throws java.io.IOException {
                r5 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r6, r0)
                long r0 = r6.readDecimalLong()     // Catch: java.lang.NumberFormatException -> L22
                java.lang.String r6 = r6.readUtf8LineStrict()     // Catch: java.lang.NumberFormatException -> L22
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L24
                r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 > 0) goto L24
                int r2 = r6.length()     // Catch: java.lang.NumberFormatException -> L22
                if (r2 > 0) goto L24
                int r6 = (int) r0     // Catch: java.lang.NumberFormatException -> L22
                return r6
            L22:
                r6 = move-exception
                goto L43
            L24:
                java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.NumberFormatException -> L22
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L22
                r3.<init>()     // Catch: java.lang.NumberFormatException -> L22
                java.lang.String r4 = "expected an int but was \""
                r3.append(r4)     // Catch: java.lang.NumberFormatException -> L22
                r3.append(r0)     // Catch: java.lang.NumberFormatException -> L22
                r3.append(r6)     // Catch: java.lang.NumberFormatException -> L22
                r6 = 34
                r3.append(r6)     // Catch: java.lang.NumberFormatException -> L22
                java.lang.String r6 = r3.toString()     // Catch: java.lang.NumberFormatException -> L22
                r2.<init>(r6)     // Catch: java.lang.NumberFormatException -> L22
                throw r2     // Catch: java.lang.NumberFormatException -> L22
            L43:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r6 = r6.getMessage()
                r0.<init>(r6)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers varyHeaders(@org.jetbrains.annotations.NotNull okhttp3.Response r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.Response r0 = r2.networkResponse()
                kotlin.jvm.internal.g0.m(r0)
                okhttp3.Request r0 = r0.request()
                okhttp3.Headers r0 = r0.headers()
                okhttp3.Headers r2 = r2.headers()
                okhttp3.Headers r2 = r1.varyHeaders(r0, r2)
                return r2
        }

        public final boolean varyMatches(@org.jetbrains.annotations.NotNull okhttp3.Response r4, @org.jetbrains.annotations.NotNull okhttp3.Headers r5, @org.jetbrains.annotations.NotNull okhttp3.Request r6) {
                r3 = this;
                java.lang.String r0 = "cachedResponse"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "cachedRequest"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "newRequest"
                kotlin.jvm.internal.g0.p(r6, r0)
                okhttp3.Headers r4 = r4.headers()
                java.util.Set r4 = r3.varyFields(r4)
                boolean r0 = androidx.activity.k.a(r4)
                r1 = 1
                if (r0 == 0) goto L25
                boolean r0 = r4.isEmpty()
                if (r0 == 0) goto L25
                return r1
            L25:
                java.util.Iterator r4 = r4.iterator()
            L29:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L45
                java.lang.Object r0 = r4.next()
                java.lang.String r0 = (java.lang.String) r0
                java.util.List r2 = r5.values(r0)
                java.util.List r0 = r6.headers(r0)
                boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
                if (r0 != 0) goto L29
                r4 = 0
                return r4
            L45:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Entry {

        @org.jetbrains.annotations.NotNull
        public static final okhttp3.Cache.Entry.Companion Companion = null;

        @org.jetbrains.annotations.NotNull
        private static final java.lang.String RECEIVED_MILLIS = null;

        @org.jetbrains.annotations.NotNull
        private static final java.lang.String SENT_MILLIS = null;
        private final int code;

        @org.jetbrains.annotations.Nullable
        private final okhttp3.Handshake handshake;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String message;

        @org.jetbrains.annotations.NotNull
        private final okhttp3.Protocol protocol;
        private final long receivedResponseMillis;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String requestMethod;

        @org.jetbrains.annotations.NotNull
        private final okhttp3.Headers responseHeaders;
        private final long sentRequestMillis;

        @org.jetbrains.annotations.NotNull
        private final okhttp3.HttpUrl url;

        @org.jetbrains.annotations.NotNull
        private final okhttp3.Headers varyHeaders;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
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
        }

        static {
                okhttp3.Cache$Entry$Companion r0 = new okhttp3.Cache$Entry$Companion
                r1 = 0
                r0.<init>(r1)
                okhttp3.Cache.Entry.Companion = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion
                okhttp3.internal.platform.Platform r2 = r1.get()
                java.lang.String r2 = r2.getPrefix()
                r0.append(r2)
                java.lang.String r2 = "-Sent-Millis"
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                okhttp3.Cache.Entry.SENT_MILLIS = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                okhttp3.internal.platform.Platform r1 = r1.get()
                java.lang.String r1 = r1.getPrefix()
                r0.append(r1)
                java.lang.String r1 = "-Received-Millis"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                okhttp3.Cache.Entry.RECEIVED_MILLIS = r0
                return
        }

        public Entry(@org.jetbrains.annotations.NotNull okhttp3.Response r3) {
                r2 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.g0.p(r3, r0)
                r2.<init>()
                okhttp3.Request r0 = r3.request()
                okhttp3.HttpUrl r0 = r0.url()
                r2.url = r0
                okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
                okhttp3.Headers r0 = r0.varyHeaders(r3)
                r2.varyHeaders = r0
                okhttp3.Request r0 = r3.request()
                java.lang.String r0 = r0.method()
                r2.requestMethod = r0
                okhttp3.Protocol r0 = r3.protocol()
                r2.protocol = r0
                int r0 = r3.code()
                r2.code = r0
                java.lang.String r0 = r3.message()
                r2.message = r0
                okhttp3.Headers r0 = r3.headers()
                r2.responseHeaders = r0
                okhttp3.Handshake r0 = r3.handshake()
                r2.handshake = r0
                long r0 = r3.sentRequestAtMillis()
                r2.sentRequestMillis = r0
                long r0 = r3.receivedResponseAtMillis()
                r2.receivedResponseMillis = r0
                return
        }

        public Entry(@org.jetbrains.annotations.NotNull okio.Source r9) throws java.io.IOException {
                r8 = this;
                java.lang.String r0 = "rawSource"
                kotlin.jvm.internal.g0.p(r9, r0)
                r8.<init>()
                okio.BufferedSource r0 = okio.Okio.buffer(r9)     // Catch: java.lang.Throwable -> L39
                java.lang.String r1 = r0.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L39
                okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion     // Catch: java.lang.Throwable -> L39
                okhttp3.HttpUrl r2 = r2.parse(r1)     // Catch: java.lang.Throwable -> L39
                if (r2 == 0) goto L100
                r8.url = r2     // Catch: java.lang.Throwable -> L39
                java.lang.String r1 = r0.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L39
                r8.requestMethod = r1     // Catch: java.lang.Throwable -> L39
                okhttp3.Headers$Builder r1 = new okhttp3.Headers$Builder     // Catch: java.lang.Throwable -> L39
                r1.<init>()     // Catch: java.lang.Throwable -> L39
                okhttp3.Cache$Companion r2 = okhttp3.Cache.Companion     // Catch: java.lang.Throwable -> L39
                int r2 = r2.readInt$okhttp(r0)     // Catch: java.lang.Throwable -> L39
                r3 = 0
                r4 = 0
            L2d:
                if (r4 >= r2) goto L3c
                java.lang.String r5 = r0.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L39
                r1.addLenient$okhttp(r5)     // Catch: java.lang.Throwable -> L39
                int r4 = r4 + 1
                goto L2d
            L39:
                r0 = move-exception
                goto L123
            L3c:
                okhttp3.Headers r1 = r1.build()     // Catch: java.lang.Throwable -> L39
                r8.varyHeaders = r1     // Catch: java.lang.Throwable -> L39
                okhttp3.internal.http.StatusLine$Companion r1 = okhttp3.internal.http.StatusLine.Companion     // Catch: java.lang.Throwable -> L39
                java.lang.String r2 = r0.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L39
                okhttp3.internal.http.StatusLine r1 = r1.parse(r2)     // Catch: java.lang.Throwable -> L39
                okhttp3.Protocol r2 = r1.protocol     // Catch: java.lang.Throwable -> L39
                r8.protocol = r2     // Catch: java.lang.Throwable -> L39
                int r2 = r1.code     // Catch: java.lang.Throwable -> L39
                r8.code = r2     // Catch: java.lang.Throwable -> L39
                java.lang.String r1 = r1.message     // Catch: java.lang.Throwable -> L39
                r8.message = r1     // Catch: java.lang.Throwable -> L39
                okhttp3.Headers$Builder r1 = new okhttp3.Headers$Builder     // Catch: java.lang.Throwable -> L39
                r1.<init>()     // Catch: java.lang.Throwable -> L39
                okhttp3.Cache$Companion r2 = okhttp3.Cache.Companion     // Catch: java.lang.Throwable -> L39
                int r2 = r2.readInt$okhttp(r0)     // Catch: java.lang.Throwable -> L39
            L63:
                if (r3 >= r2) goto L6f
                java.lang.String r4 = r0.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L39
                r1.addLenient$okhttp(r4)     // Catch: java.lang.Throwable -> L39
                int r3 = r3 + 1
                goto L63
            L6f:
                java.lang.String r2 = okhttp3.Cache.Entry.SENT_MILLIS     // Catch: java.lang.Throwable -> L39
                java.lang.String r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L39
                java.lang.String r4 = okhttp3.Cache.Entry.RECEIVED_MILLIS     // Catch: java.lang.Throwable -> L39
                java.lang.String r5 = r1.get(r4)     // Catch: java.lang.Throwable -> L39
                r1.removeAll(r2)     // Catch: java.lang.Throwable -> L39
                r1.removeAll(r4)     // Catch: java.lang.Throwable -> L39
                r6 = 0
                if (r3 == 0) goto L8a
                long r2 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> L39
                goto L8b
            L8a:
                r2 = r6
            L8b:
                r8.sentRequestMillis = r2     // Catch: java.lang.Throwable -> L39
                if (r5 == 0) goto L93
                long r6 = java.lang.Long.parseLong(r5)     // Catch: java.lang.Throwable -> L39
            L93:
                r8.receivedResponseMillis = r6     // Catch: java.lang.Throwable -> L39
                okhttp3.Headers r1 = r1.build()     // Catch: java.lang.Throwable -> L39
                r8.responseHeaders = r1     // Catch: java.lang.Throwable -> L39
                okhttp3.HttpUrl r1 = r8.url     // Catch: java.lang.Throwable -> L39
                boolean r1 = r1.isHttps()     // Catch: java.lang.Throwable -> L39
                r2 = 0
                if (r1 == 0) goto Lf8
                java.lang.String r1 = r0.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L39
                int r3 = r1.length()     // Catch: java.lang.Throwable -> L39
                if (r3 > 0) goto Ldc
                java.lang.String r1 = r0.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L39
                okhttp3.CipherSuite$Companion r3 = okhttp3.CipherSuite.Companion     // Catch: java.lang.Throwable -> L39
                okhttp3.CipherSuite r1 = r3.forJavaName(r1)     // Catch: java.lang.Throwable -> L39
                java.util.List r3 = r8.readCertificateList(r0)     // Catch: java.lang.Throwable -> L39
                java.util.List r4 = r8.readCertificateList(r0)     // Catch: java.lang.Throwable -> L39
                boolean r5 = r0.exhausted()     // Catch: java.lang.Throwable -> L39
                if (r5 != 0) goto Ld1
                okhttp3.TlsVersion$Companion r5 = okhttp3.TlsVersion.Companion     // Catch: java.lang.Throwable -> L39
                java.lang.String r0 = r0.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L39
                okhttp3.TlsVersion r0 = r5.forJavaName(r0)     // Catch: java.lang.Throwable -> L39
                goto Ld3
            Ld1:
                okhttp3.TlsVersion r0 = okhttp3.TlsVersion.SSL_3_0     // Catch: java.lang.Throwable -> L39
            Ld3:
                okhttp3.Handshake$Companion r5 = okhttp3.Handshake.Companion     // Catch: java.lang.Throwable -> L39
                okhttp3.Handshake r0 = r5.get(r0, r1, r3, r4)     // Catch: java.lang.Throwable -> L39
                r8.handshake = r0     // Catch: java.lang.Throwable -> L39
                goto Lfa
            Ldc:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L39
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
                r2.<init>()     // Catch: java.lang.Throwable -> L39
                java.lang.String r3 = "expected \"\" but was \""
                r2.append(r3)     // Catch: java.lang.Throwable -> L39
                r2.append(r1)     // Catch: java.lang.Throwable -> L39
                r1 = 34
                r2.append(r1)     // Catch: java.lang.Throwable -> L39
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L39
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L39
                throw r0     // Catch: java.lang.Throwable -> L39
            Lf8:
                r8.handshake = r2     // Catch: java.lang.Throwable -> L39
            Lfa:
                kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L39
                kotlin.io.b.a(r9, r2)
                return
            L100:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L39
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
                r2.<init>()     // Catch: java.lang.Throwable -> L39
                java.lang.String r3 = "Cache corruption for "
                r2.append(r3)     // Catch: java.lang.Throwable -> L39
                r2.append(r1)     // Catch: java.lang.Throwable -> L39
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L39
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L39
                okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> L39
                okhttp3.internal.platform.Platform r1 = r1.get()     // Catch: java.lang.Throwable -> L39
                java.lang.String r2 = "cache corruption"
                r3 = 5
                r1.log(r2, r3, r0)     // Catch: java.lang.Throwable -> L39
                throw r0     // Catch: java.lang.Throwable -> L39
            L123:
                throw r0     // Catch: java.lang.Throwable -> L124
            L124:
                r1 = move-exception
                kotlin.io.b.a(r9, r0)
                throw r1
        }

        private final java.util.List<java.security.cert.Certificate> readCertificateList(okio.BufferedSource r8) throws java.io.IOException {
                r7 = this;
                okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
                int r0 = r0.readInt$okhttp(r8)
                r1 = -1
                if (r0 != r1) goto Le
                java.util.List r8 = kotlin.collections.f0.J()
                return r8
            Le:
                java.lang.String r1 = "X.509"
                java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch: java.security.cert.CertificateException -> L3e
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.security.cert.CertificateException -> L3e
                r2.<init>(r0)     // Catch: java.security.cert.CertificateException -> L3e
                r3 = 0
            L1a:
                if (r3 >= r0) goto L48
                java.lang.String r4 = r8.readUtf8LineStrict()     // Catch: java.security.cert.CertificateException -> L3e
                okio.Buffer r5 = new okio.Buffer     // Catch: java.security.cert.CertificateException -> L3e
                r5.<init>()     // Catch: java.security.cert.CertificateException -> L3e
                okio.ByteString$Companion r6 = okio.ByteString.Companion     // Catch: java.security.cert.CertificateException -> L3e
                okio.ByteString r4 = r6.decodeBase64(r4)     // Catch: java.security.cert.CertificateException -> L3e
                if (r4 == 0) goto L40
                r5.write(r4)     // Catch: java.security.cert.CertificateException -> L3e
                java.io.InputStream r4 = r5.inputStream()     // Catch: java.security.cert.CertificateException -> L3e
                java.security.cert.Certificate r4 = r1.generateCertificate(r4)     // Catch: java.security.cert.CertificateException -> L3e
                r2.add(r4)     // Catch: java.security.cert.CertificateException -> L3e
                int r3 = r3 + 1
                goto L1a
            L3e:
                r8 = move-exception
                goto L49
            L40:
                java.io.IOException r8 = new java.io.IOException     // Catch: java.security.cert.CertificateException -> L3e
                java.lang.String r0 = "Corrupt certificate in cache entry"
                r8.<init>(r0)     // Catch: java.security.cert.CertificateException -> L3e
                throw r8     // Catch: java.security.cert.CertificateException -> L3e
            L48:
                return r2
            L49:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r8 = r8.getMessage()
                r0.<init>(r8)
                throw r0
        }

        private final void writeCertList(okio.BufferedSink r9, java.util.List<? extends java.security.cert.Certificate> r10) throws java.io.IOException {
                r8 = this;
                int r0 = r10.size()     // Catch: java.security.cert.CertificateEncodingException -> L3b
                long r0 = (long) r0     // Catch: java.security.cert.CertificateEncodingException -> L3b
                okio.BufferedSink r0 = r9.writeDecimalLong(r0)     // Catch: java.security.cert.CertificateEncodingException -> L3b
                r1 = 10
                r0.writeByte(r1)     // Catch: java.security.cert.CertificateEncodingException -> L3b
                java.util.Iterator r10 = r10.iterator()     // Catch: java.security.cert.CertificateEncodingException -> L3b
            L12:
                boolean r0 = r10.hasNext()     // Catch: java.security.cert.CertificateEncodingException -> L3b
                if (r0 == 0) goto L3e
                java.lang.Object r0 = r10.next()     // Catch: java.security.cert.CertificateEncodingException -> L3b
                java.security.cert.Certificate r0 = (java.security.cert.Certificate) r0     // Catch: java.security.cert.CertificateEncodingException -> L3b
                byte[] r3 = r0.getEncoded()     // Catch: java.security.cert.CertificateEncodingException -> L3b
                okio.ByteString$Companion r2 = okio.ByteString.Companion     // Catch: java.security.cert.CertificateEncodingException -> L3b
                kotlin.jvm.internal.g0.m(r3)     // Catch: java.security.cert.CertificateEncodingException -> L3b
                r6 = 3
                r7 = 0
                r4 = 0
                r5 = 0
                okio.ByteString r0 = okio.ByteString.Companion.of$default(r2, r3, r4, r5, r6, r7)     // Catch: java.security.cert.CertificateEncodingException -> L3b
                java.lang.String r0 = r0.base64()     // Catch: java.security.cert.CertificateEncodingException -> L3b
                okio.BufferedSink r0 = r9.writeUtf8(r0)     // Catch: java.security.cert.CertificateEncodingException -> L3b
                r0.writeByte(r1)     // Catch: java.security.cert.CertificateEncodingException -> L3b
                goto L12
            L3b:
                r0 = move-exception
                r9 = r0
                goto L3f
            L3e:
                return
            L3f:
                java.io.IOException r10 = new java.io.IOException
                java.lang.String r9 = r9.getMessage()
                r10.<init>(r9)
                throw r10
        }

        public final boolean matches(@org.jetbrains.annotations.NotNull okhttp3.Request r3, @org.jetbrains.annotations.NotNull okhttp3.Response r4) {
                r2 = this;
                java.lang.String r0 = "request"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "response"
                kotlin.jvm.internal.g0.p(r4, r0)
                okhttp3.HttpUrl r0 = r2.url
                okhttp3.HttpUrl r1 = r3.url()
                boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
                if (r0 == 0) goto L2e
                java.lang.String r0 = r2.requestMethod
                java.lang.String r1 = r3.method()
                boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
                if (r0 == 0) goto L2e
                okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
                okhttp3.Headers r1 = r2.varyHeaders
                boolean r3 = r0.varyMatches(r4, r1, r3)
                if (r3 == 0) goto L2e
                r3 = 1
                return r3
            L2e:
                r3 = 0
                return r3
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Response response(@org.jetbrains.annotations.NotNull okhttp3.internal.cache.DiskLruCache.Snapshot r10) {
                r9 = this;
                java.lang.String r0 = "snapshot"
                kotlin.jvm.internal.g0.p(r10, r0)
                okhttp3.Headers r0 = r9.responseHeaders
                java.lang.String r1 = "Content-Type"
                java.lang.String r0 = r0.get(r1)
                okhttp3.Headers r1 = r9.responseHeaders
                java.lang.String r2 = "Content-Length"
                java.lang.String r1 = r1.get(r2)
                okhttp3.Request r2 = new okhttp3.Request
                okhttp3.HttpUrl r3 = r9.url
                okhttp3.Headers r4 = r9.varyHeaders
                java.lang.String r5 = r9.requestMethod
                r7 = 8
                r8 = 0
                r6 = 0
                r2.<init>(r3, r4, r5, r6, r7, r8)
                okhttp3.Response$Builder r3 = new okhttp3.Response$Builder
                r3.<init>()
                okhttp3.Response$Builder r2 = r3.request(r2)
                okhttp3.Protocol r3 = r9.protocol
                okhttp3.Response$Builder r2 = r2.protocol(r3)
                int r3 = r9.code
                okhttp3.Response$Builder r2 = r2.code(r3)
                java.lang.String r3 = r9.message
                okhttp3.Response$Builder r2 = r2.message(r3)
                okhttp3.Headers r3 = r9.responseHeaders
                okhttp3.Response$Builder r2 = r2.headers(r3)
                okhttp3.Cache$CacheResponseBody r3 = new okhttp3.Cache$CacheResponseBody
                r3.<init>(r10, r0, r1)
                okhttp3.Response$Builder r10 = r2.body(r3)
                okhttp3.Handshake r0 = r9.handshake
                okhttp3.Response$Builder r10 = r10.handshake(r0)
                long r0 = r9.sentRequestMillis
                okhttp3.Response$Builder r10 = r10.sentRequestAtMillis(r0)
                long r0 = r9.receivedResponseMillis
                okhttp3.Response$Builder r10 = r10.receivedResponseAtMillis(r0)
                okhttp3.Response r10 = r10.build()
                return r10
        }

        public final void writeTo(@org.jetbrains.annotations.NotNull okhttp3.internal.cache.DiskLruCache.Editor r8) throws java.io.IOException {
                r7 = this;
                java.lang.String r0 = "editor"
                kotlin.jvm.internal.g0.p(r8, r0)
                r0 = 0
                okio.Sink r8 = r8.newSink(r0)
                okio.BufferedSink r8 = okio.Okio.buffer(r8)
                okhttp3.HttpUrl r1 = r7.url     // Catch: java.lang.Throwable -> L5d
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5d
                okio.BufferedSink r1 = r8.writeUtf8(r1)     // Catch: java.lang.Throwable -> L5d
                r2 = 10
                r1.writeByte(r2)     // Catch: java.lang.Throwable -> L5d
                java.lang.String r1 = r7.requestMethod     // Catch: java.lang.Throwable -> L5d
                okio.BufferedSink r1 = r8.writeUtf8(r1)     // Catch: java.lang.Throwable -> L5d
                r1.writeByte(r2)     // Catch: java.lang.Throwable -> L5d
                okhttp3.Headers r1 = r7.varyHeaders     // Catch: java.lang.Throwable -> L5d
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L5d
                long r3 = (long) r1     // Catch: java.lang.Throwable -> L5d
                okio.BufferedSink r1 = r8.writeDecimalLong(r3)     // Catch: java.lang.Throwable -> L5d
                r1.writeByte(r2)     // Catch: java.lang.Throwable -> L5d
                okhttp3.Headers r1 = r7.varyHeaders     // Catch: java.lang.Throwable -> L5d
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L5d
                r3 = 0
            L3b:
                java.lang.String r4 = ": "
                if (r3 >= r1) goto L60
                okhttp3.Headers r5 = r7.varyHeaders     // Catch: java.lang.Throwable -> L5d
                java.lang.String r5 = r5.name(r3)     // Catch: java.lang.Throwable -> L5d
                okio.BufferedSink r5 = r8.writeUtf8(r5)     // Catch: java.lang.Throwable -> L5d
                okio.BufferedSink r4 = r5.writeUtf8(r4)     // Catch: java.lang.Throwable -> L5d
                okhttp3.Headers r5 = r7.varyHeaders     // Catch: java.lang.Throwable -> L5d
                java.lang.String r5 = r5.value(r3)     // Catch: java.lang.Throwable -> L5d
                okio.BufferedSink r4 = r4.writeUtf8(r5)     // Catch: java.lang.Throwable -> L5d
                r4.writeByte(r2)     // Catch: java.lang.Throwable -> L5d
                int r3 = r3 + 1
                goto L3b
            L5d:
                r0 = move-exception
                goto L11b
            L60:
                okhttp3.internal.http.StatusLine r1 = new okhttp3.internal.http.StatusLine     // Catch: java.lang.Throwable -> L5d
                okhttp3.Protocol r3 = r7.protocol     // Catch: java.lang.Throwable -> L5d
                int r5 = r7.code     // Catch: java.lang.Throwable -> L5d
                java.lang.String r6 = r7.message     // Catch: java.lang.Throwable -> L5d
                r1.<init>(r3, r5, r6)     // Catch: java.lang.Throwable -> L5d
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5d
                okio.BufferedSink r1 = r8.writeUtf8(r1)     // Catch: java.lang.Throwable -> L5d
                r1.writeByte(r2)     // Catch: java.lang.Throwable -> L5d
                okhttp3.Headers r1 = r7.responseHeaders     // Catch: java.lang.Throwable -> L5d
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L5d
                int r1 = r1 + 2
                long r5 = (long) r1     // Catch: java.lang.Throwable -> L5d
                okio.BufferedSink r1 = r8.writeDecimalLong(r5)     // Catch: java.lang.Throwable -> L5d
                r1.writeByte(r2)     // Catch: java.lang.Throwable -> L5d
                okhttp3.Headers r1 = r7.responseHeaders     // Catch: java.lang.Throwable -> L5d
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L5d
            L8c:
                if (r0 >= r1) goto Lac
                okhttp3.Headers r3 = r7.responseHeaders     // Catch: java.lang.Throwable -> L5d
                java.lang.String r3 = r3.name(r0)     // Catch: java.lang.Throwable -> L5d
                okio.BufferedSink r3 = r8.writeUtf8(r3)     // Catch: java.lang.Throwable -> L5d
                okio.BufferedSink r3 = r3.writeUtf8(r4)     // Catch: java.lang.Throwable -> L5d
                okhttp3.Headers r5 = r7.responseHeaders     // Catch: java.lang.Throwable -> L5d
                java.lang.String r5 = r5.value(r0)     // Catch: java.lang.Throwable -> L5d
                okio.BufferedSink r3 = r3.writeUtf8(r5)     // Catch: java.lang.Throwable -> L5d
                r3.writeByte(r2)     // Catch: java.lang.Throwable -> L5d
                int r0 = r0 + 1
                goto L8c
            Lac:
                java.lang.String r0 = okhttp3.Cache.Entry.SENT_MILLIS     // Catch: java.lang.Throwable -> L5d
                okio.BufferedSink r0 = r8.writeUtf8(r0)     // Catch: java.lang.Throwable -> L5d
                okio.BufferedSink r0 = r0.writeUtf8(r4)     // Catch: java.lang.Throwable -> L5d
                long r5 = r7.sentRequestMillis     // Catch: java.lang.Throwable -> L5d
                okio.BufferedSink r0 = r0.writeDecimalLong(r5)     // Catch: java.lang.Throwable -> L5d
                r0.writeByte(r2)     // Catch: java.lang.Throwable -> L5d
                java.lang.String r0 = okhttp3.Cache.Entry.RECEIVED_MILLIS     // Catch: java.lang.Throwable -> L5d
                okio.BufferedSink r0 = r8.writeUtf8(r0)     // Catch: java.lang.Throwable -> L5d
                okio.BufferedSink r0 = r0.writeUtf8(r4)     // Catch: java.lang.Throwable -> L5d
                long r3 = r7.receivedResponseMillis     // Catch: java.lang.Throwable -> L5d
                okio.BufferedSink r0 = r0.writeDecimalLong(r3)     // Catch: java.lang.Throwable -> L5d
                r0.writeByte(r2)     // Catch: java.lang.Throwable -> L5d
                okhttp3.HttpUrl r0 = r7.url     // Catch: java.lang.Throwable -> L5d
                boolean r0 = r0.isHttps()     // Catch: java.lang.Throwable -> L5d
                if (r0 == 0) goto L114
                r8.writeByte(r2)     // Catch: java.lang.Throwable -> L5d
                okhttp3.Handshake r0 = r7.handshake     // Catch: java.lang.Throwable -> L5d
                kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.Throwable -> L5d
                okhttp3.CipherSuite r0 = r0.cipherSuite()     // Catch: java.lang.Throwable -> L5d
                java.lang.String r0 = r0.javaName()     // Catch: java.lang.Throwable -> L5d
                okio.BufferedSink r0 = r8.writeUtf8(r0)     // Catch: java.lang.Throwable -> L5d
                r0.writeByte(r2)     // Catch: java.lang.Throwable -> L5d
                okhttp3.Handshake r0 = r7.handshake     // Catch: java.lang.Throwable -> L5d
                java.util.List r0 = r0.peerCertificates()     // Catch: java.lang.Throwable -> L5d
                r7.writeCertList(r8, r0)     // Catch: java.lang.Throwable -> L5d
                okhttp3.Handshake r0 = r7.handshake     // Catch: java.lang.Throwable -> L5d
                java.util.List r0 = r0.localCertificates()     // Catch: java.lang.Throwable -> L5d
                r7.writeCertList(r8, r0)     // Catch: java.lang.Throwable -> L5d
                okhttp3.Handshake r0 = r7.handshake     // Catch: java.lang.Throwable -> L5d
                okhttp3.TlsVersion r0 = r0.tlsVersion()     // Catch: java.lang.Throwable -> L5d
                java.lang.String r0 = r0.javaName()     // Catch: java.lang.Throwable -> L5d
                okio.BufferedSink r0 = r8.writeUtf8(r0)     // Catch: java.lang.Throwable -> L5d
                r0.writeByte(r2)     // Catch: java.lang.Throwable -> L5d
            L114:
                kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L5d
                r0 = 0
                kotlin.io.b.a(r8, r0)
                return
            L11b:
                throw r0     // Catch: java.lang.Throwable -> L11c
            L11c:
                r1 = move-exception
                kotlin.io.b.a(r8, r0)
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class RealCacheRequest implements okhttp3.internal.cache.CacheRequest {

        @org.jetbrains.annotations.NotNull
        private final okio.Sink body;

        @org.jetbrains.annotations.NotNull
        private final okio.Sink cacheOut;
        private boolean done;

        @org.jetbrains.annotations.NotNull
        private final okhttp3.internal.cache.DiskLruCache.Editor editor;
        final /* synthetic */ okhttp3.Cache this$0;


        public RealCacheRequest(@org.jetbrains.annotations.NotNull okhttp3.Cache r2, okhttp3.internal.cache.DiskLruCache.Editor r3) {
                r1 = this;
                java.lang.String r0 = "editor"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.editor = r3
                r0 = 1
                okio.Sink r3 = r3.newSink(r0)
                r1.cacheOut = r3
                okhttp3.Cache$RealCacheRequest$1 r0 = new okhttp3.Cache$RealCacheRequest$1
                r0.<init>(r2, r1, r3)
                r1.body = r0
                return
        }

        public static final /* synthetic */ okhttp3.internal.cache.DiskLruCache.Editor access$getEditor$p(okhttp3.Cache.RealCacheRequest r0) {
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r0.editor
                return r0
        }

        public void abort() {
                r3 = this;
                okhttp3.Cache r0 = r3.this$0
                monitor-enter(r0)
                boolean r1 = r3.done     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L9
                monitor-exit(r0)
                return
            L9:
                r1 = 1
                r3.done = r1     // Catch: java.lang.Throwable -> L20
                int r2 = r0.getWriteAbortCount$okhttp()     // Catch: java.lang.Throwable -> L20
                int r2 = r2 + r1
                r0.setWriteAbortCount$okhttp(r2)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r0)
                okio.Sink r0 = r3.cacheOut
                okhttp3.internal._UtilCommonKt.closeQuietly(r0)
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r3.editor     // Catch: java.io.IOException -> L1f
                r0.abort()     // Catch: java.io.IOException -> L1f
            L1f:
                return
            L20:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        @org.jetbrains.annotations.NotNull
        public okio.Sink body() {
                r1 = this;
                okio.Sink r0 = r1.body
                return r0
        }

        public final boolean getDone() {
                r1 = this;
                boolean r0 = r1.done
                return r0
        }

        public final void setDone(boolean r1) {
                r0 = this;
                r0.done = r1
                return
        }
    }

    static {
            okhttp3.Cache$Companion r0 = new okhttp3.Cache$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.Cache.Companion = r0
            return
    }

    public Cache(@org.jetbrains.annotations.NotNull java.io.File r6, long r7) {
            r5 = this;
            java.lang.String r0 = "directory"
            kotlin.jvm.internal.g0.p(r6, r0)
            okio.FileSystem r0 = okio.FileSystem.SYSTEM
            okio.Path$Companion r1 = okio.Path.Companion
            r2 = 1
            r3 = 0
            r4 = 0
            okio.Path r6 = okio.Path.Companion.get$default(r1, r6, r4, r2, r3)
            r5.<init>(r0, r6, r7)
            return
    }

    public Cache(@org.jetbrains.annotations.NotNull okio.FileSystem r8, @org.jetbrains.annotations.NotNull okio.Path r9, long r10) {
            r7 = this;
            java.lang.String r0 = "fileSystem"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "directory"
            kotlin.jvm.internal.g0.p(r9, r0)
            okhttp3.internal.concurrent.TaskRunner r6 = okhttp3.internal.concurrent.TaskRunner.INSTANCE
            r1 = r7
            r5 = r8
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3, r5, r6)
            return
    }

    public Cache(@org.jetbrains.annotations.NotNull okio.Path r10, long r11, @org.jetbrains.annotations.NotNull okio.FileSystem r13, @org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r14) {
            r9 = this;
            java.lang.String r0 = "directory"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "fileSystem"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.g0.p(r14, r0)
            r9.<init>()
            okhttp3.internal.cache.DiskLruCache r1 = new okhttp3.internal.cache.DiskLruCache
            r4 = 201105(0x31191, float:2.81808E-40)
            r5 = 2
            r3 = r10
            r6 = r11
            r2 = r13
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r8)
            r9.cache = r1
            return
    }

    private final void abortQuietly(okhttp3.internal.cache.DiskLruCache.Editor r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.abort()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String key(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r1) {
            okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
            java.lang.String r1 = r0.key(r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "directory", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_directory")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_directory, reason: not valid java name */
    public final java.io.File m51deprecated_directory() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            okio.Path r0 = r0.getDirectory()
            java.io.File r0 = r0.toFile()
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.close()
            return
    }

    public final void delete() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.delete()
            return
    }

    @kotlin.jvm.JvmName(name = "directory")
    @org.jetbrains.annotations.NotNull
    public final java.io.File directory() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            okio.Path r0 = r0.getDirectory()
            java.io.File r0 = r0.toFile()
            return r0
    }

    @kotlin.jvm.JvmName(name = "directoryPath")
    @org.jetbrains.annotations.NotNull
    public final okio.Path directoryPath() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            okio.Path r0 = r0.getDirectory()
            return r0
    }

    public final void evictAll() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.evictAll()
            return
    }

    @Override // java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.flush()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.Response get$okhttp(@org.jetbrains.annotations.NotNull okhttp3.Request r5) {
            r4 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.g0.p(r5, r0)
            okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
            okhttp3.HttpUrl r1 = r5.url()
            java.lang.String r0 = r0.key(r1)
            r1 = 0
            okhttp3.internal.cache.DiskLruCache r2 = r4.cache     // Catch: java.io.IOException -> L39
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r2.get(r0)     // Catch: java.io.IOException -> L39
            if (r0 != 0) goto L19
            return r1
        L19:
            okhttp3.Cache$Entry r2 = new okhttp3.Cache$Entry     // Catch: java.io.IOException -> L36
            r3 = 0
            okio.Source r3 = r0.getSource(r3)     // Catch: java.io.IOException -> L36
            r2.<init>(r3)     // Catch: java.io.IOException -> L36
            okhttp3.Response r0 = r2.response(r0)
            boolean r5 = r2.matches(r5, r0)
            if (r5 != 0) goto L35
            okhttp3.ResponseBody r5 = r0.body()
            okhttp3.internal._UtilCommonKt.closeQuietly(r5)
            return r1
        L35:
            return r0
        L36:
            okhttp3.internal._UtilCommonKt.closeQuietly(r0)
        L39:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.cache.DiskLruCache getCache$okhttp() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            return r0
    }

    public final int getWriteAbortCount$okhttp() {
            r1 = this;
            int r0 = r1.writeAbortCount
            return r0
    }

    public final int getWriteSuccessCount$okhttp() {
            r1 = this;
            int r0 = r1.writeSuccessCount
            return r0
    }

    public final synchronized int hitCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.hitCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final void initialize() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.initialize()
            return
    }

    public final boolean isClosed() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            boolean r0 = r0.isClosed()
            return r0
    }

    public final long maxSize() {
            r2 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r2.cache
            long r0 = r0.getMaxSize()
            return r0
    }

    public final synchronized int networkCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.networkCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.cache.CacheRequest put$okhttp(@org.jetbrains.annotations.NotNull okhttp3.Response r10) {
            r9 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.g0.p(r10, r0)
            okhttp3.Request r0 = r10.request()
            java.lang.String r0 = r0.method()
            okhttp3.Request r1 = r10.request()
            java.lang.String r1 = r1.method()
            boolean r1 = okhttp3.internal.http.HttpMethod.invalidatesCache(r1)
            r2 = 0
            if (r1 == 0) goto L24
            okhttp3.Request r10 = r10.request()     // Catch: java.io.IOException -> L23
            r9.remove$okhttp(r10)     // Catch: java.io.IOException -> L23
        L23:
            return r2
        L24:
            java.lang.String r1 = "GET"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 != 0) goto L2d
            return r2
        L2d:
            okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
            boolean r1 = r0.hasVaryAll(r10)
            if (r1 == 0) goto L36
            return r2
        L36:
            okhttp3.Cache$Entry r1 = new okhttp3.Cache$Entry
            r1.<init>(r10)
            okhttp3.internal.cache.DiskLruCache r3 = r9.cache     // Catch: java.io.IOException -> L5d
            okhttp3.Request r10 = r10.request()     // Catch: java.io.IOException -> L5d
            okhttp3.HttpUrl r10 = r10.url()     // Catch: java.io.IOException -> L5d
            java.lang.String r4 = r0.key(r10)     // Catch: java.io.IOException -> L5d
            r7 = 2
            r8 = 0
            r5 = 0
            okhttp3.internal.cache.DiskLruCache$Editor r10 = okhttp3.internal.cache.DiskLruCache.edit$default(r3, r4, r5, r7, r8)     // Catch: java.io.IOException -> L5d
            if (r10 != 0) goto L54
            return r2
        L54:
            r1.writeTo(r10)     // Catch: java.io.IOException -> L5e
            okhttp3.Cache$RealCacheRequest r0 = new okhttp3.Cache$RealCacheRequest     // Catch: java.io.IOException -> L5e
            r0.<init>(r9, r10)     // Catch: java.io.IOException -> L5e
            return r0
        L5d:
            r10 = r2
        L5e:
            r9.abortQuietly(r10)
            return r2
    }

    public final void remove$okhttp(@org.jetbrains.annotations.NotNull okhttp3.Request r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.g0.p(r3, r0)
            okhttp3.internal.cache.DiskLruCache r0 = r2.cache
            okhttp3.Cache$Companion r1 = okhttp3.Cache.Companion
            okhttp3.HttpUrl r3 = r3.url()
            java.lang.String r3 = r1.key(r3)
            r0.remove(r3)
            return
    }

    public final synchronized int requestCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.requestCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final void setWriteAbortCount$okhttp(int r1) {
            r0 = this;
            r0.writeAbortCount = r1
            return
    }

    public final void setWriteSuccessCount$okhttp(int r1) {
            r0 = this;
            r0.writeSuccessCount = r1
            return
    }

    public final long size() throws java.io.IOException {
            r2 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r2.cache
            long r0 = r0.size()
            return r0
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.hitCount     // Catch: java.lang.Throwable -> L9
            int r0 = r0 + 1
            r1.hitCount = r0     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public final synchronized void trackResponse$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.cache.CacheStrategy r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "cacheStrategy"
            kotlin.jvm.internal.g0.p(r2, r0)     // Catch: java.lang.Throwable -> L19
            int r0 = r1.requestCount     // Catch: java.lang.Throwable -> L19
            int r0 = r0 + 1
            r1.requestCount = r0     // Catch: java.lang.Throwable -> L19
            okhttp3.Request r0 = r2.getNetworkRequest()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            int r2 = r1.networkCount     // Catch: java.lang.Throwable -> L19
            int r2 = r2 + 1
            r1.networkCount = r2     // Catch: java.lang.Throwable -> L19
            goto L27
        L19:
            r2 = move-exception
            goto L29
        L1b:
            okhttp3.Response r2 = r2.getCacheResponse()     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L27
            int r2 = r1.hitCount     // Catch: java.lang.Throwable -> L19
            int r2 = r2 + 1
            r1.hitCount = r2     // Catch: java.lang.Throwable -> L19
        L27:
            monitor-exit(r1)
            return
        L29:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            throw r2
    }

    public final void update$okhttp(@org.jetbrains.annotations.NotNull okhttp3.Response r2, @org.jetbrains.annotations.NotNull okhttp3.Response r3) {
            r1 = this;
            java.lang.String r0 = "cached"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "network"
            kotlin.jvm.internal.g0.p(r3, r0)
            okhttp3.Cache$Entry r0 = new okhttp3.Cache$Entry
            r0.<init>(r3)
            okhttp3.ResponseBody r2 = r2.body()
            java.lang.String r3 = "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody"
            kotlin.jvm.internal.g0.n(r2, r3)
            okhttp3.Cache$CacheResponseBody r2 = (okhttp3.Cache.CacheResponseBody) r2
            okhttp3.internal.cache.DiskLruCache$Snapshot r2 = r2.getSnapshot()
            okhttp3.internal.cache.DiskLruCache$Editor r2 = r2.edit()     // Catch: java.io.IOException -> L2c
            if (r2 != 0) goto L25
            return
        L25:
            r0.writeTo(r2)     // Catch: java.io.IOException -> L2d
            r2.commit()     // Catch: java.io.IOException -> L2d
            return
        L2c:
            r2 = 0
        L2d:
            r1.abortQuietly(r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Iterator<java.lang.String> urls() throws java.io.IOException {
            r1 = this;
            okhttp3.Cache$urls$1 r0 = new okhttp3.Cache$urls$1
            r0.<init>(r1)
            return r0
    }

    public final synchronized int writeAbortCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.writeAbortCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized int writeSuccessCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.writeSuccessCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }
}
