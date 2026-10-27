package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d3 {
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.b0 a(@org.jetbrains.annotations.Nullable kotlinx.coroutines.e2 r1) {
            kotlinx.coroutines.c3 r0 = new kotlinx.coroutines.c3
            r0.<init>(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    @kotlin.jvm.JvmName(name = "SupervisorJob")
    public static final /* synthetic */ kotlinx.coroutines.e2 b(kotlinx.coroutines.e2 r0) {
            kotlinx.coroutines.b0 r0 = a(r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.b0 c(kotlinx.coroutines.e2 r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.b0 r0 = a(r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.e2 d(kotlinx.coroutines.e2 r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.e2 r0 = b(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object e(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r3) {
            kotlinx.coroutines.b3 r0 = new kotlinx.coroutines.b3
            kotlin.coroutines.i r1 = r3.getContext()
            r0.<init>(r1, r3)
            java.lang.Object r2 = n4.b.e(r0, r0, r2)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r0) goto L16
            kotlin.coroutines.jvm.internal.e.c(r3)
        L16:
            return r2
    }
}
