package com.baidu.idl.main.facesdk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceFeature {
    private static final java.lang.String TAG = "FaceFeature";
    private com.baidu.idl.main.facesdk.model.BDFaceInstance bdFaceInstance;



    static {
            return
    }

    public FaceFeature() {
            r1 = this;
            r1.<init>()
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = new com.baidu.idl.main.facesdk.model.BDFaceInstance
            r0.<init>()
            r1.bdFaceInstance = r0
            r0.getDefautlInstance()
            return
    }

    public FaceFeature(com.baidu.idl.main.facesdk.model.BDFaceInstance r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L6
            return
        L6:
            r0.bdFaceInstance = r1
            return
    }

    static /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceInstance access$000(com.baidu.idl.main.facesdk.FaceFeature r0) {
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = r0.bdFaceInstance
            return r0
    }

    static /* synthetic */ int access$100(com.baidu.idl.main.facesdk.FaceFeature r0, long r1, byte[] r3, int r4) {
            int r0 = r0.nativeFeatureModelInit(r1, r3, r4)
            return r0
    }

    static /* synthetic */ java.lang.String access$200() {
            java.lang.String r0 = com.baidu.idl.main.facesdk.FaceFeature.TAG
            return r0
    }

    private native float nativeFeature(long r1, int r3, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r4, float[] r5, byte[] r6);

    private native float nativeFeatureCompare(long r1, int r3, byte[] r4, byte[] r5, int r6);

    private native int nativeFeatureModelInit(long r1, byte[] r3, int r4);

    private native java.util.ArrayList<com.baidu.idl.main.facesdk.model.Feature> nativeFeatureSearch(long r1, byte[] r3, int r4, int r5, int r6);

    private native float nativeRGBDFeature(long r1, int r3, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r4, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r5, float[] r6, byte[] r7);

    private native int nativeUninitModel(long r1);

    private native int nativefeaturePush(java.util.List<? extends com.baidu.idl.main.facesdk.model.Feature> r1);

    public float feature(com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType r10, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r11, float[] r12, byte[] r13) {
            r9 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r10 == 0) goto L28
            if (r12 == 0) goto L28
            if (r13 == 0) goto L28
            if (r11 == 0) goto L28
            int r1 = r12.length
            if (r1 >= 0) goto Le
            goto L28
        Le:
            com.baidu.idl.main.facesdk.model.BDFaceInstance r1 = r9.bdFaceInstance
            long r3 = r1.getIndex()
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L1b
            return r0
        L1b:
            int r5 = r10.ordinal()
            r2 = r9
            r6 = r11
            r7 = r12
            r8 = r13
            float r10 = r2.nativeFeature(r3, r5, r6, r7, r8)
            return r10
        L28:
            return r0
    }

    public float featureCompare(com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType r10, byte[] r11, byte[] r12, boolean r13) {
            r9 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r10 == 0) goto L23
            if (r11 == 0) goto L23
            if (r12 != 0) goto L9
            goto L23
        L9:
            com.baidu.idl.main.facesdk.model.BDFaceInstance r1 = r9.bdFaceInstance
            long r3 = r1.getIndex()
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L16
            return r0
        L16:
            int r5 = r10.ordinal()
            r2 = r9
            r6 = r11
            r7 = r12
            r8 = r13
            float r10 = r2.nativeFeatureCompare(r3, r5, r6, r7, r8)
            return r10
        L23:
            return r0
    }

    public int featurePush(java.util.List<? extends com.baidu.idl.main.facesdk.model.Feature> r1) {
            r0 = this;
            r1 = -1
            return r1
    }

    public float featureRGBD(com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType r11, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r12, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r13, float[] r14, byte[] r15) {
            r10 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r11 == 0) goto L2b
            if (r14 == 0) goto L2b
            if (r15 == 0) goto L2b
            if (r12 == 0) goto L2b
            if (r13 == 0) goto L2b
            int r1 = r14.length
            if (r1 >= 0) goto L10
            goto L2b
        L10:
            com.baidu.idl.main.facesdk.model.BDFaceInstance r1 = r10.bdFaceInstance
            long r3 = r1.getIndex()
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L1d
            return r0
        L1d:
            int r5 = r11.ordinal()
            r2 = r10
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            float r11 = r2.nativeRGBDFeature(r3, r5, r6, r7, r8, r9)
            return r11
        L2b:
            return r0
    }

    public java.util.ArrayList<com.baidu.idl.main.facesdk.model.Feature> featureSearch(byte[] r1, com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType r2, int r3, boolean r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void initModel(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, com.baidu.idl.main.facesdk.callback.Callback r11) {
            r6 = this;
            com.baidu.idl.main.facesdk.FaceFeature$1 r0 = new com.baidu.idl.main.facesdk.FaceFeature$1
            r1 = r6
            r2 = r7
            r4 = r8
            r5 = r9
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            com.baidu.idl.main.facesdk.FaceQueue r7 = com.baidu.idl.main.facesdk.FaceQueue.getInstance()
            r7.execute(r0)
            return
    }

    public void initModel(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, com.baidu.idl.main.facesdk.callback.Callback r14) {
            r8 = this;
            com.baidu.idl.main.facesdk.FaceFeature$2 r0 = new com.baidu.idl.main.facesdk.FaceFeature$2
            r1 = r8
            r7 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.baidu.idl.main.facesdk.FaceQueue r9 = com.baidu.idl.main.facesdk.FaceQueue.getInstance()
            r9.execute(r0)
            return
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
