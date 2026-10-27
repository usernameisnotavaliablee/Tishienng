package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class y0 {
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static androidx.camera.video.VideoCapabilities a(androidx.camera.video.VideoOutput r0, @androidx.annotation.NonNull androidx.camera.core.CameraInfo r1) {
            androidx.camera.video.VideoCapabilities r0 = androidx.camera.video.VideoCapabilities.EMPTY
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static androidx.camera.core.impl.Observable b(androidx.camera.video.VideoOutput r0) {
            r0 = 0
            androidx.camera.core.impl.Observable r0 = androidx.camera.core.impl.ConstantObservable.withValue(r0)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static androidx.camera.core.impl.Observable c(androidx.camera.video.VideoOutput r0) {
            androidx.camera.core.impl.Observable<androidx.camera.video.StreamInfo> r0 = androidx.camera.video.StreamInfo.ALWAYS_ACTIVE_OBSERVABLE
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static void d(androidx.camera.video.VideoOutput r0, @androidx.annotation.NonNull androidx.camera.video.VideoOutput.SourceState r1) {
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static void e(androidx.camera.video.VideoOutput r0, @androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r1, @androidx.annotation.NonNull androidx.camera.core.impl.Timebase r2) {
            r0.onSurfaceRequested(r1)
            return
    }
}
