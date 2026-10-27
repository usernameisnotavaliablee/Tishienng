package com.autonavi.base.ae.gmap.glyph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class ReflectUtil {
    public ReflectUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object getField(java.lang.String r2, java.lang.Object r3, java.lang.String r4) {
            if (r2 == 0) goto L2d
            java.lang.String r0 = ""
            boolean r1 = r2.equals(r0)
            if (r1 != 0) goto L2d
            if (r4 == 0) goto L25
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L25
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.reflect.Field r2 = r2.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L23
            r4 = 1
            r2.setAccessible(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L23
            return r2
        L23:
            r2 = 0
            return r2
        L25:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "fieldName 不能为空"
            r2.<init>(r3)
            throw r2
        L2d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "className 不能为空"
            r2.<init>(r3)
            throw r2
    }

    public static java.lang.Object getInstance(java.lang.String r6, java.lang.Object... r7) {
            if (r6 == 0) goto L3c
            java.lang.String r0 = ""
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L3c
            r0 = 0
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L3b
            r1 = 1
            if (r7 == 0) goto L2f
            int r2 = r7.length     // Catch: java.lang.Throwable -> L3b
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L3b
            r4 = 0
        L16:
            if (r4 >= r2) goto L23
            r5 = r7[r4]     // Catch: java.lang.Throwable -> L3b
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3b
            r3[r4] = r5     // Catch: java.lang.Throwable -> L3b
            int r4 = r4 + 1
            goto L16
        L23:
            java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L3b
            r6.setAccessible(r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r6 = r6.newInstance(r7)     // Catch: java.lang.Throwable -> L3b
            return r6
        L2f:
            java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r0)     // Catch: java.lang.Throwable -> L3b
            r6.setAccessible(r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r6 = r6.newInstance(r0)     // Catch: java.lang.Throwable -> L3b
            return r6
        L3b:
            return r0
        L3c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "className 不能为空"
            r6.<init>(r7)
            throw r6
    }

    public static java.lang.reflect.Method getMethod(java.lang.String r2, java.lang.String r3, java.lang.Class... r4) {
            if (r2 == 0) goto L25
            java.lang.String r0 = ""
            boolean r1 = r2.equals(r0)
            if (r1 != 0) goto L25
            if (r3 == 0) goto L1d
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1d
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L1b
            return r2
        L1b:
            r2 = 0
            return r2
        L1d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "methodName不能为空"
            r2.<init>(r3)
            throw r2
        L25:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "className 不能为空"
            r2.<init>(r3)
            throw r2
    }

    public static java.lang.Object invoke(java.lang.String r6, java.lang.Object r7, java.lang.String r8, java.lang.Object... r9) {
            if (r6 == 0) goto L4c
            java.lang.String r0 = ""
            boolean r1 = r6.equals(r0)
            if (r1 != 0) goto L4c
            if (r8 == 0) goto L44
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L44
            r0 = 0
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L43
            r1 = 1
            if (r9 == 0) goto L37
            int r2 = r9.length     // Catch: java.lang.Throwable -> L43
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L43
            r4 = 0
        L1e:
            if (r4 >= r2) goto L2b
            r5 = r9[r4]     // Catch: java.lang.Throwable -> L43
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L43
            r3[r4] = r5     // Catch: java.lang.Throwable -> L43
            int r4 = r4 + 1
            goto L1e
        L2b:
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r8, r3)     // Catch: java.lang.Throwable -> L43
            r6.setAccessible(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.Object r6 = r6.invoke(r7, r9)     // Catch: java.lang.Throwable -> L43
            return r6
        L37:
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r8, r0)     // Catch: java.lang.Throwable -> L43
            r6.setAccessible(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch: java.lang.Throwable -> L43
            return r6
        L43:
            return r0
        L44:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "methodName不能为空"
            r6.<init>(r7)
            throw r6
        L4c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "className 不能为空"
            r6.<init>(r7)
            throw r6
    }

    public static java.lang.Object invokeMethod(java.lang.Object r1, java.lang.reflect.Method r2, java.lang.Object... r3) {
            if (r2 == 0) goto Ld
            r0 = 1
            r2.setAccessible(r0)
            java.lang.Object r1 = r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = 0
            return r1
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "method 不能为空"
            r1.<init>(r2)
            throw r1
    }

    public static java.lang.Object newInstance(java.lang.String r2, java.lang.Class<?>[] r3, java.lang.Object[] r4) {
            if (r2 == 0) goto L2b
            java.lang.String r0 = ""
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2b
            r0 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L2a
            r1 = 1
            if (r3 == 0) goto L1e
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L2a
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = r2.newInstance(r4)     // Catch: java.lang.Throwable -> L2a
            return r2
        L1e:
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r0)     // Catch: java.lang.Throwable -> L2a
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = r2.newInstance(r0)     // Catch: java.lang.Throwable -> L2a
            return r2
        L2a:
            return r0
        L2b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "className 不能为空"
            r2.<init>(r3)
            throw r2
    }

    public static void setField(java.lang.String r2, java.lang.Object r3, java.lang.String r4, java.lang.Object r5) {
            if (r2 == 0) goto L2a
            java.lang.String r0 = ""
            boolean r1 = r2.equals(r0)
            if (r1 != 0) goto L2a
            if (r4 == 0) goto L22
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L22
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L21
            java.lang.reflect.Field r2 = r2.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L21
            r4 = 1
            r2.setAccessible(r4)     // Catch: java.lang.Throwable -> L21
            r2.set(r3, r5)     // Catch: java.lang.Throwable -> L21
        L21:
            return
        L22:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "fieldName 不能为空"
            r2.<init>(r3)
            throw r2
        L2a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "className 不能为空"
            r2.<init>(r3)
            throw r2
    }
}
