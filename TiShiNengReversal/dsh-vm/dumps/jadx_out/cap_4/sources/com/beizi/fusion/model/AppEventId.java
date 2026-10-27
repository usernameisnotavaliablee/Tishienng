package com.beizi.fusion.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AppEventId {
    private static volatile com.beizi.fusion.model.AppEventId eventIdInstance;
    java.lang.String SP_KEY_APP_BANNER_REQUEST_PREFIX;
    java.lang.String SP_KEY_APP_FULL_SCREEN_VIDEO_REQUEST_PREFIX;
    java.lang.String SP_KEY_APP_NATIVE_REQUEST_PREFIX;
    java.lang.String SP_KEY_APP_REWARDED_VIDEO_REQUEST_PREFIX;
    java.lang.String SP_KEY_APP_SDK_INIT;
    java.lang.String SP_KEY_APP_SPLASH_REQUEST_PREFIX;
    java.lang.String SP_KEY_APP_START;
    private java.lang.String appBannerRequest;
    private java.lang.String appFullScreenVideoRequest;
    private java.lang.String appNativeRequest;
    private java.lang.String appRewardedVideoRequest;
    private java.lang.String appSdkInit;
    private java.lang.String appSplashRequest;
    private java.lang.String appStart;
    private android.content.Context mContext;

    private AppEventId(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "AppStart"
            r1.SP_KEY_APP_START = r0
            java.lang.String r0 = "AppSdkInit"
            r1.SP_KEY_APP_SDK_INIT = r0
            java.lang.String r0 = "AppSplashRequest"
            r1.SP_KEY_APP_SPLASH_REQUEST_PREFIX = r0
            java.lang.String r0 = "AppNativeRequest"
            r1.SP_KEY_APP_NATIVE_REQUEST_PREFIX = r0
            java.lang.String r0 = "AppRewardedVideoRequest"
            r1.SP_KEY_APP_REWARDED_VIDEO_REQUEST_PREFIX = r0
            java.lang.String r0 = "AppFullScreenVideoRequest"
            r1.SP_KEY_APP_FULL_SCREEN_VIDEO_REQUEST_PREFIX = r0
            java.lang.String r0 = "AppBannerRequest"
            r1.SP_KEY_APP_BANNER_REQUEST_PREFIX = r0
            r1.mContext = r2
            return
    }

    private static java.lang.String getCacheEventId(android.content.Context r2, java.lang.String r3) {
            if (r2 == 0) goto L12
            java.lang.String r0 = "fusion_report"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            if (r2 == 0) goto L12
            java.lang.String r0 = ""
            java.lang.String r2 = r2.getString(r3, r0)
            return r2
        L12:
            r2 = 0
            return r2
    }

    public static com.beizi.fusion.model.AppEventId getInstance(android.content.Context r2) {
            com.beizi.fusion.model.AppEventId r0 = com.beizi.fusion.model.AppEventId.eventIdInstance
            if (r0 != 0) goto L19
            java.lang.Class<com.beizi.fusion.a.b> r0 = com.beizi.fusion.a.b.class
            monitor-enter(r0)
            com.beizi.fusion.model.AppEventId r1 = com.beizi.fusion.model.AppEventId.eventIdInstance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.beizi.fusion.model.AppEventId r1 = new com.beizi.fusion.model.AppEventId     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.beizi.fusion.model.AppEventId.eventIdInstance = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            com.beizi.fusion.model.AppEventId r2 = com.beizi.fusion.model.AppEventId.eventIdInstance
            return r2
    }

    public java.lang.String getAppBannerRequest() {
            r1 = this;
            java.lang.String r0 = r1.appBannerRequest
            return r0
    }

    public java.lang.String getAppFullScreenVideoRequest() {
            r1 = this;
            java.lang.String r0 = r1.appFullScreenVideoRequest
            return r0
    }

    public java.lang.String getAppNativeRequest() {
            r1 = this;
            java.lang.String r0 = r1.appNativeRequest
            return r0
    }

    public java.lang.String getAppRewardedVideoRequest() {
            r1 = this;
            java.lang.String r0 = r1.appRewardedVideoRequest
            return r0
    }

    public java.lang.String getAppSdkInit() {
            r1 = this;
            java.lang.String r0 = r1.appSdkInit
            return r0
    }

    public java.lang.String getAppSplashRequest() {
            r1 = this;
            java.lang.String r0 = r1.appSplashRequest
            return r0
    }

    public java.lang.String getAppStart() {
            r1 = this;
            java.lang.String r0 = r1.appStart
            return r0
    }

    public void setAppBannerRequest(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.mContext
            if (r0 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.SP_KEY_APP_BANNER_REQUEST_PREFIX
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = getCacheEventId(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L21
            r3.appBannerRequest = r4
        L21:
            return
    }

    public void setAppFullScreenVideoRequest(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.mContext
            if (r0 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.SP_KEY_APP_FULL_SCREEN_VIDEO_REQUEST_PREFIX
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = getCacheEventId(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L21
            r3.appFullScreenVideoRequest = r4
        L21:
            return
    }

    public void setAppNativeRequest(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.mContext
            if (r0 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.SP_KEY_APP_NATIVE_REQUEST_PREFIX
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = getCacheEventId(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L21
            r3.appNativeRequest = r4
        L21:
            return
    }

    public void setAppRewardedVideoRequest(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.mContext
            if (r0 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.SP_KEY_APP_REWARDED_VIDEO_REQUEST_PREFIX
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = getCacheEventId(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L21
            r3.appRewardedVideoRequest = r4
        L21:
            return
    }

    public void setAppSdkInit() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            if (r0 == 0) goto L12
            java.lang.String r1 = r2.SP_KEY_APP_SDK_INIT
            java.lang.String r0 = getCacheEventId(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L12
            r2.appSdkInit = r0
        L12:
            return
    }

    public void setAppSplashRequest(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.mContext
            if (r0 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.SP_KEY_APP_SPLASH_REQUEST_PREFIX
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = getCacheEventId(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L21
            r3.appSplashRequest = r4
        L21:
            return
    }

    public void setAppStart() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            if (r0 == 0) goto L12
            java.lang.String r1 = r2.SP_KEY_APP_START
            java.lang.String r0 = getCacheEventId(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L12
            r2.appStart = r0
        L12:
            return
    }
}
