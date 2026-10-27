package com.google.common.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class CacheStats {
    private final long evictionCount;
    private final long hitCount;
    private final long loadExceptionCount;
    private final long loadSuccessCount;
    private final long missCount;
    private final long totalLoadTime;

    public CacheStats(long r19, long r21, long r23, long r25, long r27, long r29) {
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r21
            r5 = r23
            r7 = r25
            r9 = r27
            r11 = r29
            r0.<init>()
            r13 = 0
            r14 = 1
            r15 = 0
            int r17 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r17 < 0) goto L1c
            r17 = 1
            goto L1e
        L1c:
            r17 = 0
        L1e:
            com.google.common.base.Preconditions.checkArgument(r17)
            int r17 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r17 < 0) goto L28
            r17 = 1
            goto L2a
        L28:
            r17 = 0
        L2a:
            com.google.common.base.Preconditions.checkArgument(r17)
            int r17 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r17 < 0) goto L34
            r17 = 1
            goto L36
        L34:
            r17 = 0
        L36:
            com.google.common.base.Preconditions.checkArgument(r17)
            int r17 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r17 < 0) goto L40
            r17 = 1
            goto L42
        L40:
            r17 = 0
        L42:
            com.google.common.base.Preconditions.checkArgument(r17)
            int r17 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r17 < 0) goto L4c
            r17 = 1
            goto L4e
        L4c:
            r17 = 0
        L4e:
            com.google.common.base.Preconditions.checkArgument(r17)
            int r17 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r17 < 0) goto L56
            r13 = 1
        L56:
            com.google.common.base.Preconditions.checkArgument(r13)
            r0.hitCount = r1
            r0.missCount = r3
            r0.loadSuccessCount = r5
            r0.loadExceptionCount = r7
            r0.totalLoadTime = r9
            r0.evictionCount = r11
            return
    }

    public double averageLoadPenalty() {
            r5 = this;
            long r0 = r5.loadSuccessCount
            long r2 = r5.loadExceptionCount
            long r0 = r0 + r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = 0
            return r0
        Le:
            long r2 = r5.totalLoadTime
            double r2 = (double) r2
            double r0 = (double) r0
            double r2 = r2 / r0
            return r2
    }

    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof com.google.common.cache.CacheStats
            r1 = 0
            if (r0 == 0) goto L39
            com.google.common.cache.CacheStats r7 = (com.google.common.cache.CacheStats) r7
            long r2 = r6.hitCount
            long r4 = r7.hitCount
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L39
            long r2 = r6.missCount
            long r4 = r7.missCount
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L39
            long r2 = r6.loadSuccessCount
            long r4 = r7.loadSuccessCount
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L39
            long r2 = r6.loadExceptionCount
            long r4 = r7.loadExceptionCount
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L39
            long r2 = r6.totalLoadTime
            long r4 = r7.totalLoadTime
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L39
            long r2 = r6.evictionCount
            long r4 = r7.evictionCount
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L39
            r7 = 1
            return r7
        L39:
            return r1
    }

    public long evictionCount() {
            r2 = this;
            long r0 = r2.evictionCount
            return r0
    }

    public int hashCode() {
            r8 = this;
            long r0 = r8.hitCount
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r1 = r8.missCount
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r2 = r8.loadSuccessCount
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r8.loadExceptionCount
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            long r4 = r8.totalLoadTime
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            long r5 = r8.evictionCount
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            r6[r7] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r2
            r0 = 3
            r6[r0] = r3
            r0 = 4
            r6[r0] = r4
            r0 = 5
            r6[r0] = r5
            int r0 = com.google.common.base.Objects.hashCode(r6)
            return r0
    }

    public long hitCount() {
            r2 = this;
            long r0 = r2.hitCount
            return r0
    }

    public double hitRate() {
            r5 = this;
            long r0 = r5.requestCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Ld
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            return r0
        Ld:
            long r2 = r5.hitCount
            double r2 = (double) r2
            double r0 = (double) r0
            double r2 = r2 / r0
            return r2
    }

    public long loadCount() {
            r4 = this;
            long r0 = r4.loadSuccessCount
            long r2 = r4.loadExceptionCount
            long r0 = r0 + r2
            return r0
    }

    public long loadExceptionCount() {
            r2 = this;
            long r0 = r2.loadExceptionCount
            return r0
    }

    public double loadExceptionRate() {
            r7 = this;
            long r0 = r7.loadSuccessCount
            long r2 = r7.loadExceptionCount
            long r0 = r0 + r2
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto Le
            r0 = 0
            return r0
        Le:
            double r2 = (double) r2
            double r0 = (double) r0
            double r2 = r2 / r0
            return r2
    }

    public long loadSuccessCount() {
            r2 = this;
            long r0 = r2.loadSuccessCount
            return r0
    }

    public com.google.common.cache.CacheStats minus(com.google.common.cache.CacheStats r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            com.google.common.cache.CacheStats r2 = new com.google.common.cache.CacheStats
            long r3 = r0.hitCount
            long r5 = r1.hitCount
            long r3 = r3 - r5
            r5 = 0
            long r3 = java.lang.Math.max(r5, r3)
            long r7 = r0.missCount
            long r9 = r1.missCount
            long r7 = r7 - r9
            long r7 = java.lang.Math.max(r5, r7)
            long r9 = r0.loadSuccessCount
            long r11 = r1.loadSuccessCount
            long r9 = r9 - r11
            long r9 = java.lang.Math.max(r5, r9)
            long r11 = r0.loadExceptionCount
            long r13 = r1.loadExceptionCount
            long r11 = r11 - r13
            long r11 = java.lang.Math.max(r5, r11)
            long r13 = r0.totalLoadTime
            r15 = r2
            r16 = r3
            long r2 = r1.totalLoadTime
            long r13 = r13 - r2
            long r2 = java.lang.Math.max(r5, r13)
            long r13 = r0.evictionCount
            long r0 = r1.evictionCount
            long r13 = r13 - r0
            long r0 = java.lang.Math.max(r5, r13)
            r4 = r7
            r6 = r9
            r8 = r11
            r12 = r0
            r10 = r2
            r1 = r15
            r2 = r16
            r1.<init>(r2, r4, r6, r8, r10, r12)
            return r15
    }

    public long missCount() {
            r2 = this;
            long r0 = r2.missCount
            return r0
    }

    public double missRate() {
            r5 = this;
            long r0 = r5.requestCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            long r2 = r5.missCount
            double r2 = (double) r2
            double r0 = (double) r0
            double r2 = r2 / r0
            return r2
    }

    public com.google.common.cache.CacheStats plus(com.google.common.cache.CacheStats r16) {
            r15 = this;
            r1 = r16
            com.google.common.cache.CacheStats r2 = new com.google.common.cache.CacheStats
            long r3 = r15.hitCount
            long r5 = r1.hitCount
            long r3 = r3 + r5
            long r5 = r15.missCount
            long r7 = r1.missCount
            long r5 = r5 + r7
            long r7 = r15.loadSuccessCount
            long r9 = r1.loadSuccessCount
            long r7 = r7 + r9
            long r9 = r15.loadExceptionCount
            long r11 = r1.loadExceptionCount
            long r9 = r9 + r11
            long r11 = r15.totalLoadTime
            long r13 = r1.totalLoadTime
            long r11 = r11 + r13
            long r13 = r15.evictionCount
            long r0 = r1.evictionCount
            long r13 = r13 + r0
            r1 = r2
            r2 = r3
            r4 = r5
            r6 = r7
            r8 = r9
            r10 = r11
            r12 = r13
            r1.<init>(r2, r4, r6, r8, r10, r12)
            return r1
    }

    public long requestCount() {
            r4 = this;
            long r0 = r4.hitCount
            long r2 = r4.missCount
            long r0 = r0 + r2
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            com.google.common.base.MoreObjects$ToStringHelper r0 = com.google.common.base.MoreObjects.toStringHelper(r4)
            java.lang.String r1 = "hitCount"
            long r2 = r4.hitCount
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r1, r2)
            java.lang.String r1 = "missCount"
            long r2 = r4.missCount
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r1, r2)
            java.lang.String r1 = "loadSuccessCount"
            long r2 = r4.loadSuccessCount
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r1, r2)
            java.lang.String r1 = "loadExceptionCount"
            long r2 = r4.loadExceptionCount
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r1, r2)
            java.lang.String r1 = "totalLoadTime"
            long r2 = r4.totalLoadTime
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r1, r2)
            java.lang.String r1 = "evictionCount"
            long r2 = r4.evictionCount
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public long totalLoadTime() {
            r2 = this;
            long r0 = r2.totalLoadTime
            return r0
    }
}
