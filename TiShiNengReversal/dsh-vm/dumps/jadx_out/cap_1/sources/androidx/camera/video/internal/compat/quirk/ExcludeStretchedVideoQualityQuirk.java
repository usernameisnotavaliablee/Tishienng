package androidx.camera.video.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ExcludeStretchedVideoQualityQuirk implements androidx.camera.video.internal.compat.quirk.VideoQualityQuirk {
    public ExcludeStretchedVideoQualityQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean isSamsungJ4() {
            java.lang.String r0 = "Samsung"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "SM-J400G"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isSamsungJ7Api27Above() {
            java.lang.String r0 = "Samsung"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1c
            java.lang.String r0 = "SM-J710MN"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1c
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L1c
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    private static boolean isSamsungJ7PrimeApi27Above() {
            java.lang.String r0 = "Samsung"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1c
            java.lang.String r0 = "SM-G610M"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1c
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L1c
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    static boolean load() {
            boolean r0 = isSamsungJ4()
            if (r0 != 0) goto L15
            boolean r0 = isSamsungJ7PrimeApi27Above()
            if (r0 != 0) goto L15
            boolean r0 = isSamsungJ7Api27Above()
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public boolean isProblematicVideoQuality(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r3, @androidx.annotation.NonNull androidx.camera.video.Quality r4) {
            r2 = this;
            boolean r3 = isSamsungJ4()
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L13
            androidx.camera.video.Quality r3 = androidx.camera.video.Quality.FHD
            if (r4 == r3) goto L12
            androidx.camera.video.Quality r3 = androidx.camera.video.Quality.UHD
            if (r4 != r3) goto L11
            goto L12
        L11:
            return r1
        L12:
            return r0
        L13:
            boolean r3 = isSamsungJ7PrimeApi27Above()
            if (r3 != 0) goto L21
            boolean r3 = isSamsungJ7Api27Above()
            if (r3 == 0) goto L20
            goto L21
        L20:
            return r1
        L21:
            androidx.camera.video.Quality r3 = androidx.camera.video.Quality.FHD
            if (r4 != r3) goto L26
            return r0
        L26:
            return r1
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public /* synthetic */ boolean workaroundBySurfaceProcessing() {
            r1 = this;
            boolean r0 = androidx.camera.video.internal.compat.quirk.b.a(r1)
            return r0
    }
}
