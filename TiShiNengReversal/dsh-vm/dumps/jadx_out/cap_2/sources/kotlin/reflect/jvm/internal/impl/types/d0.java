package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class d0 {
    private static /* synthetic */ void a(int r7) {
            r0 = 4
            if (r7 == r0) goto L6
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L8
        L6:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L8:
            r2 = 2
            if (r7 == r0) goto Ld
            r3 = 3
            goto Le
        Ld:
            r3 = 2
        Le:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor"
            r5 = 0
            switch(r7) {
                case 1: goto L28;
                case 2: goto L23;
                case 3: goto L1e;
                case 4: goto L1b;
                case 5: goto L16;
                case 6: goto L28;
                case 7: goto L23;
                case 8: goto L1e;
                default: goto L16;
            }
        L16:
            java.lang.String r6 = "typeParameters"
            r3[r5] = r6
            goto L2c
        L1b:
            r3[r5] = r4
            goto L2c
        L1e:
            java.lang.String r6 = "result"
            r3[r5] = r6
            goto L2c
        L23:
            java.lang.String r6 = "newContainingDeclaration"
            r3[r5] = r6
            goto L2c
        L28:
            java.lang.String r6 = "originalSubstitution"
            r3[r5] = r6
        L2c:
            java.lang.String r5 = "substituteTypeParameters"
            r6 = 1
            if (r7 == r0) goto L34
            r3[r6] = r4
            goto L36
        L34:
            r3[r6] = r5
        L36:
            if (r7 == r0) goto L3a
            r3[r2] = r5
        L3a:
            java.lang.String r1 = java.lang.String.format(r1, r3)
            if (r7 == r0) goto L46
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r1)
            goto L4b
        L46:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r1)
        L4b:
            throw r7
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.types.h2 b(@org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r4) {
            if (r1 != 0) goto L6
            r0 = 0
            a(r0)
        L6:
            if (r2 != 0) goto Lc
            r0 = 1
            a(r0)
        Lc:
            if (r3 != 0) goto L12
            r0 = 2
            a(r0)
        L12:
            if (r4 != 0) goto L18
            r0 = 3
            a(r0)
        L18:
            r0 = 0
            kotlin.reflect.jvm.internal.impl.types.h2 r1 = c(r1, r2, r3, r4, r0)
            if (r1 == 0) goto L20
            return r1
        L20:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "Substitution failed"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.types.h2 c(@org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r16, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r18, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r19, @org.jetbrains.annotations.Nullable boolean[] r20) {
            r0 = r17
            r1 = r19
            if (r16 != 0) goto La
            r2 = 5
            a(r2)
        La:
            if (r0 != 0) goto L10
            r2 = 6
            a(r2)
        L10:
            if (r18 != 0) goto L16
            r2 = 7
            a(r2)
        L16:
            if (r1 != 0) goto L1d
            r2 = 8
            a(r2)
        L1d:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r4 = r16.iterator()
            r5 = 0
            r11 = 0
        L2d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L70
            java.lang.Object r6 = r4.next()
            r14 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r14 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r14
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r7 = r14.getAnnotations()
            boolean r8 = r14.j()
            kotlin.reflect.jvm.internal.impl.types.Variance r9 = r14.l()
            kotlin.reflect.jvm.internal.impl.name.f r10 = r14.getName()
            int r15 = r11 + 1
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r12 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            kotlin.reflect.jvm.internal.impl.storage.n r13 = r14.d0()
            r6 = r18
            kotlin.reflect.jvm.internal.impl.descriptors.impl.t0 r7 = kotlin.reflect.jvm.internal.impl.descriptors.impl.t0.L0(r6, r7, r8, r9, r10, r11, r12, r13)
            kotlin.reflect.jvm.internal.impl.types.w1 r6 = r14.o()
            kotlin.reflect.jvm.internal.impl.types.e2 r8 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.e1 r9 = r7.s()
            r8.<init>(r9)
            r2.put(r6, r8)
            r3.put(r14, r7)
            r1.add(r7)
            r11 = r15
            goto L2d
        L70:
            kotlin.reflect.jvm.internal.impl.types.x1 r1 = kotlin.reflect.jvm.internal.impl.types.x1.j(r2)
            kotlin.reflect.jvm.internal.impl.types.h2 r2 = kotlin.reflect.jvm.internal.impl.types.h2.h(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r0.h()
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = kotlin.reflect.jvm.internal.impl.types.h2.h(r0, r1)
            java.util.Iterator r1 = r16.iterator()
        L84:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lda
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r4
            java.lang.Object r6 = r3.get(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.t0 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.t0) r6
            java.util.List r4 = r4.getUpperBounds()
            java.util.Iterator r4 = r4.iterator()
        L9e:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto Ld6
            java.lang.Object r7 = r4.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r7 = (kotlin.reflect.jvm.internal.impl.types.t0) r7
            kotlin.reflect.jvm.internal.impl.types.w1 r8 = r7.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r8 = r8.c()
            boolean r9 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            if (r9 == 0) goto Lc0
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r8 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r8
            boolean r8 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.q(r8)
            if (r8 == 0) goto Lc0
            r8 = r2
            goto Lc1
        Lc0:
            r8 = r0
        Lc1:
            kotlin.reflect.jvm.internal.impl.types.Variance r9 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.t0 r8 = r8.p(r7, r9)
            if (r8 != 0) goto Lcb
            r0 = 0
            return r0
        Lcb:
            if (r8 == r7) goto Ld2
            if (r20 == 0) goto Ld2
            r7 = 1
            r20[r5] = r7
        Ld2:
            r6.H0(r8)
            goto L9e
        Ld6:
            r6.Q0()
            goto L84
        Lda:
            return r2
    }
}
