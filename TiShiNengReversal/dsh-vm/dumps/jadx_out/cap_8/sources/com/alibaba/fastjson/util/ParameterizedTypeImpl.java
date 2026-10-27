package com.alibaba.fastjson.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType {
    private final java.lang.reflect.Type[] actualTypeArguments;
    private final java.lang.reflect.Type ownerType;
    private final java.lang.reflect.Type rawType;

    public ParameterizedTypeImpl(java.lang.reflect.Type[] r1, java.lang.reflect.Type r2, java.lang.reflect.Type r3) {
            r0 = this;
            r0.<init>()
            r0.actualTypeArguments = r1
            r0.ownerType = r2
            r0.rawType = r3
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L3f
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L3f
        L12:
            com.alibaba.fastjson.util.ParameterizedTypeImpl r5 = (com.alibaba.fastjson.util.ParameterizedTypeImpl) r5
            java.lang.reflect.Type[] r2 = r4.actualTypeArguments
            java.lang.reflect.Type[] r3 = r5.actualTypeArguments
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L1f
            return r1
        L1f:
            java.lang.reflect.Type r2 = r4.ownerType
            if (r2 == 0) goto L2c
            java.lang.reflect.Type r3 = r5.ownerType
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L31
            goto L30
        L2c:
            java.lang.reflect.Type r2 = r5.ownerType
            if (r2 == 0) goto L31
        L30:
            return r1
        L31:
            java.lang.reflect.Type r2 = r4.rawType
            java.lang.reflect.Type r5 = r5.rawType
            if (r2 == 0) goto L3c
            boolean r5 = r2.equals(r5)
            return r5
        L3c:
            if (r5 != 0) goto L3f
            return r0
        L3f:
            return r1
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type[] getActualTypeArguments() {
            r1 = this;
            java.lang.reflect.Type[] r0 = r1.actualTypeArguments
            return r0
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getOwnerType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.ownerType
            return r0
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getRawType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.rawType
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.reflect.Type[] r0 = r3.actualTypeArguments
            r1 = 0
            if (r0 == 0) goto La
            int r0 = java.util.Arrays.hashCode(r0)
            goto Lb
        La:
            r0 = 0
        Lb:
            int r0 = r0 * 31
            java.lang.reflect.Type r2 = r3.ownerType
            if (r2 == 0) goto L16
            int r2 = r2.hashCode()
            goto L17
        L16:
            r2 = 0
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.reflect.Type r2 = r3.rawType
            if (r2 == 0) goto L22
            int r1 = r2.hashCode()
        L22:
            int r0 = r0 + r1
            return r0
    }
}
