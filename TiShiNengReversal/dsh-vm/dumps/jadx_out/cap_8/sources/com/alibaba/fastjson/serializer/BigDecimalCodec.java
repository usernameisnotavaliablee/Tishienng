package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BigDecimalCodec implements com.alibaba.fastjson.serializer.ObjectSerializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static final com.alibaba.fastjson.serializer.BigDecimalCodec instance = null;

    static {
            com.alibaba.fastjson.serializer.BigDecimalCodec r0 = new com.alibaba.fastjson.serializer.BigDecimalCodec
            r0.<init>()
            com.alibaba.fastjson.serializer.BigDecimalCodec.instance = r0
            return
    }

    public BigDecimalCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r4) {
            com.alibaba.fastjson.parser.JSONLexer r0 = r4.lexer
            int r1 = r0.token()
            r2 = 2
            r3 = 16
            if (r1 != r2) goto L13
            java.math.BigDecimal r4 = r0.decimalValue()
            r0.nextToken(r3)
            return r4
        L13:
            int r1 = r0.token()
            r2 = 3
            if (r1 != r2) goto L22
            java.math.BigDecimal r4 = r0.decimalValue()
            r0.nextToken(r3)
            return r4
        L22:
            java.lang.Object r4 = r4.parse()
            if (r4 != 0) goto L2a
            r4 = 0
            return r4
        L2a:
            java.math.BigDecimal r4 = com.alibaba.fastjson.util.TypeUtils.castToBigDecimal(r4)
            return r4
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r1, java.lang.reflect.Type r2, java.lang.Object r3) {
            r0 = this;
            java.lang.Object r1 = deserialze(r1)
            return r1
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 2
            return r0
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, int r5) throws java.io.IOException {
            r0 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r1.out
            if (r2 != 0) goto La
            com.alibaba.fastjson.serializer.SerializerFeature r2 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullNumberAsZero
            r1.writeNull(r2)
            return
        La:
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.WriteBigDecimalAsPlain
            boolean r3 = r1.isEnabled(r3)
            if (r3 == 0) goto L19
            java.lang.String r3 = r2.toPlainString()
            goto L1d
        L19:
            java.lang.String r3 = r2.toString()
        L1d:
            r1.write(r3)
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName
            boolean r3 = r1.isEnabled(r3)
            if (r3 == 0) goto L37
            java.lang.Class<java.math.BigDecimal> r3 = java.math.BigDecimal.class
            if (r4 == r3) goto L37
            int r2 = r2.scale()
            if (r2 != 0) goto L37
            r2 = 46
            r1.write(r2)
        L37:
            return
    }
}
