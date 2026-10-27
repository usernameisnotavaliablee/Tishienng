package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface UseCaseConfigFactory {
    public static final androidx.camera.core.impl.UseCaseConfigFactory EMPTY_INSTANCE = null;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum CaptureType extends java.lang.Enum<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> {
        private static final /* synthetic */ androidx.camera.core.impl.UseCaseConfigFactory.CaptureType[] $VALUES = null;
        public static final androidx.camera.core.impl.UseCaseConfigFactory.CaptureType IMAGE_ANALYSIS = null;
        public static final androidx.camera.core.impl.UseCaseConfigFactory.CaptureType IMAGE_CAPTURE = null;
        public static final androidx.camera.core.impl.UseCaseConfigFactory.CaptureType METERING_REPEATING = null;
        public static final androidx.camera.core.impl.UseCaseConfigFactory.CaptureType PREVIEW = null;
        public static final androidx.camera.core.impl.UseCaseConfigFactory.CaptureType STREAM_SHARING = null;
        public static final androidx.camera.core.impl.UseCaseConfigFactory.CaptureType VIDEO_CAPTURE = null;

        private static /* synthetic */ androidx.camera.core.impl.UseCaseConfigFactory.CaptureType[] $values() {
                r0 = 6
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType[] r0 = new androidx.camera.core.impl.UseCaseConfigFactory.CaptureType[r0]
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE
                r2 = 0
                r0[r2] = r1
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW
                r2 = 1
                r0[r2] = r1
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS
                r2 = 2
                r0[r2] = r1
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE
                r2 = 3
                r0[r2] = r1
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.STREAM_SHARING
                r2 = 4
                r0[r2] = r1
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.METERING_REPEATING
                r2 = 5
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r0 = new androidx.camera.core.impl.UseCaseConfigFactory$CaptureType
                java.lang.String r1 = "IMAGE_CAPTURE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE = r0
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r0 = new androidx.camera.core.impl.UseCaseConfigFactory$CaptureType
                java.lang.String r1 = "PREVIEW"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW = r0
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r0 = new androidx.camera.core.impl.UseCaseConfigFactory$CaptureType
                java.lang.String r1 = "IMAGE_ANALYSIS"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS = r0
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r0 = new androidx.camera.core.impl.UseCaseConfigFactory$CaptureType
                java.lang.String r1 = "VIDEO_CAPTURE"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE = r0
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r0 = new androidx.camera.core.impl.UseCaseConfigFactory$CaptureType
                java.lang.String r1 = "STREAM_SHARING"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.STREAM_SHARING = r0
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r0 = new androidx.camera.core.impl.UseCaseConfigFactory$CaptureType
                java.lang.String r1 = "METERING_REPEATING"
                r2 = 5
                r0.<init>(r1, r2)
                androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.METERING_REPEATING = r0
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType[] r0 = $values()
                androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.$VALUES = r0
                return
        }

        CaptureType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.core.impl.UseCaseConfigFactory.CaptureType valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.impl.UseCaseConfigFactory$CaptureType> r0 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = (androidx.camera.core.impl.UseCaseConfigFactory.CaptureType) r1
                return r1
        }

        public static androidx.camera.core.impl.UseCaseConfigFactory.CaptureType[] values() {
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType[] r0 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType[] r0 = (androidx.camera.core.impl.UseCaseConfigFactory.CaptureType[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Provider {
        @androidx.annotation.NonNull
        androidx.camera.core.impl.UseCaseConfigFactory newInstance(@androidx.annotation.NonNull android.content.Context r1) throws androidx.camera.core.InitializationException;
    }

    static {
            androidx.camera.core.impl.UseCaseConfigFactory$1 r0 = new androidx.camera.core.impl.UseCaseConfigFactory$1
            r0.<init>()
            androidx.camera.core.impl.UseCaseConfigFactory.EMPTY_INSTANCE = r0
            return
    }

    @androidx.annotation.Nullable
    androidx.camera.core.impl.Config getConfig(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory.CaptureType r1, int r2);
}
