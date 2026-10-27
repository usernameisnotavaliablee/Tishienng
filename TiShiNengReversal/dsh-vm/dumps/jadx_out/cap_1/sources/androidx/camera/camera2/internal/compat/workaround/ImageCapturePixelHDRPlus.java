package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ImageCapturePixelHDRPlus {
    public ImageCapturePixelHDRPlus() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void toggleHDRPlus(int r2, @androidx.annotation.NonNull androidx.camera.camera2.impl.Camera2ImplConfig.Builder r3) {
            r1 = this;
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(r0)
            androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk r0 = (androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk) r0
            if (r0 != 0) goto Lb
            goto L10
        Lb:
            if (r2 == 0) goto L1b
            r0 = 1
            if (r2 == r0) goto L11
        L10:
            return
        L11:
            android.hardware.camera2.CaptureRequest$Key r2 = androidx.camera.camera2.internal.compat.workaround.a.a()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.setCaptureRequestOption(r2, r0)
            return
        L1b:
            android.hardware.camera2.CaptureRequest$Key r2 = androidx.camera.camera2.internal.compat.workaround.a.a()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.setCaptureRequestOption(r2, r0)
            return
    }
}
