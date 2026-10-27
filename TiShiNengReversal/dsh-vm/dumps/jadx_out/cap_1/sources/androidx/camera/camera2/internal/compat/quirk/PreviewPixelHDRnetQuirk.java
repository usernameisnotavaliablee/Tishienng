package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class PreviewPixelHDRnetQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.List<java.lang.String> SUPPORTED_DEVICES = null;

    static {
            java.lang.String r0 = "redfin"
            java.lang.String r1 = "barbet"
            java.lang.String r2 = "sunfish"
            java.lang.String r3 = "bramble"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.util.List r0 = java.util.Arrays.asList(r0)
            androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk.SUPPORTED_DEVICES = r0
            return
    }

    public PreviewPixelHDRnetQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean load() {
            java.lang.String r0 = "Google"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            java.util.List<java.lang.String> r0 = androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk.SUPPORTED_DEVICES
            java.lang.String r1 = android.os.Build.DEVICE
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.toLowerCase(r2)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1e
            r0 = 1
            return r0
        L1e:
            r0 = 0
            return r0
    }
}
