package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class AcV3RecordListBinding extends androidx.databinding.ViewDataBinding {

    @androidx.annotation.NonNull
    public final androidx.appcompat.widget.AppCompatImageButton ibBack;

    @androidx.annotation.NonNull
    public final androidx.appcompat.widget.AppCompatImageView ivSet;

    @androidx.annotation.NonNull
    public final android.widget.LinearLayout llContent;

    @androidx.databinding.Bindable
    protected com.bxkj.student.v2.ui.sports.v3.record.V3RecordListActivity mMActivity;

    @androidx.annotation.NonNull
    public final com.google.android.material.tabs.TabLayout tb;

    @androidx.annotation.NonNull
    public final com.bxkj.base.view.MarqueeTextView tvTitle;

    protected AcV3RecordListBinding(java.lang.Object r1, android.view.View r2, int r3, androidx.appcompat.widget.AppCompatImageButton r4, androidx.appcompat.widget.AppCompatImageView r5, android.widget.LinearLayout r6, com.google.android.material.tabs.TabLayout r7, com.bxkj.base.view.MarqueeTextView r8) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.ibBack = r4
            r0.ivSet = r5
            r0.llContent = r6
            r0.tb = r7
            r0.tvTitle = r8
            return
    }

    public static com.bxkj.student.databinding.AcV3RecordListBinding bind(@androidx.annotation.NonNull android.view.View r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcV3RecordListBinding r1 = bind(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcV3RecordListBinding bind(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = 2131493051(0x7f0c00bb, float:1.8609571E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.bind(r2, r1, r0)
            com.bxkj.student.databinding.AcV3RecordListBinding r1 = (com.bxkj.student.databinding.AcV3RecordListBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.AcV3RecordListBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcV3RecordListBinding r1 = inflate(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.AcV3RecordListBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcV3RecordListBinding r1 = inflate(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcV3RecordListBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 2131493051(0x7f0c00bb, float:1.8609571E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.inflateInternal(r1, r0, r2, r3, r4)
            com.bxkj.student.databinding.AcV3RecordListBinding r1 = (com.bxkj.student.databinding.AcV3RecordListBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcV3RecordListBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 0
            r1 = 0
            r2 = 2131493051(0x7f0c00bb, float:1.8609571E38)
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.inflateInternal(r3, r2, r0, r1, r4)
            com.bxkj.student.databinding.AcV3RecordListBinding r3 = (com.bxkj.student.databinding.AcV3RecordListBinding) r3
            return r3
    }

    @androidx.annotation.Nullable
    public com.bxkj.student.v2.ui.sports.v3.record.V3RecordListActivity getMActivity() {
            r1 = this;
            com.bxkj.student.v2.ui.sports.v3.record.V3RecordListActivity r0 = r1.mMActivity
            return r0
    }

    public abstract void setMActivity(@androidx.annotation.Nullable com.bxkj.student.v2.ui.sports.v3.record.V3RecordListActivity r1);
}
