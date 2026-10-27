package com.alibaba.fastjson.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class JSONLexerBase implements com.alibaba.fastjson.parser.JSONLexer, java.io.Closeable {
    protected static final int INT_MULTMIN_RADIX_TEN = -214748364;
    protected static final long MULTMIN_RADIX_TEN = -922337203685477580L;
    private static final java.lang.ThreadLocal<char[]> SBUF_LOCAL = null;
    protected static final int[] digits = null;
    protected static final char[] typeFieldName = null;
    protected int bp;
    protected java.util.Calendar calendar;
    protected char ch;
    protected int eofPos;
    protected int features;
    protected boolean hasSpecial;
    protected java.util.Locale locale;
    public int matchStat;
    protected int np;
    protected int pos;
    protected char[] sbuf;
    protected int sp;
    protected java.lang.String stringDefaultValue;
    protected java.util.TimeZone timeZone;
    protected int token;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.alibaba.fastjson.parser.JSONLexerBase.SBUF_LOCAL = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\""
            r0.append(r1)
            java.lang.String r1 = com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY
            r0.append(r1)
            java.lang.String r1 = "\":\""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            char[] r0 = r0.toCharArray()
            com.alibaba.fastjson.parser.JSONLexerBase.typeFieldName = r0
            r0 = 103(0x67, float:1.44E-43)
            int[] r0 = new int[r0]
            com.alibaba.fastjson.parser.JSONLexerBase.digits = r0
            r0 = 48
        L2d:
            r1 = 57
            if (r0 > r1) goto L3a
            int[] r1 = com.alibaba.fastjson.parser.JSONLexerBase.digits
            int r2 = r0 + (-48)
            r1[r0] = r2
            int r0 = r0 + 1
            goto L2d
        L3a:
            r0 = 97
        L3c:
            r1 = 102(0x66, float:1.43E-43)
            if (r0 > r1) goto L49
            int[] r1 = com.alibaba.fastjson.parser.JSONLexerBase.digits
            int r2 = r0 + (-87)
            r1[r0] = r2
            int r0 = r0 + 1
            goto L3c
        L49:
            r0 = 65
        L4b:
            r1 = 70
            if (r0 > r1) goto L58
            int[] r1 = com.alibaba.fastjson.parser.JSONLexerBase.digits
            int r2 = r0 + (-55)
            r1[r0] = r2
            int r0 = r0 + 1
            goto L4b
        L58:
            return
    }

    public JSONLexerBase(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.calendar = r0
            java.util.TimeZone r1 = com.alibaba.fastjson.JSON.defaultTimeZone
            r2.timeZone = r1
            java.util.Locale r1 = com.alibaba.fastjson.JSON.defaultLocale
            r2.locale = r1
            r1 = 0
            r2.matchStat = r1
            r2.stringDefaultValue = r0
            r2.features = r3
            com.alibaba.fastjson.parser.Feature r0 = com.alibaba.fastjson.parser.Feature.InitStringFieldAsEmpty
            int r0 = r0.mask
            r3 = r3 & r0
            if (r3 == 0) goto L20
            java.lang.String r3 = ""
            r2.stringDefaultValue = r3
        L20:
            java.lang.ThreadLocal<char[]> r3 = com.alibaba.fastjson.parser.JSONLexerBase.SBUF_LOCAL
            java.lang.Object r3 = r3.get()
            char[] r3 = (char[]) r3
            r2.sbuf = r3
            if (r3 != 0) goto L32
            r3 = 512(0x200, float:7.17E-43)
            char[] r3 = new char[r3]
            r2.sbuf = r3
        L32:
            return
    }

    public static boolean isWhitespace(char r1) {
            r0 = 32
            if (r1 > r0) goto L1c
            if (r1 == r0) goto L1a
            r0 = 10
            if (r1 == r0) goto L1a
            r0 = 13
            if (r1 == r0) goto L1a
            r0 = 9
            if (r1 == r0) goto L1a
            r0 = 12
            if (r1 == r0) goto L1a
            r0 = 8
            if (r1 != r0) goto L1c
        L1a:
            r1 = 1
            return r1
        L1c:
            r1 = 0
            return r1
    }

    public static java.lang.String readString(char[] r16, int r17) {
            r0 = r17
            char[] r1 = new char[r0]
            r2 = 0
            r3 = 0
            r4 = 0
        L7:
            if (r3 >= r0) goto L10a
            char r5 = r16[r3]
            r6 = 92
            r7 = 1
            if (r5 == r6) goto L17
            int r6 = r4 + 1
            r1[r4] = r5
            r4 = r6
            goto L107
        L17:
            int r5 = r3 + 1
            char r8 = r16[r5]
            r9 = 34
            if (r8 == r9) goto L101
            r9 = 39
            if (r8 == r9) goto Lfb
            r9 = 70
            if (r8 == r9) goto Lf3
            if (r8 == r6) goto Led
            r6 = 98
            if (r8 == r6) goto Le5
            r6 = 102(0x66, float:1.43E-43)
            if (r8 == r6) goto Lf3
            r6 = 110(0x6e, float:1.54E-43)
            if (r8 == r6) goto Ldd
            r6 = 114(0x72, float:1.6E-43)
            if (r8 == r6) goto Ld5
            r6 = 120(0x78, float:1.68E-43)
            r9 = 16
            if (r8 == r6) goto Lbe
            r6 = 4
            r10 = 3
            r11 = 2
            switch(r8) {
                case 47: goto Lb7;
                case 48: goto Lb2;
                case 49: goto Lad;
                case 50: goto La8;
                case 51: goto La3;
                case 52: goto L9e;
                case 53: goto L98;
                case 54: goto L92;
                case 55: goto L8c;
                default: goto L45;
            }
        L45:
            switch(r8) {
                case 116: goto L85;
                case 117: goto L5a;
                case 118: goto L50;
                default: goto L48;
            }
        L48:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "unclosed.str.lit"
            r0.<init>(r1)
            throw r0
        L50:
            int r3 = r4 + 1
            r6 = 11
            r1[r4] = r6
        L56:
            r4 = r3
            r3 = r5
            goto L107
        L5a:
            int r5 = r4 + 1
            java.lang.String r8 = new java.lang.String
            int r12 = r3 + 2
            char r12 = r16[r12]
            int r13 = r3 + 3
            char r13 = r16[r13]
            int r14 = r3 + 4
            char r14 = r16[r14]
            int r3 = r3 + 5
            char r15 = r16[r3]
            char[] r6 = new char[r6]
            r6[r2] = r12
            r6[r7] = r13
            r6[r11] = r14
            r6[r10] = r15
            r8.<init>(r6)
            int r6 = java.lang.Integer.parseInt(r8, r9)
            char r6 = (char) r6
            r1[r4] = r6
        L82:
            r4 = r5
            goto L107
        L85:
            int r3 = r4 + 1
            r6 = 9
            r1[r4] = r6
            goto L56
        L8c:
            int r3 = r4 + 1
            r6 = 7
            r1[r4] = r6
            goto L56
        L92:
            int r3 = r4 + 1
            r6 = 6
            r1[r4] = r6
            goto L56
        L98:
            int r3 = r4 + 1
            r6 = 5
            r1[r4] = r6
            goto L56
        L9e:
            int r3 = r4 + 1
            r1[r4] = r6
            goto L56
        La3:
            int r3 = r4 + 1
            r1[r4] = r10
            goto L56
        La8:
            int r3 = r4 + 1
            r1[r4] = r11
            goto L56
        Lad:
            int r3 = r4 + 1
            r1[r4] = r7
            goto L56
        Lb2:
            int r3 = r4 + 1
            r1[r4] = r2
            goto L56
        Lb7:
            int r3 = r4 + 1
            r6 = 47
            r1[r4] = r6
            goto L56
        Lbe:
            int r5 = r4 + 1
            int[] r6 = com.alibaba.fastjson.parser.JSONLexerBase.digits
            int r8 = r3 + 2
            char r8 = r16[r8]
            r8 = r6[r8]
            int r8 = r8 * 16
            int r3 = r3 + 3
            char r9 = r16[r3]
            r6 = r6[r9]
            int r8 = r8 + r6
            char r6 = (char) r8
            r1[r4] = r6
            goto L82
        Ld5:
            int r3 = r4 + 1
            r6 = 13
            r1[r4] = r6
            goto L56
        Ldd:
            int r3 = r4 + 1
            r6 = 10
            r1[r4] = r6
            goto L56
        Le5:
            int r3 = r4 + 1
            r6 = 8
            r1[r4] = r6
            goto L56
        Led:
            int r3 = r4 + 1
            r1[r4] = r6
            goto L56
        Lf3:
            int r3 = r4 + 1
            r6 = 12
            r1[r4] = r6
            goto L56
        Lfb:
            int r3 = r4 + 1
            r1[r4] = r9
            goto L56
        L101:
            int r3 = r4 + 1
            r1[r4] = r9
            goto L56
        L107:
            int r3 = r3 + r7
            goto L7
        L10a:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r4)
            return r0
    }

    private void scanStringSingleQuote() {
            r11 = this;
            int r0 = r11.bp
            r11.np = r0
            r0 = 0
            r11.hasSpecial = r0
        L7:
            char r1 = r11.next()
            r2 = 4
            r3 = 39
            if (r1 != r3) goto L16
            r11.token = r2
            r11.next()
            return
        L16:
            java.lang.String r4 = "unclosed single-quote string"
            r5 = 26
            if (r1 != r5) goto L2c
            boolean r1 = r11.isEOF()
            if (r1 != 0) goto L26
            r11.putChar(r5)
            goto L7
        L26:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r4)
            throw r0
        L2c:
            r5 = 92
            r6 = 1
            if (r1 != r5) goto L133
            boolean r1 = r11.hasSpecial
            if (r1 != 0) goto L52
            r11.hasSpecial = r6
            int r1 = r11.sp
            char[] r7 = r11.sbuf
            int r8 = r7.length
            if (r1 <= r8) goto L48
            int r1 = r1 * 2
            char[] r1 = new char[r1]
            int r8 = r7.length
            java.lang.System.arraycopy(r7, r0, r1, r0, r8)
            r11.sbuf = r1
        L48:
            int r1 = r11.np
            int r1 = r1 + r6
            int r7 = r11.sp
            char[] r8 = r11.sbuf
            r11.copyTo(r1, r7, r8)
        L52:
            char r1 = r11.next()
            r7 = 34
            if (r1 == r7) goto L12e
            if (r1 == r3) goto L129
            r3 = 70
            if (r1 == r3) goto L122
            if (r1 == r5) goto L11d
            r3 = 98
            if (r1 == r3) goto L116
            r3 = 102(0x66, float:1.43E-43)
            if (r1 == r3) goto L122
            r3 = 110(0x6e, float:1.54E-43)
            if (r1 == r3) goto L10f
            r3 = 114(0x72, float:1.6E-43)
            if (r1 == r3) goto L108
            r3 = 120(0x78, float:1.68E-43)
            r5 = 16
            if (r1 == r3) goto Lf1
            r3 = 3
            r7 = 2
            switch(r1) {
                case 47: goto Lea;
                case 48: goto Le5;
                case 49: goto Le0;
                case 50: goto Ldb;
                case 51: goto Ld6;
                case 52: goto Ld1;
                case 53: goto Lcb;
                case 54: goto Lc5;
                case 55: goto Lbf;
                default: goto L7d;
            }
        L7d:
            switch(r1) {
                case 116: goto Lb8;
                case 117: goto L8f;
                case 118: goto L88;
                default: goto L80;
            }
        L80:
            r11.ch = r1
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r4)
            throw r0
        L88:
            r1 = 11
            r11.putChar(r1)
            goto L7
        L8f:
            java.lang.String r1 = new java.lang.String
            char r4 = r11.next()
            char r8 = r11.next()
            char r9 = r11.next()
            char r10 = r11.next()
            char[] r2 = new char[r2]
            r2[r0] = r4
            r2[r6] = r8
            r2[r7] = r9
            r2[r3] = r10
            r1.<init>(r2)
            int r1 = java.lang.Integer.parseInt(r1, r5)
            char r1 = (char) r1
            r11.putChar(r1)
            goto L7
        Lb8:
            r1 = 9
            r11.putChar(r1)
            goto L7
        Lbf:
            r1 = 7
            r11.putChar(r1)
            goto L7
        Lc5:
            r1 = 6
            r11.putChar(r1)
            goto L7
        Lcb:
            r1 = 5
            r11.putChar(r1)
            goto L7
        Ld1:
            r11.putChar(r2)
            goto L7
        Ld6:
            r11.putChar(r3)
            goto L7
        Ldb:
            r11.putChar(r7)
            goto L7
        Le0:
            r11.putChar(r6)
            goto L7
        Le5:
            r11.putChar(r0)
            goto L7
        Lea:
            r1 = 47
            r11.putChar(r1)
            goto L7
        Lf1:
            int[] r1 = com.alibaba.fastjson.parser.JSONLexerBase.digits
            char r2 = r11.next()
            r2 = r1[r2]
            int r2 = r2 * 16
            char r3 = r11.next()
            r1 = r1[r3]
            int r2 = r2 + r1
            char r1 = (char) r2
            r11.putChar(r1)
            goto L7
        L108:
            r1 = 13
            r11.putChar(r1)
            goto L7
        L10f:
            r1 = 10
            r11.putChar(r1)
            goto L7
        L116:
            r1 = 8
            r11.putChar(r1)
            goto L7
        L11d:
            r11.putChar(r5)
            goto L7
        L122:
            r1 = 12
            r11.putChar(r1)
            goto L7
        L129:
            r11.putChar(r3)
            goto L7
        L12e:
            r11.putChar(r7)
            goto L7
        L133:
            boolean r2 = r11.hasSpecial
            if (r2 != 0) goto L13e
            int r1 = r11.sp
            int r1 = r1 + r6
            r11.sp = r1
            goto L7
        L13e:
            int r2 = r11.sp
            char[] r3 = r11.sbuf
            int r4 = r3.length
            if (r2 != r4) goto L14a
            r11.putChar(r1)
            goto L7
        L14a:
            int r4 = r2 + 1
            r11.sp = r4
            r3[r2] = r1
            goto L7
    }

    public abstract java.lang.String addSymbol(int r1, int r2, int r3, com.alibaba.fastjson.parser.SymbolTable r4);

    protected abstract void arrayCopy(int r1, char[] r2, int r3, int r4);

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public abstract byte[] bytesValue();

    protected abstract boolean charArrayCompare(char[] r1);

    public abstract char charAt(int r1);

    @Override // com.alibaba.fastjson.parser.JSONLexer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            char[] r0 = r3.sbuf
            int r1 = r0.length
            r2 = 8192(0x2000, float:1.148E-41)
            if (r1 > r2) goto Lc
            java.lang.ThreadLocal<char[]> r1 = com.alibaba.fastjson.parser.JSONLexerBase.SBUF_LOCAL
            r1.set(r0)
        Lc:
            r0 = 0
            r3.sbuf = r0
            return
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public void config(com.alibaba.fastjson.parser.Feature r2, boolean r3) {
            r1 = this;
            int r0 = r1.features
            int r2 = com.alibaba.fastjson.parser.Feature.config(r0, r2, r3)
            r1.features = r2
            com.alibaba.fastjson.parser.Feature r3 = com.alibaba.fastjson.parser.Feature.InitStringFieldAsEmpty
            int r3 = r3.mask
            r2 = r2 & r3
            if (r2 == 0) goto L13
            java.lang.String r2 = ""
            r1.stringDefaultValue = r2
        L13:
            return
    }

    protected abstract void copyTo(int r1, int r2, char[] r3);

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final java.lang.Number decimalValue(boolean r3) {
            r2 = this;
            int r0 = r2.np
            int r1 = r2.sp
            int r0 = r0 + r1
            int r0 = r0 + (-1)
            char r0 = r2.charAt(r0)
            r1 = 70
            if (r0 != r1) goto L1e
            java.lang.String r3 = r2.numberString()     // Catch: java.lang.NumberFormatException -> L1c
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.NumberFormatException -> L1c
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L1c
            return r3
        L1c:
            r3 = move-exception
            goto L3f
        L1e:
            r1 = 68
            if (r0 != r1) goto L2f
            java.lang.String r3 = r2.numberString()     // Catch: java.lang.NumberFormatException -> L1c
            double r0 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.NumberFormatException -> L1c
            java.lang.Double r3 = java.lang.Double.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L1c
            return r3
        L2f:
            if (r3 == 0) goto L36
            java.math.BigDecimal r3 = r2.decimalValue()     // Catch: java.lang.NumberFormatException -> L1c
            return r3
        L36:
            double r0 = r2.doubleValue()     // Catch: java.lang.NumberFormatException -> L1c
            java.lang.Double r3 = java.lang.Double.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L1c
            return r3
        L3f:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = ", "
            r1.append(r3)
            java.lang.String r3 = r2.info()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public abstract java.math.BigDecimal decimalValue();

    public double doubleValue() {
            r2 = this;
            java.lang.String r0 = r2.numberString()
            double r0 = java.lang.Double.parseDouble(r0)
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public float floatValue() {
            r4 = this;
            java.lang.String r0 = r4.numberString()
            float r1 = java.lang.Float.parseFloat(r0)
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L13
            r2 = 2139095040(0x7f800000, float:Infinity)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 != 0) goto L38
        L13:
            r2 = 0
            char r2 = r0.charAt(r2)
            r3 = 48
            if (r2 <= r3) goto L38
            r3 = 57
            if (r2 <= r3) goto L21
            goto L38
        L21:
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "float overflow : "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L38:
            return r1
    }

    public java.util.Calendar getCalendar() {
            r1 = this;
            java.util.Calendar r0 = r1.calendar
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final char getCurrent() {
            r1 = this;
            char r0 = r1.ch
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public java.util.Locale getLocale() {
            r1 = this;
            java.util.Locale r0 = r1.locale
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public java.util.TimeZone getTimeZone() {
            r1 = this;
            java.util.TimeZone r0 = r1.timeZone
            return r0
    }

    public abstract int indexOf(char r1, int r2);

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public java.lang.String info() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final int intValue() {
            r13 = this;
            int r0 = r13.np
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L8
            r13.np = r2
        L8:
            int r0 = r13.np
            int r1 = r13.sp
            int r1 = r1 + r0
            char r3 = r13.charAt(r0)
            r4 = 45
            r5 = 1
            if (r3 != r4) goto L1c
            int r0 = r0 + 1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1
            goto L20
        L1c:
            r3 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r4 = 0
        L20:
            if (r0 >= r1) goto L2e
            int r2 = r0 + 1
            char r0 = r13.charAt(r0)
            int r0 = r0 + (-48)
            int r0 = -r0
            r12 = r2
            r2 = r0
            r0 = r12
        L2e:
            if (r0 >= r1) goto L6b
            int r6 = r0 + 1
            char r0 = r13.charAt(r0)
            r7 = 76
            if (r0 == r7) goto L6a
            r7 = 83
            if (r0 == r7) goto L6a
            r7 = 66
            if (r0 != r7) goto L43
            goto L6a
        L43:
            int r0 = r0 + (-48)
            long r7 = (long) r2
            r9 = -214748364(0xfffffffff3333334, double:NaN)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L60
            int r2 = r2 * 10
            int r7 = r3 + r0
            if (r2 < r7) goto L56
            int r2 = r2 - r0
            r0 = r6
            goto L2e
        L56:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L60:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L6a:
            r0 = r6
        L6b:
            if (r4 == 0) goto L7d
            int r1 = r13.np
            int r1 = r1 + r5
            if (r0 <= r1) goto L73
            return r2
        L73:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L7d:
            int r0 = -r2
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final java.lang.Number integerValue() throws java.lang.NumberFormatException {
            r18 = this;
            r0 = r18
            int r1 = r0.np
            r2 = -1
            r3 = 0
            if (r1 != r2) goto La
            r0.np = r3
        La:
            int r1 = r0.np
            int r2 = r0.sp
            int r2 = r2 + r1
            int r4 = r2 + (-1)
            char r4 = r0.charAt(r4)
            r5 = 83
            r6 = 76
            r7 = 66
            if (r4 == r7) goto L2e
            if (r4 == r6) goto L29
            if (r4 == r5) goto L24
            r4 = 32
            goto L32
        L24:
            int r2 = r2 + (-1)
            r4 = 83
            goto L32
        L29:
            int r2 = r2 + (-1)
            r4 = 76
            goto L32
        L2e:
            int r2 = r2 + (-1)
            r4 = 66
        L32:
            int r8 = r0.np
            char r8 = r0.charAt(r8)
            r9 = 45
            r10 = 1
            if (r8 != r9) goto L43
            int r1 = r1 + 1
            r8 = -9223372036854775808
            r3 = 1
            goto L48
        L43:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            if (r1 >= r2) goto L56
            int r11 = r1 + 1
            char r1 = r0.charAt(r1)
            int r1 = r1 + (-48)
            int r1 = -r1
            long r12 = (long) r1
        L54:
            r1 = r11
            goto L58
        L56:
            r12 = 0
        L58:
            if (r1 >= r2) goto L8c
            int r11 = r1 + 1
            char r1 = r0.charAt(r1)
            int r1 = r1 + (-48)
            r14 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L75
            java.math.BigInteger r1 = new java.math.BigInteger
            java.lang.String r2 = r0.numberString()
            r1.<init>(r2)
            return r1
        L75:
            r14 = 10
            long r12 = r12 * r14
            long r14 = (long) r1
            long r16 = r8 + r14
            int r1 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r1 >= 0) goto L8a
            java.math.BigInteger r1 = new java.math.BigInteger
            java.lang.String r2 = r0.numberString()
            r1.<init>(r2)
            return r1
        L8a:
            long r12 = r12 - r14
            goto L54
        L8c:
            if (r3 == 0) goto Lc3
            int r2 = r0.np
            int r2 = r2 + r10
            if (r1 <= r2) goto Lb9
            r1 = -2147483648(0xffffffff80000000, double:NaN)
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 < 0) goto Lb4
            if (r4 == r6) goto Lb4
            if (r4 != r5) goto La5
            int r1 = (int) r12
            short r1 = (short) r1
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            return r1
        La5:
            if (r4 != r7) goto Lae
            int r1 = (int) r12
            byte r1 = (byte) r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
        Lae:
            int r1 = (int) r12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        Lb4:
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            return r1
        Lb9:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = r0.numberString()
            r1.<init>(r2)
            throw r1
        Lc3:
            long r1 = -r12
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 > 0) goto Le5
            if (r4 == r6) goto Le5
            if (r4 != r5) goto Ld6
            int r2 = (int) r1
            short r1 = (short) r2
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            return r1
        Ld6:
            if (r4 != r7) goto Ldf
            int r2 = (int) r1
            byte r1 = (byte) r2
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
        Ldf:
            int r2 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            return r1
        Le5:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public boolean isBlankInput() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            char r2 = r4.charAt(r1)
            r3 = 26
            if (r2 != r3) goto L10
            r0 = 20
            r4.token = r0
            r0 = 1
            return r0
        L10:
            boolean r2 = isWhitespace(r2)
            if (r2 != 0) goto L17
            return r0
        L17:
            int r1 = r1 + 1
            goto L2
    }

    public abstract boolean isEOF();

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final boolean isEnabled(int r2) {
            r1 = this;
            int r0 = r1.features
            r2 = r2 & r0
            if (r2 == 0) goto L7
            r2 = 1
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final boolean isEnabled(int r2, int r3) {
            r1 = this;
            int r0 = r1.features
            r0 = r0 & r3
            if (r0 != 0) goto Lb
            r2 = r2 & r3
            if (r2 == 0) goto L9
            goto Lb
        L9:
            r2 = 0
            return r2
        Lb:
            r2 = 1
            return r2
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final boolean isEnabled(com.alibaba.fastjson.parser.Feature r1) {
            r0 = this;
            int r1 = r1.mask
            boolean r1 = r0.isEnabled(r1)
            return r1
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final boolean isRef() {
            r5 = this;
            int r0 = r5.sp
            r1 = 0
            r2 = 4
            if (r0 == r2) goto L7
            return r1
        L7:
            int r0 = r5.np
            r3 = 1
            int r0 = r0 + r3
            char r0 = r5.charAt(r0)
            r4 = 36
            if (r0 != r4) goto L37
            int r0 = r5.np
            int r0 = r0 + 2
            char r0 = r5.charAt(r0)
            r4 = 114(0x72, float:1.6E-43)
            if (r0 != r4) goto L37
            int r0 = r5.np
            int r0 = r0 + 3
            char r0 = r5.charAt(r0)
            r4 = 101(0x65, float:1.42E-43)
            if (r0 != r4) goto L37
            int r0 = r5.np
            int r0 = r0 + r2
            char r0 = r5.charAt(r0)
            r2 = 102(0x66, float:1.43E-43)
            if (r0 != r2) goto L37
            return r3
        L37:
            return r1
    }

    protected void lexError(java.lang.String r1, java.lang.Object... r2) {
            r0 = this;
            r1 = 1
            r0.token = r1
            return
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final long longValue() throws java.lang.NumberFormatException {
            r13 = this;
            int r0 = r13.np
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L8
            r13.np = r2
        L8:
            int r0 = r13.np
            int r1 = r13.sp
            int r1 = r1 + r0
            char r3 = r13.charAt(r0)
            r4 = 45
            r5 = 1
            if (r3 != r4) goto L1d
            int r0 = r0 + 1
            r2 = -9223372036854775808
            r3 = r2
            r2 = 1
            goto L22
        L1d:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L22:
            if (r0 >= r1) goto L30
            int r6 = r0 + 1
            char r0 = r13.charAt(r0)
            int r0 = r0 + (-48)
            int r0 = -r0
            long r7 = (long) r0
        L2e:
            r0 = r6
            goto L32
        L30:
            r7 = 0
        L32:
            if (r0 >= r1) goto L74
            int r6 = r0 + 1
            char r0 = r13.charAt(r0)
            r9 = 76
            if (r0 == r9) goto L73
            r9 = 83
            if (r0 == r9) goto L73
            r9 = 66
            if (r0 != r9) goto L47
            goto L73
        L47:
            int r0 = r0 + (-48)
            r9 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L69
            r9 = 10
            long r7 = r7 * r9
            long r9 = (long) r0
            long r11 = r3 + r9
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 < 0) goto L5f
            long r7 = r7 - r9
            goto L2e
        L5f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L69:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L73:
            r0 = r6
        L74:
            if (r2 == 0) goto L86
            int r1 = r13.np
            int r1 = r1 + r5
            if (r0 <= r1) goto L7c
            return r7
        L7c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L86:
            long r0 = -r7
            return r0
    }

    public final boolean matchField(char[] r4) {
            r3 = this;
            boolean r0 = r3.charArrayCompare(r4)
            if (r0 != 0) goto L8
            r4 = 0
            return r4
        L8:
            int r0 = r3.bp
            int r4 = r4.length
            int r0 = r0 + r4
            r3.bp = r0
            char r4 = r3.charAt(r0)
            r3.ch = r4
            r0 = 123(0x7b, float:1.72E-43)
            r1 = 1
            if (r4 != r0) goto L21
            r3.next()
            r4 = 12
            r3.token = r4
            goto L66
        L21:
            r0 = 91
            if (r4 != r0) goto L2d
            r3.next()
            r4 = 14
            r3.token = r4
            goto L66
        L2d:
            r2 = 83
            if (r4 != r2) goto L63
            int r4 = r3.bp
            int r4 = r4 + r1
            char r4 = r3.charAt(r4)
            r2 = 101(0x65, float:1.42E-43)
            if (r4 != r2) goto L63
            int r4 = r3.bp
            int r4 = r4 + 2
            char r4 = r3.charAt(r4)
            r2 = 116(0x74, float:1.63E-43)
            if (r4 != r2) goto L63
            int r4 = r3.bp
            int r4 = r4 + 3
            char r4 = r3.charAt(r4)
            if (r4 != r0) goto L63
            int r4 = r3.bp
            int r4 = r4 + 3
            r3.bp = r4
            char r4 = r3.charAt(r4)
            r3.ch = r4
            r4 = 21
            r3.token = r4
            goto L66
        L63:
            r3.nextToken()
        L66:
            return r1
    }

    public final int matchStat() {
            r1 = this;
            int r0 = r1.matchStat
            return r0
    }

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

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public abstract char next();

    public final void nextIdent() {
            r2 = this;
        L0:
            char r0 = r2.ch
            boolean r0 = isWhitespace(r0)
            if (r0 == 0) goto Lc
            r2.next()
            goto L0
        Lc:
            char r0 = r2.ch
            r1 = 95
            if (r0 == r1) goto L1d
            boolean r0 = java.lang.Character.isLetter(r0)
            if (r0 == 0) goto L19
            goto L1d
        L19:
            r2.nextToken()
            return
        L1d:
            r2.scanIdent()
            return
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void nextToken() {
            r3 = this;
            r0 = 0
            r3.sp = r0
        L3:
            int r1 = r3.bp
            r3.pos = r1
            char r1 = r3.ch
            r2 = 47
            if (r1 != r2) goto L11
            r3.skipComment()
            goto L3
        L11:
            r2 = 34
            if (r1 != r2) goto L19
            r3.scanString()
            return
        L19:
            r2 = 44
            if (r1 != r2) goto L25
            r3.next()
            r0 = 16
            r3.token = r0
            return
        L25:
            r2 = 48
            if (r1 < r2) goto L31
            r2 = 57
            if (r1 > r2) goto L31
            r3.scanNumber()
            return
        L31:
            r2 = 45
            if (r1 != r2) goto L39
            r3.scanNumber()
            return
        L39:
            switch(r1) {
                case 8: goto Lf1;
                case 9: goto Lf1;
                case 10: goto Lf1;
                case 12: goto Lf1;
                case 13: goto Lf1;
                case 32: goto Lf1;
                case 39: goto Ldd;
                case 40: goto Ld5;
                case 41: goto Lcd;
                case 43: goto Lc6;
                case 46: goto Lbe;
                case 58: goto Lb6;
                case 59: goto Lae;
                case 78: goto Laa;
                case 83: goto Laa;
                case 84: goto Laa;
                case 91: goto La2;
                case 93: goto L9a;
                case 102: goto L96;
                case 110: goto L92;
                case 116: goto L8e;
                case 117: goto Laa;
                case 120: goto L8a;
                case 123: goto L82;
                case 125: goto L7a;
                default: goto L3c;
            }
        L3c:
            boolean r1 = r3.isEOF()
            if (r1 == 0) goto L59
            int r0 = r3.token
            r1 = 20
            if (r0 == r1) goto L51
            r3.token = r1
            int r0 = r3.eofPos
            r3.bp = r0
            r3.pos = r0
            return
        L51:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "EOF error"
            r0.<init>(r1)
            throw r0
        L59:
            char r1 = r3.ch
            r2 = 31
            if (r1 <= r2) goto L76
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 != r2) goto L64
            goto L76
        L64:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r1
            java.lang.String r0 = "illegal.char"
            r3.lexError(r0, r2)
            r3.next()
            return
        L76:
            r3.next()
            goto L3
        L7a:
            r3.next()
            r0 = 13
            r3.token = r0
            return
        L82:
            r3.next()
            r0 = 12
            r3.token = r0
            return
        L8a:
            r3.scanHex()
            return
        L8e:
            r3.scanTrue()
            return
        L92:
            r3.scanNullOrNew()
            return
        L96:
            r3.scanFalse()
            return
        L9a:
            r3.next()
            r0 = 15
            r3.token = r0
            return
        La2:
            r3.next()
            r0 = 14
            r3.token = r0
            return
        Laa:
            r3.scanIdent()
            return
        Lae:
            r3.next()
            r0 = 24
            r3.token = r0
            return
        Lb6:
            r3.next()
            r0 = 17
            r3.token = r0
            return
        Lbe:
            r3.next()
            r0 = 25
            r3.token = r0
            return
        Lc6:
            r3.next()
            r3.scanNumber()
            return
        Lcd:
            r3.next()
            r0 = 11
            r3.token = r0
            return
        Ld5:
            r3.next()
            r0 = 10
            r3.token = r0
            return
        Ldd:
            com.alibaba.fastjson.parser.Feature r0 = com.alibaba.fastjson.parser.Feature.AllowSingleQuotes
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto Le9
            r3.scanStringSingleQuote()
            return
        Le9:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "Feature.AllowSingleQuotes is false"
            r0.<init>(r1)
            throw r0
        Lf1:
            r3.next()
            goto L3
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void nextToken(int r10) {
            r9 = this;
            r0 = 0
            r9.sp = r0
        L3:
            r0 = 2
            r1 = 57
            r2 = 48
            r3 = 34
            r4 = 13
            r5 = 123(0x7b, float:1.72E-43)
            r6 = 14
            r7 = 91
            r8 = 12
            if (r10 == r0) goto Lb4
            r0 = 4
            if (r10 == r0) goto L8c
            if (r10 == r8) goto L7a
            r0 = 18
            if (r10 == r0) goto L76
            r0 = 26
            r1 = 20
            if (r10 == r1) goto L6f
            r2 = 15
            r3 = 93
            switch(r10) {
                case 14: goto L5d;
                case 15: goto L53;
                case 16: goto L2e;
                default: goto L2c;
            }
        L2c:
            goto Ldc
        L2e:
            char r5 = r9.ch
            r6 = 44
            if (r5 != r6) goto L3c
            r10 = 16
            r9.token = r10
            r9.next()
            return
        L3c:
            r6 = 125(0x7d, float:1.75E-43)
            if (r5 != r6) goto L46
            r9.token = r4
            r9.next()
            return
        L46:
            if (r5 != r3) goto L4e
            r9.token = r2
            r9.next()
            return
        L4e:
            if (r5 != r0) goto Ldc
            r9.token = r1
            return
        L53:
            char r5 = r9.ch
            if (r5 != r3) goto L6f
            r9.token = r2
            r9.next()
            return
        L5d:
            char r0 = r9.ch
            if (r0 != r7) goto L67
            r9.token = r6
            r9.next()
            return
        L67:
            if (r0 != r5) goto Ldc
            r9.token = r8
            r9.next()
            return
        L6f:
            char r2 = r9.ch
            if (r2 != r0) goto Ldc
            r9.token = r1
            return
        L76:
            r9.nextIdent()
            return
        L7a:
            char r0 = r9.ch
            if (r0 != r5) goto L84
            r9.token = r8
            r9.next()
            return
        L84:
            if (r0 != r7) goto Ldc
            r9.token = r6
            r9.next()
            return
        L8c:
            char r0 = r9.ch
            if (r0 != r3) goto L98
            int r10 = r9.bp
            r9.pos = r10
            r9.scanString()
            return
        L98:
            if (r0 < r2) goto La4
            if (r0 > r1) goto La4
            int r10 = r9.bp
            r9.pos = r10
            r9.scanNumber()
            return
        La4:
            if (r0 != r7) goto Lac
            r9.token = r6
            r9.next()
            return
        Lac:
            if (r0 != r5) goto Ldc
            r9.token = r8
            r9.next()
            return
        Lb4:
            char r0 = r9.ch
            if (r0 < r2) goto Lc2
            if (r0 > r1) goto Lc2
            int r10 = r9.bp
            r9.pos = r10
            r9.scanNumber()
            return
        Lc2:
            if (r0 != r3) goto Lcc
            int r10 = r9.bp
            r9.pos = r10
            r9.scanString()
            return
        Lcc:
            if (r0 != r7) goto Ld4
            r9.token = r6
            r9.next()
            return
        Ld4:
            if (r0 != r5) goto Ldc
            r9.token = r8
            r9.next()
            return
        Ldc:
            char r0 = r9.ch
            r1 = 32
            if (r0 == r1) goto Lf7
            r1 = 10
            if (r0 == r1) goto Lf7
            if (r0 == r4) goto Lf7
            r1 = 9
            if (r0 == r1) goto Lf7
            if (r0 == r8) goto Lf7
            r1 = 8
            if (r0 != r1) goto Lf3
            goto Lf7
        Lf3:
            r9.nextToken()
            return
        Lf7:
            r9.next()
            goto L3
    }

    public final void nextTokenWithChar(char r4) {
            r3 = this;
            r0 = 0
            r3.sp = r0
        L3:
            char r0 = r3.ch
            if (r0 != r4) goto Le
            r3.next()
            r3.nextToken()
            return
        Le:
            r1 = 32
            if (r0 == r1) goto L54
            r1 = 10
            if (r0 == r1) goto L54
            r1 = 13
            if (r0 == r1) goto L54
            r1 = 9
            if (r0 == r1) goto L54
            r1 = 12
            if (r0 == r1) goto L54
            r1 = 8
            if (r0 != r1) goto L27
            goto L54
        L27:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not match "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " - "
            r1.append(r4)
            char r4 = r3.ch
            r1.append(r4)
            java.lang.String r4 = ", info : "
            r1.append(r4)
            java.lang.String r4 = r3.info()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L54:
            r3.next()
            goto L3
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void nextTokenWithColon() {
            r1 = this;
            r0 = 58
            r1.nextTokenWithChar(r0)
            return
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void nextTokenWithColon(int r1) {
            r0 = this;
            r1 = 58
            r0.nextTokenWithChar(r1)
            return
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public abstract java.lang.String numberString();

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final int pos() {
            r1 = this;
            int r0 = r1.pos
            return r0
    }

    protected final void putChar(char r5) {
            r4 = this;
            int r0 = r4.sp
            char[] r1 = r4.sbuf
            int r2 = r1.length
            if (r0 != r2) goto L13
            int r0 = r1.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            int r2 = r1.length
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r0, r3, r2)
            r4.sbuf = r0
        L13:
            char[] r0 = r4.sbuf
            int r1 = r4.sp
            int r2 = r1 + 1
            r4.sp = r2
            r0[r1] = r5
            return
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void resetStringPosition() {
            r1 = this;
            r0 = 0
            r1.sp = r0
            return
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public boolean scanBoolean(char r10) {
            r9 = this;
            r0 = 0
            r9.matchStat = r0
            int r1 = r9.bp
            char r1 = r9.charAt(r1)
            r2 = 116(0x74, float:1.63E-43)
            r3 = 5
            r4 = 101(0x65, float:1.42E-43)
            r5 = -1
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 != r2) goto L40
            int r1 = r9.bp
            int r1 = r1 + r8
            char r1 = r9.charAt(r1)
            r2 = 114(0x72, float:1.6E-43)
            if (r1 != r2) goto L3d
            int r1 = r9.bp
            int r1 = r1 + r7
            char r1 = r9.charAt(r1)
            r2 = 117(0x75, float:1.64E-43)
            if (r1 != r2) goto L3d
            int r1 = r9.bp
            int r1 = r1 + r6
            char r1 = r9.charAt(r1)
            if (r1 != r4) goto L3d
            int r0 = r9.bp
            int r0 = r0 + 4
            char r1 = r9.charAt(r0)
            r0 = 1
            goto L96
        L3d:
            r9.matchStat = r5
            return r0
        L40:
            r2 = 102(0x66, float:1.43E-43)
            if (r1 != r2) goto L7b
            int r1 = r9.bp
            int r1 = r1 + r8
            char r1 = r9.charAt(r1)
            r2 = 97
            if (r1 != r2) goto L78
            int r1 = r9.bp
            int r1 = r1 + r7
            char r1 = r9.charAt(r1)
            r2 = 108(0x6c, float:1.51E-43)
            if (r1 != r2) goto L78
            int r1 = r9.bp
            int r1 = r1 + r6
            char r1 = r9.charAt(r1)
            r2 = 115(0x73, float:1.61E-43)
            if (r1 != r2) goto L78
            int r1 = r9.bp
            int r1 = r1 + 4
            char r1 = r9.charAt(r1)
            if (r1 != r4) goto L78
            int r1 = r9.bp
            int r1 = r1 + r3
            char r1 = r9.charAt(r1)
            r3 = 6
            goto L96
        L78:
            r9.matchStat = r5
            return r0
        L7b:
            r2 = 49
            if (r1 != r2) goto L89
            int r0 = r9.bp
            int r0 = r0 + r8
            char r1 = r9.charAt(r0)
            r0 = 1
        L87:
            r3 = 2
            goto L96
        L89:
            r2 = 48
            if (r1 != r2) goto L95
            int r1 = r9.bp
            int r1 = r1 + r8
            char r1 = r9.charAt(r1)
            goto L87
        L95:
            r3 = 1
        L96:
            if (r1 != r10) goto La6
            int r10 = r9.bp
            int r10 = r10 + r3
            r9.bp = r10
            char r10 = r9.charAt(r10)
            r9.ch = r10
            r9.matchStat = r6
            return r0
        La6:
            boolean r1 = isWhitespace(r1)
            if (r1 == 0) goto Lb7
            int r1 = r9.bp
            int r2 = r3 + 1
            int r1 = r1 + r3
            char r1 = r9.charAt(r1)
            r3 = r2
            goto L96
        Lb7:
            r9.matchStat = r5
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final double scanDouble(char r11) {
            r10 = this;
            r0 = 0
            r10.matchStat = r0
            int r0 = r10.bp
            char r0 = r10.charAt(r0)
            r1 = 0
            r3 = -1
            r4 = 48
            if (r0 < r4) goto L6e
            r5 = 57
            if (r0 > r5) goto L6e
            r0 = 1
            r6 = 1
        L16:
            int r7 = r10.bp
            int r8 = r6 + 1
            int r7 = r7 + r6
            char r7 = r10.charAt(r7)
            if (r7 < r4) goto L25
            if (r7 > r5) goto L25
            r6 = r8
            goto L16
        L25:
            r9 = 46
            if (r7 != r9) goto L48
            int r7 = r10.bp
            int r6 = r6 + 2
            int r7 = r7 + r8
            char r7 = r10.charAt(r7)
            if (r7 < r4) goto L45
            if (r7 > r5) goto L45
        L36:
            int r1 = r10.bp
            int r8 = r6 + 1
            int r1 = r1 + r6
            char r7 = r10.charAt(r1)
            if (r7 < r4) goto L48
            if (r7 > r5) goto L48
            r6 = r8
            goto L36
        L45:
            r10.matchStat = r3
            return r1
        L48:
            int r1 = r10.bp
            int r2 = r1 + r8
            int r2 = r2 - r1
            int r2 = r2 - r0
            java.lang.String r0 = r10.subString(r1, r2)
            double r0 = java.lang.Double.parseDouble(r0)
            if (r7 != r11) goto L6b
            int r11 = r10.bp
            int r11 = r11 + r8
            r10.bp = r11
            char r11 = r10.charAt(r11)
            r10.ch = r11
            r11 = 3
            r10.matchStat = r11
            r11 = 16
            r10.token = r11
            return r0
        L6b:
            r10.matchStat = r3
            return r0
        L6e:
            r10.matchStat = r3
            return r1
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public java.lang.Enum<?> scanEnum(java.lang.Class<?> r1, com.alibaba.fastjson.parser.SymbolTable r2, char r3) {
            r0 = this;
            java.lang.String r2 = r0.scanSymbolWithSeperator(r2, r3)
            if (r2 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Enum r1 = java.lang.Enum.valueOf(r1, r2)
            return r1
    }

    public final void scanFalse() {
            r3 = this;
            char r0 = r3.ch
            r1 = 102(0x66, float:1.43E-43)
            java.lang.String r2 = "error parse false"
            if (r0 != r1) goto L86
            r3.next()
            char r0 = r3.ch
            r1 = 97
            if (r0 != r1) goto L80
            r3.next()
            char r0 = r3.ch
            r1 = 108(0x6c, float:1.51E-43)
            if (r0 != r1) goto L7a
            r3.next()
            char r0 = r3.ch
            r1 = 115(0x73, float:1.61E-43)
            if (r0 != r1) goto L74
            r3.next()
            char r0 = r3.ch
            r1 = 101(0x65, float:1.42E-43)
            if (r0 != r1) goto L6e
            r3.next()
            char r0 = r3.ch
            r1 = 32
            if (r0 == r1) goto L6a
            r1 = 44
            if (r0 == r1) goto L6a
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 == r1) goto L6a
            r1 = 93
            if (r0 == r1) goto L6a
            r1 = 10
            if (r0 == r1) goto L6a
            r1 = 13
            if (r0 == r1) goto L6a
            r1 = 9
            if (r0 == r1) goto L6a
            r1 = 26
            if (r0 == r1) goto L6a
            r1 = 12
            if (r0 == r1) goto L6a
            r1 = 8
            if (r0 == r1) goto L6a
            r1 = 58
            if (r0 == r1) goto L6a
            r1 = 47
            if (r0 != r1) goto L62
            goto L6a
        L62:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "scan false error"
            r0.<init>(r1)
            throw r0
        L6a:
            r0 = 7
            r3.token = r0
            return
        L6e:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r2)
            throw r0
        L74:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r2)
            throw r0
        L7a:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r2)
            throw r0
        L80:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r2)
            throw r0
        L86:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r2)
            throw r0
    }

    public boolean scanFieldBoolean(char[] r12) {
            r11 = this;
            r0 = 0
            r11.matchStat = r0
            boolean r1 = r11.charArrayCompare(r12)
            if (r1 != 0) goto Ld
            r12 = -2
            r11.matchStat = r12
            return r0
        Ld:
            int r12 = r12.length
            int r1 = r11.bp
            int r2 = r12 + 1
            int r1 = r1 + r12
            char r1 = r11.charAt(r1)
            r3 = 116(0x74, float:1.63E-43)
            r4 = 101(0x65, float:1.42E-43)
            r5 = 4
            r6 = 1
            r7 = -1
            if (r1 != r3) goto L4f
            int r1 = r11.bp
            int r3 = r12 + 2
            int r1 = r1 + r2
            char r1 = r11.charAt(r1)
            r2 = 114(0x72, float:1.6E-43)
            if (r1 == r2) goto L30
            r11.matchStat = r7
            return r0
        L30:
            int r1 = r11.bp
            int r2 = r12 + 3
            int r1 = r1 + r3
            char r1 = r11.charAt(r1)
            r3 = 117(0x75, float:1.64E-43)
            if (r1 == r3) goto L40
            r11.matchStat = r7
            return r0
        L40:
            int r1 = r11.bp
            int r12 = r12 + r5
            int r1 = r1 + r2
            char r1 = r11.charAt(r1)
            if (r1 == r4) goto L4d
            r11.matchStat = r7
            return r0
        L4d:
            r1 = 1
            goto L92
        L4f:
            r3 = 102(0x66, float:1.43E-43)
            if (r1 != r3) goto L10e
            int r1 = r11.bp
            int r3 = r12 + 2
            int r1 = r1 + r2
            char r1 = r11.charAt(r1)
            r2 = 97
            if (r1 == r2) goto L63
            r11.matchStat = r7
            return r0
        L63:
            int r1 = r11.bp
            int r2 = r12 + 3
            int r1 = r1 + r3
            char r1 = r11.charAt(r1)
            r3 = 108(0x6c, float:1.51E-43)
            if (r1 == r3) goto L73
            r11.matchStat = r7
            return r0
        L73:
            int r1 = r11.bp
            int r3 = r12 + 4
            int r1 = r1 + r2
            char r1 = r11.charAt(r1)
            r2 = 115(0x73, float:1.61E-43)
            if (r1 == r2) goto L83
            r11.matchStat = r7
            return r0
        L83:
            int r1 = r11.bp
            int r12 = r12 + 5
            int r1 = r1 + r3
            char r1 = r11.charAt(r1)
            if (r1 == r4) goto L91
            r11.matchStat = r7
            return r0
        L91:
            r1 = 0
        L92:
            int r2 = r11.bp
            int r3 = r12 + 1
            int r2 = r2 + r12
            char r2 = r11.charAt(r2)
            r4 = 16
            r8 = 44
            if (r2 != r8) goto Lb2
            int r12 = r11.bp
            int r12 = r12 + r3
            r11.bp = r12
            char r12 = r11.charAt(r12)
            r11.ch = r12
            r12 = 3
            r11.matchStat = r12
            r11.token = r4
            return r1
        Lb2:
            r9 = 125(0x7d, float:1.75E-43)
            if (r2 != r9) goto L10b
            int r2 = r11.bp
            int r10 = r12 + 2
            int r2 = r2 + r3
            char r2 = r11.charAt(r2)
            if (r2 != r8) goto Lcf
            r11.token = r4
            int r12 = r11.bp
            int r12 = r12 + r10
            r11.bp = r12
            char r12 = r11.charAt(r12)
            r11.ch = r12
            goto L105
        Lcf:
            r3 = 93
            if (r2 != r3) goto Le3
            r12 = 15
            r11.token = r12
            int r12 = r11.bp
            int r12 = r12 + r10
            r11.bp = r12
            char r12 = r11.charAt(r12)
            r11.ch = r12
            goto L105
        Le3:
            if (r2 != r9) goto Lf5
            r12 = 13
            r11.token = r12
            int r12 = r11.bp
            int r12 = r12 + r10
            r11.bp = r12
            char r12 = r11.charAt(r12)
            r11.ch = r12
            goto L105
        Lf5:
            r3 = 26
            if (r2 != r3) goto L108
            r0 = 20
            r11.token = r0
            int r0 = r11.bp
            int r12 = r12 + r6
            int r0 = r0 + r12
            r11.bp = r0
            r11.ch = r3
        L105:
            r11.matchStat = r5
            return r1
        L108:
            r11.matchStat = r7
            return r0
        L10b:
            r11.matchStat = r7
            return r0
        L10e:
            r11.matchStat = r7
            return r0
    }

    public final double scanFieldDouble(char[] r11) {
            r10 = this;
            r0 = 0
            r10.matchStat = r0
            boolean r0 = r10.charArrayCompare(r11)
            r1 = 0
            if (r0 != 0) goto Lf
            r11 = -2
            r10.matchStat = r11
            return r1
        Lf:
            int r0 = r11.length
            int r3 = r10.bp
            int r4 = r0 + 1
            int r3 = r3 + r0
            char r0 = r10.charAt(r3)
            r3 = -1
            r5 = 48
            if (r0 < r5) goto L10a
            r6 = 57
            if (r0 > r6) goto L10a
        L22:
            int r0 = r10.bp
            int r7 = r4 + 1
            int r0 = r0 + r4
            char r0 = r10.charAt(r0)
            if (r0 < r5) goto L31
            if (r0 > r6) goto L31
            r4 = r7
            goto L22
        L31:
            r8 = 46
            if (r0 != r8) goto L54
            int r0 = r10.bp
            int r4 = r4 + 2
            int r0 = r0 + r7
            char r0 = r10.charAt(r0)
            if (r0 < r5) goto L51
            if (r0 > r6) goto L51
        L42:
            int r0 = r10.bp
            int r7 = r4 + 1
            int r0 = r0 + r4
            char r0 = r10.charAt(r0)
            if (r0 < r5) goto L54
            if (r0 > r6) goto L54
            r4 = r7
            goto L42
        L51:
            r10.matchStat = r3
            return r1
        L54:
            r4 = 101(0x65, float:1.42E-43)
            if (r0 == r4) goto L5c
            r4 = 69
            if (r0 != r4) goto L87
        L5c:
            int r0 = r10.bp
            int r4 = r7 + 1
            int r0 = r0 + r7
            char r0 = r10.charAt(r0)
            r8 = 43
            if (r0 == r8) goto L70
            r8 = 45
            if (r0 != r8) goto L6e
            goto L70
        L6e:
            r7 = r4
            goto L79
        L70:
            int r0 = r10.bp
            int r7 = r7 + 2
            int r0 = r0 + r4
            char r0 = r10.charAt(r0)
        L79:
            if (r0 < r5) goto L87
            if (r0 > r6) goto L87
            int r0 = r10.bp
            int r4 = r7 + 1
            int r0 = r0 + r7
            char r0 = r10.charAt(r0)
            goto L6e
        L87:
            int r4 = r10.bp
            int r11 = r11.length
            int r11 = r11 + r4
            int r4 = r4 + r7
            int r4 = r4 - r11
            int r4 = r4 + (-1)
            java.lang.String r11 = r10.subString(r11, r4)
            double r4 = java.lang.Double.parseDouble(r11)
            r11 = 16
            r6 = 44
            if (r0 != r6) goto Lae
            int r0 = r10.bp
            int r0 = r0 + r7
            r10.bp = r0
            char r0 = r10.charAt(r0)
            r10.ch = r0
            r0 = 3
            r10.matchStat = r0
            r10.token = r11
            return r4
        Lae:
            r8 = 125(0x7d, float:1.75E-43)
            if (r0 != r8) goto L107
            int r0 = r10.bp
            int r9 = r7 + 1
            int r0 = r0 + r7
            char r0 = r10.charAt(r0)
            if (r0 != r6) goto Lcb
            r10.token = r11
            int r11 = r10.bp
            int r11 = r11 + r9
            r10.bp = r11
            char r11 = r10.charAt(r11)
            r10.ch = r11
            goto L100
        Lcb:
            r11 = 93
            if (r0 != r11) goto Ldf
            r11 = 15
            r10.token = r11
            int r11 = r10.bp
            int r11 = r11 + r9
            r10.bp = r11
            char r11 = r10.charAt(r11)
            r10.ch = r11
            goto L100
        Ldf:
            if (r0 != r8) goto Lf1
            r11 = 13
            r10.token = r11
            int r11 = r10.bp
            int r11 = r11 + r9
            r10.bp = r11
            char r11 = r10.charAt(r11)
            r10.ch = r11
            goto L100
        Lf1:
            r11 = 26
            if (r0 != r11) goto L104
            r0 = 20
            r10.token = r0
            int r0 = r10.bp
            int r0 = r0 + r7
            r10.bp = r0
            r10.ch = r11
        L100:
            r11 = 4
            r10.matchStat = r11
            return r4
        L104:
            r10.matchStat = r3
            return r1
        L107:
            r10.matchStat = r3
            return r1
        L10a:
            r10.matchStat = r3
            return r1
    }

    public final float scanFieldFloat(char[] r9) {
            r8 = this;
            r0 = 0
            r8.matchStat = r0
            boolean r0 = r8.charArrayCompare(r9)
            r1 = 0
            if (r0 != 0) goto Le
            r9 = -2
            r8.matchStat = r9
            return r1
        Le:
            int r0 = r9.length
            int r2 = r8.bp
            int r3 = r0 + 1
            int r2 = r2 + r0
            char r0 = r8.charAt(r2)
            r2 = -1
            r4 = 48
            if (r0 < r4) goto Ld6
            r5 = 57
            if (r0 > r5) goto Ld6
        L21:
            int r0 = r8.bp
            int r6 = r3 + 1
            int r0 = r0 + r3
            char r0 = r8.charAt(r0)
            if (r0 < r4) goto L30
            if (r0 > r5) goto L30
            r3 = r6
            goto L21
        L30:
            r7 = 46
            if (r0 != r7) goto L53
            int r0 = r8.bp
            int r3 = r3 + 2
            int r0 = r0 + r6
            char r0 = r8.charAt(r0)
            if (r0 < r4) goto L50
            if (r0 > r5) goto L50
        L41:
            int r0 = r8.bp
            int r6 = r3 + 1
            int r0 = r0 + r3
            char r0 = r8.charAt(r0)
            if (r0 < r4) goto L53
            if (r0 > r5) goto L53
            r3 = r6
            goto L41
        L50:
            r8.matchStat = r2
            return r1
        L53:
            int r3 = r8.bp
            int r9 = r9.length
            int r9 = r9 + r3
            int r3 = r3 + r6
            int r3 = r3 - r9
            int r3 = r3 + (-1)
            java.lang.String r9 = r8.subString(r9, r3)
            float r9 = java.lang.Float.parseFloat(r9)
            r3 = 16
            r4 = 44
            if (r0 != r4) goto L7a
            int r0 = r8.bp
            int r0 = r0 + r6
            r8.bp = r0
            char r0 = r8.charAt(r0)
            r8.ch = r0
            r0 = 3
            r8.matchStat = r0
            r8.token = r3
            return r9
        L7a:
            r5 = 125(0x7d, float:1.75E-43)
            if (r0 != r5) goto Ld3
            int r0 = r8.bp
            int r7 = r6 + 1
            int r0 = r0 + r6
            char r0 = r8.charAt(r0)
            if (r0 != r4) goto L97
            r8.token = r3
            int r0 = r8.bp
            int r0 = r0 + r7
            r8.bp = r0
            char r0 = r8.charAt(r0)
            r8.ch = r0
            goto Lcc
        L97:
            r3 = 93
            if (r0 != r3) goto Lab
            r0 = 15
            r8.token = r0
            int r0 = r8.bp
            int r0 = r0 + r7
            r8.bp = r0
            char r0 = r8.charAt(r0)
            r8.ch = r0
            goto Lcc
        Lab:
            if (r0 != r5) goto Lbd
            r0 = 13
            r8.token = r0
            int r0 = r8.bp
            int r0 = r0 + r7
            r8.bp = r0
            char r0 = r8.charAt(r0)
            r8.ch = r0
            goto Lcc
        Lbd:
            r3 = 26
            if (r0 != r3) goto Ld0
            int r0 = r8.bp
            int r0 = r0 + r6
            r8.bp = r0
            r0 = 20
            r8.token = r0
            r8.ch = r3
        Lcc:
            r0 = 4
            r8.matchStat = r0
            return r9
        Ld0:
            r8.matchStat = r2
            return r1
        Ld3:
            r8.matchStat = r2
            return r1
        Ld6:
            r8.matchStat = r2
            return r1
    }

    public final float[] scanFieldFloatArray(char[] r21) {
            r20 = this;
            r0 = r20
            r1 = 0
            r0.matchStat = r1
            boolean r2 = r20.charArrayCompare(r21)
            r3 = -2
            r4 = 0
            if (r2 != 0) goto L10
            r0.matchStat = r3
            return r4
        L10:
            r2 = r21
            int r2 = r2.length
            int r5 = r0.bp
            int r6 = r2 + 1
            int r5 = r5 + r2
            char r5 = r0.charAt(r5)
            r7 = 91
            if (r5 == r7) goto L23
            r0.matchStat = r3
            return r4
        L23:
            int r3 = r0.bp
            int r2 = r2 + 2
            int r3 = r3 + r6
            char r3 = r0.charAt(r3)
            r5 = 16
            float[] r6 = new float[r5]
            r7 = 0
        L31:
            int r8 = r0.bp
            int r9 = r8 + r2
            r10 = 1
            int r9 = r9 - r10
            r11 = 45
            if (r3 != r11) goto L3d
            r12 = 1
            goto L3e
        L3d:
            r12 = 0
        L3e:
            if (r12 == 0) goto L4c
            int r3 = r2 + 1
            int r8 = r8 + r2
            char r2 = r0.charAt(r8)
            r19 = r3
            r3 = r2
            r2 = r19
        L4c:
            r8 = -1
            r13 = 48
            if (r3 < r13) goto L1af
            r14 = 57
            if (r3 > r14) goto L1af
            int r3 = r3 + (-48)
        L57:
            int r15 = r0.bp
            int r16 = r2 + 1
            int r15 = r15 + r2
            char r15 = r0.charAt(r15)
            if (r15 < r13) goto L6c
            if (r15 > r14) goto L6c
            int r3 = r3 * 10
            int r15 = r15 + (-48)
            int r3 = r3 + r15
            r2 = r16
            goto L57
        L6c:
            r17 = r4
            r4 = 46
            r21 = 1
            r10 = 10
            if (r15 != r4) goto La5
            int r4 = r0.bp
            int r2 = r2 + 2
            int r4 = r4 + r16
            char r4 = r0.charAt(r4)
            if (r4 < r13) goto La2
            if (r4 > r14) goto La2
            int r3 = r3 * 10
            int r4 = r4 + (-48)
            int r3 = r3 + r4
            r4 = 10
        L8b:
            int r15 = r0.bp
            int r16 = r2 + 1
            int r15 = r15 + r2
            char r15 = r0.charAt(r15)
            if (r15 < r13) goto La6
            if (r15 > r14) goto La6
            int r3 = r3 * 10
            int r15 = r15 + (-48)
            int r3 = r3 + r15
            int r4 = r4 * 10
            r2 = r16
            goto L8b
        La2:
            r0.matchStat = r8
            return r17
        La5:
            r4 = 1
        La6:
            r2 = 101(0x65, float:1.42E-43)
            if (r15 == r2) goto Lb1
            r2 = 69
            if (r15 != r2) goto Laf
            goto Lb1
        Laf:
            r2 = 0
            goto Lb2
        Lb1:
            r2 = 1
        Lb2:
            if (r2 == 0) goto Le4
            int r15 = r0.bp
            int r18 = r16 + 1
            int r15 = r15 + r16
            char r15 = r0.charAt(r15)
            r8 = 43
            if (r15 == r8) goto Lc8
            if (r15 != r11) goto Lc5
            goto Lc8
        Lc5:
            r16 = r18
            goto Ld3
        Lc8:
            int r8 = r0.bp
            int r16 = r16 + 2
            int r8 = r8 + r18
            char r8 = r0.charAt(r8)
            r15 = r8
        Ld3:
            if (r15 < r13) goto Le4
            if (r15 > r14) goto Le4
            int r8 = r0.bp
            int r11 = r16 + 1
            int r8 = r8 + r16
            char r15 = r0.charAt(r8)
            r16 = r11
            goto Ld3
        Le4:
            int r8 = r0.bp
            int r8 = r8 + r16
            int r8 = r8 - r9
            int r8 = r8 + (-1)
            if (r2 != 0) goto Lf6
            if (r8 >= r10) goto Lf6
            float r2 = (float) r3
            float r3 = (float) r4
            float r2 = r2 / r3
            if (r12 == 0) goto Lfe
            float r2 = -r2
            goto Lfe
        Lf6:
            java.lang.String r2 = r0.subString(r9, r8)
            float r2 = java.lang.Float.parseFloat(r2)
        Lfe:
            int r3 = r6.length
            r4 = 3
            if (r7 < r3) goto L10d
            int r3 = r6.length
            int r3 = r3 * 3
            int r3 = r3 / 2
            float[] r3 = new float[r3]
            java.lang.System.arraycopy(r6, r1, r3, r1, r7)
            r6 = r3
        L10d:
            int r3 = r7 + 1
            r6[r7] = r2
            r2 = 44
            if (r15 != r2) goto L123
            int r2 = r0.bp
            int r4 = r16 + 1
            int r2 = r2 + r16
            char r2 = r0.charAt(r2)
            r15 = r2
            r2 = r4
            goto L1a9
        L123:
            r7 = 93
            if (r15 != r7) goto L1a7
            int r8 = r0.bp
            int r9 = r16 + 1
            int r8 = r8 + r16
            char r8 = r0.charAt(r8)
            int r10 = r6.length
            if (r3 == r10) goto L13a
            float[] r10 = new float[r3]
            java.lang.System.arraycopy(r6, r1, r10, r1, r3)
            r6 = r10
        L13a:
            if (r8 != r2) goto L14a
            int r1 = r0.bp
            int r1 = r1 + r16
            r0.bp = r1
            r0.next()
            r0.matchStat = r4
            r0.token = r5
            return r6
        L14a:
            r1 = 125(0x7d, float:1.75E-43)
            if (r8 != r1) goto L1a3
            int r3 = r0.bp
            int r3 = r3 + r9
            char r3 = r0.charAt(r3)
            if (r3 != r2) goto L165
            r0.token = r5
            int r1 = r0.bp
            int r16 = r16 + 1
            int r1 = r1 + r16
            r0.bp = r1
            r0.next()
            goto L19b
        L165:
            if (r3 != r7) goto L177
            r1 = 15
            r0.token = r1
            int r1 = r0.bp
            int r16 = r16 + 1
            int r1 = r1 + r16
            r0.bp = r1
            r0.next()
            goto L19b
        L177:
            if (r3 != r1) goto L189
            r1 = 13
            r0.token = r1
            int r1 = r0.bp
            int r16 = r16 + 1
            int r1 = r1 + r16
            r0.bp = r1
            r0.next()
            goto L19b
        L189:
            r1 = 26
            if (r3 != r1) goto L19f
            int r2 = r0.bp
            int r16 = r16 + 1
            int r2 = r2 + r16
            r0.bp = r2
            r2 = 20
            r0.token = r2
            r0.ch = r1
        L19b:
            r1 = 4
            r0.matchStat = r1
            return r6
        L19f:
            r2 = -1
            r0.matchStat = r2
            return r17
        L1a3:
            r2 = -1
            r0.matchStat = r2
            return r17
        L1a7:
            r2 = r16
        L1a9:
            r7 = r3
            r3 = r15
            r4 = r17
            goto L31
        L1af:
            r17 = r4
            r2 = -1
            r0.matchStat = r2
            return r17
    }

    public final float[][] scanFieldFloatArray2(char[] r22) {
            r21 = this;
            r0 = r21
            r1 = 0
            r0.matchStat = r1
            boolean r2 = r21.charArrayCompare(r22)
            r3 = -2
            r4 = 0
            if (r2 != 0) goto L10
            r0.matchStat = r3
            return r4
        L10:
            r2 = r22
            int r2 = r2.length
            int r5 = r0.bp
            int r6 = r2 + 1
            int r5 = r5 + r2
            char r5 = r0.charAt(r5)
            r7 = 91
            if (r5 == r7) goto L23
            r0.matchStat = r3
            return r4
        L23:
            int r3 = r0.bp
            int r2 = r2 + 2
            int r3 = r3 + r6
            char r3 = r0.charAt(r3)
            r5 = 16
            float[][] r6 = new float[r5][]
            r8 = 0
        L31:
            if (r3 != r7) goto L21d
            int r3 = r0.bp
            int r9 = r2 + 1
            int r3 = r3 + r2
            char r2 = r0.charAt(r3)
            float[] r3 = new float[r5]
            r10 = 0
        L3f:
            int r11 = r0.bp
            int r12 = r11 + r9
            r13 = 1
            int r12 = r12 - r13
            r14 = 45
            if (r2 != r14) goto L4b
            r15 = 1
            goto L4c
        L4b:
            r15 = 0
        L4c:
            if (r15 == 0) goto L5a
            int r2 = r9 + 1
            int r11 = r11 + r9
            char r9 = r0.charAt(r11)
            r20 = r9
            r9 = r2
            r2 = r20
        L5a:
            r11 = -1
            r16 = r4
            r4 = 48
            if (r2 < r4) goto L219
            r7 = 57
            if (r2 > r7) goto L219
            int r2 = r2 + (-48)
            r17 = 1
        L69:
            int r13 = r0.bp
            int r18 = r9 + 1
            int r13 = r13 + r9
            char r13 = r0.charAt(r13)
            if (r13 < r4) goto L7e
            if (r13 > r7) goto L7e
            int r2 = r2 * 10
            int r13 = r13 + (-48)
            int r2 = r2 + r13
            r9 = r18
            goto L69
        L7e:
            r5 = 46
            r1 = 10
            if (r13 != r5) goto Lb3
            int r5 = r0.bp
            int r9 = r9 + 2
            int r5 = r5 + r18
            char r5 = r0.charAt(r5)
            if (r5 < r4) goto Lb0
            if (r5 > r7) goto Lb0
            int r2 = r2 * 10
            int r5 = r5 + (-48)
            int r2 = r2 + r5
            r5 = 10
        L99:
            int r13 = r0.bp
            int r18 = r9 + 1
            int r13 = r13 + r9
            char r13 = r0.charAt(r13)
            if (r13 < r4) goto Lb4
            if (r13 > r7) goto Lb4
            int r2 = r2 * 10
            int r13 = r13 + (-48)
            int r2 = r2 + r13
            int r5 = r5 * 10
            r9 = r18
            goto L99
        Lb0:
            r0.matchStat = r11
            return r16
        Lb3:
            r5 = 1
        Lb4:
            r9 = 101(0x65, float:1.42E-43)
            if (r13 == r9) goto Lbf
            r9 = 69
            if (r13 != r9) goto Lbd
            goto Lbf
        Lbd:
            r9 = 0
            goto Lc0
        Lbf:
            r9 = 1
        Lc0:
            if (r9 == 0) goto Lf2
            int r13 = r0.bp
            int r19 = r18 + 1
            int r13 = r13 + r18
            char r13 = r0.charAt(r13)
            r11 = 43
            if (r13 == r11) goto Ld6
            if (r13 != r14) goto Ld3
            goto Ld6
        Ld3:
            r18 = r19
            goto Le1
        Ld6:
            int r11 = r0.bp
            int r18 = r18 + 2
            int r11 = r11 + r19
            char r11 = r0.charAt(r11)
        Le0:
            r13 = r11
        Le1:
            if (r13 < r4) goto Lf2
            if (r13 > r7) goto Lf2
            int r11 = r0.bp
            int r13 = r18 + 1
            int r11 = r11 + r18
            char r11 = r0.charAt(r11)
            r18 = r13
            goto Le0
        Lf2:
            int r4 = r0.bp
            int r4 = r4 + r18
            int r4 = r4 - r12
            int r4 = r4 + (-1)
            if (r9 != 0) goto L104
            if (r4 >= r1) goto L104
            float r1 = (float) r2
            float r2 = (float) r5
            float r1 = r1 / r2
            if (r15 == 0) goto L10c
            float r1 = -r1
            goto L10c
        L104:
            java.lang.String r1 = r0.subString(r12, r4)
            float r1 = java.lang.Float.parseFloat(r1)
        L10c:
            int r2 = r3.length
            r4 = 3
            if (r10 < r2) goto L11c
            int r2 = r3.length
            int r2 = r2 * 3
            int r2 = r2 / 2
            float[] r2 = new float[r2]
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r2, r5, r10)
            r3 = r2
        L11c:
            int r2 = r10 + 1
            r3[r10] = r1
            r1 = 44
            if (r13 != r1) goto L134
            int r1 = r0.bp
            int r4 = r18 + 1
            int r1 = r1 + r18
            char r1 = r0.charAt(r1)
            r9 = r4
        L12f:
            r4 = 16
            r11 = 0
            goto L20e
        L134:
            r5 = 93
            if (r13 != r5) goto L209
            int r7 = r0.bp
            int r9 = r18 + 1
            int r7 = r7 + r18
            char r7 = r0.charAt(r7)
            int r10 = r3.length
            if (r2 == r10) goto L14d
            float[] r10 = new float[r2]
            r11 = 0
            java.lang.System.arraycopy(r3, r11, r10, r11, r2)
            r3 = r10
            goto L14e
        L14d:
            r11 = 0
        L14e:
            int r10 = r6.length
            if (r8 < r10) goto L15b
            int r6 = r6.length
            int r6 = r6 * 3
            int r6 = r6 / 2
            float[][] r6 = new float[r6][]
            java.lang.System.arraycopy(r3, r11, r6, r11, r2)
        L15b:
            int r2 = r8 + 1
            r6[r8] = r3
            if (r7 != r1) goto L170
            int r1 = r0.bp
            int r18 = r18 + 2
            int r1 = r1 + r9
            char r1 = r0.charAt(r1)
            r3 = r1
        L16b:
            r4 = 16
            r11 = 0
            goto L1fd
        L170:
            if (r7 != r5) goto L1f8
            int r3 = r0.bp
            int r7 = r18 + 2
            int r3 = r3 + r9
            char r3 = r0.charAt(r3)
            int r8 = r6.length
            if (r2 == r8) goto L185
            float[][] r8 = new float[r2][]
            r11 = 0
            java.lang.System.arraycopy(r6, r11, r8, r11, r2)
            r6 = r8
        L185:
            if (r3 != r1) goto L199
            int r1 = r0.bp
            int r18 = r18 + 1
            int r1 = r1 + r18
            r0.bp = r1
            r0.next()
            r0.matchStat = r4
            r4 = 16
            r0.token = r4
            return r6
        L199:
            r4 = 16
            r2 = 125(0x7d, float:1.75E-43)
            if (r3 != r2) goto L1f4
            int r3 = r0.bp
            int r3 = r3 + r7
            char r3 = r0.charAt(r3)
            if (r3 != r1) goto L1b6
            r0.token = r4
            int r1 = r0.bp
            int r18 = r18 + 2
            int r1 = r1 + r18
            r0.bp = r1
            r0.next()
            goto L1ec
        L1b6:
            if (r3 != r5) goto L1c8
            r1 = 15
            r0.token = r1
            int r1 = r0.bp
            int r18 = r18 + 2
            int r1 = r1 + r18
            r0.bp = r1
            r0.next()
            goto L1ec
        L1c8:
            if (r3 != r2) goto L1da
            r1 = 13
            r0.token = r1
            int r1 = r0.bp
            int r18 = r18 + 2
            int r1 = r1 + r18
            r0.bp = r1
            r0.next()
            goto L1ec
        L1da:
            r1 = 26
            if (r3 != r1) goto L1f0
            int r2 = r0.bp
            int r18 = r18 + 2
            int r2 = r2 + r18
            r0.bp = r2
            r2 = 20
            r0.token = r2
            r0.ch = r1
        L1ec:
            r1 = 4
            r0.matchStat = r1
            return r6
        L1f0:
            r1 = -1
            r0.matchStat = r1
            return r16
        L1f4:
            r1 = -1
            r0.matchStat = r1
            return r16
        L1f8:
            r3 = r7
            r18 = r9
            goto L16b
        L1fd:
            r8 = r2
            r4 = r16
            r2 = r18
            r1 = 0
            r5 = 16
            r7 = 91
            goto L31
        L209:
            r1 = r13
            r9 = r18
            goto L12f
        L20e:
            r10 = r2
            r4 = r16
            r5 = 16
            r7 = 91
            r2 = r1
            r1 = 0
            goto L3f
        L219:
            r1 = -1
            r0.matchStat = r1
            return r16
        L21d:
            r16 = r4
            goto L31
    }

    public int scanFieldInt(char[] r12) {
            r11 = this;
            r0 = 0
            r11.matchStat = r0
            boolean r1 = r11.charArrayCompare(r12)
            if (r1 != 0) goto Ld
            r12 = -2
            r11.matchStat = r12
            return r0
        Ld:
            int r1 = r12.length
            int r2 = r11.bp
            int r3 = r1 + 1
            int r2 = r2 + r1
            char r2 = r11.charAt(r2)
            r4 = 45
            r5 = 1
            if (r2 != r4) goto L1e
            r4 = 1
            goto L1f
        L1e:
            r4 = 0
        L1f:
            if (r4 == 0) goto L2b
            int r2 = r11.bp
            int r1 = r1 + 2
            int r2 = r2 + r3
            char r2 = r11.charAt(r2)
            r3 = r1
        L2b:
            r1 = 48
            r6 = -1
            if (r2 < r1) goto Le1
            r7 = 57
            if (r2 > r7) goto Le1
            int r2 = r2 - r1
        L35:
            int r8 = r11.bp
            int r9 = r3 + 1
            int r8 = r8 + r3
            char r8 = r11.charAt(r8)
            if (r8 < r1) goto L49
            if (r8 > r7) goto L49
            int r2 = r2 * 10
            int r8 = r8 + (-48)
            int r2 = r2 + r8
            r3 = r9
            goto L35
        L49:
            r1 = 46
            if (r8 != r1) goto L50
            r11.matchStat = r6
            return r0
        L50:
            if (r2 < 0) goto L57
            int r12 = r12.length
            int r12 = r12 + 14
            if (r9 <= r12) goto L63
        L57:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != r12) goto Lde
            r12 = 17
            if (r9 != r12) goto Lde
            if (r4 != 0) goto L63
            goto Lde
        L63:
            r12 = 16
            r1 = 44
            if (r8 != r1) goto L7d
            int r0 = r11.bp
            int r0 = r0 + r9
            r11.bp = r0
            char r0 = r11.charAt(r0)
            r11.ch = r0
            r0 = 3
            r11.matchStat = r0
            r11.token = r12
            if (r4 == 0) goto Ld7
            int r12 = -r2
            return r12
        L7d:
            r7 = 125(0x7d, float:1.75E-43)
            if (r8 != r7) goto Ldb
            int r8 = r11.bp
            int r10 = r3 + 2
            int r8 = r8 + r9
            char r8 = r11.charAt(r8)
            if (r8 != r1) goto L9a
            r11.token = r12
            int r12 = r11.bp
            int r12 = r12 + r10
            r11.bp = r12
            char r12 = r11.charAt(r12)
            r11.ch = r12
            goto Ld0
        L9a:
            r12 = 93
            if (r8 != r12) goto Lae
            r12 = 15
            r11.token = r12
            int r12 = r11.bp
            int r12 = r12 + r10
            r11.bp = r12
            char r12 = r11.charAt(r12)
            r11.ch = r12
            goto Ld0
        Lae:
            if (r8 != r7) goto Lc0
            r12 = 13
            r11.token = r12
            int r12 = r11.bp
            int r12 = r12 + r10
            r11.bp = r12
            char r12 = r11.charAt(r12)
            r11.ch = r12
            goto Ld0
        Lc0:
            r12 = 26
            if (r8 != r12) goto Ld8
            r0 = 20
            r11.token = r0
            int r0 = r11.bp
            int r3 = r3 + r5
            int r0 = r0 + r3
            r11.bp = r0
            r11.ch = r12
        Ld0:
            r12 = 4
            r11.matchStat = r12
            if (r4 == 0) goto Ld7
            int r12 = -r2
            return r12
        Ld7:
            return r2
        Ld8:
            r11.matchStat = r6
            return r0
        Ldb:
            r11.matchStat = r6
            return r0
        Lde:
            r11.matchStat = r6
            return r0
        Le1:
            r11.matchStat = r6
            return r0
    }

    public final int[] scanFieldIntArray(char[] r20) {
            r19 = this;
            r0 = r19
            r1 = 0
            r0.matchStat = r1
            boolean r2 = r19.charArrayCompare(r20)
            r3 = -2
            r4 = 0
            if (r2 != 0) goto L10
            r0.matchStat = r3
            return r4
        L10:
            r2 = r20
            int r2 = r2.length
            int r5 = r0.bp
            int r6 = r2 + 1
            int r5 = r5 + r2
            char r5 = r0.charAt(r5)
            r7 = 91
            if (r5 == r7) goto L23
            r0.matchStat = r3
            return r4
        L23:
            int r3 = r0.bp
            int r5 = r2 + 2
            int r3 = r3 + r6
            char r3 = r0.charAt(r3)
            r6 = 16
            int[] r7 = new int[r6]
            r8 = -1
            r9 = 44
            r10 = 3
            r11 = 93
            r12 = 1
            if (r3 != r11) goto L46
            int r3 = r0.bp
            int r2 = r2 + r10
            int r3 = r3 + r5
            char r3 = r0.charAt(r3)
            r16 = r4
            r14 = 0
            goto Lae
        L46:
            r2 = 0
        L47:
            r13 = 45
            if (r3 != r13) goto L57
            int r3 = r0.bp
            int r13 = r5 + 1
            int r3 = r3 + r5
            char r3 = r0.charAt(r3)
            r5 = r13
            r13 = 1
            goto L58
        L57:
            r13 = 0
        L58:
            r14 = 48
            if (r3 < r14) goto L11e
            r15 = 57
            if (r3 > r15) goto L11e
            int r3 = r3 + (-48)
            r16 = r4
        L64:
            int r4 = r0.bp
            int r17 = r5 + 1
            int r4 = r4 + r5
            char r4 = r0.charAt(r4)
            if (r4 < r14) goto L79
            if (r4 > r15) goto L79
            int r3 = r3 * 10
            int r4 = r4 + (-48)
            int r3 = r3 + r4
            r5 = r17
            goto L64
        L79:
            int r14 = r7.length
            if (r2 < r14) goto L87
            int r14 = r7.length
            int r14 = r14 * 3
            int r14 = r14 / 2
            int[] r14 = new int[r14]
            java.lang.System.arraycopy(r7, r1, r14, r1, r2)
            r7 = r14
        L87:
            int r14 = r2 + 1
            if (r13 == 0) goto L8c
            int r3 = -r3
        L8c:
            r7[r2] = r3
            if (r4 != r9) goto L9d
            int r2 = r0.bp
            int r5 = r5 + 2
            int r2 = r2 + r17
            char r2 = r0.charAt(r2)
            r3 = r2
            goto L119
        L9d:
            if (r4 != r11) goto L116
            int r2 = r0.bp
            int r3 = r5 + 2
            int r2 = r2 + r17
            char r2 = r0.charAt(r2)
            r18 = r3
            r3 = r2
            r2 = r18
        Lae:
            int r4 = r7.length
            if (r14 == r4) goto Lb7
            int[] r4 = new int[r14]
            java.lang.System.arraycopy(r7, r1, r4, r1, r14)
            r7 = r4
        Lb7:
            if (r3 != r9) goto Lc7
            int r1 = r0.bp
            int r2 = r2 - r12
            int r1 = r1 + r2
            r0.bp = r1
            r0.next()
            r0.matchStat = r10
            r0.token = r6
            return r7
        Lc7:
            r1 = 125(0x7d, float:1.75E-43)
            if (r3 != r1) goto L113
            int r3 = r0.bp
            int r3 = r3 + r2
            char r3 = r0.charAt(r3)
            if (r3 != r9) goto Ldf
            r0.token = r6
            int r1 = r0.bp
            int r1 = r1 + r2
            r0.bp = r1
            r0.next()
            goto L10c
        Ldf:
            if (r3 != r11) goto Lee
            r1 = 15
            r0.token = r1
            int r1 = r0.bp
            int r1 = r1 + r2
            r0.bp = r1
            r0.next()
            goto L10c
        Lee:
            if (r3 != r1) goto Lfd
            r1 = 13
            r0.token = r1
            int r1 = r0.bp
            int r1 = r1 + r2
            r0.bp = r1
            r0.next()
            goto L10c
        Lfd:
            r1 = 26
            if (r3 != r1) goto L110
            int r3 = r0.bp
            int r3 = r3 + r2
            r0.bp = r3
            r2 = 20
            r0.token = r2
            r0.ch = r1
        L10c:
            r1 = 4
            r0.matchStat = r1
            return r7
        L110:
            r0.matchStat = r8
            return r16
        L113:
            r0.matchStat = r8
            return r16
        L116:
            r3 = r4
            r5 = r17
        L119:
            r2 = r14
            r4 = r16
            goto L47
        L11e:
            r16 = r4
            r0.matchStat = r8
            return r16
    }

    public long scanFieldLong(char[] r14) {
            r13 = this;
            r0 = 0
            r13.matchStat = r0
            boolean r1 = r13.charArrayCompare(r14)
            r2 = 0
            if (r1 != 0) goto Lf
            r14 = -2
            r13.matchStat = r14
            return r2
        Lf:
            int r14 = r14.length
            int r1 = r13.bp
            int r4 = r14 + 1
            int r1 = r1 + r14
            char r1 = r13.charAt(r1)
            r5 = 45
            r6 = 1
            if (r1 != r5) goto L29
            int r0 = r13.bp
            int r14 = r14 + 2
            int r0 = r0 + r4
            char r1 = r13.charAt(r0)
            r4 = r14
            r0 = 1
        L29:
            r14 = 48
            r5 = -1
            if (r1 < r14) goto Lda
            r7 = 57
            if (r1 > r7) goto Lda
            int r1 = r1 - r14
            long r8 = (long) r1
        L34:
            int r1 = r13.bp
            int r10 = r4 + 1
            int r1 = r1 + r4
            char r1 = r13.charAt(r1)
            if (r1 < r14) goto L4b
            if (r1 > r7) goto L4b
            r11 = 10
            long r8 = r8 * r11
            int r1 = r1 + (-48)
            long r11 = (long) r1
            long r8 = r8 + r11
            r4 = r10
            goto L34
        L4b:
            r14 = 46
            if (r1 != r14) goto L52
            r13.matchStat = r5
            return r2
        L52:
            int r14 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r14 < 0) goto Ld7
            r14 = 21
            if (r10 <= r14) goto L5c
            goto Ld7
        L5c:
            r14 = 16
            r7 = 44
            if (r1 != r7) goto L76
            int r1 = r13.bp
            int r1 = r1 + r10
            r13.bp = r1
            char r1 = r13.charAt(r1)
            r13.ch = r1
            r1 = 3
            r13.matchStat = r1
            r13.token = r14
            if (r0 == 0) goto Ld0
            long r0 = -r8
            return r0
        L76:
            r11 = 125(0x7d, float:1.75E-43)
            if (r1 != r11) goto Ld4
            int r1 = r13.bp
            int r12 = r4 + 2
            int r1 = r1 + r10
            char r1 = r13.charAt(r1)
            if (r1 != r7) goto L93
            r13.token = r14
            int r14 = r13.bp
            int r14 = r14 + r12
            r13.bp = r14
            char r14 = r13.charAt(r14)
            r13.ch = r14
            goto Lc9
        L93:
            r14 = 93
            if (r1 != r14) goto La7
            r14 = 15
            r13.token = r14
            int r14 = r13.bp
            int r14 = r14 + r12
            r13.bp = r14
            char r14 = r13.charAt(r14)
            r13.ch = r14
            goto Lc9
        La7:
            if (r1 != r11) goto Lb9
            r14 = 13
            r13.token = r14
            int r14 = r13.bp
            int r14 = r14 + r12
            r13.bp = r14
            char r14 = r13.charAt(r14)
            r13.ch = r14
            goto Lc9
        Lb9:
            r14 = 26
            if (r1 != r14) goto Ld1
            r1 = 20
            r13.token = r1
            int r1 = r13.bp
            int r4 = r4 + r6
            int r1 = r1 + r4
            r13.bp = r1
            r13.ch = r14
        Lc9:
            r14 = 4
            r13.matchStat = r14
            if (r0 == 0) goto Ld0
            long r0 = -r8
            return r0
        Ld0:
            return r8
        Ld1:
            r13.matchStat = r5
            return r2
        Ld4:
            r13.matchStat = r5
            return r2
        Ld7:
            r13.matchStat = r5
            return r2
        Lda:
            r13.matchStat = r5
            return r2
    }

    public java.lang.String scanFieldString(char[] r10) {
            r9 = this;
            r0 = 0
            r9.matchStat = r0
            boolean r1 = r9.charArrayCompare(r10)
            if (r1 != 0) goto L11
            r10 = -2
            r9.matchStat = r10
            java.lang.String r10 = r9.stringDefaultValue()
            return r10
        L11:
            int r1 = r10.length
            int r2 = r9.bp
            int r3 = r1 + 1
            int r2 = r2 + r1
            char r1 = r9.charAt(r2)
            r2 = 34
            r4 = -1
            if (r1 == r2) goto L27
            r9.matchStat = r4
            java.lang.String r10 = r9.stringDefaultValue()
            return r10
        L27:
            int r1 = r9.bp
            int r5 = r10.length
            int r1 = r1 + r5
            int r1 = r1 + 1
            int r1 = r9.indexOf(r2, r1)
            if (r1 == r4) goto L103
            int r5 = r9.bp
            int r6 = r10.length
            int r5 = r5 + r6
            int r5 = r5 + 1
            int r6 = r1 - r5
            java.lang.String r5 = r9.subString(r5, r6)
            r6 = 92
            int r7 = r5.indexOf(r6)
            if (r7 == r4) goto L77
        L47:
            int r5 = r1 + (-1)
            r7 = 0
        L4a:
            if (r5 < 0) goto L57
            char r8 = r9.charAt(r5)
            if (r8 != r6) goto L57
            int r7 = r7 + 1
            int r5 = r5 + (-1)
            goto L4a
        L57:
            int r7 = r7 % 2
            if (r7 != 0) goto L70
            int r0 = r9.bp
            int r2 = r10.length
            int r2 = r2 + r0
            int r2 = r2 + 1
            int r2 = r1 - r2
            int r5 = r10.length
            int r0 = r0 + r5
            int r0 = r0 + 1
            char[] r0 = r9.sub_chars(r0, r2)
            java.lang.String r5 = readString(r0, r2)
            goto L77
        L70:
            int r1 = r1 + 1
            int r1 = r9.indexOf(r2, r1)
            goto L47
        L77:
            int r0 = r9.bp
            int r10 = r10.length
            int r10 = r10 + r0
            int r10 = r10 + 1
            int r1 = r1 - r10
            int r1 = r1 + 1
            int r3 = r3 + r1
            int r10 = r3 + 1
            int r0 = r0 + r3
            char r0 = r9.charAt(r0)
            r1 = 44
            if (r0 != r1) goto L9b
            int r0 = r9.bp
            int r0 = r0 + r10
            r9.bp = r0
            char r10 = r9.charAt(r0)
            r9.ch = r10
            r10 = 3
            r9.matchStat = r10
            return r5
        L9b:
            r2 = 125(0x7d, float:1.75E-43)
            if (r0 != r2) goto Lfc
            int r0 = r9.bp
            int r6 = r3 + 2
            int r0 = r0 + r10
            char r10 = r9.charAt(r0)
            if (r10 != r1) goto Lba
            r10 = 16
            r9.token = r10
            int r10 = r9.bp
            int r10 = r10 + r6
            r9.bp = r10
            char r10 = r9.charAt(r10)
            r9.ch = r10
            goto Lf1
        Lba:
            r0 = 93
            if (r10 != r0) goto Lce
            r10 = 15
            r9.token = r10
            int r10 = r9.bp
            int r10 = r10 + r6
            r9.bp = r10
            char r10 = r9.charAt(r10)
            r9.ch = r10
            goto Lf1
        Lce:
            if (r10 != r2) goto Le0
            r10 = 13
            r9.token = r10
            int r10 = r9.bp
            int r10 = r10 + r6
            r9.bp = r10
            char r10 = r9.charAt(r10)
            r9.ch = r10
            goto Lf1
        Le0:
            r0 = 26
            if (r10 != r0) goto Lf5
            r10 = 20
            r9.token = r10
            int r10 = r9.bp
            int r3 = r3 + 1
            int r10 = r10 + r3
            r9.bp = r10
            r9.ch = r0
        Lf1:
            r10 = 4
            r9.matchStat = r10
            return r5
        Lf5:
            r9.matchStat = r4
            java.lang.String r10 = r9.stringDefaultValue()
            return r10
        Lfc:
            r9.matchStat = r4
            java.lang.String r10 = r9.stringDefaultValue()
            return r10
        L103:
            com.alibaba.fastjson.JSONException r10 = new com.alibaba.fastjson.JSONException
            java.lang.String r0 = "unclosed str"
            r10.<init>(r0)
            throw r10
    }

    public java.util.Collection<java.lang.String> scanFieldStringArray(char[] r13, java.lang.Class<?> r14) {
            r12 = this;
            r0 = 0
            r12.matchStat = r0
            boolean r1 = r12.charArrayCompare(r13)
            r2 = 0
            if (r1 != 0) goto Le
            r13 = -2
            r12.matchStat = r13
            return r2
        Le:
            java.util.Collection r14 = r12.newCollectionByType(r14)
            int r13 = r13.length
            int r1 = r12.bp
            int r3 = r13 + 1
            int r1 = r1 + r13
            char r1 = r12.charAt(r1)
            r4 = 91
            r5 = -1
            if (r1 == r4) goto L24
            r12.matchStat = r5
            return r2
        L24:
            int r1 = r12.bp
            int r13 = r13 + 2
            int r1 = r1 + r3
            char r1 = r12.charAt(r1)
        L2d:
            r3 = 93
            r4 = 44
            r6 = 34
            if (r1 != r6) goto L95
            int r1 = r12.bp
            int r1 = r1 + r13
            int r1 = r12.indexOf(r6, r1)
            if (r1 == r5) goto L8d
            int r7 = r12.bp
            int r7 = r7 + r13
            int r8 = r1 - r7
            java.lang.String r7 = r12.subString(r7, r8)
            r8 = 92
            int r9 = r7.indexOf(r8)
            if (r9 == r5) goto L7a
        L4f:
            int r7 = r1 + (-1)
            r9 = 0
        L52:
            if (r7 < 0) goto L5f
            char r10 = r12.charAt(r7)
            if (r10 != r8) goto L5f
            int r9 = r9 + 1
            int r7 = r7 + (-1)
            goto L52
        L5f:
            int r9 = r9 % 2
            if (r9 != 0) goto L73
            int r6 = r12.bp
            int r7 = r6 + r13
            int r7 = r1 - r7
            int r6 = r6 + r13
            char[] r6 = r12.sub_chars(r6, r7)
            java.lang.String r7 = readString(r6, r7)
            goto L7a
        L73:
            int r1 = r1 + 1
            int r1 = r12.indexOf(r6, r1)
            goto L4f
        L7a:
            int r6 = r12.bp
            int r8 = r6 + r13
            int r1 = r1 - r8
            int r1 = r1 + 1
            int r13 = r13 + r1
            int r1 = r13 + 1
            int r6 = r6 + r13
            char r13 = r12.charAt(r6)
            r14.add(r7)
            goto Lcd
        L8d:
            com.alibaba.fastjson.JSONException r13 = new com.alibaba.fastjson.JSONException
            java.lang.String r14 = "unclosed str"
            r13.<init>(r14)
            throw r13
        L95:
            r6 = 110(0x6e, float:1.54E-43)
            if (r1 != r6) goto Lea
            int r6 = r12.bp
            int r6 = r6 + r13
            char r6 = r12.charAt(r6)
            r7 = 117(0x75, float:1.64E-43)
            if (r6 != r7) goto Lea
            int r6 = r12.bp
            int r6 = r6 + r13
            int r6 = r6 + 1
            char r6 = r12.charAt(r6)
            r7 = 108(0x6c, float:1.51E-43)
            if (r6 != r7) goto Lea
            int r6 = r12.bp
            int r6 = r6 + r13
            int r6 = r6 + 2
            char r6 = r12.charAt(r6)
            if (r6 != r7) goto Lea
            int r1 = r13 + 3
            int r6 = r12.bp
            int r13 = r13 + 4
            int r6 = r6 + r1
            char r1 = r12.charAt(r6)
            r14.add(r2)
            r11 = r1
            r1 = r13
            r13 = r11
        Lcd:
            if (r13 != r4) goto Ldb
            int r13 = r12.bp
            int r3 = r1 + 1
            int r13 = r13 + r1
            char r1 = r12.charAt(r13)
            r13 = r3
            goto L2d
        Ldb:
            if (r13 != r3) goto Le7
            int r13 = r12.bp
            int r0 = r1 + 1
            int r13 = r13 + r1
            char r13 = r12.charAt(r13)
            goto Lfc
        Le7:
            r12.matchStat = r5
            return r2
        Lea:
            if (r1 != r3) goto L169
            int r0 = r14.size()
            if (r0 != 0) goto L169
            int r0 = r12.bp
            int r1 = r13 + 1
            int r0 = r0 + r13
            char r13 = r12.charAt(r0)
            r0 = r1
        Lfc:
            if (r13 != r4) goto L10d
            int r13 = r12.bp
            int r13 = r13 + r0
            r12.bp = r13
            char r13 = r12.charAt(r13)
            r12.ch = r13
            r13 = 3
            r12.matchStat = r13
            return r14
        L10d:
            r1 = 125(0x7d, float:1.75E-43)
            if (r13 != r1) goto L166
            int r13 = r12.bp
            int r6 = r0 + 1
            int r13 = r13 + r0
            char r13 = r12.charAt(r13)
            if (r13 != r4) goto L12c
            r13 = 16
            r12.token = r13
            int r13 = r12.bp
            int r13 = r13 + r6
            r12.bp = r13
            char r13 = r12.charAt(r13)
            r12.ch = r13
            goto L15f
        L12c:
            if (r13 != r3) goto L13e
            r13 = 15
            r12.token = r13
            int r13 = r12.bp
            int r13 = r13 + r6
            r12.bp = r13
            char r13 = r12.charAt(r13)
            r12.ch = r13
            goto L15f
        L13e:
            if (r13 != r1) goto L150
            r13 = 13
            r12.token = r13
            int r13 = r12.bp
            int r13 = r13 + r6
            r12.bp = r13
            char r13 = r12.charAt(r13)
            r12.ch = r13
            goto L15f
        L150:
            r1 = 26
            if (r13 != r1) goto L163
            int r13 = r12.bp
            int r13 = r13 + r0
            r12.bp = r13
            r13 = 20
            r12.token = r13
            r12.ch = r1
        L15f:
            r13 = 4
            r12.matchStat = r13
            return r14
        L163:
            r12.matchStat = r5
            return r2
        L166:
            r12.matchStat = r5
            return r2
        L169:
            com.alibaba.fastjson.JSONException r13 = new com.alibaba.fastjson.JSONException
            java.lang.String r14 = "illega str"
            r13.<init>(r14)
            throw r13
    }

    public long scanFieldSymbol(char[] r11) {
            r10 = this;
            r0 = 0
            r10.matchStat = r0
            boolean r0 = r10.charArrayCompare(r11)
            r1 = 0
            if (r0 != 0) goto Lf
            r11 = -2
            r10.matchStat = r11
            return r1
        Lf:
            int r11 = r11.length
            int r0 = r10.bp
            int r3 = r11 + 1
            int r0 = r0 + r11
            char r11 = r10.charAt(r0)
            r0 = 34
            r4 = -1
            if (r11 == r0) goto L21
            r10.matchStat = r4
            return r1
        L21:
            r5 = -2128831035(0xffffffff811c9dc5, double:NaN)
        L24:
            int r11 = r10.bp
            int r7 = r3 + 1
            int r11 = r11 + r3
            char r11 = r10.charAt(r11)
            if (r11 != r0) goto Lab
            int r11 = r10.bp
            int r0 = r3 + 2
            int r11 = r11 + r7
            char r11 = r10.charAt(r11)
            r7 = 44
            if (r11 != r7) goto L4b
            int r11 = r10.bp
            int r11 = r11 + r0
            r10.bp = r11
            char r11 = r10.charAt(r11)
            r10.ch = r11
            r11 = 3
            r10.matchStat = r11
            return r5
        L4b:
            r8 = 125(0x7d, float:1.75E-43)
            if (r11 != r8) goto La8
            int r11 = r10.bp
            int r9 = r3 + 3
            int r11 = r11 + r0
            char r11 = r10.charAt(r11)
            if (r11 != r7) goto L6a
            r11 = 16
            r10.token = r11
            int r11 = r10.bp
            int r11 = r11 + r9
            r10.bp = r11
            char r11 = r10.charAt(r11)
            r10.ch = r11
            goto La1
        L6a:
            r0 = 93
            if (r11 != r0) goto L7e
            r11 = 15
            r10.token = r11
            int r11 = r10.bp
            int r11 = r11 + r9
            r10.bp = r11
            char r11 = r10.charAt(r11)
            r10.ch = r11
            goto La1
        L7e:
            if (r11 != r8) goto L90
            r11 = 13
            r10.token = r11
            int r11 = r10.bp
            int r11 = r11 + r9
            r10.bp = r11
            char r11 = r10.charAt(r11)
            r10.ch = r11
            goto La1
        L90:
            r0 = 26
            if (r11 != r0) goto La5
            r11 = 20
            r10.token = r11
            int r11 = r10.bp
            int r3 = r3 + 2
            int r11 = r11 + r3
            r10.bp = r11
            r10.ch = r0
        La1:
            r11 = 4
            r10.matchStat = r11
            return r5
        La5:
            r10.matchStat = r4
            return r1
        La8:
            r10.matchStat = r4
            return r1
        Lab:
            long r8 = (long) r11
            long r5 = r5 ^ r8
            r8 = 16777619(0x1000193, double:8.289245E-317)
            long r5 = r5 * r8
            r3 = 92
            if (r11 != r3) goto Lb9
            r10.matchStat = r4
            return r1
        Lb9:
            r3 = r7
            goto L24
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final float scanFloat(char r10) {
            r9 = this;
            r0 = 0
            r9.matchStat = r0
            int r0 = r9.bp
            char r0 = r9.charAt(r0)
            r1 = 0
            r2 = -1
            r3 = 48
            if (r0 < r3) goto L6d
            r4 = 57
            if (r0 > r4) goto L6d
            r0 = 1
            r5 = 1
        L15:
            int r6 = r9.bp
            int r7 = r5 + 1
            int r6 = r6 + r5
            char r6 = r9.charAt(r6)
            if (r6 < r3) goto L24
            if (r6 > r4) goto L24
            r5 = r7
            goto L15
        L24:
            r8 = 46
            if (r6 != r8) goto L47
            int r6 = r9.bp
            int r5 = r5 + 2
            int r6 = r6 + r7
            char r6 = r9.charAt(r6)
            if (r6 < r3) goto L44
            if (r6 > r4) goto L44
        L35:
            int r1 = r9.bp
            int r7 = r5 + 1
            int r1 = r1 + r5
            char r6 = r9.charAt(r1)
            if (r6 < r3) goto L47
            if (r6 > r4) goto L47
            r5 = r7
            goto L35
        L44:
            r9.matchStat = r2
            return r1
        L47:
            int r1 = r9.bp
            int r3 = r1 + r7
            int r3 = r3 - r1
            int r3 = r3 - r0
            java.lang.String r0 = r9.subString(r1, r3)
            float r0 = java.lang.Float.parseFloat(r0)
            if (r6 != r10) goto L6a
            int r10 = r9.bp
            int r10 = r10 + r7
            r9.bp = r10
            char r10 = r9.charAt(r10)
            r9.ch = r10
            r10 = 3
            r9.matchStat = r10
            r10 = 16
            r9.token = r10
            return r0
        L6a:
            r9.matchStat = r2
            return r0
        L6d:
            r9.matchStat = r2
            return r1
    }

    public final void scanHex() {
            r4 = this;
            char r0 = r4.ch
            r1 = 120(0x78, float:1.68E-43)
            java.lang.String r2 = "illegal state. "
            if (r0 != r1) goto L6f
            r4.next()
            char r0 = r4.ch
            r1 = 39
            if (r0 != r1) goto L58
            int r0 = r4.bp
            r4.np = r0
            r4.next()
        L18:
            char r0 = r4.next()
            r3 = 48
            if (r0 < r3) goto L24
            r3 = 57
            if (r0 <= r3) goto L2c
        L24:
            r3 = 65
            if (r0 < r3) goto L33
            r3 = 70
            if (r0 > r3) goto L33
        L2c:
            int r0 = r4.sp
            int r0 = r0 + 1
            r4.sp = r0
            goto L18
        L33:
            if (r0 != r1) goto L43
            int r0 = r4.sp
            int r0 = r0 + 1
            r4.sp = r0
            r4.next()
            r0 = 26
            r4.token = r0
            return
        L43:
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        L58:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            char r2 = r4.ch
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L6f:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            char r2 = r4.ch
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void scanIdent() {
            r2 = this;
            int r0 = r2.bp
            int r0 = r0 + (-1)
            r2.np = r0
            r0 = 0
            r2.hasSpecial = r0
        L9:
            int r0 = r2.sp
            int r0 = r0 + 1
            r2.sp = r0
            r2.next()
            char r0 = r2.ch
            boolean r0 = java.lang.Character.isLetterOrDigit(r0)
            if (r0 == 0) goto L1b
            goto L9
        L1b:
            java.lang.String r0 = r2.stringVal()
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L2c
            r0 = 8
            r2.token = r0
            return
        L2c:
            java.lang.String r1 = "new"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L39
            r0 = 9
            r2.token = r0
            return
        L39:
            java.lang.String r1 = "true"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L45
            r0 = 6
            r2.token = r0
            return
        L45:
            java.lang.String r1 = "false"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L51
            r0 = 7
            r2.token = r0
            return
        L51:
            java.lang.String r1 = "undefined"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L5e
            r0 = 23
            r2.token = r0
            return
        L5e:
            java.lang.String r1 = "Set"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L6b
            r0 = 21
            r2.token = r0
            return
        L6b:
            java.lang.String r1 = "TreeSet"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L78
            r0 = 22
            r2.token = r0
            return
        L78:
            r0 = 18
            r2.token = r0
            return
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public int scanInt(char r10) {
            r9 = this;
            r0 = 0
            r9.matchStat = r0
            int r1 = r9.bp
            char r1 = r9.charAt(r1)
            r2 = 45
            r3 = 1
            if (r1 != r2) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            if (r2 == 0) goto L1b
            int r1 = r9.bp
            int r1 = r1 + r3
            char r1 = r9.charAt(r1)
            r3 = 2
        L1b:
            r4 = -1
            r5 = 48
            if (r1 < r5) goto L76
            r6 = 57
            if (r1 > r6) goto L76
            int r1 = r1 - r5
        L25:
            int r7 = r9.bp
            int r8 = r3 + 1
            int r7 = r7 + r3
            char r3 = r9.charAt(r7)
            if (r3 < r5) goto L39
            if (r3 > r6) goto L39
            int r1 = r1 * 10
            int r3 = r3 + (-48)
            int r1 = r1 + r3
            r3 = r8
            goto L25
        L39:
            r5 = 46
            if (r3 != r5) goto L40
            r9.matchStat = r4
            return r0
        L40:
            if (r1 >= 0) goto L45
            r9.matchStat = r4
            return r0
        L45:
            if (r3 != r10) goto L5d
            int r10 = r9.bp
            int r10 = r10 + r8
            r9.bp = r10
            char r10 = r9.charAt(r10)
            r9.ch = r10
            r10 = 3
            r9.matchStat = r10
            r10 = 16
            r9.token = r10
            if (r2 == 0) goto L75
            int r10 = -r1
            return r10
        L5d:
            boolean r0 = isWhitespace(r3)
            if (r0 == 0) goto L6f
            int r0 = r9.bp
            int r3 = r8 + 1
            int r0 = r0 + r8
            char r0 = r9.charAt(r0)
            r8 = r3
            r3 = r0
            goto L45
        L6f:
            r9.matchStat = r4
            if (r2 == 0) goto L75
            int r10 = -r1
            return r10
        L75:
            return r1
        L76:
            r9.matchStat = r4
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public long scanLong(char r14) {
            r13 = this;
            r0 = 0
            r13.matchStat = r0
            int r1 = r13.bp
            char r1 = r13.charAt(r1)
            r2 = 45
            r3 = 1
            if (r1 != r2) goto Lf
            r0 = 1
        Lf:
            if (r0 == 0) goto L19
            int r1 = r13.bp
            int r1 = r1 + r3
            char r1 = r13.charAt(r1)
            r3 = 2
        L19:
            r4 = 0
            r2 = -1
            r6 = 48
            if (r1 < r6) goto L78
            r7 = 57
            if (r1 > r7) goto L78
            int r1 = r1 - r6
            long r8 = (long) r1
        L26:
            int r1 = r13.bp
            int r10 = r3 + 1
            int r1 = r1 + r3
            char r1 = r13.charAt(r1)
            if (r1 < r6) goto L3d
            if (r1 > r7) goto L3d
            r11 = 10
            long r8 = r8 * r11
            int r1 = r1 + (-48)
            long r11 = (long) r1
            long r8 = r8 + r11
            r3 = r10
            goto L26
        L3d:
            r3 = 46
            if (r1 != r3) goto L44
            r13.matchStat = r2
            return r4
        L44:
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 >= 0) goto L4b
            r13.matchStat = r2
            return r4
        L4b:
            if (r1 != r14) goto L64
            int r14 = r13.bp
            int r14 = r14 + r10
            r13.bp = r14
            char r14 = r13.charAt(r14)
            r13.ch = r14
            r14 = 3
            r13.matchStat = r14
            r14 = 16
            r13.token = r14
            if (r0 == 0) goto L63
            long r0 = -r8
            return r0
        L63:
            return r8
        L64:
            boolean r1 = isWhitespace(r1)
            if (r1 == 0) goto L75
            int r1 = r13.bp
            int r3 = r10 + 1
            int r1 = r1 + r10
            char r1 = r13.charAt(r1)
            r10 = r3
            goto L4b
        L75:
            r13.matchStat = r2
            return r8
        L78:
            r13.matchStat = r2
            return r4
    }

    public final void scanNullOrNew() {
            r13 = this;
            char r0 = r13.ch
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 != r1) goto La6
            r13.next()
            char r0 = r13.ch
            r1 = 117(0x75, float:1.64E-43)
            r2 = 12
            r3 = 26
            r4 = 13
            r5 = 10
            r6 = 93
            r7 = 125(0x7d, float:1.75E-43)
            r8 = 44
            r9 = 32
            r10 = 8
            r11 = 9
            if (r0 != r1) goto L66
            r13.next()
            char r0 = r13.ch
            java.lang.String r1 = "error parse null"
            r12 = 108(0x6c, float:1.51E-43)
            if (r0 != r12) goto L60
            r13.next()
            char r0 = r13.ch
            if (r0 != r12) goto L5a
            r13.next()
            char r0 = r13.ch
            if (r0 == r9) goto L57
            if (r0 == r8) goto L57
            if (r0 == r7) goto L57
            if (r0 == r6) goto L57
            if (r0 == r5) goto L57
            if (r0 == r4) goto L57
            if (r0 == r11) goto L57
            if (r0 == r3) goto L57
            if (r0 == r2) goto L57
            if (r0 != r10) goto L4f
            goto L57
        L4f:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "scan null error"
            r0.<init>(r1)
            throw r0
        L57:
            r13.token = r10
            return
        L5a:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r1)
            throw r0
        L60:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r1)
            throw r0
        L66:
            r1 = 101(0x65, float:1.42E-43)
            java.lang.String r12 = "error parse new"
            if (r0 != r1) goto La0
            r13.next()
            char r0 = r13.ch
            r1 = 119(0x77, float:1.67E-43)
            if (r0 != r1) goto L9a
            r13.next()
            char r0 = r13.ch
            if (r0 == r9) goto L97
            if (r0 == r8) goto L97
            if (r0 == r7) goto L97
            if (r0 == r6) goto L97
            if (r0 == r5) goto L97
            if (r0 == r4) goto L97
            if (r0 == r11) goto L97
            if (r0 == r3) goto L97
            if (r0 == r2) goto L97
            if (r0 != r10) goto L8f
            goto L97
        L8f:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "scan new error"
            r0.<init>(r1)
            throw r0
        L97:
            r13.token = r11
            return
        L9a:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r12)
            throw r0
        La0:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r12)
            throw r0
        La6:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "error parse null or new"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void scanNumber() {
            r9 = this;
            int r0 = r9.bp
            r9.np = r0
            char r0 = r9.ch
            r1 = 1
            r2 = 45
            if (r0 != r2) goto L13
            int r0 = r9.sp
            int r0 = r0 + r1
            r9.sp = r0
            r9.next()
        L13:
            char r0 = r9.ch
            r3 = 57
            r4 = 48
            if (r0 < r4) goto L26
            if (r0 > r3) goto L26
            int r0 = r9.sp
            int r0 = r0 + r1
            r9.sp = r0
            r9.next()
            goto L13
        L26:
            r5 = 46
            if (r0 != r5) goto L43
            int r0 = r9.sp
            int r0 = r0 + r1
            r9.sp = r0
            r9.next()
        L32:
            char r0 = r9.ch
            if (r0 < r4) goto L41
            if (r0 > r3) goto L41
            int r0 = r9.sp
            int r0 = r0 + r1
            r9.sp = r0
            r9.next()
            goto L32
        L41:
            r0 = 1
            goto L44
        L43:
            r0 = 0
        L44:
            char r5 = r9.ch
            r6 = 76
            if (r5 != r6) goto L53
            int r2 = r9.sp
            int r2 = r2 + r1
            r9.sp = r2
            r9.next()
            goto L90
        L53:
            r6 = 83
            if (r5 != r6) goto L60
            int r2 = r9.sp
            int r2 = r2 + r1
            r9.sp = r2
            r9.next()
            goto L90
        L60:
            r6 = 66
            if (r5 != r6) goto L6d
            int r2 = r9.sp
            int r2 = r2 + r1
            r9.sp = r2
            r9.next()
            goto L90
        L6d:
            r6 = 70
            if (r5 != r6) goto L7a
            int r0 = r9.sp
            int r0 = r0 + r1
            r9.sp = r0
            r9.next()
            goto Lc5
        L7a:
            r7 = 68
            if (r5 != r7) goto L87
            int r0 = r9.sp
            int r0 = r0 + r1
            r9.sp = r0
            r9.next()
            goto Lc5
        L87:
            r8 = 101(0x65, float:1.42E-43)
            if (r5 == r8) goto L92
            r8 = 69
            if (r5 != r8) goto L90
            goto L92
        L90:
            r1 = r0
            goto Lc5
        L92:
            int r0 = r9.sp
            int r0 = r0 + r1
            r9.sp = r0
            r9.next()
            char r0 = r9.ch
            r5 = 43
            if (r0 == r5) goto La2
            if (r0 != r2) goto Laa
        La2:
            int r0 = r9.sp
            int r0 = r0 + r1
            r9.sp = r0
            r9.next()
        Laa:
            char r0 = r9.ch
            if (r0 < r4) goto Lb9
            if (r0 > r3) goto Lb9
            int r0 = r9.sp
            int r0 = r0 + r1
            r9.sp = r0
            r9.next()
            goto Laa
        Lb9:
            if (r0 == r7) goto Lbd
            if (r0 != r6) goto Lc5
        Lbd:
            int r0 = r9.sp
            int r0 = r0 + r1
            r9.sp = r0
            r9.next()
        Lc5:
            if (r1 == 0) goto Lcb
            r0 = 3
            r9.token = r0
            return
        Lcb:
            r0 = 2
            r9.token = r0
            return
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public java.lang.String scanString(char r11) {
            r10 = this;
            r0 = 0
            r10.matchStat = r0
            int r1 = r10.bp
            char r1 = r10.charAt(r1)
            r2 = 110(0x6e, float:1.54E-43)
            r3 = 3
            r4 = -1
            if (r1 != r2) goto L50
            int r0 = r10.bp
            int r0 = r0 + 1
            char r0 = r10.charAt(r0)
            r1 = 117(0x75, float:1.64E-43)
            r2 = 0
            if (r0 != r1) goto L4d
            int r0 = r10.bp
            int r0 = r0 + 2
            char r0 = r10.charAt(r0)
            r1 = 108(0x6c, float:1.51E-43)
            if (r0 != r1) goto L4d
            int r0 = r10.bp
            int r0 = r0 + r3
            char r0 = r10.charAt(r0)
            if (r0 != r1) goto L4d
            int r0 = r10.bp
            int r0 = r0 + 4
            char r0 = r10.charAt(r0)
            if (r0 != r11) goto L4a
            int r11 = r10.bp
            int r11 = r11 + 5
            r10.bp = r11
            char r11 = r10.charAt(r11)
            r10.ch = r11
            r10.matchStat = r3
            return r2
        L4a:
            r10.matchStat = r4
            return r2
        L4d:
            r10.matchStat = r4
            return r2
        L50:
            r2 = 34
            if (r1 == r2) goto L5b
            r10.matchStat = r4
            java.lang.String r11 = r10.stringDefaultValue()
            return r11
        L5b:
            int r1 = r10.bp
            int r1 = r1 + 1
            int r5 = r10.indexOf(r2, r1)
            if (r5 == r4) goto Lc1
            int r6 = r10.bp
            int r6 = r6 + 1
            int r7 = r5 - r1
            java.lang.String r6 = r10.subString(r6, r7)
            r7 = 92
            int r8 = r6.indexOf(r7)
            if (r8 == r4) goto La1
        L77:
            int r6 = r5 + (-1)
            r8 = 0
        L7a:
            if (r6 < 0) goto L87
            char r9 = r10.charAt(r6)
            if (r9 != r7) goto L87
            int r8 = r8 + 1
            int r6 = r6 + (-1)
            goto L7a
        L87:
            int r8 = r8 % 2
            if (r8 != 0) goto L9a
            int r0 = r5 - r1
            int r1 = r10.bp
            int r1 = r1 + 1
            char[] r1 = r10.sub_chars(r1, r0)
            java.lang.String r6 = readString(r1, r0)
            goto La1
        L9a:
            int r5 = r5 + 1
            int r5 = r10.indexOf(r2, r5)
            goto L77
        La1:
            int r0 = r10.bp
            int r1 = r0 + 1
            int r5 = r5 - r1
            int r1 = r5 + 2
            int r5 = r5 + r3
            int r0 = r0 + r1
            char r0 = r10.charAt(r0)
            if (r0 != r11) goto Lbe
            int r11 = r10.bp
            int r11 = r11 + r5
            r10.bp = r11
            char r11 = r10.charAt(r11)
            r10.ch = r11
            r10.matchStat = r3
            return r6
        Lbe:
            r10.matchStat = r4
            return r6
        Lc1:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException
            java.lang.String r0 = "unclosed str"
            r11.<init>(r0)
            throw r11
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void scanString() {
            r11 = this;
            int r0 = r11.bp
            r11.np = r0
            r0 = 0
            r11.hasSpecial = r0
        L7:
            char r1 = r11.next()
            r2 = 4
            r3 = 34
            if (r1 != r3) goto L19
            r11.token = r2
            char r0 = r11.next()
            r11.ch = r0
            return
        L19:
            java.lang.String r4 = "unclosed string : "
            r5 = 26
            if (r1 != r5) goto L3e
            boolean r2 = r11.isEOF()
            if (r2 != 0) goto L29
            r11.putChar(r5)
            goto L7
        L29:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L3e:
            r5 = 92
            r6 = 1
            if (r1 != r5) goto L159
            boolean r1 = r11.hasSpecial
            r7 = 2
            if (r1 != 0) goto L6a
            r11.hasSpecial = r6
            int r1 = r11.sp
            char[] r8 = r11.sbuf
            int r9 = r8.length
            if (r1 < r9) goto L60
            int r9 = r8.length
            int r9 = r9 * 2
            if (r1 <= r9) goto L57
            goto L58
        L57:
            r1 = r9
        L58:
            char[] r1 = new char[r1]
            int r9 = r8.length
            java.lang.System.arraycopy(r8, r0, r1, r0, r9)
            r11.sbuf = r1
        L60:
            int r1 = r11.np
            int r1 = r1 + r6
            int r8 = r11.sp
            char[] r9 = r11.sbuf
            r11.copyTo(r1, r8, r9)
        L6a:
            char r1 = r11.next()
            if (r1 == r3) goto L154
            r3 = 39
            if (r1 == r3) goto L14f
            r3 = 70
            if (r1 == r3) goto L148
            if (r1 == r5) goto L143
            r3 = 98
            if (r1 == r3) goto L13c
            r3 = 102(0x66, float:1.43E-43)
            if (r1 == r3) goto L148
            r3 = 110(0x6e, float:1.54E-43)
            if (r1 == r3) goto L135
            r3 = 114(0x72, float:1.6E-43)
            if (r1 == r3) goto L12e
            r3 = 120(0x78, float:1.68E-43)
            r5 = 16
            if (r1 == r3) goto L117
            r3 = 3
            switch(r1) {
                case 47: goto L110;
                case 48: goto L10b;
                case 49: goto L106;
                case 50: goto L101;
                case 51: goto Lfc;
                case 52: goto Lf7;
                case 53: goto Lf1;
                case 54: goto Leb;
                case 55: goto Le5;
                default: goto L94;
            }
        L94:
            switch(r1) {
                case 116: goto Lde;
                case 117: goto Lb5;
                case 118: goto Lae;
                default: goto L97;
            }
        L97:
            r11.ch = r1
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        Lae:
            r1 = 11
            r11.putChar(r1)
            goto L7
        Lb5:
            char r1 = r11.next()
            char r4 = r11.next()
            char r8 = r11.next()
            char r9 = r11.next()
            java.lang.String r10 = new java.lang.String
            char[] r2 = new char[r2]
            r2[r0] = r1
            r2[r6] = r4
            r2[r7] = r8
            r2[r3] = r9
            r10.<init>(r2)
            int r1 = java.lang.Integer.parseInt(r10, r5)
            char r1 = (char) r1
            r11.putChar(r1)
            goto L7
        Lde:
            r1 = 9
            r11.putChar(r1)
            goto L7
        Le5:
            r1 = 7
            r11.putChar(r1)
            goto L7
        Leb:
            r1 = 6
            r11.putChar(r1)
            goto L7
        Lf1:
            r1 = 5
            r11.putChar(r1)
            goto L7
        Lf7:
            r11.putChar(r2)
            goto L7
        Lfc:
            r11.putChar(r3)
            goto L7
        L101:
            r11.putChar(r7)
            goto L7
        L106:
            r11.putChar(r6)
            goto L7
        L10b:
            r11.putChar(r0)
            goto L7
        L110:
            r1 = 47
            r11.putChar(r1)
            goto L7
        L117:
            char r1 = r11.next()
            char r2 = r11.next()
            int[] r3 = com.alibaba.fastjson.parser.JSONLexerBase.digits
            r1 = r3[r1]
            int r1 = r1 * 16
            r2 = r3[r2]
            int r1 = r1 + r2
            char r1 = (char) r1
            r11.putChar(r1)
            goto L7
        L12e:
            r1 = 13
            r11.putChar(r1)
            goto L7
        L135:
            r1 = 10
            r11.putChar(r1)
            goto L7
        L13c:
            r1 = 8
            r11.putChar(r1)
            goto L7
        L143:
            r11.putChar(r5)
            goto L7
        L148:
            r1 = 12
            r11.putChar(r1)
            goto L7
        L14f:
            r11.putChar(r3)
            goto L7
        L154:
            r11.putChar(r3)
            goto L7
        L159:
            boolean r2 = r11.hasSpecial
            if (r2 != 0) goto L164
            int r1 = r11.sp
            int r1 = r1 + r6
            r11.sp = r1
            goto L7
        L164:
            int r2 = r11.sp
            char[] r3 = r11.sbuf
            int r4 = r3.length
            if (r2 != r4) goto L170
            r11.putChar(r1)
            goto L7
        L170:
            int r4 = r2 + 1
            r11.sp = r4
            r3[r2] = r1
            goto L7
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public void scanStringArray(java.util.Collection<java.lang.String> r17, char r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = 0
            r0.matchStat = r3
            int r4 = r0.bp
            char r4 = r0.charAt(r4)
            r5 = 117(0x75, float:1.64E-43)
            r6 = 3
            r7 = 108(0x6c, float:1.51E-43)
            r8 = 2
            r9 = 110(0x6e, float:1.54E-43)
            if (r4 != r9) goto L4e
            int r10 = r0.bp
            int r10 = r10 + 1
            char r10 = r0.charAt(r10)
            if (r10 != r5) goto L4e
            int r10 = r0.bp
            int r10 = r10 + r8
            char r10 = r0.charAt(r10)
            if (r10 != r7) goto L4e
            int r10 = r0.bp
            int r10 = r10 + r6
            char r10 = r0.charAt(r10)
            if (r10 != r7) goto L4e
            int r10 = r0.bp
            int r10 = r10 + 4
            char r10 = r0.charAt(r10)
            if (r10 != r2) goto L4e
            int r1 = r0.bp
            r2 = 5
            int r1 = r1 + r2
            r0.bp = r1
            char r1 = r0.charAt(r1)
            r0.ch = r1
            r0.matchStat = r2
            return
        L4e:
            r10 = 91
            r11 = -1
            if (r4 == r10) goto L56
            r0.matchStat = r11
            return
        L56:
            int r4 = r0.bp
            int r4 = r4 + 1
            char r4 = r0.charAt(r4)
            r10 = 2
        L5f:
            r12 = 93
            if (r4 != r9) goto L92
            int r13 = r0.bp
            int r13 = r13 + r10
            char r13 = r0.charAt(r13)
            if (r13 != r5) goto L92
            int r13 = r0.bp
            int r13 = r13 + r10
            int r13 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 != r7) goto L92
            int r13 = r0.bp
            int r13 = r13 + r10
            int r13 = r13 + r8
            char r13 = r0.charAt(r13)
            if (r13 != r7) goto L92
            int r4 = r10 + 3
            int r13 = r0.bp
            int r10 = r10 + 4
            int r13 = r13 + r4
            char r4 = r0.charAt(r13)
            r13 = 0
            r1.add(r13)
            goto L106
        L92:
            if (r4 != r12) goto La5
            int r13 = r1.size()
            if (r13 != 0) goto La5
            int r1 = r0.bp
            int r3 = r10 + 1
            int r1 = r1 + r10
            char r1 = r0.charAt(r1)
            goto L127
        La5:
            r13 = 34
            if (r4 == r13) goto Lac
            r0.matchStat = r11
            return
        Lac:
            int r4 = r0.bp
            int r4 = r4 + r10
            int r14 = r0.indexOf(r13, r4)
            if (r14 == r11) goto L13d
            int r15 = r0.bp
            int r15 = r15 + r10
            int r3 = r14 - r4
            java.lang.String r3 = r0.subString(r15, r3)
            r15 = 92
            int r5 = r3.indexOf(r15)
            if (r5 == r11) goto Lf3
        Lc6:
            int r3 = r14 + (-1)
            r5 = 0
        Lc9:
            if (r3 < 0) goto Ld8
            char r7 = r0.charAt(r3)
            if (r7 != r15) goto Ld8
            int r5 = r5 + 1
            int r3 = r3 + (-1)
            r7 = 108(0x6c, float:1.51E-43)
            goto Lc9
        Ld8:
            int r5 = r5 % 2
            if (r5 != 0) goto Lea
            int r3 = r14 - r4
            int r4 = r0.bp
            int r4 = r4 + r10
            char[] r4 = r0.sub_chars(r4, r3)
            java.lang.String r3 = readString(r4, r3)
            goto Lf3
        Lea:
            int r14 = r14 + 1
            int r14 = r0.indexOf(r13, r14)
            r7 = 108(0x6c, float:1.51E-43)
            goto Lc6
        Lf3:
            int r4 = r0.bp
            int r5 = r4 + r10
            int r14 = r14 - r5
            int r14 = r14 + 1
            int r10 = r10 + r14
            int r5 = r10 + 1
            int r4 = r4 + r10
            char r4 = r0.charAt(r4)
            r1.add(r3)
            r10 = r5
        L106:
            r3 = 44
            if (r4 != r3) goto L11c
            int r3 = r0.bp
            int r4 = r10 + 1
            int r3 = r3 + r10
            char r3 = r0.charAt(r3)
            r10 = r4
            r5 = 117(0x75, float:1.64E-43)
            r7 = 108(0x6c, float:1.51E-43)
            r4 = r3
            r3 = 0
            goto L5f
        L11c:
            if (r4 != r12) goto L13a
            int r1 = r0.bp
            int r3 = r10 + 1
            int r1 = r1 + r10
            char r1 = r0.charAt(r1)
        L127:
            if (r1 != r2) goto L137
            int r1 = r0.bp
            int r1 = r1 + r3
            r0.bp = r1
            char r1 = r0.charAt(r1)
            r0.ch = r1
            r0.matchStat = r6
            return
        L137:
            r0.matchStat = r11
            return
        L13a:
            r0.matchStat = r11
            return
        L13d:
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.String r2 = "unclosed str"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final java.lang.String scanSymbol(com.alibaba.fastjson.parser.SymbolTable r5) {
            r4 = this;
            r4.skipWhitespace()
            char r0 = r4.ch
            r1 = 34
            if (r0 != r1) goto Le
            java.lang.String r5 = r4.scanSymbol(r5, r1)
            return r5
        Le:
            java.lang.String r1 = "syntax error"
            r2 = 39
            if (r0 != r2) goto L27
            com.alibaba.fastjson.parser.Feature r0 = com.alibaba.fastjson.parser.Feature.AllowSingleQuotes
            boolean r0 = r4.isEnabled(r0)
            if (r0 == 0) goto L21
            java.lang.String r5 = r4.scanSymbol(r5, r2)
            return r5
        L21:
            com.alibaba.fastjson.JSONException r5 = new com.alibaba.fastjson.JSONException
            r5.<init>(r1)
            throw r5
        L27:
            r2 = 125(0x7d, float:1.75E-43)
            r3 = 0
            if (r0 != r2) goto L34
            r4.next()
            r5 = 13
            r4.token = r5
            return r3
        L34:
            r2 = 44
            if (r0 != r2) goto L40
            r4.next()
            r5 = 16
            r4.token = r5
            return r3
        L40:
            r2 = 26
            if (r0 != r2) goto L49
            r5 = 20
            r4.token = r5
            return r3
        L49:
            com.alibaba.fastjson.parser.Feature r0 = com.alibaba.fastjson.parser.Feature.AllowUnQuotedFieldNames
            boolean r0 = r4.isEnabled(r0)
            if (r0 == 0) goto L56
            java.lang.String r5 = r4.scanSymbolUnQuoted(r5)
            return r5
        L56:
            com.alibaba.fastjson.JSONException r5 = new com.alibaba.fastjson.JSONException
            r5.<init>(r1)
            throw r5
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final java.lang.String scanSymbol(com.alibaba.fastjson.parser.SymbolTable r14, char r15) {
            r13 = this;
            int r0 = r13.bp
            r13.np = r0
            r0 = 0
            r13.sp = r0
            r1 = 0
            r2 = 0
        L9:
            char r3 = r13.next()
            r4 = 4
            r5 = 1
            if (r3 != r15) goto L32
            r13.token = r4
            if (r1 != 0) goto L24
            int r15 = r13.np
            r1 = -1
            if (r15 != r1) goto L1c
            r15 = 0
            goto L1d
        L1c:
            int r15 = r15 + r5
        L1d:
            int r1 = r13.sp
            java.lang.String r14 = r13.addSymbol(r15, r1, r2, r14)
            goto L2c
        L24:
            char[] r15 = r13.sbuf
            int r1 = r13.sp
            java.lang.String r14 = r14.addSymbol(r15, r0, r1, r2)
        L2c:
            r13.sp = r0
            r13.next()
            return r14
        L32:
            r6 = 26
            if (r3 == r6) goto L1a2
            r6 = 92
            if (r3 != r6) goto L182
            r3 = 2
            if (r1 != 0) goto L5e
            int r1 = r13.sp
            char[] r7 = r13.sbuf
            int r8 = r7.length
            if (r1 < r8) goto L53
            int r8 = r7.length
            int r8 = r8 * 2
            if (r1 <= r8) goto L4a
            goto L4b
        L4a:
            r1 = r8
        L4b:
            char[] r1 = new char[r1]
            int r8 = r7.length
            java.lang.System.arraycopy(r7, r0, r1, r0, r8)
            r13.sbuf = r1
        L53:
            int r1 = r13.np
            int r1 = r1 + r5
            char[] r7 = r13.sbuf
            int r8 = r13.sp
            r13.arrayCopy(r1, r7, r0, r8)
            r1 = 1
        L5e:
            char r7 = r13.next()
            r8 = 34
            if (r7 == r8) goto L17a
            r8 = 39
            if (r7 == r8) goto L172
            r8 = 70
            if (r7 == r8) goto L168
            if (r7 == r6) goto L160
            r6 = 98
            if (r7 == r6) goto L156
            r6 = 102(0x66, float:1.43E-43)
            if (r7 == r6) goto L168
            r6 = 110(0x6e, float:1.54E-43)
            if (r7 == r6) goto L14c
            r6 = 114(0x72, float:1.6E-43)
            if (r7 == r6) goto L142
            r6 = 120(0x78, float:1.68E-43)
            r8 = 16
            if (r7 == r6) goto L124
            r6 = 3
            switch(r7) {
                case 47: goto L11a;
                case 48: goto L112;
                case 49: goto L10a;
                case 50: goto L102;
                case 51: goto Lfa;
                case 52: goto Lf2;
                case 53: goto Le9;
                case 54: goto Le0;
                case 55: goto Ld7;
                default: goto L8a;
            }
        L8a:
            switch(r7) {
                case 116: goto Lcd;
                case 117: goto La1;
                case 118: goto L97;
                default: goto L8d;
            }
        L8d:
            r13.ch = r7
            com.alibaba.fastjson.JSONException r14 = new com.alibaba.fastjson.JSONException
            java.lang.String r15 = "unclosed.str.lit"
            r14.<init>(r15)
            throw r14
        L97:
            int r2 = r2 * 31
            r3 = 11
            int r2 = r2 + r3
            r13.putChar(r3)
            goto L9
        La1:
            char r7 = r13.next()
            char r9 = r13.next()
            char r10 = r13.next()
            char r11 = r13.next()
            java.lang.String r12 = new java.lang.String
            char[] r4 = new char[r4]
            r4[r0] = r7
            r4[r5] = r9
            r4[r3] = r10
            r4[r6] = r11
            r12.<init>(r4)
            int r3 = java.lang.Integer.parseInt(r12, r8)
            int r2 = r2 * 31
            int r2 = r2 + r3
            char r3 = (char) r3
            r13.putChar(r3)
            goto L9
        Lcd:
            int r2 = r2 * 31
            r3 = 9
            int r2 = r2 + r3
            r13.putChar(r3)
            goto L9
        Ld7:
            int r2 = r2 * 31
            int r2 = r2 + r7
            r3 = 7
            r13.putChar(r3)
            goto L9
        Le0:
            int r2 = r2 * 31
            int r2 = r2 + r7
            r3 = 6
            r13.putChar(r3)
            goto L9
        Le9:
            int r2 = r2 * 31
            int r2 = r2 + r7
            r3 = 5
            r13.putChar(r3)
            goto L9
        Lf2:
            int r2 = r2 * 31
            int r2 = r2 + r7
            r13.putChar(r4)
            goto L9
        Lfa:
            int r2 = r2 * 31
            int r2 = r2 + r7
            r13.putChar(r6)
            goto L9
        L102:
            int r2 = r2 * 31
            int r2 = r2 + r7
            r13.putChar(r3)
            goto L9
        L10a:
            int r2 = r2 * 31
            int r2 = r2 + r7
            r13.putChar(r5)
            goto L9
        L112:
            int r2 = r2 * 31
            int r2 = r2 + r7
            r13.putChar(r0)
            goto L9
        L11a:
            int r2 = r2 * 31
            r3 = 47
            int r2 = r2 + r3
            r13.putChar(r3)
            goto L9
        L124:
            char r3 = r13.next()
            r13.ch = r3
            char r4 = r13.next()
            r13.ch = r4
            int[] r5 = com.alibaba.fastjson.parser.JSONLexerBase.digits
            r3 = r5[r3]
            int r3 = r3 * 16
            r4 = r5[r4]
            int r3 = r3 + r4
            char r3 = (char) r3
            int r2 = r2 * 31
            int r2 = r2 + r3
            r13.putChar(r3)
            goto L9
        L142:
            int r2 = r2 * 31
            r3 = 13
            int r2 = r2 + r3
            r13.putChar(r3)
            goto L9
        L14c:
            int r2 = r2 * 31
            r3 = 10
            int r2 = r2 + r3
            r13.putChar(r3)
            goto L9
        L156:
            int r2 = r2 * 31
            r3 = 8
            int r2 = r2 + r3
            r13.putChar(r3)
            goto L9
        L160:
            int r2 = r2 * 31
            int r2 = r2 + r6
            r13.putChar(r6)
            goto L9
        L168:
            int r2 = r2 * 31
            r3 = 12
            int r2 = r2 + r3
            r13.putChar(r3)
            goto L9
        L172:
            int r2 = r2 * 31
            int r2 = r2 + r8
            r13.putChar(r8)
            goto L9
        L17a:
            int r2 = r2 * 31
            int r2 = r2 + r8
            r13.putChar(r8)
            goto L9
        L182:
            int r2 = r2 * 31
            int r2 = r2 + r3
            if (r1 != 0) goto L18e
            int r3 = r13.sp
            int r3 = r3 + r5
            r13.sp = r3
            goto L9
        L18e:
            int r4 = r13.sp
            char[] r5 = r13.sbuf
            int r6 = r5.length
            if (r4 != r6) goto L19a
            r13.putChar(r3)
            goto L9
        L19a:
            int r6 = r4 + 1
            r13.sp = r6
            r5[r4] = r3
            goto L9
        L1a2:
            com.alibaba.fastjson.JSONException r14 = new com.alibaba.fastjson.JSONException
            java.lang.String r15 = "unclosed.str"
            r14.<init>(r15)
            throw r14
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final java.lang.String scanSymbolUnQuoted(com.alibaba.fastjson.parser.SymbolTable r6) {
            r5 = this;
            int r0 = r5.token
            r1 = 1
            if (r0 != r1) goto L10
            int r0 = r5.pos
            if (r0 != 0) goto L10
            int r0 = r5.bp
            if (r0 != r1) goto L10
            r0 = 0
            r5.bp = r0
        L10:
            boolean[] r0 = com.alibaba.fastjson.util.IOUtils.firstIdentifierFlags
            char r2 = r5.ch
            int r3 = r0.length
            if (r2 >= r3) goto L3c
            boolean r0 = r0[r2]
            if (r0 == 0) goto L1c
            goto L3c
        L1c:
            com.alibaba.fastjson.JSONException r6 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "illegal identifier : "
            r0.append(r1)
            char r1 = r5.ch
            r0.append(r1)
            java.lang.String r1 = r5.info()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L3c:
            boolean[] r0 = com.alibaba.fastjson.util.IOUtils.identifierFlags
            int r3 = r5.bp
            r5.np = r3
            r5.sp = r1
        L44:
            char r3 = r5.next()
            int r4 = r0.length
            if (r3 >= r4) goto La6
            boolean r4 = r0[r3]
            if (r4 != 0) goto La6
            int r0 = r5.bp
            char r0 = r5.charAt(r0)
            r5.ch = r0
            r0 = 18
            r5.token = r0
            int r0 = r5.sp
            r3 = 4
            if (r0 != r3) goto L92
            r0 = 3392903(0x33c587, float:4.75447E-39)
            if (r2 != r0) goto L92
            int r0 = r5.np
            char r0 = r5.charAt(r0)
            r3 = 110(0x6e, float:1.54E-43)
            if (r0 != r3) goto L92
            int r0 = r5.np
            int r0 = r0 + r1
            char r0 = r5.charAt(r0)
            r1 = 117(0x75, float:1.64E-43)
            if (r0 != r1) goto L92
            int r0 = r5.np
            int r0 = r0 + 2
            char r0 = r5.charAt(r0)
            r1 = 108(0x6c, float:1.51E-43)
            if (r0 != r1) goto L92
            int r0 = r5.np
            int r0 = r0 + 3
            char r0 = r5.charAt(r0)
            if (r0 != r1) goto L92
            r6 = 0
            return r6
        L92:
            if (r6 != 0) goto L9d
            int r6 = r5.np
            int r0 = r5.sp
            java.lang.String r6 = r5.subString(r6, r0)
            return r6
        L9d:
            int r0 = r5.np
            int r1 = r5.sp
            java.lang.String r6 = r5.addSymbol(r0, r1, r2, r6)
            return r6
        La6:
            int r2 = r2 * 31
            int r2 = r2 + r3
            int r3 = r5.sp
            int r3 = r3 + r1
            r5.sp = r3
            goto L44
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public java.lang.String scanSymbolWithSeperator(com.alibaba.fastjson.parser.SymbolTable r10, char r11) {
            r9 = this;
            r0 = 0
            r9.matchStat = r0
            int r1 = r9.bp
            char r1 = r9.charAt(r1)
            r2 = 110(0x6e, float:1.54E-43)
            r3 = 3
            r4 = -1
            r5 = 0
            r6 = 1
            if (r1 != r2) goto L50
            int r10 = r9.bp
            int r10 = r10 + r6
            char r10 = r9.charAt(r10)
            r0 = 117(0x75, float:1.64E-43)
            if (r10 != r0) goto L4d
            int r10 = r9.bp
            int r10 = r10 + 2
            char r10 = r9.charAt(r10)
            r0 = 108(0x6c, float:1.51E-43)
            if (r10 != r0) goto L4d
            int r10 = r9.bp
            int r10 = r10 + r3
            char r10 = r9.charAt(r10)
            if (r10 != r0) goto L4d
            int r10 = r9.bp
            int r10 = r10 + 4
            char r10 = r9.charAt(r10)
            if (r10 != r11) goto L4a
            int r10 = r9.bp
            int r10 = r10 + 5
            r9.bp = r10
            char r10 = r9.charAt(r10)
            r9.ch = r10
            r9.matchStat = r3
            return r5
        L4a:
            r9.matchStat = r4
            return r5
        L4d:
            r9.matchStat = r4
            return r5
        L50:
            r2 = 34
            if (r1 == r2) goto L57
            r9.matchStat = r4
            return r5
        L57:
            r1 = 1
        L58:
            int r7 = r9.bp
            int r8 = r1 + 1
            int r7 = r7 + r1
            char r7 = r9.charAt(r7)
            if (r7 != r2) goto L9b
            int r2 = r9.bp
            int r5 = r2 + 1
            int r2 = r2 + r8
            int r2 = r2 - r5
            int r2 = r2 - r6
            java.lang.String r10 = r9.addSymbol(r5, r2, r0, r10)
            int r0 = r9.bp
            int r1 = r1 + 2
            int r0 = r0 + r8
            char r0 = r9.charAt(r0)
        L77:
            if (r0 != r11) goto L87
            int r11 = r9.bp
            int r11 = r11 + r1
            r9.bp = r11
            char r11 = r9.charAt(r11)
            r9.ch = r11
            r9.matchStat = r3
            return r10
        L87:
            boolean r0 = isWhitespace(r0)
            if (r0 == 0) goto L98
            int r0 = r9.bp
            int r2 = r1 + 1
            int r0 = r0 + r1
            char r0 = r9.charAt(r0)
            r1 = r2
            goto L77
        L98:
            r9.matchStat = r4
            return r10
        L9b:
            int r0 = r0 * 31
            int r0 = r0 + r7
            r1 = 92
            if (r7 != r1) goto La5
            r9.matchStat = r4
            return r5
        La5:
            r1 = r8
            goto L58
    }

    public final void scanTrue() {
            r3 = this;
            char r0 = r3.ch
            r1 = 116(0x74, float:1.63E-43)
            java.lang.String r2 = "error parse true"
            if (r0 != r1) goto L77
            r3.next()
            char r0 = r3.ch
            r1 = 114(0x72, float:1.6E-43)
            if (r0 != r1) goto L71
            r3.next()
            char r0 = r3.ch
            r1 = 117(0x75, float:1.64E-43)
            if (r0 != r1) goto L6b
            r3.next()
            char r0 = r3.ch
            r1 = 101(0x65, float:1.42E-43)
            if (r0 != r1) goto L65
            r3.next()
            char r0 = r3.ch
            r1 = 32
            if (r0 == r1) goto L61
            r1 = 44
            if (r0 == r1) goto L61
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 == r1) goto L61
            r1 = 93
            if (r0 == r1) goto L61
            r1 = 10
            if (r0 == r1) goto L61
            r1 = 13
            if (r0 == r1) goto L61
            r1 = 9
            if (r0 == r1) goto L61
            r1 = 26
            if (r0 == r1) goto L61
            r1 = 12
            if (r0 == r1) goto L61
            r1 = 8
            if (r0 == r1) goto L61
            r1 = 58
            if (r0 == r1) goto L61
            r1 = 47
            if (r0 != r1) goto L59
            goto L61
        L59:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "scan true error"
            r0.<init>(r1)
            throw r0
        L61:
            r0 = 6
            r3.token = r0
            return
        L65:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r2)
            throw r0
        L6b:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r2)
            throw r0
        L71:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r2)
            throw r0
        L77:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r2)
            throw r0
    }

    public final int scanType(java.lang.String r8) {
            r7 = this;
            r0 = 0
            r7.matchStat = r0
            char[] r1 = com.alibaba.fastjson.parser.JSONLexerBase.typeFieldName
            boolean r2 = r7.charArrayCompare(r1)
            if (r2 != 0) goto Ld
            r8 = -2
            return r8
        Ld:
            int r2 = r7.bp
            int r1 = r1.length
            int r2 = r2 + r1
            int r1 = r8.length()
        L15:
            r3 = -1
            if (r0 >= r1) goto L28
            char r4 = r8.charAt(r0)
            int r5 = r2 + r0
            char r5 = r7.charAt(r5)
            if (r4 == r5) goto L25
            return r3
        L25:
            int r0 = r0 + 1
            goto L15
        L28:
            int r2 = r2 + r1
            char r8 = r7.charAt(r2)
            r0 = 34
            if (r8 == r0) goto L32
            return r3
        L32:
            int r8 = r2 + 1
            char r0 = r7.charAt(r8)
            r7.ch = r0
            r1 = 16
            r4 = 44
            r5 = 3
            if (r0 != r4) goto L4e
            int r2 = r2 + 2
            char r8 = r7.charAt(r2)
            r7.ch = r8
            r7.bp = r2
            r7.token = r1
            return r5
        L4e:
            r6 = 125(0x7d, float:1.75E-43)
            if (r0 != r6) goto L92
            int r8 = r2 + 2
            char r0 = r7.charAt(r8)
            r7.ch = r0
            if (r0 != r4) goto L67
            r7.token = r1
            int r2 = r2 + r5
            char r8 = r7.charAt(r2)
            r7.ch = r8
        L65:
            r8 = r2
            goto L8d
        L67:
            r1 = 93
            if (r0 != r1) goto L77
            r8 = 15
            r7.token = r8
            int r2 = r2 + r5
            char r8 = r7.charAt(r2)
            r7.ch = r8
            goto L65
        L77:
            if (r0 != r6) goto L85
            r8 = 13
            r7.token = r8
            int r2 = r2 + r5
            char r8 = r7.charAt(r2)
            r7.ch = r8
            goto L65
        L85:
            r1 = 26
            if (r0 != r1) goto L91
            r0 = 20
            r7.token = r0
        L8d:
            r0 = 4
            r7.matchStat = r0
            goto L92
        L91:
            return r3
        L92:
            r7.bp = r8
            int r8 = r7.matchStat
            return r8
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public void setLocale(java.util.Locale r1) {
            r0 = this;
            r0.locale = r1
            return
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public void setTimeZone(java.util.TimeZone r1) {
            r0 = this;
            r0.timeZone = r1
            return
    }

    public void setToken(int r1) {
            r0 = this;
            r0.token = r1
            return
    }

    protected void skipComment() {
            r4 = this;
            r4.next()
            char r0 = r4.ch
            r1 = 26
            r2 = 47
            if (r0 != r2) goto L1b
        Lb:
            r4.next()
            char r0 = r4.ch
            r2 = 10
            if (r0 != r2) goto L18
            r4.next()
            return
        L18:
            if (r0 != r1) goto Lb
            goto L37
        L1b:
            r3 = 42
            if (r0 != r3) goto L38
            r4.next()
        L22:
            char r0 = r4.ch
            if (r0 == r1) goto L37
            if (r0 != r3) goto L33
            r4.next()
            char r0 = r4.ch
            if (r0 != r2) goto L22
            r4.next()
            return
        L33:
            r4.next()
            goto L22
        L37:
            return
        L38:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "invalid comment"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void skipWhitespace() {
            r3 = this;
        L0:
            char r0 = r3.ch
            r1 = 47
            if (r0 > r1) goto L29
            r2 = 32
            if (r0 == r2) goto L25
            r2 = 13
            if (r0 == r2) goto L25
            r2 = 10
            if (r0 == r2) goto L25
            r2 = 9
            if (r0 == r2) goto L25
            r2 = 12
            if (r0 == r2) goto L25
            r2 = 8
            if (r0 != r2) goto L1f
            goto L25
        L1f:
            if (r0 != r1) goto L29
            r3.skipComment()
            goto L0
        L25:
            r3.next()
            goto L0
        L29:
            return
    }

    public final java.lang.String stringDefaultValue() {
            r1 = this;
            java.lang.String r0 = r1.stringDefaultValue
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public abstract java.lang.String stringVal();

    public abstract java.lang.String subString(int r1, int r2);

    protected abstract char[] sub_chars(int r1, int r2);

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final int token() {
            r1 = this;
            int r0 = r1.token
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final java.lang.String tokenName() {
            r1 = this;
            int r0 = r1.token
            java.lang.String r0 = com.alibaba.fastjson.parser.JSONToken.name(r0)
            return r0
    }
}
