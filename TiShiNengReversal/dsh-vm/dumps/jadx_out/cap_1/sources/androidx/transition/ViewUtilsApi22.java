package androidx.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(22)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ViewUtilsApi22 extends androidx.transition.ViewUtilsApi21 {
    private static boolean sTryHiddenSetLeftTopRightBottom = true;

    static {
            return
    }

    ViewUtilsApi22() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.transition.ViewUtilsBase
    @android.annotation.SuppressLint({"NewApi"})
    public void setLeftTopRightBottom(@androidx.annotation.NonNull android.view.View r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            boolean r0 = androidx.transition.ViewUtilsApi22.sTryHiddenSetLeftTopRightBottom
            if (r0 == 0) goto Lb
            androidx.transition.l.a(r2, r3, r4, r5, r6)     // Catch: java.lang.NoSuchMethodError -> L8
            return
        L8:
            r2 = 0
            androidx.transition.ViewUtilsApi22.sTryHiddenSetLeftTopRightBottom = r2
        Lb:
            return
    }
}
