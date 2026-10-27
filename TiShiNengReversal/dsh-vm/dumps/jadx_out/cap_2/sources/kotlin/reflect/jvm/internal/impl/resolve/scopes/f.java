package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nGivenFunctionsMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GivenFunctionsMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/GivenFunctionsMemberScope\n+ 2 CollectionUtil.kt\norg/jetbrains/kotlin/utils/CollectionUtilKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,91:1\n32#2,2:92\n9#2,6:94\n32#2,2:100\n9#2,6:102\n1374#3:108\n1460#3,5:109\n808#3,11:114\n1491#3:125\n1516#3,3:126\n1519#3,3:136\n1491#3:139\n1516#3,3:140\n1519#3,3:150\n774#3:153\n865#3,2:154\n382#4,7:129\n382#4,7:143\n*S KotlinDebug\n*F\n+ 1 GivenFunctionsMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/GivenFunctionsMemberScope\n*L\n51#1:92,2\n51#1:94,6\n55#1:100,2\n55#1:102,6\n61#1:108\n61#1:109,5\n62#1:114,11\n63#1:125\n63#1:126,3\n63#1:136,3\n64#1:139\n64#1:140,3\n64#1:150,3\n68#1:153\n68#1:154,2\n63#1:129,7\n64#1:143,7\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class f extends kotlin.reflect.jvm.internal.impl.resolve.scopes.l {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] d = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.d b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.reflect.jvm.internal.impl.resolve.l {
        final /* synthetic */ java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.k> a;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.f b;

        a(java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.k> r1, kotlin.reflect.jvm.internal.impl.resolve.scopes.f r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.m
        public void a(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2) {
                r1 = this;
                java.lang.String r0 = "fakeOverride"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 0
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.K(r2, r0)
                java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.k> r0 = r1.a
                r0.add(r2)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.l
        protected void e(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r5) {
                r3 = this;
                java.lang.String r0 = "fromSuper"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "fromCurrent"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Conflict in scope of "
                r1.append(r2)
                kotlin.reflect.jvm.internal.impl.resolve.scopes.f r2 = r3.b
                kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r2.n()
                r1.append(r2)
                java.lang.String r2 = ": "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " vs "
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = r1.toString()
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }
    }

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.impl.resolve.scopes.f> r1 = kotlin.reflect.jvm.internal.impl.resolve.scopes.f.class
            java.lang.String r2 = "allDescriptors"
            java.lang.String r3 = "getAllDescriptors()Ljava/util/List;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            r1 = 1
            kotlin.reflect.n[] r1 = new kotlin.reflect.n[r1]
            r1[r4] = r0
            kotlin.reflect.jvm.internal.impl.resolve.scopes.f.d = r1
            return
    }

    public f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r3) {
            r1 = this;
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "containingClass"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.b = r3
            kotlin.reflect.jvm.internal.impl.resolve.scopes.e r3 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.e
            r3.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.i r2 = r2.e(r3)
            r1.c = r2
            return
    }

    static /* synthetic */ java.util.List i(kotlin.reflect.jvm.internal.impl.resolve.scopes.f r0) {
            java.util.List r0 = j(r0)
            return r0
    }

    private static final java.util.List j(kotlin.reflect.jvm.internal.impl.resolve.scopes.f r2) {
            java.util.List r0 = r2.k()
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r2 = r2.l(r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.f0.I4(r1, r2)
            return r2
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.k> l(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.y> r12) {
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 3
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r11.b
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.o()
            java.util.Collection r2 = r2.i()
            java.lang.String r3 = "getSupertypes(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = (kotlin.reflect.jvm.internal.impl.types.t0) r4
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r4 = r4.r()
            r5 = 0
            java.util.Collection r4 = kotlin.reflect.jvm.internal.impl.resolve.scopes.n.a.a(r4, r5, r5, r1, r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            kotlin.collections.f0.s0(r3, r4)
            goto L20
        L3b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r3.iterator()
        L44:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L56
            java.lang.Object r3 = r2.next()
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r4 == 0) goto L44
            r1.add(r3)
            goto L44
        L56:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L5f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L84
            java.lang.Object r3 = r1.next()
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4
            kotlin.reflect.jvm.internal.impl.name.f r4 = r4.getName()
            java.lang.Object r5 = r2.get(r4)
            if (r5 != 0) goto L7e
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r2.put(r4, r5)
        L7e:
            java.util.List r5 = (java.util.List) r5
            r5.add(r3)
            goto L5f
        L84:
            java.util.Set r1 = r2.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L8c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L140
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r4 = "component1(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            r6 = r3
            kotlin.reflect.jvm.internal.impl.name.f r6 = (kotlin.reflect.jvm.internal.impl.name.f) r6
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        Lb5:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Ldc
            java.lang.Object r4 = r2.next()
            r5 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r5 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r5
            boolean r5 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            java.lang.Object r7 = r3.get(r5)
            if (r7 != 0) goto Ld6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r3.put(r5, r7)
        Ld6:
            java.util.List r7 = (java.util.List) r7
            r7.add(r4)
            goto Lb5
        Ldc:
            java.util.Set r2 = r3.entrySet()
            java.util.Iterator r2 = r2.iterator()
        Le4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8c
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r5 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.f
            r7 = r3
            java.util.Collection r7 = (java.util.Collection) r7
            if (r4 == 0) goto L12e
            r3 = r12
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L113:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L132
            java.lang.Object r8 = r3.next()
            r9 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.y r9 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r9
            kotlin.reflect.jvm.internal.impl.name.f r9 = r9.getName()
            boolean r9 = kotlin.jvm.internal.g0.g(r9, r6)
            if (r9 == 0) goto L113
            r4.add(r8)
            goto L113
        L12e:
            java.util.List r4 = kotlin.collections.f0.J()
        L132:
            r8 = r4
            java.util.Collection r8 = (java.util.Collection) r8
            kotlin.reflect.jvm.internal.impl.descriptors.d r9 = r11.b
            kotlin.reflect.jvm.internal.impl.resolve.scopes.f$a r10 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.f$a
            r10.<init>(r0, r11)
            r5.v(r6, r7, r8, r9, r10)
            goto Le4
        L140:
            java.util.List r12 = kotlin.reflect.jvm.internal.impl.utils.a.c(r0)
            return r12
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.k> m() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.c
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.resolve.scopes.f.d
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r4, @org.jetbrains.annotations.NotNull t3.b r5) {
            r3 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.List r5 = r3.m()
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L1b
            java.util.List r4 = kotlin.collections.f0.J()
            goto L46
        L1b:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            kotlin.reflect.jvm.internal.impl.utils.j r0 = new kotlin.reflect.jvm.internal.impl.utils.j
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L26:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r5.next()
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d1
            if (r2 == 0) goto L26
            r2 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r2
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r4)
            if (r2 == 0) goto L26
            r0.add(r1)
            goto L26
        L45:
            r4 = r0
        L46:
            java.util.Collection r4 = (java.util.Collection) r4
            return r4
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r4, @org.jetbrains.annotations.NotNull t3.b r5) {
            r3 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.List r5 = r3.m()
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L1b
            java.util.List r4 = kotlin.collections.f0.J()
            goto L46
        L1b:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            kotlin.reflect.jvm.internal.impl.utils.j r0 = new kotlin.reflect.jvm.internal.impl.utils.j
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L26:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r5.next()
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.w0
            if (r2 == 0) goto L26
            r2 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r2
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r4)
            if (r2 == 0) goto L26
            r0.add(r1)
            goto L26
        L45:
            r4 = r0
        L46:
            java.util.Collection r4 = (java.util.Collection) r4
            return r4
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r3) {
            r1 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d r3 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.p
            int r3 = r3.m()
            boolean r2 = r2.a(r3)
            if (r2 != 0) goto L1d
            java.util.List r2 = kotlin.collections.f0.J()
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
        L1d:
            java.util.List r2 = r1.m()
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
    }

    @org.jetbrains.annotations.NotNull
    protected abstract java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.y> k();

    @org.jetbrains.annotations.NotNull
    protected final kotlin.reflect.jvm.internal.impl.descriptors.d n() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.b
            return r0
    }
}
