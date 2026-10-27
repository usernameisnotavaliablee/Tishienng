package com.baidu.idl.main.facesdk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceAuth {
    private static int ALGORITHM_ID = 3;
    private static final java.lang.String LICENSE_FILE_NAME = "idl-license.face-android";
    private static final java.lang.String TAG = "FaceSDK";




    static {
            java.lang.String r0 = "bdface_sdk"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.Exception -> La
            java.lang.String r0 = "bd_unifylicense"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.Exception -> La
        La:
            return
    }

    public FaceAuth() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ int access$000() {
            int r0 = com.baidu.idl.main.facesdk.FaceAuth.ALGORITHM_ID
            return r0
    }

    static /* synthetic */ int access$100(com.baidu.idl.main.facesdk.FaceAuth r0) {
            int r0 = r0.nativeCreatInstance()
            return r0
    }

    private native int nativeCreatInstance();

    private native void nativeSetActiveLog(int r1, int r2);

    private native void nativeSetCoreConfigure(int r1, int r2);

    public com.baidu.idl.main.facesdk.license.BDFaceLicenseAuthInfo getAuthInfo(android.content.Context r4) {
            r3 = this;
            com.baidu.vis.unified.license.AndroidLicenser r0 = com.baidu.vis.unified.license.AndroidLicenser.getInstance()
            int r1 = com.baidu.idl.main.facesdk.FaceAuth.ALGORITHM_ID
            com.baidu.vis.unified.license.BDLicenseAuthInfo r4 = r0.authGetAuthInfo(r4, r1)
            com.baidu.idl.main.facesdk.license.BDFaceLicenseAuthInfo r0 = new com.baidu.idl.main.facesdk.license.BDFaceLicenseAuthInfo
            r0.<init>()
            int r1 = r4.algorithmId
            r0.algorithmId = r1
            java.lang.String r1 = r4.deviceId
            r0.deviceId = r1
            long r1 = r4.expireTime
            r0.expireTime = r1
            java.lang.String r1 = r4.functionList
            r0.functionList = r1
            java.lang.String r1 = r4.licenseKey
            r0.licenseKey = r1
            java.lang.String r1 = r4.md5
            r0.md5 = r1
            java.lang.String r4 = r4.packageName
            r0.packageName = r4
            return r0
    }

    public java.lang.String getDeviceId(android.content.Context r1) {
            r0 = this;
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            java.lang.String r1 = com.baidu.vis.unified.license.AndroidLicenser.getDeviceId(r1)
            return r1
    }

    public com.baidu.idl.main.facesdk.license.BDFaceLicenseLocalInfo getLocalInfo(android.content.Context r3) {
            r2 = this;
            com.baidu.vis.unified.license.AndroidLicenser r0 = com.baidu.vis.unified.license.AndroidLicenser.getInstance()
            int r1 = com.baidu.idl.main.facesdk.FaceAuth.ALGORITHM_ID
            com.baidu.vis.unified.license.BDLicenseLocalInfo r3 = r0.authGetLocalInfo(r3, r1)
            com.baidu.idl.main.facesdk.license.BDFaceLicenseLocalInfo r0 = new com.baidu.idl.main.facesdk.license.BDFaceLicenseLocalInfo
            r0.<init>()
            int r1 = r3.algorithmId
            r0.algorithmId = r1
            java.lang.String r1 = r3.deviceId
            r0.deviceId = r1
            java.lang.String r1 = r3.fingerVersion
            r0.fingerVersion = r1
            java.lang.String r1 = r3.licenseSdkVersion
            r0.licenseSdkVersion = r1
            java.lang.String r1 = r3.licenseKey
            r0.licenseKey = r1
            java.lang.String r1 = r3.md5
            r0.md5 = r1
            java.lang.String r3 = r3.packageName
            r0.packageName = r3
            return r0
    }

    public void initLicense(android.content.Context r8, java.lang.String r9, java.lang.String r10, boolean r11, com.baidu.idl.main.facesdk.callback.Callback r12) {
            r7 = this;
            com.baidu.idl.main.facesdk.FaceAuth$1 r0 = new com.baidu.idl.main.facesdk.FaceAuth$1
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

    public void initLicenseBatchLine(android.content.Context r2, java.lang.String r3, com.baidu.idl.main.facesdk.callback.Callback r4) {
            r1 = this;
            com.baidu.idl.main.facesdk.FaceAuth$3 r0 = new com.baidu.idl.main.facesdk.FaceAuth$3
            r0.<init>(r1, r2, r4, r3)
            com.baidu.idl.main.facesdk.FaceQueue r2 = com.baidu.idl.main.facesdk.FaceQueue.getInstance()
            r2.execute(r0)
            return
    }

    public void initLicenseOnLine(android.content.Context r2, java.lang.String r3, com.baidu.idl.main.facesdk.callback.Callback r4) {
            r1 = this;
            com.baidu.idl.main.facesdk.FaceAuth$2 r0 = new com.baidu.idl.main.facesdk.FaceAuth$2
            r0.<init>(r1, r2, r4, r3)
            com.baidu.idl.main.facesdk.FaceQueue r2 = com.baidu.idl.main.facesdk.FaceQueue.getInstance()
            r2.execute(r0)
            return
    }

    public void setActiveLog(com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo r1, int r2) {
            r0 = this;
            int r1 = r1.ordinal()
            r0.nativeSetActiveLog(r1, r2)
            return
    }

    public void setCoreConfigure(com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode r1, int r2) {
            r0 = this;
            int r1 = r1.ordinal()
            r0.nativeSetCoreConfigure(r1, r2)
            return
    }
}
