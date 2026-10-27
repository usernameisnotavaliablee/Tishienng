package pl.droidsonroids.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class p implements android.view.TextureView.SurfaceTextureListener {
    private final pl.droidsonroids.gif.GifTextureView.b a;

    p(pl.droidsonroids.gif.GifTextureView.b r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r1, int r2, int r3) {
            r0 = this;
            android.view.Surface r2 = new android.view.Surface
            r2.<init>(r1)
            r1 = 0
            android.graphics.Canvas r1 = r2.lockCanvas(r1)
            pl.droidsonroids.gif.GifTextureView$b r3 = r0.a
            r3.a(r1)
            r2.unlockCanvasAndPost(r1)
            r2.release()
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture r1) {
            r0 = this;
            return
    }
}
