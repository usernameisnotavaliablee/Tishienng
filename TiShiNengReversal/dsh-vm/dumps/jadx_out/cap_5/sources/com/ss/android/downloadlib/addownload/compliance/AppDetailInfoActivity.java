package com.ss.android.downloadlib.addownload.compliance;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class AppDetailInfoActivity extends android.app.Activity {
    private android.widget.ImageView a;
    private android.widget.TextView b;
    private android.widget.LinearLayout c;
    private android.widget.ListView d;
    private long e;
    private long f;
    private java.util.List<android.util.Pair<java.lang.String, java.lang.String>> g;

    class a implements android.view.View.OnClickListener {
        final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity a;

        a(com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity r3 = r2.a
                long r0 = com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity.a(r3)
                java.lang.String r3 = "lp_app_detail_click_close"
                com.ss.android.downloadlib.addownload.compliance.a.c(r3, r0)
                com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity r3 = r2.a
                r3.finish()
                return
        }
    }

    class b implements android.view.View.OnClickListener {
        final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity a;

        b(com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity r3 = r2.a
                long r0 = com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity.a(r3)
                java.lang.String r3 = "lp_app_detail_click_download"
                com.ss.android.downloadlib.addownload.compliance.a.c(r3, r0)
                com.ss.android.downloadlib.addownload.compliance.f r3 = com.ss.android.downloadlib.addownload.compliance.f.a()
                com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity r0 = r2.a
                long r0 = com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity.a(r0)
                r3.i(r0)
                com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity r3 = r2.a
                com.ss.android.socialbase.appdownloader.b.u(r3)
                com.ss.android.downloadlib.addownload.compliance.f r3 = com.ss.android.downloadlib.addownload.compliance.f.a()
                android.app.Activity r3 = r3.h()
                com.ss.android.socialbase.appdownloader.b.u(r3)
                return
        }
    }

    private class c extends android.widget.BaseAdapter {
        final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity a;

        private c(com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ c(com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity r1, com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r1 = this;
                com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity r0 = r1.a
                java.util.List r0 = com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity.d(r0)
                int r0 = r0.size()
                return r0
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r2) {
                r1 = this;
                com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity r0 = r1.a
                java.util.List r0 = com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity.d(r0)
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
                r2 = this;
                if (r4 != 0) goto L30
                com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity r4 = r2.a
                int r5 = com.bytedance.gromore.R.layout.ttdownloader_item_permission
                r0 = 0
                android.view.View r4 = android.view.View.inflate(r4, r5, r0)
                com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity$d r5 = new com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity$d
                r5.<init>(r0)
                int r0 = com.bytedance.gromore.R.id.tv_permission_title
                android.view.View r0 = r4.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r5.a = r0
                int r0 = com.bytedance.gromore.R.id.tv_permission_description
                android.view.View r0 = r4.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r5.b = r0
                int r0 = com.bytedance.gromore.R.id.dash_line
                android.view.View r0 = r4.findViewById(r0)
                r5.c = r0
                r4.setTag(r5)
                goto L36
            L30:
                java.lang.Object r5 = r4.getTag()
                com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity$d r5 = (com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity.d) r5
            L36:
                android.widget.TextView r0 = r5.a
                com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity r1 = r2.a
                java.util.List r1 = com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity.d(r1)
                java.lang.Object r1 = r1.get(r3)
                android.util.Pair r1 = (android.util.Pair) r1
                java.lang.Object r1 = r1.first
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                android.widget.TextView r0 = r5.b
                com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity r1 = r2.a
                java.util.List r1 = com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity.d(r1)
                java.lang.Object r1 = r1.get(r3)
                android.util.Pair r1 = (android.util.Pair) r1
                java.lang.Object r1 = r1.second
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                int r0 = r2.getCount()
                int r0 = r0 + (-1)
                if (r3 != r0) goto L6f
                android.view.View r3 = r5.c
                r5 = 8
                r3.setVisibility(r5)
            L6f:
                return r4
        }
    }

    private static class d {
        public android.widget.TextView a;
        public android.widget.TextView b;
        public android.view.View c;

        private d() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ d(com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity.a r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            r0 = 41290(0xa14a, float:5.786E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public AppDetailInfoActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ long a(com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity r2) {
            long r0 = r2.f
            return r0
    }

    public static void b(android.app.Activity r2, long r3) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity> r1 = com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity.class
            r0.<init>(r2, r1)
            java.lang.String r1 = "app_info_id"
            r0.putExtra(r1, r3)
            r2.startActivity(r0)
            return
    }

    private boolean c() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "app_info_id"
            r2 = 0
            long r0 = r0.getLongExtra(r1, r2)
            r4.e = r0
            com.ss.android.downloadlib.addownload.compliance.cw r0 = com.ss.android.downloadlib.addownload.compliance.cw.j()
            long r1 = r4.e
            com.ss.android.downloadlib.addownload.o$j r0 = r0.j(r1)
            if (r0 != 0) goto L1c
            r0 = 0
            return r0
        L1c:
            long r1 = r0.b
            r4.f = r1
            java.util.List<android.util.Pair<java.lang.String, java.lang.String>> r0 = r0.h
            r4.g = r0
            r0 = 1
            return r0
    }

    static /* synthetic */ java.util.List d(com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity r0) {
            java.util.List<android.util.Pair<java.lang.String, java.lang.String>> r0 = r0.g
            return r0
    }

    private void e() {
            r3 = this;
            int r0 = com.bytedance.gromore.R.id.iv_detail_back
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.a = r0
            int r0 = com.bytedance.gromore.R.id.tv_empty
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.b = r0
            int r0 = com.bytedance.gromore.R.id.permission_list
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            r3.d = r0
            int r0 = com.bytedance.gromore.R.id.ll_download
            android.view.View r0 = r3.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.c = r0
            java.util.List<android.util.Pair<java.lang.String, java.lang.String>> r0 = r3.g
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3e
            android.widget.ListView r0 = r3.d
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r3.b
            r1 = 0
            r0.setVisibility(r1)
            goto L49
        L3e:
            android.widget.ListView r0 = r3.d
            com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity$c r1 = new com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity$c
            r2 = 0
            r1.<init>(r3, r2)
            r0.setAdapter(r1)
        L49:
            android.widget.ImageView r0 = r3.a
            com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity$a r1 = new com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity$a
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r3.c
            com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity$b r1 = new com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity$b
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            return
    }

    @Override // android.app.Activity
    public void onBackPressed() {
            r3 = this;
            java.lang.String r0 = "lp_app_detail_click_close"
            long r1 = r3.f
            com.ss.android.downloadlib.addownload.compliance.a.c(r0, r1)
            super.onBackPressed()
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(android.os.Bundle r1);
}
