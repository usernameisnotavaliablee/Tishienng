package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class AcV2SportsDescriptionBinding extends androidx.databinding.ViewDataBinding {

    @androidx.annotation.NonNull
    public final android.widget.Button btStart;

    @androidx.annotation.NonNull
    public final android.widget.CheckBox cbIgnore;

    @androidx.databinding.Bindable
    protected com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity mMActivity;

    @androidx.databinding.Bindable
    protected java.lang.Boolean mShowBottom;

    @androidx.databinding.Bindable
    protected java.lang.Boolean mStartButtonEnable;

    @androidx.annotation.NonNull
    public final cn.bluemobi.dylan.smartwebview.SmartWebView swv;

    @androidx.annotation.NonNull
    public final com.bxkj.base.databinding.NewPubTitleBinding titleLayout;

    protected AcV2SportsDescriptionBinding(java.lang.Object r1, android.view.View r2, int r3, android.widget.Button r4, android.widget.CheckBox r5, cn.bluemobi.dylan.smartwebview.SmartWebView r6, com.bxkj.base.databinding.NewPubTitleBinding r7) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.btStart = r4
            r0.cbIgnore = r5
            r0.swv = r6
            r0.titleLayout = r7
            return
    }

    public static com.bxkj.student.databinding.AcV2SportsDescriptionBinding bind(@androidx.annotation.NonNull android.view.View r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcV2SportsDescriptionBinding r1 = bind(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcV2SportsDescriptionBinding bind(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = 2131493046(0x7f0c00b6, float:1.8609561E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.bind(r2, r1, r0)
            com.bxkj.student.databinding.AcV2SportsDescriptionBinding r1 = (com.bxkj.student.databinding.AcV2SportsDescriptionBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.AcV2SportsDescriptionBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcV2SportsDescriptionBinding r1 = inflate(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.AcV2SportsDescriptionBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcV2SportsDescriptionBinding r1 = inflate(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcV2SportsDescriptionBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 2131493046(0x7f0c00b6, float:1.8609561E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.inflateInternal(r1, r0, r2, r3, r4)
            com.bxkj.student.databinding.AcV2SportsDescriptionBinding r1 = (com.bxkj.student.databinding.AcV2SportsDescriptionBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcV2SportsDescriptionBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 0
            r1 = 0
            r2 = 2131493046(0x7f0c00b6, float:1.8609561E38)
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.inflateInternal(r3, r2, r0, r1, r4)
            com.bxkj.student.databinding.AcV2SportsDescriptionBinding r3 = (com.bxkj.student.databinding.AcV2SportsDescriptionBinding) r3
            return r3
    }

    @androidx.annotation.Nullable
    public com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity getMActivity() {
            r1 = this;
            com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity r0 = r1.mMActivity
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Boolean getShowBottom() {
            r1 = this;
            java.lang.Boolean r0 = r1.mShowBottom
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Boolean getStartButtonEnable() {
            r1 = this;
            java.lang.Boolean r0 = r1.mStartButtonEnable
            return r0
    }

    public abstract void setMActivity(@androidx.annotation.Nullable com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity r1);

    public abstract void setShowBottom(@androidx.annotation.Nullable java.lang.Boolean r1);

    public abstract void setStartButtonEnable(@androidx.annotation.Nullable java.lang.Boolean r1);
}
