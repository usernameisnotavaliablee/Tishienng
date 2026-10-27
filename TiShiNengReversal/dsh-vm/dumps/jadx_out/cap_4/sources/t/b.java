package t;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b {
    private com.bjtsn.dylan.startactivityforresult.EventDispatcherFragment a;
    private final java.lang.String b;
    private android.content.Intent c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(int r1, @org.jetbrains.annotations.Nullable android.content.Intent r2);
    }

    public b(@org.jetbrains.annotations.NotNull androidx.fragment.app.Fragment r2) {
            r1 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            java.lang.String r0 = "START_ACTIVITY_FOR_RESULT_DISPATCHER_FRAGMENT"
            r1.b = r0
            androidx.fragment.app.FragmentManager r2 = r2.getChildFragmentManager()
            java.lang.String r0 = "fragment.childFragmentManager"
            kotlin.jvm.internal.g0.o(r2, r0)
            com.bjtsn.dylan.startactivityforresult.EventDispatcherFragment r2 = r1.b(r2)
            r1.a = r2
            return
    }

    public b(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            java.lang.String r0 = "START_ACTIVITY_FOR_RESULT_DISPATCHER_FRAGMENT"
            r1.b = r0
            androidx.fragment.app.FragmentManager r2 = r2.getSupportFragmentManager()
            java.lang.String r0 = "activity.supportFragmentManager"
            kotlin.jvm.internal.g0.o(r2, r0)
            com.bjtsn.dylan.startactivityforresult.EventDispatcherFragment r2 = r1.b(r2)
            r1.a = r2
            return
    }

    private final androidx.fragment.app.Fragment a(androidx.fragment.app.FragmentManager r2) {
            r1 = this;
            java.lang.String r0 = r1.b
            androidx.fragment.app.Fragment r2 = r2.findFragmentByTag(r0)
            return r2
    }

    private final com.bjtsn.dylan.startactivityforresult.EventDispatcherFragment b(androidx.fragment.app.FragmentManager r4) {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.a(r4)
            if (r0 != 0) goto L1b
            com.bjtsn.dylan.startactivityforresult.EventDispatcherFragment r0 = new com.bjtsn.dylan.startactivityforresult.EventDispatcherFragment
            r0.<init>()
            androidx.fragment.app.FragmentTransaction r1 = r4.beginTransaction()
            java.lang.String r2 = r3.b
            androidx.fragment.app.FragmentTransaction r1 = r1.add(r0, r2)
            r1.commitAllowingStateLoss()
            r4.executePendingTransactions()
        L1b:
            com.bjtsn.dylan.startactivityforresult.EventDispatcherFragment r0 = (com.bjtsn.dylan.startactivityforresult.EventDispatcherFragment) r0
            return r0
    }

    public final void c(@org.jetbrains.annotations.NotNull t.b.a r4) {
            r3 = this;
            java.lang.String r0 = "callBack"
            kotlin.jvm.internal.g0.p(r4, r0)
            com.bjtsn.dylan.startactivityforresult.EventDispatcherFragment r0 = r3.a
            android.content.Intent r1 = r3.c
            if (r1 != 0) goto L10
            java.lang.String r2 = "intent"
            kotlin.jvm.internal.g0.S(r2)
        L10:
            r0.startActivityForResult(r1, r4)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final t.b startActivityForResult(@org.jetbrains.annotations.NotNull android.content.Intent r2) {
            r1 = this;
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.c = r2
            return r1
    }
}
