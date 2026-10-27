package com.alibaba.fastjson.parser.deserializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JSONPDeserializer implements com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static final com.alibaba.fastjson.parser.deserializer.JSONPDeserializer instance = null;

    static {
            com.alibaba.fastjson.parser.deserializer.JSONPDeserializer r0 = new com.alibaba.fastjson.parser.deserializer.JSONPDeserializer
            r0.<init>()
            com.alibaba.fastjson.parser.deserializer.JSONPDeserializer.instance = r0
            return
    }

    public JSONPDeserializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r4, java.lang.reflect.Type r5, java.lang.Object r6) {
            r3 = this;
            com.alibaba.fastjson.parser.JSONLexer r5 = r4.getLexer()
            com.alibaba.fastjson.parser.JSONLexerBase r5 = (com.alibaba.fastjson.parser.JSONLexerBase) r5
            com.alibaba.fastjson.parser.SymbolTable r6 = r4.getSymbolTable()
            java.lang.String r6 = r5.scanSymbolUnQuoted(r6)
            r5.nextToken()
            int r0 = r5.token()
            r1 = 25
            if (r0 != r1) goto L48
            com.alibaba.fastjson.parser.SymbolTable r0 = r4.getSymbolTable()
            java.lang.String r0 = r5.scanSymbolUnQuoted(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r6 = "."
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            r5.nextToken()
            int r0 = r5.token()
        L48:
            com.alibaba.fastjson.JSONPObject r1 = new com.alibaba.fastjson.JSONPObject
            r1.<init>(r6)
            r6 = 10
            java.lang.String r2 = "illegal jsonp : "
            if (r0 != r6) goto L95
            r5.nextToken()
        L56:
            java.lang.Object r6 = r4.parse()
            r1.addParameter(r6)
            int r6 = r5.token()
            r0 = 16
            if (r6 != r0) goto L69
            r5.nextToken()
            goto L56
        L69:
            r4 = 11
            if (r6 != r4) goto L7c
            r5.nextToken()
            int r4 = r5.token()
            r6 = 24
            if (r4 != r6) goto L7b
            r5.nextToken()
        L7b:
            return r1
        L7c:
            com.alibaba.fastjson.JSONException r4 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r5 = r5.info()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L95:
            com.alibaba.fastjson.JSONException r4 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r5 = r5.info()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 0
            return r0
    }
}
