package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "ViewTreeViewModelStoreOwner")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ViewTreeViewModelStoreOwner {
    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.Nullable
    public static final androidx.lifecycle.ViewModelStoreOwner get(@org.jetbrains.annotations.NotNull android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1 r0 = androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1.INSTANCE
            kotlin.sequences.m r1 = kotlin.sequences.p.t(r1, r0)
            androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 r0 = androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2.INSTANCE
            kotlin.sequences.m r1 = kotlin.sequences.p.S1(r1, r0)
            java.lang.Object r1 = kotlin.sequences.p.i1(r1)
            androidx.lifecycle.ViewModelStoreOwner r1 = (androidx.lifecycle.ViewModelStoreOwner) r1
            return r1
    }

    @kotlin.jvm.JvmName(name = "set")
    public static final void set(@org.jetbrains.annotations.NotNull android.view.View r1, @org.jetbrains.annotations.Nullable androidx.lifecycle.ViewModelStoreOwner r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = androidx.lifecycle.viewmodel.R.id.view_tree_view_model_store_owner
            r1.setTag(r0, r2)
            return
    }
}
