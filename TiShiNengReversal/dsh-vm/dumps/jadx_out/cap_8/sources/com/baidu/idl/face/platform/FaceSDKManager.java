package com.baidu.idl.face.platform;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceSDKManager {
    private static com.baidu.idl.face.platform.FaceSDKManager instance;
    private android.content.Context mContext;
    private com.baidu.idl.main.facesdk.FaceActionLive mFaceActionLive;
    private com.baidu.idl.main.facesdk.FaceAuth mFaceAuth;
    private com.baidu.idl.face.platform.FaceConfig mFaceConfig;
    private com.baidu.idl.main.facesdk.FaceCrop mFaceCrop;
    private com.baidu.idl.main.facesdk.FaceDetect mFaceDetect;
    private com.baidu.idl.main.facesdk.FaceSec mFaceSec;
    private boolean mInitFlag;






    static {
            return
    }

    private FaceSDKManager() {
            r3 = this;
            r3.<init>()
            com.baidu.idl.face.platform.FaceConfig r0 = new com.baidu.idl.face.platform.FaceConfig
            r0.<init>()
            r3.mFaceConfig = r0
            com.baidu.idl.main.facesdk.FaceAuth r0 = new com.baidu.idl.main.facesdk.FaceAuth
            r0.<init>()
            r3.mFaceAuth = r0
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceLogInfo r1 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo.BDFACE_LOG_TYPE_DEBUG
            r2 = 1
            r0.setActiveLog(r1, r2)
            com.baidu.idl.main.facesdk.FaceAuth r0 = r3.mFaceAuth
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceCoreRunMode r1 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode.BDFACE_LITE_POWER_NO_BIND
            r2 = 2
            r0.setCoreConfigure(r1, r2)
            com.baidu.idl.main.facesdk.FaceSec r0 = new com.baidu.idl.main.facesdk.FaceSec
            r0.<init>()
            r3.mFaceSec = r0
            return
    }

    static /* synthetic */ void access$000(com.baidu.idl.face.platform.FaceSDKManager r0, android.content.Context r1, com.baidu.idl.face.platform.listener.IInitCallback r2) {
            r0.initModel(r1, r2)
            return
    }

    static /* synthetic */ boolean access$102(com.baidu.idl.face.platform.FaceSDKManager r0, boolean r1) {
            r0.mInitFlag = r1
            return r1
    }

    public static com.baidu.idl.face.platform.FaceSDKManager getInstance() {
            com.baidu.idl.face.platform.FaceSDKManager r0 = com.baidu.idl.face.platform.FaceSDKManager.instance
            if (r0 != 0) goto L19
            java.lang.Class<com.baidu.idl.face.platform.FaceSDKManager> r0 = com.baidu.idl.face.platform.FaceSDKManager.class
            monitor-enter(r0)
            com.baidu.idl.face.platform.FaceSDKManager r1 = com.baidu.idl.face.platform.FaceSDKManager.instance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.baidu.idl.face.platform.FaceSDKManager r1 = new com.baidu.idl.face.platform.FaceSDKManager     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.baidu.idl.face.platform.FaceSDKManager.instance = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.baidu.idl.face.platform.FaceSDKManager r0 = com.baidu.idl.face.platform.FaceSDKManager.instance
            return r0
    }

    public static java.lang.String getVersion() {
            java.lang.String r0 = "4.1.5"
            return r0
    }

    private void initModel(android.content.Context r10, com.baidu.idl.face.platform.listener.IInitCallback r11) {
            r9 = this;
            com.baidu.idl.main.facesdk.FaceDetect r0 = new com.baidu.idl.main.facesdk.FaceDetect
            r0.<init>()
            r9.mFaceDetect = r0
            com.baidu.idl.main.facesdk.FaceCrop r0 = new com.baidu.idl.main.facesdk.FaceCrop
            r0.<init>()
            r9.mFaceCrop = r0
            com.baidu.idl.main.facesdk.FaceActionLive r0 = new com.baidu.idl.main.facesdk.FaceActionLive
            r0.<init>()
            r9.mFaceActionLive = r0
            com.baidu.idl.main.facesdk.model.BDFaceSDKConfig r0 = new com.baidu.idl.main.facesdk.model.BDFaceSDKConfig
            r0.<init>()
            com.baidu.idl.face.platform.FaceConfig r1 = r9.mFaceConfig
            int r1 = r1.getMinFaceSize()
            r0.minFaceSize = r1
            com.baidu.idl.face.platform.FaceConfig r1 = r9.mFaceConfig
            float r1 = r1.getNotFaceValue()
            r0.notRGBFaceThreshold = r1
            r1 = 1
            r0.isMouthClose = r1
            r0.isEyeClose = r1
            r0.isCropFace = r1
            r0.isCheckBlur = r1
            r0.isIllumination = r1
            r0.isOcclusion = r1
            r0.isHeadPose = r1
            r0.maxDetectNum = r1
            com.baidu.idl.main.facesdk.FaceDetect r1 = r9.mFaceDetect
            r1.loadConfig(r0)
            com.baidu.idl.main.facesdk.FaceDetect r2 = r9.mFaceDetect
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$DetectType r6 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType.DETECT_VIS
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$AlignType r7 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType.BDFACE_ALIGN_TYPE_RGB_ACCURATE
            com.baidu.idl.face.platform.FaceSDKManager$2 r8 = new com.baidu.idl.face.platform.FaceSDKManager$2
            r8.<init>(r9, r11)
            java.lang.String r4 = "detect/detect_rgb-customized-pa-faceid4_0.model.int8.0.0.6.1"
            java.lang.String r5 = "align/align-customized-pa-offlineCapture_withScore_quant_20200909.model.int8.6.4.7.1"
            r3 = r10
            r2.initModel(r3, r4, r5, r6, r7, r8)
            com.baidu.idl.main.facesdk.FaceDetect r10 = r9.mFaceDetect
            com.baidu.idl.face.platform.FaceSDKManager$3 r0 = new com.baidu.idl.face.platform.FaceSDKManager$3
            r0.<init>(r9, r11)
            java.lang.String r1 = "blur/blur-customized-pa-blurnet_9768.model.int8-3.0.9.1"
            java.lang.String r2 = "occlusion/occlusion-customized-pa-occ.model.float32.2.0.6.1"
            r10.initQuality(r3, r1, r2, r0)
            com.baidu.idl.main.facesdk.FaceCrop r10 = r9.mFaceCrop
            com.baidu.idl.face.platform.FaceSDKManager$4 r0 = new com.baidu.idl.face.platform.FaceSDKManager$4
            r0.<init>(r9, r11)
            r10.initFaceCrop(r0)
            com.baidu.idl.main.facesdk.FaceActionLive r10 = r9.mFaceActionLive
            com.baidu.idl.face.platform.FaceSDKManager$5 r0 = new com.baidu.idl.face.platform.FaceSDKManager$5
            r0.<init>(r9, r11)
            java.lang.String r11 = "eyes_close/eyes-customized-pa-caiji.model.float32.1.0.3.1"
            java.lang.String r1 = "mouth_close/mouth-customized-pa-caiji.model.float32.1.0.3.1"
            r10.initActionLiveModel(r3, r11, r1, r0)
            return
    }

    private void releaseModel() {
            r1 = this;
            com.baidu.idl.main.facesdk.FaceDetect r0 = r1.mFaceDetect
            if (r0 == 0) goto L7
            r0.uninitModel()
        L7:
            com.baidu.idl.main.facesdk.FaceCrop r0 = r1.mFaceCrop
            if (r0 == 0) goto Le
            r0.uninitFaceCrop()
        Le:
            com.baidu.idl.main.facesdk.FaceActionLive r0 = r1.mFaceActionLive
            if (r0 == 0) goto L15
            r0.uninitActionLiveModel()
        L15:
            com.baidu.idl.face.platform.FaceConfig r0 = r1.mFaceConfig
            if (r0 == 0) goto L1c
            r0 = 0
            r1.mFaceConfig = r0
        L1c:
            return
    }

    public java.lang.String bitmapToBase64(byte[] r2) {
            r1 = this;
            r0 = 2
            java.lang.String r2 = com.baidu.idl.face.platform.utils.Base64Utils.encodeToString(r2, r0)
            return r2
    }

    public void clearActionHistory() {
            r1 = this;
            com.baidu.idl.main.facesdk.FaceActionLive r0 = r1.mFaceActionLive
            if (r0 == 0) goto L7
            r0.clearHistory()
        L7:
            return
    }

    public byte[] compressImage(android.graphics.Bitmap r1, int r2) {
            r0 = this;
            byte[] r1 = com.baidu.idl.face.platform.utils.BitmapUtils.bitmapCompress(r1, r2)
            return r1
    }

    public com.baidu.idl.main.facesdk.model.BDFaceImageInstance cropFace(com.baidu.idl.main.facesdk.model.BDFaceImageInstance r3, float[] r4, int r5, int r6) {
            r2 = this;
            com.baidu.idl.main.facesdk.model.BDFaceCropParam r0 = new com.baidu.idl.main.facesdk.model.BDFaceCropParam
            r0.<init>()
            r1 = 1046711865(0x3e638e39, float:0.22222222)
            r0.foreheadExtend = r1
            r1 = 1038323257(0x3de38e39, float:0.11111111)
            r0.chinExtend = r1
            com.baidu.idl.face.platform.FaceConfig r1 = r2.getFaceConfig()
            float r1 = r1.getEnlargeRatio()
            r0.enlargeRatio = r1
            r0.height = r5
            r0.width = r6
            com.baidu.idl.main.facesdk.FaceCrop r5 = r2.mFaceCrop
            com.baidu.idl.main.facesdk.model.BDFaceIsOutBoundary r5 = r5.cropFaceByLandmarkIsOutofBoundary(r3, r4, r0)
            if (r5 != 0) goto L27
            r3 = 0
            return r3
        L27:
            com.baidu.idl.main.facesdk.FaceCrop r5 = r2.mFaceCrop
            com.baidu.idl.main.facesdk.model.BDFaceImageInstance r3 = r5.cropFaceByLandmarkParam(r3, r4, r0)
            return r3
    }

    public com.baidu.idl.main.facesdk.FaceInfo[] detect(com.baidu.idl.main.facesdk.model.BDFaceImageInstance r3) {
            r2 = this;
            com.baidu.idl.main.facesdk.FaceDetect r0 = r2.mFaceDetect
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$DetectType r1 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType.DETECT_VIS
            com.baidu.idl.main.facesdk.FaceInfo[] r3 = r0.track(r1, r3)
            return r3
    }

    public com.baidu.idl.face.platform.IDetectStrategy getDetectStrategyModule() {
            r2 = this;
            com.baidu.idl.face.platform.strategy.FaceDetectStrategyExtModule r0 = new com.baidu.idl.face.platform.strategy.FaceDetectStrategyExtModule
            android.content.Context r1 = r2.mContext
            r0.<init>(r1)
            com.baidu.idl.face.platform.FaceConfig r1 = r2.mFaceConfig
            r0.setConfigValue(r1)
            return r0
    }

    public com.baidu.idl.face.platform.FaceConfig getFaceConfig() {
            r1 = this;
            com.baidu.idl.face.platform.FaceConfig r0 = r1.mFaceConfig
            return r0
    }

    public boolean getInitFlag() {
            r1 = this;
            boolean r0 = r1.mInitFlag
            return r0
    }

    public com.baidu.idl.face.platform.ILivenessStrategy getLivenessStrategyModule(com.baidu.idl.face.platform.ILivenessViewCallback r3) {
            r2 = this;
            com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule r0 = new com.baidu.idl.face.platform.strategy.FaceLivenessStrategyExtModule
            android.content.Context r1 = r2.mContext
            r0.<init>(r1)
            r0.setILivenessViewCallback(r3)
            com.baidu.idl.face.platform.FaceConfig r3 = r2.mFaceConfig
            r0.setConfig(r3)
            return r0
    }

    public java.lang.String getZid(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = ""
            return r1
    }

    public java.lang.String imageSec(byte[] r2) {
            r1 = this;
            com.baidu.idl.main.facesdk.FaceSec r0 = r1.mFaceSec
            java.lang.String r2 = r0.e(r2)
            return r2
    }

    public void initialize(android.content.Context r2, java.lang.String r3, com.baidu.idl.face.platform.listener.IInitCallback r4) {
            r1 = this;
            java.lang.String r0 = ""
            r1.initialize(r2, r3, r0, r4)
            return
    }

    public void initialize(android.content.Context r8, java.lang.String r9, java.lang.String r10, com.baidu.idl.face.platform.listener.IInitCallback r11) {
            r7 = this;
            if (r11 != 0) goto L3
            return
        L3:
            if (r8 == 0) goto L23
            if (r9 == 0) goto L23
            if (r10 != 0) goto La
            goto L23
        La:
            android.content.Context r0 = r8.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            r7.mContext = r0
            com.baidu.idl.main.facesdk.FaceAuth r1 = r7.mFaceAuth
            com.baidu.idl.face.platform.FaceSDKManager$1 r6 = new com.baidu.idl.face.platform.FaceSDKManager$1
            r6.<init>(r7, r8, r11)
            r5 = 1
            r2 = r8
            r3 = r9
            r4 = r10
            r1.initLicense(r2, r3, r4, r5, r6)
            return
        L23:
            r8 = -1
            java.lang.String r9 = "参数不能为空"
            r11.initFailure(r8, r9)
            return
    }

    public int processLiveness(com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType r2, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r3, com.baidu.idl.face.platform.model.FaceExtInfo r4, java.util.concurrent.atomic.AtomicInteger r5) {
            r1 = this;
            com.baidu.idl.main.facesdk.FaceActionLive r0 = r1.mFaceActionLive
            float[] r4 = r4.getmLandmarks()
            int r2 = r0.actionLive(r2, r3, r4, r5)
            return r2
    }

    public void release() {
            r3 = this;
            java.lang.Class<com.baidu.idl.face.platform.FaceSDKManager> r0 = com.baidu.idl.face.platform.FaceSDKManager.class
            monitor-enter(r0)
            com.baidu.idl.face.platform.FaceSDKManager r1 = com.baidu.idl.face.platform.FaceSDKManager.instance     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L15
            r2 = 0
            r1.mInitFlag = r2     // Catch: java.lang.Throwable -> L13
            r2 = 0
            r1.mContext = r2     // Catch: java.lang.Throwable -> L13
            r1.releaseModel()     // Catch: java.lang.Throwable -> L13
            com.baidu.idl.face.platform.FaceSDKManager.instance = r2     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    public android.graphics.Bitmap scaleImage(android.graphics.Bitmap r1, float r2) {
            r0 = this;
            android.graphics.Bitmap r1 = com.baidu.idl.face.platform.utils.BitmapUtils.scale(r1, r2)
            return r1
    }

    public android.graphics.Bitmap scaleImage(android.graphics.Bitmap r1, int r2, int r3) {
            r0 = this;
            android.graphics.Bitmap r1 = com.baidu.idl.face.platform.utils.BitmapUtils.scale(r1, r2, r3)
            return r1
    }

    public void setFaceConfig(com.baidu.idl.face.platform.FaceConfig r1) {
            r0 = this;
            r0.mFaceConfig = r1
            return
    }
}
