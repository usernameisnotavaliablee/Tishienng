package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class V2MyQrcodeBinding extends androidx.databinding.ViewDataBinding {

    @androidx.annotation.NonNull
    public final com.bxkj.student.databinding.V2PubTitleBinding includeTitle;

    @androidx.annotation.NonNull
    public final android.widget.ImageView ivBar;

    @androidx.annotation.NonNull
    public final android.widget.ImageView ivCode;

    @androidx.databinding.Bindable
    protected com.bxkj.base.v2.common.view.b mBackEvent;

    @androidx.databinding.Bindable
    protected java.lang.String mTitle;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvName;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvQrcodeTitle;

    protected V2MyQrcodeBinding(java.lang.Object r1, android.view.View r2, int r3, com.bxkj.student.databinding.V2PubTitleBinding r4, android.widget.ImageView r5, android.widget.ImageView r6, android.widget.TextView r7, android.widget.TextView r8) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.includeTitle = r4
            r0.ivBar = r5
            r0.ivCode = r6
            r0.tvName = r7
            r0.tvQrcodeTitle = r8
            return
    }

    public static com.bxkj.student.databinding.V2MyQrcodeBinding bind(@androidx.annotation.NonNull android.view.View r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.V2MyQrcodeBinding r1 = bind(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static com.bxkj.student.databinding.V2MyQrcodeBinding bind(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = 2131493719(0x7f0c0357, float:1.8610926E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.bind(r2, r1, r0)
            com.bxkj.student.databinding.V2MyQrcodeBinding r1 = (com.bxkj.student.databinding.V2MyQrcodeBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.V2MyQrcodeBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.V2MyQrcodeBinding r1 = inflate(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.V2MyQrcodeBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.V2MyQrcodeBinding r1 = inflate(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.V2MyQrcodeBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 2131493719(0x7f0c0357, float:1.8610926E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.inflateInternal(r1, r0, r2, r3, r4)
            com.bxkj.student.databinding.V2MyQrcodeBinding r1 = (com.bxkj.student.databinding.V2MyQrcodeBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.V2MyQrcodeBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 0
            r1 = 0
            r2 = 2131493719(0x7f0c0357, float:1.8610926E38)
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.inflateInternal(r3, r2, r0, r1, r4)
            com.bxkj.student.databinding.V2MyQrcodeBinding r3 = (com.bxkj.student.databinding.V2MyQrcodeBinding) r3
            return r3
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

    public abstract void setBackEvent(@androidx.annotation.Nullable com.bxkj.base.v2.common.view.b r1);

    public abstract void setTitle(@androidx.annotation.Nullable java.lang.String r1);
}
