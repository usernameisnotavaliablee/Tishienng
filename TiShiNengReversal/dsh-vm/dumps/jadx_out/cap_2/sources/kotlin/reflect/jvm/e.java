package kotlin.reflect.jvm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nreflectLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 reflectLambda.kt\nkotlin/reflect/jvm/ReflectLambdaKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function, kotlin.reflect.jvm.internal.impl.descriptors.d1> {
        public static final kotlin.reflect.jvm.e.a a = null;

        static {
                kotlin.reflect.jvm.e$a r0 = new kotlin.reflect.jvm.e$a
                r0.<init>()
                kotlin.reflect.jvm.e.a.a = r0
                return
        }

        a() {
                r6 = this;
                java.lang.String r4 = "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;"
                r5 = 0
                r1 = 2
                java.lang.Class<kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0> r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0.class
                java.lang.String r3 = "loadFunction"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.d1 c(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r2, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function r3) {
                r1 = this;
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "p1"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.d1 r2 = r2.s(r3)
                return r2
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d1 invoke(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r1, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function r2) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r1 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0) r1
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r2
                kotlin.reflect.jvm.internal.impl.descriptors.d1 r1 = r0.c(r1, r2)
                return r1
        }
    }

    @kotlin.reflect.jvm.ExperimentalReflectionOnLambdas
    @org.jetbrains.annotations.Nullable
    public static final <R> kotlin.reflect.i<R> a(@org.jetbrains.annotations.NotNull kotlin.n<? extends R> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.Class r0 = r9.getClass()
            java.lang.Class<kotlin.Metadata> r1 = kotlin.Metadata.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            kotlin.Metadata r0 = (kotlin.Metadata) r0
            r1 = 0
            if (r0 != 0) goto L15
            return r1
        L15:
            java.lang.String[] r2 = r0.d1()
            int r3 = r2.length
            if (r3 != 0) goto L1d
            r2 = r1
        L1d:
            if (r2 != 0) goto L20
            return r1
        L20:
            java.lang.String[] r1 = r0.d2()
            kotlin.Pair r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.j(r2, r1)
            java.lang.Object r2 = r1.component1()
            r5 = r2
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e r5 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e) r5
            java.lang.Object r1 = r1.component2()
            r4 = r1
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r4
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r7 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
            int[] r1 = r0.mv()
            int r0 = r0.xi()
            r0 = r0 & 8
            if (r0 == 0) goto L46
            r0 = 1
            goto L47
        L46:
            r0 = 0
        L47:
            r7.<init>(r1, r0)
            java.lang.Class r3 = r9.getClass()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r6 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.h
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r9 = r4.getTypeTable()
            java.lang.String r0 = "getTypeTable(...)"
            kotlin.jvm.internal.g0.o(r9, r0)
            r6.<init>(r9)
            kotlin.reflect.jvm.e$a r8 = kotlin.reflect.jvm.e.a.a
            kotlin.reflect.jvm.internal.impl.descriptors.a r9 = kotlin.reflect.jvm.internal.p3.h(r3, r4, r5, r6, r7, r8)
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r9 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r9
            kotlin.reflect.jvm.internal.m1 r0 = new kotlin.reflect.jvm.internal.m1
            kotlin.reflect.jvm.internal.o r1 = kotlin.reflect.jvm.internal.o.d
            r0.<init>(r1, r9)
            return r0
    }
}
