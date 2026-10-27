package androidx.camera.core.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ExifRotationAvailability {
    public ExifRotationAvailability() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean isRotationOptionSupported() {
            r2 = this;
            java.lang.Class<androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk> r0 = androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.core.internal.compat.quirk.DeviceQuirks.get(r0)
            androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk r0 = (androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk) r0
            if (r0 == 0) goto L15
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION
            boolean r0 = r0.isSupported(r1)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    public boolean shouldUseExifOrientation(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r2) {
            r1 = this;
            boolean r0 = r1.isRotationOptionSupported()
            if (r0 == 0) goto L10
            int r2 = r2.getFormat()
            r0 = 256(0x100, float:3.59E-43)
            if (r2 != r0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }
}
