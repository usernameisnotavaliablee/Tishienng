package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class V3ExceptionDialogBinding extends androidx.databinding.ViewDataBinding {

    @androidx.databinding.Bindable
    protected com.bxkj.student.v2.ui.sports.v3.detail.V3ExceptionDialog mDialog;

    @androidx.annotation.NonNull
    public final androidx.cardview.widget.CardView rlThreetwoone;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvMsg;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvTitleHint;

    protected V3ExceptionDialogBinding(java.lang.Object r1, android.view.View r2, int r3, androidx.cardview.widget.CardView r4, android.widget.TextView r5, android.widget.TextView r6) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.rlThreetwoone = r4
            r0.tvMsg = r5
            r0.tvTitleHint = r6
            return
    }

    public static com.bxkj.student.databinding.V3ExceptionDialogBinding bind(@androidx.annotation.NonNull android.view.View r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.V3ExceptionDialogBinding r1 = bind(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static com.bxkj.student.databinding.V3ExceptionDialogBinding bind(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = 2131493726(0x7f0c035e, float:1.861094E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.bind(r2, r1, r0)
            com.bxkj.student.databinding.V3ExceptionDialogBinding r1 = (com.bxkj.student.databinding.V3ExceptionDialogBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.V3ExceptionDialogBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.V3ExceptionDialogBinding r1 = inflate(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.V3ExceptionDialogBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.V3ExceptionDialogBinding r1 = inflate(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.V3ExceptionDialogBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 2131493726(0x7f0c035e, float:1.861094E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.inflateInternal(r1, r0, r2, r3, r4)
            com.bxkj.student.databinding.V3ExceptionDialogBinding r1 = (com.bxkj.student.databinding.V3ExceptionDialogBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.V3ExceptionDialogBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 0
            r1 = 0
            r2 = 2131493726(0x7f0c035e, float:1.861094E38)
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.inflateInternal(r3, r2, r0, r1, r4)
            com.bxkj.student.databinding.V3ExceptionDialogBinding r3 = (com.bxkj.student.databinding.V3ExceptionDialogBinding) r3
            return r3
    }

    @androidx.annotation.Nullable
    public com.bxkj.student.v2.ui.sports.v3.detail.V3ExceptionDialog getDialog() {
            r1 = this;
            com.bxkj.student.v2.ui.sports.v3.detail.V3ExceptionDialog r0 = r1.mDialog
            return r0
    }

    public abstract void setDialog(@androidx.annotation.Nullable com.bxkj.student.v2.ui.sports.v3.detail.V3ExceptionDialog r1);
}
