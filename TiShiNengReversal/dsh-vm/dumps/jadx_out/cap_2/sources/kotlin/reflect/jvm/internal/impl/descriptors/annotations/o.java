package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/FilteredAnnotations\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n774#2:124\n865#2,2:125\n1761#2,3:127\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/FilteredAnnotations\n*L\n69#1:124\n69#1:125,2\n72#1:127,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a;
    private final boolean b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.c, java.lang.Boolean> c;

    public o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.c, java.lang.Boolean> r3) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "fqNameFilter"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2, boolean r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.c, java.lang.Boolean> r4) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "fqNameFilter"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    private final boolean a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.c r2 = r2.d()
            if (r2 == 0) goto L16
            kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.c, java.lang.Boolean> r0 = r1.c
            java.lang.Object r2 = r0.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.c, java.lang.Boolean> r0 = r1.c
            java.lang.Object r0 = r0.invoke(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r1.a
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r2 = r0.b(r2)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r4.a
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L13
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L13
        L11:
            r0 = 0
            goto L2a
        L13:
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L11
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r1
            boolean r1 = r4.a(r1)
            if (r1 == 0) goto L17
            r0 = 1
        L2a:
            boolean r1 = r4.b
            if (r1 == 0) goto L32
            if (r0 != 0) goto L31
            return r2
        L31:
            return r3
        L32:
            return r0
    }

    @Override // java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r4.a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r0.next()
            r3 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r3 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r3
            boolean r3 = r4.a(r3)
            if (r3 == 0) goto Lb
            r1.add(r2)
            goto Lb
        L22:
            java.util.Iterator r0 = r1.iterator()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.c, java.lang.Boolean> r0 = r1.c
            java.lang.Object r0 = r0.invoke(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r1.a
            boolean r2 = r0.l(r2)
            return r2
        L1a:
            r2 = 0
            return r2
    }
}
