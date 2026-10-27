package com.bxkj.student.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class q {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.utils.q a = null;

    static {
            com.bxkj.student.v2.common.utils.q r0 = new com.bxkj.student.v2.common.utils.q
            r0.<init>()
            com.bxkj.student.v2.common.utils.q.a = r0
            return
    }

    private q() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final android.graphics.Bitmap a(@org.jetbrains.annotations.NotNull android.content.Context r4, @org.jetbrains.annotations.NotNull android.view.View r5) {
            r3 = this;
            java.lang.String r0 = "mContext"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            java.lang.String r1 = "createBitmap(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            r2 = 2131099738(0x7f06005a, float:1.7811838E38)
            int r4 = androidx.core.content.ContextCompat.getColor(r4, r2)
            r1.drawColor(r4)
            r5.draw(r1)
            return r0
    }
}
