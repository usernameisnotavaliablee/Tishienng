package androidx.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(18)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ViewGroupOverlayApi18 implements androidx.transition.ViewGroupOverlayImpl {
    private final android.view.ViewGroupOverlay mViewGroupOverlay;

    ViewGroupOverlayApi18(@androidx.annotation.NonNull android.view.ViewGroup r1) {
            r0 = this;
            r0.<init>()
            android.view.ViewGroupOverlay r1 = r1.getOverlay()
            r0.mViewGroupOverlay = r1
            return
    }

    @Override // androidx.transition.ViewOverlayImpl
    public void add(@androidx.annotation.NonNull android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.view.ViewGroupOverlay r0 = r1.mViewGroupOverlay
            r0.add(r2)
            return
    }

    @Override // androidx.transition.ViewGroupOverlayImpl
    public void add(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            android.view.ViewGroupOverlay r0 = r1.mViewGroupOverlay
            r0.add(r2)
            return
    }

    @Override // androidx.transition.ViewOverlayImpl
    public void remove(@androidx.annotation.NonNull android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.view.ViewGroupOverlay r0 = r1.mViewGroupOverlay
            r0.remove(r2)
            return
    }

    @Override // androidx.transition.ViewGroupOverlayImpl
    public void remove(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            android.view.ViewGroupOverlay r0 = r1.mViewGroupOverlay
            r0.remove(r2)
            return
    }
}
