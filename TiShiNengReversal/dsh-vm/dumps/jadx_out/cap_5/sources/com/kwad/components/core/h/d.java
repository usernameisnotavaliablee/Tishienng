package com.kwad.components.core.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d implements com.kwad.components.offline.api.core.imageplayer.IImagePlayer {
    private com.kwad.components.core.h.c QQ;

    public d() {
            r1 = this;
            r1.<init>()
            com.kwad.components.core.h.c r0 = new com.kwad.components.core.h.c
            r0.<init>()
            r1.QQ = r0
            return
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void destroy() {
            r1 = this;
            com.kwad.components.core.h.c r0 = r1.QQ
            r0.destroy()
            return
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final android.widget.FrameLayout getImagePlayerView(android.content.Context r2) {
            r1 = this;
            com.kwad.components.core.h.c r0 = r1.QQ
            android.widget.FrameLayout r2 = r0.getImagePlayerView(r2)
            return r2
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void pause() {
            r1 = this;
            com.kwad.components.core.h.c r0 = r1.QQ
            r0.pause()
            return
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void play() {
            r1 = this;
            com.kwad.components.core.h.c r0 = r1.QQ
            r0.play()
            return
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void prepareToPlay() {
            r0 = this;
            return
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void registerMediaPlayStateListener(com.kwad.components.offline.api.core.video.listener.OfflineMediaPlayStateListener r2) {
            r1 = this;
            com.kwad.components.core.h.c r0 = r1.QQ
            com.kwad.components.core.video.i r2 = com.kwad.components.core.o.b.c.d.a(r2)
            r0.c(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void resume() {
            r1 = this;
            com.kwad.components.core.h.c r0 = r1.QQ
            r0.resume()
            return
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void setDuration(long r4) {
            r3 = this;
            com.kwad.components.core.h.c r0 = r3.QQ
            r1 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r1
            r0.E(r4)
            return
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void setEnableCache(boolean r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void setHorizontalGravity(int r2) {
            r1 = this;
            com.kwad.components.core.h.c r0 = r1.QQ
            r0.setHorizontalGravity(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void setImageResize(int r2) {
            r1 = this;
            if (r2 == 0) goto L24
            r0 = 1
            if (r2 == r0) goto L1c
            r0 = 2
            if (r2 == r0) goto L14
            r0 = 3
            if (r2 == r0) goto Lc
            return
        Lc:
            com.kwad.components.core.h.c r2 = r1.QQ
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
            r2.setImageScaleType(r0)
            return
        L14:
            com.kwad.components.core.h.c r2 = r1.QQ
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
            r2.setImageScaleType(r0)
            return
        L1c:
            com.kwad.components.core.h.c r2 = r1.QQ
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r2.setImageScaleType(r0)
            return
        L24:
            com.kwad.components.core.h.c r2 = r1.QQ
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r2.setImageScaleType(r0)
            return
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void setRadius(float r2, float r3, float r4, float r5) {
            r1 = this;
            com.kwad.components.core.h.c r0 = r1.QQ
            r0.setRadius(r2, r3, r4, r5)
            return
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void setSpeed(float r2) {
            r1 = this;
            com.kwad.components.core.h.c r0 = r1.QQ
            r0.setSpeed(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void setURLs(java.util.List<java.lang.String> r2) {
            r1 = this;
            com.kwad.components.core.h.c r0 = r1.QQ
            r0.setURLs(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void setVerticalGravity(int r2) {
            r1 = this;
            com.kwad.components.core.h.c r0 = r1.QQ
            r0.setVerticalGravity(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void stop() {
            r1 = this;
            com.kwad.components.core.h.c r0 = r1.QQ
            r0.stop()
            return
    }

    @Override // com.kwad.components.offline.api.core.imageplayer.IImagePlayer
    public final void unregisterMediaPlayStateListener(com.kwad.components.offline.api.core.video.listener.OfflineMediaPlayStateListener r2) {
            r1 = this;
            com.kwad.components.core.h.c r0 = r1.QQ
            com.kwad.components.core.video.i r2 = com.kwad.components.core.o.b.c.d.a(r2)
            r0.d(r2)
            return
    }
}
