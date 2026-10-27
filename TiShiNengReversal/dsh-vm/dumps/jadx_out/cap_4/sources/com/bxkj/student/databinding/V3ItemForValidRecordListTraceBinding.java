package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class V3ItemForValidRecordListTraceBinding extends androidx.databinding.ViewDataBinding {

    @androidx.annotation.NonNull
    public final android.widget.ImageView ivSportsDistance;

    @androidx.annotation.NonNull
    public final android.widget.ImageView ivSportsStep;

    @androidx.annotation.NonNull
    public final android.widget.ImageView ivSportsTime;

    @androidx.annotation.NonNull
    public final android.widget.ImageView ivSportsType;

    @androidx.databinding.Bindable
    protected int mSportType;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvDistance;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvDistanceUnit;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvDuration;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvSportsTypeName;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvStep;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvStepUnit;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvTime;

    @androidx.annotation.NonNull
    public final android.view.View vCenter;

    @androidx.annotation.NonNull
    public final android.view.View vLeft;

    @androidx.annotation.NonNull
    public final android.view.View vRight;

    protected V3ItemForValidRecordListTraceBinding(java.lang.Object r1, android.view.View r2, int r3, android.widget.ImageView r4, android.widget.ImageView r5, android.widget.ImageView r6, android.widget.ImageView r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12, android.widget.TextView r13, android.widget.TextView r14, android.view.View r15, android.view.View r16, android.view.View r17) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.ivSportsDistance = r4
            r0.ivSportsStep = r5
            r0.ivSportsTime = r6
            r0.ivSportsType = r7
            r0.tvDistance = r8
            r0.tvDistanceUnit = r9
            r0.tvDuration = r10
            r0.tvSportsTypeName = r11
            r0.tvStep = r12
            r0.tvStepUnit = r13
            r0.tvTime = r14
            r0.vCenter = r15
            r1 = r16
            r0.vLeft = r1
            r1 = r17
            r0.vRight = r1
            return
    }

    public static com.bxkj.student.databinding.V3ItemForValidRecordListTraceBinding bind(@androidx.annotation.NonNull android.view.View r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.V3ItemForValidRecordListTraceBinding r1 = bind(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static com.bxkj.student.databinding.V3ItemForValidRecordListTraceBinding bind(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = 2131493734(0x7f0c0366, float:1.8610957E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.bind(r2, r1, r0)
            com.bxkj.student.databinding.V3ItemForValidRecordListTraceBinding r1 = (com.bxkj.student.databinding.V3ItemForValidRecordListTraceBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.V3ItemForValidRecordListTraceBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.V3ItemForValidRecordListTraceBinding r1 = inflate(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.V3ItemForValidRecordListTraceBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.V3ItemForValidRecordListTraceBinding r1 = inflate(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.V3ItemForValidRecordListTraceBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 2131493734(0x7f0c0366, float:1.8610957E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.inflateInternal(r1, r0, r2, r3, r4)
            com.bxkj.student.databinding.V3ItemForValidRecordListTraceBinding r1 = (com.bxkj.student.databinding.V3ItemForValidRecordListTraceBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.V3ItemForValidRecordListTraceBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 0
            r1 = 0
            r2 = 2131493734(0x7f0c0366, float:1.8610957E38)
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.inflateInternal(r3, r2, r0, r1, r4)
            com.bxkj.student.databinding.V3ItemForValidRecordListTraceBinding r3 = (com.bxkj.student.databinding.V3ItemForValidRecordListTraceBinding) r3
            return r3
    }

    public int getSportType() {
            r1 = this;
            int r0 = r1.mSportType
            return r0
    }

    public abstract void setSportType(int r1);
}
