package com.beizi.ad.internal.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.internal.animation.a$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = null;

        static {
                com.beizi.ad.internal.animation.h[] r0 = com.beizi.ad.internal.animation.h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.beizi.ad.internal.animation.a.AnonymousClass1.a = r0
                com.beizi.ad.internal.animation.h r1 = com.beizi.ad.internal.animation.h.f6650c     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.beizi.ad.internal.animation.a.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.beizi.ad.internal.animation.h r1 = com.beizi.ad.internal.animation.h.f6651d     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.beizi.ad.internal.animation.a.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.beizi.ad.internal.animation.h r1 = com.beizi.ad.internal.animation.h.f6652e     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.beizi.ad.internal.animation.a.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L33
                com.beizi.ad.internal.animation.h r1 = com.beizi.ad.internal.animation.h.f6653f     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.beizi.ad.internal.animation.f a(com.beizi.ad.internal.animation.h r2, long r3, com.beizi.ad.internal.animation.g r5) {
            com.beizi.ad.internal.animation.h r0 = com.beizi.ad.internal.animation.h.f6649b
            if (r2 != r0) goto L22
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.beizi.ad.internal.animation.h[] r1 = com.beizi.ad.internal.animation.h.values()
            java.util.Collections.addAll(r2, r1)
            com.beizi.ad.internal.animation.h r1 = com.beizi.ad.internal.animation.h.a
            r2.remove(r1)
            r2.remove(r0)
            java.util.Collections.shuffle(r2)
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            com.beizi.ad.internal.animation.h r2 = (com.beizi.ad.internal.animation.h) r2
        L22:
            int[] r0 = com.beizi.ad.internal.animation.a.AnonymousClass1.a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L4a
            r0 = 2
            if (r2 == r0) goto L44
            r0 = 3
            if (r2 == r0) goto L3e
            r0 = 4
            if (r2 == r0) goto L38
            r2 = 0
            return r2
        L38:
            com.beizi.ad.internal.animation.e r2 = new com.beizi.ad.internal.animation.e
            r2.<init>(r3, r5)
            return r2
        L3e:
            com.beizi.ad.internal.animation.c r2 = new com.beizi.ad.internal.animation.c
            r2.<init>(r3, r5)
            return r2
        L44:
            com.beizi.ad.internal.animation.d r2 = new com.beizi.ad.internal.animation.d
            r2.<init>(r3, r5)
            return r2
        L4a:
            com.beizi.ad.internal.animation.b r2 = new com.beizi.ad.internal.animation.b
            r2.<init>(r3)
            return r2
    }
}
