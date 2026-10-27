package com.bxkj.base.v2.common.ext;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class u {
    public u() {
            r1 = this;
            r1.<init>()
            return
    }

    private static final void a(java.lang.StringBuilder r2, int r3) {
            r0 = 0
        L1:
            if (r0 >= r3) goto Lb
            r1 = 9
            r2.append(r1)
            int r0 = r0 + 1
            goto L1
        Lb:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String b(@org.jetbrains.annotations.Nullable java.lang.String r8) {
            java.lang.String r0 = ""
            if (r8 == 0) goto L6a
            boolean r1 = kotlin.jvm.internal.g0.g(r0, r8)
            if (r1 == 0) goto Lb
            goto L6a
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r8.length()
            r2 = 0
            r3 = 0
            r4 = 0
        L17:
            if (r2 >= r1) goto L60
            char r5 = r8.charAt(r2)
            r6 = 44
            r7 = 10
            if (r5 == r6) goto L4f
            r3 = 91
            if (r5 == r3) goto L43
            r3 = 93
            if (r5 == r3) goto L37
            r3 = 123(0x7b, float:1.72E-43)
            if (r5 == r3) goto L43
            r3 = 125(0x7d, float:1.75E-43)
            if (r5 == r3) goto L37
            r0.append(r5)
            goto L5c
        L37:
            r0.append(r7)
            int r4 = r4 + (-1)
            a(r0, r4)
            r0.append(r5)
            goto L5c
        L43:
            r0.append(r5)
            r0.append(r7)
            int r4 = r4 + 1
            a(r0, r4)
            goto L5c
        L4f:
            r0.append(r5)
            r6 = 92
            if (r3 == r6) goto L5c
            r0.append(r7)
            a(r0, r4)
        L5c:
            int r2 = r2 + 1
            r3 = r5
            goto L17
        L60:
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r8, r0)
            return r8
        L6a:
            return r0
    }

    public static final long c(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L13
            r0.<init>(r2)     // Catch: java.lang.Exception -> L13
            java.util.Date r1 = r0.parse(r1)     // Catch: java.lang.Exception -> L13
            long r1 = r1.getTime()     // Catch: java.lang.Exception -> L13
            return r1
        L13:
            r1 = 0
            return r1
    }

    public static /* synthetic */ long d(java.lang.String r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
        L6:
            long r0 = c(r0, r1)
            return r0
    }
}
