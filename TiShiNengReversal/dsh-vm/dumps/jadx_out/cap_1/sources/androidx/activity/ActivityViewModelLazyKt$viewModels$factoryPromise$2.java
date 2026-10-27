package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2\n*L\n1#1,90:1\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ActivityViewModelLazyKt$viewModels$factoryPromise$2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> {
    final /* synthetic */ androidx.activity.ComponentActivity $this_viewModels;

    public ActivityViewModelLazyKt$viewModels$factoryPromise$2(androidx.activity.ComponentActivity r1) {
            r0 = this;
            r0.$this_viewModels = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
            r1 = this;
            androidx.activity.ComponentActivity r0 = r1.$this_viewModels
            androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
            return r0
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m5invoke() {
            r1 = this;
            androidx.lifecycle.ViewModelProvider$Factory r0 = r1.invoke()
            return r0
    }
}
