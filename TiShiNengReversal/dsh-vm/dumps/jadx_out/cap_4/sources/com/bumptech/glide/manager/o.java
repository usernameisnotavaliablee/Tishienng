package com.bumptech.glide.manager;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class o extends android.app.Fragment {
    private static final java.lang.String g = "RMFragment";
    private final com.bumptech.glide.manager.a a;
    private final com.bumptech.glide.manager.r b;
    private final java.util.Set<com.bumptech.glide.manager.o> c;

    @androidx.annotation.Nullable
    private com.bumptech.glide.i d;

    @androidx.annotation.Nullable
    private com.bumptech.glide.manager.o e;

    @androidx.annotation.Nullable
    private android.app.Fragment f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a implements com.bumptech.glide.manager.r {
        final /* synthetic */ com.bumptech.glide.manager.o a;

        a(com.bumptech.glide.manager.o r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.manager.r
        @androidx.annotation.NonNull
        public java.util.Set<com.bumptech.glide.i> a() {
                r4 = this;
                com.bumptech.glide.manager.o r0 = r4.a
                java.util.Set r0 = r0.b()
                java.util.HashSet r1 = new java.util.HashSet
                int r2 = r0.size()
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L13:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2d
                java.lang.Object r2 = r0.next()
                com.bumptech.glide.manager.o r2 = (com.bumptech.glide.manager.o) r2
                com.bumptech.glide.i r3 = r2.e()
                if (r3 == 0) goto L13
                com.bumptech.glide.i r2 = r2.e()
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
                com.bumptech.glide.manager.o r1 = r2.a
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public o() {
            r1 = this;
            com.bumptech.glide.manager.a r0 = new com.bumptech.glide.manager.a
            r0.<init>()
            r1.<init>(r0)
            return
    }

    @android.annotation.SuppressLint({"ValidFragment"})
    @androidx.annotation.VisibleForTesting
    o(@androidx.annotation.NonNull com.bumptech.glide.manager.a r2) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.manager.o$a r0 = new com.bumptech.glide.manager.o$a
            r0.<init>(r1)
            r1.b = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.c = r0
            r1.a = r2
            return
    }

    private void a(com.bumptech.glide.manager.o r2) {
            r1 = this;
            java.util.Set<com.bumptech.glide.manager.o> r0 = r1.c
            r0.add(r2)
            return
    }

    @androidx.annotation.Nullable
    @android.annotation.TargetApi(17)
    private android.app.Fragment d() {
            r1 = this;
            android.app.Fragment r0 = r1.getParentFragment()
            if (r0 == 0) goto L7
            return r0
        L7:
            android.app.Fragment r0 = r1.f
            return r0
    }

    @android.annotation.TargetApi(17)
    private boolean g(@androidx.annotation.NonNull android.app.Fragment r3) {
            r2 = this;
            android.app.Fragment r0 = r2.getParentFragment()
        L4:
            android.app.Fragment r1 = r3.getParentFragment()
            if (r1 == 0) goto L17
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L12
            r3 = 1
            return r3
        L12:
            android.app.Fragment r3 = r3.getParentFragment()
            goto L4
        L17:
            r3 = 0
            return r3
    }

    private void h(@androidx.annotation.NonNull android.app.Activity r2) {
            r1 = this;
            r1.l()
            com.bumptech.glide.b r0 = com.bumptech.glide.b.e(r2)
            com.bumptech.glide.manager.q r0 = r0.n()
            com.bumptech.glide.manager.o r2 = r0.q(r2)
            r1.e = r2
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L1c
            com.bumptech.glide.manager.o r2 = r1.e
            r2.a(r1)
        L1c:
            return
    }

    private void i(com.bumptech.glide.manager.o r2) {
            r1 = this;
            java.util.Set<com.bumptech.glide.manager.o> r0 = r1.c
            r0.remove(r2)
            return
    }

    private void l() {
            r1 = this;
            com.bumptech.glide.manager.o r0 = r1.e
            if (r0 == 0) goto La
            r0.i(r1)
            r0 = 0
            r1.e = r0
        La:
            return
    }

    @androidx.annotation.NonNull
    @android.annotation.TargetApi(17)
    java.util.Set<com.bumptech.glide.manager.o> b() {
            r4 = this;
            com.bumptech.glide.manager.o r0 = r4.e
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            java.util.Set<com.bumptech.glide.manager.o> r0 = r4.c
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
        Lf:
            com.bumptech.glide.manager.o r0 = r4.e
            if (r0 == 0) goto L41
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.bumptech.glide.manager.o r1 = r4.e
            java.util.Set r1 = r1.b()
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.next()
            com.bumptech.glide.manager.o r2 = (com.bumptech.glide.manager.o) r2
            android.app.Fragment r3 = r2.getParentFragment()
            boolean r3 = r4.g(r3)
            if (r3 == 0) goto L22
            r0.add(r2)
            goto L22
        L3c:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
        L41:
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }

    @androidx.annotation.NonNull
    com.bumptech.glide.manager.a c() {
            r1 = this;
            com.bumptech.glide.manager.a r0 = r1.a
            return r0
    }

    @androidx.annotation.Nullable
    public com.bumptech.glide.i e() {
            r1 = this;
            com.bumptech.glide.i r0 = r1.d
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.manager.r f() {
            r1 = this;
            com.bumptech.glide.manager.r r0 = r1.b
            return r0
    }

    void j(@androidx.annotation.Nullable android.app.Fragment r2) {
            r1 = this;
            r1.f = r2
            if (r2 == 0) goto L11
            android.app.Activity r0 = r2.getActivity()
            if (r0 == 0) goto L11
            android.app.Activity r2 = r2.getActivity()
            r1.h(r2)
        L11:
            return
    }

    public void k(@androidx.annotation.Nullable com.bumptech.glide.i r1) {
            r0 = this;
            r0.d = r1
            return
    }

    @Override // android.app.Fragment
    public void onAttach(android.app.Activity r2) {
            r1 = this;
            super.onAttach(r2)
            r1.h(r2)     // Catch: java.lang.IllegalStateException -> L7
            return
        L7:
            java.lang.String r2 = "RMFragment"
            r0 = 5
            android.util.Log.isLoggable(r2, r0)
            return
    }

    @Override // android.app.Fragment
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            com.bumptech.glide.manager.a r0 = r1.a
            r0.c()
            r1.l()
            return
    }

    @Override // android.app.Fragment
    public void onDetach() {
            r0 = this;
            super.onDetach()
            r0.l()
            return
    }

    @Override // android.app.Fragment
    public void onStart() {
            r1 = this;
            super.onStart()
            com.bumptech.glide.manager.a r0 = r1.a
            r0.d()
            return
    }

    @Override // android.app.Fragment
    public void onStop() {
            r1 = this;
            super.onStop()
            com.bumptech.glide.manager.a r0 = r1.a
            r0.e()
            return
    }

    @Override // android.app.Fragment
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "{parent="
            r0.append(r1)
            android.app.Fragment r1 = r2.d()
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
