package com.bxkj.base.v2.base;

import androidx.databinding.ViewDataBinding;
import com.bxkj.base.v2.base.BaseViewModel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBaseUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseUI.kt\ncom/bxkj/base/v2/base/BaseUI\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n4225#2,11:166\n4225#2,11:177\n4225#2,11:188\n1#3:199\n*S KotlinDebug\n*F\n+ 1 BaseUI.kt\ncom/bxkj/base/v2/base/BaseUI\n*L\n45#1:166,11\n55#1:177,11\n67#1:188,11\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface j<VB extends androidx.databinding.ViewDataBinding, VM extends com.bxkj.base.v2.base.BaseViewModel> extends com.bxkj.base.v2.base.a<VB> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        @java.lang.Deprecated
        public static <VB extends androidx.databinding.ViewDataBinding, VM extends com.bxkj.base.v2.base.BaseViewModel> void a(@org.jetbrains.annotations.NotNull com.bxkj.base.v2.base.j<VB, VM> r0) {
                com.bxkj.base.v2.base.i.g(r0)
                return
        }

        @java.lang.Deprecated
        @org.jetbrains.annotations.NotNull
        public static <VB_I1 extends androidx.databinding.ViewDataBinding, VM extends com.bxkj.base.v2.base.BaseViewModel, VB extends androidx.viewbinding.ViewBinding> VB b(@org.jetbrains.annotations.NotNull com.bxkj.base.v2.base.j<VB_I1, VM> r1, @org.jetbrains.annotations.NotNull java.lang.Object r2, @org.jetbrains.annotations.NotNull android.view.LayoutInflater r3) {
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "inflater"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.viewbinding.ViewBinding r1 = com.bxkj.base.v2.base.i.h(r1, r2, r3)
                return r1
        }

        @java.lang.Deprecated
        @org.jetbrains.annotations.NotNull
        public static <VB_I1 extends androidx.databinding.ViewDataBinding, VM extends com.bxkj.base.v2.base.BaseViewModel, VB extends androidx.viewbinding.ViewBinding> VB c(@org.jetbrains.annotations.NotNull com.bxkj.base.v2.base.j<VB_I1, VM> r1, @org.jetbrains.annotations.NotNull java.lang.Object r2, @org.jetbrains.annotations.NotNull android.view.LayoutInflater r3, @org.jetbrains.annotations.Nullable android.view.ViewGroup r4) {
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "inflater"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.viewbinding.ViewBinding r1 = com.bxkj.base.v2.base.i.i(r1, r2, r3, r4)
                return r1
        }

        @java.lang.Deprecated
        @org.jetbrains.annotations.NotNull
        public static <VB extends androidx.databinding.ViewDataBinding, VM_I1 extends com.bxkj.base.v2.base.BaseViewModel, VM extends androidx.lifecycle.ViewModel> VM d(@org.jetbrains.annotations.NotNull com.bxkj.base.v2.base.j<VB, VM_I1> r1, @org.jetbrains.annotations.NotNull java.lang.Object r2, @androidx.annotation.NonNull @org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModelStoreOwner r3) {
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "owner"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.lifecycle.ViewModel r1 = com.bxkj.base.v2.base.i.j(r1, r2, r3)
                return r1
        }

        @java.lang.Deprecated
        public static <VB extends androidx.databinding.ViewDataBinding, VM extends com.bxkj.base.v2.base.BaseViewModel> void e(@org.jetbrains.annotations.NotNull com.bxkj.base.v2.base.j<VB, VM> r0) {
                com.bxkj.base.v2.base.i.k(r0)
                return
        }
    }

    @org.jetbrains.annotations.NotNull
    <VM extends androidx.lifecycle.ViewModel> VM A(@org.jetbrains.annotations.NotNull java.lang.Object r1, @androidx.annotation.NonNull @org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModelStoreOwner r2);

    void B(@org.jetbrains.annotations.Nullable com.bxkj.base.v2.base.p r1);

    @org.jetbrains.annotations.NotNull
    VM C();

    void D();

    void E(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentManager r1);

    @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner F();

    @org.jetbrains.annotations.NotNull
    android.content.Context G();

    @org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager I();

    void J(@org.jetbrains.annotations.NotNull android.content.Context r1);

    @org.jetbrains.annotations.NotNull
    VB K();

    void a(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r1);

    @org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment p();

    @org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentActivity q();

    void r(@org.jetbrains.annotations.NotNull androidx.fragment.app.Fragment r1);

    void setLifecycleOwner(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r1);

    void t();

    @org.jetbrains.annotations.NotNull
    <VB extends androidx.viewbinding.ViewBinding> VB u(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.NotNull android.view.LayoutInflater r2);

    @org.jetbrains.annotations.NotNull
    <VB extends androidx.viewbinding.ViewBinding> VB v(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.NotNull android.view.LayoutInflater r2, @org.jetbrains.annotations.Nullable android.view.ViewGroup r3);

    void w(@org.jetbrains.annotations.NotNull VM r1);

    @org.jetbrains.annotations.Nullable
    com.bxkj.base.v2.base.p x();

    void y(@org.jetbrains.annotations.NotNull VB r1);
}
