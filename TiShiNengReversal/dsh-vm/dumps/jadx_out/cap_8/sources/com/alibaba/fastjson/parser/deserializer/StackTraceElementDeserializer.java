package com.alibaba.fastjson.parser.deserializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class StackTraceElementDeserializer implements com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static final com.alibaba.fastjson.parser.deserializer.StackTraceElementDeserializer instance = null;

    static {
            com.alibaba.fastjson.parser.deserializer.StackTraceElementDeserializer r0 = new com.alibaba.fastjson.parser.deserializer.StackTraceElementDeserializer
            r0.<init>()
            com.alibaba.fastjson.parser.deserializer.StackTraceElementDeserializer.instance = r0
            return
    }

    public StackTraceElementDeserializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r17, java.lang.reflect.Type r18, java.lang.Object r19) {
            r16 = this;
            r0 = r17
            com.alibaba.fastjson.parser.JSONLexer r1 = r0.lexer
            int r2 = r1.token()
            r3 = 0
            r4 = 8
            if (r2 != r4) goto L11
            r1.nextToken()
            return r3
        L11:
            int r2 = r1.token()
            r5 = 12
            r6 = 16
            if (r2 == r5) goto L41
            int r2 = r1.token()
            if (r2 != r6) goto L22
            goto L41
        L22:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "syntax error: "
            r2.append(r3)
            int r1 = r1.token()
            java.lang.String r1 = com.alibaba.fastjson.parser.JSONToken.name(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L41:
            r2 = 0
            r5 = r3
            r7 = r5
            r8 = r7
            r9 = 0
        L46:
            com.alibaba.fastjson.parser.SymbolTable r10 = r0.getSymbolTable()
            java.lang.String r10 = r1.scanSymbol(r10)
            r11 = 13
            if (r10 != 0) goto L6c
            int r12 = r1.token()
            if (r12 != r11) goto L5d
            r1.nextToken(r6)
            goto L1ab
        L5d:
            int r12 = r1.token()
            if (r12 != r6) goto L6c
            com.alibaba.fastjson.parser.Feature r12 = com.alibaba.fastjson.parser.Feature.AllowArbitraryCommas
            boolean r12 = r1.isEnabled(r12)
            if (r12 == 0) goto L6c
            goto L46
        L6c:
            r12 = 4
            r1.nextTokenWithColon(r12)
            java.lang.String r13 = "className"
            boolean r13 = r13.equals(r10)
            java.lang.String r14 = "syntax error"
            if (r13 == 0) goto L95
            int r5 = r1.token()
            if (r5 != r4) goto L83
            r5 = r3
            goto L1a2
        L83:
            int r5 = r1.token()
            if (r5 != r12) goto L8f
            java.lang.String r5 = r1.stringVal()
            goto L1a2
        L8f:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r14)
            throw r0
        L95:
            java.lang.String r13 = "methodName"
            boolean r13 = r13.equals(r10)
            if (r13 == 0) goto Lb8
            int r7 = r1.token()
            if (r7 != r4) goto La6
            r7 = r3
            goto L1a2
        La6:
            int r7 = r1.token()
            if (r7 != r12) goto Lb2
            java.lang.String r7 = r1.stringVal()
            goto L1a2
        Lb2:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r14)
            throw r0
        Lb8:
            java.lang.String r13 = "fileName"
            boolean r13 = r13.equals(r10)
            if (r13 == 0) goto Ldb
            int r8 = r1.token()
            if (r8 != r4) goto Lc9
            r8 = r3
            goto L1a2
        Lc9:
            int r8 = r1.token()
            if (r8 != r12) goto Ld5
            java.lang.String r8 = r1.stringVal()
            goto L1a2
        Ld5:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r14)
            throw r0
        Ldb:
            java.lang.String r13 = "lineNumber"
            boolean r13 = r13.equals(r10)
            if (r13 == 0) goto Lff
            int r9 = r1.token()
            if (r9 != r4) goto Lec
            r9 = 0
            goto L1a2
        Lec:
            int r9 = r1.token()
            r10 = 2
            if (r9 != r10) goto Lf9
            int r9 = r1.intValue()
            goto L1a2
        Lf9:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r14)
            throw r0
        Lff:
            java.lang.String r13 = "nativeMethod"
            boolean r13 = r13.equals(r10)
            if (r13 == 0) goto L130
            int r10 = r1.token()
            if (r10 != r4) goto L112
            r1.nextToken(r6)
            goto L1a2
        L112:
            int r10 = r1.token()
            r12 = 6
            if (r10 != r12) goto L11e
            r1.nextToken(r6)
            goto L1a2
        L11e:
            int r10 = r1.token()
            r12 = 7
            if (r10 != r12) goto L12a
            r1.nextToken(r6)
            goto L1a2
        L12a:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r14)
            throw r0
        L130:
            java.lang.String r13 = com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY
            java.lang.String r15 = "syntax error : "
            if (r10 != r13) goto L16b
            int r10 = r1.token()
            if (r10 != r12) goto L15e
            java.lang.String r10 = r1.stringVal()
            java.lang.String r12 = "java.lang.StackTraceElement"
            boolean r12 = r10.equals(r12)
            if (r12 == 0) goto L149
            goto L1a2
        L149:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L15e:
            int r10 = r1.token()
            if (r10 != r4) goto L165
            goto L1a2
        L165:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r14)
            throw r0
        L16b:
            java.lang.String r13 = "moduleName"
            boolean r13 = r13.equals(r10)
            if (r13 == 0) goto L18a
            int r10 = r1.token()
            if (r10 != r4) goto L17a
            goto L1a2
        L17a:
            int r10 = r1.token()
            if (r10 != r12) goto L184
            r1.stringVal()
            goto L1a2
        L184:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r14)
            throw r0
        L18a:
            java.lang.String r13 = "moduleVersion"
            boolean r13 = r13.equals(r10)
            if (r13 == 0) goto L1b7
            int r10 = r1.token()
            if (r10 != r4) goto L199
            goto L1a2
        L199:
            int r10 = r1.token()
            if (r10 != r12) goto L1b1
            r1.stringVal()
        L1a2:
            int r10 = r1.token()
            if (r10 != r11) goto L46
            r1.nextToken(r6)
        L1ab:
            java.lang.StackTraceElement r0 = new java.lang.StackTraceElement
            r0.<init>(r5, r7, r8, r9)
            return r0
        L1b1:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r14)
            throw r0
        L1b7:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 12
            return r0
    }
}
