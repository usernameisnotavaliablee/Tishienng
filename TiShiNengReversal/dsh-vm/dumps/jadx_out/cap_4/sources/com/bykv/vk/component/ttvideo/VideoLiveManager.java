package com.bykv.vk.component.ttvideo;

@com.bykv.vk.component.ttvideo.player.Keep
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class VideoLiveManager implements com.bykv.vk.component.ttvideo.ILivePlayer {
    private static final int AUDIOSTREAM = 1;
    private static final int AV_NO_SYNC_THRESHOLD = 10000;
    private static final int BITRATE_ABNORNAL = 1;
    private static final int BITRATE_NORMAL = 0;
    private static final int BOTHSTREAM = 2;
    private static final int CHECK_SEI_INTERVAL = 3000;
    private static final int DEFAULT_RTC_FALLBACK_THRESHOLD = 5000;
    private static final int DEFAULT_RTC_MIN_JITTER_BUFFER = 300;
    private static final java.lang.String HTTP_FLV_ABR_PREFIX = "mem://llash/";
    private static final int INIT_MTU = 1200;
    public static final int KeyIsGetSeiDelay = 100;
    public static final int KeyIsGetStreamMaxBitrate = 0;
    private static final int LIVE_ABR_CHECK_DEFAULT_INTERVAL = 1000;
    private static final int MEDIA_PLAYER_OPTION_SET_LIVE_PROTOCOL_HANDLE = 501;
    private static final int MSG_SEI_CHECK = 110;
    private static final int NOTIFY_ALL_SEI_THRESHOLD = 1000;
    private static final java.lang.String RTC_LOG_PREFIX = "rtc_log_level";
    private static final int RTC_VENDER_TYPE_ALIBABA = 1;
    private static final int RTC_VENDER_TYPE_BYTE = 0;
    private static final int RTC_VENDER_TYPE_OTHERS = 3;
    private static final int RTC_VENDER_TYPE_TECENT = 2;
    private static final java.lang.String SEI_PREFIX = "JSON";
    private static final int STALL_RECOVER_FROM_BUFFERINGEND = 1;
    private static final int STALL_RECOVER_FROM_RETRY = 2;
    private static final int STALl_NO_RECOVER = 0;
    private static final java.lang.String TAG = "VideoLiveManager";
    public static final int TEX_LIVE = 1;
    public static final int TEX_VOD = 0;
    private static final int VIDEOSTREAM = 0;
    private static int mAudioRenderStallThreshold = 200;
    private static int mDecoderStallThreshold = 600;
    private static int mDemuxerStallThreshold = 900;
    private static int mFastOpenDuration = -1;
    private static boolean mIsSettingsUpdate = false;
    private static org.json.JSONObject mSettingsInfo = null;
    private static int mVideoRenderStallThreshold = 500;
    private int mABRBufferThreshold;
    private int mABRDisableAlgorithm;
    private int mABRMethod;
    private long mALogWriteAddr;
    private int mAVNoSyncThreshold;
    private int mAVPHAudioMaxDuration;
    private int mAVPHAudioProbesize;
    private int mAVPHAutoExit;
    private int mAVPHDnsParseEnable;
    private int mAVPHDnsTimeout;
    private int mAVPHEnableAutoReopen;
    private int mAVPHMaxAVDiff;
    private int mAVPHOpenVideoFirst;
    private int mAVPHReadErrorExit;
    private int mAVPHReadRetryCount;
    private int mAVPHVideoDiffThreshold;
    private int mAVPHVideoMaxDuration;
    private int mAVPHVideoProbesize;
    private java.lang.String mAbrStrategy;
    private long mAudioLastRenderTime;
    private java.lang.String mAudioOnly;
    private int mAudioTimescaleEnable;
    private float mAudioVolumeBalancePredelay;
    private float mAudioVolumeBalancePregain;
    private float mAudioVolumeBalanceRatio;
    private float mAudioVolumeBalanceThreshold;
    private int mBufferDataSeconds;
    private int mBufferTimeout;
    private int mByteVC1DecoderType;
    private int mCacheFileEnable;
    private java.lang.String mCacheFileKey;
    private java.lang.String mCacheFilePath;
    private boolean mCancelSDKDNSFailRetry;
    private float mCatchSpeed;
    private java.lang.String mCdnAbrResolution;
    private java.lang.String mCdnSessionPath;
    private int mCheckBufferingEndAdvanceEnable;
    private int mCheckBufferingEndIgnoreVideo;
    public boolean mCheckSupportSR;
    private boolean mCmafEnable;
    private final android.content.Context mContext;
    private java.lang.String mCurrentIP;
    private java.lang.String mCurrentPlayURL;
    private int mCurrentRetryCount;
    private int mDefaultCodecId;
    private int mDefaultResBitrate;
    private final com.bykv.vk.component.ttvideo.network.DnsHelper mDnsParser;
    private int mEnableAbrStallDegradeImmediately;
    private int mEnableAudioVolumeBalance;
    private java.lang.String mEnableAvLines;
    private int mEnableByteVC1HardwareDecode;
    private int mEnableCacheSei;
    private int mEnableCheckDropAudio;
    private int mEnableCheckFrame;
    private int mEnableCheckPacketCorrupt;
    private int mEnableCheckSEI;
    private int mEnableClosePlayRetry;
    private int mEnableCmafFastMode;
    private int mEnableCmafOptimizeRetry;
    private int mEnableDTSCheck;
    private int mEnableDecodeMultiSei;
    private int mEnableDecodeSeiOnce;
    private int mEnableDecoderStall;
    private int mEnableDemuxerStall;
    private boolean mEnableDns;
    private boolean mEnableDnsOptimizer;
    private int mEnableDroppingDTSRollFrame;
    private int mEnableFastOpenStream;
    private int mEnableFlvABR;
    private int mEnableFreeFlow;
    private int mEnableH264HardwareDecode;
    private int mEnableHttpPrepare;
    private int mEnableHttpkDegrade;
    private int mEnableHurryFlag;
    private int mEnableLLASHFastOpen;
    private int mEnableLiveAbrCheckEnhance;
    private int mEnableLiveIOP2P;
    private int mEnableLiveIOPlay;
    private int mEnableLowLatencyFLV;
    private int mEnableMediaCodecASYNCInit;
    private int mEnableNTP;
    private int mEnableNTPTask;
    private int mEnableNotifySeiImmediatelyBeforeFirstFrame;
    private int mEnableOpenLiveIO;
    private int mEnableOpenMDL;
    private int mEnableOptimizeBackup;
    private boolean mEnableOriginResolution;
    private int mEnableP2pUp;
    private int mEnablePreventDTSBack;
    private boolean mEnableQuicCertVerify;
    private int mEnableQuicDegrade;
    private int mEnableQuicMTUDiscovery;
    public int mEnableRadioLiveDisableRender;
    private int mEnableRenderStall;
    private int mEnableReportSessionStop;
    private boolean mEnableResolutionAutoDegrade;
    private int mEnableRtcPlay;
    private boolean mEnableSaveSCFG;
    private boolean mEnableSeiCheck;
    private int mEnableSharp;
    public int mEnableSharpen;
    private int mEnableSkipFindUnnecessaryStream;
    private int mEnableSkipFlvNullTag;
    private int mEnableSplitStream;
    private int mEnableStallCounter;
    private int mEnableStallRetryInstantly;
    private boolean mEnableSwitchMainAndBackupUrl;
    private int mEnableTcpFastOpen;
    private int mEnableTextureRender;
    private int mEnableTextureSR;
    private int mEnableUploadSei;
    private boolean mEnableUploadSessionSeries;
    private int mEnableUseLiveThreadPool;
    private int mEnableVideoMpdRefresh;
    private int mEnhancementType;
    private boolean mEnterStallRetryInstantly;
    private java.util.concurrent.ExecutorService mExecutor;
    private com.bykv.vk.component.ttvideo.network.LiveDataFetcher mFetcher;
    private int mForceDecodeMsGaps;
    private int mForceDecodeSwitch;
    private boolean mForceHttpDns;
    private int mForceRenderMsGaps;
    private long mFrameDroppingDTSMaxDiff;
    private java.lang.Object mFrameMetaDataListener;
    private long mFrameTerminatedDTS;
    private int mFramesDrop;
    private long mGetSeiCurrentTime;
    private int mGopDuration;
    private int mHardwareDecodeEnable;
    private int mHardwareRTCDecodeEnable;
    private boolean mHasAbrInfo;
    private boolean mHasRetry;
    private boolean mHasSeiInfo;
    private int mHlsLiveStartIndex;
    private java.lang.String mHttpDNSServerHost;
    private int mHurryTime;
    private int mHurryType;
    private com.bykv.vk.component.ttvideo.MyInvocationHandler mInvocationHandler;
    private int mIsAlwaysDoAVSync;
    private boolean mIsCacheHasComplete;
    private int mIsInMainLooper;
    private boolean mIsLiveIOProtoRegister;
    private boolean mIsLocalURL;
    private boolean mIsMdlProtoRegister;
    private boolean mIsPlayWithLiveIO;
    private boolean mIsPlayWithMdl;
    private boolean mIsRequestCanceled;
    private boolean mIsRetrying;
    private boolean mIsStalling;
    private long mLatestAudioPacketDTS;
    private int mLayoutType;
    private java.lang.String mLevel;
    private final com.bykv.vk.component.ttvideo.ILiveListener mListener;
    private int mLiveABRCheckInterval;
    private int mLiveIOABGroupID;
    private com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState mLivePlayerState;
    private java.lang.String mLocalURL;
    private com.bykv.vk.component.ttvideo.log.LiveLoggerService mLogService;
    private boolean mLooping;
    private org.json.JSONObject mLowLatencyFLVStrategy;
    private int mMaxCacheSeconds;
    private int mMaxFileCacheSize;
    private int mMaxTextureHeight;
    private int mMaxTextureWidth;
    public boolean mMediaSupportSR;
    private boolean mMediaSupportSharpen;
    private java.lang.String mMoudleIDToB;
    private final android.os.Handler mMyHandler;
    private final com.bykv.vk.component.ttvideo.INetworkClient mNetworkClient;
    private int mNetworkTimeout;
    private int mNoSyncReportMinDuration;
    private int mNoSyncReportReportThres;
    private java.util.List<java.lang.String> mNodeOptimizeResults;
    private int mOpenCheckSideData;
    private com.bykv.vk.component.ttvideo.player.MediaPlayer mPlayer;
    private int mPlayerCache;
    private int mPlayerDegradeMode;
    private final com.bykv.vk.component.ttvideo.playerwrapper.PlayerSetting mPlayerSetting;
    private final int mPlayerType;
    private com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState mPrepareState;
    private int mQuicConfigOptimize;
    private boolean mQuicEnable;
    private int mQuicFixProcessTimer;
    private int mQuicFixStreamFinAndRst;
    private int mQuicFixWillingAndAbleToWrite;
    private int mQuicInitMTU;
    private int mQuicInitRtt;
    private int mQuicMaxAckDelay;
    private int mQuicMaxCryptoRetransmissionTimeMs;
    private int mQuicMaxCryptoRetransmissions;
    private int mQuicMaxRetransmissionTimeMs;
    private int mQuicMaxRetransmissions;
    private int mQuicMinReceivedBeforeAckDecimation;
    private int mQuicPadHello;
    private boolean mQuicPull;
    private int mQuicReadBlockMode;
    private int mQuicReadBlockTimeout;
    private int mQuicTimerVersion;
    private int mQuicVersion;
    private boolean mRedoDns;
    private java.lang.String mReliable;
    public boolean mRenderStartEntered;
    public long mRenderStartNotifyTimeStamp;
    private int mRenderType;
    private java.lang.String mResolution;
    private boolean mResolutionDisableSR;
    private int mResolutionIndex;
    private final com.bykv.vk.component.ttvideo.retry.RetryProcessor mRetryProcessor;
    private long mRetryStartTime;
    private int mRtcEarlyInitRender;
    private int mRtcEnableDtls;
    private int mRtcEnableRtcUninitLockFree;
    private int mRtcEnableSDKDns;
    private int mRtcFallbackThreshold;
    private int mRtcMaxJitterBuffer;
    private int mRtcMaxRetryCount;
    private int mRtcMinJitterBuffer;
    private int mRtcPlayFallBack;
    private int mRtcPlayLogInterval;
    private int mRtcSupportMiniSdp;
    private int mScaleType;
    private long mSeiDiffThres;
    private java.lang.String mSessionId;
    private int mSessionNum;
    private int mSessionReceiveWindow;
    private long mSessionRenderStartTime;
    private long mSessionStartTime;
    private final com.bykv.vk.component.ttvideo.ILiveSettingBundle mSettingsBundle;
    private float mSharpenAmount;
    private float mSharpenEdgeWeightGamma;
    private int mSharpenMaxHeight;
    private int mSharpenMaxWidth;
    private int mSharpenMode;
    private float mSharpenOverRatio;
    private int mSharpenPowerLevel;
    private int mSharpenSceneMode;
    private org.json.JSONObject mSharpenSdkParams;
    private boolean mShowedFirstFrame;
    private float mSlowPlaySpeed;
    private int mSlowPlayTime;
    private int mStallCount;
    private int mStallCountThresOfResolutionDegrade;
    private android.os.Handler mStallCounterHandler;
    private int mStallCounterInterval;
    private volatile boolean mStallCounterIsRunning;
    private final java.lang.Object mStallCounterLock;
    private android.os.HandlerThread mStallCounterThread;
    public long mStallRetryTimeIntervalManager;
    private long mStallStartTime;
    private long mStallTotalTime;
    private int mStartDirectAfterPrepared;
    private long mStartPlayBufferThres;
    private java.lang.String mStreamFormat;
    private int mStreamReceiveWindow;
    private java.lang.String mSuggestProtocol;
    private boolean mSupportBackupIp;
    public int mSupportSRScene;
    private int mSupportSharpenScene;
    private android.view.Surface mSurface;
    private android.view.SurfaceHolder mSurfaceHolder;
    private int mSwitchToB;
    private long mTargetOriginBitRate;
    private int mTestAction;
    private java.lang.String mTextureRenderErrorMsg;
    private boolean mTextureRenderFirstFrame;
    private java.lang.String mTextureSRBinPath;
    private java.lang.String mTextureSRDspModuleName;
    public int mTextureSRMode;
    private java.lang.String mTextureSROclModuleName;
    private java.lang.String mTransportProtocol;
    private int mTslMinTimeShit;
    private int mTslTimeShift;
    private int mURLAbility;
    private java.lang.String mURLHost;
    private java.lang.String mURLProtocol;
    private final com.bykv.vk.component.ttvideo.model.LiveInfoSource mURLSource;
    private int mUrlSettingMethod;
    private int mUseExternalDir;
    private boolean mUsePlayerRenderStart;
    private boolean mUserSwitchResoultion;
    private java.lang.String mUuid;
    private long mVideoLastRenderTime;
    private java.lang.String mVideoOnly;
    private final com.bykv.vk.component.ttvideo.VideoLiveManager.VideoStallCountTask mVideoStallCountTask;




    @com.bykv.vk.component.ttvideo.player.Keep
    public static final class Builder {
        final android.content.Context mContext;
        boolean mEnableResolutionAutoDegrade;
        boolean mEnableSwitchMainAndBackupUrl;
        boolean mForceHttpDns;
        boolean mForceTTNetHttpDns;
        com.bykv.vk.component.ttvideo.ILiveListener mListener;
        public java.util.concurrent.ExecutorService mLiveThreadPool;
        com.bykv.vk.component.ttvideo.INetworkClient mNetworkClient;
        int mPlayerType;
        java.lang.String mProjectKey;
        public long mRTCUploadLogInterval;
        java.lang.String mResolution;
        int mRetryTimeout;
        public long mSeiCheckTimeOut;
        com.bykv.vk.component.ttvideo.ILiveSettingBundle mSettingsBundle;
        public long mStallRetryTimeInterval;
        public long mUploadLogInterval;
        java.lang.String mVideoFormat;

        private Builder(android.content.Context r4) {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.mForceHttpDns = r0
                r3.mForceTTNetHttpDns = r0
                r1 = 60000(0xea60, float:8.4078E-41)
                r3.mRetryTimeout = r1
                r1 = 1
                r3.mPlayerType = r1
                java.lang.String r2 = "origin"
                r3.mResolution = r2
                java.lang.String r2 = "flv"
                r3.mVideoFormat = r2
                r3.mEnableResolutionAutoDegrade = r0
                r3.mEnableSwitchMainAndBackupUrl = r1
                r0 = 10000(0x2710, double:4.9407E-320)
                r3.mStallRetryTimeInterval = r0
                r0 = 60000(0xea60, double:2.9644E-319)
                r3.mUploadLogInterval = r0
                r0 = 5000(0x1388, double:2.4703E-320)
                r3.mRTCUploadLogInterval = r0
                r0 = 8000(0x1f40, double:3.9525E-320)
                r3.mSeiCheckTimeOut = r0
                r0 = 0
                r3.mLiveThreadPool = r0
                r3.mContext = r4
                return
        }

        /* synthetic */ Builder(android.content.Context r1, com.bykv.vk.component.ttvideo.VideoLiveManager.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public com.bykv.vk.component.ttvideo.VideoLiveManager build() {
                r2 = this;
                android.content.Context r0 = r2.mContext
                if (r0 == 0) goto L23
                com.bykv.vk.component.ttvideo.ILiveListener r0 = r2.mListener
                if (r0 == 0) goto L1b
                com.bykv.vk.component.ttvideo.INetworkClient r0 = r2.mNetworkClient
                if (r0 == 0) goto L13
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = new com.bykv.vk.component.ttvideo.VideoLiveManager
                r1 = 0
                r0.<init>(r2, r1)
                return r0
            L13:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "mNetworkClient should not be null"
                r0.<init>(r1)
                throw r0
            L1b:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "mListener should not be null"
                r0.<init>(r1)
                throw r0
            L23:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "mContext should not be null"
                r0.<init>(r1)
                throw r0
        }

        public com.bykv.vk.component.ttvideo.VideoLiveManager.Builder setCustomThreadPool(java.util.concurrent.ExecutorService r3) {
                r2 = this;
                java.lang.String r0 = "setCustomThreadPool: "
                java.lang.String r1 = java.lang.String.valueOf(r3)
                java.lang.String r0 = r0.concat(r1)
                java.lang.String r1 = "VideoLiveManager"
                com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r0)
                r2.mLiveThreadPool = r3
                return r2
        }

        public com.bykv.vk.component.ttvideo.VideoLiveManager.Builder setEnableResolutionAutoDegrade(boolean r1) {
                r0 = this;
                r0.mEnableResolutionAutoDegrade = r1
                return r0
        }

        public com.bykv.vk.component.ttvideo.VideoLiveManager.Builder setEnableSwitchMainAndBackUpURL(boolean r1) {
                r0 = this;
                r0.mEnableSwitchMainAndBackupUrl = r1
                return r0
        }

        public com.bykv.vk.component.ttvideo.VideoLiveManager.Builder setForceHttpDns(boolean r1) {
                r0 = this;
                r0.mForceHttpDns = r1
                return r0
        }

        public com.bykv.vk.component.ttvideo.VideoLiveManager.Builder setForceTTNetHttpDns(boolean r1) {
                r0 = this;
                r0.mForceTTNetHttpDns = r1
                return r0
        }

        public com.bykv.vk.component.ttvideo.VideoLiveManager.Builder setListener(com.bykv.vk.component.ttvideo.ILiveListener r1) {
                r0 = this;
                r0.mListener = r1
                return r0
        }

        public com.bykv.vk.component.ttvideo.VideoLiveManager.Builder setNetworkClient(com.bykv.vk.component.ttvideo.INetworkClient r1) {
                r0 = this;
                r0.mNetworkClient = r1
                return r0
        }

        public com.bykv.vk.component.ttvideo.VideoLiveManager.Builder setPlayerType(int r1) {
                r0 = this;
                r0.mPlayerType = r1
                return r0
        }

        public com.bykv.vk.component.ttvideo.VideoLiveManager.Builder setProjectKey(java.lang.String r1) {
                r0 = this;
                r0.mProjectKey = r1
                return r0
        }

        public com.bykv.vk.component.ttvideo.VideoLiveManager.Builder setResolution(java.lang.String r1) {
                r0 = this;
                r0.mResolution = r1
                return r0
        }

        public com.bykv.vk.component.ttvideo.VideoLiveManager.Builder setRetryTimeout(int r1) {
                r0 = this;
                r0.mRetryTimeout = r1
                return r0
        }

        public com.bykv.vk.component.ttvideo.VideoLiveManager.Builder setSeiCheckTimeOut(long r1) {
                r0 = this;
                r0.mSeiCheckTimeOut = r1
                return r0
        }

        public com.bykv.vk.component.ttvideo.VideoLiveManager.Builder setSettingsBundle(com.bykv.vk.component.ttvideo.ILiveSettingBundle r1) {
                r0 = this;
                r0.mSettingsBundle = r1
                return r0
        }

        public com.bykv.vk.component.ttvideo.VideoLiveManager.Builder setStallRetryInterval(long r1) {
                r0 = this;
                r0.mStallRetryTimeInterval = r1
                return r0
        }

        public com.bykv.vk.component.ttvideo.VideoLiveManager.Builder setVideoFormat(java.lang.String r1) {
                r0 = this;
                r0.mVideoFormat = r1
                return r0
        }
    }

    private enum LivePlayerState extends java.lang.Enum<com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState> {
        private static final /* synthetic */ com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState[] $VALUES = null;
        public static final com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState IDLE = null;
        public static final com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState PAUSED = null;
        public static final com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState PLAYED = null;
        public static final com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState STOPPED = null;

        static {
                com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r0 = new com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState
                java.lang.String r1 = "IDLE"
                r2 = 0
                r0.<init>(r1, r2)
                com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.IDLE = r0
                com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r1 = new com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState
                java.lang.String r3 = "PLAYED"
                r4 = 1
                r1.<init>(r3, r4)
                com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.PLAYED = r1
                com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r3 = new com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState
                java.lang.String r5 = "PAUSED"
                r6 = 2
                r3.<init>(r5, r6)
                com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.PAUSED = r3
                com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r5 = new com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState
                java.lang.String r7 = "STOPPED"
                r8 = 3
                r5.<init>(r7, r8)
                com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.STOPPED = r5
                r7 = 4
                com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState[] r7 = new com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.$VALUES = r7
                return
        }

        LivePlayerState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState valueOf(java.lang.String r1) {
                java.lang.Class<com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState> r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r1 = (com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState) r1
                return r1
        }

        public static com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState[] values() {
                com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState[] r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState[] r0 = (com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState[]) r0
                return r0
        }
    }

    private static final class MyCompletionListener implements com.bykv.vk.component.ttvideo.player.MediaPlayer.OnCompletionListener {
        private final java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> mVideoLiveManagerRef;

        public MyCompletionListener(com.bykv.vk.component.ttvideo.VideoLiveManager r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mVideoLiveManagerRef = r0
                return
        }

        @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer.OnCompletionListener
        public void onCompletion(com.bykv.vk.component.ttvideo.player.MediaPlayer r5) {
                r4 = this;
                java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> r5 = r4.mVideoLiveManagerRef
                java.lang.Object r5 = r5.get()
                com.bykv.vk.component.ttvideo.VideoLiveManager r5 = (com.bykv.vk.component.ttvideo.VideoLiveManager) r5
                if (r5 == 0) goto La9
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r5)
                if (r0 != 0) goto L12
                goto La9
            L12:
                java.lang.String r0 = "VideoLiveManager"
                java.lang.String r1 = "onCompletion"
                com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r1)
                com.bykv.vk.component.ttvideo.ILiveListener r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1500(r5)
                r0.onCompletion()
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r5)
                r1 = -100009(0xfffffffffffe7957, float:NaN)
                r0.onPrepare(r1)
                r0 = 0
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$5602(r5, r0)
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1600(r5)
                if (r0 == 0) goto L36
                goto La9
            L36:
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2300(r5)
                if (r0 == 0) goto L4e
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r5)
                int r0 = r0.getSourceType()
                r2 = 2
                if (r0 != r2) goto L4e
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2500(r5, r1)
                if (r0 == 0) goto L4e
                goto La9
            L4e:
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r5)
                int r0 = r0.getSourceType()
                r2 = 1
                if (r0 != r2) goto L60
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2600(r5, r1)
                if (r0 == 0) goto L60
                goto La9
            L60:
                int r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$5700(r5)
                if (r0 != r2) goto L92
                com.bykv.vk.component.ttvideo.ILiveListener r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1500(r5)
                r0.onCacheFileCompletion()
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$5802(r5, r2)
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$5900(r5)
                if (r0 == 0) goto La9
                java.lang.String r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$6000(r5)
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto La9
                java.lang.String r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$6000(r5)
                r5.setLocalURL(r0)
                r5.setLooping(r2)
                java.lang.String r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$6000(r5)
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$6100(r5, r0)
                return
            L92:
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                com.bykv.vk.component.ttvideo.log.LiveError r2 = new com.bykv.vk.component.ttvideo.log.LiveError
                java.lang.String r3 = "live stream dry up, push stream may occur error"
                r2.<init>(r1, r3, r0)
                com.bykv.vk.component.ttvideo.retry.RetryProcessor r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$900(r5)
                boolean r5 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$800(r5)
                r0.onError(r2, r5)
            La9:
                return
        }
    }

    private static final class MyErrorListener implements com.bykv.vk.component.ttvideo.player.MediaPlayer.OnErrorListener {
        private final java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> mVideoLiveManagerRef;

        public MyErrorListener(com.bykv.vk.component.ttvideo.VideoLiveManager r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mVideoLiveManagerRef = r0
                return
        }

        @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer.OnErrorListener
        public boolean onError(com.bykv.vk.component.ttvideo.player.MediaPlayer r7, int r8, int r9) {
                r6 = this;
                java.lang.String r0 = "onError "
                java.lang.String r1 = java.lang.String.valueOf(r8)
                java.lang.String r0 = r0.concat(r1)
                java.lang.String r1 = "VideoLiveManager"
                com.bykv.vk.component.ttvideo.log.MyLog.e(r1, r0)
                java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> r0 = r6.mVideoLiveManagerRef
                java.lang.Object r0 = r0.get()
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = (com.bykv.vk.component.ttvideo.VideoLiveManager) r0
                r1 = 0
                if (r0 == 0) goto Lc8
                com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r0)
                if (r2 != 0) goto L22
                goto Lc8
            L22:
                if (r8 == 0) goto L2b
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r0)
                r2.onPrepare(r8)
            L2b:
                com.bykv.vk.component.ttvideo.log.LiveError r2 = new com.bykv.vk.component.ttvideo.log.LiveError
                r3 = 0
                java.lang.String r4 = "player on error"
                r2.<init>(r8, r4, r3)
                com.bykv.vk.component.ttvideo.ILiveListener r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1500(r0)
                r3.onError(r2)
                boolean r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1600(r0)
                r3 = 1
                if (r2 == 0) goto L42
                return r3
            L42:
                int r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1700(r0)
                if (r2 != r3) goto L4f
                boolean r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1800(r0, r8)
                if (r2 == 0) goto L4f
                return r3
            L4f:
                int r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1900(r0)
                if (r2 != r3) goto L5c
                boolean r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2000(r0, r8)
                if (r2 == 0) goto L5c
                return r3
            L5c:
                int r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2100(r0)
                if (r2 != r3) goto L68
                int r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2200(r0)
                if (r2 == 0) goto L80
            L68:
                boolean r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2300(r0)
                if (r2 == 0) goto L80
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r0)
                int r2 = r2.getSourceType()
                r5 = 2
                if (r2 != r5) goto L80
                boolean r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2500(r0, r8)
                if (r2 == 0) goto L80
                return r3
            L80:
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r0)
                int r2 = r2.getSourceType()
                if (r2 != r3) goto L91
                boolean r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2600(r0, r8)
                if (r2 == 0) goto L91
                return r3
            L91:
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                java.lang.String r3 = "internalCode"
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r2.put(r3, r8)
                java.lang.String r8 = "internalExtra"
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r2.put(r8, r9)
                int r7 = r7.getPlayerType()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                java.lang.String r8 = "playerType"
                r2.put(r8, r7)
                com.bykv.vk.component.ttvideo.log.LiveError r7 = new com.bykv.vk.component.ttvideo.log.LiveError
                r8 = -100003(0xfffffffffffe795d, float:NaN)
                r7.<init>(r8, r4, r2)
                com.bykv.vk.component.ttvideo.retry.RetryProcessor r8 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$900(r0)
                boolean r9 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$800(r0)
                r8.onError(r7, r9)
            Lc8:
                return r1
        }
    }

    private static final class MyFetcherCompletionListener implements com.bykv.vk.component.ttvideo.network.LiveDataFetcher.OnCompletionListener {
        private final java.lang.String mLiveInfoAPI;
        private final java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> mVideoLiveManagerRef;



        public MyFetcherCompletionListener(com.bykv.vk.component.ttvideo.VideoLiveManager r2, java.lang.String r3) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mVideoLiveManagerRef = r0
                r1.mLiveInfoAPI = r3
                return
        }

        static /* synthetic */ java.lang.String access$7100(com.bykv.vk.component.ttvideo.VideoLiveManager.MyFetcherCompletionListener r0) {
                java.lang.String r0 = r0.mLiveInfoAPI
                return r0
        }

        @Override // com.bykv.vk.component.ttvideo.network.LiveDataFetcher.OnCompletionListener
        public void onCompletion(com.bykv.vk.component.ttvideo.model.LiveStreamInfo r3) {
                r2 = this;
                java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> r0 = r2.mVideoLiveManagerRef
                java.lang.Object r0 = r0.get()
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = (com.bykv.vk.component.ttvideo.VideoLiveManager) r0
                if (r0 != 0) goto Lb
                return
            Lb:
                com.bykv.vk.component.ttvideo.VideoLiveManager$MyFetcherCompletionListener$1 r1 = new com.bykv.vk.component.ttvideo.VideoLiveManager$MyFetcherCompletionListener$1
                r1.<init>(r2, r0, r3)
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$7200(r0, r1)
                return
        }

        @Override // com.bykv.vk.component.ttvideo.network.LiveDataFetcher.OnCompletionListener
        public void onError(com.bykv.vk.component.ttvideo.log.LiveError r3) {
                r2 = this;
                java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> r0 = r2.mVideoLiveManagerRef
                java.lang.Object r0 = r0.get()
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = (com.bykv.vk.component.ttvideo.VideoLiveManager) r0
                if (r0 != 0) goto Lb
                return
            Lb:
                com.bykv.vk.component.ttvideo.VideoLiveManager$MyFetcherCompletionListener$2 r1 = new com.bykv.vk.component.ttvideo.VideoLiveManager$MyFetcherCompletionListener$2
                r1.<init>(r2, r0, r3)
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$7200(r0, r1)
                return
        }
    }

    private static final class MyInfoListener implements com.bykv.vk.component.ttvideo.player.MediaPlayer.OnInfoListener {
        private final java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> mVideoLiveManagerRef;

        public MyInfoListener(com.bykv.vk.component.ttvideo.VideoLiveManager r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mVideoLiveManagerRef = r0
                return
        }

        @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer.OnInfoListener
        public boolean onInfo(com.bykv.vk.component.ttvideo.player.MediaPlayer r20, int r21, int r22) {
                r19 = this;
                r0 = r21
                r1 = r19
                r2 = r22
                java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> r3 = r1.mVideoLiveManagerRef
                java.lang.Object r3 = r3.get()
                com.bykv.vk.component.ttvideo.VideoLiveManager r3 = (com.bykv.vk.component.ttvideo.VideoLiveManager) r3
                r4 = 0
                if (r3 == 0) goto L645
                com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                if (r5 != 0) goto L19
                goto L645
            L19:
                r5 = -268435437(0xfffffffff0000013, float:-1.5845668E29)
                if (r0 == r5) goto L63d
                r5 = 3
                java.lang.String r6 = "VideoLiveManager"
                r7 = 2
                r8 = -1
                r11 = 1
                if (r0 == r5) goto L492
                r5 = 251658247(0xf000007, float:6.3108925E-30)
                java.lang.String r12 = ":"
                java.lang.String r13 = ","
                if (r0 == r5) goto L45c
                r5 = 701(0x2bd, float:9.82E-43)
                java.lang.String r14 = "abr_bb_4live"
                r9 = -1
                if (r0 == r5) goto L391
                r5 = 702(0x2be, float:9.84E-43)
                if (r0 == r5) goto L331
                switch(r0) {
                    case -268435442: goto L323;
                    case -268435441: goto L315;
                    case -268435440: goto L307;
                    case -268435439: goto L2f9;
                    default: goto L3e;
                }
            L3e:
                switch(r0) {
                    case -268435424: goto L2ea;
                    case -268435423: goto L2db;
                    default: goto L41;
                }
            L41:
                switch(r0) {
                    case -268435407: goto L2c5;
                    case -268435406: goto L1be;
                    default: goto L44;
                }
            L44:
                switch(r0) {
                    case 251658249: goto La8;
                    case 251658250: goto L91;
                    case 251658251: goto L7a;
                    case 251658252: goto L54;
                    case 251658253: goto L49;
                    default: goto L47;
                }
            L47:
                goto L645
            L49:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                int r2 = r0.mSilenceDetectedCount
                int r2 = r2 + r11
                r0.mSilenceDetectedCount = r2
                goto L645
            L54:
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                if (r0 != 0) goto L5b
                return r4
            L5b:
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                r2 = 628(0x274, float:8.8E-43)
                long r9 = r0.getLongOption(r2, r9)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                r0.onAudioRenderStart(r9)
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                r2 = 62
                int r0 = r0.getIntOption(r2, r8)
                if (r0 != 0) goto L645
                goto L492
            L7a:
                com.bykv.vk.component.ttvideo.ILiveListener r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1500(r3)
                r0.onVideoRenderStall(r2)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                long r6 = (long) r2
                int r8 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$3800()
                r9 = 1
                r10 = 1
                r5.onRenderStall(r6, r8, r9, r10)
                goto L645
            L91:
                com.bykv.vk.component.ttvideo.ILiveListener r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1500(r3)
                r0.onAudioRenderStall(r2)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                long r6 = (long) r2
                int r8 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$3900()
                r9 = 0
                r10 = 1
                r5.onRenderStall(r6, r8, r9, r10)
                goto L645
            La8:
                int r0 = r2 / 1000
                boolean r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4500(r3)
                if (r2 == 0) goto L645
                java.lang.String r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4600(r3)
                boolean r2 = r2.equals(r14)
                if (r2 == 0) goto L645
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r3)
                int r2 = r2.getSourceType()
                if (r2 != r7) goto L645
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r3)
                long r5 = (long) r0
                java.lang.String r7 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$5300(r3)
                java.lang.String r2 = r2.getLabelfromBitrate(r5, r7)
                boolean r7 = android.text.TextUtils.isEmpty(r2)
                r17 = 1000(0x3e8, double:4.94E-321)
                if (r7 == 0) goto Led
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r7 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                int r7 = r7.mBitRateAbnormalType
                if (r7 != r11) goto Led
                long r7 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$5400(r3)
                long r7 = r7 / r17
                int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r14 != 0) goto Led
                java.lang.String r2 = "origin"
            Led:
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r7 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r3)
                java.lang.String r7 = r7.getDefaultResolution()
                if (r7 == 0) goto L645
                boolean r7 = r7.equals(r2)
                if (r7 != 0) goto L645
                if (r2 == 0) goto L131
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r7 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                java.lang.String r14 = "abr_"
                r8.<init>(r14)
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r14 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r3)
                java.lang.String r14 = r14.getDefaultResolution()
                r8.append(r14)
                java.lang.String r14 = "_to_"
                r8.append(r14)
                r8.append(r2)
                java.lang.String r8 = r8.toString()
                r7.mAbrSwitchInfo = r8
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r7 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r3)
                r7.setDefaultResolution(r2)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r7 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                r7.mAutoUsingResolution = r2
                goto L139
            L131:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r7 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                java.lang.String r8 = "none"
                r7.mAbrSwitchInfo = r8
            L139:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r7 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                int r8 = r7.mAbrSwitchCount
                int r8 = r8 + r11
                r7.mAbrSwitchCount = r8
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r8 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                java.lang.String r14 = r8.mAbrSwitchCountInfo
                r7.append(r14)
                r7.append(r13)
                r7.append(r0)
                r7.append(r12)
                long r12 = java.lang.System.currentTimeMillis()
                r7.append(r12)
                java.lang.String r0 = r7.toString()
                r8.mAbrSwitchCountInfo = r0
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                com.bykv.vk.component.ttvideo.player.MediaPlayer r7 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                r8 = 63
                r12 = 0
                long r7 = r7.getLongOption(r8, r12)
                r14 = 8
                long r7 = r7 * r14
                long r7 = r7 / r17
                r0.mCurDownloadSpeed = r7
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                com.bykv.vk.component.ttvideo.player.MediaPlayer r7 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                r8 = 73
                long r7 = r7.getLongOption(r8, r12)
                r0.mCurAudioBufferTime = r7
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                com.bykv.vk.component.ttvideo.player.MediaPlayer r7 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                r8 = 72
                long r7 = r7.getLongOption(r8, r12)
                r0.mCurVideoBufferTime = r7
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                com.bykv.vk.component.ttvideo.player.MediaPlayer r7 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                r8 = 930(0x3a2, float:1.303E-42)
                long r7 = r7.getLongOption(r8, r9)
                r0.mAbrSwitchCost = r7
                com.bykv.vk.component.ttvideo.ILiveListener r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1500(r3)
                r0.onAbrSwitch(r2)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                r0.onAbrSwitch(r5, r2, r11)
                goto L645
            L1be:
                java.lang.System.currentTimeMillis()
                long r5 = java.lang.System.currentTimeMillis()
                long r7 = (long) r2
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                long r9 = r0.mNoSyncStartPts
                long r7 = r7 - r9
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                long r9 = r0.mNoSyncStartTime
                long r9 = r5 - r9
                int r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$5500(r3)
                long r12 = (long) r0
                int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r0 <= 0) goto L645
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                int r12 = r0.mNoSyncCount
                int r12 = r12 + r11
                r0.mNoSyncCount = r12
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                int r12 = r0.mNoSyncPlayingCount
                int r12 = r12 + r11
                r0.mNoSyncPlayingCount = r12
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                long r11 = r0.mNoSyncTimeDuration
                long r11 = r11 + r9
                r0.mNoSyncTimeDuration = r11
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                long r11 = r0.mNoSyncPlayingTimeDuration
                long r11 = r11 + r9
                r0.mNoSyncPlayingTimeDuration = r11
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                long r9 = r0.mNoSyncPtsDuration
                long r9 = r9 + r7
                r0.mNoSyncPtsDuration = r9
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                long r9 = r0.mNoSyncPlayingPtsDuration
                long r9 = r9 + r7
                r0.mNoSyncPlayingPtsDuration = r9
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                r7 = 825(0x339, float:1.156E-42)
                java.lang.String r0 = r0.getStringOption(r7)
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> L252
                r7.<init>()     // Catch: org.json.JSONException -> L252
                java.lang.String r8 = "start_time"
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r9 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)     // Catch: org.json.JSONException -> L252
                long r9 = r9.mNoSyncStartTime     // Catch: org.json.JSONException -> L252
                org.json.JSONObject r7 = r7.put(r8, r9)     // Catch: org.json.JSONException -> L252
                java.lang.String r8 = "end_time"
                org.json.JSONObject r5 = r7.put(r8, r5)     // Catch: org.json.JSONException -> L252
                java.lang.String r6 = "start_pts"
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r7 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)     // Catch: org.json.JSONException -> L252
                long r7 = r7.mNoSyncStartPts     // Catch: org.json.JSONException -> L252
                org.json.JSONObject r5 = r5.put(r6, r7)     // Catch: org.json.JSONException -> L252
                java.lang.String r6 = "end_pts"
                org.json.JSONObject r2 = r5.put(r6, r2)     // Catch: org.json.JSONException -> L252
                java.lang.String r5 = "info"
                org.json.JSONObject r0 = r2.put(r5, r0)     // Catch: org.json.JSONException -> L252
                java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> L252
                goto L257
            L252:
                r0 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r0)
                r0 = 0
            L257:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                java.lang.String r2 = r2.mNoSyncPlayingInfoStr
                int r2 = r2.length()
                int r5 = r0.length()
                int r2 = r2 + r5
                long r5 = (long) r2
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                int r2 = r2.mNoSyncPlayingInfoLen
                long r7 = (long) r2
                int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r2 >= 0) goto L28d
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r6 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                java.lang.String r6 = r6.mNoSyncPlayingInfoStr
                r5.append(r6)
                r5.append(r0)
                java.lang.String r5 = r5.toString()
                r2.mNoSyncPlayingInfoStr = r5
            L28d:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                java.lang.String r2 = r2.mNoSyncInfoStr
                int r2 = r2.length()
                int r5 = r0.length()
                int r2 = r2 + r5
                long r5 = (long) r2
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                int r2 = r2.mNoSyncInfoLen
                long r7 = (long) r2
                int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r2 >= 0) goto L645
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                java.lang.String r3 = r3.mNoSyncInfoStr
                r5.append(r3)
                r5.append(r0)
                java.lang.String r0 = r5.toString()
                r2.mNoSyncInfoStr = r0
                goto L645
            L2c5:
                java.lang.System.currentTimeMillis()
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                long r5 = java.lang.System.currentTimeMillis()
                r0.mNoSyncStartTime = r5
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                long r2 = (long) r2
                r0.mNoSyncStartPts = r2
                goto L645
            L2db:
                java.lang.String r0 = "MEDIA_INFO_RTC_AUDIO_DECODE_STALL"
                com.bytedance.sdk.component.utils.vl.j(r6, r0)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                long r2 = (long) r2
                r0.onRtcDecoderStall(r2, r4)
                goto L645
            L2ea:
                java.lang.String r0 = "MEDIA_INFO_RTC_VIDEO_DECODE_STALL"
                com.bytedance.sdk.component.utils.vl.j(r6, r0)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                long r2 = (long) r2
                r0.onRtcDecoderStall(r2, r11)
                goto L645
            L2f9:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                long r2 = (long) r2
                int r5 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4100()
                r0.onDecoderStall(r2, r5, r4)
                goto L645
            L307:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                long r2 = (long) r2
                int r5 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4100()
                r0.onDecoderStall(r2, r5, r11)
                goto L645
            L315:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                long r2 = (long) r2
                int r5 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4000()
                r0.onDemuxerStall(r2, r5, r4)
                goto L645
            L323:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                long r2 = (long) r2
                int r5 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4000()
                r0.onDemuxerStall(r2, r5, r11)
                goto L645
            L331:
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$2902(r3, r4)
                com.bykv.vk.component.ttvideo.ILiveListener r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1500(r3)
                r0.onStallEnd()
                com.bykv.vk.component.ttvideo.retry.RetryProcessor r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$900(r3)
                boolean r5 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4200(r3)
                r0.onStall(r4, r5)
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$800(r3)
                if (r0 == 0) goto L35e
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                boolean r0 = r0.isStalling()
                if (r0 == 0) goto L35e
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                r0.onStallEnd(r11)
                goto L37a
            L35e:
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$800(r3)
                if (r0 != 0) goto L37a
                long r5 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4300(r3)
                r15 = 0
                int r0 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
                if (r0 == 0) goto L37a
                long r5 = java.lang.System.currentTimeMillis()
                long r7 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4300(r3)
                long r5 = r5 - r7
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$3402(r3, r5)
            L37a:
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$3500(r3)
                if (r0 == 0) goto L645
                com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r0 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                java.lang.String r3 = r3.mSessionId
                r5 = 7214(0x1c2e, float:1.0109E-41)
                r0.setInt64ValueByStrKey(r5, r3, r2)
                goto L645
            L391:
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$4408(r3)
                r3.getLastRenderTime()
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$2902(r3, r11)
                com.bykv.vk.component.ttvideo.ILiveListener r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1500(r3)
                r0.onStallStart()
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$800(r3)
                if (r0 != 0) goto L3b6
                long r5 = java.lang.System.currentTimeMillis()
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$4302(r3, r5)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                r0.onStallStart(r2, r4)
                goto L3d2
            L3b6:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                r0.onStallStart(r2, r11)
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$3500(r3)
                if (r0 == 0) goto L3d2
                com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r0 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                java.lang.String r5 = r5.mSessionId
                r6 = 7213(0x1c2d, float:1.0108E-41)
                r0.setInt64ValueByStrKey(r6, r5, r2)
            L3d2:
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4500(r3)
                if (r0 == 0) goto L422
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r3)
                int r0 = r0.getSourceType()
                if (r0 != r7) goto L422
                java.lang.String r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4600(r3)
                java.lang.String r2 = "rad"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L400
                int r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4400(r3)
                int r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4700(r3)
                if (r0 < r2) goto L400
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4800(r3)
                if (r0 == 0) goto L422
                goto L645
            L400:
                java.lang.String r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4600(r3)
                boolean r0 = r0.equals(r14)
                if (r0 == 0) goto L422
                java.lang.String r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4900(r3)
                java.lang.String r2 = "auto"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L422
                int r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$5000(r3)
                if (r0 != r11) goto L422
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$5100(r3)
                if (r0 != 0) goto L645
            L422:
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1600(r3)
                if (r0 != 0) goto L645
                int r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$5200(r3)
                if (r0 != r11) goto L44f
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                r2 = 530(0x212, float:7.43E-43)
                long r5 = r0.getLongOption(r2, r9)
                r15 = 0
                int r0 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
                if (r0 != 0) goto L44f
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                r2 = 531(0x213, float:7.44E-43)
                long r5 = r0.getLongOption(r2, r9)
                int r0 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
                if (r0 != 0) goto L44f
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$4202(r3, r11)
            L44f:
                com.bykv.vk.component.ttvideo.retry.RetryProcessor r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$900(r3)
                boolean r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4200(r3)
                r0.onStall(r11, r2)
                goto L645
            L45c:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                int r5 = r0.mSpeedSwitchCount
                int r5 = r5 + r11
                r0.mSpeedSwitchCount = r5
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                java.lang.String r5 = r3.mSpeedSwitchInfo
                r0.append(r5)
                r0.append(r13)
                double r5 = (double) r2
                r7 = 4652007308841189376(0x408f400000000000, double:1000.0)
                double r5 = r5 / r7
                r0.append(r5)
                r0.append(r12)
                long r5 = java.lang.System.currentTimeMillis()
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                r3.mSpeedSwitchInfo = r0
                goto L645
            L492:
                int r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2100(r3)
                if (r0 != r11) goto L4a7
                int r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2200(r3)
                if (r0 != 0) goto L4a7
                int r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2700(r3)
                if (r0 <= 0) goto L4a7
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$2702(r3, r4)
            L4a7:
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                if (r0 != 0) goto L4ae
                return r4
            L4ae:
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                if (r0 == 0) goto L4c5
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                r2 = 142(0x8e, float:1.99E-43)
                java.lang.String r0 = r0.getStringOption(r2)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                r2.onUpdateMetaData(r0)
            L4c5:
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                if (r0 == 0) goto L4ec
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                r2 = 141(0x8d, float:1.98E-43)
                int r0 = r0.getIntOption(r2, r8)
                if (r0 != 0) goto L4e1
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                java.lang.String r2 = "h264"
                r0.setCodecType(r2)
                goto L4ec
            L4e1:
                if (r0 != r11) goto L4ec
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                java.lang.String r2 = "bytevc1"
                r0.setCodecType(r2)
            L4ec:
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                if (r0 == 0) goto L506
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                r2 = 157(0x9d, float:2.2E-43)
                int r0 = r0.getIntOption(r2, r8)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                java.lang.String r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2800(r3, r0)
                r2.mCodecName = r0
            L506:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                r0.onPrepare(r4)
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$2902(r3, r4)
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                if (r0 == 0) goto L55a
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                r2 = 71
                java.lang.String r0 = r0.getStringOption(r2)
                java.lang.String r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$600(r3)
                if (r2 == 0) goto L544
                java.lang.String r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$600(r3)
                java.lang.String r5 = "["
                boolean r2 = r2.startsWith(r5)
                if (r2 == 0) goto L544
                if (r0 == 0) goto L544
                boolean r2 = r0.startsWith(r5)
                if (r2 != 0) goto L544
                java.lang.Object[] r2 = new java.lang.Object[r11]
                r2[r4] = r0
                java.lang.String r0 = "[%s]"
                java.lang.String r0 = java.lang.String.format(r0, r2)
            L544:
                if (r0 == 0) goto L55a
                java.lang.String r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$600(r3)
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L55a
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                r2.setCdnIp(r0, r11)
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$602(r3, r0)
            L55a:
                int r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$3000(r3)
                if (r0 != r11) goto L573
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                r0.mSessionHasFirstFrame = r11
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                long r9 = java.lang.System.currentTimeMillis()
                r0.mSessionVideoRenderStartTime = r9
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$3100(r3)
            L573:
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$800(r3)
                if (r0 != 0) goto L5e2
                int r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$3200(r3)
                if (r0 != r11) goto L585
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$3300(r3)
                if (r0 == 0) goto L5ad
            L585:
                java.lang.String r0 = "render start report first frame"
                com.bykv.vk.component.ttvideo.log.MyLog.i(r6, r0)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                long r5 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$3400(r3)
                r12 = 0
                r0.onFirstFrame(r12, r5)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                r0.start()
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$802(r3, r11)
                com.bykv.vk.component.ttvideo.ILiveListener r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1500(r3)
                r0.onFirstFrame(r11)
                r0 = 75
                r3.setIntOption(r0, r11)
            L5ad:
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$3500(r3)
                if (r0 == 0) goto L5c2
                com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r0 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                java.lang.String r2 = r2.mSessionId
                r5 = 8015(0x1f4f, float:1.1231E-41)
                r0.setInt64ValueByStrKey(r5, r2, r8)
            L5c2:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                boolean r0 = r0.isPreview()
                if (r0 == 0) goto L630
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$3500(r3)
                if (r0 == 0) goto L630
                com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r0 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                java.lang.String r2 = r2.mSessionId
                r5 = 8016(0x1f50, float:1.1233E-41)
                r0.setInt64ValueByStrKey(r5, r2, r8)
                goto L630
            L5e2:
                boolean r0 = r3.mRenderStartEntered
                if (r0 == 0) goto L630
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$3600(r3)
                if (r0 == 0) goto L630
                com.bykv.vk.component.ttvideo.ILiveListener r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1500(r3)
                r0.onFirstFrame(r4)
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$3700(r3)
                if (r0 == 0) goto L5fd
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$3702(r3, r4)
                goto L61c
            L5fd:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                r0.onRetry(r4)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                boolean r0 = r0.isStalling()
                if (r0 == 0) goto L61c
                com.bykv.vk.component.ttvideo.ILiveListener r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1500(r3)
                r0.onStallEnd()
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                r0.onStallEnd(r7)
            L61c:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                boolean r0 = r0.isInErrorRecovering()
                if (r0 == 0) goto L62d
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                r0.onErrorRecovered()
            L62d:
                r3.onRenderStallForRetryStop()
            L630:
                r3.mRenderStartEntered = r11
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$3602(r3, r4)
                com.bykv.vk.component.ttvideo.retry.RetryProcessor r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$900(r3)
                r0.reset()
                goto L645
            L63d:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                long r2 = (long) r2
                r0.onPtsBack(r2, r4)
            L645:
                return r4
        }
    }

    private static final class MyMediaLoaderListener implements com.bykv.vk.component.ttvideo.medialoader.MediaLoaderListener {
        private final java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> mVideoLiveManagerRef;

        public MyMediaLoaderListener(com.bykv.vk.component.ttvideo.VideoLiveManager r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mVideoLiveManagerRef = r0
                return
        }

        @Override // com.bykv.vk.component.ttvideo.medialoader.MediaLoaderListener
        public long getInt64Value(int r3, long r4) {
                r2 = this;
                java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> r0 = r2.mVideoLiveManagerRef
                java.lang.Object r0 = r0.get()
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = (com.bykv.vk.component.ttvideo.VideoLiveManager) r0
                if (r0 == 0) goto L1d
                com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r0)
                if (r1 != 0) goto L11
                goto L1d
            L11:
                if (r3 == 0) goto L14
                goto L1d
            L14:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r0)
                long r3 = r0.getInt64Value(r3, r4)
                return r3
            L1d:
                return r4
        }

        @Override // com.bykv.vk.component.ttvideo.medialoader.MediaLoaderListener
        public void onDataLoaderError(int r3, java.lang.String r4) {
                r2 = this;
                java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> r0 = r2.mVideoLiveManagerRef
                java.lang.Object r0 = r0.get()
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = (com.bykv.vk.component.ttvideo.VideoLiveManager) r0
                if (r0 == 0) goto L18
                com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r0)
                if (r1 != 0) goto L11
                goto L18
            L11:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r0)
                r0.onLoaderError(r3, r4)
            L18:
                return
        }

        @Override // com.bykv.vk.component.ttvideo.medialoader.MediaLoaderListener
        public void onLogInfo(int r1, java.lang.String r2, org.json.JSONObject r3) {
                r0 = this;
                return
        }

        @Override // com.bykv.vk.component.ttvideo.medialoader.MediaLoaderListener
        public void onNotify(int r1, long r2, long r4, java.lang.String r6) {
                r0 = this;
                return
        }

        @Override // com.bykv.vk.component.ttvideo.medialoader.MediaLoaderListener
        public void onSwitchLoaderType(int r3, java.lang.String r4) {
                r2 = this;
                java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> r0 = r2.mVideoLiveManagerRef
                java.lang.Object r0 = r0.get()
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = (com.bykv.vk.component.ttvideo.VideoLiveManager) r0
                if (r0 == 0) goto L18
                com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r0)
                if (r1 != 0) goto L11
                goto L18
            L11:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r0)
                r0.onLoaderSwitch(r3, r4)
            L18:
                return
        }
    }

    private static class MyOnVideoSizeChangedListener implements com.bykv.vk.component.ttvideo.player.MediaPlayer.OnVideoSizeChangedListener {
        private final java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> mVideoLiveManagerRef;

        public MyOnVideoSizeChangedListener(com.bykv.vk.component.ttvideo.VideoLiveManager r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mVideoLiveManagerRef = r0
                return
        }

        @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(com.bykv.vk.component.ttvideo.player.MediaPlayer r2, int r3, int r4) {
                r1 = this;
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r0 = "onVideoSizeChanged, width: "
                r2.<init>(r0)
                r2.append(r3)
                java.lang.String r0 = ", height: "
                r2.append(r0)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                java.lang.String r0 = "VideoLiveManager"
                com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r2)
                java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> r2 = r1.mVideoLiveManagerRef
                java.lang.Object r2 = r2.get()
                com.bykv.vk.component.ttvideo.VideoLiveManager r2 = (com.bykv.vk.component.ttvideo.VideoLiveManager) r2
                if (r2 == 0) goto L40
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r2)
                if (r0 != 0) goto L2c
                goto L40
            L2c:
                com.bykv.vk.component.ttvideo.ILiveListener r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1500(r2)
                if (r0 == 0) goto L40
                com.bykv.vk.component.ttvideo.ILiveListener r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1500(r2)
                r0.onVideoSizeChanged(r3, r4)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r2)
                r2.onVideoSizeChanged(r3, r4)
            L40:
                return
        }
    }

    private static final class MyPreparedListener implements com.bykv.vk.component.ttvideo.player.MediaPlayer.OnPreparedListener {
        private final java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> mVideoLiveManagerRef;

        public MyPreparedListener(com.bykv.vk.component.ttvideo.VideoLiveManager r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mVideoLiveManagerRef = r0
                return
        }

        @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer.OnPreparedListener
        public void onPrepared(com.bykv.vk.component.ttvideo.player.MediaPlayer r3) {
                r2 = this;
                java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> r3 = r2.mVideoLiveManagerRef
                java.lang.Object r3 = r3.get()
                com.bykv.vk.component.ttvideo.VideoLiveManager r3 = (com.bykv.vk.component.ttvideo.VideoLiveManager) r3
                if (r3 == 0) goto L3c
                com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1200(r3)
                com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.PREPARING
                if (r0 != r1) goto L3c
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                if (r0 != 0) goto L19
                goto L3c
            L19:
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$1200(r3)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r3)
                r0.onPrepareEnd()
                com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.PREPARED
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$1202(r3, r0)
                int r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1400(r3)
                if (r0 != 0) goto L35
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r3)
                r0.start()
            L35:
                com.bykv.vk.component.ttvideo.ILiveListener r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1500(r3)
                r3.onPrepared()
            L3c:
                return
        }
    }

    private static class MyReleaseRunnable implements java.lang.Runnable {
        private com.bykv.vk.component.ttvideo.player.MediaPlayer mPlayer;

        public MyReleaseRunnable(com.bykv.vk.component.ttvideo.player.MediaPlayer r1) {
                r0 = this;
                r0.<init>()
                r0.mPlayer = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.String r0 = "VideoLiveManager"
                com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r2.mPlayer
                if (r1 == 0) goto L1c
                java.lang.String r1 = "MyReleaseRunnable release"
                com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r1)     // Catch: java.lang.Exception -> L14
                com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r2.mPlayer     // Catch: java.lang.Exception -> L14
                r1.release()     // Catch: java.lang.Exception -> L14
                r1 = 0
                r2.mPlayer = r1     // Catch: java.lang.Exception -> L14
                return
            L14:
                r1 = move-exception
                java.lang.String r1 = r1.toString()
                com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r1)
            L1c:
                return
        }
    }

    private static final class MyRetryListener implements com.bykv.vk.component.ttvideo.retry.RetryProcessor.RetryListener {
        private final java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> mVideoLiveManagerRef;

        public MyRetryListener(com.bykv.vk.component.ttvideo.VideoLiveManager r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mVideoLiveManagerRef = r0
                return
        }

        @Override // com.bykv.vk.component.ttvideo.retry.RetryProcessor.RetryListener
        public void onRTCFallBack() {
                r6 = this;
                java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> r0 = r6.mVideoLiveManagerRef
                java.lang.Object r0 = r0.get()
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = (com.bykv.vk.component.ttvideo.VideoLiveManager) r0
                if (r0 == 0) goto Le5
                com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r0)
                if (r1 != 0) goto L12
                goto Le5
            L12:
                r1 = 1
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$3602(r0, r1)
                java.lang.String r2 = "onRTCFallBack"
                java.lang.String r3 = "VideoLiveManager"
                com.bykv.vk.component.ttvideo.log.MyLog.i(r3, r2)
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$6400(r0)
                int r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2700(r0)
                int r4 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$6900(r0)
                r5 = 2
                if (r2 >= r4) goto L34
                int r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2700(r0)
                int r2 = r2 + r1
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$2702(r0, r2)
                goto L67
            L34:
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$2202(r0, r1)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r0)
                r2.mRtcPlayFallBack = r1
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r0)
                r2.setRtcFallback(r1)
                boolean r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$800(r0)
                if (r2 != 0) goto L61
                int r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$7000(r0)
                if (r2 != r1) goto L5a
                r2 = 0
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$7002(r0, r2)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r4 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r0)
                r4.mEnableMiniSdp = r2
            L5a:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r0)
                r2.mFallbackType = r1
                goto L67
            L61:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r0)
                r2.mFallbackType = r5
            L67:
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r0)
                int r2 = r2.getSourceType()
                if (r2 != r1) goto L7a
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r0)
                java.lang.String r1 = r1.getNextURL()
                goto Laf
            L7a:
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r0)
                int r1 = r1.getSourceType()
                if (r1 != r5) goto Lae
                java.lang.String r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4900(r0)
                java.lang.String r2 = "auto"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L99
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r0)
                java.lang.String r1 = r1.getDefaultResolution()
                goto L9d
            L99:
                java.lang.String r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4900(r0)
            L9d:
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r0)
                java.lang.String r4 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$6500(r0)
                java.lang.String r5 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$5300(r0)
                java.lang.String r1 = r2.getPlayURLForResolution(r1, r4, r5)
                goto Laf
            Lae:
                r1 = 0
            Laf:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "onRTCFallBack url: "
                r2.<init>(r4)
                r2.append(r1)
                java.lang.String r4 = ",mCurrentRetryCount:"
                r2.append(r4)
                int r4 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2700(r0)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                com.bykv.vk.component.ttvideo.log.MyLog.i(r3, r2)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r0)
                r2.onSwitchURL(r1)
                com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1200(r0)
                com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.PREPARED
                if (r2 != r3) goto Ldf
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$6100(r0, r1)
                return
            Ldf:
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$6700(r0)
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$6100(r0, r1)
            Le5:
                return
        }

        @Override // com.bykv.vk.component.ttvideo.retry.RetryProcessor.RetryListener
        public void onReportOutToApplication(com.bykv.vk.component.ttvideo.log.LiveError r4) {
                r3 = this;
                java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> r0 = r3.mVideoLiveManagerRef
                java.lang.Object r0 = r0.get()
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = (com.bykv.vk.component.ttvideo.VideoLiveManager) r0
                if (r0 == 0) goto L2d
                com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r0)
                if (r1 != 0) goto L11
                goto L2d
            L11:
                java.lang.String r1 = "VideoLiveManager"
                java.lang.String r2 = "onReportOutToApplication"
                com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r2)
                com.bykv.vk.component.ttvideo.ILiveListener r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1500(r0)
                r1.onError(r4)
                com.bykv.vk.component.ttvideo.network.LiveDataFetcher r4 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$6800(r0)
                r4.cancel()
                com.bykv.vk.component.ttvideo.retry.RetryProcessor r4 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$900(r0)
                r4.reset()
            L2d:
                return
        }

        @Override // com.bykv.vk.component.ttvideo.retry.RetryProcessor.RetryListener
        public void onRetryNextPlayURL() {
                r7 = this;
                java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> r0 = r7.mVideoLiveManagerRef
                java.lang.Object r0 = r0.get()
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = (com.bykv.vk.component.ttvideo.VideoLiveManager) r0
                if (r0 == 0) goto Lb2
                com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r0)
                if (r1 != 0) goto L12
                goto Lb2
            L12:
                java.lang.String r1 = "VideoLiveManager"
                java.lang.String r2 = "onRetryNextPlayURL"
                com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r2)
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$6200(r0)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r0)
                r1.onSessionStop()
                r1 = 1
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$3602(r0, r1)
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r0)
                int r2 = r2.getSourceType()
                if (r2 != r1) goto L3a
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r0)
                java.lang.String r2 = r2.getNextURL()
                goto L70
            L3a:
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r0)
                int r2 = r2.getSourceType()
                r3 = 2
                if (r2 != r3) goto L6f
                java.lang.String r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4900(r0)
                java.lang.String r3 = "auto"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L5a
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r0)
                java.lang.String r2 = r2.getDefaultResolution()
                goto L5e
            L5a:
                java.lang.String r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4900(r0)
            L5e:
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r0)
                java.lang.String r4 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$6500(r0)
                java.lang.String r5 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$5300(r0)
                java.lang.String r2 = r3.getPlayURLForResolution(r2, r4, r5)
                goto L70
            L6f:
                r2 = 0
            L70:
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r0)
                r3.onSwitchURL(r2)
                boolean r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$6300(r0)
                if (r3 != 0) goto L93
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$6302(r0, r1)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r0)
                com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r0)
                r4 = 314(0x13a, float:4.4E-43)
                r5 = 0
                long r3 = r3.getLongOption(r4, r5)
                r1.setWaitTime(r3)
            L93:
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$6400(r0)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r0)
                long r3 = java.lang.System.currentTimeMillis()
                r1.mSessionStartTime = r3
                com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1200(r0)
                com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.PREPARED
                if (r1 != r3) goto Lac
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$6100(r0, r2)
                return
            Lac:
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$6700(r0)
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$6100(r0, r2)
            Lb2:
                return
        }

        @Override // com.bykv.vk.component.ttvideo.retry.RetryProcessor.RetryListener
        public void onRetryResetPlayer(boolean r9) {
                r8 = this;
                java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> r0 = r8.mVideoLiveManagerRef
                java.lang.Object r0 = r0.get()
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = (com.bykv.vk.component.ttvideo.VideoLiveManager) r0
                if (r0 == 0) goto L11f
                com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r0)
                if (r1 != 0) goto L12
                goto L11f
            L12:
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$6200(r0)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r0)
                r1.onSessionStop()
                r0.getLastRenderTime()
                r1 = 1
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$3602(r0, r1)
                java.lang.String r2 = "onRetryResetPlayer "
                java.lang.String r9 = java.lang.String.valueOf(r9)
                java.lang.String r9 = r2.concat(r9)
                java.lang.String r2 = "VideoLiveManager"
                com.bykv.vk.component.ttvideo.log.MyLog.i(r2, r9)
                boolean r9 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$6300(r0)
                if (r9 != 0) goto L4e
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$6302(r0, r1)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r9 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r0)
                com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r0)
                r4 = 314(0x13a, float:4.4E-43)
                r5 = 0
                long r3 = r3.getLongOption(r4, r5)
                r9.setWaitTime(r3)
            L4e:
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$6400(r0)
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r9 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r0)
                int r9 = r9.getSourceType()
                java.lang.String r3 = "auto"
                r4 = 2
                r5 = 0
                if (r9 != r1) goto L74
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r9 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r0)
                com.bykv.vk.component.ttvideo.model.LiveURL r9 = r9.getPlayLiveURL()
                if (r9 == 0) goto La5
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r9 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r0)
                com.bykv.vk.component.ttvideo.model.LiveURL r9 = r9.getPlayLiveURL()
                java.lang.String r5 = r9.mainURL
                goto La5
            L74:
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r9 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r0)
                int r9 = r9.getSourceType()
                if (r9 != r4) goto La5
                java.lang.String r9 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4900(r0)
                boolean r9 = r9.equals(r3)
                if (r9 == 0) goto L91
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r9 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r0)
                java.lang.String r9 = r9.getDefaultResolution()
                goto L95
            L91:
                java.lang.String r9 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4900(r0)
            L95:
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r5 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r0)
                java.lang.String r6 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$6500(r0)
                java.lang.String r7 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$5300(r0)
                java.lang.String r5 = r5.getPlayURLForResolution(r9, r6, r7)
            La5:
                java.lang.String r9 = "retry url: "
                java.lang.String r6 = java.lang.String.valueOf(r5)
                java.lang.String r9 = r9.concat(r6)
                com.bykv.vk.component.ttvideo.log.MyLog.i(r2, r9)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r9 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r0)
                r9.onSwitchURL(r5)
                com.bykv.vk.component.ttvideo.model.LiveInfoSource r9 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$2400(r0)
                int r9 = r9.getSourceType()
                if (r9 != r4) goto Ldb
                java.lang.String r9 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4600(r0)
                java.lang.String r2 = "abr_bb_4live"
                boolean r9 = r9.equals(r2)
                if (r9 == 0) goto Ldb
                java.lang.String r9 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$4900(r0)
                boolean r9 = r9.equals(r3)
                if (r9 == 0) goto Ldb
                r9 = 1
                goto Ldc
            Ldb:
                r9 = 0
            Ldc:
                long r2 = java.lang.System.currentTimeMillis()
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$6602(r0, r2)
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r0)
                long r3 = java.lang.System.currentTimeMillis()
                r2.mSessionStartTime = r3
                com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1200(r0)
                com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.PREPARED
                if (r2 != r3) goto L109
                int r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$5000(r0)
                if (r2 == r1) goto L105
                if (r9 == 0) goto L105
                if (r9 == 0) goto L11f
                boolean r9 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$5100(r0)
                if (r9 != 0) goto L11f
            L105:
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$6100(r0, r5)
                return
            L109:
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$6700(r0)
                int r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$5000(r0)
                if (r2 == r1) goto L11c
                if (r9 == 0) goto L11c
                if (r9 == 0) goto L11f
                boolean r9 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$5100(r0)
                if (r9 != 0) goto L11f
            L11c:
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$6100(r0, r5)
            L11f:
                return
        }
    }

    private static class NamedThreadFactory implements java.util.concurrent.ThreadFactory {
        private NamedThreadFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ NamedThreadFactory(com.bykv.vk.component.ttvideo.VideoLiveManager.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r3) {
                r2 = this;
                com.bytedance.sdk.component.oq.r.cw r0 = new com.bytedance.sdk.component.oq.r.cw
                java.lang.String r1 = "VideoLiveManager"
                r0.<init>(r3, r1)
                r3 = 10
                r0.setPriority(r3)
                return r0
        }
    }

    private class PlayCacheSyncRunner implements java.lang.Runnable {
        static final long CacheThreadshold = 5000;
        static final long LongDelay = 500;
        static final long ShortDelay = 300;
        boolean mIsLiveIO;
        java.lang.String mMdlTaskSessionId;
        private final java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> mVideoLiveManagerRef;
        final /* synthetic */ com.bykv.vk.component.ttvideo.VideoLiveManager this$0;

        public PlayCacheSyncRunner(com.bykv.vk.component.ttvideo.VideoLiveManager r1, com.bykv.vk.component.ttvideo.VideoLiveManager r2, java.lang.String r3, boolean r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 0
                r0.mIsLiveIO = r1
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r2)
                r0.mVideoLiveManagerRef = r1
                r0.mMdlTaskSessionId = r3
                r0.mIsLiveIO = r4
                return
        }

        private long getPlayCache() {
                r10 = this;
                java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> r0 = r10.mVideoLiveManagerRef
                java.lang.Object r0 = r0.get()
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = (com.bykv.vk.component.ttvideo.VideoLiveManager) r0
                r1 = -1
                if (r0 != 0) goto Ld
                return r1
            Ld:
                com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r0)
                r4 = 73
                long r3 = r3.getLongOption(r4, r1)
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r0)
                r5 = 72
                long r5 = r0.getLongOption(r5, r1)
                r7 = 0
                int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r0 < 0) goto L30
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 < 0) goto L30
                long r0 = java.lang.Math.min(r3, r5)
                return r0
            L30:
                if (r0 < 0) goto L33
                return r3
            L33:
                int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r0 < 0) goto L38
                return r5
            L38:
                return r1
        }

        private void nextround(long r6) {
                r5 = this;
                java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> r0 = r5.mVideoLiveManagerRef
                java.lang.Object r0 = r0.get()
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = (com.bykv.vk.component.ttvideo.VideoLiveManager) r0
                if (r0 != 0) goto Lb
                return
            Lb:
                com.bykv.vk.component.ttvideo.VideoLiveManager$PlayCacheSyncRunner r1 = new com.bykv.vk.component.ttvideo.VideoLiveManager$PlayCacheSyncRunner
                com.bykv.vk.component.ttvideo.VideoLiveManager r2 = r5.this$0
                java.lang.String r3 = r5.mMdlTaskSessionId
                boolean r4 = r5.mIsLiveIO
                r1.<init>(r2, r0, r3, r4)
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$7500(r0, r1, r6)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r9 = this;
                java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.VideoLiveManager> r0 = r9.mVideoLiveManagerRef
                java.lang.Object r0 = r0.get()
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = (com.bykv.vk.component.ttvideo.VideoLiveManager) r0
                if (r0 == 0) goto L61
                java.lang.String r1 = r9.mMdlTaskSessionId
                if (r1 == 0) goto L61
                java.lang.String r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$7300(r0)
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L61
                java.lang.String r1 = r9.mMdlTaskSessionId
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L21
                goto L61
            L21:
                com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$7400(r0)
                com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.PLAYED
                r3 = 500(0x1f4, double:2.47E-321)
                if (r1 == r2) goto L2f
                r9.nextround(r3)
                return
            L2f:
                long r1 = r9.getPlayCache()
                r5 = -1
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 != 0) goto L3d
                r9.nextround(r3)
                return
            L3d:
                boolean r5 = r9.mIsLiveIO
                if (r5 != 0) goto L4f
                com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r5 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
                java.lang.String r6 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$7300(r0)
                int r7 = (int) r1
                r8 = 7215(0x1c2f, float:1.011E-41)
                r5.setInt64ValueByStrKey(r8, r6, r7)
            L4f:
                com.bykv.vk.component.ttvideo.VideoLiveManager.access$7300(r0)
                r5 = 5000(0x1388, double:2.4703E-320)
                int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r0 <= 0) goto L5c
                r9.nextround(r3)
                return
            L5c:
                r0 = 300(0x12c, double:1.48E-321)
                r9.nextround(r0)
            L61:
                return
        }
    }

    private enum PlayerState extends java.lang.Enum<com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState> {
        private static final /* synthetic */ com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState[] $VALUES = null;
        public static final com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState IDLE = null;
        public static final com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState INITIALIZED = null;
        public static final com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState PREPARED = null;
        public static final com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState PREPARING = null;

        static {
                com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r0 = new com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState
                java.lang.String r1 = "IDLE"
                r2 = 0
                r0.<init>(r1, r2)
                com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.IDLE = r0
                com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r1 = new com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState
                java.lang.String r3 = "INITIALIZED"
                r4 = 1
                r1.<init>(r3, r4)
                com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.INITIALIZED = r1
                com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r3 = new com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState
                java.lang.String r5 = "PREPARING"
                r6 = 2
                r3.<init>(r5, r6)
                com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.PREPARING = r3
                com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r5 = new com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState
                java.lang.String r7 = "PREPARED"
                r8 = 3
                r5.<init>(r7, r8)
                com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.PREPARED = r5
                r7 = 4
                com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState[] r7 = new com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.$VALUES = r7
                return
        }

        PlayerState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState valueOf(java.lang.String r1) {
                java.lang.Class<com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState> r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r1 = (com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState) r1
                return r1
        }

        public static com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState[] values() {
                com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState[] r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState[] r0 = (com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState[]) r0
                return r0
        }
    }

    private class VideoStallCountTask implements java.lang.Runnable {
        final /* synthetic */ com.bykv.vk.component.ttvideo.VideoLiveManager this$0;

        private VideoStallCountTask(com.bykv.vk.component.ttvideo.VideoLiveManager r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ VideoStallCountTask(com.bykv.vk.component.ttvideo.VideoLiveManager r1, com.bykv.vk.component.ttvideo.VideoLiveManager.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r23 = this;
                r1 = r23
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r1.this$0
                java.lang.Object r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$7800(r0)
                monitor-enter(r2)
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r1.this$0     // Catch: java.lang.Throwable -> Lab
                boolean r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$7900(r0)     // Catch: java.lang.Throwable -> Lab
                if (r0 == 0) goto Lc0
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r1.this$0     // Catch: java.lang.Throwable -> Lab
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r0)     // Catch: java.lang.Throwable -> Lab
                if (r0 != 0) goto L1b
                goto Lc0
            L1b:
                long r3 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> Lab
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r1.this$0     // Catch: java.lang.Throwable -> Lab
                int r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$8000(r0)     // Catch: java.lang.Throwable -> Lab
                long r5 = (long) r0     // Catch: java.lang.Throwable -> Lab
                long r3 = r3 + r5
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r1.this$0     // Catch: java.lang.Throwable -> Lab
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r0)     // Catch: java.lang.Throwable -> Lab
                r5 = 381(0x17d, float:5.34E-43)
                r6 = 0
                long r9 = r0.getLongOption(r5, r6)     // Catch: java.lang.Throwable -> Lab
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r1.this$0     // Catch: java.lang.Throwable -> Lab
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r0)     // Catch: java.lang.Throwable -> Lab
                r5 = 382(0x17e, float:5.35E-43)
                long r11 = r0.getLongOption(r5, r6)     // Catch: java.lang.Throwable -> Lab
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r1.this$0     // Catch: java.lang.Throwable -> Lab
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r0)     // Catch: java.lang.Throwable -> Lab
                r5 = 383(0x17f, float:5.37E-43)
                long r13 = r0.getLongOption(r5, r6)     // Catch: java.lang.Throwable -> Lab
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r1.this$0     // Catch: java.lang.Throwable -> Lab
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r0)     // Catch: java.lang.Throwable -> Lab
                r5 = 384(0x180, float:5.38E-43)
                long r15 = r0.getLongOption(r5, r6)     // Catch: java.lang.Throwable -> Lab
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r1.this$0     // Catch: java.lang.Throwable -> Lab
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r0)     // Catch: java.lang.Throwable -> Lab
                r5 = 385(0x181, float:5.4E-43)
                long r17 = r0.getLongOption(r5, r6)     // Catch: java.lang.Throwable -> Lab
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r1.this$0     // Catch: java.lang.Throwable -> Lab
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r0)     // Catch: java.lang.Throwable -> Lab
                r5 = 386(0x182, float:5.41E-43)
                long r19 = r0.getLongOption(r5, r6)     // Catch: java.lang.Throwable -> Lab
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r1.this$0     // Catch: java.lang.Throwable -> Lab
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$1300(r0)     // Catch: java.lang.Throwable -> Lab
                r5 = 387(0x183, float:5.42E-43)
                long r21 = r0.getLongOption(r5, r6)     // Catch: java.lang.Throwable -> Lab
                int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r0 != 0) goto L99
                int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r0 != 0) goto L99
                int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
                if (r0 != 0) goto L99
                int r0 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
                if (r0 != 0) goto L99
                int r0 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
                if (r0 != 0) goto L99
                int r0 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
                if (r0 != 0) goto L99
                int r0 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
                if (r0 == 0) goto Lad
            L99:
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r1.this$0     // Catch: java.lang.Throwable -> Lab
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r0)     // Catch: java.lang.Throwable -> Lab
                if (r0 == 0) goto Lad
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r1.this$0     // Catch: java.lang.Throwable -> Lab
                com.bykv.vk.component.ttvideo.log.LiveLoggerService r8 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$300(r0)     // Catch: java.lang.Throwable -> Lab
                r8.onVideoStallCounter(r9, r11, r13, r15, r17, r19, r21)     // Catch: java.lang.Throwable -> Lab
                goto Lad
            Lab:
                r0 = move-exception
                goto Lc2
            Lad:
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r1.this$0     // Catch: java.lang.Throwable -> Lab
                android.os.Handler r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$8100(r0)     // Catch: java.lang.Throwable -> Lab
                if (r0 == 0) goto Lbe
                com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r1.this$0     // Catch: java.lang.Throwable -> Lab
                android.os.Handler r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.access$8100(r0)     // Catch: java.lang.Throwable -> Lab
                r0.postAtTime(r1, r3)     // Catch: java.lang.Throwable -> Lab
            Lbe:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lab
                return
            Lc0:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lab
                return
            Lc2:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lab
                throw r0
        }
    }

    static {
            return
    }

    private VideoLiveManager(com.bykv.vk.component.ttvideo.VideoLiveManager.Builder r21) {
            r20 = this;
            r1 = r20
            r9 = r21
            r1.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.myLooper()
            r0.<init>(r2)
            r1.mMyHandler = r0
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = new com.bykv.vk.component.ttvideo.model.LiveInfoSource
            r0.<init>()
            r1.mURLSource = r0
            r10 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1.mEnableTextureRender = r10
            r1.mEnableTextureSR = r10
            r2 = 1
            r1.mResolutionDisableSR = r2
            java.lang.String r3 = "none"
            r1.mTextureSRBinPath = r3
            java.lang.String r4 = "test"
            r1.mTextureSROclModuleName = r4
            r1.mTextureSRDspModuleName = r4
            r11 = 0
            r1.mTextureRenderErrorMsg = r11
            r1.mEnableOpenMDL = r10
            r1.mIsMdlProtoRegister = r10
            r1.mIsPlayWithMdl = r10
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r4 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.IDLE
            r1.mPrepareState = r4
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r4 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.IDLE
            r1.mLivePlayerState = r4
            r1.mIsRequestCanceled = r10
            r1.mShowedFirstFrame = r10
            r1.mHasRetry = r10
            r1.mLooping = r10
            r1.mPlayerCache = r10
            r1.mEnhancementType = r10
            r1.mScaleType = r10
            r1.mLayoutType = r10
            r4 = 3
            r1.mRenderType = r4
            r1.mHardwareDecodeEnable = r10
            r1.mHardwareRTCDecodeEnable = r10
            r4 = -1
            r1.mCacheFileEnable = r4
            r1.mTestAction = r4
            r1.mUseExternalDir = r4
            r1.mMaxFileCacheSize = r4
            r1.mByteVC1DecoderType = r2
            r1.mBufferDataSeconds = r4
            r1.mBufferTimeout = r4
            r1.mNetworkTimeout = r4
            r1.mPlayerDegradeMode = r10
            r1.mEnableSharp = r10
            r1.mDefaultCodecId = r4
            r1.mEnableMediaCodecASYNCInit = r10
            r1.mHurryType = r4
            r1.mHurryTime = r10
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.mCatchSpeed = r5
            r1.mSlowPlayTime = r4
            r1.mSlowPlaySpeed = r5
            r1.mEnableHurryFlag = r4
            r1.mCacheFilePath = r11
            r1.mCacheFileKey = r11
            r1.mIsCacheHasComplete = r10
            r1.mCurrentPlayURL = r11
            r1.mCurrentIP = r11
            r1.mStallCount = r10
            r1.mIsStalling = r10
            r1.mEnableResolutionAutoDegrade = r10
            java.lang.String r6 = "rad"
            r1.mAbrStrategy = r6
            r1.mHasAbrInfo = r10
            r1.mDefaultResBitrate = r4
            r6 = 4
            r1.mStallCountThresOfResolutionDegrade = r6
            r1.mEnableSwitchMainAndBackupUrl = r2
            r1.mEnableVideoMpdRefresh = r2
            r1.mEnableCmafFastMode = r10
            r1.mEnableCmafOptimizeRetry = r10
            r1.mEnableDTSCheck = r10
            r1.mEnablePreventDTSBack = r10
            r7 = 10000(0x2710, double:4.9407E-320)
            r1.mFrameDroppingDTSMaxDiff = r7
            r12 = -1
            r1.mFrameTerminatedDTS = r12
            r1.mLatestAudioPacketDTS = r12
            r1.mSessionId = r11
            r1.mEnableCheckFrame = r10
            r1.mEnableCheckSEI = r10
            r1.mGopDuration = r6
            r1.mFrameMetaDataListener = r11
            r1.mInvocationHandler = r11
            r1.mLocalURL = r11
            r1.mIsLocalURL = r10
            r1.mALogWriteAddr = r12
            java.lang.String r6 = "origin"
            r1.mResolution = r6
            r1.mResolutionIndex = r4
            java.lang.String r6 = "main"
            r1.mLevel = r6
            java.lang.String r6 = "flv"
            r1.mStreamFormat = r6
            r1.mSuggestProtocol = r3
            java.lang.String r6 = "tcp"
            r1.mTransportProtocol = r6
            r1.mURLProtocol = r3
            java.lang.String r3 = ""
            r1.mEnableAvLines = r3
            r1.mVideoOnly = r3
            r1.mAudioOnly = r3
            r1.mReliable = r3
            r1.mForceDecodeSwitch = r10
            r1.mForceDecodeMsGaps = r10
            r1.mForceRenderMsGaps = r10
            r6 = 15
            r1.mFramesDrop = r6
            r1.mAVPHDnsParseEnable = r10
            r6 = 2000000(0x1e8480, float:2.802597E-39)
            r1.mAVPHDnsTimeout = r6
            r6 = 4096(0x1000, float:5.74E-42)
            r1.mAVPHVideoProbesize = r6
            r14 = 100000(0x186a0, float:1.4013E-40)
            r1.mAVPHVideoMaxDuration = r14
            r1.mAVPHAudioProbesize = r6
            r1.mAVPHAudioMaxDuration = r14
            r1.mAVPHOpenVideoFirst = r2
            r6 = 10000(0x2710, float:1.4013E-41)
            r1.mAVPHMaxAVDiff = r6
            r1.mAVPHAutoExit = r2
            r1.mAVPHEnableAutoReopen = r10
            r14 = 15000(0x3a98, float:2.102E-41)
            r1.mAVPHVideoDiffThreshold = r14
            r14 = 100
            r1.mAVPHReadRetryCount = r14
            r1.mAVPHReadErrorExit = r2
            r1.mEnableSkipFindUnnecessaryStream = r10
            r1.mEnableRenderStall = r2
            r1.mAudioLastRenderTime = r12
            r1.mVideoLastRenderTime = r12
            r1.mIsRetrying = r10
            r1.mEnableDemuxerStall = r2
            r1.mEnableDecoderStall = r2
            r1.mEnableStallCounter = r10
            r15 = 2000(0x7d0, float:2.803E-42)
            r1.mStallCounterInterval = r15
            r1.mEnableClosePlayRetry = r10
            r1.mEnableCheckDropAudio = r10
            r1.mURLAbility = r2
            r7 = 0
            r1.mStallStartTime = r7
            r1.mStallTotalTime = r7
            r1.mRetryStartTime = r7
            r1.mEnableNTP = r10
            r1.mEnableNTPTask = r10
            r1.mEnableDns = r2
            r1.mEnableDnsOptimizer = r10
            r1.mEnableUploadSessionSeries = r10
            r1.mEnableH264HardwareDecode = r10
            r1.mEnableByteVC1HardwareDecode = r10
            r1.mMaxCacheSeconds = r4
            r1.mEnableSplitStream = r10
            r1.mOpenCheckSideData = r2
            r1.mEnableHttpkDegrade = r10
            r1.mEnableQuicDegrade = r2
            r1.mEnableFastOpenStream = r2
            r1.mEnableUploadSei = r2
            r12 = 8000(0x1f40, double:3.9525E-320)
            r1.mSeiDiffThres = r12
            r1.mEnableSeiCheck = r10
            r1.mHasSeiInfo = r10
            r1.mGetSeiCurrentTime = r7
            r1.mStartPlayBufferThres = r7
            r1.mCheckBufferingEndIgnoreVideo = r10
            r1.mStartDirectAfterPrepared = r10
            r1.mCheckBufferingEndAdvanceEnable = r10
            r1.mEnableTcpFastOpen = r10
            r1.mEnableCheckPacketCorrupt = r10
            r1.mEnableLowLatencyFLV = r10
            r1.mLowLatencyFLVStrategy = r11
            r1.mEnableDroppingDTSRollFrame = r10
            r1.mIsInMainLooper = r2
            r1.mCmafEnable = r10
            r1.mQuicEnable = r10
            r12 = 39
            r1.mQuicVersion = r12
            r1.mEnableSaveSCFG = r10
            r1.mEnableQuicCertVerify = r10
            r12 = 1200(0x4b0, float:1.682E-42)
            r1.mQuicInitMTU = r12
            r1.mEnableQuicMTUDiscovery = r10
            r1.mQuicPadHello = r2
            r1.mQuicFixWillingAndAbleToWrite = r2
            r1.mQuicFixProcessTimer = r2
            r1.mQuicReadBlockTimeout = r14
            r1.mQuicReadBlockMode = r10
            r1.mQuicFixStreamFinAndRst = r10
            r1.mQuicConfigOptimize = r10
            r1.mQuicTimerVersion = r2
            r1.mQuicPull = r10
            r1.mQuicInitRtt = r10
            r1.mQuicMaxCryptoRetransmissions = r10
            r1.mQuicMaxCryptoRetransmissionTimeMs = r10
            r1.mQuicMaxRetransmissions = r10
            r1.mQuicMaxRetransmissionTimeMs = r10
            r1.mQuicMaxAckDelay = r10
            r1.mQuicMinReceivedBeforeAckDecimation = r10
            r1.mSessionReceiveWindow = r4
            r1.mStreamReceiveWindow = r4
            r1.mAVNoSyncThreshold = r6
            r1.mIsAlwaysDoAVSync = r10
            r1.mEnableFlvABR = r10
            r1.mEnableLLASHFastOpen = r10
            r1.mForceHttpDns = r10
            r1.mHttpDNSServerHost = r11
            r1.mCancelSDKDNSFailRetry = r10
            r1.mUrlSettingMethod = r4
            r1.mUserSwitchResoultion = r10
            r1.mEnterStallRetryInstantly = r10
            r1.mEnableStallRetryInstantly = r2
            r1.mNodeOptimizeResults = r11
            r1.mRedoDns = r10
            r1.mEnableOptimizeBackup = r10
            r1.mSupportBackupIp = r2
            r1.mTextureSRMode = r10
            r1.mRenderStartNotifyTimeStamp = r7
            r1.mRenderStartEntered = r10
            r1.mEnableAudioVolumeBalance = r10
            r1.mAudioVolumeBalancePregain = r5
            r1.mAudioVolumeBalanceThreshold = r5
            r1.mAudioVolumeBalanceRatio = r5
            r1.mAudioVolumeBalancePredelay = r5
            r1.mEnableCacheSei = r10
            r1.mEnableDecodeMultiSei = r10
            r1.mEnableDecodeSeiOnce = r10
            r1.mEnableSkipFlvNullTag = r10
            r1.mEnableNotifySeiImmediatelyBeforeFirstFrame = r2
            r1.mEnableLiveAbrCheckEnhance = r10
            r6 = 1000(0x3e8, float:1.401E-42)
            r1.mLiveABRCheckInterval = r6
            r1.mABRMethod = r4
            r1.mABRBufferThreshold = r4
            r1.mTslTimeShift = r4
            r6 = 60
            r1.mTslMinTimeShit = r6
            r1.mEnableOriginResolution = r10
            r12 = -1
            r1.mTargetOriginBitRate = r12
            r1.mEnableAbrStallDegradeImmediately = r2
            r6 = -3
            r1.mHlsLiveStartIndex = r6
            r1.mCdnSessionPath = r11
            r1.mCdnAbrResolution = r11
            r1.mAudioTimescaleEnable = r4
            r12 = 10000(0x2710, double:4.9407E-320)
            r1.mStallRetryTimeIntervalManager = r12
            r1.mMediaSupportSR = r10
            r1.mSupportSRScene = r10
            r1.mCheckSupportSR = r10
            r1.mStallCounterThread = r11
            r1.mStallCounterHandler = r11
            com.bykv.vk.component.ttvideo.VideoLiveManager$VideoStallCountTask r6 = new com.bykv.vk.component.ttvideo.VideoLiveManager$VideoStallCountTask
            r6.<init>(r1, r11)
            r1.mVideoStallCountTask = r6
            java.lang.Object r6 = new java.lang.Object
            r6.<init>()
            r1.mStallCounterLock = r6
            r1.mStallCounterIsRunning = r10
            r1.mEnableRtcPlay = r10
            r1.mRtcPlayFallBack = r10
            r6 = 5000(0x1388, float:7.006E-42)
            r1.mRtcFallbackThreshold = r6
            r1.mRtcEnableDtls = r2
            r12 = 300(0x12c, float:4.2E-43)
            r1.mRtcMinJitterBuffer = r12
            r1.mRtcMaxJitterBuffer = r15
            r1.mRtcEnableSDKDns = r10
            r1.mRtcEarlyInitRender = r10
            r1.mRtcMaxRetryCount = r10
            r1.mRtcSupportMiniSdp = r10
            r1.mCurrentRetryCount = r10
            r1.mRtcPlayLogInterval = r6
            r1.mRtcEnableRtcUninitLockFree = r10
            r1.mEnableRadioLiveDisableRender = r10
            r1.mSwitchToB = r10
            r1.mMoudleIDToB = r3
            r1.mURLHost = r3
            r1.mABRDisableAlgorithm = r10
            r1.mTextureRenderFirstFrame = r10
            r1.mUsePlayerRenderStart = r10
            r1.mMaxTextureWidth = r10
            r1.mMaxTextureHeight = r10
            r1.mEnableReportSessionStop = r10
            r1.mSessionNum = r10
            r1.mSessionStartTime = r7
            r1.mSessionRenderStartTime = r7
            r1.mIsLiveIOProtoRegister = r10
            r1.mEnableOpenLiveIO = r10
            r1.mIsPlayWithLiveIO = r10
            r1.mEnableLiveIOPlay = r10
            r1.mEnableLiveIOP2P = r10
            r1.mEnableHttpPrepare = r10
            r1.mEnableFreeFlow = r10
            r1.mEnableP2pUp = r10
            r1.mLiveIOABGroupID = r10
            r1.mNoSyncReportMinDuration = r6
            r1.mNoSyncReportReportThres = r15
            r1.mEnableUseLiveThreadPool = r10
            r1.mExecutor = r11
            r1.mEnableSharpen = r10
            r1.mSharpenMode = r10
            r1.mMediaSupportSharpen = r10
            r1.mSupportSharpenScene = r4
            r3 = 1920(0x780, float:2.69E-42)
            r1.mSharpenMaxWidth = r3
            r3 = 1080(0x438, float:1.513E-42)
            r1.mSharpenMaxHeight = r3
            r1.mSharpenPowerLevel = r10
            r1.mSharpenAmount = r5
            r1.mSharpenOverRatio = r5
            r3 = 1086324736(0x40c00000, float:6.0)
            r1.mSharpenEdgeWeightGamma = r3
            r1.mSharpenSceneMode = r2
            r1.mSharpenSdkParams = r11
            android.content.Context r7 = r9.mContext
            r1.mContext = r7
            com.bykv.vk.component.ttvideo.ILiveListener r3 = r9.mListener
            r1.mListener = r3
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r4 = r9.mSettingsBundle
            r1.mSettingsBundle = r4
            long r5 = r1.mStallRetryTimeIntervalManager
            r9.setStallRetryInterval(r5)
            if (r4 == 0) goto L2bb
            java.lang.String r5 = "live_sdk_should_report_session_stop"
            java.lang.Object r5 = r4.getSettingsValueForKey(r5, r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.mEnableReportSessionStop = r5
            java.lang.String r5 = "live_sdk_enable_use_live_threadpool"
            java.lang.Object r0 = r4.getSettingsValueForKey(r5, r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.mEnableUseLiveThreadPool = r0
        L2bb:
            int r0 = r1.mEnableUseLiveThreadPool
            java.lang.String r4 = "VideoLiveManager"
            if (r0 != r2) goto L2d3
            java.util.concurrent.ExecutorService r0 = r9.mLiveThreadPool
            if (r0 == 0) goto L2d3
            java.lang.String r0 = "use live threadpool"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r4, r0)
            java.util.concurrent.ExecutorService r0 = r9.mLiveThreadPool
            r1.mExecutor = r0
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService
            r0.mUseLiveThreadPool = r2
            goto L2f1
        L2d3:
            java.lang.String r0 = "create new threadpool"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r4, r0)
            com.bytedance.sdk.component.oq.r.r r12 = new com.bytedance.sdk.component.oq.r.r
            java.util.concurrent.TimeUnit r17 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingDeque r18 = new java.util.concurrent.LinkedBlockingDeque
            r18.<init>()
            com.bykv.vk.component.ttvideo.VideoLiveManager$1 r0 = new com.bykv.vk.component.ttvideo.VideoLiveManager$1
            r0.<init>(r1)
            r13 = 1
            r14 = 3
            r15 = 60
            r19 = r0
            r12.<init>(r13, r14, r15, r17, r18, r19)
            r1.mExecutor = r12
        L2f1:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = new com.bykv.vk.component.ttvideo.log.LiveLoggerService
            r2 = r3
            long r3 = r9.mUploadLogInterval
            long r5 = r9.mStallRetryTimeInterval
            int r8 = r1.mEnableReportSessionStop
            r0.<init>(r1, r2, r3, r5, r7, r8)
            r1.mLogService = r0
            java.lang.String r2 = r9.mProjectKey
            r0.setProjectKey(r2)
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r0 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r1.mLogService
            r0.setLogService(r2)
            com.bykv.vk.component.ttvideo.retry.RetryProcessor r12 = new com.bykv.vk.component.ttvideo.retry.RetryProcessor
            com.bykv.vk.component.ttvideo.VideoLiveManager$MyRetryListener r13 = new com.bykv.vk.component.ttvideo.VideoLiveManager$MyRetryListener
            r13.<init>(r1)
            int r14 = r9.mRetryTimeout
            long r2 = r9.mStallRetryTimeInterval
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService
            r17 = r0
            r15 = r2
            r12.<init>(r13, r14, r15, r17)
            r1.mRetryProcessor = r12
            com.bykv.vk.component.ttvideo.playerwrapper.PlayerSetting r0 = new com.bykv.vk.component.ttvideo.playerwrapper.PlayerSetting
            r0.<init>(r7, r11)
            r1.mPlayerSetting = r0
            boolean r0 = r9.mForceHttpDns
            r1.mForceHttpDns = r0
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r1.mLogService
            r2.mEnableHttpDns = r0
            com.bykv.vk.component.ttvideo.INetworkClient r0 = r9.mNetworkClient
            r1.mNetworkClient = r0
            com.bykv.vk.component.ttvideo.network.DnsHelper r2 = new com.bykv.vk.component.ttvideo.network.DnsHelper
            java.util.concurrent.ExecutorService r3 = r1.mExecutor
            r2.<init>(r7, r3, r0)
            r1.mDnsParser = r2
            r2.updateDNSServerIP()
            int r0 = r9.mPlayerType
            r1.mPlayerType = r0
            java.lang.String r0 = r9.mVideoFormat
            r1.mStreamFormat = r0
            java.lang.String r0 = r9.mResolution
            r1.mResolution = r0
            r1.mStallCount = r10
            boolean r0 = r9.mEnableResolutionAutoDegrade
            r1.mEnableResolutionAutoDegrade = r0
            boolean r0 = r9.mEnableSwitchMainAndBackupUrl
            r1.mEnableSwitchMainAndBackupUrl = r0
            long r2 = r9.mSeiCheckTimeOut
            r1.mSeiDiffThres = r2
            return
    }

    /* synthetic */ VideoLiveManager(com.bykv.vk.component.ttvideo.VideoLiveManager.Builder r1, com.bykv.vk.component.ttvideo.VideoLiveManager.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private boolean HttpKDegradeHttp(int r6) {
            r5 = this;
            java.lang.String r0 = r5.mCurrentPlayURL
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "httpk"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L4c
            java.lang.String r0 = r5.mCurrentPlayURL
            java.lang.String r3 = "http"
            java.lang.String r0 = r0.replaceAll(r2, r3)
            java.lang.String r2 = ":(\\d+)/"
            java.lang.String r3 = "/"
            java.lang.String r0 = r0.replaceAll(r2, r3)
            if (r0 == 0) goto L4c
            r5.updateDownloadSizeStat()
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r5.mLogService
            r1.onSessionStop()
            r1 = 1
            r5.mIsRetrying = r1
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r5.mLogService
            r2.onSwitchURL(r0)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r5.mLogService
            java.lang.String r3 = r5.mCurrentPlayURL
            java.lang.String r4 = "httpk_to_http"
            r2.onSwitch(r3, r0, r4, r6)
            r5.mCurrentPlayURL = r0
            r5._stopPlayer()
            r5._resetPlayer()
            long r2 = java.lang.System.currentTimeMillis()
            r5.mSessionStartTime = r2
            java.lang.String r6 = r5.mCurrentPlayURL
            r5.parsePlayDNS(r6)
        L4c:
            return r1
    }

    private boolean QuicDegrade(int r6) {
            r5 = this;
            java.lang.String r0 = r5.mCurrentPlayURL
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r0 = r5.mTransportProtocol
            java.lang.String r2 = "quic"
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L1c
            java.lang.String r0 = r5.mTransportProtocol
            java.lang.String r2 = "quicu"
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L1b
            goto L1c
        L1b:
            return r1
        L1c:
            r0 = -499499(0xfffffffffff860d5, float:NaN)
            if (r6 == r0) goto L22
            return r1
        L22:
            java.lang.String r0 = r5.mURLProtocol
            java.lang.String r1 = "tls"
            boolean r0 = r0.equals(r1)
            java.lang.String r2 = "httpq"
            if (r0 == 0) goto L39
            r5.mTransportProtocol = r1
            java.lang.String r0 = r5.mCurrentPlayURL
            java.lang.String r1 = "https"
            java.lang.String r0 = r0.replaceAll(r2, r1)
            goto L5a
        L39:
            java.lang.String r0 = r5.mURLProtocol
            java.lang.String r1 = "kcp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4e
            r5.mTransportProtocol = r1
            java.lang.String r0 = r5.mCurrentPlayURL
            java.lang.String r1 = "httpk"
            java.lang.String r0 = r0.replaceAll(r2, r1)
            goto L5a
        L4e:
            java.lang.String r0 = "tcp"
            r5.mTransportProtocol = r0
            java.lang.String r0 = r5.mCurrentPlayURL
            java.lang.String r1 = "http"
            java.lang.String r0 = r0.replaceAll(r2, r1)
        L5a:
            java.lang.String r1 = ":(\\d+)/"
            java.lang.String r2 = "/"
            java.lang.String r0 = r0.replaceAll(r1, r2)
            r5.updateDownloadSizeStat()
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r5.mLogService
            r1.onSessionStop()
            r1 = 1
            r5.mIsRetrying = r1
            if (r0 == 0) goto L90
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r5.mLogService
            r2.onSwitchURL(r0)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r5.mLogService
            java.lang.String r3 = r5.mCurrentPlayURL
            java.lang.String r4 = "quic_library_load_error"
            r2.onSwitch(r3, r0, r4, r6)
            r5.mCurrentPlayURL = r0
            r5._stopPlayer()
            r5._resetPlayer()
            long r2 = java.lang.System.currentTimeMillis()
            r5.mSessionStartTime = r2
            java.lang.String r6 = r5.mCurrentPlayURL
            r5.parsePlayDNS(r6)
        L90:
            return r1
    }

    private java.lang.String _addParamToURL(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = "="
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            java.lang.String r5 = "?"
            int r0 = r3.indexOf(r5)
            r1 = -1
            if (r0 != r1) goto L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            goto L48
        L32:
            int r5 = r3.length()
            int r5 = r5 + (-1)
            if (r0 == r5) goto L48
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "&"
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
        L48:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            return r3
    }

    private void _checkStreamData() {
            r2 = this;
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r2.mURLSource
            if (r0 != 0) goto L6
            goto L7f
        L6:
            boolean r1 = r2.mEnableOriginResolution
            r0.setEnableOriginResolution(r1)
            boolean r0 = r2.mEnableResolutionAutoDegrade
            if (r0 == 0) goto L7f
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r2.mURLSource
            int r0 = r0.getSourceType()
            r1 = 2
            if (r0 != r1) goto L7f
            java.lang.String r0 = r2.mAbrStrategy
            java.lang.String r1 = "abr_bb_4live"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7f
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r2.mURLSource
            java.lang.String r0 = r0.getDefaultResolution()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L43
            boolean r1 = r2.mEnableOriginResolution
            if (r1 != 0) goto L40
            java.lang.String r1 = "origin"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L40
            java.lang.String r0 = "uhd"
            r2._smartResolveDefaultResolution(r0)
            goto L43
        L40:
            r2._smartResolveDefaultResolution(r0)
        L43:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r2.mURLSource
            boolean r0 = r0.isABRListMatch()
            if (r0 == 0) goto L55
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r2.mURLSource
            java.lang.String r1 = r2.mLevel
            boolean r0 = r0.isCodecSame(r1)
            if (r0 != 0) goto L7f
        L55:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r2.mURLSource
            java.lang.String r0 = r0.getDefaultResolution()
            r2.mResolution = r0
            java.lang.String r0 = "rad"
            r2.mAbrStrategy = r0
            r0 = 0
            r2.mEnableResolutionAutoDegrade = r0
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r1 = r2.mURLSource
            boolean r1 = r1.isABRListMatch()
            if (r1 != 0) goto L70
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r2.mLogService
            r1.mABRListMatch = r0
        L70:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r2.mURLSource
            java.lang.String r1 = r2.mLevel
            boolean r0 = r0.isCodecSame(r1)
            if (r0 != 0) goto L7f
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r2.mLogService
            r1 = 1
            r0.mCodecNotSame = r1
        L7f:
            return
    }

    private void _checkValidAbrResolution() {
            r4 = this;
            java.lang.String r0 = r4.mAbrStrategy
            java.lang.String r1 = "abr_bb_4live"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L50
            boolean r0 = r4.mEnableResolutionAutoDegrade
            if (r0 != 0) goto Lf
            goto L50
        Lf:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r4.mURLSource
            java.lang.String r1 = r4.mResolution
            boolean r0 = r0.isEnableAdaptive(r1)
            if (r0 != 0) goto L50
            r0 = 0
        L1a:
            java.lang.String[] r1 = com.bykv.vk.component.ttvideo.LiveConfigKey.resolution
            int r2 = r1.length
            if (r0 >= r2) goto L50
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = r4.mURLSource
            r3 = r1[r0]
            boolean r2 = r2.isEnableAdaptive(r3)
            if (r2 == 0) goto L4d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Abr res check.modify from "
            r2.<init>(r3)
            java.lang.String r3 = r4.mResolution
            r2.append(r3)
            java.lang.String r3 = " to "
            r2.append(r3)
            r3 = r1[r0]
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r3, r2)
            r0 = r1[r0]
            r4.mResolution = r0
            return
        L4d:
            int r0 = r0 + 1
            goto L1a
        L50:
            return
    }

    private void _configAbrInfo() {
            r10 = this;
            java.lang.String r0 = "disable_algorithm"
            java.lang.String r1 = "enable_origin_resolution"
            java.lang.String r2 = "strategy"
            java.lang.String r3 = "enable"
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r4 = r10.mURLSource
            org.json.JSONObject r4 = r4.getAbrInfo()
            r5 = 4
            java.lang.String r6 = "rad"
            r7 = 0
            if (r4 == 0) goto L62
            r8 = 1
            r10.mHasAbrInfo = r8
            boolean r9 = r4.has(r3)     // Catch: org.json.JSONException -> L29
            if (r9 == 0) goto L2b
            int r3 = r4.optInt(r3)     // Catch: org.json.JSONException -> L29
            if (r3 != r8) goto L25
            r3 = 1
            goto L26
        L25:
            r3 = 0
        L26:
            r10.mEnableResolutionAutoDegrade = r3     // Catch: org.json.JSONException -> L29
            goto L2b
        L29:
            r0 = move-exception
            goto L54
        L2b:
            boolean r3 = r4.has(r2)     // Catch: org.json.JSONException -> L29
            if (r3 == 0) goto L37
            java.lang.String r2 = r4.getString(r2)     // Catch: org.json.JSONException -> L29
            r10.mAbrStrategy = r2     // Catch: org.json.JSONException -> L29
        L37:
            boolean r2 = r4.has(r1)     // Catch: org.json.JSONException -> L29
            if (r2 == 0) goto L47
            int r1 = r4.optInt(r1)     // Catch: org.json.JSONException -> L29
            if (r1 != r8) goto L44
            goto L45
        L44:
            r8 = 0
        L45:
            r10.mEnableOriginResolution = r8     // Catch: org.json.JSONException -> L29
        L47:
            boolean r1 = r4.has(r0)     // Catch: org.json.JSONException -> L29
            if (r1 == 0) goto L53
            int r0 = r4.optInt(r0)     // Catch: org.json.JSONException -> L29
            r10.mABRDisableAlgorithm = r0     // Catch: org.json.JSONException -> L29
        L53:
            return
        L54:
            com.bytedance.sdk.component.utils.vl.j(r0)
            r10.mHasAbrInfo = r7
            r10.mEnableResolutionAutoDegrade = r7
            r10.mAbrStrategy = r6
            r10.mEnableOriginResolution = r7
            r10.mStallCountThresOfResolutionDegrade = r5
            return
        L62:
            r10.mHasAbrInfo = r7
            r10.mEnableResolutionAutoDegrade = r7
            r10.mEnableOriginResolution = r7
            r10.mAbrStrategy = r6
            r10.mStallCountThresOfResolutionDegrade = r5
            return
    }

    private void _configAvphNeqStrategy() {
            r3 = this;
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r0 = r3.mSettingsBundle
            java.lang.String r1 = "live_sdk_low_latency_flv_default_strategy_map"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.getSettingsValueForKey(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r0.length()
            if (r1 <= 0) goto L1c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L18
            r1.<init>(r0)     // Catch: org.json.JSONException -> L18
            goto L1d
        L18:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L1c:
            r1 = 0
        L1d:
            if (r1 != 0) goto L20
            goto L30
        L20:
            java.lang.String r0 = "net_effective_connection_type_strategy"
            boolean r2 = r1.has(r0)
            if (r2 == 0) goto L30
            r1.getJSONObject(r0)     // Catch: org.json.JSONException -> L2c
            goto L30
        L2c:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L30:
            return
    }

    private void _configFlvLowLatencyWithSDKParam() {
            r13 = this;
            java.lang.String r0 = "EnableLowLatencyFLV"
            java.lang.String r1 = "FastOpenDuration"
            java.lang.String r2 = "SlowSpeed"
            java.lang.String r3 = "SlowMillisecond"
            java.lang.String r4 = "SlowTime"
            java.lang.String r5 = "HurrySpeed"
            java.lang.String r6 = "HurryMillisecond"
            java.lang.String r7 = "HurryTime"
            java.lang.String r8 = "Enabled"
            java.lang.String r9 = "NetworkAdapt"
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r10 = r13.mURLSource
            java.lang.String r11 = r13.mResolution
            java.lang.String r12 = r13.mLevel
            java.lang.String r10 = r10.getSDKParams(r11, r12)
            if (r10 == 0) goto L10e
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: org.json.JSONException -> L47
            r11.<init>(r10)     // Catch: org.json.JSONException -> L47
            boolean r10 = r11.has(r9)     // Catch: org.json.JSONException -> L47
            if (r10 == 0) goto Le8
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: org.json.JSONException -> L47
            java.lang.String r9 = r11.optString(r9)     // Catch: org.json.JSONException -> L47
            r10.<init>(r9)     // Catch: org.json.JSONException -> L47
            boolean r9 = r10.has(r8)     // Catch: org.json.JSONException -> L47
            if (r9 == 0) goto Le8
            int r8 = r10.optInt(r8)     // Catch: org.json.JSONException -> L47
            r13.mEnableHurryFlag = r8     // Catch: org.json.JSONException -> L47
            r9 = 1
            if (r8 != r9) goto L4a
            r8 = 0
            r13.mHurryType = r8     // Catch: org.json.JSONException -> L47
            goto L4a
        L47:
            r0 = move-exception
            goto L10b
        L4a:
            boolean r8 = r10.has(r7)     // Catch: org.json.JSONException -> L47
            if (r8 == 0) goto L63
            int r7 = r10.optInt(r7)     // Catch: org.json.JSONException -> L47
            r13.mHurryTime = r7     // Catch: org.json.JSONException -> L47
            com.bykv.vk.component.ttvideo.player.MediaPlayer r8 = r13.mPlayer     // Catch: org.json.JSONException -> L47
            r9 = 15
            r8.setIntOption(r9, r7)     // Catch: org.json.JSONException -> L47
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r7 = r13.mLogService     // Catch: org.json.JSONException -> L47
            int r8 = r13.mHurryTime     // Catch: org.json.JSONException -> L47
            r7.mHurryTime = r8     // Catch: org.json.JSONException -> L47
        L63:
            boolean r7 = r10.has(r6)     // Catch: org.json.JSONException -> L47
            if (r7 == 0) goto L7c
            int r6 = r10.optInt(r6)     // Catch: org.json.JSONException -> L47
            r13.mHurryTime = r6     // Catch: org.json.JSONException -> L47
            com.bykv.vk.component.ttvideo.player.MediaPlayer r7 = r13.mPlayer     // Catch: org.json.JSONException -> L47
            r8 = 397(0x18d, float:5.56E-43)
            r7.setIntOption(r8, r6)     // Catch: org.json.JSONException -> L47
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r6 = r13.mLogService     // Catch: org.json.JSONException -> L47
            int r7 = r13.mHurryTime     // Catch: org.json.JSONException -> L47
            r6.mHurryTime = r7     // Catch: org.json.JSONException -> L47
        L7c:
            boolean r6 = r10.has(r5)     // Catch: org.json.JSONException -> L47
            if (r6 == 0) goto L99
            java.lang.String r5 = r10.optString(r5)     // Catch: org.json.JSONException -> L47
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: org.json.JSONException -> L47
            r13.mCatchSpeed = r5     // Catch: org.json.JSONException -> L47
            com.bykv.vk.component.ttvideo.player.MediaPlayer r6 = r13.mPlayer     // Catch: org.json.JSONException -> L47
            r7 = 80
            r6.setFloatOption(r7, r5)     // Catch: org.json.JSONException -> L47
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r13.mLogService     // Catch: org.json.JSONException -> L47
            float r6 = r13.mCatchSpeed     // Catch: org.json.JSONException -> L47
            r5.mCatchSpeed = r6     // Catch: org.json.JSONException -> L47
        L99:
            boolean r5 = r10.has(r4)     // Catch: org.json.JSONException -> L47
            if (r5 == 0) goto Lb2
            int r4 = r10.optInt(r4)     // Catch: org.json.JSONException -> L47
            r13.mSlowPlayTime = r4     // Catch: org.json.JSONException -> L47
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r13.mPlayer     // Catch: org.json.JSONException -> L47
            r6 = 190(0xbe, float:2.66E-43)
            r5.setIntOption(r6, r4)     // Catch: org.json.JSONException -> L47
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r4 = r13.mLogService     // Catch: org.json.JSONException -> L47
            int r5 = r13.mSlowPlayTime     // Catch: org.json.JSONException -> L47
            r4.mSlowPlayTime = r5     // Catch: org.json.JSONException -> L47
        Lb2:
            boolean r4 = r10.has(r3)     // Catch: org.json.JSONException -> L47
            if (r4 == 0) goto Lcb
            int r3 = r10.optInt(r3)     // Catch: org.json.JSONException -> L47
            r13.mSlowPlayTime = r3     // Catch: org.json.JSONException -> L47
            com.bykv.vk.component.ttvideo.player.MediaPlayer r4 = r13.mPlayer     // Catch: org.json.JSONException -> L47
            r5 = 398(0x18e, float:5.58E-43)
            r4.setIntOption(r5, r3)     // Catch: org.json.JSONException -> L47
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r3 = r13.mLogService     // Catch: org.json.JSONException -> L47
            int r4 = r13.mSlowPlayTime     // Catch: org.json.JSONException -> L47
            r3.mSlowPlayTime = r4     // Catch: org.json.JSONException -> L47
        Lcb:
            boolean r3 = r10.has(r2)     // Catch: org.json.JSONException -> L47
            if (r3 == 0) goto Le8
            java.lang.String r2 = r10.optString(r2)     // Catch: org.json.JSONException -> L47
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: org.json.JSONException -> L47
            r13.mSlowPlaySpeed = r2     // Catch: org.json.JSONException -> L47
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r13.mPlayer     // Catch: org.json.JSONException -> L47
            r4 = 191(0xbf, float:2.68E-43)
            r3.setFloatOption(r4, r2)     // Catch: org.json.JSONException -> L47
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r13.mLogService     // Catch: org.json.JSONException -> L47
            float r3 = r13.mSlowPlaySpeed     // Catch: org.json.JSONException -> L47
            r2.mSlowSpeed = r3     // Catch: org.json.JSONException -> L47
        Le8:
            boolean r2 = r11.has(r1)     // Catch: org.json.JSONException -> L47
            if (r2 == 0) goto Lf4
            int r1 = r11.optInt(r1)     // Catch: org.json.JSONException -> L47
            com.bykv.vk.component.ttvideo.VideoLiveManager.mFastOpenDuration = r1     // Catch: org.json.JSONException -> L47
        Lf4:
            boolean r1 = r11.has(r0)     // Catch: org.json.JSONException -> L47
            if (r1 == 0) goto L10e
            int r0 = r11.optInt(r0)     // Catch: org.json.JSONException -> L47
            r13.mEnableLowLatencyFLV = r0     // Catch: org.json.JSONException -> L47
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r13.mLogService     // Catch: org.json.JSONException -> L47
            r0.getStallTotalCount()     // Catch: org.json.JSONException -> L47
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r13.mLogService     // Catch: org.json.JSONException -> L47
            r0.getRetryTotalCount()     // Catch: org.json.JSONException -> L47
            return
        L10b:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L10e:
            return
    }

    private void _configLiveSettingBundle() {
            r8 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            if (r2 != 0) goto L11
            goto L326
        L11:
            java.lang.String r3 = "live_enable_check_drop_audio"
            java.lang.Object r2 = r2.getSettingsValueForKey(r3, r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.mEnableCheckDropAudio = r2
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            r3 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "live_option_render_type"
            java.lang.Object r2 = r2.getSettingsValueForKey(r4, r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.mRenderType = r2
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            java.lang.String r3 = "live_enable_cmaf_fast_mode"
            java.lang.Object r2 = r2.getSettingsValueForKey(r3, r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.mEnableCmafFastMode = r2
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            r3 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "live_start_play_buffer_thres"
            java.lang.Object r2 = r2.getSettingsValueForKey(r4, r3)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r8.mStartPlayBufferThres = r2
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            java.lang.String r3 = "live_check_buffering_end_ignore_video"
            java.lang.Object r2 = r2.getSettingsValueForKey(r3, r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.mCheckBufferingEndIgnoreVideo = r2
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            java.lang.String r3 = "live_direct_start_after_prepared"
            java.lang.Object r2 = r2.getSettingsValueForKey(r3, r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.mStartDirectAfterPrepared = r2
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            java.lang.String r3 = "live_check_buffering_end_advance"
            java.lang.Object r2 = r2.getSettingsValueForKey(r3, r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.mCheckBufferingEndAdvanceEnable = r2
            boolean r2 = r8.mHasAbrInfo
            if (r2 != 0) goto Lb5
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            java.lang.String r3 = "live_enable_resolution_degrade"
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.Object r2 = r2.getSettingsValueForKey(r3, r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r8.mEnableResolutionAutoDegrade = r2
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            r3 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "live_stall_count_thres_for_degrade"
            java.lang.Object r2 = r2.getSettingsValueForKey(r4, r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.mStallCountThresOfResolutionDegrade = r2
        Lb5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mEnableResolutionAutoDegrade:"
            r2.<init>(r3)
            boolean r3 = r8.mEnableResolutionAutoDegrade
            r2.append(r3)
            java.lang.String r3 = " mStallCountThresOfResolutionDegrade:"
            r2.append(r3)
            int r3 = r8.mStallCountThresOfResolutionDegrade
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r3, r2)
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            java.lang.String r4 = "live_open_mdl_enable"
            java.lang.Object r2 = r2.getSettingsValueForKey(r4, r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.mEnableOpenMDL = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "enable mdl:"
            r2.<init>(r4)
            int r4 = r8.mEnableOpenMDL
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r3, r2)
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            java.lang.String r4 = "live_enable_tcp_fast_open"
            java.lang.Object r2 = r2.getSettingsValueForKey(r4, r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.mEnableTcpFastOpen = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "enable tfo:"
            r2.<init>(r4)
            int r4 = r8.mEnableTcpFastOpen
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r3, r2)
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            java.lang.String r4 = "live_enable_check_packet_corrupt"
            java.lang.Object r2 = r2.getSettingsValueForKey(r4, r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.mEnableCheckPacketCorrupt = r2
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            java.lang.String r4 = "live_enable_flv_abr"
            java.lang.Object r2 = r2.getSettingsValueForKey(r4, r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.mEnableFlvABR = r2
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.String r5 = "live_sdk_http_dns_enabled"
            java.lang.Object r2 = r2.getSettingsValueForKey(r5, r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r8.mForceHttpDns = r2
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            java.lang.String r5 = "live_sdk_http_dns_server_host"
            java.lang.String r6 = "null"
            java.lang.Object r2 = r2.getSettingsValueForKey(r5, r6)
            java.lang.String r2 = (java.lang.String) r2
            r8.mHttpDNSServerHost = r2
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r8.mLogService
            boolean r5 = r8.mForceHttpDns
            r2.mEnableHttpDns = r5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "enable http dns:"
            r2.<init>(r5)
            boolean r5 = r8.mForceHttpDns
            r2.append(r5)
            java.lang.String r5 = " http dns server: "
            r2.append(r5)
            java.lang.String r5 = r8.mHttpDNSServerHost
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r3, r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r8.mLogService
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r5 = r8.mSettingsBundle
            java.lang.String r7 = "live_sdk_ntp_server_name"
            java.lang.Object r5 = r5.getSettingsValueForKey(r7, r6)
            java.lang.String r5 = (java.lang.String) r5
            r2.mHostNTPUrl = r5
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            java.lang.String r5 = "live_sdk_cancel_sdk_dns_fail_retry"
            java.lang.Object r2 = r2.getSettingsValueForKey(r5, r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r8.mCancelSDKDNSFailRetry = r2
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            java.lang.String r4 = "live_enable_close_play_retry"
            java.lang.Object r2 = r2.getSettingsValueForKey(r4, r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.mEnableClosePlayRetry = r2
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            java.lang.String r4 = "live_sdk_optimize_backup_enabled"
            java.lang.Object r2 = r2.getSettingsValueForKey(r4, r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.mEnableOptimizeBackup = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "enable optimize backup ip:"
            r2.<init>(r4)
            int r4 = r8.mEnableOptimizeBackup
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r3, r2)
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            java.lang.String r4 = "live_sdk_stall_retry_instantly_enabled"
            r5 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r2.getSettingsValueForKey(r4, r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.mEnableStallRetryInstantly = r2
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            java.lang.String r4 = "live_sdk_audio_volume_balance_enable"
            java.lang.Object r2 = r2.getSettingsValueForKey(r4, r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.mEnableAudioVolumeBalance = r2
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            java.lang.String r4 = "live_sdk_audio_volume_balance_pregain"
            java.lang.Object r2 = r2.getSettingsValueForKey(r4, r0)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r8.mAudioVolumeBalancePregain = r2
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            java.lang.String r4 = "live_sdk_audio_volume_balance_threshold"
            java.lang.Object r2 = r2.getSettingsValueForKey(r4, r0)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r8.mAudioVolumeBalanceThreshold = r2
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            java.lang.String r4 = "live_sdk_audio_volume_balance_ratio"
            java.lang.Object r2 = r2.getSettingsValueForKey(r4, r0)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r8.mAudioVolumeBalanceRatio = r2
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r8.mSettingsBundle
            java.lang.String r4 = "live_sdk_audio_volume_balance_predelay"
            java.lang.Object r0 = r2.getSettingsValueForKey(r4, r0)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r8.mAudioVolumeBalancePredelay = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "audio balance:"
            r0.<init>(r2)
            int r2 = r8.mEnableAudioVolumeBalance
            r0.append(r2)
            java.lang.String r2 = ","
            r0.append(r2)
            float r4 = r8.mAudioVolumeBalancePregain
            r0.append(r4)
            r0.append(r2)
            float r4 = r8.mAudioVolumeBalanceThreshold
            r0.append(r4)
            r0.append(r2)
            float r4 = r8.mAudioVolumeBalanceRatio
            r0.append(r4)
            r0.append(r2)
            float r2 = r8.mAudioVolumeBalancePredelay
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r3, r0)
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r0 = r8.mSettingsBundle
            java.lang.String r2 = "live_sdk_enable_sei_pts_synced"
            java.lang.Object r0 = r0.getSettingsValueForKey(r2, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8.mEnableCacheSei = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "enable sei pts sync:"
            r0.<init>(r2)
            int r2 = r8.mEnableCacheSei
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r3, r0)
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r0 = r8.mSettingsBundle
            r6 = 10000(0x2710, double:4.9407E-320)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r4 = "stall_retry_time_interval_manager"
            java.lang.Object r0 = r0.getSettingsValueForKey(r4, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            long r6 = r0.longValue()
            r8.mStallRetryTimeIntervalManager = r6
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r0 = r8.mSettingsBundle
            java.lang.String r2 = "live_sdk_enable_decode_multi_sei"
            java.lang.Object r0 = r0.getSettingsValueForKey(r2, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8.mEnableDecodeMultiSei = r0
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r0 = r8.mSettingsBundle
            java.lang.String r2 = "live_sdk_enable_radiolive_disable_render"
            java.lang.Object r0 = r0.getSettingsValueForKey(r2, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8.mEnableRadioLiveDisableRender = r0
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r0 = r8.mSettingsBundle
            java.lang.String r2 = "live_sdk_enable_liveio"
            java.lang.Object r0 = r0.getSettingsValueForKey(r2, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8.mEnableOpenLiveIO = r0
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r0 = r8.mSettingsBundle
            java.lang.String r2 = "live_sdk_enable_decode_sei_once"
            java.lang.Object r0 = r0.getSettingsValueForKey(r2, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8.mEnableDecodeSeiOnce = r0
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r0 = r8.mSettingsBundle
            java.lang.String r2 = "live_sdk_notify_sei_immediately_before_first_frame_enabled"
            java.lang.Object r0 = r0.getSettingsValueForKey(r2, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.intValue()
            r8.mEnableNotifySeiImmediatelyBeforeFirstFrame = r5
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r0 = r8.mSettingsBundle
            java.lang.String r2 = "live_sdk_dropping_dts_rollback_frame_enabled"
            java.lang.Object r0 = r0.getSettingsValueForKey(r2, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8.mEnableDroppingDTSRollFrame = r0
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r0 = r8.mSettingsBundle
            java.lang.String r1 = "live_sdk_low_latency_flv_default_strategy_map"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.getSettingsValueForKey(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r0.length()
            if (r1 <= 0) goto L326
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L31a
            r1.<init>(r0)     // Catch: org.json.JSONException -> L31a
            r8.mLowLatencyFLVStrategy = r1     // Catch: org.json.JSONException -> L31a
            return
        L31a:
            r0 = move-exception
            r1 = 0
            r8.mLowLatencyFLVStrategy = r1
            com.bytedance.sdk.component.utils.vl.j(r0)
            java.lang.String r0 = "strategy settings invalid"
            com.bykv.vk.component.ttvideo.log.MyLog.e(r3, r0)
        L326:
            return
    }

    private void _configWithLowLatencyFLVStrategy(org.json.JSONObject r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L13
        L3:
            java.lang.String r0 = "net_effective_connection_type_strategy"
            boolean r1 = r3.has(r0)
            if (r1 == 0) goto L13
            r3.getJSONObject(r0)     // Catch: org.json.JSONException -> Lf
            return
        Lf:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L13:
            return
    }

    private void _configWithSDKParams() {
            r23 = this;
            r1 = r23
            java.lang.String r0 = "AVPHReadErrorExit"
            java.lang.String r2 = "AVPHReadRetryCount"
            java.lang.String r3 = "AVPHVideoDiffThreshold"
            java.lang.String r4 = "AVPHAutoReopen"
            java.lang.String r5 = "AVPHAutoExit"
            java.lang.String r6 = "AVPHMaxAVDiff"
            java.lang.String r7 = "AVPHOpenVideoFirst"
            java.lang.String r8 = "AVPHAudioMaxDuration"
            java.lang.String r9 = "AVPHAudioProbesize"
            java.lang.String r10 = "AVPHVideoMaxDuration"
            java.lang.String r11 = "AVPHVideoProbesize"
            java.lang.String r12 = "AVPHDnsTimeout"
            java.lang.String r13 = "AVPHDnsParseEnable"
            java.lang.String r14 = "FramesDrop"
            java.lang.String r15 = "vbitrate"
            r16 = r2
            java.lang.String r2 = "StallCount"
            r17 = r3
            java.lang.String r3 = "Demotion"
            r18 = r4
            java.lang.String r4 = "Auto"
            r19 = r5
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r5 = r1.mURLSource
            r20 = r6
            java.lang.String r6 = r1.mResolution
            r21 = r7
            java.lang.String r7 = r1.mLevel
            java.lang.String r5 = r5.getSDKParams(r6, r7)
            if (r5 == 0) goto L81e
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6c
            r6.<init>(r5)     // Catch: org.json.JSONException -> L6c
            boolean r5 = r1.mHasAbrInfo     // Catch: org.json.JSONException -> L6c
            java.lang.String r7 = "Enable"
            r22 = r5
            r5 = 1
            if (r22 != 0) goto L8a
            boolean r22 = r6.has(r4)     // Catch: org.json.JSONException -> L6c
            if (r22 == 0) goto L8a
            org.json.JSONObject r4 = r6.getJSONObject(r4)     // Catch: org.json.JSONException -> L6c
            if (r4 == 0) goto L8a
            boolean r22 = r4.has(r7)     // Catch: org.json.JSONException -> L6c
            if (r22 == 0) goto L6f
            r22 = r8
            int r8 = r4.optInt(r7)     // Catch: org.json.JSONException -> L6c
            if (r8 != r5) goto L68
            r8 = 1
            goto L69
        L68:
            r8 = 0
        L69:
            r1.mEnableResolutionAutoDegrade = r8     // Catch: org.json.JSONException -> L6c
            goto L71
        L6c:
            r0 = move-exception
            goto L81b
        L6f:
            r22 = r8
        L71:
            boolean r8 = r4.has(r3)     // Catch: org.json.JSONException -> L6c
            if (r8 == 0) goto L8c
            org.json.JSONObject r3 = r4.getJSONObject(r3)     // Catch: org.json.JSONException -> L6c
            if (r3 == 0) goto L8c
            boolean r4 = r3.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r4 == 0) goto L8c
            int r2 = r3.getInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mStallCountThresOfResolutionDegrade = r2     // Catch: org.json.JSONException -> L6c
            goto L8c
        L8a:
            r22 = r8
        L8c:
            boolean r2 = r6.has(r15)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L98
            int r2 = r6.optInt(r15)     // Catch: org.json.JSONException -> L6c
            r1.mDefaultResBitrate = r2     // Catch: org.json.JSONException -> L6c
        L98:
            boolean r2 = r6.has(r14)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto La4
            int r2 = r6.optInt(r14)     // Catch: org.json.JSONException -> L6c
            r1.mFramesDrop = r2     // Catch: org.json.JSONException -> L6c
        La4:
            boolean r2 = r6.has(r13)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto Lb0
            int r2 = r6.optInt(r13)     // Catch: org.json.JSONException -> L6c
            r1.mAVPHDnsParseEnable = r2     // Catch: org.json.JSONException -> L6c
        Lb0:
            boolean r2 = r6.has(r12)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto Lbc
            int r2 = r6.optInt(r12)     // Catch: org.json.JSONException -> L6c
            r1.mAVPHDnsTimeout = r2     // Catch: org.json.JSONException -> L6c
        Lbc:
            boolean r2 = r6.has(r11)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto Lc8
            int r2 = r6.optInt(r11)     // Catch: org.json.JSONException -> L6c
            r1.mAVPHVideoProbesize = r2     // Catch: org.json.JSONException -> L6c
        Lc8:
            boolean r2 = r6.has(r10)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto Ld4
            int r2 = r6.optInt(r10)     // Catch: org.json.JSONException -> L6c
            r1.mAVPHVideoMaxDuration = r2     // Catch: org.json.JSONException -> L6c
        Ld4:
            boolean r2 = r6.has(r9)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto Le0
            int r2 = r6.optInt(r9)     // Catch: org.json.JSONException -> L6c
            r1.mAVPHAudioProbesize = r2     // Catch: org.json.JSONException -> L6c
        Le0:
            r2 = r22
            boolean r3 = r6.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r3 == 0) goto Lee
            int r2 = r6.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mAVPHAudioMaxDuration = r2     // Catch: org.json.JSONException -> L6c
        Lee:
            r2 = r21
            boolean r3 = r6.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r3 == 0) goto Lfc
            int r2 = r6.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mAVPHOpenVideoFirst = r2     // Catch: org.json.JSONException -> L6c
        Lfc:
            r2 = r20
            boolean r3 = r6.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r3 == 0) goto L10a
            int r2 = r6.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mAVPHMaxAVDiff = r2     // Catch: org.json.JSONException -> L6c
        L10a:
            r2 = r19
            boolean r3 = r6.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r3 == 0) goto L118
            int r2 = r6.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mAVPHAutoExit = r2     // Catch: org.json.JSONException -> L6c
        L118:
            r2 = r18
            boolean r3 = r6.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r3 == 0) goto L126
            int r2 = r6.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mAVPHEnableAutoReopen = r2     // Catch: org.json.JSONException -> L6c
        L126:
            r2 = r17
            boolean r3 = r6.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r3 == 0) goto L134
            int r2 = r6.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mAVPHVideoDiffThreshold = r2     // Catch: org.json.JSONException -> L6c
        L134:
            r2 = r16
            boolean r3 = r6.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r3 == 0) goto L142
            int r2 = r6.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mAVPHReadRetryCount = r2     // Catch: org.json.JSONException -> L6c
        L142:
            boolean r2 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L14e
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mAVPHReadErrorExit = r0     // Catch: org.json.JSONException -> L6c
        L14e:
            java.lang.String r0 = "EnableSkipFindUnnecessaryStream"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L15e
            java.lang.String r0 = "EnableSkipFindUnnecessaryStream"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableSkipFindUnnecessaryStream = r0     // Catch: org.json.JSONException -> L6c
        L15e:
            java.lang.String r0 = "EnableRenderStall"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L16e
            java.lang.String r0 = "EnableRenderStall"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableRenderStall = r0     // Catch: org.json.JSONException -> L6c
        L16e:
            java.lang.String r0 = "VideoRenderStallThreshold"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L17e
            java.lang.String r0 = "VideoRenderStallThreshold"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            com.bykv.vk.component.ttvideo.VideoLiveManager.mVideoRenderStallThreshold = r0     // Catch: org.json.JSONException -> L6c
        L17e:
            java.lang.String r0 = "AudioRenderStallThreshold"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L18e
            java.lang.String r0 = "AudioRenderStallThreshold"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            com.bykv.vk.component.ttvideo.VideoLiveManager.mAudioRenderStallThreshold = r0     // Catch: org.json.JSONException -> L6c
        L18e:
            java.lang.String r0 = "EnableDemuxerStall"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L19e
            java.lang.String r0 = "EnableDemuxerStall"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableDemuxerStall = r0     // Catch: org.json.JSONException -> L6c
        L19e:
            java.lang.String r0 = "EnableDecoderStall"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L1ae
            java.lang.String r0 = "EnableDecoderStall"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableDecoderStall = r0     // Catch: org.json.JSONException -> L6c
        L1ae:
            java.lang.String r0 = "DemuxerStallThreshold"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L1be
            java.lang.String r0 = "DemuxerStallThreshold"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            com.bykv.vk.component.ttvideo.VideoLiveManager.mDemuxerStallThreshold = r0     // Catch: org.json.JSONException -> L6c
        L1be:
            java.lang.String r0 = "DecoderStallThreshold"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L1ce
            java.lang.String r0 = "DecoderStallThreshold"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            com.bykv.vk.component.ttvideo.VideoLiveManager.mDecoderStallThreshold = r0     // Catch: org.json.JSONException -> L6c
        L1ce:
            java.lang.String r0 = "StallCounter"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L1fa
            java.lang.String r0 = "StallCounter"
            org.json.JSONObject r0 = r6.getJSONObject(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L1fa
            boolean r2 = r0.has(r7)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L1ea
            int r2 = r0.optInt(r7)     // Catch: org.json.JSONException -> L6c
            r1.mEnableStallCounter = r2     // Catch: org.json.JSONException -> L6c
        L1ea:
            java.lang.String r2 = "TimeInterval"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L1fa
            java.lang.String r2 = "TimeInterval"
            int r0 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mStallCounterInterval = r0     // Catch: org.json.JSONException -> L6c
        L1fa:
            java.lang.String r0 = "DTSCheckEnabled"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L20a
            java.lang.String r0 = "DTSCheckEnabled"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableDTSCheck = r0     // Catch: org.json.JSONException -> L6c
        L20a:
            java.lang.String r0 = "DroppingRepeatingDataEnabled"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L21a
            java.lang.String r0 = "DroppingRepeatingDataEnabled"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnablePreventDTSBack = r0     // Catch: org.json.JSONException -> L6c
        L21a:
            java.lang.String r0 = "DroppingRepeatingDataDTSMaxDiff"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L22a
            java.lang.String r0 = "DroppingRepeatingDataDTSMaxDiff"
            long r2 = r6.optLong(r0)     // Catch: org.json.JSONException -> L6c
            r1.mFrameDroppingDTSMaxDiff = r2     // Catch: org.json.JSONException -> L6c
        L22a:
            java.lang.String r0 = "EnableSaveSCFG"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L23f
            java.lang.String r0 = "EnableSaveSCFG"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 != r5) goto L23c
            r0 = 1
            goto L23d
        L23c:
            r0 = 0
        L23d:
            r1.mEnableSaveSCFG = r0     // Catch: org.json.JSONException -> L6c
        L23f:
            java.lang.String r0 = "EnableVideoMpdRefresh"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L24f
            java.lang.String r0 = "EnableVideoMpdRefresh"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableVideoMpdRefresh = r0     // Catch: org.json.JSONException -> L6c
        L24f:
            java.lang.String r0 = "TransInfoCheck"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            java.lang.String r2 = "Enabled"
            if (r0 == 0) goto L26b
            java.lang.String r0 = "TransInfoCheck"
            org.json.JSONObject r0 = r6.optJSONObject(r0)     // Catch: org.json.JSONException -> L6c
            boolean r3 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r3 == 0) goto L26b
            int r0 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mEnableCheckFrame = r0     // Catch: org.json.JSONException -> L6c
        L26b:
            java.lang.String r0 = "SEICheck"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L294
            java.lang.String r0 = "SEICheck"
            org.json.JSONObject r0 = r6.optJSONObject(r0)     // Catch: org.json.JSONException -> L6c
            boolean r3 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r3 == 0) goto L294
            int r3 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mEnableCheckSEI = r3     // Catch: org.json.JSONException -> L6c
            int r0 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            if (r0 == r5) goto L28f
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L294
        L28f:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService     // Catch: org.json.JSONException -> L6c
            r0.enableCheckSei()     // Catch: org.json.JSONException -> L6c
        L294:
            java.lang.String r0 = "EnableCacheSei"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L2a4
            java.lang.String r0 = "EnableCacheSei"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableCacheSei = r0     // Catch: org.json.JSONException -> L6c
        L2a4:
            java.lang.String r0 = "gop"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L2b4
            java.lang.String r0 = "gop"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mGopDuration = r0     // Catch: org.json.JSONException -> L6c
        L2b4:
            java.lang.String r0 = "EnableLLASHFastOpen"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L2c4
            java.lang.String r0 = "EnableLLASHFastOpen"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableLLASHFastOpen = r0     // Catch: org.json.JSONException -> L6c
        L2c4:
            java.lang.String r0 = "EnableABRCheckEnhance"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L2d4
            java.lang.String r0 = "EnableABRCheckEnhance"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableLiveAbrCheckEnhance = r0     // Catch: org.json.JSONException -> L6c
        L2d4:
            java.lang.String r0 = "ABRCheckInterval"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L2e4
            java.lang.String r0 = "ABRCheckInterval"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mLiveABRCheckInterval = r0     // Catch: org.json.JSONException -> L6c
        L2e4:
            java.lang.String r0 = "ABRMethod"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L2f4
            java.lang.String r0 = "ABRMethod"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mABRMethod = r0     // Catch: org.json.JSONException -> L6c
        L2f4:
            java.lang.String r0 = "ABRBufferThreshold"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L304
            java.lang.String r0 = "ABRBufferThreshold"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mABRBufferThreshold = r0     // Catch: org.json.JSONException -> L6c
        L304:
            java.lang.String r0 = "MaxCacheSeconds"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L314
            java.lang.String r0 = "MaxCacheSeconds"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mMaxCacheSeconds = r0     // Catch: org.json.JSONException -> L6c
        L314:
            java.lang.String r0 = "MainBackupSwitch"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L334
            java.lang.String r0 = "MainBackupSwitch"
            org.json.JSONObject r0 = r6.optJSONObject(r0)     // Catch: org.json.JSONException -> L6c
            boolean r3 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r3 == 0) goto L334
            int r0 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            if (r0 != 0) goto L332
            r0 = 0
            r1.mEnableSwitchMainAndBackupUrl = r0     // Catch: org.json.JSONException -> L6c
            goto L334
        L332:
            r1.mEnableSwitchMainAndBackupUrl = r5     // Catch: org.json.JSONException -> L6c
        L334:
            java.lang.String r0 = "MinTimeShift"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L344
            java.lang.String r0 = "MinTimeShift"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mTslMinTimeShit = r0     // Catch: org.json.JSONException -> L6c
        L344:
            java.lang.String r0 = "TargetOriginBitRate"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L355
            java.lang.String r0 = "TargetOriginBitRate"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            long r3 = (long) r0     // Catch: org.json.JSONException -> L6c
            r1.mTargetOriginBitRate = r3     // Catch: org.json.JSONException -> L6c
        L355:
            java.lang.String r0 = "AbrStallDegradeImmediately"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L365
            java.lang.String r0 = "AbrStallDegradeImmediately"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableAbrStallDegradeImmediately = r0     // Catch: org.json.JSONException -> L6c
        L365:
            java.lang.String r0 = "HASSessionPath"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L375
            java.lang.String r0 = "HASSessionPath"
            java.lang.String r0 = r6.optString(r0)     // Catch: org.json.JSONException -> L6c
            r1.mCdnSessionPath = r0     // Catch: org.json.JSONException -> L6c
        L375:
            java.lang.String r0 = "DecodeSEIEnabled"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L385
            java.lang.String r0 = "DecodeSEIEnabled"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableUploadSei = r0     // Catch: org.json.JSONException -> L6c
        L385:
            java.lang.String r0 = "NetworkAdapt"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L42d
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6c
            java.lang.String r3 = "NetworkAdapt"
            java.lang.String r3 = r6.optString(r3)     // Catch: org.json.JSONException -> L6c
            r0.<init>(r3)     // Catch: org.json.JSONException -> L6c
            boolean r3 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r3 == 0) goto L42d
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mEnableHurryFlag = r2     // Catch: org.json.JSONException -> L6c
            if (r2 != r5) goto L3a9
            r2 = 0
            r1.mHurryType = r2     // Catch: org.json.JSONException -> L6c
        L3a9:
            java.lang.String r2 = "HurryTime"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L3c0
            java.lang.String r2 = "HurryTime"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mHurryTime = r2     // Catch: org.json.JSONException -> L6c
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r1.mPlayer     // Catch: org.json.JSONException -> L6c
            r4 = 15
            r3.setIntOption(r4, r2)     // Catch: org.json.JSONException -> L6c
        L3c0:
            java.lang.String r2 = "HurryMillisecond"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L3d7
            java.lang.String r2 = "HurryMillisecond"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mHurryTime = r2     // Catch: org.json.JSONException -> L6c
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r1.mPlayer     // Catch: org.json.JSONException -> L6c
            r4 = 397(0x18d, float:5.56E-43)
            r3.setIntOption(r4, r2)     // Catch: org.json.JSONException -> L6c
        L3d7:
            java.lang.String r2 = "HurrySpeed"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L3eb
            java.lang.String r2 = "HurrySpeed"
            java.lang.String r2 = r0.optString(r2)     // Catch: org.json.JSONException -> L6c
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: org.json.JSONException -> L6c
            r1.mCatchSpeed = r2     // Catch: org.json.JSONException -> L6c
        L3eb:
            java.lang.String r2 = "SlowTime"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L402
            java.lang.String r2 = "SlowTime"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mSlowPlayTime = r2     // Catch: org.json.JSONException -> L6c
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r1.mPlayer     // Catch: org.json.JSONException -> L6c
            r4 = 190(0xbe, float:2.66E-43)
            r3.setIntOption(r4, r2)     // Catch: org.json.JSONException -> L6c
        L402:
            java.lang.String r2 = "SlowMillisecond"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L419
            java.lang.String r2 = "SlowMillisecond"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mSlowPlayTime = r2     // Catch: org.json.JSONException -> L6c
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r1.mPlayer     // Catch: org.json.JSONException -> L6c
            r4 = 398(0x18e, float:5.58E-43)
            r3.setIntOption(r4, r2)     // Catch: org.json.JSONException -> L6c
        L419:
            java.lang.String r2 = "SlowSpeed"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L42d
            java.lang.String r2 = "SlowSpeed"
            java.lang.String r0 = r0.optString(r2)     // Catch: org.json.JSONException -> L6c
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: org.json.JSONException -> L6c
            r1.mSlowPlaySpeed = r0     // Catch: org.json.JSONException -> L6c
        L42d:
            java.lang.String r0 = "StartPlayAudioBufferThreshold"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L43e
            java.lang.String r0 = "StartPlayAudioBufferThreshold"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            long r2 = (long) r0     // Catch: org.json.JSONException -> L6c
            r1.mStartPlayBufferThres = r2     // Catch: org.json.JSONException -> L6c
        L43e:
            java.lang.String r0 = "EnableCertVerify"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L453
            java.lang.String r0 = "EnableCertVerify"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 != r5) goto L450
            r0 = 1
            goto L451
        L450:
            r0 = 0
        L451:
            r1.mEnableQuicCertVerify = r0     // Catch: org.json.JSONException -> L6c
        L453:
            java.lang.String r0 = "EnableClosePlayRetry"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L463
            java.lang.String r0 = "EnableClosePlayRetry"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableClosePlayRetry = r0     // Catch: org.json.JSONException -> L6c
        L463:
            java.lang.String r0 = "EnableDnsOptimizer"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L47d
            java.lang.String r0 = "EnableDnsOptimizer"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 != r5) goto L475
            r0 = 1
            goto L476
        L475:
            r0 = 0
        L476:
            r1.mEnableDnsOptimizer = r0     // Catch: org.json.JSONException -> L6c
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r1.mLogService     // Catch: org.json.JSONException -> L6c
            r2.openNodeOptimizer(r0)     // Catch: org.json.JSONException -> L6c
        L47d:
            java.lang.String r0 = "EnableMTUDiscovery"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L48d
            java.lang.String r0 = "EnableMTUDiscovery"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableQuicMTUDiscovery = r0     // Catch: org.json.JSONException -> L6c
        L48d:
            java.lang.String r0 = "InitMTU"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L49d
            java.lang.String r0 = "InitMTU"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mQuicInitMTU = r0     // Catch: org.json.JSONException -> L6c
        L49d:
            java.lang.String r0 = "InitRtt"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L4ad
            java.lang.String r0 = "InitRtt"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mQuicInitRtt = r0     // Catch: org.json.JSONException -> L6c
        L4ad:
            java.lang.String r0 = "MaxCryptoRetransmissions"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L4bd
            java.lang.String r0 = "MaxCryptoRetransmissions"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mQuicMaxCryptoRetransmissions = r0     // Catch: org.json.JSONException -> L6c
        L4bd:
            java.lang.String r0 = "MaxCryptoRetransmissionTimeMs"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L4cd
            java.lang.String r0 = "MaxCryptoRetransmissionTimeMs"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mQuicMaxCryptoRetransmissionTimeMs = r0     // Catch: org.json.JSONException -> L6c
        L4cd:
            java.lang.String r0 = "MaxRetransmissions"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L4dd
            java.lang.String r0 = "MaxRetransmissions"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mQuicMaxRetransmissions = r0     // Catch: org.json.JSONException -> L6c
        L4dd:
            java.lang.String r0 = "MaxRetransmissionTimeMs"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L4ed
            java.lang.String r0 = "MaxRetransmissionTimeMs"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mQuicMaxRetransmissionTimeMs = r0     // Catch: org.json.JSONException -> L6c
        L4ed:
            java.lang.String r0 = "MaxAckDelay"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L4fd
            java.lang.String r0 = "MaxAckDelay"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mQuicMaxAckDelay = r0     // Catch: org.json.JSONException -> L6c
        L4fd:
            java.lang.String r0 = "MinReceivedBeforeAckDecimation"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L50d
            java.lang.String r0 = "MinReceivedBeforeAckDecimation"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mQuicMinReceivedBeforeAckDecimation = r0     // Catch: org.json.JSONException -> L6c
        L50d:
            java.lang.String r0 = "QuicVersion"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L51f
            java.lang.String r0 = "QuicVersion"
            r2 = 39
            int r0 = r6.optInt(r0, r2)     // Catch: org.json.JSONException -> L6c
            r1.mQuicVersion = r0     // Catch: org.json.JSONException -> L6c
        L51f:
            java.lang.String r0 = "PadHello"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L52f
            java.lang.String r0 = "PadHello"
            int r0 = r6.optInt(r0, r5)     // Catch: org.json.JSONException -> L6c
            r1.mQuicPadHello = r0     // Catch: org.json.JSONException -> L6c
        L52f:
            java.lang.String r0 = "FixWillingAndAbleToWrite"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L53f
            java.lang.String r0 = "FixWillingAndAbleToWrite"
            int r0 = r6.optInt(r0, r5)     // Catch: org.json.JSONException -> L6c
            r1.mQuicFixWillingAndAbleToWrite = r0     // Catch: org.json.JSONException -> L6c
        L53f:
            java.lang.String r0 = "FixProcessTimer"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L54f
            java.lang.String r0 = "FixProcessTimer"
            int r0 = r6.optInt(r0, r5)     // Catch: org.json.JSONException -> L6c
            r1.mQuicFixProcessTimer = r0     // Catch: org.json.JSONException -> L6c
        L54f:
            java.lang.String r0 = "QuicReadBlockTimeout"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L561
            java.lang.String r0 = "QuicReadBlockTimeout"
            r2 = 100
            int r0 = r6.optInt(r0, r2)     // Catch: org.json.JSONException -> L6c
            r1.mQuicReadBlockTimeout = r0     // Catch: org.json.JSONException -> L6c
        L561:
            java.lang.String r0 = "QuicReadBlockMode"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L572
            java.lang.String r0 = "QuicReadBlockMode"
            r2 = 0
            int r0 = r6.optInt(r0, r2)     // Catch: org.json.JSONException -> L6c
            r1.mQuicReadBlockMode = r0     // Catch: org.json.JSONException -> L6c
        L572:
            java.lang.String r0 = "FixStreamFinAndRst"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L583
            java.lang.String r0 = "FixStreamFinAndRst"
            r2 = 0
            int r0 = r6.optInt(r0, r2)     // Catch: org.json.JSONException -> L6c
            r1.mQuicFixStreamFinAndRst = r0     // Catch: org.json.JSONException -> L6c
        L583:
            java.lang.String r0 = "QuicTimerVersion"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L593
            java.lang.String r0 = "QuicTimerVersion"
            int r0 = r6.optInt(r0, r5)     // Catch: org.json.JSONException -> L6c
            r1.mQuicTimerVersion = r0     // Catch: org.json.JSONException -> L6c
        L593:
            java.lang.String r0 = "QuicConfigOptimize"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L5a4
            java.lang.String r0 = "QuicConfigOptimize"
            r2 = 0
            int r0 = r6.optInt(r0, r2)     // Catch: org.json.JSONException -> L6c
            r1.mQuicConfigOptimize = r0     // Catch: org.json.JSONException -> L6c
        L5a4:
            java.lang.String r0 = "QuicSessionReceiveWindow"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L5b4
            java.lang.String r0 = "QuicSessionReceiveWindow"
            int r0 = r6.optInt(r0, r5)     // Catch: org.json.JSONException -> L6c
            r1.mSessionReceiveWindow = r0     // Catch: org.json.JSONException -> L6c
        L5b4:
            java.lang.String r0 = "QuicStreamReceiveWindow"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L5c4
            java.lang.String r0 = "QuicStreamReceiveWindow"
            int r0 = r6.optInt(r0, r5)     // Catch: org.json.JSONException -> L6c
            r1.mStreamReceiveWindow = r0     // Catch: org.json.JSONException -> L6c
        L5c4:
            java.lang.String r0 = "EnableCheckDropAudio"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L5d4
            java.lang.String r0 = "EnableCheckDropAudio"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableCheckDropAudio = r0     // Catch: org.json.JSONException -> L6c
        L5d4:
            java.lang.String r0 = "AVNoSyncThreshold"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L5e4
            java.lang.String r0 = "AVNoSyncThreshold"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mAVNoSyncThreshold = r0     // Catch: org.json.JSONException -> L6c
        L5e4:
            java.lang.String r0 = "AlwaysDoAVSync"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L5f4
            java.lang.String r0 = "AlwaysDoAVSync"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mIsAlwaysDoAVSync = r0     // Catch: org.json.JSONException -> L6c
        L5f4:
            java.lang.String r0 = "StallRetryTimeIntervalManager"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L604
            java.lang.String r0 = "StallRetryTimeIntervalManager"
            long r2 = r6.optLong(r0)     // Catch: org.json.JSONException -> L6c
            r1.mStallRetryTimeIntervalManager = r2     // Catch: org.json.JSONException -> L6c
        L604:
            java.lang.String r0 = "FastOpenDuration"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L614
            java.lang.String r0 = "FastOpenDuration"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            com.bykv.vk.component.ttvideo.VideoLiveManager.mFastOpenDuration = r0     // Catch: org.json.JSONException -> L6c
        L614:
            java.lang.String r0 = "LLSConfig"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L6dc
            java.lang.String r0 = "LLSConfig"
            org.json.JSONObject r0 = r6.optJSONObject(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L6dc
            java.lang.String r2 = "FallbackThreshold"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L634
            java.lang.String r2 = "FallbackThreshold"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mRtcFallbackThreshold = r2     // Catch: org.json.JSONException -> L6c
        L634:
            java.lang.String r2 = "EnableDtls"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L644
            java.lang.String r2 = "EnableDtls"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mRtcEnableDtls = r2     // Catch: org.json.JSONException -> L6c
        L644:
            java.lang.String r2 = "MinJitterBuffer"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L654
            java.lang.String r2 = "MinJitterBuffer"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mRtcMinJitterBuffer = r2     // Catch: org.json.JSONException -> L6c
        L654:
            java.lang.String r2 = "MaxJitterBuffer"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L664
            java.lang.String r2 = "MaxJitterBuffer"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mRtcMaxJitterBuffer = r2     // Catch: org.json.JSONException -> L6c
        L664:
            java.lang.String r2 = "EnableSDKDns"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L674
            java.lang.String r2 = "EnableSDKDns"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mRtcEnableSDKDns = r2     // Catch: org.json.JSONException -> L6c
        L674:
            java.lang.String r2 = "EnableEarlyInitRender"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L684
            java.lang.String r2 = "EnableEarlyInitRender"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mRtcEarlyInitRender = r2     // Catch: org.json.JSONException -> L6c
        L684:
            java.lang.String r2 = "MaxRetryCount"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L694
            java.lang.String r2 = "MaxRetryCount"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mRtcMaxRetryCount = r2     // Catch: org.json.JSONException -> L6c
        L694:
            java.lang.String r2 = "EnableRTCHWDecode"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L6a4
            java.lang.String r2 = "EnableRTCHWDecode"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mHardwareRTCDecodeEnable = r2     // Catch: org.json.JSONException -> L6c
        L6a4:
            java.lang.String r2 = "EnableMiniSdp"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L6b4
            java.lang.String r2 = "EnableMiniSdp"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mRtcSupportMiniSdp = r2     // Catch: org.json.JSONException -> L6c
        L6b4:
            java.lang.String r2 = "PlayingLogInterval"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L6cc
            java.lang.String r2 = "PlayingLogInterval"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mRtcPlayLogInterval = r2     // Catch: org.json.JSONException -> L6c
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r3 = r1.mLogService     // Catch: org.json.JSONException -> L6c
            if (r3 == 0) goto L6cc
            long r7 = (long) r2     // Catch: org.json.JSONException -> L6c
            r3.setRtcPlayLogInterval(r7)     // Catch: org.json.JSONException -> L6c
        L6cc:
            java.lang.String r2 = "EnableRTSFixDeadlock"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L6dc
            java.lang.String r2 = "EnableRTSFixDeadlock"
            int r0 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mRtcEnableRtcUninitLockFree = r0     // Catch: org.json.JSONException -> L6c
        L6dc:
            java.lang.String r0 = "NetWorkTimeoutMs"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L6ec
            java.lang.String r0 = "NetWorkTimeoutMs"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mNetworkTimeout = r0     // Catch: org.json.JSONException -> L6c
        L6ec:
            java.lang.String r0 = "EnableCheckPacketCorrupt"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L6fc
            java.lang.String r0 = "EnableCheckPacketCorrupt"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableCheckPacketCorrupt = r0     // Catch: org.json.JSONException -> L6c
        L6fc:
            java.lang.String r0 = "AudioTimescaleEnable"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L70c
            java.lang.String r0 = "AudioTimescaleEnable"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mAudioTimescaleEnable = r0     // Catch: org.json.JSONException -> L6c
        L70c:
            java.lang.String r0 = "EnableTcpFastOpen"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L71c
            java.lang.String r0 = "EnableTcpFastOpen"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableTcpFastOpen = r0     // Catch: org.json.JSONException -> L6c
        L71c:
            java.lang.String r0 = "HlsLiveStartIndex"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L72c
            java.lang.String r0 = "HlsLiveStartIndex"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mHlsLiveStartIndex = r0     // Catch: org.json.JSONException -> L6c
        L72c:
            java.lang.String r0 = "CmafOptimizeRetry"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L73c
            java.lang.String r0 = "CmafOptimizeRetry"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableCmafOptimizeRetry = r0     // Catch: org.json.JSONException -> L6c
        L73c:
            java.lang.String r0 = "EnableFastOpen"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L74c
            java.lang.String r0 = "EnableFastOpen"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableFastOpenStream = r0     // Catch: org.json.JSONException -> L6c
        L74c:
            java.lang.String r0 = "EnableLowLatencyFLV"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L75c
            java.lang.String r0 = "EnableLowLatencyFLV"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableLowLatencyFLV = r0     // Catch: org.json.JSONException -> L6c
        L75c:
            java.lang.String r0 = "EnableSkipFlvNullTag"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L76c
            java.lang.String r0 = "EnableSkipFlvNullTag"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableSkipFlvNullTag = r0     // Catch: org.json.JSONException -> L6c
        L76c:
            java.lang.String r0 = "LiveIOConfig"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L7cc
            java.lang.String r0 = "LiveIOConfig"
            org.json.JSONObject r0 = r6.optJSONObject(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L7cc
            java.lang.String r2 = "EnableLiveIO"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L78c
            java.lang.String r2 = "EnableLiveIO"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mEnableLiveIOPlay = r2     // Catch: org.json.JSONException -> L6c
        L78c:
            java.lang.String r2 = "EnableP2P"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L79c
            java.lang.String r2 = "EnableP2P"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mEnableLiveIOP2P = r2     // Catch: org.json.JSONException -> L6c
        L79c:
            java.lang.String r2 = "EnableHttpPrepare"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L7ac
            java.lang.String r2 = "EnableHttpPrepare"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mEnableHttpPrepare = r2     // Catch: org.json.JSONException -> L6c
        L7ac:
            java.lang.String r2 = "EnableP2pUp"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L7bc
            java.lang.String r2 = "EnableP2pUp"
            int r2 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mEnableP2pUp = r2     // Catch: org.json.JSONException -> L6c
        L7bc:
            java.lang.String r2 = "LiveIOABGroupID"
            boolean r2 = r0.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r2 == 0) goto L7cc
            java.lang.String r2 = "LiveIOABGroupID"
            int r0 = r0.optInt(r2)     // Catch: org.json.JSONException -> L6c
            r1.mLiveIOABGroupID = r0     // Catch: org.json.JSONException -> L6c
        L7cc:
            java.lang.String r0 = "EnableNTPByApp"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L7fa
            java.lang.String r0 = "EnableNTPByApp"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mEnableNTP = r0     // Catch: org.json.JSONException -> L6c
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r1.mLogService     // Catch: org.json.JSONException -> L6c
            r2.mEnableNTP = r0     // Catch: org.json.JSONException -> L6c
            if (r0 != r5) goto L7fa
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r0 = r1.mSettingsBundle     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L7fa
            java.lang.String r3 = "time_diff_server_and_client"
            r4 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: org.json.JSONException -> L6c
            java.lang.Object r0 = r0.getSettingsValueForKey(r3, r4)     // Catch: org.json.JSONException -> L6c
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: org.json.JSONException -> L6c
            long r3 = r0.longValue()     // Catch: org.json.JSONException -> L6c
            r2.mTimeDiff = r3     // Catch: org.json.JSONException -> L6c
        L7fa:
            java.lang.String r0 = "NoSyncReportMinDuration"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L80a
            java.lang.String r0 = "NoSyncReportMinDuration"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mNoSyncReportMinDuration = r0     // Catch: org.json.JSONException -> L6c
        L80a:
            java.lang.String r0 = "NoSyncReportReportThres"
            boolean r0 = r6.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L81e
            java.lang.String r0 = "NoSyncReportReportThres"
            int r0 = r6.optInt(r0)     // Catch: org.json.JSONException -> L6c
            r1.mNoSyncReportReportThres = r0     // Catch: org.json.JSONException -> L6c
            goto L81e
        L81b:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L81e:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService
            int r2 = r1.mDefaultResBitrate
            r0.mDefaultResBitrate = r2
            return
    }

    private void _doRequestSwitchUrlFromServer() {
            r11 = this;
            java.lang.String r0 = "code"
            java.lang.String r1 = "/"
            java.lang.String r2 = r11.mCdnSessionPath
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L168
            java.lang.String r2 = r11.mCdnAbrResolution
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L168
            java.lang.String r2 = r11.mCdnAbrResolution
            java.lang.String r3 = r11.mResolution
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L20
            goto L168
        L20:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r11.mPlayer
            if (r2 != 0) goto L26
            goto L168
        L26:
            r3 = 335(0x14f, float:4.7E-43)
            java.lang.String r2 = r2.getStringOption(r3)
            if (r2 != 0) goto L30
            goto L168
        L30:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "responseHeaders: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r4, r3)
            java.lang.String r3 = "\r\n"
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            r5 = 0
            r6 = 0
            r7 = 0
        L4d:
            r8 = 2
            if (r7 >= r3) goto L66
            r9 = r2[r7]
            java.lang.String r10 = "X-Has-Token: "
            boolean r10 = r9.startsWith(r10)
            if (r10 == 0) goto L63
            java.lang.String r6 = ": "
            java.lang.String[] r6 = r9.split(r6, r8)
            r8 = 1
            r6 = r6[r8]
        L63:
            int r7 = r7 + 1
            goto L4d
        L66:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L7f
            r2.<init>()     // Catch: java.lang.Exception -> L7f
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r3 = r11.mLogService     // Catch: java.lang.Exception -> L7f
            java.lang.String r3 = r3.mSessionId     // Catch: java.lang.Exception -> L7f
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L7f
            if (r3 != 0) goto L82
            java.lang.String r3 = "live_stream_session_id"
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r7 = r11.mLogService     // Catch: java.lang.Exception -> L7f
            java.lang.String r7 = r7.mSessionId     // Catch: java.lang.Exception -> L7f
            r2.put(r3, r7)     // Catch: java.lang.Exception -> L7f
            goto L82
        L7f:
            r0 = move-exception
            goto L165
        L82:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r3 = r11.mURLSource     // Catch: java.lang.Exception -> L7f
            java.lang.String r7 = r11.mCdnAbrResolution     // Catch: java.lang.Exception -> L7f
            java.lang.String r9 = "flv"
            java.lang.String r10 = r11.mLevel     // Catch: java.lang.Exception -> L7f
            java.lang.String r3 = r3.getPlayURLForResolution(r7, r9, r10)     // Catch: java.lang.Exception -> L7f
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L7f
            if (r7 == 0) goto L96
            goto L168
        L96:
            java.lang.String r7 = "play_url"
            r2.put(r7, r3)     // Catch: java.lang.Exception -> L7f
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L7f
            if (r7 != 0) goto La6
            java.lang.String r7 = "token"
            r2.put(r7, r6)     // Catch: java.lang.Exception -> L7f
        La6:
            java.lang.String r6 = "//"
            int r6 = r3.indexOf(r6)     // Catch: java.lang.Exception -> L7f
            int r6 = r6 + r8
            java.lang.String r6 = r3.substring(r6)     // Catch: java.lang.Exception -> L7f
            int r7 = r6.indexOf(r1)     // Catch: java.lang.Exception -> L7f
            java.lang.String r6 = r6.substring(r7)     // Catch: java.lang.Exception -> L7f
            java.lang.String r7 = r11.mCdnSessionPath     // Catch: java.lang.Exception -> L7f
            boolean r7 = r7.startsWith(r1)     // Catch: java.lang.Exception -> L7f
            if (r7 != 0) goto Ld1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7f
            r7.<init>(r1)     // Catch: java.lang.Exception -> L7f
            java.lang.String r1 = r11.mCdnSessionPath     // Catch: java.lang.Exception -> L7f
            r7.append(r1)     // Catch: java.lang.Exception -> L7f
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Exception -> L7f
            r11.mCdnSessionPath = r1     // Catch: java.lang.Exception -> L7f
        Ld1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7f
            r1.<init>()     // Catch: java.lang.Exception -> L7f
            int r6 = r3.indexOf(r6)     // Catch: java.lang.Exception -> L7f
            java.lang.String r3 = r3.substring(r5, r6)     // Catch: java.lang.Exception -> L7f
            r1.append(r3)     // Catch: java.lang.Exception -> L7f
            java.lang.String r3 = r11.mCdnSessionPath     // Catch: java.lang.Exception -> L7f
            r1.append(r3)     // Catch: java.lang.Exception -> L7f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L7f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7f
            java.lang.String r5 = "sending 'POST' request to URL : "
            r3.<init>(r5)     // Catch: java.lang.Exception -> L7f
            r3.append(r1)     // Catch: java.lang.Exception -> L7f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L7f
            com.bykv.vk.component.ttvideo.log.MyLog.i(r4, r3)     // Catch: java.lang.Exception -> L7f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7f
            java.lang.String r5 = "httpBody: "
            r3.<init>(r5)     // Catch: java.lang.Exception -> L7f
            r3.append(r2)     // Catch: java.lang.Exception -> L7f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L7f
            com.bykv.vk.component.ttvideo.log.MyLog.i(r4, r3)     // Catch: java.lang.Exception -> L7f
            com.bykv.vk.component.ttvideo.INetworkClient r3 = r11.mNetworkClient     // Catch: java.lang.Exception -> L7f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L7f
            com.bykv.vk.component.ttvideo.INetworkClient$Result r1 = r3.doPost(r1, r2)     // Catch: java.lang.Exception -> L7f
            if (r1 == 0) goto L168
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7f
            java.lang.String r3 = "response: "
            r2.<init>(r3)     // Catch: java.lang.Exception -> L7f
            org.json.JSONObject r3 = r1.response     // Catch: java.lang.Exception -> L7f
            r2.append(r3)     // Catch: java.lang.Exception -> L7f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L7f
            com.bykv.vk.component.ttvideo.log.MyLog.i(r4, r2)     // Catch: java.lang.Exception -> L7f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7f
            java.lang.String r3 = "code: "
            r2.<init>(r3)     // Catch: java.lang.Exception -> L7f
            int r3 = r1.code     // Catch: java.lang.Exception -> L7f
            r2.append(r3)     // Catch: java.lang.Exception -> L7f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L7f
            com.bykv.vk.component.ttvideo.log.MyLog.i(r4, r2)     // Catch: java.lang.Exception -> L7f
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r11.mLogService     // Catch: java.lang.Exception -> L7f
            int r3 = r1.code     // Catch: java.lang.Exception -> L7f
            r2.mCdnAbrSwitchCode = r3     // Catch: java.lang.Exception -> L7f
            r2 = 200(0xc8, float:2.8E-43)
            if (r3 != r2) goto L168
            org.json.JSONObject r2 = r1.response     // Catch: java.lang.Exception -> L7f
            boolean r2 = r2.has(r0)     // Catch: java.lang.Exception -> L7f
            if (r2 == 0) goto L168
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r11.mLogService     // Catch: java.lang.Exception -> L7f
            org.json.JSONObject r1 = r1.response     // Catch: java.lang.Exception -> L7f
            int r0 = r1.optInt(r0)     // Catch: java.lang.Exception -> L7f
            r2.mCdnAbrSwitchCode = r0     // Catch: java.lang.Exception -> L7f
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r11.mLogService     // Catch: java.lang.Exception -> L7f
            int r0 = r0.mCdnAbrSwitchCode     // Catch: java.lang.Exception -> L7f
            if (r0 != 0) goto L168
            java.lang.String r0 = r11.mCdnAbrResolution     // Catch: java.lang.Exception -> L7f
            r11.mResolution = r0     // Catch: java.lang.Exception -> L7f
            return
        L165:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L168:
            return
    }

    private void _play(java.lang.String r6) {
            r5 = this;
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r0 = r5.mPrepareState
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.PREPARED
            r2 = 0
            java.lang.String r3 = "VideoLiveManager"
            if (r0 != r1) goto L21
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r5.mPlayer
            if (r1 == 0) goto L21
            java.lang.String r6 = "_play resume"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r3, r6)
            java.lang.String r6 = r5.mCurrentIP
            if (r6 == 0) goto L1b
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r5.mLogService
            r0.setCdnIp(r6, r2)
        L1b:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r6 = r5.mPlayer
            r6.start()
            goto L6a
        L21:
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.IDLE
            r4 = 0
            if (r0 == r1) goto L44
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            if (r0 != 0) goto L2b
            goto L44
        L2b:
            r5.configPlayerGlobalOption()
            boolean r0 = r5.mIsLocalURL
            if (r0 == 0) goto L40
            java.lang.String r0 = r5.mLocalURL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L40
            java.lang.String r6 = r5.mLocalURL
            r5.prepareToPlay(r6, r4, r4, r4)
            goto L6a
        L40:
            r5.parsePlayDNS(r6)
            goto L6a
        L44:
            java.lang.String r0 = "_play start"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r3, r0)
            r5.open()
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.INITIALIZED
            r5.mPrepareState = r0
            boolean r0 = r5.mIsLocalURL
            if (r0 == 0) goto L67
            java.lang.String r0 = r5.mLocalURL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L67
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r6 = r5.mLogService
            r6.onCallPrepare()
            java.lang.String r6 = r5.mLocalURL
            r5.prepareToPlay(r6, r4, r4, r4)
            goto L6a
        L67:
            r5.parsePlayDNS(r6)
        L6a:
            r5.mIsRequestCanceled = r2
            return
    }

    private void _requestSwitchUrlFromServer() {
            r2 = this;
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r2.mLogService
            r1 = 1
            r0.mIsCdnAbrSwitch = r1
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r2.mURLSource
            int r0 = r0.getSourceType()
            r1 = 2
            if (r0 != r1) goto L19
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r2.mURLSource
            java.lang.String r1 = r2.mLevel
            boolean r0 = r0.isCodecSame(r1)
            if (r0 != 0) goto L19
            goto L21
        L19:
            java.util.concurrent.ExecutorService r0 = r2.mExecutor
            boolean r0 = r0.isShutdown()
            if (r0 == 0) goto L22
        L21:
            return
        L22:
            java.util.concurrent.ExecutorService r0 = r2.mExecutor
            com.bykv.vk.component.ttvideo.VideoLiveManager$2 r1 = new com.bykv.vk.component.ttvideo.VideoLiveManager$2
            r1.<init>(r2)
            r0.submit(r1)
            return
    }

    private void _reset(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "VideoLiveManager"
            java.lang.String r1 = "_reset"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r1)
            r2._stopPlayer()
            r2._resetPlayer()
            r2._stopLiveManager(r3)
            r3 = -1
            r2.mResolutionIndex = r3
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.IDLE
            r2.mLivePlayerState = r3
            return
    }

    private void _resetPlayer() {
            r2 = this;
            java.lang.String r0 = "VideoLiveManager"
            java.lang.String r1 = "_resetPlayer"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r1)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r2.mPlayer
            if (r0 == 0) goto Le
            r0.reset()
        Le:
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.INITIALIZED
            r2.mPrepareState = r0
            return
    }

    private void _setLooseSync() {
            r6 = this;
            java.lang.String r0 = "ForceRenderMsGaps"
            java.lang.String r1 = "ForceDecodeMsGaps"
            java.lang.String r2 = "ForceDecodeSwitch"
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r3 = r6.mURLSource
            if (r3 != 0) goto Lb
            goto L46
        Lb:
            java.lang.String r4 = r6.mResolution
            java.lang.String r5 = r6.mLevel
            java.lang.String r3 = r3.getSDKParams(r4, r5)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L1a
            goto L46
        L1a:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2c
            r4.<init>(r3)     // Catch: org.json.JSONException -> L2c
            boolean r3 = r4.has(r2)     // Catch: org.json.JSONException -> L2c
            if (r3 == 0) goto L2e
            int r2 = r4.optInt(r2)     // Catch: org.json.JSONException -> L2c
            r6.mForceDecodeSwitch = r2     // Catch: org.json.JSONException -> L2c
            goto L2e
        L2c:
            r0 = move-exception
            goto L47
        L2e:
            boolean r2 = r4.has(r1)     // Catch: org.json.JSONException -> L2c
            if (r2 == 0) goto L3a
            int r1 = r4.optInt(r1)     // Catch: org.json.JSONException -> L2c
            r6.mForceDecodeMsGaps = r1     // Catch: org.json.JSONException -> L2c
        L3a:
            boolean r1 = r4.has(r0)     // Catch: org.json.JSONException -> L2c
            if (r1 == 0) goto L46
            int r0 = r4.optInt(r0)     // Catch: org.json.JSONException -> L2c
            r6.mForceRenderMsGaps = r0     // Catch: org.json.JSONException -> L2c
        L46:
            return
        L47:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    private void _setProtocol() {
            r5 = this;
            java.lang.String r0 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r1 = r5.mURLSource
            java.lang.String r2 = r5.mResolution
            java.lang.String r3 = "auto"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L15
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = r5.mURLSource
            java.lang.String r2 = r2.getDefaultResolution()
            goto L17
        L15:
            java.lang.String r2 = r5.mResolution
        L17:
            java.lang.String r3 = r5.mStreamFormat
            java.lang.String r4 = r5.mLevel
            java.lang.String r1 = r1.getPlayURLForResolution(r2, r3, r4)
            if (r1 == 0) goto L4e
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r5.mLogService
            r2.setOriginUrl(r1)
            java.lang.String r2 = "http"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L32
            java.lang.String r2 = "tcp"
            r5.mTransportProtocol = r2
        L32:
            java.lang.String r2 = "httpk"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L3e
            java.lang.String r2 = "kcp"
            r5.mTransportProtocol = r2
        L3e:
            java.lang.String r2 = "https"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L4a
            java.lang.String r1 = "tls"
            r5.mTransportProtocol = r1
        L4a:
            java.lang.String r1 = r5.mTransportProtocol
            r5.mURLProtocol = r1
        L4e:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r1 = r5.mURLSource
            java.lang.String r2 = r5.mResolution
            java.lang.String r3 = r5.mLevel
            java.lang.String r1 = r1.getSuggestProtocol(r2, r3)
            r5.mSuggestProtocol = r1
            if (r1 == 0) goto L97
            java.lang.String r2 = "quic"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L6e
            java.lang.String r2 = r5.mSuggestProtocol
            java.lang.String r3 = "quicu"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L94
        L6e:
            boolean r2 = r5.mQuicEnable
            if (r2 != 0) goto L94
            java.lang.String r2 = "ttquic"
            com.bykv.vk.component.ttvideo.LibraryLoader.loadLibrary(r2)     // Catch: java.lang.Throwable -> L85
            r2 = 1
            r5.mQuicEnable = r2     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = "ttquic lib is load success"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r3)     // Catch: java.lang.Throwable -> L85
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r3 = r5.mLogService     // Catch: java.lang.Throwable -> L85
            r3.setQuicLibLoader(r2)     // Catch: java.lang.Throwable -> L85
            goto L94
        L85:
            java.lang.String r1 = r5.mTransportProtocol
            r2 = 0
            r5.mQuicEnable = r2
            java.lang.String r3 = "ttquic lib is load failed. change default protocol"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r3)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r5.mLogService
            r0.setQuicLibLoader(r2)
        L94:
            r5.mTransportProtocol = r1
            return
        L97:
            java.lang.String r0 = "none"
            r5.mSuggestProtocol = r0
            return
    }

    private void _setStreamFormat() {
            r6 = this;
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r6.mURLSource
            java.lang.String r1 = r6.mResolution
            java.lang.String r2 = r6.mLevel
            java.lang.String r0 = r0.getSuggestFormat(r1, r2)
            java.lang.String r1 = "flv"
            if (r0 == 0) goto L7f
            java.lang.String r2 = "cmaf"
            boolean r2 = r0.equals(r2)
            r3 = 0
            r4 = 1
            java.lang.String r5 = "VideoLiveManager"
            if (r2 == 0) goto L3a
            boolean r2 = r6.mCmafEnable
            if (r2 != 0) goto L3a
            java.lang.String r2 = "ttmcmaf"
            com.bykv.vk.component.ttvideo.LibraryLoader.loadLibrary(r2)     // Catch: java.lang.Throwable -> L2b
            r6.mCmafEnable = r4     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "cmaf lib is load success"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r5, r2)     // Catch: java.lang.Throwable -> L2b
            goto L76
        L2b:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = r6.mURLSource
            r2.setStreamInfoFlag(r4)
            java.lang.String r2 = r6.mStreamFormat
            r6.mCmafEnable = r3
            java.lang.String r3 = "cmaf lib is load failed. change default format"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r5, r3)
            goto L77
        L3a:
            java.lang.String r2 = "lls"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L76
            r6.mEnableRtcPlay = r4
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r6.mLogService
            r2.mEnableRtcPlay = r4
            java.lang.String r2 = "lls load bytertc library"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r5, r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = "byteaudio"
            com.bytedance.sdk.openadsdk.l.m.j(r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = "bytenn"
            com.bytedance.sdk.openadsdk.l.m.j(r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = "bytertc"
            com.bytedance.sdk.openadsdk.l.m.j(r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = "lls load bytertc library done"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r5, r2)     // Catch: java.lang.Throwable -> L62
            goto L76
        L62:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = r6.mURLSource
            r4 = 2
            r2.setStreamInfoFlag(r4)
            java.lang.String r2 = r6.mStreamFormat
            r6.mEnableRtcPlay = r3
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r4 = r6.mLogService
            r4.mEnableRtcPlay = r3
            java.lang.String r3 = "bytertc lib is load failed. change default format"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r5, r3)
            goto L77
        L76:
            r2 = r0
        L77:
            r6.mStreamFormat = r2
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r3 = r6.mLogService
            r3.setFormatInfo(r0, r2)
            goto L88
        L7f:
            r6.mStreamFormat = r1
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r6.mLogService
            java.lang.String r2 = "none"
            r0.setFormatInfo(r2, r1)
        L88:
            java.lang.String r0 = r6.mStreamFormat
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "avph"
            if (r0 != 0) goto Lda
            java.lang.String r0 = r6.mStreamFormat
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lda
            r6._setAvLines()
            java.lang.String r0 = r6.mEnableAvLines
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lda
            java.lang.String r0 = r6.mVideoOnly
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lda
            java.lang.String r0 = r6.mAudioOnly
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lda
            java.lang.String r0 = r6.mEnableAvLines
            java.lang.String r1 = "true"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lda
            java.lang.String r0 = r6.mVideoOnly
            java.lang.String r1 = "only_video=1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lda
            java.lang.String r0 = r6.mAudioOnly
            java.lang.String r1 = "only_audio=1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lda
            r6.mStreamFormat = r2
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r6.mLogService
            r0.setFormatInfo(r2, r2)
        Lda:
            java.lang.String r0 = r6.mStreamFormat
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Led
            java.lang.String r0 = r6.mStreamFormat
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Led
            r6._configAvphNeqStrategy()
        Led:
            return
    }

    private void _smartResolveDefaultResolution(java.lang.String r17) {
            r16 = this;
            r0 = r16
            java.lang.String r1 = r0.mAbrStrategy
            java.lang.String r2 = "abr_bb_4live"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L124
            boolean r1 = r0.mEnableResolutionAutoDegrade
            if (r1 != 0) goto L12
            goto L124
        L12:
            boolean r1 = android.text.TextUtils.isEmpty(r17)
            if (r1 == 0) goto L1a
            goto L124
        L1a:
            java.lang.String r1 = "ld"
            r2 = r17
            boolean r3 = r2.equals(r1)
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = -1
            java.lang.String r10 = "origin"
            java.lang.String r11 = "uhd"
            java.lang.String r12 = "sd"
            java.lang.String r13 = "hd"
            r14 = 0
            if (r3 == 0) goto L9d
        L32:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L124
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r3 = r0.mURLSource
            java.lang.String r15 = r0.mStreamFormat
            java.lang.String r4 = r0.mLevel
            java.lang.String r3 = r3.getPlayURLForResolution(r2, r15, r4)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L58
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r1 = r0.mURLSource
            r1.setDefaultResolution(r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r0.mLogService
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = r0.mURLSource
            java.lang.String r2 = r2.getDefaultResolution()
            r1.mAutoUsingResolution = r2
            return
        L58:
            r2.getClass()
            int r3 = r2.hashCode()
            switch(r3) {
                case -1008619738: goto L88;
                case 3324: goto L7f;
                case 3448: goto L76;
                case 3665: goto L6d;
                case 115761: goto L64;
                default: goto L62;
            }
        L62:
            r2 = -1
            goto L90
        L64:
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L6b
            goto L62
        L6b:
            r2 = 4
            goto L90
        L6d:
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L74
            goto L62
        L74:
            r2 = 3
            goto L90
        L76:
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L7d
            goto L62
        L7d:
            r2 = 2
            goto L90
        L7f:
            boolean r2 = r2.equals(r13)
            if (r2 != 0) goto L86
            goto L62
        L86:
            r2 = 1
            goto L90
        L88:
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L8f
            goto L62
        L8f:
            r2 = 0
        L90:
            switch(r2) {
                case 0: goto L93;
                case 1: goto L9b;
                case 2: goto L99;
                case 3: goto L97;
                case 4: goto L95;
                default: goto L93;
            }
        L93:
            r2 = r14
            goto L32
        L95:
            r2 = r10
            goto L32
        L97:
            r2 = r13
            goto L32
        L99:
            r2 = r12
            goto L32
        L9b:
            r2 = r11
            goto L32
        L9d:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L108
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r3 = r0.mURLSource
            java.lang.String r4 = r0.mStreamFormat
            java.lang.String r15 = r0.mLevel
            java.lang.String r3 = r3.getPlayURLForResolution(r2, r4, r15)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto Lc3
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r1 = r0.mURLSource
            r1.setDefaultResolution(r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r0.mLogService
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = r0.mURLSource
            java.lang.String r2 = r2.getDefaultResolution()
            r1.mAutoUsingResolution = r2
            return
        Lc3:
            r2.getClass()
            int r3 = r2.hashCode()
            switch(r3) {
                case -1008619738: goto Lf3;
                case 3324: goto Lea;
                case 3448: goto Le1;
                case 3665: goto Ld8;
                case 115761: goto Lcf;
                default: goto Lcd;
            }
        Lcd:
            r2 = -1
            goto Lfb
        Lcf:
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto Ld6
            goto Lcd
        Ld6:
            r2 = 4
            goto Lfb
        Ld8:
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto Ldf
            goto Lcd
        Ldf:
            r2 = 3
            goto Lfb
        Le1:
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le8
            goto Lcd
        Le8:
            r2 = 2
            goto Lfb
        Lea:
            boolean r2 = r2.equals(r13)
            if (r2 != 0) goto Lf1
            goto Lcd
        Lf1:
            r2 = 1
            goto Lfb
        Lf3:
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto Lfa
            goto Lcd
        Lfa:
            r2 = 0
        Lfb:
            switch(r2) {
                case 0: goto L106;
                case 1: goto L104;
                case 2: goto Lfe;
                case 3: goto L102;
                case 4: goto L100;
                default: goto Lfe;
            }
        Lfe:
            r2 = r14
            goto L9d
        L100:
            r2 = r13
            goto L9d
        L102:
            r2 = r1
            goto L9d
        L104:
            r2 = r12
            goto L9d
        L106:
            r2 = r11
            goto L9d
        L108:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L124
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = " not found"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.w(r2, r1)
        L124:
            return
    }

    private void _stop(boolean r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "VideoLiveManager"
            java.lang.String r1 = "_stop"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r1)
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r0 = r2.mLivePlayerState
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.PLAYED
            if (r0 == r1) goto L37
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.PAUSED
            if (r0 == r1) goto L37
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r3 = r2.mLogService
            r3.onIllegalAPICall(r4)
            com.bykv.vk.component.ttvideo.ILiveListener r3 = r2.mListener
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "illegal call: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " -- "
            r0.append(r4)
            int r4 = r2.hashCode()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r0 = 6
            r3.onReportALog(r0, r4)
            return
        L37:
            if (r3 == 0) goto L3d
            r2._stopPlayer()
            goto L41
        L3d:
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.INITIALIZED
            r2.mPrepareState = r3
        L41:
            r2._stopLiveManager(r4)
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.STOPPED
            r2.mLivePlayerState = r3
            r3 = 0
            r2.mSupportSRScene = r3
            r2.mTextureSRMode = r3
            r2.mEnableReportSessionStop = r3
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r3 = r2.mLogService
            r4 = -1
            r3.mMuteAudio = r4
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.mVolumeSetting = r4
            r3.mPlayerVolumeSetting = r4
            return
    }

    private void _stopLiveManager(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "VideoLiveManager"
            java.lang.String r1 = "_stopLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r1)
            com.bykv.vk.component.ttvideo.network.LiveDataFetcher r0 = r4.mFetcher
            if (r0 == 0) goto Le
            r0.cancel()
        Le:
            com.bykv.vk.component.ttvideo.network.DnsHelper r0 = r4.mDnsParser
            if (r0 == 0) goto L15
            r0.cancel()
        L15:
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r0 = r4.mLivePlayerState
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.PLAYED
            r2 = 0
            if (r0 == r1) goto L20
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.PAUSED
            if (r0 != r1) goto L31
        L20:
            r4.onRenderStallForRetryStop()
            boolean r0 = r4.mIsStalling
            if (r0 == 0) goto L2c
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r4.mLogService
            r0.onStallEnd(r2)
        L2c:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r4.mLogService
            r0.close(r5)
        L31:
            r0 = 75
            r4.setIntOption(r0, r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r4.mLogService
            r0.reset()
            com.bykv.vk.component.ttvideo.retry.RetryProcessor r0 = r4.mRetryProcessor
            r0.reset()
            java.lang.String r0 = "reset"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L4d
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r5 = r4.mURLSource
            r5.reset()
        L4d:
            r4.mShowedFirstFrame = r2
            r4.mRenderStartEntered = r2
            r5 = 1
            r4.mResolutionDisableSR = r5
            r4.mMediaSupportSR = r2
            r0 = 0
            r4.mStallStartTime = r0
            r4.mStallTotalTime = r0
            r4.mStallCount = r2
            r4.mIsRequestCanceled = r5
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.STOPPED
            r4.mLivePlayerState = r3
            r4.mHasSeiInfo = r2
            r4.mGetSeiCurrentTime = r0
            r4.mIsStalling = r2
            r4.mIsRetrying = r2
            r4.mHasRetry = r2
            r4.mSupportBackupIp = r5
            r0 = -1
            r4.mUrlSettingMethod = r0
            r4.mEnableDTSCheck = r2
            r4.mEnablePreventDTSBack = r2
            r4.mEnableCheckFrame = r2
            r4.mEnterStallRetryInstantly = r2
            java.lang.String r1 = ""
            r4.mEnableAvLines = r1
            r4.mEnableSaveSCFG = r2
            java.lang.String r1 = "flv"
            r4.mStreamFormat = r1
            java.lang.String r1 = "tcp"
            r4.mTransportProtocol = r1
            java.lang.String r1 = "none"
            r4.mSuggestProtocol = r1
            r4.mEnableVideoMpdRefresh = r5
            r4.mEnableQuicCertVerify = r2
            r4.mTextureSRMode = r2
            r4.mSupportSRScene = r2
            r4.mEnableTextureSR = r2
            r4.mEnableTextureRender = r2
            r1 = 39
            r4.mQuicVersion = r1
            r1 = 1200(0x4b0, float:1.682E-42)
            r4.mQuicInitMTU = r1
            r4.mEnableQuicMTUDiscovery = r2
            r4.mQuicInitRtt = r2
            r4.mQuicMaxCryptoRetransmissions = r2
            r4.mQuicMaxCryptoRetransmissionTimeMs = r2
            r4.mQuicMaxRetransmissions = r2
            r4.mQuicMaxRetransmissionTimeMs = r2
            r4.mQuicMaxAckDelay = r2
            r4.mQuicMinReceivedBeforeAckDecimation = r2
            r4.mQuicPadHello = r5
            r4.mQuicFixWillingAndAbleToWrite = r5
            r4.mQuicFixProcessTimer = r5
            r1 = 100
            r4.mQuicReadBlockTimeout = r1
            r4.mQuicReadBlockMode = r2
            r4.mQuicFixStreamFinAndRst = r2
            r4.mQuicConfigOptimize = r2
            r4.mEnableCheckDropAudio = r2
            r4.mIsPlayWithMdl = r2
            r1 = 10000(0x2710, float:1.4013E-41)
            r4.mAVNoSyncThreshold = r1
            r4.mIsAlwaysDoAVSync = r2
            r4.mRedoDns = r2
            r4.mEnableLiveAbrCheckEnhance = r2
            r1 = 1000(0x3e8, float:1.401E-42)
            r4.mLiveABRCheckInterval = r1
            r4.mABRMethod = r0
            r4.mRtcEnableDtls = r2
            r1 = 5000(0x1388, float:7.006E-42)
            r4.mRtcFallbackThreshold = r1
            r3 = 300(0x12c, float:4.2E-43)
            r4.mRtcMinJitterBuffer = r3
            r4.mRtcPlayFallBack = r2
            r4.mEnableRtcPlay = r2
            r4.mRtcEnableSDKDns = r2
            r4.mRtcEarlyInitRender = r2
            r4.mEnableFreeFlow = r2
            r4.mABRDisableAlgorithm = r2
            r4.mTextureRenderFirstFrame = r2
            r4.mUsePlayerRenderStart = r2
            com.bykv.vk.component.ttvideo.VideoLiveManager.mFastOpenDuration = r0
            android.os.Handler r0 = r4.mMyHandler
            r2 = 0
            r0.removeCallbacksAndMessages(r2)
            int r0 = r4.mEnableStallCounter
            if (r0 != r5) goto Lfe
            r4.stopStallCounter()
        Lfe:
            r4.mNoSyncReportMinDuration = r1
            r5 = 200(0xc8, float:2.8E-43)
            r4.mNoSyncReportReportThres = r5
            return
    }

    private void _stopPlayer() {
            r5 = this;
            java.lang.String r0 = "_stopPlayer"
            java.lang.String r1 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r0)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            if (r0 == 0) goto L40
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r0 = r5.mPrepareState
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.PREPARED
            if (r0 == r2) goto L15
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.PREPARING
            if (r0 != r2) goto L40
        L15:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r5.mLogService
            if (r0 == 0) goto L2f
            r0.getABRStreamInfo()
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r5.mLogService
            r0.getAVPHStreamInfo()
            int r0 = r5.mEnableCheckFrame
            r2 = 1
            if (r0 == r2) goto L2a
            int r0 = r5.mEnableCheckSEI
            if (r0 != r2) goto L2f
        L2a:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r5.mLogService
            r0.resetStreamCheckParams()
        L2f:
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r0 = r5.mLivePlayerState
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.PAUSED
            if (r0 == r2) goto L3b
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r0.stop()
            goto L40
        L3b:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r0.reset()
        L40:
            boolean r0 = r5.mIsPlayWithMdl
            if (r0 == 0) goto L54
            java.lang.String r0 = r5.mSessionId
            if (r0 == 0) goto L54
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r0 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            java.lang.String r2 = r5.mSessionId
            r3 = 0
            r4 = 8018(0x1f52, float:1.1236E-41)
            r0.setInt64ValueByStrKey(r4, r2, r3)
        L54:
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.INITIALIZED
            r5.mPrepareState = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "prepareState: "
            r0.<init>(r2)
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r2 = r5.mPrepareState
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r0)
            return
    }

    private boolean abrDegradeResolution() {
            r9 = this;
            java.lang.String[] r0 = com.bykv.vk.component.ttvideo.LiveConfigKey.resolution
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
        L5:
            r2 = -1
            if (r0 < 0) goto L18
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r3 = r9.mURLSource
            java.lang.String[] r4 = com.bykv.vk.component.ttvideo.LiveConfigKey.resolution
            r4 = r4[r0]
            boolean r3 = r3.isSupportResolution(r4)
            if (r3 == 0) goto L15
            goto L19
        L15:
            int r0 = r0 + (-1)
            goto L5
        L18:
            r0 = -1
        L19:
            r3 = 0
            if (r0 != r2) goto L1d
            return r3
        L1d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "abrDegradeResolution, resolution: "
            r2.<init>(r4)
            java.lang.String[] r4 = com.bykv.vk.component.ttvideo.LiveConfigKey.resolution
            r5 = r4[r0]
            r2.append(r5)
            java.lang.String r5 = ", auto defalut resolution: "
            r2.append(r5)
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r5 = r9.mURLSource
            java.lang.String r5 = r5.getDefaultResolution()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r5, r2)
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = r9.mURLSource
            java.lang.String r2 = r2.getDefaultResolution()
            r5 = r4[r0]
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L51
            return r3
        L51:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = r9.mURLSource
            r5 = r4[r0]
            java.lang.String r6 = r9.mStreamFormat
            java.lang.String r7 = "main"
            java.lang.String r2 = r2.getPlayURLForResolution(r5, r6, r7)
            if (r2 != 0) goto L60
            return r3
        L60:
            java.lang.String r5 = r9.mCurrentPlayURL
            r9.mCurrentPlayURL = r2
            r9.mResolutionIndex = r0
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r6 = r9.mURLSource
            r8 = r4[r0]
            r6.setDefaultResolution(r8)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r6 = r9.mLogService
            r0 = r4[r0]
            r6.mAutoUsingResolution = r0
            r9.saveCurrentResolution()
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r9.mLogService
            java.lang.String r4 = r9.mCurrentPlayURL
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "auto_"
            r6.<init>(r8)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r8 = r9.mLogService
            java.lang.String r8 = r8.mLastResolution
            r6.append(r8)
            java.lang.String r8 = "_to_"
            r6.append(r8)
            java.lang.String r8 = r9.mResolution
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r8 = -100015(0xfffffffffffe7951, float:NaN)
            r0.onSwitch(r5, r4, r6, r8)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r9.mLogService
            java.lang.String r4 = r9.mCurrentPlayURL
            r0.onSwitchURL(r4)
            r9.mLevel = r7
            r9.mStallCount = r3
            r9.parsePlayDNS(r2)
            return r1
    }

    static /* synthetic */ boolean access$1000(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            boolean r0 = r0.mIsRequestCanceled
            return r0
    }

    static /* synthetic */ void access$1100(com.bykv.vk.component.ttvideo.VideoLiveManager r0, java.lang.Runnable r1) {
            r0.runOnFrontCurrentThread(r1)
            return
    }

    static /* synthetic */ com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState access$1200(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r0 = r0.mPrepareState
            return r0
    }

    static /* synthetic */ com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState access$1202(com.bykv.vk.component.ttvideo.VideoLiveManager r0, com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState r1) {
            r0.mPrepareState = r1
            return r1
    }

    static /* synthetic */ com.bykv.vk.component.ttvideo.player.MediaPlayer access$1300(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r0.mPlayer
            return r0
    }

    static /* synthetic */ int access$1400(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            int r0 = r0.mStartDirectAfterPrepared
            return r0
    }

    static /* synthetic */ com.bykv.vk.component.ttvideo.ILiveListener access$1500(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            com.bykv.vk.component.ttvideo.ILiveListener r0 = r0.mListener
            return r0
    }

    static /* synthetic */ boolean access$1600(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            boolean r0 = r0.mIsLocalURL
            return r0
    }

    static /* synthetic */ int access$1700(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            int r0 = r0.mEnableQuicDegrade
            return r0
    }

    static /* synthetic */ boolean access$1800(com.bykv.vk.component.ttvideo.VideoLiveManager r0, int r1) {
            boolean r0 = r0.QuicDegrade(r1)
            return r0
    }

    static /* synthetic */ int access$1900(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            int r0 = r0.mEnableHttpkDegrade
            return r0
    }

    static /* synthetic */ void access$200(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            r0._doRequestSwitchUrlFromServer()
            return
    }

    static /* synthetic */ boolean access$2000(com.bykv.vk.component.ttvideo.VideoLiveManager r0, int r1) {
            boolean r0 = r0.HttpKDegradeHttp(r1)
            return r0
    }

    static /* synthetic */ int access$2100(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            int r0 = r0.mEnableRtcPlay
            return r0
    }

    static /* synthetic */ int access$2200(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            int r0 = r0.mRtcPlayFallBack
            return r0
    }

    static /* synthetic */ int access$2202(com.bykv.vk.component.ttvideo.VideoLiveManager r0, int r1) {
            r0.mRtcPlayFallBack = r1
            return r1
    }

    static /* synthetic */ boolean access$2300(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            boolean r0 = r0.mEnableSwitchMainAndBackupUrl
            return r0
    }

    static /* synthetic */ com.bykv.vk.component.ttvideo.model.LiveInfoSource access$2400(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r0.mURLSource
            return r0
    }

    static /* synthetic */ boolean access$2500(com.bykv.vk.component.ttvideo.VideoLiveManager r0, int r1) {
            boolean r0 = r0.switchMainAndBackupUrl(r1)
            return r0
    }

    static /* synthetic */ boolean access$2600(com.bykv.vk.component.ttvideo.VideoLiveManager r0, int r1) {
            boolean r0 = r0.bytevc1DegradeH264(r1)
            return r0
    }

    static /* synthetic */ int access$2700(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            int r0 = r0.mCurrentRetryCount
            return r0
    }

    static /* synthetic */ int access$2702(com.bykv.vk.component.ttvideo.VideoLiveManager r0, int r1) {
            r0.mCurrentRetryCount = r1
            return r1
    }

    static /* synthetic */ java.lang.String access$2800(com.bykv.vk.component.ttvideo.VideoLiveManager r0, int r1) {
            java.lang.String r0 = r0.convertCodecName(r1)
            return r0
    }

    static /* synthetic */ boolean access$2902(com.bykv.vk.component.ttvideo.VideoLiveManager r0, boolean r1) {
            r0.mIsStalling = r1
            return r1
    }

    static /* synthetic */ com.bykv.vk.component.ttvideo.log.LiveLoggerService access$300(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r0.mLogService
            return r0
    }

    static /* synthetic */ int access$3000(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            int r0 = r0.mEnableReportSessionStop
            return r0
    }

    static /* synthetic */ void access$3100(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            r0.updateSessionFirstFrameInfo()
            return
    }

    static /* synthetic */ int access$3200(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            int r0 = r0.mEnableTextureRender
            return r0
    }

    static /* synthetic */ boolean access$3300(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            boolean r0 = r0.mUsePlayerRenderStart
            return r0
    }

    static /* synthetic */ long access$3400(com.bykv.vk.component.ttvideo.VideoLiveManager r2) {
            long r0 = r2.mStallTotalTime
            return r0
    }

    static /* synthetic */ long access$3402(com.bykv.vk.component.ttvideo.VideoLiveManager r0, long r1) {
            r0.mStallTotalTime = r1
            return r1
    }

    static /* synthetic */ boolean access$3500(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            boolean r0 = r0.mIsPlayWithMdl
            return r0
    }

    static /* synthetic */ boolean access$3600(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            boolean r0 = r0.mIsRetrying
            return r0
    }

    static /* synthetic */ boolean access$3602(com.bykv.vk.component.ttvideo.VideoLiveManager r0, boolean r1) {
            r0.mIsRetrying = r1
            return r1
    }

    static /* synthetic */ boolean access$3700(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            boolean r0 = r0.mUserSwitchResoultion
            return r0
    }

    static /* synthetic */ boolean access$3702(com.bykv.vk.component.ttvideo.VideoLiveManager r0, boolean r1) {
            r0.mUserSwitchResoultion = r1
            return r1
    }

    static /* synthetic */ int access$3800() {
            int r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.mVideoRenderStallThreshold
            return r0
    }

    static /* synthetic */ int access$3900() {
            int r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.mAudioRenderStallThreshold
            return r0
    }

    static /* synthetic */ com.bykv.vk.component.ttvideo.network.DnsHelper access$400(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            com.bykv.vk.component.ttvideo.network.DnsHelper r0 = r0.mDnsParser
            return r0
    }

    static /* synthetic */ int access$4000() {
            int r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.mDemuxerStallThreshold
            return r0
    }

    static /* synthetic */ int access$4100() {
            int r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.mDecoderStallThreshold
            return r0
    }

    static /* synthetic */ boolean access$4200(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            boolean r0 = r0.mEnterStallRetryInstantly
            return r0
    }

    static /* synthetic */ boolean access$4202(com.bykv.vk.component.ttvideo.VideoLiveManager r0, boolean r1) {
            r0.mEnterStallRetryInstantly = r1
            return r1
    }

    static /* synthetic */ long access$4300(com.bykv.vk.component.ttvideo.VideoLiveManager r2) {
            long r0 = r2.mStallStartTime
            return r0
    }

    static /* synthetic */ long access$4302(com.bykv.vk.component.ttvideo.VideoLiveManager r0, long r1) {
            r0.mStallStartTime = r1
            return r1
    }

    static /* synthetic */ int access$4400(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            int r0 = r0.mStallCount
            return r0
    }

    static /* synthetic */ int access$4408(com.bykv.vk.component.ttvideo.VideoLiveManager r2) {
            int r0 = r2.mStallCount
            int r1 = r0 + 1
            r2.mStallCount = r1
            return r0
    }

    static /* synthetic */ boolean access$4500(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            boolean r0 = r0.mEnableResolutionAutoDegrade
            return r0
    }

    static /* synthetic */ java.lang.String access$4600(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            java.lang.String r0 = r0.mAbrStrategy
            return r0
    }

    static /* synthetic */ int access$4700(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            int r0 = r0.mStallCountThresOfResolutionDegrade
            return r0
    }

    static /* synthetic */ boolean access$4800(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            boolean r0 = r0.degradeResolution()
            return r0
    }

    static /* synthetic */ java.lang.String access$4900(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            java.lang.String r0 = r0.mResolution
            return r0
    }

    static /* synthetic */ void access$500(com.bykv.vk.component.ttvideo.VideoLiveManager r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0.prepareToPlay(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ int access$5000(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            int r0 = r0.mEnableAbrStallDegradeImmediately
            return r0
    }

    static /* synthetic */ boolean access$5100(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            boolean r0 = r0.abrDegradeResolution()
            return r0
    }

    static /* synthetic */ int access$5200(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            int r0 = r0.mEnableStallRetryInstantly
            return r0
    }

    static /* synthetic */ java.lang.String access$5300(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            java.lang.String r0 = r0.mLevel
            return r0
    }

    static /* synthetic */ long access$5400(com.bykv.vk.component.ttvideo.VideoLiveManager r2) {
            long r0 = r2.mTargetOriginBitRate
            return r0
    }

    static /* synthetic */ int access$5500(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            int r0 = r0.mNoSyncReportMinDuration
            return r0
    }

    static /* synthetic */ boolean access$5602(com.bykv.vk.component.ttvideo.VideoLiveManager r0, boolean r1) {
            r0.mSupportBackupIp = r1
            return r1
    }

    static /* synthetic */ int access$5700(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            int r0 = r0.mCacheFileEnable
            return r0
    }

    static /* synthetic */ boolean access$5802(com.bykv.vk.component.ttvideo.VideoLiveManager r0, boolean r1) {
            r0.mIsCacheHasComplete = r1
            return r1
    }

    static /* synthetic */ boolean access$5900(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            boolean r0 = r0.mLooping
            return r0
    }

    static /* synthetic */ java.lang.String access$600(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            java.lang.String r0 = r0.mCurrentIP
            return r0
    }

    static /* synthetic */ java.lang.String access$6000(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            java.lang.String r0 = r0.mCacheFilePath
            return r0
    }

    static /* synthetic */ java.lang.String access$602(com.bykv.vk.component.ttvideo.VideoLiveManager r0, java.lang.String r1) {
            r0.mCurrentIP = r1
            return r1
    }

    static /* synthetic */ void access$6100(com.bykv.vk.component.ttvideo.VideoLiveManager r0, java.lang.String r1) {
            r0.parsePlayDNS(r1)
            return
    }

    static /* synthetic */ void access$6200(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            r0.updateDownloadSizeStat()
            return
    }

    static /* synthetic */ boolean access$6300(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            boolean r0 = r0.mHasRetry
            return r0
    }

    static /* synthetic */ boolean access$6302(com.bykv.vk.component.ttvideo.VideoLiveManager r0, boolean r1) {
            r0.mHasRetry = r1
            return r1
    }

    static /* synthetic */ void access$6400(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            r0._stopPlayer()
            return
    }

    static /* synthetic */ java.lang.String access$6500(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            java.lang.String r0 = r0.mStreamFormat
            return r0
    }

    static /* synthetic */ long access$6602(com.bykv.vk.component.ttvideo.VideoLiveManager r0, long r1) {
            r0.mRetryStartTime = r1
            return r1
    }

    static /* synthetic */ void access$6700(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            r0._resetPlayer()
            return
    }

    static /* synthetic */ com.bykv.vk.component.ttvideo.network.LiveDataFetcher access$6800(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            com.bykv.vk.component.ttvideo.network.LiveDataFetcher r0 = r0.mFetcher
            return r0
    }

    static /* synthetic */ int access$6900(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            int r0 = r0.mRtcMaxRetryCount
            return r0
    }

    static /* synthetic */ boolean access$700(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            boolean r0 = r0.mCancelSDKDNSFailRetry
            return r0
    }

    static /* synthetic */ int access$7000(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            int r0 = r0.mRtcSupportMiniSdp
            return r0
    }

    static /* synthetic */ int access$7002(com.bykv.vk.component.ttvideo.VideoLiveManager r0, int r1) {
            r0.mRtcSupportMiniSdp = r1
            return r1
    }

    static /* synthetic */ void access$7200(com.bykv.vk.component.ttvideo.VideoLiveManager r0, java.lang.Runnable r1) {
            r0.runOnCurrentThread(r1)
            return
    }

    static /* synthetic */ java.lang.String access$7300(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            java.lang.String r0 = r0.mSessionId
            return r0
    }

    static /* synthetic */ com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState access$7400(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r0 = r0.mLivePlayerState
            return r0
    }

    static /* synthetic */ void access$7500(com.bykv.vk.component.ttvideo.VideoLiveManager r0, java.lang.Runnable r1, long r2) {
            r0.runOnCurrentThreadDelay(r1, r2)
            return
    }

    static /* synthetic */ java.lang.Object access$7800(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            java.lang.Object r0 = r0.mStallCounterLock
            return r0
    }

    static /* synthetic */ boolean access$7900(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            boolean r0 = r0.mStallCounterIsRunning
            return r0
    }

    static /* synthetic */ boolean access$800(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            boolean r0 = r0.mShowedFirstFrame
            return r0
    }

    static /* synthetic */ int access$8000(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            int r0 = r0.mStallCounterInterval
            return r0
    }

    static /* synthetic */ boolean access$802(com.bykv.vk.component.ttvideo.VideoLiveManager r0, boolean r1) {
            r0.mShowedFirstFrame = r1
            return r1
    }

    static /* synthetic */ android.os.Handler access$8100(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            android.os.Handler r0 = r0.mStallCounterHandler
            return r0
    }

    static /* synthetic */ com.bykv.vk.component.ttvideo.retry.RetryProcessor access$900(com.bykv.vk.component.ttvideo.VideoLiveManager r0) {
            com.bykv.vk.component.ttvideo.retry.RetryProcessor r0 = r0.mRetryProcessor
            return r0
    }

    private void addRtcCodecInfo(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "video_codec_name"
            java.lang.String r1 = "video_codec_impl_name"
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto La4
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r4.mLogService
            java.lang.String r2 = r2.mCodecName
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L20
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r4.mLogService
            java.lang.String r2 = r2.mCodecName
            java.lang.String r3 = "none_codec"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto La4
        L20:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> La4
            r2.<init>(r5)     // Catch: java.lang.Exception -> La4
            boolean r5 = r2.has(r1)     // Catch: java.lang.Exception -> La4
            if (r5 == 0) goto L50
            java.lang.String r5 = r2.optString(r1)     // Catch: java.lang.Exception -> La4
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> La4
            if (r1 != 0) goto L50
            java.lang.String r1 = "MediaCodec"
            boolean r5 = r1.equals(r5)     // Catch: java.lang.Exception -> La4
            if (r5 == 0) goto L47
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService     // Catch: java.lang.Exception -> La4
            java.lang.String r1 = "hardware_codec"
            r5.mCodecName = r1     // Catch: java.lang.Exception -> La4
            r1 = 1
            r5.mHardDecodeEnable = r1     // Catch: java.lang.Exception -> La4
            goto L50
        L47:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService     // Catch: java.lang.Exception -> La4
            java.lang.String r1 = "software_codec"
            r5.mCodecName = r1     // Catch: java.lang.Exception -> La4
            r1 = 0
            r5.mHardDecodeEnable = r1     // Catch: java.lang.Exception -> La4
        L50:
            boolean r5 = r2.has(r0)     // Catch: java.lang.Exception -> La4
            if (r5 == 0) goto L75
            java.lang.String r5 = r2.optString(r0)     // Catch: java.lang.Exception -> La4
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> La4
            if (r0 != 0) goto L75
            java.lang.String r0 = "ByteVC1"
            boolean r5 = r0.equalsIgnoreCase(r5)     // Catch: java.lang.Exception -> La4
            if (r5 == 0) goto L6f
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = "bytevc1"
            r5.mCodecType = r0     // Catch: java.lang.Exception -> La4
            goto L75
        L6f:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = "h264"
            r5.mCodecType = r0     // Catch: java.lang.Exception -> La4
        L75:
            java.lang.String r5 = "VideoLiveManager"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La4
            java.lang.String r1 = "addRtcCodecInfo mCodecName:"
            r0.<init>(r1)     // Catch: java.lang.Exception -> La4
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r4.mLogService     // Catch: java.lang.Exception -> La4
            java.lang.String r1 = r1.mCodecName     // Catch: java.lang.Exception -> La4
            r0.append(r1)     // Catch: java.lang.Exception -> La4
            java.lang.String r1 = ", mCodecType:"
            r0.append(r1)     // Catch: java.lang.Exception -> La4
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r4.mLogService     // Catch: java.lang.Exception -> La4
            java.lang.String r1 = r1.mCodecType     // Catch: java.lang.Exception -> La4
            r0.append(r1)     // Catch: java.lang.Exception -> La4
            java.lang.String r1 = ",mHardDecodeEnable:"
            r0.append(r1)     // Catch: java.lang.Exception -> La4
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r4.mLogService     // Catch: java.lang.Exception -> La4
            boolean r1 = r1.mHardDecodeEnable     // Catch: java.lang.Exception -> La4
            r0.append(r1)     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> La4
            com.bykv.vk.component.ttvideo.log.MyLog.i(r5, r0)     // Catch: java.lang.Exception -> La4
        La4:
            return
    }

    private java.lang.String addSessionIdToURL(java.lang.String r3, long r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L36
            java.lang.String r0 = r2.mUuid
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lf
            goto L36
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.mUuid
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r2.mLogService
            r5.mSessionId = r4
            java.lang.String r5 = "_session_id"
            boolean r0 = r3.contains(r5)
            if (r0 != 0) goto L35
            java.lang.String r3 = r2._addParamToURL(r3, r5, r4)
        L35:
            return r3
        L36:
            r3 = 0
            return r3
    }

    private boolean bytevc1DegradeH264(int r8) {
            r7 = this;
            int r0 = r7.mURLAbility
            r1 = 2
            r2 = 0
            if (r0 == r1) goto L7
            return r2
        L7:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r7.mURLSource
            java.lang.String r1 = "h264"
            com.bykv.vk.component.ttvideo.model.LiveURL r0 = r0.getPlayURLByCodec(r1)
            java.lang.String r0 = r0.mainURL
            if (r0 == 0) goto L5e
            r7.updateDownloadSizeStat()
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r3 = r7.mLogService
            r3.onSessionStop()
            r3 = 1
            r7.mIsRetrying = r3
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r4 = r7.mLogService
            r4.onSwitchURL(r0)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r4 = r7.mLogService
            java.lang.String r5 = r7.mCurrentPlayURL
            java.lang.String r6 = "bytevc1_to_h264"
            r4.onSwitch(r5, r0, r6, r8)
            r7.mCurrentPlayURL = r0
            r7.mURLAbility = r3
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r8 = r7.mLogService
            r8.mUrlAbility = r1
            int r8 = r7.mHardwareDecodeEnable
            if (r8 == r3) goto L51
            int r8 = r7.mEnableH264HardwareDecode
            if (r8 != r3) goto L51
            r7.mHardwareDecodeEnable = r3
            r7.mDefaultCodecId = r2
            com.bykv.vk.component.ttvideo.player.MediaPlayer r8 = r7.mPlayer
            r1 = 59
            r8.setIntOption(r1, r3)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r8 = r7.mLogService
            int r1 = r7.mHardwareDecodeEnable
            if (r1 != r3) goto L4e
            r2 = 1
        L4e:
            r8.enableHardDecode(r2)
        L51:
            r7._resetPlayer()
            long r1 = java.lang.System.currentTimeMillis()
            r7.mSessionStartTime = r1
            r7.parsePlayDNS(r0)
            return r3
        L5e:
            return r2
    }

    private void checkMainLooper(java.lang.String r3) {
            r2 = this;
            int r0 = r2.mIsInMainLooper
            r1 = 1
            if (r0 != r1) goto L16
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 == r1) goto L16
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r2.mLogService
            if (r0 == 0) goto L16
            r0.onCallNotInMainThread(r3)
        L16:
            return
    }

    public static void closeDataLoader() {
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r0 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            r0.close()
            return
    }

    private void configPlayerEventHandler() {
            r2 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r2.mPlayer
            com.bykv.vk.component.ttvideo.VideoLiveManager$MyPreparedListener r1 = new com.bykv.vk.component.ttvideo.VideoLiveManager$MyPreparedListener
            r1.<init>(r2)
            r0.setOnPreparedListener(r1)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r2.mPlayer
            com.bykv.vk.component.ttvideo.VideoLiveManager$MyErrorListener r1 = new com.bykv.vk.component.ttvideo.VideoLiveManager$MyErrorListener
            r1.<init>(r2)
            r0.setOnErrorListener(r1)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r2.mPlayer
            com.bykv.vk.component.ttvideo.VideoLiveManager$MyInfoListener r1 = new com.bykv.vk.component.ttvideo.VideoLiveManager$MyInfoListener
            r1.<init>(r2)
            r0.setOnInfoListener(r1)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r2.mPlayer
            com.bykv.vk.component.ttvideo.VideoLiveManager$MyCompletionListener r1 = new com.bykv.vk.component.ttvideo.VideoLiveManager$MyCompletionListener
            r1.<init>(r2)
            r0.setOnCompletionListener(r1)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r2.mPlayer
            com.bykv.vk.component.ttvideo.VideoLiveManager$MyOnVideoSizeChangedListener r1 = new com.bykv.vk.component.ttvideo.VideoLiveManager$MyOnVideoSizeChangedListener
            r1.<init>(r2)
            r0.setOnVideoSizeChangedListener(r1)
            return
    }

    private void configPlayerGlobalOption() {
            r17 = this;
            r0 = r17
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r0.mPlayer
            int r2 = r0.mNetworkTimeout
            r3 = 1000000(0xf4240, float:1.401298E-39)
            int r2 = r2 * r3
            r3 = 9
            r1.setIntOption(r3, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r0.mPlayer
            r2 = 83
            int r3 = r0.mTestAction
            r1.setIntOption(r2, r3)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r0.mPlayer
            r2 = 37
            int r3 = r0.mEnhancementType
            r1.setIntOption(r2, r3)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r0.mPlayer
            r2 = 38
            int r3 = r0.mScaleType
            r1.setIntOption(r2, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 325(0x145, float:4.55E-43)
            r2.setIntOption(r5, r3)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r5 = 36
            int r6 = r0.mLayoutType
            r2.setIntOption(r5, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r5 = 110(0x6e, float:1.54E-43)
            r6 = 5000(0x1388, float:7.006E-42)
            r2.setIntOption(r5, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r5 = 64
            r2.setIntOption(r5, r3)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r5 = 94
            r6 = 1
            r2.setIntOption(r5, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            int r5 = r0.mRenderType
            r7 = 56
            r2.setIntOption(r7, r5)
            r0._configLiveSettingBundle()
            r0._configWithSDKParams()
            r0.configToBParams()
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            int r5 = r0.mEnableFastOpenStream
            r2.mEnableFastOpenStream = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r8 = 220(0xdc, float:3.08E-43)
            r2.setIntOption(r8, r5)
            java.lang.String r2 = "set fast open stream"
            java.lang.String r5 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r5, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            int r8 = r0.mRenderType
            r2.setIntOption(r7, r8)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r7 = 340(0x154, float:4.76E-43)
            int r8 = r0.mEnableCheckDropAudio
            r2.setIntOption(r7, r8)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r7 = 52
            int r8 = r0.mEnableUploadSei
            r2.setIntOption(r7, r8)
            int r2 = r0.mEnableDTSCheck
            if (r2 == r6) goto La8
            int r2 = r0.mEnableCheckFrame
            if (r2 == r6) goto La8
            int r2 = r0.mEnableCheckSEI
            if (r2 != r6) goto Laf
        La8:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r7 = 640(0x280, float:8.97E-43)
            r2.setIntOption(r7, r6)
        Laf:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r7 = 641(0x281, float:8.98E-43)
            r2.setIntOption(r7, r6)
            int r2 = r0.mEnableClosePlayRetry
            if (r2 != r6) goto Lc8
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r7 = 197(0xc5, float:2.76E-43)
            r2.setIntOption(r7, r3)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r7 = 82
            r2.setIntOption(r7, r3)
        Lc8:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            boolean r7 = r0.mHasAbrInfo
            r2.mHasAbrInfo = r7
            java.lang.String r7 = r0.mAbrStrategy
            r2.mAbrStrategy = r7
            boolean r7 = r0.mEnableResolutionAutoDegrade
            r2.mEnableResolutionAutoDegrade = r7
            int r7 = r0.mStallCountThresOfResolutionDegrade
            r2.mStallCountThresOfResolutionDegrade = r7
            long r7 = r0.mStallRetryTimeIntervalManager
            r2.mStallRetryTimeInterval = r7
            com.bykv.vk.component.ttvideo.retry.RetryProcessor r2 = r0.mRetryProcessor
            r2.setStallRetryTimeInterval(r7)
            int r2 = r0.mEnableSharp
            if (r2 != r6) goto Lf5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r7 = r0.mPlayer
            r8 = 189(0xbd, float:2.65E-43)
            r7.setIntOption(r8, r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            if (r2 == 0) goto Lf5
            r2.enableSharp()
        Lf5:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = r0.mURLSource
            int r2 = r2.getSourceType()
            r7 = 2
            if (r2 != r7) goto L109
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = r0.mURLSource
            java.lang.String r8 = r0.mResolution
            java.lang.String r9 = r0.mLevel
            java.lang.String r2 = r2.getVCodec(r8, r9)
            goto L11f
        L109:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = r0.mURLSource
            int r2 = r2.getSourceType()
            if (r2 != r6) goto L11e
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = r0.mURLSource
            com.bykv.vk.component.ttvideo.model.LiveURL r2 = r2.getPlayLiveURL()
            if (r2 == 0) goto L11e
            java.lang.String r2 = r2.getVCodec()
            goto L11f
        L11e:
            r2 = 0
        L11f:
            if (r2 == 0) goto L146
            java.lang.String r8 = "h264"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L130
            int r8 = r0.mEnableH264HardwareDecode
            r0.mHardwareDecodeEnable = r8
            r0.mDefaultCodecId = r3
            goto L141
        L130:
            java.lang.String r8 = "bytevc1"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L13f
            int r8 = r0.mEnableByteVC1HardwareDecode
            r0.mHardwareDecodeEnable = r8
            r0.mDefaultCodecId = r6
            goto L141
        L13f:
            r0.mHardwareDecodeEnable = r3
        L141:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r8 = r0.mLogService
            r8.mUrlAbility = r2
            goto L148
        L146:
            r0.mHardwareDecodeEnable = r3
        L148:
            r0.mHardwareDecodeEnable = r6
            r0.mEnableMediaCodecASYNCInit = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r8 = 800(0x320, float:1.121E-42)
            int r9 = r0.mEnableRtcPlay
            r2.setIntOption(r8, r9)
            int r2 = r0.mEnableRtcPlay
            r8 = 181(0xb5, float:2.54E-43)
            r9 = 59
            r10 = -1
            if (r2 != r6) goto L1b5
            java.lang.String r2 = "rtc close hardware decode"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r5, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r2.setIntOption(r9, r3)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r2.setIntOption(r8, r3)
            int r2 = r0.mHardwareRTCDecodeEnable
            if (r2 != r6) goto L177
            int r2 = r0.mHardwareDecodeEnable
            if (r2 != r6) goto L177
            r2 = 1
            goto L178
        L177:
            r2 = 0
        L178:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "rts decode mHardwareDecodeEnable:"
            r8.<init>(r9)
            int r9 = r0.mHardwareDecodeEnable
            r8.append(r9)
            java.lang.String r9 = ", mHardwareRTCDecodeEnable: "
            r8.append(r9)
            int r9 = r0.mHardwareRTCDecodeEnable
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r5, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "rts decode  hardware decode "
            r8.<init>(r9)
            if (r2 != r6) goto L1a1
            java.lang.String r9 = "True"
            goto L1a3
        L1a1:
            java.lang.String r9 = "False"
        L1a3:
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r5, r8)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r8 = r0.mPlayer
            r9 = 880(0x370, float:1.233E-42)
            r8.setIntOption(r9, r2)
            goto L207
        L1b5:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            int r11 = r0.mHardwareDecodeEnable
            r2.setIntOption(r9, r11)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            int r9 = r0.mHardwareDecodeEnable
            if (r9 != r6) goto L1c4
            r9 = 1
            goto L1c5
        L1c4:
            r9 = 0
        L1c5:
            r2.enableHardDecode(r9)
            int r2 = r0.mHardwareDecodeEnable
            if (r2 != r6) goto L1f4
            java.lang.String r2 = "enable hardware decode"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r5, r2)
            int r2 = r0.mDefaultCodecId
            if (r2 == r10) goto L1f4
            java.lang.String r2 = "set hardware async init"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r5, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            int r9 = r0.mEnableMediaCodecASYNCInit
            r2.setIntOption(r8, r9)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r8 = 182(0xb6, float:2.55E-43)
            int r9 = r0.mDefaultCodecId
            r2.setIntOption(r8, r9)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            int r8 = r0.mEnableMediaCodecASYNCInit
            r2.mMediaCodecAsyncInit = r8
            int r8 = r0.mDefaultCodecId
            r2.mDefaultCodecID = r8
        L1f4:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r8 = 97
            int r9 = r0.mHardwareDecodeEnable
            r2.setIntOption(r8, r9)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r8 = 536(0x218, float:7.51E-43)
            r9 = 500000(0x7a120, float:7.00649E-40)
            r2.setIntOption(r8, r9)
        L207:
            int r2 = r0.mByteVC1DecoderType
            if (r2 == r10) goto L216
            int r8 = r0.mEnableByteVC1HardwareDecode
            if (r8 == r6) goto L216
            com.bykv.vk.component.ttvideo.player.MediaPlayer r8 = r0.mPlayer
            r9 = 67
            r8.setIntOption(r9, r2)
        L216:
            int r2 = r0.mBufferTimeout
            if (r2 == r10) goto L221
            com.bykv.vk.component.ttvideo.player.MediaPlayer r8 = r0.mPlayer
            r9 = 81
            r8.setIntOption(r9, r2)
        L221:
            float r2 = r0.mCatchSpeed
            r8 = 0
            int r9 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r9 <= 0) goto L235
            com.bykv.vk.component.ttvideo.player.MediaPlayer r9 = r0.mPlayer
            r11 = 80
            r9.setFloatOption(r11, r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            float r9 = r0.mCatchSpeed
            r2.mCatchSpeed = r9
        L235:
            int r2 = r0.mCacheFileEnable
            if (r2 != r10) goto L264
            java.lang.String r2 = r0.mCacheFilePath
            if (r2 == 0) goto L264
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r11 = java.lang.System.currentTimeMillis()
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r0.mCacheFileKey = r2
            com.bykv.vk.component.ttvideo.player.MediaPlayer r9 = r0.mPlayer
            r11 = 17
            r9.setStringOption(r11, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r9 = 14
            r2.setIntOption(r9, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            java.lang.String r9 = r0.mCacheFilePath
            r2.setCacheFile(r9, r6)
        L264:
            int r2 = r0.mHurryType
            if (r2 == r10) goto L273
            com.bykv.vk.component.ttvideo.player.MediaPlayer r9 = r0.mPlayer
            r11 = 84
            r9.setIntOption(r11, r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            r2.mEnableHurry = r6
        L273:
            int r2 = r0.mHurryType
            if (r2 != 0) goto L288
            int r2 = r0.mHurryTime
            if (r2 == 0) goto L288
            com.bykv.vk.component.ttvideo.player.MediaPlayer r9 = r0.mPlayer
            r11 = 15
            r9.setIntOption(r11, r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            int r9 = r0.mHurryTime
            r2.mHurryTime = r9
        L288:
            boolean r2 = r0.mIsLocalURL
            if (r2 == 0) goto L29d
            java.lang.String r2 = r0.mLocalURL
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L29d
            boolean r2 = r0.mLooping
            if (r2 == 0) goto L29d
            com.bykv.vk.component.ttvideo.player.MediaPlayer r9 = r0.mPlayer
            r9.setLooping(r2)
        L29d:
            int r2 = r0.mBufferDataSeconds
            if (r2 == r10) goto L2a8
            com.bykv.vk.component.ttvideo.player.MediaPlayer r9 = r0.mPlayer
            r11 = 86
            r9.setIntOption(r11, r2)
        L2a8:
            int r2 = r0.mSlowPlayTime
            if (r2 == r10) goto L2b9
            com.bykv.vk.component.ttvideo.player.MediaPlayer r9 = r0.mPlayer
            r11 = 190(0xbe, float:2.66E-43)
            r9.setIntOption(r11, r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            int r9 = r0.mSlowPlayTime
            r2.mSlowPlayTime = r9
        L2b9:
            float r2 = r0.mSlowPlaySpeed
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 <= 0) goto L2cc
            com.bykv.vk.component.ttvideo.player.MediaPlayer r8 = r0.mPlayer
            r9 = 191(0xbf, float:2.68E-43)
            r8.setFloatOption(r9, r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            float r8 = r0.mSlowPlaySpeed
            r2.mSlowSpeed = r8
        L2cc:
            int r2 = r0.mMaxCacheSeconds
            if (r2 == r10) goto L2e6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r8 = r0.mPlayer
            r9 = 24
            r8.setIntOption(r9, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r8 = 198(0xc6, float:2.77E-43)
            int r9 = r0.mMaxCacheSeconds
            r2.setIntOption(r8, r9)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            int r8 = r0.mMaxCacheSeconds
            r2.mMaxCacheSeconds = r8
        L2e6:
            int r2 = r0.mEnableSplitStream
            if (r2 == 0) goto L2f7
            com.bykv.vk.component.ttvideo.player.MediaPlayer r8 = r0.mPlayer
            r9 = 87
            r8.setIntOption(r9, r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            int r8 = r0.mEnableSplitStream
            r2.mEnableSplitStream = r8
        L2f7:
            long r8 = r0.mStartPlayBufferThres
            r11 = 0
            int r2 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r2 <= 0) goto L30c
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r13 = 309(0x135, float:4.33E-43)
            r2.setLongOption(r13, r8)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            long r8 = r0.mStartPlayBufferThres
            r2.mStartPlayBufferThres = r8
        L30c:
            int r2 = r0.mCheckBufferingEndIgnoreVideo
            if (r2 != r6) goto L31d
            com.bykv.vk.component.ttvideo.player.MediaPlayer r8 = r0.mPlayer
            r9 = 310(0x136, float:4.34E-43)
            r8.setIntOption(r9, r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            int r8 = r0.mCheckBufferingEndIgnoreVideo
            r2.mCheckBufferingEndIgnoreVideo = r8
        L31d:
            int r2 = r0.mStartDirectAfterPrepared
            if (r2 != r6) goto L32e
            com.bykv.vk.component.ttvideo.player.MediaPlayer r8 = r0.mPlayer
            r9 = 311(0x137, float:4.36E-43)
            r8.setIntOption(r9, r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            int r8 = r0.mStartDirectAfterPrepared
            r2.mStartDirectAfterPrepared = r8
        L32e:
            int r2 = r0.mCheckBufferingEndAdvanceEnable
            if (r2 != r6) goto L33f
            com.bykv.vk.component.ttvideo.player.MediaPlayer r8 = r0.mPlayer
            r9 = 313(0x139, float:4.39E-43)
            r8.setIntOption(r9, r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            int r8 = r0.mCheckBufferingEndAdvanceEnable
            r2.mCheckBufferingEndAdvanceEnable = r8
        L33f:
            int r2 = r0.mOpenCheckSideData
            if (r2 != r6) goto L34a
            com.bykv.vk.component.ttvideo.player.MediaPlayer r8 = r0.mPlayer
            r9 = 132(0x84, float:1.85E-43)
            r8.setIntOption(r9, r2)
        L34a:
            int r2 = r0.mAudioTimescaleEnable
            if (r2 == r10) goto L35b
            com.bykv.vk.component.ttvideo.player.MediaPlayer r8 = r0.mPlayer
            r9 = 460(0x1cc, float:6.45E-43)
            r8.setIntOption(r9, r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            int r8 = r0.mAudioTimescaleEnable
            r2.mAudioTimescaleEnable = r8
        L35b:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            boolean r8 = r0.mEnableUploadSessionSeries
            r2.mEnableUploadSessionSeries = r8
            int r8 = r0.mEnableNTPTask
            if (r8 != r6) goto L368
            r2.openNTP()
        L368:
            int r2 = r0.mEnableOpenMDL
            r8 = -1
            if (r2 != r6) goto L401
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r10 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            r13 = 8100(0x1fa4, float:1.135E-41)
            long r13 = r10.getLongValueFromLoader(r13)
            int r10 = (int) r13
            r2.mEnableOpenMDL = r10
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r10 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            r13 = 8101(0x1fa5, float:1.1352E-41)
            long r13 = r10.getLongValueFromLoader(r13)
            int r10 = (int) r13
            r2.mEnableP2P = r10
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r10 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            r13 = 11
            java.lang.String r10 = r10.getStringValueFromLoader(r13)
            r2.mMDLVersion = r10
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r10 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            r13 = 8102(0x1fa6, float:1.1353E-41)
            long r14 = r10.getLongValueFromLoader(r13)
            int r10 = (int) r14
            r2.mEnableMdlProto = r10
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r2 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            com.bykv.vk.component.ttvideo.VideoLiveManager$MyMediaLoaderListener r10 = new com.bykv.vk.component.ttvideo.VideoLiveManager$MyMediaLoaderListener
            r10.<init>(r0)
            r2.setListener(r10)
            boolean r2 = r0.mIsMdlProtoRegister
            if (r2 != 0) goto L401
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r2 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            long r13 = r2.getLongValueFromLoader(r13)
            r15 = 1
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 != 0) goto L401
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r2 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            r10 = 7218(0x1c32, float:1.0115E-41)
            long r13 = r2.getLongValueFromLoader(r10)
            int r2 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r2 == 0) goto L3e6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r10 = 500(0x1f4, float:7.0E-43)
            long r15 = r2.setLongOption(r10, r13)
            int r2 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r2 != 0) goto L3e3
            r2 = 1
            goto L3e4
        L3e3:
            r2 = 0
        L3e4:
            r0.mIsMdlProtoRegister = r2
        L3e6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r10 = "get mdl proto ret:"
            r2.<init>(r10)
            r2.append(r13)
            java.lang.String r10 = ", register ret:"
            r2.append(r10)
            boolean r10 = r0.mIsMdlProtoRegister
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r5, r2)
        L401:
            r0.mEnableOpenLiveIO = r3
            r0.mEnableLiveIOPlay = r3
            r0.mEnableRtcPlay = r3
            long r2 = r0.mALogWriteAddr
            int r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r5 == 0) goto L41b
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r0.mPlayer
            r10 = 231(0xe7, float:3.24E-43)
            r5.setLongOption(r10, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 223(0xdf, float:3.12E-43)
            r2.setIntOption(r3, r6)
        L41b:
            java.lang.String r2 = r0.mStreamFormat
            if (r2 == 0) goto L426
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r5 = 315(0x13b, float:4.41E-43)
            r3.setStringOption(r5, r2)
        L426:
            java.lang.String r2 = r0.mStreamFormat
            if (r2 == 0) goto L435
            java.lang.String r3 = "avph"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L435
            r0.prepareAvphPlay()
        L435:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 347(0x15b, float:4.86E-43)
            int r5 = r0.mAVNoSyncThreshold
            r2.setIntOption(r3, r5)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 348(0x15c, float:4.88E-43)
            int r5 = r0.mIsAlwaysDoAVSync
            r2.setIntOption(r3, r5)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 323(0x143, float:4.53E-43)
            int r5 = r0.mEnableRenderStall
            r2.setIntOption(r3, r5)
            int r2 = r0.mEnableRenderStall
            if (r2 != r6) goto L466
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 321(0x141, float:4.5E-43)
            int r5 = com.bykv.vk.component.ttvideo.VideoLiveManager.mAudioRenderStallThreshold
            r2.setIntOption(r3, r5)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 322(0x142, float:4.51E-43)
            int r5 = com.bykv.vk.component.ttvideo.VideoLiveManager.mVideoRenderStallThreshold
            r2.setIntOption(r3, r5)
        L466:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 360(0x168, float:5.04E-43)
            int r5 = r0.mEnableDemuxerStall
            r2.setIntOption(r3, r5)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 461(0x1cd, float:6.46E-43)
            int r5 = r0.mNoSyncReportReportThres
            r2.setIntOption(r3, r5)
            int r2 = r0.mEnableDemuxerStall
            if (r2 != r6) goto L493
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 362(0x16a, float:5.07E-43)
            int r5 = com.bykv.vk.component.ttvideo.VideoLiveManager.mDemuxerStallThreshold
            r2.setIntOption(r3, r5)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 364(0x16c, float:5.1E-43)
            r2.setLongOption(r3, r8)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 365(0x16d, float:5.11E-43)
            r2.setLongOption(r3, r8)
        L493:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 361(0x169, float:5.06E-43)
            int r5 = r0.mEnableDecoderStall
            r2.setIntOption(r3, r5)
            int r2 = r0.mEnableDecoderStall
            if (r2 != r6) goto L4b7
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 363(0x16b, float:5.09E-43)
            int r5 = com.bykv.vk.component.ttvideo.VideoLiveManager.mDecoderStallThreshold
            r2.setIntOption(r3, r5)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 366(0x16e, float:5.13E-43)
            r2.setLongOption(r3, r8)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 367(0x16f, float:5.14E-43)
            r2.setLongOption(r3, r8)
        L4b7:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 380(0x17c, float:5.32E-43)
            int r5 = r0.mEnableStallCounter
            r2.setIntOption(r3, r5)
            int r2 = r0.mEnableTcpFastOpen
            if (r2 != r6) goto L4d6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            if (r3 == 0) goto L4d6
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r0.mLogService
            r5.mEnableTcpFastOpen = r2
            r5 = 316(0x13c, float:4.43E-43)
            r3.setIntOption(r5, r2)
            java.lang.String r2 = "live_enable_tcp_fast_open:1,"
            r1.append(r2)
        L4d6:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            if (r2 == 0) goto L4f1
            int r3 = r0.mEnableCmafFastMode
            if (r3 != r6) goto L4e8
            r5 = 611(0x263, float:8.56E-43)
            r2.setIntOption(r5, r3)
            java.lang.String r2 = "live_enable_cmaf_fast_mode:1 "
            r1.append(r2)
        L4e8:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 680(0x2a8, float:9.53E-43)
            int r5 = r0.mEnableCmafOptimizeRetry
            r2.setIntOption(r3, r5)
        L4f1:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            if (r2 == 0) goto L4fc
            r3 = 642(0x282, float:9.0E-43)
            int r5 = r0.mEnableVideoMpdRefresh
            r2.setIntOption(r3, r5)
        L4fc:
            int r2 = r0.mEnableCheckPacketCorrupt
            if (r2 != r6) goto L50e
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            if (r3 == 0) goto L50e
            r5 = 317(0x13d, float:4.44E-43)
            r3.setIntOption(r5, r2)
            java.lang.String r2 = "live_enable_check_packet_corrupt:1,"
            r1.append(r2)
        L50e:
            boolean r2 = r0.mEnableResolutionAutoDegrade
            if (r2 == 0) goto L52f
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = r0.mURLSource
            int r2 = r2.getSourceType()
            if (r2 != r7) goto L52f
            java.lang.String r2 = r0.mAbrStrategy
            java.lang.String r3 = "abr_bb_4live"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L52f
            int r2 = r0.mABRDisableAlgorithm
            if (r2 != r6) goto L52f
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 651(0x28b, float:9.12E-43)
            r2.setIntOption(r3, r6)
        L52f:
            int r2 = r0.mEnableFlvABR
            if (r2 != r6) goto L538
            java.lang.String r2 = "live_enable_flv_abr:1,"
            r1.append(r2)
        L538:
            int r2 = r0.mEnableOptimizeBackup
            if (r2 != r6) goto L541
            java.lang.String r2 = "live_enable_optimize_backup:1,"
            r1.append(r2)
        L541:
            int r2 = r0.mEnableStallRetryInstantly
            if (r2 != r6) goto L54b
            java.lang.String r2 = "live_enable_stall_retry_instantly:1 "
            r1.append(r2)
            goto L550
        L54b:
            java.lang.String r2 = "live_enable_stall_retry_instantly:0 "
            r1.append(r2)
        L550:
            int r2 = r0.mEnableCacheSei
            if (r2 != r6) goto L569
            java.lang.String r2 = "live_enable_sei_pts_sync:1 "
            r1.append(r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 368(0x170, float:5.16E-43)
            r2.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 369(0x171, float:5.17E-43)
            r5 = 1000(0x3e8, float:1.401E-42)
            r2.setIntOption(r3, r5)
        L569:
            int r2 = r0.mEnableDecodeMultiSei
            if (r2 != r6) goto L579
            java.lang.String r2 = "live_enable_decode_multi_sei:1 "
            r1.append(r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 372(0x174, float:5.21E-43)
            r2.setIntOption(r3, r6)
        L579:
            int r2 = r0.mEnableDecodeSeiOnce
            if (r2 != r6) goto L589
            java.lang.String r2 = "live_enable_decode_sei_once:1 "
            r1.append(r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 648(0x288, float:9.08E-43)
            r2.setIntOption(r3, r6)
        L589:
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r0.mSettingsBundle
            if (r2 == 0) goto L5a6
            java.lang.String r3 = "live_sdk_super_resolution_enable"
            java.lang.Object r2 = r2.getSettingsValueForKey(r3, r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r6) goto L5a1
            java.lang.String r2 = "live_sdk_super_resolution_enable:1 "
            r1.append(r2)
            goto L5a6
        L5a1:
            java.lang.String r2 = "live_sdk_super_resolution_enable:0 "
            r1.append(r2)
        L5a6:
            int r2 = r0.mEnableTextureRender
            if (r2 != r6) goto L5b0
            java.lang.String r2 = "live_sdk_texture_render_enable:1 "
            r1.append(r2)
            goto L5b5
        L5b0:
            java.lang.String r2 = "live_sdk_texture_render_enable:0 "
            r1.append(r2)
        L5b5:
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r0.mSettingsBundle
            if (r2 == 0) goto L5d2
            java.lang.String r3 = "live_sdk_sharpen_enable"
            java.lang.Object r2 = r2.getSettingsValueForKey(r3, r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r6) goto L5cd
            java.lang.String r2 = "live_sdk_sharpen_enable:1 "
            r1.append(r2)
            goto L5d2
        L5cd:
            java.lang.String r2 = "live_sdk_sharpen_enable:0 "
            r1.append(r2)
        L5d2:
            int r2 = r0.mEnableOpenLiveIO
            if (r2 != r6) goto L5db
            java.lang.String r2 = "live_sdk_enable_liveio:1 "
            r1.append(r2)
        L5db:
            int r2 = r0.mEnableAudioVolumeBalance
            java.lang.String r3 = " "
            if (r2 != r6) goto L658
            java.lang.String r2 = "live_sdk_audio_volume_balance_enable:1 "
            r1.append(r2)
            float r2 = r0.mAudioVolumeBalancePregain
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L604
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "live_sdk_audio_volume_balance_pregain:"
            r2.<init>(r5)
            float r5 = r0.mAudioVolumeBalancePregain
            r2.append(r5)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
        L604:
            float r2 = r0.mAudioVolumeBalanceThreshold
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L620
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "live_sdk_audio_volume_balance_threshold:"
            r2.<init>(r5)
            float r5 = r0.mAudioVolumeBalanceThreshold
            r2.append(r5)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
        L620:
            float r2 = r0.mAudioVolumeBalanceRatio
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L63c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "live_sdk_audio_volume_balance_ratio:"
            r2.<init>(r5)
            float r5 = r0.mAudioVolumeBalanceRatio
            r2.append(r5)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
        L63c:
            float r2 = r0.mAudioVolumeBalancePredelay
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L658
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "live_sdk_audio_volume_balance_predelay:"
            r2.<init>(r4)
            float r4 = r0.mAudioVolumeBalancePredelay
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
        L658:
            int r2 = r0.mEnableNotifySeiImmediatelyBeforeFirstFrame
            if (r2 != r6) goto L668
            java.lang.String r2 = "live_sdk_notifysei_immediately_before_firstframe:1 "
            r1.append(r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r4 = 649(0x289, float:9.1E-43)
            r2.setIntOption(r4, r6)
        L668:
            int r2 = r0.mEnableRadioLiveDisableRender
            if (r2 != r6) goto L671
            java.lang.String r2 = "live_sdk_enable_radiolive_disable_render:1 "
            r1.append(r2)
        L671:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            java.lang.String r2 = r2.mHostNTPUrl
            if (r2 == 0) goto L68f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "live_sdk_ntp_server_name:"
            r2.<init>(r4)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r4 = r0.mLogService
            java.lang.String r4 = r4.mHostNTPUrl
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
        L68f:
            int r2 = r0.mEnableReportSessionStop
            if (r2 != r6) goto L69c
            java.lang.String r2 = "live_sdk_should_report_session_stop:1 "
            r1.append(r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            r2.mEnableReportSessionStop = r6
        L69c:
            boolean r2 = r0.mUsePlayerRenderStart
            if (r2 == 0) goto L6a5
            java.lang.String r2 = "live_sdk_texturerender_use_player_renderstart:1 "
            r1.append(r2)
        L6a5:
            int r2 = r0.mEnableFreeFlow
            if (r2 != r6) goto L6ae
            java.lang.String r2 = "live_sdk_isfreeflow:1 "
            r1.append(r2)
        L6ae:
            int r2 = r0.mEnableDroppingDTSRollFrame
            if (r2 != r6) goto L6c0
            java.lang.String r2 = "live_sdk_dropping_dts_rollback_frame_enabled:1 "
            r1.append(r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 148(0x94, float:2.07E-43)
            int r4 = r0.mEnableDroppingDTSRollFrame
            r2.setIntOption(r3, r4)
        L6c0:
            int r2 = r0.mEnableUseLiveThreadPool
            if (r2 != r6) goto L6c9
            java.lang.String r2 = "live_sdk_enable_use_live_threadpool:1 "
            r1.append(r2)
        L6c9:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r0.mLogService
            int r3 = r0.mIsInMainLooper
            r2.mIsInMainLooper = r3
            int r3 = r1.length()
            if (r3 != 0) goto L6d8
            java.lang.String r1 = "none"
            goto L6e5
        L6d8:
            int r3 = r1.length()
            int r3 = r3 - r6
            java.lang.StringBuilder r1 = r1.deleteCharAt(r3)
            java.lang.String r1 = r1.toString()
        L6e5:
            r2.mSettingsInfo = r1
            java.lang.String r1 = r0.mStreamFormat
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L70c
            java.lang.String r1 = r0.mStreamFormat
            java.lang.String r2 = "hls"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L703
            java.lang.String r1 = r0.mStreamFormat
            java.lang.String r2 = "tsl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L70c
        L703:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r0.mPlayer
            r2 = 298(0x12a, float:4.18E-43)
            int r3 = r0.mHlsLiveStartIndex
            r1.setIntOption(r2, r3)
        L70c:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r0.mLogService
            int r2 = r0.mEnableLowLatencyFLV
            r1.mEnableLowLatencyFLV = r2
            int r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.mFastOpenDuration
            r1.mFastOpenDuration = r2
            return
    }

    private void configPlayerInstanceOption() {
            r4 = this;
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r4.mLogService
            java.lang.String r1 = r4.mSuggestProtocol
            java.lang.String r2 = r4.mTransportProtocol
            r0.setProtocolInfo(r1, r2)
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r4.mURLSource
            java.lang.String r1 = r4.mResolution
            java.lang.String r2 = r4.mLevel
            java.lang.String r0 = r0.getSDKParams(r1, r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r4.mLogService
            r1.setSdkParams(r0)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r4.mPlayer
            if (r0 == 0) goto L25
            java.lang.String r1 = r4.mStreamFormat
            if (r1 == 0) goto L25
            r2 = 315(0x13b, float:4.41E-43)
            r0.setStringOption(r2, r1)
        L25:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r4.mPlayer
            if (r0 == 0) goto L69
            int r1 = r4.mEnableAudioVolumeBalance
            r2 = 1
            if (r1 != r2) goto L69
            r1 = 302(0x12e, float:4.23E-43)
            r0.setIntOption(r1, r2)
            float r0 = r4.mAudioVolumeBalancePregain
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L42
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r4.mPlayer
            r3 = 303(0x12f, float:4.25E-43)
            r2.setFloatOption(r3, r0)
        L42:
            float r0 = r4.mAudioVolumeBalanceThreshold
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L4f
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r4.mPlayer
            r3 = 304(0x130, float:4.26E-43)
            r2.setFloatOption(r3, r0)
        L4f:
            float r0 = r4.mAudioVolumeBalanceRatio
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L5c
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r4.mPlayer
            r3 = 305(0x131, float:4.27E-43)
            r2.setFloatOption(r3, r0)
        L5c:
            float r0 = r4.mAudioVolumeBalancePredelay
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L69
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r4.mPlayer
            r2 = 306(0x132, float:4.29E-43)
            r1.setFloatOption(r2, r0)
        L69:
            return
    }

    private void configToBParams() {
            r3 = this;
            int r0 = r3.mSwitchToB
            r1 = 1
            if (r0 != r1) goto L10
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.mPlayer
            if (r0 == 0) goto L10
            r1 = 509(0x1fd, float:7.13E-43)
            java.lang.String r2 = r3.mMoudleIDToB
            r0.setStringOption(r1, r2)
        L10:
            return
    }

    private java.lang.String convertCodecName(int r1) {
            r0 = this;
            switch(r1) {
                case 1: goto L15;
                case 2: goto L12;
                case 3: goto Lf;
                case 4: goto Lc;
                case 5: goto L9;
                case 6: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r1 = "none_codec"
            return r1
        L6:
            java.lang.String r1 = "JX_ByteVC1_codec"
            return r1
        L9:
            java.lang.String r1 = "KS_ByteVC1_codec"
            return r1
        Lc:
            java.lang.String r1 = "ff_ByteVC1_codec"
            return r1
        Lf:
            java.lang.String r1 = "ff_H264_codec"
            return r1
        L12:
            java.lang.String r1 = "hardware_codec"
            return r1
        L15:
            java.lang.String r1 = "IOSHWCodec"
            return r1
    }

    public static boolean dataLoaderIsRunning() {
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r0 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            boolean r0 = r0.isRunning()
            return r0
    }

    private boolean degradeResolution() {
            r8 = this;
            java.lang.String r0 = r8.mResolution
            java.lang.String r1 = "ld"
            r2 = 0
            if (r0 != r1) goto L8
            return r2
        L8:
            int r0 = r8.mResolutionIndex
            r1 = -1
            if (r0 != r1) goto L23
            r0 = 0
        Le:
            java.lang.String[] r1 = com.bykv.vk.component.ttvideo.LiveConfigKey.resolution
            int r3 = r1.length
            if (r0 >= r3) goto L23
            r1 = r1[r0]
            java.lang.String r3 = r8.mResolution
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L20
            r8.mResolutionIndex = r0
            goto L23
        L20:
            int r0 = r0 + 1
            goto Le
        L23:
            int r0 = r8.mResolutionIndex
            r1 = 1
            int r0 = r0 + r1
        L27:
            java.lang.String[] r3 = com.bykv.vk.component.ttvideo.LiveConfigKey.resolution
            int r4 = r3.length
            if (r0 >= r4) goto L39
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r4 = r8.mURLSource
            r5 = r3[r0]
            boolean r4 = r4.isSupportResolution(r5)
            if (r4 != 0) goto L39
            int r0 = r0 + 1
            goto L27
        L39:
            int r4 = r3.length
            if (r0 < r4) goto L3d
            return r2
        L3d:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r4 = r8.mURLSource
            r5 = r3[r0]
            java.lang.String r6 = r8.mStreamFormat
            java.lang.String r7 = r8.mLevel
            java.lang.String r4 = r4.getPlayURLForResolution(r5, r6, r7)
            if (r4 != 0) goto L4c
            return r2
        L4c:
            java.lang.String r5 = r8.mCurrentPlayURL
            r8.mCurrentPlayURL = r4
            r8.mResolutionIndex = r0
            r8.saveCurrentResolution()
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r6 = r8.mLogService
            r0 = r3[r0]
            r8.mResolution = r0
            r6.mResolution = r0
            java.lang.String r0 = r8.mCurrentPlayURL
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "auto_"
            r3.<init>(r7)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r7 = r8.mLogService
            java.lang.String r7 = r7.mLastResolution
            r3.append(r7)
            java.lang.String r7 = "_to_"
            r3.append(r7)
            java.lang.String r7 = r8.mResolution
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r7 = -100015(0xfffffffffffe7951, float:NaN)
            r6.onSwitch(r5, r0, r3, r7)
            com.bykv.vk.component.ttvideo.ILiveListener r0 = r8.mListener
            if (r0 == 0) goto L8a
            java.lang.String r3 = r8.mResolution
            r0.onResolutionDegrade(r3)
        L8a:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r8.mLogService
            java.lang.String r3 = r8.mCurrentPlayURL
            r0.onSwitchURL(r3)
            r8.mStallCount = r2
            r8.parsePlayDNS(r4)
            return r1
    }

    public static void enableLoadLibrary() {
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r0 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            r0.enableLoadLibrary()
            return
    }

    private org.json.JSONObject extractAvphStreamInfo(java.lang.String r23) {
            r22 = this;
            java.lang.String r0 = "video_find_stream_info_cost"
            java.lang.String r1 = "video_open_input_cost"
            java.lang.String r2 = "audio_find_stream_info_cost"
            java.lang.String r3 = "audio_open_input_cost"
            java.lang.String r4 = "video_first_pkt_dts"
            java.lang.String r5 = "video_first_pkt_ts"
            java.lang.String r6 = "audio_first_pkt_dts"
            java.lang.String r7 = "audio_first_pkt_ts"
            java.lang.String r8 = "av_dts_diff"
            java.lang.String r9 = "audio_cur_dts"
            java.lang.String r10 = "vv_dts_diff"
            java.lang.String r11 = "video_cur_dts"
            java.lang.String r12 = "video_last_dts"
            java.lang.String r13 = "video_key"
            boolean r14 = android.text.TextUtils.isEmpty(r23)
            r15 = 0
            if (r14 == 0) goto L24
            return r15
        L24:
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            r16 = r15
            java.lang.String r15 = ","
            r17 = r0
            r0 = r23
            java.lang.String[] r0 = r0.split(r15)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            int r15 = r0.length     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r18 = 0
            r23 = r0
            r0 = 0
        L3b:
            if (r0 >= r15) goto L183
            r18 = r0
            r0 = r23[r18]     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            boolean r19 = r0.startsWith(r13)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            if (r19 == 0) goto L66
            r19 = r15
            r15 = 10
            java.lang.String r0 = r0.substring(r15)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r14.put(r13, r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
        L56:
            r21 = r9
            r20 = r12
            r9 = r1
            r12 = r8
        L5c:
            r8 = r17
            goto L175
        L60:
            r0 = move-exception
            goto L184
        L63:
            r0 = move-exception
            goto L188
        L66:
            r19 = r15
            boolean r15 = r0.startsWith(r12)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            if (r15 == 0) goto L7c
            r15 = 15
            java.lang.String r0 = r0.substring(r15)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r14.put(r12, r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            goto L56
        L7c:
            boolean r15 = r0.startsWith(r11)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r20 = r12
            r12 = 14
            if (r15 == 0) goto L99
            java.lang.String r0 = r0.substring(r12)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r14.put(r11, r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
        L91:
            r12 = r8
            r21 = r9
            r8 = r17
        L96:
            r9 = r1
            goto L175
        L99:
            boolean r15 = r0.startsWith(r10)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r12 = 12
            if (r15 == 0) goto Lad
            java.lang.String r0 = r0.substring(r12)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r14.put(r10, r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            goto L91
        Lad:
            boolean r15 = r0.startsWith(r9)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            if (r15 == 0) goto Lc1
            r15 = 14
            java.lang.String r0 = r0.substring(r15)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r14.put(r9, r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            goto L91
        Lc1:
            boolean r15 = r0.startsWith(r8)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            if (r15 == 0) goto Ld3
            java.lang.String r0 = r0.substring(r12)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r14.put(r8, r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            goto L91
        Ld3:
            boolean r12 = r0.startsWith(r7)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r15 = 19
            if (r12 == 0) goto Lec
            java.lang.String r0 = r0.substring(r15)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r12 = r8
            r21 = r9
            long r8 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r14.put(r7, r8)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
        Le9:
            r9 = r1
            goto L5c
        Lec:
            r12 = r8
            r21 = r9
            boolean r8 = r0.startsWith(r6)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r9 = 20
            if (r8 == 0) goto L103
            java.lang.String r0 = r0.substring(r9)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            long r8 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r14.put(r6, r8)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            goto Le9
        L103:
            boolean r8 = r0.startsWith(r5)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            if (r8 == 0) goto L115
            java.lang.String r0 = r0.substring(r15)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            long r8 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r14.put(r5, r8)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            goto Le9
        L115:
            boolean r8 = r0.startsWith(r4)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            if (r8 == 0) goto L127
            java.lang.String r0 = r0.substring(r9)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            long r8 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r14.put(r4, r8)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            goto Le9
        L127:
            boolean r8 = r0.startsWith(r3)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r9 = 22
            if (r8 == 0) goto L13b
            java.lang.String r0 = r0.substring(r9)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            long r8 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r14.put(r3, r8)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            goto Le9
        L13b:
            boolean r8 = r0.startsWith(r2)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r15 = 28
            if (r8 == 0) goto L14f
            java.lang.String r0 = r0.substring(r15)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            long r8 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r14.put(r2, r8)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            goto Le9
        L14f:
            boolean r8 = r0.startsWith(r1)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            if (r8 == 0) goto L161
            java.lang.String r0 = r0.substring(r9)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            long r8 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r14.put(r1, r8)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            goto Le9
        L161:
            r8 = r17
            boolean r9 = r0.startsWith(r8)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            if (r9 == 0) goto L96
            java.lang.String r0 = r0.substring(r15)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r9 = r1
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
            r14.put(r8, r0)     // Catch: java.lang.Exception -> L60 org.json.JSONException -> L63
        L175:
            int r0 = r18 + 1
            r17 = r8
            r1 = r9
            r8 = r12
            r15 = r19
            r12 = r20
            r9 = r21
            goto L3b
        L183:
            return r14
        L184:
            com.bytedance.sdk.component.utils.vl.j(r0)
            goto L18b
        L188:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L18b:
            return r16
    }

    private org.json.JSONArray formatABRStreamInfoToJSONArray(java.lang.String r10) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: org.json.JSONException -> L9f
            r1.<init>()     // Catch: org.json.JSONException -> L9f
        L9:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L9f
            r2.<init>()     // Catch: org.json.JSONException -> L9f
            java.lang.String r3 = "index:"
            int r3 = r10.indexOf(r3)     // Catch: org.json.JSONException -> L9f
            java.lang.String r4 = ",pts_diff:"
            int r4 = r10.indexOf(r4)     // Catch: org.json.JSONException -> L9f
            if (r3 < 0) goto Lb9
            if (r4 < 0) goto Lb9
            if (r3 >= r4) goto Lb9
            int r3 = r3 + 6
            java.lang.String r3 = r10.substring(r3, r4)     // Catch: org.json.JSONException -> L9f
            java.lang.String r5 = "index"
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: org.json.JSONException -> L9f
            r2.put(r5, r3)     // Catch: org.json.JSONException -> L9f
            java.lang.String r10 = r10.substring(r4)     // Catch: org.json.JSONException -> L9f
            java.lang.String r3 = ",drop_dur:"
            int r3 = r10.indexOf(r3)     // Catch: org.json.JSONException -> L9f
            if (r3 < 0) goto Lb9
            r4 = 10
            if (r4 >= r3) goto Lb9
            java.lang.String r5 = r10.substring(r4, r3)     // Catch: org.json.JSONException -> L9f
            java.lang.String r6 = "pts_diff"
            long r7 = java.lang.Long.parseLong(r5)     // Catch: org.json.JSONException -> L9f
            r2.put(r6, r7)     // Catch: org.json.JSONException -> L9f
            java.lang.String r10 = r10.substring(r3)     // Catch: org.json.JSONException -> L9f
            java.lang.String r3 = ",key:"
            int r3 = r10.indexOf(r3)     // Catch: org.json.JSONException -> L9f
            if (r3 < 0) goto Lb9
            if (r4 >= r3) goto Lb9
            java.lang.String r4 = r10.substring(r4, r3)     // Catch: org.json.JSONException -> L9f
            java.lang.String r5 = "drop_dur"
            long r6 = java.lang.Long.parseLong(r4)     // Catch: org.json.JSONException -> L9f
            r2.put(r5, r6)     // Catch: org.json.JSONException -> L9f
            java.lang.String r10 = r10.substring(r3)     // Catch: org.json.JSONException -> L9f
            java.lang.String r3 = ",index:"
            int r3 = r10.indexOf(r3)     // Catch: org.json.JSONException -> L9f
            r4 = -1
            java.lang.String r5 = "key_frame"
            r6 = 5
            if (r3 != r4) goto La1
            int r3 = r10.length()     // Catch: org.json.JSONException -> L9f
            if (r3 == 0) goto Lb9
            java.lang.String r10 = r10.substring(r6)     // Catch: org.json.JSONException -> L9f
            int r3 = java.lang.Integer.parseInt(r10)     // Catch: org.json.JSONException -> L9f
            r2.put(r5, r3)     // Catch: org.json.JSONException -> L9f
            r1.add(r2)     // Catch: org.json.JSONException -> L9f
            java.lang.String r2 = "VideoLiveManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L9f
            java.lang.String r4 = "key: "
            r3.<init>(r4)     // Catch: org.json.JSONException -> L9f
            r3.append(r10)     // Catch: org.json.JSONException -> L9f
            java.lang.String r10 = r3.toString()     // Catch: org.json.JSONException -> L9f
            com.bytedance.sdk.component.utils.vl.j(r2, r10)     // Catch: org.json.JSONException -> L9f
            goto Lb9
        L9f:
            r10 = move-exception
            goto Lbf
        La1:
            if (r6 >= r3) goto Lb9
            java.lang.String r4 = r10.substring(r6, r3)     // Catch: org.json.JSONException -> L9f
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: org.json.JSONException -> L9f
            r2.put(r5, r4)     // Catch: org.json.JSONException -> L9f
            r1.add(r2)     // Catch: org.json.JSONException -> L9f
            int r3 = r3 + 1
            java.lang.String r10 = r10.substring(r3)     // Catch: org.json.JSONException -> L9f
            goto L9
        Lb9:
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch: org.json.JSONException -> L9f
            r10.<init>(r1)     // Catch: org.json.JSONException -> L9f
            return r10
        Lbf:
            com.bytedance.sdk.component.utils.vl.j(r10)
            return r0
    }

    private org.json.JSONArray formatAVPHStreamInfoToJSONArray(java.lang.String r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L8
            r4 = 0
            return r4
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = ";"
            boolean r2 = r4.contains(r1)
            if (r2 == 0) goto L2b
            java.lang.String[] r4 = r4.split(r1)
            r1 = 0
        L1a:
            int r2 = r4.length
            if (r1 >= r2) goto L34
            r2 = r4[r1]
            org.json.JSONObject r2 = r3.extractAvphStreamInfo(r2)
            if (r2 == 0) goto L28
            r0.add(r2)
        L28:
            int r1 = r1 + 1
            goto L1a
        L2b:
            org.json.JSONObject r4 = r3.extractAvphStreamInfo(r4)
            if (r4 == 0) goto L34
            r0.add(r4)
        L34:
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>(r0)
            return r4
    }

    public static com.bykv.vk.component.ttvideo.VideoLiveManager.Builder newBuilder(android.content.Context r2) {
            com.bykv.vk.component.ttvideo.VideoLiveManager$Builder r0 = new com.bykv.vk.component.ttvideo.VideoLiveManager$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    private void open() {
            r5 = this;
            int r0 = r5.mPlayerType
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.setValue(r2, r0)
            int r0 = r5.mPlayerType
            r3 = 2
            if (r0 != r3) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.setValue(r3, r0)
            r0 = 6
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.setValue(r0, r1)
            r0 = 11
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.setValue(r0, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            if (r0 == 0) goto L3a
            boolean r0 = r0.isOSPlayer()
            int r4 = r5.mPlayerType
            if (r4 != 0) goto L2e
            r4 = 1
            goto L2f
        L2e:
            r4 = 0
        L2f:
            r0 = r0 ^ r4
            if (r0 == 0) goto L3a
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r0.releaseAsync()
            r0 = 0
            r5.mPlayer = r0
        L3a:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            if (r0 != 0) goto L6d
            android.content.Context r0 = r5.mContext
            int r4 = r5.mPlayerDegradeMode
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.playerwrapper.MediaPlayerWrapper.create(r0, r4)
            r5.mPlayer = r0
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r0 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            com.bykv.vk.component.ttvideo.player.MediaPlayer r4 = r5.mPlayer
            r0.setMediaPlayer(r4)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            int r0 = r0.getPlayerType()
            if (r0 == r2) goto L67
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            int r0 = r0.getPlayerType()
            if (r0 == r3) goto L67
            r5.mHardwareDecodeEnable = r1
            r5.mEnableH264HardwareDecode = r1
            r5.mEnableByteVC1HardwareDecode = r1
        L67:
            r5.configPlayerGlobalOption()
            r5.configPlayerEventHandler()
        L6d:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            boolean r0 = r0.isOSPlayer()
            if (r0 == 0) goto L7d
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r5.mLogService
            java.lang.String r1 = "-1"
            r0.setPlayerSdkVersion(r1)
            goto L8a
        L7d:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r5.mLogService
            r1 = 14
            java.lang.String r2 = "0"
            java.lang.String r1 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r1, r2)
            r0.setPlayerSdkVersion(r1)
        L8a:
            com.bykv.vk.component.ttvideo.network.DnsHelper r0 = r5.mDnsParser
            boolean r1 = r5.mForceHttpDns
            java.lang.String r2 = r5.mHttpDNSServerHost
            r0.configure(r1, r2)
            com.bykv.vk.component.ttvideo.network.LiveDataFetcher r0 = r5.mFetcher
            if (r0 != 0) goto La2
            com.bykv.vk.component.ttvideo.network.LiveDataFetcher r0 = new com.bykv.vk.component.ttvideo.network.LiveDataFetcher
            java.util.concurrent.ExecutorService r1 = r5.mExecutor
            com.bykv.vk.component.ttvideo.INetworkClient r2 = r5.mNetworkClient
            r0.<init>(r1, r2)
            r5.mFetcher = r0
        La2:
            com.bykv.vk.component.ttvideo.playerwrapper.PlayerSetting r0 = r5.mPlayerSetting
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r5.mPlayer
            r0.setPlayer(r1)
            return
    }

    private java.lang.String packAvphHeader(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = ""
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L19
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "&"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "="
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            return r2
    }

    private void parsePlayDNS(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "VideoLiveManager"
            java.lang.String r1 = "parsePlayDNS"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r1)
            r0 = 2
            r1 = 1
            if (r8 == 0) goto L136
            int r2 = r8.length()
            if (r2 != 0) goto L13
            goto L136
        L13:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = r7.mURLSource
            java.lang.String r3 = r7.mStreamFormat
            java.lang.String r4 = r7.mLevel
            java.lang.String r5 = r7.mTransportProtocol
            java.lang.String r2 = r2.getPortNum(r3, r4, r5)
            java.lang.String r3 = "rtmp"
            boolean r3 = r8.startsWith(r3)
            r4 = 0
            if (r3 != 0) goto L7a
            if (r2 != 0) goto L7a
            java.lang.String r3 = r7.mTransportProtocol
            r3.getClass()
            int r5 = r3.hashCode()
            r6 = -1
            switch(r5) {
                case 106008: goto L63;
                case 114657: goto L58;
                case 114939: goto L4f;
                case 3482174: goto L44;
                case 107947511: goto L39;
                default: goto L37;
            }
        L37:
            r0 = -1
            goto L6d
        L39:
            java.lang.String r0 = "quicu"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L42
            goto L37
        L42:
            r0 = 4
            goto L6d
        L44:
            java.lang.String r0 = "quic"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4d
            goto L37
        L4d:
            r0 = 3
            goto L6d
        L4f:
            java.lang.String r5 = "tls"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L6d
            goto L37
        L58:
            java.lang.String r0 = "tcp"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L61
            goto L37
        L61:
            r0 = 1
            goto L6d
        L63:
            java.lang.String r0 = "kcp"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L6c
            goto L37
        L6c:
            r0 = 0
        L6d:
            java.lang.String r3 = "80"
            switch(r0) {
                case 0: goto L78;
                case 1: goto L73;
                case 2: goto L75;
                case 3: goto L73;
                case 4: goto L73;
                default: goto L72;
            }
        L72:
            goto L7a
        L73:
            r2 = r3
            goto L7a
        L75:
            java.lang.String r2 = "443"
            goto L7a
        L78:
            java.lang.String r2 = "8848"
        L7a:
            int r0 = r7.mEnableRtcPlay
            if (r0 == 0) goto L82
            int r0 = r7.mRtcPlayFallBack
            if (r0 != r1) goto L8d
        L82:
            java.lang.String r8 = r7.set_url_port_scheme(r8, r2)
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r7.mURLSource
            java.lang.String r1 = r7.mTransportProtocol
            r0.setTransportProtocol(r1, r2)
        L8d:
            java.lang.String r0 = r7.mStreamFormat
            if (r0 == 0) goto L9d
            java.lang.String r1 = "avph"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L9d
            r7.prepareAvphPlay()
            goto Le2
        L9d:
            java.lang.String r0 = r7.mEnableAvLines
            java.lang.String r1 = "true"
            boolean r0 = r0.equals(r1)
            java.lang.String r2 = "1"
            java.lang.String r3 = "only_audio=1"
            java.lang.String r5 = "only_video=1"
            if (r0 == 0) goto Lc4
            java.lang.String r0 = r7.mVideoOnly
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto Lc4
            java.lang.String r0 = r7.mAudioOnly
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto Lc4
            java.lang.String r0 = "only_video"
            java.lang.String r8 = r7._addParamToURL(r8, r0, r2)
            goto Le2
        Lc4:
            java.lang.String r0 = r7.mEnableAvLines
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le2
            java.lang.String r0 = r7.mVideoOnly
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Le2
            java.lang.String r0 = r7.mAudioOnly
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Le2
            java.lang.String r0 = "only_audio"
            java.lang.String r8 = r7._addParamToURL(r8, r0, r2)
        Le2:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r7.mLogService
            java.lang.String r1 = "none"
            r0.setCdnIp(r1, r4)
            r7.mCurrentPlayURL = r8
            java.lang.String r0 = com.bykv.vk.component.ttvideo.network.DnsHelper.getUrlHost(r8)
            boolean r1 = com.bykv.vk.component.ttvideo.network.DnsHelper.isIP(r0)
            if (r1 != 0) goto L10c
            boolean r1 = r7.mEnableDns
            if (r1 == 0) goto L10c
            if (r0 != 0) goto Lfc
            goto L10c
        Lfc:
            com.bykv.vk.component.ttvideo.retry.RetryProcessor r1 = r7.mRetryProcessor
            r1.setHost(r0)
            com.bykv.vk.component.ttvideo.network.DnsHelper r1 = r7.mDnsParser
            com.bykv.vk.component.ttvideo.VideoLiveManager$3 r2 = new com.bykv.vk.component.ttvideo.VideoLiveManager$3
            r2.<init>(r7, r0, r8)
            r1.parseDns(r0, r2)
            return
        L10c:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r7.mLogService
            r1.onSDKDNSComplete(r4, r4)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r7.mLogService
            r1.onCallPrepare()
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r7.mLogService
            r1.setCdnIp(r0, r4)
            java.lang.String r1 = r7.mURLHost
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            if (r1 != 0) goto L130
            boolean r1 = com.bykv.vk.component.ttvideo.network.DnsHelper.isIP(r0)
            if (r1 == 0) goto L130
            java.lang.String r1 = r7.mURLHost
            r7.prepareToPlay(r8, r8, r2, r1)
            goto L133
        L130:
            r7.prepareToPlay(r8, r8, r2, r2)
        L133:
            r7.mCurrentIP = r0
            return
        L136:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r8 = r7.mURLSource
            int r8 = r8.getSourceType()
            if (r8 != r1) goto L148
            r8 = -100017(0xfffffffffffe794f, float:NaN)
            boolean r8 = r7.bytevc1DegradeH264(r8)
            if (r8 == 0) goto L148
            goto L15d
        L148:
            boolean r8 = r7.mEnableSwitchMainAndBackupUrl
            r1 = -100002(0xfffffffffffe795e, float:NaN)
            if (r8 == 0) goto L15e
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r8 = r7.mURLSource
            int r8 = r8.getSourceType()
            if (r8 != r0) goto L15e
            boolean r8 = r7.switchMainAndBackupUrl(r1)
            if (r8 == 0) goto L15e
        L15d:
            return
        L15e:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.lang.String r0 = "url"
            java.lang.String r2 = "try out all urls"
            r8.put(r0, r2)
            com.bykv.vk.component.ttvideo.log.LiveError r0 = new com.bykv.vk.component.ttvideo.log.LiveError
            r0.<init>(r1, r2, r8)
            com.bykv.vk.component.ttvideo.retry.RetryProcessor r8 = r7.mRetryProcessor
            boolean r1 = r7.mShowedFirstFrame
            r8.onError(r0, r1)
            return
    }

    private void parseResponseHeaders(com.bykv.vk.component.ttvideo.log.LogBundle r9) {
            r8 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 335(0x14f, float:4.7E-43)
            java.lang.String r0 = r0.getStringOption(r1)
            if (r0 != 0) goto Lb
            goto L3f
        Lb:
            java.lang.String r1 = "\r\n"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 0
        L13:
            if (r2 >= r1) goto L3f
            r3 = r0[r2]
            java.lang.String r4 = "X-Server-Ip: "
            boolean r4 = r3.startsWith(r4)
            r5 = 2
            java.lang.String r6 = ": "
            r7 = 1
            if (r4 == 0) goto L2c
            java.lang.String[] r3 = r3.split(r6, r5)
            r3 = r3[r7]
            r9.headerXServerIP = r3
            goto L3c
        L2c:
            java.lang.String r4 = "Via: "
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L3c
            java.lang.String[] r3 = r3.split(r6, r5)
            r3 = r3[r7]
            r9.headerVia = r3
        L3c:
            int r2 = r2 + 1
            goto L13
        L3f:
            return
    }

    private void prepareAvphPlay() {
            r5 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r1 = 159(0x9f, float:2.23E-43)
            int r2 = r5.mFramesDrop
            r0.setIntOption(r1, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r1 = 653(0x28d, float:9.15E-43)
            int r2 = r5.mEnableSkipFindUnnecessaryStream
            r0.setIntOption(r1, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r1 = 655(0x28f, float:9.18E-43)
            int r2 = r5.mAVPHDnsParseEnable
            r0.setIntOption(r1, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r1 = 656(0x290, float:9.19E-43)
            int r2 = r5.mAVPHDnsTimeout
            r0.setIntOption(r1, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r1 = 326(0x146, float:4.57E-43)
            int r2 = r5.mAVPHVideoProbesize
            r0.setIntOption(r1, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r1 = 327(0x147, float:4.58E-43)
            int r2 = r5.mAVPHVideoMaxDuration
            r0.setIntOption(r1, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r1 = 328(0x148, float:4.6E-43)
            int r2 = r5.mAVPHAudioProbesize
            r0.setIntOption(r1, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r1 = 329(0x149, float:4.61E-43)
            int r2 = r5.mAVPHAudioMaxDuration
            r0.setIntOption(r1, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r1 = 330(0x14a, float:4.62E-43)
            int r2 = r5.mAVPHOpenVideoFirst
            r0.setIntOption(r1, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r1 = 331(0x14b, float:4.64E-43)
            int r2 = r5.mAVPHMaxAVDiff
            r0.setIntOption(r1, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r1 = 332(0x14c, float:4.65E-43)
            int r2 = r5.mAVPHEnableAutoReopen
            r0.setIntOption(r1, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r1 = 712(0x2c8, float:9.98E-43)
            int r2 = r5.mAVPHAutoExit
            r0.setIntOption(r1, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r1 = 711(0x2c7, float:9.96E-43)
            int r2 = r5.mAVPHVideoDiffThreshold
            r0.setIntOption(r1, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r1 = 713(0x2c9, float:9.99E-43)
            int r2 = r5.mAVPHReadRetryCount
            r0.setIntOption(r1, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r1 = 714(0x2ca, float:1.0E-42)
            int r2 = r5.mAVPHReadErrorExit
            r0.setIntOption(r1, r2)
            java.lang.String r0 = new java.lang.String
            r0.<init>()
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            java.lang.String r2 = r5.mAudioOnly
            java.lang.String r3 = "only_audio=1"
            boolean r2 = r2.equals(r3)
            java.lang.String r3 = "1"
            if (r2 == 0) goto La3
            java.lang.String r2 = "only_audio"
            java.lang.String r0 = r5.packAvphHeader(r0, r2, r3)
        La3:
            java.lang.String r2 = r5.mVideoOnly
            java.lang.String r4 = "only_video=1"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto Lb3
            java.lang.String r2 = "only_video"
            java.lang.String r1 = r5.packAvphHeader(r1, r2, r3)
        Lb3:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r5.mPlayer
            r3 = 376(0x178, float:5.27E-43)
            r2.setStringOption(r3, r0)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r2 = 377(0x179, float:5.28E-43)
            r0.setStringOption(r2, r1)
            return
    }

    private java.lang.String prepareLiveIOURL(java.lang.String r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
            r0 = this;
            return r1
    }

    private java.lang.String prepareProxyURL(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "prepareProxy play url: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = ", host: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r0)
            java.lang.String r0 = r7.mTransportProtocol
            java.lang.String r2 = "tcp"
            boolean r0 = r0.equals(r2)
            r2 = 0
            if (r0 == 0) goto L1ad
            java.lang.String r0 = r7.mStreamFormat
            java.lang.String r3 = "flv"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1ad
            boolean r0 = r7.mEnableResolutionAutoDegrade
            if (r0 != 0) goto L1ad
            java.lang.String r0 = r7.mSessionId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L3e
            goto L1ad
        L3e:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L1ac
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L4c
            goto L1ac
        L4c:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> L1ac
            r0.<init>(r8)     // Catch: java.lang.Exception -> L1ac
            int r8 = r0.getPort()     // Catch: java.lang.Exception -> L1ac
            r3 = -1
            if (r8 != r3) goto L5d
            int r8 = r0.getDefaultPort()     // Catch: java.lang.Exception -> L1ac
            goto L61
        L5d:
            int r8 = r0.getPort()     // Catch: java.lang.Exception -> L1ac
        L61:
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Exception -> L1ac
            java.lang.String r4 = r0.getProtocol()     // Catch: java.lang.Exception -> L1ac
            java.lang.String r0 = r0.getFile()     // Catch: java.lang.Exception -> L1ac
            r3.<init>(r4, r10, r8, r0)     // Catch: java.lang.Exception -> L1ac
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Exception -> L1ac
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "prepareProxy proxy url: "
            r10.<init>(r0)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "enable liveio:"
            r10.<init>(r0)
            int r0 = r7.mEnableOpenLiveIO
            r10.append(r0)
            java.lang.String r0 = " enable liveio play:"
            r10.append(r0)
            int r0 = r7.mEnableLiveIOPlay
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "live mdl enable_from_sdk:"
            r10.<init>(r0)
            int r0 = r7.mEnableOpenMDL
            r10.append(r0)
            java.lang.String r0 = " enable_from_app:"
            r10.append(r0)
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r0 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            r3 = 8100(0x1fa4, float:1.135E-41)
            long r4 = r0.getLongValueFromLoader(r3)
            r10.append(r4)
            java.lang.String r0 = " is_running:"
            r10.append(r0)
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r0 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            boolean r0 = r0.isRunning()
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r10)
            int r10 = r7.mEnableOpenMDL
            r0 = 1
            if (r10 != r0) goto L1ac
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r10 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            long r3 = r10.getLongValueFromLoader(r3)
            r5 = 1
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 != 0) goto L1ac
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r10 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            boolean r10 = r10.isRunning()
            if (r10 != 0) goto Lf4
            goto L1ac
        Lf4:
            long r3 = r7.mALogWriteAddr
            r5 = -1
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 == 0) goto L107
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r10 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            r3 = 59
            long r4 = r7.mALogWriteAddr
            r10.setLongValue(r3, r4)
        L107:
            r7.mIsPlayWithMdl = r0
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayCacheSyncRunner r10 = new com.bykv.vk.component.ttvideo.VideoLiveManager$PlayCacheSyncRunner
            java.lang.String r3 = r7.mSessionId
            r4 = 0
            r10.<init>(r7, r7, r3, r4)
            r7.runOnCurrentThread(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r3 = "setup mdl play cache sync runner of :"
            r10.<init>(r3)
            java.lang.String r3 = r7.mSessionId
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r10)
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r10 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            boolean r3 = r7.mIsMdlProtoRegister
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r8 = r10.getProxyUrl(r8, r3)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r3 = "proxyUrl: "
            r10.<init>(r3)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r10)
            if (r8 == 0) goto L1ac
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto L1ac
            java.lang.String r10 = "Stream-Type"
            java.lang.String r2 = "live"
            r11.put(r10, r2)
            java.lang.String r10 = r7.mSessionId
            if (r10 == 0) goto L15e
            java.lang.String r2 = "X-Tt-Traceid"
            r11.put(r2, r10)
        L15e:
            if (r9 == 0) goto L17e
            java.lang.String r10 = "none"
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L17e
            java.lang.String r10 = "["
            boolean r10 = r9.startsWith(r10)
            if (r10 == 0) goto L179
            int r10 = r9.length()
            int r10 = r10 - r0
            java.lang.String r9 = r9.substring(r0, r10)
        L179:
            java.lang.String r10 = "X-Given-IPs"
            r11.put(r10, r9)
        L17e:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1a6
            r10.<init>()     // Catch: java.lang.Exception -> L1a6
            java.lang.String r11 = "url"
            r10.put(r11, r8)     // Catch: java.lang.Exception -> L1a6
            if (r9 == 0) goto L18f
            java.lang.String r11 = "ip"
            r10.put(r11, r9)     // Catch: java.lang.Exception -> L1a6
        L18f:
            java.lang.String r9 = r7.mSessionId     // Catch: java.lang.Exception -> L1a6
            if (r9 == 0) goto L198
            java.lang.String r11 = "traceId"
            r10.put(r11, r9)     // Catch: java.lang.Exception -> L1a6
        L198:
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r9 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()     // Catch: java.lang.Exception -> L1a6
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L1a6
            r11 = 8017(0x1f51, float:1.1234E-41)
            r9.setStringValue(r11, r10)     // Catch: java.lang.Exception -> L1a6
            return r8
        L1a6:
            java.lang.String r9 = "set play info to mdl failed"
            com.bykv.vk.component.ttvideo.log.MyLog.w(r1, r9)
            return r8
        L1ac:
            return r2
        L1ad:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "proxy not support format: "
            r8.<init>(r9)
            java.lang.String r9 = r7.mStreamFormat
            r8.append(r9)
            java.lang.String r9 = ", proto: "
            r8.append(r9)
            java.lang.String r9 = r7.mTransportProtocol
            r8.append(r9)
            java.lang.String r9 = ", abr: "
            r8.append(r9)
            boolean r9 = r7.mEnableResolutionAutoDegrade
            r8.append(r9)
            java.lang.String r9 = ", sessio id invalid: "
            r8.append(r9)
            java.lang.String r9 = r7.mSessionId
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r8)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r9 = r7.mLogService
            r9.mLiveIOErrorMsg = r8
            return r2
    }

    private void prepareToPlay(java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29) {
            r25 = this;
            r1 = r25
            r2 = r26
            r4 = r28
            r5 = r29
            java.lang.String r6 = "url"
            java.lang.String r7 = "http://"
            java.lang.String r8 = "&"
            java.lang.String r9 = "flv"
            long r10 = java.lang.System.currentTimeMillis()
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService
            r0.mLastPrepareTime = r10
            java.lang.String r0 = r1.mUuid
            if (r0 == 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = r1.mUuid
            r0.append(r12)
            java.lang.String r12 = "."
            r0.append(r12)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            r1.mSessionId = r0
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r12 = "prepareToPlay:"
            r0.<init>(r12)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r12 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r12, r0)
            if (r2 == 0) goto L751
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            if (r0 != 0) goto L4f
            goto L751
        L4f:
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            r14 = 0
            r15 = 1
            if (r5 == 0) goto L6a
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r14] = r5
            r16 = 0
            java.lang.String r14 = " %s"
            java.lang.String r0 = java.lang.String.format(r14, r0)
            java.lang.String r14 = "Host"
            r13.put(r14, r0)
            goto L6c
        L6a:
            r16 = 0
        L6c:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r1.mURLSource
            java.util.Map r0 = r0.getHTTPHeaders()
            if (r0 == 0) goto L8c
            r13.putAll(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r14 = "headers: "
            r0.<init>(r14)
            java.lang.String r14 = r13.toString()
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r12, r0)
        L8c:
            java.lang.String r0 = r1.mTransportProtocol
            java.lang.String r14 = "quic"
            boolean r0 = r0.equals(r14)
            java.lang.String r15 = "quicu"
            r18 = r6
            if (r0 != 0) goto La2
            java.lang.String r0 = r1.mTransportProtocol
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L21c
        La2:
            java.lang.String r0 = "suggest_protocol"
            r13.put(r0, r14)
            boolean r0 = r1.mEnableSaveSCFG
            if (r0 == 0) goto Lcd
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            android.content.Context r6 = r1.mContext
            java.io.File r6 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r6)
            java.lang.String r6 = r6.getAbsolutePath()
            r14.append(r6)
            java.lang.String r6 = "/pullstream.scfg"
            r14.append(r6)
            java.lang.String r6 = r14.toString()
            r14 = 353(0x161, float:4.95E-43)
            r0.setStringOption(r14, r6)
        Lcd:
            boolean r0 = r1.mEnableQuicCertVerify
            if (r0 == 0) goto L137
            java.lang.String r0 = "com.ss.avframework.transport.ContextUtils"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r6 = "initApplicationContext"
            r14 = 1
            java.lang.Class[] r3 = new java.lang.Class[r14]     // Catch: java.lang.Throwable -> L11e
            java.lang.Class<android.content.Context> r17 = android.content.Context.class
            r3[r16] = r17     // Catch: java.lang.Throwable -> L11e
            java.lang.reflect.Method r0 = r0.getMethod(r6, r3)     // Catch: java.lang.Throwable -> L11e
            r0.setAccessible(r14)     // Catch: java.lang.Throwable -> L11e
            android.content.Context r3 = r1.mContext     // Catch: java.lang.Throwable -> L11e
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L11e
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Throwable -> L11e
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L11e
            r6[r16] = r3     // Catch: java.lang.Throwable -> L11e
            r3 = 0
            r0.invoke(r3, r6)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r0 = "com.ss.avframework.transport.JNIUtils"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r3 = "setClassLoader"
            r14 = 1
            java.lang.Class[] r6 = new java.lang.Class[r14]     // Catch: java.lang.Throwable -> L11e
            java.lang.Class<java.lang.ClassLoader> r17 = java.lang.ClassLoader.class
            r6[r16] = r17     // Catch: java.lang.Throwable -> L11e
            java.lang.reflect.Method r0 = r0.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L11e
            r0.setAccessible(r14)     // Catch: java.lang.Throwable -> L11e
            android.content.Context r3 = r1.mContext     // Catch: java.lang.Throwable -> L11e
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L11e
            r6[r16] = r3     // Catch: java.lang.Throwable -> L11e
            r3 = 0
            r0.invoke(r3, r6)     // Catch: java.lang.Throwable -> L11e
            goto L137
        L11e:
            r0 = move-exception
            r3 = 0
            r1.mEnableQuicCertVerify = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "disable quic cert verify, "
            r3.<init>(r6)
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.bytedance.sdk.component.utils.vl.r(r12, r0)
        L137:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 925(0x39d, float:1.296E-42)
            int r6 = r1.mQuicVersion
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 354(0x162, float:4.96E-43)
            boolean r6 = r1.mEnableQuicCertVerify
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 357(0x165, float:5.0E-43)
            int r6 = r1.mEnableQuicMTUDiscovery
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 356(0x164, float:4.99E-43)
            int r6 = r1.mQuicInitMTU
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 388(0x184, float:5.44E-43)
            int r6 = r1.mQuicInitRtt
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 389(0x185, float:5.45E-43)
            int r6 = r1.mQuicMaxCryptoRetransmissions
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 390(0x186, float:5.47E-43)
            int r6 = r1.mQuicMaxCryptoRetransmissionTimeMs
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 391(0x187, float:5.48E-43)
            int r6 = r1.mQuicMaxRetransmissions
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 392(0x188, float:5.5E-43)
            int r6 = r1.mQuicMaxRetransmissionTimeMs
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 393(0x189, float:5.51E-43)
            int r6 = r1.mQuicMaxAckDelay
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 394(0x18a, float:5.52E-43)
            int r6 = r1.mQuicMinReceivedBeforeAckDecimation
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 395(0x18b, float:5.54E-43)
            int r6 = r1.mQuicPadHello
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 920(0x398, float:1.289E-42)
            int r6 = r1.mQuicFixWillingAndAbleToWrite
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 921(0x399, float:1.29E-42)
            int r6 = r1.mQuicFixProcessTimer
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 922(0x39a, float:1.292E-42)
            int r6 = r1.mQuicReadBlockTimeout
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 923(0x39b, float:1.293E-42)
            int r6 = r1.mQuicReadBlockMode
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 924(0x39c, float:1.295E-42)
            int r6 = r1.mQuicFixStreamFinAndRst
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 926(0x39e, float:1.298E-42)
            int r6 = r1.mQuicTimerVersion
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 927(0x39f, float:1.299E-42)
            int r6 = r1.mQuicConfigOptimize
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 652(0x28c, float:9.14E-43)
            int r6 = r1.mEnableSkipFlvNullTag
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            java.lang.String r3 = r1.mTransportProtocol
            boolean r3 = r3.equals(r15)
            r6 = 396(0x18c, float:5.55E-43)
            r0.setIntOption(r6, r3)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 928(0x3a0, float:1.3E-42)
            int r6 = r1.mSessionReceiveWindow
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 929(0x3a1, float:1.302E-42)
            int r6 = r1.mStreamReceiveWindow
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService
            int r3 = r1.mQuicInitMTU
            r0.mQuicMtu = r3
            boolean r3 = r1.mEnableSaveSCFG
            r0.mQuicScfgConfig = r3
            int r3 = r1.mQuicPadHello
            r0.mQuicPadHello = r3
            int r3 = r1.mQuicTimerVersion
            r0.mQuicTimerVersion = r3
        L21c:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 372(0x174, float:5.21E-43)
            int r6 = r1.mEnableDecodeMultiSei
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 648(0x288, float:9.08E-43)
            int r6 = r1.mEnableDecodeSeiOnce
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 374(0x176, float:5.24E-43)
            int r6 = r1.mForceDecodeMsGaps
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 373(0x175, float:5.23E-43)
            int r6 = r1.mForceDecodeSwitch
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 375(0x177, float:5.25E-43)
            int r6 = r1.mForceRenderMsGaps
            r0.setIntOption(r3, r6)
            r1._configFlvLowLatencyWithSDKParam()
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 309(0x135, float:4.33E-43)
            r14 = r7
            long r6 = r1.mStartPlayBufferThres
            r0.setLongOption(r3, r6)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService
            long r6 = r1.mStartPlayBufferThres
            r0.mStartPlayBufferThres = r6
            r1.configPlayerInstanceOption()
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r0 = r1.mPrepareState
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.PREPARED
            if (r0 != r3) goto L29f
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.INITIALIZED
            r1.mPrepareState = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r0.reset()
            int r0 = r1.mCacheFileEnable
            r3 = 1
            if (r0 != r3) goto L29f
            java.lang.String r0 = r1.mCacheFilePath
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L29f
            java.lang.String r0 = r1.mCacheFileKey
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L29f
            boolean r0 = r1.mIsCacheHasComplete
            if (r0 != 0) goto L29f
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 17
            java.lang.String r6 = r1.mCacheFileKey
            r0.setStringOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 14
            r6 = 1
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            java.lang.String r3 = r1.mCacheFilePath
            r0.setCacheFile(r3, r6)
        L29f:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r1.mURLSource
            java.lang.String r3 = r1.mResolution
            java.lang.String r6 = r1.mLevel
            int r0 = r0.getCheckSilenceInterval(r3, r6)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r3 = r1.mLogService
            r3.setCheckSilenceInterval(r0)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r1.mPlayer
            r6 = 339(0x153, float:4.75E-43)
            r3.setIntOption(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "mEnableResolutionAutoDegrade:"
            r0.<init>(r3)
            boolean r3 = r1.mEnableResolutionAutoDegrade
            r0.append(r3)
            java.lang.String r3 = ";mAbrStrategy:"
            r0.append(r3)
            java.lang.String r3 = r1.mAbrStrategy
            r0.append(r3)
            java.lang.String r3 = ";mResolution:"
            r0.append(r3)
            java.lang.String r3 = r1.mResolution
            r0.append(r3)
            java.lang.String r3 = r1.mResolution
            java.lang.String r6 = "auto"
            boolean r3 = r3.equals(r6)
            java.lang.String r7 = ""
            if (r3 == 0) goto L2f8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r19 = r14
            java.lang.String r14 = ";auto default resolution:"
            r3.<init>(r14)
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r14 = r1.mURLSource
            java.lang.String r14 = r14.getDefaultResolution()
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            goto L2fb
        L2f8:
            r19 = r14
            r3 = r7
        L2fb:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r12, r0)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService
            r3 = r13
            r13 = -1
            r0.mFirstAudioPacketDTS = r13
            r20 = r13
            long r13 = r1.mLatestAudioPacketDTS
            r22 = 0
            int r24 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r24 <= 0) goto L318
            r0.mPreviousAudioPacketDTS = r13
        L318:
            java.lang.String r13 = r1.mResolution
            r0.mResolution = r13
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r14 = r1.mURLSource
            boolean r13 = r13.equals(r6)
            if (r13 == 0) goto L32d
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r13 = r1.mURLSource
            java.lang.String r13 = r13.getDefaultResolution()
        L32a:
            r24 = r3
            goto L330
        L32d:
            java.lang.String r13 = r1.mResolution
            goto L32a
        L330:
            java.lang.String r3 = r1.mLevel
            long r13 = r14.getBitrate(r13, r3)
            r0.mResBitrate = r13
            int r0 = r1.mEnablePreventDTSBack
            r14 = 1
            if (r0 != r14) goto L36c
            long r13 = r1.mFrameTerminatedDTS
            int r0 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r0 == 0) goto L36c
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            if (r0 == 0) goto L36c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "prepareToPlay set dts:"
            r0.<init>(r3)
            long r13 = r1.mFrameTerminatedDTS
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r12, r0)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 633(0x279, float:8.87E-43)
            long r13 = r1.mFrameTerminatedDTS
            r0.setLongOption(r3, r13)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            r3 = 635(0x27b, float:8.9E-43)
            long r13 = r1.mFrameDroppingDTSMaxDiff
            r0.setLongOption(r3, r13)
        L36c:
            boolean r0 = r1.mIsLocalURL     // Catch: java.lang.Exception -> L376
            if (r0 != 0) goto L37b
            java.lang.String r0 = r1.addSessionIdToURL(r2, r10)     // Catch: java.lang.Exception -> L376
            r2 = r0
            goto L37b
        L376:
            r0 = move-exception
        L377:
            r4 = r18
            goto L72c
        L37b:
            java.lang.String r0 = r1.mStreamFormat     // Catch: java.lang.Exception -> L376
            boolean r0 = r0.equals(r9)     // Catch: java.lang.Exception -> L376
            java.lang.String r3 = "%d"
            r10 = -1
            if (r0 == 0) goto L3a0
            int r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.mFastOpenDuration     // Catch: java.lang.Exception -> L376
            if (r0 == r10) goto L3a0
            java.lang.String r11 = "abr_pts"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L376
            r14 = 1
            java.lang.Object[] r13 = new java.lang.Object[r14]     // Catch: java.lang.Exception -> L376
            r16 = 0
            r13[r16] = r0     // Catch: java.lang.Exception -> L376
            java.lang.String r0 = java.lang.String.format(r3, r13)     // Catch: java.lang.Exception -> L376
            java.lang.String r0 = r1._addParamToURL(r2, r11, r0)     // Catch: java.lang.Exception -> L376
            r2 = r0
        L3a0:
            java.lang.String r0 = r1.mStreamFormat     // Catch: java.lang.Exception -> L376
            java.lang.String r11 = "cmaf"
            boolean r0 = r0.equals(r11)     // Catch: java.lang.Exception -> L376
            java.lang.String r11 = "1"
            if (r0 == 0) goto L3b3
            java.lang.String r0 = "play_start"
            java.lang.String r0 = r1._addParamToURL(r2, r0, r11)     // Catch: java.lang.Exception -> L376
            r2 = r0
        L3b3:
            java.lang.String r0 = r1.mStreamFormat     // Catch: java.lang.Exception -> L376
            java.lang.String r13 = "tsl"
            boolean r0 = r0.equals(r13)     // Catch: java.lang.Exception -> L376
            if (r0 == 0) goto L3f4
            java.lang.String r0 = r1.mCurrentPlayURL     // Catch: java.lang.Exception -> L376
            java.lang.String r13 = "TimeShiftFormat="
            int r0 = r0.indexOf(r13)     // Catch: java.lang.Exception -> L376
            int r0 = r0 + 16
            java.lang.String r13 = r1.mCurrentPlayURL     // Catch: java.lang.Exception -> L376
            java.lang.String r0 = r13.substring(r0)     // Catch: java.lang.Exception -> L376
            int r13 = r0.indexOf(r8)     // Catch: java.lang.Exception -> L376
            if (r13 <= 0) goto L3dc
            int r8 = r0.indexOf(r8)     // Catch: java.lang.Exception -> L376
            r13 = 0
            java.lang.String r0 = r0.substring(r13, r8)     // Catch: java.lang.Exception -> L376
        L3dc:
            int r8 = r1.mTslTimeShift     // Catch: java.lang.Exception -> L376
            if (r8 <= 0) goto L3f4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L376
            r14 = 1
            java.lang.Object[] r13 = new java.lang.Object[r14]     // Catch: java.lang.Exception -> L376
            r16 = 0
            r13[r16] = r8     // Catch: java.lang.Exception -> L376
            java.lang.String r3 = java.lang.String.format(r3, r13)     // Catch: java.lang.Exception -> L376
            java.lang.String r0 = r1._addParamToURL(r2, r0, r3)     // Catch: java.lang.Exception -> L376
            r2 = r0
        L3f4:
            java.lang.String r0 = r1.mTransportProtocol     // Catch: java.lang.Exception -> L376
            boolean r0 = r0.equals(r15)     // Catch: java.lang.Exception -> L376
            if (r0 == 0) goto L403
            java.lang.String r0 = "unreliable"
            java.lang.String r0 = r1._addParamToURL(r2, r0, r11)     // Catch: java.lang.Exception -> L376
            r2 = r0
        L403:
            java.lang.String r0 = r1.mResolution     // Catch: java.lang.Exception -> L376
            boolean r0 = r0.equals(r6)     // Catch: java.lang.Exception -> L376
            if (r0 == 0) goto L4e1
            boolean r0 = r1.mEnableResolutionAutoDegrade     // Catch: java.lang.Exception -> L376
            if (r0 == 0) goto L4e1
            java.lang.String r0 = r1.mAbrStrategy     // Catch: java.lang.Exception -> L376
            java.lang.String r3 = "abr_bb_4live"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Exception -> L376
            if (r0 == 0) goto L4e1
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r1.mURLSource     // Catch: java.lang.Exception -> L376
            int r0 = r0.getSourceType()     // Catch: java.lang.Exception -> L376
            r3 = 2
            if (r0 != r3) goto L4e1
            java.lang.String r0 = r1.mStreamFormat     // Catch: java.lang.Exception -> L376
            boolean r0 = r0.equals(r9)     // Catch: java.lang.Exception -> L376
            if (r0 == 0) goto L4e1
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r3 = r1.mURLSource     // Catch: java.lang.Exception -> L376
            java.lang.String r3 = r3.getDefaultResolution()     // Catch: java.lang.Exception -> L376
            r0.mAutoUsingResolution = r3     // Catch: java.lang.Exception -> L376
            long r8 = r1.mTargetOriginBitRate     // Catch: java.lang.Exception -> L376
            int r0 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r0 <= 0) goto L44b
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r1.mURLSource     // Catch: java.lang.Exception -> L376
            java.lang.String r3 = r1.mStreamFormat     // Catch: java.lang.Exception -> L376
            java.lang.String r6 = r1.mLevel     // Catch: java.lang.Exception -> L376
            boolean r0 = r0.adjustOriginBitRate(r3, r6, r8)     // Catch: java.lang.Exception -> L376
            if (r0 == 0) goto L44b
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService     // Catch: java.lang.Exception -> L376
            r14 = 1
            r0.mBitRateAbnormalType = r14     // Catch: java.lang.Exception -> L376
        L44b:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r1.mURLSource     // Catch: java.lang.Exception -> L376
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L376
            java.lang.String r6 = "_session_id="
            r3.<init>(r6)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r6 = r1.mLogService     // Catch: java.lang.Exception -> L376
            java.lang.String r6 = r6.mSessionId     // Catch: java.lang.Exception -> L376
            r3.append(r6)     // Catch: java.lang.Exception -> L376
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L376
            r0.setRequestParamsWithDNSIp(r3, r4, r5)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r1.mURLSource     // Catch: java.lang.Exception -> L376
            java.lang.String r3 = r1.mResolution     // Catch: java.lang.Exception -> L376
            java.lang.String r6 = r1.mStreamFormat     // Catch: java.lang.Exception -> L376
            java.lang.String r8 = r1.mLevel     // Catch: java.lang.Exception -> L376
            java.lang.String r0 = r0.getPlayURLForResolution(r3, r6, r8)     // Catch: java.lang.Exception -> L376
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L376
            java.lang.String r6 = "mpd url:"
            r3.<init>(r6)     // Catch: java.lang.Exception -> L376
            r3.append(r0)     // Catch: java.lang.Exception -> L376
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.log.MyLog.i(r12, r3)     // Catch: java.lang.Exception -> L376
            if (r0 != 0) goto L482
            goto L490
        L482:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L376
            java.lang.String r6 = "mem://llash/"
            r3.<init>(r6)     // Catch: java.lang.Exception -> L376
            r3.append(r0)     // Catch: java.lang.Exception -> L376
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L376
        L490:
            if (r0 == 0) goto L49b
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            java.lang.String r3 = "llash"
            r6 = 315(0x13b, float:4.41E-43)
            r0.setStringOption(r6, r3)     // Catch: java.lang.Exception -> L376
        L49b:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            r3 = 324(0x144, float:4.54E-43)
            r14 = 1
            r0.setIntOption(r3, r14)     // Catch: java.lang.Exception -> L376
            boolean r0 = r1.mShowedFirstFrame     // Catch: java.lang.Exception -> L376
            if (r0 == 0) goto L4b2
            int r0 = r1.mEnableLLASHFastOpen     // Catch: java.lang.Exception -> L376
            if (r0 != r14) goto L4b2
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            r6 = 532(0x214, float:7.45E-43)
            r3.setIntOption(r6, r0)     // Catch: java.lang.Exception -> L376
        L4b2:
            int r0 = r1.mEnableLiveAbrCheckEnhance     // Catch: java.lang.Exception -> L376
            r14 = 1
            if (r0 != r14) goto L4cb
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r3 = r1.mLogService     // Catch: java.lang.Exception -> L376
            r3.mEnableLiveAbrCheckEnhance = r14     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            r6 = 533(0x215, float:7.47E-43)
            r3.setIntOption(r6, r0)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            int r3 = r1.mLiveABRCheckInterval     // Catch: java.lang.Exception -> L376
            r6 = 534(0x216, float:7.48E-43)
            r0.setIntOption(r6, r3)     // Catch: java.lang.Exception -> L376
        L4cb:
            int r0 = r1.mABRMethod     // Catch: java.lang.Exception -> L376
            if (r0 < 0) goto L4d6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            r6 = 535(0x217, float:7.5E-43)
            r3.setIntOption(r6, r0)     // Catch: java.lang.Exception -> L376
        L4d6:
            int r0 = r1.mABRBufferThreshold     // Catch: java.lang.Exception -> L376
            if (r0 <= 0) goto L4e1
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            r6 = 543(0x21f, float:7.61E-43)
            r3.setIntOption(r6, r0)     // Catch: java.lang.Exception -> L376
        L4e1:
            r3 = r24
            java.lang.String r5 = r1.prepareProxyURL(r2, r4, r5, r3)     // Catch: java.lang.Exception -> L376
            if (r5 == 0) goto L50c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L508
            java.lang.String r2 = "proxyUrl: "
            r0.<init>(r2)     // Catch: java.lang.Exception -> L508
            r0.append(r5)     // Catch: java.lang.Exception -> L508
            java.lang.String r2 = " headers: "
            r0.append(r2)     // Catch: java.lang.Exception -> L508
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L508
            r0.append(r2)     // Catch: java.lang.Exception -> L508
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L508
            com.bykv.vk.component.ttvideo.log.MyLog.i(r12, r0)     // Catch: java.lang.Exception -> L508
            r2 = r5
            goto L50c
        L508:
            r0 = move-exception
            r2 = r5
            goto L377
        L50c:
            boolean r0 = r1.isRtcPlayAvailable()     // Catch: java.lang.Exception -> L376
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r0 == 0) goto L605
            java.lang.String r0 = "set rtc play config parameters"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r12, r0)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService     // Catch: java.lang.Exception -> L376
            r14 = 1
            r0.mEnableRtcPlay = r14     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            r3 = 801(0x321, float:1.122E-42)
            r0.setIntOption(r3, r14)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            r3 = 802(0x322, float:1.124E-42)
            r0.setIntOption(r3, r14)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            r3 = 803(0x323, float:1.125E-42)
            r6 = 3
            r0.setIntOption(r3, r6)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            r3 = 804(0x324, float:1.127E-42)
            r0.setIntOption(r3, r5)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            r3 = 805(0x325, float:1.128E-42)
            r6 = 3000(0xbb8, float:4.204E-42)
            r0.setIntOption(r3, r6)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            int r3 = r1.mRtcFallbackThreshold     // Catch: java.lang.Exception -> L376
            r6 = 813(0x32d, float:1.139E-42)
            r0.setIntOption(r6, r3)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            int r3 = r1.mRtcEnableDtls     // Catch: java.lang.Exception -> L376
            r6 = 814(0x32e, float:1.14E-42)
            r0.setIntOption(r6, r3)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            int r3 = r1.mRtcMinJitterBuffer     // Catch: java.lang.Exception -> L376
            r6 = 815(0x32f, float:1.142E-42)
            r0.setIntOption(r6, r3)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            int r3 = r1.mRtcMaxJitterBuffer     // Catch: java.lang.Exception -> L376
            r6 = 881(0x371, float:1.235E-42)
            r0.setIntOption(r6, r3)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            int r3 = r1.mRtcEarlyInitRender     // Catch: java.lang.Exception -> L376
            r6 = 816(0x330, float:1.143E-42)
            r0.setIntOption(r6, r3)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            int r3 = r1.mRtcEnableRtcUninitLockFree     // Catch: java.lang.Exception -> L376
            r6 = 882(0x372, float:1.236E-42)
            r0.setIntOption(r6, r3)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService     // Catch: java.lang.Exception -> L376
            java.lang.String r0 = r0.mSessionId     // Catch: java.lang.Exception -> L376
            java.lang.String r3 = "none"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Exception -> L376
            if (r0 != 0) goto L597
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r3 = r1.mLogService     // Catch: java.lang.Exception -> L376
            java.lang.String r3 = r3.mSessionId     // Catch: java.lang.Exception -> L376
            r6 = 811(0x32b, float:1.136E-42)
            r0.setStringOption(r6, r3)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService     // Catch: java.lang.Exception -> L376
            java.lang.String r3 = r0.mSessionId     // Catch: java.lang.Exception -> L376
            r0.mRtcSessionId = r3     // Catch: java.lang.Exception -> L376
        L597:
            int r0 = r1.mRtcEnableSDKDns     // Catch: java.lang.Exception -> L376
            r14 = 1
            if (r0 != r14) goto L5b5
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L376
            r0.<init>()     // Catch: java.lang.Exception -> L376
            java.lang.String r3 = "s_expect_ip"
            r0.put(r3, r4)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r3 = r1.mLogService     // Catch: java.lang.Exception -> L376
            r3.mDnsIp = r4     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L376
            r4 = 812(0x32c, float:1.138E-42)
            r3.setStringOption(r4, r0)     // Catch: java.lang.Exception -> L376
        L5b5:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService     // Catch: java.lang.Exception -> L376
            r0.mCodecName = r7     // Catch: java.lang.Exception -> L376
            r0.mCodecType = r7     // Catch: java.lang.Exception -> L376
            r13 = 0
            r0.mHardDecodeEnable = r13     // Catch: java.lang.Exception -> L376
            int r0 = r1.mRtcSupportMiniSdp     // Catch: java.lang.Exception -> L376
            r14 = 1
            if (r0 != r14) goto L5ea
            if (r27 == 0) goto L5e8
            r3 = r27
            r14 = r19
            boolean r0 = r3.startsWith(r14)     // Catch: java.lang.Exception -> L376
            if (r0 == 0) goto L5e8
            java.lang.String r0 = "webrtc://"
            java.lang.String r0 = r3.replace(r14, r0)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            android.content.Context r4 = r1.mContext     // Catch: java.lang.Exception -> L376
            android.net.Uri r6 = android.net.Uri.parse(r0)     // Catch: java.lang.Exception -> L376
            r7 = 0
            r3.setDataSource(r4, r6, r7)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r3 = r1.mLogService     // Catch: java.lang.Exception -> L376
            r3.mRequestUrl = r0     // Catch: java.lang.Exception -> L376
            r14 = 1
            r3.mEnableMiniSdp = r14     // Catch: java.lang.Exception -> L376
        L5e8:
            r7 = 0
            goto L5ff
        L5ea:
            r3 = r27
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            android.content.Context r4 = r1.mContext     // Catch: java.lang.Exception -> L376
            android.net.Uri r6 = android.net.Uri.parse(r3)     // Catch: java.lang.Exception -> L376
            r7 = 0
            r0.setDataSource(r4, r6, r7)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService     // Catch: java.lang.Exception -> L376
            r0.mRequestUrl = r3     // Catch: java.lang.Exception -> L376
            r13 = 0
            r0.mEnableMiniSdp = r13     // Catch: java.lang.Exception -> L376
        L5ff:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService     // Catch: java.lang.Exception -> L376
            r0.mRequestHeaders = r7     // Catch: java.lang.Exception -> L376
            r13 = 0
            goto L61e
        L605:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            r4 = 800(0x320, float:1.121E-42)
            r13 = 0
            r0.setIntOption(r4, r13)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            android.content.Context r4 = r1.mContext     // Catch: java.lang.Exception -> L376
            android.net.Uri r6 = android.net.Uri.parse(r2)     // Catch: java.lang.Exception -> L376
            r0.setDataSource(r4, r6, r3)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService     // Catch: java.lang.Exception -> L376
            r0.mRequestUrl = r2     // Catch: java.lang.Exception -> L376
            r0.mRequestHeaders = r3     // Catch: java.lang.Exception -> L376
        L61e:
            int r0 = r1.mEnableRtcPlay     // Catch: java.lang.Exception -> L376
            r14 = 1
            if (r0 != r14) goto L68f
            int r0 = r1.mRtcPlayFallBack     // Catch: java.lang.Exception -> L376
            if (r0 != r14) goto L68f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L376
            java.lang.String r3 = "rtc fallback set hardware decode: "
            r0.<init>(r3)     // Catch: java.lang.Exception -> L376
            int r3 = r1.mHardwareDecodeEnable     // Catch: java.lang.Exception -> L376
            r0.append(r3)     // Catch: java.lang.Exception -> L376
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.log.MyLog.i(r12, r0)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            int r3 = r1.mHardwareDecodeEnable     // Catch: java.lang.Exception -> L376
            r4 = 59
            r0.setIntOption(r4, r3)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService     // Catch: java.lang.Exception -> L376
            int r3 = r1.mHardwareDecodeEnable     // Catch: java.lang.Exception -> L376
            r14 = 1
            if (r3 != r14) goto L64b
            r13 = 1
        L64b:
            r0.enableHardDecode(r13)     // Catch: java.lang.Exception -> L376
            int r0 = r1.mHardwareDecodeEnable     // Catch: java.lang.Exception -> L376
            if (r0 != r14) goto L68f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L376
            java.lang.String r3 = "rtc fallback enable hardware decode, mDefaultCodecId: "
            r0.<init>(r3)     // Catch: java.lang.Exception -> L376
            int r3 = r1.mDefaultCodecId     // Catch: java.lang.Exception -> L376
            r0.append(r3)     // Catch: java.lang.Exception -> L376
            java.lang.String r3 = ", mEnableMediaCodecASYNCInit: "
            r0.append(r3)     // Catch: java.lang.Exception -> L376
            int r3 = r1.mEnableMediaCodecASYNCInit     // Catch: java.lang.Exception -> L376
            r0.append(r3)     // Catch: java.lang.Exception -> L376
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.log.MyLog.i(r12, r0)     // Catch: java.lang.Exception -> L376
            int r0 = r1.mDefaultCodecId     // Catch: java.lang.Exception -> L376
            if (r0 == r10) goto L68f
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            int r3 = r1.mEnableMediaCodecASYNCInit     // Catch: java.lang.Exception -> L376
            r4 = 181(0xb5, float:2.54E-43)
            r0.setIntOption(r4, r3)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            int r3 = r1.mDefaultCodecId     // Catch: java.lang.Exception -> L376
            r4 = 182(0xb6, float:2.55E-43)
            r0.setIntOption(r4, r3)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService     // Catch: java.lang.Exception -> L376
            int r3 = r1.mEnableMediaCodecASYNCInit     // Catch: java.lang.Exception -> L376
            r0.mMediaCodecAsyncInit = r3     // Catch: java.lang.Exception -> L376
            int r3 = r1.mDefaultCodecId     // Catch: java.lang.Exception -> L376
            r0.mDefaultCodecID = r3     // Catch: java.lang.Exception -> L376
        L68f:
            int r0 = r1.mNetworkTimeout     // Catch: java.lang.Exception -> L376
            java.lang.String r3 = " microsecond"
            if (r0 == r10) goto L6bd
            if (r0 < r5) goto L6bd
            com.bykv.vk.component.ttvideo.player.MediaPlayer r4 = r1.mPlayer     // Catch: java.lang.Exception -> L376
            r6 = 9
            int r0 = r0 * 1000
            r4.setIntOption(r6, r0)     // Catch: java.lang.Exception -> L376
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L376
            java.lang.String r4 = "networktimeout: "
            r0.<init>(r4)     // Catch: java.lang.Exception -> L376
            int r4 = r1.mNetworkTimeout     // Catch: java.lang.Exception -> L376
            r0.append(r4)     // Catch: java.lang.Exception -> L376
            r0.append(r3)     // Catch: java.lang.Exception -> L376
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.log.MyLog.i(r12, r0)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService     // Catch: java.lang.Exception -> L376
            int r3 = r1.mNetworkTimeout     // Catch: java.lang.Exception -> L376
            r0.mNetworkTimeoutMs = r3     // Catch: java.lang.Exception -> L376
            goto L6db
        L6bd:
            if (r0 == r10) goto L6db
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L376
            java.lang.String r4 = "networktimeout so small: "
            r0.<init>(r4)     // Catch: java.lang.Exception -> L376
            int r4 = r1.mNetworkTimeout     // Catch: java.lang.Exception -> L376
            r0.append(r4)     // Catch: java.lang.Exception -> L376
            r0.append(r3)     // Catch: java.lang.Exception -> L376
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.log.MyLog.e(r12, r0)     // Catch: java.lang.Exception -> L376
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService     // Catch: java.lang.Exception -> L376
            r3 = 5000(0x1388, float:7.006E-42)
            r0.mNetworkTimeoutMs = r3     // Catch: java.lang.Exception -> L376
        L6db:
            android.view.SurfaceHolder r0 = r1.mSurfaceHolder
            if (r0 == 0) goto L6e3
            r1.setSurfaceHolder(r0)
            goto L6ea
        L6e3:
            android.view.Surface r0 = r1.mSurface
            if (r0 == 0) goto L6ea
            r1.setSurface(r0)
        L6ea:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            if (r0 == 0) goto L6f2
            r14 = 1
            r0.setScreenOnWhilePlaying(r14)
        L6f2:
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r0 = r1.mPrepareState
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.INITIALIZED
            if (r0 == r3) goto L6f9
            goto L751
        L6f9:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer     // Catch: java.lang.Exception -> L703
            r0.prepareAsync()     // Catch: java.lang.Exception -> L703
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.PREPARING     // Catch: java.lang.Exception -> L703
            r1.mPrepareState = r0     // Catch: java.lang.Exception -> L703
            goto L751
        L703:
            r0 = move-exception
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4 = r18
            r3.put(r4, r2)
            com.bykv.vk.component.ttvideo.log.LiveError r2 = new com.bykv.vk.component.ttvideo.log.LiveError
            r4 = -100001(0xfffffffffffe795f, float:NaN)
            java.lang.String r0 = r0.getMessage()
            r2.<init>(r4, r0, r3)
            boolean r0 = r1.mIsLocalURL
            if (r0 == 0) goto L724
            com.bykv.vk.component.ttvideo.ILiveListener r0 = r1.mListener
            r0.onError(r2)
            return
        L724:
            com.bykv.vk.component.ttvideo.retry.RetryProcessor r0 = r1.mRetryProcessor
            boolean r3 = r1.mShowedFirstFrame
            r0.onError(r2, r3)
            return
        L72c:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r3.put(r4, r2)
            com.bykv.vk.component.ttvideo.log.LiveError r2 = new com.bykv.vk.component.ttvideo.log.LiveError
            r4 = -100002(0xfffffffffffe795e, float:NaN)
            java.lang.String r0 = r0.getMessage()
            r2.<init>(r4, r0, r3)
            boolean r0 = r1.mIsLocalURL
            if (r0 == 0) goto L74a
            com.bykv.vk.component.ttvideo.ILiveListener r0 = r1.mListener
            r0.onError(r2)
            return
        L74a:
            com.bykv.vk.component.ttvideo.retry.RetryProcessor r0 = r1.mRetryProcessor
            boolean r3 = r1.mShowedFirstFrame
            r0.onError(r2, r3)
        L751:
            return
    }

    private void runOnCurrentThread(java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.mMyHandler
            r0.post(r2)
            return
    }

    private void runOnCurrentThreadDelay(java.lang.Runnable r2, long r3) {
            r1 = this;
            android.os.Handler r0 = r1.mMyHandler
            r0.postDelayed(r2, r3)
            return
    }

    private void runOnFrontCurrentThread(java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.mMyHandler
            r0.postAtFrontOfQueue(r2)
            return
    }

    private void saveCurrentResolution() {
            r3 = this;
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r0 = r3.mLivePlayerState
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r1 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.IDLE
            if (r0 != r1) goto L7
            goto Lb
        L7:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r3.mLogService
            if (r0 != 0) goto Lc
        Lb:
            return
        Lc:
            java.lang.String r1 = r3.mResolution
            java.lang.String r2 = "auto"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1b
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r3.mLogService
            java.lang.String r1 = r1.mAutoUsingResolution
            goto L1d
        L1b:
            java.lang.String r1 = r3.mResolution
        L1d:
            r0.mLastResolution = r1
            return
    }

    public static void setAppInfo(android.content.Context r3, java.util.Map r4) {
            if (r4 == 0) goto L6a
            int r0 = r4.size()
            if (r0 != 0) goto L9
            goto L6a
        L9:
            com.bykv.vk.component.ttvideo.AppInfo.mContext = r3
            java.lang.String r3 = "app_name"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            com.bykv.vk.component.ttvideo.AppInfo.mAppName = r3
            java.lang.String r3 = "app_id"
            java.lang.Object r3 = r4.get(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "set appid:"
            r0.<init>(r1)
            r2 = r3
            java.lang.Integer r2 = (java.lang.Integer) r2
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r2, r0)
            if (r3 == 0) goto L4c
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            com.bykv.vk.component.ttvideo.AppInfo.mAppID = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            int r0 = com.bykv.vk.component.ttvideo.AppInfo.mAppID
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r2, r3)
        L4c:
            java.lang.String r3 = "app_channel"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            com.bykv.vk.component.ttvideo.AppInfo.mAppChannel = r3
            java.lang.String r3 = "app_version"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            com.bykv.vk.component.ttvideo.AppInfo.mAppVersion = r3
            java.lang.String r3 = "device_id"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            com.bykv.vk.component.ttvideo.AppInfo.mDeviceId = r3
        L6a:
            return
    }

    public static void setDataLoaderListener(com.bykv.vk.component.ttvideo.medialoader.MediaLoaderListener r1) {
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r0 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            r0.setListener(r1)
            return
    }

    public static void setIntValue(int r1, int r2) {
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r0 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            r0.setIntValue(r1, r2)
            return
    }

    public static void setSettingsParam(android.content.Context r1, java.util.Map<java.lang.String, java.lang.Object> r2) {
            if (r2 == 0) goto L2f
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L9
            goto L2f
        L9:
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r1 = "1.4.6.31-lite"
            int r1 = com.bykv.vk.component.ttvideo.utils.LiveUtils.versionStringToInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = "live_pull_sdk_version"
            r2.put(r0, r1)
            r1 = 14
            java.lang.String r0 = ""
            java.lang.String r1 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r1, r0)
            int r1 = com.bykv.vk.component.ttvideo.utils.LiveUtils.versionStringToInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = "ttm_version"
            r2.put(r0, r1)
        L2f:
            return
    }

    public static void startDataLoader(android.content.Context r0) throws java.lang.Exception {
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r0 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            r0.start()
            return
    }

    private void startStallCounter() {
            r3 = this;
            java.lang.Object r0 = r3.mStallCounterLock
            monitor-enter(r0)
            boolean r1 = r3.mStallCounterIsRunning     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r1 = move-exception
            goto L38
        Lb:
            android.os.HandlerThread r1 = r3.mStallCounterThread     // Catch: java.lang.Throwable -> L9
            if (r1 != 0) goto L1b
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L9
            java.lang.String r2 = "stallCounter"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L9
            r3.mStallCounterThread = r1     // Catch: java.lang.Throwable -> L9
            r1.start()     // Catch: java.lang.Throwable -> L9
        L1b:
            android.os.Handler r1 = r3.mStallCounterHandler     // Catch: java.lang.Throwable -> L9
            if (r1 != 0) goto L2c
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L9
            android.os.HandlerThread r2 = r3.mStallCounterThread     // Catch: java.lang.Throwable -> L9
            android.os.Looper r2 = r2.getLooper()     // Catch: java.lang.Throwable -> L9
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L9
            r3.mStallCounterHandler = r1     // Catch: java.lang.Throwable -> L9
        L2c:
            android.os.Handler r1 = r3.mStallCounterHandler     // Catch: java.lang.Throwable -> L9
            com.bykv.vk.component.ttvideo.VideoLiveManager$VideoStallCountTask r2 = r3.mVideoStallCountTask     // Catch: java.lang.Throwable -> L9
            r1.post(r2)     // Catch: java.lang.Throwable -> L9
            r1 = 1
            r3.mStallCounterIsRunning = r1     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    private void stopStallCounter() {
            r3 = this;
            java.lang.Object r0 = r3.mStallCounterLock
            monitor-enter(r0)
            android.os.Handler r1 = r3.mStallCounterHandler     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Le
            r2 = 0
            r1.removeCallbacksAndMessages(r2)     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r1 = move-exception
            goto L13
        Le:
            r1 = 0
            r3.mStallCounterIsRunning = r1     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    private boolean switchMainAndBackupUrl(int r8) {
            r7 = this;
            java.lang.String r0 = r7.mLevel
            java.lang.String r1 = "main"
            boolean r0 = r0.equals(r1)
            java.lang.String r2 = "flv"
            java.lang.String r3 = "auto"
            r4 = 0
            java.lang.String r5 = "backup"
            r6 = 1
            if (r0 == 0) goto L60
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r7.mURLSource
            java.lang.String r1 = r7.mResolution
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L23
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r1 = r7.mURLSource
            java.lang.String r1 = r1.getDefaultResolution()
            goto L25
        L23:
            java.lang.String r1 = r7.mResolution
        L25:
            java.lang.String r0 = r0.getPlayURLForResolution(r1, r2, r5)
            if (r0 == 0) goto Lb6
            r7.updateDownloadSizeStat()
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r7.mLogService
            r1.onSessionStop()
            r7.mIsRetrying = r6
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r7.mLogService
            java.lang.String r2 = r7.mCurrentPlayURL
            java.lang.String r3 = "main_to_backup"
            r1.onSwitch(r2, r0, r3, r8)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r8 = r7.mLogService
            r8.onSwitchURL(r0)
            r7.mCurrentPlayURL = r0
            r7.mLevel = r5
            r7._setStreamFormat()
            com.bykv.vk.component.ttvideo.retry.RetryProcessor r8 = r7.mRetryProcessor
            r8.reset()
            r7._resetPlayer()
            long r1 = java.lang.System.currentTimeMillis()
            r7.mSessionStartTime = r1
            r7.mRedoDns = r6
            r7.parsePlayDNS(r0)
            r7.mStallCount = r4
            return r6
        L60:
            java.lang.String r0 = r7.mLevel
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto Lb6
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r7.mURLSource
            java.lang.String r5 = r7.mResolution
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L79
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r3 = r7.mURLSource
            java.lang.String r3 = r3.getDefaultResolution()
            goto L7b
        L79:
            java.lang.String r3 = r7.mResolution
        L7b:
            java.lang.String r0 = r0.getPlayURLForResolution(r3, r2, r1)
            if (r0 == 0) goto Lb6
            r7.updateDownloadSizeStat()
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r7.mLogService
            r2.onSessionStop()
            r7.mIsRetrying = r6
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r7.mLogService
            java.lang.String r3 = r7.mCurrentPlayURL
            java.lang.String r5 = "backup_to_main"
            r2.onSwitch(r3, r0, r5, r8)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r8 = r7.mLogService
            r8.onSwitchURL(r0)
            r7.mCurrentPlayURL = r0
            r7.mLevel = r1
            r7._setStreamFormat()
            com.bykv.vk.component.ttvideo.retry.RetryProcessor r8 = r7.mRetryProcessor
            r8.reset()
            r7._resetPlayer()
            long r1 = java.lang.System.currentTimeMillis()
            r7.mSessionStartTime = r1
            r7.mRedoDns = r6
            r7.parsePlayDNS(r0)
            r7.mStallCount = r4
            return r6
        Lb6:
            return r4
    }

    private void updateDownloadSizeStat() {
            r6 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r6.mPlayer
            r1 = 45
            r2 = 0
            long r0 = r0.getLongOption(r1, r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r6.mLogService
            long r3 = r2.mLastTotalDownloadSize
            long r3 = r3 + r0
            r2.mLastTotalDownloadSize = r3
            long r3 = r2.mLastDownloadSizeDelta
            boolean r5 = r2.mHaveResetPlayer
            if (r5 != 0) goto L24
            long r3 = r2.getPlayingDownloadSize()
            long r0 = r0 - r3
            r2.mLastDownloadSizeDelta = r0
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r6.mLogService
            r1 = 1
            r0.mHaveResetPlayer = r1
            return
        L24:
            long r0 = r0 + r3
            r2.mLastDownloadSizeDelta = r0
            return
    }

    private void updateSessionFirstFrameInfo() {
            r7 = this;
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r7.mLogService
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r0.mSessionLogBundle
            if (r0 == 0) goto L38
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r7.mPlayer
            if (r1 != 0) goto Lb
            goto L38
        Lb:
            r2 = 63
            r3 = 0
            long r1 = r1.getLongOption(r2, r3)
            r5 = 8
            long r1 = r1 * r5
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r5
            r0.downloadSpeedOnFirstFrame = r1
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r7.mLogService
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r0.mSessionLogBundle
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r7.mPlayer
            r2 = 72
            long r1 = r1.getLongOption(r2, r3)
            r0.videoBufferTimeOnFirstFrame = r1
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r7.mLogService
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r0.mSessionLogBundle
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r7.mPlayer
            r2 = 73
            long r1 = r1.getLongOption(r2, r3)
            r0.audioBufferTimeOnFirstFrame = r1
        L38:
            return
    }

    public void _setAvLines() {
            r6 = this;
            java.lang.String r0 = "AudioOnly"
            java.lang.String r1 = "VideoOnly"
            java.lang.String r2 = "IsEnable"
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r3 = r6.mURLSource
            java.lang.String r4 = r6.mResolution
            java.lang.String r5 = r6.mLevel
            java.lang.String r3 = r3.getAvLinesParams(r4, r5)
            if (r3 != 0) goto L13
            goto L53
        L13:
            r4 = 0
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L24
            r5.<init>(r3)     // Catch: org.json.JSONException -> L24
            boolean r3 = r5.has(r2)     // Catch: org.json.JSONException -> L24
            if (r3 == 0) goto L28
            java.lang.String r2 = r5.optString(r2)     // Catch: org.json.JSONException -> L24
            goto L29
        L24:
            r0 = move-exception
            r1 = r4
            r2 = r1
            goto L44
        L28:
            r2 = r4
        L29:
            boolean r3 = r5.has(r1)     // Catch: org.json.JSONException -> L34
            if (r3 == 0) goto L37
            java.lang.String r1 = r5.optString(r1)     // Catch: org.json.JSONException -> L34
            goto L38
        L34:
            r0 = move-exception
            r1 = r4
            goto L44
        L37:
            r1 = r4
        L38:
            boolean r3 = r5.has(r0)     // Catch: org.json.JSONException -> L43
            if (r3 == 0) goto L47
            java.lang.String r4 = r5.optString(r0)     // Catch: org.json.JSONException -> L43
            goto L47
        L43:
            r0 = move-exception
        L44:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L47:
            if (r2 == 0) goto L4b
            r6.mEnableAvLines = r2
        L4b:
            if (r1 == 0) goto L4f
            r6.mVideoOnly = r1
        L4f:
            if (r4 == 0) goto L53
            r6.mAudioOnly = r4
        L53:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void closeDNS() {
            r1 = this;
            r0 = 0
            r1.mEnableDns = r0
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void closeSeiCheck() {
            r2 = this;
            r0 = 0
            r2.mEnableSeiCheck = r0
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r2.mLogService
            r1.mEnableSeiCheck = r0
            return
    }

    public boolean disableSR(int r6, int r7) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r1 = r5.mSettingsBundle
            if (r1 == 0) goto L16
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r2 = "live_sdk_sr_resolution_block_list"
            java.lang.Object r0 = r1.getSettingsValueForKey(r2, r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
        L16:
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 != 0) goto L4a
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "x"
            java.lang.String[] r1 = r1.split(r3)
            int r3 = r1.length
            r4 = 2
            if (r3 >= r4) goto L38
            return r2
        L38:
            r3 = r1[r2]
            int r3 = java.lang.Integer.parseInt(r3)
            r4 = 1
            r1 = r1[r4]
            int r1 = java.lang.Integer.parseInt(r1)
            if (r6 != r3) goto L21
            if (r7 != r1) goto L21
            return r4
        L4a:
            return r2
    }

    void doResolutionChange(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void enableSeiCheck() {
            r2 = this;
            r0 = 1
            r2.mEnableSeiCheck = r0
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r2.mLogService
            r1.mEnableSeiCheck = r0
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void enableUploadSessionSeries() {
            r2 = this;
            r0 = 1
            r2.mEnableUploadSessionSeries = r0
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r2.mLogService
            r1.mEnableUploadSessionSeries = r0
            return
    }

    public void frameDTSNotify(int r4, long r5, long r7) {
            r3 = this;
            int r7 = r3.mEnableCheckFrame
            r8 = 1
            if (r7 != r8) goto L16
            if (r4 != 0) goto L16
            java.lang.String r7 = r3.mResolution
            java.lang.String r0 = "origin"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L16
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r7 = r3.mLogService
            r7.feedVideoDTS(r5)
        L16:
            if (r4 != r8) goto L34
            int r4 = r3.mEnableDTSCheck
            if (r4 != r8) goto L34
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r4 = r3.mLogService
            long r7 = r4.mFirstAudioPacketDTS
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L29
            r4.mFirstAudioPacketDTS = r5
            goto L32
        L29:
            long r7 = r3.mLatestAudioPacketDTS
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L32
            r4.onAudioDTSRollback(r7, r5)
        L32:
            r3.mLatestAudioPacketDTS = r5
        L34:
            return
    }

    public int getEnableSR() {
            r1 = this;
            int r0 = r1.mEnableTextureSR
            return r0
    }

    public int getEnableTexturerender() {
            r1 = this;
            int r0 = r1.mEnableTextureRender
            return r0
    }

    public long getIntOption(int r9, long r10) {
            r8 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            r2 = 8
            r4 = 0
            r6 = 63
            if (r9 == 0) goto L34
            r7 = 68
            if (r9 == r7) goto L28
            r0 = 78
            if (r9 == r0) goto L1b
            r0 = 79
            if (r9 == r0) goto L17
            goto L40
        L17:
            int r9 = r8.mTslMinTimeShit
            long r9 = (long) r9
            return r9
        L1b:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r9 = r8.mPlayer
            if (r9 == 0) goto L40
            r10 = 379(0x17b, float:5.31E-43)
            r11 = 0
            int r9 = r9.getIntOption(r10, r11)
            long r9 = (long) r9
            return r9
        L28:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r9 = r8.mPlayer
            if (r9 == 0) goto L40
            long r9 = r9.getLongOption(r6, r4)
            long r9 = r9 * r2
            long r9 = r9 / r0
            return r9
        L34:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r9 = r8.mPlayer
            if (r9 == 0) goto L40
            long r9 = r9.getLongOption(r6, r4)
            long r9 = r9 * r2
            long r9 = r9 / r0
            return r9
        L40:
            return r10
    }

    public void getLastRenderTime() {
            r4 = this;
            boolean r0 = r4.mIsRetrying
            if (r0 != 0) goto L1f
            boolean r0 = r4.mIsStalling
            if (r0 == 0) goto L9
            goto L1f
        L9:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r4.mPlayer
            r1 = 320(0x140, float:4.48E-43)
            r2 = -1
            long r0 = r0.getLongOption(r1, r2)
            r4.mVideoLastRenderTime = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r4.mPlayer
            r1 = 319(0x13f, float:4.47E-43)
            long r0 = r0.getLongOption(r1, r2)
            r4.mAudioLastRenderTime = r0
        L1f:
            return
    }

    public void getLogInfo(com.bykv.vk.component.ttvideo.log.LogBundle r22, int r23) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            if (r1 == 0) goto L3ff
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            if (r3 != 0) goto Le
            goto L3ff
        Le:
            r4 = 355(0x163, float:4.97E-43)
            r5 = -1
            int r3 = r3.getIntOption(r4, r5)
            r1.quicOpenResult = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 351(0x15f, float:4.92E-43)
            int r3 = r3.getIntOption(r4, r5)
            r1.quicConfigCached = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 349(0x15d, float:4.89E-43)
            r6 = 0
            int r3 = r3.getIntOption(r4, r6)
            r1.isTooLargeAVDiff = r3
            r4 = 45
            r11 = 63
            r12 = 2
            r13 = 72
            r14 = 73
            r15 = 1000(0x3e8, double:4.94E-321)
            r7 = 0
            r17 = 8
            r9 = -1
            if (r2 == 0) goto L41
            if (r2 != r12) goto L45
        L41:
            r19 = r15
            goto L16b
        L45:
            r19 = r15
            r15 = 0
            r3 = 150(0x96, float:2.1E-43)
            r6 = 1
            if (r2 != r6) goto Lb6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            long r9 = r2.getLongOption(r4, r7)
            r1.downloadSize = r9
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r4 = 46
            long r9 = r2.getLongOption(r4, r7)
            r1.playedSize = r9
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            float r2 = r2.getFloatOption(r3, r15)
            r1.fps = r2
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            long r2 = r2.getLongOption(r11, r7)
            long r2 = r2 * r17
            long r2 = r2 / r19
            r1.downloadSpeed = r2
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            long r2 = r2.getLongOption(r14, r7)
            r1.audioBufferTime = r2
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            long r2 = r2.getLongOption(r13, r7)
            r1.videoBufferTime = r2
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            int r2 = r2.getCurrentPosition()
            long r2 = (long) r2
            r1.currentPosition = r2
            long r2 = java.lang.System.currentTimeMillis()
            r1.playTime = r2
            com.bykv.vk.component.ttvideo.network.DnsHelper r2 = r0.mDnsParser
            java.lang.String r2 = r2.getDNSServerIP()
            r1.dnsIP = r2
            java.lang.String r2 = r0.mResolution
            r1.resolution = r2
            boolean r2 = r0.isRtcPlayAvailable()
            if (r2 == 0) goto Lb1
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 810(0x32a, float:1.135E-42)
            java.lang.String r2 = r2.getStringOption(r3)
            r1.rtcStatInfo = r2
            r0.addRtcCodecInfo(r2)
        Lb1:
            r3 = 352(0x160, float:4.93E-43)
            r15 = -1
            goto L3f0
        Lb6:
            r4 = 3
            if (r2 != r4) goto Lda
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            float r2 = r2.getFloatOption(r3, r15)
            r1.fps = r2
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            long r2 = r2.getLongOption(r11, r7)
            long r2 = r2 * r17
            long r2 = r2 / r19
            r1.downloadSpeed = r2
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            long r2 = r2.getLongOption(r14, r7)
            r1.audioBufferTime = r2
            java.lang.String r2 = r0.mResolution
            r1.resolution = r2
            goto Lb1
        Lda:
            r3 = 4
            if (r2 != r3) goto Lee
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            long r2 = r2.getLongOption(r14, r7)
            r1.audioBufferTime = r2
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            long r2 = r2.getLongOption(r13, r7)
            r1.videoBufferTime = r2
            goto Lb1
        Lee:
            r3 = 5
            if (r2 != r3) goto L102
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            long r2 = r2.getLongOption(r14, r9)
            r1.audioBufferTimeOnStallStart = r2
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            long r2 = r2.getLongOption(r13, r9)
            r1.videoBufferTimeOnStallStart = r2
            goto Lb1
        L102:
            r3 = 6
            if (r2 != r3) goto L116
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            long r2 = r2.getLongOption(r14, r9)
            r1.audioBufferTimeOnStallEnd = r2
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            long r2 = r2.getLongOption(r13, r9)
            r1.videoBufferTimeOnStallEnd = r2
            goto Lb1
        L116:
            r3 = 7
            if (r2 != r3) goto L13b
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 61
            int r2 = r2.getIntOption(r3, r5)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 62
            int r3 = r3.getIntOption(r4, r5)
            if (r2 != r6) goto L134
            if (r3 != r6) goto L130
            r1.mStreamType = r12
            goto Lb1
        L130:
            r1.mStreamType = r6
            goto Lb1
        L134:
            if (r3 != r6) goto Lb1
            r2 = 0
            r1.mStreamType = r2
            goto Lb1
        L13b:
            r3 = 8
            if (r2 != r3) goto L151
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 147(0x93, float:2.06E-43)
            java.lang.String r2 = r2.getStringOption(r3)
            if (r2 == 0) goto Lb1
            org.json.JSONArray r2 = r0.formatABRStreamInfoToJSONArray(r2)
            r1.mABRStreamInfo = r2
            goto Lb1
        L151:
            r3 = 9
            if (r2 != r3) goto Lb1
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 710(0x2c6, float:9.95E-43)
            java.lang.String r2 = r2.getStringOption(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto Lb1
            org.json.JSONArray r2 = r0.formatAVPHStreamInfoToJSONArray(r2)
            r1.avphStreamInfo = r2
            goto Lb1
        L16b:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r6 = 68
            long r5 = r3.getLongOption(r6, r9)
            r1.playerDNSTimestamp = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r5 = 318(0x13e, float:4.46E-43)
            long r5 = r3.getLongOption(r5, r9)
            r1.tfoFallBackTime = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r5 = 345(0x159, float:4.83E-43)
            long r5 = r3.getLongOption(r5, r9)
            r1.dropAudioPts = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r5 = 346(0x15a, float:4.85E-43)
            long r5 = r3.getLongOption(r5, r9)
            r1.dropAudioCostTime = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            long r3 = r3.getLongOption(r4, r7)
            r1.downloadSize = r3
            java.lang.String r3 = r0.mStreamFormat
            if (r3 == 0) goto L26d
            java.lang.String r4 = "cmaf"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b1
            java.lang.String r3 = r0.mStreamFormat
            java.lang.String r5 = "avph"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L26d
        L1b1:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r5 = 264(0x108, float:3.7E-43)
            long r5 = r3.getLongOption(r5, r9)
            r1.videoDNSTimestamp = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r5 = 267(0x10b, float:3.74E-43)
            long r5 = r3.getLongOption(r5, r9)
            r1.audioDNSTimestamp = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r5 = 265(0x109, float:3.71E-43)
            long r5 = r3.getLongOption(r5, r9)
            r1.videoTcpConnectTimestamp = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r5 = 268(0x10c, float:3.76E-43)
            long r5 = r3.getLongOption(r5, r9)
            r1.audioTcpConnectTimestamp = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r5 = 269(0x10d, float:3.77E-43)
            long r5 = r3.getLongOption(r5, r9)
            r1.audioTcpFirstPacketTimestamp = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r5 = 266(0x10a, float:3.73E-43)
            long r5 = r3.getLongOption(r5, r9)
            r1.videoTcpFirstPacketTimestamp = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r5 = 272(0x110, float:3.81E-43)
            long r5 = r3.getLongOption(r5, r9)
            r1.videoHttpReqFinishTimestamp = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r5 = 273(0x111, float:3.83E-43)
            long r5 = r3.getLongOption(r5, r9)
            r1.audioHttpReqFinishTimestamp = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r5 = 274(0x112, float:3.84E-43)
            long r5 = r3.getLongOption(r5, r9)
            r1.videoHttpResFinishTimestamp = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r5 = 275(0x113, float:3.85E-43)
            long r5 = r3.getLongOption(r5, r9)
            r1.audioHttpResFinishTimestamp = r5
            java.lang.String r3 = r0.mStreamFormat
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L26d
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 457(0x1c9, float:6.4E-43)
            long r3 = r3.getLongOption(r4, r9)
            r1.cmafMpdDNSTimestamp = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 450(0x1c2, float:6.3E-43)
            long r3 = r3.getLongOption(r4, r9)
            r1.cmafMpdTcpConntectTimestamp = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 451(0x1c3, float:6.32E-43)
            long r3 = r3.getLongOption(r4, r9)
            r1.cmafMdpTcpFirstPacketTimestamp = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 452(0x1c4, float:6.33E-43)
            long r3 = r3.getLongOption(r4, r9)
            r1.cmafMpdConntectTimestamp = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 456(0x1c8, float:6.39E-43)
            long r3 = r3.getLongOption(r4, r9)
            r1.cmafMdpHttpResFinishTimestamp = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 453(0x1c5, float:6.35E-43)
            long r3 = r3.getLongOption(r4, r9)
            r1.cmafAudioFirstSegConntectTimestamp = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 454(0x1c6, float:6.36E-43)
            long r3 = r3.getLongOption(r4, r9)
            r1.cmafVideoFirstSegConntectTimestamp = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 455(0x1c7, float:6.38E-43)
            long r3 = r3.getLongOption(r4, r9)
            r1.cmafMdpHttpReqFinishTimestamp = r3
        L26d:
            boolean r3 = r0.isRtcPlayAvailable()
            if (r3 == 0) goto L29b
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 806(0x326, float:1.13E-42)
            long r3 = r3.getLongOption(r4, r9)
            r1.rtcInitedTime = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 807(0x327, float:1.131E-42)
            long r3 = r3.getLongOption(r4, r9)
            r1.rtcOfferSendTime = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 808(0x328, float:1.132E-42)
            long r3 = r3.getLongOption(r4, r9)
            r1.rtcAnswerRecvTime = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 809(0x329, float:1.134E-42)
            long r3 = r3.getLongOption(r4, r9)
            r1.rtcStartTime = r3
        L29b:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 69
            long r3 = r3.getLongOption(r4, r9)
            r1.tcpConnectTimestamp = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 70
            long r3 = r3.getLongOption(r4, r9)
            r1.tcpFirstPacketTimestamp = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 75
            long r3 = r3.getLongOption(r4, r9)
            r1.videoPacketTimestamp = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 76
            long r3 = r3.getLongOption(r4, r9)
            r1.audioPacketTimestamp = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 77
            long r3 = r3.getLongOption(r4, r9)
            r1.videoDecodeTimestamp = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 78
            long r3 = r3.getLongOption(r4, r9)
            r1.audioDecodeTimestamp = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 155(0x9b, float:2.17E-43)
            long r3 = r3.getLongOption(r4, r9)
            r1.videoDeviceOpenTime = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 162(0xa2, float:2.27E-43)
            long r3 = r3.getLongOption(r4, r9)
            r1.videoDeviceOpenedTime = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 156(0x9c, float:2.19E-43)
            long r3 = r3.getLongOption(r4, r9)
            r1.audioDeviceOpenTime = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 163(0xa3, float:2.28E-43)
            long r3 = r3.getLongOption(r4, r9)
            r1.audioDeviceOpenedTime = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            long r3 = r3.getLongOption(r11, r7)
            long r3 = r3 * r17
            long r3 = r3 / r19
            r1.downloadSpeed = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            long r3 = r3.getLongOption(r14, r7)
            r1.audioBufferTime = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            long r3 = r3.getLongOption(r13, r7)
            r1.videoBufferTime = r3
            java.lang.String r3 = r0.mResolution
            r1.resolution = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 458(0x1ca, float:6.42E-43)
            long r3 = r3.getLongOption(r4, r7)
            r1.videoParamSendOutletTime = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 459(0x1cb, float:6.43E-43)
            long r3 = r3.getLongOption(r4, r7)
            r1.firstVideoFrameSendOutletTime = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            int r3 = r3.getVideoType()
            r1.renderType = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 624(0x270, float:8.74E-43)
            long r3 = r3.getLongOption(r4, r7)
            r1.streamInfoFindTime = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 338(0x152, float:4.74E-43)
            long r3 = r3.getLongOption(r4, r7)
            r1.streamInfoFoundTime = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 336(0x150, float:4.71E-43)
            long r3 = r3.getLongOption(r4, r7)
            r1.videoDeviceWaitStartTime = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 337(0x151, float:4.72E-43)
            long r3 = r3.getLongOption(r4, r7)
            r1.videoDeviceWaitEndTime = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 341(0x155, float:4.78E-43)
            long r3 = r3.getLongOption(r4, r9)
            r1.videoFirstPacketPos = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 343(0x157, float:4.8E-43)
            long r3 = r3.getLongOption(r4, r9)
            r1.videoFirstPacketPts = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 342(0x156, float:4.79E-43)
            long r3 = r3.getLongOption(r4, r9)
            r1.audioFirstPacketPos = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 344(0x158, float:4.82E-43)
            long r3 = r3.getLongOption(r4, r9)
            r1.audioFirstPacketPts = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 821(0x335, float:1.15E-42)
            long r3 = r3.getLongOption(r4, r7)
            r1.httpReqFinishTimestamp = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 822(0x336, float:1.152E-42)
            long r3 = r3.getLongOption(r4, r7)
            r1.httpResFinishTimestamp = r3
            if (r2 != 0) goto L3d3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 518(0x206, float:7.26E-43)
            r15 = -1
            int r3 = r3.getIntOption(r4, r15)
            r1.tfoSuccess = r3
            long r3 = r1.downloadSpeed
            r1.downloadSpeedOnFirstFrame = r3
            long r3 = r1.videoBufferTime
            r1.videoBufferTimeOnFirstFrame = r3
            long r3 = r1.audioBufferTime
            r1.audioBufferTimeOnFirstFrame = r3
            com.bykv.vk.component.ttvideo.network.DnsHelper r3 = r0.mDnsParser
            java.lang.String r3 = r3.getDNSServerIP()
            r1.dnsIP = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 210(0xd2, float:2.94E-43)
            long r3 = r3.getLongOption(r4, r9)
            r1.videoRenderTimeForPlayerCore = r3
            long r3 = java.lang.System.currentTimeMillis()
            r1.videoRenderTimestamp = r3
            r21.parseResponseHeaders(r22)
        L3d3:
            boolean r3 = r0.mHasRetry
            if (r3 != 0) goto L3e3
            if (r2 != r12) goto L3e3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r0.mPlayer
            r4 = 314(0x13a, float:4.4E-43)
            long r3 = r3.getLongOption(r4, r7)
            r1.waitingTimeAfterFirstFrame = r3
        L3e3:
            if (r2 != 0) goto Lb1
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            r3 = 352(0x160, float:4.93E-43)
            r15 = -1
            int r2 = r2.getIntOption(r3, r15)
            r1.quicFirstFrameCHLOCount = r2
        L3f0:
            int r2 = r1.quicFirstFrameCHLOCount
            if (r2 == r15) goto L3f7
            r1.quicCHLOCount = r2
            return
        L3f7:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r0.mPlayer
            int r2 = r2.getIntOption(r3, r15)
            r1.quicCHLOCount = r2
        L3ff:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public float getMaxVolume() {
            r1 = this;
            com.bykv.vk.component.ttvideo.playerwrapper.PlayerSetting r0 = r1.mPlayerSetting
            float r0 = r0.getMaxVolume()
            return r0
    }

    public long getNtpTimeDiff() {
            r4 = this;
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r0 = r4.mSettingsBundle
            r1 = 0
            if (r0 == 0) goto L17
            java.lang.String r3 = "time_diff_server_and_client"
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.getSettingsValueForKey(r3, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L17:
            return r1
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public java.lang.String getPlayerErrorInfo() {
            r2 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r2.mPlayer
            if (r0 == 0) goto Lb
            r1 = 5002(0x138a, float:7.009E-42)
            java.lang.String r0 = r0.getStringOption(r1)
            return r0
        Lb:
            java.lang.String r0 = "none"
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public float getPlayerVolume() {
            r1 = this;
            com.bykv.vk.component.ttvideo.playerwrapper.PlayerSetting r0 = r1.mPlayerSetting
            float r0 = r0.getPlayerVolume()
            return r0
    }

    public boolean getSRState() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public long getSeiDelay() {
            r4 = this;
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r4.mLogService
            r1 = 100
            r2 = 0
            long r0 = r0.getInt64Value(r1, r2)
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public java.lang.String getServerIP() {
            r1 = this;
            java.lang.String r0 = r1.mCurrentIP
            return r0
    }

    public void getSessionlogInfo(com.bykv.vk.component.ttvideo.log.LogBundle r9) {
            r8 = this;
            if (r9 == 0) goto L149
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            if (r0 != 0) goto L8
            goto L149
        L8:
            r1 = 68
            r2 = -1
            long r0 = r0.getLongOption(r1, r2)
            r9.playerDNSTimestamp = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 318(0x13e, float:4.46E-43)
            long r0 = r0.getLongOption(r1, r2)
            r9.tfoFallBackTime = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 345(0x159, float:4.83E-43)
            long r0 = r0.getLongOption(r1, r2)
            r9.dropAudioPts = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 346(0x15a, float:4.85E-43)
            long r0 = r0.getLongOption(r1, r2)
            r9.dropAudioCostTime = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 69
            long r0 = r0.getLongOption(r1, r2)
            r9.tcpConnectTimestamp = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 70
            long r0 = r0.getLongOption(r1, r2)
            r9.tcpFirstPacketTimestamp = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 75
            long r0 = r0.getLongOption(r1, r2)
            r9.videoPacketTimestamp = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 76
            long r0 = r0.getLongOption(r1, r2)
            r9.audioPacketTimestamp = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 77
            long r0 = r0.getLongOption(r1, r2)
            r9.videoDecodeTimestamp = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 78
            long r0 = r0.getLongOption(r1, r2)
            r9.audioDecodeTimestamp = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 155(0x9b, float:2.17E-43)
            long r0 = r0.getLongOption(r1, r2)
            r9.videoDeviceOpenTime = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 162(0xa2, float:2.27E-43)
            long r0 = r0.getLongOption(r1, r2)
            r9.videoDeviceOpenedTime = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 156(0x9c, float:2.19E-43)
            long r0 = r0.getLongOption(r1, r2)
            r9.audioDeviceOpenTime = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 163(0xa3, float:2.28E-43)
            long r0 = r0.getLongOption(r1, r2)
            r9.audioDeviceOpenedTime = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 63
            r4 = 0
            long r0 = r0.getLongOption(r1, r4)
            r6 = 8
            long r0 = r0 * r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r6
            r9.downloadSpeed = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 73
            long r0 = r0.getLongOption(r1, r4)
            r9.audioBufferTime = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 72
            long r0 = r0.getLongOption(r1, r4)
            r9.videoBufferTime = r0
            java.lang.String r0 = r8.mResolution
            r9.resolution = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 458(0x1ca, float:6.42E-43)
            long r0 = r0.getLongOption(r1, r4)
            r9.videoParamSendOutletTime = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 459(0x1cb, float:6.43E-43)
            long r0 = r0.getLongOption(r1, r4)
            r9.firstVideoFrameSendOutletTime = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            int r0 = r0.getVideoType()
            r9.renderType = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 624(0x270, float:8.74E-43)
            long r0 = r0.getLongOption(r1, r4)
            r9.streamInfoFindTime = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 338(0x152, float:4.74E-43)
            long r0 = r0.getLongOption(r1, r4)
            r9.streamInfoFoundTime = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 336(0x150, float:4.71E-43)
            long r0 = r0.getLongOption(r1, r4)
            r9.videoDeviceWaitStartTime = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 337(0x151, float:4.72E-43)
            long r0 = r0.getLongOption(r1, r4)
            r9.videoDeviceWaitEndTime = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 341(0x155, float:4.78E-43)
            long r0 = r0.getLongOption(r1, r2)
            r9.videoFirstPacketPos = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 343(0x157, float:4.8E-43)
            long r0 = r0.getLongOption(r1, r2)
            r9.videoFirstPacketPts = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 342(0x156, float:4.79E-43)
            long r0 = r0.getLongOption(r1, r2)
            r9.audioFirstPacketPos = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 344(0x158, float:4.82E-43)
            long r0 = r0.getLongOption(r1, r2)
            r9.audioFirstPacketPts = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 821(0x335, float:1.15E-42)
            long r0 = r0.getLongOption(r1, r4)
            r9.httpReqFinishTimestamp = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 822(0x336, float:1.152E-42)
            long r0 = r0.getLongOption(r1, r4)
            r9.httpResFinishTimestamp = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r8.mPlayer
            r1 = 45
            long r0 = r0.getLongOption(r1, r4)
            r9.downloadSize = r0
        L149:
            return
    }

    public boolean getSharpenState() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public org.json.JSONObject getStaticLog() {
            r1 = this;
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            org.json.JSONObject r0 = r0.getStaticLog()
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public java.lang.String getStringOption(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 57
            if (r2 == r0) goto L1a
            r0 = 58
            if (r2 == r0) goto L17
            r0 = 60
            if (r2 == r0) goto L14
            r0 = 65
            if (r2 == r0) goto L11
            goto L1c
        L11:
            java.lang.String r3 = r1.mAbrStrategy
            goto L1c
        L14:
            java.lang.String r3 = r1.mStreamFormat
            goto L1c
        L17:
            java.lang.String r3 = r1.mResolution
            goto L1c
        L1a:
            java.lang.String r3 = r1.mCurrentPlayURL
        L1c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "getStringOption: "
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r2)
            return r3
    }

    public int getUrlSettingMethod() {
            r1 = this;
            int r0 = r1.mUrlSettingMethod
            return r0
    }

    public void getVideoCodecType() {
            r3 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.mPlayer
            if (r0 == 0) goto L24
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r3.mLogService
            if (r1 != 0) goto L9
            goto L24
        L9:
            r1 = 141(0x8d, float:1.98E-43)
            r2 = -1
            int r0 = r0.getIntOption(r1, r2)
            if (r0 != 0) goto L1a
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r3.mLogService
            java.lang.String r1 = "h264"
            r0.setCodecType(r1)
            return
        L1a:
            r1 = 1
            if (r0 != r1) goto L24
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r3.mLogService
            java.lang.String r1 = "bytevc1"
            r0.setCodecType(r1)
        L24:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public int getVideoHeight() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            if (r0 == 0) goto L9
            int r0 = r0.getVideoHeight()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public int getVideoWidth() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            if (r0 == 0) goto L9
            int r0 = r0.getVideoWidth()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public float getVolume() {
            r1 = this;
            com.bykv.vk.component.ttvideo.playerwrapper.PlayerSetting r0 = r1.mPlayerSetting
            float r0 = r0.getVolume()
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public boolean isIPPlayer() {
            r2 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r2.mPlayer
            if (r0 == 0) goto Ld
            int r0 = r0.getPlayerType()
            r1 = 2
            if (r0 != r1) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public boolean isOsPlayer() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            if (r0 == 0) goto Lc
            boolean r0 = r0.isOSPlayer()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public boolean isPlaying() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mPlayer
            if (r0 == 0) goto Lc
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean isRtcPlayAvailable() {
            r2 = this;
            int r0 = r2.mEnableRtcPlay
            r1 = 1
            if (r0 != r1) goto La
            int r0 = r2.mRtcPlayFallBack
            if (r0 != 0) goto La
            return r1
        La:
            r0 = 0
            return r0
    }

    public boolean isUsedSR() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isUsedSharpen() {
            r1 = this;
            r0 = 0
            return r0
    }

    public org.json.JSONObject liveInfoItems() {
            r3 = this;
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r3.mLogService     // Catch: org.json.JSONException -> Le
            org.json.JSONObject r0 = r0.getLiveInfoItems()     // Catch: org.json.JSONException -> Le
            java.lang.String r1 = "get_live_info_iterms"
            java.lang.String r2 = "OK"
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Le
            return r0
        Le:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            r0 = 0
            return r0
    }

    public void onRenderStallForRetryStop() {
            r10 = this;
            boolean r0 = r10.mIsStalling
            if (r0 != 0) goto L8
            boolean r0 = r10.mIsRetrying
            if (r0 == 0) goto L3d
        L8:
            int r0 = r10.mEnableRenderStall
            r1 = 1
            if (r0 != r1) goto L3d
            long r0 = r10.mAudioLastRenderTime
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L26
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r10.mAudioLastRenderTime
            long r0 = r0 - r4
            int r1 = (int) r0
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r4 = r10.mLogService
            long r5 = (long) r1
            r8 = 0
            r9 = 0
            r7 = 0
            r4.onRenderStall(r5, r7, r8, r9)
        L26:
            long r0 = r10.mVideoLastRenderTime
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3d
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r10.mVideoLastRenderTime
            long r0 = r0 - r2
            int r1 = (int) r0
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r10.mLogService
            long r3 = (long) r1
            r6 = 1
            r7 = 0
            r5 = 0
            r2.onRenderStall(r3, r5, r6, r7)
        L3d:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void openNTP() {
            r1 = this;
            r0 = 1
            r1.mEnableNTPTask = r0
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService
            r0.openNTP()
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void pause() {
            r2 = this;
            java.lang.String r0 = "VideoLiveManager"
            java.lang.String r1 = "pause"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r1)
            r2.checkMainLooper(r1)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r2.mPlayer
            if (r0 == 0) goto L1d
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto L1d
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.PAUSED
            r2.mLivePlayerState = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r2.mPlayer
            r0.pause()
        L1d:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void play() {
            r10 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.bykv.vk.component.ttvideo.ILiveListener r2 = r10.mListener
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "play start -- "
            r3.<init>(r4)
            int r4 = r10.hashCode()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 4
            r2.onReportALog(r4, r3)
            java.lang.String r2 = "play"
            r10.checkMainLooper(r2)
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r3 = r10.mLivePlayerState
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r5 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.PLAYED
            if (r3 != r5) goto L46
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r10.mLogService
            r0.onIllegalAPICall(r2)
            com.bykv.vk.component.ttvideo.ILiveListener r0 = r10.mListener
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "illegal call: play -- "
            r1.<init>(r2)
            int r2 = r10.hashCode()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 6
            r0.onReportALog(r2, r1)
            return
        L46:
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r6 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.PAUSED
            if (r3 != r6) goto L54
            r10.mLivePlayerState = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r10.mPlayer
            if (r0 == 0) goto L53
            r0.start()
        L53:
            return
        L54:
            java.lang.String r3 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r3, r2)
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = r10.mURLSource
            int r2 = r2.getSourceType()
            r6 = 2
            if (r2 != r6) goto L6e
            r10._configAbrInfo()
            r10._setStreamFormat()
            r10._setProtocol()
            r10._checkStreamData()
        L6e:
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r10.mSettingsBundle
            r7 = 1
            if (r2 == 0) goto Lbd
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r8 = r10.mURLSource
            java.lang.String r9 = "live_sdk_super_resolution_enable"
            java.lang.Object r2 = r2.getSettingsValueForKey(r9, r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.setEnableSR(r2)
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r10.mSettingsBundle
            java.lang.String r8 = "live_sdk_texture_render_enable"
            java.lang.Object r2 = r2.getSettingsValueForKey(r8, r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8 = 69
            r10.setIntOption(r8, r2)
            com.bykv.vk.component.ttvideo.ILiveSettingBundle r2 = r10.mSettingsBundle
            java.lang.String r8 = "live_sdk_sharpen_enable"
            java.lang.Object r1 = r2.getSettingsValueForKey(r8, r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r7) goto Lbd
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r1 = r10.mURLSource
            java.lang.String r2 = r10.mResolution
            java.lang.String r8 = r10.mLevel
            org.json.JSONObject r1 = r1.getSharpenParams(r2, r8)
            r10.mSharpenSdkParams = r1
            if (r1 == 0) goto Lbd
            java.lang.String r2 = "Enabled"
            int r1 = r1.optInt(r2)
            r10.mEnableSharpen = r1
        Lbd:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r1 = r10.mURLSource
            java.lang.String r2 = r10.mResolution
            java.lang.String r8 = r10.mLevel
            boolean r1 = r1.getSREnabled(r2, r8)
            r2 = 70
            r10.setIntOption(r2, r1)
            r10.mLivePlayerState = r5
            r1 = -1
            r10.mFrameTerminatedDTS = r1
            r10.mLatestAudioPacketDTS = r1
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r1 = r10.mURLSource
            java.lang.String r2 = ""
            if (r1 == 0) goto L17c
            int r1 = r1.getSourceType()
            if (r1 != r7) goto L156
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r1 = r10.mURLSource
            com.bykv.vk.component.ttvideo.model.LiveURL r1 = r1.getPlayLiveURL()
            if (r1 == 0) goto L156
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r1 = r10.mURLSource
            com.bykv.vk.component.ttvideo.model.LiveURL r1 = r1.getPlayLiveURL()
            java.lang.String r1 = r1.mainURL
            boolean r5 = r10.mIsLocalURL
            if (r5 == 0) goto Lf7
            java.lang.String r5 = r10.mLocalURL
            goto Lf8
        Lf7:
            r5 = r1
        Lf8:
            if (r5 == 0) goto L122
            java.lang.String r6 = "http"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L106
            java.lang.String r6 = "tcp"
            r10.mTransportProtocol = r6
        L106:
            java.lang.String r6 = "https"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L112
            java.lang.String r6 = "tls"
            r10.mTransportProtocol = r6
        L112:
            java.lang.String r6 = "httpk"
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto L11e
            java.lang.String r5 = "kcp"
            r10.mTransportProtocol = r5
        L11e:
            java.lang.String r5 = r10.mTransportProtocol
            r10.mURLProtocol = r5
        L122:
            boolean r5 = r10.mQuicPull
            if (r5 == 0) goto L14a
            java.lang.String r5 = "ttquic"
            com.bykv.vk.component.ttvideo.LibraryLoader.loadLibrary(r5)     // Catch: java.lang.Throwable -> L13a
            r10.mQuicEnable = r7     // Catch: java.lang.Throwable -> L13a
            java.lang.String r5 = "ttquic lib is load success"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r3, r5)     // Catch: java.lang.Throwable -> L13a
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r10.mLogService     // Catch: java.lang.Throwable -> L13a
            r5.setQuicLibLoader(r7)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r0 = "quic"
            goto L14b
        L13a:
            java.lang.String r5 = r10.mTransportProtocol
            r10.mQuicEnable = r0
            java.lang.String r6 = "ttquic lib is load failed. change default protocol"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r3, r6)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r3 = r10.mLogService
            r3.setQuicLibLoader(r0)
            r0 = r5
            goto L14b
        L14a:
            r0 = r2
        L14b:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L153
            java.lang.String r0 = r10.mTransportProtocol
        L153:
            r10.mTransportProtocol = r0
            goto L17d
        L156:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r10.mURLSource
            int r0 = r0.getSourceType()
            if (r0 != r6) goto L17c
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r10.mURLSource
            java.lang.String r1 = r10.mResolution
            java.lang.String r3 = "auto"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L171
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r1 = r10.mURLSource
            java.lang.String r1 = r1.getDefaultResolution()
            goto L173
        L171:
            java.lang.String r1 = r10.mResolution
        L173:
            java.lang.String r3 = r10.mStreamFormat
            java.lang.String r5 = r10.mLevel
            java.lang.String r1 = r0.getPlayURLForResolution(r1, r3, r5)
            goto L17d
        L17c:
            r1 = 0
        L17d:
            boolean r0 = r10.mIsLocalURL
            if (r0 == 0) goto L183
            java.lang.String r1 = r10.mLocalURL
        L183:
            if (r1 == 0) goto L207
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r10.mURLSource
            java.lang.String r0 = r0.getSessionID()
            r10.mUuid = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1a7
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "-"
            java.lang.String r0 = r0.replace(r3, r2)
            java.lang.String r0 = r0.toLowerCase()
            r10.mUuid = r0
        L1a7:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r10.mLogService
            java.lang.String r2 = r10.mSuggestProtocol
            java.lang.String r3 = r10.mTransportProtocol
            r0.setProtocolInfo(r2, r3)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r10.mLogService
            r0.reset()
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r10.mLogService
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r10.mUuid
            r2.append(r3)
            java.lang.String r3 = "."
            r2.append(r3)
            long r5 = java.lang.System.currentTimeMillis()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.mSessionId = r2
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r10.mLogService
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = r10.mURLSource
            java.lang.String r2 = r2.getRuleIds()
            r0.mRuleIds = r2
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r10.mLogService
            java.lang.String r2 = r10.mResolution
            r0.mResolution = r2
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r2 = r10.mURLSource
            java.lang.String r2 = r2.getDefaultResolution()
            r0.mAutoUsingResolution = r2
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r10.mLogService
            boolean r2 = r10.mIsLocalURL
            if (r2 == 0) goto L1f4
            java.lang.String r2 = r10.mLocalURL
            goto L1f5
        L1f4:
            r2 = r1
        L1f5:
            com.bykv.vk.component.ttvideo.network.DnsHelper r3 = r10.mDnsParser
            java.lang.String r3 = r3.getDNSServerIP()
            r0.onPlay(r2, r3)
            r10._play(r1)
            com.bykv.vk.component.ttvideo.retry.RetryProcessor r0 = r10.mRetryProcessor
            r0.start()
            goto L224
        L207:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "url"
            java.lang.String r2 = "no playurl found while play"
            r0.put(r1, r2)
            com.bykv.vk.component.ttvideo.log.LiveError r1 = new com.bykv.vk.component.ttvideo.log.LiveError
            r2 = -100002(0xfffffffffffe795e, float:NaN)
            java.lang.String r3 = "playURL is null"
            r1.<init>(r2, r3, r0)
            com.bykv.vk.component.ttvideo.retry.RetryProcessor r0 = r10.mRetryProcessor
            boolean r2 = r10.mShowedFirstFrame
            r0.onError(r1, r2)
        L224:
            int r0 = r10.mEnableStallCounter
            if (r0 != r7) goto L22b
            r10.startStallCounter()
        L22b:
            com.bykv.vk.component.ttvideo.ILiveListener r0 = r10.mListener
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "play end -- "
            r1.<init>(r2)
            int r2 = r10.hashCode()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.onReportALog(r4, r1)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public boolean playResolution(java.lang.String r9) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "playResolution:"
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r0)
            java.lang.String r0 = "playResolution"
            r8.checkMainLooper(r0)
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r8.mURLSource
            int r0 = r0.getSourceType()
            r2 = 2
            r3 = 0
            if (r0 != r2) goto L104
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r0 = r8.mPrepareState
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r2 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.PREPARED
            if (r0 == r2) goto L2a
            goto L104
        L2a:
            java.lang.String r0 = r8.mResolution
            boolean r0 = r0.equals(r9)
            r2 = 1
            if (r0 == 0) goto L45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "playResolution: same res="
            r0.<init>(r3)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r9)
            return r2
        L45:
            com.bykv.vk.component.ttvideo.retry.RetryProcessor r0 = r8.mRetryProcessor
            r0.reset()
            r0 = -1
            r8.mResolutionIndex = r0
            r8.mStallCount = r3
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r8.mLogService
            java.lang.String r4 = r8.mCurrentPlayURL
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "setting_"
            r5.<init>(r6)
            java.lang.String r6 = r8.mResolution
            r5.append(r6)
            java.lang.String r6 = "_to_"
            r5.append(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "none"
            r0.onSwitch(r4, r7, r5, r3)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r8.mLogService
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "manual_abr_"
            r4.<init>(r5)
            java.lang.String r5 = r8.mResolution
            r4.append(r5)
            r4.append(r6)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r0.mAbrSwitchInfo = r4
            r8.saveCurrentResolution()
            r8.mResolution = r9
            java.lang.String r0 = r8.mAbrStrategy
            java.lang.String r4 = "abr_bb_4live"
            boolean r0 = r0.equals(r4)
            java.lang.String r4 = "auto"
            if (r0 != 0) goto Lab
            java.lang.String r0 = r8.mAbrStrategy
            java.lang.String r5 = "rad"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L103
            boolean r0 = r9.equals(r4)
            if (r0 != 0) goto L103
        Lab:
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r8.mURLSource
            java.lang.String r5 = r8.mResolution
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto Lbc
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r4 = r8.mURLSource
            java.lang.String r4 = r4.getDefaultResolution()
            goto Lbe
        Lbc:
            java.lang.String r4 = r8.mResolution
        Lbe:
            java.lang.String r5 = r8.mStreamFormat
            java.lang.String r6 = r8.mLevel
            java.lang.String r0 = r0.getPlayURLForResolution(r4, r5, r6)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto Le1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r9 = " playUrl not exist"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.w(r1, r9)
            return r3
        Le1:
            r8.updateDownloadSizeStat()
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r9 = r8.mLogService
            r9.onSessionStop()
            r8.mIsRetrying = r2
            r8._stopPlayer()
            r8._resetPlayer()
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r9 = r8.mLogService
            r9.onSwitchURL(r0)
            r8.mUserSwitchResoultion = r2
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r9 = r8.mLogService
            long r3 = java.lang.System.currentTimeMillis()
            r9.mSessionStartTime = r3
            r8.parsePlayDNS(r0)
        L103:
            return r2
        L104:
            return r3
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void release() {
            r5 = this;
            java.lang.String r0 = "release start"
            java.lang.String r1 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r0)
            com.bykv.vk.component.ttvideo.ILiveListener r0 = r5.mListener
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "release start -- "
            r2.<init>(r3)
            int r3 = r5.hashCode()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 4
            r0.onReportALog(r3, r2)
            java.lang.String r0 = "release"
            r5.checkMainLooper(r0)
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r2 = r5.mLivePlayerState
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r4 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.PLAYED
            if (r2 == r4) goto L2e
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r4 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.PAUSED
            if (r2 != r4) goto L32
        L2e:
            r2 = 1
            r5._stop(r2, r0)
        L32:
            r5.releaseTextureRenderRef()
            java.util.concurrent.ExecutorService r0 = r5.mExecutor
            r0.shutdown()
            android.os.Handler r0 = r5.mMyHandler
            r2 = 0
            r0.removeCallbacksAndMessages(r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            if (r0 != 0) goto L45
            return
        L45:
            r0.release()
            r5.mPlayer = r2
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r5.mLogService
            r0.reset()
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.IDLE
            r5.mPrepareState = r0
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r0 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.IDLE
            r5.mLivePlayerState = r0
            java.lang.String r0 = "release end"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r0)
            com.bykv.vk.component.ttvideo.ILiveListener r0 = r5.mListener
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "release end -- "
            r1.<init>(r2)
            int r2 = r5.hashCode()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.onReportALog(r3, r1)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void releaseAsync() {
            r5 = this;
            com.bykv.vk.component.ttvideo.ILiveListener r0 = r5.mListener
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "releaseAsync start -- "
            r1.<init>(r2)
            int r2 = r5.hashCode()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 4
            r0.onReportALog(r2, r1)
            java.lang.String r0 = "VideoLiveManager"
            java.lang.String r1 = "releaseAsync"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r1)
            r5.checkMainLooper(r1)
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r3 = r5.mLivePlayerState
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r4 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.PLAYED
            if (r3 == r4) goto L2c
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r4 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.PAUSED
            if (r3 != r4) goto L30
        L2c:
            r3 = 0
            r5._stop(r3, r1)
        L30:
            java.util.concurrent.ExecutorService r1 = r5.mExecutor
            r1.shutdown()
            android.os.Handler r1 = r5.mMyHandler
            r3 = 0
            r1.removeCallbacksAndMessages(r3)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r5.mPlayer
            if (r1 != 0) goto L40
            return
        L40:
            android.view.SurfaceHolder r4 = r5.mSurfaceHolder
            if (r4 == 0) goto L47
            r1.setDisplay(r3)
        L47:
            r5.releaseTextureRenderRef()
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r5.mPlayer
            r5.mPlayer = r3
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r3 = r5.mLogService
            r3.reset()
            com.bykv.vk.component.ttvideo.VideoLiveManager$PlayerState r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.PlayerState.IDLE
            r5.mPrepareState = r3
            com.bykv.vk.component.ttvideo.VideoLiveManager$LivePlayerState r3 = com.bykv.vk.component.ttvideo.VideoLiveManager.LivePlayerState.IDLE
            r5.mLivePlayerState = r3
            com.bykv.vk.component.ttvideo.VideoLiveManager$MyReleaseRunnable r3 = new com.bykv.vk.component.ttvideo.VideoLiveManager$MyReleaseRunnable
            r3.<init>(r1)
            com.bykv.vk.component.ttvideo.utils.LiveThreadPool.addExecuteTask(r3)
            java.lang.String r1 = "releaseAsync end"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r1)
            com.bykv.vk.component.ttvideo.ILiveListener r0 = r5.mListener
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "releaseAsync end -- "
            r1.<init>(r3)
            int r3 = r5.hashCode()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.onReportALog(r2, r1)
            return
    }

    public void releaseTextureRenderRef() {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void reset() {
            r4 = this;
            java.lang.String r0 = "VideoLiveManager"
            java.lang.String r1 = "reset"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r1)
            r4.checkMainLooper(r1)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r4.mPlayer
            if (r0 != 0) goto Lf
            return
        Lf:
            r4._reset(r1)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r4.mLogService
            r0.reset()
            r0 = 0
            r4.mCacheFileKey = r0
            r4.mCacheFilePath = r0
            r1 = 0
            r4.mEnableResolutionAutoDegrade = r1
            r4.mEnableOriginResolution = r1
            r2 = 1
            r4.mEnableSwitchMainAndBackupUrl = r2
            r4.mEnableTextureSR = r1
            r4.mEnableTextureRender = r1
            r4.mTextureSRMode = r1
            java.lang.String r2 = "origin"
            r4.mResolution = r2
            r2 = -1
            r4.mResolutionIndex = r2
            java.lang.String r3 = "flv"
            r4.mStreamFormat = r3
            java.lang.String r3 = "tcp"
            r4.mTransportProtocol = r3
            java.lang.String r3 = "none"
            r4.mSuggestProtocol = r3
            java.lang.String r3 = "main"
            r4.mLevel = r3
            r4.mLocalURL = r0
            r4.mIsLocalURL = r1
            r4.mEnableHurryFlag = r1
            r4.mHurryType = r2
            java.lang.String r0 = ""
            r4.mEnableAvLines = r0
            r4.mEnableSaveSCFG = r1
            r4.mShowedFirstFrame = r1
            r4.mEnableLLASHFastOpen = r1
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void setAsyncInit(int r4) {
            r3 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "setAsyncInit enable:%b"
            java.lang.String.format(r0, r1)
            r3.mEnableMediaCodecASYNCInit = r4
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void setCommonFlag(java.lang.String r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService
            if (r0 == 0) goto L7
            r0.setCommonFlag(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void setDisableVideoRender(java.lang.Boolean r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setDisableVideoRender: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r0)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r2.mLogService
            boolean r1 = r3.booleanValue()
            r0.mDisableVideoRender = r1
            int r0 = r2.mEnableRadioLiveDisableRender
            r1 = 1
            if (r0 != r1) goto L2d
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r2.mPlayer
            if (r0 == 0) goto L2d
            r1 = 261(0x105, float:3.66E-43)
            boolean r3 = r3.booleanValue()
            r0.setIntOption(r1, r3)
        L2d:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void setFloatOption(int r4, float r5) {
            r3 = this;
            r0 = 19
            r1 = 1
            java.lang.String r2 = ""
            if (r4 == r0) goto L4a
            r0 = 20
            if (r4 == r0) goto Ld
            goto L86
        Ld:
            int r4 = r3.mEnableLowLatencyFLV
            if (r4 != r1) goto L26
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r0 = "invalid settings on low latency flv, slow_speed:"
            r4.append(r0)
            r4.append(r5)
            java.lang.String r2 = r4.toString()
            goto L86
        L26:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r0 = "slow_speed:"
            r4.append(r0)
            r4.append(r5)
            java.lang.String r2 = r4.toString()
            r3.mSlowPlaySpeed = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r4 = r3.mPlayer
            if (r4 == 0) goto L86
            r0 = 191(0xbf, float:2.68E-43)
            r4.setFloatOption(r0, r5)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r4 = r3.mLogService
            r4.mSlowSpeed = r5
            goto L86
        L4a:
            int r4 = r3.mEnableLowLatencyFLV
            if (r4 != r1) goto L63
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r0 = "invalid settings on low latency flv, catch_speed:"
            r4.append(r0)
            r4.append(r5)
            java.lang.String r2 = r4.toString()
            goto L86
        L63:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r0 = "catch_speed:"
            r4.append(r0)
            r4.append(r5)
            java.lang.String r2 = r4.toString()
            r3.mCatchSpeed = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r4 = r3.mPlayer
            if (r4 == 0) goto L86
            r0 = 80
            r4.setFloatOption(r0, r5)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r4 = r3.mLogService
            r4.mCatchSpeed = r5
        L86:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "setFloatOption "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r5, r4)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void setIntOption(int r5, int r6) {
            r4 = this;
            java.lang.String r0 = "hurry_time:"
            java.lang.String r1 = "slow_play_time:"
            r2 = 1
            java.lang.String r3 = ""
            switch(r5) {
                case 1: goto L5d1;
                case 2: goto L5b1;
                case 3: goto L597;
                case 4: goto L577;
                case 5: goto L556;
                case 6: goto La;
                case 7: goto L535;
                case 8: goto L514;
                case 9: goto L4f3;
                case 10: goto L4d2;
                case 11: goto L4b1;
                case 12: goto L48b;
                case 13: goto La;
                case 14: goto La;
                case 15: goto L473;
                case 16: goto L452;
                case 17: goto L415;
                case 18: goto L3f4;
                case 19: goto La;
                case 20: goto La;
                case 21: goto L3b7;
                case 22: goto L396;
                case 23: goto La;
                case 24: goto La;
                case 25: goto L37e;
                case 26: goto La;
                case 27: goto La;
                case 28: goto La;
                case 29: goto La;
                case 30: goto La;
                case 31: goto L353;
                case 32: goto L33b;
                case 33: goto L312;
                case 34: goto L2ed;
                case 35: goto L2d5;
                case 36: goto L2bd;
                case 37: goto L298;
                case 38: goto L273;
                case 39: goto L25b;
                case 40: goto L243;
                case 41: goto L22b;
                case 42: goto L213;
                case 43: goto La;
                case 44: goto L1fb;
                case 45: goto La;
                case 46: goto L1d6;
                case 47: goto L1b1;
                case 48: goto L199;
                case 49: goto La;
                case 50: goto La;
                case 51: goto La;
                case 52: goto La;
                case 53: goto La;
                case 54: goto L174;
                case 55: goto L15c;
                case 56: goto L140;
                case 57: goto La;
                case 58: goto La;
                case 59: goto La;
                case 60: goto La;
                case 61: goto L11f;
                case 62: goto Lfe;
                case 63: goto La;
                case 64: goto La;
                case 65: goto La;
                case 66: goto La;
                case 67: goto Le6;
                case 68: goto La;
                case 69: goto Lce;
                case 70: goto Lb6;
                case 71: goto La;
                case 72: goto La;
                case 73: goto La;
                case 74: goto La;
                case 75: goto La;
                case 76: goto La;
                case 77: goto L9a;
                case 78: goto La;
                case 79: goto La;
                case 80: goto L82;
                case 81: goto La;
                case 82: goto L6a;
                case 83: goto L47;
                case 84: goto L24;
                case 85: goto Lc;
                default: goto La;
            }
        La:
            goto L5f0
        Lc:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "enable free flow:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mEnableFreeFlow = r6
            goto L5f0
        L24:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r1)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mSlowPlayTime = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 398(0x18e, float:5.58E-43)
            r5.setIntOption(r0, r6)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService
            r5.mSlowPlayTime = r6
            goto L5f0
        L47:
            r4.mHurryTime = r6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 397(0x18d, float:5.56E-43)
            r5.setIntOption(r0, r6)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService
            r5.mHurryTime = r6
            goto L5f0
        L6a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "enable mult_sei:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mEnableDecodeMultiSei = r6
            goto L5f0
        L82:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "toB switch :"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mSwitchToB = r6
            goto L5f0
        L9a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "tsl time shift:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mTslTimeShift = r6
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService
            r5.mTslTimeShift = r6
            goto L5f0
        Lb6:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "enable texture sr:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mEnableTextureSR = r6
            goto L5f0
        Lce:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "enable texture render:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mEnableTextureRender = r6
            goto L5f0
        Le6:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "enable flv abr:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mEnableFlvABR = r6
            goto L5f0
        Lfe:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "enable check packet corrupt:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mEnableCheckPacketCorrupt = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 317(0x13d, float:4.44E-43)
            r5.setIntOption(r0, r6)
            goto L5f0
        L11f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "enable tcp fast open:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mEnableTcpFastOpen = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 316(0x13c, float:4.43E-43)
            r5.setIntOption(r0, r6)
            goto L5f0
        L140:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "enable resolution degrade:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            if (r6 != r2) goto L157
            goto L158
        L157:
            r2 = 0
        L158:
            r4.mEnableResolutionAutoDegrade = r2
            goto L5f0
        L15c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "set stall count thre:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mStallCountThresOfResolutionDegrade = r6
            goto L5f0
        L174:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "check buffering end advance:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mCheckBufferingEndAdvanceEnable = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 313(0x139, float:4.39E-43)
            r5.setIntOption(r0, r6)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService
            r5.mCheckBufferingEndAdvanceEnable = r6
            goto L5f0
        L199:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "enable mediaLoader:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mEnableOpenMDL = r6
            goto L5f0
        L1b1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "start direct:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mStartDirectAfterPrepared = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 311(0x137, float:4.36E-43)
            r5.setIntOption(r0, r6)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService
            r5.mStartDirectAfterPrepared = r6
            goto L5f0
        L1d6:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "buffering end ignore video:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mCheckBufferingEndIgnoreVideo = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 310(0x136, float:4.34E-43)
            r5.setIntOption(r0, r6)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService
            r5.mCheckBufferingEndIgnoreVideo = r6
            goto L5f0
        L1fb:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "set in main looper:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mIsInMainLooper = r6
            goto L5f0
        L213:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "enable NTP:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mEnableNTPTask = r6
            goto L5f0
        L22b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "enable upload sei:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mEnableUploadSei = r6
            goto L5f0
        L243:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "enable fast open:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mEnableFastOpenStream = r6
            goto L5f0
        L25b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "enable httpk degrade:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mEnableHttpkDegrade = r6
            goto L5f0
        L273:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "enable test split "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mEnableSplitStream = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 87
            r5.setIntOption(r0, r6)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService
            r5.mEnableSplitStream = r6
            goto L5f0
        L298:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "set max cache"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mMaxCacheSeconds = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 198(0xc6, float:2.77E-43)
            r5.setIntOption(r0, r6)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService
            r5.mMaxCacheSeconds = r6
            goto L5f0
        L2bd:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "enable bytevc1 hardware decode "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mEnableByteVC1HardwareDecode = r6
            goto L5f0
        L2d5:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "enable 264 hardware decode "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mEnableH264HardwareDecode = r6
            goto L5f0
        L2ed:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "defaultCodecID:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mDefaultCodecId = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 182(0xb6, float:2.55E-43)
            r5.setIntOption(r0, r6)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService
            r5.mDefaultCodecID = r6
            goto L5f0
        L312:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "asyncInit:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mEnableMediaCodecASYNCInit = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            int r0 = r4.mHardwareDecodeEnable
            if (r0 != r2) goto L5f0
            r0 = 181(0xb5, float:2.54E-43)
            r5.setIntOption(r0, r6)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService
            r5.mMediaCodecAsyncInit = r6
            goto L5f0
        L33b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "enable_sharp:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mEnableSharp = r6
            goto L5f0
        L353:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "url_ability:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mURLAbility = r6
            if (r6 != r2) goto L373
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService
            java.lang.String r6 = "h264"
            r5.mUrlAbility = r6
            goto L5f0
        L373:
            r5 = 2
            if (r6 != r5) goto L5f0
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService
            java.lang.String r6 = "bytevc1"
            r5.mUrlAbility = r6
            goto L5f0
        L37e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "player_degrade_mode:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mPlayerDegradeMode = r6
            goto L5f0
        L396:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "check side data"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mOpenCheckSideData = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 132(0x84, float:1.85E-43)
            r5.setIntOption(r0, r6)
            goto L5f0
        L3b7:
            int r5 = r4.mEnableLowLatencyFLV
            if (r5 != r2) goto L3d1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "invalid settings on low latency flv, slow_play_time:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            goto L5f0
        L3d1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r1)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mSlowPlayTime = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 190(0xbe, float:2.66E-43)
            r5.setIntOption(r0, r6)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService
            r5.mSlowPlayTime = r6
            goto L5f0
        L3f4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "hurry_type:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mHurryType = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 84
            r5.setIntOption(r0, r6)
            goto L5f0
        L415:
            int r5 = r4.mEnableLowLatencyFLV
            if (r5 != r2) goto L42f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "invalid settings on low latency flv, hurry_time:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            goto L5f0
        L42f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mHurryTime = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 15
            r5.setIntOption(r0, r6)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService
            r5.mHurryTime = r6
            goto L5f0
        L452:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "use_test_action:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mTestAction = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 83
            r5.setIntOption(r0, r6)
            goto L5f0
        L473:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "use_external_dir:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mUseExternalDir = r6
            goto L5f0
        L48b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "network_timeout:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mNetworkTimeout = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 1000000(0xf4240, float:1.401298E-39)
            int r6 = r6 * r0
            r0 = 9
            r5.setIntOption(r0, r6)
            goto L5f0
        L4b1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "buffering_timeout:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mBufferTimeout = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 81
            r5.setIntOption(r0, r6)
            goto L5f0
        L4d2:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "buffering_millSeconds:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mBufferDataSeconds = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 86
            r5.setIntOption(r0, r6)
            goto L5f0
        L4f3:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "bytevc1_decoder_type:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mByteVC1DecoderType = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 67
            r5.setIntOption(r0, r6)
            goto L5f0
        L514:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "enable_cache_file:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mCacheFileEnable = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r6 = 14
            r5.setIntOption(r6, r2)
            goto L5f0
        L535:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "hard_decode:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mHardwareDecodeEnable = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 59
            r5.setIntOption(r0, r6)
            goto L5f0
        L556:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "render_type:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mRenderType = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 56
            r5.setIntOption(r0, r6)
            goto L5f0
        L577:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "image_layout:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mLayoutType = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 36
            r5.setIntOption(r0, r6)
            goto L5f0
        L597:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "forbid_os_player:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r5 = 11
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.setValue(r5, r6)
            goto L5f0
        L5b1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "image_scale:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mScaleType = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 38
            r5.setIntOption(r0, r6)
            goto L5f0
        L5d1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r0 = "image_enhancement:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.mEnhancementType = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L5f0
            r0 = 37
            r5.setIntOption(r0, r6)
        L5f0:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "setIntOption "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r6, r5)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void setLocalURL(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "setLocalURL"
            r1.checkMainLooper(r0)
            if (r2 == 0) goto L16
            java.lang.String r0 = r1.mLocalURL
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L16
            java.lang.String r0 = r1.mLocalURL
            if (r0 == 0) goto L16
            r1.reset()
        L16:
            r1.mLocalURL = r2
            r2 = 1
            r1.mIsLocalURL = r2
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void setLongOption(int r5, long r6) {
            r4 = this;
            r0 = 45
            java.lang.String r1 = ""
            if (r5 == r0) goto L22
            r0 = 59
            if (r5 == r0) goto Lb
            goto L4b
        Lb:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r0 = "set alog func:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r1 = r5.toString()
            r4.mALogWriteAddr = r6
            goto L4b
        L22:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r0 = "startPlayBufferThreshold:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r1 = r5.toString()
            r4.mStartPlayBufferThres = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L4b
            r2 = 0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L4b
            r0 = 309(0x135, float:4.33E-43)
            r5.setLongOption(r0, r6)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService
            r5.mStartPlayBufferThres = r6
        L4b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "setLongOptin "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r6, r5)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void setLooping(boolean r2) {
            r1 = this;
            r1.mLooping = r2
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r1.mPlayer
            if (r2 == 0) goto L19
            boolean r2 = r1.mIsLocalURL
            if (r2 == 0) goto L19
            java.lang.String r2 = r1.mLocalURL
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L19
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r1.mPlayer
            boolean r0 = r1.mLooping
            r2.setLooping(r0)
        L19:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void setMute(java.lang.Boolean r3) {
            r2 = this;
            com.bykv.vk.component.ttvideo.playerwrapper.PlayerSetting r0 = r2.mPlayerSetting
            boolean r1 = r3.booleanValue()
            r0.setMute(r1)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r2.mLogService
            boolean r3 = r3.booleanValue()
            r0.mMuteAudio = r3
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void setPlayURLs(com.bykv.vk.component.ttvideo.model.LiveURL[] r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setPlayUrls, sdkParam:"
            r0.<init>(r1)
            r1 = 0
            r2 = r4[r1]
            java.lang.String r2 = r2.sdkParams
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r2, r0)
            java.lang.String r0 = "setPlayURLS"
            r3.checkMainLooper(r0)
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r3.mURLSource
            r0.setPlayURLs(r4)
            r3.mUrlSettingMethod = r1
            java.lang.String r4 = r3.mCurrentPlayURL
            if (r4 == 0) goto L39
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r4 = r3.mURLSource
            com.bykv.vk.component.ttvideo.model.LiveURL r4 = r4.getPlayLiveURL()
            java.lang.String r4 = r4.mainURL
            java.lang.String r0 = r3.mCurrentPlayURL
            if (r4 == r0) goto L39
            java.lang.String r4 = "setPlayURLs"
            r3._reset(r4)
        L39:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void setPlayerVolume(float r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.playerwrapper.PlayerSetting r0 = r1.mPlayerSetting
            r0.setPlayerVolume(r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService
            r0.mPlayerVolumeSetting = r2
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void setPreviewFlag(boolean r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService
            if (r0 == 0) goto L7
            r0.setPreviewFlag(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void setProjectKey(java.lang.String r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService
            r0.setProjectKey(r2)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void setStreamInfo(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setStreamInfo:"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r0)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r2.mLogService
            r0.mStreamData = r3
            java.lang.String r0 = "setStreamInfo"
            r2.checkMainLooper(r0)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L22
            r1.<init>(r3)     // Catch: org.json.JSONException -> L22
            goto L27
        L22:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            r1 = 0
        L27:
            if (r1 != 0) goto L2a
            return
        L2a:
            r2._reset(r0)
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r3 = r2.mURLSource
            com.bykv.vk.component.ttvideo.model.LiveStreamInfo r0 = new com.bykv.vk.component.ttvideo.model.LiveStreamInfo
            r0.<init>(r1)
            r3.setStreamInfo(r0)
            r3 = 1
            r2.mUrlSettingMethod = r3
            r2._setLooseSync()
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void setStringOption(int r6, java.lang.String r7) {
            r5 = this;
            r0 = 26
            r1 = 1
            java.lang.String r2 = ""
            if (r6 == r0) goto L185
            r0 = 43
            if (r6 == r0) goto L140
            r0 = 60
            if (r6 == r0) goto L104
            r0 = 81
            if (r6 == r0) goto Lec
            r0 = 86
            if (r6 == r0) goto Ld1
            r0 = 89
            if (r6 == r0) goto Lb9
            switch(r6) {
                case 63: goto Lb3;
                case 64: goto Lad;
                case 65: goto L95;
                case 66: goto L6b;
                default: goto L1e;
            }
        L1e:
            switch(r6) {
                case 72: goto L53;
                case 73: goto L3b;
                case 74: goto L23;
                default: goto L21;
            }
        L21:
            goto L1c4
        L23:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r0 = "set sr dsp module path:"
            r6.append(r0)
            r6.append(r7)
            java.lang.String r2 = r6.toString()
            r5.mTextureSRDspModuleName = r7
            goto L1c4
        L3b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r0 = "set sr ocl module path:"
            r6.append(r0)
            r6.append(r7)
            java.lang.String r2 = r6.toString()
            r5.mTextureSROclModuleName = r7
            goto L1c4
        L53:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r0 = "set sr kernal bin path:"
            r6.append(r0)
            r6.append(r7)
            java.lang.String r2 = r6.toString()
            r5.mTextureSRBinPath = r7
            goto L1c4
        L6b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r0 = "set transport protocol:"
            r6.append(r0)
            r6.append(r7)
            java.lang.String r2 = r6.toString()
            java.lang.String r6 = "tcp"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L8f
            java.lang.String r6 = "quic"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L91
        L8f:
            r5.mTransportProtocol = r7
        L91:
            r5.mQuicPull = r1
            goto L1c4
        L95:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r0 = " abr strategy:"
            r6.append(r0)
            r6.append(r7)
            java.lang.String r2 = r6.toString()
            r5.mAbrStrategy = r7
            goto L1c4
        Lad:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r6 = r5.mLogService
            r6.mEnterAction = r7
            goto L1c4
        Lb3:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r6 = r5.mLogService
            r6.mEnterMethod = r7
            goto L1c4
        Lb9:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r0 = "set_url_host:"
            r6.append(r0)
            r6.append(r7)
            java.lang.String r2 = r6.toString()
            r5.mURLHost = r7
            goto L1c4
        Ld1:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r0 = "switch resolution of cdn abr:"
            r6.append(r0)
            r6.append(r7)
            java.lang.String r2 = r6.toString()
            r5.mCdnAbrResolution = r7
            r5._requestSwitchUrlFromServer()
            goto L1c4
        Lec:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r0 = "toB module id:"
            r6.append(r0)
            r6.append(r7)
            java.lang.String r2 = r6.toString()
            r5.mMoudleIDToB = r7
            goto L1c4
        L104:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r0 = "set stream format:"
            r6.append(r0)
            r6.append(r7)
            java.lang.String r2 = r6.toString()
            r5.mStreamFormat = r7
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r6 = r5.mLogService
            r6.setFormatInfo(r7, r7)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r6 = r5.mPlayer
            if (r6 == 0) goto L1c4
            java.lang.String r6 = r5.mStreamFormat
            java.lang.String r0 = "avph"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L137
            java.lang.String r6 = r5.mStreamFormat
            java.lang.String r0 = "cmaf"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L1c4
        L137:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r6 = r5.mPlayer
            r0 = 315(0x13b, float:4.41E-43)
            r6.setStringOption(r0, r7)
            goto L1c4
        L140:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r0 = "set resolution:"
            r6.append(r0)
            r6.append(r7)
            java.lang.String r2 = r6.toString()
            r5.saveCurrentResolution()
            r5.mResolution = r7
            com.bykv.vk.component.ttvideo.player.MediaPlayer r6 = r5.mPlayer
            if (r6 == 0) goto L1c4
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r6 = r5.mURLSource
            if (r6 == 0) goto L1c4
            int r6 = r6.getSourceType()
            r7 = 2
            if (r6 != r7) goto L1c4
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r6 = r5.mURLSource
            java.lang.String r7 = r5.mResolution
            java.lang.String r0 = r5.mLevel
            long r6 = r6.getBitrate(r7, r0)
            r3 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L1c4
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r3 = 650(0x28a, float:9.11E-43)
            int r7 = (int) r6
            r0.setIntOption(r3, r7)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r6 = r5.mLogService
            r6.mUseExpectBitrate = r1
            goto L1c4
        L185:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r0 = "cacheFilePath:"
            r6.append(r0)
            r6.append(r7)
            java.lang.String r2 = r6.toString()
            r5.mCacheFilePath = r7
            com.bykv.vk.component.ttvideo.player.MediaPlayer r6 = r5.mPlayer
            if (r6 == 0) goto L1c4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            long r3 = java.lang.System.currentTimeMillis()
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            r5.mCacheFileKey = r6
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r5.mPlayer
            r3 = 17
            r0.setStringOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r6 = r5.mPlayer
            r0 = 14
            r6.setIntOption(r0, r1)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r6 = r5.mPlayer
            r6.setCacheFile(r7, r1)
        L1c4:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "setStringOption "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r7, r6)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void setSurface(android.view.Surface r5) {
            r4 = this;
            java.lang.String r0 = "setSurface"
            r4.checkMainLooper(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setsurface: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "VideoLiveManager"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r0)
            r4.mSurface = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r4.mPlayer
            if (r0 == 0) goto L38
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r4.mLogService
            long r1 = java.lang.System.currentTimeMillis()
            r0.mSetSurfaceTime = r1
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r4.mPlayer
            r0.setSurface(r5)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService
            long r0 = java.lang.System.currentTimeMillis()
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r4.mLogService
            long r2 = r2.mSetSurfaceTime
            long r0 = r0 - r2
            r5.mSetSurfaceCost = r0
        L38:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void setSurfaceHolder(android.view.SurfaceHolder r5) {
            r4 = this;
            java.lang.String r0 = "setSurfaceHolder"
            r4.checkMainLooper(r0)
            r4.mSurfaceHolder = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r4.mPlayer
            if (r0 == 0) goto L25
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r4.mLogService
            long r1 = java.lang.System.currentTimeMillis()
            r0.mSetSurfaceTime = r1
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r4.mPlayer
            r0.setDisplay(r5)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r5 = r4.mLogService
            long r0 = java.lang.System.currentTimeMillis()
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r2 = r4.mLogService
            long r2 = r2.mSetSurfaceTime
            long r0 = r0 - r2
            r5.mSetSurfaceCost = r0
        L25:
            return
    }

    public void setTextureRenderLogListener() {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void setVideoFormat(java.lang.String r1) {
            r0 = this;
            r0.mStreamFormat = r1
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void setVolume(float r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.playerwrapper.PlayerSetting r0 = r1.mPlayerSetting
            r0.setVolume(r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r1.mLogService
            r0.mVolumeSetting = r2
            return
    }

    public java.lang.String set_url_port_scheme(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = ".com"
            int r0 = r6.indexOf(r0)
            java.lang.String r1 = ".com:"
            int r1 = r6.indexOf(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            r3 = -1
            if (r7 == 0) goto L58
            if (r1 == r3) goto L39
            int r6 = r1 + 5
            int r1 = r1 + 6
        L1a:
            int r0 = r2.length()
            if (r1 >= r0) goto L35
            char r0 = r2.charAt(r1)
            int r0 = r0 + (-48)
            if (r0 < 0) goto L35
            char r0 = r2.charAt(r1)
            int r0 = r0 + (-48)
            r4 = 9
            if (r0 > r4) goto L35
            int r1 = r1 + 1
            goto L1a
        L35:
            r2.replace(r6, r1, r7)
            goto L58
        L39:
            if (r0 == r3) goto L58
            java.lang.String r1 = "vhost"
            int r6 = r6.indexOf(r1)
            if (r6 == r3) goto L45
            if (r6 <= r0) goto L58
        L45:
            int r0 = r0 + 4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = ":"
            r6.<init>(r1)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r2.insert(r0, r6)
        L58:
            java.lang.String r6 = r2.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "://"
            int r6 = r7.indexOf(r6)
            com.bykv.vk.component.ttvideo.model.LiveInfoSource r0 = r5.mURLSource
            int r0 = r0.getSourceType()
            r1 = 2
            if (r0 != r1) goto Lc3
            java.lang.String r0 = r5.mTransportProtocol
            java.lang.String r1 = "kcp"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L83
            if (r6 == r3) goto Lc3
            java.lang.String r0 = "httpk"
            r7.replace(r1, r6, r0)
            goto Lc3
        L83:
            java.lang.String r0 = r5.mTransportProtocol
            java.lang.String r2 = "quic"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lbc
            java.lang.String r0 = r5.mTransportProtocol
            java.lang.String r2 = "quicu"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L98
            goto Lbc
        L98:
            java.lang.String r0 = r5.mTransportProtocol
            java.lang.String r2 = "tls"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Laa
            if (r6 == r3) goto Lc3
            java.lang.String r0 = "https"
            r7.replace(r1, r6, r0)
            goto Lc3
        Laa:
            java.lang.String r0 = r5.mTransportProtocol
            java.lang.String r2 = "tcp"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lc3
            if (r6 == r3) goto Lc3
            java.lang.String r0 = "http"
            r7.replace(r1, r6, r0)
            goto Lc3
        Lbc:
            if (r6 == r3) goto Lc3
            java.lang.String r0 = "httpq"
            r7.replace(r1, r6, r0)
        Lc3:
            java.lang.String r6 = r7.toString()
            return r6
    }

    public void setupTextureRender() {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.ILivePlayer
    public void stop() {
            r4 = this;
            java.lang.String r0 = "VideoLiveManager"
            java.lang.String r1 = "stop"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r1)
            com.bykv.vk.component.ttvideo.ILiveListener r0 = r4.mListener
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "stop start -- "
            r2.<init>(r3)
            int r3 = r4.hashCode()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 4
            r0.onReportALog(r3, r2)
            r4.checkMainLooper(r1)
            r0 = 1
            r4._stop(r0, r1)
            com.bykv.vk.component.ttvideo.retry.RetryProcessor r0 = r4.mRetryProcessor
            r0.stop()
            com.bykv.vk.component.ttvideo.ILiveListener r0 = r4.mListener
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "stop end-- "
            r1.<init>(r2)
            int r2 = r4.hashCode()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.onReportALog(r3, r1)
            return
    }

    public void updateFrameTerminatedDTS(int r1, long r2, long r4) {
            r0 = this;
            r0.mFrameTerminatedDTS = r2
            return
    }
}
