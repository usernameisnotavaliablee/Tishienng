package kotlin.reflect.jvm.internal.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class b {

    /* JADX INFO: Add missing generic type declarations: [N] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a<N> extends kotlin.reflect.jvm.internal.impl.utils.b.AbstractC0078b<N, java.lang.Boolean> {
        final /* synthetic */ kotlin.jvm.functions.Function1 a;
        final /* synthetic */ boolean[] b;

        a(kotlin.jvm.functions.Function1 r1, boolean[] r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        public /* bridge */ /* synthetic */ java.lang.Object a() {
                r1 = this;
                java.lang.Boolean r0 = r1.d()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC0078b, kotlin.reflect.jvm.internal.impl.utils.b.e
        public boolean b(N r3) {
                r2 = this;
                kotlin.jvm.functions.Function1 r0 = r2.a
                java.lang.Object r3 = r0.invoke(r3)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                r0 = 1
                r1 = 0
                if (r3 == 0) goto L14
                boolean[] r3 = r2.b
                r3[r1] = r0
            L14:
                boolean[] r3 = r2.b
                boolean r3 = r3[r1]
                r3 = r3 ^ r0
                return r3
        }

        public java.lang.Boolean d() {
                r2 = this;
                boolean[] r0 = r2.b
                r1 = 0
                boolean r0 = r0[r1]
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0078b<N, R> implements kotlin.reflect.jvm.internal.impl.utils.b.e<N, R> {
        public AbstractC0078b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        public boolean b(N r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        public void c(N r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class c<N, R, C extends java.lang.Iterable<R>> extends kotlin.reflect.jvm.internal.impl.utils.b.AbstractC0078b<N, C> {

        @org.jetbrains.annotations.NotNull
        protected final C a;

        protected c(@org.jetbrains.annotations.NotNull C r2) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 0
                d(r0)
            L6:
                r1.<init>()
                r1.a = r2
                return
        }

        private static /* synthetic */ void d(int r7) {
                r0 = 1
                if (r7 == r0) goto L6
                java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto L8
            L6:
                java.lang.String r1 = "@NotNull method %s.%s must not return null"
            L8:
                r2 = 2
                if (r7 == r0) goto Ld
                r3 = 3
                goto Le
            Ld:
                r3 = 2
            Le:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler"
                java.lang.String r5 = "result"
                r6 = 0
                if (r7 == r0) goto L1a
                r3[r6] = r5
                goto L1c
            L1a:
                r3[r6] = r4
            L1c:
                if (r7 == r0) goto L21
                r3[r0] = r4
                goto L23
            L21:
                r3[r0] = r5
            L23:
                if (r7 == r0) goto L29
                java.lang.String r4 = "<init>"
                r3[r2] = r4
            L29:
                java.lang.String r1 = java.lang.String.format(r1, r3)
                if (r7 == r0) goto L35
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                r7.<init>(r1)
                goto L3a
            L35:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                r7.<init>(r1)
            L3a:
                throw r7
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ java.lang.Object a() {
                r1 = this;
                java.lang.Iterable r0 = r1.e()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public C e() {
                r2 = this;
                C extends java.lang.Iterable<R> r0 = r2.a
                if (r0 != 0) goto L8
                r1 = 1
                d(r1)
            L8:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d<N> {
        @org.jetbrains.annotations.NotNull
        java.lang.Iterable<? extends N> a(N r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface e<N, R> {
        R a();

        boolean b(N r1);

        void c(N r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class f<N, R> extends kotlin.reflect.jvm.internal.impl.utils.b.c<N, R, java.util.LinkedList<R>> {
        protected f() {
                r1 = this;
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                r1.<init>(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface g<N> {
        boolean a(N r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class h<N> implements kotlin.reflect.jvm.internal.impl.utils.b.g<N> {
        private final java.util.Set<N> a;

        public h() {
                r1 = this;
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.<init>(r0)
                return
        }

        public h(@org.jetbrains.annotations.NotNull java.util.Set<N> r2) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 0
                b(r0)
            L6:
                r1.<init>()
                r1.a = r2
                return
        }

        private static /* synthetic */ void b(int r2) {
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r0 = "visited"
                r1 = 0
                r2[r1] = r0
                java.lang.String r0 = "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet"
                r1 = 1
                r2[r1] = r0
                java.lang.String r0 = "<init>"
                r1 = 2
                r2[r1] = r0
                java.lang.String r0 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r2 = java.lang.String.format(r0, r2)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r2)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.g
        public boolean a(N r2) {
                r1 = this;
                java.util.Set<N> r0 = r1.a
                boolean r2 = r0.add(r2)
                return r2
        }
    }

    private static /* synthetic */ void a(int r3) {
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            switch(r3) {
                case 1: goto L25;
                case 2: goto L20;
                case 3: goto L1b;
                case 4: goto L7;
                case 5: goto L25;
                case 6: goto L1b;
                case 7: goto L7;
                case 8: goto L25;
                case 9: goto L16;
                case 10: goto L11;
                case 11: goto L25;
                case 12: goto L20;
                case 13: goto L1b;
                case 14: goto L11;
                case 15: goto L25;
                case 16: goto L20;
                case 17: goto L7;
                case 18: goto L25;
                case 19: goto L20;
                case 20: goto L7;
                case 21: goto L25;
                case 22: goto Lc;
                case 23: goto L25;
                case 24: goto L20;
                case 25: goto L1b;
                default: goto L7;
            }
        L7:
            java.lang.String r2 = "nodes"
            r0[r1] = r2
            goto L29
        Lc:
            java.lang.String r2 = "current"
            r0[r1] = r2
            goto L29
        L11:
            java.lang.String r2 = "node"
            r0[r1] = r2
            goto L29
        L16:
            java.lang.String r2 = "predicate"
            r0[r1] = r2
            goto L29
        L1b:
            java.lang.String r2 = "handler"
            r0[r1] = r2
            goto L29
        L20:
            java.lang.String r2 = "visited"
            r0[r1] = r2
            goto L29
        L25:
            java.lang.String r2 = "neighbors"
            r0[r1] = r2
        L29:
            r1 = 1
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/utils/DFS"
            r0[r1] = r2
            r1 = 2
            switch(r3) {
                case 7: goto L46;
                case 8: goto L46;
                case 9: goto L46;
                case 10: goto L41;
                case 11: goto L41;
                case 12: goto L41;
                case 13: goto L41;
                case 14: goto L41;
                case 15: goto L41;
                case 16: goto L41;
                case 17: goto L3c;
                case 18: goto L3c;
                case 19: goto L3c;
                case 20: goto L3c;
                case 21: goto L3c;
                case 22: goto L37;
                case 23: goto L37;
                case 24: goto L37;
                case 25: goto L37;
                default: goto L32;
            }
        L32:
            java.lang.String r3 = "dfs"
            r0[r1] = r3
            goto L4a
        L37:
            java.lang.String r3 = "doDfs"
            r0[r1] = r3
            goto L4a
        L3c:
            java.lang.String r3 = "topologicalOrder"
            r0[r1] = r3
            goto L4a
        L41:
            java.lang.String r3 = "dfsFromNode"
            r0[r1] = r3
            goto L4a
        L46:
            java.lang.String r3 = "ifAny"
            r0[r1] = r3
        L4a:
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
    }

    public static <N, R> R b(@org.jetbrains.annotations.NotNull java.util.Collection<N> r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.utils.b.d<N> r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.utils.b.e<N, R> r3) {
            if (r1 != 0) goto L6
            r0 = 4
            a(r0)
        L6:
            if (r2 != 0) goto Lc
            r0 = 5
            a(r0)
        Lc:
            if (r3 != 0) goto L12
            r0 = 6
            a(r0)
        L12:
            kotlin.reflect.jvm.internal.impl.utils.b$h r0 = new kotlin.reflect.jvm.internal.impl.utils.b$h
            r0.<init>()
            java.lang.Object r1 = c(r1, r2, r0, r3)
            return r1
    }

    public static <N, R> R c(@org.jetbrains.annotations.NotNull java.util.Collection<N> r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.utils.b.d<N> r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.utils.b.g<N> r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.utils.b.e<N, R> r4) {
            if (r1 != 0) goto L6
            r0 = 0
            a(r0)
        L6:
            if (r2 != 0) goto Lc
            r0 = 1
            a(r0)
        Lc:
            if (r3 != 0) goto L12
            r0 = 2
            a(r0)
        L12:
            if (r4 != 0) goto L18
            r0 = 3
            a(r0)
        L18:
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r1.next()
            d(r0, r2, r3, r4)
            goto L1c
        L2a:
            java.lang.Object r1 = r4.a()
            return r1
    }

    public static <N> void d(@org.jetbrains.annotations.NotNull N r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.utils.b.d<N> r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.utils.b.g<N> r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.utils.b.e<N, ?> r5) {
            if (r2 != 0) goto L7
            r0 = 22
            a(r0)
        L7:
            if (r3 != 0) goto Le
            r0 = 23
            a(r0)
        Le:
            if (r4 != 0) goto L15
            r0 = 24
            a(r0)
        L15:
            if (r5 != 0) goto L1c
            r0 = 25
            a(r0)
        L1c:
            boolean r0 = r4.a(r2)
            if (r0 != 0) goto L23
            goto L29
        L23:
            boolean r0 = r5.b(r2)
            if (r0 != 0) goto L2a
        L29:
            return
        L2a:
            java.lang.Iterable r0 = r3.a(r2)
            java.util.Iterator r0 = r0.iterator()
        L32:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r0.next()
            d(r1, r3, r4, r5)
            goto L32
        L40:
            r5.c(r2)
            return
    }

    public static <N> java.lang.Boolean e(@org.jetbrains.annotations.NotNull java.util.Collection<N> r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.utils.b.d<N> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<N, java.lang.Boolean> r4) {
            if (r2 != 0) goto L6
            r0 = 7
            a(r0)
        L6:
            if (r3 != 0) goto Ld
            r0 = 8
            a(r0)
        Ld:
            if (r4 != 0) goto L14
            r0 = 9
            a(r0)
        L14:
            r0 = 1
            boolean[] r0 = new boolean[r0]
            kotlin.reflect.jvm.internal.impl.utils.b$a r1 = new kotlin.reflect.jvm.internal.impl.utils.b$a
            r1.<init>(r4, r0)
            java.lang.Object r2 = b(r2, r3, r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            return r2
    }
}
