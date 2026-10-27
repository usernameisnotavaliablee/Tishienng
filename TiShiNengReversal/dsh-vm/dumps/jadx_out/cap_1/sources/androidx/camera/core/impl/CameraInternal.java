package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface CameraInternal extends androidx.camera.core.Camera, androidx.camera.core.UseCase.StateChangeCallback {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum State extends java.lang.Enum<androidx.camera.core.impl.CameraInternal.State> {
        private static final /* synthetic */ androidx.camera.core.impl.CameraInternal.State[] $VALUES = null;
        public static final androidx.camera.core.impl.CameraInternal.State CLOSED = null;
        public static final androidx.camera.core.impl.CameraInternal.State CLOSING = null;
        public static final androidx.camera.core.impl.CameraInternal.State CONFIGURED = null;
        public static final androidx.camera.core.impl.CameraInternal.State OPEN = null;
        public static final androidx.camera.core.impl.CameraInternal.State OPENING = null;
        public static final androidx.camera.core.impl.CameraInternal.State PENDING_OPEN = null;
        public static final androidx.camera.core.impl.CameraInternal.State RELEASED = null;
        public static final androidx.camera.core.impl.CameraInternal.State RELEASING = null;
        private final boolean mHoldsCameraSlot;

        private static /* synthetic */ androidx.camera.core.impl.CameraInternal.State[] $values() {
                r0 = 8
                androidx.camera.core.impl.CameraInternal$State[] r0 = new androidx.camera.core.impl.CameraInternal.State[r0]
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN
                r2 = 0
                r0[r2] = r1
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.OPENING
                r2 = 1
                r0[r2] = r1
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.OPEN
                r2 = 2
                r0[r2] = r1
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.CONFIGURED
                r2 = 3
                r0[r2] = r1
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.CLOSING
                r2 = 4
                r0[r2] = r1
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.CLOSED
                r2 = 5
                r0[r2] = r1
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.RELEASING
                r2 = 6
                r0[r2] = r1
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.RELEASED
                r2 = 7
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.impl.CameraInternal$State r0 = new androidx.camera.core.impl.CameraInternal$State
                java.lang.String r1 = "PENDING_OPEN"
                r2 = 0
                r0.<init>(r1, r2, r2)
                androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN = r0
                androidx.camera.core.impl.CameraInternal$State r0 = new androidx.camera.core.impl.CameraInternal$State
                java.lang.String r1 = "OPENING"
                r3 = 1
                r0.<init>(r1, r3, r3)
                androidx.camera.core.impl.CameraInternal.State.OPENING = r0
                androidx.camera.core.impl.CameraInternal$State r0 = new androidx.camera.core.impl.CameraInternal$State
                java.lang.String r1 = "OPEN"
                r4 = 2
                r0.<init>(r1, r4, r3)
                androidx.camera.core.impl.CameraInternal.State.OPEN = r0
                androidx.camera.core.impl.CameraInternal$State r0 = new androidx.camera.core.impl.CameraInternal$State
                java.lang.String r1 = "CONFIGURED"
                r4 = 3
                r0.<init>(r1, r4, r3)
                androidx.camera.core.impl.CameraInternal.State.CONFIGURED = r0
                androidx.camera.core.impl.CameraInternal$State r0 = new androidx.camera.core.impl.CameraInternal$State
                java.lang.String r1 = "CLOSING"
                r4 = 4
                r0.<init>(r1, r4, r3)
                androidx.camera.core.impl.CameraInternal.State.CLOSING = r0
                androidx.camera.core.impl.CameraInternal$State r0 = new androidx.camera.core.impl.CameraInternal$State
                java.lang.String r1 = "CLOSED"
                r4 = 5
                r0.<init>(r1, r4, r2)
                androidx.camera.core.impl.CameraInternal.State.CLOSED = r0
                androidx.camera.core.impl.CameraInternal$State r0 = new androidx.camera.core.impl.CameraInternal$State
                java.lang.String r1 = "RELEASING"
                r4 = 6
                r0.<init>(r1, r4, r3)
                androidx.camera.core.impl.CameraInternal.State.RELEASING = r0
                androidx.camera.core.impl.CameraInternal$State r0 = new androidx.camera.core.impl.CameraInternal$State
                java.lang.String r1 = "RELEASED"
                r3 = 7
                r0.<init>(r1, r3, r2)
                androidx.camera.core.impl.CameraInternal.State.RELEASED = r0
                androidx.camera.core.impl.CameraInternal$State[] r0 = $values()
                androidx.camera.core.impl.CameraInternal.State.$VALUES = r0
                return
        }

        State(java.lang.String r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.mHoldsCameraSlot = r3
                return
        }

        public static androidx.camera.core.impl.CameraInternal.State valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.impl.CameraInternal$State> r0 = androidx.camera.core.impl.CameraInternal.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.impl.CameraInternal$State r1 = (androidx.camera.core.impl.CameraInternal.State) r1
                return r1
        }

        public static androidx.camera.core.impl.CameraInternal.State[] values() {
                androidx.camera.core.impl.CameraInternal$State[] r0 = androidx.camera.core.impl.CameraInternal.State.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.impl.CameraInternal$State[] r0 = (androidx.camera.core.impl.CameraInternal.State[]) r0
                return r0
        }

        boolean holdsCameraSlot() {
                r1 = this;
                boolean r0 = r1.mHoldsCameraSlot
                return r0
        }
    }

    void attachUseCases(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r1);

    void close();

    void detachUseCases(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.UseCase> r1);

    @Override // androidx.camera.core.Camera
    @androidx.annotation.NonNull
    androidx.camera.core.CameraControl getCameraControl();

    @androidx.annotation.NonNull
    androidx.camera.core.impl.CameraControlInternal getCameraControlInternal();

    @Override // androidx.camera.core.Camera
    @androidx.annotation.NonNull
    androidx.camera.core.CameraInfo getCameraInfo();

    @androidx.annotation.NonNull
    androidx.camera.core.impl.CameraInfoInternal getCameraInfoInternal();

    @Override // androidx.camera.core.Camera
    @androidx.annotation.NonNull
    java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> getCameraInternals();

    @androidx.annotation.NonNull
    androidx.camera.core.impl.Observable<androidx.camera.core.impl.CameraInternal.State> getCameraState();

    @Override // androidx.camera.core.Camera
    @androidx.annotation.NonNull
    androidx.camera.core.impl.CameraConfig getExtendedConfig();

    boolean getHasTransform();

    boolean isFrontFacing();

    void open();

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> release();

    void setActiveResumingMode(boolean r1);

    @Override // androidx.camera.core.Camera
    void setExtendedConfig(@androidx.annotation.Nullable androidx.camera.core.impl.CameraConfig r1);
}
