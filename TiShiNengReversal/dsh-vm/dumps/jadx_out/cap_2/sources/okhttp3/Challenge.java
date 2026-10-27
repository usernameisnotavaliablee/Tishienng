package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nChallenge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Challenge.kt\nokhttp3/Challenge\n+ 2 -UtilJvm.kt\nokhttp3/internal/_UtilJvmKt\n*L\n1#1,124:1\n250#2:125\n*S KotlinDebug\n*F\n+ 1 Challenge.kt\nokhttp3/Challenge\n*L\n68#1:125\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Challenge {

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.lang.String> authParams;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String scheme;

    public Challenge(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "scheme"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "realm"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r0 = "singletonMap(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            r1.<init>(r2, r3)
            return
    }

    public Challenge(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r6) {
            r4 = this;
            java.lang.String r0 = "scheme"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "authParams"
            kotlin.jvm.internal.g0.p(r6, r0)
            r4.<init>()
            r4.scheme = r5
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L1c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r1 == 0) goto L47
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r3 = "US"
            kotlin.jvm.internal.g0.o(r2, r3)
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "toLowerCase(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            goto L48
        L47:
            r1 = 0
        L48:
            r5.put(r1, r0)
            goto L1c
        L4c:
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r5)
            java.lang.String r6 = "unmodifiableMap(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            r4.authParams = r5
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "authParams", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_authParams")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_authParams, reason: not valid java name */
    public final java.util.Map<java.lang.String, java.lang.String> m65deprecated_authParams() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.authParams
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "charset", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_charset")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_charset, reason: not valid java name */
    public final java.nio.charset.Charset m66deprecated_charset() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.charset()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "realm", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_realm")
    @org.jetbrains.annotations.Nullable
    /* renamed from: -deprecated_realm, reason: not valid java name */
    public final java.lang.String m67deprecated_realm() {
            r1 = this;
            java.lang.String r0 = r1.realm()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "scheme", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_scheme")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final java.lang.String m68deprecated_scheme() {
            r1 = this;
            java.lang.String r0 = r1.scheme
            return r0
    }

    @kotlin.jvm.JvmName(name = "authParams")
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.String> authParams() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.authParams
            return r0
    }

    @kotlin.jvm.JvmName(name = "charset")
    @org.jetbrains.annotations.NotNull
    public final java.nio.charset.Charset charset() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.authParams
            java.lang.String r1 = "charset"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L16
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = "forName(...)"
            kotlin.jvm.internal.g0.o(r0, r1)     // Catch: java.lang.Exception -> L16
            return r0
        L16:
            java.nio.charset.Charset r0 = kotlin.text.e.g
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof okhttp3.Challenge
            if (r0 == 0) goto L1c
            okhttp3.Challenge r3 = (okhttp3.Challenge) r3
            java.lang.String r0 = r3.scheme
            java.lang.String r1 = r2.scheme
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L1c
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.authParams
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.authParams
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r3 == 0) goto L1c
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.scheme
            int r0 = r0.hashCode()
            r1 = 899(0x383, float:1.26E-42)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.authParams
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @kotlin.jvm.JvmName(name = "realm")
    @org.jetbrains.annotations.Nullable
    public final java.lang.String realm() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.authParams
            java.lang.String r1 = "realm"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
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
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.scheme
            r0.append(r1)
            java.lang.String r1 = " authParams="
            r0.append(r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.authParams
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.Challenge withCharset(@org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
            r2 = this;
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.authParams
            java.util.Map r1 = kotlin.collections.i1.J0(r1)
            java.lang.String r3 = r3.name()
            r1.put(r0, r3)
            okhttp3.Challenge r3 = new okhttp3.Challenge
            java.lang.String r0 = r2.scheme
            r3.<init>(r0, r1)
            return r3
    }
}
