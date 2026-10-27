package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Nexus4AndroidLTargetAspectRatioQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.List<java.lang.String> DEVICE_MODELS = null;

    static {
            java.lang.String r0 = "NEXUS 4"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.DEVICE_MODELS = r0
            return
    }

    public Nexus4AndroidLTargetAspectRatioQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean load() {
            java.lang.String r0 = "GOOGLE"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L22
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L22
            java.util.List<java.lang.String> r0 = androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.DEVICE_MODELS
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r2)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L22
            r0 = 1
            return r0
        L22:
            r0 = 0
            return r0
    }

    public int getCorrectedAspectRatio() {
            r1 = this;
            r0 = 2
            return r0
    }
}
