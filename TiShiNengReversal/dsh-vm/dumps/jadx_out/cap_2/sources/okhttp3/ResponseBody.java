package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,343:1\n141#1,6:344\n147#1,5:373\n141#1,6:378\n147#1,5:407\n72#2:350\n58#2,22:351\n72#2:384\n58#2,22:385\n72#2:412\n58#2,22:413\n72#2:435\n58#2,22:436\n*S KotlinDebug\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n125#1:344,6\n125#1:373,5\n135#1:378,6\n135#1:407,5\n125#1:350\n125#1:351,22\n135#1:384\n135#1:385,22\n146#1:412\n146#1:413,22\n189#1:435\n189#1:436,22\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class ResponseBody implements java.io.Closeable {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ResponseBody.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ResponseBody EMPTY = null;

    @org.jetbrains.annotations.Nullable
    private java.io.Reader reader;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody$BomAwareReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1#2:344\n*E\n"})
    public static final class BomAwareReader extends java.io.Reader {

        @org.jetbrains.annotations.NotNull
        private final java.nio.charset.Charset charset;
        private boolean closed;

        @org.jetbrains.annotations.Nullable
        private java.io.Reader delegate;

        @org.jetbrains.annotations.NotNull
        private final okio.BufferedSource source;

        public BomAwareReader(@org.jetbrains.annotations.NotNull okio.BufferedSource r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
                r1 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "charset"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.<init>()
                r1.source = r2
                r1.charset = r3
                return
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                r0 = 1
                r1.closed = r0
                java.io.Reader r0 = r1.delegate
                if (r0 == 0) goto Lb
                r0.close()
                return
            Lb:
                okio.BufferedSource r0 = r1.source
                r0.close()
                return
        }

        @Override // java.io.Reader
        public int read(@org.jetbrains.annotations.NotNull char[] r5, int r6, int r7) throws java.io.IOException {
                r4 = this;
                java.lang.String r0 = "cbuf"
                kotlin.jvm.internal.g0.p(r5, r0)
                boolean r0 = r4.closed
                if (r0 != 0) goto L27
                java.io.Reader r0 = r4.delegate
                if (r0 != 0) goto L22
                java.io.InputStreamReader r0 = new java.io.InputStreamReader
                okio.BufferedSource r1 = r4.source
                java.io.InputStream r1 = r1.inputStream()
                okio.BufferedSource r2 = r4.source
                java.nio.charset.Charset r3 = r4.charset
                java.nio.charset.Charset r2 = okhttp3.internal._UtilJvmKt.readBomAsCharset(r2, r3)
                r0.<init>(r1, r2)
                r4.delegate = r0
            L22:
                int r5 = r0.read(r5, r6, r7)
                return r5
            L27:
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r6 = "Stream closed"
                r5.<init>(r6)
                throw r5
        }
    }

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

        public static /* synthetic */ okhttp3.ResponseBody create$default(okhttp3.ResponseBody.Companion r0, java.lang.String r1, okhttp3.MediaType r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okhttp3.ResponseBody r0 = r0.create(r1, r2)
                return r0
        }

        public static /* synthetic */ okhttp3.ResponseBody create$default(okhttp3.ResponseBody.Companion r0, okio.BufferedSource r1, okhttp3.MediaType r2, long r3, int r5, java.lang.Object r6) {
                r6 = r5 & 1
                if (r6 == 0) goto L5
                r2 = 0
            L5:
                r5 = r5 & 2
                if (r5 == 0) goto Lb
                r3 = -1
            Lb:
                okhttp3.ResponseBody r0 = r0.create(r1, r2, r3)
                return r0
        }

        public static /* synthetic */ okhttp3.ResponseBody create$default(okhttp3.ResponseBody.Companion r0, okio.ByteString r1, okhttp3.MediaType r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okhttp3.ResponseBody r0 = r0.create(r1, r2)
                return r0
        }

        public static /* synthetic */ okhttp3.ResponseBody create$default(okhttp3.ResponseBody.Companion r0, byte[] r1, okhttp3.MediaType r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okhttp3.ResponseBody r0 = r0.create(r1, r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "create")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.ResponseBody create(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.Nullable okhttp3.MediaType r4) {
                r2 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.Pair r4 = okhttp3.internal.Internal.chooseCharset(r4)
                java.lang.Object r0 = r4.component1()
                java.nio.charset.Charset r0 = (java.nio.charset.Charset) r0
                java.lang.Object r4 = r4.component2()
                okhttp3.MediaType r4 = (okhttp3.MediaType) r4
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                okio.Buffer r3 = r1.writeString(r3, r0)
                long r0 = r3.size()
                okhttp3.ResponseBody r3 = r2.create(r3, r4, r0)
                return r3
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okhttp3.ResponseBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r2, long r3, @org.jetbrains.annotations.NotNull okio.BufferedSource r5) {
                r1 = this;
                java.lang.String r0 = "content"
                kotlin.jvm.internal.g0.p(r5, r0)
                okhttp3.ResponseBody r2 = r1.create(r5, r2, r3)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okhttp3.ResponseBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "content"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.ResponseBody r2 = r1.create(r3, r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okhttp3.ResponseBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r2, @org.jetbrains.annotations.NotNull okio.ByteString r3) {
                r1 = this;
                java.lang.String r0 = "content"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.ResponseBody r2 = r1.create(r3, r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okhttp3.ResponseBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r2, @org.jetbrains.annotations.NotNull byte[] r3) {
                r1 = this;
                java.lang.String r0 = "content"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.ResponseBody r2 = r1.create(r3, r2)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "create")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.ResponseBody create(@org.jetbrains.annotations.NotNull okio.BufferedSource r2, @org.jetbrains.annotations.Nullable okhttp3.MediaType r3, long r4) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.ResponseBody$Companion$asResponseBody$1 r0 = new okhttp3.ResponseBody$Companion$asResponseBody$1
                r0.<init>(r3, r4, r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "create")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.ResponseBody create(@org.jetbrains.annotations.NotNull okio.ByteString r4, @org.jetbrains.annotations.Nullable okhttp3.MediaType r5) {
                r3 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r4, r0)
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                okio.Buffer r0 = r0.write(r4)
                int r4 = r4.size()
                long r1 = (long) r4
                okhttp3.ResponseBody r4 = r3.create(r0, r5, r1)
                return r4
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "create")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.ResponseBody create(@org.jetbrains.annotations.NotNull byte[] r4, @org.jetbrains.annotations.Nullable okhttp3.MediaType r5) {
                r3 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r4, r0)
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                okio.Buffer r0 = r0.write(r4)
                int r4 = r4.length
                long r1 = (long) r4
                okhttp3.ResponseBody r4 = r3.create(r0, r5, r1)
                return r4
        }
    }

    static {
            okhttp3.ResponseBody$Companion r0 = new okhttp3.ResponseBody$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.ResponseBody.Companion = r0
            okio.ByteString r2 = okio.ByteString.EMPTY
            r3 = 1
            okhttp3.ResponseBody r0 = okhttp3.ResponseBody.Companion.create$default(r0, r2, r1, r3, r1)
            okhttp3.ResponseBody.EMPTY = r0
            return
    }

    public ResponseBody() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.nio.charset.Charset charset() {
            r1 = this;
            okhttp3.MediaType r0 = r1.contentType()
            java.nio.charset.Charset r0 = okhttp3.internal.Internal.charsetOrUtf8(r0)
            return r0
    }

    private final <T> T consumeSource(okhttp3.ResponseBody r7, kotlin.jvm.functions.Function1<? super okio.BufferedSource, ? extends T> r8, kotlin.jvm.functions.Function1<? super T, java.lang.Integer> r9) {
            r6 = this;
            long r0 = r7.contentLength()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L75
            okio.BufferedSource r7 = r7.source()
            r2 = 0
            r3 = 1
            java.lang.Object r8 = r8.invoke(r7)     // Catch: java.lang.Throwable -> L26
            kotlin.jvm.internal.d0.d(r3)
            if (r7 == 0) goto L1f
            r7.close()     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
            r2 = move-exception
        L1f:
            kotlin.jvm.internal.d0.c(r3)
            r5 = r2
            r2 = r8
            r8 = r5
            goto L37
        L26:
            r8 = move-exception
            kotlin.jvm.internal.d0.d(r3)
            if (r7 == 0) goto L34
            r7.close()     // Catch: java.lang.Throwable -> L30
            goto L34
        L30:
            r7 = move-exception
            kotlin.l.a(r8, r7)
        L34:
            kotlin.jvm.internal.d0.c(r3)
        L37:
            if (r8 != 0) goto L74
            java.lang.Object r7 = r9.invoke(r2)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r8 = -1
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 == 0) goto L73
            long r8 = (long) r7
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 != 0) goto L4f
            goto L73
        L4f:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "Content-Length ("
            r9.append(r2)
            r9.append(r0)
            java.lang.String r0 = ") and stream length ("
            r9.append(r0)
            r9.append(r7)
            java.lang.String r7 = ") disagree"
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.<init>(r7)
            throw r8
        L73:
            return r2
        L74:
            throw r8
        L75:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Cannot buffer entire body for content length: "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "create")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ResponseBody create(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable okhttp3.MediaType r2) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ResponseBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r1, long r2, @org.jetbrains.annotations.NotNull okio.BufferedSource r4) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2, r4)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ResponseBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ResponseBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r1, @org.jetbrains.annotations.NotNull okio.ByteString r2) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ResponseBody create(@org.jetbrains.annotations.Nullable okhttp3.MediaType r1, @org.jetbrains.annotations.NotNull byte[] r2) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "create")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ResponseBody create(@org.jetbrains.annotations.NotNull okio.BufferedSource r1, @org.jetbrains.annotations.Nullable okhttp3.MediaType r2, long r3) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2, r3)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "create")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ResponseBody create(@org.jetbrains.annotations.NotNull okio.ByteString r1, @org.jetbrains.annotations.Nullable okhttp3.MediaType r2) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "create")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ResponseBody create(@org.jetbrains.annotations.NotNull byte[] r1, @org.jetbrains.annotations.Nullable okhttp3.MediaType r2) {
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r1 = r0.create(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.io.InputStream byteStream() {
            r1 = this;
            okio.BufferedSource r0 = r1.source()
            java.io.InputStream r0 = r0.inputStream()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString byteString() throws java.io.IOException {
            r8 = this;
            long r0 = r8.contentLength()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L62
            okio.BufferedSource r2 = r8.source()
            r3 = 0
            okio.ByteString r4 = r2.readByteString()     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L1b
            r2.close()     // Catch: java.lang.Throwable -> L1a
            goto L1b
        L1a:
            r3 = move-exception
        L1b:
            r7 = r4
            r4 = r3
            r3 = r7
            goto L2a
        L1f:
            r4 = move-exception
            if (r2 == 0) goto L2a
            r2.close()     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r2 = move-exception
            kotlin.l.a(r4, r2)
        L2a:
            if (r4 != 0) goto L61
            int r2 = r3.size()
            r4 = -1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L60
            long r4 = (long) r2
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L3c
            goto L60
        L3c:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L60:
            return r3
        L61:
            throw r4
        L62:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public final byte[] bytes() throws java.io.IOException {
            r8 = this;
            long r0 = r8.contentLength()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L5f
            okio.BufferedSource r2 = r8.source()
            r3 = 0
            byte[] r4 = r2.readByteArray()     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L1b
            r2.close()     // Catch: java.lang.Throwable -> L1a
            goto L1b
        L1a:
            r3 = move-exception
        L1b:
            r7 = r4
            r4 = r3
            r3 = r7
            goto L2a
        L1f:
            r4 = move-exception
            if (r2 == 0) goto L2a
            r2.close()     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r2 = move-exception
            kotlin.l.a(r4, r2)
        L2a:
            if (r4 != 0) goto L5e
            int r2 = r3.length
            r4 = -1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L5d
            long r4 = (long) r2
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L39
            goto L5d
        L39:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L5d:
            return r3
        L5e:
            throw r4
        L5f:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.io.Reader charStream() {
            r3 = this;
            java.io.Reader r0 = r3.reader
            if (r0 != 0) goto L13
            okhttp3.ResponseBody$BomAwareReader r0 = new okhttp3.ResponseBody$BomAwareReader
            okio.BufferedSource r1 = r3.source()
            java.nio.charset.Charset r2 = r3.charset()
            r0.<init>(r1, r2)
            r3.reader = r0
        L13:
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            okio.BufferedSource r0 = r1.source()
            okhttp3.internal._UtilCommonKt.closeQuietly(r0)
            return
    }

    public abstract long contentLength();

    @org.jetbrains.annotations.Nullable
    public abstract okhttp3.MediaType contentType();

    @org.jetbrains.annotations.NotNull
    public abstract okio.BufferedSource source();

    @org.jetbrains.annotations.NotNull
    public final java.lang.String string() throws java.io.IOException {
            r4 = this;
            okio.BufferedSource r0 = r4.source()
            r1 = 0
            java.nio.charset.Charset r2 = r4.charset()     // Catch: java.lang.Throwable -> L1c
            java.nio.charset.Charset r2 = okhttp3.internal._UtilJvmKt.readBomAsCharset(r0, r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = r0.readString(r2)     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L18
            r0.close()     // Catch: java.lang.Throwable -> L17
            goto L18
        L17:
            r1 = move-exception
        L18:
            r3 = r2
            r2 = r1
            r1 = r3
            goto L27
        L1c:
            r2 = move-exception
            if (r0 == 0) goto L27
            r0.close()     // Catch: java.lang.Throwable -> L23
            goto L27
        L23:
            r0 = move-exception
            kotlin.l.a(r2, r0)
        L27:
            if (r2 != 0) goto L2a
            return r1
        L2a:
            throw r2
    }
}
