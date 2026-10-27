package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$4\n*L\n1#1,90:1\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ActivityViewModelLazyKt$viewModels$4 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.lifecycle.viewmodel.CreationExtras> {
    final /* synthetic */ kotlin.jvm.functions.Function0<androidx.lifecycle.viewmodel.CreationExtras> $extrasProducer;
    final /* synthetic */ androidx.activity.ComponentActivity $this_viewModels;

    public ActivityViewModelLazyKt$viewModels$4(kotlin.jvm.functions.Function0<? extends androidx.lifecycle.viewmodel.CreationExtras> r1, androidx.activity.ComponentActivity r2) {
            r0 = this;
            r0.$extrasProducer = r1
            r0.$this_viewModels = r2
            r1 = 0
            r0.<init>(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.viewmodel.CreationExtras invoke() {
            r1 = this;
            kotlin.jvm.functions.Function0<androidx.lifecycle.viewmodel.CreationExtras> r0 = r1.$extrasProducer
            if (r0 == 0) goto Le
            java.lang.Object r0 = r0.invoke()
            androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            return r0
        Le:
            androidx.activity.ComponentActivity r0 = r1.$this_viewModels
            androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
            return r0
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m3invoke() {
            r1 = this;
            androidx.lifecycle.viewmodel.CreationExtras r0 = r1.invoke()
            return r0
    }
}
