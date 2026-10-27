package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AdderSerializer implements com.alibaba.fastjson.serializer.ObjectSerializer {
    public static final com.alibaba.fastjson.serializer.AdderSerializer instance = null;

    static {
            com.alibaba.fastjson.serializer.AdderSerializer r0 = new com.alibaba.fastjson.serializer.AdderSerializer
            r0.<init>()
            com.alibaba.fastjson.serializer.AdderSerializer.instance = r0
            return
    }

    public AdderSerializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r2, java.lang.Object r3, java.lang.Object r4, java.lang.reflect.Type r5, int r6) throws java.io.IOException {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r2 = r2.out
            boolean r4 = com.alibaba.fastjson.serializer.a.a(r3)
            r5 = 125(0x7d, float:1.75E-43)
            java.lang.String r6 = "value"
            r0 = 123(0x7b, float:1.72E-43)
            if (r4 == 0) goto L1d
            java.util.concurrent.atomic.LongAdder r3 = com.alibaba.fastjson.serializer.b.a(r3)
            long r3 = com.alibaba.fastjson.serializer.c.a(r3)
            r2.writeFieldValue(r0, r6, r3)
            r2.write(r5)
            return
        L1d:
            boolean r4 = com.alibaba.fastjson.serializer.d.a(r3)
            if (r4 == 0) goto L31
            java.util.concurrent.atomic.DoubleAdder r3 = com.alibaba.fastjson.serializer.e.a(r3)
            double r3 = com.alibaba.fastjson.serializer.f.a(r3)
            r2.writeFieldValue(r0, r6, r3)
            r2.write(r5)
        L31:
            return
    }
}
