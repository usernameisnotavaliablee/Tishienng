package androidx.camera.video.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class EncoderNotUsePersistentInputSurfaceQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.List<java.lang.String> DEVICE_MODELS = null;

    static {
            java.lang.String r0 = "SM-N9208"
            java.lang.String r1 = "SM-G920V"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = java.util.Arrays.asList(r0)
            androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk.DEVICE_MODELS = r0
            return
    }

    public EncoderNotUsePersistentInputSurfaceQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean load() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r0 <= r1) goto L17
            java.util.List<java.lang.String> r0 = androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk.DEVICE_MODELS
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r1 = r1.toUpperCase()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }
}
