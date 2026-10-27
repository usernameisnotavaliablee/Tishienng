package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CalendarCodec implements com.alibaba.fastjson.serializer.ObjectSerializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static final com.alibaba.fastjson.serializer.CalendarCodec instance = null;
    private javax.xml.datatype.DatatypeFactory dateFactory;

    static {
            com.alibaba.fastjson.serializer.CalendarCodec r0 = new com.alibaba.fastjson.serializer.CalendarCodec
            r0.<init>()
            com.alibaba.fastjson.serializer.CalendarCodec.instance = r0
            return
    }

    public CalendarCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    public javax.xml.datatype.XMLGregorianCalendar createXMLGregorianCalendar(java.util.Calendar r3) {
            r2 = this;
            javax.xml.datatype.DatatypeFactory r0 = r2.dateFactory
            if (r0 != 0) goto L14
            javax.xml.datatype.DatatypeFactory r0 = javax.xml.datatype.DatatypeFactory.newInstance()     // Catch: javax.xml.datatype.DatatypeConfigurationException -> Lb
            r2.dateFactory = r0     // Catch: javax.xml.datatype.DatatypeConfigurationException -> Lb
            goto L14
        Lb:
            r3 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not obtain an instance of DatatypeFactory."
            r0.<init>(r1, r3)
            throw r0
        L14:
            javax.xml.datatype.DatatypeFactory r0 = r2.dateFactory
            java.util.GregorianCalendar r3 = (java.util.GregorianCalendar) r3
            javax.xml.datatype.XMLGregorianCalendar r3 = r0.newXMLGregorianCalendar(r3)
            return r3
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r2, java.lang.reflect.Type r3, java.lang.Object r4) {
            r1 = this;
            com.alibaba.fastjson.serializer.DateCodec r0 = com.alibaba.fastjson.serializer.DateCodec.instance
            java.lang.Object r4 = r0.deserialze(r2, r3, r4)
            boolean r0 = r4 instanceof java.util.Calendar
            if (r0 == 0) goto Lb
            return r4
        Lb:
            java.util.Date r4 = (java.util.Date) r4
            if (r4 != 0) goto L11
            r2 = 0
            return r2
        L11:
            com.alibaba.fastjson.parser.JSONLexer r2 = r2.lexer
            java.util.TimeZone r0 = r2.getTimeZone()
            java.util.Locale r2 = r2.getLocale()
            java.util.Calendar r2 = java.util.Calendar.getInstance(r0, r2)
            r2.setTime(r4)
            java.lang.Class<javax.xml.datatype.XMLGregorianCalendar> r4 = javax.xml.datatype.XMLGregorianCalendar.class
            if (r3 != r4) goto L2c
            java.util.GregorianCalendar r2 = (java.util.GregorianCalendar) r2
            javax.xml.datatype.XMLGregorianCalendar r2 = r1.createXMLGregorianCalendar(r2)
        L2c:
            return r2
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
            boolean r3 = r1 instanceof javax.xml.datatype.XMLGregorianCalendar
            if (r3 == 0) goto L17
            javax.xml.datatype.XMLGregorianCalendar r1 = (javax.xml.datatype.XMLGregorianCalendar) r1
            java.util.GregorianCalendar r1 = r1.toGregorianCalendar()
            goto L19
        L17:
            java.util.Calendar r1 = (java.util.Calendar) r1
        L19:
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.UseISO8601DateFormat
            boolean r3 = r2.isEnabled(r3)
            if (r3 == 0) goto L10b
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.UseSingleQuotes
            boolean r0 = r2.isEnabled(r0)
            if (r0 == 0) goto L2c
            r0 = 39
            goto L2e
        L2c:
            r0 = 34
        L2e:
            r2.append(r0)
            r3 = 1
            int r4 = r1.get(r3)
            r5 = 2
            int r5 = r1.get(r5)
            int r5 = r5 + r3
            r6 = 5
            int r6 = r1.get(r6)
            r7 = 11
            int r7 = r1.get(r7)
            r8 = 12
            int r8 = r1.get(r8)
            r9 = 13
            int r10 = r1.get(r9)
            r11 = 14
            int r11 = r1.get(r11)
            r12 = 16
            r13 = 19
            r3 = 10
            if (r11 == 0) goto L81
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
            goto Lb3
        L81:
            r11 = 7
            r15 = 4
            if (r10 != 0) goto L99
            if (r8 != 0) goto L99
            if (r7 != 0) goto L99
            java.lang.String r7 = "0000-00-00"
            char[] r14 = r7.toCharArray()
            com.alibaba.fastjson.util.IOUtils.getChars(r6, r3, r14)
            com.alibaba.fastjson.util.IOUtils.getChars(r5, r11, r14)
            com.alibaba.fastjson.util.IOUtils.getChars(r4, r15, r14)
            goto Lb3
        L99:
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
        Lb3:
            r2.write(r14)
            java.util.TimeZone r1 = r1.getTimeZone()
            int r1 = r1.getRawOffset()
            r3 = 3600000(0x36ee80, float:5.044674E-39)
            int r1 = r1 / r3
            if (r1 != 0) goto Lca
            java.lang.String r1 = "Z"
            r2.append(r1)
            goto L107
        Lca:
            r3 = 0
            java.lang.String r4 = ":00"
            java.lang.String r5 = "%02d"
            if (r1 <= 0) goto Lec
            java.lang.String r6 = "+"
            com.alibaba.fastjson.serializer.SerializeWriter r6 = r2.append(r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r3] = r1
            java.lang.String r1 = java.lang.String.format(r5, r7)
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r6.append(r1)
            r1.append(r4)
            goto L107
        Lec:
            r7 = 1
            java.lang.String r6 = "-"
            com.alibaba.fastjson.serializer.SerializeWriter r6 = r2.append(r6)
            int r1 = -r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r3] = r1
            java.lang.String r1 = java.lang.String.format(r5, r7)
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r6.append(r1)
            r1.append(r4)
        L107:
            r2.append(r0)
            return
        L10b:
            java.util.Date r1 = r1.getTime()
            r0.write(r1)
            return
    }
}
