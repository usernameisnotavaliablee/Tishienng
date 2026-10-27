package androidx.core.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n*L\n1#1,76:1\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class TransitionKt$addListener$listener$1 implements android.transition.Transition.TransitionListener {
    final /* synthetic */ kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.n1> $onCancel;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.n1> $onEnd;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.n1> $onPause;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.n1> $onResume;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.n1> $onStart;

    public TransitionKt$addListener$listener$1(kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.n1> r1, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.n1> r2, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.n1> r3, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.n1> r4, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.n1> r5) {
            r0 = this;
            r0.$onEnd = r1
            r0.$onResume = r2
            r0.$onPause = r3
            r0.$onCancel = r4
            r0.$onStart = r5
            r0.<init>()
            return
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(@org.jetbrains.annotations.NotNull android.transition.Transition r2) {
            r1 = this;
            kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.n1> r0 = r1.$onCancel
            r0.invoke(r2)
            return
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(@org.jetbrains.annotations.NotNull android.transition.Transition r2) {
            r1 = this;
            kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.n1> r0 = r1.$onEnd
            r0.invoke(r2)
            return
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(@org.jetbrains.annotations.NotNull android.transition.Transition r2) {
            r1 = this;
            kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.n1> r0 = r1.$onPause
            r0.invoke(r2)
            return
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(@org.jetbrains.annotations.NotNull android.transition.Transition r2) {
            r1 = this;
            kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.n1> r0 = r1.$onResume
            r0.invoke(r2)
            return
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(@org.jetbrains.annotations.NotNull android.transition.Transition r2) {
            r1 = this;
            kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.n1> r0 = r1.$onStart
            r0.invoke(r2)
            return
    }
}
