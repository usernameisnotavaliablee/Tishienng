package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FormBody extends okhttp3.RequestBody {

    @org.jetbrains.annotations.NotNull
    private static final okhttp3.MediaType CONTENT_TYPE = null;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.FormBody.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> encodedNames;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> encodedValues;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {

        @org.jetbrains.annotations.Nullable
        private final java.nio.charset.Charset charset;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.String> names;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.String> values;

        @kotlin.jvm.JvmOverloads
        public Builder() {
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r0)
                return
        }

        @kotlin.jvm.JvmOverloads
        public Builder(@org.jetbrains.annotations.Nullable java.nio.charset.Charset r1) {
                r0 = this;
                r0.<init>()
                r0.charset = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.names = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.values = r1
                return
        }

        public /* synthetic */ Builder(java.nio.charset.Charset r1, int r2, kotlin.jvm.internal.v r3) {
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L5
                r1 = 0
            L5:
                r0.<init>(r1)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.FormBody.Builder add(@org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull java.lang.String r14) {
                r12 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r13, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r14, r0)
                java.util.List<java.lang.String> r0 = r12.names
                java.util.Collection r0 = (java.util.Collection) r0
                java.nio.charset.Charset r9 = r12.charset
                r10 = 91
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " !\"#$&'()+,/:;<=>?@[\\]^`{|}~"
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r1 = r13
                java.lang.String r13 = okhttp3.internal.url._UrlKt.canonicalizeWithCharset$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r0.add(r13)
                java.util.List<java.lang.String> r13 = r12.values
                java.util.Collection r13 = (java.util.Collection) r13
                java.nio.charset.Charset r8 = r12.charset
                r9 = 91
                r10 = 0
                r1 = 0
                java.lang.String r3 = " !\"#$&'()+,/:;<=>?@[\\]^`{|}~"
                r4 = 0
                r0 = r14
                java.lang.String r14 = okhttp3.internal.url._UrlKt.canonicalizeWithCharset$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r13.add(r14)
                return r12
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.FormBody.Builder addEncoded(@org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull java.lang.String r14) {
                r12 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r13, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r14, r0)
                java.util.List<java.lang.String> r0 = r12.names
                java.util.Collection r0 = (java.util.Collection) r0
                java.nio.charset.Charset r9 = r12.charset
                r10 = 83
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " !\"#$&'()+,/:;<=>?@[\\]^`{|}~"
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r1 = r13
                java.lang.String r13 = okhttp3.internal.url._UrlKt.canonicalizeWithCharset$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r0.add(r13)
                java.util.List<java.lang.String> r13 = r12.values
                java.util.Collection r13 = (java.util.Collection) r13
                java.nio.charset.Charset r8 = r12.charset
                r9 = 83
                r10 = 0
                r1 = 0
                java.lang.String r3 = " !\"#$&'()+,/:;<=>?@[\\]^`{|}~"
                r4 = 1
                r5 = 0
                r6 = 1
                r7 = 0
                r0 = r14
                java.lang.String r14 = okhttp3.internal.url._UrlKt.canonicalizeWithCharset$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r13.add(r14)
                return r12
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.FormBody build() {
                r3 = this;
                okhttp3.FormBody r0 = new okhttp3.FormBody
                java.util.List<java.lang.String> r1 = r3.names
                java.util.List<java.lang.String> r2 = r3.values
                r0.<init>(r1, r2)
                return r0
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
    }

    static {
            okhttp3.FormBody$Companion r0 = new okhttp3.FormBody$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.FormBody.Companion = r0
            okhttp3.MediaType$Companion r0 = okhttp3.MediaType.Companion
            java.lang.String r1 = "application/x-www-form-urlencoded"
            okhttp3.MediaType r0 = r0.get(r1)
            okhttp3.FormBody.CONTENT_TYPE = r0
            return
    }

    public FormBody(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r2, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r3) {
            r1 = this;
            java.lang.String r0 = "encodedNames"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "encodedValues"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            java.util.List r2 = okhttp3.internal._UtilJvmKt.toImmutableList(r2)
            r1.encodedNames = r2
            java.util.List r2 = okhttp3.internal._UtilJvmKt.toImmutableList(r3)
            r1.encodedValues = r2
            return
    }

    private final long writeOrCountBytes(okio.BufferedSink r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L8
            okio.Buffer r4 = new okio.Buffer
            r4.<init>()
            goto Lf
        L8:
            kotlin.jvm.internal.g0.m(r4)
            okio.Buffer r4 = r4.getBuffer()
        Lf:
            java.util.List<java.lang.String> r0 = r3.encodedNames
            int r0 = r0.size()
            r1 = 0
        L16:
            if (r1 >= r0) goto L3d
            if (r1 <= 0) goto L1f
            r2 = 38
            r4.writeByte(r2)
        L1f:
            java.util.List<java.lang.String> r2 = r3.encodedNames
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r4.writeUtf8(r2)
            r2 = 61
            r4.writeByte(r2)
            java.util.List<java.lang.String> r2 = r3.encodedValues
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r4.writeUtf8(r2)
            int r1 = r1 + 1
            goto L16
        L3d:
            if (r5 == 0) goto L47
            long r0 = r4.size()
            r4.clear()
            return r0
        L47:
            r4 = 0
            return r4
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "size", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_size")
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m83deprecated_size() {
            r1 = this;
            int r0 = r1.size()
            return r0
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
            r2 = this;
            r0 = 0
            r1 = 1
            long r0 = r2.writeOrCountBytes(r0, r1)
            return r0
    }

    @Override // okhttp3.RequestBody
    @org.jetbrains.annotations.NotNull
    public okhttp3.MediaType contentType() {
            r1 = this;
            okhttp3.MediaType r0 = okhttp3.FormBody.CONTENT_TYPE
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String encodedName(int r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.encodedNames
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String encodedValue(int r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.encodedValues
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String name(int r7) {
            r6 = this;
            java.lang.String r0 = r6.encodedName(r7)
            r4 = 3
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 1
            java.lang.String r7 = okhttp3.internal.url._UrlKt.percentDecode$default(r0, r1, r2, r3, r4, r5)
            return r7
    }

    @kotlin.jvm.JvmName(name = "size")
    public final int size() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.encodedNames
            int r0 = r0.size()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String value(int r7) {
            r6 = this;
            java.lang.String r0 = r6.encodedValue(r7)
            r4 = 3
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 1
            java.lang.String r7 = okhttp3.internal.url._UrlKt.percentDecode$default(r0, r1, r2, r3, r4, r5)
            return r7
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
