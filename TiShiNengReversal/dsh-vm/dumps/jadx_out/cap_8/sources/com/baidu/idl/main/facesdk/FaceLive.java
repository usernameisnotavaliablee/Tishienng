package com.baidu.idl.main.facesdk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceLive {
    private static final java.lang.String TAG = "FaceLive";
    private com.baidu.idl.main.facesdk.model.BDFaceInstance bdFaceInstance;


    static {
            return
    }

    public FaceLive() {
            r1 = this;
            r1.<init>()
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = new com.baidu.idl.main.facesdk.model.BDFaceInstance
            r0.<init>()
            r1.bdFaceInstance = r0
            r0.getDefautlInstance()
            return
    }

    public FaceLive(com.baidu.idl.main.facesdk.model.BDFaceInstance r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L6
            return
        L6:
            r0.bdFaceInstance = r1
            return
    }

    static /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceInstance access$000(com.baidu.idl.main.facesdk.FaceLive r0) {
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = r0.bdFaceInstance
            return r0
    }

    static /* synthetic */ int access$100(com.baidu.idl.main.facesdk.FaceLive r0, long r1, byte[] r3, int r4) {
            int r0 = r0.nativeSilentLiveModelInit(r1, r3, r4)
            return r0
    }

    private native float nativeSilentLive(long r1, int r3, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r4, float[] r5);

    private native int nativeSilentLiveModelInit(long r1, byte[] r3, int r4);

    private native int nativeUninitModel(long r1);

    public void initModel(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, com.baidu.idl.main.facesdk.callback.Callback r12) {
            r7 = this;
            com.baidu.idl.main.facesdk.FaceLive$1 r0 = new com.baidu.idl.main.facesdk.FaceLive$1
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

    public float silentLive(com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.LiveType r9, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r10, float[] r11) {
            r8 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r9 == 0) goto L22
            if (r10 == 0) goto L22
            if (r11 != 0) goto L9
            goto L22
        L9:
            com.baidu.idl.main.facesdk.model.BDFaceInstance r1 = r8.bdFaceInstance
            long r3 = r1.getIndex()
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L16
            return r0
        L16:
            int r5 = r9.ordinal()
            r2 = r8
            r6 = r10
            r7 = r11
            float r9 = r2.nativeSilentLive(r3, r5, r6, r7)
            return r9
        L22:
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
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = r5.bdFaceInstance
            long r0 = r0.getIndex()
            int r0 = r5.nativeUninitModel(r0)
            return r0
    }
}
