package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e0 {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> b;

    public e0(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static /* synthetic */ kotlinx.coroutines.e0 d(kotlinx.coroutines.e0 r0, java.lang.Object r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.Object r1 = r0.a
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> r2 = r0.b
        Lc:
            kotlinx.coroutines.e0 r0 = r0.c(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a() {
            r1 = this;
            java.lang.Object r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> b() {
            r1 = this;
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.e0 c(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r3) {
            r1 = this;
            kotlinx.coroutines.e0 r0 = new kotlinx.coroutines.e0
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlinx.coroutines.e0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlinx.coroutines.e0 r5 = (kotlinx.coroutines.e0) r5
            java.lang.Object r1 = r4.a
            java.lang.Object r3 = r5.a
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> r1 = r4.b
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> r5 = r5.b
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 * 31
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> r1 = r2.b
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CompletedWithCancellation(result="
            r0.append(r1)
            java.lang.Object r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", onCancellation="
            r0.append(r1)
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> r1 = r2.b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
