package tv.danmaku.ijk.media.player;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AndroidMediaPlayer extends tv.danmaku.ijk.media.player.AbstractMediaPlayer {
    private static tv.danmaku.ijk.media.player.MediaInfo sMediaInfo;
    private java.lang.String mDataSource;
    private final java.lang.Object mInitLock;
    private final tv.danmaku.ijk.media.player.AndroidMediaPlayer.AndroidMediaPlayerListenerHolder mInternalListenerAdapter;
    private final android.media.MediaPlayer mInternalMediaPlayer;
    private boolean mIsReleased;
    private android.media.MediaDataSource mMediaDataSource;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class AndroidMediaPlayerListenerHolder implements android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnSeekCompleteListener, android.media.MediaPlayer.OnVideoSizeChangedListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnTimedTextListener {
        public final java.lang.ref.WeakReference<tv.danmaku.ijk.media.player.AndroidMediaPlayer> mWeakMediaPlayer;
        final /* synthetic */ tv.danmaku.ijk.media.player.AndroidMediaPlayer this$0;

        public AndroidMediaPlayerListenerHolder(tv.danmaku.ijk.media.player.AndroidMediaPlayer r1, tv.danmaku.ijk.media.player.AndroidMediaPlayer r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r2)
                r0.mWeakMediaPlayer = r1
                return
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(android.media.MediaPlayer r1, int r2) {
                r0 = this;
                java.lang.ref.WeakReference<tv.danmaku.ijk.media.player.AndroidMediaPlayer> r1 = r0.mWeakMediaPlayer
                java.lang.Object r1 = r1.get()
                tv.danmaku.ijk.media.player.AndroidMediaPlayer r1 = (tv.danmaku.ijk.media.player.AndroidMediaPlayer) r1
                if (r1 != 0) goto Lb
                return
            Lb:
                tv.danmaku.ijk.media.player.AndroidMediaPlayer r1 = r0.this$0
                r1.notifyOnBufferingUpdate(r2)
                return
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(android.media.MediaPlayer r1) {
                r0 = this;
                java.lang.ref.WeakReference<tv.danmaku.ijk.media.player.AndroidMediaPlayer> r1 = r0.mWeakMediaPlayer
                java.lang.Object r1 = r1.get()
                tv.danmaku.ijk.media.player.AndroidMediaPlayer r1 = (tv.danmaku.ijk.media.player.AndroidMediaPlayer) r1
                if (r1 != 0) goto Lb
                return
            Lb:
                tv.danmaku.ijk.media.player.AndroidMediaPlayer r1 = r0.this$0
                r1.notifyOnCompletion()
                return
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(android.media.MediaPlayer r1, int r2, int r3) {
                r0 = this;
                java.lang.ref.WeakReference<tv.danmaku.ijk.media.player.AndroidMediaPlayer> r1 = r0.mWeakMediaPlayer
                java.lang.Object r1 = r1.get()
                tv.danmaku.ijk.media.player.AndroidMediaPlayer r1 = (tv.danmaku.ijk.media.player.AndroidMediaPlayer) r1
                if (r1 == 0) goto L14
                tv.danmaku.ijk.media.player.AndroidMediaPlayer r1 = r0.this$0
                boolean r1 = r1.notifyOnError(r2, r3)
                if (r1 == 0) goto L14
                r1 = 1
                return r1
            L14:
                r1 = 0
                return r1
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(android.media.MediaPlayer r1, int r2, int r3) {
                r0 = this;
                java.lang.ref.WeakReference<tv.danmaku.ijk.media.player.AndroidMediaPlayer> r1 = r0.mWeakMediaPlayer
                java.lang.Object r1 = r1.get()
                tv.danmaku.ijk.media.player.AndroidMediaPlayer r1 = (tv.danmaku.ijk.media.player.AndroidMediaPlayer) r1
                if (r1 == 0) goto L14
                tv.danmaku.ijk.media.player.AndroidMediaPlayer r1 = r0.this$0
                boolean r1 = r1.notifyOnInfo(r2, r3)
                if (r1 == 0) goto L14
                r1 = 1
                return r1
            L14:
                r1 = 0
                return r1
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(android.media.MediaPlayer r1) {
                r0 = this;
                java.lang.ref.WeakReference<tv.danmaku.ijk.media.player.AndroidMediaPlayer> r1 = r0.mWeakMediaPlayer
                java.lang.Object r1 = r1.get()
                tv.danmaku.ijk.media.player.AndroidMediaPlayer r1 = (tv.danmaku.ijk.media.player.AndroidMediaPlayer) r1
                if (r1 != 0) goto Lb
                return
            Lb:
                tv.danmaku.ijk.media.player.AndroidMediaPlayer r1 = r0.this$0
                r1.notifyOnPrepared()
                return
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(android.media.MediaPlayer r1) {
                r0 = this;
                java.lang.ref.WeakReference<tv.danmaku.ijk.media.player.AndroidMediaPlayer> r1 = r0.mWeakMediaPlayer
                java.lang.Object r1 = r1.get()
                tv.danmaku.ijk.media.player.AndroidMediaPlayer r1 = (tv.danmaku.ijk.media.player.AndroidMediaPlayer) r1
                if (r1 != 0) goto Lb
                return
            Lb:
                tv.danmaku.ijk.media.player.AndroidMediaPlayer r1 = r0.this$0
                r1.notifyOnSeekComplete()
                return
        }

        @Override // android.media.MediaPlayer.OnTimedTextListener
        public void onTimedText(android.media.MediaPlayer r2, android.media.TimedText r3) {
                r1 = this;
                java.lang.ref.WeakReference<tv.danmaku.ijk.media.player.AndroidMediaPlayer> r2 = r1.mWeakMediaPlayer
                java.lang.Object r2 = r2.get()
                tv.danmaku.ijk.media.player.AndroidMediaPlayer r2 = (tv.danmaku.ijk.media.player.AndroidMediaPlayer) r2
                if (r2 != 0) goto Lb
                return
            Lb:
                if (r3 == 0) goto L1b
                tv.danmaku.ijk.media.player.IjkTimedText r2 = new tv.danmaku.ijk.media.player.IjkTimedText
                android.graphics.Rect r0 = r3.getBounds()
                java.lang.String r3 = r3.getText()
                r2.<init>(r0, r3)
                goto L1c
            L1b:
                r2 = 0
            L1c:
                tv.danmaku.ijk.media.player.AndroidMediaPlayer r3 = r1.this$0
                r3.notifyOnTimedText(r2)
                return
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(android.media.MediaPlayer r2, int r3, int r4) {
                r1 = this;
                java.lang.ref.WeakReference<tv.danmaku.ijk.media.player.AndroidMediaPlayer> r2 = r1.mWeakMediaPlayer
                java.lang.Object r2 = r2.get()
                tv.danmaku.ijk.media.player.AndroidMediaPlayer r2 = (tv.danmaku.ijk.media.player.AndroidMediaPlayer) r2
                if (r2 != 0) goto Lb
                return
            Lb:
                tv.danmaku.ijk.media.player.AndroidMediaPlayer r2 = r1.this$0
                r0 = 1
                r2.notifyOnVideoSizeChanged(r3, r4, r0, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @android.annotation.TargetApi(23)
    private static class MediaDataSourceProxy extends android.media.MediaDataSource {
        private final tv.danmaku.ijk.media.player.misc.IMediaDataSource mMediaDataSource;

        public MediaDataSourceProxy(tv.danmaku.ijk.media.player.misc.IMediaDataSource r1) {
                r0 = this;
                r0.<init>()
                r0.mMediaDataSource = r1
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                tv.danmaku.ijk.media.player.misc.IMediaDataSource r0 = r1.mMediaDataSource
                r0.close()
                return
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws java.io.IOException {
                r2 = this;
                tv.danmaku.ijk.media.player.misc.IMediaDataSource r0 = r2.mMediaDataSource
                long r0 = r0.getSize()
                return r0
        }

        @Override // android.media.MediaDataSource
        public int readAt(long r7, byte[] r9, int r10, int r11) throws java.io.IOException {
                r6 = this;
                tv.danmaku.ijk.media.player.misc.IMediaDataSource r0 = r6.mMediaDataSource
                r1 = r7
                r3 = r9
                r4 = r10
                r5 = r11
                int r7 = r0.readAt(r1, r3, r4, r5)
                return r7
        }
    }

    public AndroidMediaPlayer() {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.mInitLock = r0
            monitor-enter(r0)
            android.media.MediaPlayer r1 = new android.media.MediaPlayer     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            r2.mInternalMediaPlayer = r1     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            r0 = 3
            r1.setAudioStreamType(r0)
            tv.danmaku.ijk.media.player.AndroidMediaPlayer$AndroidMediaPlayerListenerHolder r0 = new tv.danmaku.ijk.media.player.AndroidMediaPlayer$AndroidMediaPlayerListenerHolder
            r0.<init>(r2, r2)
            r2.mInternalListenerAdapter = r0
            r2.attachInternalListeners()
            return
        L22:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
    }

    private void attachInternalListeners() {
            r2 = this;
            android.media.MediaPlayer r0 = r2.mInternalMediaPlayer
            tv.danmaku.ijk.media.player.AndroidMediaPlayer$AndroidMediaPlayerListenerHolder r1 = r2.mInternalListenerAdapter
            r0.setOnPreparedListener(r1)
            android.media.MediaPlayer r0 = r2.mInternalMediaPlayer
            tv.danmaku.ijk.media.player.AndroidMediaPlayer$AndroidMediaPlayerListenerHolder r1 = r2.mInternalListenerAdapter
            r0.setOnBufferingUpdateListener(r1)
            android.media.MediaPlayer r0 = r2.mInternalMediaPlayer
            tv.danmaku.ijk.media.player.AndroidMediaPlayer$AndroidMediaPlayerListenerHolder r1 = r2.mInternalListenerAdapter
            r0.setOnCompletionListener(r1)
            android.media.MediaPlayer r0 = r2.mInternalMediaPlayer
            tv.danmaku.ijk.media.player.AndroidMediaPlayer$AndroidMediaPlayerListenerHolder r1 = r2.mInternalListenerAdapter
            r0.setOnSeekCompleteListener(r1)
            android.media.MediaPlayer r0 = r2.mInternalMediaPlayer
            tv.danmaku.ijk.media.player.AndroidMediaPlayer$AndroidMediaPlayerListenerHolder r1 = r2.mInternalListenerAdapter
            r0.setOnVideoSizeChangedListener(r1)
            android.media.MediaPlayer r0 = r2.mInternalMediaPlayer
            tv.danmaku.ijk.media.player.AndroidMediaPlayer$AndroidMediaPlayerListenerHolder r1 = r2.mInternalListenerAdapter
            r0.setOnErrorListener(r1)
            android.media.MediaPlayer r0 = r2.mInternalMediaPlayer
            tv.danmaku.ijk.media.player.AndroidMediaPlayer$AndroidMediaPlayerListenerHolder r1 = r2.mInternalListenerAdapter
            r0.setOnInfoListener(r1)
            android.media.MediaPlayer r0 = r2.mInternalMediaPlayer
            tv.danmaku.ijk.media.player.AndroidMediaPlayer$AndroidMediaPlayerListenerHolder r1 = r2.mInternalListenerAdapter
            r0.setOnTimedTextListener(r1)
            return
    }

    private void releaseMediaDataSource() {
            r1 = this;
            android.media.MediaDataSource r0 = r1.mMediaDataSource
            if (r0 == 0) goto La
            r0.close()     // Catch: java.io.IOException -> L7
        L7:
            r0 = 0
            r1.mMediaDataSource = r0
        La:
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getAudioSessionId() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            int r0 = r0.getAudioSessionId()
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getCurrentPosition() {
            r2 = this;
            android.media.MediaPlayer r0 = r2.mInternalMediaPlayer     // Catch: java.lang.IllegalStateException -> L8
            int r0 = r0.getCurrentPosition()     // Catch: java.lang.IllegalStateException -> L8
            long r0 = (long) r0
            return r0
        L8:
            r0 = move-exception
            tv.danmaku.ijk.media.player.pragma.DebugLog.printStackTrace(r0)
            r0 = 0
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public java.lang.String getDataSource() {
            r1 = this;
            java.lang.String r0 = r1.mDataSource
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getDuration() {
            r2 = this;
            android.media.MediaPlayer r0 = r2.mInternalMediaPlayer     // Catch: java.lang.IllegalStateException -> L8
            int r0 = r0.getDuration()     // Catch: java.lang.IllegalStateException -> L8
            long r0 = (long) r0
            return r0
        L8:
            r0 = move-exception
            tv.danmaku.ijk.media.player.pragma.DebugLog.printStackTrace(r0)
            r0 = 0
            return r0
    }

    public android.media.MediaPlayer getInternalMediaPlayer() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public tv.danmaku.ijk.media.player.MediaInfo getMediaInfo() {
            r3 = this;
            tv.danmaku.ijk.media.player.MediaInfo r0 = tv.danmaku.ijk.media.player.AndroidMediaPlayer.sMediaInfo
            if (r0 != 0) goto L17
            tv.danmaku.ijk.media.player.MediaInfo r0 = new tv.danmaku.ijk.media.player.MediaInfo
            r0.<init>()
            java.lang.String r1 = "android"
            r0.mVideoDecoder = r1
            java.lang.String r2 = "HW"
            r0.mVideoDecoderImpl = r2
            r0.mAudioDecoder = r1
            r0.mAudioDecoderImpl = r2
            tv.danmaku.ijk.media.player.AndroidMediaPlayer.sMediaInfo = r0
        L17:
            tv.danmaku.ijk.media.player.MediaInfo r0 = tv.danmaku.ijk.media.player.AndroidMediaPlayer.sMediaInfo
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public tv.danmaku.ijk.media.player.misc.ITrackInfo[] getTrackInfo() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            tv.danmaku.ijk.media.player.misc.AndroidTrackInfo[] r0 = tv.danmaku.ijk.media.player.misc.AndroidTrackInfo.fromMediaPlayer(r0)
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            int r0 = r0.getVideoHeight()
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarDen() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarNum() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoWidth() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            int r0 = r0.getVideoWidth()
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isLooping() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            boolean r0 = r0.isLooping()
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isPlayable() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isPlaying() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer     // Catch: java.lang.IllegalStateException -> L7
            boolean r0 = r0.isPlaying()     // Catch: java.lang.IllegalStateException -> L7
            return r0
        L7:
            r0 = move-exception
            tv.danmaku.ijk.media.player.pragma.DebugLog.printStackTrace(r0)
            r0 = 0
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void pause() throws java.lang.IllegalStateException {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            r0.pause()
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void prepareAsync() throws java.lang.IllegalStateException {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            r0.prepareAsync()
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void release() {
            r1 = this;
            r0 = 1
            r1.mIsReleased = r0
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            r0.release()
            r1.releaseMediaDataSource()
            r1.resetListeners()
            r1.attachInternalListeners()
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void reset() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer     // Catch: java.lang.IllegalStateException -> L6
            r0.reset()     // Catch: java.lang.IllegalStateException -> L6
            goto La
        L6:
            r0 = move-exception
            tv.danmaku.ijk.media.player.pragma.DebugLog.printStackTrace(r0)
        La:
            r1.releaseMediaDataSource()
            r1.resetListeners()
            r1.attachInternalListeners()
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void seekTo(long r2) throws java.lang.IllegalStateException {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            int r3 = (int) r2
            r0.seekTo(r3)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setAudioStreamType(int r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            r0.setAudioStreamType(r2)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(android.content.Context r2, android.net.Uri r3) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            r0.setDataSource(r2, r3)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    @android.annotation.TargetApi(14)
    public void setDataSource(android.content.Context r2, android.net.Uri r3, java.util.Map<java.lang.String, java.lang.String> r4) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            r0.setDataSource(r2, r3, r4)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(java.io.FileDescriptor r2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            r0.setDataSource(r2)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(java.lang.String r4) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {
            r3 = this;
            r3.mDataSource = r4
            android.net.Uri r0 = android.net.Uri.parse(r4)
            java.lang.String r1 = r0.getScheme()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L22
            java.lang.String r2 = "file"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L22
            android.media.MediaPlayer r4 = r3.mInternalMediaPlayer
            java.lang.String r0 = r0.getPath()
            r4.setDataSource(r0)
            return
        L22:
            android.media.MediaPlayer r0 = r3.mInternalMediaPlayer
            r0.setDataSource(r4)
            return
    }

    @Override // tv.danmaku.ijk.media.player.AbstractMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    @android.annotation.TargetApi(23)
    public void setDataSource(tv.danmaku.ijk.media.player.misc.IMediaDataSource r2) {
            r1 = this;
            r1.releaseMediaDataSource()
            tv.danmaku.ijk.media.player.AndroidMediaPlayer$MediaDataSourceProxy r0 = new tv.danmaku.ijk.media.player.AndroidMediaPlayer$MediaDataSourceProxy
            r0.<init>(r2)
            r1.mMediaDataSource = r0
            android.media.MediaPlayer r2 = r1.mInternalMediaPlayer
            com.bykv.vk.openvk.component.video.j.r.b.a(r2, r0)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDisplay(android.view.SurfaceHolder r3) {
            r2 = this;
            java.lang.Object r0 = r2.mInitLock
            monitor-enter(r0)
            boolean r1 = r2.mIsReleased     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto Lf
            android.media.MediaPlayer r1 = r2.mInternalMediaPlayer     // Catch: java.lang.Throwable -> Ld
            r1.setDisplay(r3)     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r3 = move-exception
            goto L11
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
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
    public void setLooping(boolean r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            r0.setLooping(r2)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            r0.setScreenOnWhilePlaying(r2)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    @android.annotation.TargetApi(14)
    public void setSurface(android.view.Surface r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            r0.setSurface(r2)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setVolume(float r2, float r3) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            r0.setVolume(r2, r3)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setWakeMode(android.content.Context r2, int r3) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            r0.setWakeMode(r2, r3)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void start() throws java.lang.IllegalStateException {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            r0.start()
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void stop() throws java.lang.IllegalStateException {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mInternalMediaPlayer
            r0.stop()
            return
    }
}
