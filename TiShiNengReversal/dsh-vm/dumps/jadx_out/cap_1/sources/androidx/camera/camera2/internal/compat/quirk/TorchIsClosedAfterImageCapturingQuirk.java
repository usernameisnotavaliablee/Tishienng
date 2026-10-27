package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TorchIsClosedAfterImageCapturingQuirk implements androidx.camera.core.impl.Quirk {
    public static final java.util.List<java.lang.String> BUILD_MODELS = null;

    static {
            java.lang.String r4 = "redmi 5a"
            java.lang.String r5 = "redmi 6 pro"
            java.lang.String r0 = "mi a1"
            java.lang.String r1 = "mi a2"
            java.lang.String r2 = "mi a2 lite"
            java.lang.String r3 = "redmi 4x"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            java.util.List r0 = java.util.Arrays.asList(r0)
            androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.BUILD_MODELS = r0
            return
    }

    public TorchIsClosedAfterImageCapturingQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean load() {
            java.util.List<java.lang.String> r0 = androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.BUILD_MODELS
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r2)
            boolean r0 = r0.contains(r1)
            return r0
    }
}
