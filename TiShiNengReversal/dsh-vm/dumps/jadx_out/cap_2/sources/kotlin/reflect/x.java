package kotlin.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.ExperimentalStdlibApi
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n1563#2:231\n1634#2,3:232\n37#3,2:235\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n*L\n116#1:231\n116#1:232,3\n116#1:235,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class x implements java.lang.reflect.TypeVariable<java.lang.reflect.GenericDeclaration>, kotlin.reflect.v {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.s a;

    public x(@org.jetbrains.annotations.NotNull kotlin.reflect.s r2) {
            r1 = this;
            java.lang.String r0 = "typeParameter"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @org.jetbrains.annotations.Nullable
    public final <T extends java.lang.annotation.Annotation> T a(@org.jetbrains.annotations.NotNull java.lang.Class<T> r2) {
            r1 = this;
            java.lang.String r0 = "annotationClass"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.annotation.Annotation[] b() {
            r1 = this;
            r0 = 0
            java.lang.annotation.Annotation[] r0 = new java.lang.annotation.Annotation[r0]
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.annotation.Annotation[] c() {
            r1 = this;
            r0 = 0
            java.lang.annotation.Annotation[] r0 = new java.lang.annotation.Annotation[r0]
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L24
            java.lang.String r0 = r2.getName()
            java.lang.reflect.TypeVariable r3 = (java.lang.reflect.TypeVariable) r3
            java.lang.String r1 = r3.getName()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L24
            java.lang.reflect.GenericDeclaration r0 = r2.getGenericDeclaration()
            java.lang.reflect.GenericDeclaration r3 = r3.getGenericDeclaration()
            boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
            if (r3 == 0) goto L24
            r3 = 1
            return r3
        L24:
            r3 = 0
            return r3
    }

    @Override // java.lang.reflect.TypeVariable
    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.Type[] getBounds() {
            r4 = this;
            kotlin.reflect.s r0 = r4.a
            java.util.List r0 = r0.getUpperBounds()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r0.next()
            kotlin.reflect.r r2 = (kotlin.reflect.r) r2
            r3 = 1
            java.lang.reflect.Type r2 = kotlin.reflect.y.a(r2, r3)
            r1.add(r2)
            goto L17
        L2c:
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            return r0
    }

    @Override // java.lang.reflect.TypeVariable
    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.GenericDeclaration getGenericDeclaration() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getGenericDeclaration() is not yet supported for type variables created from KType: "
            r0.append(r1)
            kotlin.reflect.s r1 = r4.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            kotlin.NotImplementedError r1 = new kotlin.NotImplementedError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "An operation is not implemented: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // java.lang.reflect.TypeVariable
    @org.jetbrains.annotations.NotNull
    public java.lang.String getName() {
            r1 = this;
            kotlin.reflect.s r0 = r1.a
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.v
    @org.jetbrains.annotations.NotNull
    public java.lang.String getTypeName() {
            r1 = this;
            java.lang.String r0 = r1.getName()
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.getName()
            int r0 = r0.hashCode()
            java.lang.reflect.GenericDeclaration r1 = r2.getGenericDeclaration()
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.getTypeName()
            return r0
    }
}
