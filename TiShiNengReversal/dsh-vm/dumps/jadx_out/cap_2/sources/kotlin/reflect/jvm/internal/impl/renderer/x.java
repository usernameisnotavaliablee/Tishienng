package kotlin.reflect.jvm.internal.impl.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDescriptorRendererOptionsImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorRendererOptionsImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererOptionsImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,137:1\n1#2:138\n51#3,3:139\n*S KotlinDebug\n*F\n+ 1 DescriptorRendererOptionsImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererOptionsImpl\n*L\n60#1:139,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class x implements kotlin.reflect.jvm.internal.impl.renderer.u {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] Z = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f A;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f B;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f C;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f D;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f E;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f F;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f G;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f H;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f I;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f J;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f K;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f L;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f M;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f N;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f O;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f P;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f Q;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f R;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f S;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f T;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f U;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f V;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f W;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f X;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f Y;
    private boolean a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f e;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f f;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f g;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f h;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f i;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f j;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f k;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f l;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f m;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f n;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f o;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f p;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f q;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f r;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f s;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f t;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f u;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f v;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f w;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f x;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f y;

    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.f z;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$vetoable$1\n+ 2 DescriptorRendererOptionsImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererOptionsImpl\n*L\n1#1,73:1\n61#2,6:74\n*E\n"})
    public static final class a<T> extends kotlin.properties.c<T> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.x b;

        public a(java.lang.Object r1, kotlin.reflect.jvm.internal.impl.renderer.x r2) {
                r0 = this;
                r0.b = r2
                r0.<init>(r1)
                return
        }

        @Override // kotlin.properties.c
        protected boolean d(kotlin.reflect.n<?> r1, T r2, T r3) {
                r0 = this;
                java.lang.String r2 = "property"
                kotlin.jvm.internal.g0.p(r1, r2)
                kotlin.reflect.jvm.internal.impl.renderer.x r1 = r0.b
                boolean r1 = r1.q0()
                if (r1 != 0) goto Lf
                r1 = 1
                return r1
            Lf:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Cannot modify readonly DescriptorRendererOptions"
                r1.<init>(r2)
                throw r1
        }
    }

    static {
            kotlin.jvm.internal.MutablePropertyReference1Impl r0 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.impl.renderer.x> r1 = kotlin.reflect.jvm.internal.impl.renderer.x.class
            java.lang.String r2 = "classifierNamePolicy"
            java.lang.String r3 = "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r0)
            kotlin.jvm.internal.MutablePropertyReference1Impl r2 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r3 = "withDefinedIn"
            java.lang.String r5 = "getWithDefinedIn()Z"
            r2.<init>(r1, r3, r5, r4)
            kotlin.reflect.l r2 = kotlin.jvm.internal.o0.k(r2)
            kotlin.jvm.internal.MutablePropertyReference1Impl r3 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r5 = "withSourceFileForTopLevel"
            java.lang.String r6 = "getWithSourceFileForTopLevel()Z"
            r3.<init>(r1, r5, r6, r4)
            kotlin.reflect.l r3 = kotlin.jvm.internal.o0.k(r3)
            kotlin.jvm.internal.MutablePropertyReference1Impl r5 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r6 = "modifiers"
            java.lang.String r7 = "getModifiers()Ljava/util/Set;"
            r5.<init>(r1, r6, r7, r4)
            kotlin.reflect.l r5 = kotlin.jvm.internal.o0.k(r5)
            kotlin.jvm.internal.MutablePropertyReference1Impl r6 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r7 = "startFromName"
            java.lang.String r8 = "getStartFromName()Z"
            r6.<init>(r1, r7, r8, r4)
            kotlin.reflect.l r6 = kotlin.jvm.internal.o0.k(r6)
            kotlin.jvm.internal.MutablePropertyReference1Impl r7 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r8 = "startFromDeclarationKeyword"
            java.lang.String r9 = "getStartFromDeclarationKeyword()Z"
            r7.<init>(r1, r8, r9, r4)
            kotlin.reflect.l r7 = kotlin.jvm.internal.o0.k(r7)
            kotlin.jvm.internal.MutablePropertyReference1Impl r8 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r9 = "debugMode"
            java.lang.String r10 = "getDebugMode()Z"
            r8.<init>(r1, r9, r10, r4)
            kotlin.reflect.l r8 = kotlin.jvm.internal.o0.k(r8)
            kotlin.jvm.internal.MutablePropertyReference1Impl r9 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r10 = "classWithPrimaryConstructor"
            java.lang.String r11 = "getClassWithPrimaryConstructor()Z"
            r9.<init>(r1, r10, r11, r4)
            kotlin.reflect.l r9 = kotlin.jvm.internal.o0.k(r9)
            kotlin.jvm.internal.MutablePropertyReference1Impl r10 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r11 = "verbose"
            java.lang.String r12 = "getVerbose()Z"
            r10.<init>(r1, r11, r12, r4)
            kotlin.reflect.l r10 = kotlin.jvm.internal.o0.k(r10)
            kotlin.jvm.internal.MutablePropertyReference1Impl r11 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r12 = "unitReturnType"
            java.lang.String r13 = "getUnitReturnType()Z"
            r11.<init>(r1, r12, r13, r4)
            kotlin.reflect.l r11 = kotlin.jvm.internal.o0.k(r11)
            kotlin.jvm.internal.MutablePropertyReference1Impl r12 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r13 = "withoutReturnType"
            java.lang.String r14 = "getWithoutReturnType()Z"
            r12.<init>(r1, r13, r14, r4)
            kotlin.reflect.l r12 = kotlin.jvm.internal.o0.k(r12)
            kotlin.jvm.internal.MutablePropertyReference1Impl r13 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r14 = "enhancedTypes"
            java.lang.String r15 = "getEnhancedTypes()Z"
            r13.<init>(r1, r14, r15, r4)
            kotlin.reflect.l r13 = kotlin.jvm.internal.o0.k(r13)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "normalizedVisibilities"
            r16 = r0
            java.lang.String r0 = "getNormalizedVisibilities()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "renderDefaultVisibility"
            r17 = r0
            java.lang.String r0 = "getRenderDefaultVisibility()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "renderDefaultModality"
            r18 = r0
            java.lang.String r0 = "getRenderDefaultModality()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "renderConstructorDelegation"
            r19 = r0
            java.lang.String r0 = "getRenderConstructorDelegation()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "renderPrimaryConstructorParametersAsProperties"
            r20 = r0
            java.lang.String r0 = "getRenderPrimaryConstructorParametersAsProperties()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "actualPropertiesInPrimaryConstructor"
            r21 = r0
            java.lang.String r0 = "getActualPropertiesInPrimaryConstructor()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "uninferredTypeParameterAsName"
            r22 = r0
            java.lang.String r0 = "getUninferredTypeParameterAsName()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "includePropertyConstant"
            r23 = r0
            java.lang.String r0 = "getIncludePropertyConstant()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "propertyConstantRenderer"
            r24 = r0
            java.lang.String r0 = "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "withoutTypeParameters"
            r25 = r0
            java.lang.String r0 = "getWithoutTypeParameters()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "withoutSuperTypes"
            r26 = r0
            java.lang.String r0 = "getWithoutSuperTypes()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "typeNormalizer"
            r27 = r0
            java.lang.String r0 = "getTypeNormalizer()Lkotlin/jvm/functions/Function1;"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "defaultParameterValueRenderer"
            r28 = r0
            java.lang.String r0 = "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "secondaryConstructorsAsPrimary"
            r29 = r0
            java.lang.String r0 = "getSecondaryConstructorsAsPrimary()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "overrideRenderingPolicy"
            r30 = r0
            java.lang.String r0 = "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "valueParametersHandler"
            r31 = r0
            java.lang.String r0 = "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "textFormat"
            r32 = r0
            java.lang.String r0 = "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "parameterNameRenderingPolicy"
            r33 = r0
            java.lang.String r0 = "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "receiverAfterName"
            r34 = r0
            java.lang.String r0 = "getReceiverAfterName()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "renderCompanionObjectName"
            r35 = r0
            java.lang.String r0 = "getRenderCompanionObjectName()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "propertyAccessorRenderingPolicy"
            r36 = r0
            java.lang.String r0 = "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "renderDefaultAnnotationArguments"
            r37 = r0
            java.lang.String r0 = "getRenderDefaultAnnotationArguments()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "eachAnnotationOnNewLine"
            r38 = r0
            java.lang.String r0 = "getEachAnnotationOnNewLine()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "excludedAnnotationClasses"
            r39 = r0
            java.lang.String r0 = "getExcludedAnnotationClasses()Ljava/util/Set;"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "excludedTypeAnnotationClasses"
            r40 = r0
            java.lang.String r0 = "getExcludedTypeAnnotationClasses()Ljava/util/Set;"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "annotationFilter"
            r41 = r0
            java.lang.String r0 = "getAnnotationFilter()Lkotlin/jvm/functions/Function1;"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "annotationArgumentsRenderingPolicy"
            r42 = r0
            java.lang.String r0 = "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "alwaysRenderModifiers"
            r43 = r0
            java.lang.String r0 = "getAlwaysRenderModifiers()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "renderConstructorKeyword"
            r44 = r0
            java.lang.String r0 = "getRenderConstructorKeyword()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "renderUnabbreviatedType"
            r45 = r0
            java.lang.String r0 = "getRenderUnabbreviatedType()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "renderTypeExpansions"
            r46 = r0
            java.lang.String r0 = "getRenderTypeExpansions()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "renderAbbreviatedTypeComments"
            r47 = r0
            java.lang.String r0 = "getRenderAbbreviatedTypeComments()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "includeAdditionalModifiers"
            r48 = r0
            java.lang.String r0 = "getIncludeAdditionalModifiers()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "parameterNamesInFunctionalTypes"
            r49 = r0
            java.lang.String r0 = "getParameterNamesInFunctionalTypes()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "renderFunctionContracts"
            r50 = r0
            java.lang.String r0 = "getRenderFunctionContracts()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "presentableUnresolvedTypes"
            r51 = r0
            java.lang.String r0 = "getPresentableUnresolvedTypes()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "boldOnlyForNamesInHtml"
            r52 = r0
            java.lang.String r0 = "getBoldOnlyForNamesInHtml()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            kotlin.jvm.internal.MutablePropertyReference1Impl r14 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r15 = "informativeErrorType"
            r53 = r0
            java.lang.String r0 = "getInformativeErrorType()Z"
            r14.<init>(r1, r15, r0, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r14)
            r1 = 50
            kotlin.reflect.n[] r1 = new kotlin.reflect.n[r1]
            r1[r4] = r16
            r4 = 1
            r1[r4] = r2
            r2 = 2
            r1[r2] = r3
            r2 = 3
            r1[r2] = r5
            r2 = 4
            r1[r2] = r6
            r2 = 5
            r1[r2] = r7
            r2 = 6
            r1[r2] = r8
            r2 = 7
            r1[r2] = r9
            r2 = 8
            r1[r2] = r10
            r2 = 9
            r1[r2] = r11
            r2 = 10
            r1[r2] = r12
            r2 = 11
            r1[r2] = r13
            r2 = 12
            r1[r2] = r17
            r2 = 13
            r1[r2] = r18
            r2 = 14
            r1[r2] = r19
            r2 = 15
            r1[r2] = r20
            r2 = 16
            r1[r2] = r21
            r2 = 17
            r1[r2] = r22
            r2 = 18
            r1[r2] = r23
            r2 = 19
            r1[r2] = r24
            r2 = 20
            r1[r2] = r25
            r2 = 21
            r1[r2] = r26
            r2 = 22
            r1[r2] = r27
            r2 = 23
            r1[r2] = r28
            r2 = 24
            r1[r2] = r29
            r2 = 25
            r1[r2] = r30
            r2 = 26
            r1[r2] = r31
            r2 = 27
            r1[r2] = r32
            r2 = 28
            r1[r2] = r33
            r2 = 29
            r1[r2] = r34
            r2 = 30
            r1[r2] = r35
            r2 = 31
            r1[r2] = r36
            r2 = 32
            r1[r2] = r37
            r2 = 33
            r1[r2] = r38
            r2 = 34
            r1[r2] = r39
            r2 = 35
            r1[r2] = r40
            r2 = 36
            r1[r2] = r41
            r2 = 37
            r1[r2] = r42
            r2 = 38
            r1[r2] = r43
            r2 = 39
            r1[r2] = r44
            r2 = 40
            r1[r2] = r45
            r2 = 41
            r1[r2] = r46
            r2 = 42
            r1[r2] = r47
            r2 = 43
            r1[r2] = r48
            r2 = 44
            r1[r2] = r49
            r2 = 45
            r1[r2] = r50
            r2 = 46
            r1[r2] = r51
            r2 = 47
            r1[r2] = r52
            r2 = 48
            r1[r2] = r53
            r2 = 49
            r1[r2] = r0
            kotlin.reflect.jvm.internal.impl.renderer.x.Z = r1
            return
    }

    public x() {
            r4 = this;
            r4.<init>()
            kotlin.reflect.jvm.internal.impl.renderer.a$c r0 = kotlin.reflect.jvm.internal.impl.renderer.a.c.a
            kotlin.properties.f r0 = r4.s0(r0)
            r4.b = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            kotlin.properties.f r1 = r4.s0(r0)
            r4.c = r1
            kotlin.properties.f r1 = r4.s0(r0)
            r4.d = r1
            java.util.Set<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS
            kotlin.properties.f r1 = r4.s0(r1)
            r4.e = r1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            kotlin.properties.f r2 = r4.s0(r1)
            r4.f = r2
            kotlin.properties.f r2 = r4.s0(r1)
            r4.g = r2
            kotlin.properties.f r2 = r4.s0(r1)
            r4.h = r2
            kotlin.properties.f r2 = r4.s0(r1)
            r4.i = r2
            kotlin.properties.f r2 = r4.s0(r1)
            r4.j = r2
            kotlin.properties.f r2 = r4.s0(r0)
            r4.k = r2
            kotlin.properties.f r2 = r4.s0(r1)
            r4.l = r2
            kotlin.properties.f r2 = r4.s0(r1)
            r4.m = r2
            kotlin.properties.f r2 = r4.s0(r1)
            r4.n = r2
            kotlin.properties.f r2 = r4.s0(r0)
            r4.o = r2
            kotlin.properties.f r2 = r4.s0(r0)
            r4.p = r2
            kotlin.properties.f r2 = r4.s0(r1)
            r4.q = r2
            kotlin.properties.f r2 = r4.s0(r1)
            r4.r = r2
            kotlin.properties.f r2 = r4.s0(r1)
            r4.s = r2
            kotlin.properties.f r2 = r4.s0(r1)
            r4.t = r2
            kotlin.properties.f r2 = r4.s0(r1)
            r4.u = r2
            r2 = 0
            kotlin.properties.f r3 = r4.s0(r2)
            r4.v = r3
            kotlin.properties.f r3 = r4.s0(r1)
            r4.w = r3
            kotlin.properties.f r3 = r4.s0(r1)
            r4.x = r3
            kotlin.reflect.jvm.internal.impl.renderer.v r3 = kotlin.reflect.jvm.internal.impl.renderer.v.a
            kotlin.properties.f r3 = r4.s0(r3)
            r4.y = r3
            kotlin.reflect.jvm.internal.impl.renderer.w r3 = kotlin.reflect.jvm.internal.impl.renderer.w.a
            kotlin.properties.f r3 = r4.s0(r3)
            r4.z = r3
            kotlin.properties.f r3 = r4.s0(r0)
            r4.A = r3
            kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy r3 = kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy.RENDER_OPEN
            kotlin.properties.f r3 = r4.s0(r3)
            r4.B = r3
            kotlin.reflect.jvm.internal.impl.renderer.m$b$a r3 = kotlin.reflect.jvm.internal.impl.renderer.m.b.a.a
            kotlin.properties.f r3 = r4.s0(r3)
            r4.C = r3
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r3 = kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN
            kotlin.properties.f r3 = r4.s0(r3)
            r4.D = r3
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r3 = kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.ALL
            kotlin.properties.f r3 = r4.s0(r3)
            r4.E = r3
            kotlin.properties.f r3 = r4.s0(r1)
            r4.F = r3
            kotlin.properties.f r3 = r4.s0(r1)
            r4.G = r3
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy r3 = kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.DEBUG
            kotlin.properties.f r3 = r4.s0(r3)
            r4.H = r3
            kotlin.properties.f r3 = r4.s0(r1)
            r4.I = r3
            kotlin.properties.f r3 = r4.s0(r1)
            r4.J = r3
            java.util.Set r3 = kotlin.collections.u1.k()
            kotlin.properties.f r3 = r4.s0(r3)
            r4.K = r3
            kotlin.reflect.jvm.internal.impl.renderer.y r3 = kotlin.reflect.jvm.internal.impl.renderer.y.a
            java.util.Set r3 = r3.a()
            kotlin.properties.f r3 = r4.s0(r3)
            r4.L = r3
            kotlin.properties.f r2 = r4.s0(r2)
            r4.M = r2
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy r2 = kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS
            kotlin.properties.f r2 = r4.s0(r2)
            r4.N = r2
            kotlin.properties.f r2 = r4.s0(r1)
            r4.O = r2
            kotlin.properties.f r2 = r4.s0(r0)
            r4.P = r2
            kotlin.properties.f r2 = r4.s0(r0)
            r4.Q = r2
            kotlin.properties.f r2 = r4.s0(r1)
            r4.R = r2
            kotlin.properties.f r2 = r4.s0(r1)
            r4.S = r2
            kotlin.properties.f r2 = r4.s0(r0)
            r4.T = r2
            kotlin.properties.f r2 = r4.s0(r0)
            r4.U = r2
            kotlin.properties.f r2 = r4.s0(r1)
            r4.V = r2
            kotlin.properties.f r2 = r4.s0(r1)
            r4.W = r2
            kotlin.properties.f r1 = r4.s0(r1)
            r4.X = r1
            kotlin.properties.f r0 = r4.s0(r0)
            r4.Y = r0
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 r(kotlin.reflect.jvm.internal.impl.types.t0 r0) {
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = t0(r0)
            return r0
    }

    static /* synthetic */ java.lang.String s(kotlin.reflect.jvm.internal.impl.descriptors.q1 r0) {
            java.lang.String r0 = u(r0)
            return r0
    }

    private final <T> kotlin.properties.f<kotlin.reflect.jvm.internal.impl.renderer.x, T> s0(T r2) {
            r1 = this;
            kotlin.properties.a r0 = kotlin.properties.a.a
            kotlin.reflect.jvm.internal.impl.renderer.x$a r0 = new kotlin.reflect.jvm.internal.impl.renderer.x$a
            r0.<init>(r2, r1)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.types.t0 t0(kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    private static final java.lang.String u(kotlin.reflect.jvm.internal.impl.descriptors.q1 r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r1 = "..."
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.renderer.a A() {
            r3 = this;
            kotlin.properties.f r0 = r3.b
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            kotlin.reflect.jvm.internal.impl.renderer.a r0 = (kotlin.reflect.jvm.internal.impl.renderer.a) r0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.q1, java.lang.String> B() {
            r3 = this;
            kotlin.properties.f r0 = r3.z
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 24
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            return r0
    }

    public boolean C() {
            r3 = this;
            kotlin.properties.f r0 = r3.J
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 34
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.c> D() {
            r3 = this;
            kotlin.properties.f r0 = r3.K
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 35
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.util.Set r0 = (java.util.Set) r0
            return r0
    }

    public boolean E() {
            r3 = this;
            kotlin.properties.f r0 = r3.T
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 44
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean F() {
            r1 = this;
            boolean r0 = kotlin.reflect.jvm.internal.impl.renderer.u.a.a(r1)
            return r0
    }

    public boolean G() {
            r1 = this;
            boolean r0 = kotlin.reflect.jvm.internal.impl.renderer.u.a.b(r1)
            return r0
    }

    public boolean H() {
            r3 = this;
            kotlin.properties.f r0 = r3.u
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 19
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean I() {
            r3 = this;
            kotlin.properties.f r0 = r3.Y
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 49
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> J() {
            r3 = this;
            kotlin.properties.f r0 = r3.e
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 3
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.util.Set r0 = (java.util.Set) r0
            return r0
    }

    public boolean K() {
            r3 = this;
            kotlin.properties.f r0 = r3.n
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 12
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy L() {
            r3 = this;
            kotlin.properties.f r0 = r3.B
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 26
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy r0 = (kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy M() {
            r3 = this;
            kotlin.properties.f r0 = r3.E
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 29
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r0 = (kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy) r0
            return r0
    }

    public boolean N() {
            r3 = this;
            kotlin.properties.f r0 = r3.U
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 45
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean O() {
            r3 = this;
            kotlin.properties.f r0 = r3.W
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 47
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy P() {
            r3 = this;
            kotlin.properties.f r0 = r3.H
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 32
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy r0 = (kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy) r0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>, java.lang.String> Q() {
            r3 = this;
            kotlin.properties.f r0 = r3.v
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 20
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            return r0
    }

    public boolean R() {
            r3 = this;
            kotlin.properties.f r0 = r3.F
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 30
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean S() {
            r3 = this;
            kotlin.properties.f r0 = r3.S
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 43
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean T() {
            r3 = this;
            kotlin.properties.f r0 = r3.G
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 31
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean U() {
            r3 = this;
            kotlin.properties.f r0 = r3.q
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 15
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean V() {
            r3 = this;
            kotlin.properties.f r0 = r3.P
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 40
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean W() {
            r3 = this;
            kotlin.properties.f r0 = r3.I
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 33
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean X() {
            r3 = this;
            kotlin.properties.f r0 = r3.p
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 14
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean Y() {
            r3 = this;
            kotlin.properties.f r0 = r3.o
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 13
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean Z() {
            r3 = this;
            kotlin.properties.f r0 = r3.r
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 16
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r4) {
            r3 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.properties.f r0 = r3.E
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 29
            r1 = r1[r2]
            r0.b(r3, r1, r4)
            return
    }

    public boolean a0() {
            r3 = this;
            kotlin.properties.f r0 = r3.R
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 42
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public boolean b() {
            r3 = this;
            kotlin.properties.f r0 = r3.m
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 11
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean b0() {
            r3 = this;
            kotlin.properties.f r0 = r3.Q
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 41
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.c> c() {
            r3 = this;
            kotlin.properties.f r0 = r3.L
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 36
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.util.Set r0 = (java.util.Set) r0
            return r0
    }

    public boolean c0() {
            r3 = this;
            kotlin.properties.f r0 = r3.A
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 25
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public boolean d() {
            r3 = this;
            kotlin.properties.f r0 = r3.h
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 6
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean d0() {
            r3 = this;
            kotlin.properties.f r0 = r3.g
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 5
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy e() {
            r3 = this;
            kotlin.properties.f r0 = r3.N
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 38
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy r0 = (kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy) r0
            return r0
    }

    public boolean e0() {
            r3 = this;
            kotlin.properties.f r0 = r3.f
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 4
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void f(@org.jetbrains.annotations.NotNull java.util.Set<kotlin.reflect.jvm.internal.impl.name.c> r4) {
            r3 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.properties.f r0 = r3.L
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 36
            r1 = r1[r2]
            r0.b(r3, r1, r4)
            return
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat f0() {
            r3 = this;
            kotlin.properties.f r0 = r3.D
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 28
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r0 = (kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void g(@org.jetbrains.annotations.NotNull java.util.Set<? extends kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> r4) {
            r3 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.properties.f r0 = r3.e
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 3
            r1 = r1[r2]
            r0.b(r3, r1, r4)
            return
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.t0, kotlin.reflect.jvm.internal.impl.types.t0> g0() {
            r3 = this;
            kotlin.properties.f r0 = r3.y
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 23
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void h(boolean r4) {
            r3 = this;
            kotlin.properties.f r0 = r3.h
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 6
            r1 = r1[r2]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.b(r3, r1, r4)
            return
    }

    public boolean h0() {
            r3 = this;
            kotlin.properties.f r0 = r3.t
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 18
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void i(boolean r4) {
            r3 = this;
            kotlin.properties.f r0 = r3.w
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 21
            r1 = r1[r2]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.b(r3, r1, r4)
            return
    }

    public boolean i0() {
            r3 = this;
            kotlin.properties.f r0 = r3.k
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 9
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void j(boolean r4) {
            r3 = this;
            kotlin.properties.f r0 = r3.f
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 4
            r1 = r1[r2]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.b(r3, r1, r4)
            return
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.renderer.m.b j0() {
            r3 = this;
            kotlin.properties.f r0 = r3.C
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 27
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            kotlin.reflect.jvm.internal.impl.renderer.m$b r0 = (kotlin.reflect.jvm.internal.impl.renderer.m.b) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void k(boolean r4) {
            r3 = this;
            kotlin.properties.f r0 = r3.c
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 1
            r1 = r1[r2]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.b(r3, r1, r4)
            return
    }

    public boolean k0() {
            r3 = this;
            kotlin.properties.f r0 = r3.j
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 8
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void l(boolean r4) {
            r3 = this;
            kotlin.properties.f r0 = r3.x
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 22
            r1 = r1[r2]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.b(r3, r1, r4)
            return
    }

    public boolean l0() {
            r3 = this;
            kotlin.properties.f r0 = r3.c
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 1
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void m(boolean r4) {
            r3 = this;
            kotlin.properties.f r0 = r3.F
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 30
            r1 = r1[r2]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.b(r3, r1, r4)
            return
    }

    public boolean m0() {
            r3 = this;
            kotlin.properties.f r0 = r3.d
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 2
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r4) {
            r3 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.properties.f r0 = r3.D
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 28
            r1 = r1[r2]
            r0.b(r3, r1, r4)
            return
    }

    public boolean n0() {
            r3 = this;
            kotlin.properties.f r0 = r3.l
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 10
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy r4) {
            r3 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.properties.f r0 = r3.N
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 38
            r1 = r1[r2]
            r0.b(r3, r1, r4)
            return
    }

    public boolean o0() {
            r3 = this;
            kotlin.properties.f r0 = r3.x
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 22
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.a r4) {
            r3 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.properties.f r0 = r3.b
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 0
            r1 = r1[r2]
            r0.b(r3, r1, r4)
            return
    }

    public boolean p0() {
            r3 = this;
            kotlin.properties.f r0 = r3.w
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 21
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void q(boolean r4) {
            r3 = this;
            kotlin.properties.f r0 = r3.G
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 31
            r1 = r1[r2]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.b(r3, r1, r4)
            return
    }

    public final boolean q0() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    public final void r0() {
            r1 = this;
            r0 = 1
            r1.a = r0
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void setVerbose(boolean r4) {
            r3 = this;
            kotlin.properties.f r0 = r3.j
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 8
            r1 = r1[r2]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.b(r3, r1, r4)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.renderer.x t() {
            r12 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = new kotlin.reflect.jvm.internal.impl.renderer.x
            r0.<init>()
            java.lang.Class<kotlin.reflect.jvm.internal.impl.renderer.x> r1 = kotlin.reflect.jvm.internal.impl.renderer.x.class
            java.lang.reflect.Field[] r2 = r1.getDeclaredFields()
            java.util.Iterator r2 = kotlin.jvm.internal.h.a(r2)
        Lf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9f
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            int r4 = r3.getModifiers()
            r4 = r4 & 8
            if (r4 != 0) goto Lf
            r4 = 1
            r3.setAccessible(r4)
            java.lang.Object r5 = r3.get(r12)
            boolean r6 = r5 instanceof kotlin.properties.c
            r7 = 0
            if (r6 == 0) goto L33
            kotlin.properties.c r5 = (kotlin.properties.c) r5
            goto L34
        L33:
            r5 = r7
        L34:
            if (r5 != 0) goto L37
            goto Lf
        L37:
            java.lang.String r6 = r3.getName()
            java.lang.String r8 = "getName(...)"
            kotlin.jvm.internal.g0.o(r6, r8)
            java.lang.String r9 = "is"
            r10 = 2
            r11 = 0
            kotlin.text.u.H2(r6, r9, r11, r10, r7)
            kotlin.reflect.d r6 = kotlin.jvm.internal.o0.d(r1)
            java.lang.String r7 = r3.getName()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "get"
            r9.append(r10)
            java.lang.String r10 = r3.getName()
            kotlin.jvm.internal.g0.o(r10, r8)
            int r8 = r10.length()
            if (r8 <= 0) goto L86
            char r8 = r10.charAt(r11)
            char r8 = java.lang.Character.toUpperCase(r8)
            java.lang.String r4 = r10.substring(r4)
            java.lang.String r10 = "substring(...)"
            kotlin.jvm.internal.g0.o(r4, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
        L86:
            r9.append(r10)
            java.lang.String r4 = r9.toString()
            kotlin.jvm.internal.PropertyReference1Impl r8 = new kotlin.jvm.internal.PropertyReference1Impl
            r8.<init>(r6, r7, r4)
            java.lang.Object r4 = r5.a(r12, r8)
            kotlin.properties.f r4 = r0.s0(r4)
            r3.set(r0, r4)
            goto Lf
        L9f:
            return r0
    }

    public boolean v() {
            r3 = this;
            kotlin.properties.f r0 = r3.s
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 17
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean w() {
            r3 = this;
            kotlin.properties.f r0 = r3.O
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 39
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, java.lang.Boolean> x() {
            r3 = this;
            kotlin.properties.f r0 = r3.M
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 37
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            return r0
    }

    public boolean y() {
            r3 = this;
            kotlin.properties.f r0 = r3.X
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 48
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean z() {
            r3 = this;
            kotlin.properties.f r0 = r3.i
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.renderer.x.Z
            r2 = 7
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }
}
