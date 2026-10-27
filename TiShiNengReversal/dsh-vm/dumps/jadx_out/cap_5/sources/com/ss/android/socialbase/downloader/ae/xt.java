package com.ss.android.socialbase.downloader.ae;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class xt implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.ss.android.socialbase.downloader.ae.xt> CREATOR = null;
    private static final java.lang.String j = "xt";
    private int ae;
    private com.ss.android.socialbase.downloader.ws.xt az;
    private long cw;
    private long g;
    private boolean jy;
    private long m;
    private java.util.List<com.ss.android.socialbase.downloader.ae.xt> oq;
    private com.ss.android.socialbase.downloader.ae.xt qv;
    private java.util.concurrent.atomic.AtomicLong r;
    private java.util.concurrent.atomic.AtomicInteger tl;
    private long up;
    private int vl;
    private java.util.concurrent.atomic.AtomicBoolean ws;
    private int xt;


    public static class j {
        private long ae;
        private long cw;
        private int j;
        private int m;
        private long r;
        private com.ss.android.socialbase.downloader.ae.xt tl;
        private long up;
        private long xt;

        public j(int r1) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                return
        }

        static /* synthetic */ long ae(com.ss.android.socialbase.downloader.ae.xt.j r2) {
                long r0 = r2.ae
                return r0
        }

        static /* synthetic */ long cw(com.ss.android.socialbase.downloader.ae.xt.j r2) {
                long r0 = r2.cw
                return r0
        }

        static /* synthetic */ int j(com.ss.android.socialbase.downloader.ae.xt.j r0) {
                int r0 = r0.j
                return r0
        }

        static /* synthetic */ int m(com.ss.android.socialbase.downloader.ae.xt.j r0) {
                int r0 = r0.m
                return r0
        }

        static /* synthetic */ long r(com.ss.android.socialbase.downloader.ae.xt.j r2) {
                long r0 = r2.r
                return r0
        }

        static /* synthetic */ com.ss.android.socialbase.downloader.ae.xt tl(com.ss.android.socialbase.downloader.ae.xt.j r0) {
                com.ss.android.socialbase.downloader.ae.xt r0 = r0.tl
                return r0
        }

        static /* synthetic */ long up(com.ss.android.socialbase.downloader.ae.xt.j r2) {
                long r0 = r2.up
                return r0
        }

        static /* synthetic */ long xt(com.ss.android.socialbase.downloader.ae.xt.j r2) {
                long r0 = r2.xt
                return r0
        }

        public com.ss.android.socialbase.downloader.ae.xt.j cw(long r1) {
                r0 = this;
                r0.r = r1
                return r0
        }

        public com.ss.android.socialbase.downloader.ae.xt.j j(int r1) {
                r0 = this;
                r0.m = r1
                return r0
        }

        public com.ss.android.socialbase.downloader.ae.xt.j j(long r1) {
                r0 = this;
                r0.xt = r1
                return r0
        }

        public com.ss.android.socialbase.downloader.ae.xt.j j(com.ss.android.socialbase.downloader.ae.xt r1) {
                r0 = this;
                r0.tl = r1
                return r0
        }

        public com.ss.android.socialbase.downloader.ae.xt j() {
                r2 = this;
                com.ss.android.socialbase.downloader.ae.xt r0 = new com.ss.android.socialbase.downloader.ae.xt
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.ss.android.socialbase.downloader.ae.xt.j r(long r1) {
                r0 = this;
                r0.up = r1
                return r0
        }

        public com.ss.android.socialbase.downloader.ae.xt.j up(long r1) {
                r0 = this;
                r0.ae = r1
                return r0
        }

        public com.ss.android.socialbase.downloader.ae.xt.j xt(long r1) {
                r0 = this;
                r0.cw = r1
                return r0
        }
    }

    static {
            com.ss.android.socialbase.downloader.ae.xt$1 r0 = new com.ss.android.socialbase.downloader.ae.xt$1
            r0.<init>()
            com.ss.android.socialbase.downloader.ae.xt.CREATOR = r0
            return
    }

    public xt(android.database.Cursor r6) {
            r5 = this;
            r5.<init>()
            if (r6 != 0) goto L6
            return
        L6:
            java.lang.String r0 = "_id"
            int r0 = r6.getColumnIndex(r0)
            int r0 = r6.getInt(r0)
            r5.xt = r0
            java.lang.String r0 = "chunkIndex"
            int r0 = r6.getColumnIndex(r0)
            int r0 = r6.getInt(r0)
            r5.ae = r0
            java.lang.String r0 = "startOffset"
            int r0 = r6.getColumnIndex(r0)
            long r0 = r6.getLong(r0)
            r5.cw = r0
            java.lang.String r0 = "curOffset"
            int r0 = r6.getColumnIndex(r0)
            r1 = -1
            if (r0 == r1) goto L3f
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            long r3 = r6.getLong(r0)
            r2.<init>(r3)
            r5.r = r2
            goto L48
        L3f:
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r2 = 0
            r0.<init>(r2)
            r5.r = r0
        L48:
            java.lang.String r0 = "endOffset"
            int r0 = r6.getColumnIndex(r0)
            long r2 = r6.getLong(r0)
            r5.up = r2
            java.lang.String r0 = "hostChunkIndex"
            int r0 = r6.getColumnIndex(r0)
            if (r0 == r1) goto L68
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            int r0 = r6.getInt(r0)
            r2.<init>(r0)
            r5.tl = r2
            goto L6f
        L68:
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r5.tl = r0
        L6f:
            java.lang.String r0 = "chunkContentLen"
            int r0 = r6.getColumnIndex(r0)
            if (r0 == r1) goto L7d
            long r0 = r6.getLong(r0)
            r5.m = r0
        L7d:
            java.util.concurrent.atomic.AtomicBoolean r6 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r6.<init>(r0)
            r5.ws = r6
            return
    }

    protected xt(android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4.readInt()
            r3.xt = r0
            long r0 = r4.readLong()
            r3.cw = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            long r1 = r4.readLong()
            r0.<init>(r1)
            r3.r = r0
            long r0 = r4.readLong()
            r3.up = r0
            long r0 = r4.readLong()
            r3.m = r0
            int r0 = r4.readInt()
            r3.ae = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            int r4 = r4.readInt()
            r0.<init>(r4)
            r3.tl = r0
            return
    }

    private xt(com.ss.android.socialbase.downloader.ae.xt.j r4) {
            r3 = this;
            r3.<init>()
            if (r4 != 0) goto L6
            return
        L6:
            int r0 = com.ss.android.socialbase.downloader.ae.xt.j.j(r4)
            r3.xt = r0
            long r0 = com.ss.android.socialbase.downloader.ae.xt.j.xt(r4)
            r3.cw = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            long r1 = com.ss.android.socialbase.downloader.ae.xt.j.cw(r4)
            r0.<init>(r1)
            r3.r = r0
            long r0 = com.ss.android.socialbase.downloader.ae.xt.j.r(r4)
            r3.up = r0
            long r0 = com.ss.android.socialbase.downloader.ae.xt.j.up(r4)
            r3.m = r0
            int r0 = com.ss.android.socialbase.downloader.ae.xt.j.m(r4)
            r3.ae = r0
            long r0 = com.ss.android.socialbase.downloader.ae.xt.j.ae(r4)
            r3.g = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = -1
            r0.<init>(r1)
            r3.tl = r0
            com.ss.android.socialbase.downloader.ae.xt r4 = com.ss.android.socialbase.downloader.ae.xt.j.tl(r4)
            r3.j(r4)
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r4.<init>(r0)
            r3.ws = r4
            return
    }

    /* synthetic */ xt(com.ss.android.socialbase.downloader.ae.xt.j r1, com.ss.android.socialbase.downloader.ae.xt.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.util.List<com.ss.android.socialbase.downloader.ae.xt> ae() {
            r1 = this;
            java.util.List<com.ss.android.socialbase.downloader.ae.xt> r0 = r1.oq
            return r0
    }

    public long av() {
            r2 = this;
            long r0 = r2.up
            return r0
    }

    public long az() {
            r8 = this;
            long r0 = r8.ws()
            long r2 = r8.cw
            long r0 = r0 - r2
            boolean r2 = r8.m()
            if (r2 == 0) goto L2f
            r0 = 0
            r2 = 0
        L10:
            java.util.List<com.ss.android.socialbase.downloader.ae.xt> r3 = r8.oq
            int r3 = r3.size()
            if (r2 >= r3) goto L2f
            java.util.List<com.ss.android.socialbase.downloader.ae.xt> r3 = r8.oq
            java.lang.Object r3 = r3.get(r2)
            com.ss.android.socialbase.downloader.ae.xt r3 = (com.ss.android.socialbase.downloader.ae.xt) r3
            if (r3 == 0) goto L2c
            long r4 = r3.ws()
            long r6 = r3.vl()
            long r4 = r4 - r6
            long r0 = r0 + r4
        L2c:
            int r2 = r2 + 1
            goto L10
        L2f:
            return r0
    }

    public long cw(boolean r9) {
            r8 = this;
            long r0 = r8.ws()
            long r2 = r8.m
            long r4 = r8.g
            long r6 = r0 - r4
            long r6 = r2 - r6
            if (r9 != 0) goto L17
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 != 0) goto L17
            long r4 = r8.cw
            long r0 = r0 - r4
            long r6 = r2 - r0
        L17:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "contentLength:"
            r9.<init>(r0)
            long r0 = r8.m
            r9.append(r0)
            java.lang.String r0 = " curOffset:"
            r9.append(r0)
            long r0 = r8.ws()
            r9.append(r0)
            java.lang.String r0 = " oldOffset:"
            r9.append(r0)
            long r0 = r8.g
            r9.append(r0)
            java.lang.String r0 = " retainLen:"
            r9.append(r0)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "DownloadChunk"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r9)
            r0 = 0
            int r9 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r9 >= 0) goto L51
            return r0
        L51:
            return r6
    }

    public void cw(int r1) {
            r0 = this;
            r0.ae = r1
            return
    }

    public boolean cw() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.ws
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.get()
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean g() {
            r7 = this;
            long r0 = r7.cw
            boolean r2 = r7.r()
            if (r2 == 0) goto L11
            long r2 = r7.g
            long r4 = r7.cw
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L11
            r0 = r2
        L11:
            long r2 = r7.ws()
            long r2 = r2 - r0
            long r0 = r7.m
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L1e
            r0 = 1
            return r0
        L1e:
            r0 = 0
            return r0
    }

    public long i() {
            r2 = this;
            long r0 = r2.m
            return r0
    }

    public android.content.ContentValues j() {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            int r1 = r3.xt
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "_id"
            r0.put(r2, r1)
            int r1 = r3.ae
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "chunkIndex"
            r0.put(r2, r1)
            long r1 = r3.cw
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "startOffset"
            r0.put(r2, r1)
            long r1 = r3.ws()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "curOffset"
            r0.put(r2, r1)
            long r1 = r3.up
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "endOffset"
            r0.put(r2, r1)
            long r1 = r3.m
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "chunkContentLen"
            r0.put(r2, r1)
            int r1 = r3.xt()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "hostChunkIndex"
            r0.put(r2, r1)
            return r0
    }

    public java.util.List<com.ss.android.socialbase.downloader.ae.xt> j(int r22, long r23) {
            r21 = this;
            r0 = r21
            r1 = r22
            boolean r2 = r0.r()
            if (r2 == 0) goto L158
            boolean r2 = r0.m()
            if (r2 == 0) goto L12
            goto L158
        L12:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            long r3 = r0.jy()
            r5 = 1
            long r6 = r0.cw(r5)
            long r8 = (long) r1
            long r8 = r6 / r8
            java.lang.String r10 = com.ss.android.socialbase.downloader.ae.xt.j
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "retainLen:"
            r11.<init>(r12)
            r11.append(r6)
            java.lang.String r12 = " divideChunkForReuse chunkSize:"
            r11.append(r12)
            r11.append(r8)
            java.lang.String r12 = " current host downloadChunk index:"
            r11.append(r12)
            int r12 = r0.ae
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r10, r11)
            r11 = 0
        L49:
            r12 = 1
            if (r11 >= r1) goto Led
            if (r11 != 0) goto L54
            long r14 = r0.vl()
            goto L75
        L54:
            int r14 = r1 + (-1)
            if (r11 != r14) goto L74
            long r15 = r0.av()
            int r17 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r17 <= 0) goto L6e
            long r17 = r15 - r3
            long r17 = r17 + r12
        L64:
            r12 = r17
            r17 = r6
            r5 = r12
            r12 = r15
            r16 = 1
            r14 = r3
            goto L7e
        L6e:
            long r12 = (long) r14
            long r12 = r12 * r8
            long r17 = r6 - r12
            goto L64
        L74:
            r14 = r3
        L75:
            long r16 = r3 + r8
            long r12 = r16 - r12
            r17 = r6
            r5 = r8
            r16 = 1
        L7e:
            com.ss.android.socialbase.downloader.ae.xt$j r7 = new com.ss.android.socialbase.downloader.ae.xt$j
            int r10 = r0.xt
            r7.<init>(r10)
            int r10 = -r11
            int r10 = r10 + (-1)
            com.ss.android.socialbase.downloader.ae.xt$j r7 = r7.j(r10)
            com.ss.android.socialbase.downloader.ae.xt$j r7 = r7.j(r14)
            com.ss.android.socialbase.downloader.ae.xt$j r7 = r7.xt(r3)
            com.ss.android.socialbase.downloader.ae.xt$j r7 = r7.up(r3)
            com.ss.android.socialbase.downloader.ae.xt$j r7 = r7.cw(r12)
            com.ss.android.socialbase.downloader.ae.xt$j r7 = r7.r(r5)
            com.ss.android.socialbase.downloader.ae.xt$j r7 = r7.j(r0)
            com.ss.android.socialbase.downloader.ae.xt r7 = r7.j()
            java.lang.String r10 = com.ss.android.socialbase.downloader.ae.xt.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r19 = r8
            java.lang.String r8 = "divide sub chunk : "
            r1.<init>(r8)
            r1.append(r11)
            java.lang.String r8 = " startOffset:"
            r1.append(r8)
            r1.append(r14)
            java.lang.String r8 = " curOffset:"
            r1.append(r8)
            r1.append(r3)
            java.lang.String r8 = " endOffset:"
            r1.append(r8)
            r1.append(r12)
            java.lang.String r8 = " contentLen:"
            r1.append(r8)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r10, r1)
            r2.add(r7)
            long r3 = r3 + r19
            int r11 = r11 + 1
            r1 = r22
            r6 = r17
            r8 = r19
            r5 = 1
            goto L49
        Led:
            r16 = 1
            int r1 = r2.size()
            int r1 = r1 + (-1)
            r3 = 0
            r5 = r3
        Lf8:
            if (r1 <= 0) goto L10a
            java.lang.Object r7 = r2.get(r1)
            com.ss.android.socialbase.downloader.ae.xt r7 = (com.ss.android.socialbase.downloader.ae.xt) r7
            if (r7 == 0) goto L107
            long r7 = r7.i()
            long r5 = r5 + r7
        L107:
            int r1 = r1 + (-1)
            goto Lf8
        L10a:
            java.lang.String r1 = com.ss.android.socialbase.downloader.ae.xt.j
            java.lang.String r7 = "reuseChunkContentLen:"
            java.lang.String r8 = java.lang.String.valueOf(r5)
            java.lang.String r7 = r7.concat(r8)
            com.ss.android.socialbase.downloader.m.j.xt(r1, r7)
            r1 = 0
            java.lang.Object r1 = r2.get(r1)
            com.ss.android.socialbase.downloader.ae.xt r1 = (com.ss.android.socialbase.downloader.ae.xt) r1
            if (r1 == 0) goto L154
            long r7 = r0.av()
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 != 0) goto L131
            long r3 = r0.vl()
            long r3 = r23 - r3
            goto L13b
        L131:
            long r3 = r0.av()
            long r7 = r0.vl()
            long r3 = r3 - r7
            long r3 = r3 + r12
        L13b:
            long r3 = r3 - r5
            r1.j(r3)
            int r3 = r0.ae
            r1.cw(r3)
            com.ss.android.socialbase.downloader.ws.xt r3 = r0.az
            if (r3 == 0) goto L154
            long r7 = r1.av()
            long r9 = r0.i()
            long r9 = r9 - r5
            r3.j(r7, r9)
        L154:
            r0.j(r2)
            return r2
        L158:
            r1 = 0
            return r1
    }

    public void j(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.tl
            if (r0 != 0) goto Lc
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r2)
            r1.tl = r0
            return
        Lc:
            r0.set(r2)
            return
    }

    public void j(long r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public void j(android.database.sqlite.SQLiteStatement r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            r0 = 0
            r3.vl = r0
            r4.clearBindings()
            int r0 = r3.vl
            int r0 = r0 + 1
            r3.vl = r0
            int r1 = r3.xt
            long r1 = (long) r1
            r4.bindLong(r0, r1)
            int r0 = r3.vl
            int r0 = r0 + 1
            r3.vl = r0
            int r1 = r3.ae
            long r1 = (long) r1
            r4.bindLong(r0, r1)
            int r0 = r3.vl
            int r0 = r0 + 1
            r3.vl = r0
            long r1 = r3.cw
            r4.bindLong(r0, r1)
            int r0 = r3.vl
            int r0 = r0 + 1
            r3.vl = r0
            long r1 = r3.ws()
            r4.bindLong(r0, r1)
            int r0 = r3.vl
            int r0 = r0 + 1
            r3.vl = r0
            long r1 = r3.up
            r4.bindLong(r0, r1)
            int r0 = r3.vl
            int r0 = r0 + 1
            r3.vl = r0
            long r1 = r3.m
            r4.bindLong(r0, r1)
            int r0 = r3.vl
            int r0 = r0 + 1
            r3.vl = r0
            int r1 = r3.xt()
            long r1 = (long) r1
            r4.bindLong(r0, r1)
            return
    }

    public void j(com.ss.android.socialbase.downloader.ae.xt r1) {
            r0 = this;
            r0.qv = r1
            if (r1 == 0) goto Lb
            int r1 = r1.mi()
            r0.j(r1)
        Lb:
            return
    }

    public void j(com.ss.android.socialbase.downloader.ws.xt r1) {
            r0 = this;
            r0.az = r1
            r0.w()
            return
    }

    public void j(java.util.List<com.ss.android.socialbase.downloader.ae.xt> r1) {
            r0 = this;
            r0.oq = r1
            return
    }

    public void j(boolean r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.ws
            if (r0 != 0) goto Lc
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r2)
            r1.ws = r0
            goto Lf
        Lc:
            r0.set(r2)
        Lf:
            r2 = 0
            r1.az = r2
            return
    }

    public long jy() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.r
            if (r0 == 0) goto L9
            long r0 = r0.get()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean m() {
            r1 = this;
            java.util.List<com.ss.android.socialbase.downloader.ae.xt> r0 = r1.oq
            if (r0 == 0) goto Lc
            int r0 = r0.size()
            if (r0 <= 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public int mi() {
            r1 = this;
            int r0 = r1.ae
            return r0
    }

    public long oq() {
            r6 = this;
            com.ss.android.socialbase.downloader.ae.xt r0 = r6.qv
            r1 = -1
            if (r0 == 0) goto L40
            java.util.List r0 = r0.ae()
            if (r0 != 0) goto Ld
            goto L40
        Ld:
            com.ss.android.socialbase.downloader.ae.xt r0 = r6.qv
            java.util.List r0 = r0.ae()
            int r0 = r0.indexOf(r6)
            r3 = 0
            r4 = 0
        L19:
            com.ss.android.socialbase.downloader.ae.xt r5 = r6.qv
            java.util.List r5 = r5.ae()
            int r5 = r5.size()
            if (r3 >= r5) goto L40
            com.ss.android.socialbase.downloader.ae.xt r5 = r6.qv
            java.util.List r5 = r5.ae()
            java.lang.Object r5 = r5.get(r3)
            com.ss.android.socialbase.downloader.ae.xt r5 = (com.ss.android.socialbase.downloader.ae.xt) r5
            if (r5 == 0) goto L3d
            if (r4 == 0) goto L3a
            long r0 = r5.ws()
            return r0
        L3a:
            if (r0 != r3) goto L3d
            r4 = 1
        L3d:
            int r3 = r3 + 1
            goto L19
        L40:
            return r1
    }

    public int qv() {
            r1 = this;
            int r0 = r1.xt
            return r0
    }

    public boolean r() {
            r2 = this;
            int r0 = r2.xt()
            r1 = -1
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean tl() {
            r5 = this;
            com.ss.android.socialbase.downloader.ae.xt r0 = r5.qv
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.m()
            r2 = 0
            if (r0 != 0) goto Le
            return r2
        Le:
            r0 = 0
        Lf:
            com.ss.android.socialbase.downloader.ae.xt r3 = r5.qv
            java.util.List r3 = r3.ae()
            int r3 = r3.size()
            if (r0 >= r3) goto L42
            com.ss.android.socialbase.downloader.ae.xt r3 = r5.qv
            java.util.List r3 = r3.ae()
            java.lang.Object r3 = r3.get(r0)
            com.ss.android.socialbase.downloader.ae.xt r3 = (com.ss.android.socialbase.downloader.ae.xt) r3
            if (r3 == 0) goto L3f
            com.ss.android.socialbase.downloader.ae.xt r4 = r5.qv
            java.util.List r4 = r4.ae()
            int r4 = r4.indexOf(r5)
            if (r4 <= r0) goto L3c
            boolean r3 = r3.g()
            if (r3 != 0) goto L3c
            return r2
        L3c:
            if (r4 != r0) goto L3f
            return r1
        L3f:
            int r0 = r0 + 1
            goto Lf
        L42:
            return r2
    }

    public com.ss.android.socialbase.downloader.ae.xt up() {
            r2 = this;
            boolean r0 = r2.r()
            if (r0 != 0) goto L9
            com.ss.android.socialbase.downloader.ae.xt r0 = r2.qv
            goto La
        L9:
            r0 = r2
        La:
            if (r0 == 0) goto L1f
            boolean r1 = r0.m()
            if (r1 != 0) goto L13
            goto L1f
        L13:
            java.util.List r0 = r0.ae()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.socialbase.downloader.ae.xt r0 = (com.ss.android.socialbase.downloader.ae.xt) r0
            return r0
        L1f:
            r0 = 0
            return r0
    }

    public long vl() {
            r2 = this;
            long r0 = r2.cw
            return r0
    }

    public void w() {
            r2 = this;
            long r0 = r2.ws()
            r2.g = r0
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = r2.xt
            r3.writeInt(r4)
            long r0 = r2.cw
            r3.writeLong(r0)
            java.util.concurrent.atomic.AtomicLong r4 = r2.r
            if (r4 == 0) goto L13
            long r0 = r4.get()
            goto L15
        L13:
            r0 = 0
        L15:
            r3.writeLong(r0)
            long r0 = r2.up
            r3.writeLong(r0)
            long r0 = r2.m
            r3.writeLong(r0)
            int r4 = r2.ae
            r3.writeInt(r4)
            java.util.concurrent.atomic.AtomicInteger r4 = r2.tl
            if (r4 == 0) goto L30
            int r4 = r4.get()
            goto L31
        L30:
            r4 = -1
        L31:
            r3.writeInt(r4)
            return
    }

    public long ws() {
            r7 = this;
            boolean r0 = r7.r()
            if (r0 == 0) goto L3c
            boolean r0 = r7.m()
            if (r0 == 0) goto L3c
            r0 = 0
            r2 = 0
        Lf:
            java.util.List<com.ss.android.socialbase.downloader.ae.xt> r3 = r7.oq
            int r3 = r3.size()
            if (r2 >= r3) goto L3b
            java.util.List<com.ss.android.socialbase.downloader.ae.xt> r3 = r7.oq
            java.lang.Object r3 = r3.get(r2)
            com.ss.android.socialbase.downloader.ae.xt r3 = (com.ss.android.socialbase.downloader.ae.xt) r3
            if (r3 == 0) goto L38
            boolean r4 = r3.g()
            if (r4 != 0) goto L2c
            long r0 = r3.jy()
            return r0
        L2c:
            long r4 = r3.jy()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L38
            long r0 = r3.jy()
        L38:
            int r2 = r2 + 1
            goto Lf
        L3b:
            return r0
        L3c:
            long r0 = r7.jy()
            return r0
    }

    public int xt() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.tl
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            int r0 = r0.get()
            return r0
    }

    public void xt(int r1) {
            r0 = this;
            r0.xt = r1
            return
    }

    public void xt(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.r
            if (r0 == 0) goto L8
            r0.set(r2)
            return
        L8:
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>(r2)
            r1.r = r0
            return
    }

    public void xt(boolean r1) {
            r0 = this;
            r0.jy = r1
            return
    }
}
