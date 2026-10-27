package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class MediaType {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.MediaType.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.text.Regex PARAMETER = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String QUOTED = "\"([^\"]*)\"";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";

    @org.jetbrains.annotations.NotNull
    private static final kotlin.text.Regex TYPE_SUBTYPE = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String mediaType;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String[] parameterNamesAndValues;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String subtype;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String type;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMediaType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,183:1\n37#2,2:184\n*S KotlinDebug\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n*L\n145#1:184,2\n*E\n"})
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

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        @kotlin.jvm.JvmName(name = "-deprecated_get")
        @org.jetbrains.annotations.NotNull
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.MediaType m119deprecated_get(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "mediaType"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.MediaType r2 = r1.get(r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        @kotlin.jvm.JvmName(name = "-deprecated_parse")
        @org.jetbrains.annotations.Nullable
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final okhttp3.MediaType m120deprecated_parse(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "mediaType"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.MediaType r2 = r1.parse(r2)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "get")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.MediaType get(@org.jetbrains.annotations.NotNull java.lang.String r15) {
                r14 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r15, r0)
                kotlin.text.Regex r0 = okhttp3.MediaType.access$getTYPE_SUBTYPE$cp()
                r1 = 0
                kotlin.text.p r0 = r0.matchAt(r15, r1)
                r2 = 34
                if (r0 == 0) goto L104
                java.util.List r3 = r0.c()
                r4 = 1
                java.lang.Object r3 = r3.get(r4)
                java.lang.String r3 = (java.lang.String) r3
                java.util.Locale r5 = java.util.Locale.ROOT
                java.lang.String r3 = r3.toLowerCase(r5)
                java.lang.String r6 = "toLowerCase(...)"
                kotlin.jvm.internal.g0.o(r3, r6)
                java.util.List r7 = r0.c()
                r8 = 2
                java.lang.Object r7 = r7.get(r8)
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r5 = r7.toLowerCase(r5)
                kotlin.jvm.internal.g0.o(r5, r6)
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                kotlin.ranges.m r0 = r0.d()
                int r0 = r0.f()
            L47:
                int r0 = r0 + r4
                int r7 = r15.length()
                if (r0 >= r7) goto Lf6
                kotlin.text.Regex r7 = okhttp3.MediaType.access$getPARAMETER$cp()
                kotlin.text.p r7 = r7.matchAt(r15, r0)
                java.lang.String r9 = "substring(...)"
                if (r7 == 0) goto Lc9
                kotlin.text.n r0 = r7.b()
                kotlin.text.m r0 = r0.get(r4)
                r10 = 0
                if (r0 == 0) goto L6a
                java.lang.String r0 = r0.f()
                goto L6b
            L6a:
                r0 = r10
            L6b:
                if (r0 != 0) goto L76
                kotlin.ranges.m r0 = r7.d()
                int r0 = r0.f()
                goto L47
            L76:
                kotlin.text.n r11 = r7.b()
                kotlin.text.m r11 = r11.get(r8)
                if (r11 == 0) goto L85
                java.lang.String r11 = r11.f()
                goto L86
            L85:
                r11 = r10
            L86:
                if (r11 != 0) goto L99
                kotlin.text.n r9 = r7.b()
                r10 = 3
                kotlin.text.m r9 = r9.get(r10)
                kotlin.jvm.internal.g0.m(r9)
                java.lang.String r11 = r9.f()
                goto Lb9
            L99:
                r12 = 39
                boolean r13 = kotlin.text.u.y5(r11, r12, r1, r8, r10)
                if (r13 == 0) goto Lb9
                boolean r10 = kotlin.text.u.q3(r11, r12, r1, r8, r10)
                if (r10 == 0) goto Lb9
                int r10 = r11.length()
                if (r10 <= r8) goto Lb9
                int r10 = r11.length()
                int r10 = r10 - r4
                java.lang.String r11 = r11.substring(r4, r10)
                kotlin.jvm.internal.g0.o(r11, r9)
            Lb9:
                r6.add(r0)
                r6.add(r11)
                kotlin.ranges.m r0 = r7.d()
                int r0 = r0.f()
                goto L47
            Lc9:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Parameter is not formatted correctly: \""
                r1.append(r3)
                java.lang.String r0 = r15.substring(r0)
                kotlin.jvm.internal.g0.o(r0, r9)
                r1.append(r0)
                java.lang.String r0 = "\" for: \""
                r1.append(r0)
                r1.append(r15)
                r1.append(r2)
                java.lang.String r15 = r1.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r15 = r15.toString()
                r0.<init>(r15)
                throw r0
            Lf6:
                okhttp3.MediaType r0 = new okhttp3.MediaType
                java.lang.String[] r1 = new java.lang.String[r1]
                java.lang.Object[] r1 = r6.toArray(r1)
                java.lang.String[] r1 = (java.lang.String[]) r1
                r0.<init>(r15, r3, r5, r1)
                return r0
            L104:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "No subtype found for: \""
                r1.append(r3)
                r1.append(r15)
                r1.append(r2)
                java.lang.String r15 = r1.toString()
                r0.<init>(r15)
                throw r0
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "parse")
        @org.jetbrains.annotations.Nullable
        public final okhttp3.MediaType parse(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.MediaType r2 = r1.get(r2)     // Catch: java.lang.IllegalArgumentException -> La
                return r2
            La:
                r2 = 0
                return r2
        }
    }

    static {
            okhttp3.MediaType$Companion r0 = new okhttp3.MediaType$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.MediaType.Companion = r0
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)"
            r0.<init>(r1)
            okhttp3.MediaType.TYPE_SUBTYPE = r0
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = ";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?"
            r0.<init>(r1)
            okhttp3.MediaType.PARAMETER = r0
            return
    }

    public MediaType(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String[] r5) {
            r1 = this;
            java.lang.String r0 = "mediaType"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "subtype"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "parameterNamesAndValues"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.mediaType = r2
            r1.type = r3
            r1.subtype = r4
            r1.parameterNamesAndValues = r5
            return
    }

    public static final /* synthetic */ kotlin.text.Regex access$getPARAMETER$cp() {
            kotlin.text.Regex r0 = okhttp3.MediaType.PARAMETER
            return r0
    }

    public static final /* synthetic */ kotlin.text.Regex access$getTYPE_SUBTYPE$cp() {
            kotlin.text.Regex r0 = okhttp3.MediaType.TYPE_SUBTYPE
            return r0
    }

    public static /* synthetic */ java.nio.charset.Charset charset$default(okhttp3.MediaType r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.nio.charset.Charset r0 = r0.charset(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.MediaType get(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            okhttp3.MediaType$Companion r0 = okhttp3.MediaType.Companion
            okhttp3.MediaType r1 = r0.get(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "parse")
    @org.jetbrains.annotations.Nullable
    public static final okhttp3.MediaType parse(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            okhttp3.MediaType$Companion r0 = okhttp3.MediaType.Companion
            okhttp3.MediaType r1 = r0.parse(r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "subtype", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_subtype")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_subtype, reason: not valid java name */
    public final java.lang.String m117deprecated_subtype() {
            r1 = this;
            java.lang.String r0 = r1.subtype
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "type", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_type")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_type, reason: not valid java name */
    public final java.lang.String m118deprecated_type() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.Nullable
    public final java.nio.charset.Charset charset() {
            r2 = this;
            r0 = 0
            r1 = 1
            java.nio.charset.Charset r0 = charset$default(r2, r0, r1, r0)
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.Nullable
    public final java.nio.charset.Charset charset(@org.jetbrains.annotations.Nullable java.nio.charset.Charset r2) {
            r1 = this;
            java.lang.String r0 = "charset"
            java.lang.String r0 = r1.parameter(r0)
            if (r0 != 0) goto L9
            return r2
        L9:
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> Ld
        Ld:
            return r2
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okhttp3.MediaType
            if (r0 == 0) goto L12
            okhttp3.MediaType r2 = (okhttp3.MediaType) r2
            java.lang.String r2 = r2.mediaType
            java.lang.String r0 = r1.mediaType
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMediaType$okhttp() {
            r1 = this;
            java.lang.String r0 = r1.mediaType
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.mediaType
            int r0 = r0.hashCode()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String parameter(@org.jetbrains.annotations.NotNull java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String[] r0 = r4.parameterNamesAndValues
            int r0 = r0.length
            int r0 = r0 + (-1)
            r1 = 2
            r2 = 0
            int r0 = kotlin.internal.c.c(r2, r0, r1)
            if (r0 < 0) goto L28
        L12:
            java.lang.String[] r1 = r4.parameterNamesAndValues
            r1 = r1[r2]
            r3 = 1
            boolean r1 = kotlin.text.u.a2(r1, r5, r3)
            if (r1 == 0) goto L23
            java.lang.String[] r5 = r4.parameterNamesAndValues
            int r2 = r2 + r3
            r5 = r5[r2]
            return r5
        L23:
            if (r2 == r0) goto L28
            int r2 = r2 + 2
            goto L12
        L28:
            r5 = 0
            return r5
    }

    @kotlin.jvm.JvmName(name = "subtype")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String subtype() {
            r1 = this;
            java.lang.String r0 = r1.subtype
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.mediaType
            return r0
    }

    @kotlin.jvm.JvmName(name = "type")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String type() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }
}
