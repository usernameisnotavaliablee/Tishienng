package com.bytedance.pangle.xt.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {
    public xt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.reflect.Constructor j(java.lang.Class<?> r0, java.lang.Class<?>... r1) throws java.lang.NoSuchMethodException {
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)
            if (r0 == 0) goto L10
            boolean r1 = r0.isAccessible()
            if (r1 != 0) goto L10
            r1 = 1
            r0.setAccessible(r1)
        L10:
            return r0
    }

    public static java.lang.reflect.Field j(java.lang.Class<?> r0, java.lang.String r1) throws java.lang.NoSuchFieldException {
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            if (r0 == 0) goto L10
            boolean r1 = r0.isAccessible()
            if (r1 != 0) goto L10
            r1 = 1
            r0.setAccessible(r1)
        L10:
            return r0
    }

    public static java.lang.reflect.Method j(java.lang.Class<?> r0, java.lang.String r1, java.lang.Class<?>... r2) throws java.lang.NoSuchMethodException {
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)
            if (r0 == 0) goto L10
            boolean r1 = r0.isAccessible()
            if (r1 != 0) goto L10
            r1 = 1
            r0.setAccessible(r1)
        L10:
            return r0
    }
}
