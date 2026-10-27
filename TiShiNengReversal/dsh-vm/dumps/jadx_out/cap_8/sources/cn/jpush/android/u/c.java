package cn.jpush.android.u;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c extends cn.jpush.android.u.e {

    /* renamed from: g, reason: collision with root package name */
    private android.widget.ImageView f1926g;

    /* renamed from: h, reason: collision with root package name */
    private android.widget.ImageView f1927h;

    /* renamed from: i, reason: collision with root package name */
    private android.widget.TextView f1928i;

    /* renamed from: j, reason: collision with root package name */
    private android.view.View f1929j;



    public c(android.content.Context r1, cn.jpush.android.t.a r2, cn.jpush.android.d.d r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // cn.jpush.android.u.e
    protected void a() {
            r1 = this;
            java.lang.String r0 = "image"
            android.view.View r0 = r1.b(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.f1927h = r0
            java.lang.String r0 = "btn_countdown"
            android.view.View r0 = r1.b(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f1928i = r0
            java.lang.String r0 = "image_close"
            android.view.View r0 = r1.b(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.f1926g = r0
            java.lang.String r0 = "countdown_container"
            android.view.View r0 = r1.b(r0)
            r1.f1929j = r0
            return
    }

    @Override // cn.jpush.android.u.e
    protected java.lang.String b() {
            r1 = this;
            java.lang.String r0 = "jpush_full"
            return r0
    }

    @Override // cn.jpush.android.u.b
    public void c() {
            r0 = this;
            return
    }

    @Override // cn.jpush.android.u.b
    public void d() {
            r9 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L27
            cn.jpush.android.d.d r1 = r9.f1919b     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r1.f1762i     // Catch: java.lang.Throwable -> L27
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L27
            int r1 = r9.f1922e     // Catch: java.lang.Throwable -> L27
            r2 = 8
            r3 = 0
            r4 = 31
            if (r4 != r1) goto L29
            android.widget.ImageView r1 = r9.f1926g     // Catch: java.lang.Throwable -> L27
            r1.setVisibility(r3)     // Catch: java.lang.Throwable -> L27
            android.widget.TextView r1 = r9.f1928i     // Catch: java.lang.Throwable -> L27
            r1.setVisibility(r2)     // Catch: java.lang.Throwable -> L27
            android.widget.ImageView r1 = r9.f1926g     // Catch: java.lang.Throwable -> L27
            cn.jpush.android.u.c$1 r2 = new cn.jpush.android.u.c$1     // Catch: java.lang.Throwable -> L27
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L27
        L23:
            r1.setOnClickListener(r2)     // Catch: java.lang.Throwable -> L27
            goto L5c
        L27:
            r0 = move-exception
            goto L7e
        L29:
            android.widget.ImageView r1 = r9.f1926g     // Catch: java.lang.Throwable -> L27
            r1.setVisibility(r2)     // Catch: java.lang.Throwable -> L27
            android.widget.TextView r1 = r9.f1928i     // Catch: java.lang.Throwable -> L27
            r1.setVisibility(r3)     // Catch: java.lang.Throwable -> L27
            android.view.View r1 = r9.f1929j     // Catch: java.lang.Throwable -> L27
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch: java.lang.Throwable -> L27
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> L27
            r2 = 140(0x8c, float:1.96E-43)
            int r2 = r9.a(r2)     // Catch: java.lang.Throwable -> L27
            r1.width = r2     // Catch: java.lang.Throwable -> L27
            android.view.View r2 = r9.f1929j     // Catch: java.lang.Throwable -> L27
            r2.setLayoutParams(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "full"
            org.json.JSONObject r1 = r0.getJSONObject(r1)     // Catch: java.lang.Throwable -> L27
            android.widget.TextView r2 = r9.f1928i     // Catch: java.lang.Throwable -> L27
            r3 = 3
            r9.a(r2, r1, r3)     // Catch: java.lang.Throwable -> L27
            android.widget.TextView r1 = r9.f1928i     // Catch: java.lang.Throwable -> L27
            cn.jpush.android.u.c$2 r2 = new cn.jpush.android.u.c$2     // Catch: java.lang.Throwable -> L27
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L27
            goto L23
        L5c:
            java.lang.String r1 = "image"
            java.lang.String r4 = r0.getString(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "click"
            org.json.JSONObject r5 = r0.optJSONObject(r1)     // Catch: java.lang.Throwable -> L27
            android.content.Context r0 = r9.f1921d     // Catch: java.lang.Throwable -> L27
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L27
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch: java.lang.Throwable -> L27
            android.widget.ImageView r3 = r9.f1927h     // Catch: java.lang.Throwable -> L27
            int r7 = r0.widthPixels     // Catch: java.lang.Throwable -> L27
            int r8 = r0.heightPixels     // Catch: java.lang.Throwable -> L27
            r6 = 1
            r2 = r9
            r2.a(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L27
            return
        L7e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "full bindDataToView throwable="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "BaseInAppWrapper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            return
    }

    @Override // cn.jpush.android.u.e, cn.jpush.android.u.b
    public void g() {
            r1 = this;
            android.widget.TextView r0 = r1.f1928i
            r1.a(r0)
            return
    }
}
