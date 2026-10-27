package com.bumptech.glide.manager;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SupportRequestManagerFragment extends androidx.fragment.app.Fragment {
    private static final java.lang.String i = "SupportRMFragment";
    private final com.bumptech.glide.manager.a c;
    private final com.bumptech.glide.manager.r d;
    private final java.util.Set<com.bumptech.glide.manager.SupportRequestManagerFragment> e;

    @androidx.annotation.Nullable
    private com.bumptech.glide.manager.SupportRequestManagerFragment f;

    @androidx.annotation.Nullable
    private com.bumptech.glide.i g;

    @androidx.annotation.Nullable
    private androidx.fragment.app.Fragment h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a implements com.bumptech.glide.manager.r {
        final /* synthetic */ com.bumptech.glide.manager.SupportRequestManagerFragment a;

        a(com.bumptech.glide.manager.SupportRequestManagerFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.manager.r
        @androidx.annotation.NonNull
        public java.util.Set<com.bumptech.glide.i> a() {
                r4 = this;
                com.bumptech.glide.manager.SupportRequestManagerFragment r0 = r4.a
                java.util.Set r0 = r0.c()
                java.util.HashSet r1 = new java.util.HashSet
                int r2 = r0.size()
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L13:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2d
                java.lang.Object r2 = r0.next()
                com.bumptech.glide.manager.SupportRequestManagerFragment r2 = (com.bumptech.glide.manager.SupportRequestManagerFragment) r2
                com.bumptech.glide.i r3 = r2.f()
                if (r3 == 0) goto L13
                com.bumptech.glide.i r2 = r2.f()
                r1.add(r2)
                goto L13
            L2d:
                return r1
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = super.toString()
                r0.append(r1)
                java.lang.String r1 = "{fragment="
                r0.append(r1)
                com.bumptech.glide.manager.SupportRequestManagerFragment r1 = r2.a
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public SupportRequestManagerFragment() {
            r1 = this;
            com.bumptech.glide.manager.a r0 = new com.bumptech.glide.manager.a
            r0.<init>()
            r1.<init>(r0)
            return
    }

    @android.annotation.SuppressLint({"ValidFragment"})
    @androidx.annotation.VisibleForTesting
    public SupportRequestManagerFragment(@androidx.annotation.NonNull com.bumptech.glide.manager.a r2) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.manager.SupportRequestManagerFragment$a r0 = new com.bumptech.glide.manager.SupportRequestManagerFragment$a
            r0.<init>(r1)
            r1.d = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.e = r0
            r1.c = r2
            return
    }

    private void L() {
            r1 = this;
            com.bumptech.glide.manager.SupportRequestManagerFragment r0 = r1.f
            if (r0 == 0) goto La
            r0.k(r1)
            r0 = 0
            r1.f = r0
        La:
            return
    }

    private void b(com.bumptech.glide.manager.SupportRequestManagerFragment r2) {
            r1 = this;
            java.util.Set<com.bumptech.glide.manager.SupportRequestManagerFragment> r0 = r1.e
            r0.add(r2)
            return
    }

    @androidx.annotation.Nullable
    private androidx.fragment.app.Fragment e() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.getParentFragment()
            if (r0 == 0) goto L7
            return r0
        L7:
            androidx.fragment.app.Fragment r0 = r1.h
            return r0
    }

    @androidx.annotation.Nullable
    private static androidx.fragment.app.FragmentManager h(@androidx.annotation.NonNull androidx.fragment.app.Fragment r1) {
        L0:
            androidx.fragment.app.Fragment r0 = r1.getParentFragment()
            if (r0 == 0) goto Lb
            androidx.fragment.app.Fragment r1 = r1.getParentFragment()
            goto L0
        Lb:
            androidx.fragment.app.FragmentManager r1 = r1.getFragmentManager()
            return r1
    }

    private boolean i(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.e()
        L4:
            androidx.fragment.app.Fragment r1 = r3.getParentFragment()
            if (r1 == 0) goto L17
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L12
            r3 = 1
            return r3
        L12:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L4
        L17:
            r3 = 0
            return r3
    }

    private void j(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull androidx.fragment.app.FragmentManager r2) {
            r0 = this;
            r0.L()
            com.bumptech.glide.b r1 = com.bumptech.glide.b.e(r1)
            com.bumptech.glide.manager.q r1 = r1.n()
            com.bumptech.glide.manager.SupportRequestManagerFragment r1 = r1.s(r2)
            r0.f = r1
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L1c
            com.bumptech.glide.manager.SupportRequestManagerFragment r1 = r0.f
            r1.b(r0)
        L1c:
            return
    }

    private void k(com.bumptech.glide.manager.SupportRequestManagerFragment r2) {
            r1 = this;
            java.util.Set<com.bumptech.glide.manager.SupportRequestManagerFragment> r0 = r1.e
            r0.remove(r2)
            return
    }

    @androidx.annotation.NonNull
    java.util.Set<com.bumptech.glide.manager.SupportRequestManagerFragment> c() {
            r4 = this;
            com.bumptech.glide.manager.SupportRequestManagerFragment r0 = r4.f
            if (r0 != 0) goto L7
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
        L7:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L14
            java.util.Set<com.bumptech.glide.manager.SupportRequestManagerFragment> r0 = r4.e
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
        L14:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.bumptech.glide.manager.SupportRequestManagerFragment r1 = r4.f
            java.util.Set r1 = r1.c()
            java.util.Iterator r1 = r1.iterator()
        L23:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r1.next()
            com.bumptech.glide.manager.SupportRequestManagerFragment r2 = (com.bumptech.glide.manager.SupportRequestManagerFragment) r2
            androidx.fragment.app.Fragment r3 = r2.e()
            boolean r3 = r4.i(r3)
            if (r3 == 0) goto L23
            r0.add(r2)
            goto L23
        L3d:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    @androidx.annotation.NonNull
    com.bumptech.glide.manager.a d() {
            r1 = this;
            com.bumptech.glide.manager.a r0 = r1.c
            return r0
    }

    @androidx.annotation.Nullable
    public com.bumptech.glide.i f() {
            r1 = this;
            com.bumptech.glide.i r0 = r1.g
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.manager.r g() {
            r1 = this;
            com.bumptech.glide.manager.r r0 = r1.d
            return r0
    }

    void l(@androidx.annotation.Nullable androidx.fragment.app.Fragment r2) {
            r1 = this;
            r1.h = r2
            if (r2 == 0) goto L19
            android.content.Context r0 = r2.getContext()
            if (r0 != 0) goto Lb
            goto L19
        Lb:
            androidx.fragment.app.FragmentManager r0 = h(r2)
            if (r0 != 0) goto L12
            goto L19
        L12:
            android.content.Context r2 = r2.getContext()
            r1.j(r2, r0)
        L19:
            return
    }

    public void m(@androidx.annotation.Nullable com.bumptech.glide.i r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void onAttach(android.content.Context r4) {
            r3 = this;
            super.onAttach(r4)
            androidx.fragment.app.FragmentManager r4 = h(r3)
            r0 = 5
            java.lang.String r1 = "SupportRMFragment"
            if (r4 != 0) goto L10
            android.util.Log.isLoggable(r1, r0)
            return
        L10:
            android.content.Context r2 = r3.getContext()     // Catch: java.lang.IllegalStateException -> L18
            r3.j(r2, r4)     // Catch: java.lang.IllegalStateException -> L18
            return
        L18:
            android.util.Log.isLoggable(r1, r0)
            return
    }

    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            com.bumptech.glide.manager.a r0 = r1.c
            r0.c()
            r1.L()
            return
    }

    public void onDetach() {
            r1 = this;
            super.onDetach()
            r0 = 0
            r1.h = r0
            r1.L()
            return
    }

    public void onStart() {
            r1 = this;
            super.onStart()
            com.bumptech.glide.manager.a r0 = r1.c
            r0.d()
            return
    }

    public void onStop() {
            r1 = this;
            super.onStop()
            com.bumptech.glide.manager.a r0 = r1.c
            r0.e()
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "{parent="
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r2.e()
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
