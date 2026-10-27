package com.kwad.components.ad.reward.m;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.ad.k.a<com.kwad.components.core.video.i> implements com.kwad.components.ad.reward.g.a {
    private com.kwad.components.core.h.c Bg;

    public b(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3) {
            r2 = this;
            r2.<init>(r3)
            com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)
            long r0 = com.kwad.sdk.core.response.b.a.M(r3)
            com.kwad.components.core.h.c r3 = new com.kwad.components.core.h.c
            r3.<init>()
            r2.Bg = r3
            r3.E(r0)
            return
    }

    public final android.widget.FrameLayout T(android.content.Context r3) {
            r2 = this;
            com.kwad.components.core.h.c r0 = r2.Bg
            android.widget.FrameLayout r3 = r0.getImagePlayerView(r3)
            com.kwad.components.core.h.c r0 = r2.Bg
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            r0.setImageScaleType(r1)
            return r3
    }

    @Override // com.kwad.components.ad.k.a
    public final void a(com.kwad.components.core.video.i r2) {
            r1 = this;
            com.kwad.components.core.h.c r0 = r1.Bg
            r0.d(r2)
            return
    }

    @Override // com.kwad.components.ad.k.a
    public final void b(com.kwad.components.core.video.i r2) {
            r1 = this;
            com.kwad.components.core.h.c r0 = r1.Bg
            r0.c(r2)
            return
    }

    @Override // com.kwad.components.ad.k.a
    public final long getPlayDuration() {
            r2 = this;
            com.kwad.components.core.h.c r0 = r2.Bg
            long r0 = r0.getPlayDuration()
            return r0
    }

    @Override // com.kwad.components.ad.reward.g.a
    public final void hd() {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.reward.g.a
    public final void he() {
            r0 = this;
            r0.resume()
            return
    }

    @Override // com.kwad.components.ad.reward.g.a
    public final void hf() {
            r0 = this;
            r0.pause()
            return
    }

    @Override // com.kwad.components.ad.reward.g.a
    public final void hg() {
            r1 = this;
            com.kwad.components.core.h.c r0 = r1.Bg
            r0.destroy()
            return
    }

    public final void kS() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.util.List r0 = com.kwad.sdk.core.response.b.a.ba(r0)
            com.kwad.components.core.h.c r1 = r2.Bg
            r1.setURLs(r0)
            com.kwad.components.core.h.c r0 = r2.Bg
            r0.play()
            return
    }

    @Override // com.kwad.components.ad.k.a
    public final void pause() {
            r1 = this;
            com.kwad.components.core.h.c r0 = r1.Bg
            r0.pause()
            return
    }

    @Override // com.kwad.components.ad.k.a
    public final void release() {
            r1 = this;
            super.release()
            com.kwad.components.core.h.c r0 = r1.Bg
            r0.destroy()
            return
    }

    @Override // com.kwad.components.ad.k.a
    public final void resume() {
            r1 = this;
            com.kwad.components.core.h.c r0 = r1.Bg
            r0.resume()
            return
    }

    @Override // com.kwad.components.ad.k.a
    public final void skipToEnd() {
            r1 = this;
            com.kwad.components.core.h.c r0 = r1.Bg
            r0.skipToEnd()
            return
    }
}
