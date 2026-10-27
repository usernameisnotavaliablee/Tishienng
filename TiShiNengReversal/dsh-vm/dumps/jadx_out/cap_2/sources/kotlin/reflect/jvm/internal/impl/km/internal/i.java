package kotlin.reflect.jvm.internal.impl.km.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i {
    public static final int a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.serialization.d r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.km.b.a(r3)
            if (r0 == 0) goto L1f
            r0 = 1
            java.lang.String r3 = r3.substring(r0)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.g0.o(r3, r1)
            int r2 = r2.b(r3, r0)
            return r2
        L1f:
            r0 = 0
            int r2 = r2.b(r3, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.b b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.d r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.serialization.d r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$b r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.newBuilder()
            java.lang.String r1 = r4.c()
            int r1 = a(r5, r1)
            r0.B(r1)
            java.util.Map r4 = r4.b()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L25:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            kotlin.reflect.jvm.internal.impl.km.e r1 = (kotlin.reflect.jvm.internal.impl.km.e) r1
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$b r3 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.newBuilder()
            int r2 = r5.a(r2)
            r3.A(r2)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$b r1 = c(r1, r5)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r1 = r1.o()
            r3.B(r1)
            r0.n(r3)
            goto L25
        L57:
            java.lang.String r4 = "apply(...)"
            kotlin.jvm.internal.g0.o(r0, r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.b c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.e r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.serialization.d r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$b r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.newBuilder()
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.km.e.C0036e
            if (r1 == 0) goto L27
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r4 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BYTE
            r0.M(r4)
            kotlin.reflect.jvm.internal.impl.km.e$e r3 = (kotlin.reflect.jvm.internal.impl.km.e.C0036e) r3
            java.lang.Byte r3 = r3.b()
            byte r3 = r3.byteValue()
            long r3 = (long) r3
            r0.K(r3)
            goto L217
        L27:
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.km.e.f
            if (r1 == 0) goto L40
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r4 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.CHAR
            r0.M(r4)
            kotlin.reflect.jvm.internal.impl.km.e$f r3 = (kotlin.reflect.jvm.internal.impl.km.e.f) r3
            java.lang.Character r3 = r3.b()
            char r3 = r3.charValue()
            long r3 = (long) r3
            r0.K(r3)
            goto L217
        L40:
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.km.e.n
            if (r1 == 0) goto L59
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r4 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.SHORT
            r0.M(r4)
            kotlin.reflect.jvm.internal.impl.km.e$n r3 = (kotlin.reflect.jvm.internal.impl.km.e.n) r3
            java.lang.Short r3 = r3.b()
            short r3 = r3.shortValue()
            long r3 = (long) r3
            r0.K(r3)
            goto L217
        L59:
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.km.e.j
            if (r1 == 0) goto L72
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r4 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.INT
            r0.M(r4)
            kotlin.reflect.jvm.internal.impl.km.e$j r3 = (kotlin.reflect.jvm.internal.impl.km.e.j) r3
            java.lang.Integer r3 = r3.b()
            int r3 = r3.intValue()
            long r3 = (long) r3
            r0.K(r3)
            goto L217
        L72:
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.km.e.m
            if (r1 == 0) goto L8a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r4 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.LONG
            r0.M(r4)
            kotlin.reflect.jvm.internal.impl.km.e$m r3 = (kotlin.reflect.jvm.internal.impl.km.e.m) r3
            java.lang.Long r3 = r3.b()
            long r3 = r3.longValue()
            r0.K(r3)
            goto L217
        L8a:
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.km.e.i
            if (r1 == 0) goto La2
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r4 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.FLOAT
            r0.M(r4)
            kotlin.reflect.jvm.internal.impl.km.e$i r3 = (kotlin.reflect.jvm.internal.impl.km.e.i) r3
            java.lang.Float r3 = r3.b()
            float r3 = r3.floatValue()
            r0.J(r3)
            goto L217
        La2:
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.km.e.g
            if (r1 == 0) goto Lba
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r4 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.DOUBLE
            r0.M(r4)
            kotlin.reflect.jvm.internal.impl.km.e$g r3 = (kotlin.reflect.jvm.internal.impl.km.e.g) r3
            java.lang.Double r3 = r3.b()
            double r3 = r3.doubleValue()
            r0.G(r3)
            goto L217
        Lba:
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.km.e.d
            if (r1 == 0) goto Ld9
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r4 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BOOLEAN
            r0.M(r4)
            kotlin.reflect.jvm.internal.impl.km.e$d r3 = (kotlin.reflect.jvm.internal.impl.km.e.d) r3
            java.lang.Boolean r3 = r3.b()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Ld2
            r3 = 1
            goto Ld4
        Ld2:
            r3 = 0
        Ld4:
            r0.K(r3)
            goto L217
        Ld9:
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.km.e.p
            if (r1 == 0) goto Lfc
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r4 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BYTE
            r0.M(r4)
            kotlin.reflect.jvm.internal.impl.km.e$p r3 = (kotlin.reflect.jvm.internal.impl.km.e.p) r3
            byte r3 = r3.b()
            long r3 = (long) r3
            r1 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r1
            r0.K(r3)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.P
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            int r3 = r3.h(r4)
            r0.I(r3)
            goto L217
        Lfc:
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.km.e.s
            if (r1 == 0) goto L120
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r4 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.SHORT
            r0.M(r4)
            kotlin.reflect.jvm.internal.impl.km.e$s r3 = (kotlin.reflect.jvm.internal.impl.km.e.s) r3
            short r3 = r3.b()
            long r3 = (long) r3
            r1 = 65535(0xffff, double:3.23786E-319)
            long r3 = r3 & r1
            r0.K(r3)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.P
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            int r3 = r3.h(r4)
            r0.I(r3)
            goto L217
        L120:
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.km.e.q
            if (r1 == 0) goto L146
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r4 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.INT
            r0.M(r4)
            kotlin.reflect.jvm.internal.impl.km.e$q r3 = (kotlin.reflect.jvm.internal.impl.km.e.q) r3
            int r3 = r3.b()
            long r3 = (long) r3
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            r0.K(r3)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.P
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            int r3 = r3.h(r4)
            r0.I(r3)
            goto L217
        L146:
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.km.e.r
            if (r1 == 0) goto L165
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r4 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.LONG
            r0.M(r4)
            kotlin.reflect.jvm.internal.impl.km.e$r r3 = (kotlin.reflect.jvm.internal.impl.km.e.r) r3
            long r3 = r3.b()
            r0.K(r3)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.P
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            int r3 = r3.h(r4)
            r0.I(r3)
            goto L217
        L165:
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.km.e.o
            if (r1 == 0) goto L17d
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.STRING
            r0.M(r1)
            kotlin.reflect.jvm.internal.impl.km.e$o r3 = (kotlin.reflect.jvm.internal.impl.km.e.o) r3
            java.lang.String r3 = r3.b()
            int r3 = r4.a(r3)
            r0.L(r3)
            goto L217
        L17d:
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.km.e.k
            if (r1 == 0) goto L195
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.CLASS
            r0.M(r1)
            kotlin.reflect.jvm.internal.impl.km.e$k r3 = (kotlin.reflect.jvm.internal.impl.km.e.k) r3
            java.lang.String r3 = r3.a()
            int r3 = a(r4, r3)
            r0.F(r3)
            goto L217
        L195:
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.km.e.b
            if (r1 == 0) goto L1b3
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.CLASS
            r0.M(r1)
            kotlin.reflect.jvm.internal.impl.km.e$b r3 = (kotlin.reflect.jvm.internal.impl.km.e.b) r3
            java.lang.String r1 = r3.b()
            int r4 = a(r4, r1)
            r0.F(r4)
            int r3 = r3.a()
            r0.E(r3)
            goto L217
        L1b3:
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.km.e.h
            if (r1 == 0) goto L1d5
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ENUM
            r0.M(r1)
            kotlin.reflect.jvm.internal.impl.km.e$h r3 = (kotlin.reflect.jvm.internal.impl.km.e.h) r3
            java.lang.String r1 = r3.a()
            int r1 = a(r4, r1)
            r0.F(r1)
            java.lang.String r3 = r3.b()
            int r3 = r4.a(r3)
            r0.H(r3)
            goto L217
        L1d5:
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.km.e.a
            if (r1 == 0) goto L1f0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ANNOTATION
            r0.M(r1)
            kotlin.reflect.jvm.internal.impl.km.e$a r3 = (kotlin.reflect.jvm.internal.impl.km.e.a) r3
            kotlin.reflect.jvm.internal.impl.km.d r3 = r3.a()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$b r3 = b(r3, r4)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r3 = r3.o()
            r0.D(r3)
            goto L217
        L1f0:
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.km.e.c
            if (r1 == 0) goto L21d
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ARRAY
            r0.M(r1)
            kotlin.reflect.jvm.internal.impl.km.e$c r3 = (kotlin.reflect.jvm.internal.impl.km.e.c) r3
            java.util.List r3 = r3.a()
            java.util.Iterator r3 = r3.iterator()
        L203:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L217
            java.lang.Object r1 = r3.next()
            kotlin.reflect.jvm.internal.impl.km.e r1 = (kotlin.reflect.jvm.internal.impl.km.e) r1
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$b r1 = c(r1, r4)
            r0.n(r1)
            goto L203
        L217:
            java.lang.String r3 = "apply(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            return r0
        L21d:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
    }
}
