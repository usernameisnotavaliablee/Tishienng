package com.bxkj.base.v2.common.ext;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nContextExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextExt.kt\ncom/bxkj/base/v2/common/ext/ContextExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class ContextExtKt {

    @org.jetbrains.annotations.Nullable
    private static android.widget.Toast a;

    static {
            return
    }

    public ContextExtKt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static /* synthetic */ void a(kotlin.jvm.functions.Function1 r0, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            i(r0, r1)
            return
    }

    public static /* synthetic */ void b(kotlin.jvm.functions.Function1 r0, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            j(r0, r1)
            return
    }

    public static /* synthetic */ void c(kotlin.jvm.functions.Function1 r0, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1, android.view.View r2) {
            l(r0, r1, r2)
            return
    }

    public static /* synthetic */ void d(kotlin.jvm.functions.Function1 r0, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1, android.view.View r2) {
            p(r0, r1, r2)
            return
    }

    public static final /* synthetic */ android.widget.Toast e() {
            android.widget.Toast r0 = com.bxkj.base.v2.common.ext.ContextExtKt.a
            return r0
    }

    public static final /* synthetic */ void f(android.widget.Toast r0) {
            com.bxkj.base.v2.common.ext.ContextExtKt.a = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final cn.bluemobi.dylan.base.view.iOSTwoButtonDialog g(@org.jetbrains.annotations.NotNull android.content.Context r3, @org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.CharSequence r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super cn.bluemobi.dylan.base.view.iOSTwoButtonDialog, kotlin.n1> r6, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super cn.bluemobi.dylan.base.view.iOSTwoButtonDialog, kotlin.n1> r7, @org.jetbrains.annotations.Nullable java.lang.CharSequence r8, @org.jetbrains.annotations.Nullable java.lang.CharSequence r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "confirm"
            kotlin.jvm.internal.g0.p(r6, r0)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            r0.<init>(r3)
            boolean r1 = r3 instanceof android.app.Activity
            if (r1 == 0) goto L58
            r1 = r3
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r1.isFinishing()
            if (r2 != 0) goto L58
            boolean r1 = r1.isDestroyed()
            if (r1 != 0) goto L58
            r0.setTitle(r4)
            r0.setMessage(r5)
            r0.setLeftButtonText(r8)
            r0.setRightButtonText(r9)
            com.bxkj.base.v2.common.ext.c r4 = new com.bxkj.base.v2.common.ext.c
            r4.<init>(r7, r0)
            r0.setLeftButtonOnClickListener(r4)
            com.bxkj.base.v2.common.ext.d r4 = new com.bxkj.base.v2.common.ext.d
            r4.<init>(r6, r0)
            r0.setRightButtonOnClickListener(r4)
            r0.show()
            boolean r4 = r3 instanceof androidx.activity.ComponentActivity
            if (r4 == 0) goto L58
            androidx.activity.ComponentActivity r3 = (androidx.activity.ComponentActivity) r3
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            com.bxkj.base.v2.common.ext.ContextExtKt$showAlertConfirmDialog$2 r4 = new com.bxkj.base.v2.common.ext.ContextExtKt$showAlertConfirmDialog$2
            r4.<init>(r0)
            r3.addObserver(r4)
        L58:
            return r0
    }

    public static /* synthetic */ cn.bluemobi.dylan.base.view.iOSTwoButtonDialog h(android.content.Context r0, java.lang.String r1, java.lang.CharSequence r2, kotlin.jvm.functions.Function1 r3, kotlin.jvm.functions.Function1 r4, java.lang.CharSequence r5, java.lang.CharSequence r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            if (r8 == 0) goto L6
            java.lang.String r1 = "提示"
        L6:
            r8 = r7 & 8
            if (r8 == 0) goto Lb
            r4 = 0
        Lb:
            r8 = r7 & 16
            if (r8 == 0) goto L11
            java.lang.String r5 = "取消"
        L11:
            r7 = r7 & 32
            if (r7 == 0) goto L17
            java.lang.String r6 = "确定"
        L17:
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            r2 = r0
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = g(r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    private static final void i(kotlin.jvm.functions.Function1 r0, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            if (r0 == 0) goto L5
            r0.invoke(r1)
        L5:
            return
    }

    private static final void j(kotlin.jvm.functions.Function1 r0, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            r0.invoke(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final cn.bluemobi.dylan.base.view.iOSOneButtonDialog k(@org.jetbrains.annotations.NotNull android.content.Context r3, @org.jetbrains.annotations.NotNull java.lang.CharSequence r4, int r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super cn.bluemobi.dylan.base.view.iOSOneButtonDialog, kotlin.n1> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "title"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "click"
            kotlin.jvm.internal.g0.p(r6, r0)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            r0.<init>(r3)
            boolean r1 = r3 instanceof android.app.Activity
            if (r1 == 0) goto L4b
            r1 = r3
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r1.isFinishing()
            if (r2 != 0) goto L4b
            boolean r1 = r1.isDestroyed()
            if (r1 != 0) goto L4b
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r0.setCenterCustomView(r5)
            com.bxkj.base.v2.common.ext.a r1 = new com.bxkj.base.v2.common.ext.a
            r1.<init>(r6, r0)
            r5.setButtonOnClickListener(r1)
            r0.setTitle(r4)
            r0.show()
            boolean r4 = r3 instanceof androidx.activity.ComponentActivity
            if (r4 == 0) goto L4b
            androidx.activity.ComponentActivity r3 = (androidx.activity.ComponentActivity) r3
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            com.bxkj.base.v2.common.ext.ContextExtKt$showAlertCustomDialog$2 r4 = new com.bxkj.base.v2.common.ext.ContextExtKt$showAlertCustomDialog$2
            r4.<init>(r0)
            r3.addObserver(r4)
        L4b:
            return r0
    }

    private static final void l(kotlin.jvm.functions.Function1 r0, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1, android.view.View r2) {
            r0.invoke(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final cn.bluemobi.dylan.base.view.iOSOneButtonDialog m(@org.jetbrains.annotations.NotNull android.content.Context r3, @org.jetbrains.annotations.NotNull java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.g0.p(r4, r0)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            r0.<init>(r3)
            boolean r1 = r3 instanceof android.app.Activity
            if (r1 == 0) goto L3a
            r1 = r3
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r1.isFinishing()
            if (r2 != 0) goto L3a
            boolean r1 = r1.isDestroyed()
            if (r1 != 0) goto L3a
            r0.setMessage(r4)
            r0.show()
            boolean r4 = r3 instanceof androidx.activity.ComponentActivity
            if (r4 == 0) goto L3a
            androidx.activity.ComponentActivity r3 = (androidx.activity.ComponentActivity) r3
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            com.bxkj.base.v2.common.ext.ContextExtKt$showAlertDialog$2 r4 = new com.bxkj.base.v2.common.ext.ContextExtKt$showAlertDialog$2
            r4.<init>(r0)
            r3.addObserver(r4)
        L3a:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final cn.bluemobi.dylan.base.view.iOSOneButtonDialog n(@org.jetbrains.annotations.NotNull android.content.Context r3, @org.jetbrains.annotations.NotNull java.lang.CharSequence r4, @org.jetbrains.annotations.NotNull java.lang.CharSequence r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "title"
            kotlin.jvm.internal.g0.p(r5, r0)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            r0.<init>(r3)
            boolean r1 = r3 instanceof android.app.Activity
            if (r1 == 0) goto L42
            r1 = r3
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r1.isFinishing()
            if (r2 != 0) goto L42
            boolean r1 = r1.isDestroyed()
            if (r1 != 0) goto L42
            r0.setTitle(r5)
            r0.setMessage(r4)
            r0.show()
            boolean r4 = r3 instanceof androidx.activity.ComponentActivity
            if (r4 == 0) goto L42
            androidx.activity.ComponentActivity r3 = (androidx.activity.ComponentActivity) r3
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            com.bxkj.base.v2.common.ext.ContextExtKt$showAlertDialog$4 r4 = new com.bxkj.base.v2.common.ext.ContextExtKt$showAlertDialog$4
            r4.<init>(r0)
            r3.addObserver(r4)
        L42:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final cn.bluemobi.dylan.base.view.iOSOneButtonDialog o(@org.jetbrains.annotations.NotNull android.content.Context r3, @org.jetbrains.annotations.NotNull java.lang.CharSequence r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super cn.bluemobi.dylan.base.view.iOSOneButtonDialog, kotlin.n1> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "click"
            kotlin.jvm.internal.g0.p(r5, r0)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            r0.<init>(r3)
            boolean r1 = r3 instanceof android.app.Activity
            if (r1 == 0) goto L49
            r1 = r3
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r1.isFinishing()
            if (r2 != 0) goto L49
            boolean r1 = r1.isDestroyed()
            if (r1 != 0) goto L49
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r0.setMessage(r4)
            com.bxkj.base.v2.common.ext.b r1 = new com.bxkj.base.v2.common.ext.b
            r1.<init>(r5, r0)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r4.setButtonOnClickListener(r1)
            r4.show()
            boolean r4 = r3 instanceof androidx.activity.ComponentActivity
            if (r4 == 0) goto L49
            androidx.activity.ComponentActivity r3 = (androidx.activity.ComponentActivity) r3
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            com.bxkj.base.v2.common.ext.ContextExtKt$showAlertDialog$7 r4 = new com.bxkj.base.v2.common.ext.ContextExtKt$showAlertDialog$7
            r4.<init>(r0)
            r3.addObserver(r4)
        L49:
            return r0
    }

    private static final void p(kotlin.jvm.functions.Function1 r0, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1, android.view.View r2) {
            r0.invoke(r1)
            return
    }

    public static final void q(@org.jetbrains.annotations.NotNull android.content.Context r4, @org.jetbrains.annotations.NotNull java.lang.CharSequence r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "errorMsg"
            kotlin.jvm.internal.g0.p(r5, r0)
            android.widget.Toast r0 = new android.widget.Toast
            com.bxkj.base.BaseApp r1 = com.bxkj.base.BaseApp.c()
            r0.<init>(r1)
            int r1 = com.bxkj.base.R.layout.toast_ok
            r2 = 0
            android.view.View r4 = android.view.View.inflate(r4, r1, r2)
            int r1 = com.bxkj.base.R.id.tv_msg
            android.view.View r1 = r4.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r2 = com.bxkj.base.R.id.iv_hint
            android.view.View r2 = r4.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            int r3 = com.bxkj.base.R.mipmap.toast_n
            r2.setImageResource(r3)
            r1.setText(r5)
            r0.setView(r4)
            r4 = 17
            r5 = 0
            r0.setGravity(r4, r5, r5)
            r0.setDuration(r5)
            r0.show()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final android.widget.Toast r(@org.jetbrains.annotations.NotNull android.content.Context r4, @org.jetbrains.annotations.NotNull java.lang.CharSequence r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "msg"
            kotlin.jvm.internal.g0.p(r5, r0)
            android.widget.Toast r0 = new android.widget.Toast
            com.bxkj.base.BaseApp r1 = com.bxkj.base.BaseApp.c()
            r0.<init>(r1)
            r1 = 17
            r2 = 0
            r0.setGravity(r1, r2, r2)
            int r1 = com.bxkj.base.R.layout.toast_ok
            r2 = 0
            android.view.View r1 = android.view.View.inflate(r4, r1, r2)
            r0.setView(r1)
            if (r1 == 0) goto L2e
            int r3 = com.bxkj.base.R.id.tv_msg
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L2f
        L2e:
            r1 = r2
        L2f:
            if (r1 == 0) goto L34
            r1.setText(r5)
        L34:
            r0.setDuration(r6)
            boolean r5 = r4 instanceof android.app.Activity
            if (r5 == 0) goto L4b
            r5 = r4
            android.app.Activity r5 = (android.app.Activity) r5
            boolean r6 = r5.isFinishing()
            if (r6 != 0) goto L4b
            boolean r5 = r5.isDestroyed()
            if (r5 != 0) goto L4b
            goto L4c
        L4b:
            r4 = r2
        L4c:
            if (r4 == 0) goto L51
            r0.show()
        L51:
            return r0
    }

    public static /* synthetic */ android.widget.Toast s(android.content.Context r0, java.lang.CharSequence r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 1
        L5:
            android.widget.Toast r0 = r(r0, r1, r2)
            return r0
    }

    public static final void t(@org.jetbrains.annotations.NotNull android.content.Context r4, @org.jetbrains.annotations.NotNull java.lang.CharSequence r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.g0.p(r5, r0)
            android.widget.Toast r0 = com.bxkj.base.v2.common.ext.ContextExtKt.a
            r1 = 0
            if (r0 != 0) goto L35
            com.bxkj.base.BaseApp r0 = com.bxkj.base.BaseApp.c()
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r5, r2)
            r3 = 17
            r0.setGravity(r3, r2, r2)
            boolean r2 = r4 instanceof androidx.activity.ComponentActivity
            if (r2 == 0) goto L23
            r2 = r0
            goto L24
        L23:
            r2 = r1
        L24:
            if (r2 == 0) goto L35
            r2 = r4
            androidx.activity.ComponentActivity r2 = (androidx.activity.ComponentActivity) r2
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            com.bxkj.base.v2.common.ext.ContextExtKt$showToast$1$2$1 r3 = new com.bxkj.base.v2.common.ext.ContextExtKt$showToast$1$2$1
            r3.<init>()
            r2.addObserver(r3)
        L35:
            com.bxkj.base.v2.common.ext.ContextExtKt.a = r0
            r0.setText(r5)
            boolean r5 = r4 instanceof android.app.Activity
            if (r5 == 0) goto L4d
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r5 = r4.isFinishing()
            if (r5 != 0) goto L4d
            boolean r4 = r4.isDestroyed()
            if (r4 != 0) goto L4d
            r1 = r0
        L4d:
            if (r1 == 0) goto L52
            r1.show()
        L52:
            return
    }
}
