package com.alibaba.fastjson.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class JSONScanner extends com.alibaba.fastjson.parser.JSONLexerBase {
    private final int len;
    private final java.lang.String text;

    public JSONScanner(java.lang.String r2) {
            r1 = this;
            int r0 = com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE
            r1.<init>(r2, r0)
            return
    }

    public JSONScanner(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r2)
            r0.text = r1
            int r1 = r1.length()
            r0.len = r1
            r1 = -1
            r0.bp = r1
            r0.next()
            char r1 = r0.ch
            r2 = 65279(0xfeff, float:9.1475E-41)
            if (r1 != r2) goto L1b
            r0.next()
        L1b:
            return
    }

    public JSONScanner(char[] r2, int r3) {
            r1 = this;
            int r0 = com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE
            r1.<init>(r2, r3, r0)
            return
    }

    public JSONScanner(char[] r3, int r4, int r5) {
            r2 = this;
            java.lang.String r0 = new java.lang.String
            r1 = 0
            r0.<init>(r3, r1, r4)
            r2.<init>(r0, r5)
            return
    }

    static boolean charArrayCompare(java.lang.String r5, int r6, char[] r7) {
            int r0 = r7.length
            int r1 = r0 + r6
            int r2 = r5.length()
            r3 = 0
            if (r1 <= r2) goto Lb
            return r3
        Lb:
            r1 = 0
        Lc:
            if (r1 >= r0) goto L1c
            char r2 = r7[r1]
            int r4 = r6 + r1
            char r4 = r5.charAt(r4)
            if (r2 == r4) goto L19
            return r3
        L19:
            int r1 = r1 + 1
            goto Lc
        L1c:
            r5 = 1
            return r5
    }

    static boolean checkDate(char r4, char r5, char r6, char r7, char r8, char r9, int r10, int r11) {
            r0 = 50
            r1 = 0
            r2 = 49
            if (r4 == r2) goto La
            if (r4 == r0) goto La
            return r1
        La:
            r4 = 48
            if (r5 < r4) goto L49
            r3 = 57
            if (r5 <= r3) goto L13
            goto L49
        L13:
            if (r6 < r4) goto L49
            if (r6 <= r3) goto L18
            goto L49
        L18:
            if (r7 < r4) goto L49
            if (r7 <= r3) goto L1d
            goto L49
        L1d:
            if (r8 != r4) goto L24
            if (r9 < r2) goto L23
            if (r9 <= r3) goto L2d
        L23:
            return r1
        L24:
            if (r8 != r2) goto L49
            if (r9 == r4) goto L2d
            if (r9 == r2) goto L2d
            if (r9 == r0) goto L2d
            return r1
        L2d:
            if (r10 != r4) goto L34
            if (r11 < r2) goto L33
            if (r11 <= r3) goto L47
        L33:
            return r1
        L34:
            if (r10 == r2) goto L42
            if (r10 != r0) goto L39
            goto L42
        L39:
            r5 = 51
            if (r10 != r5) goto L41
            if (r11 == r4) goto L47
            if (r11 == r2) goto L47
        L41:
            return r1
        L42:
            if (r11 < r4) goto L49
            if (r11 <= r3) goto L47
            goto L49
        L47:
            r4 = 1
            return r4
        L49:
            return r1
    }

    private boolean checkTime(char r5, char r6, char r7, char r8, char r9, char r10) {
            r4 = this;
            r0 = 57
            r1 = 0
            r2 = 48
            if (r5 != r2) goto Lc
            if (r6 < r2) goto Lb
            if (r6 <= r0) goto L20
        Lb:
            return r1
        Lc:
            r3 = 49
            if (r5 != r3) goto L15
            if (r6 < r2) goto L14
            if (r6 <= r0) goto L20
        L14:
            return r1
        L15:
            r3 = 50
            if (r5 != r3) goto L42
            if (r6 < r2) goto L42
            r5 = 52
            if (r6 <= r5) goto L20
            goto L42
        L20:
            r5 = 54
            r6 = 53
            if (r7 < r2) goto L2d
            if (r7 > r6) goto L2d
            if (r8 < r2) goto L2c
            if (r8 <= r0) goto L32
        L2c:
            return r1
        L2d:
            if (r7 != r5) goto L42
            if (r8 == r2) goto L32
            return r1
        L32:
            if (r9 < r2) goto L3b
            if (r9 > r6) goto L3b
            if (r10 < r2) goto L3a
            if (r10 <= r0) goto L40
        L3a:
            return r1
        L3b:
            if (r9 != r5) goto L42
            if (r10 == r2) goto L40
            return r1
        L40:
            r5 = 1
            return r5
        L42:
            return r1
    }

    private void setCalendar(char r3, char r4, char r5, char r6, char r7, char r8, char r9, char r10) {
            r2 = this;
            java.util.TimeZone r0 = r2.timeZone
            java.util.Locale r1 = r2.locale
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0, r1)
            r2.calendar = r0
            int r3 = r3 + (-48)
            int r3 = r3 * 1000
            int r4 = r4 + (-48)
            int r4 = r4 * 100
            int r3 = r3 + r4
            int r5 = r5 + (-48)
            int r5 = r5 * 10
            int r3 = r3 + r5
            int r6 = r6 + (-48)
            int r3 = r3 + r6
            int r7 = r7 + (-48)
            int r7 = r7 * 10
            int r8 = r8 + (-48)
            int r7 = r7 + r8
            r4 = 1
            int r7 = r7 - r4
            int r9 = r9 + (-48)
            int r9 = r9 * 10
            int r10 = r10 + (-48)
            int r9 = r9 + r10
            r0.set(r4, r3)
            java.util.Calendar r3 = r2.calendar
            r4 = 2
            r3.set(r4, r7)
            java.util.Calendar r3 = r2.calendar
            r4 = 5
            r3.set(r4, r9)
            return
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final java.lang.String addSymbol(int r2, int r3, int r4, com.alibaba.fastjson.parser.SymbolTable r5) {
            r1 = this;
            java.lang.String r0 = r1.text
            java.lang.String r2 = r5.addSymbol(r0, r2, r3, r4)
            return r2
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    protected final void arrayCopy(int r2, char[] r3, int r4, int r5) {
            r1 = this;
            java.lang.String r0 = r1.text
            int r5 = r5 + r2
            r0.getChars(r2, r5, r3, r4)
            return
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public byte[] bytesValue() {
            r10 = this;
            int r0 = r10.token
            r1 = 26
            if (r0 != r1) goto L5c
            int r0 = r10.np
            int r0 = r0 + 1
            int r1 = r10.sp
            int r2 = r1 % 2
            if (r2 != 0) goto L45
            int r1 = r1 / 2
            byte[] r2 = new byte[r1]
            r3 = 0
        L15:
            if (r3 >= r1) goto L44
            java.lang.String r4 = r10.text
            int r5 = r3 * 2
            int r5 = r5 + r0
            char r4 = r4.charAt(r5)
            java.lang.String r6 = r10.text
            int r5 = r5 + 1
            char r5 = r6.charAt(r5)
            r6 = 55
            r7 = 48
            r8 = 57
            if (r4 > r8) goto L33
            r9 = 48
            goto L35
        L33:
            r9 = 55
        L35:
            int r4 = r4 - r9
            if (r5 > r8) goto L3a
            r6 = 48
        L3a:
            int r5 = r5 - r6
            int r4 = r4 << 4
            r4 = r4 | r5
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto L15
        L44:
            return r2
        L45:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "illegal state. "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L5c:
            java.lang.String r0 = r10.text
            int r1 = r10.np
            int r1 = r1 + 1
            int r2 = r10.sp
            byte[] r0 = com.alibaba.fastjson.util.IOUtils.decodeBase64(r0, r1, r2)
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final boolean charArrayCompare(char[] r3) {
            r2 = this;
            java.lang.String r0 = r2.text
            int r1 = r2.bp
            boolean r3 = charArrayCompare(r0, r1, r3)
            return r3
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final char charAt(int r2) {
            r1 = this;
            int r0 = r1.len
            if (r2 < r0) goto L7
            r2 = 26
            return r2
        L7:
            java.lang.String r0 = r1.text
            char r2 = r0.charAt(r2)
            return r2
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    protected final void copyTo(int r3, int r4, char[] r5) {
            r2 = this;
            java.lang.String r0 = r2.text
            int r4 = r4 + r3
            r1 = 0
            r0.getChars(r3, r4, r5, r1)
            return
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final java.math.BigDecimal decimalValue() {
            r6 = this;
            int r0 = r6.np
            int r1 = r6.sp
            int r0 = r0 + r1
            int r0 = r0 + (-1)
            char r0 = r6.charAt(r0)
            int r1 = r6.sp
            r2 = 76
            if (r0 == r2) goto L21
            r2 = 83
            if (r0 == r2) goto L21
            r2 = 66
            if (r0 == r2) goto L21
            r2 = 70
            if (r0 == r2) goto L21
            r2 = 68
            if (r0 != r2) goto L23
        L21:
            int r1 = r1 + (-1)
        L23:
            int r0 = r6.np
            char[] r2 = r6.sbuf
            int r3 = r2.length
            r4 = 0
            if (r1 >= r3) goto L3a
            java.lang.String r3 = r6.text
            int r5 = r0 + r1
            r3.getChars(r0, r5, r2, r4)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            char[] r2 = r6.sbuf
            r0.<init>(r2, r4, r1)
            return r0
        L3a:
            char[] r2 = new char[r1]
            java.lang.String r3 = r6.text
            int r1 = r1 + r0
            r3.getChars(r0, r1, r2, r4)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r2)
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final int indexOf(char r2, int r3) {
            r1 = this;
            java.lang.String r0 = r1.text
            int r2 = r0.indexOf(r2, r3)
            return r2
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public java.lang.String info() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "pos "
            r0.append(r1)
            int r1 = r4.bp
            r0.append(r1)
            java.lang.String r1 = ", json : "
            r0.append(r1)
            java.lang.String r1 = r4.text
            int r1 = r1.length()
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r1 >= r2) goto L21
            java.lang.String r1 = r4.text
            goto L28
        L21:
            java.lang.String r1 = r4.text
            r3 = 0
            java.lang.String r1 = r1.substring(r3, r2)
        L28:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public boolean isEOF() {
            r5 = this;
            int r0 = r5.bp
            int r1 = r5.len
            r2 = 1
            if (r0 == r1) goto L13
            char r3 = r5.ch
            r4 = 26
            if (r3 != r4) goto L11
            int r0 = r0 + r2
            if (r0 != r1) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            return r2
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public java.util.Collection<java.lang.String> newCollectionByType(java.lang.Class<?> r3) {
            r2 = this;
            java.lang.Class<java.util.HashSet> r0 = java.util.HashSet.class
            boolean r0 = r3.isAssignableFrom(r0)
            if (r0 == 0) goto Le
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            return r3
        Le:
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            boolean r0 = r3.isAssignableFrom(r0)
            if (r0 == 0) goto L1c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            return r3
        L1c:
            java.lang.Object r3 = r3.newInstance()     // Catch: java.lang.Exception -> L23
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Exception -> L23
            return r3
        L23:
            r3 = move-exception
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = r3.getMessage()
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final char next() {
            r2 = this;
            int r0 = r2.bp
            int r0 = r0 + 1
            r2.bp = r0
            int r1 = r2.len
            if (r0 < r1) goto Ld
            r0 = 26
            goto L13
        Ld:
            java.lang.String r1 = r2.text
            char r0 = r1.charAt(r0)
        L13:
            r2.ch = r0
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final java.lang.String numberString() {
            r3 = this;
            int r0 = r3.np
            int r1 = r3.sp
            int r0 = r0 + r1
            int r0 = r0 + (-1)
            char r0 = r3.charAt(r0)
            int r1 = r3.sp
            r2 = 76
            if (r0 == r2) goto L21
            r2 = 83
            if (r0 == r2) goto L21
            r2 = 66
            if (r0 == r2) goto L21
            r2 = 70
            if (r0 == r2) goto L21
            r2 = 68
            if (r0 != r2) goto L23
        L21:
            int r1 = r1 + (-1)
        L23:
            int r0 = r3.np
            java.lang.String r0 = r3.subString(r0, r1)
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public boolean scanFieldBoolean(char[] r10) {
            r9 = this;
            r0 = 0
            r9.matchStat = r0
            java.lang.String r1 = r9.text
            int r2 = r9.bp
            boolean r1 = charArrayCompare(r1, r2, r10)
            if (r1 != 0) goto L11
            r10 = -2
            r9.matchStat = r10
            return r0
        L11:
            int r1 = r9.bp
            int r10 = r10.length
            int r1 = r1 + r10
            int r10 = r1 + 1
            char r2 = r9.charAt(r1)
            r3 = 116(0x74, float:1.63E-43)
            r4 = 101(0x65, float:1.42E-43)
            r5 = 4
            r6 = 1
            r7 = -1
            if (r2 != r3) goto L50
            int r2 = r1 + 2
            char r10 = r9.charAt(r10)
            r3 = 114(0x72, float:1.6E-43)
            if (r10 == r3) goto L31
            r9.matchStat = r7
            return r0
        L31:
            int r10 = r1 + 3
            char r2 = r9.charAt(r2)
            r3 = 117(0x75, float:1.64E-43)
            if (r2 == r3) goto L3e
            r9.matchStat = r7
            return r0
        L3e:
            int r1 = r1 + r5
            char r10 = r9.charAt(r10)
            if (r10 == r4) goto L48
            r9.matchStat = r7
            return r0
        L48:
            r9.bp = r1
            char r10 = r9.charAt(r1)
            r1 = 1
            goto L8d
        L50:
            r3 = 102(0x66, float:1.43E-43)
            if (r2 != r3) goto L119
            int r2 = r1 + 2
            char r10 = r9.charAt(r10)
            r3 = 97
            if (r10 == r3) goto L61
            r9.matchStat = r7
            return r0
        L61:
            int r10 = r1 + 3
            char r2 = r9.charAt(r2)
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == r3) goto L6e
            r9.matchStat = r7
            return r0
        L6e:
            int r2 = r1 + 4
            char r10 = r9.charAt(r10)
            r3 = 115(0x73, float:1.61E-43)
            if (r10 == r3) goto L7b
            r9.matchStat = r7
            return r0
        L7b:
            int r1 = r1 + 5
            char r10 = r9.charAt(r2)
            if (r10 == r4) goto L86
            r9.matchStat = r7
            return r0
        L86:
            r9.bp = r1
            char r10 = r9.charAt(r1)
            r1 = 0
        L8d:
            r2 = 16
            r3 = 44
            if (r10 != r3) goto La4
            int r10 = r9.bp
            int r10 = r10 + r6
            r9.bp = r10
            char r10 = r9.charAt(r10)
            r9.ch = r10
            r10 = 3
            r9.matchStat = r10
            r9.token = r2
            return r1
        La4:
            r4 = 125(0x7d, float:1.75E-43)
            if (r10 != r4) goto L105
            int r10 = r9.bp
            int r10 = r10 + r6
            r9.bp = r10
            char r10 = r9.charAt(r10)
        Lb1:
            if (r10 != r3) goto Lc1
            r9.token = r2
            int r10 = r9.bp
            int r10 = r10 + r6
            r9.bp = r10
            char r10 = r9.charAt(r10)
            r9.ch = r10
            goto Lef
        Lc1:
            r8 = 93
            if (r10 != r8) goto Ld5
            r10 = 15
            r9.token = r10
            int r10 = r9.bp
            int r10 = r10 + r6
            r9.bp = r10
            char r10 = r9.charAt(r10)
            r9.ch = r10
            goto Lef
        Ld5:
            if (r10 != r4) goto Le7
            r10 = 13
            r9.token = r10
            int r10 = r9.bp
            int r10 = r10 + r6
            r9.bp = r10
            char r10 = r9.charAt(r10)
            r9.ch = r10
            goto Lef
        Le7:
            r8 = 26
            if (r10 != r8) goto Lf2
            r10 = 20
            r9.token = r10
        Lef:
            r9.matchStat = r5
            return r1
        Lf2:
            boolean r10 = com.alibaba.fastjson.parser.JSONLexerBase.isWhitespace(r10)
            if (r10 == 0) goto L102
            int r10 = r9.bp
            int r10 = r10 + r6
            r9.bp = r10
            char r10 = r9.charAt(r10)
            goto Lb1
        L102:
            r9.matchStat = r7
            return r0
        L105:
            boolean r10 = com.alibaba.fastjson.parser.JSONLexerBase.isWhitespace(r10)
            if (r10 == 0) goto L116
            int r10 = r9.bp
            int r10 = r10 + r6
            r9.bp = r10
            char r10 = r9.charAt(r10)
            goto L8d
        L116:
            r9.matchStat = r7
            return r0
        L119:
            r9.matchStat = r7
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public int scanFieldInt(char[] r12) {
            r11 = this;
            r0 = 0
            r11.matchStat = r0
            int r1 = r11.bp
            char r2 = r11.ch
            java.lang.String r3 = r11.text
            boolean r3 = charArrayCompare(r3, r1, r12)
            if (r3 != 0) goto L13
            r12 = -2
            r11.matchStat = r12
            return r0
        L13:
            int r3 = r11.bp
            int r12 = r12.length
            int r3 = r3 + r12
            int r12 = r3 + 1
            char r4 = r11.charAt(r3)
            r5 = 45
            r6 = 1
            if (r4 != r5) goto L2b
            int r3 = r3 + 2
            char r4 = r11.charAt(r12)
            r12 = r3
            r3 = 1
            goto L2c
        L2b:
            r3 = 0
        L2c:
            r5 = 48
            r7 = -1
            if (r4 < r5) goto Led
            r8 = 57
            if (r4 > r8) goto Led
            int r4 = r4 - r5
        L36:
            int r9 = r12 + 1
            char r12 = r11.charAt(r12)
            if (r12 < r5) goto L47
            if (r12 > r8) goto L47
            int r4 = r4 * 10
            int r12 = r12 + (-48)
            int r4 = r4 + r12
            r12 = r9
            goto L36
        L47:
            r5 = 46
            if (r12 != r5) goto L4e
            r11.matchStat = r7
            return r0
        L4e:
            if (r4 >= 0) goto L53
            r11.matchStat = r7
            return r0
        L53:
            r5 = 125(0x7d, float:1.75E-43)
            r8 = 44
            if (r12 == r8) goto L6e
            if (r12 != r5) goto L5c
            goto L6e
        L5c:
            boolean r12 = com.alibaba.fastjson.parser.JSONLexerBase.isWhitespace(r12)
            if (r12 == 0) goto L6b
            int r12 = r9 + 1
            char r5 = r11.charAt(r9)
            r9 = r12
            r12 = r5
            goto L53
        L6b:
            r11.matchStat = r7
            return r0
        L6e:
            int r10 = r9 + (-1)
            r11.bp = r10
            r10 = 16
            if (r12 != r8) goto L87
            r11.bp = r9
            char r12 = r11.charAt(r9)
            r11.ch = r12
            r12 = 3
            r11.matchStat = r12
            r11.token = r10
            if (r3 == 0) goto Lec
            int r12 = -r4
            return r12
        L87:
            if (r12 != r5) goto Le8
            r11.bp = r9
            char r12 = r11.charAt(r9)
        L8f:
            if (r12 != r8) goto L9f
            r11.token = r10
            int r12 = r11.bp
            int r12 = r12 + r6
            r11.bp = r12
            char r12 = r11.charAt(r12)
            r11.ch = r12
            goto Lcd
        L9f:
            r9 = 93
            if (r12 != r9) goto Lb3
            r12 = 15
            r11.token = r12
            int r12 = r11.bp
            int r12 = r12 + r6
            r11.bp = r12
            char r12 = r11.charAt(r12)
            r11.ch = r12
            goto Lcd
        Lb3:
            if (r12 != r5) goto Lc5
            r12 = 13
            r11.token = r12
            int r12 = r11.bp
            int r12 = r12 + r6
            r11.bp = r12
            char r12 = r11.charAt(r12)
            r11.ch = r12
            goto Lcd
        Lc5:
            r9 = 26
            if (r12 != r9) goto Ld1
            r12 = 20
            r11.token = r12
        Lcd:
            r12 = 4
            r11.matchStat = r12
            goto Le8
        Ld1:
            boolean r12 = com.alibaba.fastjson.parser.JSONLexerBase.isWhitespace(r12)
            if (r12 == 0) goto Le1
            int r12 = r11.bp
            int r12 = r12 + r6
            r11.bp = r12
            char r12 = r11.charAt(r12)
            goto L8f
        Le1:
            r11.bp = r1
            r11.ch = r2
            r11.matchStat = r7
            return r0
        Le8:
            if (r3 == 0) goto Lec
            int r12 = -r4
            return r12
        Lec:
            return r4
        Led:
            r11.matchStat = r7
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public long scanFieldLong(char[] r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            r0.matchStat = r2
            int r3 = r0.bp
            char r4 = r0.ch
            java.lang.String r5 = r0.text
            boolean r5 = charArrayCompare(r5, r3, r1)
            r6 = 0
            if (r5 != 0) goto L19
            r1 = -2
            r0.matchStat = r1
            return r6
        L19:
            int r5 = r0.bp
            int r1 = r1.length
            int r5 = r5 + r1
            int r1 = r5 + 1
            char r8 = r0.charAt(r5)
            r9 = 45
            r10 = 1
            if (r8 != r9) goto L30
            int r5 = r5 + 2
            char r8 = r0.charAt(r1)
            r1 = r5
            r2 = 1
        L30:
            r5 = 48
            r9 = -1
            if (r8 < r5) goto Lff
            r11 = 57
            if (r8 > r11) goto Lff
            int r8 = r8 - r5
            long r12 = (long) r8
        L3b:
            int r8 = r1 + 1
            char r14 = r0.charAt(r1)
            if (r14 < r5) goto L4f
            if (r14 > r11) goto L4f
            r15 = 10
            long r12 = r12 * r15
            int r14 = r14 + (-48)
            long r14 = (long) r14
            long r12 = r12 + r14
            r1 = r8
            goto L3b
        L4f:
            r5 = 46
            if (r14 != r5) goto L56
            r0.matchStat = r9
            return r6
        L56:
            r5 = 125(0x7d, float:1.75E-43)
            r11 = 44
            if (r14 == r11) goto L5e
            if (r14 != r5) goto L60
        L5e:
            r0.bp = r1
        L60:
            int r1 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r1 >= 0) goto L6b
            r0.bp = r3
            r0.ch = r4
            r0.matchStat = r9
            return r6
        L6b:
            r1 = 16
            if (r14 != r11) goto L83
            int r3 = r0.bp
            int r3 = r3 + r10
            r0.bp = r3
            char r3 = r0.charAt(r3)
            r0.ch = r3
            r3 = 3
            r0.matchStat = r3
            r0.token = r1
            if (r2 == 0) goto Ld3
            long r1 = -r12
            return r1
        L83:
            if (r14 != r5) goto Leb
            int r8 = r0.bp
            int r8 = r8 + r10
            r0.bp = r8
            char r8 = r0.charAt(r8)
        L8e:
            if (r8 != r11) goto L9e
            r0.token = r1
            int r1 = r0.bp
            int r1 = r1 + r10
            r0.bp = r1
            char r1 = r0.charAt(r1)
            r0.ch = r1
            goto Lcc
        L9e:
            r14 = 93
            if (r8 != r14) goto Lb2
            r1 = 15
            r0.token = r1
            int r1 = r0.bp
            int r1 = r1 + r10
            r0.bp = r1
            char r1 = r0.charAt(r1)
            r0.ch = r1
            goto Lcc
        Lb2:
            if (r8 != r5) goto Lc4
            r1 = 13
            r0.token = r1
            int r1 = r0.bp
            int r1 = r1 + r10
            r0.bp = r1
            char r1 = r0.charAt(r1)
            r0.ch = r1
            goto Lcc
        Lc4:
            r14 = 26
            if (r8 != r14) goto Ld4
            r1 = 20
            r0.token = r1
        Lcc:
            r1 = 4
            r0.matchStat = r1
            if (r2 == 0) goto Ld3
            long r1 = -r12
            return r1
        Ld3:
            return r12
        Ld4:
            boolean r8 = com.alibaba.fastjson.parser.JSONLexerBase.isWhitespace(r8)
            if (r8 == 0) goto Le4
            int r8 = r0.bp
            int r8 = r8 + r10
            r0.bp = r8
            char r8 = r0.charAt(r8)
            goto L8e
        Le4:
            r0.bp = r3
            r0.ch = r4
            r0.matchStat = r9
            return r6
        Leb:
            boolean r1 = com.alibaba.fastjson.parser.JSONLexerBase.isWhitespace(r14)
            if (r1 == 0) goto Lfc
            r0.bp = r8
            int r1 = r8 + 1
            char r14 = r0.charAt(r8)
            r8 = r1
            goto L6b
        Lfc:
            r0.matchStat = r9
            return r6
        Lff:
            r0.bp = r3
            r0.ch = r4
            r0.matchStat = r9
            return r6
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public java.lang.String scanFieldString(char[] r11) {
            r10 = this;
            r0 = 0
            r10.matchStat = r0
            int r1 = r10.bp
            char r2 = r10.ch
            java.lang.String r3 = r10.text
            boolean r3 = charArrayCompare(r3, r1, r11)
            if (r3 != 0) goto L17
            r11 = -2
            r10.matchStat = r11
            java.lang.String r11 = r10.stringDefaultValue()
            return r11
        L17:
            int r3 = r10.bp
            int r4 = r11.length
            int r3 = r3 + r4
            int r4 = r3 + 1
            char r3 = r10.charAt(r3)
            r5 = 34
            r6 = -1
            if (r3 == r5) goto L2d
            r10.matchStat = r6
            java.lang.String r11 = r10.stringDefaultValue()
            return r11
        L2d:
            int r3 = r10.indexOf(r5, r4)
            if (r3 == r6) goto L108
            int r7 = r3 - r4
            java.lang.String r4 = r10.subString(r4, r7)
            r7 = 92
            int r8 = r4.indexOf(r7)
            if (r8 == r6) goto L71
        L41:
            int r4 = r3 + (-1)
            r8 = 0
        L44:
            if (r4 < 0) goto L51
            char r9 = r10.charAt(r4)
            if (r9 != r7) goto L51
            int r8 = r8 + 1
            int r4 = r4 + (-1)
            goto L44
        L51:
            int r8 = r8 % 2
            if (r8 != 0) goto L6a
            int r0 = r10.bp
            int r4 = r11.length
            int r4 = r4 + r0
            int r4 = r4 + 1
            int r4 = r3 - r4
            int r11 = r11.length
            int r0 = r0 + r11
            int r0 = r0 + 1
            char[] r11 = r10.sub_chars(r0, r4)
            java.lang.String r4 = com.alibaba.fastjson.parser.JSONLexerBase.readString(r11, r4)
            goto L71
        L6a:
            int r3 = r3 + 1
            int r3 = r10.indexOf(r5, r3)
            goto L41
        L71:
            int r11 = r3 + 1
            char r11 = r10.charAt(r11)
        L77:
            r0 = 125(0x7d, float:1.75E-43)
            r5 = 44
            if (r11 == r5) goto L98
            if (r11 != r0) goto L80
            goto L98
        L80:
            boolean r11 = com.alibaba.fastjson.parser.JSONLexerBase.isWhitespace(r11)
            if (r11 == 0) goto L91
            int r11 = r3 + 1
            int r3 = r3 + 2
            char r0 = r10.charAt(r3)
            r3 = r11
            r11 = r0
            goto L77
        L91:
            r10.matchStat = r6
            java.lang.String r11 = r10.stringDefaultValue()
            return r11
        L98:
            int r7 = r3 + 1
            r10.bp = r7
            r10.ch = r11
            if (r11 != r5) goto Lae
            int r3 = r3 + 2
            r10.bp = r3
            char r11 = r10.charAt(r3)
            r10.ch = r11
            r11 = 3
            r10.matchStat = r11
            return r4
        Lae:
            int r3 = r3 + 2
            r10.bp = r3
            char r11 = r10.charAt(r3)
            if (r11 != r5) goto Lc9
            r11 = 16
            r10.token = r11
            int r11 = r10.bp
            int r11 = r11 + 1
            r10.bp = r11
            char r11 = r10.charAt(r11)
            r10.ch = r11
            goto Lf9
        Lc9:
            r3 = 93
            if (r11 != r3) goto Lde
            r11 = 15
            r10.token = r11
            int r11 = r10.bp
            int r11 = r11 + 1
            r10.bp = r11
            char r11 = r10.charAt(r11)
            r10.ch = r11
            goto Lf9
        Lde:
            if (r11 != r0) goto Lf1
            r11 = 13
            r10.token = r11
            int r11 = r10.bp
            int r11 = r11 + 1
            r10.bp = r11
            char r11 = r10.charAt(r11)
            r10.ch = r11
            goto Lf9
        Lf1:
            r0 = 26
            if (r11 != r0) goto Lfd
            r11 = 20
            r10.token = r11
        Lf9:
            r11 = 4
            r10.matchStat = r11
            return r4
        Lfd:
            r10.bp = r1
            r10.ch = r2
            r10.matchStat = r6
            java.lang.String r11 = r10.stringDefaultValue()
            return r11
        L108:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException
            java.lang.String r0 = "unclosed str"
            r11.<init>(r0)
            throw r11
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public java.util.Collection<java.lang.String> scanFieldStringArray(char[] r14, java.lang.Class<?> r15) {
            r13 = this;
            r0 = 0
            r13.matchStat = r0
            java.lang.String r1 = r13.text
            int r2 = r13.bp
            boolean r1 = charArrayCompare(r1, r2, r14)
            r2 = 0
            if (r1 != 0) goto L12
            r14 = -2
            r13.matchStat = r14
            return r2
        L12:
            java.util.Collection r15 = r13.newCollectionByType(r15)
            int r1 = r13.bp
            int r14 = r14.length
            int r1 = r1 + r14
            int r14 = r1 + 1
            char r3 = r13.charAt(r1)
            r4 = 91
            java.lang.String r5 = "ull"
            r6 = 93
            r7 = 44
            r8 = -1
            if (r3 != r4) goto Ld6
            int r1 = r1 + 2
            char r14 = r13.charAt(r14)
        L31:
            r3 = 34
            if (r14 != r3) goto L83
            int r14 = r13.indexOf(r3, r1)
            if (r14 == r8) goto L7b
            int r4 = r14 - r1
            java.lang.String r4 = r13.subString(r1, r4)
            r9 = 92
            int r10 = r4.indexOf(r9)
            if (r10 == r8) goto L6f
        L49:
            int r4 = r14 + (-1)
            r10 = 0
        L4c:
            if (r4 < 0) goto L59
            char r11 = r13.charAt(r4)
            if (r11 != r9) goto L59
            int r10 = r10 + 1
            int r4 = r4 + (-1)
            goto L4c
        L59:
            int r10 = r10 % 2
            if (r10 != 0) goto L68
            int r3 = r14 - r1
            char[] r1 = r13.sub_chars(r1, r3)
            java.lang.String r4 = com.alibaba.fastjson.parser.JSONLexerBase.readString(r1, r3)
            goto L6f
        L68:
            int r14 = r14 + 1
            int r14 = r13.indexOf(r3, r14)
            goto L49
        L6f:
            int r1 = r14 + 1
            int r14 = r14 + 2
            char r1 = r13.charAt(r1)
            r15.add(r4)
            goto L9d
        L7b:
            com.alibaba.fastjson.JSONException r14 = new com.alibaba.fastjson.JSONException
            java.lang.String r15 = "unclosed str"
            r14.<init>(r15)
            throw r14
        L83:
            r3 = 110(0x6e, float:1.54E-43)
            if (r14 != r3) goto Lc1
            java.lang.String r3 = r13.text
            boolean r3 = r3.startsWith(r5, r1)
            if (r3 == 0) goto Lc1
            int r14 = r1 + 3
            int r1 = r1 + 4
            char r14 = r13.charAt(r14)
            r15.add(r2)
            r12 = r1
            r1 = r14
            r14 = r12
        L9d:
            if (r1 != r7) goto La6
            int r1 = r14 + 1
            char r14 = r13.charAt(r14)
            goto L31
        La6:
            if (r1 != r6) goto Lbe
            int r1 = r14 + 1
            char r14 = r13.charAt(r14)
        Lae:
            boolean r3 = com.alibaba.fastjson.parser.JSONLexerBase.isWhitespace(r14)
            if (r3 == 0) goto Le7
            int r14 = r1 + 1
            char r1 = r13.charAt(r1)
            r12 = r1
            r1 = r14
            r14 = r12
            goto Lae
        Lbe:
            r13.matchStat = r8
            return r2
        Lc1:
            if (r14 != r6) goto Ld3
            int r14 = r15.size()
            if (r14 != 0) goto Ld3
            int r14 = r1 + 1
            char r1 = r13.charAt(r1)
            r12 = r1
            r1 = r14
            r14 = r12
            goto Le7
        Ld3:
            r13.matchStat = r8
            return r2
        Ld6:
            java.lang.String r15 = r13.text
            boolean r14 = r15.startsWith(r5, r14)
            if (r14 == 0) goto L15f
            int r14 = r1 + 4
            int r1 = r1 + 5
            char r14 = r13.charAt(r14)
            r15 = r2
        Le7:
            r13.bp = r1
            if (r14 != r7) goto Lf5
            char r14 = r13.charAt(r1)
            r13.ch = r14
            r14 = 3
            r13.matchStat = r14
            return r15
        Lf5:
            r3 = 125(0x7d, float:1.75E-43)
            if (r14 != r3) goto L15c
            char r14 = r13.charAt(r1)
        Lfd:
            r4 = 1
            if (r14 != r7) goto L110
            r14 = 16
            r13.token = r14
            int r14 = r13.bp
            int r14 = r14 + r4
            r13.bp = r14
            char r14 = r13.charAt(r14)
            r13.ch = r14
            goto L13e
        L110:
            if (r14 != r6) goto L122
            r14 = 15
            r13.token = r14
            int r14 = r13.bp
            int r14 = r14 + r4
            r13.bp = r14
            char r14 = r13.charAt(r14)
            r13.ch = r14
            goto L13e
        L122:
            if (r14 != r3) goto L134
            r14 = 13
            r13.token = r14
            int r14 = r13.bp
            int r14 = r14 + r4
            r13.bp = r14
            char r14 = r13.charAt(r14)
            r13.ch = r14
            goto L13e
        L134:
            r5 = 26
            if (r14 != r5) goto L142
            r0 = 20
            r13.token = r0
            r13.ch = r14
        L13e:
            r14 = 4
            r13.matchStat = r14
            return r15
        L142:
            r5 = 0
        L143:
            boolean r9 = com.alibaba.fastjson.parser.JSONLexerBase.isWhitespace(r14)
            if (r9 == 0) goto L156
            int r14 = r1 + 1
            char r1 = r13.charAt(r1)
            r13.bp = r14
            r5 = r1
            r1 = r14
            r14 = r5
            r5 = 1
            goto L143
        L156:
            if (r5 == 0) goto L159
            goto Lfd
        L159:
            r13.matchStat = r8
            return r2
        L15c:
            r13.matchStat = r8
            return r2
        L15f:
            r13.matchStat = r8
            return r2
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public long scanFieldSymbol(char[] r10) {
            r9 = this;
            r0 = 0
            r9.matchStat = r0
            java.lang.String r0 = r9.text
            int r1 = r9.bp
            boolean r0 = charArrayCompare(r0, r1, r10)
            r1 = 0
            if (r0 != 0) goto L13
            r10 = -2
            r9.matchStat = r10
            return r1
        L13:
            int r0 = r9.bp
            int r10 = r10.length
            int r0 = r0 + r10
            int r10 = r0 + 1
            char r0 = r9.charAt(r0)
            r3 = 34
            r4 = -1
            if (r0 == r3) goto L25
            r9.matchStat = r4
            return r1
        L25:
            r5 = -2128831035(0xffffffff811c9dc5, double:NaN)
        L28:
            int r0 = r10 + 1
            char r10 = r9.charAt(r10)
            if (r10 != r3) goto Lb8
            r9.bp = r0
            char r10 = r9.charAt(r0)
            r9.ch = r10
        L38:
            r0 = 44
            if (r10 != r0) goto L4c
            int r10 = r9.bp
            int r10 = r10 + 1
            r9.bp = r10
            char r10 = r9.charAt(r10)
            r9.ch = r10
            r10 = 3
            r9.matchStat = r10
            return r5
        L4c:
            r3 = 125(0x7d, float:1.75E-43)
            if (r10 != r3) goto La4
            r9.next()
            r9.skipWhitespace()
            char r10 = r9.getCurrent()
            if (r10 != r0) goto L6d
            r10 = 16
            r9.token = r10
            int r10 = r9.bp
            int r10 = r10 + 1
            r9.bp = r10
            char r10 = r9.charAt(r10)
            r9.ch = r10
            goto L9d
        L6d:
            r0 = 93
            if (r10 != r0) goto L82
            r10 = 15
            r9.token = r10
            int r10 = r9.bp
            int r10 = r10 + 1
            r9.bp = r10
            char r10 = r9.charAt(r10)
            r9.ch = r10
            goto L9d
        L82:
            if (r10 != r3) goto L95
            r10 = 13
            r9.token = r10
            int r10 = r9.bp
            int r10 = r10 + 1
            r9.bp = r10
            char r10 = r9.charAt(r10)
            r9.ch = r10
            goto L9d
        L95:
            r0 = 26
            if (r10 != r0) goto La1
            r10 = 20
            r9.token = r10
        L9d:
            r10 = 4
            r9.matchStat = r10
            return r5
        La1:
            r9.matchStat = r4
            return r1
        La4:
            boolean r10 = com.alibaba.fastjson.parser.JSONLexerBase.isWhitespace(r10)
            if (r10 == 0) goto Lb5
            int r10 = r9.bp
            int r10 = r10 + 1
            r9.bp = r10
            char r10 = r9.charAt(r10)
            goto L38
        Lb5:
            r9.matchStat = r4
            return r1
        Lb8:
            int r7 = r9.len
            if (r0 <= r7) goto Lbf
            r9.matchStat = r4
            return r1
        Lbf:
            long r7 = (long) r10
            long r5 = r5 ^ r7
            r7 = 16777619(0x1000193, double:8.289245E-317)
            long r5 = r5 * r7
            r10 = r0
            goto L28
    }

    public boolean scanISO8601DateIfMatch() {
            r1 = this;
            r0 = 1
            boolean r0 = r1.scanISO8601DateIfMatch(r0)
            return r0
    }

    public boolean scanISO8601DateIfMatch(boolean r38) {
            r37 = this;
            r0 = r37
            int r1 = r0.len
            int r2 = r0.bp
            int r9 = r1 - r2
            r10 = 43
            r1 = 47
            r11 = 13
            r12 = 57
            r14 = 3
            r15 = 2
            r3 = 5
            r16 = 1
            r4 = 48
            if (r38 != 0) goto Lb2
            if (r9 <= r11) goto Lb2
            char r2 = r0.charAt(r2)
            int r6 = r0.bp
            int r6 = r6 + 1
            char r6 = r0.charAt(r6)
            int r7 = r0.bp
            int r7 = r7 + r15
            char r7 = r0.charAt(r7)
            int r8 = r0.bp
            int r8 = r8 + r14
            char r8 = r0.charAt(r8)
            r17 = 0
            int r5 = r0.bp
            int r5 = r5 + 4
            char r5 = r0.charAt(r5)
            r18 = 6
            int r13 = r0.bp
            int r13 = r13 + r3
            char r13 = r0.charAt(r13)
            r19 = 3
            int r14 = r0.bp
            int r14 = r14 + r9
            int r14 = r14 + (-1)
            char r14 = r0.charAt(r14)
            r20 = 2
            int r15 = r0.bp
            int r15 = r15 + r9
            int r15 = r15 + (-2)
            char r15 = r0.charAt(r15)
            if (r2 != r1) goto Lba
            r2 = 68
            if (r6 != r2) goto Lba
            r2 = 97
            if (r7 != r2) goto Lba
            r2 = 116(0x74, float:1.63E-43)
            if (r8 != r2) goto Lba
            r2 = 101(0x65, float:1.42E-43)
            if (r5 != r2) goto Lba
            r2 = 40
            if (r13 != r2) goto Lba
            if (r14 != r1) goto Lba
            r2 = 41
            if (r15 != r2) goto Lba
            r1 = -1
            r2 = 6
        L7c:
            if (r2 >= r9) goto L91
            int r5 = r0.bp
            int r5 = r5 + r2
            char r5 = r0.charAt(r5)
            if (r5 != r10) goto L89
            r1 = r2
            goto L8e
        L89:
            if (r5 < r4) goto L91
            if (r5 <= r12) goto L8e
            goto L91
        L8e:
            int r2 = r2 + 1
            goto L7c
        L91:
            r2 = -1
            if (r1 != r2) goto L95
            return r17
        L95:
            int r2 = r0.bp
            int r2 = r2 + 6
            int r1 = r1 - r2
            java.lang.String r1 = r0.subString(r2, r1)
            long r1 = java.lang.Long.parseLong(r1)
            java.util.TimeZone r4 = r0.timeZone
            java.util.Locale r5 = r0.locale
            java.util.Calendar r4 = java.util.Calendar.getInstance(r4, r5)
            r0.calendar = r4
            r4.setTimeInMillis(r1)
            r0.token = r3
            return r16
        Lb2:
            r17 = 0
            r18 = 6
            r19 = 3
            r20 = 2
        Lba:
            r15 = 9
            r2 = 8
            r5 = 14
            r21 = 10
            if (r9 == r2) goto Ld6
            if (r9 == r5) goto Ld6
            r6 = 17
            r7 = 45
            if (r9 != r6) goto Le0
            int r6 = r0.bp
            int r6 = r6 + 6
            char r6 = r0.charAt(r6)
            if (r6 == r7) goto Le0
        Ld6:
            r12 = 48
            r15 = 14
            r22 = 8
            r24 = 9
            goto L4d8
        Le0:
            if (r9 >= r15) goto Le3
            return r17
        Le3:
            int r6 = r0.bp
            char r6 = r0.charAt(r6)
            int r8 = r0.bp
            int r8 = r8 + 1
            char r8 = r0.charAt(r8)
            r22 = 8
            int r2 = r0.bp
            int r2 = r2 + 2
            char r2 = r0.charAt(r2)
            r23 = 5
            int r3 = r0.bp
            int r3 = r3 + 3
            char r3 = r0.charAt(r3)
            int r4 = r0.bp
            int r4 = r4 + 4
            char r4 = r0.charAt(r4)
            int r5 = r0.bp
            int r5 = r5 + 5
            char r5 = r0.charAt(r5)
            r24 = 9
            int r15 = r0.bp
            int r15 = r15 + 6
            char r15 = r0.charAt(r15)
            int r12 = r0.bp
            int r12 = r12 + 7
            char r12 = r0.charAt(r12)
            int r11 = r0.bp
            int r11 = r11 + 8
            char r11 = r0.charAt(r11)
            int r13 = r0.bp
            int r13 = r13 + 9
            char r13 = r0.charAt(r13)
            r14 = 51068(0xc77c, float:7.1562E-41)
            r10 = 26085(0x65e5, float:3.6553E-41)
            if (r4 != r7) goto L140
            if (r12 == r7) goto L144
        L140:
            if (r4 != r1) goto L158
            if (r12 != r1) goto L158
        L144:
            r31 = r2
            r32 = r3
            r33 = r5
            r29 = r6
            r30 = r8
            r35 = r11
            r36 = r13
            r34 = r15
        L154:
            r11 = 10
            goto L231
        L158:
            if (r4 != r7) goto L188
            if (r15 != r7) goto L188
            r1 = 32
            if (r11 != r1) goto L174
            r31 = r2
            r32 = r3
            r34 = r5
            r29 = r6
            r30 = r8
            r36 = r12
            r11 = 8
        L16e:
            r33 = 48
        L170:
            r35 = 48
            goto L231
        L174:
            r31 = r2
            r32 = r3
            r34 = r5
            r29 = r6
            r30 = r8
            r36 = r11
            r35 = r12
            r11 = 9
        L184:
            r33 = 48
            goto L231
        L188:
            r1 = 46
            if (r2 != r1) goto L190
            r1 = 46
            if (r5 == r1) goto L194
        L190:
            if (r2 != r7) goto L1a5
            if (r5 != r7) goto L1a5
        L194:
            r33 = r3
            r34 = r4
            r35 = r6
            r36 = r8
            r31 = r11
            r30 = r12
            r32 = r13
            r29 = r15
            goto L154
        L1a5:
            r1 = 24180(0x5e74, float:3.3883E-41)
            if (r4 == r1) goto L1b0
            r1 = 45380(0xb144, float:6.3591E-41)
            if (r4 != r1) goto L1af
            goto L1b0
        L1af:
            return r17
        L1b0:
            r1 = 26376(0x6708, float:3.696E-41)
            if (r12 == r1) goto L1f1
            r1 = 50900(0xc6d4, float:7.1326E-41)
            if (r12 != r1) goto L1ba
            goto L1f1
        L1ba:
            r1 = 26376(0x6708, float:3.696E-41)
            if (r15 == r1) goto L1c5
            r1 = 50900(0xc6d4, float:7.1326E-41)
            if (r15 != r1) goto L1c4
            goto L1c5
        L1c4:
            return r17
        L1c5:
            if (r11 == r10) goto L1e1
            if (r11 != r14) goto L1ca
            goto L1e1
        L1ca:
            if (r13 == r10) goto L1d0
            if (r13 != r14) goto L1cf
            goto L1d0
        L1cf:
            return r17
        L1d0:
            r31 = r2
            r32 = r3
            r34 = r5
            r29 = r6
            r30 = r8
            r36 = r11
            r35 = r12
            r11 = 10
            goto L184
        L1e1:
            r31 = r2
            r32 = r3
            r34 = r5
            r29 = r6
            r30 = r8
            r36 = r12
            r11 = 10
            goto L16e
        L1f1:
            if (r13 == r10) goto L21f
            if (r13 != r14) goto L1f6
            goto L21f
        L1f6:
            int r1 = r0.bp
            int r1 = r1 + 10
            char r1 = r0.charAt(r1)
            if (r1 == r10) goto L20c
            int r1 = r0.bp
            int r1 = r1 + 10
            char r1 = r0.charAt(r1)
            if (r1 != r14) goto L20b
            goto L20c
        L20b:
            return r17
        L20c:
            r31 = r2
            r32 = r3
            r33 = r5
            r29 = r6
            r30 = r8
            r35 = r11
            r36 = r13
            r34 = r15
            r11 = 11
            goto L231
        L21f:
            r31 = r2
            r32 = r3
            r33 = r5
            r29 = r6
            r30 = r8
            r36 = r11
            r34 = r15
            r11 = 10
            goto L170
        L231:
            boolean r1 = checkDate(r29, r30, r31, r32, r33, r34, r35, r36)
            r6 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r15 = r34
            r7 = r35
            r8 = r36
            r12 = 45
            if (r1 != 0) goto L24a
            return r17
        L24a:
            r1 = r6
            r6 = r15
            r12 = 48
            r13 = 45
            r15 = 14
            r0.setCalendar(r1, r2, r3, r4, r5, r6, r7, r8)
            int r1 = r0.bp
            int r1 = r1 + r11
            char r7 = r0.charAt(r1)
            r1 = 84
            r8 = 58
            if (r7 == r1) goto L300
            r1 = 32
            if (r7 != r1) goto L26a
            if (r38 != 0) goto L26a
            goto L300
        L26a:
            r1 = 34
            if (r7 == r1) goto L276
            r1 = 26
            if (r7 == r1) goto L276
            if (r7 == r10) goto L276
            if (r7 != r14) goto L278
        L276:
            r2 = 0
            goto L2d7
        L278:
            r1 = 43
            if (r7 == r1) goto L280
            if (r7 != r13) goto L27f
            goto L280
        L27f:
            return r17
        L280:
            int r1 = r0.len
            int r2 = r11 + 6
            if (r1 != r2) goto L2d5
            int r1 = r0.bp
            int r1 = r1 + r11
            int r1 = r1 + 3
            char r1 = r0.charAt(r1)
            if (r1 != r8) goto L2a7
            int r1 = r0.bp
            int r1 = r1 + r11
            int r1 = r1 + 4
            char r1 = r0.charAt(r1)
            if (r1 != r12) goto L2a7
            int r1 = r0.bp
            int r1 = r1 + r11
            int r1 = r1 + 5
            char r1 = r0.charAt(r1)
            if (r1 == r12) goto L2a9
        L2a7:
            r2 = 0
            goto L2d4
        L2a9:
            r5 = 48
            r6 = 48
            r1 = 48
            r2 = 48
            r3 = 48
            r4 = 48
            r0.setTime(r1, r2, r3, r4, r5, r6)
            java.util.Calendar r1 = r0.calendar
            r2 = 0
            r1.set(r15, r2)
            int r1 = r0.bp
            int r1 = r1 + r11
            int r1 = r1 + 1
            char r1 = r0.charAt(r1)
            int r2 = r0.bp
            int r2 = r2 + r11
            int r2 = r2 + 2
            char r2 = r0.charAt(r2)
            r0.setTimeZone(r7, r1, r2)
            return r16
        L2d4:
            return r2
        L2d5:
            r2 = 0
            return r2
        L2d7:
            java.util.Calendar r1 = r0.calendar
            r3 = 11
            r1.set(r3, r2)
            java.util.Calendar r1 = r0.calendar
            r3 = 12
            r1.set(r3, r2)
            java.util.Calendar r1 = r0.calendar
            r3 = 13
            r1.set(r3, r2)
            java.util.Calendar r1 = r0.calendar
            r1.set(r15, r2)
            int r1 = r0.bp
            int r1 = r1 + r11
            r0.bp = r1
            char r1 = r0.charAt(r1)
            r0.ch = r1
            r1 = 5
            r0.token = r1
            return r16
        L300:
            int r7 = r11 + 9
            if (r9 >= r7) goto L307
            r17 = 0
            return r17
        L307:
            r17 = 0
            int r1 = r0.bp
            int r1 = r1 + r11
            int r1 = r1 + 3
            char r1 = r0.charAt(r1)
            if (r1 == r8) goto L315
            return r17
        L315:
            int r1 = r0.bp
            int r1 = r1 + r11
            int r1 = r1 + 6
            char r1 = r0.charAt(r1)
            if (r1 == r8) goto L321
            return r17
        L321:
            int r1 = r0.bp
            int r1 = r1 + r11
            int r1 = r1 + 1
            char r1 = r0.charAt(r1)
            int r2 = r0.bp
            int r2 = r2 + r11
            int r2 = r2 + 2
            char r2 = r0.charAt(r2)
            int r3 = r0.bp
            int r3 = r3 + r11
            int r3 = r3 + 4
            char r3 = r0.charAt(r3)
            int r4 = r0.bp
            int r4 = r4 + r11
            r23 = 5
            int r4 = r4 + 5
            char r4 = r0.charAt(r4)
            int r5 = r0.bp
            int r5 = r5 + r11
            int r5 = r5 + 7
            char r5 = r0.charAt(r5)
            int r6 = r0.bp
            int r6 = r6 + r11
            int r6 = r6 + 8
            char r6 = r0.charAt(r6)
            boolean r10 = r0.checkTime(r1, r2, r3, r4, r5, r6)
            if (r10 != 0) goto L362
            r17 = 0
            return r17
        L362:
            r17 = 0
            r0 = r37
            r0.setTime(r1, r2, r3, r4, r5, r6)
            int r1 = r0.bp
            int r1 = r1 + r11
            int r1 = r1 + 9
            char r1 = r0.charAt(r1)
            r2 = 46
            if (r1 != r2) goto L49f
            int r1 = r11 + 11
            if (r9 >= r1) goto L37b
            return r17
        L37b:
            int r2 = r0.bp
            int r2 = r2 + r11
            int r2 = r2 + 10
            char r2 = r0.charAt(r2)
            if (r2 < r12) goto L38a
            r3 = 57
            if (r2 <= r3) goto L38d
        L38a:
            r2 = 0
            goto L49e
        L38d:
            int r2 = r2 - r12
            if (r9 <= r1) goto L3a6
            int r1 = r0.bp
            int r1 = r1 + r11
            r27 = 11
            int r1 = r1 + 11
            char r1 = r0.charAt(r1)
            if (r1 < r12) goto L3a6
            if (r1 > r3) goto L3a6
            int r2 = r2 * 10
            int r1 = r1 - r12
            int r2 = r2 + r1
            r1 = 2
        L3a4:
            r3 = 2
            goto L3a8
        L3a6:
            r1 = 1
            goto L3a4
        L3a8:
            if (r1 != r3) goto L3c0
            int r3 = r0.bp
            int r3 = r3 + r11
            r26 = 12
            int r3 = r3 + 12
            char r3 = r0.charAt(r3)
            if (r3 < r12) goto L3c0
            r4 = 57
            if (r3 > r4) goto L3c0
            int r2 = r2 * 10
            int r3 = r3 - r12
            int r2 = r2 + r3
            r1 = 3
        L3c0:
            java.util.Calendar r3 = r0.calendar
            r3.set(r15, r2)
            int r2 = r0.bp
            int r2 = r2 + r11
            int r2 = r2 + 10
            int r2 = r2 + r1
            char r2 = r0.charAt(r2)
            r3 = 43
            if (r2 == r3) goto L400
            if (r2 != r13) goto L3d6
            goto L400
        L3d6:
            r3 = 90
            if (r2 != r3) goto L3fd
            java.util.Calendar r2 = r0.calendar
            java.util.TimeZone r2 = r2.getTimeZone()
            int r2 = r2.getRawOffset()
            if (r2 == 0) goto L3fa
            r17 = 0
            java.lang.String[] r2 = java.util.TimeZone.getAvailableIDs(r17)
            int r3 = r2.length
            if (r3 <= 0) goto L3fa
            r2 = r2[r17]
            java.util.TimeZone r2 = java.util.TimeZone.getTimeZone(r2)
            java.util.Calendar r3 = r0.calendar
            r3.setTimeZone(r2)
        L3fa:
            r5 = 1
            goto L47a
        L3fd:
            r5 = 0
            goto L47a
        L400:
            int r3 = r0.bp
            int r3 = r3 + r11
            int r3 = r3 + 10
            int r3 = r3 + r1
            int r3 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r12) goto L412
            r4 = 49
            if (r3 <= r4) goto L415
        L412:
            r2 = 0
            goto L49e
        L415:
            int r4 = r0.bp
            int r4 = r4 + r11
            int r4 = r4 + 10
            int r4 = r4 + r1
            r20 = 2
            int r4 = r4 + 2
            char r4 = r0.charAt(r4)
            if (r4 < r12) goto L429
            r5 = 57
            if (r4 <= r5) goto L42c
        L429:
            r2 = 0
            goto L49e
        L42c:
            int r5 = r0.bp
            int r5 = r5 + r11
            int r5 = r5 + 10
            int r5 = r5 + r1
            int r5 = r5 + 3
            char r5 = r0.charAt(r5)
            if (r5 != r8) goto L460
            int r5 = r0.bp
            int r5 = r5 + r11
            int r5 = r5 + 10
            int r5 = r5 + r1
            int r5 = r5 + 4
            char r5 = r0.charAt(r5)
            if (r5 == r12) goto L44b
            r17 = 0
            return r17
        L44b:
            r17 = 0
            int r5 = r0.bp
            int r5 = r5 + r11
            int r5 = r5 + 10
            int r5 = r5 + r1
            r23 = 5
            int r5 = r5 + 5
            char r5 = r0.charAt(r5)
            if (r5 == r12) goto L45e
            return r17
        L45e:
            r13 = 6
            goto L476
        L460:
            r17 = 0
            if (r5 != r12) goto L475
            int r5 = r0.bp
            int r5 = r5 + r11
            int r5 = r5 + 10
            int r5 = r5 + r1
            int r5 = r5 + 4
            char r5 = r0.charAt(r5)
            if (r5 == r12) goto L473
            return r17
        L473:
            r13 = 5
            goto L476
        L475:
            r13 = 3
        L476:
            r0.setTimeZone(r2, r3, r4)
            r5 = r13
        L47a:
            int r2 = r0.bp
            int r11 = r11 + 10
            int r11 = r11 + r1
            int r11 = r11 + r5
            int r2 = r2 + r11
            char r1 = r0.charAt(r2)
            r2 = 26
            if (r1 == r2) goto L48f
            r2 = 34
            if (r1 == r2) goto L48f
            r2 = 0
            return r2
        L48f:
            int r1 = r0.bp
            int r1 = r1 + r11
            r0.bp = r1
            char r1 = r0.charAt(r1)
            r0.ch = r1
            r1 = 5
            r0.token = r1
            return r16
        L49e:
            return r2
        L49f:
            r2 = 0
            java.util.Calendar r3 = r0.calendar
            r3.set(r15, r2)
            int r2 = r0.bp
            int r2 = r2 + r7
            r0.bp = r2
            char r2 = r0.charAt(r2)
            r0.ch = r2
            r2 = 5
            r0.token = r2
            r2 = 90
            if (r1 != r2) goto L4d7
            java.util.Calendar r1 = r0.calendar
            java.util.TimeZone r1 = r1.getTimeZone()
            int r1 = r1.getRawOffset()
            if (r1 == 0) goto L4d7
            r17 = 0
            java.lang.String[] r1 = java.util.TimeZone.getAvailableIDs(r17)
            int r2 = r1.length
            if (r2 <= 0) goto L4d7
            r1 = r1[r17]
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            java.util.Calendar r2 = r0.calendar
            r2.setTimeZone(r1)
        L4d7:
            return r16
        L4d8:
            if (r38 == 0) goto L4dd
            r17 = 0
            return r17
        L4dd:
            int r1 = r0.bp
            char r28 = r0.charAt(r1)
            int r1 = r0.bp
            int r1 = r1 + 1
            char r29 = r0.charAt(r1)
            int r1 = r0.bp
            r20 = 2
            int r1 = r1 + 2
            char r30 = r0.charAt(r1)
            int r1 = r0.bp
            int r1 = r1 + 3
            char r31 = r0.charAt(r1)
            int r1 = r0.bp
            int r1 = r1 + 4
            char r32 = r0.charAt(r1)
            int r1 = r0.bp
            r23 = 5
            int r1 = r1 + 5
            char r33 = r0.charAt(r1)
            int r1 = r0.bp
            int r1 = r1 + 6
            char r34 = r0.charAt(r1)
            int r1 = r0.bp
            int r1 = r1 + 7
            char r35 = r0.charAt(r1)
            boolean r1 = checkDate(r28, r29, r30, r31, r32, r33, r34, r35)
            if (r1 != 0) goto L528
            r17 = 0
            return r17
        L528:
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r34
            r8 = r35
            r0.setCalendar(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 8
            if (r9 == r1) goto L5d4
            int r2 = r0.bp
            int r2 = r2 + r1
            char r1 = r0.charAt(r2)
            int r2 = r0.bp
            int r2 = r2 + 9
            char r2 = r0.charAt(r2)
            int r3 = r0.bp
            int r3 = r3 + 10
            char r3 = r0.charAt(r3)
            int r4 = r0.bp
            r27 = 11
            int r4 = r4 + 11
            char r4 = r0.charAt(r4)
            int r5 = r0.bp
            r26 = 12
            int r5 = r5 + 12
            char r5 = r0.charAt(r5)
            int r6 = r0.bp
            r25 = 13
            int r6 = r6 + 13
            char r6 = r0.charAt(r6)
            boolean r7 = r0.checkTime(r1, r2, r3, r4, r5, r6)
            if (r7 != 0) goto L57d
            r17 = 0
            return r17
        L57d:
            r7 = 17
            if (r9 != r7) goto L5bc
            int r7 = r0.bp
            int r7 = r7 + r15
            char r7 = r0.charAt(r7)
            int r8 = r0.bp
            int r8 = r8 + 15
            char r8 = r0.charAt(r8)
            int r9 = r0.bp
            int r9 = r9 + 16
            char r9 = r0.charAt(r9)
            if (r7 < r12) goto L59e
            r10 = 57
            if (r7 <= r10) goto L5a1
        L59e:
            r17 = 0
            goto L5bb
        L5a1:
            if (r8 < r12) goto L5a5
            if (r8 <= r10) goto L5a8
        L5a5:
            r17 = 0
            goto L5bb
        L5a8:
            if (r9 < r12) goto L5ac
            if (r9 <= r10) goto L5af
        L5ac:
            r17 = 0
            goto L5bb
        L5af:
            int r7 = r7 - r12
            int r7 = r7 * 100
            int r8 = r8 - r12
            int r8 = r8 * 10
            int r7 = r7 + r8
            int r9 = r9 - r12
            int r7 = r7 + r9
            r17 = r7
            goto L5be
        L5bb:
            return r17
        L5bc:
            r17 = 0
        L5be:
            int r1 = r1 - r12
            int r1 = r1 * 10
            int r2 = r2 - r12
            int r1 = r1 + r2
            int r3 = r3 - r12
            int r3 = r3 * 10
            int r4 = r4 - r12
            int r2 = r3 + r4
            int r5 = r5 - r12
            int r5 = r5 * 10
            int r6 = r6 - r12
            int r5 = r5 + r6
            r3 = r5
            r5 = r1
            r1 = r3
            r3 = r17
            goto L5da
        L5d4:
            r17 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
        L5da:
            java.util.Calendar r4 = r0.calendar
            r6 = 11
            r4.set(r6, r5)
            java.util.Calendar r4 = r0.calendar
            r5 = 12
            r4.set(r5, r2)
            java.util.Calendar r2 = r0.calendar
            r4 = 13
            r2.set(r4, r1)
            java.util.Calendar r1 = r0.calendar
            r1.set(r15, r3)
            r1 = 5
            r0.token = r1
            return r16
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final int scanInt(char r9) {
            r8 = this;
            r0 = 0
            r8.matchStat = r0
            int r1 = r8.bp
            int r2 = r1 + 1
            char r3 = r8.charAt(r1)
            r4 = 45
            if (r3 != r4) goto L11
            r4 = 1
            goto L12
        L11:
            r4 = 0
        L12:
            if (r4 == 0) goto L1b
            int r1 = r1 + 2
            char r3 = r8.charAt(r2)
            r2 = r1
        L1b:
            r1 = -1
            r5 = 48
            if (r3 < r5) goto L6c
            r6 = 57
            if (r3 > r6) goto L6c
            int r3 = r3 - r5
        L25:
            int r7 = r2 + 1
            char r2 = r8.charAt(r2)
            if (r2 < r5) goto L36
            if (r2 > r6) goto L36
            int r3 = r3 * 10
            int r2 = r2 + (-48)
            int r3 = r3 + r2
            r2 = r7
            goto L25
        L36:
            r5 = 46
            if (r2 != r5) goto L3d
            r8.matchStat = r1
            return r0
        L3d:
            if (r3 >= 0) goto L42
            r8.matchStat = r1
            return r0
        L42:
            if (r2 != r9) goto L57
            r8.bp = r7
            char r9 = r8.charAt(r7)
            r8.ch = r9
            r9 = 3
            r8.matchStat = r9
            r9 = 16
            r8.token = r9
            if (r4 == 0) goto L6b
            int r9 = -r3
            return r9
        L57:
            boolean r0 = com.alibaba.fastjson.parser.JSONLexerBase.isWhitespace(r2)
            if (r0 == 0) goto L65
            int r0 = r7 + 1
            char r2 = r8.charAt(r7)
            r7 = r0
            goto L42
        L65:
            r8.matchStat = r1
            if (r4 == 0) goto L6b
            int r9 = -r3
            return r9
        L6b:
            return r3
        L6c:
            r8.matchStat = r1
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public long scanLong(char r14) {
            r13 = this;
            r0 = 0
            r13.matchStat = r0
            int r1 = r13.bp
            int r2 = r1 + 1
            char r3 = r13.charAt(r1)
            r4 = 45
            if (r3 != r4) goto L10
            r0 = 1
        L10:
            if (r0 == 0) goto L19
            int r1 = r1 + 2
            char r3 = r13.charAt(r2)
            r2 = r1
        L19:
            r4 = 0
            r1 = -1
            r6 = 48
            if (r3 < r6) goto L71
            r7 = 57
            if (r3 > r7) goto L71
            int r3 = r3 - r6
            long r8 = (long) r3
        L26:
            int r3 = r2 + 1
            char r2 = r13.charAt(r2)
            if (r2 < r6) goto L3a
            if (r2 > r7) goto L3a
            r10 = 10
            long r8 = r8 * r10
            int r2 = r2 + (-48)
            long r10 = (long) r2
            long r8 = r8 + r10
            r2 = r3
            goto L26
        L3a:
            r6 = 46
            if (r2 != r6) goto L41
            r13.matchStat = r1
            return r4
        L41:
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 >= 0) goto L48
            r13.matchStat = r1
            return r4
        L48:
            if (r2 != r14) goto L5e
            r13.bp = r3
            char r14 = r13.charAt(r3)
            r13.ch = r14
            r14 = 3
            r13.matchStat = r14
            r14 = 16
            r13.token = r14
            if (r0 == 0) goto L5d
            long r0 = -r8
            return r0
        L5d:
            return r8
        L5e:
            boolean r2 = com.alibaba.fastjson.parser.JSONLexerBase.isWhitespace(r2)
            if (r2 == 0) goto L6e
            int r2 = r3 + 1
            char r3 = r13.charAt(r3)
            r12 = r3
            r3 = r2
            r2 = r12
            goto L48
        L6e:
            r13.matchStat = r1
            return r8
        L71:
            r13.matchStat = r1
            return r4
    }

    protected void setTime(char r1, char r2, char r3, char r4, char r5, char r6) {
            r0 = this;
            int r1 = r1 + (-48)
            int r1 = r1 * 10
            int r2 = r2 + (-48)
            int r1 = r1 + r2
            int r3 = r3 + (-48)
            int r3 = r3 * 10
            int r4 = r4 + (-48)
            int r3 = r3 + r4
            int r5 = r5 + (-48)
            int r5 = r5 * 10
            int r6 = r6 + (-48)
            int r5 = r5 + r6
            java.util.Calendar r2 = r0.calendar
            r4 = 11
            r2.set(r4, r1)
            java.util.Calendar r1 = r0.calendar
            r2 = 12
            r1.set(r2, r3)
            java.util.Calendar r1 = r0.calendar
            r2 = 13
            r1.set(r2, r5)
            return
    }

    protected void setTimeZone(char r1, char r2, char r3) {
            r0 = this;
            int r2 = r2 + (-48)
            int r2 = r2 * 10
            int r3 = r3 + (-48)
            int r2 = r2 + r3
            r3 = 3600000(0x36ee80, float:5.044674E-39)
            int r2 = r2 * r3
            r3 = 45
            if (r1 != r3) goto L11
            int r2 = -r2
        L11:
            java.util.Calendar r1 = r0.calendar
            java.util.TimeZone r1 = r1.getTimeZone()
            int r1 = r1.getRawOffset()
            if (r1 == r2) goto L30
            java.lang.String[] r1 = java.util.TimeZone.getAvailableIDs(r2)
            int r2 = r1.length
            if (r2 <= 0) goto L30
            r2 = 0
            r1 = r1[r2]
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            java.util.Calendar r2 = r0.calendar
            r2.setTimeZone(r1)
        L30:
            return
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final java.lang.String stringVal() {
            r4 = this;
            boolean r0 = r4.hasSpecial
            if (r0 != 0) goto Lf
            int r0 = r4.np
            int r0 = r0 + 1
            int r1 = r4.sp
            java.lang.String r0 = r4.subString(r0, r1)
            return r0
        Lf:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r4.sbuf
            r2 = 0
            int r3 = r4.sp
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final java.lang.String subString(int r5, int r6) {
            r4 = this;
            boolean r0 = com.alibaba.fastjson.util.ASMUtils.IS_ANDROID
            if (r0 == 0) goto L27
            char[] r0 = r4.sbuf
            int r1 = r0.length
            r2 = 0
            if (r6 >= r1) goto L19
            java.lang.String r1 = r4.text
            int r3 = r5 + r6
            r1.getChars(r5, r3, r0, r2)
            java.lang.String r5 = new java.lang.String
            char[] r0 = r4.sbuf
            r5.<init>(r0, r2, r6)
            return r5
        L19:
            char[] r0 = new char[r6]
            java.lang.String r1 = r4.text
            int r6 = r6 + r5
            r1.getChars(r5, r6, r0, r2)
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0)
            return r5
        L27:
            java.lang.String r0 = r4.text
            int r6 = r6 + r5
            java.lang.String r5 = r0.substring(r5, r6)
            return r5
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final char[] sub_chars(int r4, int r5) {
            r3 = this;
            boolean r0 = com.alibaba.fastjson.util.ASMUtils.IS_ANDROID
            r1 = 0
            if (r0 == 0) goto L13
            char[] r0 = r3.sbuf
            int r2 = r0.length
            if (r5 >= r2) goto L13
            java.lang.String r2 = r3.text
            int r5 = r5 + r4
            r2.getChars(r4, r5, r0, r1)
            char[] r4 = r3.sbuf
            return r4
        L13:
            char[] r0 = new char[r5]
            java.lang.String r2 = r3.text
            int r5 = r5 + r4
            r2.getChars(r4, r5, r0, r1)
            return r0
    }
}
