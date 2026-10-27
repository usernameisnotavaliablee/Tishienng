package com.kwad.components.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h extends com.kwad.components.core.proxy.j {
    private static java.lang.String sM = "进阶奖励还差 %s 步到手，\n确认放弃吗？";
    private static java.lang.String sN = "再观看%ss可获得基础奖励，\n确认放弃吗？";
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.ad.reward.h.a sL;











    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a extends com.kwad.components.core.webview.tachikoma.f.c {
        void h(int r1, int r2);

        void hh();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b implements com.kwad.components.ad.reward.h.a {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.kwad.components.core.webview.tachikoma.f.c
        public void G(boolean r1) {
                r0 = this;
                return
        }

        @Override // com.kwad.components.ad.reward.h.a
        public void h(int r1, int r2) {
                r0 = this;
                return
        }

        @Override // com.kwad.components.core.webview.tachikoma.f.c
        public void ha() {
                r0 = this;
                return
        }

        @Override // com.kwad.components.ad.reward.h.a
        public void hh() {
                r0 = this;
                return
        }

        @Override // com.kwad.components.core.webview.tachikoma.f.c
        public void hi() {
                r0 = this;
                return
        }

        @Override // com.kwad.components.core.webview.tachikoma.f.c
        public void hj() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class c extends com.kwad.sdk.core.response.a.a {
        public java.lang.String sS;
        public java.lang.String sT;
        public java.lang.String sU;
        public java.lang.String sV;
        public java.lang.String sW;
        public java.lang.String sX;
        public java.lang.String sY;
        public java.lang.String sZ;
        public com.kwad.components.ad.reward.l.b.a sm;
        public com.kwad.components.ad.reward.l.a.a sn;
        public int style;
        public java.lang.String title;

        private c() {
                r0 = this;
                r0.<init>()
                return
        }

        static com.kwad.components.ad.reward.h.c E(java.lang.String r2) {
                com.kwad.components.ad.reward.h$c r0 = new com.kwad.components.ad.reward.h$c
                r0.<init>()
                r1 = 0
                r0.style = r1
                r0.title = r2
                java.lang.String r2 = "关闭广告"
                r0.sS = r2
                java.lang.String r2 = "继续观看"
                r0.sT = r2
                return r0
        }

        public static com.kwad.components.ad.reward.h.c F(java.lang.String r2) {
                com.kwad.components.ad.reward.h$c r0 = new com.kwad.components.ad.reward.h$c
                r0.<init>()
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> Ld
                r1.<init>(r2)     // Catch: org.json.JSONException -> Ld
                r0.parseJson(r1)     // Catch: org.json.JSONException -> Ld
            Ld:
                return r0
        }

        private void G(java.lang.String r1) {
                r0 = this;
                r0.sZ = r1
                return
        }

        static com.kwad.components.ad.reward.h.c a(com.kwad.components.ad.reward.l.a.a r2, com.kwad.sdk.core.response.model.AdTemplate r3, java.lang.String r4) {
                com.kwad.components.ad.reward.h$c r0 = new com.kwad.components.ad.reward.h$c
                r0.<init>()
                r1 = 2
                r0.style = r1
                r0.sn = r2
                r0.sV = r4
                com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r3)
                java.lang.String r2 = com.kwad.sdk.core.response.b.a.co(r2)
                r0.sW = r2
                return r0
        }

        static com.kwad.components.ad.reward.h.c a(com.kwad.components.ad.reward.l.b.a r2, com.kwad.sdk.core.response.model.AdTemplate r3, java.lang.String r4) {
                com.kwad.components.ad.reward.h$c r0 = new com.kwad.components.ad.reward.h$c
                r0.<init>()
                r1 = 1
                r0.style = r1
                r0.sm = r2
                r0.sV = r4
                com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r3)
                java.lang.String r2 = com.kwad.sdk.core.response.b.a.co(r2)
                r0.sW = r2
                return r0
        }

        public static com.kwad.components.ad.reward.h.c a(com.kwad.sdk.core.response.model.AdInfo r3, long r4) {
                com.kwad.components.ad.reward.h$c r0 = new com.kwad.components.ad.reward.h$c
                r0.<init>()
                r1 = 5
                r0.style = r1
                com.kwad.sdk.core.response.model.AdProductInfo r1 = com.kwad.sdk.core.response.b.a.cV(r3)
                java.lang.String r2 = com.kwad.sdk.core.response.b.a.au(r3)
                r0.sX = r2
                java.lang.String r2 = r1.getName()
                r0.title = r2
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 == 0) goto L24
                java.lang.String r3 = com.kwad.sdk.core.response.b.a.ax(r3)
                r0.title = r3
            L24:
                java.lang.String r3 = r1.getIcon()
                r0.sW = r3
                r1 = 0
                int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r3 <= 0) goto L38
                java.lang.String r3 = java.lang.String.valueOf(r4)
                r0.G(r3)
                return r0
            L38:
                r3 = 0
                r0.G(r3)
                return r0
        }

        static com.kwad.components.ad.reward.h.c c(com.kwad.sdk.core.response.model.AdTemplate r3, long r4) {
                com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
                com.kwad.components.ad.reward.h$c r1 = new com.kwad.components.ad.reward.h$c
                r1.<init>()
                r2 = 8
                r1.style = r2
                java.lang.String r2 = com.kwad.sdk.core.response.b.a.co(r0)
                r1.sW = r2
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r2 = 0
                r5[r2] = r4
                java.lang.String r4 = "再看%s秒，可获得奖励"
                java.lang.String r4 = java.lang.String.format(r4, r5)
                r1.title = r4
                java.lang.String r4 = com.kwad.sdk.core.response.b.a.cl(r0)
                r1.sX = r4
                java.lang.String r4 = com.kwad.sdk.core.response.b.a.au(r0)
                r1.sY = r4
                java.lang.String r4 = "放弃奖励"
                r1.sS = r4
                java.lang.String r4 = "继续观看"
                r1.sT = r4
                com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)
                java.lang.String r3 = com.kwad.sdk.core.response.b.a.aE(r3)
                r1.sU = r3
                return r1
        }

        static com.kwad.components.ad.reward.h.c d(com.kwad.sdk.core.response.model.AdTemplate r3, long r4) {
                com.kwad.sdk.core.response.model.AdMatrixInfo$MerchantLiveReservationInfo r0 = com.kwad.sdk.core.response.b.b.dt(r3)
                com.kwad.components.ad.reward.h$c r1 = new com.kwad.components.ad.reward.h$c
                r1.<init>()
                r2 = 8
                r1.style = r2
                java.lang.String r2 = r0.userHeadUrl
                r1.sW = r2
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r2 = 0
                r5[r2] = r4
                java.lang.String r4 = "再看%s秒，可获得奖励"
                java.lang.String r4 = java.lang.String.format(r4, r5)
                r1.title = r4
                java.lang.String r4 = r0.title
                r1.sX = r4
                java.lang.String r4 = "放弃奖励"
                r1.sS = r4
                java.lang.String r4 = "继续观看"
                r1.sT = r4
                com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)
                java.lang.String r3 = com.kwad.sdk.core.response.b.a.aE(r3)
                r1.sU = r3
                return r1
        }

        static com.kwad.components.ad.reward.h.c h(com.kwad.sdk.core.response.model.AdInfo r2) {
                com.kwad.components.ad.reward.h$c r0 = new com.kwad.components.ad.reward.h$c
                r0.<init>()
                r1 = 4
                r0.style = r1
                com.kwad.sdk.core.response.model.AdProductInfo r1 = com.kwad.sdk.core.response.b.a.cV(r2)
                java.lang.String r2 = com.kwad.sdk.core.response.b.a.au(r2)
                r0.title = r2
                java.lang.String r2 = r1.getIcon()
                r0.sW = r2
                return r0
        }

        public static com.kwad.components.ad.reward.h.c h(java.lang.String r2, int r3) {
                com.kwad.components.ad.reward.h$c r0 = new com.kwad.components.ad.reward.h$c
                r0.<init>()
                r1 = 6
                r0.style = r1
                r0.title = r2
                java.lang.String r2 = "残忍离开"
                r0.sS = r2
                java.lang.String r2 = "留下看看"
                r0.sT = r2
                if (r3 <= 0) goto L1a
                java.lang.String r2 = java.lang.String.valueOf(r3)
                r0.sZ = r2
            L1a:
                return r0
        }

        static com.kwad.components.ad.reward.h.c n(long r4) {
                com.kwad.components.ad.reward.h$c r0 = new com.kwad.components.ad.reward.h$c
                r0.<init>()
                r1 = 6
                r0.style = r1
                java.lang.String r1 = "残忍离开"
                r0.sS = r1
                java.lang.String r1 = "留下看看"
                r0.sT = r1
                r1 = 0
                int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r3 <= 0) goto L1e
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r0.G(r4)
                return r0
            L1e:
                r4 = 0
                r0.G(r4)
                return r0
        }

        @Override // com.kwad.sdk.core.response.a.a
        public void afterParseJson(@androidx.annotation.Nullable org.json.JSONObject r3) {
                r2 = this;
                super.afterParseJson(r3)
                java.lang.String r0 = "mLaunchAppTask"
                org.json.JSONObject r0 = r3.optJSONObject(r0)
                if (r0 == 0) goto L1b
                com.kwad.components.ad.reward.l.b.a r1 = r2.sm
                if (r1 != 0) goto L16
                com.kwad.components.ad.reward.l.b.a r1 = new com.kwad.components.ad.reward.l.b.a
                r1.<init>()
                r2.sm = r1
            L16:
                com.kwad.components.ad.reward.l.b.a r1 = r2.sm
                r1.parseJson(r0)
            L1b:
                java.lang.String r0 = "mLandPageOpenTask"
                org.json.JSONObject r3 = r3.optJSONObject(r0)
                if (r3 == 0) goto L33
                com.kwad.components.ad.reward.l.a.a r0 = r2.sn
                if (r0 != 0) goto L2e
                com.kwad.components.ad.reward.l.a.a r0 = new com.kwad.components.ad.reward.l.a.a
                r0.<init>()
                r2.sn = r0
            L2e:
                com.kwad.components.ad.reward.l.a.a r0 = r2.sn
                r0.parseJson(r3)
            L33:
                return
        }

        @Override // com.kwad.sdk.core.response.a.a
        public void afterToJson(org.json.JSONObject r3) {
                r2 = this;
                super.afterToJson(r3)
                com.kwad.components.ad.reward.l.b.a r0 = r2.sm
                if (r0 == 0) goto Lc
                java.lang.String r1 = "mLaunchAppTask"
                com.kwad.sdk.utils.aa.a(r3, r1, r0)
            Lc:
                com.kwad.components.ad.reward.l.a.a r0 = r2.sn
                if (r0 == 0) goto L15
                java.lang.String r1 = "mLandPageOpenTask"
                com.kwad.sdk.utils.aa.a(r3, r1, r0)
            L15:
                return
        }

        public final int getStyle() {
                r1 = this;
                int r0 = r1.style
                return r0
        }

        public final java.lang.String getTitle() {
                r1 = this;
                java.lang.String r0 = r1.title
                return r0
        }

        public final java.lang.String hk() {
                r1 = this;
                java.lang.String r0 = r1.sS
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto Lb
                java.lang.String r0 = "关闭广告"
                return r0
            Lb:
                java.lang.String r0 = r1.sS
                return r0
        }

        public final java.lang.String hl() {
                r1 = this;
                java.lang.String r0 = r1.sT
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto Lb
                java.lang.String r0 = "继续观看"
                return r0
            Lb:
                java.lang.String r0 = r1.sT
                return r0
        }

        public final com.kwad.components.ad.reward.l.b.a hm() {
                r1 = this;
                com.kwad.components.ad.reward.l.b.a r0 = r1.sm
                return r0
        }

        public final com.kwad.components.ad.reward.l.a.a hn() {
                r1 = this;
                com.kwad.components.ad.reward.l.a.a r0 = r1.sn
                return r0
        }

        public final java.lang.String ho() {
                r1 = this;
                java.lang.String r0 = r1.sW
                return r0
        }

        public final java.lang.String hp() {
                r1 = this;
                java.lang.String r0 = r1.sX
                return r0
        }

        public final java.lang.String hq() {
                r1 = this;
                java.lang.String r0 = r1.sY
                return r0
        }

        public final java.lang.String hr() {
                r3 = this;
                java.lang.String r0 = r3.sZ
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto Lb
                java.lang.String r0 = ""
                return r0
            Lb:
                java.lang.String r0 = r3.sZ
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r0
                java.lang.String r0 = "再看%s秒，可获得优惠"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                return r0
        }
    }

    static {
            return
    }

    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.view.View a(android.app.DialogFragment r2, android.view.LayoutInflater r3, android.view.ViewGroup r4, com.kwad.components.ad.reward.h.c r5, com.kwad.components.ad.reward.h.a r6) {
            int r0 = com.kwad.sdk.R.layout.ksad_video_close_dialog
            r1 = 0
            android.view.View r3 = r3.inflate(r0, r4, r1)
            int r4 = com.kwad.sdk.R.id.ksad_title
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r0 = r5.getTitle()
            r4.setText(r0)
            int r4 = com.kwad.sdk.R.id.ksad_close_btn
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            int r0 = com.kwad.sdk.R.id.ksad_continue_btn
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = r5.hk()
            r4.setText(r1)
            java.lang.String r5 = r5.hl()
            r0.setText(r5)
            com.kwad.components.ad.reward.h$3 r5 = new com.kwad.components.ad.reward.h$3
            r5.<init>(r2, r6)
            r4.setOnClickListener(r5)
            com.kwad.components.ad.reward.h$4 r4 = new com.kwad.components.ad.reward.h$4
            r4.<init>(r2, r6)
            r0.setOnClickListener(r4)
            return r3
    }

    private static android.view.View a(android.app.DialogFragment r7, android.view.LayoutInflater r8, android.view.ViewGroup r9, com.kwad.components.ad.reward.h.c r10, com.kwad.sdk.core.response.model.AdTemplate r11, com.kwad.components.ad.reward.h.a r12) {
            com.kwad.components.ad.reward.l.b.a r0 = r10.hm()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            android.view.View r7 = a(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    private android.view.View a(com.kwad.components.ad.reward.h r3, android.view.LayoutInflater r4, @androidx.annotation.Nullable android.view.ViewGroup r5, com.kwad.components.ad.reward.h.c r6, com.kwad.components.ad.reward.h.a r7) {
            r2 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_video_close_extend_dialog
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r5, r1)
            int r5 = com.kwad.sdk.R.id.ksad_reward_close_extend_dialog_play_time_tips
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = r6.sZ
            android.text.SpannableString r0 = f(r0, r1)
            r5.setText(r0)
            int r5 = com.kwad.sdk.R.id.ksad_reward_close_extend_dialog_btn_deny
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            int r0 = com.kwad.sdk.R.id.ksad_reward_close_extend_dialog_btn_continue
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = r6.hk()
            r5.setText(r1)
            java.lang.String r6 = r6.hl()
            r0.setText(r6)
            com.kwad.components.ad.reward.h$5 r6 = new com.kwad.components.ad.reward.h$5
            r6.<init>(r2, r3, r7)
            r5.setOnClickListener(r6)
            com.kwad.components.ad.reward.h$6 r5 = new com.kwad.components.ad.reward.h$6
            r5.<init>(r2, r3, r7)
            r0.setOnClickListener(r5)
            return r4
    }

    private static android.view.View a(com.kwad.components.ad.reward.l.a r6, android.app.DialogFragment r7, android.view.LayoutInflater r8, android.view.ViewGroup r9, com.kwad.components.ad.reward.h.c r10, com.kwad.sdk.core.response.model.AdTemplate r11, com.kwad.components.ad.reward.h.a r12) {
            int r0 = com.kwad.sdk.R.layout.ksad_reward_task_launch_app_dialog
            r1 = 0
            android.view.View r8 = r8.inflate(r0, r9, r1)
            boolean r9 = r6 instanceof com.kwad.components.ad.reward.l.b.a
            if (r9 == 0) goto L15
            r9 = r6
            com.kwad.components.ad.reward.l.b.a r9 = (com.kwad.components.ad.reward.l.b.a) r9
            android.content.Context r0 = r8.getContext()
            com.kwad.components.ad.reward.l.b.a.a(r9, r0, r11)
        L15:
            int r9 = com.kwad.sdk.R.id.ksad_reward_task_dialog_steps
            android.view.View r9 = r8.findViewById(r9)
            com.kwad.components.ad.reward.widget.RewardTaskStepView r9 = (com.kwad.components.ad.reward.widget.RewardTaskStepView) r9
            java.util.List r0 = r6.kA()
            java.lang.String r2 = r10.sV
            r9.a(r0, r2)
            int r9 = com.kwad.sdk.R.id.ksad_reward_task_dialog_icon
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            java.lang.String r0 = r10.ho()
            r2 = 12
            com.kwad.sdk.core.imageloader.KSImageLoader.loadAppIcon(r9, r0, r11, r2)
            int r9 = com.kwad.sdk.R.id.ksad_reward_task_dialog_abandon
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            int r11 = com.kwad.sdk.R.id.ksad_reward_task_dialog_continue
            android.view.View r11 = r8.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            int r0 = com.kwad.sdk.R.id.ksad_reward_task_dialog_title
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r6 = r6.kB()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            java.lang.String r10 = r10.sV
            java.lang.String r2 = "0"
            boolean r2 = r2.equals(r10)
            r3 = 1
            if (r2 == 0) goto L75
            java.lang.String r4 = com.kwad.components.ad.reward.h.sM
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r1] = r6
            java.lang.String r1 = java.lang.String.format(r4, r5)
            goto L7f
        L75:
            java.lang.String r4 = com.kwad.components.ad.reward.h.sN
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r1] = r10
            java.lang.String r1 = java.lang.String.format(r4, r5)
        L7f:
            if (r2 == 0) goto L86
            int r6 = r1.indexOf(r6)
            goto L8a
        L86:
            int r6 = r1.indexOf(r10)
        L8a:
            if (r6 >= 0) goto L90
            r0.setText(r1)
            goto Lc0
        L90:
            if (r2 == 0) goto L95
            int r10 = r6 + 1
            goto La0
        L95:
            int r10 = r10.length()
            if (r10 <= r3) goto L9e
            int r10 = r6 + 3
            goto La0
        L9e:
            int r10 = r6 + 2
        La0:
            android.content.Context r2 = r8.getContext()
            android.content.res.Resources r2 = r2.getResources()
            int r3 = com.kwad.sdk.R.color.ksad_reward_main_color
            int r2 = r2.getColor(r3)
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            r3.<init>(r2)
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r1)
            r1 = 17
            r2.setSpan(r3, r6, r10, r1)
            r0.setText(r2)
        Lc0:
            com.kwad.components.ad.reward.h$7 r6 = new com.kwad.components.ad.reward.h$7
            r6.<init>(r7, r12)
            r9.setOnClickListener(r6)
            com.kwad.components.ad.reward.h$8 r6 = new com.kwad.components.ad.reward.h$8
            r6.<init>(r7, r12)
            r11.setOnClickListener(r6)
            return r8
    }

    public static com.kwad.components.ad.reward.h.c a(com.kwad.components.ad.reward.g r13, @androidx.annotation.Nullable java.lang.String r14) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r13.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.components.ad.reward.l.b.a r2 = r13.sm
            com.kwad.components.ad.reward.l.a.a r3 = r13.sn
            int r4 = r13.so
            com.kwad.sdk.core.response.model.AdInfo r5 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r5 = com.kwad.components.ad.reward.a.b.k(r5)
            boolean r5 = com.kwad.sdk.core.response.b.e.k(r0, r5)
            r6 = 0
            if (r5 != 0) goto L21
            boolean r7 = com.kwad.sdk.core.response.b.e.O(r0)
            if (r7 == 0) goto L4a
        L21:
            long r7 = com.kwad.sdk.core.response.b.a.ad(r1)
            int r8 = (int) r7
            int r7 = com.kwad.sdk.core.response.b.a.L(r1)
            if (r8 <= r7) goto L2d
            r8 = r7
        L2d:
            com.kwad.components.ad.reward.m.e r13 = r13.rE
            long r9 = r13.getPlayDuration()
            int r13 = r8 * 1000
            int r13 = r13 + (-800)
            long r11 = (long) r13
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L4a
            float r13 = (float) r8
            float r7 = (float) r9
            r8 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r7 / r8
            r8 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r8
            float r13 = r13 - r7
            int r13 = (int) r13
            if (r13 >= 0) goto L49
            goto L4a
        L49:
            r6 = r13
        L4a:
            if (r5 == 0) goto L57
            if (r2 == 0) goto L57
            java.lang.String r13 = java.lang.String.valueOf(r6)
            com.kwad.components.ad.reward.h$c r13 = com.kwad.components.ad.reward.h.c.a(r2, r0, r13)
            return r13
        L57:
            boolean r13 = com.kwad.sdk.core.response.b.e.O(r0)
            if (r13 == 0) goto L68
            if (r3 == 0) goto L68
            java.lang.String r13 = java.lang.String.valueOf(r6)
            com.kwad.components.ad.reward.h$c r13 = com.kwad.components.ad.reward.h.c.a(r3, r0, r13)
            return r13
        L68:
            boolean r13 = com.kwad.components.ad.reward.a.b.i(r1)
            if (r13 == 0) goto L73
            com.kwad.components.ad.reward.h$c r13 = com.kwad.components.ad.reward.h.c.h(r1)
            return r13
        L73:
            int r13 = com.kwad.sdk.core.response.b.a.cj(r1)
            r2 = 1
            if (r13 != r2) goto L86
            int r13 = com.kwad.components.ad.reward.a.b.hJ()
            if (r13 != r2) goto L86
            long r13 = (long) r4
            com.kwad.components.ad.reward.h$c r13 = com.kwad.components.ad.reward.h.c.a(r1, r13)
            return r13
        L86:
            boolean r13 = r0.isNativeRewardPreview
            if (r13 == 0) goto L8f
            com.kwad.components.ad.reward.h$c r13 = com.kwad.components.ad.reward.h.c.h(r14, r4)
            return r13
        L8f:
            boolean r13 = com.kwad.sdk.core.response.b.a.cR(r1)
            if (r13 == 0) goto L9b
            long r13 = (long) r4
            com.kwad.components.ad.reward.h$c r13 = com.kwad.components.ad.reward.h.c.c(r0, r13)
            return r13
        L9b:
            boolean r13 = com.kwad.sdk.core.response.b.a.co(r0)
            if (r13 == 0) goto La7
            long r13 = (long) r4
            com.kwad.components.ad.reward.h$c r13 = com.kwad.components.ad.reward.h.c.d(r0, r13)
            return r13
        La7:
            int r13 = com.kwad.components.ad.reward.a.b.hD()
            if (r13 != r2) goto Lb3
            long r13 = (long) r4
            com.kwad.components.ad.reward.h$c r13 = com.kwad.components.ad.reward.h.c.n(r13)
            return r13
        Lb3:
            com.kwad.components.ad.reward.h$c r13 = com.kwad.components.ad.reward.h.c.E(r14)
            return r13
    }

    public static com.kwad.components.ad.reward.h a(android.app.Activity r3, com.kwad.sdk.core.response.model.AdTemplate r4, com.kwad.components.ad.reward.h.c r5, com.kwad.components.ad.reward.h.a r6) {
            com.kwad.components.ad.reward.h r0 = new com.kwad.components.ad.reward.h
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            org.json.JSONObject r5 = r5.toJson()
            java.lang.String r5 = r5.toString()
            java.lang.String r2 = "key_params_json"
            r1.putString(r2, r5)
            org.json.JSONObject r4 = r4.toJson()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "key_template_json"
            r1.putString(r5, r4)
            r0.setArguments(r1)
            r0.a(r6)
            android.app.FragmentManager r3 = r3.getFragmentManager()
            java.lang.String r4 = "videoCloseDialog"
            r0.show(r3, r4)
            return r0
    }

    private void a(com.kwad.components.ad.reward.h.a r1) {
            r0 = this;
            r0.sL = r1
            return
    }

    private static android.view.View b(android.app.DialogFragment r7, android.view.LayoutInflater r8, android.view.ViewGroup r9, com.kwad.components.ad.reward.h.c r10, com.kwad.sdk.core.response.model.AdTemplate r11, com.kwad.components.ad.reward.h.a r12) {
            com.kwad.components.ad.reward.l.a.a r0 = r10.hn()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            android.view.View r7 = a(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    private static android.view.View c(android.app.DialogFragment r2, android.view.LayoutInflater r3, android.view.ViewGroup r4, com.kwad.components.ad.reward.h.c r5, com.kwad.sdk.core.response.model.AdTemplate r6, com.kwad.components.ad.reward.h.a r7) {
            int r0 = com.kwad.sdk.R.layout.ksad_reward_order_dialog
            r1 = 0
            android.view.View r3 = r3.inflate(r0, r4, r1)
            int r4 = com.kwad.sdk.R.id.ksad_reward_order_dialog_icon
            android.view.View r4 = r3.findViewById(r4)
            com.kwad.components.core.widget.KSCornerImageView r4 = (com.kwad.components.core.widget.KSCornerImageView) r4
            java.lang.String r0 = r5.sW
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r4, r0, r6)
            int r4 = com.kwad.sdk.R.id.ksad_reward_order_dialog_desc
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r5 = r5.getTitle()
            r4.setText(r5)
            int r4 = com.kwad.sdk.R.id.ksad_reward_order_dialog_btn_close
            android.view.View r4 = r3.findViewById(r4)
            com.kwad.components.ad.reward.h$9 r5 = new com.kwad.components.ad.reward.h$9
            r5.<init>(r2, r7)
            r4.setOnClickListener(r5)
            int r4 = com.kwad.sdk.R.id.ksad_reward_order_dialog_btn_view_detail
            android.view.View r4 = r3.findViewById(r4)
            com.kwad.components.ad.reward.h$10 r5 = new com.kwad.components.ad.reward.h$10
            r5.<init>(r7)
            r4.setOnClickListener(r5)
            int r4 = com.kwad.sdk.R.id.ksad_reward_order_dialog_btn_deny
            android.view.View r4 = r3.findViewById(r4)
            com.kwad.components.ad.reward.h$2 r5 = new com.kwad.components.ad.reward.h$2
            r5.<init>(r2, r7)
            r4.setOnClickListener(r5)
            return r3
    }

    private static android.text.SpannableString f(android.content.Context r6, java.lang.String r7) {
            android.text.SpannableString r0 = new android.text.SpannableString
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "再看"
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = "秒，即可获得奖励"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            android.text.style.ForegroundColorSpan r7 = new android.text.style.ForegroundColorSpan
            int r1 = com.kwad.sdk.R.color.ksad_reward_main_color
            int r2 = com.kwad.sdk.c.a.a.getColor(r6, r1)
            r7.<init>(r2)
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            int r6 = com.kwad.sdk.c.a.a.getColor(r6, r1)
            r2.<init>(r6)
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r1 = 1
            r6.<init>(r1)
            int r1 = r0.length()
            int r3 = r1 + (-7)
            r4 = 2
            r5 = 34
            r0.setSpan(r7, r4, r3, r5)
            int r7 = r1 + (-2)
            r0.setSpan(r2, r7, r1, r5)
            r7 = 0
            r0.setSpan(r6, r7, r1, r5)
            return r0
    }

    public static com.kwad.components.ad.reward.h.c g(java.lang.String r0, int r1) {
            com.kwad.components.ad.reward.h$c r0 = com.kwad.components.ad.reward.h.c.h(r0, r1)
            return r0
    }

    @Override // com.kwad.components.core.proxy.j
    @androidx.annotation.Nullable
    public final android.view.View a(@androidx.annotation.NonNull android.view.LayoutInflater r8, @androidx.annotation.Nullable android.view.ViewGroup r9) {
            r7 = this;
            android.os.Bundle r1 = r7.getArguments()
            java.lang.String r2 = "key_params_json"
            java.lang.String r2 = r1.getString(r2)
            java.lang.String r3 = "key_template_json"
            java.lang.String r1 = r1.getString(r3)     // Catch: java.lang.Throwable -> L20
            com.kwad.sdk.core.response.model.AdTemplate r3 = new com.kwad.sdk.core.response.model.AdTemplate     // Catch: java.lang.Throwable -> L20
            r3.<init>()     // Catch: java.lang.Throwable -> L20
            r7.mAdTemplate = r3     // Catch: java.lang.Throwable -> L20
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L20
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r3.parseJson(r4)     // Catch: java.lang.Throwable -> L20
            goto L21
        L20:
        L21:
            com.kwad.components.ad.reward.h$c r6 = com.kwad.components.ad.reward.h.c.F(r2)
            int r1 = r6.getStyle()
            r2 = 1
            if (r1 == r2) goto La2
            r2 = 2
            if (r1 == r2) goto L95
            r2 = 4
            if (r1 == r2) goto L7d
            r2 = 5
            if (r1 == r2) goto L67
            r2 = 6
            if (r1 == r2) goto L5b
            r2 = 8
            if (r1 == r2) goto L44
            com.kwad.components.ad.reward.h$a r1 = r7.sL
            android.view.View r1 = a(r7, r8, r9, r6, r1)
            goto Lae
        L44:
            com.kwad.components.ad.reward.n.m r1 = new com.kwad.components.ad.reward.n.m
            com.kwad.sdk.core.response.model.AdTemplate r2 = r7.mAdTemplate
            com.kwad.components.ad.reward.h$a r5 = r7.sL
            r3 = r8
            r4 = r9
            r0 = r1
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r0
            r1.a(r6)
            android.view.ViewGroup r1 = r1.hP()
            goto Lae
        L5b:
            com.kwad.components.ad.reward.h$a r5 = r7.sL
            r1 = r7
            r0 = r7
            r2 = r8
            r3 = r9
            r4 = r6
            android.view.View r1 = r0.a(r1, r2, r3, r4, r5)
            goto Lae
        L67:
            com.kwad.components.ad.reward.n.j r1 = new com.kwad.components.ad.reward.n.j
            com.kwad.sdk.core.response.model.AdTemplate r2 = r7.mAdTemplate
            com.kwad.components.ad.reward.h$a r5 = r7.sL
            r3 = r8
            r4 = r9
            r0 = r1
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r0
            r1.a(r6)
            android.view.ViewGroup r1 = r1.hP()
            goto Lae
        L7d:
            com.kwad.sdk.core.response.model.AdTemplate r4 = r7.mAdTemplate
            com.kwad.components.ad.reward.h$a r5 = r7.sL
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r6
            android.view.View r1 = c(r0, r1, r2, r3, r4, r5)
            com.kwad.components.core.widget.e r2 = new com.kwad.components.core.widget.e
            r2.<init>()
            r3 = r1
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            com.kwad.components.core.t.j.a(r2, r3)
            goto Lae
        L95:
            r3 = r6
            com.kwad.sdk.core.response.model.AdTemplate r4 = r7.mAdTemplate
            com.kwad.components.ad.reward.h$a r5 = r7.sL
            r0 = r7
            r1 = r8
            r2 = r9
            android.view.View r1 = b(r0, r1, r2, r3, r4, r5)
            goto Lae
        La2:
            r3 = r6
            com.kwad.sdk.core.response.model.AdTemplate r4 = r7.mAdTemplate
            com.kwad.components.ad.reward.h$a r5 = r7.sL
            r0 = r7
            r1 = r8
            r2 = r9
            android.view.View r1 = a(r0, r1, r2, r3, r4, r5)
        Lae:
            android.app.Dialog r2 = r7.getDialog()
            com.kwad.components.ad.reward.h$1 r3 = new com.kwad.components.ad.reward.h$1
            r3.<init>(r7)
            r2.setOnKeyListener(r3)
            return r1
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onActivityCreated(@androidx.annotation.Nullable android.os.Bundle r3) {
            r2 = this;
            super.onActivityCreated(r3)
            android.app.Dialog r3 = r2.getDialog()
            android.view.Window r3 = r3.getWindow()
            if (r3 != 0) goto Le
            goto L31
        Le:
            android.app.Dialog r0 = r2.getDialog()
            r1 = 0
            r0.setCanceledOnTouchOutside(r1)
            r0 = -1
            r3.setLayout(r0, r0)
            android.app.Dialog r3 = r2.getDialog()
            android.view.Window r3 = r3.getWindow()
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r3.setBackgroundDrawable(r0)
            com.kwad.components.ad.reward.h$a r3 = r2.sL
            if (r3 == 0) goto L31
            r3.ha()
        L31:
            return
    }
}
