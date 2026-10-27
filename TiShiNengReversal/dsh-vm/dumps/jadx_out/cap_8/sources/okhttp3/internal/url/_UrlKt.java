package okhttp3.internal.url;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class _UrlKt {

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FORM_ENCODE_SET = " !\"#$&'()+,/:;<=>?@[\\]^`{|}~";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FRAGMENT_ENCODE_SET = "";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";

    @org.jetbrains.annotations.NotNull
    private static final char[] HEX_DIGITS = null;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PATH_SEGMENT_ENCODE_SET_URI = "[]";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String QUERY_ENCODE_SET = " \"'<>#";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            okhttp3.internal.url._UrlKt.HEX_DIGITS = r0
            return
    }

    public _UrlKt() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String canonicalize(@org.jetbrains.annotations.NotNull java.lang.String r12, int r13, int r14, @org.jetbrains.annotations.NotNull java.lang.String r15, boolean r16, boolean r17, boolean r18, boolean r19) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "encodeSet"
            kotlin.jvm.internal.g0.p(r15, r0)
            r10 = 128(0x80, float:1.8E-43)
            r11 = 0
            r9 = 0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            java.lang.String r12 = canonicalizeWithCharset$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
    }

    public static /* synthetic */ java.lang.String canonicalize$default(java.lang.String r1, int r2, int r3, java.lang.String r4, boolean r5, boolean r6, boolean r7, boolean r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            r0 = 0
            if (r10 == 0) goto L6
            r2 = 0
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Le
            int r3 = r1.length()
        Le:
            r10 = r9 & 8
            if (r10 == 0) goto L13
            r5 = 0
        L13:
            r10 = r9 & 16
            if (r10 == 0) goto L18
            r6 = 0
        L18:
            r10 = r9 & 32
            if (r10 == 0) goto L1d
            r7 = 0
        L1d:
            r9 = r9 & 64
            if (r9 == 0) goto L22
            r8 = 0
        L22:
            java.lang.String r1 = canonicalize(r1, r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String canonicalizeWithCharset(@org.jetbrains.annotations.NotNull java.lang.String r10, int r11, int r12, @org.jetbrains.annotations.NotNull java.lang.String r13, boolean r14, boolean r15, boolean r16, boolean r17, @org.jetbrains.annotations.Nullable java.nio.charset.Charset r18) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "encodeSet"
            kotlin.jvm.internal.g0.p(r13, r0)
            r2 = r11
        Lb:
            if (r2 >= r12) goto L5f
            int r0 = r10.codePointAt(r2)
            r5 = 32
            if (r0 < r5) goto L44
            r5 = 127(0x7f, float:1.78E-43)
            if (r0 == r5) goto L44
            r5 = 128(0x80, float:1.8E-43)
            if (r0 < r5) goto L1f
            if (r17 == 0) goto L44
        L1f:
            char r5 = (char) r0
            r6 = 2
            r7 = 0
            r8 = 0
            boolean r5 = kotlin.text.u.k3(r13, r5, r8, r6, r7)
            if (r5 != 0) goto L44
            r5 = 37
            if (r0 != r5) goto L37
            if (r14 == 0) goto L44
            if (r15 == 0) goto L37
            boolean r5 = isPercentEncoded(r10, r2, r12)
            if (r5 == 0) goto L44
        L37:
            r5 = 43
            if (r0 != r5) goto L3e
            if (r16 == 0) goto L3e
            goto L44
        L3e:
            int r0 = java.lang.Character.charCount(r0)
            int r2 = r2 + r0
            goto Lb
        L44:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r0.writeUtf8(r10, r11, r2)
            r1 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            writeCanonicalized(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = r0.readUtf8()
            return r0
        L5f:
            java.lang.String r0 = r10.substring(r11, r12)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String canonicalizeWithCharset$default(java.lang.String r1, int r2, int r3, java.lang.String r4, boolean r5, boolean r6, boolean r7, boolean r8, java.nio.charset.Charset r9, int r10, java.lang.Object r11) {
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L6
            r2 = 0
        L6:
            r11 = r10 & 2
            if (r11 == 0) goto Le
            int r3 = r1.length()
        Le:
            r11 = r10 & 8
            if (r11 == 0) goto L13
            r5 = 0
        L13:
            r11 = r10 & 16
            if (r11 == 0) goto L18
            r6 = 0
        L18:
            r11 = r10 & 32
            if (r11 == 0) goto L1d
            r7 = 0
        L1d:
            r11 = r10 & 64
            if (r11 == 0) goto L22
            r8 = 0
        L22:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L27
            r9 = 0
        L27:
            java.lang.String r1 = canonicalizeWithCharset(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final char[] getHEX_DIGITS() {
            char[] r0 = okhttp3.internal.url._UrlKt.HEX_DIGITS
            return r0
    }

    public static final boolean isPercentEncoded(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r3 + 2
            if (r0 >= r4) goto L29
            char r4 = r2.charAt(r3)
            r1 = 37
            if (r4 != r1) goto L29
            r4 = 1
            int r3 = r3 + r4
            char r3 = r2.charAt(r3)
            int r3 = okhttp3.internal._UtilCommonKt.parseHexDigit(r3)
            r1 = -1
            if (r3 == r1) goto L29
            char r2 = r2.charAt(r0)
            int r2 = okhttp3.internal._UtilCommonKt.parseHexDigit(r2)
            if (r2 == r1) goto L29
            return r4
        L29:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String percentDecode(@org.jetbrains.annotations.NotNull java.lang.String r3, int r4, int r5, boolean r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = r4
        L6:
            if (r0 >= r5) goto L2a
            char r1 = r3.charAt(r0)
            r2 = 37
            if (r1 == r2) goto L1a
            r2 = 43
            if (r1 != r2) goto L17
            if (r6 == 0) goto L17
            goto L1a
        L17:
            int r0 = r0 + 1
            goto L6
        L1a:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r1.writeUtf8(r3, r4, r0)
            writePercentDecoded(r1, r3, r0, r5, r6)
            java.lang.String r3 = r1.readUtf8()
            return r3
        L2a:
            java.lang.String r3 = r3.substring(r4, r5)
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            return r3
    }

    public static /* synthetic */ java.lang.String percentDecode$default(java.lang.String r1, int r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            r0 = 0
            if (r6 == 0) goto L6
            r2 = 0
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Le
            int r3 = r1.length()
        Le:
            r5 = r5 & 4
            if (r5 == 0) goto L13
            r4 = 0
        L13:
            java.lang.String r1 = percentDecode(r1, r2, r3, r4)
            return r1
    }

    public static final void writeCanonicalized(@org.jetbrains.annotations.NotNull okio.Buffer r8, @org.jetbrains.annotations.NotNull java.lang.String r9, int r10, int r11, @org.jetbrains.annotations.NotNull java.lang.String r12, boolean r13, boolean r14, boolean r15, boolean r16, @org.jetbrains.annotations.Nullable java.nio.charset.Charset r17) {
            r0 = r17
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r1)
            java.lang.String r1 = "input"
            kotlin.jvm.internal.g0.p(r9, r1)
            java.lang.String r1 = "encodeSet"
            kotlin.jvm.internal.g0.p(r12, r1)
            r1 = 0
            r2 = r1
        L13:
            if (r10 >= r11) goto Lbf
            int r3 = r9.codePointAt(r10)
            if (r13 == 0) goto L2f
            r4 = 9
            if (r3 == r4) goto L2b
            r4 = 10
            if (r3 == r4) goto L2b
            r4 = 12
            if (r3 == r4) goto L2b
            r4 = 13
            if (r3 != r4) goto L2f
        L2b:
            kotlin.n1 r4 = kotlin.n1.a
            goto Lb8
        L2f:
            java.lang.String r4 = "+"
            r5 = 32
            if (r3 != r5) goto L3e
            java.lang.String r6 = " !\"#$&'()+,/:;<=>?@[\\]^`{|}~"
            if (r12 != r6) goto L3e
            r8.writeUtf8(r4)
            goto Lb8
        L3e:
            r6 = 43
            if (r3 != r6) goto L4e
            if (r15 == 0) goto L4e
            if (r13 == 0) goto L47
            goto L49
        L47:
            java.lang.String r4 = "%2B"
        L49:
            r8.writeUtf8(r4)
            goto Lb8
        L4e:
            r4 = 37
            if (r3 < r5) goto L76
            r5 = 127(0x7f, float:1.78E-43)
            if (r3 == r5) goto L76
            r5 = 128(0x80, float:1.8E-43)
            if (r3 < r5) goto L5c
            if (r16 == 0) goto L76
        L5c:
            char r5 = (char) r3
            r6 = 0
            r7 = 2
            boolean r5 = kotlin.text.u.k3(r12, r5, r6, r7, r1)
            if (r5 != 0) goto L76
            if (r3 != r4) goto L72
            if (r13 == 0) goto L76
            if (r14 == 0) goto L72
            boolean r5 = isPercentEncoded(r9, r10, r11)
            if (r5 != 0) goto L72
            goto L76
        L72:
            r8.writeUtf8CodePoint(r3)
            goto Lb8
        L76:
            if (r2 != 0) goto L7d
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
        L7d:
            if (r0 == 0) goto L91
            java.nio.charset.Charset r5 = kotlin.text.e.b
            boolean r5 = kotlin.jvm.internal.g0.g(r0, r5)
            if (r5 == 0) goto L88
            goto L91
        L88:
            int r5 = java.lang.Character.charCount(r3)
            int r5 = r5 + r10
            r2.writeString(r9, r10, r5, r0)
            goto L94
        L91:
            r2.writeUtf8CodePoint(r3)
        L94:
            boolean r5 = r2.exhausted()
            if (r5 != 0) goto Lb6
            byte r5 = r2.readByte()
            r6 = r5 & 255(0xff, float:3.57E-43)
            r8.writeByte(r4)
            char[] r7 = okhttp3.internal.url._UrlKt.HEX_DIGITS
            int r6 = r6 >> 4
            r6 = r6 & 15
            char r6 = r7[r6]
            r8.writeByte(r6)
            r5 = r5 & 15
            char r5 = r7[r5]
            r8.writeByte(r5)
            goto L94
        Lb6:
            kotlin.n1 r4 = kotlin.n1.a
        Lb8:
            int r3 = java.lang.Character.charCount(r3)
            int r10 = r10 + r3
            goto L13
        Lbf:
            return
    }

    public static final void writePercentDecoded(@org.jetbrains.annotations.NotNull okio.Buffer r5, @org.jetbrains.annotations.NotNull java.lang.String r6, int r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "encoded"
            kotlin.jvm.internal.g0.p(r6, r0)
        La:
            if (r7 >= r8) goto L52
            int r0 = r6.codePointAt(r7)
            r1 = 37
            if (r0 != r1) goto L3b
            int r1 = r7 + 2
            if (r1 >= r8) goto L3b
            int r2 = r7 + 1
            char r2 = r6.charAt(r2)
            int r2 = okhttp3.internal._UtilCommonKt.parseHexDigit(r2)
            char r3 = r6.charAt(r1)
            int r3 = okhttp3.internal._UtilCommonKt.parseHexDigit(r3)
            r4 = -1
            if (r2 == r4) goto L49
            if (r3 == r4) goto L49
            int r7 = r2 << 4
            int r7 = r7 + r3
            r5.writeByte(r7)
            int r7 = java.lang.Character.charCount(r0)
            int r7 = r7 + r1
            goto La
        L3b:
            r1 = 43
            if (r0 != r1) goto L49
            if (r9 == 0) goto L49
            r0 = 32
            r5.writeByte(r0)
            int r7 = r7 + 1
            goto La
        L49:
            r5.writeUtf8CodePoint(r0)
            int r0 = java.lang.Character.charCount(r0)
            int r7 = r7 + r0
            goto La
        L52:
            return
    }
}
