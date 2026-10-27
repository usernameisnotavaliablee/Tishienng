package androidx.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(23)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ViewUtilsApi23 extends androidx.transition.ViewUtilsApi22 {
    private static boolean sTryHiddenSetTransitionVisibility = true;

    static {
            return
    }

    ViewUtilsApi23() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.transition.ViewUtilsBase
    @android.annotation.SuppressLint({"NewApi"})
    public void setTransitionVisibility(@androidx.annotation.NonNull android.view.View r3, int r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 != r1) goto La
            super.setTransitionVisibility(r3, r4)
            return
        La:
            boolean r0 = androidx.transition.ViewUtilsApi23.sTryHiddenSetTransitionVisibility
            if (r0 == 0) goto L15
            androidx.transition.m.a(r3, r4)     // Catch: java.lang.NoSuchMethodError -> L12
            return
        L12:
            r3 = 0
            androidx.transition.ViewUtilsApi23.sTryHiddenSetTransitionVisibility = r3
        L15:
            return
    }
}
