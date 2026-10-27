package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class m {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {26}, m = "toCollection", n = {"destination"}, s = {"L$0"})
    static final class a<T, C extends java.util.Collection<? super T>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        /* synthetic */ java.lang.Object b;
        int c;

        a(kotlin.coroutines.e<? super kotlinx.coroutines.flow.m.a> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.b = r2
                int r2 = r1.c
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.c = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.flow.k.X1(r2, r2, r1)
                return r2
        }
    }

    /* JADX WARN: Incorrect field signature: TC; */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> implements kotlinx.coroutines.flow.j {
        final /* synthetic */ java.util.Collection a;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        b(java.util.Collection r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.j
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object emit(T r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                java.util.Collection r2 = r0.a
                r2.add(r1)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }
    }

    @org.jetbrains.annotations.Nullable
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r4, @org.jetbrains.annotations.NotNull C r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super C> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.m.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.m$a r0 = (kotlinx.coroutines.flow.m.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.m$a r0 = new kotlinx.coroutines.flow.m$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.a
            java.util.Collection r4 = (java.util.Collection) r4
            kotlin.g0.n(r6)
            return r4
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.g0.n(r6)
            kotlinx.coroutines.flow.m$b r6 = new kotlinx.coroutines.flow.m$b
            r6.<init>(r5)
            r0.a = r5
            r0.c = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L48
            return r1
        L48:
            return r5
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull java.util.List<T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<? extends T>> r2) {
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r0 = kotlinx.coroutines.flow.k.X1(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Object c(kotlinx.coroutines.flow.i r0, java.util.List r1, kotlin.coroutines.e r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L9:
            java.lang.Object r0 = kotlinx.coroutines.flow.k.Y1(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull java.util.Set<T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.Set<? extends T>> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.k.X1(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Object e(kotlinx.coroutines.flow.i r0, java.util.Set r1, kotlin.coroutines.e r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L9
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
        L9:
            java.lang.Object r0 = kotlinx.coroutines.flow.k.a2(r0, r1, r2)
            return r0
    }
}
