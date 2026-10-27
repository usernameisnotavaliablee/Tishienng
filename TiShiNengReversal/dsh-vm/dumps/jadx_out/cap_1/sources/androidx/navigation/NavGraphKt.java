package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavGraphKt {
    public static final boolean contains(@org.jetbrains.annotations.NotNull androidx.navigation.NavGraph r1, @androidx.annotation.IdRes int r2) {
            java.lang.String r0 = "$this$contains"
            kotlin.jvm.internal.g0.q(r1, r0)
            androidx.navigation.NavDestination r1 = r1.findNode(r2)
            if (r1 == 0) goto Ld
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.navigation.NavDestination get(@org.jetbrains.annotations.NotNull androidx.navigation.NavGraph r3, @androidx.annotation.IdRes int r4) {
            java.lang.String r0 = "$this$get"
            kotlin.jvm.internal.g0.q(r3, r0)
            androidx.navigation.NavDestination r0 = r3.findNode(r4)
            if (r0 == 0) goto Lc
            return r0
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No destination for "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " was found in "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static final void minusAssign(@org.jetbrains.annotations.NotNull androidx.navigation.NavGraph r1, @org.jetbrains.annotations.NotNull androidx.navigation.NavDestination r2) {
            java.lang.String r0 = "$this$minusAssign"
            kotlin.jvm.internal.g0.q(r1, r0)
            java.lang.String r0 = "node"
            kotlin.jvm.internal.g0.q(r2, r0)
            r1.remove(r2)
            return
    }

    public static final void plusAssign(@org.jetbrains.annotations.NotNull androidx.navigation.NavGraph r1, @org.jetbrains.annotations.NotNull androidx.navigation.NavDestination r2) {
            java.lang.String r0 = "$this$plusAssign"
            kotlin.jvm.internal.g0.q(r1, r0)
            java.lang.String r0 = "node"
            kotlin.jvm.internal.g0.q(r2, r0)
            r1.addDestination(r2)
            return
    }

    public static final void plusAssign(@org.jetbrains.annotations.NotNull androidx.navigation.NavGraph r1, @org.jetbrains.annotations.NotNull androidx.navigation.NavGraph r2) {
            java.lang.String r0 = "$this$plusAssign"
            kotlin.jvm.internal.g0.q(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.q(r2, r0)
            r1.addAll(r2)
            return
    }
}
