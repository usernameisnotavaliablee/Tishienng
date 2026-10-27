package com.google.common.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class TypeCapture<T> {
    TypeCapture() {
            r0 = this;
            r0.<init>()
            return
    }

    final java.lang.reflect.Type capture() {
            r3 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.reflect.Type r0 = r0.getGenericSuperclass()
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            java.lang.String r2 = "%s isn't parameterized"
            com.google.common.base.Preconditions.checkArgument(r1, r2, r0)
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r1 = 0
            r0 = r0[r1]
            return r0
    }
}
