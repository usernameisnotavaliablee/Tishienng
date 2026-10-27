package cn.jpush.android.u;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class e extends cn.jpush.android.u.b {

    /* renamed from: f, reason: collision with root package name */
    protected android.view.View f1935f;



    public e(android.content.Context r1, cn.jpush.android.t.a r2, cn.jpush.android.d.d r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    private void a(int r2, boolean r3) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L11
            r0 = 2
            if (r2 == r0) goto L9
            r2 = -1
            goto L18
        L9:
            if (r3 == 0) goto Le
            r2 = 4002(0xfa2, double:1.9773E-320)
            goto L18
        Le:
            r2 = 4001(0xfa1, double:1.977E-320)
            goto L18
        L11:
            if (r3 == 0) goto L16
            r2 = 4004(0xfa4, double:1.978E-320)
            goto L18
        L16:
            r2 = 4003(0xfa3, double:1.9777E-320)
        L18:
            r1.a(r2)
            return
    }

    private void a(long r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "report code="
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BaseInAppWrapper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L26
            android.content.Context r0 = r3.f1921d
            cn.jpush.android.d.d r1 = r3.f1919b
            java.lang.String r1 = r1.f1757d
            r2 = 4
            cn.jpush.android.helper.c.a(r0, r1, r4, r2)
        L26:
            return
    }

    private void d(int r3) {
            r2 = this;
            r0 = 1
            if (r3 == r0) goto L1e
            r0 = 2
            if (r3 == r0) goto L1b
            r0 = 3
            if (r3 == r0) goto L18
            r0 = 4
            if (r3 == r0) goto L15
            r0 = 5
            if (r3 == r0) goto L12
            r0 = -1
            goto L20
        L12:
            r0 = 4013(0xfad, double:1.9827E-320)
            goto L20
        L15:
            r0 = 4014(0xfae, double:1.983E-320)
            goto L20
        L18:
            r0 = 4012(0xfac, double:1.982E-320)
            goto L20
        L1b:
            r0 = 4011(0xfab, double:1.9817E-320)
            goto L20
        L1e:
            r0 = 4000(0xfa0, double:1.9763E-320)
        L20:
            r2.a(r0)
            return
    }

    private int e(int r3) {
            r2 = this;
            r0 = 2
            r1 = 3
            if (r3 == r0) goto Lb
            if (r3 == r1) goto L9
            r3 = 17
            return r3
        L9:
            r3 = 5
            return r3
        Lb:
            return r1
    }

    public android.view.View a(java.lang.String r6) {
            r5 = this;
            android.content.Context r0 = r5.f1921d
            android.content.res.Resources r0 = r0.getResources()
            android.content.Context r1 = r5.f1921d
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r2 = "layout"
            int r0 = r0.getIdentifier(r6, r2, r1)
            java.lang.String r1 = ".xml\" not found,please check res-layout file!!"
            java.lang.String r2 = "\""
            if (r0 <= 0) goto L3e
            android.content.Context r3 = r5.f1921d
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 0
            android.view.View r0 = r3.inflate(r0, r4)
            if (r0 == 0) goto L26
            return r0
        L26:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r6)
            r3.append(r1)
            java.lang.String r6 = r3.toString()
            r0.<init>(r6)
            throw r0
        L3e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r6)
            r3.append(r1)
            java.lang.String r6 = r3.toString()
            r0.<init>(r6)
            throw r0
    }

    protected abstract void a();

    protected void a(int r9, java.lang.String r10, int r11) {
            r8 = this;
            r0 = 1
            if (r9 == r0) goto L8
            r0 = 2
            if (r9 == r0) goto L8
            r5 = r10
            goto L20
        L8:
            android.content.Context r0 = r8.f1921d
            cn.jpush.android.d.d r1 = r8.f1919b
            cn.jpush.android.k.a.a(r0, r1)
            cn.jpush.android.ad.g r2 = cn.jpush.android.ad.g.a()
            android.content.Context r3 = r8.f1921d
            r6 = 0
            r7 = 0
            r4 = -1
            r5 = r10
            boolean r10 = r2.a(r3, r4, r5, r6, r7)
            r8.a(r9, r10)
        L20:
            android.content.Context r9 = r8.f1921d
            cn.jpush.android.d.d r10 = r8.f1919b
            r0 = 0
            java.lang.String r1 = "cn.jpush.android.intent.IN_APP_MSG_CLICK"
            cn.jpush.android.x.b.a(r9, r1, r10, r0, r5)
            cn.jpush.android.u.b$a r9 = r8.a
            if (r9 == 0) goto L39
            android.content.Context r10 = r8.f1921d
            android.view.View r0 = r8.e()
            cn.jpush.android.d.d r1 = r8.f1919b
            r9.a(r10, r0, r1)
        L39:
            r8.d(r11)
            return
    }

    protected void a(android.widget.ImageView r2, java.lang.String r3, org.json.JSONObject r4, int r5, int r6, int r7) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L10
            android.graphics.Bitmap r3 = cn.jpush.android.ad.e.a(r3, r6, r7)     // Catch: java.lang.Throwable -> Le
            r2.setImageBitmap(r3)     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r2 = move-exception
            goto L27
        L10:
            if (r4 == 0) goto L26
            java.lang.String r3 = "type"
            int r3 = r4.optInt(r3)     // Catch: java.lang.Throwable -> Le
            java.lang.String r6 = "action"
            java.lang.String r4 = r4.optString(r6)     // Catch: java.lang.Throwable -> Le
            cn.jpush.android.u.e$2 r6 = new cn.jpush.android.u.e$2     // Catch: java.lang.Throwable -> Le
            r6.<init>(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> Le
            r2.setOnClickListener(r6)     // Catch: java.lang.Throwable -> Le
        L26:
            return
        L27:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "native updateImage throwable="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "BaseInAppWrapper"
            cn.jpush.android.helper.Logger.d(r3, r2)
            return
    }

    protected void a(android.widget.TextView r7) {
            r6 = this;
            java.lang.CharSequence r0 = r7.getText()
            java.lang.String r0 = r0.toString()
            int r1 = cn.jpush.android.ad.m.b(r0)
            r2 = 1
            if (r1 <= r2) goto L38
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ""
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            int r1 = r1 - r2
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r0 = r0.replace(r3, r1)
            r7.setText(r0)
            return
        L38:
            cn.jpush.android.u.b$a r7 = r6.a
            android.content.Context r0 = r6.f1921d
            android.view.View r1 = r6.f1935f
            cn.jpush.android.d.d r2 = r6.f1919b
            r7.a(r0, r1, r2)
            return
    }

    protected void a(android.widget.TextView r7, org.json.JSONObject r8, int r9) {
            r6 = this;
            java.lang.String r0 = "bg_color"
            java.lang.String r1 = "click"
            java.lang.String r2 = "style"
            java.lang.String r3 = "duration"
            java.lang.String r4 = "text"
            java.lang.String r4 = r8.optString(r4)     // Catch: java.lang.Throwable -> L32
            boolean r5 = r8.has(r3)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L35
            int r3 = r8.optInt(r3)     // Catch: java.lang.Throwable -> L32
            int r3 = r3 / 1000
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r5.<init>()     // Catch: java.lang.Throwable -> L32
            r5.append(r3)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "s"
            r5.append(r3)     // Catch: java.lang.Throwable -> L32
            r5.append(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L32
            r7.setText(r3)     // Catch: java.lang.Throwable -> L32
            goto L38
        L32:
            r7 = move-exception
            goto Lce
        L35:
            r7.setText(r4)     // Catch: java.lang.Throwable -> L32
        L38:
            boolean r3 = r8.has(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = "#"
            if (r3 == 0) goto L8a
            org.json.JSONArray r2 = r8.optJSONArray(r2)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L8a
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L32
            r5 = 4
            if (r3 != r5) goto L8a
            r3 = 0
            int r3 = r2.optInt(r3)     // Catch: java.lang.Throwable -> L32
            r5 = 1
            if (r3 != r5) goto L5a
            android.graphics.Typeface r3 = android.graphics.Typeface.DEFAULT_BOLD     // Catch: java.lang.Throwable -> L32
            r7.setTypeface(r3)     // Catch: java.lang.Throwable -> L32
        L5a:
            int r3 = r2.optInt(r5)     // Catch: java.lang.Throwable -> L32
            if (r3 <= 0) goto L64
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L32
            r7.setTextSize(r3)     // Catch: java.lang.Throwable -> L32
        L64:
            r3 = 2
            int r3 = r2.optInt(r3)     // Catch: java.lang.Throwable -> L32
            if (r3 <= 0) goto L72
            int r3 = r6.e(r3)     // Catch: java.lang.Throwable -> L32
            r7.setGravity(r3)     // Catch: java.lang.Throwable -> L32
        L72:
            r3 = 3
            java.lang.String r2 = r2.optString(r3)     // Catch: java.lang.Throwable -> L32
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L8a
            boolean r3 = r2.startsWith(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L8a
            int r2 = android.graphics.Color.parseColor(r2)     // Catch: java.lang.Throwable -> L32
            r7.setTextColor(r2)     // Catch: java.lang.Throwable -> L32
        L8a:
            boolean r2 = r8.has(r1)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto Laa
            org.json.JSONObject r1 = r8.optJSONObject(r1)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto Laa
            java.lang.String r2 = "type"
            int r2 = r1.optInt(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "action"
            java.lang.String r1 = r1.optString(r3)     // Catch: java.lang.Throwable -> L32
            cn.jpush.android.u.e$1 r3 = new cn.jpush.android.u.e$1     // Catch: java.lang.Throwable -> L32
            r3.<init>(r6, r2, r1, r9)     // Catch: java.lang.Throwable -> L32
            r7.setOnClickListener(r3)     // Catch: java.lang.Throwable -> L32
        Laa:
            boolean r9 = r8.has(r0)     // Catch: java.lang.Throwable -> L32
            if (r9 == 0) goto Lcd
            java.lang.String r8 = r8.optString(r0)     // Catch: java.lang.Throwable -> L32
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L32
            if (r9 != 0) goto Lcd
            boolean r9 = r8.startsWith(r4)     // Catch: java.lang.Throwable -> L32
            if (r9 == 0) goto Lcd
            android.graphics.drawable.Drawable r7 = r7.getBackground()     // Catch: java.lang.Throwable -> L32
            android.graphics.drawable.GradientDrawable r7 = (android.graphics.drawable.GradientDrawable) r7     // Catch: java.lang.Throwable -> L32
            int r8 = android.graphics.Color.parseColor(r8)     // Catch: java.lang.Throwable -> L32
            r7.setColor(r8)     // Catch: java.lang.Throwable -> L32
        Lcd:
            return
        Lce:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "native updateTextView throwable="
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "BaseInAppWrapper"
            cn.jpush.android.helper.Logger.d(r8, r7)
            return
    }

    public final <T extends android.view.View> T b(java.lang.String r5) {
            r4 = this;
            android.content.Context r0 = r4.f1921d
            android.content.res.Resources r0 = r0.getResources()
            android.content.Context r1 = r4.f1921d
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r2 = "id"
            int r0 = r0.getIdentifier(r5, r2, r1)
            java.lang.String r1 = "\" not found, check layout.xml or not confused keep it"
            java.lang.String r2 = "view id=\""
            if (r0 <= 0) goto L3a
            android.view.View r3 = r4.f1935f
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L22
            return r0
        L22:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r5)
            r3.append(r1)
            java.lang.String r5 = r3.toString()
            r0.<init>(r5)
            throw r0
        L3a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r5)
            r3.append(r1)
            java.lang.String r5 = r3.toString()
            r0.<init>(r5)
            throw r0
    }

    protected abstract java.lang.String b();

    @Override // cn.jpush.android.u.b
    public android.view.View e() {
            r1 = this;
            android.view.View r0 = r1.f1935f
            return r0
    }

    @Override // cn.jpush.android.u.b
    public boolean f() {
            r5 = this;
            java.lang.String r0 = "BaseInAppWrapper"
            r1 = 0
            java.lang.String r2 = r5.b()     // Catch: java.lang.Throwable -> L31
            android.view.View r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L31
            r5.f1935f = r2     // Catch: java.lang.Throwable -> L31
            r5.a()     // Catch: java.lang.Throwable -> L12
            r0 = 1
            return r0
        L12:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "findViewByName throwable ="
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jpush.android.helper.Logger.ke(r0, r2)
            r2 = 3014(0xbc6, double:1.489E-320)
        L2d:
            r5.a(r2)
            return r1
        L31:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "inflateLayout throwable "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jpush.android.helper.Logger.ke(r0, r2)
            r2 = 3013(0xbc5, double:1.4886E-320)
            goto L2d
    }

    @Override // cn.jpush.android.u.b
    public void g() {
            r0 = this;
            return
    }
}
