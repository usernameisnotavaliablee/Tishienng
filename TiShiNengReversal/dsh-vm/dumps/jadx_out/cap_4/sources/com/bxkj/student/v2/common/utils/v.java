package com.bxkj.student.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class v {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.utils.v.a a = null;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String b = "wxc9214f296e1fba92";

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

        public final void a(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
                r1 = this;
                java.lang.String r0 = "mContext"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "userName"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "wxc9214f296e1fba92"
                com.tencent.mm.opensdk.openapi.IWXAPI r2 = com.tencent.mm.opensdk.openapi.WXAPIFactory.createWXAPI(r2, r0)
                com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req r0 = new com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req
                r0.<init>()
                r0.userName = r3
                r0.path = r4
                r3 = 0
                r0.miniprogramType = r3
                r2.sendReq(r0)
                return
        }
    }

    static {
            com.bxkj.student.v2.common.utils.v$a r0 = new com.bxkj.student.v2.common.utils.v$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.v2.common.utils.v.a = r0
            return
    }

    public v() {
            r0 = this;
            r0.<init>()
            return
    }
}
