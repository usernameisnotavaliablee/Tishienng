package com.bytedance.msdk.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j implements com.bytedance.sdk.component.g.cw.xt {
    private final com.bytedance.msdk.tl.l cw;
    java.lang.String j;
    private android.content.Context xt;

    public j(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "sp_multi_ttmadnet_config"
            r1.j = r0
            r1.xt = r2
            android.content.Context r2 = r1.getContext()
            com.bytedance.msdk.tl.l r2 = com.bytedance.msdk.tl.l.j(r0, r2)
            r1.cw = r2
            return
    }

    @Override // com.bytedance.sdk.component.g.cw.xt
    public java.lang.String cw() {
            r1 = this;
            java.lang.String r0 = "android"
            return r0
    }

    @Override // com.bytedance.sdk.component.g.cw.xt
    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.xt
            return r0
    }

    @Override // com.bytedance.sdk.component.g.cw.xt
    public int j() {
            r1 = this;
            r0 = 4741(0x1285, float:6.644E-42)
            return r0
    }

    @Override // com.bytedance.sdk.component.g.cw.xt
    public android.location.Address j(android.content.Context r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.bytedance.sdk.component.g.cw.xt
    public java.lang.String j(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            com.bytedance.msdk.tl.l r1 = r0.cw
            java.lang.String r1 = r1.xt(r2, r3)
            return r1
    }

    @Override // com.bytedance.sdk.component.g.cw.xt
    public void j(android.content.Context r5, java.util.Map<java.lang.String, ?> r6) {
            r4 = this;
            if (r6 == 0) goto L84
            java.util.Set r5 = r6.entrySet()     // Catch: java.lang.Throwable -> L84
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L84
        La:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r6 == 0) goto L84
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L84
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = r6.getValue()     // Catch: java.lang.Throwable -> L84
            boolean r1 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L30
            com.bytedance.msdk.tl.l r1 = r4.cw     // Catch: java.lang.Throwable -> L84
            java.lang.Object r6 = r6.getKey()     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L84
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L84
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L84
            r1.j(r6, r0)     // Catch: java.lang.Throwable -> L84
            goto La
        L30:
            boolean r1 = r0 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L46
            com.bytedance.msdk.tl.l r1 = r4.cw     // Catch: java.lang.Throwable -> L84
            java.lang.Object r6 = r6.getKey()     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L84
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L84
            long r2 = r0.longValue()     // Catch: java.lang.Throwable -> L84
            r1.j(r6, r2)     // Catch: java.lang.Throwable -> L84
            goto La
        L46:
            boolean r1 = r0 instanceof java.lang.Float     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L5c
            com.bytedance.msdk.tl.l r1 = r4.cw     // Catch: java.lang.Throwable -> L84
            java.lang.Object r6 = r6.getKey()     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L84
            java.lang.Float r0 = (java.lang.Float) r0     // Catch: java.lang.Throwable -> L84
            float r0 = r0.floatValue()     // Catch: java.lang.Throwable -> L84
            r1.j(r6, r0)     // Catch: java.lang.Throwable -> L84
            goto La
        L5c:
            boolean r1 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L72
            com.bytedance.msdk.tl.l r1 = r4.cw     // Catch: java.lang.Throwable -> L84
            java.lang.Object r6 = r6.getKey()     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L84
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L84
            r1.j(r6, r0)     // Catch: java.lang.Throwable -> L84
            goto La
        L72:
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto La
            com.bytedance.msdk.tl.l r1 = r4.cw     // Catch: java.lang.Throwable -> L84
            java.lang.Object r6 = r6.getKey()     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L84
            r1.j(r6, r0)     // Catch: java.lang.Throwable -> L84
            goto La
        L84:
            return
    }

    @Override // com.bytedance.sdk.component.g.cw.xt
    public java.lang.String[] m() {
            r3 = this;
            java.lang.String r0 = "tnc3-alisc1.zijieapi.com"
            java.lang.String r1 = "tnc3-aliec2.zijieapi.com"
            java.lang.String r2 = "tnc3-bjlgy.zijieapi.com"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            return r0
    }

    @Override // com.bytedance.sdk.component.g.cw.xt
    public int r() {
            r1 = this;
            int r0 = com.bytedance.msdk.xt.xt.j()
            return r0
    }

    @Override // com.bytedance.sdk.component.g.cw.xt
    public java.lang.String up() {
            r1 = this;
            java.lang.String r0 = com.bytedance.msdk.tl.x.j()
            return r0
    }

    @Override // com.bytedance.sdk.component.g.cw.xt
    public java.lang.String xt() {
            r1 = this;
            java.lang.String r0 = "msdk"
            return r0
    }
}
