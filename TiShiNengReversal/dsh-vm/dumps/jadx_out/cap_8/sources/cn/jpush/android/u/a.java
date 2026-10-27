package cn.jpush.android.u;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends cn.jpush.android.u.e {

    /* renamed from: g, reason: collision with root package name */
    private android.view.View f1912g;

    /* renamed from: h, reason: collision with root package name */
    private cn.jpush.android.ui.RoundedImageView f1913h;

    /* renamed from: i, reason: collision with root package name */
    private cn.jpush.android.ui.RoundedImageView f1914i;

    /* renamed from: j, reason: collision with root package name */
    private android.widget.TextView f1915j;

    /* renamed from: k, reason: collision with root package name */
    private android.widget.TextView f1916k;
    private android.view.View l;
    private android.view.View m;


    public a(android.content.Context r1, cn.jpush.android.t.a r2, cn.jpush.android.d.d r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // cn.jpush.android.u.e
    protected void a() {
            r1 = this;
            java.lang.String r0 = "banner_content"
            android.view.View r0 = r1.b(r0)
            r1.f1912g = r0
            java.lang.String r0 = "image_only"
            android.view.View r0 = r1.b(r0)
            cn.jpush.android.ui.RoundedImageView r0 = (cn.jpush.android.ui.RoundedImageView) r0
            r1.f1913h = r0
            java.lang.String r0 = "text_content"
            android.view.View r0 = r1.b(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f1915j = r0
            java.lang.String r0 = "text_title"
            android.view.View r0 = r1.b(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f1916k = r0
            java.lang.String r0 = "image_small"
            android.view.View r0 = r1.b(r0)
            cn.jpush.android.ui.RoundedImageView r0 = (cn.jpush.android.ui.RoundedImageView) r0
            r1.f1914i = r0
            java.lang.String r0 = "banner"
            android.view.View r0 = r1.b(r0)
            r1.l = r0
            java.lang.String r0 = "bg_view"
            android.view.View r0 = r1.b(r0)
            r1.m = r0
            return
    }

    @Override // cn.jpush.android.u.e
    protected java.lang.String b() {
            r1 = this;
            java.lang.String r0 = "jpush_banner"
            return r0
    }

    @Override // cn.jpush.android.u.b
    public void c() {
            r0 = this;
            return
    }

    @Override // cn.jpush.android.u.b
    public void d() {
            r11 = this;
            java.lang.String r8 = "banner bindDataToView throwable="
            java.lang.String r9 = "BaseInAppWrapper"
            java.lang.String r0 = "small_image"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4c
            cn.jpush.android.d.d r3 = r11.f1919b     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = r3.f1762i     // Catch: java.lang.Throwable -> L4c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = "click"
            org.json.JSONObject r3 = r2.optJSONObject(r3)     // Catch: java.lang.Throwable -> L4c
            android.view.View r4 = r11.l     // Catch: java.lang.Throwable -> L4c
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()     // Catch: java.lang.Throwable -> L4c
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4     // Catch: java.lang.Throwable -> L4c
            r5 = 14
            int r6 = r11.a(r5)     // Catch: java.lang.Throwable -> L4c
            r4.leftMargin = r6     // Catch: java.lang.Throwable -> L4c
            r6 = 345(0x159, float:4.83E-43)
            int r6 = r11.a(r6)     // Catch: java.lang.Throwable -> L4c
            r4.width = r6     // Catch: java.lang.Throwable -> L4c
            int r5 = r11.a(r5)     // Catch: java.lang.Throwable -> L4c
            r4.rightMargin = r5     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L4f
            java.lang.String r5 = "type"
            int r5 = r3.optInt(r5)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r6 = "action"
            java.lang.String r3 = r3.optString(r6)     // Catch: java.lang.Throwable -> L4c
            android.view.View r6 = r11.f1935f     // Catch: java.lang.Throwable -> L4c
            cn.jpush.android.u.a$1 r7 = new cn.jpush.android.u.a$1     // Catch: java.lang.Throwable -> L4c
            r7.<init>(r11, r5, r3)     // Catch: java.lang.Throwable -> L4c
            r6.setOnClickListener(r7)     // Catch: java.lang.Throwable -> L4c
            goto L4f
        L4c:
            r0 = move-exception
            goto L13e
        L4f:
            int r3 = r11.f1922e     // Catch: java.lang.Throwable -> L4c
            r5 = 0
            r6 = 8
            r7 = 11
            if (r7 != r3) goto L88
            r0 = 92
            int r0 = r11.b(r0)     // Catch: java.lang.Throwable -> L4c
            r4.height = r0     // Catch: java.lang.Throwable -> L4c
            android.view.View r0 = r11.l     // Catch: java.lang.Throwable -> L4c
            r0.setLayoutParams(r4)     // Catch: java.lang.Throwable -> L4c
            android.view.View r0 = r11.m     // Catch: java.lang.Throwable -> L4c
            r0.setVisibility(r6)     // Catch: java.lang.Throwable -> L4c
            cn.jpush.android.ui.RoundedImageView r0 = r11.f1913h     // Catch: java.lang.Throwable -> L4c
            r0.setVisibility(r5)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = "image"
            java.lang.String r3 = r2.getString(r0)     // Catch: java.lang.Throwable -> L4c
            cn.jpush.android.ui.RoundedImageView r0 = r11.f1913h     // Catch: java.lang.Throwable -> L4c
            r2 = 45
            r0.setRadius(r2, r2, r2, r2)     // Catch: java.lang.Throwable -> L4c
            cn.jpush.android.ui.RoundedImageView r2 = r11.f1913h     // Catch: java.lang.Throwable -> L4c
            r6 = -1
            r7 = -1
            r4 = 0
            r5 = -1
            r1 = r11
            r1.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4c
            goto L150
        L88:
            android.view.View r3 = r11.m     // Catch: java.lang.Throwable -> L4c
            r3.setVisibility(r5)     // Catch: java.lang.Throwable -> L4c
            cn.jpush.android.ui.RoundedImageView r3 = r11.f1913h     // Catch: java.lang.Throwable -> L4c
            r3.setVisibility(r6)     // Catch: java.lang.Throwable -> L4c
            android.view.View r3 = r11.l     // Catch: java.lang.Throwable -> L4c
            r3.setLayoutParams(r4)     // Catch: java.lang.Throwable -> L4c
            android.view.View r3 = r11.f1912g     // Catch: java.lang.Throwable -> L4c
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()     // Catch: java.lang.Throwable -> L4c
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3     // Catch: java.lang.Throwable -> L4c
            r4 = 17
            int r4 = r11.a(r4)     // Catch: java.lang.Throwable -> L4c
            r3.leftMargin = r4     // Catch: java.lang.Throwable -> L4c
            r4 = 19
            int r4 = r11.a(r4)     // Catch: java.lang.Throwable -> L4c
            r3.rightMargin = r4     // Catch: java.lang.Throwable -> L4c
            r4 = 15
            int r4 = r11.b(r4)     // Catch: java.lang.Throwable -> L4c
            r3.topMargin = r4     // Catch: java.lang.Throwable -> L4c
            r4 = 12
            int r4 = r11.b(r4)     // Catch: java.lang.Throwable -> L4c
            r3.bottomMargin = r4     // Catch: java.lang.Throwable -> L4c
            android.view.View r4 = r11.f1912g     // Catch: java.lang.Throwable -> L4c
            r4.setLayoutParams(r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = "banner"
            org.json.JSONObject r10 = r2.getJSONObject(r3)     // Catch: java.lang.Throwable -> L4c
            boolean r2 = r10.has(r0)     // Catch: java.lang.Throwable -> L10a
            if (r2 == 0) goto L110
            java.lang.String r3 = r10.optString(r0)     // Catch: java.lang.Throwable -> L10a
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L10a
            if (r0 != 0) goto L110
            cn.jpush.android.ui.RoundedImageView r0 = r11.f1914i     // Catch: java.lang.Throwable -> L10a
            r0.setVisibility(r5)     // Catch: java.lang.Throwable -> L10a
            cn.jpush.android.ui.RoundedImageView r0 = r11.f1914i     // Catch: java.lang.Throwable -> L10a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Throwable -> L10a
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0     // Catch: java.lang.Throwable -> L10a
            r2 = 42
            int r4 = r11.a(r2)     // Catch: java.lang.Throwable -> L10a
            r0.width = r4     // Catch: java.lang.Throwable -> L10a
            int r2 = r11.a(r2)     // Catch: java.lang.Throwable -> L10a
            r0.height = r2     // Catch: java.lang.Throwable -> L10a
            cn.jpush.android.ui.RoundedImageView r2 = r11.f1914i     // Catch: java.lang.Throwable -> L10a
            r2.setLayoutParams(r0)     // Catch: java.lang.Throwable -> L10a
            cn.jpush.android.ui.RoundedImageView r0 = r11.f1914i     // Catch: java.lang.Throwable -> L10a
            r0.setRadius(r5, r5, r5, r5)     // Catch: java.lang.Throwable -> L10a
            cn.jpush.android.ui.RoundedImageView r2 = r11.f1914i     // Catch: java.lang.Throwable -> L10a
            r6 = -1
            r7 = -1
            r4 = 0
            r5 = -1
            r1 = r11
            r1.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L10a
            goto L113
        L10a:
            r0 = move-exception
            goto L12b
        L10c:
            r0.setVisibility(r6)     // Catch: java.lang.Throwable -> L10a
            goto L113
        L110:
            cn.jpush.android.ui.RoundedImageView r0 = r11.f1914i     // Catch: java.lang.Throwable -> L10a
            goto L10c
        L113:
            java.lang.String r0 = "title"
            org.json.JSONObject r0 = r10.getJSONObject(r0)     // Catch: java.lang.Throwable -> L10a
            android.widget.TextView r2 = r11.f1916k     // Catch: java.lang.Throwable -> L10a
            r3 = -1
            r11.a(r2, r0, r3)     // Catch: java.lang.Throwable -> L10a
            java.lang.String r0 = "content"
            org.json.JSONObject r0 = r10.getJSONObject(r0)     // Catch: java.lang.Throwable -> L10a
            android.widget.TextView r2 = r11.f1915j     // Catch: java.lang.Throwable -> L10a
            r11.a(r2, r0, r3)     // Catch: java.lang.Throwable -> L10a
            goto L150
        L12b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r2.<init>()     // Catch: java.lang.Throwable -> L4c
            r2.append(r8)     // Catch: java.lang.Throwable -> L4c
            r2.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L4c
            cn.jpush.android.helper.Logger.d(r9, r0)     // Catch: java.lang.Throwable -> L4c
            goto L150
        L13e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jpush.android.helper.Logger.d(r9, r0)
        L150:
            return
    }
}
