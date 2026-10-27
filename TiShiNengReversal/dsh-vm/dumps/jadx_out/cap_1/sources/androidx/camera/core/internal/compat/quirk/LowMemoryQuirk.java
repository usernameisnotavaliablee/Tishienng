package androidx.camera.core.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class LowMemoryQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Set<java.lang.String> DEVICE_MODELS = null;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "SM-A520W"
            java.lang.String r2 = "MOTOG3"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            androidx.camera.core.internal.compat.quirk.LowMemoryQuirk.DEVICE_MODELS = r0
            return
    }

    public LowMemoryQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean load() {
            java.util.Set<java.lang.String> r0 = androidx.camera.core.internal.compat.quirk.LowMemoryQuirk.DEVICE_MODELS
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r2)
            boolean r0 = r0.contains(r1)
            return r0
    }
}
