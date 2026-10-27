package tv.danmaku.ijk.media.player;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class IjkMediaPlayer extends tv.danmaku.ijk.media.player.AbstractMediaPlayer {
    public static final int FFP_PROPV_DECODER_AVCODEC = 1;
    public static final int FFP_PROPV_DECODER_MEDIACODEC = 2;
    public static final int FFP_PROPV_DECODER_UNKNOWN = 0;
    public static final int FFP_PROPV_DECODER_VIDEOTOOLBOX = 3;
    public static final int FFP_PROP_FLOAT_DROP_FRAME_RATE = 10007;
    public static final int FFP_PROP_FLOAT_PLAYBACK_RATE = 10003;
    public static final int FFP_PROP_INT64_ASYNC_STATISTIC_BUF_BACKWARDS = 20201;
    public static final int FFP_PROP_INT64_ASYNC_STATISTIC_BUF_CAPACITY = 20203;
    public static final int FFP_PROP_INT64_ASYNC_STATISTIC_BUF_FORWARDS = 20202;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_BYTES = 20008;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_DURATION = 20006;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_PACKETS = 20010;
    public static final int FFP_PROP_INT64_AUDIO_DECODER = 20004;
    public static final int FFP_PROP_INT64_BIT_RATE = 20100;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_COUNT_BYTES = 20208;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_FILE_FORWARDS = 20206;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_FILE_POS = 20207;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_PHYSICAL_POS = 20205;
    public static final int FFP_PROP_INT64_IMMEDIATE_RECONNECT = 20211;
    public static final int FFP_PROP_INT64_LATEST_SEEK_LOAD_DURATION = 20300;
    public static final int FFP_PROP_INT64_LOGICAL_FILE_SIZE = 20209;
    public static final int FFP_PROP_INT64_SELECTED_AUDIO_STREAM = 20002;
    public static final int FFP_PROP_INT64_SELECTED_TIMEDTEXT_STREAM = 20011;
    public static final int FFP_PROP_INT64_SELECTED_VIDEO_STREAM = 20001;
    public static final int FFP_PROP_INT64_SHARE_CACHE_DATA = 20210;
    public static final int FFP_PROP_INT64_TCP_SPEED = 20200;
    public static final int FFP_PROP_INT64_TRAFFIC_STATISTIC_BYTE_COUNT = 20204;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_BYTES = 20007;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_DURATION = 20005;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_PACKETS = 20009;
    public static final int FFP_PROP_INT64_VIDEO_DECODER = 20003;
    public static final int IJK_LOG_DEBUG = 3;
    public static final int IJK_LOG_DEFAULT = 1;
    public static final int IJK_LOG_ERROR = 6;
    public static final int IJK_LOG_FATAL = 7;
    public static final int IJK_LOG_INFO = 4;
    public static final int IJK_LOG_SILENT = 8;
    public static final int IJK_LOG_UNKNOWN = 0;
    public static final int IJK_LOG_VERBOSE = 2;
    public static final int IJK_LOG_WARN = 5;
    private static final int MEDIA_BUFFERING_UPDATE = 3;
    private static final int MEDIA_ERROR = 100;
    private static final int MEDIA_INFO = 200;
    private static final int MEDIA_NOP = 0;
    private static final int MEDIA_PLAYBACK_COMPLETE = 2;
    private static final int MEDIA_PREPARED = 1;
    private static final int MEDIA_SEEK_COMPLETE = 4;
    protected static final int MEDIA_SET_VIDEO_SAR = 10001;
    private static final int MEDIA_SET_VIDEO_SIZE = 5;
    private static final int MEDIA_TIMED_TEXT = 99;
    public static final int OPT_CATEGORY_CODEC = 2;
    public static final int OPT_CATEGORY_FORMAT = 1;
    public static final int OPT_CATEGORY_PLAYER = 4;
    public static final int OPT_CATEGORY_SWS = 3;
    public static final int PROP_FLOAT_VIDEO_DECODE_FRAMES_PER_SECOND = 10001;
    public static final int PROP_FLOAT_VIDEO_OUTPUT_FRAMES_PER_SECOND = 10002;
    public static final int SDL_FCC_RV16 = 909203026;
    public static final int SDL_FCC_RV32 = 842225234;
    public static final int SDL_FCC_YV12 = 842094169;
    private static final java.lang.String TAG = "tv.danmaku.ijk.media.player.IjkMediaPlayer";
    private static volatile boolean mIsLibLoaded;
    private static volatile boolean mIsNativeInitialized;
    private static final tv.danmaku.ijk.media.player.IjkLibLoader sLocalLibLoader = null;
    private java.lang.String mDataSource;
    private tv.danmaku.ijk.media.player.IjkMediaPlayer.EventHandler mEventHandler;

    @tv.danmaku.ijk.media.player.annotations.AccessedByNative
    private int mListenerContext;

    @tv.danmaku.ijk.media.player.annotations.AccessedByNative
    private long mNativeAndroidIO;

    @tv.danmaku.ijk.media.player.annotations.AccessedByNative
    private long mNativeMediaDataSource;

    @tv.danmaku.ijk.media.player.annotations.AccessedByNative
    private long mNativeMediaPlayer;

    @tv.danmaku.ijk.media.player.annotations.AccessedByNative
    private int mNativeSurfaceTexture;
    private tv.danmaku.ijk.media.player.IjkMediaPlayer.OnControlMessageListener mOnControlMessageListener;
    private tv.danmaku.ijk.media.player.IjkMediaPlayer.OnMediaCodecSelectListener mOnMediaCodecSelectListener;
    private tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener mOnNativeInvokeListener;
    private boolean mScreenOnWhilePlaying;
    private boolean mStayAwake;
    private android.view.SurfaceHolder mSurfaceHolder;
    private int mVideoHeight;
    private int mVideoSarDen;
    private int mVideoSarNum;
    private int mVideoWidth;
    private android.os.PowerManager.WakeLock mWakeLock;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class DefaultMediaCodecSelector implements tv.danmaku.ijk.media.player.IjkMediaPlayer.OnMediaCodecSelectListener {
        public static final tv.danmaku.ijk.media.player.IjkMediaPlayer.DefaultMediaCodecSelector sInstance = null;

        static {
                tv.danmaku.ijk.media.player.IjkMediaPlayer$DefaultMediaCodecSelector r0 = new tv.danmaku.ijk.media.player.IjkMediaPlayer$DefaultMediaCodecSelector
                r0.<init>()
                tv.danmaku.ijk.media.player.IjkMediaPlayer.DefaultMediaCodecSelector.sInstance = r0
                return
        }

        public DefaultMediaCodecSelector() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.OnMediaCodecSelectListener
        @android.annotation.TargetApi(16)
        public java.lang.String onMediaCodecSelect(tv.danmaku.ijk.media.player.IMediaPlayer r17, java.lang.String r18, int r19, int r20) {
                r16 = this;
                r0 = r18
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                r2 = 0
                if (r1 == 0) goto La
                return r2
            La:
                tv.danmaku.ijk.media.player.IjkMediaPlayer.access$100()
                java.util.Locale r1 = java.util.Locale.US
                java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = 0
                r5[r6] = r0
                r7 = 1
                r5[r7] = r3
                r3 = 2
                r5[r3] = r4
                java.lang.String r4 = "onSelectCodec: mime=%s, profile=%d, level=%d"
                java.lang.String.format(r1, r4, r5)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                int r4 = android.media.MediaCodecList.getCodecCount()
                r5 = 0
            L32:
                if (r5 >= r4) goto Laf
                android.media.MediaCodecInfo r8 = android.media.MediaCodecList.getCodecInfoAt(r5)
                tv.danmaku.ijk.media.player.IjkMediaPlayer.access$100()
                java.util.Locale r9 = java.util.Locale.US
                java.lang.String r10 = r8.getName()
                java.lang.Object[] r11 = new java.lang.Object[r7]
                r11[r6] = r10
                java.lang.String r10 = "  found codec: %s"
                java.lang.String.format(r9, r10, r11)
                boolean r9 = r8.isEncoder()
                if (r9 == 0) goto L53
            L50:
                r17 = r2
                goto Laa
            L53:
                java.lang.String[] r9 = r8.getSupportedTypes()
                if (r9 != 0) goto L5a
                goto L50
            L5a:
                int r10 = r9.length
                r11 = 0
            L5c:
                if (r11 >= r10) goto L50
                r12 = r9[r11]
                boolean r13 = android.text.TextUtils.isEmpty(r12)
                if (r13 == 0) goto L69
            L66:
                r17 = r2
                goto La5
            L69:
                tv.danmaku.ijk.media.player.IjkMediaPlayer.access$100()
                java.util.Locale r13 = java.util.Locale.US
                java.lang.Object[] r14 = new java.lang.Object[r7]
                r14[r6] = r12
                java.lang.String r15 = "    mime: %s"
                java.lang.String.format(r13, r15, r14)
                boolean r12 = r12.equalsIgnoreCase(r0)
                if (r12 != 0) goto L7e
                goto L66
            L7e:
                tv.danmaku.ijk.media.player.IjkMediaCodecInfo r12 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.setupCandidate(r8, r0)
                if (r12 != 0) goto L85
                goto L66
            L85:
                r1.add(r12)
                tv.danmaku.ijk.media.player.IjkMediaPlayer.access$100()
                java.lang.String r14 = r8.getName()
                int r15 = r12.mRank
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                r17 = r2
                java.lang.Object[] r2 = new java.lang.Object[r3]
                r2[r6] = r14
                r2[r7] = r15
                java.lang.String r14 = "candidate codec: %s rank=%d"
                java.lang.String.format(r13, r14, r2)
                r12.dumpProfileLevels(r0)
            La5:
                int r11 = r11 + 1
                r2 = r17
                goto L5c
            Laa:
                int r5 = r5 + 1
                r2 = r17
                goto L32
            Laf:
                r17 = r2
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto Lb8
                return r17
            Lb8:
                java.lang.Object r0 = r1.get(r6)
                tv.danmaku.ijk.media.player.IjkMediaCodecInfo r0 = (tv.danmaku.ijk.media.player.IjkMediaCodecInfo) r0
                java.util.Iterator r1 = r1.iterator()
            Lc2:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto Ld6
                java.lang.Object r2 = r1.next()
                tv.danmaku.ijk.media.player.IjkMediaCodecInfo r2 = (tv.danmaku.ijk.media.player.IjkMediaCodecInfo) r2
                int r4 = r2.mRank
                int r5 = r0.mRank
                if (r4 <= r5) goto Lc2
                r0 = r2
                goto Lc2
            Ld6:
                int r1 = r0.mRank
                r2 = 600(0x258, float:8.41E-43)
                if (r1 >= r2) goto Lf1
                tv.danmaku.ijk.media.player.IjkMediaPlayer.access$100()
                java.util.Locale r1 = java.util.Locale.US
                android.media.MediaCodecInfo r0 = r0.mCodecInfo
                java.lang.String r0 = r0.getName()
                java.lang.Object[] r2 = new java.lang.Object[r7]
                r2[r6] = r0
                java.lang.String r0 = "unaccetable codec: %s"
                java.lang.String.format(r1, r0, r2)
                return r17
            Lf1:
                tv.danmaku.ijk.media.player.IjkMediaPlayer.access$100()
                java.util.Locale r1 = java.util.Locale.US
                android.media.MediaCodecInfo r2 = r0.mCodecInfo
                java.lang.String r2 = r2.getName()
                int r4 = r0.mRank
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r6] = r2
                r3[r7] = r4
                java.lang.String r2 = "selected codec: %s rank=%d"
                java.lang.String.format(r1, r2, r3)
                android.media.MediaCodecInfo r0 = r0.mCodecInfo
                java.lang.String r0 = r0.getName()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class EventHandler extends android.os.Handler {
        private final java.lang.ref.WeakReference<tv.danmaku.ijk.media.player.IjkMediaPlayer> mWeakPlayer;

        public EventHandler(tv.danmaku.ijk.media.player.IjkMediaPlayer r1, android.os.Looper r2) {
                r0 = this;
                r0.<init>(r2)
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r1)
                r0.mWeakPlayer = r2
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r10) {
                r9 = this;
                java.lang.ref.WeakReference<tv.danmaku.ijk.media.player.IjkMediaPlayer> r0 = r9.mWeakPlayer
                java.lang.Object r0 = r0.get()
                tv.danmaku.ijk.media.player.IjkMediaPlayer r0 = (tv.danmaku.ijk.media.player.IjkMediaPlayer) r0
                if (r0 == 0) goto L12c
                long r1 = tv.danmaku.ijk.media.player.IjkMediaPlayer.access$000(r0)
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 != 0) goto L16
                goto L12c
            L16:
                int r1 = r10.what
                if (r1 == 0) goto L12b
                r2 = 1
                if (r1 == r2) goto L128
                r5 = 2
                r6 = 0
                if (r1 == r5) goto L121
                r5 = 3
                if (r1 == r5) goto L100
                r3 = 4
                if (r1 == r3) goto Lfc
                r3 = 5
                if (r1 == r3) goto Lde
                r3 = 99
                if (r1 == r3) goto Lc3
                r2 = 100
                if (r1 == r2) goto L89
                r2 = 200(0xc8, float:2.8E-43)
                if (r1 == r2) goto L73
                r2 = 10001(0x2711, float:1.4014E-41)
                if (r1 == r2) goto L55
                java.lang.String r0 = tv.danmaku.ijk.media.player.IjkMediaPlayer.access$100()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unknown message type "
                r1.append(r2)
                int r10 = r10.what
                r1.append(r10)
                java.lang.String r10 = r1.toString()
                tv.danmaku.ijk.media.player.pragma.DebugLog.e(r0, r10)
                return
            L55:
                int r1 = r10.arg1
                tv.danmaku.ijk.media.player.IjkMediaPlayer.access$502(r0, r1)
                int r10 = r10.arg2
                tv.danmaku.ijk.media.player.IjkMediaPlayer.access$602(r0, r10)
                int r10 = tv.danmaku.ijk.media.player.IjkMediaPlayer.access$300(r0)
                int r1 = tv.danmaku.ijk.media.player.IjkMediaPlayer.access$400(r0)
                int r2 = tv.danmaku.ijk.media.player.IjkMediaPlayer.access$500(r0)
                int r3 = tv.danmaku.ijk.media.player.IjkMediaPlayer.access$600(r0)
                r0.notifyOnVideoSizeChanged(r10, r1, r2, r3)
                return
            L73:
                int r1 = r10.arg1
                if (r1 == r5) goto L78
                goto L81
            L78:
                java.lang.String r1 = tv.danmaku.ijk.media.player.IjkMediaPlayer.access$100()
                java.lang.String r2 = "Info: MEDIA_INFO_VIDEO_RENDERING_START\n"
                tv.danmaku.ijk.media.player.pragma.DebugLog.i(r1, r2)
            L81:
                int r1 = r10.arg1
                int r10 = r10.arg2
                r0.notifyOnInfo(r1, r10)
                return
            L89:
                java.lang.String r1 = tv.danmaku.ijk.media.player.IjkMediaPlayer.access$100()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Error ("
                r2.append(r3)
                int r3 = r10.arg1
                r2.append(r3)
                java.lang.String r3 = ","
                r2.append(r3)
                int r3 = r10.arg2
                r2.append(r3)
                java.lang.String r3 = ")"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                tv.danmaku.ijk.media.player.pragma.DebugLog.e(r1, r2)
                int r1 = r10.arg1
                int r10 = r10.arg2
                boolean r10 = r0.notifyOnError(r1, r10)
                if (r10 != 0) goto Lbf
                r0.notifyOnCompletion()
            Lbf:
                tv.danmaku.ijk.media.player.IjkMediaPlayer.access$200(r0, r6)
                return
            Lc3:
                java.lang.Object r1 = r10.obj
                if (r1 != 0) goto Lcc
                r10 = 0
                r0.notifyOnTimedText(r10)
                return
            Lcc:
                tv.danmaku.ijk.media.player.IjkTimedText r1 = new tv.danmaku.ijk.media.player.IjkTimedText
                android.graphics.Rect r3 = new android.graphics.Rect
                r3.<init>(r6, r6, r2, r2)
                java.lang.Object r10 = r10.obj
                java.lang.String r10 = (java.lang.String) r10
                r1.<init>(r3, r10)
                r0.notifyOnTimedText(r1)
                return
            Lde:
                int r1 = r10.arg1
                tv.danmaku.ijk.media.player.IjkMediaPlayer.access$302(r0, r1)
                int r10 = r10.arg2
                tv.danmaku.ijk.media.player.IjkMediaPlayer.access$402(r0, r10)
                int r10 = tv.danmaku.ijk.media.player.IjkMediaPlayer.access$300(r0)
                int r1 = tv.danmaku.ijk.media.player.IjkMediaPlayer.access$400(r0)
                int r2 = tv.danmaku.ijk.media.player.IjkMediaPlayer.access$500(r0)
                int r3 = tv.danmaku.ijk.media.player.IjkMediaPlayer.access$600(r0)
                r0.notifyOnVideoSizeChanged(r10, r1, r2, r3)
                return
            Lfc:
                r0.notifyOnSeekComplete()
                return
            L100:
                int r10 = r10.arg1
                long r1 = (long) r10
                int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r10 >= 0) goto L108
                r1 = r3
            L108:
                long r5 = r0.getDuration()
                r7 = 100
                int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r10 <= 0) goto L116
                long r1 = r1 * r7
                long r3 = r1 / r5
            L116:
                int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r10 < 0) goto L11b
                goto L11c
            L11b:
                r7 = r3
            L11c:
                int r10 = (int) r7
                r0.notifyOnBufferingUpdate(r10)
                return
            L121:
                tv.danmaku.ijk.media.player.IjkMediaPlayer.access$200(r0, r6)
                r0.notifyOnCompletion()
                return
            L128:
                r0.notifyOnPrepared()
            L12b:
                return
            L12c:
                java.lang.String r10 = tv.danmaku.ijk.media.player.IjkMediaPlayer.access$100()
                java.lang.String r0 = "IjkMediaPlayer went away with unhandled events"
                tv.danmaku.ijk.media.player.pragma.DebugLog.w(r10, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnControlMessageListener {
        java.lang.String onControlResolveSegmentUrl(int r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnMediaCodecSelectListener {
        java.lang.String onMediaCodecSelect(tv.danmaku.ijk.media.player.IMediaPlayer r1, java.lang.String r2, int r3, int r4);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnNativeInvokeListener {
        public static final java.lang.String ARG_ERROR = "error";
        public static final java.lang.String ARG_FAMILIY = "family";
        public static final java.lang.String ARG_FD = "fd";
        public static final java.lang.String ARG_FILE_SIZE = "file_size";
        public static final java.lang.String ARG_HTTP_CODE = "http_code";
        public static final java.lang.String ARG_IP = "ip";
        public static final java.lang.String ARG_OFFSET = "offset";
        public static final java.lang.String ARG_PORT = "port";
        public static final java.lang.String ARG_RETRY_COUNTER = "retry_counter";
        public static final java.lang.String ARG_SEGMENT_INDEX = "segment_index";
        public static final java.lang.String ARG_URL = "url";
        public static final int CTRL_DID_TCP_OPEN = 131074;
        public static final int CTRL_WILL_CONCAT_RESOLVE_SEGMENT = 131079;
        public static final int CTRL_WILL_HTTP_OPEN = 131075;
        public static final int CTRL_WILL_LIVE_OPEN = 131077;
        public static final int CTRL_WILL_TCP_OPEN = 131073;
        public static final int EVENT_DID_HTTP_OPEN = 2;
        public static final int EVENT_DID_HTTP_SEEK = 4;
        public static final int EVENT_WILL_HTTP_OPEN = 1;
        public static final int EVENT_WILL_HTTP_SEEK = 3;

        boolean onNativeInvoke(int r1, android.os.Bundle r2);
    }

    static {
            tv.danmaku.ijk.media.player.IjkMediaPlayer$1 r0 = new tv.danmaku.ijk.media.player.IjkMediaPlayer$1
            r0.<init>()
            tv.danmaku.ijk.media.player.IjkMediaPlayer.sLocalLibLoader = r0
            r0 = 0
            tv.danmaku.ijk.media.player.IjkMediaPlayer.mIsLibLoaded = r0
            tv.danmaku.ijk.media.player.IjkMediaPlayer.mIsNativeInitialized = r0
            return
    }

    public IjkMediaPlayer() {
            r1 = this;
            tv.danmaku.ijk.media.player.IjkLibLoader r0 = tv.danmaku.ijk.media.player.IjkMediaPlayer.sLocalLibLoader
            r1.<init>(r0)
            return
    }

    public IjkMediaPlayer(tv.danmaku.ijk.media.player.IjkLibLoader r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mWakeLock = r0
            r1.initPlayer(r2)
            return
    }

    private native java.lang.String _getAudioCodecInfo();

    private static native java.lang.String _getColorFormatName(int r0);

    private native int _getLoopCount();

    private native android.os.Bundle _getMediaMeta();

    private native float _getPropertyFloat(int r1, float r2);

    private native long _getPropertyLong(int r1, long r2);

    private native java.lang.String _getVideoCodecInfo();

    private native void _pause() throws java.lang.IllegalStateException;

    private native void _release();

    private native void _reset();

    private native void _setAndroidIOCallback(tv.danmaku.ijk.media.player.misc.IAndroidIO r1) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException;

    private native void _setDataSource(java.lang.String r1, java.lang.String[] r2, java.lang.String[] r3) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException;

    private native void _setDataSource(tv.danmaku.ijk.media.player.misc.IMediaDataSource r1) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException;

    private native void _setDataSourceFd(int r1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException;

    private native void _setFrameAtTime(java.lang.String r1, long r2, long r4, int r6, int r7) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException;

    private native void _setLoopCount(int r1);

    private native void _setOption(int r1, java.lang.String r2, long r3);

    private native void _setOption(int r1, java.lang.String r2, java.lang.String r3);

    private native void _setPropertyFloat(int r1, float r2);

    private native void _setPropertyLong(int r1, long r2);

    private native void _setStreamSelected(int r1, boolean r2);

    private native void _setVideoSurface(android.view.Surface r1);

    private native void _start() throws java.lang.IllegalStateException;

    private native void _stop() throws java.lang.IllegalStateException;

    static /* synthetic */ long access$000(tv.danmaku.ijk.media.player.IjkMediaPlayer r2) {
            long r0 = r2.mNativeMediaPlayer
            return r0
    }

    static /* synthetic */ java.lang.String access$100() {
            java.lang.String r0 = tv.danmaku.ijk.media.player.IjkMediaPlayer.TAG
            return r0
    }

    static /* synthetic */ void access$200(tv.danmaku.ijk.media.player.IjkMediaPlayer r0, boolean r1) {
            r0.stayAwake(r1)
            return
    }

    static /* synthetic */ int access$300(tv.danmaku.ijk.media.player.IjkMediaPlayer r0) {
            int r0 = r0.mVideoWidth
            return r0
    }

    static /* synthetic */ int access$302(tv.danmaku.ijk.media.player.IjkMediaPlayer r0, int r1) {
            r0.mVideoWidth = r1
            return r1
    }

    static /* synthetic */ int access$400(tv.danmaku.ijk.media.player.IjkMediaPlayer r0) {
            int r0 = r0.mVideoHeight
            return r0
    }

    static /* synthetic */ int access$402(tv.danmaku.ijk.media.player.IjkMediaPlayer r0, int r1) {
            r0.mVideoHeight = r1
            return r1
    }

    static /* synthetic */ int access$500(tv.danmaku.ijk.media.player.IjkMediaPlayer r0) {
            int r0 = r0.mVideoSarNum
            return r0
    }

    static /* synthetic */ int access$502(tv.danmaku.ijk.media.player.IjkMediaPlayer r0, int r1) {
            r0.mVideoSarNum = r1
            return r1
    }

    static /* synthetic */ int access$600(tv.danmaku.ijk.media.player.IjkMediaPlayer r0) {
            int r0 = r0.mVideoSarDen
            return r0
    }

    static /* synthetic */ int access$602(tv.danmaku.ijk.media.player.IjkMediaPlayer r0, int r1) {
            r0.mVideoSarDen = r1
            return r1
    }

    public static java.lang.String getColorFormatName(int r0) {
            java.lang.String r0 = _getColorFormatName(r0)
            return r0
    }

    private static void initNativeOnce() {
            java.lang.Class<tv.danmaku.ijk.media.player.IjkMediaPlayer> r0 = tv.danmaku.ijk.media.player.IjkMediaPlayer.class
            monitor-enter(r0)
            boolean r1 = tv.danmaku.ijk.media.player.IjkMediaPlayer.mIsNativeInitialized     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L10
            native_init()     // Catch: java.lang.Throwable -> Le
            r1 = 1
            tv.danmaku.ijk.media.player.IjkMediaPlayer.mIsNativeInitialized = r1     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r1 = move-exception
            goto L12
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    private void initPlayer(tv.danmaku.ijk.media.player.IjkLibLoader r2) {
            r1 = this;
            loadLibrariesOnce(r2)
            initNativeOnce()
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 == 0) goto L14
            tv.danmaku.ijk.media.player.IjkMediaPlayer$EventHandler r0 = new tv.danmaku.ijk.media.player.IjkMediaPlayer$EventHandler
            r0.<init>(r1, r2)
            r1.mEventHandler = r0
            goto L25
        L14:
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            if (r2 == 0) goto L22
            tv.danmaku.ijk.media.player.IjkMediaPlayer$EventHandler r0 = new tv.danmaku.ijk.media.player.IjkMediaPlayer$EventHandler
            r0.<init>(r1, r2)
            r1.mEventHandler = r0
            goto L25
        L22:
            r2 = 0
            r1.mEventHandler = r2
        L25:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r1.native_setup(r2)
            return
    }

    public static void loadLibrariesOnce(tv.danmaku.ijk.media.player.IjkLibLoader r2) {
            java.lang.Class<tv.danmaku.ijk.media.player.IjkMediaPlayer> r0 = tv.danmaku.ijk.media.player.IjkMediaPlayer.class
            monitor-enter(r0)
            boolean r1 = tv.danmaku.ijk.media.player.IjkMediaPlayer.mIsLibLoaded     // Catch: java.lang.Throwable -> Lc
            if (r1 != 0) goto L20
            if (r2 != 0) goto Le
            tv.danmaku.ijk.media.player.IjkLibLoader r2 = tv.danmaku.ijk.media.player.IjkMediaPlayer.sLocalLibLoader     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r2 = move-exception
            goto L22
        Le:
            java.lang.String r1 = "ijkffmpeg"
            r2.loadLibrary(r1)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "ijksdl"
            r2.loadLibrary(r1)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "ijkplayer"
            r2.loadLibrary(r1)     // Catch: java.lang.Throwable -> Lc
            r2 = 1
            tv.danmaku.ijk.media.player.IjkMediaPlayer.mIsLibLoaded = r2     // Catch: java.lang.Throwable -> Lc
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    private native void native_finalize();

    private static native void native_init();

    private native void native_message_loop(java.lang.Object r1);

    public static native void native_profileBegin(java.lang.String r0);

    public static native void native_profileEnd();

    public static native void native_setLogLevel(int r0);

    private native void native_setup(java.lang.Object r1);

    @tv.danmaku.ijk.media.player.annotations.CalledByNative
    private static boolean onNativeInvoke(java.lang.Object r5, int r6, android.os.Bundle r7) {
            java.lang.String r0 = tv.danmaku.ijk.media.player.IjkMediaPlayer.TAG
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = "onNativeInvoke %d"
            tv.danmaku.ijk.media.player.pragma.DebugLog.ifmt(r0, r1, r3)
            if (r5 == 0) goto L69
            boolean r0 = r5 instanceof java.lang.ref.WeakReference
            if (r0 == 0) goto L69
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            java.lang.Object r5 = r5.get()
            tv.danmaku.ijk.media.player.IjkMediaPlayer r5 = (tv.danmaku.ijk.media.player.IjkMediaPlayer) r5
            if (r5 == 0) goto L61
            tv.danmaku.ijk.media.player.IjkMediaPlayer$OnNativeInvokeListener r0 = r5.mOnNativeInvokeListener
            if (r0 == 0) goto L2c
            boolean r0 = r0.onNativeInvoke(r6, r7)
            if (r0 == 0) goto L2c
            return r2
        L2c:
            r0 = 131079(0x20007, float:1.83681E-40)
            if (r6 == r0) goto L32
            return r4
        L32:
            tv.danmaku.ijk.media.player.IjkMediaPlayer$OnControlMessageListener r5 = r5.mOnControlMessageListener
            if (r5 != 0) goto L37
            return r4
        L37:
            java.lang.String r6 = "segment_index"
            r0 = -1
            int r6 = r7.getInt(r6, r0)
            if (r6 < 0) goto L59
            java.lang.String r5 = r5.onControlResolveSegmentUrl(r6)
            if (r5 == 0) goto L4c
            java.lang.String r6 = "url"
            r7.putString(r6, r5)
            return r2
        L4c:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "onNativeInvoke() = <NULL newUrl>"
            r6.<init>(r7)
            r5.<init>(r6)
            throw r5
        L59:
            java.security.InvalidParameterException r5 = new java.security.InvalidParameterException
            java.lang.String r6 = "onNativeInvoke(invalid segment index)"
            r5.<init>(r6)
            throw r5
        L61:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "<null weakPlayer>.onNativeInvoke()"
            r5.<init>(r6)
            throw r5
        L69:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "<null weakThiz>.onNativeInvoke()"
            r5.<init>(r6)
            throw r5
    }

    @tv.danmaku.ijk.media.player.annotations.CalledByNative
    private static java.lang.String onSelectCodec(java.lang.Object r2, java.lang.String r3, int r4, int r5) {
            r0 = 0
            if (r2 == 0) goto L1e
            boolean r1 = r2 instanceof java.lang.ref.WeakReference
            if (r1 != 0) goto L8
            goto L1e
        L8:
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            tv.danmaku.ijk.media.player.IjkMediaPlayer r2 = (tv.danmaku.ijk.media.player.IjkMediaPlayer) r2
            if (r2 != 0) goto L13
            return r0
        L13:
            tv.danmaku.ijk.media.player.IjkMediaPlayer$OnMediaCodecSelectListener r0 = r2.mOnMediaCodecSelectListener
            if (r0 != 0) goto L19
            tv.danmaku.ijk.media.player.IjkMediaPlayer$DefaultMediaCodecSelector r0 = tv.danmaku.ijk.media.player.IjkMediaPlayer.DefaultMediaCodecSelector.sInstance
        L19:
            java.lang.String r2 = r0.onMediaCodecSelect(r2, r3, r4, r5)
            return r2
        L1e:
            return r0
    }

    @tv.danmaku.ijk.media.player.annotations.CalledByNative
    private static void postEventFromNative(java.lang.Object r1, int r2, int r3, int r4, java.lang.Object r5) {
            if (r1 != 0) goto L3
            goto L25
        L3:
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            tv.danmaku.ijk.media.player.IjkMediaPlayer r1 = (tv.danmaku.ijk.media.player.IjkMediaPlayer) r1
            if (r1 != 0) goto Le
            goto L25
        Le:
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 != r0) goto L18
            r0 = 2
            if (r3 != r0) goto L18
            r1.start()
        L18:
            tv.danmaku.ijk.media.player.IjkMediaPlayer$EventHandler r0 = r1.mEventHandler
            if (r0 == 0) goto L25
            android.os.Message r2 = r0.obtainMessage(r2, r3, r4, r5)
            tv.danmaku.ijk.media.player.IjkMediaPlayer$EventHandler r1 = r1.mEventHandler
            r1.sendMessage(r2)
        L25:
            return
    }

    private void setDataSource(java.io.FileDescriptor r1, long r2, long r4) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
            r0 = this;
            r0.setDataSource(r1)
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

    private void updateSurfaceScreenOn() {
            r2 = this;
            android.view.SurfaceHolder r0 = r2.mSurfaceHolder
            if (r0 == 0) goto L12
            boolean r1 = r2.mScreenOnWhilePlaying
            if (r1 == 0) goto Le
            boolean r1 = r2.mStayAwake
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            r0.setKeepScreenOn(r1)
        L12:
            return
    }

    public native void _prepareAsync() throws java.lang.IllegalStateException;

    public void deselectTrack(int r2) {
            r1 = this;
            r0 = 0
            r1._setStreamSelected(r2, r0)
            return
    }

    protected void finalize() throws java.lang.Throwable {
            r0 = this;
            super.finalize()
            r0.native_finalize()
            return
    }

    public long getAsyncStatisticBufBackwards() {
            r3 = this;
            r0 = 20201(0x4ee9, float:2.8308E-41)
            r1 = 0
            long r0 = r3._getPropertyLong(r0, r1)
            return r0
    }

    public long getAsyncStatisticBufCapacity() {
            r3 = this;
            r0 = 20203(0x4eeb, float:2.831E-41)
            r1 = 0
            long r0 = r3._getPropertyLong(r0, r1)
            return r0
    }

    public long getAsyncStatisticBufForwards() {
            r3 = this;
            r0 = 20202(0x4eea, float:2.8309E-41)
            r1 = 0
            long r0 = r3._getPropertyLong(r0, r1)
            return r0
    }

    public long getAudioCachedBytes() {
            r3 = this;
            r0 = 20008(0x4e28, float:2.8037E-41)
            r1 = 0
            long r0 = r3._getPropertyLong(r0, r1)
            return r0
    }

    public long getAudioCachedDuration() {
            r3 = this;
            r0 = 20006(0x4e26, float:2.8034E-41)
            r1 = 0
            long r0 = r3._getPropertyLong(r0, r1)
            return r0
    }

    public long getAudioCachedPackets() {
            r3 = this;
            r0 = 20010(0x4e2a, float:2.804E-41)
            r1 = 0
            long r0 = r3._getPropertyLong(r0, r1)
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public native int getAudioSessionId();

    public long getBitRate() {
            r3 = this;
            r0 = 20100(0x4e84, float:2.8166E-41)
            r1 = 0
            long r0 = r3._getPropertyLong(r0, r1)
            return r0
    }

    public long getCacheStatisticCountBytes() {
            r3 = this;
            r0 = 20208(0x4ef0, float:2.8317E-41)
            r1 = 0
            long r0 = r3._getPropertyLong(r0, r1)
            return r0
    }

    public long getCacheStatisticFileForwards() {
            r3 = this;
            r0 = 20206(0x4eee, float:2.8315E-41)
            r1 = 0
            long r0 = r3._getPropertyLong(r0, r1)
            return r0
    }

    public long getCacheStatisticFilePos() {
            r3 = this;
            r0 = 20207(0x4eef, float:2.8316E-41)
            r1 = 0
            long r0 = r3._getPropertyLong(r0, r1)
            return r0
    }

    public long getCacheStatisticPhysicalPos() {
            r3 = this;
            r0 = 20205(0x4eed, float:2.8313E-41)
            r1 = 0
            long r0 = r3._getPropertyLong(r0, r1)
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public native long getCurrentPosition();

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public java.lang.String getDataSource() {
            r1 = this;
            java.lang.String r0 = r1.mDataSource
            return r0
    }

    public float getDropFrameRate() {
            r2 = this;
            r0 = 10007(0x2717, float:1.4023E-41)
            r1 = 0
            float r0 = r2._getPropertyFloat(r0, r1)
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public native long getDuration();

    public long getFileSize() {
            r3 = this;
            r0 = 20209(0x4ef1, float:2.8319E-41)
            r1 = 0
            long r0 = r3._getPropertyLong(r0, r1)
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public tv.danmaku.ijk.media.player.MediaInfo getMediaInfo() {
            r8 = this;
            tv.danmaku.ijk.media.player.MediaInfo r0 = new tv.danmaku.ijk.media.player.MediaInfo
            r0.<init>()
            java.lang.String r1 = "ijkplayer"
            r0.mMediaPlayerName = r1
            java.lang.String r1 = r8._getVideoCodecInfo()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = ""
            r4 = 2
            java.lang.String r5 = ","
            r6 = 1
            r7 = 0
            if (r2 != 0) goto L33
            java.lang.String[] r1 = r1.split(r5)
            int r2 = r1.length
            if (r2 < r4) goto L2a
            r2 = r1[r7]
            r0.mVideoDecoder = r2
            r1 = r1[r6]
            r0.mVideoDecoderImpl = r1
            goto L33
        L2a:
            int r2 = r1.length
            if (r2 < r6) goto L33
            r1 = r1[r7]
            r0.mVideoDecoder = r1
            r0.mVideoDecoderImpl = r3
        L33:
            java.lang.String r1 = r8._getAudioCodecInfo()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L56
            java.lang.String[] r1 = r1.split(r5)
            int r2 = r1.length
            if (r2 < r4) goto L4d
            r2 = r1[r7]
            r0.mAudioDecoder = r2
            r1 = r1[r6]
            r0.mAudioDecoderImpl = r1
            goto L56
        L4d:
            int r2 = r1.length
            if (r2 < r6) goto L56
            r1 = r1[r7]
            r0.mAudioDecoder = r1
            r0.mAudioDecoderImpl = r3
        L56:
            android.os.Bundle r1 = r8._getMediaMeta()     // Catch: java.lang.Throwable -> L60
            tv.danmaku.ijk.media.player.IjkMediaMeta r1 = tv.danmaku.ijk.media.player.IjkMediaMeta.parse(r1)     // Catch: java.lang.Throwable -> L60
            r0.mMeta = r1     // Catch: java.lang.Throwable -> L60
        L60:
            return r0
    }

    public android.os.Bundle getMediaMeta() {
            r1 = this;
            android.os.Bundle r0 = r1._getMediaMeta()
            return r0
    }

    public long getSeekLoadDuration() {
            r3 = this;
            r0 = 20300(0x4f4c, float:2.8446E-41)
            r1 = 0
            long r0 = r3._getPropertyLong(r0, r1)
            return r0
    }

    public int getSelectedTrack(int r4) {
            r3 = this;
            r0 = 1
            r1 = -1
            if (r4 == r0) goto L1c
            r0 = 2
            if (r4 == r0) goto L15
            r0 = 3
            if (r4 == r0) goto Ld
            r4 = -1
            return r4
        Ld:
            r4 = 20011(0x4e2b, float:2.8041E-41)
            long r0 = r3._getPropertyLong(r4, r1)
        L13:
            int r4 = (int) r0
            return r4
        L15:
            r4 = 20002(0x4e22, float:2.8029E-41)
            long r0 = r3._getPropertyLong(r4, r1)
            goto L13
        L1c:
            r4 = 20001(0x4e21, float:2.8027E-41)
            long r0 = r3._getPropertyLong(r4, r1)
            goto L13
    }

    public float getSpeed(float r2) {
            r1 = this;
            r2 = 10003(0x2713, float:1.4017E-41)
            r0 = 0
            float r2 = r1._getPropertyFloat(r2, r0)
            return r2
    }

    public long getTcpSpeed() {
            r3 = this;
            r0 = 20200(0x4ee8, float:2.8306E-41)
            r1 = 0
            long r0 = r3._getPropertyLong(r0, r1)
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public /* bridge */ /* synthetic */ tv.danmaku.ijk.media.player.misc.ITrackInfo[] getTrackInfo() {
            r1 = this;
            tv.danmaku.ijk.media.player.misc.IjkTrackInfo[] r0 = r1.getTrackInfo()
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public tv.danmaku.ijk.media.player.misc.IjkTrackInfo[] getTrackInfo() {
            r6 = this;
            android.os.Bundle r0 = r6.getMediaMeta()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            tv.danmaku.ijk.media.player.IjkMediaMeta r0 = tv.danmaku.ijk.media.player.IjkMediaMeta.parse(r0)
            if (r0 == 0) goto L6c
            java.util.ArrayList<tv.danmaku.ijk.media.player.IjkMediaMeta$IjkStreamMeta> r2 = r0.mStreams
            if (r2 != 0) goto L13
            goto L6c
        L13:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList<tv.danmaku.ijk.media.player.IjkMediaMeta$IjkStreamMeta> r0 = r0.mStreams
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r0.next()
            tv.danmaku.ijk.media.player.IjkMediaMeta$IjkStreamMeta r2 = (tv.danmaku.ijk.media.player.IjkMediaMeta.IjkStreamMeta) r2
            tv.danmaku.ijk.media.player.misc.IjkTrackInfo r3 = new tv.danmaku.ijk.media.player.misc.IjkTrackInfo
            r3.<init>(r2)
            java.lang.String r4 = r2.mType
            java.lang.String r5 = "video"
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L3e
            r2 = 1
            r3.setTrackType(r2)
            goto L5b
        L3e:
            java.lang.String r4 = r2.mType
            java.lang.String r5 = "audio"
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L4d
            r2 = 2
            r3.setTrackType(r2)
            goto L5b
        L4d:
            java.lang.String r2 = r2.mType
            java.lang.String r4 = "timedtext"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L5b
            r2 = 3
            r3.setTrackType(r2)
        L5b:
            r1.add(r3)
            goto L1e
        L5f:
            int r0 = r1.size()
            tv.danmaku.ijk.media.player.misc.IjkTrackInfo[] r0 = new tv.danmaku.ijk.media.player.misc.IjkTrackInfo[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            tv.danmaku.ijk.media.player.misc.IjkTrackInfo[] r0 = (tv.danmaku.ijk.media.player.misc.IjkTrackInfo[]) r0
            return r0
        L6c:
            return r1
    }

    public long getTrafficStatisticByteCount() {
            r3 = this;
            r0 = 20204(0x4eec, float:2.8312E-41)
            r1 = 0
            long r0 = r3._getPropertyLong(r0, r1)
            return r0
    }

    public long getVideoCachedBytes() {
            r3 = this;
            r0 = 20007(0x4e27, float:2.8036E-41)
            r1 = 0
            long r0 = r3._getPropertyLong(r0, r1)
            return r0
    }

    public long getVideoCachedDuration() {
            r3 = this;
            r0 = 20005(0x4e25, float:2.8033E-41)
            r1 = 0
            long r0 = r3._getPropertyLong(r0, r1)
            return r0
    }

    public long getVideoCachedPackets() {
            r3 = this;
            r0 = 20009(0x4e29, float:2.8039E-41)
            r1 = 0
            long r0 = r3._getPropertyLong(r0, r1)
            return r0
    }

    public float getVideoDecodeFramesPerSecond() {
            r2 = this;
            r0 = 10001(0x2711, float:1.4014E-41)
            r1 = 0
            float r0 = r2._getPropertyFloat(r0, r1)
            return r0
    }

    public int getVideoDecoder() {
            r3 = this;
            r0 = 20003(0x4e23, float:2.803E-41)
            r1 = 0
            long r0 = r3._getPropertyLong(r0, r1)
            int r1 = (int) r0
            return r1
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
            r1 = this;
            int r0 = r1.mVideoHeight
            return r0
    }

    public float getVideoOutputFramesPerSecond() {
            r2 = this;
            r0 = 10002(0x2712, float:1.4016E-41)
            r1 = 0
            float r0 = r2._getPropertyFloat(r0, r1)
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarDen() {
            r1 = this;
            int r0 = r1.mVideoSarDen
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarNum() {
            r1 = this;
            int r0 = r1.mVideoSarNum
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoWidth() {
            r1 = this;
            int r0 = r1.mVideoWidth
            return r0
    }

    public void httphookReconnect() {
            r3 = this;
            r0 = 20211(0x4ef3, float:2.8322E-41)
            r1 = 1
            r3._setPropertyLong(r0, r1)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isLooping() {
            r2 = this;
            int r0 = r2._getLoopCount()
            r1 = 1
            if (r0 == r1) goto L8
            return r1
        L8:
            r0 = 0
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isPlayable() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public native boolean isPlaying();

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void pause() throws java.lang.IllegalStateException {
            r1 = this;
            r0 = 0
            r1.stayAwake(r0)
            r1._pause()
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void prepareAsync() throws java.lang.IllegalStateException {
            r0 = this;
            r0._prepareAsync()
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void release() {
            r1 = this;
            r0 = 0
            r1.stayAwake(r0)
            r1.updateSurfaceScreenOn()
            r1.resetListeners()
            r1._release()
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void reset() {
            r3 = this;
            r0 = 0
            r3.stayAwake(r0)
            r3._reset()
            tv.danmaku.ijk.media.player.IjkMediaPlayer$EventHandler r1 = r3.mEventHandler
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            r3.mVideoWidth = r0
            r3.mVideoHeight = r0
            return
    }

    @Override // tv.danmaku.ijk.media.player.AbstractMediaPlayer
    public void resetListeners() {
            r1 = this;
            super.resetListeners()
            r0 = 0
            r1.mOnMediaCodecSelectListener = r0
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public native void seekTo(long r1) throws java.lang.IllegalStateException;

    public void selectTrack(int r2) {
            r1 = this;
            r0 = 1
            r1._setStreamSelected(r2, r0)
            return
    }

    public void setAndroidIOCallback(tv.danmaku.ijk.media.player.misc.IAndroidIO r1) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {
            r0 = this;
            r0._setAndroidIOCallback(r1)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setAudioStreamType(int r1) {
            r0 = this;
            return
    }

    public void setCacheShare(int r4) {
            r3 = this;
            r0 = 20210(0x4ef2, float:2.832E-41)
            long r1 = (long) r4
            r3._setPropertyLong(r0, r1)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(android.content.Context r2, android.net.Uri r3) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {
            r1 = this;
            r0 = 0
            r1.setDataSource(r2, r3, r0)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    @android.annotation.TargetApi(14)
    public void setDataSource(android.content.Context r9, android.net.Uri r10, java.util.Map<java.lang.String, java.lang.String> r11) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {
            r8 = this;
            java.lang.String r0 = r10.getScheme()
            java.lang.String r1 = "file"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L14
            java.lang.String r9 = r10.getPath()
            r8.setDataSource(r9)
            return
        L14:
            java.lang.String r1 = "content"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3b
            java.lang.String r0 = "settings"
            java.lang.String r1 = r10.getAuthority()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3b
            int r10 = android.media.RingtoneManager.getDefaultType(r10)
            android.net.Uri r10 = android.media.RingtoneManager.getActualDefaultRingtoneUri(r9, r10)
            if (r10 == 0) goto L33
            goto L3b
        L33:
            java.io.FileNotFoundException r9 = new java.io.FileNotFoundException
            java.lang.String r10 = "Failed to resolve default ringtone"
            r9.<init>(r10)
            throw r9
        L3b:
            r1 = 0
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89 java.lang.SecurityException -> L8b
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r1 = r9.openAssetFileDescriptor(r10, r0)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89 java.lang.SecurityException -> L8b
            if (r1 != 0) goto L4e
            if (r1 == 0) goto L4d
            r1.close()
        L4d:
            return
        L4e:
            long r2 = r1.getDeclaredLength()     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89 java.lang.SecurityException -> L8b
            r4 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto L6b
            java.io.FileDescriptor r9 = r1.getFileDescriptor()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L65 java.lang.SecurityException -> L68
            r8.setDataSource(r9)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L65 java.lang.SecurityException -> L68
            r2 = r8
            goto L7b
        L61:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L8d
        L65:
            r2 = r8
            goto L93
        L68:
            r2 = r8
            goto L99
        L6b:
            java.io.FileDescriptor r3 = r1.getFileDescriptor()     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89 java.lang.SecurityException -> L8b
            long r4 = r1.getStartOffset()     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89 java.lang.SecurityException -> L8b
            long r6 = r1.getDeclaredLength()     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L89 java.lang.SecurityException -> L8b
            r2 = r8
            r2.setDataSource(r3, r4, r6)     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82 java.lang.SecurityException -> L84
        L7b:
            r1.close()
            return
        L7f:
            r0 = move-exception
        L80:
            r9 = r0
            goto L8d
        L82:
            goto L93
        L84:
            goto L99
        L86:
            r0 = move-exception
            r2 = r8
            goto L80
        L89:
            r2 = r8
            goto L82
        L8b:
            r2 = r8
            goto L84
        L8d:
            if (r1 == 0) goto L92
            r1.close()
        L92:
            throw r9
        L93:
            if (r1 == 0) goto L9c
        L95:
            r1.close()
            goto L9c
        L99:
            if (r1 == 0) goto L9c
            goto L95
        L9c:
            java.lang.String r9 = r10.toString()
            r8.setDataSource(r9, r11)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    @android.annotation.TargetApi(13)
    public void setDataSource(java.io.FileDescriptor r2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
            r1 = this;
            android.os.ParcelFileDescriptor r2 = android.os.ParcelFileDescriptor.dup(r2)
            int r0 = r2.getFd()     // Catch: java.lang.Throwable -> Lf
            r1._setDataSourceFd(r0)     // Catch: java.lang.Throwable -> Lf
            r2.close()
            return
        Lf:
            r0 = move-exception
            r2.close()
            throw r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(java.lang.String r2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {
            r1 = this;
            r1.mDataSource = r2
            r0 = 0
            r1._setDataSource(r2, r0, r0)
            return
    }

    public void setDataSource(java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {
            r4 = this;
            if (r6 == 0) goto L5b
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L5b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L15:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = ":"
            r0.append(r2)
            java.lang.Object r2 = r1.getValue()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L44
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
        L44:
            java.lang.String r1 = "\r\n"
            r0.append(r1)
            java.lang.String r1 = "headers"
            java.lang.String r2 = r0.toString()
            r3 = 1
            r4.setOption(r3, r1, r2)
            java.lang.String r1 = "protocol_whitelist"
            java.lang.String r2 = "async,cache,crypto,file,http,https,ijkhttphook,ijkinject,ijklivehook,ijklongurl,ijksegment,ijktcphook,pipe,rtp,tcp,tls,udp,ijkurlhook,data"
            r4.setOption(r3, r1, r2)
            goto L15
        L5b:
            r4.setDataSource(r5)
            return
    }

    @Override // tv.danmaku.ijk.media.player.AbstractMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(tv.danmaku.ijk.media.player.misc.IMediaDataSource r1) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {
            r0 = this;
            r0._setDataSource(r1)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDisplay(android.view.SurfaceHolder r1) {
            r0 = this;
            r0.mSurfaceHolder = r1
            if (r1 == 0) goto L9
            android.view.Surface r1 = r1.getSurface()
            goto La
        L9:
            r1 = 0
        La:
            r0._setVideoSurface(r1)
            r0.updateSurfaceScreenOn()
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setKeepInBackground(boolean r1) {
            r0 = this;
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setLogEnabled(boolean r1) {
            r0 = this;
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setLooping(boolean r5) {
            r4 = this;
            r5 = r5 ^ 1
            java.lang.String r0 = "loop"
            long r1 = (long) r5
            r3 = 4
            r4.setOption(r3, r0, r1)
            r4._setLoopCount(r5)
            return
    }

    public void setOnControlMessageListener(tv.danmaku.ijk.media.player.IjkMediaPlayer.OnControlMessageListener r1) {
            r0 = this;
            r0.mOnControlMessageListener = r1
            return
    }

    public void setOnMediaCodecSelectListener(tv.danmaku.ijk.media.player.IjkMediaPlayer.OnMediaCodecSelectListener r1) {
            r0 = this;
            r0.mOnMediaCodecSelectListener = r1
            return
    }

    public void setOnNativeInvokeListener(tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener r1) {
            r0 = this;
            r0.mOnNativeInvokeListener = r1
            return
    }

    public void setOption(int r1, java.lang.String r2, long r3) {
            r0 = this;
            r0._setOption(r1, r2, r3)
            return
    }

    public void setOption(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0._setOption(r1, r2, r3)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean r3) {
            r2 = this;
            boolean r0 = r2.mScreenOnWhilePlaying
            if (r0 == r3) goto L16
            if (r3 == 0) goto L11
            android.view.SurfaceHolder r0 = r2.mSurfaceHolder
            if (r0 != 0) goto L11
            java.lang.String r0 = tv.danmaku.ijk.media.player.IjkMediaPlayer.TAG
            java.lang.String r1 = "setScreenOnWhilePlaying(true) is ineffective without a SurfaceHolder"
            tv.danmaku.ijk.media.player.pragma.DebugLog.w(r0, r1)
        L11:
            r2.mScreenOnWhilePlaying = r3
            r2.updateSurfaceScreenOn()
        L16:
            return
    }

    public void setSpeed(float r2) {
            r1 = this;
            r0 = 10003(0x2713, float:1.4017E-41)
            r1._setPropertyFloat(r0, r2)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setSurface(android.view.Surface r3) {
            r2 = this;
            boolean r0 = r2.mScreenOnWhilePlaying
            if (r0 == 0) goto Ld
            if (r3 == 0) goto Ld
            java.lang.String r0 = tv.danmaku.ijk.media.player.IjkMediaPlayer.TAG
            java.lang.String r1 = "setScreenOnWhilePlaying(true) is ineffective for Surface"
            tv.danmaku.ijk.media.player.pragma.DebugLog.w(r0, r1)
        Ld:
            r0 = 0
            r2.mSurfaceHolder = r0
            r2._setVideoSurface(r3)
            r2.updateSurfaceScreenOn()
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public native void setVolume(float r1, float r2);

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
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
            java.lang.Class<tv.danmaku.ijk.media.player.IjkMediaPlayer> r2 = tv.danmaku.ijk.media.player.IjkMediaPlayer.class
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

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void start() throws java.lang.IllegalStateException {
            r1 = this;
            r0 = 1
            r1.stayAwake(r0)
            r1._start()
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void stop() throws java.lang.IllegalStateException {
            r1 = this;
            r0 = 0
            r1.stayAwake(r0)
            r1._stop()
            return
    }
}
