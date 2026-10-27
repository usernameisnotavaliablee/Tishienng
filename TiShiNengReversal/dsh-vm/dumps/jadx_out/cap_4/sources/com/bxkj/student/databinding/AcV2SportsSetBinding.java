package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class AcV2SportsSetBinding extends androidx.databinding.ViewDataBinding {

    @androidx.databinding.Bindable
    protected com.bxkj.student.v2.ui.sports.set.SportsSetActivity mMSportsSetActivity;

    @androidx.annotation.NonNull
    public final com.bxkj.base.databinding.NewPubTitleBinding titleLayout;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvDescription;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvPermissionSet;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvQuestion;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvRank;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvRecord;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvSoundSet;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvStatistics;

    protected AcV2SportsSetBinding(java.lang.Object r1, android.view.View r2, int r3, com.bxkj.base.databinding.NewPubTitleBinding r4, android.widget.TextView r5, android.widget.TextView r6, android.widget.TextView r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.titleLayout = r4
            r0.tvDescription = r5
            r0.tvPermissionSet = r6
            r0.tvQuestion = r7
            r0.tvRank = r8
            r0.tvRecord = r9
            r0.tvSoundSet = r10
            r0.tvStatistics = r11
            return
    }

    public static com.bxkj.student.databinding.AcV2SportsSetBinding bind(@androidx.annotation.NonNull android.view.View r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcV2SportsSetBinding r1 = bind(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcV2SportsSetBinding bind(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = 2131493048(0x7f0c00b8, float:1.8609565E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.bind(r2, r1, r0)
            com.bxkj.student.databinding.AcV2SportsSetBinding r1 = (com.bxkj.student.databinding.AcV2SportsSetBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.AcV2SportsSetBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcV2SportsSetBinding r1 = inflate(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.AcV2SportsSetBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcV2SportsSetBinding r1 = inflate(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcV2SportsSetBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 2131493048(0x7f0c00b8, float:1.8609565E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.inflateInternal(r1, r0, r2, r3, r4)
            com.bxkj.student.databinding.AcV2SportsSetBinding r1 = (com.bxkj.student.databinding.AcV2SportsSetBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcV2SportsSetBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 0
            r1 = 0
            r2 = 2131493048(0x7f0c00b8, float:1.8609565E38)
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.inflateInternal(r3, r2, r0, r1, r4)
            com.bxkj.student.databinding.AcV2SportsSetBinding r3 = (com.bxkj.student.databinding.AcV2SportsSetBinding) r3
            return r3
    }

    @androidx.annotation.Nullable
    public com.bxkj.student.v2.ui.sports.set.SportsSetActivity getMSportsSetActivity() {
            r1 = this;
            com.bxkj.student.v2.ui.sports.set.SportsSetActivity r0 = r1.mMSportsSetActivity
            return r0
    }

    public abstract void setMSportsSetActivity(@androidx.annotation.Nullable com.bxkj.student.v2.ui.sports.set.SportsSetActivity r1);
}
