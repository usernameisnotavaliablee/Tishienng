package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class g4 {
    public static androidx.appcompat.app.AlertDialog a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.g4.e a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ android.app.Activity f2343b;

        public a(com.acse.ottn.g4.e r1, android.app.Activity r2) {
                r0 = this;
                r0.a = r1
                r0.f2343b = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                com.acse.ottn.g4$e r2 = r1.a
                r2.onOpen()
                android.app.Activity r2 = r1.f2343b
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.g4.a()
                com.acse.ottn.g4.a(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Activity a;

        public b(android.app.Activity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                android.app.Activity r2 = r1.a
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.g4.a()
                com.acse.ottn.g4.a(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Activity a;

        public c(android.app.Activity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                android.content.Intent r3 = new android.content.Intent
                android.app.Activity r0 = r2.a
                java.lang.Class<com.acse.ottn.activity.SeedWebViewActivity> r1 = com.acse.ottn.activity.SeedWebViewActivity.class
                r3.<init>(r0, r1)
                com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
                android.app.Activity r1 = r2.a
                java.lang.String r0 = r0.c(r1)
                java.lang.String r1 = "url"
                r3.putExtra(r1, r0)
                android.app.Activity r0 = r2.a
                r0.startActivity(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Activity a;

        public d(android.app.Activity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                android.content.Intent r3 = new android.content.Intent
                android.app.Activity r0 = r2.a
                java.lang.Class<com.acse.ottn.activity.SeedWebViewActivity> r1 = com.acse.ottn.activity.SeedWebViewActivity.class
                r3.<init>(r0, r1)
                com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
                android.app.Activity r1 = r2.a
                java.lang.String r0 = r0.e(r1)
                java.lang.String r1 = "url"
                r3.putExtra(r1, r0)
                android.app.Activity r0 = r2.a
                r0.startActivity(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface e {
        void onDismiss();

        void onOpen();
    }

    public g4() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ androidx.appcompat.app.AlertDialog a() {
            androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.g4.a
            return r0
    }

    public static androidx.appcompat.app.AlertDialog a(android.app.Activity r5, com.acse.ottn.g4.e r6) {
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r5)
            int r1 = com.acse.ottn.R.layout.main_dialog
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            androidx.appcompat.app.AlertDialog$Builder r1 = new androidx.appcompat.app.AlertDialog$Builder
            int r2 = com.acse.ottn.R.style.AlertDialogCustom
            r1.<init>(r5, r2)
            r1.setView(r0)
            r2 = 1
            r1.setCancelable(r2)
            int r2 = com.acse.ottn.R.id.tv_but2
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            com.acse.ottn.g4$a r3 = new com.acse.ottn.g4$a
            r3.<init>(r6, r5)
            r2.setOnClickListener(r3)
            int r6 = com.acse.ottn.R.id.tv_button
            android.view.View r6 = r0.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            com.acse.ottn.g4$b r3 = new com.acse.ottn.g4$b
            r3.<init>(r5)
            r6.setOnClickListener(r3)
            int r6 = com.acse.ottn.R.id.title
            android.view.View r6 = r0.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "请先同意"
            r3.append(r4)
            java.lang.String r4 = com.acse.ottn.l0.f2431b
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r6.setText(r3)
            int r6 = com.acse.ottn.R.id.tv_privacy
            android.view.View r6 = r0.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            com.acse.ottn.g4$c r3 = new com.acse.ottn.g4$c
            r3.<init>(r5)
            r6.setOnClickListener(r3)
            int r3 = com.acse.ottn.R.id.tv_service
            android.view.View r0 = r0.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.acse.ottn.g4$d r3 = new com.acse.ottn.g4$d
            r3.<init>(r5)
            r0.setOnClickListener(r3)
            com.acse.ottn.h0 r3 = com.acse.ottn.h0.a()
            r3.d(r5, r0)
            com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
            r0.d(r5, r6)
            com.acse.ottn.h0 r6 = com.acse.ottn.h0.a()
            r6.d(r5, r2)
            androidx.appcompat.app.AlertDialog r6 = r1.create()
            com.acse.ottn.g4.a = r6
            android.view.Window r6 = r6.getWindow()
            r0 = 17170445(0x106000d, float:2.461195E-38)
            r6.setBackgroundDrawableResource(r0)
            androidx.appcompat.app.AlertDialog r6 = com.acse.ottn.g4.a
            b(r5, r6)
            androidx.appcompat.app.AlertDialog r5 = com.acse.ottn.g4.a
            return r5
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
