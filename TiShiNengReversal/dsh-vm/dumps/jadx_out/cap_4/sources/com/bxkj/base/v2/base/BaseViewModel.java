package com.bxkj.base.v2.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBaseViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseViewModel.kt\ncom/bxkj/base/v2/base/BaseViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,260:1\n1#2:261\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class BaseViewModel extends androidx.lifecycle.ViewModel {

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> a;

    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> b;

    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> c;

    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> d;

    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> e;

    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> f;

    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.e2 g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.base.v2.base.BaseViewModel$launch$job$1", f = "BaseViewModel.kt", i = {2, 3, 3, 4, 4, 5, 5, 5}, l = {94, 117, 96, 101, 106, 108, 117, 117}, m = "invokeSuspend", n = {"e", "e", "failInvokeResult", "e", "failInvokeResult", "e", "failInvokeResult", "onErrorResult"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBaseViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseViewModel.kt\ncom/bxkj/base/v2/base/BaseViewModel$launch$job$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,260:1\n1#2:261\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        int d;
        final /* synthetic */ java.lang.String e;
        final /* synthetic */ java.lang.Boolean f;
        final /* synthetic */ com.bxkj.base.v2.base.BaseViewModel g;
        final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> h;
        final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Exception, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> i;
        final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Exception, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> j;
        final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Exception, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.functions.Function2<com.bxkj.base.v2.http.exception.ApiException, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> f592l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> f593m;

        a(java.lang.String r1, java.lang.Boolean r2, com.bxkj.base.v2.base.BaseViewModel r3, kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r4, kotlin.jvm.functions.Function2<? super java.lang.Exception, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r5, kotlin.jvm.functions.Function2<? super java.lang.Exception, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r6, kotlin.jvm.functions.Function2<? super java.lang.Exception, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r7, kotlin.jvm.functions.Function2<? super com.bxkj.base.v2.http.exception.ApiException, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r8, kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r9, kotlin.coroutines.e<? super com.bxkj.base.v2.base.BaseViewModel.a> r10) {
                r0 = this;
                r0.e = r1
                r0.f = r2
                r0.g = r3
                r0.h = r4
                r0.i = r5
                r0.j = r6
                r0.k = r7
                r0.f592l = r8
                r0.f593m = r9
                r1 = 2
                r0.<init>(r1, r10)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r12, kotlin.coroutines.e<?> r13) {
                r11 = this;
                com.bxkj.base.v2.base.BaseViewModel$a r0 = new com.bxkj.base.v2.base.BaseViewModel$a
                java.lang.String r1 = r11.e
                java.lang.Boolean r2 = r11.f
                com.bxkj.base.v2.base.BaseViewModel r3 = r11.g
                kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r4 = r11.h
                kotlin.jvm.functions.Function2<java.lang.Exception, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> r5 = r11.i
                kotlin.jvm.functions.Function2<java.lang.Exception, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r6 = r11.j
                kotlin.jvm.functions.Function2<java.lang.Exception, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> r7 = r11.k
                kotlin.jvm.functions.Function2<com.bxkj.base.v2.http.exception.ApiException, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> r8 = r11.f592l
                kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r9 = r11.f593m
                r10 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r0
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
                com.bxkj.base.v2.base.BaseViewModel$a r1 = (com.bxkj.base.v2.base.BaseViewModel.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r9.d
                r2 = 0
                r3 = 0
                r4 = 1
                switch(r1) {
                    case 0: goto L54;
                    case 1: goto L4c;
                    case 2: goto L47;
                    case 3: goto L3e;
                    case 4: goto L21;
                    case 5: goto L31;
                    case 6: goto L1d;
                    case 7: goto L47;
                    case 8: goto L14;
                    default: goto Lc;
                }
            Lc:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L14:
                java.lang.Object r0 = r9.a
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.g0.n(r10)
                goto L20c
            L1d:
                java.lang.Object r1 = r9.c
                java.lang.Boolean r1 = (java.lang.Boolean) r1
            L21:
                java.lang.Object r1 = r9.b
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                java.lang.Object r1 = r9.a
                java.lang.Exception r1 = (java.lang.Exception) r1
                kotlin.g0.n(r10)     // Catch: java.lang.Throwable -> L2e
                goto L182
            L2e:
                r10 = move-exception
                goto L1ca
            L31:
                java.lang.Object r1 = r9.b
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                java.lang.Object r5 = r9.a
                java.lang.Exception r5 = (java.lang.Exception) r5
                kotlin.g0.n(r10)     // Catch: java.lang.Throwable -> L2e
                goto L151
            L3e:
                java.lang.Object r1 = r9.a
                java.lang.Exception r1 = (java.lang.Exception) r1
                kotlin.g0.n(r10)     // Catch: java.lang.Throwable -> L2e
                goto Lf2
            L47:
                kotlin.g0.n(r10)
                goto L1c7
            L4c:
                kotlin.g0.n(r10)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L50
                goto La1
            L50:
                r10 = move-exception
                r1 = r10
                goto Le1
            L54:
                kotlin.g0.n(r10)
                java.lang.String r10 = r9.e
                if (r10 == 0) goto L64
                com.bxkj.base.v2.base.BaseViewModel r1 = r9.g
                androidx.lifecycle.MutableLiveData r1 = r1.d()
                r1.setValue(r10)
            L64:
                java.lang.Boolean r10 = r9.f
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r4)
                boolean r10 = kotlin.jvm.internal.g0.g(r10, r1)
                if (r10 == 0) goto L95
                com.bxkj.base.v2.base.BaseViewModel r10 = r9.g
                androidx.lifecycle.MutableLiveData r10 = r10.c()
                com.bxkj.base.v2.base.BaseViewModel r1 = r9.g
                androidx.lifecycle.MutableLiveData r1 = r1.c()
                java.lang.Object r1 = r1.getValue()
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 == 0) goto L8e
                int r1 = r1.intValue()
                int r1 = r1 + r4
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.f(r1)
                goto L92
            L8e:
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.f(r4)
            L92:
                r10.setValue(r1)
            L95:
                kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r10 = r9.h     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L50
                r9.d = r4     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L50
                java.lang.Object r10 = r10.invoke(r9)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L50
                if (r10 != r0) goto La1
                goto L20a
            La1:
                java.lang.Boolean r10 = r9.f
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r4)
                boolean r10 = kotlin.jvm.internal.g0.g(r10, r1)
                if (r10 == 0) goto Ld2
                com.bxkj.base.v2.base.BaseViewModel r10 = r9.g
                androidx.lifecycle.MutableLiveData r10 = r10.c()
                com.bxkj.base.v2.base.BaseViewModel r1 = r9.g
                androidx.lifecycle.MutableLiveData r1 = r1.c()
                java.lang.Object r1 = r1.getValue()
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 == 0) goto Lcb
                int r1 = r1.intValue()
                int r1 = r1 - r4
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.f(r1)
                goto Lcf
            Lcb:
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.f(r2)
            Lcf:
                r10.setValue(r1)
            Ld2:
                kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r10 = r9.f593m
                if (r10 == 0) goto L1c7
                r1 = 2
                r9.d = r1
                java.lang.Object r10 = r10.invoke(r9)
                if (r10 != r0) goto L1c7
                goto L20a
            Le1:
                kotlin.jvm.functions.Function2<java.lang.Exception, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> r10 = r9.i     // Catch: java.lang.Throwable -> L2e
                if (r10 == 0) goto Lf7
                r9.a = r1     // Catch: java.lang.Throwable -> L2e
                r5 = 3
                r9.d = r5     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r10 = r10.invoke(r1, r9)     // Catch: java.lang.Throwable -> L2e
                if (r10 != r0) goto Lf2
                goto L20a
            Lf2:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L2e
                r5 = r1
                r1 = r10
                goto Lf9
            Lf7:
                r5 = r1
                r1 = r3
            Lf9:
                if (r1 == 0) goto L105
                java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.a.a(r2)     // Catch: java.lang.Throwable -> L2e
                boolean r10 = kotlin.jvm.internal.g0.g(r1, r10)     // Catch: java.lang.Throwable -> L2e
                if (r10 == 0) goto L182
            L105:
                boolean r10 = r5 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L2e
                if (r10 == 0) goto L13a
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
                r10.<init>()     // Catch: java.lang.Throwable -> L2e
                java.lang.String r6 = "网络请求已取消"
                r10.append(r6)     // Catch: java.lang.Throwable -> L2e
                r10.append(r5)     // Catch: java.lang.Throwable -> L2e
                java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L2e
                java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2e
                com.orhanobut.logger.j.d(r10, r6)     // Catch: java.lang.Throwable -> L2e
                kotlin.jvm.functions.Function2<java.lang.Exception, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r10 = r9.j     // Catch: java.lang.Throwable -> L2e
                if (r10 == 0) goto L182
                java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r5)     // Catch: java.lang.Throwable -> L2e
                r9.a = r6     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r1 = kotlin.coroutines.jvm.internal.j.a(r1)     // Catch: java.lang.Throwable -> L2e
                r9.b = r1     // Catch: java.lang.Throwable -> L2e
                r1 = 4
                r9.d = r1     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r10 = r10.invoke(r5, r9)     // Catch: java.lang.Throwable -> L2e
                if (r10 != r0) goto L182
                goto L20a
            L13a:
                kotlin.jvm.functions.Function2<java.lang.Exception, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> r10 = r9.k     // Catch: java.lang.Throwable -> L2e
                if (r10 == 0) goto L154
                r9.a = r5     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r1)     // Catch: java.lang.Throwable -> L2e
                r9.b = r6     // Catch: java.lang.Throwable -> L2e
                r6 = 5
                r9.d = r6     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r10 = r10.invoke(r5, r9)     // Catch: java.lang.Throwable -> L2e
                if (r10 != r0) goto L151
                goto L20a
            L151:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L2e
                goto L155
            L154:
                r10 = r3
            L155:
                if (r10 == 0) goto L161
                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.a.a(r2)     // Catch: java.lang.Throwable -> L2e
                boolean r6 = kotlin.jvm.internal.g0.g(r10, r6)     // Catch: java.lang.Throwable -> L2e
                if (r6 == 0) goto L182
            L161:
                com.bxkj.base.v2.base.BaseViewModel r6 = r9.g     // Catch: java.lang.Throwable -> L2e
                kotlin.jvm.functions.Function2<com.bxkj.base.v2.http.exception.ApiException, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> r7 = r9.f592l     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r8 = kotlin.coroutines.jvm.internal.j.a(r5)     // Catch: java.lang.Throwable -> L2e
                r9.a = r8     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r1 = kotlin.coroutines.jvm.internal.j.a(r1)     // Catch: java.lang.Throwable -> L2e
                r9.b = r1     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r10)     // Catch: java.lang.Throwable -> L2e
                r9.c = r10     // Catch: java.lang.Throwable -> L2e
                r10 = 6
                r9.d = r10     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r10 = com.bxkj.base.v2.base.BaseViewModel.a(r6, r5, r7, r9)     // Catch: java.lang.Throwable -> L2e
                if (r10 != r0) goto L182
                goto L20a
            L182:
                java.lang.Boolean r10 = r9.f
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r4)
                boolean r10 = kotlin.jvm.internal.g0.g(r10, r1)
                if (r10 == 0) goto L1b3
                com.bxkj.base.v2.base.BaseViewModel r10 = r9.g
                androidx.lifecycle.MutableLiveData r10 = r10.c()
                com.bxkj.base.v2.base.BaseViewModel r1 = r9.g
                androidx.lifecycle.MutableLiveData r1 = r1.c()
                java.lang.Object r1 = r1.getValue()
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 == 0) goto L1ac
                int r1 = r1.intValue()
                int r1 = r1 - r4
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.f(r1)
                goto L1b0
            L1ac:
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.f(r2)
            L1b0:
                r10.setValue(r1)
            L1b3:
                kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r10 = r9.f593m
                if (r10 == 0) goto L1c7
                r9.a = r3
                r9.b = r3
                r9.c = r3
                r1 = 7
                r9.d = r1
                java.lang.Object r10 = r10.invoke(r9)
                if (r10 != r0) goto L1c7
                goto L20a
            L1c7:
                kotlin.n1 r10 = kotlin.n1.a
                return r10
            L1ca:
                java.lang.Boolean r1 = r9.f
                java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r4)
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r5)
                if (r1 == 0) goto L1f6
                com.bxkj.base.v2.base.BaseViewModel r1 = r9.g
                androidx.lifecycle.MutableLiveData r1 = r1.c()
                com.bxkj.base.v2.base.BaseViewModel r5 = r9.g
                androidx.lifecycle.MutableLiveData r5 = r5.c()
                java.lang.Object r5 = r5.getValue()
                java.lang.Integer r5 = (java.lang.Integer) r5
                if (r5 == 0) goto L1ef
                int r2 = r5.intValue()
                int r2 = r2 - r4
            L1ef:
                java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.f(r2)
                r1.setValue(r2)
            L1f6:
                kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r1 = r9.f593m
                if (r1 == 0) goto L20d
                r9.a = r10
                r9.b = r3
                r9.c = r3
                r2 = 8
                r9.d = r2
                java.lang.Object r1 = r1.invoke(r9)
                if (r1 != r0) goto L20b
            L20a:
                return r0
            L20b:
                r0 = r10
            L20c:
                r10 = r0
            L20d:
                throw r10
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.base.v2.base.BaseViewModel", f = "BaseViewModel.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3}, l = {176, 176, 176, 184}, m = "onError", n = {"e", "otherCode", "code", "msg", "e", "otherCode", "code", "msg", "e", "otherCode", "code", "msg", "e", "otherCode"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        java.lang.Object d;
        java.lang.Object e;
        /* synthetic */ java.lang.Object f;
        final /* synthetic */ com.bxkj.base.v2.base.BaseViewModel g;
        int h;

        b(com.bxkj.base.v2.base.BaseViewModel r1, kotlin.coroutines.e<? super com.bxkj.base.v2.base.BaseViewModel.b> r2) {
                r0 = this;
                r0.g = r1
                r0.<init>(r2)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.f = r2
                int r2 = r1.h
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.h = r2
                com.bxkj.base.v2.base.BaseViewModel r2 = r1.g
                r0 = 0
                java.lang.Object r2 = com.bxkj.base.v2.base.BaseViewModel.a(r2, r0, r0, r1)
                return r2
        }
    }

    public BaseViewModel() {
            r2 = this;
            r2.<init>()
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            r2.a = r0
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            java.lang.String r1 = "Loading..."
            r0.<init>(r1)
            r2.b = r0
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            r2.c = r0
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            r2.d = r0
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            r2.e = r0
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            r2.f = r0
            return
    }

    public static final /* synthetic */ java.lang.Object a(com.bxkj.base.v2.base.BaseViewModel r0, java.lang.Exception r1, kotlin.jvm.functions.Function2 r2, kotlin.coroutines.e r3) {
            java.lang.Object r0 = r0.m(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.e2 j(com.bxkj.base.v2.base.BaseViewModel r1, kotlin.jvm.functions.Function1 r2, kotlin.jvm.functions.Function2 r3, kotlin.jvm.functions.Function2 r4, kotlin.jvm.functions.Function2 r5, kotlin.jvm.functions.Function1 r6, kotlin.jvm.functions.Function2 r7, java.lang.Boolean r8, java.lang.String r9, int r10, java.lang.Object r11) {
            if (r11 != 0) goto L2d
            r11 = r10 & 2
            r0 = 0
            if (r11 == 0) goto L8
            r3 = r0
        L8:
            r11 = r10 & 4
            if (r11 == 0) goto Ld
            r4 = r0
        Ld:
            r11 = r10 & 8
            if (r11 == 0) goto L12
            r5 = r0
        L12:
            r11 = r10 & 16
            if (r11 == 0) goto L17
            r6 = r0
        L17:
            r11 = r10 & 32
            if (r11 == 0) goto L1c
            r7 = r0
        L1c:
            r11 = r10 & 64
            if (r11 == 0) goto L22
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
        L22:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L28
            java.lang.String r9 = "Loading.."
        L28:
            kotlinx.coroutines.e2 r1 = r1.i(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        L2d:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: launch"
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ void l(com.bxkj.base.v2.base.BaseViewModel r1, kotlin.jvm.functions.Function1 r2, kotlin.jvm.functions.Function2 r3, kotlin.jvm.functions.Function2 r4, kotlin.jvm.functions.Function2 r5, kotlin.jvm.functions.Function1 r6, kotlin.jvm.functions.Function2 r7, int r8, java.lang.Object r9) {
            if (r9 != 0) goto L20
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto L8
            r3 = r0
        L8:
            r9 = r8 & 4
            if (r9 == 0) goto Ld
            r4 = r0
        Ld:
            r9 = r8 & 8
            if (r9 == 0) goto L12
            r5 = r0
        L12:
            r9 = r8 & 16
            if (r9 == 0) goto L17
            r6 = r0
        L17:
            r8 = r8 & 32
            if (r8 == 0) goto L1c
            r7 = r0
        L1c:
            r1.k(r2, r3, r4, r5, r6, r7)
            return
        L20:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: launchWithOutLoading"
            r1.<init>(r2)
            throw r1
    }

    private final java.lang.Object m(java.lang.Exception r13, kotlin.jvm.functions.Function2<? super com.bxkj.base.v2.http.exception.ApiException, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r14, kotlin.coroutines.e<? super kotlin.n1> r15) {
            r12 = this;
            boolean r0 = r15 instanceof com.bxkj.base.v2.base.BaseViewModel.b
            if (r0 == 0) goto L13
            r0 = r15
            com.bxkj.base.v2.base.BaseViewModel$b r0 = (com.bxkj.base.v2.base.BaseViewModel.b) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            com.bxkj.base.v2.base.BaseViewModel$b r0 = new com.bxkj.base.v2.base.BaseViewModel$b
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.h
            r3 = 4
            r4 = 3
            java.lang.String r5 = "】"
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L74
            if (r2 == r7) goto L5f
            if (r2 == r6) goto L5f
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r13 = r0.b
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            java.lang.Object r13 = r0.a
            java.lang.Exception r13 = (java.lang.Exception) r13
            kotlin.g0.n(r15)
            goto L253
        L3e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L46:
            java.lang.Object r13 = r0.e
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.Object r14 = r0.d
            kotlin.jvm.internal.Ref$ObjectRef r14 = (kotlin.jvm.internal.Ref.ObjectRef) r14
            java.lang.Object r14 = r0.c
            kotlin.jvm.internal.Ref$IntRef r14 = (kotlin.jvm.internal.Ref.IntRef) r14
            java.lang.Object r14 = r0.b
            kotlin.jvm.functions.Function2 r14 = (kotlin.jvm.functions.Function2) r14
            java.lang.Object r14 = r0.a
            java.lang.Exception r14 = (java.lang.Exception) r14
            kotlin.g0.n(r15)
            goto L1df
        L5f:
            java.lang.Object r13 = r0.d
            kotlin.jvm.internal.Ref$ObjectRef r13 = (kotlin.jvm.internal.Ref.ObjectRef) r13
            java.lang.Object r13 = r0.c
            kotlin.jvm.internal.Ref$IntRef r13 = (kotlin.jvm.internal.Ref.IntRef) r13
            java.lang.Object r13 = r0.b
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            java.lang.Object r13 = r0.a
            java.lang.Exception r13 = (java.lang.Exception) r13
            kotlin.g0.n(r15)
            goto L33d
        L74:
            kotlin.g0.n(r15)
            java.lang.String r15 = com.bxkj.base.v2.common.ext.e.a(r13)
            r2 = 0
            java.lang.Object[] r9 = new java.lang.Object[r2]
            com.orhanobut.logger.j.e(r15, r9)
            boolean r15 = r13 instanceof retrofit2.HttpException
            if (r15 == 0) goto L23c
            r15 = r13
            retrofit2.HttpException r15 = (retrofit2.HttpException) r15
            int r3 = r15.code()
            retrofit2.c0 r9 = r15.response()
            if (r9 == 0) goto La3
            okhttp3.Response r9 = r9.i()
            if (r9 == 0) goto La3
            okhttp3.Request r9 = r9.request()
            if (r9 == 0) goto La3
            okhttp3.HttpUrl r9 = r9.url()
            goto La4
        La3:
            r9 = r8
        La4:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "http code="
            r10.append(r11)
            r10.append(r3)
            java.lang.String r3 = " error url="
            r10.append(r3)
            r10.append(r9)
            java.lang.String r3 = r10.toString()
            java.lang.Object[] r9 = new java.lang.Object[r2]
            com.orhanobut.logger.j.e(r3, r9)
            int r3 = r15.code()
            r9 = 401(0x191, float:5.62E-43)
            if (r3 == r9) goto L223
            r9 = 426(0x1aa, float:5.97E-43)
            if (r3 == r9) goto L21a
            r9 = 500(0x1f4, float:7.0E-43)
            if (r3 == r9) goto L211
            r9 = 403(0x193, float:5.65E-43)
            if (r3 == r9) goto L208
            r9 = 404(0x194, float:5.66E-43)
            if (r3 == r9) goto L1ff
            r9 = 502(0x1f6, float:7.03E-43)
            if (r3 == r9) goto L1e0
            r9 = 503(0x1f7, float:7.05E-43)
            if (r3 == r9) goto L1e0
            kotlin.jvm.internal.Ref$IntRef r3 = new kotlin.jvm.internal.Ref$IntRef
            r3.<init>()
            int r15 = r15.code()
            r3.element = r15
            kotlin.jvm.internal.Ref$ObjectRef r15 = new kotlin.jvm.internal.Ref$ObjectRef
            r15.<init>()
            int r9 = r3.element
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "连接服务器错误，错误码【"
            r10.append(r11)
            r10.append(r9)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            r15.element = r5
            r5 = r13
            retrofit2.HttpException r5 = (retrofit2.HttpException) r5     // Catch: java.lang.Throwable -> L118 java.lang.Exception -> L11b
            retrofit2.c0 r5 = r5.response()     // Catch: java.lang.Throwable -> L118 java.lang.Exception -> L11b
            if (r5 == 0) goto L11d
            okhttp3.ResponseBody r5 = r5.e()     // Catch: java.lang.Throwable -> L118 java.lang.Exception -> L11b
            goto L11e
        L118:
            r2 = move-exception
            goto L1ab
        L11b:
            r5 = move-exception
            goto L171
        L11d:
            r5 = r8
        L11e:
            com.bxkj.base.v2.common.utils.x r9 = com.bxkj.base.v2.common.utils.x.a     // Catch: java.lang.Throwable -> L118 java.lang.Exception -> L11b
            if (r5 == 0) goto L126
            java.lang.String r8 = r5.string()     // Catch: java.lang.Throwable -> L118 java.lang.Exception -> L11b
        L126:
            java.util.Map r5 = r9.A(r8)     // Catch: java.lang.Throwable -> L118 java.lang.Exception -> L11b
            java.lang.String r8 = "code"
            int r10 = r3.element     // Catch: java.lang.Throwable -> L118 java.lang.Exception -> L11b
            int r8 = r9.l(r5, r8, r10)     // Catch: java.lang.Throwable -> L118 java.lang.Exception -> L11b
            r3.element = r8     // Catch: java.lang.Throwable -> L118 java.lang.Exception -> L11b
            java.lang.String r8 = "msg"
            java.lang.Object r10 = r15.element     // Catch: java.lang.Throwable -> L118 java.lang.Exception -> L11b
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L118 java.lang.Exception -> L11b
            java.lang.String r5 = r9.u(r5, r8, r10)     // Catch: java.lang.Throwable -> L118 java.lang.Exception -> L11b
            r15.element = r5     // Catch: java.lang.Throwable -> L118 java.lang.Exception -> L11b
            com.bxkj.base.v2.http.exception.ApiException r2 = new com.bxkj.base.v2.http.exception.ApiException
            int r4 = r3.element
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.a.f(r4)
            java.lang.Object r5 = r15.element
            java.lang.String r5 = (java.lang.String) r5
            r2.<init>(r4, r5)
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r13)
            r0.a = r13
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r14)
            r0.b = r13
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r3)
            r0.c = r13
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r15)
            r0.d = r13
            r0.h = r7
            java.lang.Object r13 = r12.m(r2, r14, r0)
            if (r13 != r1) goto L33d
            goto L252
        L171:
            java.lang.String r5 = com.bxkj.base.v2.common.ext.e.a(r5)     // Catch: java.lang.Throwable -> L118
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L118
            com.orhanobut.logger.j.e(r5, r2)     // Catch: java.lang.Throwable -> L118
            com.bxkj.base.v2.http.exception.ApiException r2 = new com.bxkj.base.v2.http.exception.ApiException
            int r4 = r3.element
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.a.f(r4)
            java.lang.Object r5 = r15.element
            java.lang.String r5 = (java.lang.String) r5
            r2.<init>(r4, r5)
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r13)
            r0.a = r13
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r14)
            r0.b = r13
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r3)
            r0.c = r13
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r15)
            r0.d = r13
            r0.h = r6
            java.lang.Object r13 = r12.m(r2, r14, r0)
            if (r13 != r1) goto L33d
            goto L252
        L1ab:
            com.bxkj.base.v2.http.exception.ApiException r5 = new com.bxkj.base.v2.http.exception.ApiException
            int r6 = r3.element
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.f(r6)
            java.lang.Object r7 = r15.element
            java.lang.String r7 = (java.lang.String) r7
            r5.<init>(r6, r7)
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r13)
            r0.a = r13
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r14)
            r0.b = r13
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r3)
            r0.c = r13
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r15)
            r0.d = r13
            r0.e = r2
            r0.h = r4
            java.lang.Object r13 = r12.m(r5, r14, r0)
            if (r13 != r1) goto L1de
            goto L252
        L1de:
            r13 = r2
        L1df:
            throw r13
        L1e0:
            androidx.lifecycle.MutableLiveData<java.lang.String> r13 = r12.c
            int r14 = r15.code()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "服务器维护中,错误码【"
            r15.append(r0)
            r15.append(r14)
            r15.append(r5)
            java.lang.String r14 = r15.toString()
            r13.postValue(r14)
            goto L33d
        L1ff:
            androidx.lifecycle.MutableLiveData<java.lang.String> r13 = r12.c
            java.lang.String r14 = "未发现服务,错误码【404】"
            r13.postValue(r14)
            goto L33d
        L208:
            androidx.lifecycle.MutableLiveData<java.lang.String> r13 = r12.c
            java.lang.String r14 = "鉴权失败，请更新最新版APP"
            r13.postValue(r14)
            goto L33d
        L211:
            androidx.lifecycle.MutableLiveData<java.lang.String> r13 = r12.c
            java.lang.String r14 = "服务器内部错误,错误码【500】"
            r13.postValue(r14)
            goto L33d
        L21a:
            androidx.lifecycle.MutableLiveData<java.lang.String> r13 = r12.c
            java.lang.String r14 = "用户名或密码错误"
            r13.postValue(r14)
            goto L33d
        L223:
            com.bxkj.base.v2.data.b$a r13 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r14 = r13.a()
            r14.z0(r2)
            com.bxkj.base.v2.data.b r13 = r13.a()
            r13.f()
            androidx.lifecycle.MutableLiveData<java.lang.String> r13 = r12.c
            java.lang.String r14 = "登录失效,请重新登录"
            r13.postValue(r14)
            goto L33d
        L23c:
            boolean r15 = r13 instanceof com.bxkj.base.v2.http.exception.ApiException
            if (r15 == 0) goto L29d
            if (r14 == 0) goto L256
            r0.a = r13
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.j.a(r14)
            r0.b = r15
            r0.h = r3
            java.lang.Object r15 = r14.invoke(r13, r0)
            if (r15 != r1) goto L253
        L252:
            return r1
        L253:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            goto L257
        L256:
            r15 = r8
        L257:
            if (r15 == 0) goto L25f
            boolean r14 = r15.booleanValue()
            if (r14 != 0) goto L260
        L25f:
            r8 = r12
        L260:
            if (r8 == 0) goto L33d
            com.bxkj.base.v2.http.exception.ApiException r13 = (com.bxkj.base.v2.http.exception.ApiException) r13
            java.lang.String r14 = r13.getMessage()
            if (r14 == 0) goto L27e
            int r14 = r14.length()
            if (r14 != 0) goto L271
            goto L27e
        L271:
            java.lang.String r13 = r13.getMessage()
            if (r13 == 0) goto L33d
            androidx.lifecycle.MutableLiveData<java.lang.String> r14 = r12.c
            r14.postValue(r13)
            goto L33d
        L27e:
            androidx.lifecycle.MutableLiveData<java.lang.String> r14 = r12.c
            java.lang.Integer r13 = r13.getCode()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "请求服务器错误，错误码【"
            r15.append(r0)
            r15.append(r13)
            r15.append(r5)
            java.lang.String r13 = r15.toString()
            r14.postValue(r13)
            goto L33d
        L29d:
            boolean r14 = r13 instanceof java.net.UnknownHostException
            if (r14 == 0) goto L2aa
            androidx.lifecycle.MutableLiveData<java.lang.String> r13 = r12.c
            java.lang.String r14 = "请检查手机网络"
            r13.postValue(r14)
            goto L33d
        L2aa:
            boolean r14 = r13 instanceof java.net.ConnectException
            if (r14 == 0) goto L2b7
            androidx.lifecycle.MutableLiveData<java.lang.String> r13 = r12.c
            java.lang.String r14 = "网络连接失败"
            r13.postValue(r14)
            goto L33d
        L2b7:
            boolean r14 = r13 instanceof java.net.SocketTimeoutException
            if (r14 == 0) goto L2c4
            androidx.lifecycle.MutableLiveData<java.lang.String> r13 = r12.c
            java.lang.String r14 = "网络连接超时"
            r13.postValue(r14)
            goto L33d
        L2c4:
            boolean r14 = r13 instanceof org.json.JSONException
            java.lang.String r15 = "数据解析错误"
            if (r14 == 0) goto L2d1
            androidx.lifecycle.MutableLiveData<java.lang.String> r13 = r12.c
            r13.postValue(r15)
            goto L33d
        L2d1:
            boolean r14 = r13 instanceof com.alibaba.fastjson.JSONException
            if (r14 == 0) goto L2db
            androidx.lifecycle.MutableLiveData<java.lang.String> r13 = r12.c
            r13.postValue(r15)
            goto L33d
        L2db:
            boolean r14 = r13 instanceof com.google.gson.JsonParseException
            if (r14 == 0) goto L2e5
            androidx.lifecycle.MutableLiveData<java.lang.String> r13 = r12.c
            r13.postValue(r15)
            goto L33d
        L2e5:
            boolean r14 = r13 instanceof javax.net.ssl.SSLHandshakeException
            if (r14 == 0) goto L2f1
            androidx.lifecycle.MutableLiveData<java.lang.String> r13 = r12.c
            java.lang.String r14 = "网络错误，错误码【1007】"
            r13.postValue(r14)
            goto L33d
        L2f1:
            boolean r14 = r13 instanceof java.lang.IllegalStateException
            java.lang.String r15 = "服务器数据异常，请稍后再试"
            if (r14 == 0) goto L313
            java.lang.String r13 = r13.getMessage()
            if (r13 == 0) goto L30b
            java.lang.String r14 = "Expected BEGIN_OBJECT but was STRING"
            boolean r13 = kotlin.text.u.l3(r13, r14, r2, r6, r8)
            if (r13 != r7) goto L30b
            androidx.lifecycle.MutableLiveData<java.lang.String> r13 = r12.c
            r13.postValue(r15)
            goto L33d
        L30b:
            androidx.lifecycle.MutableLiveData<java.lang.String> r13 = r12.c
            java.lang.String r14 = "系统内部错误，请升级或重启App后重试"
            r13.postValue(r14)
            goto L33d
        L313:
            boolean r14 = r13 instanceof java.io.IOException
            if (r14 == 0) goto L31d
            androidx.lifecycle.MutableLiveData<java.lang.String> r13 = r12.c
            r13.postValue(r15)
            goto L33d
        L31d:
            boolean r14 = r13 instanceof android.database.sqlite.SQLiteFullException
            java.lang.String r15 = "手机内存已满，请清除部分空间后再进行操作"
            if (r14 == 0) goto L329
            androidx.lifecycle.MutableLiveData<java.lang.String> r13 = r12.c
            r13.postValue(r15)
            goto L33d
        L329:
            boolean r14 = r13 instanceof net.sqlcipher.database.SQLiteFullException
            if (r14 == 0) goto L333
            androidx.lifecycle.MutableLiveData<java.lang.String> r13 = r12.c
            r13.postValue(r15)
            goto L33d
        L333:
            com.tencent.bugly.crashreport.CrashReport.postCatchedException(r13)
            androidx.lifecycle.MutableLiveData<java.lang.String> r13 = r12.c
            java.lang.String r14 = "系统内部错误,请升级或重启App后重试"
            r13.postValue(r14)
        L33d:
            kotlin.n1 r13 = kotlin.n1.a
            return r13
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.e2 b() {
            r1 = this;
            kotlinx.coroutines.e2 r0 = r1.g
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> c() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> d() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> e() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> f() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r1.f
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> g() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r1.e
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> h() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected final kotlinx.coroutines.e2 i(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r13, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super com.bxkj.base.v2.http.exception.ApiException, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r14, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super java.lang.Exception, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r15, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super java.lang.Exception, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r16, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r17, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super java.lang.Exception, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r18, @org.jetbrains.annotations.Nullable java.lang.Boolean r19, @org.jetbrains.annotations.Nullable java.lang.String r20) {
            r12 = this;
            java.lang.String r0 = "success"
            kotlin.jvm.internal.g0.p(r13, r0)
            kotlinx.coroutines.r0 r0 = androidx.lifecycle.ViewModelKt.getViewModelScope(r12)
            com.bxkj.base.v2.base.BaseViewModel$a r1 = new com.bxkj.base.v2.base.BaseViewModel$a
            r11 = 0
            r4 = r12
            r5 = r13
            r9 = r14
            r8 = r15
            r7 = r16
            r10 = r17
            r6 = r18
            r3 = r19
            r2 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13 = 3
            r14 = 0
            r15 = 0
            r2 = 0
            r18 = r14
            r14 = r15
            r13 = r0
            r16 = r1
            r15 = r2
            r17 = 3
            kotlinx.coroutines.e2 r13 = kotlinx.coroutines.i.e(r13, r14, r15, r16, r17, r18)
            r12.g = r13
            return r13
    }

    protected final void k(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r13, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super com.bxkj.base.v2.http.exception.ApiException, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r14, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super java.lang.Exception, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r15, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super java.lang.Exception, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r16, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r17, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super java.lang.Exception, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r18) {
            r12 = this;
            java.lang.String r0 = "success"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r10 = 128(0x80, float:1.8E-43)
            r11 = 0
            r9 = 0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            kotlinx.coroutines.e2 r13 = j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.g = r13
            return
    }

    public final void n(@org.jetbrains.annotations.Nullable kotlinx.coroutines.e2 r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public final void o(@org.jetbrains.annotations.NotNull androidx.lifecycle.MutableLiveData<java.lang.String> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.b = r2
            return
    }

    public final void p(@org.jetbrains.annotations.NotNull androidx.lifecycle.MutableLiveData<java.lang.String> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.c = r2
            return
    }

    public final void q(@org.jetbrains.annotations.NotNull androidx.lifecycle.MutableLiveData<java.lang.String> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f = r2
            return
    }

    public final void r(@org.jetbrains.annotations.NotNull androidx.lifecycle.MutableLiveData<java.lang.String> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.e = r2
            return
    }

    public final void s(@org.jetbrains.annotations.NotNull androidx.lifecycle.MutableLiveData<java.lang.String> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.d = r2
            return
    }
}
