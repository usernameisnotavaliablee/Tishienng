package androidx.navigation;

import androidx.navigation.NavDestination;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class Navigator<D extends androidx.navigation.NavDestination> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Extras {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Name {
        java.lang.String value();
    }

    public Navigator() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public abstract D createDestination();

    @androidx.annotation.Nullable
    public abstract androidx.navigation.NavDestination navigate(@androidx.annotation.NonNull D r1, @androidx.annotation.Nullable android.os.Bundle r2, @androidx.annotation.Nullable androidx.navigation.NavOptions r3, @androidx.annotation.Nullable androidx.navigation.Navigator.Extras r4);

    public void onRestoreState(@androidx.annotation.NonNull android.os.Bundle r1) {
            r0 = this;
            return
    }

    @androidx.annotation.Nullable
    public android.os.Bundle onSaveState() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract boolean popBackStack();
}
