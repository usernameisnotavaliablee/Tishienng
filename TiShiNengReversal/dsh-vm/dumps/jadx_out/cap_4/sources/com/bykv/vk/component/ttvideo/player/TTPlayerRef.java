package com.bykv.vk.component.ttvideo.player;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TTPlayerRef extends com.bykv.vk.component.ttvideo.player.ITTPlayerRef implements com.bykv.vk.component.ttvideo.player.IPlayerNotifyer {
    private static final java.lang.String TAG = "TTPlayerRef";
    private static java.lang.String mAppPath;
    private static java.lang.String mLoadErr;
    private com.bykv.vk.component.ttvideo.player.TTPlayerClient mClient;
    private android.content.Context mContext;
    private long mId;
    private com.bykv.vk.component.ttvideo.player.TTPlayer mPlayer;

    static {
            return
    }

    public TTPlayerRef(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            r2.mId = r0
            r2.mContext = r3
            return
    }

    public static final synchronized com.bykv.vk.component.ttvideo.player.TTPlayerRef create(com.bykv.vk.component.ttvideo.player.TTPlayerClient r4, android.content.Context r5) {
            java.lang.Class<com.bykv.vk.component.ttvideo.player.TTPlayerRef> r0 = com.bykv.vk.component.ttvideo.player.TTPlayerRef.class
            monitor-enter(r0)
            java.lang.String r1 = com.bykv.vk.component.ttvideo.player.TTPlayerRef.mAppPath     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L22
            java.lang.String r1 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getAppFileCachePath(r5)     // Catch: java.lang.Throwable -> L19
            com.bykv.vk.component.ttvideo.player.TTPlayerRef.mAppPath = r1     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = com.bykv.vk.component.ttvideo.player.TTPlayer.getAppPath()     // Catch: java.lang.Throwable -> L19 java.lang.UnsatisfiedLinkError -> L1b
            if (r1 != 0) goto L22
            java.lang.String r1 = com.bykv.vk.component.ttvideo.player.TTPlayerRef.mAppPath     // Catch: java.lang.Throwable -> L19 java.lang.UnsatisfiedLinkError -> L1b
            com.bykv.vk.component.ttvideo.player.TTPlayer.setTempFileDir(r1)     // Catch: java.lang.Throwable -> L19 java.lang.UnsatisfiedLinkError -> L1b
            goto L22
        L19:
            r4 = move-exception
            goto L6c
        L1b:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L19
            com.bykv.vk.component.ttvideo.player.TTPlayerRef.mLoadErr = r1     // Catch: java.lang.Throwable -> L19
        L22:
            java.lang.String r1 = com.bykv.vk.component.ttvideo.player.TTPlayerRef.mLoadErr     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L64
            com.bykv.vk.component.ttvideo.player.TTPlayerRef r1 = new com.bykv.vk.component.ttvideo.player.TTPlayerRef     // Catch: java.lang.Throwable -> L19
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L19
            r1.mClient = r4     // Catch: java.lang.Throwable -> L19
            com.bykv.vk.component.ttvideo.player.TTPlayer r4 = new com.bykv.vk.component.ttvideo.player.TTPlayer     // Catch: java.lang.Throwable -> L3b
            long r2 = r1.mId     // Catch: java.lang.Throwable -> L3b
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> L3b
            r1.mPlayer = r4     // Catch: java.lang.Throwable -> L3b
            r4.setNotifyer(r1)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r0)
            return r1
        L3b:
            r4 = move-exception
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L19
            r5.<init>()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.getErrorInfo()     // Catch: java.lang.Throwable -> L46
            goto L4b
        L46:
            r1 = move-exception
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L19
        L4b:
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L19
            r5.append(r4)     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = ",player:"
            r5.append(r4)     // Catch: java.lang.Throwable -> L19
            r5.append(r1)     // Catch: java.lang.Throwable -> L19
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L19
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L19
            throw r4     // Catch: java.lang.Throwable -> L19
        L64:
            java.lang.UnsatisfiedLinkError r4 = new java.lang.UnsatisfiedLinkError     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = com.bykv.vk.component.ttvideo.player.TTPlayerRef.mLoadErr     // Catch: java.lang.Throwable -> L19
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L19
            throw r4     // Catch: java.lang.Throwable -> L19
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r4
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public void close() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.close()
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    protected double getDoubleOption(int r2, double r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            double r2 = r0.getDoubleOption(r2, r3)
            return r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    protected float getFloatOption(int r2, float r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            float r2 = r0.getFloatOption(r2, r3)
            return r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public int getIntOption(int r2, int r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            int r2 = r0.getIntOption(r2, r3)
            return r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    protected int getLifeId() {
            r3 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r3.mPlayer
            r1 = 35
            r2 = -1
            int r0 = r0.getIntOption(r1, r2)
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public long getLongOption(int r2, long r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            long r2 = r0.getLongOption(r2, r3)
            return r2
    }

    public long getNativeObject() {
            r2 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r2.mPlayer
            long r0 = r0.getNativePlayer()
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    protected java.lang.Object getObjectOption(int r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            java.lang.Object r2 = r0.getObjectValue(r2)
            return r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public java.lang.String getStringOption(int r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            java.lang.String r2 = r0.getStringOption(r2)
            return r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public int getType() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.IPlayerNotifyer
    public void handleErrorNotify(long r1, int r3, int r4, java.lang.String r5) {
            r0 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayerClient r1 = r0.mClient
            r1.onPlayLogInfo(r3, r4, r5)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.IPlayerNotifyer
    public void handlePlayerNotify(long r1, int r3, int r4, int r5, java.lang.String r6) {
            r0 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayerClient r1 = r0.mClient
            r1.onPlayerNotify(r3, r4, r5, r6)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    protected boolean isValid() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 1
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public void mouseEvent(int r2, int r3, int r4) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.mouseEvent(r2, r3, r4)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public void pause() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.pause()
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public void prepare() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.prepare()
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public void prevClose() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.prevClose()
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public void release() {
            r2 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r2.mPlayer
            r1 = 0
            r2.mPlayer = r1
            r0.release()
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public void reset() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.reset()
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public void rotateCamera(float r2, float r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.rotateCamera(r2, r3)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public void seekTo(int r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.seekTo(r2)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    protected void setAudioProcessor(com.bykv.vk.component.ttvideo.player.AudioProcessor r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.setAudioProcessor(r2)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public void setCacheFile(java.lang.String r2, int r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.setCacheFile(r2, r3)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    protected void setDataSource(com.bykv.vk.component.ttvideo.player.IMediaDataSource r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.setDataSource(r2)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public void setDataSource(java.lang.String r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.setDataSource(r2)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    protected void setDataSourceFd(int r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.setDataSourceFd(r2)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    protected int setDoubleOption(int r2, double r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            int r2 = r0.setDoubleOption(r2, r3)
            return r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    protected int setFloatOption(int r2, float r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            int r2 = r0.setFloatOption(r2, r3)
            return r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    protected void setFrameMetadataListener(com.bykv.vk.component.ttvideo.player.FrameMetadataListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.setFrameMetadataListener(r2)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public int setIntOption(int r2, int r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer     // Catch: android.os.RemoteException -> L7
            int r2 = r0.setIntOption(r2, r3)     // Catch: android.os.RemoteException -> L7
            return r2
        L7:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            r2 = -1
            return r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    protected void setLoadControl(com.bykv.vk.component.ttvideo.player.LoadControl r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.setLoadControl(r2)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public int setLongOption(int r2, long r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            int r2 = r0.setLongOption(r2, r3)
            return r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public void setLooping(int r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.setLooping(r2)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    protected void setMaskInfo(com.bykv.vk.component.ttvideo.player.MaskInfo r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.setMaskInfo(r2)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    protected void setMediaTransport(com.bykv.vk.component.ttvideo.player.MediaTransport r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.setMediaTransport(r2)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public void setNotifyState(long r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.setNotifyerState(r2)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    protected void setOnScreenshotListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnScreenshotListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.setOnScreenshotListener(r2)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public int setStringOption(int r2, java.lang.String r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            int r2 = r0.setStringOption(r2, r3)
            return r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    protected void setSubInfo(com.bykv.vk.component.ttvideo.player.SubInfo r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.setSubInfo(r2)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public void setSurface(android.view.Surface r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.setVideoSurface(r2)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public void setVolume(float r2, float r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.setVolume(r2, r3)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public void start() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.start()
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public void stop() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.stop()
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public void switchStream(int r2, int r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.switchStream(r2, r3)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.ITTPlayerRef
    public void takeScreenshot() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r1.mPlayer
            r0.takeScreenshot()
            return
    }
}
