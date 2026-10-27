package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class AcV2SportsRankBinding extends androidx.databinding.ViewDataBinding {

    @androidx.databinding.Bindable
    protected java.util.Map<java.lang.String, java.lang.Object> mDataMap;

    @androidx.databinding.Bindable
    protected com.bxkj.base.v2.common.view.b mMActvity;

    @androidx.annotation.NonNull
    public final com.bxkj.base.databinding.NewPubTitleBinding titleLayout;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvRunClassRank;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvRunDepartmentRank;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvRunMajorRank;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvRunSchoolRank;

    protected AcV2SportsRankBinding(java.lang.Object r1, android.view.View r2, int r3, com.bxkj.base.databinding.NewPubTitleBinding r4, android.widget.TextView r5, android.widget.TextView r6, android.widget.TextView r7, android.widget.TextView r8) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.titleLayout = r4
            r0.tvRunClassRank = r5
            r0.tvRunDepartmentRank = r6
            r0.tvRunMajorRank = r7
            r0.tvRunSchoolRank = r8
            return
    }

    public static com.bxkj.student.databinding.AcV2SportsRankBinding bind(@androidx.annotation.NonNull android.view.View r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcV2SportsRankBinding r1 = bind(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcV2SportsRankBinding bind(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = 2131493047(0x7f0c00b7, float:1.8609563E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.bind(r2, r1, r0)
            com.bxkj.student.databinding.AcV2SportsRankBinding r1 = (com.bxkj.student.databinding.AcV2SportsRankBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.AcV2SportsRankBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcV2SportsRankBinding r1 = inflate(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.AcV2SportsRankBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcV2SportsRankBinding r1 = inflate(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcV2SportsRankBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 2131493047(0x7f0c00b7, float:1.8609563E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.inflateInternal(r1, r0, r2, r3, r4)
            com.bxkj.student.databinding.AcV2SportsRankBinding r1 = (com.bxkj.student.databinding.AcV2SportsRankBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcV2SportsRankBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 0
            r1 = 0
            r2 = 2131493047(0x7f0c00b7, float:1.8609563E38)
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.inflateInternal(r3, r2, r0, r1, r4)
            com.bxkj.student.databinding.AcV2SportsRankBinding r3 = (com.bxkj.student.databinding.AcV2SportsRankBinding) r3
            return r3
    }

    @androidx.annotation.Nullable
    public java.util.Map<java.lang.String, java.lang.Object> getDataMap() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mDataMap
            return r0
    }

    @androidx.annotation.Nullable
    public com.bxkj.base.v2.common.view.b getMActvity() {
            r1 = this;
            com.bxkj.base.v2.common.view.b r0 = r1.mMActvity
            return r0
    }

    public abstract void setDataMap(@androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.Object> r1);

    public abstract void setMActvity(@androidx.annotation.Nullable com.bxkj.base.v2.common.view.b r1);
}
