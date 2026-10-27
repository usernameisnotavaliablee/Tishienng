package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CharacterCodec implements com.alibaba.fastjson.serializer.ObjectSerializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static final com.alibaba.fastjson.serializer.CharacterCodec instance = null;

    static {
            com.alibaba.fastjson.serializer.CharacterCodec r0 = new com.alibaba.fastjson.serializer.CharacterCodec
            r0.<init>()
            com.alibaba.fastjson.serializer.CharacterCodec.instance = r0
            return
    }

    public CharacterCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r1, java.lang.reflect.Type r2, java.lang.Object r3) {
            r0 = this;
            java.lang.Object r1 = r1.parse()
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Character r1 = com.alibaba.fastjson.util.TypeUtils.castToChar(r1)
            return r1
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
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r1.out
            java.lang.Character r2 = (java.lang.Character) r2
            if (r2 != 0) goto Lc
            java.lang.String r2 = ""
            r1.writeString(r2)
            return
        Lc:
            char r3 = r2.charValue()
            if (r3 != 0) goto L18
            java.lang.String r2 = "\u0000"
            r1.writeString(r2)
            return
        L18:
            java.lang.String r2 = r2.toString()
            r1.writeString(r2)
            return
    }
}
