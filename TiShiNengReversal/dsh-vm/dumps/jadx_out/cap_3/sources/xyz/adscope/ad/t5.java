package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class t5 extends android.app.Dialog {
    private xyz.adscope.ad.t5.b a;
    private android.widget.RelativeLayout b;
    private androidx.recyclerview.widget.RecyclerView c;
    private android.widget.ImageView d;
    private android.widget.TextView e;
    private android.widget.TextView f;
    private android.widget.RelativeLayout g;
    private android.widget.RelativeLayout h;
    private android.widget.EditText i;
    private android.widget.TextView j;
    private android.widget.TextView k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.text.TextWatcher {
        final /* synthetic */ xyz.adscope.ad.t5 a;

        a(xyz.adscope.ad.t5 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable r1) {
                r0 = this;
                return
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                if (r1 == 0) goto L23
                xyz.adscope.ad.t5 r2 = r0.a
                java.lang.String r3 = r1.toString()
                boolean r3 = r3.isEmpty()
                r3 = r3 ^ 1
                xyz.adscope.ad.t5.a(r2, r3)
                xyz.adscope.ad.t5 r2 = r0.a
                android.widget.TextView r2 = xyz.adscope.ad.t5.a(r2)
                int r1 = r1.length()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r2.setText(r1)
                return
            L23:
                xyz.adscope.ad.t5 r1 = r0.a
                r2 = 0
                xyz.adscope.ad.t5.a(r1, r2)
                xyz.adscope.ad.t5 r1 = r0.a
                android.widget.TextView r1 = xyz.adscope.ad.t5.a(r1)
                java.lang.String r2 = "0"
                r1.setText(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b {
        private final android.content.Context a;
        private xyz.adscope.ad.t5.e b;

        public b(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        static /* synthetic */ android.content.Context a(xyz.adscope.ad.t5.b r0) {
                android.content.Context r0 = r0.a
                return r0
        }

        static /* synthetic */ xyz.adscope.ad.t5.e b(xyz.adscope.ad.t5.b r0) {
                xyz.adscope.ad.t5$e r0 = r0.b
                return r0
        }

        public android.app.Dialog a() {
                r2 = this;
                xyz.adscope.ad.t5 r0 = new xyz.adscope.ad.t5
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public xyz.adscope.ad.t5.b a(xyz.adscope.ad.t5.e r1) {
                r0 = this;
                r0.b = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c extends androidx.recyclerview.widget.RecyclerView.Adapter<xyz.adscope.ad.t5.d> {
        private final android.content.Context a;
        private final java.lang.String[] b;
        private xyz.adscope.ad.t5.f c;

        private c(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                r1.a = r2
                android.content.res.Resources r2 = r2.getResources()
                int r0 = xyz.adscope.amps.R.array.complain_list
                java.lang.String[] r2 = r2.getStringArray(r0)
                r1.b = r2
                return
        }

        /* synthetic */ c(android.content.Context r1, xyz.adscope.ad.t5.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ void a(xyz.adscope.ad.t5.c r0, xyz.adscope.ad.t5.d r1, java.lang.String r2, android.view.View r3) {
                r0.a(r1, r2, r3)
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.t5.c r0, xyz.adscope.ad.t5.f r1) {
                r0.a(r1)
                return
        }

        private /* synthetic */ void a(xyz.adscope.ad.t5.d r2, java.lang.String r3, android.view.View r4) {
                r1 = this;
                xyz.adscope.ad.t5$f r0 = r1.c
                if (r0 == 0) goto Lb
                int r2 = r2.getLayoutPosition()
                r0.a(r4, r2, r3)
            Lb:
                return
        }

        private void a(xyz.adscope.ad.t5.f r1) {
                r0 = this;
                r0.c = r1
                return
        }

        @androidx.annotation.NonNull
        public xyz.adscope.ad.t5.d a(@androidx.annotation.NonNull android.view.ViewGroup r2, int r3) {
                r1 = this;
                android.content.Context r2 = r1.a
                int r3 = xyz.adscope.amps.R.layout.asnp_complain_item_multi_one
                r0 = 0
                android.view.View r2 = android.view.View.inflate(r2, r3, r0)
                xyz.adscope.ad.t5$d r3 = new xyz.adscope.ad.t5$d
                r3.<init>(r2)
                return r3
        }

        public void a(@androidx.annotation.NonNull xyz.adscope.ad.t5.d r5, int r6) {
                r4 = this;
                java.lang.String[] r0 = r4.b
                if (r0 == 0) goto L3f
                int r1 = r0.length
                if (r1 <= 0) goto L3f
                r0 = r0[r6]
                android.widget.TextView r1 = xyz.adscope.ad.t5.d.a(r5)
                r1.setText(r0)
                android.widget.TextView r1 = xyz.adscope.ad.t5.d.a(r5)
                xyz.adscope.ad.b7 r2 = xyz.adscope.ad.b7.a()
                java.lang.String r3 = "#000000"
                java.lang.String r2 = r2.a(r3)
                int r2 = android.graphics.Color.parseColor(r2)
                r1.setTextColor(r2)
                java.lang.String[] r1 = r4.b
                int r1 = r1.length
                int r1 = r1 + (-1)
                if (r6 != r1) goto L35
                android.view.View r6 = xyz.adscope.ad.t5.d.b(r5)
                r1 = 8
                r6.setVisibility(r1)
            L35:
                android.view.View r6 = r5.itemView
                xyz.adscope.ad.c8 r1 = new xyz.adscope.ad.c8
                r1.<init>(r4, r5, r0)
                r6.setOnClickListener(r1)
            L3f:
                return
        }

        public int getItemCount() {
                r1 = this;
                java.lang.String[] r0 = r1.b
                if (r0 == 0) goto L6
                int r0 = r0.length
                return r0
            L6:
                r0 = 0
                return r0
        }

        public /* bridge */ /* synthetic */ void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
                r0 = this;
                xyz.adscope.ad.t5$d r1 = (xyz.adscope.ad.t5.d) r1
                r0.a(r1, r2)
                return
        }

        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
                r0 = this;
                xyz.adscope.ad.t5$d r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class d extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView a;
        private final android.view.View b;

        public d(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                r1.<init>(r2)
                int r0 = xyz.adscope.amps.R.id.complain_item_multi_one_title
                android.view.View r0 = r2.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1.a = r0
                int r0 = xyz.adscope.amps.R.id.complain_reason_item_divider
                android.view.View r2 = r2.findViewById(r0)
                r1.b = r2
                return
        }

        static /* synthetic */ android.widget.TextView a(xyz.adscope.ad.t5.d r0) {
                android.widget.TextView r0 = r0.a
                return r0
        }

        static /* synthetic */ android.view.View b(xyz.adscope.ad.t5.d r0) {
                android.view.View r0 = r0.b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface e extends android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnShowListener {
        void a(java.lang.String r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface f {
        void a(android.view.View r1, int r2, java.lang.String r3);
    }

    private t5(@androidx.annotation.NonNull android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.b()
            r0.c()
            r0.e()
            r0.f()
            return
    }

    private t5(xyz.adscope.ad.t5.b r3) {
            r2 = this;
            android.content.Context r0 = xyz.adscope.ad.t5.b.a(r3)
            int r1 = xyz.adscope.amps.R.style.adscope_complaint_dialog
            r2.<init>(r0, r1)
            r2.a = r3
            return
    }

    /* synthetic */ t5(xyz.adscope.ad.t5.b r1, xyz.adscope.ad.t5.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ android.widget.TextView a(xyz.adscope.ad.t5 r0) {
            android.widget.TextView r0 = r0.j
            return r0
    }

    private void a() {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L9
            r1.dismiss()
        L9:
            return
    }

    private /* synthetic */ void a(android.view.View r1) {
            r0 = this;
            r0.g()
            return
    }

    private /* synthetic */ void a(android.view.View r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.a(r3)
            return
    }

    private void a(android.widget.EditText r3) {
            r2 = this;
            r3.clearFocus()
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            android.os.IBinder r3 = r3.getWindowToken()
            r1 = 0
            r0.hideSoftInputFromWindow(r3, r1)
            return
    }

    private void a(java.lang.String r2) {
            r1 = this;
            xyz.adscope.ad.t5$b r0 = r1.a
            xyz.adscope.ad.t5$e r0 = xyz.adscope.ad.t5.b.b(r0)
            if (r0 == 0) goto L11
            xyz.adscope.ad.t5$b r0 = r1.a
            xyz.adscope.ad.t5$e r0 = xyz.adscope.ad.t5.b.b(r0)
            r0.a(r2)
        L11:
            r1.a()
            return
    }

    public static /* synthetic */ void a(xyz.adscope.ad.t5 r0, android.view.View r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ void a(xyz.adscope.ad.t5 r0, boolean r1) {
            r0.a(r1)
            return
    }

    private void a(boolean r9) {
            r8 = this;
            if (r9 == 0) goto L8
            java.lang.String r0 = "#3380FF"
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L6:
            r4 = r0
            goto Lc
        L8:
            java.lang.String r0 = "#B4B4B4"
            r1 = -1
            goto L6
        Lc:
            android.content.Context r2 = r8.getContext()
            android.widget.TextView r3 = r8.k
            java.lang.String r6 = ""
            r7 = 10
            r5 = 0
            xyz.adscope.ad.q6.a(r2, r3, r4, r5, r6, r7)
            android.widget.TextView r0 = r8.k
            r0.setTextColor(r1)
            android.widget.TextView r0 = r8.k
            r0.setEnabled(r9)
            return
    }

    private void b() {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            int r1 = xyz.adscope.amps.R.layout.asnp_complain_dialog
            r2 = 0
            android.view.View r0 = android.view.View.inflate(r0, r1, r2)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r3 = -2
            r1.<init>(r2, r3)
            r4.addContentView(r0, r1)
            int r1 = xyz.adscope.amps.R.id.complain_dialog_container_rl
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r4.b = r1
            int r1 = xyz.adscope.amps.R.id.complain_reasons_list_recycleview
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r4.c = r1
            int r1 = xyz.adscope.amps.R.id.complain_dialog_close_view
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r4.d = r1
            int r1 = xyz.adscope.amps.R.id.complain_other_suggest_view
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r4.e = r1
            int r1 = xyz.adscope.amps.R.id.complain_other_suggest_title
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r4.f = r1
            int r1 = xyz.adscope.amps.R.id.complain_normal_ui
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r4.g = r1
            int r1 = xyz.adscope.amps.R.id.complain_other_suggest_layout
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r4.h = r1
            int r1 = xyz.adscope.amps.R.id.complain_input_other_edittext
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r4.i = r1
            int r1 = xyz.adscope.amps.R.id.complain_other_suggest_number_textview
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r4.j = r1
            int r1 = xyz.adscope.amps.R.id.complain_other_suggest_submit
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.k = r0
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r1 = 1
            r0.setOrientation(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r4.c
            r1.setLayoutManager(r0)
            r4.d()     // Catch: java.lang.Exception -> L8e
        L8e:
            return
    }

    private /* synthetic */ void b(android.view.View r2) {
            r1 = this;
            android.widget.RelativeLayout r2 = r1.h
            int r2 = r2.getVisibility()
            r0 = 4
            if (r2 != r0) goto Ld
            r1.g()
            return
        Ld:
            r1.a()
            return
    }

    private /* synthetic */ void b(android.widget.EditText r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r1 = 2
            r0.showSoftInput(r3, r1)
            r3 = 1
            r0.toggleSoftInput(r1, r3)
            return
    }

    public static /* synthetic */ void b(xyz.adscope.ad.t5 r0, android.view.View r1, int r2, java.lang.String r3) {
            r0.a(r1, r2, r3)
            return
    }

    private void c() {
            r3 = this;
            xyz.adscope.ad.t5$c r0 = new xyz.adscope.ad.t5$c
            android.content.Context r1 = r3.getContext()
            r2 = 0
            r0.<init>(r1, r2)
            xyz.adscope.ad.b8 r1 = new xyz.adscope.ad.b8
            r1.<init>(r3)
            xyz.adscope.ad.t5.c.a(r0, r1)
            androidx.recyclerview.widget.RecyclerView r1 = r3.c
            r1.setAdapter(r0)
            return
    }

    private /* synthetic */ void c(android.view.View r1) {
            r0 = this;
            android.widget.EditText r1 = r0.i
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r0.a(r1)
            return
    }

    private void c(android.widget.EditText r5) {
            r4 = this;
            r5.requestFocus()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            xyz.adscope.ad.x7 r1 = new xyz.adscope.ad.x7
            r1.<init>(r4, r5)
            r2 = 100
            r0.postDelayed(r1, r2)
            return
    }

    public static /* synthetic */ void c(xyz.adscope.ad.t5 r0, android.view.View r1) {
            r0.c(r1)
            return
    }

    private void d() {
            r14 = this;
            java.lang.String r0 = "#000000"
            xyz.adscope.ad.b7 r1 = xyz.adscope.ad.b7.a()     // Catch: java.lang.Exception -> L1c
            boolean r1 = r1.b()     // Catch: java.lang.Exception -> L1c
            if (r1 == 0) goto L1f
            android.widget.RelativeLayout r1 = r14.b     // Catch: java.lang.Exception -> L1c
            android.content.Context r2 = r14.getContext()     // Catch: java.lang.Exception -> L1c
            int r3 = xyz.adscope.amps.R.drawable.asnp_complaint_dialog_shape_black     // Catch: java.lang.Exception -> L1c
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r2, r3)     // Catch: java.lang.Exception -> L1c
            r1.setBackground(r2)     // Catch: java.lang.Exception -> L1c
            goto L2e
        L1c:
            r0 = move-exception
            goto La6
        L1f:
            android.widget.RelativeLayout r1 = r14.b     // Catch: java.lang.Exception -> L1c
            android.content.Context r2 = r14.getContext()     // Catch: java.lang.Exception -> L1c
            int r3 = xyz.adscope.amps.R.drawable.asnp_complaint_dialog_shape     // Catch: java.lang.Exception -> L1c
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r2, r3)     // Catch: java.lang.Exception -> L1c
            r1.setBackground(r2)     // Catch: java.lang.Exception -> L1c
        L2e:
            android.widget.TextView r1 = r14.e     // Catch: java.lang.Exception -> L1c
            xyz.adscope.ad.b7 r2 = xyz.adscope.ad.b7.a()     // Catch: java.lang.Exception -> L1c
            java.lang.String r3 = "#666666"
            java.lang.String r2 = r2.a(r3)     // Catch: java.lang.Exception -> L1c
            int r2 = android.graphics.Color.parseColor(r2)     // Catch: java.lang.Exception -> L1c
            r1.setHintTextColor(r2)     // Catch: java.lang.Exception -> L1c
            android.widget.EditText r1 = r14.i     // Catch: java.lang.Exception -> L1c
            xyz.adscope.ad.b7 r2 = xyz.adscope.ad.b7.a()     // Catch: java.lang.Exception -> L1c
            java.lang.String r3 = "#0A0A0A"
            java.lang.String r2 = r2.a(r3)     // Catch: java.lang.Exception -> L1c
            int r2 = android.graphics.Color.parseColor(r2)     // Catch: java.lang.Exception -> L1c
            r1.setHintTextColor(r2)     // Catch: java.lang.Exception -> L1c
            android.widget.EditText r1 = r14.i     // Catch: java.lang.Exception -> L1c
            xyz.adscope.ad.b7 r2 = xyz.adscope.ad.b7.a()     // Catch: java.lang.Exception -> L1c
            java.lang.String r2 = r2.a(r0)     // Catch: java.lang.Exception -> L1c
            int r2 = android.graphics.Color.parseColor(r2)     // Catch: java.lang.Exception -> L1c
            r1.setTextColor(r2)     // Catch: java.lang.Exception -> L1c
            android.widget.TextView r1 = r14.f     // Catch: java.lang.Exception -> L1c
            xyz.adscope.ad.b7 r2 = xyz.adscope.ad.b7.a()     // Catch: java.lang.Exception -> L1c
            java.lang.String r0 = r2.a(r0)     // Catch: java.lang.Exception -> L1c
            int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Exception -> L1c
            r1.setTextColor(r0)     // Catch: java.lang.Exception -> L1c
            android.content.Context r2 = r14.getContext()     // Catch: java.lang.Exception -> L1c
            android.widget.TextView r3 = r14.k     // Catch: java.lang.Exception -> L1c
            xyz.adscope.ad.b7 r0 = xyz.adscope.ad.b7.a()     // Catch: java.lang.Exception -> L1c
            java.lang.String r1 = "#B4B4B4"
            java.lang.String r4 = r0.a(r1)     // Catch: java.lang.Exception -> L1c
            java.lang.String r6 = ""
            r7 = 10
            r5 = 0
            xyz.adscope.ad.q6.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L1c
            android.content.Context r8 = r14.getContext()     // Catch: java.lang.Exception -> L1c
            android.widget.EditText r9 = r14.i     // Catch: java.lang.Exception -> L1c
            xyz.adscope.ad.b7 r0 = xyz.adscope.ad.b7.a()     // Catch: java.lang.Exception -> L1c
            java.lang.String r1 = "#F3F3F3"
            java.lang.String r10 = r0.a(r1)     // Catch: java.lang.Exception -> L1c
            java.lang.String r12 = ""
            r13 = 3
            r11 = 0
            xyz.adscope.ad.q6.a(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L1c
            return
        La6:
            xyz.adscope.common.v2.log.SDKLog.stack(r0)
            return
    }

    public static /* synthetic */ void d(xyz.adscope.ad.t5 r0, android.widget.EditText r1) {
            r0.b(r1)
            return
    }

    private void e() {
            r2 = this;
            android.widget.TextView r0 = r2.e
            xyz.adscope.ad.y7 r1 = new xyz.adscope.ad.y7
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.EditText r0 = r2.i
            xyz.adscope.ad.t5$a r1 = new xyz.adscope.ad.t5$a
            r1.<init>(r2)
            r0.addTextChangedListener(r1)
            return
    }

    public static /* synthetic */ void e(xyz.adscope.ad.t5 r0, android.view.View r1) {
            r0.b(r1)
            return
    }

    private void f() {
            r2 = this;
            android.widget.ImageView r0 = r2.d
            xyz.adscope.ad.z7 r1 = new xyz.adscope.ad.z7
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r2.k
            xyz.adscope.ad.a8 r1 = new xyz.adscope.ad.a8
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    private void g() {
            r3 = this;
            android.widget.RelativeLayout r0 = r3.g
            int r0 = r0.getVisibility()
            r1 = 0
            r2 = 8
            if (r0 != 0) goto L1b
            android.widget.RelativeLayout r0 = r3.g
            r0.setVisibility(r2)
            android.widget.RelativeLayout r0 = r3.h
            r0.setVisibility(r1)
            android.widget.EditText r0 = r3.i
            r3.c(r0)
            return
        L1b:
            android.widget.RelativeLayout r0 = r3.g
            r0.setVisibility(r1)
            android.widget.RelativeLayout r0 = r3.h
            r0.setVisibility(r2)
            android.widget.EditText r0 = r3.i
            r3.a(r0)
            return
    }
}
