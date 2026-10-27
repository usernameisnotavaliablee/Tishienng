package com.alibaba.fastjson.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class JSONReaderScanner extends com.alibaba.fastjson.parser.JSONLexerBase {
    private static final java.lang.ThreadLocal<char[]> BUF_LOCAL = null;
    private char[] buf;
    private int bufLength;
    private java.io.Reader reader;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.alibaba.fastjson.parser.JSONReaderScanner.BUF_LOCAL = r0
            return
    }

    public JSONReaderScanner(java.io.Reader r2) {
            r1 = this;
            int r0 = com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE
            r1.<init>(r2, r0)
            return
    }

    public JSONReaderScanner(java.io.Reader r2, int r3) {
            r1 = this;
            r1.<init>(r3)
            r1.reader = r2
            java.lang.ThreadLocal<char[]> r3 = com.alibaba.fastjson.parser.JSONReaderScanner.BUF_LOCAL
            java.lang.Object r0 = r3.get()
            char[] r0 = (char[]) r0
            r1.buf = r0
            if (r0 == 0) goto L15
            r0 = 0
            r3.set(r0)
        L15:
            char[] r3 = r1.buf
            if (r3 != 0) goto L1f
            r3 = 16384(0x4000, float:2.2959E-41)
            char[] r3 = new char[r3]
            r1.buf = r3
        L1f:
            char[] r3 = r1.buf     // Catch: java.io.IOException -> L38
            int r2 = r2.read(r3)     // Catch: java.io.IOException -> L38
            r1.bufLength = r2     // Catch: java.io.IOException -> L38
            r2 = -1
            r1.bp = r2
            r1.next()
            char r2 = r1.ch
            r3 = 65279(0xfeff, float:9.1475E-41)
            if (r2 != r3) goto L37
            r1.next()
        L37:
            return
        L38:
            r2 = move-exception
            com.alibaba.fastjson.JSONException r3 = new com.alibaba.fastjson.JSONException
            java.lang.String r0 = r2.getMessage()
            r3.<init>(r0, r2)
            throw r3
    }

    public JSONReaderScanner(java.lang.String r2) {
            r1 = this;
            int r0 = com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE
            r1.<init>(r2, r0)
            return
    }

    public JSONReaderScanner(java.lang.String r2, int r3) {
            r1 = this;
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r2)
            r1.<init>(r0, r3)
            return
    }

    public JSONReaderScanner(char[] r2, int r3) {
            r1 = this;
            int r0 = com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE
            r1.<init>(r2, r3, r0)
            return
    }

    public JSONReaderScanner(char[] r3, int r4, int r5) {
            r2 = this;
            java.io.CharArrayReader r0 = new java.io.CharArrayReader
            r1 = 0
            r0.<init>(r3, r1, r4)
            r2.<init>(r0, r5)
            return
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final java.lang.String addSymbol(int r2, int r3, int r4, com.alibaba.fastjson.parser.SymbolTable r5) {
            r1 = this;
            char[] r0 = r1.buf
            java.lang.String r2 = r5.addSymbol(r0, r2, r3, r4)
            return r2
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    protected final void arrayCopy(int r2, char[] r3, int r4, int r5) {
            r1 = this;
            char[] r0 = r1.buf
            java.lang.System.arraycopy(r0, r2, r3, r4, r5)
            return
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public byte[] bytesValue() {
            r3 = this;
            int r0 = r3.token
            r1 = 26
            if (r0 == r1) goto L13
            char[] r0 = r3.buf
            int r1 = r3.np
            int r1 = r1 + 1
            int r2 = r3.sp
            byte[] r0 = com.alibaba.fastjson.util.IOUtils.decodeBase64(r0, r1, r2)
            return r0
        L13:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "TODO"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final boolean charArrayCompare(char[] r5) {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r5.length
            if (r1 >= r2) goto L14
            int r2 = r4.bp
            int r2 = r2 + r1
            char r2 = r4.charAt(r2)
            char r3 = r5[r1]
            if (r2 == r3) goto L11
            return r0
        L11:
            int r1 = r1 + 1
            goto L2
        L14:
            r5 = 1
            return r5
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final char charAt(int r8) {
            r7 = this;
            int r0 = r7.bufLength
            if (r8 < r0) goto L7a
            r1 = 26
            r2 = -1
            if (r0 != r2) goto L13
            int r0 = r7.sp
            if (r8 >= r0) goto L12
            char[] r0 = r7.buf
            char r8 = r0[r8]
            return r8
        L12:
            return r1
        L13:
            int r3 = r7.bp
            r4 = 0
            if (r3 != 0) goto L40
            char[] r1 = r7.buf
            int r2 = r1.length
            int r2 = r2 * 3
            int r2 = r2 / 2
            char[] r5 = new char[r2]
            java.lang.System.arraycopy(r1, r3, r5, r4, r0)
            int r0 = r7.bufLength
            int r2 = r2 - r0
            java.io.Reader r1 = r7.reader     // Catch: java.io.IOException -> L35
            int r0 = r1.read(r5, r0, r2)     // Catch: java.io.IOException -> L35
            int r1 = r7.bufLength     // Catch: java.io.IOException -> L35
            int r1 = r1 + r0
            r7.bufLength = r1     // Catch: java.io.IOException -> L35
            r7.buf = r5     // Catch: java.io.IOException -> L35
            goto L7a
        L35:
            r8 = move-exception
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = r8.getMessage()
            r0.<init>(r1, r8)
            throw r0
        L40:
            int r0 = r0 - r3
            if (r0 <= 0) goto L48
            char[] r5 = r7.buf
            java.lang.System.arraycopy(r5, r3, r5, r4, r0)
        L48:
            java.io.Reader r3 = r7.reader     // Catch: java.io.IOException -> L6f
            char[] r5 = r7.buf     // Catch: java.io.IOException -> L6f
            int r6 = r5.length     // Catch: java.io.IOException -> L6f
            int r6 = r6 - r0
            int r3 = r3.read(r5, r0, r6)     // Catch: java.io.IOException -> L6f
            r7.bufLength = r3     // Catch: java.io.IOException -> L6f
            if (r3 == 0) goto L67
            if (r3 != r2) goto L59
            return r1
        L59:
            int r3 = r3 + r0
            r7.bufLength = r3
            int r0 = r7.bp
            int r8 = r8 - r0
            int r1 = r7.np
            int r1 = r1 - r0
            r7.np = r1
            r7.bp = r4
            goto L7a
        L67:
            com.alibaba.fastjson.JSONException r8 = new com.alibaba.fastjson.JSONException
            java.lang.String r0 = "illegal state, textLength is zero"
            r8.<init>(r0)
            throw r8
        L6f:
            r8 = move-exception
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = r8.getMessage()
            r0.<init>(r1, r8)
            throw r0
        L7a:
            char[] r0 = r7.buf
            char r8 = r0[r8]
            return r8
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            super.close()
            char[] r0 = r3.buf
            int r1 = r0.length
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r1 > r2) goto Lf
            java.lang.ThreadLocal<char[]> r1 = com.alibaba.fastjson.parser.JSONReaderScanner.BUF_LOCAL
            r1.set(r0)
        Lf:
            r0 = 0
            r3.buf = r0
            java.io.Reader r0 = r3.reader
            com.alibaba.fastjson.util.IOUtils.close(r0)
            return
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    protected final void copyTo(int r3, int r4, char[] r5) {
            r2 = this;
            char[] r0 = r2.buf
            r1 = 0
            java.lang.System.arraycopy(r0, r3, r5, r1, r4)
            return
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final java.math.BigDecimal decimalValue() {
            r4 = this;
            int r0 = r4.np
            r1 = -1
            if (r0 != r1) goto L6
            r0 = 0
        L6:
            int r1 = r4.sp
            int r1 = r1 + r0
            int r1 = r1 + (-1)
            char r1 = r4.charAt(r1)
            int r2 = r4.sp
            r3 = 76
            if (r1 == r3) goto L25
            r3 = 83
            if (r1 == r3) goto L25
            r3 = 66
            if (r1 == r3) goto L25
            r3 = 70
            if (r1 == r3) goto L25
            r3 = 68
            if (r1 != r3) goto L27
        L25:
            int r2 = r2 + (-1)
        L27:
            java.math.BigDecimal r1 = new java.math.BigDecimal
            char[] r3 = r4.buf
            r1.<init>(r3, r0, r2)
            return r1
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final int indexOf(char r3, int r4) {
            r2 = this;
            int r0 = r2.bp
            int r4 = r4 - r0
        L3:
            int r0 = r2.bp
            int r0 = r0 + r4
            char r0 = r2.charAt(r0)
            if (r3 != r0) goto L10
            int r3 = r2.bp
            int r4 = r4 + r3
            return r4
        L10:
            r1 = 26
            if (r0 != r1) goto L16
            r3 = -1
            return r3
        L16:
            int r4 = r4 + 1
            goto L3
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final boolean isBlankInput() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            char[] r2 = r4.buf
            char r2 = r2[r1]
            r3 = 26
            if (r2 != r3) goto L10
            r0 = 20
            r4.token = r0
            r0 = 1
            return r0
        L10:
            boolean r2 = com.alibaba.fastjson.parser.JSONLexerBase.isWhitespace(r2)
            if (r2 != 0) goto L17
            return r0
        L17:
            int r1 = r1 + 1
            goto L2
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public boolean isEOF() {
            r5 = this;
            int r0 = r5.bufLength
            r1 = -1
            r2 = 1
            if (r0 == r1) goto L1a
            int r0 = r5.bp
            char[] r1 = r5.buf
            int r3 = r1.length
            if (r0 == r3) goto L1a
            char r3 = r5.ch
            r4 = 26
            if (r3 != r4) goto L18
            int r0 = r0 + r2
            int r1 = r1.length
            if (r0 != r1) goto L18
            goto L1a
        L18:
            r0 = 0
            return r0
        L1a:
            return r2
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final char next() {
            r7 = this;
            int r0 = r7.bp
            int r0 = r0 + 1
            r7.bp = r0
            int r1 = r7.bufLength
            if (r0 < r1) goto L6e
            r0 = 26
            r2 = -1
            if (r1 != r2) goto L10
            return r0
        L10:
            int r3 = r7.sp
            r4 = 0
            if (r3 <= 0) goto L25
            int r1 = r1 - r3
            char r5 = r7.ch
            r6 = 34
            if (r5 != r6) goto L20
            if (r1 <= 0) goto L20
            int r1 = r1 + (-1)
        L20:
            char[] r5 = r7.buf
            java.lang.System.arraycopy(r5, r1, r5, r4, r3)
        L25:
            r7.np = r2
            int r1 = r7.sp
            r7.bp = r1
            char[] r3 = r7.buf     // Catch: java.io.IOException -> L40
            int r5 = r3.length     // Catch: java.io.IOException -> L40
            int r5 = r5 - r1
            if (r5 != 0) goto L42
            int r5 = r3.length     // Catch: java.io.IOException -> L40
            int r5 = r5 * 2
            char[] r5 = new char[r5]     // Catch: java.io.IOException -> L40
            int r6 = r3.length     // Catch: java.io.IOException -> L40
            java.lang.System.arraycopy(r3, r4, r5, r4, r6)     // Catch: java.io.IOException -> L40
            r7.buf = r5     // Catch: java.io.IOException -> L40
            int r3 = r5.length     // Catch: java.io.IOException -> L40
            int r5 = r3 - r1
            goto L42
        L40:
            r0 = move-exception
            goto L64
        L42:
            java.io.Reader r3 = r7.reader     // Catch: java.io.IOException -> L40
            char[] r4 = r7.buf     // Catch: java.io.IOException -> L40
            int r6 = r7.bp     // Catch: java.io.IOException -> L40
            int r3 = r3.read(r4, r6, r5)     // Catch: java.io.IOException -> L40
            r7.bufLength = r3     // Catch: java.io.IOException -> L40
            if (r3 == 0) goto L5c
            if (r3 != r2) goto L55
            r7.ch = r0
            return r0
        L55:
            int r0 = r7.bp
            int r3 = r3 + r0
            r7.bufLength = r3
            r0 = r1
            goto L6e
        L5c:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "illegal stat, textLength is zero"
            r0.<init>(r1)
            throw r0
        L64:
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
        L6e:
            char[] r1 = r7.buf
            char r0 = r1[r0]
            r7.ch = r0
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final java.lang.String numberString() {
            r4 = this;
            int r0 = r4.np
            r1 = -1
            if (r0 != r1) goto L6
            r0 = 0
        L6:
            int r1 = r4.sp
            int r1 = r1 + r0
            int r1 = r1 + (-1)
            char r1 = r4.charAt(r1)
            int r2 = r4.sp
            r3 = 76
            if (r1 == r3) goto L25
            r3 = 83
            if (r1 == r3) goto L25
            r3 = 66
            if (r1 == r3) goto L25
            r3 = 70
            if (r1 == r3) goto L25
            r3 = 68
            if (r1 != r3) goto L27
        L25:
            int r2 = r2 + (-1)
        L27:
            java.lang.String r1 = new java.lang.String
            char[] r3 = r4.buf
            r1.<init>(r3, r0, r2)
            return r1
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final java.lang.String stringVal() {
            r4 = this;
            boolean r0 = r4.hasSpecial
            if (r0 != 0) goto L24
            int r0 = r4.np
            int r0 = r0 + 1
            if (r0 < 0) goto L1e
            char[] r1 = r4.buf
            int r2 = r1.length
            int r3 = r4.sp
            int r2 = r2 - r3
            if (r0 > r2) goto L18
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1, r0, r3)
            return r2
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L24:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r4.sbuf
            r2 = 0
            int r3 = r4.sp
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final java.lang.String subString(int r3, int r4) {
            r2 = this;
            if (r4 < 0) goto La
            java.lang.String r0 = new java.lang.String
            char[] r1 = r2.buf
            r0.<init>(r1, r3, r4)
            return r0
        La:
            java.lang.StringIndexOutOfBoundsException r3 = new java.lang.StringIndexOutOfBoundsException
            r3.<init>(r4)
            throw r3
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final char[] sub_chars(int r4, int r5) {
            r3 = this;
            if (r5 < 0) goto L10
            if (r4 != 0) goto L7
            char[] r4 = r3.buf
            return r4
        L7:
            char[] r0 = new char[r5]
            char[] r1 = r3.buf
            r2 = 0
            java.lang.System.arraycopy(r1, r4, r0, r2, r5)
            return r0
        L10:
            java.lang.StringIndexOutOfBoundsException r4 = new java.lang.StringIndexOutOfBoundsException
            r4.<init>(r5)
            throw r4
    }
}
