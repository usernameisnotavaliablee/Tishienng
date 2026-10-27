package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ReferenceCodec implements com.alibaba.fastjson.serializer.ObjectSerializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static final com.alibaba.fastjson.serializer.ReferenceCodec instance = null;

    static {
            com.alibaba.fastjson.serializer.ReferenceCodec r0 = new com.alibaba.fastjson.serializer.ReferenceCodec
            r0.<init>()
            com.alibaba.fastjson.serializer.ReferenceCodec.instance = r0
            return
    }

    public ReferenceCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r2, java.lang.reflect.Type r3, java.lang.Object r4) {
            r1 = this;
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type[] r4 = r3.getActualTypeArguments()
            r0 = 0
            r4 = r4[r0]
            java.lang.Object r2 = r2.parseObject(r4)
            java.lang.reflect.Type r3 = r3.getRawType()
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r4 = java.util.concurrent.atomic.AtomicReference.class
            if (r3 != r4) goto L1b
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>(r2)
            return r3
        L1b:
            java.lang.Class<java.lang.ref.WeakReference> r4 = java.lang.ref.WeakReference.class
            if (r3 != r4) goto L25
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            return r3
        L25:
            java.lang.Class<java.lang.ref.SoftReference> r4 = java.lang.ref.SoftReference.class
            if (r3 != r4) goto L2f
            java.lang.ref.SoftReference r3 = new java.lang.ref.SoftReference
            r3.<init>(r2)
            return r3
        L2f:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 12
            return r0
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, int r5) throws java.io.IOException {
            r0 = this;
            boolean r3 = r2 instanceof java.util.concurrent.atomic.AtomicReference
            if (r3 == 0) goto Lb
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
            java.lang.Object r2 = r2.get()
            goto L11
        Lb:
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2
            java.lang.Object r2 = r2.get()
        L11:
            r1.write(r2)
            return
    }
}
