package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exceptions.kt\nkotlinx/coroutines/JobCancellationException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,76:1\n26#2:77\n*S KotlinDebug\n*F\n+ 1 Exceptions.kt\nkotlinx/coroutines/JobCancellationException\n*L\n44#1:77\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class JobCancellationException extends java.util.concurrent.CancellationException implements kotlinx.coroutines.k0<kotlinx.coroutines.JobCancellationException> {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final transient kotlinx.coroutines.e2 job;

    public JobCancellationException(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.Throwable r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r3) {
            r0 = this;
            r0.<init>(r1)
            r0.job = r3
            if (r2 == 0) goto La
            r0.initCause(r2)
        La:
            return
    }

    @Override // kotlinx.coroutines.k0
    public /* bridge */ /* synthetic */ kotlinx.coroutines.JobCancellationException createCopy() {
            r1 = this;
            kotlinx.coroutines.JobCancellationException r0 = r1.createCopy2()
            return r0
    }

    @Override // kotlinx.coroutines.k0
    @org.jetbrains.annotations.Nullable
    /* renamed from: createCopy, reason: avoid collision after fix types in other method */
    public kotlinx.coroutines.JobCancellationException createCopy2() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            if (r3 == r2) goto L31
            boolean r0 = r3 instanceof kotlinx.coroutines.JobCancellationException
            if (r0 == 0) goto L2f
            kotlinx.coroutines.JobCancellationException r3 = (kotlinx.coroutines.JobCancellationException) r3
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = r2.getMessage()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L2f
            kotlinx.coroutines.e2 r0 = r3.job
            kotlinx.coroutines.e2 r1 = r2.job
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L2f
            java.lang.Throwable r3 = r3.getCause()
            java.lang.Throwable r0 = r2.getCause()
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r3 == 0) goto L2f
            goto L31
        L2f:
            r3 = 0
            return r3
        L31:
            r3 = 1
            return r3
    }

    @Override // java.lang.Throwable
    @org.jetbrains.annotations.NotNull
    public java.lang.Throwable fillInStackTrace() {
            r1 = this;
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r1.setStackTrace(r0)
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.getMessage()
            kotlin.jvm.internal.g0.m(r0)
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            kotlinx.coroutines.e2 r1 = r2.job
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Throwable r1 = r2.getCause()
            if (r1 == 0) goto L21
            int r1 = r1.hashCode()
            goto L22
        L21:
            r1 = 0
        L22:
            int r0 = r0 + r1
            return r0
    }

    @Override // java.lang.Throwable
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "; job="
            r0.append(r1)
            kotlinx.coroutines.e2 r1 = r2.job
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
