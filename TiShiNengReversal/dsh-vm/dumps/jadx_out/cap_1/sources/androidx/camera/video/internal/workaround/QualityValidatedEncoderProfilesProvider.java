package androidx.camera.video.internal.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class QualityValidatedEncoderProfilesProvider implements androidx.camera.core.impl.EncoderProfilesProvider {
    private static final java.util.Map<java.lang.Integer, androidx.camera.video.Quality> CAMCORDER_TO_VIDEO_QUALITY_MAP = null;

    @androidx.annotation.NonNull
    private final androidx.camera.core.impl.CameraInfoInternal mCameraInfo;

    @androidx.annotation.NonNull
    private final androidx.camera.core.impl.EncoderProfilesProvider mProvider;

    @androidx.annotation.NonNull
    private final androidx.camera.core.impl.Quirks mQuirks;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.camera.video.internal.workaround.QualityValidatedEncoderProfilesProvider.CAMCORDER_TO_VIDEO_QUALITY_MAP = r0
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            androidx.camera.video.Quality r2 = androidx.camera.video.Quality.HIGHEST
            r0.put(r1, r2)
            r1 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            androidx.camera.video.Quality r2 = androidx.camera.video.Quality.UHD
            r0.put(r1, r2)
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            androidx.camera.video.Quality r2 = androidx.camera.video.Quality.FHD
            r0.put(r1, r2)
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            androidx.camera.video.Quality r2 = androidx.camera.video.Quality.HD
            r0.put(r1, r2)
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            androidx.camera.video.Quality r2 = androidx.camera.video.Quality.SD
            r0.put(r1, r2)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            androidx.camera.video.Quality r2 = androidx.camera.video.Quality.LOWEST
            r0.put(r1, r2)
            return
    }

    public QualityValidatedEncoderProfilesProvider(@androidx.annotation.NonNull androidx.camera.core.impl.EncoderProfilesProvider r1, @androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r2, @androidx.annotation.NonNull androidx.camera.core.impl.Quirks r3) {
            r0 = this;
            r0.<init>()
            r0.mProvider = r1
            r0.mCameraInfo = r2
            r0.mQuirks = r3
            return
    }

    private boolean isDeviceValidQuality(int r4) {
            r3 = this;
            java.util.Map<java.lang.Integer, androidx.camera.video.Quality> r0 = androidx.camera.video.internal.workaround.QualityValidatedEncoderProfilesProvider.CAMCORDER_TO_VIDEO_QUALITY_MAP
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            androidx.camera.video.Quality r4 = (androidx.camera.video.Quality) r4
            if (r4 == 0) goto L38
            androidx.camera.core.impl.Quirks r0 = r3.mQuirks
            java.lang.Class<androidx.camera.video.internal.compat.quirk.VideoQualityQuirk> r1 = androidx.camera.video.internal.compat.quirk.VideoQualityQuirk.class
            java.util.List r0 = r0.getAll(r1)
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            androidx.camera.video.internal.compat.quirk.VideoQualityQuirk r1 = (androidx.camera.video.internal.compat.quirk.VideoQualityQuirk) r1
            if (r1 == 0) goto L1a
            androidx.camera.core.impl.CameraInfoInternal r2 = r3.mCameraInfo
            boolean r2 = r1.isProblematicVideoQuality(r2, r4)
            if (r2 == 0) goto L1a
            boolean r1 = r1.workaroundBySurfaceProcessing()
            if (r1 != 0) goto L1a
            r4 = 0
            return r4
        L38:
            r4 = 1
            return r4
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    @androidx.annotation.Nullable
    public androidx.camera.core.impl.EncoderProfilesProxy getAll(int r2) {
            r1 = this;
            boolean r0 = r1.hasProfile(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            androidx.camera.core.impl.EncoderProfilesProvider r0 = r1.mProvider
            androidx.camera.core.impl.EncoderProfilesProxy r2 = r0.getAll(r2)
            return r2
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int r2) {
            r1 = this;
            androidx.camera.core.impl.EncoderProfilesProvider r0 = r1.mProvider
            boolean r0 = r0.hasProfile(r2)
            if (r0 == 0) goto L10
            boolean r2 = r1.isDeviceValidQuality(r2)
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }
}
