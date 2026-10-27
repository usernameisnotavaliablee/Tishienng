package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SerializeBeanInfo {
    protected final java.lang.Class<?> beanType;
    protected int features;
    protected final com.alibaba.fastjson.util.FieldInfo[] fields;
    protected final com.alibaba.fastjson.annotation.JSONType jsonType;
    protected final com.alibaba.fastjson.util.FieldInfo[] sortedFields;
    protected final java.lang.String typeKey;
    protected final java.lang.String typeName;

    public SerializeBeanInfo(java.lang.Class<?> r1, com.alibaba.fastjson.annotation.JSONType r2, java.lang.String r3, java.lang.String r4, int r5, com.alibaba.fastjson.util.FieldInfo[] r6, com.alibaba.fastjson.util.FieldInfo[] r7) {
            r0 = this;
            r0.<init>()
            r0.beanType = r1
            r0.jsonType = r2
            r0.typeName = r3
            r0.typeKey = r4
            r0.features = r5
            r0.fields = r6
            r0.sortedFields = r7
            return
    }
}
