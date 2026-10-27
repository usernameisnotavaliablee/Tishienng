package tv.danmaku.ijk.media.player;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class MediaPlayerProxy implements tv.danmaku.ijk.media.player.IMediaPlayer {
    protected final tv.danmaku.ijk.media.player.IMediaPlayer mBackEndMediaPlayer;









    public MediaPlayerProxy(tv.danmaku.ijk.media.player.IMediaPlayer r1) {
            r0 = this;
            r0.<init>()
            r0.mBackEndMediaPlayer = r1
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getAudioSessionId() {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            int r0 = r0.getAudioSessionId()
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getCurrentPosition() {
            r2 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.mBackEndMediaPlayer
            long r0 = r0.getCurrentPosition()
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public java.lang.String getDataSource() {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            java.lang.String r0 = r0.getDataSource()
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getDuration() {
            r2 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.mBackEndMediaPlayer
            long r0 = r0.getDuration()
            return r0
    }

    public tv.danmaku.ijk.media.player.IMediaPlayer getInternalMediaPlayer() {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public tv.danmaku.ijk.media.player.MediaInfo getMediaInfo() {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            tv.danmaku.ijk.media.player.MediaInfo r0 = r0.getMediaInfo()
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public tv.danmaku.ijk.media.player.misc.ITrackInfo[] getTrackInfo() {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            tv.danmaku.ijk.media.player.misc.ITrackInfo[] r0 = r0.getTrackInfo()
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            int r0 = r0.getVideoHeight()
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarDen() {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            int r0 = r0.getVideoSarDen()
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarNum() {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            int r0 = r0.getVideoSarNum()
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoWidth() {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            int r0 = r0.getVideoWidth()
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isLooping() {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            boolean r0 = r0.isLooping()
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isPlayable() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isPlaying() {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            boolean r0 = r0.isPlaying()
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void pause() throws java.lang.IllegalStateException {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            r0.pause()
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void prepareAsync() throws java.lang.IllegalStateException {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            r0.prepareAsync()
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void release() {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            r0.release()
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void reset() {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            r0.reset()
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void seekTo(long r2) throws java.lang.IllegalStateException {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            r0.seekTo(r2)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setAudioStreamType(int r2) {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            r0.setAudioStreamType(r2)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(android.content.Context r2, android.net.Uri r3) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            r0.setDataSource(r2, r3)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    @android.annotation.TargetApi(14)
    public void setDataSource(android.content.Context r2, android.net.Uri r3, java.util.Map<java.lang.String, java.lang.String> r4) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            r0.setDataSource(r2, r3, r4)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(java.io.FileDescriptor r2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            r0.setDataSource(r2)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(java.lang.String r2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            r0.setDataSource(r2)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(tv.danmaku.ijk.media.player.misc.IMediaDataSource r2) {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            r0.setDataSource(r2)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDisplay(android.view.SurfaceHolder r2) {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            r0.setDisplay(r2)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setKeepInBackground(boolean r2) {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            r0.setKeepInBackground(r2)
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
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            r0.setLooping(r2)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnBufferingUpdateListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener r3) {
            r2 = this;
            if (r3 == 0) goto Ld
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.mBackEndMediaPlayer
            tv.danmaku.ijk.media.player.MediaPlayerProxy$3 r1 = new tv.danmaku.ijk.media.player.MediaPlayerProxy$3
            r1.<init>(r2, r3)
            r0.setOnBufferingUpdateListener(r1)
            return
        Ld:
            tv.danmaku.ijk.media.player.IMediaPlayer r3 = r2.mBackEndMediaPlayer
            r0 = 0
            r3.setOnBufferingUpdateListener(r0)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnCompletionListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener r3) {
            r2 = this;
            if (r3 == 0) goto Ld
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.mBackEndMediaPlayer
            tv.danmaku.ijk.media.player.MediaPlayerProxy$2 r1 = new tv.danmaku.ijk.media.player.MediaPlayerProxy$2
            r1.<init>(r2, r3)
            r0.setOnCompletionListener(r1)
            return
        Ld:
            tv.danmaku.ijk.media.player.IMediaPlayer r3 = r2.mBackEndMediaPlayer
            r0 = 0
            r3.setOnCompletionListener(r0)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnErrorListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener r3) {
            r2 = this;
            if (r3 == 0) goto Ld
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.mBackEndMediaPlayer
            tv.danmaku.ijk.media.player.MediaPlayerProxy$6 r1 = new tv.danmaku.ijk.media.player.MediaPlayerProxy$6
            r1.<init>(r2, r3)
            r0.setOnErrorListener(r1)
            return
        Ld:
            tv.danmaku.ijk.media.player.IMediaPlayer r3 = r2.mBackEndMediaPlayer
            r0 = 0
            r3.setOnErrorListener(r0)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnInfoListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener r3) {
            r2 = this;
            if (r3 == 0) goto Ld
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.mBackEndMediaPlayer
            tv.danmaku.ijk.media.player.MediaPlayerProxy$7 r1 = new tv.danmaku.ijk.media.player.MediaPlayerProxy$7
            r1.<init>(r2, r3)
            r0.setOnInfoListener(r1)
            return
        Ld:
            tv.danmaku.ijk.media.player.IMediaPlayer r3 = r2.mBackEndMediaPlayer
            r0 = 0
            r3.setOnInfoListener(r0)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnPreparedListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener r3) {
            r2 = this;
            if (r3 == 0) goto Ld
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.mBackEndMediaPlayer
            tv.danmaku.ijk.media.player.MediaPlayerProxy$1 r1 = new tv.danmaku.ijk.media.player.MediaPlayerProxy$1
            r1.<init>(r2, r3)
            r0.setOnPreparedListener(r1)
            return
        Ld:
            tv.danmaku.ijk.media.player.IMediaPlayer r3 = r2.mBackEndMediaPlayer
            r0 = 0
            r3.setOnPreparedListener(r0)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnSeekCompleteListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener r3) {
            r2 = this;
            if (r3 == 0) goto Ld
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.mBackEndMediaPlayer
            tv.danmaku.ijk.media.player.MediaPlayerProxy$4 r1 = new tv.danmaku.ijk.media.player.MediaPlayerProxy$4
            r1.<init>(r2, r3)
            r0.setOnSeekCompleteListener(r1)
            return
        Ld:
            tv.danmaku.ijk.media.player.IMediaPlayer r3 = r2.mBackEndMediaPlayer
            r0 = 0
            r3.setOnSeekCompleteListener(r0)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnTimedTextListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener r3) {
            r2 = this;
            if (r3 == 0) goto Ld
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.mBackEndMediaPlayer
            tv.danmaku.ijk.media.player.MediaPlayerProxy$8 r1 = new tv.danmaku.ijk.media.player.MediaPlayerProxy$8
            r1.<init>(r2, r3)
            r0.setOnTimedTextListener(r1)
            return
        Ld:
            tv.danmaku.ijk.media.player.IMediaPlayer r3 = r2.mBackEndMediaPlayer
            r0 = 0
            r3.setOnTimedTextListener(r0)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnVideoSizeChangedListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener r3) {
            r2 = this;
            if (r3 == 0) goto Ld
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.mBackEndMediaPlayer
            tv.danmaku.ijk.media.player.MediaPlayerProxy$5 r1 = new tv.danmaku.ijk.media.player.MediaPlayerProxy$5
            r1.<init>(r2, r3)
            r0.setOnVideoSizeChangedListener(r1)
            return
        Ld:
            tv.danmaku.ijk.media.player.IMediaPlayer r3 = r2.mBackEndMediaPlayer
            r0 = 0
            r3.setOnVideoSizeChangedListener(r0)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean r2) {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            r0.setScreenOnWhilePlaying(r2)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    @android.annotation.TargetApi(14)
    public void setSurface(android.view.Surface r2) {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            r0.setSurface(r2)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setVolume(float r2, float r3) {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            r0.setVolume(r2, r3)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setWakeMode(android.content.Context r2, int r3) {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            r0.setWakeMode(r2, r3)
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void start() throws java.lang.IllegalStateException {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            r0.start()
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void stop() throws java.lang.IllegalStateException {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.mBackEndMediaPlayer
            r0.stop()
            return
    }
}
