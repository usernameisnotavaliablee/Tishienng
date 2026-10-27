package xyz.adscope.ad;

import xyz.adscope.ad.a2;
import xyz.adscope.ad.publish.ad.IAdListener;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class l1<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> extends xyz.adscope.ad.b2<C, L> {
    protected java.lang.String n;
    private final xyz.adscope.ad.l1<C, L>.b o;
    private android.view.View p;
    private xyz.adscope.ad.publish.ad.nativead.INativeAdItem q;
    private final xyz.adscope.ad.l1.c r;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b implements xyz.adscope.ad.publish.ad.nativead.INativeExpressListener, xyz.adscope.ad.publish.ad.nativead.INativeRewardListener, xyz.adscope.ad.publish.ad.nativead.INativeRenderListener, xyz.adscope.ad.publish.ad.nativead.INativeVideoPlayListener {
        final /* synthetic */ xyz.adscope.ad.l1 a;

        private b(xyz.adscope.ad.l1 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(xyz.adscope.ad.l1 r1, xyz.adscope.ad.l1.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // xyz.adscope.ad.publish.ad.nativead.INativeInteractiveListener
        public void onAdClicked() {
                r4 = this;
                xyz.adscope.ad.l1 r0 = r4.a
                xyz.adscope.ad.d2 r0 = r0.c()
                xyz.adscope.ad.publish.ad.IAdListener r0 = (xyz.adscope.ad.publish.ad.IAdListener) r0
                xyz.adscope.ad.l1 r1 = r4.a
                xyz.adscope.ad.c r2 = r1.a
                xyz.adscope.ad.c r3 = xyz.adscope.ad.c.h
                if (r2 != r3) goto L17
                long r2 = java.lang.System.currentTimeMillis()
                r1.a(r2)
            L17:
                if (r0 == 0) goto L1c
                r0.onAdClicked()
            L1c:
                return
        }

        @Override // xyz.adscope.ad.publish.ad.nativead.INativeExpressListener
        public void onAdClosed() {
                r1 = this;
                xyz.adscope.ad.l1 r0 = r1.a
                xyz.adscope.ad.d2 r0 = r0.c()
                xyz.adscope.ad.publish.ad.IAdListener r0 = (xyz.adscope.ad.publish.ad.IAdListener) r0
                if (r0 == 0) goto Ld
                r0.onAdClosed()
            Ld:
                return
        }

        @Override // xyz.adscope.ad.publish.ad.nativead.INativeExpressListener
        public void onAdExposure() {
                r1 = this;
                xyz.adscope.ad.l1 r0 = r1.a
                xyz.adscope.ad.d2 r0 = r0.c()
                xyz.adscope.ad.publish.ad.IAdListener r0 = (xyz.adscope.ad.publish.ad.IAdListener) r0
                if (r0 == 0) goto Ld
                r0.onAdExposure()
            Ld:
                return
        }

        @Override // xyz.adscope.ad.publish.ad.nativead.INativeExpressListener
        public void onAdShown() {
                r1 = this;
                xyz.adscope.ad.l1 r0 = r1.a
                xyz.adscope.ad.d2 r0 = r0.c()
                xyz.adscope.ad.publish.ad.IAdListener r0 = (xyz.adscope.ad.publish.ad.IAdListener) r0
                if (r0 == 0) goto Ld
                r0.onAdShown()
            Ld:
                return
        }

        @Override // xyz.adscope.ad.publish.ad.nativead.INativeRewardListener
        public void onReward() {
                r2 = this;
                xyz.adscope.ad.l1 r0 = r2.a
                xyz.adscope.ad.d2 r0 = r0.c()
                boolean r1 = r0 instanceof xyz.adscope.ad.publish.ad.video.IRewardVideoListener
                if (r1 == 0) goto Lf
                xyz.adscope.ad.publish.ad.video.IRewardVideoListener r0 = (xyz.adscope.ad.publish.ad.video.IRewardVideoListener) r0
                r0.onReward()
            Lf:
                return
        }

        @Override // xyz.adscope.ad.publish.ad.nativead.INativeVideoPlayListener
        public void onVideoPlay() {
                r0 = this;
                return
        }

        @Override // xyz.adscope.ad.publish.ad.nativead.INativeVideoPlayListener
        public void onVideoPlayCompleted() {
                r0 = this;
                r0.onReward()
                return
        }

        @Override // xyz.adscope.ad.publish.ad.nativead.INativeVideoPlayListener
        public void onVideoPlayFailed() {
                r0 = this;
                return
        }

        @Override // xyz.adscope.ad.publish.ad.nativead.INativeVideoPlayListener
        public void onVideoPrepared() {
                r0 = this;
                return
        }

        @Override // xyz.adscope.ad.publish.ad.nativead.INativeRenderListener
        public void renderFailed() {
                r2 = this;
                xyz.adscope.ad.l1 r0 = r2.a
                xyz.adscope.ad.y0 r1 = xyz.adscope.ad.y0.m
                r0.b(r1)
                return
        }

        @Override // xyz.adscope.ad.publish.ad.nativead.INativeRenderListener
        public void renderSuccess(android.view.View r2) {
                r1 = this;
                xyz.adscope.ad.l1 r0 = r1.a
                xyz.adscope.ad.l1.a(r0)
                xyz.adscope.ad.l1 r0 = r1.a
                xyz.adscope.ad.l1.a(r0, r2)
                xyz.adscope.ad.l1 r2 = r1.a
                xyz.adscope.ad.d2 r2 = r2.c()
                xyz.adscope.ad.publish.ad.IAdListener r2 = (xyz.adscope.ad.publish.ad.IAdListener) r2
                if (r2 == 0) goto L17
                r2.onRenderSuccess()
            L17:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class c extends android.content.BroadcastReceiver {
        private final xyz.adscope.ad.l1<?, ?> a;

        private c(xyz.adscope.ad.l1<?, ?> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        /* synthetic */ c(xyz.adscope.ad.l1 r1, xyz.adscope.ad.l1.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                android.content.Context r1 = r1.getApplicationContext()
                android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
                r1.unregisterReceiver(r0)
                xyz.adscope.ad.l1<?, ?> r1 = r0.a
                if (r1 == 0) goto L14
                xyz.adscope.ad.y0 r2 = xyz.adscope.ad.y0.n
                r1.b(r2)
            L14:
                return
        }
    }

    l1(android.content.Context r1, C r2, xyz.adscope.ad.c r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            xyz.adscope.ad.l1$b r1 = new xyz.adscope.ad.l1$b
            r2 = 0
            r1.<init>(r0, r2)
            r0.o = r1
            xyz.adscope.ad.l1$c r1 = new xyz.adscope.ad.l1$c
            r1.<init>(r0, r2)
            r0.r = r1
            return
    }

    static /* synthetic */ android.view.View a(xyz.adscope.ad.l1 r0, android.view.View r1) {
            r0.p = r1
            return r1
    }

    private void a(android.content.Context r3) {
            r2 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "com.asnp.ad.ACTION_ACTIVITY_RESULT"
            r0.addAction(r1)
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            androidx.localbroadcastmanager.content.LocalBroadcastManager r3 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r3)
            xyz.adscope.ad.l1$c r1 = r2.r
            r3.registerReceiver(r1, r0)
            return
    }

    private void a(android.view.View r3) {
            r2 = this;
            xyz.adscope.ad.a r0 = r2.e
            if (r0 == 0) goto Lc
            C extends xyz.adscope.ad.a2 r1 = r2.c
            java.lang.String r3 = r0.a(r1, r3)
            r2.n = r3
        Lc:
            return
    }

    static /* synthetic */ void a(xyz.adscope.ad.l1 r0) {
            r0.n()
            return
    }

    private void a(xyz.adscope.ad.publish.ad.nativead.INativeAdItem r2) {
            r1 = this;
            r1.q = r2
            if (r2 == 0) goto L18
            xyz.adscope.ad.l1<C, L>$b r0 = r1.o
            r2.setInteractiveListener(r0)
            xyz.adscope.ad.l1<C, L>$b r0 = r1.o
            r2.setExpressListener(r0)
            xyz.adscope.ad.l1<C, L>$b r0 = r1.o
            r2.setVideoPlayListener(r0)
            xyz.adscope.ad.l1<C, L>$b r0 = r1.o
            r2.renderAdView(r0)
        L18:
            return
    }

    private void c(android.content.Context r2) {
            r1 = this;
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            xyz.adscope.ad.l1$c r0 = r1.r
            r2.unregisterReceiver(r0)
            return
    }

    private void i() {
            r1 = this;
            xyz.adscope.ad.d2 r0 = r1.c()
            xyz.adscope.ad.publish.ad.IAdListener r0 = (xyz.adscope.ad.publish.ad.IAdListener) r0
            if (r0 == 0) goto Lb
            r0.onAdLoaded()
        Lb:
            return
    }

    private void n() {
            r1 = this;
            r0 = 1
            r1.d = r0
            return
    }

    public android.view.View a(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L9
            android.view.View r1 = r0.p
            r0.a(r1)
            r1 = 0
            return r1
        L9:
            android.view.View r1 = r0.p
            return r1
    }

    @Override // xyz.adscope.ad.b2
    protected void a(java.util.List<xyz.adscope.ad.s3> r2) {
            r1 = this;
            r1.i()
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            xyz.adscope.ad.s3 r2 = (xyz.adscope.ad.s3) r2
            if (r2 == 0) goto L14
            xyz.adscope.ad.y6 r0 = new xyz.adscope.ad.y6
            r0.<init>(r2)
            r1.a(r0)
        L14:
            return
    }

    public void a(java.util.Map<java.lang.String, java.lang.String> r2) {
            r1 = this;
            xyz.adscope.ad.publish.ad.nativead.INativeAdItem r0 = r1.q
            if (r0 == 0) goto L13
            xyz.adscope.ad.publish.ad.IBidding r0 = r0.getBidding()
            if (r0 == 0) goto L13
            xyz.adscope.ad.publish.ad.nativead.INativeAdItem r0 = r1.q
            xyz.adscope.ad.publish.ad.IBidding r0 = r0.getBidding()
            r0.notifyBidLose(r2)
        L13:
            return
    }

    public void b(android.content.Context r5) {
            r4 = this;
            boolean r0 = r4.b()
            if (r0 != 0) goto L23
            r4.a(r5)
            C extends xyz.adscope.ad.a2 r0 = r4.c
            java.lang.String r0 = r0.getSpaceID()
            xyz.adscope.ad.c r1 = r4.a
            java.lang.String r2 = r4.n
            C extends xyz.adscope.ad.a2 r3 = r4.c
            java.lang.String r3 = r3.getApiKey()
            boolean r0 = xyz.adscope.ad.n4.a(r5, r0, r1, r2, r3)
            if (r0 != 0) goto L22
            r4.c(r5)
        L22:
            return
        L23:
            xyz.adscope.ad.y0 r5 = xyz.adscope.ad.y0.l
            r4.b(r5)
            return
    }

    public void b(java.util.Map<java.lang.String, java.lang.String> r2) {
            r1 = this;
            xyz.adscope.ad.publish.ad.nativead.INativeAdItem r0 = r1.q
            if (r0 == 0) goto L13
            xyz.adscope.ad.publish.ad.IBidding r0 = r0.getBidding()
            if (r0 == 0) goto L13
            xyz.adscope.ad.publish.ad.nativead.INativeAdItem r0 = r1.q
            xyz.adscope.ad.publish.ad.IBidding r0 = r0.getBidding()
            r0.notifyBidWin(r2)
        L13:
            return
    }

    public void b(xyz.adscope.ad.y0 r3) {
            r2 = this;
            xyz.adscope.ad.d2 r0 = r2.c()
            xyz.adscope.ad.publish.ad.IAdListener r0 = (xyz.adscope.ad.publish.ad.IAdListener) r0
            if (r0 == 0) goto L13
            int r1 = r3.b()
            java.lang.String r3 = r3.c()
            r0.onAdLoadFailed(r1, r3)
        L13:
            return
    }

    public void j() {
            r2 = this;
            xyz.adscope.ad.publish.ad.nativead.INativeAdItem r0 = r2.q
            if (r0 == 0) goto L7
            r0.destroyAd()
        L7:
            android.view.View r0 = r2.p
            if (r0 == 0) goto L14
            boolean r1 = r0 instanceof xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a
            if (r1 == 0) goto L14
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r0 = (xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a) r0
            r0.onViewDestroy()
        L14:
            return
    }

    public int k() {
            r1 = this;
            xyz.adscope.ad.publish.ad.nativead.INativeAdItem r0 = r1.q
            if (r0 == 0) goto L15
            xyz.adscope.ad.publish.ad.IBidding r0 = r0.getBidding()
            if (r0 == 0) goto L15
            xyz.adscope.ad.publish.ad.nativead.INativeAdItem r0 = r1.q
            xyz.adscope.ad.publish.ad.IBidding r0 = r0.getBidding()
            int r0 = r0.getECPM()
            return r0
        L15:
            r0 = 0
            return r0
    }

    public void l() {
            r2 = this;
            android.view.View r0 = r2.p
            if (r0 == 0) goto Ld
            boolean r1 = r0 instanceof xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a
            if (r1 == 0) goto Ld
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r0 = (xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a) r0
            r0.onActivityPause()
        Ld:
            return
    }

    public void m() {
            r2 = this;
            android.view.View r0 = r2.p
            if (r0 == 0) goto Ld
            boolean r1 = r0 instanceof xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a
            if (r1 == 0) goto Ld
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r0 = (xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a) r0
            r0.onActivityResume()
        Ld:
            return
    }
}
