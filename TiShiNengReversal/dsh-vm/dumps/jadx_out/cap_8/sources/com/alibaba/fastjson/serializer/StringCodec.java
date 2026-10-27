package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class StringCodec implements com.alibaba.fastjson.serializer.ObjectSerializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static com.alibaba.fastjson.serializer.StringCodec instance;

    static {
            com.alibaba.fastjson.serializer.StringCodec r0 = new com.alibaba.fastjson.serializer.StringCodec
            r0.<init>()
            com.alibaba.fastjson.serializer.StringCodec.instance = r0
            return
    }

    public StringCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r4) {
            com.alibaba.fastjson.parser.JSONLexer r0 = r4.getLexer()
            int r1 = r0.token()
            r2 = 4
            r3 = 16
            if (r1 != r2) goto L15
            java.lang.String r4 = r0.stringVal()
            r0.nextToken(r3)
            return r4
        L15:
            int r1 = r0.token()
            r2 = 2
            if (r1 != r2) goto L24
            java.lang.String r4 = r0.numberString()
            r0.nextToken(r3)
            return r4
        L24:
            java.lang.Object r4 = r4.parse()
            if (r4 != 0) goto L2c
            r4 = 0
            return r4
        L2c:
            java.lang.String r4 = r4.toString()
            return r4
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r4, java.lang.reflect.Type r5, java.lang.Object r6) {
            r3 = this;
            java.lang.Class<java.lang.StringBuffer> r6 = java.lang.StringBuffer.class
            r0 = 0
            r1 = 16
            r2 = 4
            if (r5 != r6) goto L2e
            com.alibaba.fastjson.parser.JSONLexer r5 = r4.lexer
            int r6 = r5.token()
            if (r6 != r2) goto L1d
            java.lang.String r4 = r5.stringVal()
            r5.nextToken(r1)
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>(r4)
            return r5
        L1d:
            java.lang.Object r4 = r4.parse()
            if (r4 != 0) goto L24
            return r0
        L24:
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            return r5
        L2e:
            java.lang.Class<java.lang.StringBuilder> r6 = java.lang.StringBuilder.class
            if (r5 != r6) goto L58
            com.alibaba.fastjson.parser.JSONLexer r5 = r4.lexer
            int r6 = r5.token()
            if (r6 != r2) goto L47
            java.lang.String r4 = r5.stringVal()
            r5.nextToken(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            return r5
        L47:
            java.lang.Object r4 = r4.parse()
            if (r4 != 0) goto L4e
            return r0
        L4e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            return r5
        L58:
            java.lang.Object r4 = deserialze(r4)
            return r4
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 4
            return r0
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, int r5) throws java.io.IOException {
            r0 = this;
            java.lang.String r2 = (java.lang.String) r2
            r0.write(r1, r2)
            return
    }

    public void write(com.alibaba.fastjson.serializer.JSONSerializer r1, java.lang.String r2) {
            r0 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r1.out
            if (r2 != 0) goto La
            com.alibaba.fastjson.serializer.SerializerFeature r2 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullStringAsEmpty
            r1.writeNull(r2)
            return
        La:
            r1.writeString(r2)
            return
    }
}
