package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class EmptyActivityLifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
    public EmptyActivityLifecycleCallbacks() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@org.jetbrains.annotations.NotNull android.app.Activity r1, @org.jetbrains.annotations.Nullable android.os.Bundle r2) {
            r0 = this;
            java.lang.String r2 = "activity"
            kotlin.jvm.internal.g0.p(r1, r2)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@org.jetbrains.annotations.NotNull android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@org.jetbrains.annotations.NotNull android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@org.jetbrains.annotations.NotNull android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@org.jetbrains.annotations.NotNull android.app.Activity r2, @org.jetbrains.annotations.NotNull android.os.Bundle r3) {
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "outState"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@org.jetbrains.annotations.NotNull android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@org.jetbrains.annotations.NotNull android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }
}
