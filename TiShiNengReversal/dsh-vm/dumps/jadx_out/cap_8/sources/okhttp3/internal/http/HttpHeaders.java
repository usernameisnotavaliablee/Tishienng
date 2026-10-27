package okhttp3.internal.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "HttpHeaders")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class HttpHeaders {

    @org.jetbrains.annotations.NotNull
    private static final okio.ByteString QUOTED_STRING_DELIMITERS = null;

    @org.jetbrains.annotations.NotNull
    private static final okio.ByteString TOKEN_DELIMITERS = null;

    static {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "\"\\"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okhttp3.internal.http.HttpHeaders.QUOTED_STRING_DELIMITERS = r1
            java.lang.String r1 = "\t ,="
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okhttp3.internal.http.HttpHeaders.TOKEN_DELIMITERS = r0
            return
    }

    public HttpHeaders() {
            r1 = this;
            r1.<init>()
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "No longer supported", replaceWith = @kotlin.ReplaceWith(expression = "response.promisesBody()", imports = {}))
    public static final boolean hasBody(@org.jetbrains.annotations.NotNull okhttp3.Response r1) {
            java.lang.String r0 = "response"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = promisesBody(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<okhttp3.Challenge> parseChallenges(@org.jetbrains.annotations.NotNull okhttp3.Headers r7, @org.jetbrains.annotations.NotNull java.lang.String r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "headerName"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.size()
            r2 = 0
        L14:
            if (r2 >= r1) goto L42
            java.lang.String r3 = r7.name(r2)
            r4 = 1
            boolean r3 = kotlin.text.u.a2(r8, r3, r4)
            if (r3 == 0) goto L3f
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            java.lang.String r4 = r7.value(r2)
            okio.Buffer r3 = r3.writeUtf8(r4)
            readChallengeHeader(r3, r0)     // Catch: java.io.EOFException -> L32
            goto L3f
        L32:
            r3 = move-exception
            okhttp3.internal.platform.Platform$Companion r4 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r4 = r4.get()
            java.lang.String r5 = "Unable to parse challenge"
            r6 = 5
            r4.log(r5, r6, r3)
        L3f:
            int r2 = r2 + 1
            goto L14
        L42:
            return r0
    }

    public static final boolean promisesBody(@org.jetbrains.annotations.NotNull okhttp3.Response r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            okhttp3.Request r0 = r8.request()
            java.lang.String r0 = r0.method()
            java.lang.String r1 = "HEAD"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            r1 = 0
            if (r0 == 0) goto L17
            return r1
        L17:
            int r0 = r8.code()
            r2 = 100
            r3 = 1
            if (r0 < r2) goto L24
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 < r2) goto L2d
        L24:
            r2 = 204(0xcc, float:2.86E-43)
            if (r0 == r2) goto L2d
            r2 = 304(0x130, float:4.26E-43)
            if (r0 == r2) goto L2d
            return r3
        L2d:
            long r4 = okhttp3.internal._UtilJvmKt.headersContentLength(r8)
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L49
            java.lang.String r0 = "Transfer-Encoding"
            r2 = 2
            r4 = 0
            java.lang.String r8 = okhttp3.Response.header$default(r8, r0, r4, r2, r4)
            java.lang.String r0 = "chunked"
            boolean r8 = kotlin.text.u.a2(r0, r8, r3)
            if (r8 == 0) goto L48
            goto L49
        L48:
            return r1
        L49:
            return r3
    }

    private static final void readChallengeHeader(okio.Buffer r7, java.util.List<okhttp3.Challenge> r8) throws java.io.EOFException {
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Lf
            skipCommasAndWhitespace(r7)
            java.lang.String r1 = readToken(r7)
            if (r1 != 0) goto Lf
            goto Lb9
        Lf:
            boolean r2 = skipCommasAndWhitespace(r7)
            java.lang.String r3 = readToken(r7)
            if (r3 != 0) goto L2e
            boolean r7 = r7.exhausted()
            if (r7 != 0) goto L21
            goto Lb9
        L21:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            java.util.Map r0 = kotlin.collections.i1.z()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2e:
            r4 = 61
            int r5 = okhttp3.internal._UtilCommonKt.skipAll(r7, r4)
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r2 != 0) goto L69
            if (r6 != 0) goto L42
            boolean r2 = r7.exhausted()
            if (r2 == 0) goto L69
        L42:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = kotlin.text.u.t2(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L69:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal._UtilCommonKt.skipAll(r7, r4)
            int r5 = r5 + r6
        L73:
            if (r3 != 0) goto L83
            java.lang.String r3 = readToken(r7)
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 != 0) goto Lbc
            int r5 = okhttp3.internal._UtilCommonKt.skipAll(r7, r4)
        L83:
            if (r5 == 0) goto Lbc
            r6 = 1
            if (r5 <= r6) goto L89
            goto Lb9
        L89:
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r6 == 0) goto L90
            goto Lb9
        L90:
            r6 = 34
            boolean r6 = startsWith(r7, r6)
            if (r6 == 0) goto L9d
            java.lang.String r6 = readQuotedString(r7)
            goto La1
        L9d:
            java.lang.String r6 = readToken(r7)
        La1:
            if (r6 != 0) goto La4
            goto Lb9
        La4:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lad
            goto Lb9
        Lad:
            boolean r3 = skipCommasAndWhitespace(r7)
            if (r3 != 0) goto Lba
            boolean r3 = r7.exhausted()
            if (r3 != 0) goto Lba
        Lb9:
            return
        Lba:
            r3 = r0
            goto L73
        Lbc:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
    }

    private static final java.lang.String readQuotedString(okio.Buffer r12) throws java.io.EOFException {
            byte r0 = r12.readByte()
            r1 = 34
            if (r0 != r1) goto L43
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
        Ld:
            okio.ByteString r2 = okhttp3.internal.http.HttpHeaders.QUOTED_STRING_DELIMITERS
            long r2 = r12.indexOfElement(r2)
            r4 = -1
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L1b
            return r6
        L1b:
            byte r4 = r12.getByte(r2)
            if (r4 != r1) goto L2c
            r0.write(r12, r2)
            r12.readByte()
            java.lang.String r12 = r0.readUtf8()
            return r12
        L2c:
            long r4 = r12.size()
            r7 = 1
            long r9 = r2 + r7
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 != 0) goto L39
            return r6
        L39:
            r0.write(r12, r2)
            r12.readByte()
            r0.write(r12, r7)
            goto Ld
        L43:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r12.<init>(r0)
            throw r12
    }

    private static final java.lang.String readToken(okio.Buffer r5) {
            okio.ByteString r0 = okhttp3.internal.http.HttpHeaders.TOKEN_DELIMITERS
            long r0 = r5.indexOfElement(r0)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L10
            long r0 = r5.size()
        L10:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1b
            java.lang.String r5 = r5.readUtf8(r0)
            return r5
        L1b:
            r5 = 0
            return r5
    }

    public static final void receiveHeaders(@org.jetbrains.annotations.NotNull okhttp3.CookieJar r1, @org.jetbrains.annotations.NotNull okhttp3.HttpUrl r2, @org.jetbrains.annotations.NotNull okhttp3.Headers r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "url"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.g0.p(r3, r0)
            okhttp3.CookieJar r0 = okhttp3.CookieJar.NO_COOKIES
            if (r1 != r0) goto L14
            goto L20
        L14:
            okhttp3.Cookie$Companion r0 = okhttp3.Cookie.Companion
            java.util.List r3 = r0.parseAll(r2, r3)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L21
        L20:
            return
        L21:
            r1.saveFromResponse(r2, r3)
            return
    }

    private static final boolean skipCommasAndWhitespace(okio.Buffer r3) {
            r0 = 0
        L1:
            boolean r1 = r3.exhausted()
            if (r1 != 0) goto L22
            r1 = 0
            byte r1 = r3.getByte(r1)
            r2 = 44
            if (r1 != r2) goto L16
            r3.readByte()
            r0 = 1
            goto L1
        L16:
            r2 = 32
            if (r1 == r2) goto L1e
            r2 = 9
            if (r1 != r2) goto L22
        L1e:
            r3.readByte()
            goto L1
        L22:
            return r0
    }

    private static final boolean startsWith(okio.Buffer r2, byte r3) {
            boolean r0 = r2.exhausted()
            if (r0 != 0) goto L10
            r0 = 0
            byte r2 = r2.getByte(r0)
            if (r2 != r3) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }
}
