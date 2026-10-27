package xyz.adscope.ad.widget.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ASNPLandingPageActivity extends android.app.Activity {
    private xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.LandingPageWebView a;
    private android.widget.TextView b;
    private android.widget.LinearLayout c;
    private android.view.View d;
    private java.lang.String e;

    static {
            r0 = 55678(0xd97e, float:7.8021E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public ASNPLandingPageActivity() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.e = r0
            return
    }

    private void a() {
            r0 = this;
            r0.finish()
            return
    }

    private /* synthetic */ void a(android.view.View r1) {
            r0 = this;
            r0.a()
            return
    }

    private void a(java.lang.String r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L17
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "X-Requested-With"
            java.lang.String r2 = ""
            r0.put(r1, r2)
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.LandingPageWebView r1 = r3.a
            r1.loadUrl(r4, r0)
        L17:
            return
    }

    public static /* synthetic */ void a(xyz.adscope.ad.widget.activity.ASNPLandingPageActivity r0, android.view.View r1) {
            r0.a(r1)
            return
    }

    private void b() {
            r3 = this;
            android.widget.LinearLayout r0 = r3.c
            xyz.adscope.ad.b7 r1 = xyz.adscope.ad.b7.a()
            java.lang.String r2 = "#FFFFFF"
            java.lang.String r1 = r1.a(r2)
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setBackgroundColor(r1)
            android.view.View r0 = r3.d
            xyz.adscope.ad.b7 r1 = xyz.adscope.ad.b7.a()
            java.lang.String r2 = "#FFC1C1C1"
            java.lang.String r1 = r1.a(r2)
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setBackgroundColor(r1)
            android.widget.TextView r0 = r3.b
            xyz.adscope.ad.b7 r1 = xyz.adscope.ad.b7.a()
            java.lang.String r2 = "#000000"
            java.lang.String r1 = r1.a(r2)
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            return
    }

    private void c() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            if (r0 == 0) goto L24
            java.lang.String r1 = "url"
            java.lang.String r1 = r0.getStringExtra(r1)
            r3.e = r1
            java.lang.String r1 = "ext"
            android.os.Bundle r0 = r0.getBundleExtra(r1)
            if (r0 == 0) goto L24
            java.lang.String r1 = "allow"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.LandingPageWebView r1 = r3.a
            if (r1 == 0) goto L24
            r1.setAllowDeeplinkDirect(r0)
        L24:
            return
    }

    private void d() {
            r2 = this;
            int r0 = xyz.adscope.amps.R.id.landing_page_container
            android.view.View r0 = r2.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.c = r0
            int r0 = xyz.adscope.amps.R.id.landing_page_divider
            android.view.View r0 = r2.findViewById(r0)
            r2.d = r0
            int r0 = xyz.adscope.amps.R.id.landing_page_main
            android.view.View r0 = r2.findViewById(r0)
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.LandingPageWebView r0 = (xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.LandingPageWebView) r0
            r2.a = r0
            int r0 = xyz.adscope.amps.R.id.landing_page_close
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.b = r0
            xyz.adscope.ad.widget.activity.f r1 = new xyz.adscope.ad.widget.activity.f
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            r2.b()     // Catch: java.lang.Exception -> L31
        L31:
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(android.os.Bundle r1);
}
