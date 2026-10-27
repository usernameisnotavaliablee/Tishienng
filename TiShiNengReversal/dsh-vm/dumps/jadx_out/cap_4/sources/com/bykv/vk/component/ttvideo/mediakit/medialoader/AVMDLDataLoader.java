package com.bykv.vk.component.ttvideo.mediakit.medialoader;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AVMDLDataLoader implements android.os.Handler.Callback {
    public static final int AVMDLErrorIsCreateTask = -1000;
    public static final int AVMDLErrorIsInvalidContentLenth = -2000;
    public static final int AVMDLErrorIsInvalidFileWrite = -5000;
    public static final int AVMDLErrorIsInvalidRequestInfo = -4000;
    public static final int AVMDLErrorIsStatusCodeMoreThan400 = -3000;
    public static final int AVMDLErrorIsStatusCodeMoreThan500 = -3001;
    public static final int AVMDLErrorIsTheSameKeyTask = -1001;
    public static final int AVMDLErrorIsTooManyTask = -1002;
    public static final int AVMDLLoaderTypeNone = 10000;
    public static final int AVMDLTaskStateStart = 1;
    public static final int AVMDLTaskStateStop = 2;
    public static final int AVMDLTaskTypeDownloadTask = 3;
    public static final int AVMDLTaskTypePlayTask = 1;
    public static final int AVMDLTaskTypePreloadTask = 2;
    public static final int AVMDLoaderTypeAliP2P = 5;
    public static final int AVMDLoaderTypeHttp = 0;
    public static final int AVMDLoaderTypeKsyP2P = 3;
    public static final int AVMDLoaderTypeOwnLiveVDP = 7;
    public static final int AVMDLoaderTypeOwnVDP = 2;
    public static final int AVMDLoaderTypeWsuP2P = 6;
    public static final int AVMDLoaderTypeXYVod = 1;
    public static final int AVMDLoaderTypeYFP2P = 4;
    public static final int IsClose = 5;
    public static final int IsComplete = 3;
    public static final int IsFail = 2;
    public static final int IsInit = 0;
    public static final int IsStart = 1;
    public static final int IsStop = 4;
    public static final int KeyIsAccessCheckLevel = 3511;
    public static final int KeyIsAllowTryTheLastUrl = 7357;
    public static final int KeyIsAlogEnable = 7225;
    public static final int KeyIsAlogInfo = 14;
    public static final int KeyIsCDNLog = 6;
    public static final int KeyIsCacheDirListsStr = 7399;
    public static final int KeyIsCloseFileCache = 800;
    public static final int KeyIsConnectPoolStragetyValue = 7363;
    public static final int KeyIsControlCDNRangeType = 703;
    public static final int KeyIsDNSLog = 15;
    public static final int KeyIsDownloadDir = 7300;
    public static final int KeyIsDownloadEnd = 21;
    public static final int KeyIsDownloadSuspend = 22;
    public static final int KeyIsDownloaderLog = 19;
    public static final int KeyIsDownloaderLogTTNet = 16;
    public static final int KeyIsEnableCacheReqRange = 7358;
    public static final int KeyIsEnableDynamicSocketTimeout = 7362;
    public static final int KeyIsEnableEarlyData = 8219;
    public static final int KeyIsEnableEventInfo = 9999;
    public static final int KeyIsEnableExternDNS = 700;
    public static final int KeyIsEnableFileCacheV2 = 7222;
    public static final int KeyIsEnableFileRingBuffer = 7228;
    public static final int KeyIsEnableIOManager = 7391;
    public static final int KeyIsEnableIpBucket = 901;
    public static final int KeyIsEnableLazyBufferpool = 7332;
    public static final int KeyIsEnableLoaderPreempt = 2510;
    public static final int KeyIsEnableLoaderSeek = 7369;
    public static final int KeyIsEnableNetScheduler = 7342;
    public static final int KeyIsEnableNewBufferpool = 7334;
    public static final int KeyIsEnableP2PPreDown = 7340;
    public static final int KeyIsEnablePlayInfoCache = 7339;
    public static final int KeyIsEnablePlayLog = 7341;
    public static final int KeyIsEnablePreconnect = 2508;
    public static final int KeyIsEnablePreloadReUse = 105;
    public static final int KeyIsEnableSessionReuse = 5511;
    public static final int KeyIsEnableSocketReuse = 701;
    public static final int KeyIsEnableStorageModule = 10000;
    public static final int KeyIsEnableSyncDnsForPcdn = 7226;
    public static final int KeyIsEnableUseFileExtendLoaderBuffer = 7229;
    public static final int KeyIsErrorStateTrustTime = 902;
    public static final int KeyIsFileCacheProgress = 3;
    public static final int KeyIsFirstRangeLeftThreshold = 7346;
    public static final int KeyIsForbidByPassCookie = 1510;
    public static final int KeyIsGetAllCacheSize = 100;
    public static final int KeyIsGetCacheInfo = 101;
    public static final int KeyIsGetCacheSize = 103;
    public static final int KeyIsGetCostLog = 1011;
    public static final int KeyIsGetCustomHttpHeader = 1509;
    public static final int KeyIsGetEnableHls = 9407;
    public static final int KeyIsGetIOManagerHandle = 7390;
    public static final int KeyIsGetLoaderVersion = 11;
    public static final int KeyIsGetLocalAddr = 4;
    public static final int KeyIsGetMdlProtocolHandle = 7218;
    public static final int KeyIsGetPlayLog = 1010;
    public static final int KeyIsGetResStatus = 7231;
    public static final int KeyIsGetSpeedStatus = 7230;
    public static final int KeyIsGetVersionInfo = 830;
    public static final int KeyIsGlobalSpeedSample = 703;
    public static final int KeyIsHeartBeatLog = 70;
    public static final int KeyIsHiJackError = 701;
    public static final int KeyIsIOSpeedInfo = 5;
    public static final int KeyIsIgnorePlayInfo = 9400;
    public static final int KeyIsInitialSocketTimeout = 7360;
    public static final int KeyIsIsCheckPreloadLevel = 6512;
    public static final int KeyIsIsChecksumLevel = 1504;
    public static final int KeyIsIsDownloadSource = 1506;
    public static final int KeyIsIsEnableDownloaderLog = 7347;
    public static final int KeyIsIsEnableTTNetLoader = 7348;
    public static final int KeyIsIsEncryptVersion = 1505;
    public static final int KeyIsIsGetChecksumInfo = 1503;
    public static final int KeyIsIsMaxTlsVersion = 5512;
    public static final int KeyIsIsPreloadCancel = 7;
    public static final int KeyIsIsTestSpeedVersion = 1502;
    public static final int KeyIsLiveCacheThresholdHttpToP2p = 8006;
    public static final int KeyIsLiveCacheThresholdP2pToHttp = 8007;
    public static final int KeyIsLiveContainerString = 8021;
    public static final int KeyIsLiveEnableMdlProto = 8102;
    public static final int KeyIsLiveGetCurrentBitRate = 8004;
    public static final int KeyIsLiveGetLoaderType = 8103;
    public static final int KeyIsLiveGetP2pState = 8002;
    public static final int KeyIsLiveGetPlayCacheSec = 8003;
    public static final int KeyIsLiveLoaderEnable = 8100;
    public static final int KeyIsLiveLoaderP2pEnable = 8101;
    public static final int KeyIsLiveMaxTrySwitchP2pTimes = 8008;
    public static final int KeyIsLiveMobileDownloadAllow = 8011;
    public static final int KeyIsLiveMobileUploadAllow = 8010;
    public static final int KeyIsLivePlayInfoAudioMixingEnd = 8014;
    public static final int KeyIsLivePlayInfoAudioMixingStart = 8013;
    public static final int KeyIsLivePlayInfoIsPreview = 8016;
    public static final int KeyIsLivePlayInfoIsStreamReceived = 8015;
    public static final int KeyIsLiveRecvDataTimeout = 8012;
    public static final int KeyIsLiveSetLoaderType = 8000;
    public static final int KeyIsLiveSetP2pAllow = 8001;
    public static final int KeyIsLiveSetPrepareTask = 8017;
    public static final int KeyIsLiveSetTaskFinish = 8018;
    public static final int KeyIsLiveWaitP2pReadyThreshold = 8009;
    public static final int KeyIsLiveWatchDurationThreshold = 8005;
    public static final int KeyIsLoadMonitorMinAllowLoadSize = 7397;
    public static final int KeyIsLoadMonitorTimeInternal = 7396;
    public static final int KeyIsLoaderCacheSize = 9216;
    public static final int KeyIsLoaderEventCancel = 72;
    public static final int KeyIsLoaderEventCompleted = 73;
    public static final int KeyIsLoaderEventStart = 71;
    public static final int KeyIsLoaderEventUnKnown = 74;
    public static final int KeyIsLoaderFactoryP2PLevel = 8216;
    public static final int KeyIsLoaderFactoryP2PStragetyLevel = 8218;
    public static final int KeyIsLoaderFactoryXYLibValue = 8217;
    public static final int KeyIsLoaderTypeSwitch = 12;
    public static final int KeyIsMAXIPV4Num = 7331;
    public static final int KeyIsMAXIPV6Num = 7330;
    public static final int KeyIsMarkedFileIOSpeed = 1508;
    public static final int KeyIsMaxFileMemCacheNum = 5515;
    public static final int KeyIsMaxFileMemCacheSize = 5513;
    public static final int KeyIsMaxIpCountEachDomain = 900;
    public static final int KeyIsMaxKeepAliveHostNum = 7364;
    public static final int KeyIsMaxSocketReuseNum = 7361;
    public static final int KeyIsNetCacheDir = 5510;
    public static final int KeyIsNetSchedulerBlockAllNetErr = 7343;
    public static final int KeyIsNetSchedulerBlockDurationMs = 7345;
    public static final int KeyIsNetSchedulerBlockErrCount = 7344;
    public static final int KeyIsNetworkAccessType = 7219;
    public static final int KeyIsNetworkChanged = 7217;
    public static final int KeyIsNewBufferPoolGrowBlockCount = 7337;
    public static final int KeyIsNewBufferpoolBlockSize = 7335;
    public static final int KeyIsNewBufferpoolResidentSize = 7336;
    public static final int KeyIsNewPreloadLog = 1002;
    public static final int KeyIsNewProtocolLog = 1001;
    public static final int KeyIsNewProxyLog = 1000;
    public static final int KeyIsNewTaskLog = 1003;
    public static final int KeyIsNextDownloadThreshold = 2511;
    public static final int KeyIsOnLiveLoaderError = 9;
    public static final int KeyIsOwnLiveLoaderLog = 10;
    public static final int KeyIsOwnLiveLoaderLogSample = 11;
    public static final int KeyIsOwnVdpLog = 1;
    public static final int KeyIsP2PFirstRangeLoaderType = 7372;
    public static final int KeyIsP2PPredownPeerCount = 7359;
    public static final int KeyIsPlayInfoBufferingEnd = 7214;
    public static final int KeyIsPlayInfoBufferingStart = 7213;
    public static final int KeyIsPlayInfoCurrentBuffer = 7215;
    public static final int KeyIsPlayInfoLoadPercent = 7212;
    public static final int KeyIsPlayInfoPlayingPos = 7211;
    public static final int KeyIsPlayInfoRenderStart = 7210;
    public static final int KeyIsPlayTaskState = 50;
    public static final int KeyIsPreconnectNum = 2509;
    public static final int KeyIsPreloadEnd = 4;
    public static final int KeyIsPreloadFail = 8;
    public static final int KeyIsPreloadStragetyWhenPlay = 1030;
    public static final int KeyIsPreloadWaitListType = 1040;
    public static final int KeyIsRingBufferSizeKB = 7221;
    public static final int KeyIsSessionTimeout = 7333;
    public static final int KeyIsSetAlogFuncPtr = 1100;
    public static final int KeyIsSetBackupLoaderType = 7227;
    public static final int KeyIsSetCacheDir = 0;
    public static final int KeyIsSetDMDomain = 9402;
    public static final int KeyIsSetDomains = 9404;
    public static final int KeyIsSetEnableOwnVdpPreloadNotify = 7395;
    public static final int KeyIsSetEnableReportTaskLog = 7371;
    public static final int KeyIsSetFileExtendSize = 7392;
    public static final int KeyIsSetForesightDomain = 9403;
    public static final int KeyIsSetGlobalSpeedSampleInterval = 7370;
    public static final int KeyIsSetKeyDomain = 9405;
    public static final int KeyIsSetKeyToken = 9406;
    public static final int KeyIsSetLiveListener = 107;
    public static final int KeyIsSetLoaderFactoryAppInfo = 10;
    public static final int KeyIsSetLoaderFactoryCacheDir = 9;
    public static final int KeyIsSetLoaderFactoryMaxCacheSize = 7;
    public static final int KeyIsSetLoaderFactoryMaxMemorySize = 8;
    public static final int KeyIsSetLoaderType = 6;
    public static final int KeyIsSetMaxCacheAge = 104;
    public static final int KeyIsSetMaxCacheSize = 1;
    public static final int KeyIsSetMinAllowSpeed = 7393;
    public static final int KeyIsSetNetSchedulerBlockHostErrIpCount = 7394;
    public static final int KeyIsSetOnlyUseCdn = 7216;
    public static final int KeyIsSetOpenTimeOut = 3;
    public static final int KeyIsSetPlayInfoSeekAction = 7338;
    public static final int KeyIsSetPreloadParallelNum = 102;
    public static final int KeyIsSetRWTimeOut = 2;
    public static final int KeyIsSetSettingsDomain = 9401;
    public static final int KeyIsSetSpeedSampleInterval = 7368;
    public static final int KeyIsSetTryCount = 5;
    public static final int KeyIsSocketIdleTimeout = 702;
    public static final int KeyIsSocketSendBufferKB = 7220;
    public static final int KeyIsSocketTrainingCenterConfigStr = 7398;
    public static final int KeyIsSpeedCoefficientValue = 1507;
    public static final int KeyIsSpeedInfo = 2;
    public static final int KeyIsSpeedTestSampledByTime = 700;
    public static final int KeyIsSpeedTestSampledByTimeV2 = 702;
    public static final int KeyIsStoIoWriteLimitKBTh1 = 10004;
    public static final int KeyIsStoIoWriteLimitKBTh2 = 10005;
    public static final int KeyIsStoMaxIdleTimeSec = 10006;
    public static final int KeyIsStoPlayDldWinSizeKBLS = 10002;
    public static final int KeyIsStoPlayDldWinSizeKBNM = 10001;
    public static final int KeyIsStoRingBufferSizeKB = 10003;
    public static final int KeyIsTTNetLoaderCronetBufSizeKB = 7349;
    public static final int KeyIsTaskFail = 20;
    public static final int KeyIsTaskLog = 0;
    public static final int KeyIsVdpABTestId = 7223;
    public static final int KeyIsVdpGroupId = 7224;
    public static final int KeyIsWriteFileNotifyIntervalMS = 110;
    public static final int LogInfoKeyIsPcdnTaskLog = 13;
    public static final long LongValueViaConfigNotReady = -998;
    public static final long LongValueViaUnknownKey = -1;
    public static final int S_FAIL = -1;
    public static final int S_OK = 0;
    private static final java.lang.String TAG = "AVMDLDataLoader";
    private static boolean isSupportQueryEncode = true;
    private static com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader mInstance;
    private static volatile boolean mIsLibraryLoaded;
    private static volatile boolean mIsMdlTtnetPluginLoaded;
    private boolean isSupportGetAuth;
    private com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure mConfigure;
    private long mEndTime;
    private com.bykv.vk.component.ttvideo.mediakit.medialoader.LoaderListener mEventListener;
    private long mHandle;
    private android.os.Handler mHandler;
    private com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener mLiveListener;
    private android.os.Handler mLogHandler;
    private java.lang.Thread mMsgThread;
    private final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock mReadLock;
    private final java.util.concurrent.locks.ReentrantReadWriteLock mReadWritedLock;
    private long mSartTime;
    private com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLStartCompleteListener mStartCompleteListener;
    private volatile int mState;
    private com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener mVodListener;
    private final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock mWriteLock;



    static {
            return
    }

    private AVMDLDataLoader(com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r7) throws java.lang.Exception {
            r6 = this;
            r6.<init>()
            r0 = -1
            r6.mState = r0
            r0 = 0
            r6.mHandler = r0
            r6.mLogHandler = r0
            r6.mConfigure = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r1.<init>()
            r6.mReadWritedLock = r1
            r6.mMsgThread = r0
            r2 = 1
            r6.isSupportGetAuth = r2
            r6.mStartCompleteListener = r0
            r6.initNativeHandle()
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.readLock()
            r6.mReadLock = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r1.writeLock()
            r6.mWriteLock = r0
            long r0 = r6.mHandle
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L3d
            r6.initLogThread(r6)
            r6.mConfigure = r7
            r7 = 0
            r6.mState = r7
            r6.isSupportGetAuth = r2
            return
        L3d:
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r0 = "create native mdl fail"
            r7.<init>(r0)
            throw r7
    }

    private static native void _addDataSource(long r0, int r2, java.lang.String r3);

    private static native void _cancel(long r0, java.lang.String r2);

    private static native void _cancelAll(long r0);

    private static native void _cancelAllPreloadWaitReqs(long r0);

    private static native void _clearAllCaches(long r0);

    private static native void _clearCachesByUsedTime(long r0, long r2);

    private static native void _clearNetinfoCache(long r0);

    private static native void _close(long r0);

    private final native long _create();

    private static native void _downloadResource(long r0, java.lang.String r2);

    private static native java.lang.String _encodeUrl(java.lang.String r0, int r1);

    private static native void _forceRemoveCacheFile(long r0, java.lang.String r2);

    private static native java.lang.String _getAuth(long r0, java.lang.String r2);

    private static native java.lang.String _getCDNLog(long r0, java.lang.String r2);

    private static native long _getLongValue(long r0, int r2);

    private static native long _getLongValueByStr(long r0, java.lang.String r2, int r3);

    private static native long _getLongValueByStrStr(long r0, java.lang.String r2, java.lang.String r3, int r4);

    private static native java.lang.String _getStringValue(long r0, int r2);

    private static native java.lang.String _getStringValueByStr(long r0, java.lang.String r2, int r3);

    private static native java.lang.String _getStringValueByStrStr(long r0, java.lang.String r2, java.lang.String r3, int r4);

    private static native void _makeFileAutoDeleteFlag(long r0, java.lang.String r2, int r3);

    private static native java.lang.String _makeTsFileKey(java.lang.String r0, java.lang.String r1);

    private static native void _p2pPredown(long r0, java.lang.String r2);

    private static native void _preConnectByHost(long r0, java.lang.String r2, int r3);

    private static native void _preloadGroupResource(long r0, java.lang.String r2, java.lang.String r3, int r4, int r5);

    private static native void _preloadResource(long r0, java.lang.String r2, int r3);

    private static native void _preloadResourceWithOffset(long r0, java.lang.String r2, int r3, int r4);

    private static native void _removeCacheFile(long r0, java.lang.String r2);

    private static native void _resumeFileWriteIO(long r0);

    private static native void _setInt64Value(long r0, int r2, long r3);

    private static native void _setInt64ValueByStrKey(long r0, int r2, java.lang.String r3, long r4);

    private static native void _setIntValue(long r0, int r2, int r3);

    private static native void _setStringValue(long r0, int r2, java.lang.String r3);

    private static native int _start(long r0);

    private static native void _stop(long r0);

    private static native void _suspendedDownload(long r0, java.lang.String r2);

    private static native void _updateDNSInfo(long r0, java.lang.String r2, java.lang.String r3, long r4, java.lang.String r6, int r7);

    static /* synthetic */ android.os.Handler access$002(com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0, android.os.Handler r1) {
            r0.mLogHandler = r1
            return r1
    }

    static /* synthetic */ void access$100(com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0) {
            r0.startInternal()
            return
    }

    private java.lang.String createFilePathBaseDir(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L54
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto Ld
            goto L54
        Ld:
            int r0 = r3.length()
            int r0 = r0 + (-1)
            char r0 = r3.charAt(r0)
            r1 = 47
            if (r0 != r1) goto L2b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            goto L3f
        L2b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = "/"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
        L3f:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L53
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            boolean r0 = r4.exists()
            if (r0 != 0) goto L53
            r4.mkdirs()
        L53:
            return r3
        L54:
            r3 = 0
            return r3
    }

    private java.lang.String encodeUrl(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return r2
        L7:
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r0)     // Catch: java.io.UnsupportedEncodingException -> Le
            return r2
        Le:
            r2 = 0
            return r2
    }

    public static com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader getInstance() {
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.mInstance
            if (r0 != 0) goto L2f
            java.lang.Class<com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader> r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.class
            monitor-enter(r0)
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r1 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.mInstance     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L2b
            r1 = 0
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r2 = new com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.mInstance = r2     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
            goto L2b
        L14:
            r1 = move-exception
            goto L2d
        L16:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = "ttmdl"
            java.lang.String r4 = "create native exception"
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = r4.concat(r2)     // Catch: java.lang.Throwable -> L14
            com.bytedance.sdk.component.utils.vl.r(r3, r2)     // Catch: java.lang.Throwable -> L14
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.mInstance = r1     // Catch: java.lang.Throwable -> L14
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L2f
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L2f:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.mInstance
            return r0
    }

    private void hijack() {
            r0 = this;
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.processHijack()
            r0.clearNetinfoCache()
            return
    }

    public static synchronized int init(boolean r4) {
            java.lang.Class<com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader> r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.class
            monitor-enter(r0)
            boolean r1 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded     // Catch: java.lang.Throwable -> L2b
            r2 = 0
            if (r1 == 0) goto La
            monitor-exit(r0)
            return r2
        La:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded = r4     // Catch: java.lang.Throwable -> L2b
            if (r4 != 0) goto L3f
            java.lang.String r4 = "avmdl_lite"
            com.bytedance.sdk.openadsdk.l.m.j(r4)     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            r4 = 1
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded = r4     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            goto L3c
        L17:
            r4 = move-exception
            goto L1b
        L19:
            r4 = move-exception
            goto L2d
        L1b:
            java.lang.String r1 = "ttmn"
            java.lang.String r3 = "other exception when loading avmdl library: "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r3.concat(r4)     // Catch: java.lang.Throwable -> L2b
            com.bytedance.sdk.component.utils.vl.r(r1, r4)     // Catch: java.lang.Throwable -> L2b
            goto L3c
        L2b:
            r4 = move-exception
            goto L48
        L2d:
            java.lang.String r1 = "ttmn"
            java.lang.String r3 = "Can't load avmdl library: "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r3.concat(r4)     // Catch: java.lang.Throwable -> L2b
            com.bytedance.sdk.component.utils.vl.r(r1, r4)     // Catch: java.lang.Throwable -> L2b
        L3c:
            tryLoadTTNetLoaderPlugin()     // Catch: java.lang.Throwable -> L2b
        L3f:
            boolean r4 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded     // Catch: java.lang.Throwable -> L2b
            if (r4 != 0) goto L46
            monitor-exit(r0)
            r4 = -1
            return r4
        L46:
            monitor-exit(r0)
            return r2
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r4
    }

    public static synchronized int init(boolean r4, boolean r5) {
            java.lang.Class<com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader> r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.class
            monitor-enter(r0)
            boolean r1 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded     // Catch: java.lang.Throwable -> L2b
            r2 = 0
            if (r1 == 0) goto La
            monitor-exit(r0)
            return r2
        La:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded = r4     // Catch: java.lang.Throwable -> L2b
            if (r4 != 0) goto L71
            java.lang.String r4 = "avmdl_lite"
            com.bytedance.sdk.openadsdk.l.m.j(r4)     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            r4 = 1
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded = r4     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            goto L3c
        L17:
            r4 = move-exception
            goto L1b
        L19:
            r4 = move-exception
            goto L2d
        L1b:
            java.lang.String r1 = "ttmn"
            java.lang.String r3 = "other exception when loading avmdl library: "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r3.concat(r4)     // Catch: java.lang.Throwable -> L2b
            com.bytedance.sdk.component.utils.vl.r(r1, r4)     // Catch: java.lang.Throwable -> L2b
            goto L3c
        L2b:
            r4 = move-exception
            goto L7a
        L2d:
            java.lang.String r1 = "ttmn"
            java.lang.String r3 = "Can't load avmdl library: "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r3.concat(r4)     // Catch: java.lang.Throwable -> L2b
            com.bytedance.sdk.component.utils.vl.r(r1, r4)     // Catch: java.lang.Throwable -> L2b
        L3c:
            if (r5 == 0) goto L6e
            java.lang.String r4 = "ttmn"
            java.lang.String r5 = "try to load pcdn lib"
            com.bytedance.sdk.component.utils.vl.r(r4, r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = "avmdlp2p"
            com.bytedance.sdk.openadsdk.l.m.j(r4)     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L4d
            goto L6e
        L4b:
            r4 = move-exception
            goto L4f
        L4d:
            r4 = move-exception
            goto L5f
        L4f:
            java.lang.String r5 = "ttmn"
            java.lang.String r1 = "other exception when loading avmdl library: "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r1.concat(r4)     // Catch: java.lang.Throwable -> L2b
            com.bytedance.sdk.component.utils.vl.r(r5, r4)     // Catch: java.lang.Throwable -> L2b
            goto L6e
        L5f:
            java.lang.String r5 = "ttmn"
            java.lang.String r1 = "Can't load avmdlp2p library: "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r1.concat(r4)     // Catch: java.lang.Throwable -> L2b
            com.bytedance.sdk.component.utils.vl.r(r5, r4)     // Catch: java.lang.Throwable -> L2b
        L6e:
            tryLoadTTNetLoaderPlugin()     // Catch: java.lang.Throwable -> L2b
        L71:
            boolean r4 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded     // Catch: java.lang.Throwable -> L2b
            if (r4 != 0) goto L78
            monitor-exit(r0)
            r4 = -1
            return r4
        L78:
            monitor-exit(r0)
            return r2
        L7a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r4
    }

    public static synchronized int init(boolean r4, boolean r5, boolean r6) {
            java.lang.Class<com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader> r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.class
            monitor-enter(r0)
            boolean r1 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded     // Catch: java.lang.Throwable -> L19
            r2 = 0
            if (r1 == 0) goto La
            monitor-exit(r0)
            return r2
        La:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded = r4     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L90
            r4 = 1
            if (r6 == 0) goto L2c
            java.lang.String r6 = "avmdlv2"
            com.bytedance.sdk.openadsdk.l.m.j(r6)     // Catch: java.lang.Throwable -> L19 java.lang.UnsatisfiedLinkError -> L1c
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded = r4     // Catch: java.lang.Throwable -> L19 java.lang.UnsatisfiedLinkError -> L1c
            goto L2c
        L19:
            r4 = move-exception
            goto L99
        L1c:
            r6 = move-exception
            java.lang.String r1 = "ttmn"
            java.lang.String r3 = "load avmdlv2 failed: "
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L19
            java.lang.String r6 = r3.concat(r6)     // Catch: java.lang.Throwable -> L19
            com.bytedance.sdk.component.utils.vl.r(r1, r6)     // Catch: java.lang.Throwable -> L19
        L2c:
            boolean r6 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded     // Catch: java.lang.Throwable -> L19
            if (r6 != 0) goto L90
            java.lang.String r6 = "avmdl_lite"
            com.bytedance.sdk.openadsdk.l.m.j(r6)     // Catch: java.lang.Throwable -> L38 java.lang.UnsatisfiedLinkError -> L3a
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded = r4     // Catch: java.lang.Throwable -> L38 java.lang.UnsatisfiedLinkError -> L3a
            goto L5b
        L38:
            r4 = move-exception
            goto L3c
        L3a:
            r4 = move-exception
            goto L4c
        L3c:
            java.lang.String r6 = "ttmn"
            java.lang.String r1 = "other exception when loading avmdl library: "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = r1.concat(r4)     // Catch: java.lang.Throwable -> L19
            com.bytedance.sdk.component.utils.vl.r(r6, r4)     // Catch: java.lang.Throwable -> L19
            goto L5b
        L4c:
            java.lang.String r6 = "ttmn"
            java.lang.String r1 = "Can't load avmdl library: "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = r1.concat(r4)     // Catch: java.lang.Throwable -> L19
            com.bytedance.sdk.component.utils.vl.r(r6, r4)     // Catch: java.lang.Throwable -> L19
        L5b:
            if (r5 == 0) goto L8d
            java.lang.String r4 = "ttmn"
            java.lang.String r5 = "try to load pcdn lib"
            com.bytedance.sdk.component.utils.vl.r(r4, r5)     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = "avmdlp2p"
            com.bytedance.sdk.openadsdk.l.m.j(r4)     // Catch: java.lang.Throwable -> L6a java.lang.UnsatisfiedLinkError -> L6c
            goto L8d
        L6a:
            r4 = move-exception
            goto L6e
        L6c:
            r4 = move-exception
            goto L7e
        L6e:
            java.lang.String r5 = "ttmn"
            java.lang.String r6 = "other exception when loading avmdl library: "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = r6.concat(r4)     // Catch: java.lang.Throwable -> L19
            com.bytedance.sdk.component.utils.vl.r(r5, r4)     // Catch: java.lang.Throwable -> L19
            goto L8d
        L7e:
            java.lang.String r5 = "ttmn"
            java.lang.String r6 = "Can't load avmdlp2p library: "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = r6.concat(r4)     // Catch: java.lang.Throwable -> L19
            com.bytedance.sdk.component.utils.vl.r(r5, r4)     // Catch: java.lang.Throwable -> L19
        L8d:
            tryLoadTTNetLoaderPlugin()     // Catch: java.lang.Throwable -> L19
        L90:
            boolean r4 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L97
            monitor-exit(r0)
            r4 = -1
            return r4
        L97:
            monitor-exit(r0)
            return r2
        L99:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r4
    }

    private void initLogThread(android.os.Handler.Callback r2) {
            r1 = this;
            java.lang.Thread r0 = r1.mMsgThread
            if (r0 != 0) goto L15
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader$1 r0 = new com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader$1
            r0.<init>(r1, r2)
            r1.mMsgThread = r0
            java.lang.String r2 = "mdl_log_handler"
            r0.setName(r2)
            java.lang.Thread r2 = r1.mMsgThread
            r2.start()
        L15:
            return
    }

    private void initNativeHandle() {
            r5 = this;
            long r0 = r5.mHandle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L9
            goto L39
        L9:
            long r0 = r5._create()     // Catch: java.lang.Throwable -> L10
            r5.mHandle = r0     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r0 = move-exception
            r5.mHandle = r2
            com.bytedance.sdk.component.utils.vl.j(r0)
        L16:
            long r0 = r5.mHandle
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L39
            android.os.Handler r0 = r5.mHandler
            if (r0 != 0) goto L39
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto L2e
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r5)
            r5.mHandler = r0
            return
        L2e:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1, r5)
            r5.mHandler = r0
        L39:
            return
    }

    private boolean isNotifyInfo(int r2) {
            r1 = this;
            r0 = 4
            if (r2 == r0) goto L20
            r0 = 20
            if (r2 == r0) goto L20
            r0 = 50
            if (r2 == r0) goto L20
            r0 = 8
            if (r2 == r0) goto L20
            r0 = 3
            if (r2 == r0) goto L20
            r0 = 21
            if (r2 == r0) goto L20
            r0 = 7
            if (r2 == r0) goto L20
            r0 = 22
            if (r2 != r0) goto L1e
            goto L20
        L1e:
            r2 = 0
            return r2
        L20:
            r2 = 1
            return r2
    }

    public static java.lang.String makeTsFileKey(java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "AVMDLDataLoader"
            java.lang.String r2 = _makeTsFileKey(r2, r3)     // Catch: java.lang.Exception -> L7 java.lang.UnsatisfiedLinkError -> L1e
            return r2
        L7:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "makeTsFileKey failed, other reason:  "
            r3.<init>(r1)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLLog.e(r0, r2)
            goto L34
        L1e:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "makeTsFileKey failed, native not support: "
            r3.<init>(r1)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLLog.e(r0, r2)
        L34:
            r2 = 0
            return r2
    }

    private boolean postMessage(com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener r4, android.os.Message r5) {
            r3 = this;
            int r0 = r5.what
            r1 = 701(0x2bd, float:9.82E-43)
            r2 = 1
            if (r0 != r1) goto Lb
            r3.hijack()
            return r2
        Lb:
            if (r4 == 0) goto L19
            java.lang.Object r5 = r5.obj
            if (r5 != 0) goto L12
            goto L19
        L12:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderNotifyInfo r5 = (com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderNotifyInfo) r5
            if (r5 == 0) goto L19
            r4.onNotify(r5)
        L19:
            return r2
    }

    private boolean postMessage(com.bykv.vk.component.ttvideo.mediakit.medialoader.LoaderListener r4, android.os.Message r5) {
            r3 = this;
            r0 = 1
            if (r4 == 0) goto L25
            java.lang.Object r1 = r5.obj
            if (r1 != 0) goto L8
            goto L25
        L8:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.LoaderEventInfo r1 = (com.bykv.vk.component.ttvideo.mediakit.medialoader.LoaderEventInfo) r1
            if (r1 == 0) goto L25
            int r5 = r5.what
            r2 = 71
            if (r5 != r2) goto L16
            r4.onLoaderTaskStart(r1)
            goto L25
        L16:
            r2 = 72
            if (r5 != r2) goto L1e
            r4.onLoaderTaskCancel(r1)
            goto L25
        L1e:
            r2 = 73
            if (r5 != r2) goto L25
            r4.onLoaderTaskCompleted(r1)
        L25:
            return r0
    }

    public static java.lang.String queryComponentEncode(java.lang.String r2) {
            boolean r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.isSupportQueryEncode
            r1 = 0
            if (r0 == 0) goto L24
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lc
            goto L24
        Lc:
            r0 = 4
            java.lang.String r2 = _encodeUrl(r2, r0)     // Catch: java.lang.Exception -> L12 java.lang.UnsatisfiedLinkError -> L1a
            return r2
        L12:
            r2 = move-exception
            r2.getMessage()
            r2.getStackTrace()
            goto L24
        L1a:
            r2 = move-exception
            r0 = 0
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.isSupportQueryEncode = r0
            r2.getMessage()
            r2.getStackTrace()
        L24:
            return r1
    }

    private void setConfigureInternal(com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r10) {
            r9 = this;
            long r0 = r9.mHandle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L50a
            if (r10 != 0) goto Lc
            goto L50a
        Lc:
            java.lang.String r0 = r10.mCacheDir
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 != 0) goto L45
            java.lang.String r0 = r10.mCacheDir
            java.lang.String r2 = "loaderFactory"
            java.lang.String r0 = r9.createFilePathBaseDir(r0, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L2a
            long r2 = r9.mHandle
            r4 = 9
            _setStringValue(r2, r4, r0)
        L2a:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r9.mConfigure
            java.lang.String r0 = r0.mNetCacheDir
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L3e
            java.lang.String r0 = r10.mCacheDir
            java.lang.String r2 = "netCache"
            java.lang.String r0 = r9.createFilePathBaseDir(r0, r2)
            r10.mNetCacheDir = r0
        L3e:
            long r2 = r9.mHandle
            java.lang.String r0 = r10.mCacheDir
            _setStringValue(r2, r1, r0)
        L45:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r9.mConfigure
            java.lang.String r0 = r0.mNetCacheDir
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L58
            long r2 = r9.mHandle
            r0 = 5510(0x1586, float:7.721E-42)
            java.lang.String r4 = r10.mNetCacheDir
            _setStringValue(r2, r0, r4)
        L58:
            java.lang.String r0 = r10.mAppInfo
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L69
            long r2 = r9.mHandle
            r0 = 10
            java.lang.String r4 = r10.mAppInfo
            _setStringValue(r2, r0, r4)
        L69:
            java.lang.String r0 = r10.mDownloadDir
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L7a
            long r2 = r9.mHandle
            r0 = 7300(0x1c84, float:1.023E-41)
            java.lang.String r4 = r10.mDownloadDir
            _setStringValue(r2, r0, r4)
        L7a:
            long r2 = r9.mHandle
            r0 = 8001(0x1f41, float:1.1212E-41)
            int r4 = r10.mLiveP2pAllow
            _setIntValue(r2, r0, r4)
            long r2 = r9.mHandle
            r0 = 8000(0x1f40, float:1.121E-41)
            int r4 = r10.mLiveLoaderType
            _setIntValue(r2, r0, r4)
            long r2 = r9.mHandle
            r0 = 8005(0x1f45, float:1.1217E-41)
            int r4 = r10.mLiveWatchDurationThreshold
            _setIntValue(r2, r0, r4)
            long r2 = r9.mHandle
            r0 = 8006(0x1f46, float:1.1219E-41)
            int r4 = r10.mLiveCacheThresholdHttpToP2p
            _setIntValue(r2, r0, r4)
            long r2 = r9.mHandle
            r0 = 8007(0x1f47, float:1.122E-41)
            int r4 = r10.mLiveCacheThresholdP2pToHttp
            _setIntValue(r2, r0, r4)
            long r2 = r9.mHandle
            r0 = 8008(0x1f48, float:1.1222E-41)
            int r4 = r10.mLiveMaxTrySwitchP2pTimes
            _setIntValue(r2, r0, r4)
            long r2 = r9.mHandle
            r0 = 8009(0x1f49, float:1.1223E-41)
            int r4 = r10.mLiveWaitP2pReadyThreshold
            _setIntValue(r2, r0, r4)
            long r2 = r9.mHandle
            r0 = 8010(0x1f4a, float:1.1224E-41)
            int r4 = r10.mLiveMobileUploadAllow
            _setIntValue(r2, r0, r4)
            long r2 = r9.mHandle
            r0 = 8011(0x1f4b, float:1.1226E-41)
            int r4 = r10.mLiveMobileDownloadAllow
            _setIntValue(r2, r0, r4)
            long r2 = r9.mHandle
            r0 = 8012(0x1f4c, float:1.1227E-41)
            int r4 = r10.mLiveRecvDataTimeout
            _setIntValue(r2, r0, r4)
            long r2 = r9.mHandle
            r0 = 8021(0x1f55, float:1.124E-41)
            java.lang.String r4 = r10.mLiveContainerString
            _setStringValue(r2, r0, r4)
            long r2 = r9.mHandle
            int r0 = r10.mMaxCacheSize
            r4 = 1
            _setIntValue(r2, r4, r0)
            long r2 = r9.mHandle
            int r0 = r10.mRWTimeOut
            r5 = 2
            _setIntValue(r2, r5, r0)
            long r2 = r9.mHandle
            int r0 = r10.mOpenTimeOut
            r6 = 3
            _setIntValue(r2, r6, r0)
            long r2 = r9.mHandle
            r0 = 5
            int r7 = r10.mTryCount
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7
            int r7 = r10.mMaxCacheSize
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 8
            int r7 = r10.mLoaderFactoryMaxMemorySize
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 6
            int r7 = r10.mLoaderType
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 102(0x66, float:1.43E-43)
            int r7 = r10.mPreloadParallelNum
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            int r0 = r10.mIsCloseFileCache
            r7 = 800(0x320, float:1.121E-42)
            _setIntValue(r2, r7, r0)
            int r0 = r10.mMaxCacheAge
            if (r0 <= 0) goto L133
            long r2 = r9.mHandle
            r8 = 104(0x68, float:1.46E-43)
            _setIntValue(r2, r8, r0)
        L133:
            long r2 = r9.mHandle
            r0 = 1030(0x406, float:1.443E-42)
            int r8 = r10.mPreloadStrategy
            _setIntValue(r2, r0, r8)
            long r2 = r9.mHandle
            r0 = 1040(0x410, float:1.457E-42)
            int r8 = r10.mPreloadWaitListType
            _setIntValue(r2, r0, r8)
            long r2 = r9.mHandle
            r0 = 105(0x69, float:1.47E-43)
            int r8 = r10.mEnablePreloadReUse
            _setIntValue(r2, r0, r8)
            long r2 = r9.mHandle
            r0 = 700(0x2bc, float:9.81E-43)
            int r8 = r10.mEnableExternDNS
            _setIntValue(r2, r0, r8)
            long r2 = r9.mHandle
            r0 = 701(0x2bd, float:9.82E-43)
            int r8 = r10.mEnableSocketReuse
            _setIntValue(r2, r0, r8)
            long r2 = r9.mHandle
            r0 = 703(0x2bf, float:9.85E-43)
            int r8 = r10.mControlCDNRangeType
            _setIntValue(r2, r0, r8)
            long r2 = r9.mHandle
            r0 = 702(0x2be, float:9.84E-43)
            int r8 = r10.mSocketIdleTimeOut
            _setIntValue(r2, r0, r8)
            long r2 = r9.mHandle
            int r0 = r10.mIsCloseFileCache
            _setIntValue(r2, r7, r0)
            long r2 = r9.mHandle
            r0 = 8216(0x2018, float:1.1513E-41)
            int r7 = r10.mLoaderFactoryP2PLevel
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 1502(0x5de, float:2.105E-42)
            int r7 = r10.mTestSpeedTypeVersion
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 1504(0x5e0, float:2.108E-42)
            int r7 = r10.mCheckSumLevel
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 1505(0x5e1, float:2.109E-42)
            int r7 = r10.mEncryptVersion
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 1507(0x5e3, float:2.112E-42)
            int r7 = r10.mSpeedCoefficientValue
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 900(0x384, float:1.261E-42)
            int r7 = r10.mMaxIpCountEachDomain
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 901(0x385, float:1.263E-42)
            int r7 = r10.mEnableIpBucket
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 902(0x386, float:1.264E-42)
            int r7 = r10.mErrorStateTrustTime
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 2508(0x9cc, float:3.514E-42)
            int r7 = r10.mEnablePreconnect
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 2509(0x9cd, float:3.516E-42)
            int r7 = r10.mPreconnectNum
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 2510(0x9ce, float:3.517E-42)
            int r7 = r10.mEnableLoaderPreempt
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 2511(0x9cf, float:3.519E-42)
            int r7 = r10.mNextDownloadThreshold
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7216(0x1c30, float:1.0112E-41)
            int r7 = r10.mOnlyUseCdn
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 3511(0xdb7, float:4.92E-42)
            int r7 = r10.mAccessCheckLevel
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 5511(0x1587, float:7.723E-42)
            int r7 = r10.mEnableSessionReuse
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 5512(0x1588, float:7.724E-42)
            int r7 = r10.mMaxTlsVersion
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 6512(0x1970, float:9.125E-42)
            int r7 = r10.mCheckPreloadLevel
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 8217(0x2019, float:1.1514E-41)
            int r7 = r10.mXYLibValue
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7340(0x1cac, float:1.0286E-41)
            int r7 = r10.mEnableP2PPreDown
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7341(0x1cad, float:1.0287E-41)
            int r7 = r10.mEnablePlayLog
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7342(0x1cae, float:1.0288E-41)
            int r7 = r10.mEnableNetScheduler
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7358(0x1cbe, float:1.0311E-41)
            int r7 = r10.mEnableCacheReqRange
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7343(0x1caf, float:1.029E-41)
            int r7 = r10.mNetSchedulerBlockAllNetErr
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7344(0x1cb0, float:1.0291E-41)
            int r7 = r10.mNetSchedulerBlockErrCount
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7345(0x1cb1, float:1.0293E-41)
            int r7 = r10.mNetSChedulerBlockDurationMs
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7346(0x1cb2, float:1.0294E-41)
            int r7 = r10.mFirstRangeLeftThreshold
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7394(0x1ce2, float:1.0361E-41)
            int r7 = r10.mNetSchedulerBlockHostIpErrCount
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 5513(0x1589, float:7.725E-42)
            int r7 = r10.mMaxFileMemCacheSize
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 5515(0x158b, float:7.728E-42)
            int r7 = r10.mMaxFileMemCacheNum
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 110(0x6e, float:1.54E-43)
            int r7 = r10.mWriteFileNotifyIntervalMS
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7359(0x1cbf, float:1.0312E-41)
            int r7 = r10.mP2PPreDownPeerCount
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7372(0x1ccc, float:1.033E-41)
            int r7 = r10.mP2PFirstRangeLoaderType
            _setIntValue(r2, r0, r7)
            int r0 = r10.mSocketSendBufferKB
            if (r0 <= 0) goto L2a4
            long r2 = r9.mHandle
            r7 = 7220(0x1c34, float:1.0117E-41)
            _setIntValue(r2, r7, r0)
        L2a4:
            int r0 = r10.mRingBufferSizeKB
            if (r0 <= 0) goto L2af
            long r2 = r9.mHandle
            r7 = 7221(0x1c35, float:1.0119E-41)
            _setIntValue(r2, r7, r0)
        L2af:
            long r2 = r9.mHandle
            r0 = 7222(0x1c36, float:1.012E-41)
            int r7 = r10.mEnableFileCacheV2
            _setIntValue(r2, r0, r7)
            java.lang.String r0 = r10.mVdpABTestId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2c9
            long r2 = r9.mHandle
            r0 = 7223(0x1c37, float:1.0122E-41)
            java.lang.String r7 = r10.mVdpABTestId
            _setStringValue(r2, r0, r7)
        L2c9:
            java.lang.String r0 = r10.mVdpGroupId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2da
            long r2 = r9.mHandle
            r0 = 7224(0x1c38, float:1.0123E-41)
            java.lang.String r7 = r10.mVdpGroupId
            _setStringValue(r2, r0, r7)
        L2da:
            long r2 = r9.mHandle
            r0 = 7225(0x1c39, float:1.0124E-41)
            int r7 = r10.mAlogEnable
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7226(0x1c3a, float:1.0126E-41)
            int r7 = r10.mEnableSyncDnsForPcdn
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7228(0x1c3c, float:1.0129E-41)
            int r7 = r10.mEnableFileRingBuffer
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7332(0x1ca4, float:1.0274E-41)
            int r7 = r10.mEnableLazyBufferpool
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7334(0x1ca6, float:1.0277E-41)
            int r7 = r10.mEnableNewBufferpool
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7335(0x1ca7, float:1.0279E-41)
            int r7 = r10.mNewBufferPoolBlockSize
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7336(0x1ca8, float:1.028E-41)
            int r7 = r10.mNewBufferPoolResidentSize
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7337(0x1ca9, float:1.0281E-41)
            int r7 = r10.mNewBufferPoolGrowBlockCount
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7229(0x1c3d, float:1.013E-41)
            int r7 = r10.mEnableUseFileExtendLoaderBuffer
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7330(0x1ca2, float:1.0272E-41)
            int r7 = r10.mMaxIPV6Num
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7331(0x1ca3, float:1.0273E-41)
            int r7 = r10.mMaxIPV4Num
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 1510(0x5e6, float:2.116E-42)
            int r7 = r10.mForbidByPassCookie
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7333(0x1ca5, float:1.0276E-41)
            int r7 = r10.mSessionTimeout
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7339(0x1cab, float:1.0284E-41)
            int r7 = r10.mEnablePlayInfoCache
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7347(0x1cb3, float:1.0295E-41)
            int r7 = r10.mEnableDownloaderLog
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7348(0x1cb4, float:1.0297E-41)
            int r7 = r10.mEnableTTNetLoader
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7349(0x1cb5, float:1.0298E-41)
            int r7 = r10.mTTNetLoaderCronetBufSizeKB
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7357(0x1cbd, float:1.031E-41)
            int r7 = r10.mIsAllowTryTheLastUrl
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7368(0x1cc8, float:1.0325E-41)
            int r7 = r10.mSpeedSampleInterval
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7391(0x1cdf, float:1.0357E-41)
            int r7 = r10.mEnableIOManager
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7369(0x1cc9, float:1.0326E-41)
            int r7 = r10.mEnableLoaderSeek
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7370(0x1cca, float:1.0328E-41)
            int r7 = r10.mGlobalSpeedSampleInterval
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7362(0x1cc2, float:1.0316E-41)
            int r7 = r10.mEnableDynamicTimeout
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7360(0x1cc0, float:1.0314E-41)
            int r7 = r10.mSocketInitialTimeout
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7361(0x1cc1, float:1.0315E-41)
            int r7 = r10.mMaxSocketReuseCount
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7371(0x1ccb, float:1.0329E-41)
            int r7 = r10.mEnableReportTaskLog
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 8218(0x201a, float:1.1516E-41)
            long r7 = r10.mP2PStragetyLevel
            _setInt64Value(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7363(0x1cc3, float:1.0318E-41)
            long r7 = r10.mConnectPoolStragetyValue
            _setInt64Value(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7364(0x1cc4, float:1.0319E-41)
            int r7 = r10.mMaxAliveHostNum
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7392(0x1ce0, float:1.0358E-41)
            int r7 = r10.mFileExtendSizeKB
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7393(0x1ce1, float:1.036E-41)
            int r7 = r10.mMinAllowSpeed
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7395(0x1ce3, float:1.0363E-41)
            int r7 = r10.mEnableOwnVDPPreloadNotify
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 8219(0x201b, float:1.1517E-41)
            int r7 = r10.mEnableEarlyData
            _setIntValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7397(0x1ce5, float:1.0365E-41)
            long r7 = r10.mMonitorMinAllowLoadSize
            _setInt64Value(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7396(0x1ce4, float:1.0364E-41)
            long r7 = r10.mMonitorTimeInternal
            _setInt64Value(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7398(0x1ce6, float:1.0367E-41)
            java.lang.String r7 = r10.mSocketTraingCenterConfigStr
            _setStringValue(r2, r0, r7)
            long r2 = r9.mHandle
            r0 = 7399(0x1ce7, float:1.0368E-41)
            java.lang.String r7 = r10.mCacheDirListsStr
            _setStringValue(r2, r0, r7)
            int r0 = r10.mEnableEventInfo
            if (r0 <= 0) goto L432
            long r2 = r9.mHandle
            r7 = 9999(0x270f, float:1.4012E-41)
            _setIntValue(r2, r7, r0)
        L432:
            int r0 = r10.mEnableStorageModule
            if (r0 <= 0) goto L47f
            long r2 = r9.mHandle
            r7 = 10000(0x2710, float:1.4013E-41)
            _setIntValue(r2, r7, r0)
            int r0 = r10.mStoPlayDldWinSizeKBNM
            if (r0 <= 0) goto L448
            long r2 = r9.mHandle
            r7 = 10001(0x2711, float:1.4014E-41)
            _setIntValue(r2, r7, r0)
        L448:
            int r0 = r10.mStoPlayDldWinSizeKBLS
            if (r0 <= 0) goto L453
            long r2 = r9.mHandle
            r7 = 10002(0x2712, float:1.4016E-41)
            _setIntValue(r2, r7, r0)
        L453:
            int r0 = r10.mStoRingBufferSizeKB
            if (r0 <= 0) goto L45e
            long r2 = r9.mHandle
            r7 = 10003(0x2713, float:1.4017E-41)
            _setIntValue(r2, r7, r0)
        L45e:
            int r0 = r10.mStoIoWriteLimitKBTh1
            if (r0 <= 0) goto L469
            long r2 = r9.mHandle
            r7 = 10004(0x2714, float:1.4019E-41)
            _setIntValue(r2, r7, r0)
        L469:
            int r0 = r10.mStoIoWriteLimitKBTh2
            if (r0 <= 0) goto L474
            long r2 = r9.mHandle
            r7 = 10005(0x2715, float:1.402E-41)
            _setIntValue(r2, r7, r0)
        L474:
            int r0 = r10.mStoMaxIdleTimeSec
            if (r0 <= 0) goto L47f
            long r2 = r9.mHandle
            r7 = 10006(0x2716, float:1.4021E-41)
            _setIntValue(r2, r7, r0)
        L47f:
            long r2 = r9.mHandle
            r0 = 9400(0x24b8, float:1.3172E-41)
            int r7 = r10.mIgnorePlayInfo
            _setIntValue(r2, r0, r7)
            java.lang.String r0 = r10.mSettingsDomain
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L499
            long r2 = r9.mHandle
            r0 = 9401(0x24b9, float:1.3174E-41)
            java.lang.String r7 = r10.mSettingsDomain
            _setStringValue(r2, r0, r7)
        L499:
            java.lang.String r0 = r10.mDmDomain
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L4aa
            long r2 = r9.mHandle
            r0 = 9402(0x24ba, float:1.3175E-41)
            java.lang.String r7 = r10.mDmDomain
            _setStringValue(r2, r0, r7)
        L4aa:
            java.lang.String r0 = r10.mForesightDomain
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L4bb
            long r2 = r9.mHandle
            r0 = 9403(0x24bb, float:1.3176E-41)
            java.lang.String r7 = r10.mForesightDomain
            _setStringValue(r2, r0, r7)
        L4bb:
            java.lang.String r0 = r10.mDomains
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L4cc
            long r2 = r9.mHandle
            r0 = 9404(0x24bc, float:1.3178E-41)
            java.lang.String r7 = r10.mDomains
            _setStringValue(r2, r0, r7)
        L4cc:
            java.lang.String r0 = r10.mKeyDomain
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L4dd
            long r2 = r9.mHandle
            r0 = 9405(0x24bd, float:1.3179E-41)
            java.lang.String r7 = r10.mKeyDomain
            _setStringValue(r2, r0, r7)
        L4dd:
            java.lang.String r0 = r10.mKeyToken
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L4ee
            long r2 = r9.mHandle
            r0 = 9406(0x24be, float:1.318E-41)
            java.lang.String r10 = r10.mKeyToken
            _setStringValue(r2, r0, r10)
        L4ee:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r10 = r9.mConfigure
            int r10 = r10.mDNSMainType
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.setIntValue(r1, r10)
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r10 = r9.mConfigure
            int r10 = r10.mDNSBackType
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.setIntValue(r4, r10)
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r10 = r9.mConfigure
            int r10 = r10.mDefaultExpiredTime
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.setIntValue(r5, r10)
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r10 = r9.mConfigure
            int r10 = r10.mMainToBackUpDelayedTime
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.setIntValue(r6, r10)
        L50a:
            return
    }

    private void startInternal() {
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r6.mWriteLock
            r0.lock()
            int r0 = r6.mState     // Catch: java.lang.Throwable -> L25
            r1 = 1
            if (r0 == r1) goto L27
            r6.initLogThread(r6)     // Catch: java.lang.Throwable -> L25
            long r2 = r6.mHandle     // Catch: java.lang.Throwable -> L25
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L27
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r6.mConfigure     // Catch: java.lang.Throwable -> L25
            r6.setConfigureInternal(r0)     // Catch: java.lang.Throwable -> L25
            long r2 = r6.mHandle     // Catch: java.lang.Throwable -> L25
            int r0 = _start(r2)     // Catch: java.lang.Throwable -> L25
            if (r0 < 0) goto L27
            r6.mState = r1     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r0 = move-exception
            goto L53
        L27:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r6.mWriteLock
            r0.unlock()
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r6.mConfigure
            int r0 = r0.mEnableBenchMarkIOSpeed
            if (r0 <= 0) goto L4b
            int r0 = r6.testFileIOSpeed()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "test io average speed:%d"
            java.lang.String.format(r2, r1)
            if (r0 <= 0) goto L4b
            r1 = 1508(0x5e4, float:2.113E-42)
            r6.setIntValue(r1, r0)
        L4b:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLStartCompleteListener r0 = r6.mStartCompleteListener
            if (r0 == 0) goto L52
            r0.onStartComplete()
        L52:
            return
        L53:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r6.mWriteLock
            r1.unlock()
            throw r0
    }

    private double testFileIO(java.lang.String r8, int r9, java.io.RandomAccessFile r10) throws java.lang.Exception {
            r7 = this;
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r8 == 0) goto L9
            return r0
        L9:
            long r2 = java.lang.System.currentTimeMillis()
            long r8 = (long) r9
            r10.seek(r8)
            r8 = 4096(0x1000, float:5.74E-42)
            byte[] r8 = new byte[r8]
            r9 = 0
            r4 = 0
        L17:
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 >= r5) goto L28
            r5 = 5
            java.lang.Thread.sleep(r5)
            r5 = 1024(0x400, float:1.435E-42)
            r10.write(r8, r9, r5)
            int r4 = r4 + 1
            goto L17
        L28:
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 - r2
            r2 = 0
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 <= 0) goto L54
            r8 = 819200(0xc8000, float:1.147944E-39)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r9] = r8
            r8 = 1
            r0[r8] = r10
            java.lang.String r8 = "size:%d costtime:%d"
            java.lang.String.format(r8, r0)
            r8 = 819200(0xc8000, double:4.047386E-318)
            long r8 = r8 / r4
            double r8 = (double) r8
            return r8
        L54:
            return r0
    }

    private int testFileIOSpeed() {
            r19 = this;
            r1 = r19
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r1.mConfigure
            java.lang.String r0 = r0.mCacheDir
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = -1
            if (r0 == 0) goto Le
            return r2
        Le:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r1.mConfigure
            java.lang.String r0 = r0.mCacheDir
            int r3 = r0.length()
            r4 = 1
            int r3 = r3 - r4
            char r0 = r0.charAt(r3)
            r3 = 47
            r5 = 0
            if (r0 != r3) goto L31
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r1.mConfigure
            java.lang.String r0 = r0.mCacheDir
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r5] = r0
            java.lang.String r0 = "%siospeed"
            java.lang.String r0 = java.lang.String.format(r0, r3)
        L2f:
            r3 = r0
            goto L40
        L31:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r1.mConfigure
            java.lang.String r0 = r0.mCacheDir
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r5] = r0
            java.lang.String r0 = "%s/iospeed"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            goto L2f
        L40:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r6 = r0.exists()
            if (r6 != 0) goto L4e
            r0.mkdirs()
        L4e:
            java.io.File r6 = new java.io.File
            java.lang.String r0 = "iospeed.cach"
            r6.<init>(r3, r0)
            boolean r0 = r6.exists()
            if (r0 == 0) goto L5e
            r6.delete()
        L5e:
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> Lba
            java.lang.String r0 = "rw"
            r7.<init>(r6, r0)     // Catch: java.lang.Exception -> Lba
            r8 = 0
            r10 = r8
            r12 = r10
            r2 = 0
        L6a:
            r0 = 30
            if (r2 >= r0) goto Laa
            double r14 = r1.testFileIO(r3, r2, r7)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L91
            java.lang.String r0 = "num:%d result:%f"
            java.lang.Integer r16 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8d
            java.lang.Double r17 = java.lang.Double.valueOf(r14)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8d
            r18 = 1
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            r4[r5] = r16     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            r4[r18] = r17     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            java.lang.String.format(r0, r4)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            goto L98
        L89:
            r0 = move-exception
            goto Lb1
        L8b:
            r0 = move-exception
            goto L95
        L8d:
            r0 = move-exception
            r18 = 1
            goto L95
        L91:
            r0 = move-exception
            r18 = 1
            r14 = r8
        L95:
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> La8
        L98:
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 <= 0) goto La4
            r0 = 20
            if (r2 < r0) goto La4
            double r12 = r12 + r14
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 + r14
        La4:
            int r2 = r2 + 1
            r4 = 1
            goto L6a
        La8:
            goto Lb2
        Laa:
            r7.close()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> La8
            r6.delete()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> La8
            goto Lb2
        Lb1:
            throw r0
        Lb2:
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto Lb9
            double r12 = r12 / r10
            int r0 = (int) r12
            return r0
        Lb9:
            return r5
        Lba:
            return r2
    }

    public static synchronized boolean tryLoadTTNetLoaderPlugin() {
            java.lang.Class<com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader> r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.class
            monitor-enter(r0)
            boolean r1 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.mIsMdlTtnetPluginLoaded     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static boolean tryLoadVcnverifylib() {
            r0 = 1
            return r0
    }

    public void addDataSource(int r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7
            return
        L7:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.mWriteLock
            r0.lock()
            long r0 = r2.mHandle     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L17
            _addDataSource(r0, r3, r4)     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L17
        L11:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r2.mWriteLock
            r3.unlock()
            return
        L17:
            r3 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r2.mWriteLock
            r4.unlock()
            throw r3
    }

    public void cancel(java.lang.String r6) {
            r5 = this;
            int r0 = r5.mState
            r1 = 1
            if (r0 == r1) goto L6
            return
        L6:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.lock()
            long r0 = r5.mHandle     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1b
            _cancel(r0, r6)     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            goto L1b
        L17:
            r6 = move-exception
            goto L25
        L19:
            r6 = move-exception
            goto L21
        L1b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r5.mWriteLock
            r6.unlock()
            return
        L21:
            com.bytedance.sdk.component.utils.vl.j(r6)     // Catch: java.lang.Throwable -> L17
            goto L1b
        L25:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.unlock()
            throw r6
    }

    public void cancelAll() {
            r5 = this;
            int r0 = r5.mState
            r1 = 1
            if (r0 == r1) goto L6
            return
        L6:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.lock()
            long r0 = r5.mHandle     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1b
            _cancelAll(r0)     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            goto L1b
        L17:
            r0 = move-exception
            goto L25
        L19:
            r0 = move-exception
            goto L21
        L1b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.unlock()
            return
        L21:
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L17
            goto L1b
        L25:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r5.mWriteLock
            r1.unlock()
            throw r0
    }

    public void cancelAllPreloadWaitReqs() {
            r5 = this;
            int r0 = r5.mState
            r1 = 1
            if (r0 == r1) goto L6
            return
        L6:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r5.mReadLock
            r0.lock()
            long r0 = r5.mHandle     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1b
            _cancelAllPreloadWaitReqs(r0)     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            goto L1b
        L17:
            r0 = move-exception
            goto L25
        L19:
            r0 = move-exception
            goto L21
        L1b:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r5.mReadLock
            r0.unlock()
            return
        L21:
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L17
            goto L1b
        L25:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r5.mReadLock
            r1.unlock()
            throw r0
    }

    public void clearAllCaches() {
            r5 = this;
            int r0 = r5.mState
            r1 = 1
            if (r0 == r1) goto L6
            return
        L6:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.lock()
            long r0 = r5.mHandle     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1b
            _clearAllCaches(r0)     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            goto L1b
        L17:
            r0 = move-exception
            goto L25
        L19:
            r0 = move-exception
            goto L21
        L1b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.unlock()
            return
        L21:
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L17
            goto L1b
        L25:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r5.mWriteLock
            r1.unlock()
            throw r0
    }

    public void clearNetinfoCache() {
            r2 = this;
            int r0 = r2.mState
            r1 = 1
            if (r0 == r1) goto L6
            return
        L6:
            com.bykv.vk.component.ttvideo.mediakit.net.IPCache r0 = com.bykv.vk.component.ttvideo.mediakit.net.IPCache.getInstance()
            r0.clear()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.mWriteLock
            r0.lock()
            long r0 = r2.mHandle     // Catch: java.lang.Throwable -> L1d java.lang.UnsatisfiedLinkError -> L1f
            _clearNetinfoCache(r0)     // Catch: java.lang.Throwable -> L1d java.lang.UnsatisfiedLinkError -> L1f
        L17:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.mWriteLock
            r0.unlock()
            return
        L1d:
            r0 = move-exception
            goto L24
        L1f:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L1d
            goto L17
        L24:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r2.mWriteLock
            r1.unlock()
            throw r0
    }

    public void close() {
            r5 = this;
            int r0 = r5.mState
            r1 = 1
            if (r0 == r1) goto L6
            return
        L6:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.lock()
            long r0 = r5.mHandle     // Catch: java.lang.Throwable -> L26 java.lang.UnsatisfiedLinkError -> L28
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3e
            _close(r0)     // Catch: java.lang.Throwable -> L26 java.lang.UnsatisfiedLinkError -> L28
            r5.mHandle = r2     // Catch: java.lang.Throwable -> L26 java.lang.UnsatisfiedLinkError -> L28
            r0 = 5
            r5.mState = r0     // Catch: java.lang.Throwable -> L26 java.lang.UnsatisfiedLinkError -> L28
            android.os.Handler r0 = r5.mHandler     // Catch: java.lang.Throwable -> L26 java.lang.UnsatisfiedLinkError -> L28
            r1 = 0
            if (r0 == 0) goto L2a
            r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.Throwable -> L26 java.lang.UnsatisfiedLinkError -> L28
            r5.mHandler = r1     // Catch: java.lang.Throwable -> L26 java.lang.UnsatisfiedLinkError -> L28
            goto L2a
        L26:
            r0 = move-exception
            goto L48
        L28:
            r0 = move-exception
            goto L44
        L2a:
            android.os.Handler r0 = r5.mLogHandler     // Catch: java.lang.Throwable -> L26 java.lang.UnsatisfiedLinkError -> L28
            if (r0 == 0) goto L3e
            r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.Throwable -> L26 java.lang.UnsatisfiedLinkError -> L28
            android.os.Handler r0 = r5.mLogHandler     // Catch: java.lang.Throwable -> L26 java.lang.UnsatisfiedLinkError -> L28
            android.os.Looper r0 = r0.getLooper()     // Catch: java.lang.Throwable -> L26 java.lang.UnsatisfiedLinkError -> L28
            r0.quit()     // Catch: java.lang.Throwable -> L26 java.lang.UnsatisfiedLinkError -> L28
            r5.mLogHandler = r1     // Catch: java.lang.Throwable -> L26 java.lang.UnsatisfiedLinkError -> L28
            r5.mMsgThread = r1     // Catch: java.lang.Throwable -> L26 java.lang.UnsatisfiedLinkError -> L28
        L3e:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.unlock()
            return
        L44:
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L26
            goto L3e
        L48:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r5.mWriteLock
            r1.unlock()
            throw r0
    }

    public void doParseHosts(java.lang.String[] r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.getInstance()
            r0.doParseHosts(r2)
            return
    }

    public void downloadResource(java.lang.String r6) {
            r5 = this;
            int r0 = r5.mState
            r1 = 1
            if (r0 == r1) goto L6
            goto Lc
        L6:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto Ld
        Lc:
            return
        Ld:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.lock()
            long r0 = r5.mHandle     // Catch: java.lang.Throwable -> L1e java.lang.UnsatisfiedLinkError -> L20
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L22
            _downloadResource(r0, r6)     // Catch: java.lang.Throwable -> L1e java.lang.UnsatisfiedLinkError -> L20
            goto L22
        L1e:
            r6 = move-exception
            goto L2c
        L20:
            r6 = move-exception
            goto L28
        L22:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r5.mWriteLock
            r6.unlock()
            return
        L28:
            com.bytedance.sdk.component.utils.vl.j(r6)     // Catch: java.lang.Throwable -> L1e
            goto L22
        L2c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.unlock()
            throw r6
    }

    public void forceRemoveFileCache(java.lang.String r6) {
            r5 = this;
            int r0 = r5.mState
            r1 = 1
            if (r0 == r1) goto L6
            goto Lc
        L6:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto Ld
        Lc:
            return
        Ld:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.lock()
            long r0 = r5.mHandle     // Catch: java.lang.Throwable -> L1e java.lang.UnsatisfiedLinkError -> L20
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L22
            _forceRemoveCacheFile(r0, r6)     // Catch: java.lang.Throwable -> L1e java.lang.UnsatisfiedLinkError -> L20
            goto L22
        L1e:
            r6 = move-exception
            goto L2c
        L20:
            r6 = move-exception
            goto L28
        L22:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r5.mWriteLock
            r6.unlock()
            return
        L28:
            com.bytedance.sdk.component.utils.vl.j(r6)     // Catch: java.lang.Throwable -> L1e
            goto L22
        L2c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.unlock()
            throw r6
    }

    public long getAllCacheSize() {
            r7 = this;
            int r0 = r7.mState
            r1 = 1
            r2 = -1
            if (r0 == r1) goto L8
            return r2
        L8:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r7.mReadLock
            r0.lock()
            long r0 = r7.mHandle     // Catch: java.lang.Throwable -> L1c java.lang.UnsatisfiedLinkError -> L1e
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L20
            r4 = 100
            long r2 = _getLongValue(r0, r4)     // Catch: java.lang.Throwable -> L1c java.lang.UnsatisfiedLinkError -> L1e
            goto L20
        L1c:
            r0 = move-exception
            goto L2a
        L1e:
            r0 = move-exception
            goto L26
        L20:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r7.mReadLock
            r0.unlock()
            return r2
        L26:
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L1c
            goto L20
        L2a:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r7.mReadLock
            r1.unlock()
            throw r0
    }

    public java.lang.String getAuth(java.lang.String r4) {
            r3 = this;
            int r0 = r3.mState
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L31
            boolean r0 = r3.isSupportGetAuth
            if (r0 != 0) goto Lb
            goto L31
        Lb:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.lock()
            long r0 = r3.mHandle     // Catch: java.lang.Throwable -> L1c java.lang.UnsatisfiedLinkError -> L1e
            java.lang.String r4 = _getAuth(r0, r4)     // Catch: java.lang.Throwable -> L1c java.lang.UnsatisfiedLinkError -> L1e
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.unlock()
            return r4
        L1c:
            r4 = move-exception
            goto L2b
        L1e:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)     // Catch: java.lang.Throwable -> L1c
            r4 = 0
            r3.isSupportGetAuth = r4     // Catch: java.lang.Throwable -> L1c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r3.mReadLock
            r4.unlock()
            return r2
        L2b:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.unlock()
            throw r4
        L31:
            return r2
    }

    public java.lang.String getCDNLog(java.lang.String r4) {
            r3 = this;
            int r0 = r3.mState
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L7
            return r2
        L7:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.lock()
            long r0 = r3.mHandle     // Catch: java.lang.Throwable -> L18 java.lang.UnsatisfiedLinkError -> L1f
            java.lang.String r4 = _getCDNLog(r0, r4)     // Catch: java.lang.Throwable -> L18 java.lang.UnsatisfiedLinkError -> L1f
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.unlock()
            return r4
        L18:
            r4 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.unlock()
            throw r4
        L1f:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r3.mReadLock
            r4.unlock()
            return r2
    }

    public com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLFileInfo getCacheInfo(java.lang.String r8) {
            r7 = this;
            int r0 = r7.mState
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L7
            return r1
        L7:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto Le
            return r1
        Le:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r7.mReadLock
            r0.lock()
            long r3 = r7.mHandle     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L66
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L68
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r8 = _getStringValueByStr(r3, r8, r0)     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L66
            java.lang.String r0 = ","
            java.lang.String[] r8 = r8.split(r0)     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L66
            int r0 = r8.length     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L66
            r3 = 3
            if (r0 < r3) goto L68
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLFileInfo r0 = new com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLFileInfo     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L66
            r0.<init>()     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L66
            r1 = 2
            r1 = r8[r1]     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L4d
            r0.mFilePath = r1     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L4d
            r1 = 0
            r3 = r8[r1]     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L4d
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L4d
            if (r3 != 0) goto L50
            r1 = r8[r1]     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L4d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L4d
            long r3 = r1.longValue()     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L4d
            r0.mCacheSize = r3     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L4d
            goto L50
        L4b:
            r8 = move-exception
            goto L72
        L4d:
            r8 = move-exception
            r1 = r0
            goto L6e
        L50:
            r1 = r8[r2]     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L4d
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L4d
            if (r1 != 0) goto L64
            r8 = r8[r2]     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L4d
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L4d
            long r1 = r8.longValue()     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L4d
            r0.mContentLenght = r1     // Catch: java.lang.Throwable -> L4b java.lang.UnsatisfiedLinkError -> L4d
        L64:
            r1 = r0
            goto L68
        L66:
            r8 = move-exception
            goto L6e
        L68:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r7.mReadLock
            r8.unlock()
            return r1
        L6e:
            com.bytedance.sdk.component.utils.vl.j(r8)     // Catch: java.lang.Throwable -> L4b
            goto L68
        L72:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r7.mReadLock
            r0.unlock()
            throw r8
    }

    public long getCacheSize(java.lang.String r8) {
            r7 = this;
            int r0 = r7.mState
            r1 = 1
            r2 = -1
            if (r0 == r1) goto L8
            return r2
        L8:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto Lf
            return r2
        Lf:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r7.mReadLock
            r0.lock()
            long r0 = r7.mHandle     // Catch: java.lang.Throwable -> L23 java.lang.UnsatisfiedLinkError -> L25
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L27
            r4 = 103(0x67, float:1.44E-43)
            long r2 = _getLongValueByStr(r0, r8, r4)     // Catch: java.lang.Throwable -> L23 java.lang.UnsatisfiedLinkError -> L25
            goto L27
        L23:
            r8 = move-exception
            goto L31
        L25:
            r8 = move-exception
            goto L2d
        L27:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r7.mReadLock
            r8.unlock()
            return r2
        L2d:
            com.bytedance.sdk.component.utils.vl.j(r8)     // Catch: java.lang.Throwable -> L23
            goto L27
        L31:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r7.mReadLock
            r0.unlock()
            throw r8
    }

    public long getCacheSize(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            int r0 = r7.mState
            r1 = 1
            r2 = -1
            if (r0 == r1) goto L8
            return r2
        L8:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto Lf
            return r2
        Lf:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L16
            return r2
        L16:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r7.mReadLock
            r0.lock()
            long r0 = r7.mHandle     // Catch: java.lang.Throwable -> L2a java.lang.UnsatisfiedLinkError -> L2c
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L2e
            r4 = 103(0x67, float:1.44E-43)
            long r2 = _getLongValueByStrStr(r0, r8, r9, r4)     // Catch: java.lang.Throwable -> L2a java.lang.UnsatisfiedLinkError -> L2c
            goto L2e
        L2a:
            r8 = move-exception
            goto L38
        L2c:
            r8 = move-exception
            goto L34
        L2e:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r7.mReadLock
            r8.unlock()
            return r2
        L34:
            com.bytedance.sdk.component.utils.vl.j(r8)     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L38:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r9 = r7.mReadLock
            r9.unlock()
            throw r8
    }

    public com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure getConfig() {
            r2 = this;
            int r0 = r2.mState
            r1 = 1
            if (r0 == r1) goto L7
            r0 = 0
            return r0
        L7:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r2.mConfigure
            return r0
    }

    public long getInt64Value(int r2, long r3) {
            r1 = this;
            r0 = 8003(0x1f43, float:1.1215E-41)
            if (r2 == r0) goto La
            r0 = 8004(0x1f44, float:1.1216E-41)
            if (r2 != r0) goto L9
            goto La
        L9:
            return r3
        La:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener r0 = r1.mLiveListener
            if (r0 == 0) goto L13
            long r2 = r0.getInt64Value(r2, r3)
            return r2
        L13:
            java.lang.String r0 = "getInt64Value mLiveListener is nullptr, code: "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r0.concat(r2)
            java.lang.String r0 = "ttmn"
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLLog.e(r0, r2)
            return r3
    }

    public java.lang.String getLocalAddr() {
            r6 = this;
            int r0 = r6.mState
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L7
            return r2
        L7:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r6.mReadLock
            r0.lock()
            long r0 = r6.mHandle     // Catch: java.lang.Throwable -> L1a java.lang.UnsatisfiedLinkError -> L1c
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L1e
            r3 = 4
            java.lang.String r2 = _getStringValue(r0, r3)     // Catch: java.lang.Throwable -> L1a java.lang.UnsatisfiedLinkError -> L1c
            goto L1e
        L1a:
            r0 = move-exception
            goto L28
        L1c:
            r0 = move-exception
            goto L24
        L1e:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r6.mReadLock
            r0.unlock()
            return r2
        L24:
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L1a
            goto L1e
        L28:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r6.mReadLock
            r1.unlock()
            throw r0
    }

    public long getLongValue(int r8) {
            r7 = this;
            r0 = 7218(0x1c32, float:1.0115E-41)
            r1 = 0
            r3 = -1
            if (r8 == r0) goto L5a
            r0 = 7390(0x1cde, float:1.0356E-41)
            if (r8 == r0) goto L5a
            r0 = 9407(0x24bf, float:1.3182E-41)
            if (r8 != r0) goto L11
            goto L5a
        L11:
            int r0 = r7.mState
            r5 = 1
            if (r0 == r5) goto L17
            return r3
        L17:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r7.mConfigure
            if (r0 != 0) goto L1e
            r0 = -998(0xfffffffffffffc1a, double:NaN)
            return r0
        L1e:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r7.mReadLock
            r0.lock()
            switch(r8) {
                case 8100: goto L45;
                case 8101: goto L40;
                case 8102: goto L3b;
                case 8103: goto L35;
                default: goto L26;
            }
        L26:
            long r5 = r7.mHandle     // Catch: java.lang.Throwable -> L31 java.lang.UnsatisfiedLinkError -> L33
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L4a
            long r3 = _getLongValue(r5, r8)     // Catch: java.lang.Throwable -> L31 java.lang.UnsatisfiedLinkError -> L33
            goto L4a
        L31:
            r8 = move-exception
            goto L54
        L33:
            r8 = move-exception
            goto L50
        L35:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r8 = r7.mConfigure     // Catch: java.lang.Throwable -> L31 java.lang.UnsatisfiedLinkError -> L33
            int r8 = r8.mLiveLoaderType     // Catch: java.lang.Throwable -> L31 java.lang.UnsatisfiedLinkError -> L33
        L39:
            long r3 = (long) r8     // Catch: java.lang.Throwable -> L31 java.lang.UnsatisfiedLinkError -> L33
            goto L4a
        L3b:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r8 = r7.mConfigure     // Catch: java.lang.Throwable -> L31 java.lang.UnsatisfiedLinkError -> L33
            int r8 = r8.mLiveEnableMdlProto     // Catch: java.lang.Throwable -> L31 java.lang.UnsatisfiedLinkError -> L33
            goto L39
        L40:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r8 = r7.mConfigure     // Catch: java.lang.Throwable -> L31 java.lang.UnsatisfiedLinkError -> L33
            int r8 = r8.mLiveP2pAllow     // Catch: java.lang.Throwable -> L31 java.lang.UnsatisfiedLinkError -> L33
            goto L39
        L45:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r8 = r7.mConfigure     // Catch: java.lang.Throwable -> L31 java.lang.UnsatisfiedLinkError -> L33
            int r8 = r8.mLiveLoaderEnable     // Catch: java.lang.Throwable -> L31 java.lang.UnsatisfiedLinkError -> L33
            goto L39
        L4a:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r7.mReadLock
            r8.unlock()
            return r3
        L50:
            com.bytedance.sdk.component.utils.vl.j(r8)     // Catch: java.lang.Throwable -> L31
            goto L4a
        L54:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r7.mReadLock
            r0.unlock()
            throw r8
        L5a:
            long r5 = r7.mHandle
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L65
            long r0 = _getLongValue(r5, r8)
            return r0
        L65:
            return r3
    }

    public long getLongValueByStr(java.lang.String r8, int r9) {
            r7 = this;
            int r0 = r7.mState
            r1 = 1
            r2 = -1
            if (r0 == r1) goto L8
            return r2
        L8:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto Lf
            return r2
        Lf:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r7.mWriteLock
            r0.lock()
            long r0 = r7.mHandle     // Catch: java.lang.Throwable -> L21 java.lang.UnsatisfiedLinkError -> L23
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L25
            long r2 = _getLongValueByStr(r0, r8, r9)     // Catch: java.lang.Throwable -> L21 java.lang.UnsatisfiedLinkError -> L23
            goto L25
        L21:
            r8 = move-exception
            goto L2f
        L23:
            r8 = move-exception
            goto L2b
        L25:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r8 = r7.mWriteLock
            r8.unlock()
            return r2
        L2b:
            com.bytedance.sdk.component.utils.vl.j(r8)     // Catch: java.lang.Throwable -> L21
            goto L25
        L2f:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r9 = r7.mWriteLock
            r9.unlock()
            throw r8
    }

    public java.lang.String getStringCacheInfo(java.lang.String r7) {
            r6 = this;
            int r0 = r6.mState
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L7
            return r2
        L7:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto Le
            return r2
        Le:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r6.mReadLock
            r0.lock()
            long r0 = r6.mHandle     // Catch: java.lang.Throwable -> L22 java.lang.UnsatisfiedLinkError -> L24
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L26
            r3 = 101(0x65, float:1.42E-43)
            java.lang.String r2 = _getStringValueByStr(r0, r7, r3)     // Catch: java.lang.Throwable -> L22 java.lang.UnsatisfiedLinkError -> L24
            goto L26
        L22:
            r7 = move-exception
            goto L30
        L24:
            r7 = move-exception
            goto L2c
        L26:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r6.mReadLock
            r7.unlock()
            return r2
        L2c:
            com.bytedance.sdk.component.utils.vl.j(r7)     // Catch: java.lang.Throwable -> L22
            goto L26
        L30:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r6.mReadLock
            r0.unlock()
            throw r7
    }

    public java.lang.String getStringCacheInfo(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            int r0 = r6.mState
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L7
            return r2
        L7:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto Le
            return r2
        Le:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L15
            return r2
        L15:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r6.mReadLock
            r0.lock()
            long r0 = r6.mHandle     // Catch: java.lang.Throwable -> L29 java.lang.UnsatisfiedLinkError -> L2b
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L2d
            r3 = 101(0x65, float:1.42E-43)
            java.lang.String r2 = _getStringValueByStrStr(r0, r7, r8, r3)     // Catch: java.lang.Throwable -> L29 java.lang.UnsatisfiedLinkError -> L2b
            goto L2d
        L29:
            r7 = move-exception
            goto L37
        L2b:
            r7 = move-exception
            goto L33
        L2d:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r6.mReadLock
            r7.unlock()
            return r2
        L33:
            com.bytedance.sdk.component.utils.vl.j(r7)     // Catch: java.lang.Throwable -> L29
            goto L2d
        L37:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r6.mReadLock
            r8.unlock()
            throw r7
    }

    public java.lang.String getStringValue(int r7) {
            r6 = this;
            int r0 = r6.mState
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L7
            return r2
        L7:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r6.mReadLock
            r0.lock()
            long r0 = r6.mHandle     // Catch: java.lang.Throwable -> L19 java.lang.UnsatisfiedLinkError -> L1b
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L1d
            java.lang.String r2 = _getStringValue(r0, r7)     // Catch: java.lang.Throwable -> L19 java.lang.UnsatisfiedLinkError -> L1b
            goto L1d
        L19:
            r7 = move-exception
            goto L27
        L1b:
            r7 = move-exception
            goto L23
        L1d:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r6.mReadLock
            r7.unlock()
            return r2
        L23:
            com.bytedance.sdk.component.utils.vl.j(r7)     // Catch: java.lang.Throwable -> L19
            goto L1d
        L27:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r6.mReadLock
            r0.unlock()
            throw r7
    }

    public java.lang.String getStringValueByStr(java.lang.String r7, int r8) {
            r6 = this;
            int r0 = r6.mState
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L7
            return r2
        L7:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r6.mReadLock
            r0.lock()
            long r0 = r6.mHandle     // Catch: java.lang.Throwable -> L19 java.lang.UnsatisfiedLinkError -> L1b
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L1d
            java.lang.String r2 = _getStringValueByStr(r0, r7, r8)     // Catch: java.lang.Throwable -> L19 java.lang.UnsatisfiedLinkError -> L1b
            goto L1d
        L19:
            r7 = move-exception
            goto L27
        L1b:
            r7 = move-exception
            goto L23
        L1d:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r6.mReadLock
            r7.unlock()
            return r2
        L23:
            com.bytedance.sdk.component.utils.vl.j(r7)     // Catch: java.lang.Throwable -> L19
            goto L1d
        L27:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r6.mReadLock
            r8.unlock()
            throw r7
    }

    public java.lang.String getStringValueByStrkey(int r4, long r5, java.lang.String r7) {
            r3 = this;
            int r0 = r3.mState
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L7
            return r2
        L7:
            r0 = 1503(0x5df, float:2.106E-42)
            if (r4 == r0) goto L25
            r0 = 1506(0x5e2, float:2.11E-42)
            if (r4 == r0) goto L14
            r0 = 1509(0x5e5, float:2.115E-42)
            if (r4 == r0) goto L14
            goto L36
        L14:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener r0 = r3.mVodListener
            if (r0 == 0) goto L36
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L36
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener r0 = r3.mVodListener
            java.lang.String r4 = r0.getStringValue(r4, r5, r7)
            return r4
        L25:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener r4 = r3.mVodListener
            if (r4 == 0) goto L36
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 != 0) goto L36
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener r4 = r3.mVodListener
            java.lang.String r4 = r4.getCheckSumInfo(r7)
            return r4
        L36:
            return r2
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message r3) {
            r2 = this;
            int r0 = r3.what
            r1 = 12
            if (r0 == r1) goto L2a
            r1 = 9
            if (r0 != r1) goto Lb
            goto L2a
        Lb:
            r1 = 71
            if (r0 == r1) goto L23
            r1 = 72
            if (r0 == r1) goto L23
            r1 = 73
            if (r0 == r1) goto L23
            r1 = 74
            if (r0 != r1) goto L1c
            goto L23
        L1c:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener r0 = r2.mVodListener
            boolean r3 = r2.postMessage(r0, r3)
            return r3
        L23:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.LoaderListener r0 = r2.mEventListener
            boolean r3 = r2.postMessage(r0, r3)
            return r3
        L2a:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener r0 = r2.mLiveListener
            boolean r3 = r2.postMessage(r0, r3)
            return r3
    }

    public boolean isRunning() {
            r2 = this;
            int r0 = r2.mState
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public void makeFileAutoDeleteFlag(java.lang.String r6, int r7) {
            r5 = this;
            int r0 = r5.mState
            r1 = 1
            if (r0 == r1) goto L6
            goto Lc
        L6:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto Ld
        Lc:
            return
        Ld:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.lock()
            long r0 = r5.mHandle     // Catch: java.lang.Throwable -> L1e java.lang.UnsatisfiedLinkError -> L20
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L22
            _makeFileAutoDeleteFlag(r0, r6, r7)     // Catch: java.lang.Throwable -> L1e java.lang.UnsatisfiedLinkError -> L20
            goto L22
        L1e:
            r6 = move-exception
            goto L2c
        L20:
            r6 = move-exception
            goto L28
        L22:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r5.mWriteLock
            r6.unlock()
            return
        L28:
            com.bytedance.sdk.component.utils.vl.j(r6)     // Catch: java.lang.Throwable -> L1e
            goto L22
        L2c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r7 = r5.mWriteLock
            r7.unlock()
            throw r6
    }

    public void onEventInfo(java.lang.Object r11) {
            r10 = this;
            java.lang.String r0 = "headers"
            java.lang.String r1 = "bytesLoaded"
            java.lang.String r2 = "fileHash"
            java.lang.String r3 = "endOff"
            java.lang.String r4 = "off"
            java.lang.String r5 = "taskType"
            java.lang.String r6 = "what"
            int r7 = r10.mState
            r8 = 1
            if (r7 != r8) goto Ld7
            android.os.Handler r7 = r10.mLogHandler
            if (r7 != 0) goto L19
            goto Ld7
        L19:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.LoaderEventInfo r7 = new com.bykv.vk.component.ttvideo.mediakit.medialoader.LoaderEventInfo
            r7.<init>()
            r9 = 74
            r7.what = r9
            java.util.HashMap r11 = (java.util.HashMap) r11     // Catch: java.lang.Exception -> L37
            boolean r9 = r11.containsKey(r6)     // Catch: java.lang.Exception -> L37
            if (r9 == 0) goto L3a
            java.lang.Object r6 = r11.get(r6)     // Catch: java.lang.Exception -> L37
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Exception -> L37
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L37
            r7.what = r6     // Catch: java.lang.Exception -> L37
            goto L3a
        L37:
            r11 = move-exception
            goto Lc5
        L3a:
            boolean r6 = r11.containsKey(r5)     // Catch: java.lang.Exception -> L37
            if (r6 == 0) goto L4c
            java.lang.Object r5 = r11.get(r5)     // Catch: java.lang.Exception -> L37
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Exception -> L37
            int r5 = r5.intValue()     // Catch: java.lang.Exception -> L37
            r7.taskType = r5     // Catch: java.lang.Exception -> L37
        L4c:
            boolean r5 = r11.containsKey(r4)     // Catch: java.lang.Exception -> L37
            if (r5 == 0) goto L5e
            java.lang.Object r4 = r11.get(r4)     // Catch: java.lang.Exception -> L37
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Exception -> L37
            long r4 = r4.longValue()     // Catch: java.lang.Exception -> L37
            r7.off = r4     // Catch: java.lang.Exception -> L37
        L5e:
            boolean r4 = r11.containsKey(r3)     // Catch: java.lang.Exception -> L37
            if (r4 == 0) goto L70
            java.lang.Object r3 = r11.get(r3)     // Catch: java.lang.Exception -> L37
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Exception -> L37
            long r3 = r3.longValue()     // Catch: java.lang.Exception -> L37
            r7.endOff = r3     // Catch: java.lang.Exception -> L37
        L70:
            boolean r3 = r11.containsKey(r2)     // Catch: java.lang.Exception -> L37
            if (r3 == 0) goto L80
            java.lang.Object r2 = r11.get(r2)     // Catch: java.lang.Exception -> L37
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> L37
            r7.fileHash = r2     // Catch: java.lang.Exception -> L37
        L80:
            boolean r2 = r11.containsKey(r1)     // Catch: java.lang.Exception -> L37
            if (r2 == 0) goto L92
            java.lang.Object r1 = r11.get(r1)     // Catch: java.lang.Exception -> L37
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Exception -> L37
            long r1 = r1.longValue()     // Catch: java.lang.Exception -> L37
            r7.bytesLoaded = r1     // Catch: java.lang.Exception -> L37
        L92:
            boolean r1 = r11.containsKey(r0)     // Catch: java.lang.Exception -> L37
            java.lang.String r2 = ""
            if (r1 == 0) goto La3
            java.lang.Object r11 = r11.get(r0)     // Catch: java.lang.Exception -> L37
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Exception -> L37
            goto La4
        La3:
            r11 = r2
        La4:
            if (r11 == r2) goto Lc8
            java.lang.String r0 = "\r\n"
            java.lang.String[] r11 = r11.split(r0)     // Catch: java.lang.Exception -> L37
            int r0 = r11.length     // Catch: java.lang.Exception -> L37
            r1 = 0
            r2 = 0
        Laf:
            if (r2 >= r0) goto Lc8
            r3 = r11[r2]     // Catch: java.lang.Exception -> L37
            java.lang.String r4 = ":"
            java.lang.String[] r3 = r3.split(r4)     // Catch: java.lang.Exception -> L37
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r7.mHeaders     // Catch: java.lang.Exception -> L37
            r5 = r3[r1]     // Catch: java.lang.Exception -> L37
            r3 = r3[r8]     // Catch: java.lang.Exception -> L37
            r4.put(r5, r3)     // Catch: java.lang.Exception -> L37
            int r2 = r2 + 1
            goto Laf
        Lc5:
            com.bytedance.sdk.component.utils.vl.j(r11)
        Lc8:
            android.os.Handler r11 = r10.mLogHandler
            android.os.Message r11 = r11.obtainMessage()
            int r0 = r7.what
            r11.what = r0
            r11.obj = r7
            r11.sendToTarget()
        Ld7:
            return
    }

    public void onLogInfo(int r4, int r5, int r6, java.lang.String r7) {
            r3 = this;
            int r0 = r3.mState
            r1 = 1
            if (r0 != r1) goto L2d
            android.os.Handler r0 = r3.mLogHandler
            if (r0 != 0) goto La
            goto L2d
        La:
            boolean r0 = r3.isNotifyInfo(r4)
            if (r0 != 0) goto L11
            goto L2d
        L11:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderNotifyInfo r0 = new com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderNotifyInfo
            r0.<init>()
            r0.what = r4
            long r1 = (long) r5
            r0.code = r1
            long r5 = (long) r6
            r0.parameter = r5
            r0.logInfo = r7
            android.os.Handler r5 = r3.mLogHandler
            android.os.Message r5 = r5.obtainMessage()
            r5.what = r4
            r5.obj = r0
            r5.sendToTarget()
        L2d:
            return
    }

    public void onLogInfo(int r6, int r7, java.lang.String r8) {
            r5 = this;
            int r0 = r5.mState
            r1 = 1
            if (r0 != r1) goto L120
            android.os.Handler r0 = r5.mLogHandler
            if (r0 != 0) goto Lb
            goto L120
        Lb:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderNotifyInfo r0 = new com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderNotifyInfo
            r0.<init>()
            r0.what = r6
            long r2 = (long) r7
            r0.code = r2
            r0.logInfo = r8
            boolean r7 = r5.isNotifyInfo(r6)
            if (r7 == 0) goto L1f
            goto L120
        L1f:
            r7 = 4
            if (r6 == r7) goto L29
            r8 = 14
            if (r6 == r8) goto L29
            r0.logToJson()
        L29:
            if (r6 == 0) goto L10a
            if (r6 == r1) goto L105
            r8 = 10
            if (r6 == r8) goto L100
            r8 = 11
            if (r6 == r8) goto Lfb
            r8 = 19
            if (r6 == r8) goto Lf6
            r8 = 70
            if (r6 == r8) goto Lf1
            r8 = 700(0x2bc, float:9.81E-43)
            if (r6 == r8) goto L87
            r7 = 702(0x2be, float:9.84E-43)
            if (r6 == r7) goto L81
            r7 = 703(0x2bf, float:9.85E-43)
            if (r6 == r7) goto L7b
            switch(r6) {
                case 13: goto L75;
                case 14: goto L6f;
                case 15: goto L69;
                case 16: goto L10a;
                default: goto L4c;
            }
        L4c:
            switch(r6) {
                case 1000: goto L63;
                case 1001: goto L5d;
                case 1002: goto L57;
                case 1003: goto L51;
                default: goto L4f;
            }
        L4f:
            goto L113
        L51:
            java.lang.String r7 = "bb_task"
            r0.logType = r7
            goto L113
        L57:
            java.lang.String r7 = "bb_preload"
            r0.logType = r7
            goto L113
        L5d:
            java.lang.String r7 = "bb_protocol"
            r0.logType = r7
            goto L113
        L63:
            java.lang.String r7 = "bb_proxy"
            r0.logType = r7
            goto L113
        L69:
            java.lang.String r7 = "mdl_dns_log"
            r0.logInfo = r7
            goto L113
        L6f:
            java.lang.String r7 = "alog_info"
            r0.logType = r7
            goto L113
        L75:
            java.lang.String r7 = "pcdn_task"
            r0.logType = r7
            goto L113
        L7b:
            java.lang.String r7 = "global_speed"
            r0.logType = r7
            goto L113
        L81:
            java.lang.String r7 = "speed_info"
            r0.logType = r7
            goto L113
        L87:
            java.lang.String r8 = r0.logInfo     // Catch: java.lang.Throwable -> L113
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L113
            if (r8 != 0) goto L113
            java.lang.String r8 = r0.logInfo     // Catch: java.lang.Throwable -> L113
            java.lang.String r2 = ","
            java.lang.String[] r8 = r8.split(r2)     // Catch: java.lang.Throwable -> L113
            int r2 = r8.length     // Catch: java.lang.Throwable -> L113
            if (r2 < r7) goto L113
            java.lang.String r2 = "unknown"
            r0.logType = r2     // Catch: java.lang.Throwable -> L113
            r2 = 0
            r3 = r8[r2]     // Catch: java.lang.Throwable -> L113
            java.lang.String r4 = "0"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L113
            if (r3 == 0) goto Lae
            java.lang.String r2 = "video"
            r0.logType = r2     // Catch: java.lang.Throwable -> L113
            goto Lbc
        Lae:
            r2 = r8[r2]     // Catch: java.lang.Throwable -> L113
            java.lang.String r3 = "1"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L113
            if (r2 == 0) goto Lbc
            java.lang.String r2 = "audio"
            r0.logType = r2     // Catch: java.lang.Throwable -> L113
        Lbc:
            r1 = r8[r1]     // Catch: java.lang.Throwable -> L113
            r0.logInfo = r1     // Catch: java.lang.Throwable -> L113
            r1 = 2
            r1 = r8[r1]     // Catch: java.lang.NumberFormatException -> Lca java.lang.Throwable -> L113
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> Lca java.lang.Throwable -> L113
            long r1 = (long) r1     // Catch: java.lang.NumberFormatException -> Lca java.lang.Throwable -> L113
            r0.code = r1     // Catch: java.lang.NumberFormatException -> Lca java.lang.Throwable -> L113
        Lca:
            r1 = 3
            r1 = r8[r1]     // Catch: java.lang.NumberFormatException -> Ld4 java.lang.Throwable -> L113
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> Ld4 java.lang.Throwable -> L113
            long r1 = (long) r1     // Catch: java.lang.NumberFormatException -> Ld4 java.lang.Throwable -> L113
            r0.parameter = r1     // Catch: java.lang.NumberFormatException -> Ld4 java.lang.Throwable -> L113
        Ld4:
            r7 = r8[r7]     // Catch: java.lang.Throwable -> L113
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L113
            r8.<init>()     // Catch: java.lang.Throwable -> L113
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L113
            r1.<init>()     // Catch: java.lang.Throwable -> L113
            java.lang.String r2 = "tcpRtt"
            r1.put(r2, r7)     // Catch: java.lang.Throwable -> L113
            java.lang.String r7 = "tcpInfo"
            r8.put(r7, r1)     // Catch: java.lang.Throwable -> L113
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L113
            r0.logExtraJsonStr = r7     // Catch: java.lang.Throwable -> L113
            goto L113
        Lf1:
            java.lang.String r7 = "heart_beat"
            r0.logType = r7
            goto L10e
        Lf6:
            java.lang.String r7 = "mdl_downloader_log"
            r0.logType = r7
            goto L113
        Lfb:
            java.lang.String r7 = "own_live_loader_sample"
            r0.logType = r7
            goto L113
        L100:
            java.lang.String r7 = "own_live_loader"
            r0.logType = r7
            goto L113
        L105:
            java.lang.String r7 = "own_vdp"
            r0.logType = r7
            goto L113
        L10a:
            java.lang.String r7 = "media_loader"
            r0.logType = r7
        L10e:
            org.json.JSONObject r7 = r0.jsonLog
            if (r7 != 0) goto L113
            goto L120
        L113:
            android.os.Handler r7 = r5.mLogHandler
            android.os.Message r7 = r7.obtainMessage()
            r7.what = r6
            r7.obj = r0
            r7.sendToTarget()
        L120:
            return
    }

    public void onNotify(int r3, long r4, int r6) {
            r2 = this;
            int r0 = r2.mState
            r1 = 1
            if (r0 != r1) goto L23
            android.os.Handler r0 = r2.mHandler
            if (r0 != 0) goto La
            goto L23
        La:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderNotifyInfo r0 = new com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderNotifyInfo
            r0.<init>()
            r0.what = r3
            r0.parameter = r4
            long r4 = (long) r6
            r0.code = r4
            android.os.Handler r4 = r2.mHandler
            android.os.Message r4 = r4.obtainMessage()
            r4.obj = r0
            r4.what = r3
            r4.sendToTarget()
        L23:
            return
    }

    public void p2pPredown(java.lang.String r3) {
            r2 = this;
            int r0 = r2.mState
            r1 = 1
            if (r0 == r1) goto L6
            goto L17
        L6:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r2.mConfigure
            int r0 = r0.mLoaderType
            if (r0 > 0) goto Ld
            goto L17
        Ld:
            java.lang.String r3 = r2.encodeUrl(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L18
        L17:
            return
        L18:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.lock()
            long r0 = r2.mHandle     // Catch: java.lang.UnsatisfiedLinkError -> L22 java.lang.Throwable -> L28
            _p2pPredown(r0, r3)     // Catch: java.lang.UnsatisfiedLinkError -> L22 java.lang.Throwable -> L28
        L22:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.mReadLock
            r3.unlock()
            return
        L28:
            r3 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.unlock()
            throw r3
    }

    public void preConnectByHost(java.lang.String r3, int r4) {
            r2 = this;
            int r0 = r2.mState
            r1 = 1
            if (r0 == r1) goto L6
            return
        L6:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.mWriteLock
            r0.lock()
            long r0 = r2.mHandle     // Catch: java.lang.Throwable -> L16 java.lang.UnsatisfiedLinkError -> L18
            _preConnectByHost(r0, r3, r4)     // Catch: java.lang.Throwable -> L16 java.lang.UnsatisfiedLinkError -> L18
        L10:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r2.mWriteLock
            r3.unlock()
            return
        L16:
            r3 = move-exception
            goto L1d
        L18:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)     // Catch: java.lang.Throwable -> L16
            goto L10
        L1d:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r2.mWriteLock
            r4.unlock()
            throw r3
    }

    public void preloadGroupResource(java.lang.String r8, java.lang.String r9, int r10, int r11) {
            r7 = this;
            int r0 = r7.mState
            r1 = 1
            if (r0 == r1) goto L6
            goto L3a
        L6:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L3a
            if (r11 != 0) goto Lf
            goto L3a
        Lf:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r7.mWriteLock
            r0.lock()
            long r1 = r7.mHandle     // Catch: java.lang.Throwable -> L24 java.lang.UnsatisfiedLinkError -> L27
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L2a
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            _preloadGroupResource(r1, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L24 java.lang.UnsatisfiedLinkError -> L27
            goto L2a
        L24:
            r0 = move-exception
            r8 = r0
            goto L34
        L27:
            r0 = move-exception
            r8 = r0
            goto L30
        L2a:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r8 = r7.mWriteLock
            r8.unlock()
            return
        L30:
            com.bytedance.sdk.component.utils.vl.j(r8)     // Catch: java.lang.Throwable -> L24
            goto L2a
        L34:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r9 = r7.mWriteLock
            r9.unlock()
            throw r8
        L3a:
            return
    }

    public void preloadResource(java.lang.String r6, int r7) {
            r5 = this;
            int r0 = r5.mState
            r1 = 1
            if (r0 == r1) goto L6
            goto L34
        L6:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L34
            if (r7 != 0) goto Lf
            goto L34
        Lf:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.lock()
            long r0 = r5.mHandle     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> L22
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L24
            _preloadResource(r0, r6, r7)     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> L22
            goto L24
        L20:
            r6 = move-exception
            goto L2e
        L22:
            r6 = move-exception
            goto L2a
        L24:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r5.mWriteLock
            r6.unlock()
            return
        L2a:
            com.bytedance.sdk.component.utils.vl.j(r6)     // Catch: java.lang.Throwable -> L20
            goto L24
        L2e:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r7 = r5.mWriteLock
            r7.unlock()
            throw r6
        L34:
            return
    }

    public void preloadResource(java.lang.String r6, int r7, int r8) {
            r5 = this;
            int r0 = r5.mState
            r1 = 1
            if (r0 == r1) goto L6
            goto L34
        L6:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L34
            if (r8 != 0) goto Lf
            goto L34
        Lf:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.lock()
            long r0 = r5.mHandle     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> L22
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L24
            _preloadResourceWithOffset(r0, r6, r7, r8)     // Catch: java.lang.Throwable -> L20 java.lang.UnsatisfiedLinkError -> L22
            goto L24
        L20:
            r6 = move-exception
            goto L2e
        L22:
            r6 = move-exception
            goto L2a
        L24:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r5.mWriteLock
            r6.unlock()
            return
        L2a:
            com.bytedance.sdk.component.utils.vl.j(r6)     // Catch: java.lang.Throwable -> L20
            goto L24
        L2e:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r7 = r5.mWriteLock
            r7.unlock()
            throw r6
        L34:
            return
    }

    public void removeFileCache(java.lang.String r6) {
            r5 = this;
            int r0 = r5.mState
            r1 = 1
            if (r0 == r1) goto L6
            goto Lc
        L6:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto Ld
        Lc:
            return
        Ld:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.lock()
            long r0 = r5.mHandle     // Catch: java.lang.Throwable -> L1e java.lang.UnsatisfiedLinkError -> L20
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L22
            _removeCacheFile(r0, r6)     // Catch: java.lang.Throwable -> L1e java.lang.UnsatisfiedLinkError -> L20
            goto L22
        L1e:
            r6 = move-exception
            goto L2c
        L20:
            r6 = move-exception
            goto L28
        L22:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r5.mWriteLock
            r6.unlock()
            return
        L28:
            com.bytedance.sdk.component.utils.vl.j(r6)     // Catch: java.lang.Throwable -> L1e
            goto L22
        L2c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.unlock()
            throw r6
    }

    public void resumeFileWriteIO() {
            r2 = this;
            int r0 = r2.mState
            r1 = 1
            if (r0 == r1) goto L6
            return
        L6:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.mWriteLock
            r0.lock()
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r2.mConfigure     // Catch: java.lang.Throwable -> L1c java.lang.Throwable -> L1e
            int r0 = r0.mMaxFileMemCacheSize     // Catch: java.lang.Throwable -> L1c java.lang.Throwable -> L1e
            if (r0 <= 0) goto L1e
            long r0 = r2.mHandle     // Catch: java.lang.Throwable -> L1c java.lang.Throwable -> L1e
            _resumeFileWriteIO(r0)     // Catch: java.lang.Throwable -> L1c java.lang.Throwable -> L1e
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r2.mConfigure     // Catch: java.lang.Throwable -> L1c java.lang.Throwable -> L1e
            r1 = 0
            r0.mMaxFileMemCacheSize = r1     // Catch: java.lang.Throwable -> L1c java.lang.Throwable -> L1e
            goto L1e
        L1c:
            r0 = move-exception
            goto L24
        L1e:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.mWriteLock
            r0.unlock()
            return
        L24:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r2.mWriteLock
            r1.unlock()
            throw r0
    }

    public void setBackUpIp(java.lang.String r9, java.lang.String r10) {
            r8 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L20
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto Ld
            goto L20
        Ld:
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r1 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo
            r5 = 0
            r7 = 0
            r2 = 11
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r7)
            com.bykv.vk.component.ttvideo.mediakit.net.IPCache r9 = com.bykv.vk.component.ttvideo.mediakit.net.IPCache.getInstance()
            r9.putBackUpIp(r3, r1)
        L20:
            return
    }

    public void setConfigure(com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r3) {
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.mWriteLock
            r0.lock()
            int r0 = r2.mState     // Catch: java.lang.Throwable -> L10
            r1 = 1
            if (r0 == r1) goto L12
            r2.mConfigure = r3     // Catch: java.lang.Throwable -> L10
            r3.ParseJsonConfig()     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L18
        L12:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r2.mWriteLock
            r3.unlock()
            return
        L18:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.mWriteLock
            r0.unlock()
            throw r3
    }

    public void setEventListener(com.bykv.vk.component.ttvideo.mediakit.medialoader.LoaderListener r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r1.mWriteLock
            r0.lock()
            r1.mEventListener = r2     // Catch: java.lang.Throwable -> Ld
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r1.mWriteLock
            r2.unlock()
            return
        Ld:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r1.mWriteLock
            r0.unlock()
            throw r2
    }

    public void setInt64ValueByStrKey(int r8, java.lang.String r9, long r10) {
            r7 = this;
            int r0 = r7.mState
            r1 = 1
            if (r0 == r1) goto L6
            return
        L6:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r7.mWriteLock
            r0.lock()
            long r1 = r7.mHandle     // Catch: java.lang.Throwable -> L1a java.lang.UnsatisfiedLinkError -> L1d
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L20
            r3 = r8
            r4 = r9
            r5 = r10
            _setInt64ValueByStrKey(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> L1a java.lang.UnsatisfiedLinkError -> L1d
            goto L20
        L1a:
            r0 = move-exception
            r8 = r0
            goto L2a
        L1d:
            r0 = move-exception
            r8 = r0
            goto L26
        L20:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r8 = r7.mWriteLock
            r8.unlock()
            return
        L26:
            com.bytedance.sdk.component.utils.vl.j(r8)     // Catch: java.lang.Throwable -> L1a
            goto L20
        L2a:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r9 = r7.mWriteLock
            r9.unlock()
            throw r8
    }

    public void setIntValue(int r6, int r7) {
            r5 = this;
            int r0 = r5.mState
            r1 = 1
            if (r0 == r1) goto L6
            return
        L6:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.lock()
            long r0 = r5.mHandle     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1b
            _setIntValue(r0, r6, r7)     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            goto L1b
        L17:
            r6 = move-exception
            goto L25
        L19:
            r6 = move-exception
            goto L21
        L1b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r5.mWriteLock
            r6.unlock()
            return
        L21:
            com.bytedance.sdk.component.utils.vl.j(r6)     // Catch: java.lang.Throwable -> L17
            goto L1b
        L25:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r7 = r5.mWriteLock
            r7.unlock()
            throw r6
    }

    public void setListener(int r2, com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener r3) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r1.mWriteLock
            r0.lock()
            r0 = 107(0x6b, float:1.5E-43)
            if (r2 != r0) goto L13
            r1.mLiveListener = r3     // Catch: java.lang.Throwable -> Lc
            goto L13
        Lc:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r1.mWriteLock
            r3.unlock()
            throw r2
        L13:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r1.mWriteLock
            r2.unlock()
            return
    }

    public void setListener(com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r1.mWriteLock
            r0.lock()
            r1.mVodListener = r2     // Catch: java.lang.Throwable -> Ld
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r1.mWriteLock
            r2.unlock()
            return
        Ld:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r1.mWriteLock
            r0.unlock()
            throw r2
    }

    public void setLongValue(int r6, long r7) {
            r5 = this;
            int r0 = r5.mState
            r1 = 1
            if (r0 == r1) goto L6
            return
        L6:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.lock()
            long r0 = r5.mHandle     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1b
            _setInt64Value(r0, r6, r7)     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            goto L1b
        L17:
            r6 = move-exception
            goto L25
        L19:
            r6 = move-exception
            goto L21
        L1b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r5.mWriteLock
            r6.unlock()
            return
        L21:
            com.bytedance.sdk.component.utils.vl.j(r6)     // Catch: java.lang.Throwable -> L17
            goto L1b
        L25:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r7 = r5.mWriteLock
            r7.unlock()
            throw r6
    }

    public void setStartCompleteListener(com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLStartCompleteListener r1) {
            r0 = this;
            r0.mStartCompleteListener = r1
            return
    }

    public void setStringValue(int r6, java.lang.String r7) {
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L7
            goto Lc
        L7:
            int r0 = r5.mState
            r1 = 1
            if (r0 == r1) goto Ld
        Lc:
            return
        Ld:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.lock()
            long r0 = r5.mHandle     // Catch: java.lang.Throwable -> L1e java.lang.UnsatisfiedLinkError -> L20
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L22
            _setStringValue(r0, r6, r7)     // Catch: java.lang.Throwable -> L1e java.lang.UnsatisfiedLinkError -> L20
            goto L22
        L1e:
            r6 = move-exception
            goto L2c
        L20:
            r6 = move-exception
            goto L28
        L22:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r5.mWriteLock
            r6.unlock()
            return
        L28:
            com.bytedance.sdk.component.utils.vl.j(r6)     // Catch: java.lang.Throwable -> L1e
            goto L22
        L2c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r7 = r5.mWriteLock
            r7.unlock()
            throw r6
    }

    public int start() {
            r4 = this;
            int r0 = r4.mState
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L7
            return r2
        L7:
            r4.initNativeHandle()
            com.bytedance.sdk.component.oq.r.cw r0 = new com.bytedance.sdk.component.oq.r.cw
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader$2 r1 = new com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader$2
            r1.<init>(r4)
            java.lang.String r3 = "AVMDLDataLoader"
            r0.<init>(r1, r3)
            r0.start()
            return r2
    }

    public void stop() {
            r5 = this;
            int r0 = r5.mState
            r1 = 1
            if (r0 == r1) goto L6
            return
        L6:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.lock()
            long r0 = r5.mHandle     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1b
            _stop(r0)     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            goto L1b
        L17:
            r0 = move-exception
            goto L25
        L19:
            r0 = move-exception
            goto L21
        L1b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.unlock()
            return
        L21:
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L17
            goto L1b
        L25:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r5.mWriteLock
            r1.unlock()
            throw r0
    }

    public void suspendDownload(java.lang.String r6) {
            r5 = this;
            int r0 = r5.mState
            r1 = 1
            if (r0 == r1) goto L6
            return
        L6:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.lock()
            long r0 = r5.mHandle     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1b
            _suspendedDownload(r0, r6)     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            goto L1b
        L17:
            r6 = move-exception
            goto L25
        L19:
            r6 = move-exception
            goto L21
        L1b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r5.mWriteLock
            r6.unlock()
            return
        L21:
            com.bytedance.sdk.component.utils.vl.j(r6)     // Catch: java.lang.Throwable -> L17
            goto L1b
        L25:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.unlock()
            throw r6
    }

    public void tryToClearCachesByUsedTime(long r6) {
            r5 = this;
            int r0 = r5.mState
            r1 = 1
            if (r0 == r1) goto L6
            return
        L6:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.mWriteLock
            r0.lock()
            long r0 = r5.mHandle     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L19
            _clearCachesByUsedTime(r0, r6)     // Catch: java.lang.Throwable -> L17 java.lang.UnsatisfiedLinkError -> L19
            goto L19
        L17:
            r6 = move-exception
            goto L1f
        L19:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r5.mWriteLock
            r6.unlock()
            return
        L1f:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r7 = r5.mWriteLock
            r7.unlock()
            throw r6
    }

    public void updateDNSInfo(java.lang.String r10, java.lang.String r11, long r12, java.lang.String r14, int r15) {
            r9 = this;
            int r0 = r9.mState
            r1 = 1
            if (r0 == r1) goto L6
            return
        L6:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r9.mWriteLock
            r0.lock()
            long r1 = r9.mHandle     // Catch: java.lang.Throwable -> L1b java.lang.UnsatisfiedLinkError -> L1e
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r14
            r8 = r15
            _updateDNSInfo(r1, r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L1b java.lang.UnsatisfiedLinkError -> L1e
        L15:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r10 = r9.mWriteLock
            r10.unlock()
            return
        L1b:
            r0 = move-exception
            r10 = r0
            goto L24
        L1e:
            r0 = move-exception
            r10 = r0
            com.bytedance.sdk.component.utils.vl.j(r10)     // Catch: java.lang.Throwable -> L1b
            goto L15
        L24:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r11 = r9.mWriteLock
            r11.unlock()
            throw r10
    }
}
