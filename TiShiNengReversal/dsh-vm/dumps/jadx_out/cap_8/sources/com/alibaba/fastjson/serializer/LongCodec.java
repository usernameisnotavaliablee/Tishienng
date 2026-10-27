package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LongCodec implements com.alibaba.fastjson.serializer.ObjectSerializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static com.alibaba.fastjson.serializer.LongCodec instance;

    static {
            com.alibaba.fastjson.serializer.LongCodec r0 = new com.alibaba.fastjson.serializer.LongCodec
            r0.<init>()
            com.alibaba.fastjson.serializer.LongCodec.instance = r0
            return
    }

    public LongCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r3, java.lang.reflect.Type r4, java.lang.Object r5) {
            r2 = this;
            com.alibaba.fastjson.parser.JSONLexer r5 = r3.lexer
            int r0 = r5.token()
            r1 = 2
            if (r0 != r1) goto L17
            long r0 = r5.longValue()
            r3 = 16
            r5.nextToken(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            goto L35
        L17:
            r5 = 12
            if (r0 != r5) goto L29
            com.alibaba.fastjson.JSONObject r5 = new com.alibaba.fastjson.JSONObject
            r0 = 1
            r5.<init>(r0)
            r3.parseObject(r5)
            java.lang.Long r3 = com.alibaba.fastjson.util.TypeUtils.castToLong(r5)
            goto L31
        L29:
            java.lang.Object r3 = r3.parse()
            java.lang.Long r3 = com.alibaba.fastjson.util.TypeUtils.castToLong(r3)
        L31:
            if (r3 != 0) goto L35
            r3 = 0
            return r3
        L35:
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r5 = java.util.concurrent.atomic.AtomicLong.class
            if (r4 != r5) goto L43
            java.util.concurrent.atomic.AtomicLong r4 = new java.util.concurrent.atomic.AtomicLong
            long r0 = r3.longValue()
            r4.<init>(r0)
            return r4
        L43:
            return r3
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 2
            return r0
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r3, java.lang.Object r4, java.lang.Object r5, java.lang.reflect.Type r6, int r7) throws java.io.IOException {
            r2 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r3 = r3.out
            if (r4 != 0) goto La
            com.alibaba.fastjson.serializer.SerializerFeature r4 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullNumberAsZero
            r3.writeNull(r4)
            return
        La:
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r3.writeLong(r4)
            com.alibaba.fastjson.serializer.SerializerFeature r7 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName
            boolean r7 = r3.isEnabled(r7)
            if (r7 == 0) goto L36
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 > 0) goto L36
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 < 0) goto L36
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            if (r6 == r4) goto L36
            java.lang.Class r4 = java.lang.Long.TYPE
            if (r6 == r4) goto L36
            r4 = 76
            r3.write(r4)
        L36:
            return
    }
}
