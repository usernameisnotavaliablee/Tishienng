package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class MaxPreviewSize {

    @androidx.annotation.Nullable
    private final androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk mExtraCroppingQuirk;

    public MaxPreviewSize() {
            r1 = this;
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(r0)
            androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk r0 = (androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk) r0
            r1.<init>(r0)
            return
    }

    @androidx.annotation.VisibleForTesting
    MaxPreviewSize(@androidx.annotation.Nullable androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk r1) {
            r0 = this;
            r0.<init>()
            r0.mExtraCroppingQuirk = r1
            return
    }

    @androidx.annotation.NonNull
    public android.util.Size getMaxPreviewResolution(@androidx.annotation.NonNull android.util.Size r5) {
            r4 = this;
            androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk r0 = r4.mExtraCroppingQuirk
            if (r0 != 0) goto L5
            goto Ld
        L5:
            androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV
            android.util.Size r0 = r0.getVerifiedResolution(r1)
            if (r0 != 0) goto Le
        Ld:
            return r5
        Le:
            int r1 = r0.getWidth()
            int r2 = r0.getHeight()
            int r1 = r1 * r2
            int r2 = r5.getWidth()
            int r3 = r5.getHeight()
            int r2 = r2 * r3
            if (r1 <= r2) goto L25
            return r0
        L25:
            return r5
    }
}
