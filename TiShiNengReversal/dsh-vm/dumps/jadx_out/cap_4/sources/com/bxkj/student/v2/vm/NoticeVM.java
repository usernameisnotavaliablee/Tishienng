package com.bxkj.student.v2.vm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class NoticeVM extends com.bxkj.base.v2.base.BaseViewModel {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.NoticeVM$getLatestUnreadNotice$1", f = "NoticeVM.kt", i = {}, l = {16}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ java.lang.String b;

        a(java.lang.String r1, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.NoticeVM.a> r2) {
                r0 = this;
                r0.b = r1
                r1 = 1
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r3) {
                r2 = this;
                com.bxkj.student.v2.vm.NoticeVM$a r0 = new com.bxkj.student.v2.vm.NoticeVM$a
                java.lang.String r1 = r2.b
                r0.<init>(r1, r3)
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
                com.bxkj.student.v2.vm.NoticeVM$a r2 = (com.bxkj.student.v2.vm.NoticeVM.a) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r3.a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r4)
                goto L2a
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.g0.n(r4)
                com.bxkj.student.v2.repository.c r4 = new com.bxkj.student.v2.repository.c
                r4.<init>()
                java.lang.String r1 = r3.b
                r3.a = r2
                java.lang.Object r4 = r4.h(r1, r3)
                if (r4 != r0) goto L2a
                return r0
            L2a:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.NoticeVM$getLatestUnreadNotice$2", f = "NoticeVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> b;

        b(kotlin.jvm.functions.Function0<kotlin.n1> r1, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.NoticeVM.b> r2) {
                r0 = this;
                r0.b = r1
                r1 = 1
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r3) {
                r2 = this;
                com.bxkj.student.v2.vm.NoticeVM$b r0 = new com.bxkj.student.v2.vm.NoticeVM$b
                kotlin.jvm.functions.Function0<kotlin.n1> r1 = r2.b
                r0.<init>(r1, r3)
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
                com.bxkj.student.v2.vm.NoticeVM$b r2 = (com.bxkj.student.v2.vm.NoticeVM.b) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r1.a
                if (r0 != 0) goto L12
                kotlin.g0.n(r2)
                kotlin.jvm.functions.Function0<kotlin.n1> r2 = r1.b
                r2.invoke()
                kotlin.n1 r2 = kotlin.n1.a
                return r2
            L12:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
        }
    }

    public NoticeVM() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void t(@org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r14) {
            r12 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "complete"
            kotlin.jvm.internal.g0.p(r14, r0)
            com.bxkj.student.v2.vm.NoticeVM$a r2 = new com.bxkj.student.v2.vm.NoticeVM$a
            r0 = 0
            r2.<init>(r13, r0)
            com.bxkj.student.v2.vm.NoticeVM$b r6 = new com.bxkj.student.v2.vm.NoticeVM$b
            r6.<init>(r14, r0)
            r10 = 238(0xee, float:3.34E-43)
            r11 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r12
            com.bxkj.base.v2.base.BaseViewModel.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }
}
