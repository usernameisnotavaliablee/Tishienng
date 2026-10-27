package com.bykv.vk.component.ttvideo.mediakit.medialoader;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AVMDLDataLoaderConfigure {
    public static final int ALLOW_PRELOAD_WHEN_PLAY = 0;
    public static final int DEFAULT_CHECK_SUM_LEVEL = 0;
    public static final int DEFAULT_MAX_CACHE_AGE = 1209600;
    public static final int DEFAULT_MAX_CACHE_SIZE = 314572800;
    public static final int DEFAULT_MAX_FACTORY_CACHE_SIZE = 209715200;
    public static final int DEFAULT_MAX_FACTORY_MEMORY_SIZE = 5242880;
    public static final int DEFAULT_P2P_PREDOWN_PEER_COUNT = 5;
    public static final int DEFAULT_PRELOAD_PARALLEL_NUM = 1;
    public static final int DEFAULT_SOCKET_IDLE_TIMEOUT = 120;
    public static final int DISABLE_EXTERN_DNS = 0;
    public static final int DISABLE_SOCKET_REUSE = 0;
    public static final int ENABLE_EXTERN_DNS = 1;
    public static final int ENABLE_SOCKET_REUSE = 1;
    public static final int ENCRYPT_VERSION_0 = 0;
    public static final int ENCRYPT_VERSION_1 = 1;
    public static final int IsCheckAfterAll = 1;
    public static final int IsCheckAfterPreloadTask = 0;
    public static final int NOT_ALLOW_PLAY_TASK_KEY_PRELOAD = 1;
    public static final int NOT_ALLOW_PRELOAD_WHEN_PLAY = 2;
    private static final java.lang.String TAG = "AVMDLDataLoaderConfigure";
    public static final int TEST_SPEED_TYPE_VERSION_1 = 1;
    public static final int TEST_SPEED_TYPE_VERSION_2 = 2;
    public static final int WAIT_LIST_IS_QUEUE = 1;
    public static final int WAIT_LIST_IS_STACK = 0;
    public static final int XY_DY_LIB = 1;
    public static final int XY_XG_LIB = 0;
    public int mAccessCheckLevel;
    public int mAlogEnable;
    public java.lang.String mAppInfo;
    public java.lang.String mCacheDir;
    public java.lang.String mCacheDirListsStr;
    public int mCheckPreloadLevel;
    public int mCheckSumLevel;
    public long mConnectPoolStragetyValue;
    public int mControlCDNRangeType;
    public int mDNSBackType;
    public int mDNSMainType;
    public int mDefaultExpiredTime;
    public java.lang.String mDmDomain;
    public java.lang.String mDomains;
    public java.lang.String mDownloadDir;
    public int mEnableBenchMarkIOSpeed;
    public int mEnableCacheReqRange;
    public int mEnableDownloaderLog;
    public int mEnableDynamicTimeout;
    public int mEnableEarlyData;
    public int mEnableEventInfo;
    public int mEnableExternDNS;
    public int mEnableFileCacheV2;
    public int mEnableFileRingBuffer;
    public int mEnableIOManager;
    public int mEnableIpBucket;
    public int mEnableLazyBufferpool;
    public int mEnableLoaderPreempt;
    public int mEnableLoaderSeek;
    public int mEnableNetScheduler;
    public int mEnableNewBufferpool;
    public int mEnableOwnVDPPreloadNotify;
    public int mEnableP2PPreDown;
    public int mEnablePlayInfoCache;
    public int mEnablePlayLog;
    public int mEnablePreconnect;
    public int mEnablePreloadReUse;
    public int mEnableReportTaskLog;
    public int mEnableSessionReuse;
    public int mEnableSocketReuse;
    public int mEnableStorageModule;
    public int mEnableSyncDnsForPcdn;
    public int mEnableTTNetLoader;
    public int mEnableUseFileExtendLoaderBuffer;
    public int mEncryptVersion;
    public int mErrorStateTrustTime;
    public int mFileExtendSizeKB;
    public int mFirstRangeLeftThreshold;
    public int mForbidByPassCookie;
    public java.lang.String mForesightDomain;
    public int mGlobalSpeedSampleInterval;
    public int mIgnorePlayInfo;
    public int mIsAllowTryTheLastUrl;
    public int mIsCloseFileCache;
    public java.lang.String mKeyDomain;
    public java.lang.String mKeyToken;
    public int mLiveCacheThresholdHttpToP2p;
    public int mLiveCacheThresholdP2pToHttp;
    public java.lang.String mLiveContainerString;
    public int mLiveEnableMdlProto;
    public int mLiveLoaderEnable;
    public int mLiveLoaderType;
    public int mLiveMaxTrySwitchP2pTimes;
    public int mLiveMobileDownloadAllow;
    public int mLiveMobileUploadAllow;
    public int mLiveP2pAllow;
    public int mLiveRecvDataTimeout;
    public int mLiveWaitP2pReadyThreshold;
    public int mLiveWatchDurationThreshold;
    public java.lang.String mLoaderFactoryDir;
    public int mLoaderFactoryMaxCacheSize;
    public int mLoaderFactoryMaxMemorySize;
    public int mLoaderFactoryP2PLevel;
    public int mLoaderType;
    public int mMainToBackUpDelayedTime;
    public int mMaxAliveHostNum;
    public int mMaxCacheAge;
    public int mMaxCacheSize;
    public int mMaxFileMemCacheNum;
    public int mMaxFileMemCacheSize;
    public int mMaxIPV4Num;
    public int mMaxIPV6Num;
    public int mMaxIpCountEachDomain;
    public int mMaxSocketReuseCount;
    public int mMaxTlsVersion;
    public int mMinAllowSpeed;
    public long mMonitorMinAllowLoadSize;
    public long mMonitorTimeInternal;
    public java.lang.String mNetCacheDir;
    public int mNetSChedulerBlockDurationMs;
    public int mNetSchedulerBlockAllNetErr;
    public int mNetSchedulerBlockErrCount;
    public int mNetSchedulerBlockHostIpErrCount;
    public int mNewBufferPoolBlockSize;
    public int mNewBufferPoolGrowBlockCount;
    public int mNewBufferPoolResidentSize;
    public int mNextDownloadThreshold;
    public int mOnlyUseCdn;
    public int mOpenTimeOut;
    public int mP2PFirstRangeLoaderType;
    public int mP2PPreDownPeerCount;
    public long mP2PStragetyLevel;
    public int mPreconnectNum;
    public int mPreloadParallelNum;
    public int mPreloadStrategy;
    public int mPreloadWaitListType;
    public int mRWTimeOut;
    public int mRingBufferSizeKB;
    public int mSessionTimeout;
    public java.lang.String mSettingsDomain;
    public int mSocketIdleTimeOut;
    public int mSocketInitialTimeout;
    public int mSocketSendBufferKB;
    public java.lang.String mSocketTraingCenterConfigStr;
    public int mSpeedCoefficientValue;
    public int mSpeedSampleInterval;
    public int mStoIoWriteLimitKBTh1;
    public int mStoIoWriteLimitKBTh2;
    public int mStoMaxIdleTimeSec;
    public int mStoPlayDldWinSizeKBLS;
    public int mStoPlayDldWinSizeKBNM;
    public int mStoRingBufferSizeKB;
    public int mTTNetLoaderCronetBufSizeKB;
    public int mTestSpeedTypeVersion;
    public int mTryCount;
    public java.lang.String mVdpABTestId;
    public java.lang.String mVdpGroupId;
    public int mWriteFileNotifyIntervalMS;
    public int mXYLibValue;

    public AVMDLDataLoaderConfigure(int r3, int r4, int r5, int r6, java.lang.String r7) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mAlogEnable = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2.mMaxIPV6Num = r1
            r2.mMaxIPV4Num = r1
            r2.mEnablePlayLog = r0
            r2.mEnableNetScheduler = r0
            r2.mEnableCacheReqRange = r0
            r2.mEnableTTNetLoader = r0
            r2.mTTNetLoaderCronetBufSizeKB = r0
            r2.mNetSchedulerBlockAllNetErr = r0
            r2.mNetSchedulerBlockErrCount = r0
            r2.mNetSchedulerBlockHostIpErrCount = r0
            r2.mNetSChedulerBlockDurationMs = r0
            r2.mFirstRangeLeftThreshold = r0
            r1 = 5
            r2.mP2PPreDownPeerCount = r1
            r1 = 1
            r2.mP2PFirstRangeLoaderType = r1
            r2.mEnableStorageModule = r0
            r2.mStoPlayDldWinSizeKBNM = r0
            r2.mStoPlayDldWinSizeKBLS = r0
            r2.mStoRingBufferSizeKB = r0
            r2.mStoIoWriteLimitKBTh1 = r0
            r2.mStoIoWriteLimitKBTh2 = r0
            r2.mStoMaxIdleTimeSec = r0
            r2.mMaxCacheSize = r3
            r2.mOpenTimeOut = r4
            r2.mRWTimeOut = r5
            r2.mTryCount = r6
            r2.mCacheDir = r7
            r2.mLoaderType = r0
            r3 = 0
            r2.mLoaderFactoryDir = r3
            r4 = 209715200(0xc800000, float:1.9721523E-31)
            r2.mLoaderFactoryMaxCacheSize = r4
            r4 = 5242880(0x500000, float:7.34684E-39)
            r2.mLoaderFactoryMaxMemorySize = r4
            r2.mPreloadParallelNum = r1
            r4 = 1209600(0x127500, float:1.69501E-39)
            r2.mMaxCacheAge = r4
            r2.mPreloadStrategy = r1
            r2.mPreloadWaitListType = r1
            r2.mEnablePreloadReUse = r0
            r2.mEnableExternDNS = r0
            r2.mEnableSocketReuse = r0
            r2.mControlCDNRangeType = r0
            r2.mIsCloseFileCache = r0
            r4 = 120(0x78, float:1.68E-43)
            r2.mSocketIdleTimeOut = r4
            r2.mDNSMainType = r0
            r5 = 2
            r2.mDNSBackType = r5
            r2.mMainToBackUpDelayedTime = r0
            r6 = 3
            r2.mLoaderFactoryP2PLevel = r6
            r2.mTestSpeedTypeVersion = r1
            r2.mCheckSumLevel = r0
            r2.mDefaultExpiredTime = r4
            r2.mAppInfo = r3
            r2.mEncryptVersion = r0
            r2.mSpeedCoefficientValue = r0
            r2.mEnableBenchMarkIOSpeed = r0
            r2.mMaxIpCountEachDomain = r0
            r2.mEnableIpBucket = r0
            r2.mErrorStateTrustTime = r0
            r2.mOnlyUseCdn = r0
            r4 = -1
            r2.mSocketSendBufferKB = r4
            r2.mRingBufferSizeKB = r4
            r2.mEnableFileCacheV2 = r0
            r2.mVdpABTestId = r3
            r2.mVdpGroupId = r3
            r2.mEnableReportTaskLog = r0
            r4 = 8192(0x2000, float:1.148E-41)
            r2.mFileExtendSizeKB = r4
            r2.mLiveP2pAllow = r0
            r4 = 10000(0x2710, float:1.4013E-41)
            r2.mLiveLoaderType = r4
            r2.mLiveLoaderEnable = r0
            r4 = 20000(0x4e20, float:2.8026E-41)
            r2.mLiveWatchDurationThreshold = r4
            r4 = 3500(0xdac, float:4.905E-42)
            r2.mLiveCacheThresholdHttpToP2p = r4
            r4 = 1000(0x3e8, float:1.401E-42)
            r2.mLiveCacheThresholdP2pToHttp = r4
            r2.mLiveMaxTrySwitchP2pTimes = r6
            r4 = 60000(0xea60, float:8.4078E-41)
            r2.mLiveWaitP2pReadyThreshold = r4
            r2.mLiveMobileUploadAllow = r0
            r2.mLiveMobileDownloadAllow = r0
            r4 = 5000(0x1388, float:7.006E-42)
            r2.mLiveRecvDataTimeout = r4
            r2.mLiveContainerString = r3
            r2.mLiveEnableMdlProto = r0
            r2.mEnablePreconnect = r0
            r2.mPreconnectNum = r6
            r2.mEnableLoaderPreempt = r0
            r2.mNextDownloadThreshold = r0
            r2.mAccessCheckLevel = r0
            r2.mEnableP2PPreDown = r0
            r2.mNetCacheDir = r3
            r2.mMaxTlsVersion = r5
            r2.mEnableSessionReuse = r0
            r2.mEnableSyncDnsForPcdn = r0
            r2.mIgnorePlayInfo = r0
            r2.mSettingsDomain = r3
            r2.mDmDomain = r3
            r2.mForesightDomain = r3
            r2.mDomains = r3
            r2.mCheckPreloadLevel = r0
            r2.mXYLibValue = r1
            r4 = 500(0x1f4, float:7.0E-43)
            r2.mWriteFileNotifyIntervalMS = r4
            r2.mEnableFileRingBuffer = r0
            r2.mEnableLazyBufferpool = r0
            r2.mEnableNewBufferpool = r0
            r2.mNewBufferPoolBlockSize = r0
            r2.mNewBufferPoolResidentSize = r0
            r2.mNewBufferPoolGrowBlockCount = r0
            r2.mEnableUseFileExtendLoaderBuffer = r0
            r2.mMaxFileMemCacheSize = r0
            r2.mMaxFileMemCacheNum = r0
            r2.mDownloadDir = r3
            r2.mKeyDomain = r3
            r2.mKeyToken = r3
            r2.mForbidByPassCookie = r0
            r4 = 3600(0xe10, float:5.045E-42)
            r2.mSessionTimeout = r4
            r2.mEnablePlayInfoCache = r0
            r2.mEnableDownloaderLog = r0
            r2.mIsAllowTryTheLastUrl = r0
            r2.mSpeedSampleInterval = r0
            r2.mEnableIOManager = r0
            r2.mEnableLoaderSeek = r0
            r2.mGlobalSpeedSampleInterval = r0
            r2.mEnableDynamicTimeout = r0
            r2.mSocketInitialTimeout = r6
            r2.mMaxSocketReuseCount = r0
            r4 = 0
            r2.mP2PStragetyLevel = r4
            r2.mConnectPoolStragetyValue = r4
            r2.mMaxAliveHostNum = r0
            r2.mMinAllowSpeed = r0
            r2.mEnableOwnVDPPreloadNotify = r1
            r2.mMonitorTimeInternal = r4
            r2.mMonitorMinAllowLoadSize = r4
            r2.mSocketTraingCenterConfigStr = r3
            r2.mEnableEventInfo = r0
            r2.mCacheDirListsStr = r3
            r2.mEnableEarlyData = r0
            return
    }

    public static com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure getDefaultonfigure() {
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = new com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure
            r4 = 0
            r5 = 0
            r1 = 314572800(0x12c00000, float:1.21169035E-27)
            r2 = 5
            r3 = 5
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public void ParseJsonConfig() {
            r4 = this;
            java.lang.String r0 = "ttmn"
            java.lang.String r1 = "enable_mdl_proto"
            java.lang.String r2 = r4.mLiveContainerString     // Catch: java.lang.Exception -> L2f
            if (r2 == 0) goto L31
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2f
            java.lang.String r3 = r4.mLiveContainerString     // Catch: java.lang.Exception -> L2f
            r2.<init>(r3)     // Catch: java.lang.Exception -> L2f
            boolean r3 = r2.isNull(r1)     // Catch: java.lang.Exception -> L2f
            if (r3 != 0) goto L31
            int r1 = r2.getInt(r1)     // Catch: java.lang.Exception -> L2f
            r4.mLiveEnableMdlProto = r1     // Catch: java.lang.Exception -> L2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2f
            java.lang.String r2 = "mdl live json enable_mdl_proto:"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L2f
            int r2 = r4.mLiveEnableMdlProto     // Catch: java.lang.Exception -> L2f
            r1.append(r2)     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L2f
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLLog.w(r0, r1)     // Catch: java.lang.Exception -> L2f
            return
        L2f:
            r1 = move-exception
            goto L32
        L31:
            return
        L32:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "parse json config fail:"
            r2.<init>(r3)
            java.lang.String r1 = r1.toString()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLLog.e(r0, r1)
            return
    }

    public void setCacheInfoList(java.lang.String[] r5, long[] r6) {
            r4 = this;
            int r0 = r5.length
            if (r0 == 0) goto L75
            int r0 = r6.length
            if (r0 == 0) goto L75
            int r0 = r5.length
            int r1 = r6.length
            if (r0 == r1) goto Lb
            goto L75
        Lb:
            r0 = 0
            r4.mCacheDirListsStr = r0
            r0 = 0
        Lf:
            int r1 = r5.length
            if (r0 >= r1) goto L66
            r1 = r5[r0]
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L63
            java.lang.String r1 = r4.mCacheDirListsStr
            java.lang.String r2 = "$"
            if (r1 != 0) goto L3d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3 = r5[r0]
            r1.append(r3)
            r1.append(r2)
            r2 = r6[r0]
            java.lang.String r2 = java.lang.Long.toString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.mCacheDirListsStr = r1
            goto L63
        L3d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r4.mCacheDirListsStr
            r1.append(r3)
            java.lang.String r3 = "|"
            r1.append(r3)
            r3 = r5[r0]
            r1.append(r3)
            r1.append(r2)
            r2 = r6[r0]
            java.lang.String r2 = java.lang.Long.toString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.mCacheDirListsStr = r1
        L63:
            int r0 = r0 + 1
            goto Lf
        L66:
            java.lang.String r5 = r4.mCacheDirListsStr
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L75
            java.lang.String r5 = "AVMDLDataLoaderConfigure"
            java.lang.String r6 = "cache dir list str is null"
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLLog.e(r5, r6)
        L75:
            return
    }
}
