package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ViewKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Replaced by View.findViewTreeLifecycleOwner() from lifecycle module", replaceWith = @kotlin.ReplaceWith(expression = "findViewTreeLifecycleOwner()", imports = {"androidx.lifecycle.findViewTreeLifecycleOwner"}))
    public static final /* synthetic */ androidx.lifecycle.LifecycleOwner findViewTreeLifecycleOwner(android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            androidx.lifecycle.LifecycleOwner r1 = androidx.lifecycle.ViewTreeLifecycleOwner.get(r1)
            return r1
    }
}
