package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AeFpsRange {

    @androidx.annotation.Nullable
    private final android.util.Range<java.lang.Integer> mAeTargetFpsRange;

    public AeFpsRange(@androidx.annotation.NonNull androidx.camera.core.impl.Quirks r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk.class
            androidx.camera.core.impl.Quirk r2 = r2.get(r0)
            androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk r2 = (androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk) r2
            if (r2 != 0) goto L11
            r2 = 0
            r1.mAeTargetFpsRange = r2
            return
        L11:
            android.util.Range r2 = r2.getRange()
            r1.mAeTargetFpsRange = r2
            return
    }

    public void addAeFpsRangeOptions(@androidx.annotation.NonNull androidx.camera.camera2.impl.Camera2ImplConfig.Builder r3) {
            r2 = this;
            android.util.Range<java.lang.Integer> r0 = r2.mAeTargetFpsRange
            if (r0 == 0) goto L9
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
            r3.setCaptureRequestOption(r1, r0)
        L9:
            return
    }
}
