package kotlin.reflect.jvm.internal.impl.km.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFlagDelegatesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlagDelegatesImpl.kt\nkotlin/metadata/internal/BooleanFlagDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a<Node> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.l<Node, java.lang.Integer> a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.km.internal.d b;
    private final int c;

    public a(@org.jetbrains.annotations.NotNull kotlin.reflect.l<Node, java.lang.Integer> r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.d r3) {
            r1 = this;
            java.lang.String r0 = "flags"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "flag"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            int r2 = r3.a()
            r0 = 1
            if (r2 != r0) goto L27
            int r2 = r3.c()
            if (r2 != r0) goto L27
            int r2 = r3.b()
            int r2 = r0 << r2
            r1.c = r2
            return
        L27:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = " was passed"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public final boolean a(Node r2, @org.jetbrains.annotations.NotNull kotlin.reflect.n<?> r3) {
            r1 = this;
            java.lang.String r0 = "property"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.km.internal.d r3 = r1.b
            kotlin.reflect.l<Node, java.lang.Integer> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            boolean r2 = r3.d(r2)
            return r2
    }

    public final void b(Node r2, @org.jetbrains.annotations.NotNull kotlin.reflect.n<?> r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "property"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.l<Node, java.lang.Integer> r3 = r1.a
            java.lang.Object r3 = r3.get(r2)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r4 == 0) goto L17
            int r4 = r1.c
            r3 = r3 | r4
            goto L1b
        L17:
            int r4 = r1.c
            int r4 = ~r4
            r3 = r3 & r4
        L1b:
            kotlin.reflect.l<Node, java.lang.Integer> r4 = r1.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.set(r2, r3)
            return
    }
}
