package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CrashWhenTakingPhotoWithAutoFlashAEModeQuirk implements androidx.camera.core.impl.Quirk {
    static final java.util.List<java.lang.String> AFFECTED_MODELS = null;

    static {
            java.lang.String r12 = "SM-J510FN"
            java.lang.String r13 = "5059X"
            java.lang.String r0 = "SM-A3000"
            java.lang.String r1 = "SM-A3009"
            java.lang.String r2 = "SM-A300F"
            java.lang.String r3 = "SM-A300FU"
            java.lang.String r4 = "SM-A300G"
            java.lang.String r5 = "SM-A300H"
            java.lang.String r6 = "SM-A300M"
            java.lang.String r7 = "SM-A300X"
            java.lang.String r8 = "SM-A300XU"
            java.lang.String r9 = "SM-A300XZ"
            java.lang.String r10 = "SM-A300Y"
            java.lang.String r11 = "SM-A300YZ"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            java.util.List r0 = java.util.Arrays.asList(r0)
            androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.AFFECTED_MODELS = r0
            return
    }

    public CrashWhenTakingPhotoWithAutoFlashAEModeQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean load() {
            java.util.List<java.lang.String> r0 = androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.AFFECTED_MODELS
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r2)
            boolean r0 = r0.contains(r1)
            return r0
    }
}
