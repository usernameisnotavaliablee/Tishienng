package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class OverrideAeModeForStillCapture {
    private boolean mAePrecaptureStarted;
    private final boolean mHasAutoFlashUnderExposedQuirk;

    public OverrideAeModeForStillCapture(@androidx.annotation.NonNull androidx.camera.core.impl.Quirks r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mAePrecaptureStarted = r0
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk> r1 = androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk.class
            androidx.camera.core.impl.Quirk r3 = r3.get(r1)
            if (r3 == 0) goto Lf
            r0 = 1
        Lf:
            r2.mHasAutoFlashUnderExposedQuirk = r0
            return
    }

    public void onAePrecaptureFinished() {
            r1 = this;
            r0 = 0
            r1.mAePrecaptureStarted = r0
            return
    }

    public void onAePrecaptureStarted() {
            r1 = this;
            r0 = 1
            r1.mAePrecaptureStarted = r0
            return
    }

    public boolean shouldSetAeModeAlwaysFlash(int r2) {
            r1 = this;
            boolean r0 = r1.mAePrecaptureStarted
            if (r0 == 0) goto Lc
            if (r2 != 0) goto Lc
            boolean r2 = r1.mHasAutoFlashUnderExposedQuirk
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }
}
