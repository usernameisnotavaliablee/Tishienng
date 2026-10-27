package cn.jpush.android.u;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d extends cn.jpush.android.u.e {

    /* renamed from: g, reason: collision with root package name */
    private android.widget.TextView f1930g;

    /* renamed from: h, reason: collision with root package name */
    private android.widget.TextView f1931h;

    /* renamed from: i, reason: collision with root package name */
    private android.widget.TextView f1932i;

    /* renamed from: j, reason: collision with root package name */
    private android.widget.TextView f1933j;

    /* renamed from: k, reason: collision with root package name */
    private android.widget.ImageView f1934k;
    private android.widget.ImageView l;
    private android.view.View m;
    private android.view.View n;
    private android.view.View o;
    private android.view.View p;
    private android.widget.FrameLayout q;
    private cn.jpush.android.ui.RoundedImageView r;
    private cn.jpush.android.ui.RoundedImageView s;


    public d(android.content.Context r1, cn.jpush.android.t.a r2, cn.jpush.android.d.d r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    private void l() {
            r3 = this;
            cn.jpush.android.ui.RoundedImageView r0 = r3.r
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r3.o
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            r0.mutate()
            android.content.Context r1 = r3.f1921d
            r2 = 15
            int r1 = cn.jpush.android.ad.m.a(r1, r2)
            float r1 = (float) r1
            r0.setCornerRadius(r1)
            return
    }

    @Override // cn.jpush.android.u.e
    protected void a() {
            r2 = this;
            java.lang.String r0 = "image"
            android.view.View r0 = r2.b(r0)
            cn.jpush.android.ui.RoundedImageView r0 = (cn.jpush.android.ui.RoundedImageView) r0
            r2.r = r0
            java.lang.String r0 = "img_bottom_close"
            android.view.View r0 = r2.b(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.l = r0
            java.lang.String r0 = "img_top_close"
            android.view.View r0 = r2.b(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.f1934k = r0
            java.lang.String r0 = "image_only"
            android.view.View r0 = r2.b(r0)
            cn.jpush.android.ui.RoundedImageView r0 = (cn.jpush.android.ui.RoundedImageView) r0
            r2.s = r0
            java.lang.String r0 = "btn_two"
            android.view.View r0 = r2.b(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.f1933j = r0
            java.lang.String r0 = "btn_one"
            android.view.View r0 = r2.b(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.f1932i = r0
            java.lang.String r0 = "text_content"
            android.view.View r0 = r2.b(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.f1931h = r0
            java.lang.String r0 = "text_title"
            android.view.View r0 = r2.b(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.f1930g = r0
            java.lang.String r0 = "content_view"
            android.view.View r0 = r2.b(r0)
            r2.m = r0
            java.lang.String r0 = "frame"
            android.view.View r0 = r2.b(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r2.q = r0
            java.lang.String r0 = "margeview"
            android.view.View r0 = r2.b(r0)
            r2.n = r0
            java.lang.String r0 = "bg_view"
            android.view.View r0 = r2.b(r0)
            r2.o = r0
            java.lang.String r0 = "btn_parent_view"
            android.view.View r0 = r2.b(r0)
            r2.p = r0
            android.widget.TextView r0 = r2.f1931h
            android.text.method.MovementMethod r1 = android.text.method.ScrollingMovementMethod.getInstance()
            r0.setMovementMethod(r1)
            android.widget.TextView r0 = r2.f1931h
            r1 = 150(0x96, float:2.1E-43)
            int r1 = r2.b(r1)
            r0.setMaxHeight(r1)
            return
    }

    @Override // cn.jpush.android.u.e
    protected java.lang.String b() {
            r1 = this;
            java.lang.String r0 = "jpush_interstitial"
            return r0
    }

    @Override // cn.jpush.android.u.b
    public void c() {
            r1 = this;
            android.view.View r0 = r1.f1935f
            if (r0 == 0) goto L7
            r0 = 0
            r1.f1935f = r0
        L7:
            return
    }

    @Override // cn.jpush.android.u.b
    public void d() {
            r16 = this;
            r1 = r16
            java.lang.String r0 = "buttons"
            java.lang.String r8 = "close_location"
            java.lang.String r9 = "content"
            java.lang.String r10 = "title"
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L95
            cn.jpush.android.d.d r2 = r1.f1919b     // Catch: java.lang.Throwable -> L95
            java.lang.String r2 = r2.f1762i     // Catch: java.lang.Throwable -> L95
            r11.<init>(r2)     // Catch: java.lang.Throwable -> L95
            r2 = 30
            int r2 = r1.a(r2)     // Catch: java.lang.Throwable -> L95
            android.widget.FrameLayout r3 = r1.q     // Catch: java.lang.Throwable -> L95
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()     // Catch: java.lang.Throwable -> L95
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3     // Catch: java.lang.Throwable -> L95
            r3.leftMargin = r2     // Catch: java.lang.Throwable -> L95
            r3.rightMargin = r2     // Catch: java.lang.Throwable -> L95
            android.widget.FrameLayout r4 = r1.q     // Catch: java.lang.Throwable -> L95
            r4.setLayoutParams(r3)     // Catch: java.lang.Throwable -> L95
            android.widget.ImageView r3 = r1.f1934k     // Catch: java.lang.Throwable -> L95
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()     // Catch: java.lang.Throwable -> L95
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3     // Catch: java.lang.Throwable -> L95
            r3.rightMargin = r2     // Catch: java.lang.Throwable -> L95
            android.widget.ImageView r2 = r1.f1934k     // Catch: java.lang.Throwable -> L95
            r2.setLayoutParams(r3)     // Catch: java.lang.Throwable -> L95
            int r2 = r1.f1922e     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = "click"
            r12 = 45
            r4 = 21
            r13 = 315(0x13b, float:4.41E-43)
            java.lang.String r5 = "image"
            r14 = 8
            r15 = 0
            if (r4 != r2) goto L98
            cn.jpush.android.ui.RoundedImageView r2 = r1.s     // Catch: java.lang.Throwable -> L95
            r2.setVisibility(r15)     // Catch: java.lang.Throwable -> L95
            cn.jpush.android.ui.RoundedImageView r2 = r1.s     // Catch: java.lang.Throwable -> L95
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()     // Catch: java.lang.Throwable -> L95
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2     // Catch: java.lang.Throwable -> L95
            int r4 = r1.a(r13)     // Catch: java.lang.Throwable -> L95
            r2.width = r4     // Catch: java.lang.Throwable -> L95
            r4 = 292(0x124, float:4.09E-43)
            int r6 = r1.b(r4)     // Catch: java.lang.Throwable -> L95
            r2.height = r6     // Catch: java.lang.Throwable -> L95
            cn.jpush.android.ui.RoundedImageView r6 = r1.s     // Catch: java.lang.Throwable -> L95
            r6.setLayoutParams(r2)     // Catch: java.lang.Throwable -> L95
            cn.jpush.android.ui.RoundedImageView r2 = r1.r     // Catch: java.lang.Throwable -> L95
            r2.setRadius(r12, r12, r12, r12)     // Catch: java.lang.Throwable -> L95
            android.view.View r2 = r1.m     // Catch: java.lang.Throwable -> L95
            r2.setVisibility(r14)     // Catch: java.lang.Throwable -> L95
            boolean r2 = r11.has(r5)     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L10a
            java.lang.String r2 = r11.getString(r5)     // Catch: java.lang.Throwable -> L95
            org.json.JSONObject r3 = r11.optJSONObject(r3)     // Catch: java.lang.Throwable -> L95
            r5 = r3
            r3 = r2
            cn.jpush.android.ui.RoundedImageView r2 = r1.s     // Catch: java.lang.Throwable -> L95
            int r6 = r1.a(r13)     // Catch: java.lang.Throwable -> L95
            int r7 = r1.b(r4)     // Catch: java.lang.Throwable -> L95
            r4 = r5
            r5 = 1
            r1.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L95
            goto L10a
        L95:
            r0 = move-exception
            goto L1ca
        L98:
            cn.jpush.android.ui.RoundedImageView r2 = r1.s     // Catch: java.lang.Throwable -> L95
            r2.setVisibility(r14)     // Catch: java.lang.Throwable -> L95
            android.view.View r2 = r1.m     // Catch: java.lang.Throwable -> L95
            r2.setVisibility(r15)     // Catch: java.lang.Throwable -> L95
            android.view.View r2 = r1.n     // Catch: java.lang.Throwable -> L95
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()     // Catch: java.lang.Throwable -> L95
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2     // Catch: java.lang.Throwable -> L95
            r6 = 22
            int r7 = r1.a(r6)     // Catch: java.lang.Throwable -> L95
            r2.leftMargin = r7     // Catch: java.lang.Throwable -> L95
            int r4 = r1.a(r4)     // Catch: java.lang.Throwable -> L95
            r2.rightMargin = r4     // Catch: java.lang.Throwable -> L95
            android.view.View r4 = r1.n     // Catch: java.lang.Throwable -> L95
            r4.setLayoutParams(r2)     // Catch: java.lang.Throwable -> L95
            boolean r2 = r11.has(r5)     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L107
            java.lang.String r2 = r11.optString(r5)     // Catch: java.lang.Throwable -> L95
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L95
            if (r4 != 0) goto L107
            cn.jpush.android.ui.RoundedImageView r4 = r1.r     // Catch: java.lang.Throwable -> L95
            r4.setVisibility(r15)     // Catch: java.lang.Throwable -> L95
            org.json.JSONObject r4 = r11.optJSONObject(r3)     // Catch: java.lang.Throwable -> L95
            r3 = r2
            cn.jpush.android.ui.RoundedImageView r2 = r1.r     // Catch: java.lang.Throwable -> L95
            int r5 = r1.a(r6)     // Catch: java.lang.Throwable -> L95
            int r7 = r1.a(r6)     // Catch: java.lang.Throwable -> L95
            r6 = r5
            r5 = 1
            r1.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L95
            cn.jpush.android.ui.RoundedImageView r2 = r1.r     // Catch: java.lang.Throwable -> L95
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()     // Catch: java.lang.Throwable -> L95
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2     // Catch: java.lang.Throwable -> L95
            r3 = 142(0x8e, float:1.99E-43)
            int r3 = r1.b(r3)     // Catch: java.lang.Throwable -> L95
            r2.height = r3     // Catch: java.lang.Throwable -> L95
            int r3 = r1.a(r13)     // Catch: java.lang.Throwable -> L95
            r2.width = r3     // Catch: java.lang.Throwable -> L95
            cn.jpush.android.ui.RoundedImageView r3 = r1.r     // Catch: java.lang.Throwable -> L95
            r3.setLayoutParams(r2)     // Catch: java.lang.Throwable -> L95
            cn.jpush.android.ui.RoundedImageView r2 = r1.r     // Catch: java.lang.Throwable -> L95
            r2.setRadius(r12, r12, r15, r15)     // Catch: java.lang.Throwable -> L95
            goto L10a
        L107:
            r1.l()     // Catch: java.lang.Throwable -> L95
        L10a:
            java.lang.String r2 = "interstitial"
            org.json.JSONObject r2 = r11.getJSONObject(r2)     // Catch: java.lang.Throwable -> L95
            boolean r3 = r2.has(r10)     // Catch: java.lang.Throwable -> L95
            r4 = -1
            if (r3 == 0) goto L129
            org.json.JSONObject r3 = r2.optJSONObject(r10)     // Catch: java.lang.Throwable -> L95
            if (r3 != 0) goto L11e
            goto L164
        L11e:
            android.widget.TextView r5 = r1.f1930g     // Catch: java.lang.Throwable -> L95
            r5.setVisibility(r15)     // Catch: java.lang.Throwable -> L95
            android.widget.TextView r5 = r1.f1930g     // Catch: java.lang.Throwable -> L95
            r1.a(r5, r3, r4)     // Catch: java.lang.Throwable -> L95
            goto L12e
        L129:
            android.widget.TextView r3 = r1.f1930g     // Catch: java.lang.Throwable -> L95
            r3.setVisibility(r14)     // Catch: java.lang.Throwable -> L95
        L12e:
            boolean r3 = r2.has(r9)     // Catch: java.lang.Throwable -> L95
            if (r3 == 0) goto L146
            org.json.JSONObject r3 = r2.optJSONObject(r9)     // Catch: java.lang.Throwable -> L95
            if (r3 != 0) goto L13b
            goto L164
        L13b:
            android.widget.TextView r5 = r1.f1931h     // Catch: java.lang.Throwable -> L95
            r5.setVisibility(r15)     // Catch: java.lang.Throwable -> L95
            android.widget.TextView r5 = r1.f1931h     // Catch: java.lang.Throwable -> L95
            r1.a(r5, r3, r4)     // Catch: java.lang.Throwable -> L95
            goto L14b
        L146:
            android.widget.TextView r3 = r1.f1931h     // Catch: java.lang.Throwable -> L95
            r3.setVisibility(r14)     // Catch: java.lang.Throwable -> L95
        L14b:
            boolean r3 = r2.has(r8)     // Catch: java.lang.Throwable -> L95
            r4 = 1
            if (r3 == 0) goto L171
            int r3 = r2.optInt(r8, r4)     // Catch: java.lang.Throwable -> L95
            if (r3 != r4) goto L15b
            android.widget.ImageView r3 = r1.l     // Catch: java.lang.Throwable -> L95
            goto L162
        L15b:
            r5 = 2
            if (r3 != r5) goto L161
            android.widget.ImageView r3 = r1.f1934k     // Catch: java.lang.Throwable -> L95
            goto L162
        L161:
            r3 = 0
        L162:
            if (r3 != 0) goto L165
        L164:
            return
        L165:
            r3.setVisibility(r15)     // Catch: java.lang.Throwable -> L95
            cn.jpush.android.u.d$1 r5 = new cn.jpush.android.u.d$1     // Catch: java.lang.Throwable -> L95
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L95
            r3.setOnClickListener(r5)     // Catch: java.lang.Throwable -> L95
            goto L17b
        L171:
            android.widget.ImageView r3 = r1.l     // Catch: java.lang.Throwable -> L95
            r3.setVisibility(r14)     // Catch: java.lang.Throwable -> L95
            android.widget.ImageView r3 = r1.f1934k     // Catch: java.lang.Throwable -> L95
            r3.setVisibility(r14)     // Catch: java.lang.Throwable -> L95
        L17b:
            boolean r3 = r2.has(r0)     // Catch: java.lang.Throwable -> L95
            if (r3 == 0) goto L1c4
            org.json.JSONArray r0 = r2.optJSONArray(r0)     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L1c4
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L95
            if (r2 > 0) goto L18e
            goto L1c4
        L18e:
            android.view.View r2 = r1.p     // Catch: java.lang.Throwable -> L95
            r2.setVisibility(r15)     // Catch: java.lang.Throwable -> L95
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L95
            r3 = 5
            if (r2 <= r4) goto L1b4
            android.widget.TextView r2 = r1.f1932i     // Catch: java.lang.Throwable -> L95
            r2.setVisibility(r15)     // Catch: java.lang.Throwable -> L95
            java.lang.Object r2 = r0.get(r15)     // Catch: java.lang.Throwable -> L95
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch: java.lang.Throwable -> L95
            android.widget.TextView r5 = r1.f1932i     // Catch: java.lang.Throwable -> L95
            r6 = 4
            r1.a(r5, r2, r6)     // Catch: java.lang.Throwable -> L95
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L95
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> L95
        L1b1:
            android.widget.TextView r2 = r1.f1933j     // Catch: java.lang.Throwable -> L95
            goto L1c0
        L1b4:
            android.widget.TextView r2 = r1.f1932i     // Catch: java.lang.Throwable -> L95
            r2.setVisibility(r14)     // Catch: java.lang.Throwable -> L95
            java.lang.Object r0 = r0.get(r15)     // Catch: java.lang.Throwable -> L95
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> L95
            goto L1b1
        L1c0:
            r1.a(r2, r0, r3)     // Catch: java.lang.Throwable -> L95
            return
        L1c4:
            android.view.View r0 = r1.p     // Catch: java.lang.Throwable -> L95
            r0.setVisibility(r14)     // Catch: java.lang.Throwable -> L95
            return
        L1ca:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "interstitial bindDataToView throwable="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "BaseInAppWrapper"
            cn.jpush.android.helper.Logger.d(r2, r0)
            return
    }
}
