package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JSONSerializableSerializer implements com.alibaba.fastjson.serializer.ObjectSerializer {
    public static com.alibaba.fastjson.serializer.JSONSerializableSerializer instance;

    static {
            com.alibaba.fastjson.serializer.JSONSerializableSerializer r0 = new com.alibaba.fastjson.serializer.JSONSerializableSerializer
            r0.<init>()
            com.alibaba.fastjson.serializer.JSONSerializableSerializer.instance = r0
            return
    }

    public JSONSerializableSerializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, int r5) throws java.io.IOException {
            r0 = this;
            com.alibaba.fastjson.serializer.JSONSerializable r2 = (com.alibaba.fastjson.serializer.JSONSerializable) r2
            r2.write(r1, r3, r4, r5)
            return
    }
}
