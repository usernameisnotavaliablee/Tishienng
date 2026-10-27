package com.bxkj.student.v2.ui.sports.v3.detail.tab;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3RecordChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3RecordChartFragment.kt\ncom/bxkj/student/v2/ui/sports/v3/detail/tab/V3RecordChartFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,259:1\n1878#2,3:260\n1878#2,3:265\n37#3,2:263\n37#3,2:268\n*S KotlinDebug\n*F\n+ 1 V3RecordChartFragment.kt\ncom/bxkj/student/v2/ui/sports/v3/detail/tab/V3RecordChartFragment\n*L\n162#1:260,3\n219#1:265,3\n191#1:263,2\n249#1:268,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3RecordChartFragment extends com.bxkj.base.v2.base.BaseFragment<com.bxkj.student.databinding.FmV3SportsChartBinding, com.bxkj.student.v2.vm.sports.record.RecordDetailVM> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$initStepChart$1", f = "V3RecordChartFragment.kt", i = {0, 1, 1, 2, 2, 2}, l = {200, 205, 210}, m = "invokeSuspend", n = {"avgStep", "avgStep", "maxStep", "avgStep", "maxStep", "stepChartModel"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        int d;
        final /* synthetic */ java.util.List<java.lang.Integer> e;
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment f;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$initStepChart$1$1", f = "V3RecordChartFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a$a, reason: collision with other inner class name */
        static final class C0164a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment b;
            final /* synthetic */ java.lang.String c;

            C0164a(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r1, java.lang.String r2, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment.a.C0164a> r3) {
                    r0 = this;
                    r0.b = r1
                    r0.c = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                    r2 = this;
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a$a r3 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a$a
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r0 = r2.b
                    java.lang.String r1 = r2.c
                    r3.<init>(r0, r1, r4)
                    return r3
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                    r0 = this;
                    kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.invoke(r1, r2)
                    return r1
            }

            public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a$a r1 = (com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment.a.C0164a) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                    r1 = this;
                    kotlin.coroutines.intrinsics.a.l()
                    int r0 = r1.a
                    if (r0 != 0) goto L1c
                    kotlin.g0.n(r2)
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r2 = r1.b
                    androidx.databinding.ViewDataBinding r2 = r2.K()
                    com.bxkj.student.databinding.FmV3SportsChartBinding r2 = (com.bxkj.student.databinding.FmV3SportsChartBinding) r2
                    android.widget.TextView r2 = r2.tvAvgStep
                    java.lang.String r0 = r1.c
                    r2.setText(r0)
                    kotlin.n1 r2 = kotlin.n1.a
                    return r2
                L1c:
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r2.<init>(r0)
                    throw r2
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$initStepChart$1$2", f = "V3RecordChartFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment b;
            final /* synthetic */ java.lang.String c;

            b(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r1, java.lang.String r2, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment.a.b> r3) {
                    r0 = this;
                    r0.b = r1
                    r0.c = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                    r2 = this;
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a$b r3 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a$b
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r0 = r2.b
                    java.lang.String r1 = r2.c
                    r3.<init>(r0, r1, r4)
                    return r3
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                    r0 = this;
                    kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.invoke(r1, r2)
                    return r1
            }

            public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a$b r1 = (com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment.a.b) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                    r1 = this;
                    kotlin.coroutines.intrinsics.a.l()
                    int r0 = r1.a
                    if (r0 != 0) goto L1c
                    kotlin.g0.n(r2)
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r2 = r1.b
                    androidx.databinding.ViewDataBinding r2 = r2.K()
                    com.bxkj.student.databinding.FmV3SportsChartBinding r2 = (com.bxkj.student.databinding.FmV3SportsChartBinding) r2
                    android.widget.TextView r2 = r2.tvBestStep
                    java.lang.String r0 = r1.c
                    r2.setText(r0)
                    kotlin.n1 r2 = kotlin.n1.a
                    return r2
                L1c:
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r2.<init>(r0)
                    throw r2
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$initStepChart$1$3", f = "V3RecordChartFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment b;
            final /* synthetic */ com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel c;

            c(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r1, com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r2, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment.a.c> r3) {
                    r0 = this;
                    r0.b = r1
                    r0.c = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                    r2 = this;
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a$c r3 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a$c
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r0 = r2.b
                    com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = r2.c
                    r3.<init>(r0, r1, r4)
                    return r3
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                    r0 = this;
                    kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.invoke(r1, r2)
                    return r1
            }

            public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a$c r1 = (com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment.a.c) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                    r1 = this;
                    kotlin.coroutines.intrinsics.a.l()
                    int r0 = r1.a
                    if (r0 != 0) goto L1c
                    kotlin.g0.n(r2)
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r2 = r1.b
                    androidx.databinding.ViewDataBinding r2 = r2.K()
                    com.bxkj.student.databinding.FmV3SportsChartBinding r2 = (com.bxkj.student.databinding.FmV3SportsChartBinding) r2
                    com.github.aachartmodel.aainfographics.aachartcreator.AAChartView r2 = r2.AAChartViewStep
                    com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r0 = r1.c
                    r2.aa_drawChartWithChartModel(r0)
                    kotlin.n1 r2 = kotlin.n1.a
                    return r2
                L1c:
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r2.<init>(r0)
                    throw r2
            }
        }

        a(java.util.List<java.lang.Integer> r1, com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r2, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment.a> r3) {
                r0 = this;
                r0.e = r1
                r0.f = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                r2 = this;
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a r3 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a
                java.util.List<java.lang.Integer> r0 = r2.e
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r1 = r2.f
                r3.<init>(r0, r1, r4)
                return r3
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a r1 = (com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r8.d
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L41
                if (r1 == r4) goto L38
                if (r1 == r3) goto L2b
                if (r1 != r2) goto L23
                java.lang.Object r0 = r8.c
                com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r0 = (com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel) r0
                java.lang.Object r0 = r8.b
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r8.a
                java.lang.String r0 = (java.lang.String) r0
                kotlin.g0.n(r9)
                goto Ld4
            L23:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L2b:
                java.lang.Object r1 = r8.b
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r3 = r8.a
                java.lang.String r3 = (java.lang.String) r3
                kotlin.g0.n(r9)
                goto La6
            L38:
                java.lang.Object r1 = r8.a
                java.lang.String r1 = (java.lang.String) r1
                kotlin.g0.n(r9)
                r9 = r1
                goto L6f
            L41:
                kotlin.g0.n(r9)
                java.util.List<java.lang.Integer> r9 = r8.e
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                double r6 = kotlin.collections.f0.Q1(r9)
                double r6 = java.lang.Math.floor(r6)
                int r9 = (int) r6
                java.lang.String r9 = java.lang.String.valueOf(r9)
                kotlinx.coroutines.p2 r1 = kotlinx.coroutines.g1.e()
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a$a r6 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a$a
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r7 = r8.f
                r6.<init>(r7, r9, r5)
                java.lang.Object r7 = kotlin.coroutines.jvm.internal.j.a(r9)
                r8.a = r7
                r8.d = r4
                java.lang.Object r1 = kotlinx.coroutines.i.h(r1, r6, r8)
                if (r1 != r0) goto L6f
                goto Ld3
            L6f:
                java.util.List<java.lang.Integer> r1 = r8.e
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Comparable r1 = kotlin.collections.f0.U3(r1)
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 == 0) goto L80
                int r1 = r1.intValue()
                goto L81
            L80:
                r1 = 0
            L81:
                java.lang.String r1 = java.lang.String.valueOf(r1)
                kotlinx.coroutines.p2 r4 = kotlinx.coroutines.g1.e()
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a$b r6 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a$b
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r7 = r8.f
                r6.<init>(r7, r1, r5)
                java.lang.Object r7 = kotlin.coroutines.jvm.internal.j.a(r9)
                r8.a = r7
                java.lang.Object r7 = kotlin.coroutines.jvm.internal.j.a(r1)
                r8.b = r7
                r8.d = r3
                java.lang.Object r3 = kotlinx.coroutines.i.h(r4, r6, r8)
                if (r3 != r0) goto La5
                goto Ld3
            La5:
                r3 = r9
            La6:
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r9 = r8.f
                java.util.List<java.lang.Integer> r4 = r8.e
                com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r9 = com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment.h(r9, r4)
                kotlinx.coroutines.p2 r4 = kotlinx.coroutines.g1.e()
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a$c r6 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a$c
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r7 = r8.f
                r6.<init>(r7, r9, r5)
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.j.a(r3)
                r8.a = r3
                java.lang.Object r1 = kotlin.coroutines.jvm.internal.j.a(r1)
                r8.b = r1
                java.lang.Object r9 = kotlin.coroutines.jvm.internal.j.a(r9)
                r8.c = r9
                r8.d = r2
                java.lang.Object r9 = kotlinx.coroutines.i.h(r4, r6, r8)
                if (r9 != r0) goto Ld4
            Ld3:
                return r0
            Ld4:
                kotlin.n1 r9 = kotlin.n1.a
                return r9
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b implements androidx.lifecycle.Observer, kotlin.jvm.internal.b0 {
        private final /* synthetic */ kotlin.jvm.functions.Function1 a;

        b(kotlin.jvm.functions.Function1 r2) {
                r1 = this;
                java.lang.String r0 = "function"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                return
        }

        public final boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof androidx.lifecycle.Observer
                r1 = 0
                if (r0 == 0) goto L18
                boolean r0 = r3 instanceof kotlin.jvm.internal.b0
                if (r0 == 0) goto L18
                kotlin.n r0 = r2.getFunctionDelegate()
                kotlin.jvm.internal.b0 r3 = (kotlin.jvm.internal.b0) r3
                kotlin.n r3 = r3.getFunctionDelegate()
                boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
                return r3
            L18:
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.n<?> getFunctionDelegate() {
                r1 = this;
                kotlin.jvm.functions.Function1 r0 = r1.a
                return r0
        }

        public final int hashCode() {
                r1 = this;
                kotlin.n r0 = r1.getFunctionDelegate()
                int r0 = r0.hashCode()
                return r0
        }

        public final /* synthetic */ void onChanged(java.lang.Object r2) {
                r1 = this;
                kotlin.jvm.functions.Function1 r0 = r1.a
                r0.invoke(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$setMinutePace$1", f = "V3RecordChartFragment.kt", i = {0, 1, 1, 2, 2, 2}, l = {66, 72, 76}, m = "invokeSuspend", n = {"agePace", "agePace", "bestPace", "agePace", "bestPace", "paceChartModel"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3RecordChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3RecordChartFragment.kt\ncom/bxkj/student/v2/ui/sports/v3/detail/tab/V3RecordChartFragment$setMinutePace$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,259:1\n1#2:260\n774#3:261\n865#3,2:262\n*S KotlinDebug\n*F\n+ 1 V3RecordChartFragment.kt\ncom/bxkj/student/v2/ui/sports/v3/detail/tab/V3RecordChartFragment$setMinutePace$1\n*L\n70#1:261\n70#1:262,2\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        int d;
        final /* synthetic */ java.util.List<java.lang.Double> e;
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment f;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$setMinutePace$1$1", f = "V3RecordChartFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment b;
            final /* synthetic */ java.lang.String c;

            a(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r1, java.lang.String r2, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment.c.a> r3) {
                    r0 = this;
                    r0.b = r1
                    r0.c = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                    r2 = this;
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c$a r3 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c$a
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r0 = r2.b
                    java.lang.String r1 = r2.c
                    r3.<init>(r0, r1, r4)
                    return r3
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                    r0 = this;
                    kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.invoke(r1, r2)
                    return r1
            }

            public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c$a r1 = (com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment.c.a) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                    r1 = this;
                    kotlin.coroutines.intrinsics.a.l()
                    int r0 = r1.a
                    if (r0 != 0) goto L1c
                    kotlin.g0.n(r2)
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r2 = r1.b
                    androidx.databinding.ViewDataBinding r2 = r2.K()
                    com.bxkj.student.databinding.FmV3SportsChartBinding r2 = (com.bxkj.student.databinding.FmV3SportsChartBinding) r2
                    android.widget.TextView r2 = r2.tvAvgPace
                    java.lang.String r0 = r1.c
                    r2.setText(r0)
                    kotlin.n1 r2 = kotlin.n1.a
                    return r2
                L1c:
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r2.<init>(r0)
                    throw r2
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$setMinutePace$1$2", f = "V3RecordChartFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment b;
            final /* synthetic */ java.lang.String c;

            b(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r1, java.lang.String r2, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment.c.b> r3) {
                    r0 = this;
                    r0.b = r1
                    r0.c = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                    r2 = this;
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c$b r3 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c$b
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r0 = r2.b
                    java.lang.String r1 = r2.c
                    r3.<init>(r0, r1, r4)
                    return r3
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                    r0 = this;
                    kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.invoke(r1, r2)
                    return r1
            }

            public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c$b r1 = (com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment.c.b) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                    r1 = this;
                    kotlin.coroutines.intrinsics.a.l()
                    int r0 = r1.a
                    if (r0 != 0) goto L1c
                    kotlin.g0.n(r2)
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r2 = r1.b
                    androidx.databinding.ViewDataBinding r2 = r2.K()
                    com.bxkj.student.databinding.FmV3SportsChartBinding r2 = (com.bxkj.student.databinding.FmV3SportsChartBinding) r2
                    android.widget.TextView r2 = r2.tvBestPace
                    java.lang.String r0 = r1.c
                    r2.setText(r0)
                    kotlin.n1 r2 = kotlin.n1.a
                    return r2
                L1c:
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r2.<init>(r0)
                    throw r2
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$setMinutePace$1$3", f = "V3RecordChartFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c$c, reason: collision with other inner class name */
        static final class C0165c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment b;
            final /* synthetic */ com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel c;

            C0165c(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r1, com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r2, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment.c.C0165c> r3) {
                    r0 = this;
                    r0.b = r1
                    r0.c = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                    r2 = this;
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c$c r3 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c$c
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r0 = r2.b
                    com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = r2.c
                    r3.<init>(r0, r1, r4)
                    return r3
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                    r0 = this;
                    kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.invoke(r1, r2)
                    return r1
            }

            public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c$c r1 = (com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment.c.C0165c) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                    r1 = this;
                    kotlin.coroutines.intrinsics.a.l()
                    int r0 = r1.a
                    if (r0 != 0) goto L1c
                    kotlin.g0.n(r2)
                    com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r2 = r1.b
                    androidx.databinding.ViewDataBinding r2 = r2.K()
                    com.bxkj.student.databinding.FmV3SportsChartBinding r2 = (com.bxkj.student.databinding.FmV3SportsChartBinding) r2
                    com.github.aachartmodel.aainfographics.aachartcreator.AAChartView r2 = r2.AAChartView
                    com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r0 = r1.c
                    r2.aa_drawChartWithChartModel(r0)
                    kotlin.n1 r2 = kotlin.n1.a
                    return r2
                L1c:
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r2.<init>(r0)
                    throw r2
            }
        }

        c(java.util.List<java.lang.Double> r1, com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r2, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment.c> r3) {
                r0 = this;
                r0.e = r1
                r0.f = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                r2 = this;
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c r3 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c
                java.util.List<java.lang.Double> r0 = r2.e
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r1 = r2.f
                r3.<init>(r0, r1, r4)
                return r3
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c r1 = (com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment.c) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r13.d
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L41
                if (r1 == r4) goto L38
                if (r1 == r3) goto L2b
                if (r1 != r2) goto L23
                java.lang.Object r0 = r13.c
                com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r0 = (com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel) r0
                java.lang.Object r0 = r13.b
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r13.a
                java.lang.String r0 = (java.lang.String) r0
                kotlin.g0.n(r14)
                goto L10a
            L23:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L2b:
                java.lang.Object r1 = r13.b
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r3 = r13.a
                java.lang.String r3 = (java.lang.String) r3
                kotlin.g0.n(r14)
                goto Ldc
            L38:
                java.lang.Object r1 = r13.a
                java.lang.String r1 = (java.lang.String) r1
                kotlin.g0.n(r14)
                r14 = r1
                goto L7c
            L41:
                kotlin.g0.n(r14)
                java.util.List<java.lang.Double> r14 = r13.e
                r1 = r14
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L50
                goto L51
            L50:
                r14 = r5
            L51:
                if (r14 == 0) goto L60
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                double r6 = kotlin.collections.f0.O1(r14)
                com.bxkj.student.v2.common.data.j$a r14 = com.bxkj.student.v2.common.data.j.a
                java.lang.String r14 = r14.f(r6)
                goto L61
            L60:
                r14 = r5
            L61:
                kotlinx.coroutines.p2 r1 = kotlinx.coroutines.g1.e()
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c$a r6 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c$a
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r7 = r13.f
                r6.<init>(r7, r14, r5)
                java.lang.Object r7 = kotlin.coroutines.jvm.internal.j.a(r14)
                r13.a = r7
                r13.d = r4
                java.lang.Object r1 = kotlinx.coroutines.i.h(r1, r6, r13)
                if (r1 != r0) goto L7c
                goto L109
            L7c:
                java.util.List<java.lang.Double> r1 = r13.e
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r1 = r1.iterator()
            L89:
                boolean r7 = r1.hasNext()
                if (r7 == 0) goto La9
                java.lang.Object r7 = r1.next()
                r8 = r7
                java.lang.Number r8 = (java.lang.Number) r8
                double r8 = r8.doubleValue()
                r10 = 0
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 != 0) goto La2
                r8 = 1
                goto La3
            La2:
                r8 = 0
            La3:
                if (r8 != 0) goto L89
                r6.add(r7)
                goto L89
            La9:
                java.lang.Double r1 = kotlin.collections.f0.n4(r6)
                if (r1 == 0) goto Lba
                double r6 = r1.doubleValue()
                com.bxkj.student.v2.common.data.j$a r1 = com.bxkj.student.v2.common.data.j.a
                java.lang.String r1 = r1.f(r6)
                goto Lbb
            Lba:
                r1 = r5
            Lbb:
                kotlinx.coroutines.p2 r4 = kotlinx.coroutines.g1.e()
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c$b r6 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c$b
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r7 = r13.f
                r6.<init>(r7, r1, r5)
                java.lang.Object r7 = kotlin.coroutines.jvm.internal.j.a(r14)
                r13.a = r7
                java.lang.Object r7 = kotlin.coroutines.jvm.internal.j.a(r1)
                r13.b = r7
                r13.d = r3
                java.lang.Object r3 = kotlinx.coroutines.i.h(r4, r6, r13)
                if (r3 != r0) goto Ldb
                goto L109
            Ldb:
                r3 = r14
            Ldc:
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r14 = r13.f
                java.util.List<java.lang.Double> r4 = r13.e
                com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r14 = com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment.f(r14, r4)
                kotlinx.coroutines.p2 r4 = kotlinx.coroutines.g1.e()
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c$c r6 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c$c
                com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r7 = r13.f
                r6.<init>(r7, r14, r5)
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.j.a(r3)
                r13.a = r3
                java.lang.Object r1 = kotlin.coroutines.jvm.internal.j.a(r1)
                r13.b = r1
                java.lang.Object r14 = kotlin.coroutines.jvm.internal.j.a(r14)
                r13.c = r14
                r13.d = r2
                java.lang.Object r14 = kotlinx.coroutines.i.h(r4, r6, r13)
                if (r14 != r0) goto L10a
            L109:
                return r0
            L10a:
                kotlin.n1 r14 = kotlin.n1.a
                return r14
        }
    }

    public V3RecordChartFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void L(java.util.List<java.lang.Double> r7) {
            r6 = this;
            androidx.lifecycle.LifecycleCoroutineScope r0 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r6)
            com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c r3 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$c
            r1 = 0
            r3.<init>(r7, r6, r1)
            r4 = 3
            r5 = 0
            r2 = 0
            kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
            return
    }

    private final void M(int r4, int r5, android.widget.TextView r6) {
            r3 = this;
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            android.content.Context r1 = r3.G()
            r2 = 1114636288(0x42700000, float:60.0)
            int r1 = cn.bluemobi.dylan.base.utils.d.a(r1, r2)
            int r0 = r0 - r1
            r1 = 1106247680(0x41f00000, float:30.0)
            android.content.Context r2 = r3.G()
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r1, r2)
            r2 = -2
            r6.measure(r2, r1)
            int r1 = r6.getMeasuredWidth()
            float r2 = (float) r0
            float r5 = (float) r5
            float r4 = (float) r4
            float r5 = r5 / r4
            float r2 = r2 * r5
            float r4 = (float) r1
            float r2 = r2 - r4
            int r0 = r0 - r1
            float r2 = r2 - r4
            r4 = 0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 > 0) goto L37
            r2 = 0
        L37:
            float r4 = (float) r0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 <= 0) goto L3d
            r2 = r4
        L3d:
            r6.setTranslationX(r2)
            return
    }

    private final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel N(java.util.List<java.lang.Integer> r56) {
            r55 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r2 = r56.size()
            r3 = 1
            int r2 = r2 + r3
            java.lang.String[] r4 = new java.lang.String[r2]
            r5 = 0
        Le:
            java.lang.String r6 = ""
            if (r5 >= r2) goto L17
            r4[r5] = r6
            int r5 = r5 + 1
            goto Le
        L17:
            r2 = r56
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r5 = 0
        L20:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L3e
            java.lang.Object r7 = r2.next()
            int r8 = r5 + 1
            if (r5 >= 0) goto L31
            kotlin.collections.f0.b0()
        L31:
            java.lang.Number r7 = (java.lang.Number) r7
            r7.intValue()
            java.lang.String r7 = java.lang.String.valueOf(r8)
            r4[r5] = r7
            r5 = r8
            goto L20
        L3e:
            com.github.aachartmodel.aainfographics.aatools.AAGradientColor r2 = com.github.aachartmodel.aainfographics.aatools.AAGradientColor.INSTANCE
            com.github.aachartmodel.aainfographics.aatools.AALinearGradientDirection r5 = com.github.aachartmodel.aainfographics.aatools.AALinearGradientDirection.ToBottom
            java.lang.String r7 = "rgba(12,191,121,1)"
            java.lang.String r8 = "rgba(221,245,234,0.5)"
            java.util.Map r2 = r2.linearGradient(r5, r7, r8)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r7 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
            r53 = 4095(0xfff, float:5.738E-42)
            r54 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = -1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r5 = r7.yAxisTitle(r6)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType r6 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType.Right
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r5 = r5.subtitleAlign(r6)
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r6 = new com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle
            r6.<init>()
            java.lang.String r7 = "bottom"
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r6 = r6.position(r7)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r5 = r5.subtitleStyle(r6)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartType r6 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartType.Areaspline
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r5 = r5.chartType(r6)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r4 = r5.categories(r4)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r4 = r4.markerRadius(r1)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = r4.yAxisGridLineWidth(r1)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = r1.legendEnabled(r4)
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r5 = new com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement
            r5.<init>()
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r4 = r5.enableMouseTracking(r4)
            java.lang.String r5 = "步频"
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r4 = r4.name(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r4 = r4.lineWidth(r5)
            r5 = 121(0x79, float:1.7E-43)
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 12
            r8 = 191(0xbf, float:2.68E-43)
            java.lang.String r5 = com.github.aachartmodel.aainfographics.aatools.AAColorKt.AARgba(r7, r8, r5, r6)
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r4 = r4.color(r5)
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r2 = r4.fillColor(r2)
            r4 = r56
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.Object[] r4 = r4.toArray(r5)
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r2 = r2.data(r4)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r2
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r0 = r1.series(r3)
            return r0
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r0, java.util.Map r1) {
            kotlin.n1 r0 = k(r0, r1)
            return r0
    }

    public static final /* synthetic */ com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel f(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r0, java.util.List r1) {
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r0 = r0.l(r1)
            return r0
    }

    public static final /* synthetic */ void g(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r0, int r1, int r2, android.widget.TextView r3) {
            r0.M(r1, r2, r3)
            return
    }

    public static final /* synthetic */ com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel h(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r0, java.util.List r1) {
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r0 = r0.N(r1)
            return r0
    }

    private final void j(java.util.List<java.lang.Integer> r7) {
            r6 = this;
            androidx.lifecycle.LifecycleCoroutineScope r0 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r6)
            kotlinx.coroutines.m0 r1 = kotlinx.coroutines.g1.a()
            com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a r3 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$a
            r2 = 0
            r3.<init>(r7, r6, r2)
            r4 = 2
            r5 = 0
            kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
            return
    }

    private static final kotlin.n1 k(com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment r2, java.util.Map r3) {
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "stepNumbers"
            java.util.List r1 = r0.m(r3, r1)
            r2.j(r1)
            java.lang.String r1 = "paceMinute"
            java.util.List r1 = r0.h(r3, r1)
            r2.L(r1)
            java.lang.String r1 = "paceKm"
            java.util.List r3 = r0.h(r3, r1)
            r2.m(r3)
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private final com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel l(java.util.List<java.lang.Double> r55) {
            r54 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r2 = r55.size()
            java.lang.String[] r3 = new java.lang.String[r2]
            r4 = 0
        Lc:
            java.lang.String r5 = ""
            if (r4 >= r2) goto L15
            r3[r4] = r5
            int r4 = r4 + 1
            goto Lc
        L15:
            r2 = r55
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r4 = 0
        L1e:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L3c
            java.lang.Object r6 = r2.next()
            int r7 = r4 + 1
            if (r4 >= 0) goto L2f
            kotlin.collections.f0.b0()
        L2f:
            java.lang.Number r6 = (java.lang.Number) r6
            r6.doubleValue()
            java.lang.String r6 = java.lang.String.valueOf(r7)
            r3[r4] = r6
            r4 = r7
            goto L1e
        L3c:
            com.github.aachartmodel.aainfographics.aatools.AAGradientColor r2 = com.github.aachartmodel.aainfographics.aatools.AAGradientColor.INSTANCE
            com.github.aachartmodel.aainfographics.aatools.AALinearGradientDirection r4 = com.github.aachartmodel.aainfographics.aatools.AALinearGradientDirection.ToBottom
            java.lang.String r6 = "rgba(09,62,251,1)"
            java.lang.String r7 = "rgba(204,216,249,0.5)"
            java.util.Map r2 = r2.linearGradient(r4, r6, r7)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r6 = new com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
            r52 = 4095(0xfff, float:5.738E-42)
            r53 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = -1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r4 = r6.yAxisTitle(r5)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType r6 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType.XY
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r4 = r4.zoomType(r6)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType r6 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType.Right
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r4 = r4.subtitleAlign(r6)
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r6 = new com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle
            r6.<init>()
            java.lang.String r7 = "bottom"
            com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle r6 = r6.position(r7)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r4 = r4.subtitleStyle(r6)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartType r6 = com.github.aachartmodel.aainfographics.aachartcreator.AAChartType.Areaspline
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r4 = r4.chartType(r6)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r3 = r4.categories(r3)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r3 = r3.markerRadius(r1)
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = r3.yAxisGridLineWidth(r1)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r1 = r1.legendEnabled(r3)
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r4 = new com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement
            r4.<init>()
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r3 = r4.enableMouseTracking(r3)
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r3 = r3.name(r5)
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r3 = r3.lineWidth(r5)
            r5 = 251(0xfb, float:3.52E-43)
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 9
            r8 = 62
            java.lang.String r5 = com.github.aachartmodel.aainfographics.aatools.AAColorKt.AARgba(r7, r8, r5, r6)
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r3 = r3.color(r5)
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r2 = r3.fillColor(r2)
            r3 = r55
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.Object[] r3 = r3.toArray(r5)
            com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement r2 = r2.data(r3)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r0] = r2
            com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel r0 = r1.series(r3)
            return r0
    }

    private final void m(java.util.List<java.lang.Double> r7) {
            r6 = this;
            androidx.lifecycle.LifecycleCoroutineScope r0 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r6)
            com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$setKmPace$1 r3 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$setKmPace$1
            r1 = 0
            r3.<init>(r7, r6, r1)
            r4 = 3
            r5 = 0
            r2 = 0
            kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final android.graphics.Bitmap i() {
            r4 = this;
            com.bxkj.student.v2.common.utils.q r0 = com.bxkj.student.v2.common.utils.q.a
            android.content.Context r1 = r4.G()
            androidx.databinding.ViewDataBinding r2 = r4.K()
            com.bxkj.student.databinding.FmV3SportsChartBinding r2 = (com.bxkj.student.databinding.FmV3SportsChartBinding) r2
            androidx.constraintlayout.widget.ConstraintLayout r2 = r2.clRoot
            java.lang.String r3 = "clRoot"
            kotlin.jvm.internal.g0.o(r2, r3)
            android.graphics.Bitmap r0 = r0.a(r1, r2)
            return r0
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r4 = this;
            androidx.lifecycle.ViewModelProvider r0 = new androidx.lifecycle.ViewModelProvider
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            java.lang.String r2 = "requireActivity(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.<init>(r1)
            java.lang.Class<com.bxkj.student.v2.vm.sports.record.RecordDetailVM> r1 = com.bxkj.student.v2.vm.sports.record.RecordDetailVM.class
            androidx.lifecycle.ViewModel r0 = r0.get(r1)
            com.bxkj.base.v2.base.BaseViewModel r0 = (com.bxkj.base.v2.base.BaseViewModel) r0
            r4.w(r0)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.record.RecordDetailVM r0 = (com.bxkj.student.v2.vm.sports.record.RecordDetailVM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.w()
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            com.bxkj.student.v2.ui.sports.v3.detail.tab.f r2 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.f
            r2.<init>(r4)
            com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$b r3 = new com.bxkj.student.v2.ui.sports.v3.detail.tab.V3RecordChartFragment$b
            r3.<init>(r2)
            r0.observe(r1, r3)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r0 = this;
            return
    }
}
