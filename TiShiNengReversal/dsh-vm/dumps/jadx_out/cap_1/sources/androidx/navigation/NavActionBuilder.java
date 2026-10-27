package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.navigation.NavDestinationDsl
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavActionBuilder {

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.lang.Object> defaultArguments;
    private int destinationId;
    private androidx.navigation.NavOptions navOptions;

    public NavActionBuilder() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.defaultArguments = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.navigation.NavAction build$navigation_common_ktx_release() {
            r4 = this;
            int r0 = r4.destinationId
            androidx.navigation.NavOptions r1 = r4.navOptions
            java.util.Map<java.lang.String, java.lang.Object> r2 = r4.defaultArguments
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Le
            r2 = 0
            goto L2c
        Le:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r4.defaultArguments
            java.util.List r2 = kotlin.collections.i1.J1(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = 0
            kotlin.Pair[] r3 = new kotlin.Pair[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            if (r2 == 0) goto L32
            kotlin.Pair[] r2 = (kotlin.Pair[]) r2
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            kotlin.Pair[] r2 = (kotlin.Pair[]) r2
            android.os.Bundle r2 = androidx.core.os.BundleKt.bundleOf(r2)
        L2c:
            androidx.navigation.NavAction r3 = new androidx.navigation.NavAction
            r3.<init>(r0, r1, r2)
            return r3
        L32:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.Object> getDefaultArguments() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.defaultArguments
            return r0
    }

    public final int getDestinationId() {
            r1 = this;
            int r0 = r1.destinationId
            return r0
    }

    public final void navOptions(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.navigation.NavOptionsBuilder, kotlin.n1> r2) {
            r1 = this;
            java.lang.String r0 = "optionsBuilder"
            kotlin.jvm.internal.g0.q(r2, r0)
            androidx.navigation.NavOptionsBuilder r0 = new androidx.navigation.NavOptionsBuilder
            r0.<init>()
            r2.invoke(r0)
            androidx.navigation.NavOptions r2 = r0.build$navigation_common_ktx_release()
            r1.navOptions = r2
            return
    }

    public final void setDestinationId(int r1) {
            r0 = this;
            r0.destinationId = r1
            return
    }
}
