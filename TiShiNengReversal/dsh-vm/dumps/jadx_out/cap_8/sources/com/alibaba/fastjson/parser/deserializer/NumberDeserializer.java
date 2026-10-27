package com.alibaba.fastjson.parser.deserializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class NumberDeserializer implements com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static final com.alibaba.fastjson.parser.deserializer.NumberDeserializer instance = null;

    static {
            com.alibaba.fastjson.parser.deserializer.NumberDeserializer r0 = new com.alibaba.fastjson.parser.deserializer.NumberDeserializer
            r0.<init>()
            com.alibaba.fastjson.parser.deserializer.NumberDeserializer.instance = r0
            return
    }

    public NumberDeserializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r18, java.lang.reflect.Type r19, java.lang.Object r20) {
            r17 = this;
            r0 = r19
            r1 = r18
            com.alibaba.fastjson.parser.JSONLexer r2 = r1.lexer
            int r3 = r2.token()
            r4 = 2
            r6 = 32767(0x7fff, double:1.6189E-319)
            java.lang.String r8 = "short overflow : "
            java.lang.Class<java.lang.Byte> r9 = java.lang.Byte.class
            java.lang.Class r10 = java.lang.Byte.TYPE
            java.lang.Class<java.lang.Short> r11 = java.lang.Short.class
            java.lang.Class r12 = java.lang.Short.TYPE
            java.lang.Class<java.lang.Double> r13 = java.lang.Double.class
            java.lang.Class r14 = java.lang.Double.TYPE
            r15 = -32768(0xffffffffffff8000, double:NaN)
            r5 = 16
            if (r3 != r4) goto Lad
            if (r0 == r14) goto L9d
            if (r0 != r13) goto L27
            goto L9d
        L27:
            long r3 = r2.longValue()
            r2.nextToken(r5)
            if (r0 == r12) goto L79
            if (r0 != r11) goto L33
            goto L79
        L33:
            if (r0 == r10) goto L51
            if (r0 != r9) goto L38
            goto L51
        L38:
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L4c
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L4c
            int r0 = (int) r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L4c:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            return r0
        L51:
            r0 = 127(0x7f, double:6.27E-322)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L64
            r0 = -128(0xffffffffffffff80, double:NaN)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L64
            int r0 = (int) r3
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
        L64:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L79:
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 > 0) goto L88
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 < 0) goto L88
            int r0 = (int) r3
            short r0 = (short) r0
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            return r0
        L88:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9d:
            java.lang.String r0 = r2.numberString()
            r2.nextToken(r5)
            double r0 = java.lang.Double.parseDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        Lad:
            int r3 = r2.token()
            r4 = 3
            if (r3 != r4) goto L116
            if (r0 == r14) goto L106
            if (r0 != r13) goto Lb9
            goto L106
        Lb9:
            java.math.BigDecimal r1 = r2.decimalValue()
            r2.nextToken(r5)
            if (r0 == r12) goto Ld4
            if (r0 != r11) goto Lc5
            goto Ld4
        Lc5:
            if (r0 == r10) goto Lcb
            if (r0 != r9) goto Lca
            goto Lcb
        Lca:
            return r1
        Lcb:
            byte r0 = r1.byteValue()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
        Ld4:
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r6)
            int r0 = r1.compareTo(r0)
            if (r0 > 0) goto Lf1
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r15)
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto Lf1
            short r0 = r1.shortValue()
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            return r0
        Lf1:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L106:
            java.lang.String r0 = r2.numberString()
            r2.nextToken(r5)
            double r0 = java.lang.Double.parseDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L116:
            java.lang.Object r1 = r1.parse()
            if (r1 != 0) goto L11e
            r0 = 0
            return r0
        L11e:
            if (r0 == r14) goto L13c
            if (r0 != r13) goto L123
            goto L13c
        L123:
            if (r0 == r12) goto L137
            if (r0 != r11) goto L128
            goto L137
        L128:
            if (r0 == r10) goto L132
            if (r0 != r9) goto L12d
            goto L132
        L12d:
            java.math.BigDecimal r0 = com.alibaba.fastjson.util.TypeUtils.castToBigDecimal(r1)
            return r0
        L132:
            java.lang.Byte r0 = com.alibaba.fastjson.util.TypeUtils.castToByte(r1)
            return r0
        L137:
            java.lang.Short r0 = com.alibaba.fastjson.util.TypeUtils.castToShort(r1)
            return r0
        L13c:
            java.lang.Double r0 = com.alibaba.fastjson.util.TypeUtils.castToDouble(r1)
            return r0
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 2
            return r0
    }
}
