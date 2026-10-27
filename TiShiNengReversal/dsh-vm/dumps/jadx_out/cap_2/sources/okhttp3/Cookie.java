package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Cookie {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Cookie.Companion Companion = null;
    private static final java.util.regex.Pattern DAY_OF_MONTH_PATTERN = null;
    private static final java.util.regex.Pattern MONTH_PATTERN = null;
    private static final java.util.regex.Pattern TIME_PATTERN = null;
    private static final java.util.regex.Pattern YEAR_PATTERN = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String path;
    private final boolean persistent;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String sameSite;
    private final boolean secure;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCookie.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cookie.kt\nokhttp3/Cookie$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,727:1\n1#2:728\n*E\n"})
    public static final class Builder {

        @org.jetbrains.annotations.Nullable
        private java.lang.String domain;
        private long expiresAt;
        private boolean hostOnly;
        private boolean httpOnly;

        @org.jetbrains.annotations.Nullable
        private java.lang.String name;

        @org.jetbrains.annotations.NotNull
        private java.lang.String path;
        private boolean persistent;

        @org.jetbrains.annotations.Nullable
        private java.lang.String sameSite;
        private boolean secure;

        @org.jetbrains.annotations.Nullable
        private java.lang.String value;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                r2.expiresAt = r0
                java.lang.String r0 = "/"
                r2.path = r0
                return
        }

        public Builder(@org.jetbrains.annotations.NotNull okhttp3.Cookie r3) {
                r2 = this;
                java.lang.String r0 = "cookie"
                kotlin.jvm.internal.g0.p(r3, r0)
                r2.<init>()
                java.lang.String r0 = r3.name()
                r2.name = r0
                java.lang.String r0 = r3.value()
                r2.value = r0
                long r0 = r3.expiresAt()
                r2.expiresAt = r0
                java.lang.String r0 = r3.domain()
                r2.domain = r0
                java.lang.String r0 = r3.path()
                r2.path = r0
                boolean r0 = r3.secure()
                r2.secure = r0
                boolean r0 = r3.httpOnly()
                r2.httpOnly = r0
                boolean r0 = r3.persistent()
                r2.persistent = r0
                boolean r0 = r3.hostOnly()
                r2.hostOnly = r0
                java.lang.String r3 = r3.sameSite()
                r2.sameSite = r3
                return
        }

        private final okhttp3.Cookie.Builder domain(java.lang.String r3, boolean r4) {
                r2 = this;
                java.lang.String r0 = okhttp3.internal._HostnamesCommonKt.toCanonicalHost(r3)
                if (r0 == 0) goto Lb
                r2.domain = r0
                r2.hostOnly = r4
                return r2
            Lb:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "unexpected domain: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Cookie build() {
                r13 = this;
                okhttp3.Cookie r0 = new okhttp3.Cookie
                java.lang.String r1 = r13.name
                if (r1 == 0) goto L31
                java.lang.String r2 = r13.value
                if (r2 == 0) goto L29
                long r3 = r13.expiresAt
                java.lang.String r5 = r13.domain
                if (r5 == 0) goto L21
                java.lang.String r6 = r13.path
                boolean r7 = r13.secure
                boolean r8 = r13.httpOnly
                boolean r9 = r13.persistent
                boolean r10 = r13.hostOnly
                java.lang.String r11 = r13.sameSite
                r12 = 0
                r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12)
                return r0
            L21:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "builder.domain == null"
                r0.<init>(r1)
                throw r0
            L29:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "builder.value == null"
                r0.<init>(r1)
                throw r0
            L31:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "builder.name == null"
                r0.<init>(r1)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Cookie.Builder domain(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "domain"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 0
                okhttp3.Cookie$Builder r2 = r1.domain(r2, r0)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Cookie.Builder expiresAt(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 > 0) goto L8
                r4 = -9223372036854775808
            L8:
                r0 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 <= 0) goto L12
                r4 = r0
            L12:
                r3.expiresAt = r4
                r4 = 1
                r3.persistent = r4
                return r3
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Cookie.Builder hostOnlyDomain(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "domain"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 1
                okhttp3.Cookie$Builder r2 = r1.domain(r2, r0)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Cookie.Builder httpOnly() {
                r1 = this;
                r0 = 1
                r1.httpOnly = r0
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Cookie.Builder name(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.CharSequence r0 = kotlin.text.u.Z5(r2)
                java.lang.String r0 = r0.toString()
                boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
                if (r0 == 0) goto L16
                r1.name = r2
                return r1
            L16:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "name is not trimmed"
                r2.<init>(r0)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Cookie.Builder path(@org.jetbrains.annotations.NotNull java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = "path"
                kotlin.jvm.internal.g0.p(r5, r0)
                r0 = 2
                r1 = 0
                java.lang.String r2 = "/"
                r3 = 0
                boolean r0 = kotlin.text.u.H2(r5, r2, r3, r0, r1)
                if (r0 == 0) goto L13
                r4.path = r5
                return r4
            L13:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "path must start with '/'"
                r5.<init>(r0)
                throw r5
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Cookie.Builder sameSite(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "sameSite"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.CharSequence r0 = kotlin.text.u.Z5(r2)
                java.lang.String r0 = r0.toString()
                boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
                if (r0 == 0) goto L16
                r1.sameSite = r2
                return r1
            L16:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "sameSite is not trimmed"
                r2.<init>(r0)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Cookie.Builder secure() {
                r1 = this;
                r0 = 1
                r1.secure = r0
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Cookie.Builder value(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.CharSequence r0 = kotlin.text.u.Z5(r2)
                java.lang.String r0 = r0.toString()
                boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
                if (r0 == 0) goto L16
                r1.value = r2
                return r1
            L16:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "value is not trimmed"
                r2.<init>(r0)
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCookie.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cookie.kt\nokhttp3/Cookie$Companion\n+ 2 -UtilJvm.kt\nokhttp3/internal/_UtilJvmKt\n*L\n1#1,727:1\n242#2:728\n*S KotlinDebug\n*F\n+ 1 Cookie.kt\nokhttp3/Cookie$Companion\n*L\n723#1:728\n*E\n"})
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

        public static final /* synthetic */ boolean access$domainMatch(okhttp3.Cookie.Companion r0, java.lang.String r1, java.lang.String r2) {
                boolean r0 = r0.domainMatch(r1, r2)
                return r0
        }

        public static final /* synthetic */ boolean access$pathMatch(okhttp3.Cookie.Companion r0, okhttp3.HttpUrl r1, java.lang.String r2) {
                boolean r0 = r0.pathMatch(r1, r2)
                return r0
        }

        private final int dateCharacterOffset(java.lang.String r5, int r6, int r7, boolean r8) {
                r4 = this;
            L0:
                if (r6 >= r7) goto L3c
                char r0 = r5.charAt(r6)
                r1 = 32
                r2 = 1
                if (r0 >= r1) goto Lf
                r1 = 9
                if (r0 != r1) goto L33
            Lf:
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 >= r1) goto L33
                r1 = 48
                r3 = 58
                if (r1 > r0) goto L1c
                if (r0 >= r3) goto L1c
                goto L33
            L1c:
                r1 = 97
                if (r1 > r0) goto L25
                r1 = 123(0x7b, float:1.72E-43)
                if (r0 >= r1) goto L25
                goto L33
            L25:
                r1 = 65
                if (r1 > r0) goto L2e
                r1 = 91
                if (r0 >= r1) goto L2e
                goto L33
            L2e:
                if (r0 != r3) goto L31
                goto L33
            L31:
                r0 = 0
                goto L34
            L33:
                r0 = 1
            L34:
                r1 = r8 ^ 1
                if (r0 != r1) goto L39
                return r6
            L39:
                int r6 = r6 + 1
                goto L0
            L3c:
                return r7
        }

        private final boolean domainMatch(java.lang.String r5, java.lang.String r6) {
                r4 = this;
                boolean r0 = kotlin.jvm.internal.g0.g(r5, r6)
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                r0 = 2
                r2 = 0
                r3 = 0
                boolean r0 = kotlin.text.u.Z1(r5, r6, r3, r0, r2)
                if (r0 == 0) goto L2a
                int r0 = r5.length()
                int r6 = r6.length()
                int r0 = r0 - r6
                int r0 = r0 - r1
                char r6 = r5.charAt(r0)
                r0 = 46
                if (r6 != r0) goto L2a
                boolean r5 = okhttp3.internal._HostnamesCommonKt.canParseAsIpAddress(r5)
                if (r5 != 0) goto L2a
                return r1
            L2a:
                return r3
        }

        private final java.lang.String parseDomain(java.lang.String r5) {
                r4 = this;
                r0 = 2
                r1 = 0
                java.lang.String r2 = "."
                r3 = 0
                boolean r0 = kotlin.text.u.Z1(r5, r2, r3, r0, r1)
                if (r0 != 0) goto L1c
                java.lang.String r5 = kotlin.text.u.v4(r5, r2)
                java.lang.String r5 = okhttp3.internal._HostnamesCommonKt.toCanonicalHost(r5)
                if (r5 == 0) goto L16
                return r5
            L16:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                r5.<init>()
                throw r5
            L1c:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Failed requirement."
                r5.<init>(r0)
                throw r5
        }

        private final long parseExpires(java.lang.String r23, int r24, int r25) {
                r22 = this;
                r0 = r22
                r1 = r23
                r2 = r25
                r3 = 0
                r4 = r24
                int r4 = r0.dateCharacterOffset(r1, r4, r2, r3)
                java.util.regex.Pattern r5 = okhttp3.Cookie.access$getTIME_PATTERN$cp()
                java.util.regex.Matcher r5 = r5.matcher(r1)
                r6 = -1
                r7 = -1
                r8 = -1
                r9 = -1
                r10 = -1
                r11 = -1
                r12 = -1
            L1c:
                r13 = 2
                r14 = 1
                if (r4 >= r2) goto Le6
                int r15 = r4 + 1
                int r15 = r0.dateCharacterOffset(r1, r15, r2, r14)
                r5.region(r4, r15)
                java.lang.String r4 = "group(...)"
                if (r8 != r6) goto L5f
                java.util.regex.Pattern r3 = okhttp3.Cookie.access$getTIME_PATTERN$cp()
                java.util.regex.Matcher r3 = r5.usePattern(r3)
                boolean r3 = r3.matches()
                if (r3 == 0) goto L5f
                java.lang.String r3 = r5.group(r14)
                kotlin.jvm.internal.g0.o(r3, r4)
                int r8 = java.lang.Integer.parseInt(r3)
                java.lang.String r3 = r5.group(r13)
                kotlin.jvm.internal.g0.o(r3, r4)
                int r11 = java.lang.Integer.parseInt(r3)
                r3 = 3
                java.lang.String r3 = r5.group(r3)
                kotlin.jvm.internal.g0.o(r3, r4)
                int r12 = java.lang.Integer.parseInt(r3)
                goto Ldd
            L5f:
                if (r9 != r6) goto L7b
                java.util.regex.Pattern r3 = okhttp3.Cookie.access$getDAY_OF_MONTH_PATTERN$cp()
                java.util.regex.Matcher r3 = r5.usePattern(r3)
                boolean r3 = r3.matches()
                if (r3 == 0) goto L7b
                java.lang.String r3 = r5.group(r14)
                kotlin.jvm.internal.g0.o(r3, r4)
                int r9 = java.lang.Integer.parseInt(r3)
                goto Ldd
            L7b:
                if (r10 != r6) goto Lc2
                java.util.regex.Pattern r3 = okhttp3.Cookie.access$getMONTH_PATTERN$cp()
                java.util.regex.Matcher r3 = r5.usePattern(r3)
                boolean r3 = r3.matches()
                if (r3 == 0) goto Lc2
                java.lang.String r3 = r5.group(r14)
                kotlin.jvm.internal.g0.o(r3, r4)
                java.util.Locale r4 = java.util.Locale.US
                java.lang.String r10 = "US"
                kotlin.jvm.internal.g0.o(r4, r10)
                java.lang.String r3 = r3.toLowerCase(r4)
                java.lang.String r4 = "toLowerCase(...)"
                kotlin.jvm.internal.g0.o(r3, r4)
                java.util.regex.Pattern r4 = okhttp3.Cookie.access$getMONTH_PATTERN$cp()
                java.lang.String r4 = r4.pattern()
                java.lang.String r10 = "pattern(...)"
                kotlin.jvm.internal.g0.o(r4, r10)
                r20 = 6
                r21 = 0
                r18 = 0
                r19 = 0
                r17 = r3
                r16 = r4
                int r3 = kotlin.text.u.H3(r16, r17, r18, r19, r20, r21)
                int r10 = r3 / 4
                goto Ldd
            Lc2:
                if (r7 != r6) goto Ldd
                java.util.regex.Pattern r3 = okhttp3.Cookie.access$getYEAR_PATTERN$cp()
                java.util.regex.Matcher r3 = r5.usePattern(r3)
                boolean r3 = r3.matches()
                if (r3 == 0) goto Ldd
                java.lang.String r3 = r5.group(r14)
                kotlin.jvm.internal.g0.o(r3, r4)
                int r7 = java.lang.Integer.parseInt(r3)
            Ldd:
                int r15 = r15 + 1
                r3 = 0
                int r4 = r0.dateCharacterOffset(r1, r15, r2, r3)
                goto L1c
            Le6:
                r1 = 70
                if (r1 > r7) goto Lf0
                r2 = 100
                if (r7 >= r2) goto Lf0
                int r7 = r7 + 1900
            Lf0:
                if (r7 < 0) goto Lf6
                if (r7 >= r1) goto Lf6
                int r7 = r7 + 2000
            Lf6:
                r1 = 1601(0x641, float:2.243E-42)
                java.lang.String r2 = "Failed requirement."
                if (r7 < r1) goto L162
                if (r10 == r6) goto L15c
                if (r14 > r9) goto L156
                r1 = 32
                if (r9 >= r1) goto L156
                if (r8 < 0) goto L150
                r1 = 24
                if (r8 >= r1) goto L150
                if (r11 < 0) goto L14a
                r1 = 60
                if (r11 >= r1) goto L14a
                if (r12 < 0) goto L144
                if (r12 >= r1) goto L144
                java.util.GregorianCalendar r1 = new java.util.GregorianCalendar
                java.util.TimeZone r2 = okhttp3.internal._UtilJvmKt.UTC
                r1.<init>(r2)
                r3 = 0
                r1.setLenient(r3)
                r1.set(r14, r7)
                int r10 = r10 - r14
                r1.set(r13, r10)
                r2 = 5
                r1.set(r2, r9)
                r2 = 11
                r1.set(r2, r8)
                r2 = 12
                r1.set(r2, r11)
                r2 = 13
                r1.set(r2, r12)
                r2 = 14
                r3 = 0
                r1.set(r2, r3)
                long r1 = r1.getTimeInMillis()
                return r1
            L144:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                r1.<init>(r2)
                throw r1
            L14a:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                r1.<init>(r2)
                throw r1
            L150:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                r1.<init>(r2)
                throw r1
            L156:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                r1.<init>(r2)
                throw r1
            L15c:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                r1.<init>(r2)
                throw r1
            L162:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                r1.<init>(r2)
                throw r1
        }

        private final long parseMaxAge(java.lang.String r7) {
                r6 = this;
                r0 = -9223372036854775808
                long r2 = java.lang.Long.parseLong(r7)     // Catch: java.lang.NumberFormatException -> Le
                r4 = 0
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 > 0) goto Ld
                return r0
            Ld:
                return r2
            Le:
                r2 = move-exception
                kotlin.text.Regex r3 = new kotlin.text.Regex
                java.lang.String r4 = "-?\\d+"
                r3.<init>(r4)
                boolean r3 = r3.matches(r7)
                if (r3 == 0) goto L2e
                r2 = 2
                r3 = 0
                java.lang.String r4 = "-"
                r5 = 0
                boolean r7 = kotlin.text.u.H2(r7, r4, r5, r2, r3)
                if (r7 == 0) goto L28
                goto L2d
            L28:
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L2d:
                return r0
            L2e:
                throw r2
        }

        private final boolean pathMatch(okhttp3.HttpUrl r6, java.lang.String r7) {
                r5 = this;
                java.lang.String r6 = r6.encodedPath()
                boolean r0 = kotlin.jvm.internal.g0.g(r6, r7)
                r1 = 1
                if (r0 == 0) goto Lc
                return r1
            Lc:
                r0 = 0
                r2 = 2
                r3 = 0
                boolean r4 = kotlin.text.u.H2(r6, r7, r0, r2, r3)
                if (r4 == 0) goto L2b
                java.lang.String r4 = "/"
                boolean r2 = kotlin.text.u.Z1(r7, r4, r0, r2, r3)
                if (r2 == 0) goto L1e
                return r1
            L1e:
                int r7 = r7.length()
                char r6 = r6.charAt(r7)
                r7 = 47
                if (r6 != r7) goto L2b
                return r1
            L2b:
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.Nullable
        public final okhttp3.Cookie parse(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
                r2 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "setCookie"
                kotlin.jvm.internal.g0.p(r4, r0)
                long r0 = java.lang.System.currentTimeMillis()
                okhttp3.Cookie r3 = r2.parse$okhttp(r0, r3, r4)
                return r3
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.Cookie parse$okhttp(long r34, @org.jetbrains.annotations.NotNull okhttp3.HttpUrl r36, @org.jetbrains.annotations.NotNull java.lang.String r37) {
                r33 = this;
                r0 = r33
                r1 = r37
                java.lang.String r2 = "url"
                r7 = r36
                kotlin.jvm.internal.g0.p(r7, r2)
                java.lang.String r2 = "setCookie"
                kotlin.jvm.internal.g0.p(r1, r2)
                r5 = 6
                r6 = 0
                r2 = 59
                r3 = 0
                r4 = 0
                int r4 = okhttp3.internal._UtilCommonKt.delimiterOffset$default(r1, r2, r3, r4, r5, r6)
                r5 = 2
                r2 = 61
                int r2 = okhttp3.internal._UtilCommonKt.delimiterOffset$default(r1, r2, r3, r4, r5, r6)
                r3 = 0
                if (r2 != r4) goto L25
                return r3
            L25:
                r5 = 0
                r6 = 1
                java.lang.String r8 = okhttp3.internal._UtilCommonKt.trimSubstring$default(r1, r5, r2, r6, r3)
                int r9 = r8.length()
                if (r9 != 0) goto L32
                goto L39
            L32:
                int r9 = okhttp3.internal._UtilCommonKt.indexOfControlOrNonAscii(r8)
                r10 = -1
                if (r9 == r10) goto L3a
            L39:
                return r3
            L3a:
                int r2 = r2 + r6
                java.lang.String r9 = okhttp3.internal._UtilCommonKt.trimSubstring(r1, r2, r4)
                int r2 = okhttp3.internal._UtilCommonKt.indexOfControlOrNonAscii(r9)
                if (r2 == r10) goto L46
                return r3
            L46:
                int r4 = r4 + r6
                int r2 = r1.length()
                r10 = r3
                r11 = r10
                r21 = r11
                r14 = -1
                r16 = -1
                r18 = 0
                r19 = 1
                r20 = 0
                r22 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                r24 = 0
            L60:
                if (r4 >= r2) goto Le4
                r25 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                r12 = 59
                int r12 = okhttp3.internal._UtilCommonKt.delimiterOffset(r1, r12, r4, r2)
                r13 = 61
                int r13 = okhttp3.internal._UtilCommonKt.delimiterOffset(r1, r13, r4, r12)
                java.lang.String r4 = okhttp3.internal._UtilCommonKt.trimSubstring(r1, r4, r13)
                if (r13 >= r12) goto L82
                int r13 = r13 + 1
                java.lang.String r13 = okhttp3.internal._UtilCommonKt.trimSubstring(r1, r13, r12)
            L7f:
                r27 = r3
                goto L85
            L82:
                java.lang.String r13 = ""
                goto L7f
            L85:
                java.lang.String r3 = "expires"
                boolean r3 = kotlin.text.u.a2(r4, r3, r6)
                if (r3 == 0) goto L98
                int r3 = r13.length()     // Catch: java.lang.Throwable -> Lde
                long r22 = r0.parseExpires(r13, r5, r3)     // Catch: java.lang.Throwable -> Lde
            L95:
                r20 = 1
                goto Lde
            L98:
                java.lang.String r3 = "max-age"
                boolean r3 = kotlin.text.u.a2(r4, r3, r6)
                if (r3 == 0) goto La5
                long r14 = r0.parseMaxAge(r13)
                goto L95
            La5:
                java.lang.String r3 = "domain"
                boolean r3 = kotlin.text.u.a2(r4, r3, r6)
                if (r3 == 0) goto Lb4
                java.lang.String r10 = r0.parseDomain(r13)     // Catch: java.lang.Throwable -> Lde
                r19 = 0
                goto Lde
            Lb4:
                java.lang.String r3 = "path"
                boolean r3 = kotlin.text.u.a2(r4, r3, r6)
                if (r3 == 0) goto Lbe
                r11 = r13
                goto Lde
            Lbe:
                java.lang.String r3 = "secure"
                boolean r3 = kotlin.text.u.a2(r4, r3, r6)
                if (r3 == 0) goto Lc9
                r24 = 1
                goto Lde
            Lc9:
                java.lang.String r3 = "httponly"
                boolean r3 = kotlin.text.u.a2(r4, r3, r6)
                if (r3 == 0) goto Ld4
                r18 = 1
                goto Lde
            Ld4:
                java.lang.String r3 = "samesite"
                boolean r3 = kotlin.text.u.a2(r4, r3, r6)
                if (r3 == 0) goto Lde
                r21 = r13
            Lde:
                int r4 = r12 + 1
                r3 = r27
                goto L60
            Le4:
                r27 = r3
                r25 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                r1 = -9223372036854775808
                int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
                if (r3 != 0) goto Lf3
                r12 = r1
                goto L11d
            Lf3:
                int r1 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r1 == 0) goto L11b
                r1 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
                int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
                if (r3 > 0) goto L106
                r1 = 1000(0x3e8, float:1.401E-42)
                long r1 = (long) r1
                long r14 = r14 * r1
                goto L10b
            L106:
                r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L10b:
                long r14 = r34 + r14
                int r1 = (r14 > r34 ? 1 : (r14 == r34 ? 0 : -1))
                if (r1 < 0) goto L118
                int r1 = (r14 > r25 ? 1 : (r14 == r25 ? 0 : -1))
                if (r1 <= 0) goto L116
                goto L118
            L116:
                r12 = r14
                goto L11d
            L118:
                r12 = r25
                goto L11d
            L11b:
                r12 = r22
            L11d:
                java.lang.String r1 = r7.host()
                if (r10 != 0) goto L125
                r10 = r1
                goto L12c
            L125:
                boolean r2 = r0.domainMatch(r1, r10)
                if (r2 != 0) goto L12c
                return r27
            L12c:
                int r1 = r1.length()
                int r2 = r10.length()
                if (r1 == r2) goto L143
                okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r1 = r1.get()
                java.lang.String r1 = r1.getEffectiveTldPlusOne(r10)
                if (r1 != 0) goto L143
                return r27
            L143:
                java.lang.String r1 = "/"
                if (r11 == 0) goto L150
                r2 = 2
                r3 = r27
                boolean r2 = kotlin.text.u.H2(r11, r1, r5, r2, r3)
                if (r2 != 0) goto L170
            L150:
                java.lang.String r25 = r7.encodedPath()
                r29 = 6
                r30 = 0
                r26 = 47
                r27 = 0
                r28 = 0
                int r2 = kotlin.text.u.V3(r25, r26, r27, r28, r29, r30)
                r3 = r25
                if (r2 == 0) goto L16f
                java.lang.String r1 = r3.substring(r5, r2)
                java.lang.String r2 = "substring(...)"
                kotlin.jvm.internal.g0.o(r1, r2)
            L16f:
                r11 = r1
            L170:
                okhttp3.Cookie r7 = new okhttp3.Cookie
                r17 = r19
                r19 = 0
                r15 = r18
                r16 = r20
                r18 = r21
                r14 = r24
                r31 = r12
                r12 = r10
                r13 = r11
                r10 = r31
                r7.<init>(r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19)
                return r7
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final java.util.List<okhttp3.Cookie> parseAll(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r6, @org.jetbrains.annotations.NotNull okhttp3.Headers r7) {
                r5 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "headers"
                kotlin.jvm.internal.g0.p(r7, r0)
                java.lang.String r0 = "Set-Cookie"
                java.util.List r7 = r7.values(r0)
                int r0 = r7.size()
                r1 = 0
                r2 = 0
                r3 = r1
            L17:
                if (r2 >= r0) goto L33
                java.lang.Object r4 = r7.get(r2)
                java.lang.String r4 = (java.lang.String) r4
                okhttp3.Cookie r4 = r5.parse(r6, r4)
                if (r4 != 0) goto L26
                goto L30
            L26:
                if (r3 != 0) goto L2d
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
            L2d:
                r3.add(r4)
            L30:
                int r2 = r2 + 1
                goto L17
            L33:
                if (r3 == 0) goto L3e
                java.util.List r1 = java.util.Collections.unmodifiableList(r3)
                java.lang.String r6 = "unmodifiableList(...)"
                kotlin.jvm.internal.g0.o(r1, r6)
            L3e:
                if (r1 != 0) goto L45
                java.util.List r6 = kotlin.collections.f0.J()
                return r6
            L45:
                return r1
        }
    }

    static {
            okhttp3.Cookie$Companion r0 = new okhttp3.Cookie$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.Cookie.Companion = r0
            java.lang.String r0 = "(\\d{2,4})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.Cookie.YEAR_PATTERN = r0
            java.lang.String r0 = "(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.Cookie.MONTH_PATTERN = r0
            java.lang.String r0 = "(\\d{1,2})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.Cookie.DAY_OF_MONTH_PATTERN = r0
            java.lang.String r0 = "(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.Cookie.TIME_PATTERN = r0
            return
    }

    private Cookie(java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, boolean r9, boolean r10, java.lang.String r11) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.value = r2
            r0.expiresAt = r3
            r0.domain = r5
            r0.path = r6
            r0.secure = r7
            r0.httpOnly = r8
            r0.persistent = r9
            r0.hostOnly = r10
            r0.sameSite = r11
            return
    }

    public /* synthetic */ Cookie(java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, boolean r9, boolean r10, java.lang.String r11, kotlin.jvm.internal.v r12) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getDAY_OF_MONTH_PATTERN$cp() {
            java.util.regex.Pattern r0 = okhttp3.Cookie.DAY_OF_MONTH_PATTERN
            return r0
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getMONTH_PATTERN$cp() {
            java.util.regex.Pattern r0 = okhttp3.Cookie.MONTH_PATTERN
            return r0
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getTIME_PATTERN$cp() {
            java.util.regex.Pattern r0 = okhttp3.Cookie.TIME_PATTERN
            return r0
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getYEAR_PATTERN$cp() {
            java.util.regex.Pattern r0 = okhttp3.Cookie.YEAR_PATTERN
            return r0
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.Nullable
    public static final okhttp3.Cookie parse(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            okhttp3.Cookie r1 = r0.parse(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<okhttp3.Cookie> parseAll(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r1, @org.jetbrains.annotations.NotNull okhttp3.Headers r2) {
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            java.util.List r1 = r0.parseAll(r1, r2)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "domain", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_domain")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_domain, reason: not valid java name */
    public final java.lang.String m73deprecated_domain() {
            r1 = this;
            java.lang.String r0 = r1.domain
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "expiresAt", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_expiresAt")
    /* renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m74deprecated_expiresAt() {
            r2 = this;
            long r0 = r2.expiresAt
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "hostOnly", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_hostOnly")
    /* renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m75deprecated_hostOnly() {
            r1 = this;
            boolean r0 = r1.hostOnly
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "httpOnly", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_httpOnly")
    /* renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m76deprecated_httpOnly() {
            r1 = this;
            boolean r0 = r1.httpOnly
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "name", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_name")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_name, reason: not valid java name */
    public final java.lang.String m77deprecated_name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "path", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_path")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_path, reason: not valid java name */
    public final java.lang.String m78deprecated_path() {
            r1 = this;
            java.lang.String r0 = r1.path
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "persistent", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_persistent")
    /* renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m79deprecated_persistent() {
            r1 = this;
            boolean r0 = r1.persistent
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "secure", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_secure")
    /* renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m80deprecated_secure() {
            r1 = this;
            boolean r0 = r1.secure
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "value", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_value")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_value, reason: not valid java name */
    public final java.lang.String m81deprecated_value() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }

    @kotlin.jvm.JvmName(name = "domain")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String domain() {
            r1 = this;
            java.lang.String r0 = r1.domain
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof okhttp3.Cookie
            if (r0 == 0) goto L5a
            okhttp3.Cookie r6 = (okhttp3.Cookie) r6
            java.lang.String r0 = r6.name
            java.lang.String r1 = r5.name
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L5a
            java.lang.String r0 = r6.value
            java.lang.String r1 = r5.value
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L5a
            long r0 = r6.expiresAt
            long r2 = r5.expiresAt
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L5a
            java.lang.String r0 = r6.domain
            java.lang.String r1 = r5.domain
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L5a
            java.lang.String r0 = r6.path
            java.lang.String r1 = r5.path
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L5a
            boolean r0 = r6.secure
            boolean r1 = r5.secure
            if (r0 != r1) goto L5a
            boolean r0 = r6.httpOnly
            boolean r1 = r5.httpOnly
            if (r0 != r1) goto L5a
            boolean r0 = r6.persistent
            boolean r1 = r5.persistent
            if (r0 != r1) goto L5a
            boolean r0 = r6.hostOnly
            boolean r1 = r5.hostOnly
            if (r0 != r1) goto L5a
            java.lang.String r6 = r6.sameSite
            java.lang.String r0 = r5.sameSite
            boolean r6 = kotlin.jvm.internal.g0.g(r6, r0)
            if (r6 == 0) goto L5a
            r6 = 1
            return r6
        L5a:
            r6 = 0
            return r6
    }

    @kotlin.jvm.JvmName(name = "expiresAt")
    public final long expiresAt() {
            r2 = this;
            long r0 = r2.expiresAt
            return r0
    }

    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.name
            int r0 = r0.hashCode()
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.value
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r2 = r4.expiresAt
            int r0 = androidx.camera.camera2.internal.compat.params.e.a(r2)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.domain
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.path
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r4.secure
            int r0 = kotlin.reflect.jvm.internal.impl.km.f.a(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r4.httpOnly
            int r0 = kotlin.reflect.jvm.internal.impl.km.f.a(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r4.persistent
            int r0 = kotlin.reflect.jvm.internal.impl.km.f.a(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r4.hostOnly
            int r0 = kotlin.reflect.jvm.internal.impl.km.f.a(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.sameSite
            if (r0 == 0) goto L5c
            int r0 = r0.hashCode()
            goto L5d
        L5c:
            r0 = 0
        L5d:
            int r1 = r1 + r0
            return r1
    }

    @kotlin.jvm.JvmName(name = "hostOnly")
    public final boolean hostOnly() {
            r1 = this;
            boolean r0 = r1.hostOnly
            return r0
    }

    @kotlin.jvm.JvmName(name = "httpOnly")
    public final boolean httpOnly() {
            r1 = this;
            boolean r0 = r1.httpOnly
            return r0
    }

    public final boolean matches(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r4) {
            r3 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r3.hostOnly
            if (r0 == 0) goto L14
            java.lang.String r0 = r4.host()
            java.lang.String r1 = r3.domain
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            goto L20
        L14:
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            java.lang.String r1 = r4.host()
            java.lang.String r2 = r3.domain
            boolean r0 = okhttp3.Cookie.Companion.access$domainMatch(r0, r1, r2)
        L20:
            r1 = 0
            if (r0 != 0) goto L24
            return r1
        L24:
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            java.lang.String r2 = r3.path
            boolean r0 = okhttp3.Cookie.Companion.access$pathMatch(r0, r4, r2)
            if (r0 != 0) goto L2f
            return r1
        L2f:
            boolean r0 = r3.secure
            if (r0 == 0) goto L3b
            boolean r4 = r4.isHttps()
            if (r4 == 0) goto L3a
            goto L3b
        L3a:
            return r1
        L3b:
            r4 = 1
            return r4
    }

    @kotlin.jvm.JvmName(name = "name")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.Cookie.Builder newBuilder() {
            r1 = this;
            okhttp3.Cookie$Builder r0 = new okhttp3.Cookie$Builder
            r0.<init>(r1)
            return r0
    }

    @kotlin.jvm.JvmName(name = "path")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String path() {
            r1 = this;
            java.lang.String r0 = r1.path
            return r0
    }

    @kotlin.jvm.JvmName(name = "persistent")
    public final boolean persistent() {
            r1 = this;
            boolean r0 = r1.persistent
            return r0
    }

    @kotlin.jvm.JvmName(name = "sameSite")
    @org.jetbrains.annotations.Nullable
    public final java.lang.String sameSite() {
            r1 = this;
            java.lang.String r0 = r1.sameSite
            return r0
    }

    @kotlin.jvm.JvmName(name = "secure")
    public final boolean secure() {
            r1 = this;
            boolean r0 = r1.secure
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.toString$okhttp(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String toString$okhttp(boolean r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.name
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.String r1 = r6.value
            r0.append(r1)
            boolean r1 = r6.persistent
            if (r1 == 0) goto L39
            long r1 = r6.expiresAt
            r3 = -9223372036854775808
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L26
            java.lang.String r1 = "; max-age=0"
            r0.append(r1)
            goto L39
        L26:
            java.lang.String r1 = "; expires="
            r0.append(r1)
            java.util.Date r1 = new java.util.Date
            long r2 = r6.expiresAt
            r1.<init>(r2)
            java.lang.String r1 = okhttp3.internal.http.DateFormattingKt.toHttpDateString(r1)
            r0.append(r1)
        L39:
            boolean r1 = r6.hostOnly
            if (r1 != 0) goto L4e
            java.lang.String r1 = "; domain="
            r0.append(r1)
            if (r7 == 0) goto L49
            java.lang.String r7 = "."
            r0.append(r7)
        L49:
            java.lang.String r7 = r6.domain
            r0.append(r7)
        L4e:
            java.lang.String r7 = "; path="
            r0.append(r7)
            java.lang.String r7 = r6.path
            r0.append(r7)
            boolean r7 = r6.secure
            if (r7 == 0) goto L61
            java.lang.String r7 = "; secure"
            r0.append(r7)
        L61:
            boolean r7 = r6.httpOnly
            if (r7 == 0) goto L6a
            java.lang.String r7 = "; httponly"
            r0.append(r7)
        L6a:
            java.lang.String r7 = r6.sameSite
            if (r7 == 0) goto L78
            java.lang.String r7 = "; samesite="
            r0.append(r7)
            java.lang.String r7 = r6.sameSite
            r0.append(r7)
        L78:
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r7, r0)
            return r7
    }

    @kotlin.jvm.JvmName(name = "value")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String value() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}
