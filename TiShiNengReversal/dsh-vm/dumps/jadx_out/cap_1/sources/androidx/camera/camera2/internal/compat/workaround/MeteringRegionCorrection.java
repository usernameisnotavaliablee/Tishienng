package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class MeteringRegionCorrection {
    private final androidx.camera.core.impl.Quirks mCameraQuirks;

    public MeteringRegionCorrection(@androidx.annotation.NonNull androidx.camera.core.impl.Quirks r1) {
            r0 = this;
            r0.<init>()
            r0.mCameraQuirks = r1
            return
    }

    @androidx.annotation.NonNull
    public android.graphics.PointF getCorrectedPoint(@androidx.annotation.NonNull androidx.camera.core.MeteringPoint r3, int r4) {
            r2 = this;
            r0 = 1
            if (r4 != r0) goto L1e
            androidx.camera.core.impl.Quirks r4 = r2.mCameraQuirks
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk.class
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L1e
            android.graphics.PointF r4 = new android.graphics.PointF
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r3.getX()
            float r0 = r0 - r1
            float r3 = r3.getY()
            r4.<init>(r0, r3)
            return r4
        L1e:
            android.graphics.PointF r4 = new android.graphics.PointF
            float r0 = r3.getX()
            float r3 = r3.getY()
            r4.<init>(r0, r3)
            return r4
    }
}
