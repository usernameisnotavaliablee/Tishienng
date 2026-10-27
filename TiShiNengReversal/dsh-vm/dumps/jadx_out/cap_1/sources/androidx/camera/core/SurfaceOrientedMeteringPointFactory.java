package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SurfaceOrientedMeteringPointFactory extends androidx.camera.core.MeteringPointFactory {
    private final float mHeight;
    private final float mWidth;

    public SurfaceOrientedMeteringPointFactory(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.mWidth = r1
            r0.mHeight = r2
            return
    }

    public SurfaceOrientedMeteringPointFactory(float r1, float r2, @androidx.annotation.NonNull androidx.camera.core.UseCase r3) {
            r0 = this;
            android.util.Rational r3 = getUseCaseAspectRatio(r3)
            r0.<init>(r3)
            r0.mWidth = r1
            r0.mHeight = r2
            return
    }

    @androidx.annotation.Nullable
    private static android.util.Rational getUseCaseAspectRatio(@androidx.annotation.Nullable androidx.camera.core.UseCase r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            android.util.Size r0 = r3.getAttachedSurfaceResolution()
            if (r0 == 0) goto L18
            android.util.Rational r3 = new android.util.Rational
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            r3.<init>(r1, r0)
            return r3
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "UseCase "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " is not bound."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // androidx.camera.core.MeteringPointFactory
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected android.graphics.PointF convertPoint(float r3, float r4) {
            r2 = this;
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r2.mWidth
            float r3 = r3 / r1
            float r1 = r2.mHeight
            float r4 = r4 / r1
            r0.<init>(r3, r4)
            return r0
    }
}
