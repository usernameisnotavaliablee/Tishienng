package com.baidu.idl.face.platform.strategy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceLivenessStrategyExtModule implements com.baidu.idl.face.platform.ILivenessStrategy {
    private static final java.lang.String TAG = "FaceLivenessStrategyExtModule";
    private static volatile int mProcessCount;
    private android.os.Handler mAnimHandler;
    private java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> mBase64ImageCropMap;
    private java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> mBase64ImageSrcMap;
    private android.content.Context mContext;
    private int mCropCount;
    private android.graphics.Rect mDetectRect;
    private com.baidu.idl.face.platform.strategy.DetectStrategy mDetectStrategy;
    private com.baidu.idl.face.platform.FaceConfig mFaceConfig;
    private long mFaceID;
    private com.baidu.idl.face.platform.decode.FaceModuleNew mFaceModule;
    private com.baidu.idl.face.platform.ILivenessStrategyCallback mILivenessStrategyCallback;
    private com.baidu.idl.face.platform.ILivenessViewCallback mILivenessViewCallback;
    private volatile boolean mIsCompletion;
    private volatile boolean mIsEnableSound;
    private boolean mIsFirstLivenessSuccessTipsed;
    private boolean mIsFirstTipsed;
    private volatile boolean mIsProcessing;
    private volatile com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus mLivenessStatus;
    private com.baidu.idl.face.platform.strategy.LivenessStatusStrategy mLivenessStrategy;
    private long mNoFaceTime;
    private int mPreviewDegree;
    private android.graphics.Rect mPreviewRect;
    private com.baidu.idl.face.platform.common.SoundPoolHelper mSoundPlayHelper;
    private boolean mTipLiveTimeout;
    private java.util.Map<com.baidu.idl.face.platform.FaceStatusNewEnum, java.lang.String> mTipsMap;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum = null;
        static final /* synthetic */ int[] $SwitchMap$com$baidu$idl$face$platform$strategy$FaceLivenessStrategyExtModule$LivenessStatus = null;

        static {
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus[] r0 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.AnonymousClass2.$SwitchMap$com$baidu$idl$face$platform$strategy$FaceLivenessStrategyExtModule$LivenessStatus = r0
                r1 = 1
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r2 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.LivenessReady     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.AnonymousClass2.$SwitchMap$com$baidu$idl$face$platform$strategy$FaceLivenessStrategyExtModule$LivenessStatus     // Catch: java.lang.NoSuchFieldError -> L1d
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r2 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.LivenessTips     // Catch: java.lang.NoSuchFieldError -> L1d
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r3 = 2
                r0[r2] = r3     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.AnonymousClass2.$SwitchMap$com$baidu$idl$face$platform$strategy$FaceLivenessStrategyExtModule$LivenessStatus     // Catch: java.lang.NoSuchFieldError -> L28
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r2 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.LivenessOK     // Catch: java.lang.NoSuchFieldError -> L28
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3 = 3
                r0[r2] = r3     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                com.baidu.idl.face.platform.FaceStatusNewEnum[] r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.AnonymousClass2.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum = r0
                com.baidu.idl.face.platform.FaceStatusNewEnum r2 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeNoFaceDetected     // Catch: java.lang.NoSuchFieldError -> L39
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L39
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L39
            L39:
                return
        }

        public AnonymousClass2() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum LivenessStatus extends java.lang.Enum<com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus> {
        private static final /* synthetic */ com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus[] $VALUES = null;
        public static final com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus LivenessCourse = null;
        public static final com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus LivenessCrop = null;
        public static final com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus LivenessOK = null;
        public static final com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus LivenessReady = null;
        public static final com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus LivenessTips = null;

        static {
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r0 = new com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus
                java.lang.String r1 = "LivenessReady"
                r2 = 0
                r0.<init>(r1, r2)
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.LivenessReady = r0
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r1 = new com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus
                java.lang.String r3 = "LivenessTips"
                r4 = 1
                r1.<init>(r3, r4)
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.LivenessTips = r1
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r3 = new com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus
                java.lang.String r5 = "LivenessOK"
                r6 = 2
                r3.<init>(r5, r6)
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.LivenessOK = r3
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r5 = new com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus
                java.lang.String r7 = "LivenessCourse"
                r8 = 3
                r5.<init>(r7, r8)
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.LivenessCourse = r5
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r7 = new com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus
                java.lang.String r9 = "LivenessCrop"
                r10 = 4
                r7.<init>(r9, r10)
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.LivenessCrop = r7
                r9 = 5
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus[] r9 = new com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.$VALUES = r9
                return
        }

        LivenessStatus(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus valueOf(java.lang.String r1) {
                java.lang.Class<com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus> r0 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r1 = (com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus) r1
                return r1
        }

        public static com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus[] values() {
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus[] r0 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.$VALUES
                java.lang.Object r0 = r0.clone()
                com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus[] r0 = (com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus[]) r0
                return r0
        }
    }

    static {
            return
    }

    public FaceLivenessStrategyExtModule(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.mIsEnableSound = r0
            r0 = 0
            r2.mSoundPlayHelper = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mTipsMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mBase64ImageCropMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mBase64ImageSrcMap = r0
            r0 = 0
            r2.mNoFaceTime = r0
            com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r0 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.LivenessCrop
            r2.mLivenessStatus = r0
            r0 = -1
            r2.mFaceID = r0
            com.baidu.idl.face.platform.common.LogHelper.clear()
            java.lang.String r0 = "ca"
            java.lang.String r1 = "Baidu-IDL-FaceSDK4.1.5"
            com.baidu.idl.face.platform.common.LogHelper.addLog(r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "system"
            com.baidu.idl.face.platform.common.LogHelper.addLog(r1, r0)
            java.lang.String r0 = "version"
            java.lang.String r1 = "4.1.5"
            com.baidu.idl.face.platform.common.LogHelper.addLog(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = android.os.Build.MODEL
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "device"
            com.baidu.idl.face.platform.common.LogHelper.addLog(r1, r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "stm"
            com.baidu.idl.face.platform.common.LogHelper.addLog(r1, r0)
            r2.mContext = r3
            com.baidu.idl.face.platform.strategy.DetectStrategy r0 = new com.baidu.idl.face.platform.strategy.DetectStrategy
            r0.<init>()
            r2.mDetectStrategy = r0
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r0 = new com.baidu.idl.face.platform.strategy.LivenessStatusStrategy
            r0.<init>()
            r2.mLivenessStrategy = r0
            com.baidu.idl.face.platform.decode.FaceModuleNew r0 = new com.baidu.idl.face.platform.decode.FaceModuleNew
            r0.<init>()
            r2.mFaceModule = r0
            com.baidu.idl.face.platform.common.SoundPoolHelper r0 = new com.baidu.idl.face.platform.common.SoundPoolHelper
            r0.<init>(r3)
            r2.mSoundPlayHelper = r0
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r3.<init>(r0)
            r2.mAnimHandler = r3
            return
    }

    static /* synthetic */ com.baidu.idl.face.platform.strategy.LivenessStatusStrategy access$000(com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule r0) {
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r0 = r0.mLivenessStrategy
            return r0
    }

    static /* synthetic */ com.baidu.idl.face.platform.ILivenessViewCallback access$100(com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule r0) {
            com.baidu.idl.face.platform.ILivenessViewCallback r0 = r0.mILivenessViewCallback
            return r0
    }

    static /* synthetic */ boolean access$202(com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule r0, boolean r1) {
            r0.mTipLiveTimeout = r1
            return r1
    }

    private boolean cropStrategy(com.baidu.idl.main.facesdk.model.BDFaceImageInstance r8, com.baidu.idl.face.platform.model.FaceExtInfo r9, com.baidu.idl.face.platform.LivenessTypeEnum r10, int r11) {
            r7 = this;
            com.baidu.idl.face.platform.strategy.DetectStrategy r10 = r7.mDetectStrategy
            com.baidu.idl.face.platform.FaceConfig r0 = r7.mFaceConfig
            com.baidu.idl.face.platform.FaceStatusNewEnum r2 = r10.getCropStatus(r9, r0)
            com.baidu.idl.face.platform.FaceStatusNewEnum r10 = com.baidu.idl.face.platform.FaceStatusNewEnum.OK
            r0 = 0
            if (r2 == r10) goto L1c
            com.baidu.idl.face.platform.ILivenessStrategyCallback r1 = r7.mILivenessStrategyCallback
            if (r1 == 0) goto L1b
            java.lang.String r3 = r7.getStatusTextResId(r2)
            r5 = 0
            r6 = 0
            r4 = 0
            r1.onLivenessCompletion(r2, r3, r4, r5, r6)
        L1b:
            return r0
        L1c:
            com.baidu.idl.face.platform.strategy.DetectStrategy r10 = r7.mDetectStrategy
            float r10 = r10.getTotalCropScore()
            com.baidu.idl.face.platform.decode.FaceModuleNew r1 = r7.mFaceModule
            com.baidu.idl.face.platform.FaceConfig r2 = r7.mFaceConfig
            r1.setFaceConfig(r2)
            com.baidu.idl.face.platform.FaceSDKManager r1 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            float[] r2 = r9.getmLandmarks()
            com.baidu.idl.face.platform.FaceConfig r3 = r7.mFaceConfig
            int r3 = r3.getCropHeight()
            com.baidu.idl.face.platform.FaceConfig r4 = r7.mFaceConfig
            int r4 = r4.getCropWidth()
            com.baidu.idl.main.facesdk.model.BDFaceImageInstance r1 = r1.cropFace(r8, r2, r3, r4)
            if (r1 != 0) goto L44
            return r0
        L44:
            r7.saveCropImageInstance(r9, r1, r11, r10)
            r1.destory()
            com.baidu.idl.main.facesdk.model.BDFaceImageInstance r8 = r8.getImage()
            r7.saveSrcImageInstance(r9, r8, r11, r10)
            r8 = 1
            return r8
    }

    private java.lang.String getStatusTextResId(com.baidu.idl.face.platform.FaceStatusNewEnum r4) {
            r3 = this;
            java.lang.String r0 = ""
            java.util.Map<com.baidu.idl.face.platform.FaceStatusNewEnum, java.lang.String> r1 = r3.mTipsMap     // Catch: java.lang.Exception -> L29
            boolean r1 = r1.containsKey(r4)     // Catch: java.lang.Exception -> L29
            if (r1 == 0) goto L13
            java.util.Map<com.baidu.idl.face.platform.FaceStatusNewEnum, java.lang.String> r1 = r3.mTipsMap     // Catch: java.lang.Exception -> L29
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Exception -> L29
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L29
            return r4
        L13:
            int r1 = com.baidu.idl.face.platform.FaceEnvironment.getTipsId(r4)     // Catch: java.lang.Exception -> L29
            if (r1 <= 0) goto L29
            android.content.Context r2 = r3.mContext     // Catch: java.lang.Exception -> L29
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Exception -> L29
            java.lang.String r1 = r2.getString(r1)     // Catch: java.lang.Exception -> L29
            java.util.Map<com.baidu.idl.face.platform.FaceStatusNewEnum, java.lang.String> r2 = r3.mTipsMap     // Catch: java.lang.Exception -> L29
            r2.put(r4, r1)     // Catch: java.lang.Exception -> L29
            return r1
        L29:
            return r0
    }

    private void judgeLivenessTimeout() {
            r4 = this;
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r0 = r4.mLivenessStrategy
            com.baidu.idl.face.platform.FaceConfig r1 = r4.mFaceConfig
            boolean r0 = r0.isCourseTimeout(r1)
            if (r0 == 0) goto L39
            boolean r0 = r4.mTipLiveTimeout
            if (r0 != 0) goto L39
            com.baidu.idl.face.platform.ILivenessViewCallback r0 = r4.mILivenessViewCallback
            if (r0 == 0) goto L1b
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r1 = r4.mLivenessStrategy
            com.baidu.idl.face.platform.LivenessTypeEnum r1 = r1.getCurrentLivenessType()
            r0.setCurrentLiveType(r1)
        L1b:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionCodeTimeout
            r1 = 0
            r4.processUICallback(r0, r1)
            android.os.Handler r0 = r4.mAnimHandler
            com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$1 r1 = new com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$1
            r1.<init>(r4)
            com.baidu.idl.face.platform.manager.TimeManager r2 = com.baidu.idl.face.platform.manager.TimeManager.getInstance()
            int r2 = r2.getActiveAnimTime()
            int r2 = r2 + 1000
            long r2 = (long) r2
            r0.postDelayed(r1, r2)
            r0 = 1
            r4.mTipLiveTimeout = r0
        L39:
            return
    }

    private void process(byte[] r2) {
            r1 = this;
            int r0 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.mProcessCount
            if (r0 <= 0) goto L5
            return
        L5:
            int r0 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.mProcessCount
            int r0 = r0 + 1
            com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.mProcessCount = r0
            r1.processStrategy(r2)
            int r2 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.mProcessCount
            int r2 = r2 + (-1)
            com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.mProcessCount = r2
            return
    }

    private void processStrategy(byte[] r8) {
            r7 = this;
            com.baidu.idl.main.facesdk.model.BDFaceImageInstance r0 = new com.baidu.idl.main.facesdk.model.BDFaceImageInstance
            android.graphics.Rect r1 = r7.mPreviewRect
            int r2 = r1.width()
            android.graphics.Rect r1 = r7.mPreviewRect
            int r3 = r1.height()
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType r4 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType.BDFACE_IMAGE_TYPE_YUV_NV21
            int r1 = r7.mPreviewDegree
            int r1 = 360 - r1
            float r5 = (float) r1
            r6 = 1
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.baidu.idl.face.platform.FaceSDKManager r8 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            com.baidu.idl.main.facesdk.FaceInfo[] r8 = r8.detect(r0)
            com.baidu.idl.face.platform.model.FaceModel r8 = r7.setFaceModel(r8)
            r7.processUIResult(r8, r0)
            return
    }

    private void processUICallback(com.baidu.idl.face.platform.FaceStatusNewEnum r14, com.baidu.idl.face.platform.model.FaceExtInfo r15) {
            r13 = this;
            com.baidu.idl.face.platform.FaceStatusNewEnum r15 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTimeout
            java.lang.String r0 = "etm"
            if (r14 != r15) goto L11
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r15 = java.lang.Long.valueOf(r1)
            com.baidu.idl.face.platform.common.LogHelper.addLogWithKey(r0, r15)
        L11:
            com.baidu.idl.face.platform.FaceStatusNewEnum r15 = com.baidu.idl.face.platform.FaceStatusNewEnum.OK
            r1 = 1
            if (r14 != r15) goto L45
            r13.mIsProcessing = r1
            r13.mIsCompletion = r1
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r15 = java.lang.Long.valueOf(r2)
            com.baidu.idl.face.platform.common.LogHelper.addLogWithKey(r0, r15)
            java.lang.String r15 = "finish"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            com.baidu.idl.face.platform.common.LogHelper.addLogWithKey(r15, r0)
            com.baidu.idl.face.platform.ILivenessStrategyCallback r1 = r13.mILivenessStrategyCallback
            if (r1 == 0) goto L77
            java.lang.String r3 = r13.getStatusTextResId(r14)
            java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r4 = r13.mBase64ImageCropMap
            java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r5 = r13.mBase64ImageSrcMap
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r15 = r13.mLivenessStrategy
            int r6 = r15.getCurrentLivenessCount()
            r2 = r14
            r1.onLivenessCompletion(r2, r3, r4, r5, r6)
            return
        L45:
            r8 = r14
            com.baidu.idl.face.platform.FaceStatusNewEnum r14 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionComplete
            if (r8 != r14) goto L60
            com.baidu.idl.face.platform.ILivenessStrategyCallback r7 = r13.mILivenessStrategyCallback
            if (r7 == 0) goto L77
            java.lang.String r9 = r13.getStatusTextResId(r8)
            java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r10 = r13.mBase64ImageCropMap
            java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r11 = r13.mBase64ImageSrcMap
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r14 = r13.mLivenessStrategy
            int r12 = r14.getCurrentLivenessCount()
            r7.onLivenessCompletion(r8, r9, r10, r11, r12)
            return
        L60:
            com.baidu.idl.face.platform.ILivenessStrategyCallback r7 = r13.mILivenessStrategyCallback
            if (r7 == 0) goto L77
            java.lang.String r9 = r13.getStatusTextResId(r8)
            java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r10 = r13.mBase64ImageCropMap
            java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r11 = r13.mBase64ImageSrcMap
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r14 = r13.mLivenessStrategy
            int r14 = r14.getCurrentLivenessCount()
            int r12 = r14 + (-1)
            r7.onLivenessCompletion(r8, r9, r10, r11, r12)
        L77:
            return
    }

    private void processUIResult(com.baidu.idl.face.platform.model.FaceModel r14, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r15) {
            r13 = this;
            if (r15 != 0) goto L4
            goto L1cf
        L4:
            boolean r0 = r13.mIsProcessing
            if (r0 == 0) goto Lc
            r15.destory()
            return
        Lc:
            if (r14 == 0) goto L1c5
            com.baidu.idl.face.platform.model.FaceExtInfo[] r0 = r14.getFaceInfos()
            if (r0 == 0) goto L1c5
            com.baidu.idl.face.platform.model.FaceExtInfo[] r0 = r14.getFaceInfos()
            int r0 = r0.length
            if (r0 != 0) goto L1d
            goto L1c5
        L1d:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = r14.getFaceModuleStateNew()
            com.baidu.idl.face.platform.model.FaceExtInfo[] r14 = r14.getFaceInfos()
            r1 = 0
            r14 = r14[r1]
            com.baidu.idl.face.platform.FaceStatusNewEnum r2 = com.baidu.idl.face.platform.FaceStatusNewEnum.OK
            r3 = 0
            r5 = 0
            r6 = 1
            if (r0 == r2) goto Lb4
            com.baidu.idl.face.platform.strategy.DetectStrategy r2 = r13.mDetectStrategy
            boolean r2 = r2.isTimeout()
            if (r2 == 0) goto L43
            r15.destory()
            r13.mIsProcessing = r6
            com.baidu.idl.face.platform.FaceStatusNewEnum r14 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTimeout
            r13.processUICallback(r14, r5)
            return
        L43:
            int[] r2 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.AnonymousClass2.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum
            int r7 = r0.ordinal()
            r2 = r2[r7]
            if (r2 == r6) goto L5e
            r15.destory()
            r13.processUITips(r0, r14)
            com.baidu.idl.face.platform.strategy.DetectStrategy r14 = r13.mDetectStrategy
            r14.reset()
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r14 = r13.mLivenessStrategy
            r14.resetState()
            return
        L5e:
            long r7 = r13.mNoFaceTime
            int r14 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r14 != 0) goto L6a
            long r7 = java.lang.System.currentTimeMillis()
            r13.mNoFaceTime = r7
        L6a:
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r13.mNoFaceTime
            long r7 = r7 - r9
            com.baidu.idl.face.platform.FaceConfig r14 = r13.mFaceConfig
            long r9 = r14.getTimeDetectModule()
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 <= 0) goto L86
            r15.destory()
            r13.mIsProcessing = r6
            com.baidu.idl.face.platform.FaceStatusNewEnum r14 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTimeout
            r13.processUICallback(r14, r5)
            return
        L86:
            boolean r14 = r13.mIsFirstLivenessSuccessTipsed
            if (r14 == 0) goto La1
            long r6 = r13.mNoFaceTime
            int r14 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r14 == 0) goto La1
            long r2 = java.lang.System.currentTimeMillis()
            long r6 = r13.mNoFaceTime
            long r2 = r2 - r6
            long r6 = com.baidu.idl.face.platform.FaceEnvironment.TIME_DETECT_NO_FACE_CONTINUOUS
            int r14 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r14 >= 0) goto La1
            r15.destory()
            return
        La1:
            r13.mIsFirstLivenessSuccessTipsed = r1
            r15.destory()
            com.baidu.idl.face.platform.strategy.DetectStrategy r14 = r13.mDetectStrategy
            r14.reset()
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r14 = r13.mLivenessStrategy
            r14.resetState()
            r13.processUITips(r0, r5)
            return
        Lb4:
            if (r14 != 0) goto Lb8
            goto L1cf
        Lb8:
            com.baidu.idl.face.platform.ILivenessViewCallback r0 = r13.mILivenessViewCallback
            if (r0 == 0) goto Lbf
            r0.setFaceInfo(r14)
        Lbf:
            com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r0 = r13.mLivenessStatus
            com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r7 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.LivenessCrop
            if (r0 != r7) goto Le7
            int r0 = r13.mCropCount
            com.baidu.idl.face.platform.FaceConfig r8 = r13.mFaceConfig
            int r8 = r8.getCacheImageNum()
            if (r0 >= r8) goto Le3
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r0 = r13.mLivenessStrategy
            com.baidu.idl.face.platform.LivenessTypeEnum r0 = r0.getCurrentLivenessType()
            int r8 = r13.mCropCount
            boolean r0 = r13.cropStrategy(r15, r14, r0, r8)
            if (r0 == 0) goto Le7
            int r0 = r13.mCropCount
            int r0 = r0 + r6
            r13.mCropCount = r0
            goto Le7
        Le3:
            com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r0 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.LivenessReady
            r13.mLivenessStatus = r0
        Le7:
            com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r0 = r13.mLivenessStatus
            com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r8 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.LivenessReady
            if (r0 == r8) goto Lf3
            com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r0 = r13.mLivenessStatus
            com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r9 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.LivenessTips
            if (r0 != r9) goto L139
        Lf3:
            int r0 = r14.getFaceId()
            long r9 = (long) r0
            long r11 = r13.mFaceID
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 == 0) goto L132
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r0 = r13.mLivenessStrategy
            r0.reset()
            com.baidu.idl.face.platform.FaceSDKManager r0 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            r0.clearActionHistory()
            long r9 = r13.mFaceID
            r11 = -1
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 == 0) goto L124
            r13.mLivenessStatus = r7
            r13.mCropCount = r1
            java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r0 = r13.mBase64ImageCropMap
            if (r0 == 0) goto L11d
            r0.clear()
        L11d:
            java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r0 = r13.mBase64ImageSrcMap
            if (r0 == 0) goto L124
            r0.clear()
        L124:
            com.baidu.idl.face.platform.ILivenessViewCallback r0 = r13.mILivenessViewCallback
            if (r0 == 0) goto L12b
            r0.viewReset()
        L12b:
            int r0 = r14.getFaceId()
            long r0 = (long) r0
            r13.mFaceID = r0
        L132:
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r0 = r13.mLivenessStrategy
            android.graphics.Rect r1 = r13.mPreviewRect
            r0.processLiveness(r14, r15, r1)
        L139:
            r13.mNoFaceTime = r3
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "btm"
            com.baidu.idl.face.platform.common.LogHelper.addLogWithKey(r1, r0)
            int[] r0 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.AnonymousClass2.$SwitchMap$com$baidu$idl$face$platform$strategy$FaceLivenessStrategyExtModule$LivenessStatus
            com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r1 = r13.mLivenessStatus
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r6) goto L1b1
            r1 = 2
            if (r0 == r1) goto L185
            r1 = 3
            if (r0 == r1) goto L15b
            goto L1c1
        L15b:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionComplete
            boolean r0 = r13.processUITips(r0, r14)
            if (r0 == 0) goto L1c1
            boolean r0 = r13.mIsFirstLivenessSuccessTipsed
            if (r0 != 0) goto L169
            r13.mIsFirstLivenessSuccessTipsed = r6
        L169:
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r0 = r13.mLivenessStrategy
            boolean r0 = r0.isExistNextLiveness()
            if (r0 == 0) goto L179
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r14 = r13.mLivenessStrategy
            r14.startNextLiveness()
            r13.mLivenessStatus = r8
            goto L1c1
        L179:
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r0 = r13.mLivenessStrategy
            boolean r0 = r0.isLivenessSuccess()
            if (r0 == 0) goto L1c1
            r13.processUICallback(r2, r14)
            goto L1c1
        L185:
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r0 = r13.mLivenessStrategy
            boolean r0 = r0.isCurrentLivenessSuccess()
            if (r0 == 0) goto L192
            com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r14 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.LivenessOK
            r13.mLivenessStatus = r14
            goto L1c1
        L192:
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r0 = r13.mLivenessStrategy
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = r0.getCurrentLivenessNewStatus()
            r13.processUITips(r0, r14)
            r13.judgeLivenessTimeout()
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r14 = r13.mLivenessStrategy
            boolean r14 = r14.isTimeout()
            if (r14 == 0) goto L1c1
            r15.destory()
            r13.mIsProcessing = r6
            com.baidu.idl.face.platform.FaceStatusNewEnum r14 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTimeout
            r13.processUICallback(r14, r5)
            return
        L1b1:
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r0 = r13.mLivenessStrategy
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = r0.getCurrentLivenessNewStatus()
            boolean r14 = r13.processUITips(r0, r14)
            if (r14 == 0) goto L1c1
            com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule$LivenessStatus r14 = com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule.LivenessStatus.LivenessTips
            r13.mLivenessStatus = r14
        L1c1:
            r15.destory()
            return
        L1c5:
            r15.destory()
            com.baidu.idl.face.platform.strategy.DetectStrategy r14 = r13.mDetectStrategy
            if (r14 == 0) goto L1cf
            r14.reset()
        L1cf:
            return
    }

    private boolean processUITips(com.baidu.idl.face.platform.FaceStatusNewEnum r3, com.baidu.idl.face.platform.model.FaceExtInfo r4) {
            r2 = this;
            if (r3 == 0) goto L1c
            com.baidu.idl.face.platform.common.SoundPoolHelper r0 = r2.mSoundPlayHelper
            boolean r1 = r2.mIsEnableSound
            r0.setEnableSound(r1)
            com.baidu.idl.face.platform.common.SoundPoolHelper r0 = r2.mSoundPlayHelper
            boolean r0 = r0.playSound(r3)
            if (r0 == 0) goto L1b
            java.lang.String r1 = r3.name()
            com.baidu.idl.face.platform.common.LogHelper.addTipsLogWithKey(r1)
            r2.processUICallback(r3, r4)
        L1b:
            return r0
        L1c:
            r3 = 0
            return r3
    }

    private void saveCropImageInstance(com.baidu.idl.face.platform.model.FaceExtInfo r3, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r4, int r5, float r6) {
            r2 = this;
            com.baidu.idl.face.platform.decode.FaceModuleNew r0 = r2.mFaceModule
            java.util.ArrayList r3 = r0.getDetectBestCropImageList(r3, r4)
            if (r3 == 0) goto L31
            int r4 = r3.size()
            if (r4 <= 0) goto L31
            java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r4 = r2.mBase64ImageCropMap
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "bestCropImage_"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = "_"
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = r0.toString()
            r6 = 0
            java.lang.Object r3 = r3.get(r6)
            r4.put(r5, r3)
        L31:
            return
    }

    private void saveSrcImageInstance(com.baidu.idl.face.platform.model.FaceExtInfo r3, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r4, int r5, float r6) {
            r2 = this;
            com.baidu.idl.face.platform.decode.FaceModuleNew r0 = r2.mFaceModule
            java.util.ArrayList r3 = r0.getDetectBestSrcImageList(r3, r4)
            if (r3 == 0) goto L31
            int r4 = r3.size()
            if (r4 <= 0) goto L31
            java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r4 = r2.mBase64ImageSrcMap
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "bestSrcImage_"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = "_"
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = r0.toString()
            r6 = 0
            java.lang.Object r3 = r3.get(r6)
            r4.put(r5, r3)
        L31:
            return
    }

    private com.baidu.idl.face.platform.model.FaceModel setFaceModel(com.baidu.idl.main.facesdk.FaceInfo[] r5) {
            r4 = this;
            com.baidu.idl.face.platform.decode.FaceModuleNew r0 = r4.mFaceModule
            com.baidu.idl.face.platform.model.FaceExtInfo[] r5 = r0.getFaceExtInfo(r5)
            com.baidu.idl.face.platform.model.FaceModel r0 = new com.baidu.idl.face.platform.model.FaceModel
            r0.<init>()
            r0.setFaceInfos(r5)
            com.baidu.idl.face.platform.strategy.DetectStrategy r1 = r4.mDetectStrategy
            android.graphics.Rect r2 = r4.mDetectRect
            com.baidu.idl.face.platform.FaceConfig r3 = r4.mFaceConfig
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = r1.checkDetect(r2, r5, r3)
            r0.setFaceModuleStateNew(r5)
            long r1 = java.lang.System.currentTimeMillis()
            r0.setFrameTime(r1)
            return r0
    }

    @Override // com.baidu.idl.face.platform.ILivenessStrategy
    public void livenessStrategy(byte[] r2) {
            r1 = this;
            boolean r0 = r1.mIsFirstTipsed
            if (r0 != 0) goto Le
            r2 = 1
            r1.mIsFirstTipsed = r2
            com.baidu.idl.face.platform.FaceStatusNewEnum r2 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeNoFaceDetected
            r0 = 0
            r1.processUITips(r2, r0)
            return
        Le:
            boolean r0 = r1.mIsProcessing
            if (r0 != 0) goto L15
            r1.process(r2)
        L15:
            return
    }

    @Override // com.baidu.idl.face.platform.ILivenessStrategy
    public void reset() {
            r2 = this;
            com.baidu.idl.face.platform.FaceSDKManager r0 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            r0.clearActionHistory()
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r0 = r2.mLivenessStrategy
            if (r0 == 0) goto Le
            r0.reset()
        Le:
            java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r0 = r2.mBase64ImageCropMap
            if (r0 == 0) goto L15
            r0.clear()
        L15:
            java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r0 = r2.mBase64ImageSrcMap
            if (r0 == 0) goto L1c
            r0.clear()
        L1c:
            com.baidu.idl.face.platform.common.SoundPoolHelper r0 = r2.mSoundPlayHelper
            if (r0 == 0) goto L23
            r0.release()
        L23:
            android.os.Handler r0 = r2.mAnimHandler
            if (r0 == 0) goto L2d
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            r2.mAnimHandler = r1
        L2d:
            r0 = 0
            r2.mIsFirstTipsed = r0
            r2.mIsProcessing = r0
            return
    }

    public void setConfig(com.baidu.idl.face.platform.FaceConfig r1) {
            r0 = this;
            r0.mFaceConfig = r1
            return
    }

    public void setILivenessViewCallback(com.baidu.idl.face.platform.ILivenessViewCallback r1) {
            r0 = this;
            r0.mILivenessViewCallback = r1
            return
    }

    @Override // com.baidu.idl.face.platform.ILivenessStrategy
    public void setLivenessStrategyConfig(java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r2, android.graphics.Rect r3, android.graphics.Rect r4, com.baidu.idl.face.platform.ILivenessStrategyCallback r5) {
            r1 = this;
            com.baidu.idl.face.platform.strategy.LivenessStatusStrategy r0 = r1.mLivenessStrategy
            r0.setLivenessList(r2)
            r1.mPreviewRect = r3
            r1.mDetectRect = r4
            r1.mILivenessStrategyCallback = r5
            return
    }

    @Override // com.baidu.idl.face.platform.ILivenessStrategy
    public void setLivenessStrategySoundEnable(boolean r1) {
            r0 = this;
            r0.mIsEnableSound = r1
            return
    }

    @Override // com.baidu.idl.face.platform.ILivenessStrategy
    public void setPreviewDegree(int r1) {
            r0 = this;
            r0.mPreviewDegree = r1
            return
    }
}
