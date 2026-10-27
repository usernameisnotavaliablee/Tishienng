package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a5 {
    public static androidx.appcompat.app.AlertDialog a;

    /* renamed from: b, reason: collision with root package name */
    public static android.widget.ImageView f2072b;

    /* renamed from: c, reason: collision with root package name */
    public static android.widget.ImageView f2073c;

    /* renamed from: d, reason: collision with root package name */
    public static android.widget.TextView f2074d;

    /* renamed from: e, reason: collision with root package name */
    public static android.widget.TextView f2075e;

    /* renamed from: f, reason: collision with root package name */
    public static android.widget.TextView f2076f;

    /* renamed from: g, reason: collision with root package name */
    public static android.widget.TextView f2077g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.activity.AcseHelpManager.OnClickCallBack a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ android.app.Activity f2078b;

        public a(com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r1, android.app.Activity r2) {
                r0 = this;
                r0.a = r1
                r0.f2078b = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                android.widget.TextView r2 = com.acse.ottn.a5.a()
                int r2 = r2.getVisibility()
                if (r2 != 0) goto L12
                com.acse.ottn.activity.AcseHelpManager$OnClickCallBack r2 = r1.a
                if (r2 == 0) goto L19
                r2.onDismiss()
                goto L19
            L12:
                com.acse.ottn.activity.AcseHelpManager$OnClickCallBack r2 = r1.a
                if (r2 == 0) goto L19
                r2.onOpen()
            L19:
                android.app.Activity r2 = r1.f2078b
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.a5.b()
                com.acse.ottn.a5.a(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.activity.AcseHelpManager.OnClickCallBack a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ android.app.Activity f2079b;

        public b(com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r1, android.app.Activity r2) {
                r0 = this;
                r0.a = r1
                r0.f2079b = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                com.acse.ottn.q2 r2 = com.acse.ottn.q2.b()
                java.lang.String r0 = "warning_start_run"
                r2.a(r0)
                com.acse.ottn.activity.AcseHelpManager$OnClickCallBack r2 = r1.a
                if (r2 == 0) goto L10
                r2.onOpen()
            L10:
                android.app.Activity r2 = r1.f2079b
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.a5.b()
                com.acse.ottn.a5.a(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.activity.AcseHelpManager.OnClickCallBack a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ android.app.Activity f2080b;

        public c(com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r1, android.app.Activity r2) {
                r0 = this;
                r0.a = r1
                r0.f2080b = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                com.acse.ottn.activity.AcseHelpManager$OnClickCallBack r2 = r1.a
                if (r2 == 0) goto L7
                r2.onClose()
            L7:
                android.app.Activity r2 = r1.f2080b
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.a5.b()
                com.acse.ottn.a5.a(r2, r0)
                return
        }
    }

    public a5() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ android.widget.TextView a() {
            android.widget.TextView r0 = com.acse.ottn.a5.f2075e
            return r0
    }

    public static androidx.appcompat.app.AlertDialog a(android.app.Activity r6, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r7) {
            r3 = 0
            r4 = 0
            r1 = 0
            r2 = 0
            r0 = r6
            r5 = r7
            androidx.appcompat.app.AlertDialog r6 = b(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static androidx.appcompat.app.AlertDialog a(android.app.Activity r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r5) {
            androidx.appcompat.app.AlertDialog r0 = b(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static void a(android.app.Activity r0, android.app.Dialog r1) {
            boolean r0 = r0.isFinishing()     // Catch: java.lang.Exception -> L11
            if (r0 != 0) goto L11
            if (r1 == 0) goto L11
            boolean r0 = r1.isShowing()     // Catch: java.lang.Exception -> L11
            if (r0 == 0) goto L11
            r1.dismiss()     // Catch: java.lang.Exception -> L11
        L11:
            return
    }

    public static /* synthetic */ androidx.appcompat.app.AlertDialog b() {
            androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.a5.a
            return r0
    }

    public static androidx.appcompat.app.AlertDialog b(android.app.Activity r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r10) {
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r5)
            int r1 = com.acse.ottn.R.layout.warning_dialog
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            int r1 = com.acse.ottn.R.id.iv_dismiss
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            com.acse.ottn.a5.f2072b = r1
            int r1 = com.acse.ottn.R.id.tv_button
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.acse.ottn.a5.f2074d = r1
            int r1 = com.acse.ottn.R.id.tv_but2
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.acse.ottn.a5.f2075e = r1
            int r1 = com.acse.ottn.R.id.iv_icon
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            com.acse.ottn.a5.f2073c = r1
            int r1 = com.acse.ottn.R.id.tv_content
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.acse.ottn.a5.f2076f = r1
            int r1 = com.acse.ottn.R.id.tv_version_info
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.acse.ottn.a5.f2077g = r1
            android.widget.TextView r1 = com.acse.ottn.a5.f2075e
            r3 = 0
            r1.setVisibility(r3)
            android.widget.TextView r1 = com.acse.ottn.a5.f2074d
            java.lang.String r3 = "#999999"
            int r3 = android.graphics.Color.parseColor(r3)
            r1.setTextColor(r3)
            android.widget.TextView r1 = com.acse.ottn.a5.f2074d
            r1.setBackground(r2)
            int r1 = com.acse.ottn.R.id.rl_bg
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            com.acse.ottn.h0 r3 = com.acse.ottn.h0.a()
            r3.a(r5, r1)
            com.acse.ottn.h0 r1 = com.acse.ottn.h0.a()
            android.widget.TextView r3 = com.acse.ottn.a5.f2077g
            android.widget.TextView r4 = com.acse.ottn.a5.f2076f
            r1.a(r5, r3, r4)
            com.acse.ottn.h0 r1 = com.acse.ottn.h0.a()
            android.widget.TextView r3 = com.acse.ottn.a5.f2074d
            r1.a(r5, r2, r3)
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto Lad
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto Lad
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto Lad
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto Lad
            android.widget.TextView r1 = com.acse.ottn.a5.f2075e
            r1.setText(r8)
            android.widget.TextView r8 = com.acse.ottn.a5.f2074d
            r8.setText(r9)
            android.widget.TextView r8 = com.acse.ottn.a5.f2076f
            r8.setText(r7)
            android.widget.TextView r7 = com.acse.ottn.a5.f2077g
            r7.setText(r6)
            goto L105
        Lad:
            android.widget.TextView r6 = com.acse.ottn.a5.f2077g
            int r7 = com.acse.ottn.R.string.warning_dialog_title
            java.lang.String r7 = r5.getString(r7)
            r6.setText(r7)
            java.lang.String r6 = r5.getPackageName()
            java.lang.String r7 = com.acse.ottn.l0.s
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto Le8
            java.lang.String r6 = r5.getPackageName()
            java.lang.String r7 = com.acse.ottn.l0.t
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto Ld1
            goto Le8
        Ld1:
            android.widget.TextView r6 = com.acse.ottn.a5.f2076f
            int r7 = com.acse.ottn.R.string.warning_message
            java.lang.String r7 = r5.getString(r7)
            r6.setText(r7)
            android.widget.TextView r6 = com.acse.ottn.a5.f2074d
            int r7 = com.acse.ottn.R.string.warning_commit
            java.lang.String r7 = r5.getString(r7)
            r6.setText(r7)
            goto Lfa
        Le8:
            android.widget.TextView r6 = com.acse.ottn.a5.f2076f
            int r7 = com.acse.ottn.R.string.sd_warning_message
            java.lang.String r7 = r5.getString(r7)
            r6.setText(r7)
            android.widget.TextView r6 = com.acse.ottn.a5.f2074d
            java.lang.String r7 = "继续开启权限"
            r6.setText(r7)
        Lfa:
            android.widget.TextView r6 = com.acse.ottn.a5.f2075e
            int r7 = com.acse.ottn.R.string.warning_cancle
            java.lang.String r7 = r5.getString(r7)
            r6.setText(r7)
        L105:
            com.acse.ottn.h0 r6 = com.acse.ottn.h0.a()
            android.widget.TextView r7 = com.acse.ottn.a5.f2075e
            r6.b(r5, r7)
            com.acse.ottn.h0 r6 = com.acse.ottn.h0.a()
            android.widget.ImageView r7 = com.acse.ottn.a5.f2073c
            r6.b(r5, r7)
            android.widget.TextView r6 = com.acse.ottn.a5.f2074d
            com.acse.ottn.a5$a r7 = new com.acse.ottn.a5$a
            r7.<init>(r10, r5)
            r6.setOnClickListener(r7)
            android.widget.TextView r6 = com.acse.ottn.a5.f2075e
            com.acse.ottn.a5$b r7 = new com.acse.ottn.a5$b
            r7.<init>(r10, r5)
            r6.setOnClickListener(r7)
            android.widget.ImageView r6 = com.acse.ottn.a5.f2072b
            com.acse.ottn.a5$c r7 = new com.acse.ottn.a5$c
            r7.<init>(r10, r5)
            r6.setOnClickListener(r7)
            androidx.appcompat.app.AlertDialog$Builder r6 = new androidx.appcompat.app.AlertDialog$Builder
            int r7 = com.acse.ottn.R.style.AlertDialogCustom
            r6.<init>(r5, r7)
            r6.setView(r0)
            r7 = 1
            r6.setCancelable(r7)
            androidx.appcompat.app.AlertDialog r6 = r6.create()
            com.acse.ottn.a5.a = r6
            android.view.Window r6 = r6.getWindow()
            r7 = 17170445(0x106000d, float:2.461195E-38)
            r6.setBackgroundDrawableResource(r7)
            androidx.appcompat.app.AlertDialog r6 = com.acse.ottn.a5.a
            b(r5, r6)
            androidx.appcompat.app.AlertDialog r5 = com.acse.ottn.a5.a
            return r5
    }

    public static void b(android.app.Activity r0, android.app.Dialog r1) {
            boolean r0 = r0.isFinishing()     // Catch: java.lang.Exception -> L15
            if (r0 != 0) goto L15
            if (r1 == 0) goto L15
            boolean r0 = r1.isShowing()     // Catch: java.lang.Exception -> L15
            if (r0 != 0) goto L15
            r0 = 0
            r1.setCanceledOnTouchOutside(r0)     // Catch: java.lang.Exception -> L15
            r1.show()     // Catch: java.lang.Exception -> L15
        L15:
            return
    }
}
