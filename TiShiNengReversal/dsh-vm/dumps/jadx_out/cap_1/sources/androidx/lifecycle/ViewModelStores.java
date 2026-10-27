package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ViewModelStores {
    private ViewModelStores() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    @java.lang.Deprecated
    public static androidx.lifecycle.ViewModelStore of(@androidx.annotation.NonNull androidx.fragment.app.Fragment r0) {
            androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    @java.lang.Deprecated
    public static androidx.lifecycle.ViewModelStore of(@androidx.annotation.NonNull androidx.fragment.app.FragmentActivity r0) {
            androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
            return r0
    }
}
