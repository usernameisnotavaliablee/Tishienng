package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FullyDrawnReporterKt {
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object reportWhenComplete(@org.jetbrains.annotations.NotNull androidx.activity.FullyDrawnReporter r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r6) {
            boolean r0 = r6 instanceof androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = (androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = new androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            androidx.activity.FullyDrawnReporter r4 = (androidx.activity.FullyDrawnReporter) r4
            kotlin.g0.n(r6)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L5d
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.g0.n(r6)
            r4.addReporter()
            boolean r6 = r4.isFullyDrawnReported()
            if (r6 == 0) goto L46
            kotlin.n1 r4 = kotlin.n1.a
            return r4
        L46:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2d
            r0.label = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L51
            return r1
        L51:
            kotlin.jvm.internal.d0.d(r3)
            r4.removeReporter()
            kotlin.jvm.internal.d0.c(r3)
            kotlin.n1 r4 = kotlin.n1.a
            return r4
        L5d:
            kotlin.jvm.internal.d0.d(r3)
            r4.removeReporter()
            kotlin.jvm.internal.d0.c(r3)
            throw r5
    }

    private static final java.lang.Object reportWhenComplete$$forInline(androidx.activity.FullyDrawnReporter r1, kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2, kotlin.coroutines.e<? super kotlin.n1> r3) {
            r1.addReporter()
            boolean r0 = r1.isFullyDrawnReported()
            if (r0 == 0) goto Lc
            kotlin.n1 r1 = kotlin.n1.a
            return r1
        Lc:
            r0 = 1
            r2.invoke(r3)     // Catch: java.lang.Throwable -> L1c
            kotlin.jvm.internal.d0.d(r0)
            r1.removeReporter()
            kotlin.jvm.internal.d0.c(r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
        L1c:
            r2 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            r1.removeReporter()
            kotlin.jvm.internal.d0.c(r0)
            throw r2
    }
}
