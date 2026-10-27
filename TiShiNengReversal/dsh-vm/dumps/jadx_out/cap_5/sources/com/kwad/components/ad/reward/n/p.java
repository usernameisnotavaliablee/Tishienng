package com.kwad.components.ad.reward.n;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class p extends com.kwad.components.ad.reward.n.s implements android.view.View.OnClickListener {
    private android.widget.ImageView Dh;
    private android.widget.TextView Di;
    private android.widget.TextView Dj;
    private android.widget.TextView Dk;
    private android.widget.TextView Dl;
    private android.widget.TextView Dm;
    private android.widget.TextView Dn;
    private android.widget.TextView Do;
    private com.kwad.components.ad.reward.g tm;

    public p(com.kwad.components.ad.reward.g r1) {
            r0 = this;
            r0.<init>()
            r0.tm = r1
            return
    }

    private void initView() {
            r2 = this;
            android.view.ViewGroup r0 = r2.vV
            if (r0 != 0) goto L5
            return
        L5:
            com.kwad.components.ad.reward.g r0 = r2.tm
            android.content.Context r0 = r0.mContext
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r1 = 2
            if (r0 != r1) goto L77
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_live_end_page_author_icon_landscape
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.Dh = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_author_name_txt_landscape
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Di = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_live_end_detail_watch_person_count_landscape
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Dj = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_live_end_detail_like_person_count_landscape
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Dk = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_live_end_detail_watch_time_landscape
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Dl = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_live_end_bottom_title_landscape
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Dm = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_live_end_bottom_action_btn_landscape
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Dn = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_live_end_bottom_des_btn_landscape
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Do = r0
            goto Ld7
        L77:
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_live_end_page_author_icon
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.Dh = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_author_name_txt
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Di = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_live_end_detail_watch_person_count
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Dj = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_live_end_detail_like_person_count
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Dk = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_live_end_detail_watch_time
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Dl = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_live_end_bottom_title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Dm = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_live_end_bottom_action_btn
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Dn = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_live_end_bottom_des_btn
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Do = r0
        Ld7:
            android.widget.TextView r0 = r2.Dn
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.Do
            r0.setOnClickListener(r2)
            return
    }

    private void j(com.kwad.sdk.core.response.model.AdTemplate r4) {
            r3 = this;
            com.kwad.sdk.core.response.model.AdInfo r4 = com.kwad.sdk.core.response.b.e.el(r4)
            android.widget.ImageView r0 = r3.Dh
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.drawable.ksad_ic_default_user_avatar
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            android.widget.ImageView r1 = r3.Dh
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.co(r4)
            com.kwad.sdk.core.imageloader.KSImageLoader.loadCircleIcon(r1, r2, r0)
            android.widget.TextView r0 = r3.Di
            java.lang.String r4 = com.kwad.sdk.core.response.b.a.cl(r4)
            r0.setText(r4)
            return
    }

    private static java.lang.String r(long r10) {
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r0 = r10 / r0
            r2 = 24
            long r0 = r0 % r2
            r2 = 60000(0xea60, double:2.9644E-319)
            long r2 = r10 / r2
            r4 = 60
            long r2 = r2 % r4
            r6 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r6
            long r10 = r10 % r4
            r4 = 0
            r6 = 2
            r7 = 1
            r8 = 0
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 <= 0) goto L39
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r11 = 3
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r8] = r0
            r11[r7] = r1
            r11[r6] = r10
            java.lang.String r10 = "%02d:%02d:%02d"
            java.lang.String r10 = java.lang.String.format(r10, r11)
            return r10
        L39:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r11[r8] = r0
            r11[r7] = r10
            java.lang.String r10 = "%02d:%02d"
            java.lang.String r10 = java.lang.String.format(r10, r11)
            return r10
    }

    public final void a(com.kwad.components.ad.reward.g r4, com.kwad.components.ad.reward.model.AdLiveEndResultData.AdLivePushEndInfo r5, long r6) {
            r3 = this;
            android.widget.TextView r0 = r3.Dk
            java.lang.String r1 = r5.mDisplayLikeUserCount
            r0.setText(r1)
            android.widget.TextView r0 = r3.Dl
            long r1 = r5.mLiveDuration
            java.lang.String r1 = r(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r3.Dj
            java.lang.String r5 = r5.mDisplayWatchingUserCount
            r0.setText(r5)
            boolean r5 = r4.rS
            if (r5 == 0) goto L75
            com.kwad.sdk.core.response.model.AdTemplate r4 = r4.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r4 = com.kwad.sdk.core.response.b.e.el(r4)
            long r4 = com.kwad.sdk.core.response.b.a.ag(r4)
            long r4 = r4 - r6
            r6 = 0
            long r4 = java.lang.Math.max(r4, r6)
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            int r5 = (int) r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r4
            java.lang.String r4 = "再停留%s秒，即可获得奖励"
            java.lang.String r4 = java.lang.String.format(r4, r5)
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r4)
            android.view.ViewGroup r6 = r3.hP()
            android.content.res.Resources r6 = r6.getResources()
            int r7 = com.kwad.sdk.R.color.ksad_reward_main_color
            int r6 = r6.getColor(r7)
            android.text.style.ForegroundColorSpan r7 = new android.text.style.ForegroundColorSpan
            r7.<init>(r6)
            r0 = 3
            r1 = 6
            r2 = 18
            r5.setSpan(r7, r0, r1, r2)
            android.text.style.ForegroundColorSpan r7 = new android.text.style.ForegroundColorSpan
            r7.<init>(r6)
            int r4 = r4.length()
            int r6 = r4 + (-2)
            r5.setSpan(r7, r6, r4, r2)
            android.widget.TextView r4 = r3.Dm
            r4.setText(r5)
            return
        L75:
            android.widget.TextView r4 = r3.Dm
            java.lang.String r5 = "内容很精彩，不要错过哦"
            r4.setText(r5)
            return
    }

    @Override // com.kwad.components.ad.reward.n.d
    protected final void a(com.kwad.components.ad.reward.n.r r1) {
            r0 = this;
            super.a(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.getAdTemplate()
            r0.j(r1)
            return
    }

    public final void ah(int r7) {
            r6 = this;
            android.widget.TextView r0 = r6.Dm
            if (r0 == 0) goto L58
            java.lang.String r1 = "已获得奖励"
            if (r7 <= 0) goto L55
            com.kwad.components.ad.reward.g r2 = r6.tm
            boolean r2 = r2.rS
            if (r2 == 0) goto L51
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r7
            java.lang.String r7 = "再停留%s秒，即可获得奖励"
            java.lang.String r7 = java.lang.String.format(r7, r0)
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r7)
            android.view.ViewGroup r1 = r6.hP()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.kwad.sdk.R.color.ksad_reward_main_color
            int r1 = r1.getColor(r2)
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            r2.<init>(r1)
            r3 = 3
            r4 = 6
            r5 = 18
            r0.setSpan(r2, r3, r4, r5)
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            r2.<init>(r1)
            int r7 = r7.length()
            int r1 = r7 + (-2)
            r0.setSpan(r2, r1, r7, r5)
            android.widget.TextView r7 = r6.Dm
            r7.setText(r0)
            return
        L51:
            r0.setText(r1)
            return
        L55:
            r0.setText(r1)
        L58:
            return
    }

    public final void h(android.view.ViewGroup r3) {
            r2 = this;
            com.kwad.components.ad.reward.g r0 = r2.tm
            android.content.Context r0 = r0.mContext
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r1 = 2
            if (r0 != r1) goto L19
            int r0 = com.kwad.sdk.R.id.ksad_reward_origin_live_end_page_stub_landscape
            int r1 = com.kwad.sdk.R.id.ksad_live_end_page_layout_root_landscape
            super.a(r3, r0, r1)
            goto L20
        L19:
            int r0 = com.kwad.sdk.R.id.ksad_reward_origin_live_end_page_stub
            int r1 = com.kwad.sdk.R.id.ksad_live_end_page_layout_root
            super.a(r3, r0, r1)
        L20:
            r2.initView()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r10) {
            r9 = this;
            com.kwad.sdk.core.adlog.c.b r8 = new com.kwad.sdk.core.adlog.c.b
            r8.<init>()
            r0 = 24
            r8.dm(r0)
            android.widget.TextView r0 = r9.Dn
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L23
            com.kwad.components.ad.reward.g r0 = r9.tm
            android.content.Context r2 = r10.getContext()
            r5 = 0
            r7 = 0
            r1 = 2
            r3 = 38
            r4 = 1
            r0.a(r1, r2, r3, r4, r5, r7, r8)
            return
        L23:
            android.widget.TextView r0 = r9.Do
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L3b
            com.kwad.components.ad.reward.g r0 = r9.tm
            android.content.Context r2 = r10.getContext()
            r5 = 0
            r7 = 0
            r1 = 2
            r3 = 37
            r4 = 1
            r0.a(r1, r2, r3, r4, r5, r7, r8)
        L3b:
            return
    }
}
