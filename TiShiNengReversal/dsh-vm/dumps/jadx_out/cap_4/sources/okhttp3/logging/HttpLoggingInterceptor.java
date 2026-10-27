package okhttp3.logging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class HttpLoggingInterceptor implements okhttp3.Interceptor {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.logging.HttpLoggingInterceptor.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private volatile java.util.Set<java.lang.String> headersToRedact;

    @org.jetbrains.annotations.NotNull
    private volatile okhttp3.logging.HttpLoggingInterceptor.Level level;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.logging.HttpLoggingInterceptor.Logger logger;

    @org.jetbrains.annotations.NotNull
    private volatile java.util.Set<java.lang.String> queryParamsNameToRedact;

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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Level extends java.lang.Enum<okhttp3.logging.HttpLoggingInterceptor.Level> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ okhttp3.logging.HttpLoggingInterceptor.Level[] $VALUES = null;
        public static final okhttp3.logging.HttpLoggingInterceptor.Level BASIC = null;
        public static final okhttp3.logging.HttpLoggingInterceptor.Level BODY = null;
        public static final okhttp3.logging.HttpLoggingInterceptor.Level HEADERS = null;
        public static final okhttp3.logging.HttpLoggingInterceptor.Level NONE = null;

        private static final /* synthetic */ okhttp3.logging.HttpLoggingInterceptor.Level[] $values() {
                r0 = 4
                okhttp3.logging.HttpLoggingInterceptor$Level[] r0 = new okhttp3.logging.HttpLoggingInterceptor.Level[r0]
                okhttp3.logging.HttpLoggingInterceptor$Level r1 = okhttp3.logging.HttpLoggingInterceptor.Level.NONE
                r2 = 0
                r0[r2] = r1
                okhttp3.logging.HttpLoggingInterceptor$Level r1 = okhttp3.logging.HttpLoggingInterceptor.Level.BASIC
                r2 = 1
                r0[r2] = r1
                okhttp3.logging.HttpLoggingInterceptor$Level r1 = okhttp3.logging.HttpLoggingInterceptor.Level.HEADERS
                r2 = 2
                r0[r2] = r1
                okhttp3.logging.HttpLoggingInterceptor$Level r1 = okhttp3.logging.HttpLoggingInterceptor.Level.BODY
                r2 = 3
                r0[r2] = r1
                return r0
        }

        static {
                okhttp3.logging.HttpLoggingInterceptor$Level r0 = new okhttp3.logging.HttpLoggingInterceptor$Level
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                okhttp3.logging.HttpLoggingInterceptor.Level.NONE = r0
                okhttp3.logging.HttpLoggingInterceptor$Level r0 = new okhttp3.logging.HttpLoggingInterceptor$Level
                java.lang.String r1 = "BASIC"
                r2 = 1
                r0.<init>(r1, r2)
                okhttp3.logging.HttpLoggingInterceptor.Level.BASIC = r0
                okhttp3.logging.HttpLoggingInterceptor$Level r0 = new okhttp3.logging.HttpLoggingInterceptor$Level
                java.lang.String r1 = "HEADERS"
                r2 = 2
                r0.<init>(r1, r2)
                okhttp3.logging.HttpLoggingInterceptor.Level.HEADERS = r0
                okhttp3.logging.HttpLoggingInterceptor$Level r0 = new okhttp3.logging.HttpLoggingInterceptor$Level
                java.lang.String r1 = "BODY"
                r2 = 3
                r0.<init>(r1, r2)
                okhttp3.logging.HttpLoggingInterceptor.Level.BODY = r0
                okhttp3.logging.HttpLoggingInterceptor$Level[] r0 = $values()
                okhttp3.logging.HttpLoggingInterceptor.Level.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                okhttp3.logging.HttpLoggingInterceptor.Level.$ENTRIES = r0
                return
        }

        Level(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.a<okhttp3.logging.HttpLoggingInterceptor.Level> getEntries() {
                kotlin.enums.a r0 = okhttp3.logging.HttpLoggingInterceptor.Level.$ENTRIES
                return r0
        }

        public static okhttp3.logging.HttpLoggingInterceptor.Level valueOf(java.lang.String r1) {
                java.lang.Class<okhttp3.logging.HttpLoggingInterceptor$Level> r0 = okhttp3.logging.HttpLoggingInterceptor.Level.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                okhttp3.logging.HttpLoggingInterceptor$Level r1 = (okhttp3.logging.HttpLoggingInterceptor.Level) r1
                return r1
        }

        public static okhttp3.logging.HttpLoggingInterceptor.Level[] values() {
                okhttp3.logging.HttpLoggingInterceptor$Level[] r0 = okhttp3.logging.HttpLoggingInterceptor.Level.$VALUES
                java.lang.Object r0 = r0.clone()
                okhttp3.logging.HttpLoggingInterceptor$Level[] r0 = (okhttp3.logging.HttpLoggingInterceptor.Level[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Logger {

        @org.jetbrains.annotations.NotNull
        public static final okhttp3.logging.HttpLoggingInterceptor.Logger.Companion Companion = null;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public static final okhttp3.logging.HttpLoggingInterceptor.Logger DEFAULT = null;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class Companion {
            static final /* synthetic */ okhttp3.logging.HttpLoggingInterceptor.Logger.Companion $$INSTANCE = null;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            private static final class DefaultLogger implements okhttp3.logging.HttpLoggingInterceptor.Logger {
                public DefaultLogger() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(@org.jetbrains.annotations.NotNull java.lang.String r8) {
                        r7 = this;
                        java.lang.String r0 = "message"
                        kotlin.jvm.internal.g0.p(r8, r0)
                        okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
                        okhttp3.internal.platform.Platform r1 = r0.get()
                        r5 = 6
                        r6 = 0
                        r3 = 0
                        r4 = 0
                        r2 = r8
                        okhttp3.internal.platform.Platform.log$default(r1, r2, r3, r4, r5, r6)
                        return
                }
            }

            static {
                    okhttp3.logging.HttpLoggingInterceptor$Logger$Companion r0 = new okhttp3.logging.HttpLoggingInterceptor$Logger$Companion
                    r0.<init>()
                    okhttp3.logging.HttpLoggingInterceptor.Logger.Companion.$$INSTANCE = r0
                    return
            }

            private Companion() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        static {
                okhttp3.logging.HttpLoggingInterceptor$Logger$Companion r0 = okhttp3.logging.HttpLoggingInterceptor.Logger.Companion.$$INSTANCE
                okhttp3.logging.HttpLoggingInterceptor.Logger.Companion = r0
                okhttp3.logging.HttpLoggingInterceptor$Logger$Companion$DefaultLogger r0 = new okhttp3.logging.HttpLoggingInterceptor$Logger$Companion$DefaultLogger
                r0.<init>()
                okhttp3.logging.HttpLoggingInterceptor.Logger.DEFAULT = r0
                return
        }

        void log(@org.jetbrains.annotations.NotNull java.lang.String r1);
    }

    static {
            okhttp3.logging.HttpLoggingInterceptor$Companion r0 = new okhttp3.logging.HttpLoggingInterceptor$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.logging.HttpLoggingInterceptor.Companion = r0
            return
    }

    @kotlin.jvm.JvmOverloads
    public HttpLoggingInterceptor() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    @kotlin.jvm.JvmOverloads
    public HttpLoggingInterceptor(@org.jetbrains.annotations.NotNull okhttp3.logging.HttpLoggingInterceptor.Logger r2) {
            r1 = this;
            java.lang.String r0 = "logger"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.logger = r2
            java.util.Set r2 = kotlin.collections.u1.k()
            r1.headersToRedact = r2
            java.util.Set r2 = kotlin.collections.u1.k()
            r1.queryParamsNameToRedact = r2
            okhttp3.logging.HttpLoggingInterceptor$Level r2 = okhttp3.logging.HttpLoggingInterceptor.Level.NONE
            r1.level = r2
            return
    }

    public /* synthetic */ HttpLoggingInterceptor(okhttp3.logging.HttpLoggingInterceptor.Logger r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            okhttp3.logging.HttpLoggingInterceptor$Logger r1 = okhttp3.logging.HttpLoggingInterceptor.Logger.DEFAULT
        L6:
            r0.<init>(r1)
            return
    }

    private final boolean bodyHasUnknownEncoding(okhttp3.Headers r4) {
            r3 = this;
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r4 = r4.get(r0)
            r0 = 0
            if (r4 != 0) goto La
            return r0
        La:
            java.lang.String r1 = "identity"
            r2 = 1
            boolean r1 = kotlin.text.u.a2(r4, r1, r2)
            if (r1 != 0) goto L1c
            java.lang.String r1 = "gzip"
            boolean r4 = kotlin.text.u.a2(r4, r1, r2)
            if (r4 != 0) goto L1c
            return r2
        L1c:
            return r0
    }

    private final boolean bodyIsStreaming(okhttp3.Response r3) {
            r2 = this;
            okhttp3.ResponseBody r3 = r3.body()
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 == 0) goto L24
            java.lang.String r0 = r3.type()
            java.lang.String r1 = "text"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L24
            java.lang.String r3 = r3.subtype()
            java.lang.String r0 = "event-stream"
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r3 == 0) goto L24
            r3 = 1
            return r3
        L24:
            r3 = 0
            return r3
    }

    private final void logHeader(okhttp3.Headers r4, int r5) {
            r3 = this;
            java.util.Set<java.lang.String> r0 = r3.headersToRedact
            java.lang.String r1 = r4.name(r5)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = "██"
            goto L13
        Lf:
            java.lang.String r0 = r4.value(r5)
        L13:
            okhttp3.logging.HttpLoggingInterceptor$Logger r1 = r3.logger
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r4.name(r5)
            r2.append(r4)
            java.lang.String r4 = ": "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r1.log(r4)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to var", replaceWith = @kotlin.ReplaceWith(expression = "level", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_level")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_level, reason: not valid java name */
    public final okhttp3.logging.HttpLoggingInterceptor.Level m23deprecated_level() {
            r1 = this;
            okhttp3.logging.HttpLoggingInterceptor$Level r0 = r1.level
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.logging.HttpLoggingInterceptor.Level getLevel() {
            r1 = this;
            okhttp3.logging.HttpLoggingInterceptor$Level r0 = r1.level
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r23) throws java.io.IOException {
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = "chain"
            kotlin.jvm.internal.g0.p(r0, r2)
            okhttp3.logging.HttpLoggingInterceptor$Level r2 = r1.level
            okhttp3.Request r3 = r0.request()
            okhttp3.logging.HttpLoggingInterceptor$Level r4 = okhttp3.logging.HttpLoggingInterceptor.Level.NONE
            if (r2 != r4) goto L18
            okhttp3.Response r0 = r0.proceed(r3)
            return r0
        L18:
            okhttp3.logging.HttpLoggingInterceptor$Level r4 = okhttp3.logging.HttpLoggingInterceptor.Level.BODY
            if (r2 != r4) goto L1e
            r4 = 1
            goto L1f
        L1e:
            r4 = 0
        L1f:
            if (r4 != 0) goto L28
            okhttp3.logging.HttpLoggingInterceptor$Level r7 = okhttp3.logging.HttpLoggingInterceptor.Level.HEADERS
            if (r2 != r7) goto L26
            goto L28
        L26:
            r2 = 0
            goto L29
        L28:
            r2 = 1
        L29:
            okhttp3.RequestBody r7 = r3.body()
            okhttp3.Connection r8 = r0.connection()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "--> "
            r9.append(r10)
            java.lang.String r10 = r3.method()
            r9.append(r10)
            r10 = 32
            r9.append(r10)
            okhttp3.HttpUrl r11 = r3.url()
            java.lang.String r11 = r1.redactUrl$logging_interceptor(r11)
            r9.append(r11)
            java.lang.String r11 = ""
            if (r8 == 0) goto L6a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            okhttp3.Protocol r8 = r8.protocol()
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            goto L6b
        L6a:
            r8 = r11
        L6b:
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "-byte body)"
            java.lang.String r12 = " ("
            if (r2 != 0) goto L93
            if (r7 == 0) goto L93
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            r13.append(r12)
            long r14 = r7.contentLength()
            r13.append(r14)
            r13.append(r9)
            java.lang.String r8 = r13.toString()
        L93:
            okhttp3.logging.HttpLoggingInterceptor$Logger r13 = r1.logger
            r13.log(r8)
            java.lang.String r8 = "-byte body omitted)"
            java.lang.String r15 = "Content-Encoding"
            java.lang.String r5 = "gzip"
            r16 = -1
            if (r2 == 0) goto L282
            okhttp3.Headers r13 = r3.headers()
            if (r7 == 0) goto L101
            okhttp3.MediaType r14 = r7.contentType()
            if (r14 == 0) goto Lcf
            java.lang.String r10 = "Content-Type"
            java.lang.String r10 = r13.get(r10)
            if (r10 != 0) goto Lcf
            okhttp3.logging.HttpLoggingInterceptor$Logger r10 = r1.logger
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r18 = r2
            java.lang.String r2 = "Content-Type: "
            r6.append(r2)
            r6.append(r14)
            java.lang.String r2 = r6.toString()
            r10.log(r2)
            goto Ld1
        Lcf:
            r18 = r2
        Ld1:
            long r19 = r7.contentLength()
            int r2 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1))
            if (r2 == 0) goto Lfe
            java.lang.String r2 = "Content-Length"
            java.lang.String r2 = r13.get(r2)
            if (r2 != 0) goto Lfe
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.logger
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "Content-Length: "
            r6.append(r10)
            r10 = r3
            r14 = r4
            long r3 = r7.contentLength()
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r2.log(r3)
            goto L104
        Lfe:
            r10 = r3
            r14 = r4
            goto L104
        L101:
            r18 = r2
            goto Lfe
        L104:
            int r2 = r13.size()
            r3 = 0
        L109:
            if (r3 >= r2) goto L111
            r1.logHeader(r13, r3)
            int r3 = r3 + 1
            goto L109
        L111:
            java.lang.String r2 = "--> END "
            if (r14 == 0) goto L117
            if (r7 != 0) goto L11b
        L117:
            r19 = r14
            goto L269
        L11b:
            okhttp3.Headers r3 = r10.headers()
            boolean r3 = r1.bodyHasUnknownEncoding(r3)
            if (r3 == 0) goto L146
            okhttp3.logging.HttpLoggingInterceptor$Logger r3 = r1.logger
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = r10.method()
            r4.append(r2)
            java.lang.String r2 = " (encoded body omitted)"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.log(r2)
        L142:
            r19 = r14
            goto L287
        L146:
            boolean r3 = r7.isDuplex()
            if (r3 == 0) goto L16a
            okhttp3.logging.HttpLoggingInterceptor$Logger r3 = r1.logger
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = r10.method()
            r4.append(r2)
            java.lang.String r2 = " (duplex request body omitted)"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.log(r2)
            goto L142
        L16a:
            boolean r3 = r7.isOneShot()
            if (r3 == 0) goto L18e
            okhttp3.logging.HttpLoggingInterceptor$Logger r3 = r1.logger
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = r10.method()
            r4.append(r2)
            java.lang.String r2 = " (one-shot body omitted)"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.log(r2)
            goto L142
        L18e:
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            r7.writeTo(r3)
            java.lang.String r4 = r13.get(r15)
            r6 = 1
            boolean r4 = kotlin.text.u.a2(r5, r4, r6)
            if (r4 == 0) goto L1c3
            long r19 = r3.size()
            java.lang.Long r4 = java.lang.Long.valueOf(r19)
            okio.GzipSource r6 = new okio.GzipSource
            r6.<init>(r3)
            okio.Buffer r3 = new okio.Buffer     // Catch: java.lang.Throwable -> L1bb
            r3.<init>()     // Catch: java.lang.Throwable -> L1bb
            r3.writeAll(r6)     // Catch: java.lang.Throwable -> L1bb
            r13 = 0
            kotlin.io.b.a(r6, r13)
            goto L1c4
        L1bb:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L1be
        L1be:
            r0 = move-exception
            kotlin.io.b.a(r6, r2)
            throw r0
        L1c3:
            r4 = 0
        L1c4:
            okhttp3.MediaType r6 = r7.contentType()
            java.nio.charset.Charset r6 = okhttp3.internal.Internal.charsetOrUtf8(r6)
            okhttp3.logging.HttpLoggingInterceptor$Logger r13 = r1.logger
            r13.log(r11)
            r19 = r14
            r13 = 16
            boolean r20 = okhttp3.internal.IsProbablyUtf8Kt.isProbablyUtf8(r3, r13)
            if (r20 != 0) goto L204
            okhttp3.logging.HttpLoggingInterceptor$Logger r3 = r1.logger
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = r10.method()
            r4.append(r2)
            java.lang.String r2 = " (binary "
            r4.append(r2)
            long r6 = r7.contentLength()
            r4.append(r6)
            r4.append(r8)
            java.lang.String r2 = r4.toString()
            r3.log(r2)
            goto L287
        L204:
            if (r4 == 0) goto L23a
            okhttp3.logging.HttpLoggingInterceptor$Logger r6 = r1.logger
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            java.lang.String r2 = r10.method()
            r7.append(r2)
            r7.append(r12)
            long r2 = r3.size()
            r7.append(r2)
            java.lang.String r2 = "-byte, "
            r7.append(r2)
            long r2 = r4.longValue()
            r7.append(r2)
            java.lang.String r2 = "-gzipped-byte body)"
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            r6.log(r2)
            goto L287
        L23a:
            okhttp3.logging.HttpLoggingInterceptor$Logger r4 = r1.logger
            java.lang.String r3 = r3.readString(r6)
            r4.log(r3)
            okhttp3.logging.HttpLoggingInterceptor$Logger r3 = r1.logger
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = r10.method()
            r4.append(r2)
            r4.append(r12)
            long r6 = r7.contentLength()
            r4.append(r6)
            r4.append(r9)
            java.lang.String r2 = r4.toString()
            r3.log(r2)
            goto L287
        L269:
            okhttp3.logging.HttpLoggingInterceptor$Logger r3 = r1.logger
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = r10.method()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.log(r2)
            goto L287
        L282:
            r18 = r2
            r10 = r3
            r19 = r4
        L287:
            long r2 = java.lang.System.nanoTime()
            okhttp3.Response r0 = r0.proceed(r10)     // Catch: java.lang.Exception -> L492
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r6 = java.lang.System.nanoTime()
            long r6 = r6 - r2
            long r6 = r4.toMillis(r6)
            okhttp3.ResponseBody r4 = r0.body()
            kotlin.jvm.internal.g0.m(r4)
            long r9 = r4.contentLength()
            java.lang.String r13 = "-byte"
            int r14 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r14 == 0) goto L2bd
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r9)
            r14.append(r13)
            java.lang.String r14 = r14.toString()
        L2ba:
            r16 = r2
            goto L2c0
        L2bd:
            java.lang.String r14 = "unknown-length"
            goto L2ba
        L2c0:
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r23 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r20 = r9
            java.lang.String r9 = "<-- "
            r4.append(r9)
            int r9 = r0.code()
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.String r4 = r0.message()
            int r4 = r4.length()
            if (r4 <= 0) goto L306
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r9 = 32
            r4.append(r9)
            java.lang.String r10 = r0.message()
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            goto L308
        L306:
            r9 = 32
        L308:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            okhttp3.Request r9 = r0.request()
            okhttp3.HttpUrl r9 = r9.url()
            java.lang.String r9 = r1.redactUrl$logging_interceptor(r9)
            r4.append(r9)
            r4.append(r12)
            r4.append(r6)
            java.lang.String r6 = "ms"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.String r4 = ", "
            if (r18 != 0) goto L34c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r14)
            java.lang.String r7 = " body"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r3.append(r6)
        L34c:
            java.lang.String r6 = ")"
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r2.log(r3)
            if (r18 == 0) goto L491
            okhttp3.Headers r2 = r0.headers()
            int r3 = r2.size()
            r6 = 0
        L363:
            if (r6 >= r3) goto L36b
            r1.logHeader(r2, r6)
            int r6 = r6 + 1
            goto L363
        L36b:
            if (r19 == 0) goto L48a
            boolean r3 = okhttp3.internal.http.HttpHeaders.promisesBody(r0)
            if (r3 != 0) goto L375
            goto L48a
        L375:
            okhttp3.Headers r3 = r0.headers()
            boolean r3 = r1.bodyHasUnknownEncoding(r3)
            if (r3 == 0) goto L387
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.logger
            java.lang.String r3 = "<-- END HTTP (encoded body omitted)"
            r2.log(r3)
            return r0
        L387:
            boolean r3 = r1.bodyIsStreaming(r0)
            if (r3 == 0) goto L395
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.logger
            java.lang.String r3 = "<-- END HTTP (streaming)"
            r2.log(r3)
            return r0
        L395:
            okio.BufferedSource r3 = r23.source()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.request(r6)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r9 = java.lang.System.nanoTime()
            long r9 = r9 - r16
            long r6 = r6.toMillis(r9)
            okio.Buffer r3 = r3.getBuffer()
            java.lang.String r2 = r2.get(r15)
            r9 = 1
            boolean r2 = kotlin.text.u.a2(r5, r2, r9)
            if (r2 == 0) goto L3e3
            long r9 = r3.size()
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            okio.GzipSource r5 = new okio.GzipSource
            okio.Buffer r3 = r3.clone()
            r5.<init>(r3)
            okio.Buffer r3 = new okio.Buffer     // Catch: java.lang.Throwable -> L3db
            r3.<init>()     // Catch: java.lang.Throwable -> L3db
            r3.writeAll(r5)     // Catch: java.lang.Throwable -> L3db
            r9 = 0
            kotlin.io.b.a(r5, r9)
            r10 = r2
            goto L3e5
        L3db:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L3de
        L3de:
            r0 = move-exception
            kotlin.io.b.a(r5, r2)
            throw r0
        L3e3:
            r9 = 0
            r10 = r9
        L3e5:
            okhttp3.MediaType r2 = r23.contentType()
            java.nio.charset.Charset r2 = okhttp3.internal.Internal.charsetOrUtf8(r2)
            r14 = 16
            boolean r5 = okhttp3.internal.IsProbablyUtf8Kt.isProbablyUtf8(r3, r14)
            java.lang.String r9 = "<-- END HTTP ("
            if (r5 != 0) goto L420
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.logger
            r2.log(r11)
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.logger
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            r4.append(r6)
            java.lang.String r5 = "ms, binary "
            r4.append(r5)
            long r5 = r3.size()
            r4.append(r5)
            r4.append(r8)
            java.lang.String r3 = r4.toString()
            r2.log(r3)
            return r0
        L420:
            r14 = 0
            int r5 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r5 == 0) goto L438
            okhttp3.logging.HttpLoggingInterceptor$Logger r5 = r1.logger
            r5.log(r11)
            okhttp3.logging.HttpLoggingInterceptor$Logger r5 = r1.logger
            okio.Buffer r8 = r3.clone()
            java.lang.String r2 = r8.readString(r2)
            r5.log(r2)
        L438:
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.logger
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = "ms, "
            r8.append(r6)
            long r6 = r3.size()
            r8.append(r6)
            r8.append(r13)
            java.lang.String r3 = r8.toString()
            r5.append(r3)
            if (r10 == 0) goto L47d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            long r6 = r10.longValue()
            r3.append(r6)
            java.lang.String r4 = "-gzipped-byte"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5.append(r3)
        L47d:
            java.lang.String r3 = " body)"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.log(r3)
            return r0
        L48a:
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.logger
            java.lang.String r3 = "<-- END HTTP"
            r2.log(r3)
        L491:
            return r0
        L492:
            r0 = move-exception
            r16 = r2
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r16
            long r2 = r2.toMillis(r3)
            okhttp3.logging.HttpLoggingInterceptor$Logger r4 = r1.logger
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "<-- HTTP FAILED: "
            r6.append(r7)
            r6.append(r0)
            r7 = 46
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.append(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r9 = 32
            r6.append(r9)
            okhttp3.HttpUrl r7 = r10.url()
            java.lang.String r7 = r1.redactUrl$logging_interceptor(r7)
            r6.append(r7)
            r6.append(r12)
            r6.append(r2)
            java.lang.String r2 = "ms)"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.log(r2)
            throw r0
    }

    @kotlin.jvm.JvmName(name = "level")
    public final void level(@org.jetbrains.annotations.NotNull okhttp3.logging.HttpLoggingInterceptor.Level r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.level = r2
            return
    }

    public final void redactHeader(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            kotlin.jvm.internal.t0 r1 = kotlin.jvm.internal.t0.a
            java.util.Comparator r1 = kotlin.text.u.g2(r1)
            r0.<init>(r1)
            java.util.Set<java.lang.String> r1 = r2.headersToRedact
            kotlin.collections.f0.s0(r0, r1)
            r0.add(r3)
            r2.headersToRedact = r0
            return
    }

    public final void redactQueryParams(@org.jetbrains.annotations.NotNull java.lang.String... r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            kotlin.jvm.internal.t0 r1 = kotlin.jvm.internal.t0.a
            java.util.Comparator r1 = kotlin.text.u.g2(r1)
            r0.<init>(r1)
            java.util.Set<java.lang.String> r1 = r2.queryParamsNameToRedact
            kotlin.collections.f0.s0(r0, r1)
            kotlin.collections.f0.u0(r0, r3)
            r2.queryParamsNameToRedact = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String redactUrl$logging_interceptor(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r6) {
            r5 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Set<java.lang.String> r0 = r5.queryParamsNameToRedact
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L42
            int r0 = r6.querySize()
            if (r0 != 0) goto L14
            goto L42
        L14:
            okhttp3.HttpUrl$Builder r0 = r6.newBuilder()
            r1 = 0
            okhttp3.HttpUrl$Builder r0 = r0.query(r1)
            int r1 = r6.querySize()
            r2 = 0
        L22:
            if (r2 >= r1) goto L3d
            java.lang.String r3 = r6.queryParameterName(r2)
            java.util.Set<java.lang.String> r4 = r5.queryParamsNameToRedact
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L33
            java.lang.String r4 = "██"
            goto L37
        L33:
            java.lang.String r4 = r6.queryParameterValue(r2)
        L37:
            r0.addEncodedQueryParameter(r3, r4)
            int r2 = r2 + 1
            goto L22
        L3d:
            java.lang.String r6 = r0.toString()
            return r6
        L42:
            java.lang.String r6 = r6.toString()
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.logging.HttpLoggingInterceptor setLevel(@org.jetbrains.annotations.NotNull okhttp3.logging.HttpLoggingInterceptor.Level r2) {
            r1 = this;
            java.lang.String r0 = "level"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.level = r2
            return r1
    }
}
