package com.sun.mail.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class BASE64DecoderStream extends java.io.FilterInputStream {
    private static final char[] pem_array = null;
    private static final byte[] pem_convert_array = null;
    private byte[] buffer;
    private int bufsize;
    private boolean ignoreErrors;
    private int index;
    private byte[] input_buffer;
    private int input_len;
    private int input_pos;

    static {
            r0 = 64
            char[] r0 = new char[r0]
            r0 = {x002e: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
            com.sun.mail.util.BASE64DecoderStream.pem_array = r0
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]
            com.sun.mail.util.BASE64DecoderStream.pem_convert_array = r0
            r0 = 0
            r1 = 0
        L11:
            r2 = 255(0xff, float:3.57E-43)
            if (r1 < r2) goto L25
        L15:
            char[] r1 = com.sun.mail.util.BASE64DecoderStream.pem_array
            int r2 = r1.length
            if (r0 < r2) goto L1b
            return
        L1b:
            byte[] r2 = com.sun.mail.util.BASE64DecoderStream.pem_convert_array
            char r1 = r1[r0]
            byte r3 = (byte) r0
            r2[r1] = r3
            int r0 = r0 + 1
            goto L15
        L25:
            byte[] r2 = com.sun.mail.util.BASE64DecoderStream.pem_convert_array
            r3 = -1
            r2[r1] = r3
            int r1 = r1 + 1
            goto L11
    }

    public BASE64DecoderStream(java.io.InputStream r3) {
            r2 = this;
            r2.<init>(r3)
            r3 = 3
            byte[] r3 = new byte[r3]
            r2.buffer = r3
            r3 = 0
            r2.bufsize = r3
            r2.index = r3
            r0 = 8190(0x1ffe, float:1.1477E-41)
            byte[] r0 = new byte[r0]
            r2.input_buffer = r0
            r2.input_pos = r3
            r2.input_len = r3
            r2.ignoreErrors = r3
            java.lang.String r0 = "mail.mime.base64.ignoreerrors"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L2c
            if (r0 == 0) goto L2a
            java.lang.String r1 = "false"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.SecurityException -> L2c
            if (r0 != 0) goto L2a
            r3 = 1
        L2a:
            r2.ignoreErrors = r3     // Catch: java.lang.SecurityException -> L2c
        L2c:
            return
    }

    public BASE64DecoderStream(java.io.InputStream r2, boolean r3) {
            r1 = this;
            r1.<init>(r2)
            r2 = 3
            byte[] r2 = new byte[r2]
            r1.buffer = r2
            r2 = 0
            r1.bufsize = r2
            r1.index = r2
            r0 = 8190(0x1ffe, float:1.1477E-41)
            byte[] r0 = new byte[r0]
            r1.input_buffer = r0
            r1.input_pos = r2
            r1.input_len = r2
            r1.ignoreErrors = r3
            return
    }

    private int decode(byte[] r10, int r11, int r12) throws java.io.IOException {
            r9 = this;
            r0 = r11
        L1:
            r1 = 3
            if (r12 >= r1) goto L6
            int r0 = r0 - r11
            return r0
        L6:
            r1 = 0
            r2 = 0
            r3 = 0
        L9:
            r4 = 4
            if (r2 < r4) goto L28
            int r1 = r0 + 2
            r2 = r3 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r10[r1] = r2
            int r1 = r3 >> 8
            int r2 = r0 + 1
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r10[r2] = r1
            int r1 = r3 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r10[r0] = r1
            int r12 = r12 + (-3)
            int r0 = r0 + 3
            goto L1
        L28:
            int r5 = r9.getByte()
            r6 = -2
            r7 = -1
            if (r5 == r7) goto L39
            if (r5 != r6) goto L33
            goto L39
        L33:
            int r3 = r3 << 6
            int r2 = r2 + 1
            r3 = r3 | r5
            goto L9
        L39:
            r12 = 2
            r8 = 1
            if (r5 != r7) goto L67
            if (r2 != 0) goto L41
            int r0 = r0 - r11
            return r0
        L41:
            boolean r1 = r9.ignoreErrors
            if (r1 == 0) goto L47
            r1 = 1
            goto L92
        L47:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Error in encoded stream: needed 4 valid base64 characters but only got "
            r11.<init>(r12)
            r11.append(r2)
            java.lang.String r12 = " before EOF"
            r11.append(r12)
            java.lang.String r12 = r9.recentChars()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L67:
            if (r2 >= r12) goto L8e
            boolean r5 = r9.ignoreErrors
            if (r5 == 0) goto L6e
            goto L8e
        L6e:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Error in encoded stream: needed at least 2 valid base64 characters, but only got "
            r11.<init>(r12)
            r11.append(r2)
            java.lang.String r12 = " before padding character (=)"
            r11.append(r12)
            java.lang.String r12 = r9.recentChars()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L8e:
            if (r2 != 0) goto L92
            int r0 = r0 - r11
            return r0
        L92:
            int r5 = r2 + (-1)
            if (r5 != 0) goto L97
            r5 = 1
        L97:
            int r2 = r2 + r8
            int r3 = r3 << 6
        L9a:
            if (r2 < r4) goto Lb1
            int r1 = r3 >> 8
            if (r5 != r12) goto La7
            int r12 = r0 + 1
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r10[r12] = r1
        La7:
            int r12 = r3 >> 16
            r12 = r12 & 255(0xff, float:3.57E-43)
            byte r12 = (byte) r12
            r10[r0] = r12
            int r0 = r0 + r5
            int r0 = r0 - r11
            return r0
        Lb1:
            if (r1 != 0) goto Lf5
            int r8 = r9.getByte()
            if (r8 != r7) goto Ld6
            boolean r8 = r9.ignoreErrors
            if (r8 == 0) goto Lbe
            goto Lf5
        Lbe:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Error in encoded stream: hit EOF while looking for padding characters (=)"
            r11.<init>(r12)
            java.lang.String r12 = r9.recentChars()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Ld6:
            if (r8 == r6) goto Lf5
            boolean r8 = r9.ignoreErrors
            if (r8 == 0) goto Ldd
            goto Lf5
        Ldd:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Error in encoded stream: found valid base64 character after a padding character (=)"
            r11.<init>(r12)
            java.lang.String r12 = r9.recentChars()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Lf5:
            int r3 = r3 << 6
            int r2 = r2 + 1
            goto L9a
    }

    public static byte[] decode(byte[] r12) {
            int r0 = r12.length
            int r0 = r0 / 4
            r1 = 3
            int r0 = r0 * 3
            if (r0 != 0) goto L9
            return r12
        L9:
            int r2 = r12.length
            r3 = 1
            int r2 = r2 - r3
            r2 = r12[r2]
            r4 = 61
            r5 = 2
            if (r2 != r4) goto L1f
            int r2 = r0 + (-1)
            int r6 = r12.length
            int r6 = r6 - r5
            r6 = r12[r6]
            if (r6 != r4) goto L1e
            int r0 = r0 + (-2)
            goto L1f
        L1e:
            r0 = r2
        L1f:
            byte[] r0 = new byte[r0]
            int r2 = r12.length
            r6 = 0
            r7 = 0
        L24:
            if (r2 > 0) goto L27
            return r0
        L27:
            byte[] r8 = com.sun.mail.util.BASE64DecoderStream.pem_convert_array
            int r9 = r6 + 1
            r10 = r12[r6]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r8[r10]
            int r10 = r10 << 6
            int r11 = r6 + 2
            r9 = r12[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r8[r9]
            r9 = r9 | r10
            int r9 = r9 << 6
            r10 = r12[r11]
            if (r10 == r4) goto L4b
            int r11 = r6 + 3
            r6 = r10 & 255(0xff, float:3.57E-43)
            r6 = r8[r6]
            r9 = r9 | r6
            r6 = 3
            goto L4c
        L4b:
            r6 = 2
        L4c:
            int r9 = r9 << 6
            r10 = r12[r11]
            if (r10 == r4) goto L5a
            int r11 = r11 + 1
            r10 = r10 & 255(0xff, float:3.57E-43)
            r8 = r8[r10]
            r9 = r9 | r8
            goto L5c
        L5a:
            int r6 = r6 + (-1)
        L5c:
            if (r6 <= r5) goto L65
            int r8 = r7 + 2
            r10 = r9 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r0[r8] = r10
        L65:
            int r8 = r9 >> 8
            if (r6 <= r3) goto L70
            int r10 = r7 + 1
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r0[r10] = r8
        L70:
            int r8 = r9 >> 16
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r0[r7] = r8
            int r7 = r7 + r6
            int r2 = r2 + (-4)
            r6 = r11
            goto L24
    }

    private int getByte() throws java.io.IOException {
            r4 = this;
        L0:
            int r0 = r4.input_pos
            int r1 = r4.input_len
            r2 = -1
            if (r0 < r1) goto L19
            java.io.InputStream r0 = r4.in     // Catch: java.io.EOFException -> L18
            byte[] r1 = r4.input_buffer     // Catch: java.io.EOFException -> L18
            int r0 = r0.read(r1)     // Catch: java.io.EOFException -> L18
            r4.input_len = r0     // Catch: java.io.EOFException -> L18
            if (r0 > 0) goto L14
            return r2
        L14:
            r0 = 0
            r4.input_pos = r0
            goto L19
        L18:
            return r2
        L19:
            byte[] r0 = r4.input_buffer
            int r1 = r4.input_pos
            int r3 = r1 + 1
            r4.input_pos = r3
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 61
            if (r0 != r1) goto L2b
            r0 = -2
            return r0
        L2b:
            byte[] r1 = com.sun.mail.util.BASE64DecoderStream.pem_convert_array
            r0 = r1[r0]
            if (r0 == r2) goto L0
            return r0
    }

    private java.lang.String recentChars() {
            r5 = this;
            int r0 = r5.input_pos
            r1 = 10
            if (r0 <= r1) goto L8
            r0 = 10
        L8:
            java.lang.String r2 = ""
            if (r0 <= 0) goto Lba
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = ", the "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = " most recent characters were: \""
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            int r3 = r5.input_pos
            int r3 = r3 - r0
        L25:
            int r0 = r5.input_pos
            if (r3 < r0) goto L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.<init>(r1)
            java.lang.String r1 = "\""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L3c:
            byte[] r0 = r5.input_buffer
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            char r0 = (char) r0
            r4 = 9
            if (r0 == r4) goto La3
            if (r0 == r1) goto L90
            r4 = 13
            if (r0 == r4) goto L7d
            r4 = 32
            if (r0 < r4) goto L67
            r4 = 127(0x7f, float:1.78E-43)
            if (r0 >= r4) goto L67
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L65:
            r2 = r0
            goto Lb6
        L67:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4.<init>(r2)
            java.lang.String r2 = "\\"
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            goto L65
        L7d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.<init>(r2)
            java.lang.String r2 = "\\r"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L65
        L90:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.<init>(r2)
            java.lang.String r2 = "\\n"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L65
        La3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.<init>(r2)
            java.lang.String r2 = "\\t"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L65
        Lb6:
            int r3 = r3 + 1
            goto L25
        Lba:
            return r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
            r3 = this;
            java.io.InputStream r0 = r3.in
            int r0 = r0.available()
            int r0 = r0 * 3
            int r0 = r0 / 4
            int r1 = r3.bufsize
            int r2 = r3.index
            int r1 = r1 - r2
            int r0 = r0 + r1
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r3 = this;
            int r0 = r3.index
            int r1 = r3.bufsize
            if (r0 < r1) goto L16
            byte[] r0 = r3.buffer
            int r1 = r0.length
            r2 = 0
            int r0 = r3.decode(r0, r2, r1)
            r3.bufsize = r0
            if (r0 > 0) goto L14
            r0 = -1
            return r0
        L14:
            r3.index = r2
        L16:
            byte[] r0 = r3.buffer
            int r1 = r3.index
            int r2 = r1 + 1
            r3.index = r2
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r6, int r7, int r8) throws java.io.IOException {
            r5 = this;
            r0 = r7
        L1:
            int r1 = r5.index
            int r2 = r5.bufsize
            if (r1 >= r2) goto L1a
            if (r8 > 0) goto La
            goto L1a
        La:
            int r2 = r0 + 1
            byte[] r3 = r5.buffer
            int r4 = r1 + 1
            r5.index = r4
            r1 = r3[r1]
            r6[r0] = r1
            int r8 = r8 + (-1)
            r0 = r2
            goto L1
        L1a:
            if (r1 < r2) goto L21
            r1 = 0
            r5.index = r1
            r5.bufsize = r1
        L21:
            int r1 = r8 / 3
            int r1 = r1 * 3
            r2 = -1
            if (r1 <= 0) goto L35
            int r3 = r5.decode(r6, r0, r1)
            int r0 = r0 + r3
            int r8 = r8 - r3
            if (r3 == r1) goto L35
            if (r0 != r7) goto L33
            return r2
        L33:
            int r0 = r0 - r7
            return r0
        L35:
            if (r8 > 0) goto L38
            goto L3e
        L38:
            int r1 = r5.read()
            if (r1 != r2) goto L43
        L3e:
            if (r0 != r7) goto L41
            return r2
        L41:
            int r0 = r0 - r7
            return r0
        L43:
            int r3 = r0 + 1
            byte r1 = (byte) r1
            r6[r0] = r1
            int r8 = r8 + (-1)
            r0 = r3
            goto L35
    }
}
