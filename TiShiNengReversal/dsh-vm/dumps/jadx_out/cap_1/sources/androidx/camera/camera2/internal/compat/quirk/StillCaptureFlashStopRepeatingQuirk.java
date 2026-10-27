package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class StillCaptureFlashStopRepeatingQuirk implements androidx.camera.core.impl.Quirk {
    public StillCaptureFlashStopRepeatingQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean load() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r2 = "SAMSUNG"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L20
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r1 = "SM-A716"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L20
            r0 = 1
            return r0
        L20:
            r0 = 0
            return r0
    }
}
