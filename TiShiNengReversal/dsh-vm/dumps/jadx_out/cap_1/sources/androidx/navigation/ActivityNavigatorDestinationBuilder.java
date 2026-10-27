package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.navigation.NavDestinationDsl
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ActivityNavigatorDestinationBuilder extends androidx.navigation.NavDestinationBuilder<androidx.navigation.ActivityNavigator.Destination> {

    @org.jetbrains.annotations.Nullable
    private java.lang.String action;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.d<? extends android.app.Activity> activityClass;
    private final android.content.Context context;

    @org.jetbrains.annotations.Nullable
    private android.net.Uri data;

    @org.jetbrains.annotations.Nullable
    private java.lang.String dataPattern;

    @org.jetbrains.annotations.Nullable
    private java.lang.String targetPackage;

    public ActivityNavigatorDestinationBuilder(@org.jetbrains.annotations.NotNull androidx.navigation.ActivityNavigator r2, @androidx.annotation.IdRes int r3) {
            r1 = this;
            java.lang.String r0 = "navigator"
            kotlin.jvm.internal.g0.q(r2, r0)
            r1.<init>(r2, r3)
            android.content.Context r2 = r2.getContext()
            java.lang.String r3 = "navigator.context"
            kotlin.jvm.internal.g0.h(r2, r3)
            r1.context = r2
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavDestinationBuilder
    @org.jetbrains.annotations.NotNull
    public androidx.navigation.ActivityNavigator.Destination build() {
            r4 = this;
            androidx.navigation.NavDestination r0 = super.build()
            androidx.navigation.ActivityNavigator$Destination r0 = (androidx.navigation.ActivityNavigator.Destination) r0
            java.lang.String r1 = r4.targetPackage
            r0.setTargetPackage(r1)
            kotlin.reflect.d<? extends android.app.Activity> r1 = r4.activityClass
            if (r1 == 0) goto L1d
            android.content.ComponentName r2 = new android.content.ComponentName
            android.content.Context r3 = r4.context
            java.lang.Class r1 = k3.a.e(r1)
            r2.<init>(r3, r1)
            r0.setComponentName(r2)
        L1d:
            java.lang.String r1 = r4.action
            r0.setAction(r1)
            android.net.Uri r1 = r4.data
            r0.setData(r1)
            java.lang.String r1 = r4.dataPattern
            r0.setDataPattern(r1)
            return r0
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public /* bridge */ /* synthetic */ androidx.navigation.ActivityNavigator.Destination build() {
            r1 = this;
            androidx.navigation.ActivityNavigator$Destination r0 = r1.build()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAction() {
            r1 = this;
            java.lang.String r0 = r1.action
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.d<? extends android.app.Activity> getActivityClass() {
            r1 = this;
            kotlin.reflect.d<? extends android.app.Activity> r0 = r1.activityClass
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final android.net.Uri getData() {
            r1 = this;
            android.net.Uri r0 = r1.data
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDataPattern() {
            r1 = this;
            java.lang.String r0 = r1.dataPattern
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTargetPackage() {
            r1 = this;
            java.lang.String r0 = r1.targetPackage
            return r0
    }

    public final void setAction(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.action = r1
            return
    }

    public final void setActivityClass(@org.jetbrains.annotations.Nullable kotlin.reflect.d<? extends android.app.Activity> r1) {
            r0 = this;
            r0.activityClass = r1
            return
    }

    public final void setData(@org.jetbrains.annotations.Nullable android.net.Uri r1) {
            r0 = this;
            r0.data = r1
            return
    }

    public final void setDataPattern(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.dataPattern = r1
            return
    }

    public final void setTargetPackage(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.targetPackage = r1
            return
    }
}
