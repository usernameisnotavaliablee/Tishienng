package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHttpUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl\n+ 2 -UtilJvm.kt\nokhttp3/internal/_UtilJvmKt\n*L\n1#1,1810:1\n246#2:1811\n242#2:1812\n*S KotlinDebug\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl\n*L\n624#1:1811\n648#1:1812\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class HttpUrl {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.HttpUrl.Companion Companion = null;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String fragment;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String host;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String password;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> pathSegments;
    private final int port;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> queryNamesAndValues;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String scheme;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String url;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String username;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHttpUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1810:1\n1#2:1811\n1563#3:1812\n1634#3,3:1813\n1563#3:1816\n1634#3,3:1817\n*S KotlinDebug\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n*L\n1265#1:1812\n1265#1:1813,3\n1266#1:1816\n1266#1:1817,3\n*E\n"})
    public static final class Builder {

        @org.jetbrains.annotations.Nullable
        private java.lang.String encodedFragment;

        @org.jetbrains.annotations.NotNull
        private java.lang.String encodedPassword;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.String> encodedPathSegments;

        @org.jetbrains.annotations.Nullable
        private java.util.List<java.lang.String> encodedQueryNamesAndValues;

        @org.jetbrains.annotations.NotNull
        private java.lang.String encodedUsername;

        @org.jetbrains.annotations.Nullable
        private java.lang.String host;
        private int port;

        @org.jetbrains.annotations.Nullable
        private java.lang.String scheme;

        public Builder() {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = ""
                r2.encodedUsername = r0
                r2.encodedPassword = r0
                r1 = -1
                r2.port = r1
                java.lang.String[] r0 = new java.lang.String[]{r0}
                java.util.List r0 = kotlin.collections.f0.U(r0)
                r2.encodedPathSegments = r0
                return
        }

        private final okhttp3.HttpUrl.Builder addPathSegments(java.lang.String r8, boolean r9) {
                r7 = this;
                r0 = 0
                r3 = 0
            L2:
                java.lang.String r1 = "/\\"
                int r2 = r8.length()
                int r4 = okhttp3.internal._UtilCommonKt.delimiterOffset(r8, r1, r3, r2)
                int r1 = r8.length()
                if (r4 >= r1) goto L18
                r1 = 1
                r5 = 1
            L14:
                r1 = r7
                r2 = r8
                r6 = r9
                goto L1a
            L18:
                r5 = 0
                goto L14
            L1a:
                r1.push(r2, r3, r4, r5, r6)
                int r3 = r4 + 1
                int r8 = r2.length()
                if (r3 <= r8) goto L26
                return r1
            L26:
                r8 = r2
                r9 = r6
                goto L2
        }

        private final int effectivePort() {
                r2 = this;
                int r0 = r2.port
                r1 = -1
                if (r0 == r1) goto L6
                return r0
            L6:
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                java.lang.String r1 = r2.scheme
                kotlin.jvm.internal.g0.m(r1)
                int r0 = r0.defaultPort(r1)
                return r0
        }

        private final boolean isDot(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "."
                boolean r0 = kotlin.jvm.internal.g0.g(r3, r0)
                r1 = 1
                if (r0 != 0) goto L14
                java.lang.String r0 = "%2e"
                boolean r3 = kotlin.text.u.a2(r3, r0, r1)
                if (r3 == 0) goto L12
                goto L14
            L12:
                r3 = 0
                return r3
            L14:
                return r1
        }

        private final boolean isDotDot(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = ".."
                boolean r0 = kotlin.jvm.internal.g0.g(r3, r0)
                r1 = 1
                if (r0 != 0) goto L24
                java.lang.String r0 = "%2e."
                boolean r0 = kotlin.text.u.a2(r3, r0, r1)
                if (r0 != 0) goto L24
                java.lang.String r0 = ".%2e"
                boolean r0 = kotlin.text.u.a2(r3, r0, r1)
                if (r0 != 0) goto L24
                java.lang.String r0 = "%2e%2e"
                boolean r3 = kotlin.text.u.a2(r3, r0, r1)
                if (r3 == 0) goto L22
                goto L24
            L22:
                r3 = 0
                return r3
            L24:
                return r1
        }

        private final int parsePort(java.lang.String r12, int r13, int r14) {
                r11 = this;
                r0 = -1
                java.lang.String r4 = ""
                r9 = 120(0x78, float:1.68E-43)
                r10 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r1 = r12
                r2 = r13
                r3 = r14
                java.lang.String r12 = okhttp3.internal.url._UrlKt.canonicalize$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.NumberFormatException -> L1d
                int r12 = java.lang.Integer.parseInt(r12)     // Catch: java.lang.NumberFormatException -> L1d
                r13 = 1
                if (r13 > r12) goto L1d
                r13 = 65536(0x10000, float:9.1835E-41)
                if (r12 >= r13) goto L1d
                return r12
            L1d:
                return r0
        }

        private final void pop() {
                r3 = this;
                java.util.List<java.lang.String> r0 = r3.encodedPathSegments
                int r1 = r0.size()
                int r1 = r1 + (-1)
                java.lang.Object r0 = r0.remove(r1)
                java.lang.String r0 = (java.lang.String) r0
                int r0 = r0.length()
                java.lang.String r1 = ""
                if (r0 != 0) goto L2c
                java.util.List<java.lang.String> r0 = r3.encodedPathSegments
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L2c
                java.util.List<java.lang.String> r0 = r3.encodedPathSegments
                int r2 = r0.size()
                int r2 = r2 + (-1)
                r0.set(r2, r1)
                return
            L2c:
                java.util.List<java.lang.String> r0 = r3.encodedPathSegments
                r0.add(r1)
                return
        }

        private final int portColonOffset(java.lang.String r3, int r4, int r5) {
                r2 = this;
            L0:
                if (r4 >= r5) goto L1f
                char r0 = r3.charAt(r4)
                r1 = 58
                if (r0 == r1) goto L1e
                r1 = 91
                if (r0 == r1) goto Lf
                goto L1b
            Lf:
                int r4 = r4 + 1
                if (r4 >= r5) goto L1b
                char r0 = r3.charAt(r4)
                r1 = 93
                if (r0 != r1) goto Lf
            L1b:
                int r4 = r4 + 1
                goto L0
            L1e:
                return r4
            L1f:
                return r5
        }

        private final void push(java.lang.String r11, int r12, int r13, boolean r14, boolean r15) {
                r10 = this;
                r8 = 112(0x70, float:1.57E-43)
                r9 = 0
                java.lang.String r3 = " \"<>^`{}|/\\?#"
                r5 = 0
                r6 = 0
                r7 = 0
                r0 = r11
                r1 = r12
                r2 = r13
                r4 = r15
                java.lang.String r11 = okhttp3.internal.url._UrlKt.canonicalize$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                boolean r12 = r10.isDot(r11)
                if (r12 == 0) goto L17
                goto L4f
            L17:
                boolean r12 = r10.isDotDot(r11)
                if (r12 == 0) goto L21
                r10.pop()
                return
            L21:
                java.util.List<java.lang.String> r12 = r10.encodedPathSegments
                int r13 = r12.size()
                int r13 = r13 + (-1)
                java.lang.Object r12 = r12.get(r13)
                java.lang.CharSequence r12 = (java.lang.CharSequence) r12
                int r12 = r12.length()
                if (r12 != 0) goto L41
                java.util.List<java.lang.String> r12 = r10.encodedPathSegments
                int r13 = r12.size()
                int r13 = r13 + (-1)
                r12.set(r13, r11)
                goto L46
            L41:
                java.util.List<java.lang.String> r12 = r10.encodedPathSegments
                r12.add(r11)
            L46:
                if (r14 == 0) goto L4f
                java.util.List<java.lang.String> r11 = r10.encodedPathSegments
                java.lang.String r12 = ""
                r11.add(r12)
            L4f:
                return
        }

        private final void removeAllCanonicalQueryParameters(java.lang.String r5) {
                r4 = this;
                java.util.List<java.lang.String> r0 = r4.encodedQueryNamesAndValues
                kotlin.jvm.internal.g0.m(r0)
                int r0 = r0.size()
                int r0 = r0 + (-2)
                r1 = 0
                r2 = -2
                int r1 = kotlin.internal.c.c(r0, r1, r2)
                if (r1 > r0) goto L48
            L13:
                java.util.List<java.lang.String> r2 = r4.encodedQueryNamesAndValues
                kotlin.jvm.internal.g0.m(r2)
                java.lang.Object r2 = r2.get(r0)
                boolean r2 = kotlin.jvm.internal.g0.g(r5, r2)
                if (r2 == 0) goto L43
                java.util.List<java.lang.String> r2 = r4.encodedQueryNamesAndValues
                kotlin.jvm.internal.g0.m(r2)
                int r3 = r0 + 1
                r2.remove(r3)
                java.util.List<java.lang.String> r2 = r4.encodedQueryNamesAndValues
                kotlin.jvm.internal.g0.m(r2)
                r2.remove(r0)
                java.util.List<java.lang.String> r2 = r4.encodedQueryNamesAndValues
                kotlin.jvm.internal.g0.m(r2)
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L43
                r5 = 0
                r4.encodedQueryNamesAndValues = r5
                return
            L43:
                if (r0 == r1) goto L48
                int r0 = r0 + (-2)
                goto L13
            L48:
                return
        }

        private final void resolvePath(java.lang.String r11, int r12, int r13) {
                r10 = this;
                if (r12 != r13) goto L3
                goto L47
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1d
                r1 = 92
                if (r0 == r1) goto L1d
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L29
            L1d:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.add(r2)
                int r12 = r12 + 1
            L29:
                r6 = r12
            L2a:
                if (r6 >= r13) goto L47
                java.lang.String r12 = "/\\"
                int r7 = okhttp3.internal._UtilCommonKt.delimiterOffset(r11, r12, r6, r13)
                if (r7 >= r13) goto L36
                r8 = 1
                goto L38
            L36:
                r12 = 0
                r8 = 0
            L38:
                r9 = 1
                r4 = r10
                r5 = r11
                r4.push(r5, r6, r7, r8, r9)
                if (r8 == 0) goto L44
                int r6 = r7 + 1
                r11 = r5
                goto L2a
            L44:
                r11 = r5
                r6 = r7
                goto L2a
            L47:
                return
        }

        private final int schemeDelimiterOffset(java.lang.String r7, int r8, int r9) {
                r6 = this;
                int r0 = r9 - r8
                r1 = 2
                r2 = -1
                if (r0 >= r1) goto L7
                return r2
            L7:
                char r0 = r7.charAt(r8)
                r1 = 97
                int r3 = kotlin.jvm.internal.g0.t(r0, r1)
                r4 = 65
                if (r3 < 0) goto L1d
                r3 = 122(0x7a, float:1.71E-43)
                int r3 = kotlin.jvm.internal.g0.t(r0, r3)
                if (r3 <= 0) goto L2c
            L1d:
                int r3 = kotlin.jvm.internal.g0.t(r0, r4)
                if (r3 < 0) goto L5b
                r3 = 90
                int r0 = kotlin.jvm.internal.g0.t(r0, r3)
                if (r0 <= 0) goto L2c
                goto L5b
            L2c:
                int r8 = r8 + 1
                if (r8 >= r9) goto L5b
                char r0 = r7.charAt(r8)
                if (r1 > r0) goto L3b
                r3 = 123(0x7b, float:1.72E-43)
                if (r0 >= r3) goto L3b
                goto L2c
            L3b:
                if (r4 > r0) goto L42
                r3 = 91
                if (r0 >= r3) goto L42
                goto L2c
            L42:
                r3 = 48
                r5 = 58
                if (r3 > r0) goto L4b
                if (r0 >= r5) goto L4b
                goto L2c
            L4b:
                r3 = 43
                if (r0 == r3) goto L2c
                r3 = 45
                if (r0 == r3) goto L2c
                r3 = 46
                if (r0 != r3) goto L58
                goto L2c
            L58:
                if (r0 != r5) goto L5b
                return r8
            L5b:
                return r2
        }

        private final int slashCount(java.lang.String r4, int r5, int r6) {
                r3 = this;
                r0 = 0
            L1:
                if (r5 >= r6) goto L15
                char r1 = r4.charAt(r5)
                r2 = 47
                if (r1 == r2) goto L10
                r2 = 92
                if (r1 == r2) goto L10
                goto L15
            L10:
                int r0 = r0 + 1
                int r5 = r5 + 1
                goto L1
            L15:
                return r0
        }

        private final void toPathString(java.util.List<java.lang.String> r4, java.lang.StringBuilder r5) {
                r3 = this;
                int r0 = r4.size()
                r1 = 0
            L5:
                if (r1 >= r0) goto L18
                r2 = 47
                r5.append(r2)
                java.lang.Object r2 = r4.get(r1)
                java.lang.String r2 = (java.lang.String) r2
                r5.append(r2)
                int r1 = r1 + 1
                goto L5
            L18:
                return
        }

        private final java.util.List<java.lang.String> toQueryNamesAndValues(java.lang.String r9) {
                r8 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = 0
                r4 = 0
            L7:
                int r1 = r9.length()
                if (r4 > r1) goto L57
                r6 = 4
                r7 = 0
                r3 = 38
                r5 = 0
                r2 = r9
                int r9 = kotlin.text.u.G3(r2, r3, r4, r5, r6, r7)
                r1 = -1
                if (r9 != r1) goto L1e
                int r9 = r2.length()
            L1e:
                r6 = 4
                r7 = 0
                r3 = 61
                r5 = 0
                int r3 = kotlin.text.u.G3(r2, r3, r4, r5, r6, r7)
                java.lang.String r5 = "substring(...)"
                if (r3 == r1) goto L45
                if (r3 <= r9) goto L2e
                goto L45
            L2e:
                java.lang.String r1 = r2.substring(r4, r3)
                kotlin.jvm.internal.g0.o(r1, r5)
                r0.add(r1)
                int r3 = r3 + 1
                java.lang.String r1 = r2.substring(r3, r9)
                kotlin.jvm.internal.g0.o(r1, r5)
                r0.add(r1)
                goto L53
            L45:
                java.lang.String r1 = r2.substring(r4, r9)
                kotlin.jvm.internal.g0.o(r1, r5)
                r0.add(r1)
                r1 = 0
                r0.add(r1)
            L53:
                int r4 = r9 + 1
                r9 = r2
                goto L7
            L57:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder addEncodedPathSegment(@org.jetbrains.annotations.NotNull java.lang.String r8) {
                r7 = this;
                java.lang.String r0 = "encodedPathSegment"
                kotlin.jvm.internal.g0.p(r8, r0)
                int r4 = r8.length()
                r5 = 0
                r6 = 1
                r3 = 0
                r1 = r7
                r2 = r8
                r1.push(r2, r3, r4, r5, r6)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder addEncodedPathSegments(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "encodedPathSegments"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 1
                okhttp3.HttpUrl$Builder r2 = r1.addPathSegments(r2, r0)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder addEncodedQueryParameter(@org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.Nullable java.lang.String r13) {
                r11 = this;
                java.lang.String r0 = "encodedName"
                kotlin.jvm.internal.g0.p(r12, r0)
                java.util.List<java.lang.String> r0 = r11.encodedQueryNamesAndValues
                if (r0 != 0) goto L10
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r11.encodedQueryNamesAndValues = r0
            L10:
                java.util.List<java.lang.String> r0 = r11.encodedQueryNamesAndValues
                kotlin.jvm.internal.g0.m(r0)
                r9 = 83
                r10 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"'<>#&="
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r1 = r12
                java.lang.String r12 = okhttp3.internal.url._UrlKt.canonicalize$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r0.add(r12)
                java.util.List<java.lang.String> r12 = r11.encodedQueryNamesAndValues
                kotlin.jvm.internal.g0.m(r12)
                if (r13 == 0) goto L40
                r8 = 83
                r9 = 0
                r1 = 0
                r2 = 0
                java.lang.String r3 = " \"'<>#&="
                r4 = 1
                r5 = 0
                r6 = 1
                r7 = 0
                r0 = r13
                java.lang.String r13 = okhttp3.internal.url._UrlKt.canonicalize$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                goto L41
            L40:
                r13 = 0
            L41:
                r12.add(r13)
                return r11
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder addPathSegment(@org.jetbrains.annotations.NotNull java.lang.String r8) {
                r7 = this;
                java.lang.String r0 = "pathSegment"
                kotlin.jvm.internal.g0.p(r8, r0)
                int r4 = r8.length()
                r5 = 0
                r6 = 0
                r3 = 0
                r1 = r7
                r2 = r8
                r1.push(r2, r3, r4, r5, r6)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder addPathSegments(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "pathSegments"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 0
                okhttp3.HttpUrl$Builder r2 = r1.addPathSegments(r2, r0)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder addQueryParameter(@org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.Nullable java.lang.String r13) {
                r11 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r12, r0)
                java.util.List<java.lang.String> r0 = r11.encodedQueryNamesAndValues
                if (r0 != 0) goto L10
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r11.encodedQueryNamesAndValues = r0
            L10:
                java.util.List<java.lang.String> r0 = r11.encodedQueryNamesAndValues
                kotlin.jvm.internal.g0.m(r0)
                r9 = 91
                r10 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
                r5 = 0
                r6 = 0
                r7 = 1
                r8 = 0
                r1 = r12
                java.lang.String r12 = okhttp3.internal.url._UrlKt.canonicalize$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r0.add(r12)
                java.util.List<java.lang.String> r12 = r11.encodedQueryNamesAndValues
                kotlin.jvm.internal.g0.m(r12)
                if (r13 == 0) goto L40
                r8 = 91
                r9 = 0
                r1 = 0
                r2 = 0
                java.lang.String r3 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
                r4 = 0
                r5 = 0
                r6 = 1
                r7 = 0
                r0 = r13
                java.lang.String r13 = okhttp3.internal.url._UrlKt.canonicalize$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                goto L41
            L40:
                r13 = 0
            L41:
                r12.add(r13)
                return r11
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl build() {
                r17 = this;
                r0 = r17
                java.lang.String r2 = r0.scheme
                if (r2 == 0) goto La5
                java.lang.String r3 = r0.encodedUsername
                r7 = 7
                r8 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                java.lang.String r3 = okhttp3.internal.url._UrlKt.percentDecode$default(r3, r4, r5, r6, r7, r8)
                java.lang.String r4 = r0.encodedPassword
                r8 = 7
                r9 = 0
                r7 = 0
                java.lang.String r4 = okhttp3.internal.url._UrlKt.percentDecode$default(r4, r5, r6, r7, r8, r9)
                java.lang.String r5 = r0.host
                if (r5 == 0) goto L9d
                int r6 = r0.effectivePort()
                java.util.List<java.lang.String> r1 = r0.encodedPathSegments
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r7 = new java.util.ArrayList
                r8 = 10
                int r9 = kotlin.collections.f0.d0(r1, r8)
                r7.<init>(r9)
                java.util.Iterator r1 = r1.iterator()
            L35:
                boolean r9 = r1.hasNext()
                if (r9 == 0) goto L4f
                java.lang.Object r9 = r1.next()
                r10 = r9
                java.lang.String r10 = (java.lang.String) r10
                r14 = 7
                r15 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                java.lang.String r9 = okhttp3.internal.url._UrlKt.percentDecode$default(r10, r11, r12, r13, r14, r15)
                r7.add(r9)
                goto L35
            L4f:
                java.util.List<java.lang.String> r1 = r0.encodedQueryNamesAndValues
                r9 = 0
                if (r1 == 0) goto L84
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r10 = new java.util.ArrayList
                int r8 = kotlin.collections.f0.d0(r1, r8)
                r10.<init>(r8)
                java.util.Iterator r1 = r1.iterator()
            L63:
                boolean r8 = r1.hasNext()
                if (r8 == 0) goto L82
                java.lang.Object r8 = r1.next()
                r11 = r8
                java.lang.String r11 = (java.lang.String) r11
                if (r11 == 0) goto L7d
                r15 = 3
                r16 = 0
                r12 = 0
                r13 = 0
                r14 = 1
                java.lang.String r8 = okhttp3.internal.url._UrlKt.percentDecode$default(r11, r12, r13, r14, r15, r16)
                goto L7e
            L7d:
                r8 = r9
            L7e:
                r10.add(r8)
                goto L63
            L82:
                r8 = r10
                goto L85
            L84:
                r8 = r9
            L85:
                java.lang.String r10 = r0.encodedFragment
                if (r10 == 0) goto L92
                r14 = 7
                r15 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                java.lang.String r9 = okhttp3.internal.url._UrlKt.percentDecode$default(r10, r11, r12, r13, r14, r15)
            L92:
                java.lang.String r10 = r0.toString()
                okhttp3.HttpUrl r1 = new okhttp3.HttpUrl
                r11 = 0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return r1
            L9d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "host == null"
                r1.<init>(r2)
                throw r1
            La5:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "scheme == null"
                r1.<init>(r2)
                throw r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder encodedFragment(@org.jetbrains.annotations.Nullable java.lang.String r11) {
                r10 = this;
                if (r11 == 0) goto L13
                r8 = 51
                r9 = 0
                r1 = 0
                r2 = 0
                java.lang.String r3 = ""
                r4 = 1
                r5 = 0
                r6 = 0
                r7 = 1
                r0 = r11
                java.lang.String r11 = okhttp3.internal.url._UrlKt.canonicalize$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                goto L14
            L13:
                r11 = 0
            L14:
                r10.encodedFragment = r11
                return r10
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder encodedPassword(@org.jetbrains.annotations.NotNull java.lang.String r12) {
                r11 = this;
                java.lang.String r0 = "encodedPassword"
                kotlin.jvm.internal.g0.p(r12, r0)
                r9 = 115(0x73, float:1.61E-43)
                r10 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 0
                r1 = r12
                java.lang.String r12 = okhttp3.internal.url._UrlKt.canonicalize$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r11.encodedPassword = r12
                return r11
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder encodedPath(@org.jetbrains.annotations.NotNull java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = "encodedPath"
                kotlin.jvm.internal.g0.p(r5, r0)
                r0 = 2
                r1 = 0
                java.lang.String r2 = "/"
                r3 = 0
                boolean r0 = kotlin.text.u.H2(r5, r2, r3, r0, r1)
                if (r0 == 0) goto L18
                int r0 = r5.length()
                r4.resolvePath(r5, r3, r0)
                return r4
            L18:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "unexpected encodedPath: "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r5 = r5.toString()
                r0.<init>(r5)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder encodedQuery(@org.jetbrains.annotations.Nullable java.lang.String r11) {
                r10 = this;
                if (r11 == 0) goto L19
                r8 = 83
                r9 = 0
                r1 = 0
                r2 = 0
                java.lang.String r3 = " \"'<>#"
                r4 = 1
                r5 = 0
                r6 = 1
                r7 = 0
                r0 = r11
                java.lang.String r11 = okhttp3.internal.url._UrlKt.canonicalize$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                if (r11 == 0) goto L19
                java.util.List r11 = r10.toQueryNamesAndValues(r11)
                goto L1a
            L19:
                r11 = 0
            L1a:
                r10.encodedQueryNamesAndValues = r11
                return r10
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder encodedUsername(@org.jetbrains.annotations.NotNull java.lang.String r12) {
                r11 = this;
                java.lang.String r0 = "encodedUsername"
                kotlin.jvm.internal.g0.p(r12, r0)
                r9 = 115(0x73, float:1.61E-43)
                r10 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 0
                r1 = r12
                java.lang.String r12 = okhttp3.internal.url._UrlKt.canonicalize$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r11.encodedUsername = r12
                return r11
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder fragment(@org.jetbrains.annotations.Nullable java.lang.String r11) {
                r10 = this;
                if (r11 == 0) goto L13
                r8 = 59
                r9 = 0
                r1 = 0
                r2 = 0
                java.lang.String r3 = ""
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 1
                r0 = r11
                java.lang.String r11 = okhttp3.internal.url._UrlKt.canonicalize$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                goto L14
            L13:
                r11 = 0
            L14:
                r10.encodedFragment = r11
                return r10
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getEncodedFragment$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.encodedFragment
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getEncodedPassword$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.encodedPassword
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getEncodedPathSegments$okhttp() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.encodedPathSegments
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> getEncodedQueryNamesAndValues$okhttp() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.encodedQueryNamesAndValues
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getEncodedUsername$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.encodedUsername
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getHost$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.host
                return r0
        }

        public final int getPort$okhttp() {
                r1 = this;
                int r0 = r1.port
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getScheme$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.scheme
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder host(@org.jetbrains.annotations.NotNull java.lang.String r8) {
                r7 = this;
                java.lang.String r0 = "host"
                kotlin.jvm.internal.g0.p(r8, r0)
                r5 = 7
                r6 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r1 = r8
                java.lang.String r8 = okhttp3.internal.url._UrlKt.percentDecode$default(r1, r2, r3, r4, r5, r6)
                java.lang.String r8 = okhttp3.internal._HostnamesCommonKt.toCanonicalHost(r8)
                if (r8 == 0) goto L18
                r7.host = r8
                return r7
            L18:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "unexpected host: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder parse$okhttp(@org.jetbrains.annotations.Nullable okhttp3.HttpUrl r23, @org.jetbrains.annotations.NotNull java.lang.String r24) {
                r22 = this;
                r0 = r22
                r1 = r24
                java.lang.String r2 = "input"
                kotlin.jvm.internal.g0.p(r1, r2)
                r2 = 0
                r3 = 3
                r4 = 0
                int r3 = okhttp3.internal._UtilCommonKt.indexOfFirstNonAsciiWhitespace$default(r1, r2, r2, r3, r4)
                r5 = 2
                int r11 = okhttp3.internal._UtilCommonKt.indexOfLastNonAsciiWhitespace$default(r1, r3, r2, r5, r4)
                int r4 = r0.schemeDelimiterOffset(r1, r3, r11)
                java.lang.String r12 = "substring(...)"
                r13 = 1
                r14 = -1
                if (r4 == r14) goto L60
                java.lang.String r6 = "https:"
                boolean r6 = kotlin.text.u.E2(r1, r6, r3, r13)
                if (r6 == 0) goto L2e
                java.lang.String r4 = "https"
                r0.scheme = r4
                int r3 = r3 + 6
                goto L68
            L2e:
                java.lang.String r6 = "http:"
                boolean r6 = kotlin.text.u.E2(r1, r6, r3, r13)
                if (r6 == 0) goto L3d
                java.lang.String r4 = "http"
                r0.scheme = r4
                int r3 = r3 + 5
                goto L68
            L3d:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Expected URL scheme 'http' or 'https' but was '"
                r5.append(r6)
                java.lang.String r1 = r1.substring(r2, r4)
                kotlin.jvm.internal.g0.o(r1, r12)
                r5.append(r1)
                r1 = 39
                r5.append(r1)
                java.lang.String r1 = r5.toString()
                r3.<init>(r1)
                throw r3
            L60:
                if (r23 == 0) goto L24c
                java.lang.String r4 = r23.scheme()
                r0.scheme = r4
            L68:
                int r4 = r0.slashCount(r1, r3, r11)
                r15 = 63
                r6 = 35
                if (r4 >= r5) goto Lbc
                if (r23 == 0) goto Lbc
                java.lang.String r5 = r23.scheme()
                java.lang.String r7 = r0.scheme
                boolean r5 = kotlin.jvm.internal.g0.g(r5, r7)
                if (r5 != 0) goto L81
                goto Lbc
            L81:
                java.lang.String r2 = r23.encodedUsername()
                r0.encodedUsername = r2
                java.lang.String r2 = r23.encodedPassword()
                r0.encodedPassword = r2
                java.lang.String r2 = r23.host()
                r0.host = r2
                int r2 = r23.port()
                r0.port = r2
                java.util.List<java.lang.String> r2 = r0.encodedPathSegments
                r2.clear()
                java.util.List<java.lang.String> r2 = r0.encodedPathSegments
                java.util.List r4 = r23.encodedPathSegments()
                java.util.Collection r4 = (java.util.Collection) r4
                r2.addAll(r4)
                if (r3 == r11) goto Lb1
                char r2 = r1.charAt(r3)
                if (r2 != r6) goto Lb8
            Lb1:
                java.lang.String r2 = r23.encodedQuery()
                r0.encodedQuery(r2)
            Lb8:
                r21 = 1
                goto L1da
            Lbc:
                int r3 = r3 + r4
                r2 = r3
                r16 = 0
                r17 = 0
            Lc2:
                java.lang.String r3 = "@/\\?#"
                int r3 = okhttp3.internal._UtilCommonKt.delimiterOffset(r1, r3, r2, r11)
                if (r3 == r11) goto Lcf
                char r4 = r1.charAt(r3)
                goto Ld0
            Lcf:
                r4 = -1
            Ld0:
                if (r4 == r14) goto L173
                if (r4 == r6) goto L173
                r5 = 47
                if (r4 == r5) goto L173
                r5 = 92
                if (r4 == r5) goto L173
                if (r4 == r15) goto L173
                r5 = 64
                if (r4 == r5) goto Le3
                goto Lc2
            Le3:
                java.lang.String r4 = "%40"
                if (r16 != 0) goto L141
                r5 = 58
                int r5 = okhttp3.internal._UtilCommonKt.delimiterOffset(r1, r5, r2, r3)
                r9 = 112(0x70, float:1.57E-43)
                r10 = 0
                r7 = r4
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r8 = r3
                r3 = r5
                r5 = 1
                r18 = 35
                r6 = 0
                r19 = r7
                r7 = 0
                r20 = r8
                r8 = 0
                r15 = r19
                r13 = r20
                r21 = 1
                java.lang.String r2 = okhttp3.internal.url._UrlKt.canonicalize$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                if (r17 == 0) goto L11f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = r0.encodedUsername
                r1.append(r4)
                r1.append(r15)
                r1.append(r2)
                java.lang.String r2 = r1.toString()
            L11f:
                r0.encodedUsername = r2
                if (r3 == r13) goto L13a
                int r2 = r3 + 1
                r9 = 112(0x70, float:1.57E-43)
                r10 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 0
                r1 = r24
                r3 = r13
                java.lang.String r2 = okhttp3.internal.url._UrlKt.canonicalize$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r0.encodedPassword = r2
                r16 = 1
                goto L13b
            L13a:
                r3 = r13
            L13b:
                r1 = r24
                r8 = r3
                r17 = 1
                goto L16a
            L141:
                r15 = r4
                r21 = 1
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r1 = r0.encodedPassword
                r13.append(r1)
                r13.append(r15)
                r9 = 112(0x70, float:1.57E-43)
                r10 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 0
                r1 = r24
                java.lang.String r2 = okhttp3.internal.url._UrlKt.canonicalize$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r8 = r3
                r13.append(r2)
                java.lang.String r2 = r13.toString()
                r0.encodedPassword = r2
            L16a:
                int r2 = r8 + 1
                r6 = 35
                r13 = 1
                r15 = 63
                goto Lc2
            L173:
                r8 = r3
                r21 = 1
                int r3 = r0.portColonOffset(r1, r2, r8)
                int r7 = r3 + 1
                r9 = 34
                if (r7 >= r8) goto L1bb
                r5 = 4
                r6 = 0
                r4 = 0
                java.lang.String r4 = okhttp3.internal.url._UrlKt.percentDecode$default(r1, r2, r3, r4, r5, r6)
                java.lang.String r4 = okhttp3.internal._HostnamesCommonKt.toCanonicalHost(r4)
                r0.host = r4
                int r4 = r0.parsePort(r1, r7, r8)
                r0.port = r4
                if (r4 == r14) goto L196
                goto L1d5
            L196:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid URL port: \""
                r2.append(r3)
                java.lang.String r1 = r1.substring(r7, r8)
                kotlin.jvm.internal.g0.o(r1, r12)
                r2.append(r1)
                r2.append(r9)
                java.lang.String r1 = r2.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L1bb:
                r5 = 4
                r6 = 0
                r4 = 0
                java.lang.String r4 = okhttp3.internal.url._UrlKt.percentDecode$default(r1, r2, r3, r4, r5, r6)
                java.lang.String r4 = okhttp3.internal._HostnamesCommonKt.toCanonicalHost(r4)
                r0.host = r4
                okhttp3.HttpUrl$Companion r4 = okhttp3.HttpUrl.Companion
                java.lang.String r5 = r0.scheme
                kotlin.jvm.internal.g0.m(r5)
                int r4 = r4.defaultPort(r5)
                r0.port = r4
            L1d5:
                java.lang.String r4 = r0.host
                if (r4 == 0) goto L227
                r3 = r8
            L1da:
                java.lang.String r2 = "?#"
                int r2 = okhttp3.internal._UtilCommonKt.delimiterOffset(r1, r2, r3, r11)
                r0.resolvePath(r1, r3, r2)
                if (r2 >= r11) goto L20a
                char r3 = r1.charAt(r2)
                r4 = 63
                if (r3 != r4) goto L20a
                r12 = 35
                int r3 = okhttp3.internal._UtilCommonKt.delimiterOffset(r1, r12, r2, r11)
                int r2 = r2 + 1
                r9 = 80
                r10 = 0
                java.lang.String r4 = " \"'<>#"
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                java.lang.String r2 = okhttp3.internal.url._UrlKt.canonicalize$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.util.List r2 = r0.toQueryNamesAndValues(r2)
                r0.encodedQueryNamesAndValues = r2
                r2 = r3
                goto L20c
            L20a:
                r12 = 35
            L20c:
                if (r2 >= r11) goto L226
                char r3 = r1.charAt(r2)
                if (r3 != r12) goto L226
                int r2 = r2 + 1
                r9 = 48
                r10 = 0
                java.lang.String r4 = ""
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r3 = r11
                java.lang.String r1 = okhttp3.internal.url._UrlKt.canonicalize$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r0.encodedFragment = r1
            L226:
                return r0
            L227:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Invalid URL host: \""
                r4.append(r5)
                java.lang.String r1 = r1.substring(r2, r3)
                kotlin.jvm.internal.g0.o(r1, r12)
                r4.append(r1)
                r4.append(r9)
                java.lang.String r1 = r4.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L24c:
                int r2 = r1.length()
                r3 = 6
                if (r2 <= r3) goto L268
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r1 = kotlin.text.u.y9(r1, r3)
                r2.append(r1)
                java.lang.String r1 = "..."
                r2.append(r1)
                java.lang.String r1 = r2.toString()
            L268:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Expected URL scheme 'http' or 'https' but no scheme was found for "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder password(@org.jetbrains.annotations.NotNull java.lang.String r12) {
                r11 = this;
                java.lang.String r0 = "password"
                kotlin.jvm.internal.g0.p(r12, r0)
                r9 = 123(0x7b, float:1.72E-43)
                r10 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r1 = r12
                java.lang.String r12 = okhttp3.internal.url._UrlKt.canonicalize$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r11.encodedPassword = r12
                return r11
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder port(int r3) {
                r2 = this;
                r0 = 1
                if (r0 > r3) goto La
                r0 = 65536(0x10000, float:9.1835E-41)
                if (r3 >= r0) goto La
                r2.port = r3
                return r2
            La:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "unexpected port: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r0.<init>(r3)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder query(@org.jetbrains.annotations.Nullable java.lang.String r11) {
                r10 = this;
                if (r11 == 0) goto L19
                r8 = 91
                r9 = 0
                r1 = 0
                r2 = 0
                java.lang.String r3 = " \"'<>#"
                r4 = 0
                r5 = 0
                r6 = 1
                r7 = 0
                r0 = r11
                java.lang.String r11 = okhttp3.internal.url._UrlKt.canonicalize$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                if (r11 == 0) goto L19
                java.util.List r11 = r10.toQueryNamesAndValues(r11)
                goto L1a
            L19:
                r11 = 0
            L1a:
                r10.encodedQueryNamesAndValues = r11
                return r10
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder reencodeForUri$okhttp() {
                r17 = this;
                r0 = r17
                java.lang.String r1 = r0.host
                r2 = 0
                if (r1 == 0) goto L15
                kotlin.text.Regex r3 = new kotlin.text.Regex
                java.lang.String r4 = "[\"<>^`{|}]"
                r3.<init>(r4)
                java.lang.String r4 = ""
                java.lang.String r1 = r3.replace(r1, r4)
                goto L16
            L15:
                r1 = r2
            L16:
                r0.host = r1
                java.util.List<java.lang.String> r1 = r0.encodedPathSegments
                int r1 = r1.size()
                r3 = 0
                r4 = 0
            L20:
                if (r4 >= r1) goto L41
                java.util.List<java.lang.String> r5 = r0.encodedPathSegments
                java.lang.Object r6 = r5.get(r4)
                r7 = r6
                java.lang.String r7 = (java.lang.String) r7
                r15 = 99
                r16 = 0
                r8 = 0
                r9 = 0
                java.lang.String r10 = "[]"
                r11 = 1
                r12 = 1
                r13 = 0
                r14 = 0
                java.lang.String r6 = okhttp3.internal.url._UrlKt.canonicalize$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                r5.set(r4, r6)
                int r4 = r4 + 1
                goto L20
            L41:
                java.util.List<java.lang.String> r1 = r0.encodedQueryNamesAndValues
                if (r1 == 0) goto L6b
                int r4 = r1.size()
            L49:
                if (r3 >= r4) goto L6b
                java.lang.Object r5 = r1.get(r3)
                r6 = r5
                java.lang.String r6 = (java.lang.String) r6
                if (r6 == 0) goto L64
                r14 = 67
                r15 = 0
                r7 = 0
                r8 = 0
                java.lang.String r9 = "\\^`{|}"
                r10 = 1
                r11 = 1
                r12 = 1
                r13 = 0
                java.lang.String r5 = okhttp3.internal.url._UrlKt.canonicalize$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                goto L65
            L64:
                r5 = r2
            L65:
                r1.set(r3, r5)
                int r3 = r3 + 1
                goto L49
            L6b:
                java.lang.String r5 = r0.encodedFragment
                if (r5 == 0) goto L7e
                r13 = 35
                r14 = 0
                r6 = 0
                r7 = 0
                java.lang.String r8 = " \"#<>\\^`{|}"
                r9 = 1
                r10 = 1
                r11 = 0
                r12 = 1
                java.lang.String r2 = okhttp3.internal.url._UrlKt.canonicalize$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            L7e:
                r0.encodedFragment = r2
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder removeAllEncodedQueryParameters(@org.jetbrains.annotations.NotNull java.lang.String r12) {
                r11 = this;
                java.lang.String r0 = "encodedName"
                kotlin.jvm.internal.g0.p(r12, r0)
                java.util.List<java.lang.String> r0 = r11.encodedQueryNamesAndValues
                if (r0 != 0) goto La
                return r11
            La:
                r9 = 83
                r10 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"'<>#&="
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r1 = r12
                java.lang.String r12 = okhttp3.internal.url._UrlKt.canonicalize$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r11.removeAllCanonicalQueryParameters(r12)
                return r11
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder removeAllQueryParameters(@org.jetbrains.annotations.NotNull java.lang.String r12) {
                r11 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r12, r0)
                java.util.List<java.lang.String> r0 = r11.encodedQueryNamesAndValues
                if (r0 != 0) goto La
                return r11
            La:
                r9 = 91
                r10 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
                r5 = 0
                r6 = 0
                r7 = 1
                r8 = 0
                r1 = r12
                java.lang.String r12 = okhttp3.internal.url._UrlKt.canonicalize$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r11.removeAllCanonicalQueryParameters(r12)
                return r11
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder removePathSegment(int r2) {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.encodedPathSegments
                r0.remove(r2)
                java.util.List<java.lang.String> r2 = r1.encodedPathSegments
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L14
                java.util.List<java.lang.String> r2 = r1.encodedPathSegments
                java.lang.String r0 = ""
                r2.add(r0)
            L14:
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder scheme(@org.jetbrains.annotations.NotNull java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "scheme"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "http"
                r1 = 1
                boolean r2 = kotlin.text.u.a2(r4, r0, r1)
                if (r2 == 0) goto L11
                r3.scheme = r0
                return r3
            L11:
                java.lang.String r0 = "https"
                boolean r1 = kotlin.text.u.a2(r4, r0, r1)
                if (r1 == 0) goto L1c
                r3.scheme = r0
                return r3
            L1c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unexpected scheme: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        public final void setEncodedFragment$okhttp(@org.jetbrains.annotations.Nullable java.lang.String r1) {
                r0 = this;
                r0.encodedFragment = r1
                return
        }

        public final void setEncodedPassword$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.encodedPassword = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder setEncodedPathSegment(int r12, @org.jetbrains.annotations.NotNull java.lang.String r13) {
                r11 = this;
                java.lang.String r0 = "encodedPathSegment"
                kotlin.jvm.internal.g0.p(r13, r0)
                r9 = 115(0x73, float:1.61E-43)
                r10 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"<>^`{}|/\\?#"
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 0
                r1 = r13
                java.lang.String r13 = okhttp3.internal.url._UrlKt.canonicalize$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.util.List<java.lang.String> r0 = r11.encodedPathSegments
                r0.set(r12, r13)
                boolean r12 = r11.isDot(r13)
                if (r12 != 0) goto L27
                boolean r12 = r11.isDotDot(r13)
                if (r12 != 0) goto L27
                return r11
            L27:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "unexpected path segment: "
                r12.append(r13)
                r12.append(r1)
                java.lang.String r12 = r12.toString()
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r12.toString()
                r13.<init>(r12)
                throw r13
        }

        public final void setEncodedQueryNamesAndValues$okhttp(@org.jetbrains.annotations.Nullable java.util.List<java.lang.String> r1) {
                r0 = this;
                r0.encodedQueryNamesAndValues = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder setEncodedQueryParameter(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "encodedName"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.removeAllEncodedQueryParameters(r2)
                r1.addEncodedQueryParameter(r2, r3)
                return r1
        }

        public final void setEncodedUsername$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.encodedUsername = r2
                return
        }

        public final void setHost$okhttp(@org.jetbrains.annotations.Nullable java.lang.String r1) {
                r0 = this;
                r0.host = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder setPathSegment(int r12, @org.jetbrains.annotations.NotNull java.lang.String r13) {
                r11 = this;
                java.lang.String r0 = "pathSegment"
                kotlin.jvm.internal.g0.p(r13, r0)
                r9 = 123(0x7b, float:1.72E-43)
                r10 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"<>^`{}|/\\?#"
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r1 = r13
                java.lang.String r13 = okhttp3.internal.url._UrlKt.canonicalize$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                boolean r0 = r11.isDot(r13)
                if (r0 != 0) goto L27
                boolean r0 = r11.isDotDot(r13)
                if (r0 != 0) goto L27
                java.util.List<java.lang.String> r0 = r11.encodedPathSegments
                r0.set(r12, r13)
                return r11
            L27:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "unexpected path segment: "
                r12.append(r13)
                r12.append(r1)
                java.lang.String r12 = r12.toString()
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r12.toString()
                r13.<init>(r12)
                throw r13
        }

        public final void setPort$okhttp(int r1) {
                r0 = this;
                r0.port = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder setQueryParameter(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.removeAllQueryParameters(r2)
                r1.addQueryParameter(r2, r3)
                return r1
        }

        public final void setScheme$okhttp(@org.jetbrains.annotations.Nullable java.lang.String r1) {
                r0 = this;
                r0.scheme = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.encodedUsername
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.encodedPassword
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.host
                if (r1 == 0) goto L69
                kotlin.jvm.internal.g0.m(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = kotlin.text.u.k3(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L64
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L69
            L64:
                java.lang.String r1 = r6.host
                r0.append(r1)
            L69:
                int r1 = r6.port
                r3 = -1
                if (r1 != r3) goto L72
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L8b
            L72:
                int r1 = r6.effectivePort()
                java.lang.String r3 = r6.scheme
                if (r3 == 0) goto L85
                okhttp3.HttpUrl$Companion r4 = okhttp3.HttpUrl.Companion
                kotlin.jvm.internal.g0.m(r3)
                int r3 = r4.defaultPort(r3)
                if (r1 == r3) goto L8b
            L85:
                r0.append(r2)
                r0.append(r1)
            L8b:
                java.util.List<java.lang.String> r1 = r6.encodedPathSegments
                r6.toPathString(r1, r0)
                java.util.List<java.lang.String> r1 = r6.encodedQueryNamesAndValues
                if (r1 == 0) goto La3
                r1 = 63
                r0.append(r1)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                kotlin.jvm.internal.g0.m(r2)
                okhttp3.HttpUrl.Companion.access$toQueryString(r1, r2, r0)
            La3:
                java.lang.String r1 = r6.encodedFragment
                if (r1 == 0) goto Lb1
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.encodedFragment
                r0.append(r1)
            Lb1:
                java.lang.String r0 = r0.toString()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl.Builder username(@org.jetbrains.annotations.NotNull java.lang.String r12) {
                r11 = this;
                java.lang.String r0 = "username"
                kotlin.jvm.internal.g0.p(r12, r0)
                r9 = 123(0x7b, float:1.72E-43)
                r10 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r1 = r12
                java.lang.String r12 = okhttp3.internal.url._UrlKt.canonicalize$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r11.encodedUsername = r12
                return r11
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

        public static final /* synthetic */ void access$toQueryString(okhttp3.HttpUrl.Companion r0, java.util.List r1, java.lang.StringBuilder r2) {
                r0.toQueryString(r1, r2)
                return
        }

        private final void toQueryString(java.util.List<java.lang.String> r7, java.lang.StringBuilder r8) {
                r6 = this;
                r0 = 0
                int r1 = r7.size()
                kotlin.ranges.m r0 = kotlin.ranges.t.W1(r0, r1)
                r1 = 2
                kotlin.ranges.k r0 = kotlin.ranges.t.B1(r0, r1)
                int r1 = r0.e()
                int r2 = r0.f()
                int r0 = r0.g()
                if (r0 <= 0) goto L1e
                if (r1 <= r2) goto L22
            L1e:
                if (r0 >= 0) goto L48
                if (r2 > r1) goto L48
            L22:
                java.lang.Object r3 = r7.get(r1)
                java.lang.String r3 = (java.lang.String) r3
                int r4 = r1 + 1
                java.lang.Object r4 = r7.get(r4)
                java.lang.String r4 = (java.lang.String) r4
                if (r1 <= 0) goto L37
                r5 = 38
                r8.append(r5)
            L37:
                r8.append(r3)
                if (r4 == 0) goto L44
                r3 = 61
                r8.append(r3)
                r8.append(r4)
            L44:
                if (r1 == r2) goto L48
                int r1 = r1 + r0
                goto L22
            L48:
                return
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        @kotlin.jvm.JvmName(name = "-deprecated_get")
        @org.jetbrains.annotations.NotNull
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m113deprecated_get(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.HttpUrl r2 = r1.get(r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @kotlin.jvm.JvmName(name = "-deprecated_get")
        @org.jetbrains.annotations.Nullable
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m114deprecated_get(@org.jetbrains.annotations.NotNull java.net.URI r2) {
                r1 = this;
                java.lang.String r0 = "uri"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.HttpUrl r2 = r1.get(r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @kotlin.jvm.JvmName(name = "-deprecated_get")
        @org.jetbrains.annotations.Nullable
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m115deprecated_get(@org.jetbrains.annotations.NotNull java.net.URL r2) {
                r1 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.HttpUrl r2 = r1.get(r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @kotlin.jvm.JvmName(name = "-deprecated_parse")
        @org.jetbrains.annotations.Nullable
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final okhttp3.HttpUrl m116deprecated_parse(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.HttpUrl r2 = r1.parse(r2)
                return r2
        }

        @kotlin.jvm.JvmStatic
        public final int defaultPort(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "scheme"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "http"
                boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
                if (r0 == 0) goto L10
                r2 = 80
                return r2
            L10:
                java.lang.String r0 = "https"
                boolean r2 = kotlin.jvm.internal.g0.g(r2, r0)
                if (r2 == 0) goto L1b
                r2 = 443(0x1bb, float:6.21E-43)
                return r2
            L1b:
                r2 = -1
                return r2
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "get")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl get(@org.jetbrains.annotations.NotNull java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.HttpUrl$Builder r0 = new okhttp3.HttpUrl$Builder
                r0.<init>()
                r1 = 0
                okhttp3.HttpUrl$Builder r3 = r0.parse$okhttp(r1, r3)
                okhttp3.HttpUrl r3 = r3.build()
                return r3
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "get")
        @org.jetbrains.annotations.Nullable
        public final okhttp3.HttpUrl get(@org.jetbrains.annotations.NotNull java.net.URI r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r0 = "toString(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                okhttp3.HttpUrl r2 = r1.parse(r2)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "get")
        @org.jetbrains.annotations.Nullable
        public final okhttp3.HttpUrl get(@org.jetbrains.annotations.NotNull java.net.URL r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r0 = "toString(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                okhttp3.HttpUrl r2 = r1.parse(r2)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "parse")
        @org.jetbrains.annotations.Nullable
        public final okhttp3.HttpUrl parse(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.HttpUrl r2 = r1.get(r2)     // Catch: java.lang.IllegalArgumentException -> La
                return r2
            La:
                r2 = 0
                return r2
        }
    }

    static {
            okhttp3.HttpUrl$Companion r0 = new okhttp3.HttpUrl$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.HttpUrl.Companion = r0
            return
    }

    private HttpUrl(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, java.util.List<java.lang.String> r6, java.util.List<java.lang.String> r7, java.lang.String r8, java.lang.String r9) {
            r0 = this;
            r0.<init>()
            r0.scheme = r1
            r0.username = r2
            r0.password = r3
            r0.host = r4
            r0.port = r5
            r0.pathSegments = r6
            r0.queryNamesAndValues = r7
            r0.fragment = r8
            r0.url = r9
            return
    }

    public /* synthetic */ HttpUrl(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, java.util.List r6, java.util.List r7, java.lang.String r8, java.lang.String r9, kotlin.jvm.internal.v r10) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @kotlin.jvm.JvmStatic
    public static final int defaultPort(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            int r1 = r0.defaultPort(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.HttpUrl get(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            okhttp3.HttpUrl r1 = r0.get(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.Nullable
    public static final okhttp3.HttpUrl get(@org.jetbrains.annotations.NotNull java.net.URI r1) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            okhttp3.HttpUrl r1 = r0.get(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.Nullable
    public static final okhttp3.HttpUrl get(@org.jetbrains.annotations.NotNull java.net.URL r1) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            okhttp3.HttpUrl r1 = r0.get(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "parse")
    @org.jetbrains.annotations.Nullable
    public static final okhttp3.HttpUrl parse(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            okhttp3.HttpUrl r1 = r0.parse(r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedFragment", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_encodedFragment")
    @org.jetbrains.annotations.Nullable
    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final java.lang.String m94deprecated_encodedFragment() {
            r1 = this;
            java.lang.String r0 = r1.encodedFragment()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedPassword", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_encodedPassword")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final java.lang.String m95deprecated_encodedPassword() {
            r1 = this;
            java.lang.String r0 = r1.encodedPassword()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedPath", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_encodedPath")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final java.lang.String m96deprecated_encodedPath() {
            r1 = this;
            java.lang.String r0 = r1.encodedPath()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedPathSegments", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_encodedPathSegments")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final java.util.List<java.lang.String> m97deprecated_encodedPathSegments() {
            r1 = this;
            java.util.List r0 = r1.encodedPathSegments()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedQuery", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_encodedQuery")
    @org.jetbrains.annotations.Nullable
    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final java.lang.String m98deprecated_encodedQuery() {
            r1 = this;
            java.lang.String r0 = r1.encodedQuery()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedUsername", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_encodedUsername")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final java.lang.String m99deprecated_encodedUsername() {
            r1 = this;
            java.lang.String r0 = r1.encodedUsername()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "fragment", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_fragment")
    @org.jetbrains.annotations.Nullable
    /* renamed from: -deprecated_fragment, reason: not valid java name */
    public final java.lang.String m100deprecated_fragment() {
            r1 = this;
            java.lang.String r0 = r1.fragment
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "host", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_host")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_host, reason: not valid java name */
    public final java.lang.String m101deprecated_host() {
            r1 = this;
            java.lang.String r0 = r1.host
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "password", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_password")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_password, reason: not valid java name */
    public final java.lang.String m102deprecated_password() {
            r1 = this;
            java.lang.String r0 = r1.password
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "pathSegments", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_pathSegments")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final java.util.List<java.lang.String> m103deprecated_pathSegments() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.pathSegments
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "pathSize", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_pathSize")
    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m104deprecated_pathSize() {
            r1 = this;
            int r0 = r1.pathSize()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "port", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_port")
    /* renamed from: -deprecated_port, reason: not valid java name */
    public final int m105deprecated_port() {
            r1 = this;
            int r0 = r1.port
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "query", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_query")
    @org.jetbrains.annotations.Nullable
    /* renamed from: -deprecated_query, reason: not valid java name */
    public final java.lang.String m106deprecated_query() {
            r1 = this;
            java.lang.String r0 = r1.query()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "queryParameterNames", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_queryParameterNames")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final java.util.Set<java.lang.String> m107deprecated_queryParameterNames() {
            r1 = this;
            java.util.Set r0 = r1.queryParameterNames()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "querySize", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_querySize")
    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m108deprecated_querySize() {
            r1 = this;
            int r0 = r1.querySize()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "scheme", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_scheme")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final java.lang.String m109deprecated_scheme() {
            r1 = this;
            java.lang.String r0 = r1.scheme
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to toUri()", replaceWith = @kotlin.ReplaceWith(expression = "toUri()", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_uri")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final java.net.URI m110deprecated_uri() {
            r1 = this;
            java.net.URI r0 = r1.uri()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to toUrl()", replaceWith = @kotlin.ReplaceWith(expression = "toUrl()", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_url")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final java.net.URL m111deprecated_url() {
            r1 = this;
            java.net.URL r0 = r1.url()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "username", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_username")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_username, reason: not valid java name */
    public final java.lang.String m112deprecated_username() {
            r1 = this;
            java.lang.String r0 = r1.username
            return r0
    }

    @kotlin.jvm.JvmName(name = "encodedFragment")
    @org.jetbrains.annotations.Nullable
    public final java.lang.String encodedFragment() {
            r7 = this;
            java.lang.String r0 = r7.fragment
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r1 = r7.url
            r5 = 6
            r6 = 0
            r2 = 35
            r3 = 0
            r4 = 0
            int r0 = kotlin.text.u.G3(r1, r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            java.lang.String r1 = r7.url
            java.lang.String r0 = r1.substring(r0)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @kotlin.jvm.JvmName(name = "encodedPassword")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String encodedPassword() {
            r7 = this;
            java.lang.String r0 = r7.password
            int r0 = r0.length()
            if (r0 != 0) goto Lb
            java.lang.String r0 = ""
            return r0
        Lb:
            java.lang.String r1 = r7.url
            java.lang.String r0 = r7.scheme
            int r0 = r0.length()
            int r3 = r0 + 3
            r5 = 4
            r6 = 0
            r2 = 58
            r4 = 0
            int r0 = kotlin.text.u.G3(r1, r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            java.lang.String r1 = r7.url
            r5 = 6
            r2 = 64
            r3 = 0
            int r1 = kotlin.text.u.G3(r1, r2, r3, r4, r5, r6)
            java.lang.String r2 = r7.url
            java.lang.String r0 = r2.substring(r0, r1)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @kotlin.jvm.JvmName(name = "encodedPath")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String encodedPath() {
            r6 = this;
            java.lang.String r0 = r6.url
            java.lang.String r1 = r6.scheme
            int r1 = r1.length()
            int r2 = r1 + 3
            r4 = 4
            r5 = 0
            r1 = 47
            r3 = 0
            int r0 = kotlin.text.u.G3(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = r6.url
            java.lang.String r2 = "?#"
            int r3 = r1.length()
            int r1 = okhttp3.internal._UtilCommonKt.delimiterOffset(r1, r2, r0, r3)
            java.lang.String r2 = r6.url
            java.lang.String r0 = r2.substring(r0, r1)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @kotlin.jvm.JvmName(name = "encodedPathSegments")
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> encodedPathSegments() {
            r6 = this;
            java.lang.String r0 = r6.url
            java.lang.String r1 = r6.scheme
            int r1 = r1.length()
            int r2 = r1 + 3
            r4 = 4
            r5 = 0
            r1 = 47
            r3 = 0
            int r0 = kotlin.text.u.G3(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = r6.url
            java.lang.String r2 = "?#"
            int r3 = r1.length()
            int r1 = okhttp3.internal._UtilCommonKt.delimiterOffset(r1, r2, r0, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L24:
            if (r0 >= r1) goto L40
            int r0 = r0 + 1
            java.lang.String r3 = r6.url
            r4 = 47
            int r3 = okhttp3.internal._UtilCommonKt.delimiterOffset(r3, r4, r0, r1)
            java.lang.String r4 = r6.url
            java.lang.String r0 = r4.substring(r0, r3)
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.g0.o(r0, r4)
            r2.add(r0)
            r0 = r3
            goto L24
        L40:
            return r2
    }

    @kotlin.jvm.JvmName(name = "encodedQuery")
    @org.jetbrains.annotations.Nullable
    public final java.lang.String encodedQuery() {
            r7 = this;
            java.util.List<java.lang.String> r0 = r7.queryNamesAndValues
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r1 = r7.url
            r5 = 6
            r6 = 0
            r2 = 63
            r3 = 0
            r4 = 0
            int r0 = kotlin.text.u.G3(r1, r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            java.lang.String r1 = r7.url
            r2 = 35
            int r3 = r1.length()
            int r1 = okhttp3.internal._UtilCommonKt.delimiterOffset(r1, r2, r0, r3)
            java.lang.String r2 = r7.url
            java.lang.String r0 = r2.substring(r0, r1)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @kotlin.jvm.JvmName(name = "encodedUsername")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String encodedUsername() {
            r4 = this;
            java.lang.String r0 = r4.username
            int r0 = r0.length()
            if (r0 != 0) goto Lb
            java.lang.String r0 = ""
            return r0
        Lb:
            java.lang.String r0 = r4.scheme
            int r0 = r0.length()
            int r0 = r0 + 3
            java.lang.String r1 = r4.url
            java.lang.String r2 = ":@"
            int r3 = r1.length()
            int r1 = okhttp3.internal._UtilCommonKt.delimiterOffset(r1, r2, r0, r3)
            java.lang.String r2 = r4.url
            java.lang.String r0 = r2.substring(r0, r1)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okhttp3.HttpUrl
            if (r0 == 0) goto L12
            okhttp3.HttpUrl r2 = (okhttp3.HttpUrl) r2
            java.lang.String r2 = r2.url
            java.lang.String r0 = r1.url
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    @kotlin.jvm.JvmName(name = "fragment")
    @org.jetbrains.annotations.Nullable
    public final java.lang.String fragment() {
            r1 = this;
            java.lang.String r0 = r1.fragment
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.url
            int r0 = r0.hashCode()
            return r0
    }

    @kotlin.jvm.JvmName(name = "host")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String host() {
            r1 = this;
            java.lang.String r0 = r1.host
            return r0
    }

    public final boolean isHttps() {
            r2 = this;
            java.lang.String r0 = r2.scheme
            java.lang.String r1 = "https"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.HttpUrl.Builder newBuilder() {
            r4 = this;
            okhttp3.HttpUrl$Builder r0 = new okhttp3.HttpUrl$Builder
            r0.<init>()
            java.lang.String r1 = r4.scheme
            r0.setScheme$okhttp(r1)
            java.lang.String r1 = r4.encodedUsername()
            r0.setEncodedUsername$okhttp(r1)
            java.lang.String r1 = r4.encodedPassword()
            r0.setEncodedPassword$okhttp(r1)
            java.lang.String r1 = r4.host
            r0.setHost$okhttp(r1)
            int r1 = r4.port
            okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion
            java.lang.String r3 = r4.scheme
            int r2 = r2.defaultPort(r3)
            if (r1 == r2) goto L2c
            int r1 = r4.port
            goto L2d
        L2c:
            r1 = -1
        L2d:
            r0.setPort$okhttp(r1)
            java.util.List r1 = r0.getEncodedPathSegments$okhttp()
            r1.clear()
            java.util.List r1 = r0.getEncodedPathSegments$okhttp()
            java.util.List r2 = r4.encodedPathSegments()
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            java.lang.String r1 = r4.encodedQuery()
            r0.encodedQuery(r1)
            java.lang.String r1 = r4.encodedFragment()
            r0.setEncodedFragment$okhttp(r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.HttpUrl.Builder newBuilder(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "link"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.HttpUrl$Builder r0 = new okhttp3.HttpUrl$Builder     // Catch: java.lang.IllegalArgumentException -> Lf
            r0.<init>()     // Catch: java.lang.IllegalArgumentException -> Lf
            okhttp3.HttpUrl$Builder r2 = r0.parse$okhttp(r1, r2)     // Catch: java.lang.IllegalArgumentException -> Lf
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @kotlin.jvm.JvmName(name = "password")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String password() {
            r1 = this;
            java.lang.String r0 = r1.password
            return r0
    }

    @kotlin.jvm.JvmName(name = "pathSegments")
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> pathSegments() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.pathSegments
            return r0
    }

    @kotlin.jvm.JvmName(name = "pathSize")
    public final int pathSize() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.pathSegments
            int r0 = r0.size()
            return r0
    }

    @kotlin.jvm.JvmName(name = "port")
    public final int port() {
            r1 = this;
            int r0 = r1.port
            return r0
    }

    @kotlin.jvm.JvmName(name = "query")
    @org.jetbrains.annotations.Nullable
    public final java.lang.String query() {
            r3 = this;
            java.util.List<java.lang.String> r0 = r3.queryNamesAndValues
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
            java.util.List<java.lang.String> r2 = r3.queryNamesAndValues
            okhttp3.HttpUrl.Companion.access$toQueryString(r1, r2, r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String queryParameter(@org.jetbrains.annotations.NotNull java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.List<java.lang.String> r0 = r5.queryNamesAndValues
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            r2 = 0
            int r0 = r0.size()
            kotlin.ranges.m r0 = kotlin.ranges.t.W1(r2, r0)
            r2 = 2
            kotlin.ranges.k r0 = kotlin.ranges.t.B1(r0, r2)
            int r2 = r0.e()
            int r3 = r0.f()
            int r0 = r0.g()
            if (r0 <= 0) goto L29
            if (r2 <= r3) goto L2d
        L29:
            if (r0 >= 0) goto L48
            if (r3 > r2) goto L48
        L2d:
            java.util.List<java.lang.String> r4 = r5.queryNamesAndValues
            java.lang.Object r4 = r4.get(r2)
            boolean r4 = kotlin.jvm.internal.g0.g(r6, r4)
            if (r4 == 0) goto L44
            java.util.List<java.lang.String> r6 = r5.queryNamesAndValues
            int r2 = r2 + 1
            java.lang.Object r6 = r6.get(r2)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L44:
            if (r2 == r3) goto L48
            int r2 = r2 + r0
            goto L2d
        L48:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String queryParameterName(int r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.queryNamesAndValues
            if (r0 == 0) goto L10
            int r2 = r2 * 2
            java.lang.Object r2 = r0.get(r2)
            kotlin.jvm.internal.g0.m(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L10:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    @kotlin.jvm.JvmName(name = "queryParameterNames")
    @org.jetbrains.annotations.NotNull
    public final java.util.Set<java.lang.String> queryParameterNames() {
            r5 = this;
            java.util.List<java.lang.String> r0 = r5.queryNamesAndValues
            if (r0 != 0) goto L9
            java.util.Set r0 = kotlin.collections.u1.k()
            return r0
        L9:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.util.List<java.lang.String> r1 = r5.queryNamesAndValues
            int r1 = r1.size()
            r2 = 2
            int r1 = r1 / r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r3)
            java.util.List<java.lang.String> r1 = r5.queryNamesAndValues
            int r1 = r1.size()
            r3 = 0
            kotlin.ranges.m r1 = kotlin.ranges.t.W1(r3, r1)
            kotlin.ranges.k r1 = kotlin.ranges.t.B1(r1, r2)
            int r2 = r1.e()
            int r3 = r1.f()
            int r1 = r1.g()
            if (r1 <= 0) goto L37
            if (r2 <= r3) goto L3b
        L37:
            if (r1 >= 0) goto L4b
            if (r3 > r2) goto L4b
        L3b:
            java.util.List<java.lang.String> r4 = r5.queryNamesAndValues
            java.lang.Object r4 = r4.get(r2)
            kotlin.jvm.internal.g0.m(r4)
            r0.add(r4)
            if (r2 == r3) goto L4b
            int r2 = r2 + r1
            goto L3b
        L4b:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            java.lang.String r1 = "unmodifiableSet(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String queryParameterValue(int r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.queryNamesAndValues
            if (r0 == 0) goto Lf
            int r2 = r2 * 2
            int r2 = r2 + 1
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        Lf:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> queryParameterValues(@org.jetbrains.annotations.NotNull java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.util.List<java.lang.String> r0 = r6.queryNamesAndValues
            if (r0 != 0) goto Le
            java.util.List r7 = kotlin.collections.f0.J()
            return r7
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            java.util.List<java.lang.String> r1 = r6.queryNamesAndValues
            int r1 = r1.size()
            r2 = 0
            kotlin.ranges.m r1 = kotlin.ranges.t.W1(r2, r1)
            r2 = 2
            kotlin.ranges.k r1 = kotlin.ranges.t.B1(r1, r2)
            int r2 = r1.e()
            int r3 = r1.f()
            int r1 = r1.g()
            if (r1 <= 0) goto L34
            if (r2 <= r3) goto L38
        L34:
            if (r1 >= 0) goto L53
            if (r3 > r2) goto L53
        L38:
            java.util.List<java.lang.String> r4 = r6.queryNamesAndValues
            java.lang.Object r4 = r4.get(r2)
            boolean r4 = kotlin.jvm.internal.g0.g(r7, r4)
            if (r4 == 0) goto L4f
            java.util.List<java.lang.String> r4 = r6.queryNamesAndValues
            int r5 = r2 + 1
            java.lang.Object r4 = r4.get(r5)
            r0.add(r4)
        L4f:
            if (r2 == r3) goto L53
            int r2 = r2 + r1
            goto L38
        L53:
            java.util.List r7 = java.util.Collections.unmodifiableList(r0)
            java.lang.String r0 = "unmodifiableList(...)"
            kotlin.jvm.internal.g0.o(r7, r0)
            return r7
    }

    @kotlin.jvm.JvmName(name = "querySize")
    public final int querySize() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.queryNamesAndValues
            if (r0 == 0) goto Lb
            int r0 = r0.size()
            int r0 = r0 / 2
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String redact() {
            r2 = this;
            java.lang.String r0 = "/..."
            okhttp3.HttpUrl$Builder r0 = r2.newBuilder(r0)
            kotlin.jvm.internal.g0.m(r0)
            java.lang.String r1 = ""
            okhttp3.HttpUrl$Builder r0 = r0.username(r1)
            okhttp3.HttpUrl$Builder r0 = r0.password(r1)
            okhttp3.HttpUrl r0 = r0.build()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.HttpUrl resolve(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "link"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.HttpUrl$Builder r2 = r1.newBuilder(r2)
            if (r2 == 0) goto L10
            okhttp3.HttpUrl r2 = r2.build()
            return r2
        L10:
            r2 = 0
            return r2
    }

    @kotlin.jvm.JvmName(name = "scheme")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String scheme() {
            r1 = this;
            java.lang.String r0 = r1.scheme
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String topPrivateDomain() {
            r2 = this;
            java.lang.String r0 = r2.host
            boolean r0 = okhttp3.internal._HostnamesCommonKt.canParseAsIpAddress(r0)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = r0.get()
            java.lang.String r1 = r2.host
            java.lang.String r0 = r0.getEffectiveTldPlusOne(r1)
            return r0
    }

    @kotlin.jvm.JvmName(name = "uri")
    @org.jetbrains.annotations.NotNull
    public final java.net.URI uri() {
            r4 = this;
            okhttp3.HttpUrl$Builder r0 = r4.newBuilder()
            okhttp3.HttpUrl$Builder r0 = r0.reencodeForUri$okhttp()
            java.lang.String r0 = r0.toString()
            java.net.URI r1 = new java.net.URI     // Catch: java.net.URISyntaxException -> L12
            r1.<init>(r0)     // Catch: java.net.URISyntaxException -> L12
            return r1
        L12:
            r1 = move-exception
            kotlin.text.Regex r2 = new kotlin.text.Regex     // Catch: java.lang.Exception -> L28
            java.lang.String r3 = "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]"
            r2.<init>(r3)     // Catch: java.lang.Exception -> L28
            java.lang.String r3 = ""
            java.lang.String r0 = r2.replace(r0, r3)     // Catch: java.lang.Exception -> L28
            java.net.URI r0 = java.net.URI.create(r0)     // Catch: java.lang.Exception -> L28
            kotlin.jvm.internal.g0.m(r0)
            return r0
        L28:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
    }

    @kotlin.jvm.JvmName(name = "url")
    @org.jetbrains.annotations.NotNull
    public final java.net.URL url() {
            r2 = this;
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L8
            java.lang.String r1 = r2.url     // Catch: java.net.MalformedURLException -> L8
            r0.<init>(r1)     // Catch: java.net.MalformedURLException -> L8
            return r0
        L8:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    @kotlin.jvm.JvmName(name = "username")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String username() {
            r1 = this;
            java.lang.String r0 = r1.username
            return r0
    }
}
