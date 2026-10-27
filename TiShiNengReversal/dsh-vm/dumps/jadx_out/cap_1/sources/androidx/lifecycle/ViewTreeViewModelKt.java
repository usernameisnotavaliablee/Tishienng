package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ViewTreeViewModelKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Replaced by View.findViewTreeViewModelStoreOwner in ViewTreeViewModelStoreOwner", replaceWith = @kotlin.ReplaceWith(expression = "View.findViewTreeViewModelStoreOwner", imports = {"androidx.lifecycle.ViewTreeViewModelStoreOwner"}))
    public static final /* synthetic */ androidx.lifecycle.ViewModelStoreOwner findViewTreeViewModelStoreOwner(android.view.View r1) {
            java.lang.String r0 = "view"
            kotlin.jvm.internal.g0.p(r1, r0)
            androidx.lifecycle.ViewModelStoreOwner r1 = androidx.lifecycle.ViewTreeViewModelStoreOwner.get(r1)
            return r1
    }
}
