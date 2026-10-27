package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.navigation.NavOptionsDsl
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavOptionsBuilder {
    private final androidx.navigation.NavOptions.Builder builder;
    private boolean inclusive;
    private boolean launchSingleTop;

    @androidx.annotation.IdRes
    private int popUpTo;

    public NavOptionsBuilder() {
            r1 = this;
            r1.<init>()
            androidx.navigation.NavOptions$Builder r0 = new androidx.navigation.NavOptions$Builder
            r0.<init>()
            r1.builder = r0
            r0 = -1
            r1.popUpTo = r0
            return
    }

    public final void anim(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.navigation.AnimBuilder, kotlin.n1> r3) {
            r2 = this;
            java.lang.String r0 = "animBuilder"
            kotlin.jvm.internal.g0.q(r3, r0)
            androidx.navigation.AnimBuilder r0 = new androidx.navigation.AnimBuilder
            r0.<init>()
            r3.invoke(r0)
            androidx.navigation.NavOptions$Builder r3 = r2.builder
            int r1 = r0.getEnter()
            androidx.navigation.NavOptions$Builder r3 = r3.setEnterAnim(r1)
            int r1 = r0.getExit()
            androidx.navigation.NavOptions$Builder r3 = r3.setExitAnim(r1)
            int r1 = r0.getPopEnter()
            androidx.navigation.NavOptions$Builder r3 = r3.setPopEnterAnim(r1)
            int r0 = r0.getPopExit()
            r3.setPopExitAnim(r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.navigation.NavOptions build$navigation_common_ktx_release() {
            r3 = this;
            androidx.navigation.NavOptions$Builder r0 = r3.builder
            boolean r1 = r3.launchSingleTop
            r0.setLaunchSingleTop(r1)
            int r1 = r3.popUpTo
            boolean r2 = r3.inclusive
            r0.setPopUpTo(r1, r2)
            androidx.navigation.NavOptions r0 = r0.build()
            java.lang.String r1 = "builder.apply {\n        … inclusive)\n    }.build()"
            kotlin.jvm.internal.g0.h(r0, r1)
            return r0
    }

    public final boolean getLaunchSingleTop() {
            r1 = this;
            boolean r0 = r1.launchSingleTop
            return r0
    }

    public final int getPopUpTo() {
            r1 = this;
            int r0 = r1.popUpTo
            return r0
    }

    public final void popUpTo(@androidx.annotation.IdRes int r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.navigation.PopUpToBuilder, kotlin.n1> r3) {
            r1 = this;
            java.lang.String r0 = "popUpToBuilder"
            kotlin.jvm.internal.g0.q(r3, r0)
            r1.setPopUpTo(r2)
            androidx.navigation.PopUpToBuilder r2 = new androidx.navigation.PopUpToBuilder
            r2.<init>()
            r3.invoke(r2)
            boolean r2 = r2.getInclusive()
            r1.inclusive = r2
            return
    }

    public final void setLaunchSingleTop(boolean r1) {
            r0 = this;
            r0.launchSingleTop = r1
            return
    }

    public final void setPopUpTo(int r1) {
            r0 = this;
            r0.popUpTo = r1
            r1 = 0
            r0.inclusive = r1
            return
    }
}
