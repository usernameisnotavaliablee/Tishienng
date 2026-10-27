package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DateCodec extends com.alibaba.fastjson.parser.deserializer.AbstractDateDeserializer implements com.alibaba.fastjson.serializer.ObjectSerializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static final com.alibaba.fastjson.serializer.DateCodec instance = null;

    static {
            com.alibaba.fastjson.serializer.DateCodec r0 = new com.alibaba.fastjson.serializer.DateCodec
            r0.<init>()
            com.alibaba.fastjson.serializer.DateCodec.instance = r0
            return
    }

    public DateCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.AbstractDateDeserializer
    protected <T> T cast(com.alibaba.fastjson.parser.DefaultJSONParser r3, java.lang.reflect.Type r4, java.lang.Object r5, java.lang.Object r6) {
            r2 = this;
            r5 = 0
            if (r6 != 0) goto L4
            return r5
        L4:
            boolean r0 = r6 instanceof java.util.Date
            if (r0 == 0) goto L9
            return r6
        L9:
            boolean r0 = r6 instanceof java.lang.Number
            if (r0 == 0) goto L19
            java.util.Date r3 = new java.util.Date
            java.lang.Number r6 = (java.lang.Number) r6
            long r4 = r6.longValue()
            r3.<init>(r4)
            return r3
        L19:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto La5
            java.lang.String r6 = (java.lang.String) r6
            int r0 = r6.length()
            if (r0 != 0) goto L26
            return r5
        L26:
            com.alibaba.fastjson.parser.JSONScanner r0 = new com.alibaba.fastjson.parser.JSONScanner
            r0.<init>(r6)
            r1 = 0
            boolean r1 = r0.scanISO8601DateIfMatch(r1)     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L48
            java.util.Calendar r3 = r0.getCalendar()     // Catch: java.lang.Throwable -> L46
            java.lang.Class<java.util.Calendar> r5 = java.util.Calendar.class
            if (r4 != r5) goto L3e
            r0.close()
            return r3
        L3e:
            java.util.Date r3 = r3.getTime()     // Catch: java.lang.Throwable -> L46
            r0.close()
            return r3
        L46:
            r3 = move-exception
            goto La1
        L48:
            r0.close()
            int r4 = r6.length()
            java.lang.String r0 = r3.getDateFomartPattern()
            int r0 = r0.length()
            if (r4 != r0) goto L63
            java.text.DateFormat r3 = r3.getDateFormat()
            java.util.Date r3 = r3.parse(r6)     // Catch: java.text.ParseException -> L62
            return r3
        L62:
        L63:
            java.lang.String r3 = "/Date("
            boolean r3 = r6.startsWith(r3)
            if (r3 == 0) goto L7e
            java.lang.String r3 = ")/"
            boolean r3 = r6.endsWith(r3)
            if (r3 == 0) goto L7e
            int r3 = r6.length()
            int r3 = r3 + (-2)
            r4 = 6
            java.lang.String r6 = r6.substring(r4, r3)
        L7e:
            java.lang.String r3 = "0000-00-00"
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto La0
            java.lang.String r3 = "0000-00-00T00:00:00"
            boolean r3 = r3.equalsIgnoreCase(r6)
            if (r3 != 0) goto La0
            java.lang.String r3 = "0001-01-01T00:00:00+08:00"
            boolean r3 = r3.equalsIgnoreCase(r6)
            if (r3 == 0) goto L97
            goto La0
        L97:
            long r3 = java.lang.Long.parseLong(r6)
            java.util.Date r5 = new java.util.Date
            r5.<init>(r3)
        La0:
            return r5
        La1:
            r0.close()
            throw r3
        La5:
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

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r18, java.lang.Object r19, java.lang.Object r20, java.lang.reflect.Type r21, int r22) throws java.io.IOException {
            r17 = this;
            r0 = r18
            r1 = r19
            com.alibaba.fastjson.serializer.SerializeWriter r2 = r0.out
            if (r1 != 0) goto Lc
            r2.writeNull()
            return
        Lc:
            boolean r3 = r1 instanceof java.util.Date
            if (r3 == 0) goto L14
            r3 = r1
            java.util.Date r3 = (java.util.Date) r3
            goto L18
        L14:
            java.util.Date r3 = com.alibaba.fastjson.util.TypeUtils.castToDate(r1)
        L18:
            com.alibaba.fastjson.serializer.SerializerFeature r4 = com.alibaba.fastjson.serializer.SerializerFeature.WriteDateUseDateFormat
            boolean r4 = r2.isEnabled(r4)
            if (r4 == 0) goto L3c
            java.text.DateFormat r1 = r0.getDateFormat()
            if (r1 != 0) goto L34
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r4 = com.alibaba.fastjson.JSON.DEFFAULT_DATE_FORMAT
            java.util.Locale r5 = r0.locale
            r1.<init>(r4, r5)
            java.util.TimeZone r0 = r0.timeZone
            r1.setTimeZone(r0)
        L34:
            java.lang.String r0 = r1.format(r3)
            r2.writeString(r0)
            return
        L3c:
            com.alibaba.fastjson.serializer.SerializerFeature r4 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName
            boolean r4 = r2.isEnabled(r4)
            if (r4 == 0) goto L92
            java.lang.Class r4 = r1.getClass()
            r5 = r21
            if (r4 == r5) goto L92
            java.lang.Class r3 = r1.getClass()
            java.lang.Class<java.util.Date> r4 = java.util.Date.class
            if (r3 != r4) goto L69
            java.lang.String r0 = "new Date("
            r2.write(r0)
            r0 = r1
            java.util.Date r0 = (java.util.Date) r0
            long r0 = r0.getTime()
            r2.writeLong(r0)
            r0 = 41
            r2.write(r0)
            return
        L69:
            r3 = 123(0x7b, float:1.72E-43)
            r2.write(r3)
            java.lang.String r3 = com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY
            r2.writeFieldName(r3)
            java.lang.Class r3 = r1.getClass()
            java.lang.String r3 = r3.getName()
            r0.write(r3)
            r0 = r1
            java.util.Date r0 = (java.util.Date) r0
            long r0 = r0.getTime()
            r3 = 44
            java.lang.String r4 = "val"
            r2.writeFieldValue(r3, r4, r0)
            r0 = 125(0x7d, float:1.75E-43)
            r2.write(r0)
            return
        L92:
            long r3 = r3.getTime()
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.UseISO8601DateFormat
            boolean r1 = r2.isEnabled(r1)
            if (r1 == 0) goto L18e
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.UseSingleQuotes
            boolean r1 = r2.isEnabled(r1)
            if (r1 == 0) goto La9
            r1 = 39
            goto Lab
        La9:
            r1 = 34
        Lab:
            r2.write(r1)
            java.util.TimeZone r5 = r0.timeZone
            java.util.Locale r0 = r0.locale
            java.util.Calendar r0 = java.util.Calendar.getInstance(r5, r0)
            r0.setTimeInMillis(r3)
            r3 = 1
            int r4 = r0.get(r3)
            r5 = 2
            int r5 = r0.get(r5)
            int r5 = r5 + r3
            r6 = 5
            int r6 = r0.get(r6)
            r7 = 11
            int r7 = r0.get(r7)
            r8 = 12
            int r8 = r0.get(r8)
            r9 = 13
            int r10 = r0.get(r9)
            r11 = 14
            int r11 = r0.get(r11)
            r12 = 16
            r13 = 19
            r3 = 10
            if (r11 == 0) goto L109
            java.lang.String r16 = "0000-00-00T00:00:00.000"
            char[] r14 = r16.toCharArray()
            r15 = 23
            com.alibaba.fastjson.util.IOUtils.getChars(r11, r15, r14)
            com.alibaba.fastjson.util.IOUtils.getChars(r10, r13, r14)
            com.alibaba.fastjson.util.IOUtils.getChars(r8, r12, r14)
            com.alibaba.fastjson.util.IOUtils.getChars(r7, r9, r14)
            com.alibaba.fastjson.util.IOUtils.getChars(r6, r3, r14)
            r11 = 7
            com.alibaba.fastjson.util.IOUtils.getChars(r5, r11, r14)
            r15 = 4
            com.alibaba.fastjson.util.IOUtils.getChars(r4, r15, r14)
            goto L13b
        L109:
            r11 = 7
            r15 = 4
            if (r10 != 0) goto L121
            if (r8 != 0) goto L121
            if (r7 != 0) goto L121
            java.lang.String r7 = "0000-00-00"
            char[] r14 = r7.toCharArray()
            com.alibaba.fastjson.util.IOUtils.getChars(r6, r3, r14)
            com.alibaba.fastjson.util.IOUtils.getChars(r5, r11, r14)
            com.alibaba.fastjson.util.IOUtils.getChars(r4, r15, r14)
            goto L13b
        L121:
            java.lang.String r11 = "0000-00-00T00:00:00"
            char[] r14 = r11.toCharArray()
            com.alibaba.fastjson.util.IOUtils.getChars(r10, r13, r14)
            com.alibaba.fastjson.util.IOUtils.getChars(r8, r12, r14)
            com.alibaba.fastjson.util.IOUtils.getChars(r7, r9, r14)
            com.alibaba.fastjson.util.IOUtils.getChars(r6, r3, r14)
            r11 = 7
            com.alibaba.fastjson.util.IOUtils.getChars(r5, r11, r14)
            r15 = 4
            com.alibaba.fastjson.util.IOUtils.getChars(r4, r15, r14)
        L13b:
            r2.write(r14)
            java.util.TimeZone r0 = r0.getTimeZone()
            int r0 = r0.getRawOffset()
            r3 = 3600000(0x36ee80, float:5.044674E-39)
            int r0 = r0 / r3
            if (r0 != 0) goto L152
            r0 = 90
            r2.write(r0)
            goto L18a
        L152:
            r3 = 0
            java.lang.String r4 = "%02d"
            if (r0 <= 0) goto L16e
            r5 = 43
            com.alibaba.fastjson.serializer.SerializeWriter r5 = r2.append(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r0
            java.lang.String r0 = java.lang.String.format(r4, r6)
            r5.append(r0)
            goto L185
        L16e:
            r6 = 1
            r5 = 45
            com.alibaba.fastjson.serializer.SerializeWriter r5 = r2.append(r5)
            int r0 = -r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r0
            java.lang.String r0 = java.lang.String.format(r4, r6)
            r5.append(r0)
        L185:
            java.lang.String r0 = ":00"
            r2.append(r0)
        L18a:
            r2.write(r1)
            return
        L18e:
            r2.writeLong(r3)
            return
    }
}
