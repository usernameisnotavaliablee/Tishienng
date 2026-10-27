package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "ViewModelProviderGetKt")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ViewModelProviderGetKt {
    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.viewmodel.CreationExtras defaultCreationExtras(@org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModelStoreOwner r1) {
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r0 == 0) goto L10
            androidx.lifecycle.HasDefaultViewModelProviderFactory r1 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r1
            androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
            return r1
        L10:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r1 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
            return r1
    }

    @androidx.annotation.MainThread
    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> VM get(androidx.lifecycle.ViewModelProvider r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 4
            java.lang.String r1 = "VM"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Class<androidx.lifecycle.ViewModel> r0 = androidx.lifecycle.ViewModel.class
            androidx.lifecycle.ViewModel r2 = r2.get(r0)
            return r2
    }
}
