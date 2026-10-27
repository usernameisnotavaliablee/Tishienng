package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ViewModelProviders {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.Deprecated
    public static class DefaultFactory extends androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory {
        @java.lang.Deprecated
        public DefaultFactory(@androidx.annotation.NonNull android.app.Application r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    @java.lang.Deprecated
    public ViewModelProviders() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    @java.lang.Deprecated
    public static androidx.lifecycle.ViewModelProvider of(@androidx.annotation.NonNull androidx.fragment.app.Fragment r1) {
            androidx.lifecycle.ViewModelProvider r0 = new androidx.lifecycle.ViewModelProvider
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    @java.lang.Deprecated
    public static androidx.lifecycle.ViewModelProvider of(@androidx.annotation.NonNull androidx.fragment.app.Fragment r1, @androidx.annotation.Nullable androidx.lifecycle.ViewModelProvider.Factory r2) {
            if (r2 != 0) goto L6
            androidx.lifecycle.ViewModelProvider$Factory r2 = r1.getDefaultViewModelProviderFactory()
        L6:
            androidx.lifecycle.ViewModelProvider r0 = new androidx.lifecycle.ViewModelProvider
            androidx.lifecycle.ViewModelStore r1 = r1.getViewModelStore()
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    @java.lang.Deprecated
    public static androidx.lifecycle.ViewModelProvider of(@androidx.annotation.NonNull androidx.fragment.app.FragmentActivity r1) {
            androidx.lifecycle.ViewModelProvider r0 = new androidx.lifecycle.ViewModelProvider
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    @java.lang.Deprecated
    public static androidx.lifecycle.ViewModelProvider of(@androidx.annotation.NonNull androidx.fragment.app.FragmentActivity r1, @androidx.annotation.Nullable androidx.lifecycle.ViewModelProvider.Factory r2) {
            if (r2 != 0) goto L6
            androidx.lifecycle.ViewModelProvider$Factory r2 = r1.getDefaultViewModelProviderFactory()
        L6:
            androidx.lifecycle.ViewModelProvider r0 = new androidx.lifecycle.ViewModelProvider
            androidx.lifecycle.ViewModelStore r1 = r1.getViewModelStore()
            r0.<init>(r1, r2)
            return r0
    }
}
