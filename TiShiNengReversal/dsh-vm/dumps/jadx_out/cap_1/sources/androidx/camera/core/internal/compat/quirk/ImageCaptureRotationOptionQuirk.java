package androidx.camera.core.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ImageCaptureRotationOptionQuirk implements androidx.camera.core.impl.Quirk {
    public ImageCaptureRotationOptionQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean isEmulator() {
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "generic"
            boolean r2 = r0.startsWith(r1)
            if (r2 != 0) goto L63
            java.lang.String r2 = "unknown"
            boolean r0 = r0.startsWith(r2)
            if (r0 != 0) goto L63
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r2 = "google_sdk"
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L63
            java.lang.String r3 = "Emulator"
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L63
            java.lang.String r3 = "Cuttlefish"
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L63
            java.lang.String r3 = "Android SDK built for x86"
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L63
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r3 = "Genymotion"
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L63
            java.lang.String r0 = android.os.Build.BRAND
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L4e
            java.lang.String r0 = android.os.Build.DEVICE
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L63
        L4e:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L63
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "ranchu"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L61
            goto L63
        L61:
            r0 = 0
            return r0
        L63:
            r0 = 1
            return r0
    }

    private static boolean isEmulatorAndApi21() {
            boolean r0 = isEmulator()
            if (r0 == 0) goto Le
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 != r1) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    private static boolean isHonor9X() {
            java.lang.String r0 = "HONOR"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "STK-LX1"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isHuaweiMate20Lite() {
            java.lang.String r0 = "HUAWEI"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "SNE-LX1"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    static boolean load() {
            boolean r0 = isHuaweiMate20Lite()
            if (r0 != 0) goto L15
            boolean r0 = isHonor9X()
            if (r0 != 0) goto L15
            boolean r0 = isEmulatorAndApi21()
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    public boolean isSupported(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<?> r2) {
            r1 = this;
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION
            if (r2 == r0) goto L6
            r2 = 1
            return r2
        L6:
            r2 = 0
            return r2
    }
}
