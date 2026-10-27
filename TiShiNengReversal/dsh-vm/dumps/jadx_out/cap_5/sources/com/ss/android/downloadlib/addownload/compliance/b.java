package com.ss.android.downloadlib.addownload.compliance;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b extends android.app.Dialog {
    private android.widget.TextView a;
    private android.widget.TextView b;
    private android.widget.TextView c;
    private android.widget.TextView d;
    private android.widget.TextView e;
    private android.widget.TextView f;
    private com.ss.android.downloadlib.guide.install.ClipImageView g;
    private android.widget.LinearLayout h;
    private android.app.Activity i;
    private final long j;
    private long k;
    private final com.ss.android.downloadlib.addownload.o.j l;

    class a implements android.content.DialogInterface.OnCancelListener {
        final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.b a;

        a(com.ss.android.downloadlib.addownload.compliance.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(android.content.DialogInterface r3) {
                r2 = this;
                com.ss.android.downloadlib.addownload.compliance.b r3 = r2.a
                long r0 = com.ss.android.downloadlib.addownload.compliance.b.b(r3)
                java.lang.String r3 = "lp_app_dialog_cancel"
                com.ss.android.downloadlib.addownload.compliance.a.c(r3, r0)
                return
        }
    }

    /* renamed from: com.ss.android.downloadlib.addownload.compliance.b$b, reason: collision with other inner class name */
    class C0200b implements com.ss.android.downloadlib.addownload.compliance.r.c {
        final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.b a;

        C0200b(com.ss.android.downloadlib.addownload.compliance.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.ss.android.downloadlib.addownload.compliance.r.c
        public void j(android.graphics.Bitmap r3) {
                r2 = this;
                if (r3 == 0) goto Lc
                com.ss.android.downloadlib.addownload.compliance.b r0 = r2.a
                com.ss.android.downloadlib.guide.install.ClipImageView r0 = com.ss.android.downloadlib.addownload.compliance.b.e(r0)
                r0.setImageBitmap(r3)
                return
            Lc:
                com.ss.android.downloadlib.addownload.compliance.b r3 = r2.a
                long r0 = com.ss.android.downloadlib.addownload.compliance.b.b(r3)
                r3 = 8
                com.ss.android.downloadlib.addownload.compliance.a.a(r3, r0)
                return
        }
    }

    class c implements android.view.View.OnClickListener {
        final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.b a;

        c(com.ss.android.downloadlib.addownload.compliance.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                com.ss.android.downloadlib.addownload.compliance.f r3 = com.ss.android.downloadlib.addownload.compliance.f.a()
                com.ss.android.downloadlib.addownload.compliance.b r0 = r2.a
                android.app.Activity r0 = com.ss.android.downloadlib.addownload.compliance.b.a(r0)
                r3.c(r0)
                com.ss.android.downloadlib.addownload.compliance.b r3 = r2.a
                android.app.Activity r3 = com.ss.android.downloadlib.addownload.compliance.b.a(r3)
                com.ss.android.downloadlib.addownload.compliance.b r0 = r2.a
                long r0 = com.ss.android.downloadlib.addownload.compliance.b.d(r0)
                com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity.b(r3, r0)
                com.ss.android.downloadlib.addownload.compliance.b r3 = r2.a
                long r0 = com.ss.android.downloadlib.addownload.compliance.b.b(r3)
                java.lang.String r3 = "lp_app_dialog_click_detail"
                com.ss.android.downloadlib.addownload.compliance.a.c(r3, r0)
                return
        }
    }

    class d implements android.view.View.OnClickListener {
        final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.b a;

        d(com.ss.android.downloadlib.addownload.compliance.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                com.ss.android.downloadlib.addownload.compliance.f r3 = com.ss.android.downloadlib.addownload.compliance.f.a()
                com.ss.android.downloadlib.addownload.compliance.b r0 = r2.a
                android.app.Activity r0 = com.ss.android.downloadlib.addownload.compliance.b.a(r0)
                r3.c(r0)
                com.ss.android.downloadlib.addownload.compliance.b r3 = r2.a
                android.app.Activity r3 = com.ss.android.downloadlib.addownload.compliance.b.a(r3)
                com.ss.android.downloadlib.addownload.compliance.b r0 = r2.a
                long r0 = com.ss.android.downloadlib.addownload.compliance.b.d(r0)
                com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity.b(r3, r0)
                com.ss.android.downloadlib.addownload.compliance.b r3 = r2.a
                long r0 = com.ss.android.downloadlib.addownload.compliance.b.b(r3)
                java.lang.String r3 = "lp_app_dialog_click_privacy"
                com.ss.android.downloadlib.addownload.compliance.a.c(r3, r0)
                return
        }
    }

    class e implements android.view.View.OnClickListener {
        final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.b a;

        e(com.ss.android.downloadlib.addownload.compliance.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                com.ss.android.downloadlib.addownload.compliance.b r3 = r2.a
                r3.dismiss()
                com.ss.android.downloadlib.addownload.compliance.b r3 = r2.a
                long r0 = com.ss.android.downloadlib.addownload.compliance.b.b(r3)
                java.lang.String r3 = "lp_app_dialog_click_giveup"
                com.ss.android.downloadlib.addownload.compliance.a.c(r3, r0)
                return
        }
    }

    class f implements android.view.View.OnClickListener {
        final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.b a;

        f(com.ss.android.downloadlib.addownload.compliance.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                com.ss.android.downloadlib.addownload.compliance.b r3 = r2.a
                long r0 = com.ss.android.downloadlib.addownload.compliance.b.b(r3)
                java.lang.String r3 = "lp_app_dialog_click_download"
                com.ss.android.downloadlib.addownload.compliance.a.c(r3, r0)
                com.ss.android.downloadlib.addownload.compliance.f r3 = com.ss.android.downloadlib.addownload.compliance.f.a()
                com.ss.android.downloadlib.addownload.compliance.b r0 = r2.a
                long r0 = com.ss.android.downloadlib.addownload.compliance.b.b(r0)
                r3.i(r0)
                com.ss.android.downloadlib.addownload.compliance.b r3 = r2.a
                r3.dismiss()
                return
        }
    }

    public b(@androidx.annotation.NonNull android.app.Activity r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.i = r1
            r0.j = r2
            com.ss.android.downloadlib.addownload.compliance.cw r1 = com.ss.android.downloadlib.addownload.compliance.cw.j()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            com.ss.android.downloadlib.addownload.o$j r1 = (com.ss.android.downloadlib.addownload.o.j) r1
            r0.l = r1
            return
    }

    static /* synthetic */ android.app.Activity a(com.ss.android.downloadlib.addownload.compliance.b r0) {
            android.app.Activity r0 = r0.i
            return r0
    }

    static /* synthetic */ long b(com.ss.android.downloadlib.addownload.compliance.b r2) {
            long r0 = r2.k
            return r0
    }

    private void c() {
            r4 = this;
            int r0 = com.bytedance.gromore.R.id.tv_app_name
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.a = r0
            int r0 = com.bytedance.gromore.R.id.tv_app_version
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.b = r0
            int r0 = com.bytedance.gromore.R.id.tv_app_developer
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.c = r0
            int r0 = com.bytedance.gromore.R.id.tv_app_detail
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.d = r0
            int r0 = com.bytedance.gromore.R.id.tv_app_privacy
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.e = r0
            int r0 = com.bytedance.gromore.R.id.tv_give_up
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.f = r0
            int r0 = com.bytedance.gromore.R.id.iv_app_icon
            android.view.View r0 = r4.findViewById(r0)
            com.ss.android.downloadlib.guide.install.ClipImageView r0 = (com.ss.android.downloadlib.guide.install.ClipImageView) r0
            r4.g = r0
            int r0 = com.bytedance.gromore.R.id.ll_download
            android.view.View r0 = r4.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r4.h = r0
            android.widget.TextView r0 = r4.a
            com.ss.android.downloadlib.addownload.o$j r1 = r4.l
            java.lang.String r1 = r1.e
            java.lang.String r2 = "--"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.lang.String r1 = com.ss.android.downloadlib.a.h.q(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r4.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "版本号："
            r1.<init>(r3)
            com.ss.android.downloadlib.addownload.o$j r3 = r4.l
            java.lang.String r3 = r3.f
            java.lang.String[] r2 = new java.lang.String[]{r3, r2}
            java.lang.String r2 = com.ss.android.downloadlib.a.h.q(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r4.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "开发者："
            r1.<init>(r2)
            com.ss.android.downloadlib.addownload.o$j r2 = r4.l
            java.lang.String r2 = r2.g
            java.lang.String r3 = "应用信息正在完善中"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.lang.String r2 = com.ss.android.downloadlib.a.h.q(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            com.ss.android.downloadlib.guide.install.ClipImageView r0 = r4.g
            android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
            r2 = 1090519040(0x41000000, float:8.0)
            int r1 = com.ss.android.downloadlib.a.h.f(r1, r2)
            r0.setRoundRadius(r1)
            com.ss.android.downloadlib.guide.install.ClipImageView r0 = r4.g
            java.lang.String r1 = "#EBEBEB"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setBackgroundColor(r1)
            com.ss.android.downloadlib.addownload.compliance.r r0 = com.ss.android.downloadlib.addownload.compliance.r.j()
            long r1 = r4.j
            com.ss.android.downloadlib.addownload.compliance.b$b r3 = new com.ss.android.downloadlib.addownload.compliance.b$b
            r3.<init>(r4)
            r0.j(r1, r3)
            android.widget.TextView r0 = r4.d
            com.ss.android.downloadlib.addownload.compliance.b$c r1 = new com.ss.android.downloadlib.addownload.compliance.b$c
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r4.e
            com.ss.android.downloadlib.addownload.compliance.b$d r1 = new com.ss.android.downloadlib.addownload.compliance.b$d
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r4.f
            com.ss.android.downloadlib.addownload.compliance.b$e r1 = new com.ss.android.downloadlib.addownload.compliance.b$e
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r4.h
            com.ss.android.downloadlib.addownload.compliance.b$f r1 = new com.ss.android.downloadlib.addownload.compliance.b$f
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            return
    }

    static /* synthetic */ long d(com.ss.android.downloadlib.addownload.compliance.b r2) {
            long r0 = r2.j
            return r0
    }

    static /* synthetic */ com.ss.android.downloadlib.guide.install.ClipImageView e(com.ss.android.downloadlib.addownload.compliance.b r0) {
            com.ss.android.downloadlib.guide.install.ClipImageView r0 = r0.g
            return r0
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
            r1 = this;
            super.dismiss()
            android.app.Activity r0 = r1.i
            com.ss.android.socialbase.appdownloader.b.u(r0)
            return
    }

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            com.ss.android.downloadlib.addownload.o$j r3 = r2.l
            if (r3 != 0) goto Lb
            r2.dismiss()
            return
        Lb:
            r3 = 1
            r2.requestWindowFeature(r3)
            int r0 = com.bytedance.gromore.R.layout.ttdownloader_dialog_appinfo
            r2.setContentView(r0)
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L1f
            int r1 = com.bytedance.gromore.R.drawable.ttdownloader_bg_transparent
            r0.setBackgroundDrawableResource(r1)
        L1f:
            r2.setCancelable(r3)
            r2.setCanceledOnTouchOutside(r3)
            com.ss.android.downloadlib.addownload.o$j r3 = r2.l
            long r0 = r3.b
            r2.k = r0
            r2.c()
            java.lang.String r3 = "lp_app_dialog_show"
            long r0 = r2.k
            com.ss.android.downloadlib.addownload.compliance.a.f(r3, r0)
            com.ss.android.downloadlib.addownload.compliance.b$a r3 = new com.ss.android.downloadlib.addownload.compliance.b$a
            r3.<init>(r2)
            r2.setOnCancelListener(r3)
            return
    }
}
