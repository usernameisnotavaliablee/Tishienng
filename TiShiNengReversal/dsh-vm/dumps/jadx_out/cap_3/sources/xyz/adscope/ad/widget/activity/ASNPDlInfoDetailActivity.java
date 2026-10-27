package xyz.adscope.ad.widget.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ASNPDlInfoDetailActivity extends android.app.Activity {
    private com.google.android.material.tabs.TabLayout a;
    private android.widget.TextView b;
    private android.widget.TextView c;
    private android.widget.FrameLayout d;
    private xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView e;
    private java.lang.String f;
    private java.util.Map<java.lang.String, xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity.b> g;
    private final java.lang.String[] h;
    private int i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
        final /* synthetic */ xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity a;

        a(xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab r2) {
                r1 = this;
                int r2 = r2.getPosition()
                xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity r0 = r1.a
                int r0 = xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity.a(r0)
                if (r0 == r2) goto L16
                xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity r0 = r1.a
                xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity.b(r0, r2)
                xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity r0 = r1.a
                xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity.a(r0, r2)
            L16:
                return
        }

        public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab r2) {
                r1 = this;
                xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity r0 = r1.a
                int r2 = r2.getPosition()
                xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity.a(r0, r2)
                xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity r2 = r1.a
                int r0 = xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity.a(r2)
                xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity.b(r2, r0)
                return
        }

        public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b {
        private final java.lang.String a;
        private final java.lang.String b;

        private b(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        /* synthetic */ b(java.lang.String r1, java.lang.String r2, xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private boolean a() {
                r2 = this;
                java.lang.String r0 = r2.b
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L11
                java.lang.String r0 = r2.b
                java.lang.String r1 = "http"
                boolean r0 = r0.startsWith(r1)
                return r0
            L11:
                r0 = 0
                return r0
        }

        static /* synthetic */ boolean a(xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity.b r0) {
                boolean r0 = r0.a()
                return r0
        }

        static /* synthetic */ java.lang.String b(xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity.b r0) {
                java.lang.String r0 = r0.b
                return r0
        }

        static /* synthetic */ java.lang.String c(xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity.b r0) {
                java.lang.String r0 = r0.a
                return r0
        }
    }

    static {
            r0 = 55671(0xd977, float:7.8012E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public ASNPDlInfoDetailActivity() {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "privacy"
            java.lang.String r1 = "permission"
            java.lang.String r2 = "introduction"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            r3.h = r0
            r0 = -1
            r3.i = r0
            return
    }

    static /* synthetic */ int a(xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity r0) {
            int r0 = r0.i
            return r0
    }

    static /* synthetic */ int a(xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity r0, int r1) {
            r0.i = r1
            return r1
    }

    private java.lang.String a(java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.permission.PermissionModel> r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r4 == 0) goto L36
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L36
            java.util.Iterator r4 = r4.iterator()
        L11:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r4.next()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.permission.PermissionModel r1 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.permission.PermissionModel) r1
            java.lang.String r2 = r1.c()
            java.lang.String r1 = r1.a()
            r0.append(r2)
            java.lang.String r2 = ":"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            goto L11
        L36:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private void a() {
            r0 = this;
            r0.finish()
            return
    }

    private void a(int r4) {
            r3 = this;
            android.widget.TextView r0 = r3.b
            java.lang.String r1 = r3.f
            r0.setText(r1)
            r0 = 3
            if (r4 >= r0) goto L4b
            java.lang.String[] r0 = r3.h
            r4 = r0[r4]
            java.util.Map<java.lang.String, xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity$b> r0 = r3.g
            if (r0 == 0) goto L4b
            java.lang.Object r4 = r0.get(r4)
            xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity$b r4 = (xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity.b) r4
            if (r4 == 0) goto L4b
            boolean r0 = xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity.b.a(r4)
            r1 = 8
            if (r0 == 0) goto L37
            android.widget.FrameLayout r0 = r3.d
            r0.setVisibility(r1)
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView r0 = r3.e
            r1 = 4
            r0.setVisibility(r1)
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView r0 = r3.e
            java.lang.String r4 = xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity.b.b(r4)
            r0.loadUrl(r4)
            return
        L37:
            android.widget.FrameLayout r0 = r3.d
            r2 = 0
            r0.setVisibility(r2)
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView r0 = r3.e
            r0.setVisibility(r1)
            android.widget.TextView r0 = r3.c
            java.lang.String r4 = xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity.b.c(r4)
            r0.setText(r4)
        L4b:
            return
    }

    private /* synthetic */ void a(android.view.View r1) {
            r0 = this;
            r0.a()
            return
    }

    private void a(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L34
            java.lang.String r0 = "introduction"
            boolean r0 = r0.equalsIgnoreCase(r3)
            r1 = -1
            if (r0 == 0) goto L11
            r3 = 0
            goto L26
        L11:
            java.lang.String r0 = "privacy"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L1b
            r3 = 1
            goto L26
        L1b:
            java.lang.String r0 = "permission"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L25
            r3 = 2
            goto L26
        L25:
            r3 = -1
        L26:
            com.google.android.material.tabs.TabLayout r0 = r2.a
            if (r0 == 0) goto L34
            if (r3 == r1) goto L34
            com.google.android.material.tabs.TabLayout$Tab r3 = r0.getTabAt(r3)
            r0.selectTab(r3)
            return
        L34:
            r2.d()
            return
    }

    public static /* synthetic */ void a(xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity r0, android.view.View r1) {
            r0.a(r1)
            return
    }

    private boolean a(android.content.Intent r6) {
            r5 = this;
            java.lang.String r0 = "dlm"
            java.lang.String r6 = r6.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 1
            if (r0 != 0) goto L6e
            boolean r0 = xyz.adscope.common.v2.tool.json.JsonUtil.isValidJson(r6)
            if (r0 == 0) goto L6e
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel r0 = new xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.DownloadInfoModel
            org.json.JSONObject r6 = xyz.adscope.common.v2.tool.json.JsonUtil.parseJSONObject(r6)
            r0.<init>(r6)
            boolean r6 = r0.hasParseException()
            if (r6 != 0) goto L6e
            java.lang.String r6 = r0.f()
            r5.f = r6
            android.util.ArrayMap r6 = new android.util.ArrayMap
            r6.<init>()
            r5.g = r6
            xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity$b r1 = new xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity$b
            java.lang.String r2 = r0.b()
            java.lang.String r3 = ""
            r4 = 0
            r1.<init>(r2, r3, r4)
            java.lang.String r2 = "introduction"
            r6.put(r2, r1)
            java.util.Map<java.lang.String, xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity$b> r6 = r5.g
            xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity$b r1 = new xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity$b
            java.lang.String r2 = r0.i()
            java.lang.String r3 = r0.j()
            r1.<init>(r2, r3, r4)
            java.lang.String r2 = "privacy"
            r6.put(r2, r1)
            java.util.Map<java.lang.String, xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity$b> r6 = r5.g
            xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity$b r1 = new xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity$b
            java.util.List r2 = r0.g()
            java.lang.String r2 = r5.a(r2)
            java.lang.String r0 = r0.h()
            r1.<init>(r2, r0, r4)
            java.lang.String r0 = "permission"
            r6.put(r0, r1)
            r6 = 0
            return r6
        L6e:
            return r1
    }

    private void b() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            if (r0 == 0) goto L24
            boolean r1 = r2.a(r0)
            if (r1 == 0) goto L10
            r2.a()
            return
        L10:
            java.lang.String r1 = "whichTab"
            java.lang.String r0 = r0.getStringExtra(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L20
            r2.a(r0)
            return
        L20:
            r2.d()
            return
        L24:
            r2.a()
            return
    }

    static /* synthetic */ void b(xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity r0, int r1) {
            r0.a(r1)
            return
    }

    private void c() {
            r2 = this;
            int r0 = xyz.adscope.amps.R.id.asnp_download_detail_layout
            android.view.View r0 = r2.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r2.d = r0
            int r0 = xyz.adscope.amps.R.id.asnp_download_detail_title
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.b = r0
            int r0 = xyz.adscope.amps.R.id.asnp_download_detail_web
            android.view.View r0 = r2.findViewById(r0)
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView r0 = (xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView) r0
            r2.e = r0
            int r0 = xyz.adscope.amps.R.id.asnp_download_detail_content
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.c = r0
            int r0 = xyz.adscope.amps.R.id.asnp_download_detail_back
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            xyz.adscope.ad.widget.activity.b r1 = new xyz.adscope.ad.widget.activity.b
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            int r0 = xyz.adscope.amps.R.id.asnp_download_detail_tab
            android.view.View r0 = r2.findViewById(r0)
            com.google.android.material.tabs.TabLayout r0 = (com.google.android.material.tabs.TabLayout) r0
            r2.a = r0
            xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity$a r1 = new xyz.adscope.ad.widget.activity.ASNPDlInfoDetailActivity$a
            r1.<init>(r2)
            r0.addOnTabSelectedListener(r1)
            return
    }

    private void d() {
            r1 = this;
            java.lang.String r0 = "introduction"
            r1.a(r0)
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(@androidx.annotation.Nullable android.os.Bundle r1);
}
