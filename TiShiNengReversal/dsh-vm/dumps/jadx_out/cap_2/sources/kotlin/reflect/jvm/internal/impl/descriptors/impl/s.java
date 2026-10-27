package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class s extends kotlin.reflect.jvm.internal.impl.descriptors.impl.n implements kotlin.reflect.jvm.internal.impl.descriptors.y {
    private final kotlin.reflect.jvm.internal.impl.descriptors.y A;
    private final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind B;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.descriptors.y C;
    protected java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<?>, java.lang.Object> D;
    private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> e;
    private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> f;
    private kotlin.reflect.jvm.internal.impl.types.t0 g;
    private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> h;
    private kotlin.reflect.jvm.internal.impl.descriptors.z0 i;
    private kotlin.reflect.jvm.internal.impl.descriptors.z0 j;
    private kotlin.reflect.jvm.internal.impl.descriptors.Modality k;
    private kotlin.reflect.jvm.internal.impl.descriptors.s l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.y> y;
    private volatile kotlin.jvm.functions.Function0<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.y>> z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements kotlin.jvm.functions.Function0<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.y>> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.h2 a;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.s b;

        a(kotlin.reflect.jvm.internal.impl.descriptors.impl.s r1, kotlin.reflect.jvm.internal.impl.types.h2 r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.y> a() {
                r4 = this;
                kotlin.reflect.jvm.internal.impl.utils.j r0 = new kotlin.reflect.jvm.internal.impl.utils.j
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s r1 = r4.b
                java.util.Collection r1 = r1.e()
                java.util.Iterator r1 = r1.iterator()
            Lf:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L25
                java.lang.Object r2 = r1.next()
                kotlin.reflect.jvm.internal.impl.descriptors.y r2 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r2
                kotlin.reflect.jvm.internal.impl.types.h2 r3 = r4.a
                kotlin.reflect.jvm.internal.impl.descriptors.y r2 = r2.c(r3)
                r0.add(r2)
                goto Lf
            L25:
                return r0
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.y> invoke() {
                r1 = this;
                java.util.Collection r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements kotlin.jvm.functions.Function0<java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.s1>> {
        final /* synthetic */ java.util.List a;

        b(java.util.List r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.s1> a() {
                r1 = this;
                java.util.List r0 = r1.a
                return r0
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.s1> invoke() {
                r1 = this;
                java.util.List r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> {

        @org.jetbrains.annotations.NotNull
        protected kotlin.reflect.jvm.internal.impl.types.f2 a;

        @org.jetbrains.annotations.NotNull
        protected kotlin.reflect.jvm.internal.impl.descriptors.k b;

        @org.jetbrains.annotations.NotNull
        protected kotlin.reflect.jvm.internal.impl.descriptors.Modality c;

        @org.jetbrains.annotations.NotNull
        protected kotlin.reflect.jvm.internal.impl.descriptors.s d;

        @org.jetbrains.annotations.Nullable
        protected kotlin.reflect.jvm.internal.impl.descriptors.y e;

        @org.jetbrains.annotations.NotNull
        protected kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind f;

        @org.jetbrains.annotations.NotNull
        protected java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> g;

        @org.jetbrains.annotations.NotNull
        protected java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> h;

        @org.jetbrains.annotations.Nullable
        protected kotlin.reflect.jvm.internal.impl.descriptors.z0 i;

        @org.jetbrains.annotations.Nullable
        protected kotlin.reflect.jvm.internal.impl.descriptors.z0 j;

        @org.jetbrains.annotations.NotNull
        protected kotlin.reflect.jvm.internal.impl.types.t0 k;

        @org.jetbrains.annotations.Nullable
        protected kotlin.reflect.jvm.internal.impl.name.f l;
        protected boolean m;
        protected boolean n;
        protected boolean o;
        protected boolean p;
        private boolean q;
        private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r;
        private kotlin.reflect.jvm.internal.impl.descriptors.annotations.g s;
        private boolean t;
        private java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<?>, java.lang.Object> u;
        private java.lang.Boolean v;
        protected boolean w;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.s x;

        public c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.impl.s r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Modality r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r10, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r11, @org.jetbrains.annotations.Nullable java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.z0 r13, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r14, kotlin.reflect.jvm.internal.impl.name.f r15) {
                r4 = this;
                r0 = 0
                if (r6 != 0) goto L6
                u(r0)
            L6:
                r1 = 1
                if (r7 != 0) goto Lc
                u(r1)
            Lc:
                if (r8 != 0) goto L12
                r2 = 2
                u(r2)
            L12:
                if (r9 != 0) goto L18
                r2 = 3
                u(r2)
            L18:
                if (r10 != 0) goto L1e
                r2 = 4
                u(r2)
            L1e:
                if (r11 != 0) goto L24
                r2 = 5
                u(r2)
            L24:
                if (r12 != 0) goto L2a
                r2 = 6
                u(r2)
            L2a:
                if (r14 != 0) goto L30
                r2 = 7
                u(r2)
            L30:
                r4.x = r5
                r4.<init>()
                r2 = 0
                r4.e = r2
                kotlin.reflect.jvm.internal.impl.descriptors.z0 r3 = kotlin.reflect.jvm.internal.impl.descriptors.impl.s.E0(r5)
                r4.j = r3
                r4.m = r1
                r4.n = r0
                r4.o = r0
                r4.p = r0
                boolean r1 = r5.D0()
                r4.q = r1
                r4.r = r2
                r4.s = r2
                boolean r5 = r5.S()
                r4.t = r5
                java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
                r5.<init>()
                r4.u = r5
                r4.v = r2
                r4.w = r0
                r4.a = r6
                r4.b = r7
                r4.c = r8
                r4.d = r9
                r4.f = r10
                r4.g = r11
                r4.h = r12
                r4.i = r13
                r4.k = r14
                r4.l = r15
                return
        }

        static /* synthetic */ java.util.Map A(kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c r0) {
                java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.a$a<?>, java.lang.Object> r0 = r0.u
                return r0
        }

        private static /* synthetic */ void u(int r17) {
                switch(r17) {
                    case 9: goto L6;
                    case 10: goto L3;
                    case 11: goto L6;
                    case 12: goto L3;
                    case 13: goto L6;
                    case 14: goto L3;
                    case 15: goto L6;
                    case 16: goto L6;
                    case 17: goto L3;
                    case 18: goto L6;
                    case 19: goto L3;
                    case 20: goto L6;
                    case 21: goto L3;
                    case 22: goto L6;
                    case 23: goto L3;
                    case 24: goto L6;
                    case 25: goto L3;
                    case 26: goto L6;
                    case 27: goto L6;
                    case 28: goto L6;
                    case 29: goto L6;
                    case 30: goto L6;
                    case 31: goto L6;
                    case 32: goto L6;
                    case 33: goto L6;
                    case 34: goto L6;
                    case 35: goto L3;
                    case 36: goto L6;
                    case 37: goto L3;
                    case 38: goto L6;
                    case 39: goto L3;
                    case 40: goto L6;
                    case 41: goto L6;
                    case 42: goto L6;
                    default: goto L3;
                }
            L3:
                java.lang.String r0 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto L8
            L6:
                java.lang.String r0 = "@NotNull method %s.%s must not return null"
            L8:
                r1 = 2
                switch(r17) {
                    case 9: goto Le;
                    case 10: goto Lc;
                    case 11: goto Le;
                    case 12: goto Lc;
                    case 13: goto Le;
                    case 14: goto Lc;
                    case 15: goto Le;
                    case 16: goto Le;
                    case 17: goto Lc;
                    case 18: goto Le;
                    case 19: goto Lc;
                    case 20: goto Le;
                    case 21: goto Lc;
                    case 22: goto Le;
                    case 23: goto Lc;
                    case 24: goto Le;
                    case 25: goto Lc;
                    case 26: goto Le;
                    case 27: goto Le;
                    case 28: goto Le;
                    case 29: goto Le;
                    case 30: goto Le;
                    case 31: goto Le;
                    case 32: goto Le;
                    case 33: goto Le;
                    case 34: goto Le;
                    case 35: goto Lc;
                    case 36: goto Le;
                    case 37: goto Lc;
                    case 38: goto Le;
                    case 39: goto Lc;
                    case 40: goto Le;
                    case 41: goto Le;
                    case 42: goto Le;
                    default: goto Lc;
                }
            Lc:
                r2 = 3
                goto Lf
            Le:
                r2 = 2
            Lf:
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration"
                r4 = 0
                switch(r17) {
                    case 1: goto L6a;
                    case 2: goto L65;
                    case 3: goto L60;
                    case 4: goto L5b;
                    case 5: goto L56;
                    case 6: goto L51;
                    case 7: goto L4c;
                    case 8: goto L47;
                    case 9: goto L44;
                    case 10: goto L3f;
                    case 11: goto L44;
                    case 12: goto L3a;
                    case 13: goto L44;
                    case 14: goto L5b;
                    case 15: goto L44;
                    case 16: goto L44;
                    case 17: goto L35;
                    case 18: goto L44;
                    case 19: goto L30;
                    case 20: goto L44;
                    case 21: goto L30;
                    case 22: goto L44;
                    case 23: goto L2b;
                    case 24: goto L44;
                    case 25: goto L26;
                    case 26: goto L44;
                    case 27: goto L44;
                    case 28: goto L44;
                    case 29: goto L44;
                    case 30: goto L44;
                    case 31: goto L44;
                    case 32: goto L44;
                    case 33: goto L44;
                    case 34: goto L44;
                    case 35: goto L21;
                    case 36: goto L44;
                    case 37: goto L17;
                    case 38: goto L44;
                    case 39: goto L1c;
                    case 40: goto L44;
                    case 41: goto L44;
                    case 42: goto L44;
                    default: goto L17;
                }
            L17:
                java.lang.String r5 = "substitution"
                r2[r4] = r5
                goto L6e
            L1c:
                java.lang.String r5 = "userDataKey"
                r2[r4] = r5
                goto L6e
            L21:
                java.lang.String r5 = "additionalAnnotations"
                r2[r4] = r5
                goto L6e
            L26:
                java.lang.String r5 = "contextReceiverParameters"
                r2[r4] = r5
                goto L6e
            L2b:
                java.lang.String r5 = "type"
                r2[r4] = r5
                goto L6e
            L30:
                java.lang.String r5 = "parameters"
                r2[r4] = r5
                goto L6e
            L35:
                java.lang.String r5 = "name"
                r2[r4] = r5
                goto L6e
            L3a:
                java.lang.String r5 = "visibility"
                r2[r4] = r5
                goto L6e
            L3f:
                java.lang.String r5 = "modality"
                r2[r4] = r5
                goto L6e
            L44:
                r2[r4] = r3
                goto L6e
            L47:
                java.lang.String r5 = "owner"
                r2[r4] = r5
                goto L6e
            L4c:
                java.lang.String r5 = "newReturnType"
                r2[r4] = r5
                goto L6e
            L51:
                java.lang.String r5 = "newContextReceiverParameters"
                r2[r4] = r5
                goto L6e
            L56:
                java.lang.String r5 = "newValueParameterDescriptors"
                r2[r4] = r5
                goto L6e
            L5b:
                java.lang.String r5 = "kind"
                r2[r4] = r5
                goto L6e
            L60:
                java.lang.String r5 = "newVisibility"
                r2[r4] = r5
                goto L6e
            L65:
                java.lang.String r5 = "newModality"
                r2[r4] = r5
                goto L6e
            L6a:
                java.lang.String r5 = "newOwner"
                r2[r4] = r5
            L6e:
                java.lang.String r4 = "setOwner"
                java.lang.String r5 = "setModality"
                java.lang.String r6 = "setVisibility"
                java.lang.String r7 = "setKind"
                java.lang.String r8 = "setName"
                java.lang.String r9 = "setValueParameters"
                java.lang.String r10 = "setTypeParameters"
                java.lang.String r11 = "setReturnType"
                java.lang.String r12 = "setContextReceiverParameters"
                java.lang.String r13 = "setAdditionalAnnotations"
                java.lang.String r14 = "setSubstitution"
                java.lang.String r15 = "putUserData"
                r16 = 1
                switch(r17) {
                    case 9: goto Le8;
                    case 10: goto L8b;
                    case 11: goto Le5;
                    case 12: goto L8b;
                    case 13: goto Le2;
                    case 14: goto L8b;
                    case 15: goto Ldf;
                    case 16: goto Lda;
                    case 17: goto L8b;
                    case 18: goto Ld7;
                    case 19: goto L8b;
                    case 20: goto Ld4;
                    case 21: goto L8b;
                    case 22: goto Ld1;
                    case 23: goto L8b;
                    case 24: goto Lce;
                    case 25: goto L8b;
                    case 26: goto Lcb;
                    case 27: goto Lc6;
                    case 28: goto Lc1;
                    case 29: goto Lbc;
                    case 30: goto Lb7;
                    case 31: goto Lb2;
                    case 32: goto Lad;
                    case 33: goto La8;
                    case 34: goto La3;
                    case 35: goto L8b;
                    case 36: goto La0;
                    case 37: goto L8b;
                    case 38: goto L9d;
                    case 39: goto L8b;
                    case 40: goto L9a;
                    case 41: goto L95;
                    case 42: goto L8f;
                    default: goto L8b;
                }
            L8b:
                r2[r16] = r3
                goto Lea
            L8f:
                java.lang.String r3 = "setJustForTypeSubstitution"
                r2[r16] = r3
                goto Lea
            L95:
                java.lang.String r3 = "getSubstitution"
                r2[r16] = r3
                goto Lea
            L9a:
                r2[r16] = r15
                goto Lea
            L9d:
                r2[r16] = r14
                goto Lea
            La0:
                r2[r16] = r13
                goto Lea
            La3:
                java.lang.String r3 = "setHiddenForResolutionEverywhereBesideSupercalls"
                r2[r16] = r3
                goto Lea
            La8:
                java.lang.String r3 = "setHiddenToOvercomeSignatureClash"
                r2[r16] = r3
                goto Lea
            Lad:
                java.lang.String r3 = "setDropOriginalInContainingParts"
                r2[r16] = r3
                goto Lea
            Lb2:
                java.lang.String r3 = "setPreserveSourceElement"
                r2[r16] = r3
                goto Lea
            Lb7:
                java.lang.String r3 = "setSignatureChange"
                r2[r16] = r3
                goto Lea
            Lbc:
                java.lang.String r3 = "setOriginal"
                r2[r16] = r3
                goto Lea
            Lc1:
                java.lang.String r3 = "setDispatchReceiverParameter"
                r2[r16] = r3
                goto Lea
            Lc6:
                java.lang.String r3 = "setExtensionReceiverParameter"
                r2[r16] = r3
                goto Lea
            Lcb:
                r2[r16] = r12
                goto Lea
            Lce:
                r2[r16] = r11
                goto Lea
            Ld1:
                r2[r16] = r10
                goto Lea
            Ld4:
                r2[r16] = r9
                goto Lea
            Ld7:
                r2[r16] = r8
                goto Lea
            Lda:
                java.lang.String r3 = "setCopyOverrides"
                r2[r16] = r3
                goto Lea
            Ldf:
                r2[r16] = r7
                goto Lea
            Le2:
                r2[r16] = r6
                goto Lea
            Le5:
                r2[r16] = r5
                goto Lea
            Le8:
                r2[r16] = r4
            Lea:
                switch(r17) {
                    case 8: goto L113;
                    case 9: goto L115;
                    case 10: goto L110;
                    case 11: goto L115;
                    case 12: goto L10d;
                    case 13: goto L115;
                    case 14: goto L10a;
                    case 15: goto L115;
                    case 16: goto L115;
                    case 17: goto L107;
                    case 18: goto L115;
                    case 19: goto L104;
                    case 20: goto L115;
                    case 21: goto L101;
                    case 22: goto L115;
                    case 23: goto Lfe;
                    case 24: goto L115;
                    case 25: goto Lfb;
                    case 26: goto L115;
                    case 27: goto L115;
                    case 28: goto L115;
                    case 29: goto L115;
                    case 30: goto L115;
                    case 31: goto L115;
                    case 32: goto L115;
                    case 33: goto L115;
                    case 34: goto L115;
                    case 35: goto Lf8;
                    case 36: goto L115;
                    case 37: goto Lf5;
                    case 38: goto L115;
                    case 39: goto Lf2;
                    case 40: goto L115;
                    case 41: goto L115;
                    case 42: goto L115;
                    default: goto Led;
                }
            Led:
                java.lang.String r3 = "<init>"
                r2[r1] = r3
                goto L115
            Lf2:
                r2[r1] = r15
                goto L115
            Lf5:
                r2[r1] = r14
                goto L115
            Lf8:
                r2[r1] = r13
                goto L115
            Lfb:
                r2[r1] = r12
                goto L115
            Lfe:
                r2[r1] = r11
                goto L115
            L101:
                r2[r1] = r10
                goto L115
            L104:
                r2[r1] = r9
                goto L115
            L107:
                r2[r1] = r8
                goto L115
            L10a:
                r2[r1] = r7
                goto L115
            L10d:
                r2[r1] = r6
                goto L115
            L110:
                r2[r1] = r5
                goto L115
            L113:
                r2[r1] = r4
            L115:
                java.lang.String r0 = java.lang.String.format(r0, r2)
                switch(r17) {
                    case 9: goto L122;
                    case 10: goto L11c;
                    case 11: goto L122;
                    case 12: goto L11c;
                    case 13: goto L122;
                    case 14: goto L11c;
                    case 15: goto L122;
                    case 16: goto L122;
                    case 17: goto L11c;
                    case 18: goto L122;
                    case 19: goto L11c;
                    case 20: goto L122;
                    case 21: goto L11c;
                    case 22: goto L122;
                    case 23: goto L11c;
                    case 24: goto L122;
                    case 25: goto L11c;
                    case 26: goto L122;
                    case 27: goto L122;
                    case 28: goto L122;
                    case 29: goto L122;
                    case 30: goto L122;
                    case 31: goto L122;
                    case 32: goto L122;
                    case 33: goto L122;
                    case 34: goto L122;
                    case 35: goto L11c;
                    case 36: goto L122;
                    case 37: goto L11c;
                    case 38: goto L122;
                    case 39: goto L11c;
                    case 40: goto L122;
                    case 41: goto L122;
                    case 42: goto L122;
                    default: goto L11c;
                }
            L11c:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                r1.<init>(r0)
                goto L127
            L122:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
            L127:
                throw r1
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.g v(kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c r0) {
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.s
                return r0
        }

        static /* synthetic */ java.util.List w(kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c r0) {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r0 = r0.r
                return r0
        }

        static /* synthetic */ boolean x(kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c r0) {
                boolean r0 = r0.q
                return r0
        }

        static /* synthetic */ boolean y(kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c r0) {
                boolean r0 = r0.t
                return r0
        }

        static /* synthetic */ java.lang.Boolean z(kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c r0) {
                java.lang.Boolean r0 = r0.v
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c B(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2) {
                r1 = this;
                if (r2 != 0) goto L7
                r0 = 35
                u(r0)
            L7:
                r1.s = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c C(boolean r1) {
                r0 = this;
                r0.m = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c D(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.z0 r1) {
                r0 = this;
                r0.j = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c E() {
                r1 = this;
                r0 = 1
                r1.p = r0
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c F(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.z0 r1) {
                r0 = this;
                r0.i = r1
                return r0
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c G(boolean r1) {
                r0 = this;
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.v = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c H() {
                r1 = this;
                r0 = 1
                r1.t = r0
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c I() {
                r1 = this;
                r0 = 1
                r1.q = r0
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c J(boolean r1) {
                r0 = this;
                r0.w = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c K(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r2) {
                r1 = this;
                if (r2 != 0) goto L7
                r0 = 14
                u(r0)
            L7:
                r1.f = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c L(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Modality r2) {
                r1 = this;
                if (r2 != 0) goto L7
                r0 = 10
                u(r0)
            L7:
                r1.c = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c M(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
                r1 = this;
                if (r2 != 0) goto L7
                r0 = 17
                u(r0)
            L7:
                r1.l = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c N(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.y r1 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r1
                r0.e = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c O(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
                r1 = this;
                if (r2 != 0) goto L7
                r0 = 8
                u(r0)
            L7:
                r1.b = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c P() {
                r1 = this;
                r0 = 1
                r1.o = r0
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c Q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
                r1 = this;
                if (r2 != 0) goto L7
                r0 = 23
                u(r0)
            L7:
                r1.k = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c R() {
                r1 = this;
                r0 = 1
                r1.n = r0
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c S(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r2) {
                r1 = this;
                if (r2 != 0) goto L7
                r0 = 37
                u(r0)
            L7:
                r1.a = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c T(@org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r2) {
                r1 = this;
                if (r2 != 0) goto L7
                r0 = 21
                u(r0)
            L7:
                r1.r = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c U(@org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r2) {
                r1 = this;
                if (r2 != 0) goto L7
                r0 = 19
                u(r0)
            L7:
                r1.g = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c V(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r2) {
                r1 = this;
                if (r2 != 0) goto L7
                r0 = 12
                u(r0)
            L7:
                r1.d = r2
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> a(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.z0 r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r1 = r0.D(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> b(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.z0 r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r1 = r0.F(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.descriptors.y build() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s r0 = r1.x
                kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r0.H0(r1)
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r1 = r0.S(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.NotNull
        public <V> kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<V> r2, V r3) {
                r1 = this;
                if (r2 != 0) goto L7
                r0 = 39
                u(r0)
            L7:
                java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.a$a<?>, java.lang.Object> r0 = r1.u
                r0.put(r2, r3)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> e() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r0 = r1.I()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r1 = r0.M(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> g() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r0 = r1.P()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r1 = r0.Q(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> i(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r1 = r0.N(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> j(boolean r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r1 = r0.C(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> k(@org.jetbrains.annotations.NotNull java.util.List r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r1 = r0.T(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r1 = r0.B(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> m() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r0 = r1.E()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> n(@org.jetbrains.annotations.NotNull java.util.List r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r1 = r0.U(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> o() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r0 = r1.H()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r1 = r0.V(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Modality r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r1 = r0.L(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> r(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r1 = r0.O(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> s(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r1 = r0.K(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.y.a
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y.a<kotlin.reflect.jvm.internal.impl.descriptors.y> t() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r0 = r1.R()
                return r0
        }
    }

    protected s(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r4, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.y r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r9) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L6
            T(r0)
        L6:
            r1 = 1
            if (r6 != 0) goto Lc
            T(r1)
        Lc:
            if (r7 != 0) goto L12
            r2 = 2
            T(r2)
        L12:
            if (r8 != 0) goto L18
            r2 = 3
            T(r2)
        L18:
            if (r9 != 0) goto L1e
            r2 = 4
            T(r2)
        L1e:
            r3.<init>(r4, r6, r7, r9)
            kotlin.reflect.jvm.internal.impl.descriptors.s r4 = kotlin.reflect.jvm.internal.impl.descriptors.r.i
            r3.l = r4
            r3.m = r0
            r3.n = r0
            r3.o = r0
            r3.p = r0
            r3.q = r0
            r3.r = r0
            r3.s = r0
            r3.t = r0
            r3.u = r0
            r3.v = r0
            r3.w = r1
            r3.x = r0
            r4 = 0
            r3.y = r4
            r3.z = r4
            r3.C = r4
            r3.D = r4
            if (r5 != 0) goto L49
            r5 = r3
        L49:
            r3.A = r5
            r3.B = r8
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.z0 E0(kotlin.reflect.jvm.internal.impl.descriptors.impl.s r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r0.j
            return r0
    }

    @org.jetbrains.annotations.NotNull
    private kotlin.reflect.jvm.internal.impl.descriptors.e1 I0(boolean r1, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.y r2) {
            r0 = this;
            if (r1 == 0) goto Le
            if (r2 == 0) goto L5
            goto L9
        L5:
            kotlin.reflect.jvm.internal.impl.descriptors.y r2 = r0.a()
        L9:
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r1 = r2.getSource()
            goto L10
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r1 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
        L10:
            if (r1 != 0) goto L17
            r2 = 27
            T(r2)
        L17:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> J0(kotlin.reflect.jvm.internal.impl.descriptors.y r7, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r9) {
            if (r8 != 0) goto L7
            r0 = 28
            T(r0)
        L7:
            if (r9 != 0) goto Le
            r0 = 29
            T(r0)
        Le:
            r5 = 0
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            java.util.List r7 = K0(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @org.jetbrains.annotations.Nullable
    public static java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> K0(kotlin.reflect.jvm.internal.impl.descriptors.y r18, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r19, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r20, boolean r21, boolean r22, @org.jetbrains.annotations.Nullable boolean[] r23) {
            r0 = r20
            if (r19 != 0) goto L9
            r1 = 30
            T(r1)
        L9:
            if (r0 != 0) goto L10
            r1 = 31
            T(r1)
        L10:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r19.size()
            r1.<init>(r2)
            java.util.Iterator r2 = r19.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9a
            java.lang.Object r3 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r3
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r3.getType()
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.t0 r11 = r0.p(r4, r5)
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r3.z0()
            r6 = 0
            if (r4 != 0) goto L3c
            r15 = r6
            goto L41
        L3c:
            kotlin.reflect.jvm.internal.impl.types.t0 r5 = r0.p(r4, r5)
            r15 = r5
        L41:
            if (r11 != 0) goto L44
            return r6
        L44:
            kotlin.reflect.jvm.internal.impl.types.t0 r5 = r3.getType()
            if (r11 != r5) goto L4c
            if (r4 == r15) goto L52
        L4c:
            if (r23 == 0) goto L52
            r4 = 0
            r5 = 1
            r23[r4] = r5
        L52:
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.u0.b
            if (r4 == 0) goto L65
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.impl.u0$b r4 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.u0.b) r4
            java.util.List r4 = r4.L0()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s$b r5 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.s$b
            r5.<init>(r4)
            r17 = r5
            goto L67
        L65:
            r17 = r6
        L67:
            if (r21 == 0) goto L6b
            r7 = r6
            goto L6c
        L6b:
            r7 = r3
        L6c:
            int r8 = r3.getIndex()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r9 = r3.getAnnotations()
            kotlin.reflect.jvm.internal.impl.name.f r10 = r3.getName()
            boolean r12 = r3.Q()
            boolean r13 = r3.w0()
            boolean r14 = r3.u0()
            if (r22 == 0) goto L8f
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r3 = r3.getSource()
        L8a:
            r6 = r18
            r16 = r3
            goto L92
        L8f:
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r3 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            goto L8a
        L92:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.u0 r3 = kotlin.reflect.jvm.internal.impl.descriptors.impl.u0.G0(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.add(r3)
            goto L1d
        L9a:
            return r1
    }

    private void O0() {
            r1 = this;
            kotlin.jvm.functions.Function0<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.y>> r0 = r1.z
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r0.invoke()
            java.util.Collection r0 = (java.util.Collection) r0
            r1.y = r0
            r0 = 0
            r1.z = r0
        Lf:
            return
    }

    private static /* synthetic */ void T(int r7) {
            switch(r7) {
                case 9: goto L6;
                case 10: goto L3;
                case 11: goto L3;
                case 12: goto L3;
                case 13: goto L6;
                case 14: goto L6;
                case 15: goto L6;
                case 16: goto L6;
                case 17: goto L3;
                case 18: goto L6;
                case 19: goto L6;
                case 20: goto L6;
                case 21: goto L6;
                case 22: goto L3;
                case 23: goto L6;
                case 24: goto L3;
                case 25: goto L3;
                case 26: goto L6;
                case 27: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L8
        L6:
            java.lang.String r0 = "@NotNull method %s.%s must not return null"
        L8:
            r1 = 2
            switch(r7) {
                case 9: goto Le;
                case 10: goto Lc;
                case 11: goto Lc;
                case 12: goto Lc;
                case 13: goto Le;
                case 14: goto Le;
                case 15: goto Le;
                case 16: goto Le;
                case 17: goto Lc;
                case 18: goto Le;
                case 19: goto Le;
                case 20: goto Le;
                case 21: goto Le;
                case 22: goto Lc;
                case 23: goto Le;
                case 24: goto Lc;
                case 25: goto Lc;
                case 26: goto Le;
                case 27: goto Le;
                default: goto Lc;
            }
        Lc:
            r2 = 3
            goto Lf
        Le:
            r2 = 2
        Lf:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl"
            r4 = 0
            switch(r7) {
                case 1: goto L60;
                case 2: goto L5b;
                case 3: goto L56;
                case 4: goto L51;
                case 5: goto L4c;
                case 6: goto L47;
                case 7: goto L42;
                case 8: goto L3d;
                case 9: goto L3a;
                case 10: goto L3d;
                case 11: goto L35;
                case 12: goto L30;
                case 13: goto L3a;
                case 14: goto L3a;
                case 15: goto L3a;
                case 16: goto L3a;
                case 17: goto L2b;
                case 18: goto L3a;
                case 19: goto L3a;
                case 20: goto L3a;
                case 21: goto L3a;
                case 22: goto L26;
                case 23: goto L3a;
                case 24: goto L21;
                case 25: goto L1c;
                case 26: goto L3a;
                case 27: goto L3a;
                case 28: goto L42;
                case 29: goto L21;
                case 30: goto L42;
                case 31: goto L21;
                default: goto L17;
            }
        L17:
            java.lang.String r5 = "containingDeclaration"
            r2[r4] = r5
            goto L64
        L1c:
            java.lang.String r5 = "configuration"
            r2[r4] = r5
            goto L64
        L21:
            java.lang.String r5 = "substitutor"
            r2[r4] = r5
            goto L64
        L26:
            java.lang.String r5 = "originalSubstitutor"
            r2[r4] = r5
            goto L64
        L2b:
            java.lang.String r5 = "overriddenDescriptors"
            r2[r4] = r5
            goto L64
        L30:
            java.lang.String r5 = "extensionReceiverParameter"
            r2[r4] = r5
            goto L64
        L35:
            java.lang.String r5 = "unsubstitutedReturnType"
            r2[r4] = r5
            goto L64
        L3a:
            r2[r4] = r3
            goto L64
        L3d:
            java.lang.String r5 = "visibility"
            r2[r4] = r5
            goto L64
        L42:
            java.lang.String r5 = "unsubstitutedValueParameters"
            r2[r4] = r5
            goto L64
        L47:
            java.lang.String r5 = "typeParameters"
            r2[r4] = r5
            goto L64
        L4c:
            java.lang.String r5 = "contextReceiverParameters"
            r2[r4] = r5
            goto L64
        L51:
            java.lang.String r5 = "source"
            r2[r4] = r5
            goto L64
        L56:
            java.lang.String r5 = "kind"
            r2[r4] = r5
            goto L64
        L5b:
            java.lang.String r5 = "name"
            r2[r4] = r5
            goto L64
        L60:
            java.lang.String r5 = "annotations"
            r2[r4] = r5
        L64:
            java.lang.String r4 = "initialize"
            java.lang.String r5 = "newCopyBuilder"
            r6 = 1
            switch(r7) {
                case 9: goto La4;
                case 10: goto L6c;
                case 11: goto L6c;
                case 12: goto L6c;
                case 13: goto L9f;
                case 14: goto L9a;
                case 15: goto L95;
                case 16: goto L90;
                case 17: goto L6c;
                case 18: goto L8b;
                case 19: goto L86;
                case 20: goto L81;
                case 21: goto L7c;
                case 22: goto L6c;
                case 23: goto L79;
                case 24: goto L6c;
                case 25: goto L6c;
                case 26: goto L74;
                case 27: goto L6f;
                default: goto L6c;
            }
        L6c:
            r2[r6] = r3
            goto La6
        L6f:
            java.lang.String r3 = "getSourceToUseForCopy"
            r2[r6] = r3
            goto La6
        L74:
            java.lang.String r3 = "copy"
            r2[r6] = r3
            goto La6
        L79:
            r2[r6] = r5
            goto La6
        L7c:
            java.lang.String r3 = "getKind"
            r2[r6] = r3
            goto La6
        L81:
            java.lang.String r3 = "getOriginal"
            r2[r6] = r3
            goto La6
        L86:
            java.lang.String r3 = "getValueParameters"
            r2[r6] = r3
            goto La6
        L8b:
            java.lang.String r3 = "getTypeParameters"
            r2[r6] = r3
            goto La6
        L90:
            java.lang.String r3 = "getVisibility"
            r2[r6] = r3
            goto La6
        L95:
            java.lang.String r3 = "getModality"
            r2[r6] = r3
            goto La6
        L9a:
            java.lang.String r3 = "getOverriddenDescriptors"
            r2[r6] = r3
            goto La6
        L9f:
            java.lang.String r3 = "getContextReceiverParameters"
            r2[r6] = r3
            goto La6
        La4:
            r2[r6] = r4
        La6:
            switch(r7) {
                case 5: goto Ld4;
                case 6: goto Ld4;
                case 7: goto Ld4;
                case 8: goto Ld4;
                case 9: goto Ld6;
                case 10: goto Lcf;
                case 11: goto Lca;
                case 12: goto Lc5;
                case 13: goto Ld6;
                case 14: goto Ld6;
                case 15: goto Ld6;
                case 16: goto Ld6;
                case 17: goto Lc0;
                case 18: goto Ld6;
                case 19: goto Ld6;
                case 20: goto Ld6;
                case 21: goto Ld6;
                case 22: goto Lbb;
                case 23: goto Ld6;
                case 24: goto Lb8;
                case 25: goto Lb3;
                case 26: goto Ld6;
                case 27: goto Ld6;
                case 28: goto Lae;
                case 29: goto Lae;
                case 30: goto Lae;
                case 31: goto Lae;
                default: goto La9;
            }
        La9:
            java.lang.String r3 = "<init>"
            r2[r1] = r3
            goto Ld6
        Lae:
            java.lang.String r3 = "getSubstitutedValueParameters"
            r2[r1] = r3
            goto Ld6
        Lb3:
            java.lang.String r3 = "doSubstitute"
            r2[r1] = r3
            goto Ld6
        Lb8:
            r2[r1] = r5
            goto Ld6
        Lbb:
            java.lang.String r3 = "substitute"
            r2[r1] = r3
            goto Ld6
        Lc0:
            java.lang.String r3 = "setOverriddenDescriptors"
            r2[r1] = r3
            goto Ld6
        Lc5:
            java.lang.String r3 = "setExtensionReceiverParameter"
            r2[r1] = r3
            goto Ld6
        Lca:
            java.lang.String r3 = "setReturnType"
            r2[r1] = r3
            goto Ld6
        Lcf:
            java.lang.String r3 = "setVisibility"
            r2[r1] = r3
            goto Ld6
        Ld4:
            r2[r1] = r4
        Ld6:
            java.lang.String r0 = java.lang.String.format(r0, r2)
            switch(r7) {
                case 9: goto Le3;
                case 10: goto Ldd;
                case 11: goto Ldd;
                case 12: goto Ldd;
                case 13: goto Le3;
                case 14: goto Le3;
                case 15: goto Le3;
                case 16: goto Le3;
                case 17: goto Ldd;
                case 18: goto Le3;
                case 19: goto Le3;
                case 20: goto Le3;
                case 21: goto Le3;
                case 22: goto Ldd;
                case 23: goto Le3;
                case 24: goto Ldd;
                case 25: goto Ldd;
                case 26: goto Le3;
                case 27: goto Le3;
                default: goto Ldd;
            }
        Ldd:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r0)
            goto Le8
        Le3:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r0)
        Le8:
            throw r7
    }

    private void V0(boolean r1) {
            r0 = this;
            r0.u = r1
            return
    }

    private void W0(boolean r1) {
            r0 = this;
            r0.t = r1
            return
    }

    private void Y0(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.y r1) {
            r0 = this;
            r0.C = r1
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> A0() {
            r2 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> r0 = r2.h
            if (r0 != 0) goto L9
            r1 = 13
            T(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y
    public boolean D0() {
            r1 = this;
            boolean r0 = r1.t
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.y F0(kotlin.reflect.jvm.internal.impl.descriptors.k r2, kotlin.reflect.jvm.internal.impl.descriptors.Modality r3, kotlin.reflect.jvm.internal.impl.descriptors.s r4, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r5, boolean r6) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r0 = r1.n()
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r2 = r0.r(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r2 = r2.q(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r2 = r2.p(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r2 = r2.s(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r2 = r2.j(r6)
            kotlin.reflect.jvm.internal.impl.descriptors.y r2 = r2.build()
            if (r2 != 0) goto L23
            r3 = 26
            T(r3)
        L23:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    protected abstract kotlin.reflect.jvm.internal.impl.descriptors.impl.s G0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.y r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r6);

    @org.jetbrains.annotations.Nullable
    protected kotlin.reflect.jvm.internal.impl.descriptors.y H0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c r20) {
            r19 = this;
            r0 = r19
            r7 = r20
            if (r7 != 0) goto Lb
            r1 = 25
            T(r1)
        Lb:
            r8 = 1
            boolean[] r9 = new boolean[r8]
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c.v(r7)
            if (r1 == 0) goto L22
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r0.getAnnotations()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c.v(r7)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.i.a(r1, r2)
        L20:
            r5 = r1
            goto L27
        L22:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r0.getAnnotations()
            goto L20
        L27:
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r7.b
            kotlin.reflect.jvm.internal.impl.descriptors.y r2 = r7.e
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r3 = r7.f
            kotlin.reflect.jvm.internal.impl.name.f r4 = r7.l
            boolean r6 = r7.o
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r6 = r0.I0(r6, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s r10 = r0.G0(r1, r2, r3, r4, r5, r6)
            r6 = r0
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c.w(r7)
            if (r0 != 0) goto L45
            java.util.List r0 = r6.getTypeParameters()
            goto L49
        L45:
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c.w(r7)
        L49:
            r11 = 0
            boolean r1 = r9[r11]
            boolean r2 = r0.isEmpty()
            r2 = r2 ^ r8
            r1 = r1 | r2
            r9[r11] = r1
            java.util.ArrayList r14 = new java.util.ArrayList
            int r1 = r0.size()
            r14.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.f2 r1 = r7.a
            kotlin.reflect.jvm.internal.impl.types.h2 r2 = kotlin.reflect.jvm.internal.impl.types.d0.c(r0, r1, r10, r14, r9)
            r12 = 0
            if (r2 != 0) goto L67
            return r12
        L67:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> r0 = r7.h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lbc
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> r0 = r7.h
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lbc
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.z0) r3
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r3.getType()
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r2.p(r4, r5)
            if (r4 != 0) goto L94
            return r12
        L94:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r5 = r3.getValue()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f r5 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f) r5
            kotlin.reflect.jvm.internal.impl.name.f r5 = r5.a()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r15 = r3.getAnnotations()
            int r16 = r1 + 1
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r1 = kotlin.reflect.jvm.internal.impl.resolve.h.b(r10, r4, r5, r15, r1)
            r13.add(r1)
            boolean r1 = r9[r11]
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r3.getType()
            if (r4 == r3) goto Lb5
            r3 = 1
            goto Lb6
        Lb5:
            r3 = 0
        Lb6:
            r1 = r1 | r3
            r9[r11] = r1
            r1 = r16
            goto L7b
        Lbc:
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r7.i
            if (r0 == 0) goto Lf6
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.p(r0, r1)
            if (r0 != 0) goto Lcd
            return r12
        Lcd:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.n0 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.n0
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.d r3 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.d
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r4 = r7.i
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r4 = r4.getValue()
            r3.<init>(r10, r0, r4)
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r4 = r7.i
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r4.getAnnotations()
            r1.<init>(r10, r3, r4)
            boolean r3 = r9[r11]
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r4 = r7.i
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.getType()
            if (r0 == r4) goto Lef
            r0 = 1
            goto Lf0
        Lef:
            r0 = 0
        Lf0:
            r0 = r0 | r3
            r9[r11] = r0
            r11 = r1
        Lf4:
            r15 = 0
            goto Lf8
        Lf6:
            r11 = r12
            goto Lf4
        Lf8:
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r7.j
            if (r0 == 0) goto L113
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r0.c(r2)
            if (r0 != 0) goto L103
            return r12
        L103:
            boolean r1 = r9[r15]
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r3 = r7.j
            if (r0 == r3) goto L10b
            r3 = 1
            goto L10c
        L10b:
            r3 = 0
        L10c:
            r1 = r1 | r3
            r9[r15] = r1
            r16 = r12
            r12 = r0
            goto L115
        L113:
            r16 = r12
        L115:
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r1 = r7.g
            boolean r3 = r7.p
            boolean r4 = r7.o
            r5 = r9
            r0 = r10
            java.util.List r1 = K0(r0, r1, r2, r3, r4, r5)
            if (r1 != 0) goto L124
            return r16
        L124:
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r7.k
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r2.p(r3, r4)
            if (r3 != 0) goto L12f
            return r16
        L12f:
            boolean r4 = r5[r15]
            kotlin.reflect.jvm.internal.impl.types.t0 r9 = r7.k
            if (r3 == r9) goto L137
            r9 = 1
            goto L138
        L137:
            r9 = 0
        L138:
            r4 = r4 | r9
            r5[r15] = r4
            if (r4 != 0) goto L142
            boolean r4 = r7.w
            if (r4 == 0) goto L142
            return r6
        L142:
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = r7.c
            kotlin.reflect.jvm.internal.impl.descriptors.s r5 = r7.d
            r10 = r0
            r15 = r1
            r16 = r3
            r17 = r4
            r18 = r5
            r10.M0(r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r1 = r6.m
            r0.a1(r1)
            boolean r1 = r6.n
            r0.X0(r1)
            boolean r1 = r6.o
            r0.S0(r1)
            boolean r1 = r6.p
            r0.Z0(r1)
            boolean r1 = r6.q
            r0.d1(r1)
            boolean r1 = r6.v
            r0.c1(r1)
            boolean r1 = r6.r
            r0.R0(r1)
            boolean r1 = r6.s
            r0.Q0(r1)
            boolean r1 = r6.w
            r0.T0(r1)
            boolean r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c.x(r7)
            r0.W0(r1)
            boolean r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c.y(r7)
            r0.V0(r1)
            java.lang.Boolean r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c.z(r7)
            if (r1 == 0) goto L19b
            java.lang.Boolean r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c.z(r7)
            boolean r1 = r1.booleanValue()
            goto L19d
        L19b:
            boolean r1 = r6.x
        L19d:
            r0.U0(r1)
            java.util.Map r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c.A(r7)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1ae
            java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.a$a<?>, java.lang.Object> r1 = r6.D
            if (r1 == 0) goto L207
        L1ae:
            java.util.Map r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c.A(r7)
            java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.a$a<?>, java.lang.Object> r3 = r6.D
            if (r3 == 0) goto L1e0
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1be:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1e0
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            boolean r5 = r1.containsKey(r5)
            if (r5 != 0) goto L1be
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            r1.put(r5, r4)
            goto L1be
        L1e0:
            int r3 = r1.size()
            if (r3 != r8) goto L205
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r3 = r3.next()
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            java.util.Map r1 = java.util.Collections.singletonMap(r3, r1)
            r0.D = r1
            goto L207
        L205:
            r0.D = r1
        L207:
            boolean r1 = r7.n
            if (r1 != 0) goto L211
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r6.x0()
            if (r1 == 0) goto L224
        L211:
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r6.x0()
            if (r1 == 0) goto L21c
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r6.x0()
            goto L21d
        L21c:
            r1 = r6
        L21d:
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r1.c(r2)
            r0.Y0(r1)
        L224:
            boolean r1 = r7.m
            if (r1 == 0) goto L254
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r6.a()
            java.util.Collection r1 = r1.e()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L254
            kotlin.reflect.jvm.internal.impl.types.f2 r1 = r7.a
            boolean r1 = r1.f()
            if (r1 == 0) goto L24d
            kotlin.jvm.functions.Function0<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.y>> r1 = r6.z
            if (r1 == 0) goto L245
            r0.z = r1
            return r0
        L245:
            java.util.Collection r1 = r6.e()
            r0.R(r1)
            return r0
        L24d:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s$a r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.s$a
            r1.<init>(r6, r2)
            r0.z = r1
        L254:
            return r0
    }

    public boolean L0() {
            r1 = this;
            boolean r0 = r1.w
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.s M0(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.z0 r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.z0 r3, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> r4, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r5, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r6, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r7, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.Modality r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r9) {
            r1 = this;
            if (r4 != 0) goto L6
            r0 = 5
            T(r0)
        L6:
            if (r5 != 0) goto Lc
            r0 = 6
            T(r0)
        Lc:
            if (r6 != 0) goto L12
            r0 = 7
            T(r0)
        L12:
            if (r9 != 0) goto L19
            r0 = 8
            T(r0)
        L19:
            java.util.List r0 = kotlin.collections.f0.a6(r5)
            r1.e = r0
            java.util.List r0 = kotlin.collections.f0.a6(r6)
            r1.f = r0
            r1.g = r7
            r1.k = r8
            r1.l = r9
            r1.i = r2
            r1.j = r3
            r1.h = r4
            r2 = 0
            r3 = 0
        L33:
            int r4 = r5.size()
            java.lang.String r7 = " but position is "
            if (r3 >= r4) goto L6e
            java.lang.Object r4 = r5.get(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r4
            int r8 = r4.getIndex()
            if (r8 != r3) goto L4a
            int r3 = r3 + 1
            goto L33
        L4a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r6 = " index is "
            r5.append(r6)
            int r4 = r4.getIndex()
            r5.append(r4)
            r5.append(r7)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.<init>(r3)
            throw r2
        L6e:
            int r3 = r6.size()
            if (r2 >= r3) goto La7
            java.lang.Object r3 = r6.get(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r3
            int r4 = r3.getIndex()
            if (r4 != r2) goto L83
            int r2 = r2 + 1
            goto L6e
        L83:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r6 = "index is "
            r5.append(r6)
            int r3 = r3.getIndex()
            r5.append(r3)
            r5.append(r7)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            throw r4
        La7:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public <V> V N(kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<V> r2) {
            r1 = this;
            java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.a$a<?>, java.lang.Object> r0 = r1.D
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c N0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r14) {
            r13 = this;
            if (r14 != 0) goto L7
            r0 = 24
            T(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c
            kotlin.reflect.jvm.internal.impl.types.f2 r3 = r14.j()
            kotlin.reflect.jvm.internal.impl.descriptors.k r4 = r13.b()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r5 = r13.i()
            kotlin.reflect.jvm.internal.impl.descriptors.s r6 = r13.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r7 = r13.h()
            java.util.List r8 = r13.g()
            java.util.List r9 = r13.A0()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r10 = r13.f0()
            kotlin.reflect.jvm.internal.impl.types.t0 r11 = r13.getReturnType()
            r12 = 0
            r2 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
    }

    public <V> void P0(kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<V> r2, java.lang.Object r3) {
            r1 = this;
            java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.a$a<?>, java.lang.Object> r0 = r1.D
            if (r0 != 0) goto Lb
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.D = r0
        Lb:
            java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.a$a<?>, java.lang.Object> r0 = r1.D
            r0.put(r2, r3)
            return
    }

    public void Q0(boolean r1) {
            r0 = this;
            r0.s = r1
            return
    }

    public void R(@org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 17
            T(r0)
        L7:
            r1.y = r2
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r0
            boolean r0 = r0.S()
            if (r0 == 0) goto Ld
            r2 = 1
            r1.u = r2
        L22:
            return
    }

    public void R0(boolean r1) {
            r0 = this;
            r0.r = r1
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y
    public boolean S() {
            r1 = this;
            boolean r0 = r1.u
            return r0
    }

    public void S0(boolean r1) {
            r0 = this;
            r0.o = r1
            return
    }

    public void T0(boolean r1) {
            r0 = this;
            r0.w = r1
            return
    }

    public void U0(boolean r1) {
            r0 = this;
            r0.x = r1
            return
    }

    public <R, D> R W(kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> r1, D r2) {
            r0 = this;
            java.lang.Object r1 = r1.l(r0, r2)
            return r1
    }

    public void X0(boolean r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public void Z0(boolean r1) {
            r0 = this;
            r0.p = r1
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.y a() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r2.A
            if (r0 != r2) goto L6
            r0 = r2
            goto La
        L6:
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r0.a()
        La:
            if (r0 != 0) goto L11
            r1 = 20
            T(r1)
        L11:
            return r0
    }

    public void a1(boolean r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public void b1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 11
            T(r0)
        L7:
            r1.g = r2
            return
    }

    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.l c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r0.c(r1)
            return r1
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.y c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 22
            T(r0)
        L7:
            boolean r0 = r2.k()
            if (r0 == 0) goto Le
            return r1
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r2 = r1.N0(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r1.a()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r2 = r2.N(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r2 = r2.P()
            r0 = 1
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r2 = r2.J(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.y r2 = r2.build()
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.z0 c0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r1.j
            return r0
    }

    public void c1(boolean r1) {
            r0 = this;
            r0.v = r1
            return
    }

    public void d1(boolean r1) {
            r0 = this;
            r0.q = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.y> e() {
            r2 = this;
            r2.O0()
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.y> r0 = r2.y
            if (r0 == 0) goto L8
            goto La
        L8:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        La:
            if (r0 != 0) goto L11
            r1 = 14
            T(r1)
        L11:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor e0(kotlin.reflect.jvm.internal.impl.descriptors.k r1, kotlin.reflect.jvm.internal.impl.descriptors.Modality r2, kotlin.reflect.jvm.internal.impl.descriptors.s r3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r4, boolean r5) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r0.F0(r1, r2, r3, r4, r5)
            return r1
    }

    public void e1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 10
            T(r0)
        L7:
            r1.l = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.z0 f0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r1.i
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> g() {
            r2 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r0 = r2.f
            if (r0 != 0) goto L9
            r1 = 19
            T(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public kotlin.reflect.jvm.internal.impl.types.t0 getReturnType() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.g
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> getTypeParameters() {
            r3 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r0 = r3.e
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "typeParameters == null for "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = r2.l
            if (r0 != 0) goto L9
            r1 = 16
            T(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind h() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r0 = r2.B
            if (r0 != 0) goto L9
            r1 = 21
            T(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality i() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r2.k
            if (r0 != 0) goto L9
            r1 = 15
            T(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean i0() {
            r1 = this;
            boolean r0 = r1.s
            return r0
    }

    public boolean isExternal() {
            r1 = this;
            boolean r0 = r1.o
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y
    public boolean isInfix() {
            r3 = this;
            boolean r0 = r3.n
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r3.a()
            java.util.Collection r0 = r0.e()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.y r2 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r2
            boolean r2 = r2.isInfix()
            if (r2 == 0) goto L12
            return r1
        L25:
            r0 = 0
            return r0
    }

    public boolean isInline() {
            r1 = this;
            boolean r0 = r1.p
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y
    public boolean isOperator() {
            r3 = this;
            boolean r0 = r3.m
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r3.a()
            java.util.Collection r0 = r0.e()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.y r2 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r2
            boolean r2 = r2.isOperator()
            if (r2 == 0) goto L12
            return r1
        L25:
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y
    public boolean isSuspend() {
            r1 = this;
            boolean r0 = r1.v
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.y.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.y> n() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = kotlin.reflect.jvm.internal.impl.types.h2.b
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r0 = r2.N0(r0)
            if (r0 != 0) goto Ld
            r1 = 23
            T(r1)
        Ld:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean n0() {
            r1 = this;
            boolean r0 = r1.x
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.n p0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean q0() {
            r1 = this;
            boolean r0 = r1.r
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.y x0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r1.C
            return r0
    }

    public boolean y() {
            r1 = this;
            boolean r0 = r1.q
            return r0
    }
}
