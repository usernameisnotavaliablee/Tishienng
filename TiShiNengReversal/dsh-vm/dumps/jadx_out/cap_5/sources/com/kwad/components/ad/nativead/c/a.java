package com.kwad.components.ad.nativead.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.k.b {
    private com.kwad.sdk.api.KsAdVideoPlayConfig bU;
    private com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener cB;
    private boolean cp;
    private com.kwad.components.core.k.a.b fD;
    private com.kwad.components.core.widget.a.b fg;
    private final com.kwad.sdk.core.j.c fo;
    private boolean hasNoCache;
    private final com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private android.content.Context mContext;
    private boolean pW;
    private boolean pX;
    private com.kwad.components.core.video.m pY;
    private int pZ;
    private long qa;







    public a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2, @androidx.annotation.NonNull com.kwad.components.core.widget.a.b r3, @androidx.annotation.NonNull com.kwad.components.core.video.DetailVideoView r4, @androidx.annotation.Nullable com.kwad.sdk.api.KsAdVideoPlayConfig r5) {
            r1 = this;
            r1.<init>(r2, r4)
            r0 = 0
            r1.hasNoCache = r0
            com.kwad.components.ad.nativead.c.a$4 r0 = new com.kwad.components.ad.nativead.c.a$4
            r0.<init>(r1)
            r1.fo = r0
            com.kwad.components.ad.nativead.c.a$6 r0 = new com.kwad.components.ad.nativead.c.a$6
            r0.<init>(r1)
            r1.cB = r0
            r1.fg = r3
            com.kwad.sdk.core.response.model.AdTemplate r3 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)
            r1.mAdInfo = r3
            boolean r0 = r5 instanceof com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl
            if (r0 == 0) goto L32
            r0 = r5
            com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r0 = (com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl) r0
            int r0 = r0.getVideoSoundValue()
            if (r0 == 0) goto L32
            boolean r3 = r5.isVideoSoundEnable()
            r1.pW = r3
            goto L38
        L32:
            boolean r3 = com.kwad.sdk.core.response.b.a.ca(r3)
            r1.pW = r3
        L38:
            r1.bU = r5
            android.content.Context r3 = r4.getContext()
            r1.mContext = r3
            if (r5 == 0) goto L4d
            boolean r3 = r5.isNoCache()     // Catch: java.lang.Throwable -> L49
            r1.hasNoCache = r3     // Catch: java.lang.Throwable -> L49
            goto L4d
        L49:
            r3 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r3)
        L4d:
            com.kwad.components.ad.nativead.c.a$1 r3 = new com.kwad.components.ad.nativead.c.a$1
            r3.<init>(r1, r2)
            r1.pY = r3
            com.kwad.components.core.video.b r2 = r1.LU
            r2.c(r3)
            r1.bs()
            com.kwad.components.core.video.b r2 = r1.LU
            com.kwad.components.ad.nativead.c.a$2 r3 = new com.kwad.components.ad.nativead.c.a$2
            r3.<init>(r1)
            r2.a(r3)
            return
    }

    static /* synthetic */ int a(com.kwad.components.ad.nativead.c.a r0, int r1) {
            r1 = 3
            r0.pZ = r1
            return r1
    }

    static /* synthetic */ long a(com.kwad.components.ad.nativead.c.a r0, long r1) {
            r0.qa = r1
            return r1
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.nativead.c.a r0) {
            boolean r0 = r0.fK()
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.nativead.c.a r0, boolean r1) {
            boolean r0 = r0.h(r1)
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.a.b b(com.kwad.components.ad.nativead.c.a r0) {
            com.kwad.components.core.widget.a.b r0 = r0.fg
            return r0
    }

    static /* synthetic */ void b(com.kwad.components.ad.nativead.c.a r0, boolean r1) {
            r0.setAudioEnabled(r1)
            return
    }

    private void bs() {
            r4 = this;
            com.kwad.sdk.contentalliance.a.a.b$a r0 = new com.kwad.sdk.contentalliance.a.a.b$a
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            r0.<init>(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            java.lang.String r1 = com.kwad.sdk.core.response.b.e.en(r1)
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.dg(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            com.kwad.sdk.core.response.model.PhotoInfo r1 = com.kwad.sdk.core.response.b.e.em(r1)
            java.lang.String r1 = com.kwad.sdk.core.response.b.h.b(r1)
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.dh(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            com.kwad.sdk.core.response.model.VideoPlayerStatus r1 = r1.mVideoPlayerStatus
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.a(r1)
            boolean r1 = r4.hasNoCache
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.bo(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            com.kwad.sdk.contentalliance.a.a.a r1 = com.kwad.sdk.contentalliance.a.a.a.bQ(r1)
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.b(r1)
            com.kwad.sdk.contentalliance.a.a.b r0 = r0.El()
            com.kwad.components.core.video.b r1 = r4.LU
            r2 = 1
            com.kwad.components.core.video.DetailVideoView r3 = r4.mDetailVideoView
            r1.a(r0, r2, r2, r3)
            boolean r0 = r4.pW
            boolean r0 = r4.h(r0)
            r4.setAudioEnabled(r0)
            boolean r0 = r4.fK()
            if (r0 != 0) goto L53
            return
        L53:
            com.kwad.components.core.video.b r0 = r4.LU
            r0.prepareAsync()
            android.content.Context r0 = r4.mContext
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r1 = r4.cB
            r0.a(r1)
            return
    }

    static /* synthetic */ boolean c(com.kwad.components.ad.nativead.c.a r0) {
            boolean r0 = r0.fI()
            return r0
    }

    static /* synthetic */ boolean c(com.kwad.components.ad.nativead.c.a r0, boolean r1) {
            r1 = 0
            r0.cp = r1
            return r1
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate d(com.kwad.components.ad.nativead.c.a r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.core.video.b e(com.kwad.components.ad.nativead.c.a r0) {
            com.kwad.components.core.video.b r0 = r0.LU
            return r0
    }

    static /* synthetic */ com.kwad.components.core.k.a.b f(com.kwad.components.ad.nativead.c.a r0) {
            com.kwad.components.core.k.a$b r0 = r0.getCurrentVoiceItem()
            return r0
    }

    private boolean fI() {
            r2 = this;
            int r0 = r2.pZ
            r1 = 3
            if (r0 == r1) goto Lb
            r1 = 2
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    private void fJ() {
            r2 = this;
            int r0 = r2.pZ
            r1 = 1
            if (r0 == r1) goto L17
            r1 = 2
            if (r0 == r1) goto L13
            r1 = 3
            if (r0 == r1) goto Lf
            r2.resume()
            return
        Lf:
            r2.stop()
            return
        L13:
            r2.pause()
            return
        L17:
            r2.start()
            return
    }

    private boolean fK() {
            r5 = this;
            boolean r0 = r5.pX
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r5.bU
            boolean r2 = r0 instanceof com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl
            r3 = 0
            if (r2 == 0) goto L51
            com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r0 = (com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl) r0
            int r2 = r0.getVideoAutoPlayType()
            if (r2 != r1) goto L1c
            android.content.Context r0 = r5.mContext
            boolean r0 = com.kwad.sdk.utils.ao.isNetworkConnected(r0)
            return r0
        L1c:
            int r2 = r0.getVideoAutoPlayType()
            r4 = 2
            if (r2 != r4) goto L2a
            android.content.Context r0 = r5.mContext
            boolean r0 = com.kwad.sdk.utils.ao.isWifiConnected(r0)
            return r0
        L2a:
            int r2 = r0.getVideoAutoPlayType()
            r4 = 3
            if (r2 != r4) goto L32
            return r3
        L32:
            int r2 = r0.getDataFlowAutoStartValue()
            if (r2 == 0) goto L51
            android.content.Context r2 = r5.mContext
            boolean r2 = com.kwad.sdk.utils.ao.isWifiConnected(r2)
            if (r2 != 0) goto L50
            boolean r0 = r0.isDataFlowAutoStart()
            if (r0 == 0) goto L4f
            android.content.Context r0 = r5.mContext
            boolean r0 = com.kwad.sdk.utils.ao.isMobileConnected(r0)
            if (r0 == 0) goto L4f
            goto L50
        L4f:
            return r3
        L50:
            return r1
        L51:
            com.kwad.sdk.core.response.model.AdInfo r0 = r5.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.cc(r0)
            if (r0 == 0) goto L62
            android.content.Context r0 = r5.mContext
            boolean r0 = com.kwad.sdk.utils.ao.isNetworkConnected(r0)
            if (r0 == 0) goto L62
            return r1
        L62:
            com.kwad.sdk.core.response.model.AdInfo r0 = r5.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.cd(r0)
            if (r0 == 0) goto L73
            android.content.Context r0 = r5.mContext
            boolean r0 = com.kwad.sdk.utils.ao.isWifiConnected(r0)
            if (r0 == 0) goto L73
            return r1
        L73:
            return r3
    }

    static /* synthetic */ long g(com.kwad.components.ad.nativead.c.a r2) {
            long r0 = r2.qa
            return r0
    }

    private com.kwad.components.core.k.a.b getCurrentVoiceItem() {
            r2 = this;
            com.kwad.components.core.k.a$b r0 = r2.fD
            if (r0 != 0) goto L10
            com.kwad.components.core.k.a$b r0 = new com.kwad.components.core.k.a$b
            com.kwad.components.ad.nativead.c.a$5 r1 = new com.kwad.components.ad.nativead.c.a$5
            r1.<init>(r2)
            r0.<init>(r1)
            r2.fD = r0
        L10:
            com.kwad.components.core.k.a$b r0 = r2.fD
            return r0
    }

    static /* synthetic */ com.kwad.components.core.video.b h(com.kwad.components.ad.nativead.c.a r0) {
            com.kwad.components.core.video.b r0 = r0.LU
            return r0
    }

    private boolean h(boolean r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            com.kwad.components.core.k.a$b r3 = r2.fD
            if (r3 == 0) goto L14
            com.kwad.components.core.k.a.qp()
            com.kwad.components.core.k.a$b r3 = r2.fD
            boolean r3 = com.kwad.components.core.k.a.b(r3)
            if (r3 != 0) goto L14
            return r0
        L14:
            boolean r3 = com.kwad.sdk.core.config.e.hC()
            r1 = 1
            if (r3 != 0) goto L40
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            boolean r3 = r3.sX()
            if (r3 != 0) goto L32
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            boolean r3 = r3.aQ(r0)
            return r3
        L32:
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            boolean r3 = r3.sW()
            if (r3 != 0) goto L3f
            return r1
        L3f:
            return r0
        L40:
            boolean r3 = r2.cp
            if (r3 != 0) goto L50
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            boolean r3 = r3.aQ(r1)
            r2.cp = r3
        L50:
            boolean r3 = r2.cp
            return r3
    }

    static /* synthetic */ void i(com.kwad.components.ad.nativead.c.a r0) {
            r0.fJ()
            return
    }

    static /* synthetic */ com.kwad.components.core.k.a.b j(com.kwad.components.ad.nativead.c.a r0) {
            com.kwad.components.core.k.a$b r0 = r0.fD
            return r0
    }

    static /* synthetic */ boolean k(com.kwad.components.ad.nativead.c.a r0) {
            boolean r0 = r0.pW
            return r0
    }

    private void setAudioEnabled(boolean r2) {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.LU
            r0.setAudioEnabled(r2)
            return
    }

    private void start() {
            r1 = this;
            boolean r0 = r1.pX
            if (r0 == 0) goto L8
            r1.resume()
            return
        L8:
            r1.fL()
            return
    }

    private void stop() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.LU
            r0.complete()
            return
    }

    public final void V(int r1) {
            r0 = this;
            r0.pZ = r1
            com.kwad.components.core.widget.a.b r1 = r0.fg
            boolean r1 = r1.ae()
            if (r1 == 0) goto Ld
            r0.fJ()
        Ld:
            return
    }

    public final void bo() {
            r3 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.utils.n.eM(r0)
            com.kwad.components.core.video.b r0 = r3.LU
            com.kwad.sdk.core.video.a.c r0 = r0.tz()
            if (r0 != 0) goto L10
            r3.bs()
        L10:
            boolean r0 = r3.fK()
            if (r0 == 0) goto L3b
            com.kwad.components.core.widget.a.b r0 = r3.fg
            boolean r0 = r0.ae()
            if (r0 == 0) goto L3b
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.contentalliance.a.a.a r0 = com.kwad.sdk.contentalliance.a.a.a.bQ(r0)
            com.kwad.components.core.video.b r1 = r3.LU
            r1.a(r0)
            com.kwad.components.core.k.a r0 = com.kwad.components.core.k.a.qp()
            com.kwad.components.core.k.a$b r1 = r3.getCurrentVoiceItem()
            r0.a(r1)
            com.kwad.components.core.video.b r0 = r3.LU
            long r1 = r3.qa
            r0.start(r1)
        L3b:
            com.kwad.components.ad.nativead.c.a$3 r0 = new com.kwad.components.ad.nativead.c.a$3
            r0.<init>(r3)
            com.kwad.components.core.video.b r1 = r3.LU
            r1.c(r0)
            com.kwad.components.core.widget.a.b r0 = r3.fg
            com.kwad.sdk.core.j.c r1 = r3.fo
            r0.a(r1)
            return
    }

    public final void bq() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.sdk.utils.n.eK(r0)
            com.kwad.components.core.widget.a.b r0 = r2.fg
            com.kwad.sdk.core.j.c r1 = r2.fo
            r0.b(r1)
            com.kwad.components.core.video.b r0 = r2.LU
            r0.release()
            com.kwad.components.core.k.a r0 = com.kwad.components.core.k.a.qp()
            com.kwad.components.core.k.a$b r1 = r2.fD
            r0.c(r1)
            android.content.Context r0 = r2.mContext
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r1 = r2.cB
            r0.b(r1)
            return
    }

    public final void fL() {
            r3 = this;
            r0 = 1
            r3.pX = r0
            com.kwad.sdk.core.response.model.AdInfo r1 = r3.mAdInfo
            r1.isAllowVideoAutoPlay = r0
            com.kwad.components.core.widget.a.b r0 = r3.fg
            boolean r0 = r0.ae()
            if (r0 == 0) goto L31
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.utils.n.eL(r0)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.contentalliance.a.a.a r0 = com.kwad.sdk.contentalliance.a.a.a.bQ(r0)
            com.kwad.components.core.video.b r1 = r3.LU
            r1.a(r0)
            com.kwad.components.core.k.a r0 = com.kwad.components.core.k.a.qp()
            com.kwad.components.core.k.a$b r1 = r3.getCurrentVoiceItem()
            r0.a(r1)
            com.kwad.components.core.video.b r0 = r3.LU
            long r1 = r3.qa
            r0.start(r1)
        L31:
            return
    }

    @Override // com.kwad.components.ad.k.b, com.kwad.components.ad.k.a
    public final void resume() {
            r3 = this;
            com.kwad.components.core.k.a r0 = com.kwad.components.core.k.a.qp()
            com.kwad.components.core.k.a$b r1 = r3.getCurrentVoiceItem()
            r0.a(r1)
            boolean r0 = r3.pW
            boolean r0 = r3.h(r0)
            r3.setAudioEnabled(r0)
            boolean r0 = r3.fK()
            if (r0 != 0) goto L1b
            return
        L1b:
            com.kwad.components.core.video.b r0 = r3.LU
            long r1 = r3.qa
            r0.start(r1)
            return
    }
}
