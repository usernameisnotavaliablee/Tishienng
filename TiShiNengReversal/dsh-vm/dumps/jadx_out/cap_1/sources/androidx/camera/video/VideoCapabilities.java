package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface VideoCapabilities {

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final androidx.camera.video.VideoCapabilities EMPTY = null;


    static {
            androidx.camera.video.VideoCapabilities$1 r0 = new androidx.camera.video.VideoCapabilities$1
            r0.<init>()
            androidx.camera.video.VideoCapabilities.EMPTY = r0
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy findHighestSupportedEncoderProfilesFor(@androidx.annotation.NonNull android.util.Size r1, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r2);

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    androidx.camera.video.Quality findHighestSupportedQualityFor(@androidx.annotation.NonNull android.util.Size r1, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r2);

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy getProfiles(@androidx.annotation.NonNull androidx.camera.video.Quality r1, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r2);

    @androidx.annotation.NonNull
    java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges();

    @androidx.annotation.NonNull
    java.util.List<androidx.camera.video.Quality> getSupportedQualities(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r1);

    boolean isQualitySupported(@androidx.annotation.NonNull androidx.camera.video.Quality r1, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r2);
}
