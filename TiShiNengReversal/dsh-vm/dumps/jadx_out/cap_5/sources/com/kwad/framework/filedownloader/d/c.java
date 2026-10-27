package com.kwad.framework.filedownloader.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.kwad.framework.filedownloader.d.c> CREATOR = null;
    private java.lang.String aca;
    private boolean aoJ;
    private boolean aoW;
    private final java.util.concurrent.atomic.AtomicInteger aoX;
    private final java.util.concurrent.atomic.AtomicLong aoY;
    private long aoZ;
    private java.lang.String apa;
    private java.lang.String apb;
    private int apc;
    private java.lang.String filename;
    private int id;
    private java.lang.String url;


    static {
            com.kwad.framework.filedownloader.d.c$1 r0 = new com.kwad.framework.filedownloader.d.c$1
            r0.<init>()
            com.kwad.framework.filedownloader.d.c.CREATOR = r0
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r1.aoY = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.aoX = r0
            return
    }

    protected c(android.os.Parcel r6) {
            r5 = this;
            r5.<init>()
            int r0 = r6.readInt()
            r5.id = r0
            java.lang.String r0 = r6.readString()
            r5.url = r0
            java.lang.String r0 = r6.readString()
            r5.aca = r0
            byte r0 = r6.readByte()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            r5.aoW = r0
            java.lang.String r0 = r6.readString()
            r5.filename = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            byte r3 = r6.readByte()
            r0.<init>(r3)
            r5.aoX = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            long r3 = r6.readLong()
            r0.<init>(r3)
            r5.aoY = r0
            long r3 = r6.readLong()
            r5.aoZ = r3
            java.lang.String r0 = r6.readString()
            r5.apa = r0
            java.lang.String r0 = r6.readString()
            r5.apb = r0
            int r0 = r6.readInt()
            r5.apc = r0
            byte r6 = r6.readByte()
            if (r6 == 0) goto L5d
            r1 = 1
        L5d:
            r5.aoJ = r1
            return
    }

    private java.lang.String zb() {
            r1 = this;
            java.lang.String r0 = r1.apa
            return r0
    }

    public final void Z(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.aoY
            r0.set(r2)
            return
    }

    public final void aa(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.aoY
            r0.addAndGet(r2)
            return
    }

    public final void ab(long r4) {
            r3 = this;
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            r3.aoJ = r0
            r3.aoZ = r4
            return
    }

    public final void bW(int r1) {
            r0 = this;
            r0.apc = r1
            return
    }

    public final void bx(java.lang.String r1) {
            r0 = this;
            r0.apb = r1
            return
    }

    public final void by(java.lang.String r1) {
            r0 = this;
            r0.apa = r1
            return
    }

    public final void bz(java.lang.String r1) {
            r0 = this;
            r0.filename = r1
            return
    }

    public final void d(byte r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.aoX
            r0.set(r2)
            return
    }

    public final void d(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.aca = r1
            r0.aoW = r2
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String getFilename() {
            r1 = this;
            java.lang.String r0 = r1.filename
            return r0
    }

    public final int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    public final java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = r1.aca
            return r0
    }

    public final java.lang.String getTargetFilePath() {
            r3 = this;
            java.lang.String r0 = r3.getPath()
            boolean r1 = r3.wF()
            java.lang.String r2 = r3.getFilename()
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.a(r0, r1, r2)
            return r0
    }

    public final long getTotal() {
            r2 = this;
            long r0 = r2.aoZ
            return r0
    }

    public final java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    public final boolean isChunked() {
            r5 = this;
            long r0 = r5.aoZ
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final void setId(int r1) {
            r0 = this;
            r0.id = r1
            return
    }

    public final void setUrl(java.lang.String r1) {
            r0 = this;
            r0.url = r1
            return
    }

    public final java.lang.String toString() {
            r10 = this;
            int r0 = r10.id
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r10.url
            java.lang.String r2 = r10.aca
            java.util.concurrent.atomic.AtomicInteger r3 = r10.aoX
            int r3 = r3.get()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.concurrent.atomic.AtomicLong r4 = r10.aoY
            long r5 = r10.aoZ
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = r10.apb
            java.lang.String r7 = super.toString()
            r8 = 8
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r9 = 0
            r8[r9] = r0
            r0 = 1
            r8[r0] = r1
            r0 = 2
            r8[r0] = r2
            r0 = 3
            r8[r0] = r3
            r0 = 4
            r8[r0] = r4
            r0 = 5
            r8[r0] = r5
            r0 = 6
            r8[r0] = r6
            r0 = 7
            r8[r0] = r7
            java.lang.String r0 = "id[%d], url[%s], path[%s], status[%d], sofar[%s], total[%d], etag[%s], %s"
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.c(r0, r8)
            return r0
    }

    public final boolean wF() {
            r1 = this;
            boolean r0 = r1.aoW
            return r0
    }

    public final byte wJ() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.aoX
            int r0 = r0.get()
            byte r0 = (byte) r0
            return r0
    }

    public final boolean wP() {
            r1 = this;
            boolean r0 = r1.aoJ
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = r2.id
            r3.writeInt(r4)
            java.lang.String r4 = r2.url
            r3.writeString(r4)
            java.lang.String r4 = r2.aca
            r3.writeString(r4)
            boolean r4 = r2.aoW
            r3.writeByte(r4)
            java.lang.String r4 = r2.filename
            r3.writeString(r4)
            java.util.concurrent.atomic.AtomicInteger r4 = r2.aoX
            int r4 = r4.get()
            byte r4 = (byte) r4
            r3.writeByte(r4)
            java.util.concurrent.atomic.AtomicLong r4 = r2.aoY
            long r0 = r4.get()
            r3.writeLong(r0)
            long r0 = r2.aoZ
            r3.writeLong(r0)
            java.lang.String r4 = r2.apa
            r3.writeString(r4)
            java.lang.String r4 = r2.apb
            r3.writeString(r4)
            int r4 = r2.apc
            r3.writeInt(r4)
            boolean r4 = r2.aoJ
            r3.writeByte(r4)
            return
    }

    public final android.content.ContentValues yX() {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            int r1 = r3.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "_id"
            r0.put(r2, r1)
            java.lang.String r1 = "url"
            java.lang.String r2 = r3.getUrl()
            r0.put(r1, r2)
            java.lang.String r1 = "path"
            java.lang.String r2 = r3.getPath()
            r0.put(r1, r2)
            byte r1 = r3.wJ()
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            java.lang.String r2 = "status"
            r0.put(r2, r1)
            long r1 = r3.yZ()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "sofar"
            r0.put(r2, r1)
            long r1 = r3.getTotal()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "total"
            r0.put(r2, r1)
            java.lang.String r1 = "errMsg"
            java.lang.String r2 = r3.zb()
            r0.put(r1, r2)
            java.lang.String r1 = "etag"
            java.lang.String r2 = r3.za()
            r0.put(r1, r2)
            int r1 = r3.zc()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "connectionCount"
            r0.put(r2, r1)
            boolean r1 = r3.wF()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "pathAsDirectory"
            r0.put(r2, r1)
            boolean r1 = r3.wF()
            if (r1 == 0) goto L8c
            java.lang.String r1 = r3.getFilename()
            if (r1 == 0) goto L8c
            java.lang.String r1 = "filename"
            java.lang.String r2 = r3.getFilename()
            r0.put(r1, r2)
        L8c:
            return r0
    }

    public final long yZ() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.aoY
            long r0 = r0.get()
            return r0
    }

    public final java.lang.String yr() {
            r1 = this;
            java.lang.String r0 = r1.getTargetFilePath()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r0 = r1.getTargetFilePath()
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.bD(r0)
            return r0
    }

    public final java.lang.String za() {
            r1 = this;
            java.lang.String r0 = r1.apb
            return r0
    }

    public final int zc() {
            r1 = this;
            int r0 = r1.apc
            return r0
    }

    public final void zd() {
            r1 = this;
            r0 = 1
            r1.apc = r0
            return
    }
}
