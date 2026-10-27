package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class AcSchoolListV2Binding extends androidx.databinding.ViewDataBinding {

    @androidx.annotation.NonNull
    public final android.view.View emptyLayout;

    @androidx.databinding.Bindable
    protected com.bxkj.base.v2.common.view.b mActivity;

    @androidx.annotation.NonNull
    public final com.bxkj.base.v2.common.view.EmptyRecyclerView rvSchool;

    @androidx.annotation.NonNull
    public final com.bxkj.base.view.SearchView searchView;

    @androidx.annotation.NonNull
    public final com.bxkj.student.databinding.V3PubTitleBinding titleLayout;

    protected AcSchoolListV2Binding(java.lang.Object r1, android.view.View r2, int r3, android.view.View r4, com.bxkj.base.v2.common.view.EmptyRecyclerView r5, com.bxkj.base.view.SearchView r6, com.bxkj.student.databinding.V3PubTitleBinding r7) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.emptyLayout = r4
            r0.rvSchool = r5
            r0.searchView = r6
            r0.titleLayout = r7
            return
    }

    public static com.bxkj.student.databinding.AcSchoolListV2Binding bind(@androidx.annotation.NonNull android.view.View r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcSchoolListV2Binding r1 = bind(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcSchoolListV2Binding bind(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = 2131493022(0x7f0c009e, float:1.8609512E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.bind(r2, r1, r0)
            com.bxkj.student.databinding.AcSchoolListV2Binding r1 = (com.bxkj.student.databinding.AcSchoolListV2Binding) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.AcSchoolListV2Binding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcSchoolListV2Binding r1 = inflate(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.AcSchoolListV2Binding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcSchoolListV2Binding r1 = inflate(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcSchoolListV2Binding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 2131493022(0x7f0c009e, float:1.8609512E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.inflateInternal(r1, r0, r2, r3, r4)
            com.bxkj.student.databinding.AcSchoolListV2Binding r1 = (com.bxkj.student.databinding.AcSchoolListV2Binding) r1
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcSchoolListV2Binding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 0
            r1 = 0
            r2 = 2131493022(0x7f0c009e, float:1.8609512E38)
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.inflateInternal(r3, r2, r0, r1, r4)
            com.bxkj.student.databinding.AcSchoolListV2Binding r3 = (com.bxkj.student.databinding.AcSchoolListV2Binding) r3
            return r3
    }

    @androidx.annotation.Nullable
    public com.bxkj.base.v2.common.view.b getActivity() {
            r1 = this;
            com.bxkj.base.v2.common.view.b r0 = r1.mActivity
            return r0
    }

    public abstract void setActivity(@androidx.annotation.Nullable com.bxkj.base.v2.common.view.b r1);
}
