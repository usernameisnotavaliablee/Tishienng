package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static androidx.appcompat.app.AlertDialog f2196b;

    /* renamed from: c, reason: collision with root package name */
    public static android.widget.ImageView f2197c;

    /* renamed from: d, reason: collision with root package name */
    public static android.widget.TextView f2198d;

    /* renamed from: e, reason: collision with root package name */
    public static android.widget.TextView f2199e;

    /* renamed from: f, reason: collision with root package name */
    public static android.widget.TextView f2200f;
    public com.acse.ottn.c.d a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Activity a;

        public a(android.app.Activity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                android.app.Activity r2 = r1.a
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.c.a()
                com.acse.ottn.c.a(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Activity a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.c.d f2201b;

        public b(android.app.Activity r1, com.acse.ottn.c.d r2) {
                r0 = this;
                r0.a = r1
                r0.f2201b = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                android.app.Activity r2 = r1.a
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.c.a()
                com.acse.ottn.c.a(r2, r0)
                com.acse.ottn.c$d r2 = r1.f2201b
                if (r2 == 0) goto L10
                r2.onDismiss()
            L10:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.acse.ottn.c$c, reason: collision with other inner class name */
    public class ViewOnClickListenerC0067c implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Activity a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.c.d f2202b;

        public ViewOnClickListenerC0067c(android.app.Activity r1, com.acse.ottn.c.d r2) {
                r0 = this;
                r0.a = r1
                r0.f2202b = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                android.app.Activity r2 = r1.a
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.c.a()
                com.acse.ottn.c.a(r2, r0)
                com.acse.ottn.c$d r2 = r1.f2202b
                if (r2 == 0) goto L10
                r2.onOpen()
            L10:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d {
        void onDismiss();

        void onOpen();
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ androidx.appcompat.app.AlertDialog a() {
            androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.c.f2196b
            return r0
    }

    public static androidx.appcompat.app.AlertDialog a(android.app.Activity r3, java.lang.String r4, com.acse.ottn.c.d r5) {
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r3)
            int r1 = com.acse.ottn.R.layout.accessiblity_seeding_green_fragment_dialog
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            int r1 = com.acse.ottn.R.id.iv_dissmiss
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            com.acse.ottn.c.f2197c = r1
            int r1 = com.acse.ottn.R.id.tv_button
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.acse.ottn.c.f2199e = r1
            int r1 = com.acse.ottn.R.id.tv_but2
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.acse.ottn.c.f2200f = r1
            int r1 = com.acse.ottn.R.id.tv_version_info
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.acse.ottn.c.f2198d = r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = "😭"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.setText(r4)
            android.widget.ImageView r4 = com.acse.ottn.c.f2197c
            com.acse.ottn.c$a r1 = new com.acse.ottn.c$a
            r1.<init>(r3)
            r4.setOnClickListener(r1)
            android.widget.TextView r4 = com.acse.ottn.c.f2199e
            com.acse.ottn.c$b r1 = new com.acse.ottn.c$b
            r1.<init>(r3, r5)
            r4.setOnClickListener(r1)
            android.widget.TextView r4 = com.acse.ottn.c.f2200f
            com.acse.ottn.c$c r1 = new com.acse.ottn.c$c
            r1.<init>(r3, r5)
            r4.setOnClickListener(r1)
            com.acse.ottn.h0 r4 = com.acse.ottn.h0.a()
            android.widget.TextView r5 = com.acse.ottn.c.f2200f
            r4.b(r3, r5)
            androidx.appcompat.app.AlertDialog$Builder r4 = new androidx.appcompat.app.AlertDialog$Builder
            int r5 = com.acse.ottn.R.style.AlertDialogCustom
            r4.<init>(r3, r5)
            r4.setView(r0)
            r5 = 1
            r4.setCancelable(r5)
            androidx.appcompat.app.AlertDialog r4 = r4.create()
            com.acse.ottn.c.f2196b = r4
            android.view.Window r4 = r4.getWindow()
            r5 = 17170445(0x106000d, float:2.461195E-38)
            r4.setBackgroundDrawableResource(r5)
            androidx.appcompat.app.AlertDialog r4 = com.acse.ottn.c.f2196b
            b(r3, r4)
            androidx.appcompat.app.AlertDialog r3 = com.acse.ottn.c.f2196b
            return r3
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
