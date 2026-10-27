package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class i0 extends kotlin.collections.h0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n*L\n1#1,70:1\n*E\n"})
    public static final class a<T> implements java.lang.Iterable<T>, l3.a {
        final /* synthetic */ kotlin.jvm.functions.Function0<java.util.Iterator<T>> a;

        public a(kotlin.jvm.functions.Function0<? extends java.util.Iterator<? extends T>> r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<T> iterator() {
                r1 = this;
                kotlin.jvm.functions.Function0<java.util.Iterator<T>> r0 = r1.a
                java.lang.Object r0 = r0.invoke()
                java.util.Iterator r0 = (java.util.Iterator) r0
                return r0
        }
    }

    public i0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Iterable<T> c0(kotlin.jvm.functions.Function0<? extends java.util.Iterator<? extends T>> r1) {
            java.lang.String r0 = "iterator"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.i0$a r0 = new kotlin.collections.i0$a
            r0.<init>(r1)
            return r0
    }

    @kotlin.PublishedApi
    public static <T> int d0(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L10
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            return r1
        L10:
            return r2
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Integer e0(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L14
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L14:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> f0(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends java.lang.Iterable<? extends T>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r2.next()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.collections.m0.s0(r0, r1)
            goto Le
        L1e:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlin.Pair<java.util.List<T>, java.util.List<R>> g0(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends kotlin.Pair<? extends T, ? extends R>> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 10
            int r0 = d0(r4, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r4 = r4.iterator()
        L19:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r4.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r3 = r0.getFirst()
            r1.add(r3)
            java.lang.Object r0 = r0.getSecond()
            r2.add(r0)
            goto L19
        L34:
            kotlin.Pair r4 = kotlin.o0.a(r1, r2)
            return r4
    }
}
