package com.baidu.idl.main.facesdk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceCrop {
    private static final java.lang.String TAG = "FaceCrop";
    private com.baidu.idl.main.facesdk.model.BDFaceInstance bdFaceInstance;


    static {
            return
    }

    public FaceCrop() {
            r1 = this;
            r1.<init>()
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = new com.baidu.idl.main.facesdk.model.BDFaceInstance
            r0.<init>()
            r1.bdFaceInstance = r0
            r0.getDefautlInstance()
            return
    }

    public FaceCrop(com.baidu.idl.main.facesdk.model.BDFaceInstance r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L6
            return
        L6:
            r0.bdFaceInstance = r1
            return
    }

    static /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceInstance access$000(com.baidu.idl.main.facesdk.FaceCrop r0) {
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = r0.bdFaceInstance
            return r0
    }

    static /* synthetic */ int access$100(com.baidu.idl.main.facesdk.FaceCrop r0, long r1) {
            int r0 = r0.nativeCropImageInit(r1)
            return r0
    }

    private native com.baidu.idl.main.facesdk.model.BDFaceImageInstance nativeCropFaceByBox(long r1, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r3, com.baidu.idl.main.facesdk.FaceInfo r4, float r5, int[] r6);

    private native com.baidu.idl.main.facesdk.model.BDFaceIsOutBoundary nativeCropFaceByBoxIsOutofBoundary(long r1, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r3, com.baidu.idl.main.facesdk.FaceInfo r4, com.baidu.idl.main.facesdk.model.BDFaceCropParam r5);

    private native com.baidu.idl.main.facesdk.model.BDFaceImageInstance nativeCropFaceByBoxParam(long r1, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r3, com.baidu.idl.main.facesdk.FaceInfo r4, com.baidu.idl.main.facesdk.model.BDFaceCropParam r5);

    private native com.baidu.idl.main.facesdk.model.BDFaceImageInstance nativeCropFaceByLandmark(long r1, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r3, float[] r4, float r5, boolean r6, int[] r7);

    private native com.baidu.idl.main.facesdk.model.BDFaceIsOutBoundary nativeCropFaceByLandmarkIsOutofBoundary(long r1, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r3, float[] r4, com.baidu.idl.main.facesdk.model.BDFaceCropParam r5);

    private native com.baidu.idl.main.facesdk.model.BDFaceImageInstance nativeCropFaceByLandmarkParam(long r1, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r3, float[] r4, com.baidu.idl.main.facesdk.model.BDFaceCropParam r5);

    private native int nativeCropImageInit(long r1);

    private native com.baidu.idl.main.facesdk.model.BDFaceImageInstance nativeResizeImage(com.baidu.idl.main.facesdk.model.BDFaceImageInstance r1, int r2, com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType r3);

    private native int nativeUnInitCropImage(long r1);

    public com.baidu.idl.main.facesdk.model.BDFaceImageInstance cropFaceByBox(com.baidu.idl.main.facesdk.model.BDFaceImageInstance r10, com.baidu.idl.main.facesdk.FaceInfo r11, float r12, java.util.concurrent.atomic.AtomicInteger r13) {
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L27
            if (r11 == 0) goto L27
            if (r13 != 0) goto L8
            goto L27
        L8:
            com.baidu.idl.main.facesdk.model.BDFaceInstance r1 = r9.bdFaceInstance
            long r3 = r1.getIndex()
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L15
            return r0
        L15:
            r0 = 1
            int[] r8 = new int[r0]
            r2 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            com.baidu.idl.main.facesdk.model.BDFaceImageInstance r10 = r2.nativeCropFaceByBox(r3, r5, r6, r7, r8)
            r11 = 0
            r11 = r8[r11]
            r13.set(r11)
            return r10
        L27:
            return r0
    }

    public com.baidu.idl.main.facesdk.model.BDFaceIsOutBoundary cropFaceByBoxIsOutofBoundary(com.baidu.idl.main.facesdk.model.BDFaceImageInstance r9, com.baidu.idl.main.facesdk.FaceInfo r10, com.baidu.idl.main.facesdk.model.BDFaceCropParam r11) {
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L1e
            if (r10 == 0) goto L1e
            if (r11 != 0) goto L8
            goto L1e
        L8:
            com.baidu.idl.main.facesdk.model.BDFaceInstance r1 = r8.bdFaceInstance
            long r3 = r1.getIndex()
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L15
            return r0
        L15:
            r2 = r8
            r5 = r9
            r6 = r10
            r7 = r11
            com.baidu.idl.main.facesdk.model.BDFaceIsOutBoundary r9 = r2.nativeCropFaceByBoxIsOutofBoundary(r3, r5, r6, r7)
            return r9
        L1e:
            return r0
    }

    public com.baidu.idl.main.facesdk.model.BDFaceImageInstance cropFaceByBoxParam(com.baidu.idl.main.facesdk.model.BDFaceImageInstance r9, com.baidu.idl.main.facesdk.FaceInfo r10, com.baidu.idl.main.facesdk.model.BDFaceCropParam r11) {
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L1e
            if (r10 == 0) goto L1e
            if (r11 != 0) goto L8
            goto L1e
        L8:
            com.baidu.idl.main.facesdk.model.BDFaceInstance r1 = r8.bdFaceInstance
            long r3 = r1.getIndex()
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L15
            return r0
        L15:
            r2 = r8
            r5 = r9
            r6 = r10
            r7 = r11
            com.baidu.idl.main.facesdk.model.BDFaceImageInstance r9 = r2.nativeCropFaceByBoxParam(r3, r5, r6, r7)
            return r9
        L1e:
            return r0
    }

    public com.baidu.idl.main.facesdk.model.BDFaceImageInstance cropFaceByLandmark(com.baidu.idl.main.facesdk.model.BDFaceImageInstance r11, float[] r12, float r13, boolean r14, java.util.concurrent.atomic.AtomicInteger r15) {
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L29
            if (r15 == 0) goto L29
            int r1 = r12.length
            if (r1 >= 0) goto L9
            goto L29
        L9:
            com.baidu.idl.main.facesdk.model.BDFaceInstance r1 = r10.bdFaceInstance
            long r3 = r1.getIndex()
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L16
            return r0
        L16:
            r0 = 1
            int[] r9 = new int[r0]
            r2 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            com.baidu.idl.main.facesdk.model.BDFaceImageInstance r11 = r2.nativeCropFaceByLandmark(r3, r5, r6, r7, r8, r9)
            r12 = 0
            r12 = r9[r12]
            r15.set(r12)
            return r11
        L29:
            return r0
    }

    public com.baidu.idl.main.facesdk.model.BDFaceIsOutBoundary cropFaceByLandmarkIsOutofBoundary(com.baidu.idl.main.facesdk.model.BDFaceImageInstance r9, float[] r10, com.baidu.idl.main.facesdk.model.BDFaceCropParam r11) {
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L21
            if (r10 == 0) goto L21
            if (r11 == 0) goto L21
            int r1 = r10.length
            if (r1 != 0) goto Lb
            goto L21
        Lb:
            com.baidu.idl.main.facesdk.model.BDFaceInstance r1 = r8.bdFaceInstance
            long r3 = r1.getIndex()
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L18
            return r0
        L18:
            r2 = r8
            r5 = r9
            r6 = r10
            r7 = r11
            com.baidu.idl.main.facesdk.model.BDFaceIsOutBoundary r9 = r2.nativeCropFaceByLandmarkIsOutofBoundary(r3, r5, r6, r7)
            return r9
        L21:
            return r0
    }

    public com.baidu.idl.main.facesdk.model.BDFaceImageInstance cropFaceByLandmarkParam(com.baidu.idl.main.facesdk.model.BDFaceImageInstance r9, float[] r10, com.baidu.idl.main.facesdk.model.BDFaceCropParam r11) {
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L21
            if (r10 == 0) goto L21
            if (r11 == 0) goto L21
            int r1 = r10.length
            if (r1 != 0) goto Lb
            goto L21
        Lb:
            com.baidu.idl.main.facesdk.model.BDFaceInstance r1 = r8.bdFaceInstance
            long r3 = r1.getIndex()
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L18
            return r0
        L18:
            r2 = r8
            r5 = r9
            r6 = r10
            r7 = r11
            com.baidu.idl.main.facesdk.model.BDFaceImageInstance r9 = r2.nativeCropFaceByLandmarkParam(r3, r5, r6, r7)
            return r9
        L21:
            return r0
    }

    public void initFaceCrop(com.baidu.idl.main.facesdk.callback.Callback r2) {
            r1 = this;
            com.baidu.idl.main.facesdk.FaceCrop$1 r0 = new com.baidu.idl.main.facesdk.FaceCrop$1
            r0.<init>(r1, r2)
            com.baidu.idl.main.facesdk.FaceQueue r2 = com.baidu.idl.main.facesdk.FaceQueue.getInstance()
            r2.execute(r0)
            return
    }

    public com.baidu.idl.main.facesdk.model.BDFaceImageInstance resizeImage(com.baidu.idl.main.facesdk.model.BDFaceImageInstance r2, int r3) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType r0 = r2.imageType
            com.baidu.idl.main.facesdk.model.BDFaceImageInstance r2 = r1.nativeResizeImage(r2, r3, r0)
            return r2
    }

    public int uninitFaceCrop() {
            r5 = this;
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = r5.bdFaceInstance
            long r0 = r0.getIndex()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = -1
            return r0
        Le:
            int r0 = r5.nativeUnInitCropImage(r0)
            return r0
    }
}
