package com.bxkj.student.v2.ui.face;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.face.FaceManger$showFaceSdkInitFailureDialog$1", f = "FaceManger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class FaceManger$showFaceSdkInitFailureDialog$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    int a;
    final /* synthetic */ android.content.Context b;
    final /* synthetic */ int c;
    final /* synthetic */ java.lang.String d;


    FaceManger$showFaceSdkInitFailureDialog$1(android.content.Context r1, int r2, java.lang.String r3, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.face.FaceManger$showFaceSdkInitFailureDialog$1> r4) {
            r0 = this;
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public static /* synthetic */ void f(androidx.appcompat.app.AlertDialog r0, android.view.View r1) {
            i(r0, r1)
            return
    }

    private static final void i(androidx.appcompat.app.AlertDialog r0, android.view.View r1) {
            r0.dismiss()
            return
    }

    public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r4, kotlin.coroutines.e<?> r5) {
            r3 = this;
            com.bxkj.student.v2.ui.face.FaceManger$showFaceSdkInitFailureDialog$1 r4 = new com.bxkj.student.v2.ui.face.FaceManger$showFaceSdkInitFailureDialog$1
            android.content.Context r0 = r3.b
            int r1 = r3.c
            java.lang.String r2 = r3.d
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
            com.bxkj.student.v2.ui.face.FaceManger$showFaceSdkInitFailureDialog$1 r1 = (com.bxkj.student.v2.ui.face.FaceManger$showFaceSdkInitFailureDialog$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            kotlin.coroutines.intrinsics.a.l()
            int r0 = r6.a
            if (r0 != 0) goto Lb7
            kotlin.g0.n(r7)
            android.content.Context r7 = r6.b
            boolean r0 = r7 instanceof android.app.Activity
            if (r0 == 0) goto Lb4
            android.app.Activity r7 = (android.app.Activity) r7
            boolean r7 = r7.isFinishing()
            if (r7 != 0) goto Lb4
            android.content.Context r7 = r6.b
            android.app.Activity r7 = (android.app.Activity) r7
            boolean r7 = r7.isDestroyed()
            if (r7 == 0) goto L24
            goto Lb4
        L24:
            androidx.appcompat.app.AlertDialog$Builder r7 = new androidx.appcompat.app.AlertDialog$Builder
            android.content.Context r0 = r6.b
            r7.<init>(r0)
            android.content.Context r0 = r6.b
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.LayoutInflater r0 = r0.getLayoutInflater()
            java.lang.String r1 = "getLayoutInflater(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r1 = 2131493149(0x7f0c011d, float:1.860977E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            r1 = 2131298982(0x7f090aa6, float:1.8215953E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r2 = r6.c
            java.lang.String r3 = r6.d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "错误码：【"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = "】\n错误信息：【"
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = "】"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.setText(r2)
            r1 = 2131296665(0x7f090199, float:1.8211253E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            androidx.appcompat.app.AlertDialog$Builder r7 = r7.setView(r0)
            androidx.appcompat.app.AlertDialog r7 = r7.create()
            java.lang.String r0 = "create(...)"
            kotlin.jvm.internal.g0.o(r7, r0)
            com.bxkj.student.v2.ui.face.f0 r0 = new com.bxkj.student.v2.ui.face.f0
            r0.<init>(r7)
            r1.setOnClickListener(r0)
            r7.show()
            android.view.Window r0 = r7.getWindow()
            if (r0 == 0) goto L9b
            r1 = 17170445(0x106000d, float:2.461195E-38)
            r0.setBackgroundDrawableResource(r1)
        L9b:
            android.content.Context r0 = r6.b
            boolean r1 = r0 instanceof androidx.core.app.ComponentActivity
            if (r1 == 0) goto Lb1
            androidx.core.app.ComponentActivity r0 = (androidx.core.app.ComponentActivity) r0
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            com.bxkj.student.v2.ui.face.FaceManger$showFaceSdkInitFailureDialog$1$2 r1 = new com.bxkj.student.v2.ui.face.FaceManger$showFaceSdkInitFailureDialog$1$2
            android.content.Context r2 = r6.b
            r1.<init>(r7, r2)
            r0.addObserver(r1)
        Lb1:
            kotlin.n1 r7 = kotlin.n1.a
            return r7
        Lb4:
            kotlin.n1 r7 = kotlin.n1.a
            return r7
        Lb7:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
    }
}
