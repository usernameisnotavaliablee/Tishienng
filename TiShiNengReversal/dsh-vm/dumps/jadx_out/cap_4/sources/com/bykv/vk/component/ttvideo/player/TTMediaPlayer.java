package com.bykv.vk.component.ttvideo.player;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TTMediaPlayer implements com.bykv.vk.component.ttvideo.player.MediaPlayer {
    protected com.bykv.vk.component.ttvideo.player.MediaPlayerClient mClient;
    protected int mPlayerType;

    static {
            com.bykv.vk.component.ttvideo.player.TTVersion.saveVersionInfo()
            return
    }

    public TTMediaPlayer() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mPlayerType = r0
            return
    }

    public static final synchronized com.bykv.vk.component.ttvideo.player.TTMediaPlayer create(android.content.Context r10) {
            java.lang.Class<com.bykv.vk.component.ttvideo.player.TTMediaPlayer> r0 = com.bykv.vk.component.ttvideo.player.TTMediaPlayer.class
            monitor-enter(r0)
            com.bykv.vk.component.ttvideo.player.TTMediaPlayer r1 = new com.bykv.vk.component.ttvideo.player.TTMediaPlayer     // Catch: java.lang.Throwable -> L85
            r1.<init>()     // Catch: java.lang.Throwable -> L85
            boolean r2 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.isPrintInfo()     // Catch: java.lang.Throwable -> L85
            r3 = 1
            r4 = 11
            r5 = 7
            r6 = 0
            if (r2 == 0) goto L87
            java.lang.String r2 = "ttplayer"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            java.lang.String r8 = "ttplayer:"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L85
            boolean r8 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r3, r6)     // Catch: java.lang.Throwable -> L85
            r7.append(r8)     // Catch: java.lang.Throwable -> L85
            java.lang.String r8 = ",ipc:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L85
            r8 = 2
            boolean r8 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r8, r6)     // Catch: java.lang.Throwable -> L85
            r7.append(r8)     // Catch: java.lang.Throwable -> L85
            java.lang.String r8 = ",crashed:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L85
            boolean r8 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r5, r6)     // Catch: java.lang.Throwable -> L85
            r7.append(r8)     // Catch: java.lang.Throwable -> L85
            java.lang.String r8 = ",cpu family"
            r7.append(r8)     // Catch: java.lang.Throwable -> L85
            int r8 = com.bykv.vk.component.ttvideo.utils.HardWareInfo.getCpuFamily()     // Catch: java.lang.Throwable -> L85
            r7.append(r8)     // Catch: java.lang.Throwable -> L85
            java.lang.String r8 = ",debug:false,timeout count:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L85
            r8 = 10
            int r8 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r8, r6)     // Catch: java.lang.Throwable -> L85
            r7.append(r8)     // Catch: java.lang.Throwable -> L85
            java.lang.String r8 = ",forbid create os player:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L85
            boolean r8 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r4, r6)     // Catch: java.lang.Throwable -> L85
            r7.append(r8)     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L85
            com.bytedance.sdk.component.utils.vl.j(r2, r7)     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = "ttplayer"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            java.lang.String r8 = "version info:"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L85
            java.lang.String r8 = "not find version info"
            r9 = 15
            java.lang.String r8 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r9, r8)     // Catch: java.lang.Throwable -> L85
            r7.append(r8)     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L85
            com.bytedance.sdk.component.utils.vl.j(r2, r7)     // Catch: java.lang.Throwable -> L85
            goto L87
        L85:
            r10 = move-exception
            goto Lce
        L87:
            r2 = 0
            boolean r7 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.isOnTTPlayer()     // Catch: java.lang.Throwable -> L95
            if (r7 != 0) goto L97
            boolean r7 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r4, r6)     // Catch: java.lang.Throwable -> L95
            if (r7 == 0) goto La8
            goto L97
        L95:
            r7 = move-exception
            goto L9c
        L97:
            com.bykv.vk.component.ttvideo.player.TTPlayerClient r3 = com.bykv.vk.component.ttvideo.player.TTPlayerClient.create(r1, r10, r2)     // Catch: java.lang.Throwable -> L95
            goto La9
        L9c:
            com.bytedance.sdk.component.utils.vl.j(r7)     // Catch: java.lang.Throwable -> L85
            boolean r7 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r5, r6)     // Catch: java.lang.Throwable -> L85
            if (r7 != 0) goto La8
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.setValue(r5, r3)     // Catch: java.lang.Throwable -> L85
        La8:
            r3 = r2
        La9:
            if (r3 != 0) goto Lc6
            boolean r3 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.isPrintInfo()     // Catch: java.lang.Throwable -> L85
            if (r3 == 0) goto Lb8
            java.lang.String r3 = "ttplayer"
            java.lang.String r5 = "---------->ttplayer off<------------"
            com.bytedance.sdk.component.utils.vl.j(r3, r5)     // Catch: java.lang.Throwable -> L85
        Lb8:
            boolean r3 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r4, r6)     // Catch: java.lang.Throwable -> L85
            if (r3 == 0) goto Lc0
            monitor-exit(r0)
            return r2
        Lc0:
            com.bykv.vk.component.ttvideo.player.OSPlayerClient r3 = com.bykv.vk.component.ttvideo.player.OSPlayerClient.create(r1, r10)     // Catch: java.lang.Throwable -> L85
            r1.mPlayerType = r6     // Catch: java.lang.Throwable -> L85
        Lc6:
            if (r3 != 0) goto Lca
            monitor-exit(r0)
            return r2
        Lca:
            r1.mClient = r3     // Catch: java.lang.Throwable -> L85
            monitor-exit(r0)
            return r1
        Lce:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L85
            throw r10
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void deselectTrack(int r3) {
            r2 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r2.mClient
            if (r0 == 0) goto Ld
            if (r3 != 0) goto Ld
            r3 = 261(0x105, float:3.66E-43)
            r1 = 1
            r0.setIntOption(r3, r1)
            return
        Ld:
            if (r0 == 0) goto L16
            int r3 = r3 << 8
            r1 = 65
            r0.setIntOption(r1, r3)
        L16:
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
            if (r0 == 0) goto Ld
            int r0 = r0.getType()
            if (r0 != 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
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
    @java.lang.Deprecated
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
    public void selectTrack(int r3) {
            r2 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r2.mClient
            if (r0 == 0) goto Lc
            if (r3 != 0) goto Lc
            r3 = 261(0x105, float:3.66E-43)
            r1 = 0
            r0.setIntOption(r3, r1)
        Lc:
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
    public void setDataSource(com.bykv.vk.component.ttvideo.player.IMediaDataSource r2) throws java.lang.IllegalArgumentException, java.io.IOException {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setDataSource(r2)
        L7:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer
    public void setDataSource(java.io.FileDescriptor r7, long r8, long r10) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.io.IOException {
            r6 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r6.mClient
            if (r0 == 0) goto La
            r1 = r7
            r2 = r8
            r4 = r10
            r0.setDataSource(r1, r2, r4)
        La:
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
    public void setOnExternInfoListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnExternInfoListener r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.setOnExternInfoListener(r2)
        L7:
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
            if (r2 == 0) goto L10
            boolean r0 = r2.isValid()
            if (r0 == 0) goto L10
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 != 0) goto Ld
            goto L10
        Ld:
            r0.setSurface(r2)
        L10:
            return
    }

    public void setUnSupportSampleRates(int[] r9) {
            r8 = this;
            boolean r0 = r8.isOSPlayer()
            if (r0 == 0) goto L7
            goto L32
        L7:
            int r0 = r9.length
            if (r0 > 0) goto Lb
            goto L32
        Lb:
            int[] r1 = com.bykv.vk.component.ttvideo.player.MediaPlayer.MEDIA_PLAYER_SUPPORT_SAMPLERATES
            int r1 = r1.length
            r2 = 0
            r3 = 0
            r4 = 0
        L11:
            if (r3 >= r0) goto L29
            r5 = 0
        L14:
            if (r5 >= r1) goto L26
            int[] r6 = com.bykv.vk.component.ttvideo.player.MediaPlayer.MEDIA_PLAYER_SUPPORT_SAMPLERATES
            r6 = r6[r5]
            r7 = r9[r3]
            if (r6 != r7) goto L23
            r6 = 1
            int r5 = r6 << r5
            r4 = r4 | r5
            goto L26
        L23:
            int r5 = r5 + 1
            goto L14
        L26:
            int r3 = r3 + 1
            goto L11
        L29:
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r9 = r8.mClient
            if (r9 == 0) goto L32
            r0 = 111(0x6f, float:1.56E-43)
            r9.setIntOption(r0, r4)
        L32:
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
    public void switchStream(int r2, int r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayerClient r0 = r1.mClient
            if (r0 == 0) goto L7
            r0.switchStream(r2, r3)
        L7:
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
