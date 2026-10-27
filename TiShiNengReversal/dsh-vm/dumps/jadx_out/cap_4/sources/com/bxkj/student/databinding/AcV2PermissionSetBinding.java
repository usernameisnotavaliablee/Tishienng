package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class AcV2PermissionSetBinding extends androidx.databinding.ViewDataBinding {

    @androidx.annotation.NonNull
    public final android.widget.Button btFastSet;

    @androidx.annotation.NonNull
    public final androidx.cardview.widget.CardView cardBatteryOptimizations;

    @androidx.annotation.NonNull
    public final androidx.cardview.widget.CardView cardGpsAlways;

    @androidx.annotation.NonNull
    public final androidx.cardview.widget.CardView cardSaveModel;

    @androidx.annotation.NonNull
    public final androidx.cardview.widget.CardView cardWhy;

    @androidx.databinding.Bindable
    protected com.bxkj.student.v2.ui.sports.set.PermissionSetActivity mMActivity;

    @androidx.annotation.NonNull
    public final cn.bluemobi.dylan.smartwebview.SmartWebView sw;

    @androidx.annotation.NonNull
    public final com.bxkj.student.databinding.V3PubTitleBinding titleLayout;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvHint;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvHint2;

    protected AcV2PermissionSetBinding(java.lang.Object r1, android.view.View r2, int r3, android.widget.Button r4, androidx.cardview.widget.CardView r5, androidx.cardview.widget.CardView r6, androidx.cardview.widget.CardView r7, androidx.cardview.widget.CardView r8, cn.bluemobi.dylan.smartwebview.SmartWebView r9, com.bxkj.student.databinding.V3PubTitleBinding r10, android.widget.TextView r11, android.widget.TextView r12) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.btFastSet = r4
            r0.cardBatteryOptimizations = r5
            r0.cardGpsAlways = r6
            r0.cardSaveModel = r7
            r0.cardWhy = r8
            r0.sw = r9
            r0.titleLayout = r10
            r0.tvHint = r11
            r0.tvHint2 = r12
            return
    }

    public static com.bxkj.student.databinding.AcV2PermissionSetBinding bind(@androidx.annotation.NonNull android.view.View r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcV2PermissionSetBinding r1 = bind(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcV2PermissionSetBinding bind(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = 2131493044(0x7f0c00b4, float:1.8609557E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.bind(r2, r1, r0)
            com.bxkj.student.databinding.AcV2PermissionSetBinding r1 = (com.bxkj.student.databinding.AcV2PermissionSetBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.AcV2PermissionSetBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcV2PermissionSetBinding r1 = inflate(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.AcV2PermissionSetBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcV2PermissionSetBinding r1 = inflate(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcV2PermissionSetBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 2131493044(0x7f0c00b4, float:1.8609557E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.inflateInternal(r1, r0, r2, r3, r4)
            com.bxkj.student.databinding.AcV2PermissionSetBinding r1 = (com.bxkj.student.databinding.AcV2PermissionSetBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcV2PermissionSetBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 0
            r1 = 0
            r2 = 2131493044(0x7f0c00b4, float:1.8609557E38)
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.inflateInternal(r3, r2, r0, r1, r4)
            com.bxkj.student.databinding.AcV2PermissionSetBinding r3 = (com.bxkj.student.databinding.AcV2PermissionSetBinding) r3
            return r3
    }

    @androidx.annotation.Nullable
    public com.bxkj.student.v2.ui.sports.set.PermissionSetActivity getMActivity() {
            r1 = this;
            com.bxkj.student.v2.ui.sports.set.PermissionSetActivity r0 = r1.mMActivity
            return r0
    }

    public abstract void setMActivity(@androidx.annotation.Nullable com.bxkj.student.v2.ui.sports.set.PermissionSetActivity r1);
}
