package com.google.mlkit.vision.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class PointF3D {
    public PointF3D() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static com.google.mlkit.vision.common.PointF3D from(float r1, float r2, float r3) {
            com.google.mlkit.vision.common.zza r0 = new com.google.mlkit.vision.common.zza
            r0.<init>(r1, r2, r3)
            return r0
    }

    public abstract float getX();

    public abstract float getY();

    public abstract float getZ();
}
