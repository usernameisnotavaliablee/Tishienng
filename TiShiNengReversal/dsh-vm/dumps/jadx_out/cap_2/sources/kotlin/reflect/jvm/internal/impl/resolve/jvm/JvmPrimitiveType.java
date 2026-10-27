package kotlin.reflect.jvm.internal.impl.resolve.jvm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum JvmPrimitiveType extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType> {
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType BOOLEAN = null;
    public static final kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType BYTE = null;
    public static final kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType CHAR = null;
    public static final kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType DOUBLE = null;
    public static final kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType FLOAT = null;
    public static final kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType INT = null;
    public static final kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType LONG = null;
    private static final java.util.Map<java.lang.String, java.lang.String> OWNER_TO_BOXING_METHOD_DESCRIPTOR = null;
    public static final kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType SHORT = null;
    private static final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType> TYPE_BY_DESC = null;
    private static final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType> TYPE_BY_NAME = null;
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType> TYPE_BY_PRIMITIVE_TYPE = null;
    private static final java.util.Set<java.lang.String> WRAPPER_CLASS_INTERNAL_NAMES = null;
    private final java.lang.String desc;
    private final java.lang.String name;
    private final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType;
    private final kotlin.reflect.jvm.internal.impl.name.c wrapperFqName;

    private static /* synthetic */ void $$$reportNull$$$0(int r8) {
            r0 = 6
            r1 = 4
            if (r8 == r1) goto Lc
            if (r8 == r0) goto Lc
            switch(r8) {
                case 12: goto Lc;
                case 13: goto Lc;
                case 14: goto Lc;
                case 15: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Le:
            r3 = 2
            if (r8 == r1) goto L18
            if (r8 == r0) goto L18
            switch(r8) {
                case 12: goto L18;
                case 13: goto L18;
                case 14: goto L18;
                case 15: goto L18;
                default: goto L16;
            }
        L16:
            r4 = 3
            goto L19
        L18:
            r4 = 2
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType"
            r6 = 0
            switch(r8) {
                case 1: goto L47;
                case 2: goto L42;
                case 3: goto L3d;
                case 4: goto L3a;
                case 5: goto L35;
                case 6: goto L3a;
                case 7: goto L30;
                case 8: goto L2b;
                case 9: goto L3d;
                case 10: goto L30;
                case 11: goto L26;
                case 12: goto L3a;
                case 13: goto L3a;
                case 14: goto L3a;
                case 15: goto L3a;
                default: goto L21;
            }
        L21:
            java.lang.String r7 = "internalName"
            r4[r6] = r7
            goto L4b
        L26:
            java.lang.String r7 = "wrapperClassName"
            r4[r6] = r7
            goto L4b
        L2b:
            java.lang.String r7 = "primitiveType"
            r4[r6] = r7
            goto L4b
        L30:
            java.lang.String r7 = "desc"
            r4[r6] = r7
            goto L4b
        L35:
            java.lang.String r7 = "type"
            r4[r6] = r7
            goto L4b
        L3a:
            r4[r6] = r5
            goto L4b
        L3d:
            java.lang.String r7 = "name"
            r4[r6] = r7
            goto L4b
        L42:
            java.lang.String r7 = "methodDescriptor"
            r4[r6] = r7
            goto L4b
        L47:
            java.lang.String r7 = "owner"
            r4[r6] = r7
        L4b:
            java.lang.String r6 = "get"
            r7 = 1
            if (r8 == r1) goto L6c
            if (r8 == r0) goto L6c
            switch(r8) {
                case 12: goto L67;
                case 13: goto L62;
                case 14: goto L5d;
                case 15: goto L58;
                default: goto L55;
            }
        L55:
            r4[r7] = r5
            goto L6e
        L58:
            java.lang.String r5 = "getWrapperFqName"
            r4[r7] = r5
            goto L6e
        L5d:
            java.lang.String r5 = "getDesc"
            r4[r7] = r5
            goto L6e
        L62:
            java.lang.String r5 = "getJavaKeywordName"
            r4[r7] = r5
            goto L6e
        L67:
            java.lang.String r5 = "getPrimitiveType"
            r4[r7] = r5
            goto L6e
        L6c:
            r4[r7] = r6
        L6e:
            switch(r8) {
                case 1: goto L83;
                case 2: goto L83;
                case 3: goto L80;
                case 4: goto L87;
                case 5: goto L80;
                case 6: goto L87;
                case 7: goto L7b;
                case 8: goto L76;
                case 9: goto L76;
                case 10: goto L76;
                case 11: goto L76;
                case 12: goto L87;
                case 13: goto L87;
                case 14: goto L87;
                case 15: goto L87;
                default: goto L71;
            }
        L71:
            java.lang.String r5 = "isWrapperClassInternalName"
            r4[r3] = r5
            goto L87
        L76:
            java.lang.String r5 = "<init>"
            r4[r3] = r5
            goto L87
        L7b:
            java.lang.String r5 = "getByDesc"
            r4[r3] = r5
            goto L87
        L80:
            r4[r3] = r6
            goto L87
        L83:
            java.lang.String r5 = "isBoxingMethodDescriptor"
            r4[r3] = r5
        L87:
            java.lang.String r2 = java.lang.String.format(r2, r4)
            if (r8 == r1) goto L98
            if (r8 == r0) goto L98
            switch(r8) {
                case 12: goto L98;
                case 13: goto L98;
                case 14: goto L98;
                case 15: goto L98;
                default: goto L92;
            }
        L92:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r2)
            goto L9d
        L98:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r2)
        L9d:
            throw r8
    }

    static {
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r0 = new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r3 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BOOLEAN
            java.lang.String r5 = "Z"
            java.lang.String r6 = "java.lang.Boolean"
            java.lang.String r1 = "BOOLEAN"
            r2 = 0
            java.lang.String r4 = "boolean"
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN = r0
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r1 = new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r4 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.CHAR
            java.lang.String r6 = "C"
            java.lang.String r7 = "java.lang.Character"
            java.lang.String r2 = "CHAR"
            r3 = 1
            java.lang.String r5 = "char"
            r1.<init>(r2, r3, r4, r5, r6, r7)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.CHAR = r1
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r2 = new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r5 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BYTE
            java.lang.String r7 = "B"
            java.lang.String r8 = "java.lang.Byte"
            java.lang.String r3 = "BYTE"
            r4 = 2
            java.lang.String r6 = "byte"
            r2.<init>(r3, r4, r5, r6, r7, r8)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BYTE = r2
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r3 = new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r6 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.SHORT
            java.lang.String r8 = "S"
            java.lang.String r9 = "java.lang.Short"
            java.lang.String r4 = "SHORT"
            r5 = 3
            java.lang.String r7 = "short"
            r3.<init>(r4, r5, r6, r7, r8, r9)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.SHORT = r3
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r4 = new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r7 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.INT
            java.lang.String r9 = "I"
            java.lang.String r10 = "java.lang.Integer"
            java.lang.String r5 = "INT"
            r6 = 4
            java.lang.String r8 = "int"
            r4.<init>(r5, r6, r7, r8, r9, r10)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT = r4
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r5 = new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r8 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.FLOAT
            java.lang.String r10 = "F"
            java.lang.String r11 = "java.lang.Float"
            java.lang.String r6 = "FLOAT"
            r7 = 5
            java.lang.String r9 = "float"
            r5.<init>(r6, r7, r8, r9, r10, r11)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.FLOAT = r5
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r6 = new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r9 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.LONG
            java.lang.String r11 = "J"
            java.lang.String r12 = "java.lang.Long"
            java.lang.String r7 = "LONG"
            r8 = 6
            java.lang.String r10 = "long"
            r6.<init>(r7, r8, r9, r10, r11, r12)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.LONG = r6
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r7 = new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r10 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.DOUBLE
            java.lang.String r12 = "D"
            java.lang.String r13 = "java.lang.Double"
            java.lang.String r8 = "DOUBLE"
            r9 = 7
            java.lang.String r11 = "double"
            r7.<init>(r8, r9, r10, r11, r12, r13)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.DOUBLE = r7
            r8 = 8
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType[] r8 = new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType[r8]
            r9 = 0
            r8[r9] = r0
            r0 = 1
            r8[r0] = r1
            r0 = 2
            r8[r0] = r2
            r0 = 3
            r8[r0] = r3
            r0 = 4
            r8[r0] = r4
            r0 = 5
            r8[r0] = r5
            r0 = 6
            r8[r0] = r6
            r0 = 7
            r8[r0] = r7
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.$VALUES = r8
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.TYPE_BY_NAME = r0
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType> r1 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.class
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.TYPE_BY_PRIMITIVE_TYPE = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.TYPE_BY_DESC = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.WRAPPER_CLASS_INTERNAL_NAMES = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.OWNER_TO_BOXING_METHOD_DESCRIPTOR = r0
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType[] r0 = values()
            int r1 = r0.length
        Ld8:
            if (r9 >= r1) goto L132
            r2 = r0[r9]
            java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType> r3 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.TYPE_BY_NAME
            java.lang.String r4 = r2.getJavaKeywordName()
            r3.put(r4, r2)
            java.util.Map<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType> r3 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.TYPE_BY_PRIMITIVE_TYPE
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r4 = r2.getPrimitiveType()
            r3.put(r4, r2)
            java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType> r3 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.TYPE_BY_DESC
            java.lang.String r4 = r2.getDesc()
            r3.put(r4, r2)
            kotlin.reflect.jvm.internal.impl.name.c r3 = r2.wrapperFqName
            java.lang.String r3 = r3.a()
            r4 = 46
            r5 = 47
            java.lang.String r3 = r3.replace(r4, r5)
            java.util.Set<java.lang.String> r4 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.WRAPPER_CLASS_INTERNAL_NAMES
            r4.add(r3)
            java.util.Map<java.lang.String, java.lang.String> r4 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.OWNER_TO_BOXING_METHOD_DESCRIPTOR
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "("
            r5.append(r6)
            java.lang.String r2 = r2.desc
            r5.append(r2)
            java.lang.String r2 = ")L"
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = ";"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.put(r3, r2)
            int r9 = r9 + 1
            goto Ld8
        L132:
            return
    }

    JvmPrimitiveType(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull int r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r4, @org.jetbrains.annotations.NotNull java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r1 = this;
            if (r4 != 0) goto L7
            r0 = 8
            $$$reportNull$$$0(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 9
            $$$reportNull$$$0(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 10
            $$$reportNull$$$0(r0)
        L15:
            if (r7 != 0) goto L1c
            r0 = 11
            $$$reportNull$$$0(r0)
        L1c:
            r1.<init>(r2, r3)
            r1.primitiveType = r4
            r1.name = r5
            r1.desc = r6
            kotlin.reflect.jvm.internal.impl.name.c r2 = new kotlin.reflect.jvm.internal.impl.name.c
            r2.<init>(r7)
            r1.wrapperFqName = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType get(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            if (r3 != 0) goto L6
            r0 = 3
            $$$reportNull$$$0(r0)
        L6:
            java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType> r0 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.TYPE_BY_NAME
            java.lang.Object r0 = r0.get(r3)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r0 = (kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType) r0
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Non-primitive type name passed: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType get(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1) {
            if (r1 != 0) goto L6
            r0 = 5
            $$$reportNull$$$0(r0)
        L6:
            java.util.Map<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType> r0 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.TYPE_BY_PRIMITIVE_TYPE
            java.lang.Object r1 = r0.get(r1)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r1 = (kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType) r1
            if (r1 != 0) goto L14
            r0 = 6
            $$$reportNull$$$0(r0)
        L14:
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType> r0 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r1 = (kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType[] values() {
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType[] r0 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType[] r0 = (kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String getDesc() {
            r2 = this;
            java.lang.String r0 = r2.desc
            if (r0 != 0) goto L9
            r1 = 14
            $$$reportNull$$$0(r1)
        L9:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String getJavaKeywordName() {
            r2 = this;
            java.lang.String r0 = r2.name
            if (r0 != 0) goto L9
            r1 = 13
            $$$reportNull$$$0(r1)
        L9:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType getPrimitiveType() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = r2.primitiveType
            if (r0 != 0) goto L9
            r1 = 12
            $$$reportNull$$$0(r1)
        L9:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.name.c getWrapperFqName() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r2.wrapperFqName
            if (r0 != 0) goto L9
            r1 = 15
            $$$reportNull$$$0(r1)
        L9:
            return r0
    }
}
