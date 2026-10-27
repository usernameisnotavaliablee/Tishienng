package com.jmolsmobile.landscapevideocapture.camera;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class OpenCameraException extends java.lang.Exception {
    private static final java.lang.String LOG_PREFIX = "Unable to open camera - ";
    private static final long serialVersionUID = -7340415176385044242L;
    private final com.jmolsmobile.landscapevideocapture.camera.OpenCameraException.OpenType mType;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum OpenType extends java.lang.Enum<com.jmolsmobile.landscapevideocapture.camera.OpenCameraException.OpenType> {
        private static final /* synthetic */ com.jmolsmobile.landscapevideocapture.camera.OpenCameraException.OpenType[] $VALUES = null;
        public static final com.jmolsmobile.landscapevideocapture.camera.OpenCameraException.OpenType INUSE = null;
        public static final com.jmolsmobile.landscapevideocapture.camera.OpenCameraException.OpenType NOCAMERA = null;
        private java.lang.String mMessage;

        static {
                com.jmolsmobile.landscapevideocapture.camera.OpenCameraException$OpenType r0 = new com.jmolsmobile.landscapevideocapture.camera.OpenCameraException$OpenType
                java.lang.String r1 = "Camera disabled or in use by other process"
                java.lang.String r2 = "INUSE"
                r3 = 0
                r0.<init>(r2, r3, r1)
                com.jmolsmobile.landscapevideocapture.camera.OpenCameraException.OpenType.INUSE = r0
                com.jmolsmobile.landscapevideocapture.camera.OpenCameraException$OpenType r1 = new com.jmolsmobile.landscapevideocapture.camera.OpenCameraException$OpenType
                java.lang.String r2 = "Device does not have camera"
                java.lang.String r4 = "NOCAMERA"
                r5 = 1
                r1.<init>(r4, r5, r2)
                com.jmolsmobile.landscapevideocapture.camera.OpenCameraException.OpenType.NOCAMERA = r1
                r2 = 2
                com.jmolsmobile.landscapevideocapture.camera.OpenCameraException$OpenType[] r2 = new com.jmolsmobile.landscapevideocapture.camera.OpenCameraException.OpenType[r2]
                r2[r3] = r0
                r2[r5] = r1
                com.jmolsmobile.landscapevideocapture.camera.OpenCameraException.OpenType.$VALUES = r2
                return
        }

        OpenType(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.mMessage = r3
                return
        }

        public static com.jmolsmobile.landscapevideocapture.camera.OpenCameraException.OpenType valueOf(java.lang.String r1) {
                java.lang.Class<com.jmolsmobile.landscapevideocapture.camera.OpenCameraException$OpenType> r0 = com.jmolsmobile.landscapevideocapture.camera.OpenCameraException.OpenType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.jmolsmobile.landscapevideocapture.camera.OpenCameraException$OpenType r1 = (com.jmolsmobile.landscapevideocapture.camera.OpenCameraException.OpenType) r1
                return r1
        }

        public static com.jmolsmobile.landscapevideocapture.camera.OpenCameraException.OpenType[] values() {
                com.jmolsmobile.landscapevideocapture.camera.OpenCameraException$OpenType[] r0 = com.jmolsmobile.landscapevideocapture.camera.OpenCameraException.OpenType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.jmolsmobile.landscapevideocapture.camera.OpenCameraException$OpenType[] r0 = (com.jmolsmobile.landscapevideocapture.camera.OpenCameraException.OpenType[]) r0
                return r0
        }

        public java.lang.String getMessage() {
                r1 = this;
                java.lang.String r0 = r1.mMessage
                return r0
        }
    }

    public OpenCameraException(com.jmolsmobile.landscapevideocapture.camera.OpenCameraException.OpenType r2) {
            r1 = this;
            java.lang.String r0 = r2.getMessage()
            r1.<init>(r0)
            r1.mType = r2
            return
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to open camera - "
            r0.append(r1)
            com.jmolsmobile.landscapevideocapture.camera.OpenCameraException$OpenType r1 = r2.mType
            java.lang.String r1 = r1.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "VideoCapture_Exception"
            com.jmolsmobile.landscapevideocapture.b.b(r1, r0)
            return
    }
}
