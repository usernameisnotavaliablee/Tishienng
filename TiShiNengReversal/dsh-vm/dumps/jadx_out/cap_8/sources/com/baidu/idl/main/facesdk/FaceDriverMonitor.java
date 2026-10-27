package com.baidu.idl.main.facesdk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceDriverMonitor {
    private com.baidu.idl.main.facesdk.model.BDFaceInstance bdFaceInstance;


    public FaceDriverMonitor() {
            r1 = this;
            r1.<init>()
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = new com.baidu.idl.main.facesdk.model.BDFaceInstance
            r0.<init>()
            r1.bdFaceInstance = r0
            r0.getDefautlInstance()
            return
    }

    public FaceDriverMonitor(com.baidu.idl.main.facesdk.model.BDFaceInstance r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L6
            return
        L6:
            r0.bdFaceInstance = r1
            return
    }

    static /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceInstance access$000(com.baidu.idl.main.facesdk.FaceDriverMonitor r0) {
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = r0.bdFaceInstance
            return r0
    }

    public com.baidu.idl.main.facesdk.model.BDFaceDriverMonitorInfo driverMonitor(com.baidu.idl.main.facesdk.model.BDFaceImageInstance r6, com.baidu.idl.main.facesdk.FaceInfo r7) {
            r5 = this;
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = r5.bdFaceInstance
            long r0 = r0.getIndex()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L16
            if (r6 == 0) goto L16
            if (r7 != 0) goto L11
            goto L16
        L11:
            com.baidu.idl.main.facesdk.model.BDFaceDriverMonitorInfo r6 = r5.nativeDriverMonitor(r0, r6, r7)
            return r6
        L16:
            r6 = 0
            return r6
    }

    public void initDriverMonitor(android.content.Context r2, java.lang.String r3, com.baidu.idl.main.facesdk.callback.Callback r4) {
            r1 = this;
            com.baidu.idl.main.facesdk.FaceDriverMonitor$1 r0 = new com.baidu.idl.main.facesdk.FaceDriverMonitor$1
            r0.<init>(r1, r2, r4, r3)
            com.baidu.idl.main.facesdk.FaceQueue r2 = com.baidu.idl.main.facesdk.FaceQueue.getInstance()
            r2.execute(r0)
            return
    }

    public native com.baidu.idl.main.facesdk.model.BDFaceDriverMonitorInfo nativeDriverMonitor(long r1, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r3, com.baidu.idl.main.facesdk.FaceInfo r4);

    public native int nativeDriverMonitorInit(long r1, byte[] r3);

    public native int nativeUnInitDriverMonitor(long r1);

    public int uninitDriverMonitor() {
            r5 = this;
            com.baidu.idl.main.facesdk.model.BDFaceInstance r0 = r5.bdFaceInstance
            long r0 = r0.getIndex()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = -1
            return r0
        Le:
            int r0 = r5.nativeUnInitDriverMonitor(r0)
            return r0
    }
}
