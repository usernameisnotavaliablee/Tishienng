package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CameraCaptureFailure {
    private final androidx.camera.core.impl.CameraCaptureFailure.Reason mReason;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Reason extends java.lang.Enum<androidx.camera.core.impl.CameraCaptureFailure.Reason> {
        private static final /* synthetic */ androidx.camera.core.impl.CameraCaptureFailure.Reason[] $VALUES = null;
        public static final androidx.camera.core.impl.CameraCaptureFailure.Reason ERROR = null;

        private static /* synthetic */ androidx.camera.core.impl.CameraCaptureFailure.Reason[] $values() {
                r0 = 1
                androidx.camera.core.impl.CameraCaptureFailure$Reason[] r0 = new androidx.camera.core.impl.CameraCaptureFailure.Reason[r0]
                androidx.camera.core.impl.CameraCaptureFailure$Reason r1 = androidx.camera.core.impl.CameraCaptureFailure.Reason.ERROR
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.impl.CameraCaptureFailure$Reason r0 = new androidx.camera.core.impl.CameraCaptureFailure$Reason
                java.lang.String r1 = "ERROR"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.core.impl.CameraCaptureFailure.Reason.ERROR = r0
                androidx.camera.core.impl.CameraCaptureFailure$Reason[] r0 = $values()
                androidx.camera.core.impl.CameraCaptureFailure.Reason.$VALUES = r0
                return
        }

        Reason(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.core.impl.CameraCaptureFailure.Reason valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.impl.CameraCaptureFailure$Reason> r0 = androidx.camera.core.impl.CameraCaptureFailure.Reason.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.impl.CameraCaptureFailure$Reason r1 = (androidx.camera.core.impl.CameraCaptureFailure.Reason) r1
                return r1
        }

        public static androidx.camera.core.impl.CameraCaptureFailure.Reason[] values() {
                androidx.camera.core.impl.CameraCaptureFailure$Reason[] r0 = androidx.camera.core.impl.CameraCaptureFailure.Reason.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.impl.CameraCaptureFailure$Reason[] r0 = (androidx.camera.core.impl.CameraCaptureFailure.Reason[]) r0
                return r0
        }
    }

    public CameraCaptureFailure(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureFailure.Reason r1) {
            r0 = this;
            r0.<init>()
            r0.mReason = r1
            return
    }

    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraCaptureFailure.Reason getReason() {
            r1 = this;
            androidx.camera.core.impl.CameraCaptureFailure$Reason r0 = r1.mReason
            return r0
    }
}
