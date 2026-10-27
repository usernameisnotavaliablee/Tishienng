package com.hp.hpl.sparta;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class k implements com.hp.hpl.sparta.o {
    private com.hp.hpl.sparta.l c;

    public k(java.lang.String r11, java.io.InputStream r12, com.hp.hpl.sparta.n r13, java.lang.String r14, com.hp.hpl.sparta.m r15) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r10 = this;
            java.lang.String r1 = "\" is not a supported encoding"
            java.lang.String r2 = "\""
            r10.<init>()
            if (r13 != 0) goto Lb
            com.hp.hpl.sparta.n r13 = com.hp.hpl.sparta.o.a
        Lb:
            r6 = r13
            boolean r13 = r12.markSupported()
            if (r13 == 0) goto L10b
            int r13 = com.hp.hpl.sparta.o.b
            r12.mark(r13)
            r13 = 4
            byte[] r13 = new byte[r13]
            int r0 = r12.read(r13)
            if (r14 != 0) goto L24
            java.lang.String r14 = e(r11, r13, r0, r6)
        L24:
            r7 = r14
            r13 = 1
            r12.reset()     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> Laf
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> Laf
            java.lang.String r14 = d(r7)     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> Laf
            r5.<init>(r12, r14)     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> Laf
            com.hp.hpl.sparta.l r3 = new com.hp.hpl.sparta.l     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L4b java.io.IOException -> L4f
            r4 = r11
            r8 = r15
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L46 java.io.IOException -> L49
            r14 = r7
            r10.c = r3     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L3e java.io.IOException -> L44
            goto Lee
        L3e:
            r0 = move-exception
        L3f:
            r11 = r0
            r15 = r11
            r11 = r8
            goto Lb4
        L44:
            r11 = r8
            goto L52
        L46:
            r0 = move-exception
        L47:
            r14 = r7
            goto L3f
        L49:
            r14 = r7
            goto L44
        L4b:
            r0 = move-exception
            r4 = r11
            r8 = r15
            goto L47
        L4f:
            r4 = r11
            r14 = r7
            r11 = r15
        L52:
            java.lang.String r8 = "euc-jp"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87
            r15.<init>()     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87
            java.lang.String r0 = "Problem reading with assumed encoding of "
            r15.append(r0)     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87
            r15.append(r14)     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87
            java.lang.String r0 = " so restarting with "
            r15.append(r0)     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87
            r15.append(r8)     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87
            java.lang.String r15 = r15.toString()     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87
            r6.a(r15, r4, r13)     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87
            r12.reset()     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87 java.io.UnsupportedEncodingException -> L8d
            java.lang.String r15 = d(r8)     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87 java.io.UnsupportedEncodingException -> L8d
            r5.<init>(r12, r15)     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87 java.io.UnsupportedEncodingException -> L8d
            com.hp.hpl.sparta.l r3 = new com.hp.hpl.sparta.l     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87
            r7 = 0
            r8 = r11
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L8a
            r10.c = r3     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87
            goto Lee
        L87:
            r0 = move-exception
        L88:
            r15 = r0
            goto Lb4
        L8a:
            r0 = move-exception
            r11 = r8
            goto L88
        L8d:
            com.hp.hpl.sparta.ParseException r3 = new com.hp.hpl.sparta.ParseException     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87
            r15.<init>()     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87
            r15.append(r2)     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87
            r15.append(r8)     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87
            r15.append(r1)     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87
            java.lang.String r9 = r15.toString()     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87
            r5 = r4
            r4 = r6
            r6 = 1
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> Lab
            r6 = r4
            r4 = r5
            throw r3     // Catch: com.hp.hpl.sparta.EncodingMismatchException -> L87
        Lab:
            r0 = move-exception
            r6 = r4
            r4 = r5
            goto L88
        Laf:
            r0 = move-exception
            r4 = r11
            r11 = r15
            r14 = r7
            goto L88
        Lb4:
            java.lang.String r8 = r15.getDeclaredEncoding()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Encoding declaration of "
            r15.append(r0)
            r15.append(r8)
            java.lang.String r0 = " is different that assumed "
            r15.append(r0)
            r15.append(r14)
            java.lang.String r14 = " so restarting the parsing with the new encoding"
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            r6.a(r14, r4, r13)
            r12.reset()
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.io.UnsupportedEncodingException -> Lef
            java.lang.String r13 = d(r8)     // Catch: java.io.UnsupportedEncodingException -> Lef
            r5.<init>(r12, r13)     // Catch: java.io.UnsupportedEncodingException -> Lef
            com.hp.hpl.sparta.l r3 = new com.hp.hpl.sparta.l
            r7 = 0
            r8 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r10.c = r3
        Lee:
            return
        Lef:
            com.hp.hpl.sparta.ParseException r3 = new com.hp.hpl.sparta.ParseException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            r11.append(r8)
            r11.append(r1)
            java.lang.String r9 = r11.toString()
            r5 = r4
            r4 = r6
            r6 = 1
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L10b:
            java.lang.Error r11 = new java.lang.Error
            java.lang.String r12 = "Precondition violation: the InputStream passed to ParseByteStream must support mark"
            r11.<init>(r12)
            throw r11
    }

    private static boolean a(byte[] r4, int r5) {
            r0 = 0
            r1 = r4[r0]
            int r2 = r5 >>> 24
            byte r2 = (byte) r2
            if (r1 != r2) goto L25
            r1 = 1
            r2 = r4[r1]
            int r3 = r5 >>> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            if (r2 != r3) goto L25
            r2 = 2
            r2 = r4[r2]
            int r3 = r5 >>> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            if (r2 != r3) goto L25
            r2 = 3
            r4 = r4[r2]
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            if (r4 != r5) goto L25
            return r1
        L25:
            return r0
    }

    private static boolean c(byte[] r3, short r4) {
            r0 = 0
            r1 = r3[r0]
            int r2 = r4 >>> 8
            byte r2 = (byte) r2
            if (r1 != r2) goto L11
            r1 = 1
            r3 = r3[r1]
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            if (r3 != r4) goto L11
            return r1
        L11:
            return r0
    }

    private static java.lang.String d(java.lang.String r2) {
            java.lang.String r0 = r2.toLowerCase()
            java.lang.String r1 = "utf8"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le
            java.lang.String r2 = "UTF-8"
        Le:
            return r2
    }

    private static java.lang.String e(java.lang.String r5, byte[] r6, int r7, com.hp.hpl.sparta.n r8) throws java.io.IOException {
            r0 = 4
            r1 = 0
            r2 = 1
            java.lang.String r3 = "UTF-8"
            if (r7 == r0) goto L2d
            if (r7 > 0) goto Lc
            java.lang.String r7 = "no characters in input"
            goto L27
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "less than 4 characters in input: \""
            r0.append(r4)
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6, r1, r7)
            r0.append(r4)
            java.lang.String r7 = "\""
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L27:
            r8.c(r7, r5, r2)
        L2a:
            r7 = r3
            goto Lb2
        L2d:
            r7 = 65279(0xfeff, float:9.1475E-41)
            boolean r7 = a(r6, r7)
            if (r7 != 0) goto Lb0
            r7 = -131072(0xfffffffffffe0000, float:NaN)
            boolean r7 = a(r6, r7)
            if (r7 != 0) goto Lb0
            r7 = 65534(0xfffe, float:9.1833E-41)
            boolean r7 = a(r6, r7)
            if (r7 != 0) goto Lb0
            r7 = -16842752(0xfffffffffeff0000, float:-1.6947657E38)
            boolean r7 = a(r6, r7)
            if (r7 != 0) goto Lb0
            r7 = 60
            boolean r7 = a(r6, r7)
            if (r7 != 0) goto Lb0
            r7 = 1006632960(0x3c000000, float:0.0078125)
            boolean r7 = a(r6, r7)
            if (r7 != 0) goto Lb0
            r7 = 15360(0x3c00, float:2.1524E-41)
            boolean r7 = a(r6, r7)
            if (r7 != 0) goto Lb0
            r7 = 3932160(0x3c0000, float:5.51013E-39)
            boolean r7 = a(r6, r7)
            if (r7 == 0) goto L70
            goto Lb0
        L70:
            r7 = 3932223(0x3c003f, float:5.510218E-39)
            boolean r7 = a(r6, r7)
            if (r7 == 0) goto L7c
            java.lang.String r7 = "UTF-16BE"
            goto Lb2
        L7c:
            r7 = 1006649088(0x3c003f00, float:0.00782752)
            boolean r7 = a(r6, r7)
            if (r7 == 0) goto L88
            java.lang.String r7 = "UTF-16LE"
            goto Lb2
        L88:
            r7 = 1010792557(0x3c3f786d, float:0.011686427)
            boolean r7 = a(r6, r7)
            if (r7 == 0) goto L92
            goto L2a
        L92:
            r7 = 1282385812(0x4c6fa794, float:6.2824016E7)
            boolean r7 = a(r6, r7)
            if (r7 == 0) goto L9e
            java.lang.String r7 = "EBCDIC"
            goto Lb2
        L9e:
            r7 = -2
            boolean r7 = c(r6, r7)
            if (r7 != 0) goto Lad
            r7 = -257(0xfffffffffffffeff, float:NaN)
            boolean r7 = c(r6, r7)
            if (r7 == 0) goto L2a
        Lad:
            java.lang.String r7 = "UTF-16"
            goto Lb2
        Lb0:
            java.lang.String r7 = "UCS-4"
        Lb2:
            boolean r0 = r7.equals(r3)
            if (r0 != 0) goto L102
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "From start "
            r0.append(r3)
            r1 = r6[r1]
            java.lang.String r1 = f(r1)
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            r3 = r6[r2]
            java.lang.String r3 = f(r3)
            r0.append(r3)
            r0.append(r1)
            r3 = 2
            r3 = r6[r3]
            java.lang.String r3 = f(r3)
            r0.append(r3)
            r0.append(r1)
            r1 = 3
            r6 = r6[r1]
            java.lang.String r6 = f(r6)
            r0.append(r6)
            java.lang.String r6 = " deduced encoding = "
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = r0.toString()
            r8.a(r6, r5, r2)
        L102:
            return r7
    }

    private static java.lang.String f(byte r2) {
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            int r0 = r2.length()
            r1 = 1
            if (r0 == r1) goto L18
            r1 = 2
            if (r0 == r1) goto L17
            int r0 = r2.length()
            int r0 = r0 - r1
            java.lang.String r2 = r2.substring(r0)
        L17:
            return r2
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "0"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // com.hp.hpl.sparta.o
    public int getLineNumber() {
            r1 = this;
            com.hp.hpl.sparta.l r0 = r1.c
            int r0 = r0.getLineNumber()
            return r0
    }

    @Override // com.hp.hpl.sparta.o
    public java.lang.String getSystemId() {
            r1 = this;
            com.hp.hpl.sparta.l r0 = r1.c
            java.lang.String r0 = r0.getSystemId()
            return r0
    }

    @Override // com.hp.hpl.sparta.o
    public java.lang.String toString() {
            r1 = this;
            com.hp.hpl.sparta.l r0 = r1.c
            java.lang.String r0 = r0.toString()
            return r0
    }
}
