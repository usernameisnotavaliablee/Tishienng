package javax.mail.internet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class MailDateParser {
    int index;
    char[] orig;

    public MailDateParser(char[] r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.index = r0
            r1.orig = r2
            return
    }

    int getIndex() {
            r1 = this;
            int r0 = r1.index
            return r0
    }

    public int parseAlphaTimeZone() throws java.text.ParseException {
            r9 = this;
            java.lang.String r0 = "Bad Alpha TimeZone"
            char[] r1 = r9.orig     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
            int r2 = r9.index     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
            int r3 = r2 + 1
            r9.index = r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
            char r4 = r1[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
            r5 = 116(0x74, float:1.63E-43)
            r6 = 84
            r7 = 1
            r8 = 0
            switch(r4) {
                case 67: goto L5c;
                case 69: goto L59;
                case 71: goto L38;
                case 77: goto L35;
                case 80: goto L32;
                case 85: goto L1d;
                case 99: goto L5c;
                case 101: goto L59;
                case 103: goto L38;
                case 109: goto L35;
                case 112: goto L32;
                case 117: goto L1d;
                default: goto L15;
            }     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
        L15:
            java.text.ParseException r1 = new java.text.ParseException     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
            int r2 = r9.index     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
            r1.<init>(r0, r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
            throw r1     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
        L1d:
            int r2 = r2 + 2
            r9.index = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
            char r2 = r1[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
            if (r2 == r6) goto L30
            if (r2 != r5) goto L28
            goto L30
        L28:
            java.text.ParseException r1 = new java.text.ParseException     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
            int r2 = r9.index     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
            r1.<init>(r0, r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
            throw r1     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
        L30:
            r7 = 0
            goto L5e
        L32:
            r8 = 480(0x1e0, float:6.73E-43)
            goto L5e
        L35:
            r8 = 420(0x1a4, float:5.89E-43)
            goto L5e
        L38:
            int r4 = r2 + 2
            r9.index = r4     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
            char r3 = r1[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
            r7 = 77
            if (r3 == r7) goto L46
            r7 = 109(0x6d, float:1.53E-43)
            if (r3 != r7) goto L51
        L46:
            int r2 = r2 + 3
            r9.index = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
            char r2 = r1[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
            if (r2 == r6) goto L30
            if (r2 != r5) goto L51
            goto L30
        L51:
            java.text.ParseException r1 = new java.text.ParseException     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
            int r2 = r9.index     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
            r1.<init>(r0, r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
            throw r1     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La3
        L59:
            r8 = 300(0x12c, float:4.2E-43)
            goto L5e
        L5c:
            r8 = 360(0x168, float:5.04E-43)
        L5e:
            if (r7 == 0) goto La2
            int r2 = r9.index
            int r3 = r2 + 1
            r9.index = r3
            char r4 = r1[r2]
            r7 = 83
            if (r4 == r7) goto L8f
            r7 = 115(0x73, float:1.61E-43)
            if (r4 != r7) goto L71
            goto L8f
        L71:
            r7 = 68
            if (r4 == r7) goto L79
            r7 = 100
            if (r4 != r7) goto La2
        L79:
            int r2 = r2 + 2
            r9.index = r2
            char r1 = r1[r3]
            if (r1 == r6) goto L8c
            if (r1 == r5) goto L84
            goto L8c
        L84:
            java.text.ParseException r1 = new java.text.ParseException
            int r2 = r9.index
            r1.<init>(r0, r2)
            throw r1
        L8c:
            int r8 = r8 + (-60)
            return r8
        L8f:
            int r2 = r2 + 2
            r9.index = r2
            char r1 = r1[r3]
            if (r1 == r6) goto La2
            if (r1 != r5) goto L9a
            goto La2
        L9a:
            java.text.ParseException r1 = new java.text.ParseException
            int r2 = r9.index
            r1.<init>(r0, r2)
            throw r1
        La2:
            return r8
        La3:
            java.text.ParseException r1 = new java.text.ParseException
            int r2 = r9.index
            r1.<init>(r0, r2)
            throw r1
    }

    public int parseMonth() throws java.text.ParseException {
            r17 = this;
            r0 = r17
            char[] r1 = r0.orig     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            int r2 = r0.index     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            int r3 = r2 + 1
            r0.index = r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            char r4 = r1[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            r7 = 114(0x72, float:1.6E-43)
            r8 = 82
            r9 = 112(0x70, float:1.57E-43)
            r10 = 80
            r11 = 65
            if (r4 == r11) goto L12a
            r13 = 68
            r14 = 99
            r15 = 67
            r16 = 3
            r12 = 101(0x65, float:1.42E-43)
            r5 = 69
            if (r4 == r13) goto L113
            r13 = 70
            if (r4 == r13) goto Lf9
            r13 = 74
            r6 = 97
            if (r4 == r13) goto Lc0
            r13 = 83
            if (r4 == r13) goto La9
            if (r4 == r6) goto L12c
            r13 = 100
            if (r4 == r13) goto L113
            r13 = 102(0x66, float:1.43E-43)
            if (r4 == r13) goto Lf9
            r13 = 106(0x6a, float:1.49E-43)
            if (r4 == r13) goto Lc0
            r13 = 115(0x73, float:1.61E-43)
            if (r4 == r13) goto La9
            switch(r4) {
                case 77: goto L88;
                case 78: goto L69;
                case 79: goto L4e;
                default: goto L49;
            }     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
        L49:
            switch(r4) {
                case 109: goto L88;
                case 110: goto L69;
                case 111: goto L4e;
                default: goto L4c;
            }     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
        L4c:
            goto L15a
        L4e:
            int r4 = r2 + 2
            r0.index = r4     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            char r3 = r1[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            if (r3 == r15) goto L58
            if (r3 != r14) goto L15a
        L58:
            int r2 = r2 + 3
            r0.index = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            char r1 = r1[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            r2 = 84
            if (r1 == r2) goto L66
            r2 = 116(0x74, float:1.63E-43)
            if (r1 != r2) goto L15a
        L66:
            r1 = 9
            return r1
        L69:
            int r4 = r2 + 2
            r0.index = r4     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            char r3 = r1[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            r5 = 79
            if (r3 == r5) goto L77
            r5 = 111(0x6f, float:1.56E-43)
            if (r3 != r5) goto L15a
        L77:
            int r2 = r2 + 3
            r0.index = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            char r1 = r1[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            r2 = 86
            if (r1 == r2) goto L85
            r2 = 118(0x76, float:1.65E-43)
            if (r1 != r2) goto L15a
        L85:
            r1 = 10
            return r1
        L88:
            int r4 = r2 + 2
            r0.index = r4     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            char r3 = r1[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            if (r3 == r11) goto L92
            if (r3 != r6) goto L15a
        L92:
            int r2 = r2 + 3
            r0.index = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            char r1 = r1[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            if (r1 == r8) goto La7
            if (r1 != r7) goto L9d
            goto La7
        L9d:
            r2 = 89
            if (r1 == r2) goto La5
            r2 = 121(0x79, float:1.7E-43)
            if (r1 != r2) goto L15a
        La5:
            r1 = 4
            return r1
        La7:
            r1 = 2
            return r1
        La9:
            int r4 = r2 + 2
            r0.index = r4     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            char r3 = r1[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            if (r3 == r5) goto Lb3
            if (r3 != r12) goto L15a
        Lb3:
            int r2 = r2 + 3
            r0.index = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            char r1 = r1[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            if (r1 == r10) goto Lbd
            if (r1 != r9) goto L15a
        Lbd:
            r1 = 8
            return r1
        Lc0:
            int r4 = r2 + 2
            r0.index = r4     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            char r3 = r1[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            r5 = 110(0x6e, float:1.54E-43)
            r7 = 78
            if (r3 == r11) goto Led
            r8 = 85
            if (r3 == r8) goto Ld6
            if (r3 == r6) goto Led
            r6 = 117(0x75, float:1.64E-43)
            if (r3 != r6) goto L15a
        Ld6:
            int r2 = r2 + 3
            r0.index = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            char r1 = r1[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            if (r1 == r7) goto Leb
            if (r1 != r5) goto Le1
            goto Leb
        Le1:
            r2 = 76
            if (r1 == r2) goto Le9
            r2 = 108(0x6c, float:1.51E-43)
            if (r1 != r2) goto L15a
        Le9:
            r1 = 6
            return r1
        Leb:
            r1 = 5
            return r1
        Led:
            int r2 = r2 + 3
            r0.index = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            char r1 = r1[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            if (r1 == r7) goto Lf7
            if (r1 != r5) goto L15a
        Lf7:
            r1 = 0
            return r1
        Lf9:
            int r4 = r2 + 2
            r0.index = r4     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            char r3 = r1[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            if (r3 == r5) goto L103
            if (r3 != r12) goto L15a
        L103:
            int r2 = r2 + 3
            r0.index = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            char r1 = r1[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            r2 = 66
            if (r1 == r2) goto L111
            r2 = 98
            if (r1 != r2) goto L15a
        L111:
            r1 = 1
            return r1
        L113:
            int r4 = r2 + 2
            r0.index = r4     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            char r3 = r1[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            if (r3 == r5) goto L11d
            if (r3 != r12) goto L15a
        L11d:
            int r2 = r2 + 3
            r0.index = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            char r1 = r1[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            if (r1 == r15) goto L127
            if (r1 != r14) goto L15a
        L127:
            r1 = 11
            return r1
        L12a:
            r16 = 3
        L12c:
            int r4 = r2 + 2
            r0.index = r4     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            char r3 = r1[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            if (r3 == r10) goto L14f
            if (r3 != r9) goto L137
            goto L14f
        L137:
            r5 = 85
            if (r3 == r5) goto L13f
            r6 = 117(0x75, float:1.64E-43)
            if (r3 != r6) goto L15a
        L13f:
            int r2 = r2 + 3
            r0.index = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            char r1 = r1[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            r2 = 71
            if (r1 == r2) goto L14d
            r2 = 103(0x67, float:1.44E-43)
            if (r1 != r2) goto L15a
        L14d:
            r1 = 7
            return r1
        L14f:
            int r2 = r2 + 3
            r0.index = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            char r1 = r1[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L15a
            if (r1 == r8) goto L159
            if (r1 != r7) goto L15a
        L159:
            return r16
        L15a:
            java.text.ParseException r1 = new java.text.ParseException
            java.lang.String r2 = "Bad Month"
            int r3 = r0.index
            r1.<init>(r2, r3)
            throw r1
    }

    public int parseNumber() throws java.text.ParseException {
            r7 = this;
            char[] r0 = r7.orig
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L5:
            int r3 = r7.index
            java.lang.String r4 = "No Number found"
            if (r3 < r0) goto L16
            if (r1 == 0) goto Le
            goto L20
        Le:
            java.text.ParseException r0 = new java.text.ParseException
            int r1 = r7.index
            r0.<init>(r4, r1)
            throw r0
        L16:
            char[] r5 = r7.orig
            char r5 = r5[r3]
            r6 = 1
            switch(r5) {
                case 48: goto L55;
                case 49: goto L51;
                case 50: goto L4c;
                case 51: goto L47;
                case 52: goto L42;
                case 53: goto L3d;
                case 54: goto L38;
                case 55: goto L33;
                case 56: goto L2e;
                case 57: goto L29;
                default: goto L1e;
            }
        L1e:
            if (r1 == 0) goto L21
        L20:
            return r2
        L21:
            java.text.ParseException r0 = new java.text.ParseException
            int r1 = r7.index
            r0.<init>(r4, r1)
            throw r0
        L29:
            int r2 = r2 * 10
            int r2 = r2 + 9
            goto L57
        L2e:
            int r2 = r2 * 10
            int r2 = r2 + 8
            goto L57
        L33:
            int r2 = r2 * 10
            int r2 = r2 + 7
            goto L57
        L38:
            int r2 = r2 * 10
            int r2 = r2 + 6
            goto L57
        L3d:
            int r2 = r2 * 10
            int r2 = r2 + 5
            goto L57
        L42:
            int r2 = r2 * 10
            int r2 = r2 + 4
            goto L57
        L47:
            int r2 = r2 * 10
            int r2 = r2 + 3
            goto L57
        L4c:
            int r2 = r2 * 10
            int r2 = r2 + 2
            goto L57
        L51:
            int r2 = r2 * 10
            int r2 = r2 + r6
            goto L57
        L55:
            int r2 = r2 * 10
        L57:
            int r3 = r3 + 1
            r7.index = r3
            r1 = 1
            goto L5
    }

    public int parseNumericTimeZone() throws java.text.ParseException {
            r3 = this;
            char[] r0 = r3.orig
            int r1 = r3.index
            int r2 = r1 + 1
            r3.index = r2
            char r0 = r0[r1]
            r1 = 43
            if (r0 != r1) goto L10
            r0 = 1
            goto L15
        L10:
            r1 = 45
            if (r0 != r1) goto L25
            r0 = 0
        L15:
            int r1 = r3.parseNumber()
            int r2 = r1 / 100
            int r2 = r2 * 60
            int r1 = r1 % 100
            int r2 = r2 + r1
            if (r0 == 0) goto L24
            int r0 = -r2
            return r0
        L24:
            return r2
        L25:
            java.text.ParseException r0 = new java.text.ParseException
            java.lang.String r1 = "Bad Numeric TimeZone"
            int r2 = r3.index
            r0.<init>(r1, r2)
            throw r0
    }

    public int parseTimeZone() throws java.text.ParseException {
            r3 = this;
            int r0 = r3.index
            char[] r1 = r3.orig
            int r2 = r1.length
            if (r0 >= r2) goto L1c
            char r0 = r1[r0]
            r1 = 43
            if (r0 == r1) goto L17
            r1 = 45
            if (r0 != r1) goto L12
            goto L17
        L12:
            int r0 = r3.parseAlphaTimeZone()
            return r0
        L17:
            int r0 = r3.parseNumericTimeZone()
            return r0
        L1c:
            java.text.ParseException r0 = new java.text.ParseException
            java.lang.String r1 = "No more characters"
            int r2 = r3.index
            r0.<init>(r1, r2)
            throw r0
    }

    public int peekChar() throws java.text.ParseException {
            r3 = this;
            int r0 = r3.index
            char[] r1 = r3.orig
            int r2 = r1.length
            if (r0 >= r2) goto La
            char r0 = r1[r0]
            return r0
        La:
            java.text.ParseException r0 = new java.text.ParseException
            java.lang.String r1 = "No more characters"
            int r2 = r3.index
            r0.<init>(r1, r2)
            throw r0
    }

    public void skipChar(char r4) throws java.text.ParseException {
            r3 = this;
            int r0 = r3.index
            char[] r1 = r3.orig
            int r2 = r1.length
            if (r0 >= r2) goto L1a
            char r1 = r1[r0]
            if (r1 != r4) goto L10
            int r0 = r0 + 1
            r3.index = r0
            return
        L10:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.String r0 = "Wrong char"
            int r1 = r3.index
            r4.<init>(r0, r1)
            throw r4
        L1a:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.String r0 = "No more characters"
            int r1 = r3.index
            r4.<init>(r0, r1)
            throw r4
    }

    public boolean skipIfChar(char r4) throws java.text.ParseException {
            r3 = this;
            int r0 = r3.index
            char[] r1 = r3.orig
            int r2 = r1.length
            if (r0 >= r2) goto L12
            char r1 = r1[r0]
            if (r1 != r4) goto L10
            r4 = 1
            int r0 = r0 + r4
            r3.index = r0
            return r4
        L10:
            r4 = 0
            return r4
        L12:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.String r0 = "No more characters"
            int r1 = r3.index
            r4.<init>(r0, r1)
            throw r4
    }

    public void skipUntilNumber() throws java.text.ParseException {
            r3 = this;
        L0:
            char[] r0 = r3.orig     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf
            int r1 = r3.index     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf
            char r0 = r0[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf
            switch(r0) {
                case 48: goto Le;
                case 49: goto Le;
                case 50: goto Le;
                case 51: goto Le;
                case 52: goto Le;
                case 53: goto Le;
                case 54: goto Le;
                case 55: goto Le;
                case 56: goto Le;
                case 57: goto Le;
                default: goto L9;
            }     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf
        L9:
            int r1 = r1 + 1
            r3.index = r1     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf
            goto L0
        Le:
            return
        Lf:
            java.text.ParseException r0 = new java.text.ParseException
            java.lang.String r1 = "No Number Found"
            int r2 = r3.index
            r0.<init>(r1, r2)
            throw r0
    }

    public void skipWhiteSpace() {
            r4 = this;
            char[] r0 = r4.orig
            int r0 = r0.length
        L3:
            int r1 = r4.index
            if (r1 < r0) goto L8
            goto L1c
        L8:
            char[] r2 = r4.orig
            char r2 = r2[r1]
            r3 = 9
            if (r2 == r3) goto L1d
            r3 = 10
            if (r2 == r3) goto L1d
            r3 = 13
            if (r2 == r3) goto L1d
            r3 = 32
            if (r2 == r3) goto L1d
        L1c:
            return
        L1d:
            int r1 = r1 + 1
            r4.index = r1
            goto L3
    }
}
