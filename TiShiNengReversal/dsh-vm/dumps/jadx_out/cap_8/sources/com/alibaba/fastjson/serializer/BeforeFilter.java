package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class BeforeFilter implements com.alibaba.fastjson.serializer.SerializeFilter {
    private static final java.lang.Character COMMA = null;
    private static final java.lang.ThreadLocal<java.lang.Character> seperatorLocal = null;
    private static final java.lang.ThreadLocal<com.alibaba.fastjson.serializer.JSONSerializer> serializerLocal = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.alibaba.fastjson.serializer.BeforeFilter.serializerLocal = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.alibaba.fastjson.serializer.BeforeFilter.seperatorLocal = r0
            r0 = 44
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            com.alibaba.fastjson.serializer.BeforeFilter.COMMA = r0
            return
    }

    public BeforeFilter() {
            r0 = this;
            r0.<init>()
            return
    }

    final char writeBefore(com.alibaba.fastjson.serializer.JSONSerializer r2, java.lang.Object r3, char r4) {
            r1 = this;
            java.lang.ThreadLocal<com.alibaba.fastjson.serializer.JSONSerializer> r0 = com.alibaba.fastjson.serializer.BeforeFilter.serializerLocal
            r0.set(r2)
            java.lang.ThreadLocal<java.lang.Character> r2 = com.alibaba.fastjson.serializer.BeforeFilter.seperatorLocal
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.set(r4)
            r1.writeBefore(r3)
            r3 = 0
            r0.set(r3)
            java.lang.Object r2 = r2.get()
            java.lang.Character r2 = (java.lang.Character) r2
            char r2 = r2.charValue()
            return r2
    }

    public abstract void writeBefore(java.lang.Object r1);

    protected final void writeKeyValue(java.lang.String r4, java.lang.Object r5) {
            r3 = this;
            java.lang.ThreadLocal<com.alibaba.fastjson.serializer.JSONSerializer> r0 = com.alibaba.fastjson.serializer.BeforeFilter.serializerLocal
            java.lang.Object r0 = r0.get()
            com.alibaba.fastjson.serializer.JSONSerializer r0 = (com.alibaba.fastjson.serializer.JSONSerializer) r0
            java.lang.ThreadLocal<java.lang.Character> r1 = com.alibaba.fastjson.serializer.BeforeFilter.seperatorLocal
            java.lang.Object r2 = r1.get()
            java.lang.Character r2 = (java.lang.Character) r2
            char r2 = r2.charValue()
            r0.writeKeyValue(r2, r4, r5)
            r4 = 44
            if (r2 == r4) goto L20
            java.lang.Character r4 = com.alibaba.fastjson.serializer.BeforeFilter.COMMA
            r1.set(r4)
        L20:
            return
    }
}
