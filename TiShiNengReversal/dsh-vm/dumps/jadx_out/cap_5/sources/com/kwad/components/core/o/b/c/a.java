package com.kwad.components.core.o.b.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class a implements com.kwad.components.offline.api.core.video.IKsMediaPlayer {
    private boolean Bj;
    private com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener Bm;
    private com.kwad.components.core.video.b Su;
    private com.kwad.components.core.o.b.c.c Sv;
    private com.kwad.components.offline.api.core.video.listener.VideoMuteStateChangeListener Sw;
    private boolean Sx;
    private int Sy;
    private android.content.Context mContext;
    private com.kwad.components.core.video.DetailVideoView mDetailVideoView;
    private boolean pW;



    a() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.pW = r0
            r0 = -1
            r1.Sy = r0
            return
    }

    static /* synthetic */ com.kwad.components.core.video.b a(com.kwad.components.core.o.b.c.a r0) {
            com.kwad.components.core.video.b r0 = r0.Su
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.core.o.b.c.a r0, boolean r1) {
            r0.Bj = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.offline.api.core.video.listener.VideoMuteStateChangeListener b(com.kwad.components.core.o.b.c.a r0) {
            com.kwad.components.offline.api.core.video.listener.VideoMuteStateChangeListener r0 = r0.Sw
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.components.core.o.b.c.a r0, boolean r1) {
            r1 = 0
            r0.pW = r1
            return r1
    }

    static /* synthetic */ boolean c(com.kwad.components.core.o.b.c.a r0) {
            boolean r0 = r0.pW
            return r0
    }

    private com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener qH() {
            r1 = this;
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r0 = r1.Bm
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.c.a$2 r0 = new com.kwad.components.core.o.b.c.a$2
            r0.<init>(r1)
            r1.Bm = r0
        Lb:
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r0 = r1.Bm
            return r0
    }

    public final com.kwad.components.core.o.b.c.a a(@androidx.annotation.NonNull com.kwad.components.core.video.b r1) {
            r0 = this;
            com.kwad.sdk.utils.ax.checkNotNull(r1)
            r0.Su = r1
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void addOnInfoListener(com.kwad.components.offline.api.core.video.IMediaPlayer.OnInfoListener r3) {
            r2 = this;
            com.kwad.components.core.video.b r0 = r2.Su
            com.kwad.components.offline.api.core.video.IMediaPlayer r1 = r2.getMediaPlayer()
            com.kwad.sdk.core.video.a.c$d r3 = com.kwad.components.core.o.b.c.d.a(r1, r3)
            r0.a(r3)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void addOnPreparedListener(com.kwad.components.offline.api.core.video.IMediaPlayer.OnPreparedListener r3) {
            r2 = this;
            com.kwad.components.core.video.b r0 = r2.Su
            com.kwad.components.offline.api.core.video.IMediaPlayer r1 = r2.getMediaPlayer()
            com.kwad.sdk.core.video.a.c$e r3 = com.kwad.components.core.o.b.c.d.a(r1, r3)
            r0.a(r3)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void clear() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            r0.clear()
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final boolean getAlphaVideoValid() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            boolean r0 = r0.getAlphaVideoValid()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final int getBufferPercentage() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            int r0 = r0.getBufferPercentage()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final java.lang.String getCurrentPlayingUrl() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            java.lang.String r0 = r0.getCurrentPlayingUrl()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final long getCurrentPosition() {
            r2 = this;
            com.kwad.components.core.video.b r0 = r2.Su
            long r0 = r0.getCurrentPosition()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final long getDuration() {
            r2 = this;
            com.kwad.components.core.video.b r0 = r2.Su
            long r0 = r0.getDuration()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final int getMaxVolume() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final com.kwad.components.offline.api.core.video.IMediaPlayer getMediaPlayer() {
            r2 = this;
            com.kwad.components.core.video.b r0 = r2.Su
            com.kwad.sdk.core.video.a.c r0 = r0.tz()
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            com.kwad.components.core.o.b.c.c r1 = r2.Sv
            if (r1 == 0) goto L14
            com.kwad.sdk.core.video.a.c r1 = r1.qJ()
            if (r1 == r0) goto L1f
        L14:
            com.kwad.components.core.o.b.c.c r1 = new com.kwad.components.core.o.b.c.c
            r1.<init>()
            com.kwad.components.core.o.b.c.c r0 = r1.b(r0)
            r2.Sv = r0
        L1f:
            com.kwad.components.core.o.b.c.c r0 = r2.Sv
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final int getMediaPlayerType() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            int r0 = r0.getMediaPlayerType()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final long getPlayDuration() {
            r2 = this;
            com.kwad.components.core.video.b r0 = r2.Su
            long r0 = r0.getPlayDuration()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final java.lang.String getStateString(int r1) {
            r0 = this;
            java.lang.String r1 = com.kwad.components.core.video.b.getStateString(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final int getVideoHeight() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            int r0 = r0.getVideoHeight()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final int getVideoWidth() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            int r0 = r0.getVideoWidth()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final int getVolume() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void initMediaPlayer(@androidx.annotation.NonNull com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo r2, @androidx.annotation.NonNull com.kwad.components.offline.api.core.video.IKsMediaPlayerView r3) {
            r1 = this;
            boolean r0 = r3 instanceof com.kwad.components.core.o.b.c.b
            if (r0 != 0) goto Lc
            java.lang.String r2 = "KsMediaPlayer"
            java.lang.String r3 = "videoView not instanceof KsMediaPlayerView"
            com.kwad.sdk.core.d.c.e(r2, r3)
            return
        Lc:
            com.kwad.components.core.o.b.c.b r3 = (com.kwad.components.core.o.b.c.b) r3
            com.kwad.components.core.video.DetailVideoView r3 = r3.qI()
            r1.mDetailVideoView = r3
            android.content.Context r3 = r3.getContext()
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r1.mContext = r3
            com.kwad.components.core.video.b r3 = r1.Su
            com.kwad.sdk.contentalliance.a.a.b r2 = com.kwad.components.core.o.b.c.d.a(r2)
            com.kwad.components.core.video.DetailVideoView r0 = r1.mDetailVideoView
            r3.a(r2, r0)
            int r2 = r1.Sy
            r3 = -1
            if (r2 == r3) goto L35
            r1.setVideoAdaptStrategy(r2)
        L35:
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void initMediaPlayer(@androidx.annotation.NonNull com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo r2, boolean r3, boolean r4, @androidx.annotation.NonNull com.kwad.components.offline.api.core.video.IKsMediaPlayerView r5) {
            r1 = this;
            boolean r0 = r5 instanceof com.kwad.components.core.o.b.c.b
            if (r0 != 0) goto Lc
            java.lang.String r2 = "KsMediaPlayer"
            java.lang.String r3 = "videoView not instanceof KsMediaPlayerView"
            com.kwad.sdk.core.d.c.e(r2, r3)
            return
        Lc:
            com.kwad.components.core.video.b r0 = r1.Su
            com.kwad.sdk.contentalliance.a.a.b r2 = com.kwad.components.core.o.b.c.d.a(r2)
            com.kwad.components.core.o.b.c.b r5 = (com.kwad.components.core.o.b.c.b) r5
            com.kwad.components.core.video.DetailVideoView r5 = r5.qI()
            r0.a(r2, r3, r4, r5)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final boolean isPlaying() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            boolean r0 = r0.isPlaying()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final boolean isPrepared() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            boolean r0 = r0.isPrepared()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final boolean isPreparing() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            boolean r0 = r0.isPreparing()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void notifyOnInfoListener(com.kwad.components.offline.api.core.video.IMediaPlayer r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r2 instanceof com.kwad.components.core.o.b.c.c
            if (r0 != 0) goto Lc
            java.lang.String r2 = "KsMediaPlayer"
            java.lang.String r3 = "videoView not instanceof KsMediaPlayerView"
            com.kwad.sdk.core.d.c.e(r2, r3)
            return
        Lc:
            com.kwad.components.core.video.b r0 = r1.Su
            com.kwad.components.core.o.b.c.c r2 = (com.kwad.components.core.o.b.c.c) r2
            com.kwad.sdk.core.video.a.c r2 = r2.qJ()
            r0.a(r2, r3, r4)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void onPlayStateChanged(int r2) {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            r0.onPlayStateChanged(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final boolean pause() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            boolean r0 = r0.pause()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void prepareAsync() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            r0.prepareAsync()
            return
    }

    public final com.kwad.components.core.video.b qG() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void registerVideoMuteStateListener(com.kwad.components.offline.api.core.video.listener.VideoMuteStateChangeListener r1) {
            r0 = this;
            r0.Sw = r1
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void registerVideoPlayStateListener(com.kwad.components.offline.api.core.video.listener.OfflineVideoPlayStateListener r2) {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            com.kwad.components.core.video.l r2 = com.kwad.components.core.o.b.c.d.a(r2)
            r0.c(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void release() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            r0.release()
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void release(com.kwad.components.offline.api.core.video.listener.ReleaseCallback r2) {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            com.kwad.components.core.video.b$a r2 = com.kwad.components.core.o.b.c.d.a(r2)
            r0.a(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void release(com.kwad.components.offline.api.core.video.listener.ReleaseCallback r2, boolean r3) {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            com.kwad.components.core.video.b$a r2 = com.kwad.components.core.o.b.c.d.a(r2)
            r0.a(r2, r3)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void releaseAsync() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            if (r0 == 0) goto Ld
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r1 = r2.Bm
            r0.b(r1)
        Ld:
            com.kwad.components.core.video.b r0 = r2.Su
            r0.releaseAsync()
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void removeInfoListener(com.kwad.components.offline.api.core.video.IMediaPlayer.OnInfoListener r3) {
            r2 = this;
            com.kwad.components.core.video.b r0 = r2.Su
            com.kwad.components.offline.api.core.video.IMediaPlayer r1 = r2.getMediaPlayer()
            com.kwad.sdk.core.video.a.c$d r3 = com.kwad.components.core.o.b.c.d.a(r1, r3)
            r0.b(r3)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void resetAndPlay(com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo r2) {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            com.kwad.components.core.o.b.c.d.a(r2)
            r0.tC()
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void restart() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            r0.restart()
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void resume() {
            r2 = this;
            com.kwad.components.core.video.b r0 = r2.Su
            r0.resume()
            boolean r0 = r2.pW
            if (r0 != 0) goto L11
            boolean r0 = r2.Sx
            if (r0 == 0) goto L37
            boolean r0 = r2.Bj
            if (r0 == 0) goto L37
        L11:
            android.content.Context r0 = r2.mContext
            if (r0 == 0) goto L1e
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            boolean r1 = r2.Sx
            r0.aQ(r1)
        L1e:
            boolean r0 = r2.Sx
            r1 = 0
            if (r0 == 0) goto L30
            boolean r0 = r2.Bj
            if (r0 == 0) goto L30
            r2.Bj = r1
            r0 = 1
            r2.setAudioEnabled(r0)
            r2.pW = r0
            return
        L30:
            boolean r0 = r2.Bj
            if (r0 == 0) goto L37
            r2.setAudioEnabled(r1)
        L37:
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void seekTo(long r2) {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            r0.seekTo(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void setAudioEnabled(boolean r3) {
            r2 = this;
            if (r3 == 0) goto Le
            android.content.Context r0 = r2.mContext
            if (r0 == 0) goto Le
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            r1 = 1
            r0.aQ(r1)
        Le:
            boolean r0 = r2.pW
            if (r3 != r0) goto L18
            java.lang.String r3 = "autoVoice"
            com.kwad.sdk.core.video.a.a.a.eE(r3)
            return
        L18:
            r2.pW = r3
            com.kwad.components.core.o.b.c.a$1 r0 = new com.kwad.components.core.o.b.c.a$1
            r0.<init>(r2, r3)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void setDataSource(@androidx.annotation.NonNull com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo r2) {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            com.kwad.sdk.contentalliance.a.a.b r2 = com.kwad.components.core.o.b.c.d.a(r2)
            r0.b(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void setForceGetAudioFocus(boolean r2) {
            r1 = this;
            r1.Sx = r2
            android.content.Context r2 = r1.mContext
            if (r2 == 0) goto L11
            com.kwad.components.core.t.a r2 = com.kwad.components.core.t.a.aC(r2)
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r0 = r1.qH()
            r2.a(r0)
        L11:
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void setIsAlphaVideoPlayer(boolean r2) {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            r0.setIsAlphaVideoPlayer(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void setRadius(float r2, float r3, float r4, float r5) {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            r0.setRadius(r2, r3, r4, r5)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void setSpeed(float r2) {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            r0.setSpeed(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void setSurface(android.view.Surface r2) {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            r0.setSurface(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void setTKPlayer() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            r0.setTKPlayer()
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void setVideoAdaptStrategy(int r3) {
            r2 = this;
            r2.Sy = r3
            com.kwad.components.core.video.DetailVideoView r0 = r2.mDetailVideoView
            if (r0 == 0) goto La
            r1 = 1
            r0.g(r1, r3)
        La:
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void setVolume(float r2, float r3) {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            r0.setVolume(r2, r3)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void start() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            r0.start()
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void start(long r2) {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            r0.start(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void stopAndPrepareAsync() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            r0.stopAndPrepareAsync()
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void unRegisterVideoPlayStateListener(com.kwad.components.offline.api.core.video.listener.OfflineVideoPlayStateListener r2) {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            com.kwad.components.core.video.l r2 = com.kwad.components.core.o.b.c.d.a(r2)
            r0.d(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void updateKsPlayLogParam(com.kwad.components.offline.api.core.video.mdoel.KsPlayerLogParams r2) {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.Su
            com.kwad.sdk.contentalliance.a.a.a r2 = com.kwad.components.core.o.b.c.d.a(r2)
            r0.a(r2)
            return
    }
}
