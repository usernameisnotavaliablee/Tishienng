package androidx.core.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n*L\n1#1,123:1\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AnimatorKt$addListener$listener$1 implements android.animation.Animator.AnimatorListener {
    final /* synthetic */ kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.n1> $onCancel;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.n1> $onEnd;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.n1> $onRepeat;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.n1> $onStart;

    public AnimatorKt$addListener$listener$1(kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.n1> r1, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.n1> r2, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.n1> r3, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.n1> r4) {
            r0 = this;
            r0.$onRepeat = r1
            r0.$onEnd = r2
            r0.$onCancel = r3
            r0.$onStart = r4
            r0.<init>()
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(@org.jetbrains.annotations.NotNull android.animation.Animator r2) {
            r1 = this;
            kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.n1> r0 = r1.$onCancel
            r0.invoke(r2)
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(@org.jetbrains.annotations.NotNull android.animation.Animator r2) {
            r1 = this;
            kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.n1> r0 = r1.$onEnd
            r0.invoke(r2)
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(@org.jetbrains.annotations.NotNull android.animation.Animator r2) {
            r1 = this;
            kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.n1> r0 = r1.$onRepeat
            r0.invoke(r2)
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(@org.jetbrains.annotations.NotNull android.animation.Animator r2) {
            r1 = this;
            kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.n1> r0 = r1.$onStart
            r0.invoke(r2)
            return
    }
}
