package com.bxkj.student.v2.ui.sports.v3.dxyy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDxyyTypeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DxyyTypeDialog.kt\ncom/bxkj/student/v2/ui/sports/v3/dxyy/DxyyTypeDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,297:1\n1#2:298\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class n {

    @org.jetbrains.annotations.NotNull
    private final androidx.fragment.app.FragmentActivity a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements t.b.a {
        final /* synthetic */ cn.bluemobi.dylan.base.view.iOSOneButtonDialog a;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> b;

        a(cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1, kotlin.jvm.functions.Function0<kotlin.n1> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // t.b.a
        public void a(int r3, android.content.Intent r4) {
                r2 = this;
                r3 = 0
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.String r1 = "定向越野AR识别返回"
                com.orhanobut.logger.j.d(r1, r0)
                if (r4 == 0) goto L11
                java.lang.String r0 = "result"
                java.lang.String r4 = r4.getStringExtra(r0)
                goto L12
            L11:
                r4 = 0
            L12:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "result:"
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.Object[] r3 = new java.lang.Object[r3]
                com.orhanobut.logger.j.d(r4, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r2.a
                r3.dismiss()
                kotlin.jvm.functions.Function0<kotlin.n1> r3 = r2.b
                r3.invoke()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDxyyTypeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DxyyTypeDialog.kt\ncom/bxkj/student/v2/ui/sports/v3/dxyy/DxyyTypeDialog$camera$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,297:1\n1#2:298\n*E\n"})
    public static final class b implements s.b.a {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.dxyy.n a;
        final /* synthetic */ cn.bluemobi.dylan.base.view.iOSOneButtonDialog b;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDxyyTypeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DxyyTypeDialog.kt\ncom/bxkj/student/v2/ui/sports/v3/dxyy/DxyyTypeDialog$camera$2$1$camera$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,297:1\n1#2:298\n*E\n"})
        public static final class a implements t.b.a {
            final /* synthetic */ cn.bluemobi.dylan.base.view.iOSOneButtonDialog a;
            final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> b;

            a(cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1, kotlin.jvm.functions.Function0<kotlin.n1> r2) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.<init>()
                    return
            }

            @Override // t.b.a
            public void a(int r3, android.content.Intent r4) {
                    r2 = this;
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    int r4 = r3.intValue()
                    r0 = -1
                    if (r4 != r0) goto Lc
                    goto Ld
                Lc:
                    r3 = 0
                Ld:
                    if (r3 == 0) goto L21
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r2.a
                    kotlin.jvm.functions.Function0<kotlin.n1> r4 = r2.b
                    r0 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    java.lang.String r1 = "定向越野拍照返回"
                    com.orhanobut.logger.j.d(r1, r0)
                    r3.dismiss()
                    r4.invoke()
                L21:
                    return
            }
        }

        b(com.bxkj.student.v2.ui.sports.v3.dxyy.n r1, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2, kotlin.jvm.functions.Function0<kotlin.n1> r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // s.b.a
        public void a() {
                r0 = this;
                r0.d()
                return
        }

        @Override // s.b.a
        public void b(java.lang.String[] r2) {
                r1 = this;
                java.lang.String r0 = "permission"
                kotlin.jvm.internal.g0.p(r2, r0)
                com.bxkj.student.v2.ui.sports.v3.dxyy.n r2 = r1.a
                androidx.fragment.app.FragmentActivity r2 = r2.A()
                java.lang.String r0 = "你拒接了拍照无法完成AR识别"
                com.bxkj.base.v2.common.ext.ContextExtKt.m(r2, r0)
                return
        }

        @Override // s.b.a
        public void c(java.lang.String[] r2) {
                r1 = this;
                java.lang.String r0 = "permission"
                kotlin.jvm.internal.g0.p(r2, r0)
                com.bxkj.student.v2.ui.sports.v3.dxyy.n r2 = r1.a
                androidx.fragment.app.FragmentActivity r2 = r2.A()
                java.lang.String r0 = "你拒接了拍照无法完成AR识别"
                com.bxkj.base.v2.common.ext.ContextExtKt.m(r2, r0)
                return
        }

        public final void d() {
                r5 = this;
                boolean r0 = r5.e()
                if (r0 == 0) goto Lce
                java.lang.String r0 = "mounted"
                java.lang.String r1 = android.os.Environment.getExternalStorageState()
                boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
                if (r0 == 0) goto L28
                com.bxkj.student.v2.ui.sports.v3.dxyy.n r0 = r5.a
                androidx.fragment.app.FragmentActivity r0 = r0.A()
                java.io.File r0 = r0.getExternalCacheDir()
                if (r0 == 0) goto L29
                boolean r1 = r0.exists()
                if (r1 != 0) goto L29
                r0.mkdirs()
                goto L29
            L28:
                r0 = 0
            L29:
                if (r0 == 0) goto L31
                boolean r1 = r0.exists()
                if (r1 != 0) goto L44
            L31:
                com.bxkj.student.v2.ui.sports.v3.dxyy.n r0 = r5.a
                androidx.fragment.app.FragmentActivity r0 = r0.A()
                java.io.File r0 = r0.getCacheDir()
                boolean r1 = r0.exists()
                if (r1 != 0) goto L44
                r0.mkdirs()
            L44:
                java.io.File r1 = new java.io.File
                java.lang.String r2 = "avatar"
                r1.<init>(r0, r2)
                boolean r0 = r1.exists()
                if (r0 != 0) goto L54
                r1.mkdirs()
            L54:
                java.io.File r0 = new java.io.File
                long r2 = java.lang.System.currentTimeMillis()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                java.lang.String r2 = "_temp_photo.jpg"
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r0.<init>(r1, r2)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 24
                if (r1 >= r2) goto L7c
                android.net.Uri r0 = android.net.Uri.fromFile(r0)
                kotlin.jvm.internal.g0.m(r0)
                goto L8b
            L7c:
                com.bxkj.student.v2.ui.sports.v3.dxyy.n r1 = r5.a
                androidx.fragment.app.FragmentActivity r1 = r1.A()
                java.lang.String r2 = "com.bxkj.student.provider"
                android.net.Uri r0 = androidx.core.content.FileProvider.getUriForFile(r1, r2, r0)
                kotlin.jvm.internal.g0.m(r0)
            L8b:
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                java.lang.String r2 = "output"
                r1.putExtra(r2, r0)
                java.lang.String r0 = "android.media.action.IMAGE_CAPTURE"
                r1.setAction(r0)
                r0 = 1
                r1.addFlags(r0)
                java.lang.String r0 = "android.intent.category.DEFAULT"
                r1.addCategory(r0)
                com.bxkj.student.v2.common.utils.a r0 = com.bxkj.student.v2.common.utils.a.a
                android.app.Activity r0 = r0.a()
                if (r0 != 0) goto Lb1
                com.bxkj.student.v2.ui.sports.v3.dxyy.n r0 = r5.a
                androidx.fragment.app.FragmentActivity r0 = r0.A()
            Lb1:
                java.lang.String r2 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
                kotlin.jvm.internal.g0.n(r0, r2)
                androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r5.b
                kotlin.jvm.functions.Function0<kotlin.n1> r3 = r5.c
                t.b r4 = new t.b
                r4.<init>(r0)
                t.b r0 = r4.startActivityForResult(r1)
                com.bxkj.student.v2.ui.sports.v3.dxyy.n$b$a r1 = new com.bxkj.student.v2.ui.sports.v3.dxyy.n$b$a
                r1.<init>(r2, r3)
                r0.c(r1)
                return
            Lce:
                com.bxkj.student.v2.ui.sports.v3.dxyy.n r0 = r5.a
                androidx.fragment.app.FragmentActivity r0 = r0.A()
                java.lang.String r1 = "未找到存储卡，无法拍照！"
                com.bxkj.base.v2.common.ext.ContextExtKt.q(r0, r1)
                return
        }

        public final boolean e() {
                r2 = this;
                java.lang.String r0 = android.os.Environment.getExternalStorageState()
                java.lang.String r1 = "mounted"
                boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.dxyy.DxyyTypeDialog$questionDialog$2$1", f = "DxyyTypeDialog.kt", i = {1, 1, 1, 1}, l = {77, 81}, m = "invokeSuspend", n = {"exerciseQuestion", "question", "answers", "isRight"}, s = {"L$0", "L$1", "L$2", "I$0"})
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        int d;
        int e;
        final /* synthetic */ cn.bluemobi.dylan.base.view.iOSOneButtonDialog f;
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.dxyy.n g;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> h;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.dxyy.DxyyTypeDialog$questionDialog$2$1$1", f = "DxyyTypeDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDxyyTypeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DxyyTypeDialog.kt\ncom/bxkj/student/v2/ui/sports/v3/dxyy/DxyyTypeDialog$questionDialog$2$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,297:1\n1869#2,2:298\n*S KotlinDebug\n*F\n+ 1 DxyyTypeDialog.kt\ncom/bxkj/student/v2/ui/sports/v3/dxyy/DxyyTypeDialog$questionDialog$2$1$1\n*L\n93#1:298,2\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ cn.bluemobi.dylan.base.view.iOSOneButtonDialog b;
            final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.dxyy.n c;
            final /* synthetic */ java.lang.String d;
            final /* synthetic */ java.util.List<java.util.Map<java.lang.String, java.lang.Object>> e;
            final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> f;

            a(cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1, com.bxkj.student.v2.ui.sports.v3.dxyy.n r2, java.lang.String r3, java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r4, kotlin.jvm.functions.Function0<kotlin.n1> r5, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.dxyy.n.c.a> r6) {
                    r0 = this;
                    r0.b = r1
                    r0.c = r2
                    r0.d = r3
                    r0.e = r4
                    r0.f = r5
                    r1 = 2
                    r0.<init>(r1, r6)
                    return
            }

            public static /* synthetic */ void f(cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0, com.bxkj.student.v2.ui.sports.v3.dxyy.n r1, java.util.List r2, kotlin.jvm.functions.Function0 r3, android.view.View r4) {
                    i(r0, r1, r2, r3, r4)
                    return
            }

            private static final void i(cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3, com.bxkj.student.v2.ui.sports.v3.dxyy.n r4, java.util.List r5, kotlin.jvm.functions.Function0 r6, android.view.View r7) {
                    r7 = 2131298362(0x7f09083a, float:1.8214695E38)
                    android.view.View r7 = r3.findViewById(r7)
                    android.widget.RadioGroup r7 = (android.widget.RadioGroup) r7
                    if (r7 == 0) goto L64
                    int r0 = r7.getCheckedRadioButtonId()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "checkedRadioButtonId:"
                    r1.append(r2)
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    r1 = 0
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    com.orhanobut.logger.j.d(r0, r1)
                    int r0 = r7.getCheckedRadioButtonId()
                    r1 = -1
                    if (r0 != r1) goto L37
                    androidx.fragment.app.FragmentActivity r3 = r4.A()
                    java.lang.String r4 = "请答题"
                    com.bxkj.base.v2.common.ext.ContextExtKt.q(r3, r4)
                    return
                L37:
                    com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
                    int r1 = r7.getCheckedRadioButtonId()
                    android.view.View r1 = r7.findViewById(r1)
                    int r7 = r7.indexOfChild(r1)
                    java.lang.Object r5 = r5.get(r7)
                    java.util.Map r5 = (java.util.Map) r5
                    java.lang.String r7 = "isRight"
                    int r5 = r0.k(r5, r7)
                    r7 = 1
                    if (r5 != r7) goto L5b
                    r3.dismiss()
                    r6.invoke()
                    return
                L5b:
                    androidx.fragment.app.FragmentActivity r3 = r4.A()
                    java.lang.String r4 = "回答错误"
                    com.bxkj.base.v2.common.ext.ContextExtKt.q(r3, r4)
                L64:
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r8, kotlin.coroutines.e<?> r9) {
                    r7 = this;
                    com.bxkj.student.v2.ui.sports.v3.dxyy.n$c$a r0 = new com.bxkj.student.v2.ui.sports.v3.dxyy.n$c$a
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r7.b
                    com.bxkj.student.v2.ui.sports.v3.dxyy.n r2 = r7.c
                    java.lang.String r3 = r7.d
                    java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r7.e
                    kotlin.jvm.functions.Function0<kotlin.n1> r5 = r7.f
                    r6 = r9
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    return r0
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                    r0 = this;
                    kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.invoke(r1, r2)
                    return r1
            }

            public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    com.bxkj.student.v2.ui.sports.v3.dxyy.n$c$a r1 = (com.bxkj.student.v2.ui.sports.v3.dxyy.n.c.a) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    r9 = this;
                    kotlin.coroutines.intrinsics.a.l()
                    int r0 = r9.a
                    if (r0 != 0) goto Lb4
                    kotlin.g0.n(r10)
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r10 = r9.b
                    r10.dismiss()
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r10 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                    com.bxkj.student.v2.common.utils.a r0 = com.bxkj.student.v2.common.utils.a.a
                    android.app.Activity r0 = r0.a()
                    if (r0 != 0) goto L1f
                    com.bxkj.student.v2.ui.sports.v3.dxyy.n r0 = r9.c
                    androidx.fragment.app.FragmentActivity r0 = r0.A()
                L1f:
                    r10.<init>(r0)
                    java.lang.String r0 = "请完成答题以继续"
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r10.setTitle(r0)
                    r1 = 2131493751(0x7f0c0377, float:1.861099E38)
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setCenterCustomView(r1)
                    java.lang.String r1 = r9.d
                    java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r9.e
                    com.bxkj.student.v2.ui.sports.v3.dxyy.n r3 = r9.c
                    r4 = 0
                    r0.setCanceledOnTouchOutside(r4)
                    r0.setCancelable(r4)
                    r0.setClickAutoCancel(r4)
                    r4 = 2131299058(0x7f090af2, float:1.8216107E38)
                    android.view.View r4 = r0.findViewById(r4)
                    android.widget.TextView r4 = (android.widget.TextView) r4
                    if (r4 == 0) goto L4d
                    r4.setText(r1)
                L4d:
                    r1 = 2131298362(0x7f09083a, float:1.8214695E38)
                    android.view.View r1 = r0.findViewById(r1)
                    android.widget.RadioGroup r1 = (android.widget.RadioGroup) r1
                    if (r1 == 0) goto L9f
                    r1.removeAllViews()
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    java.util.Iterator r2 = r2.iterator()
                L61:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L9f
                    java.lang.Object r4 = r2.next()
                    java.util.Map r4 = (java.util.Map) r4
                    android.widget.RadioButton r5 = new android.widget.RadioButton
                    androidx.fragment.app.FragmentActivity r6 = r3.A()
                    r5.<init>(r6)
                    com.bxkj.base.v2.common.utils.x r6 = com.bxkj.base.v2.common.utils.x.a
                    java.lang.String r7 = "mark"
                    java.lang.String r7 = r6.t(r4, r7)
                    java.lang.String r8 = "answer"
                    java.lang.String r4 = r6.t(r4, r8)
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    r6.append(r7)
                    java.lang.String r7 = "."
                    r6.append(r7)
                    r6.append(r4)
                    java.lang.String r4 = r6.toString()
                    r5.setText(r4)
                    r1.addView(r5)
                    goto L61
                L9f:
                    com.bxkj.student.v2.ui.sports.v3.dxyy.n r1 = r9.c
                    java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r9.e
                    kotlin.jvm.functions.Function0<kotlin.n1> r3 = r9.f
                    com.bxkj.student.v2.ui.sports.v3.dxyy.o r4 = new com.bxkj.student.v2.ui.sports.v3.dxyy.o
                    r4.<init>(r10, r1, r2, r3)
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r10 = r0.setButtonOnClickListener(r4)
                    r10.show()
                    kotlin.n1 r10 = kotlin.n1.a
                    return r10
                Lb4:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
            }
        }

        c(cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1, com.bxkj.student.v2.ui.sports.v3.dxyy.n r2, kotlin.jvm.functions.Function0<kotlin.n1> r3, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.dxyy.n.c> r4) {
                r0 = this;
                r0.f = r1
                r0.g = r2
                r0.h = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r4, kotlin.coroutines.e<?> r5) {
                r3 = this;
                com.bxkj.student.v2.ui.sports.v3.dxyy.n$c r4 = new com.bxkj.student.v2.ui.sports.v3.dxyy.n$c
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r3.f
                com.bxkj.student.v2.ui.sports.v3.dxyy.n r1 = r3.g
                kotlin.jvm.functions.Function0<kotlin.n1> r2 = r3.h
                r4.<init>(r0, r1, r2, r5)
                return r4
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.ui.sports.v3.dxyy.n$c r1 = (com.bxkj.student.v2.ui.sports.v3.dxyy.n.c) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r11.e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r0 = r11.c
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r11.b
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r11.a
                java.util.Map r0 = (java.util.Map) r0
                kotlin.g0.n(r12)
                goto L80
            L1e:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L26:
                kotlin.g0.n(r12)
                goto L3c
            L2a:
                kotlin.g0.n(r12)
                com.bxkj.student.v2.retrofit.e r12 = com.bxkj.student.v2.retrofit.e.a
                com.bxkj.student.v2.retrofit.b r12 = r12.c()
                r11.e = r3
                java.lang.Object r12 = r12.H(r11)
                if (r12 != r0) goto L3c
                goto L7f
            L3c:
                com.bxkj.base.v2.http.result.ApiResult r12 = (com.bxkj.base.v2.http.result.ApiResult) r12
                java.lang.Object r12 = r12.apiData()
                java.util.Map r12 = (java.util.Map) r12
                com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
                java.lang.String r3 = "question"
                java.lang.String r7 = r1.t(r12, r3)
                java.lang.String r3 = "answers"
                java.util.List r8 = r1.n(r12, r3)
                kotlinx.coroutines.p2 r1 = kotlinx.coroutines.g1.e()
                com.bxkj.student.v2.ui.sports.v3.dxyy.n$c$a r4 = new com.bxkj.student.v2.ui.sports.v3.dxyy.n$c$a
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r11.f
                com.bxkj.student.v2.ui.sports.v3.dxyy.n r6 = r11.g
                kotlin.jvm.functions.Function0<kotlin.n1> r9 = r11.h
                r10 = 0
                r4.<init>(r5, r6, r7, r8, r9, r10)
                java.lang.Object r12 = kotlin.coroutines.jvm.internal.j.a(r12)
                r11.a = r12
                java.lang.Object r12 = kotlin.coroutines.jvm.internal.j.a(r7)
                r11.b = r12
                java.lang.Object r12 = kotlin.coroutines.jvm.internal.j.a(r8)
                r11.c = r12
                r12 = 0
                r11.d = r12
                r11.e = r2
                java.lang.Object r12 = kotlinx.coroutines.i.h(r1, r4, r11)
                if (r12 != r0) goto L80
            L7f:
                return r0
            L80:
                kotlin.n1 r12 = kotlin.n1.a
                return r12
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.dxyy.DxyyTypeDialog$scanQrCode$2$2$1", f = "DxyyTypeDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.dxyy.n b;
        final /* synthetic */ cn.bluemobi.dylan.base.view.iOSOneButtonDialog c;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class a implements com.bxkj.base.v2.common.qrcode.b.a {
            final /* synthetic */ cn.bluemobi.dylan.base.view.iOSOneButtonDialog a;
            final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> b;

            a(cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1, kotlin.jvm.functions.Function0<kotlin.n1> r2) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.<init>()
                    return
            }

            @Override // com.bxkj.base.v2.common.qrcode.b.a
            public void a(java.lang.String r4) {
                    r3 = this;
                    java.lang.String r0 = "result"
                    kotlin.jvm.internal.g0.p(r4, r0)
                    r0 = 0
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    java.lang.String r2 = "定向越野扫码返回"
                    com.orhanobut.logger.j.d(r2, r1)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "result:"
                    r1.append(r2)
                    r1.append(r4)
                    java.lang.String r4 = r1.toString()
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    com.orhanobut.logger.j.d(r4, r0)
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r3.a
                    r4.dismiss()
                    kotlin.jvm.functions.Function0<kotlin.n1> r4 = r3.b
                    r4.invoke()
                    return
            }
        }

        d(com.bxkj.student.v2.ui.sports.v3.dxyy.n r1, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2, kotlin.jvm.functions.Function0<kotlin.n1> r3, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.dxyy.n.d> r4) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r0.d = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r4, kotlin.coroutines.e<?> r5) {
                r3 = this;
                com.bxkj.student.v2.ui.sports.v3.dxyy.n$d r4 = new com.bxkj.student.v2.ui.sports.v3.dxyy.n$d
                com.bxkj.student.v2.ui.sports.v3.dxyy.n r0 = r3.b
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r3.c
                kotlin.jvm.functions.Function0<kotlin.n1> r2 = r3.d
                r4.<init>(r0, r1, r2, r5)
                return r4
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.ui.sports.v3.dxyy.n$d r1 = (com.bxkj.student.v2.ui.sports.v3.dxyy.n.d) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r3.a
                if (r0 != 0) goto L24
                kotlin.g0.n(r4)
                com.bxkj.base.v2.common.qrcode.b r4 = new com.bxkj.base.v2.common.qrcode.b
                com.bxkj.student.v2.ui.sports.v3.dxyy.n r0 = r3.b
                androidx.fragment.app.FragmentActivity r0 = r0.A()
                r4.<init>(r0)
                com.bxkj.student.v2.ui.sports.v3.dxyy.n$d$a r0 = new com.bxkj.student.v2.ui.sports.v3.dxyy.n$d$a
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r3.c
                kotlin.jvm.functions.Function0<kotlin.n1> r2 = r3.d
                r0.<init>(r1, r2)
                r4.m(r0)
                kotlin.n1 r4 = kotlin.n1.a
                return r4
            L24:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
        }
    }

    public n(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2, int r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r4) {
            r1 = this;
            java.lang.String r0 = "mActivity"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "continueRun"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            if (r3 == 0) goto L42
            r2 = 1
            if (r3 == r2) goto L39
            r2 = 2
            if (r3 == r2) goto L30
            r2 = 3
            if (r3 == r2) goto L27
            r2 = 4
            if (r3 == r2) goto L1e
            return
        L1e:
            com.bxkj.student.v2.ui.sports.v3.dxyy.i r2 = new com.bxkj.student.v2.ui.sports.v3.dxyy.i
            r2.<init>(r4)
            r1.w(r2)
            return
        L27:
            com.bxkj.student.v2.ui.sports.v3.dxyy.h r2 = new com.bxkj.student.v2.ui.sports.v3.dxyy.h
            r2.<init>(r4)
            r1.F(r2)
            return
        L30:
            com.bxkj.student.v2.ui.sports.v3.dxyy.g r2 = new com.bxkj.student.v2.ui.sports.v3.dxyy.g
            r2.<init>(r4)
            r1.s(r2)
            return
        L39:
            com.bxkj.student.v2.ui.sports.v3.dxyy.f r2 = new com.bxkj.student.v2.ui.sports.v3.dxyy.f
            r2.<init>(r4)
            r1.B(r2)
            return
        L42:
            r4.invoke()
            return
    }

    public /* synthetic */ n(androidx.fragment.app.FragmentActivity r1, int r2, kotlin.jvm.functions.Function0 r3, int r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L9
            com.bxkj.student.v2.ui.sports.v3.dxyy.e r3 = new com.bxkj.student.v2.ui.sports.v3.dxyy.e
            r3.<init>()
        L9:
            r0.<init>(r1, r2, r3)
            return
    }

    private final void B(kotlin.jvm.functions.Function0<kotlin.n1> r3) {
            r2 = this;
            com.bxkj.student.v2.common.utils.a r0 = com.bxkj.student.v2.common.utils.a.a
            android.app.Activity r0 = r0.a()
            if (r0 == 0) goto L1f
            com.bxkj.student.v2.ui.sports.v3.dxyy.j r1 = new com.bxkj.student.v2.ui.sports.v3.dxyy.j
            r1.<init>(r2, r3)
            java.lang.String r3 = "请完成答题以继续"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = com.bxkj.base.v2.common.ext.ContextExtKt.o(r0, r3, r1)
            if (r3 == 0) goto L1f
            r0 = 0
            r3.setCanceledOnTouchOutside(r0)
            r3.setCancelable(r0)
            r3.setClickAutoCancel(r0)
        L1f:
            return
    }

    static /* synthetic */ void C(com.bxkj.student.v2.ui.sports.v3.dxyy.n r0, kotlin.jvm.functions.Function0 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L9
            com.bxkj.student.v2.ui.sports.v3.dxyy.k r1 = new com.bxkj.student.v2.ui.sports.v3.dxyy.k
            r1.<init>()
        L9:
            r0.B(r1)
            return
    }

    private static final kotlin.n1 D() {
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 E(com.bxkj.student.v2.ui.sports.v3.dxyy.n r7, kotlin.jvm.functions.Function0 r8, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r9) {
            java.lang.String r0 = "dialog"
            kotlin.jvm.internal.g0.p(r9, r0)
            androidx.fragment.app.FragmentActivity r0 = r7.a
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r0)
            kotlinx.coroutines.m0 r2 = kotlinx.coroutines.g1.c()
            com.bxkj.student.v2.ui.sports.v3.dxyy.n$c r4 = new com.bxkj.student.v2.ui.sports.v3.dxyy.n$c
            r0 = 0
            r4.<init>(r9, r7, r8, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            kotlin.n1 r7 = kotlin.n1.a
            return r7
    }

    private final void F(kotlin.jvm.functions.Function0<kotlin.n1> r3) {
            r2 = this;
            com.bxkj.student.v2.common.utils.a r0 = com.bxkj.student.v2.common.utils.a.a
            android.app.Activity r0 = r0.a()
            if (r0 == 0) goto L1f
            com.bxkj.student.v2.ui.sports.v3.dxyy.d r1 = new com.bxkj.student.v2.ui.sports.v3.dxyy.d
            r1.<init>(r2, r3)
            java.lang.String r3 = "请完成扫码以继续"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = com.bxkj.base.v2.common.ext.ContextExtKt.o(r0, r3, r1)
            if (r3 == 0) goto L1f
            r0 = 0
            r3.setCanceledOnTouchOutside(r0)
            r3.setCancelable(r0)
            r3.setClickAutoCancel(r0)
        L1f:
            return
    }

    static /* synthetic */ void G(com.bxkj.student.v2.ui.sports.v3.dxyy.n r0, kotlin.jvm.functions.Function0 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L9
            com.bxkj.student.v2.ui.sports.v3.dxyy.m r1 = new com.bxkj.student.v2.ui.sports.v3.dxyy.m
            r1.<init>()
        L9:
            r0.F(r1)
            return
    }

    private static final kotlin.n1 H() {
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 I(com.bxkj.student.v2.ui.sports.v3.dxyy.n r7, kotlin.jvm.functions.Function0 r8, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r9) {
            java.lang.String r0 = "dialog"
            kotlin.jvm.internal.g0.p(r9, r0)
            com.bxkj.student.v2.common.utils.a r0 = com.bxkj.student.v2.common.utils.a.a
            android.app.Activity r0 = r0.a()
            if (r0 != 0) goto Lf
            androidx.fragment.app.FragmentActivity r0 = r7.a
        Lf:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            kotlin.jvm.internal.g0.n(r0, r1)
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            androidx.fragment.app.FragmentActivity r0 = r7.a
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r0)
            kotlinx.coroutines.p2 r2 = kotlinx.coroutines.g1.e()
            com.bxkj.student.v2.ui.sports.v3.dxyy.n$d r4 = new com.bxkj.student.v2.ui.sports.v3.dxyy.n$d
            r0 = 0
            r4.<init>(r7, r9, r8, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            kotlin.n1 r7 = kotlin.n1.a
            return r7
    }

    public static /* synthetic */ kotlin.n1 a(kotlin.jvm.functions.Function0 r0) {
            kotlin.n1 r0 = p(r0)
            return r0
    }

    public static /* synthetic */ kotlin.n1 b(com.bxkj.student.v2.ui.sports.v3.dxyy.n r0, kotlin.jvm.functions.Function0 r1, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2) {
            kotlin.n1 r0 = E(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 c(kotlin.jvm.functions.Function0 r0) {
            kotlin.n1 r0 = q(r0)
            return r0
    }

    public static /* synthetic */ kotlin.n1 d() {
            kotlin.n1 r0 = D()
            return r0
    }

    public static /* synthetic */ kotlin.n1 e() {
            kotlin.n1 r0 = v()
            return r0
    }

    public static /* synthetic */ kotlin.n1 f(com.bxkj.student.v2.ui.sports.v3.dxyy.n r0, kotlin.jvm.functions.Function0 r1, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2) {
            kotlin.n1 r0 = z(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 g(com.bxkj.student.v2.ui.sports.v3.dxyy.n r0, kotlin.jvm.functions.Function0 r1, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2) {
            kotlin.n1 r0 = u(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 h() {
            kotlin.n1 r0 = H()
            return r0
    }

    public static /* synthetic */ kotlin.n1 i() {
            kotlin.n1 r0 = n()
            return r0
    }

    public static /* synthetic */ kotlin.n1 j(kotlin.jvm.functions.Function0 r0) {
            kotlin.n1 r0 = o(r0)
            return r0
    }

    public static /* synthetic */ kotlin.n1 k() {
            kotlin.n1 r0 = y()
            return r0
    }

    public static /* synthetic */ kotlin.n1 l(kotlin.jvm.functions.Function0 r0) {
            kotlin.n1 r0 = r(r0)
            return r0
    }

    public static /* synthetic */ kotlin.n1 m(com.bxkj.student.v2.ui.sports.v3.dxyy.n r0, kotlin.jvm.functions.Function0 r1, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2) {
            kotlin.n1 r0 = I(r0, r1, r2)
            return r0
    }

    private static final kotlin.n1 n() {
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 o(kotlin.jvm.functions.Function0 r0) {
            r0.invoke()
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 p(kotlin.jvm.functions.Function0 r0) {
            r0.invoke()
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 q(kotlin.jvm.functions.Function0 r0) {
            r0.invoke()
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 r(kotlin.jvm.functions.Function0 r0) {
            r0.invoke()
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private final void s(kotlin.jvm.functions.Function0<kotlin.n1> r3) {
            r2 = this;
            com.bxkj.student.v2.common.utils.a r0 = com.bxkj.student.v2.common.utils.a.a
            android.app.Activity r0 = r0.a()
            if (r0 == 0) goto L1f
            com.bxkj.student.v2.ui.sports.v3.dxyy.a r1 = new com.bxkj.student.v2.ui.sports.v3.dxyy.a
            r1.<init>(r2, r3)
            java.lang.String r3 = "请完成AR识图以继续"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = com.bxkj.base.v2.common.ext.ContextExtKt.o(r0, r3, r1)
            if (r3 == 0) goto L1f
            r0 = 0
            r3.setCanceledOnTouchOutside(r0)
            r3.setCancelable(r0)
            r3.setClickAutoCancel(r0)
        L1f:
            return
    }

    static /* synthetic */ void t(com.bxkj.student.v2.ui.sports.v3.dxyy.n r0, kotlin.jvm.functions.Function0 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L9
            com.bxkj.student.v2.ui.sports.v3.dxyy.b r1 = new com.bxkj.student.v2.ui.sports.v3.dxyy.b
            r1.<init>()
        L9:
            r0.s(r1)
            return
    }

    private static final kotlin.n1 u(com.bxkj.student.v2.ui.sports.v3.dxyy.n r3, kotlin.jvm.functions.Function0 r4, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5) {
            java.lang.String r0 = "dialog"
            kotlin.jvm.internal.g0.p(r5, r0)
            com.bxkj.student.v2.common.utils.a r0 = com.bxkj.student.v2.common.utils.a.a
            android.app.Activity r0 = r0.a()
            if (r0 != 0) goto Lf
            androidx.fragment.app.FragmentActivity r0 = r3.a
        Lf:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            kotlin.jvm.internal.g0.n(r0, r1)
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            t.b r1 = new t.b
            r1.<init>(r0)
            android.content.Intent r0 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r3 = r3.a
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.dxyy.ar.ARActivity> r2 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.ARActivity.class
            r0.<init>(r3, r2)
            t.b r3 = r1.startActivityForResult(r0)
            com.bxkj.student.v2.ui.sports.v3.dxyy.n$a r0 = new com.bxkj.student.v2.ui.sports.v3.dxyy.n$a
            r0.<init>(r5, r4)
            r3.c(r0)
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    private static final kotlin.n1 v() {
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private final void w(kotlin.jvm.functions.Function0<kotlin.n1> r3) {
            r2 = this;
            com.bxkj.student.v2.common.utils.a r0 = com.bxkj.student.v2.common.utils.a.a
            android.app.Activity r0 = r0.a()
            if (r0 == 0) goto L1f
            com.bxkj.student.v2.ui.sports.v3.dxyy.c r1 = new com.bxkj.student.v2.ui.sports.v3.dxyy.c
            r1.<init>(r2, r3)
            java.lang.String r3 = "请完成拍照以继续"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = com.bxkj.base.v2.common.ext.ContextExtKt.o(r0, r3, r1)
            if (r3 == 0) goto L1f
            r0 = 0
            r3.setCanceledOnTouchOutside(r0)
            r3.setCancelable(r0)
            r3.setClickAutoCancel(r0)
        L1f:
            return
    }

    static /* synthetic */ void x(com.bxkj.student.v2.ui.sports.v3.dxyy.n r0, kotlin.jvm.functions.Function0 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L9
            com.bxkj.student.v2.ui.sports.v3.dxyy.l r1 = new com.bxkj.student.v2.ui.sports.v3.dxyy.l
            r1.<init>()
        L9:
            r0.w(r1)
            return
    }

    private static final kotlin.n1 y() {
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 z(com.bxkj.student.v2.ui.sports.v3.dxyy.n r2, kotlin.jvm.functions.Function0 r3, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4) {
            java.lang.String r0 = "dialog"
            kotlin.jvm.internal.g0.p(r4, r0)
            s.b r0 = new s.b
            androidx.fragment.app.FragmentActivity r1 = r2.a
            r0.<init>(r1)
            java.lang.String r1 = "android.permission.CAMERA"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            s.b r0 = r0.c(r1)
            com.bxkj.student.v2.ui.sports.v3.dxyy.n$b r1 = new com.bxkj.student.v2.ui.sports.v3.dxyy.n$b
            r1.<init>(r2, r4, r3)
            r0.d(r1)
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.fragment.app.FragmentActivity A() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.a
            return r0
    }
}
