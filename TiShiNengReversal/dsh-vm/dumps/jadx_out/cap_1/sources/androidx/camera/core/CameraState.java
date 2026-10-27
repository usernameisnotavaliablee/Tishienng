package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class CameraState {
    public static final int ERROR_CAMERA_DISABLED = 5;
    public static final int ERROR_CAMERA_FATAL_ERROR = 6;
    public static final int ERROR_CAMERA_IN_USE = 2;
    public static final int ERROR_DO_NOT_DISTURB_MODE_ENABLED = 7;
    public static final int ERROR_MAX_CAMERAS_IN_USE = 1;
    public static final int ERROR_OTHER_RECOVERABLE_ERROR = 3;
    public static final int ERROR_STREAM_CONFIG = 4;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ErrorType extends java.lang.Enum<androidx.camera.core.CameraState.ErrorType> {
        private static final /* synthetic */ androidx.camera.core.CameraState.ErrorType[] $VALUES = null;
        public static final androidx.camera.core.CameraState.ErrorType CRITICAL = null;
        public static final androidx.camera.core.CameraState.ErrorType RECOVERABLE = null;

        private static /* synthetic */ androidx.camera.core.CameraState.ErrorType[] $values() {
                r0 = 2
                androidx.camera.core.CameraState$ErrorType[] r0 = new androidx.camera.core.CameraState.ErrorType[r0]
                androidx.camera.core.CameraState$ErrorType r1 = androidx.camera.core.CameraState.ErrorType.RECOVERABLE
                r2 = 0
                r0[r2] = r1
                androidx.camera.core.CameraState$ErrorType r1 = androidx.camera.core.CameraState.ErrorType.CRITICAL
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.CameraState$ErrorType r0 = new androidx.camera.core.CameraState$ErrorType
                java.lang.String r1 = "RECOVERABLE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.core.CameraState.ErrorType.RECOVERABLE = r0
                androidx.camera.core.CameraState$ErrorType r0 = new androidx.camera.core.CameraState$ErrorType
                java.lang.String r1 = "CRITICAL"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.core.CameraState.ErrorType.CRITICAL = r0
                androidx.camera.core.CameraState$ErrorType[] r0 = $values()
                androidx.camera.core.CameraState.ErrorType.$VALUES = r0
                return
        }

        ErrorType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.core.CameraState.ErrorType valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.CameraState$ErrorType> r0 = androidx.camera.core.CameraState.ErrorType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.CameraState$ErrorType r1 = (androidx.camera.core.CameraState.ErrorType) r1
                return r1
        }

        public static androidx.camera.core.CameraState.ErrorType[] values() {
                androidx.camera.core.CameraState$ErrorType[] r0 = androidx.camera.core.CameraState.ErrorType.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.CameraState$ErrorType[] r0 = (androidx.camera.core.CameraState.ErrorType[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    public static abstract class StateError {
        public StateError() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public static androidx.camera.core.CameraState.StateError create(int r1) {
                r0 = 0
                androidx.camera.core.CameraState$StateError r1 = create(r1, r0)
                return r1
        }

        @androidx.annotation.NonNull
        public static androidx.camera.core.CameraState.StateError create(int r1, @androidx.annotation.Nullable java.lang.Throwable r2) {
                androidx.camera.core.AutoValue_CameraState_StateError r0 = new androidx.camera.core.AutoValue_CameraState_StateError
                r0.<init>(r1, r2)
                return r0
        }

        @androidx.annotation.Nullable
        public abstract java.lang.Throwable getCause();

        public abstract int getCode();

        @androidx.annotation.NonNull
        public androidx.camera.core.CameraState.ErrorType getType() {
                r2 = this;
                int r0 = r2.getCode()
                r1 = 2
                if (r0 == r1) goto L11
                r1 = 1
                if (r0 == r1) goto L11
                r1 = 3
                if (r0 != r1) goto Le
                goto L11
            Le:
                androidx.camera.core.CameraState$ErrorType r0 = androidx.camera.core.CameraState.ErrorType.CRITICAL
                return r0
            L11:
                androidx.camera.core.CameraState$ErrorType r0 = androidx.camera.core.CameraState.ErrorType.RECOVERABLE
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Type extends java.lang.Enum<androidx.camera.core.CameraState.Type> {
        private static final /* synthetic */ androidx.camera.core.CameraState.Type[] $VALUES = null;
        public static final androidx.camera.core.CameraState.Type CLOSED = null;
        public static final androidx.camera.core.CameraState.Type CLOSING = null;
        public static final androidx.camera.core.CameraState.Type OPEN = null;
        public static final androidx.camera.core.CameraState.Type OPENING = null;
        public static final androidx.camera.core.CameraState.Type PENDING_OPEN = null;

        private static /* synthetic */ androidx.camera.core.CameraState.Type[] $values() {
                r0 = 5
                androidx.camera.core.CameraState$Type[] r0 = new androidx.camera.core.CameraState.Type[r0]
                androidx.camera.core.CameraState$Type r1 = androidx.camera.core.CameraState.Type.PENDING_OPEN
                r2 = 0
                r0[r2] = r1
                androidx.camera.core.CameraState$Type r1 = androidx.camera.core.CameraState.Type.OPENING
                r2 = 1
                r0[r2] = r1
                androidx.camera.core.CameraState$Type r1 = androidx.camera.core.CameraState.Type.OPEN
                r2 = 2
                r0[r2] = r1
                androidx.camera.core.CameraState$Type r1 = androidx.camera.core.CameraState.Type.CLOSING
                r2 = 3
                r0[r2] = r1
                androidx.camera.core.CameraState$Type r1 = androidx.camera.core.CameraState.Type.CLOSED
                r2 = 4
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.CameraState$Type r0 = new androidx.camera.core.CameraState$Type
                java.lang.String r1 = "PENDING_OPEN"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.core.CameraState.Type.PENDING_OPEN = r0
                androidx.camera.core.CameraState$Type r0 = new androidx.camera.core.CameraState$Type
                java.lang.String r1 = "OPENING"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.core.CameraState.Type.OPENING = r0
                androidx.camera.core.CameraState$Type r0 = new androidx.camera.core.CameraState$Type
                java.lang.String r1 = "OPEN"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.core.CameraState.Type.OPEN = r0
                androidx.camera.core.CameraState$Type r0 = new androidx.camera.core.CameraState$Type
                java.lang.String r1 = "CLOSING"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.camera.core.CameraState.Type.CLOSING = r0
                androidx.camera.core.CameraState$Type r0 = new androidx.camera.core.CameraState$Type
                java.lang.String r1 = "CLOSED"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.camera.core.CameraState.Type.CLOSED = r0
                androidx.camera.core.CameraState$Type[] r0 = $values()
                androidx.camera.core.CameraState.Type.$VALUES = r0
                return
        }

        Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.core.CameraState.Type valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.CameraState$Type> r0 = androidx.camera.core.CameraState.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.CameraState$Type r1 = (androidx.camera.core.CameraState.Type) r1
                return r1
        }

        public static androidx.camera.core.CameraState.Type[] values() {
                androidx.camera.core.CameraState$Type[] r0 = androidx.camera.core.CameraState.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.CameraState$Type[] r0 = (androidx.camera.core.CameraState.Type[]) r0
                return r0
        }
    }

    public CameraState() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.CameraState create(@androidx.annotation.NonNull androidx.camera.core.CameraState.Type r1) {
            r0 = 0
            androidx.camera.core.CameraState r1 = create(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.CameraState create(@androidx.annotation.NonNull androidx.camera.core.CameraState.Type r1, @androidx.annotation.Nullable androidx.camera.core.CameraState.StateError r2) {
            androidx.camera.core.AutoValue_CameraState r0 = new androidx.camera.core.AutoValue_CameraState
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public abstract androidx.camera.core.CameraState.StateError getError();

    @androidx.annotation.NonNull
    public abstract androidx.camera.core.CameraState.Type getType();
}
