package kotlin.collections.builders;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b {
    public static final /* synthetic */ boolean a(java.lang.Object[] r0, int r1, int r2, java.util.List r3) {
            boolean r0 = h(r0, r1, r2, r3)
            return r0
    }

    public static final /* synthetic */ int b(java.lang.Object[] r0, int r1, int r2) {
            int r0 = i(r0, r1, r2)
            return r0
    }

    public static final /* synthetic */ java.lang.String c(java.lang.Object[] r0, int r1, int r2, java.util.Collection r3) {
            java.lang.String r0 = j(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> E[] d(int r1) {
            if (r1 < 0) goto L5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            return r1
        L5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "capacity must be non-negative."
            r1.<init>(r0)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> T[] e(@org.jetbrains.annotations.NotNull T[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    public static final <E> void f(@org.jetbrains.annotations.NotNull E[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 0
            r1[r2] = r0
            return
    }

    public static final <E> void g(@org.jetbrains.annotations.NotNull E[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
        L5:
            if (r2 >= r3) goto Ld
            f(r1, r2)
            int r2 = r2 + 1
            goto L5
        Ld:
            return
    }

    private static final <T> boolean h(T[] r4, int r5, int r6, java.util.List<?> r7) {
            int r0 = r7.size()
            r1 = 0
            if (r6 == r0) goto L8
            return r1
        L8:
            r0 = 0
        L9:
            if (r0 >= r6) goto L1d
            int r2 = r5 + r0
            r2 = r4[r2]
            java.lang.Object r3 = r7.get(r0)
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 != 0) goto L1a
            return r1
        L1a:
            int r0 = r0 + 1
            goto L9
        L1d:
            r4 = 1
            return r4
    }

    private static final <T> int i(T[] r4, int r5, int r6) {
            r0 = 1
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r6) goto L17
            int r3 = r5 + r2
            r3 = r4[r3]
            int r0 = r0 * 31
            if (r3 == 0) goto L12
            int r3 = r3.hashCode()
            goto L13
        L12:
            r3 = 0
        L13:
            int r0 = r0 + r3
            int r2 = r2 + 1
            goto L3
        L17:
            return r0
    }

    private static final <T> java.lang.String j(T[] r3, int r4, int r5, java.util.Collection<? extends T> r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5 * 3
            int r1 = r1 + 2
            r0.<init>(r1)
            java.lang.String r1 = "["
            r0.append(r1)
            r1 = 0
        Lf:
            if (r1 >= r5) goto L2a
            if (r1 <= 0) goto L18
            java.lang.String r2 = ", "
            r0.append(r2)
        L18:
            int r2 = r4 + r1
            r2 = r3[r2]
            if (r2 != r6) goto L24
            java.lang.String r2 = "(this Collection)"
            r0.append(r2)
            goto L27
        L24:
            r0.append(r2)
        L27:
            int r1 = r1 + 1
            goto Lf
        L2a:
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "toString(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            return r3
    }
}
