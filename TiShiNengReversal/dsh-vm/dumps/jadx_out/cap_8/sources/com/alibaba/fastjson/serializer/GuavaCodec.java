package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GuavaCodec implements com.alibaba.fastjson.serializer.ObjectSerializer {
    public static com.alibaba.fastjson.serializer.GuavaCodec instance;

    static {
            com.alibaba.fastjson.serializer.GuavaCodec r0 = new com.alibaba.fastjson.serializer.GuavaCodec
            r0.<init>()
            com.alibaba.fastjson.serializer.GuavaCodec.instance = r0
            return
    }

    public GuavaCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, int r5) throws java.io.IOException {
            r0 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r3 = r1.out
            boolean r3 = r2 instanceof com.google.common.collect.Multimap
            if (r3 == 0) goto Lf
            com.google.common.collect.Multimap r2 = (com.google.common.collect.Multimap) r2
            java.util.Map r2 = r2.asMap()
            r1.write(r2)
        Lf:
            return
    }
}
