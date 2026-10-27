package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BooleanCodec implements com.alibaba.fastjson.serializer.ObjectSerializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static final com.alibaba.fastjson.serializer.BooleanCodec instance = null;

    static {
            com.alibaba.fastjson.serializer.BooleanCodec r0 = new com.alibaba.fastjson.serializer.BooleanCodec
            r0.<init>()
            com.alibaba.fastjson.serializer.BooleanCodec.instance = r0
            return
    }

    public BooleanCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r4, java.lang.reflect.Type r5, java.lang.Object r6) {
            r3 = this;
            com.alibaba.fastjson.parser.JSONLexer r6 = r4.lexer
            int r0 = r6.token()
            r1 = 6
            r2 = 16
            if (r0 != r1) goto L11
            r6.nextToken(r2)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            goto L41
        L11:
            int r0 = r6.token()
            r1 = 7
            if (r0 != r1) goto L1e
            r6.nextToken(r2)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            goto L41
        L1e:
            int r0 = r6.token()
            r1 = 2
            if (r0 != r1) goto L35
            int r4 = r6.intValue()
            r6.nextToken(r2)
            r6 = 1
            if (r4 != r6) goto L32
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            goto L41
        L32:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            goto L41
        L35:
            java.lang.Object r4 = r4.parse()
            if (r4 != 0) goto L3d
            r4 = 0
            return r4
        L3d:
            java.lang.Boolean r4 = com.alibaba.fastjson.util.TypeUtils.castToBoolean(r4)
        L41:
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r6 = java.util.concurrent.atomic.AtomicBoolean.class
            if (r5 != r6) goto L4f
            java.util.concurrent.atomic.AtomicBoolean r5 = new java.util.concurrent.atomic.AtomicBoolean
            boolean r4 = r4.booleanValue()
            r5.<init>(r4)
            return r5
        L4f:
            return r4
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 6
            return r0
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, int r5) throws java.io.IOException {
            r0 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r1.out
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 != 0) goto Lc
            com.alibaba.fastjson.serializer.SerializerFeature r2 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullBooleanAsFalse
            r1.writeNull(r2)
            return
        Lc:
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L18
            java.lang.String r2 = "true"
            r1.write(r2)
            return
        L18:
            java.lang.String r2 = "false"
            r1.write(r2)
            return
    }
}
