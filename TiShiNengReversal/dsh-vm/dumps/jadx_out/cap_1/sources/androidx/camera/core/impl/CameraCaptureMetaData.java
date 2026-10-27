package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraCaptureMetaData {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum AeState extends java.lang.Enum<androidx.camera.core.impl.CameraCaptureMetaData.AeState> {
        private static final /* synthetic */ androidx.camera.core.impl.CameraCaptureMetaData.AeState[] $VALUES = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AeState CONVERGED = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AeState FLASH_REQUIRED = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AeState INACTIVE = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AeState LOCKED = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AeState SEARCHING = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AeState UNKNOWN = null;

        private static /* synthetic */ androidx.camera.core.impl.CameraCaptureMetaData.AeState[] $values() {
                r0 = 6
                androidx.camera.core.impl.CameraCaptureMetaData$AeState[] r0 = new androidx.camera.core.impl.CameraCaptureMetaData.AeState[r0]
                androidx.camera.core.impl.CameraCaptureMetaData$AeState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.UNKNOWN
                r2 = 0
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$AeState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.INACTIVE
                r2 = 1
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$AeState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.SEARCHING
                r2 = 2
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$AeState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.FLASH_REQUIRED
                r2 = 3
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$AeState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.CONVERGED
                r2 = 4
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$AeState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.LOCKED
                r2 = 5
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.impl.CameraCaptureMetaData$AeState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AeState
                java.lang.String r1 = "UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AeState.UNKNOWN = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AeState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AeState
                java.lang.String r1 = "INACTIVE"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AeState.INACTIVE = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AeState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AeState
                java.lang.String r1 = "SEARCHING"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AeState.SEARCHING = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AeState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AeState
                java.lang.String r1 = "FLASH_REQUIRED"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AeState.FLASH_REQUIRED = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AeState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AeState
                java.lang.String r1 = "CONVERGED"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AeState.CONVERGED = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AeState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AeState
                java.lang.String r1 = "LOCKED"
                r2 = 5
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AeState.LOCKED = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AeState[] r0 = $values()
                androidx.camera.core.impl.CameraCaptureMetaData.AeState.$VALUES = r0
                return
        }

        AeState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.core.impl.CameraCaptureMetaData.AeState valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.impl.CameraCaptureMetaData$AeState> r0 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.impl.CameraCaptureMetaData$AeState r1 = (androidx.camera.core.impl.CameraCaptureMetaData.AeState) r1
                return r1
        }

        public static androidx.camera.core.impl.CameraCaptureMetaData.AeState[] values() {
                androidx.camera.core.impl.CameraCaptureMetaData$AeState[] r0 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.impl.CameraCaptureMetaData$AeState[] r0 = (androidx.camera.core.impl.CameraCaptureMetaData.AeState[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum AfMode extends java.lang.Enum<androidx.camera.core.impl.CameraCaptureMetaData.AfMode> {
        private static final /* synthetic */ androidx.camera.core.impl.CameraCaptureMetaData.AfMode[] $VALUES = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AfMode OFF = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AfMode ON_CONTINUOUS_AUTO = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AfMode ON_MANUAL_AUTO = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AfMode UNKNOWN = null;

        private static /* synthetic */ androidx.camera.core.impl.CameraCaptureMetaData.AfMode[] $values() {
                r0 = 4
                androidx.camera.core.impl.CameraCaptureMetaData$AfMode[] r0 = new androidx.camera.core.impl.CameraCaptureMetaData.AfMode[r0]
                androidx.camera.core.impl.CameraCaptureMetaData$AfMode r1 = androidx.camera.core.impl.CameraCaptureMetaData.AfMode.UNKNOWN
                r2 = 0
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$AfMode r1 = androidx.camera.core.impl.CameraCaptureMetaData.AfMode.OFF
                r2 = 1
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$AfMode r1 = androidx.camera.core.impl.CameraCaptureMetaData.AfMode.ON_MANUAL_AUTO
                r2 = 2
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$AfMode r1 = androidx.camera.core.impl.CameraCaptureMetaData.AfMode.ON_CONTINUOUS_AUTO
                r2 = 3
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.impl.CameraCaptureMetaData$AfMode r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AfMode
                java.lang.String r1 = "UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AfMode.UNKNOWN = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AfMode r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AfMode
                java.lang.String r1 = "OFF"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AfMode.OFF = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AfMode r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AfMode
                java.lang.String r1 = "ON_MANUAL_AUTO"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AfMode.ON_MANUAL_AUTO = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AfMode r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AfMode
                java.lang.String r1 = "ON_CONTINUOUS_AUTO"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AfMode.ON_CONTINUOUS_AUTO = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AfMode[] r0 = $values()
                androidx.camera.core.impl.CameraCaptureMetaData.AfMode.$VALUES = r0
                return
        }

        AfMode(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.core.impl.CameraCaptureMetaData.AfMode valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.impl.CameraCaptureMetaData$AfMode> r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfMode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.impl.CameraCaptureMetaData$AfMode r1 = (androidx.camera.core.impl.CameraCaptureMetaData.AfMode) r1
                return r1
        }

        public static androidx.camera.core.impl.CameraCaptureMetaData.AfMode[] values() {
                androidx.camera.core.impl.CameraCaptureMetaData$AfMode[] r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfMode.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.impl.CameraCaptureMetaData$AfMode[] r0 = (androidx.camera.core.impl.CameraCaptureMetaData.AfMode[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum AfState extends java.lang.Enum<androidx.camera.core.impl.CameraCaptureMetaData.AfState> {
        private static final /* synthetic */ androidx.camera.core.impl.CameraCaptureMetaData.AfState[] $VALUES = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AfState INACTIVE = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AfState LOCKED_FOCUSED = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AfState LOCKED_NOT_FOCUSED = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AfState PASSIVE_FOCUSED = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AfState PASSIVE_NOT_FOCUSED = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AfState SCANNING = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AfState UNKNOWN = null;

        private static /* synthetic */ androidx.camera.core.impl.CameraCaptureMetaData.AfState[] $values() {
                r0 = 7
                androidx.camera.core.impl.CameraCaptureMetaData$AfState[] r0 = new androidx.camera.core.impl.CameraCaptureMetaData.AfState[r0]
                androidx.camera.core.impl.CameraCaptureMetaData$AfState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.UNKNOWN
                r2 = 0
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$AfState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.INACTIVE
                r2 = 1
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$AfState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.SCANNING
                r2 = 2
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$AfState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.PASSIVE_FOCUSED
                r2 = 3
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$AfState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.PASSIVE_NOT_FOCUSED
                r2 = 4
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$AfState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.LOCKED_FOCUSED
                r2 = 5
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$AfState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED
                r2 = 6
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AfState
                java.lang.String r1 = "UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AfState.UNKNOWN = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AfState
                java.lang.String r1 = "INACTIVE"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AfState.INACTIVE = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AfState
                java.lang.String r1 = "SCANNING"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AfState.SCANNING = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AfState
                java.lang.String r1 = "PASSIVE_FOCUSED"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AfState.PASSIVE_FOCUSED = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AfState
                java.lang.String r1 = "PASSIVE_NOT_FOCUSED"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AfState.PASSIVE_NOT_FOCUSED = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AfState
                java.lang.String r1 = "LOCKED_FOCUSED"
                r2 = 5
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AfState.LOCKED_FOCUSED = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AfState
                java.lang.String r1 = "LOCKED_NOT_FOCUSED"
                r2 = 6
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AfState[] r0 = $values()
                androidx.camera.core.impl.CameraCaptureMetaData.AfState.$VALUES = r0
                return
        }

        AfState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.core.impl.CameraCaptureMetaData.AfState valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.impl.CameraCaptureMetaData$AfState> r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.impl.CameraCaptureMetaData$AfState r1 = (androidx.camera.core.impl.CameraCaptureMetaData.AfState) r1
                return r1
        }

        public static androidx.camera.core.impl.CameraCaptureMetaData.AfState[] values() {
                androidx.camera.core.impl.CameraCaptureMetaData$AfState[] r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.impl.CameraCaptureMetaData$AfState[] r0 = (androidx.camera.core.impl.CameraCaptureMetaData.AfState[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum AwbState extends java.lang.Enum<androidx.camera.core.impl.CameraCaptureMetaData.AwbState> {
        private static final /* synthetic */ androidx.camera.core.impl.CameraCaptureMetaData.AwbState[] $VALUES = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AwbState CONVERGED = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AwbState INACTIVE = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AwbState LOCKED = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AwbState METERING = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.AwbState UNKNOWN = null;

        private static /* synthetic */ androidx.camera.core.impl.CameraCaptureMetaData.AwbState[] $values() {
                r0 = 5
                androidx.camera.core.impl.CameraCaptureMetaData$AwbState[] r0 = new androidx.camera.core.impl.CameraCaptureMetaData.AwbState[r0]
                androidx.camera.core.impl.CameraCaptureMetaData$AwbState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AwbState.UNKNOWN
                r2 = 0
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$AwbState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AwbState.INACTIVE
                r2 = 1
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$AwbState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AwbState.METERING
                r2 = 2
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$AwbState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AwbState.CONVERGED
                r2 = 3
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$AwbState r1 = androidx.camera.core.impl.CameraCaptureMetaData.AwbState.LOCKED
                r2 = 4
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.impl.CameraCaptureMetaData$AwbState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AwbState
                java.lang.String r1 = "UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AwbState.UNKNOWN = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AwbState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AwbState
                java.lang.String r1 = "INACTIVE"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AwbState.INACTIVE = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AwbState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AwbState
                java.lang.String r1 = "METERING"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AwbState.METERING = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AwbState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AwbState
                java.lang.String r1 = "CONVERGED"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AwbState.CONVERGED = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AwbState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$AwbState
                java.lang.String r1 = "LOCKED"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.AwbState.LOCKED = r0
                androidx.camera.core.impl.CameraCaptureMetaData$AwbState[] r0 = $values()
                androidx.camera.core.impl.CameraCaptureMetaData.AwbState.$VALUES = r0
                return
        }

        AwbState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.core.impl.CameraCaptureMetaData.AwbState valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.impl.CameraCaptureMetaData$AwbState> r0 = androidx.camera.core.impl.CameraCaptureMetaData.AwbState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.impl.CameraCaptureMetaData$AwbState r1 = (androidx.camera.core.impl.CameraCaptureMetaData.AwbState) r1
                return r1
        }

        public static androidx.camera.core.impl.CameraCaptureMetaData.AwbState[] values() {
                androidx.camera.core.impl.CameraCaptureMetaData$AwbState[] r0 = androidx.camera.core.impl.CameraCaptureMetaData.AwbState.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.impl.CameraCaptureMetaData$AwbState[] r0 = (androidx.camera.core.impl.CameraCaptureMetaData.AwbState[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum FlashState extends java.lang.Enum<androidx.camera.core.impl.CameraCaptureMetaData.FlashState> {
        private static final /* synthetic */ androidx.camera.core.impl.CameraCaptureMetaData.FlashState[] $VALUES = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.FlashState FIRED = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.FlashState NONE = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.FlashState READY = null;
        public static final androidx.camera.core.impl.CameraCaptureMetaData.FlashState UNKNOWN = null;

        private static /* synthetic */ androidx.camera.core.impl.CameraCaptureMetaData.FlashState[] $values() {
                r0 = 4
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState[] r0 = new androidx.camera.core.impl.CameraCaptureMetaData.FlashState[r0]
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState r1 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.UNKNOWN
                r2 = 0
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState r1 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.NONE
                r2 = 1
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState r1 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.READY
                r2 = 2
                r0[r2] = r1
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState r1 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.FIRED
                r2 = 3
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$FlashState
                java.lang.String r1 = "UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.FlashState.UNKNOWN = r0
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$FlashState
                java.lang.String r1 = "NONE"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.FlashState.NONE = r0
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$FlashState
                java.lang.String r1 = "READY"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.FlashState.READY = r0
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState r0 = new androidx.camera.core.impl.CameraCaptureMetaData$FlashState
                java.lang.String r1 = "FIRED"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureMetaData.FlashState.FIRED = r0
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState[] r0 = $values()
                androidx.camera.core.impl.CameraCaptureMetaData.FlashState.$VALUES = r0
                return
        }

        FlashState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.core.impl.CameraCaptureMetaData.FlashState valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.impl.CameraCaptureMetaData$FlashState> r0 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState r1 = (androidx.camera.core.impl.CameraCaptureMetaData.FlashState) r1
                return r1
        }

        public static androidx.camera.core.impl.CameraCaptureMetaData.FlashState[] values() {
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState[] r0 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState[] r0 = (androidx.camera.core.impl.CameraCaptureMetaData.FlashState[]) r0
                return r0
        }
    }

    private CameraCaptureMetaData() {
            r0 = this;
            r0.<init>()
            return
    }
}
