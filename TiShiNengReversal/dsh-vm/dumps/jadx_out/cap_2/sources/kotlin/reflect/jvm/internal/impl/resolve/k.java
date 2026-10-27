package kotlin.reflect.jvm.internal.impl.resolve;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class k implements java.util.Comparator<kotlin.reflect.jvm.internal.impl.descriptors.k> {
    public static final kotlin.reflect.jvm.internal.impl.resolve.k a = null;
    private static final kotlin.reflect.jvm.internal.impl.renderer.m b = null;
    static final /* synthetic */ boolean c = false;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.renderer.u, kotlin.n1> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public kotlin.n1 a(kotlin.reflect.jvm.internal.impl.renderer.u r2) {
                r1 = this;
                r0 = 0
                r2.k(r0)
                r0 = 1
                r2.setVerbose(r0)
                kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy r0 = kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY
                r2.o(r0)
                java.util.Set<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> r0 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ALL
                r2.g(r0)
                kotlin.n1 r2 = kotlin.n1.a
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(kotlin.reflect.jvm.internal.impl.renderer.u r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.renderer.u r1 = (kotlin.reflect.jvm.internal.impl.renderer.u) r1
                kotlin.n1 r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b implements java.util.Comparator<kotlin.reflect.jvm.internal.impl.descriptors.k> {
        public static final kotlin.reflect.jvm.internal.impl.resolve.k.b a = null;

        static {
                kotlin.reflect.jvm.internal.impl.resolve.k$b r0 = new kotlin.reflect.jvm.internal.impl.resolve.k$b
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.resolve.k.b.a = r0
                return
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.lang.Integer a(kotlin.reflect.jvm.internal.impl.descriptors.k r0, kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
                java.lang.Integer r0 = c(r0, r1)
                return r0
        }

        @org.jetbrains.annotations.Nullable
        private static java.lang.Integer c(kotlin.reflect.jvm.internal.impl.descriptors.k r2, kotlin.reflect.jvm.internal.impl.descriptors.k r3) {
                int r0 = d(r3)
                int r1 = d(r2)
                int r0 = r0 - r1
                if (r0 == 0) goto L10
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                return r2
            L10:
                boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.i.B(r2)
                if (r0 == 0) goto L22
                boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.i.B(r3)
                if (r0 == 0) goto L22
                r2 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
            L22:
                kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
                kotlin.reflect.jvm.internal.impl.name.f r3 = r3.getName()
                int r2 = r2.c(r3)
                if (r2 == 0) goto L35
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
            L35:
                r2 = 0
                return r2
        }

        private static int d(kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
                boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.i.B(r1)
                if (r0 == 0) goto L9
                r1 = 8
                return r1
            L9:
                boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j
                if (r0 == 0) goto Lf
                r1 = 7
                return r1
            Lf:
                boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.w0
                if (r0 == 0) goto L1f
                kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r1
                kotlin.reflect.jvm.internal.impl.descriptors.z0 r1 = r1.f0()
                if (r1 != 0) goto L1d
                r1 = 6
                return r1
            L1d:
                r1 = 5
                return r1
            L1f:
                boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y
                if (r0 == 0) goto L2f
                kotlin.reflect.jvm.internal.impl.descriptors.y r1 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r1
                kotlin.reflect.jvm.internal.impl.descriptors.z0 r1 = r1.f0()
                if (r1 != 0) goto L2d
                r1 = 4
                return r1
            L2d:
                r1 = 3
                return r1
            L2f:
                boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
                if (r0 == 0) goto L35
                r1 = 2
                return r1
            L35:
                boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i1
                if (r1 == 0) goto L3b
                r1 = 1
                return r1
            L3b:
                r1 = 0
                return r1
        }

        public int b(kotlin.reflect.jvm.internal.impl.descriptors.k r1, kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
                r0 = this;
                java.lang.Integer r1 = c(r1, r2)
                if (r1 == 0) goto Lb
                int r1 = r1.intValue()
                return r1
            Lb:
                r1 = 0
                return r1
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(kotlin.reflect.jvm.internal.impl.descriptors.k r1, kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.k r1 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r1
                kotlin.reflect.jvm.internal.impl.descriptors.k r2 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r2
                int r1 = r0.b(r1, r2)
                return r1
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.resolve.k r0 = new kotlin.reflect.jvm.internal.impl.resolve.k
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.resolve.k.a = r0
            kotlin.reflect.jvm.internal.impl.renderer.m$a r0 = kotlin.reflect.jvm.internal.impl.renderer.m.a
            kotlin.reflect.jvm.internal.impl.resolve.k$a r1 = new kotlin.reflect.jvm.internal.impl.resolve.k$a
            r1.<init>()
            kotlin.reflect.jvm.internal.impl.renderer.m r0 = r0.b(r1)
            kotlin.reflect.jvm.internal.impl.resolve.k.b = r0
            return
    }

    private k() {
            r0 = this;
            r0.<init>()
            return
    }

    public int a(kotlin.reflect.jvm.internal.impl.descriptors.k r13, kotlin.reflect.jvm.internal.impl.descriptors.k r14) {
            r12 = this;
            java.lang.Integer r0 = kotlin.reflect.jvm.internal.impl.resolve.k.b.a(r13, r14)
            if (r0 == 0) goto Lb
            int r13 = r0.intValue()
            return r13
        Lb:
            boolean r0 = r13 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i1
            if (r0 == 0) goto L32
            boolean r0 = r14 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i1
            if (r0 == 0) goto L32
            r0 = r13
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.i1) r0
            r1 = r14
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.i1) r1
            kotlin.reflect.jvm.internal.impl.renderer.m r2 = kotlin.reflect.jvm.internal.impl.resolve.k.b
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.y0()
            java.lang.String r0 = r2.T(r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.y0()
            java.lang.String r1 = r2.T(r1)
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L182
            return r0
        L32:
            boolean r0 = r13 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a
            r1 = 0
            if (r0 == 0) goto L13c
            boolean r0 = r14 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a
            if (r0 == 0) goto L13c
            r0 = r13
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r0
            r2 = r14
            kotlin.reflect.jvm.internal.impl.descriptors.a r2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r2
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r3 = r0.f0()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r4 = r2.f0()
            if (r3 == 0) goto L64
            kotlin.reflect.jvm.internal.impl.renderer.m r5 = kotlin.reflect.jvm.internal.impl.resolve.k.b
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r3.getType()
            java.lang.String r3 = r5.T(r3)
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.getType()
            java.lang.String r4 = r5.T(r4)
            int r3 = r3.compareTo(r4)
            if (r3 == 0) goto L64
            return r3
        L64:
            java.util.List r3 = r0.g()
            java.util.List r4 = r2.g()
            r5 = 0
        L6d:
            int r6 = r3.size()
            int r7 = r4.size()
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto La3
            kotlin.reflect.jvm.internal.impl.renderer.m r6 = kotlin.reflect.jvm.internal.impl.resolve.k.b
            java.lang.Object r7 = r3.get(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r7 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r7
            kotlin.reflect.jvm.internal.impl.types.t0 r7 = r7.getType()
            java.lang.String r7 = r6.T(r7)
            java.lang.Object r8 = r4.get(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r8 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r8
            kotlin.reflect.jvm.internal.impl.types.t0 r8 = r8.getType()
            java.lang.String r6 = r6.T(r8)
            int r6 = r7.compareTo(r6)
            if (r6 == 0) goto La0
            return r6
        La0:
            int r5 = r5 + 1
            goto L6d
        La3:
            int r3 = r3.size()
            int r4 = r4.size()
            int r3 = r3 - r4
            if (r3 == 0) goto Laf
            return r3
        Laf:
            java.util.List r3 = r0.getTypeParameters()
            java.util.List r4 = r2.getTypeParameters()
            r5 = 0
        Lb8:
            int r6 = r3.size()
            int r7 = r4.size()
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L110
            java.lang.Object r6 = r3.get(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r6
            java.util.List r6 = r6.getUpperBounds()
            java.lang.Object r7 = r4.get(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r7 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r7
            java.util.List r7 = r7.getUpperBounds()
            int r8 = r6.size()
            int r9 = r7.size()
            int r8 = r8 - r9
            if (r8 == 0) goto Le6
            return r8
        Le6:
            r8 = 0
        Le7:
            int r9 = r6.size()
            if (r8 >= r9) goto L10d
            kotlin.reflect.jvm.internal.impl.renderer.m r9 = kotlin.reflect.jvm.internal.impl.resolve.k.b
            java.lang.Object r10 = r6.get(r8)
            kotlin.reflect.jvm.internal.impl.types.t0 r10 = (kotlin.reflect.jvm.internal.impl.types.t0) r10
            java.lang.String r10 = r9.T(r10)
            java.lang.Object r11 = r7.get(r8)
            kotlin.reflect.jvm.internal.impl.types.t0 r11 = (kotlin.reflect.jvm.internal.impl.types.t0) r11
            java.lang.String r9 = r9.T(r11)
            int r9 = r10.compareTo(r9)
            if (r9 == 0) goto L10a
            return r9
        L10a:
            int r8 = r8 + 1
            goto Le7
        L10d:
            int r5 = r5 + 1
            goto Lb8
        L110:
            int r1 = r3.size()
            int r3 = r4.size()
            int r1 = r1 - r3
            if (r1 == 0) goto L11c
            return r1
        L11c:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r1 == 0) goto L182
            boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r1 == 0) goto L182
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r0 = r0.h()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r2
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r1 = r2.h()
            int r0 = r0.ordinal()
            int r1 = r1.ordinal()
            int r0 = r0 - r1
            if (r0 == 0) goto L182
            return r0
        L13c:
            boolean r0 = r13 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            r2 = 1
            if (r0 == 0) goto L1a8
            boolean r0 = r14 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto L1a8
            r0 = r13
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            r1 = r14
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r3 = r0.h()
            int r3 = r3.ordinal()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r4 = r1.h()
            int r4 = r4.ordinal()
            if (r3 == r4) goto L16f
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r13 = r0.h()
            int r13 = r13.ordinal()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r14 = r1.h()
            int r14 = r14.ordinal()
            int r13 = r13 - r14
            return r13
        L16f:
            boolean r3 = r0.l0()
            boolean r1 = r1.l0()
            if (r3 == r1) goto L182
            boolean r13 = r0.l0()
            if (r13 == 0) goto L180
            return r2
        L180:
            r13 = -1
            return r13
        L182:
            kotlin.reflect.jvm.internal.impl.renderer.m r0 = kotlin.reflect.jvm.internal.impl.resolve.k.b
            java.lang.String r1 = r0.N(r13)
            java.lang.String r0 = r0.N(r14)
            int r0 = r1.compareTo(r0)
            if (r0 == 0) goto L193
            return r0
        L193:
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r13 = kotlin.reflect.jvm.internal.impl.resolve.i.g(r13)
            kotlin.reflect.jvm.internal.impl.name.f r13 = r13.getName()
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r14 = kotlin.reflect.jvm.internal.impl.resolve.i.g(r14)
            kotlin.reflect.jvm.internal.impl.name.f r14 = r14.getName()
            int r13 = r13.c(r14)
            return r13
        L1a8:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.Class r3 = r13.getClass()
            java.lang.Class r4 = r14.getClass()
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r13
            r5[r2] = r3
            r13 = 2
            r5[r13] = r14
            r13 = 3
            r5[r13] = r4
            java.lang.String r13 = "Unsupported pair of descriptors:\n'%s' Class: %s\n%s' Class: %s"
            java.lang.String r13 = java.lang.String.format(r13, r5)
            r0.<init>(r13)
            throw r0
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(kotlin.reflect.jvm.internal.impl.descriptors.k r1, kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r1
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r2
            int r1 = r0.a(r1, r2)
            return r1
    }
}
