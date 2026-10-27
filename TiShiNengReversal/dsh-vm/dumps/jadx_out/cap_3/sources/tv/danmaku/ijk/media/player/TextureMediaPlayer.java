package tv.danmaku.ijk.media.player;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(14)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class TextureMediaPlayer extends tv.danmaku.ijk.media.player.MediaPlayerProxy implements tv.danmaku.ijk.media.player.IMediaPlayer, tv.danmaku.ijk.media.player.ISurfaceTextureHolder {
    private android.graphics.SurfaceTexture mSurfaceTexture;
    private tv.danmaku.ijk.media.player.ISurfaceTextureHost mSurfaceTextureHost;

    public TextureMediaPlayer(tv.danmaku.ijk.media.player.IMediaPlayer r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // tv.danmaku.ijk.media.player.ISurfaceTextureHolder
    public android.graphics.SurfaceTexture getSurfaceTexture() {
            r1 = this;
            android.graphics.SurfaceTexture r0 = r1.mSurfaceTexture
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.MediaPlayerProxy, tv.danmaku.ijk.media.player.IMediaPlayer
    public void release() {
            r0 = this;
            super.release()
            r0.releaseSurfaceTexture()
            return
    }

    public void releaseSurfaceTexture() {
            r2 = this;
            android.graphics.SurfaceTexture r0 = r2.mSurfaceTexture
            if (r0 == 0) goto L12
            tv.danmaku.ijk.media.player.ISurfaceTextureHost r1 = r2.mSurfaceTextureHost
            if (r1 == 0) goto Lc
            r1.releaseSurfaceTexture(r0)
            goto Lf
        Lc:
            r0.release()
        Lf:
            r0 = 0
            r2.mSurfaceTexture = r0
        L12:
            return
    }

    @Override // tv.danmaku.ijk.media.player.MediaPlayerProxy, tv.danmaku.ijk.media.player.IMediaPlayer
    public void reset() {
            r0 = this;
            super.reset()
            r0.releaseSurfaceTexture()
            return
    }

    @Override // tv.danmaku.ijk.media.player.MediaPlayerProxy, tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDisplay(android.view.SurfaceHolder r2) {
            r1 = this;
            android.graphics.SurfaceTexture r0 = r1.mSurfaceTexture
            if (r0 != 0) goto L7
            super.setDisplay(r2)
        L7:
            return
    }

    @Override // tv.danmaku.ijk.media.player.MediaPlayerProxy, tv.danmaku.ijk.media.player.IMediaPlayer
    public void setSurface(android.view.Surface r2) {
            r1 = this;
            android.graphics.SurfaceTexture r0 = r1.mSurfaceTexture
            if (r0 != 0) goto L7
            super.setSurface(r2)
        L7:
            return
    }

    @Override // tv.danmaku.ijk.media.player.ISurfaceTextureHolder
    public void setSurfaceTexture(android.graphics.SurfaceTexture r2) {
            r1 = this;
            android.graphics.SurfaceTexture r0 = r1.mSurfaceTexture
            if (r0 != r2) goto L5
            return
        L5:
            r1.releaseSurfaceTexture()
            r1.mSurfaceTexture = r2
            if (r2 != 0) goto L11
            r2 = 0
            super.setSurface(r2)
            return
        L11:
            android.view.Surface r0 = new android.view.Surface
            r0.<init>(r2)
            super.setSurface(r0)
            return
    }

    @Override // tv.danmaku.ijk.media.player.ISurfaceTextureHolder
    public void setSurfaceTextureHost(tv.danmaku.ijk.media.player.ISurfaceTextureHost r1) {
            r0 = this;
            r0.mSurfaceTextureHost = r1
            return
    }
}
