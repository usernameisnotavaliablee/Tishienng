package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class MeteringPointFactory {

    @androidx.annotation.Nullable
    private android.util.Rational mSurfaceAspectRatio;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public MeteringPointFactory() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public MeteringPointFactory(@androidx.annotation.Nullable android.util.Rational r1) {
            r0 = this;
            r0.<init>()
            r0.mSurfaceAspectRatio = r1
            return
    }

    public static float getDefaultPointSize() {
            r0 = 1041865114(0x3e19999a, float:0.15)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected abstract android.graphics.PointF convertPoint(float r1, float r2);

    @androidx.annotation.NonNull
    public final androidx.camera.core.MeteringPoint createPoint(float r2, float r3) {
            r1 = this;
            float r0 = getDefaultPointSize()
            androidx.camera.core.MeteringPoint r2 = r1.createPoint(r2, r3, r0)
            return r2
    }

    @androidx.annotation.NonNull
    public final androidx.camera.core.MeteringPoint createPoint(float r3, float r4, float r5) {
            r2 = this;
            android.graphics.PointF r3 = r2.convertPoint(r3, r4)
            androidx.camera.core.MeteringPoint r4 = new androidx.camera.core.MeteringPoint
            float r0 = r3.x
            float r3 = r3.y
            android.util.Rational r1 = r2.mSurfaceAspectRatio
            r4.<init>(r0, r3, r5, r1)
            return r4
    }
}
