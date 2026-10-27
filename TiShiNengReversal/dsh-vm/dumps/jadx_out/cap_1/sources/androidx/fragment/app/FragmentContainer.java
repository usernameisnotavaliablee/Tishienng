package androidx.fragment.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class FragmentContainer {
    public FragmentContainer() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.fragment.app.Fragment instantiate(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable android.os.Bundle r3) {
            r0 = this;
            androidx.fragment.app.Fragment r1 = androidx.fragment.app.Fragment.instantiate(r1, r2, r3)
            return r1
    }

    @androidx.annotation.Nullable
    public abstract android.view.View onFindViewById(@androidx.annotation.IdRes int r1);

    public abstract boolean onHasView();
}
