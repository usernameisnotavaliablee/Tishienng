package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class StringUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String[] BYTE2HEX_NOPAD = null;
    private static final java.lang.String[] BYTE2HEX_PAD = null;
    public static final char CARRIAGE_RETURN = '\r';
    public static final char COMMA = ',';
    private static final int CSV_NUMBER_ESCAPE_CHARACTERS = 7;
    public static final char DOUBLE_QUOTE = '\"';
    public static final java.lang.String EMPTY_STRING = "";
    public static final char LINE_FEED = '\n';
    public static final java.lang.String NEWLINE = null;
    private static final char PACKAGE_SEPARATOR_CHAR = '.';
    public static final char SPACE = ' ';
    public static final char TAB = '\t';

    static {
            java.lang.String r0 = "line.separator"
            java.lang.String r1 = "\n"
            java.lang.String r0 = io.netty.util.internal.SystemPropertyUtil.get(r0, r1)
            io.netty.util.internal.StringUtil.NEWLINE = r0
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String[] r1 = new java.lang.String[r0]
            io.netty.util.internal.StringUtil.BYTE2HEX_PAD = r1
            java.lang.String[] r0 = new java.lang.String[r0]
            io.netty.util.internal.StringUtil.BYTE2HEX_NOPAD = r0
            r0 = 0
        L15:
            java.lang.String[] r1 = io.netty.util.internal.StringUtil.BYTE2HEX_PAD
            int r2 = r1.length
            if (r0 >= r2) goto L3e
            java.lang.String r2 = java.lang.Integer.toHexString(r0)
            r3 = 15
            if (r0 <= r3) goto L24
            r3 = r2
            goto L35
        L24:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 48
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
        L35:
            r1[r0] = r3
            java.lang.String[] r1 = io.netty.util.internal.StringUtil.BYTE2HEX_NOPAD
            r1[r0] = r2
            int r0 = r0 + 1
            goto L15
        L3e:
            return
    }

    private StringUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T extends java.lang.Appendable> T byteToHexString(T r0, int r1) {
            java.lang.String r1 = byteToHexString(r1)     // Catch: java.io.IOException -> L8
            r0.append(r1)     // Catch: java.io.IOException -> L8
            return r0
        L8:
            r1 = move-exception
            io.netty.util.internal.PlatformDependent.throwException(r1)
            return r0
    }

    public static java.lang.String byteToHexString(int r1) {
            java.lang.String[] r0 = io.netty.util.internal.StringUtil.BYTE2HEX_NOPAD
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r0[r1]
            return r1
    }

    public static <T extends java.lang.Appendable> T byteToHexStringPadded(T r0, int r1) {
            java.lang.String r1 = byteToHexStringPadded(r1)     // Catch: java.io.IOException -> L8
            r0.append(r1)     // Catch: java.io.IOException -> L8
            return r0
        L8:
            r1 = move-exception
            io.netty.util.internal.PlatformDependent.throwException(r1)
            return r0
    }

    public static java.lang.String byteToHexStringPadded(int r1) {
            java.lang.String[] r0 = io.netty.util.internal.StringUtil.BYTE2HEX_PAD
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r0[r1]
            return r1
    }

    public static boolean commonSuffixOfLength(java.lang.String r2, java.lang.String r3, int r4) {
            if (r2 == 0) goto L18
            if (r3 == 0) goto L18
            if (r4 < 0) goto L18
            int r0 = r2.length()
            int r0 = r0 - r4
            int r1 = r3.length()
            int r1 = r1 - r4
            boolean r2 = r2.regionMatches(r0, r3, r1, r4)
            if (r2 == 0) goto L18
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    public static byte decodeHexByte(java.lang.CharSequence r4, int r5) {
            char r0 = r4.charAt(r5)
            int r0 = decodeHexNibble(r0)
            int r1 = r5 + 1
            char r1 = r4.charAt(r1)
            int r1 = decodeHexNibble(r1)
            r2 = -1
            if (r0 == r2) goto L1c
            if (r1 == r2) goto L1c
            int r4 = r0 << 4
            int r4 = r4 + r1
            byte r4 = (byte) r4
            return r4
        L1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r5 + 2
            java.lang.CharSequence r1 = r4.subSequence(r5, r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r5
            r5 = 2
            r2[r5] = r4
            java.lang.String r4 = "invalid hex byte '%s' at index %d of '%s'"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
    }

    public static byte[] decodeHexDump(java.lang.CharSequence r2) {
            r0 = 0
            int r1 = r2.length()
            byte[] r2 = decodeHexDump(r2, r0, r1)
            return r2
    }

    public static byte[] decodeHexDump(java.lang.CharSequence r4, int r5, int r6) {
            if (r6 < 0) goto L20
            r0 = r6 & 1
            if (r0 != 0) goto L20
            if (r6 != 0) goto Lb
            byte[] r4 = io.netty.util.internal.EmptyArrays.EMPTY_BYTES
            return r4
        Lb:
            int r0 = r6 >>> 1
            byte[] r0 = new byte[r0]
            r1 = 0
        L10:
            if (r1 >= r6) goto L1f
            int r2 = r1 >>> 1
            int r3 = r5 + r1
            byte r3 = decodeHexByte(r4, r3)
            r0[r2] = r3
            int r1 = r1 + 2
            goto L10
        L1f:
            return r0
        L20:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "length: "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public static int decodeHexNibble(char r2) {
            r0 = 48
            if (r2 < r0) goto La
            r1 = 57
            if (r2 > r1) goto La
            int r2 = r2 - r0
            return r2
        La:
            r0 = 65
            if (r2 < r0) goto L15
            r0 = 70
            if (r2 > r0) goto L15
            int r2 = r2 + (-55)
            return r2
        L15:
            r0 = 97
            if (r2 < r0) goto L20
            r0 = 102(0x66, float:1.43E-43)
            if (r2 > r0) goto L20
            int r2 = r2 + (-87)
            return r2
        L20:
            r2 = -1
            return r2
    }

    public static boolean endsWith(java.lang.CharSequence r2, char r3) {
            int r0 = r2.length()
            if (r0 <= 0) goto Lf
            r1 = 1
            int r0 = r0 - r1
            char r2 = r2.charAt(r0)
            if (r2 != r3) goto Lf
            return r1
        Lf:
            r2 = 0
            return r2
    }

    public static java.lang.CharSequence escapeCsv(java.lang.CharSequence r1) {
            r0 = 0
            java.lang.CharSequence r1 = escapeCsv(r1, r0)
            return r1
    }

    public static java.lang.CharSequence escapeCsv(java.lang.CharSequence r7, boolean r8) {
            java.lang.String r0 = "value"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r7, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L19
            int r8 = indexOfFirstNonOwsChar(r7, r0)
            int r0 = indexOfLastNonOwsChar(r7, r8, r0)
            goto L1b
        L19:
            int r0 = r0 - r2
            r8 = 0
        L1b:
            if (r8 <= r0) goto L20
            java.lang.String r7 = ""
            return r7
        L20:
            char r3 = r7.charAt(r8)
            boolean r3 = isDoubleQuote(r3)
            r4 = -1
            if (r3 == 0) goto L47
            char r3 = r7.charAt(r0)
            boolean r3 = isDoubleQuote(r3)
            if (r3 == 0) goto L38
            if (r0 <= r8) goto L38
            r1 = 1
        L38:
            if (r1 == 0) goto L43
            int r8 = r8 + 1
            int r0 = r0 + (-1)
            r3 = r1
            r1 = r0
        L40:
            r0 = r8
            r8 = -1
            goto L4a
        L43:
            r3 = r1
            r1 = r0
            r0 = r8
            goto L4a
        L47:
            r1 = r0
            r3 = 0
            goto L40
        L4a:
            if (r8 >= 0) goto La8
            if (r3 == 0) goto L6d
            r4 = r0
        L4f:
            if (r4 > r1) goto L9a
            char r5 = r7.charAt(r4)
            boolean r5 = isDoubleQuote(r5)
            if (r5 == 0) goto L6b
            if (r4 == r1) goto L99
            int r5 = r4 + 1
            char r6 = r7.charAt(r5)
            boolean r6 = isDoubleQuote(r6)
            if (r6 != 0) goto L6a
            goto L99
        L6a:
            r4 = r5
        L6b:
            int r4 = r4 + r2
            goto L4f
        L6d:
            r4 = r0
        L6e:
            if (r4 > r1) goto L9a
            char r5 = r7.charAt(r4)
            r6 = 10
            if (r5 == r6) goto L99
            r6 = 13
            if (r5 == r6) goto L99
            r6 = 44
            if (r5 != r6) goto L81
            goto L99
        L81:
            boolean r5 = isDoubleQuote(r5)
            if (r5 == 0) goto L97
            if (r4 == r1) goto L99
            int r5 = r4 + 1
            char r6 = r7.charAt(r5)
            boolean r6 = isDoubleQuote(r6)
            if (r6 != 0) goto L96
            goto L99
        L96:
            r4 = r5
        L97:
            int r4 = r4 + r2
            goto L6e
        L99:
            r8 = r4
        L9a:
            if (r8 >= 0) goto La8
            if (r3 == 0) goto La6
            int r0 = r0 - r2
            int r1 = r1 + 2
        La1:
            java.lang.CharSequence r7 = r7.subSequence(r0, r1)
            return r7
        La6:
            int r1 = r1 + r2
            goto La1
        La8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r4 = r1 - r0
            int r4 = r4 + 8
            r3.<init>(r4)
            r4 = 34
            r3.append(r4)
            r3.append(r7, r0, r8)
        Lb9:
            if (r8 > r1) goto Ldc
            char r0 = r7.charAt(r8)
            boolean r5 = isDoubleQuote(r0)
            if (r5 == 0) goto Ld7
            r3.append(r4)
            if (r8 >= r1) goto Ld7
            int r5 = r8 + 1
            char r6 = r7.charAt(r5)
            boolean r6 = isDoubleQuote(r6)
            if (r6 == 0) goto Ld7
            r8 = r5
        Ld7:
            r3.append(r0)
            int r8 = r8 + r2
            goto Lb9
        Ldc:
            r3.append(r4)
            return r3
    }

    private static int indexOfFirstNonOwsChar(java.lang.CharSequence r2, int r3) {
            r0 = 0
        L1:
            if (r0 >= r3) goto L10
            char r1 = r2.charAt(r0)
            boolean r1 = isOws(r1)
            if (r1 == 0) goto L10
            int r0 = r0 + 1
            goto L1
        L10:
            return r0
    }

    private static int indexOfLastNonOwsChar(java.lang.CharSequence r1, int r2, int r3) {
            int r3 = r3 + (-1)
        L2:
            if (r3 <= r2) goto L11
            char r0 = r1.charAt(r3)
            boolean r0 = isOws(r0)
            if (r0 == 0) goto L11
            int r3 = r3 + (-1)
            goto L2
        L11:
            return r3
    }

    public static int indexOfNonWhiteSpace(java.lang.CharSequence r1, int r2) {
        L0:
            int r0 = r1.length()
            if (r2 >= r0) goto L14
            char r0 = r1.charAt(r2)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 != 0) goto L11
            return r2
        L11:
            int r2 = r2 + 1
            goto L0
        L14:
            r1 = -1
            return r1
    }

    private static boolean isDoubleQuote(char r1) {
            r0 = 34
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public static boolean isNullOrEmpty(java.lang.String r0) {
            if (r0 == 0) goto Lb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    private static boolean isOws(char r1) {
            r0 = 32
            if (r1 == r0) goto Lb
            r0 = 9
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r1 = 0
            return r1
        Lb:
            r1 = 1
            return r1
    }

    public static boolean isSurrogate(char r1) {
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r0) goto Lc
            r0 = 57343(0xdfff, float:8.0355E-41)
            if (r1 > r0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static int length(java.lang.String r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r0.length()
            return r0
    }

    private static java.lang.IllegalArgumentException newInvalidEscapedCsvFieldException(java.lang.CharSequence r3, int r4) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid escaped CSV field: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " index: "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            return r0
    }

    public static java.lang.String simpleClassName(java.lang.Class<?> r2) {
            java.lang.String r0 = "clazz"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r2 = r2.getName()
            r0 = 46
            int r0 = r2.lastIndexOf(r0)
            r1 = -1
            if (r0 <= r1) goto L1b
            int r0 = r0 + 1
            java.lang.String r2 = r2.substring(r0)
        L1b:
            return r2
    }

    public static java.lang.String simpleClassName(java.lang.Object r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = "null_object"
            return r0
        L5:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = simpleClassName(r0)
            return r0
    }

    public static java.lang.String substringAfter(java.lang.String r0, char r1) {
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Ld
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public static <T extends java.lang.Appendable> T toHexString(T r2, byte[] r3) {
            r0 = 0
            int r1 = r3.length
            java.lang.Appendable r2 = toHexString(r2, r3, r0, r1)
            return r2
    }

    public static <T extends java.lang.Appendable> T toHexString(T r2, byte[] r3, int r4, int r5) {
            if (r5 != 0) goto L3
            return r2
        L3:
            int r5 = r5 + r4
            int r0 = r5 + (-1)
        L6:
            if (r4 >= r0) goto L10
            r1 = r3[r4]
            if (r1 == 0) goto Ld
            goto L10
        Ld:
            int r4 = r4 + 1
            goto L6
        L10:
            int r0 = r4 + 1
            r4 = r3[r4]
            byteToHexString(r2, r4)
            int r5 = r5 - r0
            toHexStringPadded(r2, r3, r0, r5)
            return r2
    }

    public static java.lang.String toHexString(byte[] r2) {
            r0 = 0
            int r1 = r2.length
            java.lang.String r2 = toHexString(r2, r0, r1)
            return r2
    }

    public static java.lang.String toHexString(byte[] r2, int r3, int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4 << 1
            r0.<init>(r1)
            java.lang.Appendable r2 = toHexString(r0, r2, r3, r4)
            java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static <T extends java.lang.Appendable> T toHexStringPadded(T r2, byte[] r3) {
            r0 = 0
            int r1 = r3.length
            java.lang.Appendable r2 = toHexStringPadded(r2, r3, r0, r1)
            return r2
    }

    public static <T extends java.lang.Appendable> T toHexStringPadded(T r1, byte[] r2, int r3, int r4) {
            int r4 = r4 + r3
        L1:
            if (r3 >= r4) goto Lb
            r0 = r2[r3]
            byteToHexStringPadded(r1, r0)
            int r3 = r3 + 1
            goto L1
        Lb:
            return r1
    }

    public static java.lang.String toHexStringPadded(byte[] r2) {
            r0 = 0
            int r1 = r2.length
            java.lang.String r2 = toHexStringPadded(r2, r0, r1)
            return r2
    }

    public static java.lang.String toHexStringPadded(byte[] r2, int r3, int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4 << 1
            r0.<init>(r1)
            java.lang.Appendable r2 = toHexStringPadded(r0, r2, r3, r4)
            java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static java.lang.CharSequence trimOws(java.lang.CharSequence r3) {
            int r0 = r3.length()
            if (r0 != 0) goto L7
            goto L15
        L7:
            int r1 = indexOfFirstNonOwsChar(r3, r0)
            int r2 = indexOfLastNonOwsChar(r3, r1, r0)
            if (r1 != 0) goto L16
            int r0 = r0 + (-1)
            if (r2 != r0) goto L16
        L15:
            return r3
        L16:
            int r2 = r2 + 1
            java.lang.CharSequence r3 = r3.subSequence(r1, r2)
            return r3
    }

    public static java.lang.CharSequence unescapeCsv(java.lang.CharSequence r7) {
            java.lang.String r0 = "value"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r7, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto Lf
            return r7
        Lf:
            int r1 = r0 + (-1)
            r2 = 0
            char r2 = r7.charAt(r2)
            boolean r2 = isDoubleQuote(r2)
            if (r2 == 0) goto L5b
            char r2 = r7.charAt(r1)
            boolean r2 = isDoubleQuote(r2)
            if (r2 == 0) goto L5b
            r2 = 1
            if (r0 == r2) goto L5b
            io.netty.util.internal.InternalThreadLocalMap r0 = io.netty.util.internal.InternalThreadLocalMap.get()
            java.lang.StringBuilder r0 = r0.stringBuilder()
            r3 = 1
        L32:
            if (r3 >= r1) goto L56
            char r4 = r7.charAt(r3)
            r5 = 34
            if (r4 != r5) goto L51
            int r5 = r3 + 1
            char r6 = r7.charAt(r5)
            boolean r6 = isDoubleQuote(r6)
            if (r6 == 0) goto L4c
            if (r5 == r1) goto L4c
            r3 = r5
            goto L51
        L4c:
            java.lang.IllegalArgumentException r7 = newInvalidEscapedCsvFieldException(r7, r3)
            throw r7
        L51:
            r0.append(r4)
            int r3 = r3 + r2
            goto L32
        L56:
            java.lang.String r7 = r0.toString()
            return r7
        L5b:
            validateCsvFormat(r7)
            return r7
    }

    public static java.util.List<java.lang.CharSequence> unescapeCsvFields(java.lang.CharSequence r11) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            io.netty.util.internal.InternalThreadLocalMap r1 = io.netty.util.internal.InternalThreadLocalMap.get()
            java.lang.StringBuilder r1 = r1.stringBuilder()
            int r2 = r11.length()
            r3 = 1
            int r2 = r2 - r3
            r4 = 0
            r5 = 0
            r6 = 0
        L17:
            if (r5 > r2) goto L7d
            char r7 = r11.charAt(r5)
            r8 = 44
            r9 = 34
            if (r6 == 0) goto L54
            if (r7 == r9) goto L29
            r1.append(r7)
            goto L76
        L29:
            if (r5 != r2) goto L33
            java.lang.String r11 = r1.toString()
            r0.add(r11)
            return r0
        L33:
            int r7 = r5 + 1
            char r10 = r11.charAt(r7)
            if (r10 != r9) goto L40
            r1.append(r9)
            r5 = r7
            goto L76
        L40:
            if (r10 != r8) goto L4f
            java.lang.String r5 = r1.toString()
            r0.add(r5)
            r1.setLength(r4)
            r5 = r7
            r6 = 0
            goto L76
        L4f:
            java.lang.IllegalArgumentException r11 = newInvalidEscapedCsvFieldException(r11, r5)
            throw r11
        L54:
            r10 = 10
            if (r7 == r10) goto L78
            r10 = 13
            if (r7 == r10) goto L78
            if (r7 == r9) goto L6f
            if (r7 == r8) goto L64
            r1.append(r7)
            goto L76
        L64:
            java.lang.String r7 = r1.toString()
            r0.add(r7)
            r1.setLength(r4)
            goto L76
        L6f:
            int r6 = r1.length()
            if (r6 != 0) goto L78
            r6 = 1
        L76:
            int r5 = r5 + r3
            goto L17
        L78:
            java.lang.IllegalArgumentException r11 = newInvalidEscapedCsvFieldException(r11, r5)
            throw r11
        L7d:
            if (r6 != 0) goto L87
            java.lang.String r11 = r1.toString()
            r0.add(r11)
            return r0
        L87:
            java.lang.IllegalArgumentException r11 = newInvalidEscapedCsvFieldException(r11, r2)
            throw r11
    }

    private static void validateCsvFormat(java.lang.CharSequence r4) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L23
            char r2 = r4.charAt(r1)
            r3 = 10
            if (r2 == r3) goto L1e
            r3 = 13
            if (r2 == r3) goto L1e
            r3 = 34
            if (r2 == r3) goto L1e
            r3 = 44
            if (r2 == r3) goto L1e
            int r1 = r1 + 1
            goto L5
        L1e:
            java.lang.IllegalArgumentException r4 = newInvalidEscapedCsvFieldException(r4, r1)
            throw r4
        L23:
            return
    }
}
