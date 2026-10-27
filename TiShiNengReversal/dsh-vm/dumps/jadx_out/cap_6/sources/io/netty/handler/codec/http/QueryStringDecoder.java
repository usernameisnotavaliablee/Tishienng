package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class QueryStringDecoder {
    private static final int DEFAULT_MAX_PARAMS = 1024;
    private final java.nio.charset.Charset charset;
    private final int maxParams;
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> params;
    private java.lang.String path;
    private int pathEndIdx;
    private final java.lang.String uri;

    public QueryStringDecoder(java.lang.String r2) {
            r1 = this;
            java.nio.charset.Charset r0 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            r1.<init>(r2, r0)
            return
    }

    public QueryStringDecoder(java.lang.String r2, java.nio.charset.Charset r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public QueryStringDecoder(java.lang.String r2, java.nio.charset.Charset r3, boolean r4) {
            r1 = this;
            r0 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public QueryStringDecoder(java.lang.String r2, java.nio.charset.Charset r3, boolean r4, int r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "uri"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.uri = r2
            java.lang.String r2 = "charset"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            java.nio.charset.Charset r2 = (java.nio.charset.Charset) r2
            r1.charset = r2
            java.lang.String r2 = "maxParams"
            int r2 = io.netty.util.internal.ObjectUtil.checkPositive(r5, r2)
            r1.maxParams = r2
            if (r4 == 0) goto L23
            r2 = -1
            goto L24
        L23:
            r2 = 0
        L24:
            r1.pathEndIdx = r2
            return
    }

    public QueryStringDecoder(java.lang.String r2, boolean r3) {
            r1 = this;
            java.nio.charset.Charset r0 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            r1.<init>(r2, r0, r3)
            return
    }

    public QueryStringDecoder(java.net.URI r2) {
            r1 = this;
            java.nio.charset.Charset r0 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            r1.<init>(r2, r0)
            return
    }

    public QueryStringDecoder(java.net.URI r2, java.nio.charset.Charset r3) {
            r1 = this;
            r0 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r3, r0)
            return
    }

    public QueryStringDecoder(java.net.URI r4, java.nio.charset.Charset r5, int r6) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = r4.getRawPath()
            if (r0 != 0) goto Lb
            java.lang.String r0 = ""
        Lb:
            java.lang.String r4 = r4.getRawQuery()
            if (r4 != 0) goto L13
            r4 = r0
            goto L27
        L13:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r2 = 63
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
        L27:
            r3.uri = r4
            java.lang.String r4 = "charset"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r5, r4)
            java.nio.charset.Charset r4 = (java.nio.charset.Charset) r4
            r3.charset = r4
            java.lang.String r4 = "maxParams"
            int r4 = io.netty.util.internal.ObjectUtil.checkPositive(r6, r4)
            r3.maxParams = r4
            int r4 = r0.length()
            r3.pathEndIdx = r4
            return
    }

    private static boolean addParam(java.lang.String r2, int r3, int r4, int r5, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6, java.nio.charset.Charset r7) {
            r0 = 0
            if (r3 < r5) goto L4
            return r0
        L4:
            if (r4 > r3) goto L8
            int r4 = r5 + 1
        L8:
            int r1 = r4 + (-1)
            java.lang.String r3 = decodeComponent(r2, r3, r1, r7, r0)
            java.lang.String r2 = decodeComponent(r2, r4, r5, r7, r0)
            java.lang.Object r4 = r6.get(r3)
            java.util.List r4 = (java.util.List) r4
            r5 = 1
            if (r4 != 0) goto L23
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r5)
            r6.put(r3, r4)
        L23:
            r4.add(r2)
            return r5
    }

    public static java.lang.String decodeComponent(java.lang.String r1) {
            java.nio.charset.Charset r0 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            java.lang.String r1 = decodeComponent(r1, r0)
            return r1
    }

    private static java.lang.String decodeComponent(java.lang.String r8, int r9, int r10, java.nio.charset.Charset r11, boolean r12) {
            int r0 = r10 - r9
            if (r0 > 0) goto L7
            java.lang.String r8 = ""
            return r8
        L7:
            r1 = r9
        L8:
            r2 = 43
            r3 = -1
            r4 = 37
            if (r1 >= r10) goto L1d
            char r5 = r8.charAt(r1)
            if (r5 == r4) goto L1e
            if (r5 != r2) goto L1a
            if (r12 != 0) goto L1a
            goto L1e
        L1a:
            int r1 = r1 + 1
            goto L8
        L1d:
            r1 = -1
        L1e:
            if (r1 != r3) goto L25
            java.lang.String r8 = r8.substring(r9, r10)
            return r8
        L25:
            java.nio.charset.CharsetDecoder r11 = io.netty.util.CharsetUtil.decoder(r11)
            int r3 = r10 - r1
            int r3 = r3 / 3
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r3)
            java.nio.CharBuffer r3 = java.nio.CharBuffer.allocate(r3)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r8, r9, r1)
        L3d:
            if (r1 >= r10) goto Lc1
            char r9 = r8.charAt(r1)
            r0 = 1
            if (r9 == r4) goto L51
            if (r9 != r2) goto L4d
            if (r12 == 0) goto L4b
            goto L4d
        L4b:
            r9 = 32
        L4d:
            r6.append(r9)
            goto L99
        L51:
            r5.clear()
        L54:
            int r9 = r1 + 3
            if (r9 > r10) goto La2
            int r7 = r1 + 1
            byte r7 = io.netty.util.internal.StringUtil.decodeHexByte(r8, r7)
            r5.put(r7)
            if (r9 >= r10) goto L6c
            char r7 = r8.charAt(r9)
            if (r7 == r4) goto L6a
            goto L6c
        L6a:
            r1 = r9
            goto L54
        L6c:
            int r1 = r1 + 2
            r5.flip()
            r3.clear()
            java.nio.charset.CharsetDecoder r9 = r11.reset()
            java.nio.charset.CoderResult r9 = r9.decode(r5, r3, r0)
            boolean r7 = r9.isUnderflow()     // Catch: java.nio.charset.CharacterCodingException -> L9b
            if (r7 != 0) goto L85
            r9.throwException()     // Catch: java.nio.charset.CharacterCodingException -> L9b
        L85:
            java.nio.charset.CoderResult r9 = r11.flush(r3)     // Catch: java.nio.charset.CharacterCodingException -> L9b
            boolean r7 = r9.isUnderflow()     // Catch: java.nio.charset.CharacterCodingException -> L9b
            if (r7 != 0) goto L92
            r9.throwException()     // Catch: java.nio.charset.CharacterCodingException -> L9b
        L92:
            java.nio.Buffer r9 = r3.flip()
            r6.append(r9)
        L99:
            int r1 = r1 + r0
            goto L3d
        L9b:
            r8 = move-exception
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r8)
            throw r9
        La2:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "unterminated escape sequence at index "
            r10.append(r11)
            r10.append(r1)
            java.lang.String r11 = " of: "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        Lc1:
            java.lang.String r8 = r6.toString()
            return r8
    }

    public static java.lang.String decodeComponent(java.lang.String r2, java.nio.charset.Charset r3) {
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            int r0 = r2.length()
            r1 = 0
            java.lang.String r2 = decodeComponent(r2, r1, r0, r3, r1)
            return r2
    }

    private static java.util.Map<java.lang.String, java.util.List<java.lang.String>> decodeParams(java.lang.String r7, int r8, java.nio.charset.Charset r9, int r10) {
            int r0 = r7.length()
            if (r8 < r0) goto L9
            java.util.Map r7 = java.util.Collections.EMPTY_MAP
            return r7
        L9:
            char r1 = r7.charAt(r8)
            r2 = 63
            if (r1 != r2) goto L13
            int r8 = r8 + 1
        L13:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            r1 = -1
            r2 = r8
            r4 = r2
            r3 = -1
        L1c:
            if (r4 >= r0) goto L59
            char r8 = r7.charAt(r4)
            r1 = 35
            if (r8 == r1) goto L59
            r1 = 38
            if (r8 == r1) goto L44
            r1 = 59
            if (r8 == r1) goto L44
            r1 = 61
            if (r8 == r1) goto L33
            goto L42
        L33:
            if (r2 != r4) goto L3b
            int r8 = r4 + 1
            r1 = r7
            r2 = r8
        L39:
            r6 = r9
            goto L54
        L3b:
            if (r3 >= r2) goto L42
            int r8 = r4 + 1
            r1 = r7
            r3 = r8
            goto L39
        L42:
            r1 = r7
            goto L39
        L44:
            r1 = r7
            r6 = r9
            boolean r7 = addParam(r1, r2, r3, r4, r5, r6)
            if (r7 == 0) goto L51
            int r10 = r10 + (-1)
            if (r10 != 0) goto L51
            return r5
        L51:
            int r7 = r4 + 1
            r2 = r7
        L54:
            int r4 = r4 + 1
            r7 = r1
            r9 = r6
            goto L1c
        L59:
            r1 = r7
            r6 = r9
            addParam(r1, r2, r3, r4, r5, r6)
            return r5
    }

    private static int findPathEndIndex(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L18
            char r2 = r4.charAt(r1)
            r3 = 63
            if (r2 == r3) goto L17
            r3 = 35
            if (r2 != r3) goto L14
            goto L17
        L14:
            int r1 = r1 + 1
            goto L5
        L17:
            return r1
        L18:
            return r0
    }

    private int pathEndIdx() {
            r2 = this;
            int r0 = r2.pathEndIdx
            r1 = -1
            if (r0 != r1) goto Ld
            java.lang.String r0 = r2.uri
            int r0 = findPathEndIndex(r0)
            r2.pathEndIdx = r0
        Ld:
            int r0 = r2.pathEndIdx
            return r0
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> parameters() {
            r4 = this;
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r4.params
            if (r0 != 0) goto L14
            java.lang.String r0 = r4.uri
            int r1 = r4.pathEndIdx()
            java.nio.charset.Charset r2 = r4.charset
            int r3 = r4.maxParams
            java.util.Map r0 = decodeParams(r0, r1, r2, r3)
            r4.params = r0
        L14:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r4.params
            return r0
    }

    public java.lang.String path() {
            r5 = this;
            java.lang.String r0 = r5.path
            if (r0 != 0) goto L14
            java.lang.String r0 = r5.uri
            int r1 = r5.pathEndIdx()
            java.nio.charset.Charset r2 = r5.charset
            r3 = 1
            r4 = 0
            java.lang.String r0 = decodeComponent(r0, r4, r1, r2, r3)
            r5.path = r0
        L14:
            java.lang.String r0 = r5.path
            return r0
    }

    public java.lang.String rawPath() {
            r3 = this;
            java.lang.String r0 = r3.uri
            r1 = 0
            int r2 = r3.pathEndIdx()
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
    }

    public java.lang.String rawQuery() {
            r2 = this;
            int r0 = r2.pathEndIdx()
            int r0 = r0 + 1
            java.lang.String r1 = r2.uri
            int r1 = r1.length()
            if (r0 >= r1) goto L15
            java.lang.String r1 = r2.uri
            java.lang.String r0 = r1.substring(r0)
            return r0
        L15:
            java.lang.String r0 = ""
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.uri()
            return r0
    }

    public java.lang.String uri() {
            r1 = this;
            java.lang.String r0 = r1.uri
            return r0
    }
}
