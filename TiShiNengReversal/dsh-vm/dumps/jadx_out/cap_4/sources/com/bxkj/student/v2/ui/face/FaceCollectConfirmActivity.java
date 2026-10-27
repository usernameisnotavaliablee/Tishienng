package com.bxkj.student.v2.ui.face;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFaceCollectConfirmActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceCollectConfirmActivity.kt\ncom/bxkj/student/v2/ui/face/FaceCollectConfirmActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1#2:43\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class FaceCollectConfirmActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.V3FaceCollectConfirmBinding, com.bxkj.student.v2.vm.face.FaceCollectVM> {
    public FaceCollectConfirmActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final kotlin.n1 M(com.bxkj.student.v2.ui.face.FaceCollectConfirmActivity r4) {
            r0 = 2
            r1 = 0
            java.lang.String r2 = "人脸采集成功"
            r3 = 0
            com.bxkj.base.v2.common.ext.ContextExtKt.s(r4, r2, r3, r0, r1)
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.student.v2.ui.face.FaceCollectActivity> r1 = com.bxkj.student.v2.ui.face.FaceCollectActivity.class
            r0.i(r1)
            r4.finish()
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.face.FaceCollectConfirmActivity r0) {
            kotlin.n1 r0 = M(r0)
            return r0
    }

    public final void L() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            if (r0 == 0) goto L2d
            java.lang.String r1 = "avatar"
            boolean r2 = r0.hasExtra(r1)
            if (r2 == 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L2d
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.face.FaceCollectVM r0 = (com.bxkj.student.v2.vm.face.FaceCollectVM) r0
            java.io.File r2 = new java.io.File
            android.content.Intent r3 = r4.getIntent()
            java.lang.String r1 = r3.getStringExtra(r1)
            r2.<init>(r1)
            com.bxkj.student.v2.ui.face.o r1 = new com.bxkj.student.v2.ui.face.o
            r1.<init>(r4)
            r0.t(r2, r1)
        L2d:
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r0 = this;
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r4 = this;
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.V3FaceCollectConfirmBinding r0 = (com.bxkj.student.databinding.V3FaceCollectConfirmBinding) r0
            r0.setActivity(r4)
            android.content.Intent r0 = r4.getIntent()
            if (r0 == 0) goto L6d
            java.lang.String r1 = "avatar"
            boolean r2 = r0.hasExtra(r1)
            if (r2 == 0) goto L18
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 == 0) goto L6d
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "intent.getStringExtra(\"avatar\")="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.orhanobut.logger.j.d(r0, r2)
            android.content.Context r0 = r4.G()
            com.bumptech.glide.i r0 = com.bumptech.glide.b.D(r0)
            java.io.File r2 = new java.io.File
            android.content.Intent r3 = r4.getIntent()
            java.lang.String r1 = r3.getStringExtra(r1)
            r2.<init>(r1)
            com.bumptech.glide.h r0 = r0.J(r2)
            r1 = 1
            com.bumptech.glide.request.a r0 = r0.I0(r1)
            com.bumptech.glide.h r0 = (com.bumptech.glide.h) r0
            com.bumptech.glide.load.engine.j r1 = com.bumptech.glide.load.engine.j.b
            com.bumptech.glide.request.a r0 = r0.t(r1)
            com.bumptech.glide.h r0 = (com.bumptech.glide.h) r0
            androidx.databinding.ViewDataBinding r1 = r4.K()
            com.bxkj.student.databinding.V3FaceCollectConfirmBinding r1 = (com.bxkj.student.databinding.V3FaceCollectConfirmBinding) r1
            android.widget.ImageView r1 = r1.ivFace
            r0.m1(r1)
        L6d:
            return
    }
}
