package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class MeteringPoint {
    private float mNormalizedX;
    private float mNormalizedY;
    private float mSize;

    @androidx.annotation.Nullable
    private android.util.Rational mSurfaceAspectRatio;

    MeteringPoint(float r1, float r2, float r3, @androidx.annotation.Nullable android.util.Rational r4) {
            r0 = this;
            r0.<init>()
            r0.mNormalizedX = r1
            r0.mNormalizedY = r2
            r0.mSize = r3
            r0.mSurfaceAspectRatio = r4
            return
    }

    public float getSize() {
            r1 = this;
            float r0 = r1.mSize
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public android.util.Rational getSurfaceAspectRatio() {
            r1 = this;
            android.util.Rational r0 = r1.mSurfaceAspectRatio
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public float getX() {
            r1 = this;
            float r0 = r1.mNormalizedX
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public float getY() {
            r1 = this;
            float r0 = r1.mNormalizedY
            return r0
    }
}
