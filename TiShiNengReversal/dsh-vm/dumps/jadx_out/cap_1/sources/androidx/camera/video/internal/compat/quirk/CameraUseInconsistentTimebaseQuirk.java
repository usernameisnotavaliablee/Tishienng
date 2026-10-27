package androidx.camera.video.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CameraUseInconsistentTimebaseQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Set<java.lang.String> BUILD_HARDWARE_SET = null;
    private static final java.util.Set<java.lang.String> BUILD_MODEL_SET = null;
    private static final java.util.Set<java.lang.String> BUILD_SOC_MODEL_SET = null;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "samsungexynos7870"
            java.lang.String r2 = "qcom"
            java.lang.String r3 = "samsungexynos7570"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.BUILD_HARDWARE_SET = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "sm4350"
            java.lang.String r2 = "sm6375"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.BUILD_SOC_MODEL_SET = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "m2007j20cg"
            java.lang.String r2 = "m2007j20ct"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.BUILD_MODEL_SET = r0
            return
    }

    public CameraUseInconsistentTimebaseQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean isAffectedModel() {
            java.util.Set<java.lang.String> r0 = androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.BUILD_MODEL_SET
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r1 = r1.toLowerCase()
            boolean r0 = r0.contains(r1)
            return r0
    }

    private static boolean isAffectedSamsungDevice() {
            java.lang.String r0 = "SAMSUNG"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1a
            java.util.Set<java.lang.String> r0 = androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.BUILD_HARDWARE_SET
            java.lang.String r1 = android.os.Build.HARDWARE
            java.lang.String r1 = r1.toLowerCase()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    static boolean load() {
            boolean r0 = usesAffectedSoc()
            if (r0 != 0) goto L15
            boolean r0 = isAffectedSamsungDevice()
            if (r0 != 0) goto L15
            boolean r0 = isAffectedModel()
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    private static boolean usesAffectedSoc() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L18
            java.util.Set<java.lang.String> r0 = androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.BUILD_SOC_MODEL_SET
            java.lang.String r1 = androidx.camera.video.internal.compat.quirk.a.a()
            java.lang.String r1 = r1.toLowerCase()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L18
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
    }
}
