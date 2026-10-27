package kotlin.reflect.jvm.internal.impl.load.java.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.a$a, reason: collision with other inner class name */
    static class C0040a extends kotlin.reflect.jvm.internal.impl.resolve.l {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.v a;
        final /* synthetic */ java.util.Set b;
        final /* synthetic */ boolean c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.a$a$a, reason: collision with other inner class name */
        class C0041a implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.n1> {
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.components.a.C0040a a;

            C0041a(kotlin.reflect.jvm.internal.impl.load.java.components.a.C0040a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            private static /* synthetic */ void a(int r2) {
                    r2 = 3
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    java.lang.String r0 = "descriptor"
                    r1 = 0
                    r2[r1] = r0
                    java.lang.String r0 = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1"
                    r1 = 1
                    r2[r1] = r0
                    java.lang.String r0 = "invoke"
                    r1 = 2
                    r2[r1] = r0
                    java.lang.String r0 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                    java.lang.String r2 = java.lang.String.format(r0, r2)
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    r0.<init>(r2)
                    throw r0
            }

            public kotlin.n1 b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2) {
                    r1 = this;
                    if (r2 != 0) goto L6
                    r0 = 0
                    a(r0)
                L6:
                    kotlin.reflect.jvm.internal.impl.load.java.components.a$a r0 = r1.a
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r0 = r0.a
                    r0.a(r2)
                    kotlin.n1 r2 = kotlin.n1.a
                    return r2
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.n1 invoke(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
                    r0 = this;
                    kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r1
                    kotlin.n1 r1 = r0.b(r1)
                    return r1
            }
        }

        C0040a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r1, java.util.Set r2, boolean r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        private static /* synthetic */ void f(int r7) {
                r0 = 3
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r2 = 4
                r3 = 0
                r4 = 2
                r5 = 1
                if (r7 == r5) goto L23
                if (r7 == r4) goto L1e
                if (r7 == r0) goto L19
                if (r7 == r2) goto L14
                java.lang.String r6 = "fakeOverride"
                r1[r3] = r6
                goto L27
            L14:
                java.lang.String r6 = "overridden"
                r1[r3] = r6
                goto L27
            L19:
                java.lang.String r6 = "member"
                r1[r3] = r6
                goto L27
            L1e:
                java.lang.String r6 = "fromCurrent"
                r1[r3] = r6
                goto L27
            L23:
                java.lang.String r6 = "fromSuper"
                r1[r3] = r6
            L27:
                java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1"
                r1[r5] = r3
                if (r7 == r5) goto L3d
                if (r7 == r4) goto L3d
                if (r7 == r0) goto L38
                if (r7 == r2) goto L38
                java.lang.String r7 = "addFakeOverride"
                r1[r4] = r7
                goto L41
            L38:
                java.lang.String r7 = "setOverriddenDescriptors"
                r1[r4] = r7
                goto L41
            L3d:
                java.lang.String r7 = "conflict"
                r1[r4] = r7
            L41:
                java.lang.String r7 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r7 = java.lang.String.format(r7, r1)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r7)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.m
        public void a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 0
                f(r0)
            L6:
                kotlin.reflect.jvm.internal.impl.load.java.components.a$a$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.components.a$a$a
                r0.<init>(r1)
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.K(r2, r0)
                java.util.Set r0 = r1.b
                r0.add(r2)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.m
        public void d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3, @org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r4) {
                r2 = this;
                if (r3 != 0) goto L6
                r0 = 3
                f(r0)
            L6:
                if (r4 != 0) goto Lc
                r0 = 4
                f(r0)
            Lc:
                boolean r0 = r2.c
                if (r0 == 0) goto L19
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r0 = r3.h()
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r1 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
                if (r0 == r1) goto L19
                return
            L19:
                super.d(r3, r4)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.l
        public void e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2) {
                r0 = this;
                if (r1 != 0) goto L6
                r1 = 1
                f(r1)
            L6:
                if (r2 != 0) goto Lc
                r1 = 2
                f(r1)
            Lc:
                return
        }
    }

    private static /* synthetic */ void a(int r7) {
            r0 = 18
            if (r7 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 2
            if (r7 == r0) goto Le
            r3 = 3
            goto Lf
        Le:
            r3 = 2
        Lf:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils"
            r5 = 0
            switch(r7) {
                case 1: goto L38;
                case 2: goto L33;
                case 3: goto L2e;
                case 4: goto L29;
                case 5: goto L24;
                case 6: goto L17;
                case 7: goto L38;
                case 8: goto L33;
                case 9: goto L2e;
                case 10: goto L29;
                case 11: goto L24;
                case 12: goto L17;
                case 13: goto L38;
                case 14: goto L33;
                case 15: goto L2e;
                case 16: goto L29;
                case 17: goto L24;
                case 18: goto L21;
                case 19: goto L17;
                case 20: goto L1c;
                default: goto L17;
            }
        L17:
            java.lang.String r6 = "name"
            r3[r5] = r6
            goto L3c
        L1c:
            java.lang.String r6 = "annotationClass"
            r3[r5] = r6
            goto L3c
        L21:
            r3[r5] = r4
            goto L3c
        L24:
            java.lang.String r6 = "overridingUtil"
            r3[r5] = r6
            goto L3c
        L29:
            java.lang.String r6 = "errorReporter"
            r3[r5] = r6
            goto L3c
        L2e:
            java.lang.String r6 = "classDescriptor"
            r3[r5] = r6
            goto L3c
        L33:
            java.lang.String r6 = "membersFromCurrent"
            r3[r5] = r6
            goto L3c
        L38:
            java.lang.String r6 = "membersFromSupertypes"
            r3[r5] = r6
        L3c:
            java.lang.String r5 = "resolveOverrides"
            r6 = 1
            if (r7 == r0) goto L44
            r3[r6] = r4
            goto L46
        L44:
            r3[r6] = r5
        L46:
            switch(r7) {
                case 6: goto L56;
                case 7: goto L56;
                case 8: goto L56;
                case 9: goto L56;
                case 10: goto L56;
                case 11: goto L56;
                case 12: goto L53;
                case 13: goto L53;
                case 14: goto L53;
                case 15: goto L53;
                case 16: goto L53;
                case 17: goto L53;
                case 18: goto L5a;
                case 19: goto L4e;
                case 20: goto L4e;
                default: goto L49;
            }
        L49:
            java.lang.String r4 = "resolveOverridesForNonStaticMembers"
            r3[r2] = r4
            goto L5a
        L4e:
            java.lang.String r4 = "getAnnotationParameterByName"
            r3[r2] = r4
            goto L5a
        L53:
            r3[r2] = r5
            goto L5a
        L56:
            java.lang.String r4 = "resolveOverridesForStaticMembers"
            r3[r2] = r4
        L5a:
            java.lang.String r1 = java.lang.String.format(r1, r3)
            if (r7 == r0) goto L66
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r1)
            goto L6b
        L66:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r1)
        L6b:
            throw r7
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.descriptors.q1 b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r4) {
            if (r3 != 0) goto L7
            r0 = 19
            a(r0)
        L7:
            if (r4 != 0) goto Le
            r0 = 20
            a(r0)
        Le:
            java.util.Collection r4 = r4.f()
            int r0 = r4.size()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L1b
            return r2
        L1b:
            java.util.Iterator r4 = r4.iterator()
            java.lang.Object r4 = r4.next()
            kotlin.reflect.jvm.internal.impl.descriptors.c r4 = (kotlin.reflect.jvm.internal.impl.descriptors.c) r4
            java.util.List r4 = r4.g()
            java.util.Iterator r4 = r4.iterator()
        L2d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r4.next()
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r0
            kotlin.reflect.jvm.internal.impl.name.f r1 = r0.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2d
            return r0
        L44:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    private static <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> java.util.Collection<D> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull java.util.Collection<D> r3, @org.jetbrains.annotations.NotNull java.util.Collection<D> r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r7, boolean r8) {
            if (r2 != 0) goto L7
            r0 = 12
            a(r0)
        L7:
            if (r3 != 0) goto Le
            r0 = 13
            a(r0)
        Le:
            if (r4 != 0) goto L15
            r0 = 14
            a(r0)
        L15:
            if (r5 != 0) goto L1c
            r0 = 15
            a(r0)
        L1c:
            if (r6 != 0) goto L23
            r0 = 16
            a(r0)
        L23:
            if (r7 != 0) goto L2a
            r0 = 17
            a(r0)
        L2a:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r7
            kotlin.reflect.jvm.internal.impl.load.java.components.a$a r7 = new kotlin.reflect.jvm.internal.impl.load.java.components.a$a
            r7.<init>(r1, r0, r8)
            r2.v(r3, r4, r5, r6, r7)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> java.util.Collection<D> d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r8, @org.jetbrains.annotations.NotNull java.util.Collection<D> r9, @org.jetbrains.annotations.NotNull java.util.Collection<D> r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r13) {
            if (r8 != 0) goto L6
            r0 = 0
            a(r0)
        L6:
            if (r9 != 0) goto Lc
            r0 = 1
            a(r0)
        Lc:
            if (r10 != 0) goto L12
            r0 = 2
            a(r0)
        L12:
            if (r11 != 0) goto L18
            r0 = 3
            a(r0)
        L18:
            if (r12 != 0) goto L1e
            r0 = 4
            a(r0)
        L1e:
            if (r13 != 0) goto L24
            r0 = 5
            a(r0)
        L24:
            r7 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.util.Collection r8 = c(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @org.jetbrains.annotations.NotNull
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> java.util.Collection<D> e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r8, @org.jetbrains.annotations.NotNull java.util.Collection<D> r9, @org.jetbrains.annotations.NotNull java.util.Collection<D> r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r13) {
            if (r8 != 0) goto L6
            r0 = 6
            a(r0)
        L6:
            if (r9 != 0) goto Lc
            r0 = 7
            a(r0)
        Lc:
            if (r10 != 0) goto L13
            r0 = 8
            a(r0)
        L13:
            if (r11 != 0) goto L1a
            r0 = 9
            a(r0)
        L1a:
            if (r12 != 0) goto L21
            r0 = 10
            a(r0)
        L21:
            if (r13 != 0) goto L28
            r0 = 11
            a(r0)
        L28:
            r7 = 1
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.util.Collection r8 = c(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }
}
