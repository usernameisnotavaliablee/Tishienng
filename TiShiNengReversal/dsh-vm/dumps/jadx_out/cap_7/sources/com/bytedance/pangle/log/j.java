package com.bytedance.pangle.log;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    private java.lang.String cw;
    private java.lang.String j;
    private long r;
    private long up;
    private java.lang.String xt;

    private j(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            r2.<init>()
            r2.j = r3
            r2.xt = r4
            r2.cw = r5
            long r3 = java.lang.System.currentTimeMillis()
            r2.up = r3
            r2.r = r3
            java.lang.String r3 = r2.j
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = r2.xt
            r4.append(r0)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r5
            java.lang.String r5 = " watcher[%s]-start"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.bytedance.pangle.log.ZeusLogger.i(r3, r4)
            return
    }

    public static com.bytedance.pangle.log.j j(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            com.bytedance.pangle.log.j r0 = new com.bytedance.pangle.log.j
            r0.<init>(r1, r2, r3)
            return r0
    }

    public long j() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.r
            long r0 = r0 - r2
            return r0
    }

    public long j(java.lang.String r10) {
            r9 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r9.up
            long r0 = r0 - r2
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r9.r
            long r2 = r2 - r4
            java.lang.String r4 = r9.j
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r9.xt
            r5.append(r6)
            java.lang.String r6 = r9.cw
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r8 = 0
            r7[r8] = r6
            r6 = 1
            r7[r6] = r10
            r10 = 2
            r7[r10] = r0
            r10 = 3
            r7[r10] = r1
            java.lang.String r10 = " watcher[%s]-%s cost=%s, total=%s"
            java.lang.String r10 = java.lang.String.format(r10, r7)
            r5.append(r10)
            java.lang.String r10 = r5.toString()
            com.bytedance.pangle.log.ZeusLogger.i(r4, r10)
            return r2
    }
}
