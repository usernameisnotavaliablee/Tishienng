package com.kwad.components.core.request.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {

    @androidx.annotation.NonNull
    public final com.kwad.components.core.request.model.ImpInfo Rw;

    @androidx.annotation.NonNull
    public final com.kwad.components.core.request.c Xc;

    @androidx.annotation.Nullable
    public com.kwad.components.core.request.j Xd;

    @androidx.annotation.Nullable
    public java.util.List<java.lang.String> Xe;
    public boolean Xf;
    public boolean Xg;

    @androidx.annotation.Nullable
    public com.kwad.components.core.request.model.c Xh;
    private java.lang.String Xi;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.request.model.a$a, reason: collision with other inner class name */
    public static class C0091a {
        public com.kwad.components.core.request.model.ImpInfo Rw;
        public com.kwad.components.core.request.c Xc;
        public boolean Xf;
        public boolean Xg;
        public com.kwad.components.core.request.j Xj;

        public C0091a() {
                r0 = this;
                r0.<init>()
                return
        }

        public final com.kwad.components.core.request.model.a.C0091a a(@androidx.annotation.NonNull com.kwad.components.core.request.c r1) {
                r0 = this;
                r0.Xc = r1
                return r0
        }

        public final com.kwad.components.core.request.model.a.C0091a a(com.kwad.components.core.request.j r1) {
                r0 = this;
                r0.Xj = r1
                return r0
        }

        public final com.kwad.components.core.request.model.a.C0091a aL(boolean r1) {
                r0 = this;
                r1 = 1
                r0.Xf = r1
                return r0
        }

        public final com.kwad.components.core.request.model.a.C0091a aM(boolean r1) {
                r0 = this;
                r0.Xg = r1
                return r0
        }

        public final com.kwad.components.core.request.model.a.C0091a e(com.kwad.components.core.request.model.ImpInfo r1) {
                r0 = this;
                r0.Rw = r1
                return r0
        }

        public final com.kwad.components.core.request.model.a sw() {
                r2 = this;
                java.lang.Boolean r0 = com.kwad.components.ad.f.a.oz
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L19
                com.kwad.components.core.request.model.ImpInfo r0 = r2.Rw
                if (r0 == 0) goto L11
                com.kwad.components.core.request.c r0 = r2.Xc
                if (r0 == 0) goto L11
                goto L19
            L11:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "AdRequestParams build Illegal"
                r0.<init>(r1)
                throw r0
            L19:
                com.kwad.components.core.request.model.a r0 = new com.kwad.components.core.request.model.a
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }
    }

    private a(com.kwad.components.core.request.model.a.C0091a r2) {
            r1 = this;
            r1.<init>()
            com.kwad.components.core.request.model.ImpInfo r0 = r2.Rw
            r1.Rw = r0
            com.kwad.components.core.request.c r0 = r2.Xc
            r1.Xc = r0
            boolean r0 = r2.Xf
            r1.Xf = r0
            boolean r0 = r2.Xg
            r1.Xg = r0
            com.kwad.components.core.request.j r2 = r2.Xj
            r1.Xd = r2
            return
    }

    /* synthetic */ a(com.kwad.components.core.request.model.a.C0091a r1, byte r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static void a(@androidx.annotation.NonNull com.kwad.components.core.request.model.a r1, int r2, java.lang.String r3, boolean r4) {
            com.kwad.components.core.request.c r0 = r1.Xc
            r0.a(r2, r3, r4)
            int r4 = r1.getAdStyle()
            java.lang.String r1 = r1.sv()
            com.kwad.sdk.commercial.d.d.a(r4, r2, r3, r1)
            return
    }

    public static void a(@androidx.annotation.NonNull com.kwad.components.core.request.model.a r3, com.kwad.sdk.core.response.model.AdResultData r4, boolean r5) {
            com.kwad.components.core.request.model.ImpInfo r0 = r3.Rw
            com.kwad.sdk.internal.api.SceneImpl r0 = r0.adScene
            java.lang.String r1 = r3.sv()
            java.lang.String r2 = r4.getAdSource()
            com.kwad.sdk.commercial.d.d.a(r0, r1, r2)
            boolean r0 = r4.isAdResultDataEmpty()
            if (r0 == 0) goto L2e
            com.kwad.components.core.request.c r3 = r3.Xc
            com.kwad.sdk.core.network.e r0 = com.kwad.sdk.core.network.e.aEq
            int r0 = r0.errorCode
            java.lang.String r1 = r4.testErrorMsg
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L28
            com.kwad.sdk.core.network.e r4 = com.kwad.sdk.core.network.e.aEq
            java.lang.String r4 = r4.msg
            goto L2a
        L28:
            java.lang.String r4 = r4.testErrorMsg
        L2a:
            r3.a(r0, r4, r5)
            return
        L2e:
            com.kwad.components.core.request.c r3 = r3.Xc
            r3.a(r4, r5)
            return
    }

    public final void aE(java.lang.String r1) {
            r0 = this;
            r0.Xi = r1
            return
    }

    public final int getAdNum() {
            r1 = this;
            com.kwad.components.core.request.model.ImpInfo r0 = r1.Rw
            com.kwad.sdk.internal.api.SceneImpl r0 = r0.adScene
            if (r0 == 0) goto Lb
            int r0 = r0.getAdNum()
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public final int getAdStyle() {
            r1 = this;
            com.kwad.components.core.request.model.ImpInfo r0 = r1.Rw
            com.kwad.sdk.internal.api.SceneImpl r0 = r0.adScene
            if (r0 == 0) goto L9
            int r0 = r0.adStyle
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final long getPosId() {
            r2 = this;
            com.kwad.components.core.request.model.ImpInfo r0 = r2.Rw
            com.kwad.sdk.internal.api.SceneImpl r0 = r0.adScene
            if (r0 == 0) goto Lb
            long r0 = r0.getPosId()
            return r0
        Lb:
            r0 = -1
            return r0
    }

    @androidx.annotation.Nullable
    public final com.kwad.components.core.request.j su() {
            r1 = this;
            com.kwad.components.core.request.j r0 = r1.Xd
            return r0
    }

    public final java.lang.String sv() {
            r1 = this;
            java.lang.String r0 = r1.Xi
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = r1.Xi
            return r0
        Lb:
            java.lang.String r0 = "network_only"
            return r0
    }
}
