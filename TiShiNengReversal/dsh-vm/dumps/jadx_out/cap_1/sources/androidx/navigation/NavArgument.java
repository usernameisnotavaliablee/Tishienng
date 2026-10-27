package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavArgument {

    @androidx.annotation.Nullable
    private final java.lang.Object mDefaultValue;
    private final boolean mDefaultValuePresent;
    private final boolean mIsNullable;

    @androidx.annotation.NonNull
    private final androidx.navigation.NavType mType;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {

        @androidx.annotation.Nullable
        private java.lang.Object mDefaultValue;
        private boolean mDefaultValuePresent;
        private boolean mIsNullable;

        @androidx.annotation.Nullable
        private androidx.navigation.NavType<?> mType;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mIsNullable = r0
                r1.mDefaultValuePresent = r0
                return
        }

        @androidx.annotation.NonNull
        public androidx.navigation.NavArgument build() {
                r5 = this;
                androidx.navigation.NavType<?> r0 = r5.mType
                if (r0 != 0) goto Lc
                java.lang.Object r0 = r5.mDefaultValue
                androidx.navigation.NavType r0 = androidx.navigation.NavType.inferFromValueType(r0)
                r5.mType = r0
            Lc:
                androidx.navigation.NavArgument r0 = new androidx.navigation.NavArgument
                androidx.navigation.NavType<?> r1 = r5.mType
                boolean r2 = r5.mIsNullable
                java.lang.Object r3 = r5.mDefaultValue
                boolean r4 = r5.mDefaultValuePresent
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.navigation.NavArgument.Builder setDefaultValue(@androidx.annotation.Nullable java.lang.Object r1) {
                r0 = this;
                r0.mDefaultValue = r1
                r1 = 1
                r0.mDefaultValuePresent = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.navigation.NavArgument.Builder setIsNullable(boolean r1) {
                r0 = this;
                r0.mIsNullable = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.navigation.NavArgument.Builder setType(@androidx.annotation.NonNull androidx.navigation.NavType<?> r1) {
                r0 = this;
                r0.mType = r1
                return r0
        }
    }

    NavArgument(@androidx.annotation.NonNull androidx.navigation.NavType<?> r2, boolean r3, @androidx.annotation.Nullable java.lang.Object r4, boolean r5) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2.isNullableAllowed()
            if (r0 != 0) goto L27
            if (r3 != 0) goto Lc
            goto L27
        Lc:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = r2.getName()
            r4.append(r2)
            java.lang.String r2 = " does not allow nullable values"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        L27:
            if (r3 != 0) goto L4e
            if (r5 == 0) goto L4e
            if (r4 == 0) goto L2e
            goto L4e
        L2e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Argument with type "
            r4.append(r5)
            java.lang.String r2 = r2.getName()
            r4.append(r2)
            java.lang.String r2 = " has null value but is not nullable."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        L4e:
            r1.mType = r2
            r1.mIsNullable = r3
            r1.mDefaultValue = r4
            r1.mDefaultValuePresent = r5
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L3b
            java.lang.Class<androidx.navigation.NavArgument> r2 = androidx.navigation.NavArgument.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L3b
        L10:
            androidx.navigation.NavArgument r5 = (androidx.navigation.NavArgument) r5
            boolean r2 = r4.mIsNullable
            boolean r3 = r5.mIsNullable
            if (r2 == r3) goto L19
            return r1
        L19:
            boolean r2 = r4.mDefaultValuePresent
            boolean r3 = r5.mDefaultValuePresent
            if (r2 == r3) goto L20
            return r1
        L20:
            androidx.navigation.NavType r2 = r4.mType
            androidx.navigation.NavType r3 = r5.mType
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
            return r1
        L2b:
            java.lang.Object r2 = r4.mDefaultValue
            if (r2 == 0) goto L36
            java.lang.Object r5 = r5.mDefaultValue
            boolean r5 = r2.equals(r5)
            return r5
        L36:
            java.lang.Object r5 = r5.mDefaultValue
            if (r5 != 0) goto L3b
            return r0
        L3b:
            return r1
    }

    @androidx.annotation.Nullable
    public java.lang.Object getDefaultValue() {
            r1 = this;
            java.lang.Object r0 = r1.mDefaultValue
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.navigation.NavType<?> getType() {
            r1 = this;
            androidx.navigation.NavType r0 = r1.mType
            return r0
    }

    public int hashCode() {
            r2 = this;
            androidx.navigation.NavType r0 = r2.mType
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r2.mIsNullable
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.mDefaultValuePresent
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Object r1 = r2.mDefaultValue
            if (r1 == 0) goto L1b
            int r1 = r1.hashCode()
            goto L1c
        L1b:
            r1 = 0
        L1c:
            int r0 = r0 + r1
            return r0
    }

    public boolean isDefaultValuePresent() {
            r1 = this;
            boolean r0 = r1.mDefaultValuePresent
            return r0
    }

    public boolean isNullable() {
            r1 = this;
            boolean r0 = r1.mIsNullable
            return r0
    }

    void putDefaultValue(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull android.os.Bundle r4) {
            r2 = this;
            boolean r0 = r2.mDefaultValuePresent
            if (r0 == 0) goto Lb
            androidx.navigation.NavType r0 = r2.mType
            java.lang.Object r1 = r2.mDefaultValue
            r0.put(r4, r3, r1)
        Lb:
            return
    }

    boolean verify(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull android.os.Bundle r4) {
            r2 = this;
            boolean r0 = r2.mIsNullable
            r1 = 0
            if (r0 != 0) goto L12
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L12
            java.lang.Object r0 = r4.get(r3)
            if (r0 != 0) goto L12
            return r1
        L12:
            androidx.navigation.NavType r0 = r2.mType     // Catch: java.lang.ClassCastException -> L19
            r0.get(r4, r3)     // Catch: java.lang.ClassCastException -> L19
            r3 = 1
            return r3
        L19:
            return r1
    }
}
