package com.baidu.idl.main.facesdk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceActionLive {
    private static final java.lang.String TAG = "FaceActionLive";
    private com.baidu.idl.main.facesdk.model.BDFaceInstance bdFaceInstance;
    private int[] isExist;


    static {
            return
    }

    public FaceActionLive() {
            r1 = this;
            r1.<init>()
            r0 = 1
            int[] r0 = new int[r0]
            r1.isExist = r0
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = new com.baidu.idl.main.facesdk.model.BDFaceInstance
            r0.<init>()
            r1.bdFaceInstance = r0
            r0.getDefautlInstance()
            return
    }

    public FaceActionLive(com.baidu.idl.main.facesdk.model.BDFaceInstance r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            int[] r0 = new int[r0]
            r1.isExist = r0
            if (r2 != 0) goto Lb
            return
        Lb:
            r1.bdFaceInstance = r2
            return
    }

    static /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceInstance access$000(com.baidu.idl.main.facesdk.FaceActionLive r0) {
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = r0.bdFaceInstance
            return r0
    }

    static /* synthetic */ int access$100(com.baidu.idl.main.facesdk.FaceActionLive r0, long r1, byte[] r3, byte[] r4) {
            int r0 = r0.nativeActionLiveModelInit(r1, r3, r4)
            return r0
    }

    private native int nativeActionLive(long r1, int r3, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r4, float[] r5, int[] r6);

    private native int nativeActionLiveModelInit(long r1, byte[] r3, byte[] r4);

    private native void nativeActionLoadConfig(long r1, com.baidu.idl.main.facesdk.model.BDFaceSDKActionConfig r3);

    private native int nativeClearHistory(long r1);

    private native int nativeUninitActionLiveModel(long r1);

    public int actionLive(com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType r10, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r11, float[] r12, java.util.concurrent.atomic.AtomicInteger r13) {
            r9 = this;
            r0 = -1
            if (r11 == 0) goto L9
            if (r12 == 0) goto L9
            if (r10 == 0) goto L9
            if (r13 != 0) goto Lb
        L9:
            r2 = r9
            goto L2e
        Lb:
            com.baidu.idl.main.facesdk.model.BDFaceInstance r1 = r9.bdFaceInstance
            long r3 = r1.getIndex()
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L18
            return r0
        L18:
            int r5 = r10.ordinal()
            int[] r8 = r9.isExist
            r2 = r9
            r6 = r11
            r7 = r12
            int r10 = r2.nativeActionLive(r3, r5, r6, r7, r8)
            int[] r11 = r2.isExist
            r12 = 0
            r11 = r11[r12]
            r13.set(r11)
            return r10
        L2e:
            return r0
    }

    public int clearHistory() {
            r5 = this;
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = r5.bdFaceInstance
            long r0 = r0.getIndex()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = -1
            return r0
        Le:
            int r0 = r5.nativeClearHistory(r0)
            return r0
    }

    public void initActionLiveModel(android.content.Context r7, java.lang.String r8, java.lang.String r9, com.baidu.idl.main.facesdk.callback.Callback r10) {
            r6 = this;
            com.baidu.idl.main.facesdk.FaceActionLive$1 r0 = new com.baidu.idl.main.facesdk.FaceActionLive$1
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

    public void loadActionConfig(com.baidu.idl.main.facesdk.model.BDFaceSDKActionConfig r6) {
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
            r5.nativeActionLoadConfig(r0, r6)
            return
    }

    public int uninitActionLiveModel() {
            r5 = this;
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = r5.bdFaceInstance
            long r0 = r0.getIndex()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = -1
            return r0
        Le:
            int r0 = r5.nativeUninitActionLiveModel(r0)
            return r0
    }
}
