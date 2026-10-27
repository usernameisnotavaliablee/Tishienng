package androidx.fragment.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class FragmentManagerNonConfig {

    @androidx.annotation.Nullable
    private final java.util.Map<java.lang.String, androidx.fragment.app.FragmentManagerNonConfig> mChildNonConfigs;

    @androidx.annotation.Nullable
    private final java.util.Collection<androidx.fragment.app.Fragment> mFragments;

    @androidx.annotation.Nullable
    private final java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> mViewModelStores;

    FragmentManagerNonConfig(@androidx.annotation.Nullable java.util.Collection<androidx.fragment.app.Fragment> r1, @androidx.annotation.Nullable java.util.Map<java.lang.String, androidx.fragment.app.FragmentManagerNonConfig> r2, @androidx.annotation.Nullable java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> r3) {
            r0 = this;
            r0.<init>()
            r0.mFragments = r1
            r0.mChildNonConfigs = r2
            r0.mViewModelStores = r3
            return
    }

    @androidx.annotation.Nullable
    java.util.Map<java.lang.String, androidx.fragment.app.FragmentManagerNonConfig> getChildNonConfigs() {
            r1 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManagerNonConfig> r0 = r1.mChildNonConfigs
            return r0
    }

    @androidx.annotation.Nullable
    java.util.Collection<androidx.fragment.app.Fragment> getFragments() {
            r1 = this;
            java.util.Collection<androidx.fragment.app.Fragment> r0 = r1.mFragments
            return r0
    }

    @androidx.annotation.Nullable
    java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> getViewModelStores() {
            r1 = this;
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> r0 = r1.mViewModelStores
            return r0
    }

    boolean isRetaining(androidx.fragment.app.Fragment r2) {
            r1 = this;
            java.util.Collection<androidx.fragment.app.Fragment> r0 = r1.mFragments
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = r0.contains(r2)
            return r2
    }
}
