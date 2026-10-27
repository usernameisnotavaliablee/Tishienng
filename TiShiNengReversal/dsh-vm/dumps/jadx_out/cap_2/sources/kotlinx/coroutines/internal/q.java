package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmInline
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nInlineList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class q<E> {

    @org.jetbrains.annotations.Nullable
    private final java.lang.Object a;

    private /* synthetic */ q(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.q a(java.lang.Object r1) {
            kotlinx.coroutines.internal.q r0 = new kotlinx.coroutines.internal.q
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <E> java.lang.Object b(@org.jetbrains.annotations.Nullable java.lang.Object r0) {
            return r0
    }

    public static /* synthetic */ java.lang.Object c(java.lang.Object r0, int r1, kotlin.jvm.internal.v r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            java.lang.Object r0 = b(r0)
            return r0
    }

    public static boolean d(java.lang.Object r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof kotlinx.coroutines.internal.q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlinx.coroutines.internal.q r3 = (kotlinx.coroutines.internal.q) r3
            java.lang.Object r3 = r3.j()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 != 0) goto L13
            return r1
        L13:
            r2 = 1
            return r2
    }

    public static final boolean e(java.lang.Object r0, java.lang.Object r1) {
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            return r0
    }

    public static final void f(java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, kotlin.n1> r3) {
            if (r2 != 0) goto L3
            goto L25
        L3:
            boolean r0 = r2 instanceof java.util.ArrayList
            if (r0 != 0) goto Lb
            r3.invoke(r2)
            return
        Lb:
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.g0.n(r2, r0)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L18:
            r1 = -1
            if (r1 >= r0) goto L25
            java.lang.Object r1 = r2.get(r0)
            r3.invoke(r1)
            int r0 = r0 + (-1)
            goto L18
        L25:
            return
    }

    public static int g(java.lang.Object r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r0.hashCode()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Object h(java.lang.Object r2, E r3) {
            if (r2 != 0) goto L7
            java.lang.Object r2 = b(r3)
            return r2
        L7:
            boolean r0 = r2 instanceof java.util.ArrayList
            if (r0 == 0) goto L1b
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.g0.n(r2, r0)
            r0 = r2
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r3)
            java.lang.Object r2 = b(r2)
            return r2
        L1b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            r0.add(r2)
            r0.add(r3)
            java.lang.Object r2 = b(r0)
            return r2
    }

    public static java.lang.String i(java.lang.Object r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "InlineList(holder="
            r0.append(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.a
            boolean r2 = d(r0, r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.a
            int r0 = g(r0)
            return r0
    }

    public final /* synthetic */ java.lang.Object j() {
            r1 = this;
            java.lang.Object r0 = r1.a
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Object r0 = r1.a
            java.lang.String r0 = i(r0)
            return r0
    }
}
