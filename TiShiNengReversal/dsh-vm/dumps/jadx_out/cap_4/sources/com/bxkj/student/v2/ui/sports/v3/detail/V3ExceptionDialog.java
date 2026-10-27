package com.bxkj.student.v2.ui.sports.v3.detail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3ExceptionDialog extends com.bxkj.base.v2.base.BaseDialog<com.bxkj.student.databinding.V3ExceptionDialogBinding, com.bxkj.student.v2.vm.sports.SportsVM> {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> k;

    /* renamed from: l, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.ItemForV3PassPointDialogBinding> f1450l;

    public V3ExceptionDialog() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.k = r0
            return
    }

    @org.jetbrains.annotations.Nullable
    public final com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.ItemForV3PassPointDialogBinding> L() {
            r1 = this;
            com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.ItemForV3PassPointDialogBinding> r0 = r1.f1450l
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> M() {
            r1 = this;
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r1.k
            return r0
    }

    public final void N(@org.jetbrains.annotations.Nullable com.bxkj.base.v2.base.BaseAdapter<java.util.Map<java.lang.String, java.lang.Object>, com.bxkj.student.databinding.ItemForV3PassPointDialogBinding> r1) {
            r0 = this;
            r0.f1450l = r1
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
            r0 = 2132017771(0x7f14026b, float:1.967383E38)
            r1.setStyle(r2, r0)
            return
    }

    public void onStart() {
            r7 = this;
            super.onStart()
            android.app.Dialog r0 = r7.getDialog()
            if (r0 == 0) goto L4c
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            androidx.fragment.app.FragmentActivity r2 = r7.q()
            android.view.WindowManager r2 = r2.getWindowManager()
            android.view.Display r2 = r2.getDefaultDisplay()
            r2.getMetrics(r1)
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L4c
            r2 = 2131100584(0x7f0603a8, float:1.7813554E38)
            r0.setBackgroundDrawableResource(r2)
            android.view.WindowManager$LayoutParams r2 = r0.getAttributes()
            java.lang.String r3 = "getAttributes(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            int r1 = r1.widthPixels
            double r3 = (double) r1
            r5 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r3 = r3 * r5
            int r1 = (int) r3
            r2.width = r1
            r1 = -2
            r2.height = r1
            r1 = 17
            r2.gravity = r1
            r0.setGravity(r1)
            r0.setAttributes(r2)
        L4c:
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r1 = this;
            androidx.databinding.ViewDataBinding r0 = r1.K()
            com.bxkj.student.databinding.V3ExceptionDialogBinding r0 = (com.bxkj.student.databinding.V3ExceptionDialogBinding) r0
            r0.setDialog(r1)
            return
    }
}
