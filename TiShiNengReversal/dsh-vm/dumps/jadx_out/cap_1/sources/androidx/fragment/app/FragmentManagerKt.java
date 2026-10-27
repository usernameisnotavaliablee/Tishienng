package androidx.fragment.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FragmentManagerKt {
    public static final void commit(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentManager r1, boolean r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.fragment.app.FragmentTransaction, kotlin.n1> r3) {
            java.lang.String r0 = "$this$commit"
            kotlin.jvm.internal.g0.q(r1, r0)
            java.lang.String r0 = "body"
            kotlin.jvm.internal.g0.q(r3, r0)
            androidx.fragment.app.FragmentTransaction r1 = r1.beginTransaction()
            java.lang.String r0 = "beginTransaction()"
            kotlin.jvm.internal.g0.h(r1, r0)
            r3.invoke(r1)
            if (r2 == 0) goto L1c
            r1.commitAllowingStateLoss()
            return
        L1c:
            r1.commit()
            return
    }

    public static /* synthetic */ void commit$default(androidx.fragment.app.FragmentManager r0, boolean r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L5
            r1 = 0
        L5:
            java.lang.String r3 = "$this$commit"
            kotlin.jvm.internal.g0.q(r0, r3)
            java.lang.String r3 = "body"
            kotlin.jvm.internal.g0.q(r2, r3)
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            java.lang.String r3 = "beginTransaction()"
            kotlin.jvm.internal.g0.h(r0, r3)
            r2.invoke(r0)
            if (r1 == 0) goto L21
            r0.commitAllowingStateLoss()
            return
        L21:
            r0.commit()
            return
    }

    public static final void commitNow(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentManager r1, boolean r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.fragment.app.FragmentTransaction, kotlin.n1> r3) {
            java.lang.String r0 = "$this$commitNow"
            kotlin.jvm.internal.g0.q(r1, r0)
            java.lang.String r0 = "body"
            kotlin.jvm.internal.g0.q(r3, r0)
            androidx.fragment.app.FragmentTransaction r1 = r1.beginTransaction()
            java.lang.String r0 = "beginTransaction()"
            kotlin.jvm.internal.g0.h(r1, r0)
            r3.invoke(r1)
            if (r2 == 0) goto L1c
            r1.commitNowAllowingStateLoss()
            return
        L1c:
            r1.commitNow()
            return
    }

    public static /* synthetic */ void commitNow$default(androidx.fragment.app.FragmentManager r0, boolean r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L5
            r1 = 0
        L5:
            java.lang.String r3 = "$this$commitNow"
            kotlin.jvm.internal.g0.q(r0, r3)
            java.lang.String r3 = "body"
            kotlin.jvm.internal.g0.q(r2, r3)
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            java.lang.String r3 = "beginTransaction()"
            kotlin.jvm.internal.g0.h(r0, r3)
            r2.invoke(r0)
            if (r1 == 0) goto L21
            r0.commitNowAllowingStateLoss()
            return
        L21:
            r0.commitNow()
            return
    }

    @kotlin.Deprecated(message = "Use commit { .. } or commitNow { .. } extensions")
    public static final void transaction(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentManager r1, boolean r2, boolean r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.fragment.app.FragmentTransaction, kotlin.n1> r4) {
            java.lang.String r0 = "$this$transaction"
            kotlin.jvm.internal.g0.q(r1, r0)
            java.lang.String r0 = "body"
            kotlin.jvm.internal.g0.q(r4, r0)
            androidx.fragment.app.FragmentTransaction r1 = r1.beginTransaction()
            java.lang.String r0 = "beginTransaction()"
            kotlin.jvm.internal.g0.h(r1, r0)
            r4.invoke(r1)
            if (r2 == 0) goto L22
            if (r3 == 0) goto L1e
            r1.commitNowAllowingStateLoss()
            return
        L1e:
            r1.commitNow()
            return
        L22:
            if (r3 == 0) goto L28
            r1.commitAllowingStateLoss()
            return
        L28:
            r1.commit()
            return
    }

    public static /* synthetic */ void transaction$default(androidx.fragment.app.FragmentManager r1, boolean r2, boolean r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            r0 = 0
            if (r6 == 0) goto L6
            r2 = 0
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lb
            r3 = 0
        Lb:
            java.lang.String r5 = "$this$transaction"
            kotlin.jvm.internal.g0.q(r1, r5)
            java.lang.String r5 = "body"
            kotlin.jvm.internal.g0.q(r4, r5)
            androidx.fragment.app.FragmentTransaction r1 = r1.beginTransaction()
            java.lang.String r5 = "beginTransaction()"
            kotlin.jvm.internal.g0.h(r1, r5)
            r4.invoke(r1)
            if (r2 == 0) goto L2d
            if (r3 == 0) goto L29
            r1.commitNowAllowingStateLoss()
            return
        L29:
            r1.commitNow()
            return
        L2d:
            if (r3 == 0) goto L33
            r1.commitAllowingStateLoss()
            return
        L33:
            r1.commit()
            return
    }
}
