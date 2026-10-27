package androidx.core.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n1#1,76:1\n59#1,16:77\n59#1,16:93\n59#1,16:109\n59#1,16:125\n59#1,16:141\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n26#1:77,16\n33#1:93,16\n40#1:109,16\n47#1:125,16\n54#1:141,16\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class TransitionKt {
    @org.jetbrains.annotations.NotNull
    public static final android.transition.Transition.TransitionListener addListener(@org.jetbrains.annotations.NotNull android.transition.Transition r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.n1> r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.n1> r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.n1> r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.n1> r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.n1> r11) {
            androidx.core.transition.TransitionKt$addListener$listener$1 r0 = new androidx.core.transition.TransitionKt$addListener$listener$1
            r1 = r7
            r5 = r8
            r4 = r9
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.addListener(r0)
            return r0
    }

    public static /* synthetic */ android.transition.Transition.TransitionListener addListener$default(android.transition.Transition r0, kotlin.jvm.functions.Function1 r1, kotlin.jvm.functions.Function1 r2, kotlin.jvm.functions.Function1 r3, kotlin.jvm.functions.Function1 r4, kotlin.jvm.functions.Function1 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L6
            androidx.core.transition.TransitionKt$addListener$1 r1 = androidx.core.transition.TransitionKt$addListener$1.INSTANCE
        L6:
            r7 = r6 & 2
            if (r7 == 0) goto Lc
            androidx.core.transition.TransitionKt$addListener$2 r2 = androidx.core.transition.TransitionKt$addListener$2.INSTANCE
        Lc:
            r7 = r2
            r2 = r6 & 4
            if (r2 == 0) goto L13
            androidx.core.transition.TransitionKt$addListener$3 r3 = androidx.core.transition.TransitionKt$addListener$3.INSTANCE
        L13:
            r2 = r6 & 8
            if (r2 == 0) goto L19
            androidx.core.transition.TransitionKt$addListener$4 r4 = androidx.core.transition.TransitionKt$addListener$4.INSTANCE
        L19:
            r2 = r6 & 16
            if (r2 == 0) goto L1f
            androidx.core.transition.TransitionKt$addListener$5 r5 = androidx.core.transition.TransitionKt$addListener$5.INSTANCE
        L1f:
            androidx.core.transition.TransitionKt$addListener$listener$1 r2 = new androidx.core.transition.TransitionKt$addListener$listener$1
            r6 = r3
            r3 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            r0.addListener(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final android.transition.Transition.TransitionListener doOnCancel(@org.jetbrains.annotations.NotNull android.transition.Transition r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.n1> r2) {
            androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1 r0 = new androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            r0.<init>(r2)
            r1.addListener(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.transition.Transition.TransitionListener doOnEnd(@org.jetbrains.annotations.NotNull android.transition.Transition r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.n1> r2) {
            androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1 r0 = new androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            r0.<init>(r2)
            r1.addListener(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.transition.Transition.TransitionListener doOnPause(@org.jetbrains.annotations.NotNull android.transition.Transition r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.n1> r2) {
            androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1 r0 = new androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            r0.<init>(r2)
            r1.addListener(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.transition.Transition.TransitionListener doOnResume(@org.jetbrains.annotations.NotNull android.transition.Transition r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.n1> r2) {
            androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1 r0 = new androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            r0.<init>(r2)
            r1.addListener(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.transition.Transition.TransitionListener doOnStart(@org.jetbrains.annotations.NotNull android.transition.Transition r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.n1> r2) {
            androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1 r0 = new androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            r0.<init>(r2)
            r1.addListener(r0)
            return r0
    }
}
