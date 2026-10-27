package com.bxkj.student.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class k {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.utils.k.a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.v2.common.utils.k$a$a, reason: collision with other inner class name */
        public static final class C0144a implements com.bxkj.base.v2.common.qrcode.b.a {
            final /* synthetic */ androidx.fragment.app.FragmentActivity a;

            C0144a(androidx.fragment.app.FragmentActivity r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.bxkj.base.v2.common.qrcode.b.a
            public void a(java.lang.String r6) {
                    r5 = this;
                    java.lang.String r0 = "result"
                    kotlin.jvm.internal.g0.p(r6, r0)
                    r0 = 2
                    r1 = 0
                    java.lang.String r2 = "http"
                    r3 = 0
                    boolean r0 = kotlin.text.u.H2(r6, r2, r3, r0, r1)
                    if (r0 == 0) goto L2b
                    com.bxkj.student.v2.common.utils.h r0 = com.bxkj.student.v2.common.utils.h.a
                    androidx.fragment.app.FragmentActivity r1 = r5.a
                    java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                    r2.<init>()
                    java.lang.String r3 = "name"
                    java.lang.String r4 = "扫一扫"
                    r2.put(r3, r4)
                    java.lang.String r3 = "linkUrl"
                    r2.put(r3, r6)
                    kotlin.n1 r6 = kotlin.n1.a
                    r0.b(r1, r2)
                    return
                L2b:
                    androidx.fragment.app.FragmentActivity r0 = r5.a
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "扫码结果:"
                    r1.append(r2)
                    r1.append(r6)
                    java.lang.String r6 = r1.toString()
                    com.bxkj.base.v2.common.ext.ContextExtKt.m(r0, r6)
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

        public static /* synthetic */ kotlin.n1 a(androidx.fragment.app.FragmentActivity r0) {
                kotlin.n1 r0 = c(r0)
                return r0
        }

        private final void b(java.util.Map<java.lang.String, ? extends java.lang.Object> r7, androidx.fragment.app.FragmentActivity r8) {
                r6 = this;
                com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
                java.lang.String r1 = "name"
                java.lang.String r2 = r0.t(r7, r1)
                java.lang.String r3 = "mkey"
                java.lang.String r3 = r0.t(r7, r3)
                int r4 = r3.hashCode()
                java.lang.String r5 = "title"
                switch(r4) {
                    case -1760034926: goto L112;
                    case -1686065413: goto Lf6;
                    case -1554031739: goto Lde;
                    case -1478425721: goto Lc2;
                    case -1181718421: goto Lb9;
                    case -286799507: goto Lb0;
                    case 110354812: goto La0;
                    case 854407579: goto L83;
                    case 1224119340: goto L79;
                    case 1272599731: goto L65;
                    case 1308825129: goto L5b;
                    case 1411687673: goto L42;
                    case 1471997269: goto L38;
                    case 1619344274: goto L2e;
                    case 1967995040: goto L19;
                    default: goto L17;
                }
            L17:
                goto L11a
            L19:
                java.lang.String r1 = "AIFitness"
                boolean r1 = r3.equals(r1)
                if (r1 != 0) goto L23
                goto L11a
            L23:
                com.bxkj.student.v2.common.utils.j r7 = new com.bxkj.student.v2.common.utils.j
                r7.<init>(r8)
                java.lang.String r0 = "AI健身"
                com.bxkj.base.v2.common.ext.t.p(r8, r0, r7)
                return
            L2e:
                java.lang.String r1 = "aboutKey"
                boolean r1 = r3.equals(r1)
                if (r1 != 0) goto L4c
                goto L11a
            L38:
                java.lang.String r2 = "appRunKey"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto Lcb
                goto L11a
            L42:
                java.lang.String r1 = "aboutKey-t"
                boolean r1 = r3.equals(r1)
                if (r1 != 0) goto L4c
                goto L11a
            L4c:
                android.content.Intent r7 = new android.content.Intent
                java.lang.Class<com.bxkj.student.v2.ui.my.AboutUsActivity> r0 = com.bxkj.student.v2.ui.my.AboutUsActivity.class
                r7.<init>(r8, r0)
                android.content.Intent r7 = r7.putExtra(r5, r2)
                r8.startActivity(r7)
                return
            L5b:
                java.lang.String r2 = "ts-appRunRecord"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L8d
                goto L11a
            L65:
                java.lang.String r1 = "app_home_menu_more"
                boolean r1 = r3.equals(r1)
                if (r1 != 0) goto L6f
                goto L11a
            L6f:
                boolean r7 = r8 instanceof com.bxkj.student.v2.ui.MainActivity
                if (r7 == 0) goto L78
                com.bxkj.student.v2.ui.MainActivity r8 = (com.bxkj.student.v2.ui.MainActivity) r8
                r8.V()
            L78:
                return
            L79:
                java.lang.String r1 = "myQrCodeKey-t"
                boolean r1 = r3.equals(r1)
                if (r1 != 0) goto Le7
                goto L11a
            L83:
                java.lang.String r2 = "appRunRecord"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L8d
                goto L11a
            L8d:
                android.content.Intent r2 = new android.content.Intent
                java.lang.Class<com.bxkj.student.v2.ui.sports.v3.record.V3RecordListActivity> r3 = com.bxkj.student.v2.ui.sports.v3.record.V3RecordListActivity.class
                r2.<init>(r8, r3)
                java.lang.String r7 = r0.t(r7, r1)
                android.content.Intent r7 = r2.putExtra(r5, r7)
                r8.startActivity(r7)
                return
            La0:
                java.lang.String r1 = "tice3"
                boolean r1 = r3.equals(r1)
                if (r1 != 0) goto Laa
                goto L11a
            Laa:
                com.bxkj.student.v2.common.utils.h r0 = com.bxkj.student.v2.common.utils.h.a
                r0.b(r8, r7)
                return
            Lb0:
                java.lang.String r2 = "appRunStatistics"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto Lff
                goto L11a
            Lb9:
                java.lang.String r1 = "scanQRCode"
                boolean r1 = r3.equals(r1)
                if (r1 != 0) goto L132
                goto L11a
            Lc2:
                java.lang.String r2 = "ts-appRunKey"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto Lcb
                goto L11a
            Lcb:
                android.content.Intent r2 = new android.content.Intent
                java.lang.Class<com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity> r3 = com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.class
                r2.<init>(r8, r3)
                java.lang.String r7 = r0.t(r7, r1)
                android.content.Intent r7 = r2.putExtra(r5, r7)
                r8.startActivity(r7)
                return
            Lde:
                java.lang.String r1 = "myQrCodeKey"
                boolean r1 = r3.equals(r1)
                if (r1 != 0) goto Le7
                goto L11a
            Le7:
                android.content.Intent r7 = new android.content.Intent
                java.lang.Class<com.bxkj.student.v2.ui.my.MyQRCodeActivity> r0 = com.bxkj.student.v2.ui.my.MyQRCodeActivity.class
                r7.<init>(r8, r0)
                android.content.Intent r7 = r7.putExtra(r5, r2)
                r8.startActivity(r7)
                return
            Lf6:
                java.lang.String r2 = "ts-appRunStatistics"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto Lff
                goto L11a
            Lff:
                android.content.Intent r2 = new android.content.Intent
                java.lang.Class<com.bxkj.student.v2.ui.sports.v3.set.V3StatisticsActivity> r3 = com.bxkj.student.v2.ui.sports.v3.set.V3StatisticsActivity.class
                r2.<init>(r8, r3)
                java.lang.String r7 = r0.t(r7, r1)
                android.content.Intent r7 = r2.putExtra(r5, r7)
                r8.startActivity(r7)
                return
            L112:
                java.lang.String r1 = "scanQRCode-t"
                boolean r1 = r3.equals(r1)
                if (r1 != 0) goto L132
            L11a:
                java.lang.String r1 = "linkUrl"
                java.lang.String r0 = r0.t(r7, r1)
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L12c
                java.lang.String r7 = "暂未开通此权限"
                com.bxkj.base.v2.common.ext.ContextExtKt.t(r8, r7)
                return
            L12c:
                com.bxkj.student.v2.common.utils.h r0 = com.bxkj.student.v2.common.utils.h.a
                r0.b(r8, r7)
                return
            L132:
                com.bxkj.base.v2.common.qrcode.b r7 = new com.bxkj.base.v2.common.qrcode.b
                r7.<init>(r8)
                com.bxkj.student.v2.common.utils.k$a$a r0 = new com.bxkj.student.v2.common.utils.k$a$a
                r0.<init>(r8)
                r7.m(r0)
                return
        }

        private static final kotlin.n1 c(androidx.fragment.app.FragmentActivity r2) {
                android.content.Intent r0 = new android.content.Intent
                java.lang.Class<com.bxkj.student.v2.ai.fitness.AIFitnessHomeActivity> r1 = com.bxkj.student.v2.ai.fitness.AIFitnessHomeActivity.class
                r0.<init>(r2, r1)
                r2.startActivity(r0)
                kotlin.n1 r2 = kotlin.n1.a
                return r2
        }

        public final void d(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r3, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r4, @org.jetbrains.annotations.NotNull java.lang.String r5) {
                r2 = this;
                java.lang.String r0 = "mContext"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "menu"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "menuType"
                kotlin.jvm.internal.g0.p(r5, r0)
                com.bxkj.base.v2.common.utils.x r5 = com.bxkj.base.v2.common.utils.x.a
                java.lang.String r0 = "isEnabled"
                java.lang.String r0 = r5.t(r4, r0)
                java.lang.String r1 = "1"
                boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
                if (r0 == 0) goto L42
                java.lang.String r0 = "isLogin"
                boolean r5 = r5.d(r4, r0)
                if (r5 == 0) goto L3e
                com.bxkj.base.v2.data.b$a r5 = com.bxkj.base.v2.data.b.d
                com.bxkj.base.v2.data.b r5 = r5.a()
                boolean r5 = r5.Y()
                if (r5 != 0) goto L3e
                android.content.Intent r4 = new android.content.Intent
                java.lang.Class<com.bxkj.student.v2.ui.LoginActivity> r5 = com.bxkj.student.v2.ui.LoginActivity.class
                r4.<init>(r3, r5)
                r3.startActivity(r4)
                return
            L3e:
                r2.b(r4, r3)
                return
            L42:
                java.lang.String r4 = "暂未开通此权限"
                com.bxkj.base.v2.common.ext.ContextExtKt.t(r3, r4)
                return
        }
    }

    static {
            com.bxkj.student.v2.common.utils.k$a r0 = new com.bxkj.student.v2.common.utils.k$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.v2.common.utils.k.a = r0
            return
    }

    public k() {
            r0 = this;
            r0.<init>()
            return
    }
}
