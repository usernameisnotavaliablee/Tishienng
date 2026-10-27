package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class FlashTooSlowQuirk implements androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk {
    private static final java.util.List<java.lang.String> AFFECTED_MODEL_PREFIXES = null;

    static {
            java.lang.String r0 = "PIXEL 5"
            java.lang.String r1 = "SM-A320"
            java.lang.String r2 = "PIXEL 3A"
            java.lang.String r3 = "PIXEL 3A XL"
            java.lang.String r4 = "PIXEL 4"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            java.util.List r0 = java.util.Arrays.asList(r0)
            androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk.AFFECTED_MODEL_PREFIXES = r0
            return
    }

    public FlashTooSlowQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean isAffectedModel() {
            java.util.List<java.lang.String> r0 = androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk.AFFECTED_MODEL_PREFIXES
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = android.os.Build.MODEL
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toUpperCase(r3)
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L6
            r0 = 1
            return r0
        L22:
            r0 = 0
            return r0
    }

    static boolean load(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r1) {
            boolean r0 = isAffectedModel()
            if (r0 == 0) goto L16
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0 = 1
            if (r1 != r0) goto L16
            return r0
        L16:
            r1 = 0
            return r1
    }
}
