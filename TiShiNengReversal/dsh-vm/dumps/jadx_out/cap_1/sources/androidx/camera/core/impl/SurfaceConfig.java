package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class SurfaceConfig {
    public static final long DEFAULT_STREAM_USE_CASE_VALUE = 0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ConfigSize extends java.lang.Enum<androidx.camera.core.impl.SurfaceConfig.ConfigSize> {
        private static final /* synthetic */ androidx.camera.core.impl.SurfaceConfig.ConfigSize[] $VALUES = null;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize MAXIMUM = null;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize NOT_SUPPORT = null;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize PREVIEW = null;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize RECORD = null;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize ULTRA_MAXIMUM = null;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize VGA = null;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize s1440p = null;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigSize s720p = null;
        final int mId;

        private static /* synthetic */ androidx.camera.core.impl.SurfaceConfig.ConfigSize[] $values() {
                r0 = 8
                androidx.camera.core.impl.SurfaceConfig$ConfigSize[] r0 = new androidx.camera.core.impl.SurfaceConfig.ConfigSize[r0]
                androidx.camera.core.impl.SurfaceConfig$ConfigSize r1 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.VGA
                r2 = 0
                r0[r2] = r1
                androidx.camera.core.impl.SurfaceConfig$ConfigSize r1 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.s720p
                r2 = 1
                r0[r2] = r1
                androidx.camera.core.impl.SurfaceConfig$ConfigSize r1 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW
                r2 = 2
                r0[r2] = r1
                androidx.camera.core.impl.SurfaceConfig$ConfigSize r1 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.s1440p
                r2 = 3
                r0[r2] = r1
                androidx.camera.core.impl.SurfaceConfig$ConfigSize r1 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.RECORD
                r2 = 4
                r0[r2] = r1
                androidx.camera.core.impl.SurfaceConfig$ConfigSize r1 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM
                r2 = 5
                r0[r2] = r1
                androidx.camera.core.impl.SurfaceConfig$ConfigSize r1 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.ULTRA_MAXIMUM
                r2 = 6
                r0[r2] = r1
                androidx.camera.core.impl.SurfaceConfig$ConfigSize r1 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.NOT_SUPPORT
                r2 = 7
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.impl.SurfaceConfig$ConfigSize r0 = new androidx.camera.core.impl.SurfaceConfig$ConfigSize
                java.lang.String r1 = "VGA"
                r2 = 0
                r0.<init>(r1, r2, r2)
                androidx.camera.core.impl.SurfaceConfig.ConfigSize.VGA = r0
                androidx.camera.core.impl.SurfaceConfig$ConfigSize r0 = new androidx.camera.core.impl.SurfaceConfig$ConfigSize
                java.lang.String r1 = "s720p"
                r2 = 1
                r0.<init>(r1, r2, r2)
                androidx.camera.core.impl.SurfaceConfig.ConfigSize.s720p = r0
                androidx.camera.core.impl.SurfaceConfig$ConfigSize r0 = new androidx.camera.core.impl.SurfaceConfig$ConfigSize
                java.lang.String r1 = "PREVIEW"
                r2 = 2
                r0.<init>(r1, r2, r2)
                androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW = r0
                androidx.camera.core.impl.SurfaceConfig$ConfigSize r0 = new androidx.camera.core.impl.SurfaceConfig$ConfigSize
                java.lang.String r1 = "s1440p"
                r2 = 3
                r0.<init>(r1, r2, r2)
                androidx.camera.core.impl.SurfaceConfig.ConfigSize.s1440p = r0
                androidx.camera.core.impl.SurfaceConfig$ConfigSize r0 = new androidx.camera.core.impl.SurfaceConfig$ConfigSize
                java.lang.String r1 = "RECORD"
                r2 = 4
                r0.<init>(r1, r2, r2)
                androidx.camera.core.impl.SurfaceConfig.ConfigSize.RECORD = r0
                androidx.camera.core.impl.SurfaceConfig$ConfigSize r0 = new androidx.camera.core.impl.SurfaceConfig$ConfigSize
                java.lang.String r1 = "MAXIMUM"
                r2 = 5
                r0.<init>(r1, r2, r2)
                androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM = r0
                androidx.camera.core.impl.SurfaceConfig$ConfigSize r0 = new androidx.camera.core.impl.SurfaceConfig$ConfigSize
                java.lang.String r1 = "ULTRA_MAXIMUM"
                r2 = 6
                r0.<init>(r1, r2, r2)
                androidx.camera.core.impl.SurfaceConfig.ConfigSize.ULTRA_MAXIMUM = r0
                androidx.camera.core.impl.SurfaceConfig$ConfigSize r0 = new androidx.camera.core.impl.SurfaceConfig$ConfigSize
                java.lang.String r1 = "NOT_SUPPORT"
                r2 = 7
                r0.<init>(r1, r2, r2)
                androidx.camera.core.impl.SurfaceConfig.ConfigSize.NOT_SUPPORT = r0
                androidx.camera.core.impl.SurfaceConfig$ConfigSize[] r0 = $values()
                androidx.camera.core.impl.SurfaceConfig.ConfigSize.$VALUES = r0
                return
        }

        ConfigSize(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.mId = r3
                return
        }

        public static androidx.camera.core.impl.SurfaceConfig.ConfigSize valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.impl.SurfaceConfig$ConfigSize> r0 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.impl.SurfaceConfig$ConfigSize r1 = (androidx.camera.core.impl.SurfaceConfig.ConfigSize) r1
                return r1
        }

        public static androidx.camera.core.impl.SurfaceConfig.ConfigSize[] values() {
                androidx.camera.core.impl.SurfaceConfig$ConfigSize[] r0 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.impl.SurfaceConfig$ConfigSize[] r0 = (androidx.camera.core.impl.SurfaceConfig.ConfigSize[]) r0
                return r0
        }

        int getId() {
                r1 = this;
                int r0 = r1.mId
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ConfigType extends java.lang.Enum<androidx.camera.core.impl.SurfaceConfig.ConfigType> {
        private static final /* synthetic */ androidx.camera.core.impl.SurfaceConfig.ConfigType[] $VALUES = null;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigType JPEG = null;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigType PRIV = null;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigType RAW = null;
        public static final androidx.camera.core.impl.SurfaceConfig.ConfigType YUV = null;

        private static /* synthetic */ androidx.camera.core.impl.SurfaceConfig.ConfigType[] $values() {
                r0 = 4
                androidx.camera.core.impl.SurfaceConfig$ConfigType[] r0 = new androidx.camera.core.impl.SurfaceConfig.ConfigType[r0]
                androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV
                r2 = 0
                r0[r2] = r1
                androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV
                r2 = 1
                r0[r2] = r1
                androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG
                r2 = 2
                r0[r2] = r1
                androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.RAW
                r2 = 3
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.impl.SurfaceConfig$ConfigType r0 = new androidx.camera.core.impl.SurfaceConfig$ConfigType
                java.lang.String r1 = "PRIV"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV = r0
                androidx.camera.core.impl.SurfaceConfig$ConfigType r0 = new androidx.camera.core.impl.SurfaceConfig$ConfigType
                java.lang.String r1 = "YUV"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV = r0
                androidx.camera.core.impl.SurfaceConfig$ConfigType r0 = new androidx.camera.core.impl.SurfaceConfig$ConfigType
                java.lang.String r1 = "JPEG"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG = r0
                androidx.camera.core.impl.SurfaceConfig$ConfigType r0 = new androidx.camera.core.impl.SurfaceConfig$ConfigType
                java.lang.String r1 = "RAW"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.camera.core.impl.SurfaceConfig.ConfigType.RAW = r0
                androidx.camera.core.impl.SurfaceConfig$ConfigType[] r0 = $values()
                androidx.camera.core.impl.SurfaceConfig.ConfigType.$VALUES = r0
                return
        }

        ConfigType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.core.impl.SurfaceConfig.ConfigType valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.impl.SurfaceConfig$ConfigType> r0 = androidx.camera.core.impl.SurfaceConfig.ConfigType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = (androidx.camera.core.impl.SurfaceConfig.ConfigType) r1
                return r1
        }

        public static androidx.camera.core.impl.SurfaceConfig.ConfigType[] values() {
                androidx.camera.core.impl.SurfaceConfig$ConfigType[] r0 = androidx.camera.core.impl.SurfaceConfig.ConfigType.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.impl.SurfaceConfig$ConfigType[] r0 = (androidx.camera.core.impl.SurfaceConfig.ConfigType[]) r0
                return r0
        }
    }

    SurfaceConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.SurfaceConfig create(@androidx.annotation.NonNull androidx.camera.core.impl.SurfaceConfig.ConfigType r3, @androidx.annotation.NonNull androidx.camera.core.impl.SurfaceConfig.ConfigSize r4) {
            androidx.camera.core.impl.AutoValue_SurfaceConfig r0 = new androidx.camera.core.impl.AutoValue_SurfaceConfig
            r1 = 0
            r0.<init>(r3, r4, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.SurfaceConfig create(@androidx.annotation.NonNull androidx.camera.core.impl.SurfaceConfig.ConfigType r1, @androidx.annotation.NonNull androidx.camera.core.impl.SurfaceConfig.ConfigSize r2, long r3) {
            androidx.camera.core.impl.AutoValue_SurfaceConfig r0 = new androidx.camera.core.impl.AutoValue_SurfaceConfig
            r0.<init>(r1, r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.SurfaceConfig.ConfigType getConfigType(int r1) {
            r0 = 35
            if (r1 != r0) goto L7
            androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV
            return r1
        L7:
            r0 = 256(0x100, float:3.59E-43)
            if (r1 != r0) goto Le
            androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG
            return r1
        Le:
            r0 = 32
            if (r1 != r0) goto L15
            androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.RAW
            return r1
        L15:
            androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV
            return r1
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig(int r3, int r4, @androidx.annotation.NonNull android.util.Size r5, @androidx.annotation.NonNull androidx.camera.core.impl.SurfaceSizeDefinition r6) {
            androidx.camera.core.impl.SurfaceConfig$ConfigType r0 = getConfigType(r4)
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r1 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.NOT_SUPPORT
            int r5 = androidx.camera.core.internal.utils.SizeUtil.getArea(r5)
            r2 = 1
            if (r3 != r2) goto L27
            android.util.Size r3 = r6.getS720pSize(r4)
            int r3 = androidx.camera.core.internal.utils.SizeUtil.getArea(r3)
            if (r5 > r3) goto L1a
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r1 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.s720p
            goto L69
        L1a:
            android.util.Size r3 = r6.getS1440pSize(r4)
            int r3 = androidx.camera.core.internal.utils.SizeUtil.getArea(r3)
            if (r5 > r3) goto L69
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r1 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.s1440p
            goto L69
        L27:
            android.util.Size r3 = r6.getAnalysisSize()
            int r3 = androidx.camera.core.internal.utils.SizeUtil.getArea(r3)
            if (r5 > r3) goto L34
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r1 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.VGA
            goto L69
        L34:
            android.util.Size r3 = r6.getPreviewSize()
            int r3 = androidx.camera.core.internal.utils.SizeUtil.getArea(r3)
            if (r5 > r3) goto L41
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r1 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW
            goto L69
        L41:
            android.util.Size r3 = r6.getRecordSize()
            int r3 = androidx.camera.core.internal.utils.SizeUtil.getArea(r3)
            if (r5 > r3) goto L4e
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r1 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.RECORD
            goto L69
        L4e:
            android.util.Size r3 = r6.getMaximumSize(r4)
            int r3 = androidx.camera.core.internal.utils.SizeUtil.getArea(r3)
            if (r5 > r3) goto L5b
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r1 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM
            goto L69
        L5b:
            android.util.Size r3 = r6.getUltraMaximumSize(r4)
            if (r3 == 0) goto L69
            int r3 = androidx.camera.core.internal.utils.SizeUtil.getArea(r3)
            if (r5 > r3) goto L69
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r1 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.ULTRA_MAXIMUM
        L69:
            androidx.camera.core.impl.SurfaceConfig r3 = create(r0, r1)
            return r3
    }

    @androidx.annotation.NonNull
    public abstract androidx.camera.core.impl.SurfaceConfig.ConfigSize getConfigSize();

    @androidx.annotation.NonNull
    public abstract androidx.camera.core.impl.SurfaceConfig.ConfigType getConfigType();

    public abstract long getStreamUseCase();

    public final boolean isSupported(@androidx.annotation.NonNull androidx.camera.core.impl.SurfaceConfig r3) {
            r2 = this;
            androidx.camera.core.impl.SurfaceConfig$ConfigType r0 = r3.getConfigType()
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r3 = r3.getConfigSize()
            int r3 = r3.getId()
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r1 = r2.getConfigSize()
            int r1 = r1.getId()
            if (r3 > r1) goto L1e
            androidx.camera.core.impl.SurfaceConfig$ConfigType r3 = r2.getConfigType()
            if (r0 != r3) goto L1e
            r3 = 1
            return r3
        L1e:
            r3 = 0
            return r3
    }
}
