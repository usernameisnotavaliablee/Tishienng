package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BigIntegerCodec implements com.alibaba.fastjson.serializer.ObjectSerializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static final com.alibaba.fastjson.serializer.BigIntegerCodec instance = null;

    static {
            com.alibaba.fastjson.serializer.BigIntegerCodec r0 = new com.alibaba.fastjson.serializer.BigIntegerCodec
            r0.<init>()
            com.alibaba.fastjson.serializer.BigIntegerCodec.instance = r0
            return
    }

    public BigIntegerCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r3) {
            com.alibaba.fastjson.parser.JSONLexer r0 = r3.lexer
            int r1 = r0.token()
            r2 = 2
            if (r1 != r2) goto L18
            java.lang.String r3 = r0.numberString()
            r1 = 16
            r0.nextToken(r1)
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r3)
            return r0
        L18:
            java.lang.Object r3 = r3.parse()
            if (r3 != 0) goto L20
            r3 = 0
            return r3
        L20:
            java.math.BigInteger r3 = com.alibaba.fastjson.util.TypeUtils.castToBigInteger(r3)
            return r3
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
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            java.lang.String r2 = r2.toString()
            r1.write(r2)
            return
    }
}
