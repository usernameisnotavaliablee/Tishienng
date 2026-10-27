package com.kwad.components.ad.reward.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.k.a<com.kwad.components.core.video.h> {
    private com.kwad.components.offline.api.core.adlive.IAdLivePlayModule hR;
    private java.util.List<com.kwad.components.core.video.h> uC;
    private long uD;
    private com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener uE;


    public a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3, com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r4) {
            r2 = this;
            r2.<init>(r3)
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.uC = r0
            r0 = 30000(0x7530, double:1.4822E-319)
            r2.uD = r0
            com.kwad.components.ad.reward.f.a$1 r0 = new com.kwad.components.ad.reward.f.a$1
            r0.<init>(r2)
            r2.uE = r0
            r2.hR = r4
            int r4 = com.kwad.sdk.core.response.b.e.ef(r3)
            r0 = 2
            if (r4 != r0) goto L28
            com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)
            long r3 = com.kwad.sdk.core.response.b.a.ag(r3)
            r2.uD = r3
        L28:
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r3 = r2.hR
            com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener r4 = r2.uE
            r3.registerAdLivePlayStateListener(r4)
            return
    }

    static /* synthetic */ long a(com.kwad.components.ad.reward.f.a r2) {
            long r0 = r2.uD
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.f.a r0, com.kwad.sdk.g.a r1) {
            r0.a(r1)
            return
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(com.kwad.components.core.video.h r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<com.kwad.components.core.video.h> r0 = r1.uC
            r0.add(r2)
        L7:
            return
    }

    private void a(com.kwad.sdk.g.a<com.kwad.components.core.video.h> r3) {
            r2 = this;
            if (r3 == 0) goto L18
            java.util.List<com.kwad.components.core.video.h> r0 = r2.uC
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.video.h r1 = (com.kwad.components.core.video.h) r1
            r3.accept(r1)
            goto L8
        L18:
            return
    }

    /* renamed from: b, reason: avoid collision after fix types in other method */
    private void b2(com.kwad.components.core.video.h r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<com.kwad.components.core.video.h> r0 = r1.uC
            r0.remove(r2)
        L7:
            return
    }

    private void ie() {
            r2 = this;
            java.util.List<com.kwad.components.core.video.h> r0 = r2.uC     // Catch: java.lang.Throwable -> L12
            r0.clear()     // Catch: java.lang.Throwable -> L12
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r2.hR     // Catch: java.lang.Throwable -> L12
            com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener r1 = r2.uE     // Catch: java.lang.Throwable -> L12
            r0.unRegisterAdLivePlayStateListener(r1)     // Catch: java.lang.Throwable -> L12
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r2.hR     // Catch: java.lang.Throwable -> L12
            r0.onDestroy()     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
            return
    }

    @Override // com.kwad.components.ad.k.a
    public final /* synthetic */ void a(com.kwad.components.core.video.h r1) {
            r0 = this;
            com.kwad.components.core.video.h r1 = (com.kwad.components.core.video.h) r1
            r0.b2(r1)
            return
    }

    @Override // com.kwad.components.ad.k.a
    public final /* synthetic */ void b(com.kwad.components.core.video.h r1) {
            r0 = this;
            com.kwad.components.core.video.h r1 = (com.kwad.components.core.video.h) r1
            r0.a2(r1)
            return
    }

    public final com.kwad.components.offline.api.core.adlive.model.LiveShopItemInfo getCurrentShowShopItemInfo() {
            r1 = this;
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r1.hR
            com.kwad.components.offline.api.core.adlive.model.LiveShopItemInfo r0 = r0.getCurrentShowShopItemInfo()
            return r0
    }

    @Override // com.kwad.components.ad.k.a
    public final long getPlayDuration() {
            r2 = this;
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r2.hR
            long r0 = r0.getPlayDuration()
            return r0
    }

    public final void onPause() {
            r1 = this;
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r1.hR
            r0.onPause()
            return
    }

    public final void onResume() {
            r1 = this;
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r1.hR
            r0.onResume()
            return
    }

    @Override // com.kwad.components.ad.k.a
    public final void pause() {
            r1 = this;
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r1.hR
            r0.pause()
            return
    }

    public final void registerAdLiveCallerContextListener(com.kwad.components.offline.api.core.adlive.listener.AdLiveCallerContextListener r2) {
            r1 = this;
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r1.hR
            r0.registerAdLiveCallerContextListener(r2)
            return
    }

    @Override // com.kwad.components.ad.k.a
    public final void release() {
            r0 = this;
            super.release()
            r0.ie()
            return
    }

    public final void removeInterceptor(com.kwad.components.offline.api.core.adlive.listener.OnAdLiveResumeInterceptor r2) {
            r1 = this;
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r1.hR
            r0.removeInterceptor(r2)
            return
    }

    @Override // com.kwad.components.ad.k.a
    public final void resume() {
            r1 = this;
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r1.hR
            r0.resume()
            return
    }

    @Override // com.kwad.components.ad.k.a
    public final void setAudioEnabled(boolean r2, boolean r3) {
            r1 = this;
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r1.hR
            r0.setAudioEnabled(r2, r3)
            return
    }

    @Override // com.kwad.components.ad.k.a
    public final void skipToEnd() {
            r1 = this;
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r1.hR
            r0.skipToEnd()
            return
    }

    public final void unRegisterAdLiveCallerContextListener(com.kwad.components.offline.api.core.adlive.listener.AdLiveCallerContextListener r2) {
            r1 = this;
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r1.hR
            r0.unRegisterAdLiveCallerContextListener(r2)
            return
    }
}
