package com.bxkj.student.run.extraclass;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class SignTypeActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.AcExtraExerciseTypeBinding, com.bxkj.base.v2.base.BaseViewModel> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements com.bxkj.base.v2.common.qrcode.b.a {
        final /* synthetic */ com.bxkj.student.run.extraclass.SignTypeActivity a;
        final /* synthetic */ java.lang.String b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.run.extraclass.SignTypeActivity$a$a, reason: collision with other inner class name */
        public static final class C0138a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.student.run.extraclass.SignTypeActivity a;

            C0138a(com.bxkj.student.run.extraclass.SignTypeActivity r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, ? extends java.lang.Object> r2) {
                    r1 = this;
                    java.lang.String r0 = "data"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, ? extends java.lang.Object> r4, java.lang.String r5) {
                    r3 = this;
                    java.lang.String r0 = "data"
                    kotlin.jvm.internal.g0.p(r4, r0)
                    java.lang.String r4 = "msg"
                    kotlin.jvm.internal.g0.p(r5, r4)
                    com.bxkj.student.run.extraclass.SignTypeActivity r4 = r3.a
                    r0 = 2
                    r1 = 0
                    r2 = 0
                    com.bxkj.base.v2.common.ext.ContextExtKt.s(r4, r5, r2, r0, r1)
                    return
            }
        }

        a(com.bxkj.student.run.extraclass.SignTypeActivity r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // com.bxkj.base.v2.common.qrcode.b.a
        public void a(java.lang.String r10) {
                r9 = this;
                java.lang.String r0 = "result"
                kotlin.jvm.internal.g0.p(r10, r0)
                b0.b r0 = b0.b.a
                com.bxkj.student.run.extraclass.SignTypeActivity r1 = r9.a
                android.content.Context r1 = r1.G()
                java.lang.String r0 = r0.j(r1)
                r1 = 16
                r2 = 0
                java.lang.String r0 = r0.substring(r2, r1)
                java.lang.String r1 = "substring(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                java.lang.String r3 = com.bxkj.base.util.a.a(r10, r0)
                if (r3 == 0) goto L90
                r10 = 2
                r0 = 0
                java.lang.String r1 = "#"
                boolean r10 = kotlin.text.u.l3(r3, r1, r2, r10, r0)
                if (r10 == 0) goto L90
                java.lang.String[] r4 = new java.lang.String[]{r1}
                r7 = 6
                r8 = 0
                r5 = 0
                r6 = 0
                java.util.List r10 = kotlin.text.u.m5(r3, r4, r5, r6, r7, r8)
                java.lang.Object r0 = r10.get(r2)
                java.lang.String r0 = (java.lang.String) r0
                r1 = 1
                java.lang.Object r10 = r10.get(r1)
                java.lang.String r10 = (java.lang.String) r10
                long r1 = java.lang.System.currentTimeMillis()
                long r3 = java.lang.Long.parseLong(r10)
                long r1 = r1 - r3
                r3 = 30000(0x7530, double:1.4822E-319)
                int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r10 <= 0) goto L5d
                com.bxkj.student.run.extraclass.SignTypeActivity r10 = r9.a
                java.lang.String r0 = "二维码已过期"
                com.bxkj.base.v2.common.ext.ContextExtKt.q(r10, r0)
                return
            L5d:
                com.bxkj.student.run.extraclass.SignTypeActivity r10 = r9.a
                android.content.Context r10 = r10.G()
                cn.bluemobi.dylan.http.HttpRequest r10 = cn.bluemobi.dylan.http.Http.with(r10)
                cn.bluemobi.dylan.http.HttpRequest r10 = r10.hideSuccessMessage()
                java.lang.Class<d0.a> r1 = d0.a.class
                java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
                d0.a r1 = (d0.a) r1
                com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r2 = r2.getAccount()
                java.lang.String r3 = r9.b
                rx.e r0 = r1.v0(r0, r2, r3)
                cn.bluemobi.dylan.http.HttpRequest r10 = r10.setObservable(r0)
                com.bxkj.student.run.extraclass.SignTypeActivity$a$a r0 = new com.bxkj.student.run.extraclass.SignTypeActivity$a$a
                com.bxkj.student.run.extraclass.SignTypeActivity r1 = r9.a
                r0.<init>(r1)
                r10.setDataListener(r0)
                return
            L90:
                com.bxkj.student.run.extraclass.SignTypeActivity r10 = r9.a
                java.lang.String r0 = "无效码"
                com.bxkj.base.v2.common.ext.ContextExtKt.q(r10, r0)
                return
        }
    }

    public SignTypeActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void L() {
            r1 = this;
            java.lang.String r0 = "1"
            r1.e(r0)
            return
    }

    public final void M() {
            r1 = this;
            java.lang.String r0 = "0"
            r1.e(r0)
            return
    }

    public final void e(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r3, r0)
            com.bxkj.base.v2.common.qrcode.b r0 = new com.bxkj.base.v2.common.qrcode.b
            androidx.fragment.app.FragmentActivity r1 = r2.q()
            r0.<init>(r1)
            com.bxkj.student.run.extraclass.SignTypeActivity$a r1 = new com.bxkj.student.run.extraclass.SignTypeActivity$a
            r1.<init>(r2, r3)
            r0.m(r1)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r0 = this;
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r1 = this;
            androidx.databinding.ViewDataBinding r0 = r1.K()
            com.bxkj.student.databinding.AcExtraExerciseTypeBinding r0 = (com.bxkj.student.databinding.AcExtraExerciseTypeBinding) r0
            r0.setSignTypeActivity(r1)
            return
    }
}
