package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class NavType<T> {

    @androidx.annotation.NonNull
    public static final androidx.navigation.NavType<boolean[]> BoolArrayType = null;

    @androidx.annotation.NonNull
    public static final androidx.navigation.NavType<java.lang.Boolean> BoolType = null;

    @androidx.annotation.NonNull
    public static final androidx.navigation.NavType<float[]> FloatArrayType = null;

    @androidx.annotation.NonNull
    public static final androidx.navigation.NavType<java.lang.Float> FloatType = null;

    @androidx.annotation.NonNull
    public static final androidx.navigation.NavType<int[]> IntArrayType = null;

    @androidx.annotation.NonNull
    public static final androidx.navigation.NavType<java.lang.Integer> IntType = null;

    @androidx.annotation.NonNull
    public static final androidx.navigation.NavType<long[]> LongArrayType = null;

    @androidx.annotation.NonNull
    public static final androidx.navigation.NavType<java.lang.Long> LongType = null;

    @androidx.annotation.NonNull
    public static final androidx.navigation.NavType<java.lang.Integer> ReferenceType = null;

    @androidx.annotation.NonNull
    public static final androidx.navigation.NavType<java.lang.String[]> StringArrayType = null;

    @androidx.annotation.NonNull
    public static final androidx.navigation.NavType<java.lang.String> StringType = null;
    private final boolean mNullableAllowed;












    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class EnumType<D extends java.lang.Enum> extends androidx.navigation.NavType.SerializableType<D> {

        @androidx.annotation.NonNull
        private final java.lang.Class<D> mType;

        public EnumType(@androidx.annotation.NonNull java.lang.Class<D> r3) {
                r2 = this;
                r0 = 0
                r2.<init>(r0, r3)
                boolean r0 = r3.isEnum()
                if (r0 == 0) goto Ld
                r2.mType = r3
                return
            Ld:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " is not an Enum type."
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        @androidx.annotation.NonNull
        public java.lang.String getName() {
                r1 = this;
                java.lang.Class<D extends java.lang.Enum> r0 = r1.mType
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ java.io.Serializable parseValue(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                java.lang.Enum r1 = r0.parseValue(r1)
                return r1
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        @androidx.annotation.NonNull
        public D parseValue(@androidx.annotation.NonNull java.lang.String r6) {
                r5 = this;
                java.lang.Class<D extends java.lang.Enum> r0 = r5.mType
                java.lang.Object[] r0 = r0.getEnumConstants()
                java.lang.Enum[] r0 = (java.lang.Enum[]) r0
                int r1 = r0.length
                r2 = 0
            La:
                if (r2 >= r1) goto L1c
                r3 = r0[r2]
                java.lang.String r4 = r3.name()
                boolean r4 = r4.equals(r6)
                if (r4 == 0) goto L19
                return r3
            L19:
                int r2 = r2 + 1
                goto La
            L1c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Enum value "
                r1.append(r2)
                r1.append(r6)
                java.lang.String r6 = " not found for type "
                r1.append(r6)
                java.lang.Class<D extends java.lang.Enum> r6 = r5.mType
                java.lang.String r6 = r6.getName()
                r1.append(r6)
                java.lang.String r6 = "."
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r0.<init>(r6)
                throw r0
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ java.lang.Object parseValue(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                java.lang.Enum r1 = r0.parseValue(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class ParcelableArrayType<D extends android.os.Parcelable> extends androidx.navigation.NavType<D[]> {

        @androidx.annotation.NonNull
        private final java.lang.Class<D[]> mArrayType;

        public ParcelableArrayType(@androidx.annotation.NonNull java.lang.Class<D> r3) {
                r2 = this;
                r0 = 1
                r2.<init>(r0)
                java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
                boolean r0 = r0.isAssignableFrom(r3)
                if (r0 == 0) goto L34
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L2d
                r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L2d
                java.lang.String r1 = "[L"
                r0.append(r1)     // Catch: java.lang.ClassNotFoundException -> L2d
                java.lang.String r3 = r3.getName()     // Catch: java.lang.ClassNotFoundException -> L2d
                r0.append(r3)     // Catch: java.lang.ClassNotFoundException -> L2d
                java.lang.String r3 = ";"
                r0.append(r3)     // Catch: java.lang.ClassNotFoundException -> L2d
                java.lang.String r3 = r0.toString()     // Catch: java.lang.ClassNotFoundException -> L2d
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L2d
                r2.mArrayType = r3
                return
            L2d:
                r3 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r3)
                throw r0
            L34:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " does not implement Parcelable."
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L4
                r3 = 1
                return r3
            L4:
                if (r3 == 0) goto L1a
                java.lang.Class<androidx.navigation.NavType$ParcelableArrayType> r0 = androidx.navigation.NavType.ParcelableArrayType.class
                java.lang.Class r1 = r3.getClass()
                if (r0 == r1) goto Lf
                goto L1a
            Lf:
                androidx.navigation.NavType$ParcelableArrayType r3 = (androidx.navigation.NavType.ParcelableArrayType) r3
                java.lang.Class<D extends android.os.Parcelable[]> r0 = r2.mArrayType
                java.lang.Class<D extends android.os.Parcelable[]> r3 = r3.mArrayType
                boolean r3 = r0.equals(r3)
                return r3
            L1a:
                r3 = 0
                return r3
        }

        @Override // androidx.navigation.NavType
        @androidx.annotation.Nullable
        public /* bridge */ /* synthetic */ java.lang.Object get(@androidx.annotation.NonNull android.os.Bundle r1, @androidx.annotation.NonNull java.lang.String r2) {
                r0 = this;
                android.os.Parcelable[] r1 = r0.get(r1, r2)
                return r1
        }

        @Override // androidx.navigation.NavType
        @androidx.annotation.Nullable
        public D[] get(@androidx.annotation.NonNull android.os.Bundle r1, @androidx.annotation.NonNull java.lang.String r2) {
                r0 = this;
                java.lang.Object r1 = r1.get(r2)
                android.os.Parcelable[] r1 = (android.os.Parcelable[]) r1
                return r1
        }

        @Override // androidx.navigation.NavType
        @androidx.annotation.NonNull
        public java.lang.String getName() {
                r1 = this;
                java.lang.Class<D extends android.os.Parcelable[]> r0 = r1.mArrayType
                java.lang.String r0 = r0.getName()
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.Class<D extends android.os.Parcelable[]> r0 = r1.mArrayType
                int r0 = r0.hashCode()
                return r0
        }

        @Override // androidx.navigation.NavType
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ java.lang.Object parseValue(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                android.os.Parcelable[] r1 = r0.parseValue(r1)
                return r1
        }

        @Override // androidx.navigation.NavType
        @androidx.annotation.NonNull
        public D[] parseValue(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Arrays don't support default values."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(@androidx.annotation.NonNull android.os.Bundle r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable java.lang.Object r3) {
                r0 = this;
                android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
                r0.put(r1, r2, r3)
                return
        }

        public void put(@androidx.annotation.NonNull android.os.Bundle r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable D[] r4) {
                r1 = this;
                java.lang.Class<D extends android.os.Parcelable[]> r0 = r1.mArrayType
                r0.cast(r4)
                r2.putParcelableArray(r3, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class ParcelableType<D> extends androidx.navigation.NavType<D> {

        @androidx.annotation.NonNull
        private final java.lang.Class<D> mType;

        public ParcelableType(@androidx.annotation.NonNull java.lang.Class<D> r3) {
                r2 = this;
                r0 = 1
                r2.<init>(r0)
                java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
                boolean r0 = r0.isAssignableFrom(r3)
                if (r0 != 0) goto L2c
                java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
                boolean r0 = r0.isAssignableFrom(r3)
                if (r0 == 0) goto L15
                goto L2c
            L15:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " does not implement Parcelable or Serializable."
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            L2c:
                r2.mType = r3
                return
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L4
                r3 = 1
                return r3
            L4:
                if (r3 == 0) goto L1a
                java.lang.Class<androidx.navigation.NavType$ParcelableType> r0 = androidx.navigation.NavType.ParcelableType.class
                java.lang.Class r1 = r3.getClass()
                if (r0 == r1) goto Lf
                goto L1a
            Lf:
                androidx.navigation.NavType$ParcelableType r3 = (androidx.navigation.NavType.ParcelableType) r3
                java.lang.Class<D> r0 = r2.mType
                java.lang.Class<D> r3 = r3.mType
                boolean r3 = r0.equals(r3)
                return r3
            L1a:
                r3 = 0
                return r3
        }

        @Override // androidx.navigation.NavType
        @androidx.annotation.Nullable
        public D get(@androidx.annotation.NonNull android.os.Bundle r1, @androidx.annotation.NonNull java.lang.String r2) {
                r0 = this;
                java.lang.Object r1 = r1.get(r2)
                return r1
        }

        @Override // androidx.navigation.NavType
        @androidx.annotation.NonNull
        public java.lang.String getName() {
                r1 = this;
                java.lang.Class<D> r0 = r1.mType
                java.lang.String r0 = r0.getName()
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.Class<D> r0 = r1.mType
                int r0 = r0.hashCode()
                return r0
        }

        @Override // androidx.navigation.NavType
        @androidx.annotation.NonNull
        public D parseValue(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Parcelables don't support default values."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.navigation.NavType
        public void put(@androidx.annotation.NonNull android.os.Bundle r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable D r4) {
                r1 = this;
                java.lang.Class<D> r0 = r1.mType
                r0.cast(r4)
                if (r4 == 0) goto L16
                boolean r0 = r4 instanceof android.os.Parcelable
                if (r0 == 0) goto Lc
                goto L16
            Lc:
                boolean r0 = r4 instanceof java.io.Serializable
                if (r0 == 0) goto L15
                java.io.Serializable r4 = (java.io.Serializable) r4
                r2.putSerializable(r3, r4)
            L15:
                return
            L16:
                android.os.Parcelable r4 = (android.os.Parcelable) r4
                r2.putParcelable(r3, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class SerializableArrayType<D extends java.io.Serializable> extends androidx.navigation.NavType<D[]> {

        @androidx.annotation.NonNull
        private final java.lang.Class<D[]> mArrayType;

        public SerializableArrayType(@androidx.annotation.NonNull java.lang.Class<D> r3) {
                r2 = this;
                r0 = 1
                r2.<init>(r0)
                java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
                boolean r0 = r0.isAssignableFrom(r3)
                if (r0 == 0) goto L34
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L2d
                r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L2d
                java.lang.String r1 = "[L"
                r0.append(r1)     // Catch: java.lang.ClassNotFoundException -> L2d
                java.lang.String r3 = r3.getName()     // Catch: java.lang.ClassNotFoundException -> L2d
                r0.append(r3)     // Catch: java.lang.ClassNotFoundException -> L2d
                java.lang.String r3 = ";"
                r0.append(r3)     // Catch: java.lang.ClassNotFoundException -> L2d
                java.lang.String r3 = r0.toString()     // Catch: java.lang.ClassNotFoundException -> L2d
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L2d
                r2.mArrayType = r3
                return
            L2d:
                r3 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r3)
                throw r0
            L34:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " does not implement Serializable."
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L4
                r3 = 1
                return r3
            L4:
                if (r3 == 0) goto L1a
                java.lang.Class<androidx.navigation.NavType$SerializableArrayType> r0 = androidx.navigation.NavType.SerializableArrayType.class
                java.lang.Class r1 = r3.getClass()
                if (r0 == r1) goto Lf
                goto L1a
            Lf:
                androidx.navigation.NavType$SerializableArrayType r3 = (androidx.navigation.NavType.SerializableArrayType) r3
                java.lang.Class<D extends java.io.Serializable[]> r0 = r2.mArrayType
                java.lang.Class<D extends java.io.Serializable[]> r3 = r3.mArrayType
                boolean r3 = r0.equals(r3)
                return r3
            L1a:
                r3 = 0
                return r3
        }

        @Override // androidx.navigation.NavType
        @androidx.annotation.Nullable
        public /* bridge */ /* synthetic */ java.lang.Object get(@androidx.annotation.NonNull android.os.Bundle r1, @androidx.annotation.NonNull java.lang.String r2) {
                r0 = this;
                java.io.Serializable[] r1 = r0.get(r1, r2)
                return r1
        }

        @Override // androidx.navigation.NavType
        @androidx.annotation.Nullable
        public D[] get(@androidx.annotation.NonNull android.os.Bundle r1, @androidx.annotation.NonNull java.lang.String r2) {
                r0 = this;
                java.lang.Object r1 = r1.get(r2)
                java.io.Serializable[] r1 = (java.io.Serializable[]) r1
                return r1
        }

        @Override // androidx.navigation.NavType
        @androidx.annotation.NonNull
        public java.lang.String getName() {
                r1 = this;
                java.lang.Class<D extends java.io.Serializable[]> r0 = r1.mArrayType
                java.lang.String r0 = r0.getName()
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.Class<D extends java.io.Serializable[]> r0 = r1.mArrayType
                int r0 = r0.hashCode()
                return r0
        }

        @Override // androidx.navigation.NavType
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ java.lang.Object parseValue(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                java.io.Serializable[] r1 = r0.parseValue(r1)
                return r1
        }

        @Override // androidx.navigation.NavType
        @androidx.annotation.NonNull
        public D[] parseValue(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Arrays don't support default values."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(@androidx.annotation.NonNull android.os.Bundle r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable java.lang.Object r3) {
                r0 = this;
                java.io.Serializable[] r3 = (java.io.Serializable[]) r3
                r0.put(r1, r2, r3)
                return
        }

        public void put(@androidx.annotation.NonNull android.os.Bundle r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable D[] r4) {
                r1 = this;
                java.lang.Class<D extends java.io.Serializable[]> r0 = r1.mArrayType
                r0.cast(r4)
                r2.putSerializable(r3, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class SerializableType<D extends java.io.Serializable> extends androidx.navigation.NavType<D> {

        @androidx.annotation.NonNull
        private final java.lang.Class<D> mType;

        public SerializableType(@androidx.annotation.NonNull java.lang.Class<D> r3) {
                r2 = this;
                r0 = 1
                r2.<init>(r0)
                java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
                boolean r0 = r0.isAssignableFrom(r3)
                if (r0 == 0) goto L2c
                boolean r0 = r3.isEnum()
                if (r0 != 0) goto L15
                r2.mType = r3
                return
            L15:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " is an Enum. You should use EnumType instead."
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            L2c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " does not implement Serializable."
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        SerializableType(boolean r2, @androidx.annotation.NonNull java.lang.Class<D> r3) {
                r1 = this;
                r1.<init>(r2)
                java.lang.Class<java.io.Serializable> r2 = java.io.Serializable.class
                boolean r2 = r2.isAssignableFrom(r3)
                if (r2 == 0) goto Le
                r1.mType = r3
                return
            Le:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = " does not implement Serializable."
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                throw r2
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                if (r1 != r2) goto L4
                r2 = 1
                return r2
            L4:
                boolean r0 = r2 instanceof androidx.navigation.NavType.SerializableType
                if (r0 != 0) goto La
                r2 = 0
                return r2
            La:
                androidx.navigation.NavType$SerializableType r2 = (androidx.navigation.NavType.SerializableType) r2
                java.lang.Class<D extends java.io.Serializable> r0 = r1.mType
                java.lang.Class<D extends java.io.Serializable> r2 = r2.mType
                boolean r2 = r0.equals(r2)
                return r2
        }

        @Override // androidx.navigation.NavType
        @androidx.annotation.Nullable
        public D get(@androidx.annotation.NonNull android.os.Bundle r1, @androidx.annotation.NonNull java.lang.String r2) {
                r0 = this;
                java.lang.Object r1 = r1.get(r2)
                java.io.Serializable r1 = (java.io.Serializable) r1
                return r1
        }

        @Override // androidx.navigation.NavType
        @androidx.annotation.Nullable
        public /* bridge */ /* synthetic */ java.lang.Object get(@androidx.annotation.NonNull android.os.Bundle r1, @androidx.annotation.NonNull java.lang.String r2) {
                r0 = this;
                java.io.Serializable r1 = r0.get(r1, r2)
                return r1
        }

        @Override // androidx.navigation.NavType
        @androidx.annotation.NonNull
        public java.lang.String getName() {
                r1 = this;
                java.lang.Class<D extends java.io.Serializable> r0 = r1.mType
                java.lang.String r0 = r0.getName()
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.Class<D extends java.io.Serializable> r0 = r1.mType
                int r0 = r0.hashCode()
                return r0
        }

        @Override // androidx.navigation.NavType
        @androidx.annotation.NonNull
        public D parseValue(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Serializables don't support default values."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.navigation.NavType
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ java.lang.Object parseValue(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                java.io.Serializable r1 = r0.parseValue(r1)
                return r1
        }

        public void put(@androidx.annotation.NonNull android.os.Bundle r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable D r4) {
                r1 = this;
                java.lang.Class<D extends java.io.Serializable> r0 = r1.mType
                r0.cast(r4)
                r2.putSerializable(r3, r4)
                return
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(@androidx.annotation.NonNull android.os.Bundle r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable java.lang.Object r3) {
                r0 = this;
                java.io.Serializable r3 = (java.io.Serializable) r3
                r0.put(r1, r2, r3)
                return
        }
    }

    static {
            androidx.navigation.NavType$1 r0 = new androidx.navigation.NavType$1
            r1 = 0
            r0.<init>(r1)
            androidx.navigation.NavType.IntType = r0
            androidx.navigation.NavType$2 r0 = new androidx.navigation.NavType$2
            r0.<init>(r1)
            androidx.navigation.NavType.ReferenceType = r0
            androidx.navigation.NavType$3 r0 = new androidx.navigation.NavType$3
            r2 = 1
            r0.<init>(r2)
            androidx.navigation.NavType.IntArrayType = r0
            androidx.navigation.NavType$4 r0 = new androidx.navigation.NavType$4
            r0.<init>(r1)
            androidx.navigation.NavType.LongType = r0
            androidx.navigation.NavType$5 r0 = new androidx.navigation.NavType$5
            r0.<init>(r2)
            androidx.navigation.NavType.LongArrayType = r0
            androidx.navigation.NavType$6 r0 = new androidx.navigation.NavType$6
            r0.<init>(r1)
            androidx.navigation.NavType.FloatType = r0
            androidx.navigation.NavType$7 r0 = new androidx.navigation.NavType$7
            r0.<init>(r2)
            androidx.navigation.NavType.FloatArrayType = r0
            androidx.navigation.NavType$8 r0 = new androidx.navigation.NavType$8
            r0.<init>(r1)
            androidx.navigation.NavType.BoolType = r0
            androidx.navigation.NavType$9 r0 = new androidx.navigation.NavType$9
            r0.<init>(r2)
            androidx.navigation.NavType.BoolArrayType = r0
            androidx.navigation.NavType$10 r0 = new androidx.navigation.NavType$10
            r0.<init>(r2)
            androidx.navigation.NavType.StringType = r0
            androidx.navigation.NavType$11 r0 = new androidx.navigation.NavType$11
            r0.<init>(r2)
            androidx.navigation.NavType.StringArrayType = r0
            return
    }

    NavType(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.mNullableAllowed = r1
            return
    }

    @androidx.annotation.NonNull
    public static androidx.navigation.NavType<?> fromArgType(@androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4) {
            androidx.navigation.NavType<java.lang.Integer> r0 = androidx.navigation.NavType.IntType
            java.lang.String r1 = r0.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Ld
            return r0
        Ld:
            androidx.navigation.NavType<int[]> r0 = androidx.navigation.NavType.IntArrayType
            java.lang.String r1 = r0.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1a
            return r0
        L1a:
            androidx.navigation.NavType<java.lang.Long> r0 = androidx.navigation.NavType.LongType
            java.lang.String r1 = r0.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L27
            return r0
        L27:
            androidx.navigation.NavType<long[]> r0 = androidx.navigation.NavType.LongArrayType
            java.lang.String r1 = r0.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L34
            return r0
        L34:
            androidx.navigation.NavType<java.lang.Boolean> r0 = androidx.navigation.NavType.BoolType
            java.lang.String r1 = r0.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L41
            return r0
        L41:
            androidx.navigation.NavType<boolean[]> r0 = androidx.navigation.NavType.BoolArrayType
            java.lang.String r1 = r0.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4e
            return r0
        L4e:
            androidx.navigation.NavType<java.lang.String> r0 = androidx.navigation.NavType.StringType
            java.lang.String r1 = r0.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5c
            goto L12e
        L5c:
            androidx.navigation.NavType<java.lang.String[]> r1 = androidx.navigation.NavType.StringArrayType
            java.lang.String r2 = r1.getName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L69
            return r1
        L69:
            androidx.navigation.NavType<java.lang.Float> r1 = androidx.navigation.NavType.FloatType
            java.lang.String r2 = r1.getName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L76
            return r1
        L76:
            androidx.navigation.NavType<float[]> r1 = androidx.navigation.NavType.FloatArrayType
            java.lang.String r2 = r1.getName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L83
            return r1
        L83:
            androidx.navigation.NavType<java.lang.Integer> r1 = androidx.navigation.NavType.ReferenceType
            java.lang.String r2 = r1.getName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L90
            return r1
        L90:
            if (r3 == 0) goto L12e
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L12e
            java.lang.String r0 = "."
            boolean r0 = r3.startsWith(r0)     // Catch: java.lang.ClassNotFoundException -> L127
            if (r0 == 0) goto Lb2
            if (r4 == 0) goto Lb2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L127
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L127
            r0.append(r4)     // Catch: java.lang.ClassNotFoundException -> L127
            r0.append(r3)     // Catch: java.lang.ClassNotFoundException -> L127
            java.lang.String r4 = r0.toString()     // Catch: java.lang.ClassNotFoundException -> L127
            goto Lb3
        Lb2:
            r4 = r3
        Lb3:
            java.lang.String r0 = "[]"
            boolean r3 = r3.endsWith(r0)     // Catch: java.lang.ClassNotFoundException -> L127
            java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
            java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
            if (r3 == 0) goto Le6
            int r3 = r4.length()     // Catch: java.lang.ClassNotFoundException -> L127
            int r3 = r3 + (-2)
            r2 = 0
            java.lang.String r4 = r4.substring(r2, r3)     // Catch: java.lang.ClassNotFoundException -> L127
            java.lang.Class r3 = java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L127
            boolean r1 = r1.isAssignableFrom(r3)     // Catch: java.lang.ClassNotFoundException -> L127
            if (r1 == 0) goto Lda
            androidx.navigation.NavType$ParcelableArrayType r4 = new androidx.navigation.NavType$ParcelableArrayType     // Catch: java.lang.ClassNotFoundException -> L127
            r4.<init>(r3)     // Catch: java.lang.ClassNotFoundException -> L127
            return r4
        Lda:
            boolean r0 = r0.isAssignableFrom(r3)     // Catch: java.lang.ClassNotFoundException -> L127
            if (r0 == 0) goto L110
            androidx.navigation.NavType$SerializableArrayType r4 = new androidx.navigation.NavType$SerializableArrayType     // Catch: java.lang.ClassNotFoundException -> L127
            r4.<init>(r3)     // Catch: java.lang.ClassNotFoundException -> L127
            return r4
        Le6:
            java.lang.Class r3 = java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L127
            boolean r1 = r1.isAssignableFrom(r3)     // Catch: java.lang.ClassNotFoundException -> L127
            if (r1 == 0) goto Lf6
            androidx.navigation.NavType$ParcelableType r4 = new androidx.navigation.NavType$ParcelableType     // Catch: java.lang.ClassNotFoundException -> L127
            r4.<init>(r3)     // Catch: java.lang.ClassNotFoundException -> L127
            return r4
        Lf6:
            java.lang.Class<java.lang.Enum> r1 = java.lang.Enum.class
            boolean r1 = r1.isAssignableFrom(r3)     // Catch: java.lang.ClassNotFoundException -> L127
            if (r1 == 0) goto L104
            androidx.navigation.NavType$EnumType r4 = new androidx.navigation.NavType$EnumType     // Catch: java.lang.ClassNotFoundException -> L127
            r4.<init>(r3)     // Catch: java.lang.ClassNotFoundException -> L127
            return r4
        L104:
            boolean r0 = r0.isAssignableFrom(r3)     // Catch: java.lang.ClassNotFoundException -> L127
            if (r0 == 0) goto L110
            androidx.navigation.NavType$SerializableType r4 = new androidx.navigation.NavType$SerializableType     // Catch: java.lang.ClassNotFoundException -> L127
            r4.<init>(r3)     // Catch: java.lang.ClassNotFoundException -> L127
            return r4
        L110:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.ClassNotFoundException -> L127
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L127
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L127
            r0.append(r4)     // Catch: java.lang.ClassNotFoundException -> L127
            java.lang.String r4 = " is not Serializable or Parcelable."
            r0.append(r4)     // Catch: java.lang.ClassNotFoundException -> L127
            java.lang.String r4 = r0.toString()     // Catch: java.lang.ClassNotFoundException -> L127
            r3.<init>(r4)     // Catch: java.lang.ClassNotFoundException -> L127
            throw r3     // Catch: java.lang.ClassNotFoundException -> L127
        L127:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
        L12e:
            return r0
    }

    @androidx.annotation.NonNull
    static androidx.navigation.NavType inferFromValue(@androidx.annotation.NonNull java.lang.String r1) {
            androidx.navigation.NavType<java.lang.Integer> r0 = androidx.navigation.NavType.IntType     // Catch: java.lang.IllegalArgumentException -> L6
            r0.parseValue(r1)     // Catch: java.lang.IllegalArgumentException -> L6
            return r0
        L6:
            androidx.navigation.NavType<java.lang.Long> r0 = androidx.navigation.NavType.LongType     // Catch: java.lang.IllegalArgumentException -> Lc
            r0.parseValue(r1)     // Catch: java.lang.IllegalArgumentException -> Lc
            return r0
        Lc:
            androidx.navigation.NavType<java.lang.Float> r0 = androidx.navigation.NavType.FloatType     // Catch: java.lang.IllegalArgumentException -> L12
            r0.parseValue(r1)     // Catch: java.lang.IllegalArgumentException -> L12
            return r0
        L12:
            androidx.navigation.NavType<java.lang.Boolean> r0 = androidx.navigation.NavType.BoolType     // Catch: java.lang.IllegalArgumentException -> L18
            r0.parseValue(r1)     // Catch: java.lang.IllegalArgumentException -> L18
            return r0
        L18:
            androidx.navigation.NavType<java.lang.String> r1 = androidx.navigation.NavType.StringType
            return r1
    }

    @androidx.annotation.NonNull
    static androidx.navigation.NavType inferFromValueType(@androidx.annotation.Nullable java.lang.Object r3) {
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L7
            androidx.navigation.NavType<java.lang.Integer> r3 = androidx.navigation.NavType.IntType
            return r3
        L7:
            boolean r0 = r3 instanceof int[]
            if (r0 == 0) goto Le
            androidx.navigation.NavType<int[]> r3 = androidx.navigation.NavType.IntArrayType
            return r3
        Le:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L15
            androidx.navigation.NavType<java.lang.Long> r3 = androidx.navigation.NavType.LongType
            return r3
        L15:
            boolean r0 = r3 instanceof long[]
            if (r0 == 0) goto L1c
            androidx.navigation.NavType<long[]> r3 = androidx.navigation.NavType.LongArrayType
            return r3
        L1c:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L23
            androidx.navigation.NavType<java.lang.Float> r3 = androidx.navigation.NavType.FloatType
            return r3
        L23:
            boolean r0 = r3 instanceof float[]
            if (r0 == 0) goto L2a
            androidx.navigation.NavType<float[]> r3 = androidx.navigation.NavType.FloatArrayType
            return r3
        L2a:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L31
            androidx.navigation.NavType<java.lang.Boolean> r3 = androidx.navigation.NavType.BoolType
            return r3
        L31:
            boolean r0 = r3 instanceof boolean[]
            if (r0 == 0) goto L38
            androidx.navigation.NavType<boolean[]> r3 = androidx.navigation.NavType.BoolArrayType
            return r3
        L38:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 != 0) goto Le5
            if (r3 != 0) goto L40
            goto Le5
        L40:
            boolean r0 = r3 instanceof java.lang.String[]
            if (r0 == 0) goto L47
            androidx.navigation.NavType<java.lang.String[]> r3 = androidx.navigation.NavType.StringArrayType
            return r3
        L47:
            java.lang.Class r0 = r3.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L6f
            java.lang.Class r0 = r3.getClass()
            java.lang.Class r0 = r0.getComponentType()
            java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L6f
            androidx.navigation.NavType$ParcelableArrayType r0 = new androidx.navigation.NavType$ParcelableArrayType
            java.lang.Class r3 = r3.getClass()
            java.lang.Class r3 = r3.getComponentType()
            r0.<init>(r3)
            return r0
        L6f:
            java.lang.Class r0 = r3.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L97
            java.lang.Class r0 = r3.getClass()
            java.lang.Class r0 = r0.getComponentType()
            java.lang.Class<java.io.Serializable> r1 = java.io.Serializable.class
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L97
            androidx.navigation.NavType$SerializableArrayType r0 = new androidx.navigation.NavType$SerializableArrayType
            java.lang.Class r3 = r3.getClass()
            java.lang.Class r3 = r3.getComponentType()
            r0.<init>(r3)
            return r0
        L97:
            boolean r0 = r3 instanceof android.os.Parcelable
            if (r0 == 0) goto La5
            androidx.navigation.NavType$ParcelableType r0 = new androidx.navigation.NavType$ParcelableType
            java.lang.Class r3 = r3.getClass()
            r0.<init>(r3)
            return r0
        La5:
            boolean r0 = r3 instanceof java.lang.Enum
            if (r0 == 0) goto Lb3
            androidx.navigation.NavType$EnumType r0 = new androidx.navigation.NavType$EnumType
            java.lang.Class r3 = r3.getClass()
            r0.<init>(r3)
            return r0
        Lb3:
            boolean r0 = r3 instanceof java.io.Serializable
            if (r0 == 0) goto Lc1
            androidx.navigation.NavType$SerializableType r0 = new androidx.navigation.NavType$SerializableType
            java.lang.Class r3 = r3.getClass()
            r0.<init>(r3)
            return r0
        Lc1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Object of type "
            r1.append(r2)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = " is not supported for navigation arguments."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        Le5:
            androidx.navigation.NavType<java.lang.String> r3 = androidx.navigation.NavType.StringType
            return r3
    }

    @androidx.annotation.Nullable
    public abstract T get(@androidx.annotation.NonNull android.os.Bundle r1, @androidx.annotation.NonNull java.lang.String r2);

    @androidx.annotation.NonNull
    public abstract java.lang.String getName();

    public boolean isNullableAllowed() {
            r1 = this;
            boolean r0 = r1.mNullableAllowed
            return r0
    }

    @androidx.annotation.NonNull
    T parseAndPut(@androidx.annotation.NonNull android.os.Bundle r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
            r0 = this;
            java.lang.Object r3 = r0.parseValue(r3)
            r0.put(r1, r2, r3)
            return r3
    }

    @androidx.annotation.NonNull
    public abstract T parseValue(@androidx.annotation.NonNull java.lang.String r1);

    public abstract void put(@androidx.annotation.NonNull android.os.Bundle r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable T r3);

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.getName()
            return r0
    }
}
