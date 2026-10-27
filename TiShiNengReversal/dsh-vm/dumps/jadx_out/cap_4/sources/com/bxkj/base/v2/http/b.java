package com.bxkj.base.v2.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface b {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        public static /* synthetic */ java.lang.Object a(com.bxkj.base.v2.http.b r0, java.lang.String r1, kotlin.coroutines.e r2, int r3, java.lang.Object r4) {
                java.lang.Object r0 = com.bxkj.base.v2.http.a.a(r0, r1, r2, r3, r4)
                return r0
        }
    }

    @com.bxkj.base.v2.http.interceptor.Test(demo = "f2cefb5799dbc3a2fca980a7c30b8b09")
    @retrofit2.http.GET("app/getSocket")
    @org.jetbrains.annotations.Nullable
    java.lang.Object a(@org.jetbrains.annotations.Nullable @retrofit2.http.Query("basUserId") java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super com.bxkj.base.v2.http.result.ApiResult<java.util.Map<java.lang.String, java.lang.Object>>> r2);
}
