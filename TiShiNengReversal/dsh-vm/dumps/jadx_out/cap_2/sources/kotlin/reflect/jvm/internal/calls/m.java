package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nValueClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n1761#2,3:393\n1563#2:396\n1634#2,3:397\n1761#2,3:409\n1634#2,3:412\n37#3:400\n36#3,3:401\n37#3:405\n36#3,3:406\n37#3:415\n36#3,3:416\n1#4:404\n*S KotlinDebug\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller\n*L\n45#1:393,3\n48#1:396\n48#1:397,3\n166#1:409,3\n184#1:412,3\n48#1:400\n48#1:401,3\n155#1:405\n155#1:406,3\n192#1:415\n192#1:416,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m<M extends java.lang.reflect.Member> implements kotlin.reflect.jvm.internal.calls.g<M> {
    private final boolean a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.calls.g<M> b;
    private final M c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.calls.m.a d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.ranges.m[] e;
    private final boolean f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {

        @org.jetbrains.annotations.NotNull
        private final kotlin.ranges.m a;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.reflect.Method>[] b;

        @org.jetbrains.annotations.Nullable
        private final java.lang.reflect.Method c;

        public a(@org.jetbrains.annotations.NotNull kotlin.ranges.m r2, @org.jetbrains.annotations.NotNull java.util.List<java.lang.reflect.Method>[] r3, @org.jetbrains.annotations.Nullable java.lang.reflect.Method r4) {
                r1 = this;
                java.lang.String r0 = "argumentRange"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "unboxParameters"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.<init>()
                r1.a = r2
                r1.b = r3
                r1.c = r4
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.ranges.m a() {
                r1 = this;
                kotlin.ranges.m r0 = r1.a
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.reflect.Method b() {
                r1 = this;
                java.lang.reflect.Method r0 = r1.c
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.reflect.Method>[] c() {
                r1 = this;
                java.util.List<java.lang.reflect.Method>[] r0 = r1.b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nValueClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$MultiFieldValueClassPrimaryConstructorCaller\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,392:1\n1563#2:393\n1634#2,3:394\n1573#2:397\n1604#2,3:398\n1563#2:401\n1634#2,3:402\n1607#2:405\n1374#2:406\n1460#2,2:407\n1563#2:409\n1634#2,3:410\n1462#2,3:413\n37#3:416\n36#3,3:417\n*S KotlinDebug\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$MultiFieldValueClassPrimaryConstructorCaller\n*L\n224#1:393\n224#1:394,3\n232#1:397\n232#1:398,3\n234#1:401\n234#1:402,3\n232#1:405\n241#1:406\n241#1:407,2\n241#1:409\n241#1:410,3\n241#1:413,3\n241#1:416\n241#1:417,3\n*E\n"})
    public static final class b implements kotlin.reflect.jvm.internal.calls.g {

        @org.jetbrains.annotations.NotNull
        private final java.lang.reflect.Method a;

        @org.jetbrains.annotations.NotNull
        private final java.lang.reflect.Method b;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.util.List<java.lang.reflect.Method>> c;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.util.List<java.lang.Class<?>>> d;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.reflect.Type> e;

        public b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.KDeclarationContainerImpl r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.t0> r7) {
                r3 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "container"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "constructorDesc"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "originalParameters"
                kotlin.jvm.internal.g0.p(r7, r0)
                r3.<init>()
                java.lang.String r0 = "constructor-impl"
                java.lang.reflect.Method r0 = r5.K(r0, r6)
                kotlin.jvm.internal.g0.m(r0)
                r3.a = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "V"
                java.lang.String r6 = kotlin.text.u.B4(r6, r1)
                r0.append(r6)
                java.lang.Class r6 = r5.c()
                java.lang.String r6 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.f(r6)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                java.lang.String r0 = "box-impl"
                java.lang.reflect.Method r5 = r5.K(r0, r6)
                kotlin.jvm.internal.g0.m(r5)
                r3.b = r5
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r5 = new java.util.ArrayList
                r6 = 10
                int r0 = kotlin.collections.f0.d0(r7, r6)
                r5.<init>(r0)
                java.util.Iterator r0 = r7.iterator()
            L5b:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L7c
                java.lang.Object r1 = r0.next()
                kotlin.reflect.jvm.internal.impl.descriptors.t0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.t0) r1
                kotlin.reflect.jvm.internal.impl.types.t0 r1 = r1.getType()
                java.lang.String r2 = "getType(...)"
                kotlin.jvm.internal.g0.o(r1, r2)
                kotlin.reflect.jvm.internal.impl.types.e1 r1 = kotlin.reflect.jvm.internal.impl.types.g2.a(r1)
                java.util.List r1 = kotlin.reflect.jvm.internal.calls.n.d(r1, r4)
                r5.add(r1)
                goto L5b
            L7c:
                r3.c = r5
                java.util.ArrayList r4 = new java.util.ArrayList
                int r5 = kotlin.collections.f0.d0(r7, r6)
                r4.<init>(r5)
                java.util.Iterator r5 = r7.iterator()
                r7 = 0
            L8c:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto Lef
                java.lang.Object r0 = r5.next()
                int r1 = r7 + 1
                if (r7 >= 0) goto L9d
                kotlin.collections.f0.b0()
            L9d:
                kotlin.reflect.jvm.internal.impl.descriptors.t0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.t0) r0
                kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
                kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.I0()
                kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.c()
                java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
                kotlin.jvm.internal.g0.n(r0, r2)
                kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
                java.util.List<java.util.List<java.lang.reflect.Method>> r2 = r3.c
                java.lang.Object r7 = r2.get(r7)
                java.util.List r7 = (java.util.List) r7
                if (r7 == 0) goto Ldf
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r0 = new java.util.ArrayList
                int r2 = kotlin.collections.f0.d0(r7, r6)
                r0.<init>(r2)
                java.util.Iterator r7 = r7.iterator()
            Lcb:
                boolean r2 = r7.hasNext()
                if (r2 == 0) goto Lea
                java.lang.Object r2 = r7.next()
                java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
                java.lang.Class r2 = r2.getReturnType()
                r0.add(r2)
                goto Lcb
            Ldf:
                java.lang.Class r7 = kotlin.reflect.jvm.internal.p3.s(r0)
                kotlin.jvm.internal.g0.m(r7)
                java.util.List r0 = kotlin.collections.f0.l(r7)
            Lea:
                r4.add(r0)
                r7 = r1
                goto L8c
            Lef:
                r3.d = r4
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.List r4 = kotlin.collections.f0.f0(r4)
                r3.e = r4
                return
        }

        @Override // kotlin.reflect.jvm.internal.calls.g
        public boolean a() {
                r1 = this;
                boolean r0 = r1.d()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.calls.g
        @org.jetbrains.annotations.NotNull
        public java.util.List<java.lang.reflect.Type> b() {
                r1 = this;
                java.util.List<java.lang.reflect.Type> r0 = r1.e
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.calls.g
        public /* bridge */ /* synthetic */ java.lang.reflect.Member c() {
                r1 = this;
                java.lang.Void r0 = r1.e()
                java.lang.reflect.Member r0 = (java.lang.reflect.Member) r0
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.calls.g
        @org.jetbrains.annotations.Nullable
        public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r7) {
                r6 = this;
                java.lang.String r0 = "args"
                kotlin.jvm.internal.g0.p(r7, r0)
                java.util.List<java.util.List<java.lang.reflect.Method>> r0 = r6.c
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.List r7 = kotlin.collections.n.UA(r7, r0)
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r7 = r7.iterator()
            L18:
                boolean r1 = r7.hasNext()
                r2 = 0
                if (r1 == 0) goto L60
                java.lang.Object r1 = r7.next()
                kotlin.Pair r1 = (kotlin.Pair) r1
                java.lang.Object r3 = r1.component1()
                java.lang.Object r1 = r1.component2()
                java.util.List r1 = (java.util.List) r1
                if (r1 == 0) goto L56
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 10
                int r5 = kotlin.collections.f0.d0(r1, r5)
                r4.<init>(r5)
                java.util.Iterator r1 = r1.iterator()
            L42:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L5a
                java.lang.Object r5 = r1.next()
                java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
                java.lang.Object r5 = r5.invoke(r3, r2)
                r4.add(r5)
                goto L42
            L56:
                java.util.List r4 = kotlin.collections.f0.l(r3)
            L5a:
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                kotlin.collections.f0.s0(r0, r4)
                goto L18
            L60:
                r7 = 0
                java.lang.Object[] r7 = new java.lang.Object[r7]
                java.lang.Object[] r7 = r0.toArray(r7)
                java.lang.reflect.Method r0 = r6.a
                int r1 = r7.length
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r7, r1)
                r0.invoke(r2, r1)
                java.lang.reflect.Method r0 = r6.b
                int r1 = r7.length
                java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r1)
                java.lang.Object r7 = r0.invoke(r2, r7)
                return r7
        }

        public boolean d() {
                r1 = this;
                r0 = 0
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public java.lang.Void e() {
                r1 = this;
                r0 = 0
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.util.List<java.lang.Class<?>>> f() {
                r1 = this;
                java.util.List<java.util.List<java.lang.Class<?>>> r0 = r1.d
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.calls.g
        @org.jetbrains.annotations.NotNull
        public java.lang.reflect.Type getReturnType() {
                r2 = this;
                java.lang.reflect.Method r0 = r2.b
                java.lang.Class r0 = r0.getReturnType()
                java.lang.String r1 = "getReturnType(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                return r0
        }
    }

    public m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.calls.g<? extends M> r12, boolean r13) {
            r10 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "oldCaller"
            kotlin.jvm.internal.g0.p(r12, r0)
            r10.<init>()
            r10.a = r13
            boolean r0 = r12 instanceof kotlin.reflect.jvm.internal.calls.h.AbstractC0025h.c
            r1 = 0
            r2 = 0
            if (r0 == 0) goto Lab
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r11.f0()
            if (r0 != 0) goto L1f
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r11.c0()
        L1f:
            if (r0 == 0) goto L26
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
            goto L27
        L26:
            r0 = r1
        L27:
            if (r0 == 0) goto Lab
            boolean r3 = kotlin.reflect.jvm.internal.impl.resolve.j.i(r0)
            if (r3 == 0) goto Lab
            if (r13 == 0) goto L60
            java.util.List r13 = r11.g()
            java.lang.String r3 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r13, r3)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            boolean r3 = r13 instanceof java.util.Collection
            if (r3 == 0) goto L4a
            r3 = r13
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L4a
            goto Lab
        L4a:
            java.util.Iterator r13 = r13.iterator()
        L4e:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto Lab
            java.lang.Object r3 = r13.next()
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r3
            boolean r3 = r3.Q()
            if (r3 == 0) goto L4e
        L60:
            kotlin.reflect.jvm.internal.impl.types.e1 r13 = kotlin.reflect.jvm.internal.impl.types.g2.a(r0)
            java.util.List r13 = kotlin.reflect.jvm.internal.calls.n.n(r13)
            kotlin.jvm.internal.g0.m(r13)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r0 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.f0.d0(r13, r3)
            r0.<init>(r3)
            java.util.Iterator r13 = r13.iterator()
        L7c:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L97
            java.lang.Object r3 = r13.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            r4 = r12
            kotlin.reflect.jvm.internal.calls.h$h$c r4 = (kotlin.reflect.jvm.internal.calls.h.AbstractC0025h.c) r4
            java.lang.Object r4 = r4.j()
            java.lang.Object r3 = r3.invoke(r4, r1)
            r0.add(r3)
            goto L7c
        L97:
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.Object[] r13 = r0.toArray(r13)
            kotlin.reflect.jvm.internal.calls.h$h$d r0 = new kotlin.reflect.jvm.internal.calls.h$h$d
            kotlin.reflect.jvm.internal.calls.h$h r12 = (kotlin.reflect.jvm.internal.calls.h.AbstractC0025h) r12
            java.lang.reflect.Member r12 = r12.c()
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            r0.<init>(r12, r13)
            r12 = r0
        Lab:
            r10.b = r12
            java.lang.reflect.Member r13 = r12.c()
            r10.c = r13
            kotlin.reflect.jvm.internal.impl.types.t0 r13 = r11.getReturnType()
            kotlin.jvm.internal.g0.m(r13)
            boolean r0 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y
            r3 = 1
            if (r0 == 0) goto Ld6
            r4 = r11
            kotlin.reflect.jvm.internal.impl.descriptors.y r4 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r4
            boolean r4 = r4.isSuspend()
            if (r4 == 0) goto Ld6
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = kotlin.reflect.jvm.internal.impl.resolve.j.j(r13)
            if (r4 == 0) goto Ld6
            boolean r4 = kotlin.reflect.jvm.internal.impl.builtins.j.t0(r4)
            if (r4 != r3) goto Ld6
        Ld4:
            r13 = r1
            goto Le0
        Ld6:
            java.lang.Class r13 = kotlin.reflect.jvm.internal.calls.n.f(r13)
            if (r13 == 0) goto Ld4
            java.lang.reflect.Method r13 = kotlin.reflect.jvm.internal.calls.n.c(r13, r11)
        Le0:
            boolean r4 = kotlin.reflect.jvm.internal.impl.resolve.j.a(r11)
            if (r4 == 0) goto Lf5
            kotlin.reflect.jvm.internal.calls.m$a r11 = new kotlin.reflect.jvm.internal.calls.m$a
            kotlin.ranges.m$a r12 = kotlin.ranges.m.e
            kotlin.ranges.m r12 = r12.a()
            java.util.List[] r0 = new java.util.List[r2]
            r11.<init>(r12, r0, r13)
            goto L1c8
        Lf5:
            boolean r4 = r12 instanceof kotlin.reflect.jvm.internal.calls.h.AbstractC0025h.c
            r5 = -1
            if (r4 == 0) goto L104
            r4 = r12
            kotlin.reflect.jvm.internal.calls.h$h$c r4 = (kotlin.reflect.jvm.internal.calls.h.AbstractC0025h.c) r4
            boolean r4 = r4.k()
            if (r4 != 0) goto L104
            goto L12f
        L104:
            boolean r4 = r12 instanceof kotlin.reflect.jvm.internal.calls.h.AbstractC0025h.d
            if (r4 == 0) goto L109
            goto L12f
        L109:
            boolean r4 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j
            if (r4 == 0) goto L114
            boolean r4 = r12 instanceof kotlin.reflect.jvm.internal.calls.f
            if (r4 == 0) goto L112
            goto L12f
        L112:
            r5 = 0
            goto L12f
        L114:
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r4 = r11.c0()
            if (r4 == 0) goto L112
            boolean r4 = r12 instanceof kotlin.reflect.jvm.internal.calls.f
            if (r4 != 0) goto L112
            kotlin.reflect.jvm.internal.impl.descriptors.k r4 = r11.b()
            java.lang.String r5 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            boolean r4 = kotlin.reflect.jvm.internal.impl.resolve.j.g(r4)
            if (r4 == 0) goto L12e
            goto L112
        L12e:
            r5 = 1
        L12f:
            boolean r4 = r12 instanceof kotlin.reflect.jvm.internal.calls.h.AbstractC0025h.d
            if (r4 == 0) goto L13c
            r4 = r12
            kotlin.reflect.jvm.internal.calls.h$h$d r4 = (kotlin.reflect.jvm.internal.calls.h.AbstractC0025h.d) r4
            int r4 = r4.k()
            int r4 = -r4
            goto L13d
        L13c:
            r4 = r5
        L13d:
            java.lang.reflect.Member r12 = r12.c()
            kotlin.reflect.jvm.internal.calls.l r6 = kotlin.reflect.jvm.internal.calls.l.a
            java.util.List r12 = kotlin.reflect.jvm.internal.calls.n.e(r11, r12, r6)
            r6 = r12
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = 0
        L14f:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L16d
            java.lang.Object r8 = r6.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r8 = (kotlin.reflect.jvm.internal.impl.types.t0) r8
            kotlin.reflect.jvm.internal.impl.types.e1 r8 = kotlin.reflect.jvm.internal.impl.types.g2.a(r8)
            java.util.List r8 = kotlin.reflect.jvm.internal.calls.n.n(r8)
            if (r8 == 0) goto L16a
            int r8 = r8.size()
            goto L16b
        L16a:
            r8 = 1
        L16b:
            int r7 = r7 + r8
            goto L14f
        L16d:
            boolean r6 = r10.a
            if (r6 == 0) goto L177
            int r6 = r7 + 31
            int r6 = r6 / 32
            int r6 = r6 + r3
            goto L178
        L177:
            r6 = 0
        L178:
            if (r0 == 0) goto L185
            r0 = r11
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r0
            boolean r0 = r0.isSuspend()
            if (r0 == 0) goto L185
            r0 = 1
            goto L186
        L185:
            r0 = 0
        L186:
            int r6 = r6 + r0
            int r7 = r7 + r4
            int r7 = r7 + r6
            boolean r0 = r10.a
            kotlin.reflect.jvm.internal.calls.n.b(r10, r7, r11, r0)
            int r0 = java.lang.Math.max(r5, r2)
            int r4 = r12.size()
            int r4 = r4 + r5
            kotlin.ranges.m r0 = kotlin.ranges.t.W1(r0, r4)
            java.util.List[] r4 = new java.util.List[r7]
            r6 = 0
        L19e:
            if (r6 >= r7) goto L1c3
            int r8 = r0.e()
            int r9 = r0.f()
            if (r6 > r9) goto L1bd
            if (r8 > r6) goto L1bd
            int r8 = r6 - r5
            java.lang.Object r8 = r12.get(r8)
            kotlin.reflect.jvm.internal.impl.types.t0 r8 = (kotlin.reflect.jvm.internal.impl.types.t0) r8
            kotlin.reflect.jvm.internal.impl.types.e1 r8 = kotlin.reflect.jvm.internal.impl.types.g2.a(r8)
            java.util.List r8 = kotlin.reflect.jvm.internal.calls.n.d(r8, r11)
            goto L1be
        L1bd:
            r8 = r1
        L1be:
            r4[r6] = r8
            int r6 = r6 + 1
            goto L19e
        L1c3:
            kotlin.reflect.jvm.internal.calls.m$a r11 = new kotlin.reflect.jvm.internal.calls.m$a
            r11.<init>(r0, r4, r13)
        L1c8:
            r10.d = r11
            java.util.List r12 = kotlin.collections.f0.j()
            kotlin.reflect.jvm.internal.calls.g<M extends java.lang.reflect.Member> r13 = r10.b
            boolean r0 = r13 instanceof kotlin.reflect.jvm.internal.calls.h.AbstractC0025h.d
            if (r0 == 0) goto L1dc
            kotlin.reflect.jvm.internal.calls.h$h$d r13 = (kotlin.reflect.jvm.internal.calls.h.AbstractC0025h.d) r13
            java.lang.Object[] r13 = r13.j()
            int r13 = r13.length
            goto L1e3
        L1dc:
            boolean r13 = r13 instanceof kotlin.reflect.jvm.internal.calls.h.AbstractC0025h.c
            if (r13 == 0) goto L1e2
            r13 = 1
            goto L1e3
        L1e2:
            r13 = 0
        L1e3:
            if (r13 <= 0) goto L1ec
            kotlin.ranges.m r0 = kotlin.ranges.t.W1(r2, r13)
            r12.add(r0)
        L1ec:
            java.util.List[] r11 = r11.c()
            int r0 = r11.length
            r1 = 0
        L1f2:
            if (r1 >= r0) goto L20a
            r4 = r11[r1]
            if (r4 == 0) goto L1fd
            int r4 = r4.size()
            goto L1fe
        L1fd:
            r4 = 1
        L1fe:
            int r4 = r4 + r13
            kotlin.ranges.m r13 = kotlin.ranges.t.W1(r13, r4)
            r12.add(r13)
            int r1 = r1 + 1
            r13 = r4
            goto L1f2
        L20a:
            java.util.List r11 = kotlin.collections.f0.b(r12)
            java.util.Collection r11 = (java.util.Collection) r11
            kotlin.ranges.m[] r12 = new kotlin.ranges.m[r2]
            java.lang.Object[] r11 = r11.toArray(r12)
            kotlin.ranges.m[] r11 = (kotlin.ranges.m[]) r11
            r10.e = r11
            kotlin.reflect.jvm.internal.calls.m$a r11 = r10.d
            kotlin.ranges.m r11 = r11.a()
            boolean r12 = r11 instanceof java.util.Collection
            if (r12 == 0) goto L22e
            r12 = r11
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L22e
            goto L251
        L22e:
            java.util.Iterator r11 = r11.iterator()
        L232:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L251
            r12 = r11
            kotlin.collections.d1 r12 = (kotlin.collections.d1) r12
            int r12 = r12.nextInt()
            kotlin.reflect.jvm.internal.calls.m$a r13 = r10.d
            java.util.List[] r13 = r13.c()
            r12 = r13[r12]
            if (r12 != 0) goto L24a
            goto L232
        L24a:
            int r12 = r12.size()
            if (r12 <= r3) goto L232
            r2 = 1
        L251:
            r10.f = r2
            return
    }

    static /* synthetic */ boolean d(kotlin.reflect.jvm.internal.impl.descriptors.d r0) {
            boolean r0 = e(r0)
            return r0
    }

    private static final boolean e(kotlin.reflect.jvm.internal.impl.descriptors.d r1) {
            java.lang.String r0 = "$this$makeKotlinParameterTypes"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.j.g(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    public boolean a() {
            r1 = this;
            kotlin.reflect.jvm.internal.calls.g<M extends java.lang.reflect.Member> r0 = r1.b
            boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.calls.h.AbstractC0025h.a
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.reflect.Type> b() {
            r1 = this;
            kotlin.reflect.jvm.internal.calls.g<M extends java.lang.reflect.Member> r0 = r1.b
            java.util.List r0 = r0.b()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    public M c() {
            r1 = this;
            M extends java.lang.reflect.Member r0 = r1.c
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    @org.jetbrains.annotations.Nullable
    public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r15) {
            r14 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.g0.p(r15, r0)
            kotlin.reflect.jvm.internal.calls.m$a r0 = r14.d
            kotlin.ranges.m r0 = r0.a()
            kotlin.reflect.jvm.internal.calls.m$a r1 = r14.d
            java.util.List[] r1 = r1.c()
            kotlin.reflect.jvm.internal.calls.m$a r2 = r14.d
            java.lang.reflect.Method r2 = r2.b()
            boolean r3 = r0.isEmpty()
            r4 = 0
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L22
            goto Le3
        L22:
            boolean r3 = r14.f
            java.lang.String r7 = "getReturnType(...)"
            if (r3 == 0) goto La5
            int r3 = r15.length
            java.util.List r3 = kotlin.collections.f0.k(r3)
            int r8 = r0.e()
            r9 = 0
        L32:
            if (r9 >= r8) goto L3c
            r10 = r15[r9]
            r3.add(r10)
            int r9 = r9 + 1
            goto L32
        L3c:
            int r8 = r0.e()
            int r9 = r0.f()
            if (r8 > r9) goto L83
        L46:
            r10 = r1[r8]
            r11 = r15[r8]
            if (r10 == 0) goto L7b
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L52:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L77
            java.lang.Object r12 = r10.next()
            r13 = r3
            java.util.Collection r13 = (java.util.Collection) r13
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            if (r11 == 0) goto L68
            java.lang.Object r12 = r12.invoke(r11, r5)
            goto L73
        L68:
            java.lang.Class r12 = r12.getReturnType()
            kotlin.jvm.internal.g0.o(r12, r7)
            java.lang.Object r12 = kotlin.reflect.jvm.internal.p3.g(r12)
        L73:
            r13.add(r12)
            goto L52
        L77:
            r10 = r3
            java.util.Collection r10 = (java.util.Collection) r10
            goto L7e
        L7b:
            r3.add(r11)
        L7e:
            if (r8 == r9) goto L83
            int r8 = r8 + 1
            goto L46
        L83:
            int r0 = r0.f()
            int r0 = r0 + r6
            int r1 = kotlin.collections.n.Oe(r15)
            if (r0 > r1) goto L98
        L8e:
            r7 = r15[r0]
            r3.add(r7)
            if (r0 == r1) goto L98
            int r0 = r0 + 1
            goto L8e
        L98:
            java.util.List r15 = kotlin.collections.f0.b(r3)
            java.util.Collection r15 = (java.util.Collection) r15
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Object[] r15 = r15.toArray(r0)
            goto Le3
        La5:
            int r3 = r15.length
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r9 = 0
        La9:
            if (r9 >= r3) goto Le2
            int r10 = r0.e()
            int r11 = r0.f()
            if (r9 > r11) goto Ldb
            if (r10 > r9) goto Ldb
            r10 = r1[r9]
            if (r10 == 0) goto Lc2
            java.lang.Object r10 = kotlin.collections.f0.m5(r10)
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            goto Lc3
        Lc2:
            r10 = r5
        Lc3:
            r11 = r15[r9]
            if (r10 != 0) goto Lc8
            goto Ldd
        Lc8:
            if (r11 == 0) goto Lcf
            java.lang.Object r11 = r10.invoke(r11, r5)
            goto Ldd
        Lcf:
            java.lang.Class r10 = r10.getReturnType()
            kotlin.jvm.internal.g0.o(r10, r7)
            java.lang.Object r11 = kotlin.reflect.jvm.internal.p3.g(r10)
            goto Ldd
        Ldb:
            r11 = r15[r9]
        Ldd:
            r8[r9] = r11
            int r9 = r9 + 1
            goto La9
        Le2:
            r15 = r8
        Le3:
            kotlin.reflect.jvm.internal.calls.g<M extends java.lang.reflect.Member> r0 = r14.b
            java.lang.Object r15 = r0.call(r15)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r15 != r0) goto Lf0
            goto Lfe
        Lf0:
            if (r2 == 0) goto Lfe
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r4] = r15
            java.lang.Object r0 = r2.invoke(r5, r0)
            if (r0 != 0) goto Lfd
            goto Lfe
        Lfd:
            return r0
        Lfe:
            return r15
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.ranges.m f(int r3) {
            r2 = this;
            if (r3 < 0) goto La
            kotlin.ranges.m[] r0 = r2.e
            int r1 = r0.length
            if (r3 >= r1) goto La
            r3 = r0[r3]
            return r3
        La:
            kotlin.ranges.m[] r0 = r2.e
            int r1 = r0.length
            if (r1 != 0) goto L15
            kotlin.ranges.m r0 = new kotlin.ranges.m
            r0.<init>(r3, r3)
            return r0
        L15:
            int r1 = r0.length
            int r3 = r3 - r1
            java.lang.Object r0 = kotlin.collections.n.Th(r0)
            kotlin.ranges.m r0 = (kotlin.ranges.m) r0
            int r0 = r0.f()
            int r0 = r0 + 1
            int r3 = r3 + r0
            kotlin.ranges.m r0 = new kotlin.ranges.m
            r0.<init>(r3, r3)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.calls.g
    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.Type getReturnType() {
            r1 = this;
            kotlin.reflect.jvm.internal.calls.g<M extends java.lang.reflect.Member> r0 = r1.b
            java.lang.reflect.Type r0 = r0.getReturnType()
            return r0
    }
}
