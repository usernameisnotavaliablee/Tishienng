package com.bxkj.student.v2.vm.my;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class BugReportVM extends com.bxkj.base.v2.base.BaseViewModel {

    @org.jetbrains.annotations.NotNull
    private final kotlin.s h;

    @org.jetbrains.annotations.Nullable
    private java.lang.String i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.my.BugReportVM$commit$1", f = "BugReportVM.kt", i = {0, 0, 0, 0, 0, 0}, l = {67}, m = "invokeSuspend", n = {"parts", "key", "shareFile", "shareFileBody", "dbFile", "dbFileBody"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBugReportVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BugReportVM.kt\ncom/bxkj/student/v2/vm/my/BugReportVM$commit$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1869#2,2:82\n1#3:84\n*S KotlinDebug\n*F\n+ 1 BugReportVM.kt\ncom/bxkj/student/v2/vm/my/BugReportVM$commit$1\n*L\n48#1:82,2\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        java.lang.Object d;
        java.lang.Object e;
        java.lang.Object f;
        int g;
        final /* synthetic */ com.bxkj.student.v2.vm.my.BugReportVM h;
        final /* synthetic */ java.util.List<java.lang.String> i;
        final /* synthetic */ java.lang.String j;
        final /* synthetic */ java.lang.String k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> f1546l;

        a(com.bxkj.student.v2.vm.my.BugReportVM r1, java.util.List<java.lang.String> r2, java.lang.String r3, java.lang.String r4, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.n1> r5, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.my.BugReportVM.a> r6) {
                r0 = this;
                r0.h = r1
                r0.i = r2
                r0.j = r3
                r0.k = r4
                r0.f1546l = r5
                r1 = 1
                r0.<init>(r1, r6)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r8) {
                r7 = this;
                com.bxkj.student.v2.vm.my.BugReportVM$a r0 = new com.bxkj.student.v2.vm.my.BugReportVM$a
                com.bxkj.student.v2.vm.my.BugReportVM r1 = r7.h
                java.util.List<java.lang.String> r2 = r7.i
                java.lang.String r3 = r7.j
                java.lang.String r4 = r7.k
                kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> r5 = r7.f1546l
                r6 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
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
                com.bxkj.student.v2.vm.my.BugReportVM$a r2 = (com.bxkj.student.v2.vm.my.BugReportVM.a) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r12.g
                r2 = 1
                if (r1 == 0) goto L30
                if (r1 != r2) goto L28
                java.lang.Object r0 = r12.f
                okhttp3.RequestBody r0 = (okhttp3.RequestBody) r0
                java.lang.Object r0 = r12.e
                java.io.File r0 = (java.io.File) r0
                java.lang.Object r0 = r12.d
                okhttp3.RequestBody r0 = (okhttp3.RequestBody) r0
                java.lang.Object r0 = r12.c
                java.io.File r0 = (java.io.File) r0
                java.lang.Object r0 = r12.b
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r12.a
                java.util.List r0 = (java.util.List) r0
                kotlin.g0.n(r13)
                goto L1eb
            L28:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L30:
                kotlin.g0.n(r13)
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>()
                com.bxkj.student.v2.common.db.AppDatabase$a r1 = com.bxkj.student.v2.common.db.AppDatabase.a
                com.bxkj.student.v2.common.db.AppDatabase r1 = r1.a()
                r1.close()
                com.bxkj.student.v2.vm.my.BugReportVM r1 = r12.h
                java.io.File r1 = com.bxkj.student.v2.vm.my.BugReportVM.v(r1)
                okhttp3.RequestBody$Companion r3 = okhttp3.RequestBody.Companion
                okhttp3.MediaType$Companion r4 = okhttp3.MediaType.Companion
                java.lang.String r5 = "application/xml"
                okhttp3.MediaType r5 = r4.parse(r5)
                okhttp3.RequestBody r5 = r3.create(r5, r1)
                okhttp3.MultipartBody$Part$Companion r6 = okhttp3.MultipartBody.Part.Companion
                java.lang.String r7 = r1.getName()
                java.lang.String r8 = "files"
                okhttp3.MultipartBody$Part r7 = r6.createFormData(r8, r7, r5)
                r13.add(r7)
                com.bxkj.student.v2.vm.my.BugReportVM r7 = r12.h
                java.io.File r7 = com.bxkj.student.v2.vm.my.BugReportVM.u(r7)
                java.lang.String r9 = "application/db"
                okhttp3.MediaType r4 = r4.parse(r9)
                okhttp3.RequestBody r3 = r3.create(r4, r7)
                java.lang.String r4 = r7.getName()
                okhttp3.MultipartBody$Part r4 = r6.createFormData(r8, r4, r3)
                r13.add(r4)
                java.util.List<java.lang.String> r4 = r12.i
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.Iterator r4 = r4.iterator()
            L87:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto Lb4
                java.lang.Object r6 = r4.next()
                java.lang.String r6 = (java.lang.String) r6
                java.io.File r9 = new java.io.File
                r9.<init>(r6)
                okhttp3.RequestBody$Companion r6 = okhttp3.RequestBody.Companion
                okhttp3.MediaType$Companion r10 = okhttp3.MediaType.Companion
                java.lang.String r11 = "application/octet-stream"
                okhttp3.MediaType r10 = r10.parse(r11)
                okhttp3.RequestBody r6 = r6.create(r10, r9)
                okhttp3.MultipartBody$Part$Companion r10 = okhttp3.MultipartBody.Part.Companion
                java.lang.String r9 = r9.getName()
                okhttp3.MultipartBody$Part r6 = r10.createFormData(r8, r9, r6)
                r13.add(r6)
                goto L87
            Lb4:
                okhttp3.MultipartBody$Part$Companion r4 = okhttp3.MultipartBody.Part.Companion
                java.lang.String r6 = r12.j
                java.lang.String r9 = r12.k
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r6)
                java.lang.String r6 = "【联系方式："
                r10.append(r6)
                r10.append(r9)
                java.lang.String r6 = "】"
                r10.append(r6)
                java.lang.String r6 = r10.toString()
                java.lang.String r9 = "note"
                okhttp3.MultipartBody$Part r6 = r4.createFormData(r9, r6)
                r13.add(r6)
                com.bxkj.base.v2.data.b$a r6 = com.bxkj.base.v2.data.b.d
                com.bxkj.base.v2.data.b r9 = r6.a()
                java.lang.String r9 = r9.J()
                java.lang.String r10 = "schoolCode"
                okhttp3.MultipartBody$Part r9 = r4.createFormData(r10, r9)
                r13.add(r9)
                com.bxkj.base.v2.data.b r6 = r6.a()
                java.lang.String r6 = r6.S()
                java.lang.String r9 = "userNum"
                okhttp3.MultipartBody$Part r6 = r4.createFormData(r9, r6)
                r13.add(r6)
                java.lang.String r6 = "appType"
                java.lang.String r9 = "Android"
                okhttp3.MultipartBody$Part r6 = r4.createFormData(r6, r9)
                r13.add(r6)
                b0.a r6 = b0.a.a
                java.util.Map r9 = r6.a()
                java.lang.String r10 = "versionCode"
                java.lang.Object r9 = r9.get(r10)
                java.lang.String r11 = ""
                if (r9 != 0) goto L11c
                r9 = r11
            L11c:
                java.lang.String r9 = java.lang.String.valueOf(r9)
                okhttp3.MultipartBody$Part r9 = r4.createFormData(r10, r9)
                r13.add(r9)
                java.util.Map r9 = r6.a()
                java.lang.String r10 = "versionName"
                java.lang.Object r9 = r9.get(r10)
                if (r9 != 0) goto L134
                r9 = r11
            L134:
                java.lang.String r9 = java.lang.String.valueOf(r9)
                okhttp3.MultipartBody$Part r9 = r4.createFormData(r10, r9)
                r13.add(r9)
                java.util.Map r9 = r6.a()
                java.lang.String r10 = "signatureMD5"
                java.lang.Object r9 = r9.get(r10)
                if (r9 != 0) goto L14c
                r9 = r11
            L14c:
                java.lang.String r9 = java.lang.String.valueOf(r9)
                okhttp3.MultipartBody$Part r9 = r4.createFormData(r10, r9)
                r13.add(r9)
                java.util.Map r9 = r6.a()
                java.lang.String r10 = "brand"
                java.lang.Object r9 = r9.get(r10)
                if (r9 != 0) goto L164
                r9 = r11
            L164:
                java.lang.String r9 = java.lang.String.valueOf(r9)
                okhttp3.MultipartBody$Part r9 = r4.createFormData(r10, r9)
                r13.add(r9)
                java.util.Map r9 = r6.a()
                java.lang.String r10 = "model"
                java.lang.Object r9 = r9.get(r10)
                if (r9 != 0) goto L17c
                r9 = r11
            L17c:
                java.lang.String r9 = java.lang.String.valueOf(r9)
                okhttp3.MultipartBody$Part r9 = r4.createFormData(r10, r9)
                r13.add(r9)
                java.util.Map r9 = r6.a()
                java.lang.String r10 = "system"
                java.lang.Object r9 = r9.get(r10)
                if (r9 != 0) goto L194
                r9 = r11
            L194:
                java.lang.String r9 = java.lang.String.valueOf(r9)
                okhttp3.MultipartBody$Part r9 = r4.createFormData(r10, r9)
                r13.add(r9)
                java.util.Map r6 = r6.a()
                java.lang.String r9 = "version"
                java.lang.Object r6 = r6.get(r9)
                if (r6 != 0) goto L1ac
                goto L1ad
            L1ac:
                r11 = r6
            L1ad:
                java.lang.String r6 = java.lang.String.valueOf(r11)
                okhttp3.MultipartBody$Part r4 = r4.createFormData(r9, r6)
                r13.add(r4)
                com.bxkj.student.v2.vm.my.BugReportVM r4 = r12.h
                com.bxkj.student.v2.repository.my.b r4 = r4.y()
                java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r13)
                r12.a = r6
                java.lang.Object r6 = kotlin.coroutines.jvm.internal.j.a(r8)
                r12.b = r6
                java.lang.Object r1 = kotlin.coroutines.jvm.internal.j.a(r1)
                r12.c = r1
                java.lang.Object r1 = kotlin.coroutines.jvm.internal.j.a(r5)
                r12.d = r1
                java.lang.Object r1 = kotlin.coroutines.jvm.internal.j.a(r7)
                r12.e = r1
                java.lang.Object r1 = kotlin.coroutines.jvm.internal.j.a(r3)
                r12.f = r1
                r12.g = r2
                java.lang.Object r13 = r4.a(r13, r12)
                if (r13 != r0) goto L1eb
                return r0
            L1eb:
                com.bxkj.base.v2.http.result.OldApiResult r13 = (com.bxkj.base.v2.http.result.OldApiResult) r13
                if (r13 == 0) goto L1f4
                java.lang.String r13 = r13.getReturnMsg()
                goto L1f5
            L1f4:
                r13 = 0
            L1f5:
                kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> r0 = r12.f1546l
                r0.invoke(r13)
                kotlin.n1 r13 = kotlin.n1.a
                return r13
        }
    }

    public BugReportVM() {
            r1 = this;
            r1.<init>()
            com.bxkj.student.v2.vm.my.b r0 = new com.bxkj.student.v2.vm.my.b
            r0.<init>()
            kotlin.s r0 = kotlin.t.c(r0)
            r1.h = r0
            return
    }

    private final java.io.File B() {
            r3 = this;
            java.io.File r0 = new java.io.File
            com.bxkj.student.App$a r1 = com.bxkj.student.App.d
            com.bxkj.student.App r1 = r1.a()
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r1 = r1.getParent()
            java.lang.String r2 = "shared_prefs"
            r0.<init>(r1, r2)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "share_date.xml"
            r1.<init>(r0, r2)
            return r1
    }

    public static /* synthetic */ com.bxkj.student.v2.repository.my.b t() {
            com.bxkj.student.v2.repository.my.b r0 = w()
            return r0
    }

    public static final /* synthetic */ java.io.File u(com.bxkj.student.v2.vm.my.BugReportVM r0) {
            java.io.File r0 = r0.z()
            return r0
    }

    public static final /* synthetic */ java.io.File v(com.bxkj.student.v2.vm.my.BugReportVM r0) {
            java.io.File r0 = r0.B()
            return r0
    }

    private static final com.bxkj.student.v2.repository.my.b w() {
            com.bxkj.student.v2.repository.my.b r0 = new com.bxkj.student.v2.repository.my.b
            r0.<init>()
            return r0
    }

    private final java.io.File z() {
            r2 = this;
            com.bxkj.student.App$a r0 = com.bxkj.student.App.d
            com.bxkj.student.App r0 = r0.a()
            java.lang.String r1 = "TSNStudent.db"
            java.io.File r0 = r0.getDatabasePath(r1)
            java.lang.String r1 = "getDatabasePath(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String A() {
            r1 = this;
            java.lang.String r0 = r1.i
            return r0
    }

    public final void C(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public final void x(@org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r14, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.n1> r15) {
            r11 = this;
            java.lang.String r0 = "phone"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "note"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "paths"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "callBack"
            kotlin.jvm.internal.g0.p(r15, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L24
            androidx.lifecycle.MutableLiveData r12 = r11.f()
            java.lang.String r13 = "请留下您的联系方式，便于我们联系您"
            r12.postValue(r13)
            return
        L24:
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L34
            androidx.lifecycle.MutableLiveData r12 = r11.f()
            java.lang.String r13 = "请输入您遇到了什么bug？"
            r12.postValue(r13)
            return
        L34:
            com.bxkj.student.v2.vm.my.BugReportVM$a r0 = new com.bxkj.student.v2.vm.my.BugReportVM$a
            r6 = 0
            r1 = r11
            r4 = r12
            r3 = r13
            r2 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9 = 254(0xfe, float:3.56E-43)
            r10 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r1 = r0
            r0 = r11
            com.bxkj.base.v2.base.BaseViewModel.j(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.bxkj.student.v2.repository.my.b y() {
            r1 = this;
            kotlin.s r0 = r1.h
            java.lang.Object r0 = r0.getValue()
            com.bxkj.student.v2.repository.my.b r0 = (com.bxkj.student.v2.repository.my.b) r0
            return r0
    }
}
