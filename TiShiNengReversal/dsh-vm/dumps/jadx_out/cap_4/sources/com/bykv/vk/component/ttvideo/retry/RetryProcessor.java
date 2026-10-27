package com.bykv.vk.component.ttvideo.retry;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class RetryProcessor {
    private static final int ACTION_NEXT_URL = 1;
    private static final int ACTION_REPORT_OUTSIDE = -1;
    private static final int ACTION_RESET_LATER = 3;
    private static final int ACTION_RESET_PLAYER = 2;
    private static final int ACTION_RTC_FALLBACK = 4;
    private static final int DNS_CACHE_RETRY_COUNT_LIMIT = 3;
    private static final int ERROR_LOG_COUNT = 7;
    private static final int MSG_ERROR_AGAIN_RETRY = 10002;
    private static final int MSG_STALL_RETRY = 10001;
    private static final int RETRY_COUNT_LIMIT = 700;
    private static final java.lang.String TAG = "RetryProcessor";
    private static final long UPLOAD_LOG_TIME_INTERVAL = 1000;
    private static final android.util.SparseArray<java.lang.String> sPlayerNetworkError = null;
    private static final android.util.SparseArray<java.lang.String> sPlayerProcessingError = null;
    private static final android.util.SparseArray<java.lang.String> sRetryStrategyMap = null;
    private static final android.util.SparseIntArray sStrategyMap = null;
    private java.lang.String mCurHostName;
    private final android.os.Handler mHandler;
    private boolean mIsErroring;
    private boolean mIsHasUploadLog;
    private long mLastUploadLogTime;
    private int mLogErrorCount;
    private com.bykv.vk.component.ttvideo.log.LiveLoggerService mLogService;
    private java.util.concurrent.atomic.AtomicInteger mRetryCount;
    private final com.bykv.vk.component.ttvideo.retry.RetryProcessor.RetryListener mRetryListener;
    private final long mRetryTimeLimit;
    private long mStallRetryTimeInterval;
    private long mStallStartTime;
    private boolean mStarted;


    public interface RetryListener {
        void onRTCFallBack();

        void onReportOutToApplication(com.bykv.vk.component.ttvideo.log.LiveError r1);

        void onRetryNextPlayURL();

        void onRetryResetPlayer(boolean r1);
    }

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            com.bykv.vk.component.ttvideo.retry.RetryProcessor.sStrategyMap = r0
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            com.bykv.vk.component.ttvideo.retry.RetryProcessor.sPlayerNetworkError = r1
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            com.bykv.vk.component.ttvideo.retry.RetryProcessor.sPlayerProcessingError = r2
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            com.bykv.vk.component.ttvideo.retry.RetryProcessor.sRetryStrategyMap = r3
            r4 = -100002(0xfffffffffffe795e, float:NaN)
            r5 = 3
            r0.put(r4, r5)
            r4 = -100006(0xfffffffffffe795a, float:NaN)
            r0.put(r4, r5)
            r4 = -100007(0xfffffffffffe7959, float:NaN)
            r0.put(r4, r5)
            r4 = -100008(0xfffffffffffe7958, float:NaN)
            r0.put(r4, r5)
            r4 = -100009(0xfffffffffffe7957, float:NaN)
            r0.put(r4, r5)
            r4 = -100013(0xfffffffffffe7953, float:NaN)
            r0.put(r4, r5)
            r4 = -100014(0xfffffffffffe7952, float:NaN)
            r0.put(r4, r5)
            r0 = -499988(0xfffffffffff85eec, float:NaN)
            java.lang.String r4 = "media player: setting uri is null error"
            r1.put(r0, r4)
            r0 = -499987(0xfffffffffff85eed, float:NaN)
            java.lang.String r4 = "media player: setting uri is error"
            r1.put(r0, r4)
            r0 = -499986(0xfffffffffff85eee, float:NaN)
            java.lang.String r4 = "media player: url is not mp4 error"
            r1.put(r0, r4)
            r0 = -499985(0xfffffffffff85eef, float:NaN)
            java.lang.String r4 = "media player: invalid data error"
            r1.put(r0, r4)
            r0 = -499899(0xfffffffffff85f45, float:NaN)
            java.lang.String r4 = "media player: http bad request error"
            r1.put(r0, r4)
            r0 = -499898(0xfffffffffff85f46, float:NaN)
            java.lang.String r4 = "media player: http unauthorized error"
            r1.put(r0, r4)
            r0 = -499897(0xfffffffffff85f47, float:NaN)
            java.lang.String r4 = "media player: http forbidden error"
            r1.put(r0, r4)
            r0 = -499896(0xfffffffffff85f48, float:NaN)
            java.lang.String r4 = "media player: http not found error"
            r1.put(r0, r4)
            r0 = -499894(0xfffffffffff85f4a, float:NaN)
            java.lang.String r4 = "media player: http other 4xx error"
            r1.put(r0, r4)
            r0 = -499893(0xfffffffffff85f4b, float:NaN)
            java.lang.String r4 = "media player: http server error"
            r1.put(r0, r4)
            r0 = -499891(0xfffffffffff85f4d, float:NaN)
            java.lang.String r4 = "media player: http content type invalid"
            r1.put(r0, r4)
            r0 = 251658241(0xf000001, float:6.310888E-30)
            java.lang.String r4 = "media info http redirect"
            r1.put(r0, r4)
            r0 = -499799(0xfffffffffff85fa9, float:NaN)
            java.lang.String r4 = "media player: tcp failed to resolve hostname"
            r1.put(r0, r4)
            r0 = -499795(0xfffffffffff85fad, float:NaN)
            java.lang.String r4 = "media player: tcp send data failed"
            r1.put(r0, r4)
            r0 = -499794(0xfffffffffff85fae, float:NaN)
            java.lang.String r4 = "media player: tcp receive data failed"
            r1.put(r0, r4)
            r0 = -499793(0xfffffffffff85faf, float:NaN)
            java.lang.String r4 = "media player: tcp read network timeout"
            r1.put(r0, r4)
            r0 = -499792(0xfffffffffff85fb0, float:NaN)
            java.lang.String r4 = "media player: tcp write network timeout"
            r1.put(r0, r4)
            r0 = -499999(0xfffffffffff85ee1, float:NaN)
            java.lang.String r1 = "media player setting is null"
            r2.put(r0, r1)
            r0 = -499997(0xfffffffffff85ee3, float:NaN)
            java.lang.String r1 = "media player start decoder error"
            r2.put(r0, r1)
            r0 = -499996(0xfffffffffff85ee4, float:NaN)
            java.lang.String r1 = "media player open decoder error"
            r2.put(r0, r1)
            r0 = -499992(0xfffffffffff85ee8, float:NaN)
            java.lang.String r1 = "media player open outlet error"
            r2.put(r0, r1)
            r0 = -499991(0xfffffffffff85ee9, float:NaN)
            java.lang.String r1 = "media player start outputer error"
            r2.put(r0, r1)
            r0 = -499990(0xfffffffffff85eea, float:NaN)
            java.lang.String r1 = "media player start outlet error"
            r2.put(r0, r1)
            r0 = -499989(0xfffffffffff85eeb, float:NaN)
            java.lang.String r1 = "media player open device error"
            r2.put(r0, r1)
            java.lang.String r0 = "android media player unknown"
            r1 = 1
            r2.put(r1, r0)
            r0 = -1
            java.lang.String r2 = "not retry, report to application"
            r3.put(r0, r2)
            java.lang.String r0 = "try next url from live info"
            r3.put(r1, r0)
            r0 = 2
            java.lang.String r1 = "reset player"
            r3.put(r0, r1)
            return
    }

    public RetryProcessor(com.bykv.vk.component.ttvideo.retry.RetryProcessor.RetryListener r5, int r6, long r7, com.bykv.vk.component.ttvideo.log.LiveLoggerService r9) {
            r4 = this;
            r4.<init>()
            r0 = 10000(0x2710, double:4.9407E-320)
            r4.mStallRetryTimeInterval = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r4.mRetryCount = r0
            r0 = 7
            r4.mLogErrorCount = r0
            r0 = 0
            r4.mCurHostName = r0
            r4.mIsHasUploadLog = r1
            r2 = 0
            r4.mLastUploadLogTime = r2
            r4.mIsErroring = r1
            r4.mStarted = r1
            com.bykv.vk.component.ttvideo.retry.RetryProcessor$1 r0 = new com.bykv.vk.component.ttvideo.retry.RetryProcessor$1
            android.os.Looper r2 = android.os.Looper.myLooper()
            r0.<init>(r4, r2)
            r4.mHandler = r0
            r4.mRetryListener = r5
            int r6 = r6 * 1000
            long r5 = (long) r6
            r4.mRetryTimeLimit = r5
            r4.mStallRetryTimeInterval = r7
            java.util.concurrent.atomic.AtomicInteger r5 = r4.mRetryCount
            r5.set(r1)
            r4.mLogService = r9
            return
    }

    static /* synthetic */ long access$000(com.bykv.vk.component.ttvideo.retry.RetryProcessor r2) {
            long r0 = r2.mStallStartTime
            return r0
    }

    static /* synthetic */ long access$100(com.bykv.vk.component.ttvideo.retry.RetryProcessor r2) {
            long r0 = r2.mRetryTimeLimit
            return r0
    }

    static /* synthetic */ void access$200(com.bykv.vk.component.ttvideo.retry.RetryProcessor r0, int r1) {
            r0.uploadRetryLog(r1)
            return
    }

    static /* synthetic */ com.bykv.vk.component.ttvideo.retry.RetryProcessor.RetryListener access$300(com.bykv.vk.component.ttvideo.retry.RetryProcessor r0) {
            com.bykv.vk.component.ttvideo.retry.RetryProcessor$RetryListener r0 = r0.mRetryListener
            return r0
    }

    static /* synthetic */ long access$400(com.bykv.vk.component.ttvideo.retry.RetryProcessor r2) {
            long r0 = r2.mStallRetryTimeInterval
            return r0
    }

    static /* synthetic */ android.os.Handler access$500(com.bykv.vk.component.ttvideo.retry.RetryProcessor r0) {
            android.os.Handler r0 = r0.mHandler
            return r0
    }

    static /* synthetic */ void access$600(com.bykv.vk.component.ttvideo.retry.RetryProcessor r0, int r1, com.bykv.vk.component.ttvideo.log.LiveError r2) {
            r0.handleRetryForError(r1, r2)
            return
    }

    private void handleRetryForError(int r4, com.bykv.vk.component.ttvideo.log.LiveError r5) {
            r3 = this;
            java.lang.String r0 = "handleRetryForError action="
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "RetryProcessor"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r0)
            r0 = -1
            if (r4 == r0) goto L7d
            r5 = 1
            if (r4 == r5) goto L77
            r5 = 2
            if (r4 == r5) goto L6b
            r5 = 3
            if (r4 == r5) goto L2a
            r5 = 4
            if (r4 == r5) goto L1f
            goto L6a
        L1f:
            java.lang.String r4 = "ACTION_RTC_FALLBACK"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r4)
            com.bykv.vk.component.ttvideo.retry.RetryProcessor$RetryListener r4 = r3.mRetryListener
            r4.onRTCFallBack()
            return
        L2a:
            android.os.Handler r4 = r3.mHandler
            r0 = 10002(0x2712, float:1.4016E-41)
            boolean r4 = r4.hasMessages(r0)
            if (r4 != 0) goto L6a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "start "
            r4.<init>(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = r3.mRetryCount
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.String r1 = "RETRY"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r4)
            android.os.Handler r4 = r3.mHandler
            java.util.concurrent.atomic.AtomicInteger r1 = r3.mRetryCount
            int r1 = r1.get()
            if (r1 <= r5) goto L56
            long r1 = r3.mStallRetryTimeInterval
            goto L67
        L56:
            java.util.concurrent.atomic.AtomicInteger r5 = r3.mRetryCount
            int r5 = r5.get()
            java.util.concurrent.atomic.AtomicInteger r1 = r3.mRetryCount
            int r1 = r1.get()
            int r5 = r5 * r1
            int r5 = r5 * 1000
            long r1 = (long) r5
        L67:
            r4.sendEmptyMessageDelayed(r0, r1)
        L6a:
            return
        L6b:
            java.lang.String r4 = "ACTION_RESET_PLAYER"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r4)
            com.bykv.vk.component.ttvideo.retry.RetryProcessor$RetryListener r4 = r3.mRetryListener
            r5 = 0
            r4.onRetryResetPlayer(r5)
            return
        L77:
            com.bykv.vk.component.ttvideo.retry.RetryProcessor$RetryListener r4 = r3.mRetryListener
            r4.onRetryNextPlayURL()
            return
        L7d:
            com.bykv.vk.component.ttvideo.retry.RetryProcessor$RetryListener r4 = r3.mRetryListener
            r4.onReportOutToApplication(r5)
            return
    }

    private void upLoadErrorLog(com.bykv.vk.component.ttvideo.log.LiveError r3) {
            r2 = this;
            int r0 = r2.mLogErrorCount
            int r0 = r0 + (-1)
            r2.mLogErrorCount = r0
            if (r0 < 0) goto L13
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r2.mLogService
            int r1 = r3.code
            java.lang.String r3 = r3.getInfoJSON()
            r0.onError(r1, r3)
        L13:
            return
    }

    private void uploadRetryLog(int r6) {
            r5 = this;
            boolean r0 = r5.mIsHasUploadLog
            if (r0 == 0) goto L15
            if (r0 == 0) goto L14
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.mLastUploadLogTime
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L14
            goto L15
        L14:
            return
        L15:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r5.mLogService
            r0.onRetry(r6)
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r0 = r5.mLogService
            r0.onFirstFrameFail(r6)
            r6 = 1
            r5.mIsHasUploadLog = r6
            long r0 = java.lang.System.currentTimeMillis()
            r5.mLastUploadLogTime = r0
            return
    }

    public int getRetryCount() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.mRetryCount
            int r0 = r0.get()
            return r0
    }

    public void onError(com.bykv.vk.component.ttvideo.log.LiveError r7, boolean r8) {
            r6 = this;
            java.lang.String r0 = "onError error="
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "RetryProcessor"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r0)
            boolean r0 = r6.mStarted
            if (r0 != 0) goto L14
            goto L1f
        L14:
            boolean r0 = r6.mIsErroring
            r1 = -100016(0xfffffffffffe7950, float:NaN)
            if (r0 == 0) goto L20
            int r0 = r7.code
            if (r0 != r1) goto L20
        L1f:
            return
        L20:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.mRetryCount
            r0.incrementAndGet()
            int r0 = r7.code
            r2 = 1
            if (r0 == r1) goto L2c
            r6.mIsErroring = r2
        L2c:
            java.util.Map r0 = r7.info
            java.util.concurrent.atomic.AtomicInteger r1 = r6.mRetryCount
            int r1 = r1.get()
            r3 = 700(0x2bc, float:9.81E-43)
            r4 = 3
            if (r1 <= r3) goto L3b
            r0 = -1
            goto L7a
        L3b:
            int r1 = r7.code
            r3 = -100003(0xfffffffffffe795d, float:NaN)
            if (r1 != r3) goto L79
            java.lang.String r1 = "internalCode"
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.NumberFormatException -> L51
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.NumberFormatException -> L51
            int r1 = r1.intValue()     // Catch: java.lang.NumberFormatException -> L51
            r7.code = r1     // Catch: java.lang.NumberFormatException -> L52
            goto L59
        L51:
            r1 = 0
        L52:
            java.lang.String r3 = "retryError"
            java.lang.String r5 = "error while get player internal error code"
            r0.put(r3, r5)
        L59:
            android.util.SparseArray<java.lang.String> r3 = com.bykv.vk.component.ttvideo.retry.RetryProcessor.sPlayerNetworkError
            int r5 = r3.indexOfKey(r1)
            if (r5 < 0) goto L6c
            java.lang.String r5 = "playErrorReason"
            java.lang.Object r1 = r3.get(r1)
            r0.put(r5, r1)
            r0 = 1
            goto L6d
        L6c:
            r0 = 3
        L6d:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r6.mLogService
            int r3 = r1.mEnableRtcPlay
            if (r3 != r2) goto L7a
            int r1 = r1.mRtcPlayFallBack
            if (r1 != 0) goto L7a
            r0 = 4
            goto L7a
        L79:
            r0 = 3
        L7a:
            java.util.concurrent.atomic.AtomicInteger r1 = r6.mRetryCount
            int r1 = r1.get()
            if (r1 <= r4) goto L8f
            java.lang.String r1 = r6.mCurHostName
            if (r1 == 0) goto L8f
            com.bykv.vk.component.ttvideo.network.IPCache r1 = com.bykv.vk.component.ttvideo.network.IPCache.getInstance()
            java.lang.String r3 = r6.mCurHostName
            r1.disableIpAddress(r3)
        L8f:
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r6.mLogService
            r1.setInErrorRecovering()
            java.util.concurrent.atomic.AtomicInteger r1 = r6.mRetryCount
            int r1 = r1.get()
            if (r1 != r2) goto La3
            com.bykv.vk.component.ttvideo.log.LiveLoggerService r1 = r6.mLogService
            int r2 = r7.code
            r1.onStallStart(r2, r8)
        La3:
            r6.handleRetryForError(r0, r7)
            r6.upLoadErrorLog(r7)
            int r7 = r7.code
            r6.uploadRetryLog(r7)
            return
    }

    public void onStall(boolean r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "onStall "
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "RetryProcessor"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r0)
            if (r3 == 0) goto L37
            long r0 = java.lang.System.currentTimeMillis()
            r2.mStallStartTime = r0
            if (r4 == 0) goto L25
            com.bykv.vk.component.ttvideo.retry.RetryProcessor$RetryListener r3 = r2.mRetryListener
            r4 = 1
            r3.onRetryResetPlayer(r4)
            r3 = -100018(0xfffffffffffe794e, float:NaN)
            r2.uploadRetryLog(r3)
        L25:
            android.os.Handler r3 = r2.mHandler
            r4 = 10001(0x2711, float:1.4014E-41)
            boolean r3 = r3.hasMessages(r4)
            if (r3 != 0) goto L36
            android.os.Handler r3 = r2.mHandler
            long r0 = r2.mStallRetryTimeInterval
            r3.sendEmptyMessageDelayed(r4, r0)
        L36:
            return
        L37:
            r2.reset()
            return
    }

    public void reset() {
            r4 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r4.mRetryCount
            r1 = 0
            r0.set(r1)
            r2 = 0
            r4.mStallStartTime = r2
            r0 = 7
            r4.mLogErrorCount = r0
            r4.mIsHasUploadLog = r1
            r4.mLastUploadLogTime = r2
            r4.mIsErroring = r1
            android.os.Handler r0 = r4.mHandler
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            return
    }

    public void setHost(java.lang.String r1) {
            r0 = this;
            r0.mCurHostName = r1
            return
    }

    public void setStallRetryTimeInterval(long r1) {
            r0 = this;
            r0.mStallRetryTimeInterval = r1
            return
    }

    public void start() {
            r1 = this;
            r0 = 1
            r1.mStarted = r0
            return
    }

    public void stop() {
            r1 = this;
            r0 = 0
            r1.mStarted = r0
            return
    }
}
