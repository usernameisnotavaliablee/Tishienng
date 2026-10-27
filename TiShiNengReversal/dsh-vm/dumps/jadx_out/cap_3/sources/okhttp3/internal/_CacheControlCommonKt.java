package okhttp3.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class _CacheControlCommonKt {
    public _CacheControlCommonKt() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CacheControl commonBuild(@org.jetbrains.annotations.NotNull okhttp3.CacheControl.Builder r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r15, r0)
            okhttp3.CacheControl r1 = new okhttp3.CacheControl
            boolean r2 = r15.getNoCache$okhttp()
            boolean r3 = r15.getNoStore$okhttp()
            int r4 = r15.getMaxAgeSeconds$okhttp()
            int r9 = r15.getMaxStaleSeconds$okhttp()
            int r10 = r15.getMinFreshSeconds$okhttp()
            boolean r11 = r15.getOnlyIfCached$okhttp()
            boolean r12 = r15.getNoTransform$okhttp()
            boolean r13 = r15.getImmutable$okhttp()
            r14 = 0
            r5 = -1
            r6 = 0
            r7 = 0
            r8 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
    }

    public static final int commonClampToInt(long r3) {
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lb
            r3 = 2147483647(0x7fffffff, float:NaN)
            return r3
        Lb:
            int r4 = (int) r3
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CacheControl commonForceCache(@org.jetbrains.annotations.NotNull okhttp3.CacheControl.Companion r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.CacheControl$Builder r2 = new okhttp3.CacheControl$Builder
            r2.<init>()
            okhttp3.CacheControl$Builder r2 = r2.onlyIfCached()
            kotlin.time.h$a r0 = kotlin.time.h.b
            r0 = 2147483647(0x7fffffff, float:NaN)
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.SECONDS
            long r0 = kotlin.time.j.w(r0, r1)
            okhttp3.CacheControl$Builder r2 = r2.maxStale-LRDsOJo(r0)
            okhttp3.CacheControl r2 = r2.build()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CacheControl commonForceNetwork(@org.jetbrains.annotations.NotNull okhttp3.CacheControl.Companion r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            okhttp3.CacheControl$Builder r1 = new okhttp3.CacheControl$Builder
            r1.<init>()
            okhttp3.CacheControl$Builder r1 = r1.noCache()
            okhttp3.CacheControl r1 = r1.build()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CacheControl.Builder commonImmutable(@org.jetbrains.annotations.NotNull okhttp3.CacheControl.Builder r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 1
            r1.setImmutable$okhttp(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CacheControl.Builder commonNoCache(@org.jetbrains.annotations.NotNull okhttp3.CacheControl.Builder r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 1
            r1.setNoCache$okhttp(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CacheControl.Builder commonNoStore(@org.jetbrains.annotations.NotNull okhttp3.CacheControl.Builder r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 1
            r1.setNoStore$okhttp(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CacheControl.Builder commonNoTransform(@org.jetbrains.annotations.NotNull okhttp3.CacheControl.Builder r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 1
            r1.setNoTransform$okhttp(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CacheControl.Builder commonOnlyIfCached(@org.jetbrains.annotations.NotNull okhttp3.CacheControl.Builder r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 1
            r1.setOnlyIfCached$okhttp(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CacheControl commonParse(@org.jetbrains.annotations.NotNull okhttp3.CacheControl.Companion r30, @org.jetbrains.annotations.NotNull okhttp3.Headers r31) {
            r0 = r31
            java.lang.String r1 = "<this>"
            r2 = r30
            kotlin.jvm.internal.g0.p(r2, r1)
            java.lang.String r1 = "headers"
            kotlin.jvm.internal.g0.p(r0, r1)
            int r1 = r0.size()
            r4 = 1
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L27:
            if (r6 >= r1) goto L1ba
            java.lang.String r2 = r0.name(r6)
            java.lang.String r5 = r0.value(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = kotlin.text.u.a2(r2, r3, r4)
            if (r3 == 0) goto L3f
            if (r8 == 0) goto L3d
        L3b:
            r7 = 0
            goto L48
        L3d:
            r8 = r5
            goto L48
        L3f:
            java.lang.String r3 = "Pragma"
            boolean r2 = kotlin.text.u.a2(r2, r3, r4)
            if (r2 == 0) goto L1ad
            goto L3b
        L48:
            r2 = 0
        L49:
            int r3 = r5.length()
            if (r2 >= r3) goto L1ad
            java.lang.String r3 = "=,;"
            int r3 = indexOfElement(r5, r3, r2)
            java.lang.String r2 = r5.substring(r2, r3)
            r27 = 1
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.g0.o(r2, r4)
            java.lang.CharSequence r2 = kotlin.text.u.Z5(r2)
            java.lang.String r2 = r2.toString()
            int r0 = r5.length()
            if (r3 == r0) goto Ld0
            char r0 = r5.charAt(r3)
            r28 = r1
            r1 = 44
            if (r0 == r1) goto L80
            char r0 = r5.charAt(r3)
            r1 = 59
            if (r0 != r1) goto L82
        L80:
            r1 = r5
            goto Ld3
        L82:
            int r3 = r3 + 1
            int r0 = okhttp3.internal._UtilCommonKt.indexOfNonWhitespace(r5, r3)
            int r1 = r5.length()
            if (r0 >= r1) goto Lb9
            char r1 = r5.charAt(r0)
            r3 = 34
            if (r1 != r3) goto Lb9
            int r23 = r0 + 1
            r25 = 4
            r26 = 0
            r22 = 34
            r24 = 0
            r21 = r5
            int r0 = kotlin.text.u.G3(r21, r22, r23, r24, r25, r26)
            r1 = r21
            r3 = r23
            java.lang.String r3 = r1.substring(r3, r0)
            kotlin.jvm.internal.g0.o(r3, r4)
            int r0 = r0 + 1
            r29 = r3
            r3 = r0
            r0 = r29
            goto Ld6
        Lb9:
            r1 = r5
            java.lang.String r3 = ",;"
            int r3 = indexOfElement(r1, r3, r0)
            java.lang.String r0 = r1.substring(r0, r3)
            kotlin.jvm.internal.g0.o(r0, r4)
            java.lang.CharSequence r0 = kotlin.text.u.Z5(r0)
            java.lang.String r0 = r0.toString()
            goto Ld6
        Ld0:
            r28 = r1
            goto L80
        Ld3:
            int r3 = r3 + 1
            r0 = 0
        Ld6:
            java.lang.String r4 = "no-cache"
            r5 = 1
            boolean r4 = kotlin.text.u.a2(r4, r2, r5)
            if (r4 == 0) goto Le9
            r0 = r31
            r5 = r1
            r2 = r3
            r1 = r28
            r4 = 1
            r9 = 1
            goto L49
        Le9:
            java.lang.String r4 = "no-store"
            boolean r4 = kotlin.text.u.a2(r4, r2, r5)
            if (r4 == 0) goto Lfb
            r0 = r31
            r5 = r1
            r2 = r3
            r1 = r28
            r4 = 1
            r10 = 1
            goto L49
        Lfb:
            java.lang.String r4 = "max-age"
            boolean r4 = kotlin.text.u.a2(r4, r2, r5)
            if (r4 == 0) goto L111
            r4 = -1
            int r11 = okhttp3.internal._UtilCommonKt.toNonNegativeInt(r0, r4)
        L108:
            r0 = r31
            r5 = r1
            r2 = r3
            r1 = r28
            r4 = 1
            goto L49
        L111:
            java.lang.String r4 = "s-maxage"
            boolean r4 = kotlin.text.u.a2(r4, r2, r5)
            if (r4 == 0) goto L11f
            r4 = -1
            int r12 = okhttp3.internal._UtilCommonKt.toNonNegativeInt(r0, r4)
            goto L108
        L11f:
            java.lang.String r4 = "private"
            boolean r4 = kotlin.text.u.a2(r4, r2, r5)
            if (r4 == 0) goto L131
            r0 = r31
            r5 = r1
            r2 = r3
            r1 = r28
            r4 = 1
            r13 = 1
            goto L49
        L131:
            java.lang.String r4 = "public"
            boolean r4 = kotlin.text.u.a2(r4, r2, r5)
            if (r4 == 0) goto L143
            r0 = r31
            r5 = r1
            r2 = r3
            r1 = r28
            r4 = 1
            r14 = 1
            goto L49
        L143:
            java.lang.String r4 = "must-revalidate"
            boolean r4 = kotlin.text.u.a2(r4, r2, r5)
            if (r4 == 0) goto L155
            r0 = r31
            r5 = r1
            r2 = r3
            r1 = r28
            r4 = 1
            r15 = 1
            goto L49
        L155:
            java.lang.String r4 = "max-stale"
            boolean r4 = kotlin.text.u.a2(r4, r2, r5)
            if (r4 == 0) goto L165
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = okhttp3.internal._UtilCommonKt.toNonNegativeInt(r0, r2)
            goto L108
        L165:
            java.lang.String r4 = "min-fresh"
            boolean r4 = kotlin.text.u.a2(r4, r2, r5)
            if (r4 == 0) goto L173
            r4 = -1
            int r17 = okhttp3.internal._UtilCommonKt.toNonNegativeInt(r0, r4)
            goto L108
        L173:
            r4 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = kotlin.text.u.a2(r0, r2, r5)
            if (r0 == 0) goto L187
            r0 = r31
            r5 = r1
            r2 = r3
            r1 = r28
            r4 = 1
            r18 = 1
            goto L49
        L187:
            java.lang.String r0 = "no-transform"
            boolean r0 = kotlin.text.u.a2(r0, r2, r5)
            if (r0 == 0) goto L19a
            r0 = r31
            r5 = r1
            r2 = r3
            r1 = r28
            r4 = 1
            r19 = 1
            goto L49
        L19a:
            java.lang.String r0 = "immutable"
            boolean r0 = kotlin.text.u.a2(r0, r2, r5)
            if (r0 == 0) goto L108
            r0 = r31
            r5 = r1
            r2 = r3
            r1 = r28
            r4 = 1
            r20 = 1
            goto L49
        L1ad:
            r28 = r1
            r4 = -1
            r5 = 1
            int r6 = r6 + 1
            r0 = r31
            r1 = r28
            r4 = 1
            goto L27
        L1ba:
            if (r7 != 0) goto L1bf
            r21 = 0
            goto L1c1
        L1bf:
            r21 = r8
        L1c1:
            okhttp3.CacheControl r8 = new okhttp3.CacheControl
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r8
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonToString(@org.jetbrains.annotations.NotNull okhttp3.CacheControl r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = r4.getHeaderValue$okhttp()
            if (r0 != 0) goto Le2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r4.noCache()
            if (r1 == 0) goto L1b
            java.lang.String r1 = "no-cache, "
            r0.append(r1)
        L1b:
            boolean r1 = r4.noStore()
            if (r1 == 0) goto L26
            java.lang.String r1 = "no-store, "
            r0.append(r1)
        L26:
            int r1 = r4.maxAgeSeconds()
            java.lang.String r2 = ", "
            r3 = -1
            if (r1 == r3) goto L3e
            java.lang.String r1 = "max-age="
            r0.append(r1)
            int r1 = r4.maxAgeSeconds()
            r0.append(r1)
            r0.append(r2)
        L3e:
            int r1 = r4.sMaxAgeSeconds()
            if (r1 == r3) goto L53
            java.lang.String r1 = "s-maxage="
            r0.append(r1)
            int r1 = r4.sMaxAgeSeconds()
            r0.append(r1)
            r0.append(r2)
        L53:
            boolean r1 = r4.isPrivate()
            if (r1 == 0) goto L5e
            java.lang.String r1 = "private, "
            r0.append(r1)
        L5e:
            boolean r1 = r4.isPublic()
            if (r1 == 0) goto L69
            java.lang.String r1 = "public, "
            r0.append(r1)
        L69:
            boolean r1 = r4.mustRevalidate()
            if (r1 == 0) goto L74
            java.lang.String r1 = "must-revalidate, "
            r0.append(r1)
        L74:
            int r1 = r4.maxStaleSeconds()
            if (r1 == r3) goto L89
            java.lang.String r1 = "max-stale="
            r0.append(r1)
            int r1 = r4.maxStaleSeconds()
            r0.append(r1)
            r0.append(r2)
        L89:
            int r1 = r4.minFreshSeconds()
            if (r1 == r3) goto L9e
            java.lang.String r1 = "min-fresh="
            r0.append(r1)
            int r1 = r4.minFreshSeconds()
            r0.append(r1)
            r0.append(r2)
        L9e:
            boolean r1 = r4.onlyIfCached()
            if (r1 == 0) goto La9
            java.lang.String r1 = "only-if-cached, "
            r0.append(r1)
        La9:
            boolean r1 = r4.noTransform()
            if (r1 == 0) goto Lb4
            java.lang.String r1 = "no-transform, "
            r0.append(r1)
        Lb4:
            boolean r1 = r4.immutable()
            if (r1 == 0) goto Lbf
            java.lang.String r1 = "immutable, "
            r0.append(r1)
        Lbf:
            int r1 = r0.length()
            if (r1 != 0) goto Lc8
            java.lang.String r4 = ""
            return r4
        Lc8:
            int r1 = r0.length()
            int r1 = r1 + (-2)
            int r2 = r0.length()
            java.lang.StringBuilder r1 = r0.delete(r1, r2)
            java.lang.String r2 = "delete(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.String r0 = r0.toString()
            r4.setHeaderValue$okhttp(r0)
        Le2:
            return r0
    }

    private static final int indexOfElement(java.lang.String r5, java.lang.String r6, int r7) {
            int r0 = r5.length()
        L4:
            if (r7 >= r0) goto L17
            char r1 = r5.charAt(r7)
            r2 = 2
            r3 = 0
            r4 = 0
            boolean r1 = kotlin.text.u.k3(r6, r1, r4, r2, r3)
            if (r1 == 0) goto L14
            return r7
        L14:
            int r7 = r7 + 1
            goto L4
        L17:
            int r5 = r5.length()
            return r5
    }

    static /* synthetic */ int indexOfElement$default(java.lang.String r0, java.lang.String r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            int r0 = indexOfElement(r0, r1, r2)
            return r0
    }
}
