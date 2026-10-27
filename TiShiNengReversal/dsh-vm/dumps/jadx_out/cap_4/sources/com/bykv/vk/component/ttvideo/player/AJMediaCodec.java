package com.bykv.vk.component.ttvideo.player;

@com.bykv.vk.component.ttvideo.player.Keep
@android.annotation.TargetApi(16)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class AJMediaCodec {
    private static final int AV_TRC_ARIB_STD_B67 = 18;
    private static final int AV_TRC_SMPTE2084 = 16;
    private static final int CODEC_ERROR = -10000;
    private static final int CODEC_EXCEPTION_ERROR = -10001;
    private static final int CODEC_ILLEGAL_ARGUMENT = -10003;
    private static final int CODEC_ILLEGAL_STATE = -10002;
    private static final double FIX_VERSION = 0.18041d;
    private static final long INPUT_TIMEOUT_US = 30000;
    private static final java.lang.String KEY_CROP_BOTTOM = "crop-bottom";
    private static final java.lang.String KEY_CROP_LEFT = "crop-left";
    private static final java.lang.String KEY_CROP_RIGHT = "crop-right";
    private static final java.lang.String KEY_CROP_TOP = "crop-top";
    private static final int NO_VALUE = -1;
    private static final int PIXEL_FORMAT_NV12 = 3;
    private static final int PIXEL_FORMAT_YUV420P = 0;
    private static final java.lang.String TAG = "aj_media_codec";
    private static final java.lang.String VENDOR_OPPO_PROPERTY = "persist.sys.aweme.hdsupport";
    private static final java.lang.String VERSION_PROPERTY = "ro.config.hw_codec_support";
    private static java.lang.Object mCodecListLock;
    private static boolean mDeviceNeedsSetOutputSurfaceWorkaround;
    private static boolean mEvaluatedDeviceNeedsSetOutputSurfaceWorkaround;
    private static boolean mIsByteVC1Blocklist;
    private static boolean mIsInitDetected;
    private static boolean mNeedByteVC1WorkAround;
    private static java.util.ArrayList<android.media.MediaCodecInfo> mVideoHWDecoderCodecs;
    private android.media.MediaCodec.BufferInfo mBufferInfo;
    private android.view.Surface mDummySurface;
    private java.lang.String mExceptionInfo;
    private java.nio.ByteBuffer[] mInputBuffers;
    private boolean mInputBuffersValid;
    private android.media.MediaCodec mMediaCodec;
    private java.nio.ByteBuffer[] mOutputBuffers;
    private android.media.MediaFormat mOutputMediaFormat;


    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bykv.vk.component.ttvideo.player.AJMediaCodec.mVideoHWDecoderCodecs = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.bykv.vk.component.ttvideo.player.AJMediaCodec.mCodecListLock = r0
            r0 = 0
            com.bykv.vk.component.ttvideo.player.AJMediaCodec.mEvaluatedDeviceNeedsSetOutputSurfaceWorkaround = r0
            com.bykv.vk.component.ttvideo.player.AJMediaCodec.mDeviceNeedsSetOutputSurfaceWorkaround = r0
            com.bykv.vk.component.ttvideo.player.AJMediaCodec.mIsInitDetected = r0
            com.bykv.vk.component.ttvideo.player.AJMediaCodec.mIsByteVC1Blocklist = r0
            com.bykv.vk.component.ttvideo.player.AJMediaCodec.mNeedByteVC1WorkAround = r0
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public AJMediaCodec() {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.mInputBuffersValid = r0
            r1 = 0
            r4.mOutputMediaFormat = r1
            boolean r1 = com.bykv.vk.component.ttvideo.player.AJMediaCodec.mIsInitDetected
            r2 = 1
            if (r1 != 0) goto L35
            java.lang.String r1 = com.bykv.vk.component.ttvideo.utils.Util.HARDWARE
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r3)
            java.lang.String r3 = "mt"
            boolean r1 = r1.startsWith(r3)
            if (r1 == 0) goto L25
            int r1 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT
            r3 = 26
            if (r1 >= r3) goto L25
            r0 = 1
        L25:
            com.bykv.vk.component.ttvideo.player.AJMediaCodec.mNeedByteVC1WorkAround = r0
            boolean r0 = r4.isHisiByteVC1BlockList()
            if (r0 != 0) goto L33
            boolean r0 = r4.isMtkByteVC1BlockList()
            if (r0 == 0) goto L35
        L33:
            com.bykv.vk.component.ttvideo.player.AJMediaCodec.mIsByteVC1Blocklist = r2
        L35:
            codecNeedsSetOutputSurfaceWorkaround()
            com.bykv.vk.component.ttvideo.player.AJMediaCodec.mIsInitDetected = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "initialize, need workaround "
            r0.<init>(r1)
            boolean r1 = com.bykv.vk.component.ttvideo.player.AJMediaCodec.mDeviceNeedsSetOutputSurfaceWorkaround
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "aj_media_codec"
            com.bytedance.sdk.component.utils.vl.j(r1, r0)
            return
    }

    static /* synthetic */ void access$000(com.bykv.vk.component.ttvideo.player.AJMediaCodec r0, android.media.MediaCodec r1) {
            r0.releaseCodec(r1)
            return
    }

    public static int ceilDivide(int r0, int r1) {
            int r0 = r0 + r1
            int r0 = r0 + (-1)
            int r0 = r0 / r1
            return r0
    }

    private static boolean codecNeedsFlushWorkaround(java.lang.String r2) {
            int r0 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT
            r1 = 18
            if (r0 < r1) goto L39
            if (r0 != r1) goto L18
            java.lang.String r1 = "OMX.SEC.avc.dec"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L39
            java.lang.String r1 = "OMX.SEC.avc.dec.secure"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L39
        L18:
            r1 = 19
            if (r0 != r1) goto L37
            java.lang.String r0 = com.bykv.vk.component.ttvideo.utils.Util.MODEL
            java.lang.String r1 = "SM-G800"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L37
            java.lang.String r0 = "OMX.Exynos.avc.dec"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L39
            java.lang.String r0 = "OMX.Exynos.avc.dec.secure"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L37
            goto L39
        L37:
            r2 = 0
            return r2
        L39:
            r2 = 1
            return r2
    }

    private static boolean codecNeedsSetOutputSurfaceWorkaround() {
            java.lang.Class<com.bykv.vk.component.ttvideo.player.AJMediaCodec> r0 = com.bykv.vk.component.ttvideo.player.AJMediaCodec.class
            monitor-enter(r0)
            boolean r1 = com.bykv.vk.component.ttvideo.player.AJMediaCodec.mEvaluatedDeviceNeedsSetOutputSurfaceWorkaround     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L75
            int r1 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT     // Catch: java.lang.Throwable -> L19
            r2 = 27
            r3 = 1
            if (r1 > r2) goto L1b
            java.lang.String r4 = "dangal"
            java.lang.String r5 = com.bykv.vk.component.ttvideo.utils.Util.DEVICE     // Catch: java.lang.Throwable -> L19
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L71
            goto L1b
        L19:
            r1 = move-exception
            goto L79
        L1b:
            if (r1 >= r2) goto L73
            java.lang.String r1 = com.bykv.vk.component.ttvideo.utils.Util.DEVICE     // Catch: java.lang.Throwable -> L19
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> L19
            r4 = 99329(0x18401, float:1.3919E-40)
            if (r2 == r4) goto L45
            r4 = 3351335(0x332327, float:4.69622E-39)
            if (r2 == r4) goto L3c
            r4 = 1865889110(0x6f373556, float:5.6700236E28)
            if (r2 == r4) goto L33
            goto L4f
        L33:
            java.lang.String r2 = "santoni"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L4f
            goto L4d
        L3c:
            java.lang.String r2 = "mido"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L4f
            goto L4d
        L45:
            java.lang.String r2 = "deb"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L4f
        L4d:
            com.bykv.vk.component.ttvideo.player.AJMediaCodec.mDeviceNeedsSetOutputSurfaceWorkaround = r3     // Catch: java.lang.Throwable -> L19
        L4f:
            java.lang.String r1 = com.bykv.vk.component.ttvideo.utils.Util.MODEL     // Catch: java.lang.Throwable -> L19
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> L19
            r4 = 2006354(0x1e9d52, float:2.811501E-39)
            if (r2 == r4) goto L69
            r4 = 2006367(0x1e9d5f, float:2.811519E-39)
            if (r2 == r4) goto L60
            goto L73
        L60:
            java.lang.String r2 = "AFTN"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L73
            goto L71
        L69:
            java.lang.String r2 = "AFTA"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L73
        L71:
            com.bykv.vk.component.ttvideo.player.AJMediaCodec.mDeviceNeedsSetOutputSurfaceWorkaround = r3     // Catch: java.lang.Throwable -> L19
        L73:
            com.bykv.vk.component.ttvideo.player.AJMediaCodec.mEvaluatedDeviceNeedsSetOutputSurfaceWorkaround = r3     // Catch: java.lang.Throwable -> L19
        L75:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            boolean r0 = com.bykv.vk.component.ttvideo.player.AJMediaCodec.mDeviceNeedsSetOutputSurfaceWorkaround
            return r0
        L79:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    private void createDummySurface() {
            r1 = this;
            r0 = 0
            com.bykv.vk.component.ttvideo.player.DummySurface r0 = com.bykv.vk.component.ttvideo.player.DummySurface.newInstanceV17(r0)
            r1.mDummySurface = r0
            return
    }

    private static int getMaxInputSize(java.lang.String r3, int r4, int r5) {
            r0 = -1
            if (r4 == r0) goto L61
            if (r5 != r0) goto L6
            goto L61
        L6:
            java.lang.String r1 = "video/3gpp"
            boolean r1 = r3.equals(r1)
            r2 = 2
            if (r1 != 0) goto L43
            java.lang.String r1 = "video/mp4v-es"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L18
            goto L43
        L18:
            java.lang.String r1 = "video/avc"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L3b
            java.lang.String r3 = "BRAVIA 4K 2015"
            java.lang.String r1 = com.bykv.vk.component.ttvideo.utils.Util.MODEL
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L2b
            return r0
        L2b:
            r3 = 16
            int r4 = ceilDivide(r4, r3)
            int r3 = ceilDivide(r5, r3)
            int r4 = r4 * r3
            int r4 = r4 * 256
        L39:
            r3 = 2
            goto L5b
        L3b:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L46
        L43:
            int r4 = r4 * r5
            goto L39
        L46:
            java.lang.String r1 = "video/hevc"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L58
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L57
            goto L58
        L57:
            return r0
        L58:
            int r4 = r4 * r5
            r3 = 4
        L5b:
            int r4 = r4 * 3
            int r3 = r3 * 2
            int r4 = r4 / r3
            return r4
        L61:
            return r0
    }

    public static java.lang.String getProperty(java.lang.String r7, java.lang.String r8) {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L28
            java.lang.String r1 = "get"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L28
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L28
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L28
            java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L28
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L28
            r2[r5] = r7     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L28
            r2[r6] = r8     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L28
            java.lang.Object r7 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L28
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L28
            return r7
        L24:
            r7 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r7)     // Catch: java.lang.Throwable -> L28
        L28:
            return r8
    }

    private boolean isHisiByteVC1BlockList() {
            r5 = this;
            java.lang.String r0 = "ro.board.platform"
            r1 = 0
            java.lang.String r0 = getProperty(r0, r1)
            int r1 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT
            r2 = 26
            if (r1 != r2) goto L40
            if (r0 == 0) goto L40
            java.lang.String r1 = "kirin960"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L1f
            java.lang.String r1 = "hi3660"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L40
        L1f:
            java.lang.String r0 = "ro.config.hw_codec_support"
            java.lang.String r1 = "0.0"
            java.lang.String r0 = getProperty(r0, r1)
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> L2c
            goto L35
        L2c:
            java.lang.String r0 = "aj_media_codec"
            java.lang.String r1 = "vendor property abnormal"
            com.bytedance.sdk.component.utils.vl.xt(r0, r1)
            r0 = 0
        L35:
            r2 = 4595667975560726713(0x3fc717acc4ef88b9, double:0.18041)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L40
            r0 = 1
            return r0
        L40:
            r0 = 0
            return r0
    }

    private boolean isMtkByteVC1BlockList() {
            r2 = this;
            java.lang.String r0 = com.bykv.vk.component.ttvideo.utils.Util.HARDWARE
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "mt6763"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L2b
            java.lang.String r1 = "mt6757"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L2b
            java.lang.String r1 = "mt6739"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L2b
            java.lang.String r1 = "mt6750"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L29
            goto L2b
        L29:
            r0 = 0
            return r0
        L2b:
            r0 = 1
            return r0
    }

    private static void maybeSetCsdBuffers(android.media.MediaFormat r1, java.nio.ByteBuffer r2, int r3) {
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "csd-"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r0.concat(r3)
            r1.setByteBuffer(r3, r2)
            return
    }

    private static void maybeSetInteger(android.media.MediaFormat r1, java.lang.String r2, int r3) {
            r0 = -1
            if (r3 == r0) goto L6
            r1.setInteger(r2, r3)
        L6:
            return
    }

    private void releaseCodec(android.media.MediaCodec r5) {
            r4 = this;
            java.lang.String r0 = "codec release end"
            java.lang.String r1 = "aj_media_codec"
            if (r5 != 0) goto L7
            return
        L7:
            r2 = 0
            r5.release()     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L28
            android.view.Surface r5 = r4.mDummySurface
            if (r5 == 0) goto L14
            r5.release()
            r4.mDummySurface = r2
        L14:
            com.bytedance.sdk.component.utils.vl.j(r1, r0)
            return
        L18:
            r5 = move-exception
            android.view.Surface r3 = r4.mDummySurface
            if (r3 == 0) goto L24
            android.view.Surface r3 = r4.mDummySurface
            r3.release()
            r4.mDummySurface = r2
        L24:
            com.bytedance.sdk.component.utils.vl.j(r1, r0)
            throw r5
        L28:
            android.view.Surface r5 = r4.mDummySurface
            if (r5 == 0) goto L33
            android.view.Surface r5 = r4.mDummySurface
            r5.release()
            r4.mDummySurface = r2
        L33:
            com.bytedance.sdk.component.utils.vl.j(r1, r0)
            return
    }

    @android.annotation.TargetApi(21)
    private int renderOutputBufferV21(int r2, long r3) {
            r1 = this;
            android.media.MediaCodec r0 = r1.mMediaCodec     // Catch: java.lang.Exception -> L7
            r0.releaseOutputBuffer(r2, r3)     // Catch: java.lang.Exception -> L7
            r2 = 0
            return r2
        L7:
            r2 = -10000(0xffffffffffffd8f0, float:NaN)
            return r2
    }

    @android.annotation.TargetApi(23)
    private int setOutputSurfaceV23(android.media.MediaCodec r1, android.view.Surface r2) {
            r0 = this;
            com.bykv.vk.component.ttvideo.player.b.a(r1, r2)     // Catch: java.lang.Exception -> L5
            r1 = 0
            return r1
        L5:
            r1 = move-exception
            r0.handleCodecException(r1)
            java.lang.String r2 = "setoutputsurface failed = "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "aj_media_codec"
            com.bytedance.sdk.component.utils.vl.xt(r2, r1)
            r1 = -1
            return r1
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    private boolean supportSetSurface() {
            r1 = this;
            boolean r0 = com.bykv.vk.component.ttvideo.player.AJMediaCodec.mDeviceNeedsSetOutputSurfaceWorkaround
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean MTKByteVC1NeedWorkAround() {
            r1 = this;
            boolean r0 = com.bykv.vk.component.ttvideo.player.AJMediaCodec.mNeedByteVC1WorkAround
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void close() {
            r3 = this;
            java.lang.String r0 = "close start"
            java.lang.String r1 = "aj_media_codec"
            com.bytedance.sdk.component.utils.vl.j(r1, r0)
            android.media.MediaCodec r0 = r3.mMediaCodec
            if (r0 == 0) goto L28
            r3.stop()
            android.media.MediaCodec r0 = r3.mMediaCodec
            r2 = 0
            r3.mInputBuffers = r2
            r3.mOutputBuffers = r2
            r3.mMediaCodec = r2
            com.bykv.vk.component.ttvideo.player.AJMediaCodec$1 r2 = new com.bykv.vk.component.ttvideo.player.AJMediaCodec$1     // Catch: java.lang.Throwable -> L20
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L20
            com.bykv.vk.component.ttvideo.player.AVThreadPool.addTask(r2)     // Catch: java.lang.Throwable -> L20
            goto L28
        L20:
            java.lang.String r2 = "new thread failed"
            com.bytedance.sdk.component.utils.vl.xt(r1, r2)
            r3.releaseCodec(r0)
        L28:
            java.lang.String r0 = "close end"
            com.bytedance.sdk.component.utils.vl.j(r1, r0)
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int configure(int r10, int r11, int r12, int r13, int r14, java.lang.String r15, java.nio.ByteBuffer r16, java.nio.ByteBuffer r17, java.nio.ByteBuffer r18, android.view.Surface r19, boolean r20, boolean r21, int r22, int r23, boolean r24, int r25, boolean r26, boolean r27, int r28, int r29) {
            r9 = this;
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r23
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "configure ="
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r6 = ", surfaceConfigure ="
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "aj_media_codec"
            com.bytedance.sdk.component.utils.vl.j(r6, r5)
            android.media.MediaFormat r5 = new android.media.MediaFormat
            r5.<init>()
            java.lang.String r7 = "mime"
            r5.setString(r7, r15)
            java.lang.String r7 = "width"
            maybeSetInteger(r5, r7, r10)
            java.lang.String r7 = "height"
            maybeSetInteger(r5, r7, r11)
            r7 = -1
            if (r3 == r7) goto L4e
            if (r4 == r7) goto L4e
            if (r3 <= r10) goto L3f
            goto L40
        L3f:
            r3 = r10
        L40:
            java.lang.String r8 = "max-width"
            maybeSetInteger(r5, r8, r3)
            if (r4 <= r11) goto L48
            goto L49
        L48:
            r4 = r11
        L49:
            java.lang.String r3 = "max-height"
            maybeSetInteger(r5, r3, r4)
        L4e:
            java.lang.String r3 = "sample-rate"
            maybeSetInteger(r5, r3, r13)
            java.lang.String r13 = "channel-count"
            maybeSetInteger(r5, r13, r14)
            java.lang.String r13 = "format  = "
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r13 = r13.concat(r3)
            com.bytedance.sdk.component.utils.vl.j(r6, r13)
            int r10 = getMaxInputSize(r15, r10, r11)
            java.lang.String r11 = "max input = "
            java.lang.String r13 = java.lang.String.valueOf(r10)
            java.lang.String r11 = r11.concat(r13)
            com.bytedance.sdk.component.utils.vl.j(r6, r11)
            java.lang.String r11 = "max-input-size"
            maybeSetInteger(r5, r11, r10)
            r10 = 0
            r11 = r16
            maybeSetCsdBuffers(r5, r11, r10)
            r11 = 1
            r13 = r17
            maybeSetCsdBuffers(r5, r13, r11)
            r11 = 2
            r13 = r18
            maybeSetCsdBuffers(r5, r13, r11)
            r11 = -10003(0xffffffffffffd8ed, float:NaN)
            r13 = 23
            if (r2 == 0) goto Lc3
            int r0 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT
            r2 = 21
            if (r0 < r2) goto L9e
            java.lang.String r2 = "rotation-degrees"
            maybeSetInteger(r5, r2, r12)
        L9e:
            if (r1 == 0) goto La6
            boolean r12 = r1.isValid()
            if (r12 != 0) goto Lbb
        La6:
            android.view.Surface r12 = r9.mDummySurface
            if (r12 != 0) goto Lbb
            if (r0 < r13) goto Lbb
            boolean r12 = com.bykv.vk.component.ttvideo.player.AJMediaCodec.mDeviceNeedsSetOutputSurfaceWorkaround
            if (r12 != 0) goto Lbb
            java.lang.String r12 = "create dummy surface"
            com.bytedance.sdk.component.utils.vl.j(r6, r12)
            r9.createDummySurface()
            android.view.Surface r12 = r9.mDummySurface
            goto Lbc
        Lbb:
            r12 = r1
        Lbc:
            if (r12 != 0) goto Lc4
            java.lang.String r10 = "Error: configure with null surface"
            r9.mExceptionInfo = r10
            return r11
        Lc3:
            r12 = r1
        Lc4:
            int r0 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT
            if (r0 < r13) goto Lcf
            if (r21 == 0) goto Lcf
            java.lang.String r13 = "priority"
            r5.setInteger(r13, r10)
        Lcf:
            if (r24 == 0) goto Ld6
            r13 = r25
            com.bykv.vk.component.ttvideo.player.VendorQTI.setupVpp(r5, r13)
        Ld6:
            if (r26 == 0) goto Ldb
            com.bykv.vk.component.ttvideo.player.VendorQTI.debugEffect(r5)
        Ldb:
            if (r27 == 0) goto Le0
            com.bykv.vk.component.ttvideo.player.VendorQTI.enableLowLatency(r5)
        Le0:
            if (r29 <= 0) goto L101
            if (r28 < 0) goto L101
            java.lang.String r13 = com.bykv.vk.component.ttvideo.player.MediaCodecUtil.getDolbyCodecs(r28, r29)
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r13.split(r0)
            android.util.Pair r13 = com.bykv.vk.component.ttvideo.player.MediaCodecUtil.getDolbyVisionProfileAndLevel(r13, r0)
            if (r13 == 0) goto L101
            java.lang.Object r13 = r13.first
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            java.lang.String r0 = "profile"
            maybeSetInteger(r5, r0, r13)
        L101:
            android.media.MediaCodec r13 = r9.mMediaCodec     // Catch: java.lang.Exception -> L108
            r0 = 0
            r13.configure(r5, r12, r0, r10)     // Catch: java.lang.Exception -> L108
            return r10
        L108:
            r0 = move-exception
            r10 = r0
            r9.handleCodecException(r10)
            boolean r10 = r10 instanceof java.lang.IllegalArgumentException
            if (r10 == 0) goto L112
            return r11
        L112:
            return r7
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int createByCodecName(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "createByCodecName = "
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "aj_media_codec"
            com.bytedance.sdk.component.utils.vl.j(r1, r0)
            android.media.MediaCodec r3 = android.media.MediaCodec.createByCodecName(r3)     // Catch: java.lang.Exception -> L17
            r2.mMediaCodec = r3     // Catch: java.lang.Exception -> L17
            r3 = 0
            return r3
        L17:
            r3 = move-exception
            r2.handleCodecException(r3)
            r3 = -1
            return r3
    }

    @android.annotation.TargetApi(23)
    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void decodeFRC(int r4) {
            r3 = this;
            android.media.MediaCodec r0 = r3.mMediaCodec
            if (r0 == 0) goto L3b
            boolean r0 = r3.mInputBuffersValid
            if (r0 == 0) goto L3b
            int r0 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT
            r1 = 23
            if (r0 < r1) goto L3b
            java.lang.String r0 = "frc level = "
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "aj_media_codec"
            com.bytedance.sdk.component.utils.vl.j(r1, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = "vivo.video-dec.dynamic-frc"
            r0.putInt(r2, r4)
            android.media.MediaCodec r4 = r3.mMediaCodec     // Catch: java.lang.Exception -> L2d
            r4.setParameters(r0)     // Catch: java.lang.Exception -> L2d
            return
        L2d:
            r4 = move-exception
            java.lang.String r0 = "setParameters failed ret = "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r0.concat(r4)
            com.bytedance.sdk.component.utils.vl.xt(r1, r4)
        L3b:
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int dequeueInputBuffer(long r2) {
            r1 = this;
            android.media.MediaCodec r0 = r1.mMediaCodec     // Catch: java.lang.Exception -> L7
            int r2 = r0.dequeueInputBuffer(r2)     // Catch: java.lang.Exception -> L7
            return r2
        L7:
            r2 = move-exception
            int r2 = r1.handleCodecException(r2)
            return r2
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void flush() {
            r2 = this;
            java.lang.String r0 = "flush"
            java.lang.String r1 = "aj_media_codec"
            com.bytedance.sdk.component.utils.vl.j(r1, r0)
            android.media.MediaCodec r0 = r2.mMediaCodec     // Catch: java.lang.Exception -> Lc
            r0.flush()     // Catch: java.lang.Exception -> Lc
        Lc:
            java.lang.String r0 = "flush done"
            com.bytedance.sdk.component.utils.vl.j(r1, r0)
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public java.lang.String getBestCodecName(java.lang.String r18) {
            r17 = this;
            r0 = r18
            int r1 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT
            r2 = 16
            r3 = 0
            if (r1 >= r2) goto La
            return r3
        La:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L11
            return r3
        L11:
            java.lang.String r1 = "video/hevc"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            boolean r1 = com.bykv.vk.component.ttvideo.player.AJMediaCodec.mIsByteVC1Blocklist
            if (r1 == 0) goto L33
            java.lang.String r0 = "aj_media_codec"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "the device is hw decoder blocklist,"
            r1.<init>(r2)
            java.lang.String r2 = com.bykv.vk.component.ttvideo.utils.Util.HARDWARE
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.sdk.component.utils.vl.xt(r0, r1)
            return r3
        L33:
            java.lang.String r1 = "aj_media_codec"
            java.lang.String r2 = "detect hardware codec by codecType = "
            java.lang.String r2 = r2.concat(r0)
            com.bytedance.sdk.component.utils.vl.j(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Object r2 = com.bykv.vk.component.ttvideo.player.AJMediaCodec.mCodecListLock
            monitor-enter(r2)
            java.util.ArrayList<android.media.MediaCodecInfo> r4 = com.bykv.vk.component.ttvideo.player.AJMediaCodec.mVideoHWDecoderCodecs     // Catch: java.lang.Throwable -> L55
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L55
            if (r4 != 0) goto L5c
            java.util.ArrayList<android.media.MediaCodecInfo> r5 = com.bykv.vk.component.ttvideo.player.AJMediaCodec.mVideoHWDecoderCodecs     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            goto L60
        L55:
            r0 = move-exception
            goto L1a5
        L58:
            r16 = r3
            goto L19c
        L5c:
            int r5 = android.media.MediaCodecList.getCodecCount()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
        L60:
            r6 = 0
            r7 = 0
        L62:
            if (r7 >= r5) goto L6d
            if (r4 != 0) goto L71
            boolean r8 = r1.isEmpty()     // Catch: java.lang.Throwable -> L55
            if (r8 == 0) goto L6d
            goto L71
        L6d:
            r16 = r3
            goto L16e
        L71:
            if (r4 != 0) goto L7c
            java.util.ArrayList<android.media.MediaCodecInfo> r8 = com.bykv.vk.component.ttvideo.player.AJMediaCodec.mVideoHWDecoderCodecs     // Catch: java.lang.Throwable -> L55
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> L55
            android.media.MediaCodecInfo r8 = (android.media.MediaCodecInfo) r8     // Catch: java.lang.Throwable -> L55
            goto L80
        L7c:
            android.media.MediaCodecInfo r8 = android.media.MediaCodecList.getCodecInfoAt(r7)     // Catch: java.lang.Throwable -> L55
        L80:
            java.lang.String r9 = r8.getName()     // Catch: java.lang.Throwable -> L55
            boolean r10 = r8.isEncoder()     // Catch: java.lang.Throwable -> L55
            if (r10 != 0) goto L166
            java.lang.String r10 = "OMX.google"
            boolean r10 = r9.startsWith(r10)     // Catch: java.lang.Throwable -> L55
            if (r10 != 0) goto L166
            java.lang.String r10 = "c2.android"
            boolean r10 = r9.startsWith(r10)     // Catch: java.lang.Throwable -> L55
            if (r10 != 0) goto L166
            java.lang.String[] r10 = r8.getSupportedTypes()     // Catch: java.lang.Throwable -> L55
            if (r10 == 0) goto L166
            int r11 = r10.length     // Catch: java.lang.Throwable -> L55
            r12 = 0
        La2:
            if (r12 >= r11) goto L166
            r13 = r10[r12]     // Catch: java.lang.Throwable -> L55
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L55
            if (r14 != 0) goto Ld2
            if (r4 == 0) goto Lbb
            java.lang.String r14 = "video/"
            boolean r14 = r13.startsWith(r14)     // Catch: java.lang.Throwable -> L55
            if (r14 == 0) goto Lbb
            java.util.ArrayList<android.media.MediaCodecInfo> r14 = com.bykv.vk.component.ttvideo.player.AJMediaCodec.mVideoHWDecoderCodecs     // Catch: java.lang.Throwable -> L55
            r14.add(r8)     // Catch: java.lang.Throwable -> L55
        Lbb:
            boolean r13 = r13.equalsIgnoreCase(r0)     // Catch: java.lang.Throwable -> L55
            if (r13 == 0) goto Ld2
            java.lang.String r13 = "OMX."
            boolean r13 = r9.startsWith(r13)     // Catch: java.lang.Throwable -> L55
            if (r13 != 0) goto Ld6
            java.lang.String r13 = "c2."
            boolean r13 = r9.startsWith(r13)     // Catch: java.lang.Throwable -> L55
            if (r13 == 0) goto Ld2
            goto Ld6
        Ld2:
            r16 = r3
            goto L160
        Ld6:
            java.lang.String r13 = "OMX.pv"
            boolean r13 = r9.startsWith(r13)     // Catch: java.lang.Throwable -> L55
            if (r13 != 0) goto Ld2
            java.lang.String r13 = "OMX.ittiam"
            boolean r13 = r9.startsWith(r13)     // Catch: java.lang.Throwable -> L55
            if (r13 != 0) goto Ld2
            java.lang.String r13 = "ffmpeg"
            boolean r13 = r9.contains(r13)     // Catch: java.lang.Throwable -> L55
            if (r13 != 0) goto Ld2
            java.lang.String r13 = "avcodec"
            boolean r13 = r9.contains(r13)     // Catch: java.lang.Throwable -> L55
            if (r13 != 0) goto Ld2
            java.lang.String r13 = "secure"
            boolean r13 = r9.contains(r13)     // Catch: java.lang.Throwable -> L55
            if (r13 != 0) goto Ld2
            java.lang.String r13 = "OMX.MTK."
            boolean r13 = r9.startsWith(r13)     // Catch: java.lang.Throwable -> L55
            if (r13 == 0) goto L10c
            int r13 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT     // Catch: java.lang.Throwable -> L55
            r14 = 18
            if (r13 < r14) goto Ld2
        L10c:
            boolean r13 = codecNeedsFlushWorkaround(r9)     // Catch: java.lang.Throwable -> L55
            if (r13 != 0) goto Ld2
            com.bykv.vk.component.ttvideo.player.AJMediaCodecRank r13 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.setupRank(r8, r0)     // Catch: java.lang.Throwable -> L55
            if (r13 == 0) goto Ld2
            java.lang.String r14 = "aj_media_codec"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r16 = r3
            java.lang.String r3 = "codec : "
            r15.<init>(r3)     // Catch: java.lang.Throwable -> L55
            android.media.MediaCodecInfo r3 = r13.mMediaCodecInfo     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L55
            r15.append(r3)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = ",  rank : "
            r15.append(r3)     // Catch: java.lang.Throwable -> L55
            int r3 = r13.mRank     // Catch: java.lang.Throwable -> L55
            r15.append(r3)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = r15.toString()     // Catch: java.lang.Throwable -> L55
            com.bytedance.sdk.component.utils.vl.j(r14, r3)     // Catch: java.lang.Throwable -> L55
            int r3 = r13.mRank     // Catch: java.lang.Throwable -> L55
            r14 = 40
            if (r3 != r14) goto L151
            int r14 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT     // Catch: java.lang.Throwable -> L55
            r15 = 21
            if (r14 >= r15) goto L151
            java.lang.String r3 = "aj_media_codec"
            java.lang.String r13 = "skip vendor mediacodec api impl ambiguous"
            com.bytedance.sdk.component.utils.vl.xt(r3, r13)     // Catch: java.lang.Throwable -> L55
            goto L160
        L151:
            r14 = 20
            if (r3 != r14) goto L15d
            java.lang.String r3 = "aj_media_codec"
            java.lang.String r13 = "skip vendor software codec"
            com.bytedance.sdk.component.utils.vl.xt(r3, r13)     // Catch: java.lang.Throwable -> L55
            goto L160
        L15d:
            r1.add(r13)     // Catch: java.lang.Throwable -> L55
        L160:
            int r12 = r12 + 1
            r3 = r16
            goto La2
        L166:
            r16 = r3
            int r7 = r7 + 1
            r3 = r16
            goto L62
        L16e:
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L176
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            return r16
        L176:
            java.lang.Object r0 = r1.get(r6)     // Catch: java.lang.Throwable -> L55
            com.bykv.vk.component.ttvideo.player.AJMediaCodecRank r0 = (com.bykv.vk.component.ttvideo.player.AJMediaCodecRank) r0     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L55
        L180:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L194
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L55
            com.bykv.vk.component.ttvideo.player.AJMediaCodecRank r3 = (com.bykv.vk.component.ttvideo.player.AJMediaCodecRank) r3     // Catch: java.lang.Throwable -> L55
            int r4 = r3.mRank     // Catch: java.lang.Throwable -> L55
            int r5 = r0.mRank     // Catch: java.lang.Throwable -> L55
            if (r4 <= r5) goto L180
            r0 = r3
            goto L180
        L194:
            android.media.MediaCodecInfo r0 = r0.mMediaCodecInfo     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L55
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            return r0
        L19c:
            java.lang.String r0 = "aj_media_codec"
            java.lang.String r1 = "mediaserver died"
            com.bytedance.sdk.component.utils.vl.xt(r0, r1)     // Catch: java.lang.Throwable -> L55
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            return r16
        L1a5:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int getChannelCount() {
            r3 = this;
            android.media.MediaFormat r0 = r3.mOutputMediaFormat
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.String r2 = "channel-count"
            int r0 = r0.getInteger(r2)     // Catch: java.lang.Exception -> Lc
            return r0
        Lc:
            return r1
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int getColorFormat() {
            r3 = this;
            android.media.MediaFormat r0 = r3.mOutputMediaFormat
            r1 = 0
            if (r0 == 0) goto L1c
            java.lang.String r2 = "color-format"
            int r0 = r0.getInteger(r2)     // Catch: java.lang.Exception -> L1c
            r2 = 21
            if (r0 == r2) goto L1a
            r2 = 2130706688(0x7f000100, float:1.7014638E38)
            if (r0 == r2) goto L1a
            r2 = 2141391872(0x7fa30c00, float:NaN)
            if (r0 == r2) goto L1a
            return r1
        L1a:
            r0 = 3
            return r0
        L1c:
            return r1
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int getColorTransfer() {
            r3 = this;
            android.media.MediaFormat r0 = r3.mOutputMediaFormat
            r1 = 0
            if (r0 == 0) goto L18
            java.lang.String r2 = "color-transfer"
            int r0 = r0.getInteger(r2)     // Catch: java.lang.Exception -> L18
            r2 = 6
            if (r0 == r2) goto L15
            r2 = 7
            if (r0 == r2) goto L12
            return r1
        L12:
            r0 = 18
            return r0
        L15:
            r0 = 16
            return r0
        L18:
            return r1
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public java.lang.String getErrorInfo() {
            r1 = this;
            java.lang.String r0 = r1.mExceptionInfo
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int getFormatHeight() {
            r5 = this;
            java.lang.String r0 = "crop-top"
            java.lang.String r1 = "crop-bottom"
            android.media.MediaFormat r2 = r5.mOutputMediaFormat
            r3 = 0
            if (r2 == 0) goto L44
            java.lang.String r4 = "crop-right"
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Exception -> L44
            if (r2 == 0) goto L3b
            android.media.MediaFormat r2 = r5.mOutputMediaFormat     // Catch: java.lang.Exception -> L44
            java.lang.String r4 = "crop-left"
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Exception -> L44
            if (r2 == 0) goto L3b
            android.media.MediaFormat r2 = r5.mOutputMediaFormat     // Catch: java.lang.Exception -> L44
            boolean r2 = r2.containsKey(r1)     // Catch: java.lang.Exception -> L44
            if (r2 == 0) goto L3b
            android.media.MediaFormat r2 = r5.mOutputMediaFormat     // Catch: java.lang.Exception -> L44
            boolean r2 = r2.containsKey(r0)     // Catch: java.lang.Exception -> L44
            if (r2 == 0) goto L3b
            android.media.MediaFormat r2 = r5.mOutputMediaFormat     // Catch: java.lang.Exception -> L44
            int r1 = r2.getInteger(r1)     // Catch: java.lang.Exception -> L44
            android.media.MediaFormat r2 = r5.mOutputMediaFormat     // Catch: java.lang.Exception -> L44
            int r0 = r2.getInteger(r0)     // Catch: java.lang.Exception -> L44
            int r1 = r1 - r0
            int r1 = r1 + 1
            return r1
        L3b:
            android.media.MediaFormat r0 = r5.mOutputMediaFormat     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = "height"
            int r0 = r0.getInteger(r1)     // Catch: java.lang.Exception -> L44
            return r0
        L44:
            return r3
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int getFormatWidth() {
            r5 = this;
            java.lang.String r0 = "crop-left"
            java.lang.String r1 = "crop-right"
            android.media.MediaFormat r2 = r5.mOutputMediaFormat
            r3 = 0
            if (r2 == 0) goto L44
            boolean r2 = r2.containsKey(r1)     // Catch: java.lang.Exception -> L44
            if (r2 == 0) goto L3b
            android.media.MediaFormat r2 = r5.mOutputMediaFormat     // Catch: java.lang.Exception -> L44
            boolean r2 = r2.containsKey(r0)     // Catch: java.lang.Exception -> L44
            if (r2 == 0) goto L3b
            android.media.MediaFormat r2 = r5.mOutputMediaFormat     // Catch: java.lang.Exception -> L44
            java.lang.String r4 = "crop-bottom"
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Exception -> L44
            if (r2 == 0) goto L3b
            android.media.MediaFormat r2 = r5.mOutputMediaFormat     // Catch: java.lang.Exception -> L44
            java.lang.String r4 = "crop-top"
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Exception -> L44
            if (r2 == 0) goto L3b
            android.media.MediaFormat r2 = r5.mOutputMediaFormat     // Catch: java.lang.Exception -> L44
            int r1 = r2.getInteger(r1)     // Catch: java.lang.Exception -> L44
            android.media.MediaFormat r2 = r5.mOutputMediaFormat     // Catch: java.lang.Exception -> L44
            int r0 = r2.getInteger(r0)     // Catch: java.lang.Exception -> L44
            int r1 = r1 - r0
            int r1 = r1 + 1
            return r1
        L3b:
            android.media.MediaFormat r0 = r5.mOutputMediaFormat     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = "width"
            int r0 = r0.getInteger(r1)     // Catch: java.lang.Exception -> L44
            return r0
        L44:
            return r3
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public java.nio.ByteBuffer[] getInputBuffers() {
            r1 = this;
            boolean r0 = r1.mInputBuffersValid
            if (r0 == 0) goto L7
            java.nio.ByteBuffer[] r0 = r1.mInputBuffers
            return r0
        L7:
            r0 = 0
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int getOSVerion() {
            r1 = this;
            int r0 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int getSampleRate() {
            r3 = this;
            android.media.MediaFormat r0 = r3.mOutputMediaFormat
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.String r2 = "sample-rate"
            int r0 = r0.getInteger(r2)     // Catch: java.lang.Exception -> Lc
            return r0
        Lc:
            return r1
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int getSliceHeight() {
            r3 = this;
            android.media.MediaFormat r0 = r3.mOutputMediaFormat
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.String r2 = "slice-height"
            int r0 = r0.getInteger(r2)     // Catch: java.lang.Exception -> Lc
            return r0
        Lc:
            return r1
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int getStride() {
            r3 = this;
            android.media.MediaFormat r0 = r3.mOutputMediaFormat
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.String r2 = "stride"
            int r0 = r0.getInteger(r2)     // Catch: java.lang.Exception -> Lc
            return r0
        Lc:
            return r1
    }

    public int handleCodecException(java.lang.Exception r3) {
            r2 = this;
            java.lang.String r0 = r3.toString()
            r2.mExceptionInfo = r0
            int r0 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT
            r1 = 21
            if (r0 < r1) goto L11
            int r3 = r2.handleCodecExceptionV21(r3)
            return r3
        L11:
            boolean r3 = r3 instanceof java.lang.IllegalStateException
            if (r3 == 0) goto L18
            r3 = -10002(0xffffffffffffd8ee, float:NaN)
            return r3
        L18:
            r3 = -10000(0xffffffffffffd8f0, float:NaN)
            return r3
    }

    @android.annotation.TargetApi(21)
    public int handleCodecExceptionV21(java.lang.Exception r5) {
            r4 = this;
            boolean r0 = r5 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L36
            r0 = r5
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0
            int r1 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT
            r2 = 23
            r3 = -10001(0xffffffffffffd8ef, float:NaN)
            if (r1 < r2) goto L2c
            r0.isRecoverable()
            com.bykv.vk.component.ttvideo.player.a.a(r0)
            boolean r1 = r0.isRecoverable()
            if (r1 != 0) goto L36
            int r1 = com.bykv.vk.component.ttvideo.player.a.a(r0)
            r2 = 1100(0x44c, float:1.541E-42)
            if (r1 == r2) goto L36
            int r0 = com.bykv.vk.component.ttvideo.player.a.a(r0)
            r1 = 1101(0x44d, float:1.543E-42)
            if (r0 == r1) goto L36
            return r3
        L2c:
            r0.isRecoverable()
            boolean r0 = r0.isRecoverable()
            if (r0 != 0) goto L36
            return r3
        L36:
            boolean r5 = r5 instanceof java.lang.IllegalStateException
            if (r5 == 0) goto L3d
            r5 = -10002(0xffffffffffffd8ee, float:NaN)
            return r5
        L3d:
            r5 = -10000(0xffffffffffffd8f0, float:NaN)
            return r5
    }

    public int open(int r4, int r5, int r6, java.lang.String r7, java.lang.String r8, java.nio.ByteBuffer r9, android.view.Surface r10) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "open, rotation = "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = "; codecName = "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = "; codecType ="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "aj_media_codec"
            com.bytedance.sdk.component.utils.vl.j(r1, r0)
            r0 = -1
            android.media.MediaCodec r7 = android.media.MediaCodec.createByCodecName(r7)     // Catch: java.lang.Exception -> L8a
            r3.mMediaCodec = r7     // Catch: java.lang.Exception -> L8a
            java.lang.String r7 = "configure mediacodec"
            com.bytedance.sdk.component.utils.vl.j(r1, r7)
            android.media.MediaFormat r7 = new android.media.MediaFormat
            r7.<init>()
            java.lang.String r2 = "mime"
            r7.setString(r2, r8)
            java.lang.String r8 = "width"
            maybeSetInteger(r7, r8, r4)
            java.lang.String r8 = "height"
            maybeSetInteger(r7, r8, r5)
            if (r9 == 0) goto L4a
            java.lang.String r8 = "csd-0"
            r7.setByteBuffer(r8, r9)
        L4a:
            if (r10 == 0) goto L57
            int r8 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT
            r9 = 21
            if (r8 < r9) goto L57
            java.lang.String r8 = "rotation-degrees"
            maybeSetInteger(r7, r8, r6)
        L57:
            android.media.MediaCodec r6 = r3.mMediaCodec     // Catch: java.lang.Exception -> L8a
            r8 = 0
            r9 = 0
            r6.configure(r7, r10, r8, r9)     // Catch: java.lang.Exception -> L8a
            java.lang.String r6 = "mediacodec start"
            com.bytedance.sdk.component.utils.vl.j(r1, r6)
            android.media.MediaCodec r6 = r3.mMediaCodec     // Catch: java.lang.Exception -> L8a
            r6.start()     // Catch: java.lang.Exception -> L8a
            android.media.MediaCodec r6 = r3.mMediaCodec
            java.nio.ByteBuffer[] r6 = r6.getInputBuffers()
            r3.mInputBuffers = r6
            r6 = 1
            r3.mInputBuffersValid = r6
            java.util.Locale r7 = java.util.Locale.US
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r9] = r4
            r8[r6] = r5
            java.lang.String r4 = "open() input params. width:%d,height:%d"
            java.lang.String.format(r7, r4, r8)
            return r9
        L8a:
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int queueInputBuffer(int r8, int r9, int r10, long r11, int r13) {
            r7 = this;
            android.media.MediaCodec r0 = r7.mMediaCodec     // Catch: java.lang.Exception -> Lc
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r0.queueInputBuffer(r1, r2, r3, r4, r6)     // Catch: java.lang.Exception -> Lc
            r8 = 0
            return r8
        Lc:
            r0 = move-exception
            r8 = r0
            int r8 = r7.handleCodecException(r8)
            return r8
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int read(com.bykv.vk.component.ttvideo.player.AJMediaCodecFrame r5, long r6) {
            r4 = this;
            java.lang.String r0 = "aj_media_codec"
        L2:
            android.media.MediaCodec r1 = r4.mMediaCodec     // Catch: java.lang.Exception -> L9b
            android.media.MediaCodec$BufferInfo r2 = r4.mBufferInfo     // Catch: java.lang.Exception -> L9b
            int r1 = r1.dequeueOutputBuffer(r2, r6)     // Catch: java.lang.Exception -> L9b
            if (r1 < 0) goto L24
            java.nio.ByteBuffer[] r6 = r4.mOutputBuffers
            r6 = r6[r1]
            r5.data = r6
            android.media.MediaCodec$BufferInfo r6 = r4.mBufferInfo
            long r2 = r6.presentationTimeUs
            r5.pts = r2
            r5.index = r1
            int r7 = r6.size
            r5.size = r7
            int r6 = r6.flags
            r5.flags = r6
            r5 = 0
            return r5
        L24:
            r2 = -3
            java.lang.String r3 = "getOutputBuffers e = "
            if (r1 != r2) goto L48
            java.lang.String r1 = "INFO_OUTPUT_BUFFERS_CHANGED"
            com.bytedance.sdk.component.utils.vl.j(r0, r1)
            android.media.MediaCodec r1 = r4.mMediaCodec     // Catch: java.lang.Exception -> L37
            java.nio.ByteBuffer[] r1 = r1.getOutputBuffers()     // Catch: java.lang.Exception -> L37
            r4.mOutputBuffers = r1     // Catch: java.lang.Exception -> L37
            goto L2
        L37:
            r5 = move-exception
            java.lang.String r6 = java.lang.String.valueOf(r5)
            java.lang.String r6 = r3.concat(r6)
            com.bytedance.sdk.component.utils.vl.j(r0, r6)
            int r5 = r4.handleCodecException(r5)
            return r5
        L48:
            r5 = -2
            if (r1 != r5) goto L8a
            java.lang.String r5 = "INFO_OUTPUT_FORMAT_CHANGED"
            com.bytedance.sdk.component.utils.vl.j(r0, r5)
            android.media.MediaCodec r5 = r4.mMediaCodec     // Catch: java.lang.Exception -> L77
            android.media.MediaFormat r5 = r5.getOutputFormat()     // Catch: java.lang.Exception -> L77
            r4.mOutputMediaFormat = r5     // Catch: java.lang.Exception -> L77
            java.nio.ByteBuffer[] r5 = r4.mOutputBuffers
            if (r5 != 0) goto L76
            android.media.MediaCodec r5 = r4.mMediaCodec     // Catch: java.lang.Exception -> L65
            java.nio.ByteBuffer[] r5 = r5.getOutputBuffers()     // Catch: java.lang.Exception -> L65
            r4.mOutputBuffers = r5     // Catch: java.lang.Exception -> L65
            return r1
        L65:
            r5 = move-exception
            java.lang.String r6 = java.lang.String.valueOf(r5)
            java.lang.String r6 = r3.concat(r6)
            com.bytedance.sdk.component.utils.vl.j(r0, r6)
            int r5 = r4.handleCodecException(r5)
            return r5
        L76:
            return r1
        L77:
            r5 = move-exception
            java.lang.String r6 = "getOutputFormat e ="
            java.lang.String r7 = java.lang.String.valueOf(r5)
            java.lang.String r6 = r6.concat(r7)
            com.bytedance.sdk.component.utils.vl.j(r0, r6)
            int r5 = r4.handleCodecException(r5)
            return r5
        L8a:
            r5 = -1
            if (r1 == r5) goto L9a
            java.lang.String r6 = "error, idx = "
            java.lang.String r7 = java.lang.String.valueOf(r1)
            java.lang.String r6 = r6.concat(r7)
            com.bytedance.sdk.component.utils.vl.r(r0, r6)
        L9a:
            return r5
        L9b:
            r5 = move-exception
            java.lang.String r6 = "dequeueOutputBuffer e :"
            java.lang.String r7 = java.lang.String.valueOf(r5)
            java.lang.String r6 = r6.concat(r7)
            com.bytedance.sdk.component.utils.vl.j(r0, r6)
            int r5 = r4.handleCodecException(r5)
            return r5
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int releaseBuffer(int r3, boolean r4, long r5) {
            r2 = this;
            int r0 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT
            r1 = 21
            if (r0 < r1) goto Ld
            if (r4 == 0) goto Ld
            int r3 = r2.renderOutputBufferV21(r3, r5)
            return r3
        Ld:
            android.media.MediaCodec r5 = r2.mMediaCodec     // Catch: java.lang.Exception -> L14
            r5.releaseOutputBuffer(r3, r4)     // Catch: java.lang.Exception -> L14
            r3 = 0
            return r3
        L14:
            r3 = move-exception
            int r3 = r2.handleCodecException(r3)
            return r3
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int setOutputSurface(android.view.Surface r3) {
            r2 = this;
            boolean r0 = com.bykv.vk.component.ttvideo.player.AJMediaCodec.mDeviceNeedsSetOutputSurfaceWorkaround
            if (r0 != 0) goto L21
            boolean r0 = r2.mInputBuffersValid
            if (r0 == 0) goto L21
            if (r3 != 0) goto L1a
            android.view.Surface r3 = r2.mDummySurface
            if (r3 != 0) goto L11
            r2.createDummySurface()
        L11:
            android.view.Surface r3 = r2.mDummySurface
            java.lang.String r0 = "aj_media_codec"
            java.lang.String r1 = "use dummy surface"
            com.bytedance.sdk.component.utils.vl.j(r0, r1)
        L1a:
            android.media.MediaCodec r0 = r2.mMediaCodec
            int r3 = r2.setOutputSurfaceV23(r0, r3)
            return r3
        L21:
            r3 = -1
            return r3
    }

    @android.annotation.TargetApi(23)
    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void speedEnhance(float r4) {
            r3 = this;
            android.media.MediaCodec r0 = r3.mMediaCodec
            if (r0 == 0) goto L41
            boolean r0 = r3.mInputBuffersValid
            if (r0 == 0) goto L41
            int r0 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT
            r1 = 23
            if (r0 < r1) goto L41
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L41
            java.lang.String r0 = "rate "
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "aj_media_codec"
            com.bytedance.sdk.component.utils.vl.j(r1, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = "operating-rate"
            r0.putFloat(r2, r4)
            android.media.MediaCodec r4 = r3.mMediaCodec     // Catch: java.lang.Exception -> L33
            r4.setParameters(r0)     // Catch: java.lang.Exception -> L33
            return
        L33:
            r4 = move-exception
            java.lang.String r0 = "setParameters failed ret = "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r0.concat(r4)
            com.bytedance.sdk.component.utils.vl.xt(r1, r4)
        L41:
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int start() {
            r3 = this;
            java.lang.String r0 = "start"
            java.lang.String r1 = "aj_media_codec"
            com.bytedance.sdk.component.utils.vl.j(r1, r0)
            android.media.MediaCodec r0 = r3.mMediaCodec     // Catch: java.lang.Exception -> L23
            r0.start()     // Catch: java.lang.Exception -> L23
            android.media.MediaCodec r0 = r3.mMediaCodec     // Catch: java.lang.Exception -> L23
            java.nio.ByteBuffer[] r0 = r0.getInputBuffers()     // Catch: java.lang.Exception -> L23
            r3.mInputBuffers = r0     // Catch: java.lang.Exception -> L23
            int r0 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT     // Catch: java.lang.Exception -> L23
            r2 = 21
            if (r0 < r2) goto L25
            android.media.MediaCodec r0 = r3.mMediaCodec     // Catch: java.lang.Exception -> L23
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()     // Catch: java.lang.Exception -> L23
            r3.mOutputBuffers = r0     // Catch: java.lang.Exception -> L23
            goto L25
        L23:
            r0 = move-exception
            goto L36
        L25:
            r0 = 1
            r3.mInputBuffersValid = r0     // Catch: java.lang.Exception -> L23
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo     // Catch: java.lang.Exception -> L23
            r0.<init>()     // Catch: java.lang.Exception -> L23
            r3.mBufferInfo = r0     // Catch: java.lang.Exception -> L23
            java.lang.String r0 = "start end"
            com.bytedance.sdk.component.utils.vl.j(r1, r0)
            r0 = 0
            return r0
        L36:
            r3.handleCodecException(r0)
            r0 = -1
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int stop() {
            r3 = this;
            boolean r0 = r3.mInputBuffersValid
            r1 = 0
            if (r0 == 0) goto L16
            java.lang.String r0 = "aj_media_codec"
            java.lang.String r2 = "stop"
            com.bytedance.sdk.component.utils.vl.j(r0, r2)
            r3.mInputBuffersValid = r1     // Catch: java.lang.Exception -> L14
            android.media.MediaCodec r0 = r3.mMediaCodec     // Catch: java.lang.Exception -> L14
            r0.stop()     // Catch: java.lang.Exception -> L14
            goto L16
        L14:
            r0 = -1
            return r0
        L16:
            return r1
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int vendorOppoHWEnable() {
            r3 = this;
            java.lang.String r0 = com.bykv.vk.component.ttvideo.utils.Util.BARND
            java.lang.String r1 = "OPPO"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2b
            java.lang.String r0 = "persist.sys.aweme.hdsupport"
            java.lang.String r1 = "1"
            java.lang.String r0 = getProperty(r0, r1)
            java.lang.String r1 = "oppo property = "
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r1 = r1.concat(r2)
            java.lang.String r2 = "aj_media_codec"
            com.bytedance.sdk.component.utils.vl.j(r2, r1)
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L26
            return r0
        L26:
            java.lang.String r0 = "vendor oppo property abnormal"
            com.bytedance.sdk.component.utils.vl.xt(r2, r0)
        L2b:
            r0 = 1
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int write(com.bykv.vk.component.ttvideo.player.AJMediaCodecFrame r12) {
            r11 = this;
            r1 = -1
            if (r12 == 0) goto L3f
            java.nio.ByteBuffer r0 = r12.data
            if (r0 != 0) goto L8
            goto L3f
        L8:
            android.media.MediaCodec r0 = r11.mMediaCodec     // Catch: java.lang.Exception -> L28
            r2 = 30000(0x7530, double:1.4822E-319)
            int r5 = r0.dequeueInputBuffer(r2)     // Catch: java.lang.Exception -> L28
            if (r5 < 0) goto L2b
            java.nio.ByteBuffer[] r0 = r11.mInputBuffers     // Catch: java.lang.Exception -> L28
            r0 = r0[r5]     // Catch: java.lang.Exception -> L28
            java.nio.ByteBuffer r2 = r12.data     // Catch: java.lang.Exception -> L28
            r0.put(r2)     // Catch: java.lang.Exception -> L28
            android.media.MediaCodec r4 = r11.mMediaCodec     // Catch: java.lang.Exception -> L28
            int r7 = r12.size     // Catch: java.lang.Exception -> L28
            long r8 = r12.pts     // Catch: java.lang.Exception -> L28
            r10 = 0
            r6 = 0
            r4.queueInputBuffer(r5, r6, r7, r8, r10)     // Catch: java.lang.Exception -> L28
            r12 = 0
            return r12
        L28:
            r0 = move-exception
            r12 = r0
            goto L30
        L2b:
            if (r5 != r1) goto L2f
            r12 = 4
            return r12
        L2f:
            return r1
        L30:
            java.lang.String r0 = "write meet exception ="
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r12 = r0.concat(r12)
            java.lang.String r0 = "aj_media_codec"
            com.bytedance.sdk.component.utils.vl.r(r0, r12)
        L3f:
            return r1
    }
}
