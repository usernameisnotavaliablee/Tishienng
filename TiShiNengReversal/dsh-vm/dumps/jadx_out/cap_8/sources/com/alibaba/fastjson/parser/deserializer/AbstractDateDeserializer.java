package com.alibaba.fastjson.parser.deserializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class AbstractDateDeserializer extends com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer implements com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public AbstractDateDeserializer() {
            r0 = this;
            r0.<init>()
            return
    }

    protected abstract <T> T cast(com.alibaba.fastjson.parser.DefaultJSONParser r1, java.lang.reflect.Type r2, java.lang.Object r3, java.lang.Object r4);

    @Override // com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r7, java.lang.reflect.Type r8, java.lang.Object r9) {
            r6 = this;
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            java.lang.Object r7 = r0.deserialze(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r9, java.lang.reflect.Type r10, java.lang.Object r11, java.lang.String r12, int r13) {
            r8 = this;
            java.lang.String r13 = "yyyy-MM-dd'T'HH:mm:ss"
            java.lang.String r0 = "yyyy-MM-dd'T'HH:mm:ss.SSS"
            com.alibaba.fastjson.parser.JSONLexer r1 = r9.lexer
            int r2 = r1.token()
            r3 = 16
            r4 = 2
            if (r2 != r4) goto L1c
            long r12 = r1.longValue()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r1.nextToken(r3)
            goto L158
        L1c:
            int r2 = r1.token()
            r5 = 4
            r6 = 0
            if (r2 != r5) goto L96
            java.lang.String r2 = r1.stringVal()
            if (r12 == 0) goto L70
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat     // Catch: java.lang.IllegalArgumentException -> L32
            java.util.Locale r5 = com.alibaba.fastjson.JSON.defaultLocale     // Catch: java.lang.IllegalArgumentException -> L32
            r4.<init>(r12, r5)     // Catch: java.lang.IllegalArgumentException -> L32
            goto L52
        L32:
            java.lang.String r4 = "yyyy-MM-ddTHH:mm:ss.SSS"
            boolean r4 = r12.equals(r4)
            if (r4 == 0) goto L42
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            r4.<init>(r0)
            r12 = r0
            goto L52
        L42:
            java.lang.String r4 = "yyyy-MM-ddTHH:mm:ss"
            boolean r4 = r12.equals(r4)
            if (r4 == 0) goto L51
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            r4.<init>(r13)
            r12 = r13
            goto L52
        L51:
            r4 = r6
        L52:
            java.util.Date r6 = r4.parse(r2)     // Catch: java.text.ParseException -> L57
            goto L70
        L57:
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L70
            int r12 = r2.length()
            r0 = 19
            if (r12 != r0) goto L70
            java.text.SimpleDateFormat r12 = new java.text.SimpleDateFormat     // Catch: java.text.ParseException -> L6f
            r12.<init>(r13)     // Catch: java.text.ParseException -> L6f
            java.util.Date r6 = r12.parse(r2)     // Catch: java.text.ParseException -> L6f
            goto L70
        L6f:
        L70:
            if (r6 != 0) goto La1
            r1.nextToken(r3)
            com.alibaba.fastjson.parser.Feature r12 = com.alibaba.fastjson.parser.Feature.AllowISO8601DateFormat
            boolean r12 = r1.isEnabled(r12)
            if (r12 == 0) goto L93
            com.alibaba.fastjson.parser.JSONScanner r12 = new com.alibaba.fastjson.parser.JSONScanner
            r12.<init>(r2)
            boolean r13 = r12.scanISO8601DateIfMatch()
            if (r13 == 0) goto L90
            java.util.Calendar r13 = r12.getCalendar()
            java.util.Date r2 = r13.getTime()
        L90:
            r12.close()
        L93:
            r12 = r2
            goto L158
        L96:
            int r12 = r1.token()
            r13 = 8
            if (r12 != r13) goto La4
            r1.nextToken()
        La1:
            r12 = r6
            goto L158
        La4:
            int r12 = r1.token()
            r13 = 12
            r0 = 13
            r2 = 17
            java.lang.String r7 = "syntax error"
            if (r12 != r13) goto L11b
            r1.nextToken()
            int r12 = r1.token()
            if (r12 != r5) goto L115
            java.lang.String r12 = r1.stringVal()
            java.lang.String r13 = com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto Le2
            r1.nextToken()
            r9.accept(r2)
            java.lang.String r12 = r1.stringVal()
            com.alibaba.fastjson.parser.ParserConfig r13 = r9.getConfig()
            java.lang.Class r12 = r13.checkAutoType(r12, r6)
            if (r12 == 0) goto Ldc
            r10 = r12
        Ldc:
            r9.accept(r5)
            r9.accept(r3)
        Le2:
            r1.nextTokenWithColon(r4)
            int r12 = r1.token()
            if (r12 != r4) goto Lfa
            long r12 = r1.longValue()
            r1.nextToken()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r9.accept(r0)
            goto L158
        Lfa:
            com.alibaba.fastjson.JSONException r9 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "syntax error : "
            r10.append(r11)
            java.lang.String r11 = r1.tokenName()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L115:
            com.alibaba.fastjson.JSONException r9 = new com.alibaba.fastjson.JSONException
            r9.<init>(r7)
            throw r9
        L11b:
            int r12 = r9.getResolveStatus()
            if (r12 != r4) goto L154
            r12 = 0
            r9.setResolveStatus(r12)
            r9.accept(r3)
            int r12 = r1.token()
            if (r12 != r5) goto L14e
            java.lang.String r12 = "val"
            java.lang.String r13 = r1.stringVal()
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L148
            r1.nextToken()
            r9.accept(r2)
            java.lang.Object r12 = r9.parse()
            r9.accept(r0)
            goto L158
        L148:
            com.alibaba.fastjson.JSONException r9 = new com.alibaba.fastjson.JSONException
            r9.<init>(r7)
            throw r9
        L14e:
            com.alibaba.fastjson.JSONException r9 = new com.alibaba.fastjson.JSONException
            r9.<init>(r7)
            throw r9
        L154:
            java.lang.Object r12 = r9.parse()
        L158:
            java.lang.Object r9 = r8.cast(r9, r10, r11, r12)
            return r9
    }
}
