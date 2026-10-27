package com.bxkj.student.v2.ui.face;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFaceLiveV3Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceLiveV3Activity.kt\ncom/bxkj/student/v2/ui/face/FaceLiveV3Activity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class FaceLiveV3Activity extends com.baidu.idl.face.platform.ui.BaseFaceLivenessActivity {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.ui.face.FaceLiveV3Activity.a Y = null;
    public static final int Z = 170;
    private android.content.Context O;

    @org.jetbrains.annotations.NotNull
    private java.lang.String P;

    @org.jetbrains.annotations.NotNull
    private java.lang.String Q;
    private int R;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.common.data.PointData S;
    private boolean T;
    private com.bxkj.student.v2.vm.face.FaceDetectVM U;
    public androidx.lifecycle.LifecycleOwner V;
    public androidx.fragment.app.FragmentManager W;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.base.v2.base.ProgressDialogFragment X;

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
        final /* synthetic */ com.bxkj.student.v2.ui.face.FaceLiveV3Activity a;

        c(com.bxkj.student.v2.ui.face.FaceLiveV3Activity r1) {
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
                com.bxkj.student.v2.ui.face.FaceLiveV3Activity r1 = r0.a
                com.bxkj.base.v2.base.ProgressDialogFragment r1 = r1.S()
                if (r1 == 0) goto Le
                r1.dismiss()
            Le:
                com.bxkj.student.v2.ui.face.FaceLiveV3Activity r1 = r0.a
                com.bxkj.student.v2.vm.face.FaceDetectVM r1 = com.bxkj.student.v2.ui.face.FaceLiveV3Activity.l(r1)
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
            r0 = 17813(0x4595, float:2.4961E-41)
            com.stub.StubApp.interface11(r0)
            com.bxkj.student.v2.ui.face.FaceLiveV3Activity$a r0 = new com.bxkj.student.v2.ui.face.FaceLiveV3Activity$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.v2.ui.face.FaceLiveV3Activity.Y = r0
            return
    }

    public FaceLiveV3Activity() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.P = r0
            r1.Q = r0
            r0 = 1
            r1.R = r0
            r1.T = r0
            return
    }

    private final void D() {
            r5 = this;
            com.bxkj.student.v2.vm.face.FaceDetectVM r0 = r5.U
            if (r0 != 0) goto La
            java.lang.String r0 = "mViewModel"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        La:
            androidx.lifecycle.MutableLiveData r1 = r0.c()
            androidx.lifecycle.LifecycleOwner r2 = r5.F()
            com.bxkj.student.v2.ui.face.w r3 = new com.bxkj.student.v2.ui.face.w
            r3.<init>(r5)
            com.bxkj.student.v2.ui.face.FaceLiveV3Activity$b r4 = new com.bxkj.student.v2.ui.face.FaceLiveV3Activity$b
            r4.<init>(r3)
            r1.observe(r2, r4)
            androidx.lifecycle.MutableLiveData r1 = r0.e()
            androidx.lifecycle.LifecycleOwner r2 = r5.F()
            com.bxkj.student.v2.ui.face.x r3 = new com.bxkj.student.v2.ui.face.x
            r3.<init>(r5)
            com.bxkj.student.v2.ui.face.FaceLiveV3Activity$b r4 = new com.bxkj.student.v2.ui.face.FaceLiveV3Activity$b
            r4.<init>(r3)
            r1.observe(r2, r4)
            androidx.lifecycle.MutableLiveData r1 = r0.f()
            androidx.lifecycle.LifecycleOwner r2 = r5.F()
            com.bxkj.student.v2.ui.face.y r3 = new com.bxkj.student.v2.ui.face.y
            r3.<init>(r5)
            com.bxkj.student.v2.ui.face.FaceLiveV3Activity$b r4 = new com.bxkj.student.v2.ui.face.FaceLiveV3Activity$b
            r4.<init>(r3)
            r1.observe(r2, r4)
            androidx.lifecycle.MutableLiveData r1 = r0.h()
            androidx.lifecycle.LifecycleOwner r2 = r5.F()
            com.bxkj.student.v2.ui.face.z r3 = new com.bxkj.student.v2.ui.face.z
            r3.<init>(r5)
            com.bxkj.student.v2.ui.face.FaceLiveV3Activity$b r4 = new com.bxkj.student.v2.ui.face.FaceLiveV3Activity$b
            r4.<init>(r3)
            r1.observe(r2, r4)
            androidx.lifecycle.MutableLiveData r0 = r0.g()
            androidx.lifecycle.LifecycleOwner r1 = r5.F()
            com.bxkj.student.v2.ui.face.a0 r2 = new com.bxkj.student.v2.ui.face.a0
            r2.<init>(r5)
            com.bxkj.student.v2.ui.face.FaceLiveV3Activity$b r3 = new com.bxkj.student.v2.ui.face.FaceLiveV3Activity$b
            r3.<init>(r2)
            r0.observe(r1, r3)
            return
    }

    private static final kotlin.n1 L(com.bxkj.student.v2.ui.face.FaceLiveV3Activity r0, java.lang.String r1) {
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

    private static final kotlin.n1 M(com.bxkj.student.v2.ui.face.FaceLiveV3Activity r0, java.lang.Integer r1) {
            int r1 = r1.intValue()
            if (r1 <= 0) goto L1e
            com.bxkj.student.v2.vm.face.FaceDetectVM r1 = r0.U
            if (r1 != 0) goto L10
            java.lang.String r1 = "mViewModel"
            kotlin.jvm.internal.g0.S(r1)
            r1 = 0
        L10:
            androidx.lifecycle.MutableLiveData r1 = r1.d()
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0.X(r1)
            goto L21
        L1e:
            r0.t()
        L21:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 N(com.bxkj.student.v2.ui.face.FaceLiveV3Activity r2, java.lang.String r3) {
            if (r3 == 0) goto L19
            android.content.Context r0 = r2.O
            if (r0 != 0) goto Lc
            java.lang.String r0 = "mContext"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        Lc:
            com.bxkj.student.v2.ui.face.c0 r1 = new com.bxkj.student.v2.ui.face.c0
            r1.<init>(r3, r2)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = com.bxkj.base.v2.common.ext.ContextExtKt.o(r0, r3, r1)
            r3 = 0
            r2.setCancelable(r3)
        L19:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final kotlin.n1 O(java.lang.String r3, com.bxkj.student.v2.ui.face.FaceLiveV3Activity r4, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5) {
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
            r4.U()
        L38:
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    private static final kotlin.n1 P(com.bxkj.student.v2.ui.face.FaceLiveV3Activity r0, java.lang.String r1) {
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

    private final void Q(java.lang.String r11) {
            r10 = this;
            java.io.File r0 = new java.io.File
            com.bxkj.student.App$a r1 = com.bxkj.student.App.d
            com.bxkj.student.App r1 = r1.a()
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r1 = r1.getPath()
            java.lang.String r2 = "face"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L1e
            r0.mkdir()
        L1e:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r10.Q
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "avatar_face_"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = "_"
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = ".png"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r1.<init>(r0, r2)
            com.bxkj.base.v2.common.utils.r$a r0 = com.bxkj.base.v2.common.utils.r.a
            java.lang.String r1 = r1.getPath()
            java.lang.String r2 = "getPath(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.io.File r7 = r0.a(r11, r1)
            java.lang.String r11 = r7.getPath()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "avatar.path="
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.orhanobut.logger.j.d(r11, r0)
            com.bxkj.student.v2.vm.face.FaceDetectVM r11 = r10.U
            if (r11 != 0) goto L7b
            java.lang.String r11 = "mViewModel"
            kotlin.jvm.internal.g0.S(r11)
            r11 = 0
        L7b:
            r3 = r11
            java.lang.String r4 = r10.P
            java.lang.String r5 = r10.Q
            int r11 = r10.R
            java.lang.String r6 = java.lang.String.valueOf(r11)
            com.bxkj.student.v2.common.data.PointData r8 = r10.S
            com.bxkj.student.v2.ui.face.b0 r9 = new com.bxkj.student.v2.ui.face.b0
            r9.<init>(r10)
            r3.v(r4, r5, r6, r7, r8, r9)
            return
    }

    private static final kotlin.n1 R(com.bxkj.student.v2.ui.face.FaceLiveV3Activity r4) {
            r0 = 2
            r1 = 0
            java.lang.String r2 = "人脸识别成功"
            r3 = 0
            com.bxkj.base.v2.common.ext.ContextExtKt.s(r4, r2, r3, r0, r1)
            r0 = -1
            r4.setResult(r0)
            r4.finish()
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    private final void T() {
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

    private final void U() {
            r2 = this;
            r0 = 170(0xaa, float:2.38E-43)
            android.content.Intent r1 = r2.getIntent()
            r2.setResult(r0, r1)
            r2.finish()
            return
    }

    private final void W(android.app.Activity r2, float r3) {
            r1 = this;
            android.view.Window r2 = r2.getWindow()
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
            r0.screenBrightness = r3
            r2.setAttributes(r0)
            return
    }

    private final void X(java.lang.String r4) {
            r3 = this;
            com.bxkj.base.v2.base.ProgressDialogFragment r0 = r3.X
            if (r0 != 0) goto L13
            com.bxkj.base.v2.base.ProgressDialogFragment r0 = new com.bxkj.base.v2.base.ProgressDialogFragment
            r0.<init>(r4)
            r3.X = r0
            com.bxkj.student.v2.ui.face.FaceLiveV3Activity$c r1 = new com.bxkj.student.v2.ui.face.FaceLiveV3Activity$c
            r1.<init>(r3)
            r0.c(r1)
        L13:
            com.bxkj.base.v2.base.ProgressDialogFragment r0 = r3.X
            if (r0 == 0) goto L1f
            androidx.fragment.app.FragmentManager r1 = r3.I()
            r2 = 1
            r0.e(r1, r4, r2)
        L1f:
            return
    }

    static /* synthetic */ void Y(com.bxkj.student.v2.ui.face.FaceLiveV3Activity r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = "loading..."
        L6:
            r0.X(r1)
            return
    }

    public static /* synthetic */ kotlin.n1 e(java.lang.String r0, com.bxkj.student.v2.ui.face.FaceLiveV3Activity r1, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2) {
            kotlin.n1 r0 = O(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 f(com.bxkj.student.v2.ui.face.FaceLiveV3Activity r0, java.lang.String r1) {
            kotlin.n1 r0 = m(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 g(com.bxkj.student.v2.ui.face.FaceLiveV3Activity r0, java.lang.String r1) {
            kotlin.n1 r0 = P(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 h(com.bxkj.student.v2.ui.face.FaceLiveV3Activity r0, java.lang.String r1) {
            kotlin.n1 r0 = L(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 i(com.bxkj.student.v2.ui.face.FaceLiveV3Activity r0, java.lang.Integer r1) {
            kotlin.n1 r0 = M(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 j(com.bxkj.student.v2.ui.face.FaceLiveV3Activity r0) {
            kotlin.n1 r0 = R(r0)
            return r0
    }

    public static /* synthetic */ kotlin.n1 k(com.bxkj.student.v2.ui.face.FaceLiveV3Activity r0, java.lang.String r1) {
            kotlin.n1 r0 = N(r0, r1)
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.vm.face.FaceDetectVM l(com.bxkj.student.v2.ui.face.FaceLiveV3Activity r0) {
            com.bxkj.student.v2.vm.face.FaceDetectVM r0 = r0.U
            return r0
    }

    private static final kotlin.n1 m(com.bxkj.student.v2.ui.face.FaceLiveV3Activity r3, java.lang.String r4) {
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

    private final void t() {
            r1 = this;
            com.bxkj.base.v2.base.ProgressDialogFragment r0 = r1.X
            if (r0 == 0) goto L9
            if (r0 == 0) goto L9
            r0.dismiss()
        L9:
            return
    }

    public final void E(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentManager r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.W = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LifecycleOwner F() {
            r1 = this;
            androidx.lifecycle.LifecycleOwner r0 = r1.V
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
            androidx.fragment.app.FragmentManager r0 = r1.W
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "dialogFagmentManager"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.bxkj.base.v2.base.ProgressDialogFragment S() {
            r1 = this;
            com.bxkj.base.v2.base.ProgressDialogFragment r0 = r1.X
            return r0
    }

    public final void V(@org.jetbrains.annotations.Nullable com.bxkj.base.v2.base.ProgressDialogFragment r1) {
            r0 = this;
            r0.X = r1
            return
    }

    public native void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r1);

    protected void onDestroy() {
            r1 = this;
            r1.t()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.W(r1, r0)
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            r0.s(r1)
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
            r1.Q(r2)
        L12:
            return
    }

    public final void setLifecycleOwner(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.V = r2
            return
    }
}
