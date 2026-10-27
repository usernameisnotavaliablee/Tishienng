package androidx.camera.core.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CaptureFailedRetryEnabler {
    private final androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk mCaptureFailedRetryQuirk;

    public CaptureFailedRetryEnabler() {
            r1 = this;
            r1.<init>()
            java.lang.Class<androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk> r0 = androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.core.internal.compat.quirk.DeviceQuirks.get(r0)
            androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk r0 = (androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk) r0
            r1.mCaptureFailedRetryQuirk = r0
            return
    }

    public int getRetryCount() {
            r1 = this;
            androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk r0 = r1.mCaptureFailedRetryQuirk
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.getRetryCount()
            return r0
    }
}
