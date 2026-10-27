package com.bxkj.student.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class p {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.utils.p.a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSQZSManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SQZSManager.kt\ncom/bxkj/student/v2/common/utils/SQZSManager$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
    public static final class a {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.v2.common.utils.p$a$a, reason: collision with other inner class name */
        public static final class C0145a implements t.b.a {
            final /* synthetic */ androidx.fragment.app.FragmentActivity a;
            final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> b;
            final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> c;

            C0145a(androidx.fragment.app.FragmentActivity r1, kotlin.jvm.functions.Function0<kotlin.n1> r2, kotlin.jvm.functions.Function0<kotlin.n1> r3) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.c = r3
                    r0.<init>()
                    return
            }

            @Override // t.b.a
            public void a(int r3, android.content.Intent r4) {
                    r2 = this;
                    com.bxkj.student.v2.common.utils.p$a r3 = com.bxkj.student.v2.common.utils.p.a
                    androidx.fragment.app.FragmentActivity r4 = r2.a
                    kotlin.jvm.functions.Function0<kotlin.n1> r0 = r2.b
                    kotlin.jvm.functions.Function0<kotlin.n1> r1 = r2.c
                    r3.c(r4, r0, r1)
                    return
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

        public static /* synthetic */ void a(kotlin.jvm.functions.Function0 r0, kotlin.jvm.functions.Function0 r1, androidx.fragment.app.FragmentActivity r2, java.lang.String r3) {
                d(r0, r1, r2, r3)
                return
        }

        private static final void d(kotlin.jvm.functions.Function0 r2, kotlin.jvm.functions.Function0 r3, androidx.fragment.app.FragmentActivity r4, java.lang.String r5) {
                if (r5 == 0) goto L51
                int r0 = r5.hashCode()
                r1 = 48
                if (r0 == r1) goto L2d
                r1 = 50
                if (r0 == r1) goto L20
                r1 = 52
                if (r0 == r1) goto L13
                goto L35
            L13:
                java.lang.String r0 = "4"
                boolean r5 = r5.equals(r0)
                if (r5 != 0) goto L1c
                goto L35
            L1c:
                r3.invoke()
                return
            L20:
                java.lang.String r0 = "2"
                boolean r5 = r5.equals(r0)
                if (r5 != 0) goto L29
                goto L35
            L29:
                r2.invoke()
                return
            L2d:
                java.lang.String r0 = "0"
                boolean r5 = r5.equals(r0)
                if (r5 != 0) goto L4e
            L35:
                t.b r5 = new t.b
                r5.<init>(r4)
                android.content.Intent r0 = new android.content.Intent
                java.lang.Class<com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity> r1 = com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity.class
                r0.<init>(r4, r1)
                t.b r5 = r5.startActivityForResult(r0)
                com.bxkj.student.v2.common.utils.p$a$a r0 = new com.bxkj.student.v2.common.utils.p$a$a
                r0.<init>(r4, r2, r3)
                r5.c(r0)
                return
            L4e:
                r2.invoke()
            L51:
                return
        }

        public final boolean b() {
                r1 = this;
                boolean r0 = com.acse.ottn.activity.AcseHelpManager.isOPenPermission()
                return r0
        }

        public final void c(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r7) {
                r4 = this;
                java.lang.String r0 = "mActivity"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "next"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "close"
                kotlin.jvm.internal.g0.p(r7, r0)
                com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
                com.bxkj.base.v2.data.b r0 = r0.a()
                int r0 = r0.b0()
                r1 = 0
                if (r0 != 0) goto L27
                java.lang.String r5 = "LoggedInUser.instance.isOpenSQZS = 0"
                java.lang.Object[] r7 = new java.lang.Object[r1]
                com.orhanobut.logger.j.d(r5, r7)
                r6.invoke()
                return
            L27:
                boolean r0 = r4.b()
                if (r0 == 0) goto L38
                java.lang.String r5 = "AcseHelpManager.isOPenPermission->权限已开启"
                java.lang.Object[] r7 = new java.lang.Object[r1]
                com.orhanobut.logger.j.d(r5, r7)
                r6.invoke()
                return
            L38:
                java.lang.String r0 = "SHA-256"
                java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Exception -> L62
                com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> L62
                java.lang.String r2 = r2.getSchoolId()     // Catch: java.lang.Exception -> L62
                java.lang.String r3 = "getSchoolId(...)"
                kotlin.jvm.internal.g0.o(r2, r3)     // Catch: java.lang.Exception -> L62
                byte[] r2 = kotlin.text.u.V1(r2)     // Catch: java.lang.Exception -> L62
                byte[] r0 = r0.digest(r2)     // Catch: java.lang.Exception -> L62
                java.lang.String r0 = com.bxkj.student.v2.common.utils.b.b(r0)     // Catch: java.lang.Exception -> L62
                java.lang.String r2 = "encode(...)"
                kotlin.jvm.internal.g0.o(r0, r2)     // Catch: java.lang.Exception -> L62
                java.lang.String r2 = "0"
                com.acse.ottn.activity.AcseHelpManager.syncUserIdState(r2, r0)     // Catch: java.lang.Exception -> L62
                goto L6e
            L62:
                r0 = move-exception
                java.lang.String r0 = r0.getMessage()
                if (r0 == 0) goto L6e
                java.lang.Object[] r1 = new java.lang.Object[r1]
                com.orhanobut.logger.j.e(r0, r1)
            L6e:
                com.bxkj.student.v2.common.utils.o r0 = new com.bxkj.student.v2.common.utils.o
                r0.<init>(r6, r7, r5)
                r6 = 1
                com.acse.ottn.activity.AcseHelpManager.startRunning(r5, r6, r0)
                return
        }

        public final void e(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2) {
                r1 = this;
                java.lang.String r0 = "mActivity"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 170(0xaa, float:2.38E-43)
                com.acse.ottn.activity.AcseHelpManager.startAccessibilityIntroduceActivityForResult(r2, r0)
                return
        }
    }

    static {
            com.bxkj.student.v2.common.utils.p$a r0 = new com.bxkj.student.v2.common.utils.p$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.v2.common.utils.p.a = r0
            return
    }

    public p() {
            r0 = this;
            r0.<init>()
            return
    }
}
