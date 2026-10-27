package androidx.camera.video.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ReportedVideoQualityNotSupportedQuirk implements androidx.camera.video.internal.compat.quirk.VideoQualityQuirk {
    public ReportedVideoQualityNotSupportedQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean isHuaweiMate20() {
            java.lang.String r0 = "Huawei"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "HMA-L29"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isHuaweiMate20Pro() {
            java.lang.String r0 = "Huawei"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "LYA-AL00"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isHuaweiP40Lite() {
            java.lang.String r0 = "Huawei"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L30
            java.lang.String r6 = "JNY-L22B"
            java.lang.String r7 = "JNY-LX1"
            java.lang.String r1 = "JNY-L21A"
            java.lang.String r2 = "JNY-L01A"
            java.lang.String r3 = "JNY-L21B"
            java.lang.String r4 = "JNY-L22A"
            java.lang.String r5 = "JNY-L02A"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r2)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L30
            r0 = 1
            return r0
        L30:
            r0 = 0
            return r0
    }

    private static boolean isVivoY91i() {
            java.lang.String r0 = "Vivo"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L17
            java.lang.String r0 = "vivo 1820"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L17
            r0 = 1
            return r0
        L17:
            r0 = 0
            return r0
    }

    static boolean load() {
            boolean r0 = isHuaweiMate20()
            if (r0 != 0) goto L1b
            boolean r0 = isHuaweiMate20Pro()
            if (r0 != 0) goto L1b
            boolean r0 = isVivoY91i()
            if (r0 != 0) goto L1b
            boolean r0 = isHuaweiP40Lite()
            if (r0 == 0) goto L19
            goto L1b
        L19:
            r0 = 0
            return r0
        L1b:
            r0 = 1
            return r0
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public boolean isProblematicVideoQuality(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r4, @androidx.annotation.NonNull androidx.camera.video.Quality r5) {
            r3 = this;
            boolean r0 = isHuaweiMate20()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L36
            boolean r0 = isHuaweiMate20Pro()
            if (r0 == 0) goto Lf
            goto L36
        Lf:
            boolean r0 = isVivoY91i()
            if (r0 == 0) goto L20
            androidx.camera.video.Quality r4 = androidx.camera.video.Quality.HD
            if (r5 == r4) goto L1f
            androidx.camera.video.Quality r4 = androidx.camera.video.Quality.FHD
            if (r5 != r4) goto L1e
            goto L1f
        L1e:
            return r2
        L1f:
            return r1
        L20:
            boolean r0 = isHuaweiP40Lite()
            if (r0 == 0) goto L35
            int r4 = r4.getLensFacing()
            if (r4 != 0) goto L35
            androidx.camera.video.Quality r4 = androidx.camera.video.Quality.FHD
            if (r5 == r4) goto L34
            androidx.camera.video.Quality r4 = androidx.camera.video.Quality.HD
            if (r5 != r4) goto L35
        L34:
            return r1
        L35:
            return r2
        L36:
            androidx.camera.video.Quality r4 = androidx.camera.video.Quality.UHD
            if (r5 != r4) goto L3b
            return r1
        L3b:
            return r2
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public boolean workaroundBySurfaceProcessing() {
            r1 = this;
            boolean r0 = isHuaweiMate20()
            if (r0 != 0) goto L15
            boolean r0 = isHuaweiMate20Pro()
            if (r0 != 0) goto L15
            boolean r0 = isHuaweiP40Lite()
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }
}
