package androidx.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(19)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ViewUtilsApi19 extends androidx.transition.ViewUtilsBase {
    private static boolean sTryHiddenTransitionAlpha = true;

    static {
            return
    }

    ViewUtilsApi19() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.transition.ViewUtilsBase
    public void clearNonTransitionAlpha(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            return
    }

    @Override // androidx.transition.ViewUtilsBase
    @android.annotation.SuppressLint({"NewApi"})
    public float getTransitionAlpha(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            boolean r0 = androidx.transition.ViewUtilsApi19.sTryHiddenTransitionAlpha
            if (r0 == 0) goto Lc
            float r2 = androidx.transition.h.a(r2)     // Catch: java.lang.NoSuchMethodError -> L9
            return r2
        L9:
            r0 = 0
            androidx.transition.ViewUtilsApi19.sTryHiddenTransitionAlpha = r0
        Lc:
            float r2 = r2.getAlpha()
            return r2
    }

    @Override // androidx.transition.ViewUtilsBase
    public void saveNonTransitionAlpha(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            return
    }

    @Override // androidx.transition.ViewUtilsBase
    @android.annotation.SuppressLint({"NewApi"})
    public void setTransitionAlpha(@androidx.annotation.NonNull android.view.View r2, float r3) {
            r1 = this;
            boolean r0 = androidx.transition.ViewUtilsApi19.sTryHiddenTransitionAlpha
            if (r0 == 0) goto Lb
            androidx.transition.g.a(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L8
            return
        L8:
            r0 = 0
            androidx.transition.ViewUtilsApi19.sTryHiddenTransitionAlpha = r0
        Lb:
            r2.setAlpha(r3)
            return
    }
}
