package com.umeng.socialize;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UmengTool {
    public UmengTool() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void checkAlipay(android.content.Context r1) {
            java.lang.String r1 = r1.getPackageName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ".apshare.ShareEntryActivity"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            boolean r1 = com.umeng.commonsdk.utils.UMUtils.checkPath(r1)
            if (r1 != 0) goto L21
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.CHECK.ALIPAYERROR
            com.umeng.socialize.utils.SLog.E(r1)
            return
        L21:
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.CHECK.ALIPAYSUCCESS
            com.umeng.socialize.utils.SLog.E(r1)
            return
    }

    @android.annotation.TargetApi(9)
    public static java.lang.String checkFBByself(android.content.Context r2) {
            java.lang.String r0 = "com.umeng.facebook.FacebookActivity"
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.checkAndroidManifest(r2, r0)
            if (r0 != 0) goto Lb
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.FACEBOOK.NOFACEBOOKACTIVITY
            return r2
        Lb:
            java.lang.String r0 = "com.facebook.sdk.ApplicationId"
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.checkMetaData(r2, r0)
            if (r0 != 0) goto L16
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.FACEBOOK.NOMETA
            return r2
        L16:
            java.lang.String r0 = "facebook_app_id"
            java.lang.String r1 = "string"
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.checkResource(r2, r0, r1)
            if (r0 != 0) goto L23
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.FACEBOOK.ERRORMETA
            return r2
        L23:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.getAppHashKey(r2)
            java.lang.String r0 = com.umeng.socialize.utils.ContextUtil.getPackageName()
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.CHECK.checkSuccess(r2, r0)
            return r2
    }

    public static void checkFacebook(android.content.Context r1) {
            java.lang.String r0 = checkFBByself(r1)
            showDialog(r1, r0)
            return
    }

    public static java.lang.String checkKakao(android.content.Context r3) {
            java.lang.String r0 = r3.getPackageName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Ld
            java.lang.String r3 = "包名为空"
            return r3
        Ld:
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.String r1 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            r2 = 64
            r0.getPackageInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            r0.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.String r1 = "kakao 配置正确，请检查kakao后台签名:"
            r0.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.getAppHashKey(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            r0.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.String r3 = r0.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            return r3
        L30:
            java.lang.String r3 = "签名获取失败"
            return r3
    }

    public static java.lang.String checkLinkin(android.content.Context r3) {
            java.lang.String r0 = r3.getPackageName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Ld
            java.lang.String r3 = "包名为空"
            return r3
        Ld:
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.String r1 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            r2 = 64
            r0.getPackageInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            r0.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.String r1 = "领英 配置正确，请检查领英后台签名:"
            r0.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.getAppHashKey(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            r0.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.String r3 = r0.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            return r3
        L30:
            java.lang.String r3 = "签名获取失败"
            return r3
    }

    public static void checkQQ(android.content.Context r1) {
            java.lang.String r0 = checkQQByself(r1)
            showDialog(r1, r0)
            return
    }

    public static java.lang.String checkQQByself(android.content.Context r2) {
            java.lang.String r0 = "com.tencent.tauth.AuthActivity"
            boolean r1 = com.umeng.commonsdk.utils.UMUtils.checkAndroidManifest(r2, r0)
            if (r1 != 0) goto Ld
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.QQ.getError(r0)
            return r2
        Ld:
            java.lang.String r0 = "com.tencent.connect.common.AssistActivity"
            boolean r1 = com.umeng.commonsdk.utils.UMUtils.checkAndroidManifest(r2, r0)
            if (r1 != 0) goto L1a
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.QQ.getError(r0)
            return r2
        L1a:
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            com.umeng.socialize.PlatformConfig$Platform r0 = com.umeng.socialize.PlatformConfig.getPlatform(r0)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r0 = r0.appId
            boolean r2 = com.umeng.commonsdk.utils.UMUtils.checkIntentFilterData(r2, r0)
            if (r2 != 0) goto L2d
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.QQ.ERRORDATA
            return r2
        L2d:
            java.lang.String r2 = "qq配置正确"
            return r2
    }

    public static void checkSina(android.content.Context r1) {
            java.lang.String r0 = checkSinaBySelf(r1)
            showDialog(r1, r0)
            return
    }

    public static java.lang.String checkSinaBySelf(android.content.Context r1) {
            java.lang.String r0 = r1.getPackageName()
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.getAppMD5Signature(r1)
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.CHECK.checkSuccess(r1, r0)
            return r1
    }

    public static void checkVK(android.content.Context r1) {
            java.lang.String r0 = checkVKByself(r1)
            showDialog(r1, r0)
            return
    }

    public static java.lang.String checkVKByself(android.content.Context r3) {
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.getAppSHA1Key(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "你使用的签名："
            r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.String r2 = ""
            java.lang.String r3 = r3.replace(r1, r2)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static void checkWx(android.content.Context r1) {
            java.lang.String r0 = checkWxBySelf(r1)
            showDialog(r1, r0)
            return
    }

    public static java.lang.String checkWxBySelf(android.content.Context r3) {
            java.lang.String r0 = r3.getPackageName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r2 = ".wxapi.WXEntryActivity"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r2 = com.umeng.commonsdk.utils.UMUtils.checkPath(r1)
            if (r2 != 0) goto L1e
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.WX.WX_ERRORACTIVITY
            return r3
        L1e:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.getAppMD5Signature(r3)
            boolean r3 = com.umeng.commonsdk.utils.UMUtils.checkAndroidManifest(r3, r1)
            if (r3 == 0) goto L31
            java.lang.String r3 = r2.toLowerCase()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.CHECK.checkSuccess(r3, r0)
            return r3
        L31:
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.WX.WX_ERRORMANIFEST
            return r3
    }

    public static void getSignature(android.content.Context r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "包名："
            r0.append(r1)
            java.lang.String r1 = com.umeng.socialize.utils.ContextUtil.getPackageName()
            r0.append(r1)
            java.lang.String r1 = "\n签名:"
            r0.append(r1)
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.getAppMD5Signature(r2)
            r0.append(r1)
            java.lang.String r1 = "\nfacebook keyhash:"
            r0.append(r1)
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.getAppHashKey(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            showDialog(r2, r0)
            return
    }

    public static java.lang.String getStrRedicrectUrl() {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.SINA
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r0 = r0.redirectUrl
            return r0
    }

    public static void showDialog(android.content.Context r1, java.lang.String r2) {
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r1)
            java.lang.String r1 = "友盟Debug模式自检"
            android.app.AlertDialog$Builder r1 = r0.setTitle(r1)
            android.app.AlertDialog$Builder r1 = r1.setMessage(r2)
            java.lang.String r2 = "关闭"
            r0 = 0
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r0)
            r1.show()
            return
    }
}
