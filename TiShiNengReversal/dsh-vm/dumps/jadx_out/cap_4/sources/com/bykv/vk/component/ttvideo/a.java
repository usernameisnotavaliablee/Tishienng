package com.bykv.vk.component.ttvideo;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a implements com.bykv.vk.component.ttvideo.player.MediaPlayer {
    private com.bykv.vk.component.ttvideo.player.MediaPlayerClient a;

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.bykv.vk.component.ttvideo.player.MediaPlayer a(android.content.Context r3, int r4) {
            com.bykv.vk.component.ttvideo.a r0 = new com.bykv.vk.component.ttvideo.a
            r0.<init>()
            java.lang.Class<com.bykv.vk.component.ttvideo.a> r1 = com.bykv.vk.component.ttvideo.a.class
            monitor-enter(r1)
            r2 = 1
            if (r4 != r2) goto L1b
            com.bykv.vk.component.ttvideo.player.OSPlayerClient r3 = com.bykv.vk.component.ttvideo.player.OSPlayerClient.create(r0, r3)     // Catch: java.lang.Throwable -> L19
            r0.a = r3     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "MediaPlayerWrapper"
            java.lang.String r4 = "create player type OS"
        L15:
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r3, r4)     // Catch: java.lang.Throwable -> L19
            goto L26
        L19:
            r3 = move-exception
            goto L28
        L1b:
            com.bykv.vk.component.ttvideo.player.TTPlayerClient r3 = com.bykv.vk.component.ttvideo.player.TTPlayerClient.create(r0, r3)     // Catch: java.lang.Throwable -> L19
            r0.a = r3     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "MediaPlayerWrapper"
            java.lang.String r4 = "create player type OWN"
            goto L15
        L26:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            return r0
        L28:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void deselectTrack(int r1) {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public int getCurrentPosition() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
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
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
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
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L9
            int r0 = r0.getDuration()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public float getFloatOption(int r1, float r2) {
            r0 = this;
            return r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public int getIntOption(int r2, int r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L9
            int r2 = r0.getIntOption(r2, r3)
            return r2
        L9:
            return r3
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public long getLongOption(int r1, long r2) {
            r0 = this;
            return r2
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public int getPlayerType() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L9
            int r0 = r0.getType()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public int getSelectedTrack(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public java.lang.String getStringOption(int r1) {
            r0 = this;
            java.lang.String r1 = ""
            return r1
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public com.bykv.vk.component.ttvideo.player.MediaPlayer.TrackInfo[] getTrackInfo() {
            r1 = this;
            r0 = 0
            com.bykv.vk.component.ttvideo.player.MediaPlayer$TrackInfo[] r0 = new com.bykv.vk.component.ttvideo.player.MediaPlayer.TrackInfo[r0]
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public int getVideoHeight() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
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
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
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
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
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
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
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
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
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
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            boolean r0 = r0 instanceof com.bykv.vk.component.ttvideo.player.OSPlayerClient
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public boolean isPlaying() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L9
            boolean r0 = r0.isPlaying()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void mouseEvent(int r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void pause() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.pause()
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void prepare() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.prepare()
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void prepareAsync() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.prepareAsync()
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void prevClose() {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void release() {
            r2 = this;
            java.lang.String r0 = "MediaPlayerWrapper"
            java.lang.String r1 = "release"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r0, r1)
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r2.a
            if (r0 == 0) goto Le
            r0.release()
        Le:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void releaseAsync() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.releaseAsync()
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void reset() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.reset()
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void rotateCamera(float r1, float r2) {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void seekTo(int r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
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
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setCacheFile(r2, r3)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setDataSource(android.content.Context r2, android.net.Uri r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setDataSource(r2, r3)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setDataSource(android.content.Context r2, android.net.Uri r3, java.util.Map<java.lang.String, java.lang.String> r4) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setDataSource(r2, r3, r4)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setDataSource(com.bykv.vk.component.ttvideo.player.IMediaDataSource r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setDataSource(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setDataSource(java.io.FileDescriptor r7, long r8, long r10) {
            r6 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r6.a
            if (r0 == 0) goto La
            r1 = r7
            r2 = r8
            r4 = r10
            r0.setDataSource(r1, r2, r4)
        La:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setDataSource(java.lang.String r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setDataSource(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setDisplay(android.view.SurfaceHolder r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setDisplay(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public int setFloatOption(int r1, float r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setIntOption(int r2, int r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setIntOption(r2, r3)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setIsMute(boolean r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 != 0) goto L5
            goto L16
        L5:
            boolean r0 = r1.isOSPlayer()
            if (r0 == 0) goto L17
            if (r2 == 0) goto Lf
            r2 = 0
            goto L11
        Lf:
            r2 = 1065353216(0x3f800000, float:1.0)
        L11:
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a     // Catch: java.lang.Exception -> L16
            r0.setVolume(r2, r2)     // Catch: java.lang.Exception -> L16
        L16:
            return
        L17:
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            r0.setIsMute(r2)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public long setLongOption(int r1, long r2) {
            r0 = this;
            r1 = -1
            return r1
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setLooping(boolean r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setLooping(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setMediaTransport(com.bykv.vk.component.ttvideo.player.MediaTransport r1) {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setOnBufferingUpdateListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnBufferingUpdateListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setOnBufferingUpdateListener(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setOnCompletionListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnCompletionListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setOnCompletionListener(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setOnErrorListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnErrorListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
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
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setOnInfoListener(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setOnLogListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnLogListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setOnLogListener(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setOnPreparedListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnPreparedListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setOnPreparedListener(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setOnSARChangedListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.onSARChangedListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setOnSARChangedListener(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setOnSeekCompleteListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnSeekCompleteListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setOnSeekCompleteListener(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setOnVideoSizeChangedListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnVideoSizeChangedListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setOnVideoSizeChangedListener(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setPanoVideoControlModel(int r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setPanoVideoControlModel(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setPlaybackParams(com.bykv.vk.component.ttvideo.player.PlaybackParams r1) {
            r0 = this;
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setScreenOnWhilePlaying(boolean r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setScreenOnWhilePlaying(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setStringOption(int r2, java.lang.String r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setStringOption(r2, r3)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setSurface(android.view.Surface r2) {
            r1 = this;
            if (r2 == 0) goto L8
            boolean r0 = r2.isValid()
            if (r0 == 0) goto Lc
        L8:
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 != 0) goto Ld
        Lc:
            return
        Ld:
            r0.setSurface(r2)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setVolume(float r2, float r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setVolume(r2, r3)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setWakeMode(android.content.Context r2, int r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.setWakeMode(r2, r3)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void start() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
            if (r0 == 0) goto L7
            r0.start()
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void stop() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.a
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
    public void takeScreenshot(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnScreenshotListener r1) {
            r0 = this;
            return
    }
}
