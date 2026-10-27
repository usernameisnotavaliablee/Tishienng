package net.sqlcipher.database;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class SQLiteQueryStats {
    long largestIndividualRowSize;
    long totalQueryResultSize;

    public SQLiteQueryStats(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.totalQueryResultSize = r1
            r0.largestIndividualRowSize = r3
            return
    }

    public long getLargestIndividualRowSize() {
            r2 = this;
            long r0 = r2.largestIndividualRowSize
            return r0
    }

    public long getTotalQueryResultSize() {
            r2 = this;
            long r0 = r2.totalQueryResultSize
            return r0
    }
}
