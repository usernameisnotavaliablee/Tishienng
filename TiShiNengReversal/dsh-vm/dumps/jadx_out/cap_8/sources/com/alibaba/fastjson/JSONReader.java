package com.alibaba.fastjson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JSONReader implements java.io.Closeable {
    private com.alibaba.fastjson.JSONStreamContext context;
    private final com.alibaba.fastjson.parser.DefaultJSONParser parser;

    public JSONReader(com.alibaba.fastjson.parser.DefaultJSONParser r1) {
            r0 = this;
            r0.<init>()
            r0.parser = r1
            return
    }

    public JSONReader(com.alibaba.fastjson.parser.JSONLexer r2) {
            r1 = this;
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = new com.alibaba.fastjson.parser.DefaultJSONParser
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public JSONReader(java.io.Reader r2) {
            r1 = this;
            r0 = 0
            com.alibaba.fastjson.parser.Feature[] r0 = new com.alibaba.fastjson.parser.Feature[r0]
            r1.<init>(r2, r0)
            return
    }

    public JSONReader(java.io.Reader r4, com.alibaba.fastjson.parser.Feature... r5) {
            r3 = this;
            com.alibaba.fastjson.parser.JSONReaderScanner r0 = new com.alibaba.fastjson.parser.JSONReaderScanner
            r0.<init>(r4)
            r3.<init>(r0)
            int r4 = r5.length
            r0 = 0
        La:
            if (r0 >= r4) goto L15
            r1 = r5[r0]
            r2 = 1
            r3.config(r1, r2)
            int r0 = r0 + 1
            goto La
        L15:
            return
    }

    private void endStructure() {
            r3 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r3.context
            com.alibaba.fastjson.JSONStreamContext r0 = r0.parent
            r3.context = r0
            if (r0 != 0) goto L9
            goto L1d
        L9:
            int r1 = r0.state
            r2 = -1
            switch(r1) {
                case 1001: goto L17;
                case 1002: goto L14;
                case 1003: goto L17;
                case 1004: goto L11;
                default: goto Lf;
            }
        Lf:
            r1 = -1
            goto L19
        L11:
            r1 = 1005(0x3ed, float:1.408E-42)
            goto L19
        L14:
            r1 = 1003(0x3eb, float:1.406E-42)
            goto L19
        L17:
            r1 = 1002(0x3ea, float:1.404E-42)
        L19:
            if (r1 == r2) goto L1d
            r0.state = r1
        L1d:
            return
    }

    private void readAfter() {
            r4 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r4.context
            int r1 = r0.state
            r2 = 1002(0x3ea, float:1.404E-42)
            r3 = -1
            switch(r1) {
                case 1001: goto L28;
                case 1002: goto L26;
                case 1003: goto L28;
                case 1004: goto L23;
                case 1005: goto L21;
                default: goto La;
            }
        La:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "illegal state : "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L21:
            r2 = -1
            goto L28
        L23:
            r2 = 1005(0x3ed, float:1.408E-42)
            goto L28
        L26:
            r2 = 1003(0x3eb, float:1.406E-42)
        L28:
            if (r2 == r3) goto L2c
            r0.state = r2
        L2c:
            return
    }

    private void readBefore() {
            r4 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r4.context
            int r0 = r0.state
            r1 = 16
            switch(r0) {
                case 1001: goto L35;
                case 1002: goto L2e;
                case 1003: goto L26;
                case 1004: goto L35;
                case 1005: goto L20;
                default: goto L9;
            }
        L9:
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "illegal state : "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L20:
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r4.parser
            r0.accept(r1)
            return
        L26:
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r4.parser
            r2 = 18
            r0.accept(r1, r2)
            return
        L2e:
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r4.parser
            r1 = 17
            r0.accept(r1)
        L35:
            return
    }

    private void startStructure() {
            r3 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r3.context
            int r0 = r0.state
            switch(r0) {
                case 1001: goto L31;
                case 1002: goto L2a;
                case 1003: goto L22;
                case 1004: goto L31;
                case 1005: goto L22;
                default: goto L7;
            }
        L7:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "illegal state : "
            r1.append(r2)
            com.alibaba.fastjson.JSONStreamContext r2 = r3.context
            int r2 = r2.state
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L22:
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r3.parser
            r1 = 16
            r0.accept(r1)
            return
        L2a:
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r3.parser
            r1 = 17
            r0.accept(r1)
        L31:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r1.parser
            r0.close()
            return
    }

    public void config(com.alibaba.fastjson.parser.Feature r2, boolean r3) {
            r1 = this;
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r1.parser
            r0.config(r2, r3)
            return
    }

    public void endArray() {
            r2 = this;
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r2.parser
            r1 = 15
            r0.accept(r1)
            r2.endStructure()
            return
    }

    public void endObject() {
            r2 = this;
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r2.parser
            r1 = 13
            r0.accept(r1)
            r2.endStructure()
            return
    }

    public java.util.Locale getLocal() {
            r1 = this;
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r1.parser
            com.alibaba.fastjson.parser.JSONLexer r0 = r0.lexer
            java.util.Locale r0 = r0.getLocale()
            return r0
    }

    public java.util.TimeZone getTimzeZone() {
            r1 = this;
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r1.parser
            com.alibaba.fastjson.parser.JSONLexer r0 = r0.lexer
            java.util.TimeZone r0 = r0.getTimeZone()
            return r0
    }

    public boolean hasNext() {
            r4 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r4.context
            if (r0 == 0) goto L38
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r4.parser
            com.alibaba.fastjson.parser.JSONLexer r0 = r0.lexer
            int r0 = r0.token()
            com.alibaba.fastjson.JSONStreamContext r1 = r4.context
            int r1 = r1.state
            r2 = 0
            r3 = 1
            switch(r1) {
                case 1001: goto L32;
                case 1002: goto L15;
                case 1003: goto L32;
                case 1004: goto L2c;
                case 1005: goto L2c;
                default: goto L15;
            }
        L15:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "illegal state : "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L2c:
            r1 = 15
            if (r0 == r1) goto L31
            return r3
        L31:
            return r2
        L32:
            r1 = 13
            if (r0 == r1) goto L37
            return r3
        L37:
            return r2
        L38:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "context is null"
            r0.<init>(r1)
            throw r0
    }

    public int peek() {
            r1 = this;
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r1.parser
            com.alibaba.fastjson.parser.JSONLexer r0 = r0.lexer
            int r0 = r0.token()
            return r0
    }

    public java.lang.Integer readInteger() {
            r1 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r1.context
            if (r0 != 0) goto Lb
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r1.parser
            java.lang.Object r0 = r0.parse()
            goto L17
        Lb:
            r1.readBefore()
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r1.parser
            java.lang.Object r0 = r0.parse()
            r1.readAfter()
        L17:
            java.lang.Integer r0 = com.alibaba.fastjson.util.TypeUtils.castToInt(r0)
            return r0
    }

    public java.lang.Long readLong() {
            r1 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r1.context
            if (r0 != 0) goto Lb
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r1.parser
            java.lang.Object r0 = r0.parse()
            goto L17
        Lb:
            r1.readBefore()
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r1.parser
            java.lang.Object r0 = r0.parse()
            r1.readAfter()
        L17:
            java.lang.Long r0 = com.alibaba.fastjson.util.TypeUtils.castToLong(r0)
            return r0
    }

    public java.lang.Object readObject() {
            r2 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r2.context
            if (r0 != 0) goto Lb
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r2.parser
            java.lang.Object r0 = r0.parse()
            return r0
        Lb:
            r2.readBefore()
            com.alibaba.fastjson.JSONStreamContext r0 = r2.context
            int r0 = r0.state
            r1 = 1001(0x3e9, float:1.403E-42)
            if (r0 == r1) goto L21
            r1 = 1003(0x3eb, float:1.406E-42)
            if (r0 == r1) goto L21
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r2.parser
            java.lang.Object r0 = r0.parse()
            goto L27
        L21:
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r2.parser
            java.lang.Object r0 = r0.parseKey()
        L27:
            r2.readAfter()
            return r0
    }

    public <T> T readObject(com.alibaba.fastjson.TypeReference<T> r1) {
            r0 = this;
            java.lang.reflect.Type r1 = r1.getType()
            java.lang.Object r1 = r0.readObject(r1)
            return r1
    }

    public <T> T readObject(java.lang.Class<T> r2) {
            r1 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r1.context
            if (r0 != 0) goto Lb
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r1.parser
            java.lang.Object r2 = r0.parseObject(r2)
            return r2
        Lb:
            r1.readBefore()
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r1.parser
            java.lang.Object r2 = r0.parseObject(r2)
            r1.readAfter()
            return r2
    }

    public <T> T readObject(java.lang.reflect.Type r2) {
            r1 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r1.context
            if (r0 != 0) goto Lb
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r1.parser
            java.lang.Object r2 = r0.parseObject(r2)
            return r2
        Lb:
            r1.readBefore()
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r1.parser
            java.lang.Object r2 = r0.parseObject(r2)
            r1.readAfter()
            return r2
    }

    public java.lang.Object readObject(java.util.Map r2) {
            r1 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r1.context
            if (r0 != 0) goto Lb
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r1.parser
            java.lang.Object r2 = r0.parseObject(r2)
            return r2
        Lb:
            r1.readBefore()
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r1.parser
            java.lang.Object r2 = r0.parseObject(r2)
            r1.readAfter()
            return r2
    }

    public void readObject(java.lang.Object r2) {
            r1 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r1.context
            if (r0 != 0) goto La
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r1.parser
            r0.parseObject(r2)
            return
        La:
            r1.readBefore()
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r1.parser
            r0.parseObject(r2)
            r1.readAfter()
            return
    }

    public java.lang.String readString() {
            r3 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r3.context
            if (r0 != 0) goto Lb
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r3.parser
            java.lang.Object r0 = r0.parse()
            goto L34
        Lb:
            r3.readBefore()
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r3.parser
            com.alibaba.fastjson.parser.JSONLexer r0 = r0.lexer
            com.alibaba.fastjson.JSONStreamContext r1 = r3.context
            int r1 = r1.state
            r2 = 1001(0x3e9, float:1.403E-42)
            if (r1 != r2) goto L2b
            int r1 = r0.token()
            r2 = 18
            if (r1 != r2) goto L2b
            java.lang.String r1 = r0.stringVal()
            r0.nextToken()
            r0 = r1
            goto L31
        L2b:
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r3.parser
            java.lang.Object r0 = r0.parse()
        L31:
            r3.readAfter()
        L34:
            java.lang.String r0 = com.alibaba.fastjson.util.TypeUtils.castToString(r0)
            return r0
    }

    public void setLocale(java.util.Locale r2) {
            r1 = this;
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r1.parser
            com.alibaba.fastjson.parser.JSONLexer r0 = r0.lexer
            r0.setLocale(r2)
            return
    }

    public void setTimzeZone(java.util.TimeZone r2) {
            r1 = this;
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r1.parser
            com.alibaba.fastjson.parser.JSONLexer r0 = r0.lexer
            r0.setTimeZone(r2)
            return
    }

    public void startArray() {
            r3 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r3.context
            r1 = 1004(0x3ec, float:1.407E-42)
            if (r0 != 0) goto Lf
            com.alibaba.fastjson.JSONStreamContext r0 = new com.alibaba.fastjson.JSONStreamContext
            r2 = 0
            r0.<init>(r2, r1)
            r3.context = r0
            goto L1b
        Lf:
            r3.startStructure()
            com.alibaba.fastjson.JSONStreamContext r0 = new com.alibaba.fastjson.JSONStreamContext
            com.alibaba.fastjson.JSONStreamContext r2 = r3.context
            r0.<init>(r2, r1)
            r3.context = r0
        L1b:
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r3.parser
            r1 = 14
            r0.accept(r1)
            return
    }

    public void startObject() {
            r3 = this;
            com.alibaba.fastjson.JSONStreamContext r0 = r3.context
            r1 = 1001(0x3e9, float:1.403E-42)
            if (r0 != 0) goto Lf
            com.alibaba.fastjson.JSONStreamContext r0 = new com.alibaba.fastjson.JSONStreamContext
            r2 = 0
            r0.<init>(r2, r1)
            r3.context = r0
            goto L1b
        Lf:
            r3.startStructure()
            com.alibaba.fastjson.JSONStreamContext r0 = new com.alibaba.fastjson.JSONStreamContext
            com.alibaba.fastjson.JSONStreamContext r2 = r3.context
            r0.<init>(r2, r1)
            r3.context = r0
        L1b:
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = r3.parser
            r1 = 12
            r2 = 18
            r0.accept(r1, r2)
            return
    }
}
