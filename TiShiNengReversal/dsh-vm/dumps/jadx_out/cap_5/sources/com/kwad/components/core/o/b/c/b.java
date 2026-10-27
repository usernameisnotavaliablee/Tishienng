package com.kwad.components.core.o.b.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class b extends com.kwad.components.offline.api.core.video.BaseKsMediaPlayerView {
    private com.kwad.components.core.video.DetailVideoView SB;


    public b(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayerView
    public final void adaptVideoSize(int r2, int r3) {
            r1 = this;
            com.kwad.components.core.video.DetailVideoView r0 = r1.SB
            r0.adaptVideoSize(r2, r3)
            return
    }

    public final com.kwad.components.core.o.b.c.b b(@androidx.annotation.NonNull com.kwad.components.core.video.DetailVideoView r1) {
            r0 = this;
            com.kwad.sdk.utils.ax.checkNotNull(r1)
            r0.addView(r1)
            r0.SB = r1
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayerView
    public final void fixWidth(boolean r2) {
            r1 = this;
            com.kwad.components.core.video.DetailVideoView r0 = r1.SB
            r0.fixWidth(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayerView
    public final int getTextureViewGravity() {
            r1 = this;
            com.kwad.components.core.video.DetailVideoView r0 = r1.SB
            int r0 = r0.getTextureViewGravity()
            return r0
    }

    public final com.kwad.components.core.video.DetailVideoView qI() {
            r1 = this;
            com.kwad.components.core.video.DetailVideoView r0 = r1.SB
            return r0
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayerView
    public final void setAd(boolean r2) {
            r1 = this;
            com.kwad.components.core.video.DetailVideoView r0 = r1.SB
            r0.setAd(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayerView
    public final void setClickListener(com.kwad.components.offline.api.core.video.IKsMediaPlayerView.VideoViewClickListener r3) {
            r2 = this;
            com.kwad.components.core.video.DetailVideoView r0 = r2.SB
            if (r3 != 0) goto L6
            r3 = 0
            goto Lc
        L6:
            com.kwad.components.core.o.b.c.b$1 r1 = new com.kwad.components.core.o.b.c.b$1
            r1.<init>(r2, r3)
            r3 = r1
        Lc:
            r0.setClickListener(r3)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayerView
    public final void setForce(boolean r2) {
            r1 = this;
            com.kwad.components.core.video.DetailVideoView r0 = r1.SB
            r0.setForce(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayerView
    public final void setHorizontalVideo(boolean r2) {
            r1 = this;
            com.kwad.components.core.video.DetailVideoView r0 = r1.SB
            r0.setHorizontalVideo(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayerView
    public final void setMediaPlayer(com.kwad.components.offline.api.core.video.IKsMediaPlayer r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.kwad.components.core.o.b.c.a
            if (r0 == 0) goto L10
            com.kwad.components.core.video.DetailVideoView r0 = r1.SB
            com.kwad.components.core.o.b.c.a r2 = (com.kwad.components.core.o.b.c.a) r2
            com.kwad.components.core.video.b r2 = r2.qG()
            r0.setMediaPlayer(r2)
            return
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "mediaPlayer not instanceof KsMediaPlayer"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayerView
    public final void setRadius(float r2) {
            r1 = this;
            com.kwad.components.core.video.DetailVideoView r0 = r1.SB
            r0.setRadius(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayerView
    public final void updateTextureViewGravity(int r2) {
            r1 = this;
            com.kwad.components.core.video.DetailVideoView r0 = r1.SB
            r0.updateTextureViewGravity(r2)
            return
    }
}
