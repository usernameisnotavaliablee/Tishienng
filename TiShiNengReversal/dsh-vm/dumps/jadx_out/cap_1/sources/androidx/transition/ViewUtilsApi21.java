package androidx.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ViewUtilsApi21 extends androidx.transition.ViewUtilsApi19 {
    private static boolean sTryHiddenSetAnimationMatrix = true;
    private static boolean sTryHiddenTransformMatrixToGlobal = true;
    private static boolean sTryHiddenTransformMatrixToLocal = true;

    static {
            return
    }

    ViewUtilsApi21() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.transition.ViewUtilsBase
    @android.annotation.SuppressLint({"NewApi"})
    public void setAnimationMatrix(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable android.graphics.Matrix r3) {
            r1 = this;
            boolean r0 = androidx.transition.ViewUtilsApi21.sTryHiddenSetAnimationMatrix
            if (r0 == 0) goto Lb
            androidx.transition.i.a(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L8
            return
        L8:
            r2 = 0
            androidx.transition.ViewUtilsApi21.sTryHiddenSetAnimationMatrix = r2
        Lb:
            return
    }

    @Override // androidx.transition.ViewUtilsBase
    @android.annotation.SuppressLint({"NewApi"})
    public void transformMatrixToGlobal(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.graphics.Matrix r3) {
            r1 = this;
            boolean r0 = androidx.transition.ViewUtilsApi21.sTryHiddenTransformMatrixToGlobal
            if (r0 == 0) goto Lb
            androidx.transition.j.a(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L8
            return
        L8:
            r2 = 0
            androidx.transition.ViewUtilsApi21.sTryHiddenTransformMatrixToGlobal = r2
        Lb:
            return
    }

    @Override // androidx.transition.ViewUtilsBase
    @android.annotation.SuppressLint({"NewApi"})
    public void transformMatrixToLocal(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.graphics.Matrix r3) {
            r1 = this;
            boolean r0 = androidx.transition.ViewUtilsApi21.sTryHiddenTransformMatrixToLocal
            if (r0 == 0) goto Lb
            androidx.transition.k.a(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L8
            return
        L8:
            r2 = 0
            androidx.transition.ViewUtilsApi21.sTryHiddenTransformMatrixToLocal = r2
        Lb:
            return
    }
}
