package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class V2AboutUsBinding extends androidx.databinding.ViewDataBinding {

    @androidx.annotation.NonNull
    public final android.widget.FrameLayout flTop;

    @androidx.annotation.NonNull
    public final com.bxkj.student.databinding.V2PubTitleBinding includeTitle;

    @androidx.annotation.NonNull
    public final android.widget.ImageView ivIcon;

    @androidx.annotation.NonNull
    public final android.widget.ImageView ivLogo;

    @androidx.databinding.Bindable
    protected com.bxkj.student.v2.ui.my.AboutUsActivity mActivity;

    @androidx.databinding.Bindable
    protected com.bxkj.base.v2.common.view.b mBackEvent;

    @androidx.databinding.Bindable
    protected java.lang.String mTitle;

    @androidx.annotation.NonNull
    public final com.bxkj.student.common.view.ToggleButton tagFloatButton;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvName;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvVersion;

    protected V2AboutUsBinding(java.lang.Object r1, android.view.View r2, int r3, android.widget.FrameLayout r4, com.bxkj.student.databinding.V2PubTitleBinding r5, android.widget.ImageView r6, android.widget.ImageView r7, com.bxkj.student.common.view.ToggleButton r8, android.widget.TextView r9, android.widget.TextView r10) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.flTop = r4
            r0.includeTitle = r5
            r0.ivIcon = r6
            r0.ivLogo = r7
            r0.tagFloatButton = r8
            r0.tvName = r9
            r0.tvVersion = r10
            return
    }

    public static com.bxkj.student.databinding.V2AboutUsBinding bind(@androidx.annotation.NonNull android.view.View r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.V2AboutUsBinding r1 = bind(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static com.bxkj.student.databinding.V2AboutUsBinding bind(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = 2131493702(0x7f0c0346, float:1.8610892E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.bind(r2, r1, r0)
            com.bxkj.student.databinding.V2AboutUsBinding r1 = (com.bxkj.student.databinding.V2AboutUsBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.V2AboutUsBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.V2AboutUsBinding r1 = inflate(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.V2AboutUsBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.V2AboutUsBinding r1 = inflate(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.V2AboutUsBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 2131493702(0x7f0c0346, float:1.8610892E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.inflateInternal(r1, r0, r2, r3, r4)
            com.bxkj.student.databinding.V2AboutUsBinding r1 = (com.bxkj.student.databinding.V2AboutUsBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.V2AboutUsBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 0
            r1 = 0
            r2 = 2131493702(0x7f0c0346, float:1.8610892E38)
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.inflateInternal(r3, r2, r0, r1, r4)
            com.bxkj.student.databinding.V2AboutUsBinding r3 = (com.bxkj.student.databinding.V2AboutUsBinding) r3
            return r3
    }

    @androidx.annotation.Nullable
    public com.bxkj.student.v2.ui.my.AboutUsActivity getActivity() {
            r1 = this;
            com.bxkj.student.v2.ui.my.AboutUsActivity r0 = r1.mActivity
            return r0
    }

    @androidx.annotation.Nullable
    public com.bxkj.base.v2.common.view.b getBackEvent() {
            r1 = this;
            com.bxkj.base.v2.common.view.b r0 = r1.mBackEvent
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.mTitle
            return r0
    }

    public abstract void setActivity(@androidx.annotation.Nullable com.bxkj.student.v2.ui.my.AboutUsActivity r1);

    public abstract void setBackEvent(@androidx.annotation.Nullable com.bxkj.base.v2.common.view.b r1);

    public abstract void setTitle(@androidx.annotation.Nullable java.lang.String r1);
}
