package com.baidu.idl.face.platform.strategy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceDetectStrategyExtModule implements com.baidu.idl.face.platform.IDetectStrategy {
    private static final java.lang.String TAG = "com.baidu.idl.face.platform.strategy.FaceDetectStrategyExtModule";
    private static volatile int mProcessCount;
    private java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> mBase64ImageCropMap;
    private java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> mBase64ImageSrcMap;
    private android.content.Context mContext;
    private int mDegree;
    private int mDetectCount;
    private android.graphics.Rect mDetectRect;
    private final com.baidu.idl.face.platform.strategy.DetectStrategy mDetectStrategy;
    private com.baidu.idl.face.platform.FaceConfig mFaceConfig;
    private final com.baidu.idl.face.platform.decode.FaceModuleNew mFaceModule;
    private com.baidu.idl.face.platform.IDetectStrategyCallback mIDetectStrategyCallback;
    private volatile boolean mIsCompletion;
    private volatile boolean mIsEnableSound;
    private boolean mIsFirstTipsed;
    private volatile boolean mIsProcessing;
    private long mNoFaceTime;
    private android.graphics.Rect mPreviewRect;
    private final com.baidu.idl.face.platform.common.SoundPoolHelper mSoundPlayHelper;
    private java.util.Map<com.baidu.idl.face.platform.FaceStatusNewEnum, java.lang.String> mTipsMap;

    static {
            return
    }

    public FaceDetectStrategyExtModule(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mIsFirstTipsed = r0
            r2.mIsCompletion = r0
            r1 = 1
            r2.mIsEnableSound = r1
            r2.mDetectCount = r0
            r0 = 0
            r2.mNoFaceTime = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mTipsMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mBase64ImageCropMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mBase64ImageSrcMap = r0
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
            com.baidu.idl.face.platform.common.SoundPoolHelper r0 = new com.baidu.idl.face.platform.common.SoundPoolHelper
            r0.<init>(r3)
            r2.mSoundPlayHelper = r0
            com.baidu.idl.face.platform.decode.FaceModuleNew r3 = new com.baidu.idl.face.platform.decode.FaceModuleNew
            r3.<init>()
            r2.mFaceModule = r3
            return
    }

    private boolean cropStrategy(com.baidu.idl.main.facesdk.model.BDFaceImageInstance r6, com.baidu.idl.face.platform.model.FaceExtInfo r7, int r8) {
            r5 = this;
            com.baidu.idl.face.platform.strategy.DetectStrategy r0 = r5.mDetectStrategy
            float r0 = r0.getTotalCropScore()
            com.baidu.idl.face.platform.decode.FaceModuleNew r1 = r5.mFaceModule
            com.baidu.idl.face.platform.FaceConfig r2 = r5.mFaceConfig
            r1.setFaceConfig(r2)
            com.baidu.idl.face.platform.FaceSDKManager r1 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            float[] r2 = r7.getmLandmarks()
            com.baidu.idl.face.platform.FaceConfig r3 = r5.mFaceConfig
            int r3 = r3.getCropHeight()
            com.baidu.idl.face.platform.FaceConfig r4 = r5.mFaceConfig
            int r4 = r4.getCropWidth()
            com.baidu.idl.main.facesdk.model.BDFaceImageInstance r1 = r1.cropFace(r6, r2, r3, r4)
            if (r1 != 0) goto L29
            r6 = 0
            return r6
        L29:
            r5.saveCropImageInstance(r7, r1, r8, r0)
            r1.destory()
            com.baidu.idl.main.facesdk.model.BDFaceImageInstance r6 = r6.getImage()
            r5.saveSrcImageInstance(r7, r6, r8, r0)
            r6 = 1
            return r6
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

    private void process(byte[] r2) {
            r1 = this;
            int r0 = com.baidu.idl.face.platform.strategy.FaceDetectStrategyExtModule.mProcessCount
            if (r0 <= 0) goto L5
            return
        L5:
            int r0 = com.baidu.idl.face.platform.strategy.FaceDetectStrategyExtModule.mProcessCount
            int r0 = r0 + 1
            com.baidu.idl.face.platform.strategy.FaceDetectStrategyExtModule.mProcessCount = r0
            r1.processStrategy(r2)
            int r2 = com.baidu.idl.face.platform.strategy.FaceDetectStrategyExtModule.mProcessCount
            int r2 = r2 + (-1)
            com.baidu.idl.face.platform.strategy.FaceDetectStrategyExtModule.mProcessCount = r2
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
            int r1 = r7.mDegree
            int r1 = 360 - r1
            float r5 = (float) r1
            r6 = 1
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.baidu.idl.face.platform.FaceSDKManager r8 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            com.baidu.idl.main.facesdk.FaceInfo[] r8 = r8.detect(r0)
            com.baidu.idl.face.platform.model.FaceModel r8 = r7.setFaceModel(r8, r0)
            r7.processUIResult(r8, r0)
            return
    }

    private void processUICallback(com.baidu.idl.face.platform.FaceStatusNewEnum r4, com.baidu.idl.face.platform.model.FaceExtInfo r5) {
            r3 = this;
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTimeout
            java.lang.String r0 = "etm"
            if (r4 != r5) goto L11
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            com.baidu.idl.face.platform.common.LogHelper.addLogWithKey(r0, r5)
        L11:
            com.baidu.idl.face.platform.IDetectStrategyCallback r5 = r3.mIDetectStrategyCallback
            if (r5 == 0) goto L48
            com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.OK
            if (r4 != r1) goto L40
            r5 = 1
            r3.mIsProcessing = r5
            r3.mIsCompletion = r5
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.baidu.idl.face.platform.common.LogHelper.addLogWithKey(r0, r1)
            java.lang.String r0 = "finish"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.baidu.idl.face.platform.common.LogHelper.addLogWithKey(r0, r5)
            com.baidu.idl.face.platform.IDetectStrategyCallback r5 = r3.mIDetectStrategyCallback
            java.lang.String r0 = r3.getStatusTextResId(r4)
            java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r1 = r3.mBase64ImageCropMap
            java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r2 = r3.mBase64ImageSrcMap
            r5.onDetectCompletion(r4, r0, r1, r2)
            return
        L40:
            java.lang.String r0 = r3.getStatusTextResId(r4)
            r1 = 0
            r5.onDetectCompletion(r4, r0, r1, r1)
        L48:
            return
    }

    private void processUIResult(com.baidu.idl.face.platform.model.FaceModel r8, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r9) {
            r7 = this;
            if (r9 != 0) goto L3
            goto L52
        L3:
            boolean r0 = r7.mIsProcessing
            if (r0 == 0) goto Lb
            r9.destory()
            return
        Lb:
            r0 = 0
            if (r8 == 0) goto L30
            com.baidu.idl.face.platform.model.FaceExtInfo[] r1 = r8.getFaceInfos()
            if (r1 == 0) goto L30
            com.baidu.idl.face.platform.model.FaceExtInfo[] r1 = r8.getFaceInfos()
            int r1 = r1.length
            if (r1 <= 0) goto L30
            com.baidu.idl.face.platform.model.FaceExtInfo[] r1 = r8.getFaceInfos()
            r2 = 0
            r1 = r1[r2]
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "ftm"
            com.baidu.idl.face.platform.common.LogHelper.addLogWithKey(r3, r2)
            goto L38
        L30:
            com.baidu.idl.face.platform.strategy.DetectStrategy r1 = r7.mDetectStrategy
            if (r1 == 0) goto L37
            r1.reset()
        L37:
            r1 = r0
        L38:
            r2 = 1
            if (r1 == 0) goto La3
            com.baidu.idl.face.platform.strategy.DetectStrategy r3 = r7.mDetectStrategy
            if (r3 != 0) goto L43
            r9.destory()
            return
        L43:
            boolean r3 = r7.mIsCompletion
            if (r3 == 0) goto L50
            com.baidu.idl.face.platform.FaceStatusNewEnum r8 = com.baidu.idl.face.platform.FaceStatusNewEnum.OK
            r7.processUITips(r8, r1)
            r9.destory()
            return
        L50:
            if (r8 != 0) goto L53
        L52:
            return
        L53:
            com.baidu.idl.face.platform.FaceStatusNewEnum r8 = r8.getFaceModuleStateNew()
            com.baidu.idl.face.platform.FaceStatusNewEnum r3 = com.baidu.idl.face.platform.FaceStatusNewEnum.OK
            if (r8 != r3) goto L89
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            java.lang.String r0 = "btm"
            com.baidu.idl.face.platform.common.LogHelper.addLogWithKey(r0, r8)
            int r8 = r7.mDetectCount
            com.baidu.idl.face.platform.FaceConfig r0 = r7.mFaceConfig
            int r0 = r0.getCacheImageNum()
            if (r8 >= r0) goto L80
            int r8 = r7.mDetectCount
            boolean r8 = r7.cropStrategy(r9, r1, r8)
            if (r8 == 0) goto L85
            int r8 = r7.mDetectCount
            int r8 = r8 + r2
            r7.mDetectCount = r8
            goto L85
        L80:
            r7.mIsCompletion = r2
            r7.processUITips(r3, r1)
        L85:
            r9.destory()
            return
        L89:
            com.baidu.idl.face.platform.strategy.DetectStrategy r3 = r7.mDetectStrategy
            boolean r3 = r3.isTimeout()
            if (r3 == 0) goto L9c
            r7.mIsProcessing = r2
            r9.destory()
            com.baidu.idl.face.platform.FaceStatusNewEnum r8 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTimeout
            r7.processUICallback(r8, r0)
            return
        L9c:
            r7.processUITips(r8, r1)
            r9.destory()
            return
        La3:
            com.baidu.idl.face.platform.strategy.DetectStrategy r1 = r7.mDetectStrategy
            if (r1 != 0) goto Lab
            r9.destory()
            return
        Lab:
            r3 = 0
            if (r8 == 0) goto Led
            com.baidu.idl.face.platform.FaceStatusNewEnum r1 = r8.getFaceModuleStateNew()
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeNoFaceDetected
            if (r1 == r5) goto Lbf
            com.baidu.idl.face.platform.FaceStatusNewEnum r8 = r8.getFaceModuleStateNew()
            com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeBeyondPreviewFrame
            if (r8 != r1) goto Led
        Lbf:
            com.baidu.idl.face.platform.strategy.DetectStrategy r8 = r7.mDetectStrategy
            r8.reset()
            long r5 = r7.mNoFaceTime
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 != 0) goto Ld1
            long r3 = java.lang.System.currentTimeMillis()
            r7.mNoFaceTime = r3
            goto Lef
        Ld1:
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r7.mNoFaceTime
            long r3 = r3 - r5
            com.baidu.idl.face.platform.FaceConfig r8 = r7.mFaceConfig
            long r5 = r8.getTimeDetectModule()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto Lef
            r7.mIsProcessing = r2
            r9.destory()
            com.baidu.idl.face.platform.FaceStatusNewEnum r8 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTimeout
            r7.processUICallback(r8, r0)
            return
        Led:
            r7.mNoFaceTime = r3
        Lef:
            com.baidu.idl.face.platform.strategy.DetectStrategy r8 = r7.mDetectStrategy
            boolean r8 = r8.isTimeout()
            if (r8 == 0) goto L102
            r9.destory()
            r7.mIsProcessing = r2
            com.baidu.idl.face.platform.FaceStatusNewEnum r8 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTimeout
            r7.processUICallback(r8, r0)
            return
        L102:
            com.baidu.idl.face.platform.FaceStatusNewEnum r8 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeNoFaceDetected
            r7.processUITips(r8, r0)
            r9.destory()
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
            java.lang.String r1 = "bestCropDetectImage_"
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
            java.lang.String r1 = "bestSrcDetectImage_"
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

    private com.baidu.idl.face.platform.model.FaceModel setFaceModel(com.baidu.idl.main.facesdk.FaceInfo[] r5, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r6) {
            r4 = this;
            if (r6 != 0) goto L4
            r5 = 0
            return r5
        L4:
            com.baidu.idl.face.platform.model.FaceModel r6 = new com.baidu.idl.face.platform.model.FaceModel
            r6.<init>()
            com.baidu.idl.face.platform.decode.FaceModuleNew r0 = r4.mFaceModule
            com.baidu.idl.face.platform.model.FaceExtInfo[] r5 = r0.getFaceExtInfo(r5)
            com.baidu.idl.face.platform.strategy.DetectStrategy r0 = r4.mDetectStrategy
            android.graphics.Rect r1 = r4.mDetectRect
            com.baidu.idl.face.platform.FaceConfig r2 = r4.mFaceConfig
            r3 = 0
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = r0.getDetectState(r5, r1, r3, r2)
            r6.setFaceModuleStateNew(r0)
            r6.setFaceInfos(r5)
            long r0 = java.lang.System.currentTimeMillis()
            r6.setFrameTime(r0)
            return r6
    }

    @Override // com.baidu.idl.face.platform.IDetectStrategy
    public void detectStrategy(byte[] r2) {
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

    @Override // com.baidu.idl.face.platform.IDetectStrategy
    public void reset() {
            r2 = this;
            r0 = 0
            r2.mDetectCount = r0
            com.baidu.idl.face.platform.common.SoundPoolHelper r1 = r2.mSoundPlayHelper
            if (r1 == 0) goto La
            r1.release()
        La:
            java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r1 = r2.mBase64ImageCropMap
            if (r1 == 0) goto L11
            r1.clear()
        L11:
            java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r1 = r2.mBase64ImageSrcMap
            if (r1 == 0) goto L18
            r1.clear()
        L18:
            r2.mIsFirstTipsed = r0
            r2.mIsProcessing = r0
            return
    }

    public void setConfigValue(com.baidu.idl.face.platform.FaceConfig r1) {
            r0 = this;
            r0.mFaceConfig = r1
            return
    }

    @Override // com.baidu.idl.face.platform.IDetectStrategy
    public void setDetectStrategyConfig(android.graphics.Rect r1, android.graphics.Rect r2, com.baidu.idl.face.platform.IDetectStrategyCallback r3) {
            r0 = this;
            r0.mPreviewRect = r1
            r0.mDetectRect = r2
            r0.mIDetectStrategyCallback = r3
            return
    }

    @Override // com.baidu.idl.face.platform.IDetectStrategy
    public void setDetectStrategySoundEnable(boolean r1) {
            r0 = this;
            r0.mIsEnableSound = r1
            return
    }

    @Override // com.baidu.idl.face.platform.IDetectStrategy
    public void setPreviewDegree(int r1) {
            r0 = this;
            r0.mDegree = r1
            return
    }
}
