package com.alibaba.fastjson.parser.deserializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MapDeserializer implements com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static com.alibaba.fastjson.parser.deserializer.MapDeserializer instance;

    static {
            com.alibaba.fastjson.parser.deserializer.MapDeserializer r0 = new com.alibaba.fastjson.parser.deserializer.MapDeserializer
            r0.<init>()
            com.alibaba.fastjson.parser.deserializer.MapDeserializer.instance = r0
            return
    }

    public MapDeserializer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object parseMap(com.alibaba.fastjson.parser.DefaultJSONParser r9, java.util.Map<java.lang.Object, java.lang.Object> r10, java.lang.reflect.Type r11, java.lang.reflect.Type r12, java.lang.Object r13) {
            com.alibaba.fastjson.parser.JSONLexer r13 = r9.lexer
            int r0 = r13.token()
            r1 = 12
            r2 = 16
            if (r0 == r1) goto L2e
            int r0 = r13.token()
            if (r0 != r2) goto L13
            goto L2e
        L13:
            com.alibaba.fastjson.JSONException r9 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "syntax error, expect {, actual "
            r10.append(r11)
            java.lang.String r11 = r13.tokenName()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L2e:
            com.alibaba.fastjson.parser.ParserConfig r0 = r9.getConfig()
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = r0.getDeserializer(r11)
            com.alibaba.fastjson.parser.ParserConfig r1 = r9.getConfig()
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r1 = r1.getDeserializer(r12)
            int r3 = r0.getFastMatchToken()
            r13.nextToken(r3)
            com.alibaba.fastjson.parser.ParseContext r3 = r9.getContext()
        L49:
            int r4 = r13.token()     // Catch: java.lang.Throwable -> L58
            r5 = 13
            if (r4 != r5) goto L5b
            r13.nextToken(r2)     // Catch: java.lang.Throwable -> L58
            r9.setContext(r3)
            return r10
        L58:
            r10 = move-exception
            goto L161
        L5b:
            int r4 = r13.token()     // Catch: java.lang.Throwable -> L58
            r6 = 0
            r7 = 4
            if (r4 != r7) goto Le0
            boolean r4 = r13.isRef()     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto Le0
            com.alibaba.fastjson.parser.Feature r4 = com.alibaba.fastjson.parser.Feature.DisableSpecialKeyDetect     // Catch: java.lang.Throwable -> L58
            boolean r4 = r13.isEnabled(r4)     // Catch: java.lang.Throwable -> L58
            if (r4 != 0) goto Le0
            r13.nextTokenWithColon(r7)     // Catch: java.lang.Throwable -> L58
            int r10 = r13.token()     // Catch: java.lang.Throwable -> L58
            if (r10 != r7) goto Lc1
            java.lang.String r10 = r13.stringVal()     // Catch: java.lang.Throwable -> L58
            java.lang.String r11 = ".."
            boolean r11 = r11.equals(r10)     // Catch: java.lang.Throwable -> L58
            if (r11 == 0) goto L8b
            com.alibaba.fastjson.parser.ParseContext r10 = r3.parent     // Catch: java.lang.Throwable -> L58
            java.lang.Object r6 = r10.object     // Catch: java.lang.Throwable -> L58
            goto La9
        L8b:
            java.lang.String r11 = "$"
            boolean r11 = r11.equals(r10)     // Catch: java.lang.Throwable -> L58
            if (r11 == 0) goto L9d
            r10 = r3
        L94:
            com.alibaba.fastjson.parser.ParseContext r11 = r10.parent     // Catch: java.lang.Throwable -> L58
            if (r11 == 0) goto L9a
            r10 = r11
            goto L94
        L9a:
            java.lang.Object r6 = r10.object     // Catch: java.lang.Throwable -> L58
            goto La9
        L9d:
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r11 = new com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask     // Catch: java.lang.Throwable -> L58
            r11.<init>(r3, r10)     // Catch: java.lang.Throwable -> L58
            r9.addResolveTask(r11)     // Catch: java.lang.Throwable -> L58
            r10 = 1
            r9.setResolveStatus(r10)     // Catch: java.lang.Throwable -> L58
        La9:
            r13.nextToken(r5)     // Catch: java.lang.Throwable -> L58
            int r10 = r13.token()     // Catch: java.lang.Throwable -> L58
            if (r10 != r5) goto Lb9
            r13.nextToken(r2)     // Catch: java.lang.Throwable -> L58
            r9.setContext(r3)
            return r6
        Lb9:
            com.alibaba.fastjson.JSONException r10 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L58
            java.lang.String r11 = "illegal ref"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L58
            throw r10     // Catch: java.lang.Throwable -> L58
        Lc1:
            com.alibaba.fastjson.JSONException r10 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L58
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r11.<init>()     // Catch: java.lang.Throwable -> L58
            java.lang.String r12 = "illegal ref, "
            r11.append(r12)     // Catch: java.lang.Throwable -> L58
            int r12 = r13.token()     // Catch: java.lang.Throwable -> L58
            java.lang.String r12 = com.alibaba.fastjson.parser.JSONToken.name(r12)     // Catch: java.lang.Throwable -> L58
            r11.append(r12)     // Catch: java.lang.Throwable -> L58
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L58
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L58
            throw r10     // Catch: java.lang.Throwable -> L58
        Le0:
            int r4 = r10.size()     // Catch: java.lang.Throwable -> L58
            if (r4 != 0) goto L11a
            int r4 = r13.token()     // Catch: java.lang.Throwable -> L58
            if (r4 != r7) goto L11a
            java.lang.String r4 = com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY     // Catch: java.lang.Throwable -> L58
            java.lang.String r8 = r13.stringVal()     // Catch: java.lang.Throwable -> L58
            boolean r4 = r4.equals(r8)     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L11a
            com.alibaba.fastjson.parser.Feature r4 = com.alibaba.fastjson.parser.Feature.DisableSpecialKeyDetect     // Catch: java.lang.Throwable -> L58
            boolean r4 = r13.isEnabled(r4)     // Catch: java.lang.Throwable -> L58
            if (r4 != 0) goto L11a
            r13.nextTokenWithColon(r7)     // Catch: java.lang.Throwable -> L58
            r13.nextToken(r2)     // Catch: java.lang.Throwable -> L58
            int r4 = r13.token()     // Catch: java.lang.Throwable -> L58
            if (r4 != r5) goto L113
            r13.nextToken()     // Catch: java.lang.Throwable -> L58
            r9.setContext(r3)
            return r10
        L113:
            int r4 = r0.getFastMatchToken()     // Catch: java.lang.Throwable -> L58
            r13.nextToken(r4)     // Catch: java.lang.Throwable -> L58
        L11a:
            java.lang.Object r4 = r0.deserialze(r9, r11, r6)     // Catch: java.lang.Throwable -> L58
            int r5 = r13.token()     // Catch: java.lang.Throwable -> L58
            r6 = 17
            if (r5 != r6) goto L146
            int r5 = r1.getFastMatchToken()     // Catch: java.lang.Throwable -> L58
            r13.nextToken(r5)     // Catch: java.lang.Throwable -> L58
            java.lang.Object r5 = r1.deserialze(r9, r12, r4)     // Catch: java.lang.Throwable -> L58
            r9.checkMapResolve(r10, r4)     // Catch: java.lang.Throwable -> L58
            r10.put(r4, r5)     // Catch: java.lang.Throwable -> L58
            int r4 = r13.token()     // Catch: java.lang.Throwable -> L58
            if (r4 != r2) goto L49
            int r4 = r0.getFastMatchToken()     // Catch: java.lang.Throwable -> L58
            r13.nextToken(r4)     // Catch: java.lang.Throwable -> L58
            goto L49
        L146:
            com.alibaba.fastjson.JSONException r10 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L58
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r11.<init>()     // Catch: java.lang.Throwable -> L58
            java.lang.String r12 = "syntax error, expect :, actual "
            r11.append(r12)     // Catch: java.lang.Throwable -> L58
            int r12 = r13.token()     // Catch: java.lang.Throwable -> L58
            r11.append(r12)     // Catch: java.lang.Throwable -> L58
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L58
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L58
            throw r10     // Catch: java.lang.Throwable -> L58
        L161:
            r9.setContext(r3)
            throw r10
    }

    public static java.util.Map parseMap(com.alibaba.fastjson.parser.DefaultJSONParser r10, java.util.Map<java.lang.String, java.lang.Object> r11, java.lang.reflect.Type r12, java.lang.Object r13) {
            com.alibaba.fastjson.parser.JSONLexer r0 = r10.lexer
            int r1 = r0.token()
            r2 = 12
            r3 = 0
            if (r1 == r2) goto L88
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "syntax error, expect {, actual "
            r11.append(r12)
            java.lang.String r12 = r0.tokenName()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            boolean r12 = r13 instanceof java.lang.String
            if (r12 == 0) goto L44
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = ", fieldName "
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            r12.append(r13)
            java.lang.String r11 = r12.toString()
        L44:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = ", "
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = r0.info()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.alibaba.fastjson.JSONArray r12 = new com.alibaba.fastjson.JSONArray
            r12.<init>()
            r10.parseArray(r12, r13)
            int r10 = r12.size()
            r13 = 1
            if (r10 != r13) goto L82
            java.lang.Object r10 = r12.get(r3)
            boolean r12 = r10 instanceof com.alibaba.fastjson.JSONObject
            if (r12 == 0) goto L82
            com.alibaba.fastjson.JSONObject r10 = (com.alibaba.fastjson.JSONObject) r10
            return r10
        L82:
            com.alibaba.fastjson.JSONException r10 = new com.alibaba.fastjson.JSONException
            r10.<init>(r11)
            throw r10
        L88:
            com.alibaba.fastjson.parser.ParseContext r1 = r10.getContext()
        L8c:
            r0.skipWhitespace()     // Catch: java.lang.Throwable -> Laa
            char r2 = r0.getCurrent()     // Catch: java.lang.Throwable -> Laa
            com.alibaba.fastjson.parser.Feature r4 = com.alibaba.fastjson.parser.Feature.AllowArbitraryCommas     // Catch: java.lang.Throwable -> Laa
            boolean r4 = r0.isEnabled(r4)     // Catch: java.lang.Throwable -> Laa
            if (r4 == 0) goto Lad
        L9b:
            r4 = 44
            if (r2 != r4) goto Lad
            r0.next()     // Catch: java.lang.Throwable -> Laa
            r0.skipWhitespace()     // Catch: java.lang.Throwable -> Laa
            char r2 = r0.getCurrent()     // Catch: java.lang.Throwable -> Laa
            goto L9b
        Laa:
            r11 = move-exception
            goto L216
        Lad:
            java.lang.String r4 = "expect ':' at "
            r5 = 58
            r6 = 34
            r7 = 16
            if (r2 != r6) goto Le3
            com.alibaba.fastjson.parser.SymbolTable r2 = r10.getSymbolTable()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = r0.scanSymbol(r2, r6)     // Catch: java.lang.Throwable -> Laa
            r0.skipWhitespace()     // Catch: java.lang.Throwable -> Laa
            char r8 = r0.getCurrent()     // Catch: java.lang.Throwable -> Laa
            if (r8 != r5) goto Lca
            goto L14c
        Lca:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> Laa
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laa
            r12.<init>()     // Catch: java.lang.Throwable -> Laa
            r12.append(r4)     // Catch: java.lang.Throwable -> Laa
            int r13 = r0.pos()     // Catch: java.lang.Throwable -> Laa
            r12.append(r13)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Laa
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Laa
            throw r11     // Catch: java.lang.Throwable -> Laa
        Le3:
            r8 = 125(0x7d, float:1.75E-43)
            if (r2 != r8) goto Lf4
            r0.next()     // Catch: java.lang.Throwable -> Laa
            r0.resetStringPosition()     // Catch: java.lang.Throwable -> Laa
            r0.nextToken(r7)     // Catch: java.lang.Throwable -> Laa
            r10.setContext(r1)
            return r11
        Lf4:
            java.lang.String r8 = "syntax error"
            r9 = 39
            if (r2 != r9) goto L133
            com.alibaba.fastjson.parser.Feature r2 = com.alibaba.fastjson.parser.Feature.AllowSingleQuotes     // Catch: java.lang.Throwable -> Laa
            boolean r2 = r0.isEnabled(r2)     // Catch: java.lang.Throwable -> Laa
            if (r2 == 0) goto L12d
            com.alibaba.fastjson.parser.SymbolTable r2 = r10.getSymbolTable()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = r0.scanSymbol(r2, r9)     // Catch: java.lang.Throwable -> Laa
            r0.skipWhitespace()     // Catch: java.lang.Throwable -> Laa
            char r8 = r0.getCurrent()     // Catch: java.lang.Throwable -> Laa
            if (r8 != r5) goto L114
            goto L14c
        L114:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> Laa
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laa
            r12.<init>()     // Catch: java.lang.Throwable -> Laa
            r12.append(r4)     // Catch: java.lang.Throwable -> Laa
            int r13 = r0.pos()     // Catch: java.lang.Throwable -> Laa
            r12.append(r13)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Laa
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Laa
            throw r11     // Catch: java.lang.Throwable -> Laa
        L12d:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> Laa
            r11.<init>(r8)     // Catch: java.lang.Throwable -> Laa
            throw r11     // Catch: java.lang.Throwable -> Laa
        L133:
            com.alibaba.fastjson.parser.Feature r2 = com.alibaba.fastjson.parser.Feature.AllowUnQuotedFieldNames     // Catch: java.lang.Throwable -> Laa
            boolean r2 = r0.isEnabled(r2)     // Catch: java.lang.Throwable -> Laa
            if (r2 == 0) goto L210
            com.alibaba.fastjson.parser.SymbolTable r2 = r10.getSymbolTable()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = r0.scanSymbolUnQuoted(r2)     // Catch: java.lang.Throwable -> Laa
            r0.skipWhitespace()     // Catch: java.lang.Throwable -> Laa
            char r8 = r0.getCurrent()     // Catch: java.lang.Throwable -> Laa
            if (r8 != r5) goto L1ef
        L14c:
            r0.next()     // Catch: java.lang.Throwable -> Laa
            r0.skipWhitespace()     // Catch: java.lang.Throwable -> Laa
            r0.getCurrent()     // Catch: java.lang.Throwable -> Laa
            r0.resetStringPosition()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r4 = com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY     // Catch: java.lang.Throwable -> Laa
            r5 = 13
            r8 = 0
            if (r2 != r4) goto L1ad
            com.alibaba.fastjson.parser.Feature r4 = com.alibaba.fastjson.parser.Feature.DisableSpecialKeyDetect     // Catch: java.lang.Throwable -> Laa
            boolean r4 = r0.isEnabled(r4)     // Catch: java.lang.Throwable -> Laa
            if (r4 != 0) goto L1ad
            com.alibaba.fastjson.parser.SymbolTable r2 = r10.getSymbolTable()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = r0.scanSymbol(r2, r6)     // Catch: java.lang.Throwable -> Laa
            com.alibaba.fastjson.parser.ParserConfig r4 = r10.getConfig()     // Catch: java.lang.Throwable -> Laa
            java.lang.Class r2 = r4.checkAutoType(r2, r8)     // Catch: java.lang.Throwable -> Laa
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            boolean r6 = r6.isAssignableFrom(r2)     // Catch: java.lang.Throwable -> Laa
            if (r6 == 0) goto L18f
            r0.nextToken(r7)     // Catch: java.lang.Throwable -> Laa
            int r2 = r0.token()     // Catch: java.lang.Throwable -> Laa
            if (r2 != r5) goto L1e7
            r0.nextToken(r7)     // Catch: java.lang.Throwable -> Laa
            r10.setContext(r1)
            return r11
        L18f:
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r11 = r4.getDeserializer(r2)     // Catch: java.lang.Throwable -> Laa
            r0.nextToken(r7)     // Catch: java.lang.Throwable -> Laa
            r12 = 2
            r10.setResolveStatus(r12)     // Catch: java.lang.Throwable -> Laa
            if (r1 == 0) goto L1a3
            boolean r12 = r13 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> Laa
            if (r12 != 0) goto L1a3
            r10.popContext()     // Catch: java.lang.Throwable -> Laa
        L1a3:
            java.lang.Object r11 = r11.deserialze(r10, r2, r13)     // Catch: java.lang.Throwable -> Laa
            java.util.Map r11 = (java.util.Map) r11     // Catch: java.lang.Throwable -> Laa
            r10.setContext(r1)
            return r11
        L1ad:
            r0.nextToken()     // Catch: java.lang.Throwable -> Laa
            if (r3 == 0) goto L1b5
            r10.setContext(r1)     // Catch: java.lang.Throwable -> Laa
        L1b5:
            int r4 = r0.token()     // Catch: java.lang.Throwable -> Laa
            r6 = 8
            if (r4 != r6) goto L1c1
            r0.nextToken()     // Catch: java.lang.Throwable -> Laa
            goto L1c5
        L1c1:
            java.lang.Object r8 = r10.parseObject(r12, r2)     // Catch: java.lang.Throwable -> Laa
        L1c5:
            r11.put(r2, r8)     // Catch: java.lang.Throwable -> Laa
            r10.checkMapResolve(r11, r2)     // Catch: java.lang.Throwable -> Laa
            r10.setContext(r1, r8, r2)     // Catch: java.lang.Throwable -> Laa
            r10.setContext(r1)     // Catch: java.lang.Throwable -> Laa
            int r2 = r0.token()     // Catch: java.lang.Throwable -> Laa
            r4 = 20
            if (r2 == r4) goto L1eb
            r4 = 15
            if (r2 != r4) goto L1de
            goto L1eb
        L1de:
            if (r2 != r5) goto L1e7
            r0.nextToken()     // Catch: java.lang.Throwable -> Laa
            r10.setContext(r1)
            return r11
        L1e7:
            int r3 = r3 + 1
            goto L8c
        L1eb:
            r10.setContext(r1)
            return r11
        L1ef:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> Laa
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laa
            r12.<init>()     // Catch: java.lang.Throwable -> Laa
            r12.append(r4)     // Catch: java.lang.Throwable -> Laa
            int r13 = r0.pos()     // Catch: java.lang.Throwable -> Laa
            r12.append(r13)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r13 = ", actual "
            r12.append(r13)     // Catch: java.lang.Throwable -> Laa
            r12.append(r8)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Laa
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Laa
            throw r11     // Catch: java.lang.Throwable -> Laa
        L210:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> Laa
            r11.<init>(r8)     // Catch: java.lang.Throwable -> Laa
            throw r11     // Catch: java.lang.Throwable -> Laa
        L216:
            r10.setContext(r1)
            throw r11
    }

    protected java.util.Map<java.lang.Object, java.lang.Object> createMap(java.lang.reflect.Type r5) {
            r4 = this;
            java.lang.Class<java.util.Properties> r0 = java.util.Properties.class
            if (r5 != r0) goto La
            java.util.Properties r5 = new java.util.Properties
            r5.<init>()
            return r5
        La:
            java.lang.Class<java.util.Hashtable> r0 = java.util.Hashtable.class
            if (r5 != r0) goto L14
            java.util.Hashtable r5 = new java.util.Hashtable
            r5.<init>()
            return r5
        L14:
            java.lang.Class<java.util.IdentityHashMap> r0 = java.util.IdentityHashMap.class
            if (r5 != r0) goto L1e
            java.util.IdentityHashMap r5 = new java.util.IdentityHashMap
            r5.<init>()
            return r5
        L1e:
            java.lang.Class<java.util.SortedMap> r0 = java.util.SortedMap.class
            if (r5 == r0) goto Lb4
            java.lang.Class<java.util.TreeMap> r0 = java.util.TreeMap.class
            if (r5 != r0) goto L28
            goto Lb4
        L28:
            java.lang.Class<java.util.concurrent.ConcurrentMap> r0 = java.util.concurrent.ConcurrentMap.class
            if (r5 == r0) goto Lae
            java.lang.Class<java.util.concurrent.ConcurrentHashMap> r0 = java.util.concurrent.ConcurrentHashMap.class
            if (r5 != r0) goto L32
            goto Lae
        L32:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            if (r5 == r0) goto La8
            java.lang.Class<java.util.HashMap> r0 = java.util.HashMap.class
            if (r5 != r0) goto L3b
            goto La8
        L3b:
            java.lang.Class<java.util.LinkedHashMap> r0 = java.util.LinkedHashMap.class
            if (r5 != r0) goto L45
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            return r5
        L45:
            boolean r0 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L6b
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type r0 = r5.getRawType()
            java.lang.Class<java.util.EnumMap> r1 = java.util.EnumMap.class
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L66
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            java.util.EnumMap r0 = new java.util.EnumMap
            r1 = 0
            r5 = r5[r1]
            java.lang.Class r5 = (java.lang.Class) r5
            r0.<init>(r5)
            return r0
        L66:
            java.util.Map r5 = r4.createMap(r0)
            return r5
        L6b:
            r0 = r5
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isInterface()
            java.lang.String r2 = "unsupport type "
            if (r1 != 0) goto L93
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Exception -> L7d
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> L7d
            return r0
        L7d:
            r0 = move-exception
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r1.<init>(r5, r0)
            throw r1
        L93:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        La8:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            return r5
        Lae:
            java.util.concurrent.ConcurrentHashMap r5 = new java.util.concurrent.ConcurrentHashMap
            r5.<init>()
            return r5
        Lb4:
            java.util.TreeMap r5 = new java.util.TreeMap
            r5.<init>()
            return r5
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r4, java.lang.reflect.Type r5, java.lang.Object r6) {
            r3 = this;
            java.lang.Class<com.alibaba.fastjson.JSONObject> r0 = com.alibaba.fastjson.JSONObject.class
            if (r5 != r0) goto Lf
            com.alibaba.fastjson.parser.deserializer.FieldTypeResolver r0 = r4.getFieldTypeResolver()
            if (r0 != 0) goto Lf
            com.alibaba.fastjson.JSONObject r4 = r4.parseObject()
            return r4
        Lf:
            com.alibaba.fastjson.parser.JSONLexer r0 = r4.lexer
            int r1 = r0.token()
            r2 = 8
            if (r1 != r2) goto L20
            r4 = 16
            r0.nextToken(r4)
            r4 = 0
            return r4
        L20:
            java.util.Map r0 = r3.createMap(r5)
            com.alibaba.fastjson.parser.ParseContext r1 = r4.getContext()
            r4.setContext(r1, r0, r6)     // Catch: java.lang.Throwable -> L33
            java.lang.Object r5 = r3.deserialze(r4, r5, r6, r0)     // Catch: java.lang.Throwable -> L33
            r4.setContext(r1)
            return r5
        L33:
            r5 = move-exception
            r4.setContext(r1)
            throw r5
    }

    protected java.lang.Object deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r3, java.lang.reflect.Type r4, java.lang.Object r5, java.util.Map r6) {
            r2 = this;
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L22
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r0 = r4.getActualTypeArguments()
            r1 = 0
            r0 = r0[r1]
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            r1 = 1
            r4 = r4[r1]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r1 != r0) goto L1d
            java.util.Map r3 = parseMap(r3, r6, r4, r5)
            return r3
        L1d:
            java.lang.Object r3 = parseMap(r3, r6, r0, r4, r5)
            return r3
        L22:
            java.lang.Object r3 = r3.parseObject(r6, r5)
            return r3
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 12
            return r0
    }
}
