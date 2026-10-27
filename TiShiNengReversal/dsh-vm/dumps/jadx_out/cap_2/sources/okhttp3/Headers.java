package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers\n+ 2 -UtilJvm.kt\nokhttp3/internal/_UtilJvmKt\n*L\n1#1,359:1\n246#2:360\n*S KotlinDebug\n*F\n+ 1 Headers.kt\nokhttp3/Headers\n*L\n110#1:360\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Headers implements java.lang.Iterable<kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>>, l3.a {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers EMPTY = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String[] namesAndValues;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,359:1\n1#2:360\n*E\n"})
    public static final class Builder {

        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.String> namesAndValues;

        public Builder() {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 20
                r0.<init>(r1)
                r2.namesAndValues = r0
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder add(@org.jetbrains.annotations.NotNull java.lang.String r8) {
                r7 = this;
                java.lang.String r0 = "line"
                kotlin.jvm.internal.g0.p(r8, r0)
                r5 = 6
                r6 = 0
                r2 = 58
                r3 = 0
                r4 = 0
                r1 = r8
                int r8 = kotlin.text.u.G3(r1, r2, r3, r4, r5, r6)
                r0 = -1
                if (r8 == r0) goto L32
                r0 = 0
                java.lang.String r0 = r1.substring(r0, r8)
                java.lang.String r2 = "substring(...)"
                kotlin.jvm.internal.g0.o(r0, r2)
                java.lang.CharSequence r0 = kotlin.text.u.Z5(r0)
                java.lang.String r0 = r0.toString()
                int r8 = r8 + 1
                java.lang.String r8 = r1.substring(r8)
                kotlin.jvm.internal.g0.o(r8, r2)
                r7.add(r0, r8)
                return r7
            L32:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "Unexpected header: "
                r8.append(r0)
                r8.append(r1)
                java.lang.String r8 = r8.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r0.<init>(r8)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder add(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.Headers$Builder r2 = okhttp3.internal._HeadersCommonKt.commonAdd(r1, r2, r3)
                return r2
        }

        @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder add(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.time.Instant r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.util.Date r3 = okhttp3.f.a(r3)
                java.lang.String r0 = "from(...)"
                kotlin.jvm.internal.g0.o(r3, r0)
                okhttp3.Headers$Builder r2 = r1.add(r2, r3)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder add(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.Date r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r3 = okhttp3.internal.http.DateFormattingKt.toHttpDateString(r3)
                okhttp3.Headers$Builder r2 = r1.add(r2, r3)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder addAll(@org.jetbrains.annotations.NotNull okhttp3.Headers r2) {
                r1 = this;
                java.lang.String r0 = "headers"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.Headers$Builder r2 = okhttp3.internal._HeadersCommonKt.commonAddAll(r1, r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder addLenient$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r8) {
                r7 = this;
                java.lang.String r0 = "line"
                kotlin.jvm.internal.g0.p(r8, r0)
                r5 = 4
                r6 = 0
                r2 = 58
                r3 = 1
                r4 = 0
                r1 = r8
                int r8 = kotlin.text.u.G3(r1, r2, r3, r4, r5, r6)
                r0 = -1
                r2 = 1
                r3 = 0
                java.lang.String r4 = "substring(...)"
                if (r8 == r0) goto L2a
                java.lang.String r0 = r1.substring(r3, r8)
                kotlin.jvm.internal.g0.o(r0, r4)
                int r8 = r8 + r2
                java.lang.String r8 = r1.substring(r8)
                kotlin.jvm.internal.g0.o(r8, r4)
                r7.addLenient$okhttp(r0, r8)
                return r7
            L2a:
                char r8 = r1.charAt(r3)
                r0 = 58
                java.lang.String r3 = ""
                if (r8 != r0) goto L3f
                java.lang.String r8 = r1.substring(r2)
                kotlin.jvm.internal.g0.o(r8, r4)
                r7.addLenient$okhttp(r3, r8)
                return r7
            L3f:
                r7.addLenient$okhttp(r3, r1)
                return r7
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder addLenient$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.Headers$Builder r2 = okhttp3.internal._HeadersCommonKt.commonAddLenient(r1, r2, r3)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder addUnsafeNonAscii(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.internal._HeadersCommonKt.headersCheckName(r2)
                r1.addLenient$okhttp(r2, r3)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers build() {
                r1 = this;
                okhttp3.Headers r0 = okhttp3.internal._HeadersCommonKt.commonBuild(r1)
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String get(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = okhttp3.internal._HeadersCommonKt.commonGet(r1, r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getNamesAndValues$okhttp() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.namesAndValues
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder removeAll(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.Headers$Builder r2 = okhttp3.internal._HeadersCommonKt.commonRemoveAll(r1, r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder set(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.Headers$Builder r2 = okhttp3.internal._HeadersCommonKt.commonSet(r1, r2, r3)
                return r2
        }

        @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder set(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.time.Instant r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.util.Date r3 = okhttp3.f.a(r3)
                java.lang.String r0 = "from(...)"
                kotlin.jvm.internal.g0.o(r3, r0)
                okhttp3.Headers$Builder r2 = r1.set(r2, r3)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder set(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.Date r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r3 = okhttp3.internal.http.DateFormattingKt.toHttpDateString(r3)
                okhttp3.Headers$Builder r2 = r1.set(r2, r3)
                return r2
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

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "function moved to extension", replaceWith = @kotlin.ReplaceWith(expression = "headers.toHeaders()", imports = {}))
        @kotlin.jvm.JvmName(name = "-deprecated_of")
        @org.jetbrains.annotations.NotNull
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final okhttp3.Headers m92deprecated_of(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                java.lang.String r0 = "headers"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.Headers r2 = r1.of(r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "function name changed", replaceWith = @kotlin.ReplaceWith(expression = "headersOf(*namesAndValues)", imports = {}))
        @kotlin.jvm.JvmName(name = "-deprecated_of")
        @org.jetbrains.annotations.NotNull
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final okhttp3.Headers m93deprecated_of(@org.jetbrains.annotations.NotNull java.lang.String... r2) {
                r1 = this;
                java.lang.String r0 = "namesAndValues"
                kotlin.jvm.internal.g0.p(r2, r0)
                int r0 = r2.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
                java.lang.String[] r2 = (java.lang.String[]) r2
                okhttp3.Headers r2 = r1.of(r2)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "of")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers of(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.Headers r2 = okhttp3.internal._HeadersCommonKt.commonToHeaders(r2)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "of")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers of(@org.jetbrains.annotations.NotNull java.lang.String... r2) {
                r1 = this;
                java.lang.String r0 = "namesAndValues"
                kotlin.jvm.internal.g0.p(r2, r0)
                int r0 = r2.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
                java.lang.String[] r2 = (java.lang.String[]) r2
                okhttp3.Headers r2 = okhttp3.internal._HeadersCommonKt.commonHeadersOf(r2)
                return r2
        }
    }

    static {
            okhttp3.Headers$Companion r0 = new okhttp3.Headers$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.Headers.Companion = r0
            okhttp3.Headers r0 = new okhttp3.Headers
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.<init>(r1)
            okhttp3.Headers.EMPTY = r0
            return
    }

    public Headers(@org.jetbrains.annotations.NotNull java.lang.String[] r2) {
            r1 = this;
            java.lang.String r0 = "namesAndValues"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.namesAndValues = r2
            return
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "of")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers of(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r1) {
            okhttp3.Headers$Companion r0 = okhttp3.Headers.Companion
            okhttp3.Headers r1 = r0.of(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "of")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Headers of(@org.jetbrains.annotations.NotNull java.lang.String... r1) {
            okhttp3.Headers$Companion r0 = okhttp3.Headers.Companion
            okhttp3.Headers r1 = r0.of(r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "size", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_size")
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m91deprecated_size() {
            r1 = this;
            int r0 = r1.size()
            return r0
    }

    public final long byteCount() {
            r6 = this;
            java.lang.String[] r0 = r6.namesAndValues
            int r1 = r0.length
            int r1 = r1 * 2
            long r1 = (long) r1
            int r0 = r0.length
            r3 = 0
        L8:
            if (r3 >= r0) goto L17
            java.lang.String[] r4 = r6.namesAndValues
            r4 = r4[r3]
            int r4 = r4.length()
            long r4 = (long) r4
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L8
        L17:
            return r1
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            boolean r1 = okhttp3.internal._HeadersCommonKt.commonEquals(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String get(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String[] r0 = r1.namesAndValues
            java.lang.String r2 = okhttp3.internal._HeadersCommonKt.commonHeadersGet(r0, r2)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.Date getDate(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = r1.get(r2)
            if (r2 == 0) goto L10
            java.util.Date r2 = okhttp3.internal.http.DateFormattingKt.toHttpDateOrNull(r2)
            return r2
        L10:
            r2 = 0
            return r2
    }

    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    @org.jetbrains.annotations.Nullable
    public final java.time.Instant getInstant(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Date r2 = r1.getDate(r2)
            if (r2 == 0) goto L10
            java.time.Instant r2 = okhttp3.e.a(r2)
            return r2
        L10:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] getNamesAndValues$okhttp() {
            r1 = this;
            java.lang.String[] r0 = r1.namesAndValues
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = okhttp3.internal._HeadersCommonKt.commonHashCode(r1)
            return r0
    }

    @Override // java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>> iterator() {
            r1 = this;
            java.util.Iterator r0 = okhttp3.internal._HeadersCommonKt.commonIterator(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String name(int r1) {
            r0 = this;
            java.lang.String r1 = okhttp3.internal._HeadersCommonKt.commonName(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<java.lang.String> names() {
            r4 = this;
            java.util.TreeSet r0 = new java.util.TreeSet
            kotlin.jvm.internal.t0 r1 = kotlin.jvm.internal.t0.a
            java.util.Comparator r1 = kotlin.text.u.g2(r1)
            r0.<init>(r1)
            int r1 = r4.size()
            r2 = 0
        L10:
            if (r2 >= r1) goto L1c
            java.lang.String r3 = r4.name(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L10
        L1c:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            java.lang.String r1 = "unmodifiableSet(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.Headers.Builder newBuilder() {
            r1 = this;
            okhttp3.Headers$Builder r0 = okhttp3.internal._HeadersCommonKt.commonNewBuilder(r1)
            return r0
    }

    @kotlin.jvm.JvmName(name = "size")
    public final int size() {
            r1 = this;
            java.lang.String[] r0 = r1.namesAndValues
            int r0 = r0.length
            int r0 = r0 / 2
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> toMultimap() {
            r6 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            kotlin.jvm.internal.t0 r1 = kotlin.jvm.internal.t0.a
            java.util.Comparator r1 = kotlin.text.u.g2(r1)
            r0.<init>(r1)
            int r1 = r6.size()
            r2 = 0
        L10:
            if (r2 >= r1) goto L41
            java.lang.String r3 = r6.name(r2)
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r5 = "US"
            kotlin.jvm.internal.g0.o(r4, r5)
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.String r4 = "toLowerCase(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            java.lang.Object r4 = r0.get(r3)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L37
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 2
            r4.<init>(r5)
            r0.put(r3, r4)
        L37:
            java.lang.String r3 = r6.value(r2)
            r4.add(r3)
            int r2 = r2 + 1
            goto L10
        L41:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = okhttp3.internal._HeadersCommonKt.commonToString(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String value(int r1) {
            r0 = this;
            java.lang.String r1 = okhttp3.internal._HeadersCommonKt.commonValue(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> values(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.List r2 = okhttp3.internal._HeadersCommonKt.commonValues(r1, r2)
            return r2
    }
}
