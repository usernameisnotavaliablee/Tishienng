package com.bykv.vk.component.ttvideo.player;

@com.bykv.vk.component.ttvideo.player.Keep
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TTPlayerClient extends com.bykv.vk.component.ttvideo.player.MediaPlayerClient implements android.os.Handler.Callback, com.bykv.vk.component.ttvideo.player.ISurfaceListener {
    public static final int KEY_IS_CONFIG_PARAMS_OPTION = 100;
    private static final java.lang.String TAG = "TTPlayerClient";
    private java.lang.String mBufferingInfo;
    private com.bykv.vk.component.ttvideo.player.TTSurfaceCallback mCallback;
    private java.util.HashMap<java.lang.Integer, java.lang.Integer> mConfigParams;
    private android.content.Context mContext;
    private int mCrashType;
    private java.lang.StringBuilder mCrashedInfo;
    private int mDisablePlayerStayAwake;
    private int mErrorCode;
    private android.os.Handler mHandler;
    private final java.lang.Object mHandlerLocker;
    private long mListenerState;
    private java.util.LinkedList<java.lang.String> mLogInfo;
    private com.bykv.vk.component.ttvideo.player.MediaPlayer.OnLogListener mLogListener;
    private int mMediaCodecStopTimeOutMs;
    private com.bykv.vk.component.ttvideo.player.MediaPlayer.OnBufferingUpdateListener mOnBufferingUpdateListener;
    private com.bykv.vk.component.ttvideo.player.MediaPlayer.OnCompletionListener mOnCompletionListener;
    private com.bykv.vk.component.ttvideo.player.MediaPlayer.OnErrorListener mOnErrorListener;
    private com.bykv.vk.component.ttvideo.player.MediaPlayer.OnExternInfoListener mOnExternInfoListener;
    private com.bykv.vk.component.ttvideo.player.MediaPlayer.OnInfoListener mOnInfoListener;
    private com.bykv.vk.component.ttvideo.player.MediaPlayer.OnPreparedListener mOnPreparedListener;
    private com.bykv.vk.component.ttvideo.player.MediaPlayer.onSARChangedListener mOnSARChangedListener;
    private com.bykv.vk.component.ttvideo.player.MediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    private com.bykv.vk.component.ttvideo.player.MediaPlayer.OnVideoSizeChangedListener mOnVideoSizeChangedListener;
    private int mPlayLifeId;
    private com.bykv.vk.component.ttvideo.player.ITTPlayerRef mPlayer;
    private final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock mReadLock;
    private final java.util.concurrent.locks.ReentrantReadWriteLock mReadWritedLock;
    private volatile boolean mRealsedSurface;
    private final java.util.concurrent.locks.ReentrantLock mReentrantLock;
    private final java.util.concurrent.locks.ReentrantLock mReentrantLockInRtc;
    private int mRtcPlay;
    private boolean mScreenOnWhilePlaying;
    private boolean mSeekComplete;
    private boolean mStayAwake;
    private android.view.Surface mSurface;
    private android.view.SurfaceHolder mSurfaceHolder;
    private java.lang.String mUri;
    private java.lang.String mVoiceInfo;
    private android.os.PowerManager.WakeLock mWakeLock;
    private com.bykv.vk.component.ttvideo.player.MediaPlayer mWrapper;
    private final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock mWriteLock;



    static {
            com.bykv.vk.component.ttvideo.player.TTVersion.saveVersionInfo()
            return
    }

    private TTPlayerClient(android.content.Context r5, java.util.HashMap<java.lang.Integer, java.lang.Integer> r6) {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.mSeekComplete = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r4.mLogInfo = r0
            r0 = 0
            r4.mListenerState = r0
            r0 = 0
            r4.mRealsedSurface = r0
            r1 = -1
            r4.mPlayLifeId = r1
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r4.mHandlerLocker = r2
            java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock
            r2.<init>()
            r4.mReentrantLock = r2
            java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock
            r2.<init>()
            r4.mReentrantLockInRtc = r2
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r2.<init>()
            r4.mReadWritedLock = r2
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.readLock()
            r4.mReadLock = r3
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r2.writeLock()
            r4.mWriteLock = r2
            r4.mErrorCode = r0
            r4.mRtcPlay = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3)
            r4.mCrashedInfo = r2
            r4.mCrashType = r1
            r4.mDisablePlayerStayAwake = r0
            r4.mMediaCodecStopTimeOutMs = r1
            r4.mConfigParams = r6
            r4.mRealsedSurface = r0
            com.bykv.vk.component.ttvideo.player.TTSurfaceCallback r6 = new com.bykv.vk.component.ttvideo.player.TTSurfaceCallback
            r6.<init>(r4)
            r4.mCallback = r6
            r4.mContext = r5
            android.os.Looper r5 = android.os.Looper.myLooper()
            if (r5 == 0) goto L6d
            android.os.Handler r5 = new android.os.Handler
            r5.<init>(r4)
            r4.mHandler = r5
            return
        L6d:
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r5.<init>(r6, r4)
            r4.mHandler = r5
            return
    }

    static /* synthetic */ java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock access$000(com.bykv.vk.component.ttvideo.player.TTPlayerClient r0) {
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.mReadLock
            return r0
    }

    static /* synthetic */ boolean access$100(com.bykv.vk.component.ttvideo.player.TTPlayerClient r0) {
            boolean r0 = r0.isValid()
            return r0
    }

    static /* synthetic */ com.bykv.vk.component.ttvideo.player.ITTPlayerRef access$200(com.bykv.vk.component.ttvideo.player.TTPlayerClient r0) {
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r0.mPlayer
            return r0
    }

    static /* synthetic */ java.lang.String access$300() {
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerClient.TAG
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.Keep
    public static synchronized com.bykv.vk.component.ttvideo.player.TTPlayerClient create(com.bykv.vk.component.ttvideo.player.MediaPlayer r2, android.content.Context r3) {
            java.lang.Class<com.bykv.vk.component.ttvideo.player.TTPlayerClient> r0 = com.bykv.vk.component.ttvideo.player.TTPlayerClient.class
            monitor-enter(r0)
            r1 = 0
            com.bykv.vk.component.ttvideo.player.TTPlayerClient r2 = create(r2, r3, r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return r2
        La:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r2
    }

    @com.bykv.vk.component.ttvideo.player.Keep
    public static synchronized com.bykv.vk.component.ttvideo.player.TTPlayerClient create(com.bykv.vk.component.ttvideo.player.MediaPlayer r2, android.content.Context r3, java.util.HashMap<java.lang.Integer, java.lang.Integer> r4) {
            java.lang.Class<com.bykv.vk.component.ttvideo.player.TTPlayerClient> r0 = com.bykv.vk.component.ttvideo.player.TTPlayerClient.class
            monitor-enter(r0)
            com.bykv.vk.component.ttvideo.player.TTVersion.saveVersionInfo()     // Catch: java.lang.Throwable -> L1a
            com.bykv.vk.component.ttvideo.player.TTPlayerClient r1 = new com.bykv.vk.component.ttvideo.player.TTPlayerClient     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L1a
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r3 = com.bykv.vk.component.ttvideo.player.ITTPlayerRef.create(r3, r1, r4)     // Catch: java.lang.Throwable -> L1a
            if (r3 != 0) goto L14
            monitor-exit(r0)
            r2 = 0
            return r2
        L14:
            r1.mPlayer = r3     // Catch: java.lang.Throwable -> L1a
            r1.mWrapper = r2     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            return r1
        L1a:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r2
    }

    private java.lang.String getPlayerCrashedInfo() {
            r10 = this;
            r0 = 18
            r1 = 1
            int r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r0, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r3 = r10.mPlayer
            if (r3 != 0) goto L13
            android.content.Context r3 = r10.mContext
            goto L17
        L13:
            android.content.Context r3 = r3.getContext()
        L17:
            if (r3 != 0) goto L1c
            java.lang.String r0 = "context is null"
            return r0
        L1c:
            java.lang.String r4 = "<TTPlayerIPClient,getCrashedInfo>find breakpad file"
            java.lang.String r5 = "ttplayer"
            r6 = 5
            r7 = 0
            if (r0 <= r1) goto L44
            java.lang.String r8 = com.bykv.vk.component.ttvideo.player.TTCrashUtil.existsCrashFilePath(r3)
            if (r8 == 0) goto L41
            java.lang.String r9 = com.bykv.vk.component.ttvideo.player.TTCrashUtil.getCrashFileContext(r3, r8, r2)
            if (r9 == 0) goto L41
            android.content.Context r0 = r10.mContext
            com.bykv.vk.component.ttvideo.player.TTCrashUtil.deleteCrashFile(r0, r8)
            r10.mCrashType = r1
            boolean r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r6, r7)
            if (r0 == 0) goto L40
            com.bytedance.sdk.component.utils.vl.j(r5, r4)
        L40:
            return r9
        L41:
            com.bykv.vk.component.ttvideo.utils.AVErrorInfo.setupPhoneInfo(r3, r2)
        L44:
            r3 = 19
            r8 = 0
            java.lang.String r3 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r3, r8)
            if (r3 == 0) goto L66
            android.content.Context r8 = r10.mContext
            java.lang.String r8 = com.bykv.vk.component.ttvideo.player.TTCrashUtil.getCrashFileContext(r8, r3, r2)
            if (r8 == 0) goto L66
            android.content.Context r0 = r10.mContext
            com.bykv.vk.component.ttvideo.player.TTCrashUtil.deleteCrashFile(r0, r3)
            r10.mCrashType = r1
            boolean r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r6, r7)
            if (r0 == 0) goto L65
            com.bytedance.sdk.component.utils.vl.j(r5, r4)
        L65:
            return r8
        L66:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\ncreate time:"
            r3.<init>(r4)
            java.lang.String r4 = com.bykv.vk.component.ttvideo.utils.AVTime.getFormatNow()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r3 = "\nport version:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = "\nstart service info:"
            r2.append(r3)
            r3 = 16
            java.lang.String r4 = "not find service start info"
            java.lang.String r3 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r3, r4)
            r2.append(r3)
            java.lang.String r3 = "\nstop service info:"
            r2.append(r3)
            r3 = 12
            java.lang.String r4 = "not find service stop info"
            java.lang.String r3 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r3, r4)
            r2.append(r3)
            java.lang.String r3 = "\ncrash:"
            r2.append(r3)
            r3 = 7
            boolean r3 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r3, r7)
            r2.append(r3)
            java.lang.String r3 = "\nsdk info:"
            r2.append(r3)
            r3 = 15
            java.lang.String r4 = "not find sdk info"
            java.lang.String r3 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r3, r4)
            r2.append(r3)
            java.lang.String r3 = "\ntimeout count:"
            r2.append(r3)
            r3 = 10
            r4 = -1
            int r3 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r3, r4)
            r2.append(r3)
            java.lang.String r3 = "\nforeground:"
            r2.append(r3)
            r3 = 21
            int r3 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r3, r4)
            r2.append(r3)
            java.lang.String r3 = "\non screen:"
            r2.append(r3)
            r3 = 22
            int r3 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r3, r4)
            r2.append(r3)
            java.lang.String r3 = "\n battery info:"
            r2.append(r3)
            r3 = 23
            java.lang.String r4 = "not find"
            java.lang.String r3 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r3, r4)
            r2.append(r3)
            java.lang.String r3 = "\nurl:"
            r2.append(r3)
            java.lang.String r3 = r10.mUri
            r2.append(r3)
            java.lang.String r3 = "\ncrash:\r\n"
            r2.append(r3)
            java.lang.StringBuilder r3 = r10.mCrashedInfo
            r2.append(r3)
            r10.mCrashType = r7
            if (r0 <= r1) goto L137
            boolean r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r6, r7)
            if (r0 == 0) goto L12e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<TTPlayerIPClient,getCrashedInfo>"
            r0.<init>(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.sdk.component.utils.vl.j(r5, r0)
        L12e:
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTCrashUtil.getBase64SampleCrash(r0)
            return r0
        L137:
            java.lang.String r0 = r2.toString()
            return r0
    }

    private java.lang.String getPlayerErrorInfo() {
            r6 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5a
            r1.<init>()     // Catch: java.lang.Exception -> L5a
            java.util.LinkedList<java.lang.String> r2 = r6.mLogInfo     // Catch: java.lang.Exception -> L5a
            if (r2 == 0) goto L10
            int r2 = r2.size()     // Catch: java.lang.Exception -> L5a
            if (r2 > 0) goto L18
        L10:
            java.lang.String r2 = r6.mBufferingInfo     // Catch: java.lang.Exception -> L5a
            if (r2 != 0) goto L18
            java.lang.String r2 = r6.mVoiceInfo     // Catch: java.lang.Exception -> L5a
            if (r2 == 0) goto L56
        L18:
            android.content.Context r2 = r6.mContext     // Catch: java.lang.Exception -> L5a
            java.lang.String r3 = "error"
            java.lang.String r4 = "play error"
            java.lang.String r5 = r6.mUri     // Catch: java.lang.Exception -> L5a
            com.bykv.vk.component.ttvideo.utils.AVErrorInfo.setupErrorInfo(r2, r1, r3, r4, r5)     // Catch: java.lang.Exception -> L5a
            java.util.LinkedList<java.lang.String> r2 = r6.mLogInfo     // Catch: java.lang.Exception -> L5a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L5a
        L29:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L5a
            java.lang.String r4 = "\n"
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L5a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L5a
            r1.append(r3)     // Catch: java.lang.Exception -> L5a
            r1.append(r4)     // Catch: java.lang.Exception -> L5a
            goto L29
        L3e:
            java.lang.String r2 = r6.mBufferingInfo     // Catch: java.lang.Exception -> L5a
            if (r2 == 0) goto L4a
            r1.append(r2)     // Catch: java.lang.Exception -> L5a
            r1.append(r4)     // Catch: java.lang.Exception -> L5a
            r6.mBufferingInfo = r0     // Catch: java.lang.Exception -> L5a
        L4a:
            java.lang.String r2 = r6.mVoiceInfo     // Catch: java.lang.Exception -> L5a
            if (r2 == 0) goto L56
            r1.append(r2)     // Catch: java.lang.Exception -> L5a
            r1.append(r4)     // Catch: java.lang.Exception -> L5a
            r6.mVoiceInfo = r0     // Catch: java.lang.Exception -> L5a
        L56:
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L5a
        L5a:
            return r0
    }

    private boolean isValid() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer
            if (r0 == 0) goto Ld
            boolean r0 = r0.isValid()
            if (r0 != 0) goto Lb
            goto Ld
        Lb:
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    private void notifyInfo(int r3, int r4) {
            r2 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer$OnInfoListener r0 = r2.mOnInfoListener
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 4
            if (r3 == r1) goto Lae
            r1 = 5
            if (r3 == r1) goto Lab
            r1 = 32
            if (r3 == r1) goto La7
            r1 = 47
            if (r3 == r1) goto La3
            r1 = 41
            if (r3 == r1) goto L9f
            r1 = 42
            if (r3 == r1) goto L9b
            switch(r3) {
                case 7: goto L99;
                case 8: goto L96;
                case 9: goto L93;
                case 10: goto L90;
                default: goto L1e;
            }
        L1e:
            switch(r3) {
                case 20: goto L8c;
                case 21: goto L88;
                case 22: goto L84;
                case 23: goto L80;
                case 24: goto L7c;
                case 25: goto L78;
                case 26: goto L74;
                case 27: goto L70;
                case 28: goto L6c;
                case 29: goto L68;
                case 30: goto L64;
                default: goto L21;
            }
        L21:
            switch(r3) {
                case 34: goto L60;
                case 35: goto L5c;
                case 36: goto L57;
                case 37: goto L52;
                case 38: goto L4d;
                case 39: goto L48;
                default: goto L24;
            }
        L24:
            switch(r3) {
                case 49: goto L43;
                case 50: goto L3e;
                case 51: goto L39;
                case 52: goto L34;
                case 53: goto L2f;
                case 54: goto L2a;
                default: goto L27;
            }
        L27:
            r3 = -1
            goto Lb0
        L2a:
            r3 = -268435404(0xfffffffff0000034, float:-1.584573E29)
            goto Lb0
        L2f:
            r3 = -268435405(0xfffffffff0000033, float:-1.5845729E29)
            goto Lb0
        L34:
            r3 = -268435406(0xfffffffff0000032, float:-1.5845727E29)
            goto Lb0
        L39:
            r3 = -268435407(0xfffffffff0000031, float:-1.5845725E29)
            goto Lb0
        L3e:
            r3 = -268435391(0xfffffffff0000041, float:-1.5845755E29)
            goto Lb0
        L43:
            r3 = -268435392(0xfffffffff0000040, float:-1.5845753E29)
            goto Lb0
        L48:
            r3 = -268435437(0xfffffffff0000013, float:-1.5845668E29)
            goto Lb0
        L4d:
            r3 = -268435438(0xfffffffff0000012, float:-1.5845667E29)
            goto Lb0
        L52:
            r3 = -268435439(0xfffffffff0000011, float:-1.5845665E29)
            goto Lb0
        L57:
            r3 = -268435440(0xfffffffff0000010, float:-1.5845663E29)
            goto Lb0
        L5c:
            r3 = -268435441(0xfffffffff000000f, float:-1.584566E29)
            goto Lb0
        L60:
            r3 = -268435442(0xfffffffff000000e, float:-1.5845659E29)
            goto Lb0
        L64:
            r3 = -268435390(0xfffffffff0000042, float:-1.5845757E29)
            goto Lb0
        L68:
            r3 = 251658252(0xf00000c, float:6.310896E-30)
            goto Lb0
        L6c:
            r3 = 251658251(0xf00000b, float:6.3108955E-30)
            goto Lb0
        L70:
            r3 = 251658250(0xf00000a, float:6.310895E-30)
            goto Lb0
        L74:
            r3 = 251658249(0xf000009, float:6.310894E-30)
            goto Lb0
        L78:
            r3 = 251658248(0xf000008, float:6.310893E-30)
            goto Lb0
        L7c:
            r3 = 251658247(0xf000007, float:6.3108925E-30)
            goto Lb0
        L80:
            r3 = 251658246(0xf000006, float:6.310892E-30)
            goto Lb0
        L84:
            r3 = 251658245(0xf000005, float:6.310891E-30)
            goto Lb0
        L88:
            r3 = 251658244(0xf000004, float:6.31089E-30)
            goto Lb0
        L8c:
            r3 = 251658243(0xf000003, float:6.3108895E-30)
            goto Lb0
        L90:
            r3 = 901(0x385, float:1.263E-42)
            goto Lb0
        L93:
            r3 = 802(0x322, float:1.124E-42)
            goto Lb0
        L96:
            r3 = 801(0x321, float:1.122E-42)
            goto Lb0
        L99:
            r3 = 3
            goto Lb0
        L9b:
            r3 = -268435423(0xfffffffff0000021, float:-1.5845695E29)
            goto Lb0
        L9f:
            r3 = -268435424(0xfffffffff0000020, float:-1.5845693E29)
            goto Lb0
        La3:
            r3 = -268435408(0xfffffffff0000030, float:-1.5845723E29)
            goto Lb0
        La7:
            r3 = 251658253(0xf00000d, float:6.310897E-30)
            goto Lb0
        Lab:
            r3 = 702(0x2be, float:9.84E-43)
            goto Lb0
        Lae:
            r3 = 701(0x2bd, float:9.82E-43)
        Lb0:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r2.mWrapper
            r0.onInfo(r1, r3, r4)
            return
    }

    private void onExternInfo(int r3, java.lang.String r4) {
            r2 = this;
            int r0 = r2.mRtcPlay
            if (r0 == 0) goto L23
            java.util.concurrent.locks.ReentrantLock r0 = r2.mReentrantLockInRtc     // Catch: java.lang.Throwable -> L15
            r0.lock()     // Catch: java.lang.Throwable -> L15
            com.bykv.vk.component.ttvideo.player.MediaPlayer$OnExternInfoListener r0 = r2.mOnExternInfoListener     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            if (r4 == 0) goto L17
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r2.mWrapper     // Catch: java.lang.Throwable -> L15
            r0.onExternInfo(r1, r3, r4)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r3 = move-exception
            goto L1d
        L17:
            java.util.concurrent.locks.ReentrantLock r3 = r2.mReentrantLockInRtc
            r3.unlock()
            return
        L1d:
            java.util.concurrent.locks.ReentrantLock r4 = r2.mReentrantLockInRtc
            r4.unlock()
            throw r3
        L23:
            com.bykv.vk.component.ttvideo.player.MediaPlayer$OnExternInfoListener r0 = r2.mOnExternInfoListener
            if (r0 == 0) goto L2e
            if (r4 == 0) goto L2e
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r2.mWrapper
            r0.onExternInfo(r1, r3, r4)
        L2e:
            return
    }

    private void sendCompletioned(int r3) {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.mReentrantLock     // Catch: java.lang.Throwable -> L13
            r0.lock()     // Catch: java.lang.Throwable -> L13
            com.bykv.vk.component.ttvideo.player.MediaPlayer$OnCompletionListener r0 = r2.mOnCompletionListener     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            int r1 = r2.mPlayLifeId     // Catch: java.lang.Throwable -> L13
            if (r3 < r1) goto L15
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r2.mWrapper     // Catch: java.lang.Throwable -> L13
            r0.onCompletion(r3)     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r3 = move-exception
            goto L23
        L15:
            java.util.concurrent.locks.ReentrantLock r3 = r2.mReentrantLock
            boolean r3 = r3.isLocked()
            if (r3 == 0) goto L22
            java.util.concurrent.locks.ReentrantLock r3 = r2.mReentrantLock
            r3.unlock()
        L22:
            return
        L23:
            java.util.concurrent.locks.ReentrantLock r0 = r2.mReentrantLock
            boolean r0 = r0.isLocked()
            if (r0 == 0) goto L30
            java.util.concurrent.locks.ReentrantLock r0 = r2.mReentrantLock
            r0.unlock()
        L30:
            throw r3
    }

    private void sendErrorInfo(int r3, int r4) {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.mReentrantLock     // Catch: java.lang.Throwable -> L20
            r0.lock()     // Catch: java.lang.Throwable -> L20
            com.bykv.vk.component.ttvideo.player.MediaPlayer$OnErrorListener r0 = r2.mOnErrorListener     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L22
            int r1 = r2.mPlayLifeId     // Catch: java.lang.Throwable -> L20
            if (r4 < r1) goto L22
            int r4 = r2.mErrorCode     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L18
            if (r3 == 0) goto L14
            goto L19
        L14:
            r3 = -1048575(0xfffffffffff00001, float:NaN)
            goto L19
        L18:
            r3 = r4
        L19:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r4 = r2.mWrapper     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.onError(r4, r3, r1)     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r3 = move-exception
            goto L30
        L22:
            java.util.concurrent.locks.ReentrantLock r3 = r2.mReentrantLock
            boolean r3 = r3.isLocked()
            if (r3 == 0) goto L2f
            java.util.concurrent.locks.ReentrantLock r3 = r2.mReentrantLock
            r3.unlock()
        L2f:
            return
        L30:
            java.util.concurrent.locks.ReentrantLock r4 = r2.mReentrantLock
            boolean r4 = r4.isLocked()
            if (r4 == 0) goto L3d
            java.util.concurrent.locks.ReentrantLock r4 = r2.mReentrantLock
            r4.unlock()
        L3d:
            throw r3
    }

    private void sendSeekCompleted(int r3) {
            r2 = this;
            boolean r0 = r2.mSeekComplete
            if (r0 != 0) goto L14
            com.bykv.vk.component.ttvideo.player.MediaPlayer$OnSeekCompleteListener r0 = r2.mOnSeekCompleteListener
            if (r0 == 0) goto L14
            r1 = 1
            r2.mSeekComplete = r1
            int r1 = r2.mPlayLifeId
            if (r3 < r1) goto L14
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r2.mWrapper
            r0.onSeekComplete(r3)
        L14:
            return
    }

    @android.annotation.SuppressLint({"Wakelock"})
    private void stayAwake(boolean r2) {
            r1 = this;
            android.os.PowerManager$WakeLock r0 = r1.mWakeLock
            if (r0 == 0) goto L21
            if (r2 == 0) goto L12
            boolean r0 = r0.isHeld()
            if (r0 != 0) goto L12
            android.os.PowerManager$WakeLock r0 = r1.mWakeLock
            r0.acquire()
            goto L21
        L12:
            if (r2 != 0) goto L21
            android.os.PowerManager$WakeLock r0 = r1.mWakeLock
            boolean r0 = r0.isHeld()
            if (r0 == 0) goto L21
            android.os.PowerManager$WakeLock r0 = r1.mWakeLock
            r0.release()
        L21:
            r1.mStayAwake = r2
            r1.updateSurfaceScreenOn()
            return
    }

    public void close() {
            r2 = this;
            r0 = 1
            r2.mRealsedSurface = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.lock()
            boolean r0 = r2.isValid()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r2.mPlayer     // Catch: java.lang.Throwable -> L14
            r0.close()     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r0 = move-exception
            goto L1c
        L16:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.unlock()
            return
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r2.mReadLock
            r1.unlock()
            throw r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void deselectTrack(int r3) {
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.lock()
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r2.mPlayer
            if (r0 == 0) goto L12
            if (r3 != 0) goto L12
            r3 = 261(0x105, float:3.66E-43)
            r1 = 1
            r0.setIntOption(r3, r1)
            goto L1b
        L12:
            if (r0 == 0) goto L1b
            int r3 = r3 << 8
            r1 = 65
            r0.setIntOption(r1, r3)
        L1b:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.mReadLock
            r3.unlock()
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public int getCurrentPosition() {
            r3 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.lock()
            boolean r0 = r3.isValid()     // Catch: java.lang.Throwable -> L14
            r1 = 0
            if (r0 == 0) goto L16
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r3.mPlayer     // Catch: java.lang.Throwable -> L14
            r2 = 2
            int r1 = r0.getIntOption(r2, r1)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r0 = move-exception
            goto L1c
        L16:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.unlock()
            return r1
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r3.mReadLock
            r1.unlock()
            throw r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public java.lang.String getDataSource() {
            r1 = this;
            java.lang.String r0 = r1.mUri
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public int getDuration() {
            r3 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.lock()
            boolean r0 = r3.isValid()     // Catch: java.lang.Throwable -> L14
            r1 = 0
            if (r0 == 0) goto L16
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r3.mPlayer     // Catch: java.lang.Throwable -> L14
            r2 = 1
            int r1 = r0.getIntOption(r2, r1)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r0 = move-exception
            goto L1c
        L16:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.unlock()
            return r1
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r3.mReadLock
            r1.unlock()
            throw r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public float getFloatOption(int r2, float r3) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L12
            float r3 = r0.getFloatOption(r2, r3)     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r2 = move-exception
            goto L1a
        L14:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.unlock()
            return r3
        L1a:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.mReadLock
            r3.unlock()
            throw r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public int getIntOption(int r2, int r3) {
            r1 = this;
            r0 = 5000(0x1388, float:7.006E-42)
            if (r2 != r0) goto L7
            int r2 = r1.mErrorCode
            return r2
        L7:
            r0 = 26
            if (r2 != r0) goto Le
            int r2 = r1.mCrashType
            return r2
        Le:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L22
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L20
            int r3 = r0.getIntOption(r2, r3)     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r2 = move-exception
            goto L28
        L22:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.unlock()
            return r3
        L28:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.mReadLock
            r3.unlock()
            throw r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public long getLongOption(int r2, long r3) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L12
            long r3 = r0.getLongOption(r2, r3)     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r2 = move-exception
            goto L1a
        L14:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.unlock()
            return r3
        L1a:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.mReadLock
            r3.unlock()
            throw r2
    }

    public java.lang.Object getObjectOption(int r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r0.getObjectOption(r2)     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r2 = move-exception
            goto L1b
        L14:
            r2 = 0
        L15:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.unlock()
            return r2
        L1b:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.unlock()
            throw r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public int getSelectedTrack(int r3) {
            r2 = this;
            r0 = 1
            r1 = 2
            if (r3 != r1) goto L5
            return r0
        L5:
            if (r3 != r0) goto L9
            r3 = 0
            return r3
        L9:
            r0 = 4
            if (r3 != r0) goto Ld
            return r1
        Ld:
            r3 = -1
            return r3
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public java.lang.String getStringOption(int r3) {
            r2 = this;
            r0 = 5001(0x1389, float:7.008E-42)
            if (r3 != r0) goto L9
            java.lang.String r3 = r2.getPlayerCrashedInfo()
            return r3
        L9:
            r0 = 5002(0x138a, float:7.009E-42)
            r1 = 0
            if (r3 != r0) goto L1f
            java.util.LinkedList<java.lang.String> r3 = r2.mLogInfo
            if (r3 == 0) goto L1e
            int r3 = r3.size()
            if (r3 != 0) goto L19
            goto L1e
        L19:
            java.lang.String r3 = r2.getPlayerErrorInfo()
            return r3
        L1e:
            return r1
        L1f:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.lock()
            boolean r0 = r2.isValid()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L33
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r2.mPlayer     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r0.getStringOption(r3)     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r3 = move-exception
            goto L39
        L33:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.mReadLock
            r3.unlock()
            return r1
        L39:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.unlock()
            throw r3
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public com.bykv.vk.component.ttvideo.player.MediaPlayer.TrackInfo[] getTrackInfo() {
            r7 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer$TrackInfo r0 = new com.bykv.vk.component.ttvideo.player.MediaPlayer$TrackInfo
            com.bykv.vk.component.ttvideo.player.MediaFormat r1 = new com.bykv.vk.component.ttvideo.player.MediaFormat
            r1.<init>()
            r2 = 0
            r0.<init>(r2, r1)
            com.bykv.vk.component.ttvideo.player.MediaPlayer$TrackInfo r1 = new com.bykv.vk.component.ttvideo.player.MediaPlayer$TrackInfo
            com.bykv.vk.component.ttvideo.player.MediaFormat r3 = new com.bykv.vk.component.ttvideo.player.MediaFormat
            r3.<init>()
            r4 = 1
            r1.<init>(r4, r3)
            com.bykv.vk.component.ttvideo.player.MediaPlayer$TrackInfo r3 = new com.bykv.vk.component.ttvideo.player.MediaPlayer$TrackInfo
            com.bykv.vk.component.ttvideo.player.MediaFormat r5 = new com.bykv.vk.component.ttvideo.player.MediaFormat
            r5.<init>()
            r6 = 2
            r3.<init>(r6, r5)
            r5 = 3
            com.bykv.vk.component.ttvideo.player.MediaPlayer$TrackInfo[] r5 = new com.bykv.vk.component.ttvideo.player.MediaPlayer.TrackInfo[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            return r5
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public int getType() {
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.lock()
            boolean r0 = r2.isValid()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r2.mPlayer     // Catch: java.lang.Throwable -> L12
            int r0 = r0.getType()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r0 = move-exception
            goto L1b
        L14:
            r0 = 0
        L15:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r2.mReadLock
            r1.unlock()
            return r0
        L1b:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r2.mReadLock
            r1.unlock()
            throw r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public int getVideoHeight() {
            r3 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.lock()
            boolean r0 = r3.isValid()     // Catch: java.lang.Throwable -> L14
            r1 = 0
            if (r0 == 0) goto L16
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r3.mPlayer     // Catch: java.lang.Throwable -> L14
            r2 = 4
            int r1 = r0.getIntOption(r2, r1)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r0 = move-exception
            goto L1c
        L16:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.unlock()
            return r1
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r3.mReadLock
            r1.unlock()
            throw r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public int getVideoType() {
            r3 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.lock()
            boolean r0 = r3.isValid()     // Catch: java.lang.Throwable -> L15
            r1 = 0
            if (r0 == 0) goto L17
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r3.mPlayer     // Catch: java.lang.Throwable -> L15
            r2 = 11
            int r1 = r0.getIntOption(r2, r1)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r0 = move-exception
            goto L1d
        L17:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.unlock()
            return r1
        L1d:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r3.mReadLock
            r1.unlock()
            throw r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public int getVideoWidth() {
            r3 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.lock()
            boolean r0 = r3.isValid()     // Catch: java.lang.Throwable -> L14
            r1 = 0
            if (r0 == 0) goto L16
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r3.mPlayer     // Catch: java.lang.Throwable -> L14
            r2 = 3
            int r1 = r0.getIntOption(r2, r1)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r0 = move-exception
            goto L1c
        L16:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.unlock()
            return r1
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r3.mReadLock
            r1.unlock()
            throw r0
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message r5) {
            r4 = this;
            int r0 = r5.arg2
            int r1 = r5.what
            int r2 = r5.arg1
            java.lang.Object r5 = r5.obj
            boolean r3 = r5 instanceof java.lang.String
            if (r3 == 0) goto Lf
            java.lang.String r5 = (java.lang.String) r5
            goto L10
        Lf:
            r5 = 0
        L10:
            r4.handleNotify(r0, r1, r2, r5)
            r5 = 1
            return r5
    }

    public void handleNotify(int r6, int r7, int r8, java.lang.String r9) {
            r5 = this;
            r0 = 100
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 0
            if (r7 == 0) goto Lcf
            r4 = 47
            if (r7 == r4) goto Lcb
            r4 = 49
            if (r7 == r4) goto Lcb
            r4 = 20000(0x4e20, float:2.8026E-41)
            if (r7 == r4) goto L74
            r4 = 12
            if (r7 == r4) goto L70
            r4 = 13
            if (r7 == r4) goto L66
            r4 = 65535(0xffff, float:9.1834E-41)
            switch(r7) {
                case 2: goto L5c;
                case 3: goto L52;
                case 4: goto Lcb;
                case 5: goto Lcb;
                case 6: goto L44;
                case 7: goto Lcb;
                case 8: goto Lcb;
                case 9: goto Lcb;
                case 10: goto Lcb;
                default: goto L28;
            }
        L28:
            switch(r7) {
                case 19: goto L40;
                case 20: goto Lcb;
                case 21: goto Lcb;
                case 22: goto Lcb;
                case 23: goto L32;
                case 24: goto Lcb;
                case 25: goto Lcb;
                case 26: goto Lcb;
                case 27: goto Lcb;
                case 28: goto Lcb;
                case 29: goto Lcb;
                case 30: goto Lcb;
                default: goto L2b;
            }
        L2b:
            switch(r7) {
                case 32: goto Lcb;
                case 33: goto L40;
                case 34: goto Lcb;
                case 35: goto Lcb;
                case 36: goto Lcb;
                case 37: goto Lcb;
                case 38: goto Lcb;
                case 39: goto Lcb;
                case 40: goto L40;
                case 41: goto Lcb;
                case 42: goto Lcb;
                case 43: goto L40;
                case 44: goto L40;
                case 45: goto Lcf;
                default: goto L2e;
            }
        L2e:
            switch(r7) {
                case 51: goto Lcb;
                case 52: goto Lcb;
                case 53: goto Lcb;
                case 54: goto Lcb;
                default: goto L31;
            }
        L31:
            goto L7b
        L32:
            com.bykv.vk.component.ttvideo.player.MediaPlayer$onSARChangedListener r6 = r5.mOnSARChangedListener
            if (r6 == 0) goto L7b
            com.bykv.vk.component.ttvideo.player.MediaPlayer r7 = r5.mWrapper
            r9 = r8 & r4
            int r8 = r8 >> 16
            r6.onSARChanged(r7, r9, r8)
            return
        L40:
            r5.onExternInfo(r7, r9)
            return
        L44:
            com.bykv.vk.component.ttvideo.player.MediaPlayer$OnVideoSizeChangedListener r6 = r5.mOnVideoSizeChangedListener
            if (r6 == 0) goto L7b
            com.bykv.vk.component.ttvideo.player.MediaPlayer r7 = r5.mWrapper
            r9 = r8 & r4
            int r8 = r8 >> 16
            r6.onVideoSizeChanged(r7, r9, r8)
            return
        L52:
            com.bykv.vk.component.ttvideo.player.MediaPlayer$OnBufferingUpdateListener r6 = r5.mOnBufferingUpdateListener
            if (r6 == 0) goto L7b
            com.bykv.vk.component.ttvideo.player.MediaPlayer r7 = r5.mWrapper
            r6.onBufferingUpdate(r7, r8)
            return
        L5c:
            com.bykv.vk.component.ttvideo.player.MediaPlayer$OnPreparedListener r6 = r5.mOnPreparedListener
            if (r6 == 0) goto L7b
            com.bykv.vk.component.ttvideo.player.MediaPlayer r7 = r5.mWrapper
            r6.onPrepared(r7)
            return
        L66:
            r5.stayAwake(r3)
            r5.sendSeekCompleted(r6)
            r5.sendCompletioned(r6)
            return
        L70:
            r5.sendSeekCompleted(r6)
            return
        L74:
            int r7 = r5.mErrorCode
            r9 = -2139062143(0xffffffff80808081, float:-1.1801042E-38)
            if (r7 != r9) goto L7c
        L7b:
            return
        L7c:
            r5.mErrorCode = r9
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r7 = r5.mWriteLock
            r7.lock()
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r7 = r5.mPlayer     // Catch: java.lang.Throwable -> Lbd
            if (r7 == 0) goto Lbf
            r9 = 0
            r5.mPlayer = r9     // Catch: java.lang.Throwable -> Lbd
            r7.invalid()     // Catch: java.lang.Throwable -> Lbd
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r7 = r5.mWriteLock
            r7.unlock()
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r7 = r5.mConfigParams
            r9 = 7
            if (r7 == 0) goto Lad
            java.lang.Object r7 = r7.get(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != r1) goto Lad
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r7 = r5.mConfigParams
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7.put(r9, r2)
            goto Lb0
        Lad:
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.setValue(r9, r1)
        Lb0:
            r5.stayAwake(r3)
            r5.sendSeekCompleted(r6)
            r5.sendErrorInfo(r8, r6)
            r5.sendCompletioned(r6)
            return
        Lbd:
            r6 = move-exception
            goto Lc5
        Lbf:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r5.mWriteLock
            r6.unlock()
            return
        Lc5:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r7 = r5.mWriteLock
            r7.unlock()
            throw r6
        Lcb:
            r5.notifyInfo(r7, r8)
            return
        Lcf:
            r5.stayAwake(r3)
            r7 = -499989(0xfffffffffff85eeb, float:NaN)
            if (r8 != r7) goto Lf6
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r7 = r5.mConfigParams
            r9 = 8
            if (r7 == 0) goto Lf3
            java.lang.Object r7 = r7.get(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != r1) goto Lf3
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r7 = r5.mConfigParams
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7.put(r9, r2)
            goto Lf6
        Lf3:
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.setValue(r9, r1)
        Lf6:
            r5.sendSeekCompleted(r6)
            r5.sendErrorInfo(r8, r6)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public boolean isLooping() {
            r3 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.lock()
            boolean r0 = r3.isValid()     // Catch: java.lang.Throwable -> L18
            r1 = 0
            if (r0 == 0) goto L1a
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r3.mPlayer     // Catch: java.lang.Throwable -> L18
            r2 = 5
            int r0 = r0.getIntOption(r2, r1)     // Catch: java.lang.Throwable -> L18
            r2 = 1
            if (r0 != r2) goto L1a
            r1 = 1
            goto L1a
        L18:
            r0 = move-exception
            goto L20
        L1a:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.unlock()
            return r1
        L20:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r3.mReadLock
            r1.unlock()
            throw r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public boolean isMute() {
            r3 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.lock()
            boolean r0 = r3.isValid()     // Catch: java.lang.Throwable -> L19
            r1 = 0
            if (r0 == 0) goto L1b
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r3.mPlayer     // Catch: java.lang.Throwable -> L19
            r2 = 12
            int r0 = r0.getIntOption(r2, r1)     // Catch: java.lang.Throwable -> L19
            r2 = 1
            if (r0 != r2) goto L1b
            r1 = 1
            goto L1b
        L19:
            r0 = move-exception
            goto L21
        L1b:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.unlock()
            return r1
        L21:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r3.mReadLock
            r1.unlock()
            throw r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public boolean isPlaying() {
            r3 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.lock()
            boolean r0 = r3.isValid()     // Catch: java.lang.Throwable -> L18
            r1 = 0
            if (r0 == 0) goto L1a
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r3.mPlayer     // Catch: java.lang.Throwable -> L18
            r2 = 6
            int r0 = r0.getIntOption(r2, r1)     // Catch: java.lang.Throwable -> L18
            r2 = 1
            if (r0 != r2) goto L1a
            r1 = 1
            goto L1a
        L18:
            r0 = move-exception
            goto L20
        L1a:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.unlock()
            return r1
        L20:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r3.mReadLock
            r1.unlock()
            throw r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void mouseEvent(int r2, int r3, int r4) {
            r1 = this;
            r0 = 1
            if (r2 == 0) goto Lb
            if (r2 == r0) goto La
            r0 = 2
            if (r2 == r0) goto Lb
            r0 = 0
            goto Lb
        La:
            r0 = 3
        Lb:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.lock()
            boolean r2 = r1.isValid()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1e
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r2 = r1.mPlayer     // Catch: java.lang.Throwable -> L1c
            r2.mouseEvent(r0, r3, r4)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r2 = move-exception
            goto L24
        L1e:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.unlock()
            return
        L24:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.mReadLock
            r3.unlock()
            throw r2
    }

    protected void onCrashedInfo(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = r2.mCrashedInfo
            int r0 = r0.length()
            r1 = 1024(0x400, float:1.435E-42)
            if (r0 >= r1) goto L14
            java.lang.StringBuilder r0 = r2.mCrashedInfo
            r0.append(r3)
            java.lang.String r3 = "\n"
            r0.append(r3)
        L14:
            return
    }

    protected void onPlayLogInfo(int r5, int r6, java.lang.String r7) {
            r4 = this;
            r0 = 1
            r1 = 2
            if (r5 != r1) goto Le
            if (r6 != r0) goto L9
            r4.mVoiceInfo = r7
            return
        L9:
            if (r6 != 0) goto L3f
            r4.mBufferingInfo = r7
            return
        Le:
            if (r5 != 0) goto L12
            r4.mErrorCode = r6
        L12:
            if (r7 == 0) goto L3f
            java.util.LinkedList<java.lang.String> r5 = r4.mLogInfo
            int r5 = r5.size()
            r6 = 40
            if (r5 <= r6) goto L23
            java.util.LinkedList<java.lang.String> r5 = r4.mLogInfo
            r5.removeFirst()
        L23:
            java.util.LinkedList<java.lang.String> r5 = r4.mLogInfo
            java.util.Locale r6 = java.util.Locale.US
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r7
            r1[r0] = r2
            java.lang.String r7 = "%s&&time:%d"
            java.lang.String r6 = java.lang.String.format(r6, r7, r1)
            r5.addLast(r6)
        L3f:
            return
    }

    public void onPlayerNotify(int r4, int r5, int r6, java.lang.String r7) {
            r3 = this;
            java.lang.Object r0 = r3.mHandlerLocker
            monitor-enter(r0)
            android.os.Handler r1 = r3.mHandler     // Catch: java.lang.Throwable -> L9
            if (r1 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r4 = move-exception
            goto L21
        Lb:
            r2 = 40
            if (r5 != r2) goto L16
            if (r7 == 0) goto L16
            r3.handleNotify(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L16:
            android.os.Message r4 = r1.obtainMessage(r5, r6, r4)     // Catch: java.lang.Throwable -> L9
            r4.obj = r7     // Catch: java.lang.Throwable -> L9
            r4.sendToTarget()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r4
    }

    @Override // com.bykv.vk.component.ttvideo.player.ISurfaceListener
    public void onSurfaceChanged(android.view.SurfaceHolder r2) {
            r1 = this;
            java.lang.String r2 = com.bykv.vk.component.ttvideo.player.TTPlayerClient.TAG
            java.lang.String r0 = "surface is change"
            com.bykv.vk.component.ttvideo.utils.AVLogger.k(r2, r0)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ISurfaceListener
    public void onSurfaceCreated(android.view.SurfaceHolder r3) {
            r2 = this;
            r2.mSurfaceHolder = r3
            boolean r0 = r2.mRealsedSurface
            if (r0 == 0) goto L7
            return
        L7:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.lock()
            boolean r0 = r2.isValid()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L32
            android.view.SurfaceHolder r0 = r2.mSurfaceHolder     // Catch: java.lang.Throwable -> L1e
            if (r3 == r0) goto L29
            if (r0 == 0) goto L20
            com.bykv.vk.component.ttvideo.player.TTSurfaceCallback r1 = r2.mCallback     // Catch: java.lang.Throwable -> L1e
            r0.removeCallback(r1)     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r3 = move-exception
            goto L38
        L20:
            r2.mSurfaceHolder = r3     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L29
            com.bykv.vk.component.ttvideo.player.TTSurfaceCallback r0 = r2.mCallback     // Catch: java.lang.Throwable -> L1e
            r3.addCallback(r0)     // Catch: java.lang.Throwable -> L1e
        L29:
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r2.mPlayer     // Catch: java.lang.Throwable -> L1e
            android.view.Surface r3 = r3.getSurface()     // Catch: java.lang.Throwable -> L1e
            r0.setSurface(r3)     // Catch: java.lang.Throwable -> L1e
        L32:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.mReadLock
            r3.unlock()
            return
        L38:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.unlock()
            throw r3
    }

    @Override // com.bykv.vk.component.ttvideo.player.ISurfaceListener
    public void onSurfaceDestroyed(android.view.SurfaceHolder r4) {
            r3 = this;
            boolean r4 = r3.mRealsedSurface
            if (r4 == 0) goto L5
            return
        L5:
            int r4 = r3.mMediaCodecStopTimeOutMs
            if (r4 <= 0) goto L23
            com.bykv.vk.component.ttvideo.player.TTPlayerClient$2 r4 = new com.bykv.vk.component.ttvideo.player.TTPlayerClient$2
            r4.<init>(r3)
            java.util.concurrent.Future r4 = com.bykv.vk.component.ttvideo.player.AVThreadPool.addTask(r4)
            int r0 = r3.mMediaCodecStopTimeOutMs     // Catch: java.lang.Throwable -> L1b
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L1b
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L1b
            r4.get(r0, r2)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            java.lang.String r4 = com.bykv.vk.component.ttvideo.player.TTPlayerClient.TAG
            java.lang.String r0 = "set surface time out"
            com.bytedance.sdk.component.utils.vl.r(r4, r0)
            return
        L23:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r3.mReadLock
            r4.lock()
            boolean r4 = r3.isValid()     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L37
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r4 = r3.mPlayer     // Catch: java.lang.Throwable -> L35
            r0 = 0
            r4.setSurface(r0)     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r4 = move-exception
            goto L3d
        L37:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r3.mReadLock
            r4.unlock()
            return
        L3d:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.unlock()
            throw r4
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void pause() {
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.lock()
            boolean r0 = r2.isValid()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r2.mPlayer     // Catch: java.lang.Throwable -> L11
            r0.pause()     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r0 = move-exception
            goto L1d
        L13:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.unlock()
            r0 = 0
            r2.stayAwake(r0)
            return
        L1d:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r2.mReadLock
            r1.unlock()
            throw r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void prepare() {
            r0 = this;
            r0.prepareAsync()
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void prepareAsync() {
            r3 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.lock()
            boolean r0 = r3.isValid()     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L2f
            r0 = 0
            r3.mErrorCode = r0     // Catch: java.lang.Throwable -> L25
            java.util.LinkedList<java.lang.String> r1 = r3.mLogInfo     // Catch: java.lang.Throwable -> L25
            r1.clear()     // Catch: java.lang.Throwable -> L25
            boolean r1 = r3.mRealsedSurface     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L27
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r1 = r3.mPlayer     // Catch: java.lang.Throwable -> L25
            android.view.SurfaceHolder r2 = r3.mSurfaceHolder     // Catch: java.lang.Throwable -> L25
            android.view.Surface r2 = r2.getSurface()     // Catch: java.lang.Throwable -> L25
            r1.setSurface(r2)     // Catch: java.lang.Throwable -> L25
            r3.mRealsedSurface = r0     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r0 = move-exception
            goto L35
        L27:
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r3.mPlayer     // Catch: java.lang.Throwable -> L25
            r0.prepare()     // Catch: java.lang.Throwable -> L25
            r3.updateLifeId()     // Catch: java.lang.Throwable -> L25
        L2f:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.unlock()
            return
        L35:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r3.mReadLock
            r1.unlock()
            throw r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    @java.lang.Deprecated
    public void prevClose() {
            r2 = this;
            r0 = 1
            r2.mRealsedSurface = r0
            android.view.SurfaceHolder r0 = r2.mSurfaceHolder
            if (r0 == 0) goto Lc
            com.bykv.vk.component.ttvideo.player.TTSurfaceCallback r1 = r2.mCallback
            r0.removeCallback(r1)
        Lc:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.lock()
            boolean r0 = r2.isValid()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1f
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r2.mPlayer     // Catch: java.lang.Throwable -> L1d
            r0.prevClose()     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r0 = move-exception
            goto L28
        L1f:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.unlock()
            r0 = 0
            r2.mSurface = r0
            return
        L28:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r2.mReadLock
            r1.unlock()
            throw r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void release() {
            r4 = this;
            r0 = 0
            r4.stayAwake(r0)
            r4.updateSurfaceScreenOn()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r4.mWriteLock
            r0.lock()
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r4.mPlayer     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            r4.mPlayer = r1     // Catch: java.lang.Throwable -> L1a
            r2 = -1
            r4.mPlayLifeId = r2     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1c
            r0.release()     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r0 = move-exception
            goto L5d
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r4.mWriteLock
            r0.unlock()
            android.view.SurfaceHolder r0 = r4.mSurfaceHolder
            if (r0 == 0) goto L2f
            com.bykv.vk.component.ttvideo.player.TTSurfaceCallback r2 = r4.mCallback
            r0.removeCallback(r2)
            r4.mSurfaceHolder = r1
            r0 = 1
            r4.mRealsedSurface = r0
        L2f:
            r4.mSurface = r1
            java.lang.Object r0 = r4.mHandlerLocker
            monitor-enter(r0)
            android.os.Handler r2 = r4.mHandler     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L40
            r2.removeCallbacksAndMessages(r1)     // Catch: java.lang.Throwable -> L3e
            r4.mHandler = r1     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r1 = move-exception
            goto L5b
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            com.bykv.vk.component.ttvideo.player.MediaPlayer$OnLogListener r0 = r4.mLogListener
            if (r0 == 0) goto L58
            java.lang.String r0 = r4.getPlayerErrorInfo()
            if (r0 == 0) goto L58
            int r2 = r0.length()
            if (r2 <= 0) goto L58
            com.bykv.vk.component.ttvideo.player.MediaPlayer$OnLogListener r2 = r4.mLogListener
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r4.mWrapper
            r2.onLogInfo(r3, r0)
        L58:
            r4.mContext = r1
            return
        L5b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r1
        L5d:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r4.mWriteLock
            r1.unlock()
            throw r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void releaseAsync() {
            r3 = this;
            r0 = 1
            r3.mRealsedSurface = r0
            android.view.SurfaceHolder r0 = r3.mSurfaceHolder
            if (r0 == 0) goto Lc
            com.bykv.vk.component.ttvideo.player.TTSurfaceCallback r1 = r3.mCallback
            r0.removeCallback(r1)
        Lc:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.lock()
            boolean r0 = r3.isValid()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1f
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r3.mPlayer     // Catch: java.lang.Throwable -> L1d
            r0.prevClose()     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r0 = move-exception
            goto L37
        L1f:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.unlock()
            r0 = 0
            r3.mSurface = r0
            com.bytedance.sdk.component.oq.r.cw r0 = new com.bytedance.sdk.component.oq.r.cw
            com.bykv.vk.component.ttvideo.player.TTPlayerClient$1 r1 = new com.bykv.vk.component.ttvideo.player.TTPlayerClient$1
            r1.<init>(r3)
            java.lang.String r2 = "TPlayerClient"
            r0.<init>(r1, r2)
            r0.start()
            return
        L37:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r3.mReadLock
            r1.unlock()
            throw r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void reset() {
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.mWriteLock
            r0.lock()
            boolean r0 = r2.isValid()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L31
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r2.mPlayer     // Catch: java.lang.Throwable -> L1e
            r0.reset()     // Catch: java.lang.Throwable -> L1e
            android.view.SurfaceHolder r0 = r2.mSurfaceHolder     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L20
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r1 = r2.mPlayer     // Catch: java.lang.Throwable -> L1e
            android.view.Surface r0 = r0.getSurface()     // Catch: java.lang.Throwable -> L1e
            r1.setSurface(r0)     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r0 = move-exception
            goto L37
        L20:
            android.os.Handler r0 = r2.mHandler     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.Throwable -> L1e
            r0 = 0
            r2.mErrorCode = r0     // Catch: java.lang.Throwable -> L1e
            java.util.LinkedList<java.lang.String> r0 = r2.mLogInfo     // Catch: java.lang.Throwable -> L1e
            r0.clear()     // Catch: java.lang.Throwable -> L1e
            r2.updateLifeId()     // Catch: java.lang.Throwable -> L1e
        L31:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.mWriteLock
            r0.unlock()
            return
        L37:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r2.mWriteLock
            r1.unlock()
            throw r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void rotateCamera(float r2, float r3) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L11
            r0.rotateCamera(r2, r3)     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r2 = move-exception
            goto L19
        L13:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.unlock()
            return
        L19:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.mReadLock
            r3.unlock()
            throw r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void seekTo(int r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            r0 = 0
            r1.mSeekComplete = r0     // Catch: java.lang.Throwable -> L14
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L14
            r0.seekTo(r2)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r2 = move-exception
            goto L1c
        L16:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.unlock()
            return
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.unlock()
            throw r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void selectTrack(int r3) {
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.lock()
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r2.mPlayer
            if (r0 == 0) goto L11
            if (r3 != 0) goto L11
            r3 = 261(0x105, float:3.66E-43)
            r1 = 0
            r0.setIntOption(r3, r1)
        L11:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.mReadLock
            r3.unlock()
            return
    }

    public void setAudioProcessor(com.bykv.vk.component.ttvideo.player.AudioProcessor r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L11
            r0.setAudioProcessor(r2)     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r2 = move-exception
            goto L19
        L13:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.unlock()
            return
        L19:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.unlock()
            throw r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setCacheFile(java.lang.String r2, int r3) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L11
            r0.setCacheFile(r2, r3)     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r2 = move-exception
            goto L19
        L13:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.unlock()
            return
        L19:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.mReadLock
            r3.unlock()
            throw r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setDataSource(android.content.Context r3, android.net.Uri r4) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException, java.io.IOException {
            r2 = this;
            if (r4 != 0) goto L3
            goto L40
        L3:
            java.lang.String r0 = r4.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2e
            java.lang.String r0 = "settings"
            java.lang.String r1 = r4.getAuthority()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
            int r4 = android.media.RingtoneManager.getDefaultType(r4)
            android.net.Uri r4 = android.media.RingtoneManager.getActualDefaultRingtoneUri(r3, r4)
            if (r4 == 0) goto L26
            goto L2e
        L26:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.String r4 = "Failed to resolve default ringtone"
            r3.<init>(r4)
            throw r3
        L2e:
            r0 = 0
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e java.lang.SecurityException -> L50
            java.lang.String r1 = "r"
            android.content.res.AssetFileDescriptor r0 = r3.openAssetFileDescriptor(r4, r1)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e java.lang.SecurityException -> L50
            if (r0 != 0) goto L41
            if (r0 == 0) goto L40
            r0.close()
        L40:
            return
        L41:
            java.io.FileDescriptor r3 = r0.getFileDescriptor()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e java.lang.SecurityException -> L50
            r2.setDataSource(r3)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e java.lang.SecurityException -> L50
            r0.close()
            return
        L4c:
            r3 = move-exception
            goto L52
        L4e:
            goto L58
        L50:
            goto L5e
        L52:
            if (r0 == 0) goto L57
            r0.close()
        L57:
            throw r3
        L58:
            if (r0 == 0) goto L61
        L5a:
            r0.close()
            goto L61
        L5e:
            if (r0 == 0) goto L61
            goto L5a
        L61:
            java.lang.String r3 = r4.toString()
            r2.setDataSource(r3)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setDataSource(android.content.Context r2, android.net.Uri r3, java.util.Map<java.lang.String, java.lang.String> r4) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException, java.io.IOException {
            r1 = this;
            if (r3 != 0) goto L3
            goto L6a
        L3:
            r1.setDataSource(r2, r3)
            if (r4 == 0) goto L6a
            int r2 = r4.size()
            if (r2 != 0) goto Lf
            goto L6a
        Lf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.Set r3 = r4.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L45
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r2.append(r0)
            java.lang.String r0 = ":"
            r2.append(r0)
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r4 = "\r\n"
            r2.append(r4)
            goto L1c
        L45:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.mReadLock
            r3.lock()
            boolean r3 = r1.isValid()     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L5e
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r3 = r1.mPlayer     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5c
            r4 = 20
            r3.setStringOption(r4, r2)     // Catch: java.lang.Throwable -> L5c
            goto L5e
        L5c:
            r2 = move-exception
            goto L64
        L5e:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.unlock()
            return
        L64:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.mReadLock
            r3.unlock()
            throw r2
        L6a:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setDataSource(com.bykv.vk.component.ttvideo.player.IMediaDataSource r2) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException, java.io.IOException {
            r1 = this;
            if (r2 == 0) goto L21
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L13
            r0.setDataSource(r2)     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L1b
        L15:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.unlock()
            return
        L1b:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.unlock()
            throw r2
        L21:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "null mediadatasource pointer."
            r2.<init>(r0)
            throw r2
    }

    public void setDataSource(java.io.FileDescriptor r3) throws java.io.IOException {
            r2 = this;
            android.os.ParcelFileDescriptor r3 = android.os.ParcelFileDescriptor.dup(r3)
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r2.mPlayer     // Catch: java.lang.Throwable -> L11
            int r1 = r3.getFd()     // Catch: java.lang.Throwable -> L11
            r0.setDataSourceFd(r1)     // Catch: java.lang.Throwable -> L11
            r3.close()
            return
        L11:
            r0 = move-exception
            if (r3 == 0) goto L17
            r3.close()
        L17:
            throw r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setDataSource(java.io.FileDescriptor r2, long r3, long r5) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.io.IOException {
            r1 = this;
            r1.setDataSource(r2)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.lock()
            boolean r2 = r1.isValid()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1f
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r2 = r1.mPlayer     // Catch: java.lang.Throwable -> L1d
            r0 = 135(0x87, float:1.89E-43)
            r2.setLongOption(r0, r3)     // Catch: java.lang.Throwable -> L1d
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r2 = r1.mPlayer     // Catch: java.lang.Throwable -> L1d
            r3 = 136(0x88, float:1.9E-43)
            r2.setLongOption(r3, r5)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r2 = move-exception
            goto L25
        L1f:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.unlock()
            return
        L25:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.mReadLock
            r3.unlock()
            throw r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setDataSource(java.lang.String r3) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException, java.io.IOException {
            r2 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r3.toLowerCase(r0)
            java.lang.String r1 = "://"
            int r0 = r0.indexOf(r1)
            if (r0 > 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "file://"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.mUri = r3
            goto L21
        L1f:
            r2.mUri = r3
        L21:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.mReadLock
            r3.lock()
            boolean r3 = r2.isValid()     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L36
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r3 = r2.mPlayer     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = r2.mUri     // Catch: java.lang.Throwable -> L34
            r3.setDataSource(r0)     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r3 = move-exception
            goto L3c
        L36:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.mReadLock
            r3.unlock()
            return
        L3c:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.unlock()
            throw r3
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setDisplay(android.view.SurfaceHolder r3) {
            r2 = this;
            android.view.SurfaceHolder r0 = r2.mSurfaceHolder
            if (r0 == 0) goto L9
            com.bykv.vk.component.ttvideo.player.TTSurfaceCallback r1 = r2.mCallback
            r0.removeCallback(r1)
        L9:
            r2.mSurfaceHolder = r3
            if (r3 == 0) goto L19
            com.bykv.vk.component.ttvideo.player.TTSurfaceCallback r0 = r2.mCallback
            r3.addCallback(r0)
            android.view.SurfaceHolder r3 = r2.mSurfaceHolder
            android.view.Surface r3 = r3.getSurface()
            goto L1a
        L19:
            r3 = 0
        L1a:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.lock()
            boolean r0 = r2.isValid()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2d
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r2.mPlayer     // Catch: java.lang.Throwable -> L2b
            r0.setSurface(r3)     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r3 = move-exception
            goto L36
        L2d:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.mReadLock
            r3.unlock()
            r2.updateSurfaceScreenOn()
            return
        L36:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.unlock()
            throw r3
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public int setFloatOption(int r2, float r3) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L12
            int r2 = r0.setFloatOption(r2, r3)     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r2 = move-exception
            goto L1b
        L14:
            r2 = -1
        L15:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.mReadLock
            r3.unlock()
            return r2
        L1b:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.mReadLock
            r3.unlock()
            throw r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setFrameMetadataListener(com.bykv.vk.component.ttvideo.player.FrameMetadataListener r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L11
            r0.setFrameMetadataListener(r2)     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r2 = move-exception
            goto L19
        L13:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.unlock()
            return
        L19:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.unlock()
            throw r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public int setIntOption(int r3, int r4) {
            r2 = this;
            r0 = 41
            r1 = 0
            if (r3 != r0) goto L8
            com.bykv.vk.component.ttvideo.net.AVResolver.HOST_MAX_CACHE_TIME = r4
            return r1
        L8:
            r0 = 5003(0x138b, float:7.01E-42)
            if (r3 != r0) goto Lf
            r2.mDisablePlayerStayAwake = r4
            return r1
        Lf:
            r0 = 952(0x3b8, float:1.334E-42)
            if (r3 != r0) goto L16
            r2.mMediaCodecStopTimeOutMs = r4
            return r1
        L16:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.lock()
            boolean r0 = r2.isValid()     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L2a
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r2.mPlayer     // Catch: java.lang.Throwable -> L28
            int r3 = r0.setIntOption(r3, r4)     // Catch: java.lang.Throwable -> L28
            goto L2b
        L28:
            r3 = move-exception
            goto L31
        L2a:
            r3 = -1
        L2b:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r2.mReadLock
            r4.unlock()
            return r3
        L31:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r2.mReadLock
            r4.unlock()
            throw r3
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setIsMute(boolean r3) {
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.lock()
            boolean r0 = r2.isValid()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r2.mPlayer     // Catch: java.lang.Throwable -> L13
            r1 = 12
            r0.setIntOption(r1, r3)     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r3 = move-exception
            goto L1b
        L15:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.mReadLock
            r3.unlock()
            return
        L1b:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.unlock()
            throw r3
    }

    public void setLoadControl(com.bykv.vk.component.ttvideo.player.LoadControl r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L11
            r0.setLoadControl(r2)     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r2 = move-exception
            goto L19
        L13:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.unlock()
            return
        L19:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.unlock()
            throw r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public int setLongOption(int r2, long r3) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L12
            int r2 = r0.setLongOption(r2, r3)     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r2 = move-exception
            goto L1b
        L14:
            r2 = -1
        L15:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.mReadLock
            r3.unlock()
            return r2
        L1b:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.mReadLock
            r3.unlock()
            throw r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setLooping(boolean r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L11
            r0.setLooping(r2)     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r2 = move-exception
            goto L19
        L13:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.unlock()
            return
        L19:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.unlock()
            throw r2
    }

    public void setMaskInfo(com.bykv.vk.component.ttvideo.player.MaskInfo r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L11
            r0.setMaskInfo(r2)     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r2 = move-exception
            goto L19
        L13:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.unlock()
            return
        L19:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.unlock()
            throw r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setMediaTransport(com.bykv.vk.component.ttvideo.player.MediaTransport r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L11
            r0.setMediaTransport(r2)     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r2 = move-exception
            goto L19
        L13:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.unlock()
            return
        L19:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.unlock()
            throw r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setOnBufferingUpdateListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnBufferingUpdateListener r5) {
            r4 = this;
            r4.mOnBufferingUpdateListener = r5
            long r0 = r4.mListenerState
            r2 = 8
            long r0 = r0 | r2
            r4.mListenerState = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.mReadLock
            r5.lock()
            boolean r5 = r4.isValid()     // Catch: java.lang.Throwable -> L1c
            if (r5 == 0) goto L1e
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r5 = r4.mPlayer     // Catch: java.lang.Throwable -> L1c
            long r0 = r4.mListenerState     // Catch: java.lang.Throwable -> L1c
            r5.setNotifyState(r0)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r5 = move-exception
            goto L24
        L1e:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.mReadLock
            r5.unlock()
            return
        L24:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.mReadLock
            r0.unlock()
            throw r5
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setOnCompletionListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnCompletionListener r5) {
            r4 = this;
            r4.mOnCompletionListener = r5
            long r0 = r4.mListenerState
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0 | r2
            r4.mListenerState = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.mReadLock
            r5.lock()
            boolean r5 = r4.isValid()     // Catch: java.lang.Throwable -> L1c
            if (r5 == 0) goto L1e
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r5 = r4.mPlayer     // Catch: java.lang.Throwable -> L1c
            long r0 = r4.mListenerState     // Catch: java.lang.Throwable -> L1c
            r5.setNotifyState(r0)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r5 = move-exception
            goto L24
        L1e:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.mReadLock
            r5.unlock()
            return
        L24:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.mReadLock
            r0.unlock()
            throw r5
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setOnErrorListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnErrorListener r5) {
            r4 = this;
            r4.mOnErrorListener = r5
            long r0 = r4.mListenerState
            r2 = 35184372088833(0x200000000001, double:1.7383389519588E-310)
            long r0 = r0 | r2
            r4.mListenerState = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.mReadLock
            r5.lock()
            boolean r5 = r4.isValid()     // Catch: java.lang.Throwable -> L1f
            if (r5 == 0) goto L21
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r5 = r4.mPlayer     // Catch: java.lang.Throwable -> L1f
            long r0 = r4.mListenerState     // Catch: java.lang.Throwable -> L1f
            r5.setNotifyState(r0)     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r5 = move-exception
            goto L27
        L21:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.mReadLock
            r5.unlock()
            return
        L27:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.mReadLock
            r0.unlock()
            throw r5
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setOnExternInfoListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnExternInfoListener r5) {
            r4 = this;
            r4.mOnExternInfoListener = r5
            long r0 = r4.mListenerState
            r2 = 27496381153280(0x190200080000, double:1.35850173127924E-310)
            long r0 = r0 | r2
            r4.mListenerState = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.mReadLock
            r5.lock()
            boolean r5 = r4.isValid()     // Catch: java.lang.Throwable -> L1f
            if (r5 == 0) goto L21
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r5 = r4.mPlayer     // Catch: java.lang.Throwable -> L1f
            long r0 = r4.mListenerState     // Catch: java.lang.Throwable -> L1f
            r5.setNotifyState(r0)     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r5 = move-exception
            goto L27
        L21:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.mReadLock
            r5.unlock()
            return
        L27:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.mReadLock
            r0.unlock()
            throw r5
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setOnInfoListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnInfoListener r5) {
            r4 = this;
            r4.mOnInfoListener = r5
            long r0 = r4.mListenerState
            r2 = 35614270388438962(0x7e86fd7f7007b2, double:2.7170203837348287E-306)
            long r0 = r0 | r2
            r4.mListenerState = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.mReadLock
            r5.lock()
            boolean r5 = r4.isValid()     // Catch: java.lang.Throwable -> L1f
            if (r5 == 0) goto L21
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r5 = r4.mPlayer     // Catch: java.lang.Throwable -> L1f
            long r0 = r4.mListenerState     // Catch: java.lang.Throwable -> L1f
            r5.setNotifyState(r0)     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r5 = move-exception
            goto L27
        L21:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.mReadLock
            r5.unlock()
            return
        L27:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.mReadLock
            r0.unlock()
            throw r5
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setOnLogListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnLogListener r1) {
            r0 = this;
            r0.mLogListener = r1
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setOnPreparedListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnPreparedListener r5) {
            r4 = this;
            r4.mOnPreparedListener = r5
            long r0 = r4.mListenerState
            r2 = 4
            long r0 = r0 | r2
            r4.mListenerState = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.mReadLock
            r5.lock()
            boolean r5 = r4.isValid()     // Catch: java.lang.Throwable -> L1c
            if (r5 == 0) goto L1e
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r5 = r4.mPlayer     // Catch: java.lang.Throwable -> L1c
            long r0 = r4.mListenerState     // Catch: java.lang.Throwable -> L1c
            r5.setNotifyState(r0)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r5 = move-exception
            goto L24
        L1e:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.mReadLock
            r5.unlock()
            return
        L24:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.mReadLock
            r0.unlock()
            throw r5
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setOnSARChangedListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.onSARChangedListener r5) {
            r4 = this;
            r4.mOnSARChangedListener = r5
            long r0 = r4.mListenerState
            r2 = 8388608(0x800000, double:4.144523E-317)
            long r0 = r0 | r2
            r4.mListenerState = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.mReadLock
            r5.lock()
            boolean r5 = r4.isValid()     // Catch: java.lang.Throwable -> L1d
            if (r5 == 0) goto L1f
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r5 = r4.mPlayer     // Catch: java.lang.Throwable -> L1d
            long r0 = r4.mListenerState     // Catch: java.lang.Throwable -> L1d
            r5.setNotifyState(r0)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r5 = move-exception
            goto L25
        L1f:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.mReadLock
            r5.unlock()
            return
        L25:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.mReadLock
            r0.unlock()
            throw r5
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setOnSeekCompleteListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnSeekCompleteListener r5) {
            r4 = this;
            r4.mOnSeekCompleteListener = r5
            long r0 = r4.mListenerState
            r2 = 4096(0x1000, double:2.0237E-320)
            long r0 = r0 | r2
            r4.mListenerState = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.mReadLock
            r5.lock()
            boolean r5 = r4.isValid()     // Catch: java.lang.Throwable -> L1c
            if (r5 == 0) goto L1e
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r5 = r4.mPlayer     // Catch: java.lang.Throwable -> L1c
            long r0 = r4.mListenerState     // Catch: java.lang.Throwable -> L1c
            r5.setNotifyState(r0)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r5 = move-exception
            goto L24
        L1e:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.mReadLock
            r5.unlock()
            return
        L24:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.mReadLock
            r0.unlock()
            throw r5
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setOnVideoSizeChangedListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnVideoSizeChangedListener r5) {
            r4 = this;
            r4.mOnVideoSizeChangedListener = r5
            long r0 = r4.mListenerState
            r2 = 64
            long r0 = r0 | r2
            r4.mListenerState = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.mReadLock
            r5.lock()
            boolean r5 = r4.isValid()     // Catch: java.lang.Throwable -> L1c
            if (r5 == 0) goto L1e
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r5 = r4.mPlayer     // Catch: java.lang.Throwable -> L1c
            long r0 = r4.mListenerState     // Catch: java.lang.Throwable -> L1c
            r5.setNotifyState(r0)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r5 = move-exception
            goto L24
        L1e:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.mReadLock
            r5.unlock()
            return
        L24:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.mReadLock
            r0.unlock()
            throw r5
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setPanoVideoControlModel(int r3) {
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.lock()
            boolean r0 = r2.isValid()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r2.mPlayer     // Catch: java.lang.Throwable -> L13
            r1 = 11
            r0.setIntOption(r1, r3)     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r3 = move-exception
            goto L1b
        L15:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.mReadLock
            r3.unlock()
            return
        L1b:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.unlock()
            throw r3
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setPlaybackParams(com.bykv.vk.component.ttvideo.player.PlaybackParams r3) {
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.lock()
            boolean r0 = r2.isValid()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L25
            if (r3 == 0) goto L25
            float r0 = r3.getSpeed()     // Catch: java.lang.Throwable -> L23
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L25
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r2.mPlayer     // Catch: java.lang.Throwable -> L23
            float r3 = r3.getSpeed()     // Catch: java.lang.Throwable -> L23
            r1 = 60
            r0.setFloatOption(r1, r3)     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r3 = move-exception
            goto L2b
        L25:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.mReadLock
            r3.unlock()
            return
        L2b:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.unlock()
            throw r3
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setScreenOnWhilePlaying(boolean r3) {
            r2 = this;
            boolean r0 = r2.mScreenOnWhilePlaying
            if (r0 == r3) goto L16
            if (r3 == 0) goto L11
            android.view.SurfaceHolder r0 = r2.mSurfaceHolder
            if (r0 != 0) goto L11
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerClient.TAG
            java.lang.String r1 = "setScreenOnWhilePlaying(true) is ineffective without a SurfaceHolder"
            com.bytedance.sdk.component.utils.vl.xt(r0, r1)
        L11:
            r2.mScreenOnWhilePlaying = r3
            r2.updateSurfaceScreenOn()
        L16:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public int setStringOption(int r2, java.lang.String r3) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L12
            int r2 = r0.setStringOption(r2, r3)     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r2 = move-exception
            goto L1b
        L14:
            r2 = -1
        L15:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.mReadLock
            r3.unlock()
            return r2
        L1b:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.mReadLock
            r3.unlock()
            throw r2
    }

    public void setSubInfo(com.bykv.vk.component.ttvideo.player.SubInfo r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L11
            r0.setSubInfo(r2)     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r2 = move-exception
            goto L19
        L13:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.unlock()
            return
        L19:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.unlock()
            throw r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setSurface(android.view.Surface r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            r1.mSurface = r2     // Catch: java.lang.Throwable -> L13
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L13
            r0.setSurface(r2)     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L1b
        L15:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.unlock()
            return
        L1b:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.unlock()
            throw r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setVolume(float r2, float r3) {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L11
            r0.setVolume(r2, r3)     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r2 = move-exception
            goto L19
        L13:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.unlock()
            return
        L19:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.mReadLock
            r3.unlock()
            throw r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    @android.annotation.SuppressLint({"Wakelock"})
    public void setWakeMode(android.content.Context r4, int r5) {
            r3 = this;
            android.os.PowerManager$WakeLock r0 = r3.mWakeLock
            r1 = 0
            if (r0 == 0) goto L17
            boolean r0 = r0.isHeld()
            if (r0 == 0) goto L12
            android.os.PowerManager$WakeLock r0 = r3.mWakeLock
            r0.release()
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            r2 = 0
            r3.mWakeLock = r2
            goto L18
        L17:
            r0 = 0
        L18:
            java.lang.String r2 = "power"
            java.lang.Object r4 = r4.getSystemService(r2)
            android.os.PowerManager r4 = (android.os.PowerManager) r4
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r5 | r2
            java.lang.Class<com.bykv.vk.component.ttvideo.player.TTPlayerClient> r2 = com.bykv.vk.component.ttvideo.player.TTPlayerClient.class
            java.lang.String r2 = r2.getName()
            android.os.PowerManager$WakeLock r4 = r4.newWakeLock(r5, r2)
            r3.mWakeLock = r4
            r4.setReferenceCounted(r1)
            if (r0 == 0) goto L39
            android.os.PowerManager$WakeLock r4 = r3.mWakeLock
            r4.acquire()
        L39:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void start() {
            r3 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.lock()
            boolean r0 = r3.isValid()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L21
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r3.mPlayer     // Catch: java.lang.Throwable -> L1f
            r0.start()     // Catch: java.lang.Throwable -> L1f
            r3.updateLifeId()     // Catch: java.lang.Throwable -> L1f
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r3.mPlayer     // Catch: java.lang.Throwable -> L1f
            r1 = 800(0x320, float:1.121E-42)
            r2 = 0
            int r0 = r0.getIntOption(r1, r2)     // Catch: java.lang.Throwable -> L1f
            r3.mRtcPlay = r0     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r0 = move-exception
            goto L2b
        L21:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.mReadLock
            r0.unlock()
            r0 = 1
            r3.stayAwake(r0)
            return
        L2b:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r3.mReadLock
            r1.unlock()
            throw r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void stop() {
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.lock()
            boolean r0 = r2.isValid()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r2.mPlayer     // Catch: java.lang.Throwable -> L11
            r0.stop()     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r0 = move-exception
            goto L1d
        L13:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.mReadLock
            r0.unlock()
            r0 = 0
            r2.stayAwake(r0)
            return
        L1d:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r2.mReadLock
            r1.unlock()
            throw r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void switchStream(int r2, int r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer
            if (r0 == 0) goto L23
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mReadLock
            r0.lock()
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r1.mPlayer     // Catch: java.lang.Throwable -> L15
            r0.switchStream(r2, r3)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r2 = move-exception
            goto L1d
        L17:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mReadLock
            r2.unlock()
            return
        L1d:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.mReadLock
            r3.unlock()
            throw r2
        L23:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void takeScreenshot(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnScreenshotListener r5) {
            r4 = this;
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r4.mPlayer
            if (r0 == 0) goto L39
            if (r5 == 0) goto L39
            long r0 = r4.mListenerState
            r2 = 32768(0x8000, double:1.61895E-319)
            long r0 = r0 | r2
            r4.mListenerState = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.mReadLock
            r0.lock()
            boolean r0 = r4.isValid()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2d
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r4.mPlayer     // Catch: java.lang.Throwable -> L2b
            long r1 = r4.mListenerState     // Catch: java.lang.Throwable -> L2b
            r0.setNotifyState(r1)     // Catch: java.lang.Throwable -> L2b
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r4.mPlayer     // Catch: java.lang.Throwable -> L2b
            r0.setOnScreenshotListener(r5)     // Catch: java.lang.Throwable -> L2b
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r5 = r4.mPlayer     // Catch: java.lang.Throwable -> L2b
            r5.takeScreenshot()     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r5 = move-exception
            goto L33
        L2d:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.mReadLock
            r5.unlock()
            return
        L33:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.mReadLock
            r0.unlock()
            throw r5
        L39:
            return
    }

    protected void updateLifeId() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.mReentrantLock     // Catch: java.lang.Throwable -> L1b
            r0.lock()     // Catch: java.lang.Throwable -> L1b
            com.bykv.vk.component.ttvideo.player.ITTPlayerRef r0 = r2.mPlayer     // Catch: java.lang.Throwable -> L1b
            int r0 = r0.getLifeId()     // Catch: java.lang.Throwable -> L1b
            r2.mPlayLifeId = r0     // Catch: java.lang.Throwable -> L1b
            java.util.concurrent.locks.ReentrantLock r0 = r2.mReentrantLock
            boolean r0 = r0.isLocked()
            if (r0 == 0) goto L1a
            java.util.concurrent.locks.ReentrantLock r0 = r2.mReentrantLock
            r0.unlock()
        L1a:
            return
        L1b:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r2.mReentrantLock
            boolean r1 = r1.isLocked()
            if (r1 == 0) goto L29
            java.util.concurrent.locks.ReentrantLock r1 = r2.mReentrantLock
            r1.unlock()
        L29:
            throw r0
    }

    public void updateSurfaceScreenOn() {
            r2 = this;
            android.view.SurfaceHolder r0 = r2.mSurfaceHolder
            if (r0 == 0) goto L16
            int r1 = r2.mDisablePlayerStayAwake
            if (r1 != 0) goto L16
            boolean r1 = r2.mScreenOnWhilePlaying
            if (r1 == 0) goto L12
            boolean r1 = r2.mStayAwake
            if (r1 == 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            r0.setKeepScreenOn(r1)
        L16:
            return
    }
}
