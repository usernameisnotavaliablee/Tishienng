package com.alibaba.fastjson.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FieldInfo implements java.lang.Comparable<com.alibaba.fastjson.util.FieldInfo> {
    public final java.lang.String[] alternateNames;
    public final java.lang.Class<?> declaringClass;
    public final java.lang.reflect.Field field;
    public final boolean fieldAccess;
    private final com.alibaba.fastjson.annotation.JSONField fieldAnnotation;
    public final java.lang.Class<?> fieldClass;
    public final boolean fieldTransient;
    public final java.lang.reflect.Type fieldType;
    public final java.lang.String format;
    public final boolean getOnly;
    public final boolean isEnum;
    public final boolean jsonDirect;
    public final java.lang.String label;
    public final java.lang.reflect.Method method;
    private final com.alibaba.fastjson.annotation.JSONField methodAnnotation;
    public final java.lang.String name;
    public final char[] name_chars;
    private int ordinal;
    public final int parserFeatures;
    public final int serialzeFeatures;
    public final boolean unwrapped;

    public FieldInfo(java.lang.String r1, java.lang.Class<?> r2, java.lang.Class<?> r3, java.lang.reflect.Type r4, java.lang.reflect.Field r5, int r6, int r7, int r8) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.declaringClass = r2
            r0.fieldClass = r3
            r0.fieldType = r4
            r1 = 0
            r0.method = r1
            r0.field = r5
            r0.ordinal = r6
            r0.serialzeFeatures = r7
            r2 = 0
            r0.parserFeatures = r2
            boolean r3 = r3.isEnum()
            r0.isEnum = r3
            if (r5 == 0) goto L2d
            int r3 = r5.getModifiers()
            r4 = 1
            r0.fieldAccess = r4
            boolean r3 = java.lang.reflect.Modifier.isTransient(r3)
            r0.fieldTransient = r3
            goto L31
        L2d:
            r0.fieldTransient = r2
            r0.fieldAccess = r2
        L31:
            char[] r3 = r0.genFieldNameChars()
            r0.name_chars = r3
            if (r5 == 0) goto L3c
            com.alibaba.fastjson.util.TypeUtils.setAccessible(r5)
        L3c:
            java.lang.String r3 = ""
            r0.label = r3
            r0.fieldAnnotation = r1
            r0.methodAnnotation = r1
            r0.getOnly = r2
            r0.jsonDirect = r2
            r0.unwrapped = r2
            r0.format = r1
            java.lang.String[] r1 = new java.lang.String[r2]
            r0.alternateNames = r1
            return
    }

    public FieldInfo(java.lang.String r4, java.lang.reflect.Method r5, java.lang.reflect.Field r6, java.lang.Class<?> r7, java.lang.reflect.Type r8, int r9, int r10, int r11, com.alibaba.fastjson.annotation.JSONField r12, com.alibaba.fastjson.annotation.JSONField r13, java.lang.String r14) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.ordinal = r0
            if (r6 == 0) goto L13
            java.lang.String r1 = r6.getName()
            boolean r2 = r1.equals(r4)
            if (r2 == 0) goto L13
            r4 = r1
        L13:
            r3.name = r4
            r3.method = r5
            r3.field = r6
            r3.ordinal = r9
            r3.serialzeFeatures = r10
            r3.parserFeatures = r11
            r3.fieldAnnotation = r12
            r3.methodAnnotation = r13
            r4 = 1
            if (r6 == 0) goto L49
            int r9 = r6.getModifiers()
            r10 = r9 & 1
            if (r10 != 0) goto L33
            if (r5 != 0) goto L31
            goto L33
        L31:
            r10 = 0
            goto L34
        L33:
            r10 = 1
        L34:
            r3.fieldAccess = r10
            boolean r9 = java.lang.reflect.Modifier.isTransient(r9)
            if (r9 != 0) goto L45
            boolean r9 = com.alibaba.fastjson.util.TypeUtils.isTransient(r5)
            if (r9 == 0) goto L43
            goto L45
        L43:
            r9 = 0
            goto L46
        L45:
            r9 = 1
        L46:
            r3.fieldTransient = r9
            goto L4d
        L49:
            r3.fieldAccess = r0
            r3.fieldTransient = r0
        L4d:
            if (r14 == 0) goto L58
            int r9 = r14.length()
            if (r9 <= 0) goto L58
            r3.label = r14
            goto L5c
        L58:
            java.lang.String r9 = ""
            r3.label = r9
        L5c:
            com.alibaba.fastjson.annotation.JSONField r9 = r3.getAnnotation()
            r10 = 0
            if (r9 == 0) goto L84
            java.lang.String r11 = r9.format()
            java.lang.String r12 = r11.trim()
            int r12 = r12.length()
            if (r12 != 0) goto L72
            goto L73
        L72:
            r10 = r11
        L73:
            boolean r11 = r9.jsonDirect()
            boolean r12 = r9.unwrapped()
            r3.unwrapped = r12
            java.lang.String[] r9 = r9.alternateNames()
            r3.alternateNames = r9
            goto L8b
        L84:
            r3.unwrapped = r0
            java.lang.String[] r9 = new java.lang.String[r0]
            r3.alternateNames = r9
            r11 = 0
        L8b:
            r3.format = r10
            char[] r9 = r3.genFieldNameChars()
            r3.name_chars = r9
            if (r5 == 0) goto L98
            com.alibaba.fastjson.util.TypeUtils.setAccessible(r5)
        L98:
            if (r6 == 0) goto L9d
            com.alibaba.fastjson.util.TypeUtils.setAccessible(r6)
        L9d:
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            if (r5 == 0) goto Ld2
            java.lang.Class[] r6 = r5.getParameterTypes()
            int r12 = r6.length
            if (r12 != r4) goto Lb4
            r6 = r6[r0]
            java.lang.reflect.Type[] r12 = r5.getGenericParameterTypes()
            r12 = r12[r0]
        Lb2:
            r13 = 0
            goto Lcb
        Lb4:
            int r12 = r6.length
            r13 = 2
            if (r12 != r13) goto Lc2
            r12 = r6[r0]
            if (r12 != r10) goto Lc2
            r6 = r6[r4]
            if (r6 != r9) goto Lc2
            r6 = r12
            goto Lb2
        Lc2:
            java.lang.Class r6 = r5.getReturnType()
            java.lang.reflect.Type r12 = r5.getGenericReturnType()
            r13 = 1
        Lcb:
            java.lang.Class r5 = r5.getDeclaringClass()
            r3.declaringClass = r5
            goto Le9
        Ld2:
            java.lang.Class r5 = r6.getType()
            java.lang.reflect.Type r12 = r6.getGenericType()
            java.lang.Class r13 = r6.getDeclaringClass()
            r3.declaringClass = r13
            int r6 = r6.getModifiers()
            boolean r13 = java.lang.reflect.Modifier.isFinal(r6)
            r6 = r5
        Le9:
            r3.getOnly = r13
            if (r11 == 0) goto Lf0
            if (r6 != r10) goto Lf0
            r0 = 1
        Lf0:
            r3.jsonDirect = r0
            if (r7 == 0) goto L112
            if (r6 != r9) goto L112
            boolean r4 = r12 instanceof java.lang.reflect.TypeVariable
            if (r4 == 0) goto L112
            r4 = r12
            java.lang.reflect.TypeVariable r4 = (java.lang.reflect.TypeVariable) r4
            java.lang.reflect.Type r4 = getInheritGenericType(r7, r8, r4)
            if (r4 == 0) goto L112
            java.lang.Class r5 = com.alibaba.fastjson.util.TypeUtils.getClass(r4)
            r3.fieldClass = r5
            r3.fieldType = r4
            boolean r4 = r6.isEnum()
            r3.isEnum = r4
            return
        L112:
            boolean r4 = r12 instanceof java.lang.Class
            if (r4 != 0) goto L133
            if (r8 == 0) goto L119
            goto L11a
        L119:
            r8 = r7
        L11a:
            java.lang.reflect.Type r4 = getFieldType(r7, r8, r12)
            if (r4 == r12) goto L128
            boolean r5 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L12a
            java.lang.Class r6 = com.alibaba.fastjson.util.TypeUtils.getClass(r4)
        L128:
            r12 = r4
            goto L133
        L12a:
            boolean r5 = r4 instanceof java.lang.Class
            if (r5 == 0) goto L128
            java.lang.Class r6 = com.alibaba.fastjson.util.TypeUtils.getClass(r4)
            goto L128
        L133:
            r3.fieldType = r12
            r3.fieldClass = r6
            boolean r4 = r6.isEnum()
            r3.isEnum = r4
            return
    }

    private static boolean getArgument(java.lang.reflect.Type[] r7, java.lang.reflect.TypeVariable[] r8, java.lang.reflect.Type[] r9) {
            r0 = 0
            if (r9 == 0) goto L4c
            int r1 = r8.length
            if (r1 != 0) goto L7
            goto L4c
        L7:
            r1 = 0
            r2 = 0
        L9:
            int r3 = r7.length
            if (r1 >= r3) goto L4b
            r3 = r7[r1]
            boolean r4 = r3 instanceof java.lang.reflect.ParameterizedType
            r5 = 1
            if (r4 == 0) goto L30
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type[] r4 = r3.getActualTypeArguments()
            boolean r6 = getArgument(r4, r8, r9)
            if (r6 == 0) goto L48
            com.alibaba.fastjson.util.ParameterizedTypeImpl r2 = new com.alibaba.fastjson.util.ParameterizedTypeImpl
            java.lang.reflect.Type r6 = r3.getOwnerType()
            java.lang.reflect.Type r3 = r3.getRawType()
            r2.<init>(r4, r6, r3)
            r7[r1] = r2
            r2 = 1
            goto L48
        L30:
            boolean r4 = r3 instanceof java.lang.reflect.TypeVariable
            if (r4 == 0) goto L48
            r4 = 0
        L35:
            int r6 = r8.length
            if (r4 >= r6) goto L48
            r6 = r8[r4]
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L45
            r2 = r9[r4]
            r7[r1] = r2
            r2 = 1
        L45:
            int r4 = r4 + 1
            goto L35
        L48:
            int r1 = r1 + 1
            goto L9
        L4b:
            return r2
        L4c:
            return r0
    }

    public static java.lang.reflect.Type getFieldType(java.lang.Class<?> r6, java.lang.reflect.Type r7, java.lang.reflect.Type r8) {
            if (r6 == 0) goto La7
            if (r7 != 0) goto L6
            goto La7
        L6:
            boolean r0 = r8 instanceof java.lang.reflect.GenericArrayType
            r1 = 0
            if (r0 == 0) goto L26
            r0 = r8
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            java.lang.reflect.Type r0 = r0.getGenericComponentType()
            java.lang.reflect.Type r6 = getFieldType(r6, r7, r0)
            if (r0 == r6) goto L25
            java.lang.Class r6 = com.alibaba.fastjson.util.TypeUtils.getClass(r6)
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r1)
            java.lang.Class r6 = r6.getClass()
            return r6
        L25:
            return r8
        L26:
            boolean r0 = com.alibaba.fastjson.util.TypeUtils.isGenericParamType(r7)
            if (r0 != 0) goto L2e
            goto La7
        L2e:
            boolean r0 = r8 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L60
            java.lang.reflect.Type r0 = com.alibaba.fastjson.util.TypeUtils.getGenericParamType(r7)
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.Class r2 = com.alibaba.fastjson.util.TypeUtils.getClass(r0)
            r3 = r8
            java.lang.reflect.TypeVariable r3 = (java.lang.reflect.TypeVariable) r3
            java.lang.reflect.TypeVariable[] r2 = r2.getTypeParameters()
        L43:
            int r4 = r2.length
            if (r1 >= r4) goto L60
            r4 = r2[r1]
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r3.getName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L5d
            java.lang.reflect.Type[] r6 = r0.getActualTypeArguments()
            r6 = r6[r1]
            return r6
        L5d:
            int r1 = r1 + 1
            goto L43
        L60:
            boolean r0 = r8 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto La7
            r0 = r8
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r1 = r0.getActualTypeArguments()
            boolean r2 = r7 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L76
            java.lang.reflect.ParameterizedType r7 = (java.lang.reflect.ParameterizedType) r7
            java.lang.reflect.TypeVariable[] r6 = r6.getTypeParameters()
            goto L8f
        L76:
            java.lang.reflect.Type r7 = r6.getGenericSuperclass()
            boolean r7 = r7 instanceof java.lang.reflect.ParameterizedType
            if (r7 == 0) goto L8d
            java.lang.reflect.Type r7 = r6.getGenericSuperclass()
            java.lang.reflect.ParameterizedType r7 = (java.lang.reflect.ParameterizedType) r7
            java.lang.Class r6 = r6.getSuperclass()
            java.lang.reflect.TypeVariable[] r6 = r6.getTypeParameters()
            goto L8f
        L8d:
            r7 = 0
            r6 = r7
        L8f:
            java.lang.reflect.Type[] r7 = r7.getActualTypeArguments()
            boolean r6 = getArgument(r1, r6, r7)
            if (r6 == 0) goto La7
            com.alibaba.fastjson.util.ParameterizedTypeImpl r6 = new com.alibaba.fastjson.util.ParameterizedTypeImpl
            java.lang.reflect.Type r7 = r0.getOwnerType()
            java.lang.reflect.Type r8 = r0.getRawType()
            r6.<init>(r1, r7, r8)
            return r6
        La7:
            return r8
    }

    private static java.lang.reflect.Type getInheritGenericType(java.lang.Class<?> r4, java.lang.reflect.Type r5, java.lang.reflect.TypeVariable<?> r6) {
            java.lang.reflect.GenericDeclaration r0 = r6.getGenericDeclaration()
            java.lang.Class r0 = (java.lang.Class) r0
            r1 = 0
            if (r0 != r4) goto L16
            boolean r4 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L14
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type[] r4 = r5.getActualTypeArguments()
            goto L3b
        L14:
            r4 = r1
            goto L3b
        L16:
            r5 = r1
        L17:
            if (r4 == 0) goto L3a
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r4 == r2) goto L3a
            if (r4 == r0) goto L3a
            java.lang.reflect.Type r2 = r4.getGenericSuperclass()
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L35
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r2 = r2.getActualTypeArguments()
            java.lang.reflect.TypeVariable[] r3 = r4.getTypeParameters()
            getArgument(r2, r3, r5)
            r5 = r2
        L35:
            java.lang.Class r4 = r4.getSuperclass()
            goto L17
        L3a:
            r4 = r5
        L3b:
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.lang.reflect.TypeVariable[] r5 = r0.getTypeParameters()
            r0 = 0
        L43:
            int r2 = r5.length
            if (r0 >= r2) goto L54
            r2 = r5[r0]
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L51
            r4 = r4[r0]
            return r4
        L51:
            int r0 = r0 + 1
            goto L43
        L54:
            return r1
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.alibaba.fastjson.util.FieldInfo r7) {
            r6 = this;
            int r0 = r6.ordinal
            int r1 = r7.ordinal
            r2 = -1
            if (r0 >= r1) goto L8
            return r2
        L8:
            r3 = 1
            if (r0 <= r1) goto Lc
            return r3
        Lc:
            java.lang.String r0 = r6.name
            java.lang.String r1 = r7.name
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L17
            return r0
        L17:
            java.lang.Class r0 = r6.getDeclaredClass()
            java.lang.Class r1 = r7.getDeclaredClass()
            if (r0 == 0) goto L33
            if (r1 == 0) goto L33
            if (r0 == r1) goto L33
            boolean r4 = r0.isAssignableFrom(r1)
            if (r4 == 0) goto L2c
            return r2
        L2c:
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L33
            return r3
        L33:
            java.lang.reflect.Field r0 = r6.field
            r1 = 0
            if (r0 == 0) goto L42
            java.lang.Class r0 = r0.getType()
            java.lang.Class<?> r4 = r6.fieldClass
            if (r0 != r4) goto L42
            r0 = 1
            goto L43
        L42:
            r0 = 0
        L43:
            java.lang.reflect.Field r4 = r7.field
            if (r4 == 0) goto L50
            java.lang.Class r4 = r4.getType()
            java.lang.Class<?> r5 = r7.fieldClass
            if (r4 != r5) goto L50
            r1 = 1
        L50:
            if (r0 == 0) goto L55
            if (r1 != 0) goto L55
            return r3
        L55:
            if (r1 == 0) goto L5a
            if (r0 != 0) goto L5a
            return r2
        L5a:
            java.lang.Class<?> r0 = r7.fieldClass
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L6b
            java.lang.Class<?> r0 = r6.fieldClass
            boolean r0 = r0.isPrimitive()
            if (r0 != 0) goto L6b
            return r3
        L6b:
            java.lang.Class<?> r0 = r6.fieldClass
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L7c
            java.lang.Class<?> r0 = r7.fieldClass
            boolean r0 = r0.isPrimitive()
            if (r0 != 0) goto L7c
            return r2
        L7c:
            java.lang.Class<?> r0 = r7.fieldClass
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "java."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L97
            java.lang.Class<?> r0 = r6.fieldClass
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L97
            return r3
        L97:
            java.lang.Class<?> r0 = r6.fieldClass
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto Lb0
            java.lang.Class<?> r0 = r7.fieldClass
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto Lb0
            return r2
        Lb0:
            java.lang.Class<?> r0 = r6.fieldClass
            java.lang.String r0 = r0.getName()
            java.lang.Class<?> r7 = r7.fieldClass
            java.lang.String r7 = r7.getName()
            int r7 = r0.compareTo(r7)
            return r7
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.alibaba.fastjson.util.FieldInfo r1) {
            r0 = this;
            com.alibaba.fastjson.util.FieldInfo r1 = (com.alibaba.fastjson.util.FieldInfo) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    protected char[] genFieldNameChars() {
            r6 = this;
            java.lang.String r0 = r6.name
            int r0 = r0.length()
            int r1 = r0 + 3
            char[] r1 = new char[r1]
            java.lang.String r2 = r6.name
            int r3 = r2.length()
            r4 = 1
            r5 = 0
            r2.getChars(r5, r3, r1, r4)
            r2 = 34
            r1[r5] = r2
            int r3 = r0 + 1
            r1[r3] = r2
            int r0 = r0 + 2
            r2 = 58
            r1[r0] = r2
            return r1
    }

    public java.lang.Object get(java.lang.Object r3) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r2 = this;
            java.lang.reflect.Method r0 = r2.method
            if (r0 == 0) goto La
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)
            return r3
        La:
            java.lang.reflect.Field r0 = r2.field
            java.lang.Object r3 = r0.get(r3)
            return r3
    }

    public <T extends java.lang.annotation.Annotation> T getAnnation(java.lang.Class<T> r3) {
            r2 = this;
            java.lang.Class<com.alibaba.fastjson.annotation.JSONField> r0 = com.alibaba.fastjson.annotation.JSONField.class
            if (r3 != r0) goto L9
            com.alibaba.fastjson.annotation.JSONField r3 = r2.getAnnotation()
            return r3
        L9:
            java.lang.reflect.Method r0 = r2.method
            if (r0 == 0) goto L12
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r3)
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 != 0) goto L1e
            java.lang.reflect.Field r1 = r2.field
            if (r1 == 0) goto L1e
            java.lang.annotation.Annotation r3 = r1.getAnnotation(r3)
            return r3
        L1e:
            return r0
    }

    public com.alibaba.fastjson.annotation.JSONField getAnnotation() {
            r1 = this;
            com.alibaba.fastjson.annotation.JSONField r0 = r1.fieldAnnotation
            if (r0 == 0) goto L5
            return r0
        L5:
            com.alibaba.fastjson.annotation.JSONField r0 = r1.methodAnnotation
            return r0
    }

    protected java.lang.Class<?> getDeclaredClass() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.method
            if (r0 == 0) goto L9
            java.lang.Class r0 = r0.getDeclaringClass()
            return r0
        L9:
            java.lang.reflect.Field r0 = r1.field
            if (r0 == 0) goto L12
            java.lang.Class r0 = r0.getDeclaringClass()
            return r0
        L12:
            r0 = 0
            return r0
    }

    public java.lang.String getFormat() {
            r1 = this;
            java.lang.String r0 = r1.format
            return r0
    }

    public java.lang.reflect.Member getMember() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.method
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.reflect.Field r0 = r1.field
            return r0
    }

    public void set(java.lang.Object r4, java.lang.Object r5) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r3 = this;
            java.lang.reflect.Method r0 = r3.method
            if (r0 == 0) goto Le
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r0.invoke(r4, r1)
            return
        Le:
            java.lang.reflect.Field r0 = r3.field
            r0.set(r4, r5)
            return
    }

    public void setAccessible() throws java.lang.SecurityException {
            r1 = this;
            java.lang.reflect.Method r0 = r1.method
            if (r0 == 0) goto L8
            com.alibaba.fastjson.util.TypeUtils.setAccessible(r0)
            return
        L8:
            java.lang.reflect.Field r0 = r1.field
            com.alibaba.fastjson.util.TypeUtils.setAccessible(r0)
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }
}
