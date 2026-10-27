package com.bykv.vk.component.ttvideo.playerwrapper;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class MediaPlayerWrapper implements com.bykv.vk.component.ttvideo.player.MediaPlayer {
    private static final java.lang.String OWN_LITE_PLAYER_CLASS_NAME = "com.ss.ttmplayer.player.TTPlayerClient";
    private static final java.lang.String OWN_PLAYER_CLASS_NAME = "com.bykv.vk.component.ttvideo.player.TTPlayerClient";
    private com.bykv.vk.component.ttvideo.player.MediaPlayerClient mClient;

    public MediaPlayerWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.bykv.vk.component.ttvideo.player.MediaPlayer create(android.content.Context r9, int r10) {
            com.bykv.vk.component.ttvideo.playerwrapper.MediaPlayerWrapper r0 = new com.bykv.vk.component.ttvideo.playerwrapper.MediaPlayerWrapper
            r0.<init>()
            java.lang.Class<com.bykv.vk.component.ttvideo.playerwrapper.MediaPlayerWrapper> r1 = com.bykv.vk.component.ttvideo.playerwrapper.MediaPlayerWrapper.class
            monitor-enter(r1)
            boolean r2 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.isOnTTPlayer()     // Catch: java.lang.Throwable -> L77
            if (r2 == 0) goto L79
            r2 = 0
            r3 = 2
            r4 = 1
            java.lang.String r5 = "com.bykv.vk.component.ttvideo.player.TTPlayerClient"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L39
            java.lang.String r6 = "create"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L39
            java.lang.Class<com.bykv.vk.component.ttvideo.player.MediaPlayer> r8 = com.bykv.vk.component.ttvideo.player.MediaPlayer.class
            r7[r2] = r8     // Catch: java.lang.Throwable -> L39
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r7[r4] = r8     // Catch: java.lang.Throwable -> L39
            java.lang.reflect.Method r6 = r5.getDeclaredMethod(r6, r7)     // Catch: java.lang.Throwable -> L39
            r6.setAccessible(r4)     // Catch: java.lang.Throwable -> L39
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L39
            r7[r2] = r0     // Catch: java.lang.Throwable -> L39
            r7[r4] = r9     // Catch: java.lang.Throwable -> L39
            java.lang.Object r5 = r6.invoke(r5, r7)     // Catch: java.lang.Throwable -> L39
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r5 = (com.bykv.vk.component.ttvideo.player.MediaPlayerClient) r5     // Catch: java.lang.Throwable -> L39
            r0.mClient = r5     // Catch: java.lang.Throwable -> L39
            goto L3d
        L39:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)     // Catch: java.lang.Throwable -> L77
        L3d:
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r5 = r0.mClient     // Catch: java.lang.Throwable -> L77
            if (r5 != 0) goto L79
            if (r10 != 0) goto L79
            java.lang.String r10 = "com.ss.ttmplayer.player.TTPlayerClient"
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = "fsl"
            java.lang.String r6 = "create lite player"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r5, r6)     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = "create"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L72
            java.lang.Class<com.bykv.vk.component.ttvideo.player.MediaPlayer> r7 = com.bykv.vk.component.ttvideo.player.MediaPlayer.class
            r6[r2] = r7     // Catch: java.lang.Throwable -> L72
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r4] = r7     // Catch: java.lang.Throwable -> L72
            java.lang.reflect.Method r5 = r10.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L72
            r5.setAccessible(r4)     // Catch: java.lang.Throwable -> L72
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L72
            r3[r2] = r0     // Catch: java.lang.Throwable -> L72
            r3[r4] = r9     // Catch: java.lang.Throwable -> L72
            java.lang.Object r10 = r5.invoke(r10, r3)     // Catch: java.lang.Throwable -> L72
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r10 = (com.bykv.vk.component.ttvideo.player.MediaPlayerClient) r10     // Catch: java.lang.Throwable -> L72
            r0.mClient = r10     // Catch: java.lang.Throwable -> L72
            goto L79
        L72:
            r10 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r10)     // Catch: java.lang.Throwable -> L77
            goto L79
        L77:
            r9 = move-exception
            goto L8c
        L79:
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r10 = r0.mClient     // Catch: java.lang.Throwable -> L77
            if (r10 != 0) goto L8a
            java.lang.String r10 = "fsl"
            java.lang.String r2 = "create osplayer"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r10, r2)     // Catch: java.lang.Throwable -> L77
            com.bykv.vk.component.ttvideo.player.OSPlayerClient r9 = com.bykv.vk.component.ttvideo.player.OSPlayerClient.create(r0, r9)     // Catch: java.lang.Throwable -> L77
            r0.mClient = r9     // Catch: java.lang.Throwable -> L77
        L8a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L77
            return r0
        L8c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L77
            throw r9
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void deselectTrack(int r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.deselectTrack(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public int getCurrentPosition() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L9
            int r0 = r0.getCurrentPosition()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public java.lang.String getDataSource() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getDataSource()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public int getDuration() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L9
            int r0 = r0.getDuration()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public float getFloatOption(int r2, float r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L9
            float r2 = r0.getFloatOption(r2, r3)
            return r2
        L9:
            return r3
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public int getIntOption(int r2, int r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L9
            int r2 = r0.getIntOption(r2, r3)
            return r2
        L9:
            return r3
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public long getLongOption(int r2, long r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L9
            long r2 = r0.getLongOption(r2, r3)
            return r2
        L9:
            return r3
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public int getPlayerType() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L9
            int r0 = r0.getType()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public int getSelectedTrack(int r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L9
            int r2 = r0.getSelectedTrack(r2)
            return r2
        L9:
            r2 = -1
            return r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public java.lang.String getStringOption(int r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L9
            java.lang.String r2 = r0.getStringOption(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public com.bykv.vk.component.ttvideo.player.MediaPlayer.TrackInfo[] getTrackInfo() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L9
            com.bykv.vk.component.ttvideo.player.MediaPlayer$TrackInfo[] r0 = r0.getTrackInfo()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public int getVideoHeight() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L9
            int r0 = r0.getVideoHeight()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public int getVideoType() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L9
            int r0 = r0.getVideoType()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public int getVideoWidth() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L9
            int r0 = r0.getVideoWidth()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public boolean isLooping() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L9
            boolean r0 = r0.isLooping()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public boolean isMute() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L9
            boolean r0 = r0.isMute()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public boolean isOSPlayer() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto Lb
            boolean r0 = r0 instanceof com.bykv.vk.component.ttvideo.player.OSPlayerClient
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public boolean isPlaying() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L9
            boolean r0 = r0.isPlaying()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void mouseEvent(int r2, int r3, int r4) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.mouseEvent(r2, r3, r4)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void pause() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.pause()
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void prepare() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.prepare()
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void prepareAsync() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.prepareAsync()
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void prevClose() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.prevClose()
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void release() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.release()
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void releaseAsync() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.releaseAsync()
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void reset() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.reset()
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void rotateCamera(float r2, float r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.rotateCamera(r2, r3)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void seekTo(int r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.seekTo(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void selectTrack(int r1) {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setCacheFile(java.lang.String r2, int r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setCacheFile(r2, r3)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setDataSource(android.content.Context r2, android.net.Uri r3) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException, java.io.IOException {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setDataSource(r2, r3)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setDataSource(android.content.Context r2, android.net.Uri r3, java.util.Map<java.lang.String, java.lang.String> r4) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException, java.io.IOException {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setDataSource(r2, r3, r4)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setDataSource(com.bykv.vk.component.ttvideo.player.IMediaDataSource r1) throws java.lang.IllegalArgumentException, java.io.IOException {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setDataSource(java.io.FileDescriptor r1, long r2, long r4) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.io.IOException {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setDataSource(java.lang.String r2) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException, java.io.IOException {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setDataSource(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setDisplay(android.view.SurfaceHolder r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setDisplay(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public int setFloatOption(int r2, float r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L9
            int r2 = r0.setFloatOption(r2, r3)
            return r2
        L9:
            r2 = -1
            return r2
    }

    public void setFrameMetadataListener(java.lang.Object r7) {
            r6 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r6.mClient
            if (r0 == 0) goto L29
            java.lang.String r0 = "com.bykv.vk.component.ttvideo.player.TTPlayerClient"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "setFrameMetadataListener"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L25
            java.lang.Class<com.bykv.vk.component.ttvideo.player.FrameMetadataListener> r4 = com.bykv.vk.component.ttvideo.player.FrameMetadataListener.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L25
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L25
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L25
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r1 = r6.mClient     // Catch: java.lang.Throwable -> L25
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L25
            r2[r5] = r7     // Catch: java.lang.Throwable -> L25
            r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r7 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r7)
        L29:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setIntOption(int r2, int r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setIntOption(r2, r3)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setIsMute(boolean r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setIsMute(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public long setLongOption(int r2, long r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto La
            int r2 = r0.setLongOption(r2, r3)
            long r2 = (long) r2
            return r2
        La:
            r2 = -1
            return r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setLooping(boolean r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setLooping(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setMediaTransport(com.bykv.vk.component.ttvideo.player.MediaTransport r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setMediaTransport(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setOnBufferingUpdateListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnBufferingUpdateListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setOnBufferingUpdateListener(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setOnCompletionListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnCompletionListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setOnCompletionListener(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setOnErrorListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnErrorListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setOnErrorListener(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setOnExternInfoListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnExternInfoListener r1) {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setOnInfoListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnInfoListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setOnInfoListener(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setOnLogListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnLogListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setOnLogListener(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setOnPreparedListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnPreparedListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setOnPreparedListener(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setOnSARChangedListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.onSARChangedListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setOnSARChangedListener(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setOnSeekCompleteListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnSeekCompleteListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setOnSeekCompleteListener(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setOnVideoSizeChangedListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnVideoSizeChangedListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setOnVideoSizeChangedListener(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setPanoVideoControlModel(int r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setPanoVideoControlModel(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setPlaybackParams(com.bykv.vk.component.ttvideo.player.PlaybackParams r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setPlaybackParams(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setScreenOnWhilePlaying(boolean r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setScreenOnWhilePlaying(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setStringOption(int r2, java.lang.String r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setStringOption(r2, r3)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setSurface(android.view.Surface r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L12
            if (r2 == 0) goto L12
            boolean r0 = r2.isValid()
            if (r0 != 0) goto Ld
            goto L12
        Ld:
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            r0.setSurface(r2)
        L12:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setVolume(float r2, float r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setVolume(r2, r3)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setWakeMode(android.content.Context r2, int r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setWakeMode(r2, r3)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void start() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.start()
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void stop() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.stop()
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void switchStream(int r1, int r2) {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void takeScreenshot(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnScreenshotListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.takeScreenshot(r2)
        L7:
            return
    }
}
