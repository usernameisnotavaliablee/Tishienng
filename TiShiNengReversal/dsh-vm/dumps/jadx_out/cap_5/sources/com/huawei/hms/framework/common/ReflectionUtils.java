package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ReflectionUtils {
    private static final java.lang.String a = "ReflectionUtils";




    public ReflectionUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.Class<?> a(java.lang.String r1) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L9
            return r1
        L9:
            return r0
    }

    private static java.lang.Object b(java.lang.Object r2, java.lang.reflect.Method r3, java.lang.Object... r4) throws java.lang.UnsupportedOperationException {
            java.lang.String r0 = "ReflectionUtils"
            r1 = 0
            if (r3 != 0) goto L6
            return r1
        L6:
            java.lang.Object r2 = r3.invoke(r2, r4)     // Catch: java.lang.Exception -> Lb java.lang.RuntimeException -> L12
            return r2
        Lb:
            r2 = move-exception
            java.lang.String r3 = "Exception in invoke:"
            com.huawei.hms.framework.common.Logger.e(r0, r3, r2)
            goto L18
        L12:
            r2 = move-exception
            java.lang.String r3 = "RuntimeException in invoke:"
            com.huawei.hms.framework.common.Logger.e(r0, r3, r2)
        L18:
            return r1
    }

    private static void c(java.lang.Class<?>[] r1, java.lang.Object r2, int r3) {
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L9
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r3] = r2
            return
        L9:
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto L12
            java.lang.Class r2 = java.lang.Long.TYPE
            r1[r3] = r2
            return
        L12:
            boolean r0 = r2 instanceof java.lang.Double
            if (r0 == 0) goto L1b
            java.lang.Class r2 = java.lang.Double.TYPE
            r1[r3] = r2
            return
        L1b:
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 == 0) goto L24
            java.lang.Class r2 = java.lang.Float.TYPE
            r1[r3] = r2
            return
        L24:
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto L2d
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r3] = r2
            return
        L2d:
            boolean r0 = r2 instanceof java.lang.Character
            if (r0 == 0) goto L36
            java.lang.Class r2 = java.lang.Character.TYPE
            r1[r3] = r2
            return
        L36:
            boolean r0 = r2 instanceof java.lang.Byte
            if (r0 == 0) goto L3f
            java.lang.Class r2 = java.lang.Byte.TYPE
            r1[r3] = r2
            return
        L3f:
            boolean r0 = r2 instanceof java.lang.Void
            if (r0 == 0) goto L48
            java.lang.Class r2 = java.lang.Void.TYPE
            r1[r3] = r2
            return
        L48:
            boolean r0 = r2 instanceof java.lang.Short
            if (r0 == 0) goto L51
            java.lang.Class r2 = java.lang.Short.TYPE
            r1[r3] = r2
            return
        L51:
            java.lang.Class r2 = r2.getClass()
            r1[r3] = r2
            return
    }

    public static boolean checkCompatible(java.lang.String r1) {
            d(r1)     // Catch: java.lang.Exception -> L5
            r1 = 1
            return r1
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "ClassNotFoundException"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "ReflectionUtils"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            r1 = 0
            return r1
    }

    public static boolean checkCompatible(java.lang.String r3, java.lang.String r4, java.lang.Class<?>... r5) {
            r0 = 0
            java.lang.String r1 = "ReflectionUtils"
            if (r3 == 0) goto L25
            if (r4 != 0) goto L8
            goto L25
        L8:
            java.lang.Class r2 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L2b java.lang.RuntimeException -> L40
            r2.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L2b java.lang.RuntimeException -> L40
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b java.lang.RuntimeException -> L40
            r5.<init>()     // Catch: java.lang.Exception -> L2b java.lang.RuntimeException -> L40
            java.lang.String r2 = "has method : "
            r5.append(r2)     // Catch: java.lang.Exception -> L2b java.lang.RuntimeException -> L40
            r5.append(r4)     // Catch: java.lang.Exception -> L2b java.lang.RuntimeException -> L40
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L2b java.lang.RuntimeException -> L40
            com.huawei.hms.framework.common.Logger.v(r1, r5)     // Catch: java.lang.Exception -> L2b java.lang.RuntimeException -> L40
            r3 = 1
            return r3
        L25:
            java.lang.String r5 = "targetClass is  null or name is null:"
            com.huawei.hms.framework.common.Logger.w(r1, r5)     // Catch: java.lang.Exception -> L2b java.lang.RuntimeException -> L40
            return r0
        L2b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = " NoSuchMethodException"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.huawei.hms.framework.common.Logger.w(r1, r3)
            goto L54
        L40:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = " RuntimeException"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.huawei.hms.framework.common.Logger.w(r1, r3)
        L54:
            return r0
    }

    private static void d(java.lang.String r1) throws java.lang.ClassNotFoundException {
            java.lang.Class<com.huawei.hms.framework.common.ReflectionUtils> r0 = com.huawei.hms.framework.common.ReflectionUtils.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 == 0) goto Lc
            r0.loadClass(r1)
            return
        Lc:
            java.lang.ClassNotFoundException r1 = new java.lang.ClassNotFoundException
            java.lang.String r0 = "not found classloader"
            r1.<init>(r0)
            throw r1
    }

    public static java.lang.reflect.Field getField(java.lang.Object r3, java.lang.String r4) {
            java.lang.String r0 = "ReflectionUtils"
            r1 = 0
            if (r3 == 0) goto L34
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto Lc
            goto L34
        Lc:
            java.lang.Class r3 = r3.getClass()
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.SecurityException -> L1d java.lang.NoSuchFieldException -> L1f java.lang.IllegalArgumentException -> L21
            com.huawei.hms.framework.common.ReflectionUtils$2 r4 = new com.huawei.hms.framework.common.ReflectionUtils$2     // Catch: java.lang.SecurityException -> L1d java.lang.NoSuchFieldException -> L1f java.lang.IllegalArgumentException -> L21
            r4.<init>(r3)     // Catch: java.lang.SecurityException -> L1d java.lang.NoSuchFieldException -> L1f java.lang.IllegalArgumentException -> L21
            java.security.AccessController.doPrivileged(r4)     // Catch: java.lang.SecurityException -> L1d java.lang.NoSuchFieldException -> L1f java.lang.IllegalArgumentException -> L21
            return r3
        L1d:
            r3 = move-exception
            goto L23
        L1f:
            r3 = move-exception
            goto L29
        L21:
            r3 = move-exception
            goto L2f
        L23:
            java.lang.String r4 = "not security int method getField,SecurityException:"
            com.huawei.hms.framework.common.Logger.e(r0, r4, r3)
            goto L34
        L29:
            java.lang.String r4 = "Exception in getField :: NoSuchFieldException:"
            com.huawei.hms.framework.common.Logger.e(r0, r4, r3)
            goto L34
        L2f:
            java.lang.String r4 = "Exception in getField :: IllegalArgumentException:"
            com.huawei.hms.framework.common.Logger.e(r0, r4, r3)
        L34:
            return r1
    }

    public static java.lang.Object getFieldObj(java.lang.Object r3, java.lang.String r4) {
            java.lang.String r0 = "ReflectionUtils"
            r1 = 0
            if (r3 == 0) goto L40
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto Lc
            goto L40
        Lc:
            java.lang.Class r2 = r3.getClass()
            java.lang.reflect.Field r4 = r2.getDeclaredField(r4)     // Catch: java.lang.SecurityException -> L21 java.lang.NoSuchFieldException -> L23 java.lang.IllegalArgumentException -> L25 java.lang.IllegalAccessException -> L27
            com.huawei.hms.framework.common.ReflectionUtils$1 r2 = new com.huawei.hms.framework.common.ReflectionUtils$1     // Catch: java.lang.SecurityException -> L21 java.lang.NoSuchFieldException -> L23 java.lang.IllegalArgumentException -> L25 java.lang.IllegalAccessException -> L27
            r2.<init>(r4)     // Catch: java.lang.SecurityException -> L21 java.lang.NoSuchFieldException -> L23 java.lang.IllegalArgumentException -> L25 java.lang.IllegalAccessException -> L27
            java.security.AccessController.doPrivileged(r2)     // Catch: java.lang.SecurityException -> L21 java.lang.NoSuchFieldException -> L23 java.lang.IllegalArgumentException -> L25 java.lang.IllegalAccessException -> L27
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.SecurityException -> L21 java.lang.NoSuchFieldException -> L23 java.lang.IllegalArgumentException -> L25 java.lang.IllegalAccessException -> L27
            return r3
        L21:
            r3 = move-exception
            goto L29
        L23:
            r3 = move-exception
            goto L2f
        L25:
            r3 = move-exception
            goto L35
        L27:
            r3 = move-exception
            goto L3b
        L29:
            java.lang.String r4 = "not security int method getFieldObj,SecurityException:"
            com.huawei.hms.framework.common.Logger.e(r0, r4, r3)
            goto L40
        L2f:
            java.lang.String r4 = "Exception in getFieldObj :: NoSuchFieldException:"
            com.huawei.hms.framework.common.Logger.e(r0, r4, r3)
            goto L40
        L35:
            java.lang.String r4 = "Exception in getFieldObj :: IllegalArgumentException:"
            com.huawei.hms.framework.common.Logger.e(r0, r4, r3)
            goto L40
        L3b:
            java.lang.String r4 = "Exception in getFieldObj :: IllegalAccessException:"
            com.huawei.hms.framework.common.Logger.e(r0, r4, r3)
        L40:
            return r1
    }

    public static java.lang.reflect.Method getMethod(java.lang.Class<?> r2, java.lang.String r3, java.lang.Class<?>... r4) {
            r0 = 0
            java.lang.String r1 = "ReflectionUtils"
            if (r2 == 0) goto L1b
            if (r3 != 0) goto L8
            goto L1b
        L8:
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> Ld java.lang.SecurityException -> L14
            return r2
        Ld:
            r2 = move-exception
            java.lang.String r3 = "NoSuchMethodException:"
            com.huawei.hms.framework.common.Logger.e(r1, r3, r2)
            goto L1a
        L14:
            r2 = move-exception
            java.lang.String r3 = "SecurityException:"
            com.huawei.hms.framework.common.Logger.e(r1, r3, r2)
        L1a:
            return r0
        L1b:
            java.lang.String r2 = "targetClass is  null pr name is null:"
            com.huawei.hms.framework.common.Logger.w(r1, r2)
            return r0
    }

    public static java.lang.Object getStaticFieldObj(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "ReflectionUtils"
            r1 = 0
            if (r3 != 0) goto L6
            return r1
        L6:
            java.lang.Class r3 = a(r3)
            if (r3 == 0) goto L43
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto L13
            goto L43
        L13:
            java.lang.reflect.Field r4 = r3.getDeclaredField(r4)     // Catch: java.lang.SecurityException -> L24 java.lang.NoSuchFieldException -> L26 java.lang.IllegalArgumentException -> L28 java.lang.IllegalAccessException -> L2a
            com.huawei.hms.framework.common.ReflectionUtils$3 r2 = new com.huawei.hms.framework.common.ReflectionUtils$3     // Catch: java.lang.SecurityException -> L24 java.lang.NoSuchFieldException -> L26 java.lang.IllegalArgumentException -> L28 java.lang.IllegalAccessException -> L2a
            r2.<init>(r4)     // Catch: java.lang.SecurityException -> L24 java.lang.NoSuchFieldException -> L26 java.lang.IllegalArgumentException -> L28 java.lang.IllegalAccessException -> L2a
            java.security.AccessController.doPrivileged(r2)     // Catch: java.lang.SecurityException -> L24 java.lang.NoSuchFieldException -> L26 java.lang.IllegalArgumentException -> L28 java.lang.IllegalAccessException -> L2a
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.SecurityException -> L24 java.lang.NoSuchFieldException -> L26 java.lang.IllegalArgumentException -> L28 java.lang.IllegalAccessException -> L2a
            return r3
        L24:
            r3 = move-exception
            goto L2c
        L26:
            r3 = move-exception
            goto L32
        L28:
            r3 = move-exception
            goto L38
        L2a:
            r3 = move-exception
            goto L3e
        L2c:
            java.lang.String r4 = "not security int method getStaticFieldObj,SecurityException:"
            com.huawei.hms.framework.common.Logger.e(r0, r4, r3)
            goto L43
        L32:
            java.lang.String r4 = "Exception in getFieldObj :: NoSuchFieldException:"
            com.huawei.hms.framework.common.Logger.e(r0, r4, r3)
            goto L43
        L38:
            java.lang.String r4 = "Exception in getFieldObj :: IllegalArgumentException:"
            com.huawei.hms.framework.common.Logger.e(r0, r4, r3)
            goto L43
        L3e:
            java.lang.String r4 = "Exception in getFieldObj :: IllegalAccessException:"
            com.huawei.hms.framework.common.Logger.e(r0, r4, r3)
        L43:
            return r1
    }

    public static java.lang.Object invokeStaticMethod(java.lang.String r0, java.lang.String r1, java.lang.Class<?>[] r2, java.lang.Object... r3) {
            java.lang.Class r0 = a(r0)
            java.lang.reflect.Method r0 = getMethod(r0, r1, r2)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.lang.Object r0 = b(r1, r0, r3)
            return r0
    }

    public static java.lang.Object invokeStaticMethod(java.lang.String r5, java.lang.String r6, java.lang.Object... r7) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            if (r7 == 0) goto L14
            int r1 = r7.length
            java.lang.Class[] r2 = new java.lang.Class[r1]
            r3 = 0
        La:
            if (r3 >= r1) goto L15
            r4 = r7[r3]
            c(r2, r4, r3)
            int r3 = r3 + 1
            goto La
        L14:
            r2 = r0
        L15:
            java.lang.Class r5 = a(r5)
            java.lang.reflect.Method r5 = getMethod(r5, r6, r2)
            if (r5 != 0) goto L20
            return r0
        L20:
            java.lang.Object r5 = b(r0, r5, r7)
            return r5
    }
}
