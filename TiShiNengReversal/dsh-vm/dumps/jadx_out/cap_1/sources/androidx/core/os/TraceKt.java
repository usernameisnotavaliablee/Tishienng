package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class TraceKt {
    @kotlin.Deprecated(message = "Use androidx.tracing.Trace instead", replaceWith = @kotlin.ReplaceWith(expression = "trace(sectionName, block)", imports = {"androidx.tracing.trace"}))
    public static final <T> T trace(@org.jetbrains.annotations.NotNull java.lang.String r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r1) {
            android.os.Trace.beginSection(r0)
            r0 = 1
            java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Throwable -> L12
            kotlin.jvm.internal.d0.d(r0)
            android.os.Trace.endSection()
            kotlin.jvm.internal.d0.c(r0)
            return r1
        L12:
            r1 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            android.os.Trace.endSection()
            kotlin.jvm.internal.d0.c(r0)
            throw r1
    }
}
