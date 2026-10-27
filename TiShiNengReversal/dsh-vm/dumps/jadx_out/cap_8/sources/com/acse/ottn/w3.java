package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class w3 {
    public static androidx.appcompat.app.AlertDialog a;

    /* renamed from: b, reason: collision with root package name */
    public static android.widget.ImageView f2849b;

    /* renamed from: c, reason: collision with root package name */
    public static android.widget.TextView f2850c;

    /* renamed from: d, reason: collision with root package name */
    public static android.widget.TextView f2851d;

    /* renamed from: e, reason: collision with root package name */
    public static android.widget.ImageView f2852e;

    /* renamed from: f, reason: collision with root package name */
    public static android.widget.ImageView f2853f;

    /* renamed from: g, reason: collision with root package name */
    public static android.widget.RelativeLayout f2854g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.view.View.OnClickListener {
        public final /* synthetic */ boolean a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ android.app.Activity f2855b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.activity.AcseHelpManager.OnClickCallBack f2856c;

        public a(boolean r1, android.app.Activity r2, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r3) {
                r0 = this;
                r0.a = r1
                r0.f2855b = r2
                r0.f2856c = r3
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                boolean r2 = r1.a
                if (r2 == 0) goto L13
                androidx.appcompat.app.AlertDialog r2 = com.acse.ottn.w3.a()     // Catch: java.lang.Exception -> Lb
                r2.dismiss()     // Catch: java.lang.Exception -> Lb
            Lb:
                android.app.Activity r2 = r1.f2855b
                com.acse.ottn.activity.AcseHelpManager$OnClickCallBack r0 = r1.f2856c
                com.acse.ottn.a5.a(r2, r0)
                goto L2a
            L13:
                com.acse.ottn.q2 r2 = com.acse.ottn.q2.b()
                java.lang.String r0 = "not_now"
                r2.a(r0)
                com.acse.ottn.activity.AcseHelpManager$OnClickCallBack r2 = r1.f2856c
                if (r2 == 0) goto L23
                r2.onDismiss()
            L23:
                androidx.appcompat.app.AlertDialog r2 = com.acse.ottn.w3.a()     // Catch: java.lang.Exception -> L2a
                r2.dismiss()     // Catch: java.lang.Exception -> L2a
            L2a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.activity.AcseHelpManager.OnClickCallBack a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ android.app.Activity f2857b;

        public b(com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r1, android.app.Activity r2) {
                r0 = this;
                r0.a = r1
                r0.f2857b = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                com.acse.ottn.q2 r2 = com.acse.ottn.q2.b()
                java.lang.String r0 = "not_now"
                r2.a(r0)
                com.acse.ottn.activity.AcseHelpManager$OnClickCallBack r2 = r1.a
                if (r2 == 0) goto L10
                r2.onClose()
            L10:
                android.app.Activity r2 = r1.f2857b
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.w3.a()
                com.acse.ottn.w3.a(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.activity.AcseHelpManager.OnClickCallBack a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ android.app.Activity f2858b;

        public c(com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r1, android.app.Activity r2) {
                r0 = this;
                r0.a = r1
                r0.f2858b = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                com.acse.ottn.activity.AcseHelpManager$OnClickCallBack r2 = r1.a
                if (r2 == 0) goto L7
                r2.onOpen()
            L7:
                com.acse.ottn.q2 r2 = com.acse.ottn.q2.b()
                java.lang.String r0 = "click_now_start"
                r2.a(r0)
                android.app.Activity r2 = r1.f2858b
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.w3.a()
                com.acse.ottn.w3.a(r2, r0)
                return
        }
    }

    public w3() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ androidx.appcompat.app.AlertDialog a() {
            androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.w3.a
            return r0
    }

    public static androidx.appcompat.app.AlertDialog a(android.app.Activity r7, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r8) {
            r4 = 0
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r7
            r6 = r8
            androidx.appcompat.app.AlertDialog r7 = a(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static androidx.appcompat.app.AlertDialog a(android.app.Activity r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r12) {
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            androidx.appcompat.app.AlertDialog r7 = a(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static androidx.appcompat.app.AlertDialog a(android.app.Activity r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r10) {
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r4)
            int r1 = com.acse.ottn.R.layout.seeding_running_dialog
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            int r1 = com.acse.ottn.R.id.tv_version_info
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 != 0) goto L1d
            r1.setText(r5)
            goto L26
        L1d:
            int r5 = com.acse.ottn.R.string.invite_title
            java.lang.String r5 = r4.getString(r5)
            r1.setText(r5)
        L26:
            int r5 = com.acse.ottn.R.id.iv_dismiss
            android.view.View r5 = r0.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.acse.ottn.w3.f2849b = r5
            int r5 = com.acse.ottn.R.id.tv_but2
            android.view.View r5 = r0.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            com.acse.ottn.w3.f2851d = r5
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L46
            android.widget.TextView r5 = com.acse.ottn.w3.f2851d
            r5.setText(r7)
            goto L51
        L46:
            android.widget.TextView r5 = com.acse.ottn.w3.f2851d
            int r7 = com.acse.ottn.R.string.invite_commit
            java.lang.String r7 = r4.getString(r7)
            r5.setText(r7)
        L51:
            com.acse.ottn.q2 r5 = com.acse.ottn.q2.b()
            java.lang.String r7 = "show_run_dialog"
            r5.a(r7)
            int r5 = com.acse.ottn.R.id.iv_icon
            android.view.View r5 = r0.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.acse.ottn.w3.f2852e = r5
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER
            r5.setScaleType(r7)
            int r5 = com.acse.ottn.R.id.tv_button
            android.view.View r5 = r0.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            com.acse.ottn.w3.f2850c = r5
            int r5 = com.acse.ottn.R.id.iv_icon1
            android.view.View r5 = r0.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.acse.ottn.w3.f2853f = r5
            int r5 = com.acse.ottn.R.id.rl_bg
            android.view.View r5 = r0.findViewById(r5)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            com.acse.ottn.w3.f2854g = r5
            int r5 = com.acse.ottn.R.id.rl_b
            android.view.View r5 = r0.findViewById(r5)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            com.acse.ottn.h0 r7 = com.acse.ottn.h0.a()
            r7.a(r4, r5)
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto La2
            android.widget.TextView r5 = com.acse.ottn.w3.f2850c
            r5.setText(r8)
            goto Lad
        La2:
            android.widget.TextView r5 = com.acse.ottn.w3.f2850c
            int r7 = com.acse.ottn.R.string.invite_cancle
            java.lang.String r7 = r4.getString(r7)
            r5.setText(r7)
        Lad:
            int r5 = com.acse.ottn.R.id.tv_content
            android.view.View r5 = r0.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto Lbf
            r5.setText(r6)
            goto Le7
        Lbf:
            java.lang.String r6 = r4.getPackageName()
            java.lang.String r7 = com.acse.ottn.l0.s
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto Le2
            java.lang.String r6 = r4.getPackageName()
            java.lang.String r7 = com.acse.ottn.l0.t
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto Ld8
            goto Le2
        Ld8:
            int r6 = com.acse.ottn.R.string.invite_message
            java.lang.String r6 = r4.getString(r6)
            r5.setText(r6)
            goto Le7
        Le2:
            java.lang.String r6 = "请先开启必要权限，以便于持续稳定，准确完整地记录您运动期间的数据！"
            r5.setText(r6)
        Le7:
            com.acse.ottn.h0 r6 = com.acse.ottn.h0.a()
            android.widget.TextView r7 = com.acse.ottn.w3.f2850c
            r6.c(r4, r7)
            com.acse.ottn.h0 r6 = com.acse.ottn.h0.a()
            android.widget.TextView r7 = com.acse.ottn.w3.f2851d
            r6.b(r4, r7)
            com.acse.ottn.h0 r6 = com.acse.ottn.h0.a()
            android.widget.ImageView r7 = com.acse.ottn.w3.f2852e
            android.widget.ImageView r8 = com.acse.ottn.w3.f2853f
            r6.a(r4, r7, r8)
            com.acse.ottn.h0 r6 = com.acse.ottn.h0.a()
            r6.a(r4, r1, r5)
            com.acse.ottn.h0 r5 = com.acse.ottn.h0.a()
            android.widget.TextView r6 = com.acse.ottn.w3.f2850c
            r5.a(r4, r2, r6)
            android.widget.TextView r5 = com.acse.ottn.w3.f2850c
            com.acse.ottn.w3$a r6 = new com.acse.ottn.w3$a
            r6.<init>(r9, r4, r10)
            r5.setOnClickListener(r6)
            android.widget.ImageView r5 = com.acse.ottn.w3.f2849b
            com.acse.ottn.w3$b r6 = new com.acse.ottn.w3$b
            r6.<init>(r10, r4)
            r5.setOnClickListener(r6)
            android.widget.TextView r5 = com.acse.ottn.w3.f2851d
            com.acse.ottn.w3$c r6 = new com.acse.ottn.w3$c
            r6.<init>(r10, r4)
            r5.setOnClickListener(r6)
            androidx.appcompat.app.AlertDialog$Builder r5 = new androidx.appcompat.app.AlertDialog$Builder
            int r6 = com.acse.ottn.R.style.AlertDialogCustom
            r5.<init>(r4, r6)
            r5.setView(r0)
            r6 = 1
            r5.setCancelable(r6)
            androidx.appcompat.app.AlertDialog r5 = r5.create()
            com.acse.ottn.w3.a = r5
            android.view.Window r5 = r5.getWindow()
            r6 = 17170445(0x106000d, float:2.461195E-38)
            r5.setBackgroundDrawableResource(r6)
            androidx.appcompat.app.AlertDialog r5 = com.acse.ottn.w3.a
            b(r4, r5)
            androidx.appcompat.app.AlertDialog r4 = com.acse.ottn.w3.a
            return r4
    }

    public static androidx.appcompat.app.AlertDialog a(android.app.Activity r7, boolean r8, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r9) {
            r3 = 0
            r4 = 0
            r1 = 0
            r2 = 0
            r0 = r7
            r5 = r8
            r6 = r9
            androidx.appcompat.app.AlertDialog r7 = a(r0, r1, r2, r3, r4, r5, r6)
            return r7
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
