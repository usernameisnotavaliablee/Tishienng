package com.kwad.components.ad.reward.m;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e {
    private int Bo;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.f.a Bp;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.m.d Bq;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.m.b Br;

    @androidx.annotation.NonNull
    private com.kwad.components.ad.k.a Bs;
    private int Bt;
    private java.util.List<com.kwad.components.core.video.m> Bu;
    private com.kwad.components.ad.reward.g tm;

    public e(com.kwad.components.ad.reward.g r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.Bo = r0
            r1.Bt = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.Bu = r0
            r1.tm = r2
            com.kwad.components.ad.reward.m.a r0 = new com.kwad.components.ad.reward.m.a
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            r0.<init>(r2)
            r1.Bs = r0
            return
    }

    private com.kwad.components.ad.k.a kV() {
            r1 = this;
            com.kwad.components.ad.k.a r0 = r1.Bs
            return r0
    }

    public final void a(int r2, com.kwad.components.ad.k.a r3) {
            r1 = this;
            r1.Bo = r2
            r0 = 1
            if (r2 != r0) goto Lb
            r2 = r3
            com.kwad.components.ad.reward.m.d r2 = (com.kwad.components.ad.reward.m.d) r2
            r1.Bq = r2
            goto L1c
        Lb:
            r0 = 2
            if (r2 != r0) goto L14
            r2 = r3
            com.kwad.components.ad.reward.f.a r2 = (com.kwad.components.ad.reward.f.a) r2
            r1.Bp = r2
            goto L1c
        L14:
            r0 = 3
            if (r2 != r0) goto L1c
            r2 = r3
            com.kwad.components.ad.reward.m.b r2 = (com.kwad.components.ad.reward.m.b) r2
            r1.Br = r2
        L1c:
            r1.Bs = r3
            java.util.List<com.kwad.components.core.video.m> r2 = r1.Bu
            java.util.Iterator r2 = r2.iterator()
        L24:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L36
            java.lang.Object r3 = r2.next()
            com.kwad.components.core.video.m r3 = (com.kwad.components.core.video.m) r3
            com.kwad.components.ad.k.a r0 = r1.Bs
            r0.b(r3)
            goto L24
        L36:
            java.util.List<com.kwad.components.core.video.m> r2 = r1.Bu
            r2.clear()
            return
    }

    public final void a(@androidx.annotation.Nullable com.kwad.components.core.video.m r2) {
            r1 = this;
            com.kwad.components.ad.k.a r0 = r1.kV()
            boolean r0 = r0.kR()
            if (r0 == 0) goto L10
            java.util.List<com.kwad.components.core.video.m> r0 = r1.Bu
            r0.add(r2)
            return
        L10:
            com.kwad.components.ad.k.a r0 = r1.kV()
            r0.b(r2)
            return
    }

    public final void a(com.kwad.sdk.utils.i.a r2) {
            r1 = this;
            com.kwad.components.ad.reward.m.d r0 = r1.Bq
            if (r0 == 0) goto L7
            r0.a(r2)
        L7:
            return
    }

    public final void b(@androidx.annotation.Nullable com.kwad.components.core.video.m r2) {
            r1 = this;
            com.kwad.components.ad.k.a r0 = r1.kV()
            r0.a(r2)
            if (r2 == 0) goto Le
            java.util.List<com.kwad.components.core.video.m> r0 = r1.Bu
            r0.remove(r2)
        Le:
            return
    }

    public final void b(com.kwad.sdk.utils.i.a r2) {
            r1 = this;
            com.kwad.components.ad.reward.m.d r0 = r1.Bq
            if (r0 == 0) goto L7
            r0.b(r2)
        L7:
            return
    }

    public final long getPlayDuration() {
            r2 = this;
            com.kwad.components.ad.k.a r0 = r2.kV()
            long r0 = r0.getPlayDuration()
            return r0
    }

    public final void kS() {
            r1 = this;
            com.kwad.components.ad.reward.m.d r0 = r1.Bq
            if (r0 == 0) goto L8
            r0.kS()
            goto Lf
        L8:
            com.kwad.components.ad.reward.m.b r0 = r1.Br
            if (r0 == 0) goto Lf
            r0.kS()
        Lf:
            com.kwad.components.ad.reward.g r0 = r1.tm
            r0.gH()
            return
    }

    public final void kT() {
            r1 = this;
            com.kwad.components.ad.reward.m.d r0 = r1.Bq
            if (r0 == 0) goto L7
            r0.kT()
        L7:
            return
    }

    public final boolean kW() {
            r1 = this;
            com.kwad.components.ad.reward.f.a r0 = r1.Bp
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public final com.kwad.components.ad.reward.f.a kX() {
            r1 = this;
            com.kwad.components.ad.reward.f.a r0 = r1.Bp
            return r0
    }

    @androidx.annotation.Nullable
    public final com.kwad.components.ad.reward.m.b kY() {
            r1 = this;
            com.kwad.components.ad.reward.m.b r0 = r1.Br
            return r0
    }

    public final void pause() {
            r1 = this;
            com.kwad.components.ad.k.a r0 = r1.kV()
            r0.pause()
            return
    }

    public final void release() {
            r1 = this;
            com.kwad.components.ad.k.a r0 = r1.kV()
            r0.release()
            return
    }

    public final void resume() {
            r4 = this;
            com.kwad.components.ad.k.a r0 = r4.kV()
            r0.resume()
            com.kwad.components.ad.reward.f.a r0 = r4.Bp
            if (r0 == 0) goto L19
            int r1 = r4.Bt
            if (r1 <= 0) goto L19
            r2 = 2
            r3 = 0
            if (r1 != r2) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            r0.setAudioEnabled(r1, r3)
        L19:
            return
    }

    public final void setAudioEnabled(boolean r2, boolean r3) {
            r1 = this;
            if (r2 == 0) goto L4
            r0 = 2
            goto L5
        L4:
            r0 = 1
        L5:
            r1.Bt = r0
            com.kwad.components.ad.k.a r0 = r1.kV()
            r0.setAudioEnabled(r2, r3)
            return
    }

    public final void skipToEnd() {
            r1 = this;
            com.kwad.components.ad.k.a r0 = r1.kV()
            r0.skipToEnd()
            return
    }
}
