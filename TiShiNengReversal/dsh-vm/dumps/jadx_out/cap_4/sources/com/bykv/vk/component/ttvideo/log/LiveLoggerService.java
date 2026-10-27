package com.bykv.vk.component.ttvideo.log;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LiveLoggerService implements android.os.Handler.Callback {
    private static final long INTERVAL = 60000;
    public static final java.lang.String LIVE_SDK_VERSION = "1.4.6.31-lite";
    private static final java.lang.String LOG_REPORT_VERSION = "5";
    public static final java.lang.String MONITOR_LOG_TYPE = "live_client_monitor_log";
    private static final int MSG_DNS = 104;
    private static final int MSG_LOG_SCHEDULE = 101;
    private static final int MSG_NTP_TIME_SYNC = 103;
    private static final int MSG_SESSION_SERIES_SCHEDULE = 102;
    private static final java.lang.String PRODUCT_LINE = "live";
    public static final java.lang.String RTC_MONITOR_LOG_TYPE = "live_webrtc_monitor_log";
    private static final long SESSION_TIME_SERIES_INTERVAL = 5000;
    private static final java.lang.String TAG = "com.bykv.vk.component.ttvideo.log.LiveLoggerService";
    private final int TYPE_DATA_LOST;
    private final int TYPE_DATA_REPEAT;
    private final int TYPE_SEI_INDEX_ROLLBACK;
    private final int TYPE_SEI_LOST;
    private final int TYPE_SEI_NOT_AVAIL;
    private final int VIDEO_DTS_QUEUE_MAX_SIZE;
    public int mABRListMatch;
    public java.lang.String mAbrStrategy;
    public long mAbrSwitchCost;
    public int mAbrSwitchCount;
    public java.lang.String mAbrSwitchCountInfo;
    public java.lang.String mAbrSwitchInfo;
    private java.util.ArrayList<java.lang.Long> mAudioBufferTimeSeries;
    private long mAudioDecodeStallTotalCount;
    private long mAudioDecodeStallTotalTime;
    private long mAudioDemuxStallTotalCount;
    private long mAudioDemuxStallTotalTime;
    private long mAudioRenderStallTotalCount;
    private long mAudioRenderStallTotalTime;
    public int mAudioTimescaleEnable;
    public java.lang.String mAutoUsingResolution;
    public int mBitRateAbnormalType;
    public float mCatchSpeed;
    public int mCdnAbrSwitchCode;
    private java.lang.String mCdnIp;
    private java.lang.String mCdnPlayURL;
    public int mCheckBufferingEndAdvanceEnable;
    public int mCheckBufferingEndIgnoreVideo;
    private java.lang.String mChipBoard;
    private java.lang.String mChipHardware;
    public java.lang.String mCodecName;
    public int mCodecNotSame;
    public java.lang.String mCodecType;
    private java.lang.String mCommonFlag;
    public float mContainerFps;
    private android.content.Context mContext;
    public long mCurAudioBufferTime;
    public long mCurDownloadSpeed;
    private java.lang.String mCurNetExtraInfo;
    private int mCurNetType;
    public long mCurVideoBufferTime;
    private java.lang.String mCurrentPlayURL;
    public int mDefaultCodecID;
    public int mDefaultResBitrate;
    public int mDisableVideoRender;
    public java.lang.String mDnsIp;
    private java.util.ArrayList<java.lang.Long> mDownloadSpeedTimeSeries;
    private boolean mEnableCheckSei;
    private boolean mEnableCheckSilenceInterval;
    public int mEnableFastOpenStream;
    public boolean mEnableHttpDns;
    public boolean mEnableHurry;
    public int mEnableLiveAbrCheckEnhance;
    public int mEnableLiveIOPlay;
    public int mEnableLowLatencyFLV;
    public int mEnableMdlProto;
    public int mEnableMiniSdp;
    public int mEnableNTP;
    public int mEnableNTPTask;
    public int mEnableOpenMDL;
    public int mEnableP2P;
    public int mEnableReportSessionStop;
    public boolean mEnableResolutionAutoDegrade;
    public int mEnableRtcPlay;
    public boolean mEnableSeiCheck;
    private boolean mEnableSharp;
    public int mEnableSplitStream;
    public int mEnableTcpFastOpen;
    public boolean mEnableUploadSessionSeries;
    public java.lang.String mEnterAction;
    public java.lang.String mEnterMethod;
    private int mErrorCode;
    private long mErrorRecoverCount;
    private long mErrorRecoverTime;
    private long mErrorStartTime;
    private org.json.JSONObject mErrorTimeSeries;
    private java.lang.String mEvaluatorSymbol;
    private int mExpectedSeiCount;
    private int mExpectedUniqueSeiCount;
    public int mFCDNTranscodeMethod;
    public int mFallbackType;
    public int mFastOpenDuration;
    public long mFirstAudioPacketDTS;
    private long mFirstFramePrepareTime;
    private int mFirstFrameRetryCount;
    private long mFirstFrameTimestamp;
    public long mFirstFrameView;
    private long mFirstStallEndTime;
    private long mFirstStallStartTime;
    private android.os.Handler mHandler;
    public boolean mHardDecodeEnable;
    public boolean mHasAbrInfo;
    private boolean mHasFirstFrame;
    private boolean mHasNTP;
    private boolean mHasUsedSharpen;
    public boolean mHaveResetPlayer;
    public int mHeight;
    private boolean mHitNodeOptimizer;
    private java.net.InetAddress mHostAddr;
    public java.lang.String mHostNTPUrl;
    public int mHurryTime;
    private final long mInterval;
    private boolean mIpIsFromPlayerCore;
    public boolean mIsCdnAbrSwitch;
    private boolean mIsHitCache;
    private boolean mIsInErrorRecovering;
    public int mIsInMainLooper;
    private boolean mIsPreview;
    private boolean mIsRemoteSorted;
    private boolean mIsStalling;
    private long mLastCheckDTS;
    public long mLastDownloadSizeDelta;
    private int mLastIndex;
    public long mLastPrepareTime;
    public java.lang.String mLastResolution;
    private int mLastSeiIndex;
    private int mLastSentFrames;
    public long mLastTotalDownloadSize;
    private java.lang.String mLinkInfo;
    private com.bykv.vk.component.ttvideo.VideoLiveManager mLiveEngine;
    public java.lang.String mLiveIOErrorMsg;
    public int mLiveIOP2P;
    public int mLiveIOPlay;
    public java.lang.String mLiveIOVersion;
    private com.bykv.vk.component.ttvideo.log.LogBundle mLogBundle;
    private long mLogIndex;
    public long mLogTotalCount;
    private com.bykv.vk.component.ttvideo.ILiveListener mLogUploader;
    public java.lang.String mMDLVersion;
    public int mMaxCacheSeconds;
    public int mMediaCodecAsyncInit;
    public int mMuteAudio;
    private org.apache.commons.net.ntp.a mNTPClient;
    private final long mNTPInterval;
    private boolean mNTPRunning;
    private com.bykv.vk.component.ttvideo.log.LiveLoggerService.MyNTPTask mNTPTask;
    public int mNetworkTimeoutMs;
    public int mNoSyncCount;
    public int mNoSyncInfoLen;
    public java.lang.String mNoSyncInfoStr;
    public int mNoSyncPlayingCount;
    public int mNoSyncPlayingInfoLen;
    public java.lang.String mNoSyncPlayingInfoStr;
    public long mNoSyncPlayingPtsDuration;
    public long mNoSyncPlayingTimeDuration;
    public long mNoSyncPtsDuration;
    public long mNoSyncStartPts;
    public long mNoSyncStartTime;
    public long mNoSyncTimeDuration;
    private boolean mOpenNodeOptimizer;
    public java.util.List<java.lang.String> mOptimizeBackupIps;
    private java.lang.String mOriginUrl;
    public int mP2PLoaderType;
    private java.lang.String mPlayerVersion;
    public float mPlayerVolumeSetting;
    private int mPlayingAudioRenderStallCount;
    private int mPlayingAudioRenderStallTime;
    private int mPlayingStallCount;
    private long mPlayingStallStartTime;
    private int mPlayingStallTime;
    private int mPlayingVideoRenderStallCount;
    private int mPlayingVideoRenderStallTime;
    private int mPreconnect;
    public long mPreviousAudioPacketDTS;
    private java.lang.String mProjectKey;
    private java.lang.String mProtocol;
    private int mPushClientDefaultBitrate;
    private int mPushClientHardwareEncode;
    private int mPushClientHitNodeOptimize;
    private int mPushClientMaxBitrate;
    private int mPushClientMinBitrate;
    private java.lang.String mPushClientModel;
    private java.lang.String mPushClientOSVersion;
    private java.lang.String mPushClientPlatform;
    private java.lang.String mPushClientPushProtocal;
    private java.lang.String mPushClientQId;
    private java.lang.String mPushClientSDKVersion;
    private java.lang.String mPushClientStartTime;
    private int mQuicFlag;
    public int mQuicMtu;
    public int mQuicPadHello;
    public int mQuicScfgConfig;
    public int mQuicTimerVersion;
    private int mReceivedSeiCount;
    private int mReceivedUniqueSeiCount;
    private int mRenderFailType;
    private java.util.ArrayList<java.lang.Long> mRenderFpsTimeSeries;
    public long mRenderStartNotifyTimeStamp;
    public java.util.Map<java.lang.String, java.lang.String> mRequestHeaders;
    public java.lang.String mRequestUrl;
    public long mResBitrate;
    public java.lang.String mResolution;
    private int mRetryCount;
    private int mRetryTotalCount;
    public long mRtcDnsTimeStamp;
    public int mRtcPlayFallBack;
    public java.lang.String mRtcPlayStopStatInfo;
    private long mRtcPlayingLogInterval;
    public java.lang.String mRtcSessionId;
    public long mRtcTcpConnectTimeStamp;
    public long mRtcTcpFirstPackageTimeStamp;
    public long mRtcTlsHandshakedTimeStamp;
    public int mRtcUseSdkDns;
    public java.lang.String mRuleIds;
    public boolean mSRSuccess;
    private java.lang.String mSdkParams;
    private java.util.ArrayList<java.lang.Integer> mSeiBitrateTimeSeries;
    private java.util.ArrayList<java.lang.Integer> mSeiFpsTimeSeries;
    private boolean mSeiHasBitrateAndFps;
    private long mSessionAudioRenderStallTotalCount;
    private long mSessionAudioRenderStallTotalTime;
    public long mSessionAudioRenderStartTime;
    private int mSessionErrorCode;
    private java.lang.String mSessionErrorMsg;
    private long mSessionFirstStallEndTime;
    private long mSessionFirstStallStartTime;
    public boolean mSessionHasFirstFrame;
    public java.lang.String mSessionId;
    public com.bykv.vk.component.ttvideo.log.LogBundle mSessionLogBundle;
    private int mSessionNum;
    private int mSessionRenderFailType;
    private long mSessionStallTotalCount;
    private long mSessionStallTotalTime;
    public long mSessionStartTime;
    private long mSessionVideoRenderStallTotalCount;
    private long mSessionVideoRenderStallTotalTime;
    public long mSessionVideoRenderStartTime;
    public long mSetSurfaceCost;
    public long mSetSurfaceTime;
    public java.lang.String mSettingsInfo;
    public int mSilenceDetectedCount;
    public int mSlowPlayTime;
    public float mSlowSpeed;
    public int mSpeedSwitchCount;
    public java.lang.String mSpeedSwitchInfo;
    public int mStallCountThresOfResolutionDegrade;
    private long mStallReason;
    public long mStallRetryTimeInterval;
    private long mStallStartTime;
    private java.util.ArrayList<java.lang.Long> mStallTimeSeries;
    private long mStallTotalCount;
    private long mStallTotalTime;
    public int mStartDirectAfterPrepared;
    public long mStartPlayBufferThres;
    private boolean mStarted;
    public java.lang.String mStreamData;
    private java.lang.String mStreamFormat;
    private java.lang.String mSuggestFormat;
    private java.lang.String mSuggestProtocol;
    public java.lang.String mTTNetNQEInfo;
    public int mTextureRenderError;
    public long mTextureRenderFirstFrameTime;
    public long mTimeDiff;
    public int mTslTimeShift;
    public java.lang.String mUrlAbility;
    public int mUseExpectBitrate;
    public int mUseLiveThreadPool;
    public boolean mUseTextureRender;
    public int mUsedP2P;
    private java.util.concurrent.LinkedBlockingQueue<java.lang.Long> mVideoDTSQueue;
    private long mVideoDecodeStallTotalCount;
    private long mVideoDecodeStallTotalTime;
    private long mVideoDemuxStallTotalCount;
    private long mVideoDemuxStallTotalTime;
    private long mVideoRenderStallTotalCount;
    private long mVideoRenderStallTotalTime;
    public float mVolumeSetting;
    public int mWidth;
    private long playerFromStartToRtsFrame;

    private static class MyNTPTask {
        private android.os.Handler mHandler;
        private android.os.HandlerThread mHandlerThread;


        public MyNTPTask(com.bykv.vk.component.ttvideo.log.LiveLoggerService r3) {
                r2 = this;
                r2.<init>()
                android.os.HandlerThread r0 = new android.os.HandlerThread
                java.lang.String r1 = "DnsHandlerThread"
                r0.<init>(r1)
                r2.mHandlerThread = r0
                r0.start()
                com.bykv.vk.component.ttvideo.log.LiveLoggerService$MyNTPTask$1 r0 = new com.bykv.vk.component.ttvideo.log.LiveLoggerService$MyNTPTask$1
                android.os.HandlerThread r1 = r2.mHandlerThread
                android.os.Looper r1 = r1.getLooper()
                r0.<init>(r2, r1, r3)
                r2.mHandler = r0
                return
        }

        static /* synthetic */ android.os.Handler access$000(com.bykv.vk.component.ttvideo.log.LiveLoggerService.MyNTPTask r0) {
                android.os.Handler r0 = r0.mHandler
                return r0
        }

        public void sendEmptyMessageDelayed(int r5, long r6) {
                r4 = this;
                android.os.HandlerThread r0 = r4.mHandlerThread
                if (r0 == 0) goto L16
                android.os.Handler r0 = r4.mHandler
                if (r0 != 0) goto L9
                goto L16
            L9:
                r1 = 0
                int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r3 != 0) goto L13
                r0.sendEmptyMessage(r5)
                return
            L13:
                r0.sendEmptyMessageDelayed(r5, r6)
            L16:
                return
        }
    }

    static {
            return
    }

    public LiveLoggerService(com.bykv.vk.component.ttvideo.VideoLiveManager r14, com.bykv.vk.component.ttvideo.ILiveListener r15, long r16, long r18, android.content.Context r20, int r21) {
            r13 = this;
            r13.<init>()
            r0 = 0
            r13.mStarted = r0
            java.lang.String r1 = "none"
            r13.mEnterMethod = r1
            r13.mEnterAction = r1
            r13.mCommonFlag = r1
            r13.mProjectKey = r1
            r13.mCdnPlayURL = r1
            r13.mCurrentPlayURL = r1
            r13.mCdnIp = r1
            r13.mIpIsFromPlayerCore = r0
            r13.mPlayerVersion = r1
            r13.mIsPreview = r0
            r2 = 0
            r13.mLogIndex = r2
            r13.mSdkParams = r1
            r13.mPushClientSDKVersion = r1
            r13.mPushClientPlatform = r1
            r13.mPushClientOSVersion = r1
            r13.mPushClientModel = r1
            r13.mPushClientStartTime = r1
            r4 = -1
            r13.mPushClientHardwareEncode = r4
            r13.mPushClientMinBitrate = r4
            r13.mPushClientMaxBitrate = r4
            r13.mPushClientDefaultBitrate = r4
            r13.mPushClientHitNodeOptimize = r4
            r13.mPushClientPushProtocal = r1
            r13.mPushClientQId = r1
            java.lang.String r5 = ""
            r13.mLinkInfo = r5
            r13.mOpenNodeOptimizer = r0
            r13.mEvaluatorSymbol = r1
            r13.mHitNodeOptimizer = r0
            r13.mIsRemoteSorted = r0
            r13.mIsHitCache = r0
            r13.mCodecType = r1
            r13.mHardDecodeEnable = r0
            r13.mCodecName = r1
            r13.mEnableHurry = r0
            r13.mHurryTime = r4
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r13.mCatchSpeed = r6
            r13.mSlowPlayTime = r4
            r13.mSlowSpeed = r6
            r13.mSpeedSwitchCount = r0
            r13.mSpeedSwitchInfo = r1
            r13.mStartPlayBufferThres = r2
            r13.mFastOpenDuration = r4
            r13.mCheckBufferingEndIgnoreVideo = r0
            r13.mStartDirectAfterPrepared = r0
            r13.mCheckBufferingEndAdvanceEnable = r0
            r13.mAudioTimescaleEnable = r4
            r13.mRuleIds = r1
            r13.mSessionId = r1
            java.lang.String r7 = "flv"
            r13.mStreamFormat = r7
            r13.mHasFirstFrame = r0
            r13.mFirstFrameTimestamp = r2
            r13.mLogTotalCount = r2
            r13.mErrorCode = r0
            r13.mRenderFailType = r0
            r13.mStallStartTime = r2
            r13.mPlayingStallStartTime = r2
            r7 = -1
            r13.mStallReason = r7
            r13.mStallTotalCount = r2
            r13.mStallTotalTime = r2
            r13.mVideoRenderStallTotalCount = r2
            r13.mVideoRenderStallTotalTime = r2
            r13.mAudioRenderStallTotalCount = r2
            r13.mAudioRenderStallTotalTime = r2
            r13.mIsStalling = r0
            r13.mPlayingStallCount = r0
            r13.mPlayingStallTime = r0
            r13.mPlayingVideoRenderStallCount = r0
            r13.mPlayingVideoRenderStallTime = r0
            r13.mPlayingAudioRenderStallCount = r0
            r13.mPlayingAudioRenderStallTime = r0
            r13.mFirstStallStartTime = r2
            r13.mFirstStallEndTime = r2
            r13.mRetryCount = r0
            r13.mRetryTotalCount = r0
            r13.mEnableCheckSilenceInterval = r0
            r13.mSilenceDetectedCount = r4
            r13.mEnableSharp = r0
            r13.mEnableCheckSei = r0
            r9 = 10000(0x2710, double:4.9407E-320)
            r13.mStallRetryTimeInterval = r9
            r13.mIsInErrorRecovering = r0
            r13.mErrorStartTime = r2
            r13.mErrorRecoverCount = r2
            r13.mErrorRecoverTime = r2
            r9 = 0
            r13.mNTPClient = r9
            r10 = 300000(0x493e0, double:1.482197E-318)
            r13.mNTPInterval = r10
            r13.mCurNetType = r4
            r13.mCurNetExtraInfo = r9
            r13.mNTPRunning = r0
            r13.mEnableNTP = r0
            r13.mEnableNTPTask = r0
            r13.mTimeDiff = r2
            r13.mEnableOpenMDL = r0
            r13.mEnableP2P = r0
            r13.mUsedP2P = r0
            r13.mEnableLiveIOPlay = r0
            r13.mP2PLoaderType = r4
            r13.mMDLVersion = r9
            r13.mEnableMdlProto = r0
            r13.mWidth = r0
            r13.mHeight = r0
            r13.mPreconnect = r4
            r13.mRenderFpsTimeSeries = r9
            r13.mDownloadSpeedTimeSeries = r9
            r13.mAudioBufferTimeSeries = r9
            r13.mStallTimeSeries = r9
            r13.mErrorTimeSeries = r9
            r13.mSeiBitrateTimeSeries = r9
            r13.mSeiFpsTimeSeries = r9
            r13.mSeiHasBitrateAndFps = r0
            r13.mEnableHttpDns = r0
            r13.mMediaCodecAsyncInit = r0
            r13.mDefaultCodecID = r4
            r13.mUrlAbility = r1
            r13.mEnableUploadSessionSeries = r0
            r13.mMaxCacheSeconds = r4
            r13.mEnableSplitStream = r0
            r13.mTslTimeShift = r4
            r13.mEnableSeiCheck = r0
            r13.mEnableFastOpenStream = r0
            r10 = 1
            r13.mIsInMainLooper = r10
            r13.mSetSurfaceCost = r2
            r13.mSetSurfaceTime = r2
            r13.mStreamData = r1
            r13.mTextureRenderError = r0
            r13.mSRSuccess = r0
            r13.mUseTextureRender = r0
            r13.mContainerFps = r6
            r13.mRenderStartNotifyTimeStamp = r2
            r13.mSuggestFormat = r1
            java.lang.String r11 = "tcp"
            r13.mProtocol = r11
            r13.mSuggestProtocol = r1
            r13.mQuicFlag = r4
            r13.mOriginUrl = r1
            java.lang.String r11 = android.os.Build.BOARD
            r13.mChipBoard = r11
            java.lang.String r11 = android.os.Build.HARDWARE
            r13.mChipHardware = r11
            r13.mSettingsInfo = r1
            r13.mTTNetNQEInfo = r1
            r13.mEnableResolutionAutoDegrade = r0
            java.lang.String r11 = "rad"
            r13.mAbrStrategy = r11
            r13.mHasAbrInfo = r0
            java.lang.String r11 = "origin"
            r13.mResolution = r11
            r13.mAutoUsingResolution = r11
            r13.mLastResolution = r1
            r13.mResBitrate = r7
            r13.mDefaultResBitrate = r4
            r13.mAbrSwitchCount = r0
            r13.mAbrSwitchCountInfo = r1
            r13.mCurDownloadSpeed = r7
            r13.mCurAudioBufferTime = r7
            r13.mCurVideoBufferTime = r7
            r13.mAbrSwitchCost = r7
            r13.mAbrSwitchInfo = r1
            r11 = 4
            r13.mStallCountThresOfResolutionDegrade = r11
            r13.mHaveResetPlayer = r0
            r13.mLastDownloadSizeDelta = r2
            r13.mLastTotalDownloadSize = r2
            r13.mFirstAudioPacketDTS = r7
            r13.mPreviousAudioPacketDTS = r7
            r13.mFirstFrameRetryCount = r0
            r13.mFirstFramePrepareTime = r2
            r13.mLastPrepareTime = r2
            r13.mNetworkTimeoutMs = r4
            r13.mQuicScfgConfig = r4
            r13.mQuicMtu = r4
            r13.mQuicPadHello = r4
            r13.mQuicTimerVersion = r4
            r13.mEnableTcpFastOpen = r0
            r13.mEnableLowLatencyFLV = r0
            r13.mOptimizeBackupIps = r9
            r13.TYPE_DATA_LOST = r0
            r13.TYPE_DATA_REPEAT = r10
            r12 = 2
            r13.TYPE_SEI_NOT_AVAIL = r12
            r12 = 3
            r13.TYPE_SEI_LOST = r12
            r13.TYPE_SEI_INDEX_ROLLBACK = r11
            r13.mVideoDTSQueue = r9
            r11 = 600(0x258, float:8.41E-43)
            r13.VIDEO_DTS_QUEUE_MAX_SIZE = r11
            r13.mLastIndex = r4
            r13.mLastSentFrames = r4
            r13.mLastCheckDTS = r7
            r13.mLastSeiIndex = r4
            r13.mExpectedSeiCount = r0
            r13.mReceivedSeiCount = r0
            r13.mExpectedUniqueSeiCount = r0
            r13.mReceivedUniqueSeiCount = r0
            r13.mEnableLiveAbrCheckEnhance = r0
            r13.mEnableRtcPlay = r0
            r13.mEnableMiniSdp = r0
            r13.mRtcPlayFallBack = r0
            r13.mDnsIp = r1
            r13.mRtcUseSdkDns = r4
            r13.mRtcDnsTimeStamp = r2
            r13.mRtcTcpConnectTimeStamp = r2
            r13.mRtcTlsHandshakedTimeStamp = r2
            r13.mRtcTcpFirstPackageTimeStamp = r2
            r13.mFallbackType = r0
            r13.mRtcSessionId = r1
            r13.mRtcPlayStopStatInfo = r1
            r13.mBitRateAbnormalType = r0
            r13.mCodecNotSame = r0
            r13.mABRListMatch = r10
            r13.mIsCdnAbrSwitch = r0
            r13.mCdnAbrSwitchCode = r4
            r13.mRequestUrl = r1
            r13.mRequestHeaders = r9
            r13.mDisableVideoRender = r0
            r13.mMuteAudio = r4
            r13.mVolumeSetting = r6
            r13.mPlayerVolumeSetting = r6
            r13.mUseExpectBitrate = r0
            r13.mFCDNTranscodeMethod = r4
            r13.mTextureRenderFirstFrameTime = r2
            r13.mEnableReportSessionStop = r0
            r13.mSessionHasFirstFrame = r0
            r13.mSessionStartTime = r2
            r13.mSessionVideoRenderStartTime = r2
            r13.mSessionAudioRenderStartTime = r2
            r13.mSessionNum = r0
            r13.mSessionStallTotalCount = r2
            r13.mSessionStallTotalTime = r2
            r13.mSessionVideoRenderStallTotalCount = r2
            r13.mSessionVideoRenderStallTotalTime = r2
            r13.mSessionAudioRenderStallTotalCount = r2
            r13.mSessionAudioRenderStallTotalTime = r2
            r13.mSessionFirstStallStartTime = r2
            r13.mSessionFirstStallEndTime = r2
            r13.mSessionRenderFailType = r4
            r13.mSessionErrorCode = r4
            r13.mSessionErrorMsg = r1
            r13.mVideoDecodeStallTotalCount = r2
            r13.mVideoDecodeStallTotalTime = r2
            r13.mAudioDecodeStallTotalCount = r2
            r13.mAudioDecodeStallTotalTime = r2
            r13.mVideoDemuxStallTotalCount = r2
            r13.mVideoDemuxStallTotalTime = r2
            r13.mAudioDemuxStallTotalCount = r2
            r13.mAudioDemuxStallTotalTime = r2
            r13.mLiveIOPlay = r0
            r13.mLiveIOP2P = r0
            r13.mLiveIOErrorMsg = r1
            r13.mFirstFrameView = r2
            r13.mLiveIOVersion = r1
            r13.mHasUsedSharpen = r0
            r13.mNoSyncStartTime = r2
            r13.mNoSyncStartPts = r2
            r13.mNoSyncCount = r0
            r13.mNoSyncPlayingCount = r0
            r13.mNoSyncTimeDuration = r2
            r13.mNoSyncPlayingTimeDuration = r2
            r13.mNoSyncPtsDuration = r2
            r13.mNoSyncPlayingPtsDuration = r2
            r1 = 4096(0x1000, float:5.74E-42)
            r13.mNoSyncInfoLen = r1
            r1 = 512(0x200, float:7.17E-43)
            r13.mNoSyncPlayingInfoLen = r1
            r13.mNoSyncInfoStr = r5
            r13.mNoSyncPlayingInfoStr = r5
            r4 = 5000(0x1388, double:2.4703E-320)
            r13.mRtcPlayingLogInterval = r4
            r13.mUseLiveThreadPool = r0
            r0 = r20
            r13.mContext = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r13)
            r13.mHandler = r0
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 > 0) goto L242
            r0 = 60000(0xea60, double:2.9644E-319)
            goto L244
        L242:
            r0 = r16
        L244:
            r13.mInterval = r0
            r13.mLogUploader = r15
            r13.mLiveEngine = r14
            com.bykv.vk.component.ttvideo.log.LogBundle r14 = new com.bykv.vk.component.ttvideo.log.LogBundle
            r14.<init>()
            r13.mLogBundle = r14
            r14 = r18
            r13.mStallRetryTimeInterval = r14
            java.lang.String r14 = com.bykv.vk.component.ttvideo.log.LiveLoggerService.TAG
            java.lang.String r15 = "enable report sessionstop: "
            java.lang.String r0 = java.lang.String.valueOf(r21)
            java.lang.String r15 = r15.concat(r0)
            com.bykv.vk.component.ttvideo.log.MyLog.i(r14, r15)
            r14 = r21
            if (r14 != r10) goto L26f
            com.bykv.vk.component.ttvideo.log.LogBundle r14 = new com.bykv.vk.component.ttvideo.log.LogBundle
            r14.<init>()
            r13.mSessionLogBundle = r14
        L26f:
            return
    }

    private org.json.JSONObject _createSessionTimeSeries() {
            r6 = this;
            r6.updateSessionSeries()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L54
            r0.<init>()     // Catch: org.json.JSONException -> L54
            java.lang.String r1 = "start_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r6.mLogBundle     // Catch: org.json.JSONException -> L54
            long r2 = r2.startPlayTime     // Catch: org.json.JSONException -> L54
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L54
            java.lang.String r1 = "duration"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L54
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r6.mLogBundle     // Catch: org.json.JSONException -> L54
            long r4 = r4.startPlayTime     // Catch: org.json.JSONException -> L54
            long r2 = r2 - r4
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L54
            java.lang.String r1 = "render_fps_series"
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L54
            java.util.ArrayList<java.lang.Long> r3 = r6.mRenderFpsTimeSeries     // Catch: org.json.JSONException -> L54
            r2.<init>(r3)     // Catch: org.json.JSONException -> L54
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L54
            java.lang.String r1 = "download_bitrate_series"
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L54
            java.util.ArrayList<java.lang.Long> r3 = r6.mDownloadSpeedTimeSeries     // Catch: org.json.JSONException -> L54
            r2.<init>(r3)     // Catch: org.json.JSONException -> L54
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L54
            java.lang.String r1 = "play_buffer_series"
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L54
            java.util.ArrayList<java.lang.Long> r3 = r6.mAudioBufferTimeSeries     // Catch: org.json.JSONException -> L54
            r2.<init>(r3)     // Catch: org.json.JSONException -> L54
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L54
            java.lang.String r1 = "push_bitrate_series"
            java.util.ArrayList<java.lang.Integer> r2 = r6.mSeiBitrateTimeSeries     // Catch: org.json.JSONException -> L54
            if (r2 != 0) goto L56
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L54
            r2.<init>()     // Catch: org.json.JSONException -> L54
            goto L5d
        L54:
            r0 = move-exception
            goto L9f
        L56:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L54
            java.util.ArrayList<java.lang.Integer> r3 = r6.mSeiBitrateTimeSeries     // Catch: org.json.JSONException -> L54
            r2.<init>(r3)     // Catch: org.json.JSONException -> L54
        L5d:
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L54
            java.lang.String r1 = "push_fps_series"
            java.util.ArrayList<java.lang.Integer> r2 = r6.mSeiFpsTimeSeries     // Catch: org.json.JSONException -> L54
            if (r2 != 0) goto L6d
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L54
            r2.<init>()     // Catch: org.json.JSONException -> L54
            goto L74
        L6d:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L54
            java.util.ArrayList<java.lang.Integer> r3 = r6.mSeiFpsTimeSeries     // Catch: org.json.JSONException -> L54
            r2.<init>(r3)     // Catch: org.json.JSONException -> L54
        L74:
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L54
            java.lang.String r1 = "stall_series"
            java.util.ArrayList<java.lang.Long> r2 = r6.mStallTimeSeries     // Catch: org.json.JSONException -> L54
            if (r2 != 0) goto L84
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L54
            r2.<init>()     // Catch: org.json.JSONException -> L54
            goto L8b
        L84:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L54
            java.util.ArrayList<java.lang.Long> r3 = r6.mStallTimeSeries     // Catch: org.json.JSONException -> L54
            r2.<init>(r3)     // Catch: org.json.JSONException -> L54
        L8b:
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L54
            java.lang.String r1 = "error_series"
            org.json.JSONObject r2 = r6.mErrorTimeSeries     // Catch: org.json.JSONException -> L54
            if (r2 != 0) goto L9a
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L54
            r2.<init>()     // Catch: org.json.JSONException -> L54
        L9a:
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L54
            return r0
        L9f:
            com.bytedance.sdk.component.utils.vl.j(r0)
            r0 = 0
            return r0
    }

    static /* synthetic */ int access$100(com.bykv.vk.component.ttvideo.log.LiveLoggerService r0) {
            int r0 = r0.mCurNetType
            return r0
    }

    static /* synthetic */ boolean access$200(com.bykv.vk.component.ttvideo.log.LiveLoggerService r0) {
            boolean r0 = r0.isNetWorkChanged()
            return r0
    }

    static /* synthetic */ java.net.InetAddress access$300(com.bykv.vk.component.ttvideo.log.LiveLoggerService r0) {
            java.net.InetAddress r0 = r0.mHostAddr
            return r0
    }

    static /* synthetic */ java.net.InetAddress access$302(com.bykv.vk.component.ttvideo.log.LiveLoggerService r0, java.net.InetAddress r1) {
            r0.mHostAddr = r1
            return r1
    }

    static /* synthetic */ void access$400(com.bykv.vk.component.ttvideo.log.LiveLoggerService r0) {
            r0.ntp()
            return
    }

    static /* synthetic */ boolean access$500(com.bykv.vk.component.ttvideo.log.LiveLoggerService r0) {
            boolean r0 = r0.mNTPRunning
            return r0
    }

    private void checkSeiIndex(int r5) {
            r4 = this;
            int r0 = r4.mReceivedSeiCount
            r1 = 1
            int r0 = r0 + r1
            r4.mReceivedSeiCount = r0
            int r0 = r4.mExpectedSeiCount
            int r0 = r0 + r1
            r4.mExpectedSeiCount = r0
            int r0 = r4.mLastSeiIndex
            if (r0 < 0) goto L46
            if (r5 > r0) goto L22
            r2 = 4
            r4.onStreamAbnormalSEI(r2, r5, r0)
            if (r5 != r1) goto L46
            int r0 = r4.mExpectedUniqueSeiCount
            int r0 = r0 + r1
            r4.mExpectedUniqueSeiCount = r0
            int r0 = r4.mReceivedUniqueSeiCount
            int r0 = r0 + r1
            r4.mReceivedUniqueSeiCount = r0
            goto L46
        L22:
            int r2 = r4.mExpectedUniqueSeiCount
            int r2 = r2 + r1
            r4.mExpectedUniqueSeiCount = r2
            int r2 = r4.mReceivedUniqueSeiCount
            int r2 = r2 + r1
            r4.mReceivedUniqueSeiCount = r2
            int r2 = r5 - r0
            if (r2 <= r1) goto L46
            r2 = 3
            r4.onStreamAbnormalSEI(r2, r5, r0)
            int r0 = r4.mExpectedSeiCount
            int r2 = r4.mLastSeiIndex
            int r3 = r5 - r2
            int r3 = r3 - r1
            int r0 = r0 + r3
            r4.mExpectedSeiCount = r0
            int r0 = r4.mExpectedUniqueSeiCount
            int r2 = r5 - r2
            int r2 = r2 - r1
            int r0 = r0 + r2
            r4.mExpectedUniqueSeiCount = r0
        L46:
            r4.mLastSeiIndex = r5
            return
    }

    private void checkVideoFrame(int r10, int r11, long r12) {
            r9 = this;
            if (r10 < 0) goto L9f
            if (r11 <= 0) goto L9f
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 >= 0) goto Lc
            goto L9f
        Lc:
            java.util.concurrent.LinkedBlockingQueue<java.lang.Long> r2 = r9.mVideoDTSQueue
            if (r2 != 0) goto L12
            goto L9f
        L12:
            int r3 = r9.mLastIndex
            r4 = -1
            if (r3 != r4) goto L1e
            r9.mLastIndex = r10
            r9.mLastSentFrames = r11
            r9.mLastCheckDTS = r12
            return
        L1e:
            if (r10 != r3) goto L22
            goto L9f
        L22:
            int r2 = r2.size()
            if (r2 <= 0) goto L35
            java.util.concurrent.LinkedBlockingQueue<java.lang.Long> r2 = r9.mVideoDTSQueue
            java.lang.Object r2 = r2.peek()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            goto L37
        L35:
            r2 = -1
        L37:
            r4 = 0
            r5 = 1
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 <= 0) goto L8c
            long r0 = r9.mLastCheckDTS
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 > 0) goto L8c
            r0 = 0
            r1 = 0
        L45:
            java.util.concurrent.LinkedBlockingQueue<java.lang.Long> r2 = r9.mVideoDTSQueue
            int r2 = r2.size()
            if (r2 <= 0) goto L7a
            java.util.concurrent.LinkedBlockingQueue<java.lang.Long> r2 = r9.mVideoDTSQueue
            java.lang.Object r2 = r2.peek()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r6 = r9.mLastCheckDTS
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 != 0) goto L60
            r0 = 1
        L60:
            if (r0 == 0) goto L6e
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L6e
            int r6 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r6 > 0) goto L6e
            int r1 = r1 + 1
            if (r6 == 0) goto L7a
        L6e:
            java.util.concurrent.LinkedBlockingQueue<java.lang.Long> r2 = r9.mVideoDTSQueue
            java.lang.Object r2 = r2.poll()
            java.lang.Long r2 = (java.lang.Long) r2
            r2.getClass()
            goto L45
        L7a:
            int r0 = r9.mLastIndex
            int r0 = r10 - r0
            if (r0 != r5) goto L8c
            if (r1 <= 0) goto L8c
            if (r1 == r11) goto L8c
            if (r1 >= r11) goto L88
            r0 = 0
            goto L89
        L88:
            r0 = 1
        L89:
            r9.onStreamAbnormalFrame(r0, r11, r1)
        L8c:
            int r0 = r9.mLastIndex
            int r1 = r10 - r0
            if (r1 == r5) goto L99
            if (r10 <= r0) goto L95
            goto L96
        L95:
            r4 = 1
        L96:
            r9.onStreamAbnormalSEI(r4, r10, r0)
        L99:
            r9.mLastIndex = r10
            r9.mLastSentFrames = r11
            r9.mLastCheckDTS = r12
        L9f:
            return
    }

    private org.json.JSONObject createFirstFrameLog(com.bykv.vk.component.ttvideo.log.LogBundle r5, long r6, boolean r8, long r9) throws org.json.JSONException {
            r4 = this;
            org.json.JSONObject r0 = r4.createCommonLog()
            if (r0 == 0) goto L220
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "first_frame"
            org.json.JSONObject r1 = r0.put(r1, r2)
            java.lang.String r2 = "last_retry_end"
            org.json.JSONObject r6 = r1.put(r2, r6)
            java.lang.String r7 = "hit_cache"
            org.json.JSONObject r6 = r6.put(r7, r8)
            java.lang.String r7 = "start"
            long r1 = r5.startPlayTime
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "sdk_dns_analysis_end"
            long r1 = r5.SDKDNSTimeStamp
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "prepare_block_end"
            long r1 = r5.callPrepareTime
            org.json.JSONObject r6 = r6.put(r7, r1)
            long r7 = r5.tfoFallBackTime
            r1 = 0
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 > 0) goto L3c
            long r7 = r5.playerDNSTimestamp
        L3c:
            java.lang.String r1 = "tfo_fall_back_time"
            org.json.JSONObject r6 = r6.put(r1, r7)
            java.lang.String r7 = "pre_connect"
            int r8 = r4.mPreconnect
            org.json.JSONObject r6 = r6.put(r7, r8)
            java.lang.String r7 = "http_req_finish_time"
            long r1 = r5.httpReqFinishTimestamp
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "http_res_finish_time"
            long r1 = r5.httpResFinishTimestamp
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "first_video_package_end"
            long r1 = r5.videoPacketTimestamp
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "first_audio_package_end"
            long r1 = r5.audioPacketTimestamp
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "first_video_frame_decode_end"
            long r1 = r5.videoDecodeTimestamp
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "first_audio_frame_decode_end"
            long r1 = r5.audioDecodeTimestamp
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "first_frame_from_player_core"
            long r1 = r5.videoRenderTimeForPlayerCore
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "first_frame_render_end"
            long r1 = r5.videoRenderTimestamp
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "video_param_send_outlet_time"
            long r1 = r5.videoParamSendOutletTime
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "first_video_frame_send_outlet_time"
            long r1 = r5.firstVideoFrameSendOutletTime
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "set_surface_time"
            long r1 = r4.mSetSurfaceTime
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "set_surface_cost"
            long r1 = r4.mSetSurfaceCost
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "video_render_type"
            int r8 = r5.renderType
            org.json.JSONObject r6 = r6.put(r7, r8)
            java.lang.String r7 = "video_device_open_start"
            long r1 = r5.videoDeviceOpenTime
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "video_device_open_end"
            long r1 = r5.videoDeviceOpenedTime
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "audio_device_open_start"
            long r1 = r5.audioDeviceOpenTime
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "audio_device_open_end"
            long r1 = r5.audioDeviceOpenedTime
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "video_device_wait_start"
            long r1 = r5.videoDeviceWaitStartTime
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "video_device_wait_end"
            long r1 = r5.videoDeviceWaitEndTime
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "find_stream_info_start"
            long r1 = r5.streamInfoFindTime
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "find_stream_info_end"
            long r1 = r5.streamInfoFoundTime
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "video_first_pkt_pos"
            long r1 = r5.videoFirstPacketPos
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "video_first_pkt_pts"
            long r1 = r5.videoFirstPacketPts
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "audio_first_pkt_pos"
            long r1 = r5.audioFirstPacketPos
            org.json.JSONObject r6 = r6.put(r7, r1)
            java.lang.String r7 = "audio_first_pkt_pts"
            long r1 = r5.audioFirstPacketPts
            org.json.JSONObject r6 = r6.put(r7, r1)
            com.bykv.vk.component.ttvideo.log.LogBundle r7 = r4.mLogBundle
            long r7 = r7.videoBufferTime
            java.lang.String r1 = "video_buffer_time"
            org.json.JSONObject r6 = r6.put(r1, r7)
            com.bykv.vk.component.ttvideo.log.LogBundle r7 = r4.mLogBundle
            long r7 = r7.audioBufferTime
            java.lang.String r1 = "audio_buffer_time"
            org.json.JSONObject r6 = r6.put(r1, r7)
            com.bykv.vk.component.ttvideo.log.LogBundle r7 = r4.mLogBundle
            long r7 = r7.downloadSpeed
            java.lang.String r1 = "download_speed"
            org.json.JSONObject r6 = r6.put(r1, r7)
            java.lang.String r7 = "stall_time"
            org.json.JSONObject r6 = r6.put(r7, r9)
            com.bykv.vk.component.ttvideo.log.LogBundle r7 = r4.mLogBundle
            long r7 = r7.delay
            java.lang.String r9 = "first_sei_delay"
            org.json.JSONObject r6 = r6.put(r9, r7)
            com.bykv.vk.component.ttvideo.log.LogBundle r7 = r4.mLogBundle
            java.lang.String r7 = r7.headerXServerIP
            java.lang.String r8 = "response_header_X-Server-IP"
            org.json.JSONObject r6 = r6.put(r8, r7)
            com.bykv.vk.component.ttvideo.log.LogBundle r7 = r4.mLogBundle
            java.lang.String r7 = r7.headerVia
            java.lang.String r8 = "response_header_Via"
            org.json.JSONObject r6 = r6.put(r8, r7)
            java.lang.String r7 = "prepare_end"
            long r8 = r5.prepareEndTimestamp
            org.json.JSONObject r6 = r6.put(r7, r8)
            java.lang.String r7 = "drop_audio_pts_diff"
            long r8 = r5.dropAudioPts
            org.json.JSONObject r6 = r6.put(r7, r8)
            java.lang.String r7 = "drop_audio_cost"
            long r8 = r5.dropAudioCostTime
            org.json.JSONObject r6 = r6.put(r7, r8)
            java.lang.String r7 = "enable_tcp_fast_open"
            int r8 = r4.mEnableTcpFastOpen
            org.json.JSONObject r6 = r6.put(r7, r8)
            java.lang.String r7 = "tfo_success"
            int r8 = r5.tfoSuccess
            org.json.JSONObject r6 = r6.put(r7, r8)
            java.lang.String r7 = "abr_check_enhance"
            int r8 = r4.mEnableLiveAbrCheckEnhance
            org.json.JSONObject r6 = r6.put(r7, r8)
            java.util.List<java.lang.String> r7 = r4.mOptimizeBackupIps
            if (r7 != 0) goto L18e
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>()
            goto L195
        L18e:
            org.json.JSONArray r7 = new org.json.JSONArray
            java.util.List<java.lang.String> r8 = r4.mOptimizeBackupIps
            r7.<init>(r8)
        L195:
            java.lang.String r8 = "optimize_backup_ips"
            org.json.JSONObject r6 = r6.put(r8, r7)
            java.lang.String r7 = "suggest_format"
            java.lang.String r8 = r4.mSuggestFormat
            org.json.JSONObject r6 = r6.put(r7, r8)
            java.lang.String r7 = "suggest_protocol"
            java.lang.String r8 = r4.mSuggestProtocol
            org.json.JSONObject r6 = r6.put(r7, r8)
            float r7 = r4.mContainerFps
            double r7 = (double) r7
            java.lang.String r9 = "container_fps"
            r6.put(r9, r7)
            boolean r6 = r4.isRtcPlayAvailable()
            java.lang.String r7 = "tcp_first_package_end"
            java.lang.String r8 = "tcp_connect_end"
            java.lang.String r9 = "player_dns_analysis_end"
            if (r6 == 0) goto L1f9
            long r1 = r4.mRtcDnsTimeStamp
            r0.put(r9, r1)
            java.lang.String r6 = "rtc_use_sdk_dns"
            int r9 = r4.mRtcUseSdkDns
            r0.put(r6, r9)
            long r9 = r4.mRtcTcpConnectTimeStamp
            r0.put(r8, r9)
            java.lang.String r6 = "rtc_tls_handshake_end"
            long r8 = r4.mRtcTlsHandshakedTimeStamp
            r0.put(r6, r8)
            long r8 = r4.mRtcTcpFirstPackageTimeStamp
            r0.put(r7, r8)
            java.lang.String r6 = "rtc_inited_end"
            long r7 = r5.rtcInitedTime
            r0.put(r6, r7)
            java.lang.String r6 = "rtc_offer_send_end"
            long r7 = r5.rtcOfferSendTime
            r0.put(r6, r7)
            java.lang.String r6 = "rtc_answer_recv_end"
            long r7 = r5.rtcAnswerRecvTime
            r0.put(r6, r7)
            java.lang.String r6 = "rtc_start_end"
            long r7 = r5.rtcStartTime
            r0.put(r6, r7)
            goto L215
        L1f9:
            long r1 = r5.playerDNSTimestamp
            r0.put(r9, r1)
            java.lang.String r6 = r4.mProtocol
            java.lang.String r9 = "kcp"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L20b
            long r9 = r5.playerDNSTimestamp
            goto L20d
        L20b:
            long r9 = r5.tcpConnectTimestamp
        L20d:
            r0.put(r8, r9)
            long r5 = r5.tcpFirstPacketTimestamp
            r0.put(r7, r5)
        L215:
            int r5 = r4.mAudioTimescaleEnable
            r6 = -1
            if (r5 == r6) goto L21f
            java.lang.String r6 = "audio_timescale_enable"
            r0.put(r6, r5)
        L21f:
            return r0
        L220:
            r5 = 0
            return r5
    }

    private org.json.JSONObject createPlayingLog(com.bykv.vk.component.ttvideo.log.LogBundle r17, long r18, long r20, long r22, long r24, boolean r26) throws org.json.JSONException {
            r16 = this;
            r0 = r16
            r1 = r17
            org.json.JSONObject r2 = r0.createCommonLog()
            if (r2 == 0) goto L178
            long r3 = r1.playTime
            long r3 = r3 - r22
            long r5 = r1.currentPosition
            long r5 = r5 - r24
            long r7 = r1.playedSize
            long r7 = r7 - r20
            r9 = 0
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 <= 0) goto L26
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L26
            r11 = 8
            long r7 = r7 * r11
            long r7 = r7 / r5
            goto L27
        L26:
            r7 = r9
        L27:
            long r5 = r0.mLogIndex
            r11 = 1
            long r5 = r5 + r11
            r0.mLogIndex = r5
            int r5 = r0.mPlayingStallCount
            int r6 = r0.mPlayingStallTime
            boolean r11 = r0.mIsStalling
            if (r11 == 0) goto L4e
            long r11 = r0.mPlayingStallStartTime
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 == 0) goto L4e
            int r5 = r5 + 1
            long r11 = (long) r6
            long r13 = java.lang.System.currentTimeMillis()
            long r9 = r0.mPlayingStallStartTime
            long r13 = r13 - r9
            long r11 = r11 + r13
            int r6 = (int) r11
            long r9 = java.lang.System.currentTimeMillis()
            r0.mPlayingStallStartTime = r9
        L4e:
            long r9 = r1.downloadSize
            long r11 = r0.mLastTotalDownloadSize
            long r11 = r11 + r9
            boolean r13 = r0.mHaveResetPlayer
            if (r13 != 0) goto L5a
            long r9 = r9 - r18
            goto L61
        L5a:
            long r13 = r0.mLastDownloadSizeDelta
            long r9 = r9 + r13
            r13 = 0
            r0.mLastDownloadSizeDelta = r13
        L61:
            r13 = 0
            r0.mHaveResetPlayer = r13
            java.lang.String r14 = "event_key"
            java.lang.String r15 = "playing"
            org.json.JSONObject r14 = r2.put(r14, r15)
            java.lang.String r15 = "download_size_delta"
            org.json.JSONObject r9 = r14.put(r15, r9)
            java.lang.String r10 = "download_size"
            org.json.JSONObject r9 = r9.put(r10, r11)
            java.lang.String r10 = "video_play_size"
            long r11 = r1.playedSize
            org.json.JSONObject r9 = r9.put(r10, r11)
            float r1 = r1.fps
            double r10 = (double) r1
            java.lang.String r1 = "render_fps"
            org.json.JSONObject r1 = r9.put(r1, r10)
            java.lang.String r9 = "video_rate"
            org.json.JSONObject r1 = r1.put(r9, r7)
            com.bykv.vk.component.ttvideo.log.LogBundle r7 = r0.mLogBundle
            long r7 = r7.downloadSpeed
            java.lang.String r9 = "download_speed"
            org.json.JSONObject r1 = r1.put(r9, r7)
            java.lang.String r7 = "play_time"
            org.json.JSONObject r1 = r1.put(r7, r3)
            java.lang.String r3 = "retry_count"
            int r4 = r0.mRetryCount
            org.json.JSONObject r1 = r1.put(r3, r4)
            java.lang.String r3 = "stall_count"
            org.json.JSONObject r1 = r1.put(r3, r5)
            java.lang.String r3 = "stall_time"
            org.json.JSONObject r1 = r1.put(r3, r6)
            java.lang.String r3 = "audio_render_stall_count"
            int r4 = r0.mPlayingAudioRenderStallCount
            org.json.JSONObject r1 = r1.put(r3, r4)
            java.lang.String r3 = "audio_render_stall_time"
            int r4 = r0.mPlayingAudioRenderStallTime
            org.json.JSONObject r1 = r1.put(r3, r4)
            java.lang.String r3 = "video_render_stall_count"
            int r4 = r0.mPlayingVideoRenderStallCount
            org.json.JSONObject r1 = r1.put(r3, r4)
            java.lang.String r3 = "video_render_stall_time"
            int r4 = r0.mPlayingVideoRenderStallTime
            org.json.JSONObject r1 = r1.put(r3, r4)
            java.lang.String r3 = "silence_detected_count"
            int r4 = r0.mSilenceDetectedCount
            org.json.JSONObject r1 = r1.put(r3, r4)
            java.lang.String r3 = "is_last"
            r4 = r26
            org.json.JSONObject r1 = r1.put(r3, r4)
            java.lang.String r3 = "index"
            long r4 = r0.mLogIndex
            org.json.JSONObject r1 = r1.put(r3, r4)
            java.lang.String r3 = "speed_switch_count"
            int r4 = r0.mSpeedSwitchCount
            org.json.JSONObject r1 = r1.put(r3, r4)
            java.lang.String r3 = "speed_switch_info"
            java.lang.String r4 = r0.mSpeedSwitchInfo
            org.json.JSONObject r1 = r1.put(r3, r4)
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r0.mLogBundle
            long r3 = r3.videoBufferTime
            java.lang.String r5 = "video_buffer_time"
            org.json.JSONObject r1 = r1.put(r5, r3)
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r0.mLogBundle
            long r3 = r3.audioBufferTime
            java.lang.String r5 = "audio_buffer_time"
            org.json.JSONObject r1 = r1.put(r5, r3)
            java.lang.String r3 = "enable_sei_check"
            boolean r4 = r0.mEnableSeiCheck
            org.json.JSONObject r1 = r1.put(r3, r4)
            java.lang.String r3 = "ntp_sync"
            boolean r4 = r0.mHasNTP
            org.json.JSONObject r1 = r1.put(r3, r4)
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r0.mLogBundle
            java.lang.String r3 = r3.rtcStatInfo
            java.lang.String r4 = "rtc_stat_info"
            org.json.JSONObject r1 = r1.put(r4, r3)
            java.lang.String r3 = "suggest_format"
            java.lang.String r4 = r0.mSuggestFormat
            org.json.JSONObject r1 = r1.put(r3, r4)
            java.lang.String r3 = "suggest_protocol"
            java.lang.String r4 = r0.mSuggestProtocol
            r1.put(r3, r4)
            int r1 = r0.mNoSyncPlayingCount
            if (r1 <= 0) goto L151
            java.lang.String r3 = "av_out_sync_count"
            org.json.JSONObject r1 = r2.put(r3, r1)
            java.lang.String r3 = "av_out_sync_duration"
            long r4 = r0.mNoSyncPlayingTimeDuration
            org.json.JSONObject r1 = r1.put(r3, r4)
            java.lang.String r3 = "av_out_sync_info"
            java.lang.String r4 = r0.mNoSyncPlayingInfoStr
            r1.put(r3, r4)
        L151:
            r0.mNoSyncPlayingCount = r13
            r3 = 0
            r0.mNoSyncPlayingTimeDuration = r3
            java.lang.String r1 = ""
            r0.mNoSyncPlayingInfoStr = r1
            r0.mRetryCount = r13
            r0.mPlayingStallCount = r13
            r0.mPlayingStallTime = r13
            r0.mPlayingAudioRenderStallCount = r13
            r0.mPlayingAudioRenderStallTime = r13
            r0.mPlayingVideoRenderStallCount = r13
            r0.mPlayingVideoRenderStallTime = r13
            r0.mSpeedSwitchCount = r13
            java.lang.String r1 = "none"
            r0.mSpeedSwitchInfo = r1
            boolean r1 = r0.mEnableCheckSilenceInterval
            if (r1 == 0) goto L174
            goto L175
        L174:
            r13 = -1
        L175:
            r0.mSilenceDetectedCount = r13
            return r2
        L178:
            r1 = 0
            return r1
    }

    private boolean isNetWorkChanged() {
            r3 = this;
            android.content.Context r0 = r3.mContext
            android.net.NetworkInfo r0 = com.bykv.vk.component.ttvideo.network.NetUtils.getNetworkInfo(r0)
            r1 = -1
            if (r0 == 0) goto L14
            boolean r2 = r0.isAvailable()
            if (r2 == 0) goto L14
            int r0 = r0.getType()
            goto L15
        L14:
            r0 = -1
        L15:
            if (r0 == r1) goto L1f
            int r1 = r3.mCurNetType
            if (r0 == r1) goto L1d
            r3.mCurNetType = r0
        L1d:
            r0 = 1
            return r0
        L1f:
            r0 = 0
            return r0
    }

    private void ntp() {
            r8 = this;
            org.apache.commons.net.ntp.a r0 = r8.mNTPClient
            if (r0 != 0) goto L5
            goto L1d
        L5:
            r1 = 0
            r0.i()     // Catch: java.io.IOException -> L14 java.net.SocketException -> L16
            java.net.InetAddress r0 = r8.mHostAddr     // Catch: java.io.IOException -> L14 java.net.SocketException -> L16
            if (r0 == 0) goto L1b
            org.apache.commons.net.ntp.a r2 = r8.mNTPClient     // Catch: java.io.IOException -> L14 java.net.SocketException -> L16
            org.apache.commons.net.ntp.e r1 = r2.p(r0)     // Catch: java.io.IOException -> L14 java.net.SocketException -> L16
            goto L1b
        L14:
            r0 = move-exception
            goto L18
        L16:
            r0 = move-exception
            goto L4f
        L18:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L1b:
            if (r1 != 0) goto L1e
        L1d:
            return
        L1e:
            org.apache.commons.net.ntp.d r0 = r1.f()
            org.apache.commons.net.ntp.TimeStamp r0 = r0.g()
            long r2 = r0.getTime()
            org.apache.commons.net.ntp.d r0 = r1.f()
            org.apache.commons.net.ntp.TimeStamp r0 = r0.t()
            long r4 = r0.getTime()
            org.apache.commons.net.ntp.d r0 = r1.f()
            org.apache.commons.net.ntp.TimeStamp r0 = r0.C()
            long r0 = r0.getTime()
            long r6 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            long r0 = r0 - r6
            long r4 = r4 + r0
            r0 = 2
            long r4 = r4 / r0
            r8.mTimeDiff = r4
            return
        L4f:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    private void onLink(boolean r5) {
            r4 = this;
            int r0 = r4.mEnableOpenMDL
            r1 = 1
            if (r0 != r1) goto L16
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r0 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.getDataLoader()
            if (r5 == 0) goto Le
            r1 = 8013(0x1f4d, float:1.1229E-41)
            goto L10
        Le:
            r1 = 8014(0x1f4e, float:1.123E-41)
        L10:
            java.lang.String r2 = r4.mSessionId
            r3 = -1
            r0.setInt64ValueByStrKey(r1, r2, r3)
        L16:
            org.json.JSONObject r0 = r4.createCommonLog()
            if (r0 == 0) goto L4a
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "link"
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L2b
            java.lang.String r2 = "info"
            if (r5 == 0) goto L2d
            java.lang.String r5 = "start"
            goto L2f
        L2b:
            r5 = move-exception
            goto L47
        L2d:
            java.lang.String r5 = "end"
        L2f:
            r1.put(r2, r5)     // Catch: org.json.JSONException -> L2b
            com.bykv.vk.component.ttvideo.ILiveListener r5 = r4.mLogUploader     // Catch: org.json.JSONException -> L2b
            java.lang.String r1 = "live_client_monitor_log"
            r5.onMonitorLog(r0, r1)     // Catch: org.json.JSONException -> L2b
            long r0 = r4.mLogTotalCount     // Catch: org.json.JSONException -> L2b
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L4a
            r2 = 1
            long r0 = r0 + r2
            r4.mLogTotalCount = r0     // Catch: org.json.JSONException -> L2b
            return
        L47:
            com.bytedance.sdk.component.utils.vl.j(r5)
        L4a:
            return
    }

    private void onStreamAbnormalFrame(int r5, int r6, int r7) {
            r4 = this;
            com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r4.mLiveEngine
            if (r0 != 0) goto L5
            goto L45
        L5:
            org.json.JSONObject r0 = r4.createCommonLog()
            if (r0 == 0) goto L45
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "stream_abnormal"
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L41
            java.lang.String r2 = "stream_type"
            java.lang.String r3 = "video"
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L41
            java.lang.String r2 = "type"
            org.json.JSONObject r5 = r1.put(r2, r5)     // Catch: org.json.JSONException -> L41
            java.lang.String r1 = "sent_frames"
            org.json.JSONObject r5 = r5.put(r1, r6)     // Catch: org.json.JSONException -> L41
            java.lang.String r6 = "received_frames"
            r5.put(r6, r7)     // Catch: org.json.JSONException -> L41
            com.bykv.vk.component.ttvideo.ILiveListener r5 = r4.mLogUploader     // Catch: org.json.JSONException -> L41
            java.lang.String r6 = "live_client_monitor_log"
            r5.onMonitorLog(r0, r6)     // Catch: org.json.JSONException -> L41
            long r5 = r4.mLogTotalCount     // Catch: org.json.JSONException -> L41
            r0 = 0
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 <= 0) goto L45
            r0 = 1
            long r5 = r5 + r0
            r4.mLogTotalCount = r5     // Catch: org.json.JSONException -> L41
            return
        L41:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
        L45:
            return
    }

    private void onStreamAbnormalSEI(int r5, int r6, int r7) {
            r4 = this;
            com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r4.mLiveEngine
            if (r0 != 0) goto L5
            goto L45
        L5:
            org.json.JSONObject r0 = r4.createCommonLog()
            if (r0 == 0) goto L45
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "stream_abnormal"
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L41
            java.lang.String r2 = "stream_type"
            java.lang.String r3 = "video"
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L41
            java.lang.String r2 = "type"
            org.json.JSONObject r5 = r1.put(r2, r5)     // Catch: org.json.JSONException -> L41
            java.lang.String r1 = "cur_index"
            org.json.JSONObject r5 = r5.put(r1, r6)     // Catch: org.json.JSONException -> L41
            java.lang.String r6 = "last_index"
            r5.put(r6, r7)     // Catch: org.json.JSONException -> L41
            com.bykv.vk.component.ttvideo.ILiveListener r5 = r4.mLogUploader     // Catch: org.json.JSONException -> L41
            java.lang.String r6 = "live_client_monitor_log"
            r5.onMonitorLog(r0, r6)     // Catch: org.json.JSONException -> L41
            long r5 = r4.mLogTotalCount     // Catch: org.json.JSONException -> L41
            r0 = 0
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 <= 0) goto L45
            r0 = 1
            long r5 = r5 + r0
            r4.mLogTotalCount = r5     // Catch: org.json.JSONException -> L41
            return
        L41:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
        L45:
            return
    }

    private void report(boolean r14) {
            r13 = this;
            com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r13.mLiveEngine
            if (r0 == 0) goto Lc
            com.bykv.vk.component.ttvideo.ILiveListener r1 = r13.mLogUploader
            if (r1 == 0) goto Lc
            com.bykv.vk.component.ttvideo.log.LogBundle r1 = r13.mLogBundle
            if (r1 != 0) goto Le
        Lc:
            r2 = r13
            goto L55
        Le:
            long r4 = r1.downloadSize     // Catch: org.json.JSONException -> L3a
            long r6 = r1.playedSize     // Catch: org.json.JSONException -> L3a
            long r8 = r1.playTime     // Catch: org.json.JSONException -> L3a
            long r10 = r1.currentPosition     // Catch: org.json.JSONException -> L3a
            r2 = 1
            r0.getLogInfo(r1, r2)     // Catch: org.json.JSONException -> L3a
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r13.mLogBundle     // Catch: org.json.JSONException -> L3a
            r2 = r13
            r12 = r14
            org.json.JSONObject r14 = r2.createPlayingLog(r3, r4, r6, r8, r10, r12)     // Catch: org.json.JSONException -> L37
            com.bykv.vk.component.ttvideo.ILiveListener r0 = r2.mLogUploader     // Catch: org.json.JSONException -> L37
            java.lang.String r1 = "live_client_monitor_log"
            r0.onMonitorLog(r14, r1)     // Catch: org.json.JSONException -> L37
            long r0 = r2.mLogTotalCount     // Catch: org.json.JSONException -> L37
            r3 = 0
            int r14 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r14 <= 0) goto L40
            r3 = 1
            long r0 = r0 + r3
            r2.mLogTotalCount = r0     // Catch: org.json.JSONException -> L37
            goto L40
        L37:
            r0 = move-exception
        L38:
            r14 = r0
            goto L3d
        L3a:
            r0 = move-exception
            r2 = r13
            goto L38
        L3d:
            com.bytedance.sdk.component.utils.vl.j(r14)
        L40:
            long r0 = r2.mInterval
            boolean r14 = r13.isRtcPlayAvailable()
            if (r14 == 0) goto L4a
            long r0 = r2.mRtcPlayingLogInterval
        L4a:
            boolean r14 = r2.mStarted
            if (r14 == 0) goto L55
            android.os.Handler r14 = r2.mHandler
            r3 = 101(0x65, float:1.42E-43)
            r14.sendEmptyMessageDelayed(r3, r0)
        L55:
            return
    }

    private void reportQuicOpenResult(org.json.JSONObject r3) throws org.json.JSONException {
            r2 = this;
            java.lang.String r0 = r2.mProtocol
            java.lang.String r1 = "quic"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L16
            java.lang.String r0 = r2.mProtocol
            java.lang.String r1 = "quicu"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L15
            goto L16
        L15:
            return
        L16:
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r2.mLogBundle
            int r0 = r0.quicOpenResult
            java.lang.String r1 = "quic_open_result"
            r3.put(r1, r0)
            java.lang.String r3 = com.bykv.vk.component.ttvideo.log.LiveLoggerService.TAG
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "quic_open_result = "
            r0.<init>(r1)
            com.bykv.vk.component.ttvideo.log.LogBundle r1 = r2.mLogBundle
            int r1 = r1.quicOpenResult
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r3, r0)
            return
    }

    private void reportUpdateSessionSeries() {
            r4 = this;
            r4.updateSessionSeries()
            java.lang.String r0 = "zdh"
            java.lang.String r1 = "update session series"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r1)
            boolean r0 = r4.mStarted
            if (r0 == 0) goto L17
            android.os.Handler r0 = r4.mHandler
            r1 = 102(0x66, float:1.43E-43)
            r2 = 5000(0x1388, double:2.4703E-320)
            r0.sendEmptyMessageDelayed(r1, r2)
        L17:
            return
    }

    private void resetSessionInfo() {
            r4 = this;
            int r0 = r4.mEnableReportSessionStop
            if (r0 == 0) goto L30
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r4.mSessionLogBundle
            if (r0 != 0) goto L9
            goto L30
        L9:
            r1 = 0
            r4.mSessionHasFirstFrame = r1
            r2 = 0
            r4.mSessionFirstStallStartTime = r2
            r4.mSessionFirstStallEndTime = r2
            r4.mSessionStallTotalCount = r2
            r4.mSessionStallTotalTime = r2
            r4.mSessionStartTime = r2
            r4.mSessionVideoRenderStartTime = r2
            r4.mSessionAudioRenderStartTime = r2
            r4.mSessionVideoRenderStallTotalCount = r2
            r4.mSessionVideoRenderStallTotalTime = r2
            r4.mSessionAudioRenderStallTotalCount = r2
            r4.mSessionAudioRenderStallTotalTime = r2
            r2 = -1
            r4.mSessionRenderFailType = r2
            r4.mSessionErrorCode = r1
            java.lang.String r1 = "none"
            r4.mSessionErrorMsg = r1
            r0.reset()
        L30:
            return
    }

    private void updateRequestTimeFieldInRtcPlay(org.json.JSONObject r5) {
            r4 = this;
            java.lang.String r0 = "event_message"
            boolean r1 = r5.has(r0)
            if (r1 == 0) goto Lf0
            java.lang.String r0 = r5.optString(r0)
            java.lang.String r1 = com.bykv.vk.component.ttvideo.log.LiveLoggerService.TAG
            java.lang.String r2 = "eventMessage:"
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r2 = r2.concat(r3)
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto Lf0
            java.lang.String r2 = "phase_timestamp"
            boolean r3 = r5.has(r2)
            if (r3 != 0) goto L2b
            goto Lf0
        L2b:
            java.lang.String r3 = "dns resolved"
            boolean r3 = android.text.TextUtils.equals(r3, r0)
            if (r3 == 0) goto L6e
            java.lang.String r0 = "request_ip"
            boolean r3 = r5.has(r0)
            if (r3 == 0) goto L50
            java.lang.String r0 = r5.optString(r0)
            java.lang.String r3 = r4.mDnsIp
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L4d
            r4.mCdnIp = r0
            r0 = 0
            r4.mRtcUseSdkDns = r0
            goto L50
        L4d:
            r0 = 1
            r4.mRtcUseSdkDns = r0
        L50:
            java.lang.String r5 = r5.optString(r2)
            long r2 = java.lang.Long.parseLong(r5)
            r4.mRtcDnsTimeStamp = r2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "mRtcDnsTimeStamp:"
            r5.<init>(r0)
            long r2 = r4.mRtcDnsTimeStamp
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r5)
            return
        L6e:
            java.lang.String r3 = "tcp connected"
            boolean r3 = android.text.TextUtils.equals(r3, r0)
            if (r3 != 0) goto Ld3
            java.lang.String r3 = "send request"
            boolean r3 = android.text.TextUtils.equals(r3, r0)
            if (r3 == 0) goto L7f
            goto Ld3
        L7f:
            java.lang.String r3 = "tls handshaked"
            boolean r3 = android.text.TextUtils.equals(r3, r0)
            if (r3 == 0) goto La5
            java.lang.String r5 = r5.optString(r2)
            long r2 = java.lang.Long.parseLong(r5)
            r4.mRtcTlsHandshakedTimeStamp = r2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "mRtcTlsHandshakedTimeStamp:"
            r5.<init>(r0)
            long r2 = r4.mRtcTlsHandshakedTimeStamp
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r5)
            return
        La5:
            java.lang.String r3 = "response received"
            boolean r3 = android.text.TextUtils.equals(r3, r0)
            if (r3 != 0) goto Lb5
            java.lang.String r3 = "remote answer got"
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 == 0) goto Lf0
        Lb5:
            java.lang.String r5 = r5.optString(r2)
            long r2 = java.lang.Long.parseLong(r5)
            r4.mRtcTcpFirstPackageTimeStamp = r2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "mRtcTcpFirstPackageTimeStamp:"
            r5.<init>(r0)
            long r2 = r4.mRtcTcpFirstPackageTimeStamp
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r5)
            return
        Ld3:
            java.lang.String r5 = r5.optString(r2)
            long r2 = java.lang.Long.parseLong(r5)
            r4.mRtcTcpConnectTimeStamp = r2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "mRtcTcpConnectTimeStamp:"
            r5.<init>(r0)
            long r2 = r4.mRtcTcpConnectTimeStamp
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r5)
        Lf0:
            return
    }

    private void updateSessionSeries() {
            r3 = this;
            com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r3.mLiveEngine
            if (r0 == 0) goto L82
            com.bykv.vk.component.ttvideo.ILiveListener r1 = r3.mLogUploader
            if (r1 == 0) goto L82
            com.bykv.vk.component.ttvideo.log.LogBundle r1 = r3.mLogBundle
            if (r1 != 0) goto Ld
            goto L82
        Ld:
            r2 = 3
            r0.getLogInfo(r1, r2)
            java.util.ArrayList<java.lang.Long> r0 = r3.mRenderFpsTimeSeries
            if (r0 != 0) goto L2a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mRenderFpsTimeSeries = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mAudioBufferTimeSeries = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mDownloadSpeedTimeSeries = r0
        L2a:
            java.util.ArrayList<java.lang.Long> r0 = r3.mRenderFpsTimeSeries
            com.bykv.vk.component.ttvideo.log.LogBundle r1 = r3.mLogBundle
            float r1 = r1.fps
            long r1 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.add(r1)
            java.util.ArrayList<java.lang.Long> r0 = r3.mAudioBufferTimeSeries
            com.bykv.vk.component.ttvideo.log.LogBundle r1 = r3.mLogBundle
            long r1 = r1.audioBufferTime
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.add(r1)
            java.util.ArrayList<java.lang.Long> r0 = r3.mDownloadSpeedTimeSeries
            com.bykv.vk.component.ttvideo.log.LogBundle r1 = r3.mLogBundle
            long r1 = r1.downloadSpeed
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.add(r1)
            boolean r0 = r3.mSeiHasBitrateAndFps
            if (r0 == 0) goto L82
            java.util.ArrayList<java.lang.Integer> r0 = r3.mSeiFpsTimeSeries
            if (r0 != 0) goto L68
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mSeiFpsTimeSeries = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mSeiBitrateTimeSeries = r0
        L68:
            java.util.ArrayList<java.lang.Integer> r0 = r3.mSeiFpsTimeSeries
            com.bykv.vk.component.ttvideo.log.LogBundle r1 = r3.mLogBundle
            int r1 = r1.seiFps
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.ArrayList<java.lang.Integer> r0 = r3.mSeiBitrateTimeSeries
            com.bykv.vk.component.ttvideo.log.LogBundle r1 = r3.mLogBundle
            int r1 = r1.seiBitrate
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
        L82:
            return
    }

    public void calculateRenderFailType() {
            r8 = this;
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r8.mLogBundle
            long r1 = r0.audioRenderTimestamp
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L14
            long r5 = r0.videoRenderTimestamp
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L14
            r0 = 0
            r8.mRenderFailType = r0
            return
        L14:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L22
            long r5 = r0.videoRenderTimestamp
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 > 0) goto L22
            r0 = 1
            r8.mRenderFailType = r0
            return
        L22:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L30
            long r0 = r0.videoRenderTimestamp
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L30
            r0 = 2
            r8.mRenderFailType = r0
            return
        L30:
            r0 = 3
            r8.mRenderFailType = r0
            return
    }

    public void calculateSessionRenderFailType() {
            r7 = this;
            long r0 = r7.mSessionAudioRenderStartTime
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L12
            long r4 = r7.mSessionVideoRenderStartTime
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L12
            r0 = 0
            r7.mSessionRenderFailType = r0
            return
        L12:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L20
            long r4 = r7.mSessionVideoRenderStartTime
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L20
            r0 = 1
            r7.mSessionRenderFailType = r0
            return
        L20:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L2e
            long r0 = r7.mSessionVideoRenderStartTime
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L2e
            r0 = 2
            r7.mSessionRenderFailType = r0
            return
        L2e:
            r0 = 3
            r7.mSessionRenderFailType = r0
            return
    }

    public void close(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.mStarted
            if (r0 == 0) goto L1a
            r0 = 0
            r3.mStarted = r0
            android.os.Handler r1 = r3.mHandler
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService$MyNTPTask r1 = r3.mNTPTask
            if (r1 == 0) goto L18
            android.os.Handler r1 = com.bykv.vk.component.ttvideo.log.LiveLoggerService.MyNTPTask.access$000(r1)
            r1.removeCallbacksAndMessages(r2)
        L18:
            r3.mNTPRunning = r0
        L1a:
            r3.resetStreamCheckParams()
            r3.onStop(r4)
            r3.reset()
            return
    }

    public org.json.JSONObject createCommonLog() {
            r9 = this;
            java.lang.String r0 = "is_too_large_av_diff"
            java.lang.String r1 = "0.00"
            com.bykv.vk.component.ttvideo.VideoLiveManager r2 = r9.mLiveEngine
            r2.getVideoCodecType()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L23e
            r2.<init>()     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "report_version"
            java.lang.String r4 = "5"
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "live_sdk_version"
            java.lang.String r4 = "1.4.6.31-lite"
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "product_line"
            java.lang.String r4 = "live"
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "client_timestamp"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "player_sdk_version"
            java.lang.String r4 = r9.mPlayerVersion     // Catch: org.json.JSONException -> L23e
            java.lang.String r5 = "-1"
            if (r4 != 0) goto L39
            r4 = r5
        L39:
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "project_key"
            java.lang.String r4 = r9.mProjectKey     // Catch: org.json.JSONException -> L23e
            if (r4 != 0) goto L44
            r4 = r5
        L44:
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "live_stream_enter_method"
            java.lang.String r4 = r9.mEnterMethod     // Catch: org.json.JSONException -> L23e
            java.lang.String r6 = "none"
            if (r4 != 0) goto L51
            r4 = r6
        L51:
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "live_stream_enter_action"
            java.lang.String r4 = r9.mEnterAction     // Catch: org.json.JSONException -> L23e
            if (r4 != 0) goto L5c
            r4 = r6
        L5c:
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "cdn_play_url"
            java.lang.String r4 = r9.mCdnPlayURL     // Catch: org.json.JSONException -> L23e
            if (r4 != 0) goto L67
            goto L68
        L67:
            r5 = r4
        L68:
            org.json.JSONObject r2 = r2.put(r3, r5)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "cdn_ip"
            java.lang.String r4 = r9.mCdnIp     // Catch: org.json.JSONException -> L23e
            if (r4 != 0) goto L73
            r4 = r6
        L73:
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "request_url"
            java.lang.String r4 = r9.mRequestUrl     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "ip_from_player_core"
            boolean r4 = r9.mIpIsFromPlayerCore     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "is_preview"
            boolean r4 = r9.mIsPreview     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "push_client_sdk_version"
            java.lang.String r4 = r9.mPushClientSDKVersion     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "push_client_platform"
            java.lang.String r4 = r9.mPushClientPlatform     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "push_client_os_version"
            java.lang.String r4 = r9.mPushClientOSVersion     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "push_client_model"
            java.lang.String r4 = r9.mPushClientModel     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "push_client_start_time"
            java.lang.String r4 = r9.mPushClientStartTime     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "push_client_is_hardware_encode"
            int r4 = r9.mPushClientHardwareEncode     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "push_client_min_bitrate"
            int r4 = r9.mPushClientMinBitrate     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "push_client_max_bitrate"
            int r4 = r9.mPushClientMaxBitrate     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "push_client_default_bitrate"
            int r4 = r9.mPushClientDefaultBitrate     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "push_client_push_protocol"
            java.lang.String r4 = r9.mPushClientPushProtocal     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "push_client_qid"
            java.lang.String r4 = r9.mPushClientQId     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "push_client_hit_node_optimize"
            int r4 = r9.mPushClientHitNodeOptimize     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "open_dns_optimizer"
            boolean r4 = r9.mOpenNodeOptimizer     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "hit_node_optimize"
            boolean r4 = r9.mHitNodeOptimizer     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "evaluator_symbol"
            java.lang.String r4 = r9.mEvaluatorSymbol     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "remote_sorted"
            boolean r4 = r9.mIsRemoteSorted     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "common_tag"
            java.lang.String r4 = r9.mCommonFlag     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "codec_type"
            java.lang.String r4 = r9.mCodecType     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "codec_name"
            java.lang.String r4 = r9.mCodecName     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "hardware_decode"
            boolean r4 = r9.mHardDecodeEnable     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "sharp"
            boolean r4 = r9.mEnableSharp     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "enable_hurry"
            boolean r4 = r9.mEnableHurry     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "hurry_time"
            int r4 = r9.mHurryTime     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "catch_speed"
            java.text.DecimalFormat r4 = new java.text.DecimalFormat     // Catch: org.json.JSONException -> L23e
            r4.<init>(r1)     // Catch: org.json.JSONException -> L23e
            float r5 = r9.mCatchSpeed     // Catch: org.json.JSONException -> L23e
            double r7 = (double) r5     // Catch: org.json.JSONException -> L23e
            java.lang.String r4 = r4.format(r7)     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "slow_play_time"
            int r4 = r9.mSlowPlayTime     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "slow_speed"
            java.text.DecimalFormat r4 = new java.text.DecimalFormat     // Catch: org.json.JSONException -> L23e
            r4.<init>(r1)     // Catch: org.json.JSONException -> L23e
            float r1 = r9.mSlowSpeed     // Catch: org.json.JSONException -> L23e
            double r7 = (double) r1     // Catch: org.json.JSONException -> L23e
            java.lang.String r1 = r4.format(r7)     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r2.put(r3, r1)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "first_screen"
            boolean r3 = r9.mHasFirstFrame     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "enable_httpDns"
            boolean r3 = r9.mEnableHttpDns     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "enable_ntp"
            int r3 = r9.mEnableNTP     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "enable_media_codec_async"
            int r3 = r9.mMediaCodecAsyncInit     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "default_codec_id"
            int r3 = r9.mDefaultCodecID     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "url_ability"
            java.lang.String r3 = r9.mUrlAbility     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "max_cache_seconds"
            int r3 = r9.mMaxCacheSeconds     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "enable_fast_open"
            int r3 = r9.mEnableFastOpenStream     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "enable_mdl"
            int r3 = r9.mEnableOpenMDL     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "enable_p2p"
            int r3 = r9.mEnableP2P     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "p2p_loader_type"
            int r3 = r9.mP2PLoaderType     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "used_p2p"
            int r3 = r9.mUsedP2P     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "mdl_version"
            java.lang.String r3 = r9.mMDLVersion     // Catch: org.json.JSONException -> L23e
            if (r3 != 0) goto L1da
            r3 = r6
        L1da:
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "enable_mdl_proto"
            int r3 = r9.mEnableMdlProto     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "enable_low_latency_flv"
            int r3 = r9.mEnableLowLatencyFLV     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "dns_ip"
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r9.mLogBundle     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = r3.dnsIP     // Catch: org.json.JSONException -> L23e
            if (r3 != 0) goto L1f7
            r3 = r6
        L1f7:
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "in_main_looper"
            int r3 = r9.mIsInMainLooper     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "start_play_buffer_threshold"
            long r3 = r9.mStartPlayBufferThres     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "fast_open_gop_cache"
            int r3 = r9.mFastOpenDuration     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "buffering_end_ignore_video"
            int r3 = r9.mCheckBufferingEndIgnoreVideo     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "start_direct_after_prepared"
            int r3 = r9.mStartDirectAfterPrepared     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "check_buffering_end_advance"
            int r3 = r9.mCheckBufferingEndAdvanceEnable     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "channel_id"
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r9.mLogBundle     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = r3.channelId     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "sei_delay"
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r9.mSessionLogBundle     // Catch: org.json.JSONException -> L23e
            if (r3 == 0) goto L241
        L23b:
            long r3 = r3.delay     // Catch: org.json.JSONException -> L23e
            goto L244
        L23e:
            r0 = move-exception
            goto L4a0
        L241:
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r9.mLogBundle     // Catch: org.json.JSONException -> L23e
            goto L23b
        L244:
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "sei_source"
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r9.mSessionLogBundle     // Catch: org.json.JSONException -> L23e
            if (r3 == 0) goto L251
        L24e:
            java.lang.String r3 = r3.seiSource     // Catch: org.json.JSONException -> L23e
            goto L254
        L251:
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r9.mLogBundle     // Catch: org.json.JSONException -> L23e
            goto L24e
        L254:
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "chip_board"
            java.lang.String r3 = r9.mChipBoard     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "chip_hardware"
            java.lang.String r3 = r9.mChipHardware     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "width"
            int r3 = r9.mWidth     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "height"
            int r3 = r9.mHeight     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "settings_info"
            java.lang.String r3 = r9.mSettingsInfo     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "ttnet_nqe_info"
            java.lang.String r3 = r9.mTTNetNQEInfo     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "play_format"
            java.lang.String r3 = r9.mStreamFormat     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "play_protocol"
            java.lang.String r3 = r9.mProtocol     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "url_set_method"
            com.bykv.vk.component.ttvideo.VideoLiveManager r3 = r9.mLiveEngine     // Catch: org.json.JSONException -> L23e
            int r3 = r3.getUrlSettingMethod()     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "enable_resolution_auto_degrade"
            boolean r3 = r9.mEnableResolutionAutoDegrade     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "has_abr_info"
            boolean r3 = r9.mHasAbrInfo     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "quic_load_succ"
            int r3 = r9.mQuicFlag     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "link_info"
            java.lang.String r3 = r9.mLinkInfo     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "used_texturerender"
            boolean r3 = r9.mUseTextureRender     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "settings_res"
            java.lang.String r3 = r9.mResolution     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r9.mLogBundle     // Catch: org.json.JSONException -> L23e
            int r2 = r2.isTooLargeAVDiff     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r0, r2)     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = "stall_retry_time_interval"
            long r3 = r9.mStallRetryTimeInterval     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L23e
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r9.mLogBundle     // Catch: org.json.JSONException -> L23e
            int r2 = r2.isTooLargeAVDiff     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r0 = r1.put(r0, r2)     // Catch: org.json.JSONException -> L23e
            java.lang.String r1 = "enable_rtc_play"
            int r2 = r9.mEnableRtcPlay     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L23e
            java.lang.String r1 = "enable_mini_sdp"
            int r2 = r9.mEnableMiniSdp     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L23e
            java.lang.String r1 = "rtc_play_fallback"
            int r2 = r9.mRtcPlayFallBack     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L23e
            java.lang.String r1 = "fallback_type"
            int r2 = r9.mFallbackType     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L23e
            java.lang.String r1 = "mute_audio"
            int r2 = r9.mMuteAudio     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L23e
            java.lang.String r1 = "volume_setting"
            float r2 = r9.mVolumeSetting     // Catch: org.json.JSONException -> L23e
            double r2 = (double) r2     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L23e
            java.lang.String r1 = "player_volume_setting"
            float r2 = r9.mPlayerVolumeSetting     // Catch: org.json.JSONException -> L23e
            double r2 = (double) r2     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L23e
            java.lang.String r1 = "enable_liveio_play"
            int r2 = r9.mEnableLiveIOPlay     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L23e
            java.lang.String r1 = "liveio_play"
            int r2 = r9.mLiveIOPlay     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L23e
            java.lang.String r1 = "liveio_p2p"
            int r2 = r9.mLiveIOP2P     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L23e
            int r1 = r9.mEnableLiveIOPlay     // Catch: org.json.JSONException -> L23e
            r2 = 1
            if (r1 != r2) goto L351
            java.lang.String r1 = "liveio_error_msg"
            java.lang.String r3 = r9.mLiveIOErrorMsg     // Catch: org.json.JSONException -> L23e
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r1 = "liveio_version"
            java.lang.String r3 = r9.mLiveIOVersion     // Catch: org.json.JSONException -> L23e
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L23e
        L351:
            boolean r1 = r9.isRtcPlayAvailable()     // Catch: org.json.JSONException -> L23e
            if (r1 == 0) goto L36d
            java.lang.String r1 = "rtc_get_width"
            com.bykv.vk.component.ttvideo.VideoLiveManager r3 = r9.mLiveEngine     // Catch: org.json.JSONException -> L23e
            int r3 = r3.getVideoWidth()     // Catch: org.json.JSONException -> L23e
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r1 = "rtc_get_height"
            com.bykv.vk.component.ttvideo.VideoLiveManager r3 = r9.mLiveEngine     // Catch: org.json.JSONException -> L23e
            int r3 = r3.getVideoHeight()     // Catch: org.json.JSONException -> L23e
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L23e
        L36d:
            java.lang.String r1 = r9.mRtcSessionId     // Catch: org.json.JSONException -> L23e
            boolean r1 = r1.equals(r6)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "live_stream_session_id"
            if (r1 != 0) goto L37d
            java.lang.String r1 = r9.mRtcSessionId     // Catch: org.json.JSONException -> L23e
            r0.put(r3, r1)     // Catch: org.json.JSONException -> L23e
            goto L382
        L37d:
            java.lang.String r1 = r9.mSessionId     // Catch: org.json.JSONException -> L23e
            r0.put(r3, r1)     // Catch: org.json.JSONException -> L23e
        L382:
            java.lang.String r1 = r9.mResolution     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "auto"
            boolean r1 = r1.equals(r3)     // Catch: org.json.JSONException -> L23e
            if (r1 == 0) goto L393
            java.lang.String r1 = "auto_res"
            java.lang.String r3 = r9.mAutoUsingResolution     // Catch: org.json.JSONException -> L23e
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L23e
        L393:
            com.bykv.vk.component.ttvideo.VideoLiveManager r1 = r9.mLiveEngine     // Catch: org.json.JSONException -> L23e
            int r1 = r1.getEnableTexturerender()     // Catch: org.json.JSONException -> L23e
            if (r1 != r2) goto L3a2
            java.lang.String r1 = "texturerender_error"
            int r3 = r9.mTextureRenderError     // Catch: org.json.JSONException -> L23e
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L23e
        L3a2:
            com.bykv.vk.component.ttvideo.VideoLiveManager r1 = r9.mLiveEngine     // Catch: org.json.JSONException -> L23e
            int r1 = r1.getEnableSR()     // Catch: org.json.JSONException -> L23e
            if (r1 != r2) goto L3db
            com.bykv.vk.component.ttvideo.VideoLiveManager r1 = r9.mLiveEngine     // Catch: org.json.JSONException -> L23e
            int r1 = r1.getEnableTexturerender()     // Catch: org.json.JSONException -> L23e
            if (r1 != r2) goto L3db
            com.bykv.vk.component.ttvideo.VideoLiveManager r1 = r9.mLiveEngine     // Catch: org.json.JSONException -> L23e
            boolean r1 = r1.isUsedSR()     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "sr_height"
            java.lang.String r4 = "sr_width"
            if (r1 == 0) goto L3d0
            int r1 = r9.mWidth     // Catch: org.json.JSONException -> L23e
            int r1 = r1 * 2
            org.json.JSONObject r1 = r0.put(r4, r1)     // Catch: org.json.JSONException -> L23e
            int r4 = r9.mHeight     // Catch: org.json.JSONException -> L23e
            int r4 = r4 * 2
            r1.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            r9.mSRSuccess = r2     // Catch: org.json.JSONException -> L23e
            goto L3db
        L3d0:
            int r1 = r9.mWidth     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r0.put(r4, r1)     // Catch: org.json.JSONException -> L23e
            int r4 = r9.mHeight     // Catch: org.json.JSONException -> L23e
            r1.put(r3, r4)     // Catch: org.json.JSONException -> L23e
        L3db:
            com.bykv.vk.component.ttvideo.VideoLiveManager r1 = r9.mLiveEngine     // Catch: org.json.JSONException -> L23e
            int r3 = r1.mEnableSharpen     // Catch: org.json.JSONException -> L23e
            if (r3 != r2) goto L3fe
            int r1 = r1.getEnableTexturerender()     // Catch: org.json.JSONException -> L23e
            if (r1 != r2) goto L3fe
            java.lang.String r1 = "used_sharpen"
            com.bykv.vk.component.ttvideo.VideoLiveManager r3 = r9.mLiveEngine     // Catch: org.json.JSONException -> L23e
            boolean r3 = r3.isUsedSharpen()     // Catch: org.json.JSONException -> L23e
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L23e
            boolean r1 = r9.mHasUsedSharpen     // Catch: org.json.JSONException -> L23e
            if (r1 != 0) goto L3fe
            com.bykv.vk.component.ttvideo.VideoLiveManager r1 = r9.mLiveEngine     // Catch: org.json.JSONException -> L23e
            boolean r1 = r1.isUsedSharpen()     // Catch: org.json.JSONException -> L23e
            r9.mHasUsedSharpen = r1     // Catch: org.json.JSONException -> L23e
        L3fe:
            boolean r1 = r9.mEnableResolutionAutoDegrade     // Catch: org.json.JSONException -> L23e
            if (r1 != 0) goto L406
            boolean r1 = r9.mHasAbrInfo     // Catch: org.json.JSONException -> L23e
            if (r1 == 0) goto L41f
        L406:
            if (r0 == 0) goto L41f
            java.lang.String r1 = "abr_strategy"
            java.lang.String r3 = r9.mAbrStrategy     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r0.put(r1, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "defualt_res_bitrate"
            int r4 = r9.mDefaultResBitrate     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "stall_count_rad"
            int r4 = r9.mStallCountThresOfResolutionDegrade     // Catch: org.json.JSONException -> L23e
            r1.put(r3, r4)     // Catch: org.json.JSONException -> L23e
        L41f:
            java.lang.String r1 = r9.mProtocol     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "quic"
            boolean r1 = android.text.TextUtils.equals(r1, r3)     // Catch: org.json.JSONException -> L23e
            if (r1 != 0) goto L433
            java.lang.String r1 = r9.mProtocol     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "quicu"
            boolean r1 = android.text.TextUtils.equals(r1, r3)     // Catch: org.json.JSONException -> L23e
            if (r1 == 0) goto L446
        L433:
            java.lang.String r1 = "quic_config_cached"
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r9.mLogBundle     // Catch: org.json.JSONException -> L23e
            int r3 = r3.quicConfigCached     // Catch: org.json.JSONException -> L23e
            org.json.JSONObject r1 = r0.put(r1, r3)     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = "quic_CHLO_count"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r9.mLogBundle     // Catch: org.json.JSONException -> L23e
            int r4 = r4.quicCHLOCount     // Catch: org.json.JSONException -> L23e
            r1.put(r3, r4)     // Catch: org.json.JSONException -> L23e
        L446:
            com.bykv.vk.component.ttvideo.VideoLiveManager r1 = r9.mLiveEngine     // Catch: org.json.JSONException -> L23e
            int r1 = r1.mEnableRadioLiveDisableRender     // Catch: org.json.JSONException -> L23e
            if (r1 != r2) goto L453
            java.lang.String r1 = "disable_video_render"
            int r2 = r9.mDisableVideoRender     // Catch: org.json.JSONException -> L23e
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L23e
        L453:
            int r1 = r9.mTslTimeShift     // Catch: org.json.JSONException -> L23e
            if (r1 <= 0) goto L45c
            java.lang.String r2 = "tsl_timeshift"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L23e
        L45c:
            java.util.Map<java.lang.String, java.lang.String> r1 = r9.mRequestHeaders     // Catch: org.json.JSONException -> L23e
            if (r1 == 0) goto L495
            java.util.Set r1 = r1.entrySet()     // Catch: org.json.JSONException -> L23e
            java.util.Iterator r1 = r1.iterator()     // Catch: org.json.JSONException -> L23e
        L468:
            boolean r2 = r1.hasNext()     // Catch: org.json.JSONException -> L23e
            if (r2 == 0) goto L495
            java.lang.Object r2 = r1.next()     // Catch: org.json.JSONException -> L23e
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: org.json.JSONException -> L23e
            java.lang.Object r3 = r2.getKey()     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> L23e
            java.lang.String r4 = "Host"
            boolean r3 = r3.equals(r4)     // Catch: org.json.JSONException -> L23e
            if (r3 == 0) goto L468
            java.lang.String r1 = "headers_host"
            java.lang.Object r2 = r2.getValue()     // Catch: org.json.JSONException -> L23e
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L23e
            java.lang.String r3 = " "
            java.lang.String r4 = ""
            java.lang.String r2 = r2.replace(r3, r4)     // Catch: org.json.JSONException -> L23e
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L23e
        L495:
            int r1 = r9.mFCDNTranscodeMethod     // Catch: org.json.JSONException -> L23e
            r2 = -1
            if (r1 == r2) goto L49f
            java.lang.String r2 = "fcdn_res_type"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L23e
        L49f:
            return r0
        L4a0:
            com.bytedance.sdk.component.utils.vl.j(r0)
            r0 = 0
            return r0
    }

    public void enableCheckSei() {
            r1 = this;
            r0 = 1
            r1.mEnableCheckSei = r0
            return
    }

    public void enableHardDecode(boolean r1) {
            r0 = this;
            r0.mHardDecodeEnable = r1
            return
    }

    public void enableSharp() {
            r1 = this;
            r0 = 1
            r1.mEnableSharp = r0
            return
    }

    public void feedVideoDTS(long r3) {
            r2 = this;
            java.util.concurrent.LinkedBlockingQueue<java.lang.Long> r0 = r2.mVideoDTSQueue
            if (r0 != 0) goto Ld
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 600(0x258, float:8.41E-43)
            r0.<init>(r1)
            r2.mVideoDTSQueue = r0
        Ld:
            java.util.concurrent.LinkedBlockingQueue<java.lang.Long> r0 = r2.mVideoDTSQueue
            int r0 = r0.remainingCapacity()
            if (r0 != 0) goto L22
            java.util.concurrent.LinkedBlockingQueue<java.lang.Long> r0 = r2.mVideoDTSQueue
            int r0 = r0.size()
            if (r0 <= 0) goto L22
            java.util.concurrent.LinkedBlockingQueue<java.lang.Long> r0 = r2.mVideoDTSQueue
            r0.poll()
        L22:
            java.util.concurrent.LinkedBlockingQueue<java.lang.Long> r0 = r2.mVideoDTSQueue
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.offer(r3)
            return
    }

    public void getABRStreamInfo() {
            r3 = this;
            com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r3.mLiveEngine
            if (r0 == 0) goto Le
            com.bykv.vk.component.ttvideo.log.LogBundle r1 = r3.mLogBundle
            if (r1 != 0) goto L9
            goto Le
        L9:
            r2 = 8
            r0.getLogInfo(r1, r2)
        Le:
            return
    }

    public void getAVPHStreamInfo() {
            r3 = this;
            com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r3.mLiveEngine
            if (r0 == 0) goto Le
            com.bykv.vk.component.ttvideo.log.LogBundle r1 = r3.mLogBundle
            if (r1 != 0) goto L9
            goto Le
        L9:
            r2 = 9
            r0.getLogInfo(r1, r2)
        Le:
            return
    }

    public long getInt64Value(int r3, long r4) {
            r2 = this;
            if (r3 == 0) goto Lc
            r0 = 100
            if (r3 == r0) goto L7
            return r4
        L7:
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r2.mLogBundle
            long r3 = r3.delay
            return r3
        Lc:
            int r0 = r2.mPushClientMaxBitrate
            r1 = -1
            if (r0 != r1) goto L1a
            com.bykv.vk.component.ttvideo.VideoLiveManager r1 = r2.mLiveEngine
            if (r1 == 0) goto L1a
            long r3 = r1.getIntOption(r3, r4)
            return r3
        L1a:
            long r3 = (long) r0
            return r3
    }

    public org.json.JSONObject getLiveInfoItems() {
            r7 = this;
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.ArrayList<java.lang.Long> r1 = r7.mDownloadSpeedTimeSeries
            if (r1 == 0) goto L40
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L40
            java.util.ArrayList<java.lang.Long> r1 = r7.mDownloadSpeedTimeSeries
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r1.next()
            java.lang.Long r2 = (java.lang.Long) r2
            long r3 = r0.longValue()
            long r5 = r2.longValue()
            long r3 = r3 + r5
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            goto L16
        L30:
            long r0 = r0.longValue()
            java.util.ArrayList<java.lang.Long> r2 = r7.mDownloadSpeedTimeSeries
            int r2 = r2.size()
            long r2 = (long) r2
            long r0 = r0 / r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L40:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4e
            r1.<init>()     // Catch: org.json.JSONException -> L4e
            java.lang.String r2 = "cdn_play_url"
            java.lang.String r3 = r7.mCdnPlayURL     // Catch: org.json.JSONException -> L4e
            if (r3 != 0) goto L50
            java.lang.String r3 = "-1"
            goto L50
        L4e:
            r0 = move-exception
            goto L67
        L50:
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L4e
            java.lang.String r2 = "cdn_ip"
            java.lang.String r3 = r7.mCdnIp     // Catch: org.json.JSONException -> L4e
            if (r3 != 0) goto L5c
            java.lang.String r3 = "none"
        L5c:
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L4e
            java.lang.String r2 = "pull_stream_bitrate"
            org.json.JSONObject r0 = r1.put(r2, r0)     // Catch: org.json.JSONException -> L4e
            return r0
        L67:
            com.bytedance.sdk.component.utils.vl.j(r0)
            r0 = 0
            return r0
    }

    public long getPlayingDownloadSize() {
            r2 = this;
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r2.mLogBundle
            long r0 = r0.downloadSize
            return r0
    }

    public int getRetryTotalCount() {
            r1 = this;
            int r0 = r1.mRetryTotalCount
            return r0
    }

    public int getStallTotalCount() {
            r2 = this;
            long r0 = r2.mStallTotalCount
            int r1 = (int) r0
            return r1
    }

    public org.json.JSONObject getStaticLog() {
            r9 = this;
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = new com.bykv.vk.component.ttvideo.log.LogBundle
            r0.<init>()
            com.bykv.vk.component.ttvideo.VideoLiveManager r1 = r9.mLiveEngine
            r2 = 1
            r1.getLogInfo(r0, r2)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lbf
            r1.<init>()     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "playing_time:"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> Lbf
            long r6 = r9.mFirstFrameTimestamp     // Catch: org.json.JSONException -> Lbf
            long r4 = r4 - r6
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "live_sdk_version:"
            java.lang.String r4 = "1.4.6.31-lite"
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "player_sdk_version:"
            java.lang.String r4 = r9.mPlayerVersion     // Catch: org.json.JSONException -> Lbf
            java.lang.String r5 = "-1"
            if (r4 != 0) goto L2e
            r4 = r5
        L2e:
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "cdn_ip:"
            java.lang.String r4 = r9.mCdnIp     // Catch: org.json.JSONException -> Lbf
            if (r4 != 0) goto L39
            goto L3a
        L39:
            r5 = r4
        L3a:
            org.json.JSONObject r1 = r1.put(r3, r5)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "push_client_sdk_version:"
            java.lang.String r4 = r9.mPushClientSDKVersion     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "push_client_platform:"
            java.lang.String r4 = r9.mPushClientPlatform     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "push_client_model:"
            java.lang.String r4 = r9.mPushClientModel     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "push_client_os_version:"
            java.lang.String r4 = r9.mPushClientOSVersion     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "push_client_is_hardware_encode:"
            int r4 = r9.mPushClientHardwareEncode     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "push_client_push_protocol:"
            java.lang.String r4 = r9.mPushClientPushProtocal     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "push_client_qid:"
            java.lang.String r4 = r9.mPushClientQId     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "push_client_bitrate:"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r9.mLogBundle     // Catch: org.json.JSONException -> Lbf
            int r4 = r4.seiBitrate     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "push_client_fps:"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r9.mLogBundle     // Catch: org.json.JSONException -> Lbf
            int r4 = r4.seiFps     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "Hit_Node_Optimizer:"
            boolean r4 = r9.mHitNodeOptimizer     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "Evaluator_Symbol:"
            java.lang.String r4 = r9.mEvaluatorSymbol     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "Is_Remote_Sorted:"
            boolean r4 = r9.mIsRemoteSorted     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "Stall_Total_Count:"
            long r4 = r9.mStallTotalCount     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "Stall_Total_Time:"
            long r4 = r9.mStallTotalTime     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "Stall_Reason:"
            long r4 = r9.mStallReason     // Catch: org.json.JSONException -> Lbf
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto Lc2
            java.lang.String r4 = "no stall"
            goto Lcd
        Lbf:
            r0 = move-exception
            goto L1c8
        Lc2:
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto Lcb
            java.lang.String r4 = "network stall"
            goto Lcd
        Lcb:
            java.lang.String r4 = "decode stall"
        Lcd:
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "audio_Render_Stall_Total_Count："
            long r4 = r9.mAudioRenderStallTotalCount     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "audio_Render_Stall_Total_Time："
            long r4 = r9.mAudioRenderStallTotalTime     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "video_Render_Stall_Total_Count："
            long r4 = r9.mVideoRenderStallTotalCount     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "video_Render_Stall_Total_Time："
            long r4 = r9.mVideoRenderStallTotalTime     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "first_frame_time:"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r9.mLogBundle     // Catch: org.json.JSONException -> Lbf
            long r5 = r4.videoRenderTimestamp     // Catch: org.json.JSONException -> Lbf
            long r7 = r4.startPlayTime     // Catch: org.json.JSONException -> Lbf
            long r5 = r5 - r7
            org.json.JSONObject r1 = r1.put(r3, r5)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "video_Buffer_Time:"
            long r4 = r0.videoBufferTime     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "audio_Buffer_Time:"
            long r4 = r0.audioBufferTime     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "delay:"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r9.mLogBundle     // Catch: org.json.JSONException -> Lbf
            long r4 = r4.delay     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "render_fps:"
            float r4 = r0.fps     // Catch: org.json.JSONException -> Lbf
            double r4 = (double) r4     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "sei_source:"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r9.mLogBundle     // Catch: org.json.JSONException -> Lbf
            java.lang.String r4 = r4.seiSource     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "download_Speed:"
            long r4 = r0.downloadSpeed     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "Error_Code:"
            int r4 = r9.mErrorCode     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "HardDecode:"
            boolean r4 = r9.mHardDecodeEnable     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "Codec_Type:"
            java.lang.String r4 = r9.mCodecType     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "Codec_Name:"
            java.lang.String r4 = r9.mCodecName     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "MDL_Vendor:"
            int r4 = r9.mUsedP2P     // Catch: org.json.JSONException -> Lbf
            if (r4 != r2) goto L15c
            java.lang.String r2 = "PCDN"
            goto L165
        L15c:
            int r4 = r9.mEnableOpenMDL     // Catch: org.json.JSONException -> Lbf
            if (r4 != r2) goto L163
            java.lang.String r2 = "Http-CDN"
            goto L165
        L163:
            java.lang.String r2 = "none"
        L165:
            org.json.JSONObject r1 = r1.put(r3, r2)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r2 = "audio_Buffer_Time_On_First_Frame:"
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r9.mLogBundle     // Catch: org.json.JSONException -> Lbf
            long r3 = r3.audioBufferTimeOnFirstFrame     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r2 = "waiting_Time_After_First_Frame:"
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r9.mLogBundle     // Catch: org.json.JSONException -> Lbf
            long r3 = r3.waitingTimeAfterFirstFrame     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r2 = "dns_ip:"
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r9.mLogBundle     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = r3.dnsIP     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r2 = "url:"
            java.lang.String r3 = r9.mCdnPlayURL     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r2 = "width:"
            int r3 = r9.mWidth     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r2 = "height:"
            int r3 = r9.mHeight     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r2 = "resolution:"
            java.lang.String r0 = r0.resolution     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r0 = r1.put(r2, r0)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r1 = "play_format:"
            java.lang.String r2 = r9.mStreamFormat     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r1 = "play_protocol:"
            java.lang.String r2 = r9.mProtocol     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r1 = "settings_res:"
            java.lang.String r2 = r9.mResolution     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r1 = "enable_resolution_auto_degrade:"
            boolean r2 = r9.mEnableResolutionAutoDegrade     // Catch: org.json.JSONException -> Lbf
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> Lbf
            return r0
        L1c8:
            com.bytedance.sdk.component.utils.vl.j(r0)
            r0 = 0
            return r0
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message r2) {
            r1 = this;
            int r2 = r2.what
            r0 = 101(0x65, float:1.42E-43)
            if (r0 != r2) goto La
            r0 = 0
            r1.report(r0)
        La:
            r0 = 102(0x66, float:1.43E-43)
            if (r0 != r2) goto L11
            r1.reportUpdateSessionSeries()
        L11:
            r2 = 1
            return r2
    }

    public boolean isInErrorRecovering() {
            r1 = this;
            boolean r0 = r1.mIsInErrorRecovering
            return r0
    }

    public boolean isPreview() {
            r1 = this;
            boolean r0 = r1.mIsPreview
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

    public boolean isStalling() {
            r1 = this;
            boolean r0 = r1.mIsStalling
            return r0
    }

    public void onAbrSwitch(long r4, java.lang.String r6, boolean r7) {
            r3 = this;
            com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r3.mLiveEngine
            if (r0 == 0) goto L7a
            com.bykv.vk.component.ttvideo.ILiveListener r0 = r3.mLogUploader
            if (r0 != 0) goto L9
            goto L7a
        L9:
            org.json.JSONObject r0 = r3.createCommonLog()     // Catch: org.json.JSONException -> L76
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "abr_switch"
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L76
            java.lang.String r2 = "auto_switch"
            org.json.JSONObject r7 = r1.put(r2, r7)     // Catch: org.json.JSONException -> L76
            java.lang.String r1 = "target_resoultion"
            org.json.JSONObject r6 = r7.put(r1, r6)     // Catch: org.json.JSONException -> L76
            java.lang.String r7 = "predict_bitrate"
            org.json.JSONObject r4 = r6.put(r7, r4)     // Catch: org.json.JSONException -> L76
            java.lang.String r5 = "abr_switch_info"
            java.lang.String r6 = r3.mAbrSwitchInfo     // Catch: org.json.JSONException -> L76
            org.json.JSONObject r4 = r4.put(r5, r6)     // Catch: org.json.JSONException -> L76
            java.lang.String r5 = "cur_download_speed"
            long r6 = r3.mCurDownloadSpeed     // Catch: org.json.JSONException -> L76
            org.json.JSONObject r4 = r4.put(r5, r6)     // Catch: org.json.JSONException -> L76
            java.lang.String r5 = "cur_audio_buffer_time"
            long r6 = r3.mCurAudioBufferTime     // Catch: org.json.JSONException -> L76
            org.json.JSONObject r4 = r4.put(r5, r6)     // Catch: org.json.JSONException -> L76
            java.lang.String r5 = "cur_video_buffer_time"
            long r6 = r3.mCurVideoBufferTime     // Catch: org.json.JSONException -> L76
            org.json.JSONObject r4 = r4.put(r5, r6)     // Catch: org.json.JSONException -> L76
            java.lang.String r5 = "stall_count"
            long r6 = r3.mStallTotalCount     // Catch: org.json.JSONException -> L76
            org.json.JSONObject r4 = r4.put(r5, r6)     // Catch: org.json.JSONException -> L76
            java.lang.String r5 = "switch_cost"
            long r6 = r3.mAbrSwitchCost     // Catch: org.json.JSONException -> L76
            org.json.JSONObject r4 = r4.put(r5, r6)     // Catch: org.json.JSONException -> L76
            java.lang.String r5 = "use_expect_bitrate"
            int r6 = r3.mUseExpectBitrate     // Catch: org.json.JSONException -> L76
            r4.put(r5, r6)     // Catch: org.json.JSONException -> L76
            r4 = 0
            r3.mUseExpectBitrate = r4     // Catch: org.json.JSONException -> L76
            com.bykv.vk.component.ttvideo.ILiveListener r4 = r3.mLogUploader     // Catch: org.json.JSONException -> L76
            java.lang.String r5 = "live_client_monitor_log"
            r4.onMonitorLog(r0, r5)     // Catch: org.json.JSONException -> L76
            long r4 = r3.mLogTotalCount     // Catch: org.json.JSONException -> L76
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L7a
            r6 = 1
            long r4 = r4 + r6
            r3.mLogTotalCount = r4     // Catch: org.json.JSONException -> L76
            return
        L76:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L7a:
            return
    }

    public void onAudioDTSRollback(long r5, long r7) {
            r4 = this;
            org.json.JSONObject r0 = r4.createCommonLog()
            if (r0 == 0) goto L42
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "timestamp_rollback"
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L3e
            java.lang.String r2 = "packet_type"
            java.lang.String r3 = "audio"
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L3e
            java.lang.String r2 = "timestamp_type"
            java.lang.String r3 = "dts"
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L3e
            java.lang.String r2 = "latest_ts"
            org.json.JSONObject r7 = r1.put(r2, r7)     // Catch: org.json.JSONException -> L3e
            java.lang.String r8 = "previous_ts"
            r7.put(r8, r5)     // Catch: org.json.JSONException -> L3e
            com.bykv.vk.component.ttvideo.ILiveListener r5 = r4.mLogUploader     // Catch: org.json.JSONException -> L3e
            java.lang.String r6 = "live_client_monitor_log"
            r5.onMonitorLog(r0, r6)     // Catch: org.json.JSONException -> L3e
            long r5 = r4.mLogTotalCount     // Catch: org.json.JSONException -> L3e
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L42
            r7 = 1
            long r5 = r5 + r7
            r4.mLogTotalCount = r5     // Catch: org.json.JSONException -> L3e
            return
        L3e:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
        L42:
            return
    }

    public void onAudioRenderStart(long r3) {
            r2 = this;
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r2.mLogBundle
            r0.audioRenderTimestamp = r3
            int r0 = r2.mEnableReportSessionStop
            r1 = 1
            if (r0 != r1) goto Lb
            r2.mSessionAudioRenderStartTime = r3
        Lb:
            return
    }

    public void onCallNotInMainThread(java.lang.String r5) {
            r4 = this;
            com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r4.mLiveEngine
            if (r0 == 0) goto L35
            com.bykv.vk.component.ttvideo.ILiveListener r0 = r4.mLogUploader
            if (r0 != 0) goto L9
            goto L35
        L9:
            org.json.JSONObject r0 = r4.createCommonLog()
            if (r0 == 0) goto L35
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "call_not_in_main_thread"
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L31
            java.lang.String r2 = "api_name"
            r1.put(r2, r5)     // Catch: org.json.JSONException -> L31
            com.bykv.vk.component.ttvideo.ILiveListener r5 = r4.mLogUploader     // Catch: org.json.JSONException -> L31
            java.lang.String r1 = "live_client_monitor_log"
            r5.onMonitorLog(r0, r1)     // Catch: org.json.JSONException -> L31
            long r0 = r4.mLogTotalCount     // Catch: org.json.JSONException -> L31
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L35
            r2 = 1
            long r0 = r0 + r2
            r4.mLogTotalCount = r0     // Catch: org.json.JSONException -> L31
            return
        L31:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
        L35:
            return
    }

    public void onCallPrepare() {
            r3 = this;
            boolean r0 = r3.mHasFirstFrame
            if (r0 == 0) goto L5
            goto L17
        L5:
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r3.mLogBundle
            long r1 = java.lang.System.currentTimeMillis()
            r0.callPrepareTime = r1
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r3.mSessionLogBundle
            if (r0 == 0) goto L17
            long r1 = java.lang.System.currentTimeMillis()
            r0.callPrepareTime = r1
        L17:
            return
    }

    public void onDecoderStall(long r5, int r7, boolean r8) {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r4.mLogBundle
            long r2 = r2.startPlayTime
            long r0 = r0 - r2
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L65
            long r0 = (long) r7
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 > 0) goto L13
            goto L65
        L13:
            r0 = 1
            if (r8 == 0) goto L22
            long r2 = r4.mVideoDecodeStallTotalCount
            long r2 = r2 + r0
            r4.mVideoDecodeStallTotalCount = r2
            long r2 = r4.mVideoDecodeStallTotalTime
            long r2 = r2 + r5
            r4.mVideoDecodeStallTotalTime = r2
            goto L2c
        L22:
            long r2 = r4.mAudioDecodeStallTotalCount
            long r2 = r2 + r0
            r4.mAudioDecodeStallTotalCount = r2
            long r2 = r4.mAudioDecodeStallTotalTime
            long r2 = r2 + r5
            r4.mAudioDecodeStallTotalTime = r2
        L2c:
            org.json.JSONObject r7 = r4.createCommonLog()
            if (r7 == 0) goto L64
            java.lang.String r2 = "event_key"
            java.lang.String r3 = "decode_stall"
            org.json.JSONObject r2 = r7.put(r2, r3)     // Catch: org.json.JSONException -> L41
            java.lang.String r3 = "type"
            if (r8 == 0) goto L43
            java.lang.String r8 = "video"
            goto L45
        L41:
            r5 = move-exception
            goto L61
        L43:
            java.lang.String r8 = "audio"
        L45:
            org.json.JSONObject r8 = r2.put(r3, r8)     // Catch: org.json.JSONException -> L41
            java.lang.String r2 = "decode_stall_time"
            r8.put(r2, r5)     // Catch: org.json.JSONException -> L41
            com.bykv.vk.component.ttvideo.ILiveListener r5 = r4.mLogUploader     // Catch: org.json.JSONException -> L41
            java.lang.String r6 = "live_client_monitor_log"
            r5.onMonitorLog(r7, r6)     // Catch: org.json.JSONException -> L41
            long r5 = r4.mLogTotalCount     // Catch: org.json.JSONException -> L41
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L64
            long r5 = r5 + r0
            r4.mLogTotalCount = r5     // Catch: org.json.JSONException -> L41
            return
        L61:
            com.bytedance.sdk.component.utils.vl.j(r5)
        L64:
            return
        L65:
            java.lang.String r7 = com.bykv.vk.component.ttvideo.log.LiveLoggerService.TAG
            java.lang.String r8 = "abnormal decode stall time"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r8.concat(r5)
            com.bykv.vk.component.ttvideo.log.MyLog.i(r7, r5)
            return
    }

    public void onDemuxerStall(long r5, int r7, boolean r8) {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r4.mLogBundle
            long r2 = r2.startPlayTime
            long r0 = r0 - r2
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L65
            long r0 = (long) r7
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 > 0) goto L13
            goto L65
        L13:
            r0 = 1
            if (r8 == 0) goto L22
            long r2 = r4.mVideoDemuxStallTotalCount
            long r2 = r2 + r0
            r4.mVideoDemuxStallTotalCount = r2
            long r2 = r4.mVideoDemuxStallTotalTime
            long r2 = r2 + r5
            r4.mVideoDemuxStallTotalTime = r2
            goto L2c
        L22:
            long r2 = r4.mAudioDemuxStallTotalCount
            long r2 = r2 + r0
            r4.mAudioDemuxStallTotalCount = r2
            long r2 = r4.mAudioDemuxStallTotalTime
            long r2 = r2 + r5
            r4.mAudioDemuxStallTotalTime = r2
        L2c:
            org.json.JSONObject r7 = r4.createCommonLog()
            if (r7 == 0) goto L64
            java.lang.String r2 = "event_key"
            java.lang.String r3 = "demux_stall"
            org.json.JSONObject r2 = r7.put(r2, r3)     // Catch: org.json.JSONException -> L41
            java.lang.String r3 = "type"
            if (r8 == 0) goto L43
            java.lang.String r8 = "video"
            goto L45
        L41:
            r5 = move-exception
            goto L61
        L43:
            java.lang.String r8 = "audio"
        L45:
            org.json.JSONObject r8 = r2.put(r3, r8)     // Catch: org.json.JSONException -> L41
            java.lang.String r2 = "demux_stall_time"
            r8.put(r2, r5)     // Catch: org.json.JSONException -> L41
            com.bykv.vk.component.ttvideo.ILiveListener r5 = r4.mLogUploader     // Catch: org.json.JSONException -> L41
            java.lang.String r6 = "live_client_monitor_log"
            r5.onMonitorLog(r7, r6)     // Catch: org.json.JSONException -> L41
            long r5 = r4.mLogTotalCount     // Catch: org.json.JSONException -> L41
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L64
            long r5 = r5 + r0
            r4.mLogTotalCount = r5     // Catch: org.json.JSONException -> L41
            return
        L61:
            com.bytedance.sdk.component.utils.vl.j(r5)
        L64:
            return
        L65:
            java.lang.String r7 = com.bykv.vk.component.ttvideo.log.LiveLoggerService.TAG
            java.lang.String r8 = "abnormal demux stall time"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r8.concat(r5)
            com.bykv.vk.component.ttvideo.log.MyLog.i(r7, r5)
            return
    }

    public void onError(int r6, java.lang.String r7) {
            r5 = this;
            org.json.JSONObject r0 = r5.mErrorTimeSeries
            if (r0 != 0) goto Lb
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r5.mErrorTimeSeries = r0
        Lb:
            org.json.JSONObject r0 = r5.mErrorTimeSeries     // Catch: org.json.JSONException -> L1e
            long r1 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L1e
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r5.mLogBundle     // Catch: org.json.JSONException -> L1e
            long r3 = r3.startPlayTime     // Catch: org.json.JSONException -> L1e
            long r1 = r1 - r3
            java.lang.String r1 = java.lang.Long.toString(r1)     // Catch: org.json.JSONException -> L1e
            r0.put(r1, r6)     // Catch: org.json.JSONException -> L1e
            goto L25
        L1e:
            r0 = move-exception
            r1 = 0
            r5.mErrorTimeSeries = r1
            com.bytedance.sdk.component.utils.vl.j(r0)
        L25:
            com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r5.mLiveEngine
            com.bykv.vk.component.ttvideo.log.LogBundle r1 = r5.mLogBundle
            r2 = 2
            r0.getLogInfo(r1, r2)
            org.json.JSONObject r0 = r5.createCommonLog()
            if (r0 == 0) goto L66
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "play_error"
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L5e
            java.lang.String r2 = "code"
            org.json.JSONObject r1 = r1.put(r2, r6)     // Catch: org.json.JSONException -> L5e
            java.lang.String r2 = "info"
            r1.put(r2, r7)     // Catch: org.json.JSONException -> L5e
            r5.reportQuicOpenResult(r0)     // Catch: org.json.JSONException -> L5e
            com.bykv.vk.component.ttvideo.ILiveListener r7 = r5.mLogUploader     // Catch: org.json.JSONException -> L5e
            java.lang.String r1 = "live_client_monitor_log"
            r7.onMonitorLog(r0, r1)     // Catch: org.json.JSONException -> L5e
            long r0 = r5.mLogTotalCount     // Catch: org.json.JSONException -> L5e
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L60
            r2 = 1
            long r0 = r0 + r2
            r5.mLogTotalCount = r0     // Catch: org.json.JSONException -> L5e
            goto L60
        L5e:
            r6 = move-exception
            goto L63
        L60:
            r5.mErrorCode = r6     // Catch: org.json.JSONException -> L5e
            goto L66
        L63:
            com.bytedance.sdk.component.utils.vl.j(r6)
        L66:
            return
    }

    public void onErrorRecovered() {
            r6 = this;
            r0 = 0
            r6.mIsInErrorRecovering = r0
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r6.mErrorStartTime
            long r0 = r0 - r2
            java.lang.String r2 = com.bykv.vk.component.ttvideo.log.LiveLoggerService.TAG
            java.lang.String r3 = "recover from error time "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r3.concat(r0)
            com.bytedance.sdk.component.utils.vl.j(r2, r0)
            long r0 = r6.mErrorStartTime
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L34
            long r0 = r6.mErrorRecoverCount
            r2 = 1
            long r0 = r0 + r2
            r6.mErrorRecoverCount = r0
            long r0 = r6.mErrorRecoverTime
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r6.mErrorStartTime
            long r2 = r2 - r4
            long r0 = r0 + r2
            r6.mErrorRecoverTime = r0
        L34:
            return
    }

    public void onFirstFrame(long r12, long r14) {
            r11 = this;
            java.lang.String r0 = "cmaf"
            r1 = 1
            r11.mHasFirstFrame = r1
            int r1 = r11.mRetryTotalCount
            r11.mFirstFrameRetryCount = r1
            long r1 = r11.mLastPrepareTime
            r11.mFirstFramePrepareTime = r1
            long r1 = java.lang.System.currentTimeMillis()
            r11.mFirstFrameTimestamp = r1
            com.bykv.vk.component.ttvideo.VideoLiveManager r1 = r11.mLiveEngine
            if (r1 == 0) goto L1f
            com.bykv.vk.component.ttvideo.ILiveListener r1 = r11.mLogUploader
            if (r1 == 0) goto L1f
            com.bykv.vk.component.ttvideo.log.LogBundle r1 = r11.mLogBundle
            if (r1 != 0) goto L22
        L1f:
            r4 = r11
            goto L148
        L22:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L141
            r1.playTime = r2     // Catch: org.json.JSONException -> L141
            com.bykv.vk.component.ttvideo.VideoLiveManager r1 = r11.mLiveEngine     // Catch: org.json.JSONException -> L141
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r11.mLogBundle     // Catch: org.json.JSONException -> L141
            r3 = 0
            r1.getLogInfo(r2, r3)     // Catch: org.json.JSONException -> L141
            com.bykv.vk.component.ttvideo.log.LogBundle r5 = r11.mLogBundle     // Catch: org.json.JSONException -> L141
            boolean r8 = r11.mIsHitCache     // Catch: org.json.JSONException -> L141
            r4 = r11
            r6 = r12
            r9 = r14
            org.json.JSONObject r12 = r4.createFirstFrameLog(r5, r6, r8, r9)     // Catch: org.json.JSONException -> L59
            long r13 = r4.mFirstFrameTimestamp     // Catch: org.json.JSONException -> L59
            com.bykv.vk.component.ttvideo.log.LogBundle r15 = r4.mLogBundle     // Catch: org.json.JSONException -> L59
            long r1 = r15.startPlayTime     // Catch: org.json.JSONException -> L59
            long r13 = r13 - r1
            r4.mFirstFrameView = r13     // Catch: org.json.JSONException -> L59
            java.lang.String r13 = r4.mStreamFormat     // Catch: org.json.JSONException -> L59
            if (r13 == 0) goto L11a
            boolean r13 = r13.equals(r0)     // Catch: org.json.JSONException -> L59
            if (r13 != 0) goto L5d
            java.lang.String r13 = r4.mStreamFormat     // Catch: org.json.JSONException -> L59
            java.lang.String r14 = "avph"
            boolean r13 = r13.equals(r14)     // Catch: org.json.JSONException -> L59
            if (r13 == 0) goto L11a
            goto L5d
        L59:
            r0 = move-exception
        L5a:
            r12 = r0
            goto L145
        L5d:
            java.lang.String r13 = "video_dns_analysis_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r14 = r4.mLogBundle     // Catch: org.json.JSONException -> L59
            long r14 = r14.videoDNSTimestamp     // Catch: org.json.JSONException -> L59
            org.json.JSONObject r13 = r12.put(r13, r14)     // Catch: org.json.JSONException -> L59
            java.lang.String r14 = "audio_dns_analysis_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r15 = r4.mLogBundle     // Catch: org.json.JSONException -> L59
            long r1 = r15.audioDNSTimestamp     // Catch: org.json.JSONException -> L59
            org.json.JSONObject r13 = r13.put(r14, r1)     // Catch: org.json.JSONException -> L59
            java.lang.String r14 = "video_tcp_connect_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r15 = r4.mLogBundle     // Catch: org.json.JSONException -> L59
            long r1 = r15.videoTcpConnectTimestamp     // Catch: org.json.JSONException -> L59
            org.json.JSONObject r13 = r13.put(r14, r1)     // Catch: org.json.JSONException -> L59
            java.lang.String r14 = "audio_tcp_connect_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r15 = r4.mLogBundle     // Catch: org.json.JSONException -> L59
            long r1 = r15.audioTcpConnectTimestamp     // Catch: org.json.JSONException -> L59
            org.json.JSONObject r13 = r13.put(r14, r1)     // Catch: org.json.JSONException -> L59
            java.lang.String r14 = "video_tcp_first_packet_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r15 = r4.mLogBundle     // Catch: org.json.JSONException -> L59
            long r1 = r15.videoTcpFirstPacketTimestamp     // Catch: org.json.JSONException -> L59
            org.json.JSONObject r13 = r13.put(r14, r1)     // Catch: org.json.JSONException -> L59
            java.lang.String r14 = "audio_tcp_first_packet_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r15 = r4.mLogBundle     // Catch: org.json.JSONException -> L59
            long r1 = r15.audioTcpFirstPacketTimestamp     // Catch: org.json.JSONException -> L59
            org.json.JSONObject r13 = r13.put(r14, r1)     // Catch: org.json.JSONException -> L59
            java.lang.String r14 = "video_http_req_finish_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r15 = r4.mLogBundle     // Catch: org.json.JSONException -> L59
            long r1 = r15.videoHttpReqFinishTimestamp     // Catch: org.json.JSONException -> L59
            org.json.JSONObject r13 = r13.put(r14, r1)     // Catch: org.json.JSONException -> L59
            java.lang.String r14 = "audio_http_req_finish_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r15 = r4.mLogBundle     // Catch: org.json.JSONException -> L59
            long r1 = r15.audioHttpReqFinishTimestamp     // Catch: org.json.JSONException -> L59
            org.json.JSONObject r13 = r13.put(r14, r1)     // Catch: org.json.JSONException -> L59
            java.lang.String r14 = "video_http_res_finish_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r15 = r4.mLogBundle     // Catch: org.json.JSONException -> L59
            long r1 = r15.videoHttpResFinishTimestamp     // Catch: org.json.JSONException -> L59
            org.json.JSONObject r13 = r13.put(r14, r1)     // Catch: org.json.JSONException -> L59
            java.lang.String r14 = "audio_http_res_finish_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r15 = r4.mLogBundle     // Catch: org.json.JSONException -> L59
            long r1 = r15.audioHttpResFinishTimestamp     // Catch: org.json.JSONException -> L59
            r13.put(r14, r1)     // Catch: org.json.JSONException -> L59
            java.lang.String r13 = r4.mStreamFormat     // Catch: org.json.JSONException -> L59
            boolean r13 = r13.equals(r0)     // Catch: org.json.JSONException -> L59
            if (r13 == 0) goto L117
            java.lang.String r13 = "cmaf_mpd_dns_analysis_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r14 = r4.mLogBundle     // Catch: org.json.JSONException -> L59
            long r14 = r14.cmafMpdDNSTimestamp     // Catch: org.json.JSONException -> L59
            org.json.JSONObject r13 = r12.put(r13, r14)     // Catch: org.json.JSONException -> L59
            java.lang.String r14 = "cmaf_mpd_tcp_connect_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r15 = r4.mLogBundle     // Catch: org.json.JSONException -> L59
            long r0 = r15.cmafMpdTcpConntectTimestamp     // Catch: org.json.JSONException -> L59
            org.json.JSONObject r13 = r13.put(r14, r0)     // Catch: org.json.JSONException -> L59
            java.lang.String r14 = "cmaf_mpd_tcp_first_package_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r15 = r4.mLogBundle     // Catch: org.json.JSONException -> L59
            long r0 = r15.cmafMdpTcpFirstPacketTimestamp     // Catch: org.json.JSONException -> L59
            org.json.JSONObject r13 = r13.put(r14, r0)     // Catch: org.json.JSONException -> L59
            java.lang.String r14 = "cmaf_mpd_http_req_finish_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r15 = r4.mLogBundle     // Catch: org.json.JSONException -> L59
            long r0 = r15.cmafMdpHttpReqFinishTimestamp     // Catch: org.json.JSONException -> L59
            org.json.JSONObject r13 = r13.put(r14, r0)     // Catch: org.json.JSONException -> L59
            java.lang.String r14 = "cmaf_mpd_http_res_finish_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r15 = r4.mLogBundle     // Catch: org.json.JSONException -> L59
            long r0 = r15.cmafMdpHttpResFinishTimestamp     // Catch: org.json.JSONException -> L59
            org.json.JSONObject r13 = r13.put(r14, r0)     // Catch: org.json.JSONException -> L59
            java.lang.String r14 = "cmaf_audio_firstseg_connect_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r15 = r4.mLogBundle     // Catch: org.json.JSONException -> L59
            long r0 = r15.cmafAudioFirstSegConntectTimestamp     // Catch: org.json.JSONException -> L59
            org.json.JSONObject r13 = r13.put(r14, r0)     // Catch: org.json.JSONException -> L59
            java.lang.String r14 = "cmaf_video_firstseg_connect_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r15 = r4.mLogBundle     // Catch: org.json.JSONException -> L59
            long r0 = r15.cmafVideoFirstSegConntectTimestamp     // Catch: org.json.JSONException -> L59
            org.json.JSONObject r13 = r13.put(r14, r0)     // Catch: org.json.JSONException -> L59
            java.lang.String r14 = "cmaf_mpd_connect_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r15 = r4.mLogBundle     // Catch: org.json.JSONException -> L59
            long r0 = r15.cmafMpdConntectTimestamp     // Catch: org.json.JSONException -> L59
            r13.put(r14, r0)     // Catch: org.json.JSONException -> L59
        L117:
            r11.reportQuicOpenResult(r12)     // Catch: org.json.JSONException -> L59
        L11a:
            com.bykv.vk.component.ttvideo.ILiveListener r13 = r4.mLogUploader     // Catch: org.json.JSONException -> L59
            java.lang.String r14 = "live_client_monitor_log"
            r13.onMonitorLog(r12, r14)     // Catch: org.json.JSONException -> L59
            long r12 = r4.mLogTotalCount     // Catch: org.json.JSONException -> L59
            r14 = 0
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 <= 0) goto L12e
            r14 = 1
            long r12 = r12 + r14
            r4.mLogTotalCount = r12     // Catch: org.json.JSONException -> L59
        L12e:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L59
            java.lang.String r13 = "1.0:"
            r12.<init>(r13)     // Catch: org.json.JSONException -> L59
            long r13 = r4.mFirstFrameTimestamp     // Catch: org.json.JSONException -> L59
            r12.append(r13)     // Catch: org.json.JSONException -> L59
            java.lang.String r12 = r12.toString()     // Catch: org.json.JSONException -> L59
            r4.mSpeedSwitchInfo = r12     // Catch: org.json.JSONException -> L59
            return
        L141:
            r0 = move-exception
            r4 = r11
            goto L5a
        L145:
            com.bytedance.sdk.component.utils.vl.j(r12)
        L148:
            return
    }

    public void onFirstFrameFail(int r6) {
            r5 = this;
            boolean r0 = r5.mHasFirstFrame
            if (r0 != 0) goto L4c
            com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r5.mLiveEngine
            if (r0 == 0) goto L4c
            com.bykv.vk.component.ttvideo.ILiveListener r1 = r5.mLogUploader
            if (r1 != 0) goto Ld
            goto L4c
        Ld:
            com.bykv.vk.component.ttvideo.log.LogBundle r1 = r5.mLogBundle
            r2 = 2
            r0.getLogInfo(r1, r2)
            org.json.JSONObject r0 = r5.createCommonLog()
            if (r0 == 0) goto L4c
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "first_frame_failed"
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L48
            java.lang.String r2 = "start_time"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L48
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L48
            java.lang.String r2 = "reason"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L48
            r5.reportQuicOpenResult(r0)     // Catch: org.json.JSONException -> L48
            com.bykv.vk.component.ttvideo.ILiveListener r6 = r5.mLogUploader     // Catch: org.json.JSONException -> L48
            java.lang.String r1 = "live_client_monitor_log"
            r6.onMonitorLog(r0, r1)     // Catch: org.json.JSONException -> L48
            long r0 = r5.mLogTotalCount     // Catch: org.json.JSONException -> L48
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L4c
            r2 = 1
            long r0 = r0 + r2
            r5.mLogTotalCount = r0     // Catch: org.json.JSONException -> L48
            return
        L48:
            r6 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r6)
        L4c:
            return
    }

    public void onIllegalAPICall(java.lang.String r5) {
            r4 = this;
            com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r4.mLiveEngine
            if (r0 == 0) goto L3e
            com.bykv.vk.component.ttvideo.ILiveListener r1 = r4.mLogUploader
            if (r1 != 0) goto L9
            goto L3e
        L9:
            com.bykv.vk.component.ttvideo.log.LogBundle r1 = r4.mLogBundle
            r2 = 2
            r0.getLogInfo(r1, r2)
            org.json.JSONObject r0 = r4.createCommonLog()
            if (r0 == 0) goto L3e
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "illegal_call"
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L3a
            java.lang.String r2 = "api_name"
            r1.put(r2, r5)     // Catch: org.json.JSONException -> L3a
            r4.reportQuicOpenResult(r0)     // Catch: org.json.JSONException -> L3a
            com.bykv.vk.component.ttvideo.ILiveListener r5 = r4.mLogUploader     // Catch: org.json.JSONException -> L3a
            java.lang.String r1 = "live_client_monitor_log"
            r5.onMonitorLog(r0, r1)     // Catch: org.json.JSONException -> L3a
            long r0 = r4.mLogTotalCount     // Catch: org.json.JSONException -> L3a
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L3e
            r2 = 1
            long r0 = r0 + r2
            r4.mLogTotalCount = r0     // Catch: org.json.JSONException -> L3a
            return
        L3a:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
        L3e:
            return
    }

    public void onLoaderError(int r4, java.lang.String r5) {
            r3 = this;
            org.json.JSONObject r0 = r3.createCommonLog()
            if (r0 == 0) goto L32
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "p2p_error"
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L2e
            java.lang.String r2 = "error_msg"
            org.json.JSONObject r5 = r1.put(r2, r5)     // Catch: org.json.JSONException -> L2e
            java.lang.String r1 = "code"
            r5.put(r1, r4)     // Catch: org.json.JSONException -> L2e
            com.bykv.vk.component.ttvideo.ILiveListener r4 = r3.mLogUploader     // Catch: org.json.JSONException -> L2e
            java.lang.String r5 = "live_client_monitor_log"
            r4.onMonitorLog(r0, r5)     // Catch: org.json.JSONException -> L2e
            long r4 = r3.mLogTotalCount     // Catch: org.json.JSONException -> L2e
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L32
            r0 = 1
            long r4 = r4 + r0
            r3.mLogTotalCount = r4     // Catch: org.json.JSONException -> L2e
            return
        L2e:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L32:
            return
    }

    public void onLoaderSwitch(int r4, java.lang.String r5) {
            r3 = this;
            org.json.JSONObject r0 = r3.createCommonLog()
            if (r0 == 0) goto L47
            java.lang.String r1 = "cdn_to_p2p"
            boolean r1 = r5.equals(r1)     // Catch: org.json.JSONException -> L12
            if (r1 == 0) goto L14
            r1 = 1
            r3.mUsedP2P = r1     // Catch: org.json.JSONException -> L12
            goto L14
        L12:
            r4 = move-exception
            goto L44
        L14:
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "p2p_switch"
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L12
            java.lang.String r2 = "switch_info"
            org.json.JSONObject r5 = r1.put(r2, r5)     // Catch: org.json.JSONException -> L12
            java.lang.String r1 = "p2p_vendor"
            java.lang.String r2 = "none"
            org.json.JSONObject r5 = r5.put(r1, r2)     // Catch: org.json.JSONException -> L12
            java.lang.String r1 = "reason"
            r5.put(r1, r4)     // Catch: org.json.JSONException -> L12
            com.bykv.vk.component.ttvideo.ILiveListener r4 = r3.mLogUploader     // Catch: org.json.JSONException -> L12
            java.lang.String r5 = "live_client_monitor_log"
            r4.onMonitorLog(r0, r5)     // Catch: org.json.JSONException -> L12
            long r4 = r3.mLogTotalCount     // Catch: org.json.JSONException -> L12
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L47
            r0 = 1
            long r4 = r4 + r0
            r3.mLogTotalCount = r4     // Catch: org.json.JSONException -> L12
            return
        L44:
            com.bytedance.sdk.component.utils.vl.j(r4)
        L47:
            return
    }

    public void onPlay(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r3.mSessionLogBundle
            if (r0 == 0) goto La
            long r0 = java.lang.System.currentTimeMillis()
            r3.mSessionStartTime = r0
        La:
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r3.mLogBundle
            long r1 = java.lang.System.currentTimeMillis()
            r0.startPlayTime = r1
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r3.mLogBundle
            r0.dnsIP = r5
            r3.mCdnPlayURL = r4
            r3.mCurrentPlayURL = r4
            org.json.JSONObject r4 = r3.createCommonLog()
            r0 = 0
            r3.mLogTotalCount = r0
            if (r4 == 0) goto L88
            java.lang.String r5 = "event_key"
            java.lang.String r0 = "start_play"
            org.json.JSONObject r5 = r4.put(r5, r0)     // Catch: org.json.JSONException -> L84
            java.lang.String r0 = "rule_ids"
            java.lang.String r1 = r3.mRuleIds     // Catch: org.json.JSONException -> L84
            org.json.JSONObject r5 = r5.put(r0, r1)     // Catch: org.json.JSONException -> L84
            java.lang.String r0 = "set_surface_cost"
            long r1 = r3.mSetSurfaceCost     // Catch: org.json.JSONException -> L84
            org.json.JSONObject r5 = r5.put(r0, r1)     // Catch: org.json.JSONException -> L84
            java.lang.String r0 = "start_play_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r1 = r3.mLogBundle     // Catch: org.json.JSONException -> L84
            long r1 = r1.startPlayTime     // Catch: org.json.JSONException -> L84
            org.json.JSONObject r5 = r5.put(r0, r1)     // Catch: org.json.JSONException -> L84
            java.lang.String r0 = "stream_data"
            java.lang.String r1 = r3.mStreamData     // Catch: org.json.JSONException -> L84
            org.json.JSONObject r5 = r5.put(r0, r1)     // Catch: org.json.JSONException -> L84
            java.lang.String r0 = "suggest_format"
            java.lang.String r1 = r3.mSuggestFormat     // Catch: org.json.JSONException -> L84
            org.json.JSONObject r5 = r5.put(r0, r1)     // Catch: org.json.JSONException -> L84
            java.lang.String r0 = "play_format"
            java.lang.String r1 = r3.mStreamFormat     // Catch: org.json.JSONException -> L84
            org.json.JSONObject r5 = r5.put(r0, r1)     // Catch: org.json.JSONException -> L84
            java.lang.String r0 = "suggest_protocol"
            java.lang.String r1 = r3.mSuggestProtocol     // Catch: org.json.JSONException -> L84
            org.json.JSONObject r5 = r5.put(r0, r1)     // Catch: org.json.JSONException -> L84
            java.lang.String r0 = "origin_url"
            java.lang.String r1 = r3.mOriginUrl     // Catch: org.json.JSONException -> L84
            org.json.JSONObject r5 = r5.put(r0, r1)     // Catch: org.json.JSONException -> L84
            java.lang.String r0 = "log_total_count_when_playing"
            long r1 = r3.mLogTotalCount     // Catch: org.json.JSONException -> L84
            r5.put(r0, r1)     // Catch: org.json.JSONException -> L84
            com.bykv.vk.component.ttvideo.ILiveListener r5 = r3.mLogUploader     // Catch: org.json.JSONException -> L84
            java.lang.String r0 = "live_client_monitor_log"
            r5.onMonitorLog(r4, r0)     // Catch: org.json.JSONException -> L84
            long r4 = r3.mLogTotalCount     // Catch: org.json.JSONException -> L84
            r0 = 1
            long r4 = r4 + r0
            r3.mLogTotalCount = r4     // Catch: org.json.JSONException -> L84
            return
        L84:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L88:
            return
    }

    public void onPrepare(int r12) {
            r11 = this;
            com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r11.mLiveEngine
            if (r0 != 0) goto L6
            goto Lc9
        L6:
            org.json.JSONObject r0 = r11.createCommonLog()
            com.bykv.vk.component.ttvideo.VideoLiveManager r1 = r11.mLiveEngine
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r11.mLogBundle
            r3 = 7
            r1.getLogInfo(r2, r3)
            int r1 = r11.mEnableReportSessionStop
            java.lang.String r2 = "none"
            r3 = 1
            if (r1 != r3) goto L27
            r11.mSessionErrorCode = r12
            if (r12 == 0) goto L24
            com.bykv.vk.component.ttvideo.VideoLiveManager r1 = r11.mLiveEngine
            java.lang.String r1 = r1.getPlayerErrorInfo()
            goto L25
        L24:
            r1 = r2
        L25:
            r11.mSessionErrorMsg = r1
        L27:
            if (r0 == 0) goto Lc9
            long r4 = r11.mFirstAudioPacketDTS     // Catch: org.json.JSONException -> L3e
            r1 = 0
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L41
            long r8 = r11.mPreviousAudioPacketDTS     // Catch: org.json.JSONException -> L3e
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 <= 0) goto L41
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 >= 0) goto L41
            r4 = 1
            goto L42
        L3e:
            r12 = move-exception
            goto Lc6
        L41:
            r4 = 0
        L42:
            java.lang.String r5 = "event_key"
            java.lang.String r8 = "prepare_result"
            org.json.JSONObject r5 = r0.put(r5, r8)     // Catch: org.json.JSONException -> L3e
            java.lang.String r8 = "error_msg"
            if (r12 == 0) goto L55
            com.bykv.vk.component.ttvideo.VideoLiveManager r9 = r11.mLiveEngine     // Catch: org.json.JSONException -> L3e
            java.lang.String r9 = r9.getPlayerErrorInfo()     // Catch: org.json.JSONException -> L3e
            goto L56
        L55:
            r9 = r2
        L56:
            org.json.JSONObject r5 = r5.put(r8, r9)     // Catch: org.json.JSONException -> L3e
            java.lang.String r8 = "result"
            org.json.JSONObject r12 = r5.put(r8, r12)     // Catch: org.json.JSONException -> L3e
            java.lang.String r5 = "sdk_params"
            java.lang.String r8 = r11.mSdkParams     // Catch: org.json.JSONException -> L3e
            if (r8 != 0) goto L67
            goto L68
        L67:
            r2 = r8
        L68:
            org.json.JSONObject r12 = r12.put(r5, r2)     // Catch: org.json.JSONException -> L3e
            java.lang.String r2 = "first_audio_packet_dts_rollback"
            org.json.JSONObject r12 = r12.put(r2, r4)     // Catch: org.json.JSONException -> L3e
            java.lang.String r2 = "first_audio_packet_dts"
            long r4 = r11.mFirstAudioPacketDTS     // Catch: org.json.JSONException -> L3e
            org.json.JSONObject r12 = r12.put(r2, r4)     // Catch: org.json.JSONException -> L3e
            java.lang.String r2 = "previous_audio_packet_dts"
            long r4 = r11.mPreviousAudioPacketDTS     // Catch: org.json.JSONException -> L3e
            org.json.JSONObject r12 = r12.put(r2, r4)     // Catch: org.json.JSONException -> L3e
            java.lang.String r2 = "stream_type"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r11.mLogBundle     // Catch: org.json.JSONException -> L3e
            int r4 = r4.mStreamType     // Catch: org.json.JSONException -> L3e
            org.json.JSONObject r12 = r12.put(r2, r4)     // Catch: org.json.JSONException -> L3e
            java.lang.String r2 = "suggest_format"
            java.lang.String r4 = r11.mSuggestFormat     // Catch: org.json.JSONException -> L3e
            org.json.JSONObject r12 = r12.put(r2, r4)     // Catch: org.json.JSONException -> L3e
            java.lang.String r2 = "suggest_protocol"
            java.lang.String r4 = r11.mSuggestProtocol     // Catch: org.json.JSONException -> L3e
            org.json.JSONObject r12 = r12.put(r2, r4)     // Catch: org.json.JSONException -> L3e
            java.lang.String r2 = "nnsr_enabled"
            com.bykv.vk.component.ttvideo.VideoLiveManager r4 = r11.mLiveEngine     // Catch: org.json.JSONException -> L3e
            boolean r4 = r4.getSRState()     // Catch: org.json.JSONException -> L3e
            if (r4 != 0) goto Lb0
            com.bykv.vk.component.ttvideo.VideoLiveManager r4 = r11.mLiveEngine     // Catch: org.json.JSONException -> L3e
            boolean r4 = r4.getSharpenState()     // Catch: org.json.JSONException -> L3e
            if (r4 == 0) goto Laf
            goto Lb0
        Laf:
            r3 = 0
        Lb0:
            r12.put(r2, r3)     // Catch: org.json.JSONException -> L3e
            com.bykv.vk.component.ttvideo.ILiveListener r12 = r11.mLogUploader     // Catch: org.json.JSONException -> L3e
            java.lang.String r1 = "live_client_monitor_log"
            r12.onMonitorLog(r0, r1)     // Catch: org.json.JSONException -> L3e
            long r0 = r11.mLogTotalCount     // Catch: org.json.JSONException -> L3e
            int r12 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r12 <= 0) goto Lc9
            r2 = 1
            long r0 = r0 + r2
            r11.mLogTotalCount = r0     // Catch: org.json.JSONException -> L3e
            return
        Lc6:
            com.bytedance.sdk.component.utils.vl.j(r12)
        Lc9:
            return
    }

    public void onPrepareEnd() {
            r3 = this;
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r3.mSessionLogBundle
            if (r0 == 0) goto La
            long r1 = java.lang.System.currentTimeMillis()
            r0.prepareEndTimestamp = r1
        La:
            boolean r0 = r3.mHasFirstFrame
            if (r0 == 0) goto Lf
            return
        Lf:
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r3.mLogBundle
            long r1 = java.lang.System.currentTimeMillis()
            r0.prepareEndTimestamp = r1
            return
    }

    public void onPtsBack(long r4, boolean r6) {
            r3 = this;
            org.json.JSONObject r0 = r3.createCommonLog()
            if (r0 == 0) goto L2d
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "pts_back"
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L15
            java.lang.String r2 = "type"
            if (r6 == 0) goto L17
            java.lang.String r6 = "video"
            goto L19
        L15:
            r4 = move-exception
            goto L2a
        L17:
            java.lang.String r6 = "audio"
        L19:
            org.json.JSONObject r6 = r1.put(r2, r6)     // Catch: org.json.JSONException -> L15
            java.lang.String r1 = "pts_back_diff"
            r6.put(r1, r4)     // Catch: org.json.JSONException -> L15
            com.bykv.vk.component.ttvideo.ILiveListener r4 = r3.mLogUploader     // Catch: org.json.JSONException -> L15
            java.lang.String r5 = "live_client_monitor_log"
            r4.onMonitorLog(r0, r5)     // Catch: org.json.JSONException -> L15
            return
        L2a:
            com.bytedance.sdk.component.utils.vl.j(r4)
        L2d:
            return
    }

    public void onRecvRtcEventNotify(java.lang.String r4) {
            r3 = this;
            com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r3.mLiveEngine
            if (r0 == 0) goto L3b
            com.bykv.vk.component.ttvideo.ILiveListener r0 = r3.mLogUploader
            if (r0 != 0) goto L9
            goto L3b
        L9:
            if (r4 == 0) goto L3b
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L23
            r0.<init>(r4)     // Catch: java.lang.Exception -> L23
            java.lang.String r4 = com.bykv.vk.component.ttvideo.log.LiveLoggerService.TAG     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "recv event notify: "
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Exception -> L23
            com.bykv.vk.component.ttvideo.log.MyLog.i(r4, r1)     // Catch: java.lang.Exception -> L23
            r3.updateRequestTimeFieldInRtcPlay(r0)     // Catch: java.lang.Exception -> L23
            return
        L23:
            r4 = move-exception
            java.lang.String r0 = com.bykv.vk.component.ttvideo.log.LiveLoggerService.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "recv event notify error occurs error:"
            r1.<init>(r2)
            java.lang.String r4 = r4.toString()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.e(r0, r4)
        L3b:
            return
    }

    public void onRecvedRtcTraceInfo(java.lang.String r4) {
            r3 = this;
            com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r3.mLiveEngine
            if (r0 == 0) goto L45
            com.bykv.vk.component.ttvideo.ILiveListener r0 = r3.mLogUploader
            if (r0 != 0) goto L9
            goto L45
        L9:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L38
            r0.<init>()     // Catch: org.json.JSONException -> L38
            if (r4 == 0) goto L3a
            java.lang.String r1 = "product_line"
            java.lang.String r2 = "rts"
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L38
            java.lang.String r1 = "rtc_trace_info"
            r0.put(r1, r4)     // Catch: org.json.JSONException -> L38
            boolean r1 = r4.isEmpty()     // Catch: org.json.JSONException -> L38
            if (r1 != 0) goto L3a
            java.lang.String r1 = "rts_play_stop"
            boolean r1 = r4.contains(r1)     // Catch: org.json.JSONException -> L38
            if (r1 == 0) goto L3a
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L38
            r1.<init>(r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r4 = "event_message"
            java.lang.String r4 = r1.optString(r4)     // Catch: org.json.JSONException -> L38
            r3.mRtcPlayStopStatInfo = r4     // Catch: org.json.JSONException -> L38
            goto L3a
        L38:
            r4 = move-exception
            goto L42
        L3a:
            com.bykv.vk.component.ttvideo.ILiveListener r4 = r3.mLogUploader     // Catch: org.json.JSONException -> L38
            java.lang.String r1 = "live_webrtc_monitor_log"
            r4.onMonitorLog(r0, r1)     // Catch: org.json.JSONException -> L38
            return
        L42:
            com.bytedance.sdk.component.utils.vl.j(r4)
        L45:
            return
    }

    public void onRecvedSPSPPS(java.lang.String r5) {
            r4 = this;
            com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r4.mLiveEngine
            if (r0 == 0) goto L33
            com.bykv.vk.component.ttvideo.ILiveListener r0 = r4.mLogUploader
            if (r0 != 0) goto L9
            goto L33
        L9:
            org.json.JSONObject r0 = r4.createCommonLog()     // Catch: org.json.JSONException -> L2f
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "recved_spspps"
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L2f
            java.lang.String r2 = "spspps"
            r1.put(r2, r5)     // Catch: org.json.JSONException -> L2f
            com.bykv.vk.component.ttvideo.ILiveListener r5 = r4.mLogUploader     // Catch: org.json.JSONException -> L2f
            java.lang.String r1 = "live_client_monitor_log"
            r5.onMonitorLog(r0, r1)     // Catch: org.json.JSONException -> L2f
            long r0 = r4.mLogTotalCount     // Catch: org.json.JSONException -> L2f
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L33
            r2 = 1
            long r0 = r0 + r2
            r4.mLogTotalCount = r0     // Catch: org.json.JSONException -> L2f
            return
        L2f:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
        L33:
            return
    }

    public void onRenderStall(long r6, int r8, boolean r9, boolean r10) {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r5.mLogBundle
            long r2 = r2.startPlayTime
            long r0 = r0 - r2
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto Ld7
            long r0 = (long) r8
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 > 0) goto L14
            goto Ld7
        L14:
            r8 = 1
            r0 = 1
            if (r9 == 0) goto L4d
            java.lang.String r2 = com.bykv.vk.component.ttvideo.log.LiveLoggerService.TAG
            java.lang.String r3 = "video render stall time "
            java.lang.String r4 = java.lang.String.valueOf(r6)
            java.lang.String r3 = r3.concat(r4)
            com.bykv.vk.component.ttvideo.log.MyLog.i(r2, r3)
            int r2 = r5.mPlayingVideoRenderStallCount
            int r2 = r2 + r8
            r5.mPlayingVideoRenderStallCount = r2
            long r2 = r5.mVideoRenderStallTotalCount
            long r2 = r2 + r0
            r5.mVideoRenderStallTotalCount = r2
            int r2 = r5.mPlayingVideoRenderStallTime
            long r2 = (long) r2
            long r2 = r2 + r6
            int r3 = (int) r2
            r5.mPlayingVideoRenderStallTime = r3
            long r2 = r5.mVideoRenderStallTotalTime
            long r2 = r2 + r6
            r5.mVideoRenderStallTotalTime = r2
            int r2 = r5.mEnableReportSessionStop
            if (r2 != r8) goto L80
            long r2 = r5.mSessionVideoRenderStallTotalCount
            long r2 = r2 + r0
            r5.mSessionVideoRenderStallTotalCount = r2
            long r2 = r5.mSessionVideoRenderStallTotalTime
            long r2 = r2 + r6
            r5.mSessionVideoRenderStallTotalTime = r2
            goto L80
        L4d:
            java.lang.String r2 = com.bykv.vk.component.ttvideo.log.LiveLoggerService.TAG
            java.lang.String r3 = "audio render stall time "
            java.lang.String r4 = java.lang.String.valueOf(r6)
            java.lang.String r3 = r3.concat(r4)
            com.bykv.vk.component.ttvideo.log.MyLog.i(r2, r3)
            int r2 = r5.mPlayingAudioRenderStallCount
            int r2 = r2 + r8
            r5.mPlayingAudioRenderStallCount = r2
            long r2 = r5.mAudioRenderStallTotalCount
            long r2 = r2 + r0
            r5.mAudioRenderStallTotalCount = r2
            int r2 = r5.mPlayingAudioRenderStallTime
            long r2 = (long) r2
            long r2 = r2 + r6
            int r3 = (int) r2
            r5.mPlayingAudioRenderStallTime = r3
            long r2 = r5.mAudioRenderStallTotalTime
            long r2 = r2 + r6
            r5.mAudioRenderStallTotalTime = r2
            int r2 = r5.mEnableReportSessionStop
            if (r2 != r8) goto L80
            long r2 = r5.mSessionAudioRenderStallTotalCount
            long r2 = r2 + r0
            r5.mSessionAudioRenderStallTotalCount = r2
            long r2 = r5.mSessionAudioRenderStallTotalTime
            long r2 = r2 + r6
            r5.mSessionAudioRenderStallTotalTime = r2
        L80:
            if (r10 == 0) goto Ld6
            org.json.JSONObject r8 = r5.createCommonLog()
            com.bykv.vk.component.ttvideo.VideoLiveManager r10 = r5.mLiveEngine
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r5.mLogBundle
            r3 = 4
            r10.getLogInfo(r2, r3)
            if (r8 == 0) goto Ld6
            java.lang.String r10 = "event_key"
            java.lang.String r2 = "render_stall"
            org.json.JSONObject r10 = r8.put(r10, r2)     // Catch: org.json.JSONException -> L9f
            java.lang.String r2 = "type"
            if (r9 == 0) goto La1
            java.lang.String r9 = "video"
            goto La3
        L9f:
            r6 = move-exception
            goto Ld3
        La1:
            java.lang.String r9 = "audio"
        La3:
            org.json.JSONObject r9 = r10.put(r2, r9)     // Catch: org.json.JSONException -> L9f
            java.lang.String r10 = "render_stall_time"
            org.json.JSONObject r6 = r9.put(r10, r6)     // Catch: org.json.JSONException -> L9f
            java.lang.String r7 = "video_buffer_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r5.mLogBundle     // Catch: org.json.JSONException -> L9f
            long r9 = r9.videoBufferTime     // Catch: org.json.JSONException -> L9f
            org.json.JSONObject r6 = r6.put(r7, r9)     // Catch: org.json.JSONException -> L9f
            java.lang.String r7 = "audio_buffer_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r5.mLogBundle     // Catch: org.json.JSONException -> L9f
            long r9 = r9.audioBufferTime     // Catch: org.json.JSONException -> L9f
            r6.put(r7, r9)     // Catch: org.json.JSONException -> L9f
            com.bykv.vk.component.ttvideo.ILiveListener r6 = r5.mLogUploader     // Catch: org.json.JSONException -> L9f
            java.lang.String r7 = "live_client_monitor_log"
            r6.onMonitorLog(r8, r7)     // Catch: org.json.JSONException -> L9f
            long r6 = r5.mLogTotalCount     // Catch: org.json.JSONException -> L9f
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto Ld6
            long r6 = r6 + r0
            r5.mLogTotalCount = r6     // Catch: org.json.JSONException -> L9f
            return
        Ld3:
            com.bytedance.sdk.component.utils.vl.j(r6)
        Ld6:
            return
        Ld7:
            java.lang.String r8 = com.bykv.vk.component.ttvideo.log.LiveLoggerService.TAG
            java.lang.String r9 = "abnormal render stall time"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r9.concat(r6)
            com.bykv.vk.component.ttvideo.log.MyLog.i(r8, r6)
            return
    }

    public void onRetry(int r5) {
            r4 = this;
            int r0 = r4.mRetryCount
            int r0 = r0 + 1
            r4.mRetryCount = r0
            int r0 = r4.mRetryTotalCount
            int r0 = r0 + 1
            r4.mRetryTotalCount = r0
            com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r4.mLiveEngine
            com.bykv.vk.component.ttvideo.log.LogBundle r1 = r4.mLogBundle
            r2 = 2
            r0.getLogInfo(r1, r2)
            org.json.JSONObject r0 = r4.createCommonLog()
            r4.calculateRenderFailType()
            if (r0 == 0) goto L56
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "retry"
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L52
            java.lang.String r2 = "reason"
            int r3 = r4.mErrorCode     // Catch: org.json.JSONException -> L52
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L52
            java.lang.String r2 = "code"
            org.json.JSONObject r5 = r1.put(r2, r5)     // Catch: org.json.JSONException -> L52
            java.lang.String r1 = "render_fail_type"
            int r2 = r4.mRenderFailType     // Catch: org.json.JSONException -> L52
            r5.put(r1, r2)     // Catch: org.json.JSONException -> L52
            r4.reportQuicOpenResult(r0)     // Catch: org.json.JSONException -> L52
            com.bykv.vk.component.ttvideo.ILiveListener r5 = r4.mLogUploader     // Catch: org.json.JSONException -> L52
            java.lang.String r1 = "live_client_monitor_log"
            r5.onMonitorLog(r0, r1)     // Catch: org.json.JSONException -> L52
            long r0 = r4.mLogTotalCount     // Catch: org.json.JSONException -> L52
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L56
            r2 = 1
            long r0 = r0 + r2
            r4.mLogTotalCount = r0     // Catch: org.json.JSONException -> L52
            return
        L52:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
        L56:
            return
    }

    public void onRtcDecoderStall(long r5, boolean r7) {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r4.mLogBundle
            long r2 = r2.startPlayTime
            long r0 = r0 - r2
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1d
            java.lang.String r7 = com.bykv.vk.component.ttvideo.log.LiveLoggerService.TAG
            java.lang.String r0 = "abnormal rtc decode stall time"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r0.concat(r5)
            com.bykv.vk.component.ttvideo.log.MyLog.i(r7, r5)
            return
        L1d:
            org.json.JSONObject r0 = r4.createCommonLog()
            if (r0 == 0) goto L57
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "rtc_decode_stall"
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L32
            java.lang.String r2 = "type"
            if (r7 == 0) goto L34
            java.lang.String r7 = "video"
            goto L36
        L32:
            r5 = move-exception
            goto L54
        L34:
            java.lang.String r7 = "audio"
        L36:
            org.json.JSONObject r7 = r1.put(r2, r7)     // Catch: org.json.JSONException -> L32
            java.lang.String r1 = "decode_stall_time"
            r7.put(r1, r5)     // Catch: org.json.JSONException -> L32
            com.bykv.vk.component.ttvideo.ILiveListener r5 = r4.mLogUploader     // Catch: org.json.JSONException -> L32
            java.lang.String r6 = "live_client_monitor_log"
            r5.onMonitorLog(r0, r6)     // Catch: org.json.JSONException -> L32
            long r5 = r4.mLogTotalCount     // Catch: org.json.JSONException -> L32
            r0 = 0
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 <= 0) goto L57
            r0 = 1
            long r5 = r5 + r0
            r4.mLogTotalCount = r5     // Catch: org.json.JSONException -> L32
            return
        L54:
            com.bytedance.sdk.component.utils.vl.j(r5)
        L57:
            return
    }

    public void onSDKDNSComplete(boolean r4, boolean r5) {
            r3 = this;
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r3.mLogBundle
            long r1 = java.lang.System.currentTimeMillis()
            r0.SDKDNSTimeStamp = r1
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r3.mSessionLogBundle
            if (r0 == 0) goto L12
            long r1 = java.lang.System.currentTimeMillis()
            r0.SDKDNSTimeStamp = r1
        L12:
            r3.mHitNodeOptimizer = r5
            r3.mIsHitCache = r4
            return
    }

    public void onSDKDNSError(com.bykv.vk.component.ttvideo.log.LiveError r5) {
            r4 = this;
            org.json.JSONObject r0 = r4.createCommonLog()
            if (r0 == 0) goto L7a
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "prepare_result"
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L29
            java.lang.String r2 = "error_msg"
            java.lang.String r3 = r5.getInfoJSON()     // Catch: org.json.JSONException -> L29
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L29
            java.lang.String r2 = "result"
            int r5 = r5.code     // Catch: org.json.JSONException -> L29
            org.json.JSONObject r5 = r1.put(r2, r5)     // Catch: org.json.JSONException -> L29
            java.lang.String r1 = "sdk_params"
            java.lang.String r2 = r4.mSdkParams     // Catch: org.json.JSONException -> L29
            if (r2 != 0) goto L2b
            java.lang.String r2 = "none"
            goto L2b
        L29:
            r5 = move-exception
            goto L77
        L2b:
            org.json.JSONObject r5 = r5.put(r1, r2)     // Catch: org.json.JSONException -> L29
            java.lang.String r1 = "stream_type"
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r4.mLogBundle     // Catch: org.json.JSONException -> L29
            int r2 = r2.mStreamType     // Catch: org.json.JSONException -> L29
            org.json.JSONObject r5 = r5.put(r1, r2)     // Catch: org.json.JSONException -> L29
            java.lang.String r1 = "suggest_format"
            java.lang.String r2 = r4.mSuggestFormat     // Catch: org.json.JSONException -> L29
            org.json.JSONObject r5 = r5.put(r1, r2)     // Catch: org.json.JSONException -> L29
            java.lang.String r1 = "suggest_protocol"
            java.lang.String r2 = r4.mSuggestProtocol     // Catch: org.json.JSONException -> L29
            org.json.JSONObject r5 = r5.put(r1, r2)     // Catch: org.json.JSONException -> L29
            java.lang.String r1 = "nnsr_enabled"
            com.bykv.vk.component.ttvideo.VideoLiveManager r2 = r4.mLiveEngine     // Catch: org.json.JSONException -> L29
            boolean r2 = r2.getSRState()     // Catch: org.json.JSONException -> L29
            if (r2 != 0) goto L5e
            com.bykv.vk.component.ttvideo.VideoLiveManager r2 = r4.mLiveEngine     // Catch: org.json.JSONException -> L29
            boolean r2 = r2.getSharpenState()     // Catch: org.json.JSONException -> L29
            if (r2 == 0) goto L5c
            goto L5e
        L5c:
            r2 = 0
            goto L5f
        L5e:
            r2 = 1
        L5f:
            r5.put(r1, r2)     // Catch: org.json.JSONException -> L29
            com.bykv.vk.component.ttvideo.ILiveListener r5 = r4.mLogUploader     // Catch: org.json.JSONException -> L29
            java.lang.String r1 = "live_client_monitor_log"
            r5.onMonitorLog(r0, r1)     // Catch: org.json.JSONException -> L29
            long r0 = r4.mLogTotalCount     // Catch: org.json.JSONException -> L29
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L7a
            r2 = 1
            long r0 = r0 + r2
            r4.mLogTotalCount = r0     // Catch: org.json.JSONException -> L29
            return
        L77:
            com.bytedance.sdk.component.utils.vl.j(r5)
        L7a:
            return
    }

    public void onSessionStop() {
            r22 = this;
            r1 = r22
            int r0 = r1.mEnableReportSessionStop
            if (r0 == 0) goto L2df
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r1.mSessionLogBundle
            if (r0 != 0) goto Lc
            goto L2df
        Lc:
            com.bykv.vk.component.ttvideo.VideoLiveManager r2 = r1.mLiveEngine
            r2.getSessionlogInfo(r0)
            org.json.JSONObject r0 = r1.createCommonLog()
            boolean r2 = r1.mSessionHasFirstFrame
            r3 = 0
            if (r2 == 0) goto L24
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r1.mSessionVideoRenderStartTime
            long r5 = r5 - r7
            r7 = r3
            goto L2d
        L24:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r1.mSessionStartTime
            long r5 = r5 - r7
            r7 = r5
            r5 = r3
        L2d:
            int r2 = r1.mSessionNum
            r9 = 1
            int r2 = r2 + r9
            r1.mSessionNum = r2
            long r10 = r1.mSessionFirstStallStartTime
            int r2 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r2 <= 0) goto L41
            long r12 = r1.mSessionVideoRenderStartTime
            long r12 = r10 - r12
            long r14 = r1.mSessionFirstStallEndTime
            long r14 = r14 - r10
            goto L43
        L41:
            r12 = r3
            r14 = r12
        L43:
            boolean r2 = r1.isStalling()
            r10 = 1
            r16 = r3
            if (r2 == 0) goto L63
            long r3 = r1.mSessionStallTotalCount
            long r3 = r3 + r10
            r1.mSessionStallTotalCount = r3
            long r2 = r1.mSessionStallTotalTime
            long r18 = java.lang.System.currentTimeMillis()
            r20 = r10
            long r9 = r1.mStallStartTime
            long r18 = r18 - r9
            long r2 = r2 + r18
            r1.mSessionStallTotalTime = r2
            goto L65
        L63:
            r20 = r10
        L65:
            r1.calculateSessionRenderFailType()
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r1.mSessionLogBundle
            long r2 = r2.downloadSize
            if (r0 == 0) goto L2dc
            java.lang.String r9 = "event_key"
            java.lang.String r10 = "session_stop"
            org.json.JSONObject r9 = r0.put(r9, r10)     // Catch: org.json.JSONException -> L223
            java.lang.String r10 = "index"
            int r11 = r1.mSessionNum     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r9 = r9.put(r10, r11)     // Catch: org.json.JSONException -> L223
            java.lang.String r10 = "stop_time"
            r18 = r5
            long r4 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r9.put(r10, r4)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "play_time"
            r9 = r18
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "is_stream_received"
            boolean r9 = r1.mSessionHasFirstFrame     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "render_fail_type"
            int r9 = r1.mSessionRenderFailType     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "code"
            int r9 = r1.mSessionErrorCode     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "stall_count"
            long r9 = r1.mSessionStallTotalCount     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "stall_time"
            long r9 = r1.mSessionStallTotalTime     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "audio_render_stall_count"
            long r9 = r1.mSessionAudioRenderStallTotalCount     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "audio_render_stall_time"
            long r9 = r1.mSessionAudioRenderStallTotalTime     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "video_render_stall_count"
            long r9 = r1.mSessionVideoRenderStallTotalCount     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "video_render_stall_time"
            long r9 = r1.mSessionVideoRenderStallTotalTime     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "start"
            long r9 = r1.mSessionStartTime     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "sdk_dns_analysis_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.SDKDNSTimeStamp     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "player_dns_analysis_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.playerDNSTimestamp     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "http_req_finish_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.httpReqFinishTimestamp     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "http_res_finish_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.httpResFinishTimestamp     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "tcp_first_package_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.tcpFirstPacketTimestamp     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "first_video_package_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.videoPacketTimestamp     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "first_audio_package_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.audioPacketTimestamp     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "first_video_frame_decode_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.videoDecodeTimestamp     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "first_audio_frame_decode_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.audioDecodeTimestamp     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "video_device_open_start"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.videoDeviceOpenTime     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "video_device_open_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.videoDeviceOpenedTime     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "audio_device_open_start"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.audioDeviceOpenTime     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "audio_device_open_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.audioDeviceOpenedTime     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "video_device_wait_start"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.videoDeviceWaitStartTime     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "video_device_wait_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.videoDeviceWaitEndTime     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "find_stream_info_start"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.streamInfoFindTime     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "find_stream_info_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.streamInfoFoundTime     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "video_param_send_outlet_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.videoParamSendOutletTime     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "first_video_frame_send_outlet_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.firstVideoFrameSendOutletTime     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "first_frame_render_end"
            long r9 = r1.mSessionVideoRenderStartTime     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "first_audio_frame_end"
            long r9 = r1.mSessionAudioRenderStartTime     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "prepare_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.prepareEndTimestamp     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "prepare_block_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.callPrepareTime     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "video_first_pkt_pos"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.videoFirstPacketPos     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "video_first_pkt_pts"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.videoFirstPacketPts     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "audio_first_pkt_pos"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.audioFirstPacketPos     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "audio_first_pkt_pts"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.audioFirstPacketPts     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "video_render_type"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            int r9 = r9.renderType     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "download_speed"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.downloadSpeedOnFirstFrame     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "video_buffer_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.videoBufferTimeOnFirstFrame     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "audio_buffer_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.audioBufferTimeOnFirstFrame     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "wait_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.waitingTimeAfterFirstFrame     // Catch: org.json.JSONException -> L223
            int r11 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r11 <= 0) goto L226
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.waitingTimeAfterFirstFrame     // Catch: org.json.JSONException -> L223
            goto L22b
        L223:
            r0 = move-exception
            goto L2d9
        L226:
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.waitingTimeAfterFirstFrame     // Catch: org.json.JSONException -> L223
            long r9 = -r9
        L22b:
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "is_waiting"
            com.bykv.vk.component.ttvideo.log.LogBundle r9 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r9 = r9.waitingTimeAfterFirstFrame     // Catch: org.json.JSONException -> L223
            int r11 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r11 < 0) goto L23b
            r9 = 0
            goto L23c
        L23b:
            r9 = 1
        L23c:
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "first_stall_time"
            org.json.JSONObject r4 = r4.put(r5, r12)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "first_stall_duration"
            org.json.JSONObject r4 = r4.put(r5, r14)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "play_time_on_no_frame"
            org.json.JSONObject r4 = r4.put(r5, r7)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "sdk_params"
            java.lang.String r6 = r1.mSdkParams     // Catch: org.json.JSONException -> L223
            if (r6 != 0) goto L25a
            java.lang.String r6 = "none"
        L25a:
            org.json.JSONObject r4 = r4.put(r5, r6)     // Catch: org.json.JSONException -> L223
            java.lang.String r5 = "total_download_size"
            org.json.JSONObject r2 = r4.put(r5, r2)     // Catch: org.json.JSONException -> L223
            java.lang.String r3 = "drop_audio_pts_diff"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r4 = r4.dropAudioPts     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L223
            java.lang.String r3 = "drop_audio_cost"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r4 = r4.dropAudioCostTime     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L223
            java.lang.String r3 = "sr_used"
            boolean r4 = r1.mSRSuccess     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L223
            java.lang.String r3 = "sharpen_used"
            boolean r4 = r1.mHasUsedSharpen     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L223
            java.lang.String r3 = "network_timeout"
            int r4 = r1.mNetworkTimeoutMs     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L223
            java.lang.String r3 = "suggest_format"
            java.lang.String r4 = r1.mSuggestFormat     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L223
            java.lang.String r3 = "suggest_protocol"
            java.lang.String r4 = r1.mSuggestProtocol     // Catch: org.json.JSONException -> L223
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L223
            java.lang.String r3 = "error_msg"
            java.lang.String r4 = r1.mSessionErrorMsg     // Catch: org.json.JSONException -> L223
            r2.put(r3, r4)     // Catch: org.json.JSONException -> L223
            java.lang.String r2 = r1.mCdnPlayURL     // Catch: org.json.JSONException -> L223
            java.lang.String r3 = "tcp_connect_end"
            if (r2 != 0) goto L2b5
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r4 = r2.tcpConnectTimestamp     // Catch: org.json.JSONException -> L223
            r0.put(r3, r4)     // Catch: org.json.JSONException -> L223
            goto L2cb
        L2b5:
            java.lang.String r2 = r1.mProtocol     // Catch: org.json.JSONException -> L223
            java.lang.String r4 = "kcp"
            boolean r2 = r2.equals(r4)     // Catch: org.json.JSONException -> L223
            if (r2 == 0) goto L2c4
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r4 = r2.playerDNSTimestamp     // Catch: org.json.JSONException -> L223
            goto L2c8
        L2c4:
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L223
            long r4 = r2.tcpConnectTimestamp     // Catch: org.json.JSONException -> L223
        L2c8:
            r0.put(r3, r4)     // Catch: org.json.JSONException -> L223
        L2cb:
            long r2 = r1.mLogTotalCount     // Catch: org.json.JSONException -> L223
            long r2 = r2 + r20
            r1.mLogTotalCount = r2     // Catch: org.json.JSONException -> L223
            com.bykv.vk.component.ttvideo.ILiveListener r2 = r1.mLogUploader     // Catch: org.json.JSONException -> L223
            java.lang.String r3 = "live_client_monitor_log"
            r2.onMonitorLog(r0, r3)     // Catch: org.json.JSONException -> L223
            goto L2dc
        L2d9:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L2dc:
            r1.resetSessionInfo()
        L2df:
            return
    }

    public void onStallEnd(int r14) {
            r13 = this;
            int r0 = r13.mErrorCode
            r1 = -100015(0xfffffffffffe7951, float:NaN)
            r2 = 0
            if (r0 != r1) goto La
            r13.mErrorCode = r2
        La:
            boolean r0 = r13.mIsStalling
            if (r0 != 0) goto L10
            goto L113
        L10:
            r13.mIsStalling = r2
            org.json.JSONObject r0 = r13.createCommonLog()
            java.util.ArrayList<java.lang.Long> r1 = r13.mStallTimeSeries
            if (r1 != 0) goto L21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r13.mStallTimeSeries = r1
        L21:
            java.util.ArrayList<java.lang.Long> r1 = r13.mStallTimeSeries
            long r2 = java.lang.System.currentTimeMillis()
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r13.mLogBundle
            long r4 = r4.startPlayTime
            long r2 = r2 - r4
            long r2 = -r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.add(r2)
            long r1 = r13.mFirstStallEndTime
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L42
            long r1 = java.lang.System.currentTimeMillis()
            r13.mFirstStallEndTime = r1
        L42:
            int r1 = r13.mEnableReportSessionStop
            r2 = 1
            if (r1 != r2) goto L53
            long r5 = r13.mSessionFirstStallEndTime
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L53
            long r5 = java.lang.System.currentTimeMillis()
            r13.mSessionFirstStallEndTime = r5
        L53:
            com.bykv.vk.component.ttvideo.VideoLiveManager r1 = r13.mLiveEngine
            com.bykv.vk.component.ttvideo.log.LogBundle r5 = r13.mLogBundle
            r6 = 6
            r1.getLogInfo(r5, r6)
            if (r0 == 0) goto L113
            long r5 = r13.mStallStartTime
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 == 0) goto L113
            long r5 = r13.mPlayingStallStartTime     // Catch: org.json.JSONException -> L7d
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 == 0) goto L80
            int r1 = r13.mPlayingStallCount     // Catch: org.json.JSONException -> L7d
            int r1 = r1 + r2
            r13.mPlayingStallCount = r1     // Catch: org.json.JSONException -> L7d
            int r1 = r13.mPlayingStallTime     // Catch: org.json.JSONException -> L7d
            long r5 = (long) r1     // Catch: org.json.JSONException -> L7d
            long r7 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L7d
            long r9 = r13.mPlayingStallStartTime     // Catch: org.json.JSONException -> L7d
            long r7 = r7 - r9
            long r5 = r5 + r7
            int r1 = (int) r5     // Catch: org.json.JSONException -> L7d
            r13.mPlayingStallTime = r1     // Catch: org.json.JSONException -> L7d
            goto L80
        L7d:
            r14 = move-exception
            goto L110
        L80:
            long r5 = r13.mStallTotalCount     // Catch: org.json.JSONException -> L7d
            r7 = 1
            long r5 = r5 + r7
            r13.mStallTotalCount = r5     // Catch: org.json.JSONException -> L7d
            long r5 = r13.mStallTotalTime     // Catch: org.json.JSONException -> L7d
            long r9 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L7d
            long r11 = r13.mStallStartTime     // Catch: org.json.JSONException -> L7d
            long r9 = r9 - r11
            long r5 = r5 + r9
            r13.mStallTotalTime = r5     // Catch: org.json.JSONException -> L7d
            int r1 = r13.mEnableReportSessionStop     // Catch: org.json.JSONException -> L7d
            if (r1 != r2) goto La8
            long r1 = r13.mSessionStallTotalCount     // Catch: org.json.JSONException -> L7d
            long r1 = r1 + r7
            r13.mSessionStallTotalCount = r1     // Catch: org.json.JSONException -> L7d
            long r1 = r13.mSessionStallTotalTime     // Catch: org.json.JSONException -> L7d
            long r5 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L7d
            long r9 = r13.mStallStartTime     // Catch: org.json.JSONException -> L7d
            long r5 = r5 - r9
            long r1 = r1 + r5
            r13.mSessionStallTotalTime = r1     // Catch: org.json.JSONException -> L7d
        La8:
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "stall"
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L7d
            java.lang.String r2 = "stall_start"
            long r5 = r13.mStallStartTime     // Catch: org.json.JSONException -> L7d
            org.json.JSONObject r1 = r1.put(r2, r5)     // Catch: org.json.JSONException -> L7d
            java.lang.String r2 = "stall_end"
            long r5 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L7d
            org.json.JSONObject r1 = r1.put(r2, r5)     // Catch: org.json.JSONException -> L7d
            java.lang.String r2 = "video_buffer_time_stall_start"
            com.bykv.vk.component.ttvideo.log.LogBundle r5 = r13.mLogBundle     // Catch: org.json.JSONException -> L7d
            long r5 = r5.videoBufferTimeOnStallStart     // Catch: org.json.JSONException -> L7d
            org.json.JSONObject r1 = r1.put(r2, r5)     // Catch: org.json.JSONException -> L7d
            java.lang.String r2 = "audio_buffer_time_stall_start"
            com.bykv.vk.component.ttvideo.log.LogBundle r5 = r13.mLogBundle     // Catch: org.json.JSONException -> L7d
            long r5 = r5.audioBufferTimeOnStallStart     // Catch: org.json.JSONException -> L7d
            org.json.JSONObject r1 = r1.put(r2, r5)     // Catch: org.json.JSONException -> L7d
            java.lang.String r2 = "video_buffer_time_stall_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r5 = r13.mLogBundle     // Catch: org.json.JSONException -> L7d
            long r5 = r5.videoBufferTimeOnStallEnd     // Catch: org.json.JSONException -> L7d
            org.json.JSONObject r1 = r1.put(r2, r5)     // Catch: org.json.JSONException -> L7d
            java.lang.String r2 = "audio_buffer_time_stall_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r5 = r13.mLogBundle     // Catch: org.json.JSONException -> L7d
            long r5 = r5.audioBufferTimeOnStallEnd     // Catch: org.json.JSONException -> L7d
            org.json.JSONObject r1 = r1.put(r2, r5)     // Catch: org.json.JSONException -> L7d
            java.lang.String r2 = "last_res"
            java.lang.String r5 = r13.mLastResolution     // Catch: org.json.JSONException -> L7d
            org.json.JSONObject r1 = r1.put(r2, r5)     // Catch: org.json.JSONException -> L7d
            java.lang.String r2 = "reason"
            long r5 = r13.mStallReason     // Catch: org.json.JSONException -> L7d
            org.json.JSONObject r1 = r1.put(r2, r5)     // Catch: org.json.JSONException -> L7d
            java.lang.String r2 = "recover_reason"
            r1.put(r2, r14)     // Catch: org.json.JSONException -> L7d
            com.bykv.vk.component.ttvideo.ILiveListener r14 = r13.mLogUploader     // Catch: org.json.JSONException -> L7d
            java.lang.String r1 = "live_client_monitor_log"
            r14.onMonitorLog(r0, r1)     // Catch: org.json.JSONException -> L7d
            long r0 = r13.mLogTotalCount     // Catch: org.json.JSONException -> L7d
            int r14 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r14 <= 0) goto L113
            long r0 = r0 + r7
            r13.mLogTotalCount = r0     // Catch: org.json.JSONException -> L7d
            return
        L110:
            com.bytedance.sdk.component.utils.vl.j(r14)
        L113:
            return
    }

    public void onStallStart(int r9, boolean r10) {
            r8 = this;
            r0 = -100015(0xfffffffffffe7951, float:NaN)
            r8.mErrorCode = r0
            if (r10 != 0) goto L8
            return
        L8:
            com.bykv.vk.component.ttvideo.VideoLiveManager r10 = r8.mLiveEngine
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r8.mLogBundle
            r1 = 5
            r10.getLogInfo(r0, r1)
            long r0 = java.lang.System.currentTimeMillis()
            r8.mStallStartTime = r0
            long r2 = r8.mFirstStallStartTime
            r4 = 0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 != 0) goto L20
            r8.mFirstStallStartTime = r0
        L20:
            int r10 = r8.mEnableReportSessionStop
            r2 = 1
            if (r10 != r2) goto L31
            long r6 = r8.mSessionFirstStallStartTime
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 != 0) goto L2d
            r8.mSessionFirstStallStartTime = r0
        L2d:
            int r10 = r8.mErrorCode
            r8.mSessionErrorCode = r10
        L31:
            r8.mPlayingStallStartTime = r0
            long r9 = (long) r9
            r8.mStallReason = r9
            r8.mIsStalling = r2
            java.util.ArrayList<java.lang.Long> r9 = r8.mStallTimeSeries
            if (r9 != 0) goto L43
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r8.mStallTimeSeries = r9
        L43:
            java.util.ArrayList<java.lang.Long> r9 = r8.mStallTimeSeries
            long r0 = r8.mStallStartTime
            com.bykv.vk.component.ttvideo.log.LogBundle r10 = r8.mLogBundle
            long r2 = r10.startPlayTime
            long r0 = r0 - r2
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            r9.add(r10)
            return
    }

    public void onStop(java.lang.String r24) {
            r23 = this;
            r1 = r23
            java.lang.String r0 = "cmaf"
            boolean r2 = r1.mHasFirstFrame
            r3 = 1
            if (r2 == 0) goto Ld
            r1.report(r3)
            goto L1d
        Ld:
            com.bykv.vk.component.ttvideo.VideoLiveManager r2 = r1.mLiveEngine
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle
            r5 = 2
            r2.getLogInfo(r4, r5)
            int r2 = r1.mRetryTotalCount
            r1.mFirstFrameRetryCount = r2
            long r4 = r1.mLastPrepareTime
            r1.mFirstFramePrepareTime = r4
        L1d:
            r1.onSessionStop()
            r1.resetSessionInfo()
            org.json.JSONObject r2 = r1.createCommonLog()
            if (r2 == 0) goto L5bd
            boolean r4 = r1.mHasFirstFrame     // Catch: org.json.JSONException -> L38
            r5 = 0
            if (r4 == 0) goto L3b
            long r7 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L38
            long r9 = r1.mFirstFrameTimestamp     // Catch: org.json.JSONException -> L38
            long r7 = r7 - r9
            r9 = r5
            goto L55
        L38:
            r0 = move-exception
            goto L5ba
        L3b:
            int r4 = r1.mErrorCode     // Catch: org.json.JSONException -> L38
            if (r4 != 0) goto L53
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.startPlayTime     // Catch: org.json.JSONException -> L38
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L53
            long r7 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L38
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r9 = r4.startPlayTime     // Catch: org.json.JSONException -> L38
            long r7 = r7 - r9
            r9 = r7
            r7 = r5
            goto L55
        L53:
            r7 = r5
            r9 = r7
        L55:
            long r11 = r1.mFirstStallStartTime     // Catch: org.json.JSONException -> L38
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 <= 0) goto L66
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r13 = r4.videoRenderTimestamp     // Catch: org.json.JSONException -> L38
            long r13 = r11 - r13
            r15 = r5
            long r5 = r1.mFirstStallEndTime     // Catch: org.json.JSONException -> L38
            long r5 = r5 - r11
            goto L68
        L66:
            r15 = r5
            r13 = r5
        L68:
            boolean r4 = r1.isStalling()     // Catch: org.json.JSONException -> L38
            if (r4 == 0) goto L85
            r17 = 1
            long r11 = r1.mStallTotalCount     // Catch: org.json.JSONException -> L38
            long r11 = r11 + r17
            r1.mStallTotalCount = r11     // Catch: org.json.JSONException -> L38
            long r11 = r1.mStallTotalTime     // Catch: org.json.JSONException -> L38
            long r19 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L38
            long r3 = r1.mStallStartTime     // Catch: org.json.JSONException -> L38
            long r19 = r19 - r3
            long r11 = r11 + r19
            r1.mStallTotalTime = r11     // Catch: org.json.JSONException -> L38
            goto L87
        L85:
            r17 = 1
        L87:
            boolean r3 = r1.isInErrorRecovering()     // Catch: org.json.JSONException -> L38
            if (r3 == 0) goto La8
            long r3 = r1.mErrorStartTime     // Catch: org.json.JSONException -> L38
            int r11 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r11 == 0) goto La8
            long r3 = r1.mErrorRecoverCount     // Catch: org.json.JSONException -> L38
            long r3 = r3 + r17
            r1.mErrorRecoverCount = r3     // Catch: org.json.JSONException -> L38
            long r3 = r1.mErrorRecoverTime     // Catch: org.json.JSONException -> L38
            long r11 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L38
            r19 = r3
            long r3 = r1.mErrorStartTime     // Catch: org.json.JSONException -> L38
            long r11 = r11 - r3
            long r3 = r19 + r11
            r1.mErrorRecoverTime = r3     // Catch: org.json.JSONException -> L38
        La8:
            r1.calculateRenderFailType()     // Catch: org.json.JSONException -> L38
            long r3 = r1.mLastTotalDownloadSize     // Catch: org.json.JSONException -> L38
            com.bykv.vk.component.ttvideo.log.LogBundle r11 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r11 = r11.downloadSize     // Catch: org.json.JSONException -> L38
            long r3 = r3 + r11
            java.lang.String r11 = "event_key"
            java.lang.String r12 = "play_stop"
            org.json.JSONObject r11 = r2.put(r11, r12)     // Catch: org.json.JSONException -> L38
            java.lang.String r12 = "stop_time"
            r19 = r2
            r21 = r3
            long r2 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r11.put(r12, r2)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "play_time"
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "is_stream_received"
            boolean r4 = r1.mHasFirstFrame     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "render_fail_type"
            int r4 = r1.mRenderFailType     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "code"
            int r4 = r1.mErrorCode     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "stall_count"
            long r7 = r1.mStallTotalCount     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "stall_time"
            long r7 = r1.mStallTotalTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "audio_render_stall_count"
            long r7 = r1.mAudioRenderStallTotalCount     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "audio_render_stall_time"
            long r7 = r1.mAudioRenderStallTotalTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "video_render_stall_count"
            long r7 = r1.mVideoRenderStallTotalCount     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "video_render_stall_time"
            long r7 = r1.mVideoRenderStallTotalTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "video_decode_stall_count"
            long r7 = r1.mVideoDecodeStallTotalCount     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "video_decode_stall_time"
            long r7 = r1.mVideoDecodeStallTotalTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "audio_decode_stall_count"
            long r7 = r1.mAudioDecodeStallTotalCount     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "audio_decode_stall_time"
            long r7 = r1.mAudioDecodeStallTotalTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "video_demux_stall_count"
            long r7 = r1.mVideoDemuxStallTotalCount     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "video_demux_stall_time"
            long r7 = r1.mVideoDemuxStallTotalTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "audio_demux_stall_count"
            long r7 = r1.mAudioDemuxStallTotalCount     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "audio_demux_stall_time"
            long r7 = r1.mAudioDemuxStallTotalTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "error_recover_count"
            long r7 = r1.mErrorRecoverCount     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "error_recover_time"
            long r7 = r1.mErrorRecoverTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "start"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.startPlayTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "sdk_dns_analysis_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.SDKDNSTimeStamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "http_req_finish_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.httpReqFinishTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "http_res_finish_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.httpResFinishTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "first_video_package_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.videoPacketTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "first_audio_package_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.audioPacketTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "first_video_frame_decode_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.videoDecodeTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "first_audio_frame_decode_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.audioDecodeTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "first_frame_render_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.videoRenderTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "first_audio_frame_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.audioRenderTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "video_device_open_start"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.videoDeviceOpenTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "video_device_open_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.videoDeviceOpenedTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "audio_device_open_start"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.audioDeviceOpenTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "audio_device_open_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.audioDeviceOpenedTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "video_device_wait_start"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.videoDeviceWaitStartTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "video_device_wait_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.videoDeviceWaitEndTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "find_stream_info_start"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.streamInfoFindTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "find_stream_info_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.streamInfoFoundTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "video_param_send_outlet_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.videoParamSendOutletTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "first_video_frame_send_outlet_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.firstVideoFrameSendOutletTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "video_first_pkt_pos"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.videoFirstPacketPos     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "video_first_pkt_pts"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.videoFirstPacketPts     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "audio_first_pkt_pos"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.audioFirstPacketPos     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "audio_first_pkt_pts"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.audioFirstPacketPts     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "set_surface_time"
            long r7 = r1.mSetSurfaceTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "set_surface_cost"
            long r7 = r1.mSetSurfaceCost     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "video_render_type"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            int r4 = r4.renderType     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "prepare_block_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.callPrepareTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "prepare_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.prepareEndTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "retry_count"
            int r4 = r1.mRetryTotalCount     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "download_speed"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.downloadSpeedOnFirstFrame     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "video_buffer_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.videoBufferTimeOnFirstFrame     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "audio_buffer_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.audioBufferTimeOnFirstFrame     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "wait_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.waitingTimeAfterFirstFrame     // Catch: org.json.JSONException -> L38
            int r4 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r4 <= 0) goto L2b5
            goto L2b6
        L2b5:
            long r7 = -r7
        L2b6:
            org.json.JSONObject r2 = r2.put(r3, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "is_waiting"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r4.waitingTimeAfterFirstFrame     // Catch: org.json.JSONException -> L38
            int r4 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r4 < 0) goto L2c6
            r4 = 0
            goto L2c7
        L2c6:
            r4 = 1
        L2c7:
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "first_stall_time"
            org.json.JSONObject r2 = r2.put(r3, r13)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "first_stall_duration"
            org.json.JSONObject r2 = r2.put(r3, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "call_api_name"
            r4 = r24
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "play_time_on_no_frame"
            org.json.JSONObject r2 = r2.put(r3, r9)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "abr_switch_count"
            int r4 = r1.mAbrSwitchCount     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "abr_switch_count_info"
            java.lang.String r4 = r1.mAbrSwitchCountInfo     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "sdk_params"
            java.lang.String r4 = r1.mSdkParams     // Catch: org.json.JSONException -> L38
            if (r4 != 0) goto L2fd
            java.lang.String r4 = "none"
        L2fd:
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "total_download_size"
            r4 = r21
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "drop_audio_pts_diff"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r4 = r4.dropAudioPts     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "drop_audio_cost"
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r4 = r4.dropAudioCostTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "first_frame_retry_count"
            int r4 = r1.mFirstFrameRetryCount     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "first_frame_retry_duration"
            long r4 = r1.mFirstFramePrepareTime     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "abr_check_enhance"
            int r4 = r1.mEnableLiveAbrCheckEnhance     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "sr_used"
            boolean r4 = r1.mSRSuccess     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "sharpen_used"
            boolean r4 = r1.mHasUsedSharpen     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "network_timeout"
            int r4 = r1.mNetworkTimeoutMs     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "suggest_format"
            java.lang.String r4 = r1.mSuggestFormat     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "suggest_protocol"
            java.lang.String r4 = r1.mSuggestProtocol     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "session_num"
            int r4 = r1.mSessionNum     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "use_live_threadpool"
            int r4 = r1.mUseLiveThreadPool     // Catch: org.json.JSONException -> L38
            r2.put(r3, r4)     // Catch: org.json.JSONException -> L38
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            org.json.JSONArray r2 = r2.mABRStreamInfo     // Catch: org.json.JSONException -> L38
            if (r2 == 0) goto L37a
            java.lang.String r3 = "abr_stream_info"
            r4 = r19
            r4.put(r3, r2)     // Catch: org.json.JSONException -> L38
            goto L37c
        L37a:
            r4 = r19
        L37c:
            int r2 = r1.mAudioTimescaleEnable     // Catch: org.json.JSONException -> L38
            r3 = -1
            if (r2 == r3) goto L386
            java.lang.String r3 = "audio_timescale_enable"
            r4.put(r3, r2)     // Catch: org.json.JSONException -> L38
        L386:
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            org.json.JSONArray r2 = r2.avphStreamInfo     // Catch: org.json.JSONException -> L38
            if (r2 == 0) goto L391
            java.lang.String r3 = "avph_stream_info"
            r4.put(r3, r2)     // Catch: org.json.JSONException -> L38
        L391:
            com.bykv.vk.component.ttvideo.VideoLiveManager r2 = r1.mLiveEngine     // Catch: org.json.JSONException -> L38
            int r2 = r2.getEnableTexturerender()     // Catch: org.json.JSONException -> L38
            r3 = 1
            if (r2 != r3) goto L3a8
            java.lang.String r2 = "render_start_timestamp"
            long r5 = r1.mRenderStartNotifyTimeStamp     // Catch: org.json.JSONException -> L38
            r4.put(r2, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "texturerender_renderstart_timestamp"
            long r5 = r1.mTextureRenderFirstFrameTime     // Catch: org.json.JSONException -> L38
            r4.put(r2, r5)     // Catch: org.json.JSONException -> L38
        L3a8:
            int r2 = r1.mNoSyncCount     // Catch: org.json.JSONException -> L38
            if (r2 <= 0) goto L3c1
            java.lang.String r3 = "av_out_sync_count"
            org.json.JSONObject r2 = r4.put(r3, r2)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "av_out_sync_duration"
            long r5 = r1.mNoSyncTimeDuration     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "av_out_sync_info"
            java.lang.String r5 = r1.mNoSyncInfoStr     // Catch: org.json.JSONException -> L38
            r2.put(r3, r5)     // Catch: org.json.JSONException -> L38
        L3c1:
            r1.reportQuicOpenResult(r4)     // Catch: org.json.JSONException -> L38
            boolean r2 = r1.isRtcPlayAvailable()     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "tcp_first_package_end"
            java.lang.String r5 = "player_dns_analysis_end"
            java.lang.String r6 = "tcp_connect_end"
            if (r2 == 0) goto L419
            long r7 = r1.mRtcDnsTimeStamp     // Catch: org.json.JSONException -> L38
            r4.put(r5, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "rtc_use_sdk_dns"
            int r5 = r1.mRtcUseSdkDns     // Catch: org.json.JSONException -> L38
            r4.put(r2, r5)     // Catch: org.json.JSONException -> L38
            long r7 = r1.mRtcTcpConnectTimeStamp     // Catch: org.json.JSONException -> L38
            r4.put(r6, r7)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "rtc_tls_handshake_end"
            long r5 = r1.mRtcTlsHandshakedTimeStamp     // Catch: org.json.JSONException -> L38
            r4.put(r2, r5)     // Catch: org.json.JSONException -> L38
            long r5 = r1.mRtcTcpFirstPackageTimeStamp     // Catch: org.json.JSONException -> L38
            r4.put(r3, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "rtc_inited_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r3.rtcInitedTime     // Catch: org.json.JSONException -> L38
            r4.put(r2, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "rtc_offer_send_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r3.rtcOfferSendTime     // Catch: org.json.JSONException -> L38
            r4.put(r2, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "rtc_answer_recv_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r3.rtcAnswerRecvTime     // Catch: org.json.JSONException -> L38
            r4.put(r2, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "rtc_start_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r3.rtcStartTime     // Catch: org.json.JSONException -> L38
            r4.put(r2, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "rtc_playstop_info"
            java.lang.String r3 = r1.mRtcPlayStopStatInfo     // Catch: org.json.JSONException -> L38
            r4.put(r2, r3)     // Catch: org.json.JSONException -> L38
            goto L449
        L419:
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r7 = r2.tcpFirstPacketTimestamp     // Catch: org.json.JSONException -> L38
            r4.put(r3, r7)     // Catch: org.json.JSONException -> L38
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r2 = r2.playerDNSTimestamp     // Catch: org.json.JSONException -> L38
            r4.put(r5, r2)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = r1.mCdnPlayURL     // Catch: org.json.JSONException -> L38
            if (r2 != 0) goto L433
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r2 = r2.tcpConnectTimestamp     // Catch: org.json.JSONException -> L38
            r4.put(r6, r2)     // Catch: org.json.JSONException -> L38
            goto L449
        L433:
            java.lang.String r2 = r1.mProtocol     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "kcp"
            boolean r2 = r2.equals(r3)     // Catch: org.json.JSONException -> L38
            if (r2 == 0) goto L442
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r2 = r2.playerDNSTimestamp     // Catch: org.json.JSONException -> L38
            goto L446
        L442:
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r2 = r2.tcpConnectTimestamp     // Catch: org.json.JSONException -> L38
        L446:
            r4.put(r6, r2)     // Catch: org.json.JSONException -> L38
        L449:
            java.lang.String r2 = r1.mStreamFormat     // Catch: org.json.JSONException -> L38
            if (r2 == 0) goto L517
            boolean r2 = r2.equals(r0)     // Catch: org.json.JSONException -> L38
            if (r2 != 0) goto L45d
            java.lang.String r2 = r1.mStreamFormat     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "avph"
            boolean r2 = r2.equals(r3)     // Catch: org.json.JSONException -> L38
            if (r2 == 0) goto L517
        L45d:
            java.lang.String r2 = "video_dns_analysis_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r3.videoDNSTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r4.put(r2, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "audio_dns_analysis_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r5 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r5.audioDNSTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "video_tcp_connect_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r5 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r5.videoTcpConnectTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "audio_tcp_connect_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r5 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r5.audioTcpConnectTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "video_tcp_first_packet_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r5 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r5.videoTcpFirstPacketTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "audio_tcp_first_packet_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r5 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r5.audioTcpFirstPacketTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "video_http_req_finish_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r5 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r5.videoHttpReqFinishTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "audio_http_req_finish_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r5 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r5.audioHttpReqFinishTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "video_http_res_finish_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r5 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r5.videoHttpResFinishTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r2 = r2.put(r3, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = "audio_http_res_finish_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r5 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r5.audioHttpResFinishTimestamp     // Catch: org.json.JSONException -> L38
            r2.put(r3, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = r1.mStreamFormat     // Catch: org.json.JSONException -> L38
            boolean r0 = r2.equals(r0)     // Catch: org.json.JSONException -> L38
            if (r0 == 0) goto L517
            java.lang.String r0 = "cmaf_mpd_dns_analysis_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r2 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r2 = r2.cmafMpdDNSTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r0 = r4.put(r0, r2)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "cmaf_mpd_tcp_connect_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r3.cmafMpdTcpConntectTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r0 = r0.put(r2, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "cmaf_mpd_tcp_first_package_end"
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r3.cmafMdpTcpFirstPacketTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r0 = r0.put(r2, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "cmaf_mpd_http_req_finish_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r3.cmafMdpHttpReqFinishTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r0 = r0.put(r2, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "cmaf_mpd_http_res_finish_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r3.cmafMdpHttpResFinishTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r0 = r0.put(r2, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "cmaf_audio_firstseg_connect_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r3.cmafAudioFirstSegConntectTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r0 = r0.put(r2, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "cmaf_video_firstseg_connect_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r3.cmafVideoFirstSegConntectTimestamp     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r0 = r0.put(r2, r5)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "cmaf_mpd_connect_time"
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r1.mLogBundle     // Catch: org.json.JSONException -> L38
            long r5 = r3.cmafMpdConntectTimestamp     // Catch: org.json.JSONException -> L38
            r0.put(r2, r5)     // Catch: org.json.JSONException -> L38
        L517:
            boolean r0 = r1.mEnableUploadSessionSeries     // Catch: org.json.JSONException -> L38
            if (r0 == 0) goto L524
            java.lang.String r0 = "session_time_series"
            org.json.JSONObject r2 = r1._createSessionTimeSeries()     // Catch: org.json.JSONException -> L38
            r4.put(r0, r2)     // Catch: org.json.JSONException -> L38
        L524:
            boolean r0 = r1.mEnableCheckSei     // Catch: org.json.JSONException -> L38
            if (r0 == 0) goto L544
            java.lang.String r0 = "expected_sei_count"
            int r2 = r1.mExpectedSeiCount     // Catch: org.json.JSONException -> L38
            r4.put(r0, r2)     // Catch: org.json.JSONException -> L38
            java.lang.String r0 = "received_sei_count"
            int r2 = r1.mReceivedSeiCount     // Catch: org.json.JSONException -> L38
            r4.put(r0, r2)     // Catch: org.json.JSONException -> L38
            java.lang.String r0 = "expected_unique_sei_count"
            int r2 = r1.mExpectedUniqueSeiCount     // Catch: org.json.JSONException -> L38
            r4.put(r0, r2)     // Catch: org.json.JSONException -> L38
            java.lang.String r0 = "received_unique_sei_count"
            int r2 = r1.mReceivedUniqueSeiCount     // Catch: org.json.JSONException -> L38
            r4.put(r0, r2)     // Catch: org.json.JSONException -> L38
        L544:
            int r0 = r1.mBitRateAbnormalType     // Catch: org.json.JSONException -> L38
            if (r0 == 0) goto L54d
            java.lang.String r2 = "bitrate_amnormal"
            r4.put(r2, r0)     // Catch: org.json.JSONException -> L38
        L54d:
            int r0 = r1.mCodecNotSame     // Catch: org.json.JSONException -> L38
            if (r0 == 0) goto L556
            java.lang.String r2 = "abr_codec_not_same"
            r4.put(r2, r0)     // Catch: org.json.JSONException -> L38
        L556:
            int r0 = r1.mABRListMatch     // Catch: org.json.JSONException -> L38
            if (r0 != 0) goto L560
            java.lang.String r0 = "abr_list_not_match"
            r3 = 1
            r4.put(r0, r3)     // Catch: org.json.JSONException -> L38
        L560:
            java.lang.String r0 = r1.mProtocol     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "quic"
            boolean r0 = android.text.TextUtils.equals(r0, r2)     // Catch: org.json.JSONException -> L38
            if (r0 != 0) goto L574
            java.lang.String r0 = r1.mProtocol     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "quicu"
            boolean r0 = android.text.TextUtils.equals(r0, r2)     // Catch: org.json.JSONException -> L38
            if (r0 == 0) goto L593
        L574:
            java.lang.String r0 = "scfg"
            int r2 = r1.mQuicScfgConfig     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r0 = r4.put(r0, r2)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "mtu"
            int r3 = r1.mQuicMtu     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r0 = r0.put(r2, r3)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "pad_hello"
            int r3 = r1.mQuicPadHello     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r0 = r0.put(r2, r3)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "timer_version"
            int r3 = r1.mQuicTimerVersion     // Catch: org.json.JSONException -> L38
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L38
        L593:
            boolean r0 = r1.mIsCdnAbrSwitch     // Catch: org.json.JSONException -> L38
            if (r0 == 0) goto L5a4
            java.lang.String r2 = "cdn_abr_switch_performed"
            org.json.JSONObject r0 = r4.put(r2, r0)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "cdn_abr_switch_code"
            int r3 = r1.mCdnAbrSwitchCode     // Catch: org.json.JSONException -> L38
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L38
        L5a4:
            long r2 = r1.mLogTotalCount     // Catch: org.json.JSONException -> L38
            long r2 = r2 + r17
            r1.mLogTotalCount = r2     // Catch: org.json.JSONException -> L38
            java.lang.String r0 = "log_total_count_when_playing"
            r4.put(r0, r2)     // Catch: org.json.JSONException -> L38
            com.bykv.vk.component.ttvideo.ILiveListener r0 = r1.mLogUploader     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "live_client_monitor_log"
            r0.onMonitorLog(r4, r2)     // Catch: org.json.JSONException -> L38
            r2 = r15
            r1.mLogTotalCount = r2     // Catch: org.json.JSONException -> L38
            return
        L5ba:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L5bd:
            return
    }

    public void onSwitch(java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8) {
            r4 = this;
            com.bykv.vk.component.ttvideo.VideoLiveManager r0 = r4.mLiveEngine
            if (r0 == 0) goto L5d
            com.bykv.vk.component.ttvideo.ILiveListener r0 = r4.mLogUploader
            if (r0 != 0) goto L9
            goto L5d
        L9:
            org.json.JSONObject r0 = r4.createCommonLog()     // Catch: org.json.JSONException -> L59
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "switch_url"
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L59
            java.lang.String r2 = "last_cdn_play_url"
            java.lang.String r3 = "null"
            if (r5 != 0) goto L1c
            r5 = r3
        L1c:
            org.json.JSONObject r5 = r1.put(r2, r5)     // Catch: org.json.JSONException -> L59
            java.lang.String r1 = "next_cdn_play_url"
            if (r6 != 0) goto L25
            r6 = r3
        L25:
            org.json.JSONObject r5 = r5.put(r1, r6)     // Catch: org.json.JSONException -> L59
            java.lang.String r6 = "res_bitrate"
            long r1 = r4.mResBitrate     // Catch: org.json.JSONException -> L59
            org.json.JSONObject r5 = r5.put(r6, r1)     // Catch: org.json.JSONException -> L59
            java.lang.String r6 = "last_res"
            java.lang.String r1 = r4.mLastResolution     // Catch: org.json.JSONException -> L59
            org.json.JSONObject r5 = r5.put(r6, r1)     // Catch: org.json.JSONException -> L59
            java.lang.String r6 = "code"
            org.json.JSONObject r5 = r5.put(r6, r8)     // Catch: org.json.JSONException -> L59
            java.lang.String r6 = "reason"
            r5.put(r6, r7)     // Catch: org.json.JSONException -> L59
            com.bykv.vk.component.ttvideo.ILiveListener r5 = r4.mLogUploader     // Catch: org.json.JSONException -> L59
            java.lang.String r6 = "live_client_monitor_log"
            r5.onMonitorLog(r0, r6)     // Catch: org.json.JSONException -> L59
            long r5 = r4.mLogTotalCount     // Catch: org.json.JSONException -> L59
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L5d
            r7 = 1
            long r5 = r5 + r7
            r4.mLogTotalCount = r5     // Catch: org.json.JSONException -> L59
            return
        L59:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
        L5d:
            return
    }

    public void onSwitchURL(java.lang.String r1) {
            r0 = this;
            r0.mCurrentPlayURL = r1
            return
    }

    public void onUpdateMetaData(java.lang.String r18) {
            r17 = this;
            r1 = r17
            r0 = r18
            java.lang.String r2 = "h_id"
            java.lang.String r3 = "link_info"
            java.lang.String r4 = "qId"
            java.lang.String r5 = "push_protocol"
            java.lang.String r6 = "hit_node_optimize"
            java.lang.String r7 = "default_bitrate"
            java.lang.String r8 = "max_bitrate"
            java.lang.String r9 = "min_bitrate"
            java.lang.String r10 = "is_hardware_encode"
            java.lang.String r11 = "start_time"
            java.lang.String r12 = "model"
            java.lang.String r13 = "os_version"
            java.lang.String r14 = "platform"
            java.lang.String r15 = "sdk_version"
            if (r0 != 0) goto L24
            goto Ld9
        L24:
            r16 = r2
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L38
            r2.<init>(r0)     // Catch: org.json.JSONException -> L38
            boolean r0 = r2.has(r15)     // Catch: org.json.JSONException -> L38
            if (r0 == 0) goto L3b
            java.lang.String r0 = r2.getString(r15)     // Catch: org.json.JSONException -> L38
            r1.mPushClientSDKVersion = r0     // Catch: org.json.JSONException -> L38
            goto L3b
        L38:
            r0 = move-exception
            goto Lda
        L3b:
            boolean r0 = r2.has(r14)     // Catch: org.json.JSONException -> L38
            if (r0 == 0) goto L47
            java.lang.String r0 = r2.getString(r14)     // Catch: org.json.JSONException -> L38
            r1.mPushClientPlatform = r0     // Catch: org.json.JSONException -> L38
        L47:
            boolean r0 = r2.has(r13)     // Catch: org.json.JSONException -> L38
            if (r0 == 0) goto L53
            java.lang.String r0 = r2.getString(r13)     // Catch: org.json.JSONException -> L38
            r1.mPushClientOSVersion = r0     // Catch: org.json.JSONException -> L38
        L53:
            boolean r0 = r2.has(r12)     // Catch: org.json.JSONException -> L38
            if (r0 == 0) goto L5f
            java.lang.String r0 = r2.getString(r12)     // Catch: org.json.JSONException -> L38
            r1.mPushClientModel = r0     // Catch: org.json.JSONException -> L38
        L5f:
            boolean r0 = r2.has(r11)     // Catch: org.json.JSONException -> L38
            if (r0 == 0) goto L6b
            java.lang.String r0 = r2.getString(r11)     // Catch: org.json.JSONException -> L38
            r1.mPushClientStartTime = r0     // Catch: org.json.JSONException -> L38
        L6b:
            boolean r0 = r2.has(r10)     // Catch: org.json.JSONException -> L38
            if (r0 == 0) goto L77
            int r0 = r2.getInt(r10)     // Catch: org.json.JSONException -> L38
            r1.mPushClientHardwareEncode = r0     // Catch: org.json.JSONException -> L38
        L77:
            boolean r0 = r2.has(r9)     // Catch: org.json.JSONException -> L38
            if (r0 == 0) goto L83
            int r0 = r2.getInt(r9)     // Catch: org.json.JSONException -> L38
            r1.mPushClientMinBitrate = r0     // Catch: org.json.JSONException -> L38
        L83:
            boolean r0 = r2.has(r8)     // Catch: org.json.JSONException -> L38
            if (r0 == 0) goto L8f
            int r0 = r2.getInt(r8)     // Catch: org.json.JSONException -> L38
            r1.mPushClientMaxBitrate = r0     // Catch: org.json.JSONException -> L38
        L8f:
            boolean r0 = r2.has(r7)     // Catch: org.json.JSONException -> L38
            if (r0 == 0) goto L9b
            int r0 = r2.getInt(r7)     // Catch: org.json.JSONException -> L38
            r1.mPushClientDefaultBitrate = r0     // Catch: org.json.JSONException -> L38
        L9b:
            boolean r0 = r2.has(r6)     // Catch: org.json.JSONException -> L38
            if (r0 == 0) goto La7
            int r0 = r2.getInt(r6)     // Catch: org.json.JSONException -> L38
            r1.mPushClientHitNodeOptimize = r0     // Catch: org.json.JSONException -> L38
        La7:
            boolean r0 = r2.has(r5)     // Catch: org.json.JSONException -> L38
            if (r0 == 0) goto Lb3
            java.lang.String r0 = r2.getString(r5)     // Catch: org.json.JSONException -> L38
            r1.mPushClientPushProtocal = r0     // Catch: org.json.JSONException -> L38
        Lb3:
            boolean r0 = r2.has(r4)     // Catch: org.json.JSONException -> L38
            if (r0 == 0) goto Lbf
            java.lang.String r0 = r2.getString(r4)     // Catch: org.json.JSONException -> L38
            r1.mPushClientQId = r0     // Catch: org.json.JSONException -> L38
        Lbf:
            boolean r0 = r2.has(r3)     // Catch: org.json.JSONException -> L38
            if (r0 == 0) goto Lcb
            java.lang.String r0 = r2.getString(r3)     // Catch: org.json.JSONException -> L38
            r1.mLinkInfo = r0     // Catch: org.json.JSONException -> L38
        Lcb:
            r0 = r16
            boolean r3 = r2.has(r0)     // Catch: org.json.JSONException -> L38
            if (r3 == 0) goto Ld9
            int r0 = r2.getInt(r0)     // Catch: org.json.JSONException -> L38
            r1.mFCDNTranscodeMethod = r0     // Catch: org.json.JSONException -> L38
        Ld9:
            return
        Lda:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    public void onUpdateSeiInfo(java.lang.String r19) {
            r18 = this;
            r1 = r18
            java.lang.String r0 = "sei_index"
            java.lang.String r2 = "real_video_framerate"
            java.lang.String r3 = "real_bitrate"
            java.lang.String r4 = "channel_id"
            java.lang.String r5 = "none"
            java.lang.String r6 = "vendor"
            java.lang.String r7 = "source"
            java.lang.String r8 = "ts"
            java.lang.String r9 = "trans_info"
            boolean r10 = android.text.TextUtils.isEmpty(r19)
            if (r10 != 0) goto L19f
            com.bykv.vk.component.ttvideo.log.LogBundle r10 = r1.mLogBundle
            if (r10 == 0) goto L19f
            com.bykv.vk.component.ttvideo.VideoLiveManager r10 = r1.mLiveEngine
            if (r10 != 0) goto L24
            goto L19f
        L24:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5c
            r11 = r19
            r10.<init>(r11)     // Catch: org.json.JSONException -> L5c
            boolean r11 = r10.has(r8)     // Catch: org.json.JSONException -> L5c
            r13 = 1
            if (r11 == 0) goto Lb7
            long r14 = r10.getLong(r8)     // Catch: org.json.JSONException -> L5c
            int r8 = r1.mEnableNTPTask     // Catch: org.json.JSONException -> L5c
            r16 = r14
            r14 = 0
            java.lang.String r11 = "tt_ntp"
            if (r8 != r13) goto L64
            boolean r8 = r10.has(r11)     // Catch: org.json.JSONException -> L5c
            if (r8 == 0) goto L64
            int r8 = r10.getInt(r11)     // Catch: org.json.JSONException -> L5c
            if (r8 != r13) goto L64
            boolean r8 = r1.mNTPRunning     // Catch: org.json.JSONException -> L5c
            if (r8 != 0) goto L5f
            com.bykv.vk.component.ttvideo.log.LiveLoggerService$MyNTPTask r8 = r1.mNTPTask     // Catch: org.json.JSONException -> L5c
            if (r8 == 0) goto L5f
            r12 = 103(0x67, float:1.44E-43)
            r8.sendEmptyMessageDelayed(r12, r14)     // Catch: org.json.JSONException -> L5c
            r1.mNTPRunning = r13     // Catch: org.json.JSONException -> L5c
            goto L5f
        L5c:
            r0 = move-exception
            goto L19c
        L5f:
            long r14 = r1.mTimeDiff     // Catch: org.json.JSONException -> L5c
            r1.mHasNTP = r13     // Catch: org.json.JSONException -> L5c
            goto L81
        L64:
            boolean r8 = r1.mNTPRunning     // Catch: org.json.JSONException -> L5c
            if (r8 == 0) goto L7e
            boolean r8 = r10.has(r11)     // Catch: org.json.JSONException -> L5c
            if (r8 != 0) goto L7e
            com.bykv.vk.component.ttvideo.log.LiveLoggerService$MyNTPTask r8 = r1.mNTPTask     // Catch: org.json.JSONException -> L5c
            if (r8 == 0) goto L7a
            android.os.Handler r8 = com.bykv.vk.component.ttvideo.log.LiveLoggerService.MyNTPTask.access$000(r8)     // Catch: org.json.JSONException -> L5c
            r12 = 0
            r8.removeCallbacksAndMessages(r12)     // Catch: org.json.JSONException -> L5c
        L7a:
            r8 = 0
            r1.mNTPRunning = r8     // Catch: org.json.JSONException -> L5c
            goto L7f
        L7e:
            r8 = 0
        L7f:
            r1.mHasNTP = r8     // Catch: org.json.JSONException -> L5c
        L81:
            int r8 = r1.mEnableNTP     // Catch: org.json.JSONException -> L5c
            if (r8 != r13) goto L9f
            boolean r8 = r10.has(r11)     // Catch: org.json.JSONException -> L5c
            if (r8 == 0) goto L9f
            int r8 = r10.getInt(r11)     // Catch: org.json.JSONException -> L5c
            if (r8 != r13) goto L9f
            com.bykv.vk.component.ttvideo.VideoLiveManager r8 = r1.mLiveEngine     // Catch: org.json.JSONException -> L5c
            if (r8 == 0) goto L9b
            long r11 = r8.getNtpTimeDiff()     // Catch: org.json.JSONException -> L5c
            r1.mTimeDiff = r11     // Catch: org.json.JSONException -> L5c
        L9b:
            long r14 = r1.mTimeDiff     // Catch: org.json.JSONException -> L5c
            r1.mHasNTP = r13     // Catch: org.json.JSONException -> L5c
        L9f:
            com.bykv.vk.component.ttvideo.log.LogBundle r8 = r1.mLogBundle     // Catch: org.json.JSONException -> L5c
            long r11 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L5c
            long r11 = r11 - r16
            long r11 = r11 + r14
            r8.delay = r11     // Catch: org.json.JSONException -> L5c
            com.bykv.vk.component.ttvideo.log.LogBundle r8 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L5c
            if (r8 == 0) goto Lb7
            long r11 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L5c
            long r11 = r11 - r16
            long r11 = r11 + r14
            r8.delay = r11     // Catch: org.json.JSONException -> L5c
        Lb7:
            com.bykv.vk.component.ttvideo.log.LogBundle r8 = r1.mLogBundle     // Catch: org.json.JSONException -> L5c
            java.lang.String r8 = r8.seiSource     // Catch: org.json.JSONException -> L5c
            boolean r11 = r10.has(r7)     // Catch: org.json.JSONException -> L5c
            java.lang.String r12 = "app_data"
            if (r11 == 0) goto Lcc
            com.bykv.vk.component.ttvideo.log.LogBundle r6 = r1.mLogBundle     // Catch: org.json.JSONException -> L5c
            java.lang.String r7 = r10.getString(r7)     // Catch: org.json.JSONException -> L5c
            r6.seiSource = r7     // Catch: org.json.JSONException -> L5c
            goto Le9
        Lcc:
            boolean r7 = r10.has(r12)     // Catch: org.json.JSONException -> L5c
            if (r7 == 0) goto Le9
            java.lang.String r7 = r10.optString(r12)     // Catch: org.json.JSONException -> L5c
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5c
            r11.<init>(r7)     // Catch: org.json.JSONException -> L5c
            boolean r7 = r11.has(r6)     // Catch: org.json.JSONException -> L5c
            if (r7 == 0) goto Le9
            com.bykv.vk.component.ttvideo.log.LogBundle r7 = r1.mLogBundle     // Catch: org.json.JSONException -> L5c
            java.lang.String r6 = r11.getString(r6)     // Catch: org.json.JSONException -> L5c
            r7.seiSource = r6     // Catch: org.json.JSONException -> L5c
        Le9:
            com.bykv.vk.component.ttvideo.log.LogBundle r6 = r1.mSessionLogBundle     // Catch: org.json.JSONException -> L5c
            if (r6 == 0) goto Lf3
            com.bykv.vk.component.ttvideo.log.LogBundle r7 = r1.mLogBundle     // Catch: org.json.JSONException -> L5c
            java.lang.String r7 = r7.seiSource     // Catch: org.json.JSONException -> L5c
            r6.seiSource = r7     // Catch: org.json.JSONException -> L5c
        Lf3:
            boolean r6 = r8.equals(r5)     // Catch: org.json.JSONException -> L5c
            if (r6 != 0) goto L113
            com.bykv.vk.component.ttvideo.log.LogBundle r6 = r1.mLogBundle     // Catch: org.json.JSONException -> L5c
            java.lang.String r6 = r6.seiSource     // Catch: org.json.JSONException -> L5c
            boolean r6 = r6.equals(r8)     // Catch: org.json.JSONException -> L5c
            if (r6 != 0) goto L113
            java.lang.String r6 = "TTLiveSDK"
            boolean r6 = r8.startsWith(r6)     // Catch: org.json.JSONException -> L5c
            if (r6 == 0) goto L10f
            r1.onLink(r13)     // Catch: org.json.JSONException -> L5c
            goto L113
        L10f:
            r8 = 0
            r1.onLink(r8)     // Catch: org.json.JSONException -> L5c
        L113:
            boolean r6 = r10.has(r12)     // Catch: org.json.JSONException -> L5c
            if (r6 == 0) goto L131
            java.lang.String r5 = r10.optString(r12)     // Catch: org.json.JSONException -> L5c
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5c
            r6.<init>(r5)     // Catch: org.json.JSONException -> L5c
            boolean r5 = r6.has(r4)     // Catch: org.json.JSONException -> L5c
            if (r5 == 0) goto L135
            com.bykv.vk.component.ttvideo.log.LogBundle r5 = r1.mLogBundle     // Catch: org.json.JSONException -> L5c
            java.lang.String r4 = r6.getString(r4)     // Catch: org.json.JSONException -> L5c
            r5.channelId = r4     // Catch: org.json.JSONException -> L5c
            goto L135
        L131:
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L5c
            r4.channelId = r5     // Catch: org.json.JSONException -> L5c
        L135:
            boolean r4 = r10.has(r3)     // Catch: org.json.JSONException -> L5c
            if (r4 == 0) goto L145
            com.bykv.vk.component.ttvideo.log.LogBundle r4 = r1.mLogBundle     // Catch: org.json.JSONException -> L5c
            int r3 = r10.getInt(r3)     // Catch: org.json.JSONException -> L5c
            r4.seiBitrate = r3     // Catch: org.json.JSONException -> L5c
            r1.mSeiHasBitrateAndFps = r13     // Catch: org.json.JSONException -> L5c
        L145:
            boolean r3 = r10.has(r2)     // Catch: org.json.JSONException -> L5c
            if (r3 == 0) goto L155
            com.bykv.vk.component.ttvideo.log.LogBundle r3 = r1.mLogBundle     // Catch: org.json.JSONException -> L5c
            int r2 = r10.getInt(r2)     // Catch: org.json.JSONException -> L5c
            r3.seiFps = r2     // Catch: org.json.JSONException -> L5c
            r1.mSeiHasBitrateAndFps = r13     // Catch: org.json.JSONException -> L5c
        L155:
            boolean r2 = r10.has(r9)     // Catch: org.json.JSONException -> L5c
            java.lang.String r3 = "tans_info"
            if (r2 != 0) goto L163
            boolean r2 = r10.has(r3)     // Catch: org.json.JSONException -> L5c
            if (r2 == 0) goto L18a
        L163:
            boolean r2 = r10.has(r9)     // Catch: org.json.JSONException -> L5c
            if (r2 == 0) goto L16e
            org.json.JSONObject r2 = r10.getJSONObject(r9)     // Catch: org.json.JSONException -> L5c
            goto L172
        L16e:
            org.json.JSONObject r2 = r10.getJSONObject(r3)     // Catch: org.json.JSONException -> L5c
        L172:
            if (r2 == 0) goto L18a
            java.lang.String r3 = "index"
            int r3 = r2.getInt(r3)     // Catch: org.json.JSONException -> L5c
            java.lang.String r4 = "sent_frames"
            int r4 = r2.getInt(r4)     // Catch: org.json.JSONException -> L5c
            java.lang.String r5 = "checked_dts"
            int r2 = r2.getInt(r5)     // Catch: org.json.JSONException -> L5c
            long r5 = (long) r2     // Catch: org.json.JSONException -> L5c
            r1.checkVideoFrame(r3, r4, r5)     // Catch: org.json.JSONException -> L5c
        L18a:
            boolean r2 = r1.mEnableCheckSei     // Catch: org.json.JSONException -> L5c
            if (r2 == 0) goto L19f
            boolean r2 = r10.has(r0)     // Catch: org.json.JSONException -> L5c
            if (r2 == 0) goto L19f
            int r0 = r10.getInt(r0)     // Catch: org.json.JSONException -> L5c
            r1.checkSeiIndex(r0)     // Catch: org.json.JSONException -> L5c
            return
        L19c:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L19f:
            return
    }

    public void onVideoSizeChanged(int r1, int r2) {
            r0 = this;
            r0.mWidth = r1
            r0.mHeight = r2
            return
    }

    public void onVideoStallCounter(long r8, long r10, long r12, long r14, long r16, long r18, long r20) {
            r7 = this;
            org.json.JSONObject r0 = r7.createCommonLog()
            if (r0 == 0) goto L9d
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "stall_counter"
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L98
            java.lang.String r2 = "type"
            java.lang.String r3 = "video"
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L98
            java.lang.String r2 = "render_stall_200_duration"
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = r8 / r3
            org.json.JSONObject r1 = r1.put(r2, r5)     // Catch: org.json.JSONException -> L98
            java.lang.String r2 = "render_stall_200_count"
            long r8 = r8 % r3
            org.json.JSONObject r8 = r1.put(r2, r8)     // Catch: org.json.JSONException -> L98
            java.lang.String r9 = "render_stall_300_duration"
            long r1 = r10 / r3
            org.json.JSONObject r8 = r8.put(r9, r1)     // Catch: org.json.JSONException -> L98
            java.lang.String r9 = "render_stall_300_count"
            long r10 = r10 % r3
            org.json.JSONObject r8 = r8.put(r9, r10)     // Catch: org.json.JSONException -> L98
            java.lang.String r9 = "render_stall_400_duration"
            long r10 = r12 / r3
            org.json.JSONObject r8 = r8.put(r9, r10)     // Catch: org.json.JSONException -> L98
            java.lang.String r9 = "render_stall_400_count"
            long r12 = r12 % r3
            org.json.JSONObject r8 = r8.put(r9, r12)     // Catch: org.json.JSONException -> L98
            java.lang.String r9 = "render_stall_500_duration"
            long r10 = r14 / r3
            org.json.JSONObject r8 = r8.put(r9, r10)     // Catch: org.json.JSONException -> L98
            java.lang.String r9 = "render_stall_500_count"
            long r14 = r14 % r3
            org.json.JSONObject r8 = r8.put(r9, r14)     // Catch: org.json.JSONException -> L98
            java.lang.String r9 = "demuxer_stall_500_duration"
            long r10 = r16 / r3
            org.json.JSONObject r8 = r8.put(r9, r10)     // Catch: org.json.JSONException -> L98
            java.lang.String r9 = "demuxer_stall_500_count"
            long r10 = r16 % r3
            org.json.JSONObject r8 = r8.put(r9, r10)     // Catch: org.json.JSONException -> L98
            java.lang.String r9 = "decode_pre_stall_500_duration"
            long r10 = r18 / r3
            org.json.JSONObject r8 = r8.put(r9, r10)     // Catch: org.json.JSONException -> L98
            java.lang.String r9 = "decode_pre_stall_500_count"
            long r10 = r18 % r3
            org.json.JSONObject r8 = r8.put(r9, r10)     // Catch: org.json.JSONException -> L98
            java.lang.String r9 = "decode_post_stall_500_duration"
            long r10 = r20 / r3
            org.json.JSONObject r8 = r8.put(r9, r10)     // Catch: org.json.JSONException -> L98
            java.lang.String r9 = "decode_post_stall_500_count"
            long r10 = r20 % r3
            r8.put(r9, r10)     // Catch: org.json.JSONException -> L98
            com.bykv.vk.component.ttvideo.ILiveListener r8 = r7.mLogUploader     // Catch: org.json.JSONException -> L98
            java.lang.String r9 = "live_client_monitor_log"
            r8.onMonitorLog(r0, r9)     // Catch: org.json.JSONException -> L98
            long r8 = r7.mLogTotalCount     // Catch: org.json.JSONException -> L98
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L9d
            r10 = 1
            long r8 = r8 + r10
            r7.mLogTotalCount = r8     // Catch: org.json.JSONException -> L98
            return
        L98:
            r0 = move-exception
            r8 = r0
            com.bytedance.sdk.component.utils.vl.j(r8)
        L9d:
            return
    }

    public void openNTP() {
            r4 = this;
            r0 = 1
            r4.mEnableNTPTask = r0
            r4.mEnableNTP = r0
            com.bykv.vk.component.ttvideo.log.LiveLoggerService$MyNTPTask r0 = r4.mNTPTask
            if (r0 != 0) goto L17
            com.bykv.vk.component.ttvideo.log.LiveLoggerService$MyNTPTask r0 = new com.bykv.vk.component.ttvideo.log.LiveLoggerService$MyNTPTask
            r0.<init>(r4)
            r4.mNTPTask = r0
            r1 = 104(0x68, float:1.46E-43)
            r2 = 0
            r0.sendEmptyMessageDelayed(r1, r2)
        L17:
            return
    }

    public void openNodeOptimizer(boolean r1) {
            r0 = this;
            r0.mOpenNodeOptimizer = r1
            return
    }

    public void reset() {
            r9 = this;
            java.lang.String r0 = "none"
            r9.mCdnPlayURL = r0
            r9.mCurrentPlayURL = r0
            r9.mCdnIp = r0
            r1 = 0
            r9.mIpIsFromPlayerCore = r1
            r2 = 0
            r9.mLogIndex = r2
            r9.mPushClientSDKVersion = r0
            r9.mPushClientPlatform = r0
            r9.mPushClientOSVersion = r0
            r9.mPushClientModel = r0
            r9.mPushClientStartTime = r0
            r4 = -1
            r9.mPushClientHardwareEncode = r4
            r9.mPushClientMinBitrate = r4
            r9.mPushClientMaxBitrate = r4
            r9.mPushClientDefaultBitrate = r4
            r9.mPushClientHitNodeOptimize = r4
            r9.mPushClientPushProtocal = r0
            r9.mPushClientQId = r0
            r9.mEvaluatorSymbol = r0
            r9.mHitNodeOptimizer = r1
            r9.mIsRemoteSorted = r1
            r9.mIsHitCache = r1
            r9.mHaveResetPlayer = r1
            r9.mPreconnect = r4
            r9.mEnableHurry = r1
            r9.mHurryTime = r4
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9.mCatchSpeed = r5
            r9.mSlowPlayTime = r4
            r9.mSlowSpeed = r5
            r9.mSpeedSwitchCount = r1
            r9.mSpeedSwitchInfo = r0
            r9.mStartPlayBufferThres = r2
            r9.mFastOpenDuration = r4
            r9.mCheckBufferingEndIgnoreVideo = r1
            r9.mStartDirectAfterPrepared = r1
            r9.mCheckBufferingEndAdvanceEnable = r1
            r9.mDefaultCodecID = r4
            r9.mMediaCodecAsyncInit = r1
            r9.mHasFirstFrame = r1
            r9.mFirstFrameTimestamp = r2
            r9.mErrorCode = r1
            r9.mStallStartTime = r2
            r6 = -1
            r9.mStallReason = r6
            r9.mStallTotalCount = r2
            r9.mStallTotalTime = r2
            r9.mVideoRenderStallTotalTime = r2
            r9.mVideoRenderStallTotalCount = r2
            r9.mAudioRenderStallTotalTime = r2
            r9.mAudioRenderStallTotalCount = r2
            r9.mErrorRecoverCount = r2
            r9.mErrorRecoverTime = r2
            r9.mIsInErrorRecovering = r1
            r9.mIsStalling = r1
            r9.mPlayingStallCount = r1
            r9.mPlayingStallTime = r1
            r9.mPlayingAudioRenderStallCount = r1
            r9.mPlayingAudioRenderStallTime = r1
            r9.mPlayingVideoRenderStallCount = r1
            r9.mPlayingVideoRenderStallTime = r1
            r9.mPlayingStallStartTime = r2
            r9.mFirstStallStartTime = r2
            r9.mFirstStallEndTime = r2
            r9.mRetryCount = r1
            r9.mRetryTotalCount = r1
            r9.mSilenceDetectedCount = r4
            r9.mHasNTP = r1
            r9.mTimeDiff = r2
            r9.mEnableNTP = r1
            r9.mEnableNTPTask = r1
            r9.mWidth = r1
            r9.mHeight = r1
            r9.mMaxCacheSeconds = r4
            r9.mSRSuccess = r1
            r9.mTextureRenderError = r1
            r9.mUseTextureRender = r1
            r9.mContainerFps = r5
            r9.mRenderStartNotifyTimeStamp = r2
            r9.mTextureRenderFirstFrameTime = r2
            r5 = 0
            r9.mRenderFpsTimeSeries = r5
            r9.mDownloadSpeedTimeSeries = r5
            r9.mAudioBufferTimeSeries = r5
            r9.mSeiBitrateTimeSeries = r5
            r9.mSeiFpsTimeSeries = r5
            r9.mErrorTimeSeries = r5
            r9.mStallTimeSeries = r5
            com.bykv.vk.component.ttvideo.log.LogBundle r8 = r9.mLogBundle
            if (r8 == 0) goto Lba
            r8.reset()
        Lba:
            r9.mCodecName = r0
            r9.mCodecType = r0
            r8 = 1
            r9.mIsInMainLooper = r8
            r9.mRuleIds = r0
            r9.mSessionId = r0
            r9.mSettingsInfo = r0
            r9.mTTNetNQEInfo = r0
            r9.mEnableP2P = r1
            r9.mEnableOpenMDL = r1
            r9.mUsedP2P = r1
            r9.mP2PLoaderType = r4
            r9.mLastTotalDownloadSize = r2
            r9.mLastDownloadSizeDelta = r2
            r9.mEnableResolutionAutoDegrade = r1
            r9.mHasAbrInfo = r1
            java.lang.String r8 = "rad"
            r9.mAbrStrategy = r8
            java.lang.String r8 = "origin"
            r9.mResolution = r8
            r9.mAutoUsingResolution = r8
            r9.mLastResolution = r0
            r9.mDefaultResBitrate = r4
            r9.mResBitrate = r6
            r9.mAbrSwitchCount = r1
            r9.mAbrSwitchCountInfo = r0
            r9.mAbrSwitchInfo = r0
            r9.mCurDownloadSpeed = r6
            r9.mCurAudioBufferTime = r6
            r9.mCurVideoBufferTime = r6
            r9.mAbrSwitchCost = r6
            r6 = 4
            r9.mStallCountThresOfResolutionDegrade = r6
            r9.mNetworkTimeoutMs = r4
            r9.mQuicMtu = r4
            r9.mQuicScfgConfig = r4
            r9.mQuicPadHello = r4
            r9.mQuicTimerVersion = r4
            r9.mFirstFrameRetryCount = r1
            r9.mFirstFramePrepareTime = r2
            r9.mLastPrepareTime = r2
            r9.mEnableTcpFastOpen = r1
            r9.mEnableLowLatencyFLV = r1
            r9.mOptimizeBackupIps = r5
            r9.mEnableLiveAbrCheckEnhance = r1
            r9.mRtcTcpConnectTimeStamp = r2
            r9.mRtcTcpFirstPackageTimeStamp = r2
            r9.mRtcTlsHandshakedTimeStamp = r2
            r9.mRtcPlayFallBack = r1
            r9.mFallbackType = r1
            r9.mRtcSessionId = r0
            r9.mRtcPlayStopStatInfo = r0
            r9.mDisableVideoRender = r1
            r9.mRequestUrl = r0
            r9.mRequestHeaders = r5
            r9.mUseExpectBitrate = r1
            r9.mFCDNTranscodeMethod = r4
            r9.mEnableReportSessionStop = r1
            r9.mSessionNum = r1
            r9.mVideoDecodeStallTotalCount = r2
            r9.mVideoDecodeStallTotalTime = r2
            r9.mAudioDecodeStallTotalCount = r2
            r9.mAudioDecodeStallTotalTime = r2
            r9.mVideoDemuxStallTotalCount = r2
            r9.mVideoDemuxStallTotalTime = r2
            r9.mAudioDemuxStallTotalCount = r2
            r9.mAudioDemuxStallTotalTime = r2
            r9.mNoSyncCount = r1
            r9.mNoSyncPlayingCount = r1
            r9.mNoSyncTimeDuration = r2
            r9.mNoSyncPlayingTimeDuration = r2
            r9.mNoSyncPtsDuration = r2
            r9.mNoSyncPlayingPtsDuration = r2
            java.lang.String r4 = ""
            r9.mNoSyncPlayingInfoStr = r4
            r9.mNoSyncInfoStr = r4
            r9.mEnableLiveIOPlay = r1
            r9.mLiveIOPlay = r1
            r9.mLiveIOP2P = r1
            r9.mLiveIOErrorMsg = r0
            r9.mFirstFrameView = r2
            r9.mLiveIOVersion = r0
            r9.mUseLiveThreadPool = r1
            return
    }

    public void resetLog() {
            r0 = this;
            return
    }

    public void resetStreamCheckParams() {
            r3 = this;
            java.util.concurrent.LinkedBlockingQueue<java.lang.Long> r0 = r3.mVideoDTSQueue
            if (r0 == 0) goto La
            r0.clear()
            r0 = 0
            r3.mVideoDTSQueue = r0
        La:
            r0 = -1
            r3.mLastSentFrames = r0
            r1 = -1
            r3.mLastCheckDTS = r1
            r3.mLastSeiIndex = r0
            r3.mLastIndex = r0
            return
    }

    public void setCdnIp(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.mCdnIp = r1
            r0.mIpIsFromPlayerCore = r2
            return
    }

    public void setCheckSilenceInterval(int r3) {
            r2 = this;
            r0 = 0
            if (r3 <= 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            r2.mEnableCheckSilenceInterval = r1
            if (r3 <= 0) goto Lb
            goto Lc
        Lb:
            r0 = -1
        Lc:
            r2.mSilenceDetectedCount = r0
            return
    }

    public void setCodecType(java.lang.String r1) {
            r0 = this;
            r0.mCodecType = r1
            return
    }

    public void setCommonFlag(java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r0.mCommonFlag = r1
        L4:
            return
    }

    public void setEvaluatorSymbol(java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r0.mEvaluatorSymbol = r1
        L4:
            return
    }

    public void setFormatInfo(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.mSuggestFormat = r1
            r0.mStreamFormat = r2
            return
    }

    public void setInErrorRecovering() {
            r2 = this;
            r0 = 1
            r2.mIsInErrorRecovering = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.mErrorStartTime = r0
            return
    }

    public void setOriginUrl(java.lang.String r1) {
            r0 = this;
            r0.mOriginUrl = r1
            return
    }

    public void setPlayerSdkVersion(java.lang.String r1) {
            r0 = this;
            r0.mPlayerVersion = r1
            return
    }

    public void setPreconnect(int r1) {
            r0 = this;
            r0.mPreconnect = r1
            return
    }

    public void setPreviewFlag(boolean r1) {
            r0 = this;
            r0.mIsPreview = r1
            return
    }

    public void setProjectKey(java.lang.String r1) {
            r0 = this;
            r0.mProjectKey = r1
            return
    }

    public void setProtocolInfo(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.mSuggestProtocol = r1
            r0.mProtocol = r2
            return
    }

    public void setQuicLibLoader(int r1) {
            r0 = this;
            r0.mQuicFlag = r1
            return
    }

    public void setRemoteSorted(boolean r1) {
            r0 = this;
            r0.mIsRemoteSorted = r1
            return
    }

    public void setRtcPlayLogInterval(long r4) {
            r3 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L8
            r3.mRtcPlayingLogInterval = r4
        L8:
            return
    }

    public void setSdkParams(java.lang.String r1) {
            r0 = this;
            r0.mSdkParams = r1
            return
    }

    public void setWaitTime(long r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r1.mLogBundle
            if (r0 == 0) goto L6
            r0.waitingTimeAfterFirstFrame = r2
        L6:
            com.bykv.vk.component.ttvideo.log.LogBundle r0 = r1.mSessionLogBundle
            if (r0 == 0) goto Lc
            r0.waitingTimeAfterFirstFrame = r2
        Lc:
            return
    }

    public void start() {
            r5 = this;
            boolean r0 = r5.mStarted
            if (r0 == 0) goto L5
            return
        L5:
            android.os.Handler r0 = r5.mHandler
            r1 = 101(0x65, float:1.42E-43)
            long r2 = r5.mInterval
            r0.sendEmptyMessageDelayed(r1, r2)
            boolean r0 = r5.mEnableUploadSessionSeries
            if (r0 == 0) goto L1b
            android.os.Handler r0 = r5.mHandler
            r1 = 102(0x66, float:1.43E-43)
            r2 = 5000(0x1388, double:2.4703E-320)
            r0.sendEmptyMessageDelayed(r1, r2)
        L1b:
            int r0 = r5.mEnableNTPTask
            r1 = 1
            if (r0 != r1) goto L31
            boolean r0 = r5.mNTPRunning
            if (r0 != 0) goto L31
            com.bykv.vk.component.ttvideo.log.LiveLoggerService$MyNTPTask r0 = r5.mNTPTask
            if (r0 == 0) goto L31
            r2 = 103(0x67, float:1.44E-43)
            r3 = 0
            r0.sendEmptyMessageDelayed(r2, r3)
            r5.mNTPRunning = r1
        L31:
            r5.mStarted = r1
            return
    }
}
