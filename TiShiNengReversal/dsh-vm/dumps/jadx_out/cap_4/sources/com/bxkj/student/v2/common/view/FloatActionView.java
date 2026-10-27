package com.bxkj.student.v2.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFloatActionView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatActionView.kt\ncom/bxkj/student/v2/common/view/FloatActionView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,317:1\n1#2:318\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class FloatActionView {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.view.FloatActionView.a f = null;
    private static int g;
    private static int h;
    private static final float i = 0.0f;
    private static final float j = 0.0f;
    private static float k;

    @org.jetbrains.annotations.NotNull
    private android.app.Activity a;
    private boolean b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s c;

    @org.jetbrains.annotations.Nullable
    private android.view.View d;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.r0 e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
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
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements android.view.View.OnTouchListener {
        private float a;
        private float b;
        private float c;
        private float d;
        final /* synthetic */ android.view.View e;
        final /* synthetic */ com.bxkj.student.v2.common.view.FloatActionView f;
        final /* synthetic */ android.view.ViewGroup g;
        final /* synthetic */ android.view.WindowManager.LayoutParams h;
        final /* synthetic */ android.view.WindowManager i;
        final /* synthetic */ int j;
        final /* synthetic */ int k;

        b(android.view.View r1, com.bxkj.student.v2.common.view.FloatActionView r2, android.view.ViewGroup r3, android.view.WindowManager.LayoutParams r4, android.view.WindowManager r5, int r6, int r7) {
                r0 = this;
                r0.e = r1
                r0.f = r2
                r0.g = r3
                r0.h = r4
                r0.i = r5
                r0.j = r6
                r0.k = r7
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
                r7 = this;
                java.lang.String r0 = "v"
                kotlin.jvm.internal.g0.p(r8, r0)
                java.lang.String r0 = "event"
                kotlin.jvm.internal.g0.p(r9, r0)
                int r0 = r9.getActionMasked()
                r1 = 0
                if (r0 == 0) goto L112
                r2 = 0
                r4 = 1
                if (r0 == r4) goto L8a
                r8 = 2
                if (r0 == r8) goto L1b
                goto L14d
            L1b:
                com.bxkj.student.v2.common.view.FloatActionView$a r0 = com.bxkj.student.v2.common.view.FloatActionView.f
                float r0 = r9.getRawX()
                int r0 = (int) r0
                android.view.ViewGroup r5 = r7.g
                int r5 = r5.getWidth()
                int r5 = r5 / r8
                int r0 = r0 - r5
                com.bxkj.student.v2.common.view.FloatActionView.n(r0)
                float r8 = r9.getRawY()
                int r8 = (int) r8
                android.view.ViewGroup r0 = r7.g
                int r0 = r0.getHeight()
                int r8 = r8 - r0
                com.bxkj.student.v2.common.view.FloatActionView.o(r8)
                android.view.WindowManager$LayoutParams r8 = r7.h
                int r0 = com.bxkj.student.v2.common.view.FloatActionView.h()
                r8.x = r0
                android.view.WindowManager$LayoutParams r8 = r7.h
                int r0 = com.bxkj.student.v2.common.view.FloatActionView.i()
                r8.y = r0
                float r8 = r9.getRawX()
                float r0 = r7.a
                float r8 = r8 - r0
                r7.c = r8
                float r8 = r9.getRawY()
                float r9 = r7.b
                float r8 = r8 - r9
                r7.d = r8
                float r8 = r7.c
                float r8 = java.lang.Math.abs(r8)
                double r8 = (double) r8
                int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r0 > 0) goto L74
                float r8 = r7.d
                float r8 = java.lang.Math.abs(r8)
                double r8 = (double) r8
                int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r0 <= 0) goto L14d
            L74:
                android.view.WindowManager r8 = r7.i
                android.view.ViewGroup r9 = r7.g
                android.view.WindowManager$LayoutParams r0 = r7.h
                r8.updateViewLayout(r9, r0)
                com.bxkj.student.v2.common.view.FloatActionView r8 = r7.f
                com.bxkj.student.v2.common.view.FloatActionView.m(r8, r4)
                java.lang.String r8 = "移动过程中,不要相应长按事件"
                java.lang.Object[] r9 = new java.lang.Object[r1]
                com.orhanobut.logger.j.d(r8, r9)
                return r4
            L8a:
                com.bxkj.student.v2.common.view.a r0 = com.bxkj.student.v2.common.view.a.a
                r0.f()
                float r0 = r7.c
                double r5 = (double) r0
                int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r0 != 0) goto Laa
                float r0 = r7.d
                double r5 = (double) r0
                int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r0 != 0) goto Laa
                java.lang.String r8 = "移动结束，没有位置移动,可以响应其他事件"
                java.lang.Object[] r9 = new java.lang.Object[r1]
                com.orhanobut.logger.j.d(r8, r9)
                com.bxkj.student.v2.common.view.FloatActionView r8 = r7.f
                com.bxkj.student.v2.common.view.FloatActionView.m(r8, r1)
                return r1
            Laa:
                java.lang.String r0 = "移动结束，有位置移动,不要相应长按事件"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                com.orhanobut.logger.j.d(r0, r1)
                com.bxkj.student.v2.common.view.FloatActionView r0 = r7.f
                com.bxkj.student.v2.common.view.FloatActionView.m(r0, r4)
                r8.getX()
                float r0 = r9.getRawX()
                int r0 = (int) r0
                int r1 = r7.j
                r2 = 1092616192(0x41200000, float:10.0)
                if (r0 >= r1) goto Ld0
                com.bxkj.student.v2.common.view.FloatActionView r8 = r7.f
                android.app.Activity r8 = r8.t()
                int r8 = cn.bluemobi.dylan.base.utils.u.a(r2, r8)
                float r8 = (float) r8
                goto Le3
            Ld0:
                int r0 = r7.k
                int r8 = r8.getWidth()
                int r0 = r0 - r8
                com.bxkj.student.v2.common.view.FloatActionView r8 = r7.f
                android.app.Activity r8 = r8.t()
                int r8 = cn.bluemobi.dylan.base.utils.u.a(r2, r8)
                int r0 = r0 - r8
                float r8 = (float) r0
            Le3:
                com.bxkj.student.v2.common.view.FloatActionView$a r0 = com.bxkj.student.v2.common.view.FloatActionView.f
                int r8 = (int) r8
                com.bxkj.student.v2.common.view.FloatActionView.n(r8)
                float r8 = r9.getRawY()
                int r8 = (int) r8
                android.view.ViewGroup r9 = r7.g
                int r9 = r9.getHeight()
                int r8 = r8 - r9
                com.bxkj.student.v2.common.view.FloatActionView.o(r8)
                android.view.WindowManager$LayoutParams r8 = r7.h
                int r9 = com.bxkj.student.v2.common.view.FloatActionView.h()
                r8.x = r9
                android.view.WindowManager$LayoutParams r8 = r7.h
                int r9 = com.bxkj.student.v2.common.view.FloatActionView.i()
                r8.y = r9
                android.view.WindowManager r8 = r7.i
                android.view.ViewGroup r9 = r7.g
                android.view.WindowManager$LayoutParams r0 = r7.h
                r8.updateViewLayout(r9, r0)
                return r4
            L112:
                com.bxkj.student.v2.common.view.a r8 = com.bxkj.student.v2.common.view.a.a
                r8.c()
                com.bxkj.student.v2.common.view.FloatActionView$a r8 = com.bxkj.student.v2.common.view.FloatActionView.f
                float r8 = com.bxkj.student.v2.common.view.FloatActionView.f()
                com.bxkj.student.v2.common.view.FloatActionView.l(r8)
                android.view.View r8 = r7.e
                android.view.ViewPropertyAnimator r8 = r8.animate()
                float r0 = com.bxkj.student.v2.common.view.FloatActionView.e()
                android.view.ViewPropertyAnimator r8 = r8.alpha(r0)
                r2 = 300(0x12c, double:1.48E-321)
                android.view.ViewPropertyAnimator r8 = r8.setDuration(r2)
                r8.start()
                com.bxkj.student.v2.common.view.FloatActionView r8 = r7.f
                com.bxkj.student.v2.common.view.FloatActionView.m(r8, r1)
                float r8 = r9.getRawX()
                r7.a = r8
                float r8 = r9.getRawY()
                r7.b = r8
                r8 = 0
                r7.c = r8
                r7.d = r8
            L14d:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.common.view.FloatActionView$createFloatView$2$3$1", f = "FloatActionView.kt", i = {}, l = {239}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.common.view.FloatActionView b;

        c(com.bxkj.student.v2.common.view.FloatActionView r1, kotlin.coroutines.e<? super com.bxkj.student.v2.common.view.FloatActionView.c> r2) {
                r0 = this;
                r0.b = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                r1 = this;
                com.bxkj.student.v2.common.view.FloatActionView$c r2 = new com.bxkj.student.v2.common.view.FloatActionView$c
                com.bxkj.student.v2.common.view.FloatActionView r0 = r1.b
                r2.<init>(r0, r3)
                return r2
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
                com.bxkj.student.v2.common.view.FloatActionView$c r1 = (com.bxkj.student.v2.common.view.FloatActionView.c) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                r6 = this;
                java.lang.String r0 = "linkUrl"
                java.lang.String r1 = "name"
                java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
                int r3 = r6.a
                r4 = 1
                if (r3 == 0) goto L1d
                if (r3 != r4) goto L15
                kotlin.g0.n(r7)     // Catch: java.lang.Exception -> L13
                goto L2f
            L13:
                r7 = move-exception
                goto L5e
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                kotlin.g0.n(r7)
                com.bxkj.student.v2.common.view.FloatActionView r7 = r6.b     // Catch: java.lang.Exception -> L13
                com.bxkj.student.v2.repository.a r7 = com.bxkj.student.v2.common.view.FloatActionView.g(r7)     // Catch: java.lang.Exception -> L13
                r6.a = r4     // Catch: java.lang.Exception -> L13
                java.lang.Object r7 = r7.c(r6)     // Catch: java.lang.Exception -> L13
                if (r7 != r2) goto L2f
                return r2
            L2f:
                com.bxkj.base.v2.http.result.ApiResult r7 = (com.bxkj.base.v2.http.result.ApiResult) r7     // Catch: java.lang.Exception -> L13
                if (r7 == 0) goto L3a
                java.lang.Object r7 = r7.apiData()     // Catch: java.lang.Exception -> L13
                java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Exception -> L13
                goto L3b
            L3a:
                r7 = 0
            L3b:
                com.bxkj.base.v2.common.utils.x r2 = com.bxkj.base.v2.common.utils.x.a     // Catch: java.lang.Exception -> L13
                java.lang.String r3 = r2.t(r7, r1)     // Catch: java.lang.Exception -> L13
                java.lang.String r7 = r2.t(r7, r0)     // Catch: java.lang.Exception -> L13
                com.bxkj.student.v2.common.utils.h r2 = com.bxkj.student.v2.common.utils.h.a     // Catch: java.lang.Exception -> L13
                com.bxkj.student.v2.common.view.FloatActionView r4 = r6.b     // Catch: java.lang.Exception -> L13
                android.app.Activity r4 = r4.t()     // Catch: java.lang.Exception -> L13
                java.util.LinkedHashMap r5 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L13
                r5.<init>()     // Catch: java.lang.Exception -> L13
                r5.put(r1, r3)     // Catch: java.lang.Exception -> L13
                r5.put(r0, r7)     // Catch: java.lang.Exception -> L13
                kotlin.n1 r7 = kotlin.n1.a     // Catch: java.lang.Exception -> L13
                r2.b(r4, r5)     // Catch: java.lang.Exception -> L13
                goto L65
            L5e:
                java.lang.String r7 = r7.getMessage()
                com.orhanobut.logger.j.c(r7)
            L65:
                kotlin.n1 r7 = kotlin.n1.a
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.common.view.FloatActionView$subscribeToCountdownEvents$1", f = "FloatActionView.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.common.view.FloatActionView b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class a<T> implements kotlinx.coroutines.flow.j {
            final /* synthetic */ com.bxkj.student.v2.common.view.FloatActionView a;

            a(com.bxkj.student.v2.common.view.FloatActionView r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public static /* synthetic */ void a(com.bxkj.student.v2.common.view.FloatActionView r0) {
                    f(r0)
                    return
            }

            private static final void f(com.bxkj.student.v2.common.view.FloatActionView r0) {
                    com.bxkj.student.v2.common.view.FloatActionView.j(r0)
                    return
            }

            public final java.lang.Object e(com.bxkj.student.v2.common.view.a.AbstractC0146a r2, kotlin.coroutines.e<? super kotlin.n1> r3) {
                    r1 = this;
                    boolean r3 = r2 instanceof com.bxkj.student.v2.common.view.a.AbstractC0146a.c
                    if (r3 != 0) goto L28
                    boolean r3 = r2 instanceof com.bxkj.student.v2.common.view.a.AbstractC0146a.b
                    if (r3 == 0) goto L19
                    com.bxkj.student.v2.common.view.FloatActionView r2 = r1.a
                    android.app.Activity r2 = r2.t()
                    com.bxkj.student.v2.common.view.FloatActionView r3 = r1.a
                    com.bxkj.student.v2.common.view.h r0 = new com.bxkj.student.v2.common.view.h
                    r0.<init>(r3)
                    r2.runOnUiThread(r0)
                    goto L28
                L19:
                    boolean r3 = r2 instanceof com.bxkj.student.v2.common.view.a.AbstractC0146a.C0147a
                    if (r3 != 0) goto L28
                    boolean r2 = r2 instanceof com.bxkj.student.v2.common.view.a.AbstractC0146a.d
                    if (r2 == 0) goto L22
                    goto L28
                L22:
                    kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
                    r2.<init>()
                    throw r2
                L28:
                    kotlin.n1 r2 = kotlin.n1.a
                    return r2
            }

            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r1, kotlin.coroutines.e r2) {
                    r0 = this;
                    com.bxkj.student.v2.common.view.a$a r1 = (com.bxkj.student.v2.common.view.a.AbstractC0146a) r1
                    java.lang.Object r1 = r0.e(r1, r2)
                    return r1
            }
        }

        d(com.bxkj.student.v2.common.view.FloatActionView r1, kotlin.coroutines.e<? super com.bxkj.student.v2.common.view.FloatActionView.d> r2) {
                r0 = this;
                r0.b = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                r1 = this;
                com.bxkj.student.v2.common.view.FloatActionView$d r2 = new com.bxkj.student.v2.common.view.FloatActionView$d
                com.bxkj.student.v2.common.view.FloatActionView r0 = r1.b
                r2.<init>(r0, r3)
                return r2
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
                com.bxkj.student.v2.common.view.FloatActionView$d r1 = (com.bxkj.student.v2.common.view.FloatActionView.d) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r4.a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 == r2) goto L13
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L13:
                kotlin.g0.n(r5)
                goto L30
            L17:
                kotlin.g0.n(r5)
                com.bxkj.student.v2.common.view.a r5 = com.bxkj.student.v2.common.view.a.a
                kotlinx.coroutines.flow.x r5 = r5.d()
                com.bxkj.student.v2.common.view.FloatActionView$d$a r1 = new com.bxkj.student.v2.common.view.FloatActionView$d$a
                com.bxkj.student.v2.common.view.FloatActionView r3 = r4.b
                r1.<init>(r3)
                r4.a = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L30
                return r0
            L30:
                kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
                r5.<init>()
                throw r5
        }
    }

    static {
            com.bxkj.student.v2.common.view.FloatActionView$a r0 = new com.bxkj.student.v2.common.view.FloatActionView$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.v2.common.view.FloatActionView.f = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            com.bxkj.student.v2.common.view.FloatActionView.i = r0
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            com.bxkj.student.v2.common.view.FloatActionView.j = r0
            return
    }

    public FloatActionView(@org.jetbrains.annotations.NotNull android.app.Activity r3) {
            r2 = this;
            java.lang.String r0 = "mActivity"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.<init>()
            r2.a = r3
            com.bxkj.student.v2.common.view.g r3 = new com.bxkj.student.v2.common.view.g
            r3.<init>()
            kotlin.s r3 = kotlin.t.c(r3)
            r2.c = r3
            kotlinx.coroutines.m0 r3 = kotlinx.coroutines.g1.a()
            r0 = 0
            r1 = 1
            kotlinx.coroutines.b0 r0 = kotlinx.coroutines.d3.c(r0, r1, r0)
            kotlin.coroutines.i r3 = r3.plus(r0)
            kotlinx.coroutines.r0 r3 = kotlinx.coroutines.s0.a(r3)
            r2.e = r3
            return
    }

    private final void A() {
            r6 = this;
            kotlinx.coroutines.r0 r0 = r6.e
            com.bxkj.student.v2.common.view.FloatActionView$d r3 = new com.bxkj.student.v2.common.view.FloatActionView$d
            r1 = 0
            r3.<init>(r6, r1)
            r4 = 3
            r5 = 0
            r2 = 0
            kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ kotlin.n1 a(com.bxkj.student.v2.common.view.FloatActionView r0, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            kotlin.n1 r0 = s(r0, r1)
            return r0
    }

    public static /* synthetic */ void b(com.bxkj.student.v2.common.view.FloatActionView r0, android.view.View r1) {
            q(r0, r1)
            return
    }

    public static /* synthetic */ boolean c(com.bxkj.student.v2.common.view.FloatActionView r0, android.view.View r1) {
            boolean r0 = r(r0, r1)
            return r0
    }

    public static /* synthetic */ com.bxkj.student.v2.repository.a d() {
            com.bxkj.student.v2.repository.a r0 = v()
            return r0
    }

    public static final /* synthetic */ float e() {
            float r0 = com.bxkj.student.v2.common.view.FloatActionView.k
            return r0
    }

    public static final /* synthetic */ float f() {
            float r0 = com.bxkj.student.v2.common.view.FloatActionView.i
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.repository.a g(com.bxkj.student.v2.common.view.FloatActionView r0) {
            com.bxkj.student.v2.repository.a r0 = r0.u()
            return r0
    }

    public static final /* synthetic */ int h() {
            int r0 = com.bxkj.student.v2.common.view.FloatActionView.g
            return r0
    }

    public static final /* synthetic */ int i() {
            int r0 = com.bxkj.student.v2.common.view.FloatActionView.h
            return r0
    }

    public static final /* synthetic */ void j(com.bxkj.student.v2.common.view.FloatActionView r0) {
            r0.w()
            return
    }

    public static final /* synthetic */ void k(com.bxkj.student.v2.common.view.FloatActionView r0) {
            r0.x()
            return
    }

    public static final /* synthetic */ void l(float r0) {
            com.bxkj.student.v2.common.view.FloatActionView.k = r0
            return
    }

    public static final /* synthetic */ void m(com.bxkj.student.v2.common.view.FloatActionView r0, boolean r1) {
            r0.b = r1
            return
    }

    public static final /* synthetic */ void n(int r0) {
            com.bxkj.student.v2.common.view.FloatActionView.g = r0
            return
    }

    public static final /* synthetic */ void o(int r0) {
            com.bxkj.student.v2.common.view.FloatActionView.h = r0
            return
    }

    private static final void q(com.bxkj.student.v2.common.view.FloatActionView r8, android.view.View r9) {
            android.app.Activity r9 = r8.a
            boolean r0 = r9 instanceof androidx.activity.ComponentActivity
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r9
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L28
            java.lang.String r0 = "null cannot be cast to non-null type androidx.activity.ComponentActivity"
            kotlin.jvm.internal.g0.n(r9, r0)
            androidx.activity.ComponentActivity r9 = (androidx.activity.ComponentActivity) r9
            if (r9 == 0) goto L28
            androidx.lifecycle.LifecycleCoroutineScope r2 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r9)
            kotlinx.coroutines.m0 r3 = kotlinx.coroutines.g1.c()
            com.bxkj.student.v2.common.view.FloatActionView$c r5 = new com.bxkj.student.v2.common.view.FloatActionView$c
            r5.<init>(r8, r1)
            r6 = 2
            r7 = 0
            r4 = 0
            kotlinx.coroutines.i.e(r2, r3, r4, r5, r6, r7)
        L28:
            return
    }

    private static final boolean r(com.bxkj.student.v2.common.view.FloatActionView r10, android.view.View r11) {
            boolean r11 = r10.b
            if (r11 != 0) goto L22
            r11 = 0
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.String r0 = "长按了,不要相应移动事件"
            com.orhanobut.logger.j.d(r0, r11)
            android.app.Activity r1 = r10.a
            com.bxkj.student.v2.common.view.f r4 = new com.bxkj.student.v2.common.view.f
            r4.<init>(r10)
            r8 = 8
            r9 = 0
            java.lang.String r2 = "是否关闭悬浮按钮?"
            java.lang.String r3 = "关闭后可在【我的】->【关于】->【悬浮开关】中再次开启和关闭"
            r5 = 0
            java.lang.String r6 = "显示"
            java.lang.String r7 = "关闭"
            com.bxkj.base.v2.common.ext.ContextExtKt.h(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L22:
            r10 = 1
            return r10
    }

    private static final kotlin.n1 s(com.bxkj.student.v2.common.view.FloatActionView r3, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r4, r0)
            com.bxkj.base.v2.data.b$a r4 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r4 = r4.a()
            r0 = 0
            r4.l0(r0)
            android.app.Activity r3 = r3.a
            androidx.localbroadcastmanager.content.LocalBroadcastManager r3 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r3)
            android.content.Intent r4 = new android.content.Intent
            com.bxkj.student.App$a r1 = com.bxkj.student.App.d
            com.bxkj.student.App r1 = r1.a()
            java.lang.String r1 = r1.getPackageName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ".FloatActionView"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r4.<init>(r1)
            java.lang.String r1 = "isShow"
            android.content.Intent r4 = r4.putExtra(r1, r0)
            r3.sendBroadcast(r4)
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    private final com.bxkj.student.v2.repository.a u() {
            r1 = this;
            kotlin.s r0 = r1.c
            java.lang.Object r0 = r0.getValue()
            com.bxkj.student.v2.repository.a r0 = (com.bxkj.student.v2.repository.a) r0
            return r0
    }

    private static final com.bxkj.student.v2.repository.a v() {
            com.bxkj.student.v2.repository.a r0 = new com.bxkj.student.v2.repository.a
            r0.<init>()
            return r0
    }

    private final void w() {
            r3 = this;
            float r0 = com.bxkj.student.v2.common.view.FloatActionView.j
            com.bxkj.student.v2.common.view.FloatActionView.k = r0
            android.view.View r0 = r3.d
            if (r0 == 0) goto L21
            android.view.ViewPropertyAnimator r0 = r0.animate()
            if (r0 == 0) goto L21
            float r1 = com.bxkj.student.v2.common.view.FloatActionView.k
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            if (r0 == 0) goto L21
            r1 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            if (r0 == 0) goto L21
            r0.start()
        L21:
            return
    }

    private final void x() {
            r3 = this;
            android.view.View r0 = r3.d
            if (r0 == 0) goto L1d
            android.view.ViewPropertyAnimator r0 = r0.animate()
            if (r0 == 0) goto L1d
            float r1 = com.bxkj.student.v2.common.view.FloatActionView.k
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            if (r0 == 0) goto L1d
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            if (r0 == 0) goto L1d
            r0.start()
        L1d:
            return
    }

    public final void p() {
            r10 = this;
            android.app.Activity r0 = r10.a
            boolean r1 = r0 instanceof com.bxkj.student.splash.SplashActivity
            if (r1 != 0) goto L16
            boolean r1 = r0 instanceof com.bxkj.student.splash.SelectSchoolV2Activity
            if (r1 != 0) goto L16
            boolean r1 = r0 instanceof com.bxkj.student.splash.WelcomeActivity
            if (r1 != 0) goto L16
            boolean r1 = r0 instanceof com.bxkj.student.splash.OpenPrivacyAgreementActivity
            if (r1 != 0) goto L16
            boolean r1 = r0 instanceof cn.jpush.android.service.JNotifyActivity
            if (r1 == 0) goto L19
        L16:
            r4 = r10
            goto L171
        L19:
            boolean r1 = r0 instanceof com.bxkj.student.v2.ui.h5.H5AppActivity
            if (r1 == 0) goto L4e
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = "title"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L4e
            android.app.Activity r0 = r10.a
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            java.lang.String r2 = "帮助与客服"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 != 0) goto L16
            android.app.Activity r0 = r10.a
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            java.lang.String r1 = "帮助中心"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L4e
            goto L16
        L4e:
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r0 = r0.getSysType()
            r1 = 2
            if (r0 == r1) goto L5a
            goto L16
        L5a:
            android.view.WindowManager$LayoutParams r3 = new android.view.WindowManager$LayoutParams
            r3.<init>()
            android.app.Activity r0 = r10.a
            android.view.WindowManager r4 = r0.getWindowManager()
            r3.type = r1
            r0 = 1
            r3.format = r0
            r0 = 8
            r3.flags = r0
            r0 = 51
            r3.gravity = r0
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.app.Activity r2 = r10.a
            android.view.WindowManager r2 = r2.getWindowManager()
            android.view.Display r2 = r2.getDefaultDisplay()
            r2.getMetrics(r0)
            int r9 = r0.widthPixels
            int r0 = r0.heightPixels
            int r8 = r9 / 2
            int r2 = com.bxkj.student.v2.common.view.FloatActionView.g
            if (r2 != 0) goto L9c
            float r2 = (float) r9
            r5 = 1114636288(0x42700000, float:60.0)
            android.app.Activity r6 = r10.a
            int r5 = cn.bluemobi.dylan.base.utils.u.a(r5, r6)
            float r5 = (float) r5
            float r2 = r2 - r5
            int r2 = (int) r2
            com.bxkj.student.v2.common.view.FloatActionView.g = r2
        L9c:
            int r2 = com.bxkj.student.v2.common.view.FloatActionView.h
            if (r2 != 0) goto La3
            int r0 = r0 / r1
            com.bxkj.student.v2.common.view.FloatActionView.h = r0
        La3:
            int r0 = com.bxkj.student.v2.common.view.FloatActionView.g
            r3.x = r0
            int r0 = com.bxkj.student.v2.common.view.FloatActionView.h
            r3.y = r0
            android.app.Activity r0 = r10.a
            r1 = 1112014848(0x42480000, float:50.0)
            int r0 = cn.bluemobi.dylan.base.utils.u.a(r1, r0)
            r3.width = r0
            android.app.Activity r0 = r10.a
            int r0 = cn.bluemobi.dylan.base.utils.u.a(r1, r0)
            r3.height = r0
            android.app.Activity r0 = r10.a
            android.view.LayoutInflater r0 = r0.getLayoutInflater()
            java.lang.String r1 = "getLayoutInflater(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r1 = 2131493177(0x7f0c0139, float:1.8609827E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
            kotlin.jvm.internal.g0.n(r0, r1)
            r5 = r0
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r0 = 2131298051(0x7f090703, float:1.8214064E38)
            android.view.View r0 = r5.findViewById(r0)
            r10.d = r0
            r4.addView(r5, r3)
            float r1 = com.bxkj.student.v2.common.view.FloatActionView.k
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto Lf4
            float r1 = com.bxkj.student.v2.common.view.FloatActionView.i
            com.bxkj.student.v2.common.view.FloatActionView.k = r1
            com.bxkj.student.v2.common.view.a r1 = com.bxkj.student.v2.common.view.a.a
            r1.f()
        Lf4:
            r10.x()
            r10.A()
            com.bxkj.student.v2.common.view.FloatActionView$b r2 = new com.bxkj.student.v2.common.view.FloatActionView$b
            r6 = r3
            r7 = r4
            r4 = r10
            r3 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r8 = r3
            r3 = r6
            r8.setOnTouchListener(r2)
            com.bxkj.student.v2.common.view.d r0 = new com.bxkj.student.v2.common.view.d
            r0.<init>(r10)
            r8.setOnClickListener(r0)
            com.bxkj.student.v2.common.view.e r0 = new com.bxkj.student.v2.common.view.e
            r0.<init>(r10)
            r8.setOnLongClickListener(r0)
            r6 = r4
            r4 = r7
            com.bxkj.student.v2.common.view.FloatActionView$createFloatView$showHideBroadCast$1 r7 = new com.bxkj.student.v2.common.view.FloatActionView$createFloatView$showHideBroadCast$1
            r7.<init>(r10)
            android.app.Activity r0 = r6.a
            androidx.localbroadcastmanager.content.LocalBroadcastManager r0 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r0)
            android.content.IntentFilter r1 = new android.content.IntentFilter
            com.bxkj.student.App$a r2 = com.bxkj.student.App.d
            com.bxkj.student.App r2 = r2.a()
            java.lang.String r2 = r2.getPackageName()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            java.lang.String r2 = ".FloatActionView"
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            r1.<init>(r2)
            r0.registerReceiver(r7, r1)
            android.app.Activity r0 = r6.a
            boolean r1 = r0 instanceof androidx.activity.ComponentActivity
            if (r1 == 0) goto L163
            java.lang.String r1 = "null cannot be cast to non-null type androidx.activity.ComponentActivity"
            kotlin.jvm.internal.g0.n(r0, r1)
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            com.bxkj.student.v2.common.view.FloatActionView$createFloatView$4 r2 = new com.bxkj.student.v2.common.view.FloatActionView$createFloatView$4
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r4 = r6
            r0.addObserver(r2)
            goto L164
        L163:
            r4 = r6
        L164:
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r0 = r0.a()
            boolean r0 = r0.n()
            r10.z(r0)
        L171:
            return
    }

    @org.jetbrains.annotations.NotNull
    public final android.app.Activity t() {
            r1 = this;
            android.app.Activity r0 = r1.a
            return r0
    }

    public final void y(@org.jetbrains.annotations.NotNull android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.a = r2
            return
    }

    public final void z(boolean r2) {
            r1 = this;
            android.view.View r0 = r1.d
            if (r0 == 0) goto Ld
            if (r2 == 0) goto L8
            r2 = 0
            goto La
        L8:
            r2 = 8
        La:
            r0.setVisibility(r2)
        Ld:
            return
    }
}
