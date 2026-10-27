package com.beizi.ad.internal.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public enum g extends java.lang.Enum<com.beizi.ad.internal.animation.g> {
    public static final com.beizi.ad.internal.animation.g a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final com.beizi.ad.internal.animation.g f6645b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final com.beizi.ad.internal.animation.g f6646c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final com.beizi.ad.internal.animation.g f6647d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ com.beizi.ad.internal.animation.g[] f6648e = null;

    static {
            com.beizi.ad.internal.animation.g r0 = new com.beizi.ad.internal.animation.g
            java.lang.String r1 = "UP"
            r2 = 0
            r0.<init>(r1, r2)
            com.beizi.ad.internal.animation.g.a = r0
            com.beizi.ad.internal.animation.g r1 = new com.beizi.ad.internal.animation.g
            java.lang.String r3 = "DOWN"
            r4 = 1
            r1.<init>(r3, r4)
            com.beizi.ad.internal.animation.g.f6645b = r1
            com.beizi.ad.internal.animation.g r3 = new com.beizi.ad.internal.animation.g
            java.lang.String r5 = "RIGHT"
            r6 = 2
            r3.<init>(r5, r6)
            com.beizi.ad.internal.animation.g.f6646c = r3
            com.beizi.ad.internal.animation.g r5 = new com.beizi.ad.internal.animation.g
            java.lang.String r7 = "LEFT"
            r8 = 3
            r5.<init>(r7, r8)
            com.beizi.ad.internal.animation.g.f6647d = r5
            r7 = 4
            com.beizi.ad.internal.animation.g[] r7 = new com.beizi.ad.internal.animation.g[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            com.beizi.ad.internal.animation.g.f6648e = r7
            return
    }

    g(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.beizi.ad.internal.animation.g a(int r5) {
            com.beizi.ad.internal.animation.g[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L14
            r3 = r0[r2]
            int r4 = r3.ordinal()
            if (r4 != r5) goto L11
            return r3
        L11:
            int r2 = r2 + 1
            goto L6
        L14:
            com.beizi.ad.internal.animation.g r5 = com.beizi.ad.internal.animation.g.a
            return r5
    }

    public static com.beizi.ad.internal.animation.g valueOf(java.lang.String r1) {
            java.lang.Class<com.beizi.ad.internal.animation.g> r0 = com.beizi.ad.internal.animation.g.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.beizi.ad.internal.animation.g r1 = (com.beizi.ad.internal.animation.g) r1
            return r1
    }

    public static com.beizi.ad.internal.animation.g[] values() {
            com.beizi.ad.internal.animation.g[] r0 = com.beizi.ad.internal.animation.g.f6648e
            java.lang.Object r0 = r0.clone()
            com.beizi.ad.internal.animation.g[] r0 = (com.beizi.ad.internal.animation.g[]) r0
            return r0
    }
}
