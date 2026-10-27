package com.bxkj.student.v2.ui.face;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class FaceManger {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.ui.face.FaceManger a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements t.b.a {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> a;

        a(kotlin.jvm.functions.Function0<kotlin.n1> r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // t.b.a
        public void a(int r1, android.content.Intent r2) {
                r0 = this;
                r2 = -1
                if (r1 != r2) goto L8
                kotlin.jvm.functions.Function0<kotlin.n1> r1 = r0.a
                r1.invoke()
            L8:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements com.baidu.idl.face.platform.listener.IInitCallback {
        final /* synthetic */ androidx.lifecycle.LifecycleOwner a;
        final /* synthetic */ android.content.Context b;

        b(androidx.lifecycle.LifecycleOwner r1, android.content.Context r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        public void initFailure(int r4, java.lang.String r5) {
                r3 = this;
                java.lang.String r0 = "s"
                kotlin.jvm.internal.g0.p(r5, r0)
                com.bxkj.student.v2.ui.face.FaceManger r0 = com.bxkj.student.v2.ui.face.FaceManger.a
                androidx.lifecycle.LifecycleOwner r1 = r3.a
                androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r1)
                android.content.Context r2 = r3.b
                r0.g(r1, r2, r4, r5)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "FaceSDKManager初始化失败i="
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = "s="
                r0.append(r4)
                r0.append(r5)
                java.lang.String r4 = r0.toString()
                r5 = 0
                java.lang.Object[] r5 = new java.lang.Object[r5]
                com.orhanobut.logger.j.e(r4, r5)
                return
        }

        public void initSuccess() {
                r2 = this;
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "FaceSDKManager初始化成功"
                com.orhanobut.logger.j.d(r1, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c implements com.baidu.idl.face.platform.listener.IInitCallback {
        final /* synthetic */ kotlinx.coroutines.r0 a;
        final /* synthetic */ android.content.Context b;

        c(kotlinx.coroutines.r0 r1, android.content.Context r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        public void initFailure(int r4, java.lang.String r5) {
                r3 = this;
                java.lang.String r0 = "s"
                kotlin.jvm.internal.g0.p(r5, r0)
                com.bxkj.student.v2.ui.face.FaceManger r0 = com.bxkj.student.v2.ui.face.FaceManger.a
                kotlinx.coroutines.r0 r1 = r3.a
                android.content.Context r2 = r3.b
                r0.g(r1, r2, r4, r5)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "FaceSDKManager初始化失败i="
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = "s="
                r0.append(r4)
                r0.append(r5)
                java.lang.String r4 = r0.toString()
                r5 = 0
                java.lang.Object[] r5 = new java.lang.Object[r5]
                com.orhanobut.logger.j.e(r4, r5)
                return
        }

        public void initSuccess() {
                r2 = this;
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "FaceSDKManager初始化成功"
                com.orhanobut.logger.j.d(r1, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d implements t.b.a {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> a;

        d(kotlin.jvm.functions.Function0<kotlin.n1> r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // t.b.a
        public void a(int r1, android.content.Intent r2) {
                r0 = this;
                r2 = -1
                if (r1 != r2) goto L8
                kotlin.jvm.functions.Function0<kotlin.n1> r1 = r0.a
                r1.invoke()
            L8:
                return
        }
    }

    static {
            com.bxkj.student.v2.ui.face.FaceManger r0 = new com.bxkj.student.v2.ui.face.FaceManger
            r0.<init>()
            com.bxkj.student.v2.ui.face.FaceManger.a = r0
            return
    }

    private FaceManger() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ kotlin.n1 a(androidx.fragment.app.FragmentActivity r0, int r1, java.lang.String r2, int r3, java.lang.String r4, com.bxkj.student.v2.common.data.PointData r5, kotlin.jvm.functions.Function0 r6) {
            kotlin.n1 r0 = i(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static /* synthetic */ kotlin.n1 b(int r0, androidx.fragment.app.FragmentActivity r1, java.lang.String r2, int r3, java.lang.String r4, com.bxkj.student.v2.common.data.PointData r5, kotlin.jvm.functions.Function0 r6) {
            kotlin.n1 r0 = j(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    private static final kotlin.n1 i(androidx.fragment.app.FragmentActivity r8, int r9, java.lang.String r10, int r11, java.lang.String r12, com.bxkj.student.v2.common.data.PointData r13, kotlin.jvm.functions.Function0 r14) {
            com.bxkj.student.v2.ui.face.e0 r0 = new com.bxkj.student.v2.ui.face.e0
            r2 = r8
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r8 = "人脸识别"
            com.bxkj.base.v2.common.ext.t.p(r2, r8, r0)
            kotlin.n1 r8 = kotlin.n1.a
            return r8
    }

    private static final kotlin.n1 j(int r2, androidx.fragment.app.FragmentActivity r3, java.lang.String r4, int r5, java.lang.String r6, com.bxkj.student.v2.common.data.PointData r7, kotlin.jvm.functions.Function0 r8) {
            r0 = 1
            if (r2 != r0) goto L6
            java.lang.Class<com.bxkj.student.v2.ui.face.FaceLiveV3Activity> r2 = com.bxkj.student.v2.ui.face.FaceLiveV3Activity.class
            goto L8
        L6:
            java.lang.Class<com.bxkj.student.v2.ui.face.FaceDetectV3Activity> r2 = com.bxkj.student.v2.ui.face.FaceDetectV3Activity.class
        L8:
            t.b r0 = new t.b
            r0.<init>(r3)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.Intent r2 = r1.setClass(r3, r2)
            java.lang.String r1 = "identify"
            android.content.Intent r2 = r2.putExtra(r1, r4)
            java.lang.String r4 = "runType"
            android.content.Intent r2 = r2.putExtra(r4, r5)
            java.lang.String r4 = "type"
            android.content.Intent r2 = r2.putExtra(r4, r6)
            java.lang.String r4 = "pointData"
            android.content.Intent r2 = r2.putExtra(r4, r7)
            java.lang.String r4 = "putExtra(...)"
            kotlin.jvm.internal.g0.o(r2, r4)
            t.b r2 = r0.startActivityForResult(r2)
            com.bxkj.student.v2.ui.face.FaceManger$d r4 = new com.bxkj.student.v2.ui.face.FaceManger$d
            r4.<init>(r8)
            r2.c(r4)
            r2 = 2130771987(0x7f010013, float:1.714708E38)
            r4 = 2130771986(0x7f010012, float:1.7147078E38)
            r3.overridePendingTransition(r2, r4)
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    public final void c(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r5) {
            r3 = this;
            java.lang.String r0 = "mActivity"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "agree"
            kotlin.jvm.internal.g0.p(r5, r0)
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r0 = r0.a()
            boolean r0 = r0.i()
            if (r0 == 0) goto L1a
            r5.invoke()
            return
        L1a:
            t.b r0 = new t.b
            r0.<init>(r4)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.Class<com.bxkj.student.v2.ui.face.FaceAgreementActivity> r2 = com.bxkj.student.v2.ui.face.FaceAgreementActivity.class
            android.content.Intent r4 = r1.setClass(r4, r2)
            java.lang.String r1 = "setClass(...)"
            kotlin.jvm.internal.g0.o(r4, r1)
            t.b r4 = r0.startActivityForResult(r4)
            com.bxkj.student.v2.ui.face.FaceManger$a r0 = new com.bxkj.student.v2.ui.face.FaceManger$a
            r0.<init>(r5)
            r4.c(r0)
            return
    }

    public final void d() {
            r3 = this;
            java.io.File r0 = new java.io.File
            com.bxkj.student.App$a r1 = com.bxkj.student.App.d
            com.bxkj.student.App r1 = r1.a()
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r1 = r1.getParent()
            java.lang.String r2 = "app_XIAOWEIFACEDETECTION-FACE-ANDROID_3"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 == 0) goto L32
            boolean r0 = r0.delete()
            if (r0 == 0) goto L2a
            java.lang.String r0 = "许可证文件删除成功"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.orhanobut.logger.j.e(r0, r1)
            return
        L2a:
            java.lang.String r0 = "许可证文件删除失败"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.orhanobut.logger.j.e(r0, r1)
            return
        L32:
            java.lang.String r0 = "许可证文件不存在"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.orhanobut.logger.j.e(r0, r1)
            return
    }

    public final void e(@org.jetbrains.annotations.NotNull android.content.Context r5, @org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r6) {
            r4 = this;
            java.lang.String r0 = "mContext"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "lifecycleOwner"
            kotlin.jvm.internal.g0.p(r6, r0)
            r4.d()
            com.baidu.idl.face.platform.FaceSDKManager r0 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            java.lang.String r1 = com.bxkj.student.run.app.face.a.a
            java.lang.String r2 = com.bxkj.student.run.app.face.a.b
            com.bxkj.student.v2.ui.face.FaceManger$b r3 = new com.bxkj.student.v2.ui.face.FaceManger$b
            r3.<init>(r6, r5)
            r0.initialize(r5, r1, r2, r3)
            return
    }

    public final void f(@org.jetbrains.annotations.NotNull android.content.Context r5, @org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r6) {
            r4 = this;
            java.lang.String r0 = "mContext"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "lifecycleScope"
            kotlin.jvm.internal.g0.p(r6, r0)
            r4.d()
            com.baidu.idl.face.platform.FaceSDKManager r0 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            java.lang.String r1 = com.bxkj.student.run.app.face.a.a
            java.lang.String r2 = com.bxkj.student.run.app.face.a.b
            com.bxkj.student.v2.ui.face.FaceManger$c r3 = new com.bxkj.student.v2.ui.face.FaceManger$c
            r3.<init>(r6, r5)
            r0.initialize(r5, r1, r2, r3)
            return
    }

    public final void g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r8, @org.jetbrains.annotations.NotNull android.content.Context r9, int r10, @org.jetbrains.annotations.NotNull java.lang.String r11) {
            r7 = this;
            java.lang.String r0 = "lifecycleScope"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "mContext"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "errorMsg"
            kotlin.jvm.internal.g0.p(r11, r0)
            kotlinx.coroutines.p2 r2 = kotlinx.coroutines.g1.e()
            com.bxkj.student.v2.ui.face.FaceManger$showFaceSdkInitFailureDialog$1 r4 = new com.bxkj.student.v2.ui.face.FaceManger$showFaceSdkInitFailureDialog$1
            r0 = 0
            r4.<init>(r9, r10, r11, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            r1 = r8
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void h(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r9, int r10, int r11, @org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.Nullable com.bxkj.student.v2.common.data.PointData r14, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r15) {
            r8 = this;
            java.lang.String r0 = "mActivity"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "faceType"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "identify"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "success"
            kotlin.jvm.internal.g0.p(r15, r0)
            com.bxkj.student.v2.ui.face.d0 r0 = new com.bxkj.student.v2.ui.face.d0
            r1 = r9
            r4 = r10
            r2 = r11
            r5 = r12
            r3 = r13
            r6 = r14
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r2 = r0
            r8.c(r9, r2)
            return
    }
}
