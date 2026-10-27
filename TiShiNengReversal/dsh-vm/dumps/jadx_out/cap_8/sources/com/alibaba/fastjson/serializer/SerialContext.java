package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SerialContext {
    public final int features;
    public final java.lang.Object fieldName;
    public final java.lang.Object object;
    public final com.alibaba.fastjson.serializer.SerialContext parent;

    public SerialContext(com.alibaba.fastjson.serializer.SerialContext r1, java.lang.Object r2, java.lang.Object r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.parent = r1
            r0.object = r2
            r0.fieldName = r3
            r0.features = r4
            return
    }

    public java.lang.Object getFieldName() {
            r1 = this;
            java.lang.Object r0 = r1.fieldName
            return r0
    }

    public java.lang.Object getObject() {
            r1 = this;
            java.lang.Object r0 = r1.object
            return r0
    }

    public com.alibaba.fastjson.serializer.SerialContext getParent() {
            r1 = this;
            com.alibaba.fastjson.serializer.SerialContext r0 = r1.parent
            return r0
    }

    public java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = r1.toString()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            com.alibaba.fastjson.serializer.SerialContext r0 = r2.parent
            if (r0 != 0) goto L7
            java.lang.String r0 = "$"
            return r0
        L7:
            java.lang.Object r0 = r2.fieldName
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.alibaba.fastjson.serializer.SerialContext r1 = r2.parent
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "["
            r0.append(r1)
            java.lang.Object r1 = r2.fieldName
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L2f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.alibaba.fastjson.serializer.SerialContext r1 = r2.parent
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            java.lang.Object r1 = r2.fieldName
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
