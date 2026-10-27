package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FloatCodec implements com.alibaba.fastjson.serializer.ObjectSerializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static com.alibaba.fastjson.serializer.FloatCodec instance;
    private java.text.NumberFormat decimalFormat;

    static {
            com.alibaba.fastjson.serializer.FloatCodec r0 = new com.alibaba.fastjson.serializer.FloatCodec
            r0.<init>()
            com.alibaba.fastjson.serializer.FloatCodec.instance = r0
            return
    }

    public FloatCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    public FloatCodec(java.lang.String r2) {
            r1 = this;
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public FloatCodec(java.text.DecimalFormat r1) {
            r0 = this;
            r0.<init>()
            r0.decimalFormat = r1
            return
    }

    public static <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r4) {
            com.alibaba.fastjson.parser.JSONLexer r0 = r4.lexer
            int r1 = r0.token()
            r2 = 2
            r3 = 16
            if (r1 != r2) goto L1b
            java.lang.String r4 = r0.numberString()
            r0.nextToken(r3)
            float r4 = java.lang.Float.parseFloat(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            return r4
        L1b:
            int r1 = r0.token()
            r2 = 3
            if (r1 != r2) goto L2e
            float r4 = r0.floatValue()
            r0.nextToken(r3)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            return r4
        L2e:
            java.lang.Object r4 = r4.parse()
            if (r4 != 0) goto L36
            r4 = 0
            return r4
        L36:
            java.lang.Float r4 = com.alibaba.fastjson.util.TypeUtils.castToFloat(r4)
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
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            java.text.NumberFormat r3 = r0.decimalFormat
            if (r3 == 0) goto L1d
            double r4 = (double) r2
            java.lang.String r2 = r3.format(r4)
            r1.write(r2)
            return
        L1d:
            r3 = 1
            r1.writeFloat(r2, r3)
            return
    }
}
