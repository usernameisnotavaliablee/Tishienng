package com.bxkj.student.v2.ui.dialog;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nNoticeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoticeDialog.kt\ncom/bxkj/student/v2/ui/dialog/NoticeDialog\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,105:1\n256#2,2:106\n256#2,2:108\n256#2,2:110\n256#2,2:112\n*S KotlinDebug\n*F\n+ 1 NoticeDialog.kt\ncom/bxkj/student/v2/ui/dialog/NoticeDialog\n*L\n41#1:106,2\n43#1:108,2\n46#1:110,2\n49#1:112,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class NoticeDialog extends com.bxkj.base.v2.base.BaseDialog<com.bxkj.student.databinding.DialogTipsBinding, com.bxkj.student.v2.vm.NoticeVM> {

    @org.jetbrains.annotations.NotNull
    private java.util.Map<java.lang.String, java.lang.Object> k;

    public NoticeDialog() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.k = r0
            return
    }

    public static /* synthetic */ kotlin.n1 L(com.bxkj.student.v2.ui.dialog.NoticeDialog r0) {
            kotlin.n1 r0 = N(r0)
            return r0
    }

    private static final kotlin.n1 N(com.bxkj.student.v2.ui.dialog.NoticeDialog r0) {
            r0.f()
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    public final void M() {
            r3 = this;
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.k
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.t(r1, r2)
            com.bxkj.base.v2.base.BaseViewModel r1 = r3.C()
            com.bxkj.student.v2.vm.NoticeVM r1 = (com.bxkj.student.v2.vm.NoticeVM) r1
            com.bxkj.student.v2.ui.dialog.e r2 = new com.bxkj.student.v2.ui.dialog.e
            r2.<init>(r3)
            r1.t(r0, r2)
            return
    }

    public final void O() {
            r8 = this;
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.k
            java.lang.String r2 = "appletId"
            java.lang.String r1 = r0.t(r1, r2)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r8.k
            java.lang.String r4 = "appletPath"
            java.lang.String r3 = r0.t(r3, r4)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r8.k
            java.lang.String r6 = "linkUrl"
            java.lang.String r5 = r0.t(r5, r6)
            boolean r1 = kotlin.text.u.M3(r1)
            if (r1 != 0) goto L3c
            boolean r1 = kotlin.text.u.M3(r3)
            if (r1 != 0) goto L3c
            com.bxkj.student.v2.common.utils.v$a r1 = com.bxkj.student.v2.common.utils.v.a
            android.content.Context r3 = r8.G()
            java.util.Map<java.lang.String, java.lang.Object> r5 = r8.k
            java.lang.String r2 = r0.t(r5, r2)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r8.k
            java.lang.String r0 = r0.t(r5, r4)
            r1.a(r3, r2, r0)
            goto L62
        L3c:
            boolean r1 = kotlin.text.u.M3(r5)
            if (r1 != 0) goto L62
            com.bxkj.student.v2.common.utils.h r1 = com.bxkj.student.v2.common.utils.h.a
            androidx.fragment.app.FragmentActivity r2 = r8.q()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Map<java.lang.String, java.lang.Object> r4 = r8.k
            java.lang.String r7 = "title"
            java.lang.String r0 = r0.t(r4, r7)
            java.lang.String r4 = "name"
            r3.put(r4, r0)
            r3.put(r6, r5)
            kotlin.n1 r0 = kotlin.n1.a
            r1.b(r2, r3)
        L62:
            r8.M()
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
            if (r0 == 0) goto L15
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L15
            r1 = 2131100584(0x7f0603a8, float:1.7813554E38)
            r0.setBackgroundDrawableResource(r1)
        L15:
            android.app.Dialog r0 = r2.getDialog()
            if (r0 == 0) goto L1f
            r1 = 0
            r0.setCanceledOnTouchOutside(r1)
        L1f:
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r6 = this;
            androidx.databinding.ViewDataBinding r0 = r6.K()
            com.bxkj.student.databinding.DialogTipsBinding r0 = (com.bxkj.student.databinding.DialogTipsBinding) r0
            r0.setDialog(r6)
            android.os.Bundle r0 = r6.getArguments()
            if (r0 == 0) goto L135
            java.lang.String r1 = "data"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L135
            android.os.Bundle r0 = r6.getArguments()
            if (r0 == 0) goto L135
            android.os.Parcelable r0 = r0.getParcelable(r1)
            com.bxkj.base.v2.data.ParcelableMap r0 = (com.bxkj.base.v2.data.ParcelableMap) r0
            if (r0 == 0) goto L135
            java.util.Map r0 = r0.a()
            r6.k = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "NoticeDialog="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.orhanobut.logger.j.d(r0, r2)
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.util.Map<java.lang.String, java.lang.Object> r2 = r6.k
            java.lang.String r3 = "title"
            java.lang.String r2 = r0.t(r2, r3)
            androidx.databinding.ViewDataBinding r3 = r6.K()
            com.bxkj.student.databinding.DialogTipsBinding r3 = (com.bxkj.student.databinding.DialogTipsBinding) r3
            android.widget.TextView r3 = r3.tvTitle
            r3.setText(r2)
            androidx.databinding.ViewDataBinding r3 = r6.K()
            com.bxkj.student.databinding.DialogTipsBinding r3 = (com.bxkj.student.databinding.DialogTipsBinding) r3
            android.widget.TextView r3 = r3.tvTitle
            java.lang.String r4 = "tvTitle"
            kotlin.jvm.internal.g0.o(r3, r4)
            boolean r4 = kotlin.text.u.M3(r2)
            r5 = 8
            if (r4 != 0) goto L6e
            r4 = 0
            goto L70
        L6e:
            r4 = 8
        L70:
            r3.setVisibility(r4)
            androidx.databinding.ViewDataBinding r3 = r6.K()
            com.bxkj.student.databinding.DialogTipsBinding r3 = (com.bxkj.student.databinding.DialogTipsBinding) r3
            android.view.View r3 = r3.divider
            java.lang.String r4 = "divider"
            kotlin.jvm.internal.g0.o(r3, r4)
            boolean r2 = kotlin.text.u.M3(r2)
            if (r2 != 0) goto L88
            r2 = 0
            goto L8a
        L88:
            r2 = 8
        L8a:
            r3.setVisibility(r2)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r6.k
            java.lang.String r3 = "des"
            java.lang.String r2 = r0.t(r2, r3)
            androidx.databinding.ViewDataBinding r3 = r6.K()
            com.bxkj.student.databinding.DialogTipsBinding r3 = (com.bxkj.student.databinding.DialogTipsBinding) r3
            android.widget.TextView r3 = r3.tvContent
            java.lang.String r4 = "tvContent"
            kotlin.jvm.internal.g0.o(r3, r4)
            boolean r4 = kotlin.text.u.M3(r2)
            if (r4 != 0) goto Laa
            r4 = 0
            goto Lac
        Laa:
            r4 = 8
        Lac:
            r3.setVisibility(r4)
            androidx.databinding.ViewDataBinding r3 = r6.K()
            com.bxkj.student.databinding.DialogTipsBinding r3 = (com.bxkj.student.databinding.DialogTipsBinding) r3
            android.widget.TextView r3 = r3.tvContent
            r3.setText(r2)
            androidx.databinding.ViewDataBinding r2 = r6.K()
            com.bxkj.student.databinding.DialogTipsBinding r2 = (com.bxkj.student.databinding.DialogTipsBinding) r2
            android.widget.ImageView r2 = r2.iv
            java.lang.String r3 = "iv"
            kotlin.jvm.internal.g0.o(r2, r3)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r6.k
            java.lang.String r4 = "type"
            int r3 = r0.k(r3, r4)
            if (r3 == 0) goto Ld3
            r3 = 1
            goto Ld4
        Ld3:
            r3 = 0
        Ld4:
            if (r3 == 0) goto Ld7
            goto Ld9
        Ld7:
            r1 = 8
        Ld9:
            r2.setVisibility(r1)
            android.content.Context r1 = r6.G()
            com.bumptech.glide.i r1 = com.bumptech.glide.b.D(r1)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r6.k
            java.lang.String r3 = "imageUrl"
            java.lang.String r2 = r0.t(r2, r3)
            com.bumptech.glide.h r1 = r1.M(r2)
            androidx.databinding.ViewDataBinding r2 = r6.K()
            com.bxkj.student.databinding.DialogTipsBinding r2 = (com.bxkj.student.databinding.DialogTipsBinding) r2
            android.widget.ImageView r2 = r2.iv
            r1.m1(r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.k
            java.lang.String r2 = "appletId"
            java.lang.String r1 = r0.t(r1, r2)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r6.k
            java.lang.String r3 = "appletPath"
            java.lang.String r2 = r0.t(r2, r3)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r6.k
            java.lang.String r4 = "linkUrl"
            java.lang.String r0 = r0.t(r3, r4)
            androidx.databinding.ViewDataBinding r3 = r6.K()
            com.bxkj.student.databinding.DialogTipsBinding r3 = (com.bxkj.student.databinding.DialogTipsBinding) r3
            androidx.appcompat.widget.AppCompatButton r3 = r3.bt
            int r1 = r1.length()
            if (r1 != 0) goto L130
            int r1 = r2.length()
            if (r1 != 0) goto L130
            int r0 = r0.length()
            if (r0 != 0) goto L130
            java.lang.String r0 = "我已知晓"
            goto L132
        L130:
            java.lang.String r0 = "立即查看"
        L132:
            r3.setText(r0)
        L135:
            return
    }
}
