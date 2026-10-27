package com.beizi.fusion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class EulerAngleView extends android.widget.RelativeLayout {
    private boolean a;
    private android.content.Context b;
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewRuleBean c;
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleRenderBean d;
    private android.widget.LinearLayout e;
    private android.widget.RelativeLayout f;
    private android.widget.ImageView g;
    private com.beizi.fusion.update.ShakeArcView h;
    private android.widget.TextView i;
    private android.widget.TextView j;
    private float k;

    /* renamed from: l, reason: collision with root package name */
    private float f90l;

    /* renamed from: m, reason: collision with root package name */
    private float f91m;

    /* renamed from: n, reason: collision with root package name */
    private int f92n;

    /* renamed from: o, reason: collision with root package name */
    private int f93o;

    /* renamed from: p, reason: collision with root package name */
    private int f94p;

    /* renamed from: q, reason: collision with root package name */
    private double f95q;

    /* renamed from: r, reason: collision with root package name */
    private double f96r;

    /* renamed from: s, reason: collision with root package name */
    private double f97s;

    /* renamed from: t, reason: collision with root package name */
    private java.lang.String f98t;

    /* renamed from: u, reason: collision with root package name */
    private java.lang.String f99u;

    /* renamed from: v, reason: collision with root package name */
    private java.lang.String f100v;

    /* renamed from: w, reason: collision with root package name */
    private android.animation.AnimatorSet f101w;

    /* renamed from: x, reason: collision with root package name */
    private java.lang.Boolean f102x;



    public EulerAngleView(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 0
            r2.a = r0
            r0 = 1114636288(0x42700000, float:60.0)
            r2.k = r0
            r2.f90l = r0
            r0 = 1106247680(0x41f00000, float:30.0)
            r2.f91m = r0
            r0 = 350(0x15e, float:4.9E-43)
            r2.f92n = r0
            r0 = 0
            r2.f95q = r0
            r2.f96r = r0
            r2.f97s = r0
            r2.init(r3)
            return
    }

    public EulerAngleView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r4 = 0
            r2.a = r4
            r4 = 1114636288(0x42700000, float:60.0)
            r2.k = r4
            r2.f90l = r4
            r4 = 1106247680(0x41f00000, float:30.0)
            r2.f91m = r4
            r4 = 350(0x15e, float:4.9E-43)
            r2.f92n = r4
            r0 = 0
            r2.f95q = r0
            r2.f96r = r0
            r2.f97s = r0
            r2.init(r3)
            return
    }

    public EulerAngleView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = 0
            r0.a = r2
            r2 = 1114636288(0x42700000, float:60.0)
            r0.k = r2
            r0.f90l = r2
            r2 = 1106247680(0x41f00000, float:30.0)
            r0.f91m = r2
            r2 = 350(0x15e, float:4.9E-43)
            r0.f92n = r2
            r2 = 0
            r0.f95q = r2
            r0.f96r = r2
            r0.f97s = r2
            r0.init(r1)
            return
    }

    static /* synthetic */ android.widget.ImageView a(com.beizi.fusion.widget.EulerAngleView r0) {
            android.widget.ImageView r0 = r0.g
            return r0
    }

    private void a(java.util.List<android.animation.Animator> r4, java.lang.String r5, float r6, float r7) {
            r3 = this;
            android.widget.ImageView r0 = r3.g     // Catch: java.lang.Exception -> L18
            r1 = 2
            float[] r1 = new float[r1]     // Catch: java.lang.Exception -> L18
            r2 = 0
            r1[r2] = r6     // Catch: java.lang.Exception -> L18
            r6 = 1
            r1[r6] = r7     // Catch: java.lang.Exception -> L18
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r0, r5, r1)     // Catch: java.lang.Exception -> L18
            int r6 = r3.f92n     // Catch: java.lang.Exception -> L18
            long r6 = (long) r6     // Catch: java.lang.Exception -> L18
            r5.setDuration(r6)     // Catch: java.lang.Exception -> L18
            r4.add(r5)     // Catch: java.lang.Exception -> L18
        L18:
            return
    }

    static /* synthetic */ android.animation.AnimatorSet b(com.beizi.fusion.widget.EulerAngleView r0) {
            android.animation.AnimatorSet r0 = r0.f101w
            return r0
    }

    public void buildEulerAngleView() {
            r9 = this;
            java.lang.String r0 = "2"
            java.lang.String r1 = "1"
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r2 = r9.c     // Catch: java.lang.Exception -> L214
            if (r2 != 0) goto La
            goto L214
        La:
            android.content.Context r2 = r9.getContext()     // Catch: java.lang.Exception -> L214
            int r3 = com.beizi.fusion.R.layout.beizi_interaction_euler_angle_view     // Catch: java.lang.Exception -> L214
            android.view.View.inflate(r2, r3, r9)     // Catch: java.lang.Exception -> L214
            int r2 = com.beizi.fusion.R.id.bz_eav_container_ll     // Catch: java.lang.Exception -> L214
            android.view.View r2 = r9.findViewById(r2)     // Catch: java.lang.Exception -> L214
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2     // Catch: java.lang.Exception -> L214
            r9.e = r2     // Catch: java.lang.Exception -> L214
            int r2 = com.beizi.fusion.R.id.bz_eav_img_container_rl     // Catch: java.lang.Exception -> L214
            android.view.View r2 = r9.findViewById(r2)     // Catch: java.lang.Exception -> L214
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2     // Catch: java.lang.Exception -> L214
            r9.f = r2     // Catch: java.lang.Exception -> L214
            int r2 = com.beizi.fusion.R.id.bz_eav_img_iv     // Catch: java.lang.Exception -> L214
            android.view.View r2 = r9.findViewById(r2)     // Catch: java.lang.Exception -> L214
            android.widget.ImageView r2 = (android.widget.ImageView) r2     // Catch: java.lang.Exception -> L214
            r9.g = r2     // Catch: java.lang.Exception -> L214
            int r2 = com.beizi.fusion.R.id.bz_eav_sav_iv     // Catch: java.lang.Exception -> L214
            android.view.View r2 = r9.findViewById(r2)     // Catch: java.lang.Exception -> L214
            com.beizi.fusion.update.ShakeArcView r2 = (com.beizi.fusion.update.ShakeArcView) r2     // Catch: java.lang.Exception -> L214
            r9.h = r2     // Catch: java.lang.Exception -> L214
            int r2 = com.beizi.fusion.R.id.bz_eav_title_tv     // Catch: java.lang.Exception -> L214
            android.view.View r2 = r9.findViewById(r2)     // Catch: java.lang.Exception -> L214
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch: java.lang.Exception -> L214
            r9.i = r2     // Catch: java.lang.Exception -> L214
            int r2 = com.beizi.fusion.R.id.bz_eav_subtitle_tv     // Catch: java.lang.Exception -> L214
            android.view.View r2 = r9.findViewById(r2)     // Catch: java.lang.Exception -> L214
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch: java.lang.Exception -> L214
            r9.j = r2     // Catch: java.lang.Exception -> L214
            android.widget.RelativeLayout r2 = r9.f     // Catch: java.lang.Exception -> L214
            if (r2 == 0) goto L66
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()     // Catch: java.lang.Exception -> L214
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2     // Catch: java.lang.Exception -> L214
            int r3 = r9.f93o     // Catch: java.lang.Exception -> L214
            r2.width = r3     // Catch: java.lang.Exception -> L214
            int r3 = r9.f94p     // Catch: java.lang.Exception -> L214
            r2.height = r3     // Catch: java.lang.Exception -> L214
            android.widget.RelativeLayout r3 = r9.f     // Catch: java.lang.Exception -> L214
            r3.setLayoutParams(r2)     // Catch: java.lang.Exception -> L214
        L66:
            android.widget.ImageView r2 = r9.g     // Catch: java.lang.Exception -> L214
            r3 = 0
            if (r2 == 0) goto L99
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()     // Catch: java.lang.Exception -> L214
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2     // Catch: java.lang.Exception -> L214
            int r4 = r9.f93o     // Catch: java.lang.Exception -> L214
            double r4 = (double) r4     // Catch: java.lang.Exception -> L214
            r6 = 4599976659396224614(0x3fd6666666666666, double:0.35)
            double r4 = r4 * r6
            int r4 = (int) r4     // Catch: java.lang.Exception -> L214
            r2.width = r4     // Catch: java.lang.Exception -> L214
            int r4 = r9.f94p     // Catch: java.lang.Exception -> L214
            double r5 = (double) r4     // Catch: java.lang.Exception -> L214
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r5 = r5 * r7
            int r5 = (int) r5     // Catch: java.lang.Exception -> L214
            r2.height = r5     // Catch: java.lang.Exception -> L214
            double r4 = (double) r4     // Catch: java.lang.Exception -> L214
            r6 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r4 = r4 * r6
            int r4 = (int) r4     // Catch: java.lang.Exception -> L214
            r2.setMargins(r3, r3, r3, r4)     // Catch: java.lang.Exception -> L214
            android.widget.ImageView r4 = r9.g     // Catch: java.lang.Exception -> L214
            r4.setLayoutParams(r2)     // Catch: java.lang.Exception -> L214
        L99:
            com.beizi.fusion.update.ShakeArcView r2 = r9.h     // Catch: java.lang.Exception -> L214
            r4 = 2
            if (r2 == 0) goto L153
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()     // Catch: java.lang.Exception -> L214
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2     // Catch: java.lang.Exception -> L214
            int r5 = r9.f93o     // Catch: java.lang.Exception -> L214
            int r6 = r9.f94p     // Catch: java.lang.Exception -> L214
            int r5 = java.lang.Math.min(r5, r6)     // Catch: java.lang.Exception -> L214
            double r5 = (double) r5     // Catch: java.lang.Exception -> L214
            r7 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r5 = r5 * r7
            int r5 = (int) r5     // Catch: java.lang.Exception -> L214
            r2.width = r5     // Catch: java.lang.Exception -> L214
            int r5 = r9.f93o     // Catch: java.lang.Exception -> L214
            int r6 = r9.f94p     // Catch: java.lang.Exception -> L214
            int r5 = java.lang.Math.min(r5, r6)     // Catch: java.lang.Exception -> L214
            double r5 = (double) r5     // Catch: java.lang.Exception -> L214
            double r5 = r5 * r7
            int r5 = (int) r5     // Catch: java.lang.Exception -> L214
            r2.height = r5     // Catch: java.lang.Exception -> L214
            com.beizi.fusion.update.ShakeArcView r5 = r9.h     // Catch: java.lang.Exception -> L214
            r5.setLayoutParams(r2)     // Catch: java.lang.Exception -> L214
            java.lang.String r2 = r9.f98t     // Catch: java.lang.Exception -> L214
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L214
            if (r2 != 0) goto Ld8
            com.beizi.fusion.update.ShakeArcView r0 = r9.h     // Catch: java.lang.Exception -> L214
            r0.setArrowDirection(r3)     // Catch: java.lang.Exception -> L214
            goto L144
        Ld8:
            java.lang.String r2 = r9.f99u     // Catch: java.lang.Exception -> L214
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L214
            if (r2 == 0) goto Le8
            java.lang.String r2 = r9.f100v     // Catch: java.lang.Exception -> L214
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L214
            if (r2 != 0) goto L108
        Le8:
            java.lang.String r2 = r9.f99u     // Catch: java.lang.Exception -> L214
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L214
            if (r2 == 0) goto Lf8
            java.lang.String r2 = r9.f100v     // Catch: java.lang.Exception -> L214
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L214
            if (r2 != 0) goto L108
        Lf8:
            java.lang.String r2 = r9.f100v     // Catch: java.lang.Exception -> L214
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L214
            if (r2 == 0) goto L10f
            java.lang.String r2 = r9.f99u     // Catch: java.lang.Exception -> L214
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L214
            if (r1 == 0) goto L10f
        L108:
            com.beizi.fusion.update.ShakeArcView r0 = r9.h     // Catch: java.lang.Exception -> L214
            r1 = 1
            r0.setArrowDirection(r1)     // Catch: java.lang.Exception -> L214
            goto L144
        L10f:
            java.lang.String r1 = r9.f99u     // Catch: java.lang.Exception -> L214
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Exception -> L214
            if (r1 == 0) goto L11f
            java.lang.String r1 = r9.f100v     // Catch: java.lang.Exception -> L214
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Exception -> L214
            if (r1 != 0) goto L13f
        L11f:
            java.lang.String r1 = r9.f99u     // Catch: java.lang.Exception -> L214
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L214
            if (r1 == 0) goto L12f
            java.lang.String r1 = r9.f100v     // Catch: java.lang.Exception -> L214
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Exception -> L214
            if (r1 != 0) goto L13f
        L12f:
            java.lang.String r1 = r9.f100v     // Catch: java.lang.Exception -> L214
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L214
            if (r1 == 0) goto L144
            java.lang.String r1 = r9.f99u     // Catch: java.lang.Exception -> L214
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L214
            if (r0 == 0) goto L144
        L13f:
            com.beizi.fusion.update.ShakeArcView r0 = r9.h     // Catch: java.lang.Exception -> L214
            r0.setArrowDirection(r4)     // Catch: java.lang.Exception -> L214
        L144:
            com.beizi.fusion.update.ShakeArcView r0 = r9.h     // Catch: java.lang.Exception -> L153
            int r1 = r9.f93o     // Catch: java.lang.Exception -> L153
            int r2 = r9.f94p     // Catch: java.lang.Exception -> L153
            int r1 = java.lang.Math.min(r1, r2)     // Catch: java.lang.Exception -> L153
            int r1 = r1 / 30
            r0.setLineWidth(r1)     // Catch: java.lang.Exception -> L153
        L153:
            java.lang.String r0 = "#66333333"
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleRenderBean r1 = r9.d     // Catch: java.lang.Exception -> L214
            if (r1 == 0) goto L15d
            java.lang.String r0 = r1.getColor()     // Catch: java.lang.Exception -> L214
        L15d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L214
            r2 = 0
            if (r1 != 0) goto L174
            java.lang.String r1 = "#"
            boolean r1 = r0.startsWith(r1)     // Catch: java.lang.Exception -> L214
            if (r1 == 0) goto L174
            android.widget.RelativeLayout r1 = r9.f     // Catch: java.lang.Exception -> L214
            int r5 = r9.f93o     // Catch: java.lang.Exception -> L214
            int r5 = r5 / r4
            com.beizi.fusion.tool.am.a(r1, r0, r3, r2, r5)     // Catch: java.lang.Exception -> L214
        L174:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r9.c     // Catch: java.lang.Exception -> L214
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleStyleBean r0 = r0.getStyle()     // Catch: java.lang.Exception -> L214
            if (r0 == 0) goto L18f
            java.util.List r1 = r0.getImgs()     // Catch: java.lang.Exception -> L214
            if (r1 == 0) goto L18f
            int r4 = r1.size()     // Catch: java.lang.Exception -> L214
            if (r4 <= 0) goto L18f
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Exception -> L214
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L214
            goto L190
        L18f:
            r1 = r2
        L190:
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L214
            if (r3 != 0) goto L1a4
            android.content.Context r3 = r9.b     // Catch: java.lang.Exception -> L214
            com.beizi.fusion.tool.f r3 = com.beizi.fusion.tool.f.a(r3)     // Catch: java.lang.Exception -> L214
            com.beizi.fusion.widget.EulerAngleView$1 r4 = new com.beizi.fusion.widget.EulerAngleView$1     // Catch: java.lang.Exception -> L214
            r4.<init>(r9)     // Catch: java.lang.Exception -> L214
            r3.b(r1, r4)     // Catch: java.lang.Exception -> L214
        L1a4:
            com.beizi.fusion.update.ShakeArcView r1 = r9.h     // Catch: java.lang.Exception -> L214
            if (r1 == 0) goto L1ad
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            r1.setMaxProgress(r3)     // Catch: java.lang.Exception -> L214
        L1ad:
            if (r0 == 0) goto L1cd
            java.lang.String r2 = r0.getTitle()     // Catch: java.lang.Exception -> L214
            java.lang.Boolean r1 = r9.f102x     // Catch: java.lang.Exception -> L214
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L214
            if (r1 != 0) goto L1c0
            java.lang.String r0 = r0.getSubTitle()     // Catch: java.lang.Exception -> L214
            goto L1ce
        L1c0:
            java.lang.String r0 = r0.getDownloadSubTitle()     // Catch: java.lang.Exception -> L214
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L214
            if (r1 == 0) goto L1ce
            java.lang.String r0 = "下载应用"
            goto L1ce
        L1cd:
            r0 = r2
        L1ce:
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L214
            java.lang.String r3 = "#8C000000"
            r4 = 1084227584(0x40a00000, float:5.0)
            java.lang.String r5 = "#FFFFFFFF"
            r6 = 1082130432(0x40800000, float:4.0)
            if (r1 != 0) goto L1f5
            android.widget.TextView r1 = r9.i     // Catch: java.lang.Exception -> L214
            if (r1 == 0) goto L1f5
            r1.setText(r2)     // Catch: java.lang.Exception -> L214
            android.widget.TextView r1 = r9.i     // Catch: java.lang.Exception -> L214
            int r2 = android.graphics.Color.parseColor(r5)     // Catch: java.lang.Exception -> L214
            r1.setTextColor(r2)     // Catch: java.lang.Exception -> L214
            android.widget.TextView r1 = r9.i     // Catch: java.lang.Exception -> L214
            int r2 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Exception -> L214
            r1.setShadowLayer(r4, r6, r6, r2)     // Catch: java.lang.Exception -> L214
        L1f5:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L214
            if (r1 != 0) goto L214
            android.widget.TextView r1 = r9.j     // Catch: java.lang.Exception -> L214
            if (r1 == 0) goto L214
            r1.setText(r0)     // Catch: java.lang.Exception -> L214
            android.widget.TextView r0 = r9.j     // Catch: java.lang.Exception -> L214
            int r1 = android.graphics.Color.parseColor(r5)     // Catch: java.lang.Exception -> L214
            r0.setTextColor(r1)     // Catch: java.lang.Exception -> L214
            android.widget.TextView r0 = r9.j     // Catch: java.lang.Exception -> L214
            int r1 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Exception -> L214
            r0.setShadowLayer(r4, r6, r6, r1)     // Catch: java.lang.Exception -> L214
        L214:
            return
    }

    public void init(android.content.Context r2) {
            r1 = this;
            boolean r0 = r1.a
            if (r0 == 0) goto L5
            return
        L5:
            r1.b = r2
            r2 = 1
            r1.a = r2
            return
    }

    public void onDestroy() {
            r2 = this;
            r0 = 0
            r2.b = r0     // Catch: java.lang.Exception -> Lc
            android.animation.AnimatorSet r1 = r2.f101w     // Catch: java.lang.Exception -> Lc
            if (r1 == 0) goto La
            r1.removeAllListeners()     // Catch: java.lang.Exception -> Lc
        La:
            r2.f101w = r0     // Catch: java.lang.Exception -> Lc
        Lc:
            return
    }

    public void setAngle(double r1, double r3, double r5) {
            r0 = this;
            r0.f95q = r1
            r0.f96r = r3
            r0.f97s = r5
            return
    }

    public void setAnimationViewWidthAndHeight(int r1, int r2) {
            r0 = this;
            r0.f93o = r1
            r0.f94p = r2
            return
    }

    public void setCurrentProgress(double r17, double r19, double r21) {
            r16 = this;
            r0 = r16
            com.beizi.fusion.update.ShakeArcView r1 = r0.h     // Catch: java.lang.Exception -> Lc9
            if (r1 == 0) goto Lc9
            double r1 = r0.f95q     // Catch: java.lang.Exception -> Lc9
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            java.lang.String r5 = "3"
            java.lang.String r6 = "0"
            java.lang.String r7 = "1"
            java.lang.String r8 = "2"
            r9 = 0
            int r11 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r11 <= 0) goto L4a
            java.lang.String r1 = r0.f98t     // Catch: java.lang.Exception -> Lc9
            boolean r1 = r8.equals(r1)     // Catch: java.lang.Exception -> Lc9
            if (r1 == 0) goto L24
            int r1 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r1 > 0) goto L40
        L24:
            java.lang.String r1 = r0.f98t     // Catch: java.lang.Exception -> Lc9
            boolean r1 = r7.equals(r1)     // Catch: java.lang.Exception -> Lc9
            if (r1 == 0) goto L30
            int r1 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r1 < 0) goto L40
        L30:
            java.lang.String r1 = r0.f98t     // Catch: java.lang.Exception -> Lc9
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Exception -> Lc9
            if (r1 != 0) goto L40
            java.lang.String r1 = r0.f98t     // Catch: java.lang.Exception -> Lc9
            boolean r1 = r5.equals(r1)     // Catch: java.lang.Exception -> Lc9
            if (r1 == 0) goto L4a
        L40:
            double r1 = java.lang.Math.abs(r17)     // Catch: java.lang.Exception -> Lc9
            double r1 = r1 * r3
            double r11 = r0.f95q     // Catch: java.lang.Exception -> Lc9
            double r1 = r1 / r11
            goto L4b
        L4a:
            r1 = r9
        L4b:
            double r11 = r0.f96r     // Catch: java.lang.Exception -> Lc9
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 <= 0) goto L83
            java.lang.String r11 = r0.f99u     // Catch: java.lang.Exception -> Lc9
            boolean r11 = r8.equals(r11)     // Catch: java.lang.Exception -> Lc9
            if (r11 == 0) goto L5d
            int r11 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r11 < 0) goto L79
        L5d:
            java.lang.String r11 = r0.f99u     // Catch: java.lang.Exception -> Lc9
            boolean r11 = r7.equals(r11)     // Catch: java.lang.Exception -> Lc9
            if (r11 == 0) goto L69
            int r11 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r11 > 0) goto L79
        L69:
            java.lang.String r11 = r0.f99u     // Catch: java.lang.Exception -> Lc9
            boolean r11 = r6.equals(r11)     // Catch: java.lang.Exception -> Lc9
            if (r11 != 0) goto L79
            java.lang.String r11 = r0.f99u     // Catch: java.lang.Exception -> Lc9
            boolean r11 = r5.equals(r11)     // Catch: java.lang.Exception -> Lc9
            if (r11 == 0) goto L83
        L79:
            double r11 = java.lang.Math.abs(r19)     // Catch: java.lang.Exception -> Lc9
            double r11 = r11 * r3
            double r13 = r0.f96r     // Catch: java.lang.Exception -> Lc9
            double r11 = r11 / r13
            goto L84
        L83:
            r11 = r9
        L84:
            double r13 = r0.f97s     // Catch: java.lang.Exception -> Lc9
            int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r15 <= 0) goto Lbc
            java.lang.String r13 = r0.f100v     // Catch: java.lang.Exception -> Lc9
            boolean r8 = r8.equals(r13)     // Catch: java.lang.Exception -> Lc9
            if (r8 == 0) goto L96
            int r8 = (r21 > r9 ? 1 : (r21 == r9 ? 0 : -1))
            if (r8 > 0) goto Lb2
        L96:
            java.lang.String r8 = r0.f100v     // Catch: java.lang.Exception -> Lc9
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Exception -> Lc9
            if (r7 == 0) goto La2
            int r7 = (r21 > r9 ? 1 : (r21 == r9 ? 0 : -1))
            if (r7 < 0) goto Lb2
        La2:
            java.lang.String r7 = r0.f100v     // Catch: java.lang.Exception -> Lc9
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Exception -> Lc9
            if (r6 != 0) goto Lb2
            java.lang.String r6 = r0.f100v     // Catch: java.lang.Exception -> Lc9
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Exception -> Lc9
            if (r5 == 0) goto Lbc
        Lb2:
            double r5 = java.lang.Math.abs(r21)     // Catch: java.lang.Exception -> Lc9
            double r5 = r5 * r3
            double r3 = r0.f97s     // Catch: java.lang.Exception -> Lc9
            double r9 = r5 / r3
        Lbc:
            double r1 = java.lang.Math.max(r1, r11)     // Catch: java.lang.Exception -> Lc9
            com.beizi.fusion.update.ShakeArcView r3 = r0.h     // Catch: java.lang.Exception -> Lc9
            double r1 = java.lang.Math.max(r1, r9)     // Catch: java.lang.Exception -> Lc9
            r3.setCurrentProgress(r1)     // Catch: java.lang.Exception -> Lc9
        Lc9:
            return
    }

    public void setDownloadApp(java.lang.Boolean r1) {
            r0 = this;
            r0.f102x = r1
            return
    }

    public void setEulerAngleRenderBean(com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleRenderBean r5) {
            r4 = this;
            r4.d = r5     // Catch: java.lang.Exception -> L58
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r5 = r4.c     // Catch: java.lang.Exception -> L58
            if (r5 != 0) goto L7
            goto L58
        L7:
            java.util.List r5 = r5.getRules()     // Catch: java.lang.Exception -> L58
            if (r5 == 0) goto L58
            int r0 = r5.size()     // Catch: java.lang.Exception -> L58
            if (r0 != 0) goto L14
            goto L58
        L14:
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L58
        L18:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Exception -> L58
            if (r0 == 0) goto L58
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Exception -> L58
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleRuleBean r0 = (com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleRuleBean) r0     // Catch: java.lang.Exception -> L58
            if (r0 != 0) goto L27
            goto L18
        L27:
            java.lang.String r1 = r0.getDirection()     // Catch: java.lang.Exception -> L58
            java.lang.String r2 = "x"
            java.lang.String r3 = r0.getAxis()     // Catch: java.lang.Exception -> L58
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Exception -> L58
            if (r2 == 0) goto L3a
            r4.f98t = r1     // Catch: java.lang.Exception -> L58
            goto L18
        L3a:
            java.lang.String r2 = "y"
            java.lang.String r3 = r0.getAxis()     // Catch: java.lang.Exception -> L58
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Exception -> L58
            if (r2 == 0) goto L49
            r4.f99u = r1     // Catch: java.lang.Exception -> L58
            goto L18
        L49:
            java.lang.String r2 = "z"
            java.lang.String r0 = r0.getAxis()     // Catch: java.lang.Exception -> L58
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch: java.lang.Exception -> L58
            if (r0 == 0) goto L18
            r4.f100v = r1     // Catch: java.lang.Exception -> L58
            goto L18
        L58:
            return
    }

    public void setEulerAngleViewRuleBean(com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewRuleBean r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void startContinuousRotations() {
            r8 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r8.c     // Catch: java.lang.Exception -> L154
            if (r0 != 0) goto L6
            goto L154
        L6:
            java.util.List r0 = r0.getRules()     // Catch: java.lang.Exception -> L154
            if (r0 == 0) goto L154
            int r1 = r0.size()     // Catch: java.lang.Exception -> L154
            if (r1 != 0) goto L14
            goto L154
        L14:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L154
            r1.<init>()     // Catch: java.lang.Exception -> L154
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L154
        L1d:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Exception -> L154
            if (r2 == 0) goto L135
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Exception -> L154
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleRuleBean r2 = (com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleRuleBean) r2     // Catch: java.lang.Exception -> L154
            if (r2 != 0) goto L2c
            goto L1d
        L2c:
            double r3 = r2.getAngle()     // Catch: java.lang.Exception -> L154
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L37
            goto L1d
        L37:
            java.lang.String r3 = "x"
            java.lang.String r4 = r2.getAxis()     // Catch: java.lang.Exception -> L154
            boolean r3 = r3.equalsIgnoreCase(r4)     // Catch: java.lang.Exception -> L154
            java.lang.String r4 = "1"
            java.lang.String r5 = "2"
            r6 = 0
            if (r3 == 0) goto L8d
            java.lang.String r3 = r2.getDirection()     // Catch: java.lang.Exception -> L154
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Exception -> L154
            java.lang.String r5 = "rotationX"
            if (r3 == 0) goto L61
            float r2 = r8.k     // Catch: java.lang.Exception -> L154
            float r2 = -r2
            r8.a(r1, r5, r6, r2)     // Catch: java.lang.Exception -> L154
            float r2 = r8.k     // Catch: java.lang.Exception -> L154
            float r2 = -r2
            r8.a(r1, r5, r2, r6)     // Catch: java.lang.Exception -> L154
            goto L1d
        L61:
            java.lang.String r2 = r2.getDirection()     // Catch: java.lang.Exception -> L154
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Exception -> L154
            if (r2 == 0) goto L76
            float r2 = r8.k     // Catch: java.lang.Exception -> L154
            r8.a(r1, r5, r6, r2)     // Catch: java.lang.Exception -> L154
            float r2 = r8.k     // Catch: java.lang.Exception -> L154
            r8.a(r1, r5, r2, r6)     // Catch: java.lang.Exception -> L154
            goto L1d
        L76:
            float r2 = r8.k     // Catch: java.lang.Exception -> L154
            r8.a(r1, r5, r6, r2)     // Catch: java.lang.Exception -> L154
            float r2 = r8.k     // Catch: java.lang.Exception -> L154
            r8.a(r1, r5, r2, r6)     // Catch: java.lang.Exception -> L154
            float r2 = r8.k     // Catch: java.lang.Exception -> L154
            float r2 = -r2
            r8.a(r1, r5, r6, r2)     // Catch: java.lang.Exception -> L154
            float r2 = r8.k     // Catch: java.lang.Exception -> L154
            float r2 = -r2
            r8.a(r1, r5, r2, r6)     // Catch: java.lang.Exception -> L154
            goto L1d
        L8d:
            java.lang.String r3 = "y"
            java.lang.String r7 = r2.getAxis()     // Catch: java.lang.Exception -> L154
            boolean r3 = r3.equalsIgnoreCase(r7)     // Catch: java.lang.Exception -> L154
            if (r3 == 0) goto Le1
            java.lang.String r3 = r2.getDirection()     // Catch: java.lang.Exception -> L154
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Exception -> L154
            java.lang.String r5 = "rotationY"
            if (r3 == 0) goto Lb3
            float r2 = r8.f90l     // Catch: java.lang.Exception -> L154
            float r2 = -r2
            r8.a(r1, r5, r6, r2)     // Catch: java.lang.Exception -> L154
            float r2 = r8.f90l     // Catch: java.lang.Exception -> L154
            float r2 = -r2
            r8.a(r1, r5, r2, r6)     // Catch: java.lang.Exception -> L154
            goto L1d
        Lb3:
            java.lang.String r2 = r2.getDirection()     // Catch: java.lang.Exception -> L154
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Exception -> L154
            if (r2 == 0) goto Lc9
            float r2 = r8.f90l     // Catch: java.lang.Exception -> L154
            r8.a(r1, r5, r6, r2)     // Catch: java.lang.Exception -> L154
            float r2 = r8.f90l     // Catch: java.lang.Exception -> L154
            r8.a(r1, r5, r2, r6)     // Catch: java.lang.Exception -> L154
            goto L1d
        Lc9:
            float r2 = r8.f90l     // Catch: java.lang.Exception -> L154
            r8.a(r1, r5, r6, r2)     // Catch: java.lang.Exception -> L154
            float r2 = r8.f90l     // Catch: java.lang.Exception -> L154
            r8.a(r1, r5, r2, r6)     // Catch: java.lang.Exception -> L154
            float r2 = r8.f90l     // Catch: java.lang.Exception -> L154
            float r2 = -r2
            r8.a(r1, r5, r6, r2)     // Catch: java.lang.Exception -> L154
            float r2 = r8.f90l     // Catch: java.lang.Exception -> L154
            float r2 = -r2
            r8.a(r1, r5, r2, r6)     // Catch: java.lang.Exception -> L154
            goto L1d
        Le1:
            java.lang.String r3 = "z"
            java.lang.String r7 = r2.getAxis()     // Catch: java.lang.Exception -> L154
            boolean r3 = r3.equalsIgnoreCase(r7)     // Catch: java.lang.Exception -> L154
            if (r3 == 0) goto L1d
            java.lang.String r3 = r2.getDirection()     // Catch: java.lang.Exception -> L154
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Exception -> L154
            java.lang.String r5 = "rotation"
            if (r3 == 0) goto L107
            float r2 = r8.f91m     // Catch: java.lang.Exception -> L154
            float r2 = -r2
            r8.a(r1, r5, r6, r2)     // Catch: java.lang.Exception -> L154
            float r2 = r8.f91m     // Catch: java.lang.Exception -> L154
            float r2 = -r2
            r8.a(r1, r5, r2, r6)     // Catch: java.lang.Exception -> L154
            goto L1d
        L107:
            java.lang.String r2 = r2.getDirection()     // Catch: java.lang.Exception -> L154
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Exception -> L154
            if (r2 == 0) goto L11d
            float r2 = r8.f91m     // Catch: java.lang.Exception -> L154
            r8.a(r1, r5, r6, r2)     // Catch: java.lang.Exception -> L154
            float r2 = r8.f91m     // Catch: java.lang.Exception -> L154
            r8.a(r1, r5, r2, r6)     // Catch: java.lang.Exception -> L154
            goto L1d
        L11d:
            float r2 = r8.f91m     // Catch: java.lang.Exception -> L154
            r8.a(r1, r5, r6, r2)     // Catch: java.lang.Exception -> L154
            float r2 = r8.f91m     // Catch: java.lang.Exception -> L154
            r8.a(r1, r5, r2, r6)     // Catch: java.lang.Exception -> L154
            float r2 = r8.f91m     // Catch: java.lang.Exception -> L154
            float r2 = -r2
            r8.a(r1, r5, r6, r2)     // Catch: java.lang.Exception -> L154
            float r2 = r8.f91m     // Catch: java.lang.Exception -> L154
            float r2 = -r2
            r8.a(r1, r5, r2, r6)     // Catch: java.lang.Exception -> L154
            goto L1d
        L135:
            int r0 = r1.size()     // Catch: java.lang.Exception -> L154
            if (r0 <= 0) goto L154
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet     // Catch: java.lang.Exception -> L154
            r0.<init>()     // Catch: java.lang.Exception -> L154
            r8.f101w = r0     // Catch: java.lang.Exception -> L154
            com.beizi.fusion.widget.EulerAngleView$2 r2 = new com.beizi.fusion.widget.EulerAngleView$2     // Catch: java.lang.Exception -> L154
            r2.<init>(r8)     // Catch: java.lang.Exception -> L154
            r0.addListener(r2)     // Catch: java.lang.Exception -> L154
            android.animation.AnimatorSet r0 = r8.f101w     // Catch: java.lang.Exception -> L154
            r0.playSequentially(r1)     // Catch: java.lang.Exception -> L154
            android.animation.AnimatorSet r0 = r8.f101w     // Catch: java.lang.Exception -> L154
            r0.start()     // Catch: java.lang.Exception -> L154
        L154:
            return
    }
}
