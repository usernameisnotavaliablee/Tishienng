package com.bjtsn.dylan.startactivityforresult;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class EventDispatcherFragment extends androidx.fragment.app.Fragment {

    @org.jetbrains.annotations.NotNull
    private android.util.SparseArray<t.b.a> c;

    public EventDispatcherFragment() {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.c = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final android.util.SparseArray<t.b.a> b() {
            r1 = this;
            android.util.SparseArray<t.b$a> r0 = r1.c
            return r0
    }

    public final void c(@org.jetbrains.annotations.NotNull android.util.SparseArray<t.b.a> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.c = r2
            return
    }

    public void onActivityResult(int r3, int r4, @org.jetbrains.annotations.Nullable android.content.Intent r5) {
            r2 = this;
            super.onActivityResult(r3, r4, r5)
            android.util.SparseArray<t.b$a> r0 = r2.c
            java.lang.Object r0 = r0.get(r3)
            t.b$a r0 = (t.b.a) r0
            if (r0 == 0) goto L15
            android.util.SparseArray<t.b$a> r1 = r2.c
            r1.remove(r3)
            r0.a(r4, r5)
        L15:
            return
    }

    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            r1 = 1
            r0.setRetainInstance(r1)
            return
    }

    public final void startActivityForResult(@org.jetbrains.annotations.NotNull android.content.Intent r3, @org.jetbrains.annotations.NotNull t.b.a r4) {
            r2 = this;
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.g0.p(r4, r0)
            android.util.SparseArray<t.b$a> r0 = r2.c
            int r0 = r0.size()
            android.util.SparseArray<t.b$a> r1 = r2.c
            r1.put(r0, r4)
            r2.startActivityForResult(r3, r0)
            return
    }
}
