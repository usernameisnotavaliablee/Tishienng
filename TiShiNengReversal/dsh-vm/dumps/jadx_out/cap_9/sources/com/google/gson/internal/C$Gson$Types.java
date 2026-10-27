package com.google.gson.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* renamed from: com.google.gson.internal.$Gson$Types, reason: invalid class name */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class C$Gson$Types {
    static final java.lang.reflect.Type[] EMPTY_TYPE_ARRAY = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl */
    private static final class GenericArrayTypeImpl implements java.lang.reflect.GenericArrayType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.reflect.Type componentType;

        public GenericArrayTypeImpl(java.lang.reflect.Type r1) {
                r0 = this;
                r0.<init>()
                java.lang.reflect.Type r1 = com.google.gson.internal.C$Gson$Types.canonicalize(r1)
                r0.componentType = r1
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.GenericArrayType
                if (r0 == 0) goto Le
                java.lang.reflect.GenericArrayType r2 = (java.lang.reflect.GenericArrayType) r2
                boolean r2 = com.google.gson.internal.C$Gson$Types.equals(r1, r2)
                if (r2 == 0) goto Le
                r2 = 1
                return r2
            Le:
                r2 = 0
                return r2
        }

        @Override // java.lang.reflect.GenericArrayType
        public java.lang.reflect.Type getGenericComponentType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.componentType
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.componentType
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.reflect.Type r1 = r2.componentType
                java.lang.String r1 = com.google.gson.internal.C$Gson$Types.typeToString(r1)
                r0.append(r1)
                java.lang.String r1 = "[]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl */
    private static final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.reflect.Type ownerType;
        private final java.lang.reflect.Type rawType;
        private final java.lang.reflect.Type[] typeArguments;

        public ParameterizedTypeImpl(java.lang.reflect.Type r5, java.lang.reflect.Type r6, java.lang.reflect.Type... r7) {
                r4 = this;
                r4.<init>()
                boolean r0 = r6 instanceof java.lang.Class
                r1 = 0
                if (r0 == 0) goto L29
                r0 = r6
                java.lang.Class r0 = (java.lang.Class) r0
                int r2 = r0.getModifiers()
                boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
                r3 = 1
                if (r2 != 0) goto L1f
                java.lang.Class r0 = r0.getEnclosingClass()
                if (r0 != 0) goto L1d
                goto L1f
            L1d:
                r0 = 0
                goto L20
            L1f:
                r0 = 1
            L20:
                if (r5 != 0) goto L26
                if (r0 == 0) goto L25
                goto L26
            L25:
                r3 = 0
            L26:
                com.google.gson.internal.C$Gson$Preconditions.checkArgument(r3)
            L29:
                if (r5 != 0) goto L2d
                r5 = 0
                goto L31
            L2d:
                java.lang.reflect.Type r5 = com.google.gson.internal.C$Gson$Types.canonicalize(r5)
            L31:
                r4.ownerType = r5
                java.lang.reflect.Type r5 = com.google.gson.internal.C$Gson$Types.canonicalize(r6)
                r4.rawType = r5
                java.lang.Object r5 = r7.clone()
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r4.typeArguments = r5
                int r5 = r5.length
            L42:
                if (r1 >= r5) goto L5f
                java.lang.reflect.Type[] r6 = r4.typeArguments
                r6 = r6[r1]
                com.google.gson.internal.C$Gson$Preconditions.checkNotNull(r6)
                java.lang.reflect.Type[] r6 = r4.typeArguments
                r6 = r6[r1]
                com.google.gson.internal.C$Gson$Types.checkNotPrimitive(r6)
                java.lang.reflect.Type[] r6 = r4.typeArguments
                r7 = r6[r1]
                java.lang.reflect.Type r7 = com.google.gson.internal.C$Gson$Types.canonicalize(r7)
                r6[r1] = r7
                int r1 = r1 + 1
                goto L42
            L5f:
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto Le
                java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
                boolean r2 = com.google.gson.internal.C$Gson$Types.equals(r1, r2)
                if (r2 == 0) goto Le
                r2 = 1
                return r2
            Le:
                r2 = 0
                return r2
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type[] getActualTypeArguments() {
                r1 = this;
                java.lang.reflect.Type[] r0 = r1.typeArguments
                java.lang.Object r0 = r0.clone()
                java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                return r0
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type getOwnerType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.ownerType
                return r0
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type getRawType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.rawType
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.reflect.Type[] r0 = r2.typeArguments
                int r0 = java.util.Arrays.hashCode(r0)
                java.lang.reflect.Type r1 = r2.rawType
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                java.lang.reflect.Type r1 = r2.ownerType
                int r1 = com.google.gson.internal.C$Gson$Types.hashCodeOrZero(r1)
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.reflect.Type[] r0 = r4.typeArguments
                int r0 = r0.length
                if (r0 != 0) goto Lc
                java.lang.reflect.Type r0 = r4.rawType
                java.lang.String r0 = com.google.gson.internal.C$Gson$Types.typeToString(r0)
                return r0
            Lc:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                int r2 = r0 + 1
                int r2 = r2 * 30
                r1.<init>(r2)
                java.lang.reflect.Type r2 = r4.rawType
                java.lang.String r2 = com.google.gson.internal.C$Gson$Types.typeToString(r2)
                r1.append(r2)
                java.lang.String r2 = "<"
                r1.append(r2)
                java.lang.reflect.Type[] r2 = r4.typeArguments
                r3 = 0
                r2 = r2[r3]
                java.lang.String r2 = com.google.gson.internal.C$Gson$Types.typeToString(r2)
                r1.append(r2)
                r2 = 1
            L30:
                if (r2 >= r0) goto L45
                java.lang.String r3 = ", "
                r1.append(r3)
                java.lang.reflect.Type[] r3 = r4.typeArguments
                r3 = r3[r2]
                java.lang.String r3 = com.google.gson.internal.C$Gson$Types.typeToString(r3)
                r1.append(r3)
                int r2 = r2 + 1
                goto L30
            L45:
                java.lang.String r0 = ">"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.gson.internal.$Gson$Types$WildcardTypeImpl */
    private static final class WildcardTypeImpl implements java.lang.reflect.WildcardType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.reflect.Type lowerBound;
        private final java.lang.reflect.Type upperBound;

        public WildcardTypeImpl(java.lang.reflect.Type[] r4, java.lang.reflect.Type[] r5) {
                r3 = this;
                r3.<init>()
                int r0 = r5.length
                r1 = 0
                r2 = 1
                if (r0 > r2) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                com.google.gson.internal.C$Gson$Preconditions.checkArgument(r0)
                int r0 = r4.length
                if (r0 != r2) goto L13
                r0 = 1
                goto L14
            L13:
                r0 = 0
            L14:
                com.google.gson.internal.C$Gson$Preconditions.checkArgument(r0)
                int r0 = r5.length
                if (r0 != r2) goto L3a
                r0 = r5[r1]
                com.google.gson.internal.C$Gson$Preconditions.checkNotNull(r0)
                r0 = r5[r1]
                com.google.gson.internal.C$Gson$Types.checkNotPrimitive(r0)
                r4 = r4[r1]
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                if (r4 != r0) goto L2b
                goto L2c
            L2b:
                r2 = 0
            L2c:
                com.google.gson.internal.C$Gson$Preconditions.checkArgument(r2)
                r4 = r5[r1]
                java.lang.reflect.Type r4 = com.google.gson.internal.C$Gson$Types.canonicalize(r4)
                r3.lowerBound = r4
                r3.upperBound = r0
                return
            L3a:
                r5 = r4[r1]
                com.google.gson.internal.C$Gson$Preconditions.checkNotNull(r5)
                r5 = r4[r1]
                com.google.gson.internal.C$Gson$Types.checkNotPrimitive(r5)
                r5 = 0
                r3.lowerBound = r5
                r4 = r4[r1]
                java.lang.reflect.Type r4 = com.google.gson.internal.C$Gson$Types.canonicalize(r4)
                r3.upperBound = r4
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.WildcardType
                if (r0 == 0) goto Le
                java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
                boolean r2 = com.google.gson.internal.C$Gson$Types.equals(r1, r2)
                if (r2 == 0) goto Le
                r2 = 1
                return r2
            Le:
                r2 = 0
                return r2
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getLowerBounds() {
                r3 = this;
                java.lang.reflect.Type r0 = r3.lowerBound
                if (r0 == 0) goto Lb
                r1 = 1
                java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
                r2 = 0
                r1[r2] = r0
                return r1
            Lb:
                java.lang.reflect.Type[] r0 = com.google.gson.internal.C$Gson$Types.EMPTY_TYPE_ARRAY
                return r0
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getUpperBounds() {
                r3 = this;
                java.lang.reflect.Type r0 = r3.upperBound
                r1 = 1
                java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
                r2 = 0
                r1[r2] = r0
                return r1
        }

        public int hashCode() {
                r2 = this;
                java.lang.reflect.Type r0 = r2.lowerBound
                if (r0 == 0) goto Lb
                int r0 = r0.hashCode()
                int r0 = r0 + 31
                goto Lc
            Lb:
                r0 = 1
            Lc:
                java.lang.reflect.Type r1 = r2.upperBound
                int r1 = r1.hashCode()
                int r1 = r1 + 31
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.reflect.Type r0 = r2.lowerBound
                if (r0 == 0) goto L1c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "? super "
                r0.append(r1)
                java.lang.reflect.Type r1 = r2.lowerBound
                java.lang.String r1 = com.google.gson.internal.C$Gson$Types.typeToString(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            L1c:
                java.lang.reflect.Type r0 = r2.upperBound
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                if (r0 != r1) goto L25
                java.lang.String r0 = "?"
                return r0
            L25:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "? extends "
                r0.append(r1)
                java.lang.reflect.Type r1 = r2.upperBound
                java.lang.String r1 = com.google.gson.internal.C$Gson$Types.typeToString(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            com.google.gson.internal.C$Gson$Types.EMPTY_TYPE_ARRAY = r0
            return
    }

    private C$Gson$Types() {
            r1 = this;
            r1.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public static java.lang.reflect.GenericArrayType arrayOf(java.lang.reflect.Type r1) {
            com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl r0 = new com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl
            r0.<init>(r1)
            return r0
    }

    public static java.lang.reflect.Type canonicalize(java.lang.reflect.Type r3) {
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L1d
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L1a
            com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl r0 = new com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl
            java.lang.Class r3 = r3.getComponentType()
            java.lang.reflect.Type r3 = canonicalize(r3)
            r0.<init>(r3)
            r3 = r0
        L1a:
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            return r3
        L1d:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L35
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl r0 = new com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl
            java.lang.reflect.Type r1 = r3.getOwnerType()
            java.lang.reflect.Type r2 = r3.getRawType()
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r0.<init>(r1, r2, r3)
            return r0
        L35:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L45
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl r0 = new com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            r0.<init>(r3)
            return r0
        L45:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L59
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            com.google.gson.internal.$Gson$Types$WildcardTypeImpl r0 = new com.google.gson.internal.$Gson$Types$WildcardTypeImpl
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            r0.<init>(r1, r3)
            return r0
        L59:
            return r3
    }

    static void checkNotPrimitive(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Lf
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isPrimitive()
            if (r1 != 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            com.google.gson.internal.C$Gson$Preconditions.checkArgument(r1)
            return
    }

    private static java.lang.Class<?> declaringClassOf(java.lang.reflect.TypeVariable<?> r1) {
            java.lang.reflect.GenericDeclaration r1 = r1.getGenericDeclaration()
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    static boolean equal(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public static boolean equals(java.lang.reflect.Type r4, java.lang.reflect.Type r5) {
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof java.lang.Class
            if (r1 == 0) goto Ld
            boolean r4 = r4.equals(r5)
            return r4
        Ld:
            boolean r1 = r4 instanceof java.lang.reflect.ParameterizedType
            r2 = 0
            if (r1 == 0) goto L47
            boolean r1 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type r1 = r4.getOwnerType()
            java.lang.reflect.Type r3 = r5.getOwnerType()
            boolean r1 = equal(r1, r3)
            if (r1 == 0) goto L46
            java.lang.reflect.Type r1 = r4.getRawType()
            java.lang.reflect.Type r3 = r5.getRawType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L46
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L46
            return r0
        L46:
            return r2
        L47:
            boolean r1 = r4 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L61
            boolean r0 = r5 instanceof java.lang.reflect.GenericArrayType
            if (r0 != 0) goto L50
            return r2
        L50:
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            java.lang.reflect.GenericArrayType r5 = (java.lang.reflect.GenericArrayType) r5
            java.lang.reflect.Type r4 = r4.getGenericComponentType()
            java.lang.reflect.Type r5 = r5.getGenericComponentType()
            boolean r4 = equals(r4, r5)
            return r4
        L61:
            boolean r1 = r4 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L8c
            boolean r1 = r5 instanceof java.lang.reflect.WildcardType
            if (r1 != 0) goto L6a
            return r2
        L6a:
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r1 = r4.getUpperBounds()
            java.lang.reflect.Type[] r3 = r5.getUpperBounds()
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L8b
            java.lang.reflect.Type[] r4 = r4.getLowerBounds()
            java.lang.reflect.Type[] r5 = r5.getLowerBounds()
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L8b
            return r0
        L8b:
            return r2
        L8c:
            boolean r1 = r4 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto Lb2
            boolean r1 = r5 instanceof java.lang.reflect.TypeVariable
            if (r1 != 0) goto L95
            return r2
        L95:
            java.lang.reflect.TypeVariable r4 = (java.lang.reflect.TypeVariable) r4
            java.lang.reflect.TypeVariable r5 = (java.lang.reflect.TypeVariable) r5
            java.lang.reflect.GenericDeclaration r1 = r4.getGenericDeclaration()
            java.lang.reflect.GenericDeclaration r3 = r5.getGenericDeclaration()
            if (r1 != r3) goto Lb2
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r5.getName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lb2
            return r0
        Lb2:
            return r2
    }

    public static java.lang.reflect.Type getArrayComponentType(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto Lb
            java.lang.reflect.GenericArrayType r1 = (java.lang.reflect.GenericArrayType) r1
            java.lang.reflect.Type r1 = r1.getGenericComponentType()
            return r1
        Lb:
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Class r1 = r1.getComponentType()
            return r1
    }

    public static java.lang.reflect.Type getCollectionElementType(java.lang.reflect.Type r1, java.lang.Class<?> r2) {
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            java.lang.reflect.Type r1 = getSupertype(r1, r2, r0)
            boolean r2 = r1 instanceof java.lang.reflect.WildcardType
            r0 = 0
            if (r2 == 0) goto L13
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            java.lang.reflect.Type[] r1 = r1.getUpperBounds()
            r1 = r1[r0]
        L13:
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L20
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            r1 = r1[r0]
            return r1
        L20:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            return r1
    }

    static java.lang.reflect.Type getGenericSupertype(java.lang.reflect.Type r3, java.lang.Class<?> r4, java.lang.Class<?> r5) {
            if (r5 != r4) goto L3
            return r3
        L3:
            boolean r3 = r5.isInterface()
            if (r3 == 0) goto L32
            java.lang.Class[] r3 = r4.getInterfaces()
            int r0 = r3.length
            r1 = 0
        Lf:
            if (r1 >= r0) goto L32
            r2 = r3[r1]
            if (r2 != r5) goto L1c
            java.lang.reflect.Type[] r3 = r4.getGenericInterfaces()
            r3 = r3[r1]
            return r3
        L1c:
            boolean r2 = r5.isAssignableFrom(r2)
            if (r2 == 0) goto L2f
            java.lang.reflect.Type[] r4 = r4.getGenericInterfaces()
            r4 = r4[r1]
            r3 = r3[r1]
            java.lang.reflect.Type r3 = getGenericSupertype(r4, r3, r5)
            return r3
        L2f:
            int r1 = r1 + 1
            goto Lf
        L32:
            boolean r3 = r4.isInterface()
            if (r3 != 0) goto L58
        L38:
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r4 == r3) goto L58
            java.lang.Class r3 = r4.getSuperclass()
            if (r3 != r5) goto L47
            java.lang.reflect.Type r3 = r4.getGenericSuperclass()
            return r3
        L47:
            boolean r0 = r5.isAssignableFrom(r3)
            if (r0 == 0) goto L56
            java.lang.reflect.Type r4 = r4.getGenericSuperclass()
            java.lang.reflect.Type r3 = getGenericSupertype(r4, r3, r5)
            return r3
        L56:
            r4 = r3
            goto L38
        L58:
            return r5
    }

    public static java.lang.reflect.Type[] getMapKeyAndValueTypes(java.lang.reflect.Type r4, java.lang.Class<?> r5) {
            java.lang.Class<java.util.Properties> r0 = java.util.Properties.class
            r1 = 1
            r2 = 0
            r3 = 2
            if (r4 != r0) goto L10
            java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r3]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r2] = r5
            r4[r1] = r5
            return r4
        L10:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            java.lang.reflect.Type r4 = getSupertype(r4, r5, r0)
            boolean r5 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L21
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            return r4
        L21:
            java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r3]
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r4[r2] = r5
            r4[r1] = r5
            return r4
    }

    public static java.lang.Class<?> getRawType(java.lang.reflect.Type r4) {
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L7
            java.lang.Class r4 = (java.lang.Class) r4
            return r4
        L7:
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L19
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type r4 = r4.getRawType()
            boolean r0 = r4 instanceof java.lang.Class
            com.google.gson.internal.C$Gson$Preconditions.checkArgument(r0)
            java.lang.Class r4 = (java.lang.Class) r4
            return r4
        L19:
            boolean r0 = r4 instanceof java.lang.reflect.GenericArrayType
            r1 = 0
            if (r0 == 0) goto L31
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            java.lang.reflect.Type r4 = r4.getGenericComponentType()
            java.lang.Class r4 = getRawType(r4)
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r1)
            java.lang.Class r4 = r4.getClass()
            return r4
        L31:
            boolean r0 = r4 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L38
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            return r4
        L38:
            boolean r0 = r4 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L49
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.Type[] r4 = r4.getUpperBounds()
            r4 = r4[r1]
            java.lang.Class r4 = getRawType(r4)
            return r4
        L49:
            if (r4 != 0) goto L4e
            java.lang.String r0 = "null"
            goto L56
        L4e:
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
        L56:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected a Class, ParameterizedType, or GenericArrayType, but <"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = "> is of type "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
    }

    static java.lang.reflect.Type getSupertype(java.lang.reflect.Type r1, java.lang.Class<?> r2, java.lang.Class<?> r3) {
            boolean r0 = r1 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Ld
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            java.lang.reflect.Type[] r1 = r1.getUpperBounds()
            r0 = 0
            r1 = r1[r0]
        Ld:
            boolean r0 = r3.isAssignableFrom(r2)
            com.google.gson.internal.C$Gson$Preconditions.checkArgument(r0)
            java.lang.reflect.Type r3 = getGenericSupertype(r1, r2, r3)
            java.lang.reflect.Type r1 = resolve(r1, r2, r3)
            return r1
    }

    static int hashCodeOrZero(java.lang.Object r0) {
            if (r0 == 0) goto L7
            int r0 = r0.hashCode()
            return r0
        L7:
            r0 = 0
            return r0
    }

    private static int indexOf(java.lang.Object[] r3, java.lang.Object r4) {
            int r0 = r3.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r3[r1]
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Ld
            return r1
        Ld:
            int r1 = r1 + 1
            goto L2
        L10:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    public static java.lang.reflect.ParameterizedType newParameterizedTypeWithOwner(java.lang.reflect.Type r1, java.lang.reflect.Type r2, java.lang.reflect.Type... r3) {
            com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl r0 = new com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static java.lang.reflect.Type resolve(java.lang.reflect.Type r1, java.lang.Class<?> r2, java.lang.reflect.Type r3) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.reflect.Type r1 = resolve(r1, r2, r3, r0)
            return r1
    }

    private static java.lang.reflect.Type resolve(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
        L0:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L18
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto Le
            return r10
        Le:
            r11.add(r0)
            java.lang.reflect.Type r10 = resolveTypeVariable(r8, r9, r0)
            if (r10 != r0) goto L0
            return r10
        L18:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L35
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L35
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = resolve(r8, r9, r10, r11)
            if (r10 != r8) goto L30
            return r0
        L30:
            java.lang.reflect.GenericArrayType r8 = arrayOf(r8)
            return r8
        L35:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L4b
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = resolve(r8, r9, r0, r11)
            if (r0 != r8) goto L46
            return r10
        L46:
            java.lang.reflect.GenericArrayType r8 = arrayOf(r8)
            return r8
        L4b:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8c
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = resolve(r8, r9, r0, r11)
            if (r3 == r0) goto L5f
            r0 = 1
            goto L60
        L5f:
            r0 = 0
        L60:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L65:
            if (r2 >= r5) goto L80
            r6 = r4[r2]
            java.lang.reflect.Type r6 = resolve(r8, r9, r6, r11)
            r7 = r4[r2]
            if (r6 == r7) goto L7d
            if (r0 != 0) goto L7b
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L7b:
            r4[r2] = r6
        L7d:
            int r2 = r2 + 1
            goto L65
        L80:
            if (r0 == 0) goto L8b
            java.lang.reflect.Type r8 = r10.getRawType()
            java.lang.reflect.ParameterizedType r8 = newParameterizedTypeWithOwner(r3, r8, r4)
            return r8
        L8b:
            return r10
        L8c:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Lc0
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto Lac
            r1 = r0[r2]
            java.lang.reflect.Type r8 = resolve(r8, r9, r1, r11)
            r9 = r0[r2]
            if (r8 == r9) goto Lc0
            java.lang.reflect.WildcardType r8 = supertypeOf(r8)
            return r8
        Lac:
            int r0 = r3.length
            if (r0 != r1) goto Lc0
            r0 = r3[r2]
            java.lang.reflect.Type r8 = resolve(r8, r9, r0, r11)     // Catch: java.lang.Throwable -> Lbe
            r9 = r3[r2]
            if (r8 == r9) goto Lc0
            java.lang.reflect.WildcardType r8 = subtypeOf(r8)
            return r8
        Lbe:
            r8 = move-exception
            throw r8
        Lc0:
            return r10
    }

    static java.lang.reflect.Type resolveTypeVariable(java.lang.reflect.Type r1, java.lang.Class<?> r2, java.lang.reflect.TypeVariable<?> r3) {
            java.lang.Class r0 = declaringClassOf(r3)
            if (r0 != 0) goto L7
            goto L20
        L7:
            java.lang.reflect.Type r1 = getGenericSupertype(r1, r2, r0)
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L20
            java.lang.reflect.TypeVariable[] r2 = r0.getTypeParameters()
            int r2 = indexOf(r2, r3)
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            r1 = r1[r2]
            return r1
        L20:
            return r3
    }

    public static java.lang.reflect.WildcardType subtypeOf(java.lang.reflect.Type r2) {
            boolean r0 = r2 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Lb
            java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
            java.lang.reflect.Type[] r2 = r2.getUpperBounds()
            goto L12
        Lb:
            r0 = 1
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            r1 = 0
            r0[r1] = r2
            r2 = r0
        L12:
            com.google.gson.internal.$Gson$Types$WildcardTypeImpl r0 = new com.google.gson.internal.$Gson$Types$WildcardTypeImpl
            java.lang.reflect.Type[] r1 = com.google.gson.internal.C$Gson$Types.EMPTY_TYPE_ARRAY
            r0.<init>(r2, r1)
            return r0
    }

    public static java.lang.reflect.WildcardType supertypeOf(java.lang.reflect.Type r4) {
            boolean r0 = r4 instanceof java.lang.reflect.WildcardType
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Ld
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.Type[] r4 = r4.getLowerBounds()
            goto L12
        Ld:
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
            r0[r1] = r4
            r4 = r0
        L12:
            com.google.gson.internal.$Gson$Types$WildcardTypeImpl r0 = new com.google.gson.internal.$Gson$Types$WildcardTypeImpl
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r2[r1] = r3
            r0.<init>(r2, r4)
            return r0
    }

    public static java.lang.String typeToString(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            return r1
        Lb:
            java.lang.String r1 = r1.toString()
            return r1
    }
}
