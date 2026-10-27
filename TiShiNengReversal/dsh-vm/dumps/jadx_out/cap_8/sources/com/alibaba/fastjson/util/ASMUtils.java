package com.alibaba.fastjson.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ASMUtils {
    public static final boolean IS_ANDROID = false;
    public static final java.lang.String JAVA_VM_NAME = null;

    static {
            java.lang.String r0 = "java.vm.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            com.alibaba.fastjson.util.ASMUtils.JAVA_VM_NAME = r0
            boolean r0 = isAndroid(r0)
            com.alibaba.fastjson.util.ASMUtils.IS_ANDROID = r0
            return
    }

    public ASMUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean checkName(java.lang.String r4) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.length()
            r3 = 1
            if (r1 >= r2) goto L1c
            char r2 = r4.charAt(r1)
            if (r2 < r3) goto L1b
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 > r3) goto L1b
            r3 = 46
            if (r2 != r3) goto L18
            goto L1b
        L18:
            int r1 = r1 + 1
            goto L2
        L1b:
            return r0
        L1c:
            return r3
    }

    public static java.lang.String desc(java.lang.Class<?> r2) {
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto Lb
            java.lang.String r2 = getPrimitiveLetter(r2)
            return r2
        Lb:
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L2b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            java.lang.Class r2 = r2.getComponentType()
            java.lang.String r2 = desc(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L2b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "L"
            r0.append(r1)
            java.lang.String r2 = type(r2)
            r0.append(r2)
            java.lang.String r2 = ";"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String desc(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0.length
            int r2 = r2 + 1
            int r2 = r2 << 4
            r1.<init>(r2)
            r2 = 40
            r1.append(r2)
            r2 = 0
        L14:
            int r3 = r0.length
            if (r2 >= r3) goto L23
            r3 = r0[r2]
            java.lang.String r3 = desc(r3)
            r1.append(r3)
            int r2 = r2 + 1
            goto L14
        L23:
            r0 = 41
            r1.append(r0)
            java.lang.Class r4 = r4.getReturnType()
            java.lang.String r4 = desc(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    public static java.lang.reflect.Type getMethodType(java.lang.Class<?> r1, java.lang.String r2) {
            r0 = 0
            java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch: java.lang.Exception -> La
            java.lang.reflect.Type r1 = r1.getGenericReturnType()     // Catch: java.lang.Exception -> La
            return r1
        La:
            return r0
    }

    public static java.lang.String getPrimitiveLetter(java.lang.Class<?> r3) {
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r0 != r3) goto L7
            java.lang.String r3 = "I"
            return r3
        L7:
            java.lang.Class r0 = java.lang.Void.TYPE
            if (r0 != r3) goto Le
            java.lang.String r3 = "V"
            return r3
        Le:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r0 != r3) goto L15
            java.lang.String r3 = "Z"
            return r3
        L15:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r0 != r3) goto L1c
            java.lang.String r3 = "C"
            return r3
        L1c:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r0 != r3) goto L23
            java.lang.String r3 = "B"
            return r3
        L23:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r0 != r3) goto L2a
            java.lang.String r3 = "S"
            return r3
        L2a:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r0 != r3) goto L31
            java.lang.String r3 = "F"
            return r3
        L31:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r0 != r3) goto L38
            java.lang.String r3 = "J"
            return r3
        L38:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r0 != r3) goto L3f
            java.lang.String r3 = "D"
            return r3
        L3f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Type: "
            r1.append(r2)
            java.lang.String r3 = r3.getCanonicalName()
            r1.append(r3)
            java.lang.String r3 = " is not a primitive type"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static boolean isAndroid(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r2 = r2.toLowerCase()
            java.lang.String r1 = "dalvik"
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L1a
            java.lang.String r1 = "lemur"
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L19
            goto L1a
        L19:
            return r0
        L1a:
            r2 = 1
            return r2
    }

    public static java.lang.String type(java.lang.Class<?> r2) {
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            java.lang.Class r2 = r2.getComponentType()
            java.lang.String r2 = desc(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L20:
            boolean r0 = r2.isPrimitive()
            if (r0 != 0) goto L33
            java.lang.String r2 = r2.getName()
            r0 = 46
            r1 = 47
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
        L33:
            java.lang.String r2 = getPrimitiveLetter(r2)
            return r2
    }
}
