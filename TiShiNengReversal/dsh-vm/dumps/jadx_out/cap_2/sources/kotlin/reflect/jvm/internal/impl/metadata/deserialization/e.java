package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e implements kotlin.reflect.jvm.internal.impl.metadata.deserialization.d {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$Kind[] r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$Kind r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.CLASS     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$Kind r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$Kind r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind.LOCAL     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a.a = r0
                return
        }
    }

    public e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable r3) {
            r1 = this;
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "qualifiedNames"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    private final kotlin.Triple<java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.Boolean> c(int r8) {
            r7 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r2 = 0
        Lb:
            r3 = -1
            if (r8 == r3) goto L4d
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r3 = r7.b
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName r8 = r3.getQualifiedName(r8)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r3 = r7.a
            int r4 = r8.getShortName()
            java.lang.String r3 = r3.getString(r4)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$Kind r4 = r8.getKind()
            kotlin.jvm.internal.g0.m(r4)
            int[] r5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a.a
            int r4 = r4.ordinal()
            r4 = r5[r4]
            r5 = 1
            if (r4 == r5) goto L45
            r6 = 2
            if (r4 == r6) goto L41
            r2 = 3
            if (r4 != r2) goto L3b
            r1.addFirst(r3)
            r2 = 1
            goto L48
        L3b:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L41:
            r0.addFirst(r3)
            goto L48
        L45:
            r1.addFirst(r3)
        L48:
            int r8 = r8.getParentQualifiedName()
            goto Lb
        L4d:
            kotlin.Triple r8 = new kotlin.Triple
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r8.<init>(r0, r1, r2)
            return r8
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.d
    @org.jetbrains.annotations.NotNull
    public java.lang.String a(int r12) {
            r11 = this;
            kotlin.Triple r12 = r11.c(r12)
            java.lang.Object r0 = r12.component1()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r12 = r12.component2()
            java.util.List r12 = (java.util.List) r12
            r1 = r12
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r8 = 62
            r9 = 0
            java.lang.String r2 = "."
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r12 = kotlin.collections.f0.r3(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L28
            return r12
        L28:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r9 = 62
            r10 = 0
            java.lang.String r3 = "/"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r0 = kotlin.collections.f0.r3(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1.append(r0)
            r0 = 47
            r1.append(r0)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            return r12
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.d
    public boolean b(int r1) {
            r0 = this;
            kotlin.Triple r1 = r0.c(r1)
            java.lang.Object r1 = r1.getThird()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.d
    @org.jetbrains.annotations.NotNull
    public java.lang.String getString(int r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r0 = r1.a
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r0 = "getString(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
    }
}
