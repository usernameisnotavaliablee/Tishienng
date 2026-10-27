package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,245:1\n95#2,5:246\n*S KotlinDebug\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n*L\n226#1:246,5\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e {
    public static final /* synthetic */ kotlinx.coroutines.flow.j a(kotlinx.coroutines.flow.j r0, kotlin.coroutines.i r1) {
            kotlinx.coroutines.flow.j r0 = e(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.internal.d<T> b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.d
            if (r0 == 0) goto L8
            r0 = r8
            kotlinx.coroutines.flow.internal.d r0 = (kotlinx.coroutines.flow.internal.d) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 != 0) goto L18
            kotlinx.coroutines.flow.internal.h r1 = new kotlinx.coroutines.flow.internal.h
            r6 = 14
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L18:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T, V> java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, V r3, @org.jetbrains.annotations.NotNull java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super V, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r6) {
            java.lang.Object r4 = kotlinx.coroutines.internal.y0.c(r2, r4)
            kotlinx.coroutines.flow.internal.v r0 = new kotlinx.coroutines.flow.internal.v     // Catch: java.lang.Throwable -> L21
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L21
            r1 = 2
            java.lang.Object r5 = kotlin.jvm.internal.u0.q(r5, r1)     // Catch: java.lang.Throwable -> L21
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5     // Catch: java.lang.Throwable -> L21
            java.lang.Object r3 = r5.invoke(r3, r0)     // Catch: java.lang.Throwable -> L21
            kotlinx.coroutines.internal.y0.a(r2, r4)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r2) goto L20
            kotlin.coroutines.jvm.internal.e.c(r6)
        L20:
            return r3
        L21:
            r3 = move-exception
            kotlinx.coroutines.internal.y0.a(r2, r4)
            throw r3
    }

    public static /* synthetic */ java.lang.Object d(kotlin.coroutines.i r0, java.lang.Object r1, java.lang.Object r2, kotlin.jvm.functions.Function2 r3, kotlin.coroutines.e r4, int r5, java.lang.Object r6) {
            r5 = r5 & 4
            if (r5 == 0) goto L8
            java.lang.Object r2 = kotlinx.coroutines.internal.y0.b(r0)
        L8:
            java.lang.Object r0 = c(r0, r1, r2, r3, r4)
            return r0
    }

    private static final <T> kotlinx.coroutines.flow.j<T> e(kotlinx.coroutines.flow.j<? super T> r1, kotlin.coroutines.i r2) {
            boolean r0 = r1 instanceof kotlinx.coroutines.flow.internal.u
            if (r0 == 0) goto L6
            r0 = 1
            goto L8
        L6:
            boolean r0 = r1 instanceof kotlinx.coroutines.flow.internal.r
        L8:
            if (r0 == 0) goto Lb
            return r1
        Lb:
            kotlinx.coroutines.flow.internal.x r0 = new kotlinx.coroutines.flow.internal.x
            r0.<init>(r1, r2)
            return r0
    }
}
