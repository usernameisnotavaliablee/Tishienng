package androidx.fragment.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FragmentViewModelLazyKt$viewModels$2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelStore> {
    final /* synthetic */ kotlin.jvm.functions.Function0 $ownerProducer;

    public FragmentViewModelLazyKt$viewModels$2(kotlin.jvm.functions.Function0 r1) {
            r0 = this;
            r0.$ownerProducer = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.ViewModelStore invoke() {
            r2 = this;
            kotlin.jvm.functions.Function0 r0 = r2.$ownerProducer
            java.lang.Object r0 = r0.invoke()
            androidx.lifecycle.ViewModelStoreOwner r0 = (androidx.lifecycle.ViewModelStoreOwner) r0
            androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
            java.lang.String r1 = "ownerProducer().viewModelStore"
            kotlin.jvm.internal.g0.h(r0, r1)
            return r0
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m55invoke() {
            r1 = this;
            androidx.lifecycle.ViewModelStore r0 = r1.invoke()
            return r0
    }
}
