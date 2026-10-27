package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.4")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,660:1\n476#1,53:663\n476#1,53:716\n37#2,2:661\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n471#1:663,53\n473#1:716,53\n46#1:661,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m<E> extends kotlin.collections.h<E> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.m.a d = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.Object[] e = null;
    private static final int f = 10;
    private int a;

    @org.jetbrains.annotations.NotNull
    private java.lang.Object[] b;
    private int c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.collections.m$a r0 = new kotlin.collections.m$a
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.m.d = r0
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            kotlin.collections.m.e = r0
            return
    }

    public m() {
            r1 = this;
            r1.<init>()
            java.lang.Object[] r0 = kotlin.collections.m.e
            r1.b = r0
            return
    }

    public m(int r4) {
            r3 = this;
            r3.<init>()
            if (r4 != 0) goto L8
            java.lang.Object[] r4 = kotlin.collections.m.e
            goto Lc
        L8:
            if (r4 <= 0) goto Lf
            java.lang.Object[] r4 = new java.lang.Object[r4]
        Lc:
            r3.b = r4
            return
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal Capacity: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public m(@org.jetbrains.annotations.NotNull java.util.Collection<? extends E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            r1.b = r2
            int r0 = r2.length
            r1.c = r0
            int r2 = r2.length
            if (r2 != 0) goto L1b
            java.lang.Object[] r2 = kotlin.collections.m.e
            r1.b = r2
        L1b:
            return
    }

    private final void a(int r5, java.util.Collection<? extends E> r6) {
            r4 = this;
            java.util.Iterator r0 = r6.iterator()
            java.lang.Object[] r1 = r4.b
            int r1 = r1.length
        L7:
            if (r5 >= r1) goto L1a
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object[] r2 = r4.b
            java.lang.Object r3 = r0.next()
            r2[r5] = r3
            int r5 = r5 + 1
            goto L7
        L1a:
            int r5 = r4.a
            r1 = 0
        L1d:
            if (r1 >= r5) goto L30
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object[] r2 = r4.b
            java.lang.Object r3 = r0.next()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L1d
        L30:
            int r5 = r4.size()
            int r6 = r6.size()
            int r5 = r5 + r6
            r4.c = r5
            return
    }

    private final void d(int r5) {
            r4 = this;
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Object[] r0 = r4.b
            int r1 = r4.a
            int r2 = r0.length
            r3 = 0
            kotlin.collections.q.B0(r0, r5, r3, r1, r2)
            java.lang.Object[] r0 = r4.b
            int r1 = r0.length
            int r2 = r4.a
            int r1 = r1 - r2
            kotlin.collections.q.B0(r0, r5, r1, r3, r2)
            r4.a = r3
            r4.b = r5
            return
    }

    private final int e(int r1) {
            r0 = this;
            if (r1 != 0) goto L9
            java.lang.Object[] r1 = r0.b
            int r1 = kotlin.collections.a0.Oe(r1)
            return r1
        L9:
            int r1 = r1 + (-1)
            return r1
    }

    private final void f(int r3) {
            r2 = this;
            if (r3 < 0) goto L22
            java.lang.Object[] r0 = r2.b
            int r1 = r0.length
            if (r3 > r1) goto L8
            return
        L8:
            java.lang.Object[] r1 = kotlin.collections.m.e
            if (r0 != r1) goto L17
            r0 = 10
            int r3 = kotlin.ranges.t.u(r3, r0)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.b = r3
            return
        L17:
            kotlin.collections.d$a r1 = kotlin.collections.d.Companion
            int r0 = r0.length
            int r3 = r1.e(r0, r3)
            r2.d(r3)
            return
        L22:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Deque is too big."
            r3.<init>(r0)
            throw r3
    }

    private final boolean g(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r12) {
            r11 = this;
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L9e
            java.lang.Object[] r0 = r11.b
            int r0 = r0.length
            if (r0 != 0) goto Le
            goto L9e
        Le:
            int r0 = r11.a
            int r2 = r11.size()
            int r0 = r0 + r2
            int r0 = r11.u(r0)
            int r2 = r11.a
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L44
            r5 = r2
        L20:
            if (r2 >= r0) goto L3e
            java.lang.Object[] r6 = r11.b
            r6 = r6[r2]
            java.lang.Object r7 = r12.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L3a
            java.lang.Object[] r7 = r11.b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L3b
        L3a:
            r1 = 1
        L3b:
            int r2 = r2 + 1
            goto L20
        L3e:
            java.lang.Object[] r12 = r11.b
            kotlin.collections.q.M1(r12, r3, r5, r0)
            goto L90
        L44:
            java.lang.Object[] r5 = r11.b
            int r5 = r5.length
            r6 = r2
            r7 = 0
        L49:
            if (r2 >= r5) goto L69
            java.lang.Object[] r8 = r11.b
            r9 = r8[r2]
            r8[r2] = r3
            java.lang.Object r8 = r12.invoke(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L65
            java.lang.Object[] r8 = r11.b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L66
        L65:
            r7 = 1
        L66:
            int r2 = r2 + 1
            goto L49
        L69:
            int r2 = r11.u(r6)
            r5 = r2
        L6e:
            if (r1 >= r0) goto L8f
            java.lang.Object[] r2 = r11.b
            r6 = r2[r1]
            r2[r1] = r3
            java.lang.Object r2 = r12.invoke(r6)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L8b
            java.lang.Object[] r2 = r11.b
            r2[r5] = r6
            int r5 = r11.m(r5)
            goto L8c
        L8b:
            r7 = 1
        L8c:
            int r1 = r1 + 1
            goto L6e
        L8f:
            r1 = r7
        L90:
            if (r1 == 0) goto L9e
            r11.registerModification()
            int r12 = r11.a
            int r5 = r5 - r12
            int r12 = r11.r(r5)
            r11.c = r12
        L9e:
            return r1
    }

    private final int m(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.b
            int r0 = kotlin.collections.a0.Oe(r0)
            if (r2 != r0) goto La
            r2 = 0
            return r2
        La:
            int r2 = r2 + 1
            return r2
    }

    @kotlin.internal.InlineOnly
    private final E n(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.b
            r2 = r0[r2]
            return r2
    }

    @kotlin.internal.InlineOnly
    private final int o(int r2) {
            r1 = this;
            int r0 = r1.a
            int r0 = r0 + r2
            int r2 = r1.u(r0)
            return r2
    }

    private final int r(int r2) {
            r1 = this;
            if (r2 >= 0) goto L6
            java.lang.Object[] r0 = r1.b
            int r0 = r0.length
            int r2 = r2 + r0
        L6:
            return r2
    }

    private final void registerModification() {
            r1 = this;
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    private final void t(int r4, int r5) {
            r3 = this;
            r0 = 0
            if (r4 >= r5) goto L9
            java.lang.Object[] r1 = r3.b
            kotlin.collections.q.M1(r1, r0, r4, r5)
            return
        L9:
            java.lang.Object[] r1 = r3.b
            int r2 = r1.length
            kotlin.collections.q.M1(r1, r0, r4, r2)
            java.lang.Object[] r4 = r3.b
            r1 = 0
            kotlin.collections.q.M1(r4, r0, r1, r5)
            return
    }

    private final int u(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.b
            int r1 = r0.length
            if (r3 < r1) goto L7
            int r0 = r0.length
            int r3 = r3 - r0
        L7:
            return r3
    }

    private final void x(int r7, int r8) {
            r6 = this;
            int r0 = r7 + (-1)
            int r1 = r6.a
            int r1 = r1 + r0
            int r0 = r6.u(r1)
            int r8 = r8 + (-1)
            int r1 = r6.a
            int r1 = r1 + r8
            int r8 = r6.u(r1)
        L12:
            if (r7 <= 0) goto L35
            int r1 = r0 + 1
            int r2 = r8 + 1
            int r2 = java.lang.Math.min(r1, r2)
            int r2 = java.lang.Math.min(r7, r2)
            java.lang.Object[] r3 = r6.b
            int r8 = r8 - r2
            int r4 = r8 + 1
            int r0 = r0 - r2
            int r5 = r0 + 1
            kotlin.collections.q.B0(r3, r3, r4, r5, r1)
            int r0 = r6.r(r0)
            int r8 = r6.r(r8)
            int r7 = r7 - r2
            goto L12
        L35:
            return
    }

    private final void y(int r5, int r6) {
            r4 = this;
            int r0 = r4.a
            int r0 = r0 + r6
            int r0 = r4.u(r0)
            int r1 = r4.a
            int r1 = r1 + r5
            int r5 = r4.u(r1)
            int r1 = r4.size()
        L12:
            int r1 = r1 - r6
            if (r1 <= 0) goto L34
            java.lang.Object[] r6 = r4.b
            int r2 = r6.length
            int r2 = r2 - r0
            int r6 = r6.length
            int r6 = r6 - r5
            int r6 = java.lang.Math.min(r2, r6)
            int r6 = java.lang.Math.min(r1, r6)
            java.lang.Object[] r2 = r4.b
            int r3 = r0 + r6
            kotlin.collections.q.B0(r2, r2, r5, r0, r3)
            int r0 = r4.u(r3)
            int r5 = r5 + r6
            int r5 = r4.u(r5)
            goto L12
        L34:
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Object[] A() {
            r1 = this;
            java.lang.Object[] r0 = r1.toArray()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final <T> T[] B(@org.jetbrains.annotations.NotNull T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object[] r2 = r1.toArray(r2)
            return r2
    }

    @Override // kotlin.collections.h, java.util.AbstractList, java.util.List
    public void add(int r8, E r9) {
            r7 = this;
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r7.size()
            r0.c(r8, r1)
            int r0 = r7.size()
            if (r8 != r0) goto L13
            r7.addLast(r9)
            return
        L13:
            if (r8 != 0) goto L19
            r7.addFirst(r9)
            return
        L19:
            r7.registerModification()
            int r0 = r7.size()
            r1 = 1
            int r0 = r0 + r1
            r7.f(r0)
            int r0 = r7.a
            int r0 = r0 + r8
            int r0 = r7.u(r0)
            int r2 = r7.size()
            int r2 = r2 + r1
            int r2 = r2 >> r1
            r3 = 0
            if (r8 >= r2) goto L6d
            int r8 = r7.e(r0)
            int r0 = r7.a
            int r0 = r7.e(r0)
            int r2 = r7.a
            if (r8 < r2) goto L51
            java.lang.Object[] r3 = r7.b
            r4 = r3[r2]
            r3[r0] = r4
            int r4 = r2 + 1
            int r5 = r8 + 1
            kotlin.collections.q.B0(r3, r3, r2, r4, r5)
            goto L66
        L51:
            java.lang.Object[] r4 = r7.b
            int r5 = r2 + (-1)
            int r6 = r4.length
            kotlin.collections.q.B0(r4, r4, r5, r2, r6)
            java.lang.Object[] r2 = r7.b
            int r4 = r2.length
            int r4 = r4 - r1
            r5 = r2[r3]
            r2[r4] = r5
            int r4 = r8 + 1
            kotlin.collections.q.B0(r2, r2, r3, r1, r4)
        L66:
            java.lang.Object[] r2 = r7.b
            r2[r8] = r9
            r7.a = r0
            goto L9a
        L6d:
            int r8 = r7.a
            int r2 = r7.size()
            int r8 = r8 + r2
            int r8 = r7.u(r8)
            if (r0 >= r8) goto L82
            java.lang.Object[] r2 = r7.b
            int r3 = r0 + 1
            kotlin.collections.q.B0(r2, r2, r3, r0, r8)
            goto L96
        L82:
            java.lang.Object[] r2 = r7.b
            kotlin.collections.q.B0(r2, r2, r1, r3, r8)
            java.lang.Object[] r8 = r7.b
            int r2 = r8.length
            int r2 = r2 - r1
            r2 = r8[r2]
            r8[r3] = r2
            int r2 = r0 + 1
            int r3 = r8.length
            int r3 = r3 - r1
            kotlin.collections.q.B0(r8, r8, r2, r0, r3)
        L96:
            java.lang.Object[] r8 = r7.b
            r8[r0] = r9
        L9a:
            int r8 = r7.size()
            int r8 = r8 + r1
            r7.c = r8
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E r1) {
            r0 = this;
            r0.addLast(r1)
            r1 = 1
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int r9, @org.jetbrains.annotations.NotNull java.util.Collection<? extends E> r10) {
            r8 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r10, r0)
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r8.size()
            r0.c(r9, r1)
            boolean r0 = r10.isEmpty()
            r1 = 0
            if (r0 == 0) goto L16
            return r1
        L16:
            int r0 = r8.size()
            if (r9 != r0) goto L21
            boolean r9 = r8.addAll(r10)
            return r9
        L21:
            r8.registerModification()
            int r0 = r8.size()
            int r2 = r10.size()
            int r0 = r0 + r2
            r8.f(r0)
            int r0 = r8.a
            int r2 = r8.size()
            int r0 = r0 + r2
            int r0 = r8.u(r0)
            int r2 = r8.a
            int r2 = r2 + r9
            int r2 = r8.u(r2)
            int r3 = r10.size()
            int r4 = r8.size()
            r5 = 1
            int r4 = r4 + r5
            int r4 = r4 >> r5
            if (r9 >= r4) goto La0
            int r9 = r8.a
            int r0 = r9 - r3
            if (r2 < r9) goto L79
            if (r0 < 0) goto L5d
            java.lang.Object[] r1 = r8.b
            kotlin.collections.q.B0(r1, r1, r0, r9, r2)
            goto L95
        L5d:
            java.lang.Object[] r4 = r8.b
            int r6 = r4.length
            int r0 = r0 + r6
            int r6 = r2 - r9
            int r7 = r4.length
            int r7 = r7 - r0
            if (r7 < r6) goto L6b
            kotlin.collections.q.B0(r4, r4, r0, r9, r2)
            goto L95
        L6b:
            int r6 = r9 + r7
            kotlin.collections.q.B0(r4, r4, r0, r9, r6)
            java.lang.Object[] r9 = r8.b
            int r4 = r8.a
            int r4 = r4 + r7
            kotlin.collections.q.B0(r9, r9, r1, r4, r2)
            goto L95
        L79:
            java.lang.Object[] r4 = r8.b
            int r6 = r4.length
            kotlin.collections.q.B0(r4, r4, r0, r9, r6)
            if (r3 < r2) goto L89
            java.lang.Object[] r9 = r8.b
            int r4 = r9.length
            int r4 = r4 - r3
            kotlin.collections.q.B0(r9, r9, r4, r1, r2)
            goto L95
        L89:
            java.lang.Object[] r9 = r8.b
            int r4 = r9.length
            int r4 = r4 - r3
            kotlin.collections.q.B0(r9, r9, r4, r1, r3)
            java.lang.Object[] r9 = r8.b
            kotlin.collections.q.B0(r9, r9, r1, r3, r2)
        L95:
            r8.a = r0
            int r2 = r2 - r3
            int r9 = r8.r(r2)
            r8.a(r9, r10)
            goto Le5
        La0:
            int r9 = r2 + r3
            if (r2 >= r0) goto Lc4
            int r3 = r3 + r0
            java.lang.Object[] r4 = r8.b
            int r6 = r4.length
            if (r3 > r6) goto Lae
            kotlin.collections.q.B0(r4, r4, r9, r2, r0)
            goto Le2
        Lae:
            int r6 = r4.length
            if (r9 < r6) goto Lb7
            int r1 = r4.length
            int r9 = r9 - r1
            kotlin.collections.q.B0(r4, r4, r9, r2, r0)
            goto Le2
        Lb7:
            int r6 = r4.length
            int r3 = r3 - r6
            int r3 = r0 - r3
            kotlin.collections.q.B0(r4, r4, r1, r3, r0)
            java.lang.Object[] r0 = r8.b
            kotlin.collections.q.B0(r0, r0, r9, r2, r3)
            goto Le2
        Lc4:
            java.lang.Object[] r4 = r8.b
            kotlin.collections.q.B0(r4, r4, r3, r1, r0)
            java.lang.Object[] r0 = r8.b
            int r4 = r0.length
            if (r9 < r4) goto Ld5
            int r1 = r0.length
            int r9 = r9 - r1
            int r1 = r0.length
            kotlin.collections.q.B0(r0, r0, r9, r2, r1)
            goto Le2
        Ld5:
            int r4 = r0.length
            int r4 = r4 - r3
            int r6 = r0.length
            kotlin.collections.q.B0(r0, r0, r1, r4, r6)
            java.lang.Object[] r0 = r8.b
            int r1 = r0.length
            int r1 = r1 - r3
            kotlin.collections.q.B0(r0, r0, r9, r2, r1)
        Le2:
            r8.a(r2, r10)
        Le5:
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Ld
            r3 = 0
            return r3
        Ld:
            r2.registerModification()
            int r0 = r2.size()
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.f(r0)
            int r0 = r2.a
            int r1 = r2.size()
            int r0 = r0 + r1
            int r0 = r2.u(r0)
            r2.a(r0, r3)
            r3 = 1
            return r3
    }

    public final void addFirst(E r3) {
            r2 = this;
            r2.registerModification()
            int r0 = r2.size()
            int r0 = r0 + 1
            r2.f(r0)
            int r0 = r2.a
            int r0 = r2.e(r0)
            r2.a = r0
            java.lang.Object[] r1 = r2.b
            r1[r0] = r3
            int r3 = r2.size()
            int r3 = r3 + 1
            r2.c = r3
            return
    }

    public final void addLast(E r4) {
            r3 = this;
            r3.registerModification()
            int r0 = r3.size()
            int r0 = r0 + 1
            r3.f(r0)
            java.lang.Object[] r0 = r3.b
            int r1 = r3.a
            int r2 = r3.size()
            int r1 = r1 + r2
            int r1 = r3.u(r1)
            r0[r1] = r4
            int r4 = r3.size()
            int r4 = r4 + 1
            r3.c = r4
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L19
            r2.registerModification()
            int r0 = r2.a
            int r1 = r2.size()
            int r0 = r0 + r1
            int r0 = r2.u(r0)
            int r1 = r2.a
            r2.t(r1, r0)
        L19:
            r0 = 0
            r2.a = r0
            r2.c = r0
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            return r2
        L9:
            r2 = 0
            return r2
    }

    public final E first() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Ld
            java.lang.Object[] r0 = r2.b
            int r1 = r2.a
            r0 = r0[r1]
            return r0
        Ld:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ArrayDeque is empty."
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int r3) {
            r2 = this;
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r2.size()
            r0.b(r3, r1)
            java.lang.Object[] r0 = r2.b
            int r1 = r2.a
            int r1 = r1 + r3
            int r3 = r2.u(r1)
            r3 = r0[r3]
            return r3
    }

    @Override // kotlin.collections.h
    public int getSize() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.a
            int r1 = r4.size()
            int r0 = r0 + r1
            int r0 = r4.u(r0)
            int r1 = r4.a
            if (r1 >= r0) goto L22
        Lf:
            if (r1 >= r0) goto L50
            java.lang.Object[] r2 = r4.b
            r2 = r2[r1]
            boolean r2 = kotlin.jvm.internal.g0.g(r5, r2)
            if (r2 == 0) goto L1f
            int r5 = r4.a
        L1d:
            int r1 = r1 - r5
            return r1
        L1f:
            int r1 = r1 + 1
            goto Lf
        L22:
            if (r1 < r0) goto L50
            java.lang.Object[] r2 = r4.b
            int r2 = r2.length
        L27:
            if (r1 >= r2) goto L39
            java.lang.Object[] r3 = r4.b
            r3 = r3[r1]
            boolean r3 = kotlin.jvm.internal.g0.g(r5, r3)
            if (r3 == 0) goto L36
            int r5 = r4.a
            goto L1d
        L36:
            int r1 = r1 + 1
            goto L27
        L39:
            r1 = 0
        L3a:
            if (r1 >= r0) goto L50
            java.lang.Object[] r2 = r4.b
            r2 = r2[r1]
            boolean r2 = kotlin.jvm.internal.g0.g(r5, r2)
            if (r2 == 0) goto L4d
            java.lang.Object[] r5 = r4.b
            int r5 = r5.length
            int r1 = r1 + r5
            int r5 = r4.a
            goto L1d
        L4d:
            int r1 = r1 + 1
            goto L3a
        L50:
            r5 = -1
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final E j() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.Object[] r0 = r2.b
            int r1 = r2.a
            r0 = r0[r1]
            return r0
    }

    public final E last() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L16
            java.lang.Object[] r0 = r3.b
            int r1 = r3.a
            int r2 = kotlin.collections.h0.L(r3)
            int r1 = r1 + r2
            int r1 = r3.u(r1)
            r0 = r0[r1]
            return r0
        L16:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ArrayDeque is empty."
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.a
            int r1 = r4.size()
            int r0 = r0 + r1
            int r0 = r4.u(r0)
            int r1 = r4.a
            r2 = -1
            if (r1 >= r0) goto L27
            int r0 = r0 + (-1)
            if (r1 > r0) goto L5d
        L14:
            java.lang.Object[] r3 = r4.b
            r3 = r3[r0]
            boolean r3 = kotlin.jvm.internal.g0.g(r5, r3)
            if (r3 == 0) goto L22
            int r5 = r4.a
        L20:
            int r0 = r0 - r5
            return r0
        L22:
            if (r0 == r1) goto L5d
            int r0 = r0 + (-1)
            goto L14
        L27:
            if (r1 <= r0) goto L5d
            int r0 = r0 + (-1)
        L2b:
            if (r2 >= r0) goto L41
            java.lang.Object[] r1 = r4.b
            r1 = r1[r0]
            boolean r1 = kotlin.jvm.internal.g0.g(r5, r1)
            if (r1 == 0) goto L3e
            java.lang.Object[] r5 = r4.b
            int r5 = r5.length
            int r0 = r0 + r5
            int r5 = r4.a
            goto L20
        L3e:
            int r0 = r0 + (-1)
            goto L2b
        L41:
            java.lang.Object[] r0 = r4.b
            int r0 = kotlin.collections.a0.Oe(r0)
            int r1 = r4.a
            if (r1 > r0) goto L5d
        L4b:
            java.lang.Object[] r3 = r4.b
            r3 = r3[r0]
            boolean r3 = kotlin.jvm.internal.g0.g(r5, r3)
            if (r3 == 0) goto L58
            int r5 = r4.a
            goto L20
        L58:
            if (r0 == r1) goto L5d
            int r0 = r0 + (-1)
            goto L4b
        L5d:
            return r2
    }

    public final void p(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Object[], kotlin.n1> r3) {
            r2 = this;
            java.lang.String r0 = "structure"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r2.a
            int r1 = r2.size()
            int r0 = r0 + r1
            int r0 = r2.u(r0)
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L20
            int r1 = r2.a
            if (r1 >= r0) goto L1b
            goto L20
        L1b:
            java.lang.Object[] r0 = r2.b
            int r0 = r0.length
            int r1 = r1 - r0
            goto L22
        L20:
            int r1 = r2.a
        L22:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = r2.toArray()
            r3.invoke(r0, r1)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final E q() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.Object[] r0 = r3.b
            int r1 = r3.a
            int r2 = kotlin.collections.h0.L(r3)
            int r1 = r1 + r2
            int r1 = r3.u(r1)
            r0 = r0[r1]
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 != r0) goto L9
            r2 = 0
            return r2
        L9:
            r1.removeAt(r2)
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@org.jetbrains.annotations.NotNull java.util.Collection<?> r12) {
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L91
            java.lang.Object[] r0 = r11.b
            int r0 = r0.length
            if (r0 != 0) goto L13
            goto L91
        L13:
            int r0 = r11.a
            int r2 = r11.size()
            int r0 = r0 + r2
            int r0 = r11.u(r0)
            int r2 = r11.a
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L43
            r5 = r2
        L25:
            if (r2 >= r0) goto L3d
            java.lang.Object[] r6 = r11.b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 != 0) goto L39
            java.lang.Object[] r7 = r11.b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L3a
        L39:
            r1 = 1
        L3a:
            int r2 = r2 + 1
            goto L25
        L3d:
            java.lang.Object[] r12 = r11.b
            kotlin.collections.q.M1(r12, r3, r5, r0)
            goto L83
        L43:
            java.lang.Object[] r5 = r11.b
            int r5 = r5.length
            r6 = r2
            r7 = 0
        L48:
            if (r2 >= r5) goto L62
            java.lang.Object[] r8 = r11.b
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 != 0) goto L5e
            java.lang.Object[] r8 = r11.b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L5f
        L5e:
            r7 = 1
        L5f:
            int r2 = r2 + 1
            goto L48
        L62:
            int r2 = r11.u(r6)
            r5 = r2
        L67:
            if (r1 >= r0) goto L82
            java.lang.Object[] r2 = r11.b
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 != 0) goto L7e
            java.lang.Object[] r2 = r11.b
            r2[r5] = r6
            int r5 = r11.m(r5)
            goto L7f
        L7e:
            r7 = 1
        L7f:
            int r1 = r1 + 1
            goto L67
        L82:
            r1 = r7
        L83:
            if (r1 == 0) goto L91
            r11.registerModification()
            int r12 = r11.a
            int r5 = r5 - r12
            int r12 = r11.r(r5)
            r11.c = r12
        L91:
            return r1
    }

    @Override // kotlin.collections.h
    public E removeAt(int r9) {
            r8 = this;
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r8.size()
            r0.b(r9, r1)
            int r0 = kotlin.collections.h0.L(r8)
            if (r9 != r0) goto L14
            java.lang.Object r9 = r8.removeLast()
            return r9
        L14:
            if (r9 != 0) goto L1b
            java.lang.Object r9 = r8.removeFirst()
            return r9
        L1b:
            r8.registerModification()
            int r0 = r8.a
            int r0 = r0 + r9
            int r0 = r8.u(r0)
            java.lang.Object[] r1 = r8.b
            r1 = r1[r0]
            int r2 = r8.size()
            r3 = 1
            int r2 = r2 >> r3
            r4 = 0
            r5 = 0
            if (r9 >= r2) goto L62
            int r9 = r8.a
            if (r0 < r9) goto L3f
            java.lang.Object[] r2 = r8.b
            int r5 = r9 + 1
            kotlin.collections.q.B0(r2, r2, r5, r9, r0)
            goto L55
        L3f:
            java.lang.Object[] r9 = r8.b
            kotlin.collections.q.B0(r9, r9, r3, r5, r0)
            java.lang.Object[] r9 = r8.b
            int r0 = r9.length
            int r0 = r0 - r3
            r0 = r9[r0]
            r9[r5] = r0
            int r0 = r8.a
            int r2 = r0 + 1
            int r5 = r9.length
            int r5 = r5 - r3
            kotlin.collections.q.B0(r9, r9, r2, r0, r5)
        L55:
            java.lang.Object[] r9 = r8.b
            int r0 = r8.a
            r9[r0] = r4
            int r9 = r8.m(r0)
            r8.a = r9
            goto L92
        L62:
            int r9 = r8.a
            int r2 = kotlin.collections.h0.L(r8)
            int r9 = r9 + r2
            int r9 = r8.u(r9)
            if (r0 > r9) goto L79
            java.lang.Object[] r2 = r8.b
            int r5 = r0 + 1
            int r6 = r9 + 1
            kotlin.collections.q.B0(r2, r2, r0, r5, r6)
            goto L8e
        L79:
            java.lang.Object[] r2 = r8.b
            int r6 = r0 + 1
            int r7 = r2.length
            kotlin.collections.q.B0(r2, r2, r0, r6, r7)
            java.lang.Object[] r0 = r8.b
            int r2 = r0.length
            int r2 = r2 - r3
            r6 = r0[r5]
            r0[r2] = r6
            int r2 = r9 + 1
            kotlin.collections.q.B0(r0, r0, r5, r3, r2)
        L8e:
            java.lang.Object[] r0 = r8.b
            r0[r9] = r4
        L92:
            int r9 = r8.size()
            int r9 = r9 - r3
            r8.c = r9
            return r1
    }

    public final E removeFirst() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L21
            r4.registerModification()
            java.lang.Object[] r0 = r4.b
            int r1 = r4.a
            r2 = r0[r1]
            r3 = 0
            r0[r1] = r3
            int r0 = r4.m(r1)
            r4.a = r0
            int r0 = r4.size()
            int r0 = r0 + (-1)
            r4.c = r0
            return r2
        L21:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ArrayDeque is empty."
            r0.<init>(r1)
            throw r0
    }

    public final E removeLast() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L24
            r4.registerModification()
            int r0 = r4.a
            int r1 = kotlin.collections.h0.L(r4)
            int r0 = r0 + r1
            int r0 = r4.u(r0)
            java.lang.Object[] r1 = r4.b
            r2 = r1[r0]
            r3 = 0
            r1[r0] = r3
            int r0 = r4.size()
            int r0 = r0 + (-1)
            r4.c = r0
            return r2
        L24:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ArrayDeque is empty."
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.AbstractList
    protected void removeRange(int r3, int r4) {
            r2 = this;
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r2.size()
            r0.d(r3, r4, r1)
            int r0 = r4 - r3
            if (r0 != 0) goto Le
            return
        Le:
            int r1 = r2.size()
            if (r0 != r1) goto L18
            r2.clear()
            return
        L18:
            r1 = 1
            if (r0 != r1) goto L1f
            r2.removeAt(r3)
            return
        L1f:
            r2.registerModification()
            int r1 = r2.size()
            int r1 = r1 - r4
            if (r3 >= r1) goto L3b
            r2.x(r3, r4)
            int r3 = r2.a
            int r3 = r3 + r0
            int r3 = r2.u(r3)
            int r4 = r2.a
            r2.t(r4, r3)
            r2.a = r3
            goto L52
        L3b:
            r2.y(r3, r4)
            int r3 = r2.a
            int r4 = r2.size()
            int r3 = r3 + r4
            int r3 = r2.u(r3)
            int r4 = r3 - r0
            int r4 = r2.r(r4)
            r2.t(r4, r3)
        L52:
            int r3 = r2.size()
            int r3 = r3 - r0
            r2.c = r3
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@org.jetbrains.annotations.NotNull java.util.Collection<?> r12) {
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L91
            java.lang.Object[] r0 = r11.b
            int r0 = r0.length
            if (r0 != 0) goto L13
            goto L91
        L13:
            int r0 = r11.a
            int r2 = r11.size()
            int r0 = r0 + r2
            int r0 = r11.u(r0)
            int r2 = r11.a
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L43
            r5 = r2
        L25:
            if (r2 >= r0) goto L3d
            java.lang.Object[] r6 = r11.b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L39
            java.lang.Object[] r7 = r11.b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L3a
        L39:
            r1 = 1
        L3a:
            int r2 = r2 + 1
            goto L25
        L3d:
            java.lang.Object[] r12 = r11.b
            kotlin.collections.q.M1(r12, r3, r5, r0)
            goto L83
        L43:
            java.lang.Object[] r5 = r11.b
            int r5 = r5.length
            r6 = r2
            r7 = 0
        L48:
            if (r2 >= r5) goto L62
            java.lang.Object[] r8 = r11.b
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L5e
            java.lang.Object[] r8 = r11.b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L5f
        L5e:
            r7 = 1
        L5f:
            int r2 = r2 + 1
            goto L48
        L62:
            int r2 = r11.u(r6)
            r5 = r2
        L67:
            if (r1 >= r0) goto L82
            java.lang.Object[] r2 = r11.b
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L7e
            java.lang.Object[] r2 = r11.b
            r2[r5] = r6
            int r5 = r11.m(r5)
            goto L7f
        L7e:
            r7 = 1
        L7f:
            int r1 = r1 + 1
            goto L67
        L82:
            r1 = r7
        L83:
            if (r1 == 0) goto L91
            r11.registerModification()
            int r12 = r11.a
            int r5 = r5 - r12
            int r12 = r11.r(r5)
            r11.c = r12
        L91:
            return r1
    }

    @Override // kotlin.collections.h, java.util.AbstractList, java.util.List
    public E set(int r3, E r4) {
            r2 = this;
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r2.size()
            r0.b(r3, r1)
            int r0 = r2.a
            int r0 = r0 + r3
            int r3 = r2.u(r0)
            java.lang.Object[] r0 = r2.b
            r1 = r0[r3]
            r0[r3] = r4
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @org.jetbrains.annotations.NotNull
    public java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.size()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @org.jetbrains.annotations.NotNull
    public <T> T[] toArray(@org.jetbrains.annotations.NotNull T[] r8) {
            r7 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r8.length
            int r1 = r7.size()
            if (r0 < r1) goto Le
        Lc:
            r1 = r8
            goto L17
        Le:
            int r0 = r7.size()
            java.lang.Object[] r8 = kotlin.collections.o.a(r8, r0)
            goto Lc
        L17:
            int r8 = r7.a
            int r0 = r7.size()
            int r8 = r8 + r0
            int r4 = r7.u(r8)
            int r3 = r7.a
            if (r3 >= r4) goto L2f
            java.lang.Object[] r0 = r7.b
            r5 = 2
            r6 = 0
            r2 = 0
            kotlin.collections.q.K0(r0, r1, r2, r3, r4, r5, r6)
            goto L47
        L2f:
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L47
            java.lang.Object[] r8 = r7.b
            int r0 = r7.a
            int r2 = r8.length
            r3 = 0
            kotlin.collections.q.B0(r8, r1, r3, r0, r2)
            java.lang.Object[] r8 = r7.b
            int r0 = r8.length
            int r2 = r7.a
            int r0 = r0 - r2
            kotlin.collections.q.B0(r8, r1, r0, r3, r4)
        L47:
            int r8 = r7.size()
            java.lang.Object[] r8 = kotlin.collections.g0.o(r8, r1)
            return r8
    }

    @org.jetbrains.annotations.Nullable
    public final E v() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.Object r0 = r1.removeFirst()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final E w() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.Object r0 = r1.removeLast()
            return r0
    }

    public final void z(int r1, int r2) {
            r0 = this;
            r0.removeRange(r1, r2)
            return
    }
}
