package com.kwad.components.ad.reward.presenter.platdetail.actionbar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class RewardActionBarControl {
    private android.os.Handler iK;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private android.content.Context mContext;
    private com.kwad.components.ad.reward.g tm;
    private com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.b xY;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.d yc;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.c yd;

    @androidx.annotation.NonNull
    private com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.a ye;
    private final long yf;
    private boolean yg;
    private boolean yh;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ShowActionBarResult extends java.lang.Enum<com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult> {
        private static final /* synthetic */ com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult[] $VALUES = null;
        public static final com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult SHOW_H5_FAILURE = null;
        public static final com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult SHOW_H5_SUCCESS = null;
        public static final com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult SHOW_NATIVE_DEFAULT = null;
        public static final com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult SHOW_NATIVE_JINNIU = null;
        public static final com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult SHOW_NATIVE_LIVE_SUBSCRIBE = null;
        public static final com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult SHOW_NATIVE_ORDER = null;
        public static final com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult SHOW_NATIVE_ORIGIN_LIVE = null;
        public static final com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult SHOW_NATIVE_PLAYABLE_PORTRAIT = null;
        public static final com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult SHOW_ORDER = null;

        static {
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r0 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult
                java.lang.String r1 = "SHOW_NATIVE_DEFAULT"
                r2 = 0
                r0.<init>(r1, r2)
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_DEFAULT = r0
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r1 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult
                java.lang.String r3 = "SHOW_H5_SUCCESS"
                r4 = 1
                r1.<init>(r3, r4)
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_H5_SUCCESS = r1
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r3 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult
                java.lang.String r5 = "SHOW_H5_FAILURE"
                r6 = 2
                r3.<init>(r5, r6)
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_H5_FAILURE = r3
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r5 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult
                java.lang.String r7 = "SHOW_ORDER"
                r8 = 3
                r5.<init>(r7, r8)
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_ORDER = r5
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r7 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult
                java.lang.String r9 = "SHOW_NATIVE_ORDER"
                r10 = 4
                r7.<init>(r9, r10)
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_ORDER = r7
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r9 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult
                java.lang.String r11 = "SHOW_NATIVE_JINNIU"
                r12 = 5
                r9.<init>(r11, r12)
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_JINNIU = r9
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r11 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult
                java.lang.String r13 = "SHOW_NATIVE_PLAYABLE_PORTRAIT"
                r14 = 6
                r11.<init>(r13, r14)
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_PLAYABLE_PORTRAIT = r11
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r13 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult
                java.lang.String r15 = "SHOW_NATIVE_LIVE_SUBSCRIBE"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_LIVE_SUBSCRIBE = r13
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r15 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult
                r17 = 7
                java.lang.String r2 = "SHOW_NATIVE_ORIGIN_LIVE"
                r18 = 1
                r4 = 8
                r15.<init>(r2, r4)
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_ORIGIN_LIVE = r15
                r2 = 9
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult[] r2 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult[r2]
                r2[r16] = r0
                r2[r18] = r1
                r2[r6] = r3
                r2[r8] = r5
                r2[r10] = r7
                r2[r12] = r9
                r2[r14] = r11
                r2[r17] = r13
                r2[r4] = r15
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.$VALUES = r2
                return
        }

        ShowActionBarResult(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult valueOf(java.lang.String r1) {
                java.lang.Class<com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult> r0 = com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r1 = (com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult) r1
                return r1
        }

        public static com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult[] values() {
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult[] r0 = com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.$VALUES
                java.lang.Object r0 = r0.clone()
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult[] r0 = (com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements com.kwad.components.ad.reward.presenter.platdetail.actionbar.a {
        private java.util.List<com.kwad.components.ad.reward.presenter.platdetail.actionbar.a> ym;
        private com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult yn;

        private a() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
                r0.<init>()
                r1.ym = r0
                return
        }

        /* synthetic */ a(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.a r0) {
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r0 = r0.yn
                return r0
        }

        @Override // com.kwad.components.ad.reward.presenter.platdetail.actionbar.a
        public final void a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult r3, android.view.View r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "onActionBarShown result: "
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "ActionBarControl"
                com.kwad.sdk.core.d.c.d(r1, r0)
                r2.yn = r3
                java.util.List<com.kwad.components.ad.reward.presenter.platdetail.actionbar.a> r0 = r2.ym
                java.util.Iterator r0 = r0.iterator()
            L1b:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2b
                java.lang.Object r1 = r0.next()
                com.kwad.components.ad.reward.presenter.platdetail.actionbar.a r1 = (com.kwad.components.ad.reward.presenter.platdetail.actionbar.a) r1
                r1.a(r3, r4)
                goto L1b
            L2b:
                return
        }

        public final void c(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a r2) {
                r1 = this;
                java.util.List<com.kwad.components.ad.reward.presenter.platdetail.actionbar.a> r0 = r1.ym
                r0.add(r2)
                return
        }

        public final void d(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a r2) {
                r1 = this;
                java.util.List<com.kwad.components.ad.reward.presenter.platdetail.actionbar.a> r0 = r1.ym
                r0.remove(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a(boolean r1, com.kwad.components.ad.reward.presenter.platdetail.actionbar.a r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c {
        void e(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d {
        boolean f(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a r1);
    }

    public RewardActionBarControl(com.kwad.components.ad.reward.g r6, android.content.Context r7, com.kwad.sdk.core.response.model.AdTemplate r8) {
            r5 = this;
            r5.<init>()
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$a r0 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$a
            r1 = 0
            r0.<init>(r1)
            r5.ye = r0
            r5.tm = r6
            r5.mContext = r7
            r5.mAdTemplate = r8
            com.kwad.sdk.core.response.model.AdInfo r6 = com.kwad.sdk.core.response.b.e.el(r8)
            r5.mAdInfo = r6
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            r6.<init>(r7)
            r5.iK = r6
            r5.yg = r1
            r5.yh = r1
            long r6 = com.kwad.sdk.core.response.b.b.cx(r8)
            r0 = 1000(0x3e8, double:4.94E-321)
            r2 = 0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 <= 0) goto L37
            long r6 = com.kwad.sdk.core.response.b.b.cx(r8)
            goto L38
        L37:
            r6 = r0
        L38:
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 > 0) goto L3d
            goto L3e
        L3d:
            r0 = r6
        L3e:
            r5.yf = r0
            return
    }

    private com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult Q(boolean r3) {
            r2 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            boolean r0 = com.kwad.components.ad.reward.a.b.i(r0)
            if (r0 == 0) goto L14
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$c r0 = r2.yd
            if (r0 == 0) goto L14
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$a r3 = r2.ye
            r0.e(r3)
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r3 = com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_ORDER
            return r3
        L14:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.b.cy(r0)
            if (r0 == 0) goto L4e
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.bd(r0)
            if (r0 != 0) goto L4e
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$d r0 = r2.yc
            if (r0 != 0) goto L29
            goto L4e
        L29:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "showWebActionBar success in "
            r3.<init>(r0)
            long r0 = r2.yf
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "ActionBarControl"
            com.kwad.sdk.core.d.c.d(r0, r3)
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$d r3 = r2.yc
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$a r0 = r2.ye
            boolean r3 = r3.f(r0)
            if (r3 == 0) goto L4b
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r3 = com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_H5_SUCCESS
            return r3
        L4b:
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r3 = com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_H5_FAILURE
            return r3
        L4e:
            r2.R(r3)
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r3 = com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_DEFAULT
            return r3
    }

    private void R(boolean r3) {
            r2 = this;
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$b r0 = r2.xY
            if (r0 == 0) goto L15
            java.lang.String r0 = "ActionBarControl"
            java.lang.String r1 = "showNativeActionBar"
            com.kwad.sdk.core.d.c.d(r0, r1)
            r0 = 1
            r2.yh = r0
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$b r0 = r2.xY
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$a r1 = r2.ye
            r0.a(r3, r1)
        L15:
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.d a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0) {
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$d r0 = r0.yc
            return r0
    }

    public static void a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a r1, android.view.View r2, com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult r3) {
            if (r1 == 0) goto La
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$2 r0 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$2
            r0.<init>(r1, r3, r2)
            r2.post(r0)
        La:
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0, boolean r1) {
            r1 = 1
            r0.yg = r1
            return r1
    }

    static /* synthetic */ void b(com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0, boolean r1) {
            r1 = 1
            r0.R(r1)
            return
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0) {
            boolean r0 = r0.yh
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.a c(com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0) {
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$a r0 = r0.ye
            return r0
    }

    static /* synthetic */ long d(com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r2) {
            long r0 = r2.yf
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate e(com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g f(com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    public final void P(boolean r4) {
            r3 = this;
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r4 = r3.Q(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showActionBarOnVideoStart result: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ActionBarControl"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r0 = com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult.SHOW_H5_FAILURE
            if (r4 == r0) goto L1c
            return
        L1c:
            android.os.Handler r4 = r3.iK
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$1 r0 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$1
            r0.<init>(r3)
            long r1 = r3.yf
            r4.postDelayed(r0, r1)
            return
    }

    @androidx.annotation.MainThread
    public final void a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.b r1) {
            r0 = this;
            r0.xY = r1
            return
    }

    @androidx.annotation.MainThread
    public final void a(@androidx.annotation.Nullable com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.c r1) {
            r0 = this;
            r0.yd = r1
            return
    }

    @androidx.annotation.MainThread
    public final void a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.d r1) {
            r0 = this;
            r0.yc = r1
            return
    }

    public final void a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a r2) {
            r1 = this;
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$a r0 = r1.ye
            r0.c(r2)
            return
    }

    public final void b(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a r2) {
            r1 = this;
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$a r0 = r1.ye
            r0.d(r2)
            return
    }

    public final void jq() {
            r2 = this;
            boolean r0 = r2.yg
            if (r0 == 0) goto Lc
            java.lang.String r0 = "ActionBarControl"
            java.lang.String r1 = "showWebActionBar time out on pageStatus"
            com.kwad.sdk.core.d.c.i(r0, r1)
            return
        Lc:
            android.os.Handler r0 = r2.iK
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            r0 = 1
            r2.Q(r0)
            return
    }

    @androidx.annotation.Nullable
    public final com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult jr() {
            r1 = this;
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$a r0 = r1.ye
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$ShowActionBarResult r0 = com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.a.a(r0)
            return r0
    }
}
