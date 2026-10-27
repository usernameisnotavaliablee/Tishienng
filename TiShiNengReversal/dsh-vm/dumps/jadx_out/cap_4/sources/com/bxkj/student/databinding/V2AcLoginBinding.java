package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class V2AcLoginBinding extends androidx.databinding.ViewDataBinding {

    @androidx.annotation.NonNull
    public final com.google.android.material.button.MaterialButton btAuthCenter;

    @androidx.annotation.NonNull
    public final com.google.android.material.button.MaterialButton btLogin;

    @androidx.annotation.NonNull
    public final android.widget.CheckBox cbAgree;

    @androidx.annotation.NonNull
    public final android.widget.EditText etAccount;

    @androidx.annotation.NonNull
    public final android.widget.EditText etPassword;

    @androidx.annotation.NonNull
    public final android.widget.ImageView ivLogo;

    @androidx.annotation.NonNull
    public final android.widget.ImageView ivPhone;

    @androidx.annotation.NonNull
    public final android.widget.ImageView ivQq;

    @androidx.annotation.NonNull
    public final android.widget.ImageView ivWechat;

    @androidx.annotation.NonNull
    public final android.widget.LinearLayout llAccount;

    @androidx.annotation.NonNull
    public final android.widget.LinearLayout llAgree;

    @androidx.annotation.NonNull
    public final android.widget.LinearLayout llPassword;

    @androidx.databinding.Bindable
    protected com.bxkj.student.v2.ui.LoginActivity mActivity;

    @androidx.databinding.Bindable
    protected com.bxkj.base.v2.data.b mLoginInUser;

    @androidx.databinding.Bindable
    protected com.bxkj.student.v2.vm.LoginViewModel mLoginViewModel;

    @androidx.databinding.Bindable
    protected java.lang.String mVersion;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvAgree;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvFindPassword;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvHelp;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvLoginHint;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvOtherLogin;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvSchoolName;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvSwitchSchool;

    protected V2AcLoginBinding(java.lang.Object r1, android.view.View r2, int r3, com.google.android.material.button.MaterialButton r4, com.google.android.material.button.MaterialButton r5, android.widget.CheckBox r6, android.widget.EditText r7, android.widget.EditText r8, android.widget.ImageView r9, android.widget.ImageView r10, android.widget.ImageView r11, android.widget.ImageView r12, android.widget.LinearLayout r13, android.widget.LinearLayout r14, android.widget.LinearLayout r15, android.widget.TextView r16, android.widget.TextView r17, android.widget.TextView r18, android.widget.TextView r19, android.widget.TextView r20, android.widget.TextView r21, android.widget.TextView r22) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.btAuthCenter = r4
            r0.btLogin = r5
            r0.cbAgree = r6
            r0.etAccount = r7
            r0.etPassword = r8
            r0.ivLogo = r9
            r0.ivPhone = r10
            r0.ivQq = r11
            r0.ivWechat = r12
            r0.llAccount = r13
            r0.llAgree = r14
            r0.llPassword = r15
            r1 = r16
            r0.tvAgree = r1
            r1 = r17
            r0.tvFindPassword = r1
            r1 = r18
            r0.tvHelp = r1
            r1 = r19
            r0.tvLoginHint = r1
            r1 = r20
            r0.tvOtherLogin = r1
            r1 = r21
            r0.tvSchoolName = r1
            r1 = r22
            r0.tvSwitchSchool = r1
            return
    }

    public static com.bxkj.student.databinding.V2AcLoginBinding bind(@androidx.annotation.NonNull android.view.View r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.V2AcLoginBinding r1 = bind(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static com.bxkj.student.databinding.V2AcLoginBinding bind(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = 2131493703(0x7f0c0347, float:1.8610894E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.bind(r2, r1, r0)
            com.bxkj.student.databinding.V2AcLoginBinding r1 = (com.bxkj.student.databinding.V2AcLoginBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.V2AcLoginBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.V2AcLoginBinding r1 = inflate(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.V2AcLoginBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.V2AcLoginBinding r1 = inflate(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.V2AcLoginBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 2131493703(0x7f0c0347, float:1.8610894E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.inflateInternal(r1, r0, r2, r3, r4)
            com.bxkj.student.databinding.V2AcLoginBinding r1 = (com.bxkj.student.databinding.V2AcLoginBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.V2AcLoginBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 0
            r1 = 0
            r2 = 2131493703(0x7f0c0347, float:1.8610894E38)
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.inflateInternal(r3, r2, r0, r1, r4)
            com.bxkj.student.databinding.V2AcLoginBinding r3 = (com.bxkj.student.databinding.V2AcLoginBinding) r3
            return r3
    }

    @androidx.annotation.Nullable
    public com.bxkj.student.v2.ui.LoginActivity getActivity() {
            r1 = this;
            com.bxkj.student.v2.ui.LoginActivity r0 = r1.mActivity
            return r0
    }

    @androidx.annotation.Nullable
    public com.bxkj.base.v2.data.b getLoginInUser() {
            r1 = this;
            com.bxkj.base.v2.data.b r0 = r1.mLoginInUser
            return r0
    }

    @androidx.annotation.Nullable
    public com.bxkj.student.v2.vm.LoginViewModel getLoginViewModel() {
            r1 = this;
            com.bxkj.student.v2.vm.LoginViewModel r0 = r1.mLoginViewModel
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = r1.mVersion
            return r0
    }

    public abstract void setActivity(@androidx.annotation.Nullable com.bxkj.student.v2.ui.LoginActivity r1);

    public abstract void setLoginInUser(@androidx.annotation.Nullable com.bxkj.base.v2.data.b r1);

    public abstract void setLoginViewModel(@androidx.annotation.Nullable com.bxkj.student.v2.vm.LoginViewModel r1);

    public abstract void setVersion(@androidx.annotation.Nullable java.lang.String r1);
}
