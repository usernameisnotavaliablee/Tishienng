package com.baidu.idl.main.facesdk.test;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PaddleLiteTest {
    android.content.Context context;

    static {
            java.lang.String r0 = "bdface_sdk"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.Exception -> L14
            java.lang.String r0 = "bd_license"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.Exception -> L14
            java.lang.String r0 = "aikl_calc_arm"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.Exception -> L14
            java.lang.String r0 = "aikl_cluster_arm"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.Exception -> L14
        L14:
            return
    }

    public PaddleLiteTest(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            return
    }

    private native int nativeCreate(byte[] r1, byte[] r2);

    private native int nativeRun();

    public void create(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.Context r0 = r1.context
            if (r0 != 0) goto L5
            goto L27
        L5:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L27
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L12
            goto L27
        L12:
            android.content.Context r0 = r1.context
            byte[] r2 = com.baidu.idl.main.facesdk.utils.FileUitls.getModelContent(r0, r2)
            android.content.Context r0 = r1.context
            byte[] r3 = com.baidu.idl.main.facesdk.utils.FileUitls.getModelContent(r0, r3)
            int r0 = r2.length
            if (r0 == 0) goto L27
            int r0 = r3.length
            if (r0 == 0) goto L27
            r1.nativeCreate(r2, r3)
        L27:
            return
    }

    public void run() {
            r0 = this;
            r0.nativeRun()
            return
    }
}
