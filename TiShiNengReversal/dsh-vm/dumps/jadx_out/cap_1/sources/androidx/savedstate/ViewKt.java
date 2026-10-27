package androidx.savedstate;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ViewKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Replaced by View.findViewTreeSavedStateRegistryOwner() from savedstate module", replaceWith = @kotlin.ReplaceWith(expression = "findViewTreeSavedStateRegistryOwner()", imports = {"androidx.savedstate.findViewTreeSavedStateRegistryOwner"}))
    public static final /* synthetic */ androidx.savedstate.SavedStateRegistryOwner findViewTreeSavedStateRegistryOwner(android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            androidx.savedstate.SavedStateRegistryOwner r1 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.get(r1)
            return r1
    }
}
