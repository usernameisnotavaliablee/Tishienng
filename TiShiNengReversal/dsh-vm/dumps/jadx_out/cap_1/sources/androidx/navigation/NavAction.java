package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavAction {
    private android.os.Bundle mDefaultArguments;

    @androidx.annotation.IdRes
    private final int mDestinationId;
    private androidx.navigation.NavOptions mNavOptions;

    public NavAction(@androidx.annotation.IdRes int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NavAction(@androidx.annotation.IdRes int r2, @androidx.annotation.Nullable androidx.navigation.NavOptions r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public NavAction(@androidx.annotation.IdRes int r1, @androidx.annotation.Nullable androidx.navigation.NavOptions r2, @androidx.annotation.Nullable android.os.Bundle r3) {
            r0 = this;
            r0.<init>()
            r0.mDestinationId = r1
            r0.mNavOptions = r2
            r0.mDefaultArguments = r3
            return
    }

    @androidx.annotation.Nullable
    public android.os.Bundle getDefaultArguments() {
            r1 = this;
            android.os.Bundle r0 = r1.mDefaultArguments
            return r0
    }

    public int getDestinationId() {
            r1 = this;
            int r0 = r1.mDestinationId
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.navigation.NavOptions getNavOptions() {
            r1 = this;
            androidx.navigation.NavOptions r0 = r1.mNavOptions
            return r0
    }

    public void setDefaultArguments(@androidx.annotation.Nullable android.os.Bundle r1) {
            r0 = this;
            r0.mDefaultArguments = r1
            return
    }

    public void setNavOptions(@androidx.annotation.Nullable androidx.navigation.NavOptions r1) {
            r0 = this;
            r0.mNavOptions = r1
            return
    }
}
