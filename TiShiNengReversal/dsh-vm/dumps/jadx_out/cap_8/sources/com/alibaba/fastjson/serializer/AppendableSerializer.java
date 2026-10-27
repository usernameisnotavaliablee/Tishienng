package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AppendableSerializer implements com.alibaba.fastjson.serializer.ObjectSerializer {
    public static final com.alibaba.fastjson.serializer.AppendableSerializer instance = null;

    static {
            com.alibaba.fastjson.serializer.AppendableSerializer r0 = new com.alibaba.fastjson.serializer.AppendableSerializer
            r0.<init>()
            com.alibaba.fastjson.serializer.AppendableSerializer.instance = r0
            return
    }

    public AppendableSerializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, int r5) throws java.io.IOException {
            r0 = this;
            if (r2 != 0) goto La
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r1.out
            com.alibaba.fastjson.serializer.SerializerFeature r2 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullStringAsEmpty
            r1.writeNull(r2)
            return
        La:
            java.lang.String r2 = r2.toString()
            r1.write(r2)
            return
    }
}
