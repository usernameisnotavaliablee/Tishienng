package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class z3 {
    public static androidx.appcompat.app.AlertDialog a;

    /* renamed from: b, reason: collision with root package name */
    public static android.widget.TextView f2913b;

    /* renamed from: c, reason: collision with root package name */
    public static android.widget.TextView f2914c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Activity a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.activity.AcseHelpManager.OnClickCallBack f2915b;

        public a(android.app.Activity r1, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r2) {
                r0 = this;
                r0.a = r1
                r0.f2915b = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                android.app.Activity r2 = r1.a
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.z3.a()
                com.acse.ottn.z3.a(r2, r0)
                android.app.Activity r2 = r1.a
                r0 = 10010(0x271a, float:1.4027E-41)
                com.acse.ottn.activity.AcseHelpManager.startAccessibilityIntroduceActivityForResult(r2, r0)
                com.acse.ottn.activity.AcseHelpManager$OnClickCallBack r2 = r1.f2915b
                r2.onOpen()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.app.Activity a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.activity.AcseHelpManager.OnClickCallBack f2916b;

        public b(android.app.Activity r1, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r2) {
                r0 = this;
                r0.a = r1
                r0.f2916b = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r2 = this;
                android.app.Activity r0 = r2.a
                boolean r0 = r0.isFinishing()
                if (r0 != 0) goto L20
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.z3.a()
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto L20
                android.app.Activity r0 = r2.a
                androidx.appcompat.app.AlertDialog r1 = com.acse.ottn.z3.a()
                com.acse.ottn.z3.a(r0, r1)
                com.acse.ottn.activity.AcseHelpManager$OnClickCallBack r0 = r2.f2916b
                r0.onDismiss()
            L20:
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r5) {
                r4 = this;
                android.widget.TextView r0 = com.acse.ottn.z3.b()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r2 = 1000(0x3e8, double:4.94E-321)
                long r5 = r5 / r2
                r2 = 1
                long r5 = r5 - r2
                r1.append(r5)
                java.lang.String r5 = "秒"
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.setText(r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Activity a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.activity.AcseHelpManager.OnClickCallBack f2917b;

        public c(android.app.Activity r1, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r2) {
                r0 = this;
                r0.a = r1
                r0.f2917b = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                android.app.Activity r2 = r1.a
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.z3.a()
                com.acse.ottn.z3.a(r2, r0)
                android.app.Activity r2 = r1.a
                r0 = 10010(0x271a, float:1.4027E-41)
                com.acse.ottn.activity.AcseHelpManager.startAccessibilityIntroduceActivityForResult(r2, r0)
                com.acse.ottn.activity.AcseHelpManager$OnClickCallBack r2 = r1.f2917b
                r2.onOpen()
                return
        }
    }

    public z3() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ androidx.appcompat.app.AlertDialog a() {
            androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.z3.a
            return r0
    }

    public static androidx.appcompat.app.AlertDialog a(android.app.Activity r6, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r7) {
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r6)
            int r1 = com.acse.ottn.R.layout.save_monery_dialog
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            androidx.appcompat.app.AlertDialog$Builder r1 = new androidx.appcompat.app.AlertDialog$Builder
            int r2 = com.acse.ottn.R.style.AlertDialogCustom
            r1.<init>(r6, r2)
            r1.setView(r0)
            java.lang.String r2 = "<b><big><big><big><font color=#4D230A> 购物省钱神器</font></big></big></big></b><font color=#90713A>  体验机会</font>"
            android.text.Spanned r2 = android.text.Html.fromHtml(r2)
            int r3 = com.acse.ottn.R.id.tv_content
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.acse.ottn.z3.f2913b = r3
            r3.setText(r2)
            int r2 = com.acse.ottn.R.id.tv_content2
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r3 = "自动发现隐藏优惠券,淘宝、京东最高省80%!"
            r2.setText(r3)
            int r2 = com.acse.ottn.R.id.iv_dismiss
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            com.acse.ottn.z3.f2914c = r2
            int r2 = com.acse.ottn.R.id.rl_content
            android.view.View r2 = r0.findViewById(r2)
            com.acse.ottn.z3$a r3 = new com.acse.ottn.z3$a
            r3.<init>(r6, r7)
            r2.setOnClickListener(r3)
            com.acse.ottn.n0 r2 = com.acse.ottn.n0.a()
            com.acse.ottn.z3$b r3 = new com.acse.ottn.z3$b
            r3.<init>(r6, r7)
            r4 = 11000(0x2af8, float:1.5414E-41)
            r5 = 1000(0x3e8, float:1.401E-42)
            r2.b(r4, r5, r3)
            int r2 = com.acse.ottn.R.id.tv_open
            android.view.View r0 = r0.findViewById(r2)
            com.acse.ottn.z3$c r2 = new com.acse.ottn.z3$c
            r2.<init>(r6, r7)
            r0.setOnClickListener(r2)
            androidx.appcompat.app.AlertDialog r7 = r1.create()
            com.acse.ottn.z3.a = r7
            android.view.Window r7 = r7.getWindow()
            r0 = 17170445(0x106000d, float:2.461195E-38)
            r7.setBackgroundDrawableResource(r0)
            androidx.appcompat.app.AlertDialog r7 = com.acse.ottn.z3.a
            b(r6, r7)
            androidx.appcompat.app.AlertDialog r6 = com.acse.ottn.z3.a
            return r6
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

    public static /* synthetic */ android.widget.TextView b() {
            android.widget.TextView r0 = com.acse.ottn.z3.f2914c
            return r0
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
