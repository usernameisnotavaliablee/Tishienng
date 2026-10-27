package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n1761#2,3:382\n*S KotlinDebug\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody\n*L\n52#1:382,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class MultipartBody extends okhttp3.RequestBody {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.MediaType ALTERNATIVE = null;

    @org.jetbrains.annotations.NotNull
    private static final byte[] COLONSPACE = null;

    @org.jetbrains.annotations.NotNull
    private static final byte[] CRLF = null;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.MultipartBody.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final byte[] DASHDASH = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.MediaType DIGEST = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.MediaType FORM = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.MediaType MIXED = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.MediaType PARALLEL = null;

    @org.jetbrains.annotations.NotNull
    private final okio.ByteString boundaryByteString;
    private long contentLength;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.MediaType contentType;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<okhttp3.MultipartBody.Part> parts;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.MediaType type;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n1#2:382\n*E\n"})
    public static final class Builder {

        @org.jetbrains.annotations.NotNull
        private final okio.ByteString boundary;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<okhttp3.MultipartBody.Part> parts;

        @org.jetbrains.annotations.NotNull
        private okhttp3.MediaType type;

        @kotlin.jvm.JvmOverloads
        public Builder() {
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r0)
                return
        }

        @kotlin.jvm.JvmOverloads
        public Builder(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "boundary"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                okio.ByteString$Companion r0 = okio.ByteString.Companion
                okio.ByteString r2 = r0.encodeUtf8(r2)
                r1.boundary = r2
                okhttp3.MediaType r2 = okhttp3.MultipartBody.MIXED
                r1.type = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.parts = r2
                return
        }

        public /* synthetic */ Builder(java.lang.String r1, int r2, kotlin.jvm.internal.v r3) {
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L11
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "toString(...)"
                kotlin.jvm.internal.g0.o(r1, r2)
            L11:
                r0.<init>(r1)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.MultipartBody.Builder addFormDataPart(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r2 = r0.createFormData(r2, r3)
                r1.addPart(r2)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.MultipartBody.Builder addFormDataPart(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.NotNull okhttp3.RequestBody r4) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "body"
                kotlin.jvm.internal.g0.p(r4, r0)
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r2 = r0.createFormData(r2, r3, r4)
                r1.addPart(r2)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.MultipartBody.Builder addPart(@org.jetbrains.annotations.Nullable okhttp3.Headers r2, @org.jetbrains.annotations.NotNull okhttp3.RequestBody r3) {
                r1 = this;
                java.lang.String r0 = "body"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r2 = r0.create(r2, r3)
                r1.addPart(r2)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.MultipartBody.Builder addPart(@org.jetbrains.annotations.NotNull okhttp3.MultipartBody.Part r2) {
                r1 = this;
                java.lang.String r0 = "part"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.List<okhttp3.MultipartBody$Part> r0 = r1.parts
                java.util.Collection r0 = (java.util.Collection) r0
                r0.add(r2)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.MultipartBody.Builder addPart(@org.jetbrains.annotations.NotNull okhttp3.RequestBody r2) {
                r1 = this;
                java.lang.String r0 = "body"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r2 = r0.create(r2)
                r1.addPart(r2)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.MultipartBody build() {
                r4 = this;
                java.util.List<okhttp3.MultipartBody$Part> r0 = r4.parts
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L1a
                okhttp3.MultipartBody r0 = new okhttp3.MultipartBody
                okio.ByteString r1 = r4.boundary
                okhttp3.MediaType r2 = r4.type
                java.util.List<okhttp3.MultipartBody$Part> r3 = r4.parts
                java.util.List r3 = okhttp3.internal._UtilJvmKt.toImmutableList(r3)
                r0.<init>(r1, r2, r3)
                return r0
            L1a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Multipart body must have at least one part."
                r0.<init>(r1)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.MultipartBody.Builder setType(@org.jetbrains.annotations.NotNull okhttp3.MediaType r3) {
                r2 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = r3.type()
                java.lang.String r1 = "multipart"
                boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
                if (r0 == 0) goto L14
                r2.type = r3
                return r2
            L14:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "multipart != "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r0.<init>(r3)
                throw r0
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

        public final void appendQuotedString$okhttp(@org.jetbrains.annotations.NotNull java.lang.StringBuilder r6, @org.jetbrains.annotations.NotNull java.lang.String r7) {
                r5 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r7, r0)
                r0 = 34
                r6.append(r0)
                int r1 = r7.length()
                r2 = 0
            L14:
                if (r2 >= r1) goto L3c
                char r3 = r7.charAt(r2)
                r4 = 10
                if (r3 == r4) goto L34
                r4 = 13
                if (r3 == r4) goto L2e
                if (r3 == r0) goto L28
                r6.append(r3)
                goto L39
            L28:
                java.lang.String r3 = "%22"
                r6.append(r3)
                goto L39
            L2e:
                java.lang.String r3 = "%0D"
                r6.append(r3)
                goto L39
            L34:
                java.lang.String r3 = "%0A"
                r6.append(r3)
            L39:
                int r2 = r2 + 1
                goto L14
            L3c:
                r6.append(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Part {

        @org.jetbrains.annotations.NotNull
        public static final okhttp3.MultipartBody.Part.Companion Companion = null;

        @org.jetbrains.annotations.NotNull
        private final okhttp3.RequestBody body;

        @org.jetbrains.annotations.Nullable
        private final okhttp3.Headers headers;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Part$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n1#2:382\n*E\n"})
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

            @kotlin.jvm.JvmStatic
            @org.jetbrains.annotations.NotNull
            public final okhttp3.MultipartBody.Part create(@org.jetbrains.annotations.Nullable okhttp3.Headers r3, @org.jetbrains.annotations.NotNull okhttp3.RequestBody r4) {
                    r2 = this;
                    java.lang.String r0 = "body"
                    kotlin.jvm.internal.g0.p(r4, r0)
                    r0 = 0
                    if (r3 == 0) goto Lf
                    java.lang.String r1 = "Content-Type"
                    java.lang.String r1 = r3.get(r1)
                    goto L10
                Lf:
                    r1 = r0
                L10:
                    if (r1 != 0) goto L2c
                    if (r3 == 0) goto L1b
                    java.lang.String r1 = "Content-Length"
                    java.lang.String r1 = r3.get(r1)
                    goto L1c
                L1b:
                    r1 = r0
                L1c:
                    if (r1 != 0) goto L24
                    okhttp3.MultipartBody$Part r1 = new okhttp3.MultipartBody$Part
                    r1.<init>(r3, r4, r0)
                    return r1
                L24:
                    java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                    java.lang.String r4 = "Unexpected header: Content-Length"
                    r3.<init>(r4)
                    throw r3
                L2c:
                    java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                    java.lang.String r4 = "Unexpected header: Content-Type"
                    r3.<init>(r4)
                    throw r3
            }

            @kotlin.jvm.JvmStatic
            @org.jetbrains.annotations.NotNull
            public final okhttp3.MultipartBody.Part create(@org.jetbrains.annotations.NotNull okhttp3.RequestBody r2) {
                    r1 = this;
                    java.lang.String r0 = "body"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    r0 = 0
                    okhttp3.MultipartBody$Part r2 = r1.create(r0, r2)
                    return r2
            }

            @kotlin.jvm.JvmStatic
            @org.jetbrains.annotations.NotNull
            public final okhttp3.MultipartBody.Part createFormData(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5) {
                    r3 = this;
                    java.lang.String r0 = "name"
                    kotlin.jvm.internal.g0.p(r4, r0)
                    java.lang.String r0 = "value"
                    kotlin.jvm.internal.g0.p(r5, r0)
                    okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
                    r1 = 1
                    r2 = 0
                    okhttp3.RequestBody r5 = okhttp3.RequestBody.Companion.create$default(r0, r5, r2, r1, r2)
                    okhttp3.MultipartBody$Part r4 = r3.createFormData(r4, r2, r5)
                    return r4
            }

            @kotlin.jvm.JvmStatic
            @org.jetbrains.annotations.NotNull
            public final okhttp3.MultipartBody.Part createFormData(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.NotNull okhttp3.RequestBody r5) {
                    r2 = this;
                    java.lang.String r0 = "name"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    java.lang.String r0 = "body"
                    kotlin.jvm.internal.g0.p(r5, r0)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "form-data; name="
                    r0.append(r1)
                    okhttp3.MultipartBody$Companion r1 = okhttp3.MultipartBody.Companion
                    r1.appendQuotedString$okhttp(r0, r3)
                    if (r4 == 0) goto L23
                    java.lang.String r3 = "; filename="
                    r0.append(r3)
                    r1.appendQuotedString$okhttp(r0, r4)
                L23:
                    java.lang.String r3 = r0.toString()
                    okhttp3.Headers$Builder r4 = new okhttp3.Headers$Builder
                    r4.<init>()
                    java.lang.String r0 = "Content-Disposition"
                    okhttp3.Headers$Builder r3 = r4.addUnsafeNonAscii(r0, r3)
                    okhttp3.Headers r3 = r3.build()
                    okhttp3.MultipartBody$Part r3 = r2.create(r3, r5)
                    return r3
            }
        }

        static {
                okhttp3.MultipartBody$Part$Companion r0 = new okhttp3.MultipartBody$Part$Companion
                r1 = 0
                r0.<init>(r1)
                okhttp3.MultipartBody.Part.Companion = r0
                return
        }

        private Part(okhttp3.Headers r1, okhttp3.RequestBody r2) {
                r0 = this;
                r0.<init>()
                r0.headers = r1
                r0.body = r2
                return
        }

        public /* synthetic */ Part(okhttp3.Headers r1, okhttp3.RequestBody r2, kotlin.jvm.internal.v r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public static final okhttp3.MultipartBody.Part create(@org.jetbrains.annotations.Nullable okhttp3.Headers r1, @org.jetbrains.annotations.NotNull okhttp3.RequestBody r2) {
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r1 = r0.create(r1, r2)
                return r1
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public static final okhttp3.MultipartBody.Part create(@org.jetbrains.annotations.NotNull okhttp3.RequestBody r1) {
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r1 = r0.create(r1)
                return r1
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public static final okhttp3.MultipartBody.Part createFormData(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r1 = r0.createFormData(r1, r2)
                return r1
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public static final okhttp3.MultipartBody.Part createFormData(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.NotNull okhttp3.RequestBody r3) {
                okhttp3.MultipartBody$Part$Companion r0 = okhttp3.MultipartBody.Part.Companion
                okhttp3.MultipartBody$Part r1 = r0.createFormData(r1, r2, r3)
                return r1
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "body", imports = {}))
        @kotlin.jvm.JvmName(name = "-deprecated_body")
        @org.jetbrains.annotations.NotNull
        /* renamed from: -deprecated_body, reason: not valid java name */
        public final okhttp3.RequestBody m125deprecated_body() {
                r1 = this;
                okhttp3.RequestBody r0 = r1.body
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "headers", imports = {}))
        @kotlin.jvm.JvmName(name = "-deprecated_headers")
        @org.jetbrains.annotations.Nullable
        /* renamed from: -deprecated_headers, reason: not valid java name */
        public final okhttp3.Headers m126deprecated_headers() {
                r1 = this;
                okhttp3.Headers r0 = r1.headers
                return r0
        }

        @kotlin.jvm.JvmName(name = "body")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.RequestBody body() {
                r1 = this;
                okhttp3.RequestBody r0 = r1.body
                return r0
        }

        @kotlin.jvm.JvmName(name = "headers")
        @org.jetbrains.annotations.Nullable
        public final okhttp3.Headers headers() {
                r1 = this;
                okhttp3.Headers r0 = r1.headers
                return r0
        }
    }

    static {
            okhttp3.MultipartBody$Companion r0 = new okhttp3.MultipartBody$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.MultipartBody.Companion = r0
            okhttp3.MediaType$Companion r0 = okhttp3.MediaType.Companion
            java.lang.String r1 = "multipart/mixed"
            okhttp3.MediaType r1 = r0.get(r1)
            okhttp3.MultipartBody.MIXED = r1
            java.lang.String r1 = "multipart/alternative"
            okhttp3.MediaType r1 = r0.get(r1)
            okhttp3.MultipartBody.ALTERNATIVE = r1
            java.lang.String r1 = "multipart/digest"
            okhttp3.MediaType r1 = r0.get(r1)
            okhttp3.MultipartBody.DIGEST = r1
            java.lang.String r1 = "multipart/parallel"
            okhttp3.MediaType r1 = r0.get(r1)
            okhttp3.MultipartBody.PARALLEL = r1
            java.lang.String r1 = "multipart/form-data"
            okhttp3.MediaType r0 = r0.get(r1)
            okhttp3.MultipartBody.FORM = r0
            r0 = 2
            byte[] r1 = new byte[r0]
            r1 = {x004a: FILL_ARRAY_DATA , data: [58, 32} // fill-array
            okhttp3.MultipartBody.COLONSPACE = r1
            byte[] r1 = new byte[r0]
            r1 = {x0050: FILL_ARRAY_DATA , data: [13, 10} // fill-array
            okhttp3.MultipartBody.CRLF = r1
            byte[] r0 = new byte[r0]
            r0 = {x0056: FILL_ARRAY_DATA , data: [45, 45} // fill-array
            okhttp3.MultipartBody.DASHDASH = r0
            return
    }

    public MultipartBody(@org.jetbrains.annotations.NotNull okio.ByteString r2, @org.jetbrains.annotations.NotNull okhttp3.MediaType r3, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.MultipartBody.Part> r4) {
            r1 = this;
            java.lang.String r0 = "boundaryByteString"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "parts"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.boundaryByteString = r2
            r1.type = r3
            r1.parts = r4
            okhttp3.MediaType$Companion r2 = okhttp3.MediaType.Companion
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "; boundary="
            r4.append(r3)
            java.lang.String r3 = r1.boundary()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            okhttp3.MediaType r2 = r2.get(r3)
            r1.contentType = r2
            r2 = -1
            r1.contentLength = r2
            return
    }

    private final long writeOrCountBytes(okio.BufferedSink r13, boolean r14) throws java.io.IOException {
            r12 = this;
            if (r14 == 0) goto L9
            okio.Buffer r13 = new okio.Buffer
            r13.<init>()
            r0 = r13
            goto La
        L9:
            r0 = 0
        La:
            java.util.List<okhttp3.MultipartBody$Part> r1 = r12.parts
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = 0
        L14:
            if (r5 >= r1) goto L9e
            java.util.List<okhttp3.MultipartBody$Part> r6 = r12.parts
            java.lang.Object r6 = r6.get(r5)
            okhttp3.MultipartBody$Part r6 = (okhttp3.MultipartBody.Part) r6
            okhttp3.Headers r7 = r6.headers()
            okhttp3.RequestBody r6 = r6.body()
            kotlin.jvm.internal.g0.m(r13)
            byte[] r8 = okhttp3.MultipartBody.DASHDASH
            r13.write(r8)
            okio.ByteString r8 = r12.boundaryByteString
            r13.write(r8)
            byte[] r8 = okhttp3.MultipartBody.CRLF
            r13.write(r8)
            if (r7 == 0) goto L5f
            int r8 = r7.size()
            r9 = 0
        L3f:
            if (r9 >= r8) goto L5f
            java.lang.String r10 = r7.name(r9)
            okio.BufferedSink r10 = r13.writeUtf8(r10)
            byte[] r11 = okhttp3.MultipartBody.COLONSPACE
            okio.BufferedSink r10 = r10.write(r11)
            java.lang.String r11 = r7.value(r9)
            okio.BufferedSink r10 = r10.writeUtf8(r11)
            byte[] r11 = okhttp3.MultipartBody.CRLF
            r10.write(r11)
            int r9 = r9 + 1
            goto L3f
        L5f:
            okhttp3.MediaType r7 = r6.contentType()
            if (r7 == 0) goto L78
            java.lang.String r8 = "Content-Type: "
            okio.BufferedSink r8 = r13.writeUtf8(r8)
            java.lang.String r7 = r7.toString()
            okio.BufferedSink r7 = r8.writeUtf8(r7)
            byte[] r8 = okhttp3.MultipartBody.CRLF
            r7.write(r8)
        L78:
            long r7 = r6.contentLength()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L8b
            if (r14 == 0) goto L8b
            kotlin.jvm.internal.g0.m(r0)
            r0.clear()
            return r9
        L8b:
            byte[] r9 = okhttp3.MultipartBody.CRLF
            r13.write(r9)
            if (r14 == 0) goto L94
            long r3 = r3 + r7
            goto L97
        L94:
            r6.writeTo(r13)
        L97:
            r13.write(r9)
            int r5 = r5 + 1
            goto L14
        L9e:
            kotlin.jvm.internal.g0.m(r13)
            byte[] r1 = okhttp3.MultipartBody.DASHDASH
            r13.write(r1)
            okio.ByteString r2 = r12.boundaryByteString
            r13.write(r2)
            r13.write(r1)
            byte[] r1 = okhttp3.MultipartBody.CRLF
            r13.write(r1)
            if (r14 == 0) goto Lc0
            kotlin.jvm.internal.g0.m(r0)
            long r13 = r0.size()
            long r3 = r3 + r13
            r0.clear()
        Lc0:
            return r3
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "boundary", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_boundary")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_boundary, reason: not valid java name */
    public final java.lang.String m121deprecated_boundary() {
            r1 = this;
            java.lang.String r0 = r1.boundary()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "parts", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_parts")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_parts, reason: not valid java name */
    public final java.util.List<okhttp3.MultipartBody.Part> m122deprecated_parts() {
            r1 = this;
            java.util.List<okhttp3.MultipartBody$Part> r0 = r1.parts
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "size", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_size")
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m123deprecated_size() {
            r1 = this;
            int r0 = r1.size()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "type", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_type")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_type, reason: not valid java name */
    public final okhttp3.MediaType m124deprecated_type() {
            r1 = this;
            okhttp3.MediaType r0 = r1.type
            return r0
    }

    @kotlin.jvm.JvmName(name = "boundary")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String boundary() {
            r1 = this;
            okio.ByteString r0 = r1.boundaryByteString
            java.lang.String r0 = r0.utf8()
            return r0
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws java.io.IOException {
            r5 = this;
            long r0 = r5.contentLength
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L10
            r0 = 0
            r1 = 1
            long r0 = r5.writeOrCountBytes(r0, r1)
            r5.contentLength = r0
        L10:
            return r0
    }

    @Override // okhttp3.RequestBody
    @org.jetbrains.annotations.NotNull
    public okhttp3.MediaType contentType() {
            r1 = this;
            okhttp3.MediaType r0 = r1.contentType
            return r0
    }

    @Override // okhttp3.RequestBody
    public boolean isOneShot() {
            r3 = this;
            java.util.List<okhttp3.MultipartBody$Part> r0 = r3.parts
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L13
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L13
            return r2
        L13:
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            okhttp3.MultipartBody$Part r1 = (okhttp3.MultipartBody.Part) r1
            okhttp3.RequestBody r1 = r1.body()
            boolean r1 = r1.isOneShot()
            if (r1 == 0) goto L17
            r0 = 1
            return r0
        L2f:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.MultipartBody.Part part(int r2) {
            r1 = this;
            java.util.List<okhttp3.MultipartBody$Part> r0 = r1.parts
            java.lang.Object r2 = r0.get(r2)
            okhttp3.MultipartBody$Part r2 = (okhttp3.MultipartBody.Part) r2
            return r2
    }

    @kotlin.jvm.JvmName(name = "parts")
    @org.jetbrains.annotations.NotNull
    public final java.util.List<okhttp3.MultipartBody.Part> parts() {
            r1 = this;
            java.util.List<okhttp3.MultipartBody$Part> r0 = r1.parts
            return r0
    }

    @kotlin.jvm.JvmName(name = "size")
    public final int size() {
            r1 = this;
            java.util.List<okhttp3.MultipartBody$Part> r0 = r1.parts
            int r0 = r0.size()
            return r0
    }

    @kotlin.jvm.JvmName(name = "type")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.MediaType type() {
            r1 = this;
            okhttp3.MediaType r0 = r1.type
            return r0
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@org.jetbrains.annotations.NotNull okio.BufferedSink r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            r1.writeOrCountBytes(r2, r0)
            return
    }
}
