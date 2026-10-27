package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.databinding.BindingMethods({@androidx.databinding.BindingMethod(attribute = "android:alwaysDrawnWithCache", method = "setAlwaysDrawnWithCacheEnabled", type = android.view.ViewGroup.class), @androidx.databinding.BindingMethod(attribute = "android:animationCache", method = "setAnimationCacheEnabled", type = android.view.ViewGroup.class), @androidx.databinding.BindingMethod(attribute = "android:splitMotionEvents", method = "setMotionEventSplittingEnabled", type = android.view.ViewGroup.class)})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ViewGroupBindingAdapter {



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnAnimationEnd {
        void onAnimationEnd(android.view.animation.Animation r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnAnimationRepeat {
        void onAnimationRepeat(android.view.animation.Animation r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnAnimationStart {
        void onAnimationStart(android.view.animation.Animation r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnChildViewAdded {
        void onChildViewAdded(android.view.View r1, android.view.View r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnChildViewRemoved {
        void onChildViewRemoved(android.view.View r1, android.view.View r2);
    }

    public ViewGroupBindingAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.databinding.BindingAdapter({"android:animateLayoutChanges"})
    @android.annotation.TargetApi(11)
    public static void setAnimateLayoutChanges(android.view.ViewGroup r0, boolean r1) {
            if (r1 == 0) goto Lb
            android.animation.LayoutTransition r1 = new android.animation.LayoutTransition
            r1.<init>()
            r0.setLayoutTransition(r1)
            return
        Lb:
            r1 = 0
            r0.setLayoutTransition(r1)
            return
    }

    @androidx.databinding.BindingAdapter(requireAll = false, value = {"android:onAnimationStart", "android:onAnimationEnd", "android:onAnimationRepeat"})
    public static void setListener(android.view.ViewGroup r1, androidx.databinding.adapters.ViewGroupBindingAdapter.OnAnimationStart r2, androidx.databinding.adapters.ViewGroupBindingAdapter.OnAnimationEnd r3, androidx.databinding.adapters.ViewGroupBindingAdapter.OnAnimationRepeat r4) {
            if (r2 != 0) goto Lb
            if (r3 != 0) goto Lb
            if (r4 != 0) goto Lb
            r2 = 0
            r1.setLayoutAnimationListener(r2)
            return
        Lb:
            androidx.databinding.adapters.ViewGroupBindingAdapter$2 r0 = new androidx.databinding.adapters.ViewGroupBindingAdapter$2
            r0.<init>(r2, r3, r4)
            r1.setLayoutAnimationListener(r0)
            return
    }

    @androidx.databinding.BindingAdapter(requireAll = false, value = {"android:onChildViewAdded", "android:onChildViewRemoved"})
    public static void setListener(android.view.ViewGroup r1, androidx.databinding.adapters.ViewGroupBindingAdapter.OnChildViewAdded r2, androidx.databinding.adapters.ViewGroupBindingAdapter.OnChildViewRemoved r3) {
            if (r2 != 0) goto L9
            if (r3 != 0) goto L9
            r2 = 0
            r1.setOnHierarchyChangeListener(r2)
            return
        L9:
            androidx.databinding.adapters.ViewGroupBindingAdapter$1 r0 = new androidx.databinding.adapters.ViewGroupBindingAdapter$1
            r0.<init>(r2, r3)
            r1.setOnHierarchyChangeListener(r0)
            return
    }
}
