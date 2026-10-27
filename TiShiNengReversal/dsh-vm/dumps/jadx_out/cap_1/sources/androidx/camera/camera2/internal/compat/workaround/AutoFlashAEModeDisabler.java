package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AutoFlashAEModeDisabler {
    private final boolean mIsCrashWhenTakingPhotoWithAutoFlashAEModeQuirkEnabled;
    private final boolean mIsImageCaptureFailWithAutoFlashQuirkEnabled;

    public AutoFlashAEModeDisabler(@androidx.annotation.NonNull androidx.camera.core.impl.Quirks r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.class
            boolean r2 = r2.contains(r0)
            r1.mIsImageCaptureFailWithAutoFlashQuirkEnabled = r2
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk> r2 = androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class
            androidx.camera.core.impl.Quirk r2 = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(r2)
            if (r2 == 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            r1.mIsCrashWhenTakingPhotoWithAutoFlashAEModeQuirkEnabled = r2
            return
    }

    public int getCorrectedAeMode(int r2) {
            r1 = this;
            boolean r0 = r1.mIsImageCaptureFailWithAutoFlashQuirkEnabled
            if (r0 != 0) goto L8
            boolean r0 = r1.mIsCrashWhenTakingPhotoWithAutoFlashAEModeQuirkEnabled
            if (r0 == 0) goto Lc
        L8:
            r0 = 2
            if (r2 != r0) goto Lc
            r2 = 1
        Lc:
            return r2
    }
}
