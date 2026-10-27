package com.kwad.components.ad.reward.presenter.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a extends com.kwad.components.ad.reward.presenter.b implements com.kwad.components.ad.reward.e.g, com.kwad.components.ad.reward.e.j {
    public a() {
            r0 = this;
            r0.<init>()
            r0.dt()
            return
    }

    private int a(com.kwad.components.ad.reward.e.g r2) {
            r1 = this;
            int r0 = r1.getPriority()
            int r2 = r2.getPriority()
            int r0 = r0 - r2
            return r0
    }

    private void dm() {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.tm
            r0.b(r1)
            com.kwad.components.ad.reward.a r0 = com.kwad.components.ad.reward.a.gg()
            r0.a(r1)
            return
    }

    private void fa() {
            r3 = this;
            java.util.List r0 = r3.NM()
            if (r0 != 0) goto L7
            goto L21
        L7:
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            com.kwad.sdk.mvp.Presenter r1 = (com.kwad.sdk.mvp.Presenter) r1
            boolean r2 = r1 instanceof com.kwad.components.ad.reward.presenter.d.b.c
            if (r2 == 0) goto Lb
            com.kwad.components.ad.reward.presenter.d.b.c r1 = (com.kwad.components.ad.reward.presenter.d.b.c) r1
            r1.jO()
            goto Lb
        L21:
            return
    }

    @Override // com.kwad.components.ad.reward.e.j
    public final void a(com.kwad.components.core.playable.PlayableSource r1, @androidx.annotation.Nullable com.kwad.components.ad.reward.e.n r2) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r0 = this;
            super.at()
            r0.dm()
            return
    }

    @Override // com.kwad.components.ad.reward.e.g
    public final void cX() {
            r0 = this;
            r0.fa()
            return
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(com.kwad.components.ad.reward.e.g r1) {
            r0 = this;
            com.kwad.components.ad.reward.e.g r1 = (com.kwad.components.ad.reward.e.g) r1
            int r1 = r0.a(r1)
            return r1
    }

    @Override // com.kwad.components.ad.reward.e.j
    public final void dk() {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.reward.e.j
    public final void dl() {
            r0 = this;
            r0.fa()
            return
    }

    protected void dt() {
            r1 = this;
            com.kwad.components.ad.reward.presenter.d.b.d r0 = new com.kwad.components.ad.reward.presenter.d.b.d
            r0.<init>()
            r1.a(r0)
            com.kwad.components.ad.reward.presenter.d.b.a r0 = new com.kwad.components.ad.reward.presenter.d.b.a
            r0.<init>()
            r1.a(r0)
            com.kwad.components.ad.reward.presenter.d.b.b r0 = new com.kwad.components.ad.reward.presenter.d.b.b
            r0.<init>()
            r1.a(r0)
            return
    }

    @Override // com.kwad.components.ad.reward.e.g
    public final int getPriority() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r1 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r1.tm
            r0.c(r1)
            com.kwad.components.ad.reward.a r0 = com.kwad.components.ad.reward.a.gg()
            r0.b(r1)
            return
    }
}
