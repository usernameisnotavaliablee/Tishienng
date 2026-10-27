package com.beizi.ad.v2.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends com.beizi.ad.v2.a.a {

    /* renamed from: b, reason: collision with root package name */
    private int f7528b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.List<android.util.Pair<java.lang.String, java.lang.Integer>> f7529c;

    /* renamed from: d, reason: collision with root package name */
    private android.view.View f7530d;

    public a(android.content.Context r2, java.lang.String r3, int r4, com.beizi.ad.h r5) {
            r1 = this;
            r1.<init>()
            com.beizi.ad.v2.d.b r0 = new com.beizi.ad.v2.d.b
            r0.<init>(r2, r3, r4)
            r1.a = r0
            boolean r2 = r0 instanceof com.beizi.ad.v2.d.b
            if (r2 == 0) goto L11
            r0.a(r5)
        L11:
            return
    }

    public void a(int r5, android.view.View r6, android.view.View r7, java.lang.String r8) {
            r4 = this;
            int r0 = r4.n()
            boolean r1 = com.beizi.ad.lance.a.p.a(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "percent = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ",isPass = "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "BeiZisAd"
            com.beizi.ad.lance.a.m.c(r2, r0)
            if (r1 == 0) goto L2e
            android.view.View r5 = com.beizi.ad.lance.a.g.a(r5, r6, r7, r8)
            r4.f7530d = r5
        L2e:
            return
    }

    public void a(android.view.View r3, com.beizi.ad.internal.e.e r4) {
            r2 = this;
            com.beizi.ad.v2.a.b r0 = r2.a
            if (r0 == 0) goto L13
            if (r3 == 0) goto L13
            if (r4 != 0) goto L9
            goto L13
        L9:
            boolean r1 = r0 instanceof com.beizi.ad.v2.d.b
            if (r1 != 0) goto Le
            goto L13
        Le:
            com.beizi.ad.v2.d.b r0 = (com.beizi.ad.v2.d.b) r0
            r0.a(r3, r4)
        L13:
            return
    }

    public void a(java.util.List<android.util.Pair<java.lang.String, java.lang.Integer>> r1) {
            r0 = this;
            r0.f7529c = r1
            return
    }

    public void b(int r1) {
            r0 = this;
            r0.f7528b = r1
            return
    }

    public int n() {
            r6 = this;
            com.beizi.ad.v2.a.b r0 = r6.a
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = r0 instanceof com.beizi.ad.v2.d.b
            if (r2 != 0) goto Lb
            return r1
        Lb:
            com.beizi.ad.v2.d.b r0 = (com.beizi.ad.v2.d.b) r0
            java.lang.String r0 = r0.u()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L18
            return r1
        L18:
            java.util.List<android.util.Pair<java.lang.String, java.lang.Integer>> r2 = r6.f7529c
            if (r2 == 0) goto L40
            java.util.Iterator r2 = r2.iterator()
            r3 = -1
        L21:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L41
            java.lang.Object r4 = r2.next()
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r5 = r4.first
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = r0.contains(r5)
            if (r5 == 0) goto L21
            java.lang.Object r3 = r4.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L21
        L40:
            r3 = -1
        L41:
            if (r3 != r1) goto L46
            int r0 = r6.f7528b
            return r0
        L46:
            return r3
    }

    public void o() {
            r1 = this;
            android.view.View r0 = r1.f7530d
            if (r0 == 0) goto L7
            com.beizi.ad.internal.h.u.a(r0)
        L7:
            return
    }
}
