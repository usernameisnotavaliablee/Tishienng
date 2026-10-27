package cn.easyar.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class VideoPlayer implements android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnPreparedListener {
    int STATE_COMPLETED;
    int STATE_ERROR;
    int STATE_PREPARED;
    private float audioVolume;
    private android.content.Context mContext;
    private android.media.MediaPlayer mPlayer;
    private int mState;
    private cn.easyar.engine.VideoPlayer.VideoTexture mVideoTexture;
    private int nativeId;
    private boolean ready;
    private boolean readyForPause;
    private boolean readyForUpdate;
    private boolean renderTextureAvailable;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class VideoTexture implements android.graphics.SurfaceTexture.OnFrameAvailableListener {
        private android.graphics.SurfaceTexture mSurfaceTexture;
        private java.lang.Boolean mUpdateSurface;
        final /* synthetic */ cn.easyar.engine.VideoPlayer this$0;

        VideoTexture(cn.easyar.engine.VideoPlayer r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r0.mUpdateSurface = r1
                return
        }

        public android.graphics.SurfaceTexture getSurfaceTexture() {
                r1 = this;
                android.graphics.SurfaceTexture r0 = r1.mSurfaceTexture
                return r0
        }

        public void init(int r2) {
                r1 = this;
                cn.easyar.engine.VideoPlayer r0 = r1.this$0
                int r0 = cn.easyar.engine.VideoPlayer.access$000(r0)
                int r2 = cn.easyar.engine.VideoPlayer.access$100(r0, r2)
                android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
                r0.<init>(r2)
                r1.mSurfaceTexture = r0
                r0.setOnFrameAvailableListener(r1)
                return
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(android.graphics.SurfaceTexture r2) {
                r1 = this;
                java.lang.Boolean r2 = r1.mUpdateSurface
                monitor-enter(r2)
                java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L9
                r1.mUpdateSurface = r0     // Catch: java.lang.Throwable -> L9
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
                return
            L9:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
                throw r0
        }

        public void release() {
                r2 = this;
                android.graphics.SurfaceTexture r0 = r2.mSurfaceTexture
                if (r0 == 0) goto L7
                r0.release()
            L7:
                cn.easyar.engine.VideoPlayer r0 = r2.this$0
                r1 = 0
                cn.easyar.engine.VideoPlayer.access$302(r0, r1)
                return
        }

        public void updateTargetTexture() {
                r3 = this;
                java.lang.Boolean r0 = r3.mUpdateSurface
                monitor-enter(r0)
                java.lang.Boolean r1 = r3.mUpdateSurface     // Catch: java.lang.Throwable -> L2d
                boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L2d
                if (r1 == 0) goto L2f
                android.graphics.SurfaceTexture r1 = r3.mSurfaceTexture     // Catch: java.lang.Throwable -> L2d
                r1.updateTexImage()     // Catch: java.lang.Throwable -> L2d
                r1 = 16
                float[] r1 = new float[r1]     // Catch: java.lang.Throwable -> L2d
                android.graphics.SurfaceTexture r2 = r3.mSurfaceTexture     // Catch: java.lang.Throwable -> L2d
                r2.getTransformMatrix(r1)     // Catch: java.lang.Throwable -> L2d
                cn.easyar.engine.VideoPlayer r2 = r3.this$0     // Catch: java.lang.Throwable -> L2d
                int r2 = cn.easyar.engine.VideoPlayer.access$000(r2)     // Catch: java.lang.Throwable -> L2d
                cn.easyar.engine.VideoPlayer.access$200(r2, r1)     // Catch: java.lang.Throwable -> L2d
                java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2d
                r3.mUpdateSurface = r1     // Catch: java.lang.Throwable -> L2d
                cn.easyar.engine.VideoPlayer r1 = r3.this$0     // Catch: java.lang.Throwable -> L2d
                r2 = 1
                cn.easyar.engine.VideoPlayer.access$302(r1, r2)     // Catch: java.lang.Throwable -> L2d
                goto L2f
            L2d:
                r1 = move-exception
                goto L31
            L2f:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
                return
            L31:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
                throw r1
        }
    }

    public VideoPlayer(android.content.Context r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.STATE_ERROR = r0
            r0 = 0
            r2.STATE_PREPARED = r0
            r1 = 1
            r2.STATE_COMPLETED = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.audioVolume = r1
            r2.ready = r0
            r2.readyForUpdate = r0
            r2.readyForPause = r0
            r2.renderTextureAvailable = r0
            r2.nativeId = r4
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r2.mContext = r3
            android.media.MediaPlayer r3 = new android.media.MediaPlayer
            r3.<init>()
            r2.mPlayer = r3
            r3.setOnErrorListener(r2)
            android.media.MediaPlayer r3 = r2.mPlayer
            r3.setOnCompletionListener(r2)
            android.media.MediaPlayer r3 = r2.mPlayer
            r3.setOnPreparedListener(r2)
            cn.easyar.engine.VideoPlayer$VideoTexture r3 = new cn.easyar.engine.VideoPlayer$VideoTexture
            r3.<init>(r2)
            r2.mVideoTexture = r3
            return
    }

    static /* synthetic */ int access$000(cn.easyar.engine.VideoPlayer r0) {
            int r0 = r0.nativeId
            return r0
    }

    static /* synthetic */ int access$100(int r0, int r1) {
            int r0 = nativePlayerInitGL(r0, r1)
            return r0
    }

    static /* synthetic */ void access$200(int r0, float[] r1) {
            nativePlayerUpdate(r0, r1)
            return
    }

    static /* synthetic */ boolean access$302(cn.easyar.engine.VideoPlayer r0, boolean r1) {
            r0.renderTextureAvailable = r1
            return r1
    }

    private static native int nativePlayerInitGL(int r0, int r1);

    private static native void nativePlayerUpdate(int r0, float[] r1);

    private static native void onVideoStateChanged(int r0, int r1, int r2);

    private void setState(int r3) {
            r2 = this;
            int r0 = r2.mState
            r2.mState = r3
            int r1 = r2.nativeId
            onVideoStateChanged(r1, r0, r3)
            return
    }

    public int getCurrentPosition() {
            r1 = this;
            boolean r0 = r1.ready
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.media.MediaPlayer r0 = r1.mPlayer
            int r0 = r0.getCurrentPosition()
            return r0
    }

    public int getDuration() {
            r1 = this;
            boolean r0 = r1.ready
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.media.MediaPlayer r0 = r1.mPlayer
            int r0 = r0.getDuration()
            return r0
    }

    public int getVideoHeight() {
            r1 = this;
            boolean r0 = r1.ready
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.media.MediaPlayer r0 = r1.mPlayer
            int r0 = r0.getVideoHeight()
            return r0
    }

    public int getVideoWidth() {
            r1 = this;
            boolean r0 = r1.ready
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.media.MediaPlayer r0 = r1.mPlayer
            int r0 = r0.getVideoWidth()
            return r0
    }

    public float getVolume() {
            r1 = this;
            float r0 = r1.audioVolume
            return r0
    }

    public boolean isRenderTextureAvailable() {
            r1 = this;
            boolean r0 = r1.renderTextureAvailable
            return r0
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer r2) {
            r1 = this;
            android.media.MediaPlayer r2 = r1.mPlayer
            r0 = 0
            r2.seekTo(r0)
            int r2 = r1.STATE_COMPLETED
            r1.setState(r2)
            return
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer r1, int r2, int r3) {
            r0 = this;
            int r1 = r0.STATE_ERROR
            r0.setState(r1)
            r1 = 1
            return r1
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(android.media.MediaPlayer r3) {
            r2 = this;
            android.media.MediaPlayer r3 = r2.mPlayer
            android.view.Surface r0 = new android.view.Surface
            cn.easyar.engine.VideoPlayer$VideoTexture r1 = r2.mVideoTexture
            android.graphics.SurfaceTexture r1 = r1.getSurfaceTexture()
            r0.<init>(r1)
            r3.setSurface(r0)
            float r3 = r2.audioVolume
            r2.setVolume(r3)
            r3 = 1
            r2.ready = r3
            int r3 = r2.STATE_PREPARED
            r2.setState(r3)
            return
    }

    public boolean pause() {
            r2 = this;
            boolean r0 = r2.ready
            r1 = 0
            if (r0 == 0) goto L13
            boolean r0 = r2.readyForPause
            if (r0 != 0) goto La
            goto L13
        La:
            android.media.MediaPlayer r0 = r2.mPlayer
            r0.pause()
            r2.readyForUpdate = r1
            r0 = 1
            return r0
        L13:
            return r1
    }

    public void prepare(java.lang.String r7, int r8, boolean r9) {
            r6 = this;
            r0 = 0
            r6.ready = r0
            if (r9 == 0) goto L21
            android.content.Context r9 = r6.mContext     // Catch: java.io.IOException -> L31
            android.content.res.AssetManager r9 = r9.getAssets()     // Catch: java.io.IOException -> L31
            android.content.res.AssetFileDescriptor r7 = r9.openFd(r7)     // Catch: java.io.IOException -> L31
            android.media.MediaPlayer r0 = r6.mPlayer     // Catch: java.io.IOException -> L31
            java.io.FileDescriptor r1 = r7.getFileDescriptor()     // Catch: java.io.IOException -> L31
            long r2 = r7.getStartOffset()     // Catch: java.io.IOException -> L31
            long r4 = r7.getLength()     // Catch: java.io.IOException -> L31
            r0.setDataSource(r1, r2, r4)     // Catch: java.io.IOException -> L31
            goto L26
        L21:
            android.media.MediaPlayer r9 = r6.mPlayer     // Catch: java.io.IOException -> L31
            r9.setDataSource(r7)     // Catch: java.io.IOException -> L31
        L26:
            cn.easyar.engine.VideoPlayer$VideoTexture r7 = r6.mVideoTexture     // Catch: java.io.IOException -> L31
            r7.init(r8)     // Catch: java.io.IOException -> L31
            android.media.MediaPlayer r7 = r6.mPlayer     // Catch: java.io.IOException -> L31
            r7.prepareAsync()     // Catch: java.io.IOException -> L31
            return
        L31:
            int r7 = r6.STATE_ERROR
            r6.setState(r7)
            return
    }

    public void release() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mPlayer
            if (r0 == 0) goto Lc
            r0.stop()
            android.media.MediaPlayer r0 = r1.mPlayer
            r0.release()
        Lc:
            cn.easyar.engine.VideoPlayer$VideoTexture r0 = r1.mVideoTexture
            if (r0 == 0) goto L13
            r0.release()
        L13:
            return
    }

    public boolean seekTo(int r2) {
            r1 = this;
            boolean r0 = r1.ready
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            android.media.MediaPlayer r0 = r1.mPlayer
            r0.seekTo(r2)
            r2 = 1
            return r2
    }

    public boolean setVolume(float r2) {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r2, r0)
            r0 = 0
            float r2 = java.lang.Math.max(r2, r0)
            r1.audioVolume = r2
            android.media.MediaPlayer r0 = r1.mPlayer
            r0.setVolume(r2, r2)
            r2 = 1
            return r2
    }

    public boolean start() {
            r1 = this;
            boolean r0 = r1.ready
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.media.MediaPlayer r0 = r1.mPlayer
            r0.start()
            r0 = 1
            r1.readyForUpdate = r0
            r1.readyForPause = r0
            return r0
    }

    public boolean stop() {
            r2 = this;
            boolean r0 = r2.ready
            r1 = 0
            if (r0 == 0) goto L18
            boolean r0 = r2.readyForPause
            if (r0 != 0) goto La
            goto L18
        La:
            android.media.MediaPlayer r0 = r2.mPlayer
            r0.pause()
            android.media.MediaPlayer r0 = r2.mPlayer
            r0.seekTo(r1)
            r2.readyForUpdate = r1
            r0 = 1
            return r0
        L18:
            return r1
    }

    public void updateFrame() {
            r1 = this;
            boolean r0 = r1.readyForUpdate
            if (r0 != 0) goto L5
            return
        L5:
            cn.easyar.engine.VideoPlayer$VideoTexture r0 = r1.mVideoTexture
            r0.updateTargetTexture()
            return
    }
}
