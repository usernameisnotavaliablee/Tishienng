package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class JpegHalCorruptImageQuirk implements androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk {
    private static final java.util.Set<java.lang.String> KNOWN_AFFECTED_DEVICES = null;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "heroqltetmo"
            java.lang.String r2 = "k61v1_basic_ref"
            java.lang.String r3 = "heroqltevzw"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk.KNOWN_AFFECTED_DEVICES = r0
            return
    }

    public JpegHalCorruptImageQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean load(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2) {
            java.util.Set<java.lang.String> r2 = androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk.KNOWN_AFFECTED_DEVICES
            java.lang.String r0 = android.os.Build.DEVICE
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r1)
            boolean r2 = r2.contains(r0)
            return r2
    }
}
