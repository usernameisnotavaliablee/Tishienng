package com.kwad.components.ad.draw.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.sdk.mvp.a {
    private boolean dA;

    @androidx.annotation.Nullable
    public com.kwad.components.ad.draw.c.a dB;

    @androidx.annotation.Nullable
    public com.kwad.components.offline.api.core.adlive.IAdLivePlayModule dC;

    @androidx.annotation.Nullable
    public com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView dD;

    @androidx.annotation.NonNull
    public com.kwad.components.ad.draw.presenter.b.a dE;

    @androidx.annotation.Nullable
    public com.kwad.components.ad.l.b dF;

    @androidx.annotation.Nullable
    public com.kwad.sdk.api.KsDrawAd.AdInteractionListener dh;

    @androidx.annotation.Nullable
    public com.kwad.components.core.e.d.c mApkDownloadHelper;

    @androidx.annotation.NonNull
    public com.kwad.sdk.core.view.AdBaseFrameLayout mRootContainer;


    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    private void a(int r2, com.kwad.sdk.core.adlog.c.b r3) {
            r1 = this;
            if (r3 != 0) goto L7
            com.kwad.sdk.core.adlog.c.b r3 = new com.kwad.sdk.core.adlog.c.b
            r3.<init>()
        L7:
            r3.dd(r2)
            com.kwad.sdk.core.view.AdBaseFrameLayout r2 = r1.mRootContainer
            com.kwad.sdk.utils.aj$a r2 = r2.getTouchCoords()
            r3.f(r2)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.mAdTemplate
            r0 = 0
            com.kwad.sdk.core.adlog.c.a(r2, r3, r0)
            com.kwad.sdk.api.KsDrawAd$AdInteractionListener r2 = r1.dh
            if (r2 == 0) goto L20
            r2.onAdClicked()
        L20:
            boolean r2 = r1.dA
            if (r2 == 0) goto L25
            return
        L25:
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.mAdTemplate
            boolean r3 = com.kwad.sdk.core.response.b.b.de(r2)
            r0 = 1
            if (r3 == 0) goto L30
            r3 = 2
            goto L31
        L30:
            r3 = 1
        L31:
            com.kwad.components.ad.draw.a.c.b(r2, r0, r3)
            r1.dA = r0
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.draw.b.b r0, int r1, com.kwad.sdk.core.adlog.c.b r2) {
            r2 = 0
            r0.a(r1, r2)
            return
    }

    public final void a(int r3, android.content.Context r4, int r5, int r6) {
            r2 = this;
            com.kwad.components.core.e.d.a$a r0 = new com.kwad.components.core.e.d.a$a
            r0.<init>(r4)
            com.kwad.sdk.core.response.model.AdTemplate r4 = r2.mAdTemplate
            com.kwad.components.core.e.d.a$a r4 = r0.aB(r4)
            com.kwad.components.core.e.d.c r0 = r2.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r4 = r4.b(r0)
            r0 = 0
            com.kwad.components.core.e.d.a$a r4 = r4.aq(r0)
            com.kwad.components.core.e.d.a$a r4 = r4.aB(r6)
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r6 = r2.dC
            if (r6 != 0) goto L21
            r0 = 0
            goto L25
        L21:
            long r0 = r6.getPlayDuration()
        L25:
            com.kwad.components.core.e.d.a$a r4 = r4.A(r0)
            r6 = 1
            com.kwad.components.core.e.d.a$a r4 = r4.ay(r6)
            com.kwad.components.core.e.d.a$a r4 = r4.aA(r5)
            com.kwad.components.core.e.d.a$a r3 = r4.az(r3)
            com.kwad.components.ad.draw.b.b$1 r4 = new com.kwad.components.ad.draw.b.b$1
            r4.<init>(r2, r5)
            com.kwad.components.core.e.d.a$a r3 = r3.a(r4)
            com.kwad.components.core.e.d.a.a(r3)
            return
    }

    @Override // com.kwad.sdk.mvp.a
    public final void release() {
            r2 = this;
            com.kwad.components.core.e.d.c r0 = r2.mApkDownloadHelper
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r2.dC
            r1 = 0
            if (r0 == 0) goto L11
            r0.release()
            r2.dC = r1
        L11:
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r0 = r2.dD
            if (r0 == 0) goto L1a
            r0.onDestroy()
            r2.dD = r1
        L1a:
            com.kwad.components.ad.draw.c.a r0 = r2.dB
            if (r0 == 0) goto L21
            r0.release()
        L21:
            return
    }
}
