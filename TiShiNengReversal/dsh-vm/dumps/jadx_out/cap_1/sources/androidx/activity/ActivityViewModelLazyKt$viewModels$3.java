package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$3\n*L\n1#1,90:1\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ActivityViewModelLazyKt$viewModels$3 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelStore> {
    final /* synthetic */ androidx.activity.ComponentActivity $this_viewModels;

    public ActivityViewModelLazyKt$viewModels$3(androidx.activity.ComponentActivity r1) {
            r0 = this;
            r0.$this_viewModels = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.ViewModelStore invoke() {
            r1 = this;
            androidx.activity.ComponentActivity r0 = r1.$this_viewModels
            androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
            return r0
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m2invoke() {
            r1 = this;
            androidx.lifecycle.ViewModelStore r0 = r1.invoke()
            return r0
    }
}
