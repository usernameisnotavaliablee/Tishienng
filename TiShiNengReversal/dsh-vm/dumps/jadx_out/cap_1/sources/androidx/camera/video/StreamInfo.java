package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class StreamInfo {
    static final androidx.camera.core.impl.Observable<androidx.camera.video.StreamInfo> ALWAYS_ACTIVE_OBSERVABLE = null;
    static final java.util.Set<java.lang.Integer> NON_SURFACE_STREAM_ID = null;
    static final int STREAM_ID_ANY = 0;
    static final int STREAM_ID_ERROR = -1;
    static final androidx.camera.video.StreamInfo STREAM_INFO_ANY_INACTIVE = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    enum StreamState extends java.lang.Enum<androidx.camera.video.StreamInfo.StreamState> {
        private static final /* synthetic */ androidx.camera.video.StreamInfo.StreamState[] $VALUES = null;
        public static final androidx.camera.video.StreamInfo.StreamState ACTIVE = null;
        public static final androidx.camera.video.StreamInfo.StreamState INACTIVE = null;

        private static /* synthetic */ androidx.camera.video.StreamInfo.StreamState[] $values() {
                r0 = 2
                androidx.camera.video.StreamInfo$StreamState[] r0 = new androidx.camera.video.StreamInfo.StreamState[r0]
                androidx.camera.video.StreamInfo$StreamState r1 = androidx.camera.video.StreamInfo.StreamState.ACTIVE
                r2 = 0
                r0[r2] = r1
                androidx.camera.video.StreamInfo$StreamState r1 = androidx.camera.video.StreamInfo.StreamState.INACTIVE
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.video.StreamInfo$StreamState r0 = new androidx.camera.video.StreamInfo$StreamState
                java.lang.String r1 = "ACTIVE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.video.StreamInfo.StreamState.ACTIVE = r0
                androidx.camera.video.StreamInfo$StreamState r0 = new androidx.camera.video.StreamInfo$StreamState
                java.lang.String r1 = "INACTIVE"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.video.StreamInfo.StreamState.INACTIVE = r0
                androidx.camera.video.StreamInfo$StreamState[] r0 = $values()
                androidx.camera.video.StreamInfo.StreamState.$VALUES = r0
                return
        }

        StreamState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.video.StreamInfo.StreamState valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.video.StreamInfo$StreamState> r0 = androidx.camera.video.StreamInfo.StreamState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.video.StreamInfo$StreamState r1 = (androidx.camera.video.StreamInfo.StreamState) r1
                return r1
        }

        public static androidx.camera.video.StreamInfo.StreamState[] values() {
                androidx.camera.video.StreamInfo$StreamState[] r0 = androidx.camera.video.StreamInfo.StreamState.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.video.StreamInfo$StreamState[] r0 = (androidx.camera.video.StreamInfo.StreamState[]) r0
                return r0
        }
    }

    static {
            androidx.camera.video.StreamInfo$StreamState r0 = androidx.camera.video.StreamInfo.StreamState.INACTIVE
            r1 = 0
            androidx.camera.video.StreamInfo r0 = of(r1, r0)
            androidx.camera.video.StreamInfo.STREAM_INFO_ANY_INACTIVE = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2
            java.lang.Integer[] r4 = new java.lang.Integer[r4]
            r4[r1] = r2
            r2 = 1
            r4[r2] = r3
            java.util.List r2 = java.util.Arrays.asList(r4)
            r0.<init>(r2)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            androidx.camera.video.StreamInfo.NON_SURFACE_STREAM_ID = r0
            androidx.camera.video.StreamInfo$StreamState r0 = androidx.camera.video.StreamInfo.StreamState.ACTIVE
            androidx.camera.video.StreamInfo r0 = of(r1, r0)
            androidx.camera.core.impl.Observable r0 = androidx.camera.core.impl.ConstantObservable.withValue(r0)
            androidx.camera.video.StreamInfo.ALWAYS_ACTIVE_OBSERVABLE = r0
            return
    }

    StreamInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    static androidx.camera.video.StreamInfo of(int r2, @androidx.annotation.NonNull androidx.camera.video.StreamInfo.StreamState r3) {
            androidx.camera.video.AutoValue_StreamInfo r0 = new androidx.camera.video.AutoValue_StreamInfo
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @androidx.annotation.NonNull
    static androidx.camera.video.StreamInfo of(int r1, @androidx.annotation.NonNull androidx.camera.video.StreamInfo.StreamState r2, @androidx.annotation.Nullable androidx.camera.core.SurfaceRequest.TransformationInfo r3) {
            androidx.camera.video.AutoValue_StreamInfo r0 = new androidx.camera.video.AutoValue_StreamInfo
            r0.<init>(r1, r2, r3)
            return r0
    }

    public abstract int getId();

    @androidx.annotation.Nullable
    public abstract androidx.camera.core.SurfaceRequest.TransformationInfo getInProgressTransformationInfo();

    @androidx.annotation.NonNull
    public abstract androidx.camera.video.StreamInfo.StreamState getStreamState();
}
