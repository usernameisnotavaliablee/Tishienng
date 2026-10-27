package com.google.android.material.drawable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ScaledDrawableWrapper extends androidx.appcompat.graphics.drawable.DrawableWrapperCompat {
    private final int height;
    private final int width;

    public ScaledDrawableWrapper(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            r0.width = r2
            r0.height = r3
            return
    }

    public int getIntrinsicHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    public int getIntrinsicWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }
}
