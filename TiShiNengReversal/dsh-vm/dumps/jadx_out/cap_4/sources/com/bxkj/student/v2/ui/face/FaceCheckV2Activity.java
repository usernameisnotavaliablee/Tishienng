package com.bxkj.student.v2.ui.face;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFaceCheckV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceCheckV2Activity.kt\ncom/bxkj/student/v2/ui/face/FaceCheckV2Activity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class FaceCheckV2Activity extends com.baidu.idl.face.platform.ui.BaseFaceDetectActivity {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.ui.face.FaceCheckV2Activity.a T = null;
    public static final int U = 170;
    private android.content.Context O;
    private com.bxkj.student.v2.vm.face.FaceCheckVM P;
    public androidx.lifecycle.LifecycleOwner Q;
    public androidx.fragment.app.FragmentManager R;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.base.v2.base.ProgressDialogFragment S;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b implements androidx.lifecycle.Observer, kotlin.jvm.internal.b0 {
        private final /* synthetic */ kotlin.jvm.functions.Function1 a;

        b(kotlin.jvm.functions.Function1 r2) {
                r1 = this;
                java.lang.String r0 = "function"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                return
        }

        public final boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof androidx.lifecycle.Observer
                r1 = 0
                if (r0 == 0) goto L18
                boolean r0 = r3 instanceof kotlin.jvm.internal.b0
                if (r0 == 0) goto L18
                kotlin.n r0 = r2.getFunctionDelegate()
                kotlin.jvm.internal.b0 r3 = (kotlin.jvm.internal.b0) r3
                kotlin.n r3 = r3.getFunctionDelegate()
                boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
                return r3
            L18:
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.n<?> getFunctionDelegate() {
                r1 = this;
                kotlin.jvm.functions.Function1 r0 = r1.a
                return r0
        }

        public final int hashCode() {
                r1 = this;
                kotlin.n r0 = r1.getFunctionDelegate()
                int r0 = r0.hashCode()
                return r0
        }

        public final /* synthetic */ void onChanged(java.lang.Object r2) {
                r1 = this;
                kotlin.jvm.functions.Function1 r0 = r1.a
                r0.invoke(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c implements android.content.DialogInterface.OnKeyListener {
        final /* synthetic */ com.bxkj.student.v2.ui.face.FaceCheckV2Activity a;

        c(com.bxkj.student.v2.ui.face.FaceCheckV2Activity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
                r0 = this;
                r1 = 4
                if (r2 != r1) goto L2c
                com.bxkj.student.v2.ui.face.FaceCheckV2Activity r1 = r0.a
                com.bxkj.base.v2.base.ProgressDialogFragment r1 = r1.U()
                if (r1 == 0) goto Le
                r1.dismiss()
            Le:
                com.bxkj.student.v2.ui.face.FaceCheckV2Activity r1 = r0.a
                com.bxkj.student.v2.vm.face.FaceCheckVM r1 = com.bxkj.student.v2.ui.face.FaceCheckV2Activity.m(r1)
                if (r1 != 0) goto L1c
                java.lang.String r1 = "mViewModel"
                kotlin.jvm.internal.g0.S(r1)
                r1 = 0
            L1c:
                kotlinx.coroutines.e2 r1 = r1.b()
                if (r1 == 0) goto L2a
                java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
                r2.<init>()
                r1.b(r2)
            L2a:
                r1 = 1
                return r1
            L2c:
                r1 = 0
                return r1
        }
    }

    static {
            r0 = 17800(0x4588, float:2.4943E-41)
            com.stub.StubApp.interface11(r0)
            com.bxkj.student.v2.ui.face.FaceCheckV2Activity$a r0 = new com.bxkj.student.v2.ui.face.FaceCheckV2Activity$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.v2.ui.face.FaceCheckV2Activity.T = r0
            return
    }

    public FaceCheckV2Activity() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void D() {
            r5 = this;
            com.bxkj.student.v2.vm.face.FaceCheckVM r0 = r5.P
            if (r0 != 0) goto La
            java.lang.String r0 = "mViewModel"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        La:
            androidx.lifecycle.MutableLiveData r1 = r0.c()
            androidx.lifecycle.LifecycleOwner r2 = r5.F()
            com.bxkj.student.v2.ui.face.d r3 = new com.bxkj.student.v2.ui.face.d
            r3.<init>(r5)
            com.bxkj.student.v2.ui.face.FaceCheckV2Activity$b r4 = new com.bxkj.student.v2.ui.face.FaceCheckV2Activity$b
            r4.<init>(r3)
            r1.observe(r2, r4)
            androidx.lifecycle.MutableLiveData r1 = r0.e()
            androidx.lifecycle.LifecycleOwner r2 = r5.F()
            com.bxkj.student.v2.ui.face.e r3 = new com.bxkj.student.v2.ui.face.e
            r3.<init>(r5)
            com.bxkj.student.v2.ui.face.FaceCheckV2Activity$b r4 = new com.bxkj.student.v2.ui.face.FaceCheckV2Activity$b
            r4.<init>(r3)
            r1.observe(r2, r4)
            androidx.lifecycle.MutableLiveData r1 = r0.f()
            androidx.lifecycle.LifecycleOwner r2 = r5.F()
            com.bxkj.student.v2.ui.face.f r3 = new com.bxkj.student.v2.ui.face.f
            r3.<init>(r5)
            com.bxkj.student.v2.ui.face.FaceCheckV2Activity$b r4 = new com.bxkj.student.v2.ui.face.FaceCheckV2Activity$b
            r4.<init>(r3)
            r1.observe(r2, r4)
            androidx.lifecycle.MutableLiveData r1 = r0.h()
            androidx.lifecycle.LifecycleOwner r2 = r5.F()
            com.bxkj.student.v2.ui.face.g r3 = new com.bxkj.student.v2.ui.face.g
            r3.<init>(r5)
            com.bxkj.student.v2.ui.face.FaceCheckV2Activity$b r4 = new com.bxkj.student.v2.ui.face.FaceCheckV2Activity$b
            r4.<init>(r3)
            r1.observe(r2, r4)
            androidx.lifecycle.MutableLiveData r0 = r0.g()
            androidx.lifecycle.LifecycleOwner r1 = r5.F()
            com.bxkj.student.v2.ui.face.h r2 = new com.bxkj.student.v2.ui.face.h
            r2.<init>(r5)
            com.bxkj.student.v2.ui.face.FaceCheckV2Activity$b r3 = new com.bxkj.student.v2.ui.face.FaceCheckV2Activity$b
            r3.<init>(r2)
            r0.observe(r1, r3)
            return
    }

    private static final kotlin.n1 L(com.bxkj.student.v2.ui.face.FaceCheckV2Activity r0, java.lang.String r1) {
            if (r1 == 0) goto Lf
            android.content.Context r0 = r0.O
            if (r0 != 0) goto Lc
            java.lang.String r0 = "mContext"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        Lc:
            com.bxkj.base.v2.common.ext.ContextExtKt.m(r0, r1)
        Lf:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 M(com.bxkj.student.v2.ui.face.FaceCheckV2Activity r3, java.lang.String r4) {
            if (r4 == 0) goto L12
            android.content.Context r3 = r3.O
            r0 = 0
            if (r3 != 0) goto Ld
            java.lang.String r3 = "mContext"
            kotlin.jvm.internal.g0.S(r3)
            r3 = r0
        Ld:
            r1 = 0
            r2 = 2
            com.bxkj.base.v2.common.ext.ContextExtKt.s(r3, r4, r1, r2, r0)
        L12:
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    private static final kotlin.n1 N(com.bxkj.student.v2.ui.face.FaceCheckV2Activity r0, java.lang.String r1) {
            if (r1 == 0) goto Lf
            android.content.Context r0 = r0.O
            if (r0 != 0) goto Lc
            java.lang.String r0 = "mContext"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        Lc:
            com.bxkj.base.v2.common.ext.ContextExtKt.q(r0, r1)
        Lf:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 O(com.bxkj.student.v2.ui.face.FaceCheckV2Activity r0, java.lang.Integer r1) {
            int r1 = r1.intValue()
            if (r1 <= 0) goto L1e
            com.bxkj.student.v2.vm.face.FaceCheckVM r1 = r0.P
            if (r1 != 0) goto L10
            java.lang.String r1 = "mViewModel"
            kotlin.jvm.internal.g0.S(r1)
            r1 = 0
        L10:
            androidx.lifecycle.MutableLiveData r1 = r1.d()
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0.Z(r1)
            goto L21
        L1e:
            r0.t()
        L21:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 P(com.bxkj.student.v2.ui.face.FaceCheckV2Activity r2, java.lang.String r3) {
            if (r3 == 0) goto L19
            android.content.Context r0 = r2.O
            if (r0 != 0) goto Lc
            java.lang.String r0 = "mContext"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        Lc:
            com.bxkj.student.v2.ui.face.b r1 = new com.bxkj.student.v2.ui.face.b
            r1.<init>(r3, r2)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = com.bxkj.base.v2.common.ext.ContextExtKt.o(r0, r3, r1)
            r3 = 0
            r2.setCancelable(r3)
        L19:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final kotlin.n1 Q(java.lang.String r3, com.bxkj.student.v2.ui.face.FaceCheckV2Activity r4, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r5 = "登录失效"
            r0 = 0
            r1 = 2
            r2 = 0
            boolean r3 = kotlin.text.u.l3(r3, r5, r0, r1, r2)
            if (r3 == 0) goto L35
            android.content.Context r3 = r4.O
            java.lang.String r5 = "mContext"
            if (r3 != 0) goto L1a
            kotlin.jvm.internal.g0.S(r5)
            r3 = r2
        L1a:
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r4 = r4.O
            if (r4 != 0) goto L24
            kotlin.jvm.internal.g0.S(r5)
            goto L25
        L24:
            r2 = r4
        L25:
            java.lang.Class<com.bxkj.student.v2.ui.LoginActivity> r4 = com.bxkj.student.v2.ui.LoginActivity.class
            r0.<init>(r2, r4)
            r4 = 268468224(0x10008000, float:2.5342157E-29)
            android.content.Intent r4 = r0.setFlags(r4)
            r3.startActivity(r4)
            goto L38
        L35:
            r4.W()
        L38:
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    private final void R(java.lang.String r6) {
            r5 = this;
            android.content.Context r0 = r5.O
            r1 = 0
            if (r0 != 0) goto Lb
            java.lang.String r0 = "mContext"
            kotlin.jvm.internal.g0.S(r0)
            r0 = r1
        Lb:
            java.io.File r0 = r0.getCacheDir()
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "avatar"
            r2.<init>(r0, r3)
            boolean r0 = r2.exists()
            if (r0 != 0) goto L20
            boolean r0 = r2.mkdirs()
        L20:
            if (r0 == 0) goto L58
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "avatar_face.png"
            r3.<init>(r2, r4)
            r0.element = r3
            com.bxkj.base.v2.common.utils.r$a r2 = com.bxkj.base.v2.common.utils.r.a
            java.lang.String r3 = r3.getPath()
            java.lang.String r4 = "getPath(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            java.io.File r6 = r2.a(r6, r3)
            r0.element = r6
            com.bxkj.student.v2.vm.face.FaceCheckVM r6 = r5.P
            if (r6 != 0) goto L4b
            java.lang.String r6 = "mViewModel"
            kotlin.jvm.internal.g0.S(r6)
            goto L4c
        L4b:
            r1 = r6
        L4c:
            java.lang.Object r6 = r0.element
            java.io.File r6 = (java.io.File) r6
            com.bxkj.student.v2.ui.face.a r2 = new com.bxkj.student.v2.ui.face.a
            r2.<init>(r0, r5)
            r1.t(r6, r2)
        L58:
            return
    }

    private static final kotlin.n1 S(kotlin.jvm.internal.Ref.ObjectRef r3, com.bxkj.student.v2.ui.face.FaceCheckV2Activity r4, com.bxkj.base.v2.http.exception.ApiException r5) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.Object r3 = r3.element
            r0 = r3
            java.io.File r0 = (java.io.File) r0
            boolean r0 = r0.exists()
            r1 = 0
            if (r0 == 0) goto L12
            goto L13
        L12:
            r3 = r1
        L13:
            java.io.File r3 = (java.io.File) r3
            if (r3 == 0) goto L1a
            r3.delete()
        L1a:
            java.lang.Integer r3 = r5.getCode()
            java.lang.Integer r0 = r5.getCode()
            if (r0 != 0) goto L25
            goto L4a
        L25:
            int r0 = r0.intValue()
            if (r0 != 0) goto L4a
            java.lang.String r5 = r5.getMessage()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0 = 0
            r2 = 2
            com.bxkj.base.v2.common.ext.ContextExtKt.s(r4, r5, r0, r2, r1)
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r0 = "code"
            r5.putExtra(r0, r3)
            r3 = -1
            r4.setResult(r3, r5)
            r4.finish()
            goto L5a
        L4a:
            java.lang.String r5 = r5.getMessage()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            com.bxkj.student.v2.ui.face.c r0 = new com.bxkj.student.v2.ui.face.c
            r0.<init>(r3, r4)
            com.bxkj.base.v2.common.ext.ContextExtKt.o(r4, r5, r0)
        L5a:
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    private static final kotlin.n1 T(java.lang.Integer r1, com.bxkj.student.v2.ui.face.FaceCheckV2Activity r2, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r3, r0)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r0 = "code"
            r3.putExtra(r0, r1)
            r1 = -1
            r2.setResult(r1, r3)
            r2.finish()
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private final void V() {
            r3 = this;
            com.bxkj.student.v2.ui.face.FaceManger r0 = com.bxkj.student.v2.ui.face.FaceManger.a
            android.content.Context r1 = r3.O
            if (r1 != 0) goto Lc
            java.lang.String r1 = "mContext"
            kotlin.jvm.internal.g0.S(r1)
            r1 = 0
        Lc:
            androidx.lifecycle.LifecycleCoroutineScope r2 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r3)
            r0.f(r1, r2)
            return
    }

    private final void W() {
            r2 = this;
            r0 = 170(0xaa, float:2.38E-43)
            android.content.Intent r1 = r2.getIntent()
            r2.setResult(r0, r1)
            r2.finish()
            return
    }

    private final void Y(android.app.Activity r2, float r3) {
            r1 = this;
            android.view.Window r2 = r2.getWindow()
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
            r0.screenBrightness = r3
            r2.setAttributes(r0)
            return
    }

    private final void Z(java.lang.String r4) {
            r3 = this;
            com.bxkj.base.v2.base.ProgressDialogFragment r0 = r3.S
            if (r0 != 0) goto L13
            com.bxkj.base.v2.base.ProgressDialogFragment r0 = new com.bxkj.base.v2.base.ProgressDialogFragment
            r0.<init>(r4)
            r3.S = r0
            com.bxkj.student.v2.ui.face.FaceCheckV2Activity$c r1 = new com.bxkj.student.v2.ui.face.FaceCheckV2Activity$c
            r1.<init>(r3)
            r0.c(r1)
        L13:
            com.bxkj.base.v2.base.ProgressDialogFragment r0 = r3.S
            if (r0 == 0) goto L1f
            androidx.fragment.app.FragmentManager r1 = r3.I()
            r2 = 1
            r0.e(r1, r4, r2)
        L1f:
            return
    }

    static /* synthetic */ void a0(com.bxkj.student.v2.ui.face.FaceCheckV2Activity r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = "loading..."
        L6:
            r0.Z(r1)
            return
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.face.FaceCheckV2Activity r0, java.lang.String r1) {
            kotlin.n1 r0 = N(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 f(com.bxkj.student.v2.ui.face.FaceCheckV2Activity r0, java.lang.String r1) {
            kotlin.n1 r0 = M(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 g(java.lang.Integer r0, com.bxkj.student.v2.ui.face.FaceCheckV2Activity r1, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2) {
            kotlin.n1 r0 = T(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 h(com.bxkj.student.v2.ui.face.FaceCheckV2Activity r0, java.lang.String r1) {
            kotlin.n1 r0 = P(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 i(com.bxkj.student.v2.ui.face.FaceCheckV2Activity r0, java.lang.Integer r1) {
            kotlin.n1 r0 = O(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 j(kotlin.jvm.internal.Ref.ObjectRef r0, com.bxkj.student.v2.ui.face.FaceCheckV2Activity r1, com.bxkj.base.v2.http.exception.ApiException r2) {
            kotlin.n1 r0 = S(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 k(com.bxkj.student.v2.ui.face.FaceCheckV2Activity r0, java.lang.String r1) {
            kotlin.n1 r0 = L(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 l(java.lang.String r0, com.bxkj.student.v2.ui.face.FaceCheckV2Activity r1, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2) {
            kotlin.n1 r0 = Q(r0, r1, r2)
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.vm.face.FaceCheckVM m(com.bxkj.student.v2.ui.face.FaceCheckV2Activity r0) {
            com.bxkj.student.v2.vm.face.FaceCheckVM r0 = r0.P
            return r0
    }

    private final void t() {
            r2 = this;
            com.bxkj.base.v2.base.ProgressDialogFragment r0 = r2.S
            if (r0 == 0) goto L11
            boolean r1 = r0.isAdded()
            if (r1 == 0) goto Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L11
            r0.dismissAllowingStateLoss()
        L11:
            return
    }

    public final void E(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentManager r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.R = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LifecycleOwner F() {
            r1 = this;
            androidx.lifecycle.LifecycleOwner r0 = r1.Q
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "lifecycleOwner"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.fragment.app.FragmentManager I() {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.R
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "dialogFagmentManager"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.bxkj.base.v2.base.ProgressDialogFragment U() {
            r1 = this;
            com.bxkj.base.v2.base.ProgressDialogFragment r0 = r1.S
            return r0
    }

    public final void X(@org.jetbrains.annotations.Nullable com.bxkj.base.v2.base.ProgressDialogFragment r1) {
            r0 = this;
            r0.S = r1
            return
    }

    public native void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r1);

    protected void onDestroy() {
            r1 = this;
            r1.t()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.Y(r1, r0)
            super/*androidx.appcompat.app.AppCompatActivity*/.onDestroy()
            return
    }

    protected void onFace(@org.jetbrains.annotations.Nullable java.lang.String r2) {
            r1 = this;
            super.onFace(r2)
            if (r2 == 0) goto L12
            int r0 = r2.length()
            if (r0 <= 0) goto Lc
            goto Ld
        Lc:
            r2 = 0
        Ld:
            if (r2 == 0) goto L12
            r1.R(r2)
        L12:
            return
    }

    public final void setLifecycleOwner(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.Q = r2
            return
    }
}
