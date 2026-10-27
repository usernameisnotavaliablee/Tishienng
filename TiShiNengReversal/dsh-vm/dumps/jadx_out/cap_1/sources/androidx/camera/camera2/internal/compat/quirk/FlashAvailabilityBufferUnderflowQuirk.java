package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Set<android.util.Pair<java.lang.String, java.lang.String>> KNOWN_AFFECTED_MODELS = null;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.KNOWN_AFFECTED_MODELS = r0
            java.lang.String r0 = "lemp"
            java.lang.String r1 = "sprd"
            addAffectedDevice(r1, r0)
            java.lang.String r0 = "DM20C"
            addAffectedDevice(r1, r0)
            return
    }

    public FlashAvailabilityBufferUnderflowQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addAffectedDevice(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.String r4) {
            java.util.Set<android.util.Pair<java.lang.String, java.lang.String>> r0 = androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.KNOWN_AFFECTED_MODELS
            android.util.Pair r1 = new android.util.Pair
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r2)
            java.lang.String r4 = r4.toLowerCase(r2)
            r1.<init>(r3, r4)
            r0.add(r1)
            return
    }

    static boolean load() {
            java.util.Set<android.util.Pair<java.lang.String, java.lang.String>> r0 = androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.KNOWN_AFFECTED_MODELS
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r3)
            java.lang.String r4 = android.os.Build.MODEL
            java.lang.String r3 = r4.toLowerCase(r3)
            r1.<init>(r2, r3)
            boolean r0 = r0.contains(r1)
            return r0
    }
}
