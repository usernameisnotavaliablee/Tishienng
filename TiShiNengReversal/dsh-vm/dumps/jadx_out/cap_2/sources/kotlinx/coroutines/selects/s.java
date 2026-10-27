package kotlinx.coroutines.selects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.PublishedApi
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSelectUnbiased.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1855#2,2:69\n*S KotlinDebug\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n*L\n63#1:69,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class s<R> extends kotlinx.coroutines.selects.l<R> {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlinx.coroutines.selects.l<R>.a> g;

    public s(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.g = r1
            return
    }

    @kotlin.PublishedApi
    static /* synthetic */ <R> java.lang.Object O(kotlinx.coroutines.selects.s<R> r0, kotlin.coroutines.e<? super R> r1) {
            r0.P()
            java.lang.Object r0 = super.y(r1)
            return r0
    }

    private final void P() {
            r5 = this;
            java.util.List<kotlinx.coroutines.selects.l<R>$a> r0 = r5.g     // Catch: java.lang.Throwable -> L20
            java.util.Collections.shuffle(r0)     // Catch: java.lang.Throwable -> L20
            java.util.List<kotlinx.coroutines.selects.l<R>$a> r0 = r5.g     // Catch: java.lang.Throwable -> L20
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L20
        Ld:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L20
            kotlinx.coroutines.selects.l$a r1 = (kotlinx.coroutines.selects.l.a) r1     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r3 = 0
            r4 = 0
            kotlinx.coroutines.selects.l.I(r5, r1, r4, r2, r3)     // Catch: java.lang.Throwable -> L20
            goto Ld
        L20:
            r0 = move-exception
            goto L28
        L22:
            java.util.List<kotlinx.coroutines.selects.l<R>$a> r0 = r5.g
            r0.clear()
            return
        L28:
            java.util.List<kotlinx.coroutines.selects.l<R>$a> r1 = r5.g
            r1.clear()
            throw r0
    }

    @Override // kotlinx.coroutines.selects.l, kotlinx.coroutines.selects.c
    public void a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.e r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r11) {
            r9 = this;
            java.util.List<kotlinx.coroutines.selects.l<R>$a> r0 = r9.g
            java.util.Collection r0 = (java.util.Collection) r0
            kotlinx.coroutines.selects.l$a r1 = new kotlinx.coroutines.selects.l$a
            java.lang.Object r3 = r10.d()
            kotlin.jvm.functions.Function3 r4 = r10.c()
            kotlin.jvm.functions.Function3 r5 = r10.b()
            kotlinx.coroutines.internal.s0 r6 = kotlinx.coroutines.selects.o.l()
            kotlin.jvm.functions.Function3 r8 = r10.a()
            r2 = r9
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.add(r1)
            return
    }

    @Override // kotlinx.coroutines.selects.l, kotlinx.coroutines.selects.c
    public <P, Q> void c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.i<? super P, ? extends Q> r10, P r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r12) {
            r9 = this;
            java.util.List<kotlinx.coroutines.selects.l<R>$a> r0 = r9.g
            java.util.Collection r0 = (java.util.Collection) r0
            kotlinx.coroutines.selects.l$a r1 = new kotlinx.coroutines.selects.l$a
            java.lang.Object r3 = r10.d()
            kotlin.jvm.functions.Function3 r4 = r10.c()
            kotlin.jvm.functions.Function3 r5 = r10.b()
            kotlin.jvm.functions.Function3 r8 = r10.a()
            r2 = r9
            r6 = r11
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.add(r1)
            return
    }

    @Override // kotlinx.coroutines.selects.l, kotlinx.coroutines.selects.c
    public <Q> void k(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.g<? extends Q> r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r11) {
            r9 = this;
            java.util.List<kotlinx.coroutines.selects.l<R>$a> r0 = r9.g
            java.util.Collection r0 = (java.util.Collection) r0
            kotlinx.coroutines.selects.l$a r1 = new kotlinx.coroutines.selects.l$a
            java.lang.Object r3 = r10.d()
            kotlin.jvm.functions.Function3 r4 = r10.c()
            kotlin.jvm.functions.Function3 r5 = r10.b()
            r6 = 0
            kotlin.jvm.functions.Function3 r8 = r10.a()
            r2 = r9
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.add(r1)
            return
    }

    @Override // kotlinx.coroutines.selects.l
    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public java.lang.Object y(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r1) {
            r0 = this;
            java.lang.Object r1 = O(r0, r1)
            return r1
    }
}
