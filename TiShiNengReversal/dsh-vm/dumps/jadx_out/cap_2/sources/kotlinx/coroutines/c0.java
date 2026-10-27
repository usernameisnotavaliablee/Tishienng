package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CompletedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,662:1\n1#2:663\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class c0 {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.n b;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> c;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object d;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final java.lang.Throwable e;

    public c0(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable kotlinx.coroutines.n r2, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Throwable r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public /* synthetic */ c0(java.lang.Object r2, kotlinx.coroutines.n r3, kotlin.jvm.functions.Function1 r4, java.lang.Object r5, java.lang.Throwable r6, int r7, kotlin.jvm.internal.v r8) {
            r1 = this;
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto L6
            r3 = r0
        L6:
            r8 = r7 & 4
            if (r8 == 0) goto Lb
            r4 = r0
        Lb:
            r8 = r7 & 8
            if (r8 == 0) goto L10
            r5 = r0
        L10:
            r7 = r7 & 16
            if (r7 == 0) goto L1b
            r7 = r0
        L15:
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            goto L1d
        L1b:
            r7 = r6
            goto L15
        L1d:
            r2.<init>(r3, r4, r5, r6, r7)
            return
    }

    public static /* synthetic */ kotlinx.coroutines.c0 g(kotlinx.coroutines.c0 r0, java.lang.Object r1, kotlinx.coroutines.n r2, kotlin.jvm.functions.Function1 r3, java.lang.Object r4, java.lang.Throwable r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L6
            java.lang.Object r1 = r0.a
        L6:
            r7 = r6 & 2
            if (r7 == 0) goto Lc
            kotlinx.coroutines.n r2 = r0.b
        Lc:
            r7 = r6 & 4
            if (r7 == 0) goto L12
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> r3 = r0.c
        L12:
            r7 = r6 & 8
            if (r7 == 0) goto L18
            java.lang.Object r4 = r0.d
        L18:
            r6 = r6 & 16
            if (r6 == 0) goto L1e
            java.lang.Throwable r5 = r0.e
        L1e:
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r2 = r0
            r3 = r1
            kotlinx.coroutines.c0 r0 = r2.f(r3, r4, r5, r6, r7)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a() {
            r1 = this;
            java.lang.Object r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.n b() {
            r1 = this;
            kotlinx.coroutines.n r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> c() {
            r1 = this;
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object d() {
            r1 = this;
            java.lang.Object r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Throwable e() {
            r1 = this;
            java.lang.Throwable r0 = r1.e
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlinx.coroutines.c0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlinx.coroutines.c0 r5 = (kotlinx.coroutines.c0) r5
            java.lang.Object r1 = r4.a
            java.lang.Object r3 = r5.a
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            kotlinx.coroutines.n r1 = r4.b
            kotlinx.coroutines.n r3 = r5.b
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> r1 = r4.c
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> r3 = r5.c
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.Object r1 = r4.d
            java.lang.Object r3 = r5.d
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.Throwable r1 = r4.e
            java.lang.Throwable r5 = r5.e
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.c0 f(@org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.Nullable kotlinx.coroutines.n r8, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r9, @org.jetbrains.annotations.Nullable java.lang.Object r10, @org.jetbrains.annotations.Nullable java.lang.Throwable r11) {
            r6 = this;
            kotlinx.coroutines.c0 r0 = new kotlinx.coroutines.c0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final boolean h() {
            r1 = this;
            java.lang.Throwable r0 = r1.e
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.a
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            kotlinx.coroutines.n r2 = r3.b
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> r2 = r3.c
            if (r2 != 0) goto L20
            r2 = 0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Object r2 = r3.d
            if (r2 != 0) goto L2d
            r2 = 0
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Throwable r2 = r3.e
            if (r2 != 0) goto L39
            goto L3d
        L39:
            int r1 = r2.hashCode()
        L3d:
            int r0 = r0 + r1
            return r0
    }

    public final void i(@org.jetbrains.annotations.NotNull kotlinx.coroutines.q<?> r2, @org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
            r1 = this;
            kotlinx.coroutines.n r0 = r1.b
            if (r0 == 0) goto L7
            r2.m(r0, r3)
        L7:
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> r0 = r1.c
            if (r0 == 0) goto Le
            r2.p(r0, r3)
        Le:
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CompletedContinuation(result="
            r0.append(r1)
            java.lang.Object r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", cancelHandler="
            r0.append(r1)
            kotlinx.coroutines.n r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", onCancellation="
            r0.append(r1)
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", idempotentResume="
            r0.append(r1)
            java.lang.Object r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", cancelCause="
            r0.append(r1)
            java.lang.Throwable r1 = r2.e
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
