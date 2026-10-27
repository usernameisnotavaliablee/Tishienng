package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class V3FaceCollectConfirmBinding extends androidx.databinding.ViewDataBinding {

    @androidx.annotation.NonNull
    public final android.widget.ImageView ivFace;

    @androidx.annotation.NonNull
    public final com.bxkj.student.databinding.V3PubTitleBinding layoutTitle;

    @androidx.databinding.Bindable
    protected com.bxkj.student.v2.ui.face.FaceCollectConfirmActivity mActivity;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvInfo;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvInfoTitle;

    protected V3FaceCollectConfirmBinding(java.lang.Object r1, android.view.View r2, int r3, android.widget.ImageView r4, com.bxkj.student.databinding.V3PubTitleBinding r5, android.widget.TextView r6, android.widget.TextView r7) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.ivFace = r4
            r0.layoutTitle = r5
            r0.tvInfo = r6
            r0.tvInfoTitle = r7
            return
    }

    public static com.bxkj.student.databinding.V3FaceCollectConfirmBinding bind(@androidx.annotation.NonNull android.view.View r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.V3FaceCollectConfirmBinding r1 = bind(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static com.bxkj.student.databinding.V3FaceCollectConfirmBinding bind(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = 2131493727(0x7f0c035f, float:1.8610942E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.bind(r2, r1, r0)
            com.bxkj.student.databinding.V3FaceCollectConfirmBinding r1 = (com.bxkj.student.databinding.V3FaceCollectConfirmBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.V3FaceCollectConfirmBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.V3FaceCollectConfirmBinding r1 = inflate(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.V3FaceCollectConfirmBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.V3FaceCollectConfirmBinding r1 = inflate(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.V3FaceCollectConfirmBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 2131493727(0x7f0c035f, float:1.8610942E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.inflateInternal(r1, r0, r2, r3, r4)
            com.bxkj.student.databinding.V3FaceCollectConfirmBinding r1 = (com.bxkj.student.databinding.V3FaceCollectConfirmBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.V3FaceCollectConfirmBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 0
            r1 = 0
            r2 = 2131493727(0x7f0c035f, float:1.8610942E38)
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.inflateInternal(r3, r2, r0, r1, r4)
            com.bxkj.student.databinding.V3FaceCollectConfirmBinding r3 = (com.bxkj.student.databinding.V3FaceCollectConfirmBinding) r3
            return r3
    }

    @androidx.annotation.Nullable
    public com.bxkj.student.v2.ui.face.FaceCollectConfirmActivity getActivity() {
            r1 = this;
            com.bxkj.student.v2.ui.face.FaceCollectConfirmActivity r0 = r1.mActivity
            return r0
    }

    public abstract void setActivity(@androidx.annotation.Nullable com.bxkj.student.v2.ui.face.FaceCollectConfirmActivity r1);
}
