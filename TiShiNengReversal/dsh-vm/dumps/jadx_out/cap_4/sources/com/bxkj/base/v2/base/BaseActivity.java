package com.bxkj.base.v2.base;

import androidx.databinding.ViewDataBinding;
import com.bxkj.base.v2.base.BaseViewModel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class BaseActivity<VB extends androidx.databinding.ViewDataBinding, VM extends com.bxkj.base.v2.base.BaseViewModel> extends androidx.appcompat.app.AppCompatActivity implements com.bxkj.base.v2.base.j<VB, VM>, com.bxkj.base.v2.common.view.b {
    public androidx.fragment.app.FragmentActivity O;
    public androidx.fragment.app.Fragment P;
    public android.content.Context Q;
    public VM R;
    public VB S;
    public androidx.lifecycle.LifecycleOwner T;
    public androidx.fragment.app.FragmentManager U;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.base.v2.base.p V;

    public BaseActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bxkj.base.v2.base.j
    @org.jetbrains.annotations.NotNull
    public <VM extends androidx.lifecycle.ViewModel> VM A(@org.jetbrains.annotations.NotNull java.lang.Object r1, @androidx.annotation.NonNull @org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModelStoreOwner r2) {
            r0 = this;
            androidx.lifecycle.ViewModel r1 = com.bxkj.base.v2.base.i.d(r0, r1, r2)
            return r1
    }

    @Override // com.bxkj.base.v2.base.j
    public void B(@org.jetbrains.annotations.Nullable com.bxkj.base.v2.base.p r1) {
            r0 = this;
            r0.V = r1
            return
    }

    @Override // com.bxkj.base.v2.base.j
    @org.jetbrains.annotations.NotNull
    public VM C() {
            r1 = this;
            VM extends com.bxkj.base.v2.base.BaseViewModel r0 = r1.R
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "mViewModel"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    @Override // com.bxkj.base.v2.base.j
    public void D() {
            r0 = this;
            com.bxkj.base.v2.base.i.a(r0)
            return
    }

    @Override // com.bxkj.base.v2.base.j
    public void E(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentManager r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.U = r2
            return
    }

    @Override // com.bxkj.base.v2.base.j
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.LifecycleOwner F() {
            r1 = this;
            androidx.lifecycle.LifecycleOwner r0 = r1.T
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "lifecycleOwner"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    @Override // com.bxkj.base.v2.base.j
    @org.jetbrains.annotations.NotNull
    public android.content.Context G() {
            r1 = this;
            android.content.Context r0 = r1.Q
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "mContext"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    @Override // com.bxkj.base.v2.base.j
    @org.jetbrains.annotations.NotNull
    public androidx.fragment.app.FragmentManager I() {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.U
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "dialogFagmentManager"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    @Override // com.bxkj.base.v2.base.j
    public void J(@org.jetbrains.annotations.NotNull android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.Q = r2
            return
    }

    @Override // com.bxkj.base.v2.base.j
    @org.jetbrains.annotations.NotNull
    public VB K() {
            r1 = this;
            VB extends androidx.databinding.ViewDataBinding r0 = r1.S
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "mDataBinding"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    @Override // com.bxkj.base.v2.base.j
    public void a(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.O = r2
            return
    }

    protected void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r2) {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onCreate(r2)
            r1.a(r1)
            r1.J(r1)
            androidx.lifecycle.ViewModel r2 = r1.A(r1, r1)
            com.bxkj.base.v2.base.BaseViewModel r2 = (com.bxkj.base.v2.base.BaseViewModel) r2
            r1.w(r2)
            android.view.LayoutInflater r2 = r1.getLayoutInflater()
            java.lang.String r0 = "getLayoutInflater(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            androidx.viewbinding.ViewBinding r2 = r1.u(r1, r2)
            androidx.databinding.ViewDataBinding r2 = (androidx.databinding.ViewDataBinding) r2
            r1.y(r2)
            r1.setLifecycleOwner(r1)
            androidx.fragment.app.FragmentManager r2 = r1.getSupportFragmentManager()
            java.lang.String r0 = "getSupportFragmentManager(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            r1.E(r2)
            androidx.databinding.ViewDataBinding r2 = r1.K()
            android.view.View r2 = r2.getRoot()
            r1.setContentView(r2)
            r1.D()
            r1.s()
            r1.o()
            androidx.appcompat.app.ActionBar r2 = r1.getSupportActionBar()
            if (r2 == 0) goto L51
            r0 = 0
            r2.setDisplayShowTitleEnabled(r0)
        L51:
            cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
            androidx.fragment.app.FragmentActivity r0 = r1.q()
            r2.c(r0)
            return
    }

    protected void onDestroy() {
            r2 = this;
            super.onDestroy()
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            androidx.fragment.app.FragmentActivity r1 = r2.q()
            r0.s(r1)
            r2.t()
            return
    }

    @Override // com.bxkj.base.v2.base.j
    @org.jetbrains.annotations.NotNull
    public androidx.fragment.app.Fragment p() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.P
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "mFragment"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    @Override // com.bxkj.base.v2.base.j
    @org.jetbrains.annotations.NotNull
    public androidx.fragment.app.FragmentActivity q() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.O
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "mActivity"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    @Override // com.bxkj.base.v2.base.j
    public void r(@org.jetbrains.annotations.NotNull androidx.fragment.app.Fragment r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.P = r2
            return
    }

    @Override // com.bxkj.base.v2.base.j
    public void setLifecycleOwner(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.T = r2
            return
    }

    @Override // com.bxkj.base.v2.base.j
    public void t() {
            r0 = this;
            com.bxkj.base.v2.base.i.e(r0)
            return
    }

    @Override // com.bxkj.base.v2.base.j
    @org.jetbrains.annotations.NotNull
    public <VB extends androidx.viewbinding.ViewBinding> VB u(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.NotNull android.view.LayoutInflater r2) {
            r0 = this;
            androidx.viewbinding.ViewBinding r1 = com.bxkj.base.v2.base.i.b(r0, r1, r2)
            return r1
    }

    @Override // com.bxkj.base.v2.base.j
    @org.jetbrains.annotations.NotNull
    public <VB extends androidx.viewbinding.ViewBinding> VB v(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.NotNull android.view.LayoutInflater r2, @org.jetbrains.annotations.Nullable android.view.ViewGroup r3) {
            r0 = this;
            androidx.viewbinding.ViewBinding r1 = com.bxkj.base.v2.base.i.c(r0, r1, r2, r3)
            return r1
    }

    @Override // com.bxkj.base.v2.base.j
    public void w(@org.jetbrains.annotations.NotNull VM r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.R = r2
            return
    }

    @Override // com.bxkj.base.v2.base.j
    @org.jetbrains.annotations.Nullable
    public com.bxkj.base.v2.base.p x() {
            r1 = this;
            com.bxkj.base.v2.base.p r0 = r1.V
            return r0
    }

    @Override // com.bxkj.base.v2.base.j
    public void y(@org.jetbrains.annotations.NotNull VB r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.S = r2
            return
    }
}
