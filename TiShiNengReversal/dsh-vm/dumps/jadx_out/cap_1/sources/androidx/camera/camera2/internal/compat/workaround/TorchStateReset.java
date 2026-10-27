package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TorchStateReset {
    private final boolean mIsImageCaptureTorchIsClosedQuirkEnabled;

    public TorchStateReset() {
            r1 = this;
            r1.<init>()
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(r0)
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            r1.mIsImageCaptureTorchIsClosedQuirkEnabled = r0
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
    public androidx.camera.core.impl.CaptureConfig createTorchResetRequest(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r4) {
            r3 = this;
            androidx.camera.core.impl.CaptureConfig$Builder r0 = new androidx.camera.core.impl.CaptureConfig$Builder
            r0.<init>()
            int r1 = r4.getTemplateType()
            r0.setTemplateType(r1)
            java.util.List r1 = r4.getSurfaces()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()
            androidx.camera.core.impl.DeferrableSurface r2 = (androidx.camera.core.impl.DeferrableSurface) r2
            r0.addSurface(r2)
            goto L14
        L24:
            androidx.camera.core.impl.Config r4 = r4.getImplementationOptions()
            r0.addImplementationOptions(r4)
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r4 = new androidx.camera.camera2.impl.Camera2ImplConfig$Builder
            r4.<init>()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.setCaptureRequestOption(r1, r2)
            androidx.camera.camera2.impl.Camera2ImplConfig r4 = r4.build()
            r0.addImplementationOptions(r4)
            androidx.camera.core.impl.CaptureConfig r4 = r0.build()
            return r4
    }

    public boolean isTorchResetRequired(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CaptureRequest> r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.mIsImageCaptureTorchIsClosedQuirkEnabled
            if (r0 == 0) goto L29
            if (r3 == 0) goto L29
            java.util.Iterator r2 = r2.iterator()
        La:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r3 = r2.next()
            android.hardware.camera2.CaptureRequest r3 = (android.hardware.camera2.CaptureRequest) r3
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Object r3 = r3.get(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto La
            int r3 = r3.intValue()
            r0 = 2
            if (r3 != r0) goto La
            r2 = 1
            return r2
        L29:
            r2 = 0
            return r2
    }
}
