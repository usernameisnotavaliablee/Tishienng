package com.umeng.socialize;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMShareAPI {
    private static com.umeng.socialize.UMShareAPI a = null;
    private static boolean b = true;
    public boolean isZyb;


    static {
            return
    }

    public UMShareAPI() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.isZyb = r0
            return
    }

    private static java.lang.Class<?> a(java.lang.String r0) {
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    private static boolean a() {
            r0 = 0
            java.lang.String r1 = "com.umeng.commonsdk.framework.UMEnvelopeBuild"
            java.lang.Class r1 = a(r1)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L2c
            java.lang.String r2 = "buildEnvelopeWithExtHeader"
            r3 = 6
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L2c
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r0] = r4     // Catch: java.lang.Throwable -> L2c
            java.lang.Class<org.json.JSONObject> r4 = org.json.JSONObject.class
            r5 = 1
            r3[r5] = r4     // Catch: java.lang.Throwable -> L2c
            r6 = 2
            r3[r6] = r4     // Catch: java.lang.Throwable -> L2c
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r6 = 3
            r3[r6] = r4     // Catch: java.lang.Throwable -> L2c
            r6 = 4
            r3[r6] = r4     // Catch: java.lang.Throwable -> L2c
            r6 = 5
            r3[r6] = r4     // Catch: java.lang.Throwable -> L2c
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L2c
            return r5
        L2c:
            return r0
    }

    private static boolean a(android.content.Context r1) {
            boolean r0 = a()
            if (r0 != 0) goto L15
            com.umeng.socialize.UMShareAPI$1 r0 = new com.umeng.socialize.UMShareAPI$1
            r0.<init>(r1)
            r0.start()
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.CHECK.DEPENDENT_COMMON_NOT_MATCH
            com.umeng.socialize.utils.SLog.E(r1)
            r1 = 0
            return r1
        L15:
            r1 = 1
            return r1
    }

    public static com.umeng.socialize.UMShareAPI get(android.content.Context r1) {
            boolean r0 = a(r1)
            if (r0 == 0) goto L1e
            boolean r0 = com.umeng.socialize.utils.CommonUtil.isSilentMode(r1)
            if (r0 == 0) goto Ld
            goto L1e
        Ld:
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.a
            if (r0 != 0) goto L1b
            com.umeng.socialize.a r0 = new com.umeng.socialize.a
            r0.<init>(r1)
            com.umeng.socialize.UMShareAPI.a = r0
            com.umeng.socialize.utils.SLog.welcome()
        L1b:
            com.umeng.socialize.UMShareAPI r1 = com.umeng.socialize.UMShareAPI.a
            return r1
        L1e:
            com.umeng.socialize.b r0 = new com.umeng.socialize.b
            r0.<init>(r1)
            com.umeng.socialize.UMShareAPI.a = r0
            return r0
    }

    public static java.lang.String getSdkVersion() {
            java.lang.String r0 = "7.3.2"
            return r0
    }

    public static boolean getSmartEnableFlag() {
            boolean r0 = com.umeng.socialize.UMShareAPI.b
            return r0
    }

    public static void init(android.content.Context r2, java.lang.String r3) {
            boolean r0 = a(r2)
            if (r0 != 0) goto L7
            return
        L7:
            com.umeng.socialize.common.SocializeConstants.APPKEY = r3
            get(r2)
            com.umeng.socialize.net.dplus.CommonNetImpl r3 = com.umeng.socialize.net.dplus.CommonNetImpl.get(r2)
            r0 = 0
            r1 = 24592(0x6010, float:3.4461E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r2, r1, r3, r0)
            return
    }

    public static void setSmartEnable(boolean r0) {
            com.umeng.socialize.UMShareAPI.b = r0
            return
    }

    public void deleteOauth(android.app.Activity r2, com.umeng.socialize.bean.SHARE_MEDIA r3, com.umeng.socialize.UMAuthListener r4) {
            r1 = this;
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.a
            r0.deleteOauth(r2, r3, r4)
            return
    }

    @java.lang.Deprecated
    public void doOauthVerify(android.app.Activity r2, com.umeng.socialize.bean.SHARE_MEDIA r3, com.umeng.socialize.UMAuthListener r4) {
            r1 = this;
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.a
            r0.doOauthVerify(r2, r3, r4)
            return
    }

    public void doShare(android.app.Activity r2, com.umeng.socialize.ShareAction r3, com.umeng.socialize.UMShareListener r4) {
            r1 = this;
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.a
            r0.doShare(r2, r3, r4)
            return
    }

    public void fetchAuthResultWithBundle(android.app.Activity r2, android.os.Bundle r3, com.umeng.socialize.UMAuthListener r4) {
            r1 = this;
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.a
            r0.fetchAuthResultWithBundle(r2, r3, r4)
            return
    }

    public com.umeng.socialize.handler.UMSSOHandler getHandler(com.umeng.socialize.bean.SHARE_MEDIA r2) {
            r1 = this;
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.a
            com.umeng.socialize.handler.UMSSOHandler r2 = r0.getHandler(r2)
            return r2
    }

    public void getPlatformInfo(android.app.Activity r2, com.umeng.socialize.bean.SHARE_MEDIA r3, com.umeng.socialize.UMAuthListener r4) {
            r1 = this;
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.a
            r0.getPlatformInfo(r2, r3, r4)
            return
    }

    public java.lang.String getversion(android.app.Activity r2, com.umeng.socialize.bean.SHARE_MEDIA r3) {
            r1 = this;
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.a
            java.lang.String r2 = r0.getversion(r2, r3)
            return r2
    }

    public boolean isAuthorize(android.app.Activity r2, com.umeng.socialize.bean.SHARE_MEDIA r3) {
            r1 = this;
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.a
            boolean r2 = r0.isAuthorize(r2, r3)
            return r2
    }

    public boolean isInstall(android.app.Activity r2, com.umeng.socialize.bean.SHARE_MEDIA r3) {
            r1 = this;
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.a
            boolean r2 = r0.isInstall(r2, r3)
            return r2
    }

    public boolean isSupport(android.app.Activity r2, com.umeng.socialize.bean.SHARE_MEDIA r3) {
            r1 = this;
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.a
            boolean r2 = r0.isSupport(r2, r3)
            return r2
    }

    public void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.a
            r0.onActivityResult(r2, r3, r4)
            return
    }

    public void onSaveInstanceState(android.os.Bundle r2) {
            r1 = this;
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.a
            r0.onSaveInstanceState(r2)
            return
    }

    public void release() {
            r1 = this;
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.a
            r0.release()
            return
    }

    public void setShareConfig(com.umeng.socialize.UMShareConfig r2) {
            r1 = this;
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.a
            r0.setShareConfig(r2)
            return
    }
}
