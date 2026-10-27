package androidx.core.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,123:1\n91#1,14:124\n91#1,14:138\n91#1,14:152\n91#1,14:166\n*S KotlinDebug\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n30#1:124,14\n41#1:138,14\n52#1:152,14\n62#1:166,14\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AnimatorKt {
    @org.jetbrains.annotations.NotNull
    public static final android.animation.Animator.AnimatorListener addListener(@org.jetbrains.annotations.NotNull android.animation.Animator r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.n1> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.n1> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.n1> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.n1> r5) {
            androidx.core.animation.AnimatorKt$addListener$listener$1 r0 = new androidx.core.animation.AnimatorKt$addListener$listener$1
            r0.<init>(r5, r2, r4, r3)
            r1.addListener(r0)
            return r0
    }

    public static /* synthetic */ android.animation.Animator.AnimatorListener addListener$default(android.animation.Animator r0, kotlin.jvm.functions.Function1 r1, kotlin.jvm.functions.Function1 r2, kotlin.jvm.functions.Function1 r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            androidx.core.animation.AnimatorKt$addListener$1 r1 = androidx.core.animation.AnimatorKt$addListener$1.INSTANCE
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            androidx.core.animation.AnimatorKt$addListener$2 r2 = androidx.core.animation.AnimatorKt$addListener$2.INSTANCE
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            androidx.core.animation.AnimatorKt$addListener$3 r3 = androidx.core.animation.AnimatorKt$addListener$3.INSTANCE
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            androidx.core.animation.AnimatorKt$addListener$4 r4 = androidx.core.animation.AnimatorKt$addListener$4.INSTANCE
        L18:
            androidx.core.animation.AnimatorKt$addListener$listener$1 r5 = new androidx.core.animation.AnimatorKt$addListener$listener$1
            r5.<init>(r4, r1, r3, r2)
            r0.addListener(r5)
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final android.animation.Animator.AnimatorPauseListener addPauseListener(@org.jetbrains.annotations.NotNull android.animation.Animator r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.n1> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.n1> r3) {
            androidx.core.animation.AnimatorKt$addPauseListener$listener$1 r0 = new androidx.core.animation.AnimatorKt$addPauseListener$listener$1
            r0.<init>(r3, r2)
            r1.addPauseListener(r0)
            return r0
    }

    public static /* synthetic */ android.animation.Animator.AnimatorPauseListener addPauseListener$default(android.animation.Animator r0, kotlin.jvm.functions.Function1 r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            androidx.core.animation.AnimatorKt$addPauseListener$1 r1 = androidx.core.animation.AnimatorKt$addPauseListener$1.INSTANCE
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            androidx.core.animation.AnimatorKt$addPauseListener$2 r2 = androidx.core.animation.AnimatorKt$addPauseListener$2.INSTANCE
        Lc:
            android.animation.Animator$AnimatorPauseListener r0 = addPauseListener(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.animation.Animator.AnimatorListener doOnCancel(@org.jetbrains.annotations.NotNull android.animation.Animator r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.n1> r2) {
            androidx.core.animation.AnimatorKt$doOnCancel$$inlined$addListener$default$1 r0 = new androidx.core.animation.AnimatorKt$doOnCancel$$inlined$addListener$default$1
            r0.<init>(r2)
            r1.addListener(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.animation.Animator.AnimatorListener doOnEnd(@org.jetbrains.annotations.NotNull android.animation.Animator r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.n1> r2) {
            androidx.core.animation.AnimatorKt$doOnEnd$$inlined$addListener$default$1 r0 = new androidx.core.animation.AnimatorKt$doOnEnd$$inlined$addListener$default$1
            r0.<init>(r2)
            r1.addListener(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.animation.Animator.AnimatorPauseListener doOnPause(@org.jetbrains.annotations.NotNull android.animation.Animator r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.n1> r3) {
            r0 = 0
            r1 = 1
            android.animation.Animator$AnimatorPauseListener r2 = addPauseListener$default(r2, r0, r3, r1, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final android.animation.Animator.AnimatorListener doOnRepeat(@org.jetbrains.annotations.NotNull android.animation.Animator r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.n1> r2) {
            androidx.core.animation.AnimatorKt$doOnRepeat$$inlined$addListener$default$1 r0 = new androidx.core.animation.AnimatorKt$doOnRepeat$$inlined$addListener$default$1
            r0.<init>(r2)
            r1.addListener(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.animation.Animator.AnimatorPauseListener doOnResume(@org.jetbrains.annotations.NotNull android.animation.Animator r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.n1> r3) {
            r0 = 0
            r1 = 2
            android.animation.Animator$AnimatorPauseListener r2 = addPauseListener$default(r2, r3, r0, r1, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final android.animation.Animator.AnimatorListener doOnStart(@org.jetbrains.annotations.NotNull android.animation.Animator r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.n1> r2) {
            androidx.core.animation.AnimatorKt$doOnStart$$inlined$addListener$default$1 r0 = new androidx.core.animation.AnimatorKt$doOnStart$$inlined$addListener$default$1
            r0.<init>(r2)
            r1.addListener(r0)
            return r0
    }
}
