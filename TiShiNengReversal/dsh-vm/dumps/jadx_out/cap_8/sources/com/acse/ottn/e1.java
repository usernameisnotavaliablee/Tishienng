package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e1<T> implements retrofit2.g<T, okhttp3.RequestBody> {
    public static final okhttp3.MediaType a = null;

    static {
            java.lang.String r0 = "application/json; charset=UTF-8"
            okhttp3.MediaType r0 = okhttp3.MediaType.parse(r0)
            com.acse.ottn.e1.a = r0
            return
    }

    public e1() {
            r0 = this;
            r0.<init>()
            return
    }

    public okhttp3.RequestBody a(T r3) throws java.io.IOException {
            r2 = this;
            okhttp3.MediaType r0 = com.acse.ottn.e1.a
            r1 = 0
            com.alibaba.fastjson.serializer.SerializerFeature[] r1 = new com.alibaba.fastjson.serializer.SerializerFeature[r1]
            byte[] r3 = com.alibaba.fastjson.JSON.toJSONBytes(r3, r1)
            okhttp3.RequestBody r3 = okhttp3.RequestBody.create(r0, r3)
            return r3
    }

    public /* bridge */ /* synthetic */ java.lang.Object convert(java.lang.Object r1) throws java.io.IOException {
            r0 = this;
            okhttp3.RequestBody r1 = r0.a(r1)
            return r1
    }
}
