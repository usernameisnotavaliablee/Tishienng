package com.bxkj.student.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class l {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.utils.l a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.common.utils.NtpTimeSync$getNtpTime$2", f = "NtpTimeSync.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super java.lang.Long>, java.lang.Object> {
        int a;

        a(kotlin.coroutines.e<? super com.bxkj.student.v2.common.utils.l.a> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r1, kotlin.coroutines.e<?> r2) {
                r0 = this;
                com.bxkj.student.v2.common.utils.l$a r1 = new com.bxkj.student.v2.common.utils.l$a
                r1.<init>(r2)
                return r1
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super java.lang.Long> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.common.utils.l$a r1 = (com.bxkj.student.v2.common.utils.l.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r2.a
                if (r0 != 0) goto L46
                kotlin.g0.n(r3)
                org.apache.commons.net.ntp.a r3 = new org.apache.commons.net.ntp.a
                r3.<init>()
                r3.i()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                java.lang.String r0 = "cn.pool.ntp.org"
                java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                org.apache.commons.net.ntp.e r0 = r3.p(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                org.apache.commons.net.ntp.d r0 = r0.f()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                org.apache.commons.net.ntp.TimeStamp r0 = r0.C()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                long r0 = r0.getTime()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                java.lang.Long r0 = kotlin.coroutines.jvm.internal.a.g(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                r3.a()
                return r0
            L30:
                r0 = move-exception
                goto L42
            L32:
                r0 = move-exception
                java.lang.String r0 = com.bxkj.base.v2.common.ext.e.a(r0)     // Catch: java.lang.Throwable -> L30
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L30
                com.orhanobut.logger.j.e(r0, r1)     // Catch: java.lang.Throwable -> L30
                r3.a()
                r3 = 0
                return r3
            L42:
                r3.a()
                throw r0
            L46:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
        }
    }

    static {
            com.bxkj.student.v2.common.utils.l r0 = new com.bxkj.student.v2.common.utils.l
            r0.<init>()
            com.bxkj.student.v2.common.utils.l.a = r0
            return
    }

    private l() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Long> r4) {
            r3 = this;
            kotlinx.coroutines.m0 r0 = kotlinx.coroutines.g1.c()
            com.bxkj.student.v2.common.utils.l$a r1 = new com.bxkj.student.v2.common.utils.l$a
            r2 = 0
            r1.<init>(r2)
            java.lang.Object r4 = kotlinx.coroutines.i.h(r0, r1, r4)
            return r4
    }
}
