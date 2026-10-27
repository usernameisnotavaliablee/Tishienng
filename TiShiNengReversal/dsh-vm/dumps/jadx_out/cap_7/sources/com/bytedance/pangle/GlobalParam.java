package com.bytedance.pangle;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class GlobalParam {
    private static com.bytedance.pangle.GlobalParam mInstance;
    private boolean hasInit;
    private boolean mAutoFetch;
    private boolean mCheckMatchHostAbi;
    private boolean mCheckPermission;
    private boolean mCloseBgDex2oat;
    private boolean mCloseCrashMonitor;
    private boolean mCloseFlipped;
    private boolean mCloseHookHuaweiOnInit;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> mCustomTag;
    private boolean mDebug;
    private long mDexOptDelayTime;
    private java.lang.String mDid;
    private java.io.File mDownloadDir;
    private boolean mFastDex2oat;
    private java.lang.String mHostUrl;
    private int mInstallThreads;
    private com.bytedance.pangle.log.IZeusLogger mLogger;
    private boolean mPostBgDexOptByInit;
    private final java.util.Map<java.lang.String, java.lang.Integer> mRemoveApkEntry;
    private com.bytedance.pangle.log.IZeusReporter mReporter;
    private final java.util.Map<java.lang.String, java.lang.String> mRequestHeader;
    private final java.util.Map<java.lang.String, java.lang.String> mSignature;
    private final java.util.Map<java.lang.String, java.lang.Boolean> unInstallPluginWhenHostChange;


    public GlobalParam() {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.hasInit = r0
            r1 = 1
            r4.mDebug = r1
            com.bytedance.pangle.GlobalParam$1 r2 = new com.bytedance.pangle.GlobalParam$1
            r2.<init>(r4)
            r4.mReporter = r2
            r4.mInstallThreads = r1
            r4.mCheckMatchHostAbi = r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r4.mRequestHeader = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r4.unInstallPluginWhenHostChange = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r4.mCustomTag = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r4.mSignature = r2
            r2 = 15000(0x3a98, double:7.411E-320)
            r4.mDexOptDelayTime = r2
            r4.mPostBgDexOptByInit = r1
            r4.mAutoFetch = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r4.mRemoveApkEntry = r1
            r4.mCloseBgDex2oat = r0
            return
    }

    private void ensureInit() {
            r1 = this;
            boolean r0 = r1.hasInit
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
    }

    public static com.bytedance.pangle.GlobalParam getInstance() {
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.mInstance
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.pangle.GlobalParam> r0 = com.bytedance.pangle.GlobalParam.class
            monitor-enter(r0)
            com.bytedance.pangle.GlobalParam r1 = com.bytedance.pangle.GlobalParam.mInstance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.pangle.GlobalParam r1 = new com.bytedance.pangle.GlobalParam     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.pangle.GlobalParam.mInstance = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.mInstance
            return r0
    }

    public void addRequestHeader(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.ensureInit()
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.mRequestHeader
            r0.put(r2, r3)
            return
    }

    public boolean autoFetch() {
            r1 = this;
            boolean r0 = r1.mAutoFetch
            return r0
    }

    public boolean checkMatchHostAbi() {
            r1 = this;
            boolean r0 = r1.mCheckMatchHostAbi
            return r0
    }

    public boolean checkPermission() {
            r1 = this;
            boolean r0 = r1.mCheckPermission
            return r0
    }

    public void closeBgDex2oat(boolean r1) {
            r0 = this;
            r0.ensureInit()
            r0.mCloseBgDex2oat = r1
            return
    }

    public void closeCrashMonitor(boolean r1) {
            r0 = this;
            r0.ensureInit()
            r0.mCloseCrashMonitor = r1
            return
    }

    public void closeHookHuaweiOnInit(boolean r1) {
            r0 = this;
            r0.ensureInit()
            r0.mCloseHookHuaweiOnInit = r1
            return
    }

    public boolean closeHookHuaweiOnInit() {
            r1 = this;
            boolean r0 = r1.mCloseHookHuaweiOnInit
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> getCustomTag(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = r1.mCustomTag
            java.lang.Object r2 = r0.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            return r2
    }

    public long getDexOptDelayTime() {
            r2 = this;
            long r0 = r2.mDexOptDelayTime
            return r0
    }

    public java.lang.String getDid() {
            r1 = this;
            java.lang.String r0 = r1.mDid
            return r0
    }

    public java.io.File getDownloadDir() {
            r1 = this;
            java.io.File r0 = r1.mDownloadDir
            return r0
    }

    public java.lang.String getHostUrl() {
            r1 = this;
            java.lang.String r0 = r1.mHostUrl
            return r0
    }

    public int getInstallThreads() {
            r1 = this;
            int r0 = r1.mInstallThreads
            return r0
    }

    public com.bytedance.pangle.log.IZeusLogger getLogger() {
            r1 = this;
            com.bytedance.pangle.log.IZeusLogger r0 = r1.mLogger
            return r0
    }

    public int getRemoveApkEntryFlag(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.mRemoveApkEntry
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto Lf
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        Lf:
            int r2 = r2.intValue()
            return r2
    }

    public com.bytedance.pangle.log.IZeusReporter getReporter() {
            r1 = this;
            com.bytedance.pangle.log.IZeusReporter r0 = r1.mReporter
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> getRequestHeader() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.mRequestHeader
            return r0
    }

    public java.lang.String getSignature(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.mSignature
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public void init() {
            r1 = this;
            r0 = 1
            r1.hasInit = r0
            return
    }

    public boolean isCloseBgDex2oat() {
            r1 = this;
            boolean r0 = r1.mCloseBgDex2oat
            return r0
    }

    public boolean isCloseCrashMonitor() {
            r1 = this;
            boolean r0 = r1.mCloseCrashMonitor
            return r0
    }

    public boolean isCloseFlipped() {
            r1 = this;
            boolean r0 = r1.mCloseFlipped
            return r0
    }

    public boolean isDebug() {
            r1 = this;
            boolean r0 = r1.mDebug
            return r0
    }

    public boolean isFastDex2oat() {
            r1 = this;
            boolean r0 = r1.mFastDex2oat
            return r0
    }

    public boolean isPostBgDexOptByInit() {
            r1 = this;
            boolean r0 = r1.mPostBgDexOptByInit
            return r0
    }

    public void postBgDexOptByInit(boolean r1) {
            r0 = this;
            r0.ensureInit()
            boolean r1 = r0.mPostBgDexOptByInit
            r0.mPostBgDexOptByInit = r1
            return
    }

    public void removeApkEntry(java.lang.String r1, boolean r2, boolean r3) {
            r0 = this;
            r0.ensureInit()
            if (r3 == 0) goto L7
            r2 = r2 | 2
        L7:
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r0.mRemoveApkEntry
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.put(r1, r2)
            return
    }

    public void setAutoFetch(boolean r1) {
            r0 = this;
            r0.ensureInit()
            r0.mAutoFetch = r1
            return
    }

    public void setCheckMatchHostAbi(boolean r1) {
            r0 = this;
            r0.mCheckMatchHostAbi = r1
            return
    }

    public void setCheckPermission(boolean r1) {
            r0 = this;
            r0.mCheckPermission = r1
            return
    }

    public void setCloseFlipped(boolean r1) {
            r0 = this;
            r0.ensureInit()
            r0.mCloseFlipped = r1
            return
    }

    public void setCustomTag(java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = r1.mCustomTag
            r0.put(r2, r3)
            return
    }

    public void setDebug(boolean r1) {
            r0 = this;
            r0.ensureInit()
            r0.mDebug = r1
            return
    }

    public void setDexOptDelayTime(long r1) {
            r0 = this;
            r0.ensureInit()
            r0.mDexOptDelayTime = r1
            return
    }

    public void setDid(java.lang.String r1) {
            r0 = this;
            r0.mDid = r1
            return
    }

    public void setDownloadDir(java.io.File r1) {
            r0 = this;
            r0.ensureInit()
            r0.mDownloadDir = r1
            return
    }

    public void setFastDex2oat(boolean r1) {
            r0 = this;
            r0.mFastDex2oat = r1
            return
    }

    public void setHostUrl(java.lang.String r1) {
            r0 = this;
            r0.ensureInit()
            r0.mHostUrl = r1
            return
    }

    public void setInstallThreads(int r1) {
            r0 = this;
            r0.ensureInit()
            r0.mInstallThreads = r1
            return
    }

    public void setLogger(com.bytedance.pangle.log.IZeusLogger r1) {
            r0 = this;
            r0.ensureInit()
            r0.mLogger = r1
            return
    }

    public void setReporter(com.bytedance.pangle.log.IZeusReporter r1) {
            r0 = this;
            r0.ensureInit()
            if (r1 == 0) goto L7
            r0.mReporter = r1
        L7:
            return
    }

    public void setSignature(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.ensureInit()
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.mSignature
            r0.put(r2, r3)
            return
    }

    public void setUnInstallPluginWhenHostChange(java.lang.String r2, boolean r3) {
            r1 = this;
            r1.ensureInit()
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r1.unInstallPluginWhenHostChange
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.put(r2, r3)
            return
    }

    public boolean unInstallPluginWhenHostChange(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r1.unInstallPluginWhenHostChange
            java.lang.Object r2 = r0.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            boolean r2 = r2.booleanValue()
            return r2
    }
}
