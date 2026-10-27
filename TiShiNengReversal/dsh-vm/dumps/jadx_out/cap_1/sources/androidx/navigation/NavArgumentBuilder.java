package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.navigation.NavDestinationDsl
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavArgumentBuilder {
    private androidx.navigation.NavType<?> _type;
    private final androidx.navigation.NavArgument.Builder builder;

    @org.jetbrains.annotations.Nullable
    private java.lang.Object defaultValue;
    private boolean nullable;

    public NavArgumentBuilder() {
            r1 = this;
            r1.<init>()
            androidx.navigation.NavArgument$Builder r0 = new androidx.navigation.NavArgument$Builder
            r0.<init>()
            r1.builder = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.navigation.NavArgument build() {
            r2 = this;
            androidx.navigation.NavArgument$Builder r0 = r2.builder
            androidx.navigation.NavArgument r0 = r0.build()
            java.lang.String r1 = "builder.build()"
            kotlin.jvm.internal.g0.h(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getDefaultValue() {
            r1 = this;
            java.lang.Object r0 = r1.defaultValue
            return r0
    }

    public final boolean getNullable() {
            r1 = this;
            boolean r0 = r1.nullable
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.navigation.NavType<?> getType() {
            r2 = this;
            androidx.navigation.NavType<?> r0 = r2._type
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "NavType has not been set on this builder."
            r0.<init>(r1)
            throw r0
    }

    public final void setDefaultValue(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            r1.defaultValue = r2
            androidx.navigation.NavArgument$Builder r0 = r1.builder
            r0.setDefaultValue(r2)
            return
    }

    public final void setNullable(boolean r2) {
            r1 = this;
            r1.nullable = r2
            androidx.navigation.NavArgument$Builder r0 = r1.builder
            r0.setIsNullable(r2)
            return
    }

    public final void setType(@org.jetbrains.annotations.NotNull androidx.navigation.NavType<?> r2) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.q(r2, r0)
            r1._type = r2
            androidx.navigation.NavArgument$Builder r0 = r1.builder
            r0.setType(r2)
            return
    }
}
