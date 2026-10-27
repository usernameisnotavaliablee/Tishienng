package com.beizi.ad.internal.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DownloadAppInfoActivity extends android.app.Activity {
    private android.widget.ImageView a;

    /* renamed from: b, reason: collision with root package name */
    private android.widget.TextView f6595b;

    /* renamed from: c, reason: collision with root package name */
    private android.widget.LinearLayout f6596c;

    /* renamed from: d, reason: collision with root package name */
    private android.widget.LinearLayout f6597d;

    /* renamed from: e, reason: collision with root package name */
    private android.widget.LinearLayout f6598e;

    /* renamed from: f, reason: collision with root package name */
    private android.widget.TextView f6599f;

    /* renamed from: g, reason: collision with root package name */
    private android.widget.TextView f6600g;

    /* renamed from: h, reason: collision with root package name */
    private android.widget.TextView f6601h;

    /* renamed from: i, reason: collision with root package name */
    private android.view.View f6602i;

    /* renamed from: j, reason: collision with root package name */
    private android.view.View f6603j;

    /* renamed from: k, reason: collision with root package name */
    private android.view.View f6604k;
    private int l;
    private java.lang.String m;
    private java.lang.String n;
    private java.lang.String o;
    private java.lang.String p;
    private android.widget.ScrollView q;
    private android.widget.ScrollView r;
    private android.widget.ScrollView s;
    private android.widget.TextView t;
    private android.widget.TextView u;
    private android.widget.TextView v;
    private com.beizi.ad.internal.download.BeiZiWebView w;
    private com.beizi.ad.internal.download.BeiZiWebView x;
    private com.beizi.ad.internal.download.BeiZiWebView y;





    static {
            r0 = 13063(0x3307, float:1.8305E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public DownloadAppInfoActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.l = r0
            java.lang.String r0 = ""
            r1.m = r0
            r1.n = r0
            r1.o = r0
            r1.p = r0
            return
    }

    private void a() {
            r1 = this;
            int r0 = com.beizi.fusion.R.id.beizi_download_appinfo_back
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.a = r0
            int r0 = com.beizi.fusion.R.id.beizi_download_appinfo_title
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f6595b = r0
            int r0 = com.beizi.fusion.R.id.beizi_appinfo_permission_layout
            android.view.View r0 = r1.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.f6596c = r0
            int r0 = com.beizi.fusion.R.id.beizi_appinfo_permission_textview
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f6599f = r0
            int r0 = com.beizi.fusion.R.id.beizi_appinfo_permission_below_line
            android.view.View r0 = r1.findViewById(r0)
            r1.f6602i = r0
            int r0 = com.beizi.fusion.R.id.beizi_appinfo_privacy_layout
            android.view.View r0 = r1.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.f6597d = r0
            int r0 = com.beizi.fusion.R.id.beizi_appinfo_privacy_textview
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f6600g = r0
            int r0 = com.beizi.fusion.R.id.beizi_appinfo_privacy_below_line
            android.view.View r0 = r1.findViewById(r0)
            r1.f6603j = r0
            int r0 = com.beizi.fusion.R.id.beizi_appinfo_intro_layout
            android.view.View r0 = r1.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.f6598e = r0
            int r0 = com.beizi.fusion.R.id.beizi_appinfo_intro_textview
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f6601h = r0
            int r0 = com.beizi.fusion.R.id.beizi_appinfo_intro_below_line
            android.view.View r0 = r1.findViewById(r0)
            r1.f6604k = r0
            int r0 = com.beizi.fusion.R.id.beizi_download_appinfo_persmission_content_scrollview
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r1.q = r0
            int r0 = com.beizi.fusion.R.id.beizi_download_appinfo_persmission_content_textview
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.t = r0
            int r0 = com.beizi.fusion.R.id.beizi_download_appinfo_persmission_content_webview
            android.view.View r0 = r1.findViewById(r0)
            com.beizi.ad.internal.download.BeiZiWebView r0 = (com.beizi.ad.internal.download.BeiZiWebView) r0
            r1.w = r0
            int r0 = com.beizi.fusion.R.id.beizi_download_appinfo_privacy_content_scrollview
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r1.r = r0
            int r0 = com.beizi.fusion.R.id.beizi_download_appinfo_privacy_content_textview
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.u = r0
            int r0 = com.beizi.fusion.R.id.beizi_download_appinfo_privacy_content_webview
            android.view.View r0 = r1.findViewById(r0)
            com.beizi.ad.internal.download.BeiZiWebView r0 = (com.beizi.ad.internal.download.BeiZiWebView) r0
            r1.x = r0
            int r0 = com.beizi.fusion.R.id.beizi_download_appinfo_intro_content_scrollview
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r1.s = r0
            int r0 = com.beizi.fusion.R.id.beizi_download_appinfo_intro_content_textview
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.v = r0
            int r0 = com.beizi.fusion.R.id.beizi_download_appinfo_intro_content_webview
            android.view.View r0 = r1.findViewById(r0)
            com.beizi.ad.internal.download.BeiZiWebView r0 = (com.beizi.ad.internal.download.BeiZiWebView) r0
            r1.y = r0
            return
    }

    private void a(int r8) {
            r7 = this;
            r2 = 2
            if (r8 != r2) goto L17
            r7.d()
            android.widget.TextView r1 = r7.f6601h
            android.view.View r2 = r7.f6604k
            java.lang.String r3 = r7.o
            android.widget.TextView r4 = r7.v
            android.widget.ScrollView r5 = r7.s
            com.beizi.ad.internal.download.BeiZiWebView r6 = r7.y
            r0 = r7
            r0.a(r1, r2, r3, r4, r5, r6)
            return
        L17:
            r2 = 1
            if (r8 != r2) goto L2e
            r7.d()
            android.widget.TextView r1 = r7.f6600g
            android.view.View r2 = r7.f6603j
            java.lang.String r3 = r7.n
            android.widget.TextView r4 = r7.u
            android.widget.ScrollView r5 = r7.r
            com.beizi.ad.internal.download.BeiZiWebView r6 = r7.x
            r0 = r7
            r0.a(r1, r2, r3, r4, r5, r6)
            return
        L2e:
            r7.d()
            android.widget.TextView r1 = r7.f6599f
            android.view.View r2 = r7.f6602i
            java.lang.String r3 = r7.m
            android.widget.TextView r4 = r7.t
            android.widget.ScrollView r5 = r7.q
            com.beizi.ad.internal.download.BeiZiWebView r6 = r7.w
            r0 = r7
            r0.a(r1, r2, r3, r4, r5, r6)
            return
    }

    private void a(android.widget.TextView r3, android.view.View r4, java.lang.String r5, android.widget.TextView r6, android.widget.ScrollView r7, android.webkit.WebView r8) {
            r2 = this;
            int r0 = com.beizi.fusion.R.color.appinfo_tab_selected_color
            int r1 = androidx.core.content.ContextCompat.getColor(r2, r0)
            r3.setTextColor(r1)
            int r3 = androidx.core.content.ContextCompat.getColor(r2, r0)
            r4.setBackgroundColor(r3)
            r3 = 0
            r4.setVisibility(r3)
            java.lang.String r4 = "http"
            boolean r4 = r5.startsWith(r4)
            r0 = 8
            if (r4 == 0) goto L2d
            java.lang.String r4 = ""
            r6.setText(r4)
            r7.setVisibility(r0)
            r8.setVisibility(r3)
            r8.loadUrl(r5)
            return
        L2d:
            r6.setText(r5)
            r6.setVisibility(r3)
            r7.setVisibility(r3)
            r8.setVisibility(r0)
            return
    }

    static /* synthetic */ void a(com.beizi.ad.internal.activity.DownloadAppInfoActivity r0, int r1) {
            r0.a(r1)
            return
    }

    private void b() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.String r1 = "privacy_content_key"
            java.lang.String r1 = r0.getString(r1)
            r2.n = r1
            java.lang.String r1 = "title_content_key"
            java.lang.String r1 = r0.getString(r1)
            r2.p = r1
            java.lang.String r1 = "permission_content_key"
            java.lang.String r1 = r0.getString(r1)
            r2.m = r1
            java.lang.String r1 = "intro_content_key"
            java.lang.String r1 = r0.getString(r1)
            r2.o = r1
            java.lang.String r1 = "from_position_key"
            int r0 = r0.getInt(r1)
            r2.l = r0
            return
    }

    private void c() {
            r2 = this;
            java.lang.String r0 = r2.p
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lf
            android.widget.TextView r0 = r2.f6595b
            java.lang.String r1 = r2.p
            r0.setText(r1)
        Lf:
            android.widget.ImageView r0 = r2.a
            com.beizi.ad.internal.activity.DownloadAppInfoActivity$1 r1 = new com.beizi.ad.internal.activity.DownloadAppInfoActivity$1
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r2.f6596c
            com.beizi.ad.internal.activity.DownloadAppInfoActivity$2 r1 = new com.beizi.ad.internal.activity.DownloadAppInfoActivity$2
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r2.f6597d
            com.beizi.ad.internal.activity.DownloadAppInfoActivity$3 r1 = new com.beizi.ad.internal.activity.DownloadAppInfoActivity$3
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r2.f6598e
            com.beizi.ad.internal.activity.DownloadAppInfoActivity$4 r1 = new com.beizi.ad.internal.activity.DownloadAppInfoActivity$4
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    private void d() {
            r4 = this;
            android.widget.TextView r0 = r4.f6601h
            int r1 = com.beizi.fusion.R.color.appinfo_tab_unselected_color
            int r2 = androidx.core.content.ContextCompat.getColor(r4, r1)
            r0.setTextColor(r2)
            android.view.View r0 = r4.f6604k
            r2 = 4
            r0.setVisibility(r2)
            android.widget.TextView r0 = r4.f6599f
            int r3 = androidx.core.content.ContextCompat.getColor(r4, r1)
            r0.setTextColor(r3)
            android.view.View r0 = r4.f6602i
            r0.setVisibility(r2)
            android.widget.TextView r0 = r4.f6600g
            int r1 = androidx.core.content.ContextCompat.getColor(r4, r1)
            r0.setTextColor(r1)
            android.view.View r0 = r4.f6603j
            r0.setVisibility(r2)
            android.widget.ScrollView r0 = r4.s
            r1 = 8
            r0.setVisibility(r1)
            com.beizi.ad.internal.download.BeiZiWebView r0 = r4.y
            r0.setVisibility(r1)
            android.widget.TextView r0 = r4.v
            r0.setVisibility(r1)
            android.widget.ScrollView r0 = r4.q
            r0.setVisibility(r1)
            android.widget.TextView r0 = r4.t
            r0.setVisibility(r1)
            com.beizi.ad.internal.download.BeiZiWebView r0 = r4.w
            r0.setVisibility(r1)
            android.widget.ScrollView r0 = r4.r
            r0.setVisibility(r1)
            android.widget.TextView r0 = r4.u
            r0.setVisibility(r1)
            com.beizi.ad.internal.download.BeiZiWebView r0 = r4.x
            r0.setVisibility(r1)
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(@androidx.annotation.Nullable android.os.Bundle r1);
}
