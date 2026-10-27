package com.bxkj.base.v2.netty4android.client.handler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface a {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.netty4android.client.handler.a.C0059a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bxkj.base.v2.netty4android.client.handler.a$a, reason: collision with other inner class name */
    public static final class C0059a {
        static final /* synthetic */ com.bxkj.base.v2.netty4android.client.handler.a.C0059a a = null;

        static {
                com.bxkj.base.v2.netty4android.client.handler.a$a r0 = new com.bxkj.base.v2.netty4android.client.handler.a$a
                r0.<init>()
                com.bxkj.base.v2.netty4android.client.handler.a.C0059a.a = r0
                return
        }

        private C0059a() {
                r0 = this;
                r0.<init>()
                return
        }

        public final int a(@org.jetbrains.annotations.NotNull byte[] r5) {
                r4 = this;
                java.lang.String r0 = "bytes"
                kotlin.jvm.internal.g0.p(r5, r0)
                int r0 = r5.length
                r1 = 0
                r2 = 0
            L8:
                if (r1 >= r0) goto L10
                r3 = r5[r1]
                int r2 = r2 + r3
                int r1 = r1 + 1
                goto L8
            L10:
                r5 = 255(0xff, float:3.57E-43)
                if (r2 <= r5) goto L17
                int r0 = ~r2
                int r2 = r0 + 1
            L17:
                r5 = r5 & r2
                return r5
        }
    }

    static {
            com.bxkj.base.v2.netty4android.client.handler.a$a r0 = com.bxkj.base.v2.netty4android.client.handler.a.C0059a.a
            com.bxkj.base.v2.netty4android.client.handler.a.a = r0
            return
    }
}
