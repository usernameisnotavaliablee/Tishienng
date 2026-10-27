package com.bytedance.embed_dr;

@androidx.annotation.Keep
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MethodUtils {
    public static final java.lang.Class<?>[] EMPTY_CLASS_ARRAY = null;
    private static java.util.Map<java.lang.String, java.lang.reflect.Method> sMethodCache;
    private static final java.util.HashMap<java.lang.Class<?>, java.lang.Class<?>> sPrimitiveToWrapperMap = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bytedance.embed_dr.MethodUtils.sMethodCache = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bytedance.embed_dr.MethodUtils.sPrimitiveToWrapperMap = r0
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Byte.TYPE
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Character.TYPE
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Short.TYPE
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Void.TYPE
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            r0.put(r1, r2)
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            com.bytedance.embed_dr.MethodUtils.EMPTY_CLASS_ARRAY = r0
            return
    }

    public MethodUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class<?> r13, java.lang.String r14, java.lang.Class<?>... r15) {
            java.lang.String r0 = getKey(r13, r14, r15)
            java.util.Map<java.lang.String, java.lang.reflect.Method> r1 = com.bytedance.embed_dr.MethodUtils.sMethodCache
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.reflect.Method> r2 = com.bytedance.embed_dr.MethodUtils.sMethodCache     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7e
            r1 = 1
            if (r2 == 0) goto L1d
            boolean r13 = r2.isAccessible()
            if (r13 != 0) goto L1c
            r2.setAccessible(r1)
        L1c:
            return r2
        L1d:
            if (r13 == 0) goto L7c
            java.lang.reflect.Method r2 = r13.getDeclaredMethod(r14, r15)     // Catch: java.lang.NoSuchMethodException -> L24
            goto L25
        L24:
        L25:
            if (r2 != 0) goto L65
            java.lang.reflect.Method[] r3 = r13.getDeclaredMethods()     // Catch: java.lang.Throwable -> L5d
            int r4 = r3.length     // Catch: java.lang.Throwable -> L5d
            r5 = 0
            r6 = 0
        L2e:
            if (r6 >= r4) goto L65
            r7 = r3[r6]     // Catch: java.lang.Throwable -> L5d
            if (r7 == 0) goto L62
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L5d
            boolean r8 = android.text.TextUtils.equals(r8, r14)     // Catch: java.lang.Throwable -> L5d
            if (r8 == 0) goto L62
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L5d
            if (r15 == 0) goto L62
            if (r8 == 0) goto L62
            int r9 = r15.length     // Catch: java.lang.Throwable -> L5d
            int r10 = r8.length     // Catch: java.lang.Throwable -> L5d
            if (r9 != r10) goto L62
            r9 = 0
            r10 = 1
        L4c:
            int r11 = r15.length     // Catch: java.lang.Throwable -> L5d
            if (r9 >= r11) goto L5f
            r11 = r15[r9]     // Catch: java.lang.Throwable -> L5d
            r12 = r8[r9]     // Catch: java.lang.Throwable -> L5d
            boolean r11 = isAssignableFrom(r11, r12)     // Catch: java.lang.Throwable -> L5d
            if (r11 != 0) goto L5a
            r10 = 0
        L5a:
            int r9 = r9 + 1
            goto L4c
        L5d:
            goto L65
        L5f:
            if (r10 == 0) goto L62
            r2 = r7
        L62:
            int r6 = r6 + 1
            goto L2e
        L65:
            if (r2 == 0) goto L77
            r2.setAccessible(r1)
            java.util.Map<java.lang.String, java.lang.reflect.Method> r3 = com.bytedance.embed_dr.MethodUtils.sMethodCache
            monitor-enter(r3)
            java.util.Map<java.lang.String, java.lang.reflect.Method> r13 = com.bytedance.embed_dr.MethodUtils.sMethodCache     // Catch: java.lang.Throwable -> L74
            r13.put(r0, r2)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L74
            return r2
        L74:
            r13 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L74
            throw r13
        L77:
            java.lang.Class r13 = r13.getSuperclass()
            goto L1d
        L7c:
            r13 = 0
            return r13
        L7e:
            r13 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7e
            throw r13
    }

    private static java.lang.String getKey(java.lang.Class<?> r3, java.lang.String r4, java.lang.Class<?>... r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r3 = "#"
            r0.append(r3)
            r0.append(r4)
            if (r5 == 0) goto L2c
            int r4 = r5.length
            if (r4 <= 0) goto L2c
            int r4 = r5.length
            r1 = 0
        L1b:
            if (r1 >= r4) goto L35
            r2 = r5[r1]
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            r0.append(r3)
            int r1 = r1 + 1
            goto L1b
        L2c:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            java.lang.String r3 = r3.toString()
            r0.append(r3)
        L35:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static <T> java.lang.reflect.Constructor<T> getMatchingAccessibleConstructor(java.lang.Class<T> r0, java.lang.Class<?>... r1) {
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> Lf
            boolean r1 = r0.isAccessible()     // Catch: java.lang.NoSuchMethodException -> Lf
            if (r1 != 0) goto Le
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> Lf
        Le:
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public static <T> T invokeConstructor(java.lang.Class<T> r1, java.lang.Object... r2) {
            java.lang.Class[] r0 = toClass(r2)
            java.lang.Object r1 = invokeConstructor(r1, r2, r0)
            return r1
    }

    public static <T> T invokeConstructor(java.lang.Class<T> r0, java.lang.Object[] r1, java.lang.Class<?>[] r2) {
            java.lang.reflect.Constructor r0 = getMatchingAccessibleConstructor(r0, r2)
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.newInstance(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static java.lang.Object invokeMethod(java.lang.Object r1, java.lang.String r2, java.lang.Object... r3) {
            java.lang.Class[] r0 = toClass(r3)
            java.lang.Object r1 = invokeMethod(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.Object invokeMethod(java.lang.Object r1, java.lang.String r2, java.lang.Object[] r3, java.lang.Class<?>[] r4) {
            java.lang.Class r0 = r1.getClass()
            java.lang.reflect.Method r4 = getAccessibleMethod(r0, r2, r4)
            if (r4 == 0) goto Lf
            java.lang.Object r1 = r4.invoke(r1, r3)
            return r1
        Lf:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException
            r1.<init>(r2)
            throw r1
    }

    public static java.lang.Object invokeStaticMethod(java.lang.Class r1, java.lang.String r2, java.lang.Object... r3) {
            java.lang.Class[] r0 = toClass(r3)
            java.lang.Object r1 = invokeStaticMethod(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.Object invokeStaticMethod(java.lang.Class r0, java.lang.String r1, java.lang.Object[] r2, java.lang.Class<?>[] r3) {
            java.lang.reflect.Method r0 = getAccessibleMethod(r0, r1, r3)
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.Object r0 = r0.invoke(r1, r2)
            return r0
        Lc:
            return r1
    }

    public static boolean isAssignableFrom(java.lang.Class<?> r1, java.lang.Class<?> r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            if (r1 != 0) goto Lf
            boolean r1 = r2.isPrimitive()
            if (r1 != 0) goto Le
            r1 = 1
            return r1
        Le:
            return r0
        Lf:
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L23
            boolean r0 = r2.isPrimitive()
            if (r0 != 0) goto L23
            java.util.HashMap<java.lang.Class<?>, java.lang.Class<?>> r0 = com.bytedance.embed_dr.MethodUtils.sPrimitiveToWrapperMap
            java.lang.Object r1 = r0.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
        L23:
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto L37
            boolean r0 = r1.isPrimitive()
            if (r0 != 0) goto L37
            java.util.HashMap<java.lang.Class<?>, java.lang.Class<?>> r0 = com.bytedance.embed_dr.MethodUtils.sPrimitiveToWrapperMap
            java.lang.Object r2 = r0.get(r2)
            java.lang.Class r2 = (java.lang.Class) r2
        L37:
            boolean r1 = r2.isAssignableFrom(r1)
            return r1
    }

    public static java.lang.Class<?>[] toClass(java.lang.Object... r3) {
            if (r3 == 0) goto L1c
            int r0 = r3.length
            if (r0 == 0) goto L1c
            int r0 = r3.length
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
        L9:
            int r2 = r3.length
            if (r1 >= r2) goto L1b
            r2 = r3[r1]
            if (r2 != 0) goto L12
            r2 = 0
            goto L16
        L12:
            java.lang.Class r2 = r2.getClass()
        L16:
            r0[r1] = r2
            int r1 = r1 + 1
            goto L9
        L1b:
            return r0
        L1c:
            java.lang.Class<?>[] r3 = com.bytedance.embed_dr.MethodUtils.EMPTY_CLASS_ARRAY
            return r3
    }
}
