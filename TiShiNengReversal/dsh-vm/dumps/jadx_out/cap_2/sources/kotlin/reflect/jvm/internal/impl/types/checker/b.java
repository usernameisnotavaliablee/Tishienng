package kotlin.reflect.jvm.internal.impl.types.checker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface b extends kotlin.reflect.jvm.internal.impl.types.i2, d4.t {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nClassicTypeSystemContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicTypeSystemContext.kt\norg/jetbrains/kotlin/types/checker/ClassicTypeSystemContext$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ClassicTypeSystemContext.kt\norg/jetbrains/kotlin/types/checker/ClassicTypeSystemContextKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n+ 6 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n*L\n1#1,970:1\n1#2:971\n964#3:972\n964#3:973\n964#3:974\n964#3:975\n964#3:976\n964#3:977\n964#3:978\n964#3:979\n964#3:980\n964#3:981\n964#3:982\n964#3:983\n964#3:984\n964#3:985\n964#3:986\n964#3:987\n964#3:988\n964#3:989\n964#3:990\n964#3:991\n964#3:992\n964#3:993\n964#3:994\n964#3:995\n964#3:996\n964#3:997\n964#3:998\n964#3:999\n964#3:1000\n964#3:1001\n964#3:1002\n964#3:1003\n964#3:1004\n964#3:1005\n964#3:1006\n964#3:1007\n964#3:1008\n964#3:1009\n964#3:1010\n964#3:1011\n964#3:1012\n964#3:1013\n964#3:1014\n964#3:1015\n964#3:1016\n964#3:1017\n964#3:1018\n964#3:1019\n964#3:1020\n964#3:1021\n964#3:1022\n964#3:1023\n964#3:1024\n964#3:1025\n964#3:1026\n964#3:1027\n964#3:1028\n964#3:1029\n964#3:1030\n964#3:1031\n964#3:1032\n964#3:1033\n964#3:1034\n964#3:1035\n964#3:1036\n964#3:1037\n964#3:1038\n964#3:1039\n964#3:1040\n964#3:1041\n964#3:1042\n964#3:1043\n964#3:1044\n964#3:1048\n964#3:1049\n964#3:1050\n964#3:1051\n964#3:1052\n964#3:1053\n964#3:1054\n964#3:1055\n964#3:1061\n964#3:1062\n964#3:1063\n964#3:1064\n964#3:1065\n964#3:1066\n964#3:1073\n964#3:1074\n964#3:1075\n964#3:1090\n964#3:1091\n964#3:1092\n964#3:1093\n964#3:1104\n964#3:1105\n964#3:1106\n964#3:1107\n964#3:1108\n964#3:1109\n964#3:1110\n964#3:1111\n964#3:1112\n964#3:1113\n964#3:1114\n964#3:1115\n964#3:1116\n964#3:1117\n964#3:1118\n964#3:1119\n964#3:1120\n964#3:1121\n964#3:1122\n964#3:1123\n964#3:1124\n964#3:1125\n964#3:1126\n964#3:1127\n964#3:1128\n964#3:1129\n827#4:1045\n855#4,2:1046\n774#4:1058\n865#4,2:1059\n1563#4:1069\n1634#4,3:1070\n1563#4:1076\n1634#4,3:1077\n2783#4,7:1080\n827#4:1087\n855#4,2:1088\n1563#4:1094\n1634#4,3:1095\n1285#4,2:1098\n1299#4,4:1100\n21#5,2:1056\n264#6,2:1067\n*S KotlinDebug\n*F\n+ 1 ClassicTypeSystemContext.kt\norg/jetbrains/kotlin/types/checker/ClassicTypeSystemContext$DefaultImpls\n*L\n41#1:972\n46#1:973\n59#1:974\n64#1:975\n70#1:976\n76#1:977\n81#1:978\n86#1:979\n91#1:980\n96#1:981\n101#1:982\n106#1:983\n111#1:984\n120#1:985\n126#1:986\n131#1:987\n136#1:988\n137#1:989\n142#1:990\n147#1:991\n152#1:992\n157#1:993\n166#1:994\n171#1:995\n176#1:996\n181#1:997\n193#1:998\n198#1:999\n203#1:1000\n208#1:1001\n213#1:1002\n218#1:1003\n223#1:1004\n228#1:1005\n233#1:1006\n234#1:1007\n240#1:1008\n246#1:1009\n251#1:1010\n256#1:1011\n261#1:1012\n266#1:1013\n271#1:1014\n276#1:1015\n281#1:1016\n286#1:1017\n291#1:1018\n292#1:1019\n298#1:1020\n299#1:1021\n304#1:1022\n309#1:1023\n314#1:1024\n320#1:1025\n328#1:1026\n334#1:1027\n339#1:1028\n344#1:1029\n349#1:1030\n354#1:1031\n359#1:1032\n364#1:1033\n378#1:1034\n388#1:1035\n393#1:1036\n419#1:1037\n424#1:1038\n429#1:1039\n430#1:1040\n471#1:1041\n477#1:1042\n482#1:1043\n487#1:1044\n493#1:1048\n498#1:1049\n515#1:1050\n521#1:1051\n526#1:1052\n531#1:1053\n542#1:1054\n553#1:1055\n576#1:1061\n581#1:1062\n586#1:1063\n593#1:1064\n598#1:1065\n604#1:1066\n609#1:1073\n636#1:1074\n637#1:1075\n693#1:1090\n698#1:1091\n703#1:1092\n708#1:1093\n746#1:1104\n751#1:1105\n756#1:1106\n761#1:1107\n766#1:1108\n771#1:1109\n776#1:1110\n781#1:1111\n786#1:1112\n791#1:1113\n796#1:1114\n801#1:1115\n806#1:1116\n811#1:1117\n816#1:1118\n821#1:1119\n826#1:1120\n831#1:1121\n836#1:1122\n845#1:1123\n846#1:1124\n857#1:1125\n862#1:1126\n867#1:1127\n898#1:1128\n905#1:1129\n488#1:1045\n488#1:1046,2\n561#1:1058\n561#1:1059,2\n605#1:1069\n605#1:1070,3\n679#1:1076\n679#1:1077,3\n679#1:1080,7\n685#1:1087\n685#1:1088,2\n734#1:1094\n734#1:1095,3\n735#1:1098,2\n735#1:1100,4\n555#1:1056,2\n605#1:1067,2\n*E\n"})
    public static final class a {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.b$a$a, reason: collision with other inner class name */
        public static final class C0074a extends kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.a {
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.checker.b a;
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.h2 b;

            C0074a(kotlin.reflect.jvm.internal.impl.types.checker.b r1, kotlin.reflect.jvm.internal.impl.types.h2 r2) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.<init>()
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b
            public /* bridge */ /* synthetic */ d4.h a(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r1, d4.g r2) {
                    r0 = this;
                    d4.i r1 = r0.b(r1, r2)
                    return r1
            }

            public d4.i b(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r3, d4.g r4) {
                    r2 = this;
                    java.lang.String r0 = "state"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    java.lang.String r3 = "type"
                    kotlin.jvm.internal.g0.p(r4, r3)
                    kotlin.reflect.jvm.internal.impl.types.checker.b r3 = r2.a
                    kotlin.reflect.jvm.internal.impl.types.h2 r0 = r2.b
                    d4.h r4 = r3.I(r4)
                    java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType"
                    kotlin.jvm.internal.g0.n(r4, r1)
                    kotlin.reflect.jvm.internal.impl.types.t0 r4 = (kotlin.reflect.jvm.internal.impl.types.t0) r4
                    kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
                    kotlin.reflect.jvm.internal.impl.types.t0 r4 = r0.n(r4, r1)
                    java.lang.String r0 = "safeSubstitute(...)"
                    kotlin.jvm.internal.g0.o(r4, r0)
                    d4.i r3 = r3.mo31a(r4)
                    kotlin.jvm.internal.g0.m(r3)
                    return r3
            }
        }

        public static boolean A(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r0, @org.jetbrains.annotations.NotNull d4.g r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.g0.p(r1, r0)
                java.lang.String r0 = "fqName"
                kotlin.jvm.internal.g0.p(r2, r0)
                boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.t0
                if (r0 == 0) goto L19
                kotlin.reflect.jvm.internal.impl.types.t0 r1 = (kotlin.reflect.jvm.internal.impl.types.t0) r1
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r1.getAnnotations()
                boolean r0 = r0.l(r2)
                return r0
            L19:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "ClassicTypeSystemContext couldn't handle: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", "
                r0.append(r2)
                java.lang.Class r1 = r1.getClass()
                kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
        }

        public static boolean B(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r2, @org.jetbrains.annotations.NotNull d4.p r3, @org.jetbrains.annotations.Nullable d4.o r4) {
                java.lang.String r2 = "$receiver"
                kotlin.jvm.internal.g0.p(r3, r2)
                boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
                java.lang.String r0 = ", "
                java.lang.String r1 = "ClassicTypeSystemContext couldn't handle: "
                if (r2 == 0) goto L47
                if (r4 != 0) goto L11
                r2 = 1
                goto L13
            L11:
                boolean r2 = r4 instanceof kotlin.reflect.jvm.internal.impl.types.w1
            L13:
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r3
                if (r2 == 0) goto L20
                kotlin.reflect.jvm.internal.impl.types.w1 r4 = (kotlin.reflect.jvm.internal.impl.types.w1) r4
                r2 = 4
                r0 = 0
                boolean r2 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.s(r3, r4, r0, r2, r0)
                return r2
            L20:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                r2.append(r3)
                r2.append(r0)
                java.lang.Class r3 = r3.getClass()
                kotlin.reflect.d r3 = kotlin.jvm.internal.o0.d(r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
            L47:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                r2.append(r3)
                r2.append(r0)
                java.lang.Class r3 = r3.getClass()
                kotlin.reflect.d r3 = kotlin.jvm.internal.o0.d(r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
        }

        public static boolean C(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r2, @org.jetbrains.annotations.NotNull d4.h r3, @org.jetbrains.annotations.NotNull d4.h r4) {
                java.lang.String r2 = "a"
                kotlin.jvm.internal.g0.p(r3, r2)
                java.lang.String r2 = "b"
                kotlin.jvm.internal.g0.p(r4, r2)
                boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.e1
                java.lang.String r0 = ", "
                java.lang.String r1 = "ClassicTypeSystemContext couldn't handle: "
                if (r2 == 0) goto L4f
                boolean r2 = r4 instanceof kotlin.reflect.jvm.internal.impl.types.e1
                if (r2 == 0) goto L28
                kotlin.reflect.jvm.internal.impl.types.e1 r3 = (kotlin.reflect.jvm.internal.impl.types.e1) r3
                java.util.List r2 = r3.G0()
                kotlin.reflect.jvm.internal.impl.types.e1 r4 = (kotlin.reflect.jvm.internal.impl.types.e1) r4
                java.util.List r3 = r4.G0()
                if (r2 != r3) goto L26
                r2 = 1
                return r2
            L26:
                r2 = 0
                return r2
            L28:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                r2.append(r4)
                r2.append(r0)
                java.lang.Class r3 = r4.getClass()
                kotlin.reflect.d r3 = kotlin.jvm.internal.o0.d(r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
            L4f:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                r2.append(r3)
                r2.append(r0)
                java.lang.Class r3 = r3.getClass()
                kotlin.reflect.d r3 = kotlin.jvm.internal.o0.d(r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
        }

        @org.jetbrains.annotations.NotNull
        public static d4.g D(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r0, @org.jetbrains.annotations.NotNull java.util.Collection<? extends d4.g> r1) {
                java.lang.String r0 = "types"
                kotlin.jvm.internal.g0.p(r1, r0)
                kotlin.reflect.jvm.internal.impl.types.m2 r0 = kotlin.reflect.jvm.internal.impl.types.checker.d.a(r1)
                return r0
        }

        public static boolean E(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.o r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.w1
                if (r1 == 0) goto L12
                kotlin.reflect.jvm.internal.impl.types.w1 r2 = (kotlin.reflect.jvm.internal.impl.types.w1) r2
                kotlin.reflect.jvm.internal.impl.name.d r1 = kotlin.reflect.jvm.internal.impl.builtins.o.a.b
                boolean r1 = kotlin.reflect.jvm.internal.impl.builtins.j.x0(r2, r1)
                return r1
            L12:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        public static boolean F(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.o r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.w1
                if (r1 == 0) goto L12
                kotlin.reflect.jvm.internal.impl.types.w1 r2 = (kotlin.reflect.jvm.internal.impl.types.w1) r2
                kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r2.c()
                boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
                return r1
            L12:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        public static boolean G(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r2, @org.jetbrains.annotations.NotNull d4.o r3) {
                java.lang.String r2 = "$receiver"
                kotlin.jvm.internal.g0.p(r3, r2)
                boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.w1
                if (r2 == 0) goto L34
                kotlin.reflect.jvm.internal.impl.types.w1 r3 = (kotlin.reflect.jvm.internal.impl.types.w1) r3
                kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r3.c()
                boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
                if (r3 == 0) goto L16
                kotlin.reflect.jvm.internal.impl.descriptors.d r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r2
                goto L17
            L16:
                r2 = 0
            L17:
                r3 = 0
                if (r2 != 0) goto L1b
                return r3
            L1b:
                boolean r0 = kotlin.reflect.jvm.internal.impl.descriptors.d0.a(r2)
                if (r0 == 0) goto L33
                kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = r2.h()
                kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY
                if (r0 == r1) goto L33
                kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = r2.h()
                kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS
                if (r2 == r0) goto L33
                r2 = 1
                return r2
            L33:
                return r3
            L34:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r2.append(r0)
                r2.append(r3)
                java.lang.String r0 = ", "
                r2.append(r0)
                java.lang.Class r3 = r3.getClass()
                kotlin.reflect.d r3 = kotlin.jvm.internal.o0.d(r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
        }

        public static boolean H(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.o r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.w1
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.w1 r2 = (kotlin.reflect.jvm.internal.impl.types.w1) r2
                boolean r1 = r2.d()
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        public static boolean I(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.g r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.t0
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
                boolean r1 = kotlin.reflect.jvm.internal.impl.types.x0.a(r2)
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        public static boolean J(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.o r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.w1
                if (r1 == 0) goto L21
                kotlin.reflect.jvm.internal.impl.types.w1 r2 = (kotlin.reflect.jvm.internal.impl.types.w1) r2
                kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r2.c()
                boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
                r0 = 0
                if (r2 == 0) goto L17
                kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
                goto L18
            L17:
                r1 = r0
            L18:
                if (r1 == 0) goto L1e
                kotlin.reflect.jvm.internal.impl.descriptors.o1 r0 = r1.g0()
            L1e:
                boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.z
                return r1
            L21:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        public static boolean K(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.o r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.w1
                if (r1 == 0) goto Lc
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.q
                return r1
            Lc:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        public static boolean L(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.o r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.w1
                if (r1 == 0) goto Lc
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.s0
                return r1
            Lc:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        public static boolean M(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r0) {
                r0 = 0
                return r0
        }

        public static boolean N(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r0, @org.jetbrains.annotations.NotNull d4.g r1) {
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.g0.p(r1, r0)
                boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.e1
                if (r0 == 0) goto L13
                kotlin.reflect.jvm.internal.impl.types.e1 r1 = (kotlin.reflect.jvm.internal.impl.types.e1) r1
                boolean r0 = r1.J0()
                if (r0 == 0) goto L13
                r0 = 1
                return r0
            L13:
                r0 = 0
                return r0
        }

        public static boolean O(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r0, @org.jetbrains.annotations.NotNull d4.g r1) {
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.g0.p(r1, r0)
                boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.b1
                return r0
        }

        public static boolean P(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.o r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.w1
                if (r1 == 0) goto L12
                kotlin.reflect.jvm.internal.impl.types.w1 r2 = (kotlin.reflect.jvm.internal.impl.types.w1) r2
                kotlin.reflect.jvm.internal.impl.name.d r1 = kotlin.reflect.jvm.internal.impl.builtins.o.a.c
                boolean r1 = kotlin.reflect.jvm.internal.impl.builtins.j.x0(r2, r1)
                return r1
            L12:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        public static boolean Q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.g r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.t0
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
                boolean r1 = kotlin.reflect.jvm.internal.impl.types.j2.l(r2)
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        public static boolean R(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r0, @org.jetbrains.annotations.NotNull d4.b r1) {
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.g0.p(r1, r0)
                boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a
                return r0
        }

        public static boolean S(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.i r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.t0
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
                boolean r1 = kotlin.reflect.jvm.internal.impl.builtins.j.t0(r2)
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        public static boolean T(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.b r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.checker.i
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.checker.i r2 = (kotlin.reflect.jvm.internal.impl.types.checker.i) r2
                boolean r1 = r2.U0()
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        public static boolean U(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.g r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.t0
                if (r1 == 0) goto Lc
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.d1
                return r1
            Lc:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        public static boolean V(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r2, @org.jetbrains.annotations.NotNull d4.h r3) {
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.g0.p(r3, r0)
                boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.e1
                if (r0 == 0) goto L4b
                r0 = r3
                kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
                boolean r0 = kotlin.reflect.jvm.internal.impl.types.x0.a(r0)
                if (r0 != 0) goto L49
                r0 = r3
                kotlin.reflect.jvm.internal.impl.types.e1 r0 = (kotlin.reflect.jvm.internal.impl.types.e1) r0
                kotlin.reflect.jvm.internal.impl.types.w1 r1 = r0.I0()
                kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.c()
                boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i1
                if (r1 != 0) goto L49
                kotlin.reflect.jvm.internal.impl.types.w1 r1 = r0.I0()
                kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.c()
                if (r1 != 0) goto L47
                boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a
                if (r1 != 0) goto L47
                boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.checker.i
                if (r1 != 0) goto L47
                boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.z
                if (r1 != 0) goto L47
                kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.I0()
                boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.q
                if (r0 != 0) goto L47
                d4.i r3 = (d4.i) r3
                boolean r2 = W(r2, r3)
                if (r2 == 0) goto L49
            L47:
                r2 = 1
                return r2
            L49:
                r2 = 0
                return r2
            L4b:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r2.append(r0)
                r2.append(r3)
                java.lang.String r0 = ", "
                r2.append(r0)
                java.lang.Class r3 = r3.getClass()
                kotlin.reflect.d r3 = kotlin.jvm.internal.o0.d(r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
        }

        private static boolean W(kotlin.reflect.jvm.internal.impl.types.checker.b r1, d4.i r2) {
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.h1
                if (r0 == 0) goto L12
                kotlin.reflect.jvm.internal.impl.types.h1 r2 = (kotlin.reflect.jvm.internal.impl.types.h1) r2
                kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.U0()
                boolean r1 = r1.h(r2)
                if (r1 == 0) goto L12
                r1 = 1
                return r1
            L12:
                r1 = 0
                return r1
        }

        public static boolean X(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.l r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.c2
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.c2 r2 = (kotlin.reflect.jvm.internal.impl.types.c2) r2
                boolean r1 = r2.b()
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        public static boolean Y(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.h r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.e1
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
                boolean r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.v(r2)
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        public static boolean Z(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.h r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.e1
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
                boolean r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.w(r2)
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        public static boolean a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r2, @org.jetbrains.annotations.NotNull d4.o r3, @org.jetbrains.annotations.NotNull d4.o r4) {
                java.lang.String r2 = "c1"
                kotlin.jvm.internal.g0.p(r3, r2)
                java.lang.String r2 = "c2"
                kotlin.jvm.internal.g0.p(r4, r2)
                boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.w1
                java.lang.String r0 = ", "
                java.lang.String r1 = "ClassicTypeSystemContext couldn't handle: "
                if (r2 == 0) goto L42
                boolean r2 = r4 instanceof kotlin.reflect.jvm.internal.impl.types.w1
                if (r2 == 0) goto L1b
                boolean r2 = kotlin.jvm.internal.g0.g(r3, r4)
                return r2
            L1b:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                r2.append(r4)
                r2.append(r0)
                java.lang.Class r3 = r4.getClass()
                kotlin.reflect.d r3 = kotlin.jvm.internal.o0.d(r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
            L42:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                r2.append(r3)
                r2.append(r0)
                java.lang.Class r3 = r3.getClass()
                kotlin.reflect.d r3 = kotlin.jvm.internal.o0.d(r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
        }

        public static boolean a0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r0, @org.jetbrains.annotations.NotNull d4.g r1) {
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.g0.p(r1, r0)
                boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.m2
                if (r0 == 0) goto L15
                kotlin.reflect.jvm.internal.impl.types.m2 r1 = (kotlin.reflect.jvm.internal.impl.types.m2) r1
                kotlin.reflect.jvm.internal.impl.types.w1 r0 = r1.I0()
                boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.checker.r
                if (r0 == 0) goto L15
                r0 = 1
                return r0
            L15:
                r0 = 0
                return r0
        }

        public static int b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.g r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.t0
                if (r1 == 0) goto L14
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
                java.util.List r1 = r2.G0()
                int r1 = r1.size()
                return r1
            L14:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        public static boolean b0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.o r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.w1
                if (r1 == 0) goto L1b
                kotlin.reflect.jvm.internal.impl.types.w1 r2 = (kotlin.reflect.jvm.internal.impl.types.w1) r2
                kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r2.c()
                r2 = 0
                if (r1 == 0) goto L1a
                boolean r1 = kotlin.reflect.jvm.internal.impl.builtins.j.C0(r1)
                r0 = 1
                if (r1 != r0) goto L1a
                return r0
            L1a:
                return r2
            L1b:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static d4.k c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.h r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.e1
                if (r1 == 0) goto Lc
                d4.k r2 = (d4.k) r2
                return r2
            Lc:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static d4.i c0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.e r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.k0
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.k0 r2 = (kotlin.reflect.jvm.internal.impl.types.k0) r2
                kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.Q0()
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.Nullable
        public static d4.b d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.i r2) {
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r0)
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.e1
                if (r0 == 0) goto L21
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.h1
                if (r0 == 0) goto L18
                kotlin.reflect.jvm.internal.impl.types.h1 r2 = (kotlin.reflect.jvm.internal.impl.types.h1) r2
                kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.U0()
                d4.b r1 = r1.b(r2)
                return r1
            L18:
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.checker.i
                if (r1 == 0) goto L1f
                kotlin.reflect.jvm.internal.impl.types.checker.i r2 = (kotlin.reflect.jvm.internal.impl.types.checker.i) r2
                return r2
            L1f:
                r1 = 0
                return r1
            L21:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.Nullable
        public static d4.g d0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.b r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.checker.i
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.checker.i r2 = (kotlin.reflect.jvm.internal.impl.types.checker.i) r2
                kotlin.reflect.jvm.internal.impl.types.m2 r1 = r2.T0()
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.Nullable
        public static d4.c e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.h r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.e1
                if (r1 == 0) goto L12
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.z
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.z r2 = (kotlin.reflect.jvm.internal.impl.types.z) r2
                return r2
            L10:
                r1 = 0
                return r1
            L12:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static d4.g e0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r0, @org.jetbrains.annotations.NotNull d4.g r1, boolean r2) {
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.g0.p(r1, r0)
                boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.m2
                if (r0 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.m2 r1 = (kotlin.reflect.jvm.internal.impl.types.m2) r1
                kotlin.reflect.jvm.internal.impl.types.m2 r0 = kotlin.reflect.jvm.internal.impl.types.checker.c.a(r1)
                return r0
            L10:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "ClassicTypeSystemContext couldn't handle: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", "
                r0.append(r2)
                java.lang.Class r1 = r1.getClass()
                kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
        }

        @org.jetbrains.annotations.Nullable
        public static d4.d f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.e r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.k0
                if (r1 == 0) goto L12
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.f0
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.f0 r2 = (kotlin.reflect.jvm.internal.impl.types.f0) r2
                return r2
            L10:
                r1 = 0
                return r1
            L12:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.reflect.jvm.internal.impl.types.TypeCheckerState f0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r7, boolean r8, boolean r9, boolean r10) {
                r5 = 24
                r6 = 0
                r3 = 0
                r4 = 0
                r2 = r7
                r0 = r8
                r1 = r9
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r7 = kotlin.reflect.jvm.internal.impl.types.checker.a.b(r0, r1, r2, r3, r4, r5, r6)
                return r7
        }

        @org.jetbrains.annotations.Nullable
        public static d4.e g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.g r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.t0
                if (r1 == 0) goto L18
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
                kotlin.reflect.jvm.internal.impl.types.m2 r1 = r2.L0()
                boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.k0
                if (r2 == 0) goto L16
                kotlin.reflect.jvm.internal.impl.types.k0 r1 = (kotlin.reflect.jvm.internal.impl.types.k0) r1
                return r1
            L16:
                r1 = 0
                return r1
            L18:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static d4.i g0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.c r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.z
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.z r2 = (kotlin.reflect.jvm.internal.impl.types.z) r2
                kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.U0()
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.Nullable
        public static d4.g getType(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.l r2) {
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r0)
                boolean r1 = r1.e(r2)
                if (r1 == 0) goto Ld
                r1 = 0
                return r1
            Ld:
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.c2
                if (r1 == 0) goto L1c
                kotlin.reflect.jvm.internal.impl.types.c2 r2 = (kotlin.reflect.jvm.internal.impl.types.c2) r2
                kotlin.reflect.jvm.internal.impl.types.t0 r1 = r2.getType()
                kotlin.reflect.jvm.internal.impl.types.m2 r1 = r1.L0()
                return r1
            L1c:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.Nullable
        public static d4.i h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.g r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.t0
                if (r1 == 0) goto L18
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
                kotlin.reflect.jvm.internal.impl.types.m2 r1 = r2.L0()
                boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.e1
                if (r2 == 0) goto L16
                kotlin.reflect.jvm.internal.impl.types.e1 r1 = (kotlin.reflect.jvm.internal.impl.types.e1) r1
                return r1
            L16:
                r1 = 0
                return r1
            L18:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        public static int h0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.o r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.w1
                if (r1 == 0) goto L14
                kotlin.reflect.jvm.internal.impl.types.w1 r2 = (kotlin.reflect.jvm.internal.impl.types.w1) r2
                java.util.List r1 = r2.getParameters()
                int r1 = r1.size()
                return r1
            L14:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static d4.l i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.g r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.t0
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
                kotlin.reflect.jvm.internal.impl.types.c2 r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.e(r2)
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static java.util.Collection<d4.g> i0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.h r2) {
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r0)
                d4.o r1 = r1.g(r2)
                boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.q
                if (r0 == 0) goto L14
                kotlin.reflect.jvm.internal.impl.resolve.constants.q r1 = (kotlin.reflect.jvm.internal.impl.resolve.constants.q) r1
                java.util.Set r1 = r1.j()
                return r1
            L14:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.Nullable
        public static kotlin.reflect.jvm.internal.impl.types.e1 j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r0, @org.jetbrains.annotations.NotNull d4.h r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r2) {
                java.lang.String r0 = "type"
                kotlin.jvm.internal.g0.p(r1, r0)
                java.lang.String r0 = "status"
                kotlin.jvm.internal.g0.p(r2, r0)
                boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.e1
                if (r0 == 0) goto L15
                kotlin.reflect.jvm.internal.impl.types.e1 r1 = (kotlin.reflect.jvm.internal.impl.types.e1) r1
                kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.types.checker.o.b(r1, r2)
                return r0
            L15:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "ClassicTypeSystemContext couldn't handle: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", "
                r0.append(r2)
                java.lang.Class r1 = r1.getClass()
                kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
        }

        @org.jetbrains.annotations.NotNull
        public static d4.l j0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.a r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.checker.n
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.checker.n r2 = (kotlin.reflect.jvm.internal.impl.types.checker.n) r2
                kotlin.reflect.jvm.internal.impl.types.c2 r1 = r2.getProjection()
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.b r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.checker.i
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.checker.i r2 = (kotlin.reflect.jvm.internal.impl.types.checker.i) r2
                kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r1 = r2.R0()
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b k0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.h r2) {
                java.lang.String r0 = "type"
                kotlin.jvm.internal.g0.p(r2, r0)
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.e1
                if (r0 == 0) goto L1b
                kotlin.reflect.jvm.internal.impl.types.x1$a r0 = kotlin.reflect.jvm.internal.impl.types.x1.c
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
                kotlin.reflect.jvm.internal.impl.types.f2 r2 = r0.a(r2)
                kotlin.reflect.jvm.internal.impl.types.h2 r2 = r2.c()
                kotlin.reflect.jvm.internal.impl.types.checker.b$a$a r0 = new kotlin.reflect.jvm.internal.impl.types.checker.b$a$a
                r0.<init>(r1, r2)
                return r0
            L1b:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static d4.g l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r3, @org.jetbrains.annotations.NotNull d4.h r4, @org.jetbrains.annotations.NotNull d4.h r5) {
                java.lang.String r0 = "lowerBound"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "upperBound"
                kotlin.jvm.internal.g0.p(r5, r0)
                boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.types.e1
                java.lang.String r1 = ", "
                java.lang.String r2 = "ClassicTypeSystemContext couldn't handle: "
                if (r0 == 0) goto L46
                boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.types.e1
                if (r0 == 0) goto L1f
                kotlin.reflect.jvm.internal.impl.types.e1 r4 = (kotlin.reflect.jvm.internal.impl.types.e1) r4
                kotlin.reflect.jvm.internal.impl.types.e1 r5 = (kotlin.reflect.jvm.internal.impl.types.e1) r5
                kotlin.reflect.jvm.internal.impl.types.m2 r3 = kotlin.reflect.jvm.internal.impl.types.w0.e(r4, r5)
                return r3
            L1f:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                r4.append(r3)
                r4.append(r1)
                java.lang.Class r3 = r3.getClass()
                kotlin.reflect.d r3 = kotlin.jvm.internal.o0.d(r3)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
            L46:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                r4.append(r3)
                r4.append(r1)
                java.lang.Class r3 = r3.getClass()
                kotlin.reflect.d r3 = kotlin.jvm.internal.o0.d(r3)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
        }

        @org.jetbrains.annotations.NotNull
        public static java.util.Collection<d4.g> l0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.o r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.w1
                if (r1 == 0) goto L15
                kotlin.reflect.jvm.internal.impl.types.w1 r2 = (kotlin.reflect.jvm.internal.impl.types.w1) r2
                java.util.Collection r1 = r2.i()
                java.lang.String r2 = "getSupertypes(...)"
                kotlin.jvm.internal.g0.o(r1, r2)
                return r1
            L15:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static d4.l m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r0, @org.jetbrains.annotations.NotNull d4.g r1, int r2) {
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.g0.p(r1, r0)
                boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.t0
                if (r0 == 0) goto L16
                kotlin.reflect.jvm.internal.impl.types.t0 r1 = (kotlin.reflect.jvm.internal.impl.types.t0) r1
                java.util.List r0 = r1.G0()
                java.lang.Object r0 = r0.get(r2)
                d4.l r0 = (d4.l) r0
                return r0
            L16:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "ClassicTypeSystemContext couldn't handle: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", "
                r0.append(r2)
                java.lang.Class r1 = r1.getClass()
                kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
        }

        @org.jetbrains.annotations.NotNull
        public static d4.a m0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.b r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.checker.i
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.checker.i r2 = (kotlin.reflect.jvm.internal.impl.types.checker.i) r2
                kotlin.reflect.jvm.internal.impl.types.checker.n r1 = r2.S0()
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static java.util.List<d4.l> n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.g r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.t0
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
                java.util.List r1 = r2.G0()
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static d4.o n0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.h r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.e1
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.e1 r2 = (kotlin.reflect.jvm.internal.impl.types.e1) r2
                kotlin.reflect.jvm.internal.impl.types.w1 r1 = r2.I0()
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.reflect.jvm.internal.impl.name.d o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.o r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.w1
                if (r1 == 0) goto L1b
                kotlin.reflect.jvm.internal.impl.types.w1 r2 = (kotlin.reflect.jvm.internal.impl.types.w1) r2
                kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r2.c()
                java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
                kotlin.jvm.internal.g0.n(r1, r2)
                kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
                kotlin.reflect.jvm.internal.impl.name.d r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.p(r1)
                return r1
            L1b:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static d4.i o0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.e r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.k0
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.k0 r2 = (kotlin.reflect.jvm.internal.impl.types.k0) r2
                kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.R0()
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static d4.p p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r0, @org.jetbrains.annotations.NotNull d4.o r1, int r2) {
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.g0.p(r1, r0)
                boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.w1
                if (r0 == 0) goto L1b
                kotlin.reflect.jvm.internal.impl.types.w1 r1 = (kotlin.reflect.jvm.internal.impl.types.w1) r1
                java.util.List r0 = r1.getParameters()
                java.lang.Object r0 = r0.get(r2)
                java.lang.String r1 = "get(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                d4.p r0 = (d4.p) r0
                return r0
            L1b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "ClassicTypeSystemContext couldn't handle: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", "
                r0.append(r2)
                java.lang.Class r1 = r1.getClass()
                kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
        }

        @org.jetbrains.annotations.NotNull
        public static d4.g p0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.g r2, boolean r3) {
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r0)
                boolean r0 = r2 instanceof d4.h
                if (r0 == 0) goto L10
                d4.h r2 = (d4.h) r2
                d4.i r1 = r1.mo32c(r2, r3)
                return r1
            L10:
                boolean r0 = r2 instanceof d4.e
                if (r0 == 0) goto L2b
                d4.e r2 = (d4.e) r2
                d4.i r0 = r1.mo34f(r2)
                d4.i r0 = r1.mo32c(r0, r3)
                d4.i r2 = r1.mo33d(r2)
                d4.i r2 = r1.mo32c(r2, r3)
                d4.g r1 = r1.L(r0, r2)
                return r1
            L2b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "sealed"
                r1.<init>(r2)
                throw r1
        }

        @org.jetbrains.annotations.NotNull
        public static java.util.List<d4.p> q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.o r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.w1
                if (r1 == 0) goto L15
                kotlin.reflect.jvm.internal.impl.types.w1 r2 = (kotlin.reflect.jvm.internal.impl.types.w1) r2
                java.util.List r1 = r2.getParameters()
                java.lang.String r2 = "getParameters(...)"
                kotlin.jvm.internal.g0.o(r1, r2)
                return r1
            L15:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static d4.i q0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r0, @org.jetbrains.annotations.NotNull d4.h r1, boolean r2) {
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.g0.p(r1, r0)
                boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.e1
                if (r0 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.e1 r1 = (kotlin.reflect.jvm.internal.impl.types.e1) r1
                kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.P0(r2)
                return r0
            L10:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "ClassicTypeSystemContext couldn't handle: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", "
                r0.append(r2)
                java.lang.Class r1 = r1.getClass()
                kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
        }

        @org.jetbrains.annotations.Nullable
        public static kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.o r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.w1
                if (r1 == 0) goto L1b
                kotlin.reflect.jvm.internal.impl.types.w1 r2 = (kotlin.reflect.jvm.internal.impl.types.w1) r2
                kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r2.c()
                java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
                kotlin.jvm.internal.g0.n(r1, r2)
                kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
                kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1 = kotlin.reflect.jvm.internal.impl.builtins.j.Q(r1)
                return r1
            L1b:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.Nullable
        public static kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType s(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.o r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.w1
                if (r1 == 0) goto L1b
                kotlin.reflect.jvm.internal.impl.types.w1 r2 = (kotlin.reflect.jvm.internal.impl.types.w1) r2
                kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r2.c()
                java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
                kotlin.jvm.internal.g0.n(r1, r2)
                kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
                kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1 = kotlin.reflect.jvm.internal.impl.builtins.j.T(r1)
                return r1
            L1b:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static d4.g t(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.p r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r2
                kotlin.reflect.jvm.internal.impl.types.t0 r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.p(r2)
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.Nullable
        public static d4.p u(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.w r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.checker.r
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.checker.r r2 = (kotlin.reflect.jvm.internal.impl.types.checker.r) r2
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r1 = r2.b()
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.Nullable
        public static d4.p v(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.o r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.w1
                if (r1 == 0) goto L18
                kotlin.reflect.jvm.internal.impl.types.w1 r2 = (kotlin.reflect.jvm.internal.impl.types.w1) r2
                kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r2.c()
                boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
                if (r2 == 0) goto L16
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r1
                return r1
            L16:
                r1 = 0
                return r1
            L18:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.Nullable
        public static d4.g w(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.g r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.t0
                if (r1 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
                kotlin.reflect.jvm.internal.impl.types.t0 r1 = kotlin.reflect.jvm.internal.impl.resolve.j.k(r2)
                return r1
            L10:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static java.util.List<d4.g> x(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.p r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
                if (r1 == 0) goto L15
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r2
                java.util.List r1 = r2.getUpperBounds()
                java.lang.String r2 = "getUpperBounds(...)"
                kotlin.jvm.internal.g0.o(r1, r2)
                return r1
            L15:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.reflect.jvm.internal.impl.types.model.TypeVariance y(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.l r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.c2
                if (r1 == 0) goto L19
                kotlin.reflect.jvm.internal.impl.types.c2 r2 = (kotlin.reflect.jvm.internal.impl.types.c2) r2
                kotlin.reflect.jvm.internal.impl.types.Variance r1 = r2.c()
                java.lang.String r2 = "getProjectionKind(...)"
                kotlin.jvm.internal.g0.o(r1, r2)
                kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r1 = d4.s.a(r1)
                return r1
            L19:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.reflect.jvm.internal.impl.types.model.TypeVariance z(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r1, @org.jetbrains.annotations.NotNull d4.p r2) {
                java.lang.String r1 = "$receiver"
                kotlin.jvm.internal.g0.p(r2, r1)
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
                if (r1 == 0) goto L19
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r2
                kotlin.reflect.jvm.internal.impl.types.Variance r1 = r2.l()
                java.lang.String r2 = "getVariance(...)"
                kotlin.jvm.internal.g0.o(r1, r2)
                kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r1 = d4.s.a(r1)
                return r1
            L19:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = ", "
                r1.append(r0)
                java.lang.Class r2 = r2.getClass()
                kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }
    }

    @org.jetbrains.annotations.NotNull
    d4.g L(@org.jetbrains.annotations.NotNull d4.h r1, @org.jetbrains.annotations.NotNull d4.h r2);

    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    d4.i mo31a(@org.jetbrains.annotations.NotNull d4.g r1);

    @org.jetbrains.annotations.Nullable
    d4.b b(@org.jetbrains.annotations.NotNull d4.i r1);

    @org.jetbrains.annotations.NotNull
    /* renamed from: c */
    d4.i mo32c(@org.jetbrains.annotations.NotNull d4.h r1, boolean r2);

    @org.jetbrains.annotations.NotNull
    /* renamed from: d */
    d4.i mo33d(@org.jetbrains.annotations.NotNull d4.e r1);

    boolean e(@org.jetbrains.annotations.NotNull d4.l r1);

    @org.jetbrains.annotations.NotNull
    /* renamed from: f */
    d4.i mo34f(@org.jetbrains.annotations.NotNull d4.e r1);

    @org.jetbrains.annotations.NotNull
    d4.o g(@org.jetbrains.annotations.NotNull d4.h r1);

    boolean h(@org.jetbrains.annotations.NotNull d4.h r1);
}
