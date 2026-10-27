package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class AcV2SoundSetFrequencyBinding extends androidx.databinding.ViewDataBinding {

    @androidx.annotation.NonNull
    public final android.widget.Button btOk;

    @androidx.databinding.Bindable
    protected com.bxkj.student.v2.ui.sports.set.SoundFrequencyActivity mMActivity;

    @androidx.annotation.NonNull
    public final android.widget.RadioGroup rg;

    @androidx.annotation.NonNull
    public final com.bxkj.student.databinding.V3PubTitleBinding titleLayout;

    protected AcV2SoundSetFrequencyBinding(java.lang.Object r1, android.view.View r2, int r3, android.widget.Button r4, android.widget.RadioGroup r5, com.bxkj.student.databinding.V3PubTitleBinding r6) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.btOk = r4
            r0.rg = r5
            r0.titleLayout = r6
            return
    }

    public static com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding bind(@androidx.annotation.NonNull android.view.View r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding r1 = bind(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding bind(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = 2131493045(0x7f0c00b5, float:1.860956E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.bind(r2, r1, r0)
            com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding r1 = (com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding r1 = inflate(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding r1 = inflate(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 2131493045(0x7f0c00b5, float:1.860956E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.inflateInternal(r1, r0, r2, r3, r4)
            com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding r1 = (com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 0
            r1 = 0
            r2 = 2131493045(0x7f0c00b5, float:1.860956E38)
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.inflateInternal(r3, r2, r0, r1, r4)
            com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding r3 = (com.bxkj.student.databinding.AcV2SoundSetFrequencyBinding) r3
            return r3
    }

    @androidx.annotation.Nullable
    public com.bxkj.student.v2.ui.sports.set.SoundFrequencyActivity getMActivity() {
            r1 = this;
            com.bxkj.student.v2.ui.sports.set.SoundFrequencyActivity r0 = r1.mMActivity
            return r0
    }

    public abstract void setMActivity(@androidx.annotation.Nullable com.bxkj.student.v2.ui.sports.set.SoundFrequencyActivity r1);
}
