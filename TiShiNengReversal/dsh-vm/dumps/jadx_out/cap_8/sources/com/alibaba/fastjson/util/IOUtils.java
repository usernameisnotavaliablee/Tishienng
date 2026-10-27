package com.alibaba.fastjson.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class IOUtils {
    public static final char[] ASCII_CHARS = null;
    public static final char[] CA = null;
    public static final java.util.Properties DEFAULT_PROPERTIES = null;
    public static final char[] DIGITS = null;
    static final char[] DigitOnes = null;
    static final char[] DigitTens = null;
    public static final java.lang.String FASTJSON_COMPATIBLEWITHFIELDNAME = "fastjson.compatibleWithFieldName";
    public static final java.lang.String FASTJSON_COMPATIBLEWITHJAVABEAN = "fastjson.compatibleWithJavaBean";
    public static final java.lang.String FASTJSON_PROPERTIES = "fastjson.properties";
    public static final int[] IA = null;
    public static final java.nio.charset.Charset UTF8 = null;
    static final char[] digits = null;
    public static final boolean[] firstIdentifierFlags = null;
    public static final boolean[] identifierFlags = null;
    public static final char[] replaceChars = null;
    static final int[] sizeTable = null;
    public static final byte[] specicalFlags_doubleQuotes = null;
    public static final boolean[] specicalFlags_doubleQuotesFlags = null;
    public static final byte[] specicalFlags_singleQuotes = null;
    public static final boolean[] specicalFlags_singleQuotesFlags = null;


    static {
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            com.alibaba.fastjson.util.IOUtils.DEFAULT_PROPERTIES = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.alibaba.fastjson.util.IOUtils.UTF8 = r0
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x01c0: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            com.alibaba.fastjson.util.IOUtils.DIGITS = r0
            r0 = 256(0x100, float:3.59E-43)
            boolean[] r1 = new boolean[r0]
            com.alibaba.fastjson.util.IOUtils.firstIdentifierFlags = r1
            r1 = 0
            r2 = 0
        L20:
            boolean[] r3 = com.alibaba.fastjson.util.IOUtils.firstIdentifierFlags
            int r4 = r3.length
            r5 = 95
            r6 = 122(0x7a, float:1.71E-43)
            r7 = 97
            r8 = 90
            r9 = 65
            r10 = 1
            if (r2 >= r4) goto L46
            if (r2 < r9) goto L37
            if (r2 > r8) goto L37
            r3[r2] = r10
            goto L42
        L37:
            if (r2 < r7) goto L3e
            if (r2 > r6) goto L3e
            r3[r2] = r10
            goto L42
        L3e:
            if (r2 != r5) goto L42
            r3[r2] = r10
        L42:
            int r2 = r2 + 1
            char r2 = (char) r2
            goto L20
        L46:
            boolean[] r2 = new boolean[r0]
            com.alibaba.fastjson.util.IOUtils.identifierFlags = r2
            r2 = 0
        L4b:
            boolean[] r3 = com.alibaba.fastjson.util.IOUtils.identifierFlags
            int r4 = r3.length
            r11 = 48
            if (r2 >= r4) goto L71
            if (r2 < r9) goto L59
            if (r2 > r8) goto L59
            r3[r2] = r10
            goto L6d
        L59:
            if (r2 < r7) goto L60
            if (r2 > r6) goto L60
            r3[r2] = r10
            goto L6d
        L60:
            if (r2 != r5) goto L65
            r3[r2] = r10
            goto L6d
        L65:
            if (r2 < r11) goto L6d
            r4 = 57
            if (r2 > r4) goto L6d
            r3[r2] = r10
        L6d:
            int r2 = r2 + 1
            char r2 = (char) r2
            goto L4b
        L71:
            loadPropertiesFromFile()     // Catch: java.lang.Throwable -> L74
        L74:
            r2 = 161(0xa1, float:2.26E-43)
            byte[] r3 = new byte[r2]
            com.alibaba.fastjson.util.IOUtils.specicalFlags_doubleQuotes = r3
            byte[] r4 = new byte[r2]
            com.alibaba.fastjson.util.IOUtils.specicalFlags_singleQuotes = r4
            boolean[] r5 = new boolean[r2]
            com.alibaba.fastjson.util.IOUtils.specicalFlags_doubleQuotesFlags = r5
            boolean[] r5 = new boolean[r2]
            com.alibaba.fastjson.util.IOUtils.specicalFlags_singleQuotesFlags = r5
            r5 = 93
            char[] r5 = new char[r5]
            com.alibaba.fastjson.util.IOUtils.replaceChars = r5
            r5 = 4
            r3[r1] = r5
            r3[r10] = r5
            r6 = 2
            r3[r6] = r5
            r7 = 3
            r3[r7] = r5
            r3[r5] = r5
            r8 = 5
            r3[r8] = r5
            r9 = 6
            r3[r9] = r5
            r12 = 7
            r3[r12] = r5
            r13 = 8
            r3[r13] = r10
            r14 = 9
            r3[r14] = r10
            r15 = 10
            r3[r15] = r10
            r16 = 11
            r3[r16] = r5
            r17 = 12
            r3[r17] = r10
            r18 = 13
            r3[r18] = r10
            r19 = 34
            r3[r19] = r10
            r20 = 92
            r3[r20] = r10
            r4[r1] = r5
            r4[r10] = r5
            r4[r6] = r5
            r4[r7] = r5
            r4[r5] = r5
            r4[r8] = r5
            r4[r9] = r5
            r4[r12] = r5
            r4[r13] = r10
            r4[r14] = r10
            r4[r15] = r10
            r4[r16] = r5
            r4[r17] = r10
            r4[r18] = r10
            r4[r20] = r10
            r3 = 39
            r4[r3] = r10
            r4 = 14
            r21 = 0
        Le8:
            r1 = 31
            if (r4 > r1) goto Lf7
            byte[] r1 = com.alibaba.fastjson.util.IOUtils.specicalFlags_doubleQuotes
            r1[r4] = r5
            byte[] r1 = com.alibaba.fastjson.util.IOUtils.specicalFlags_singleQuotes
            r1[r4] = r5
            int r4 = r4 + 1
            goto Le8
        Lf7:
            r1 = 127(0x7f, float:1.78E-43)
        Lf9:
            r4 = 160(0xa0, float:2.24E-43)
            if (r1 >= r4) goto L108
            byte[] r4 = com.alibaba.fastjson.util.IOUtils.specicalFlags_doubleQuotes
            r4[r1] = r5
            byte[] r4 = com.alibaba.fastjson.util.IOUtils.specicalFlags_singleQuotes
            r4[r1] = r5
            int r1 = r1 + 1
            goto Lf9
        L108:
            r1 = 0
        L109:
            if (r1 >= r2) goto L12c
            boolean[] r4 = com.alibaba.fastjson.util.IOUtils.specicalFlags_doubleQuotesFlags
            byte[] r22 = com.alibaba.fastjson.util.IOUtils.specicalFlags_doubleQuotes
            r22 = r22[r1]
            if (r22 == 0) goto L116
            r22 = 1
            goto L118
        L116:
            r22 = 0
        L118:
            r4[r1] = r22
            boolean[] r4 = com.alibaba.fastjson.util.IOUtils.specicalFlags_singleQuotesFlags
            byte[] r22 = com.alibaba.fastjson.util.IOUtils.specicalFlags_singleQuotes
            r22 = r22[r1]
            if (r22 == 0) goto L125
            r22 = 1
            goto L127
        L125:
            r22 = 0
        L127:
            r4[r1] = r22
            int r1 = r1 + 1
            goto L109
        L12c:
            char[] r1 = com.alibaba.fastjson.util.IOUtils.replaceChars
            r1[r21] = r11
            r2 = 49
            r1[r10] = r2
            r2 = 50
            r1[r6] = r2
            r2 = 51
            r1[r7] = r2
            r2 = 52
            r1[r5] = r2
            r2 = 53
            r1[r8] = r2
            r2 = 54
            r1[r9] = r2
            r2 = 55
            r1[r12] = r2
            r2 = 98
            r1[r13] = r2
            r2 = 116(0x74, float:1.63E-43)
            r1[r14] = r2
            r2 = 110(0x6e, float:1.54E-43)
            r1[r15] = r2
            r2 = 118(0x76, float:1.65E-43)
            r1[r16] = r2
            r2 = 102(0x66, float:1.43E-43)
            r1[r17] = r2
            r2 = 114(0x72, float:1.6E-43)
            r1[r18] = r2
            r1[r19] = r19
            r1[r3] = r3
            r2 = 47
            r3 = 47
            r1[r2] = r3
            r1[r20] = r20
            r1 = 96
            char[] r1 = new char[r1]
            r1 = {x01d4: FILL_ARRAY_DATA , data: [48, 48, 48, 49, 48, 50, 48, 51, 48, 52, 48, 53, 48, 54, 48, 55, 48, 56, 48, 57, 48, 65, 48, 66, 48, 67, 48, 68, 48, 69, 48, 70, 49, 48, 49, 49, 49, 50, 49, 51, 49, 52, 49, 53, 49, 54, 49, 55, 49, 56, 49, 57, 49, 65, 49, 66, 49, 67, 49, 68, 49, 69, 49, 70, 50, 48, 50, 49, 50, 50, 50, 51, 50, 52, 50, 53, 50, 54, 50, 55, 50, 56, 50, 57, 50, 65, 50, 66, 50, 67, 50, 68, 50, 69, 50, 70} // fill-array
            com.alibaba.fastjson.util.IOUtils.ASCII_CHARS = r1
            r1 = 36
            char[] r1 = new char[r1]
            r1 = {x0238: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122} // fill-array
            com.alibaba.fastjson.util.IOUtils.digits = r1
            r1 = 100
            char[] r2 = new char[r1]
            r2 = {x0260: FILL_ARRAY_DATA , data: [48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 53, 53, 53, 53, 53, 53, 53, 53, 53, 53, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57} // fill-array
            com.alibaba.fastjson.util.IOUtils.DigitTens = r2
            char[] r1 = new char[r1]
            r1 = {x02c8: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57} // fill-array
            com.alibaba.fastjson.util.IOUtils.DigitOnes = r1
            int[] r1 = new int[r15]
            r1 = {x0330: FILL_ARRAY_DATA , data: [9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 2147483647} // fill-array
            com.alibaba.fastjson.util.IOUtils.sizeTable = r1
            java.lang.String r1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
            char[] r1 = r1.toCharArray()
            com.alibaba.fastjson.util.IOUtils.CA = r1
            int[] r0 = new int[r0]
            com.alibaba.fastjson.util.IOUtils.IA = r0
            r2 = -1
            java.util.Arrays.fill(r0, r2)
            int r0 = r1.length
            r1 = 0
        L1ab:
            if (r1 >= r0) goto L1b8
            int[] r2 = com.alibaba.fastjson.util.IOUtils.IA
            char[] r3 = com.alibaba.fastjson.util.IOUtils.CA
            char r3 = r3[r1]
            r2[r3] = r1
            int r1 = r1 + 1
            goto L1ab
        L1b8:
            int[] r0 = com.alibaba.fastjson.util.IOUtils.IA
            r1 = 61
            r0[r1] = r21
            return
    }

    public IOUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void close(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Exception -> L5
        L5:
            return
    }

    public static void decode(java.nio.charset.CharsetDecoder r1, java.nio.ByteBuffer r2, java.nio.CharBuffer r3) {
            r0 = 1
            java.nio.charset.CoderResult r2 = r1.decode(r2, r3, r0)     // Catch: java.nio.charset.CharacterCodingException -> L1c
            boolean r0 = r2.isUnderflow()     // Catch: java.nio.charset.CharacterCodingException -> L1c
            if (r0 != 0) goto Le
            r2.throwException()     // Catch: java.nio.charset.CharacterCodingException -> L1c
        Le:
            java.nio.charset.CoderResult r1 = r1.flush(r3)     // Catch: java.nio.charset.CharacterCodingException -> L1c
            boolean r2 = r1.isUnderflow()     // Catch: java.nio.charset.CharacterCodingException -> L1c
            if (r2 != 0) goto L1b
            r1.throwException()     // Catch: java.nio.charset.CharacterCodingException -> L1c
        L1b:
            return
        L1c:
            r1 = move-exception
            com.alibaba.fastjson.JSONException r2 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "utf8 decode error, "
            r3.append(r0)
            java.lang.String r0 = r1.getMessage()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r1)
            throw r2
    }

    public static byte[] decodeBase64(java.lang.String r17) {
            r0 = r17
            int r1 = r0.length()
            r2 = 0
            if (r1 != 0) goto Lc
            byte[] r0 = new byte[r2]
            return r0
        Lc:
            int r3 = r1 + (-1)
            r4 = 0
        Lf:
            if (r4 >= r3) goto L20
            int[] r5 = com.alibaba.fastjson.util.IOUtils.IA
            char r6 = r0.charAt(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5[r6]
            if (r5 >= 0) goto L20
            int r4 = r4 + 1
            goto Lf
        L20:
            if (r3 <= 0) goto L31
            int[] r5 = com.alibaba.fastjson.util.IOUtils.IA
            char r6 = r0.charAt(r3)
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5[r6]
            if (r5 >= 0) goto L31
            int r3 = r3 + (-1)
            goto L20
        L31:
            char r5 = r0.charAt(r3)
            r6 = 61
            r7 = 1
            if (r5 != r6) goto L46
            int r5 = r3 + (-1)
            char r5 = r0.charAt(r5)
            if (r5 != r6) goto L44
            r5 = 2
            goto L47
        L44:
            r5 = 1
            goto L47
        L46:
            r5 = 0
        L47:
            int r6 = r3 - r4
            int r6 = r6 + r7
            r8 = 76
            if (r1 <= r8) goto L5c
            char r1 = r0.charAt(r8)
            r8 = 13
            if (r1 != r8) goto L59
            int r1 = r6 / 78
            goto L5a
        L59:
            r1 = 0
        L5a:
            int r1 = r1 << r7
            goto L5d
        L5c:
            r1 = 0
        L5d:
            int r6 = r6 - r1
            int r6 = r6 * 6
            int r6 = r6 >> 3
            int r6 = r6 - r5
            byte[] r8 = new byte[r6]
            int r9 = r6 / 3
            int r9 = r9 * 3
            r10 = 0
            r11 = 0
        L6b:
            if (r10 >= r9) goto Lba
            int[] r12 = com.alibaba.fastjson.util.IOUtils.IA
            int r13 = r4 + 1
            char r14 = r0.charAt(r4)
            r14 = r12[r14]
            int r14 = r14 << 18
            int r15 = r4 + 2
            char r13 = r0.charAt(r13)
            r13 = r12[r13]
            int r13 = r13 << 12
            r13 = r13 | r14
            int r14 = r4 + 3
            char r15 = r0.charAt(r15)
            r15 = r12[r15]
            int r15 = r15 << 6
            r13 = r13 | r15
            int r15 = r4 + 4
            char r14 = r0.charAt(r14)
            r12 = r12[r14]
            r12 = r12 | r13
            int r13 = r10 + 1
            int r14 = r12 >> 16
            byte r14 = (byte) r14
            r8[r10] = r14
            int r14 = r10 + 2
            int r2 = r12 >> 8
            byte r2 = (byte) r2
            r8[r13] = r2
            int r10 = r10 + 3
            byte r2 = (byte) r12
            r8[r14] = r2
            if (r1 <= 0) goto Lb7
            int r11 = r11 + 1
            r2 = 19
            if (r11 != r2) goto Lb7
            int r4 = r4 + 6
            r11 = 0
            goto Lb8
        Lb7:
            r4 = r15
        Lb8:
            r2 = 0
            goto L6b
        Lba:
            if (r10 >= r6) goto Le6
            r2 = 0
            r16 = 0
        Lbf:
            int r1 = r3 - r5
            if (r4 > r1) goto Ld7
            int[] r1 = com.alibaba.fastjson.util.IOUtils.IA
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            r1 = r1[r4]
            int r4 = r16 * 6
            int r4 = 18 - r4
            int r1 = r1 << r4
            r2 = r2 | r1
            int r16 = r16 + 1
            r4 = r9
            goto Lbf
        Ld7:
            r0 = 16
        Ld9:
            if (r10 >= r6) goto Le6
            int r1 = r10 + 1
            int r3 = r2 >> r0
            byte r3 = (byte) r3
            r8[r10] = r3
            int r0 = r0 + (-8)
            r10 = r1
            goto Ld9
        Le6:
            return r8
    }

    public static byte[] decodeBase64(java.lang.String r17, int r18, int r19) {
            r0 = r17
            r1 = r19
            r2 = 0
            if (r1 != 0) goto La
            byte[] r0 = new byte[r2]
            return r0
        La:
            int r3 = r18 + r1
            r4 = 1
            int r3 = r3 - r4
            r5 = r18
        L10:
            if (r5 >= r3) goto L1f
            int[] r6 = com.alibaba.fastjson.util.IOUtils.IA
            char r7 = r0.charAt(r5)
            r6 = r6[r7]
            if (r6 >= 0) goto L1f
            int r5 = r5 + 1
            goto L10
        L1f:
            if (r3 <= 0) goto L2e
            int[] r6 = com.alibaba.fastjson.util.IOUtils.IA
            char r7 = r0.charAt(r3)
            r6 = r6[r7]
            if (r6 >= 0) goto L2e
            int r3 = r3 + (-1)
            goto L1f
        L2e:
            char r6 = r0.charAt(r3)
            r7 = 61
            if (r6 != r7) goto L42
            int r6 = r3 + (-1)
            char r6 = r0.charAt(r6)
            if (r6 != r7) goto L40
            r6 = 2
            goto L43
        L40:
            r6 = 1
            goto L43
        L42:
            r6 = 0
        L43:
            int r7 = r3 - r5
            int r7 = r7 + r4
            r8 = 76
            if (r1 <= r8) goto L58
            char r1 = r0.charAt(r8)
            r8 = 13
            if (r1 != r8) goto L55
            int r1 = r7 / 78
            goto L56
        L55:
            r1 = 0
        L56:
            int r1 = r1 << r4
            goto L59
        L58:
            r1 = 0
        L59:
            int r7 = r7 - r1
            int r7 = r7 * 6
            int r7 = r7 >> 3
            int r7 = r7 - r6
            byte[] r8 = new byte[r7]
            int r9 = r7 / 3
            int r9 = r9 * 3
            r10 = 0
            r11 = 0
        L67:
            if (r10 >= r9) goto Lb6
            int[] r12 = com.alibaba.fastjson.util.IOUtils.IA
            int r13 = r5 + 1
            char r14 = r0.charAt(r5)
            r14 = r12[r14]
            int r14 = r14 << 18
            int r15 = r5 + 2
            char r13 = r0.charAt(r13)
            r13 = r12[r13]
            int r13 = r13 << 12
            r13 = r13 | r14
            int r14 = r5 + 3
            char r15 = r0.charAt(r15)
            r15 = r12[r15]
            int r15 = r15 << 6
            r13 = r13 | r15
            int r15 = r5 + 4
            char r14 = r0.charAt(r14)
            r12 = r12[r14]
            r12 = r12 | r13
            int r13 = r10 + 1
            int r14 = r12 >> 16
            byte r14 = (byte) r14
            r8[r10] = r14
            int r14 = r10 + 2
            int r2 = r12 >> 8
            byte r2 = (byte) r2
            r8[r13] = r2
            int r10 = r10 + 3
            byte r2 = (byte) r12
            r8[r14] = r2
            if (r1 <= 0) goto Lb3
            int r11 = r11 + 1
            r2 = 19
            if (r11 != r2) goto Lb3
            int r5 = r5 + 6
            r11 = 0
            goto Lb4
        Lb3:
            r5 = r15
        Lb4:
            r2 = 0
            goto L67
        Lb6:
            if (r10 >= r7) goto Le2
            r2 = 0
            r16 = 0
        Lbb:
            int r1 = r3 - r6
            if (r5 > r1) goto Ld3
            int[] r1 = com.alibaba.fastjson.util.IOUtils.IA
            int r9 = r5 + 1
            char r5 = r0.charAt(r5)
            r1 = r1[r5]
            int r5 = r16 * 6
            int r5 = 18 - r5
            int r1 = r1 << r5
            r2 = r2 | r1
            int r16 = r16 + 1
            r5 = r9
            goto Lbb
        Ld3:
            r0 = 16
        Ld5:
            if (r10 >= r7) goto Le2
            int r1 = r10 + 1
            int r3 = r2 >> r0
            byte r3 = (byte) r3
            r8[r10] = r3
            int r0 = r0 + (-8)
            r10 = r1
            goto Ld5
        Le2:
            return r8
    }

    public static byte[] decodeBase64(char[] r16, int r17, int r18) {
            r0 = r18
            r1 = 0
            if (r0 != 0) goto L8
            byte[] r0 = new byte[r1]
            return r0
        L8:
            int r2 = r17 + r0
            r3 = 1
            int r2 = r2 - r3
            r4 = r17
        Le:
            if (r4 >= r2) goto L1b
            int[] r5 = com.alibaba.fastjson.util.IOUtils.IA
            char r6 = r16[r4]
            r5 = r5[r6]
            if (r5 >= 0) goto L1b
            int r4 = r4 + 1
            goto Le
        L1b:
            if (r2 <= 0) goto L28
            int[] r5 = com.alibaba.fastjson.util.IOUtils.IA
            char r6 = r16[r2]
            r5 = r5[r6]
            if (r5 >= 0) goto L28
            int r2 = r2 + (-1)
            goto L1b
        L28:
            char r5 = r16[r2]
            r6 = 61
            if (r5 != r6) goto L38
            int r5 = r2 + (-1)
            char r5 = r16[r5]
            if (r5 != r6) goto L36
            r5 = 2
            goto L39
        L36:
            r5 = 1
            goto L39
        L38:
            r5 = 0
        L39:
            int r6 = r2 - r4
            int r6 = r6 + r3
            r7 = 76
            if (r0 <= r7) goto L4c
            char r0 = r16[r7]
            r7 = 13
            if (r0 != r7) goto L49
            int r0 = r6 / 78
            goto L4a
        L49:
            r0 = 0
        L4a:
            int r0 = r0 << r3
            goto L4d
        L4c:
            r0 = 0
        L4d:
            int r6 = r6 - r0
            int r6 = r6 * 6
            int r6 = r6 >> 3
            int r6 = r6 - r5
            byte[] r7 = new byte[r6]
            int r8 = r6 / 3
            int r8 = r8 * 3
            r9 = 0
        L5a:
            r10 = 0
        L5b:
            if (r9 >= r8) goto La0
            int[] r11 = com.alibaba.fastjson.util.IOUtils.IA
            int r12 = r4 + 1
            char r13 = r16[r4]
            r13 = r11[r13]
            int r13 = r13 << 18
            int r14 = r4 + 2
            char r12 = r16[r12]
            r12 = r11[r12]
            int r12 = r12 << 12
            r12 = r12 | r13
            int r13 = r4 + 3
            char r14 = r16[r14]
            r14 = r11[r14]
            int r14 = r14 << 6
            r12 = r12 | r14
            int r14 = r4 + 4
            char r13 = r16[r13]
            r11 = r11[r13]
            r11 = r11 | r12
            int r12 = r9 + 1
            int r13 = r11 >> 16
            byte r13 = (byte) r13
            r7[r9] = r13
            int r13 = r9 + 2
            int r15 = r11 >> 8
            byte r15 = (byte) r15
            r7[r12] = r15
            int r9 = r9 + 3
            byte r11 = (byte) r11
            r7[r13] = r11
            if (r0 <= 0) goto L9e
            int r10 = r10 + 1
            r11 = 19
            if (r10 != r11) goto L9e
            int r4 = r4 + 6
            goto L5a
        L9e:
            r4 = r14
            goto L5b
        La0:
            if (r9 >= r6) goto Lc7
            r0 = 0
        La3:
            int r8 = r2 - r5
            if (r4 > r8) goto Lb8
            int[] r8 = com.alibaba.fastjson.util.IOUtils.IA
            int r10 = r4 + 1
            char r4 = r16[r4]
            r4 = r8[r4]
            int r8 = r0 * 6
            int r8 = 18 - r8
            int r4 = r4 << r8
            r1 = r1 | r4
            int r0 = r0 + r3
            r4 = r10
            goto La3
        Lb8:
            r0 = 16
        Lba:
            if (r9 >= r6) goto Lc7
            int r2 = r9 + 1
            int r3 = r1 >> r0
            byte r3 = (byte) r3
            r7[r9] = r3
            int r0 = r0 + (-8)
            r9 = r2
            goto Lba
        Lc7:
            return r7
    }

    public static int decodeUTF8(byte[] r8, int r9, int r10, char[] r11) {
            int r0 = r9 + r10
            int r1 = r11.length
            int r10 = java.lang.Math.min(r10, r1)
            r1 = 0
        L8:
            if (r1 >= r10) goto L17
            r2 = r8[r9]
            if (r2 < 0) goto L17
            int r3 = r1 + 1
            int r9 = r9 + 1
            char r2 = (char) r2
            r11[r1] = r2
            r1 = r3
            goto L8
        L17:
            if (r9 >= r0) goto Ld4
            int r10 = r9 + 1
            r2 = r8[r9]
            if (r2 < 0) goto L27
            int r9 = r1 + 1
            char r2 = (char) r2
            r11[r1] = r2
            r1 = r9
            r9 = r10
            goto L17
        L27:
            int r3 = r2 >> 5
            r4 = -2
            r5 = 128(0x80, float:1.8E-43)
            r6 = -1
            if (r3 != r4) goto L4b
            r3 = r2 & 30
            if (r3 == 0) goto L4b
            if (r10 >= r0) goto L4a
            int r9 = r9 + 2
            r10 = r8[r10]
            r3 = r10 & 192(0xc0, float:2.69E-43)
            if (r3 == r5) goto L3e
            return r6
        L3e:
            int r3 = r1 + 1
            int r2 = r2 << 6
            r10 = r10 ^ r2
            r10 = r10 ^ 3968(0xf80, float:5.56E-42)
            char r10 = (char) r10
            r11[r1] = r10
            r1 = r3
            goto L17
        L4a:
            return r6
        L4b:
            int r3 = r2 >> 4
            if (r3 != r4) goto L87
            int r3 = r9 + 2
            if (r3 >= r0) goto L86
            r10 = r8[r10]
            int r9 = r9 + 3
            r3 = r8[r3]
            r4 = -32
            if (r2 != r4) goto L61
            r4 = r10 & 224(0xe0, float:3.14E-43)
            if (r4 == r5) goto L86
        L61:
            r4 = r10 & 192(0xc0, float:2.69E-43)
            if (r4 != r5) goto L86
            r4 = r3 & 192(0xc0, float:2.69E-43)
            if (r4 == r5) goto L6a
            goto L86
        L6a:
            int r2 = r2 << 12
            int r10 = r10 << 6
            r10 = r10 ^ r2
            r2 = -123008(0xfffffffffffe1f80, float:NaN)
            r2 = r2 ^ r3
            r10 = r10 ^ r2
            char r10 = (char) r10
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r10 < r2) goto L80
            r2 = 57344(0xe000, float:8.0356E-41)
            if (r10 >= r2) goto L80
            return r6
        L80:
            int r2 = r1 + 1
            r11[r1] = r10
            r1 = r2
            goto L17
        L86:
            return r6
        L87:
            int r3 = r2 >> 3
            if (r3 != r4) goto Ld3
            int r3 = r9 + 3
            if (r3 >= r0) goto Ld3
            int r3 = r9 + 2
            r10 = r8[r10]
            int r4 = r9 + 3
            r3 = r8[r3]
            int r9 = r9 + 4
            r4 = r8[r4]
            int r2 = r2 << 18
            int r7 = r10 << 12
            r2 = r2 ^ r7
            int r7 = r3 << 6
            r2 = r2 ^ r7
            r7 = 3678080(0x381f80, float:5.154088E-39)
            r7 = r7 ^ r4
            r2 = r2 ^ r7
            r10 = r10 & 192(0xc0, float:2.69E-43)
            if (r10 != r5) goto Ld3
            r10 = r3 & 192(0xc0, float:2.69E-43)
            if (r10 != r5) goto Ld3
            r10 = r4 & 192(0xc0, float:2.69E-43)
            if (r10 != r5) goto Ld3
            boolean r10 = java.lang.Character.isSupplementaryCodePoint(r2)
            if (r10 != 0) goto Lbb
            goto Ld3
        Lbb:
            int r10 = r1 + 1
            int r3 = r2 >>> 10
            r4 = 55232(0xd7c0, float:7.7397E-41)
            int r3 = r3 + r4
            char r3 = (char) r3
            r11[r1] = r3
            int r1 = r1 + 2
            r2 = r2 & 1023(0x3ff, float:1.434E-42)
            r3 = 56320(0xdc00, float:7.8921E-41)
            int r2 = r2 + r3
            char r2 = (char) r2
            r11[r10] = r2
            goto L17
        Ld3:
            return r6
        Ld4:
            return r1
    }

    public static int encodeUTF8(char[] r9, int r10, int r11, byte[] r12) {
            int r0 = r10 + r11
            int r1 = r12.length
            int r11 = java.lang.Math.min(r11, r1)
            r1 = 0
        L8:
            r2 = 128(0x80, float:1.8E-43)
            if (r1 >= r11) goto L19
            char r3 = r9[r10]
            if (r3 >= r2) goto L19
            int r2 = r1 + 1
            int r10 = r10 + 1
            byte r3 = (byte) r3
            r12[r1] = r3
            r1 = r2
            goto L8
        L19:
            if (r10 >= r0) goto Ld1
            int r11 = r10 + 1
            char r3 = r9[r10]
            if (r3 >= r2) goto L29
            int r10 = r1 + 1
            byte r3 = (byte) r3
            r12[r1] = r3
        L26:
            r1 = r10
        L27:
            r10 = r11
            goto L19
        L29:
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto L3f
            int r10 = r1 + 1
            int r4 = r3 >> 6
            r4 = r4 | 192(0xc0, float:2.69E-43)
            byte r4 = (byte) r4
            r12[r1] = r4
            int r1 = r1 + 2
            r3 = r3 & 63
            r3 = r3 | r2
            byte r3 = (byte) r3
            r12[r10] = r3
            goto L27
        L3f:
            r4 = 55296(0xd800, float:7.7486E-41)
            r5 = 63
            if (r3 < r4) goto Lb5
            r4 = 57344(0xe000, float:8.0356E-41)
            if (r3 >= r4) goto Lb5
            boolean r4 = java.lang.Character.isHighSurrogate(r3)
            java.lang.String r6 = "encodeUTF8 error"
            r7 = 1
            if (r4 == 0) goto L75
            int r4 = r0 - r10
            r8 = 2
            if (r4 >= r8) goto L5b
            r3 = -1
            goto L7b
        L5b:
            int r4 = r10 + 1
            char r4 = r9[r4]
            boolean r8 = java.lang.Character.isLowSurrogate(r4)
            if (r8 == 0) goto L6a
            int r3 = java.lang.Character.toCodePoint(r3, r4)
            goto L7b
        L6a:
            com.alibaba.fastjson.JSONException r9 = new com.alibaba.fastjson.JSONException
            java.nio.charset.MalformedInputException r10 = new java.nio.charset.MalformedInputException
            r10.<init>(r7)
            r9.<init>(r6, r10)
            throw r9
        L75:
            boolean r4 = java.lang.Character.isLowSurrogate(r3)
            if (r4 != 0) goto Laa
        L7b:
            if (r3 >= 0) goto L82
            int r10 = r1 + 1
            r12[r1] = r5
            goto L26
        L82:
            int r11 = r1 + 1
            int r4 = r3 >> 18
            r4 = r4 | 240(0xf0, float:3.36E-43)
            byte r4 = (byte) r4
            r12[r1] = r4
            int r4 = r1 + 2
            int r6 = r3 >> 12
            r6 = r6 & r5
            r6 = r6 | r2
            byte r6 = (byte) r6
            r12[r11] = r6
            int r11 = r1 + 3
            int r6 = r3 >> 6
            r5 = r5 & r6
            r5 = r5 | r2
            byte r5 = (byte) r5
            r12[r4] = r5
            int r1 = r1 + 4
            r3 = r3 & 63
            r3 = r3 | r2
            byte r3 = (byte) r3
            r12[r11] = r3
            int r11 = r10 + 2
            r10 = r1
            goto L26
        Laa:
            com.alibaba.fastjson.JSONException r9 = new com.alibaba.fastjson.JSONException
            java.nio.charset.MalformedInputException r10 = new java.nio.charset.MalformedInputException
            r10.<init>(r7)
            r9.<init>(r6, r10)
            throw r9
        Lb5:
            int r10 = r1 + 1
            int r4 = r3 >> 12
            r4 = r4 | 224(0xe0, float:3.14E-43)
            byte r4 = (byte) r4
            r12[r1] = r4
            int r4 = r1 + 2
            int r6 = r3 >> 6
            r5 = r5 & r6
            r5 = r5 | r2
            byte r5 = (byte) r5
            r12[r10] = r5
            int r1 = r1 + 3
            r10 = r3 & 63
            r10 = r10 | r2
            byte r10 = (byte) r10
            r12[r4] = r10
            goto L27
        Ld1:
            return r1
    }

    public static boolean firstIdentifier(char r2) {
            boolean[] r0 = com.alibaba.fastjson.util.IOUtils.firstIdentifierFlags
            int r1 = r0.length
            if (r2 >= r1) goto Lb
            boolean r2 = r0[r2]
            if (r2 == 0) goto Lb
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static void getChars(byte r4, int r5, char[] r6) {
            if (r4 >= 0) goto L6
            int r4 = -r4
            r0 = 45
            goto L7
        L6:
            r0 = 0
        L7:
            r1 = 52429(0xcccd, float:7.3469E-41)
            int r1 = r1 * r4
            int r1 = r1 >>> 19
            int r2 = r1 << 3
            int r3 = r1 << 1
            int r2 = r2 + r3
            int r4 = r4 - r2
            int r2 = r5 + (-1)
            char[] r3 = com.alibaba.fastjson.util.IOUtils.digits
            char r4 = r3[r4]
            r6[r2] = r4
            if (r1 != 0) goto L25
            if (r0 == 0) goto L24
            int r5 = r5 + (-2)
            r6[r5] = r0
        L24:
            return
        L25:
            r4 = r1
            r5 = r2
            goto L7
    }

    public static void getChars(int r4, int r5, char[] r6) {
            if (r4 >= 0) goto L6
            int r4 = -r4
            r0 = 45
            goto L7
        L6:
            r0 = 0
        L7:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r4 < r1) goto L28
            int r1 = r4 / 100
            int r2 = r1 << 6
            int r3 = r1 << 5
            int r2 = r2 + r3
            int r3 = r1 << 2
            int r2 = r2 + r3
            int r4 = r4 - r2
            int r2 = r5 + (-1)
            char[] r3 = com.alibaba.fastjson.util.IOUtils.DigitOnes
            char r3 = r3[r4]
            r6[r2] = r3
            int r5 = r5 + (-2)
            char[] r2 = com.alibaba.fastjson.util.IOUtils.DigitTens
            char r4 = r2[r4]
            r6[r5] = r4
            r4 = r1
            goto L7
        L28:
            r1 = 52429(0xcccd, float:7.3469E-41)
            int r1 = r1 * r4
            int r1 = r1 >>> 19
            int r2 = r1 << 3
            int r3 = r1 << 1
            int r2 = r2 + r3
            int r4 = r4 - r2
            int r2 = r5 + (-1)
            char[] r3 = com.alibaba.fastjson.util.IOUtils.digits
            char r4 = r3[r4]
            r6[r2] = r4
            if (r1 != 0) goto L46
            if (r0 == 0) goto L45
            int r5 = r5 + (-2)
            r6[r5] = r0
        L45:
            return
        L46:
            r4 = r1
            r5 = r2
            goto L28
    }

    public static void getChars(long r7, int r9, char[] r10) {
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto La
            long r7 = -r7
            r0 = 45
            goto Lb
        La:
            r0 = 0
        Lb:
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 <= 0) goto L35
            r1 = 100
            long r1 = r7 / r1
            r3 = 6
            long r3 = r1 << r3
            r5 = 5
            long r5 = r1 << r5
            long r3 = r3 + r5
            r5 = 2
            long r5 = r1 << r5
            long r3 = r3 + r5
            long r7 = r7 - r3
            int r8 = (int) r7
            int r7 = r9 + (-1)
            char[] r3 = com.alibaba.fastjson.util.IOUtils.DigitOnes
            char r3 = r3[r8]
            r10[r7] = r3
            int r9 = r9 + (-2)
            char[] r7 = com.alibaba.fastjson.util.IOUtils.DigitTens
            char r7 = r7[r8]
            r10[r9] = r7
            r7 = r1
            goto Lb
        L35:
            int r8 = (int) r7
        L36:
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r8 < r7) goto L57
            int r7 = r8 / 100
            int r1 = r7 << 6
            int r2 = r7 << 5
            int r1 = r1 + r2
            int r2 = r7 << 2
            int r1 = r1 + r2
            int r8 = r8 - r1
            int r1 = r9 + (-1)
            char[] r2 = com.alibaba.fastjson.util.IOUtils.DigitOnes
            char r2 = r2[r8]
            r10[r1] = r2
            int r9 = r9 + (-2)
            char[] r1 = com.alibaba.fastjson.util.IOUtils.DigitTens
            char r8 = r1[r8]
            r10[r9] = r8
            r8 = r7
            goto L36
        L57:
            r7 = 52429(0xcccd, float:7.3469E-41)
            int r7 = r7 * r8
            int r7 = r7 >>> 19
            int r1 = r7 << 3
            int r2 = r7 << 1
            int r1 = r1 + r2
            int r8 = r8 - r1
            int r1 = r9 + (-1)
            char[] r2 = com.alibaba.fastjson.util.IOUtils.digits
            char r8 = r2[r8]
            r10[r1] = r8
            if (r7 != 0) goto L75
            if (r0 == 0) goto L74
            int r9 = r9 + (-2)
            r10[r9] = r0
        L74:
            return
        L75:
            r8 = r7
            r9 = r1
            goto L57
    }

    public static java.lang.String getStringProperty(java.lang.String r1) {
            java.lang.String r0 = java.lang.System.getProperty(r1)     // Catch: java.lang.SecurityException -> L5
            goto L6
        L5:
            r0 = 0
        L6:
            if (r0 != 0) goto Le
            java.util.Properties r0 = com.alibaba.fastjson.util.IOUtils.DEFAULT_PROPERTIES
            java.lang.String r0 = r0.getProperty(r1)
        Le:
            return r0
    }

    public static boolean isIdent(char r2) {
            boolean[] r0 = com.alibaba.fastjson.util.IOUtils.identifierFlags
            int r1 = r0.length
            if (r2 >= r1) goto Lb
            boolean r2 = r0[r2]
            if (r2 == 0) goto Lb
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static void loadPropertiesFromFile() {
            com.alibaba.fastjson.util.IOUtils$1 r0 = new com.alibaba.fastjson.util.IOUtils$1
            r0.<init>()
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.io.InputStream r0 = (java.io.InputStream) r0
            if (r0 == 0) goto L15
            java.util.Properties r1 = com.alibaba.fastjson.util.IOUtils.DEFAULT_PROPERTIES     // Catch: java.io.IOException -> L15
            r1.load(r0)     // Catch: java.io.IOException -> L15
            r0.close()     // Catch: java.io.IOException -> L15
        L15:
            return
    }

    public static java.lang.String readAll(java.io.Reader r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 2048(0x800, float:2.87E-42)
            char[] r2 = new char[r1]     // Catch: java.lang.Exception -> L19
        L9:
            r3 = 0
            int r4 = r5.read(r2, r3, r1)     // Catch: java.lang.Exception -> L19
            if (r4 >= 0) goto L15
            java.lang.String r5 = r0.toString()
            return r5
        L15:
            r0.append(r2, r3, r4)     // Catch: java.lang.Exception -> L19
            goto L9
        L19:
            r5 = move-exception
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "read string from reader error"
            r0.<init>(r1, r5)
            throw r0
    }

    public static int stringSize(int r2) {
            r0 = 0
        L1:
            int[] r1 = com.alibaba.fastjson.util.IOUtils.sizeTable
            r1 = r1[r0]
            if (r2 > r1) goto La
            int r0 = r0 + 1
            return r0
        La:
            int r0 = r0 + 1
            goto L1
    }

    public static int stringSize(long r6) {
            r0 = 10
            r2 = 1
            r3 = r0
        L4:
            r5 = 19
            if (r2 >= r5) goto L12
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 >= 0) goto Ld
            return r2
        Ld:
            long r3 = r3 * r0
            int r2 = r2 + 1
            goto L4
        L12:
            return r5
    }
}
