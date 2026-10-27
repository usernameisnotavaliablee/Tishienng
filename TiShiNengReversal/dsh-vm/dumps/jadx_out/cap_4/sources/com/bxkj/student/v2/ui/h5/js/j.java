package com.bxkj.student.v2.ui.h5.js;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFaceJS.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceJS.kt\ncom/bxkj/student/v2/ui/h5/js/FaceJS\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j extends com.bxkj.student.v2.ui.h5.js.a {

    @org.jetbrains.annotations.NotNull
    private androidx.fragment.app.FragmentActivity h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFaceJS.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceJS.kt\ncom/bxkj/student/v2/ui/h5/js/FaceJS$faceTest$3$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
    public static final class a implements t.b.a {
        final /* synthetic */ com.bxkj.student.v2.ui.h5.js.j a;

        a(com.bxkj.student.v2.ui.h5.js.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // t.b.a
        public void a(int r3, android.content.Intent r4) {
                r2 = this;
                if (r4 == 0) goto L39
                r0 = -1
                r1 = 0
                if (r3 != r0) goto L7
                goto L8
            L7:
                r4 = r1
            L8:
                if (r4 == 0) goto L39
                java.lang.String r3 = "code"
                boolean r0 = r4.hasExtra(r3)
                if (r0 == 0) goto L13
                r1 = r4
            L13:
                if (r1 == 0) goto L39
                com.bxkj.student.v2.ui.h5.js.j r4 = r2.a
                r0 = 1
                int r3 = r1.getIntExtra(r3, r0)
                android.webkit.WebView r4 = r4.b()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "javascript:faceTestResult('"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = "')"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.loadUrl(r3)
            L39:
                return
        }
    }

    public j(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2, @org.jetbrains.annotations.NotNull android.webkit.WebView r3) {
            r1 = this;
            java.lang.String r0 = "mActivity"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "mWebView"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2, r3)
            r1.h = r2
            return
    }

    public static /* synthetic */ kotlin.n1 m(com.bxkj.student.v2.ui.h5.js.j r0) {
            kotlin.n1 r0 = w(r0)
            return r0
    }

    public static /* synthetic */ void n(com.bxkj.student.v2.ui.h5.js.j r0) {
            v(r0)
            return
    }

    public static /* synthetic */ void o(com.bxkj.student.v2.ui.h5.js.j r0, java.lang.String r1, java.lang.String r2) {
            s(r0, r1, r2)
            return
    }

    public static /* synthetic */ kotlin.n1 p(com.bxkj.student.v2.ui.h5.js.j r0) {
            kotlin.n1 r0 = x(r0)
            return r0
    }

    public static /* synthetic */ kotlin.n1 q(com.bxkj.student.v2.ui.h5.js.j r0, java.lang.String r1, java.lang.String r2) {
            kotlin.n1 r0 = t(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 r(java.lang.String r0, java.lang.String r1, com.bxkj.student.v2.ui.h5.js.j r2) {
            kotlin.n1 r0 = u(r0, r1, r2)
            return r0
    }

    private static final void s(com.bxkj.student.v2.ui.h5.js.j r3, java.lang.String r4, java.lang.String r5) {
            com.bxkj.student.v2.ui.face.FaceManger r0 = com.bxkj.student.v2.ui.face.FaceManger.a
            androidx.fragment.app.FragmentActivity r1 = r3.a()
            com.bxkj.student.v2.ui.h5.js.e r2 = new com.bxkj.student.v2.ui.h5.js.e
            r2.<init>(r3, r4, r5)
            r0.c(r1, r2)
            return
    }

    private static final kotlin.n1 t(com.bxkj.student.v2.ui.h5.js.j r2, java.lang.String r3, java.lang.String r4) {
            androidx.fragment.app.FragmentActivity r0 = r2.a()
            com.bxkj.student.v2.ui.h5.js.g r1 = new com.bxkj.student.v2.ui.h5.js.g
            r1.<init>(r3, r4, r2)
            java.lang.String r2 = "人脸采集"
            com.bxkj.base.v2.common.ext.t.p(r0, r2, r1)
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final kotlin.n1 u(java.lang.String r3, java.lang.String r4, com.bxkj.student.v2.ui.h5.js.j r5) {
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r0.a()
            r2 = 1
            r1.z0(r2)
            if (r3 == 0) goto L13
            com.bxkj.base.v2.data.b r1 = r0.a()
            r1.e0(r3)
        L13:
            if (r4 == 0) goto L1c
            com.bxkj.base.v2.data.b r3 = r0.a()
            r3.M0(r4)
        L1c:
            com.bxkj.student.v2.retrofit.e r3 = com.bxkj.student.v2.retrofit.e.a
            r3.b()
            androidx.fragment.app.FragmentActivity r3 = r5.a()
            android.content.Intent r4 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r5 = r5.a()
            java.lang.Class<com.bxkj.student.v2.ui.face.FaceCollectActivity> r0 = com.bxkj.student.v2.ui.face.FaceCollectActivity.class
            r4.<init>(r5, r0)
            r3.startActivity(r4)
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    private static final void v(com.bxkj.student.v2.ui.h5.js.j r3) {
            com.bxkj.student.v2.ui.face.FaceManger r0 = com.bxkj.student.v2.ui.face.FaceManger.a
            androidx.fragment.app.FragmentActivity r1 = r3.a()
            com.bxkj.student.v2.ui.h5.js.f r2 = new com.bxkj.student.v2.ui.h5.js.f
            r2.<init>(r3)
            r0.c(r1, r2)
            return
    }

    private static final kotlin.n1 w(com.bxkj.student.v2.ui.h5.js.j r2) {
            androidx.fragment.app.FragmentActivity r0 = r2.a()
            com.bxkj.student.v2.ui.h5.js.h r1 = new com.bxkj.student.v2.ui.h5.js.h
            r1.<init>(r2)
            java.lang.String r2 = "人脸验证"
            com.bxkj.base.v2.common.ext.t.p(r0, r2, r1)
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final kotlin.n1 x(com.bxkj.student.v2.ui.h5.js.j r4) {
            t.b r0 = new t.b
            androidx.fragment.app.FragmentActivity r1 = r4.a()
            r0.<init>(r1)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            androidx.fragment.app.FragmentActivity r2 = r4.a()
            java.lang.Class<com.bxkj.student.v2.ui.face.FaceCheckV2Activity> r3 = com.bxkj.student.v2.ui.face.FaceCheckV2Activity.class
            android.content.Intent r1 = r1.setClass(r2, r3)
            java.lang.String r2 = "setClass(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            t.b r0 = r0.startActivityForResult(r1)
            com.bxkj.student.v2.ui.h5.js.j$a r1 = new com.bxkj.student.v2.ui.h5.js.j$a
            r1.<init>(r4)
            r0.c(r1)
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    @Override // com.bxkj.student.v2.ui.h5.js.a, com.bxkj.base.v2.h5.h
    @org.jetbrains.annotations.NotNull
    public androidx.fragment.app.FragmentActivity a() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.h
            return r0
    }

    @android.webkit.JavascriptInterface
    public final void addUserFace(@org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
            r2 = this;
            androidx.fragment.app.FragmentActivity r0 = r2.a()
            com.bxkj.student.v2.ui.h5.js.i r1 = new com.bxkj.student.v2.ui.h5.js.i
            r1.<init>(r2, r3, r4)
            r0.runOnUiThread(r1)
            return
    }

    @Override // com.bxkj.student.v2.ui.h5.js.a, com.bxkj.base.v2.h5.h
    public void c(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.h = r2
            return
    }

    @android.webkit.JavascriptInterface
    public final void faceTest(@org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.Nullable java.lang.String r5) {
            r3 = this;
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r0.a()
            r2 = 1
            r1.z0(r2)
            if (r4 == 0) goto L13
            com.bxkj.base.v2.data.b r1 = r0.a()
            r1.e0(r4)
        L13:
            if (r5 == 0) goto L1c
            com.bxkj.base.v2.data.b r4 = r0.a()
            r4.M0(r5)
        L1c:
            com.bxkj.student.v2.retrofit.e r4 = com.bxkj.student.v2.retrofit.e.a
            r4.b()
            androidx.fragment.app.FragmentActivity r4 = r3.a()
            com.bxkj.student.v2.ui.h5.js.d r5 = new com.bxkj.student.v2.ui.h5.js.d
            r5.<init>(r3)
            r4.runOnUiThread(r5)
            return
    }
}
