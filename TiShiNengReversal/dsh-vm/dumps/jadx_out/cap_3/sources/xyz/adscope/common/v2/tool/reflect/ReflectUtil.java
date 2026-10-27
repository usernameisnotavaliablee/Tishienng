package xyz.adscope.common.v2.tool.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ReflectUtil {
    private ReflectUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object createNewBaseFromJsonModel(java.lang.Class<?> r4, org.json.JSONObject r5) {
            if (r5 == 0) goto L24
            r0 = 1
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.InstantiationException -> L1a java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e java.lang.NoSuchMethodException -> L20
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.InstantiationException -> L1a java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e java.lang.NoSuchMethodException -> L20
            java.lang.reflect.Constructor r4 = r4.getConstructor(r1)     // Catch: java.lang.InstantiationException -> L1a java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e java.lang.NoSuchMethodException -> L20
            r4.setAccessible(r0)     // Catch: java.lang.InstantiationException -> L1a java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e java.lang.NoSuchMethodException -> L20
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.InstantiationException -> L1a java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e java.lang.NoSuchMethodException -> L20
            r0[r3] = r5     // Catch: java.lang.InstantiationException -> L1a java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e java.lang.NoSuchMethodException -> L20
            java.lang.Object r4 = r4.newInstance(r0)     // Catch: java.lang.InstantiationException -> L1a java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e java.lang.NoSuchMethodException -> L20
            return r4
        L1a:
            r4 = move-exception
            goto L21
        L1c:
            r4 = move-exception
            goto L21
        L1e:
            r4 = move-exception
            goto L21
        L20:
            r4 = move-exception
        L21:
            xyz.adscope.common.v2.log.SDKLog.stack(r4)
        L24:
            r4 = 0
            return r4
    }

    public static java.util.List<java.lang.Object> createNewListInstance(java.lang.Class<?> r0) {
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.InstantiationException -> L7 java.lang.IllegalAccessException -> L9
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.InstantiationException -> L7 java.lang.IllegalAccessException -> L9
            return r0
        L7:
            r0 = move-exception
            goto La
        L9:
            r0 = move-exception
        La:
            xyz.adscope.common.v2.log.SDKLog.stack(r0)
            r0 = 0
            return r0
    }

    private static void fillSuperFields(java.util.List<java.lang.reflect.Field> r2, java.lang.Class<?> r3) {
            java.lang.Class r3 = r3.getSuperclass()
            if (r3 == 0) goto L13
            java.lang.reflect.Field[] r0 = r3.getDeclaredFields()
            int r1 = r0.length
            if (r1 <= 0) goto L13
            java.util.Collections.addAll(r2, r0)
            fillSuperFields(r2, r3)
        L13:
            return
    }

    public static java.util.List<java.lang.reflect.Field> getAllFields(java.lang.Class<?> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.reflect.Field[] r1 = r2.getDeclaredFields()
            java.util.Collections.addAll(r0, r1)
            fillSuperFields(r0, r2)
            return r0
    }

    public static java.lang.Object getBasicValue(java.lang.Class<?> r2, java.lang.Object r3) {
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto Lb2
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L12
            goto Lb2
        L12:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto La5
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L24
            goto La5
        L24:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L70
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L35
            goto L70
        L35:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L63
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L46
            goto L63
        L46:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L56
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            boolean r2 = r0.isAssignableFrom(r2)
            if (r2 == 0) goto La4
        L56:
            java.lang.String r2 = r3.toString()
            long r2 = xyz.adscope.common.v2.tool.str.StringUtil.parseLong(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            return r2
        L63:
            java.lang.String r2 = r3.toString()
            double r2 = xyz.adscope.common.v2.tool.str.StringUtil.parseDouble(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
        L70:
            boolean r2 = r3 instanceof java.lang.String
            r0 = 0
            r1 = 1
            if (r2 == 0) goto L90
            java.lang.String r2 = r3.toString()
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            if (r2 != 0) goto La4
            java.lang.String r2 = r3.toString()
            int r2 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r2)
            if (r2 <= 0) goto L8b
            r0 = 1
        L8b:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L90:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 == 0) goto La4
            java.lang.String r2 = r3.toString()
            int r2 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r2)
            if (r2 <= 0) goto L9f
            r0 = 1
        L9f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        La4:
            return r3
        La5:
            java.lang.String r2 = r3.toString()
            float r2 = xyz.adscope.common.v2.tool.str.StringUtil.parseFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
        Lb2:
            java.lang.String r2 = r3.toString()
            int r2 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }

    public static java.util.List<java.lang.reflect.Field> getDeclaredFields(java.lang.Class<?> r1) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.reflect.Field[] r1 = r1.getDeclaredFields()
            java.util.Collections.addAll(r0, r1)
            return r0
    }

    public static java.lang.Object getFieldValue(java.lang.Object r1, java.lang.reflect.Field r2) {
            int r0 = r2.getModifiers()     // Catch: java.lang.IllegalAccessException -> L13
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)     // Catch: java.lang.IllegalAccessException -> L13
            if (r0 != 0) goto Le
            r0 = 1
            r2.setAccessible(r0)     // Catch: java.lang.IllegalAccessException -> L13
        Le:
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.IllegalAccessException -> L13
            return r1
        L13:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
            r1 = 0
            return r1
    }

    public static boolean hasSdk(java.lang.String r1) {
            r0 = 1
            java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L5
            return r0
        L5:
            r1 = 0
            return r1
    }

    public static boolean isAnnotationType(java.lang.reflect.Field r0, java.lang.Class<? extends java.lang.annotation.Annotation> r1) {
            boolean r0 = r0.isAnnotationPresent(r1)
            return r0
    }

    public static boolean isBasicType(java.lang.Class<?> r1) {
            boolean r0 = r1.isPrimitive()
            if (r0 != 0) goto L14
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto Lf
            goto L14
        Lf:
            boolean r1 = isWrapType(r1)
            return r1
        L14:
            r1 = 1
            return r1
    }

    public static boolean isWrapType(java.lang.Class<?> r2) {
            r0 = 0
            java.lang.String r1 = "TYPE"
            java.lang.reflect.Field r2 = r2.getField(r1)     // Catch: java.lang.Exception -> L19
            r1 = 0
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Exception -> L19
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Exception -> L19
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Exception -> L19
            boolean r2 = r2.isPrimitive()     // Catch: java.lang.Exception -> L19
            if (r2 == 0) goto L19
            r2 = 1
            return r2
        L19:
            return r0
    }

    public static void setFieldValue(java.lang.Object r2, java.lang.reflect.Field r3, java.lang.Object r4) {
            int r0 = r3.getModifiers()     // Catch: java.lang.NullPointerException -> L2f java.lang.IllegalArgumentException -> L31 java.lang.IllegalAccessException -> L33
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)     // Catch: java.lang.NullPointerException -> L2f java.lang.IllegalArgumentException -> L31 java.lang.IllegalAccessException -> L33
            if (r0 != 0) goto Le
            r0 = 1
            r3.setAccessible(r0)     // Catch: java.lang.NullPointerException -> L2f java.lang.IllegalArgumentException -> L31 java.lang.IllegalAccessException -> L33
        Le:
            java.lang.Class r0 = r3.getType()     // Catch: java.lang.NullPointerException -> L2f java.lang.IllegalArgumentException -> L31 java.lang.IllegalAccessException -> L33
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r1 = r1.isAssignableFrom(r0)     // Catch: java.lang.NullPointerException -> L2f java.lang.IllegalArgumentException -> L31 java.lang.IllegalAccessException -> L33
            if (r1 == 0) goto L27
            if (r4 == 0) goto L21
            java.lang.String r4 = r4.toString()     // Catch: java.lang.NullPointerException -> L2f java.lang.IllegalArgumentException -> L31 java.lang.IllegalAccessException -> L33
            goto L23
        L21:
            java.lang.String r4 = ""
        L23:
            r3.set(r2, r4)     // Catch: java.lang.NullPointerException -> L2f java.lang.IllegalArgumentException -> L31 java.lang.IllegalAccessException -> L33
            return
        L27:
            java.lang.Object r4 = getBasicValue(r0, r4)     // Catch: java.lang.NullPointerException -> L2f java.lang.IllegalArgumentException -> L31 java.lang.IllegalAccessException -> L33
            r3.set(r2, r4)     // Catch: java.lang.NullPointerException -> L2f java.lang.IllegalArgumentException -> L31 java.lang.IllegalAccessException -> L33
            return
        L2f:
            r2 = move-exception
            goto L34
        L31:
            r2 = move-exception
            goto L34
        L33:
            r2 = move-exception
        L34:
            xyz.adscope.common.v2.log.SDKLog.stack(r2)
            return
    }
}
