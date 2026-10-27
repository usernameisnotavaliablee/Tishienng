package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSpecialGenericSignatures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialGenericSignatures.kt\norg/jetbrains/kotlin/load/java/SpecialGenericSignatures\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponentsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,194:1\n1563#2:195\n1634#2,3:196\n1563#2:199\n1634#2,3:200\n1563#2:203\n1634#2,3:204\n1252#2,4:210\n1563#2:214\n1634#2,3:215\n1563#2:218\n1634#2,3:219\n1252#2,4:225\n1634#2,3:232\n1563#2:235\n1634#2,3:236\n1222#2,2:239\n1252#2,4:241\n13#3:207\n13#3:222\n478#4:208\n424#4:209\n478#4:223\n424#4:224\n153#5,3:229\n*S KotlinDebug\n*F\n+ 1 SpecialGenericSignatures.kt\norg/jetbrains/kotlin/load/java/SpecialGenericSignatures\n*L\n57#1:195\n57#1:196,3\n59#1:199\n59#1:200,3\n60#1:203\n60#1:204,3\n98#1:210,4\n104#1:214\n104#1:215,3\n105#1:218\n105#1:219,3\n168#1:225,4\n176#1:232,3\n180#1:235\n180#1:236,3\n181#1:239,2\n181#1:241,4\n63#1:207\n114#1:222\n98#1:208\n98#1:209\n168#1:223\n168#1:224\n172#1:229,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class SpecialGenericSignatures {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a a = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a> b = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<java.lang.String> c = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<java.lang.String> d = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a, kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription> e = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription> f = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> g = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Set<java.lang.String> h = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a i = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a, kotlin.reflect.jvm.internal.impl.name.f> j = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.name.f> k = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Set<java.lang.String> l = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> m = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.name.f> n = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum SpecialSignatureInfo extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo[] $VALUES = null;
        public static final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo OBJECT_PARAMETER_GENERIC = null;
        public static final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo OBJECT_PARAMETER_NON_GENERIC = null;
        public static final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo ONE_COLLECTION_PARAMETER = null;
        private final boolean isObjectReplacedWithTypeParameter;

        @org.jetbrains.annotations.Nullable
        private final java.lang.String valueParametersSignature;

        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo[] $values() {
                r0 = 3
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo[] r0 = new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo[r0]
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo r1 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.ONE_COLLECTION_PARAMETER
                r2 = 0
                r0[r2] = r1
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo r1 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC
                r2 = 1
                r0[r2] = r1
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo r1 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo r0 = new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo
                r1 = 0
                java.lang.String r2 = "Ljava/util/Collection<+Ljava/lang/Object;>;"
                java.lang.String r3 = "ONE_COLLECTION_PARAMETER"
                r0.<init>(r3, r1, r2, r1)
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.ONE_COLLECTION_PARAMETER = r0
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo r0 = new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo
                r1 = 0
                java.lang.String r2 = "OBJECT_PARAMETER_NON_GENERIC"
                r3 = 1
                r0.<init>(r2, r3, r1, r3)
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC = r0
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo r0 = new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo
                r1 = 2
                java.lang.String r2 = "Ljava/lang/Object;"
                java.lang.String r4 = "OBJECT_PARAMETER_GENERIC"
                r0.<init>(r4, r1, r2, r3)
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC = r0
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo[] r0 = $values()
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.$ENTRIES = r0
                return
        }

        SpecialSignatureInfo(java.lang.String r1, int r2, java.lang.String r3, boolean r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.valueParametersSignature = r3
                r0.isObjectReplacedWithTypeParameter = r4
                return
        }

        public static kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo> r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo r1 = (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo) r1
                return r1
        }

        public static kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo[] values() {
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo[] r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo[] r0 = (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum TypeSafeBarrierDescription extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription[] $VALUES = null;
        public static final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription FALSE = null;
        public static final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription INDEX = null;
        public static final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription MAP_GET_OR_DEFAULT = null;
        public static final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription NULL = null;

        @org.jetbrains.annotations.Nullable
        private final java.lang.Object defaultValue;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class a extends kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription {
            a(java.lang.String r2, int r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0, r0)
                    return
            }
        }

        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription[] $values() {
                r0 = 4
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription[] r0 = new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription[r0]
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription r1 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.NULL
                r2 = 0
                r0[r2] = r1
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription r1 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.INDEX
                r2 = 1
                r0[r2] = r1
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription r1 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.FALSE
                r2 = 2
                r0[r2] = r1
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription r1 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT
                r2 = 3
                r0[r2] = r1
                return r0
        }

        static {
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription r0 = new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription
                r1 = 0
                r2 = 0
                java.lang.String r3 = "NULL"
                r0.<init>(r3, r1, r2)
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.NULL = r0
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription r0 = new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription
                r1 = -1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = "INDEX"
                r3 = 1
                r0.<init>(r2, r3, r1)
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.INDEX = r0
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription r0 = new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription
                r1 = 2
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                java.lang.String r3 = "FALSE"
                r0.<init>(r3, r1, r2)
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.FALSE = r0
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription$a
                java.lang.String r1 = "MAP_GET_OR_DEFAULT"
                r2 = 3
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT = r0
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription[] r0 = $values()
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.$ENTRIES = r0
                return
        }

        TypeSafeBarrierDescription(java.lang.String r1, int r2, java.lang.Object r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.defaultValue = r3
                return
        }

        /* synthetic */ TypeSafeBarrierDescription(java.lang.String r1, int r2, java.lang.Object r3, kotlin.jvm.internal.v r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public static kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription> r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription r1 = (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription) r1
                return r1
        }

        public static kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription[] values() {
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription[] r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription[] r0 = (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a, reason: collision with other inner class name */
        public static final class C0039a {

            @org.jetbrains.annotations.NotNull
            private final java.lang.String a;

            @org.jetbrains.annotations.NotNull
            private final kotlin.reflect.jvm.internal.impl.name.f b;

            @org.jetbrains.annotations.NotNull
            private final java.lang.String c;

            @org.jetbrains.annotations.NotNull
            private final java.lang.String d;

            @org.jetbrains.annotations.NotNull
            private final java.lang.String e;

            public C0039a(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6) {
                    r2 = this;
                    java.lang.String r0 = "classInternalName"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    java.lang.String r0 = "name"
                    kotlin.jvm.internal.g0.p(r4, r0)
                    java.lang.String r0 = "parameters"
                    kotlin.jvm.internal.g0.p(r5, r0)
                    java.lang.String r0 = "returnType"
                    kotlin.jvm.internal.g0.p(r6, r0)
                    r2.<init>()
                    r2.a = r3
                    r2.b = r4
                    r2.c = r5
                    r2.d = r6
                    kotlin.reflect.jvm.internal.impl.load.kotlin.f0 r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.f0.a
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r4)
                    r4 = 40
                    r1.append(r4)
                    r1.append(r5)
                    r4 = 41
                    r1.append(r4)
                    r1.append(r6)
                    java.lang.String r4 = r1.toString()
                    java.lang.String r3 = r0.m(r3, r4)
                    r2.e = r3
                    return
            }

            public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a b(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a r0, java.lang.String r1, kotlin.reflect.jvm.internal.impl.name.f r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.Object r6) {
                    r6 = r5 & 1
                    if (r6 == 0) goto L6
                    java.lang.String r1 = r0.a
                L6:
                    r6 = r5 & 2
                    if (r6 == 0) goto Lc
                    kotlin.reflect.jvm.internal.impl.name.f r2 = r0.b
                Lc:
                    r6 = r5 & 4
                    if (r6 == 0) goto L12
                    java.lang.String r3 = r0.c
                L12:
                    r5 = r5 & 8
                    if (r5 == 0) goto L18
                    java.lang.String r4 = r0.d
                L18:
                    kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r0 = r0.a(r1, r2, r3, r4)
                    return r0
            }

            @org.jetbrains.annotations.NotNull
            public final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a a(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5) {
                    r1 = this;
                    java.lang.String r0 = "classInternalName"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    java.lang.String r0 = "name"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    java.lang.String r0 = "parameters"
                    kotlin.jvm.internal.g0.p(r4, r0)
                    java.lang.String r0 = "returnType"
                    kotlin.jvm.internal.g0.p(r5, r0)
                    kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a
                    r0.<init>(r2, r3, r4, r5)
                    return r0
            }

            @org.jetbrains.annotations.NotNull
            public final kotlin.reflect.jvm.internal.impl.name.f c() {
                    r1 = this;
                    kotlin.reflect.jvm.internal.impl.name.f r0 = r1.b
                    return r0
            }

            @org.jetbrains.annotations.NotNull
            public final java.lang.String d() {
                    r1 = this;
                    java.lang.String r0 = r1.e
                    return r0
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r5 = (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a) r5
                    java.lang.String r1 = r4.a
                    java.lang.String r3 = r5.a
                    boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                    if (r1 != 0) goto L17
                    return r2
                L17:
                    kotlin.reflect.jvm.internal.impl.name.f r1 = r4.b
                    kotlin.reflect.jvm.internal.impl.name.f r3 = r5.b
                    boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                    if (r1 != 0) goto L22
                    return r2
                L22:
                    java.lang.String r1 = r4.c
                    java.lang.String r3 = r5.c
                    boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                    if (r1 != 0) goto L2d
                    return r2
                L2d:
                    java.lang.String r1 = r4.d
                    java.lang.String r5 = r5.d
                    boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
                    if (r5 != 0) goto L38
                    return r2
                L38:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.String r0 = r2.a
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    kotlin.reflect.jvm.internal.impl.name.f r1 = r2.b
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.lang.String r1 = r2.c
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.lang.String r1 = r2.d
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "NameAndSignature(classInternalName="
                    r0.append(r1)
                    java.lang.String r1 = r2.a
                    r0.append(r1)
                    java.lang.String r1 = ", name="
                    r0.append(r1)
                    kotlin.reflect.jvm.internal.impl.name.f r1 = r2.b
                    r0.append(r1)
                    java.lang.String r1 = ", parameters="
                    r0.append(r1)
                    java.lang.String r1 = r2.c
                    r0.append(r1)
                    java.lang.String r1 = ", returnType="
                    r0.append(r1)
                    java.lang.String r1 = r2.d
                    r0.append(r1)
                    r1 = 41
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a a(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r0 = r0.m(r1, r2, r3, r4)
                return r0
        }

        private final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a m(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a
                kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.name.f.h(r4)
                java.lang.String r1 = "identifier(...)"
                kotlin.jvm.internal.g0.o(r4, r1)
                r0.<init>(r3, r4, r5, r6)
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final kotlin.reflect.jvm.internal.impl.name.f b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.Map r0 = r1.f()
                java.lang.Object r2 = r0.get(r2)
                kotlin.reflect.jvm.internal.impl.name.f r2 = (kotlin.reflect.jvm.internal.impl.name.f) r2
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> c() {
                r1 = this;
                java.util.List r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
                r1 = this;
                java.util.Set r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.b()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Set<java.lang.String> e() {
                r1 = this;
                java.util.Set r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.c()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.name.f> f() {
                r1 = this;
                java.util.Map r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.d()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> g() {
                r1 = this;
                java.util.Set r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.e()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a h() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.f()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription> i() {
                r1 = this;
                java.util.Map r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.g()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.name.f> j() {
                r1 = this;
                java.util.Map r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.h()
                return r0
        }

        public final boolean k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.Set r0 = r1.g()
                boolean r2 = r0.contains(r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo l(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "builtinSignature"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.List r0 = r1.c()
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto L12
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo r2 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.ONE_COLLECTION_PARAMETER
                return r2
            L12:
                java.util.Map r0 = r1.i()
                java.lang.Object r2 = kotlin.collections.i1.K(r0, r2)
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription r2 = (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription) r2
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.NULL
                if (r2 != r0) goto L23
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo r2 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC
                return r2
            L23:
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo r2 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC
                return r2
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a = r0
            java.lang.String r0 = "removeAll"
            java.lang.String r1 = "retainAll"
            java.lang.String r2 = "containsAll"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.Set r0 = kotlin.collections.u1.u(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r3 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L25:
            boolean r3 = r0.hasNext()
            java.lang.String r4 = "getDesc(...)"
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a r5 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r6 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN
            java.lang.String r6 = r6.getDesc()
            kotlin.jvm.internal.g0.o(r6, r4)
            java.lang.String r4 = "java/util/Collection"
            java.lang.String r7 = "Ljava/util/Collection;"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r3 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r5, r4, r3, r7, r6)
            r1.add(r3)
            goto L25
        L4a:
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.b = r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = kotlin.collections.f0.d0(r1, r2)
            r0.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L5b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6f
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r3 = (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a) r3
            java.lang.String r3 = r3.d()
            r0.add(r3)
            goto L5b
        L6f:
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.c = r0
            java.util.List<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a> r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L82:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L9a
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r3 = (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a) r3
            kotlin.reflect.jvm.internal.impl.name.f r3 = r3.c()
            java.lang.String r3 = r3.b()
            r1.add(r3)
            goto L82
        L9a:
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.d = r1
            kotlin.reflect.jvm.internal.impl.load.kotlin.f0 r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.f0.a
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a r1 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a
            java.lang.String r3 = "Collection"
            java.lang.String r5 = r0.i(r3)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r6 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN
            java.lang.String r7 = r6.getDesc()
            kotlin.jvm.internal.g0.o(r7, r4)
            java.lang.String r8 = "contains"
            java.lang.String r9 = "Ljava/lang/Object;"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r5 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r1, r5, r8, r9, r7)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription r7 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.FALSE
            kotlin.Pair r5 = kotlin.o0.a(r5, r7)
            java.lang.String r3 = r0.i(r3)
            java.lang.String r8 = r6.getDesc()
            kotlin.jvm.internal.g0.o(r8, r4)
            java.lang.String r10 = "remove"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r3 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r1, r3, r10, r9, r8)
            kotlin.Pair r3 = kotlin.o0.a(r3, r7)
            java.lang.String r8 = "Map"
            java.lang.String r11 = r0.i(r8)
            java.lang.String r12 = r6.getDesc()
            kotlin.jvm.internal.g0.o(r12, r4)
            java.lang.String r13 = "containsKey"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r11 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r1, r11, r13, r9, r12)
            kotlin.Pair r11 = kotlin.o0.a(r11, r7)
            java.lang.String r12 = r0.i(r8)
            java.lang.String r13 = r6.getDesc()
            kotlin.jvm.internal.g0.o(r13, r4)
            java.lang.String r14 = "containsValue"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r12 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r1, r12, r14, r9, r13)
            kotlin.Pair r12 = kotlin.o0.a(r12, r7)
            java.lang.String r13 = r0.i(r8)
            java.lang.String r6 = r6.getDesc()
            kotlin.jvm.internal.g0.o(r6, r4)
            java.lang.String r14 = "Ljava/lang/Object;Ljava/lang/Object;"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r6 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r1, r13, r10, r14, r6)
            kotlin.Pair r6 = kotlin.o0.a(r6, r7)
            java.lang.String r7 = r0.i(r8)
            java.lang.String r13 = "getOrDefault"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r7 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r1, r7, r13, r14, r9)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription r13 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT
            kotlin.Pair r7 = kotlin.o0.a(r7, r13)
            java.lang.String r13 = r0.i(r8)
            java.lang.String r14 = "get"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r13 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r1, r13, r14, r9, r9)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription r15 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.NULL
            kotlin.Pair r13 = kotlin.o0.a(r13, r15)
            java.lang.String r8 = r0.i(r8)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r8 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r1, r8, r10, r9, r9)
            kotlin.Pair r8 = kotlin.o0.a(r8, r15)
            java.lang.String r15 = "List"
            java.lang.String r2 = r0.i(r15)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r17 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT
            r18 = r3
            java.lang.String r3 = r17.getDesc()
            kotlin.jvm.internal.g0.o(r3, r4)
            r19 = r5
            java.lang.String r5 = "indexOf"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r2 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r1, r2, r5, r9, r3)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription r3 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.INDEX
            kotlin.Pair r2 = kotlin.o0.a(r2, r3)
            java.lang.String r0 = r0.i(r15)
            java.lang.String r5 = r17.getDesc()
            kotlin.jvm.internal.g0.o(r5, r4)
            java.lang.String r15 = "lastIndexOf"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r1, r0, r15, r9, r5)
            kotlin.Pair r0 = kotlin.o0.a(r0, r3)
            r1 = 10
            kotlin.Pair[] r3 = new kotlin.Pair[r1]
            r1 = 0
            r3[r1] = r19
            r5 = 1
            r3[r5] = r18
            r15 = 2
            r3[r15] = r11
            r11 = 3
            r3[r11] = r12
            r12 = 4
            r3[r12] = r6
            r6 = 5
            r3[r6] = r7
            r7 = 6
            r3[r7] = r13
            r13 = 7
            r3[r13] = r8
            r8 = 8
            r3[r8] = r2
            r2 = 9
            r3[r2] = r0
            java.util.Map r0 = kotlin.collections.i1.W(r3)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.e = r0
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r3 = r0.size()
            int r3 = kotlin.collections.i1.j(r3)
            r2.<init>(r3)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1b2:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1d0
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r8 = r3.getKey()
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r8 = (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a) r8
            java.lang.String r8 = r8.d()
            java.lang.Object r3 = r3.getValue()
            r2.put(r8, r3)
            goto L1b2
        L1d0:
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.f = r2
            java.util.Map<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a, kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription> r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.e
            java.util.Set r0 = r0.keySet()
            java.util.List<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a> r2 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.b
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Set r0 = kotlin.collections.u1.C(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r8 = kotlin.collections.f0.d0(r0, r3)
            r2.<init>(r8)
            java.util.Iterator r3 = r0.iterator()
        L1ef:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L203
            java.lang.Object r8 = r3.next()
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r8 = (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a) r8
            kotlin.reflect.jvm.internal.impl.name.f r8 = r8.c()
            r2.add(r8)
            goto L1ef
        L203:
            java.util.Set r2 = kotlin.collections.f0.f6(r2)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.g = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r8 = kotlin.collections.f0.d0(r0, r3)
            r2.<init>(r8)
            java.util.Iterator r0 = r0.iterator()
        L218:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L22c
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r3 = (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a) r3
            java.lang.String r3 = r3.d()
            r2.add(r3)
            goto L218
        L22c:
            java.util.Set r0 = kotlin.collections.f0.f6(r2)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.h = r0
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT
            java.lang.String r3 = r2.getDesc()
            kotlin.jvm.internal.g0.o(r3, r4)
            java.lang.String r8 = "java/util/List"
            java.lang.String r13 = "removeAt"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r3 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r8, r13, r3, r9)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.i = r3
            kotlin.reflect.jvm.internal.impl.load.kotlin.f0 r8 = kotlin.reflect.jvm.internal.impl.load.kotlin.f0.a
            java.lang.String r13 = "Number"
            r17 = 0
            java.lang.String r1 = r8.h(r13)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r18 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BYTE
            r19 = 1
            java.lang.String r5 = r18.getDesc()
            kotlin.jvm.internal.g0.o(r5, r4)
            r18 = 5
            java.lang.String r6 = "toByte"
            r20 = 6
            java.lang.String r7 = ""
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r1 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r1, r6, r7, r5)
            java.lang.String r5 = "byteValue"
            kotlin.reflect.jvm.internal.impl.name.f r5 = kotlin.reflect.jvm.internal.impl.name.f.h(r5)
            kotlin.Pair r1 = kotlin.o0.a(r1, r5)
            java.lang.String r5 = r8.h(r13)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r6 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.SHORT
            java.lang.String r6 = r6.getDesc()
            kotlin.jvm.internal.g0.o(r6, r4)
            r21 = 3
            java.lang.String r11 = "toShort"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r5 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r5, r11, r7, r6)
            java.lang.String r6 = "shortValue"
            kotlin.reflect.jvm.internal.impl.name.f r6 = kotlin.reflect.jvm.internal.impl.name.f.h(r6)
            kotlin.Pair r5 = kotlin.o0.a(r5, r6)
            java.lang.String r6 = r8.h(r13)
            java.lang.String r11 = r2.getDesc()
            kotlin.jvm.internal.g0.o(r11, r4)
            r22 = 4
            java.lang.String r12 = "toInt"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r6 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r6, r12, r7, r11)
            java.lang.String r11 = "intValue"
            kotlin.reflect.jvm.internal.impl.name.f r11 = kotlin.reflect.jvm.internal.impl.name.f.h(r11)
            kotlin.Pair r6 = kotlin.o0.a(r6, r11)
            java.lang.String r11 = r8.h(r13)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r12 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.LONG
            java.lang.String r12 = r12.getDesc()
            kotlin.jvm.internal.g0.o(r12, r4)
            r23 = 2
            java.lang.String r15 = "toLong"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r11 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r11, r15, r7, r12)
            java.lang.String r12 = "longValue"
            kotlin.reflect.jvm.internal.impl.name.f r12 = kotlin.reflect.jvm.internal.impl.name.f.h(r12)
            kotlin.Pair r11 = kotlin.o0.a(r11, r12)
            java.lang.String r12 = r8.h(r13)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r15 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.FLOAT
            java.lang.String r15 = r15.getDesc()
            kotlin.jvm.internal.g0.o(r15, r4)
            r24 = r1
            java.lang.String r1 = "toFloat"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r1 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r12, r1, r7, r15)
            java.lang.String r12 = "floatValue"
            kotlin.reflect.jvm.internal.impl.name.f r12 = kotlin.reflect.jvm.internal.impl.name.f.h(r12)
            kotlin.Pair r1 = kotlin.o0.a(r1, r12)
            java.lang.String r12 = r8.h(r13)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r13 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.DOUBLE
            java.lang.String r13 = r13.getDesc()
            kotlin.jvm.internal.g0.o(r13, r4)
            java.lang.String r15 = "toDouble"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r12 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r12, r15, r7, r13)
            java.lang.String r13 = "doubleValue"
            kotlin.reflect.jvm.internal.impl.name.f r13 = kotlin.reflect.jvm.internal.impl.name.f.h(r13)
            kotlin.Pair r12 = kotlin.o0.a(r12, r13)
            kotlin.reflect.jvm.internal.impl.name.f r10 = kotlin.reflect.jvm.internal.impl.name.f.h(r10)
            kotlin.Pair r3 = kotlin.o0.a(r3, r10)
            java.lang.String r10 = "CharSequence"
            java.lang.String r10 = r8.h(r10)
            java.lang.String r2 = r2.getDesc()
            kotlin.jvm.internal.g0.o(r2, r4)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r13 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.CHAR
            java.lang.String r13 = r13.getDesc()
            kotlin.jvm.internal.g0.o(r13, r4)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r2 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r10, r14, r2, r13)
            java.lang.String r4 = "charAt"
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.name.f.h(r4)
            kotlin.Pair r2 = kotlin.o0.a(r2, r4)
            java.lang.String r4 = "AtomicInteger"
            java.lang.String r10 = r8.j(r4)
            java.lang.String r13 = "load"
            java.lang.String r15 = "I"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r10 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r10, r13, r7, r15)
            r25 = r1
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.name.f.h(r14)
            kotlin.Pair r1 = kotlin.o0.a(r10, r1)
            java.lang.String r10 = r8.j(r4)
            r26 = r1
            java.lang.String r1 = "store"
            r27 = r2
            java.lang.String r2 = "V"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r10 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r10, r1, r15, r2)
            java.lang.String r28 = "set"
            r29 = r3
            kotlin.reflect.jvm.internal.impl.name.f r3 = kotlin.reflect.jvm.internal.impl.name.f.h(r28)
            kotlin.Pair r3 = kotlin.o0.a(r10, r3)
            java.lang.String r10 = r8.j(r4)
            r30 = r3
            java.lang.String r3 = "exchange"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r10 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r10, r3, r15, r15)
            java.lang.String r31 = "getAndSet"
            r32 = r5
            kotlin.reflect.jvm.internal.impl.name.f r5 = kotlin.reflect.jvm.internal.impl.name.f.h(r31)
            kotlin.Pair r5 = kotlin.o0.a(r10, r5)
            java.lang.String r10 = r8.j(r4)
            r33 = r5
            java.lang.String r5 = "fetchAndAdd"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r5 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r10, r5, r15, r15)
            java.lang.String r10 = "getAndAdd"
            r34 = r6
            kotlin.reflect.jvm.internal.impl.name.f r6 = kotlin.reflect.jvm.internal.impl.name.f.h(r10)
            kotlin.Pair r5 = kotlin.o0.a(r5, r6)
            java.lang.String r4 = r8.j(r4)
            java.lang.String r6 = "addAndFetch"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r4 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r4, r6, r15, r15)
            java.lang.String r6 = "addAndGet"
            r35 = r5
            kotlin.reflect.jvm.internal.impl.name.f r5 = kotlin.reflect.jvm.internal.impl.name.f.h(r6)
            kotlin.Pair r4 = kotlin.o0.a(r4, r5)
            java.lang.String r5 = "AtomicLong"
            r36 = r4
            java.lang.String r4 = r8.j(r5)
            r37 = r6
            java.lang.String r6 = "J"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r4 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r4, r13, r7, r6)
            r38 = r10
            kotlin.reflect.jvm.internal.impl.name.f r10 = kotlin.reflect.jvm.internal.impl.name.f.h(r14)
            kotlin.Pair r4 = kotlin.o0.a(r4, r10)
            java.lang.String r10 = r8.j(r5)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r10 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r10, r1, r6, r2)
            r39 = r4
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.name.f.h(r28)
            kotlin.Pair r4 = kotlin.o0.a(r10, r4)
            java.lang.String r10 = r8.j(r5)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r10 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r10, r3, r6, r6)
            r40 = r4
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.name.f.h(r31)
            kotlin.Pair r4 = kotlin.o0.a(r10, r4)
            java.lang.String r10 = r8.j(r5)
            r41 = r4
            java.lang.String r4 = "fetchAndAdd"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r4 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r10, r4, r6, r6)
            kotlin.reflect.jvm.internal.impl.name.f r10 = kotlin.reflect.jvm.internal.impl.name.f.h(r38)
            kotlin.Pair r4 = kotlin.o0.a(r4, r10)
            java.lang.String r5 = r8.j(r5)
            java.lang.String r10 = "addAndFetch"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r5 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r5, r10, r6, r6)
            kotlin.reflect.jvm.internal.impl.name.f r10 = kotlin.reflect.jvm.internal.impl.name.f.h(r37)
            kotlin.Pair r5 = kotlin.o0.a(r5, r10)
            java.lang.String r10 = "AtomicBoolean"
            r42 = r4
            java.lang.String r4 = r8.j(r10)
            r43 = r5
            java.lang.String r5 = "Z"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r4 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r4, r13, r7, r5)
            r44 = r11
            kotlin.reflect.jvm.internal.impl.name.f r11 = kotlin.reflect.jvm.internal.impl.name.f.h(r14)
            kotlin.Pair r4 = kotlin.o0.a(r4, r11)
            java.lang.String r11 = r8.j(r10)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r11 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r11, r1, r5, r2)
            r45 = r4
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.name.f.h(r28)
            kotlin.Pair r4 = kotlin.o0.a(r11, r4)
            java.lang.String r10 = r8.j(r10)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r10 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r10, r3, r5, r5)
            kotlin.reflect.jvm.internal.impl.name.f r11 = kotlin.reflect.jvm.internal.impl.name.f.h(r31)
            kotlin.Pair r10 = kotlin.o0.a(r10, r11)
            java.lang.String r11 = "AtomicReference"
            r46 = r4
            java.lang.String r4 = r8.j(r11)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r4 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r4, r13, r7, r9)
            kotlin.reflect.jvm.internal.impl.name.f r7 = kotlin.reflect.jvm.internal.impl.name.f.h(r14)
            kotlin.Pair r4 = kotlin.o0.a(r4, r7)
            java.lang.String r7 = r8.j(r11)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r1 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r7, r1, r9, r2)
            kotlin.reflect.jvm.internal.impl.name.f r7 = kotlin.reflect.jvm.internal.impl.name.f.h(r28)
            kotlin.Pair r1 = kotlin.o0.a(r1, r7)
            java.lang.String r7 = r8.j(r11)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r3 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r7, r3, r9, r9)
            kotlin.reflect.jvm.internal.impl.name.f r7 = kotlin.reflect.jvm.internal.impl.name.f.h(r31)
            kotlin.Pair r3 = kotlin.o0.a(r3, r7)
            java.lang.String r7 = "AtomicIntegerArray"
            java.lang.String r11 = r8.j(r7)
            java.lang.String r13 = "loadAt"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r11 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r11, r13, r15, r15)
            r47 = r1
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.name.f.h(r14)
            kotlin.Pair r1 = kotlin.o0.a(r11, r1)
            java.lang.String r11 = r8.j(r7)
            r48 = r1
            java.lang.String r1 = "storeAt"
            r49 = r3
            java.lang.String r3 = "II"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r11 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r11, r1, r3, r2)
            r50 = r4
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.name.f.h(r28)
            kotlin.Pair r4 = kotlin.o0.a(r11, r4)
            java.lang.String r11 = r8.j(r7)
            r51 = r4
            java.lang.String r4 = "exchangeAt"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r11 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r11, r4, r3, r15)
            r52 = r10
            kotlin.reflect.jvm.internal.impl.name.f r10 = kotlin.reflect.jvm.internal.impl.name.f.h(r31)
            kotlin.Pair r10 = kotlin.o0.a(r11, r10)
            java.lang.String r11 = r8.j(r7)
            r53 = r10
            java.lang.String r10 = "III"
            r54 = r12
            java.lang.String r12 = "compareAndSetAt"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r10 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r11, r12, r10, r5)
            java.lang.String r11 = "compareAndSet"
            r55 = r11
            kotlin.reflect.jvm.internal.impl.name.f r11 = kotlin.reflect.jvm.internal.impl.name.f.h(r55)
            kotlin.Pair r10 = kotlin.o0.a(r10, r11)
            java.lang.String r11 = r8.j(r7)
            r56 = r10
            java.lang.String r10 = "fetchAndAddAt"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r10 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r11, r10, r3, r15)
            kotlin.reflect.jvm.internal.impl.name.f r11 = kotlin.reflect.jvm.internal.impl.name.f.h(r38)
            kotlin.Pair r10 = kotlin.o0.a(r10, r11)
            java.lang.String r7 = r8.j(r7)
            java.lang.String r11 = "addAndFetchAt"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r3 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r7, r11, r3, r15)
            kotlin.reflect.jvm.internal.impl.name.f r7 = kotlin.reflect.jvm.internal.impl.name.f.h(r37)
            kotlin.Pair r3 = kotlin.o0.a(r3, r7)
            java.lang.String r7 = "AtomicLongArray"
            java.lang.String r11 = r8.j(r7)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r11 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r11, r13, r15, r6)
            r57 = r3
            kotlin.reflect.jvm.internal.impl.name.f r3 = kotlin.reflect.jvm.internal.impl.name.f.h(r14)
            kotlin.Pair r3 = kotlin.o0.a(r11, r3)
            java.lang.String r11 = r8.j(r7)
            r58 = r3
            java.lang.String r3 = "IJ"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r11 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r11, r1, r3, r2)
            r59 = r10
            kotlin.reflect.jvm.internal.impl.name.f r10 = kotlin.reflect.jvm.internal.impl.name.f.h(r28)
            kotlin.Pair r10 = kotlin.o0.a(r11, r10)
            java.lang.String r11 = r8.j(r7)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r11 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r11, r4, r3, r6)
            r60 = r10
            kotlin.reflect.jvm.internal.impl.name.f r10 = kotlin.reflect.jvm.internal.impl.name.f.h(r31)
            kotlin.Pair r10 = kotlin.o0.a(r11, r10)
            java.lang.String r11 = r8.j(r7)
            r61 = r10
            java.lang.String r10 = "IJJ"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r10 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r11, r12, r10, r5)
            kotlin.reflect.jvm.internal.impl.name.f r11 = kotlin.reflect.jvm.internal.impl.name.f.h(r55)
            kotlin.Pair r10 = kotlin.o0.a(r10, r11)
            java.lang.String r11 = r8.j(r7)
            r62 = r10
            java.lang.String r10 = "fetchAndAddAt"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r10 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r11, r10, r3, r6)
            kotlin.reflect.jvm.internal.impl.name.f r11 = kotlin.reflect.jvm.internal.impl.name.f.h(r38)
            kotlin.Pair r10 = kotlin.o0.a(r10, r11)
            java.lang.String r7 = r8.j(r7)
            java.lang.String r11 = "addAndFetchAt"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r3 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r7, r11, r3, r6)
            kotlin.reflect.jvm.internal.impl.name.f r6 = kotlin.reflect.jvm.internal.impl.name.f.h(r37)
            kotlin.Pair r3 = kotlin.o0.a(r3, r6)
            java.lang.String r6 = "AtomicReferenceArray"
            java.lang.String r7 = r8.j(r6)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r7 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r7, r13, r15, r9)
            kotlin.reflect.jvm.internal.impl.name.f r11 = kotlin.reflect.jvm.internal.impl.name.f.h(r14)
            kotlin.Pair r7 = kotlin.o0.a(r7, r11)
            java.lang.String r11 = r8.j(r6)
            java.lang.String r13 = "ILjava/lang/Object;"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r1 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r11, r1, r13, r2)
            kotlin.reflect.jvm.internal.impl.name.f r2 = kotlin.reflect.jvm.internal.impl.name.f.h(r28)
            kotlin.Pair r1 = kotlin.o0.a(r1, r2)
            java.lang.String r2 = r8.j(r6)
            java.lang.String r11 = "ILjava/lang/Object;"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r2 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r2, r4, r11, r9)
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.name.f.h(r31)
            kotlin.Pair r2 = kotlin.o0.a(r2, r4)
            java.lang.String r4 = r8.j(r6)
            java.lang.String r6 = "ILjava/lang/Object;Ljava/lang/Object;"
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.a(r0, r4, r12, r6, r5)
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.name.f.h(r55)
            kotlin.Pair r0 = kotlin.o0.a(r0, r4)
            r4 = 40
            kotlin.Pair[] r4 = new kotlin.Pair[r4]
            r4[r17] = r24
            r4[r19] = r32
            r4[r23] = r34
            r4[r21] = r44
            r4[r22] = r25
            r4[r18] = r54
            r4[r20] = r29
            r5 = 7
            r4[r5] = r27
            r5 = 8
            r4[r5] = r26
            r5 = 9
            r4[r5] = r30
            r16 = 10
            r4[r16] = r33
            r5 = 11
            r4[r5] = r35
            r5 = 12
            r4[r5] = r36
            r5 = 13
            r4[r5] = r39
            r5 = 14
            r4[r5] = r40
            r5 = 15
            r4[r5] = r41
            r5 = 16
            r4[r5] = r42
            r5 = 17
            r4[r5] = r43
            r5 = 18
            r4[r5] = r45
            r5 = 19
            r4[r5] = r46
            r5 = 20
            r4[r5] = r52
            r5 = 21
            r4[r5] = r50
            r5 = 22
            r4[r5] = r47
            r5 = 23
            r4[r5] = r49
            r5 = 24
            r4[r5] = r48
            r5 = 25
            r4[r5] = r51
            r5 = 26
            r4[r5] = r53
            r5 = 27
            r4[r5] = r56
            r5 = 28
            r4[r5] = r59
            r5 = 29
            r4[r5] = r57
            r5 = 30
            r4[r5] = r58
            r5 = 31
            r4[r5] = r60
            r5 = 32
            r4[r5] = r61
            r5 = 33
            r4[r5] = r62
            r5 = 34
            r4[r5] = r10
            r5 = 35
            r4[r5] = r3
            r3 = 36
            r4[r3] = r7
            r3 = 37
            r4[r3] = r1
            r1 = 38
            r4[r1] = r2
            r1 = 39
            r4[r1] = r0
            java.util.Map r0 = kotlin.collections.i1.W(r4)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.j = r0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r2 = r0.size()
            int r2 = kotlin.collections.i1.j(r2)
            r1.<init>(r2)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L679:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L697
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r3 = (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a) r3
            java.lang.String r3 = r3.d()
            java.lang.Object r2 = r2.getValue()
            r1.put(r3, r2)
            goto L679
        L697:
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.k = r1
            java.util.Map<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a, kotlin.reflect.jvm.internal.impl.name.f> r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.j
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L6a8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6d4
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            r4 = r3
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r4 = (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a) r4
            java.lang.Object r2 = r2.getValue()
            r6 = r2
            kotlin.reflect.jvm.internal.impl.name.f r6 = (kotlin.reflect.jvm.internal.impl.name.f) r6
            r9 = 13
            r10 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r2 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a.b(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r2 = r2.d()
            r1.add(r2)
            goto L6a8
        L6d4:
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.l = r1
            java.util.Map<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a, kotlin.reflect.jvm.internal.impl.name.f> r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.j
            java.util.Set r0 = r0.keySet()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L6e5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6f9
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r2 = (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a) r2
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.c()
            r1.add(r2)
            goto L6e5
        L6f9:
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.m = r1
            java.util.Map<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a, kotlin.reflect.jvm.internal.impl.name.f> r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.j
            java.util.Set r0 = r0.entrySet()
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r2 = kotlin.collections.f0.d0(r0, r3)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L710:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L733
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.Object r4 = r2.getKey()
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r4 = (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a) r4
            kotlin.reflect.jvm.internal.impl.name.f r4 = r4.c()
            java.lang.Object r2 = r2.getValue()
            r3.<init>(r4, r2)
            r1.add(r3)
            goto L710
        L733:
            r3 = 10
            int r0 = kotlin.collections.f0.d0(r1, r3)
            int r0 = kotlin.collections.i1.j(r0)
            r2 = 16
            int r0 = kotlin.ranges.t.u(r0, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
        L74c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L768
            java.lang.Object r1 = r0.next()
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r3 = r1.getSecond()
            kotlin.reflect.jvm.internal.impl.name.f r3 = (kotlin.reflect.jvm.internal.impl.name.f) r3
            java.lang.Object r1 = r1.getFirst()
            kotlin.reflect.jvm.internal.impl.name.f r1 = (kotlin.reflect.jvm.internal.impl.name.f) r1
            r2.put(r3, r1)
            goto L74c
        L768:
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.n = r2
            return
    }

    public SpecialGenericSignatures() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ java.util.List a() {
            java.util.List<java.lang.String> r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.c
            return r0
    }

    public static final /* synthetic */ java.util.Set b() {
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.g
            return r0
    }

    public static final /* synthetic */ java.util.Set c() {
            java.util.Set<java.lang.String> r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.h
            return r0
    }

    public static final /* synthetic */ java.util.Map d() {
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.name.f> r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.n
            return r0
    }

    public static final /* synthetic */ java.util.Set e() {
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.m
            return r0
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a.C0039a f() {
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.i
            return r0
    }

    public static final /* synthetic */ java.util.Map g() {
            java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription> r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.f
            return r0
    }

    public static final /* synthetic */ java.util.Map h() {
            java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.name.f> r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.k
            return r0
    }
}
