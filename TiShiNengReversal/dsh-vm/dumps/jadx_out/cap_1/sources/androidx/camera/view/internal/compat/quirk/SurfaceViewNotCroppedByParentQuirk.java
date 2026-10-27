package androidx.camera.view.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SurfaceViewNotCroppedByParentQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.lang.String RED_MI_NOTE_10_MODEL = "M2101K7AG";
    private static final java.lang.String XIAOMI = "XIAOMI";

    public SurfaceViewNotCroppedByParentQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean load() {
            java.lang.String r0 = "XIAOMI"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "M2101K7AG"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }
}
