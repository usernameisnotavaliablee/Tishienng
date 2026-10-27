package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class AcExtraExerciseTypeBinding extends androidx.databinding.ViewDataBinding {

    @androidx.annotation.NonNull
    public final android.widget.Button btIn;

    @androidx.annotation.NonNull
    public final android.widget.Button btOut;

    @androidx.databinding.Bindable
    protected com.bxkj.student.run.extraclass.SignTypeActivity mSignTypeActivity;

    @androidx.annotation.NonNull
    public final com.bxkj.base.databinding.NewPubTitleBinding toolbar;

    protected AcExtraExerciseTypeBinding(java.lang.Object r1, android.view.View r2, int r3, android.widget.Button r4, android.widget.Button r5, com.bxkj.base.databinding.NewPubTitleBinding r6) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.btIn = r4
            r0.btOut = r5
            r0.toolbar = r6
            return
    }

    public static com.bxkj.student.databinding.AcExtraExerciseTypeBinding bind(@androidx.annotation.NonNull android.view.View r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcExtraExerciseTypeBinding r1 = bind(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcExtraExerciseTypeBinding bind(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = 2131492935(0x7f0c0047, float:1.8609336E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.bind(r2, r1, r0)
            com.bxkj.student.databinding.AcExtraExerciseTypeBinding r1 = (com.bxkj.student.databinding.AcExtraExerciseTypeBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.AcExtraExerciseTypeBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcExtraExerciseTypeBinding r1 = inflate(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.AcExtraExerciseTypeBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcExtraExerciseTypeBinding r1 = inflate(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcExtraExerciseTypeBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 2131492935(0x7f0c0047, float:1.8609336E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.inflateInternal(r1, r0, r2, r3, r4)
            com.bxkj.student.databinding.AcExtraExerciseTypeBinding r1 = (com.bxkj.student.databinding.AcExtraExerciseTypeBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcExtraExerciseTypeBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 0
            r1 = 0
            r2 = 2131492935(0x7f0c0047, float:1.8609336E38)
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.inflateInternal(r3, r2, r0, r1, r4)
            com.bxkj.student.databinding.AcExtraExerciseTypeBinding r3 = (com.bxkj.student.databinding.AcExtraExerciseTypeBinding) r3
            return r3
    }

    @androidx.annotation.Nullable
    public com.bxkj.student.run.extraclass.SignTypeActivity getSignTypeActivity() {
            r1 = this;
            com.bxkj.student.run.extraclass.SignTypeActivity r0 = r1.mSignTypeActivity
            return r0
    }

    public abstract void setSignTypeActivity(@androidx.annotation.Nullable com.bxkj.student.run.extraclass.SignTypeActivity r1);
}
