package androidx.camera.core.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DeviceQuirksLoader {
    private DeviceQuirksLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    static java.util.List<androidx.camera.core.impl.Quirk> loadQuirks() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk.load()
            if (r1 == 0) goto L13
            androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk r1 = new androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk
            r1.<init>()
            r0.add(r1)
        L13:
            boolean r1 = androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk.load()
            if (r1 == 0) goto L21
            androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk r1 = new androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk
            r1.<init>()
            r0.add(r1)
        L21:
            boolean r1 = androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk.load()
            if (r1 == 0) goto L2f
            androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk r1 = new androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk
            r1.<init>()
            r0.add(r1)
        L2f:
            boolean r1 = androidx.camera.core.internal.compat.quirk.LowMemoryQuirk.load()
            if (r1 == 0) goto L3d
            androidx.camera.core.internal.compat.quirk.LowMemoryQuirk r1 = new androidx.camera.core.internal.compat.quirk.LowMemoryQuirk
            r1.<init>()
            r0.add(r1)
        L3d:
            boolean r1 = androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk.load()
            if (r1 == 0) goto L4b
            androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk r1 = new androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk
            r1.<init>()
            r0.add(r1)
        L4b:
            boolean r1 = androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.load()
            if (r1 == 0) goto L59
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk r1 = new androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk
            r1.<init>()
            r0.add(r1)
        L59:
            return r0
    }
}
