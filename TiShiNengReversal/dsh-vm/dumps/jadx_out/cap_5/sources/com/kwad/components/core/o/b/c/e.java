package com.kwad.components.core.o.b.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e implements com.kwad.components.offline.api.core.video.IVideo {
    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.offline.api.core.video.IVideo
    public final com.kwad.components.offline.api.core.video.IKsMediaPlayer createMediaPlayer(com.kwad.components.offline.api.core.video.IKsMediaPlayerView r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.kwad.components.core.o.b.c.b
            if (r0 == 0) goto L19
            com.kwad.components.core.o.b.c.a r0 = new com.kwad.components.core.o.b.c.a
            r0.<init>()
            com.kwad.components.core.video.b r1 = new com.kwad.components.core.video.b
            com.kwad.components.core.o.b.c.b r3 = (com.kwad.components.core.o.b.c.b) r3
            com.kwad.components.core.video.DetailVideoView r3 = r3.qI()
            r1.<init>(r3)
            com.kwad.components.core.o.b.c.a r3 = r0.a(r1)
            return r3
        L19:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "playerView not instanceof KsMediaPlayerView"
            r3.<init>(r0)
            throw r3
    }

    @Override // com.kwad.components.offline.api.core.video.IVideo
    public final com.kwad.components.offline.api.core.video.BaseKsMediaPlayerView createMediaPlayerView(android.content.Context r4) {
            r3 = this;
            com.kwad.components.core.video.DetailVideoView r0 = new com.kwad.components.core.video.DetailVideoView
            r0.<init>(r4)
            r1 = 1
            r0.setAd(r1)
            r0.setFillXY(r1)
            r2 = 17
            r0.updateTextureViewGravity(r2)
            r0.g(r1, r1)
            com.kwad.components.core.o.b.c.b r1 = new com.kwad.components.core.o.b.c.b
            r1.<init>(r4)
            com.kwad.components.core.o.b.c.b r4 = r1.b(r0)
            return r4
    }
}
