package com.bxkj.base.v2.base;

import androidx.databinding.ViewDataBinding;
import com.bxkj.base.v2.base.BaseViewModel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFragment.kt\ncom/bxkj/base/v2/base/BaseFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class BaseFragment<VB extends androidx.databinding.ViewDataBinding, VM extends com.bxkj.base.v2.base.BaseViewModel> extends androidx.fragment.app.Fragment implements com.bxkj.base.v2.base.j<VB, VM> {
    public androidx.fragment.app.FragmentActivity c;
    public androidx.fragment.app.Fragment d;
    public android.content.Context e;
    public VM f;
    public VB g;
    public androidx.lifecycle.LifecycleOwner h;
    public androidx.fragment.app.FragmentManager i;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.base.v2.base.p j;
    private boolean k;

    public BaseFragment() {
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
            r0.j = r1
            return
    }

    @Override // com.bxkj.base.v2.base.j
    @org.jetbrains.annotations.NotNull
    public VM C() {
            r1 = this;
            VM extends com.bxkj.base.v2.base.BaseViewModel r0 = r1.f
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
            r1.i = r2
            return
    }

    @Override // com.bxkj.base.v2.base.j
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.LifecycleOwner F() {
            r1 = this;
            androidx.lifecycle.LifecycleOwner r0 = r1.h
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
            android.content.Context r0 = r1.e
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
            androidx.fragment.app.FragmentManager r0 = r1.i
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
            r1.e = r2
            return
    }

    @Override // com.bxkj.base.v2.base.j
    @org.jetbrains.annotations.NotNull
    public VB K() {
            r1 = this;
            VB extends androidx.databinding.ViewDataBinding r0 = r1.g
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
            r1.c = r2
            return
    }

    public final boolean b() {
            r1 = this;
            boolean r0 = r1.k
            return r0
    }

    public final void c(boolean r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public final void d(@org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModelStoreOwner r2) {
            r1 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.lifecycle.ViewModel r2 = r1.A(r1, r2)
            com.bxkj.base.v2.base.BaseViewModel r2 = (com.bxkj.base.v2.base.BaseViewModel) r2
            r1.w(r2)
            return
    }

    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull android.view.LayoutInflater r2, @org.jetbrains.annotations.Nullable android.view.ViewGroup r3, @org.jetbrains.annotations.Nullable android.os.Bundle r4) {
            r1 = this;
            java.lang.String r4 = "inflater"
            kotlin.jvm.internal.g0.p(r2, r4)
            androidx.fragment.app.FragmentActivity r4 = r1.requireActivity()
            java.lang.String r0 = "requireActivity(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            r1.a(r4)
            android.content.Context r4 = r1.requireContext()
            java.lang.String r0 = "requireContext(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            r1.J(r4)
            r1.r(r1)
            androidx.lifecycle.ViewModel r4 = r1.A(r1, r1)
            com.bxkj.base.v2.base.BaseViewModel r4 = (com.bxkj.base.v2.base.BaseViewModel) r4
            r1.w(r4)
            androidx.viewbinding.ViewBinding r2 = r1.v(r1, r2, r3)
            androidx.databinding.ViewDataBinding r2 = (androidx.databinding.ViewDataBinding) r2
            r1.y(r2)
            androidx.lifecycle.LifecycleOwner r2 = r1.getViewLifecycleOwner()
            java.lang.String r3 = "getViewLifecycleOwner(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r1.setLifecycleOwner(r2)
            androidx.fragment.app.FragmentManager r2 = r1.getChildFragmentManager()
            java.lang.String r3 = "getChildFragmentManager(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r1.E(r2)
            r1.D()
            r1.s()
            r1.o()
            cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
            androidx.fragment.app.Fragment r3 = r1.p()
            r2.d(r3)
            r2 = 1
            r1.k = r2
            androidx.databinding.ViewDataBinding r2 = r1.K()
            android.view.View r2 = r2.getRoot()
            return r2
    }

    public void onDestroy() {
            r2 = this;
            super.onDestroy()
            androidx.fragment.app.Fragment r0 = r2.d
            if (r0 == 0) goto L9
            r0 = r2
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L19
            androidx.fragment.app.Fragment r0 = r0.p()
            if (r0 == 0) goto L19
            cn.bluemobi.dylan.base.utils.a r1 = cn.bluemobi.dylan.base.utils.a.n()
            r1.t(r0)
        L19:
            r2.t()
            r0 = 0
            r2.k = r0
            return
    }

    @Override // com.bxkj.base.v2.base.j
    @org.jetbrains.annotations.NotNull
    public androidx.fragment.app.Fragment p() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.d
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
            androidx.fragment.app.FragmentActivity r0 = r1.c
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
            r1.d = r2
            return
    }

    @Override // com.bxkj.base.v2.base.j
    public void setLifecycleOwner(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.h = r2
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
            r1.f = r2
            return
    }

    @Override // com.bxkj.base.v2.base.j
    @org.jetbrains.annotations.Nullable
    public com.bxkj.base.v2.base.p x() {
            r1 = this;
            com.bxkj.base.v2.base.p r0 = r1.j
            return r0
    }

    @Override // com.bxkj.base.v2.base.j
    public void y(@org.jetbrains.annotations.NotNull VB r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.g = r2
            return
    }
}
