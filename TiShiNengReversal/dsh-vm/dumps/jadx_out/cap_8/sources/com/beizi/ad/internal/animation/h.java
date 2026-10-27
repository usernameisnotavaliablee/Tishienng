package com.beizi.ad.internal.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public enum h extends java.lang.Enum<com.beizi.ad.internal.animation.h> {
    public static final com.beizi.ad.internal.animation.h a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final com.beizi.ad.internal.animation.h f6649b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final com.beizi.ad.internal.animation.h f6650c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final com.beizi.ad.internal.animation.h f6651d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final com.beizi.ad.internal.animation.h f6652e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final com.beizi.ad.internal.animation.h f6653f = null;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ com.beizi.ad.internal.animation.h[] f6654g = null;

    static {
            com.beizi.ad.internal.animation.h r0 = new com.beizi.ad.internal.animation.h
            java.lang.String r1 = "NONE"
            r2 = 0
            r0.<init>(r1, r2)
            com.beizi.ad.internal.animation.h.a = r0
            com.beizi.ad.internal.animation.h r1 = new com.beizi.ad.internal.animation.h
            java.lang.String r3 = "RANDOM"
            r4 = 1
            r1.<init>(r3, r4)
            com.beizi.ad.internal.animation.h.f6649b = r1
            com.beizi.ad.internal.animation.h r3 = new com.beizi.ad.internal.animation.h
            java.lang.String r5 = "FADE"
            r6 = 2
            r3.<init>(r5, r6)
            com.beizi.ad.internal.animation.h.f6650c = r3
            com.beizi.ad.internal.animation.h r5 = new com.beizi.ad.internal.animation.h
            java.lang.String r7 = "PUSH"
            r8 = 3
            r5.<init>(r7, r8)
            com.beizi.ad.internal.animation.h.f6651d = r5
            com.beizi.ad.internal.animation.h r7 = new com.beizi.ad.internal.animation.h
            java.lang.String r9 = "MOVEIN"
            r10 = 4
            r7.<init>(r9, r10)
            com.beizi.ad.internal.animation.h.f6652e = r7
            com.beizi.ad.internal.animation.h r9 = new com.beizi.ad.internal.animation.h
            java.lang.String r11 = "REVEAL"
            r12 = 5
            r9.<init>(r11, r12)
            com.beizi.ad.internal.animation.h.f6653f = r9
            r11 = 6
            com.beizi.ad.internal.animation.h[] r11 = new com.beizi.ad.internal.animation.h[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            com.beizi.ad.internal.animation.h.f6654g = r11
            return
    }

    h(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.beizi.ad.internal.animation.h a(int r5) {
            com.beizi.ad.internal.animation.h[] r0 = values()
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
            com.beizi.ad.internal.animation.h r5 = com.beizi.ad.internal.animation.h.a
            return r5
    }

    public static com.beizi.ad.internal.animation.h valueOf(java.lang.String r1) {
            java.lang.Class<com.beizi.ad.internal.animation.h> r0 = com.beizi.ad.internal.animation.h.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.beizi.ad.internal.animation.h r1 = (com.beizi.ad.internal.animation.h) r1
            return r1
    }

    public static com.beizi.ad.internal.animation.h[] values() {
            com.beizi.ad.internal.animation.h[] r0 = com.beizi.ad.internal.animation.h.f6654g
            java.lang.Object r0 = r0.clone()
            com.beizi.ad.internal.animation.h[] r0 = (com.beizi.ad.internal.animation.h[]) r0
            return r0
    }
}
