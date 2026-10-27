package kotlin.reflect.jvm.internal.impl.km.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadUtils.kt\nkotlin/metadata/internal/ReadUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1617#2,9:65\n1869#2:74\n1870#2:76\n1626#2:77\n1617#2,9:78\n1869#2:87\n1870#2:89\n1626#2:90\n1#3:75\n1#3:88\n*S KotlinDebug\n*F\n+ 1 ReadUtils.kt\nkotlin/metadata/internal/ReadUtilsKt\n*L\n19#1:65,9\n19#1:74\n19#1:76\n19#1:77\n55#1:78,9\n55#1:87\n55#1:89\n55#1:90\n19#1:75\n55#1:88\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type[] r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BYTE     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.SHORT     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.INT     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.LONG     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L2b:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.CHAR     // Catch: java.lang.NoSuchFieldError -> L34
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L34
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L34
            L34:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.FLOAT     // Catch: java.lang.NoSuchFieldError -> L3d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
            L3d:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L46
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L46
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L46
            L46:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L50
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L50
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L50
            L50:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.STRING     // Catch: java.lang.NoSuchFieldError -> L5a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5a
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5a
            L5a:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.CLASS     // Catch: java.lang.NoSuchFieldError -> L64
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L64
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L64
            L64:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ENUM     // Catch: java.lang.NoSuchFieldError -> L6e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6e
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6e
            L6e:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ANNOTATION     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ARRAY     // Catch: java.lang.NoSuchFieldError -> L82
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L82
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L82
            L82:
                kotlin.reflect.jvm.internal.impl.km.internal.f.a.a = r0
                return
        }
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = r1.a(r2)
            boolean r1 = r1.b(r2)
            if (r1 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 46
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            return r1
        L21:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.km.d b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r5.getId()
            java.lang.String r0 = a(r6, r0)
            java.util.List r5 = r5.getArgumentList()
            java.lang.String r1 = "getArgumentList(...)"
            kotlin.jvm.internal.g0.o(r5, r1)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L26:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r5.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument) r2
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r3 = r2.getValue()
            java.lang.String r4 = "getValue(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            kotlin.reflect.jvm.internal.impl.km.e r3 = c(r3, r6)
            if (r3 == 0) goto L4e
            int r2 = r2.getNameId()
            java.lang.String r2 = r6.getString(r2)
            kotlin.Pair r2 = kotlin.o0.a(r2, r3)
            goto L4f
        L4e:
            r2 = 0
        L4f:
            if (r2 == 0) goto L26
            r1.add(r2)
            goto L26
        L55:
            java.util.Map r5 = kotlin.collections.i1.B0(r1)
            kotlin.reflect.jvm.internal.impl.km.d r6 = new kotlin.reflect.jvm.internal.impl.km.d
            r6.<init>(r0, r5)
            return r6
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.km.e c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.g0.p(r7, r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.P
            int r1 = r6.getFlags()
            java.lang.Boolean r0 = r0.g(r1)
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L93
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r7 = r6.getType()
            if (r7 != 0) goto L24
            goto L2c
        L24:
            int[] r0 = kotlin.reflect.jvm.internal.impl.km.internal.f.a.a
            int r7 = r7.ordinal()
            r2 = r0[r7]
        L2c:
            if (r2 == r1) goto L83
            r7 = 2
            if (r2 == r7) goto L73
            r7 = 3
            if (r2 == r7) goto L64
            r7 = 4
            if (r2 != r7) goto L45
            kotlin.reflect.jvm.internal.impl.km.e$r r7 = new kotlin.reflect.jvm.internal.impl.km.e$r
            long r0 = r6.getIntValue()
            long r0 = kotlin.d1.k(r0)
            r7.<init>(r0, r3)
            return r7
        L45:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot read value of unsigned type: "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r6 = r6.getType()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L64:
            kotlin.reflect.jvm.internal.impl.km.e$q r7 = new kotlin.reflect.jvm.internal.impl.km.e$q
            long r0 = r6.getIntValue()
            int r6 = (int) r0
            int r6 = kotlin.z0.k(r6)
            r7.<init>(r6, r3)
            return r7
        L73:
            kotlin.reflect.jvm.internal.impl.km.e$s r7 = new kotlin.reflect.jvm.internal.impl.km.e$s
            long r0 = r6.getIntValue()
            int r6 = (int) r0
            short r6 = (short) r6
            short r6 = kotlin.j1.k(r6)
            r7.<init>(r6, r3)
            return r7
        L83:
            kotlin.reflect.jvm.internal.impl.km.e$p r7 = new kotlin.reflect.jvm.internal.impl.km.e$p
            long r0 = r6.getIntValue()
            int r6 = (int) r0
            byte r6 = (byte) r6
            byte r6 = kotlin.v0.k(r6)
            r7.<init>(r6, r3)
            return r7
        L93:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r0 = r6.getType()
            if (r0 != 0) goto L9a
            goto La2
        L9a:
            int[] r2 = kotlin.reflect.jvm.internal.impl.km.internal.f.a.a
            int r0 = r0.ordinal()
            r2 = r2[r0]
        La2:
            switch(r2) {
                case -1: goto L192;
                case 0: goto La5;
                case 1: goto L186;
                case 2: goto L17a;
                case 3: goto L16f;
                case 4: goto L165;
                case 5: goto L159;
                case 6: goto L14f;
                case 7: goto L145;
                case 8: goto L133;
                case 9: goto L125;
                case 10: goto L107;
                case 11: goto Lf1;
                case 12: goto Lde;
                case 13: goto Lab;
                default: goto La5;
            }
        La5:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        Lab:
            java.util.List r6 = r6.getArrayElementList()
            java.lang.String r0 = "getArrayElementList(...)"
            kotlin.jvm.internal.g0.o(r6, r0)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        Lbf:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Ld8
            java.lang.Object r1 = r6.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r1
            kotlin.jvm.internal.g0.m(r1)
            kotlin.reflect.jvm.internal.impl.km.e r1 = c(r1, r7)
            if (r1 == 0) goto Lbf
            r0.add(r1)
            goto Lbf
        Ld8:
            kotlin.reflect.jvm.internal.impl.km.e$c r6 = new kotlin.reflect.jvm.internal.impl.km.e$c
            r6.<init>(r0)
            return r6
        Lde:
            kotlin.reflect.jvm.internal.impl.km.e$a r0 = new kotlin.reflect.jvm.internal.impl.km.e$a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r6 = r6.getAnnotation()
            java.lang.String r1 = "getAnnotation(...)"
            kotlin.jvm.internal.g0.o(r6, r1)
            kotlin.reflect.jvm.internal.impl.km.d r6 = b(r6, r7)
            r0.<init>(r6)
            return r0
        Lf1:
            kotlin.reflect.jvm.internal.impl.km.e$h r0 = new kotlin.reflect.jvm.internal.impl.km.e$h
            int r1 = r6.getClassId()
            java.lang.String r1 = a(r7, r1)
            int r6 = r6.getEnumValueId()
            java.lang.String r6 = r7.getString(r6)
            r0.<init>(r1, r6)
            return r0
        L107:
            int r0 = r6.getClassId()
            java.lang.String r7 = a(r7, r0)
            int r0 = r6.getArrayDimensionCount()
            if (r0 != 0) goto L11b
            kotlin.reflect.jvm.internal.impl.km.e$k r6 = new kotlin.reflect.jvm.internal.impl.km.e$k
            r6.<init>(r7)
            return r6
        L11b:
            kotlin.reflect.jvm.internal.impl.km.e$b r0 = new kotlin.reflect.jvm.internal.impl.km.e$b
            int r6 = r6.getArrayDimensionCount()
            r0.<init>(r7, r6)
            return r0
        L125:
            kotlin.reflect.jvm.internal.impl.km.e$o r0 = new kotlin.reflect.jvm.internal.impl.km.e$o
            int r6 = r6.getStringValue()
            java.lang.String r6 = r7.getString(r6)
            r0.<init>(r6)
            return r0
        L133:
            kotlin.reflect.jvm.internal.impl.km.e$d r7 = new kotlin.reflect.jvm.internal.impl.km.e$d
            long r2 = r6.getIntValue()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L140
            goto L141
        L140:
            r1 = 0
        L141:
            r7.<init>(r1)
            return r7
        L145:
            kotlin.reflect.jvm.internal.impl.km.e$g r7 = new kotlin.reflect.jvm.internal.impl.km.e$g
            double r0 = r6.getDoubleValue()
            r7.<init>(r0)
            return r7
        L14f:
            kotlin.reflect.jvm.internal.impl.km.e$i r7 = new kotlin.reflect.jvm.internal.impl.km.e$i
            float r6 = r6.getFloatValue()
            r7.<init>(r6)
            return r7
        L159:
            kotlin.reflect.jvm.internal.impl.km.e$f r7 = new kotlin.reflect.jvm.internal.impl.km.e$f
            long r0 = r6.getIntValue()
            int r6 = (int) r0
            char r6 = (char) r6
            r7.<init>(r6)
            return r7
        L165:
            kotlin.reflect.jvm.internal.impl.km.e$m r7 = new kotlin.reflect.jvm.internal.impl.km.e$m
            long r0 = r6.getIntValue()
            r7.<init>(r0)
            return r7
        L16f:
            kotlin.reflect.jvm.internal.impl.km.e$j r7 = new kotlin.reflect.jvm.internal.impl.km.e$j
            long r0 = r6.getIntValue()
            int r6 = (int) r0
            r7.<init>(r6)
            return r7
        L17a:
            kotlin.reflect.jvm.internal.impl.km.e$n r7 = new kotlin.reflect.jvm.internal.impl.km.e$n
            long r0 = r6.getIntValue()
            int r6 = (int) r0
            short r6 = (short) r6
            r7.<init>(r6)
            return r7
        L186:
            kotlin.reflect.jvm.internal.impl.km.e$e r7 = new kotlin.reflect.jvm.internal.impl.km.e$e
            long r0 = r6.getIntValue()
            int r6 = (int) r0
            byte r6 = (byte) r6
            r7.<init>(r6)
            return r7
        L192:
            return r3
    }
}
