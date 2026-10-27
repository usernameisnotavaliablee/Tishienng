package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class StillCaptureFlow {
    private final boolean mShouldStopRepeatingBeforeStillCapture;

    public StillCaptureFlow() {
            r1 = this;
            r1.<init>()
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(r0)
            androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk r0 = (androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk) r0
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            r1.mShouldStopRepeatingBeforeStillCapture = r0
            return
    }

    public boolean shouldStopRepeatingBeforeCapture(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CaptureRequest> r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.mShouldStopRepeatingBeforeStillCapture
            r1 = 0
            if (r0 == 0) goto L2c
            if (r4 != 0) goto L8
            goto L2c
        L8:
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2c
            java.lang.Object r4 = r3.next()
            android.hardware.camera2.CaptureRequest r4 = (android.hardware.camera2.CaptureRequest) r4
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            java.lang.Object r4 = r4.get(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0 = 2
            if (r4 == r0) goto L2a
            r0 = 3
            if (r4 != r0) goto Lc
        L2a:
            r3 = 1
            return r3
        L2c:
            return r1
    }
}
