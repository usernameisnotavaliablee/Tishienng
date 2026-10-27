package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class z0 {
    public static androidx.appcompat.app.AlertDialog a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Activity a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.z0.c f2911b;

        public a(android.app.Activity r1, com.acse.ottn.z0.c r2) {
                r0 = this;
                r0.a = r1
                r0.f2911b = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                android.app.Activity r2 = r1.a
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.z0.a()
                com.acse.ottn.z0.a(r2, r0)
                com.acse.ottn.z0$c r2 = r1.f2911b
                r2.b()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Activity a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.z0.c f2912b;

        public b(android.app.Activity r1, com.acse.ottn.z0.c r2) {
                r0 = this;
                r0.a = r1
                r0.f2912b = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                android.app.Activity r2 = r1.a
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.z0.a()
                com.acse.ottn.z0.a(r2, r0)
                com.acse.ottn.z0$c r2 = r1.f2912b
                r2.a()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c {
        void a();

        void b();
    }

    public z0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ androidx.appcompat.app.AlertDialog a() {
            androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.z0.a
            return r0
    }

    public static androidx.appcompat.app.AlertDialog a(android.app.Activity r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10, com.acse.ottn.z0.c r11) {
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r6)
            int r0 = com.acse.ottn.R.layout.dialog_single_green_button_dialog
            r1 = 0
            android.view.View r10 = r10.inflate(r0, r1)
            int r0 = com.acse.ottn.R.id.tv_content
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = com.acse.ottn.R.id.tv_button2
            android.view.View r1 = r10.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r2 = com.acse.ottn.R.id.tv_version_info
            android.view.View r2 = r10.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            int r3 = com.acse.ottn.R.id.iv_dissmiss
            android.view.View r3 = r10.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            int r4 = com.acse.ottn.R.id.rl_bg
            android.view.View r4 = r10.findViewById(r4)
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            com.acse.ottn.h0 r5 = com.acse.ottn.h0.a()
            r5.a(r6, r4)
            com.acse.ottn.h0 r4 = com.acse.ottn.h0.a()
            r4.a(r6, r0, r2)
            r4 = 1
            if (r7 != 0) goto L50
            r7 = 8
            r0.setVisibility(r7)
            r3.setVisibility(r7)
            r2.setGravity(r4)
            goto L53
        L50:
            r0.setText(r7)
        L53:
            r2.setText(r8)
            r1.setText(r9)
            com.acse.ottn.h0 r7 = com.acse.ottn.h0.a()
            r7.b(r6, r1)
            com.acse.ottn.z0$a r7 = new com.acse.ottn.z0$a
            r7.<init>(r6, r11)
            r1.setOnClickListener(r7)
            com.acse.ottn.z0$b r7 = new com.acse.ottn.z0$b
            r7.<init>(r6, r11)
            r3.setOnClickListener(r7)
            androidx.appcompat.app.AlertDialog$Builder r7 = new androidx.appcompat.app.AlertDialog$Builder
            int r8 = com.acse.ottn.R.style.AlertDialogCustom
            r7.<init>(r6, r8)
            r7.setView(r10)
            r7.setCancelable(r4)
            androidx.appcompat.app.AlertDialog r7 = r7.create()
            com.acse.ottn.z0.a = r7
            android.view.Window r7 = r7.getWindow()
            r8 = 17170445(0x106000d, float:2.461195E-38)
            r7.setBackgroundDrawableResource(r8)
            androidx.appcompat.app.AlertDialog r7 = com.acse.ottn.z0.a
            b(r6, r7)
            androidx.appcompat.app.AlertDialog r6 = com.acse.ottn.z0.a
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

    public static void b(android.app.Activity r1, android.app.Dialog r2) {
            boolean r1 = r1.isFinishing()     // Catch: java.lang.Exception -> L16
            if (r1 != 0) goto L15
            if (r2 == 0) goto L15
            boolean r1 = r2.isShowing()     // Catch: java.lang.Exception -> L16
            if (r1 != 0) goto L15
            r1 = 0
            r2.setCanceledOnTouchOutside(r1)     // Catch: java.lang.Exception -> L16
            r2.show()     // Catch: java.lang.Exception -> L16
        L15:
            return
        L16:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "error ="
            r2.append(r0)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "samop"
            com.acse.ottn.h2.a(r2, r1)
            return
    }
}
