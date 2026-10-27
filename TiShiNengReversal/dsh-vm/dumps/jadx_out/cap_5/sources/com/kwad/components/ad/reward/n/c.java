package com.kwad.components.ad.reward.n;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.sdk.core.download.a.a implements com.kwad.sdk.widget.d {
    private android.widget.ImageView BA;
    private android.widget.TextView BB;
    private android.widget.TextView BC;
    private com.kwad.sdk.widget.KSRatingBar BD;
    private com.kwad.components.ad.widget.KsAppTagsView BE;
    private com.kwad.components.ad.reward.n.c.a BF;
    private volatile boolean BG;
    private com.kwad.components.ad.j.a BH;
    private java.lang.Runnable BI;
    private android.view.View Bv;
    private android.view.View Bw;
    private android.widget.Button Bx;
    private android.widget.Button By;
    private android.widget.TextView Bz;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void d(boolean r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b {
        private float BK;
        private java.util.List<java.lang.String> BL;
        private int BM;
        private java.lang.String BN;
        private java.lang.String appName;
        private java.lang.String sW;
        private java.lang.String sX;

        b() {
                r1 = this;
                r1.<init>()
                r0 = 15
                r1.BM = r0
                return
        }

        public static com.kwad.components.ad.reward.n.c.b Y(com.kwad.sdk.core.response.model.AdTemplate r3) {
                if (r3 != 0) goto L4
                r3 = 0
                return r3
            L4:
                com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
                com.kwad.components.ad.reward.n.c$b r1 = new com.kwad.components.ad.reward.n.c$b
                r1.<init>()
                boolean r2 = com.kwad.sdk.core.response.b.e.O(r3)
                if (r2 == 0) goto L1a
                java.lang.String r2 = com.kwad.sdk.core.response.b.a.ax(r0)
                r1.appName = r2
                goto L20
            L1a:
                java.lang.String r2 = com.kwad.sdk.core.response.b.a.av(r0)
                r1.appName = r2
            L20:
                float r2 = com.kwad.sdk.core.response.b.a.aC(r0)
                r1.BK = r2
                java.lang.String r2 = com.kwad.sdk.core.response.b.a.au(r0)
                r1.sX = r2
                boolean r2 = com.kwad.sdk.core.response.b.e.O(r3)
                if (r2 == 0) goto L39
                java.lang.String r0 = com.kwad.sdk.core.response.b.a.cO(r0)
                r1.sW = r0
                goto L3f
            L39:
                java.lang.String r0 = com.kwad.sdk.core.response.b.a.co(r0)
                r1.sW = r0
            L3f:
                com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
                boolean r0 = com.kwad.components.ad.reward.a.b.k(r0)
                boolean r0 = com.kwad.sdk.core.response.b.e.k(r3, r0)
                if (r0 == 0) goto L58
                int r0 = com.kwad.components.ad.reward.a.b.hB()
                r1.BM = r0
                java.lang.String r0 = "安装并体验%s秒  可领取奖励"
                r1.BN = r0
                goto L62
            L58:
                int r0 = com.kwad.sdk.core.config.e.FC()
                r1.BM = r0
                java.lang.String r0 = "浏览详情页%s秒，领取奖励"
                r1.BN = r0
            L62:
                java.util.List r3 = com.kwad.sdk.core.response.b.d.ec(r3)
                r1.BL = r3
                return r1
        }

        static /* synthetic */ java.lang.String a(com.kwad.components.ad.reward.n.c.b r0) {
                java.lang.String r0 = r0.sW
                return r0
        }

        static /* synthetic */ java.lang.String b(com.kwad.components.ad.reward.n.c.b r0) {
                java.lang.String r0 = r0.appName
                return r0
        }

        static /* synthetic */ java.lang.String c(com.kwad.components.ad.reward.n.c.b r0) {
                java.lang.String r0 = r0.sX
                return r0
        }

        static /* synthetic */ float d(com.kwad.components.ad.reward.n.c.b r0) {
                float r0 = r0.BK
                return r0
        }

        static /* synthetic */ java.util.List e(com.kwad.components.ad.reward.n.c.b r0) {
                java.util.List<java.lang.String> r0 = r0.BL
                return r0
        }

        public final java.lang.String lb() {
                r4 = this;
                java.lang.String r0 = r4.BN
                int r1 = r4.BM
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r1
                java.lang.String r0 = java.lang.String.format(r0, r2)
                return r0
        }
    }

    public c(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.BG = r0
            r1.Bv = r2
            r1.initView()
            com.kwad.components.ad.j.a r0 = new com.kwad.components.ad.j.a
            r0.<init>(r2)
            r1.BH = r0
            return
    }

    static /* synthetic */ android.view.View a(com.kwad.components.ad.reward.n.c r0) {
            android.view.View r0 = r0.Bw
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.reward.n.c r0) {
            boolean r0 = r0.BG
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.j.a c(com.kwad.components.ad.reward.n.c r0) {
            com.kwad.components.ad.j.a r0 = r0.BH
            return r0
    }

    private void e(android.view.View r2, boolean r3) {
            r1 = this;
            int r2 = r2.getId()
            int r0 = com.kwad.sdk.R.id.ksad_reward_apk_info_install_container
            if (r2 == r0) goto L10
            int r0 = com.kwad.sdk.R.id.ksad_reward_apk_info_install_action
            if (r2 == r0) goto L10
            int r0 = com.kwad.sdk.R.id.ksad_reward_apk_info_install_start
            if (r2 != r0) goto L21
        L10:
            java.lang.String r2 = "ApkInfoCardViewHelper"
            java.lang.String r0 = "onClick install"
            com.kwad.sdk.core.d.c.d(r2, r0)
            r2 = 1
            r1.BG = r2
            com.kwad.components.ad.reward.n.c$a r0 = r1.BF
            if (r0 == 0) goto L21
            r0.d(r3, r2)
        L21:
            return
    }

    private void initView() {
            r2 = this;
            android.view.View r0 = r2.Bv
            int r1 = com.kwad.sdk.R.id.ksad_reward_apk_info_install_action
            android.view.View r0 = r0.findViewById(r1)
            android.widget.Button r0 = (android.widget.Button) r0
            r2.Bx = r0
            android.view.View r0 = r2.Bv
            int r1 = com.kwad.sdk.R.id.ksad_reward_apk_info_install_start
            android.view.View r0 = r0.findViewById(r1)
            android.widget.Button r0 = (android.widget.Button) r0
            r2.By = r0
            android.view.View r0 = r2.Bv
            int r1 = com.kwad.sdk.R.id.ksad_reward_apk_info_install_container
            android.view.View r0 = r0.findViewById(r1)
            r2.Bw = r0
            android.view.View r0 = r2.Bv
            int r1 = com.kwad.sdk.R.id.ksad_reward_apk_info_icon
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.BA = r0
            android.view.View r0 = r2.Bv
            int r1 = com.kwad.sdk.R.id.ksad_reward_apk_info_name
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Bz = r0
            android.view.View r0 = r2.Bv
            int r1 = com.kwad.sdk.R.id.ksad_reward_apk_info_desc
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.BB = r0
            android.view.View r0 = r2.Bv
            int r1 = com.kwad.sdk.R.id.ksad_reward_apk_info_score
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.sdk.widget.KSRatingBar r0 = (com.kwad.sdk.widget.KSRatingBar) r0
            r2.BD = r0
            android.view.View r0 = r2.Bv
            int r1 = com.kwad.sdk.R.id.ksad_reward_apk_info_tags
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.components.ad.widget.KsAppTagsView r0 = (com.kwad.components.ad.widget.KsAppTagsView) r0
            r2.BE = r0
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void a(android.view.View r2) {
            r1 = this;
            r0 = 1
            r1.e(r2, r0)
            return
    }

    public final void a(com.kwad.components.ad.reward.n.c.a r1) {
            r0 = this;
            r0.BF = r1
            return
    }

    public final void a(com.kwad.components.core.e.d.c r1) {
            r0 = this;
            r0.mApkDownloadHelper = r1
            if (r1 == 0) goto L7
            r1.b(r0)
        L7:
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void b(android.view.View r2) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.d.ea(r0)
            if (r0 == 0) goto Lc
            r0 = 0
            r1.e(r2, r0)
        Lc:
            return
    }

    public final void c(com.kwad.sdk.core.response.model.AdTemplate r5, boolean r6) {
            r4 = this;
            r4.mAdTemplate = r5
            com.kwad.components.ad.reward.n.c$b r0 = com.kwad.components.ad.reward.n.c.b.Y(r5)
            if (r0 != 0) goto L9
            return
        L9:
            android.widget.ImageView r1 = r4.BA
            java.lang.String r2 = com.kwad.components.ad.reward.n.c.b.a(r0)
            r3 = 12
            com.kwad.sdk.core.imageloader.KSImageLoader.loadAppIcon(r1, r2, r5, r3)
            android.widget.TextView r1 = r4.Bz
            java.lang.String r2 = com.kwad.components.ad.reward.n.c.b.b(r0)
            r1.setText(r2)
            android.widget.TextView r1 = r4.BB
            java.lang.String r2 = com.kwad.components.ad.reward.n.c.b.c(r0)
            r1.setText(r2)
            com.kwad.sdk.widget.KSRatingBar r1 = r4.BD
            float r2 = com.kwad.components.ad.reward.n.c.b.d(r0)
            r1.setStar(r2)
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r5)
            boolean r1 = com.kwad.components.ad.reward.a.b.k(r1)
            boolean r1 = com.kwad.sdk.core.response.b.e.k(r5, r1)
            r2 = 0
            r3 = 8
            if (r1 == 0) goto L53
            android.widget.Button r1 = r4.By
            com.kwad.sdk.core.response.model.AdInfo r5 = com.kwad.sdk.core.response.b.e.el(r5)
            java.lang.String r5 = com.kwad.sdk.core.response.b.a.aE(r5)
            r1.setText(r5)
            com.kwad.sdk.widget.KSRatingBar r5 = r4.BD
            r5.setVisibility(r2)
            goto L5f
        L53:
            android.widget.Button r5 = r4.By
            java.lang.String r1 = "查看详情"
            r5.setText(r1)
            com.kwad.sdk.widget.KSRatingBar r5 = r4.BD
            r5.setVisibility(r3)
        L5f:
            android.widget.Button r5 = r4.Bx
            java.lang.String r1 = r0.lb()
            r5.setText(r1)
            android.widget.Button r5 = r4.Bx
            r1 = 1
            r5.setClickable(r1)
            android.widget.Button r5 = r4.By
            r5.setClickable(r1)
            android.view.View r5 = r4.Bw
            r5.setClickable(r1)
            com.kwad.sdk.widget.h r5 = new com.kwad.sdk.widget.h
            android.widget.Button r1 = r4.Bx
            r5.<init>(r1, r4)
            com.kwad.sdk.widget.h r5 = new com.kwad.sdk.widget.h
            android.widget.Button r1 = r4.By
            r5.<init>(r1, r4)
            com.kwad.sdk.widget.h r5 = new com.kwad.sdk.widget.h
            android.view.View r1 = r4.Bw
            r5.<init>(r1, r4)
            java.util.List r5 = com.kwad.components.ad.reward.n.c.b.e(r0)
            if (r6 == 0) goto Lb6
            int r6 = r5.size()
            if (r6 != 0) goto Lb6
            android.widget.TextView r6 = r4.BB
            r6.setVisibility(r3)
            android.view.View r6 = r4.Bv
            int r1 = com.kwad.sdk.R.id.ksad_reward_apk_info_desc_2
            android.view.View r6 = r6.findViewById(r1)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r4.BC = r6
            r6.setVisibility(r2)
            android.widget.TextView r6 = r4.BC
            java.lang.String r0 = com.kwad.components.ad.reward.n.c.b.c(r0)
            r6.setText(r0)
        Lb6:
            int r6 = r5.size()
            if (r6 != 0) goto Lc1
            com.kwad.components.ad.widget.KsAppTagsView r6 = r4.BE
            r6.setVisibility(r3)
        Lc1:
            com.kwad.components.ad.widget.KsAppTagsView r6 = r4.BE
            r6.setAppTags(r5)
            java.lang.Runnable r5 = r4.BI
            if (r5 != 0) goto Ld1
            com.kwad.components.ad.reward.n.c$1 r5 = new com.kwad.components.ad.reward.n.c$1
            r5.<init>(r4)
            r4.BI = r5
        Ld1:
            android.view.View r5 = r4.Bw
            java.lang.Runnable r6 = r4.BI
            r0 = 1600(0x640, double:7.905E-321)
            r5.postDelayed(r6, r0)
            return
    }

    public final void j(java.lang.String r2, int r3) {
            r1 = this;
            android.widget.Button r0 = r1.By
            if (r0 == 0) goto Lb
            if (r2 == 0) goto Lb
            if (r3 == 0) goto Lb
            r0.setText(r2)
        Lb:
            return
    }

    public final void kZ() {
            r2 = this;
            com.kwad.components.core.e.d.c r0 = r2.mApkDownloadHelper
            if (r0 == 0) goto L7
            r0.c(r2)
        L7:
            com.kwad.components.ad.j.a r0 = r2.BH
            if (r0 == 0) goto Le
            r0.kZ()
        Le:
            android.view.View r0 = r2.Bw
            if (r0 == 0) goto L1c
            java.lang.Runnable r1 = r2.BI
            if (r1 == 0) goto L1c
            r0.removeCallbacks(r1)
            r0 = 0
            r2.BI = r0
        L1c:
            return
    }

    public final void la() {
            r1 = this;
            com.kwad.components.ad.j.a r0 = r1.BH
            r0.nF()
            return
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public final void onDownloadFailed() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            if (r0 == 0) goto Ld
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.aE(r0)
            goto Lf
        Ld:
            java.lang.String r0 = "立即下载"
        Lf:
            android.widget.Button r1 = r2.By
            r1.setText(r0)
            return
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public final void onDownloadFinished() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            goto Lb
        L7:
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.cl(r0)
        Lb:
            android.widget.Button r1 = r2.By
            r1.setText(r0)
            return
    }

    @Override // com.kwad.sdk.core.download.a.a, com.kwad.sdk.api.KsAppDownloadListener
    public final void onDownloadStarted() {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public final void onIdle() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            if (r0 == 0) goto Ld
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.aE(r0)
            goto Lf
        Ld:
            java.lang.String r0 = "立即下载"
        Lf:
            android.widget.Button r1 = r2.By
            r1.setText(r0)
            return
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public final void onInstalled() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            if (r0 == 0) goto Ld
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.ac(r0)
            goto Lf
        Ld:
            java.lang.String r0 = "立即打开"
        Lf:
            android.widget.Button r1 = r2.By
            r1.setText(r0)
            return
    }

    @Override // com.kwad.sdk.core.download.a.a
    public final void onPaused(int r2) {
            r1 = this;
            super.onPaused(r2)
            if (r2 == 0) goto L13
            com.kwad.components.ad.j.a r0 = r1.BH
            r0.nF()
            android.widget.Button r0 = r1.By
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.dG(r2)
            r0.setText(r2)
        L13:
            return
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public final void onProgressUpdate(int r2) {
            r1 = this;
            if (r2 == 0) goto L10
            com.kwad.components.ad.j.a r0 = r1.BH
            r0.nF()
            android.widget.Button r0 = r1.By
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.dF(r2)
            r0.setText(r2)
        L10:
            return
    }
}
