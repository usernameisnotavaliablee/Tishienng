package androidx.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(29)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ViewUtilsApi29 extends androidx.transition.ViewUtilsApi23 {
    ViewUtilsApi29() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.transition.ViewUtilsApi19, androidx.transition.ViewUtilsBase
    public float getTransitionAlpha(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            float r1 = androidx.transition.h.a(r1)
            return r1
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsBase
    public void setAnimationMatrix(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable android.graphics.Matrix r2) {
            r0 = this;
            androidx.transition.i.a(r1, r2)
            return
    }

    @Override // androidx.transition.ViewUtilsApi22, androidx.transition.ViewUtilsBase
    public void setLeftTopRightBottom(@androidx.annotation.NonNull android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            androidx.transition.l.a(r1, r2, r3, r4, r5)
            return
    }

    @Override // androidx.transition.ViewUtilsApi19, androidx.transition.ViewUtilsBase
    public void setTransitionAlpha(@androidx.annotation.NonNull android.view.View r1, float r2) {
            r0 = this;
            androidx.transition.g.a(r1, r2)
            return
    }

    @Override // androidx.transition.ViewUtilsApi23, androidx.transition.ViewUtilsBase
    public void setTransitionVisibility(@androidx.annotation.NonNull android.view.View r1, int r2) {
            r0 = this;
            androidx.transition.m.a(r1, r2)
            return
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsBase
    public void transformMatrixToGlobal(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.graphics.Matrix r2) {
            r0 = this;
            androidx.transition.j.a(r1, r2)
            return
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsBase
    public void transformMatrixToLocal(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.graphics.Matrix r2) {
            r0 = this;
            androidx.transition.k.a(r1, r2)
            return
    }
}
