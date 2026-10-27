package com.bxkj.student.v2.common.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class AdManager {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.ad.AdManager a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener {
        final /* synthetic */ com.bxkj.base.v2.base.p a;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<xyz.adscope.amps.ad.reward.AMPSRewardVideoAd> b;
        final /* synthetic */ androidx.fragment.app.FragmentActivity c;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> d;

        a(com.bxkj.base.v2.base.p r1, kotlin.jvm.internal.Ref.ObjectRef<xyz.adscope.amps.ad.reward.AMPSRewardVideoAd> r2, androidx.fragment.app.FragmentActivity r3, kotlin.jvm.functions.Function0<kotlin.n1> r4) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.<init>()
                return
        }

        public void onAmpsAdCached() {
                r2 = this;
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "onAmpsAdCached"
                com.orhanobut.logger.j.d(r1, r0)
                return
        }

        public void onAmpsAdDismiss() {
                r2 = this;
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "onAmpsAdDismiss"
                com.orhanobut.logger.j.d(r1, r0)
                return
        }

        public void onAmpsAdFailed(xyz.adscope.amps.common.AMPSError r3) {
                r2 = this;
                com.bxkj.base.v2.base.p r0 = r2.a
                r0.b()
                androidx.fragment.app.FragmentActivity r0 = r2.c
                java.lang.String r1 = "加载失败，请重试！"
                com.bxkj.base.v2.common.ext.ContextExtKt.m(r0, r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onAmpsAdFailed="
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.orhanobut.logger.j.d(r3, r0)
                return
        }

        public void onAmpsAdLoad() {
                r2 = this;
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "onAmpsAdLoad"
                com.orhanobut.logger.j.d(r1, r0)
                com.bxkj.base.v2.base.p r0 = r2.a
                r0.b()
                kotlin.jvm.internal.Ref$ObjectRef<xyz.adscope.amps.ad.reward.AMPSRewardVideoAd> r0 = r2.b
                java.lang.Object r0 = r0.element
                xyz.adscope.amps.ad.reward.AMPSRewardVideoAd r0 = (xyz.adscope.amps.ad.reward.AMPSRewardVideoAd) r0
                if (r0 == 0) goto L1a
                androidx.fragment.app.FragmentActivity r1 = r2.c
                r0.show(r1)
            L1a:
                return
        }

        public void onAmpsAdRewardArrived(boolean r1, int r2, java.util.Map<java.lang.String, ? extends java.lang.Object> r3) {
                r0 = this;
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r2 = "onAmpsAdRewardArrived"
                com.orhanobut.logger.j.d(r2, r1)
                kotlin.jvm.functions.Function0<kotlin.n1> r1 = r0.d
                r1.invoke()
                kotlin.jvm.internal.Ref$ObjectRef<xyz.adscope.amps.ad.reward.AMPSRewardVideoAd> r1 = r0.b
                java.lang.Object r1 = r1.element
                xyz.adscope.amps.ad.reward.AMPSRewardVideoAd r1 = (xyz.adscope.amps.ad.reward.AMPSRewardVideoAd) r1
                if (r1 == 0) goto L18
                r1.destroy()
            L18:
                return
        }

        public void onAmpsAdShow() {
                r2 = this;
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "onAmpsAdShow"
                com.orhanobut.logger.j.d(r1, r0)
                return
        }

        public void onAmpsAdVideoClick() {
                r2 = this;
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "onAmpsAdVideoClick"
                com.orhanobut.logger.j.d(r1, r0)
                return
        }

        public void onAmpsAdVideoComplete() {
                r2 = this;
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "onAmpsAdVideoComplete"
                com.orhanobut.logger.j.d(r1, r0)
                return
        }

        public void onAmpsAdVideoError() {
                r2 = this;
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "onAmpsAdVideoError"
                com.orhanobut.logger.j.d(r1, r0)
                com.bxkj.base.v2.base.p r0 = r2.a
                r0.b()
                androidx.fragment.app.FragmentActivity r0 = r2.c
                java.lang.String r1 = "加载失败，请重试！"
                com.bxkj.base.v2.common.ext.ContextExtKt.m(r0, r1)
                return
        }
    }

    static {
            com.bxkj.student.v2.common.ad.AdManager r0 = new com.bxkj.student.v2.common.ad.AdManager
            r0.<init>()
            com.bxkj.student.v2.common.ad.AdManager.a = r0
            return
    }

    private AdManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r7) {
            r5 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "onAdRewardArrived"
            kotlin.jvm.internal.g0.p(r7, r0)
            com.bxkj.base.v2.base.p r0 = new com.bxkj.base.v2.base.p
            r0.<init>(r6)
            java.lang.String r1 = "加载中..."
            r0.e(r1)
            r0.h()
            xyz.adscope.amps.config.AMPSRequestParameters$Builder r1 = new xyz.adscope.amps.config.AMPSRequestParameters$Builder
            r1.<init>()
            java.lang.String r2 = "120291"
            xyz.adscope.amps.config.AMPSRequestParameters$Builder r1 = r1.setSpaceId(r2)
            r2 = 10000(0x2710, float:1.4013E-41)
            xyz.adscope.amps.config.AMPSRequestParameters$Builder r1 = r1.setTimeOut(r2)
            r2 = 1
            xyz.adscope.amps.config.AMPSRequestParameters$Builder r1 = r1.setAdCount(r2)
            xyz.adscope.amps.config.AMPSRequestParameters r1 = r1.build()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            xyz.adscope.amps.ad.reward.AMPSRewardVideoAd r3 = new xyz.adscope.amps.ad.reward.AMPSRewardVideoAd
            com.bxkj.student.v2.common.ad.AdManager$a r4 = new com.bxkj.student.v2.common.ad.AdManager$a
            r4.<init>(r0, r2, r6, r7)
            r3.<init>(r6, r1, r4)
            r2.element = r3
            r3.loadAd()
            androidx.lifecycle.Lifecycle r7 = r6.getLifecycle()
            com.bxkj.student.v2.common.ad.AdManager$showAd$2 r0 = new com.bxkj.student.v2.common.ad.AdManager$showAd$2
            r0.<init>(r2, r6)
            r7.addObserver(r0)
            return
    }
}
