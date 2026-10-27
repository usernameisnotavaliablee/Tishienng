package com.kwad.components.core.o.b.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class c implements com.kwad.components.offline.api.core.video.IMediaPlayer {
    private com.kwad.sdk.core.video.a.c SE;

    c() {
            r0 = this;
            r0.<init>()
            return
    }

    public final com.kwad.components.core.o.b.c.c b(@androidx.annotation.NonNull com.kwad.sdk.core.video.a.c r1) {
            r0 = this;
            com.kwad.sdk.utils.ax.checkNotNull(r1)
            r0.SE = r1
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final int getAudioSessionId() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            int r0 = r0.getAudioSessionId()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final java.lang.String getCurrentPlayingUrl() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            java.lang.String r0 = r0.getCurrentPlayingUrl()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final long getCurrentPosition() {
            r2 = this;
            com.kwad.sdk.core.video.a.c r0 = r2.SE
            long r0 = r0.getCurrentPosition()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final java.lang.String getDataSource() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            java.lang.String r0 = r0.getDataSource()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final long getDuration() {
            r2 = this;
            com.kwad.sdk.core.video.a.c r0 = r2.SE
            long r0 = r0.getDuration()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final int getMediaPlayerType() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            int r0 = r0.getMediaPlayerType()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final int getVideoHeight() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            int r0 = r0.getVideoHeight()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final int getVideoWidth() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            int r0 = r0.getVideoWidth()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final boolean isLooping() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            boolean r0 = r0.isLooping()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final boolean isPlaying() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            boolean r0 = r0.isPlaying()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void pause() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            r0.pause()
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final boolean prepareAsync() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            boolean r0 = r0.prepareAsync()
            return r0
    }

    public final com.kwad.sdk.core.video.a.c qJ() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void release() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            r0.release()
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void reset() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            r0.reset()
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void seekTo(long r2) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            r0.seekTo(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void setAudioStreamType(int r2) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            r0.setAudioStreamType(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void setDataSource(android.content.Context r2, android.net.Uri r3) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            r0.setDataSource(r2, r3)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void setDataSource(android.content.Context r2, android.net.Uri r3, java.util.Map<java.lang.String, java.lang.String> r4) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            r0.setDataSource(r2, r3, r4)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void setDataSource(@androidx.annotation.NonNull com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo r2) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            com.kwad.sdk.contentalliance.a.a.b r2 = com.kwad.components.core.o.b.c.d.a(r2)
            r0.b(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void setDataSource(java.io.FileDescriptor r2) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            r0.setDataSource(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void setDataSource(java.lang.String r2) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            r0.setDataSource(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void setDisplay(android.view.SurfaceHolder r2) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            r0.setDisplay(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void setLooping(boolean r2) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            r0.setLooping(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void setOnBufferingUpdateListener(com.kwad.components.offline.api.core.video.IMediaPlayer.OnBufferingUpdateListener r2) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            com.kwad.sdk.core.video.a.c$a r2 = com.kwad.components.core.o.b.c.d.a(r1, r2)
            r0.a(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void setOnCompletionListener(com.kwad.components.offline.api.core.video.IMediaPlayer.OnCompletionListener r2) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            com.kwad.sdk.core.video.a.c$b r2 = com.kwad.components.core.o.b.c.d.a(r1, r2)
            r0.a(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void setOnErrorListener(com.kwad.components.offline.api.core.video.IMediaPlayer.OnErrorListener r2) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            com.kwad.sdk.core.video.a.c$c r2 = com.kwad.components.core.o.b.c.d.a(r1, r2)
            r0.a(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void setOnInfoListener(com.kwad.components.offline.api.core.video.IMediaPlayer.OnInfoListener r2) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            com.kwad.sdk.core.video.a.c$d r2 = com.kwad.components.core.o.b.c.d.a(r1, r2)
            r0.c(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void setOnPreparedListener(com.kwad.components.offline.api.core.video.IMediaPlayer.OnPreparedListener r2) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            com.kwad.sdk.core.video.a.c$e r2 = com.kwad.components.core.o.b.c.d.a(r1, r2)
            r0.b(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void setOnSeekCompleteListener(com.kwad.components.offline.api.core.video.IMediaPlayer.OnSeekCompleteListener r2) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            com.kwad.sdk.core.video.a.c$g r2 = com.kwad.components.core.o.b.c.d.a(r1, r2)
            r0.a(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void setOnTimedTextListener(com.kwad.components.offline.api.core.video.IMediaPlayer.OnTimedTextListener r2) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            com.kwad.sdk.core.video.a.c$h r2 = com.kwad.components.core.o.b.c.d.a(r1, r2)
            r0.a(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void setOnVideoSizeChangedListener(com.kwad.components.offline.api.core.video.IMediaPlayer.OnVideoSizeChangedListener r2) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            com.kwad.sdk.core.video.a.c$i r2 = com.kwad.components.core.o.b.c.d.a(r1, r2)
            r0.a(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void setScreenOnWhilePlaying(boolean r2) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            r0.setScreenOnWhilePlaying(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void setSpeed(float r2) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            r0.setSpeed(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void setSurface(android.view.Surface r2) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            r0.setSurface(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void setVolume(float r2, float r3) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            r0.setVolume(r2, r3)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void start() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            r0.start()
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IMediaPlayer
    public final void stop() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.SE
            r0.stop()
            return
    }
}
