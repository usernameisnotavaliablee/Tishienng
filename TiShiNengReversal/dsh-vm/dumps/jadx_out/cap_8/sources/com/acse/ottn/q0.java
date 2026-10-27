package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class q0 {
    public static androidx.appcompat.app.AlertDialog a;

    /* renamed from: b, reason: collision with root package name */
    public static android.widget.ImageView f2582b;

    /* renamed from: c, reason: collision with root package name */
    public static android.widget.TextView f2583c;

    /* renamed from: d, reason: collision with root package name */
    public static android.widget.TextView f2584d;

    /* renamed from: e, reason: collision with root package name */
    public static android.widget.TextView f2585e;

    /* renamed from: f, reason: collision with root package name */
    public static android.widget.TextView f2586f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Activity a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2587b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2588c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.activity.AcseHelpManager.OnClickCallBack f2589d;

        public a(android.app.Activity r1, java.lang.String r2, java.lang.String r3, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r4) {
                r0 = this;
                r0.a = r1
                r0.f2587b = r2
                r0.f2588c = r3
                r0.f2589d = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                android.app.Activity r3 = r2.a
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.q0.a()
                com.acse.ottn.q0.a(r3, r0)
                com.acse.ottn.q2 r3 = com.acse.ottn.q2.b()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.f2587b
                r0.append(r1)
                java.lang.String r1 = "_"
                r0.append(r1)
                java.lang.String r1 = r2.f2588c
                r0.append(r1)
                java.lang.String r1 = "_close"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.a(r0)
                com.acse.ottn.activity.AcseHelpManager$OnClickCallBack r3 = r2.f2589d
                if (r3 == 0) goto L34
                r3.onDismiss()
            L34:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Activity a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2590b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2591c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.activity.AcseHelpManager.OnClickCallBack f2592d;

        public b(android.app.Activity r1, java.lang.String r2, java.lang.String r3, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r4) {
                r0 = this;
                r0.a = r1
                r0.f2590b = r2
                r0.f2591c = r3
                r0.f2592d = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                android.app.Activity r3 = r2.a
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.q0.a()
                com.acse.ottn.q0.a(r3, r0)
                com.acse.ottn.q2 r3 = com.acse.ottn.q2.b()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.f2590b
                r0.append(r1)
                java.lang.String r1 = "_"
                r0.append(r1)
                java.lang.String r1 = r2.f2591c
                r0.append(r1)
                java.lang.String r1 = "_open"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.a(r0)
                com.acse.ottn.activity.AcseHelpManager$OnClickCallBack r3 = r2.f2592d
                if (r3 == 0) goto L34
                r3.onOpen()
            L34:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements android.view.View.OnClickListener {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2593b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ android.app.Activity f2594c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.activity.AcseHelpManager.OnClickCallBack f2595d;

        public c(java.lang.String r1, java.lang.String r2, android.app.Activity r3, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r4) {
                r0 = this;
                r0.a = r1
                r0.f2593b = r2
                r0.f2594c = r3
                r0.f2595d = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                com.acse.ottn.q2 r3 = com.acse.ottn.q2.b()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.a
                r0.append(r1)
                java.lang.String r1 = "_"
                r0.append(r1)
                java.lang.String r1 = r2.f2593b
                r0.append(r1)
                java.lang.String r1 = "_dismiss"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.a(r0)
                android.app.Activity r3 = r2.f2594c
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.q0.a()
                com.acse.ottn.q0.a(r3, r0)
                com.acse.ottn.activity.AcseHelpManager$OnClickCallBack r3 = r2.f2595d
                if (r3 == 0) goto L34
                r3.onClose()
            L34:
                return
        }
    }

    public q0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ androidx.appcompat.app.AlertDialog a() {
            androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.q0.a
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

    public static androidx.appcompat.app.AlertDialog b(android.app.Activity r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r8) {
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r3)
            int r1 = com.acse.ottn.R.layout.custon_dialog
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            int r1 = com.acse.ottn.R.id.iv_dismiss
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            com.acse.ottn.q0.f2582b = r1
            int r1 = com.acse.ottn.R.id.tv_button
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.acse.ottn.q0.f2583c = r1
            int r1 = com.acse.ottn.R.id.tv_but2
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.acse.ottn.q0.f2584d = r1
            int r1 = com.acse.ottn.R.id.tv_content
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.acse.ottn.q0.f2585e = r1
            int r1 = com.acse.ottn.R.id.tv_version_info
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.acse.ottn.q0.f2586f = r1
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L48
            android.widget.TextView r1 = com.acse.ottn.q0.f2584d
            r1.setText(r6)
        L48:
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L53
            android.widget.TextView r1 = com.acse.ottn.q0.f2583c
            r1.setText(r7)
        L53:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L5e
            android.widget.TextView r1 = com.acse.ottn.q0.f2585e
            r1.setText(r5)
        L5e:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L69
            android.widget.TextView r5 = com.acse.ottn.q0.f2586f
            r5.setText(r4)
        L69:
            com.acse.ottn.h0 r4 = com.acse.ottn.h0.a()
            android.widget.TextView r5 = com.acse.ottn.q0.f2584d
            r4.b(r3, r5)
            android.widget.TextView r4 = com.acse.ottn.q0.f2583c
            com.acse.ottn.q0$a r5 = new com.acse.ottn.q0$a
            r5.<init>(r3, r6, r7, r8)
            r4.setOnClickListener(r5)
            android.widget.TextView r4 = com.acse.ottn.q0.f2584d
            com.acse.ottn.q0$b r5 = new com.acse.ottn.q0$b
            r5.<init>(r3, r6, r7, r8)
            r4.setOnClickListener(r5)
            android.widget.ImageView r4 = com.acse.ottn.q0.f2582b
            com.acse.ottn.q0$c r5 = new com.acse.ottn.q0$c
            r5.<init>(r6, r7, r3, r8)
            r4.setOnClickListener(r5)
            androidx.appcompat.app.AlertDialog$Builder r4 = new androidx.appcompat.app.AlertDialog$Builder
            int r5 = com.acse.ottn.R.style.AlertDialogCustom
            r4.<init>(r3, r5)
            r4.setView(r0)
            r5 = 1
            r4.setCancelable(r5)
            androidx.appcompat.app.AlertDialog r4 = r4.create()
            com.acse.ottn.q0.a = r4
            android.view.Window r4 = r4.getWindow()
            r5 = 17170445(0x106000d, float:2.461195E-38)
            r4.setBackgroundDrawableResource(r5)
            androidx.appcompat.app.AlertDialog r4 = com.acse.ottn.q0.a
            b(r3, r4)
            androidx.appcompat.app.AlertDialog r3 = com.acse.ottn.q0.a
            return r3
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
