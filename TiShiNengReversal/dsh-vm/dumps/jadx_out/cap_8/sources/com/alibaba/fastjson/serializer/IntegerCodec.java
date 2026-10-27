package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class IntegerCodec implements com.alibaba.fastjson.serializer.ObjectSerializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static com.alibaba.fastjson.serializer.IntegerCodec instance;

    static {
            com.alibaba.fastjson.serializer.IntegerCodec r0 = new com.alibaba.fastjson.serializer.IntegerCodec
            r0.<init>()
            com.alibaba.fastjson.serializer.IntegerCodec.instance = r0
            return
    }

    public IntegerCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r5, java.lang.reflect.Type r6, java.lang.Object r7) {
            r4 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r5.lexer
            int r1 = r0.token()
            r2 = 8
            r3 = 16
            if (r1 != r2) goto L11
            r0.nextToken(r3)
            r5 = 0
            return r5
        L11:
            r2 = 2
            if (r1 != r2) goto L38
            int r5 = r0.intValue()     // Catch: java.lang.NumberFormatException -> L20
            r0.nextToken(r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L65
        L20:
            r5 = move-exception
            com.alibaba.fastjson.JSONException r6 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "int value overflow, field : "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7, r5)
            throw r6
        L38:
            r7 = 3
            if (r1 != r7) goto L4b
            java.math.BigDecimal r5 = r0.decimalValue()
            r0.nextToken(r3)
            int r5 = r5.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L65
        L4b:
            r7 = 12
            if (r1 != r7) goto L5d
            com.alibaba.fastjson.JSONObject r7 = new com.alibaba.fastjson.JSONObject
            r0 = 1
            r7.<init>(r0)
            r5.parseObject(r7)
            java.lang.Integer r5 = com.alibaba.fastjson.util.TypeUtils.castToInt(r7)
            goto L65
        L5d:
            java.lang.Object r5 = r5.parse()
            java.lang.Integer r5 = com.alibaba.fastjson.util.TypeUtils.castToInt(r5)
        L65:
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r7 = java.util.concurrent.atomic.AtomicInteger.class
            if (r6 != r7) goto L73
            java.util.concurrent.atomic.AtomicInteger r6 = new java.util.concurrent.atomic.AtomicInteger
            int r5 = r5.intValue()
            r6.<init>(r5)
            return r6
        L73:
            return r5
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
            r3 = r2
            java.lang.Number r3 = (java.lang.Number) r3
            if (r3 != 0) goto Ld
            com.alibaba.fastjson.serializer.SerializerFeature r2 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullNumberAsZero
            r1.writeNull(r2)
            return
        Ld:
            boolean r2 = r2 instanceof java.lang.Long
            if (r2 == 0) goto L19
            long r4 = r3.longValue()
            r1.writeLong(r4)
            goto L20
        L19:
            int r2 = r3.intValue()
            r1.writeInt(r2)
        L20:
            com.alibaba.fastjson.serializer.SerializerFeature r2 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName
            boolean r2 = r1.isEnabled(r2)
            if (r2 == 0) goto L3f
            java.lang.Class r2 = r3.getClass()
            java.lang.Class<java.lang.Byte> r3 = java.lang.Byte.class
            if (r2 != r3) goto L36
            r2 = 66
            r1.write(r2)
            return
        L36:
            java.lang.Class<java.lang.Short> r3 = java.lang.Short.class
            if (r2 != r3) goto L3f
            r2 = 83
            r1.write(r2)
        L3f:
            return
    }
}
