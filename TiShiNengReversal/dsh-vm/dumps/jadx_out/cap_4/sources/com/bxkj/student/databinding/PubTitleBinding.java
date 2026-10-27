package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class PubTitleBinding extends androidx.databinding.ViewDataBinding {

    @androidx.annotation.NonNull
    public final androidx.appcompat.widget.AppCompatImageButton ibBack;

    @androidx.annotation.NonNull
    public final androidx.appcompat.widget.AppCompatImageButton ibRight;

    @androidx.annotation.NonNull
    public final androidx.constraintlayout.widget.ConstraintLayout llTitle;

    @androidx.databinding.Bindable
    protected androidx.appcompat.app.AppCompatActivity mActivity;

    @androidx.databinding.Bindable
    protected java.lang.Boolean mIsHideBack;

    @androidx.databinding.Bindable
    protected java.lang.String mTitle;

    @androidx.annotation.NonNull
    public final com.bxkj.base.view.MarqueeTextView tvTitle;

    protected PubTitleBinding(java.lang.Object r1, android.view.View r2, int r3, androidx.appcompat.widget.AppCompatImageButton r4, androidx.appcompat.widget.AppCompatImageButton r5, androidx.constraintlayout.widget.ConstraintLayout r6, com.bxkj.base.view.MarqueeTextView r7) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.ibBack = r4
            r0.ibRight = r5
            r0.llTitle = r6
            r0.tvTitle = r7
            return
    }

    public static com.bxkj.student.databinding.PubTitleBinding bind(@androidx.annotation.NonNull android.view.View r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.PubTitleBinding r1 = bind(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static com.bxkj.student.databinding.PubTitleBinding bind(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = 2131493644(0x7f0c030c, float:1.8610774E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.bind(r2, r1, r0)
            com.bxkj.student.databinding.PubTitleBinding r1 = (com.bxkj.student.databinding.PubTitleBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.PubTitleBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.PubTitleBinding r1 = inflate(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.PubTitleBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.PubTitleBinding r1 = inflate(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.PubTitleBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 2131493644(0x7f0c030c, float:1.8610774E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.inflateInternal(r1, r0, r2, r3, r4)
            com.bxkj.student.databinding.PubTitleBinding r1 = (com.bxkj.student.databinding.PubTitleBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.PubTitleBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 0
            r1 = 0
            r2 = 2131493644(0x7f0c030c, float:1.8610774E38)
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.inflateInternal(r3, r2, r0, r1, r4)
            com.bxkj.student.databinding.PubTitleBinding r3 = (com.bxkj.student.databinding.PubTitleBinding) r3
            return r3
    }

    @androidx.annotation.Nullable
    public androidx.appcompat.app.AppCompatActivity getActivity() {
            r1 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r1.mActivity
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Boolean getIsHideBack() {
            r1 = this;
            java.lang.Boolean r0 = r1.mIsHideBack
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.mTitle
            return r0
    }

    public abstract void setActivity(@androidx.annotation.Nullable androidx.appcompat.app.AppCompatActivity r1);

    public abstract void setIsHideBack(@androidx.annotation.Nullable java.lang.Boolean r1);

    public abstract void setTitle(@androidx.annotation.Nullable java.lang.String r1);
}
