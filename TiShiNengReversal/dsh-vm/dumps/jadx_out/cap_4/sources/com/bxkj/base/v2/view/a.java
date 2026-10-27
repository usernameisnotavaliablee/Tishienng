package com.bxkj.base.v2.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a extends android.app.Dialog {

    @org.jetbrains.annotations.NotNull
    private final android.widget.LinearLayout a;

    @org.jetbrains.annotations.NotNull
    private final android.widget.TextView b;

    @org.jetbrains.annotations.NotNull
    private final android.widget.Button c;

    @org.jetbrains.annotations.Nullable
    private android.view.View.OnClickListener d;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.base.v2.view.a.b e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bxkj.base.v2.view.a$a, reason: collision with other inner class name */
    public static final class ViewOnClickListenerC0060a implements android.view.View.OnClickListener {
        final /* synthetic */ com.bxkj.base.v2.view.a a;

        ViewOnClickListenerC0060a(com.bxkj.base.v2.view.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                com.bxkj.base.v2.view.a r0 = r1.a
                r0.dismiss()
                com.bxkj.base.v2.view.a r0 = r1.a
                android.view.View$OnClickListener r0 = com.bxkj.base.v2.view.a.b(r0)
                if (r0 == 0) goto L19
                com.bxkj.base.v2.view.a r0 = r1.a
                android.view.View$OnClickListener r0 = com.bxkj.base.v2.view.a.b(r0)
                kotlin.jvm.internal.g0.m(r0)
                r0.onClick(r2)
            L19:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void onMenuClick(@org.jetbrains.annotations.Nullable java.lang.String r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c implements android.view.View.OnClickListener {
        final /* synthetic */ com.bxkj.base.v2.view.a a;
        final /* synthetic */ java.lang.String b;

        c(com.bxkj.base.v2.view.a r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                com.bxkj.base.v2.view.a r2 = r1.a
                r2.dismiss()
                com.bxkj.base.v2.view.a r2 = r1.a
                com.bxkj.base.v2.view.a$b r2 = com.bxkj.base.v2.view.a.a(r2)
                if (r2 == 0) goto L12
                java.lang.String r0 = r1.b
                r2.onMenuClick(r0)
            L12:
                return
        }
    }

    public a(@org.jetbrains.annotations.NotNull android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = cn.bluemobi.dylan.base.R.style.ios_dialog_theme
            r1.<init>(r2, r0)
            r2 = 1
            r1.requestWindowFeature(r2)
            int r2 = com.bxkj.base.R.layout.dialog_select_item
            r1.setContentView(r2)
            android.view.Window r2 = r1.getWindow()
            kotlin.jvm.internal.g0.m(r2)
            r0 = 17
            r2.setGravity(r0)
            int r2 = com.bxkj.base.R.id.ll_content
            android.view.View r2 = r1.findViewById(r2)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.LinearLayout"
            kotlin.jvm.internal.g0.n(r2, r0)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.a = r2
            int r2 = com.bxkj.base.R.id.tv_title
            android.view.View r2 = r1.findViewById(r2)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            kotlin.jvm.internal.g0.n(r2, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.b = r2
            int r2 = com.bxkj.base.R.id.btn_one
            android.view.View r2 = r1.findViewById(r2)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.Button"
            kotlin.jvm.internal.g0.n(r2, r0)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.c = r2
            com.bxkj.base.v2.view.a$a r0 = new com.bxkj.base.v2.view.a$a
            r0.<init>(r1)
            r2.setOnClickListener(r0)
            return
    }

    public static final /* synthetic */ com.bxkj.base.v2.view.a.b a(com.bxkj.base.v2.view.a r0) {
            com.bxkj.base.v2.view.a$b r0 = r0.e
            return r0
    }

    public static final /* synthetic */ android.view.View.OnClickListener b(com.bxkj.base.v2.view.a r0) {
            android.view.View$OnClickListener r0 = r0.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.bxkj.base.v2.view.a c(@org.jetbrains.annotations.Nullable java.lang.String r4) {
            r3 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r0.setText(r4)
            java.lang.String r1 = "#2C7AD7"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            r1 = 2
            r2 = 1099956224(0x41900000, float:18.0)
            r0.setTextSize(r1, r2)
            r1 = 17
            r0.setGravity(r1)
            com.bxkj.base.v2.view.a$c r1 = new com.bxkj.base.v2.view.a$c
            r1.<init>(r3, r4)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r1 = 1109393408(0x42200000, float:40.0)
            android.content.Context r2 = r3.getContext()
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r1, r2)
            r2 = -1
            r4.<init>(r2, r1)
            r0.setLayoutParams(r4)
            android.widget.LinearLayout r1 = r3.a
            r1.addView(r0, r4)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final com.bxkj.base.v2.view.a d(@org.jetbrains.annotations.Nullable java.util.List<java.lang.String> r2) {
            r1 = this;
            if (r2 == 0) goto L16
            java.util.Iterator r2 = r2.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            r1.c(r0)
            goto L6
        L16:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.bxkj.base.v2.view.a e(@org.jetbrains.annotations.Nullable android.view.View.OnClickListener r1) {
            r0 = this;
            r0.d = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.bxkj.base.v2.view.a f(int r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.widget.LinearLayout r1 = r2.a
            r0.inflate(r3, r1)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final com.bxkj.base.v2.view.a g(@org.jetbrains.annotations.Nullable com.bxkj.base.v2.view.a.b r1) {
            r0 = this;
            r0.e = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.bxkj.base.v2.view.a h(@org.jetbrains.annotations.Nullable java.lang.CharSequence r2) {
            r1 = this;
            android.widget.Button r0 = r1.c
            r0.setText(r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.bxkj.base.v2.view.a i(@org.jetbrains.annotations.Nullable java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.b
            r0.setText(r2)
            return r1
    }
}
