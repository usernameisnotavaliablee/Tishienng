package com.umeng.socialize.handler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class UMSSOHandler {
    protected static final java.lang.String ACCESSTOKEN = "accessToken";
    protected static final java.lang.String ACCESS_SECRET = "access_secret";
    protected static final java.lang.String ACCESS_TOKEN = "access_token";
    protected static final java.lang.String CITY = "city";
    protected static final java.lang.String CODE = "code";
    protected static final java.lang.String COUNTRY = "country";
    protected static final java.lang.String EMAIL = "email";
    protected static final java.lang.String EXPIRATION = "expiration";
    protected static final java.lang.String EXPIRES_IN = "expires_in";
    protected static final java.lang.String FIRST_NAME = "first_name";
    protected static final java.lang.String GENDER = "gender";
    protected static final java.lang.String ICON = "iconurl";
    protected static final java.lang.String ID = "id";
    protected static final java.lang.String JSON = "json";
    protected static final java.lang.String LAST_NAME = "last_name";
    protected static final java.lang.String MIDDLE_NAME = "middle_name";
    protected static final java.lang.String NAME = "name";
    protected static final java.lang.String OPENID = "openid";

    @java.lang.Deprecated
    protected static final java.lang.String PROFILE_IMAGE_URL = "profile_image_url";
    protected static final java.lang.String PROVINCE = "province";
    protected static final java.lang.String REFRESHTOKEN = "refreshToken";
    protected static final java.lang.String REFRESH_TOKEN = "refresh_token";
    protected static final java.lang.String REGION = "region";

    @java.lang.Deprecated
    protected static final java.lang.String SCREEN_NAME = "screen_name";
    protected static final java.lang.String UID = "uid";
    protected static final java.lang.String UNIONID = "unionid";
    protected static final java.lang.String USERID = "UserId";
    protected static final java.lang.String USID = "usid";
    private static final com.umeng.socialize.UMShareConfig mDefaultShareConfig = null;
    protected java.lang.String VERSION;
    private boolean isInit;
    private com.umeng.socialize.PlatformConfig.Platform mConfig;
    private android.content.Context mContext;
    protected com.umeng.socialize.UMShareConfig mShareConfig;
    protected int mThumbLimit;
    protected java.lang.ref.WeakReference<android.app.Activity> mWeakAct;



    static {
            com.umeng.socialize.UMShareConfig r0 = new com.umeng.socialize.UMShareConfig
            r0.<init>()
            com.umeng.socialize.handler.UMSSOHandler.mDefaultShareConfig = r0
            return
    }

    public UMSSOHandler() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mContext = r0
            r1.mConfig = r0
            java.lang.String r0 = ""
            r1.VERSION = r0
            r0 = 0
            r1.isInit = r0
            r0 = 32768(0x8000, float:4.5918E-41)
            r1.mThumbLimit = r0
            return
    }

    public void authorize(com.umeng.socialize.UMAuthListener r1) {
            r0 = this;
            return
    }

    public void deleteAuth(com.umeng.socialize.UMAuthListener r1) {
            r0 = this;
            return
    }

    public com.umeng.socialize.UMAuthListener getAuthListener(com.umeng.socialize.UMAuthListener r1) {
            r0 = this;
            if (r1 == 0) goto L3
            return r1
        L3:
            com.umeng.socialize.handler.UMSSOHandler$2 r1 = new com.umeng.socialize.handler.UMSSOHandler$2
            r1.<init>(r0)
            return r1
    }

    public com.umeng.socialize.PlatformConfig.Platform getConfig() {
            r1 = this;
            com.umeng.socialize.PlatformConfig$Platform r0 = r1.mConfig
            return r0
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    protected android.app.Activity getCurrentActivity() {
            r3 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r3.mWeakAct
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            boolean r2 = r0.isFinishing()
            if (r2 == 0) goto L16
            return r1
        L16:
            return r0
    }

    public java.lang.String getGender(java.lang.Object r6) {
            r5 = this;
            java.lang.String r0 = com.umeng.socialize.bean.StringName.male
            java.lang.String r1 = com.umeng.socialize.bean.StringName.female
            if (r6 != 0) goto L9
            java.lang.String r6 = ""
            return r6
        L9:
            boolean r2 = r6 instanceof java.lang.String
            if (r2 == 0) goto L44
            java.lang.String r2 = "m"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L52
            java.lang.String r2 = "1"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L52
            java.lang.String r2 = "男"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L26
            goto L52
        L26:
            java.lang.String r0 = "f"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L59
            java.lang.String r0 = "0"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L59
            java.lang.String r0 = "女"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L3f
            goto L59
        L3f:
            java.lang.String r6 = r6.toString()
            return r6
        L44:
            boolean r2 = r6 instanceof java.lang.Integer
            if (r2 == 0) goto L5f
            r2 = r6
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
            r4 = 1
            if (r3 != r4) goto L53
        L52:
            return r0
        L53:
            int r0 = r2.intValue()
            if (r0 != 0) goto L5a
        L59:
            return r1
        L5a:
            java.lang.String r6 = r6.toString()
            return r6
        L5f:
            java.lang.String r6 = r6.toString()
            return r6
    }

    public android.net.Uri getImageContentUri(java.io.File r10) {
            r9 = this;
            java.lang.String r0 = r10.getAbsolutePath()
            android.content.Context r1 = r9.mContext
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            android.content.ContentResolver r2 = r1.getContentResolver()
            android.net.Uri r3 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.lang.String r8 = "_id"
            java.lang.String[] r4 = new java.lang.String[]{r8}
            java.lang.String[] r6 = new java.lang.String[]{r0}
            r7 = 0
            java.lang.String r5 = "_data=? "
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L54
            boolean r4 = r2.moveToFirst()
            if (r4 == 0) goto L54
            int r10 = r2.getColumnIndex(r8)
            int r10 = r2.getInt(r10)
            r2.close()     // Catch: java.lang.Throwable -> L38
        L38:
            java.lang.String r0 = "content://media/external/images/media"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ""
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.net.Uri r10 = android.net.Uri.withAppendedPath(r0, r10)
            return r10
        L54:
            boolean r10 = r10.exists()
            if (r10 == 0) goto L6d
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>()
            java.lang.String r2 = "_data"
            r10.put(r2, r0)
            android.content.ContentResolver r0 = r1.getContentResolver()
            android.net.Uri r10 = r0.insert(r3, r10)
            return r10
        L6d:
            r10 = 0
            return r10
    }

    public void getPlatformInfo(com.umeng.socialize.UMAuthListener r1) {
            r0 = this;
            return
    }

    public int getRequestCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getSDKVersion() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    protected final com.umeng.socialize.UMShareConfig getShareConfig() {
            r1 = this;
            com.umeng.socialize.UMShareConfig r0 = r1.mShareConfig
            if (r0 != 0) goto L6
            com.umeng.socialize.UMShareConfig r0 = com.umeng.socialize.handler.UMSSOHandler.mDefaultShareConfig
        L6:
            return r0
    }

    public com.umeng.socialize.UMShareListener getShareListener(com.umeng.socialize.UMShareListener r1) {
            r0 = this;
            if (r1 == 0) goto L3
            return r1
        L3:
            com.umeng.socialize.handler.UMSSOHandler$1 r1 = new com.umeng.socialize.handler.UMSSOHandler$1
            r1.<init>(r0)
            return r1
    }

    public abstract java.lang.String getVersion();

    public boolean isAuthorize() {
            r1 = this;
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CHECK.NO_SUPPORT_AUTH
            com.umeng.socialize.utils.SLog.E(r0)
            r0 = 1
            return r0
    }

    public boolean isHasAuthListener() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean isInstall() {
            r1 = this;
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CHECK.NO_SUPPORT_INSTALL
            com.umeng.socialize.utils.SLog.E(r0)
            r0 = 1
            return r0
    }

    public boolean isSupport() {
            r1 = this;
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CHECK.NO_SUPPORT_SDKL
            com.umeng.socialize.utils.SLog.E(r0)
            r0 = 1
            return r0
    }

    public boolean isSupportAuth() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void onActivityResult(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            return
    }

    public void onCreate(android.content.Context r3, com.umeng.socialize.PlatformConfig.Platform r4) {
            r2 = this;
            java.lang.String r0 = "xxxxxx UMSSOHandler 7.3.2"
            com.umeng.socialize.utils.SLog.E(r0)
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.getContext()
            r2.mContext = r0
            r2.mConfig = r4
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L1a
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            android.app.Activity r3 = (android.app.Activity) r3
            r0.<init>(r3)
            r2.mWeakAct = r0
        L1a:
            boolean r3 = r2.isInit
            if (r3 != 0) goto L5e
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.INTER.PINFO
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.umeng.socialize.bean.SHARE_MEDIA r4 = r4.getName()
            java.lang.String r4 = r4.getName()
            java.lang.String r4 = com.umeng.socialize.utils.UmengText.INTER.getVersion(r4)
            r0.append(r4)
            java.lang.String r4 = r2.getVersion()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.INTER.HANDLERID
            r0.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r0}
            com.umeng.socialize.utils.SLog.mutlI(r3)
            r3 = 1
            r2.isInit = r3
        L5e:
            return
    }

    public void onResume() {
            r0 = this;
            return
    }

    public void release() {
            r0 = this;
            return
    }

    public void setAuthListener(com.umeng.socialize.UMAuthListener r1) {
            r0 = this;
            return
    }

    public final void setShareConfig(com.umeng.socialize.UMShareConfig r1) {
            r0 = this;
            r0.mShareConfig = r1
            return
    }

    public abstract boolean share(com.umeng.socialize.ShareContent r1, com.umeng.socialize.UMShareListener r2);
}
