package com.alibaba.fastjson.parser.deserializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SqlDateDeserializer extends com.alibaba.fastjson.parser.deserializer.AbstractDateDeserializer implements com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static final com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer instance = null;
    public static final com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer instance_timestamp = null;
    private boolean timestamp;

    static {
            com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer r0 = new com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer
            r0.<init>()
            com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer.instance = r0
            com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer r0 = new com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer
            r1 = 1
            r0.<init>(r1)
            com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer.instance_timestamp = r0
            return
    }

    public SqlDateDeserializer() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.timestamp = r0
            return
    }

    public SqlDateDeserializer(boolean r1) {
            r0 = this;
            r0.<init>()
            r1 = 1
            r0.timestamp = r1
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.AbstractDateDeserializer
    protected <T> T cast(com.alibaba.fastjson.parser.DefaultJSONParser r3, java.lang.reflect.Type r4, java.lang.Object r5, java.lang.Object r6) {
            r2 = this;
            boolean r0 = r2.timestamp
            if (r0 == 0) goto L9
            java.lang.Object r3 = r2.castTimestamp(r3, r4, r5, r6)
            return r3
        L9:
            r4 = 0
            if (r6 != 0) goto Ld
            return r4
        Ld:
            boolean r5 = r6 instanceof java.util.Date
            if (r5 == 0) goto L1d
            java.sql.Date r3 = new java.sql.Date
            java.util.Date r6 = (java.util.Date) r6
            long r4 = r6.getTime()
            r3.<init>(r4)
            return r3
        L1d:
            boolean r5 = r6 instanceof java.lang.Number
            if (r5 == 0) goto L2d
            java.sql.Date r3 = new java.sql.Date
            java.lang.Number r6 = (java.lang.Number) r6
            long r4 = r6.longValue()
            r3.<init>(r4)
            return r3
        L2d:
            boolean r5 = r6 instanceof java.lang.String
            if (r5 == 0) goto L76
            java.lang.String r6 = (java.lang.String) r6
            int r5 = r6.length()
            if (r5 != 0) goto L3a
            return r4
        L3a:
            com.alibaba.fastjson.parser.JSONScanner r4 = new com.alibaba.fastjson.parser.JSONScanner
            r4.<init>(r6)
            boolean r5 = r4.scanISO8601DateIfMatch()     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L50
            java.util.Calendar r3 = r4.getCalendar()     // Catch: java.lang.Throwable -> L4e
            long r5 = r3.getTimeInMillis()     // Catch: java.lang.Throwable -> L4e
            goto L69
        L4e:
            r3 = move-exception
            goto L72
        L50:
            java.text.DateFormat r3 = r3.getDateFormat()     // Catch: java.lang.Throwable -> L4e
            java.util.Date r3 = r3.parse(r6)     // Catch: java.lang.Throwable -> L4e java.text.ParseException -> L65
            java.sql.Date r5 = new java.sql.Date     // Catch: java.lang.Throwable -> L4e java.text.ParseException -> L65
            long r0 = r3.getTime()     // Catch: java.lang.Throwable -> L4e java.text.ParseException -> L65
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L4e java.text.ParseException -> L65
            r4.close()
            return r5
        L65:
            long r5 = java.lang.Long.parseLong(r6)     // Catch: java.lang.Throwable -> L4e
        L69:
            r4.close()
            java.sql.Date r3 = new java.sql.Date
            r3.<init>(r5)
            return r3
        L72:
            r4.close()
            throw r3
        L76:
            com.alibaba.fastjson.JSONException r3 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "parse error : "
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    protected <T> T castTimestamp(com.alibaba.fastjson.parser.DefaultJSONParser r3, java.lang.reflect.Type r4, java.lang.Object r5, java.lang.Object r6) {
            r2 = this;
            r4 = 0
            if (r6 != 0) goto L4
            return r4
        L4:
            boolean r5 = r6 instanceof java.util.Date
            if (r5 == 0) goto L14
            java.sql.Timestamp r3 = new java.sql.Timestamp
            java.util.Date r6 = (java.util.Date) r6
            long r4 = r6.getTime()
            r3.<init>(r4)
            return r3
        L14:
            boolean r5 = r6 instanceof java.lang.Number
            if (r5 == 0) goto L24
            java.sql.Timestamp r3 = new java.sql.Timestamp
            java.lang.Number r6 = (java.lang.Number) r6
            long r4 = r6.longValue()
            r3.<init>(r4)
            return r3
        L24:
            boolean r5 = r6 instanceof java.lang.String
            if (r5 == 0) goto L6d
            java.lang.String r6 = (java.lang.String) r6
            int r5 = r6.length()
            if (r5 != 0) goto L31
            return r4
        L31:
            com.alibaba.fastjson.parser.JSONScanner r4 = new com.alibaba.fastjson.parser.JSONScanner
            r4.<init>(r6)
            boolean r5 = r4.scanISO8601DateIfMatch()     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L47
            java.util.Calendar r3 = r4.getCalendar()     // Catch: java.lang.Throwable -> L45
            long r5 = r3.getTimeInMillis()     // Catch: java.lang.Throwable -> L45
            goto L60
        L45:
            r3 = move-exception
            goto L69
        L47:
            java.text.DateFormat r3 = r3.getDateFormat()     // Catch: java.lang.Throwable -> L45
            java.util.Date r3 = r3.parse(r6)     // Catch: java.lang.Throwable -> L45 java.text.ParseException -> L5c
            java.sql.Timestamp r5 = new java.sql.Timestamp     // Catch: java.lang.Throwable -> L45 java.text.ParseException -> L5c
            long r0 = r3.getTime()     // Catch: java.lang.Throwable -> L45 java.text.ParseException -> L5c
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L45 java.text.ParseException -> L5c
            r4.close()
            return r5
        L5c:
            long r5 = java.lang.Long.parseLong(r6)     // Catch: java.lang.Throwable -> L45
        L60:
            r4.close()
            java.sql.Timestamp r3 = new java.sql.Timestamp
            r3.<init>(r5)
            return r3
        L69:
            r4.close()
            throw r3
        L6d:
            com.alibaba.fastjson.JSONException r3 = new com.alibaba.fastjson.JSONException
            java.lang.String r4 = "parse error"
            r3.<init>(r4)
            throw r3
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 2
            return r0
    }
}
