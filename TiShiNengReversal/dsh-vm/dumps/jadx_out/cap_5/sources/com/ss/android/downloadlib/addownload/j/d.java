package com.ss.android.downloadlib.addownload.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d extends android.app.Dialog {
    private com.ss.android.downloadlib.addownload.j.c a;
    private com.ss.android.downloadlib.addownload.j.a b;
    private boolean c;
    private boolean d;
    private android.app.Activity e;
    private java.lang.String f;
    private java.lang.String g;
    private java.lang.String h;
    private java.lang.String i;

    class a implements android.view.View.OnClickListener {
        final /* synthetic */ com.ss.android.downloadlib.addownload.j.d a;

        a(com.ss.android.downloadlib.addownload.j.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.ss.android.downloadlib.addownload.j.d r1 = r0.a
                com.ss.android.downloadlib.addownload.j.d.f(r1)
                return
        }
    }

    class b implements android.view.View.OnClickListener {
        final /* synthetic */ com.ss.android.downloadlib.addownload.j.d a;

        b(com.ss.android.downloadlib.addownload.j.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.ss.android.downloadlib.addownload.j.d r1 = r0.a
                com.ss.android.downloadlib.addownload.j.d.h(r1)
                return
        }
    }

    class c implements android.view.View.OnClickListener {
        final /* synthetic */ com.ss.android.downloadlib.addownload.j.d a;

        c(com.ss.android.downloadlib.addownload.j.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.ss.android.downloadlib.addownload.j.d r1 = r0.a
                com.ss.android.downloadlib.addownload.j.d.a(r1)
                return
        }
    }

    /* renamed from: com.ss.android.downloadlib.addownload.j.d$d, reason: collision with other inner class name */
    public static class C0204d {
        private android.app.Activity a;
        private java.lang.String b;
        private java.lang.String c;
        private java.lang.String d;
        private java.lang.String e;
        private boolean f;
        private com.ss.android.downloadlib.addownload.j.c g;
        private com.ss.android.downloadlib.addownload.j.a h;

        public C0204d(android.app.Activity r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public com.ss.android.downloadlib.addownload.j.d.C0204d a(java.lang.String r1) {
                r0 = this;
                r0.d = r1
                return r0
        }

        public com.ss.android.downloadlib.addownload.j.d.C0204d b(com.ss.android.downloadlib.addownload.j.a r1) {
                r0 = this;
                r0.h = r1
                return r0
        }

        public com.ss.android.downloadlib.addownload.j.d.C0204d c(com.ss.android.downloadlib.addownload.j.c r1) {
                r0 = this;
                r0.g = r1
                return r0
        }

        public com.ss.android.downloadlib.addownload.j.d.C0204d d(java.lang.String r1) {
                r0 = this;
                r0.b = r1
                return r0
        }

        public com.ss.android.downloadlib.addownload.j.d.C0204d e(boolean r1) {
                r0 = this;
                r0.f = r1
                return r0
        }

        public com.ss.android.downloadlib.addownload.j.d f() {
                r9 = this;
                com.ss.android.downloadlib.addownload.j.d r0 = new com.ss.android.downloadlib.addownload.j.d
                android.app.Activity r1 = r9.a
                java.lang.String r2 = r9.b
                java.lang.String r3 = r9.c
                java.lang.String r4 = r9.d
                java.lang.String r5 = r9.e
                boolean r6 = r9.f
                com.ss.android.downloadlib.addownload.j.c r7 = r9.g
                com.ss.android.downloadlib.addownload.j.a r8 = r9.h
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r0
        }

        public com.ss.android.downloadlib.addownload.j.d.C0204d g(java.lang.String r1) {
                r0 = this;
                r0.e = r1
                return r0
        }

        public com.ss.android.downloadlib.addownload.j.d.C0204d h(java.lang.String r1) {
                r0 = this;
                r0.c = r1
                return r0
        }
    }

    public d(@androidx.annotation.NonNull android.app.Activity r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6, @androidx.annotation.NonNull com.ss.android.downloadlib.addownload.j.c r7, com.ss.android.downloadlib.addownload.j.a r8) {
            r0 = this;
            r0.<init>(r1)
            r0.e = r1
            r0.a = r7
            r0.f = r2
            r0.g = r3
            r0.h = r4
            r0.i = r5
            r0.b = r8
            android.view.Window r1 = r0.getWindow()
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = 0
            r2.<init>(r3)
            r1.setBackgroundDrawable(r2)
            r0.setCanceledOnTouchOutside(r6)
            android.app.Activity r1 = r0.e
            r0.e(r1)
            return
    }

    static /* synthetic */ void a(com.ss.android.downloadlib.addownload.j.d r0) {
            r0.d()
            return
    }

    private static int b(android.content.Context r0, int r1) {
            float r1 = (float) r1
            int r0 = com.ss.android.downloadlib.a.h.f(r0, r1)
            return r0
    }

    private static android.graphics.drawable.GradientDrawable c(android.content.Context r1, java.lang.String r2, int r3) {
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            int r2 = android.graphics.Color.parseColor(r2)
            r0.setColor(r2)
            int r1 = b(r1, r3)
            float r1 = (float) r1
            r0.setCornerRadius(r1)
            return r0
    }

    private void d() {
            r1 = this;
            r0 = 1
            r1.c = r0
            r1.dismiss()
            return
    }

    private void delete() {
            r1 = this;
            r0 = 1
            r1.d = r0
            r1.dismiss()
            return
    }

    private void e(android.content.Context r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r1)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r5 = 1
            r2.setOrientation(r5)
            r2.setLayoutParams(r3)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r1)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r7 = 290(0x122, float:4.06E-43)
            int r7 = b(r1, r7)
            r8 = -2
            r6.<init>(r7, r8)
            java.lang.String r7 = "#ffffff"
            int r9 = android.graphics.Color.parseColor(r7)
            r3.setBackgroundColor(r9)
            r3.setLayoutParams(r6)
            r6 = 4
            android.graphics.drawable.GradientDrawable r6 = c(r1, r7, r6)
            r3.setBackground(r6)
            r3.setOrientation(r5)
            r5 = 16
            int r6 = b(r1, r5)
            android.widget.TextView r9 = new android.widget.TextView
            r9.<init>(r1)
            r10 = 1098907648(0x41800000, float:16.0)
            r11 = 2
            r9.setTextSize(r11, r10)
            java.lang.String r10 = "是否在WiFi环境下恢复下载？"
            r9.setText(r10)
            java.lang.String r10 = "#222222"
            int r10 = android.graphics.Color.parseColor(r10)
            r9.setTextColor(r10)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r8, r8)
            r10.setMargins(r6, r6, r6, r6)
            r9.setLayoutParams(r10)
            java.lang.String r10 = r0.f
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L75
            java.lang.String r10 = r0.f
            r9.setText(r10)
        L75:
            r3.addView(r9)
            android.widget.LinearLayout r9 = new android.widget.LinearLayout
            r9.<init>(r1)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r4, r8)
            r12 = 26
            int r12 = b(r1, r12)
            r10.topMargin = r12
            r10.bottomMargin = r6
            r6 = 0
            r9.setOrientation(r6)
            r9.setLayoutParams(r10)
            android.widget.TextView r10 = new android.widget.TextView
            r10.<init>(r1)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r13 = 70
            int r14 = b(r1, r13)
            r15 = 33
            int r13 = b(r1, r15)
            r12.<init>(r14, r13)
            r10.setLayoutParams(r12)
            java.lang.String r12 = "管理"
            r10.setText(r12)
            java.lang.String r12 = "#CFCFCF"
            int r13 = android.graphics.Color.parseColor(r12)
            r10.setTextColor(r13)
            r13 = 1095761920(0x41500000, float:13.0)
            r10.setTextSize(r11, r13)
            r14 = 17
            r10.setGravity(r14)
            java.lang.String r14 = r0.i
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto Ldc
            java.lang.String r14 = r0.i
            r10.setText(r14)
            r9.addView(r10)
            com.ss.android.downloadlib.addownload.j.d$a r14 = new com.ss.android.downloadlib.addownload.j.d$a
            r14.<init>(r0)
            r10.setOnClickListener(r14)
        Ldc:
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            r10.<init>(r1)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r14.<init>(r4, r8)
            r10.setOrientation(r6)
            int r4 = b(r1, r5)
            r14.rightMargin = r4
            r4 = 5
            r10.setGravity(r4)
            r10.setLayoutParams(r14)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r1)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r8 = 70
            int r14 = b(r1, r8)
            int r8 = b(r1, r15)
            r6.<init>(r14, r8)
            r5.setLayoutParams(r6)
            int r6 = android.graphics.Color.parseColor(r12)
            r5.setTextColor(r6)
            java.lang.String r6 = "不，谢谢"
            r5.setText(r6)
            r5.setTextSize(r11, r13)
            r6 = 17
            r5.setGravity(r6)
            java.lang.String r6 = r0.h
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L12e
            java.lang.String r6 = r0.h
            r5.setText(r6)
        L12e:
            com.ss.android.downloadlib.addownload.j.d$b r6 = new com.ss.android.downloadlib.addownload.j.d$b
            r6.<init>(r0)
            r5.setOnClickListener(r6)
            r10.addView(r5)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r1)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r8 = 70
            int r8 = b(r1, r8)
            int r12 = b(r1, r15)
            r6.<init>(r8, r12)
            r8 = 8
            int r8 = b(r1, r8)
            r6.leftMargin = r8
            r6.gravity = r4
            r5.setLayoutParams(r6)
            int r4 = android.graphics.Color.parseColor(r7)
            r5.setTextColor(r4)
            r5.setTextSize(r11, r13)
            java.lang.String r4 = "好的"
            r5.setText(r4)
            r6 = 17
            r5.setGravity(r6)
            java.lang.String r4 = r0.g
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L17b
            java.lang.String r4 = r0.g
            r5.setText(r4)
        L17b:
            java.lang.String r4 = "#2A90D7"
            android.graphics.drawable.GradientDrawable r1 = c(r1, r4, r11)
            r5.setBackground(r1)
            com.ss.android.downloadlib.addownload.j.d$c r1 = new com.ss.android.downloadlib.addownload.j.d$c
            r1.<init>(r0)
            r5.setOnClickListener(r1)
            r10.addView(r5)
            r9.addView(r10)
            r3.addView(r9)
            r2.addView(r3)
            r0.setContentView(r2)
            return
    }

    static /* synthetic */ void f(com.ss.android.downloadlib.addownload.j.d r0) {
            r0.delete()
            return
    }

    private void g() {
            r0 = this;
            r0.dismiss()
            return
    }

    static /* synthetic */ void h(com.ss.android.downloadlib.addownload.j.d r0) {
            r0.g()
            return
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
            r1 = this;
            super.dismiss()
            android.app.Activity r0 = r1.e
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L10
            android.app.Activity r0 = r1.e
            r0.finish()
        L10:
            boolean r0 = r1.c
            if (r0 == 0) goto L1a
            com.ss.android.downloadlib.addownload.j.c r0 = r1.a
            r0.j()
            return
        L1a:
            boolean r0 = r1.d
            if (r0 == 0) goto L24
            com.ss.android.downloadlib.addownload.j.a r0 = r1.b
            r0.delete()
            return
        L24:
            com.ss.android.downloadlib.addownload.j.c r0 = r1.a
            r0.xt()
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(@androidx.annotation.NonNull android.view.KeyEvent r3) {
            r2 = this;
            int r0 = r3.getKeyCode()
            r1 = 4
            if (r0 != r1) goto L9
            r3 = 1
            return r3
        L9:
            boolean r3 = super.dispatchKeyEvent(r3)
            return r3
    }
}
