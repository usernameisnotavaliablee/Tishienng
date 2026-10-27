package com.bxkj.student.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nH5Utils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 H5Utils.kt\ncom/bxkj/student/v2/common/utils/H5Utils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1869#2,2:61\n1869#2,2:63\n*S KotlinDebug\n*F\n+ 1 H5Utils.kt\ncom/bxkj/student/v2/common/utils/H5Utils\n*L\n25#1:61,2\n46#1:63,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class h {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.utils.h a = null;

    static {
            com.bxkj.student.v2.common.utils.h r0 = new com.bxkj.student.v2.common.utils.h
            r0.<init>()
            com.bxkj.student.v2.common.utils.h.a = r0
            return
    }

    private h() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String a(@org.jetbrains.annotations.NotNull java.lang.String r15) {
            r14 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.g0.p(r15, r0)
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r0.a()
            java.lang.String r4 = r1.J()
            r6 = 4
            r7 = 0
            java.lang.String r3 = "${school}"
            r5 = 0
            r2 = r15
            java.lang.String r8 = kotlin.text.u.x2(r2, r3, r4, r5, r6, r7)
            com.bxkj.base.v2.data.b r15 = r0.a()
            java.lang.String r10 = r15.g()
            r12 = 4
            r13 = 0
            java.lang.String r9 = "${token}"
            r11 = 0
            java.lang.String r15 = kotlin.text.u.x2(r8, r9, r10, r11, r12, r13)
            return r15
    }

    public final void b(@org.jetbrains.annotations.NotNull android.content.Context r7, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r8) {
            r6 = this;
            java.lang.String r0 = "mContext"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "menu"
            kotlin.jvm.internal.g0.p(r8, r0)
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "linkUrl"
            java.lang.String r2 = r0.t(r8, r1)
            int r2 = r2.length()
            java.lang.String r3 = "name"
            if (r2 != 0) goto L3b
            java.lang.String r7 = r0.t(r8, r3)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "跳转【"
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = "】地址为空！"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            com.orhanobut.logger.j.e(r7, r8)
            return
        L3b:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.Set r2 = r8.keySet()
            java.util.Iterator r2 = r2.iterator()
        L48:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5e
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            com.bxkj.base.v2.common.utils.x r5 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r5 = r5.t(r8, r4)
            r0.putString(r4, r5)
            goto L48
        L5e:
            com.bxkj.base.v2.common.utils.x r2 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r3 = r2.t(r8, r3)
            java.lang.String r3 = r6.a(r3)
            java.lang.String r4 = "title"
            r0.putString(r4, r3)
            java.lang.String r8 = r2.t(r8, r1)
            java.lang.String r8 = r6.a(r8)
            java.lang.String r1 = "url"
            r0.putString(r1, r8)
            android.content.Intent r8 = new android.content.Intent
            java.lang.Class<com.bxkj.student.v2.ui.h5.H5AppActivity> r1 = com.bxkj.student.v2.ui.h5.H5AppActivity.class
            r8.<init>(r7, r1)
            android.content.Intent r8 = r8.putExtras(r0)
            r7.startActivity(r8)
            return
    }

    public final void c(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r7, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r8, @org.jetbrains.annotations.NotNull t.b.a r9) {
            r6 = this;
            java.lang.String r0 = "mActivity"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "menu"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "callBack"
            kotlin.jvm.internal.g0.p(r9, r0)
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "linkUrl"
            java.lang.String r2 = r0.t(r8, r1)
            int r2 = r2.length()
            java.lang.String r3 = "name"
            if (r2 != 0) goto L40
            java.lang.String r7 = r0.t(r8, r3)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "跳转【"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = "】地址为空！"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            com.orhanobut.logger.j.e(r7, r8)
            return
        L40:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.Set r2 = r8.keySet()
            java.util.Iterator r2 = r2.iterator()
        L4d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L63
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            com.bxkj.base.v2.common.utils.x r5 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r5 = r5.t(r8, r4)
            r0.putString(r4, r5)
            goto L4d
        L63:
            com.bxkj.base.v2.common.utils.x r2 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r3 = r2.t(r8, r3)
            java.lang.String r3 = r6.a(r3)
            java.lang.String r4 = "title"
            r0.putString(r4, r3)
            java.lang.String r8 = r2.t(r8, r1)
            java.lang.String r8 = r6.a(r8)
            java.lang.String r1 = "url"
            r0.putString(r1, r8)
            t.b r8 = new t.b
            r8.<init>(r7)
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.bxkj.student.v2.ui.h5.H5AppActivity> r2 = com.bxkj.student.v2.ui.h5.H5AppActivity.class
            r1.<init>(r7, r2)
            android.content.Intent r7 = r1.putExtras(r0)
            java.lang.String r0 = "putExtras(...)"
            kotlin.jvm.internal.g0.o(r7, r0)
            t.b r7 = r8.startActivityForResult(r7)
            r7.c(r9)
            return
    }
}
