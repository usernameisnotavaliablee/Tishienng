package com.baidu.idl.main.facesdk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceMouthMask {
    private static final java.lang.String TAG = "FaceMouthMask";
    private com.baidu.idl.main.facesdk.model.BDFaceInstance bdFaceInstance;


    static {
            return
    }

    public FaceMouthMask() {
            r1 = this;
            r1.<init>()
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = new com.baidu.idl.main.facesdk.model.BDFaceInstance
            r0.<init>()
            r1.bdFaceInstance = r0
            r0.getDefautlInstance()
            return
    }

    public FaceMouthMask(com.baidu.idl.main.facesdk.model.BDFaceInstance r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L6
            return
        L6:
            r0.bdFaceInstance = r1
            return
    }

    static /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceInstance access$000(com.baidu.idl.main.facesdk.FaceMouthMask r0) {
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = r0.bdFaceInstance
            return r0
    }

    static /* synthetic */ int access$100(com.baidu.idl.main.facesdk.FaceMouthMask r0, long r1, byte[] r3) {
            int r0 = r0.nativeInitModel(r1, r3)
            return r0
    }

    private native float[] nativeCheckMask(long r1, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r3, com.baidu.idl.main.facesdk.FaceInfo[] r4);

    private native int nativeInitModel(long r1, byte[] r3);

    private native int nativeUninitModel(long r1);

    public float[] checkMask(com.baidu.idl.main.facesdk.model.BDFaceImageInstance r7, com.baidu.idl.main.facesdk.FaceInfo[] r8) {
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
            float[] r7 = r6.nativeCheckMask(r1, r7, r8)
            return r7
        L18:
            return r0
    }

    public void initModel(android.content.Context r2, java.lang.String r3, com.baidu.idl.main.facesdk.callback.Callback r4) {
            r1 = this;
            com.baidu.idl.main.facesdk.FaceMouthMask$1 r0 = new com.baidu.idl.main.facesdk.FaceMouthMask$1
            r0.<init>(r1, r2, r4, r3)
            com.baidu.idl.main.facesdk.FaceQueue r2 = com.baidu.idl.main.facesdk.FaceQueue.getInstance()
            r2.execute(r0)
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
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = r5.bdFaceInstance
            long r0 = r0.getIndex()
            int r0 = r5.nativeUninitModel(r0)
            return r0
    }
}
