package androidx.fragment.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FragmentViewModelLazyKt$activityViewModels$2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> {
    final /* synthetic */ androidx.fragment.app.Fragment $this_activityViewModels;

    public FragmentViewModelLazyKt$activityViewModels$2(androidx.fragment.app.Fragment r1) {
            r0 = this;
            r0.$this_activityViewModels = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.$this_activityViewModels
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            java.lang.String r1 = "requireActivity()"
            kotlin.jvm.internal.g0.h(r0, r1)
            androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
            java.lang.String r1 = "requireActivity().defaultViewModelProviderFactory"
            kotlin.jvm.internal.g0.h(r0, r1)
            return r0
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m52invoke() {
            r1 = this;
            androidx.lifecycle.ViewModelProvider$Factory r0 = r1.invoke()
            return r0
    }
}
