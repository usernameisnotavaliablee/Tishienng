package androidx.camera.video.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class VideoEncoderCrashQuirk implements androidx.camera.video.internal.compat.quirk.VideoQualityQuirk {
    public VideoEncoderCrashQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean isPositivoTwist2Pro() {
            java.lang.String r0 = "positivo"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "twist 2 pro"
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
            boolean r0 = isPositivoTwist2Pro()
            return r0
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public boolean isProblematicVideoQuality(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r3, @androidx.annotation.NonNull androidx.camera.video.Quality r4) {
            r2 = this;
            boolean r0 = isPositivoTwist2Pro()
            r1 = 0
            if (r0 == 0) goto L13
            int r3 = r3.getLensFacing()
            if (r3 != 0) goto L13
            androidx.camera.video.Quality r3 = androidx.camera.video.Quality.SD
            if (r4 != r3) goto L13
            r3 = 1
            return r3
        L13:
            return r1
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public boolean workaroundBySurfaceProcessing() {
            r1 = this;
            r0 = 0
            return r0
    }
}
