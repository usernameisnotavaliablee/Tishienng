package com.bxkj.student.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface u {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.utils.u.a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        static final /* synthetic */ com.bxkj.student.v2.common.utils.u.a a = null;

        static {
                com.bxkj.student.v2.common.utils.u$a r0 = new com.bxkj.student.v2.common.utils.u$a
                r0.<init>()
                com.bxkj.student.v2.common.utils.u.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final java.lang.String a(int r2) {
                r1 = this;
                r0 = 1
                if (r2 == r0) goto L12
                r0 = 2
                if (r2 == r0) goto Lf
                r0 = 3
                if (r2 == r0) goto Lc
                java.lang.String r2 = "正常提交 "
                return r2
            Lc:
                java.lang.String r2 = "超时上传"
                return r2
            Lf:
                java.lang.String r2 = "异常上传"
                return r2
            L12:
                java.lang.String r2 = "退出上传"
                return r2
        }
    }

    static {
            com.bxkj.student.v2.common.utils.u$a r0 = com.bxkj.student.v2.common.utils.u.a.a
            com.bxkj.student.v2.common.utils.u.a = r0
            return
    }
}
