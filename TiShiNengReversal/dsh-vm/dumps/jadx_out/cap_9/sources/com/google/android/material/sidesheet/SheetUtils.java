package com.google.android.material.sidesheet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class SheetUtils {
    private SheetUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean isSwipeMostlyHorizontal(float r0, float r1) {
            float r0 = java.lang.Math.abs(r0)
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }
}
