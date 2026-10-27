package com.umeng.socialize;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class UMShareConfig {
    public static final int AUTH_TYPE_SSO = 1;
    public static final int AUTH_TYPE_WEBVIEW = 2;
    public static final int KAKAO_ACCOUNT = 2;
    public static final int KAKAO_STORY = 1;
    public static final int KAKAO_TALK = 0;
    public static final int LINED_IN_BASE_PROFILE = 0;
    public static final int LINED_IN_FULL_PROFILE = 1;
    public static final int LINKED_IN_FRIEND_SCOPE_ANYONE = 0;
    public static final int LINKED_IN_FRIEND_SCOPE_CONNECTIONS = 1;
    private com.umeng.socialize.interfaces.CompressListener compressListener;
    private int facebookAuthType;
    private boolean isHideQzoneOnQQFriendList;
    public boolean isNeedAuthOnGetUserInfo;
    private boolean isOpenShareEditActivity;
    private boolean isOpenWXAnalytics;
    private int kakaoAuthType;
    private int linkedInFriendScope;
    private int linkedInProfileScope;
    private java.lang.String platformName;
    private int sinaAuthType;

    public UMShareConfig() {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.isOpenShareEditActivity = r0
            java.lang.String r1 = ""
            r4.platformName = r1
            r1 = 0
            r4.isOpenWXAnalytics = r1
            int r2 = com.umeng.socialize.Config.LinkedInShareCode
            r4.setShareToLinkedInFriendScope(r2)
            int r2 = com.umeng.socialize.Config.QQWITHQZONE
            r3 = 2
            if (r2 != r3) goto L18
            r1 = 1
        L18:
            r4.setShareToQQFriendQzoneItemHide(r1)
            java.lang.String r1 = com.umeng.socialize.Config.appName
            r4.setShareToQQPlatformName(r1)
            r4.setSinaAuthType(r0)
            r4.setFacebookAuthType(r0)
            int r0 = com.umeng.socialize.Config.KaKaoLoginType
            r4.setKaKaoAuthType(r0)
            boolean r0 = com.umeng.socialize.Config.isNeedAuth
            r4.isNeedAuthOnGetUserInfo(r0)
            int r0 = com.umeng.socialize.Config.LinkedInProfileScope
            r4.setLinkedInProfileScope(r0)
            return
    }

    public final java.lang.String getAppName() {
            r2 = this;
            java.lang.String r0 = r2.platformName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L26
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.getContext()
            if (r0 == 0) goto L26
            android.content.pm.ApplicationInfo r1 = r0.getApplicationInfo()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.CharSequence r0 = r1.loadLabel(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L26
            java.lang.String r0 = r0.toString()
            r2.platformName = r0
        L26:
            java.lang.String r0 = r2.platformName
            return r0
    }

    public com.umeng.socialize.interfaces.CompressListener getCompressListener() {
            r1 = this;
            com.umeng.socialize.interfaces.CompressListener r0 = r1.compressListener
            return r0
    }

    public boolean getOpenWXAnalytics() {
            r1 = this;
            boolean r0 = r1.isOpenWXAnalytics
            return r0
    }

    public final boolean isFacebookAuthWithWebView() {
            r2 = this;
            int r0 = r2.facebookAuthType
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final boolean isHideQzoneOnQQFriendList() {
            r1 = this;
            boolean r0 = r1.isHideQzoneOnQQFriendList
            return r0
    }

    public final boolean isKakaoAuthWithAccount() {
            r2 = this;
            int r0 = r2.kakaoAuthType
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final boolean isKakaoAuthWithStory() {
            r2 = this;
            int r0 = r2.kakaoAuthType
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public final boolean isKakaoAuthWithTalk() {
            r1 = this;
            int r0 = r1.kakaoAuthType
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean isLinkedInProfileBase() {
            r1 = this;
            int r0 = r1.linkedInProfileScope
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean isLinkedInShareToAnyone() {
            r1 = this;
            int r0 = r1.linkedInFriendScope
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public com.umeng.socialize.UMShareConfig isNeedAuthOnGetUserInfo(boolean r1) {
            r0 = this;
            r0.isNeedAuthOnGetUserInfo = r1
            return r0
    }

    public final boolean isNeedAuthOnGetUserInfo() {
            r1 = this;
            boolean r0 = r1.isNeedAuthOnGetUserInfo
            return r0
    }

    public com.umeng.socialize.UMShareConfig isOpenShareEditActivity(boolean r1) {
            r0 = this;
            r0.isOpenShareEditActivity = r1
            com.umeng.socialize.uploadlog.UMLog.setIsOpenShareEdit(r1)
            return r0
    }

    public final boolean isOpenShareEditActivity() {
            r1 = this;
            boolean r0 = r1.isOpenShareEditActivity
            return r0
    }

    public final boolean isSinaAuthWithWebView() {
            r2 = this;
            int r0 = r2.sinaAuthType
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public void setCompressListener(com.umeng.socialize.interfaces.CompressListener r1) {
            r0 = this;
            r0.compressListener = r1
            return
    }

    public com.umeng.socialize.UMShareConfig setFacebookAuthType(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L8
            r0 = 2
            if (r2 != r0) goto L7
            goto L8
        L7:
            return r1
        L8:
            r1.facebookAuthType = r2
            return r1
    }

    public com.umeng.socialize.UMShareConfig setKaKaoAuthType(int r2) {
            r1 = this;
            if (r2 == 0) goto La
            r0 = 2
            if (r2 == r0) goto La
            r0 = 1
            if (r2 != r0) goto L9
            goto La
        L9:
            return r1
        La:
            r1.kakaoAuthType = r2
            return r1
    }

    public com.umeng.socialize.UMShareConfig setLinkedInProfileScope(int r2) {
            r1 = this;
            if (r2 == 0) goto L7
            r0 = 1
            if (r2 != r0) goto L6
            goto L7
        L6:
            return r1
        L7:
            r1.linkedInProfileScope = r2
            return r1
    }

    public void setOpenWXAnalytics(boolean r1) {
            r0 = this;
            r0.isOpenWXAnalytics = r1
            return
    }

    public com.umeng.socialize.UMShareConfig setShareToLinkedInFriendScope(int r2) {
            r1 = this;
            if (r2 == 0) goto L7
            r0 = 1
            if (r2 != r0) goto L6
            goto L7
        L6:
            return r1
        L7:
            r1.linkedInFriendScope = r2
            return r1
    }

    public com.umeng.socialize.UMShareConfig setShareToQQFriendQzoneItemHide(boolean r1) {
            r0 = this;
            r0.isHideQzoneOnQQFriendList = r1
            return r0
    }

    public com.umeng.socialize.UMShareConfig setShareToQQPlatformName(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L8
            r1.platformName = r2
        L8:
            return r1
    }

    public com.umeng.socialize.UMShareConfig setSinaAuthType(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L8
            r0 = 2
            if (r2 != r0) goto L7
            goto L8
        L7:
            return r1
        L8:
            r1.sinaAuthType = r2
            return r1
    }
}
