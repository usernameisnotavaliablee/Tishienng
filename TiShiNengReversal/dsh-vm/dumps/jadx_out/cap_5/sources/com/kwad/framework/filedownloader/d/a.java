package com.kwad.framework.filedownloader.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private long anh;
    private long ani;
    private long anj;
    private int id;
    private int index;

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long s(java.util.List<com.kwad.framework.filedownloader.d.a> r7) {
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
        L6:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r7.next()
            com.kwad.framework.filedownloader.d.a r2 = (com.kwad.framework.filedownloader.d.a) r2
            long r3 = r2.yV()
            long r5 = r2.getStartOffset()
            long r3 = r3 - r5
            long r0 = r0 + r3
            goto L6
        L1d:
            return r0
    }

    public final void X(long r1) {
            r0 = this;
            r0.ani = r1
            return
    }

    public final void Y(long r1) {
            r0 = this;
            r0.anj = r1
            return
    }

    public final int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    public final int getIndex() {
            r1 = this;
            int r0 = r1.index
            return r0
    }

    public final long getStartOffset() {
            r2 = this;
            long r0 = r2.anh
            return r0
    }

    public final void setId(int r1) {
            r0 = this;
            r0.id = r1
            return
    }

    public final void setIndex(int r1) {
            r0 = this;
            r0.index = r1
            return
    }

    public final void setStartOffset(long r1) {
            r0 = this;
            r0.anh = r1
            return
    }

    public final java.lang.String toString() {
            r7 = this;
            int r0 = r7.id
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r7.index
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            long r2 = r7.anh
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r7.anj
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            long r4 = r7.ani
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r2
            r0 = 3
            r5[r0] = r3
            r0 = 4
            r5[r0] = r4
            java.lang.String r0 = "id[%d] index[%d] range[%d, %d) current offset(%d)"
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.c(r0, r5)
            return r0
    }

    public final long yV() {
            r2 = this;
            long r0 = r2.ani
            return r0
    }

    public final long yW() {
            r2 = this;
            long r0 = r2.anj
            return r0
    }

    public final android.content.ContentValues yX() {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            int r1 = r3.id
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "id"
            r0.put(r2, r1)
            int r1 = r3.index
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "connectionIndex"
            r0.put(r2, r1)
            long r1 = r3.anh
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "startOffset"
            r0.put(r2, r1)
            long r1 = r3.ani
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "currentOffset"
            r0.put(r2, r1)
            long r1 = r3.anj
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "endOffset"
            r0.put(r2, r1)
            return r0
    }
}
