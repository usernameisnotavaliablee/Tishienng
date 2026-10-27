package com.alibaba.fastjson.parser.deserializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TimeDeserializer implements com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static final com.alibaba.fastjson.parser.deserializer.TimeDeserializer instance = null;

    static {
            com.alibaba.fastjson.parser.deserializer.TimeDeserializer r0 = new com.alibaba.fastjson.parser.deserializer.TimeDeserializer
            r0.<init>()
            com.alibaba.fastjson.parser.deserializer.TimeDeserializer.instance = r0
            return
    }

    public TimeDeserializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r5, java.lang.reflect.Type r6, java.lang.Object r7) {
            r4 = this;
            com.alibaba.fastjson.parser.JSONLexer r6 = r5.lexer
            int r7 = r6.token()
            r0 = 16
            if (r7 != r0) goto L4a
            r5 = 4
            r6.nextToken(r5)
            int r7 = r6.token()
            java.lang.String r1 = "syntax error"
            if (r7 != r5) goto L44
            r5 = 2
            r6.nextTokenWithColon(r5)
            int r7 = r6.token()
            if (r7 != r5) goto L3e
            long r2 = r6.longValue()
            r5 = 13
            r6.nextToken(r5)
            int r7 = r6.token()
            if (r7 != r5) goto L38
            r6.nextToken(r0)
            java.sql.Time r5 = new java.sql.Time
            r5.<init>(r2)
            return r5
        L38:
            com.alibaba.fastjson.JSONException r5 = new com.alibaba.fastjson.JSONException
            r5.<init>(r1)
            throw r5
        L3e:
            com.alibaba.fastjson.JSONException r5 = new com.alibaba.fastjson.JSONException
            r5.<init>(r1)
            throw r5
        L44:
            com.alibaba.fastjson.JSONException r5 = new com.alibaba.fastjson.JSONException
            r5.<init>(r1)
            throw r5
        L4a:
            java.lang.Object r5 = r5.parse()
            r6 = 0
            if (r5 != 0) goto L52
            return r6
        L52:
            boolean r7 = r5 instanceof java.sql.Time
            if (r7 == 0) goto L57
            return r5
        L57:
            boolean r7 = r5 instanceof java.lang.Number
            if (r7 == 0) goto L67
            java.sql.Time r6 = new java.sql.Time
            java.lang.Number r5 = (java.lang.Number) r5
            long r0 = r5.longValue()
            r6.<init>(r0)
            return r6
        L67:
            boolean r7 = r5 instanceof java.lang.String
            if (r7 == 0) goto Lb4
            java.lang.String r5 = (java.lang.String) r5
            int r7 = r5.length()
            if (r7 != 0) goto L74
            return r6
        L74:
            com.alibaba.fastjson.parser.JSONScanner r6 = new com.alibaba.fastjson.parser.JSONScanner
            r6.<init>(r5)
            boolean r7 = r6.scanISO8601DateIfMatch()
            if (r7 == 0) goto L88
            java.util.Calendar r5 = r6.getCalendar()
            long r0 = r5.getTimeInMillis()
            goto Lab
        L88:
            r7 = 0
        L89:
            int r0 = r5.length()
            if (r7 >= r0) goto La7
            char r0 = r5.charAt(r7)
            r1 = 48
            if (r0 < r1) goto L9f
            r1 = 57
            if (r0 <= r1) goto L9c
            goto L9f
        L9c:
            int r7 = r7 + 1
            goto L89
        L9f:
            r6.close()
            java.sql.Time r5 = java.sql.Time.valueOf(r5)
            return r5
        La7:
            long r0 = java.lang.Long.parseLong(r5)
        Lab:
            r6.close()
            java.sql.Time r5 = new java.sql.Time
            r5.<init>(r0)
            return r5
        Lb4:
            com.alibaba.fastjson.JSONException r5 = new com.alibaba.fastjson.JSONException
            java.lang.String r6 = "parse error"
            r5.<init>(r6)
            throw r5
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 2
            return r0
    }
}
