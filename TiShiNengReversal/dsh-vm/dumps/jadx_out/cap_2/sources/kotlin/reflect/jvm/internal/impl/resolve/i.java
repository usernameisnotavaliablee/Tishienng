package kotlin.reflect.jvm.internal.impl.resolve;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class i {
    public static final kotlin.reflect.jvm.internal.impl.name.c a = null;
    static final /* synthetic */ boolean b = false;

    static {
            kotlin.reflect.jvm.internal.impl.name.c r0 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r1 = "kotlin.jvm.JvmName"
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.resolve.i.a = r0
            return
    }

    private i() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean A(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS
            boolean r1 = D(r1, r0)
            return r1
    }

    public static boolean B(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            if (r1 != 0) goto L7
            r0 = 36
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY
            boolean r1 = D(r1, r0)
            return r1
    }

    public static boolean C(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE
            boolean r1 = D(r1, r0)
            return r1
    }

    private static boolean D(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.k r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2) {
            if (r2 != 0) goto L7
            r0 = 37
            a(r0)
        L7:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = r1.h()
            if (r1 != r2) goto L15
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static boolean E(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
            r0 = 1
            if (r2 != 0) goto L6
            a(r0)
        L6:
            if (r2 == 0) goto L1b
            boolean r1 = u(r2)
            if (r1 != 0) goto L1a
            boolean r1 = y(r2)
            if (r1 == 0) goto L15
            goto L1a
        L15:
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r2.b()
            goto L6
        L1a:
            return r0
        L1b:
            r2 = 0
            return r2
    }

    private static boolean F(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
            if (r1 != 0) goto L7
            r0 = 30
            a(r0)
        L7:
            if (r2 != 0) goto Le
            r0 = 31
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.c()
            if (r1 == 0) goto L38
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r1.a()
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f
            if (r0 == 0) goto L38
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f
            if (r0 == 0) goto L38
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = (kotlin.reflect.jvm.internal.impl.descriptors.f) r2
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.o()
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = (kotlin.reflect.jvm.internal.impl.descriptors.f) r1
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.o()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L38
            r1 = 1
            return r1
        L38:
            r1 = 0
            return r1
    }

    public static boolean G(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS
            boolean r0 = D(r1, r0)
            if (r0 != 0) goto L10
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE
            boolean r0 = D(r1, r0)
            if (r0 == 0) goto L1c
        L10:
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = r1.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED
            if (r1 != r0) goto L1c
            r1 = 1
            return r1
        L1c:
            r1 = 0
            return r1
    }

    public static boolean H(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2) {
            if (r1 != 0) goto L7
            r0 = 28
            a(r0)
        L7:
            if (r2 != 0) goto Le
            r0 = 29
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.s()
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r2.a()
            boolean r1 = I(r1, r2)
            return r1
    }

    public static boolean I(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3) {
            if (r2 != 0) goto L7
            r0 = 32
            a(r0)
        L7:
            if (r3 != 0) goto Le
            r0 = 33
            a(r0)
        Le:
            boolean r0 = F(r2, r3)
            r1 = 1
            if (r0 == 0) goto L16
            return r1
        L16:
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.I0()
            java.util.Collection r2 = r2.i()
            java.util.Iterator r2 = r2.iterator()
        L22:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r2.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            boolean r0 = I(r0, r3)
            if (r0 == 0) goto L22
            return r1
        L35:
            r2 = 0
            return r2
    }

    public static boolean J(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.k r0) {
            if (r0 == 0) goto Lc
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r0.b()
            boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public static boolean K(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s1 r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r5) {
            if (r4 != 0) goto L7
            r0 = 65
            a(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 66
            a(r0)
        Le:
            boolean r0 = r4.C()
            r1 = 0
            if (r0 != 0) goto L5d
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.x0.a(r5)
            if (r0 == 0) goto L1c
            goto L5d
        L1c:
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.j2.b(r5)
            r2 = 1
            if (r0 == 0) goto L24
            return r2
        L24:
            kotlin.reflect.jvm.internal.impl.builtins.j r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.m(r4)
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.j.t0(r5)
            if (r0 != 0) goto L5c
            kotlin.reflect.jvm.internal.impl.types.checker.e r0 = kotlin.reflect.jvm.internal.impl.types.checker.e.a
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r4.X()
            boolean r3 = r0.a(r3, r5)
            if (r3 != 0) goto L5c
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = r4.L()
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r3.s()
            boolean r3 = r0.a(r3, r5)
            if (r3 != 0) goto L5c
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r4.i()
            boolean r4 = r0.a(r4, r5)
            if (r4 != 0) goto L5c
            kotlin.reflect.jvm.internal.impl.builtins.q r4 = kotlin.reflect.jvm.internal.impl.builtins.q.a
            boolean r4 = kotlin.reflect.jvm.internal.impl.builtins.q.d(r5)
            if (r4 == 0) goto L5b
            goto L5c
        L5b:
            return r1
        L5c:
            return r2
        L5d:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> D L(@org.jetbrains.annotations.NotNull D r3) {
            if (r3 != 0) goto L7
            r0 = 58
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r0 = r3.h()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r1 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
            if (r0 != r1) goto L3b
            java.util.Collection r0 = r3.e()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L24
            java.util.Iterator r3 = r0.iterator()
            java.lang.Object r3 = r3.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r3
            goto L7
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fake override should have at least one overridden descriptor: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L3b:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.o> D M(@org.jetbrains.annotations.NotNull D r1) {
            if (r1 != 0) goto L7
            r0 = 63
            a(r0)
        L7:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r0 == 0) goto L12
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r1
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = L(r1)
            return r1
        L12:
            if (r1 != 0) goto L19
            r0 = 64
            a(r0)
        L19:
            return r1
    }

    private static /* synthetic */ void a(int r23) {
            switch(r23) {
                case 4: goto L6;
                case 7: goto L6;
                case 9: goto L6;
                case 10: goto L6;
                case 12: goto L6;
                case 22: goto L6;
                case 40: goto L6;
                case 42: goto L6;
                case 43: goto L6;
                case 47: goto L6;
                case 49: goto L6;
                case 50: goto L6;
                case 51: goto L6;
                case 52: goto L6;
                case 53: goto L6;
                case 59: goto L6;
                case 61: goto L6;
                case 62: goto L6;
                case 64: goto L6;
                case 71: goto L6;
                case 75: goto L6;
                case 82: goto L6;
                case 83: goto L6;
                case 85: goto L6;
                case 88: goto L6;
                case 93: goto L6;
                case 95: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L8
        L6:
            java.lang.String r0 = "@NotNull method %s.%s must not return null"
        L8:
            r1 = 2
            switch(r23) {
                case 4: goto Le;
                case 7: goto Le;
                case 9: goto Le;
                case 10: goto Le;
                case 12: goto Le;
                case 22: goto Le;
                case 40: goto Le;
                case 42: goto Le;
                case 43: goto Le;
                case 47: goto Le;
                case 49: goto Le;
                case 50: goto Le;
                case 51: goto Le;
                case 52: goto Le;
                case 53: goto Le;
                case 59: goto Le;
                case 61: goto Le;
                case 62: goto Le;
                case 64: goto Le;
                case 71: goto Le;
                case 75: goto Le;
                case 82: goto Le;
                case 83: goto Le;
                case 85: goto Le;
                case 88: goto Le;
                case 93: goto Le;
                case 95: goto Le;
                default: goto Lc;
            }
        Lc:
            r2 = 3
            goto Lf
        Le:
            r2 = 2
        Lf:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils"
            r4 = 0
            switch(r23) {
                case 1: goto L93;
                case 2: goto L93;
                case 3: goto L93;
                case 4: goto L90;
                case 5: goto L93;
                case 6: goto L93;
                case 7: goto L90;
                case 8: goto L93;
                case 9: goto L90;
                case 10: goto L90;
                case 11: goto L93;
                case 12: goto L90;
                case 13: goto L93;
                case 14: goto L93;
                case 15: goto L93;
                case 16: goto L8b;
                case 17: goto L86;
                case 18: goto L81;
                case 19: goto L81;
                case 20: goto L7c;
                case 21: goto L93;
                case 22: goto L90;
                case 23: goto L93;
                case 24: goto L93;
                case 25: goto L77;
                case 26: goto L72;
                case 27: goto L6d;
                case 28: goto L72;
                case 29: goto L6d;
                case 30: goto L68;
                case 31: goto L63;
                case 32: goto L68;
                case 33: goto L6d;
                case 34: goto L93;
                case 35: goto L93;
                case 36: goto L93;
                case 37: goto L5e;
                case 38: goto L59;
                case 39: goto L59;
                case 40: goto L90;
                case 41: goto L59;
                case 42: goto L90;
                case 43: goto L90;
                case 44: goto L59;
                case 45: goto L68;
                case 46: goto L54;
                case 47: goto L90;
                case 48: goto L59;
                case 49: goto L90;
                case 50: goto L90;
                case 51: goto L90;
                case 52: goto L90;
                case 53: goto L90;
                case 54: goto L59;
                case 55: goto L4f;
                case 56: goto L4a;
                case 57: goto L93;
                case 58: goto L93;
                case 59: goto L90;
                case 60: goto L93;
                case 61: goto L90;
                case 62: goto L90;
                case 63: goto L93;
                case 64: goto L90;
                case 65: goto L45;
                case 66: goto L68;
                case 67: goto L59;
                case 68: goto L59;
                case 69: goto L59;
                case 70: goto L40;
                case 71: goto L90;
                case 72: goto L3b;
                case 73: goto L35;
                case 74: goto L2f;
                case 75: goto L90;
                case 76: goto L59;
                case 77: goto L59;
                case 78: goto L29;
                case 79: goto L29;
                case 80: goto L29;
                case 81: goto L93;
                case 82: goto L90;
                case 83: goto L90;
                case 84: goto L23;
                case 85: goto L90;
                case 86: goto L23;
                case 87: goto L1d;
                case 88: goto L90;
                case 89: goto L23;
                case 90: goto L1d;
                case 91: goto L23;
                case 92: goto L1d;
                case 93: goto L90;
                case 94: goto L93;
                case 95: goto L90;
                default: goto L17;
            }
        L17:
            java.lang.String r5 = "containingDeclaration"
            r2[r4] = r5
            goto L97
        L1d:
            java.lang.String r5 = "name"
            r2[r4] = r5
            goto L97
        L23:
            java.lang.String r5 = "scope"
            r2[r4] = r5
            goto L97
        L29:
            java.lang.String r5 = "annotated"
            r2[r4] = r5
            goto L97
        L2f:
            java.lang.String r5 = "memberDescriptor"
            r2[r4] = r5
            goto L97
        L35:
            java.lang.String r5 = "result"
            r2[r4] = r5
            goto L97
        L3b:
            java.lang.String r5 = "current"
            r2[r4] = r5
            goto L97
        L40:
            java.lang.String r5 = "f"
            r2[r4] = r5
            goto L97
        L45:
            java.lang.String r5 = "variable"
            r2[r4] = r5
            goto L97
        L4a:
            java.lang.String r5 = "location"
            r2[r4] = r5
            goto L97
        L4f:
            java.lang.String r5 = "innerClassName"
            r2[r4] = r5
            goto L97
        L54:
            java.lang.String r5 = "typeConstructor"
            r2[r4] = r5
            goto L97
        L59:
            java.lang.String r5 = "classDescriptor"
            r2[r4] = r5
            goto L97
        L5e:
            java.lang.String r5 = "classKind"
            r2[r4] = r5
            goto L97
        L63:
            java.lang.String r5 = "other"
            r2[r4] = r5
            goto L97
        L68:
            java.lang.String r5 = "type"
            r2[r4] = r5
            goto L97
        L6d:
            java.lang.String r5 = "superClass"
            r2[r4] = r5
            goto L97
        L72:
            java.lang.String r5 = "subClass"
            r2[r4] = r5
            goto L97
        L77:
            java.lang.String r5 = "declarationDescriptor"
            r2[r4] = r5
            goto L97
        L7c:
            java.lang.String r5 = "kotlinType"
            r2[r4] = r5
            goto L97
        L81:
            java.lang.String r5 = "aClass"
            r2[r4] = r5
            goto L97
        L86:
            java.lang.String r5 = "second"
            r2[r4] = r5
            goto L97
        L8b:
            java.lang.String r5 = "first"
            r2[r4] = r5
            goto L97
        L90:
            r2[r4] = r3
            goto L97
        L93:
            java.lang.String r5 = "descriptor"
            r2[r4] = r5
        L97:
            java.lang.String r4 = "getFqNameUnsafe"
            java.lang.String r5 = "getFqNameFromTopLevelClass"
            java.lang.String r6 = "getClassIdForNonLocalClass"
            java.lang.String r7 = "getContainingModule"
            java.lang.String r8 = "getSuperclassDescriptors"
            java.lang.String r9 = "getSuperClassType"
            java.lang.String r10 = "getClassDescriptorForTypeConstructor"
            java.lang.String r11 = "getDefaultConstructorVisibility"
            java.lang.String r12 = "unwrapFakeOverride"
            java.lang.String r13 = "unwrapSubstitutionOverride"
            java.lang.String r14 = "unwrapFakeOverrideToAnyDeclaration"
            java.lang.String r15 = "getAllOverriddenDescriptors"
            java.lang.String r16 = "getAllOverriddenDeclarations"
            java.lang.String r17 = "getContainingSourceFile"
            java.lang.String r18 = "getAllDescriptors"
            java.lang.String r19 = "getFunctionByName"
            java.lang.String r20 = "getPropertyByName"
            java.lang.String r21 = "getDirectMember"
            r22 = 1
            switch(r23) {
                case 4: goto Lf9;
                case 7: goto Lf6;
                case 9: goto Lf3;
                case 10: goto Lf3;
                case 12: goto Lf0;
                case 22: goto Led;
                case 40: goto Lea;
                case 42: goto Le7;
                case 43: goto Le7;
                case 47: goto Le4;
                case 49: goto Le1;
                case 50: goto Le1;
                case 51: goto Le1;
                case 52: goto Le1;
                case 53: goto Le1;
                case 59: goto Lde;
                case 61: goto Ldb;
                case 62: goto Ldb;
                case 64: goto Ld8;
                case 71: goto Ld5;
                case 75: goto Ld2;
                case 82: goto Lcf;
                case 83: goto Lcf;
                case 85: goto Lcc;
                case 88: goto Lc9;
                case 93: goto Lc6;
                case 95: goto Lc3;
                default: goto Lc0;
            }
        Lc0:
            r2[r22] = r3
            goto Lfd
        Lc3:
            r2[r22] = r21
            goto Lfd
        Lc6:
            r2[r22] = r20
            goto Lfd
        Lc9:
            r2[r22] = r19
            goto Lfd
        Lcc:
            r2[r22] = r18
            goto Lfd
        Lcf:
            r2[r22] = r17
            goto Lfd
        Ld2:
            r2[r22] = r16
            goto Lfd
        Ld5:
            r2[r22] = r15
            goto Lfd
        Ld8:
            r2[r22] = r14
            goto Lfd
        Ldb:
            r2[r22] = r13
            goto Lfd
        Lde:
            r2[r22] = r12
            goto Lfd
        Le1:
            r2[r22] = r11
            goto Lfd
        Le4:
            r2[r22] = r10
            goto Lfd
        Le7:
            r2[r22] = r9
            goto Lfd
        Lea:
            r2[r22] = r8
            goto Lfd
        Led:
            r2[r22] = r7
            goto Lfd
        Lf0:
            r2[r22] = r6
            goto Lfd
        Lf3:
            r2[r22] = r5
            goto Lfd
        Lf6:
            r2[r22] = r4
            goto Lfd
        Lf9:
            java.lang.String r3 = "getFqNameSafe"
            r2[r22] = r3
        Lfd:
            switch(r23) {
                case 1: goto L20d;
                case 2: goto L208;
                case 3: goto L203;
                case 4: goto L211;
                case 5: goto L1fe;
                case 6: goto L1fb;
                case 7: goto L211;
                case 8: goto L1f8;
                case 9: goto L211;
                case 10: goto L211;
                case 11: goto L1f5;
                case 12: goto L211;
                case 13: goto L1f0;
                case 14: goto L1eb;
                case 15: goto L1e6;
                case 16: goto L1e1;
                case 17: goto L1e1;
                case 18: goto L1dc;
                case 19: goto L1dc;
                case 20: goto L1d7;
                case 21: goto L1d4;
                case 22: goto L211;
                case 23: goto L1d7;
                case 24: goto L1cf;
                case 25: goto L1ca;
                case 26: goto L1c5;
                case 27: goto L1c5;
                case 28: goto L1c0;
                case 29: goto L1c0;
                case 30: goto L1bb;
                case 31: goto L1bb;
                case 32: goto L1b6;
                case 33: goto L1b6;
                case 34: goto L1b0;
                case 35: goto L1aa;
                case 36: goto L1a4;
                case 37: goto L19e;
                case 38: goto L198;
                case 39: goto L194;
                case 40: goto L211;
                case 41: goto L190;
                case 42: goto L211;
                case 43: goto L211;
                case 44: goto L18a;
                case 45: goto L184;
                case 46: goto L180;
                case 47: goto L211;
                case 48: goto L17c;
                case 49: goto L211;
                case 50: goto L211;
                case 51: goto L211;
                case 52: goto L211;
                case 53: goto L211;
                case 54: goto L176;
                case 55: goto L176;
                case 56: goto L176;
                case 57: goto L170;
                case 58: goto L16c;
                case 59: goto L211;
                case 60: goto L168;
                case 61: goto L211;
                case 62: goto L211;
                case 63: goto L164;
                case 64: goto L211;
                case 65: goto L15e;
                case 66: goto L15e;
                case 67: goto L158;
                case 68: goto L152;
                case 69: goto L14c;
                case 70: goto L148;
                case 71: goto L211;
                case 72: goto L142;
                case 73: goto L142;
                case 74: goto L13e;
                case 75: goto L211;
                case 76: goto L138;
                case 77: goto L132;
                case 78: goto L12c;
                case 79: goto L126;
                case 80: goto L120;
                case 81: goto L11c;
                case 82: goto L211;
                case 83: goto L211;
                case 84: goto L118;
                case 85: goto L211;
                case 86: goto L114;
                case 87: goto L114;
                case 88: goto L211;
                case 89: goto L10e;
                case 90: goto L10e;
                case 91: goto L10a;
                case 92: goto L10a;
                case 93: goto L211;
                case 94: goto L106;
                case 95: goto L211;
                default: goto L100;
            }
        L100:
            java.lang.String r3 = "getDispatchReceiverParameterIfNeeded"
            r2[r1] = r3
            goto L211
        L106:
            r2[r1] = r21
            goto L211
        L10a:
            r2[r1] = r20
            goto L211
        L10e:
            java.lang.String r3 = "getFunctionByNameOrNull"
            r2[r1] = r3
            goto L211
        L114:
            r2[r1] = r19
            goto L211
        L118:
            r2[r1] = r18
            goto L211
        L11c:
            r2[r1] = r17
            goto L211
        L120:
            java.lang.String r3 = "hasJvmNameAnnotation"
            r2[r1] = r3
            goto L211
        L126:
            java.lang.String r3 = "findJvmNameAnnotation"
            r2[r1] = r3
            goto L211
        L12c:
            java.lang.String r3 = "getJvmName"
            r2[r1] = r3
            goto L211
        L132:
            java.lang.String r3 = "canHaveDeclaredConstructors"
            r2[r1] = r3
            goto L211
        L138:
            java.lang.String r3 = "isSingletonOrAnonymousObject"
            r2[r1] = r3
            goto L211
        L13e:
            r2[r1] = r16
            goto L211
        L142:
            java.lang.String r3 = "collectAllOverriddenDescriptors"
            r2[r1] = r3
            goto L211
        L148:
            r2[r1] = r15
            goto L211
        L14c:
            java.lang.String r3 = "classCanHaveOpenMembers"
            r2[r1] = r3
            goto L211
        L152:
            java.lang.String r3 = "classCanHaveAbstractDeclaration"
            r2[r1] = r3
            goto L211
        L158:
            java.lang.String r3 = "classCanHaveAbstractFakeOverride"
            r2[r1] = r3
            goto L211
        L15e:
            java.lang.String r3 = "shouldRecordInitializerForProperty"
            r2[r1] = r3
            goto L211
        L164:
            r2[r1] = r14
            goto L211
        L168:
            r2[r1] = r13
            goto L211
        L16c:
            r2[r1] = r12
            goto L211
        L170:
            java.lang.String r3 = "isStaticNestedClass"
            r2[r1] = r3
            goto L211
        L176:
            java.lang.String r3 = "getInnerClassByName"
            r2[r1] = r3
            goto L211
        L17c:
            r2[r1] = r11
            goto L211
        L180:
            r2[r1] = r10
            goto L211
        L184:
            java.lang.String r3 = "getClassDescriptorForType"
            r2[r1] = r3
            goto L211
        L18a:
            java.lang.String r3 = "getSuperClassDescriptor"
            r2[r1] = r3
            goto L211
        L190:
            r2[r1] = r9
            goto L211
        L194:
            r2[r1] = r8
            goto L211
        L198:
            java.lang.String r3 = "hasAbstractMembers"
            r2[r1] = r3
            goto L211
        L19e:
            java.lang.String r3 = "isKindOf"
            r2[r1] = r3
            goto L211
        L1a4:
            java.lang.String r3 = "isEnumEntry"
            r2[r1] = r3
            goto L211
        L1aa:
            java.lang.String r3 = "isAnonymousFunction"
            r2[r1] = r3
            goto L211
        L1b0:
            java.lang.String r3 = "isAnonymousObject"
            r2[r1] = r3
            goto L211
        L1b6:
            java.lang.String r3 = "isSubtypeOfClass"
            r2[r1] = r3
            goto L211
        L1bb:
            java.lang.String r3 = "isSameClass"
            r2[r1] = r3
            goto L211
        L1c0:
            java.lang.String r3 = "isSubclass"
            r2[r1] = r3
            goto L211
        L1c5:
            java.lang.String r3 = "isDirectSubclass"
            r2[r1] = r3
            goto L211
        L1ca:
            java.lang.String r3 = "isAncestor"
            r2[r1] = r3
            goto L211
        L1cf:
            java.lang.String r3 = "getContainingClass"
            r2[r1] = r3
            goto L211
        L1d4:
            r2[r1] = r7
            goto L211
        L1d7:
            java.lang.String r3 = "getContainingModuleOrNull"
            r2[r1] = r3
            goto L211
        L1dc:
            java.lang.String r3 = "getParentOfType"
            r2[r1] = r3
            goto L211
        L1e1:
            java.lang.String r3 = "areInSameModule"
            r2[r1] = r3
            goto L211
        L1e6:
            java.lang.String r3 = "isStaticDeclaration"
            r2[r1] = r3
            goto L211
        L1eb:
            java.lang.String r3 = "isOverride"
            r2[r1] = r3
            goto L211
        L1f0:
            java.lang.String r3 = "isExtension"
            r2[r1] = r3
            goto L211
        L1f5:
            r2[r1] = r6
            goto L211
        L1f8:
            r2[r1] = r5
            goto L211
        L1fb:
            r2[r1] = r4
            goto L211
        L1fe:
            java.lang.String r3 = "getFqNameSafeIfPossible"
            r2[r1] = r3
            goto L211
        L203:
            java.lang.String r3 = "getFqNameSafe"
            r2[r1] = r3
            goto L211
        L208:
            java.lang.String r3 = "getFqName"
            r2[r1] = r3
            goto L211
        L20d:
            java.lang.String r3 = "isLocal"
            r2[r1] = r3
        L211:
            java.lang.String r0 = java.lang.String.format(r0, r2)
            switch(r23) {
                case 4: goto L21e;
                case 7: goto L21e;
                case 9: goto L21e;
                case 10: goto L21e;
                case 12: goto L21e;
                case 22: goto L21e;
                case 40: goto L21e;
                case 42: goto L21e;
                case 43: goto L21e;
                case 47: goto L21e;
                case 49: goto L21e;
                case 50: goto L21e;
                case 51: goto L21e;
                case 52: goto L21e;
                case 53: goto L21e;
                case 59: goto L21e;
                case 61: goto L21e;
                case 62: goto L21e;
                case 64: goto L21e;
                case 71: goto L21e;
                case 75: goto L21e;
                case 82: goto L21e;
                case 83: goto L21e;
                case 85: goto L21e;
                case 88: goto L21e;
                case 93: goto L21e;
                case 95: goto L21e;
                default: goto L218;
            }
        L218:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            goto L223
        L21e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
        L223:
            throw r1
    }

    public static boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
            if (r1 != 0) goto L7
            r0 = 16
            a(r0)
        L7:
            if (r2 != 0) goto Le
            r0 = 17
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r1 = g(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r2 = g(r2)
            boolean r1 = r1.equals(r2)
            return r1
    }

    private static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> void c(@org.jetbrains.annotations.NotNull D r1, @org.jetbrains.annotations.NotNull java.util.Set<D> r2) {
            if (r1 != 0) goto L7
            r0 = 72
            a(r0)
        L7:
            if (r2 != 0) goto Le
            r0 = 73
            a(r0)
        Le:
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L15
            goto L38
        L15:
            kotlin.reflect.jvm.internal.impl.descriptors.a r1 = r1.a()
            java.util.Collection r1 = r1.e()
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r0
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = r0.a()
            c(r0, r2)
            r2.add(r0)
            goto L21
        L38:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> java.util.Set<D> d(@org.jetbrains.annotations.NotNull D r1) {
            if (r1 != 0) goto L7
            r0 = 70
            a(r0)
        L7:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.a r1 = r1.a()
            c(r1, r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.descriptors.d e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 45
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = f(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.descriptors.d f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.w1 r1) {
            if (r1 != 0) goto L7
            r0 = 46
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.c()
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            if (r1 != 0) goto L14
            r0 = 47
            a(r0)
        L14:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.descriptors.f0 g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            if (r1 != 0) goto L7
            r0 = 21
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r1 = h(r1)
            if (r1 != 0) goto L12
            r0 = 22
            a(r0)
        L12:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.descriptors.f0 h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            if (r1 != 0) goto L7
            r0 = 23
            a(r0)
        L7:
            if (r1 == 0) goto L20
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f0
            if (r0 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.f0) r1
            return r1
        L10:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.s0
            if (r0 == 0) goto L1b
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.s0) r1
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r1 = r1.C0()
            return r1
        L1b:
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r1.b()
            goto L7
        L20:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.descriptors.f0 i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 20
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.c()
            if (r1 != 0) goto L13
            r1 = 0
            return r1
        L13:
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r1 = h(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.descriptors.f1 j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            if (r1 != 0) goto L7
            r0 = 81
            a(r0)
        L7:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y0
            if (r0 == 0) goto L11
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.y0) r1
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = r1.h0()
        L11:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.n
            if (r0 == 0) goto L27
            kotlin.reflect.jvm.internal.impl.descriptors.n r1 = (kotlin.reflect.jvm.internal.impl.descriptors.n) r1
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r1 = r1.getSource()
            kotlin.reflect.jvm.internal.impl.descriptors.f1 r1 = r1.b()
            if (r1 != 0) goto L26
            r0 = 82
            a(r0)
        L26:
            return r1
        L27:
            kotlin.reflect.jvm.internal.impl.descriptors.f1 r1 = kotlin.reflect.jvm.internal.impl.descriptors.f1.a
            if (r1 != 0) goto L30
            r0 = 83
            a(r0)
        L30:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.descriptors.s k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2, boolean r3) {
            if (r2 != 0) goto L7
            r0 = 48
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = r2.h()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS
            if (r0 == r1) goto L4c
            boolean r0 = r0.isSingleton()
            if (r0 == 0) goto L16
            goto L4c
        L16:
            boolean r0 = G(r2)
            if (r0 == 0) goto L32
            if (r3 == 0) goto L28
            kotlin.reflect.jvm.internal.impl.descriptors.s r2 = kotlin.reflect.jvm.internal.impl.descriptors.r.c
            if (r2 != 0) goto L27
            r3 = 50
            a(r3)
        L27:
            return r2
        L28:
            kotlin.reflect.jvm.internal.impl.descriptors.s r2 = kotlin.reflect.jvm.internal.impl.descriptors.r.a
            if (r2 != 0) goto L31
            r3 = 51
            a(r3)
        L31:
            return r2
        L32:
            boolean r2 = u(r2)
            if (r2 == 0) goto L42
            kotlin.reflect.jvm.internal.impl.descriptors.s r2 = kotlin.reflect.jvm.internal.impl.descriptors.r.l
            if (r2 != 0) goto L41
            r3 = 52
            a(r3)
        L41:
            return r2
        L42:
            kotlin.reflect.jvm.internal.impl.descriptors.s r2 = kotlin.reflect.jvm.internal.impl.descriptors.r.e
            if (r2 != 0) goto L4b
            r3 = 53
            a(r3)
        L4b:
            return r2
        L4c:
            kotlin.reflect.jvm.internal.impl.descriptors.s r2 = kotlin.reflect.jvm.internal.impl.descriptors.r.a
            if (r2 != 0) goto L55
            r3 = 49
            a(r3)
        L55:
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.descriptors.z0 l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            if (r1 != 0) goto L6
            r0 = 0
            a(r0)
        L6:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto L11
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r1 = r1.V()
            return r1
        L11:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.name.d m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            if (r1 != 0) goto L6
            r0 = 2
            a(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.name.c r0 = o(r1)
            if (r0 == 0) goto L11
            kotlin.reflect.jvm.internal.impl.name.d r1 = r0.i()
            return r1
        L11:
            kotlin.reflect.jvm.internal.impl.name.d r1 = p(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.name.c n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            if (r1 != 0) goto L6
            r0 = 3
            a(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.name.c r0 = o(r1)
            if (r0 == 0) goto Ld
            goto L15
        Ld:
            kotlin.reflect.jvm.internal.impl.name.d r1 = p(r1)
            kotlin.reflect.jvm.internal.impl.name.c r0 = r1.m()
        L15:
            if (r0 != 0) goto L1b
            r1 = 4
            a(r1)
        L1b:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    private static kotlin.reflect.jvm.internal.impl.name.c o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            if (r1 != 0) goto L6
            r0 = 5
            a(r0)
        L6:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f0
            if (r0 != 0) goto L29
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.error.i.m(r1)
            if (r0 == 0) goto L11
            goto L29
        L11:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.s0
            if (r0 == 0) goto L1c
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.s0) r1
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.d()
            return r1
        L1c:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
            if (r0 == 0) goto L27
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r1
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.d()
            return r1
        L27:
            r1 = 0
            return r1
        L29:
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.name.c.d
            return r1
    }

    @org.jetbrains.annotations.NotNull
    private static kotlin.reflect.jvm.internal.impl.name.d p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            if (r1 != 0) goto L6
            r0 = 6
            a(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r1.b()
            kotlin.reflect.jvm.internal.impl.name.d r0 = m(r0)
            kotlin.reflect.jvm.internal.impl.name.f r1 = r1.getName()
            kotlin.reflect.jvm.internal.impl.name.d r1 = r0.b(r1)
            if (r1 != 0) goto L1c
            r0 = 7
            a(r0)
        L1c:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.k> D q(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.k r1, @org.jetbrains.annotations.NotNull java.lang.Class<D> r2) {
            if (r2 != 0) goto L7
            r0 = 18
            a(r0)
        L7:
            r0 = 1
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r(r1, r2, r0)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.k> D r(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.k r1, @org.jetbrains.annotations.NotNull java.lang.Class<D> r2, boolean r3) {
            if (r2 != 0) goto L7
            r0 = 19
            a(r0)
        L7:
            r0 = 0
            if (r1 != 0) goto Lb
            return r0
        Lb:
            if (r3 == 0) goto L11
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r1.b()
        L11:
            if (r1 == 0) goto L1f
            boolean r3 = r2.isInstance(r1)
            if (r3 == 0) goto L1a
            return r1
        L1a:
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r1.b()
            goto L11
        L1f:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.descriptors.d s(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r3) {
            if (r3 != 0) goto L7
            r0 = 44
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.types.w1 r3 = r3.o()
            java.util.Collection r3 = r3.i()
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = e(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = r0.h()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE
            if (r1 == r2) goto L13
            return r0
        L2c:
            r3 = 0
            return r3
    }

    public static boolean t(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS
            boolean r1 = D(r1, r0)
            return r1
    }

    public static boolean u(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            if (r1 != 0) goto L7
            r0 = 34
            a(r0)
        L7:
            boolean r0 = v(r1)
            if (r0 == 0) goto L1b
            kotlin.reflect.jvm.internal.impl.name.f r1 = r1.getName()
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.h.b
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1b
            r1 = 1
            return r1
        L1b:
            r1 = 0
            return r1
    }

    public static boolean v(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS
            boolean r1 = D(r1, r0)
            return r1
    }

    public static boolean w(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            boolean r0 = v(r1)
            if (r0 != 0) goto Lf
            boolean r1 = A(r1)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public static boolean x(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.OBJECT
            boolean r0 = D(r1, r0)
            if (r0 == 0) goto L12
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            boolean r1 = r1.l0()
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static boolean y(kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.o
            if (r0 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.descriptors.o r1 = (kotlin.reflect.jvm.internal.impl.descriptors.o) r1
            kotlin.reflect.jvm.internal.impl.descriptors.s r1 = r1.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.f
            if (r1 != r0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static boolean z(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r3) {
            if (r2 != 0) goto L7
            r0 = 26
            a(r0)
        L7:
            if (r3 != 0) goto Le
            r0 = 27
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.o()
            java.util.Collection r2 = r2.i()
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r2.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r3.a()
            boolean r0 = F(r0, r1)
            if (r0 == 0) goto L1a
            r2 = 1
            return r2
        L32:
            r2 = 0
            return r2
    }
}
