package com.bxkj.base.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c0 {
    public c0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Class<?> a(java.lang.reflect.Type r1) throws java.lang.ClassNotFoundException {
            java.lang.String r1 = b(r1)
            if (r1 == 0) goto L12
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            goto L12
        Ld:
            java.lang.Class r1 = java.lang.Class.forName(r1)
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static java.lang.String b(java.lang.reflect.Type r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            return r1
        L5:
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "class"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L16
            r0 = 5
            java.lang.String r1 = r1.substring(r0)
        L16:
            return r1
    }

    public static java.lang.reflect.Type c(java.lang.Object r1) {
            java.lang.Class r1 = r1.getClass()
            java.lang.reflect.Type[] r1 = r1.getGenericInterfaces()
            r0 = 0
            r1 = r1[r0]
            return r1
    }

    public static java.lang.reflect.Type d(java.lang.Object r2) {
            java.lang.Class r2 = r2.getClass()
            java.lang.reflect.Type r2 = r2.getGenericSuperclass()
            java.lang.Class<java.lang.reflect.ParameterizedType> r0 = java.lang.reflect.ParameterizedType.class
            java.lang.Class r1 = r2.getClass()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L16
            r2 = 0
            return r2
        L16:
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r2 = r2.getActualTypeArguments()
            r0 = 0
            r2 = r2[r0]
            return r2
    }

    public static boolean e(java.lang.Class<?> r1) throws java.lang.SecurityException {
            r0 = 0
            r1.getConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public static java.lang.Object f(java.lang.reflect.Type r0) throws java.lang.ClassNotFoundException, java.lang.InstantiationException, java.lang.IllegalAccessException {
            java.lang.Class r0 = a(r0)
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.Object r0 = r0.newInstance()
            return r0
    }
}
