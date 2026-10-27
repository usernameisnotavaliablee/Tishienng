package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f4 {
    public static androidx.appcompat.app.AlertDialog a = null;

    /* renamed from: b, reason: collision with root package name */
    public static com.acse.ottn.widget.ContinueSlideScrollView f2327b = null;

    /* renamed from: c, reason: collision with root package name */
    public static java.util.TimerTask f2328c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f2329d = "在使用“一键开启必要权限”服务前，请您仔细阅读我们的《用户协议》和《隐私政策》。请您知悉，您同意用户协议和隐私政策将代表您已了解我们提供的功能，以及功能运行所需的必要个人信息。我们在向您提供服务的过程中，除非单独获得您的同意和授权，否则将不会收集您的非必要个人信息。";

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f2330e = "《用户协议》";

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f2331f = "《隐私政策》";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.acse.ottn.widget.ContinueSlideScrollView.a {
        public final /* synthetic */ android.widget.TextView a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.f4.h f2332b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ android.app.Activity f2333c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.acse.ottn.f4$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0076a implements android.view.View.OnClickListener {
            public final /* synthetic */ com.acse.ottn.f4.a a;

            public ViewOnClickListenerC0076a(com.acse.ottn.f4.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r2) {
                    r1 = this;
                    com.acse.ottn.f4$a r2 = r1.a
                    com.acse.ottn.f4$h r2 = r2.f2332b
                    r2.onOpen()
                    com.acse.ottn.f4$a r2 = r1.a
                    android.app.Activity r2 = r2.f2333c
                    androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.f4.b()
                    com.acse.ottn.f4.a(r2, r0)
                    return
            }
        }

        public a(android.widget.TextView r1, com.acse.ottn.f4.h r2, android.app.Activity r3) {
                r0 = this;
                r0.a = r1
                r0.f2332b = r2
                r0.f2333c = r3
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.widget.ContinueSlideScrollView.a
        public void a() {
                r3 = this;
                java.util.TimerTask r0 = com.acse.ottn.f4.a()
                if (r0 == 0) goto L29
                java.util.TimerTask r0 = com.acse.ottn.f4.a()
                r0.cancel()
                android.widget.TextView r0 = r3.a
                java.lang.String r1 = "我已知晓并同意"
                r0.setText(r1)
                android.widget.TextView r0 = r3.a
                com.acse.ottn.f4$a$a r1 = new com.acse.ottn.f4$a$a
                r1.<init>(r3)
                r0.setOnClickListener(r1)
                com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
                android.app.Activity r1 = r3.f2333c
                android.widget.TextView r2 = r3.a
                r0.d(r1, r2)
            L29:
                return
        }

        @Override // com.acse.ottn.widget.ContinueSlideScrollView.a
        public void b() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b extends android.text.style.ClickableSpan {
        public final /* synthetic */ android.app.Activity a;

        public b(android.app.Activity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@androidx.annotation.NonNull android.view.View r3) {
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

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@androidx.annotation.NonNull android.text.TextPaint r3) {
                r2 = this;
                com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
                android.app.Activity r1 = r2.a
                r0.a(r1, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c extends android.text.style.ClickableSpan {
        public final /* synthetic */ android.app.Activity a;

        public c(android.app.Activity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@androidx.annotation.NonNull android.view.View r3) {
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

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@androidx.annotation.NonNull android.text.TextPaint r3) {
                r2 = this;
                com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
                android.app.Activity r1 = r2.a
                r0.a(r1, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d extends android.text.style.ClickableSpan {
        public final /* synthetic */ android.app.Activity a;

        public d(android.app.Activity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@androidx.annotation.NonNull android.view.View r3) {
                r2 = this;
                android.content.Intent r3 = new android.content.Intent
                android.app.Activity r0 = r2.a
                java.lang.Class<com.acse.ottn.activity.SeedWebViewActivity> r1 = com.acse.ottn.activity.SeedWebViewActivity.class
                r3.<init>(r0, r1)
                com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
                android.app.Activity r1 = r2.a
                java.lang.String r0 = r0.d(r1)
                java.lang.String r1 = "url"
                r3.putExtra(r1, r0)
                android.app.Activity r0 = r2.a
                r0.startActivity(r3)
                return
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@androidx.annotation.NonNull android.text.TextPaint r3) {
                r2 = this;
                com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
                android.app.Activity r1 = r2.a
                r0.a(r1, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class e extends android.text.style.ClickableSpan {
        public final /* synthetic */ android.app.Activity a;

        public e(android.app.Activity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@androidx.annotation.NonNull android.view.View r3) {
                r2 = this;
                android.content.Intent r3 = new android.content.Intent
                android.app.Activity r0 = r2.a
                java.lang.Class<com.acse.ottn.activity.SeedWebViewActivity> r1 = com.acse.ottn.activity.SeedWebViewActivity.class
                r3.<init>(r0, r1)
                com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
                android.app.Activity r1 = r2.a
                java.lang.String r0 = r0.b(r1)
                java.lang.String r1 = "url"
                r3.putExtra(r1, r0)
                android.app.Activity r0 = r2.a
                r0.startActivity(r3)
                return
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@androidx.annotation.NonNull android.text.TextPaint r3) {
                r2 = this;
                com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
                android.app.Activity r1 = r2.a
                r0.a(r1, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class f implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.widget.TextView a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.f4.h f2334b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ android.app.Activity f2335c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public class a implements android.view.View.OnClickListener {
            public final /* synthetic */ com.acse.ottn.f4.f a;

            public a(com.acse.ottn.f4.f r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r2) {
                    r1 = this;
                    com.acse.ottn.f4$f r2 = r1.a
                    com.acse.ottn.f4$h r2 = r2.f2334b
                    r2.onOpen()
                    com.acse.ottn.f4$f r2 = r1.a
                    android.app.Activity r2 = r2.f2335c
                    androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.f4.b()
                    com.acse.ottn.f4.a(r2, r0)
                    return
            }
        }

        public f(android.widget.TextView r1, com.acse.ottn.f4.h r2, android.app.Activity r3) {
                r0 = this;
                r0.a = r1
                r0.f2334b = r2
                r0.f2335c = r3
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r3 = this;
                android.widget.TextView r0 = r3.a
                java.lang.String r1 = "我已知晓并同意"
                r0.setText(r1)
                android.widget.TextView r0 = r3.a
                com.acse.ottn.f4$f$a r1 = new com.acse.ottn.f4$f$a
                r1.<init>(r3)
                r0.setOnClickListener(r1)
                com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
                android.app.Activity r1 = r3.f2335c
                android.widget.TextView r2 = r3.a
                r0.d(r1, r2)
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r5) {
                r4 = this;
                android.widget.TextView r0 = r4.a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "请下拉阅读("
                r1.append(r2)
                r2 = 1000(0x3e8, double:4.94E-321)
                long r5 = r5 / r2
                r1.append(r5)
                java.lang.String r5 = "s)"
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.setText(r5)
                android.widget.TextView r5 = r4.a
                r6 = 0
                r5.setOnClickListener(r6)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class g implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Activity a;

        public g(android.app.Activity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                android.app.Activity r2 = r1.a
                androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.f4.b()
                com.acse.ottn.f4.a(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface h {
        void onDismiss();

        void onOpen();
    }

    public f4() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.appcompat.app.AlertDialog a(android.app.Activity r19, com.acse.ottn.f4.h r20) {
            r0 = r19
            r1 = r20
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            int r3 = com.acse.ottn.R.layout.service_dialog
            r4 = 0
            android.view.View r2 = r2.inflate(r3, r4)
            androidx.appcompat.app.AlertDialog$Builder r3 = new androidx.appcompat.app.AlertDialog$Builder
            int r4 = com.acse.ottn.R.style.AlertDialogCustom
            r3.<init>(r0, r4)
            r3.setView(r2)
            r4 = 1
            r3.setCancelable(r4)
            int r5 = com.acse.ottn.R.id.tv_one
            android.view.View r5 = r2.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            int r6 = com.acse.ottn.R.id.tv_two
            android.view.View r6 = r2.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            int r7 = com.acse.ottn.R.id.tv_three
            android.view.View r7 = r2.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            int r8 = com.acse.ottn.R.id.tv_four
            android.view.View r8 = r2.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            int r9 = com.acse.ottn.R.id.tv_five
            android.view.View r9 = r2.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            int r10 = com.acse.ottn.R.id.tv_six
            android.view.View r10 = r2.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            int r11 = com.acse.ottn.R.id.tv_seven
            android.view.View r11 = r2.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            int r12 = com.acse.ottn.R.id.tv_eight
            android.view.View r12 = r2.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            int r13 = com.acse.ottn.R.id.tv_but2
            android.view.View r13 = r2.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            com.acse.ottn.h0 r14 = com.acse.ottn.h0.a()
            r14.d(r0, r13)
            int r14 = com.acse.ottn.R.id.tv_line
            android.view.View r14 = r2.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            int r15 = com.acse.ottn.R.id.tv_line_short
            android.view.View r15 = r2.findViewById(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            com.acse.ottn.h0 r4 = com.acse.ottn.h0.a()
            r4.a(r0, r15)
            com.acse.ottn.h0 r4 = com.acse.ottn.h0.a()
            r4.a(r0, r14)
            int r4 = com.acse.ottn.R.id.info_scroll
            android.view.View r4 = r2.findViewById(r4)
            com.acse.ottn.widget.ContinueSlideScrollView r4 = (com.acse.ottn.widget.ContinueSlideScrollView) r4
            com.acse.ottn.f4.f2327b = r4
            int r4 = com.acse.ottn.R.id.tv_version_info
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            int r14 = com.acse.ottn.R.id.relativeLayout_bg
            android.view.View r14 = r2.findViewById(r14)
            android.widget.RelativeLayout r14 = (android.widget.RelativeLayout) r14
            com.acse.ottn.h0 r15 = com.acse.ottn.h0.a()
            r15.a(r0, r14)
            com.acse.ottn.widget.ContinueSlideScrollView r14 = com.acse.ottn.f4.f2327b
            com.acse.ottn.f4$a r15 = new com.acse.ottn.f4$a
            r15.<init>(r13, r1, r0)
            r14.setScanScrollChangedListener(r15)
            android.text.SpannableStringBuilder r14 = new android.text.SpannableStringBuilder
            java.lang.String r15 = "在使用“一键开启必要权限”服务前，请您仔细阅读我们的《用户协议》和《隐私政策》。请您知悉，您同意用户协议和隐私政策将代表您已了解我们提供的功能，以及功能运行所需的必要个人信息。我们在向您提供服务的过程中，除非单独获得您的同意和授权，否则将不会收集您的非必要个人信息。"
            r14.<init>(r15)
            com.acse.ottn.f4$b r15 = new com.acse.ottn.f4$b
            r15.<init>(r0)
            r16 = r3
            r3 = 26
            r17 = r4
            r4 = 32
            r18 = r2
            r2 = 33
            r14.setSpan(r15, r3, r4, r2)
            com.acse.ottn.f4$c r3 = new com.acse.ottn.f4$c
            r3.<init>(r0)
            r4 = 39
            r14.setSpan(r3, r2, r4, r2)
            android.text.method.MovementMethod r3 = android.text.method.LinkMovementMethod.getInstance()
            r5.setMovementMethod(r3)
            r5.setText(r14)
            android.content.res.Resources r3 = r0.getResources()
            int r4 = com.acse.ottn.R.string.one_pilcrow
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r4 = com.acse.ottn.l0.a
            r5 = 1
            java.lang.Object[] r14 = new java.lang.Object[r5]
            r5 = 0
            r14[r5] = r4
            java.lang.String r3 = java.lang.String.format(r3, r14)
            r6.setText(r3)
            android.content.res.Resources r3 = r0.getResources()
            int r6 = com.acse.ottn.R.string.two_pilcrow
            java.lang.String r3 = r3.getString(r6)
            r7.setText(r3)
            android.content.res.Resources r3 = r0.getResources()
            int r6 = com.acse.ottn.R.string.three_pilcrow
            java.lang.String r3 = r3.getString(r6)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r5] = r4
            java.lang.String r3 = java.lang.String.format(r3, r7)
            r8.setText(r3)
            android.content.res.Resources r3 = r0.getResources()
            int r7 = com.acse.ottn.R.string.four_pilcrow
            java.lang.String r3 = r3.getString(r7)
            r9.setText(r3)
            android.content.res.Resources r3 = r0.getResources()
            int r7 = com.acse.ottn.R.string.five_pilcrow
            java.lang.String r3 = r3.getString(r7)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r5] = r4
            java.lang.String r3 = java.lang.String.format(r3, r7)
            r10.setText(r3)
            android.content.res.Resources r3 = r0.getResources()
            int r7 = com.acse.ottn.R.string.six_pilcrow
            java.lang.String r3 = r3.getString(r7)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r5] = r4
            java.lang.String r3 = java.lang.String.format(r3, r7)
            r11.setText(r3)
            android.content.res.Resources r3 = r0.getResources()
            int r7 = com.acse.ottn.R.string.seven_pilcrow
            java.lang.String r3 = r3.getString(r7)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r5] = r4
            java.lang.String r3 = java.lang.String.format(r3, r6)
            java.lang.String r4 = "《用户协议》"
            int r4 = r3.indexOf(r4)
            int r5 = r4 + 6
            java.lang.String r6 = "《隐私政策》"
            int r6 = r3.indexOf(r6)
            int r7 = r6 + 6
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>(r3)
            com.acse.ottn.f4$d r3 = new com.acse.ottn.f4$d
            r3.<init>(r0)
            r8.setSpan(r3, r4, r5, r2)
            com.acse.ottn.f4$e r3 = new com.acse.ottn.f4$e
            r3.<init>(r0)
            r8.setSpan(r3, r6, r7, r2)
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            r12.setMovementMethod(r2)
            r12.setText(r8)
            com.acse.ottn.n0 r2 = com.acse.ottn.n0.a()
            com.acse.ottn.f4$f r3 = new com.acse.ottn.f4$f
            r3.<init>(r13, r1, r0)
            r1 = 8000(0x1f40, float:1.121E-41)
            r4 = 1000(0x3e8, float:1.401E-42)
            java.util.TimerTask r1 = r2.b(r1, r4, r3)
            com.acse.ottn.f4.f2328c = r1
            int r1 = com.acse.ottn.R.id.tv_button
            r2 = r18
            android.view.View r1 = r2.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.acse.ottn.h0 r2 = com.acse.ottn.h0.a()
            r4 = r17
            r2.a(r0, r4, r1)
            com.acse.ottn.f4$g r2 = new com.acse.ottn.f4$g
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            androidx.appcompat.app.AlertDialog r1 = r16.create()
            com.acse.ottn.f4.a = r1
            android.view.Window r1 = r1.getWindow()
            r2 = 17170445(0x106000d, float:2.461195E-38)
            r1.setBackgroundDrawableResource(r2)
            androidx.appcompat.app.AlertDialog r1 = com.acse.ottn.f4.a
            b(r0, r1)
            androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.f4.a
            return r0
    }

    public static /* synthetic */ java.util.TimerTask a() {
            java.util.TimerTask r0 = com.acse.ottn.f4.f2328c
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
            androidx.appcompat.app.AlertDialog r0 = com.acse.ottn.f4.a
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
