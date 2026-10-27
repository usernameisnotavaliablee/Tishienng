package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class FaceOutOfCompassBinding extends androidx.databinding.ViewDataBinding {

    @androidx.annotation.NonNull
    public final android.widget.Button btnOne;

    @androidx.annotation.NonNull
    public final android.widget.Button btnTwo;

    @androidx.annotation.NonNull
    public final android.widget.LinearLayout layTwoButton;

    @androidx.annotation.NonNull
    public final android.view.View lineTitle;

    @androidx.databinding.Bindable
    protected com.bxkj.student.v2.ui.dialog.FaceOutDialog mDialog;

    @androidx.annotation.NonNull
    public final android.widget.TextView textMessage;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvTitle;

    protected FaceOutOfCompassBinding(java.lang.Object r1, android.view.View r2, int r3, android.widget.Button r4, android.widget.Button r5, android.widget.LinearLayout r6, android.view.View r7, android.widget.TextView r8, android.widget.TextView r9) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.btnOne = r4
            r0.btnTwo = r5
            r0.layTwoButton = r6
            r0.lineTitle = r7
            r0.textMessage = r8
            r0.tvTitle = r9
            return
    }

    public static com.bxkj.student.databinding.FaceOutOfCompassBinding bind(@androidx.annotation.NonNull android.view.View r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.FaceOutOfCompassBinding r1 = bind(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static com.bxkj.student.databinding.FaceOutOfCompassBinding bind(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = 2131493173(0x7f0c0135, float:1.8609819E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.bind(r2, r1, r0)
            com.bxkj.student.databinding.FaceOutOfCompassBinding r1 = (com.bxkj.student.databinding.FaceOutOfCompassBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.FaceOutOfCompassBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.FaceOutOfCompassBinding r1 = inflate(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.FaceOutOfCompassBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.FaceOutOfCompassBinding r1 = inflate(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.FaceOutOfCompassBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 2131493173(0x7f0c0135, float:1.8609819E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.inflateInternal(r1, r0, r2, r3, r4)
            com.bxkj.student.databinding.FaceOutOfCompassBinding r1 = (com.bxkj.student.databinding.FaceOutOfCompassBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.FaceOutOfCompassBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 0
            r1 = 0
            r2 = 2131493173(0x7f0c0135, float:1.8609819E38)
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.inflateInternal(r3, r2, r0, r1, r4)
            com.bxkj.student.databinding.FaceOutOfCompassBinding r3 = (com.bxkj.student.databinding.FaceOutOfCompassBinding) r3
            return r3
    }

    @androidx.annotation.Nullable
    public com.bxkj.student.v2.ui.dialog.FaceOutDialog getDialog() {
            r1 = this;
            com.bxkj.student.v2.ui.dialog.FaceOutDialog r0 = r1.mDialog
            return r0
    }

    public abstract void setDialog(@androidx.annotation.Nullable com.bxkj.student.v2.ui.dialog.FaceOutDialog r1);
}
