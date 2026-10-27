package com.bxkj.student.v2.ui.dialog;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class FaceOutDialog extends com.bxkj.base.v2.base.BaseDialog<com.bxkj.student.databinding.FaceOutOfCompassBinding, com.bxkj.base.v2.base.BaseViewModel> {

    /* renamed from: r, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.ui.dialog.FaceOutDialog.b f1419r = null;

    @org.jetbrains.annotations.NotNull
    private java.lang.CharSequence k;

    /* renamed from: l, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private java.lang.CharSequence f1420l;

    /* renamed from: m, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private java.lang.CharSequence f1421m;

    /* renamed from: n, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private java.lang.CharSequence f1422n;

    /* renamed from: o, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super androidx.fragment.app.DialogFragment, kotlin.n1> f1423o;

    /* renamed from: p, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super androidx.fragment.app.DialogFragment, kotlin.n1> f1424p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f1425q;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFaceOutDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceOutDialog.kt\ncom/bxkj/student/v2/ui/dialog/FaceOutDialog$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
    public static final class a {

        @org.jetbrains.annotations.NotNull
        private final java.lang.String a;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String b;
        private boolean c;

        @org.jetbrains.annotations.NotNull
        private java.lang.CharSequence d;

        @org.jetbrains.annotations.NotNull
        private java.lang.CharSequence e;

        @org.jetbrains.annotations.NotNull
        private java.lang.CharSequence f;

        @org.jetbrains.annotations.NotNull
        private java.lang.CharSequence g;

        @org.jetbrains.annotations.Nullable
        private kotlin.jvm.functions.Function1<? super androidx.fragment.app.DialogFragment, kotlin.n1> h;

        @org.jetbrains.annotations.Nullable
        private kotlin.jvm.functions.Function1<? super androidx.fragment.app.DialogFragment, kotlin.n1> i;

        public a() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "系统检测到您中途第1次人脸识别超出100米允许识别范围，本次跑步无效！请点击下方结束跑步按钮结束本次跑步，请下次弹出中途人脸识别时及时在有效范围内进行识别！"
                r1.a = r0
                java.lang.String r0 = "由于您中途人脸识别超出100米允许识别范围，本次跑步已无效！是否继续进行结束人脸识别？"
                r1.b = r0
                r0 = 1
                r1.c = r0
                java.lang.String r0 = "本次跑步记录无效"
                r1.d = r0
                r1.e = r0
                java.lang.String r0 = "结束跑步"
                r1.f = r0
                java.lang.String r0 = ""
                r1.g = r0
                return
        }

        @org.jetbrains.annotations.NotNull
        public final com.bxkj.student.v2.ui.dialog.FaceOutDialog a() {
                r2 = this;
                com.bxkj.student.v2.ui.dialog.FaceOutDialog r0 = new com.bxkj.student.v2.ui.dialog.FaceOutDialog
                r0.<init>()
                java.lang.CharSequence r1 = r2.d
                r0.T(r1)
                java.lang.CharSequence r1 = r2.e
                r0.Q(r1)
                java.lang.CharSequence r1 = r2.f
                r0.P(r1)
                java.lang.CharSequence r1 = r2.g
                r0.S(r1)
                kotlin.jvm.functions.Function1<? super androidx.fragment.app.DialogFragment, kotlin.n1> r1 = r2.h
                r0.O(r1)
                kotlin.jvm.functions.Function1<? super androidx.fragment.app.DialogFragment, kotlin.n1> r1 = r2.i
                r0.R(r1)
                boolean r1 = r2.c
                r0.N(r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String c() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final com.bxkj.student.v2.ui.dialog.FaceOutDialog.a d(boolean r1) {
                r0 = this;
                r0.c = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final com.bxkj.student.v2.ui.dialog.FaceOutDialog.a e(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
                r1 = this;
                java.lang.String r0 = "text"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.f = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final com.bxkj.student.v2.ui.dialog.FaceOutDialog.a f(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.fragment.app.DialogFragment, kotlin.n1> r1) {
                r0 = this;
                r0.h = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final com.bxkj.student.v2.ui.dialog.FaceOutDialog.a g(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
                r1 = this;
                java.lang.String r0 = "msg"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.e = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final com.bxkj.student.v2.ui.dialog.FaceOutDialog.a h(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
                r1 = this;
                java.lang.String r0 = "text"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.g = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final com.bxkj.student.v2.ui.dialog.FaceOutDialog.a i(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.fragment.app.DialogFragment, kotlin.n1> r1) {
                r0 = this;
                r0.i = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final com.bxkj.student.v2.ui.dialog.FaceOutDialog.a j(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
                r1 = this;
                java.lang.String r0 = "title"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.d = r2
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ b(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ kotlin.n1 a(kotlin.jvm.functions.Function1 r0, androidx.fragment.app.DialogFragment r1) {
                kotlin.n1 r0 = l(r0, r1)
                return r0
        }

        public static /* synthetic */ kotlin.n1 b(kotlin.jvm.functions.Function1 r0, androidx.fragment.app.DialogFragment r1) {
                kotlin.n1 r0 = k(r0, r1)
                return r0
        }

        public static /* synthetic */ kotlin.n1 c(kotlin.jvm.functions.Function1 r0, androidx.fragment.app.DialogFragment r1) {
                kotlin.n1 r0 = g(r0, r1)
                return r0
        }

        public static /* synthetic */ kotlin.n1 d(kotlin.jvm.functions.Function1 r0, androidx.fragment.app.DialogFragment r1) {
                kotlin.n1 r0 = h(r0, r1)
                return r0
        }

        public static /* synthetic */ com.bxkj.student.v2.ui.dialog.FaceOutDialog f(com.bxkj.student.v2.ui.dialog.FaceOutDialog.b r1, java.lang.String r2, int r3, java.lang.CharSequence r4, androidx.fragment.app.FragmentManager r5, kotlin.jvm.functions.Function1 r6, kotlin.jvm.functions.Function1 r7, int r8, java.lang.Object r9) {
                r9 = r8 & 16
                r0 = 0
                if (r9 == 0) goto L6
                r6 = r0
            L6:
                r8 = r8 & 32
                if (r8 == 0) goto Lb
                r7 = r0
            Lb:
                com.bxkj.student.v2.ui.dialog.FaceOutDialog r1 = r1.e(r2, r3, r4, r5, r6, r7)
                return r1
        }

        private static final kotlin.n1 g(kotlin.jvm.functions.Function1 r1, androidx.fragment.app.DialogFragment r2) {
                java.lang.String r0 = "dialog"
                kotlin.jvm.internal.g0.p(r2, r0)
                if (r1 == 0) goto La
                r1.invoke(r2)
            La:
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        private static final kotlin.n1 h(kotlin.jvm.functions.Function1 r1, androidx.fragment.app.DialogFragment r2) {
                java.lang.String r0 = "dialog"
                kotlin.jvm.internal.g0.p(r2, r0)
                if (r1 == 0) goto La
                r1.invoke(r2)
            La:
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        public static /* synthetic */ com.bxkj.student.v2.ui.dialog.FaceOutDialog j(com.bxkj.student.v2.ui.dialog.FaceOutDialog.b r1, java.lang.String r2, int r3, androidx.fragment.app.FragmentManager r4, kotlin.jvm.functions.Function1 r5, kotlin.jvm.functions.Function1 r6, int r7, java.lang.Object r8) {
                r8 = r7 & 8
                r0 = 0
                if (r8 == 0) goto L6
                r5 = r0
            L6:
                r7 = r7 & 16
                if (r7 == 0) goto Lb
                r6 = r0
            Lb:
                com.bxkj.student.v2.ui.dialog.FaceOutDialog r1 = r1.i(r2, r3, r4, r5, r6)
                return r1
        }

        private static final kotlin.n1 k(kotlin.jvm.functions.Function1 r1, androidx.fragment.app.DialogFragment r2) {
                java.lang.String r0 = "dialog"
                kotlin.jvm.internal.g0.p(r2, r0)
                if (r1 == 0) goto La
                r1.invoke(r2)
            La:
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        private static final kotlin.n1 l(kotlin.jvm.functions.Function1 r1, androidx.fragment.app.DialogFragment r2) {
                java.lang.String r0 = "dialog"
                kotlin.jvm.internal.g0.p(r2, r0)
                if (r1 == 0) goto La
                r1.invoke(r2)
            La:
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final com.bxkj.student.v2.ui.dialog.FaceOutDialog e(@org.jetbrains.annotations.NotNull java.lang.String r4, int r5, @org.jetbrains.annotations.NotNull java.lang.CharSequence r6, @org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentManager r7, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.fragment.app.DialogFragment, kotlin.n1> r8, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.fragment.app.DialogFragment, kotlin.n1> r9) {
                r3 = this;
                java.lang.String r0 = "faceOutIndex"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "rightButtonText"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "fragmentManager"
                kotlin.jvm.internal.g0.p(r7, r0)
                com.bxkj.student.v2.ui.dialog.FaceOutDialog$a r0 = new com.bxkj.student.v2.ui.dialog.FaceOutDialog$a
                r0.<init>()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "系统检测到您中途第"
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = "次人脸识别超出"
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = "米允许识别范围，本次跑步无效！请点击下方结束跑步按钮结束本次跑步，请下次弹出中途人脸识别时及时在有效范围内进行识别！"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                com.bxkj.student.v2.ui.dialog.FaceOutDialog$a r4 = r0.g(r4)
                java.lang.String r5 = "结束跑步"
                com.bxkj.student.v2.ui.dialog.FaceOutDialog$a r4 = r4.e(r5)
                com.bxkj.student.v2.ui.dialog.a r5 = new com.bxkj.student.v2.ui.dialog.a
                r5.<init>(r8)
                com.bxkj.student.v2.ui.dialog.FaceOutDialog$a r4 = r4.f(r5)
                com.bxkj.student.v2.ui.dialog.FaceOutDialog$a r4 = r4.h(r6)
                com.bxkj.student.v2.ui.dialog.b r5 = new com.bxkj.student.v2.ui.dialog.b
                r5.<init>(r9)
                com.bxkj.student.v2.ui.dialog.FaceOutDialog$a r4 = r4.i(r5)
                r5 = 0
                com.bxkj.student.v2.ui.dialog.FaceOutDialog$a r4 = r4.d(r5)
                com.bxkj.student.v2.ui.dialog.FaceOutDialog r4 = r4.a()
                r4.h(r7)
                return r4
        }

        @org.jetbrains.annotations.NotNull
        public final com.bxkj.student.v2.ui.dialog.FaceOutDialog i(@org.jetbrains.annotations.NotNull java.lang.String r4, int r5, @org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentManager r6, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.fragment.app.DialogFragment, kotlin.n1> r7, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.fragment.app.DialogFragment, kotlin.n1> r8) {
                r3 = this;
                java.lang.String r0 = "faceOutIndex"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "fragmentManager"
                kotlin.jvm.internal.g0.p(r6, r0)
                com.bxkj.student.v2.ui.dialog.FaceOutDialog$a r0 = new com.bxkj.student.v2.ui.dialog.FaceOutDialog$a
                r0.<init>()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "由于您中途第"
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = "次人脸识别超出"
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = "米允许识别范围，本次跑步已无效！是否继续进行结束人脸识别？"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                com.bxkj.student.v2.ui.dialog.FaceOutDialog$a r4 = r0.g(r4)
                java.lang.String r5 = "直接提交"
                com.bxkj.student.v2.ui.dialog.FaceOutDialog$a r4 = r4.e(r5)
                com.bxkj.student.v2.ui.dialog.c r5 = new com.bxkj.student.v2.ui.dialog.c
                r5.<init>(r7)
                com.bxkj.student.v2.ui.dialog.FaceOutDialog$a r4 = r4.f(r5)
                java.lang.String r5 = "人脸识别"
                com.bxkj.student.v2.ui.dialog.FaceOutDialog$a r4 = r4.h(r5)
                com.bxkj.student.v2.ui.dialog.d r5 = new com.bxkj.student.v2.ui.dialog.d
                r5.<init>(r8)
                com.bxkj.student.v2.ui.dialog.FaceOutDialog$a r4 = r4.i(r5)
                r5 = 0
                com.bxkj.student.v2.ui.dialog.FaceOutDialog$a r4 = r4.d(r5)
                com.bxkj.student.v2.ui.dialog.FaceOutDialog r4 = r4.a()
                r4.h(r6)
                return r4
        }
    }

    static {
            com.bxkj.student.v2.ui.dialog.FaceOutDialog$b r0 = new com.bxkj.student.v2.ui.dialog.FaceOutDialog$b
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.v2.ui.dialog.FaceOutDialog.f1419r = r0
            return
    }

    public FaceOutDialog() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "本次跑步记录无效"
            r1.k = r0
            r1.f1420l = r0
            java.lang.String r0 = "结束跑步"
            r1.f1421m = r0
            java.lang.String r0 = ""
            r1.f1422n = r0
            r0 = 1
            r1.f1425q = r0
            return
    }

    public final void L() {
            r1 = this;
            kotlin.jvm.functions.Function1<? super androidx.fragment.app.DialogFragment, kotlin.n1> r0 = r1.f1423o
            if (r0 == 0) goto L7
            r0.invoke(r1)
        L7:
            return
    }

    public final void M() {
            r1 = this;
            kotlin.jvm.functions.Function1<? super androidx.fragment.app.DialogFragment, kotlin.n1> r0 = r1.f1424p
            if (r0 == 0) goto L7
            r0.invoke(r1)
        L7:
            return
    }

    public final void N(boolean r1) {
            r0 = this;
            r0.f1425q = r1
            return
    }

    public final void O(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.fragment.app.DialogFragment, kotlin.n1> r1) {
            r0 = this;
            r0.f1423o = r1
            return
    }

    public final void P(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
            r1 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f1421m = r2
            return
    }

    public final void Q(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
            r1 = this;
            java.lang.String r0 = "msg"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f1420l = r2
            return
    }

    public final void R(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.fragment.app.DialogFragment, kotlin.n1> r1) {
            r0 = this;
            r0.f1424p = r1
            return
    }

    public final void S(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
            r1 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f1422n = r2
            return
    }

    public final void T(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
            r1 = this;
            java.lang.String r0 = "title"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.k = r2
            return
    }

    @Override // com.bxkj.base.v2.base.BaseDialog
    protected void e() {
            r1 = this;
            boolean r0 = r1.f1425q
            if (r0 == 0) goto L7
            super.e()
        L7:
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r0 = this;
            return
    }

    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            r2 = 2
            r0 = 2132017957(0x7f140325, float:1.9674207E38)
            r1.setStyle(r2, r0)
            return
    }

    public void onStart() {
            r2 = this;
            super.onStart()
            android.app.Dialog r0 = r2.getDialog()
            if (r0 == 0) goto Le
            android.view.Window r0 = r0.getWindow()
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L20
            r1 = -2
            r0.setLayout(r1, r1)
            r1 = 2131100584(0x7f0603a8, float:1.7813554E38)
            r0.setBackgroundDrawableResource(r1)
            r1 = 17
            r0.setGravity(r1)
        L20:
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r2 = this;
            boolean r0 = r2.f1425q
            r2.setCancelable(r0)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.FaceOutOfCompassBinding r0 = (com.bxkj.student.databinding.FaceOutOfCompassBinding) r0
            r0.setDialog(r2)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.FaceOutOfCompassBinding r0 = (com.bxkj.student.databinding.FaceOutOfCompassBinding) r0
            android.widget.TextView r0 = r0.tvTitle
            java.lang.CharSequence r1 = r2.k
            r0.setText(r1)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.FaceOutOfCompassBinding r0 = (com.bxkj.student.databinding.FaceOutOfCompassBinding) r0
            android.widget.TextView r0 = r0.textMessage
            java.lang.CharSequence r1 = r2.f1420l
            r0.setText(r1)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.FaceOutOfCompassBinding r0 = (com.bxkj.student.databinding.FaceOutOfCompassBinding) r0
            android.widget.Button r0 = r0.btnOne
            java.lang.CharSequence r1 = r2.f1421m
            r0.setText(r1)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.FaceOutOfCompassBinding r0 = (com.bxkj.student.databinding.FaceOutOfCompassBinding) r0
            android.widget.Button r0 = r0.btnTwo
            java.lang.CharSequence r1 = r2.f1422n
            r0.setText(r1)
            java.lang.CharSequence r0 = r2.k
            boolean r0 = kotlin.text.u.M3(r0)
            r1 = 8
            if (r0 == 0) goto L57
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.FaceOutOfCompassBinding r0 = (com.bxkj.student.databinding.FaceOutOfCompassBinding) r0
            android.widget.TextView r0 = r0.tvTitle
            r0.setVisibility(r1)
        L57:
            java.lang.CharSequence r0 = r2.f1420l
            boolean r0 = kotlin.text.u.M3(r0)
            if (r0 == 0) goto L6a
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.FaceOutOfCompassBinding r0 = (com.bxkj.student.databinding.FaceOutOfCompassBinding) r0
            android.widget.TextView r0 = r0.textMessage
            r0.setVisibility(r1)
        L6a:
            java.lang.CharSequence r0 = r2.f1421m
            boolean r0 = kotlin.text.u.M3(r0)
            if (r0 == 0) goto L7d
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.FaceOutOfCompassBinding r0 = (com.bxkj.student.databinding.FaceOutOfCompassBinding) r0
            android.widget.Button r0 = r0.btnOne
            r0.setVisibility(r1)
        L7d:
            java.lang.CharSequence r0 = r2.f1422n
            boolean r0 = kotlin.text.u.M3(r0)
            if (r0 == 0) goto L90
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.FaceOutOfCompassBinding r0 = (com.bxkj.student.databinding.FaceOutOfCompassBinding) r0
            android.widget.Button r0 = r0.btnTwo
            r0.setVisibility(r1)
        L90:
            return
    }
}
