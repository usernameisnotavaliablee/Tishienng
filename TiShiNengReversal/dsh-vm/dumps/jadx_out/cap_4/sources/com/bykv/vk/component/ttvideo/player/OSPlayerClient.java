package com.bykv.vk.component.ttvideo.player;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class OSPlayerClient extends com.bykv.vk.component.ttvideo.player.MediaPlayerClient {
    protected com.bykv.vk.component.ttvideo.player.MediaPlayer.OnBufferingUpdateListener mOnBufferingUpdateListener;
    protected com.bykv.vk.component.ttvideo.player.MediaPlayer.OnCompletionListener mOnCompletionListener;
    protected com.bykv.vk.component.ttvideo.player.MediaPlayer.OnErrorListener mOnErrorListener;
    protected com.bykv.vk.component.ttvideo.player.MediaPlayer.OnInfoListener mOnInfoListener;
    protected com.bykv.vk.component.ttvideo.player.MediaPlayer.OnPreparedListener mOnPreparedListener;
    protected com.bykv.vk.component.ttvideo.player.MediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    protected com.bykv.vk.component.ttvideo.player.MediaPlayer.OnVideoSizeChangedListener mOnVideoSizeChangedListener;
    private android.media.MediaPlayer mPlayer;
    private com.bykv.vk.component.ttvideo.player.MediaPlayer mWrapper;


    static class WrapOnBufferingUpdateListener implements android.media.MediaPlayer.OnBufferingUpdateListener {
        private com.bykv.vk.component.ttvideo.player.MediaPlayer.OnBufferingUpdateListener mListener;
        private com.bykv.vk.component.ttvideo.player.MediaPlayer mWrapper;

        public WrapOnBufferingUpdateListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnBufferingUpdateListener r1, com.bykv.vk.component.ttvideo.player.MediaPlayer r2) {
                r0 = this;
                r0.<init>()
                r0.mWrapper = r2
                r0.mListener = r1
                return
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(android.media.MediaPlayer r2, int r3) {
                r1 = this;
                com.bykv.vk.component.ttvideo.player.MediaPlayer$OnBufferingUpdateListener r2 = r1.mListener
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mWrapper
                r2.onBufferingUpdate(r0, r3)
                return
        }
    }

    static class WrapOnCompletionListener implements android.media.MediaPlayer.OnCompletionListener {
        private com.bykv.vk.component.ttvideo.player.MediaPlayer.OnCompletionListener mListener;
        private com.bykv.vk.component.ttvideo.player.MediaPlayer mWrapper;

        public WrapOnCompletionListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnCompletionListener r1, com.bykv.vk.component.ttvideo.player.MediaPlayer r2) {
                r0 = this;
                r0.<init>()
                r0.mWrapper = r2
                r0.mListener = r1
                return
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(android.media.MediaPlayer r2) {
                r1 = this;
                com.bykv.vk.component.ttvideo.player.MediaPlayer$OnCompletionListener r2 = r1.mListener
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mWrapper
                r2.onCompletion(r0)
                return
        }
    }

    static class WrapOnErrorListener implements android.media.MediaPlayer.OnErrorListener {
        private com.bykv.vk.component.ttvideo.player.MediaPlayer.OnErrorListener mListener;
        private com.bykv.vk.component.ttvideo.player.MediaPlayer mWrapper;

        public WrapOnErrorListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnErrorListener r1, com.bykv.vk.component.ttvideo.player.MediaPlayer r2) {
                r0 = this;
                r0.<init>()
                r0.mWrapper = r2
                r0.mListener = r1
                return
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(android.media.MediaPlayer r2, int r3, int r4) {
                r1 = this;
                com.bykv.vk.component.ttvideo.player.MediaPlayer$OnErrorListener r2 = r1.mListener
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mWrapper
                boolean r2 = r2.onError(r0, r3, r4)
                return r2
        }
    }

    static class WrapOnInfoListener implements android.media.MediaPlayer.OnInfoListener {
        private com.bykv.vk.component.ttvideo.player.MediaPlayer.OnInfoListener mListener;
        private com.bykv.vk.component.ttvideo.player.MediaPlayer mWrapper;

        public WrapOnInfoListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnInfoListener r1, com.bykv.vk.component.ttvideo.player.MediaPlayer r2) {
                r0 = this;
                r0.<init>()
                r0.mWrapper = r2
                r0.mListener = r1
                return
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(android.media.MediaPlayer r2, int r3, int r4) {
                r1 = this;
                com.bykv.vk.component.ttvideo.player.MediaPlayer$OnInfoListener r2 = r1.mListener
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mWrapper
                boolean r2 = r2.onInfo(r0, r3, r4)
                return r2
        }
    }

    static class WrapOnPreparedListener implements android.media.MediaPlayer.OnPreparedListener {
        private com.bykv.vk.component.ttvideo.player.MediaPlayer.OnPreparedListener mListener;
        private com.bykv.vk.component.ttvideo.player.MediaPlayer mWrapper;

        public WrapOnPreparedListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnPreparedListener r1, com.bykv.vk.component.ttvideo.player.MediaPlayer r2) {
                r0 = this;
                r0.<init>()
                r0.mListener = r1
                r0.mWrapper = r2
                return
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(android.media.MediaPlayer r2) {
                r1 = this;
                com.bykv.vk.component.ttvideo.player.MediaPlayer$OnPreparedListener r2 = r1.mListener
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mWrapper
                r2.onPrepared(r0)
                return
        }
    }

    private static class WrapOnSeekCompleteListener implements android.media.MediaPlayer.OnSeekCompleteListener {
        private com.bykv.vk.component.ttvideo.player.MediaPlayer.OnSeekCompleteListener mListener;
        private com.bykv.vk.component.ttvideo.player.MediaPlayer mWrapper;

        public WrapOnSeekCompleteListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnSeekCompleteListener r1, com.bykv.vk.component.ttvideo.player.MediaPlayer r2) {
                r0 = this;
                r0.<init>()
                r0.mListener = r1
                r0.mWrapper = r2
                return
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(android.media.MediaPlayer r2) {
                r1 = this;
                com.bykv.vk.component.ttvideo.player.MediaPlayer$OnSeekCompleteListener r2 = r1.mListener
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mWrapper
                r2.onSeekComplete(r0)
                return
        }
    }

    private static class WrapOnVideoSizeChangedListener implements android.media.MediaPlayer.OnVideoSizeChangedListener {
        private com.bykv.vk.component.ttvideo.player.MediaPlayer.OnVideoSizeChangedListener mListener;
        private com.bykv.vk.component.ttvideo.player.MediaPlayer mWrapper;

        public WrapOnVideoSizeChangedListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnVideoSizeChangedListener r1, com.bykv.vk.component.ttvideo.player.MediaPlayer r2) {
                r0 = this;
                r0.<init>()
                r0.mListener = r1
                r0.mWrapper = r2
                return
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(android.media.MediaPlayer r2, int r3, int r4) {
                r1 = this;
                com.bykv.vk.component.ttvideo.player.MediaPlayer$OnVideoSizeChangedListener r2 = r1.mListener
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.mWrapper
                r2.onVideoSizeChanged(r0, r3, r4)
                return
        }
    }

    public OSPlayerClient() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final synchronized com.bykv.vk.component.ttvideo.player.OSPlayerClient create(com.bykv.vk.component.ttvideo.player.MediaPlayer r2, android.content.Context r3) {
            java.lang.Class<com.bykv.vk.component.ttvideo.player.OSPlayerClient> r3 = com.bykv.vk.component.ttvideo.player.OSPlayerClient.class
            monitor-enter(r3)
            com.bykv.vk.component.ttvideo.player.OSPlayerClient r0 = new com.bykv.vk.component.ttvideo.player.OSPlayerClient     // Catch: java.lang.Throwable -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> L13
            android.media.MediaPlayer r1 = new android.media.MediaPlayer     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            r0.mPlayer = r1     // Catch: java.lang.Throwable -> L13
            r0.mWrapper = r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r3)
            return r0
        L13:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void deselectTrack(int r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mPlayer
            if (r0 == 0) goto L7
            r0.deselectTrack(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public int getCurrentPosition() {
            r2 = this;
            android.media.MediaPlayer r0 = r2.mPlayer
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.getCurrentPosition()     // Catch: java.lang.Throwable -> La
            return r0
        La:
            return r1
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public int getDuration() {
            r2 = this;
            android.media.MediaPlayer r0 = r2.mPlayer
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.getDuration()     // Catch: java.lang.Throwable -> La
            return r0
        La:
            return r1
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public int getSelectedTrack(int r3) {
            r2 = this;
            android.media.MediaPlayer r0 = r2.mPlayer
            if (r0 == 0) goto Lb
            r1 = 0
            int r3 = r0.getSelectedTrack(r3)     // Catch: java.lang.Throwable -> La
            return r3
        La:
            return r1
        Lb:
            r3 = -1
            return r3
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public com.bykv.vk.component.ttvideo.player.MediaPlayer.TrackInfo[] getTrackInfo() {
            r9 = this;
            android.media.MediaPlayer r0 = r9.mPlayer
            r1 = 0
            if (r0 == 0) goto L25
            android.media.MediaPlayer$TrackInfo[] r0 = r0.getTrackInfo()     // Catch: java.lang.Exception -> La
            goto Lc
        La:
            r0 = r1
        Lc:
            if (r0 == 0) goto L25
            int r2 = r0.length
            com.bykv.vk.component.ttvideo.player.MediaPlayer$TrackInfo[] r2 = new com.bykv.vk.component.ttvideo.player.MediaPlayer.TrackInfo[r2]
            int r3 = r0.length
            r4 = 0
            r5 = 0
        L14:
            if (r4 >= r3) goto L25
            r6 = r0[r4]
            int r7 = r5 + 1
            com.bykv.vk.component.ttvideo.player.MediaPlayer$TrackInfo r8 = new com.bykv.vk.component.ttvideo.player.MediaPlayer$TrackInfo
            r8.<init>(r6)
            r2[r5] = r8
            int r4 = r4 + 1
            r5 = r7
            goto L14
        L25:
            return r1
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public int getType() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public int getVideoHeight() {
            r2 = this;
            android.media.MediaPlayer r0 = r2.mPlayer
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.getVideoHeight()     // Catch: java.lang.Throwable -> La
            return r0
        La:
            return r1
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public int getVideoWidth() {
            r2 = this;
            android.media.MediaPlayer r0 = r2.mPlayer
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.getVideoWidth()     // Catch: java.lang.Throwable -> La
            return r0
        La:
            return r1
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public boolean isLooping() {
            r2 = this;
            android.media.MediaPlayer r0 = r2.mPlayer
            r1 = 0
            if (r0 == 0) goto La
            boolean r0 = r0.isLooping()     // Catch: java.lang.Throwable -> La
            return r0
        La:
            return r1
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public boolean isPlaying() {
            r2 = this;
            android.media.MediaPlayer r0 = r2.mPlayer
            r1 = 0
            if (r0 == 0) goto La
            boolean r0 = r0.isPlaying()     // Catch: java.lang.Throwable -> La
            return r0
        La:
            return r1
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void pause() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mPlayer
            if (r0 == 0) goto L7
            r0.pause()     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void prepare() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mPlayer
            if (r0 == 0) goto L11
            r0.prepare()     // Catch: java.io.IOException -> L8 java.lang.IllegalStateException -> Ld
            return
        L8:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
        Ld:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L11:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void prepareAsync() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mPlayer
            if (r0 == 0) goto L7
            r0.prepareAsync()     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void prevClose() {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void release() {
            r2 = this;
            android.media.MediaPlayer r0 = r2.mPlayer
            if (r0 == 0) goto L11
            r1 = 0
            r0.release()     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> Lf
            r2.mPlayer = r1
            return
        Lb:
            r0 = move-exception
            r2.mPlayer = r1
            throw r0
        Lf:
            r2.mPlayer = r1
        L11:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void releaseAsync() {
            r3 = this;
            com.bytedance.sdk.component.oq.r.cw r0 = new com.bytedance.sdk.component.oq.r.cw
            com.bykv.vk.component.ttvideo.player.OSPlayerClient$1 r1 = new com.bykv.vk.component.ttvideo.player.OSPlayerClient$1
            r1.<init>(r3)
            java.lang.String r2 = "SPlayerClient"
            r0.<init>(r1, r2)
            r0.start()
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void reset() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mPlayer
            if (r0 == 0) goto L7
            r0.reset()     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void seekTo(int r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mPlayer
            if (r0 == 0) goto L7
            r0.seekTo(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void selectTrack(int r1) {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setDataSource(android.content.Context r2, android.net.Uri r3) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException, java.io.IOException {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mPlayer
            r0.setDataSource(r2, r3)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setDataSource(android.content.Context r2, android.net.Uri r3, java.util.Map<java.lang.String, java.lang.String> r4) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException, java.io.IOException {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mPlayer
            r0.setDataSource(r2, r3, r4)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setDataSource(com.bykv.vk.component.ttvideo.player.IMediaDataSource r1) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException, java.io.IOException {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setDataSource(java.io.FileDescriptor r7, long r8, long r10) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.io.IOException {
            r6 = this;
            android.media.MediaPlayer r0 = r6.mPlayer
            r1 = r7
            r2 = r8
            r4 = r10
            r0.setDataSource(r1, r2, r4)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setDataSource(java.lang.String r2) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException, java.io.IOException {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mPlayer
            r0.setDataSource(r2)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setDisplay(android.view.SurfaceHolder r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mPlayer
            if (r0 != 0) goto L5
            goto L8
        L5:
            r0.setDisplay(r2)     // Catch: java.lang.Exception -> L8
        L8:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setFrameMetadataListener(com.bykv.vk.component.ttvideo.player.FrameMetadataListener r1) {
            r0 = this;
            return
    }

    public void setLoadControl(com.bykv.vk.component.ttvideo.player.LoadControl r1) {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setLooping(boolean r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mPlayer
            if (r0 == 0) goto L7
            r0.setLooping(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    public void setMaskInfo(com.bykv.vk.component.ttvideo.player.MaskInfo r1) {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setMediaTransport(com.bykv.vk.component.ttvideo.player.MediaTransport r1) {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setOnBufferingUpdateListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnBufferingUpdateListener r4) {
            r3 = this;
            r3.mOnBufferingUpdateListener = r4
            android.media.MediaPlayer r0 = r3.mPlayer
            com.bykv.vk.component.ttvideo.player.OSPlayerClient$WrapOnBufferingUpdateListener r1 = new com.bykv.vk.component.ttvideo.player.OSPlayerClient$WrapOnBufferingUpdateListener
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r3.mWrapper
            r1.<init>(r4, r2)
            r0.setOnBufferingUpdateListener(r1)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setOnCompletionListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnCompletionListener r4) {
            r3 = this;
            r3.mOnCompletionListener = r4
            android.media.MediaPlayer r0 = r3.mPlayer
            com.bykv.vk.component.ttvideo.player.OSPlayerClient$WrapOnCompletionListener r1 = new com.bykv.vk.component.ttvideo.player.OSPlayerClient$WrapOnCompletionListener
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r3.mWrapper
            r1.<init>(r4, r2)
            r0.setOnCompletionListener(r1)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setOnErrorListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnErrorListener r4) {
            r3 = this;
            r3.mOnErrorListener = r4
            android.media.MediaPlayer r0 = r3.mPlayer
            com.bykv.vk.component.ttvideo.player.OSPlayerClient$WrapOnErrorListener r1 = new com.bykv.vk.component.ttvideo.player.OSPlayerClient$WrapOnErrorListener
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r3.mWrapper
            r1.<init>(r4, r2)
            r0.setOnErrorListener(r1)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setOnExternInfoListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnExternInfoListener r1) {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setOnInfoListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnInfoListener r4) {
            r3 = this;
            r3.mOnInfoListener = r4
            android.media.MediaPlayer r0 = r3.mPlayer
            com.bykv.vk.component.ttvideo.player.OSPlayerClient$WrapOnInfoListener r1 = new com.bykv.vk.component.ttvideo.player.OSPlayerClient$WrapOnInfoListener
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r3.mWrapper
            r1.<init>(r4, r2)
            r0.setOnInfoListener(r1)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setOnPreparedListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnPreparedListener r4) {
            r3 = this;
            r3.mOnPreparedListener = r4
            android.media.MediaPlayer r0 = r3.mPlayer
            com.bykv.vk.component.ttvideo.player.OSPlayerClient$WrapOnPreparedListener r1 = new com.bykv.vk.component.ttvideo.player.OSPlayerClient$WrapOnPreparedListener
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r3.mWrapper
            r1.<init>(r4, r2)
            r0.setOnPreparedListener(r1)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setOnSARChangedListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.onSARChangedListener r1) {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setOnSeekCompleteListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnSeekCompleteListener r4) {
            r3 = this;
            r3.mOnSeekCompleteListener = r4
            android.media.MediaPlayer r0 = r3.mPlayer
            com.bykv.vk.component.ttvideo.player.OSPlayerClient$WrapOnSeekCompleteListener r1 = new com.bykv.vk.component.ttvideo.player.OSPlayerClient$WrapOnSeekCompleteListener
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r3.mWrapper
            r1.<init>(r4, r2)
            r0.setOnSeekCompleteListener(r1)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setOnVideoSizeChangedListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnVideoSizeChangedListener r4) {
            r3 = this;
            android.media.MediaPlayer r0 = r3.mPlayer
            com.bykv.vk.component.ttvideo.player.OSPlayerClient$WrapOnVideoSizeChangedListener r1 = new com.bykv.vk.component.ttvideo.player.OSPlayerClient$WrapOnVideoSizeChangedListener
            com.bykv.vk.component.ttvideo.player.MediaPlayer r2 = r3.mWrapper
            r1.<init>(r4, r2)
            r0.setOnVideoSizeChangedListener(r1)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setPlaybackParams(com.bykv.vk.component.ttvideo.player.PlaybackParams r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L36
            android.media.PlaybackParams r0 = com.bykv.vk.component.ttvideo.player.h.a()
            float r1 = r5.getSpeed()
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L16
            com.bykv.vk.component.ttvideo.player.d.a(r0, r1)
        L16:
            int r1 = r5.getAudioFallbackMode()
            if (r1 < 0) goto L1f
            com.bykv.vk.component.ttvideo.player.e.a(r0, r1)
        L1f:
            float r5 = r5.getPitch()
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 <= 0) goto L2a
            com.bykv.vk.component.ttvideo.player.f.a(r0, r5)
        L2a:
            android.media.MediaPlayer r5 = r4.mPlayer
            if (r5 == 0) goto L36
            com.bykv.vk.component.ttvideo.player.g.a(r5, r0)     // Catch: java.lang.Exception -> L32
            return
        L32:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
        L36:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setScreenOnWhilePlaying(boolean r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mPlayer
            if (r0 == 0) goto L7
            r0.setScreenOnWhilePlaying(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    public void setSubInfo(com.bykv.vk.component.ttvideo.player.SubInfo r1) {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setSurface(android.view.Surface r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mPlayer
            r0.setSurface(r2)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setVolume(float r2, float r3) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mPlayer
            if (r0 == 0) goto L7
            r0.setVolume(r2, r3)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void setWakeMode(android.content.Context r2, int r3) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mPlayer
            r0.setWakeMode(r2, r3)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void start() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mPlayer
            if (r0 == 0) goto L7
            r0.start()     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void stop() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.mPlayer
            if (r0 == 0) goto L7
            r0.stop()     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void switchStream(int r1, int r2) {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayerClient
    public void takeScreenshot(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnScreenshotListener r1) {
            r0 = this;
            return
    }
}
