package com.bykv.vk.component.ttvideo.player;

@com.bykv.vk.component.ttvideo.player.Keep
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TTPlayer {
    private static final java.lang.String TAG = "TTPlayer";
    private static java.lang.String mAppPath;
    private static java.lang.String mCachePath;
    private static java.lang.String mCrashPath;
    private static com.bykv.vk.component.ttvideo.player.ILibraryLoader mDebugLibLoader;
    private static boolean mIsIPCPlayer;
    private static boolean mSetLibraryLoader;
    private static int mSupportSampleRateNB;
    private static int[] mSupportSampleRates;
    private android.content.Context mContext;
    private com.bykv.vk.component.ttvideo.player.FrameMetadataListener mFrameMetadataListener;
    private long mHandle;
    private long mId;

    @com.bykv.vk.component.ttvideo.player.Keep
    private long mMediaDataSource;
    private com.bykv.vk.component.ttvideo.player.IPlayerNotifyer mNotifyer;
    private long mNotifyerState;
    private com.bykv.vk.component.ttvideo.player.MediaPlayer.OnScreenshotListener mScreenshotListener;
    private int mTracker;

    private static class DefaultLibraryLoader implements com.bykv.vk.component.ttvideo.player.ILibraryLoader {
        boolean mLoadLibraryPath;

        public DefaultLibraryLoader(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.mLoadLibraryPath = r1
                return
        }

        @Override // com.bykv.vk.component.ttvideo.player.ILibraryLoader
        @android.annotation.SuppressLint({"UnsafeDynamicallyLoadedCode"})
        public boolean onLoadNativeLibs(java.util.List<java.lang.String> r4) {
                r3 = this;
                java.util.Iterator r4 = r4.iterator()
            L4:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L39
                java.lang.Object r0 = r4.next()
                java.lang.String r0 = (java.lang.String) r0
                boolean r1 = r3.mLoadLibraryPath     // Catch: java.lang.Throwable -> L18
                if (r1 == 0) goto L1a
                java.lang.System.load(r0)     // Catch: java.lang.Throwable -> L18
                goto L4
            L18:
                r4 = move-exception
                goto L1e
            L1a:
                com.bytedance.sdk.openadsdk.l.m.j(r0)     // Catch: java.lang.Throwable -> L18
                goto L4
            L1e:
                java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayer.access$000()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "load lib failed = "
                r1.<init>(r2)
                java.lang.String r4 = r4.getMessage()
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                com.bytedance.sdk.component.utils.vl.r(r0, r4)
                r4 = 0
                return r4
            L39:
                r4 = 1
                return r4
        }
    }

    static {
            com.bykv.vk.component.ttvideo.player.TTPlayer$DefaultLibraryLoader r0 = new com.bykv.vk.component.ttvideo.player.TTPlayer$DefaultLibraryLoader
            r1 = 1
            r0.<init>(r1)
            com.bykv.vk.component.ttvideo.player.TTPlayer.mDebugLibLoader = r0
            java.lang.Class<com.bykv.vk.component.ttvideo.player.TTPlayer> r0 = com.bykv.vk.component.ttvideo.player.TTPlayer.class
            monitor-enter(r0)
            com.bykv.vk.component.ttvideo.player.TTPlayerLibLoader.loadLibrary()     // Catch: java.lang.Throwable -> L13
            detectAudioFormat()     // Catch: java.lang.Throwable -> L13 java.lang.UnsatisfiedLinkError -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r1 = move-exception
            goto L23
        L15:
            r1 = move-exception
            java.lang.String r2 = com.bykv.vk.component.ttvideo.player.TTPlayerLibLoader.getErrorInfo()     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L22
            java.lang.UnsatisfiedLinkError r1 = new java.lang.UnsatisfiedLinkError     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            throw r1     // Catch: java.lang.Throwable -> L13
        L22:
            throw r1     // Catch: java.lang.Throwable -> L13
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    public TTPlayer(android.content.Context r3, long r4) throws java.lang.Exception {
            r2 = this;
            r2.<init>()
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.mNotifyerState = r0
            r0 = 0
            r2.mTracker = r0
            r2.mContext = r3
            r2.create(r4)
            return
    }

    private static final native void _close(long r0);

    private final native long _create(android.content.Context r1, int r2, java.lang.String r3);

    private static final native java.lang.String _getAppPath();

    private static final native int _getCurrentPosition(long r0);

    private static final native double _getDoubleValue(long r0, int r2, double r3);

    private static final native int _getDuration(long r0);

    private static final native float _getFloatValue(long r0, int r2, float r3);

    private static final native int _getIntValue(long r0, int r2, int r3);

    private static final native java.lang.Object _getJObjectValue(long r0, int r2);

    private static final native long _getLongValue(long r0, int r2, long r3);

    private static final native java.lang.String _getStringValue(long r0, int r2);

    private static final native int _getVideoHeight(long r0);

    private static final native int _getVideoWidth(long r0);

    private static final native int _isLooping(long r0);

    private static final native int _isPlaying(long r0);

    private static final native void _mouseEvent(long r0, int r2, int r3, int r4);

    private static final native int _pause(long r0);

    private static final native int _prepare(long r0);

    private static final native void _prevClose(long r0);

    private static final native void _registerPlayerInfo();

    private static final native void _release(long r0);

    private static final native int _reset(long r0);

    private static final native void _rotateCamera(long r0, float r2, float r3);

    private static final native int _seek(long r0, int r2);

    private static final native void _setAudioProcessor(long r0, com.bykv.vk.component.ttvideo.player.AudioProcessor r2);

    private static final native void _setCacheFile(long r0, java.lang.String r2, int r3);

    private static final native void _setDataSource(long r0, com.bykv.vk.component.ttvideo.player.IMediaDataSource r2);

    private static final native void _setDataSource(long r0, java.lang.String r2);

    private static final native void _setDataSourceFd(long r0, int r2);

    private static final native int _setDoubleValue(long r0, int r2, double r3);

    private static final native int _setFloatValue(long r0, int r2, float r3);

    private static final native int _setIntValue(long r0, int r2, int r3);

    private static final native void _setLoadControl(long r0, com.bykv.vk.component.ttvideo.player.LoadControl r2);

    private static final native int _setLongValue(long r0, int r2, long r3);

    private static final native void _setLooping(long r0, int r2);

    private static final native void _setMaskInfo(long r0, com.bykv.vk.component.ttvideo.player.MaskInfo r2);

    private static final native void _setMediaTransport(long r0, com.bykv.vk.component.ttvideo.player.MediaTransport r2);

    private static final native int _setStringValue(long r0, int r2, java.lang.String r3);

    private static final native void _setSubInfo(long r0, com.bykv.vk.component.ttvideo.player.SubInfo r2);

    private static final native void _setSupportFormatNB(int r0);

    private static final native void _setSupprotSampleRates(int[] r0, int r1);

    private static final native int _setSurfaceValue(long r0, long r2);

    private static final native int _setVideoSurface(long r0, android.view.Surface r2);

    private static final native void _setVolume(long r0, float r2, float r3);

    private static final native int _start(long r0);

    private static final native void _stop(long r0);

    private static final native void _switchStream(long r0, int r2, int r3);

    private static final native void _takeScreenshot(long r0);

    static /* synthetic */ java.lang.String access$000() {
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayer.TAG
            return r0
    }

    private static final void checkPlayerModel() {
            return
    }

    private void create(long r4) throws java.lang.Exception {
            r3 = this;
            r0 = 0
            r3.mNotifyer = r0
            android.content.Context r0 = r3.mContext
            boolean r1 = com.bykv.vk.component.ttvideo.player.TTPlayer.mIsIPCPlayer
            java.lang.String r2 = com.bykv.vk.component.ttvideo.player.TTPlayer.mAppPath
            long r0 = r3._create(r0, r1, r2)
            r3.mHandle = r0
            r3.mId = r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L18
            return
        L18:
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.String r5 = "create native player is fail."
            r4.<init>(r5)
            throw r4
    }

    private static void detectAudioFormat() {
            int r0 = com.bykv.vk.component.ttvideo.player.TTPlayer.mSupportSampleRateNB
            if (r0 != 0) goto L17
            int r0 = com.bykv.vk.component.ttvideo.player.AudioFormats.getDefaultSampleRatesNB()
            int[] r0 = new int[r0]
            com.bykv.vk.component.ttvideo.player.TTPlayer.mSupportSampleRates = r0
            int r0 = com.bykv.vk.component.ttvideo.player.AudioFormats.getMaxSupportedSampleRates(r0)
            com.bykv.vk.component.ttvideo.player.TTPlayer.mSupportSampleRateNB = r0
            int[] r1 = com.bykv.vk.component.ttvideo.player.TTPlayer.mSupportSampleRates
            _setSupprotSampleRates(r1, r0)
        L17:
            return
    }

    public static final java.lang.String getAppPath() {
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayer.mAppPath
            return r0
    }

    public static final java.lang.String getCachePath() {
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayer.mCachePath
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public static final java.lang.String getCrashPath() {
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayer.mCrashPath
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public static int getThreadPoolStackSize() {
            r0 = 25
            r1 = 32
            int r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r0, r1)
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public static boolean isIPPlayer() {
            boolean r0 = com.bykv.vk.component.ttvideo.player.TTPlayer.mIsIPCPlayer
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public static int isUsedThreadPool() {
            r0 = 24
            r1 = 0
            boolean r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r0, r1)
            if (r0 == 0) goto Lb
            r0 = 1
            return r0
        Lb:
            return r1
    }

    public static void registerPlayerInfo() {
            _registerPlayerInfo()
            return
    }

    public static final void setCachePath(java.lang.String r0) {
            com.bykv.vk.component.ttvideo.player.TTPlayer.mCachePath = r0
            return
    }

    public static final void setCrashPath(java.lang.String r0) {
            com.bykv.vk.component.ttvideo.player.TTPlayer.mCrashPath = r0
            return
    }

    public static void setIsIPPlayer(boolean r0) {
            com.bykv.vk.component.ttvideo.player.TTPlayer.mIsIPCPlayer = r0
            return
    }

    public static final void setTempFileDir(java.lang.String r0) {
            com.bykv.vk.component.ttvideo.player.TTPlayer.mAppPath = r0
            return
    }

    public int close() {
            r5 = this;
            long r0 = r5.mHandle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = -1
            return r0
        La:
            _close(r0)
            r0 = 0
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void frameDTSNotify(int r7, long r8, long r10) {
            r6 = this;
            com.bykv.vk.component.ttvideo.player.FrameMetadataListener r0 = r6.mFrameMetadataListener     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Le
            r1 = r7
            r4 = r8
            r2 = r10
            r0.frameDTSNotify(r1, r2, r4)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r0 = move-exception
            r7 = r0
            goto Lf
        Le:
            return
        Lf:
            com.bytedance.sdk.component.utils.vl.j(r7)
            return
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    public double getDoubleOption(int r3, double r4) {
            r2 = this;
            long r0 = r2.mHandle
            double r3 = _getDoubleValue(r0, r3, r4)
            return r3
    }

    public float getFloatOption(int r3, float r4) {
            r2 = this;
            long r0 = r2.mHandle
            float r3 = _getFloatValue(r0, r3, r4)
            return r3
    }

    public final long getHandle() {
            r2 = this;
            long r0 = r2.mHandle
            return r0
    }

    public int getIntOption(int r3, int r4) {
            r2 = this;
            r0 = 11
            if (r3 == r0) goto L3f
            r0 = 51
            if (r3 == r0) goto L3c
            switch(r3) {
                case 1: goto L35;
                case 2: goto L2e;
                case 3: goto L27;
                case 4: goto L20;
                case 5: goto L19;
                case 6: goto L12;
                default: goto Lb;
            }
        Lb:
            long r0 = r2.mHandle
            int r3 = _getIntValue(r0, r3, r4)
            return r3
        L12:
            long r3 = r2.mHandle
            int r3 = _isPlaying(r3)
            return r3
        L19:
            long r3 = r2.mHandle
            int r3 = _isLooping(r3)
            return r3
        L20:
            long r3 = r2.mHandle
            int r3 = _getVideoHeight(r3)
            return r3
        L27:
            long r3 = r2.mHandle
            int r3 = _getVideoWidth(r3)
            return r3
        L2e:
            long r3 = r2.mHandle
            int r3 = _getCurrentPosition(r3)
            return r3
        L35:
            long r3 = r2.mHandle
            int r3 = _getDuration(r3)
            return r3
        L3c:
            int r3 = r2.mTracker
            return r3
        L3f:
            long r0 = r2.mHandle
            int r3 = _getIntValue(r0, r3, r4)
            return r3
    }

    public long getLongOption(int r3, long r4) {
            r2 = this;
            r0 = 50
            if (r3 != r0) goto L7
            long r3 = r2.mHandle
            return r3
        L7:
            long r0 = r2.mHandle
            long r3 = _getLongValue(r0, r3, r4)
            return r3
    }

    public long getNativePlayer() {
            r2 = this;
            long r0 = r2.mHandle
            return r0
    }

    public java.lang.Object getObjectValue(int r3) {
            r2 = this;
            long r0 = r2.mHandle
            java.lang.Object r3 = _getJObjectValue(r0, r3)
            return r3
    }

    public java.lang.String getStringOption(int r3) {
            r2 = this;
            long r0 = r2.mHandle
            java.lang.String r3 = _getStringValue(r0, r3)
            return r3
    }

    public void mouseEvent(int r3, int r4, int r5) {
            r2 = this;
            long r0 = r2.mHandle
            _mouseEvent(r0, r3, r4, r5)
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void onFrameAboutToBeRendered(int r8, long r9, long r11, java.util.Map<java.lang.Integer, java.lang.String> r13) {
            r7 = this;
            com.bykv.vk.component.ttvideo.player.FrameMetadataListener r0 = r7.mFrameMetadataListener     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Lf
            r1 = r8
            r2 = r9
            r4 = r11
            r6 = r13
            r0.onFrameAboutToBeRendered(r1, r2, r4, r6)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            r8 = r0
            goto L10
        Lf:
            return
        L10:
            com.bytedance.sdk.component.utils.vl.j(r8)
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public final void onLogInfo(int r7, int r8, java.lang.String r9) {
            r6 = this;
            com.bykv.vk.component.ttvideo.player.IPlayerNotifyer r0 = r6.mNotifyer
            if (r0 == 0) goto Lc
            long r1 = r6.mId     // Catch: java.lang.Throwable -> Lc
            r3 = r7
            r4 = r8
            r5 = r9
            r0.handleErrorNotify(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void onNotify(int r9, int r10, int r11, java.lang.String r12) {
            r8 = this;
            long r1 = r8.mNotifyerState
            long r1 = r1 >> r10
            r3 = 1
            long r1 = r1 & r3
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto Lb
            goto L1b
        Lb:
            com.bykv.vk.component.ttvideo.player.IPlayerNotifyer r1 = r8.mNotifyer     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1b
            long r2 = r8.mId     // Catch: java.lang.Throwable -> L19
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r1.handlePlayerNotify(r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r0 = move-exception
            goto L1c
        L1b:
            return
        L1c:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    protected int pause() {
            r5 = this;
            long r0 = r5.mHandle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = -1
            return r0
        La:
            int r0 = _pause(r0)
            return r0
    }

    protected int prepare() {
            r5 = this;
            long r0 = r5.mHandle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = -1
            return r0
        La:
            int r0 = _prepare(r0)
            return r0
    }

    public int prevClose() {
            r5 = this;
            long r0 = r5.mHandle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = -1
            return r0
        La:
            r2 = 0
            _setVideoSurface(r0, r2)
            r0 = 0
            return r0
    }

    protected void release() {
            r5 = this;
            r0 = 0
            r5.mNotifyerState = r0
            long r2 = r5.mHandle
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto Lf
            _release(r2)
            r5.mHandle = r0
        Lf:
            r0 = 0
            r5.mNotifyer = r0
            r5.mScreenshotListener = r0
            return
    }

    protected int reset() {
            r5 = this;
            long r0 = r5.mHandle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = -1
            return r0
        La:
            int r0 = _reset(r0)
            return r0
    }

    public void rotateCamera(float r3, float r4) {
            r2 = this;
            long r0 = r2.mHandle
            _rotateCamera(r0, r3, r4)
            return
    }

    public void seekTo(int r3) {
            r2 = this;
            long r0 = r2.mHandle
            _seek(r0, r3)
            return
    }

    public void setAudioProcessor(com.bykv.vk.component.ttvideo.player.AudioProcessor r6) {
            r5 = this;
            long r0 = r5.mHandle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            _setAudioProcessor(r0, r6)
        Lb:
            return
    }

    public void setCacheFile(java.lang.String r3, int r4) {
            r2 = this;
            long r0 = r2.mHandle
            _setCacheFile(r0, r3, r4)
            return
    }

    public void setDataSource(com.bykv.vk.component.ttvideo.player.IMediaDataSource r6) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {
            r5 = this;
            long r0 = r5.mHandle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            _setDataSource(r0, r6)
        Lb:
            return
    }

    public void setDataSource(java.lang.String r6) {
            r5 = this;
            long r0 = r5.mHandle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            _setDataSource(r0, r6)
        Lb:
            return
    }

    public void setDataSourceFd(int r6) {
            r5 = this;
            long r0 = r5.mHandle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            _setDataSourceFd(r0, r6)
        Lb:
            return
    }

    public int setDoubleOption(int r3, double r4) {
            r2 = this;
            long r0 = r2.mHandle
            int r3 = _setDoubleValue(r0, r3, r4)
            return r3
    }

    public int setFloatOption(int r3, float r4) {
            r2 = this;
            long r0 = r2.mHandle
            int r3 = _setFloatValue(r0, r3, r4)
            return r3
    }

    public void setFrameMetadataListener(com.bykv.vk.component.ttvideo.player.FrameMetadataListener r1) {
            r0 = this;
            r0.mFrameMetadataListener = r1
            return
    }

    public int setIntOption(int r7, int r8) throws android.os.RemoteException {
            r6 = this;
            r0 = 22
            r1 = 0
            r2 = 1
            if (r7 != r0) goto L2d
            java.lang.String r0 = "ttplayer"
            if (r8 != 0) goto L10
            java.lang.String r3 = "will occur anr crash"
            com.bytedance.sdk.component.utils.vl.j(r0, r3)
            goto L2d
        L10:
            r3 = 2
            if (r8 != r3) goto L19
            java.lang.String r3 = "will occur native crash"
            com.bytedance.sdk.component.utils.vl.j(r0, r3)
            goto L2d
        L19:
            if (r8 == r2) goto L1c
            goto L2d
        L1c:
            int r7 = android.os.Process.myPid()
            android.os.Process.killProcess(r7)
            java.lang.System.exit(r1)
            java.lang.String r7 = "will occur java crash"
            com.bytedance.sdk.component.utils.vl.j(r0, r7)
            r7 = 0
            throw r7
        L2d:
            r0 = 111(0x6f, float:1.56E-43)
            if (r7 != r0) goto L4f
            int[] r7 = com.bykv.vk.component.ttvideo.player.TTPlayerKeys.SupportSampleRates
            int r0 = r7.length
            int r7 = r7.length
            int[] r7 = new int[r7]
            r3 = 0
            r4 = 0
        L39:
            if (r3 >= r0) goto L4b
            int r5 = r2 << r3
            r5 = r5 & r8
            if (r5 != 0) goto L48
            int[] r5 = com.bykv.vk.component.ttvideo.player.TTPlayerKeys.SupportSampleRates
            r5 = r5[r3]
            r7[r4] = r5
            int r4 = r4 + 1
        L48:
            int r3 = r3 + 1
            goto L39
        L4b:
            _setSupprotSampleRates(r7, r4)
            return r1
        L4f:
            long r0 = r6.mHandle
            int r7 = _setIntValue(r0, r7, r8)
            return r7
    }

    public void setLoadControl(com.bykv.vk.component.ttvideo.player.LoadControl r6) {
            r5 = this;
            long r0 = r5.mHandle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            _setLoadControl(r0, r6)
        Lb:
            return
    }

    public int setLongOption(int r3, long r4) {
            r2 = this;
            long r0 = r2.mHandle
            int r3 = _setLongValue(r0, r3, r4)
            return r3
    }

    public void setLooping(int r3) {
            r2 = this;
            long r0 = r2.mHandle
            _setLooping(r0, r3)
            return
    }

    public void setMaskInfo(com.bykv.vk.component.ttvideo.player.MaskInfo r6) {
            r5 = this;
            long r0 = r5.mHandle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            _setMaskInfo(r0, r6)
        Lb:
            return
    }

    public void setMediaTransport(com.bykv.vk.component.ttvideo.player.MediaTransport r6) {
            r5 = this;
            long r0 = r5.mHandle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            _setMediaTransport(r0, r6)
        Lb:
            return
    }

    public void setNotifyer(com.bykv.vk.component.ttvideo.player.IPlayerNotifyer r1) {
            r0 = this;
            r0.mNotifyer = r1
            return
    }

    public void setNotifyerState(long r5) {
            r4 = this;
            r4.mNotifyerState = r5
            long r0 = r4.mHandle
            int r2 = (int) r5
            r3 = 16
            _setIntValue(r0, r3, r2)
            long r0 = r4.mHandle
            _setLongValue(r0, r3, r5)
            return
    }

    public void setOnScreenshotListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnScreenshotListener r1) {
            r0 = this;
            r0.mScreenshotListener = r1
            return
    }

    public int setStringOption(int r3, java.lang.String r4) {
            r2 = this;
            long r0 = r2.mHandle
            int r3 = _setStringValue(r0, r3, r4)
            return r3
    }

    public void setSubInfo(com.bykv.vk.component.ttvideo.player.SubInfo r6) {
            r5 = this;
            long r0 = r5.mHandle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            _setSubInfo(r0, r6)
        Lb:
            return
    }

    public int setSurfaceValue(long r3) {
            r2 = this;
            long r0 = r2.mHandle
            int r3 = _setSurfaceValue(r0, r3)
            return r3
    }

    protected int setVideoSurface(android.view.Surface r6) {
            r5 = this;
            long r0 = r5.mHandle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            int r6 = _setVideoSurface(r0, r6)
            return r6
        Ld:
            r6 = -1
            return r6
    }

    public void setVolume(float r3, float r4) {
            r2 = this;
            long r0 = r2.mHandle
            _setVolume(r0, r3, r4)
            return
    }

    protected int start() {
            r5 = this;
            long r0 = r5.mHandle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = -1
            return r0
        La:
            int r0 = _start(r0)
            return r0
    }

    protected int stop() {
            r5 = this;
            long r0 = r5.mHandle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            _stop(r0)
            r0 = 0
            return r0
        Ld:
            r0 = -1
            return r0
    }

    public void switchStream(int r3, int r4) {
            r2 = this;
            long r0 = r2.mHandle
            _switchStream(r0, r3, r4)
            return
    }

    public void takeScreenshot() {
            r2 = this;
            long r0 = r2.mHandle
            _takeScreenshot(r0)
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public final void takeScreenshotComplete(android.graphics.Bitmap r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer$OnScreenshotListener r0 = r1.mScreenshotListener
            if (r0 == 0) goto L7
            r0.onTakeScreenShotCompletion(r2)
        L7:
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void updateFrameTerminatedDTS(int r7, long r8, long r10) {
            r6 = this;
            com.bykv.vk.component.ttvideo.player.FrameMetadataListener r0 = r6.mFrameMetadataListener     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Le
            r1 = r7
            r4 = r8
            r2 = r10
            r0.updateFrameTerminatedDTS(r1, r2, r4)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r0 = move-exception
            r7 = r0
            goto Lf
        Le:
            return
        Lf:
            com.bytedance.sdk.component.utils.vl.j(r7)
            return
    }
}
