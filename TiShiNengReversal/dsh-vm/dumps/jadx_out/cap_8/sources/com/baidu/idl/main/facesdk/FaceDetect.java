package com.baidu.idl.main.facesdk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceDetect {
    private static final java.lang.String TAG = "FaceDetect";
    private com.baidu.idl.main.facesdk.model.BDFaceInstance bdFaceInstance;
    private java.util.concurrent.locks.ReentrantLock lock;






    static {
            return
    }

    public FaceDetect() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.lock = r0
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = new com.baidu.idl.main.facesdk.model.BDFaceInstance
            r0.<init>()
            r1.bdFaceInstance = r0
            r0.getDefautlInstance()
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r1.lock = r0
            return
    }

    public FaceDetect(com.baidu.idl.main.facesdk.model.BDFaceInstance r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.lock = r0
            if (r2 != 0) goto L9
            return
        L9:
            r1.bdFaceInstance = r2
            java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock
            r2.<init>()
            r1.lock = r2
            return
    }

    static /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceInstance access$000(com.baidu.idl.main.facesdk.FaceDetect r0) {
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = r0.bdFaceInstance
            return r0
    }

    static /* synthetic */ int access$100(com.baidu.idl.main.facesdk.FaceDetect r0, long r1, byte[] r3, int r4) {
            int r0 = r0.nativeDetectModelInit(r1, r3, r4)
            return r0
    }

    static /* synthetic */ int access$200(com.baidu.idl.main.facesdk.FaceDetect r0, long r1, int r3, int r4, byte[] r5) {
            int r0 = r0.nativeAlignModelInit(r1, r3, r4, r5)
            return r0
    }

    static /* synthetic */ int access$300(com.baidu.idl.main.facesdk.FaceDetect r0, long r1, int r3, int r4) {
            int r0 = r0.nativeLoadTrack(r1, r3, r4)
            return r0
    }

    static /* synthetic */ java.lang.String access$400() {
            java.lang.String r0 = com.baidu.idl.main.facesdk.FaceDetect.TAG
            return r0
    }

    static /* synthetic */ int access$500(com.baidu.idl.main.facesdk.FaceDetect r0, long r1, byte[] r3, int r4) {
            int r0 = r0.nativeQualityModelInit(r1, r3, r4)
            return r0
    }

    static /* synthetic */ int access$600(com.baidu.idl.main.facesdk.FaceDetect r0, long r1, byte[] r3) {
            int r0 = r0.nativeAttributeModelInit(r1, r3)
            return r0
    }

    static /* synthetic */ int access$700(com.baidu.idl.main.facesdk.FaceDetect r0, long r1, byte[] r3) {
            int r0 = r0.nativeEmotionsModelInit(r1, r3)
            return r0
    }

    static /* synthetic */ int access$800(com.baidu.idl.main.facesdk.FaceDetect r0, long r1, byte[] r3, int r4) {
            int r0 = r0.nativeFaceCloseModelInit(r1, r3, r4)
            return r0
    }

    private native int nativeAlignModelInit(long r1, int r3, int r4, byte[] r5);

    private native int nativeAttributeModelInit(long r1, byte[] r3);

    private native com.baidu.idl.main.facesdk.model.BDFaceImageInstance nativeCropFace(long r1, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r3, float[] r4);

    private native com.baidu.idl.main.facesdk.FaceInfo[] nativeDetect(long r1, int r3, int r4, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r5);

    private native int nativeDetectModelInit(long r1, byte[] r3, int r4);

    private native int nativeEmotionsModelInit(long r1, byte[] r3);

    private native int nativeFaceCloseModelInit(long r1, byte[] r3, int r4);

    private native com.baidu.idl.main.facesdk.FaceInfo[] nativeFastTrack(long r1, int r3, int r4, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r5);

    private native com.baidu.idl.main.facesdk.FaceInfo[] nativeFlexibleDetect(long r1, int r3, int r4, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r5, com.baidu.idl.main.facesdk.FaceInfo[] r6, com.baidu.idl.main.facesdk.model.BDFaceDetectListConf r7);

    private native void nativeLoadConfig(long r1, com.baidu.idl.main.facesdk.model.BDFaceSDKConfig r3);

    private native int nativeLoadTrack(long r1, int r3, int r4);

    private native int nativeQualityModelInit(long r1, byte[] r3, int r4);

    private native com.baidu.idl.main.facesdk.FaceInfo[] nativeTrack(long r1, int r3, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r4);

    private native int nativeUninitModel(long r1);

    public com.baidu.idl.main.facesdk.model.BDFaceImageInstance cropFace(com.baidu.idl.main.facesdk.model.BDFaceImageInstance r7, float[] r8) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L18
            if (r8 != 0) goto L6
            goto L18
        L6:
            com.baidu.idl.main.facesdk.model.BDFaceInstance r1 = r6.bdFaceInstance
            long r1 = r1.getIndex()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L13
            return r0
        L13:
            com.baidu.idl.main.facesdk.model.BDFaceImageInstance r7 = r6.nativeCropFace(r1, r7, r8)
            return r7
        L18:
            return r0
    }

    public com.baidu.idl.main.facesdk.FaceInfo[] detect(com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType r9, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r10) {
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L5
            if (r10 != 0) goto L7
        L5:
            r2 = r8
            goto L33
        L7:
            com.baidu.idl.main.facesdk.model.BDFaceInstance r1 = r8.bdFaceInstance
            long r3 = r1.getIndex()
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L14
            return r0
        L14:
            java.util.concurrent.locks.ReentrantLock r1 = r8.lock
            boolean r1 = r1.tryLock()
            if (r1 != 0) goto L1d
            return r0
        L1d:
            int r5 = r9.ordinal()
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$AlignType r9 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType.BDFACE_ALIGN_TYPE_RGB_ACCURATE
            int r6 = r9.ordinal()
            r2 = r8
            r7 = r10
            com.baidu.idl.main.facesdk.FaceInfo[] r9 = r2.nativeDetect(r3, r5, r6, r7)
            java.util.concurrent.locks.ReentrantLock r10 = r2.lock
            r10.unlock()
            return r9
        L33:
            return r0
    }

    public com.baidu.idl.main.facesdk.FaceInfo[] detect(com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType r11, com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType r12, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r13, com.baidu.idl.main.facesdk.FaceInfo[] r14, com.baidu.idl.main.facesdk.model.BDFaceDetectListConf r15) {
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L7
            if (r13 == 0) goto L7
            if (r12 != 0) goto L9
        L7:
            r2 = r10
            goto L35
        L9:
            com.baidu.idl.main.facesdk.model.BDFaceInstance r1 = r10.bdFaceInstance
            long r3 = r1.getIndex()
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L16
            return r0
        L16:
            java.util.concurrent.locks.ReentrantLock r1 = r10.lock
            boolean r1 = r1.tryLock()
            if (r1 != 0) goto L1f
            return r0
        L1f:
            int r5 = r11.ordinal()
            int r6 = r12.ordinal()
            r2 = r10
            r7 = r13
            r8 = r14
            r9 = r15
            com.baidu.idl.main.facesdk.FaceInfo[] r11 = r2.nativeFlexibleDetect(r3, r5, r6, r7, r8, r9)
            java.util.concurrent.locks.ReentrantLock r12 = r2.lock
            r12.unlock()
            return r11
        L35:
            return r0
    }

    public void initAttrEmo(android.content.Context r7, java.lang.String r8, java.lang.String r9, com.baidu.idl.main.facesdk.callback.Callback r10) {
            r6 = this;
            com.baidu.idl.main.facesdk.FaceDetect$4 r0 = new com.baidu.idl.main.facesdk.FaceDetect$4
            r1 = r6
            r2 = r7
            r4 = r8
            r5 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            com.baidu.idl.main.facesdk.FaceQueue r7 = com.baidu.idl.main.facesdk.FaceQueue.getInstance()
            r7.execute(r0)
            return
    }

    public void initFaceClose(android.content.Context r7, java.lang.String r8, java.lang.String r9, com.baidu.idl.main.facesdk.callback.Callback r10) {
            r6 = this;
            com.baidu.idl.main.facesdk.FaceDetect$5 r0 = new com.baidu.idl.main.facesdk.FaceDetect$5
            r1 = r6
            r2 = r7
            r4 = r8
            r5 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            com.baidu.idl.main.facesdk.FaceQueue r7 = com.baidu.idl.main.facesdk.FaceQueue.getInstance()
            r7.execute(r0)
            return
    }

    public void initModel(android.content.Context r9, java.lang.String r10, java.lang.String r11, com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType r12, com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType r13, com.baidu.idl.main.facesdk.callback.Callback r14) {
            r8 = this;
            com.baidu.idl.main.facesdk.FaceDetect$2 r0 = new com.baidu.idl.main.facesdk.FaceDetect$2
            r1 = r8
            r2 = r9
            r4 = r10
            r6 = r11
            r5 = r12
            r7 = r13
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.baidu.idl.main.facesdk.FaceQueue r9 = com.baidu.idl.main.facesdk.FaceQueue.getInstance()
            r9.execute(r0)
            return
    }

    public void initModel(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, com.baidu.idl.main.facesdk.callback.Callback r12) {
            r7 = this;
            com.baidu.idl.main.facesdk.FaceDetect$1 r0 = new com.baidu.idl.main.facesdk.FaceDetect$1
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.baidu.idl.main.facesdk.FaceQueue r8 = com.baidu.idl.main.facesdk.FaceQueue.getInstance()
            r8.execute(r0)
            return
    }

    public void initQuality(android.content.Context r7, java.lang.String r8, java.lang.String r9, com.baidu.idl.main.facesdk.callback.Callback r10) {
            r6 = this;
            com.baidu.idl.main.facesdk.FaceDetect$3 r0 = new com.baidu.idl.main.facesdk.FaceDetect$3
            r1 = r6
            r2 = r7
            r4 = r8
            r5 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            com.baidu.idl.main.facesdk.FaceQueue r7 = com.baidu.idl.main.facesdk.FaceQueue.getInstance()
            r7.execute(r0)
            return
    }

    public void loadConfig(com.baidu.idl.main.facesdk.model.BDFaceSDKConfig r6) {
            r5 = this;
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = r5.bdFaceInstance
            if (r0 != 0) goto L5
            goto Lf
        L5:
            long r0 = r0.getIndex()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L10
        Lf:
            return
        L10:
            r5.nativeLoadConfig(r0, r6)
            return
    }

    public com.baidu.idl.main.facesdk.FaceInfo[] track(com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType r7, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r8) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L2a
            if (r8 != 0) goto L6
            goto L2a
        L6:
            com.baidu.idl.main.facesdk.model.BDFaceInstance r1 = r6.bdFaceInstance
            long r1 = r1.getIndex()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L13
            return r0
        L13:
            java.util.concurrent.locks.ReentrantLock r3 = r6.lock
            boolean r3 = r3.tryLock()
            if (r3 != 0) goto L1c
            return r0
        L1c:
            int r7 = r7.ordinal()
            com.baidu.idl.main.facesdk.FaceInfo[] r7 = r6.nativeTrack(r1, r7, r8)
            java.util.concurrent.locks.ReentrantLock r8 = r6.lock
            r8.unlock()
            return r7
        L2a:
            return r0
    }

    public com.baidu.idl.main.facesdk.FaceInfo[] track(com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType r9, com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType r10, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r11) {
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L24
            if (r11 == 0) goto L24
            if (r10 != 0) goto L8
            goto L24
        L8:
            com.baidu.idl.main.facesdk.model.BDFaceInstance r1 = r8.bdFaceInstance
            long r3 = r1.getIndex()
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L15
            return r0
        L15:
            int r5 = r9.ordinal()
            int r6 = r10.ordinal()
            r2 = r8
            r7 = r11
            com.baidu.idl.main.facesdk.FaceInfo[] r9 = r2.nativeFastTrack(r3, r5, r6, r7)
            return r9
        L24:
            return r0
    }

    public int uninitModel() {
            r5 = this;
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = r5.bdFaceInstance
            long r0 = r0.getIndex()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = -1
            return r0
        Le:
            int r0 = r5.nativeUninitModel(r0)
            return r0
    }
}
