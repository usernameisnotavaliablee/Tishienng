package com.kwad.components.core.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.sdk.components.e implements com.kwad.sdk.components.h {
    private java.lang.String Qa;
    private long Qb;
    private java.lang.String Qc;
    private android.content.Context mContext;


    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.f.a r0) {
            r0.qc()
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.f.a r0, java.lang.String r1) {
            r0.ap(r1)
            return
    }

    private void ao(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "EncryptComponentsImpl"
            java.lang.String r1 = "initGId"
            com.kwad.sdk.core.d.c.i(r0, r1)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L21
            r0.<init>()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "64"
            r2 = 0
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L21
            com.kwad.sdk.core.config.item.d r1 = com.kwad.sdk.core.config.c.aBs     // Catch: java.lang.Throwable -> L21
            boolean r1 = com.kwad.sdk.core.config.e.a(r1)     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L23
            java.lang.String r1 = "64_level"
            r2 = 1
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r0 = move-exception
            goto L27
        L23:
            com.kwad.sdk.core.f.c.handlePolicy(r0)     // Catch: java.lang.Throwable -> L21
            goto L2a
        L27:
            com.kwad.sdk.core.d.c.printStackTrace(r0)
        L2a:
            com.kwad.components.core.f.a$1 r0 = new com.kwad.components.core.f.a$1
            r0.<init>(r3)
            com.kwad.sdk.core.f.c.a(r4, r0)
            return
    }

    private void ap(java.lang.String r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            if (r0 == 0) goto L1c
            boolean r0 = com.kwad.sdk.utils.bp.isNullString(r2)
            if (r0 != 0) goto L1c
            java.lang.String r0 = r1.qh()
            boolean r0 = com.kwad.sdk.utils.bp.isEquals(r0, r2)
            if (r0 == 0) goto L15
            goto L1c
        L15:
            r1.Qc = r2
            android.content.Context r0 = r1.mContext
            com.kwad.sdk.utils.ag.ai(r0, r2)
        L1c:
            return
    }

    private void qc() {
            r4 = this;
            android.content.Context r0 = r4.mContext
            java.lang.String r0 = com.kwad.sdk.utils.ag.cW(r0)
            java.lang.String r1 = com.kwad.sdk.utils.br.RT()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L16
            android.content.Context r0 = r4.mContext
            com.kwad.sdk.utils.ag.ab(r0, r1)
            return
        L16:
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L3e
            java.lang.String r0 = ""
            r4.Qa = r0
            r2 = 0
            r4.Qb = r2
            r4.Qc = r0
            android.content.Context r2 = r4.mContext
            com.kwad.sdk.utils.ag.Y(r2, r0)
            android.content.Context r0 = r4.mContext
            long r2 = r4.Qb
            com.kwad.sdk.utils.ag.d(r0, r2)
            android.content.Context r0 = r4.mContext
            java.lang.String r2 = r4.Qc
            com.kwad.sdk.utils.ag.ai(r0, r2)
            android.content.Context r0 = r4.mContext
            com.kwad.sdk.utils.ag.ab(r0, r1)
        L3e:
            return
    }

    private java.lang.String qf() {
            r1 = this;
            java.lang.String r0 = r1.Qa
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            android.content.Context r0 = r1.mContext
            java.lang.String r0 = com.kwad.sdk.utils.ag.cR(r0)
            r1.Qa = r0
        L10:
            java.lang.String r0 = r1.Qa
            return r0
    }

    private long qg() {
            r5 = this;
            long r0 = r5.Qb
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L10
            android.content.Context r0 = r5.mContext
            long r0 = com.kwad.sdk.utils.ag.cU(r0)
            r5.Qb = r0
        L10:
            long r0 = r5.Qb
            return r0
    }

    private java.lang.String qh() {
            r1 = this;
            java.lang.String r0 = r1.Qc
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            android.content.Context r0 = r1.mContext
            java.lang.String r0 = com.kwad.sdk.utils.ag.cZ(r0)
            r1.Qc = r0
        L10:
            java.lang.String r0 = r1.Qc
            return r0
    }

    @Override // com.kwad.sdk.components.h
    public final void C(long r4) {
            r3 = this;
            android.content.Context r0 = r3.mContext
            if (r0 == 0) goto L1a
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1a
            long r0 = r3.qg()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            goto L1a
        L13:
            r3.Qb = r4
            android.content.Context r0 = r3.mContext
            com.kwad.sdk.utils.ag.d(r0, r4)
        L1a:
            return
    }

    @Override // com.kwad.sdk.components.h
    public final void aq(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.mContext
            if (r0 == 0) goto L36
            boolean r0 = com.kwad.sdk.utils.bp.isNullString(r3)
            if (r0 != 0) goto L36
            java.lang.String r0 = r2.qf()
            boolean r0 = com.kwad.sdk.utils.bp.isEquals(r0, r3)
            if (r0 == 0) goto L15
            goto L36
        L15:
            r2.Qa = r3     // Catch: java.lang.Throwable -> L22
            android.content.Context r0 = r2.mContext     // Catch: java.lang.Throwable -> L22
            com.kwad.sdk.utils.ag.Y(r0, r3)     // Catch: java.lang.Throwable -> L22
            android.content.Context r0 = r2.mContext     // Catch: java.lang.Throwable -> L22
            com.kwad.sdk.core.f.c.setEgid(r0, r3)     // Catch: java.lang.Throwable -> L22
            return
        L22:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setEGid error : "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "EncryptComponentsImpl"
            com.kwad.sdk.core.d.c.e(r0, r3)
        L36:
            return
    }

    @Override // com.kwad.sdk.components.b
    public final java.lang.Class getComponentsType() {
            r1 = this;
            java.lang.Class<com.kwad.sdk.components.h> r0 = com.kwad.sdk.components.h.class
            return r0
    }

    @Override // com.kwad.sdk.components.b
    public final void init(android.content.Context r3) {
            r2 = this;
            r2.mContext = r3     // Catch: java.lang.Throwable -> L6
            r2.ao(r3)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "initGId error : "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "EncryptComponentsImpl"
            com.kwad.sdk.core.d.c.e(r0, r3)
            return
    }

    @Override // com.kwad.sdk.components.e, com.kwad.sdk.components.b
    public final int priority() {
            r1 = this;
            r0 = -200(0xffffffffffffff38, float:NaN)
            return r0
    }

    @Override // com.kwad.sdk.components.h
    public final java.lang.String qd() {
            r5 = this;
            boolean r0 = com.kwad.sdk.core.config.e.Fs()
            if (r0 != 0) goto L20
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.qg()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L20
            java.lang.String r0 = r5.qf()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1d
            goto L20
        L1d:
            java.lang.String r0 = ""
            return r0
        L20:
            java.lang.String r0 = r5.qh()
            return r0
    }

    @Override // com.kwad.sdk.components.h
    public final com.kwad.sdk.core.a.g qe() {
            r1 = this;
            com.kwad.sdk.core.a.a r0 = new com.kwad.sdk.core.a.a
            r0.<init>()
            return r0
    }
}
