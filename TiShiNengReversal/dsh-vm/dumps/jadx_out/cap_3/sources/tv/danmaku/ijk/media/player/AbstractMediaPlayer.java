package tv.danmaku.ijk.media.player;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class AbstractMediaPlayer implements tv.danmaku.ijk.media.player.IMediaPlayer {
    private tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener mOnBufferingUpdateListener;
    private tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener mOnCompletionListener;
    private tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener mOnErrorListener;
    private tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener mOnInfoListener;
    private tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener mOnPreparedListener;
    private tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    private tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener mOnTimedTextListener;
    private tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener mOnVideoSizeChangedListener;

    public AbstractMediaPlayer() {
            r0 = this;
            r0.<init>()
            return
    }

    protected final void notifyOnBufferingUpdate(int r2) {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer$OnBufferingUpdateListener r0 = r1.mOnBufferingUpdateListener
            if (r0 == 0) goto L7
            r0.onBufferingUpdate(r1, r2)
        L7:
            return
    }

    protected final void notifyOnCompletion() {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer$OnCompletionListener r0 = r1.mOnCompletionListener
            if (r0 == 0) goto L7
            r0.onCompletion(r1)
        L7:
            return
    }

    protected final boolean notifyOnError(int r2, int r3) {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer$OnErrorListener r0 = r1.mOnErrorListener
            if (r0 == 0) goto Lc
            boolean r2 = r0.onError(r1, r2, r3)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    protected final boolean notifyOnInfo(int r2, int r3) {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer$OnInfoListener r0 = r1.mOnInfoListener
            if (r0 == 0) goto Lc
            boolean r2 = r0.onInfo(r1, r2, r3)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    protected final void notifyOnPrepared() {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer$OnPreparedListener r0 = r1.mOnPreparedListener
            if (r0 == 0) goto L7
            r0.onPrepared(r1)
        L7:
            return
    }

    protected final void notifyOnSeekComplete() {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer$OnSeekCompleteListener r0 = r1.mOnSeekCompleteListener
            if (r0 == 0) goto L7
            r0.onSeekComplete(r1)
        L7:
            return
    }

    protected final void notifyOnTimedText(tv.danmaku.ijk.media.player.IjkTimedText r2) {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer$OnTimedTextListener r0 = r1.mOnTimedTextListener
            if (r0 == 0) goto L7
            r0.onTimedText(r1, r2)
        L7:
            return
    }

    protected final void notifyOnVideoSizeChanged(int r7, int r8, int r9, int r10) {
            r6 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer$OnVideoSizeChangedListener r0 = r6.mOnVideoSizeChangedListener
            if (r0 == 0) goto Lc
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.onVideoSizeChanged(r1, r2, r3, r4, r5)
        Lc:
            return
    }

    public void resetListeners() {
            r1 = this;
            r0 = 0
            r1.mOnPreparedListener = r0
            r1.mOnBufferingUpdateListener = r0
            r1.mOnCompletionListener = r0
            r1.mOnSeekCompleteListener = r0
            r1.mOnVideoSizeChangedListener = r0
            r1.mOnErrorListener = r0
            r1.mOnInfoListener = r0
            r1.mOnTimedTextListener = r0
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(tv.danmaku.ijk.media.player.misc.IMediaDataSource r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnBufferingUpdateListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener r1) {
            r0 = this;
            r0.mOnBufferingUpdateListener = r1
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnCompletionListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener r1) {
            r0 = this;
            r0.mOnCompletionListener = r1
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnErrorListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener r1) {
            r0 = this;
            r0.mOnErrorListener = r1
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnInfoListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener r1) {
            r0 = this;
            r0.mOnInfoListener = r1
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnPreparedListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener r1) {
            r0 = this;
            r0.mOnPreparedListener = r1
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnSeekCompleteListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener r1) {
            r0 = this;
            r0.mOnSeekCompleteListener = r1
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnTimedTextListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener r1) {
            r0 = this;
            r0.mOnTimedTextListener = r1
            return
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnVideoSizeChangedListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener r1) {
            r0 = this;
            r0.mOnVideoSizeChangedListener = r1
            return
    }
}
