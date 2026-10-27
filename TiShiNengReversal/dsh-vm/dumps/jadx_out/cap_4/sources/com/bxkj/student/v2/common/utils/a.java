package com.bxkj.student.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.utils.a a = null;

    @org.jetbrains.annotations.Nullable
    private static java.lang.ref.WeakReference<android.app.Activity> b;

    static {
            com.bxkj.student.v2.common.utils.a r0 = new com.bxkj.student.v2.common.utils.a
            r0.<init>()
            com.bxkj.student.v2.common.utils.a.a = r0
            return
    }

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final android.app.Activity a() {
            r1 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = com.bxkj.student.v2.common.utils.a.b
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final void b(@org.jetbrains.annotations.NotNull android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2 instanceof com.bxkj.student.v2.ui.face.FaceDetectV3Activity
            if (r0 != 0) goto L15
            boolean r0 = r2 instanceof com.bxkj.student.v2.ui.face.FaceLiveV3Activity
            if (r0 == 0) goto Le
            return
        Le:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            com.bxkj.student.v2.common.utils.a.b = r0
        L15:
            return
    }
}
