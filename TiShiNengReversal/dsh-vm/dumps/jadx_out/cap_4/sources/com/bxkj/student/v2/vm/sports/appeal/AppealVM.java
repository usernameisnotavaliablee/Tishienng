package com.bxkj.student.v2.vm.sports.appeal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class AppealVM extends com.bxkj.base.v2.base.BaseViewModel {

    @org.jetbrains.annotations.Nullable
    private java.lang.String h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.sports.appeal.AppealVM$appealV3$1", f = "AppealVM.kt", i = {0}, l = {47}, m = "invokeSuspend", n = {"parts"}, s = {"L$0"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAppealVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppealVM.kt\ncom/bxkj/student/v2/vm/sports/appeal/AppealVM$appealV3$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n1869#2,2:54\n*S KotlinDebug\n*F\n+ 1 AppealVM.kt\ncom/bxkj/student/v2/vm/sports/appeal/AppealVM$appealV3$1\n*L\n36#1:54,2\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        int b;
        final /* synthetic */ com.bxkj.student.v2.vm.sports.appeal.AppealVM c;
        final /* synthetic */ java.util.List<java.lang.String> d;
        final /* synthetic */ java.lang.String e;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> f;

        a(com.bxkj.student.v2.vm.sports.appeal.AppealVM r1, java.util.List<java.lang.String> r2, java.lang.String r3, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.n1> r4, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.sports.appeal.AppealVM.a> r5) {
                r0 = this;
                r0.c = r1
                r0.d = r2
                r0.e = r3
                r0.f = r4
                r1 = 1
                r0.<init>(r1, r5)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r7) {
                r6 = this;
                com.bxkj.student.v2.vm.sports.appeal.AppealVM$a r0 = new com.bxkj.student.v2.vm.sports.appeal.AppealVM$a
                com.bxkj.student.v2.vm.sports.appeal.AppealVM r1 = r6.c
                java.util.List<java.lang.String> r2 = r6.d
                java.lang.String r3 = r6.e
                kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> r4 = r6.f
                r5 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                kotlin.coroutines.e r1 = (kotlin.coroutines.e) r1
                java.lang.Object r1 = r0.invoke(r1)
                return r1
        }

        public final java.lang.Object invoke(kotlin.coroutines.e<? super kotlin.n1> r2) {
                r1 = this;
                kotlin.coroutines.e r2 = r1.create(r2)
                com.bxkj.student.v2.vm.sports.appeal.AppealVM$a r2 = (com.bxkj.student.v2.vm.sports.appeal.AppealVM.a) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r7.b
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r7.a
                java.util.List r0 = (java.util.List) r0
                kotlin.g0.n(r8)
                goto Lac
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                kotlin.g0.n(r8)
                com.bxkj.student.v2.vm.sports.appeal.AppealVM r8 = r7.c
                java.lang.String r8 = r8.u()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "exerciseRecordId="
                r1.append(r3)
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                com.orhanobut.logger.j.d(r8, r1)
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.List<java.lang.String> r1 = r7.d
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L49:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L78
                java.lang.Object r3 = r1.next()
                java.lang.String r3 = (java.lang.String) r3
                java.io.File r4 = new java.io.File
                r4.<init>(r3)
                okhttp3.RequestBody$Companion r3 = okhttp3.RequestBody.Companion
                okhttp3.MediaType$Companion r5 = okhttp3.MediaType.Companion
                java.lang.String r6 = "application/octet-stream"
                okhttp3.MediaType r5 = r5.parse(r6)
                okhttp3.RequestBody r3 = r3.create(r5, r4)
                okhttp3.MultipartBody$Part$Companion r5 = okhttp3.MultipartBody.Part.Companion
                java.lang.String r6 = "file"
                java.lang.String r4 = r4.getName()
                okhttp3.MultipartBody$Part r3 = r5.createFormData(r6, r4, r3)
                r8.add(r3)
                goto L49
            L78:
                okhttp3.MultipartBody$Part$Companion r1 = okhttp3.MultipartBody.Part.Companion
                com.bxkj.student.v2.vm.sports.appeal.AppealVM r3 = r7.c
                java.lang.String r3 = r3.u()
                java.lang.String r3 = java.lang.String.valueOf(r3)
                java.lang.String r4 = "exerciseRecordId"
                okhttp3.MultipartBody$Part r3 = r1.createFormData(r4, r3)
                r8.add(r3)
                java.lang.String r3 = "content"
                java.lang.String r4 = r7.e
                okhttp3.MultipartBody$Part r1 = r1.createFormData(r3, r4)
                r8.add(r1)
                com.bxkj.student.v2.repository.sports.c r1 = new com.bxkj.student.v2.repository.sports.c
                r1.<init>()
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.j.a(r8)
                r7.a = r3
                r7.b = r2
                java.lang.Object r8 = r1.a(r8, r7)
                if (r8 != r0) goto Lac
                return r0
            Lac:
                com.bxkj.base.v2.http.result.ApiResult r8 = (com.bxkj.base.v2.http.result.ApiResult) r8
                if (r8 == 0) goto Lb5
                java.lang.String r8 = r8.getMsg()
                goto Lb6
            Lb5:
                r8 = 0
            Lb6:
                kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> r0 = r7.f
                r0.invoke(r8)
                kotlin.n1 r8 = kotlin.n1.a
                return r8
        }
    }

    public AppealVM() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void t(@org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.n1> r14) {
            r11 = this;
            java.lang.String r0 = "reason"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "paths"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "callBack"
            kotlin.jvm.internal.g0.p(r14, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L1f
            androidx.lifecycle.MutableLiveData r12 = r11.f()
            java.lang.String r13 = "请输入申诉理由"
            r12.postValue(r13)
            return
        L1f:
            com.bxkj.student.v2.vm.sports.appeal.AppealVM$a r0 = new com.bxkj.student.v2.vm.sports.appeal.AppealVM$a
            r5 = 0
            r1 = r11
            r3 = r12
            r2 = r13
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r9 = 254(0xfe, float:3.56E-43)
            r10 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r0
            r0 = r11
            com.bxkj.base.v2.base.BaseViewModel.j(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String u() {
            r1 = this;
            java.lang.String r0 = r1.h
            return r0
    }

    public final void v(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.h = r1
            return
    }
}
