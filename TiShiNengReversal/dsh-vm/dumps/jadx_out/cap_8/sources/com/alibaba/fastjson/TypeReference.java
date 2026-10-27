package com.alibaba.fastjson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TypeReference<T> {
    public static final java.lang.reflect.Type LIST_STRING = null;
    static java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, java.lang.reflect.Type> classTypeCache;
    protected final java.lang.reflect.Type type;


    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 1061158912(0x3f400000, float:0.75)
            r2 = 1
            r3 = 16
            r0.<init>(r3, r1, r2)
            com.alibaba.fastjson.TypeReference.classTypeCache = r0
            com.alibaba.fastjson.TypeReference$1 r0 = new com.alibaba.fastjson.TypeReference$1
            r0.<init>()
            java.lang.reflect.Type r0 = r0.getType()
            com.alibaba.fastjson.TypeReference.LIST_STRING = r0
            return
    }

    protected TypeReference() {
            r2 = this;
            r2.<init>()
            java.lang.Class r0 = r2.getClass()
            java.lang.reflect.Type r0 = r0.getGenericSuperclass()
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r1 = 0
            r0 = r0[r1]
            r2.type = r0
            return
    }

    protected TypeReference(java.lang.reflect.Type... r7) {
            r6 = this;
            r6.<init>()
            java.lang.Class r0 = r6.getClass()
            java.lang.reflect.Type r1 = r0.getGenericSuperclass()
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type r3 = r1.getRawType()
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            r4 = 0
        L1f:
            int r5 = r1.length
            if (r2 >= r5) goto L36
            r5 = r1[r2]
            boolean r5 = r5 instanceof java.lang.reflect.TypeVariable
            if (r5 == 0) goto L33
            int r5 = r4 + 1
            r4 = r7[r4]
            r1[r2] = r4
            int r4 = r7.length
            if (r5 < r4) goto L32
            goto L36
        L32:
            r4 = r5
        L33:
            int r2 = r2 + 1
            goto L1f
        L36:
            com.alibaba.fastjson.util.ParameterizedTypeImpl r7 = new com.alibaba.fastjson.util.ParameterizedTypeImpl
            r7.<init>(r1, r0, r3)
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, java.lang.reflect.Type> r0 = com.alibaba.fastjson.TypeReference.classTypeCache
            java.lang.Object r0 = r0.get(r7)
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            if (r0 != 0) goto L53
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, java.lang.reflect.Type> r0 = com.alibaba.fastjson.TypeReference.classTypeCache
            r0.putIfAbsent(r7, r7)
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, java.lang.reflect.Type> r0 = com.alibaba.fastjson.TypeReference.classTypeCache
            java.lang.Object r7 = r0.get(r7)
            r0 = r7
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
        L53:
            r6.type = r0
            return
    }

    public java.lang.reflect.Type getType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.type
            return r0
    }
}
