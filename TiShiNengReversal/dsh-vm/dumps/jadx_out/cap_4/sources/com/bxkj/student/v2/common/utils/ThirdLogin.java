package com.bxkj.student.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class ThirdLogin {

    @org.jetbrains.annotations.NotNull
    private final android.app.Activity a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public final class MyUMAuthListener implements com.umeng.socialize.UMAuthListener {

        @org.jetbrains.annotations.NotNull
        private final kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.String>, kotlin.n1> a;
        final /* synthetic */ com.bxkj.student.v2.common.utils.ThirdLogin b;

        public MyUMAuthListener(@org.jetbrains.annotations.NotNull com.bxkj.student.v2.common.utils.ThirdLogin r2, kotlin.jvm.functions.Function1<? super java.util.Map<java.lang.String, java.lang.String>, kotlin.n1> r3) {
                r1 = this;
                java.lang.String r0 = "bind"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.b = r2
                r1.<init>()
                r1.a = r3
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.String>, kotlin.n1> a() {
                r1 = this;
                kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.String>, kotlin.n1> r0 = r1.a
                return r0
        }

        public void onCancel(@org.jetbrains.annotations.NotNull com.umeng.socialize.bean.SHARE_MEDIA r1, int r2) {
                r0 = this;
                java.lang.String r2 = "platform"
                kotlin.jvm.internal.g0.p(r1, r2)
                com.bxkj.student.v2.common.utils.ThirdLogin r1 = r0.b
                android.app.Activity r1 = r1.a()
                java.lang.String r2 = "您取消了绑定"
                com.bxkj.base.v2.common.ext.ContextExtKt.q(r1, r2)
                return
        }

        public void onComplete(@org.jetbrains.annotations.NotNull com.umeng.socialize.bean.SHARE_MEDIA r2, int r3, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r4) {
                r1 = this;
                java.lang.String r3 = "platform"
                kotlin.jvm.internal.g0.p(r2, r3)
                java.lang.String r3 = "data"
                kotlin.jvm.internal.g0.p(r4, r3)
                java.lang.String r2 = r2.name()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "platform="
                r3.append(r0)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r3 = 0
                java.lang.Object[] r0 = new java.lang.Object[r3]
                com.orhanobut.logger.j.d(r2, r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = "data="
                r2.append(r0)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                java.lang.Object[] r3 = new java.lang.Object[r3]
                com.orhanobut.logger.j.d(r2, r3)
                kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.String>, kotlin.n1> r2 = r1.a
                r2.invoke(r4)
                return
        }

        public void onError(@org.jetbrains.annotations.NotNull com.umeng.socialize.bean.SHARE_MEDIA r2, int r3, @org.jetbrains.annotations.NotNull java.lang.Throwable r4) {
                r1 = this;
                java.lang.String r0 = "platform"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "t"
                kotlin.jvm.internal.g0.p(r4, r2)
                java.lang.String r2 = r4.getMessage()
                com.orhanobut.logger.j.c(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "action="
                r2.append(r4)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                com.orhanobut.logger.j.d(r2, r3)
                com.bxkj.student.v2.common.utils.ThirdLogin r2 = r1.b
                android.app.Activity r2 = r2.a()
                java.lang.String r3 = "绑定失败,请稍后再试"
                com.bxkj.base.v2.common.ext.ContextExtKt.q(r2, r3)
                return
        }

        public void onStart(@org.jetbrains.annotations.NotNull com.umeng.socialize.bean.SHARE_MEDIA r2) {
                r1 = this;
                java.lang.String r0 = "platform"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }
    }

    public ThirdLogin(@org.jetbrains.annotations.NotNull android.app.Activity r3) {
            r2 = this;
            java.lang.String r0 = "mActivity"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.<init>()
            r2.a = r3
            com.umeng.socialize.UMShareConfig r0 = new com.umeng.socialize.UMShareConfig
            r0.<init>()
            r1 = 1
            r0.isNeedAuthOnGetUserInfo(r1)
            com.umeng.socialize.UMShareAPI r3 = com.umeng.socialize.UMShareAPI.get(r3)
            r3.setShareConfig(r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final android.app.Activity a() {
            r1 = this;
            android.app.Activity r0 = r1.a
            return r0
    }

    public final void b(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map<java.lang.String, java.lang.String>, kotlin.n1> r5) {
            r4 = this;
            java.lang.String r0 = "bind"
            kotlin.jvm.internal.g0.p(r5, r0)
            android.app.Activity r0 = r4.a
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.get(r0)
            android.app.Activity r1 = r4.a
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            boolean r0 = r0.isInstall(r1, r2)
            if (r0 != 0) goto L1d
            android.app.Activity r5 = r4.a
            java.lang.String r0 = "您还未安装QQ或QQ版本过低"
            com.bxkj.base.v2.common.ext.ContextExtKt.q(r5, r0)
            return
        L1d:
            android.app.Activity r0 = r4.a
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.get(r0)
            android.app.Activity r1 = r4.a
            com.bxkj.student.v2.common.utils.ThirdLogin$MyUMAuthListener r3 = new com.bxkj.student.v2.common.utils.ThirdLogin$MyUMAuthListener
            r3.<init>(r4, r5)
            r0.getPlatformInfo(r1, r2, r3)
            return
    }

    public final void c(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map<java.lang.String, java.lang.String>, kotlin.n1> r5) {
            r4 = this;
            java.lang.String r0 = "bind"
            kotlin.jvm.internal.g0.p(r5, r0)
            android.app.Activity r0 = r4.a
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.get(r0)
            android.app.Activity r1 = r4.a
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            boolean r0 = r0.isInstall(r1, r2)
            if (r0 != 0) goto L1d
            android.app.Activity r5 = r4.a
            java.lang.String r0 = "您还未安装微信或微信版本过低"
            com.bxkj.base.v2.common.ext.ContextExtKt.q(r5, r0)
            return
        L1d:
            android.app.Activity r0 = r4.a
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.get(r0)
            android.app.Activity r1 = r4.a
            com.bxkj.student.v2.common.utils.ThirdLogin$MyUMAuthListener r3 = new com.bxkj.student.v2.common.utils.ThirdLogin$MyUMAuthListener
            r3.<init>(r4, r5)
            r0.getPlatformInfo(r1, r2, r3)
            return
    }
}
