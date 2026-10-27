package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface VideoOutput {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public enum SourceState extends java.lang.Enum<androidx.camera.video.VideoOutput.SourceState> {
        private static final /* synthetic */ androidx.camera.video.VideoOutput.SourceState[] $VALUES = null;
        public static final androidx.camera.video.VideoOutput.SourceState ACTIVE_NON_STREAMING = null;
        public static final androidx.camera.video.VideoOutput.SourceState ACTIVE_STREAMING = null;
        public static final androidx.camera.video.VideoOutput.SourceState INACTIVE = null;

        private static /* synthetic */ androidx.camera.video.VideoOutput.SourceState[] $values() {
                r0 = 3
                androidx.camera.video.VideoOutput$SourceState[] r0 = new androidx.camera.video.VideoOutput.SourceState[r0]
                androidx.camera.video.VideoOutput$SourceState r1 = androidx.camera.video.VideoOutput.SourceState.ACTIVE_STREAMING
                r2 = 0
                r0[r2] = r1
                androidx.camera.video.VideoOutput$SourceState r1 = androidx.camera.video.VideoOutput.SourceState.ACTIVE_NON_STREAMING
                r2 = 1
                r0[r2] = r1
                androidx.camera.video.VideoOutput$SourceState r1 = androidx.camera.video.VideoOutput.SourceState.INACTIVE
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.video.VideoOutput$SourceState r0 = new androidx.camera.video.VideoOutput$SourceState
                java.lang.String r1 = "ACTIVE_STREAMING"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.video.VideoOutput.SourceState.ACTIVE_STREAMING = r0
                androidx.camera.video.VideoOutput$SourceState r0 = new androidx.camera.video.VideoOutput$SourceState
                java.lang.String r1 = "ACTIVE_NON_STREAMING"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.video.VideoOutput.SourceState.ACTIVE_NON_STREAMING = r0
                androidx.camera.video.VideoOutput$SourceState r0 = new androidx.camera.video.VideoOutput$SourceState
                java.lang.String r1 = "INACTIVE"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.video.VideoOutput.SourceState.INACTIVE = r0
                androidx.camera.video.VideoOutput$SourceState[] r0 = $values()
                androidx.camera.video.VideoOutput.SourceState.$VALUES = r0
                return
        }

        SourceState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.video.VideoOutput.SourceState valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.video.VideoOutput$SourceState> r0 = androidx.camera.video.VideoOutput.SourceState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.video.VideoOutput$SourceState r1 = (androidx.camera.video.VideoOutput.SourceState) r1
                return r1
        }

        public static androidx.camera.video.VideoOutput.SourceState[] values() {
                androidx.camera.video.VideoOutput$SourceState[] r0 = androidx.camera.video.VideoOutput.SourceState.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.video.VideoOutput$SourceState[] r0 = (androidx.camera.video.VideoOutput.SourceState[]) r0
                return r0
        }
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    androidx.camera.video.VideoCapabilities getMediaCapabilities(@androidx.annotation.NonNull androidx.camera.core.CameraInfo r1);

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    androidx.camera.core.impl.Observable<androidx.camera.video.MediaSpec> getMediaSpec();

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    androidx.camera.core.impl.Observable<androidx.camera.video.StreamInfo> getStreamInfo();

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    void onSourceStateChanged(@androidx.annotation.NonNull androidx.camera.video.VideoOutput.SourceState r1);

    void onSurfaceRequested(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r1);

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    void onSurfaceRequested(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r1, @androidx.annotation.NonNull androidx.camera.core.impl.Timebase r2);
}
