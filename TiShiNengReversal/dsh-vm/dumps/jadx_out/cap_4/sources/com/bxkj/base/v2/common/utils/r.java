package com.bxkj.base.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class r {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.common.utils.r.a a = null;

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

        @org.jetbrains.annotations.NotNull
        public final java.io.File a(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "base64Code"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "targetPath"
                kotlin.jvm.internal.g0.p(r3, r0)
                byte[] r2 = cn.bluemobi.dylan.base.utils.b.a(r2)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L25
                java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L25
                r0.<init>(r3)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L25
                r0.write(r2)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L25
                r0.close()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L25
                java.io.File r2 = new java.io.File
                r2.<init>(r3)
                return r2
            L1f:
                java.io.File r2 = new java.io.File
                r2.<init>(r3)
                return r2
            L25:
                java.io.File r2 = new java.io.File
                r2.<init>(r3)
                return r2
        }
    }

    static {
            com.bxkj.base.v2.common.utils.r$a r0 = new com.bxkj.base.v2.common.utils.r$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.base.v2.common.utils.r.a = r0
            return
    }

    public r() {
            r0 = this;
            r0.<init>()
            return
    }
}
