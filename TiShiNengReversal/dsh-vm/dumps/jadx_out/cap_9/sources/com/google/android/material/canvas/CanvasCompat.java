package com.google.android.material.canvas;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class CanvasCompat {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface CanvasOperation {
        void run(@androidx.annotation.NonNull android.graphics.Canvas r1);
    }

    private CanvasCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int saveLayerAlpha(@androidx.annotation.NonNull android.graphics.Canvas r9, float r10, float r11, float r12, float r13, int r14) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 <= r1) goto Lb
            int r9 = r9.saveLayerAlpha(r10, r11, r12, r13, r14)
            return r9
        Lb:
            r8 = 31
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            int r9 = r2.saveLayerAlpha(r3, r4, r5, r6, r7, r8)
            return r9
    }

    public static int saveLayerAlpha(@androidx.annotation.NonNull android.graphics.Canvas r2, @androidx.annotation.Nullable android.graphics.RectF r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 <= r1) goto Lb
            int r2 = r2.saveLayerAlpha(r3, r4)
            return r2
        Lb:
            r0 = 31
            int r2 = r2.saveLayerAlpha(r3, r4, r0)
            return r2
    }
}
